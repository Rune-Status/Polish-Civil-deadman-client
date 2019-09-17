package com.jagex.runescape.statics;

import com.jagex.runescape.model.Widget;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.model.AbstractMouseWheel;
import com.jagex.runescape.model.AbstractObjectNodeWrapper;
import com.jagex.runescape.model.SomethingPacket151;

public final class DummyClass60 {

  public static boolean aBoolean440;
  public static int[] anIntArray441 = new int[2048];
  public static GameString aClass94_442 =
      GameStringStatics.create("Number of player models in cache:");
  public static int sampleRate;
  public static GameString aClass94_444 = GameStringStatics.create("<img=1>");

  public static void method911(int var0) {
    if (var0 != 26) {
      DummyClass60.anIntArray441 = null;
    }

    DummyClass60.anIntArray441 = null;
    DummyClass60.aClass94_444 = null;
    DummyClass60.aClass94_442 = null;
  }

  public static void method912(boolean var0) {
    GlobalStatics_9.secureBuffer.position = 0;
    GlobalStatics_7.lastPacketId1 = -1;
    DummyClass36.aBoolean2615 = var0;
    GlobalStatics_0.packetLength = 0;
    DummyClass45.anInt987 = 0;
    GlobalStatics_10.amountContextActions = 0;
    GlobalStatics_0.lastPacketId0 = -1;
    DummyClass12.minimapMode = 0;
    DummyClass36.updateTime = 0;
    GlobalStatics_9.lastPacketId2 = -1;
    GlobalStatics_9.gameBuffer.position = 0;
    GlobalStatics_2.anInt3699 = 0;
    GlobalStatics_0.packetId = -1;

    int var1;
    for (var1 = 0; GlobalStatics_9.players.length > var1; ++var1) {
      if (GlobalStatics_9.players[var1] != null) {
        GlobalStatics_9.players[var1].anInt2772 = -1;
      }
    }

    for (var1 = 0; var1 < GlobalStatics_8.npcs.length; ++var1) {
      if (GlobalStatics_8.npcs[var1] != null) {
        GlobalStatics_8.npcs[var1].anInt2772 = -1;
      }
    }

    GlobalStatics_9.method580((byte) 80);
    GlobalStatics_9.anInt1753 = 1;
    DummyClass26.setState(30, 5);

    for (var1 = 0; var1 < 100; ++var1) {
      GlobalStatics_9.aBooleanArray3674[var1] = true;
    }

    GlobalStatics_9.method204(-3);
  }

  public static AbstractObjectNodeWrapper method913(int var0) {
    try {
      if (var0 != 31431) {
        DummyClass60.method913(123);
      }

      return (AbstractObjectNodeWrapper) Class.forName(
          "com.jagex.runescape.model.SoftReferenceObjectNodeWrapper")
          .newInstance();
    } catch (Throwable var2) {
      return null;
    }
  }

  public static SomethingPacket151 method914(int var0, int var1, int var2,
      int var3) {
    SomethingPacket151 var4 = new SomethingPacket151();
    var4.anInt2603 = var3;
    var4.anInt2602 = var1;
    GlobalStatics_10.aClass130_3208.put(var2, var4);
    GlobalStatics_10.method232(var1, 16182);
    Widget var5 = GlobalStatics_7.getWidget((byte) 122, var2);
    if (var5 != null) {
      DummyClass29.method909(120, var5);
    }

    if (GlobalStatics_10.aClass11_3087 != null) {
      DummyClass29.method909(117, GlobalStatics_10.aClass11_3087);
      GlobalStatics_10.aClass11_3087 = null;
    }

    int var6 = GlobalStatics_10.amountContextActions;
    if (var0 != 6422) {
      DummyClass60.aClass94_444 = null;
    }

    int var7;
    for (var7 = 0; var6 > var7; ++var7) {
      if (GlobalStatics_9
          .method73(GlobalStatics_10.aShortArray3095[var7], var0 - 6301)) {
        GlobalStatics_9.method509(1, var7);
      }
    }

    if (GlobalStatics_10.amountContextActions == 1) {
      DummyClass36.aBoolean2615 = false;
      GlobalStatics_3.method1340(GlobalStatics_1.anInt1462,
          GlobalStatics_9.anInt3552, (byte) -40, GlobalStatics_10.anInt3395,
          GlobalStatics_9.anInt3537);
    } else {
      GlobalStatics_3.method1340(GlobalStatics_1.anInt1462,
          GlobalStatics_9.anInt3552, (byte) -40, GlobalStatics_10.anInt3395,
          GlobalStatics_9.anInt3537);
      var7 = GlobalStatics_8.aClass3_Sub28_Sub17_2096
          .method682(GlobalStatics_9.aClass94_2667);

      for (int var8 = 0; GlobalStatics_10.amountContextActions > var8; ++var8) {
        int var9 = GlobalStatics_8.aClass3_Sub28_Sub17_2096.method682(
            GlobalStatics_0.method802(var8, true));
        if (var9 > var7) {
          var7 = var9;
        }
      }

      GlobalStatics_9.anInt3552 = 8 + var7;
      GlobalStatics_9.anInt3537 =
          15 * GlobalStatics_10.amountContextActions + (
              !GlobalStatics_8.aBoolean1951 ? 22 : 26);
    }

    if (var5 != null) {
      GlobalStatics_7.method2104(var5, false, 55);
    }

    GlobalStatics_10.method226(var1, 58);
    if (GlobalStatics_9.anInt3655 != -1) {
      GlobalStatics_6.method124(var0 ^ 6509, 1, GlobalStatics_9.anInt3655);
    }

    return var4;
  }

  public static void method915(GameString var0, int var1) {
    int var2 = GlobalStatics_6.method576(var0, false);
    if (var1 != var2) {
      GlobalStatics_2.method565((byte) 86,
          DummyClass25.aClass131_1624.aShortArray1727[var2],
          DummyClass25.aClass131_1624.aShortArray1718[var2]);
    }
  }

  public static AbstractMouseWheel createMouseWheel(byte var0) {
    if (var0 != 15) {
      DummyClass60.aClass94_442 = null;
    }

    try {
      return (AbstractMouseWheel) Class.forName(
          "com.jagex.runescape.model.MouseWheel").newInstance();
    } catch (Throwable var2) {
      return null;
    }
  }

}
