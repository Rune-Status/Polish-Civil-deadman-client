package com.jagex.runescape.done;

import com.jagex.runescape.*;

public final class FileCacheRequester implements Runnable {

    public int anInt1087;
  private final Queue aClass13_1086 = new Queue();
  private Thread aThread1090;
  private boolean aBoolean1091;


  public FileCacheRequester() {
    SignLinkRequest var1 = DummyClass35.signLink.createThread(0, 5, this);

      assert var1 != null;
      while ((var1.status == 0)) {
        TextureSampler25.sleep(10L);
      }

      if (var1.status == 2) {
        throw new RuntimeException();
      } else {
        this.aThread1090 = (Thread) var1.result;
      }
  }

  private void method1299(FileCacheRequest var1, int var2) {
    Queue var3 = this.aClass13_1086;
      synchronized (var3) {
        if (var2 != 104) {
          this.shutdown(-114);
        }

        this.aClass13_1086.addLast(var1);
        ++this.anInt1087;
        this.aClass13_1086.notifyAll();
      }
  }

  public void shutdown(int var1 ) {
    this.aBoolean1091 = true;
      Queue var2 = this.aClass13_1086;
      synchronized (var2) {
        this.aClass13_1086.notifyAll();
      }

      try {
        this.aThread1090.join();
      } catch (InterruptedException var4) {
      }

      this.aThread1090 = null;
  }

  public FileCacheRequest method1305(FileCache var1, int var2, byte[] var3,
      int var4 ) {
    FileCacheRequest var5 = new FileCacheRequest();
      var5.aByteArray4059 = var3;
      var5.aBoolean3628 = false;
      var5.subnodeKey = var4;
      var5.aClass41_4056 = var1;
      var5.anInt4061 = var2;
      this.method1299(var5, 104);
      return var5;
  }

  public FileCacheRequest method1307(int var1, int var2, FileCache var3 ) {
    FileCacheRequest var4 = new FileCacheRequest();
      var4.aClass41_4056 = var3;
      var4.anInt4061 = 3;
      var4.aBoolean3628 = false;
      if (var2 != -27447) {
        GlobalStatics_7.aBoolean1084 = false;
      }

      var4.subnodeKey = var1;
      this.method1299(var4, 104);
      return var4;
  }

  public FileCacheRequest method1309(FileCache var1, byte var2, int var3 ) {
    FileCacheRequest var4 = new FileCacheRequest();
      var4.anInt4061 = 1;
      Queue var5 = this.aClass13_1086;
      synchronized (var5) {
        if (var2 < 39) {
          return null;
        }

        FileCacheRequest var6 = (FileCacheRequest) this.aClass13_1086.getFirst();

        while (true) {
          if (var6 == null) {
            break;
          }

          if ((var6.subnodeKey == var3) && var6.aClass41_4056 == var1
            && var6.anInt4061 == 2) {
            var4.aByteArray4059 = var6.aByteArray4059;
            var4.aBoolean3632 = false;
            return var4;
          }

          var6 = (FileCacheRequest) this.aClass13_1086.getNext();
        }
      }

      var4.aByteArray4059 = var1.method1051(var3, (byte) 85);
      var4.aBoolean3632 = false;
      var4.aBoolean3628 = true;
      return var4;
  }

  public void run() {
    while (!this.aBoolean1091) {
        Queue var2 = this.aClass13_1086;
        FileCacheRequest var1;
        synchronized (var2) {
          var1 = (FileCacheRequest) this.aClass13_1086.poll();
          if (var1 == null) {
            try {
              this.aClass13_1086.wait();
            } catch (InterruptedException var6) {
            }
            continue;
          }

          --this.anInt1087;
        }

        try {
          if (var1.anInt4061 == 2) {
            var1.aClass41_4056
                .method1050((int) var1.subnodeKey, var1.aByteArray4059.length,
                    var1.aByteArray4059, (byte) -41);
          } else {
            if ((var1.anInt4061 == 3)) {
              var1.aByteArray4059 =
                  var1.aClass41_4056
                      .method1051((int) var1.subnodeKey, (byte) -77);
            }
          }
        } catch (Exception var5) {
          GZipDecompressor.reportError(null, var5, (byte) 111);
        }

        var1.aBoolean3632 = false;
      }
  }

}
