package com.jagex.runescape.opengl;

import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_3;
import com.jagex.runescape.statics.GlobalStatics_5;
import com.jagex.runescape.statics.GlobalStatics_6;
import com.jagex.runescape.statics.GlobalStatics_7;
import com.jagex.runescape.statics.GlobalStatics_9;
import com.jagex.runescape.model.ITextureCache;
import com.jagex.runescape.model.ProceduralTexture;
import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.model.AbstractObjectNodeWrapper;
import com.jagex.runescape.model.FileUnpacker;
import com.jagex.runescape.huffman.HuffmanEncoderStatics;
import com.jagex.runescape.node.SubNode;
import com.jagex.runescape.statics.DummyClass13;
import com.jagex.runescape.statics.DummyClass17;
import com.jagex.runescape.statics.DummyClass20;
import com.jagex.runescape.statics.DummyClass32;
import com.jagex.runescape.statics.DummyClass49;
import com.jagex.runescape.statics.DummyClass60;
import com.jagex.runescape.statics.DummyClass8;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.glu.gl2.GLUgl2;
import java.nio.ByteBuffer;
import java.util.Objects;

public final class Texture extends SubNode {

  public static GameString aClass94_3785 = GameStringStatics
      .create("Benutzeroberfl-=che geladen)3");
  public static FileUnpacker midiInstruments;
  public static GameString aClass94_3792 = GameStringStatics
      .create("huffman");
  public static AbstractObjectNodeWrapper aClass118_3794 = DummyClass60
      .method913(31431);
  public static GameString aClass94_3798 =
      GameStringStatics
          .create("RuneScape wird geladen )2 bitte warten)3)3)3");
  public boolean needsUpdate;
  private final boolean aBoolean3781;
  private float aFloat3782;
  private final int anInt3783;
  private final int textureEnvironmentOpcode;
  private final boolean aBoolean3787;
  private final int anInt3788;
  private final boolean aBoolean3789;
  private final ProceduralTexture proceduralTexture;
  private int anInt3791;
  private int[] anIntArray3793;
  private int anInt3795 = -1;
  private int anInt3796;
  private final int anInt3799;
  private final boolean aBoolean3800;

  public Texture(Buffer var1) {
    this.proceduralTexture = new ProceduralTexture(var1);
    this.aBoolean3789 = var1.readUnsignedByte() == 1;
    this.aBoolean3800 = var1.readUnsignedByte() == 1;
    this.aBoolean3787 = (var1.readUnsignedByte() == 1);
    this.aBoolean3781 = (var1.readUnsignedByte() == 1);
    int var2 = 3 & var1.readUnsignedByte();
    this.anInt3783 = var1.readByte();
    this.anInt3799 = var1.readByte();
    int var3 = var1.readUnsignedByte();
    var1.readUnsignedByte();
    if (var2 == 1) {
      this.textureEnvironmentOpcode = 2;
    } else if ((var2 == 2)) {
      this.textureEnvironmentOpcode = 3;
    } else if ((var2 != 3)) {
      this.textureEnvironmentOpcode = 0;
    } else {
      this.textureEnvironmentOpcode = 4;
    }

    this.anInt3788 = (var3 & 240) >> 4;
  }

  public int[] method718(ITextureCache var1, int var2, float var3,
      FileUnpacker var4,
      boolean var5) {
    if (var2 == 0) {
      if (this.anIntArray3793 == null || this.aFloat3782 != var3) {
        if (!this.proceduralTexture.method1408(true, var1, var4)) {
          return null;
        }

        int var6 = !var5 ? 128 : 64;
        this.anIntArray3793 =
            this.proceduralTexture.method1404(var6, this.aBoolean3800, var6,
                var3,
                var2 ^ 327680, var4, var1, true);
        this.aFloat3782 = var3;
        if (this.aBoolean3789) {
          int[] var7 = new int[var6];
          int[] var10 = new int[var6 * var6];
          int[] var8 = new int[var6];
          int[] var9 = new int[var6];
          int var15 = var6;
          int var14;
          int var13 = var14 = var6;
          int var19 = var6 * var6;
          int var18 = -1 + var6;
          int var17 = var6 - 1;

          int var11;
          int var20;
          for (var20 = 2; var20 >= 0; --var20) {
            for (var11 = var17; var11 >= 0; --var11) {
              --var14;
              int var12 = this.anIntArray3793[var14];
              var7[var11] += (var12 & 16726965) >> 16;
              var8[var11] += ((int) '\uff72' & var12) >> 8;
              var9[var11] += var12 & 255;
            }

            if (var14 == 0) {
              var14 = var19;
            }
          }

          int var25 = var19;

          for (int var31 = var18; (var31 >= 0); --var31) {
            int var30 = 0;
            int var29 = 0;
            int var28 = 0;
            int var26 = 1;
            int var27 = 1;

            for (var11 = 2; (var11 >= 0); --var11) {
              --var27;
              var30 += var8[var27];
              var29 += var9[var27];
              var28 += var7[var27];
              if (var27 == 0) {
                var27 = var15;
              }
            }

            for (var11 = var17; (var11 >= 0); --var11) {
              --var26;
              int var21 = var30 / 9;
              int var22 = var29 / 9;
              --var27;
              var20 = var28 / 9;
              --var25;
              var10[var25] = HuffmanEncoderStatics.method308(var22,
                  HuffmanEncoderStatics.method308(var20 << 16, var21 << 8));
              var28 += var7[var27] - var7[var26];
              var29 += var9[var27] - var9[var26];
              var30 += -var8[var26] + var8[var27];
              if ((var26 == 0)) {
                var26 = var15;
              }

              if ((var27 == 0)) {
                var27 = var15;
              }
            }

            for (var11 = var17; (var11 >= 0); --var11) {
              --var13;
              int var23 = this.anIntArray3793[var13];
              --var14;
              int var24 = this.anIntArray3793[var14];
              var7[var11] +=
                  ((var24 & 16729186) >> 16) - (var23 >> 16 & 255);
              var8[var11] +=
                  (((int) '\uff8b' & var24) >> 8) - (255 & var23 >> 8);
              var9[var11] += -(var23 & 255) + (255 & var24);
            }

            if (var13 == 0) {
              var13 = var19;
            }

            if (var14 == 0) {
              var14 = var19;
            }
          }

          this.anIntArray3793 = var10;
        }
      }

      return this.anIntArray3793;
    } else {
      return null;
    }
  }

  public boolean method719(FileUnpacker var1, ITextureCache var2, int var3,
      boolean var4) {
    if (var3 != 579100487) {
      return false;
    } else if (this.proceduralTexture.method1408(true, var2, var1)) {
      int var6 = !var4 ? 128 : 64;
      int flags = DummyClass32.method961(1536);
      if (((1 & flags) == 0)) {
        if ((this.anInt3795 == -1)) {
          int[] var8 = new int[1];
          GlRenderer.GL.glGenTextures(1, var8, 0);
          this.anInt3791 = DummyClass33.anInt582;
          this.anInt3795 = var8[0];
          GlRenderer.bindTexture(this.anInt3795);
          ByteBuffer var9 = ByteBuffer.wrap(
              Objects.requireNonNull(this.proceduralTexture
                  .method1407(var6, var6, this.aBoolean3800, var2, 0.7D, 8839,
                      var1)));

          if (this.anInt3788 == 2) {
            //TODO
            GLU var14 = new GLUgl2();
            var14.gluBuild2DMipmaps(3553, 6408, var6, var6, 6408, 5121, var9);
            GlRenderer.GL.glTexParameteri(3553, 10241, 9987);
            GlRenderer.GL.glTexParameteri(3553, 10240, 9729);
            DummyClass33.textureMemory +=
                4 * var9.limit() / 3 - this.anInt3796;
            this.anInt3796 = var9.limit() * 4 / 3;
          } else {
            if ((this.anInt3788 == 1)) {
              int var10 = 0;

              while (true) {
                GlRenderer.GL
                    .glTexImage2D(3553, var10++, 6408, var6, var6, 0, 6408,
                        5121, var9);
                var6 >>= 1;
                if (var6 == 0) {
                  GlRenderer.GL.glTexParameteri(3553, 10241, 9987);
                  GlRenderer.GL.glTexParameteri(3553, 10240, 9729);
                  DummyClass33.textureMemory +=
                      var9.limit() * 4 / 3 - this.anInt3796;
                  this.anInt3796 = 4 * var9.limit() / 3;
                  break;
                }

                var9 = ByteBuffer.wrap(
                    Objects.requireNonNull(this.proceduralTexture
                        .method1407(var6, var6, this.aBoolean3800, var2, 0.7D,
                            8839, var1)));
              }
            } else {
              GlRenderer.GL
                  .glTexImage2D(3553, 0, 6408, var6, var6, 0, 6408, 5121,
                      var9);
              GlRenderer.GL.glTexParameteri(3553, 10241, 9729);
              GlRenderer.GL.glTexParameteri(3553, 10240, 9729);
              DummyClass33.textureMemory += var9.limit() - this.anInt3796;
              this.anInt3796 = var9.limit();
            }
          }

          GlRenderer.GL.glTexParameteri(3553, 10242,
              !this.aBoolean3787 ? '\u812f' : 10497);
          GlRenderer.GL.glTexParameteri(3553, 10243,
              this.aBoolean3781 ? 10497 : '\u812f');
        } else {
          GlRenderer.bindTexture(this.anInt3795);
        }
      }

      if (((2 & flags) == 0)) {
        GlRenderer.method1856(this.textureEnvironmentOpcode);
      }

      if ((4 & flags) == 0) {
        GlRenderer.method1847(0);
      }

      if ((flags & 8) == 0) {
        if ((this.anInt3799 == 0) && this.anInt3783 == 0) {
          GlRenderer.loadIdentityTextureMatrix();
        } else {
          float var12 =
              (float) (this.anInt3799 * GlRenderer.anInt1791) / var6;
          float var13 =
              (float) (this.anInt3783 * GlRenderer.anInt1791) / var6;
          GlRenderer.translateTexture(var13, var12, 0.0F);
        }
      }

      return true;
    } else {
      return false;
    }
  }

  public int[] method720(boolean var1, boolean var2, ITextureCache var3,
      FileUnpacker var4) {
    if (this.proceduralTexture.method1408(true, var3, var4)) {
      int size = !var2 ? 128 : 64;
      return this.proceduralTexture
          .method1404(size, this.aBoolean3800, size, 1.0D, 327680, var4,
              var3, false);
    } else {
      return null;
    }
  }

  public boolean method722(int var1, ITextureCache var2, FileUnpacker var3) {
    return var1 != -5 || this.proceduralTexture.method1408(true, var2, var3);
  }

  public void update(int var1, byte var2) {
    if (var2 != -120) {
      Texture.method721(-42);
    }

    if (this.anIntArray3793 != null) {
      if (this.anInt3799 != 0 || (this.anInt3783 != 0)) {
        if (GlobalStatics_9.anIntArray2533 == null
            || (GlobalStatics_9.anIntArray2533.length
            < this.anIntArray3793.length)) {
          GlobalStatics_9.anIntArray2533 = new int[this.anIntArray3793.length];
        }

        int var5 = var1 * this.anInt3783;
        int var3 = (this.anIntArray3793.length == 4096) ? 64 : 128;
        int var4 = this.anIntArray3793.length;
        int var6 = var3 - 1;
        int var7 = this.anInt3799 * var1 * var3;
        int var8 = -1 + var4;

        for (int var9 = 0; var4 > var9; var9 += var3) {
          int var10 = var7 + var9 & var8;

          for (int var11 = 0; var3 > var11; ++var11) {
            int var13 = (var6 & var11 + var5) + var10;
            int var12 = var11 + var9;
            GlobalStatics_9.anIntArray2533[var12] = this.anIntArray3793[var13];
          }
        }

        int[] var15 = this.anIntArray3793;
        this.anIntArray3793 = GlobalStatics_9.anIntArray2533;
        GlobalStatics_9.anIntArray2533 = var15;
      }

    }
  }

  protected void finalize() throws Throwable {
    if (this.anInt3795 != -1) {
      DummyClass33.method985(this.anInt3795, this.anInt3796, this.anInt3791);
      this.anInt3796 = 0;
      this.anInt3795 = -1;
    }

    super.finalize();
  }

  public static void method721(int var0) {
    Texture.aClass94_3785 = null;
    Texture.aClass94_3792 = null;
    Texture.aClass94_3798 = null;
    Texture.midiInstruments = null;
    Texture.aClass118_3794 = null;
  }

  public static void method724(int var0) {
    DummyClass8.aClass93_4015.method1523((byte) -102);
    if (var0 > -106) {
      Texture.method725(71);
    }
  }

  public static void method725(int var0) {
    int var1 = 67 / ((-60 - var0) / 41);
    if ((DummyClass20.method1817((byte) 70) == 2)) {
      byte var2 = (byte) (255 & GlobalStatics_6.anInt1127 - 4);
      int var3 = GlobalStatics_6.anInt1127 % 104;

      int var4;
      int var5;
      for (var4 = 0; (var4 < 4); ++var4) {
        for (var5 = 0; var5 < 104; ++var5) {
          GlobalStatics_5.aByteArrayArrayArray2008[var4][var3][var5] = var2;
        }
      }

      if (GlobalStatics_9.currentPlane != 3) {
        for (var4 = 0; (var4 < 2); ++var4) {
          GlobalStatics_7.anIntArray686[var4] = -1000000;
          GlobalStatics_9.anIntArray2696[var4] = 1000000;
          DummyClass13.anIntArray2021[var4] = 0;
          GlobalStatics_3.anIntArray1871[var4] = 1000000;
          GlobalStatics_9.anIntArray3959[var4] = 0;
        }

        if (GlobalStatics_9.anInt1753 == 1) {
          if ((4
              & GlobalStatics_10.tileFlags[GlobalStatics_9.currentPlane][
              GlobalStatics_9.localPlayer.anInt2819 >> 7][
              GlobalStatics_9.localPlayer.anInt2829 >> 7])
              != 0) {
            GlobalStatics_9.method2031((byte) -85, false,
                GlobalStatics_9.localPlayer.anInt2819 >> 7,
                GlobalStatics_9.localPlayer.anInt2829 >> 7,
                GLStatics.sceneGraphTiles, 0);
          }

          if ((DummyClass17.anInt1823 < 310)) {
            int var7 = GlobalStatics_9.localPlayer.anInt2829 >> 7;
            var5 = DummyClass49.anInt1111 >> 7;
            int var9;
            if (var5 < var7) {
              var9 = var7 - var5;
            } else {
              var9 = -var7 + var5;
            }

            var4 = GlobalStatics_9.anInt3995 >> 7;
            int var6 = GlobalStatics_9.localPlayer.anInt2819 >> 7;
            int var8;
            if (var6 > var4) {
              var8 = -var4 + var6;
            } else {
              var8 = -var6 + var4;
            }

            int var10;
            int var11;
            if (var8 > var9) {
              var11 = '\u8000';
              var10 = var9 * 65536 / var8;

              while (var6 != var4) {
                if (var6 <= var4) {
                  --var4;
                } else {
                  ++var4;
                }

                if (((
                    GlobalStatics_10.tileFlags[GlobalStatics_9.currentPlane][var4][var5]
                        & 4) != 0)) {
                  GlobalStatics_9.method2031((byte) -29, false, var4, var5,
                      GLStatics.sceneGraphTiles, 1);
                  break;
                }

                var11 += var10;
                if (var11 >= 65536) {
                  if (var5 >= var7) {
                    if (var7 < var5) {
                      --var5;
                    }
                  } else {
                    ++var5;
                  }

                  var11 -= 65536;
                  if (((4
                      & GlobalStatics_10.tileFlags[GlobalStatics_9.currentPlane][var4][var5])
                      != 0)) {
                    GlobalStatics_9.method2031((byte) -120, false, var4, var5,
                        GLStatics.sceneGraphTiles, 1);
                    break;
                  }
                }
              }
            } else {
              var11 = '\u8000';
              var10 = 65536 * var8 / var9;

              while ((var5 != var7)) {
                if (var5 < var7) {
                  ++var5;
                } else if (var5 > var7) {
                  --var5;
                }

                if (((4
                    & GlobalStatics_10.tileFlags[GlobalStatics_9.currentPlane][var4][var5])
                    != 0)) {
                  GlobalStatics_9.method2031((byte) -13, false, var4, var5,
                      GLStatics.sceneGraphTiles, 1);
                  break;
                }

                var11 += var10;
                if ((var11 >= 65536)) {
                  if (var6 > var4) {
                    ++var4;
                  } else if (var6 < var4) {
                    --var4;
                  }

                  var11 -= 65536;
                  if ((4
                      & GlobalStatics_10.tileFlags[GlobalStatics_9.currentPlane][var4][var5])
                      != 0) {
                    GlobalStatics_9.method2031((byte) -37, false, var4, var5,
                        GLStatics.sceneGraphTiles, 1);
                    break;
                  }
                }
              }
            }
          }
        } else {
          var4 = GlobalStatics_6
              .method1736(GlobalStatics_9.currentPlane, 1,
                  GlobalStatics_9.anInt3995,
                  DummyClass49.anInt1111);
          if (var4 - GlobalStatics_7.anInt2162 < 800 &&
              (4
                  & GlobalStatics_10.tileFlags[GlobalStatics_9.currentPlane][
                  GlobalStatics_9.anInt3995
                      >> 7][DummyClass49.anInt1111 >> 7]) != 0) {
            GlobalStatics_9
                .method2031((byte) -107, false, GlobalStatics_9.anInt3995 >> 7,
                    DummyClass49.anInt1111 >> 7,
                    GLStatics.sceneGraphTiles, 1);
          }
        }

      }
    }
  }

}
