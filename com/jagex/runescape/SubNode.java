package com.jagex.runescape;

public class SubNode extends Node {

  private static GameString aClass94_2568 = GameString.create("Started 3d Library");
  public static GameString[] aClass94Array2566 = new GameString[200];
  public static int anInt2567 = -1;
  public static int anInt2571;
  public static int anInt2572;
  public static FileUnpacker fileUnpacker11;
  public static int[] anIntArray2574 = new int[14];
  public static int anInt2575;
  public static int anInt2577;
  public static GameString aClass94_2576 = SubNode.aClass94_2568;
  public long subnodeKey;
  public SubNode prevSubNode;
  public SubNode nextSubNode;

  public final void unlinkSubNode() {
    try {
      if (this.prevSubNode != null) {
        this.prevSubNode.nextSubNode = this.nextSubNode;
        this.nextSubNode.prevSubNode = this.prevSubNode;
        this.nextSubNode = null;
        this.prevSubNode = null;
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "rg.TA()");
    }
  }

  public static void method518(Player var0, int var1) {
    try {
      AreaSoundEffect var2 = (AreaSoundEffect) ObjectNode.aClass130_4046.get(var0.name.toBase37());
      if (var1 >= -85) {
        SubNode.method523(40, -17, -52, -32, 9, -51, -85, -84, -19);
      }

      if (var2 != null) {
        var2.method134(1);
      } else {
        SceneSomething2.method1286(var0.waypointsY[0], false, null, 0, null, var0.waypointsX[0],
          GameWorldSomething.currentPlane, var0);
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "rg.UA(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }

  public static int method519(int var0, boolean var1, int var2, int var3) {
    try {
      var0 &= 3;
      if (!var1) {
        SubNode.method520((byte) -89);
      }

      return 0 != var0 ? (~var0 != -2 ? (~var0 == -3 ? -var3 + 7 : -var2 + 7) : var2) : var3;
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
          "rg.RA(" + var0 + ',' + ',' + var2 + ',' + var3 + ')');
    }
  }

  public static SomethingWorldMapy method520(byte var0) {
    try {
      int var1 = -122 % ((var0 - -48) / 33);
      return Buffer.aClass3_Sub28_Sub3_2600;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "rg.OA(" + var0 + ')');
    }
  }

  public static void method521(int var0) {
    try {
      SubNode.fileUnpacker11 = null;
      if (var0 == -3) {
        SubNode.aClass94Array2566 = null;
        SubNode.aClass94_2568 = null;
        SubNode.anIntArray2574 = null;
        SubNode.aClass94_2576 = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "rg.QA(" + var0 + ')');
    }
  }

  public static NpcConfiguration getNpcConfiguration(int var0) {
    try {
      NpcConfiguration var2 = (NpcConfiguration) ObjectNode.aClass93_4043.get(
          var0);
      if (null == var2) {
        byte[] var3 = PlayerVariable.aClass153_557.getBytes(DummyClass36.method1031(var0, 2),
          DummyCanvas.method54(var0, false));
        var2 = new NpcConfiguration();

        var2.anInt1284 = var0;
        if (null != var3) {
          var2.method1478(new Buffer(var3), 74);
        }

        var2.method1481(98);
        ObjectNode.aClass93_4043.get((byte) -95, var2, var0);
        return var2;
      } else {
        return var2;
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "rg.PA(" + var0 + ')');
    }
  }

  public static void method523(int var0, int var1, int var2, int var3, int var4, int var5, int var6,
                              int var7, int var8) {
    try {
      int var9 = var3 - var8;
      int var11 = (-var5 + var0 << 16) / var9;
      int var10 = -var4 + var6;
      int var12 = (var7 + -var1 << 16) / var10;
      MidiSomething.method1410(var1, 0, var6, var4, var3, var5, var8, var12, var11, var2, -12541);
    } catch (RuntimeException var13) {
      throw AbstractGameWorld.cascadeException(var13,
        "rg.SA(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ','
          + var6 + ',' + var7 + ',' + var8 + ')');
    }
  }

}
