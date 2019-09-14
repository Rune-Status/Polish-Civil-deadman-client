package com.jagex.runescape;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;

public final class VertexNormal {

  private static GameString aClass94_832 = GameStringStatics.create(" has logged out)3");
  private static GameString aClass94_827 = GameStringStatics.create("purple:");
  public static int anInt820;
  public static AbstractDirectColorSprite aClass3_Sub28_Sub16_824;
  public static long[] aLongArray826 = new long[200];
  public static int anInt828;
  public static GameString aClass94_829 = GameStringStatics.create("null");
  public static GameString aClass94_822 = VertexNormal.aClass94_832;
  public static GameString aClass94_825 = VertexNormal.aClass94_827;
  public static GameString aClass94_833 = VertexNormal.aClass94_827;
  public int y;
  public int c;
  public int z;
  public int x;


  public VertexNormal() {
  }

  public VertexNormal(VertexNormal var1 ) {
    this.c = var1.c;
      this.x = var1.x;
      this.y = var1.y;
      this.z = var1.z;
  }

  public static void method1131(int var0, int var1, int var2, int var3, int var4, int var5, int var6,
                               int var7) {
    if ((var6 >= 0) && var4 >= 0 && (var6 < 103) && var4 < 103) {
        int var9;
        if ((var5 == 0)) {
          SceneSomething2 var8 = DummyClass14.method2147(var0, var6, var4);
          if (var8 != null) {
            var9 = Integer.MAX_VALUE & (int) (var8.key >>> 32);
            if ((var3 == 2)) {
              var8.sceneNode0 =
                new GameObject(var9, 2, 4 + var2, var0, var6, var4, var7, false, var8.sceneNode0);
              var8.sceneNode1 = new GameObject(var9, 2, 3 & 1 + var2, var0, var6, var4, var7, false,
                var8.sceneNode1);
            } else {
              var8.sceneNode0 =
                new GameObject(var9, var3, var2, var0, var6, var4, var7, false, var8.sceneNode0);
            }
          }
        }

        if ((var5 == 1)) {
          SomethingSceneI var12 = AbstractGameWorld.method1068(var0, var6, var4);
          if (var12 != null) {
            var9 = (int) (var12.aLong428 >>> 32) & Integer.MAX_VALUE;
            if ((var3 != 4) && (var3 != 5)) {
              if ((var3 == 6)) {
                var12.aClass140_429 =
                    new GameObject(var9, 4, var2 + 4, var0, var6, var4, var7,
                        false,
                        var12.aClass140_429);
              } else {
                if (var3 == 7) {
                  var12.aClass140_429 =
                      new GameObject(var9, 4, (var2 + 2 & 3) + 4, var0, var6,
                          var4, var7, false,
                          var12.aClass140_429);
                } else if (var3 == 8) {
                  var12.aClass140_429 =
                      new GameObject(var9, 4, 4 + var2, var0, var6, var4, var7,
                          false,
                          var12.aClass140_429);
                  var12.aClass140_423 =
                      new GameObject(var9, 4, (2 + var2 & 3) + 4, var0, var6,
                          var4, var7, false,
                          var12.aClass140_423);
                }
              }
            } else {
              var12.aClass140_429 =
                new GameObject(var9, 4, var2, var0, var6, var4, var7, false, var12.aClass140_429);
            }
          }
        }

        if ((var5 == 2)) {
          if ((var3 == 11)) {
            var3 = 10;
          }

          SceneSomething var11 = AbstractSomethingTexture.method1336(var0, var6, var4);
          if (var11 != null) {
            var11.sceneNode =
              new GameObject((int) (var11.aLong498 >>> 32) & Integer.MAX_VALUE, var3, var2, var0,
                var6, var4, var7, false, var11.sceneNode);
          }
        }

        if ((var5 == 3)) {
          SomethingSceneJ var13 = GlobalStatics_0.method784(var0, var6, var4);
          if (var13 != null) {
            var13.aClass140_320 =
              new GameObject(Integer.MAX_VALUE & (int) (var13.aLong328 >>> 32), 22, var2, var0,
                var6, var4, var7, false, var13.aClass140_320);
          }
        }
      }

      if (var1 <= 104) {
        VertexNormal.method1132(-79);
      }
  }

  public static void method1132(int var0) {
    DummyHashTable.aClass93_1683.method1523((byte) -111);
      if (var0 != 103) {
        VertexNormal.method1132(14);
      }
  }

  public static void method1133(byte var0) {
    VertexNormal.aClass94_833 = null;
      VertexNormal.aClass94_822 = null;
      VertexNormal.aClass94_827 = null;
      VertexNormal.aClass94_829 = null;

      VertexNormal.aClass94_832 = null;
      VertexNormal.aClass94_825 = null;
      VertexNormal.aLongArray826 = null;
      VertexNormal.aClass3_Sub28_Sub16_824 = null;
  }

}
