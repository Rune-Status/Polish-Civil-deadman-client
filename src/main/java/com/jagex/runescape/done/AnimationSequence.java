package com.jagex.runescape.done;

import com.jagex.runescape.GlobalStatics_6;
import com.jagex.runescape.GlobalStatics_9;
import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.opengl.GlModel;
import com.jagex.runescape.opengl.GlRenderer;

public final class AnimationSequence {

  public int anInt1845 = 2;
  public boolean tween;
  public boolean aBoolean1848;
  public int anInt1849 = -1;
  public int anInt1850 = -1;
  public int[] anIntArray1851;
  public int anInt1854 = -1;
  public boolean[] aBooleanArray1855;
  public int anInt1857 = 5;
  public boolean aBoolean1859;
  public int anInt1861 = 99;
  public int anInt1864;
  public int anInt1865 = -1;
  public int anInt1866 = -1;
  public int[][] anIntArrayArray1867;
  public int[] anIntArray1869;
  public boolean aBoolean1872;
  private int[] anIntArray1870;

  public void method2053(Buffer var1, byte var2 ) {
    if (var2 != -102) {
        this.method2055(null, (byte) 88, 7, 103, 54);
      }

      while (true) {
        int var3 = var1.readUnsignedByte();
        if (var3 == 0) {
          return;
        }

        this.method2060(var3, (byte) -73, var1);
      }
  }

  public AbstractModel method2054(int var1, int var2, int var3,
                                  AbstractModel var4, int var5,
                                  int var6 ) {
    int var7 = this.anIntArray1869[var2];
      var2 = this.anIntArray1851[var2];
      AnimationSomething var8 = GlobalStatics_6.method133(var2 >> 16, var1 - 19749);
      var2 &= '\uffff';
      if (var8 == null) {
        return var4.method1890(true, true, true);
      } else {
        var5 &= 3;
        AnimationSomething var9 = null;
        if (var1 != 19749) {
          this.method2053(null, (byte) -126);
        }

        if ((this.tween || GlobalStatics_9.tweening) && (var3 != -1)
          && this.anIntArray1851.length > var3) {
          var3 = this.anIntArray1851[var3];
          var9 = GlobalStatics_6.method133(var3 >> 16, 0);
          var3 &= '\uffff';
        }

        AbstractModel var10;
        if (var9 != null) {
          var10 =
            var4.method1890(!var8.method559(1317095745, var2) & !var9.method559(1317095745, var3),
              !var8.method561(var2, (byte) 125) & !var9.method561(var3, (byte) 118),
              !this.aBoolean1848);
        } else {
          var10 =
            var4.method1890(!var8.method559(1317095745, var2), !var8.method561(var2, (byte) 121),
              !this.aBoolean1848);
        }

        if (GlRenderer.useOpenGlRenderer && this.aBoolean1848) {
          if ((var5 == 1)) {
            ((GlModel) var10).method1902();
          } else {
            if (var5 == 2) {
              ((GlModel) var10).method1911();
            } else {
              if ((var5 == 3)) {
                ((GlModel) var10).method1925();
              }
            }
          }
        } else if (var5 != 1) {
          if (var5 == 2) {
            var10.method1874();
          } else {
            if (var5 == 3) {
              var10.rotateQuarterY();
            }
          }
        } else {
          var10.method1900();
        }

        var10.method1880(var8, var2, var9, var3, -1 + var6, var7,
            this.aBoolean1848);
        if (GlRenderer.useOpenGlRenderer && this.aBoolean1848) {
          if (var5 == 1) {
            ((GlModel) var10).method1925();
          } else {
            if (var5 == 2) {
              ((GlModel) var10).method1911();
            } else if (var5 == 3) {
              ((GlModel) var10).method1902();
            }
          }
        } else if ((var5 != 1)) {
          if ((var5 == 2)) {
            var10.method1874();
          } else {
            if (var5 == 3) {
              var10.method1900();
            }
          }
        } else {
          var10.rotateQuarterY();
        }

        return var10;
      }
  }

  public AbstractModel method2055(AbstractModel var1, byte var2,int var3,
      int var4,
      int var5 ) {
    int var7 = this.anIntArray1851[var5];
      int var6 = this.anIntArray1869[var5];
      AnimationSomething var8 = GlobalStatics_6.method133(var7 >> 16, 0);
      var7 &= '\uffff';
      if (var8 == null) {
        return var1.method1894(true, true, true);
      } else {
        AnimationSomething var9 = null;
        if ((this.tween || GlobalStatics_9.tweening) && (var3 != -1)
          && (var3 < this.anIntArray1851.length)) {
          var3 = this.anIntArray1851[var3];
          var9 = GlobalStatics_6.method133(var3 >> 16, 0);
          var3 &= '\uffff';
        }

        AnimationSomething var10 = null;
        AnimationSomething var11 = null;
        int var13 = 0;
        int var14 = 0;
        if (this.anIntArray1870 != null) {
          if (this.anIntArray1870.length > var5) {
            var13 = this.anIntArray1870[var5];
            if ((var13 != 65535)) {
              var10 = GlobalStatics_6.method133(var13 >> 16, 0);
              var13 &= '\uffff';
            }
          }

          if ((this.tween || GlobalStatics_9.tweening) && var3 != -1
            && this.anIntArray1870.length > var3) {
            var14 = this.anIntArray1870[var3];
            if ((var14 != 65535)) {
              var11 = GlobalStatics_6.method133(var14 >> 16, 0);
              var14 &= '\uffff';
            }
          }
        }

        boolean var15 = !var8.method559(1317095745, var7);
        boolean var16 = !var8.method561(var7, (byte) 119);
        if (var10 != null) {
          var15 &= !var10.method559(1317095745, var13);
          var16 &= !var10.method561(var13, (byte) 115);
        }

        if (var9 != null) {
          var15 &= !var9.method559(1317095745, var3);
          var16 &= !var9.method561(var3, (byte) 123);
        }

        if (var11 != null) {
          var15 &= !var11.method559(1317095745, var14);
          var16 &= !var11.method561(var14, (byte) 121);
        }

        AbstractModel var17 = var1.method1894(var15, var16, !this.aBoolean1848);
        var17.method1880(var8, var7, var9, var3, var4 - 1, var6,
            this.aBoolean1848);
        if (var10 != null) {
          var17.method1880(var10, var13, var11, var14, var4 - 1, var6,
              this.aBoolean1848);
        }

        return var17;
      }
  }

  public AbstractModel method2056(int var1,int var2, int var3,int var4,
      AbstractModel var5,
      int var6 ) {
    int var7 = this.anIntArray1869[var2];
      var2 = this.anIntArray1851[var2];
      AnimationSomething var8 = GlobalStatics_6.method133(var2 >> 16, var6 - 3);
      var2 &= '\uffff';
      if (var8 == null) {
        return var5.method1894(true, true, true);
      } else {
        var4 &= var6;
        AnimationSomething var9 = null;
        if ((this.tween || GlobalStatics_9.tweening) && (var1 != -1)
          && (var1 < this.anIntArray1851.length)) {
          var1 = this.anIntArray1851[var1];
          var9 = GlobalStatics_6.method133(var1 >> 16, var6 - 3);
          var1 &= '\uffff';
        }

        AbstractModel var10;
        if (var9 == null) {
          var10 =
            var5.method1894(!var8.method559(1317095745, var2), !var8.method561(var2, (byte) 123),
              !this.aBoolean1848);
        } else {
          var10 =
            var5.method1894(!var8.method559(1317095745, var2) & !var9.method559(1317095745, var1),
              !var8.method561(var2, (byte) 125) & !var9.method561(var1, (byte) 123),
              !this.aBoolean1848);
        }

        if (this.aBoolean1848 && GlRenderer.useOpenGlRenderer) {
          if (var4 == 1) {
            ((GlModel) var10).method1902();
          } else {
            if ((var4 == 2)) {
              ((GlModel) var10).method1911();
            } else if ((var4 == 3)) {
              ((GlModel) var10).method1925();
            }
          }
        } else if (var4 == 1) {
          var10.method1900();
        } else if (var4 == 2) {
          var10.method1874();
        } else if (var4 == 3) {
          var10.rotateQuarterY();
        }

        var10.method1880(var8, var2, var9, var1, var3 - 1, var7,
            this.aBoolean1848);
        if (this.aBoolean1848 && GlRenderer.useOpenGlRenderer) {
          if ((var4 == 1)) {
            ((GlModel) var10).method1925();
          } else if ((var4 == 2)) {
            ((GlModel) var10).method1911();
          } else if ((var4 == 3)) {
            ((GlModel) var10).method1902();
          }
        } else if (var4 != 1) {
          if (var4 == 2) {
            var10.method1874();
          } else if (var4 == 3) {
            var10.method1900();
          }
        } else {
          var10.rotateQuarterY();
        }

        return var10;
      }
  }

  public void method2058(byte var1 ) {
    if (var1 == -41) {
        if ((this.anInt1866 == -1)) {
          if (this.aBooleanArray1855 == null) {
            this.anInt1866 = 0;
          } else {
            this.anInt1866 = 2;
          }
        }

        if (this.anInt1850 == -1) {
          if (this.aBooleanArray1855 != null) {
            this.anInt1850 = 2;
          } else {
            this.anInt1850 = 0;
          }
        }

      }
  }

  public AbstractModel method2059(int var1, int var2,int var3, byte var4,
      AbstractModel var5 ) {
    int var6 = this.anIntArray1869[var3];
      var3 = this.anIntArray1851[var3];
      AnimationSomething var7 = GlobalStatics_6.method133(var3 >> 16, 0);
      var3 &= '\uffff';
      if (var7 == null) {
        return var5.method1882(true, true, true);
      } else {
        AnimationSomething var9 = null;
        if ((this.tween || GlobalStatics_9.tweening) && (var1 != -1)
          && this.anIntArray1851.length > var1) {
          var1 = this.anIntArray1851[var1];
          var9 = GlobalStatics_6.method133(var1 >> 16, 0);
          var1 &= '\uffff';
        }

        AbstractModel var10;
        if (var9 == null) {
          var10 =
            var5.method1882(!var7.method559(1317095745, var3), !var7.method561(var3, (byte) 118),
              !this.aBoolean1848);
        } else {
          var10 =
            var5.method1882(!var7.method559(1317095745, var3) & !var9.method559(1317095745, var1),
              !var7.method561(var3, (byte) 119) & !var9.method561(var1, (byte) 118),
              !this.aBoolean1848);
        }

        var10.method1880(var7, var3, var9, var1, var2 - 1, var6,
            this.aBoolean1848);
        return var10;
      }
  }

  private void method2060(int var1, byte var2, Buffer var3) {
    int var4;
      int var5;
      if ((var1 == 1)) {
        var4 = var3.readUnsignedShort();
        this.anIntArray1869 = new int[var4];

        for (var5 = 0; var4 > var5; ++var5) {
          this.anIntArray1869[var5] = var3.readUnsignedShort();
        }

        this.anIntArray1851 = new int[var4];

        for (var5 = 0; (var5 < var4); ++var5) {
          this.anIntArray1851[var5] = var3.readUnsignedShort();
        }

        for (var5 = 0; var4 > var5; ++var5) {
          this.anIntArray1851[var5] += var3.readUnsignedShort() << 16;
        }
      } else if (var1 == 2) {
        this.anInt1865 = var3.readUnsignedShort();
      } else if ((var1 != 3)) {
        if (var1 == 4) {
          this.aBoolean1859 = true;
        } else if ((var1 != 5)) {
          if (var1 == 6) {
            this.anInt1854 = var3.readUnsignedShort();
          } else {
            if ((var1 == 7)) {
              this.anInt1849 = var3.readUnsignedShort();
            } else if (var1 == 8) {
              this.anInt1861 = var3.readUnsignedByte();
            } else if (var1 == 9) {
              this.anInt1866 = var3.readUnsignedByte();
            } else if (var1 != 10) {
              if ((var1 == 11)) {
                this.anInt1845 = var3.readUnsignedByte();
              } else {
                if (var1 == 12) {
                  var4 = var3.readUnsignedByte();
                  this.anIntArray1870 = new int[var4];

                  for (var5 = 0; var4 > var5; ++var5) {
                    this.anIntArray1870[var5] = var3.readUnsignedShort();
                  }

                  for (var5 = 0; var4 > var5; ++var5) {
                    this.anIntArray1870[var5] += var3.readUnsignedShort() << 16;
                  }
                } else {
                  if (var1 == 13) {
                    var4 = var3.readUnsignedShort();
                    this.anIntArrayArray1867 = new int[var4][];

                    for (var5 = 0; var4 > var5; ++var5) {
                      int var6 = var3.readUnsignedByte();
                      if (var6 > 0) {
                        this.anIntArrayArray1867[var5] = new int[var6];
                        this.anIntArrayArray1867[var5][0] = var3
                            .readUnsignedMedium((byte) 102);

                        for (int var7 = 1; var6 > var7; ++var7) {
                          this.anIntArrayArray1867[var5][var7] = var3
                              .readUnsignedShort();
                        }
                      }
                    }
                  } else if ((var1 != 14)) {
                    if (var1 == 15) {
                      this.tween = true;
                    } else {
                      if (var1 == 16) {
                        this.aBoolean1872 = true;
                      }
                    }
                  } else {
                    this.aBoolean1848 = true;
                  }
                }
              }
            } else {
              this.anInt1850 = var3.readUnsignedByte();
            }
          }
        } else {
          this.anInt1857 = var3.readUnsignedByte();
        }
      } else {
        this.aBooleanArray1855 = new boolean[256];
        var4 = var3.readUnsignedByte();

        for (var5 = 0; var5 < var4; ++var5) {
          this.aBooleanArray1855[var3.readUnsignedByte()] = true;
        }
      }

      var4 = 49 % ((-12 - var2) / 34);
  }

}
