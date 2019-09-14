package com.jagex.runescape;

public class DummyClass35 {

  private static GameString aClass94_658 = GameString.create("Please remove ");
  public static GameString aClass94_659 =
    GameString.create("V-Brification des mises -9 jour )2 ");
  public static int anInt660;
  public static boolean aBoolean661 = true;
  public static int[][] anIntArrayArray663;
  public static int[] anIntArray664 = new int[14];
  public static SignLink signLink;
  public static GameString aClass94_667 = GameString.create("ondulation2:");
  public static AbstractMouseWheel mouseWheel;
  public static GameString aClass94_662 = DummyClass35.aClass94_658;
  public static GameString aClass94_666 = DummyClass35.aClass94_658;

  public static ItemConfig getItemConfig(int var0, byte var1) {
    try {
      ItemConfig var2 = (ItemConfig) SomethingQuickChat.aClass93_3572.get(var0);
      if (var2 == null) {
        byte[] var3 =
          TriChromaticImageCache.aClass153_1370.getBytes(StillGraphic.method1951(var0, (byte) -115),
            Unsure.method2075(var0, (byte) 102));
        if (var1 <= 68) {
          DummyClass35.method1027(-113, (byte) 110);
        }

        var2 = new ItemConfig();
        var2.anInt787 = var0;
        if (var3 != null) {
          var2.method1113(1, new Buffer(var3));
        }

        var2.method1112(5401);
        if (0 != ~var2.anInt791) {
          var2.method1118(DummyClass35.getItemConfig(var2.anInt789, (byte) 70),
              DummyClass35.getItemConfig(var2.anInt791, (byte) 73), false);
        }

        if (var2.anInt762 != -1) {
          var2.method1109((byte) 69,
              DummyClass35.getItemConfig(var2.anInt795, (byte) 111),
              DummyClass35.getItemConfig(var2.anInt762, (byte) 86));
        }

        if (!DummyClass17.aBoolean1827 && var2.aBoolean779) {
          var2.aClass94_770 = ClientScript.aClass94_3691;
          var2.anInt782 = 0;
          var2.inventoryOptions = GameException.DEFAULT_INVENTORY_OPTIONS;
          var2.aBoolean807 = false;
          var2.aClass94Array801 = Buffer.aClass94Array2596;
        }

        SomethingQuickChat.aClass93_3572.get((byte) -107, var2, var0);
        return var2;
      } else {
        return var2;
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "fk.F(" + var0 + ',' + var1 + ')');
    }
  }

  public static void method1024(int var0) {
    try {
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
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "fk.E(" + var0 + ')');
    }
  }

  public static void method1025(byte var0) {
    try {
      SomethingPacket151.aClass93_2604.method1523((byte) -121);
      if (var0 > -51) {
        DummyClass35.method1025((byte) 86);
      }

      DummyClass32.aClass93_511.method1523((byte) -120);
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "fk.I(" + var0 + ')');
    }
  }

  public static int getChecksum(byte[] var0, int var1, boolean var2) {
    try {
      return var2 ? -3 : DummyClass54.method1599(0, var1, var0, (byte) -35);
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
          "fk.H(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + ')');
    }
  }

  public static void method1027(int var0, byte var1) {
    try {
      AbstractGameWorld.floorUnderlays.method1522(-128, var0);
      int var2 = -38 % ((var1 - 29) / 40);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "fk.J(" + var0 + ',' + var1 + ')');
    }
  }

  public static void method1028(int var0) {
    try {
      for (int var1 = -1; ~var1 > ~DummyClass13.anInt2022; ++var1) {
        int var2;
        if (0 == ~var1) {
          var2 = 2047;
        } else {
          var2 = DummyClass42.anIntArray887[var1];
        }

        Player var3 = TextureSampler0.players[var2];
        if (var3 != null) {
          DummyOutputStream.method68(var3.getSize(), 2279, var3);
        }
      }

      if (var0 >= -3) {
        DummyClass35.aClass94_666 = null;
      }

    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "fk.G(" + var0 + ')');
    }
  }

  public static void method1029(int var0) {
    try {
      TextureSampler12.secureBuffer.writePacket(177);
      ++ScriptState.anInt876;
      TextureSampler12.secureBuffer.writeShort(SomethingLight0.interfaceCounter);
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "fk.D(" + var0 + ')');
    }
  }

}
