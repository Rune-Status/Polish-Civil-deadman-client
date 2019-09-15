package com.jagex.runescape;

import com.jagex.runescape.done.AbstractModel;
import com.jagex.runescape.opengl.GLStatics;
import java.util.Arrays;

public final class SoftwareModel extends AbstractModel {

  static {
    GlobalStatics_1.anIntArray3946 = new int[1600];
    GlobalStatics_1.anIntArrayArray3926 = new int[1600][64];
    GlobalStatics_1.anIntArray3935 = new int[32];
    GlobalStatics_1.anIntArrayArray3923 = new int[32][512];

    GlobalStatics_1.anIntArray3924 = new int[1];
    GlobalStatics_1.anIntArray3939 = new int[1];
    GlobalStatics_1.anIntArray3928 = new int[4096];
    GlobalStatics_1.aShortArray3949 = new short[1];
    GlobalStatics_1.anIntArray3943 = new int[4096];
    GlobalStatics_1.anIntArrayArray3938 = new int[12][4096];
    GlobalStatics_1.anIntArray3921 = new int[4096];
    GlobalStatics_1.anIntArray3950 = new int[8192];
  }

  public int[] anIntArray3883;
  public int[] anIntArray3885;
  public int anInt3891;
  public int[] anIntArray3895;
  public boolean aBoolean3897;
  private short[] aShortArray3869;
  private int[][] anIntArrayArray3870;
  private short[] aShortArray3871;
  private int[][] anIntArrayArray3872;
  private short aShort3873;
  private int[] anIntArray3874;
  private byte aByte3875;
  private int[] anIntArray3876;
  private boolean aBoolean3877;
  private short aShort3878;
  private short aShort3879;
  private byte[] aByteArray3880;
  private int[] anIntArray3881;
  private int[] anIntArray3882;
  private short aShort3884;
  private short aShort3886;
  private int[] anIntArray3887;
  private short aShort3888;
  private int anInt3889;
  private int[] anIntArray3890;
  private short aShort3892;
  private short[] aShortArray3893;
  private short aShort3894;
  private int[] anIntArray3896;
  private int[] anIntArray3898;
  private byte[] aByteArray3899;
  private int anInt3900;
  private int[] anIntArray3901;
  private byte[] aByteArray3903;
  private short[] aShortArray3908;

  public SoftwareModel() {
  }

  public SoftwareModel(Model var1, int var2, int var3, int var4, int var5, int var6 ) {
    var1.updateNormals();
    var1.initializeSkinAndBoneGroups();
    this.anInt3891 = var1.amountVertices;
    this.anIntArray3885 = var1.vx;
    this.anIntArray3883 = var1.vy;
    this.anIntArray3895 = var1.vz;
    this.anInt3889 = var1.amountFaces;
    this.anIntArray3901 = var1.v0;
    this.anIntArray3876 = var1.v1;
    this.anIntArray3887 = var1.v2;
    this.aByteArray3880 = var1.aByteArray2889;
    this.aByteArray3903 = var1.aByteArray2843;
    this.aByte3875 = var1.aByte2848;
    this.aShortArray3869 = var1.triangleColors;
    this.anIntArrayArray3870 = var1.boneGroups;
    this.anIntArrayArray3872 = var1.skinGroups;
    this.aShortArray3871 = var1.aShortArray2855;
    this.aShortArray3893 = var1.aShortArray2893;
    int var7 = (int) Math.sqrt(var4 * var4 + var5 * var5 + var6 * var6);
    int var8 = var3 * var7 >> 8;
    this.anIntArray3898 = new int[this.anInt3889];
    this.anIntArray3874 = new int[this.anInt3889];
    this.anIntArray3896 = new int[this.anInt3889];
    int var9;
    if (var1.materials != null) {
      this.aShortArray3908 = new short[this.anInt3889];

      for (var9 = 0; var9 < this.anInt3889; ++var9) {
        short var10 = var1.materials[var9];
        if (var10 != -1 && GLStatics.textureCache.method17(var10, 77)) {
          this.aShortArray3908[var9] = var10;
        } else {
          this.aShortArray3908[var9] = -1;
        }
      }
    } else {
      this.aShortArray3908 = null;
    }

    if (var1.anInt2862 > 0 && var1.aByteArray2866 != null) {
      int[] var16 = new int[var1.anInt2862];

      int var17;
      for (var17 = 0; var17 < this.anInt3889; ++var17) {
        if (var1.aByteArray2866[var17] != -1) {
          ++var16[var1.aByteArray2866[var17] & 255];
        }
      }

      this.anInt3900 = 0;

      for (var17 = 0; var17 < var1.anInt2862; ++var17) {
        if (var16[var17] > 0 && var1.aByteArray2857[var17] == 0) {
          ++this.anInt3900;
        }
      }

      this.anIntArray3882 = new int[this.anInt3900];
      this.anIntArray3890 = new int[this.anInt3900];
      this.anIntArray3881 = new int[this.anInt3900];
      var17 = 0;

      int var11;
      for (var11 = 0; var11 < var1.anInt2862; ++var11) {
        if (var16[var11] > 0 && var1.aByteArray2857[var11] == 0) {
          this.anIntArray3882[var17] = var1.aShortArray2884[var11] & '\uffff';
          this.anIntArray3890[var17] = var1.aShortArray2846[var11] & '\uffff';
          this.anIntArray3881[var17] = var1.aShortArray2891[var11] & '\uffff';
          var16[var11] = var17++;
        } else {
          var16[var11] = -1;
        }
      }

      this.aByteArray3899 = new byte[this.anInt3889];

      for (var11 = 0; var11 < this.anInt3889; ++var11) {
        if (var1.aByteArray2866[var11] == -1) {
          this.aByteArray3899[var11] = -1;
        } else {
          this.aByteArray3899[var11] = (byte) var16[var1.aByteArray2866[var11]
              & 255];
          if (this.aByteArray3899[var11] == -1
              && this.aShortArray3908 != null) {
            this.aShortArray3908[var11] = -1;
          }
        }
      }
    }

    for (var9 = 0; var9 < this.anInt3889; ++var9) {
      byte var18;
      if (var1.normalTypes == null) {
        var18 = 0;
      } else {
        var18 = var1.normalTypes[var9];
      }

      byte var19;
      if (var1.aByteArray2843 == null) {
        var19 = 0;
      } else {
        var19 = var1.aByteArray2843[var9];
      }

      short var12;
      if (this.aShortArray3908 == null) {
        var12 = -1;
      } else {
        var12 = this.aShortArray3908[var9];
      }

      if (var19 == -2) {
        var18 = 3;
      }

      if (var19 == -1) {
        var18 = 2;
      }

      VertexNormal var13;
      int var14;
      FaceNormal var20;
      if (var12 == -1) {
        if (var18 == 0) {
          int var15 = var1.triangleColors[var9] & '\uffff';
          if (var1.aClass50Array2883 != null
            && var1.aClass50Array2883[this.anIntArray3901[var9]] != null) {
            var13 = var1.aClass50Array2883[this.anIntArray3901[var9]];
          } else {
            var13 = var1.vertexNormals[this.anIntArray3901[var9]];
          }

          var14 =
            var2 + (var4 * var13.x + var5 * var13.y + var6 * var13.z) / (var8 * var13.c) << 17;
          this.anIntArray3898[var9] = var14 | GlobalStatics_1
              .repackHSL(var15, var14 >> 17);
          if (var1.aClass50Array2883 != null
            && var1.aClass50Array2883[this.anIntArray3876[var9]] != null) {
            var13 = var1.aClass50Array2883[this.anIntArray3876[var9]];
          } else {
            var13 = var1.vertexNormals[this.anIntArray3876[var9]];
          }

          var14 =
            var2 + (var4 * var13.x + var5 * var13.y + var6 * var13.z) / (var8 * var13.c) << 17;
          this.anIntArray3874[var9] = var14 | GlobalStatics_1
              .repackHSL(var15, var14 >> 17);
          if (var1.aClass50Array2883 != null
            && var1.aClass50Array2883[this.anIntArray3887[var9]] != null) {
            var13 = var1.aClass50Array2883[this.anIntArray3887[var9]];
          } else {
            var13 = var1.vertexNormals[this.anIntArray3887[var9]];
          }

          var14 =
            var2 + (var4 * var13.x + var5 * var13.y + var6 * var13.z) / (var8 * var13.c) << 17;
          this.anIntArray3896[var9] = var14 | GlobalStatics_1
              .repackHSL(var15, var14 >> 17);
        } else if (var18 == 1) {
          var20 = var1.faceNormals[var9];
          var14 =
            var2 + (var4 * var20.x + var5 * var20.y + var6 * var20.z) / (var8 + var8 / 2) << 17;
          this.anIntArray3898[var9] =
            var14 | GlobalStatics_1
                .repackHSL(var1.triangleColors[var9] & '\uffff', var14 >> 17);
          this.anIntArray3896[var9] = -1;
        } else if (var18 == 3) {
          this.anIntArray3898[var9] = 128;
          this.anIntArray3896[var9] = -1;
        } else {
          this.anIntArray3896[var9] = -2;
        }
      } else if (var18 == 0) {
        if (var1.aClass50Array2883 != null
          && var1.aClass50Array2883[this.anIntArray3901[var9]] != null) {
          var13 = var1.aClass50Array2883[this.anIntArray3901[var9]];
        } else {
          var13 = var1.vertexNormals[this.anIntArray3901[var9]];
        }

        var14 = var2 + (var4 * var13.x + var5 * var13.y + var6 * var13.z) / (var8 * var13.c);
        this.anIntArray3898[var9] = GlobalStatics_1.method1937(var14);
        if (var1.aClass50Array2883 != null
          && var1.aClass50Array2883[this.anIntArray3876[var9]] != null) {
          var13 = var1.aClass50Array2883[this.anIntArray3876[var9]];
        } else {
          var13 = var1.vertexNormals[this.anIntArray3876[var9]];
        }

        var14 = var2 + (var4 * var13.x + var5 * var13.y + var6 * var13.z) / (var8 * var13.c);
        this.anIntArray3874[var9] = GlobalStatics_1.method1937(var14);
        if (var1.aClass50Array2883 != null
          && var1.aClass50Array2883[this.anIntArray3887[var9]] != null) {
          var13 = var1.aClass50Array2883[this.anIntArray3887[var9]];
        } else {
          var13 = var1.vertexNormals[this.anIntArray3887[var9]];
        }

        var14 = var2 + (var4 * var13.x + var5 * var13.y + var6 * var13.z) / (var8 * var13.c);
        this.anIntArray3896[var9] = GlobalStatics_1.method1937(var14);
      } else if (var18 == 1) {
        var20 = var1.faceNormals[var9];
        var14 = var2 + (var4 * var20.x + var5 * var20.y + var6 * var20.z) / (var8 + var8 / 2);
        this.anIntArray3898[var9] = GlobalStatics_1.method1937(var14);
        this.anIntArray3896[var9] = -1;
      } else {
        this.anIntArray3896[var9] = -2;
      }
    }

  }

  private SoftwareModel(SoftwareModel[] var1, int var2) {
    boolean var3 = false;
    boolean var4 = false;
    boolean var5 = false;
    boolean var6 = false;
    this.anInt3891 = 0;
    this.anInt3889 = 0;
    this.anInt3900 = 0;
    byte var7 = 0;
    byte var8 = 0;
    this.aByte3875 = -1;

    int var9;
    SoftwareModel var10;
    for (var9 = 0; var9 < var2; ++var9) {
      var10 = var1[var9];
      if (var10 != null) {
        this.anInt3891 += var10.anInt3891;
        this.anInt3889 += var10.anInt3889;
        this.anInt3900 += var10.anInt3900;
        if (var10.aByteArray3880 != null) {
          var3 = true;
        } else {
          if (this.aByte3875 == -1) {
            this.aByte3875 = var10.aByte3875;
          }

          if (this.aByte3875 != var10.aByte3875) {
            var3 = true;
          }
        }

        var4 |= var10.aByteArray3903 != null;
        var5 |= var10.aShortArray3908 != null;
        var6 |= var10.aByteArray3899 != null;
      }
    }

    this.anIntArray3885 = new int[this.anInt3891];
    this.anIntArray3883 = new int[this.anInt3891];
    this.anIntArray3895 = new int[this.anInt3891];
    this.anIntArray3901 = new int[this.anInt3889];
    this.anIntArray3876 = new int[this.anInt3889];
    this.anIntArray3887 = new int[this.anInt3889];
    this.anIntArray3898 = new int[this.anInt3889];
    this.anIntArray3874 = new int[this.anInt3889];
    this.anIntArray3896 = new int[this.anInt3889];
    if (var3) {
      this.aByteArray3880 = new byte[this.anInt3889];
    }

    if (var4) {
      this.aByteArray3903 = new byte[this.anInt3889];
    }

    if (var5) {
      this.aShortArray3908 = new short[this.anInt3889];
    }

    if (var6) {
      this.aByteArray3899 = new byte[this.anInt3889];
    }

    if (this.anInt3900 > 0) {
      this.anIntArray3882 = new int[this.anInt3900];
      this.anIntArray3890 = new int[this.anInt3900];
      this.anIntArray3881 = new int[this.anInt3900];
    }

    this.aShortArray3869 = new short[this.anInt3889];
    this.anInt3891 = 0;
    this.anInt3889 = 0;
    this.anInt3900 = 0;
    boolean var13 = false;
    boolean var12 = false;

    for (var9 = 0; var9 < var2; ++var9) {
      var10 = var1[var9];
      if (var10 != null) {
        int var11;
        for (var11 = 0; var11 < var10.anInt3889; ++var11) {
          this.anIntArray3901[this.anInt3889] = var10.anIntArray3901[var11] + this.anInt3891;
          this.anIntArray3876[this.anInt3889] = var10.anIntArray3876[var11] + this.anInt3891;
          this.anIntArray3887[this.anInt3889] = var10.anIntArray3887[var11] + this.anInt3891;
          this.anIntArray3898[this.anInt3889] = var10.anIntArray3898[var11];
          this.anIntArray3874[this.anInt3889] = var10.anIntArray3874[var11];
          this.anIntArray3896[this.anInt3889] = var10.anIntArray3896[var11];
          this.aShortArray3869[this.anInt3889] = var10.aShortArray3869[var11];
          if (var3) {
            if (var10.aByteArray3880 != null) {
              this.aByteArray3880[this.anInt3889] = var10.aByteArray3880[var11];
            } else {
              this.aByteArray3880[this.anInt3889] = var10.aByte3875;
            }
          }

          if (var4 && var10.aByteArray3903 != null) {
            this.aByteArray3903[this.anInt3889] = var10.aByteArray3903[var11];
          }

          if (var5) {
            if (var10.aShortArray3908 != null) {
              this.aShortArray3908[this.anInt3889] = var10.aShortArray3908[var11];
            } else {
              this.aShortArray3908[this.anInt3889] = -1;
            }
          }

          if (var6) {
            if (var10.aByteArray3899 != null && var10.aByteArray3899[var11] != -1) {
              this.aByteArray3899[this.anInt3889] =
                (byte) (var10.aByteArray3899[var11] + this.anInt3900);
            } else {
              this.aByteArray3899[this.anInt3889] = -1;
            }
          }

          ++this.anInt3889;
        }

        for (var11 = 0; var11 < var10.anInt3900; ++var11) {
          this.anIntArray3882[this.anInt3900] = var10.anIntArray3882[var11] + this.anInt3891;
          this.anIntArray3890[this.anInt3900] = var10.anIntArray3890[var11] + this.anInt3891;
          this.anIntArray3881[this.anInt3900] = var10.anIntArray3881[var11] + this.anInt3891;
          ++this.anInt3900;
        }

        for (var11 = 0; var11 < var10.anInt3891; ++var11) {
          this.anIntArray3885[this.anInt3891] = var10.anIntArray3885[var11];
          this.anIntArray3883[this.anInt3891] = var10.anIntArray3883[var11];
          this.anIntArray3895[this.anInt3891] = var10.anIntArray3895[var11];
          ++this.anInt3891;
        }
      }
    }

  }

  private void method1934(int var1) {
    if (GlobalStatics_1.aBooleanArray3917[var1]) {
      this.method1942(var1);
    } else {
      int var2 = this.anIntArray3901[var1];
      int var3 = this.anIntArray3876[var1];
      int var4 = this.anIntArray3887[var1];
      DummyClass40.aBoolean849 = GlobalStatics_1.aBooleanArray3937[var1];
      if (this.aByteArray3903 == null) {
        DummyClass40.anInt850 = 0;
      } else {
        DummyClass40.anInt850 = this.aByteArray3903[var1] & 255;
      }

      if (this.aShortArray3908 != null && this.aShortArray3908[var1] != -1) {
        int var5;
        int var6;
        int var7;
        if (this.aByteArray3899 != null && this.aByteArray3899[var1] != -1) {
          int var8 = this.aByteArray3899[var1] & 255;
          var5 = this.anIntArray3882[var8];
          var6 = this.anIntArray3890[var8];
          var7 = this.anIntArray3881[var8];
        } else {
          var5 = var2;
          var6 = var3;
          var7 = var4;
        }

        if (this.anIntArray3896[var1] == -1) {
          DummyClass40.method1138(GlobalStatics_1.anIntArray3932[var2],
              GlobalStatics_1.anIntArray3932[var3],
              GlobalStatics_1.anIntArray3932[var4],
              GlobalStatics_1.anIntArray3943[var2], GlobalStatics_1.anIntArray3943[var3],
              GlobalStatics_1.anIntArray3943[var4],
              this.anIntArray3898[var1], this.anIntArray3898[var1], this.anIntArray3898[var1],
              GlobalStatics_1.anIntArray3948[var5], GlobalStatics_1.anIntArray3948[var6],
              GlobalStatics_1.anIntArray3948[var7],
              GlobalStatics_1.anIntArray3928[var5],
              GlobalStatics_1.anIntArray3928[var6], GlobalStatics_1.anIntArray3928[var7],
              GlobalStatics_1.anIntArray3921[var5],
              GlobalStatics_1.anIntArray3921[var6],
              GlobalStatics_1.anIntArray3921[var7], this.aShortArray3908[var1]);
        } else {
          DummyClass40.method1138(GlobalStatics_1.anIntArray3932[var2],
              GlobalStatics_1.anIntArray3932[var3],
              GlobalStatics_1.anIntArray3932[var4],
              GlobalStatics_1.anIntArray3943[var2], GlobalStatics_1.anIntArray3943[var3],
              GlobalStatics_1.anIntArray3943[var4],
              this.anIntArray3898[var1], this.anIntArray3874[var1], this.anIntArray3896[var1],
              GlobalStatics_1.anIntArray3948[var5], GlobalStatics_1.anIntArray3948[var6],
              GlobalStatics_1.anIntArray3948[var7],
              GlobalStatics_1.anIntArray3928[var5],
              GlobalStatics_1.anIntArray3928[var6], GlobalStatics_1.anIntArray3928[var7],
              GlobalStatics_1.anIntArray3921[var5],
              GlobalStatics_1.anIntArray3921[var6],
              GlobalStatics_1.anIntArray3921[var7], this.aShortArray3908[var1]);
        }
      } else if (this.anIntArray3896[var1] == -1) {
        DummyClass40.method1144(GlobalStatics_1.anIntArray3932[var2],
            GlobalStatics_1.anIntArray3932[var3],
            GlobalStatics_1.anIntArray3932[var4],
            GlobalStatics_1.anIntArray3943[var2], GlobalStatics_1.anIntArray3943[var3],
            GlobalStatics_1.anIntArray3943[var4],
          GLStatics.hslTable[this.anIntArray3898[var1] & '\uffff']);
      } else {
        DummyClass40.method1154(GlobalStatics_1.anIntArray3932[var2],
            GlobalStatics_1.anIntArray3932[var3],
            GlobalStatics_1.anIntArray3932[var4],
            GlobalStatics_1.anIntArray3943[var2], GlobalStatics_1.anIntArray3943[var3],
            GlobalStatics_1.anIntArray3943[var4],
            this.anIntArray3898[var1] & '\uffff', this.anIntArray3874[var1] & '\uffff',
            this.anIntArray3896[var1] & '\uffff');
      }

    }
  }

  private void method1936() {
    for (int var4 = 0; var4 < this.anInt3889; ++var4) {
      short var3 =
          this.aShortArray3908 != null ? this.aShortArray3908[var4] : -1;
      if (var3 == -1) {
        int var1 = this.aShortArray3869[var4] & '\uffff';
        int var2;
        if (this.anIntArray3896[var4] == -1) {
          var2 = this.anIntArray3898[var4] & -131072;
          this.anIntArray3898[var4] = var2 | GlobalStatics_1
              .repackHSL(var1, var2 >> 17);
        } else if (this.anIntArray3896[var4] != -2) {
          var2 = this.anIntArray3898[var4] & -131072;
          this.anIntArray3898[var4] = var2 | GlobalStatics_1
              .repackHSL(var1, var2 >> 17);
          var2 = this.anIntArray3874[var4] & -131072;
          this.anIntArray3874[var4] = var2 | GlobalStatics_1
              .repackHSL(var1, var2 >> 17);
          var2 = this.anIntArray3896[var4] & -131072;
          this.anIntArray3896[var4] = var2 | GlobalStatics_1
              .repackHSL(var1, var2 >> 17);
        }
      }
    }

  }

  private AbstractModel method1939(boolean var1, boolean var2, SoftwareModel var3,
                                         byte[] var4, short[] var5, int[] var6, int[] var7,
                                         int[] var8) {
    var3.anInt3891 = this.anInt3891;
    var3.anInt3889 = this.anInt3889;
    var3.anInt3900 = this.anInt3900;
    if (var3.anIntArray3885 == null || var3.anIntArray3885.length < this.anInt3891) {
      var3.anIntArray3885 = new int[this.anInt3891 + 100];
      var3.anIntArray3883 = new int[this.anInt3891 + 100];
      var3.anIntArray3895 = new int[this.anInt3891 + 100];
    }

    int var9;
    for (var9 = 0; var9 < this.anInt3891; ++var9) {
      var3.anIntArray3885[var9] = this.anIntArray3885[var9];
      var3.anIntArray3883[var9] = this.anIntArray3883[var9];
      var3.anIntArray3895[var9] = this.anIntArray3895[var9];
    }

    if (var1) {
      var3.aByteArray3903 = this.aByteArray3903;
    } else {
      var3.aByteArray3903 = var4;
      if (this.aByteArray3903 == null) {
        for (var9 = 0; var9 < this.anInt3889; ++var9) {
          var3.aByteArray3903[var9] = 0;
        }
      } else {
        for (var9 = 0; var9 < this.anInt3889; ++var9) {
          var3.aByteArray3903[var9] = this.aByteArray3903[var9];
        }
      }
    }

    if (var2) {
      var3.aShortArray3869 = this.aShortArray3869;
      var3.anIntArray3898 = this.anIntArray3898;
      var3.anIntArray3874 = this.anIntArray3874;
      var3.anIntArray3896 = this.anIntArray3896;
    } else {
      var3.aShortArray3869 = var5;
      var3.anIntArray3898 = var6;
      var3.anIntArray3874 = var7;
      var3.anIntArray3896 = var8;

      for (var9 = 0; var9 < this.anInt3889; ++var9) {
        var3.aShortArray3869[var9] = this.aShortArray3869[var9];
        var3.anIntArray3898[var9] = this.anIntArray3898[var9];
        var3.anIntArray3874[var9] = this.anIntArray3874[var9];
        var3.anIntArray3896[var9] = this.anIntArray3896[var9];
      }
    }

    var3.anIntArray3901 = this.anIntArray3901;
    var3.anIntArray3876 = this.anIntArray3876;
    var3.anIntArray3887 = this.anIntArray3887;
    var3.aByteArray3880 = this.aByteArray3880;
    var3.aByteArray3899 = this.aByteArray3899;
    var3.aShortArray3908 = this.aShortArray3908;
    var3.aByte3875 = this.aByte3875;
    var3.anIntArray3882 = this.anIntArray3882;
    var3.anIntArray3890 = this.anIntArray3890;
    var3.anIntArray3881 = this.anIntArray3881;
    var3.anIntArrayArray3870 = this.anIntArrayArray3870;
    var3.anIntArrayArray3872 = this.anIntArrayArray3872;
    var3.aShortArray3893 = this.aShortArray3893;
    var3.aShortArray3871 = this.aShortArray3871;
    var3.aBoolean2699 = this.aBoolean2699;
    var3.aBoolean3897 = false;
    return var3;
  }

  public SoftwareModel method1941(int var1, int var2, int[][] var3,
      int[][] var4,
      int var5,
      int var6,
      int var7,
      boolean var8 ) {
    if (!this.aBoolean3897) {
      this.method1947();
    }

    int var9 = var5 + this.aShort3873;
    int var10 = var5 + this.aShort3878;
    int var11 = var7 + this.aShort3879;
    int var12 = var7 + this.aShort3888;
    if ((var1 == 1 || var1 == 2 || var1 == 3 || var1 == 5) && (var9 < 0
      || var10 + 128 >> 7 >= var3.length || var11 < 0 || var12 + 128 >> 7 >= var3[0].length)) {
      return this;
    } else {
      if (var1 != 4 && var1 != 5) {
        var9 >>= 7;
        var10 = var10 + 127 >> 7;
        var11 >>= 7;
        var12 = var12 + 127 >> 7;
        if (var3[var9][var11] == var6 && var3[var10][var11] == var6 && var3[var9][var12] == var6
          && var3[var10][var12] == var6) {
          return this;
        }
      } else {
        if (var4 == null) {
          return this;
        }

        if (var9 < 0 || var10 + 128 >> 7 >= var4.length || var11 < 0
          || var12 + 128 >> 7 >= var4[0].length) {
          return this;
        }
      }

      SoftwareModel var13;
      if (var8) {
        var13 = new SoftwareModel();
        var13.anInt3891 = this.anInt3891;
        var13.anInt3889 = this.anInt3889;
        var13.anInt3900 = this.anInt3900;
        var13.anIntArray3901 = this.anIntArray3901;
        var13.anIntArray3876 = this.anIntArray3876;
        var13.anIntArray3887 = this.anIntArray3887;
        var13.anIntArray3898 = this.anIntArray3898;
        var13.anIntArray3874 = this.anIntArray3874;
        var13.anIntArray3896 = this.anIntArray3896;
        var13.aByteArray3880 = this.aByteArray3880;
        var13.aByteArray3899 = this.aByteArray3899;
        var13.aShortArray3908 = this.aShortArray3908;
        var13.aShortArray3869 = this.aShortArray3869;
        var13.aByteArray3903 = this.aByteArray3903;
        var13.aByte3875 = this.aByte3875;
        var13.anIntArray3882 = this.anIntArray3882;
        var13.anIntArray3890 = this.anIntArray3890;
        var13.anIntArray3881 = this.anIntArray3881;
        var13.anIntArrayArray3870 = this.anIntArrayArray3870;
        var13.anIntArrayArray3872 = this.anIntArrayArray3872;
        var13.aShortArray3893 = this.aShortArray3893;
        var13.aShortArray3871 = this.aShortArray3871;
        var13.aBoolean2699 = this.aBoolean2699;
        if (var1 == 3) {
          var13.anIntArray3885 = DummyClass45.method1233(this.anIntArray3885, 2);
          var13.anIntArray3883 = DummyClass45.method1233(this.anIntArray3883, 2);
          var13.anIntArray3895 = DummyClass45.method1233(this.anIntArray3895, 2);
        } else {
          var13.anIntArray3885 = this.anIntArray3885;
          var13.anIntArray3883 = new int[var13.anInt3891];
          var13.anIntArray3895 = this.anIntArray3895;
        }
      } else {
        var13 = this;
      }

      int var14;
      int var15;
      int var17;
      int var16;
      int var19;
      int var18;
      int var21;
      int var20;
      int var23;
      int var22;
      if (var1 == 1) {
        for (var14 = 0; var14 < var13.anInt3891; ++var14) {
          var15 = this.anIntArray3885[var14] + var5;
          var16 = this.anIntArray3895[var14] + var7;
          var17 = var15 & 127;
          var18 = var16 & 127;
          var19 = var15 >> 7;
          var20 = var16 >> 7;
          var21 = var3[var19][var20] * (128 - var17) + var3[var19 + 1][var20] * var17 >> 7;
          var22 = var3[var19][var20 + 1] * (128 - var17) + var3[var19 + 1][var20 + 1] * var17 >> 7;
          var23 = var21 * (128 - var18) + var22 * var18 >> 7;
          var13.anIntArray3883[var14] = this.anIntArray3883[var14] + var23 - var6;
        }
      } else {
        int var24;
        if (var1 == 2) {
          for (var14 = 0; var14 < var13.anInt3891; ++var14) {
            var15 = (this.anIntArray3883[var14] << 16) / this.aShort3894;
            if (var15 < var2) {
              var16 = this.anIntArray3885[var14] + var5;
              var17 = this.anIntArray3895[var14] + var7;
              var18 = var16 & 127;
              var19 = var17 & 127;
              var20 = var16 >> 7;
              var21 = var17 >> 7;
              var22 = var3[var20][var21] * (128 - var18) + var3[var20 + 1][var21] * var18 >> 7;
              var23 =
                var3[var20][var21 + 1] * (128 - var18) + var3[var20 + 1][var21 + 1] * var18 >> 7;
              var24 = var22 * (128 - var19) + var23 * var19 >> 7;
              var13.anIntArray3883[var14] =
                  this.anIntArray3883[var14] + (var24 - var6) * (var2 - var15) / var2;
            } else {
              var13.anIntArray3883[var14] = this.anIntArray3883[var14];
            }
          }
        } else if (var1 == 3) {
          var14 = (var2 & 255) * 4;
          var15 = (var2 >> 8 & 255) * 4;
          var13.method1895(var3, var5, var6, var7, var14, var15);
        } else if (var1 == 4) {
          var14 = this.aShort3892 - this.aShort3894;

          for (var15 = 0; var15 < this.anInt3891; ++var15) {
            var16 = this.anIntArray3885[var15] + var5;
            var17 = this.anIntArray3895[var15] + var7;
            var18 = var16 & 127;
            var19 = var17 & 127;
            var20 = var16 >> 7;
            var21 = var17 >> 7;
            var22 = var4[var20][var21] * (128 - var18) + var4[var20 + 1][var21] * var18 >> 7;
            var23 =
              var4[var20][var21 + 1] * (128 - var18) + var4[var20 + 1][var21 + 1] * var18 >> 7;
            var24 = var22 * (128 - var19) + var23 * var19 >> 7;
            var13.anIntArray3883[var15] =
                this.anIntArray3883[var15] + (var24 - var6) + var14;
          }
        } else if (var1 == 5) {
          var14 = this.aShort3892 - this.aShort3894;

          for (var15 = 0; var15 < this.anInt3891; ++var15) {
            var16 = this.anIntArray3885[var15] + var5;
            var17 = this.anIntArray3895[var15] + var7;
            var18 = var16 & 127;
            var19 = var17 & 127;
            var20 = var16 >> 7;
            var21 = var17 >> 7;
            var22 = var3[var20][var21] * (128 - var18) + var3[var20 + 1][var21] * var18 >> 7;
            var23 =
              var3[var20][var21 + 1] * (128 - var18) + var3[var20 + 1][var21 + 1] * var18 >> 7;
            var24 = var22 * (128 - var19) + var23 * var19 >> 7;
            var22 = var4[var20][var21] * (128 - var18) + var4[var20 + 1][var21] * var18 >> 7;
            var23 =
              var4[var20][var21 + 1] * (128 - var18) + var4[var20 + 1][var21 + 1] * var18 >> 7;
            int var25 = var22 * (128 - var19) + var23 * var19 >> 7;
            int var26 = var24 - var25;
            var13.anIntArray3883[var15] =
              ((this.anIntArray3883[var15] << 8) / var14 * var26 >> 8) - (var6 - var24);
          }
        }
      }

      var13.aBoolean3897 = false;
      return var13;
    }
  }

  private void method1942(int var1) {
    int var2 = DummyClass40.anInt846;
    int var3 = DummyClass40.anInt835;
    int var4 = 0;
    int var5 = this.anIntArray3901[var1];
    int var6 = this.anIntArray3876[var1];
    int var7 = this.anIntArray3887[var1];
    int var8 = GlobalStatics_1.anIntArray3921[var5];
    int var9 = GlobalStatics_1.anIntArray3921[var6];
    int var10 = GlobalStatics_1.anIntArray3921[var7];
    if (this.aByteArray3903 == null) {
      DummyClass40.anInt850 = 0;
    } else {
      DummyClass40.anInt850 = this.aByteArray3903[var1] & 255;
    }

    int var11;
    int var12;
    int var13;
    int var14;
    if (var8 >= 50) {
      GlobalStatics_1.anIntArray3919[var4] = GlobalStatics_1.anIntArray3943[var5];
      GlobalStatics_1.anIntArray3925[var4] = GlobalStatics_1.anIntArray3932[var5];
      GlobalStatics_1.anIntArray3936[var4++] = this.anIntArray3898[var1] & '\uffff';
    } else {
      var11 = GlobalStatics_1.anIntArray3948[var5];
      var12 = GlobalStatics_1.anIntArray3928[var5];
      var13 = this.anIntArray3898[var1] & '\uffff';
      if (var10 >= 50) {
        var14 = (50 - var8) * DummyClass40.anIntArray841[var10 - var8];
        GlobalStatics_1.anIntArray3919[var4] =
          var2 + (var11 + ((GlobalStatics_1.anIntArray3948[var7] - var11) * var14 >> 16) << 9) / 50;
        GlobalStatics_1.anIntArray3925[var4] =
          var3 + (var12 + ((GlobalStatics_1.anIntArray3928[var7] - var12) * var14 >> 16) << 9) / 50;
        GlobalStatics_1.anIntArray3936[var4++] =
          var13 + (((this.anIntArray3896[var1] & '\uffff') - var13) * var14 >> 16);
      }

      if (var9 >= 50) {
        var14 = (50 - var8) * DummyClass40.anIntArray841[var9 - var8];
        GlobalStatics_1.anIntArray3919[var4] =
          var2 + (var11 + ((GlobalStatics_1.anIntArray3948[var6] - var11) * var14 >> 16) << 9) / 50;
        GlobalStatics_1.anIntArray3925[var4] =
          var3 + (var12 + ((GlobalStatics_1.anIntArray3928[var6] - var12) * var14 >> 16) << 9) / 50;
        GlobalStatics_1.anIntArray3936[var4++] =
          var13 + (((this.anIntArray3874[var1] & '\uffff') - var13) * var14 >> 16);
      }
    }

    if (var9 >= 50) {
      GlobalStatics_1.anIntArray3919[var4] = GlobalStatics_1.anIntArray3943[var6];
      GlobalStatics_1.anIntArray3925[var4] = GlobalStatics_1.anIntArray3932[var6];
      GlobalStatics_1.anIntArray3936[var4++] = this.anIntArray3874[var1] & '\uffff';
    } else {
      var11 = GlobalStatics_1.anIntArray3948[var6];
      var12 = GlobalStatics_1.anIntArray3928[var6];
      var13 = this.anIntArray3874[var1] & '\uffff';
      if (var8 >= 50) {
        var14 = (50 - var9) * DummyClass40.anIntArray841[var8 - var9];
        GlobalStatics_1.anIntArray3919[var4] =
          var2 + (var11 + ((GlobalStatics_1.anIntArray3948[var5] - var11) * var14 >> 16) << 9) / 50;
        GlobalStatics_1.anIntArray3925[var4] =
          var3 + (var12 + ((GlobalStatics_1.anIntArray3928[var5] - var12) * var14 >> 16) << 9) / 50;
        GlobalStatics_1.anIntArray3936[var4++] =
          var13 + (((this.anIntArray3898[var1] & '\uffff') - var13) * var14 >> 16);
      }

      if (var10 >= 50) {
        var14 = (50 - var9) * DummyClass40.anIntArray841[var10 - var9];
        GlobalStatics_1.anIntArray3919[var4] =
          var2 + (var11 + ((GlobalStatics_1.anIntArray3948[var7] - var11) * var14 >> 16) << 9) / 50;
        GlobalStatics_1.anIntArray3925[var4] =
          var3 + (var12 + ((GlobalStatics_1.anIntArray3928[var7] - var12) * var14 >> 16) << 9) / 50;
        GlobalStatics_1.anIntArray3936[var4++] =
          var13 + (((this.anIntArray3896[var1] & '\uffff') - var13) * var14 >> 16);
      }
    }

    if (var10 >= 50) {
      GlobalStatics_1.anIntArray3919[var4] = GlobalStatics_1.anIntArray3943[var7];
      GlobalStatics_1.anIntArray3925[var4] = GlobalStatics_1.anIntArray3932[var7];
      GlobalStatics_1.anIntArray3936[var4++] = this.anIntArray3896[var1] & '\uffff';
    } else {
      var11 = GlobalStatics_1.anIntArray3948[var7];
      var12 = GlobalStatics_1.anIntArray3928[var7];
      var13 = this.anIntArray3896[var1] & '\uffff';
      if (var9 >= 50) {
        var14 = (50 - var10) * DummyClass40.anIntArray841[var9 - var10];
        GlobalStatics_1.anIntArray3919[var4] =
          var2 + (var11 + ((GlobalStatics_1.anIntArray3948[var6] - var11) * var14 >> 16) << 9) / 50;
        GlobalStatics_1.anIntArray3925[var4] =
          var3 + (var12 + ((GlobalStatics_1.anIntArray3928[var6] - var12) * var14 >> 16) << 9) / 50;
        GlobalStatics_1.anIntArray3936[var4++] =
          var13 + (((this.anIntArray3874[var1] & '\uffff') - var13) * var14 >> 16);
      }

      if (var8 >= 50) {
        var14 = (50 - var10) * DummyClass40.anIntArray841[var8 - var10];
        GlobalStatics_1.anIntArray3919[var4] =
          var2 + (var11 + ((GlobalStatics_1.anIntArray3948[var5] - var11) * var14 >> 16) << 9) / 50;
        GlobalStatics_1.anIntArray3925[var4] =
          var3 + (var12 + ((GlobalStatics_1.anIntArray3928[var5] - var12) * var14 >> 16) << 9) / 50;
        GlobalStatics_1.anIntArray3936[var4++] =
          var13 + (((this.anIntArray3898[var1] & '\uffff') - var13) * var14 >> 16);
      }
    }

    var11 = GlobalStatics_1.anIntArray3919[0];
    var12 = GlobalStatics_1.anIntArray3919[1];
    var13 = GlobalStatics_1.anIntArray3919[2];
    var14 = GlobalStatics_1.anIntArray3925[0];
    int var15 = GlobalStatics_1.anIntArray3925[1];
    int var16 = GlobalStatics_1.anIntArray3925[2];
    DummyClass40.aBoolean849 = false;
    int var17;
    int var19;
    int var18;
    int var20;
    if (var4 == 3) {
      if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > DummyClass40.anInt847
        || var12 > DummyClass40.anInt847 || var13 > DummyClass40.anInt847) {
        DummyClass40.aBoolean849 = true;
      }

      if (this.aShortArray3908 != null && this.aShortArray3908[var1] != -1) {
        if (this.aByteArray3899 != null && this.aByteArray3899[var1] != -1) {
          var20 = this.aByteArray3899[var1] & 255;
          var17 = this.anIntArray3882[var20];
          var18 = this.anIntArray3890[var20];
          var19 = this.anIntArray3881[var20];
        } else {
          var17 = var5;
          var18 = var6;
          var19 = var7;
        }

        if (this.anIntArray3896[var1] == -1) {
          DummyClass40.method1138(var14, var15, var16, var11, var12, var13,
              this.anIntArray3898[var1], this.anIntArray3898[var1], this.anIntArray3898[var1],
              GlobalStatics_1.anIntArray3948[var17], GlobalStatics_1.anIntArray3948[var18],
              GlobalStatics_1.anIntArray3948[var19],
              GlobalStatics_1.anIntArray3928[var17], GlobalStatics_1.anIntArray3928[var18],
              GlobalStatics_1.anIntArray3928[var19],
              GlobalStatics_1.anIntArray3921[var17], GlobalStatics_1.anIntArray3921[var18],
              GlobalStatics_1.anIntArray3921[var19],
              this.aShortArray3908[var1]);
        } else {
          DummyClass40.method1138(var14, var15, var16, var11, var12, var13,
              GlobalStatics_1.anIntArray3936[0],
              GlobalStatics_1.anIntArray3936[1], GlobalStatics_1.anIntArray3936[2], GlobalStatics_1.anIntArray3948[var17],
              GlobalStatics_1.anIntArray3948[var18],
              GlobalStatics_1.anIntArray3948[var19], GlobalStatics_1.anIntArray3928[var17],
              GlobalStatics_1.anIntArray3928[var18],
              GlobalStatics_1.anIntArray3928[var19], GlobalStatics_1.anIntArray3921[var17],
              GlobalStatics_1.anIntArray3921[var18],
              GlobalStatics_1.anIntArray3921[var19], this.aShortArray3908[var1]);
        }
      } else if (this.anIntArray3896[var1] == -1) {
        DummyClass40.method1144(var14, var15, var16, var11, var12, var13,
          GLStatics.hslTable[this.anIntArray3898[var1] & '\uffff']);
      } else {
        DummyClass40.method1154(var14, var15, var16, var11, var12, var13,
            GlobalStatics_1.anIntArray3936[0],
            GlobalStatics_1.anIntArray3936[1], GlobalStatics_1.anIntArray3936[2]);
      }
    }

    if (var4 == 4) {
      if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > DummyClass40.anInt847
        || var12 > DummyClass40.anInt847 || var13 > DummyClass40.anInt847 ||
          GlobalStatics_1.anIntArray3919[3] < 0
        || GlobalStatics_1.anIntArray3919[3] > DummyClass40.anInt847) {
        DummyClass40.aBoolean849 = true;
      }

      if (this.aShortArray3908 != null && this.aShortArray3908[var1] != -1) {
        if (this.aByteArray3899 != null && this.aByteArray3899[var1] != -1) {
          var20 = this.aByteArray3899[var1] & 255;
          var17 = this.anIntArray3882[var20];
          var18 = this.anIntArray3890[var20];
          var19 = this.anIntArray3881[var20];
        } else {
          var17 = var5;
          var18 = var6;
          var19 = var7;
        }

        short var21 = this.aShortArray3908[var1];
        if (this.anIntArray3896[var1] == -1) {
          DummyClass40.method1138(var14, var15, var16, var11, var12, var13,
              this.anIntArray3898[var1], this.anIntArray3898[var1], this.anIntArray3898[var1],
              GlobalStatics_1.anIntArray3948[var17], GlobalStatics_1.anIntArray3948[var18],
              GlobalStatics_1.anIntArray3948[var19],
              GlobalStatics_1.anIntArray3928[var17], GlobalStatics_1.anIntArray3928[var18],
              GlobalStatics_1.anIntArray3928[var19],
              GlobalStatics_1.anIntArray3921[var17], GlobalStatics_1.anIntArray3921[var18],
              GlobalStatics_1.anIntArray3921[var19], var21);
          DummyClass40.method1138(var14, var16, GlobalStatics_1.anIntArray3925[3], var11, var13,
              GlobalStatics_1.anIntArray3919[3],
              this.anIntArray3898[var1], this.anIntArray3898[var1], this.anIntArray3898[var1],
              GlobalStatics_1.anIntArray3948[var17], GlobalStatics_1.anIntArray3948[var18],
              GlobalStatics_1.anIntArray3948[var19],
              GlobalStatics_1.anIntArray3928[var17], GlobalStatics_1.anIntArray3928[var18],
              GlobalStatics_1.anIntArray3928[var19],
              GlobalStatics_1.anIntArray3921[var17], GlobalStatics_1.anIntArray3921[var18],
              GlobalStatics_1.anIntArray3921[var19], var21);
        } else {
          DummyClass40.method1138(var14, var15, var16, var11, var12, var13,
              GlobalStatics_1.anIntArray3936[0],
              GlobalStatics_1.anIntArray3936[1], GlobalStatics_1.anIntArray3936[2], GlobalStatics_1.anIntArray3948[var17],
              GlobalStatics_1.anIntArray3948[var18],
              GlobalStatics_1.anIntArray3948[var19], GlobalStatics_1.anIntArray3928[var17],
              GlobalStatics_1.anIntArray3928[var18],
              GlobalStatics_1.anIntArray3928[var19], GlobalStatics_1.anIntArray3921[var17],
              GlobalStatics_1.anIntArray3921[var18],
              GlobalStatics_1.anIntArray3921[var19], var21);
          DummyClass40.method1138(var14, var16, GlobalStatics_1.anIntArray3925[3], var11, var13,
              GlobalStatics_1.anIntArray3919[3],
              GlobalStatics_1.anIntArray3936[0], GlobalStatics_1.anIntArray3936[2], GlobalStatics_1.anIntArray3936[3],
              GlobalStatics_1.anIntArray3948[var17],
              GlobalStatics_1.anIntArray3948[var18], GlobalStatics_1.anIntArray3948[var19],
              GlobalStatics_1.anIntArray3928[var17],
              GlobalStatics_1.anIntArray3928[var18], GlobalStatics_1.anIntArray3928[var19],
              GlobalStatics_1.anIntArray3921[var17],
              GlobalStatics_1.anIntArray3921[var18], GlobalStatics_1.anIntArray3921[var19], var21);
        }
      } else if (this.anIntArray3896[var1] == -1) {
        var17 = GLStatics.hslTable[this.anIntArray3898[var1] & '\uffff'];
        DummyClass40.method1144(var14, var15, var16, var11, var12, var13, var17);
        DummyClass40.method1144(var14, var16, GlobalStatics_1.anIntArray3925[3], var11, var13,
            GlobalStatics_1.anIntArray3919[3],
          var17);
      } else {
        DummyClass40.method1154(var14, var15, var16, var11, var12, var13,
            GlobalStatics_1.anIntArray3936[0],
            GlobalStatics_1.anIntArray3936[1], GlobalStatics_1.anIntArray3936[2]);
        DummyClass40.method1154(var14, var16, GlobalStatics_1.anIntArray3925[3], var11, var13,
            GlobalStatics_1.anIntArray3919[3],
            GlobalStatics_1.anIntArray3936[0], GlobalStatics_1.anIntArray3936[2], GlobalStatics_1.anIntArray3936[3]);
      }
    }

  }

  public int method1872() {
    if (!this.aBoolean3897) {
      this.method1947();
    }

    return this.aShort3888;
  }

  public boolean method1873() {
    if (this.anIntArrayArray3870 == null) {
      return false;
    } else {
      GlobalStatics_1.anInt3945 = 0;
      GlobalStatics_1.anInt3934 = 0;
      GlobalStatics_1.anInt3940 = 0;
      return true;
    }
  }

  public void method1874() {
    for (int var1 = 0; var1 < this.anInt3891; ++var1) {
      this.anIntArray3885[var1] = -this.anIntArray3885[var1];
      this.anIntArray3895[var1] = -this.anIntArray3895[var1];
    }

    this.aBoolean3897 = false;
  }

  public void method1876(int var1 ) {
    int var2 = GLStatics.SINE_TABLE[var1];
    int var3 = DummyClass40.COSINE_TABLE[var1];

    for (int var4 = 0; var4 < this.anInt3891; ++var4) {
      int var5 =
          this.anIntArray3895[var4] * var2 + this.anIntArray3885[var4] * var3 >> 16;
      this.anIntArray3895[var4] =
          this.anIntArray3895[var4] * var3 - this.anIntArray3885[var4] * var2 >> 16;
      this.anIntArray3885[var4] = var5;
    }

    this.aBoolean3897 = false;
  }

  public void method1879() {
    if (this.aBoolean3877) {
      this.method1936();
      this.aBoolean3877 = false;
    }

    this.aBoolean3897 = false;
  }

  public void scale(int var1, int var2, int var3 ) {
    for (int var4 = 0; var4 < this.anInt3891; ++var4) {
      this.anIntArray3885[var4] = this.anIntArray3885[var4] * var1 / 128;
      this.anIntArray3883[var4] = this.anIntArray3883[var4] * var2 / 128;
      this.anIntArray3895[var4] = this.anIntArray3895[var4] * var3 / 128;
    }

    this.aBoolean3897 = false;
  }

  public AbstractModel method1882(boolean var1, boolean var2, boolean var3 ) {
    if (!var1 && GlobalStatics_1.aByteArray3914.length < this.anInt3889) {
      GlobalStatics_1.aByteArray3914 = new byte[this.anInt3889 + 100];
    }

    if (!var2 && GlobalStatics_1.aShortArray3912.length < this.anInt3889) {
      GlobalStatics_1.anIntArray3913 = new int[this.anInt3889 + 100];
      GlobalStatics_1.anIntArray3916 = new int[this.anInt3889 + 100];
      GlobalStatics_1.anIntArray3911 = new int[this.anInt3889 + 100];
      GlobalStatics_1.aShortArray3912 = new short[this.anInt3889 + 100];
    }

    return this.method1939(var1, var2, GlobalStatics_1.aClass140_Sub1_Sub2_3906,
        GlobalStatics_1.aByteArray3914,
        GlobalStatics_1.aShortArray3912,
        GlobalStatics_1.anIntArray3913, GlobalStatics_1.anIntArray3916, GlobalStatics_1.anIntArray3911);
  }

  public int method1883() {
    if (!this.aBoolean3897) {
      this.method1947();
    }

    return this.aShort3878;
  }

  public int method1884() {
    if (!this.aBoolean3897) {
      this.method1947();
    }

    return this.aShort3873;
  }

  public void rotateQuarterY() {
    for (int var1 = 0; var1 < this.anInt3891; ++var1) {
      int var2 = this.anIntArray3885[var1];
      this.anIntArray3885[var1] = this.anIntArray3895[var1];
      this.anIntArray3895[var1] = -var2;
    }

    this.aBoolean3897 = false;
  }

  public void method1886(int var1 ) {
    int var2 = GLStatics.SINE_TABLE[var1];
    int var3 = DummyClass40.COSINE_TABLE[var1];

    for (int var4 = 0; var4 < this.anInt3891; ++var4) {
      int var5 =
          this.anIntArray3883[var4] * var2 + this.anIntArray3885[var4] * var3 >> 16;
      this.anIntArray3883[var4] =
          this.anIntArray3883[var4] * var3 - this.anIntArray3885[var4] * var2 >> 16;
      this.anIntArray3885[var4] = var5;
    }

    this.aBoolean3897 = false;
  }

  public int method1888() {
    if (!this.aBoolean3897) {
      this.method1947();
    }

    return this.aShort3884;
  }

  public void method1889(int var1, int var2, int var3, int var4 ) {
    int var5;
    int var6;
    if (var1 == 0) {
      var5 = 0;
      GlobalStatics_1.anInt3945 = 0;
      GlobalStatics_1.anInt3934 = 0;
      GlobalStatics_1.anInt3940 = 0;

      for (var6 = 0; var6 < this.anInt3891; ++var6) {
        GlobalStatics_1.anInt3945 += this.anIntArray3885[var6];
        GlobalStatics_1.anInt3934 += this.anIntArray3883[var6];
        GlobalStatics_1.anInt3940 += this.anIntArray3895[var6];
        ++var5;
      }

      if (var5 > 0) {
        GlobalStatics_1.anInt3945 = GlobalStatics_1.anInt3945 / var5 + var2;
        GlobalStatics_1.anInt3934 = GlobalStatics_1.anInt3934 / var5 + var3;
        GlobalStatics_1.anInt3940 = GlobalStatics_1.anInt3940 / var5 + var4;
      } else {
        GlobalStatics_1.anInt3945 = var2;
        GlobalStatics_1.anInt3934 = var3;
        GlobalStatics_1.anInt3940 = var4;
      }

    } else if (var1 == 1) {
      for (var5 = 0; var5 < this.anInt3891; ++var5) {
        this.anIntArray3885[var5] += var2;
        this.anIntArray3883[var5] += var3;
        this.anIntArray3895[var5] += var4;
      }

    } else {
      int var7;
      int var8;
      if (var1 == 2) {
        for (var5 = 0; var5 < this.anInt3891; ++var5) {
          this.anIntArray3885[var5] -= GlobalStatics_1.anInt3945;
          this.anIntArray3883[var5] -= GlobalStatics_1.anInt3934;
          this.anIntArray3895[var5] -= GlobalStatics_1.anInt3940;
          if (var4 != 0) {
            var6 = GLStatics.SINE_TABLE[var4];
            var7 = DummyClass40.COSINE_TABLE[var4];
            var8 =
                this.anIntArray3883[var5] * var6 + this.anIntArray3885[var5] * var7 + 32767 >> 16;
            this.anIntArray3883[var5] =
                this.anIntArray3883[var5] * var7 - this.anIntArray3885[var5] * var6 + 32767 >> 16;
            this.anIntArray3885[var5] = var8;
          }

          if (var2 != 0) {
            var6 = GLStatics.SINE_TABLE[var2];
            var7 = DummyClass40.COSINE_TABLE[var2];
            var8 =
                this.anIntArray3883[var5] * var7 - this.anIntArray3895[var5] * var6 + 32767 >> 16;
            this.anIntArray3895[var5] =
                this.anIntArray3883[var5] * var6 + this.anIntArray3895[var5] * var7 + 32767 >> 16;
            this.anIntArray3883[var5] = var8;
          }

          if (var3 != 0) {
            var6 = GLStatics.SINE_TABLE[var3];
            var7 = DummyClass40.COSINE_TABLE[var3];
            var8 =
                this.anIntArray3895[var5] * var6 + this.anIntArray3885[var5] * var7 + 32767 >> 16;
            this.anIntArray3895[var5] =
                this.anIntArray3895[var5] * var7 - this.anIntArray3885[var5] * var6 + 32767 >> 16;
            this.anIntArray3885[var5] = var8;
          }

          this.anIntArray3885[var5] += GlobalStatics_1.anInt3945;
          this.anIntArray3883[var5] += GlobalStatics_1.anInt3934;
          this.anIntArray3895[var5] += GlobalStatics_1.anInt3940;
        }

      } else if (var1 != 3) {
        if (var1 == 5) {
          for (var5 = 0; var5 < this.anInt3889; ++var5) {
            var6 = (this.aByteArray3903[var5] & 255) + var2 * 8;
            if (var6 < 0) {
              var6 = 0;
            } else if (var6 > 255) {
              var6 = 255;
            }

            this.aByteArray3903[var5] = (byte) var6;
          }

        } else if (var1 == 7) {
          for (var5 = 0; var5 < this.anInt3889; ++var5) {
            var6 = this.aShortArray3869[var5] & '\uffff';
            var7 = var6 >> 10 & 63;
            var8 = var6 >> 7 & 7;
            int var9 = var6 & 127;
            var7 = var7 + var2 & 63;
            var8 += var3;
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

            this.aShortArray3869[var5] = (short) (var7 << 10 | var8 << 7 | var9);
          }

          this.aBoolean3877 = true;
        }
      } else {
        for (var5 = 0; var5 < this.anInt3891; ++var5) {
          this.anIntArray3885[var5] -= GlobalStatics_1.anInt3945;
          this.anIntArray3883[var5] -= GlobalStatics_1.anInt3934;
          this.anIntArray3895[var5] -= GlobalStatics_1.anInt3940;
          this.anIntArray3885[var5] = this.anIntArray3885[var5] * var2 / 128;
          this.anIntArray3883[var5] = this.anIntArray3883[var5] * var3 / 128;
          this.anIntArray3895[var5] = this.anIntArray3895[var5] * var4 / 128;
          this.anIntArray3885[var5] += GlobalStatics_1.anInt3945;
          this.anIntArray3883[var5] += GlobalStatics_1.anInt3934;
          this.anIntArray3895[var5] += GlobalStatics_1.anInt3940;
        }

      }
    }
  }

  public AbstractModel method1890(boolean var1, boolean var2, boolean var3 ) {
    if (!var1 && GlobalStatics_1.aByteArray3933.length < this.anInt3889) {
      GlobalStatics_1.aByteArray3933 = new byte[this.anInt3889 + 100];
    }

    if (!var2 && GlobalStatics_1.aShortArray3949.length < this.anInt3889) {
      GlobalStatics_1.anIntArray3939 = new int[this.anInt3889 + 100];
      GlobalStatics_1.anIntArray3947 = new int[this.anInt3889 + 100];
      GlobalStatics_1.anIntArray3924 = new int[this.anInt3889 + 100];
      GlobalStatics_1.aShortArray3949 = new short[this.anInt3889 + 100];
    }

    return this.method1939(var1, var2, GlobalStatics_1.aClass140_Sub1_Sub2_3915,
        GlobalStatics_1.aByteArray3933,
        GlobalStatics_1.aShortArray3949,
        GlobalStatics_1.anIntArray3939, GlobalStatics_1.anIntArray3947, GlobalStatics_1.anIntArray3924);
  }

  public void method1891(int var1, int[] var2, int var3, int var4, int var5,
      boolean var6 ) {
    int var7 = var2.length;
    int var8;
    int var9;
    int var12;
    int var13;
    if (var1 == 0) {
      var8 = 0;
      GlobalStatics_1.anInt3945 = 0;
      GlobalStatics_1.anInt3934 = 0;
      GlobalStatics_1.anInt3940 = 0;

      for (var9 = 0; var9 < var7; ++var9) {
        int var17 = var2[var9];
        if (var17 < this.anIntArrayArray3870.length) {
          int[] var18 = this.anIntArrayArray3870[var17];

          for (var12 = 0; var12 < var18.length; ++var12) {
            var13 = var18[var12];
            GlobalStatics_1.anInt3945 += this.anIntArray3885[var13];
            GlobalStatics_1.anInt3934 += this.anIntArray3883[var13];
            GlobalStatics_1.anInt3940 += this.anIntArray3895[var13];
            ++var8;
          }
        }
      }

      if (var8 > 0) {
        GlobalStatics_1.anInt3945 = GlobalStatics_1.anInt3945 / var8 + var3;
        GlobalStatics_1.anInt3934 = GlobalStatics_1.anInt3934 / var8 + var4;
        GlobalStatics_1.anInt3940 = GlobalStatics_1.anInt3940 / var8 + var5;
      } else {
        GlobalStatics_1.anInt3945 = var3;
        GlobalStatics_1.anInt3934 = var4;
        GlobalStatics_1.anInt3940 = var5;
      }

    } else {
      int[] var10;
      int var11;
      if (var1 == 1) {
        for (var8 = 0; var8 < var7; ++var8) {
          var9 = var2[var8];
          if (var9 < this.anIntArrayArray3870.length) {
            var10 = this.anIntArrayArray3870[var9];

            for (var11 = 0; var11 < var10.length; ++var11) {
              var12 = var10[var11];
              this.anIntArray3885[var12] += var3;
              this.anIntArray3883[var12] += var4;
              this.anIntArray3895[var12] += var5;
            }
          }
        }

      } else {
        int var14;
        int var15;
        if (var1 == 2) {
          for (var8 = 0; var8 < var7; ++var8) {
            var9 = var2[var8];
            if (var9 < this.anIntArrayArray3870.length) {
              var10 = this.anIntArrayArray3870[var9];

              for (var11 = 0; var11 < var10.length; ++var11) {
                var12 = var10[var11];
                this.anIntArray3885[var12] -= GlobalStatics_1.anInt3945;
                this.anIntArray3883[var12] -= GlobalStatics_1.anInt3934;
                this.anIntArray3895[var12] -= GlobalStatics_1.anInt3940;
                if (var5 != 0) {
                  var13 = GLStatics.SINE_TABLE[var5];
                  var14 = DummyClass40.COSINE_TABLE[var5];
                  var15 =
                      this.anIntArray3883[var12] * var13 + this.anIntArray3885[var12] * var14 + 32767
                      >> 16;
                  this.anIntArray3883[var12] =
                      this.anIntArray3883[var12] * var14 - this.anIntArray3885[var12] * var13 + 32767
                      >> 16;
                  this.anIntArray3885[var12] = var15;
                }

                if (var3 != 0) {
                  var13 = GLStatics.SINE_TABLE[var3];
                  var14 = DummyClass40.COSINE_TABLE[var3];
                  var15 =
                      this.anIntArray3883[var12] * var14 - this.anIntArray3895[var12] * var13 + 32767
                      >> 16;
                  this.anIntArray3895[var12] =
                      this.anIntArray3883[var12] * var13 + this.anIntArray3895[var12] * var14 + 32767
                      >> 16;
                  this.anIntArray3883[var12] = var15;
                }

                if (var4 != 0) {
                  var13 = GLStatics.SINE_TABLE[var4];
                  var14 = DummyClass40.COSINE_TABLE[var4];
                  var15 =
                      this.anIntArray3895[var12] * var13 + this.anIntArray3885[var12] * var14 + 32767
                      >> 16;
                  this.anIntArray3895[var12] =
                      this.anIntArray3895[var12] * var14 - this.anIntArray3885[var12] * var13 + 32767
                      >> 16;
                  this.anIntArray3885[var12] = var15;
                }

                this.anIntArray3885[var12] += GlobalStatics_1.anInt3945;
                this.anIntArray3883[var12] += GlobalStatics_1.anInt3934;
                this.anIntArray3895[var12] += GlobalStatics_1.anInt3940;
              }
            }
          }

        } else if (var1 == 3) {
          for (var8 = 0; var8 < var7; ++var8) {
            var9 = var2[var8];
            if (var9 < this.anIntArrayArray3870.length) {
              var10 = this.anIntArrayArray3870[var9];

              for (var11 = 0; var11 < var10.length; ++var11) {
                var12 = var10[var11];
                this.anIntArray3885[var12] -= GlobalStatics_1.anInt3945;
                this.anIntArray3883[var12] -= GlobalStatics_1.anInt3934;
                this.anIntArray3895[var12] -= GlobalStatics_1.anInt3940;
                this.anIntArray3885[var12] = this.anIntArray3885[var12] * var3 / 128;
                this.anIntArray3883[var12] = this.anIntArray3883[var12] * var4 / 128;
                this.anIntArray3895[var12] = this.anIntArray3895[var12] * var5 / 128;
                this.anIntArray3885[var12] += GlobalStatics_1.anInt3945;
                this.anIntArray3883[var12] += GlobalStatics_1.anInt3934;
                this.anIntArray3895[var12] += GlobalStatics_1.anInt3940;
              }
            }
          }

        } else if (var1 == 5) {
          if (this.anIntArrayArray3872 != null && this.aByteArray3903 != null) {
            for (var8 = 0; var8 < var7; ++var8) {
              var9 = var2[var8];
              if (var9 < this.anIntArrayArray3872.length) {
                var10 = this.anIntArrayArray3872[var9];

                for (var11 = 0; var11 < var10.length; ++var11) {
                  var12 = var10[var11];
                  var13 = (this.aByteArray3903[var12] & 255) + var3 * 8;
                  if (var13 < 0) {
                    var13 = 0;
                  } else if (var13 > 255) {
                    var13 = 255;
                  }

                  this.aByteArray3903[var12] = (byte) var13;
                }
              }
            }
          }

        } else if (var1 == 7) {
          if (this.anIntArrayArray3872 != null) {
            for (var8 = 0; var8 < var7; ++var8) {
              var9 = var2[var8];
              if (var9 < this.anIntArrayArray3872.length) {
                var10 = this.anIntArrayArray3872[var9];

                for (var11 = 0; var11 < var10.length; ++var11) {
                  var12 = var10[var11];
                  var13 = this.aShortArray3869[var12] & '\uffff';
                  var14 = var13 >> 10 & 63;
                  var15 = var13 >> 7 & 7;
                  int var16 = var13 & 127;
                  var14 = var14 + var3 & 63;
                  var15 += var4;
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

                  this.aShortArray3869[var12] = (short) (var14 << 10 | var15 << 7 | var16);
                }

                this.aBoolean3877 = true;
              }
            }
          }

        }
      }
    }
  }

  public void draw(int var1, int var2, int var3, int var4, int var5, int var6,
      int var7,
      long var8 ) {
    if (!this.aBoolean3897) {
        this.method1947();
      }

      int var10 = DummyClass40.anInt846;
      int var11 = DummyClass40.anInt835;
      int var12 = GLStatics.SINE_TABLE[var1];
      int var13 = DummyClass40.COSINE_TABLE[var1];
      int var14 = GLStatics.SINE_TABLE[var2];
      int var15 = DummyClass40.COSINE_TABLE[var2];
      int var16 = GLStatics.SINE_TABLE[var3];
      int var17 = DummyClass40.COSINE_TABLE[var3];
      int var18 = GLStatics.SINE_TABLE[var4];
      int var19 = DummyClass40.COSINE_TABLE[var4];
      int var20 = var6 * var18 + var7 * var19 >> 16;

      for (int var21 = 0; var21 < this.anInt3891; ++var21) {
        int var22 = this.anIntArray3885[var21];
        int var23 = this.anIntArray3883[var21];
        int var24 = this.anIntArray3895[var21];
        int var25;
        if (var3 != 0) {
          var25 = var23 * var16 + var22 * var17 >> 16;
          var23 = var23 * var17 - var22 * var16 >> 16;
          var22 = var25;
        }

        if (var1 != 0) {
          var25 = var23 * var13 - var24 * var12 >> 16;
          var24 = var23 * var12 + var24 * var13 >> 16;
          var23 = var25;
        }

        if (var2 != 0) {
          var25 = var24 * var14 + var22 * var15 >> 16;
          var24 = var24 * var15 - var22 * var14 >> 16;
          var22 = var25;
        }

        var22 += var5;
        var23 += var6;
        var24 += var7;
        var25 = var23 * var19 - var24 * var18 >> 16;
        var24 = var23 * var18 + var24 * var19 >> 16;
        GlobalStatics_1.anIntArray3920[var21] = var24 - var20;
        GlobalStatics_1.anIntArray3943[var21] = var10 + (var22 << 9) / var24;
        GlobalStatics_1.anIntArray3932[var21] = var11 + (var25 << 9) / var24;
        if (this.anInt3900 > 0) {
          GlobalStatics_1.anIntArray3948[var21] = var22;
          GlobalStatics_1.anIntArray3928[var21] = var25;
          GlobalStatics_1.anIntArray3921[var21] = var24;
        }
      }

      this.method1945(false, var8 >= 0L, var8, this.aShort3886, this.aShort3886 << 1, null);

  }

  public AbstractModel method1894(boolean var1, boolean var2, boolean var3 ) {
    if (!var1 && GlobalStatics_1.aByteArray3907.length < this.anInt3889) {
      GlobalStatics_1.aByteArray3907 = new byte[this.anInt3889 + 100];
    }

    if (!var2 && GlobalStatics_1.aShortArray3910.length < this.anInt3889) {
      GlobalStatics_1.anIntArray3905 = new int[this.anInt3889 + 100];
      GlobalStatics_1.anIntArray3909 = new int[this.anInt3889 + 100];
      GlobalStatics_1.anIntArray3904 = new int[this.anInt3889 + 100];
      GlobalStatics_1.aShortArray3910 = new short[this.anInt3889 + 100];
    }

    return this.method1939(var1, var2, GlobalStatics_1.aClass140_Sub1_Sub2_3902,
        GlobalStatics_1.aByteArray3907,
        GlobalStatics_1.aShortArray3910,
        GlobalStatics_1.anIntArray3905, GlobalStatics_1.anIntArray3909, GlobalStatics_1.anIntArray3904);
  }

  public void method1896(int var1 ) {
    int var2 = GLStatics.SINE_TABLE[var1];
    int var3 = DummyClass40.COSINE_TABLE[var1];

    for (int var4 = 0; var4 < this.anInt3891; ++var4) {
      int var5 =
          this.anIntArray3883[var4] * var3 - this.anIntArray3895[var4] * var2 >> 16;
      this.anIntArray3895[var4] =
          this.anIntArray3883[var4] * var2 + this.anIntArray3895[var4] * var3 >> 16;
      this.anIntArray3883[var4] = var5;
    }

    this.aBoolean3897 = false;
  }

  public void draw(int var1, int var2, int var3, int var4, int var5, int var6,
      int var7,
      int var8,
      long var9,
      int var11,
      DummyClass0 var12 ) {
    if (!this.aBoolean3897) {
      this.method1947();
    }

    int var15 = var8 * var5 - var6 * var4 >> 16;
    int var16 = var7 * var2 + var15 * var3 >> 16;
    int var13 = var16 + (this.aShort3884 * var3 + this.aShort3892 * var2 >> 16);
    int var14 = var16 + (-this.aShort3884 * var3 + this.aShort3894 * var2 >> 16);
    if (var13 > 50) {
      if (var14 < 3500) {
        int var17 = var8 * var4 + var6 * var5 >> 16;
        int var18 = var17 + this.aShort3884 << 9;
        if (var18 / var13 > DummyClass17.screenLowerX) {
          int var19 = var17 - this.aShort3884 << 9;
          if (var19 / var13 < GlobalStatics_10.screenUpperX) {
            int var20 = var7 * var3 - var15 * var2 >> 16;
            int var21 = var20 + (
                this.aShort3884 * var2 + this.aShort3892 * var3 >> 16) << 9;
            if (var21 / var13 > DummyClass3.screenUpperY) {
              int var22 = var20 + (-this.aShort3884
                  * var2 + this.aShort3894 * var3 >> 16) << 9;
              if (var22 / var13 < GLStatics.screenLowerY) {
                boolean var23 = false;
                boolean var24 = var14 <= 50;
                boolean var25 = var24 || this.anInt3900 > 0;
                int var26 = DummyClass40.anInt846;
                int var27 = DummyClass40.anInt835;
                int var28 = 0;
                int var29 = 0;
                if (var1 != 0) {
                  var28 = GLStatics.SINE_TABLE[var1];
                  var29 = DummyClass40.COSINE_TABLE[var1];
                }

                boolean var30 = false;
                int var31;
                int var34;
                int var32;
                int var33;
                if (var9 > 0L && GlobalStatics_10.aBoolean3094 && var14 > 0) {
                  if (var17 > 0) {
                    var31 = var19 / var13;
                    var33 = var18 / var14;
                  } else {
                    var31 = var19 / var14;
                    var33 = var18 / var13;
                  }

                  if (var20 > 0) {
                    var32 = var22 / var13;
                    var34 = var21 / var14;
                  } else {
                    var32 = var22 / var14;
                    var34 = var21 / var13;
                  }

                  if (GlobalStatics_9.anInt3642 >= var31 && GlobalStatics_9.anInt3642 <= var33
                    && GlobalStatics_9.anInt384 >= var32 && GlobalStatics_9.anInt384 <= var34) {
                    var31 = 999999;
                    var33 = -999999;
                    var32 = 999999;
                    var34 = -999999;
                    int[] var35 = {
                        this.aShort3873, this.aShort3878, this.aShort3873,
                        this.aShort3878,
                        this.aShort3873, this.aShort3878, this.aShort3873,
                        this.aShort3878
                    };
                    int[] var36 = {
                        this.aShort3879, this.aShort3879, this.aShort3888,
                        this.aShort3888,
                        this.aShort3879, this.aShort3879, this.aShort3888,
                        this.aShort3888
                    };
                    int[] var37 = {
                        this.aShort3894, this.aShort3894, this.aShort3894,
                        this.aShort3894,
                        this.aShort3892, this.aShort3892, this.aShort3892,
                        this.aShort3892
                    };

                    for (int var38 = 0; var38 < 8; ++var38) {
                      int var39 = var35[var38];
                      int var40 = var37[var38];
                      int var41 = var36[var38];
                      int var42;
                      if (var1 != 0) {
                        var42 = var41 * var28 + var39 * var29 >> 16;
                        var41 = var41 * var29 - var39 * var28 >> 16;
                        var39 = var42;
                      }

                      var39 += var6;
                      var40 += var7;
                      var41 += var8;
                      var42 = var41 * var4 + var39 * var5 >> 16;
                      var41 = var41 * var5 - var39 * var4 >> 16;
                      var39 = var42;
                      var42 = var40 * var3 - var41 * var2 >> 16;
                      var41 = var40 * var2 + var41 * var3 >> 16;
                      if (var41 > 0) {
                        int var43 = (var39 << 9) / var41;
                        int var44 = (var42 << 9) / var41;
                        if (var43 < var31) {
                          var31 = var43;
                        }

                        if (var43 > var33) {
                          var33 = var43;
                        }

                        if (var44 < var32) {
                          var32 = var44;
                        }

                        if (var44 > var34) {
                          var34 = var44;
                        }
                      }
                    }

                    if (GlobalStatics_9.anInt3642 >= var31 && GlobalStatics_9.anInt3642 <= var33
                      && GlobalStatics_9.anInt384 >= var32 && GlobalStatics_9.anInt384 <= var34) {
                      if (this.aBoolean2699) {
                        GlobalStatics_10.entityKeys[GlobalStatics_9.anInt59++] = var9;
                      } else {
                        var30 = true;
                      }
                    }
                  }
                }

                for (var31 = 0; var31 < this.anInt3891; ++var31) {
                  var32 = this.anIntArray3885[var31];
                  var33 = this.anIntArray3883[var31];
                  var34 = this.anIntArray3895[var31];
                  int var46;
                  if (var1 != 0) {
                    var46 = var34 * var28 + var32 * var29 >> 16;
                    var34 = var34 * var29 - var32 * var28 >> 16;
                    var32 = var46;
                  }

                  var32 += var6;
                  var33 += var7;
                  var34 += var8;
                  var46 = var34 * var4 + var32 * var5 >> 16;
                  var34 = var34 * var5 - var32 * var4 >> 16;
                  var32 = var46;
                  var46 = var33 * var3 - var34 * var2 >> 16;
                  var34 = var33 * var2 + var34 * var3 >> 16;
                  GlobalStatics_1.anIntArray3920[var31] = var34 - var16;
                  if (var34 >= 50) {
                    GlobalStatics_1.anIntArray3943[var31] = var26 + (var32 << 9) / var34;
                    GlobalStatics_1.anIntArray3932[var31] = var27 + (var46 << 9) / var34;
                  } else {
                    GlobalStatics_1.anIntArray3943[var31] = -5000;
                    var23 = true;
                  }

                  if (var25) {
                    GlobalStatics_1.anIntArray3948[var31] = var32;
                    GlobalStatics_1.anIntArray3928[var31] = var46;
                    GlobalStatics_1.anIntArray3921[var31] = var34;
                  }
                }

                this.method1945(var23, var30, var9, var16 - var14, var13 - var14 + 2, var12);

              }
            }
          }
        }
      }
    }
  }

  public int getMinimumY() {
    if (!this.aBoolean3897) {
      this.method1947();
    }

    return this.aShort3894;
  }

  public void method1897(int var1, int var2, int var3 ) {
    for (int var4 = 0; var4 < this.anInt3891; ++var4) {
      this.anIntArray3885[var4] += var1;
      this.anIntArray3883[var4] += var2;
      this.anIntArray3895[var4] += var3;
    }

    this.aBoolean3897 = false;
  }

  public int method1898() {
    if (!this.aBoolean3897) {
      this.method1947();
    }

    return this.aShort3879;
  }

  public void applyAnimationFrame(int var1, int[] var2,int var3,int var4,int var5,
      boolean var6,
      int var7,
      int[] var8 ) {
    int var9 = var2.length;
    int var10;
    int var11;
    int var14;
    int var15;
    int var47;
    if (var1 == 0) {
      var10 = 0;
      GlobalStatics_1.anInt3945 = 0;
      GlobalStatics_1.anInt3934 = 0;
      GlobalStatics_1.anInt3940 = 0;

      for (var11 = 0; var11 < var9; ++var11) {
        var47 = var2[var11];
        if (var47 < this.anIntArrayArray3870.length) {
          int[] var48 = this.anIntArrayArray3870[var47];

          for (var14 = 0; var14 < var48.length; ++var14) {
            var15 = var48[var14];
            if (this.aShortArray3893 == null || (var7 & this.aShortArray3893[var15]) != 0) {
              GlobalStatics_1.anInt3945 += this.anIntArray3885[var15];
              GlobalStatics_1.anInt3934 += this.anIntArray3883[var15];
              GlobalStatics_1.anInt3940 += this.anIntArray3895[var15];
              ++var10;
            }
          }
        }
      }

      if (var10 > 0) {
        GlobalStatics_1.anInt3945 = GlobalStatics_1.anInt3945 / var10 + var3;
        GlobalStatics_1.anInt3934 = GlobalStatics_1.anInt3934 / var10 + var4;
        GlobalStatics_1.anInt3940 = GlobalStatics_1.anInt3940 / var10 + var5;
        GlobalStatics_1.aBoolean3927 = true;
      } else {
        GlobalStatics_1.anInt3945 = var3;
        GlobalStatics_1.anInt3934 = var4;
        GlobalStatics_1.anInt3940 = var5;
      }

    } else {
      int[] var12;
      int var13;
      if (var1 == 1) {
        if (var8 != null) {
          var10 = var8[0] * var3 + var8[1] * var4 + var8[2] * var5 + 16384 >> 15;
          var11 = var8[3] * var3 + var8[4] * var4 + var8[5] * var5 + 16384 >> 15;
          var47 = var8[6] * var3 + var8[7] * var4 + var8[8] * var5 + 16384 >> 15;
          var3 = var10;
          var4 = var11;
          var5 = var47;
        }

        for (var10 = 0; var10 < var9; ++var10) {
          var11 = var2[var10];
          if (var11 < this.anIntArrayArray3870.length) {
            var12 = this.anIntArrayArray3870[var11];

            for (var13 = 0; var13 < var12.length; ++var13) {
              var14 = var12[var13];
              if (this.aShortArray3893 == null || (var7 & this.aShortArray3893[var14]) != 0) {
                this.anIntArray3885[var14] += var3;
                this.anIntArray3883[var14] += var4;
                this.anIntArray3895[var14] += var5;
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
        if (var1 == 2) {
          if (var8 != null) {
            var10 = var8[9];
            var11 = var8[10];
            var47 = var8[11];
            var13 = var8[12];
            var14 = var8[13];
            var15 = var8[14];
            if (GlobalStatics_1.aBoolean3927) {
              var16 = var8[0] * GlobalStatics_1.anInt3945 + var8[3] * GlobalStatics_1.anInt3934
                  + var8[6] * GlobalStatics_1.anInt3940
                  + 16384 >> 15;
              var17 = var8[1] * GlobalStatics_1.anInt3945 + var8[4] * GlobalStatics_1.anInt3934
                  + var8[7] * GlobalStatics_1.anInt3940
                  + 16384 >> 15;
              var18 = var8[2] * GlobalStatics_1.anInt3945 + var8[5] * GlobalStatics_1.anInt3934
                  + var8[8] * GlobalStatics_1.anInt3940
                  + 16384 >> 15;
              var16 += var13;
              var17 += var14;
              var18 += var15;
              GlobalStatics_1.anInt3945 = var16;
              GlobalStatics_1.anInt3934 = var17;
              GlobalStatics_1.anInt3940 = var18;
              GlobalStatics_1.aBoolean3927 = false;
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
              var49[0] * -GlobalStatics_1.anInt3945 + var49[1] * -GlobalStatics_1.anInt3934
                  + var49[2] * -GlobalStatics_1.anInt3940
                  + 16384 >> 15;
            var26 =
              var49[3] * -GlobalStatics_1.anInt3945 + var49[4] * -GlobalStatics_1.anInt3934
                  + var49[5] * -GlobalStatics_1.anInt3940
                  + 16384 >> 15;
            var27 =
              var49[6] * -GlobalStatics_1.anInt3945 + var49[7] * -GlobalStatics_1.anInt3934
                  + var49[8] * -GlobalStatics_1.anInt3940
                  + 16384 >> 15;
            var28 = var50 + GlobalStatics_1.anInt3945;
            int var51 = var26 + GlobalStatics_1.anInt3934;
            var30 = var27 + GlobalStatics_1.anInt3940;
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

            var32 = var49[0] * var13 + var49[1] * var14 + var49[2] * var15 + 16384 >> 15;
            var33 = var49[3] * var13 + var49[4] * var14 + var49[5] * var15 + 16384 >> 15;
            var34 = var49[6] * var13 + var49[7] * var14 + var49[8] * var15 + 16384 >> 15;
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

            var36 = var8[0] * var32 + var8[1] * var33 + var8[2] * var34 + 16384 >> 15;
            var37 = var8[3] * var32 + var8[4] * var33 + var8[5] * var34 + 16384 >> 15;
            var38 = var8[6] * var32 + var8[7] * var33 + var8[8] * var34 + 16384 >> 15;
            var36 += var10;
            var37 += var11;
            var38 += var47;

            for (var39 = 0; var39 < var9; ++var39) {
              var40 = var2[var39];
              if (var40 < this.anIntArrayArray3870.length) {
                int[] var41 = this.anIntArrayArray3870[var40];

                for (int var42 = 0; var42 < var41.length; ++var42) {
                  int var43 = var41[var42];
                  if (this.aShortArray3893
                      == null || (var7 & this.aShortArray3893[var43]) != 0) {
                    int var44 =
                      var35[0] * this.anIntArray3885[var43] + var35[1] * this.anIntArray3883[var43]
                        + var35[2] * this.anIntArray3895[var43] + 16384 >> 15;
                    int var45 =
                      var35[3] * this.anIntArray3885[var43] + var35[4] * this.anIntArray3883[var43]
                        + var35[5] * this.anIntArray3895[var43] + 16384 >> 15;
                    int var46 =
                      var35[6] * this.anIntArray3885[var43] + var35[7] * this.anIntArray3883[var43]
                        + var35[8] * this.anIntArray3895[var43] + 16384 >> 15;
                    var44 += var36;
                    var45 += var37;
                    var46 += var38;
                    this.anIntArray3885[var43] = var44;
                    this.anIntArray3883[var43] = var45;
                    this.anIntArray3895[var43] = var46;
                  }
                }
              }
            }
          } else {
            for (var10 = 0; var10 < var9; ++var10) {
              var11 = var2[var10];
              if (var11 < this.anIntArrayArray3870.length) {
                var12 = this.anIntArrayArray3870[var11];

                for (var13 = 0; var13 < var12.length; ++var13) {
                  var14 = var12[var13];
                  if (this.aShortArray3893
                      == null || (var7 & this.aShortArray3893[var14]) != 0) {
                    this.anIntArray3885[var14] -= GlobalStatics_1.anInt3945;
                    this.anIntArray3883[var14] -= GlobalStatics_1.anInt3934;
                    this.anIntArray3895[var14] -= GlobalStatics_1.anInt3940;
                    if (var5 != 0) {
                      var15 = GLStatics.SINE_TABLE[var5];
                      var16 = DummyClass40.COSINE_TABLE[var5];
                      var17 =
                          this.anIntArray3883[var14] * var15 + this.anIntArray3885[var14] * var16
                          + 32767 >> 16;
                      this.anIntArray3883[var14] =
                          this.anIntArray3883[var14] * var16 - this.anIntArray3885[var14] * var15
                          + 32767 >> 16;
                      this.anIntArray3885[var14] = var17;
                    }

                    if (var3 != 0) {
                      var15 = GLStatics.SINE_TABLE[var3];
                      var16 = DummyClass40.COSINE_TABLE[var3];
                      var17 =
                          this.anIntArray3883[var14] * var16 - this.anIntArray3895[var14] * var15
                          + 32767 >> 16;
                      this.anIntArray3895[var14] =
                          this.anIntArray3883[var14] * var15 + this.anIntArray3895[var14] * var16
                          + 32767 >> 16;
                      this.anIntArray3883[var14] = var17;
                    }

                    if (var4 != 0) {
                      var15 = GLStatics.SINE_TABLE[var4];
                      var16 = DummyClass40.COSINE_TABLE[var4];
                      var17 =
                          this.anIntArray3895[var14] * var15 + this.anIntArray3885[var14] * var16
                          + 32767 >> 16;
                      this.anIntArray3895[var14] =
                          this.anIntArray3895[var14] * var16 - this.anIntArray3885[var14] * var15
                          + 32767 >> 16;
                      this.anIntArray3885[var14] = var17;
                    }

                    this.anIntArray3885[var14] += GlobalStatics_1.anInt3945;
                    this.anIntArray3883[var14] += GlobalStatics_1.anInt3934;
                    this.anIntArray3895[var14] += GlobalStatics_1.anInt3940;
                  }
                }
              }
            }
          }

        } else if (var1 == 3) {
          if (var8 != null) {
            var10 = var8[9];
            var11 = var8[10];
            var47 = var8[11];
            var13 = var8[12];
            var14 = var8[13];
            var15 = var8[14];
            if (GlobalStatics_1.aBoolean3927) {
              var16 = var8[0] * GlobalStatics_1.anInt3945 + var8[3] * GlobalStatics_1.anInt3934
                  + var8[6] * GlobalStatics_1.anInt3940
                  + 16384 >> 15;
              var17 = var8[1] * GlobalStatics_1.anInt3945 + var8[4] * GlobalStatics_1.anInt3934
                  + var8[7] * GlobalStatics_1.anInt3940
                  + 16384 >> 15;
              var18 = var8[2] * GlobalStatics_1.anInt3945 + var8[5] * GlobalStatics_1.anInt3934
                  + var8[8] * GlobalStatics_1.anInt3940
                  + 16384 >> 15;
              var16 += var13;
              var17 += var14;
              var18 += var15;
              GlobalStatics_1.anInt3945 = var16;
              GlobalStatics_1.anInt3934 = var17;
              GlobalStatics_1.anInt3940 = var18;
              GlobalStatics_1.aBoolean3927 = false;
            }

            var16 = var3 << 15 >> 7;
            var17 = var4 << 15 >> 7;
            var18 = var5 << 15 >> 7;
            var19 = var16 * -GlobalStatics_1.anInt3945 + 16384 >> 15;
            var20 = var17 * -GlobalStatics_1.anInt3934 + 16384 >> 15;
            var21 = var18 * -GlobalStatics_1.anInt3940 + 16384 >> 15;
            var22 = var19 + GlobalStatics_1.anInt3945;
            var23 = var20 + GlobalStatics_1.anInt3934;
            var24 = var21 + GlobalStatics_1.anInt3940;
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

            var30 = var8[0] * var26 + var8[1] * var27 + var8[2] * var28 + 16384 >> 15;
            var31 = var8[3] * var26 + var8[4] * var27 + var8[5] * var28 + 16384 >> 15;
            var32 = var8[6] * var26 + var8[7] * var27 + var8[8] * var28 + 16384 >> 15;
            var30 += var10;
            var31 += var11;
            var32 += var47;

            for (var33 = 0; var33 < var9; ++var33) {
              var34 = var2[var33];
              if (var34 < this.anIntArrayArray3870.length) {
                var35 = this.anIntArrayArray3870[var34];

                for (var36 = 0; var36 < var35.length; ++var36) {
                  var37 = var35[var36];
                  if (this.aShortArray3893
                      == null || (var7 & this.aShortArray3893[var37]) != 0) {
                    var38 =
                      var29[0] * this.anIntArray3885[var37] + var29[1] * this.anIntArray3883[var37]
                        + var29[2] * this.anIntArray3895[var37] + 16384 >> 15;
                    var39 =
                      var29[3] * this.anIntArray3885[var37] + var29[4] * this.anIntArray3883[var37]
                        + var29[5] * this.anIntArray3895[var37] + 16384 >> 15;
                    var40 =
                      var29[6] * this.anIntArray3885[var37] + var29[7] * this.anIntArray3883[var37]
                        + var29[8] * this.anIntArray3895[var37] + 16384 >> 15;
                    var38 += var30;
                    var39 += var31;
                    var40 += var32;
                    this.anIntArray3885[var37] = var38;
                    this.anIntArray3883[var37] = var39;
                    this.anIntArray3895[var37] = var40;
                  }
                }
              }
            }
          } else {
            for (var10 = 0; var10 < var9; ++var10) {
              var11 = var2[var10];
              if (var11 < this.anIntArrayArray3870.length) {
                var12 = this.anIntArrayArray3870[var11];

                for (var13 = 0; var13 < var12.length; ++var13) {
                  var14 = var12[var13];
                  if (this.aShortArray3893
                      == null || (var7 & this.aShortArray3893[var14]) != 0) {
                    this.anIntArray3885[var14] -= GlobalStatics_1.anInt3945;
                    this.anIntArray3883[var14] -= GlobalStatics_1.anInt3934;
                    this.anIntArray3895[var14] -= GlobalStatics_1.anInt3940;
                    this.anIntArray3885[var14] = this.anIntArray3885[var14] * var3 / 128;
                    this.anIntArray3883[var14] = this.anIntArray3883[var14] * var4 / 128;
                    this.anIntArray3895[var14] = this.anIntArray3895[var14] * var5 / 128;
                    this.anIntArray3885[var14] += GlobalStatics_1.anInt3945;
                    this.anIntArray3883[var14] += GlobalStatics_1.anInt3934;
                    this.anIntArray3895[var14] += GlobalStatics_1.anInt3940;
                  }
                }
              }
            }
          }

        } else if (var1 == 5) {
          if (this.anIntArrayArray3872 != null && this.aByteArray3903 != null) {
            for (var10 = 0; var10 < var9; ++var10) {
              var11 = var2[var10];
              if (var11 < this.anIntArrayArray3872.length) {
                var12 = this.anIntArrayArray3872[var11];

                for (var13 = 0; var13 < var12.length; ++var13) {
                  var14 = var12[var13];
                  if (this.aShortArray3871
                      == null || (var7 & this.aShortArray3871[var14]) != 0) {
                    var15 = (this.aByteArray3903[var14] & 255) + var3 * 8;
                    if (var15 < 0) {
                      var15 = 0;
                    } else if (var15 > 255) {
                      var15 = 255;
                    }

                    this.aByteArray3903[var14] = (byte) var15;
                  }
                }
              }
            }
          }

        } else if (var1 == 7) {
          if (this.anIntArrayArray3872 != null) {
            for (var10 = 0; var10 < var9; ++var10) {
              var11 = var2[var10];
              if (var11 < this.anIntArrayArray3872.length) {
                var12 = this.anIntArrayArray3872[var11];

                for (var13 = 0; var13 < var12.length; ++var13) {
                  var14 = var12[var13];
                  if (this.aShortArray3871
                      == null || (var7 & this.aShortArray3871[var14]) != 0) {
                    var15 = this.aShortArray3869[var14] & '\uffff';
                    var16 = var15 >> 10 & 63;
                    var17 = var15 >> 7 & 7;
                    var18 = var15 & 127;
                    var16 = var16 + var3 & 63;
                    var17 += var4;
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

                    this.aShortArray3869[var14] = (short) (var16 << 10 | var17 << 7 | var18);
                  }
                }

                this.aBoolean3877 = true;
              }
            }
          }

        }
      }
    }
  }

  public void method1900() {
    for (int var1 = 0; var1 < this.anInt3891; ++var1) {
      int var2 = this.anIntArray3895[var1];
      this.anIntArray3895[var1] = this.anIntArray3885[var1];
      this.anIntArray3885[var1] = -var2;
    }

    this.aBoolean3897 = false;
  }

  public AbstractModel method1943(AbstractModel var1 ) {
    return new SoftwareModel(new SoftwareModel[] {this, (SoftwareModel) var1}, 2);
  }

  private boolean method1944(int var1, int var2, int var3, int var4, int var5, int var6,
                                   int var7, int var8) {
    return (var2 >= var3 || var2 >= var4 || var2 >= var5) && (
        (var2 <= var3 || var2 <= var4 || var2 <= var5) && (
            (var1 >= var6 || var1 >= var7 || var1 >= var8) && (var1 <= var6
                || var1 <= var7 || var1 <= var8)));
  }

  private void method1945(boolean var1, boolean var2, long var3, int var5, int var6,
                                DummyClass0 var7) {
    if (var6 < 1600) {
      int var8 = 0;
      int var9 = 0;
      int var10;
      if (!GlobalStatics_1.aBoolean3942) {
        for (var10 = 0; var10 < 1600; ++var10) {
          GlobalStatics_1.anIntArray3946[var10] = 0;
        }

        for (var10 = 0; var10 < 32; ++var10) {
          GlobalStatics_1.anIntArray3935[var10] = 0;
        }

        GlobalStatics_1.anInt3930 = 0;
      }

      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var17;
      int var19;
      int var18;
      int var21;
      for (var10 = 0; var10 < this.anInt3889; ++var10) {
        if (this.anIntArray3896[var10] != -2) {
          var11 = this.anIntArray3901[var10];
          var12 = this.anIntArray3876[var10];
          var13 = this.anIntArray3887[var10];
          var14 = GlobalStatics_1.anIntArray3943[var11];
          var15 = GlobalStatics_1.anIntArray3943[var12];
          int var16 = GlobalStatics_1.anIntArray3943[var13];
          if (var1 && (var14 == -5000 || var15 == -5000 || var16 == -5000)) {
            var17 = GlobalStatics_1.anIntArray3948[var11];
            var18 = GlobalStatics_1.anIntArray3948[var12];
            var19 = GlobalStatics_1.anIntArray3948[var13];
            int var20 = GlobalStatics_1.anIntArray3928[var11];
            var21 = GlobalStatics_1.anIntArray3928[var12];
            int var22 = GlobalStatics_1.anIntArray3928[var13];
            int var23 = GlobalStatics_1.anIntArray3921[var11];
            int var24 = GlobalStatics_1.anIntArray3921[var12];
            int var25 = GlobalStatics_1.anIntArray3921[var13];
            var17 -= var18;
            var19 -= var18;
            var20 -= var21;
            var22 -= var21;
            var23 -= var24;
            var25 -= var24;
            int var26 = var20 * var25 - var23 * var22;
            int var27 = var23 * var19 - var17 * var25;
            int var28 = var17 * var22 - var20 * var19;
            if (var18 * var26 + var21 * var27 + var24 * var28 > 0) {
              GlobalStatics_1.aBooleanArray3917[var10] = true;
              if (GlobalStatics_1.aBoolean3942) {
                GlobalStatics_1.anIntArray3931[var8] =
                  (GlobalStatics_1.anIntArray3920[var11] + GlobalStatics_1.anIntArray3920[var12] + GlobalStatics_1.anIntArray3920[var13]) / 3;
                GlobalStatics_1.anIntArray3929[var8++] = var10;
              } else {
                int var29 =
                  (GlobalStatics_1.anIntArray3920[var11] + GlobalStatics_1.anIntArray3920[var12] + GlobalStatics_1.anIntArray3920[var13]) / 3
                    + var5;
                if (GlobalStatics_1.anIntArray3946[var29] < 64) {
                  GlobalStatics_1.anIntArrayArray3926[var29][GlobalStatics_1.anIntArray3946[var29]++] = var10;
                } else {
                  int var30 = GlobalStatics_1.anIntArray3946[var29];
                  if (var30 == 64) {
                    if (GlobalStatics_1.anInt3930 == 512) {
                      continue;
                    }

                    GlobalStatics_1.anIntArray3946[var29] = var30 = 65 + GlobalStatics_1.anInt3930++;
                  }

                  var30 -= 65;
                  GlobalStatics_1.anIntArrayArray3923[var30][GlobalStatics_1.anIntArray3935[var30]++] = var10;
                }
              }
            }
          } else {
            if (var2 && this.method1944(GlobalStatics_9.anInt3642 + DummyClass40.anInt846,
              GlobalStatics_9.anInt384 + DummyClass40.anInt835,
                GlobalStatics_1.anIntArray3932[var11],
                GlobalStatics_1.anIntArray3932[var12], GlobalStatics_1.anIntArray3932[var13], var14, var15, var16)) {
              GlobalStatics_10.entityKeys[GlobalStatics_9.anInt59++] = var3;
              var2 = false;
            }

            if ((var14 - var15) * (
                GlobalStatics_1.anIntArray3932[var13] - GlobalStatics_1.anIntArray3932[var12])
              - (GlobalStatics_1.anIntArray3932[var11] - GlobalStatics_1.anIntArray3932[var12]) * (var16 - var15) > 0) {
              GlobalStatics_1.aBooleanArray3917[var10] = false;
              GlobalStatics_1.aBooleanArray3937[var10] =
                !(var14 >= 0 && var15 >= 0 && var16 >= 0 && var14 <= DummyClass40.anInt847
                  && var15 <= DummyClass40.anInt847 && var16 <= DummyClass40.anInt847);

              if (GlobalStatics_1.aBoolean3942) {
                GlobalStatics_1.anIntArray3931[var8] =
                  (GlobalStatics_1.anIntArray3920[var11] + GlobalStatics_1.anIntArray3920[var12] + GlobalStatics_1.anIntArray3920[var13]) / 3;
                GlobalStatics_1.anIntArray3929[var8++] = var10;
              } else {
                var17 = (
                    GlobalStatics_1.anIntArray3920[var11] + GlobalStatics_1.anIntArray3920[var12] + GlobalStatics_1.anIntArray3920[var13]) / 3
                  + var5;
                if (GlobalStatics_1.anIntArray3946[var17] < 64) {
                  GlobalStatics_1.anIntArrayArray3926[var17][GlobalStatics_1.anIntArray3946[var17]++] = var10;
                } else {
                  var18 = GlobalStatics_1.anIntArray3946[var17];
                  if (var18 == 64) {
                    if (GlobalStatics_1.anInt3930 == 512) {
                      continue;
                    }

                    GlobalStatics_1.anIntArray3946[var17] = var18 = 65 + GlobalStatics_1.anInt3930++;
                  }

                  var18 -= 65;
                  GlobalStatics_1.anIntArrayArray3923[var18][GlobalStatics_1.anIntArray3935[var18]++] = var10;
                }
              }
            }
          }
        }
      }

      if (GlobalStatics_1.aBoolean3942) {
        DummyClass55.method1607(0, var8 - 1, false,
            GlobalStatics_1.anIntArray3931,
            GlobalStatics_1.anIntArray3929);
        if (this.aByteArray3880 == null) {
          for (var10 = 0; var10 < var8; ++var10) {
            this.method1934(GlobalStatics_1.anIntArray3929[var10]);
          }

          return;
        }

        for (var10 = 0; var10 < 12; ++var10) {
          GlobalStatics_1.anIntArray3918[var10] = 0;
          GlobalStatics_1.anIntArray3944[var10] = 0;
        }

        for (var10 = 0; var10 < var8; ++var10) {
          var11 = GlobalStatics_1.anIntArray3929[var10];
          var12 = GlobalStatics_1.anIntArray3931[var10];
          byte var32 = this.aByteArray3880[var11];
          var14 = GlobalStatics_1.anIntArray3918[var32]++;
          GlobalStatics_1.anIntArrayArray3938[var32][var14] = var11;
          if (var32 < 10) {
            GlobalStatics_1.anIntArray3944[var32] += var12;
          } else if (var32 == 10) {
            GlobalStatics_1.anIntArray3922[var14] = var12;
          } else {
            GlobalStatics_1.anIntArray3941[var14] = var12;
          }
        }
      } else {
        int[] var31;
        if (this.aByteArray3880 == null) {
          for (var10 = var6 - 1; var10 >= 0; --var10) {
            var11 = GlobalStatics_1.anIntArray3946[var10];
            if (var11 > 0) {
              var12 = var11 > 64 ? 64 : var11;
              var31 = GlobalStatics_1.anIntArrayArray3926[var10];

              for (var14 = 0; var14 < var12; ++var14) {
                var15 = var31[var14];
                if (var15 < 65536) {
                  this.method1934(var31[var14]);
                }
              }
            }

            if (var11 > 64) {
              var12 = GlobalStatics_1.anIntArray3946[var10] - 64 - 1;
              var31 = GlobalStatics_1.anIntArrayArray3923[var12];

              for (var14 = 0; var14 < GlobalStatics_1.anIntArray3935[var12]; ++var14) {
                var15 = var31[var14];
                if (var15 < 65536) {
                  this.method1934(var31[var14]);
                }
              }
            }
          }

          return;
        }

        for (var10 = 0; var10 < 12; ++var10) {
          GlobalStatics_1.anIntArray3918[var10] = 0;
          GlobalStatics_1.anIntArray3944[var10] = 0;
        }

        for (var10 = var6 - 1; var10 >= 0; --var10) {
          var11 = GlobalStatics_1.anIntArray3946[var10];
          byte var33;
          if (var11 > 0) {
            if (var11 > 64) {
              var12 = 64;
            } else {
              var12 = var11;
            }

            var31 = GlobalStatics_1.anIntArrayArray3926[var10];

            for (var14 = 0; var14 < var12; ++var14) {
              var15 = var31[var14];
              if (var15 < 65536) {
                var33 = this.aByteArray3880[var15];
                var17 = GlobalStatics_1.anIntArray3918[var33]++;
                GlobalStatics_1.anIntArrayArray3938[var33][var17] = var15;
                if (var33 < 10) {
                  GlobalStatics_1.anIntArray3944[var33] += var10;
                } else if (var33 == 10) {
                  GlobalStatics_1.anIntArray3922[var17] = var10;
                } else {
                  GlobalStatics_1.anIntArray3941[var17] = var10;
                }
              } else {
                GlobalStatics_1.anIntArray3950[var9++] = (var15 >> 16) - 1;
              }
            }
          }

          if (var11 > 64) {
            var12 = GlobalStatics_1.anIntArray3946[var10] - 64 - 1;
            var31 = GlobalStatics_1.anIntArrayArray3923[var12];

            for (var14 = 0; var14 < GlobalStatics_1.anIntArray3935[var12]; ++var14) {
              var15 = var31[var14];
              if (var15 < 65536) {
                var33 = this.aByteArray3880[var15];
                var17 = GlobalStatics_1.anIntArray3918[var33]++;
                GlobalStatics_1.anIntArrayArray3938[var33][var17] = var15;
                if (var33 < 10) {
                  GlobalStatics_1.anIntArray3944[var33] += var10;
                } else if (var33 == 10) {
                  GlobalStatics_1.anIntArray3922[var17] = var10;
                } else {
                  GlobalStatics_1.anIntArray3941[var17] = var10;
                }
              } else {
                GlobalStatics_1.anIntArray3950[var9++] = (var15 >> 16) - 1;
              }
            }
          }
        }
      }

      var10 = 0;
      if (GlobalStatics_1.anIntArray3918[1] > 0 || GlobalStatics_1.anIntArray3918[2] > 0) {
        var10 = (GlobalStatics_1.anIntArray3944[1] + GlobalStatics_1.anIntArray3944[2]) / (
            GlobalStatics_1.anIntArray3918[1] + GlobalStatics_1.anIntArray3918[2]);
      }

      var11 = 0;
      if (GlobalStatics_1.anIntArray3918[3] > 0 || GlobalStatics_1.anIntArray3918[4] > 0) {
        var11 = (GlobalStatics_1.anIntArray3944[3] + GlobalStatics_1.anIntArray3944[4]) / (
            GlobalStatics_1.anIntArray3918[3] + GlobalStatics_1.anIntArray3918[4]);
      }

      var12 = 0;
      if (GlobalStatics_1.anIntArray3918[6] > 0 || GlobalStatics_1.anIntArray3918[8] > 0) {
        var12 = (GlobalStatics_1.anIntArray3944[6] + GlobalStatics_1.anIntArray3944[8]) / (
            GlobalStatics_1.anIntArray3918[6] + GlobalStatics_1.anIntArray3918[8]);
      }

      var14 = 0;
      var15 = GlobalStatics_1.anIntArray3918[10];
      int[] var34 = GlobalStatics_1.anIntArrayArray3938[10];
      int[] var35 = GlobalStatics_1.anIntArray3922;
      if (var14 == var15) {
        var14 = 0;
        var15 = GlobalStatics_1.anIntArray3918[11];
        var34 = GlobalStatics_1.anIntArrayArray3938[11];
        var35 = GlobalStatics_1.anIntArray3941;
      }

      if (var14 < var15) {
        var13 = var35[var14];
      } else {
        var13 = -1000;
      }

      for (var18 = 0; var18 < 10; ++var18) {
        while (var18 == 0 && var13 > var10) {
          this.method1934(var34[var14++]);
          if (var14 == var15 && !Arrays
              .equals(var34, GlobalStatics_1.anIntArrayArray3938[11])) {
            var14 = 0;
            var15 = GlobalStatics_1.anIntArray3918[11];
            var34 = GlobalStatics_1.anIntArrayArray3938[11];
            var35 = GlobalStatics_1.anIntArray3941;
          }

          if (var14 < var15) {
            var13 = var35[var14];
          } else {
            var13 = -1000;
          }
        }

        while (var18 == 3 && var13 > var11) {
          this.method1934(var34[var14++]);
          if (var14 == var15 && !Arrays
              .equals(var34, GlobalStatics_1.anIntArrayArray3938[11])) {
            var14 = 0;
            var15 = GlobalStatics_1.anIntArray3918[11];
            var34 = GlobalStatics_1.anIntArrayArray3938[11];
            var35 = GlobalStatics_1.anIntArray3941;
          }

          if (var14 < var15) {
            var13 = var35[var14];
          } else {
            var13 = -1000;
          }
        }

        while (var18 == 5 && var13 > var12) {
          this.method1934(var34[var14++]);
          if (var14 == var15 && !Arrays
              .equals(var34, GlobalStatics_1.anIntArrayArray3938[11])) {
            var14 = 0;
            var15 = GlobalStatics_1.anIntArray3918[11];
            var34 = GlobalStatics_1.anIntArrayArray3938[11];
            var35 = GlobalStatics_1.anIntArray3941;
          }

          if (var14 < var15) {
            var13 = var35[var14];
          } else {
            var13 = -1000;
          }
        }

        var19 = GlobalStatics_1.anIntArray3918[var18];
        int[] var36 = GlobalStatics_1.anIntArrayArray3938[var18];

        for (var21 = 0; var21 < var19; ++var21) {
          this.method1934(var36[var21]);
        }
      }

      while (var13 != -1000) {
        this.method1934(var34[var14++]);
        if (var14 == var15 && !Arrays
            .equals(var34, GlobalStatics_1.anIntArrayArray3938[11])) {
          var14 = 0;
          var34 = GlobalStatics_1.anIntArrayArray3938[11];
          var15 = GlobalStatics_1.anIntArray3918[11];
          var35 = GlobalStatics_1.anIntArray3941;
        }

        if (var14 < var15) {
          var13 = var35[var14];
        } else {
          var13 = -1000;
        }
      }

    }
  }

  public void method1946(int var1, int var2, int var3, int var4, int var5,
      int var6,
      int var7,
      int var8 ) {
    if (!this.aBoolean3897) {
        this.method1947();
      }

      int var9 = DummyClass40.anInt846;
      int var10 = DummyClass40.anInt835;
      int var11 = GLStatics.SINE_TABLE[var1];
      int var12 = DummyClass40.COSINE_TABLE[var1];
      int var13 = GLStatics.SINE_TABLE[var2];
      int var14 = DummyClass40.COSINE_TABLE[var2];
      int var15 = GLStatics.SINE_TABLE[var3];
      int var16 = DummyClass40.COSINE_TABLE[var3];
      int var17 = GLStatics.SINE_TABLE[var4];
      int var18 = DummyClass40.COSINE_TABLE[var4];
      int var19 = var6 * var17 + var7 * var18 >> 16;

      for (int var20 = 0; var20 < this.anInt3891; ++var20) {
        int var21 = this.anIntArray3885[var20];
        int var22 = this.anIntArray3883[var20];
        int var23 = this.anIntArray3895[var20];
        int var24;
        if (var3 != 0) {
          var24 = var22 * var15 + var21 * var16 >> 16;
          var22 = var22 * var16 - var21 * var15 >> 16;
          var21 = var24;
        }

        if (var1 != 0) {
          var24 = var22 * var12 - var23 * var11 >> 16;
          var23 = var22 * var11 + var23 * var12 >> 16;
          var22 = var24;
        }

        if (var2 != 0) {
          var24 = var23 * var13 + var21 * var14 >> 16;
          var23 = var23 * var14 - var21 * var13 >> 16;
          var21 = var24;
        }

        var21 += var5;
        var22 += var6;
        var23 += var7;
        var24 = var22 * var18 - var23 * var17 >> 16;
        var23 = var22 * var17 + var23 * var18 >> 16;
        GlobalStatics_1.anIntArray3920[var20] = var23 - var19;
        GlobalStatics_1.anIntArray3943[var20] = var9 + (var21 << 9) / var8;
        GlobalStatics_1.anIntArray3932[var20] = var10 + (var24 << 9) / var8;
        if (this.anInt3900 > 0) {
          GlobalStatics_1.anIntArray3948[var20] = var21;
          GlobalStatics_1.anIntArray3928[var20] = var24;
          GlobalStatics_1.anIntArray3921[var20] = var23;
        }
      }

      this.method1945(false, false, 0L, this.aShort3886, this.aShort3886 << 1, null);

  }

  private void method1947() {
    int var1 = 32767;
    int var2 = 32767;
    int var3 = 32767;
    int var4 = -32768;
    int var5 = -32768;
    int var6 = -32768;
    int var7 = 0;
    int var8 = 0;

    for (int var9 = 0; var9 < this.anInt3891; ++var9) {
      int var10 = this.anIntArray3885[var9];
      int var11 = this.anIntArray3883[var9];
      int var12 = this.anIntArray3895[var9];
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

      var13 += var11 * var11;
      if (var13 > var8) {
        var8 = var13;
      }
    }

    this.aShort3873 = (short) var1;
    this.aShort3878 = (short) var4;
    this.aShort3894 = (short) var2;
    this.aShort3892 = (short) var5;
    this.aShort3879 = (short) var3;
    this.aShort3888 = (short) var6;
    this.aShort3884 = (short) ((int) (Math.sqrt(var7) + 0.99D));
    this.aShort3886 = (short) ((int) (Math.sqrt(var8) + 0.99D));
    this.aBoolean3897 = true;
  }

}
