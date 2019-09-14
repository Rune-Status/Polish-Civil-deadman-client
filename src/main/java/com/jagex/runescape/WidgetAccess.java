package com.jagex.runescape;

import com.jagex.runescape.opengl.GlModel;
import com.jagex.runescape.opengl.GlRenderer;

public final class WidgetAccess extends Node {

  private static GameString aClass94_2206 = GameString.create("white:");
  public static FileUnpacker scripts;
  public static int anInt2204;
  public static GameString aClass94_2207 = GameString.create("brillant2:");
  public static int anInt2208 = -1;
  public static int[] anIntArray2209 = {2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1};
  public static int localPlayerId = -1;
  public static int anInt2212;
  public static int[] anIntArray2213 =
      {16776960, 16711680, '\uff00', '\uffff', 16711935, 16777215};
  public static GameString aClass94_2210 = WidgetAccess.aClass94_2206;
  public static GameString aClass94_2214 = WidgetAccess.aClass94_2206;
  public int anInt2202;
  public int anInt2205;


  public WidgetAccess(int var1, int var2 ) {
    this.anInt2202 = var2;
      this.anInt2205 = var1;
  }

  public boolean method92(int var1, byte var2 ) {
    int var3 = 13 / ((-60 - var2) / 46);
      return (this.anInt2205 >> 1 + var1 & 1) != 0;
  }

  public boolean method93(int var1 ) {
    return var1 != 572878952 || (572878952 & this.anInt2205) >> 29 != 0;
  }

  public int method94(byte var1 ) {
    if (var1 != -74) {
        this.method96(90);
      }

      return this.anInt2205 >> 18 & 7;
  }

  public boolean method95(int var1 ) {
    if (var1 != -13081) {
        WidgetAccess.anInt2212 = 71;
      }

      return ((1 & this.anInt2205) != 0);
  }

  public boolean method96(int var1 ) {
    return var1 == -2063688673 && (this.anInt2205 >> 31 & 1) != 0;
  }

  public boolean method97(int var1 ) {
    return var1 != -20710 || (1 & this.anInt2205 >> 22) != 0;
  }

  public boolean method98(boolean var1 ) {
    if (var1) {
        WidgetAccess.anIntArray2209 = null;
      }

      return ((this.anInt2205 >> 21 & 1) != 0);
  }

  public boolean method99(int var1 ) {
    if (var1 != 31595) {
        WidgetAccess.scripts = null;
      }

      return (((1738913629 & this.anInt2205) >> 30) != 0);
  }

  public boolean method100(byte var1 ) {
    return var1 != -9 || (this.anInt2205 & 455226656) >> 28 != 0;
  }

  public int method101(int var1 ) {
    if (var1 > -51) {
        WidgetAccess.anInt2208 = -42;
      }

      return ClientScript.method630((byte) -34, this.anInt2205);
  }

  public static void method90(int var0) {
    if (GlRenderer.useOpenGlRenderer) {
        if (!TextureSampler25.aBoolean3416) {
          SceneGraphTile[][][] var1 = SomethingTexture1.sceneGraphTiles;
          if (var0 != 1) {
            WidgetAccess.aClass94_2214 = null;
          }

          for (int var2 = 0; var2 < var1.length; ++var2) {
            SceneGraphTile[][] var3 = var1[var2];

            for (int var4 = 0; var3.length > var4; ++var4) {
              for (int var5 = 0; var3[var4].length > var5; ++var5) {
                SceneGraphTile var6 = var3[var4][var5];
                if (var6 != null) {
                  GlModel var7;
                  if (var6.aClass12_2230 != null
                    && var6.aClass12_2230.aClass140_320 instanceof GlModel) {
                    var7 = (GlModel) var6.aClass12_2230.aClass140_320;
                    if (((var6.aClass12_2230.aLong328 & Long.MIN_VALUE) == 0L)) {
                      var7.method1920(false, true, true, true, false, true, true);
                    } else {
                      var7.method1920(true, true, true, true, true, true, true);
                    }
                  }

                  if (var6.aClass19_2233 != null) {
                    if (var6.aClass19_2233.aClass140_429 instanceof GlModel) {
                      var7 = (GlModel) var6.aClass19_2233.aClass140_429;
                      if ((var6.aClass19_2233.aLong428 & Long.MIN_VALUE) == 0L) {
                        var7.method1920(false, true, true, true, false, true, true);
                      } else {
                        var7.method1920(true, true, true, true, true, true, true);
                      }
                    }

                    if (var6.aClass19_2233.aClass140_423 instanceof GlModel) {
                      var7 = (GlModel) var6.aClass19_2233.aClass140_423;
                      if (((Long.MIN_VALUE
                          & var6.aClass19_2233.aLong428) == 0L)) {
                        var7.method1920(false, true, true, true, false, true,
                            true);
                      } else {
                        var7.method1920(true, true, true, true, true, true,
                            true);
                      }
                    }
                  }

                  if (var6.aClass70_2234 != null) {
                    if (var6.aClass70_2234.sceneNode0 instanceof GlModel) {
                      var7 = (GlModel) var6.aClass70_2234.sceneNode0;
                      if (((var6.aClass70_2234.key & Long.MIN_VALUE) == 0L)) {
                        var7.method1920(false, true, true, true, false, true,
                            true);
                      } else {
                        var7.method1920(true, true, true, true, true, true,
                            true);
                      }
                    }

                    if (var6.aClass70_2234.sceneNode1 instanceof GlModel) {
                      var7 = (GlModel) var6.aClass70_2234.sceneNode1;
                      if (((Long.MIN_VALUE & var6.aClass70_2234.key) == 0L)) {
                        var7.method1920(false, true, true, true, false, true,
                            true);
                      } else {
                        var7.method1920(true, true, true, true, true, true,
                            true);
                      }
                    }
                  }

                  for (int var10 = 0; (var10 < var6.anInt2223); ++var10) {
                    if (var6.sceneGraphNodes[var10].sceneNode instanceof GlModel) {
                      GlModel var8 = (GlModel) var6.sceneGraphNodes[var10].sceneNode;
                      if (((Long.MIN_VALUE
                          & var6.sceneGraphNodes[var10].aLong498) == 0L)) {
                        var8.method1920(false, true, true, true, false, true, true);
                      } else {
                        var8.method1920(true, true, true, true, true, true, true);
                      }
                    }
                  }
                }
              }
            }
          }

          TextureSampler25.aBoolean3416 = true;
        }
      }
  }

  public static void method91(byte var0) {
    WidgetAccess.anIntArray2213 = null;
      if (var0 <= 110) {
        WidgetAccess.method90(-74);
      }

      WidgetAccess.scripts = null;
      WidgetAccess.anIntArray2209 = null;
      WidgetAccess.aClass94_2206 = null;
      WidgetAccess.aClass94_2210 = null;
      WidgetAccess.aClass94_2207 = null;
      WidgetAccess.aClass94_2214 = null;
  }

}
