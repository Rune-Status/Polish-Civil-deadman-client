package com.jagex.runescape;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.node.SubNode;
import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.GlUtils;
import com.jagex.runescape.sprite.AbstractIndexedColorSprite;
import java.util.Random;

public abstract class AbstractFont extends SubNode {

  public int[] anIntArray3709;
  public int[] anIntArray3721;
  public int anInt3727;
  private int anInt3710;
  private int[] anIntArray3719;
  private int anInt3722;
  private int[] anIntArray3723;
  private int[] anIntArray3730;
  private byte[] aByteArray3733;
  private int[] anIntArray3736;
  private AbstractIndexedColorSprite[] aClass109Array3740;

  public AbstractFont(byte[] var1, int[] var2, int[] var3, int[] var4,
      int[] var5) {
    this.anIntArray3719 = var2;
    this.anIntArray3730 = var3;
    this.anIntArray3709 = var4;
    this.anIntArray3721 = var5;
    this.parseConfig(var1);
    int var6 = Integer.MAX_VALUE;
    int var7 = Integer.MIN_VALUE;

    for (int var8 = 0; var8 < 256; ++var8) {
      if (this.anIntArray3730[var8] < var6 && this.anIntArray3721[var8] != 0) {
        var6 = this.anIntArray3730[var8];
      }

      if (this.anIntArray3730[var8] + this.anIntArray3721[var8] > var7) {
        var7 = this.anIntArray3730[var8] + this.anIntArray3721[var8];
      }
    }

    this.anInt3722 = this.anInt3727 - var6;
    this.anInt3710 = var7 - this.anInt3727;
  }

  public AbstractFont(byte[] var1) {
    this.parseConfig(var1);
  }

  public final int draw(GameString var1, int var2, int var3, int var4, int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10) {
    return this
        .method693(var1, var2, var3, var4, var5, var6, var7, 256, var8, var9,
            var10);
  }

  private void method677(GameString var1, int var2, int var3) {
    var3 -= this.anInt3727;
    int var4 = -1;
    int var5 = 0;
    int var6 = var1.getLength();

    for (int var7 = 0; var7 < var6; ++var7) {
      int var8 = var1.charAt(var7);
      if (var8 == 60) {
        var4 = var7;
      } else {
        int var10;
        if (var8 == 62 && var4 != -1) {
          GameString var9 = var1.substring(var7, 0, var4 + 1);
          var4 = -1;
          if (var9.method1528((byte) -42, GlobalStatics_4.aClass94_3712)) {
            var8 = 60;
          } else if (var9.method1528((byte) -42, GlobalStatics_4.aClass94_3711)) {
            var8 = 62;
          } else if (var9.method1528((byte) -42, GlobalStatics_4.aClass94_3732)) {
            var8 = 160;
          } else if (var9.method1528((byte) -42, GlobalStatics_4.aClass94_3714)) {
            var8 = 173;
          } else if (var9.method1528((byte) -42, GlobalStatics_4.aClass94_3729)) {
            var8 = 215;
          } else if (var9.method1528((byte) -42, GlobalStatics_4.aClass94_3718)) {
            var8 = 128;
          } else if (var9.method1528((byte) -42, GlobalStatics_4.aClass94_3741)) {
            var8 = 169;
          } else {
            if (!var9.method1528((byte) -42, GlobalStatics_4.aClass94_3743)) {
              if (var9.method1558(GlobalStatics_4.aClass94_3739, 0)) {
                var10 = var9.substring(4).toInteger();
                AbstractIndexedColorSprite var15 = this.aClass109Array3740[var10];
                int var12 =
                    this.anIntArray3723 != null ? this.anIntArray3723[var10]
                        : var15.anInt1467;
                if (GlobalStatics_4.anInt3750 == 256) {
                  var15.draw(var2, var3 + this.anInt3727 - var12);
                } else {
                  var15.draw(var2, var3 + this.anInt3727 - var12,
                      GlobalStatics_4.anInt3750);
                }

                var2 += var15.anInt1469;
                var5 = 0;
              } else {
                this.method685(var9);
              }
              continue;
            }

            var8 = 174;
          }
        }

        if (var4 == -1) {
          if (this.aByteArray3733 != null && var5 != 0) {
            var2 += this.aByteArray3733[(var5 << 8) + var8];
          }

          int var14 = this.anIntArray3709[var8];
          var10 = this.anIntArray3721[var8];
          if (var8 != 32) {
            if (GlobalStatics_4.anInt3750 == 256) {
              if (GlobalStatics_4.anInt3754 != -1) {
                this.method678(var8, var2 + this.anIntArray3719[var8] + 1,
                    var3 + this.anIntArray3730[var8] + 1, var14, var10,
                    GlobalStatics_4.anInt3754);
              }

              this.method678(var8, var2 + this.anIntArray3719[var8],
                  var3 + this.anIntArray3730[var8], var14, var10,
                  GlobalStatics_4.anInt3755);
            } else {
              if (GlobalStatics_4.anInt3754 != -1) {
                this.method679(var8, var2 + this.anIntArray3719[var8] + 1,
                    var3 + this.anIntArray3730[var8] + 1, var14, var10,
                    GlobalStatics_4.anInt3754,
                    GlobalStatics_4.anInt3750);
              }

              this.method679(var8, var2 + this.anIntArray3719[var8],
                  var3 + this.anIntArray3730[var8], var14, var10,
                  GlobalStatics_4.anInt3755,
                  GlobalStatics_4.anInt3750);
            }
          } else if (GlobalStatics_4.anInt3756 > 0) {
            GlobalStatics_4.anInt3748 += GlobalStatics_4.anInt3756;
            var2 += GlobalStatics_4.anInt3748 >> 8;
            GlobalStatics_4.anInt3748 &= 255;
          }

          int var11 = this.anIntArray3736[var8];
          if (GlobalStatics_4.anInt3746 != -1) {
            if (GlRenderer.useOpenGlRenderer) {
              GlUtils.drawHorizontalLine(var2, var3 + (int) (this.anInt3727
                      * 0.7D), var11,
                  GlobalStatics_4.anInt3746);
            } else {
              DummyClass47.method1317(var2, var3 + (int) (this.anInt3727
                      * 0.7D), var11,
                  GlobalStatics_4.anInt3746);
            }
          }

          if (GlobalStatics_4.anInt3747 != -1) {
            if (GlRenderer.useOpenGlRenderer) {
              GlUtils.drawHorizontalLine(var2, var3 + this.anInt3727 + 1, var11,
                  GlobalStatics_4.anInt3747);
            } else {
              DummyClass47.method1317(var2, var3 + this.anInt3727 + 1, var11,
                  GlobalStatics_4.anInt3747);
            }
          }

          var2 += var11;
          var5 = var8;
        }
      }
    }

  }

  public abstract void method678(int var1, int var2, int var3, int var4,
      int var5, int var6);

  public abstract void method679(int var1, int var2, int var3, int var4,
      int var5, int var6, int var7);

  public final int method680(GameString var1, int var2) {
    int var3 = this.method691(var1, new int[]{var2},
        GlobalStatics_4.aClass94Array3753);
    int var4 = 0;

    for (int var5 = 0; var5 < var3; ++var5) {
      int var6 = this.method682(GlobalStatics_4.aClass94Array3753[var5]);
      if (var6 > var4) {
        var4 = var6;
      }
    }

    return var4;
  }

  public final void method681(GameString var1, int var2, int var3, int var4,
      int var5) {
    if (var1 != null) {
      this.method698(var4, var5);
      this.method677(var1, var2, var3);
    }
  }

  public final int method682(GameString var1) {
    if (var1 == null) {
      return 0;
    } else {
      int var2 = -1;
      int var3 = 0;
      int var4 = 0;
      int var5 = var1.getLength();

      for (int var6 = 0; var6 < var5; ++var6) {
        int var7 = var1.charAt(var6);
        if (var7 == 60) {
          var2 = var6;
        } else {
          if (var7 == 62 && var2 != -1) {
            GameString var8 = var1.substring(var6, 0, var2 + 1);
            var2 = -1;
            if (var8.method1528((byte) -42, GlobalStatics_4.aClass94_3712)) {
              var7 = 60;
            } else if (var8
                .method1528((byte) -42, GlobalStatics_4.aClass94_3711)) {
              var7 = 62;
            } else if (var8
                .method1528((byte) -42, GlobalStatics_4.aClass94_3732)) {
              var7 = 160;
            } else if (var8
                .method1528((byte) -42, GlobalStatics_4.aClass94_3714)) {
              var7 = 173;
            } else if (var8
                .method1528((byte) -42, GlobalStatics_4.aClass94_3729)) {
              var7 = 215;
            } else if (var8
                .method1528((byte) -42, GlobalStatics_4.aClass94_3718)) {
              var7 = 128;
            } else if (var8
                .method1528((byte) -42, GlobalStatics_4.aClass94_3741)) {
              var7 = 169;
            } else {
              if (!var8.method1528((byte) -42, GlobalStatics_4.aClass94_3743)) {
                if (var8.method1558(GlobalStatics_4.aClass94_3739, 0)) {
                  int var9 = var8.substring(4).toInteger();
                    var4 += this.aClass109Array3740[var9].anInt1469;
                    var3 = 0;
                }
                continue;
              }

              var7 = 174;
            }
          }

          if (var2 == -1) {
            var4 += this.anIntArray3736[var7];
            if (this.aByteArray3733 != null && var3 != 0) {
              var4 += this.aByteArray3733[(var3 << 8) + var7];
            }

            var3 = var7;
          }
        }
      }

      return var4;
    }
  }

  public final int method683(GameString var1, int var2, int var3, int var4,
      int var5,
      Random var6,
      int var7) {
    if (var1 == null) {
      return 0;
    } else {
      var6.setSeed(var7);
      this.method701(var4, var5, 192 + (var6.nextInt() & 31));
      int var8 = var1.getLength();
      int[] var9 = new int[var8];
      int var10 = 0;

      for (int var11 = 0; var11 < var8; ++var11) {
        var9[var11] = var10;
        if ((var6.nextInt() & 3) == 0) {
          ++var10;
        }
      }

      this.method703(var1, var2, var3, var9, null);
      return var10;
    }
  }

  public final int method684(GameString var1, int var2) {
    return this.method691(var1, new int[]{var2},
        GlobalStatics_4.aClass94Array3753);
  }

  private void method685(GameString var1) {
    if (var1.method1558(GlobalStatics_4.aClass94_3725, 0)) {
        GlobalStatics_4.anInt3755 = var1.substring(4).method1530((byte) 70, 16);
      } else if (var1.method1528((byte) -42, GlobalStatics_4.aClass94_3720)) {
        GlobalStatics_4.anInt3755 = GlobalStatics_4.anInt3749;
      } else if (var1.method1558(GlobalStatics_4.aClass94_3715, 0)) {
        GlobalStatics_4.anInt3750 = var1.substring(6).toInteger();
      } else if (var1.method1528((byte) -42, GlobalStatics_4.aClass94_3731)) {
        GlobalStatics_4.anInt3750 = GlobalStatics_4.anInt3751;
      } else if (var1.method1558(GlobalStatics_4.aClass94_3717, 0)) {
        GlobalStatics_4.anInt3746 = var1.substring(4).method1530((byte) 54, 16);
      } else if (var1.method1528((byte) -42, GlobalStatics_4.aClass94_3744)) {
        GlobalStatics_4.anInt3746 = 8388608;
      } else if (var1.method1528((byte) -42, GlobalStatics_4.aClass94_3742)) {
        GlobalStatics_4.anInt3746 = -1;
      } else if (var1.method1558(GlobalStatics_4.aClass94_3716, 0)) {
        GlobalStatics_4.anInt3747 = var1.substring(2).method1530((byte) 62, 16);
      } else if (var1.method1528((byte) -42, GlobalStatics_4.aClass94_3728)) {
        GlobalStatics_4.anInt3747 = 0;
      } else if (var1.method1528((byte) -42, GlobalStatics_4.aClass94_3735)) {
        GlobalStatics_4.anInt3747 = -1;
      } else if (var1.method1558(GlobalStatics_4.aClass94_3713, 0)) {
        GlobalStatics_4.anInt3754 = var1.substring(5).method1530((byte) 82, 16);
      } else if (var1.method1528((byte) -42, GlobalStatics_4.aClass94_3738)) {
        GlobalStatics_4.anInt3754 = 0;
      } else if (var1.method1528((byte) -42, GlobalStatics_4.aClass94_3724)) {
        GlobalStatics_4.anInt3754 = GlobalStatics_4.anInt3752;
      } else if (var1.method1528((byte) -42, GlobalStatics_4.aClass94_3737)) {
        this.method701(GlobalStatics_4.anInt3749, GlobalStatics_4.anInt3752,
            GlobalStatics_4.anInt3751);
      }

  }

  private int method687(int var1) {
    return this.anIntArray3736[var1 & 255];
  }

  public final void method688(GameString var1, int var2, int var3, int var4,
      int var5) {
    if (var1 != null) {
      this.method698(var4, var5);
      this.method677(var1, var2 - this.method682(var1), var3);
    }
  }

  private void method690(GameString var1, int var2) {
    int var3 = 0;
    boolean var4 = false;
    int var5 = var1.getLength();

    for (int var6 = 0; var6 < var5; ++var6) {
      int var7 = var1.charAt(var6);
      if (var7 == 60) {
        var4 = true;
      } else if (var7 == 62) {
        var4 = false;
      } else if (!var4 && var7 == 32) {
        ++var3;
      }
    }

    if (var3 > 0) {
      GlobalStatics_4.anInt3756 = (var2 - this.method682(var1) << 8) / var3;
    }

  }

  public final int method691(GameString var1, int[] var2, GameString[] var3) {
    if (var1 == null) {
      return 0;
    } else {
      GlobalStatics_4.aClass94_3745.method1553(0, false);
      int var4 = 0;
      int var5 = 0;
      int var6 = -1;
      int var7 = 0;
      byte var8 = 0;
      int var9 = -1;
      int var10 = 0;
      int var11 = 0;
      int var12 = var1.getLength();

      for (int var13 = 0; var13 < var12; ++var13) {
        int var14 = var1.charAt(var13);
        if (var14 == 60) {
          var9 = var13;
        } else {
          if (var14 == 62 && var9 != -1) {
            GameString var15 = var1.substring(var13, 0, var9 + 1);
            var9 = -1;
            GlobalStatics_4.aClass94_3745.method1572(60, (byte) 111);
            GlobalStatics_4.aClass94_3745.append(var15);
            GlobalStatics_4.aClass94_3745.method1572(62, (byte) 112);
            if (var15.method1528((byte) -42, GlobalStatics_4.aClass94_3737)) {
              if (var3[var11] != null) {
                var3[var11].method1553(0, false);
                var3[var11].method1542(1, GlobalStatics_4.aClass94_3745, var5,
                    GlobalStatics_4.aClass94_3745.getLength());
              } else {
                var3[var11] =
                    GlobalStatics_4.aClass94_3745.method1563(101).substring(
                        GlobalStatics_4.aClass94_3745.getLength(), 0, var5);
              }

              ++var11;
              var5 = GlobalStatics_4.aClass94_3745.getLength();
              var4 = 0;
              var6 = -1;
              var10 = 0;
            } else if (var15
                .method1528((byte) -42, GlobalStatics_4.aClass94_3712)) {
              var4 += this.method687(60);
              if (this.aByteArray3733 != null && var10 != 0) {
                var4 += this.aByteArray3733[(var10 << 8) + 60];
              }

              var10 = 60;
            } else if (var15
                .method1528((byte) -42, GlobalStatics_4.aClass94_3711)) {
              var4 += this.method687(62);
              if (this.aByteArray3733 != null && var10 != 0) {
                var4 += this.aByteArray3733[(var10 << 8) + 62];
              }

              var10 = 62;
            } else if (var15
                .method1528((byte) -42, GlobalStatics_4.aClass94_3732)) {
              var4 += this.method687(160);
              if (this.aByteArray3733 != null && var10 != 0) {
                var4 += this.aByteArray3733[(var10 << 8) + 160];
              }

              var10 = 160;
            } else if (var15
                .method1528((byte) -42, GlobalStatics_4.aClass94_3714)) {
              var4 += this.method687(173);
              if (this.aByteArray3733 != null && var10 != 0) {
                var4 += this.aByteArray3733[(var10 << 8) + 173];
              }

              var10 = 173;
            } else if (var15
                .method1528((byte) -42, GlobalStatics_4.aClass94_3729)) {
              var4 += this.method687(215);
              if (this.aByteArray3733 != null && var10 != 0) {
                var4 += this.aByteArray3733[(var10 << 8) + 215];
              }

              var10 = 215;
            } else if (var15
                .method1528((byte) -42, GlobalStatics_4.aClass94_3718)) {
              var4 += this.method687(128);
              if (this.aByteArray3733 != null && var10 != 0) {
                var4 += this.aByteArray3733[(var10 << 8) + 128];
              }

              var10 = 128;
            } else if (var15
                .method1528((byte) -42, GlobalStatics_4.aClass94_3741)) {
              var4 += this.method687(169);
              if (this.aByteArray3733 != null && var10 != 0) {
                var4 += this.aByteArray3733[(var10 << 8) + 169];
              }

              var10 = 169;
            } else if (var15
                .method1528((byte) -42, GlobalStatics_4.aClass94_3743)) {
              var4 += this.method687(174);
              if (this.aByteArray3733 != null && var10 != 0) {
                var4 += this.aByteArray3733[(var10 << 8) + 174];
              }

              var10 = 174;
            } else if (var15.method1558(GlobalStatics_4.aClass94_3739, 0)) {
              int var16 = var15.substring(4).toInteger();
                var4 += this.aClass109Array3740[var16].anInt1469;
                var10 = 0;
            }

            var14 = 0;
          }

          if (var9 == -1) {
            if (var14 != 0) {
              GlobalStatics_4.aClass94_3745.method1572(var14, (byte) 127);
              var4 += this.anIntArray3736[var14];
              if (this.aByteArray3733 != null && var10 != 0) {
                var4 += this.aByteArray3733[(var10 << 8) + var14];
              }

              var10 = var14;
            }

            if (var14 == 32) {
              var6 = GlobalStatics_4.aClass94_3745.getLength();
              var7 = var4;
              var8 = 1;
            }

            if (var2 != null && var4 > var2[var11 < var2.length ? var11
                : var2.length - 1]
                && var6 >= 0) {
              if (var3[var11] != null) {
                var3[var11].method1553(0, false);
                var3[var11] = var3[var11].method1542(1,
                    GlobalStatics_4.aClass94_3745, var5, var6 - var8);
              } else {
                var3[var11] = GlobalStatics_4.aClass94_3745
                    .method1563(88).substring(var6 - var8, 0, var5);
              }

              ++var11;
              var5 = var6;
              var6 = -1;
              var4 -= var7;
              var10 = 0;
            }

            if (var14 == 45) {
              var6 = GlobalStatics_4.aClass94_3745.getLength();
              var7 = var4;
              var8 = 0;
            }
          }
        }
      }

      if (GlobalStatics_4.aClass94_3745.getLength() > var5) {
        if (var3[var11] != null) {
          var3[var11].method1553(0, false);
          var3[var11] = var3[var11]
              .method1542(1, GlobalStatics_4.aClass94_3745, var5,
                  GlobalStatics_4.aClass94_3745.getLength());
        } else {
          var3[var11] = GlobalStatics_4.aClass94_3745.method1563(94).substring(
              GlobalStatics_4.aClass94_3745.getLength(), 0, var5);
        }

        ++var11;
      }

      return var11;
    }
  }

  public final void method692(GameString var1, int var2, int var3, int var4,
      int var5,
      int var6,
      int var7) {
    if (var1 != null) {
      this.method698(var4, var5);
      double var8 = 7.0D - var7 / 8.0D;
      if (var8 < 0.0D) {
        var8 = 0.0D;
      }

      int var10 = var1.getLength();
      int[] var11 = new int[var10];

      for (int var12 = 0; var12 < var10; ++var12) {
        var11[var12] = (int) (Math.sin(var12 / 1.5D + var6 / 1.0D) * var8);
      }

      this.method703(var1, var2 - this.method682(var1) / 2, var3, null, var11);
    }
  }

  public final int method693(GameString var1, int var2, int var3, int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9, int var10, int var11) {
    if (var1 == null) {
      return 0;
    } else {
      this.method701(var6, var7, var8);
      if (var11 == 0) {
        var11 = this.anInt3727;
      }

      int[] var12 = {var4};
      if (var5 < this.anInt3722 + this.anInt3710 + var11
          && var5 < var11 + var11) {
        var12 = null;
      }

      int var13 = this.method691(var1, var12, GlobalStatics_4.aClass94Array3753);
      if (var10 == 3 && var13 == 1) {
        var10 = 1;
      }

      int var14;
      int var15;
      if (var10 == 0) {
        var14 = var3 + this.anInt3722;
      } else if (var10 == 1) {
        var14 = var3 + this.anInt3722
            + (var5 - this.anInt3722 - this.anInt3710 - (var13 - 1) * var11)
            / 2;
      } else if (var10 == 2) {
        var14 = var3 + var5 - this.anInt3710 - (var13 - 1) * var11;
      } else {
        var15 =
            (var5 - this.anInt3722 - this.anInt3710 - (var13 - 1) * var11) / (
                var13 + 1);
        if (var15 < 0) {
          var15 = 0;
        }

        var14 = var3 + this.anInt3722 + var15;
        var11 += var15;
      }

      for (var15 = 0; var15 < var13; ++var15) {
        if (var9 == 0) {
          this.method677(GlobalStatics_4.aClass94Array3753[var15], var2, var14);
        } else if (var9 == 1) {
          this.method677(GlobalStatics_4.aClass94Array3753[var15],
              var2 +
                  (var4 - this.method682(GlobalStatics_4.aClass94Array3753[var15]))
                      / 2, var14);
        } else if (var9 == 2) {
          this.method677(GlobalStatics_4.aClass94Array3753[var15],
              var2 + var4 - this
                  .method682(GlobalStatics_4.aClass94Array3753[var15]), var14);
        } else if (var15 == var13 - 1) {
          this.method677(GlobalStatics_4.aClass94Array3753[var15], var2, var14);
        } else {
          this.method690(GlobalStatics_4.aClass94Array3753[var15], var4);
          this.method677(GlobalStatics_4.aClass94Array3753[var15], var2, var14);
          GlobalStatics_4.anInt3756 = 0;
        }

        var14 += var11;
      }

      return var13;
    }
  }

  public final void method695(GameString var1, int var2, int var3, int var4,
      int var5,
      int var6) {
    if (var1 != null) {
      this.method698(var4, var5);
      int var7 = var1.getLength();
      int[] var8 = new int[var7];
      int[] var9 = new int[var7];

      for (int var10 = 0; var10 < var7; ++var10) {
        var8[var10] = (int) (Math.sin(var10 / 5.0D + var6 / 5.0D) * 5.0D);
        var9[var10] = (int) (Math.sin(var10 / 3.0D + var6 / 5.0D) * 5.0D);
      }

      this.method703(var1, var2 - this.method682(var1) / 2, var3, var8, var9);
    }
  }

  public final void method696(GameString var1, int var2, int var3, int var4,
      int var5,
      int var6) {
    if (var1 != null) {
      this.method698(var4, var5);
      int var7 = var1.getLength();
      int[] var8 = new int[var7];

      for (int var9 = 0; var9 < var7; ++var9) {
        var8[var9] = (int) (Math.sin(var9 / 2.0D + var6 / 5.0D) * 5.0D);
      }

      this.method703(var1, var2 - this.method682(var1) / 2, var3, null, var8);
    }
  }

  public final void method697(AbstractIndexedColorSprite[] var1, int[] var2) {
    if (var2 != null && var2.length != var1.length) {
      throw new IllegalArgumentException();
    } else {
      this.aClass109Array3740 = var1;
      this.anIntArray3723 = var2;
    }
  }

  private void method698(int var1, int var2) {
    GlobalStatics_4.anInt3746 = -1;
    GlobalStatics_4.anInt3747 = -1;
    GlobalStatics_4.anInt3752 = var2;
    GlobalStatics_4.anInt3754 = var2;
    GlobalStatics_4.anInt3749 = var1;
    GlobalStatics_4.anInt3755 = var1;
    GlobalStatics_4.anInt3751 = 256;
    GlobalStatics_4.anInt3750 = 256;
    GlobalStatics_4.anInt3756 = 0;
    GlobalStatics_4.anInt3748 = 0;
  }

  public final void draw(GameString var1, int var2, int var3, int var4,
      int var5) {
    if (var1 != null) {
      this.method698(var4, var5);
      this.method677(var1, var2 - this.method682(var1) / 2, var3);
    }
  }

  private void parseConfig(byte[] var1) {
    this.anIntArray3736 = new int[256];
    int var2;
    if (var1.length == 257) {
      for (var2 = 0; var2 < this.anIntArray3736.length; ++var2) {
        this.anIntArray3736[var2] = var1[var2] & 255;
      }

      this.anInt3727 = var1[256] & 255;
    } else {
      var2 = 0;

      for (int var3 = 0; var3 < 256; ++var3) {
        this.anIntArray3736[var3] = var1[var2++] & 255;
      }

      int[] var10 = new int[256];
      int[] var4 = new int[256];

      int var5;
      for (var5 = 0; var5 < 256; ++var5) {
        var10[var5] = var1[var2++] & 255;
      }

      for (var5 = 0; var5 < 256; ++var5) {
        var4[var5] = var1[var2++] & 255;
      }

      byte[][] var12 = new byte[256][];

      int var8;
      for (int var6 = 0; var6 < 256; ++var6) {
        var12[var6] = new byte[var10[var6]];
        byte var7 = 0;

        for (var8 = 0; var8 < var12[var6].length; ++var8) {
          var7 += var1[var2++];
          var12[var6][var8] = var7;
        }
      }

      byte[][] var11 = new byte[256][];

      int var13;
      for (var13 = 0; var13 < 256; ++var13) {
        var11[var13] = new byte[var10[var13]];
        byte var14 = 0;

        for (int var9 = 0; var9 < var11[var13].length; ++var9) {
          var14 += var1[var2++];
          var11[var13][var9] = var14;
        }
      }

      this.aByteArray3733 = new byte[65536];

      for (var13 = 0; var13 < 256; ++var13) {
        if (var13 != 32 && var13 != 160) {
          for (var8 = 0; var8 < 256; ++var8) {
            if (var8 != 32 && var8 != 160) {
              this.aByteArray3733[(var13 << 8) + var8] =
                  (byte) GlobalStatics_4
                      .method694(var12, var11, var4, this.anIntArray3736, var10,
                          var13, var8);
            }
          }
        }
      }

      this.anInt3727 = var4[32] + var10[32];
    }

  }

  private void method701(int var1, int var2, int var3) {
    GlobalStatics_4.anInt3746 = -1;
    GlobalStatics_4.anInt3747 = -1;
    GlobalStatics_4.anInt3752 = var2;
    GlobalStatics_4.anInt3754 = var2;
    GlobalStatics_4.anInt3749 = var1;
    GlobalStatics_4.anInt3755 = var1;
    GlobalStatics_4.anInt3751 = var3;
    GlobalStatics_4.anInt3750 = var3;
    GlobalStatics_4.anInt3756 = 0;
    GlobalStatics_4.anInt3748 = 0;
  }

  public final int method702(GameString var1, int var2, int var3, int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      Random var10,
      int var11,
      int[] var12) {
    if (var1 == null) {
      return 0;
    } else {
      var10.setSeed(var11);
      this.method701(var6, var7, 192 + (var10.nextInt() & 31));
      int var13 = var1.getLength();
      int[] var14 = new int[var13];
      int var15 = 0;

      int var16;
      for (var16 = 0; var16 < var13; ++var16) {
        var14[var16] = var15;
        if ((var10.nextInt() & 3) == 0) {
          ++var15;
        }
      }

      var16 = var2;
      int var17 = var3 + this.anInt3722;
      int var18 = -1;
      if (var9 == 1) {
        var17 += (var5 - this.anInt3722 - this.anInt3710) / 2;
      } else if (var9 == 2) {
        var17 = var3 + var5 - this.anInt3710;
      }

      if (var8 == 1) {
        var18 = this.method682(var1) + var15;
        var16 = var2 + (var4 - var18) / 2;
      } else if (var8 == 2) {
        var18 = this.method682(var1) + var15;
        var16 = var2 + (var4 - var18);
      }

      this.method703(var1, var16, var17, var14, null);
      if (var12 != null) {
        if (var18 == -1) {
          var18 = this.method682(var1) + var15;
        }

        var12[0] = var16;
        var12[1] = var17 - this.anInt3722;
        var12[2] = var18;
        var12[3] = this.anInt3722 + this.anInt3710;
      }

      return var15;
    }
  }

  private void method703(GameString var1, int var2, int var3, int[] var4,
      int[] var5) {
    var3 -= this.anInt3727;
    int var6 = -1;
    int var7 = 0;
    int var8 = 0;
    int var9 = var1.getLength();

    for (int var10 = 0; var10 < var9; ++var10) {
      int var11 = var1.charAt(var10);
      if (var11 == 60) {
        var6 = var10;
      } else {
        int var13;
        int var14;
        int var15;
        if (var11 == 62 && var6 != -1) {
          GameString var12 = var1.substring(var10, 0, var6 + 1);
          var6 = -1;
          if (var12.method1528((byte) -42, GlobalStatics_4.aClass94_3712)) {
            var11 = 60;
          } else if (var12.method1528((byte) -42, GlobalStatics_4.aClass94_3711)) {
            var11 = 62;
          } else if (var12.method1528((byte) -42, GlobalStatics_4.aClass94_3732)) {
            var11 = 160;
          } else if (var12.method1528((byte) -42, GlobalStatics_4.aClass94_3714)) {
            var11 = 173;
          } else if (var12.method1528((byte) -42, GlobalStatics_4.aClass94_3729)) {
            var11 = 215;
          } else if (var12.method1528((byte) -42, GlobalStatics_4.aClass94_3718)) {
            var11 = 128;
          } else if (var12.method1528((byte) -42, GlobalStatics_4.aClass94_3741)) {
            var11 = 169;
          } else {
            if (!var12.method1528((byte) -42, GlobalStatics_4.aClass94_3743)) {
              if (var12.method1558(GlobalStatics_4.aClass94_3739, 0)) {
                if (var4 != null) {
                    var13 = var4[var8];
                  } else {
                    var13 = 0;
                  }

                  if (var5 != null) {
                    var14 = var5[var8];
                  } else {
                    var14 = 0;
                  }

                  ++var8;
                  var15 = var12.substring(4).toInteger();
                  AbstractIndexedColorSprite var20 = this.aClass109Array3740[var15];
                  int var17 =
                      this.anIntArray3723 != null ? this.anIntArray3723[var15]
                          : var20.anInt1467;
                  if (GlobalStatics_4.anInt3750 == 256) {
                    var20.draw(var2 + var13,
                        var3 + this.anInt3727 - var17 + var14);
                  } else {
                    var20.draw(var2 + var13,
                        var3 + this.anInt3727 - var17 + var14,
                        GlobalStatics_4.anInt3750);
                  }

                  var2 += var20.anInt1469;
                  var7 = 0;
              } else {
                this.method685(var12);
              }
              continue;
            }

            var11 = 174;
          }
        }

        if (var6 == -1) {
          if (this.aByteArray3733 != null && var7 != 0) {
            var2 += this.aByteArray3733[(var7 << 8) + var11];
          }

          int var19 = this.anIntArray3709[var11];
          var13 = this.anIntArray3721[var11];
          if (var4 != null) {
            var14 = var4[var8];
          } else {
            var14 = 0;
          }

          if (var5 != null) {
            var15 = var5[var8];
          } else {
            var15 = 0;
          }

          ++var8;
          if (var11 != 32) {
            if (GlobalStatics_4.anInt3750 == 256) {
              if (GlobalStatics_4.anInt3754 != -1) {
                this.method678(var11,
                    var2 + this.anIntArray3719[var11] + 1 + var14,
                    var3 + this.anIntArray3730[var11] + 1 + var15, var19, var13,
                    GlobalStatics_4.anInt3754);
              }

              this.method678(var11, var2 + this.anIntArray3719[var11] + var14,
                  var3 + this.anIntArray3730[var11] + var15, var19, var13,
                  GlobalStatics_4.anInt3755);
            } else {
              if (GlobalStatics_4.anInt3754 != -1) {
                this.method679(var11,
                    var2 + this.anIntArray3719[var11] + 1 + var14,
                    var3 + this.anIntArray3730[var11] + 1 + var15, var19, var13,
                    GlobalStatics_4.anInt3754,
                    GlobalStatics_4.anInt3750
                );
              }

              this.method679(var11, var2 + this.anIntArray3719[var11] + var14,
                  var3 + this.anIntArray3730[var11] + var15, var19, var13,
                  GlobalStatics_4.anInt3755,
                  GlobalStatics_4.anInt3750
              );
            }
          } else if (GlobalStatics_4.anInt3756 > 0) {
            GlobalStatics_4.anInt3748 += GlobalStatics_4.anInt3756;
            var2 += GlobalStatics_4.anInt3748 >> 8;
            GlobalStatics_4.anInt3748 &= 255;
          }

          int var16 = this.anIntArray3736[var11];
          if (GlobalStatics_4.anInt3746 != -1) {
            if (GlRenderer.useOpenGlRenderer) {
              GlUtils.drawHorizontalLine(var2, var3 + (int) (this.anInt3727
                      * 0.7D), var16,
                  GlobalStatics_4.anInt3746);
            } else {
              DummyClass47.method1317(var2, var3 + (int) (this.anInt3727
                      * 0.7D), var16,
                  GlobalStatics_4.anInt3746);
            }
          }

          if (GlobalStatics_4.anInt3747 != -1) {
            if (GlRenderer.useOpenGlRenderer) {
              GlUtils.drawHorizontalLine(var2, var3 + this.anInt3727, var16,
                  GlobalStatics_4.anInt3747);
            } else {
              DummyClass47.method1317(var2, var3 + this.anInt3727, var16,
                  GlobalStatics_4.anInt3747);
            }
          }

          var2 += var16;
          var7 = var11;
        }
      }
    }

  }

}
