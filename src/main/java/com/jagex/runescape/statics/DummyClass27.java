package com.jagex.runescape.statics;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.model.BlockConfig;
import com.jagex.runescape.model.GameObjectConfig;
import com.jagex.runescape.model.Mobile;
import com.jagex.runescape.model.SceneNode;
import com.jagex.runescape.model.SceneSomething;
import com.jagex.runescape.model.SceneSomething2;
import com.jagex.runescape.model.SomethingInScenePacket202;
import com.jagex.runescape.model.SomethingSceneI;
import com.jagex.runescape.model.SomethingSceneJ;

public final class DummyClass27 {

  public static GameString aClass94_1582 = GameStringStatics.create("Ok");
  public static BlockConfig[][] blockConfigs = new BlockConfig[13][13];
  public static GameString aClass94_1583 = DummyClass27.aClass94_1582;

  public static void method1712(int var0) {
    DummyClass27.blockConfigs = null;
    DummyClass27.aClass94_1583 = null;
    DummyClass27.aClass94_1582 = null;
  }

  public static void method1713(byte var0) {
    if (var0 > -45) {
      DummyClass27.blockConfigs = null;
    }

    while (true) {
      SomethingInScenePacket202 var1 =
          (SomethingInScenePacket202) GlobalStatics_9.aClass61_2468
              .method1220((byte) -3);
      if (var1 == null) {
        return;
      }

      Mobile var2;
      int var3;
      if (var1.anInt2273 < 0) {
        var3 = -var1.anInt2273 - 1;
        if ((var3 == GlobalStatics_10.localPlayerId)) {
          var2 = GlobalStatics_9.localPlayer;
        } else {
          var2 = GlobalStatics_9.players[var3];
        }
      } else {
        var3 = var1.anInt2273 - 1;
        var2 = GlobalStatics_8.npcs[var3];
      }

      if (var2 != null) {
        GameObjectConfig var20 = DummyClass11.method2207(4, var1.anInt2270);

        int var4;
        int var5;
        if ((var1.anInt2284 != 1) && (var1.anInt2284 != 3)) {
          var4 = var20.anInt1480;
          var5 = var20.anInt1485;
        } else {
          var5 = var20.anInt1480;
          var4 = var20.anInt1485;
        }

        int var7 = (var4 + 1 >> 1) + var1.anInt2271;
        int var6 = (var4 >> 1) + var1.anInt2271;
        int var8 = (var5 >> 1) + var1.anInt2282;
        int var9 = (var5 + 1 >> 1) + var1.anInt2282;
        int[][] var10 = GlobalStatics_4.heightMap[GlobalStatics_9.currentPlane];
        int var11 =
            var10[var7][var9] + var10[var6][var9] + (var10[var6][var8]
                + var10[var7][var8]) >> 2;
        SceneNode var12 = null;
        int var13 = GlobalStatics_3.OBJECT_TYPES[var1.anInt2278];
        if ((var13 == 0)) {
          SceneSomething2 var14 =
              DummyClass14
                  .method2147(GlobalStatics_9.currentPlane, var1.anInt2271,
                      var1.anInt2282);
          if (var14 != null) {
            var12 = var14.sceneNode0;
          }
        } else if ((var13 != 1)) {
          if (var13 == 2) {
            SceneSomething var23 =
                GlobalStatics_3
                    .method1336(GlobalStatics_9.currentPlane, var1.anInt2271,
                        var1.anInt2282);
            if (var23 != null) {
              var12 = var23.sceneNode;
            }
          } else if (var13 == 3) {
            SomethingSceneJ var24 =
                GlobalStatics_0
                    .method784(GlobalStatics_9.currentPlane, var1.anInt2271,
                        var1.anInt2282);
            if (var24 != null) {
              var12 = var24.aClass140_320;
            }
          }
        } else {
          SomethingSceneI var21 =
              GlobalStatics_4
                  .method1068(GlobalStatics_9.currentPlane, var1.anInt2271,
                      var1.anInt2282);
          if (var21 != null) {
            var12 = var21.aClass140_429;
          }
        }

        if (var12 != null) {
          GlobalStatics_9
              .method881(GlobalStatics_9.currentPlane, var1.anInt2282, -96, 0,
                  var1.anInt2271,
                  var1.anInt2283 + 1, -1, var13, 0, var1.anInt2266 + 1);
          var2.anInt2778 = var1.anInt2283 + GlobalStatics_4.updateCycle;
          var2.anInt2833 = 64 * var5 + var1.anInt2282 * 128;
          var2.anInt2782 = var4 * 64 + 128 * var1.anInt2271;
          var2.anObject2796 = var12;
          int var22 = var1.anInt2268;
          var2.anInt2812 = var11;
          var2.anInt2797 = GlobalStatics_4.updateCycle + var1.anInt2266;
          int var15 = var1.anInt2272;
          int var16 = var1.anInt2277;
          int var17 = var1.anInt2279;
          int var18;
          if (var22 > var15) {
            var18 = var22;
            var22 = var15;
            var15 = var18;
          }

          var2.anInt2818 = var1.anInt2271 + var15;
          if (var16 > var17) {
            var18 = var16;
            var16 = var17;
            var17 = var18;
          }

          var2.anInt2777 = var1.anInt2282 + var16;
          var2.anInt2817 = var17 + var1.anInt2282;
          var2.anInt2788 = var1.anInt2271 + var22;
        }
      }
    }
  }

  public static void method1714(byte var0) {
    GlobalStatics_9.aClass93_1911.method1523((byte) -112);
    if (var0 != -6) {
      DummyClass27.method1712(-114);
    }

    GlobalStatics_9.aClass93_1131.method1523((byte) -100);
  }

}
