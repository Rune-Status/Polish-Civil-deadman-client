package com.jagex.runescape.statics;

import com.jagex.runescape.model.Widget;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.model.DisplayMode;
import com.jagex.runescape.model.ObjectCache;
import com.jagex.runescape.model.SignLink;
import com.jagex.runescape.model.SignLinkRequest;
import com.jagex.runescape.model.SomethingFont;
import java.awt.Frame;

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

  public static Frame method1597(int var0, int var1, int var2, int var3,
      int var4, SignLink var5) {
    if (var5.method1432(false)) {
      if (var2 == 0) {
        DisplayMode[] var6 = GlobalStatics_9.method596(10, var5);

        boolean var7 = false;

        for (int var8 = 0; var8 < var6.length; ++var8) {
          if (var4 == var6[var8].anInt1447 && var3 == var6[var8].anInt1449
              && (var1 == 0
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
        GlobalStatics_10.sleep(10L);
      }

      Frame var11 = (Frame) var10.result;
      if (var11 != null) {
        if (var0 == var10.status) {
          GlobalStatics_7.method593(var11, true, var5);
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

}
