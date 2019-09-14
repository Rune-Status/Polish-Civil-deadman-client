package com.jagex.runescape.buffer;

import com.jagex.runescape.GlobalStatics_0;
import com.jagex.runescape.opengl.GlTexture2d;

public final class BufferStatics {

  public static int anInt984;
  public static int anInt1927;
  public static byte[][] aByteArrayArray2747 = new byte[50][];
  public static byte[][] aByteArrayArray3461 = new byte[1000][];
  public static byte[][] aByteArrayArray125 = new byte[250][];

  public static synchronized byte[] method1807(int var0, int var1) {
    byte[] var2;
    if ((var1 == 100) && (BufferStatics.anInt984 > 0)) {
      var2 = BufferStatics.aByteArrayArray3461[--BufferStatics.anInt984];
      BufferStatics.aByteArrayArray3461[BufferStatics.anInt984] = null;
      return var2;
    } else {
      if ((var1 == 5000) && BufferStatics.anInt1927 > 0) {
        var2 = BufferStatics.aByteArrayArray125[--BufferStatics.anInt1927];
        BufferStatics.aByteArrayArray125[BufferStatics.anInt1927] = null;
        return var2;
      } else if ((var1 == 30000) && GlTexture2d.anInt3766 > 0) {
        var2 = BufferStatics.aByteArrayArray2747[--GlTexture2d.anInt3766];
        BufferStatics.aByteArrayArray2747[GlTexture2d.anInt3766] = null;
        return var2;
      } else {
        return new byte[var1];
      }
    }
  }

  public static int method1599(int var0, int var1, byte[] var2) {
    int var4 = -1;

    for (int var6 = var0; var1 > var6; ++var6) {
      var4 =
          var4 >>> 8 ^ GlobalStatics_0.anIntArray634[255 & (var4 ^ var2[var6])];
    }

    var4 = ~var4;
    return var4;
  }

}
