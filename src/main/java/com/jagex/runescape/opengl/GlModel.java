package com.jagex.runescape.opengl;

import com.jagex.runescape.statics.GlobalStatics_1;
import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_11;
import com.jagex.runescape.statics.GlobalStatics_6;
import com.jagex.runescape.statics.GlobalStatics_9;
import com.jagex.runescape.model.Model;
import com.jagex.runescape.model.SceneNode;
import com.jagex.runescape.model.VertexNormal;
import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.ArrayUtils;
import com.jagex.runescape.model.AbstractModel;
import com.jagex.runescape.model.BufferData;
import com.jagex.runescape.model.FaceNormal;
import com.jagex.runescape.sprite.SoftwareIndexedColorSprite;
import com.jagex.runescape.statics.DummyClass0;
import com.jagex.runescape.statics.DummyClass17;
import com.jagex.runescape.statics.DummyClass3;
import com.jagex.runescape.statics.DummyClass40;
import com.jagex.runescape.statics.DummyClass45;
import com.jagex.runescape.statics.DummyClass58;
import com.jogamp.opengl.GL;
import java.nio.ByteBuffer;

public final class GlModel extends AbstractModel {

  private static Buffer indicesBuffer = new Buffer(10000);
  private static long[] aLongArray3821;
  private static ByteBuffer aByteBuffer3834;
  private static GlModel aClass140_Sub1_Sub1_3842 = new GlModel();
  private static GlModel aClass140_Sub1_Sub1_3850 = new GlModel();
  private static GlModel aClass140_Sub1_Sub1_3853 = new GlModel();
  private static GlModel aClass140_Sub1_Sub1_3854 = new GlModel();
  private static GlModel aClass140_Sub1_Sub1_3855 = new GlModel();
  private static GlModel aClass140_Sub1_Sub1_3856 = new GlModel();
  private static int[] screenCoordinatesY = new int[1];
  private static float aFloat3858;
  private static int anInt3859;
  private static float aFloat3860;
  private static int[] screenCoordinatesX = new int[1];
  private static int anInt3862;
  private static float aFloat3863;
  private static float aFloat3864;
  private static int anInt3865;
  private static float aFloat3866;
  private static float aFloat3867;
  private static boolean aBoolean3868;
  public boolean aBoolean3809;
  public int[] vx;
  public int vertexCCC;
  public GlModelDimensions aClass6_3835;
  public BufferData vertexPositionData;
  public int[] vy;
  public int[] vz;
  private short[] aShortArray3808;
  private short[] aShortArray3810;
  private short[] v0;
  private GlBufferObject aClass156_3812;
  private short[] aShortArray3813;
  private BufferData vertexColorData;
  private BufferData vertexNormalData;
  private byte[] aByteArray3816;
  private BufferData vertexTextureData;
  private short aShort3819;
  private byte[] aByteArray3820;
  private float[] aFloatArray3824;
  private int[][] anIntArrayArray3825;
  private short[] aShortArray3826;
  private short[] materials;
  private short[] aShortArray3828;
  private int[][] anIntArrayArray3829;
  private short[] v1;
  private short[] v2;
  private short[] aShortArray3832;
  private int amountVertices;
  private byte aByte3836;
  private short[] aShortArray3837;
  private int[] vertexCounts;
  private int[] offsets;
  private short[] aShortArray3841;
  private SomethingGlModel aClass18_3843;
  private int[] anIntArray3844;
  private BufferData indices;
  private float[] aFloatArray3847;
  private short aShort3849;
  private byte aByte3851;
  private int anInt3852;

  private GlModel() {
  }

  public GlModel(Model model, int var2, int var3, boolean var4) {
    int[] var5 = new int[model.amountFaces];
    this.vertexCounts = new int[model.amountVertices + 1];

    for (int face = 0; face < model.amountFaces; ++face) {
      if ((model.normalTypes == null || model.normalTypes[face] != 2) && (
          model.materials == null
              || model.materials[face] == -1 || !GLStatics.textureCache
              .method12(
                  model.materials[face] & 0xffff, -65))) {
        var5[this.anInt3852++] = face;
        ++this.vertexCounts[model.v0[face]];
        ++this.vertexCounts[model.v1[face]];
        ++this.vertexCounts[model.v2[face]];
      }
    }

    long[] var60 = new long[this.anInt3852];

    int var7;
    int var8;
    int var9;
    int var62;
    for (var7 = 0; var7 < this.anInt3852; ++var7) {
      var8 = var5[var7];
      var9 = 0;
      byte var10 = 0;
      int var11 = 0;
      int var12 = 0;
      short var13 = -1;
      if (model.materials != null) {
        var13 = model.materials[var8];
        if (var13 != -1) {
          var11 = GLStatics.textureCache.method18(var13 & 0xffff, 255);
          var12 = GLStatics.textureCache.method9(var13 & 0xffff, false);
        }
      }

      boolean var14 =
          model.aByteArray2843 != null && model.aByteArray2843[var8] != 0
              || var13 != -1 && !GLStatics.textureCache
              .method7((byte) 88, var13 & 0xffff);
      if ((var4 || var14) && model.aByteArray2889 != null) {
        var9 += model.aByteArray2889[var8] << 17;
      }

      if (var14) {
        var9 += 65536;
      }

      var9 += (var11 & 255) << 8;
      var9 += var12 & 255;
      var62 = var10 + ((var13 & 0xffff) << 16);
      var62 += var7 & 0xffff;
      var60[var7] = ((long) var9 << 32) + var62;
    }

    GlobalStatics_9.method1614(true, var60, var5);
    this.vertexCCC = model.amountVertices;
    this.vx = model.vx;
    this.vy = model.vy;
    this.vz = model.vz;
    this.anIntArray3844 = model.anIntArray2860;
    this.aShortArray3832 = model.aShortArray2893;
    var7 = this.anInt3852 * 3;
    this.aShortArray3810 = new short[var7];
    this.aShortArray3826 = new short[var7];
    this.aShortArray3837 = new short[var7];
    this.aShortArray3841 = new short[var7];
    this.aFloatArray3824 = new float[var7];
    this.aFloatArray3847 = new float[var7];
    this.aShortArray3808 = new short[this.anInt3852];
    this.aByteArray3816 = new byte[this.anInt3852];
    this.v0 = new short[this.anInt3852];
    this.v1 = new short[this.anInt3852];
    this.v2 = new short[this.anInt3852];
    this.materials = new short[this.anInt3852];
    if (model.anIntArray2847 != null) {
      this.aByteArray3820 = new byte[this.anInt3852];
    }

    if (model.aShortArray2855 != null) {
      this.aShortArray3813 = new short[this.anInt3852];
    }

    this.aClass6_3835 = new GlModelDimensions();
    this.vertexPositionData = new BufferData();
    this.vertexColorData = new BufferData();
    if (GLStatics.USE_BUMP_MAPS) {
      this.vertexNormalData = new BufferData();
    }

    this.vertexTextureData = new BufferData();
    this.indices = new BufferData();
    this.aShort3849 = (short) var2;
    this.aShort3819 = (short) var3;
    this.aShortArray3828 = new short[var7];
    GlModel.aLongArray3821 = new long[var7];
    var8 = 0;

    for (var9 = 0; var9 < model.amountVertices; ++var9) {
      var62 = this.vertexCounts[var9];
      this.vertexCounts[var9] = var8;
      var8 += var62;
    }

    this.vertexCounts[model.amountVertices] = var8;
    int[] var63 = null;
    int[] var61 = null;
    int[] var64 = null;
    float[][] var65 = null;
    int var27;
    int var68;
    float var79;
    float var75;
    float var82;
    if (model.aByteArray2866 != null) {
      var68 = model.anInt2862;
      int[] var69 = new int[var68];
      int[] var15 = new int[var68];
      int[] var16 = new int[var68];
      int[] var17 = new int[var68];
      int[] var18 = new int[var68];
      int[] var19 = new int[var68];

      int var20;
      for (var20 = 0; var20 < var68; ++var20) {
        var69[var20] = Integer.MAX_VALUE;
        var15[var20] = -2147483647;
        var16[var20] = Integer.MAX_VALUE;
        var17[var20] = -2147483647;
        var18[var20] = Integer.MAX_VALUE;
        var19[var20] = -2147483647;
      }

      for (var20 = 0; var20 < this.anInt3852; ++var20) {
        int var21 = var5[var20];
        if (model.aByteArray2866[var21] != -1) {
          int var22 = model.aByteArray2866[var21] & 255;

          for (int var23 = 0; var23 < 3; ++var23) {
            int var24;
            if (var23 == 0) {
              var24 = model.v0[var21];
            } else if (var23 == 1) {
              var24 = model.v1[var21];
            } else {
              var24 = model.v2[var21];
            }

            int var25 = model.vx[var24];
            int var26 = model.vy[var24];
            var27 = model.vz[var24];
            if (var25 < var69[var22]) {
              var69[var22] = var25;
            }

            if (var25 > var15[var22]) {
              var15[var22] = var25;
            }

            if (var26 < var16[var22]) {
              var16[var22] = var26;
            }

            if (var26 > var17[var22]) {
              var17[var22] = var26;
            }

            if (var27 < var18[var22]) {
              var18[var22] = var27;
            }

            if (var27 > var19[var22]) {
              var19[var22] = var27;
            }
          }
        }
      }

      var63 = new int[var68];
      var61 = new int[var68];
      var64 = new int[var68];
      var65 = new float[var68][];

      for (var20 = 0; var20 < var68; ++var20) {
        byte var76 = model.aByteArray2857[var20];
        if (var76 > 0) {
          var63[var20] = (var69[var20] + var15[var20]) / 2;
          var61[var20] = (var16[var20] + var17[var20]) / 2;
          var64[var20] = (var18[var20] + var19[var20]) / 2;
          if (var76 == 1) {
            short var80 = model.aShortArray2888[var20];
            if (var80 == 0) {
              var75 = 1.0F;
              var79 = 1.0F;
            } else if (var80 > 0) {
              var75 = 1.0F;
              var79 = var80 / 1024.0F;
            } else {
              var79 = 1.0F;
              var75 = -var80 / 1024.0F;
            }

            var82 = 64.0F / (model.aShortArray2882[var20] & 0xffff);
          } else if (var76 == 2) {
            var75 = 64.0F / (model.aShortArray2888[var20] & 0xffff);
            var82 = 64.0F / (model.aShortArray2882[var20] & 0xffff);
            var79 = 64.0F / (model.aShortArray2851[var20] & 0xffff);
          } else {
            var75 = model.aShortArray2888[var20] / 1024.0F;
            var82 = model.aShortArray2882[var20] / 1024.0F;
            var79 = model.aShortArray2851[var20] / 1024.0F;
          }

          var65[var20] = GlModel.method1906(model.aShortArray2884[var20],
              model.aShortArray2846[var20],
              model.aShortArray2891[var20], model.aByteArray2845[var20] & 255,
              var75, var82, var79);
        }
      }
    }

    short var71;
    int var67;
    for (var68 = 0; var68 < this.anInt3852; ++var68) {
      int var70 = var5[var68];
      var67 = model.triangleColors[var70] & 0xffff;
      if (model.materials == null) {
        var71 = -1;
      } else {
        var71 = model.materials[var70];
      }

      int var72;
      if (model.aByteArray2866 == null) {
        var72 = -1;
      } else {
        var72 = model.aByteArray2866[var70];
      }

      int var74;
      if (model.aByteArray2843 == null) {
        var74 = 0;
      } else {
        var74 = model.aByteArray2843[var70] & 255;
      }

      float var73 = 0.0F;
      float var78 = 0.0F;
      float var77 = 0.0F;
      var75 = 0.0F;
      var82 = 0.0F;
      var79 = 0.0F;
      byte var81 = 0;
      byte var83 = 0;
      var27 = 0;
      byte var28;
      int var31;
      int var87;
      if (var71 != -1) {
        if (var72 == -1) {
          var73 = 0.0F;
          var78 = 1.0F;
          var77 = 1.0F;
          var75 = 1.0F;
          var81 = 1;
          var82 = 0.0F;
          var79 = 0.0F;
          var83 = 2;
        } else {
          var72 &= 255;
          var28 = model.aByteArray2857[var72];
          int var29;
          int var30;
          float var38;
          float var39;
          float var37;
          float var51;
          float var50;
          float var49;
          float var54;
          float var53;
          float var52;
          if (var28 == 0) {
            var29 = model.v0[var70];
            var30 = model.v1[var70];
            var31 = model.v2[var70];
            short var32 = model.aShortArray2884[var72];
            short var33 = model.aShortArray2846[var72];
            short var34 = model.aShortArray2891[var72];
            float var35 = model.vx[var32];
            float var36 = model.vy[var32];
            var37 = model.vz[var32];
            var38 = model.vx[var33] - var35;
            var39 = model.vy[var33] - var36;
            float var40 = model.vz[var33] - var37;
            float var41 = model.vx[var34] - var35;
            float var42 = model.vy[var34] - var36;
            float var43 = model.vz[var34] - var37;
            float var44 = model.vx[var29] - var35;
            float var45 = model.vy[var29] - var36;
            float var46 = model.vz[var29] - var37;
            float var47 = model.vx[var30] - var35;
            float var48 = model.vy[var30] - var36;
            var49 = model.vz[var30] - var37;
            var50 = model.vx[var31] - var35;
            var51 = model.vy[var31] - var36;
            var52 = model.vz[var31] - var37;
            var53 = var39 * var43 - var40 * var42;
            var54 = var40 * var41 - var38 * var43;
            float var55 = var38 * var42 - var39 * var41;
            float var56 = var42 * var55 - var43 * var54;
            float var57 = var43 * var53 - var41 * var55;
            float var58 = var41 * var54 - var42 * var53;
            float var59 =
                1.0F / (var56 * var38 + var57 * var39 + var58 * var40);
            var73 = (var56 * var44 + var57 * var45 + var58 * var46) * var59;
            var77 = (var56 * var47 + var57 * var48 + var58 * var49) * var59;
            var82 = (var56 * var50 + var57 * var51 + var58 * var52) * var59;
            var56 = var39 * var55 - var40 * var54;
            var57 = var40 * var53 - var38 * var55;
            var58 = var38 * var54 - var39 * var53;
            var59 = 1.0F / (var56 * var41 + var57 * var42 + var58 * var43);
            var78 = (var56 * var44 + var57 * var45 + var58 * var46) * var59;
            var75 = (var56 * var47 + var57 * var48 + var58 * var49) * var59;
            var79 = (var56 * var50 + var57 * var51 + var58 * var52) * var59;
          } else {
            var29 = model.v0[var70];
            var30 = model.v1[var70];
            var31 = model.v2[var70];
            int var88 = var63[var72];
            var87 = var61[var72];
            int var94 = var64[var72];
            float[] var93 = var65[var72];
            byte var90 = model.aByteArray2867[var72];
            var37 = model.aByteArray2877[var72] / 256.0F;
            if (var28 == 1) {
              var38 = (model.aShortArray2851[var72] & 0xffff) / 1024.0F;
              GlModel
                  .method1904(model.vx[var29], model.vy[var29], model.vz[var29],
                      var88, var87, var94,
                      var93, var38, var90, var37);
              var73 = GlModel.aFloat3863;
              var78 = GlModel.aFloat3866;
              GlModel
                  .method1904(model.vx[var30], model.vy[var30], model.vz[var30],
                      var88, var87, var94,
                      var93, var38, var90, var37);
              var77 = GlModel.aFloat3863;
              var75 = GlModel.aFloat3866;
              GlModel
                  .method1904(model.vx[var31], model.vy[var31], model.vz[var31],
                      var88, var87, var94,
                      var93, var38, var90, var37);
              var82 = GlModel.aFloat3863;
              var79 = GlModel.aFloat3866;
              var39 = var38 / 2.0F;
              if ((var90 & 1) == 0) {
                if (var77 - var73 > var39) {
                  var77 -= var38;
                  var81 = 1;
                } else if (var73 - var77 > var39) {
                  var77 += var38;
                  var81 = 2;
                }

                if (var82 - var73 > var39) {
                  var82 -= var38;
                  var83 = 1;
                } else if (var73 - var82 > var39) {
                  var82 += var38;
                  var83 = 2;
                }
              } else {
                if (var75 - var78 > var39) {
                  var75 -= var38;
                  var81 = 1;
                } else if (var78 - var75 > var39) {
                  var75 += var38;
                  var81 = 2;
                }

                if (var79 - var78 > var39) {
                  var79 -= var38;
                  var83 = 1;
                } else if (var78 - var79 > var39) {
                  var79 += var38;
                  var83 = 2;
                }
              }
            } else if (var28 == 2) {
              var38 = model.aByteArray2852[var72] / 256.0F;
              var39 = model.aByteArray2869[var72] / 256.0F;
              int var97 = model.vx[var30] - model.vx[var29];
              int var96 = model.vy[var30] - model.vy[var29];
              int var101 = model.vz[var30] - model.vz[var29];
              int var102 = model.vx[var31] - model.vx[var29];
              int var103 = model.vy[var31] - model.vy[var29];
              int var98 = model.vz[var31] - model.vz[var29];
              int var99 = var96 * var98 - var103 * var101;
              int var100 = var101 * var102 - var98 * var97;
              int var104 = var97 * var103 - var102 * var96;
              var49 = 64.0F / (model.aShortArray2888[var72] & 0xffff);
              var50 = 64.0F / (model.aShortArray2882[var72] & 0xffff);
              var51 = 64.0F / (model.aShortArray2851[var72] & 0xffff);
              var52 =
                  (var99 * var93[0] + var100 * var93[1] + var104 * var93[2])
                      / var49;
              var53 =
                  (var99 * var93[3] + var100 * var93[4] + var104 * var93[5])
                      / var50;
              var54 =
                  (var99 * var93[6] + var100 * var93[7] + var104 * var93[8])
                      / var51;
              var27 = GlModel.method1901(var52, var53, var54);
              GlModel
                  .method1913(model.vx[var29], model.vy[var29], model.vz[var29],
                      var88, var87, var94,
                      var27, var93, var90, var37, var38, var39);
              var73 = GlModel.aFloat3864;
              var78 = GlModel.aFloat3858;
              GlModel
                  .method1913(model.vx[var30], model.vy[var30], model.vz[var30],
                      var88, var87, var94,
                      var27, var93, var90, var37, var38, var39);
              var77 = GlModel.aFloat3864;
              var75 = GlModel.aFloat3858;
              GlModel
                  .method1913(model.vx[var31], model.vy[var31], model.vz[var31],
                      var88, var87, var94,
                      var27, var93, var90, var37, var38, var39);
              var82 = GlModel.aFloat3864;
              var79 = GlModel.aFloat3858;
            } else if (var28 == 3) {
              GlModel
                  .method1910(model.vx[var29], model.vy[var29], model.vz[var29],
                      var88, var87, var94,
                      var93, var90, var37);
              var73 = GlModel.aFloat3867;
              var78 = GlModel.aFloat3860;
              GlModel
                  .method1910(model.vx[var30], model.vy[var30], model.vz[var30],
                      var88, var87, var94,
                      var93, var90, var37);
              var77 = GlModel.aFloat3867;
              var75 = GlModel.aFloat3860;
              GlModel
                  .method1910(model.vx[var31], model.vy[var31], model.vz[var31],
                      var88, var87, var94,
                      var93, var90, var37);
              var82 = GlModel.aFloat3867;
              var79 = GlModel.aFloat3860;
              if ((var90 & 1) == 0) {
                if (var77 - var73 > 0.5F) {
                  --var77;
                  var81 = 1;
                } else if (var73 - var77 > 0.5F) {
                  ++var77;
                  var81 = 2;
                }

                if (var82 - var73 > 0.5F) {
                  --var82;
                  var83 = 1;
                } else if (var73 - var82 > 0.5F) {
                  ++var82;
                  var83 = 2;
                }
              } else {
                if (var75 - var78 > 0.5F) {
                  --var75;
                  var81 = 1;
                } else if (var78 - var75 > 0.5F) {
                  ++var75;
                  var81 = 2;
                }

                if (var79 - var78 > 0.5F) {
                  --var79;
                  var83 = 1;
                } else if (var78 - var79 > 0.5F) {
                  ++var79;
                  var83 = 2;
                }
              }
            }
          }
        }
      }

      model.updateNormals();
      if (model.normalTypes == null) {
        var28 = 0;
      } else {
        var28 = model.normalTypes[var70];
      }

      if (var28 == 0) {
        long var86 =
            (var72 << 2) + ((long) (var27 << 24) + (var67 << 8) + var74 << 32);
        var31 = model.v0[var70];
        VertexNormal var89 = model.vertexNormals[var31];
        this.v0[var68] =
            this.method1907(model, var31, var86, var89.x, var89.y, var89.z,
                var89.c, var73, var78);
        var87 = model.v1[var70];
        VertexNormal var95 = model.vertexNormals[var87];
        this.v1[var68] =
            this.method1907(model, var87, var86 + var81, var95.x, var95.y,
                var95.z, var95.c,
                var77, var75);
        int var92 = model.v2[var70];
        VertexNormal var91 = model.vertexNormals[var92];
        this.v2[var68] =
            this.method1907(model, var92, var86 + var83, var91.x, var91.y,
                var91.z, var91.c,
                var82, var79);
      } else if (var28 == 1) {
        FaceNormal var85 = model.faceNormals[var70];
        long var84 =
            ((var72 << 2) + (var85.x > 0 ? 1024 : 2048) + (var85.y + 256 << 12)
                + (
                var85.z + 256 << 22)) + (
                (long) (var27 << 24) + (var67 << 8) + var74
                    << 32);
        this.v0[var68] =
            this.method1907(model, model.v0[var70], var84, var85.x, var85.y,
                var85.z, 0, var73,
                var78);
        this.v1[var68] =
            this.method1907(model, model.v1[var70], var84 + var81, var85.x,
                var85.y, var85.z,
                0, var77, var75);
        this.v2[var68] =
            this.method1907(model, model.v2[var70], var84 + var83, var85.x,
                var85.y, var85.z,
                0, var82, var79);
      }

      if (model.materials != null) {
        this.materials[var68] = model.materials[var70];
      } else {
        this.materials[var68] = -1;
      }

      if (this.aByteArray3820 != null) {
        this.aByteArray3820[var68] = (byte) model.anIntArray2847[var70];
      }

      this.aShortArray3808[var68] = model.triangleColors[var70];
      if (model.aByteArray2843 != null) {
        this.aByteArray3816[var68] = model.aByteArray2843[var70];
      }

      if (model.aShortArray2855 != null) {
        this.aShortArray3813[var68] = model.aShortArray2855[var70];
      }
    }

    var68 = 0;
    short var66 = -10000;

    for (var67 = 0; var67 < this.anInt3852; ++var67) {
      var71 = this.materials[var67];
      if (var71 != var66) {
        ++var68;
        var66 = var71;
      }
    }

    this.offsets = new int[var68 + 1];
    var68 = 0;
    var66 = -10000;

    for (var67 = 0; var67 < this.anInt3852; ++var67) {
      var71 = this.materials[var67];
      if (var71 != var66) {
        this.offsets[var68++] = var67;
        var66 = var71;
      }
    }

    this.offsets[var68] = this.anInt3852;
    GlModel.aLongArray3821 = null;
    this.aShortArray3810 = GlModel.method1928(this.aShortArray3810,
        this.amountVertices);
    this.aShortArray3826 = GlModel.method1928(this.aShortArray3826,
        this.amountVertices);
    this.aShortArray3837 = GlModel.method1928(this.aShortArray3837,
        this.amountVertices);
    this.aShortArray3841 = GlModel.method1928(this.aShortArray3841,
        this.amountVertices);
    this.aFloatArray3824 = GlModel.method1921(this.aFloatArray3824,
        this.amountVertices);
    this.aFloatArray3847 = GlModel.method1921(this.aFloatArray3847,
        this.amountVertices);
  }

  public void method1902() {
    if (this.aShortArray3810 == null) {
      this.method1900();
    } else {
      int var1;
      for (var1 = 0; var1 < this.vertexCCC; ++var1) {
        int var2 = this.vz[var1];
        this.vz[var1] = this.vx[var1];
        this.vx[var1] = -var2;
      }

      for (var1 = 0; var1 < this.amountVertices; ++var1) {
        short var3 = this.aShortArray3837[var1];
        this.aShortArray3837[var1] = this.aShortArray3810[var1];
        this.aShortArray3810[var1] = (short) -var3;
      }

      this.aClass6_3835.aBoolean98 = false;
      this.vertexPositionData.updated = false;
      if (this.vertexNormalData != null) {
        this.vertexNormalData.updated = false;
      }

    }
  }

  public int method1903() {
    return this.aShort3849;
  }

  public int method1872() {
    if (!this.aClass6_3835.aBoolean98) {
      this.method1917();
    }

    return this.aClass6_3835.aShort96;
  }

  public int getMinimumY() {
    if (!this.aClass6_3835.aBoolean98) {
      this.method1917();
    }

    return this.aClass6_3835.aShort91;
  }

  public boolean method1873() {
    if (this.anIntArrayArray3825 == null) {
      return false;
    } else {
      for (int var1 = 0; var1 < this.vertexCCC; ++var1) {
        this.vx[var1] <<= 4;
        this.vy[var1] <<= 4;
        this.vz[var1] <<= 4;
      }

      GlModel.anInt3859 = 0;
      GlModel.anInt3865 = 0;
      GlModel.anInt3862 = 0;
      return true;
    }
  }

  public void method1874() {
    for (int var1 = 0; var1 < this.vertexCCC; ++var1) {
      this.vx[var1] = -this.vx[var1];
      this.vz[var1] = -this.vz[var1];
    }

    this.aClass6_3835.aBoolean98 = false;
    this.vertexPositionData.updated = false;
  }

  public void method1876(int var1) {
    int var2 = GLStatics.SINE_TABLE[var1];
    int var3 = DummyClass40.COSINE_TABLE[var1];

    for (int var4 = 0; var4 < this.vertexCCC; ++var4) {
      int var5 = this.vz[var4] * var2 + this.vx[var4] * var3 >> 16;
      this.vz[var4] = this.vz[var4] * var3 - this.vx[var4] * var2 >> 16;
      this.vx[var4] = var5;
    }

    this.aClass6_3835.aBoolean98 = false;
    this.vertexPositionData.updated = false;
  }

  public void method1879() {
    for (int var1 = 0; var1 < this.vertexCCC; ++var1) {
      this.vx[var1] = this.vx[var1] + 7 >> 4;
      this.vy[var1] = this.vy[var1] + 7 >> 4;
      this.vz[var1] = this.vz[var1] + 7 >> 4;
    }

    this.aClass6_3835.aBoolean98 = false;
    this.vertexPositionData.updated = false;
  }

  public void scale(int var1, int var2, int var3) {
    for (int var4 = 0; var4 < this.vertexCCC; ++var4) {
      this.vx[var4] = this.vx[var4] * var1 >> 7;
      this.vy[var4] = this.vy[var4] * var2 >> 7;
      this.vz[var4] = this.vz[var4] * var3 >> 7;
    }

    this.aClass6_3835.aBoolean98 = false;
    this.vertexPositionData.updated = false;
  }

  public AbstractModel method1882(boolean var1, boolean var2, boolean var3) {
    return this.method1923(var1, var2, var3, GlModel.aClass140_Sub1_Sub1_3854,
        GlModel.aClass140_Sub1_Sub1_3853);
  }

  public int method1883() {
    if (!this.aClass6_3835.aBoolean98) {
      this.method1917();
    }

    return this.aClass6_3835.aShort94;
  }

  public int method1884() {
    if (!this.aClass6_3835.aBoolean98) {
      this.method1917();
    }

    return this.aClass6_3835.aShort95;
  }

  public void rotateQuarterY() {
    for (int var1 = 0; var1 < this.vertexCCC; ++var1) {
      int var2 = this.vx[var1];
      this.vx[var1] = this.vz[var1];
      this.vz[var1] = -var2;
    }

    this.aClass6_3835.aBoolean98 = false;
    this.vertexPositionData.updated = false;
  }

  public void method1886(int var1) {
    int var2 = GLStatics.SINE_TABLE[var1];
    int var3 = DummyClass40.COSINE_TABLE[var1];

    for (int var4 = 0; var4 < this.vertexCCC; ++var4) {
      int var5 = this.vy[var4] * var2 + this.vx[var4] * var3 >> 16;
      this.vy[var4] = this.vy[var4] * var3 - this.vx[var4] * var2 >> 16;
      this.vx[var4] = var5;
    }

    this.aClass6_3835.aBoolean98 = false;
    this.vertexPositionData.updated = false;
  }

  public int method1888() {
    if (!this.aClass6_3835.aBoolean98) {
      this.method1917();
    }

    return this.aClass6_3835.aShort93;
  }

  public void method1889(int var1, int var2, int var3, int var4) {
    int var5;
    int var6;
    if (var1 == 0) {
      var5 = 0;
      GlModel.anInt3859 = 0;
      GlModel.anInt3865 = 0;
      GlModel.anInt3862 = 0;

      for (var6 = 0; var6 < this.vertexCCC; ++var6) {
        GlModel.anInt3859 += this.vx[var6];
        GlModel.anInt3865 += this.vy[var6];
        GlModel.anInt3862 += this.vz[var6];
        ++var5;
      }

      if (var5 > 0) {
        GlModel.anInt3859 = GlModel.anInt3859 / var5 + var2;
        GlModel.anInt3865 = GlModel.anInt3865 / var5 + var3;
        GlModel.anInt3862 = GlModel.anInt3862 / var5 + var4;
      } else {
        GlModel.anInt3859 = var2;
        GlModel.anInt3865 = var3;
        GlModel.anInt3862 = var4;
      }

    } else if (var1 == 1) {
      for (var5 = 0; var5 < this.vertexCCC; ++var5) {
        this.vx[var5] += var2;
        this.vy[var5] += var3;
        this.vz[var5] += var4;
      }

    } else {
      int var7;
      int var8;
      if (var1 == 2) {
        for (var5 = 0; var5 < this.vertexCCC; ++var5) {
          this.vx[var5] -= GlModel.anInt3859;
          this.vy[var5] -= GlModel.anInt3865;
          this.vz[var5] -= GlModel.anInt3862;
          if (var4 != 0) {
            var6 = GLStatics.SINE_TABLE[var4];
            var7 = DummyClass40.COSINE_TABLE[var4];
            var8 = this.vy[var5] * var6 + this.vx[var5] * var7 + 32767 >> 16;
            this.vy[var5] =
                this.vy[var5] * var7 - this.vx[var5] * var6 + 32767 >> 16;
            this.vx[var5] = var8;
          }

          if (var2 != 0) {
            var6 = GLStatics.SINE_TABLE[var2];
            var7 = DummyClass40.COSINE_TABLE[var2];
            var8 = this.vy[var5] * var7 - this.vz[var5] * var6 + 32767 >> 16;
            this.vz[var5] =
                this.vy[var5] * var6 + this.vz[var5] * var7 + 32767 >> 16;
            this.vy[var5] = var8;
          }

          if (var3 != 0) {
            var6 = GLStatics.SINE_TABLE[var3];
            var7 = DummyClass40.COSINE_TABLE[var3];
            var8 = this.vz[var5] * var6 + this.vx[var5] * var7 + 32767 >> 16;
            this.vz[var5] =
                this.vz[var5] * var7 - this.vx[var5] * var6 + 32767 >> 16;
            this.vx[var5] = var8;
          }

          this.vx[var5] += GlModel.anInt3859;
          this.vy[var5] += GlModel.anInt3865;
          this.vz[var5] += GlModel.anInt3862;
        }

      } else if (var1 != 3) {
        if (var1 == 5) {
          for (var5 = 0; var5 < this.anInt3852; ++var5) {
            var6 = (this.aByteArray3816[var5] & 255) + var2 * 8;
            if (var6 < 0) {
              var6 = 0;
            } else if (var6 > 255) {
              var6 = 255;
            }

            this.aByteArray3816[var5] = (byte) var6;
          }

          this.vertexColorData.updated = false;
        } else if (var1 == 7) {
          for (var5 = 0; var5 < this.anInt3852; ++var5) {
            var6 = this.aShortArray3808[var5] & 0xffff;
            var7 = var6 >> 10 & 63;
            var8 = var6 >> 7 & 7;
            int var9 = var6 & 127;
            var7 = var7 + var2 & 63;
            var8 += var3 / 4;
            if (var8 < 0) {
              var8 = 0;
            } else if (var8 > 7) {
              var8 = 7;
            }

            var9 += var4;
            if (var9 < 0) {
              var9 = 0;
            } else if (var9 > 127) {
              var9 = 127;
            }

            this.aShortArray3808[var5] = (short) (var7 << 10 | var8 << 7
                | var9);
          }

          this.vertexColorData.updated = false;
        }
      } else {
        for (var5 = 0; var5 < this.vertexCCC; ++var5) {
          this.vx[var5] -= GlModel.anInt3859;
          this.vy[var5] -= GlModel.anInt3865;
          this.vz[var5] -= GlModel.anInt3862;
          this.vx[var5] = this.vx[var5] * var2 / 128;
          this.vy[var5] = this.vy[var5] * var3 / 128;
          this.vz[var5] = this.vz[var5] * var4 / 128;
          this.vx[var5] += GlModel.anInt3859;
          this.vy[var5] += GlModel.anInt3865;
          this.vz[var5] += GlModel.anInt3862;
        }

      }
    }
  }

  public AbstractModel method1890(boolean var1, boolean var2, boolean var3) {
    return this.method1923(var1, var2, var3, GlModel.aClass140_Sub1_Sub1_3856,
        GlModel.aClass140_Sub1_Sub1_3855);
  }

  public void method1891(int var1, int[] var2, int var3, int var4, int var5,
      boolean var6) {
    int var7 = var2.length;
    int var8;
    int var9;
    int var12;
    int var13;
    if (var1 == 0) {
      var3 <<= 4;
      var4 <<= 4;
      var5 <<= 4;
      var8 = 0;
      GlModel.anInt3859 = 0;
      GlModel.anInt3865 = 0;
      GlModel.anInt3862 = 0;

      for (var9 = 0; var9 < var7; ++var9) {
        int var20 = var2[var9];
        if (var20 < this.anIntArrayArray3825.length) {
          int[] var21 = this.anIntArrayArray3825[var20];

          for (var12 = 0; var12 < var21.length; ++var12) {
            var13 = var21[var12];
            GlModel.anInt3859 += this.vx[var13];
            GlModel.anInt3865 += this.vy[var13];
            GlModel.anInt3862 += this.vz[var13];
            ++var8;
          }
        }
      }

      if (var8 > 0) {
        GlModel.anInt3859 = GlModel.anInt3859 / var8 + var3;
        GlModel.anInt3865 = GlModel.anInt3865 / var8 + var4;
        GlModel.anInt3862 = GlModel.anInt3862 / var8 + var5;
      } else {
        GlModel.anInt3859 = var3;
        GlModel.anInt3865 = var4;
        GlModel.anInt3862 = var5;
      }

    } else {
      int[] var10;
      int var11;
      if (var1 == 1) {
        var3 <<= 4;
        var4 <<= 4;
        var5 <<= 4;

        for (var8 = 0; var8 < var7; ++var8) {
          var9 = var2[var8];
          if (var9 < this.anIntArrayArray3825.length) {
            var10 = this.anIntArrayArray3825[var9];

            for (var11 = 0; var11 < var10.length; ++var11) {
              var12 = var10[var11];
              this.vx[var12] += var3;
              this.vy[var12] += var4;
              this.vz[var12] += var5;
            }
          }
        }

      } else {
        int var14;
        int var15;
        int var16;
        if (var1 == 2) {
          for (var8 = 0; var8 < var7; ++var8) {
            var9 = var2[var8];
            if (var9 < this.anIntArrayArray3825.length) {
              var10 = this.anIntArrayArray3825[var9];

              for (var11 = 0; var11 < var10.length; ++var11) {
                var12 = var10[var11];
                this.vx[var12] -= GlModel.anInt3859;
                this.vy[var12] -= GlModel.anInt3865;
                this.vz[var12] -= GlModel.anInt3862;
                if (var5 != 0) {
                  var13 = GLStatics.SINE_TABLE[var5];
                  var14 = DummyClass40.COSINE_TABLE[var5];
                  var15 =
                      this.vy[var12] * var13 + this.vx[var12] * var14 + 32767
                          >> 16;
                  this.vy[var12] =
                      this.vy[var12] * var14 - this.vx[var12] * var13 + 32767
                          >> 16;
                  this.vx[var12] = var15;
                }

                if (var3 != 0) {
                  var13 = GLStatics.SINE_TABLE[var3];
                  var14 = DummyClass40.COSINE_TABLE[var3];
                  var15 =
                      this.vy[var12] * var14 - this.vz[var12] * var13 + 32767
                          >> 16;
                  this.vz[var12] =
                      this.vy[var12] * var13 + this.vz[var12] * var14 + 32767
                          >> 16;
                  this.vy[var12] = var15;
                }

                if (var4 != 0) {
                  var13 = GLStatics.SINE_TABLE[var4];
                  var14 = DummyClass40.COSINE_TABLE[var4];
                  var15 =
                      this.vz[var12] * var13 + this.vx[var12] * var14 + 32767
                          >> 16;
                  this.vz[var12] =
                      this.vz[var12] * var14 - this.vx[var12] * var13 + 32767
                          >> 16;
                  this.vx[var12] = var15;
                }

                this.vx[var12] += GlModel.anInt3859;
                this.vy[var12] += GlModel.anInt3865;
                this.vz[var12] += GlModel.anInt3862;
              }
            }
          }

          if (var6 && this.aShortArray3810 != null) {
            for (var8 = 0; var8 < var7; ++var8) {
              var9 = var2[var8];
              if (var9 < this.anIntArrayArray3825.length) {
                var10 = this.anIntArrayArray3825[var9];

                for (var11 = 0; var11 < var10.length; ++var11) {
                  var12 = var10[var11];
                  var13 = this.vertexCounts[var12];
                  var14 = this.vertexCounts[var12 + 1];

                  for (var15 = var13; var15 < var14; ++var15) {
                    var16 = this.aShortArray3828[var15] - 1;
                    if (var16 == -1) {
                      break;
                    }

                    int var17;
                    int var19;
                    int var18;
                    if (var5 != 0) {
                      var17 = GLStatics.SINE_TABLE[var5];
                      var18 = DummyClass40.COSINE_TABLE[var5];
                      var19 =
                          this.aShortArray3826[var16] * var17
                              + this.aShortArray3810[var16] * var18
                              + 32767 >> 16;
                      this.aShortArray3826[var16] = (short) (
                          this.aShortArray3826[var16] * var18
                              - this.aShortArray3810[var16] * var17
                              + 32767 >> 16);
                      this.aShortArray3810[var16] = (short) var19;
                    }

                    if (var3 != 0) {
                      var17 = GLStatics.SINE_TABLE[var3];
                      var18 = DummyClass40.COSINE_TABLE[var3];
                      var19 =
                          this.aShortArray3826[var16] * var18
                              - this.aShortArray3837[var16] * var17
                              + 32767 >> 16;
                      this.aShortArray3837[var16] = (short) (
                          this.aShortArray3826[var16] * var17
                              + this.aShortArray3837[var16] * var18
                              + 32767 >> 16);
                      this.aShortArray3826[var16] = (short) var19;
                    }

                    if (var4 != 0) {
                      var17 = GLStatics.SINE_TABLE[var4];
                      var18 = DummyClass40.COSINE_TABLE[var4];
                      var19 =
                          this.aShortArray3837[var16] * var17
                              + this.aShortArray3810[var16] * var18
                              + 32767 >> 16;
                      this.aShortArray3837[var16] = (short) (
                          this.aShortArray3837[var16] * var18
                              - this.aShortArray3810[var16] * var17
                              + 32767 >> 16);
                      this.aShortArray3810[var16] = (short) var19;
                    }
                  }
                }
              }
            }

            if (this.vertexNormalData != null) {
              this.vertexNormalData.updated = false;
            }
          }

        } else if (var1 == 3) {
          for (var8 = 0; var8 < var7; ++var8) {
            var9 = var2[var8];
            if (var9 < this.anIntArrayArray3825.length) {
              var10 = this.anIntArrayArray3825[var9];

              for (var11 = 0; var11 < var10.length; ++var11) {
                var12 = var10[var11];
                this.vx[var12] -= GlModel.anInt3859;
                this.vy[var12] -= GlModel.anInt3865;
                this.vz[var12] -= GlModel.anInt3862;
                this.vx[var12] = this.vx[var12] * var3 >> 7;
                this.vy[var12] = this.vy[var12] * var4 >> 7;
                this.vz[var12] = this.vz[var12] * var5 >> 7;
                this.vx[var12] += GlModel.anInt3859;
                this.vy[var12] += GlModel.anInt3865;
                this.vz[var12] += GlModel.anInt3862;
              }
            }
          }

        } else if (var1 == 5) {
          if (this.anIntArrayArray3829 != null && this.aByteArray3816 != null) {
            for (var8 = 0; var8 < var7; ++var8) {
              var9 = var2[var8];
              if (var9 < this.anIntArrayArray3829.length) {
                var10 = this.anIntArrayArray3829[var9];

                for (var11 = 0; var11 < var10.length; ++var11) {
                  var12 = var10[var11];
                  var13 = (this.aByteArray3816[var12] & 255) + var3 * 8;
                  if (var13 < 0) {
                    var13 = 0;
                  } else if (var13 > 255) {
                    var13 = 255;
                  }

                  this.aByteArray3816[var12] = (byte) var13;
                }

                if (var10.length > 0) {
                  this.vertexColorData.updated = false;
                }
              }
            }
          }

        } else if (var1 == 7) {
          if (this.anIntArrayArray3829 != null) {
            for (var8 = 0; var8 < var7; ++var8) {
              var9 = var2[var8];
              if (var9 < this.anIntArrayArray3829.length) {
                var10 = this.anIntArrayArray3829[var9];

                for (var11 = 0; var11 < var10.length; ++var11) {
                  var12 = var10[var11];
                  var13 = this.aShortArray3808[var12] & 0xffff;
                  var14 = var13 >> 10 & 63;
                  var15 = var13 >> 7 & 7;
                  var16 = var13 & 127;
                  var14 = var14 + var3 & 63;
                  var15 += var4 / 4;
                  if (var15 < 0) {
                    var15 = 0;
                  } else if (var15 > 7) {
                    var15 = 7;
                  }

                  var16 += var5;
                  if (var16 < 0) {
                    var16 = 0;
                  } else if (var16 > 127) {
                    var16 = 127;
                  }

                  this.aShortArray3808[var12] = (short) (var14 << 10
                      | var15 << 7 | var16);
                }

                if (var10.length > 0) {
                  this.vertexColorData.updated = false;
                }
              }
            }
          }

        }
      }
    }
  }

  public void draw(int rotationX, int rotationY, int rotationZ, int rotationX1,
      int translateX,
      int translateY,
      int translateZ,
      long var8) {
    if (this.amountVertices != 0) {
      GlRenderer.GL.glPushMatrix();
      if (rotationX1 != 0) {
        GlRenderer.GL.glRotatef(rotationX1 * 0.17578125F, 1.0F, 0.0F, 0.0F);
      }

      GlRenderer.GL.glTranslatef(translateX, translateY, translateZ);
      if (rotationY != 0) {
        GlRenderer.GL.glRotatef(rotationY * 0.17578125F, 0.0F, 1.0F, 0.0F);
      }

      if (rotationX != 0) {
        GlRenderer.GL.glRotatef(rotationX * 0.17578125F, 1.0F, 0.0F, 0.0F);
      }

      if (rotationZ != 0) {
        GlRenderer.GL.glRotatef(-rotationZ * 0.17578125F, 0.0F, 0.0F, 1.0F);
      }

      this.draw();
      GlRenderer.GL.glPopMatrix();
    }
  }

  public AbstractModel method1894(boolean var1, boolean var2, boolean var3) {
    return this.method1923(var1, var2, var3, GlModel.aClass140_Sub1_Sub1_3850,
        GlModel.aClass140_Sub1_Sub1_3842);
  }

  public void method1896(int var1) {
    int var2 = GLStatics.SINE_TABLE[var1];
    int var3 = DummyClass40.COSINE_TABLE[var1];

    for (int var4 = 0; var4 < this.vertexCCC; ++var4) {
      int var5 = this.vy[var4] * var3 - this.vz[var4] * var2 >> 16;
      this.vz[var4] = this.vy[var4] * var2 + this.vz[var4] * var3 >> 16;
      this.vy[var4] = var5;
    }

    this.aClass6_3835.aBoolean98 = false;
    this.vertexPositionData.updated = false;
  }

  public void method1897(int var1, int var2, int var3) {
    for (int var4 = 0; var4 < this.vertexCCC; ++var4) {
      this.vx[var4] += var1;
      this.vy[var4] += var2;
      this.vz[var4] += var3;
    }

    this.aClass6_3835.aBoolean98 = false;
    this.vertexPositionData.updated = false;
  }

  public int method1898() {
    if (!this.aClass6_3835.aBoolean98) {
      this.method1917();
    }

    return this.aClass6_3835.aShort97;
  }

  public void draw(int rotationY, int var2, int var3, int var4, int var5,
      int translateX,
      int translateY,
      int translateZ,
      long key,
      int var11,
      DummyClass0 var12) {
    if (this.amountVertices != 0) {
      if (!this.aClass6_3835.aBoolean98) {
        this.method1917();
      }

      short var13 = this.aClass6_3835.aShort93;
      short var14 = this.aClass6_3835.aShort91;
      short var15 = this.aClass6_3835.aShort92;
      int var16 = translateZ * var5 - translateX * var4 >> 16;
      int var17 = translateY * var2 + var16 * var3 >> 16;
      int depth = var17 + (var13 * var3 + var15 * var2 >> 16);
      if (depth > GlobalStatics_6.NEAR) {
        int var19 = var17 + (-var13 * var3 + var14 * var2 >> 16);
        if (var19 < GlobalStatics_6.FAR) {
          int var20 = translateZ * var4 + translateX * var5 >> 16;
          int var21 = var20 + var13 << 9;
          if (var21 / depth > DummyClass17.screenLowerX) {
            int var22 = var20 - var13 << 9;
            if (var22 / depth < GlobalStatics_10.screenUpperX) {
              int var23 = translateY * var3 - var16 * var2 >> 16;
              int var24 = var23 + (var13 * var2 + var15 * var3 >> 16) << 9;
              if (var24 / depth > DummyClass3.screenUpperY) {
                int var25 = var23 + (-var13 * var2 + var14 * var3 >> 16) << 9;
                if (var25 / depth < GLStatics.screenLowerY) {
                  int var26 = 0;
                  int var27 = 0;
                  if (rotationY != 0) {
                    var26 = GLStatics.SINE_TABLE[rotationY];
                    var27 = DummyClass40.COSINE_TABLE[rotationY];
                  }

                  if (key > 0L && GlobalStatics_10.aBoolean3094 && var19 > 0) {
                    int var28;
                    int var30;
                    if (var20 > 0) {
                      var28 = var22 / depth;
                      var30 = var21 / var19;
                    } else {
                      var28 = var22 / var19;
                      var30 = var21 / depth;
                    }

                    int var29;
                    int var31;
                    if (var23 > 0) {
                      var29 = var25 / depth;
                      var31 = var24 / var19;
                    } else {
                      var29 = var25 / var19;
                      var31 = var24 / depth;
                    }

                    if (GlobalStatics_9.anInt3642 >= var28
                        && GlobalStatics_9.anInt3642 <= var30
                        && GlobalStatics_9.anInt384 >= var29
                        && GlobalStatics_9.anInt384 <= var31) {
                      var28 = 999999;
                      var30 = -999999;
                      var29 = 999999;
                      var31 = -999999;
                      short var32 = this.aClass6_3835.aShort95;
                      short var33 = this.aClass6_3835.aShort94;
                      short var34 = this.aClass6_3835.aShort97;
                      short var35 = this.aClass6_3835.aShort96;
                      int[] var36 =
                          {var32, var33, var32, var33, var32, var33, var32,
                              var33};
                      int[] var37 =
                          {var34, var34, var35, var35, var34, var34, var35,
                              var35};
                      int[] var38 =
                          {var14, var14, var14, var14, var15, var15, var15,
                              var15};

                      int var39;
                      int tz;
                      int var43;
                      int var40;
                      int var41;
                      int screenX;
                      int screenY;
                      for (var39 = 0; var39 < 8; ++var39) {
                        var40 = var36[var39];
                        var41 = var38[var39];
                        tz = var37[var39];
                        if (rotationY != 0) {
                          var43 = tz * var26 + var40 * var27 >> 16;
                          tz = tz * var27 - var40 * var26 >> 16;
                          var40 = var43;
                        }

                        var40 += translateX;
                        var41 += translateY;
                        tz += translateZ;
                        var43 = tz * var4 + var40 * var5 >> 16;
                        tz = tz * var5 - var40 * var4 >> 16;
                        var40 = var43;
                        var43 = var41 * var3 - tz * var2 >> 16;
                        tz = var41 * var2 + tz * var3 >> 16;
                        if (tz > 0) {
                          screenX = (var40 << 9) / tz;
                          screenY = (var43 << 9) / tz;
                          if (screenX < var28) {
                            var28 = screenX;
                          }

                          if (screenX > var30) {
                            var30 = screenX;
                          }

                          if (screenY < var29) {
                            var29 = screenY;
                          }

                          if (screenY > var31) {
                            var31 = screenY;
                          }
                        }
                      }

                      if (GlobalStatics_9.anInt3642 >= var28
                          && GlobalStatics_9.anInt3642 <= var30
                          && GlobalStatics_9.anInt384 >= var29
                          && GlobalStatics_9.anInt384 <= var31) {
                        if (this.aBoolean2699) {
                          GlobalStatics_10.entityKeys[GlobalStatics_9.anInt59++] = key;
                        } else {
                          if (GlModel.screenCoordinatesX.length
                              < this.amountVertices) {
                            GlModel.screenCoordinatesX = new int[this.amountVertices];
                            GlModel.screenCoordinatesY = new int[this.amountVertices];
                          }

                          var39 = 0;

                          label118:
                          while (true) {
                            if (var39 >= this.vertexCCC) {
                              var39 = 0;

                              while (true) {
                                if (var39 >= this.anInt3852) {
                                  break label118;
                                }

                                short var53 = this.v0[var39];
                                short var52 = this.v1[var39];
                                short var51 = this.v2[var39];
                                if (this.isWithinBoundaries(
                                    GlobalStatics_9.anInt3642,
                                    GlobalStatics_9.anInt384,
                                    GlModel.screenCoordinatesY[var53],
                                    GlModel.screenCoordinatesY[var52],
                                    GlModel.screenCoordinatesY[var51],
                                    GlModel.screenCoordinatesX[var53],
                                    GlModel.screenCoordinatesX[var52],
                                    GlModel.screenCoordinatesX[var51])) {
                                  GlobalStatics_10.entityKeys[GlobalStatics_9.anInt59++] = key;
                                  break label118;
                                }

                                ++var39;
                              }
                            }

                            var40 = this.vx[var39];
                            var41 = this.vy[var39];
                            tz = this.vz[var39];
                            if (rotationY != 0) {
                              var43 = tz * var26 + var40 * var27 >> 16;
                              tz = tz * var27 - var40 * var26 >> 16;
                              var40 = var43;
                            }

                            var40 += translateX;
                            var41 += translateY;
                            tz += translateZ;
                            var43 = tz * var4 + var40 * var5 >> 16;
                            tz = tz * var5 - var40 * var4 >> 16;
                            var40 = var43;
                            var43 = var41 * var3 - tz * var2 >> 16;
                            tz = var41 * var2 + tz * var3 >> 16;
                            if (tz < GlobalStatics_6.NEAR) {
                              break;
                            }

                            screenX = (var40 << 9) / tz;
                            screenY = (var43 << 9) / tz;
                            int var46 = this.vertexCounts[var39];
                            int var47 = this.vertexCounts[var39 + 1];

                            for (int var48 = var46; var48 < var47; ++var48) {
                              int var49 = this.aShortArray3828[var48] - 1;
                              if (var49 == -1) {
                                break;
                              }

                              GlModel.screenCoordinatesX[var49] = screenX;
                              GlModel.screenCoordinatesY[var49] = screenY;
                            }

                            ++var39;
                          }
                        }
                      }
                    }
                  }

                  GlRenderer.GL.glPushMatrix();
                  GlRenderer.GL
                      .glTranslatef(translateX, translateY, translateZ);
                  GlRenderer.GL
                      .glRotatef(rotationY * 0.17578125F, 0.0F, 1.0F, 0.0F);
                  this.draw();
                  GlRenderer.GL
                      .glRotatef(-rotationY * 0.17578125F, 0.0F, 1.0F, 0.0F);
                  GlRenderer.GL.glTranslatef(-translateX, -translateY,
                      -translateZ);
                  GlRenderer.GL.glPopMatrix();
                }
              }
            }
          }
        }
      }
    }
  }

  public void applyAnimationFrame(int opcode, int[] var2, int var3, int var4,
      int var5,
      boolean var6,
      int var7,
      int[] var8) {
    int var9 = var2.length;
    int var10;
    int var11;
    int var14;
    int var15;
    int var47;
    if (opcode == 0) {
      var3 <<= 4;
      var4 <<= 4;
      var5 <<= 4;
      var10 = 0;
      GlModel.anInt3859 = 0;
      GlModel.anInt3865 = 0;
      GlModel.anInt3862 = 0;

      for (var11 = 0; var11 < var9; ++var11) {
        var47 = var2[var11];
        if (var47 < this.anIntArrayArray3825.length) {
          int[] var48 = this.anIntArrayArray3825[var47];

          for (var14 = 0; var14 < var48.length; ++var14) {
            var15 = var48[var14];
            if (this.aShortArray3832 == null
                || (var7 & this.aShortArray3832[var15]) != 0) {
              GlModel.anInt3859 += this.vx[var15];
              GlModel.anInt3865 += this.vy[var15];
              GlModel.anInt3862 += this.vz[var15];
              ++var10;
            }
          }
        }
      }

      if (var10 > 0) {
        GlModel.anInt3859 = GlModel.anInt3859 / var10 + var3;
        GlModel.anInt3865 = GlModel.anInt3865 / var10 + var4;
        GlModel.anInt3862 = GlModel.anInt3862 / var10 + var5;
        GlModel.aBoolean3868 = true;
      } else {
        GlModel.anInt3859 = var3;
        GlModel.anInt3865 = var4;
        GlModel.anInt3862 = var5;
      }

    } else {
      int[] var12;
      int var13;
      if (opcode == 1) {
        if (var8 != null) {
          var10 =
              var8[0] * var3 + var8[1] * var4 + var8[2] * var5 + 16384 >> 15;
          var11 =
              var8[3] * var3 + var8[4] * var4 + var8[5] * var5 + 16384 >> 15;
          var47 =
              var8[6] * var3 + var8[7] * var4 + var8[8] * var5 + 16384 >> 15;
          var3 = var10;
          var4 = var11;
          var5 = var47;
        }

        var3 <<= 4;
        var4 <<= 4;
        var5 <<= 4;

        for (var10 = 0; var10 < var9; ++var10) {
          var11 = var2[var10];
          if (var11 < this.anIntArrayArray3825.length) {
            var12 = this.anIntArrayArray3825[var11];

            for (var13 = 0; var13 < var12.length; ++var13) {
              var14 = var12[var13];
              if (this.aShortArray3832 == null
                  || (var7 & this.aShortArray3832[var14]) != 0) {
                this.vx[var14] += var3;
                this.vy[var14] += var4;
                this.vz[var14] += var5;
              }
            }
          }
        }

      } else {
        int var17;
        int var16;
        int var19;
        int var18;
        int var21;
        int var20;
        int var23;
        int var22;
        int var24;
        int var27;
        int var26;
        int var28;
        int var30;
        int var34;
        int[] var35;
        int var32;
        int var33;
        int var38;
        int var39;
        int var36;
        int var37;
        int var40;
        if (opcode == 2) {
          if (var8 != null) {
            var10 = var8[9] << 4;
            var11 = var8[10] << 4;
            var47 = var8[11] << 4;
            var13 = var8[12] << 4;
            var14 = var8[13] << 4;
            var15 = var8[14] << 4;
            if (GlModel.aBoolean3868) {
              var16 = var8[0] * GlModel.anInt3859 + var8[3] * GlModel.anInt3865
                  + var8[6] * GlModel.anInt3862
                  + 16384 >> 15;
              var17 = var8[1] * GlModel.anInt3859 + var8[4] * GlModel.anInt3865
                  + var8[7] * GlModel.anInt3862
                  + 16384 >> 15;
              var18 = var8[2] * GlModel.anInt3859 + var8[5] * GlModel.anInt3865
                  + var8[8] * GlModel.anInt3862
                  + 16384 >> 15;
              var16 += var13;
              var17 += var14;
              var18 += var15;
              GlModel.anInt3859 = var16;
              GlModel.anInt3865 = var17;
              GlModel.anInt3862 = var18;
              GlModel.aBoolean3868 = false;
            }

            int[] var49 = new int[9];
            var17 = DummyClass40.COSINE_TABLE[var3] >> 1;
            var18 = GLStatics.SINE_TABLE[var3] >> 1;
            var19 = DummyClass40.COSINE_TABLE[var4] >> 1;
            var20 = GLStatics.SINE_TABLE[var4] >> 1;
            var21 = DummyClass40.COSINE_TABLE[var5] >> 1;
            var22 = GLStatics.SINE_TABLE[var5] >> 1;
            var23 = var18 * var21 + 16384 >> 15;
            var24 = var18 * var22 + 16384 >> 15;
            var49[0] = var19 * var21 + var20 * var24 + 16384 >> 15;
            var49[1] = -var19 * var22 + var20 * var23 + 16384 >> 15;
            var49[2] = var20 * var17 + 16384 >> 15;
            var49[3] = var17 * var22 + 16384 >> 15;
            var49[4] = var17 * var21 + 16384 >> 15;
            var49[5] = -var18;
            var49[6] = -var20 * var21 + var19 * var24 + 16384 >> 15;
            var49[7] = var20 * var22 + var19 * var23 + 16384 >> 15;
            var49[8] = var19 * var17 + 16384 >> 15;
            int var50 =
                var49[0] * -GlModel.anInt3859
                    + var49[1] * -GlModel.anInt3865
                    + var49[2] * -GlModel.anInt3862
                    + 16384 >> 15;
            var26 =
                var49[3] * -GlModel.anInt3859
                    + var49[4] * -GlModel.anInt3865
                    + var49[5] * -GlModel.anInt3862
                    + 16384 >> 15;
            var27 =
                var49[6] * -GlModel.anInt3859
                    + var49[7] * -GlModel.anInt3865
                    + var49[8] * -GlModel.anInt3862
                    + 16384 >> 15;
            var28 = var50 + GlModel.anInt3859;
            int var51 = var26 + GlModel.anInt3865;
            var30 = var27 + GlModel.anInt3862;
            int[] var52 = new int[9];

            for (var32 = 0; var32 < 3; ++var32) {
              for (var33 = 0; var33 < 3; ++var33) {
                var34 = 0;

                for (int var53 = 0; var53 < 3; ++var53) {
                  var34 += var49[var32 * 3 + var53] * var8[var33 * 3 + var53];
                }

                var52[var32 * 3 + var33] = var34 + 16384 >> 15;
              }
            }

            var32 =
                var49[0] * var13 + var49[1] * var14 + var49[2] * var15 + 16384
                    >> 15;
            var33 =
                var49[3] * var13 + var49[4] * var14 + var49[5] * var15 + 16384
                    >> 15;
            var34 =
                var49[6] * var13 + var49[7] * var14 + var49[8] * var15 + 16384
                    >> 15;
            var32 += var28;
            var33 += var51;
            var34 += var30;
            var35 = new int[9];

            for (var36 = 0; var36 < 3; ++var36) {
              for (var37 = 0; var37 < 3; ++var37) {
                var38 = 0;

                for (var39 = 0; var39 < 3; ++var39) {
                  var38 += var8[var36 * 3 + var39] * var52[var37 + var39 * 3];
                }

                var35[var36 * 3 + var37] = var38 + 16384 >> 15;
              }
            }

            var36 = var8[0] * var32 + var8[1] * var33 + var8[2] * var34 + 16384
                >> 15;
            var37 = var8[3] * var32 + var8[4] * var33 + var8[5] * var34 + 16384
                >> 15;
            var38 = var8[6] * var32 + var8[7] * var33 + var8[8] * var34 + 16384
                >> 15;
            var36 += var10;
            var37 += var11;
            var38 += var47;

            for (var39 = 0; var39 < var9; ++var39) {
              var40 = var2[var39];
              if (var40 < this.anIntArrayArray3825.length) {
                int[] var41 = this.anIntArrayArray3825[var40];

                for (int var43 : var41) {
                  if (this.aShortArray3832
                      == null || (var7 & this.aShortArray3832[var43]) != 0) {
                    int var44 =
                        var35[0] * this.vx[var43] + var35[1] * this.vy[var43]
                            + var35[2] * this.vz[var43] + 16384 >> 15;
                    int var45 =
                        var35[3] * this.vx[var43] + var35[4] * this.vy[var43]
                            + var35[5] * this.vz[var43] + 16384 >> 15;
                    int var46 =
                        var35[6] * this.vx[var43] + var35[7] * this.vy[var43]
                            + var35[8] * this.vz[var43] + 16384 >> 15;
                    var44 += var36;
                    var45 += var37;
                    var46 += var38;
                    this.vx[var43] = var44;
                    this.vy[var43] = var45;
                    this.vz[var43] = var46;
                  }
                }
              }
            }
          } else {
            for (var10 = 0; var10 < var9; ++var10) {
              var11 = var2[var10];
              if (var11 < this.anIntArrayArray3825.length) {
                var12 = this.anIntArrayArray3825[var11];

                for (var13 = 0; var13 < var12.length; ++var13) {
                  var14 = var12[var13];
                  if (this.aShortArray3832
                      == null || (var7 & this.aShortArray3832[var14]) != 0) {
                    this.vx[var14] -= GlModel.anInt3859;
                    this.vy[var14] -= GlModel.anInt3865;
                    this.vz[var14] -= GlModel.anInt3862;
                    if (var5 != 0) {
                      var15 = GLStatics.SINE_TABLE[var5];
                      var16 = DummyClass40.COSINE_TABLE[var5];
                      var17 = this.vy[var14] * var15 + this.vx[var14] * var16
                          + 32767 >> 16;
                      this.vy[var14] =
                          this.vy[var14] * var16 - this.vx[var14] * var15
                              + 32767 >> 16;
                      this.vx[var14] = var17;
                    }

                    if (var3 != 0) {
                      var15 = GLStatics.SINE_TABLE[var3];
                      var16 = DummyClass40.COSINE_TABLE[var3];
                      var17 = this.vy[var14] * var16 - this.vz[var14] * var15
                          + 32767 >> 16;
                      this.vz[var14] =
                          this.vy[var14] * var15 + this.vz[var14] * var16
                              + 32767 >> 16;
                      this.vy[var14] = var17;
                    }

                    if (var4 != 0) {
                      var15 = GLStatics.SINE_TABLE[var4];
                      var16 = DummyClass40.COSINE_TABLE[var4];
                      var17 = this.vz[var14] * var15 + this.vx[var14] * var16
                          + 32767 >> 16;
                      this.vz[var14] =
                          this.vz[var14] * var16 - this.vx[var14] * var15
                              + 32767 >> 16;
                      this.vx[var14] = var17;
                    }

                    this.vx[var14] += GlModel.anInt3859;
                    this.vy[var14] += GlModel.anInt3865;
                    this.vz[var14] += GlModel.anInt3862;
                  }
                }
              }
            }

            if (var6 && this.aShortArray3810 != null) {
              for (var10 = 0; var10 < var9; ++var10) {
                var11 = var2[var10];
                if (var11 < this.anIntArrayArray3825.length) {
                  var12 = this.anIntArrayArray3825[var11];

                  for (var13 = 0; var13 < var12.length; ++var13) {
                    var14 = var12[var13];
                    if (this.aShortArray3832
                        == null || (var7 & this.aShortArray3832[var14]) != 0) {
                      var15 = this.vertexCounts[var14];
                      var16 = this.vertexCounts[var14 + 1];

                      for (var17 = var15; var17 < var16; ++var17) {
                        var18 = this.aShortArray3828[var17] - 1;
                        if (var18 == -1) {
                          break;
                        }

                        if (var5 != 0) {
                          var19 = GLStatics.SINE_TABLE[var5];
                          var20 = DummyClass40.COSINE_TABLE[var5];
                          var21 = this.aShortArray3826[var18] * var19
                              + this.aShortArray3810[var18] * var20 + 32767
                              >> 16;
                          this.aShortArray3826[var18] = (short) (
                              this.aShortArray3826[var18] * var20
                                  - this.aShortArray3810[var18] * var19 + 32767
                                  >> 16);
                          this.aShortArray3810[var18] = (short) var21;
                        }

                        if (var3 != 0) {
                          var19 = GLStatics.SINE_TABLE[var3];
                          var20 = DummyClass40.COSINE_TABLE[var3];
                          var21 = this.aShortArray3826[var18] * var20
                              - this.aShortArray3837[var18] * var19 + 32767
                              >> 16;
                          this.aShortArray3837[var18] = (short) (
                              this.aShortArray3826[var18] * var19
                                  + this.aShortArray3837[var18] * var20 + 32767
                                  >> 16);
                          this.aShortArray3826[var18] = (short) var21;
                        }

                        if (var4 != 0) {
                          var19 = GLStatics.SINE_TABLE[var4];
                          var20 = DummyClass40.COSINE_TABLE[var4];
                          var21 = this.aShortArray3837[var18] * var19
                              + this.aShortArray3810[var18] * var20 + 32767
                              >> 16;
                          this.aShortArray3837[var18] = (short) (
                              this.aShortArray3837[var18] * var20
                                  - this.aShortArray3810[var18] * var19 + 32767
                                  >> 16);
                          this.aShortArray3810[var18] = (short) var21;
                        }
                      }
                    }
                  }
                }
              }

              if (this.vertexNormalData != null) {
                this.vertexNormalData.updated = false;
              }
            }
          }

        } else if (opcode == 3) {
          if (var8 != null) {
            var10 = var8[9] << 4;
            var11 = var8[10] << 4;
            var47 = var8[11] << 4;
            var13 = var8[12] << 4;
            var14 = var8[13] << 4;
            var15 = var8[14] << 4;
            if (GlModel.aBoolean3868) {
              var16 = var8[0] * GlModel.anInt3859 + var8[3] * GlModel.anInt3865
                  + var8[6] * GlModel.anInt3862
                  + 16384 >> 15;
              var17 = var8[1] * GlModel.anInt3859 + var8[4] * GlModel.anInt3865
                  + var8[7] * GlModel.anInt3862
                  + 16384 >> 15;
              var18 = var8[2] * GlModel.anInt3859 + var8[5] * GlModel.anInt3865
                  + var8[8] * GlModel.anInt3862
                  + 16384 >> 15;
              var16 += var13;
              var17 += var14;
              var18 += var15;
              GlModel.anInt3859 = var16;
              GlModel.anInt3865 = var17;
              GlModel.anInt3862 = var18;
              GlModel.aBoolean3868 = false;
            }

            var16 = var3 << 15 >> 7;
            var17 = var4 << 15 >> 7;
            var18 = var5 << 15 >> 7;
            var19 = var16 * -GlModel.anInt3859 + 16384 >> 15;
            var20 = var17 * -GlModel.anInt3865 + 16384 >> 15;
            var21 = var18 * -GlModel.anInt3862 + 16384 >> 15;
            var22 = var19 + GlModel.anInt3859;
            var23 = var20 + GlModel.anInt3865;
            var24 = var21 + GlModel.anInt3862;
            int[] var25 = {
                var16 * var8[0] + 16384 >> 15, var16 * var8[3] + 16384 >> 15,
                var16 * var8[6] + 16384 >> 15, var17 * var8[1] + 16384 >> 15,
                var17 * var8[4] + 16384 >> 15, var17 * var8[7] + 16384 >> 15,
                var18 * var8[2] + 16384 >> 15, var18 * var8[5] + 16384 >> 15,
                var18 * var8[8] + 16384 >> 15
            };
            var26 = var16 * var13 + 16384 >> 15;
            var27 = var17 * var14 + 16384 >> 15;
            var28 = var18 * var15 + 16384 >> 15;
            var26 += var22;
            var27 += var23;
            var28 += var24;
            int[] var29 = new int[9];

            int var31;
            for (var30 = 0; var30 < 3; ++var30) {
              for (var31 = 0; var31 < 3; ++var31) {
                var32 = 0;

                for (var33 = 0; var33 < 3; ++var33) {
                  var32 += var8[var30 * 3 + var33] * var25[var31 + var33 * 3];
                }

                var29[var30 * 3 + var31] = var32 + 16384 >> 15;
              }
            }

            var30 = var8[0] * var26 + var8[1] * var27 + var8[2] * var28 + 16384
                >> 15;
            var31 = var8[3] * var26 + var8[4] * var27 + var8[5] * var28 + 16384
                >> 15;
            var32 = var8[6] * var26 + var8[7] * var27 + var8[8] * var28 + 16384
                >> 15;
            var30 += var10;
            var31 += var11;
            var32 += var47;

            for (var33 = 0; var33 < var9; ++var33) {
              var34 = var2[var33];
              if (var34 < this.anIntArrayArray3825.length) {
                var35 = this.anIntArrayArray3825[var34];

                for (var36 = 0; var36 < var35.length; ++var36) {
                  var37 = var35[var36];
                  if (this.aShortArray3832
                      == null || (var7 & this.aShortArray3832[var37]) != 0) {
                    var38 =
                        var29[0] * this.vx[var37] + var29[1] * this.vy[var37]
                            + var29[2] * this.vz[var37] + 16384 >> 15;
                    var39 =
                        var29[3] * this.vx[var37] + var29[4] * this.vy[var37]
                            + var29[5] * this.vz[var37] + 16384 >> 15;
                    var40 =
                        var29[6] * this.vx[var37] + var29[7] * this.vy[var37]
                            + var29[8] * this.vz[var37] + 16384 >> 15;
                    var38 += var30;
                    var39 += var31;
                    var40 += var32;
                    this.vx[var37] = var38;
                    this.vy[var37] = var39;
                    this.vz[var37] = var40;
                  }
                }
              }
            }
          } else {
            for (var10 = 0; var10 < var9; ++var10) {
              var11 = var2[var10];
              if (var11 < this.anIntArrayArray3825.length) {
                var12 = this.anIntArrayArray3825[var11];

                for (var13 = 0; var13 < var12.length; ++var13) {
                  var14 = var12[var13];
                  if (this.aShortArray3832
                      == null || (var7 & this.aShortArray3832[var14]) != 0) {
                    this.vx[var14] -= GlModel.anInt3859;
                    this.vy[var14] -= GlModel.anInt3865;
                    this.vz[var14] -= GlModel.anInt3862;
                    this.vx[var14] = this.vx[var14] * var3 >> 7;
                    this.vy[var14] = this.vy[var14] * var4 >> 7;
                    this.vz[var14] = this.vz[var14] * var5 >> 7;
                    this.vx[var14] += GlModel.anInt3859;
                    this.vy[var14] += GlModel.anInt3865;
                    this.vz[var14] += GlModel.anInt3862;
                  }
                }
              }
            }
          }

        } else if (opcode == 5) {
          if (this.anIntArrayArray3829 != null && this.aByteArray3816 != null) {
            for (var10 = 0; var10 < var9; ++var10) {
              var11 = var2[var10];
              if (var11 < this.anIntArrayArray3829.length) {
                var12 = this.anIntArrayArray3829[var11];

                for (var13 = 0; var13 < var12.length; ++var13) {
                  var14 = var12[var13];
                  if (this.aShortArray3813
                      == null || (var7 & this.aShortArray3813[var14]) != 0) {
                    var15 = (this.aByteArray3816[var14] & 255) + var3 * 8;
                    if (var15 < 0) {
                      var15 = 0;
                    } else if (var15 > 255) {
                      var15 = 255;
                    }

                    this.aByteArray3816[var14] = (byte) var15;
                  }
                }

                if (var12.length > 0) {
                  this.vertexColorData.updated = false;
                }
              }
            }
          }

        } else if (opcode == 7) {
          if (this.anIntArrayArray3829 != null) {
            for (var10 = 0; var10 < var9; ++var10) {
              var11 = var2[var10];
              if (var11 < this.anIntArrayArray3829.length) {
                var12 = this.anIntArrayArray3829[var11];

                for (var13 = 0; var13 < var12.length; ++var13) {
                  var14 = var12[var13];
                  if (this.aShortArray3813
                      == null || (var7 & this.aShortArray3813[var14]) != 0) {
                    var15 = this.aShortArray3808[var14] & 0xffff;
                    var16 = var15 >> 10 & 63;
                    var17 = var15 >> 7 & 7;
                    var18 = var15 & 127;
                    var16 = var16 + var3 & 63;
                    var17 += var4 / 4;
                    if (var17 < 0) {
                      var17 = 0;
                    } else if (var17 > 7) {
                      var17 = 7;
                    }

                    var18 += var5;
                    if (var18 < 0) {
                      var18 = 0;
                    } else if (var18 > 127) {
                      var18 = 127;
                    }

                    this.aShortArray3808[var14] = (short) (var16 << 10
                        | var17 << 7 | var18);
                  }
                }

                if (var12.length > 0) {
                  this.vertexColorData.updated = false;
                }
              }
            }
          }

        }
      }
    }
  }

  public void method1900() {
    for (int var1 = 0; var1 < this.vertexCCC; ++var1) {
      int var2 = this.vz[var1];
      this.vz[var1] = this.vx[var1];
      this.vx[var1] = -var2;
    }

    this.aClass6_3835.aBoolean98 = false;
    this.vertexPositionData.updated = false;
  }

  private short method1907(Model var1, int var2, long var3, int var5, int var6,
      int var7,
      int var8, float var9, float var10) {
    int var11 = this.vertexCounts[var2];
    int var12 = this.vertexCounts[var2 + 1];
    int var13 = 0;

    for (int var14 = var11; var14 < var12; ++var14) {
      short var15 = this.aShortArray3828[var14];
      if (var15 == 0) {
        var13 = var14;
        break;
      }

      if (GlModel.aLongArray3821[var14] == var3) {
        return (short) (var15 - 1);
      }
    }

    this.aShortArray3828[var13] = (short) (this.amountVertices + 1);
    GlModel.aLongArray3821[var13] = var3;
    this.aShortArray3810[this.amountVertices] = (short) var5;
    this.aShortArray3826[this.amountVertices] = (short) var6;
    this.aShortArray3837[this.amountVertices] = (short) var7;
    this.aShortArray3841[this.amountVertices] = (short) var8;
    this.aFloatArray3824[this.amountVertices] = var9;
    this.aFloatArray3847[this.amountVertices] = var10;
    return (short) this.amountVertices++;
  }

  public void method1908() {
    int[] var1;
    int var2;
    int var3;
    int var4;
    if (this.anIntArray3844 != null) {
      var1 = new int[256];
      var2 = 0;

      for (var3 = 0; var3 < this.vertexCCC; ++var3) {
        var4 = this.anIntArray3844[var3] & 255;
        ++var1[var4];
        if (var4 > var2) {
          var2 = var4;
        }
      }

      this.anIntArrayArray3825 = new int[var2 + 1][];

      for (var3 = 0; var3 <= var2; ++var3) {
        this.anIntArrayArray3825[var3] = new int[var1[var3]];
        var1[var3] = 0;
      }

      for (var3 = 0; var3 < this.vertexCCC;
          this.anIntArrayArray3825[var4][var1[var4]++] = var3++) {
        var4 = this.anIntArray3844[var3] & 255;
      }

      this.anIntArray3844 = null;
    }

    if (this.aByteArray3820 != null) {
      var1 = new int[256];
      var2 = 0;

      for (var3 = 0; var3 < this.anInt3852; ++var3) {
        var4 = this.aByteArray3820[var3] & 255;
        ++var1[var4];
        if (var4 > var2) {
          var2 = var4;
        }
      }

      this.anIntArrayArray3829 = new int[var2 + 1][];

      for (var3 = 0; var3 <= var2; ++var3) {
        this.anIntArrayArray3829[var3] = new int[var1[var3]];
        var1[var3] = 0;
      }

      for (var3 = 0; var3 < this.anInt3852;
          this.anIntArrayArray3829[var4][var1[var4]++] = var3++) {
        var4 = this.aByteArray3820[var3] & 255;
      }

      this.aByteArray3820 = null;
    }

  }

  public void method1909(int var1) {
    this.aShort3819 = (short) var1;
    if (this.vertexNormalData != null) {
      this.vertexNormalData.updated = false;
    }

  }

  public void method1911() {
    if (this.aShortArray3810 == null) {
      this.method1874();
    } else {
      int var1;
      for (var1 = 0; var1 < this.vertexCCC; ++var1) {
        this.vx[var1] = -this.vx[var1];
        this.vz[var1] = -this.vz[var1];
      }

      for (var1 = 0; var1 < this.amountVertices; ++var1) {
        this.aShortArray3810[var1] = (short) -this.aShortArray3810[var1];
        this.aShortArray3837[var1] = (short) -this.aShortArray3837[var1];
      }

      this.aClass6_3835.aBoolean98 = false;
      this.vertexPositionData.updated = false;
      if (this.vertexNormalData != null) {
        this.vertexNormalData.updated = false;
      }

    }
  }

  private void initializeIndicesBuffer() {
    if (GlModel.indicesBuffer.bytes.length < this.amountVertices * 12) {
      GlModel.indicesBuffer = new Buffer((this.amountVertices + 100) * 12);
    } else {
      GlModel.indicesBuffer.position = 0;
    }

    int var1;
    if (GlRenderer.bigEndian) {
      for (var1 = 0; var1 < this.anInt3852; ++var1) {
        GlModel.indicesBuffer.writeInt(this.v0[var1]);
        GlModel.indicesBuffer.writeInt(this.v1[var1]);
        GlModel.indicesBuffer.writeInt(this.v2[var1]);
      }
    } else {
      for (var1 = 0; var1 < this.anInt3852; ++var1) {
        GlModel.indicesBuffer.writeIntLE(this.v0[var1], 98);
        GlModel.indicesBuffer.writeIntLE(this.v1[var1], 68);
        GlModel.indicesBuffer.writeIntLE(this.v2[var1], 77);
      }
    }

    if (GlRenderer.VERTEX_BUFFER_SUPPORT) {
      GlBufferObject var3 = new GlBufferObject();
      ByteBuffer var2 = ByteBuffer.wrap(GlModel.indicesBuffer.bytes, 0,
          GlModel.indicesBuffer.position);
      var3.setVertexBufferData(var2);
      this.indices.updated = true;
      this.indices.byteBuffer = null;
      this.indices.buffer = var3;
    } else {
      ByteBuffer var4 = ByteBuffer
          .allocateDirect(GlModel.indicesBuffer.position);
      var4.put(GlModel.indicesBuffer.bytes, 0, GlModel.indicesBuffer.position);
      var4.flip();
      this.indices.updated = true;
      this.indices.byteBuffer = var4;
      this.indices.buffer = null;
    }

  }

  public void method1914(int var1) {
    this.aShort3849 = (short) var1;
    this.vertexColorData.updated = false;
  }

  public void method1916(short var1, short var2) {
    int var3;
    for (var3 = 0; var3 < this.anInt3852; ++var3) {
      if (this.materials[var3] == var1) {
        this.materials[var3] = var2;
      }
    }

    var3 = 0;
    int var4 = 0;
    if (var1 != -1) {
      var3 = GLStatics.textureCache.method19(-125, var1 & 0xffff);
      var4 = GLStatics.textureCache.method10(-98, var1 & 0xffff);
    }

    int var5 = 0;
    int var6 = 0;
    if (var2 != -1) {
      var5 = GLStatics.textureCache.method19(57, var2 & 0xffff);
      var6 = GLStatics.textureCache.method10(-114, var2 & 0xffff);
    }

    if (var3 != var5 || var4 != var6) {
      this.vertexColorData.updated = false;
    }

  }

  private void method1917() {
    int var1 = 32767;
    int var2 = 32767;
    int var3 = 32767;
    int var4 = -32768;
    int var5 = -32768;
    int var6 = -32768;
    int var7 = 0;
    int var8 = 0;

    for (int var9 = 0; var9 < this.vertexCCC; ++var9) {
      int var10 = this.vx[var9];
      int var11 = this.vy[var9];
      int var12 = this.vz[var9];
      if (var10 < var1) {
        var1 = var10;
      }

      if (var10 > var4) {
        var4 = var10;
      }

      if (var11 < var2) {
        var2 = var11;
      }

      if (var11 > var5) {
        var5 = var11;
      }

      if (var12 < var3) {
        var3 = var12;
      }

      if (var12 > var6) {
        var6 = var12;
      }

      int var13 = var10 * var10 + var12 * var12;
      if (var13 > var7) {
        var7 = var13;
      }

      var13 = var10 * var10 + var12 * var12 + var11 * var11;
      if (var13 > var8) {
        var8 = var13;
      }
    }

    this.aClass6_3835.aShort95 = (short) var1;
    this.aClass6_3835.aShort94 = (short) var4;
    this.aClass6_3835.aShort91 = (short) var2;
    this.aClass6_3835.aShort92 = (short) var5;
    this.aClass6_3835.aShort97 = (short) var3;
    this.aClass6_3835.aShort96 = (short) var6;
    this.aClass6_3835.aShort93 = (short) (int) (Math.sqrt(var7) + 0.99D);
    Math.sqrt(var8);
    this.aClass6_3835.aBoolean98 = true;
  }

  public void method1918(short var1, short var2) {
    for (int var3 = 0; var3 < this.anInt3852; ++var3) {
      if (this.aShortArray3808[var3] == var1) {
        this.aShortArray3808[var3] = var2;
      }
    }

    this.vertexColorData.updated = false;
  }

  public void method1919(int var1, int var2, GlModel var3, int[][] var4,
      int[][] var5,
      int var6,
      int var7,
      int var8) {
    if (!var3.aClass6_3835.aBoolean98) {
      var3.method1917();
    }

    int var9 = var6 + var3.aClass6_3835.aShort95;
    int var10 = var6 + var3.aClass6_3835.aShort94;
    int var11 = var8 + var3.aClass6_3835.aShort97;
    int var12 = var8 + var3.aClass6_3835.aShort96;
    if (var1 != 1 && var1 != 2 && var1 != 3 && var1 != 5
        || var9 >= 0 && var10 + 128 >> 7 < var4.length && var11 >= 0
        && var12 + 128 >> 7 < var4[0].length) {
      if (var1 != 4 && var1 != 5) {
        var9 >>= 7;
        var10 = var10 + 127 >> 7;
        var11 >>= 7;
        var12 = var12 + 127 >> 7;
        if (var4[var9][var11] == var7 && var4[var10][var11] == var7
            && var4[var9][var12] == var7
            && var4[var10][var12] == var7) {
          return;
        }
      } else {
        if (var5 == null) {
          return;
        }

        if (var9 < 0 || var10 + 128 >> 7 >= var5.length || var11 < 0
            || var12 + 128 >> 7 >= var5[0].length) {
          return;
        }
      }

      int var13;
      int var14;
      int var15;
      int var17;
      int var16;
      int var19;
      int var18;
      int var21;
      int var20;
      int var22;
      if (var1 == 1) {
        for (var13 = 0; var13 < this.vertexCCC; ++var13) {
          var14 = this.vx[var13] + var6;
          var15 = this.vz[var13] + var8;
          var16 = var14 & 127;
          var17 = var15 & 127;
          var18 = var14 >> 7;
          var19 = var15 >> 7;
          var20 = var4[var18][var19] * (128 - var16)
              + var4[var18 + 1][var19] * var16 >> 7;
          var21 = var4[var18][var19 + 1] * (128 - var16)
              + var4[var18 + 1][var19 + 1] * var16 >> 7;
          var22 = var20 * (128 - var17) + var21 * var17 >> 7;
          this.vy[var13] = this.vy[var13] + var22 - var7;
        }
      } else {
        int var23;
        int var24;
        if (var1 == 2) {
          short var26 = var3.aClass6_3835.aShort91;

          for (var14 = 0; var14 < this.vertexCCC; ++var14) {
            var15 = (this.vy[var14] << 16) / var26;
            if (var15 < var2) {
              var16 = this.vx[var14] + var6;
              var17 = this.vz[var14] + var8;
              var18 = var16 & 127;
              var19 = var17 & 127;
              var20 = var16 >> 7;
              var21 = var17 >> 7;
              var22 = var4[var20][var21] * (128 - var18)
                  + var4[var20 + 1][var21] * var18 >> 7;
              var23 =
                  var4[var20][var21 + 1] * (128 - var18)
                      + var4[var20 + 1][var21 + 1] * var18 >> 7;
              var24 = var22 * (128 - var19) + var23 * var19 >> 7;
              this.vy[var14] += (var24 - var7) * (var2 - var15) / var2;
            }
          }
        } else if (var1 == 3) {
          var13 = (var2 & 255) * 4;
          var14 = (var2 >> 8 & 255) * 4;
          this.method1895(var4, var6, var7, var8, var13, var14);
        } else if (var1 == 4) {
          var13 = var3.aClass6_3835.aShort92 - var3.aClass6_3835.aShort91;

          for (var14 = 0; var14 < this.vertexCCC; ++var14) {
            var15 = this.vx[var14] + var6;
            var16 = this.vz[var14] + var8;
            var17 = var15 & 127;
            var18 = var16 & 127;
            var19 = var15 >> 7;
            var20 = var16 >> 7;
            var21 = var5[var19][var20] * (128 - var17)
                + var5[var19 + 1][var20] * var17 >> 7;
            var22 =
                var5[var19][var20 + 1] * (128 - var17)
                    + var5[var19 + 1][var20 + 1] * var17 >> 7;
            var23 = var21 * (128 - var18) + var22 * var18 >> 7;
            this.vy[var14] = this.vy[var14] + var23 - var7 + var13;
          }
        } else if (var1 == 5) {
          var13 = var3.aClass6_3835.aShort92 - var3.aClass6_3835.aShort91;

          for (var14 = 0; var14 < this.vertexCCC; ++var14) {
            var15 = this.vx[var14] + var6;
            var16 = this.vz[var14] + var8;
            var17 = var15 & 127;
            var18 = var16 & 127;
            var19 = var15 >> 7;
            var20 = var16 >> 7;
            var21 = var4[var19][var20] * (128 - var17)
                + var4[var19 + 1][var20] * var17 >> 7;
            var22 =
                var4[var19][var20 + 1] * (128 - var17)
                    + var4[var19 + 1][var20 + 1] * var17 >> 7;
            var23 = var21 * (128 - var18) + var22 * var18 >> 7;
            var21 = var5[var19][var20] * (128 - var17)
                + var5[var19 + 1][var20] * var17 >> 7;
            var22 =
                var5[var19][var20 + 1] * (128 - var17)
                    + var5[var19 + 1][var20 + 1] * var17 >> 7;
            var24 = var21 * (128 - var18) + var22 * var18 >> 7;
            int var25 = var23 - var24;
            this.vy[var14] =
                ((this.vy[var14] << 8) / var13 * var25 >> 8) - (var7 - var23);
          }
        }
      }

      this.vertexPositionData.updated = false;
      this.aClass6_3835.aBoolean98 = false;
    }
  }

  public void method1920(boolean var1, boolean var2, boolean var3,
      boolean var4,
      boolean var5,
      boolean var6,
      boolean var7) {
    if (this.aByte3836 != 0) {
      throw new IllegalArgumentException();
    } else if (this.amountVertices != 0) {
      if (var7) {
        boolean var8 = !this.vertexColorData.updated && (var2
            || var3 && !GLStatics.USE_BUMP_MAPS);
        this.method1922(false, !this.vertexPositionData.updated && var1, var8,
            this.vertexNormalData != null && !this.vertexNormalData.updated
                && var3,
            !this.vertexTextureData.updated && var4);
        if (!this.indices.updated && var5 && var2) {
          this.initializeIndicesBuffer();
        }
      }

      if (var1) {
        if (this.vertexPositionData.updated) {
          if (!this.aClass6_3835.aBoolean98) {
            this.method1917();
          }

          this.vx = null;
          this.vy = null;
          this.vz = null;
          this.aShortArray3828 = null;
          this.vertexCounts = null;
        } else {
          this.aByte3851 = (byte) (this.aByte3851 | 1);
        }
      }

      if (var2) {
        if (this.vertexColorData.updated) {
          this.aShortArray3808 = null;
          this.aByteArray3816 = null;
        } else {
          this.aByte3851 = (byte) (this.aByte3851 | 2);
        }
      }

      if (var3 && GLStatics.USE_BUMP_MAPS) {
        if (this.vertexNormalData.updated) {
          this.aShortArray3810 = null;
          this.aShortArray3826 = null;
          this.aShortArray3837 = null;
          this.aShortArray3841 = null;
        } else {
          this.aByte3851 = (byte) (this.aByte3851 | 4);
        }
      }

      if (var4) {
        if (this.vertexTextureData.updated) {
          this.aFloatArray3824 = null;
          this.aFloatArray3847 = null;
        } else {
          this.aByte3851 = (byte) (this.aByte3851 | 8);
        }
      }

      if (var5 && var2) {
        if (this.indices.updated && this.vertexColorData.updated) {
          this.v0 = null;
          this.v1 = null;
          this.v2 = null;
        } else {
          this.aByte3851 = (byte) (this.aByte3851 | 16);
        }
      }

      if (var6) {
        this.anIntArray3844 = null;
        this.aByteArray3820 = null;
        this.anIntArrayArray3825 = null;
        this.anIntArrayArray3829 = null;
      }

    }
  }

  private void method1922(boolean var1, boolean var2, boolean var3,
      boolean var4,
      boolean var5) {
    int var6 = 0;
    if (var2) {
      this.vertexPositionData.pointer = var6;
      var6 += 12;
    }

    if (var3) {
      this.vertexColorData.pointer = var6;
      var6 += 4;
    }

    if (var4) {
      this.vertexNormalData.pointer = var6;
      var6 += 12;
    }

    if (var5) {
      this.vertexTextureData.pointer = var6;
      var6 += 8;
    }

    if (var6 != 0) {
      if (GlModel.indicesBuffer.bytes.length < this.amountVertices * var6) {
        GlModel.indicesBuffer = new Buffer((this.amountVertices + 100) * var6);
      } else {
        GlModel.indicesBuffer.position = 0;
      }

      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      if (var2) {
        int var14;
        if (GlRenderer.bigEndian) {
          for (var7 = 0; var7 < this.vertexCCC; ++var7) {
            var8 = Float.floatToRawIntBits(this.vx[var7]);
            var9 = Float.floatToRawIntBits(this.vy[var7]);
            var10 = Float.floatToRawIntBits(this.vz[var7]);
            var11 = this.vertexCounts[var7];
            var12 = this.vertexCounts[var7 + 1];

            for (var13 = var11; var13 < var12; ++var13) {
              var14 = this.aShortArray3828[var13] - 1;
              if (var14 == -1) {
                break;
              }

              GlModel.indicesBuffer.position = var14 * var6;
              GlModel.indicesBuffer.writeInt(var8);
              GlModel.indicesBuffer.writeInt(var9);
              GlModel.indicesBuffer.writeInt(var10);
            }
          }
        } else {
          for (var7 = 0; var7 < this.vertexCCC; ++var7) {
            var8 = Float.floatToRawIntBits(this.vx[var7]);
            var9 = Float.floatToRawIntBits(this.vy[var7]);
            var10 = Float.floatToRawIntBits(this.vz[var7]);
            var11 = this.vertexCounts[var7];
            var12 = this.vertexCounts[var7 + 1];

            for (var13 = var11; var13 < var12; ++var13) {
              var14 = this.aShortArray3828[var13] - 1;
              if (var14 == -1) {
                break;
              }

              GlModel.indicesBuffer.position = var14 * var6;
              GlModel.indicesBuffer.writeIntLE(var8, 105);
              GlModel.indicesBuffer.writeIntLE(var9, 121);
              GlModel.indicesBuffer.writeIntLE(var10, 84);
            }
          }
        }
      }

      if (var3) {
        if (GLStatics.USE_BUMP_MAPS) {
          for (var7 = 0; var7 < this.anInt3852; ++var7) {
            var8 = GlModel.method1905(
                this.aShortArray3808[var7], this.materials[var7],
                this.aShort3849,
                this.aByteArray3816[var7]);
            GlModel.indicesBuffer.position =
                this.vertexColorData.pointer + this.v0[var7] * var6;
            GlModel.indicesBuffer.writeInt(var8);
            GlModel.indicesBuffer.position =
                this.vertexColorData.pointer + this.v1[var7] * var6;
            GlModel.indicesBuffer.writeInt(var8);
            GlModel.indicesBuffer.position =
                this.vertexColorData.pointer + this.v2[var7] * var6;
            GlModel.indicesBuffer.writeInt(var8);
          }
        } else {
          var7 = (int) GlEnvironment.DIFFUSE_LIGHT_0[0];
          var8 = (int) GlEnvironment.DIFFUSE_LIGHT_0[1];
          var9 = (int) GlEnvironment.DIFFUSE_LIGHT_0[2];
          var10 = (int) Math.sqrt(var7 * var7 + var8 * var8 + var9 * var9);
          var11 = (int) (this.aShort3849 * 1.3F);
          var12 = this.aShort3819 * var10 >> 8;

          for (var13 = 0; var13 < this.anInt3852; ++var13) {
            short var33 = this.v0[var13];
            short var15 = this.aShortArray3841[var33];
            int var16;
            if (var15 < 0) {
              var16 = -1 - var15;
            } else {
              if (var15 == 0) {
                var16 = var11 +
                    (var7 * this.aShortArray3810[var33]
                        + var8 * this.aShortArray3826[var33]
                        + var9 * this.aShortArray3837[var33]) / (var12
                        + var12 / 2);
              } else {
                var16 = var11 +
                    (var7 * this.aShortArray3810[var33]
                        + var8 * this.aShortArray3826[var33]
                        + var9 * this.aShortArray3837[var33]) / (var12 * var15);
              }

              if (var16 < 0) {
                var16 = 0;
              } else if (var16 > 16384) {
                var16 = 16384;
              }

              this.aShortArray3841[var33] = (short) (-1 - var16);
            }

            short var17 = this.v1[var13];
            short var18 = this.aShortArray3841[var17];
            int var19;
            if (var18 < 0) {
              var19 = -1 - var18;
            } else {
              if (var18 == 0) {
                var19 = var11 +
                    (var7 * this.aShortArray3810[var17]
                        + var8 * this.aShortArray3826[var17]
                        + var9 * this.aShortArray3837[var17]) / (var12
                        + var12 / 2);
              } else {
                var19 = var11 +
                    (var7 * this.aShortArray3810[var17]
                        + var8 * this.aShortArray3826[var17]
                        + var9 * this.aShortArray3837[var17]) / (var12 * var18);
              }

              if (var19 < 0) {
                var19 = 0;
              } else if (var19 > 16384) {
                var19 = 16384;
              }

              this.aShortArray3841[var17] = (short) (-1 - var19);
            }

            short var20 = this.v2[var13];
            short var21 = this.aShortArray3841[var20];
            int var22;
            if (var21 < 0) {
              var22 = -1 - var21;
            } else {
              if (var21 == 0) {
                var22 = var11 +
                    (var7 * this.aShortArray3810[var20]
                        + var8 * this.aShortArray3826[var20]
                        + var9 * this.aShortArray3837[var20]) / (var12
                        + var12 / 2);
              } else {
                var22 = var11 +
                    (var7 * this.aShortArray3810[var20]
                        + var8 * this.aShortArray3826[var20]
                        + var9 * this.aShortArray3837[var20]) / (var12 * var21);
              }

              if (var22 < 0) {
                var22 = 0;
              } else if (var22 > 16384) {
                var22 = 16384;
              }

              this.aShortArray3841[var20] = (short) (-1 - var22);
            }

            int var23 = GlModel
                .method1905(this.aShortArray3808[var13], this.materials[var13],
                    var16,
                    this.aByteArray3816[var13]);
            int var24 = GlModel
                .method1905(this.aShortArray3808[var13], this.materials[var13],
                    var19,
                    this.aByteArray3816[var13]);
            int var25 = GlModel
                .method1905(this.aShortArray3808[var13], this.materials[var13],
                    var22,
                    this.aByteArray3816[var13]);
            GlModel.indicesBuffer.position =
                this.vertexColorData.pointer + var33 * var6;
            GlModel.indicesBuffer.writeInt(var23);
            GlModel.indicesBuffer.position =
                this.vertexColorData.pointer + var17 * var6;
            GlModel.indicesBuffer.writeInt(var24);
            GlModel.indicesBuffer.position =
                this.vertexColorData.pointer + var20 * var6;
            GlModel.indicesBuffer.writeInt(var25);
          }

          this.aShortArray3810 = null;
          this.aShortArray3826 = null;
          this.aShortArray3837 = null;
        }
      }

      if (var4) {
        float var27 = 3.0F / this.aShort3819;
        float var26 = 3.0F / (this.aShort3819 + this.aShort3819 / 2);
        GlModel.indicesBuffer.position = this.vertexNormalData.pointer;
        short var30;
        float var32;
        if (GlRenderer.bigEndian) {
          for (var9 = 0; var9 < this.amountVertices; ++var9) {
            var30 = this.aShortArray3841[var9];
            if (var30 == 0) {
              assert this.aShortArray3810 != null;
              GlModel.indicesBuffer
                  .writeFloat(this.aShortArray3810[var9] * var26);
              GlModel.indicesBuffer
                  .writeFloat(this.aShortArray3826[var9] * var26);
              GlModel.indicesBuffer
                  .writeFloat(this.aShortArray3837[var9] * var26);
            } else {
              var32 = var27 / var30;
              assert this.aShortArray3810 != null;
              GlModel.indicesBuffer
                  .writeFloat(this.aShortArray3810[var9] * var32);
              GlModel.indicesBuffer
                  .writeFloat(this.aShortArray3826[var9] * var32);
              GlModel.indicesBuffer
                  .writeFloat(this.aShortArray3837[var9] * var32);
            }

            GlModel.indicesBuffer.position += var6 - 12;
          }
        } else {
          for (var9 = 0; var9 < this.amountVertices; ++var9) {
            var30 = this.aShortArray3841[var9];
            if (var30 == 0) {
              assert this.aShortArray3810 != null;
              GlModel.indicesBuffer
                  .writeFloatLE(this.aShortArray3810[var9] * var26);
              GlModel.indicesBuffer
                  .writeFloatLE(this.aShortArray3826[var9] * var26);
              GlModel.indicesBuffer
                  .writeFloatLE(this.aShortArray3837[var9] * var26);
            } else {
              var32 = var27 / var30;
              assert this.aShortArray3810 != null;
              GlModel.indicesBuffer
                  .writeFloatLE(this.aShortArray3810[var9] * var32);
              GlModel.indicesBuffer
                  .writeFloatLE(this.aShortArray3826[var9] * var32);
              GlModel.indicesBuffer
                  .writeFloatLE(this.aShortArray3837[var9] * var32);
            }

            GlModel.indicesBuffer.position += var6 - 12;
          }
        }
      }

      if (var5) {
        GlModel.indicesBuffer.position = this.vertexTextureData.pointer;
        if (GlRenderer.bigEndian) {
          for (var7 = 0; var7 < this.amountVertices; ++var7) {
            GlModel.indicesBuffer.writeFloat(this.aFloatArray3824[var7]);
            GlModel.indicesBuffer.writeFloat(this.aFloatArray3847[var7]);
            GlModel.indicesBuffer.position += var6 - 8;
          }
        } else {
          for (var7 = 0; var7 < this.amountVertices; ++var7) {
            GlModel.indicesBuffer.writeFloatLE(this.aFloatArray3824[var7]);
            GlModel.indicesBuffer.writeFloatLE(this.aFloatArray3847[var7]);
            GlModel.indicesBuffer.position += var6 - 8;
          }
        }
      }

      GlModel.indicesBuffer.position = var6 * this.amountVertices;
      ByteBuffer var29;
      if (var1) {
        if (GlRenderer.aBoolean1817) {
          var29 = ByteBuffer.wrap(GlModel.indicesBuffer.bytes, 0,
              GlModel.indicesBuffer.position);
          if (this.aClass156_3812 == null) {
            this.aClass156_3812 = new GlBufferObject(true);
            this.aClass156_3812.setVertexBufferData(var29);
          } else {
            this.aClass156_3812.method2168(var29);
          }

          if (var2) {
            this.vertexPositionData.updated = true;
            this.vertexPositionData.byteBuffer = null;
            this.vertexPositionData.buffer = this.aClass156_3812;
            this.vertexPositionData.stride = var6;
          }

          if (var3) {
            this.vertexColorData.updated = true;
            this.vertexColorData.byteBuffer = null;
            this.vertexColorData.buffer = this.aClass156_3812;
            this.vertexColorData.stride = var6;
          }

          if (var4) {
            this.vertexNormalData.updated = true;
            this.vertexNormalData.byteBuffer = null;
            this.vertexNormalData.buffer = this.aClass156_3812;
            this.vertexNormalData.stride = var6;
          }

          if (var5) {
            this.vertexTextureData.updated = true;
            this.vertexTextureData.byteBuffer = null;
            this.vertexTextureData.buffer = this.aClass156_3812;
            this.vertexTextureData.stride = var6;
          }
        } else {
          if (GlModel.aByteBuffer3834 != null
              && GlModel.aByteBuffer3834.capacity()
              >= GlModel.indicesBuffer.position) {
            GlModel.aByteBuffer3834.clear();
          } else {
            GlModel.aByteBuffer3834 = ByteBuffer.allocateDirect(
                GlModel.indicesBuffer.position + 100 * var6);
          }

          GlModel.aByteBuffer3834.put(GlModel.indicesBuffer.bytes, 0,
              GlModel.indicesBuffer.position);
          GlModel.aByteBuffer3834.flip();
          if (var2) {
            this.vertexPositionData.updated = true;
            this.vertexPositionData.byteBuffer = GlModel.aByteBuffer3834;
            this.vertexPositionData.buffer = null;
            this.vertexPositionData.stride = var6;
          }

          if (var3) {
            this.vertexColorData.updated = true;
            this.vertexColorData.byteBuffer = GlModel.aByteBuffer3834;
            this.vertexPositionData.buffer = null;
            this.vertexColorData.stride = var6;
          }

          if (var4) {
            this.vertexNormalData.updated = true;
            this.vertexNormalData.byteBuffer = GlModel.aByteBuffer3834;
            this.vertexNormalData.buffer = null;
            this.vertexNormalData.stride = var6;
          }

          if (var5) {
            this.vertexTextureData.updated = true;
            this.vertexTextureData.byteBuffer = GlModel.aByteBuffer3834;
            this.vertexTextureData.buffer = null;
            this.vertexTextureData.stride = var6;
          }
        }
      } else if (GlRenderer.VERTEX_BUFFER_SUPPORT) {
        GlBufferObject var31 = new GlBufferObject();
        ByteBuffer var28 = ByteBuffer.wrap(GlModel.indicesBuffer.bytes, 0,
            GlModel.indicesBuffer.position);
        var31.setVertexBufferData(var28);
        if (var2) {
          this.vertexPositionData.updated = true;
          this.vertexPositionData.byteBuffer = null;
          this.vertexPositionData.buffer = var31;
          this.vertexPositionData.stride = var6;
        }

        if (var3) {
          this.vertexColorData.updated = true;
          this.vertexColorData.byteBuffer = null;
          this.vertexColorData.buffer = var31;
          this.vertexColorData.stride = var6;
        }

        if (var4) {
          this.vertexNormalData.updated = true;
          this.vertexNormalData.byteBuffer = null;
          this.vertexNormalData.buffer = var31;
          this.vertexNormalData.stride = var6;
        }

        if (var5) {
          this.vertexTextureData.updated = true;
          this.vertexTextureData.byteBuffer = null;
          this.vertexTextureData.buffer = var31;
          this.vertexTextureData.stride = var6;
        }
      } else {
        var29 = ByteBuffer.allocateDirect(GlModel.indicesBuffer.position);
        var29.put(GlModel.indicesBuffer.bytes, 0,
            GlModel.indicesBuffer.position);
        var29.flip();
        if (var2) {
          this.vertexPositionData.updated = true;
          this.vertexPositionData.byteBuffer = var29;
          this.vertexPositionData.buffer = null;
          this.vertexPositionData.stride = var6;
        }

        if (var3) {
          this.vertexColorData.updated = true;
          this.vertexColorData.byteBuffer = var29;
          this.vertexPositionData.buffer = null;
          this.vertexColorData.stride = var6;
        }

        if (var4) {
          this.vertexNormalData.updated = true;
          this.vertexNormalData.byteBuffer = var29;
          this.vertexNormalData.buffer = null;
          this.vertexNormalData.stride = var6;
        }

        if (var5) {
          this.vertexTextureData.updated = true;
          this.vertexTextureData.byteBuffer = var29;
          this.vertexTextureData.buffer = null;
          this.vertexTextureData.stride = var6;
        }
      }

    }
  }

  private AbstractModel method1923(boolean var1, boolean var2, boolean var3,
      GlModel var4,
      GlModel var5) {
    var4.vertexCCC = this.vertexCCC;
    var4.amountVertices = this.amountVertices;
    var4.anInt3852 = this.anInt3852;
    var4.aShort3849 = this.aShort3849;
    var4.aShort3819 = this.aShort3819;
    var4.aByte3836 = (byte) (1 | (var1 && var2 ? 0 : 2) | (var3 ? 0 : 4));
    if (var4.vx == null || var4.vx.length < this.vertexCCC) {
      var4.vx = new int[this.vertexCCC + 100];
      var4.vy = new int[this.vertexCCC + 100];
      var4.vz = new int[this.vertexCCC + 100];
    }

    int var6;
    for (var6 = 0; var6 < this.vertexCCC; ++var6) {
      var4.vx[var6] = this.vx[var6];
      var4.vy[var6] = this.vy[var6];
      var4.vz[var6] = this.vz[var6];
    }

    if (var4.vertexPositionData == null) {
      var4.vertexPositionData = new BufferData();
    }

    var4.vertexPositionData.updated = false;
    if (var4.aClass6_3835 == null) {
      var4.aClass6_3835 = new GlModelDimensions();
    }

    var4.aClass6_3835.aBoolean98 = false;
    if (var1) {
      var4.aByteArray3816 = this.aByteArray3816;
    } else {
      if (var5.aByteArray3816 == null
          || var5.aByteArray3816.length < this.anInt3852) {
        var5.aByteArray3816 = new byte[this.anInt3852 + 100];
      }

      var4.aByteArray3816 = var5.aByteArray3816;

      for (var6 = 0; var6 < this.anInt3852; ++var6) {
        var4.aByteArray3816[var6] = this.aByteArray3816[var6];
      }
    }

    if (var2) {
      var4.aShortArray3808 = this.aShortArray3808;
    } else {
      if (var5.aShortArray3808 == null
          || var5.aShortArray3808.length < this.anInt3852) {
        var5.aShortArray3808 = new short[this.anInt3852 + 100];
      }

      var4.aShortArray3808 = var5.aShortArray3808;

      for (var6 = 0; var6 < this.anInt3852; ++var6) {
        var4.aShortArray3808[var6] = this.aShortArray3808[var6];
      }
    }

    if (var1 && var2) {
      var4.vertexColorData = this.vertexColorData;
    } else {
      if (var5.vertexColorData == null) {
        var5.vertexColorData = new BufferData();
      }

      var4.vertexColorData = var5.vertexColorData;
      var4.vertexColorData.updated = false;
    }

    if (!var3 && this.aShortArray3810 != null) {
      if (var5.aShortArray3810 == null
          || var5.aShortArray3810.length < this.amountVertices) {
        var5.aShortArray3810 = new short[this.amountVertices + 100];
        var5.aShortArray3826 = new short[this.amountVertices + 100];
        var5.aShortArray3837 = new short[this.amountVertices + 100];
        var5.aShortArray3841 = new short[this.amountVertices + 100];
      }

      var4.aShortArray3810 = var5.aShortArray3810;
      var4.aShortArray3826 = var5.aShortArray3826;
      var4.aShortArray3837 = var5.aShortArray3837;
      var4.aShortArray3841 = var5.aShortArray3841;

      for (var6 = 0; var6 < this.amountVertices; ++var6) {
        var4.aShortArray3810[var6] = this.aShortArray3810[var6];
        var4.aShortArray3826[var6] = this.aShortArray3826[var6];
        var4.aShortArray3837[var6] = this.aShortArray3837[var6];
        var4.aShortArray3841[var6] = this.aShortArray3841[var6];
      }

      if (GLStatics.USE_BUMP_MAPS) {
        if (var5.vertexNormalData == null) {
          var5.vertexNormalData = new BufferData();
        }

        var4.vertexNormalData = var5.vertexNormalData;
        var4.vertexNormalData.updated = false;
      } else {
        var4.vertexNormalData = null;
      }
    } else {
      var4.aShortArray3810 = this.aShortArray3810;
      var4.aShortArray3826 = this.aShortArray3826;
      var4.aShortArray3837 = this.aShortArray3837;
      var4.aShortArray3841 = this.aShortArray3841;
      var4.vertexNormalData = this.vertexNormalData;
    }

    var4.aFloatArray3824 = this.aFloatArray3824;
    var4.aFloatArray3847 = this.aFloatArray3847;
    var4.anIntArray3844 = this.anIntArray3844;
    var4.anIntArrayArray3825 = this.anIntArrayArray3825;
    var4.v0 = this.v0;
    var4.v1 = this.v1;
    var4.v2 = this.v2;
    var4.materials = this.materials;
    var4.aByteArray3820 = this.aByteArray3820;
    var4.anIntArrayArray3829 = this.anIntArrayArray3829;
    var4.vertexTextureData = this.vertexTextureData;
    var4.indices = this.indices;
    var4.offsets = this.offsets;
    var4.aShortArray3828 = this.aShortArray3828;
    var4.vertexCounts = this.vertexCounts;
    var4.aBoolean2699 = this.aBoolean2699;
    var4.aShortArray3832 = this.aShortArray3832;
    var4.aShortArray3813 = this.aShortArray3813;
    return var4;
  }

  public SceneNode method1861(int var1, int var2, int var3) {
    this.aBoolean3809 = false;
    if (this.aClass18_3843 != null) {
      this.aShortArray3810 = this.aClass18_3843.aShortArray417;
      this.aShortArray3826 = this.aClass18_3843.aShortArray419;
      this.aShortArray3837 = this.aClass18_3843.aShortArray418;
      this.aShortArray3841 = this.aClass18_3843.aShortArray416;
      this.aClass18_3843 = null;
    }

    return this;
  }

  public boolean method1865() {
    return this.aBoolean3809 && this.vx != null && this.aShortArray3810 != null;
  }

  public void method1866(SceneNode var1, int var2, int var3, int var4,
      boolean var5) {
    GlModel var6 = (GlModel) var1;
    if (this.anInt3852 != 0 && var6.anInt3852 != 0) {
      int var7 = var6.vertexCCC;
      int[] var8 = var6.vx;
      int[] var9 = var6.vy;
      int[] var10 = var6.vz;
      short[] var11 = var6.aShortArray3810;
      short[] var12 = var6.aShortArray3826;
      short[] var13 = var6.aShortArray3837;
      short[] var14 = var6.aShortArray3841;
      short[] var15;
      short[] var17;
      short[] var16;
      short[] var18;
      if (this.aClass18_3843 != null) {
        var15 = this.aClass18_3843.aShortArray417;
        var16 = this.aClass18_3843.aShortArray419;
        var17 = this.aClass18_3843.aShortArray418;
        var18 = this.aClass18_3843.aShortArray416;
      } else {
        var15 = null;
        var16 = null;
        var17 = null;
        var18 = null;
      }

      short[] var19;
      short[] var21;
      short[] var20;
      short[] var22;
      if (var6.aClass18_3843 != null) {
        var19 = var6.aClass18_3843.aShortArray417;
        var20 = var6.aClass18_3843.aShortArray419;
        var21 = var6.aClass18_3843.aShortArray418;
        var22 = var6.aClass18_3843.aShortArray416;
      } else {
        var19 = null;
        var20 = null;
        var21 = null;
        var22 = null;
      }

      int[] var23 = var6.vertexCounts;
      short[] var24 = var6.aShortArray3828;
      if (!var6.aClass6_3835.aBoolean98) {
        var6.method1917();
      }

      short var25 = var6.aClass6_3835.aShort91;
      short var26 = var6.aClass6_3835.aShort92;
      short var27 = var6.aClass6_3835.aShort95;
      short var28 = var6.aClass6_3835.aShort94;
      short var29 = var6.aClass6_3835.aShort97;
      short var30 = var6.aClass6_3835.aShort96;

      for (int var31 = 0; var31 < this.vertexCCC; ++var31) {
        int var32 = this.vy[var31] - var3;
        if (var32 >= var25 && var32 <= var26) {
          int var33 = this.vx[var31] - var2;
          if (var33 >= var27 && var33 <= var28) {
            int var34 = this.vz[var31] - var4;
            if (var34 >= var29 && var34 <= var30) {
              int var35 = -1;
              int var36 = this.vertexCounts[var31];
              int var37 = this.vertexCounts[var31 + 1];

              int var38;
              for (var38 = var36; var38 < var37; ++var38) {
                var35 = this.aShortArray3828[var38] - 1;
                if (var35 == -1 || this.aShortArray3841[var35] != 0) {
                  break;
                }
              }

              if (var35 != -1) {
                for (var38 = 0; var38 < var7; ++var38) {
                  if (var33 == var8[var38] && var34 == var10[var38]
                      && var32 == var9[var38]) {
                    int var39 = -1;
                    var36 = var23[var38];
                    var37 = var23[var38 + 1];

                    for (int var40 = var36; var40 < var37; ++var40) {
                      var39 = var24[var40] - 1;
                      if (var39 == -1 || var14[var39] != 0) {
                        break;
                      }
                    }

                    if (var39 != -1) {
                      if (var15 == null) {
                        this.aClass18_3843 = new SomethingGlModel();
                        var15 = this.aClass18_3843.aShortArray417 =
                            GlobalStatics_11.copy(23032, this.aShortArray3810);
                        var16 = this.aClass18_3843.aShortArray419 =
                            GlobalStatics_11.copy(23032, this.aShortArray3826);
                        var17 = this.aClass18_3843.aShortArray418 =
                            GlobalStatics_11.copy(23032, this.aShortArray3837);
                        var18 = this.aClass18_3843.aShortArray416 =
                            GlobalStatics_11.copy(23032, this.aShortArray3841);
                      }

                      if (var19 == null) {
                        SomethingGlModel var47 = var6.aClass18_3843 = new SomethingGlModel();
                        var19 = var47.aShortArray417 = GlobalStatics_11
                            .copy(23032, var11);
                        var20 = var47.aShortArray419 = GlobalStatics_11
                            .copy(23032, var12);
                        var21 = var47.aShortArray418 = GlobalStatics_11
                            .copy(23032, var13);
                        var22 = var47.aShortArray416 = GlobalStatics_11
                            .copy(23032, var14);
                      }

                      short var46 = this.aShortArray3810[var35];
                      short var41 = this.aShortArray3826[var35];
                      short var42 = this.aShortArray3837[var35];
                      short var43 = this.aShortArray3841[var35];
                      var36 = var23[var38];
                      var37 = var23[var38 + 1];

                      int var44;
                      int var45;
                      for (var44 = var36; var44 < var37; ++var44) {
                        var45 = var24[var44] - 1;
                        if (var45 == -1) {
                          break;
                        }

                        assert var22 != null;
                        if (var22[var45] != 0) {
                          assert var19 != null;
                          var19[var45] += var46;
                          assert var20 != null;
                          var20[var45] += var41;
                          assert var21 != null;
                          var21[var45] += var42;
                          var22[var45] += var43;
                        }
                      }

                      var46 = var11[var39];
                      var41 = var12[var39];
                      var42 = var13[var39];
                      var43 = var14[var39];
                      var36 = this.vertexCounts[var31];
                      var37 = this.vertexCounts[var31 + 1];

                      for (var44 = var36; var44 < var37; ++var44) {
                        var45 = this.aShortArray3828[var44] - 1;
                        if (var45 == -1) {
                          break;
                        }

                        assert var18 != null;
                        if (var18[var45] != 0) {
                          assert var15 != null;
                          var15[var45] += var46;
                          assert var16 != null;
                          var16[var45] += var41;
                          assert var17 != null;
                          var17[var45] += var42;
                          var18[var45] += var43;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }

    }
  }

  public int method1924() {
    return this.aShort3819;
  }

  public void method1925() {
    if (this.aShortArray3810 == null) {
      this.rotateQuarterY();
    } else {
      int var1;
      for (var1 = 0; var1 < this.vertexCCC; ++var1) {
        int var2 = this.vx[var1];
        this.vx[var1] = this.vz[var1];
        this.vz[var1] = -var2;
      }

      for (var1 = 0; var1 < this.amountVertices; ++var1) {
        short var3 = this.aShortArray3810[var1];
        this.aShortArray3810[var1] = this.aShortArray3837[var1];
        this.aShortArray3837[var1] = (short) -var3;
      }

      this.aClass6_3835.aBoolean98 = false;
      this.vertexPositionData.updated = false;
      if (this.vertexNormalData != null) {
        this.vertexNormalData.updated = false;
      }

    }
  }

  public GlModel createCopy(boolean var1, boolean var2, boolean var3,
      boolean var4,
      boolean var5,
      boolean var6,
      boolean var7,
      boolean var8,
      boolean var9,
      boolean var10,
      boolean directMaterials) {
    GlModel var12 = new GlModel();
    var12.vertexCCC = this.vertexCCC;
    var12.amountVertices = this.amountVertices;
    var12.anInt3852 = this.anInt3852;
    if (var1) {
      var12.vx = this.vx;
      var12.vz = this.vz;
    } else {
      var12.vx = DummyClass45.method1233(this.vx, 2);
      var12.vz = DummyClass45.method1233(this.vz, 2);
    }

    if (var2) {
      var12.vy = this.vy;
    } else {
      var12.vy = DummyClass45.method1233(this.vy, 2);
    }

    if (var1 && var2) {
      var12.vertexPositionData = this.vertexPositionData;
      var12.aClass6_3835 = this.aClass6_3835;
    } else {
      var12.vertexPositionData = new BufferData();
      var12.aClass6_3835 = new GlModelDimensions();
    }

    if (var3) {
      var12.aShortArray3808 = this.aShortArray3808;
    } else {
      var12.aShortArray3808 = GlobalStatics_11.copy(23032,
          this.aShortArray3808);
    }

    if (var4) {
      var12.aByteArray3816 = this.aByteArray3816;
    } else {
      var12.aByteArray3816 = DummyClass58.method1655((byte) -46,
          this.aByteArray3816);
    }

    if (var3 && var4 && var5 && (var8 && var6 || GLStatics.USE_BUMP_MAPS)) {
      var12.vertexColorData = this.vertexColorData;
    } else {
      var12.vertexColorData = new BufferData();
    }

    if (var6) {
      var12.aShortArray3810 = this.aShortArray3810;
      var12.aShortArray3826 = this.aShortArray3826;
      var12.aShortArray3837 = this.aShortArray3837;
      var12.aShortArray3841 = this.aShortArray3841;
    } else {
      var12.aShortArray3810 = GlobalStatics_11.copy(23032,
          this.aShortArray3810);
      var12.aShortArray3826 = GlobalStatics_11.copy(23032,
          this.aShortArray3826);
      var12.aShortArray3837 = GlobalStatics_11.copy(23032,
          this.aShortArray3837);
      var12.aShortArray3841 = GlobalStatics_11.copy(23032,
          this.aShortArray3841);
    }

    if (GLStatics.USE_BUMP_MAPS) {
      if (var6 && var7 && var8) {
        var12.vertexNormalData = this.vertexNormalData;
      } else {
        var12.vertexNormalData = new BufferData();
      }
    } else {
      var12.vertexNormalData = null;
    }

    if (var9) {
      var12.aFloatArray3824 = this.aFloatArray3824;
      var12.aFloatArray3847 = this.aFloatArray3847;
      var12.vertexTextureData = this.vertexTextureData;
    } else {
      var12.aFloatArray3824 = GlobalStatics_9
          .method119(this.aFloatArray3824, 0);
      var12.aFloatArray3847 = GlobalStatics_9
          .method119(this.aFloatArray3847, 0);
      var12.vertexTextureData = new BufferData();
    }

    if (var10) {
      var12.v0 = this.v0;
      var12.v1 = this.v1;
      var12.v2 = this.v2;
      var12.indices = this.indices;
    } else {
      var12.v0 = GlobalStatics_11.copy(23032, this.v0);
      var12.v1 = GlobalStatics_11.copy(23032, this.v1);
      var12.v2 = GlobalStatics_11.copy(23032, this.v2);
      var12.indices = new BufferData();
    }

    if (directMaterials) {
      var12.materials = this.materials;
    } else {
      var12.materials = GlobalStatics_11.copy(23032, this.materials);
    }

    var12.anIntArray3844 = this.anIntArray3844;
    var12.anIntArrayArray3825 = this.anIntArrayArray3825;
    var12.aByteArray3820 = this.aByteArray3820;
    var12.anIntArrayArray3829 = this.anIntArrayArray3829;
    var12.offsets = this.offsets;
    var12.aShortArray3828 = this.aShortArray3828;
    var12.vertexCounts = this.vertexCounts;
    var12.aShort3849 = this.aShort3849;
    var12.aShort3819 = this.aShort3819;
    var12.aShortArray3832 = this.aShortArray3832;
    var12.aShortArray3813 = this.aShortArray3813;
    return var12;
  }

  private boolean isWithinBoundaries(int var1, int var2, int var3, int var4,
      int var5,
      int var6, int var7, int var8) {
    return (var2 >= var3 || var2 >= var4 || var2 >= var5) && (var2 <= var3
        || var2 <= var4 || var2 <= var5) && (var1 >= var6 || var1 >= var7
        || var1 >= var8) && (var1 <= var6
        || var1 <= var7 || var1 <= var8);
  }

  private void draw() {
    if (this.anInt3852 != 0) {
      if (this.aByte3836 != 0) {
        this.method1922(true,
            !this.vertexPositionData.updated && (this.aByte3836 & 1) != 0,
            !this.vertexColorData.updated && (this.aByte3836 & 2) != 0,
            this.vertexNormalData != null && !this.vertexNormalData.updated
                && (this.aByte3836 & 4) != 0, false);
      }

      this.method1922(false, !this.vertexPositionData.updated,
          !this.vertexColorData.updated,
          this.vertexNormalData != null && !this.vertexNormalData.updated,
          !this.vertexTextureData.updated);
      if (!this.indices.updated) {
        this.initializeIndicesBuffer();
      }

      if (this.aByte3851 != 0) {
        if ((this.aByte3851 & 1) != 0) {
          this.vx = null;
          this.vy = null;
          this.vz = null;
          this.aShortArray3828 = null;
          this.vertexCounts = null;
        }

        if ((this.aByte3851 & 2) != 0) {
          this.aShortArray3808 = null;
          this.aByteArray3816 = null;
        }

        if ((this.aByte3851 & 4) != 0) {
          this.aShortArray3810 = null;
          this.aShortArray3826 = null;
          this.aShortArray3837 = null;
          this.aShortArray3841 = null;
        }

        if ((this.aByte3851 & 8) != 0) {
          this.aFloatArray3824 = null;
          this.aFloatArray3847 = null;
        }

        if ((this.aByte3851 & 16) != 0) {
          this.v0 = null;
          this.v1 = null;
          this.v2 = null;
        }

        this.aByte3851 = 0;
      }

      GlBufferObject buffer = null;
      if (this.vertexPositionData.buffer != null) {
        this.vertexPositionData.buffer.bindVertexBuffer();
        buffer = this.vertexPositionData.buffer;
        // GL_FLOAT
        GlRenderer.GL.glVertexPointer(3, 5126, this.vertexPositionData.stride,
            this.vertexPositionData.pointer);
      }

      if (this.vertexColorData.buffer != null) {
        if (buffer != this.vertexColorData.buffer) {
          this.vertexColorData.buffer.bindVertexBuffer();
          buffer = this.vertexColorData.buffer;
        }

        GlRenderer.GL.glColorPointer(4, GL.GL_UNSIGNED_BYTE, this.vertexColorData.stride,
            this.vertexColorData.pointer);
      }

      if (GLStatics.USE_BUMP_MAPS && this.vertexNormalData.buffer != null) {
        if (buffer != this.vertexNormalData.buffer) {
          this.vertexNormalData.buffer.bindVertexBuffer();
          buffer = this.vertexNormalData.buffer;
        }

        GlRenderer.GL.glNormalPointer(5126, this.vertexNormalData.stride,
            this.vertexNormalData.pointer);
      }

      if (this.vertexTextureData.buffer != null) {
        if (buffer != this.vertexTextureData.buffer) {
          this.vertexTextureData.buffer.bindVertexBuffer();
          buffer = this.vertexTextureData.buffer;
        }

        GlRenderer.GL.glTexCoordPointer(2, 5126, this.vertexTextureData.stride,
            this.vertexTextureData.pointer);
      }

      if (this.indices.buffer != null) {
        this.indices.buffer.bindElementBuffer();
      }

      if (this.vertexPositionData.buffer == null
          || this.vertexColorData.buffer == null
          || GLStatics.USE_BUMP_MAPS && this.vertexNormalData.buffer == null
          || this.vertexTextureData.buffer == null) {
        if (GlRenderer.VERTEX_BUFFER_SUPPORT) {
          //TODO ARB
          GlRenderer.GL.glBindBuffer(0x8892, 0);
        }

        if (this.vertexPositionData.buffer == null) {
          this.vertexPositionData.byteBuffer
              .position(this.vertexPositionData.pointer);
          GlRenderer.GL.glVertexPointer(3, 5126, this.vertexPositionData.stride,
              this.vertexPositionData.byteBuffer);
        }

        if (this.vertexColorData.buffer == null) {
          this.vertexColorData.byteBuffer
              .position(this.vertexColorData.pointer);
          GlRenderer.GL.glColorPointer(4, GL.GL_UNSIGNED_BYTE, this.vertexColorData.stride,
              this.vertexColorData.byteBuffer);
        }

        if (GLStatics.USE_BUMP_MAPS && this.vertexNormalData.buffer == null) {
          this.vertexNormalData.byteBuffer
              .position(this.vertexNormalData.pointer);
          GlRenderer.GL.glNormalPointer(5126, this.vertexNormalData.stride,
              this.vertexNormalData.byteBuffer);
        }

        if (this.vertexTextureData.buffer == null) {
          this.vertexTextureData.byteBuffer
              .position(this.vertexTextureData.pointer);
          GlRenderer.GL
              .glTexCoordPointer(2, 5126, this.vertexTextureData.stride,
                  this.vertexTextureData.byteBuffer);
        }
      }

      if (this.indices.buffer == null && GlRenderer.VERTEX_BUFFER_SUPPORT) {
        //TODO ARB
        GlRenderer.GL.glBindBuffer(0x8893, 0);
      }

      int var3 = this.offsets.length - 1;

      for (int var4 = 0; var4 < var3; ++var4) {
        int start = this.offsets[var4];
        int end = this.offsets[var4 + 1];
        short var7 = this.materials[start];
        if (var7 == -1) {
          GlRenderer.bindTexture(-1);
          GLStatics.method551(0, 0);
        } else {
          GLStatics.textureCache.initializeMaterial(var7 & 0xffff, true);
        }

        if (this.indices.buffer != null) {
          GlRenderer.GL.glDrawElements(4, (end - start) * 3, 5125, start * 12);
        } else {
          this.indices.byteBuffer.position(start * 12);
          GlRenderer.GL.glDrawElements(4, (end - start) * 3, 5125,
              this.indices.byteBuffer);
        }
      }

    }
  }

  public void method1931() {
    int var1;
    for (var1 = 0; var1 < this.vertexCCC; ++var1) {
      this.vz[var1] = -this.vz[var1];
    }

    if (this.aShortArray3837 != null) {
      for (var1 = 0; var1 < this.amountVertices; ++var1) {
        this.aShortArray3837[var1] = (short) -this.aShortArray3837[var1];
      }
    }

    for (var1 = 0; var1 < this.anInt3852; ++var1) {
      short var2 = this.v0[var1];
      this.v0[var1] = this.v2[var1];
      this.v2[var1] = var2;
    }

    this.aClass6_3835.aBoolean98 = false;
    this.vertexPositionData.updated = false;
    if (this.vertexNormalData != null) {
      this.vertexNormalData.updated = false;
    }

    this.indices.updated = false;
  }

  public void method1932(int var1) {
    if (this.aShortArray3810 == null) {
      this.method1876(var1);
    } else {
      int var2 = GLStatics.SINE_TABLE[var1];
      int var3 = DummyClass40.COSINE_TABLE[var1];

      int var4;
      int var5;
      for (var4 = 0; var4 < this.vertexCCC; ++var4) {
        var5 = this.vz[var4] * var2 + this.vx[var4] * var3 >> 16;
        this.vz[var4] = this.vz[var4] * var3 - this.vx[var4] * var2 >> 16;
        this.vx[var4] = var5;
      }

      for (var4 = 0; var4 < this.amountVertices; ++var4) {
        var5 = this.aShortArray3837[var4] * var2
            + this.aShortArray3810[var4] * var3 >> 16;
        this.aShortArray3837[var4] =
            (short) (
                this.aShortArray3837[var4] * var3
                    - this.aShortArray3810[var4] * var2 >> 16);
        this.aShortArray3810[var4] = (short) var5;
      }

      this.aClass6_3835.aBoolean98 = false;
      this.vertexPositionData.updated = false;
      if (this.vertexNormalData != null) {
        this.vertexNormalData.updated = false;
      }

    }
  }

  public SoftwareIndexedColorSprite createShadowMap(
      SoftwareIndexedColorSprite var1) {
    if (this.amountVertices == 0) {
      return null;
    } else {
      if (!this.aClass6_3835.aBoolean98) {
        this.method1917();
      }

      int var2;
      int var3;
      if (GlEnvironment.anInt1314 > 0) {
        var2 =
            this.aClass6_3835.aShort95 - (
                this.aClass6_3835.aShort92 * GlEnvironment.anInt1314 >> 8)
                >> 3;
        var3 =
            this.aClass6_3835.aShort94 - (
                this.aClass6_3835.aShort91 * GlEnvironment.anInt1314 >> 8)
                >> 3;
      } else {
        var2 =
            this.aClass6_3835.aShort95 - (
                this.aClass6_3835.aShort91 * GlEnvironment.anInt1314 >> 8)
                >> 3;
        var3 =
            this.aClass6_3835.aShort94 - (
                this.aClass6_3835.aShort92 * GlEnvironment.anInt1314 >> 8)
                >> 3;
      }

      int var4;
      int var5;
      if (GlEnvironment.anInt1315 > 0) {
        var4 =
            this.aClass6_3835.aShort97 - (
                this.aClass6_3835.aShort92 * GlEnvironment.anInt1315 >> 8)
                >> 3;
        var5 =
            this.aClass6_3835.aShort96 - (
                this.aClass6_3835.aShort91 * GlEnvironment.anInt1315 >> 8)
                >> 3;
      } else {
        var4 =
            this.aClass6_3835.aShort97 - (
                this.aClass6_3835.aShort91 * GlEnvironment.anInt1315 >> 8)
                >> 3;
        var5 =
            this.aClass6_3835.aShort96 - (
                this.aClass6_3835.aShort92 * GlEnvironment.anInt1315 >> 8)
                >> 3;
      }

      int var6 = var3 - var2 + 1;
      int var7 = var5 - var4 + 1;
      SoftwareIndexedColorSprite var8;
      if (var1 != null && var1.aByteArray2674.length >= var6 * var7) {
        var8 = var1;
        var1.anInt1469 = var1.width = var6;
        var1.anInt1467 = var1.height = var7;
        var1.clear();
      } else {
        var8 = new SoftwareIndexedColorSprite(var6, var7, 0);
      }

      var8.offsetX = var2;
      var8.offsetY = var4;
      if (GlModel.screenCoordinatesX.length < this.amountVertices) {
        GlModel.screenCoordinatesX = new int[this.amountVertices];
        GlModel.screenCoordinatesY = new int[this.amountVertices];
      }

      int var9 = 0;

      int var13;
      int var14;
      int var15;
      while (var9 < this.vertexCCC) {
        int var10 = (
            this.vx[var9] - (this.vy[var9] * GlEnvironment.anInt1314 >> 8) >> 3)
            - var2;
        int var11 = (
            this.vz[var9] - (this.vy[var9] * GlEnvironment.anInt1315 >> 8) >> 3)
            - var4;
        int var12 = this.vertexCounts[var9];
        var13 = this.vertexCounts[var9 + 1];
        var14 = var12;

        while (true) {
          if (var14 < var13) {
            var15 = this.aShortArray3828[var14] - 1;
            if (var15 != -1) {
              GlModel.screenCoordinatesX[var15] = var10;
              GlModel.screenCoordinatesY[var15] = var11;
              ++var14;
              continue;
            }
          }

          ++var9;
          break;
        }
      }

      for (var9 = 0; var9 < this.anInt3852; ++var9) {
        short var20 = this.v0[var9];
        short var19 = this.v1[var9];
        short var21 = this.v2[var9];
        var13 = GlModel.screenCoordinatesX[var20];
        var14 = GlModel.screenCoordinatesX[var19];
        var15 = GlModel.screenCoordinatesX[var21];
        int var16 = GlModel.screenCoordinatesY[var20];
        int var17 = GlModel.screenCoordinatesY[var19];
        int var18 = GlModel.screenCoordinatesY[var21];
        if ((var13 - var14) * (var17 - var18) - (var17 - var16) * (var15
            - var14) > 0) {
          DummyClass40
              .method1147(var8.aByteArray2674, var16, var17, var18, var13,
                  var14, var15,
                  var6);
        }
      }

      return var8;
    }
  }

  private static int method1901(float var0, float var1, float var2) {
    float var3 = var0 < 0.0F ? -var0 : var0;
    float var4 = var1 < 0.0F ? -var1 : var1;
    float var5 = var2 < 0.0F ? -var2 : var2;
    return var4 > var3 && var4 > var5 ?
        var1 > 0.0F ? 0 : 1 :
        var5 > var3 && var5 > var4 ? var2 > 0.0F ? 2 : 3
            : var0 > 0.0F ? 4 : 5;
  }

  private static void method1904(int var0, int var1, int var2, int var3,
      int var4, int var5,
      float[] var6, float var7, int var8, float var9) {
    var0 -= var3;
    var1 -= var4;
    var2 -= var5;
    float var10 = var0 * var6[0] + var1 * var6[1] + var2 * var6[2];
    float var11 = var0 * var6[3] + var1 * var6[4] + var2 * var6[5];
    float var12 = var0 * var6[6] + var1 * var6[7] + var2 * var6[8];
    float var13 = (float) Math.atan2(var10, var12) / 6.2831855F + 0.5F;
    if (var7 != 1.0F) {
      var13 *= var7;
    }

    float var14 = var11 + 0.5F + var9;
    float var15;
    if (var8 == 1) {
      var15 = var13;
      var13 = -var14;
      var14 = var15;
    } else if (var8 == 2) {
      var13 = -var13;
      var14 = -var14;
    } else if (var8 == 3) {
      var15 = var13;
      var13 = var14;
      var14 = -var15;
    }

    GlModel.aFloat3863 = var13;
    GlModel.aFloat3866 = var14;
  }

  private static int method1905(int var0, short var1, int var2, byte var3) {
    int var4 = GLStatics.hslTable[GlobalStatics_1.repackHSL(var0, var2)];
    if (var1 != -1) {
      int var5 = GLStatics.textureCache.method19(93, var1 & 0xffff);
      int var6;
      int var8;
      if (var5 != 0) {
        if (var2 < 0) {
          var6 = 0;
        } else if (var2 > 127) {
          var6 = 16777215;
        } else {
          var6 = 131586 * var2;
        }

        if (var5 == 256) {
          var4 = var6;
        } else {
          var8 = 256 - var5;
          var4 =
              ((var6 & 16711935) * var5 + (var4 & 16711935) * var8 & -16711936)
                  + (
                  (var6 & 0xff00) * var5 + (var4 & 0xff00) * var8
                      & 16711680) >> 8;
        }
      }

      var6 = GLStatics.textureCache.method10(90, var1 & 0xffff);
      if (var6 != 0) {
        var6 += 256;
        int var7 = ((var4 & 16711680) >> 16) * var6;
        if (var7 > 0xffff) {
          var7 = 0xffff;
        }

        var8 = ((var4 & 0xff00) >> 8) * var6;
        if (var8 > 0xffff) {
          var8 = 0xffff;
        }

        int var9 = (var4 & 255) * var6;
        if (var9 > 0xffff) {
          var9 = 0xffff;
        }

        var4 = (var7 << 8 & 16711680) + (var8 & 0xff00) + (var9 >> 8);
      }
    }

    return (var4 << 8) + 255 - (var3 & 255);
  }

  private static float[] method1906(int var0, int var1, int var2, int var3,
      float var4,
      float var5, float var6) {
    float[] var7 = new float[9];
    float[] var8 = new float[9];
    float var9 = (float) Math.cos(var3 * 0.024543693F);
    float var10 = (float) Math.sin(var3 * 0.024543693F);
    float var11 = 1.0F - var9;
    var7[0] = var9;
    var7[1] = 0.0F;
    var7[2] = var10;
    var7[3] = 0.0F;
    var7[4] = 1.0F;
    var7[5] = 0.0F;
    var7[6] = -var10;
    var7[7] = 0.0F;
    var7[8] = var9;
    float[] var12 = new float[9];
    float var13 = 1.0F;
    float var14 = 0.0F;
    var9 = var1 / 32767.0F;
    var10 = -((float) Math.sqrt(1.0F - var9 * var9));
    var11 = 1.0F - var9;
    float var15 = (float) Math.sqrt(var0 * var0 + var2 * var2);
    if (var15 == 0.0F && var9 == 0.0F) {
      var8 = var7;
    } else {
      if (var15 != 0.0F) {
        var13 = -var2 / var15;
        var14 = var0 / var15;
      }

      var12[0] = var9 + var13 * var13 * var11;
      var12[1] = var14 * var10;
      var12[2] = var14 * var13 * var11;
      var12[3] = -var14 * var10;
      var12[4] = var9;
      var12[5] = var13 * var10;
      var12[6] = var13 * var14 * var11;
      var12[7] = -var13 * var10;
      var12[8] = var9 + var14 * var14 * var11;
      var8[0] = var7[0] * var12[0] + var7[1] * var12[3] + var7[2] * var12[6];
      var8[1] = var7[0] * var12[1] + var7[1] * var12[4] + var7[2] * var12[7];
      var8[2] = var7[0] * var12[2] + var7[1] * var12[5] + var7[2] * var12[8];
      var8[3] = var7[3] * var12[0] + var7[4] * var12[3] + var7[5] * var12[6];
      var8[4] = var7[3] * var12[1] + var7[4] * var12[4] + var7[5] * var12[7];
      var8[5] = var7[3] * var12[2] + var7[4] * var12[5] + var7[5] * var12[8];
      var8[6] = var7[6] * var12[0] + var7[7] * var12[3] + var7[8] * var12[6];
      var8[7] = var7[6] * var12[1] + var7[7] * var12[4] + var7[8] * var12[7];
      var8[8] = var7[6] * var12[2] + var7[7] * var12[5] + var7[8] * var12[8];
    }

    var8[0] *= var4;
    var8[1] *= var4;
    var8[2] *= var4;
    var8[3] *= var5;
    var8[4] *= var5;
    var8[5] *= var5;
    var8[6] *= var6;
    var8[7] *= var6;
    var8[8] *= var6;
    return var8;
  }

  private static void method1910(int var0, int var1, int var2, int var3,
      int var4, int var5,
      float[] var6, int var7, float var8) {
    var0 -= var3;
    var1 -= var4;
    var2 -= var5;
    float var9 = var0 * var6[0] + var1 * var6[1] + var2 * var6[2];
    float var10 = var0 * var6[3] + var1 * var6[4] + var2 * var6[5];
    float var11 = var0 * var6[6] + var1 * var6[7] + var2 * var6[8];
    float var12 = (float) Math
        .sqrt(var9 * var9 + var10 * var10 + var11 * var11);
    float var13 = (float) Math.atan2(var9, var11) / 6.2831855F + 0.5F;
    float var14 = (float) Math.asin(var10 / var12) / 3.1415927F + 0.5F + var8;
    float var15;
    if (var7 == 1) {
      var15 = var13;
      var13 = -var14;
      var14 = var15;
    } else if (var7 == 2) {
      var13 = -var13;
      var14 = -var14;
    } else if (var7 == 3) {
      var15 = var13;
      var13 = var14;
      var14 = -var15;
    }

    GlModel.aFloat3867 = var13;
    GlModel.aFloat3860 = var14;
  }

  private static void method1913(int var0, int var1, int var2, int var3,
      int var4, int var5,
      int var6, float[] var7, int var8, float var9, float var10,
      float var11) {
    var0 -= var3;
    var1 -= var4;
    var2 -= var5;
    float var12 = var0 * var7[0] + var1 * var7[1] + var2 * var7[2];
    float var13 = var0 * var7[3] + var1 * var7[4] + var2 * var7[5];
    float var14 = var0 * var7[6] + var1 * var7[7] + var2 * var7[8];
    float var15;
    float var16;
    if (var6 == 0) {
      var15 = var12 + var9 + 0.5F;
      var16 = -var14 + var11 + 0.5F;
    } else if (var6 == 1) {
      var15 = var12 + var9 + 0.5F;
      var16 = var14 + var11 + 0.5F;
    } else if (var6 == 2) {
      var15 = -var12 + var9 + 0.5F;
      var16 = -var13 + var10 + 0.5F;
    } else if (var6 == 3) {
      var15 = var12 + var9 + 0.5F;
      var16 = -var13 + var10 + 0.5F;
    } else if (var6 == 4) {
      var15 = var14 + var11 + 0.5F;
      var16 = -var13 + var10 + 0.5F;
    } else {
      var15 = -var14 + var11 + 0.5F;
      var16 = -var13 + var10 + 0.5F;
    }

    float var17;
    if (var8 == 1) {
      var17 = var15;
      var15 = -var16;
      var16 = var17;
    } else if (var8 == 2) {
      var15 = -var15;
      var16 = -var16;
    } else if (var8 == 3) {
      var17 = var15;
      var15 = var16;
      var16 = -var17;
    }

    GlModel.aFloat3864 = var15;
    GlModel.aFloat3858 = var16;
  }

  public static void clear69() {
    GlModel.aLongArray3821 = null;
    GlModel.indicesBuffer = null;
    GlModel.aByteBuffer3834 = null;
    GlModel.aClass140_Sub1_Sub1_3842 = null;
    GlModel.aClass140_Sub1_Sub1_3850 = null;
    GlModel.aClass140_Sub1_Sub1_3853 = null;
    GlModel.aClass140_Sub1_Sub1_3854 = null;
    GlModel.aClass140_Sub1_Sub1_3855 = null;
    GlModel.aClass140_Sub1_Sub1_3856 = null;
    GlModel.screenCoordinatesX = null;
    GlModel.screenCoordinatesY = null;
  }

  private static float[] method1921(float[] var0, int var1) {
    float[] var2 = new float[var1];
    ArrayUtils.method1360(var0, 0, var2, 0, var1);
    return var2;
  }

  private static short[] method1928(short[] var0, int var1) {
    short[] var2 = new short[var1];
    ArrayUtils.method1361(var0, 0, var2, 0, var1);
    return var2;
  }

  public static void method1929() {
    GlModel.aClass140_Sub1_Sub1_3842 = new GlModel();
    GlModel.aClass140_Sub1_Sub1_3850 = new GlModel();
    GlModel.aClass140_Sub1_Sub1_3853 = new GlModel();
    GlModel.aClass140_Sub1_Sub1_3854 = new GlModel();
    GlModel.aClass140_Sub1_Sub1_3855 = new GlModel();
    GlModel.aClass140_Sub1_Sub1_3856 = new GlModel();
  }

}
