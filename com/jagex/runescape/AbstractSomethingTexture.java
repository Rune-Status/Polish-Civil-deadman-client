package com.jagex.runescape;

import com.jagex.runescape.opengl.GlTexture2d;

public abstract class AbstractSomethingTexture {

  public static long aLong1102;
  public static AnimationSomething[] aClass3_Sub28_Sub5Array1103 = new AnimationSomething[14];
  public static int anInt1105;
  public static int[] OBJECT_TYPES =
      {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
  public static int anInt1108;
  public static int anInt1109;
  public int anInt1101;
  public int anInt1104;
  public int anInt1106;


  public AbstractSomethingTexture(int var1, int var2, int var3 ) {
    try {
      this.anInt1104 = var2;
      this.anInt1106 = var3;
      this.anInt1101 = var1;
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "kf.<init>(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  public abstract void method1335(int var1,int var2,int var3 );

  public abstract void method1337(int var1,boolean var2,int var3 );

  public abstract void method1341(int var1,int var2,int var3 );

  public static void method1334(byte var0) {
    try {
      AbstractSomethingTexture.OBJECT_TYPES = null;
      AbstractSomethingTexture.aClass3_Sub28_Sub5Array1103 = null;

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "kf.J(" + var0 + ')');
    }
  }

  public static SceneSomething method1336(int var0, int var1, int var2) {
    SceneGraphTile var3 = SomethingTexture1.sceneGraphTiles[var0][var1][var2];
    if (var3 == null) {
      return null;
    } else {
      for (int var4 = 0; var4 < var3.anInt2223; ++var4) {
        SceneSomething var5 = var3.sceneGraphNodes[var4];
        if ((var5.aLong498 >> 29 & 3L) == 2L && var5.anInt483 == var1 && var5.anInt478 == var2) {
          return var5;
        }
      }

      return null;
    }
  }

  public static int method1338(int var0, int var1) {
    try {
      if (var1 <= 13) {
        AbstractSomethingTexture.OBJECT_TYPES = null;
      }

      return 255 & var0;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "kf.H(" + var0 + ',' + var1 + ')');
    }
  }

  public static void method1339(GameString var0, int var1) {
    try {
      if (var1 == 0) {
        for (SomethingWorldMapy var2 = (SomethingWorldMapy) DummyClass21.aClass61_1758.getFirst();
             var2 != null; var2 = (SomethingWorldMapy) DummyClass21.aClass61_1758.getNext()) {
          if (var2.aClass94_3561.method1528((byte) -42, var0)) {
            Buffer.aClass3_Sub28_Sub3_2600 = var2;
            return;
          }
        }

      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "kf.G(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }

  public static void method1340(int var0, int var1, byte var2, int var3, int var4) {
    try {
      if (var2 != -40) {
        AbstractSomethingTexture.anInt1105 = 43;
      }

      for (int var5 = 0; ~SomethingWorldMapy.widgetQuads < ~var5; ++var5) {
        if (~(GlTexture2d.quadx1[var5] + AbstractAudioOutputStream.quadx0[var5]) < ~var0
          && ~(var1 + var0) < ~AbstractAudioOutputStream.quadx0[var5] && ~var3 > ~(
          Mobile.quady1[var5] + Player.quady0[var5]) && Player.quady0[var5] < var3 - -var4) {
          GroundItemNode.aBooleanArray3674[var5] = true;
        }
      }

    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "kf.I(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
    }
  }

}
