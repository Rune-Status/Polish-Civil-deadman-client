package com.jagex.runescape.model;

import com.jagex.runescape.image_producer.AbstractImageProducerStatics;
import com.jagex.runescape.statics.GlobalStatics_10;

public class SoftwareDirectColorSprite extends AbstractDirectColorSprite {

  public int[] pixels;

  public SoftwareDirectColorSprite(int var1, int var2, int var3, int var4,
      int var5,
      int var6,
      int[] var7) {
    this.anInt3697 = var1;
    this.anInt3706 = var2;
    this.anInt3701 = var3;
    this.anInt3698 = var4;
    this.anInt3707 = var5;
    this.anInt3696 = var6;
    this.pixels = var7;
  }

  public SoftwareDirectColorSprite(int var1, int var2) {
    this.pixels = new int[var1 * var2];
    this.anInt3707 = this.anInt3697 = var1;
    this.anInt3696 = this.anInt3706 = var2;
    this.anInt3701 = this.anInt3698 = 0;
  }

  public final void method652(int var1) {
    if (this.anInt3707 != this.anInt3697 || this.anInt3696 != this.anInt3706) {
      int var2 = var1;
      if (var1 > this.anInt3701) {
        var2 = this.anInt3701;
      }

      int var3 = var1;
      if (var1 + this.anInt3701 + this.anInt3707 > this.anInt3697) {
        var3 = this.anInt3697 - this.anInt3701 - this.anInt3707;
      }

      int var4 = var1;
      if (var1 > this.anInt3698) {
        var4 = this.anInt3698;
      }

      int var5 = var1;
      if (var1 + this.anInt3698 + this.anInt3696 > this.anInt3706) {
        var5 = this.anInt3706 - this.anInt3698 - this.anInt3696;
      }

      int var6 = this.anInt3707 + var2 + var3;
      int var7 = this.anInt3696 + var4 + var5;
      int[] var8 = new int[var6 * var7];

      for (int var9 = 0; var9 < this.anInt3696; ++var9) {
        for (int var10 = 0; var10 < this.anInt3707; ++var10) {
          var8[(var9 + var4) * var6 + var10 + var2] = this.pixels[
              var9 * this.anInt3707
                  + var10];
        }
      }

      this.pixels = var8;
      this.anInt3707 = var6;
      this.anInt3696 = var7;
      this.anInt3701 -= var2;
      this.anInt3698 -= var4;
    }
  }

  public final void method653() {
    int[] var1 = new int[this.anInt3707 * this.anInt3696];
    int var2 = 0;

    for (int var3 = 0; var3 < this.anInt3696; ++var3) {
      for (int var4 = this.anInt3707 - 1; var4 >= 0; --var4) {
        var1[var2++] = this.pixels[var4 + var3 * this.anInt3707];
      }
    }

    this.pixels = var1;
    this.anInt3701 = this.anInt3697 - this.anInt3707 - this.anInt3701;
  }

  public void method635(int var1, int var2) {
    var1 += this.anInt3701;
    var2 += this.anInt3698;
    int var3 = var1 + var2 * AbstractImageProducerStatics.anInt1092;
    int var4 = 0;
    int var5 = this.anInt3696;
    int var6 = this.anInt3707;
    int var7 = AbstractImageProducerStatics.anInt1092 - var6;
    int var8 = 0;
    int var9;
    if (var2 < AbstractImageProducerStatics.anInt1095) {
      var9 = AbstractImageProducerStatics.anInt1095 - var2;
      var5 -= var9;
      var2 = AbstractImageProducerStatics.anInt1095;
      var4 += var9 * var6;
      var3 += var9 * AbstractImageProducerStatics.anInt1092;
    }

    if (var2 + var5 > AbstractImageProducerStatics.anInt1099) {
      var5 -= var2 + var5 - AbstractImageProducerStatics.anInt1099;
    }

    if (var1 < AbstractImageProducerStatics.anInt1093) {
      var9 = AbstractImageProducerStatics.anInt1093 - var1;
      var6 -= var9;
      var1 = AbstractImageProducerStatics.anInt1093;
      var4 += var9;
      var3 += var9;
      var8 += var9;
      var7 += var9;
    }

    if (var1 + var6 > AbstractImageProducerStatics.anInt1096) {
      var9 = var1 + var6 - AbstractImageProducerStatics.anInt1096;
      var6 -= var9;
      var8 += var9;
      var7 += var9;
    }

    if (var6 > 0 && var5 > 0) {
      GlobalStatics_10
          .method659(AbstractImageProducerStatics.anIntArray1100,
              this.pixels, var4, var3, var6, var5, var7, var8);
    }
  }

  public void method636(int var1, int var2, int var3, int var4, int var5,
      int var6) {
    if (var6 != 0) {
      var1 -= this.anInt3701 << 4;
      var2 -= this.anInt3698 << 4;
      double var7 = (var5 & 0xffff) * 9.587379924285257E-5D;
      int var9 = (int) Math.floor(Math.sin(var7) * var6 + 0.5D);
      int var10 = (int) Math.floor(Math.cos(var7) * var6 + 0.5D);
      int var11 = -var1 * var10 - var2 * var9;
      int var12 = - -var1 * var9 - var2 * var10;
      int var13 = ((this.anInt3707 << 4) - var1) * var10 - var2 * var9;
      int var14 = -((this.anInt3707 << 4) - var1) * var9 - var2 * var10;
      int var15 = -var1 * var10 + ((this.anInt3696 << 4) - var2) * var9;
      int var16 = - -var1 * var9 + ((this.anInt3696 << 4) - var2) * var10;
      int var17 = ((this.anInt3707 << 4) - var1) * var10 + ((
          this.anInt3696 << 4) - var2) * var9;
      int var18 = -((this.anInt3707 << 4) - var1) * var9 + ((
          this.anInt3696 << 4) - var2) * var10;
      int var19;
      int var20;
      if (var11 < var13) {
        var19 = var11;
        var20 = var13;
      } else {
        var19 = var13;
        var20 = var11;
      }

      if (var15 < var19) {
        var19 = var15;
      }

      if (var17 < var19) {
        var19 = var17;
      }

      if (var15 > var20) {
        var20 = var15;
      }

      if (var17 > var20) {
        var20 = var17;
      }

      int var21;
      int var22;
      if (var12 < var14) {
        var21 = var12;
        var22 = var14;
      } else {
        var21 = var14;
        var22 = var12;
      }

      if (var16 < var21) {
        var21 = var16;
      }

      if (var18 < var21) {
        var21 = var18;
      }

      if (var16 > var22) {
        var22 = var16;
      }

      if (var18 > var22) {
        var22 = var18;
      }

      var19 >>= 12;
      var20 = var20 + 4095 >> 12;
      var21 >>= 12;
      var22 = var22 + 4095 >> 12;
      var19 += var3;
      var20 += var3;
      var21 += var4;
      var22 += var4;
      var19 >>= 4;
      var20 = var20 + 15 >> 4;
      var21 >>= 4;
      var22 = var22 + 15 >> 4;
      if (var19 < AbstractImageProducerStatics.anInt1093) {
        var19 = AbstractImageProducerStatics.anInt1093;
      }

      if (var20 > AbstractImageProducerStatics.anInt1096) {
        var20 = AbstractImageProducerStatics.anInt1096;
      }

      if (var21 < AbstractImageProducerStatics.anInt1095) {
        var21 = AbstractImageProducerStatics.anInt1095;
      }

      if (var22 > AbstractImageProducerStatics.anInt1099) {
        var22 = AbstractImageProducerStatics.anInt1099;
      }

      var20 = var19 - var20;
      if (var20 < 0) {
        var22 = var21 - var22;
        if (var22 < 0) {
          int var23 =
              var21 * AbstractImageProducerStatics.anInt1092 + var19;
          double var24 = 1.6777216E7D / var6;
          int var26 = (int) Math.floor(Math.sin(var7) * var24 + 0.5D);
          int var27 = (int) Math.floor(Math.cos(var7) * var24 + 0.5D);
          int var28 = (var19 << 4) + 8 - var3;
          int var29 = (var21 << 4) + 8 - var4;
          int var30 = (var1 << 8) - (var29 * var26 >> 4);
          int var31 = (var2 << 8) + (var29 * var27 >> 4);
          int var34;
          int var35;
          int var32;
          int var33;
          int var38;
          int var36;
          int var37;
          if (var27 == 0) {
            if (var26 == 0) {
              for (var33 = var22; var33 < 0;
                  var23 += AbstractImageProducerStatics.anInt1092) {
                var34 = var23;
                var35 = var30;
                var36 = var31;
                var37 = var20;
                if (var30 >= 0 && var31 >= 0
                    && var30 - (this.anInt3707 << 12) < 0
                    && var31 - (this.anInt3696 << 12) < 0) {
                  for (; var37 < 0; ++var37) {
                    var38 = this.pixels[(var36 >> 12) * this.anInt3707 + (var35
                        >> 12)];
                    if (var38 == 0) {
                      ++var34;
                    } else {
                      AbstractImageProducerStatics.anIntArray1100[var34++] = var38;
                    }
                  }
                }

                ++var33;
              }
            } else if (var26 < 0) {
              for (var33 = var22; var33 < 0;
                  var23 += AbstractImageProducerStatics.anInt1092) {
                var34 = var23;
                var35 = var30;
                var36 = var31 + (var28 * var26 >> 4);
                var37 = var20;
                if (var30 >= 0 && var30 - (this.anInt3707 << 12) < 0) {
                  if ((var32 = var36 - (this.anInt3696 << 12)) >= 0) {
                    var32 = (var26 - var32) / var26;
                    var37 = var20 + var32;
                    var36 += var26 * var32;
                    var34 = var23 + var32;
                  }

                  if ((var32 = (var36 - var26) / var26) > var37) {
                    var37 = var32;
                  }

                  while (var37 < 0) {
                    var38 = this.pixels[(var36 >> 12) * this.anInt3707 + (var35
                        >> 12)];
                    if (var38 == 0) {
                      ++var34;
                    } else {
                      AbstractImageProducerStatics.anIntArray1100[var34++] = var38;
                    }

                    var36 += var26;
                    ++var37;
                  }
                }

                ++var33;
                var30 -= var26;
              }
            } else {
              for (var33 = var22; var33 < 0;
                  var23 += AbstractImageProducerStatics.anInt1092) {
                var34 = var23;
                var35 = var30;
                var36 = var31 + (var28 * var26 >> 4);
                var37 = var20;
                if (var30 >= 0 && var30 - (this.anInt3707 << 12) < 0) {
                  if (var36 < 0) {
                    var32 = (var26 - 1 - var36) / var26;
                    var37 = var20 + var32;
                    var36 += var26 * var32;
                    var34 = var23 + var32;
                  }

                  if ((var32 =
                      (1 + var36 - (this.anInt3696 << 12) - var26) / var26)
                      > var37) {
                    var37 = var32;
                  }

                  while (var37 < 0) {
                    var38 = this.pixels[(var36 >> 12) * this.anInt3707 + (var35
                        >> 12)];
                    if (var38 == 0) {
                      ++var34;
                    } else {
                      AbstractImageProducerStatics.anIntArray1100[var34++] = var38;
                    }

                    var36 += var26;
                    ++var37;
                  }
                }

                ++var33;
                var30 -= var26;
              }
            }
          } else if (var27 < 0) {
            if (var26 == 0) {
              for (var33 = var22; var33 < 0;
                  var23 += AbstractImageProducerStatics.anInt1092) {
                var34 = var23;
                var35 = var30 + (var28 * var27 >> 4);
                var36 = var31;
                var37 = var20;
                if (var31 >= 0 && var31 - (this.anInt3696 << 12) < 0) {
                  if ((var32 = var35 - (this.anInt3707 << 12)) >= 0) {
                    var32 = (var27 - var32) / var27;
                    var37 = var20 + var32;
                    var35 += var27 * var32;
                    var34 = var23 + var32;
                  }

                  if ((var32 = (var35 - var27) / var27) > var37) {
                    var37 = var32;
                  }

                  while (var37 < 0) {
                    var38 = this.pixels[(var36 >> 12) * this.anInt3707 + (var35
                        >> 12)];
                    if (var38 == 0) {
                      ++var34;
                    } else {
                      AbstractImageProducerStatics.anIntArray1100[var34++] = var38;
                    }

                    var35 += var27;
                    ++var37;
                  }
                }

                ++var33;
                var31 += var27;
              }
            } else if (var26 < 0) {
              for (var33 = var22; var33 < 0;
                  var23 += AbstractImageProducerStatics.anInt1092) {
                var34 = var23;
                var35 = var30 + (var28 * var27 >> 4);
                var36 = var31 + (var28 * var26 >> 4);
                var37 = var20;
                if ((var32 = var35 - (this.anInt3707 << 12)) >= 0) {
                  var32 = (var27 - var32) / var27;
                  var37 = var20 + var32;
                  var35 += var27 * var32;
                  var36 += var26 * var32;
                  var34 = var23 + var32;
                }

                if ((var32 = (var35 - var27) / var27) > var37) {
                  var37 = var32;
                }

                if ((var32 = var36 - (this.anInt3696 << 12)) >= 0) {
                  var32 = (var26 - var32) / var26;
                  var37 += var32;
                  var35 += var27 * var32;
                  var36 += var26 * var32;
                  var34 += var32;
                }

                if ((var32 = (var36 - var26) / var26) > var37) {
                  var37 = var32;
                }

                while (var37 < 0) {
                  var38 = this.pixels[(var36 >> 12) * this.anInt3707 + (var35
                      >> 12)];
                  if (var38 == 0) {
                    ++var34;
                  } else {
                    AbstractImageProducerStatics.anIntArray1100[var34++] = var38;
                  }

                  var35 += var27;
                  var36 += var26;
                  ++var37;
                }

                ++var33;
                var30 -= var26;
                var31 += var27;
              }
            } else {
              for (var33 = var22; var33 < 0;
                  var23 += AbstractImageProducerStatics.anInt1092) {
                var34 = var23;
                var35 = var30 + (var28 * var27 >> 4);
                var36 = var31 + (var28 * var26 >> 4);
                var37 = var20;
                if ((var32 = var35 - (this.anInt3707 << 12)) >= 0) {
                  var32 = (var27 - var32) / var27;
                  var37 = var20 + var32;
                  var35 += var27 * var32;
                  var36 += var26 * var32;
                  var34 = var23 + var32;
                }

                if ((var32 = (var35 - var27) / var27) > var37) {
                  var37 = var32;
                }

                if (var36 < 0) {
                  var32 = (var26 - 1 - var36) / var26;
                  var37 += var32;
                  var35 += var27 * var32;
                  var36 += var26 * var32;
                  var34 += var32;
                }

                if ((var32 =
                    (1 + var36 - (this.anInt3696 << 12) - var26) / var26)
                    > var37) {
                  var37 = var32;
                }

                while (var37 < 0) {
                  var38 = this.pixels[(var36 >> 12) * this.anInt3707 + (var35
                      >> 12)];
                  if (var38 == 0) {
                    ++var34;
                  } else {
                    AbstractImageProducerStatics.anIntArray1100[var34++] = var38;
                  }

                  var35 += var27;
                  var36 += var26;
                  ++var37;
                }

                ++var33;
                var30 -= var26;
                var31 += var27;
              }
            }
          } else if (var26 == 0) {
            for (var33 = var22; var33 < 0;
                var23 += AbstractImageProducerStatics.anInt1092) {
              var34 = var23;
              var35 = var30 + (var28 * var27 >> 4);
              var36 = var31;
              var37 = var20;
              if (var31 >= 0 && var31 - (this.anInt3696 << 12) < 0) {
                if (var35 < 0) {
                  var32 = (var27 - 1 - var35) / var27;
                  var37 = var20 + var32;
                  var35 += var27 * var32;
                  var34 = var23 + var32;
                }

                if ((var32 =
                    (1 + var35 - (this.anInt3707 << 12) - var27) / var27)
                    > var37) {
                  var37 = var32;
                }

                while (var37 < 0) {
                  var38 = this.pixels[(var36 >> 12) * this.anInt3707 + (var35
                      >> 12)];
                  if (var38 == 0) {
                    ++var34;
                  } else {
                    AbstractImageProducerStatics.anIntArray1100[var34++] = var38;
                  }

                  var35 += var27;
                  ++var37;
                }
              }

              ++var33;
              var31 += var27;
            }
          } else if (var26 < 0) {
            for (var33 = var22; var33 < 0;
                var23 += AbstractImageProducerStatics.anInt1092) {
              var34 = var23;
              var35 = var30 + (var28 * var27 >> 4);
              var36 = var31 + (var28 * var26 >> 4);
              var37 = var20;
              if (var35 < 0) {
                var32 = (var27 - 1 - var35) / var27;
                var37 = var20 + var32;
                var35 += var27 * var32;
                var36 += var26 * var32;
                var34 = var23 + var32;
              }

              if ((var32 = (1 + var35 - (this.anInt3707 << 12) - var27) / var27)
                  > var37) {
                var37 = var32;
              }

              if ((var32 = var36 - (this.anInt3696 << 12)) >= 0) {
                var32 = (var26 - var32) / var26;
                var37 += var32;
                var35 += var27 * var32;
                var36 += var26 * var32;
                var34 += var32;
              }

              if ((var32 = (var36 - var26) / var26) > var37) {
                var37 = var32;
              }

              while (var37 < 0) {
                var38 = this.pixels[(var36 >> 12) * this.anInt3707 + (var35
                    >> 12)];
                if (var38 == 0) {
                  ++var34;
                } else {
                  AbstractImageProducerStatics.anIntArray1100[var34++] = var38;
                }

                var35 += var27;
                var36 += var26;
                ++var37;
              }

              ++var33;
              var30 -= var26;
              var31 += var27;
            }
          } else {
            for (var33 = var22; var33 < 0;
                var23 += AbstractImageProducerStatics.anInt1092) {
              var34 = var23;
              var35 = var30 + (var28 * var27 >> 4);
              var36 = var31 + (var28 * var26 >> 4);
              var37 = var20;
              if (var35 < 0) {
                var32 = (var27 - 1 - var35) / var27;
                var37 = var20 + var32;
                var35 += var27 * var32;
                var36 += var26 * var32;
                var34 = var23 + var32;
              }

              if ((var32 = (1 + var35 - (this.anInt3707 << 12) - var27) / var27)
                  > var37) {
                var37 = var32;
              }

              if (var36 < 0) {
                var32 = (var26 - 1 - var36) / var26;
                var37 += var32;
                var35 += var27 * var32;
                var36 += var26 * var32;
                var34 += var32;
              }

              if ((var32 = (1 + var36 - (this.anInt3696 << 12) - var26) / var26)
                  > var37) {
                var37 = var32;
              }

              while (var37 < 0) {
                var38 = this.pixels[(var36 >> 12) * this.anInt3707 + (var35
                    >> 12)];
                if (var38 == 0) {
                  ++var34;
                } else {
                  AbstractImageProducerStatics.anIntArray1100[var34++] = var38;
                }

                var35 += var27;
                var36 += var26;
                ++var37;
              }

              ++var33;
              var30 -= var26;
              var31 += var27;
            }
          }

        }
      }
    }
  }

  public void method637(int var1, int var2, int var3) {
    var1 += this.anInt3701;
    var2 += this.anInt3698;
    int var4 = var1 + var2 * AbstractImageProducerStatics.anInt1092;
    int var5 = 0;
    int var6 = this.anInt3696;
    int var7 = this.anInt3707;
    int var8 = AbstractImageProducerStatics.anInt1092 - var7;
    int var9 = 0;
    int var10;
    if (var2 < AbstractImageProducerStatics.anInt1095) {
      var10 = AbstractImageProducerStatics.anInt1095 - var2;
      var6 -= var10;
      var2 = AbstractImageProducerStatics.anInt1095;
      var5 += var10 * var7;
      var4 += var10 * AbstractImageProducerStatics.anInt1092;
    }

    if (var2 + var6 > AbstractImageProducerStatics.anInt1099) {
      var6 -= var2 + var6 - AbstractImageProducerStatics.anInt1099;
    }

    if (var1 < AbstractImageProducerStatics.anInt1093) {
      var10 = AbstractImageProducerStatics.anInt1093 - var1;
      var7 -= var10;
      var1 = AbstractImageProducerStatics.anInt1093;
      var5 += var10;
      var4 += var10;
      var9 += var10;
      var8 += var10;
    }

    if (var1 + var7 > AbstractImageProducerStatics.anInt1096) {
      var10 = var1 + var7 - AbstractImageProducerStatics.anInt1096;
      var7 -= var10;
      var9 += var10;
      var8 += var10;
    }

    if (var7 > 0 && var6 > 0) {
      GlobalStatics_10
          .method662(AbstractImageProducerStatics.anIntArray1100,
              this.pixels, 0, var5, var4, var7, var6, var8, var9,
              var3);
    }
  }

  public void draw(int var1, int var2, int var3, int var4) {
    if (var3 > 0 && var4 > 0) {
      int var5 = this.anInt3707;
      int var6 = this.anInt3696;
      int var7 = 0;
      int var8 = 0;
      int var9 = this.anInt3697;
      int var10 = this.anInt3706;
      int var11 = (var9 << 16) / var3;
      int var12 = (var10 << 16) / var4;
      int var13;
      if (this.anInt3701 > 0) {
        var13 = ((this.anInt3701 << 16) + var11 - 1) / var11;
        var1 += var13;
        var7 += var13 * var11 - (this.anInt3701 << 16);
      }

      if (this.anInt3698 > 0) {
        var13 = ((this.anInt3698 << 16) + var12 - 1) / var12;
        var2 += var13;
        var8 += var13 * var12 - (this.anInt3698 << 16);
      }

      if (var5 < var9) {
        var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
      }

      if (var6 < var10) {
        var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
      }

      var13 = var1 + var2 * AbstractImageProducerStatics.anInt1092;
      int var14 = AbstractImageProducerStatics.anInt1092 - var3;
      if (var2 + var4 > AbstractImageProducerStatics.anInt1099) {
        var4 -= var2 + var4 - AbstractImageProducerStatics.anInt1099;
      }

      int var15;
      if (var2 < AbstractImageProducerStatics.anInt1095) {
        var15 = AbstractImageProducerStatics.anInt1095 - var2;
        var4 -= var15;
        var13 += var15 * AbstractImageProducerStatics.anInt1092;
        var8 += var12 * var15;
      }

      if (var1 + var3 > AbstractImageProducerStatics.anInt1096) {
        var15 = var1 + var3 - AbstractImageProducerStatics.anInt1096;
        var3 -= var15;
        var14 += var15;
      }

      if (var1 < AbstractImageProducerStatics.anInt1093) {
        var15 = AbstractImageProducerStatics.anInt1093 - var1;
        var3 -= var15;
        var13 += var15;
        var7 += var11 * var15;
        var14 += var15;
      }

      GlobalStatics_10
          .method670(AbstractImageProducerStatics.anIntArray1100,
              this.pixels, 0, var7, var8, var13, var14, var3, var4,
              var11, var12, var5);
    }
  }

  public void method641(int var1, int var2) {
    var1 += this.anInt3697 - this.anInt3707 - this.anInt3701;
    var2 += this.anInt3698;
    int var3 = var1 + var2 * AbstractImageProducerStatics.anInt1092;
    int var4 = this.anInt3707 - 1;
    int var5 = this.anInt3696;
    int var6 = this.anInt3707;
    int var7 = AbstractImageProducerStatics.anInt1092 - var6;
    int var8 = var6 + var6;
    int var9;
    if (var2 < AbstractImageProducerStatics.anInt1095) {
      var9 = AbstractImageProducerStatics.anInt1095 - var2;
      var5 -= var9;
      var2 = AbstractImageProducerStatics.anInt1095;
      var4 += var9 * var6;
      var3 += var9 * AbstractImageProducerStatics.anInt1092;
    }

    if (var2 + var5 > AbstractImageProducerStatics.anInt1099) {
      var5 -= var2 + var5 - AbstractImageProducerStatics.anInt1099;
    }

    if (var1 < AbstractImageProducerStatics.anInt1093) {
      var9 = AbstractImageProducerStatics.anInt1093 - var1;
      var6 -= var9;
      var1 = AbstractImageProducerStatics.anInt1093;
      var4 -= var9;
      var3 += var9;
      var8 -= var9;
      var7 += var9;
    }

    if (var1 + var6 > AbstractImageProducerStatics.anInt1096) {
      var9 = var1 + var6 - AbstractImageProducerStatics.anInt1096;
      var6 -= var9;
      var8 -= var9;
      var7 += var9;
    }

    if (var6 > 0 && var5 > 0) {
      GlobalStatics_10
          .method656(AbstractImageProducerStatics.anIntArray1100,
              this.pixels, 0, var4, var3, var6, var5, var7, var8);
    }
  }

  public void method642(int var1, int var2, int var3, int var4, int var5) {
    if (var3 > 0 && var4 > 0) {
      int var6 = this.anInt3707;
      int var7 = this.anInt3696;
      int var8 = 0;
      int var9 = 0;
      int var10 = this.anInt3697;
      int var11 = this.anInt3706;
      int var12 = (var10 << 16) / var3;
      int var13 = (var11 << 16) / var4;
      int var14;
      if (this.anInt3701 > 0) {
        var14 = ((this.anInt3701 << 16) + var12 - 1) / var12;
        var1 += var14;
        var8 += var14 * var12 - (this.anInt3701 << 16);
      }

      if (this.anInt3698 > 0) {
        var14 = ((this.anInt3698 << 16) + var13 - 1) / var13;
        var2 += var14;
        var9 += var14 * var13 - (this.anInt3698 << 16);
      }

      if (var6 < var10) {
        var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
      }

      if (var7 < var11) {
        var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
      }

      var14 = var1 + var2 * AbstractImageProducerStatics.anInt1092;
      int var15 = AbstractImageProducerStatics.anInt1092 - var3;
      if (var2 + var4 > AbstractImageProducerStatics.anInt1099) {
        var4 -= var2 + var4 - AbstractImageProducerStatics.anInt1099;
      }

      int var16;
      if (var2 < AbstractImageProducerStatics.anInt1095) {
        var16 = AbstractImageProducerStatics.anInt1095 - var2;
        var4 -= var16;
        var14 += var16 * AbstractImageProducerStatics.anInt1092;
        var9 += var13 * var16;
      }

      if (var1 + var3 > AbstractImageProducerStatics.anInt1096) {
        var16 = var1 + var3 - AbstractImageProducerStatics.anInt1096;
        var3 -= var16;
        var15 += var16;
      }

      if (var1 < AbstractImageProducerStatics.anInt1093) {
        var16 = AbstractImageProducerStatics.anInt1093 - var1;
        var3 -= var16;
        var14 += var16;
        var8 += var12 * var16;
        var15 += var16;
      }

      GlobalStatics_10
          .method661(AbstractImageProducerStatics.anIntArray1100,
              this.pixels, 0, var8, var9, var14, var15, var3, var4,
              var12, var13, var6, var5);
    }
  }

  public void method643(int var1, int var2) {
    var1 += this.anInt3701;
    var2 += this.anInt3698;
    int var3 = var1 + var2 * AbstractImageProducerStatics.anInt1092;
    int var4 = 0;
    int var5 = this.anInt3696;
    int var6 = this.anInt3707;
    int var7 = AbstractImageProducerStatics.anInt1092 - var6;
    int var8 = 0;
    int var9;
    if (var2 < AbstractImageProducerStatics.anInt1095) {
      var9 = AbstractImageProducerStatics.anInt1095 - var2;
      var5 -= var9;
      var2 = AbstractImageProducerStatics.anInt1095;
      var4 += var9 * var6;
      var3 += var9 * AbstractImageProducerStatics.anInt1092;
    }

    if (var2 + var5 > AbstractImageProducerStatics.anInt1099) {
      var5 -= var2 + var5 - AbstractImageProducerStatics.anInt1099;
    }

    if (var1 < AbstractImageProducerStatics.anInt1093) {
      var9 = AbstractImageProducerStatics.anInt1093 - var1;
      var6 -= var9;
      var1 = AbstractImageProducerStatics.anInt1093;
      var4 += var9;
      var3 += var9;
      var8 += var9;
      var7 += var9;
    }

    if (var1 + var6 > AbstractImageProducerStatics.anInt1096) {
      var9 = var1 + var6 - AbstractImageProducerStatics.anInt1096;
      var6 -= var9;
      var8 += var9;
      var7 += var9;
    }

    if (var6 > 0 && var5 > 0) {
      GlobalStatics_10
          .method654(AbstractImageProducerStatics.anIntArray1100,
              this.pixels, 0, var4, var3, var6, var5, var7, var8);
    }
  }

  public final int[] method655() {
    int[] var4 = new int[this.anInt3697 * this.anInt3706];

    for (int var5 = 0; var5 < this.anInt3696; ++var5) {
      int var1 = var5 * this.anInt3707;
      int var2 = this.anInt3701 + (var5 + this.anInt3698) * this.anInt3697;

      for (int var6 = 0; var6 < this.anInt3707; ++var6) {
        int var3 = this.pixels[var1++];
        var4[var2++] = var3 != 0 ? -16777216 | var3 : 0;
      }
    }

    return var4;
  }

  public final void method657(int var1) {
    int[] var2 = new int[this.anInt3707 * this.anInt3696];
    int var3 = 0;

    for (int var4 = 0; var4 < this.anInt3696; ++var4) {
      for (int var5 = 0; var5 < this.anInt3707; ++var5) {
        int var6 = this.pixels[var3];
        if (var6 == 0) {
          if (var5 > 0 && this.pixels[var3 - 1] != 0) {
            var6 = var1;
          } else if (var4 > 0 && this.pixels[var3 - this.anInt3707] != 0) {
            var6 = var1;
          } else if (var5 < this.anInt3707 - 1 && this.pixels[var3 + 1] != 0) {
            var6 = var1;
          } else if (var4 < this.anInt3696
              - 1 && this.pixels[var3 + this.anInt3707] != 0) {
            var6 = var1;
          }
        }

        var2[var3++] = var6;
      }
    }

    this.pixels = var2;
  }

  public final void method658() {
    AbstractImageProducerStatics.method1319(this.pixels, this.anInt3707, this.anInt3696);
  }

  public void method660(int var1, int var2, int var3, int var4, int var5,
      int var6,
      double var7,
      int var9) {
    int var10 = -var3 / 2;
    int var11 = -var4 / 2;
    int var12 = (int) (Math.sin(var7) * 65536.0D);
    int var13 = (int) (Math.cos(var7) * 65536.0D);
    var12 = var12 * var9 >> 8;
    var13 = var13 * var9 >> 8;
    int var14 = (var5 << 16) + var11 * var12 + var10 * var13;
    int var15 = (var6 << 16) + var11 * var13 - var10 * var12;
    int var16 = var1 + var2 * AbstractImageProducerStatics.anInt1092;

    for (var2 = 0; var2 < var4; ++var2) {
      int var17 = var16;
      int var18 = var14;
      int var19 = var15;

      for (var1 = -var3; var1 < 0; ++var1) {
        int var20 = this.pixels[(var18 >> 16) + (var19 >> 16) * this.anInt3707];
        if (var20 == 0) {
          ++var17;
        } else {
          AbstractImageProducerStatics.anIntArray1100[var17++] = var20;
        }

        var18 += var13;
        var19 -= var12;
      }

      var14 += var12;
      var15 += var13;
      var16 += AbstractImageProducerStatics.anInt1092;
    }

  }

  public final void method663() {
    int[] var1 = new int[this.anInt3707 * this.anInt3696];
    int var2 = 0;

    for (int var3 = this.anInt3696 - 1; var3 >= 0; --var3) {
      for (int var4 = 0; var4 < this.anInt3707; ++var4) {
        var1[var2++] = this.pixels[var4 + var3 * this.anInt3707];
      }
    }

    this.pixels = var1;
    this.anInt3698 = this.anInt3706 - this.anInt3696 - this.anInt3698;
  }

  public void method664(int var1, int var2, int var3, int var4, int var5,
      int var6,
      int var7,
      int var8,
      int[] var9,
      int[] var10) {
    int var11 = -var3 / 2;
    int var12 = -var4 / 2;
    int var13 = (int) (Math.sin(var7 / 326.11D) * 65536.0D);
    int var14 = (int) (Math.cos(var7 / 326.11D) * 65536.0D);
    var13 = var13 * var8 >> 8;
    var14 = var14 * var8 >> 8;
    int var15 = (var5 << 16) + var12 * var13 + var11 * var14;
    int var16 = (var6 << 16) + var12 * var14 - var11 * var13;
    int var17 = var1 + var2 * AbstractImageProducerStatics.anInt1092;

    for (var2 = 0; var2 < var4; ++var2) {
      int var18 = var9[var2];
      int var19 = var17 + var18;
      int var20 = var15 + var14 * var18;
      int var21 = var16 - var13 * var18;

      for (var1 = -var10[var2]; var1 < 0; ++var1) {
        AbstractImageProducerStatics.anIntArray1100[var19++] =
            this.pixels[(var20 >> 16) + (var21 >> 16) * this.anInt3707];
        var20 += var14;
        var21 -= var13;
      }

      var15 += var13;
      var16 += var14;
      var17 += AbstractImageProducerStatics.anInt1092;
    }

  }

  public final void method665() {
    if (this.anInt3707 != this.anInt3697 || this.anInt3696 != this.anInt3706) {
      int[] var1 = new int[this.anInt3697 * this.anInt3706];

      for (int var2 = 0; var2 < this.anInt3696; ++var2) {
        for (int var3 = 0; var3 < this.anInt3707; ++var3) {
          var1[(var2 + this.anInt3698) * this.anInt3697 + var3
              + this.anInt3701] =
              this.pixels[var2 * this.anInt3707 + var3];
        }
      }

      this.pixels = var1;
      this.anInt3707 = this.anInt3697;
      this.anInt3696 = this.anInt3706;
      this.anInt3701 = 0;
      this.anInt3698 = 0;
    }
  }

  public final void method666(int var1, int var2, int[] var3, int[] var4) {
    if (AbstractImageProducerStatics.anInt1099
        - AbstractImageProducerStatics.anInt1095 == var3.length) {
      var1 += this.anInt3701;
      var2 += this.anInt3698;
      int var5 = 0;
      int var6 = this.anInt3696;
      int var7 = this.anInt3707;
      int var8 = AbstractImageProducerStatics.anInt1092 - var7;
      int var9 = 0;
      int var10 = var1 + var2 * AbstractImageProducerStatics.anInt1092;
      int var11;
      if (var2 < AbstractImageProducerStatics.anInt1095) {
        var11 = AbstractImageProducerStatics.anInt1095 - var2;
        var6 -= var11;
        var2 = AbstractImageProducerStatics.anInt1095;
        var5 += var11 * var7;
        var10 += var11 * AbstractImageProducerStatics.anInt1092;
      }

      if (var2 + var6 > AbstractImageProducerStatics.anInt1099) {
        var6 -= var2 + var6 - AbstractImageProducerStatics.anInt1099;
      }

      if (var1 < AbstractImageProducerStatics.anInt1093) {
        var11 = AbstractImageProducerStatics.anInt1093 - var1;
        var7 -= var11;
        var1 = AbstractImageProducerStatics.anInt1093;
        var5 += var11;
        var10 += var11;
        var9 += var11;
        var8 += var11;
      }

      if (var1 + var7 > AbstractImageProducerStatics.anInt1096) {
        var11 = var1 + var7 - AbstractImageProducerStatics.anInt1096;
        var7 -= var11;
        var9 += var11;
        var8 += var11;
      }

      if (var7 > 0 && var6 > 0) {
        var11 = var1 - AbstractImageProducerStatics.anInt1093;
        int var12 = var2 - AbstractImageProducerStatics.anInt1095;

        for (int var13 = var12; var13 < var12 + var6; ++var13) {
          int var14 = var3[var13];
          int var15 = var4[var13];
          int var16 = var7;
          int var17;
          if (var11 > var14) {
            var17 = var11 - var14;
            if (var17 >= var15) {
              var5 += var7 + var9;
              var10 += var7 + var8;
              continue;
            }

            var15 -= var17;
          } else {
            var17 = var14 - var11;
            if (var17 >= var7) {
              var5 += var7 + var9;
              var10 += var7 + var8;
              continue;
            }

            var5 += var17;
            var16 = var7 - var17;
            var10 += var17;
          }

          var17 = 0;
          if (var16 < var15) {
            var15 = var16;
          } else {
            var17 = var16 - var15;
          }

          for (int var18 = -var15; var18 < 0; ++var18) {
            int var19 = this.pixels[var5++];
            if (var19 == 0) {
              ++var10;
            } else {
              AbstractImageProducerStatics.anIntArray1100[var10++] = var19;
            }
          }

          var5 += var17 + var9;
          var10 += var17 + var8;
        }

      }
    } else {
      throw new IllegalStateException();
    }
  }

  public void method667(int var1, int var2, int var3, int var4, int var5,
      int var6,
      int var7,
      int var8,
      int[] var9,
      int[] var10) {
    int var11 = -var3 / 2;
    int var12 = -var4 / 2;
    int var13 = (int) (Math.sin(var7 / 326.11D) * 65536.0D);
    int var14 = (int) (Math.cos(var7 / 326.11D) * 65536.0D);
    var13 = var13 * var8 >> 8;
    var14 = var14 * var8 >> 8;
    int var15 = (var5 << 16) + var12 * var13 + var11 * var14;
    int var16 = (var6 << 16) + var12 * var14 - var11 * var13;
    int var17 = var1 + var2 * AbstractImageProducerStatics.anInt1092;

    for (var2 = 0; var2 < var4; ++var2) {
      int var18 = var9[var2];
      int var19 = var17 + var18;
      int var20 = var15 + var14 * var18;
      int var21 = var16 - var13 * var18;

      for (var1 = -var10[var2]; var1 < 0; ++var1) {
        int var22 = this.pixels[(var20 >> 16) + (var21 >> 16) * this.anInt3707];
        if (var22 == 0) {
          ++var19;
        } else {
          AbstractImageProducerStatics.anIntArray1100[var19++] = var22;
        }

        var20 += var14;
        var21 -= var13;
      }

      var15 += var13;
      var16 += var14;
      var17 += AbstractImageProducerStatics.anInt1092;
    }

  }

  public final void method668(int var1) {
    for (int var2 = this.anInt3696 - 1; var2 > 0; --var2) {
      int var3 = var2 * this.anInt3707;

      for (int var4 = this.anInt3707 - 1; var4 > 0; --var4) {
        if (this.pixels[var4 + var3] == 0
            && this.pixels[var4 + var3 - 1 - this.anInt3707] != 0) {
          this.pixels[var4 + var3] = var1;
        }
      }
    }

  }

  public final void method669(int var1, int var2, int var3) {
    for (int var4 = 0; var4 < this.pixels.length; ++var4) {
      int var5 = this.pixels[var4];
      if (var5 != 0) {
        int var6 = var5 >> 16 & 255;
        var6 += var1;
        if (var6 < 1) {
          var6 = 1;
        } else if (var6 > 255) {
          var6 = 255;
        }

        int var7 = var5 >> 8 & 255;
        var7 += var2;
        if (var7 < 1) {
          var7 = 1;
        } else if (var7 > 255) {
          var7 = 255;
        }

        int var8 = var5 & 255;
        var8 += var3;
        if (var8 < 1) {
          var8 = 1;
        } else if (var8 > 255) {
          var8 = 255;
        }

        this.pixels[var4] = (var6 << 16) + (var7 << 8) + var8;
      }
    }

  }

}
