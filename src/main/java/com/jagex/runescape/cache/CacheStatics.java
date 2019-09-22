package com.jagex.runescape.cache;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.buffer.BufferObject;
import com.jagex.runescape.buffer.BufferStatics;
import com.jagex.runescape.buffer.NativeBufferObject;
import com.jagex.runescape.common.ArrayUtils;

public class CacheStatics {

  public static boolean aBoolean1765;
  public static boolean errorOccurred;
  public static int anInt1108;
  public static GZipDecompressor aClass49_2505 = new GZipDecompressor();

  public static int getChecksum(byte[] var0, int var1, boolean var2) {
    return BufferStatics.method1599(0, var1, var0);
  }

  public static byte[] method623(byte var0, byte[] var1) {
    Buffer buffer = new Buffer(var1);
    int var3 = buffer.readUnsignedByte();
    int var4 = buffer.readInt();
    if (var4 >= 0 && (CacheStatics.anInt1108 == 0
        || CacheStatics.anInt1108 >= var4)) {
      if (var3 == 0) {
        byte[] var8 = new byte[var4];
        buffer.copy(0, var4, var8);
        return var8;
      } else {
        int var5 = buffer.readInt();
        if (var5 >= 0 && (CacheStatics.anInt1108 == 0
            || CacheStatics.anInt1108 >= var5)) {
          byte[] var6 = new byte[var5];
          if (var3 == 1) {
            BZipDecompressorStatics.method1640(var6, var5, var1, 9);
          } else {
            CacheStatics.aClass49_2505
                .decompress(var6, buffer, false);
          }

          return var6;
        } else {
          throw new RuntimeException();
        }
      }
    } else {
      throw new RuntimeException();
    }
  }

  public static Object method890(boolean var0, int var1, byte[] var2) {
    if (var2 == null) {
      return null;
    } else {
      if (var2.length > 136 && !CacheStatics.errorOccurred) {
        try {
          BufferObject buffer = new NativeBufferObject();
          buffer.put(var2);
          return buffer;
        } catch (Throwable var4) {
          CacheStatics.errorOccurred = true;
        }
      }

      return var0 ? CacheStatics.method873((byte) 62, var2) : var2;
    }
  }

  public static byte[] method1985(int var0, Object var1, boolean var2) {
    if (var1 == null) {
      return null;
    } else if (var1 instanceof byte[]) {
      byte[] var5 = (byte[]) var1;
      return var2 ? CacheStatics.method873((byte) 62, var5) : var5;
    } else {
      if (var1 instanceof BufferObject) {
        BufferObject buffer = (BufferObject) var1;
        return buffer.get();
      } else {
        throw new IllegalArgumentException();
      }
    }
  }

  public static byte[] method873(byte var0, byte[] var1) {
    int var2 = var1.length;
    byte[] var3 = new byte[var2];
    if (var0 == 62) {
      ArrayUtils.copy(var1, 0, var3, 0, var2);
      return var3;
    } else {
      return null;
    }
  }
}
