package com.jagex.runescape;

public final class SomethingLight0 {

  public static int interfaceCounter;
  public static GameString aClass94_1546 = GameString.create("welle:");
  public static int anInt1552;
  public static GameString aClass94_1556 = GameString.create("hint_mapmarkers");
  public static GameString aClass94_1558 = GameString.create(": ");
  public static int anInt1559;
  public static GameString aClass94_1567 = GameString.create("mapdots");
  public int anInt1544;
  public int anInt1545;
  public int anInt1547;
  public int anInt1548;
  public int anInt1549;
  public int anInt1550;
  public int anInt1551;
  public int anInt1553;
  public int anInt1554;
  public int anInt1555;
  public int anInt1557;
  public int anInt1560;
  public int anInt1561;
  public int anInt1562;
  public int anInt1563;
  public int anInt1564;
  public int anInt1565;
  public int anInt1566;

  public static void method1702(byte var0, boolean var1) {
    try {
      if (!var1 != !DummyClass28.aBoolean337) {
        DummyClass28.aBoolean337 = var1;
        if (var0 > -117) {
          SomethingLight0.aClass94_1546 = null;
        }

        StringNode0.method139(76);
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "pe.B(" + var0 + ',' + var1 + ')');
    }
  }

  public static void method1703(int var0) {
    try {
      SomethingLight0.aClass94_1558 = null;
      if (var0 != 10967) {
        SomethingLight0.method1703(-117);
      }

      SomethingLight0.aClass94_1546 = null;
      SomethingLight0.aClass94_1556 = null;
      SomethingLight0.aClass94_1567 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "pe.A(" + var0 + ')');
    }
  }

}
