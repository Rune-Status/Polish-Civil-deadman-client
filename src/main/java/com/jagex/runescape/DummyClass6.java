package com.jagex.runescape;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.done.BitVariable;

public class DummyClass6 {

  public static Cache aClass47_2041 = new Cache(64);
  public static GameString aClass94_2042 =
    GameStringStatics.create("Spieler kann nicht gefunden werden: ");
  public static int[] anIntArray2043 = {8, 11, 4, 6, 9, 7, 10, 0};
  public static GameString COOKIE_PREFIX = GameStringStatics.create("cookieprefix");
  public static GameString COMMAND_ERROR_TEST = GameStringStatics.create("::errortest");
  public static int anInt2046;


  public static void method2208(int var0) {
    DummyClass6.aClass47_2041 = null;
      DummyClass6.anIntArray2043 = null;
      DummyClass6.COMMAND_ERROR_TEST = null;
      DummyClass6.COOKIE_PREFIX = null;

      DummyClass6.aClass94_2042 = null;
  }

  public static void method2209(byte var0, int var1, int var2) {
    if (var0 >= -99) {
        DummyClass6.method2209((byte) 57, -14, 120);
      }

      BitVariable var3 = GlobalStatics_7.method378(var2, (byte) 127);
      assert var3 != null;
      int variableId = var3.id;
      int high = var3.high;
      int low = var3.low;
      int var7 = GlobalStatics_9.BIT_MASKS[high - low];
      if ((var1 < 0) || var7 < var1) {
        var1 = 0;
      }

      var7 <<= low;
      GlobalStatics_10.updateVariable(variableId,
        var1 << low & var7 | ~var7 & GlobalStatics_9.variables[variableId]);
  }

}
