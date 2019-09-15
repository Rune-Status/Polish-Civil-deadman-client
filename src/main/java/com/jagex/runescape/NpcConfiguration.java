package com.jagex.runescape;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.HashTable;
import com.jagex.runescape.common.StringNode;
import com.jagex.runescape.done.AbstractModel;
import com.jagex.runescape.done.AnimationSequence;
import com.jagex.runescape.done.AnimationSomething;
import com.jagex.runescape.node.Node;
import com.jagex.runescape.opengl.GLStatics;
import com.jagex.runescape.opengl.GlModel;
import com.jagex.runescape.opengl.GlRenderer;

public final class NpcConfiguration {

  public int size = 1;
  public boolean aBoolean1249;
  public int anInt1253;
  public boolean aBoolean1255 = true;
  public short aShort1256;
  public GameString[] aClass94Array1259;
  public int anInt1260;
  public int anInt1262 = -1;
  public boolean aBoolean1263;
  public int anInt1265;
  public byte aByte1267;
  public byte defaultFaceDirection;
  public int anInt1269;
  public boolean aBoolean1270 = true;
  public GameString aClass94_1273;
  public int anInt1274;
  public byte aByte1275;
  public int anInt1276 = -1;
  public int anInt1278;
  public int anInt1279;
  public int renderAnimationId;
  public int anInt1283;
  public int anInt1284;
  public boolean aBoolean1285;
  public short aShort1286;
  public byte aByte1287;
  public int anInt1289;
  public int anInt1290;
  public int anInt1291;
  public int[] anIntArray1292;
  public int anInt1293;
  public int anInt1296;
  public int anInt1298;
  private short[] aShortArray1246;
  private byte[] aByteArray1247;
  private short[] aShortArray1248;
  private int[] anIntArray1250;
  private int anInt1251;
  private short[] aShortArray1254;
  private int anInt1257;
  private int[][] anIntArrayArray1258;
  private int[][] anIntArrayArray1261;
  private int anInt1264;
  private int anInt1266;
  private short[] aShortArray1271;
  private HashTable aClass130_1272;
  private int anInt1282;
  private int[] anIntArray1288;
  private int anInt1295;


  public NpcConfiguration() {
    this.aClass94_1273 = GlobalStatics_5.aClass94_2006;
    this.anInt1260 = -1;
    this.aBoolean1285 = true;
    this.anInt1253 = -1;
    this.anInt1282 = 0;
    this.anInt1283 = -1;
    this.anInt1264 = 128;
    this.aByte1275 = -16;
    this.anInt1269 = -1;
    this.aByte1267 = 0;
    this.aBoolean1249 = true;
    this.aShort1286 = 0;
    this.anInt1289 = -1;
    this.anInt1279 = -1;
    this.anInt1251 = 0;
    this.aBoolean1263 = false;
    this.anInt1274 = 32;
    this.aClass94Array1259 = new GameString[5];
    this.anInt1293 = -1;
    this.aByte1287 = -96;
    this.defaultFaceDirection = 7;
    this.renderAnimationId = -1;
    this.anInt1296 = -1;
    this.anInt1291 = 0;
    this.anInt1266 = 128;
    this.anInt1257 = -1;
    this.anInt1290 = -1;
    this.anInt1265 = -1;
    this.anInt1278 = -1;
    this.anInt1295 = -1;
    this.anInt1298 = -1;
  }

  public NpcConfiguration method1471(byte var1 ) {
    int var2 = -1;
      if ((this.anInt1257 == -1)) {
        if (this.anInt1295 != -1) {
          var2 = DummyClass5.anIntArray2985[this.anInt1295];
        }
      } else {
        var2 = GlobalStatics_9.method1484(64835055, this.anInt1257);
      }

      int var3;
      if (var2 >= 0 && (var2 < (-1 + this.anIntArray1292.length))
        && this.anIntArray1292[var2] != -1) {
        var3 = -24 % ((-46 - var1) / 41);
        return GlobalStatics_2.getNpcConfiguration(this.anIntArray1292[var2]);
      } else {
        var3 = this.anIntArray1292[-1 + this.anIntArray1292.length];
        return (var3 == -1) ? null : GlobalStatics_2.getNpcConfiguration(var3);
      }
  }

  public boolean method1472(byte var1 ) {
    if (var1 != 74) {
        return true;
      } else if (this.anIntArray1292 == null) {
        return true;
      } else {
        int var2 = -1;
        if (this.anInt1257 == -1) {
          if ((this.anInt1295 != -1)) {
            var2 = DummyClass5.anIntArray2985[this.anInt1295];
          }
        } else {
          var2 = GlobalStatics_9.method1484(64835055, this.anInt1257);
        }

        if (var2 >= 0 && var2 < -1 + this.anIntArray1292.length
          && this.anIntArray1292[var2] != -1) {
          return true;
        } else {
          int var3 = this.anIntArray1292[-1 + this.anIntArray1292.length];
          return (var3 != -1);
        }
      }
  }

  public boolean method1474(int var1 ) {
    if (var1 != -1) {
        GlobalStatics_9.method1480(false, null, -57);
      }

      if (this.anIntArray1292 != null) {
        for (int var2 = 0; this.anIntArray1292.length > var2; ++var2) {
          if ((this.anIntArray1292[var2] != -1)) {
            NpcConfiguration var3 = GlobalStatics_2.getNpcConfiguration(
                this.anIntArray1292[var2]);
            if ((var3.anInt1262 != -1) || (var3.anInt1293 != -1)
                || var3.anInt1276 != -1) {
              return true;
            }
          }
        }

        return false;
      } else {
        return this.anInt1262 != -1 || this.anInt1293 != -1 || this.anInt1276 != -1;
      }
  }

  public int method1475(int var1, int var2, int var3 ) {
    if (this.aClass130_1272 != null) {
        IntegerNode var4 = (IntegerNode) this.aClass130_1272.get(var1);
        if (var2 != -26460) {
          GlobalStatics_9.aClass94_1294 = null;
        }

        return var4 != null ? var4.anInt2467 : var3;
      } else {
        return var3;
      }
  }

  public AbstractModel method1476(Unsure[] var1, int var2, byte var3,
                                  int var4,
                                  int var5,
                                  int var6,
                                  int var7,
                                  AnimationSequence var8,
                                  int var9,
                                  AnimationSequence var10 ) {
    if (this.anIntArray1292 != null) {
        NpcConfiguration var33 = this.method1471((byte) 32);
        return var33 != null ?
          var33.method1476(var1, var2, (byte) -102, var4, var5, var6, var7, var8, var9, var10) :
          null;
      } else {
        AbstractModel var11 =
          (AbstractModel) GlobalStatics_7.aClass93_2442.get(this.anInt1284);
        boolean var12;
        int var17;
        int var16;
        int var19;
        int var18;
        int var21;
        int var20;
        int var22;
        int var24;
        int var27;
        int var29;
        int var28;
        if (var11 == null) {
          var12 = false;

          for (int var13 = 0; var13 < this.anIntArray1288.length; ++var13) {
            if (this.anIntArray1288[var13] != -1 && !GlobalStatics_10.aClass153_3173.method2129(
              (byte) 102, 0, this.anIntArray1288[var13])) {
              var12 = true;
            }
          }

          if (var12) {
            return null;
          }

          Model[] var14 = new Model[this.anIntArray1288.length];

          for (int var15 = 0; this.anIntArray1288.length > var15; ++var15) {
            if ((this.anIntArray1288[var15] != -1)) {
              var14[var15] =
                Model.getModel(GlobalStatics_10.aClass153_3173,
                    this.anIntArray1288[var15], 0);
              if (this.anIntArrayArray1261 != null
                  && this.anIntArrayArray1261[var15] != null
                && var14[var15] != null) {
                var14[var15].translate(this.anIntArrayArray1261[var15][0],
                    this.anIntArrayArray1261[var15][1], this.anIntArrayArray1261[var15][2]);
              }
            }
          }

          RenderAnimation var38 = null;
          if (this.renderAnimationId != -1) {
            var38 = GlobalStatics_9.getRenderAnimation(false,
                this.renderAnimationId);
          }

          if (var38 != null && var38.anIntArrayArray359 != null) {
            for (var16 = 0; var16 < var38.anIntArrayArray359.length; ++var16) {
              if (var38.anIntArrayArray359[var16] != null && var14.length > var16
                && var14[var16] != null) {
                var19 = var38.anIntArrayArray359[var16][2];
                var20 = var38.anIntArrayArray359[var16][3];
                var21 = var38.anIntArrayArray359[var16][4];
                var18 = var38.anIntArrayArray359[var16][1];
                var22 = var38.anIntArrayArray359[var16][5];
                var17 = var38.anIntArrayArray359[var16][0];
                if (this.anIntArrayArray1258 == null) {
                  this.anIntArrayArray1258 = new int[var38.anIntArrayArray359.length][];
                }

                if (this.anIntArrayArray1258[var16] == null) {
                  int[] var23 = this.anIntArrayArray1258[var16] = new int[15];
                  if (var20 == 0 && var21 == 0 && var22 == 0) {
                    var23[13] = -var18;
                    var23[14] = -var19;
                    var23[0] = var23[4] = var23[8] = '\u8000';
                    var23[12] = -var17;
                  } else {
                    var24 = DummyClass40.COSINE_TABLE[var20] >> 1;
                    int var25 = GLStatics.SINE_TABLE[var20] >> 1;
                    int var26 = DummyClass40.COSINE_TABLE[var21] >> 1;
                    var28 = DummyClass40.COSINE_TABLE[var22] >> 1;
                    var27 = GLStatics.SINE_TABLE[var21] >> 1;
                    var29 = GLStatics.SINE_TABLE[var22] >> 1;
                    var23[3] = var24 * var29 + 16384 >> 15;
                    var23[8] = 16384 + var24 * var26 >> 15;
                    var23[5] = -var25;
                    int var31 = 16384 + var25 * var29 >> 15;
                    int var30 = var28 * var25 + 16384 >> 15;
                    var23[1] = 16384 - var29 * var26 + (var30 * var27) >> 15;
                    var23[2] = 16384 + var27 * var24 >> 15;
                    var23[6] = 16384 - var27 * var28 + var31 * var26 >> 15;
                    var23[14] =
                      16384 + var23[8] * -var19 - var18 * var23[5] + var23[2] * -var17 >> 15;
                    var23[4] = 16384 + var24 * var28 >> 15;
                    var23[7] = 16384 - var27 * -var29 + var30 * var26 >> 15;
                    var23[0] = var27 * var31 + var26 * var28 + 16384 >> 15;
                    var23[12] =
                      16384 + var23[6] * -var19 + var23[3] * -var18 - var17 * var23[0] >> 15;
                    var23[13] =
                      -var19 * var23[7] - var17 * var23[1] + (-var18 * var23[4] + 16384) >> 15;
                  }

                  var23[10] = var18;
                  var23[9] = var17;
                  var23[11] = var19;
                }

                if ((var20 != 0) || (var21 != 0) || var22 != 0) {
                  var14[var16].rotate(var20, var21, var22);
                }

                if (var17 != 0 || var18 != 0 || (var19 != 0)) {
                  var14[var16].translate(var17, var18, var19);
                }
              }
            }
          }

          Model var34;
          if (var14.length == 1) {
            var34 = var14[0];
          } else {
            var34 = new Model(var14, var14.length);
          }

          if (this.aShortArray1248 != null) {
            for (var16 = 0; this.aShortArray1248.length > var16; ++var16) {
              if (this.aByteArray1247 != null
                  && this.aByteArray1247.length > var16) {
                assert var34 != null;
                var34.replaceColor(this.aShortArray1248[var16],
                  GlobalStatics_9.aShortArray1779[this.aByteArray1247[var16] & 255]);
              } else {
                assert var34 != null;
                var34.replaceColor(
                    this.aShortArray1248[var16], this.aShortArray1254[var16]);
              }
            }
          }

          if (this.aShortArray1271 != null) {
            for (var16 = 0; this.aShortArray1271.length > var16; ++var16) {
              assert var34 != null;
              var34.replaceMaterial(
                  this.aShortArray1271[var16], this.aShortArray1246[var16]);
            }
          }

          assert var34 != null;
          var11 = var34.method2008(this.anInt1251 + 64, this.anInt1282 + 850, -30, -50, -30);
          if (GlRenderer.useOpenGlRenderer) {
            ((GlModel) var11).method1920(false, false, false, true, false, false, true);
          }

          GlobalStatics_7.aClass93_2442.get((byte) -90, var11, this.anInt1284);
        }

        var12 = false;
        boolean var37 = false;
        boolean var35 = false;
        boolean var36 = false;
        var16 = var1 != null ? var1.length : 0;

        for (var17 = 0; var16 > var17; ++var17) {
          assert var1 != null;
          if (var1[var17] != null) {
            AnimationSequence var39 = GlobalStatics_8.method45(var1[var17].anInt1890, (byte) -20);
            if (var39.anIntArray1851 != null) {
              DummyClass52.aClass142Array1168[var17] = var39;
              var20 = var1[var17].anInt1891;
              var12 = true;
              var19 = var1[var17].anInt1893;
              var21 = var39.anIntArray1851[var19];
              GlobalStatics_9.aClass3_Sub28_Sub5Array3041[var17] =
                GlobalStatics_6.method133(var21 >>> 16, 0);
              var21 &= '\uffff';
              DummyClass43.anIntArray912[var17] = var21;
              if (GlobalStatics_9.aClass3_Sub28_Sub5Array3041[var17] != null) {
                var35 |=
                  GlobalStatics_9.aClass3_Sub28_Sub5Array3041[var17].method561(var21, (byte) 124);
                var37 |=
                  GlobalStatics_9.aClass3_Sub28_Sub5Array3041[var17].method559(1317095745, var21);
                var36 |= var39.aBoolean1848;
              }

              if ((var39.tween || GlobalStatics_9.tweening) && (var20 != -1)
                && var39.anIntArray1851.length > var20) {
                DummyClass35.anIntArray664[var17] = var39.anIntArray1869[var19];
                GlobalStatics_2.anIntArray2574[var17] = var1[var17].anInt1897;
                var22 = var39.anIntArray1851[var20];
                GlobalStatics_10.aClass3_Sub28_Sub5Array4031[var17] =
                  GlobalStatics_6.method133(var22 >>> 16, 0);
                var22 &= '\uffff';
                GlobalStatics_6.anIntArray574[var17] = var22;
                if (GlobalStatics_10.aClass3_Sub28_Sub5Array4031[var17] != null) {
                  var35 |= GlobalStatics_10.aClass3_Sub28_Sub5Array4031[var17].method561(var22,
                    (byte) 124);
                  var37 |= GlobalStatics_10.aClass3_Sub28_Sub5Array4031[var17].method559(1317095745,
                    var22);
                }
              } else {
                DummyClass35.anIntArray664[var17] = 0;
                GlobalStatics_2.anIntArray2574[var17] = 0;
                GlobalStatics_10.aClass3_Sub28_Sub5Array4031[var17] = null;
                GlobalStatics_6.anIntArray574[var17] = -1;
              }
            }
          }
        }

        if (!var12 && var10 == null && var8 == null) {
          AbstractModel var41 = var11.method1894(true, true, true);
          if (this.anInt1264 != 128 || (this.anInt1266 != 128)) {
            var41.scale(this.anInt1264, this.anInt1266, this.anInt1264);
          }

          return var41;
        } else {
          var18 = -1;
          var17 = -1;
          var19 = 0;
          AnimationSomething var40 = null;
          AnimationSomething var43 = null;
          int var42;
          if (var10 != null) {
            var17 = var10.anIntArray1851[var7];
            var22 = var17 >>> 16;
            var17 &= '\uffff';
            var40 = GlobalStatics_6.method133(var22, 0);
            if (var40 != null) {
              var35 |= var40.method561(var17, (byte) 126);
              var37 |= var40.method559(1317095745, var17);
              var36 |= var10.aBoolean1848;
            }

            if ((var10.tween || GlobalStatics_9.tweening) && (var5 != -1)
              && var10.anIntArray1851.length > var5) {
              var19 = var10.anIntArray1869[var7];
              var18 = var10.anIntArray1851[var5];
              var42 = var18 >>> 16;
              var18 &= '\uffff';
              if (var22 == var42) {
                var43 = var40;
              } else {
                var43 = GlobalStatics_6.method133(var18 >>> 16, 0);
              }

              if (var43 != null) {
                var35 |= var43.method561(var18, (byte) 115);
                var37 |= var43.method559(1317095745, var18);
              }
            }
          }

          var22 = -1;
          if (var3 > -63) {
            this.method1483(79, 73, null);
          }

          var42 = -1;
          AnimationSomething var44 = null;
          var24 = 0;
          AnimationSomething var46 = null;
          if (var8 != null) {
            var22 = var8.anIntArray1851[var4];
            var27 = var22 >>> 16;
            var22 &= '\uffff';
            var44 = GlobalStatics_6.method133(var27, 0);
            if (var44 != null) {
              var35 |= var44.method561(var22, (byte) 124);
              var37 |= var44.method559(1317095745, var22);
              var36 |= var8.aBoolean1848;
            }

            if ((var8.tween || GlobalStatics_9.tweening) && (var2 != -1)
              && var2 < var8.anIntArray1851.length) {
              var24 = var8.anIntArray1869[var4];
              var42 = var8.anIntArray1851[var2];
              var28 = var42 >>> 16;
              var42 &= '\uffff';
              if ((var28 == var27)) {
                var46 = var44;
              } else {
                var46 = GlobalStatics_6.method133(var42 >>> 16, 0);
              }

              if (var46 != null) {
                var35 |= var46.method561(var42, (byte) 124);
                var37 |= var46.method559(1317095745, var42);
              }
            }
          }

          AbstractModel var45 = var11.method1894(!var37, !var35, !var36);
          var29 = 1;

          for (var28 = 0; var28 < var16; ++var28) {
            if (GlobalStatics_9.aClass3_Sub28_Sub5Array3041[var28] != null) {
              var45.method1887(GlobalStatics_9.aClass3_Sub28_Sub5Array3041[var28],
                DummyClass43.anIntArray912[var28],
                GlobalStatics_10.aClass3_Sub28_Sub5Array4031[var28],
                GlobalStatics_6.anIntArray574[var28], -1 + GlobalStatics_2.anIntArray2574[var28],
                DummyClass35.anIntArray664[var28], var29,
                DummyClass52.aClass142Array1168[var28].aBoolean1848,
                  this.anIntArrayArray1258[var28]);
            }

            var29 <<= 1;
          }

          if (var40 != null && var44 != null) {
            var45.method1892(var40, var17, var43, var18, var6 - 1, var19, var44, var22, var46,
              var42, var9 - 1, var24, var10.aBooleanArray1855,
              var10.aBoolean1848 | var8.aBoolean1848);
          } else if (var40 == null) {
            if (var44 != null) {
              var45.method1880(var44, var22, var46, var42, -1 + var9, var24, var8.aBoolean1848);
            }
          } else {
            var45.method1880(var40, var17, var43, var18, var6 - 1, var19, var10.aBoolean1848);
          }

          for (var28 = 0; (var28 < var16); ++var28) {
            GlobalStatics_9.aClass3_Sub28_Sub5Array3041[var28] = null;
            GlobalStatics_10.aClass3_Sub28_Sub5Array4031[var28] = null;
            DummyClass52.aClass142Array1168[var28] = null;
          }

          if ((this.anInt1264 != 128) || (this.anInt1266 != 128)) {
            var45.scale(this.anInt1264, this.anInt1266, this.anInt1264);
          }

          return var45;
        }
      }
  }

  public GameString method1477(int var1, GameString var2, boolean var3 ) {
    if (this.aClass130_1272 != null) {
        StringNode var4 = (StringNode) this.aClass130_1272.get(var1);
        return !var3 ? null : (var4 == null ? var2 : var4.aClass94_2586);
      } else {
        return var2;
      }
  }

  public void method1478(Buffer var1, int var2 ) {
    while (true) {
        int var3 = var1.readUnsignedByte();
        if ((var3 == 0)) {
          var3 = -88 % ((5 - var2) / 52);
          return;
        }

        this.method1483(27, var3, var1);
      }
  }

  public void method1481(int var1 ) {
    int var2 = 36 % ((12 - var1) / 41);
  }

  public AbstractModel method1482(AnimationSequence var1, int var2,
      int var3,
      int var4,
      int var5 ) {
    if (this.anIntArray1292 == null) {
        if (this.anIntArray1250 == null) {
          return null;
        } else {
          AbstractModel var12 =
            (AbstractModel) DummyClass14.aClass93_1964.get(this.anInt1284);
          if (var12 == null) {
            boolean var7 = false;

            for (int var8 = 0; (var8 < this.anIntArray1250.length); ++var8) {
              if (!GlobalStatics_10.aClass153_3173.method2129((byte) -69, 0,
                  this.anIntArray1250[var8])) {
                var7 = true;
              }
            }

            if (var7) {
              return null;
            }

            Model[] var14 = new Model[this.anIntArray1250.length];

            for (int var9 = 0; (var9 < this.anIntArray1250.length); ++var9) {
              var14[var9] =
                Model.getModel(GlobalStatics_10.aClass153_3173,
                    this.anIntArray1250[var9], 0);
            }

            Model var15;
            if ((var14.length == 1)) {
              var15 = var14[0];
            } else {
              var15 = new Model(var14, var14.length);
            }

            int var10;
            if (this.aShortArray1248 != null) {
              for (var10 = 0; this.aShortArray1248.length > var10; ++var10) {
                if (this.aByteArray1247
                    != null && (var10 < this.aByteArray1247.length)) {
                  assert var15 != null;
                  var15.replaceColor(this.aShortArray1248[var10],
                    GlobalStatics_9.aShortArray1779[255 & this.aByteArray1247[var10]]);
                } else {
                  assert var15 != null;
                  var15.replaceColor(this.aShortArray1248[var10],
                      this.aShortArray1254[var10]);
                }
              }
            }

            if (this.aShortArray1271 != null) {
              for (var10 = 0; (var10 < this.aShortArray1271.length); ++var10) {
                assert var15 != null;
                var15.replaceMaterial(this.aShortArray1271[var10],
                    this.aShortArray1246[var10]);
              }
            }

            assert var15 != null;
            var12 = var15.method2008(64, 768, -50, -10, -50);
            DummyClass14.aClass93_1964.get((byte) -119, var12, this.anInt1284);
          }

          if (var1 != null) {
            var12 = var1.method2055(var12, (byte) -75, var3, var2, var5);
          }

          int var13 = 5 % ((var4 + 64) / 36);
          return var12;
        }
      } else {
        NpcConfiguration var6 = this.method1471((byte) -100);
        return var6 == null ? null : var6.method1482(var1, var2, var3, 54, var5);
      }
  }

  private void method1483(int var1, int var2, Buffer var3) {
    int var4;
      int var5;
      if (var2 == 1) {
        var4 = var3.readUnsignedByte();
        this.anIntArray1288 = new int[var4];

        for (var5 = 0; var4 > var5; ++var5) {
          this.anIntArray1288[var5] = var3.readUnsignedShort();
          if (this.anIntArray1288[var5] == '\uffff') {
            this.anIntArray1288[var5] = -1;
          }
        }
      } else if (var2 != 2) {
        if ((var2 == 12)) {
          this.size = var3.readUnsignedByte();
        } else {
          if (var2 >= 30 && (var2 < 35)) {
            this.aClass94Array1259[-30 + var2] = var3.readString();
            if (this.aClass94Array1259[-30 + var2]
                .method1531(GlobalStatics_10.aClass94_3051)) {
              this.aClass94Array1259[var2 - 30] = null;
            }
          } else if (var2 != 40) {
            if ((var2 == 41)) {
              var4 = var3.readUnsignedByte();
              this.aShortArray1246 = new short[var4];
              this.aShortArray1271 = new short[var4];

              for (var5 = 0; var4 > var5; ++var5) {
                this.aShortArray1271[var5] = (short) var3.readUnsignedShort();
                this.aShortArray1246[var5] = (short) var3.readUnsignedShort();
              }
            } else {
              if ((var2 == 42)) {
                var4 = var3.readUnsignedByte();
                this.aByteArray1247 = new byte[var4];

                for (var5 = 0; var4 > var5; ++var5) {
                  this.aByteArray1247[var5] = var3.readByte();
                }
              } else if ((var2 == 60)) {
                var4 = var3.readUnsignedByte();
                this.anIntArray1250 = new int[var4];

                for (var5 = 0; var4 > var5; ++var5) {
                  this.anIntArray1250[var5] = var3.readUnsignedShort();
                }
              } else if (var2 != 93) {
                if ((var2 == 95)) {
                  this.anInt1260 = var3.readUnsignedShort();
                } else {
                  if (var2 == 97) {
                    this.anInt1264 = var3.readUnsignedShort();
                  } else {
                    if ((var2 == 98)) {
                      this.anInt1266 = var3.readUnsignedShort();
                    } else if ((var2 != 99)) {
                      if (var2 == 100) {
                        this.anInt1251 = var3.readByte();
                      } else {
                        if ((var2 == 101)) {
                          this.anInt1282 = var3.readByte() * 5;
                        } else if ((var2 == 102)) {
                          this.anInt1269 = var3.readUnsignedShort();
                        } else if (var2 == 103) {
                          this.anInt1274 = var3.readUnsignedShort();
                        } else {
                          int var6;
                          if (var2 != 106 && (var2 != 118)) {
                            if ((var2 == 107)) {
                              this.aBoolean1270 = false;
                            } else if (var2 != 109) {
                              if (var2 == 111) {
                                this.aBoolean1249 = false;
                              } else if ((var2 == 113)) {
                                this.aShort1286 = (short) var3
                                    .readUnsignedShort();
                                this.aShort1256 = (short) var3
                                    .readUnsignedShort();
                              } else if ((var2 == 114)) {
                                this.aByte1287 = var3.readByte();
                                this.aByte1275 = var3.readByte();
                              } else if ((var2 != 115)) {
                                if (var2 == 119) {
                                  this.aByte1267 = var3.readByte();
                                } else if (var2 == 121) {
                                  this.anIntArrayArray1261 = new int[this.anIntArray1288.length][];
                                  var4 = var3.readUnsignedByte();

                                  for (var5 = 0; var5 < var4; ++var5) {
                                    var6 = var3.readUnsignedByte();
                                    int[] var7 = this.anIntArrayArray1261[var6] = new int[3];
                                    var7[0] = var3.readByte();
                                    var7[1] = var3.readByte();
                                    var7[2] = var3.readByte();
                                  }
                                } else if (var2 == 122) {
                                  this.anInt1279 = var3.readUnsignedShort();
                                } else if ((var2 == 123)) {
                                  this.anInt1265 = var3.readUnsignedShort();
                                } else if ((var2 != 125)) {
                                  if (var2 == 126) {
                                    this.anInt1283 = var3.readUnsignedShort();
                                  } else {
                                    if (var2 == 127) {
                                      this.renderAnimationId = var3
                                          .readUnsignedShort();
                                    } else if (var2 == 128) {
                                      var3.readUnsignedByte();
                                    } else if (var2 != 134) {
                                      if ((var2 == 135)) {
                                        this.anInt1296 = var3
                                            .readUnsignedByte();
                                        this.anInt1253 = var3
                                            .readUnsignedShort();
                                      } else if (var2 == 136) {
                                        this.anInt1289 = var3
                                            .readUnsignedByte();
                                        this.anInt1278 = var3
                                            .readUnsignedShort();
                                      } else if ((var2 != 137)) {
                                        if ((var2 == 249)) {
                                          var4 = var3.readUnsignedByte();
                                          if (this.aClass130_1272 == null) {
                                            var5 = GLStatics
                                                .nearestPo2((byte) 109, var4);
                                            this.aClass130_1272 = new HashTable(
                                                var5);
                                          }

                                          for (var5 = 0; (var5 < var4);
                                              ++var5) {
                                            boolean var11 =
                                                var3.readUnsignedByte() == 1;
                                            int var10 = var3
                                                .readUnsignedMedium((byte) 83);
                                            Node var8;
                                            if (var11) {
                                              var8 = new StringNode(
                                                  var3.readString());
                                            } else {
                                              var8 = new IntegerNode(
                                                  var3.readInt());
                                            }

                                            this.aClass130_1272
                                                .put(var10, var8);
                                          }
                                        }
                                      } else {
                                        this.anInt1298 = var3
                                            .readUnsignedShort();
                                      }
                                    } else {
                                      this.anInt1262 = var3.readUnsignedShort();
                                      if (this.anInt1262 == '\uffff') {
                                        this.anInt1262 = -1;
                                      }

                                      this.anInt1290 = var3.readUnsignedShort();
                                      if ((this.anInt1290 == 65535)) {
                                        this.anInt1290 = -1;
                                      }

                                      this.anInt1293 = var3.readUnsignedShort();
                                      if ((this.anInt1293 == 65535)) {
                                        this.anInt1293 = -1;
                                      }

                                      this.anInt1276 = var3.readUnsignedShort();
                                      if ((this.anInt1276 == 65535)) {
                                        this.anInt1276 = -1;
                                      }

                                      this.anInt1291 = var3.readUnsignedByte();
                                    }
                                  }
                                } else {
                                  this.defaultFaceDirection = var3.readByte();
                                }
                              } else {
                                var3.readUnsignedByte();
                                var3.readUnsignedByte();
                              }
                            } else {
                              this.aBoolean1255 = false;
                            }
                          } else {
                            this.anInt1257 = var3.readUnsignedShort();
                            var4 = -1;
                            if ((this.anInt1257 == 65535)) {
                              this.anInt1257 = -1;
                            }

                            this.anInt1295 = var3.readUnsignedShort();
                            if ((this.anInt1295 == 65535)) {
                              this.anInt1295 = -1;
                            }

                            if ((var2 == 118)) {
                              var4 = var3.readUnsignedShort();
                              if ((var4 == 65535)) {
                                var4 = -1;
                              }
                            }

                            var5 = var3.readUnsignedByte();
                            this.anIntArray1292 = new int[2 + var5];

                            for (var6 = 0; (var5 >= var6); ++var6) {
                              this.anIntArray1292[var6] = var3
                                  .readUnsignedShort();
                              if ((this.anIntArray1292[var6] == 65535)) {
                                this.anIntArray1292[var6] = -1;
                              }
                            }

                            this.anIntArray1292[1 + var5] = var4;
                          }
                        }
                      }
                    } else {
                      this.aBoolean1263 = true;
                    }
                  }
                }
              } else {
                this.aBoolean1285 = false;
              }
            }
          } else {
            var4 = var3.readUnsignedByte();
            this.aShortArray1254 = new short[var4];
            this.aShortArray1248 = new short[var4];

            for (var5 = 0; var4 > var5; ++var5) {
              this.aShortArray1248[var5] = (short) var3.readUnsignedShort();
              this.aShortArray1254[var5] = (short) var3.readUnsignedShort();
            }
          }
        }
      } else {
        this.aClass94_1273 = var3.readString();
      }

      var4 = 11 % ((-39 - var1) / 60);
  }

}
