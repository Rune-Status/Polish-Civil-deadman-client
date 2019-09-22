package com.jagex.runescape.compression;

import com.jagex.runescape.buffer.Buffer;
import java.util.zip.Inflater;

public final class GZipDecompressor {

  private Inflater anInflater813;

  public GZipDecompressor() {
    this(-1, 1000000, 1000000);
  }

  private GZipDecompressor(int var1, int var2, int var3) {
  }

  public void decompress(byte[] var1, Buffer var2, boolean var3) {
    if (var2.bytes[var2.position] == 31
        && var2.bytes[var2.position + 1] == -117) {
      if (this.anInflater813 == null) {
        this.anInflater813 = new Inflater(true);
      }

      try {
        this.anInflater813.setInput(var2.bytes, var2.position + 10,
            -8 - (10 + var2.position) + var2.bytes.length);
        this.anInflater813.inflate(var1);
      } catch (Exception var5) {
        this.anInflater813.reset();
        throw new RuntimeException("Invalid GZIP compressed data!");
      }

      this.anInflater813.reset();
    } else {
      throw new RuntimeException("Invalid GZIP header!");
    }
  }

}
