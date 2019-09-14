package com.jagex.runescape;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.node.Node;

public final class SomethingPacket151 extends Node {

  public static ObjectCache aClass93_2604 = new ObjectCache(64);
  public static GameString COMMAND_DROP_JS5 = GameStringStatics.create("::clientjs5drop");
  public static int[] anIntArray2606;
  public static int anInt2607;
  public static GameString aClass94_2608 = GameStringStatics.create(")4l=");
  public int anInt2602;
  public int anInt2603;

  public static void method820(int var0, int var1) {
    Keyboard.aClass93_1911.method1522(-127, var0);
      if (var1 == 64) {
        HashTableIterator.aClass93_1131.method1522(-126, var0);
      }
  }

  public static void method821(int var0) {
    SomethingPacket151.aClass93_2604 = null;
      SomethingPacket151.anIntArray2606 = null;
      SomethingPacket151.COMMAND_DROP_JS5 = null;
      SomethingPacket151.aClass94_2608 = null;
      if (var0 != 26971) {
        SomethingPacket151.method820(-51, -76);
      }
  }

  public static GameString[] method822(int var0, GameString[] var1) {
    GameString[] var2 = new GameString[5];
      if (var0 != 19406) {
        SomethingPacket151.method821(-26);
      }

      for (int var3 = 0; (var3 < 5); ++var3) {
        var2[var3] = RenderAnimation.concat(
          new GameString[] {SomethingScene.toString(var3), SomethingQuickChat.aClass94_3577});
        if (var1 != null && var1[var3] != null) {
          var2[var3] = RenderAnimation.concat(new GameString[] {var2[var3], var1[var3]});
        }
      }

      return var2;
  }

}
