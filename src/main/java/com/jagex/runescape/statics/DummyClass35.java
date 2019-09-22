package com.jagex.runescape.statics;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.model.AbstractMouseWheel;
import com.jagex.runescape.model.ItemConfig;
import com.jagex.runescape.model.Player;
import com.jagex.runescape.model.SignLink;

public class DummyClass35 {

  public static int anInt660;
  public static int[][] anIntArrayArray663;
  public static int[] anIntArray664 = new int[14];
  public static SignLink signLink;
  public static AbstractMouseWheel mouseWheel;

  public static ItemConfig getItemConfig(int var0) {
    ItemConfig var2 = (ItemConfig) GlobalStatics_9.aClass93_3572.get(var0);
    if (var2 == null) {
      byte[] var3 =
          GlobalStatics_10.aClass153_1370
              .getBytes(GlobalStatics_9.method1951(var0, (byte) -115),
                  GlobalStatics_10.method2075(var0, (byte) 102));

      var2 = new ItemConfig();
      var2.anInt787 = var0;
      if (var3 != null) {
        var2.method1113(1, new Buffer(var3));
      }

      var2.method1112(5401);
      if (var2.anInt791 != -1) {
        var2.method1118(DummyClass35.getItemConfig(var2.anInt789),
            DummyClass35.getItemConfig(var2.anInt791), false);
      }

      if (var2.anInt762 != -1) {
        var2.method1109((byte) 69,
            DummyClass35.getItemConfig(var2.anInt795),
            DummyClass35.getItemConfig(var2.anInt762));
      }

      if (!DummyClass17.aBoolean1827 && var2.aBoolean779) {
        var2.aClass94_770 = GameStringStatics.aClass94_3691;
        var2.anInt782 = 0;
        var2.inventoryOptions = GlobalStatics_8.DEFAULT_INVENTORY_OPTIONS;
        var2.aBoolean807 = false;
        var2.aClass94Array801 = GlobalStatics_0.aClass94Array2596;
      }

      GlobalStatics_9.aClass93_3572.get((byte) -107, var2, var0);
      return var2;
    } else {
      return var2;
    }
  }

  public static void clear2() {
    GameStringStatics.aClass94_658 = null;
    GameStringStatics.aClass94_667 = null;
    DummyClass35.anIntArray664 = null;
    DummyClass35.anIntArrayArray663 = null;
    DummyClass35.mouseWheel = null;
    DummyClass35.signLink = null;
    GameStringStatics.aClass94_659 = null;
    GameStringStatics.aClass94_662 = null;
    GameStringStatics.aClass94_666 = null;
  }

  public static void method1025() {
    GlobalStatics_9.aClass93_2604.method1523();
    DummyClass32.aClass93_511.method1523();
  }

  public static void method1027(int var0) {
    GlobalStatics_4.floorUnderlays.method1522(-128, var0);
  }

  public static void method1028() {
    for (int var1 = -1; var1 < DummyClass13.anInt2022; ++var1) {
      int var2;
      if (var1 == -1) {
        var2 = 2047;
      } else {
        var2 = DummyClass42.anIntArray887[var1];
      }

      Player player = GlobalStatics_9.PLAYERS[var2];
      if (player != null) {
        GlobalStatics_11.method68(player.getSize(), player);
      }
    }
  }

  public static void method1029(int var0) {
    GlobalStatics_9.SECURE_BUFFER.writePacket(177);
    ++GlobalStatics_9.anInt876;
    GlobalStatics_9.SECURE_BUFFER.writeShort(GlobalStatics_9.interfaceCounter);
  }

}
