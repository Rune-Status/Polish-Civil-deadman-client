package com.jagex.runescape;

public final class DummyClass23 {

  public static HashTable aClass130_1659 = new HashTable(512);
  public static GameString aClass94_1660 = GameString.create("Versteckt");
  public static FileUnpacker aClass153_1661;


  public static void method1744(boolean var0) {
    DummyClass23.aClass130_1659 = null;
      DummyClass23.aClass153_1661 = null;
      DummyClass23.aClass94_1660 = null;
  }

  public static void method1745(int var0) {
    for (int var1 = var0; (var1 < 104); ++var1) {
        for (int var2 = 0; var2 < 104; ++var2) {
          DummyClass9.anIntArrayArray4010[var1][var2] = 0;
        }
      }
  }

  public static void method1746(boolean var0, byte var1) {
    if (var1 > -31) {
        DummyClass23.aClass153_1661 = null;
      }

      SomethingTexture4.method1352(GroundItem.viewHeight, var0, -1, InventoryConfig.anInt3655,
        DummyClass30.viewWidth);
  }

  public static SomethingWorldMapy method1747(Buffer var0, boolean var1) {
    SomethingWorldMapy var2 =
        new SomethingWorldMapy(var0.readString(), var0.readString(), var0.readUnsignedShort(),
          var0.readUnsignedShort(), var0.readInt(), var0.readUnsignedByte() == 1,
          var0.readUnsignedByte());
      int var3 = var0.readUnsignedByte();

      for (int var4 = 0; (var4 < var3); ++var4) {
        var2.aClass61_3560.addLast(
          new SomethingWorldMappy(var0.readUnsignedShort(), var0.readUnsignedShort(),
            var0.readUnsignedShort(), var0.readUnsignedShort()));
      }

      var2.method538((byte) 103);
      return var2;
  }

}
