package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.statics.GlobalStatics_10;

public final class FileSystem {

  private Buffer updateTableBuffer;
  private OndemandFileRequest updateTableRequest;
  private final OndemandRequester ondemandRequester;
  private final FileCacheRequester fileCacheRequester;
  private FileRequester[] fileRequesters;

  public FileSystem(OndemandRequester var1, FileCacheRequester var2 ) {
    this.fileCacheRequester = var2;
      this.ondemandRequester = var1;
      if (!this.ondemandRequester.method1251((byte) 111)) {
        this.updateTableRequest = this.ondemandRequester
            .request(110, 255, (byte) 0, 255, true);
      }
  }

  public boolean isUpdateTableReceived() {
    if (this.updateTableBuffer == null) {

        if (this.updateTableRequest == null) {
          if (this.ondemandRequester.method1251((byte) 89)) {
            return false;
          }

          this.updateTableRequest = this.ondemandRequester
              .request(123, 255, (byte) 0, 255, true);
        }

        if (this.updateTableRequest.aBoolean3632) {
          return false;
        } else {
          this.updateTableBuffer = new Buffer(this.updateTableRequest.method587(false));
          this.fileRequesters = new FileRequester[(this.updateTableBuffer.bytes.length - 5) / 8];
          return true;
        }
      } else {
        return true;
      }
  }

  public void method838(byte var1 ) {
    if (this.fileRequesters != null) {
        int var2;
        for (var2 = 0; this.fileRequesters.length > var2; ++var2) {
          if (this.fileRequesters[var2] != null) {
            this.fileRequesters[var2].method2110(0);
          }
        }

        for (var2 = 0; this.fileRequesters.length > var2; ++var2) {
          if (this.fileRequesters[var2] != null) {
            this.fileRequesters[var2].method2107(true);
          }
        }

        if (var1 >= -56) {
          this.updateTableRequest = null;
        }

      }
  }

  public FileRequester method839(int var1, int var2, FileCache var3, FileCache var4) {
    if (var1 != -1824885439) {
        GlobalStatics_10.createUnpacker(true, false, false, -22, true);
      }

      return this.method847(var4, -125, var2, true, var3);
  }

  private FileRequester method847(FileCache var1, int var2, int var3, boolean var4,
                                  FileCache var5) {
    if (this.updateTableBuffer != null) {
        this.updateTableBuffer.position = 5 + var3 * 8;
        if (var2 >= -1) {
          return null;
        } else if (this.updateTableBuffer.bytes.length > this.updateTableBuffer.position) {
          if (this.fileRequesters[var3] == null) {
            int var6 = this.updateTableBuffer.readInt();
            int var7 = this.updateTableBuffer.readInt();
            FileRequester var8 =
              new FileRequester(var3, var1, var5, this.ondemandRequester,
                  this.fileCacheRequester,
                var6, var7, var4);
            this.fileRequesters[var3] = var8;
            return var8;
          } else {
            return this.fileRequesters[var3];
          }
        } else {
          throw new RuntimeException();
        }
      } else {
        throw new RuntimeException();
      }
  }

}
