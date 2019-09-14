package com.jagex.runescape;

import com.jagex.runescape.opengl.GlRenderer;
import java.awt.Frame;
import java.util.Objects;

public final class DummyClass54 {

  public static short[] aShortArray1398;
  public static SomethingFont aClass33_1399;
  public static int anInt1400;
  public static ObjectCache aClass93_1401 = new ObjectCache(500);
  public static Widget aClass11_1402;
  public static int anInt1403 = -1;


  public static void method1596(GameString var0, byte var1, boolean var2) {
    System.out.println("DummyClass54.method1596");
  }

  public static Frame method1597(int var0, int var1, int var2, int var3, int var4, SignLink var5) {
    if (var5.method1432(false)) {
        if (var2 == 0) {
          DisplayMode[] var6 = OndemandFileRequest.method596(10, var5);

          boolean var7 = false;

          for (int var8 = 0; ~var8 > ~var6.length; ++var8) {
            if (var4 == var6[var8].anInt1447 && var3 == var6[var8].anInt1449
                && ((var1 == 1 -1)
                || var1 == var6[var8].anInt1448) && (!var7
                || var6[var8].anInt1450 > 0)) {
              var2 = var6[var8].anInt1450;
              var7 = true;
            }
          }

          if (!var7) {
            return null;
          }
        }

        SignLinkRequest var10 = var5.method1450(var1, var2, var3, var4, -121);

        while (var10.status == 0) {
          TextureSampler25.sleep(10L);
        }

        Frame var11 = (Frame) var10.result;
        if (var11 != null) {
          if (var0 == var10.status) {
            FileCacheRequest.method593(var11, true, var5);
            return null;
          } else {
            return var11;
          }
        } else {
          return null;
        }
      } else {
        return null;
      }
  }

  public static void method1598(int var0) {
    if (var0 <= -106) {
        DummyClass54.aShortArray1398 = null;
        DummyClass54.aClass11_1402 = null;
        DummyClass54.aClass93_1401 = null;
        DummyClass54.aClass33_1399 = null;
      }
  }

  public static int method1599(int var0, int var1, byte[] var2, byte var3) {
    int var4 = -1;
      int var5 = -16 % ((var3 - 61) / 57);

      for (int var6 = var0; var1 > var6; ++var6) {
        var4 = var4 >>> 8 ^ HuffmanEncoder.anIntArray634[255 & (var4 ^ var2[var6])];
      }

      var4 = ~var4;
      return var4;
  }

}
