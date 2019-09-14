package com.jagex.runescape;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;

public class GlobalStatics_4 {

  public static GameString aClass94_832 = GameStringStatics.create(" has logged out)3");
  public static GameString aClass94_822 = aClass94_832;
  public static GameString aClass94_827 = GameStringStatics.create("purple:");
  public static GameString aClass94_833 = aClass94_827;
  public static GameString aClass94_825 = aClass94_827;
  public static int anInt820;
  public static AbstractDirectColorSprite aClass3_Sub28_Sub16_824;
  public static long[] aLongArray826 = new long[200];
  public static int anInt828;
  public static GameString aClass94_829 = GameStringStatics.create("null");
    public static GameString aClass94_3711 = GameStringStatics.create("gt");
    public static GameString aClass94_3712 = GameStringStatics.create("lt");
    public static GameString aClass94_3713 = GameStringStatics.create("shad=");
    public static GameString aClass94_3714 = GameStringStatics.create("shy");
    public static GameString aClass94_3715 = GameStringStatics.create("trans=");
    public static GameString aClass94_3716 = GameStringStatics.create("u=");
    public static GameString aClass94_3717 = GameStringStatics.create("str=");
    public static GameString aClass94_3718 = GameStringStatics.create("euro");
    public static GameString aClass94_3720 = GameStringStatics.create(")4col");
    public static GameString aClass94_3724 = GameStringStatics.create(")4shad");
    public static GameString aClass94_3725 = GameStringStatics.create("col=");
    public static GameString GT = GameStringStatics.create("<gt>");
    public static GameString aClass94_3728 = GameStringStatics.create("u");
    public static GameString aClass94_3729 = GameStringStatics.create("times");
    public static GameString aClass94_3731 = GameStringStatics.create(")4trans");
    public static GameString aClass94_3732 = GameStringStatics.create("nbsp");
    public static GameString LT = GameStringStatics.create("<lt>");
    public static GameString aClass94_3735 = GameStringStatics.create(")4u");
    public static GameString aClass94_3737 = GameStringStatics.create("br");
    public static GameString aClass94_3738 = GameStringStatics.create("shad");
    public static GameString aClass94_3739 = GameStringStatics.create("img=");
    public static GameString aClass94_3741 = GameStringStatics.create("copy");
    public static GameString aClass94_3742 = GameStringStatics.create(")4str");
    public static GameString aClass94_3743 = GameStringStatics.create("reg");
    public static GameString aClass94_3744 = GameStringStatics.create("str");
    public static GameString aClass94_3745 = GameStringStatics.createString(100);
    public static int anInt3746 = -1;
    public static int anInt3747 = -1;
    public static int anInt3748;
    public static int anInt3749;
    public static int anInt3750 = 256;
    public static int anInt3751 = 256;
    public static int anInt3752 = -1;
    public static GameString[] aClass94Array3753 = new GameString[100];
    public static int anInt3754 = -1;
    public static int anInt3755;
    public static int anInt3756;
  public static GameString aClass94_3626 = GameStringStatics.create("Created gameworld");
  public static GameString aClass94_3629 = aClass94_3626;
  public static int brightnessSetting = 3;
  public static int anInt3627;
  public static int anInt3630;
  public static int anInt3631;
  public static GameString aClass94_3633 = GameStringStatics.create("Textures charg-Bes");
  public static GameString aClass94_3634 = GameStringStatics.create("Liste des serveurs charg-Be");

  public static void method1131(int var0, int var1, int var2, int var3,
      int var4, int var5, int var6,
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
        method1132(-79);
      }
  }

  public static void method1132(int var0) {
    DummyHashTable.aClass93_1683.method1523((byte) -111);
      if (var0 != 103) {
        method1132(14);
      }
  }

  public static void method1133(byte var0) {
    aClass94_833 = null;
      aClass94_822 = null;
      aClass94_827 = null;
      aClass94_829 = null;

      aClass94_832 = null;
      aClass94_825 = null;
      aLongArray826 = null;
      aClass3_Sub28_Sub16_824 = null;
  }

    public static GameString otherFormat(GameString var0) {
      int var1 = var0.getLength();
      int var2 = 0;

      int var4;
      for (int var3 = 0; var3 < var1; ++var3) {
        var4 = var0.charAt(var3);
        if (var4 == 60 || var4 == 62) {
          var2 += 3;
        }
      }

      GameString var6 = GameStringStatics.createString(var1 + var2);

      for (var4 = 0; var4 < var1; ++var4) {
        int var5 = var0.charAt(var4);
        if (var5 == 60) {
          var6.append(LT);
        } else if (var5 == 62) {
          var6.append(GT);
        } else {
          var6.method1572(var5, (byte) 115);
        }
      }

      return var6;
    }

    public static void method689() {
      aClass94_3712 = null;
      aClass94_3711 = null;
      aClass94_3732 = null;
      aClass94_3714 = null;
      aClass94_3729 = null;
      aClass94_3718 = null;
      aClass94_3741 = null;
      aClass94_3743 = null;
      aClass94_3739 = null;
      aClass94_3737 = null;
      LT = null;
      GT = null;
      aClass94_3725 = null;
      aClass94_3720 = null;
      aClass94_3715 = null;
      aClass94_3731 = null;
      aClass94_3716 = null;
      aClass94_3728 = null;
      aClass94_3735 = null;
      aClass94_3713 = null;
      aClass94_3738 = null;
      aClass94_3724 = null;
      aClass94_3717 = null;
      aClass94_3744 = null;
      aClass94_3742 = null;
      aClass94_3745 = null;
      aClass94Array3753 = null;
    }

    public static int method694(byte[][] var0, byte[][] var1, int[] var2,
                                int[] var3,
                                int[] var4, int var5, int var6) {
      int var7 = var2[var5];
      int var8 = var7 + var4[var5];
      int var9 = var2[var6];
      int var10 = var9 + var4[var6];
      int var11 = var7;
      if (var9 > var7) {
        var11 = var9;
      }

      int var12 = var8;
      if (var10 < var8) {
        var12 = var10;
      }

      int var13 = var3[var5];
      if (var3[var6] < var13) {
        var13 = var3[var6];
      }

      byte[] var14 = var1[var5];
      byte[] var15 = var0[var6];
      int var16 = var11 - var7;
      int var17 = var11 - var9;

      for (int var18 = var11; var18 < var12; ++var18) {
        int var19 = var14[var16++] + var15[var17++];
        if (var19 < var13) {
          var13 = var19;
        }
      }

      return -var13;
    }

  public static void method588(byte var0) {
    aClass94_3626 = null;
      aClass94_3634 = null;
      if (var0 != 120) {
        aClass94_3633 = null;
      }

      aClass94_3633 = null;
      aClass94_3629 = null;
  }

  public static void method589(int var0, int var1, int var2) {
    TextureSampler37.aBoolean3261 = true;
    CollisionMap.anInt1302 = var0;
    GZipDecompressor.anInt819 = var1;
    TextureSampler18.anInt4039 = var2;
    DummyClass32.anInt515 = -1;
    OndemandRequester.anInt999 = -1;
  }

  public static boolean method590(byte var0, int var1, int var2) {
    if (var2 == 11) {
        var2 = 10;
      }

      if ((var2 >= 5) && var2 <= 8) {
        var2 = 4;
      }

      GameObjectConfig var4 = DummyClass11.method2207(4, var1);
      return var4.method1684(115, var2);
  }
}
