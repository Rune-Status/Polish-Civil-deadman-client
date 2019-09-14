package com.jagex.runescape;

import com.jagex.runescape.opengl.SomethingGl0;

public final class PlayerVariable {

  public static boolean aBoolean554;
  public static int anInt555;
  public static FileUnpacker aClass153_557;
  public static int[][][] anIntArrayArrayArray558;
  public static GameString aClass94_559 = GameString.create("m-Ochte mit Ihnen handeln)3");
  public static GameString aClass94_560 =
    GameString.create(" zuerst von Ihrer Freunde)2Liste(Q");
  public static int mouseWheelOffset;
  public static int anInt562;
  public int anInt556;

  public void method970(int var1, Buffer var2 ) {
    while (true) {
        int var3 = var2.readUnsignedByte();
        if (0 == var3) {
          if (var1 != -20638) {
            PlayerVariable.method969(null, 55);
          }

          return;
        }

        this.method972(var2, (byte) -117, var3);
      }
  }

  private void method972(Buffer var1, byte var2, int var3) {
    if (var2 > -86) {
        this.method970(-83, null);
      }

      if (~var3 == -6) {
        this.anInt556 = var1.readUnsignedShort();
      }
  }

  public static void method968(int var0) {
    int[] var1 = new int[TextureSampler39.anInt3287];
      int var2 = 0;

      int var3;
      for (var3 = 0; TextureSampler39.anInt3287 > var3; ++var3) {
        ItemConfig var4 = DummyClass35.getItemConfig(var3, (byte) 119);
        if (-1 >= ~var4.anInt793 || ~var4.anInt761 <= -1) {
          var1[var2++] = var3;
        }
      }

      SomethingTexture4.anIntArray2664 = new int[var2];

      for (var3 = 0; var3 < var2; ++var3) {
        SomethingTexture4.anIntArray2664[var3] = var1[var3];
      }

      if (var0 != 128) {
        PlayerVariable.method968(19);
      }
  }

  public static void method969(FileUnpacker var0, int var1) {
    SomethingSceneJ.aClass153_322 = var0;
      if (var1 < 39) {
        PlayerVariable.mouseWheelOffset = -82;
      }
  }

  public static void method971(int var0, int[][] var1, float[][] var2, int var3, float[][] var4,
                              int var5, byte var6, int var7, int var8, byte var9, boolean var10,
                              byte var11, int var12, float[][] var13, int var14,
                              SomethingGl0 var15) {
    int var16 = 255 + (var0 << 8);
      int var17 = (var5 << 8) - -255;
      int var18 = (var8 << 8) - -255;
      int var19 = (var14 << 8) - -255;
      int[] var20 = DummyClass21.anIntArrayArray1763[var11];
      int[] var22 = new int[var20.length >> 1];

      int var23;
      for (var23 = 0; var23 < var22.length; ++var23) {
        var22[var23] =
          BufferData.method1734(var19, 0.0F, var16, var17, null, var1, var3, var13, var18,
            (byte) -125, var6, false, var15, var2, var12, var20[var23 + var23], var4,
            var20[var23 + var23 + 1]);
      }

      if (var9 == 88) {
        int[] var21 = null;
        if (var10) {
          int var24;
          if (1 == var11) {
            var23 = BufferData.method1734(var19, 0.0F, var16, var17, null, var1, var3, var13, var18,
              (byte) -122, var6, true, var15, var2, var12, 64, var4, 128);
            var24 = BufferData.method1734(var19, 0.0F, var16, var17, null, var1, var3, var13, var18,
              (byte) -114, var6, true, var15, var2, var12, 128, var4, 64);
            var21 = new int[] {var24, var23, var22[2], var23, var22[0], var22[2]};
          } else if (2 == var11) {
            var21 = new int[6];
            var23 = BufferData.method1734(var19, 0.0F, var16, var17, null, var1, var3, var13, var18,
              (byte) -121, var6, true, var15, var2, var12, 128, var4, 128);
            var24 = BufferData.method1734(var19, 0.0F, var16, var17, null, var1, var3, var13, var18,
              (byte) -128, var6, true, var15, var2, var12, 64, var4, 0);
            var21[2] = var23;
            var21[0] = var22[0];
            var21[5] = var22[0];
            var21[3] = var23;
            var21[1] = var24;
            var21[4] = var22[1];
          } else if (~var11 != -4) {
            if (~var11 == -5) {
              var21 = new int[3];
              var23 =
                BufferData.method1734(var19, 0.0F, var16, var17, null, var1, var3, var13, var18,
                  (byte) -115, var6, true, var15, var2, var12, 0, var4, 128);
              var21[0] = var22[3];
              var21[2] = var22[0];
              var21[1] = var23;
            } else if (~var11 != -6) {
              if (~var11 == -7) {
                var21 = new int[6];
                var23 =
                    BufferData
                        .method1734(var19, 0.0F, var16, var17, null, var1, var3,
                            var13, var18,
                            (byte) -123, var6, true, var15, var2, var12, 128,
                            var4, 0);
                var24 =
                    BufferData
                        .method1734(var19, 0.0F, var16, var17, null, var1, var3,
                            var13, var18,
                            (byte) -115, var6, true, var15, var2, var12, 128,
                            var4, 128);
                var21[1] = var23;
                var21[0] = var22[3];
                var21[2] = var24;
                var21[4] = var22[0];
                var21[3] = var24;
                var21[5] = var22[3];
              } else {
                if (~var11 == -8) {
                  var21 = new int[6];
                  var23 =
                      BufferData
                          .method1734(var19, 0.0F, var16, var17, null, var1,
                              var3, var13, var18,
                              (byte) -126, var6, true, var15, var2, var12, 0,
                              var4, 128);
                  var24 =
                      BufferData
                          .method1734(var19, 0.0F, var16, var17, null, var1,
                              var3, var13, var18,
                              (byte) -117, var6, true, var15, var2, var12, 128,
                              var4, 0);
                  var21[3] = var23;
                  var21[2] = var23;
                  var21[0] = var22[1];
                  var21[4] = var22[2];
                  var21[1] = var24;
                  var21[5] = var22[1];
                } else if (var11 == 8) {
                  var21 = new int[3];
                  var23 =
                      BufferData
                          .method1734(var19, 0.0F, var16, var17, null, var1,
                              var3, var13, var18,
                              (byte) -117, var6, true, var15, var2, var12, 0,
                              var4, 0);
                  var21[2] = var22[4];
                  var21[0] = var22[3];
                  var21[1] = var23;
                } else if (var11 == 9) {
                  var23 =
                      BufferData
                          .method1734(var19, 0.0F, var16, var17, null, var1,
                              var3, var13, var18,
                              (byte) -118, var6, true, var15, var2, var12, 128,
                              var4, 64);
                  var24 =
                      BufferData
                          .method1734(var19, 0.0F, var16, var17, null, var1,
                              var3, var13, var18,
                              (byte) -121, var6, true, var15, var2, var12, 96,
                              var4, 32);
                  int var25 =
                      BufferData
                          .method1734(var19, 0.0F, var16, var17, null, var1,
                              var3, var13, var18,
                              (byte) -120, var6, true, var15, var2, var12, 64,
                              var4, 0);
                  var21 = new int[]{
                      var24, var23, var22[4], var24, var22[4], var22[3], var24,
                      var22[3], var22[2],
                      var24, var22[2], var22[1], var24, var22[1], var25
                  };
                } else if (10 != var11) {
                  if (-12 == ~var11) {
                    var21 = new int[12];
                    var23 =
                        BufferData
                            .method1734(var19, 0.0F, var16, var17, null, var1,
                                var3, var13,
                                var18, (byte) -119, var6, true, var15, var2,
                                var12, 0, var4, 64);
                    var24 =
                        BufferData
                            .method1734(var19, 0.0F, var16, var17, null, var1,
                                var3, var13,
                                var18, (byte) -121, var6, true, var15, var2,
                                var12, 128, var4, 64);
                    var21[5] = var23;
                    var21[1] = var23;
                    var21[8] = var23;
                    var21[0] = var22[3];
                    var21[2] = var22[0];
                    var21[11] = var24;
                    var21[6] = var22[2];
                    var21[7] = var24;
                    var21[10] = var22[1];
                    var21[3] = var22[3];
                    var21[4] = var22[2];
                    var21[9] = var22[2];
                  }
                } else {
                  var21 = new int[9];
                  var23 =
                      BufferData
                          .method1734(var19, 0.0F, var16, var17, null, var1,
                              var3, var13, var18,
                              (byte) -120, var6, true, var15, var2, var12, 0,
                              var4, 128);
                  var21[0] = var22[2];
                  var21[8] = var22[0];
                  var21[1] = var23;
                  var21[4] = var23;
                  var21[2] = var22[3];
                  var21[7] = var23;
                  var21[3] = var22[3];
                  var21[5] = var22[4];
                  var21[6] = var22[4];
                }
              }
            } else {
              var21 = new int[3];
              var23 =
                BufferData.method1734(var19, 0.0F, var16, var17, null, var1, var3, var13, var18,
                  (byte) -112, var6, true, var15, var2, var12, 128, var4, 128);
              var21[1] = var23;
              var21[0] = var22[2];
              var21[2] = var22[3];
            }
          } else {
            var21 = new int[6];
            var23 = BufferData.method1734(var19, 0.0F, var16, var17, null, var1, var3, var13, var18,
              (byte) -114, var6, true, var15, var2, var12, 0, var4, 128);
            var24 = BufferData.method1734(var19, 0.0F, var16, var17, null, var1, var3, var13, var18,
              (byte) -115, var6, true, var15, var2, var12, 64, var4, 0);
            var21[4] = var24;
            var21[1] = var22[1];
            var21[0] = var22[2];
            var21[3] = var23;
            var21[2] = var23;
            var21[5] = var22[2];
          }
        }

        var15.method150(var7, var3, var12, var22, var21, false);
      }
  }

  public static void method973(byte var0) {
    PlayerVariable.aClass94_559 = null;
      PlayerVariable.aClass94_560 = null;
      PlayerVariable.aClass153_557 = null;
      PlayerVariable.anIntArrayArrayArray558 = null;
  }

}
