package com.jagex.runescape;

public final class ClientScript extends SubNode {

  private static GameString aClass94_3692 = GameString.create("Members object");
  public static HashTable variableUpdates = new HashTable(16);
  public static int anInt3681;
  public static int loadingPercent = 10;
  public static int rectangleDebugType;
  public static int[] anIntArray3693 = new int[1000];
  public static ClanChatUser[] aClass3_Sub19Array3694;
  public static int anInt3695;
  public static GameString aClass94_3691 = ClientScript.aClass94_3692;
  public int anInt3678;
  public int anInt3680;
  public int anInt3682;
  public int[] anIntArray3683;
  public HashTable[] aClass130Array3685;
  public GameString aClass94_3686;
  public int anInt3687;
  public GameString[] aClass94Array3688;
  public int[] anIntArray3690;

  public static FloorUnderlay getFloorUnderlay(int var1) {
    try {
      FloorUnderlay underlay = (FloorUnderlay) AbstractGameWorld.floorUnderlays.get(
          var1);
      if (underlay != null) {
        return underlay;
      }
      byte[] bytes = SomethingOtherWorldMap.aClass153_2536.getBytes(1, var1);
      underlay = new FloorUnderlay();
      if (bytes != null) {
        underlay.parseConfig(var1, new Buffer(bytes), 255);
      }
      AbstractGameWorld.floorUnderlays.get((byte) -104, underlay, var1);
      return underlay;
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "qc.B(" + var1 + ')');
    }
  }

  public static int method630(byte var0, int var1) {
    try {
      if (var0 != -34) {
        ClientScript.aClass94_3692 = null;
      }

      return 127 & var1 >> 11;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "qc.A(" + var0 + ',' + var1 + ')');
    }
  }

  public static void setFloorFileUnpacker(boolean var0, FileUnpacker var1) {
    try {
      if (!var0) {
        AnimationSomething.configs = var1;
        ScriptState.amountFloors = AnimationSomething.configs.getAmountChildren(4, (byte) 112);
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
          "qc.D(" + ',' + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  public static void method632(int var0) {
    try {
      ClientScript.aClass94_3692 = null;
      ClientScript.aClass94_3691 = null;
      ClientScript.aClass3_Sub19Array3694 = null;
      ClientScript.variableUpdates = null;
      ClientScript.anIntArray3693 = null;

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "qc.E(" + var0 + ')');
    }
  }

  public static int bitAnd(int var0, int var1) {
    try {
      return var0 & var1;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "qc.C(" + var0 + ',' + var1 + ')');
    }
  }

}
