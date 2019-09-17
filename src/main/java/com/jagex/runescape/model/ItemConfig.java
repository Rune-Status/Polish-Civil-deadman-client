package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.HashTable;
import com.jagex.runescape.common.StringNode;
import com.jagex.runescape.node.Node;
import com.jagex.runescape.opengl.GLStatics;
import com.jagex.runescape.opengl.GlModel;
import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.statics.DummyClass15;
import com.jagex.runescape.statics.DummyClass35;
import com.jagex.runescape.statics.DummyClass59;
import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_11;
import com.jagex.runescape.statics.GlobalStatics_8;
import com.jagex.runescape.statics.GlobalStatics_9;

public final class ItemConfig {

  public int translateOther;
  public int anInt756 = -1;
  public int anInt757 = 1;
  public int anInt758;
  public int anInt761;
  public int anInt762;
  public int anInt764;
  public int[] anIntArray766;
  public int anInt767;
  public int rotationZ;
  public GameString aClass94_770;
  public boolean aBoolean779;
  public int anInt782;
  public GameString[] inventoryOptions;
  public int rotationX;
  public int anInt787;
  public int anInt788;
  public int anInt789;
  public int anInt791;
  public int translateX;
  public int anInt793;
  public int anInt795;
  public HashTable aClass130_798;
  public int rotationY;
  public int anInt800;
  public GameString[] aClass94Array801;
  public int[] anIntArray804;
  public boolean aBoolean807;
  public int anInt810;
  private short[] aShortArray751;
  private int anInt752;
  private int anInt753 = -1;
  private int anInt755;
  private int anInt760;
  private short[] aShortArray765;
  private int anInt769;
  private int anInt771;
  private short[] aShortArray772;
  private int anInt773 = -1;
  private short[] aShortArray774;
  private int anInt775;
  private int anInt776 = -1;
  private int anInt777;
  private int anInt778;
  private int anInt780;
  private int anInt784;
  private byte[] aByteArray785;
  private int anInt790;
  private int anInt794;
  private int anInt796;
  private int anInt797;
  private int anInt802;
  private int anInt803;
  private int anInt805;

  public ItemConfig() {
    this.aClass94_770 = DummyClass59.aClass94_672;
    this.anInt775 = 0;
    this.anInt784 = 0;
    this.anInt769 = -1;
    this.anInt796 = -1;
    this.anInt791 = -1;
    this.anInt777 = 0;
    this.anInt780 = 128;
    this.anInt767 = -1;
    this.anInt758 = -1;
    this.rotationZ = 0;
    this.anInt762 = -1;
    this.anInt795 = -1;
    this.anInt761 = -1;
    this.anInt771 = -1;
    this.translateOther = 0;
    this.rotationX = 0;
    this.rotationY = 0;
    this.anInt800 = 0;
    this.anInt764 = 0;
    this.anInt789 = -1;
    this.anInt794 = -1;
    this.anInt788 = -1;
    this.anInt797 = 128;
    this.aBoolean779 = false;
    this.anInt752 = 0;
    this.translateX = 0;
    this.anInt803 = -1;
    this.anInt802 = 0;
    this.anInt793 = -1;
    this.aClass94Array801 =
      new GameString[] {null, null, GlobalStatics_10.aClass94_3397, null, null};
    this.anInt805 = 128;
    this.anInt790 = 0;
    this.anInt778 = 0;
    this.inventoryOptions = new GameString[] {null, null, null, null, GlobalStatics_8.OPTION_DROP};
    this.anInt810 = 2000;
    this.aBoolean807 = false;
  }

  public boolean method1102(boolean var1, boolean var2 ) {
    int var3 = this.anInt803;
      int var4 = this.anInt796;
      if (var1) {
        var3 = this.anInt773;
        var4 = this.anInt753;
      }

      if (var2) {
        this.method1113(41, null);
      }

      if (var3 == -1) {
        return true;
      } else {
        boolean var5 = true;
        if (!com.jagex.runescape.statics.GlobalStatics_0.aClass153_2581.method2129((byte) -75, 0, var3)) {
          var5 = false;
        }

        if (var4 != -1 && !com.jagex.runescape.statics.GlobalStatics_0.aClass153_2581.method2129((byte) 58, 0, var4)) {
          var5 = false;
        }

        return var5;
      }
  }

  public GameString method1105(int var1, GameString var2, int var3) {
    if (this.aClass130_798 == null) {
        return var2;
      } else {
        if (var1 < 90) {
          GlobalStatics_11.method1111(-111);
        }

        StringNode var4 = (StringNode) this.aClass130_798.get(var3);
        return var4 != null ? var4.aClass94_2586 : var2;
      }
  }

  public ItemConfig method1106(int var1, int var2 ) {
    int var3 = 58 % ((-28 - var2) / 48);
      if (this.anIntArray804 != null && var1 > 1) {
        int var4 = -1;

        for (int var5 = 0; var5 < 10; ++var5) {
          if (this.anIntArray766[var5] <= var1 && this.anIntArray766[var5] != 0) {
            var4 = this.anIntArray804[var5];
          }
        }

        if (var4 != -1) {
          return DummyClass35.getItemConfig(var4, (byte) 97);
        }
      }

      return this;
  }

  public boolean method1108(byte var1, boolean var2 ) {
    int var4 = this.anInt771;
      int var3 = this.anInt793;
      int var6 = 106 % ((var1 - 24) / 58);
      int var5 = this.anInt769;
      if (var2) {
        var5 = this.anInt776;
        var3 = this.anInt761;
        var4 = this.anInt794;
      }

      if (var3 == -1) {
        return true;
      } else {
        boolean var7 = true;
        if (!com.jagex.runescape.statics.GlobalStatics_0.aClass153_2581.method2129((byte) -90, 0, var3)) {
          var7 = false;
        }

        if (var4 != -1 && !com.jagex.runescape.statics.GlobalStatics_0.aClass153_2581
            .method2129((byte) -114, 0, var4)) {
          var7 = false;
        }

        if (var5 != -1 && !com.jagex.runescape.statics.GlobalStatics_0.aClass153_2581
            .method2129((byte) 83, 0, var5)) {
          var7 = false;
        }

        return var7;
      }
  }

  public void method1109(byte var1, ItemConfig var2, ItemConfig var3 ) {
    this.aByteArray785 = var2.aByteArray785;
      this.anInt778 = var2.anInt778;
      this.aClass130_798 = var2.aClass130_798;
      this.anInt769 = var2.anInt769;
      this.anInt761 = var2.anInt761;
      this.anInt775 = var2.anInt775;
      this.inventoryOptions = new GameString[5];
      this.anInt755 = var3.anInt755;
      this.anInt810 = var3.anInt810;
      this.anInt757 = 0;
      this.anInt782 = var2.anInt782;
      this.anInt773 = var2.anInt773;
      this.aShortArray774 = var2.aShortArray774;
      this.rotationZ = var3.rotationZ;
      this.anInt771 = var2.anInt771;
      this.rotationY = var3.rotationY;
      this.anInt803 = var2.anInt803;
      this.anInt796 = var2.anInt796;
      this.anInt760 = var2.anInt760;
      this.rotationX = var3.rotationX;
      this.translateOther = var3.translateOther;
      this.anInt753 = var2.anInt753;
      this.anInt777 = var2.anInt777;
      this.aShortArray772 = var2.aShortArray772;
      this.anInt802 = var2.anInt802;
      this.anInt752 = var2.anInt752;
      this.translateX = var3.translateX;
      if (var1 != 69) {
        this.anInt757 = 109;
      }

      this.anInt793 = var2.anInt793;
      this.anInt794 = var2.anInt794;
      this.aClass94_770 = var2.aClass94_770;
      this.aShortArray751 = var2.aShortArray751;
      this.aShortArray765 = var2.aShortArray765;
      this.aClass94Array801 = var2.aClass94Array801;
      this.aBoolean779 = var2.aBoolean779;
      this.anInt776 = var2.anInt776;
      if (var2.inventoryOptions != null) {
        for (int var4 = 0; var4 < 4; ++var4) {
          this.inventoryOptions[var4] = var2.inventoryOptions[var4];
        }
      }

      this.inventoryOptions[4] = GlobalStatics_9.aClass94_361;
  }

  public AbstractModel getModel(int var1, int var2, int var3,
                                AnimationSequence var4,
                                int var5,
                                int var6 ) {
    if (var1 < 94) {
        this.anInt755 = -67;
      }

      if (this.anIntArray804 != null && var5 > 1) {
        int var7 = -1;

        for (int var8 = 0; var8 < 10; ++var8) {
          if (var5 >= this.anIntArray766[var8] && this.anIntArray766[var8] != 0) {
            var7 = this.anIntArray804[var8];
          }
        }

        if (var7 != -1) {
          return DummyClass35.getItemConfig(var7, (byte) 109)
            .getModel(113, var2, var3, var4, 1, var6);
        }
      }

      AbstractModel var11 = (AbstractModel) DummyClass15.aClass93_1874.get(
          this.anInt787);
      if (var11 == null) {
        Model var12 = GlobalStatics_10.getModel(
            com.jagex.runescape.statics.GlobalStatics_0.aClass153_2581,
            this.anInt755, 0);
        if (var12 == null) {
          return null;
        }

        int var9;
        if (this.aShortArray774 != null) {
          for (var9 = 0; this.aShortArray774.length > var9; ++var9) {
            if (this.aByteArray785 != null && var9 < this.aByteArray785.length) {
              var12.replaceColor(this.aShortArray774[var9],
                GlobalStatics_10.aShortArray3453[this.aByteArray785[var9] & 255]);
            } else {
              var12.replaceColor(this.aShortArray774[var9], this.aShortArray772[var9]);
            }
          }
        }

        if (this.aShortArray765 != null) {
          for (var9 = 0; var9 < this.aShortArray765.length; ++var9) {
            var12.replaceMaterial(
                this.aShortArray765[var9], this.aShortArray751[var9]);
          }
        }

        var11 = var12.method2008(this.anInt784 + 64, 768 + this.anInt790, -50, -10, -50);
        if (this.anInt805 != 128
            || this.anInt780 != 128 || this.anInt797 != 128) {
          var11.scale(this.anInt805, this.anInt780, this.anInt797);
        }

        var11.aBoolean2699 = true;
        if (GlRenderer.useOpenGlRenderer) {
          ((GlModel) var11).method1920(false, false, false, true, false, false, true);
        }

        DummyClass15.aClass93_1874.get((byte) -123, var11, this.anInt787);
      }

      if (var4 != null) {
        var11 = var4.method2055(var11, (byte) -88, var2, var3, var6);
      }

      return var11;
  }

  public void method1112(int var1 ) {
    if (var1 != 5401) {
        GlobalStatics_11.method1103(null, null, true);
      }
  }

  public void method1113(int var1, Buffer var2 ) {
    while (true) {
        int var3 = var2.readUnsignedByte();
        if (var3 == 0) {
          if (var1 != 1) {
            this.anInt789 = -40;
          }

          return;
        }

        this.method1114((byte) -72, var2, var3);
      }
  }

  private void method1114(byte var1, Buffer var2, int var3) {
    int var4 = -118 % ((var1 - 48) / 61);
      if (var3 == 1) {
        this.anInt755 = var2.readUnsignedShort();
      } else {
        if (var3 == 2) {
          this.aClass94_770 = var2.readString();
        } else {
          if (var3 == 4) {
            this.anInt810 = var2.readUnsignedShort();
          } else if (var3 == 5) {
            this.rotationX = var2.readUnsignedShort();
          } else if (var3 == 6) {
            this.rotationY = var2.readUnsignedShort();
          } else if (var3 == 7) {
            this.translateX = var2.readUnsignedShort();
            if (this.translateX > 32767) {
              this.translateX -= 65536;
            }
          } else if (var3 != 8) {
            if (var3 == 11) {
              this.anInt764 = 1;
            } else if (var3 == 12) {
              this.anInt757 = var2.readInt();
            } else if (var3 != 16) {
              if (var3 == 23) {
                this.anInt793 = var2.readUnsignedShort();
              } else if (var3 != 24) {
                if (var3 == 25) {
                  this.anInt761 = var2.readUnsignedShort();
                } else {
                  if (var3 == 26) {
                    this.anInt794 = var2.readUnsignedShort();
                  } else {
                    if (var3 >= 30 && var3 < 35) {
                      this.aClass94Array801[-30 + var3] = var2.readString();
                      if (this.aClass94Array801[var3 - 30].method1531(
                          GlobalStatics_10.aClass94_3051)) {
                        this.aClass94Array801[-30 + var3] = null;
                      }
                    } else if (var3 >= 35 && var3 < 40) {
                      this.inventoryOptions[-35 + var3] = var2.readString();
                    } else {
                      int var5;
                      int var6;
                      if (var3 == 40) {
                        var5 = var2.readUnsignedByte();
                        this.aShortArray772 = new short[var5];
                        this.aShortArray774 = new short[var5];

                        for (var6 = 0; var5 > var6; ++var6) {
                          this.aShortArray774[var6] = (short) var2
                              .readUnsignedShort();
                          this.aShortArray772[var6] = (short) var2
                              .readUnsignedShort();
                        }
                      } else {
                        if (var3 == 41) {
                          var5 = var2.readUnsignedByte();
                          this.aShortArray751 = new short[var5];
                          this.aShortArray765 = new short[var5];

                          for (var6 = 0; var5 > var6; ++var6) {
                            this.aShortArray765[var6] = (short) var2
                                .readUnsignedShort();
                            this.aShortArray751[var6] = (short) var2
                                .readUnsignedShort();
                          }
                        } else if (var3 == 42) {
                          var5 = var2.readUnsignedByte();
                          this.aByteArray785 = new byte[var5];

                          for (var6 = 0; var6 < var5; ++var6) {
                            this.aByteArray785[var6] = var2.readByte();
                          }
                        } else if (var3 == 65) {
                          this.aBoolean807 = true;
                        } else if (var3 != 78) {
                          if (var3 == 79) {
                            this.anInt776 = var2.readUnsignedShort();
                          } else if (var3 == 90) {
                            this.anInt803 = var2.readUnsignedShort();
                          } else if (var3 == 91) {
                            this.anInt773 = var2.readUnsignedShort();
                          } else if (var3 != 92) {
                            if (var3 == 93) {
                              this.anInt753 = var2.readUnsignedShort();
                            } else {
                              if (var3 == 95) {
                                this.rotationZ = var2.readUnsignedShort();
                              } else if (var3 == 96) {
                                this.anInt800 = var2.readUnsignedByte();
                              } else if (var3 == 97) {
                                this.anInt789 = var2.readUnsignedShort();
                              } else if (var3 == 98) {
                                this.anInt791 = var2.readUnsignedShort();
                              } else if (var3 >= 100 && var3 < 110) {
                                if (this.anIntArray804 == null) {
                                  this.anIntArray804 = new int[10];
                                  this.anIntArray766 = new int[10];
                                }

                                this.anIntArray804[-100 + var3] = var2
                                    .readUnsignedShort();
                                this.anIntArray766[var3 - 100] = var2
                                    .readUnsignedShort();
                              } else if (var3 != 110) {
                                if (var3 == 111) {
                                  this.anInt780 = var2.readUnsignedShort();
                                } else {
                                  if (var3 == 112) {
                                    this.anInt797 = var2.readUnsignedShort();
                                  } else if (var3 != 113) {
                                    if (var3 == 114) {
                                      this.anInt790 = 5 * var2.readByte();
                                    } else if (var3 == 115) {
                                      this.anInt782 = var2.readUnsignedByte();
                                    } else if (var3 != 121) {
                                      if (var3 == 122) {
                                        this.anInt762 = var2
                                            .readUnsignedShort();
                                      } else if (var3 != 125) {
                                        if (var3 == 126) {
                                          this.anInt777 = var2.readByte();
                                          this.anInt802 = var2.readByte();
                                          this.anInt752 = var2.readByte();
                                        } else if (var3 == 127) {
                                          this.anInt767 = var2
                                              .readUnsignedByte();
                                          this.anInt758 = var2
                                              .readUnsignedShort();
                                        } else if (var3 != 128) {
                                          if (var3 == 129) {
                                            var2.readUnsignedByte();
                                            var2.readUnsignedShort();
                                          } else {
                                            if (var3 == 130) {
                                              var2.readUnsignedByte();
                                              var2.readUnsignedShort();
                                            } else if (var3 == 249) {
                                              var5 = var2.readUnsignedByte();
                                              if (this.aClass130_798 == null) {
                                                var6 = GLStatics.nearestPo2(
                                                    (byte) 97, var5);
                                                this.aClass130_798 = new HashTable(
                                                    var6);
                                              }

                                              for (var6 = 0; var6 < var5;
                                                  ++var6) {
                                                boolean var7 = var2
                                                    .readUnsignedByte() == 1;
                                                int var8 = var2
                                                    .readUnsignedMedium(
                                                        (byte) 122);
                                                Node var9;
                                                if (var7) {
                                                  var9 = new StringNode(
                                                      var2.readString());
                                                } else {
                                                  var9 = new IntegerNode(
                                                      var2.readInt());
                                                }

                                                this.aClass130_798.put(var8,
                                                    var9);
                                              }
                                            }
                                          }
                                        } else {
                                          this.anInt788 = var2
                                              .readUnsignedByte();
                                          this.anInt756 = var2
                                              .readUnsignedShort();
                                        }
                                      } else {
                                        this.anInt760 = var2.readByte();
                                        this.anInt778 = var2.readByte();
                                        this.anInt775 = var2.readByte();
                                      }
                                    } else {
                                      this.anInt795 = var2.readUnsignedShort();
                                    }
                                  } else {
                                    this.anInt784 = var2.readByte();
                                  }
                                }
                              } else {
                                this.anInt805 = var2.readUnsignedShort();
                              }
                            }
                          } else {
                            this.anInt796 = var2.readUnsignedShort();
                          }
                        } else {
                          this.anInt769 = var2.readUnsignedShort();
                        }
                      }
                    }
                  }
                }
              } else {
                this.anInt771 = var2.readUnsignedShort();
              }
            } else {
              this.aBoolean779 = true;
            }
          } else {
            this.translateOther = var2.readUnsignedShort();
            if (this.translateOther > 32767) {
              this.translateOther -= 65536;
            }
          }
        }
      }
  }

  public int method1115(int var1, int var2, int var3 ) {
    int var4 = -82 % ((-63 - var2) / 55);
      if (this.aClass130_798 != null) {
        IntegerNode var5 = (IntegerNode) this.aClass130_798.get(var3);
        return var5 != null ? var5.anInt2467 : var1;
      } else {
        return var1;
      }
  }

  public Model method1116(boolean var1, byte var2 ) {
    int var4 = this.anInt796;
      if (var2 == -109) {
        int var3 = this.anInt803;
        if (var1) {
          var4 = this.anInt753;
          var3 = this.anInt773;
        }

        if (var3 == -1) {
          return null;
        } else {
          Model var5 = GlobalStatics_10
              .getModel(com.jagex.runescape.statics.GlobalStatics_0.aClass153_2581, var3, 0);
          if (var4 != -1) {
            Model var6 = GlobalStatics_10
                .getModel(com.jagex.runescape.statics.GlobalStatics_0.aClass153_2581, var4, 0);
            Model[] var7 = {var5, var6};
            var5 = new Model(var7, 2);
          }

          int var9;
          if (this.aShortArray774 != null) {
            for (var9 = 0; var9 < this.aShortArray774.length; ++var9) {
              assert var5 != null;
              var5.replaceColor(this.aShortArray774[var9],
                  this.aShortArray772[var9]);
            }
          }

          if (this.aShortArray765 != null) {
            for (var9 = 0; this.aShortArray765.length > var9; ++var9) {
              assert var5 != null;
              var5.replaceMaterial(
                  this.aShortArray765[var9], this.aShortArray751[var9]);
            }
          }

          return var5;
        }
      } else {
        return null;
      }
  }

  public Model method1117(boolean var1, int var2 ) {
    int var3 = this.anInt793;
      if (var2 < 77) {
        this.aClass130_798 = null;
      }

      int var4 = this.anInt771;
      int var5 = this.anInt769;
      if (var1) {
        var5 = this.anInt776;
        var3 = this.anInt761;
        var4 = this.anInt794;
      }

      if (var3 == -1) {
        return null;
      } else {
        Model var6 = GlobalStatics_10
            .getModel(com.jagex.runescape.statics.GlobalStatics_0.aClass153_2581, var3, 0);
        if (var4 != -1) {
          Model var7 = GlobalStatics_10
              .getModel(com.jagex.runescape.statics.GlobalStatics_0.aClass153_2581, var4, 0);
          if (var5 == -1) {
            Model[] var8 = {var6, var7};
            var6 = new Model(var8, 2);
          } else {
            Model var12 = GlobalStatics_10
                .getModel(com.jagex.runescape.statics.GlobalStatics_0.aClass153_2581, var5, 0);
            Model[] var9 = {var6, var7, var12};
            var6 = new Model(var9, 3);
          }
        }

        if (!var1 && (this.anInt760 != 0 || this.anInt778 != 0
            || this.anInt775 != 0)) {
          assert var6 != null;
          var6.translate(this.anInt760, this.anInt778, this.anInt775);
        }

        if (var1 && (this.anInt777 != 0 || this.anInt802 != 0
            || this.anInt752 != 0)) {
          assert var6 != null;
          var6.translate(this.anInt777, this.anInt802, this.anInt752);
        }

        int var11;
        if (this.aShortArray774 != null) {
          for (var11 = 0; var11 < this.aShortArray774.length; ++var11) {
            assert var6 != null;
            var6.replaceColor(this.aShortArray774[var11], this.aShortArray772[var11]);
          }
        }

        if (this.aShortArray765 != null) {
          for (var11 = 0; var11 < this.aShortArray765.length; ++var11) {
            assert var6 != null;
            var6.replaceMaterial(
                this.aShortArray765[var11], this.aShortArray751[var11]);
          }
        }

        return var6;
      }
  }

  public void method1118(ItemConfig var1, ItemConfig var2, boolean var3 ) {
    this.aClass94_770 = var1.aClass94_770;
      this.anInt810 = var2.anInt810;
      if (var3) {
        this.anInt780 = -70;
      }

      this.aShortArray774 = var2.aShortArray774;
      this.aShortArray772 = var2.aShortArray772;
      this.rotationX = var2.rotationX;
      this.rotationY = var2.rotationY;
      this.aShortArray751 = var2.aShortArray751;
      this.anInt755 = var2.anInt755;
      this.aByteArray785 = var2.aByteArray785;
      this.rotationZ = var2.rotationZ;
      this.anInt757 = var1.anInt757;
      this.anInt764 = 1;
      this.translateOther = var2.translateOther;
      this.translateX = var2.translateX;
      this.aShortArray765 = var2.aShortArray765;
      this.aBoolean779 = var1.aBoolean779;
  }

  public SoftwareModel method1120(int var1 ) {
    Model var2 = GlobalStatics_10.getModel(
        com.jagex.runescape.statics.GlobalStatics_0.aClass153_2581,
          this.anInt755, 0);
      if (var2 == null) {
        return null;
      } else {
        int var3;
        if (this.aShortArray774 != null) {
          for (var3 = 0; this.aShortArray774.length > var3; ++var3) {
            if (this.aByteArray785 != null && var3 < this.aByteArray785.length) {
              var2.replaceColor(this.aShortArray774[var3],
                GlobalStatics_10.aShortArray3453[this.aByteArray785[var3] & 255]);
            } else {
              var2.replaceColor(this.aShortArray774[var3], this.aShortArray772[var3]);
            }
          }
        }

        if (this.aShortArray765 != null) {
          for (var3 = 0; var3 < this.aShortArray765.length; ++var3) {
            var2.replaceMaterial(this.aShortArray765[var3], this.aShortArray751[var3]);
          }
        }

        SoftwareModel var5 =
          var2.method2000(64 + this.anInt784, 768 + this.anInt790, -50, -10, -50);
        if (var1 != 18206) {
          this.method1105(-67, null, -37);
        }

        if (this.anInt805 != 128 || this.anInt780 != 128
            || this.anInt797 != 128) {
          var5.scale(this.anInt805, this.anInt780, this.anInt797);
        }

        return var5;
      }
  }

}
