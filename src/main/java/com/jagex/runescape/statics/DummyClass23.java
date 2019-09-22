package com.jagex.runescape.statics;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.cache.FileUnpacker;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.common.HashTable;
import com.jagex.runescape.model.SomethingWorldMappy;
import com.jagex.runescape.model.SomethingWorldMapy;

public final class DummyClass23 {

  public static HashTable aClass130_1659 = new HashTable(512);
  public static GameString aClass94_1660 = GameStringStatics
      .create("Versteckt");
  public static FileUnpacker aClass153_1661;

  public static void method1744(boolean var0) {
    DummyClass23.aClass130_1659 = null;
    DummyClass23.aClass153_1661 = null;
    DummyClass23.aClass94_1660 = null;
  }

  public static void method1745(int var0) {
    for (int var1 = var0; var1 < 104; ++var1) {
      for (int var2 = 0; var2 < 104; ++var2) {
        DummyClass9.anIntArrayArray4010[var1][var2] = 0;
      }
    }
  }

  public static void method1746(boolean var0) {

    GlobalStatics_9
        .method1352(GlobalStatics_9.viewHeight, var0, -1,
            GlobalStatics_9.anInt3655,
            DummyClass30.viewWidth);
  }

  public static SomethingWorldMapy method1747(Buffer var0) {
    SomethingWorldMapy var2 =
        new SomethingWorldMapy(var0.readString(), var0.readString(),
            var0.readUnsignedShort(),
            var0.readUnsignedShort(), var0.readInt(),
            var0.readUnsignedByte() == 1,
            var0.readUnsignedByte());
    int var3 = var0.readUnsignedByte();

    for (int var4 = 0; var4 < var3; ++var4) {
      var2.aClass61_3560.addLast(
          new SomethingWorldMappy(var0.readUnsignedShort(),
              var0.readUnsignedShort(),
              var0.readUnsignedShort(), var0.readUnsignedShort()));
    }

    var2.method538();
    return var2;
  }

}
