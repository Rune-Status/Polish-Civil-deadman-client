package com.jagex.runescape.statics;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.buffer.BufferStatics;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.model.AbstractMouseWheel;
import com.jagex.runescape.model.ItemConfig;
import com.jagex.runescape.model.Player;
import com.jagex.runescape.model.SignLink;

public class DummyClass35 {

  public static GameString aClass94_658 = GameStringStatics
      .create("Please remove ");
  public static GameString aClass94_659 =
      GameStringStatics.create("V-Brification des mises -9 jour )2 ");
  public static int anInt660;
  public static boolean aBoolean661 = true;
  public static int[][] anIntArrayArray663;
  public static int[] anIntArray664 = new int[14];
  public static SignLink signLink;
  public static GameString aClass94_667 = GameStringStatics
      .create("ondulation2:");
  public static AbstractMouseWheel mouseWheel;
  public static GameString aClass94_662 = DummyClass35.aClass94_658;
  public static GameString aClass94_666 = DummyClass35.aClass94_658;

  public static ItemConfig getItemConfig(int var0, byte var1) {
    ItemConfig var2 = (ItemConfig) GlobalStatics_9.aClass93_3572.get(var0);
    if (var2 == null) {
      byte[] var3 =
          GlobalStatics_10.aClass153_1370
              .getBytes(GlobalStatics_9.method1951(var0, (byte) -115),
                  GlobalStatics_10.method2075(var0, (byte) 102));
      if (var1 <= 68) {
        DummyClass35.method1027(-113, (byte) 110);
      }

      var2 = new ItemConfig();
      var2.anInt787 = var0;
      if (var3 != null) {
        var2.method1113(1, new Buffer(var3));
      }

      var2.method1112(5401);
      if (var2.anInt791 != -1) {
        var2.method1118(DummyClass35.getItemConfig(var2.anInt789, (byte) 70),
            DummyClass35.getItemConfig(var2.anInt791, (byte) 73), false);
      }

      if (var2.anInt762 != -1) {
        var2.method1109((byte) 69,
            DummyClass35.getItemConfig(var2.anInt795, (byte) 111),
            DummyClass35.getItemConfig(var2.anInt762, (byte) 86));
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

  public static void clear2(int var0) {
    DummyClass35.aClass94_658 = null;
    DummyClass35.aClass94_667 = null;
    if (var0 != 21474) {
      DummyClass35.method1029(-65);
    }

    DummyClass35.anIntArray664 = null;
    DummyClass35.anIntArrayArray663 = null;
    DummyClass35.mouseWheel = null;
    DummyClass35.signLink = null;
    DummyClass35.aClass94_659 = null;
    DummyClass35.aClass94_662 = null;
    DummyClass35.aClass94_666 = null;
  }

  public static void method1025(byte var0) {
    GlobalStatics_9.aClass93_2604.method1523();
    if (var0 > -51) {
      DummyClass35.method1025((byte) 86);
    }

    DummyClass32.aClass93_511.method1523();
  }

  public static void method1027(int var0, byte var1) {
    GlobalStatics_4.floorUnderlays.method1522(-128, var0);
    int var2 = -38 % ((var1 - 29) / 40);
  }

  public static void method1028(int var0) {
    for (int var1 = -1; var1 < DummyClass13.anInt2022; ++var1) {
      int var2;
      if (var1 == -1) {
        var2 = 2047;
      } else {
        var2 = DummyClass42.anIntArray887[var1];
      }

      Player var3 = GlobalStatics_9.players[var2];
      if (var3 != null) {
        GlobalStatics_11.method68(var3.getSize(), 2279, var3);
      }
    }

    if (var0 >= -3) {
      DummyClass35.aClass94_666 = null;
    }
  }

  public static void method1029(int var0) {
    GlobalStatics_9.secureBuffer.writePacket(177);
    ++GlobalStatics_9.anInt876;
    GlobalStatics_9.secureBuffer.writeShort(GlobalStatics_9.interfaceCounter);
  }

}
