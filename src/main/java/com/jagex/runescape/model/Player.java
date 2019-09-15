package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.huffman.HuffmanEncoderStatics;
import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.statics.DummyClass0;
import com.jagex.runescape.statics.DummyClass11;
import com.jagex.runescape.statics.DummyClass35;
import com.jagex.runescape.statics.DummyClass42;
import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_11;
import com.jagex.runescape.statics.GlobalStatics_2;
import com.jagex.runescape.statics.GlobalStatics_4;
import com.jagex.runescape.statics.GlobalStatics_5;
import com.jagex.runescape.statics.GlobalStatics_6;
import com.jagex.runescape.statics.GlobalStatics_8;
import com.jagex.runescape.statics.GlobalStatics_9;
import java.util.Objects;

public final class Player extends Mobile {

  public int anInt3952 = -1;
  public int anInt3955 = -1;
  public int anInt3956;
  public int combatLevel;
  public PlayerAppearance appearance;
  public int anInt3963 = -1;
  public int anInt3965;
  public int anInt3966 = -1;
  public GameString name;
  public boolean aBoolean3968;
  public int anInt3969;
  public int anInt3970 = -1;
  public int anInt3972 = -1;
  public int anInt3973 = -1;
  public int skillTotal;
  private int titleId;

  public void parseConfig(Buffer buffer ) {
    buffer.position = 0;
      int var3 = buffer.readUnsignedByte();
      int var8 = -1;
      int var4 = 1 & var3;
      boolean var6 = ((var3 & 4) != 0);
      int var7 = super.getSize();
      int[] var9 = new int[12];
      this.method1976(1 + (var3 >> 3 & 7), 2);
      this.titleId = 3 & var3 >> 6;
      this.anInt2819 += (-var7 + this.getSize()) * 64;
      this.anInt2829 += 64 * (this.getSize() - var7);
      this.anInt3972 = buffer.readByte();
      this.anInt3955 = buffer.readByte();
      this.anInt3956 = 0;

      int var11;
      int var12;
      int var13;
      int var14;
      for (int var10 = 0; (var10 < 12); ++var10) {
        var11 = buffer.readUnsignedByte();
        if ((var11 == 0)) {
          var9[var10] = 0;
        } else {
          var12 = buffer.readUnsignedByte();
          var13 = (var11 << 8) + var12;
          if ((var10 == 0) && (var13 == 65535)) {
            var8 = buffer.readUnsignedShort();
            this.anInt3956 = buffer.readUnsignedByte();
            break;
          }

          if (var13 >= '\u8000') {
            var13 = GlobalStatics_9.anIntArray2664[var13 - '\u8000'];
            var9[var10] = HuffmanEncoderStatics.method308(1073741824, var13);
            var14 = DummyClass35.getItemConfig(var13, (byte) 119).anInt782;
            if (var14 != 0) {
              this.anInt3956 = var14;
            }
          } else {
            var9[var10] = HuffmanEncoderStatics
                .method308(-256 + var13, Integer.MIN_VALUE);
          }
        }
      }

      int[] var19 = new int[5];

      for (var11 = 0; var11 < 5; ++var11) {
        var12 = buffer.readUnsignedByte();
        if ((var12 < 0) || var12 >= GlobalStatics_2.aShortArrayArray344[var11].length) {
          var12 = 0;
        }

        var19[var11] = var12;
      }

      this.renderAnimationId = buffer.readUnsignedShort();
      long var20 = buffer.readLong();
      this.name = Objects
          .requireNonNull(GameStringStatics.stringFromBase37(-29664, var20)).formatName((byte) -50);
      this.combatLevel = buffer.readUnsignedByte();
      if (var6) {
        this.skillTotal = buffer.readUnsignedShort();
        this.anInt3965 = this.combatLevel;
        this.anInt3970 = -1;
      } else {
        this.skillTotal = 0;
        this.anInt3965 = buffer.readUnsignedByte();
        this.anInt3970 = buffer.readUnsignedByte();
        if ((this.anInt3970 == 255)) {
          this.anInt3970 = -1;
        }
      }

      var13 = this.anInt3969;
      this.anInt3969 = buffer.readUnsignedByte();
      if ((this.anInt3969 == 0)) {
        DummyClass11.method2203(this, 8);
      } else {
        int var15 = this.anInt3966;
        int var16 = this.anInt3963;
        int var17 = this.anInt3973;
        var14 = this.anInt3952;
        this.anInt3952 = buffer.readUnsignedShort();
        this.anInt3966 = buffer.readUnsignedShort();
        this.anInt3963 = buffer.readUnsignedShort();
        this.anInt3973 = buffer.readUnsignedShort();
        if (this.anInt3969 != var13 || (this.anInt3952 != var14) || (this.anInt3966 != var15)
          || var16 != this.anInt3963 || (this.anInt3973 != var17)) {
          GlobalStatics_2.method518(this, -110);
        }
      }

      if (this.appearance == null) {
        this.appearance = new PlayerAppearance();
      }

      var14 = this.appearance.npcId;
      this.appearance.update(var19, var8, (var4 == 1), 0, var9,
          this.renderAnimationId);
      if ((var14 != var8)) {
        this.anInt2819 = 128 * this.waypointsX[0] + this.getSize() * 64;
        this.anInt2829 = 128 * this.waypointsY[0] + (64 * this.getSize());
      }

      if (this.aClass127_Sub1_2801 != null) {
        this.aClass127_Sub1_2801.method1759();
      }
  }

  private void draw(DummyClass0 var1, int var2, AbstractModel var3, int var4, int var5,
                    int var6, int var7, int var8, int var9, int var10, int var11, int var12,
                    int var13, int var14, int var15) {
    int var16 = var4 * var4 + (var2 * var2);
      if ((var16 >= 16) && (var16 <= 360000)) {
        int var17 = (int) (325.949D * Math.atan2(var4, var2)) & var7;
        AbstractModel var18 =
          GlobalStatics_10.method1763(true, var17, this.anInt2829, var13,
              this.anInt2819, var3,
              this.anInt2831);
        if (var18 != null) {
          if (GlRenderer.useOpenGlRenderer) {
            float var19 = GlRenderer.method1852();
            float var20 = GlRenderer.method1839();
            GlRenderer.method1851();
            GlRenderer.method1825(var19, var20 - 150.0F);
            var18.draw(0, var12, var14, var11, var10, var5, var15, var9, -1L, var6, var1);
            GlRenderer.method1830();
            GlRenderer.method1825(var19, var20);
          } else {
            var18.draw(0, var12, var14, var11, var10, var5, var15, var9, -1L, var6, var1);
          }
        }

      }
  }

  public boolean hasConfiguration(byte var1 ) {
    if (var1 != 17) {
        GlobalStatics_9.quady0 = null;
      }

      return this.appearance != null;
  }

  public int getRenderAnimationId() {
    return this.renderAnimationId;
  }

  public int getSize() {
    if (this.appearance != null && this.appearance.npcId != -1) {
        return GlobalStatics_2.getNpcConfiguration(this.appearance.npcId).size;
      } else {
        return super.getSize();
      }
  }

  public GameString getFullName() {
    GameString name = this.name;

      if (GlobalStatics_8.titlePrefixes != null) {
        name =
          GlobalStatics_9.concat(new GameString[] {GlobalStatics_8.titlePrefixes[this.titleId], name});
      }

      if (GlobalStatics_11.titleSuffixes != null) {
        name = GlobalStatics_9.concat(
          new GameString[] {name, GlobalStatics_11.titleSuffixes[this.titleId]});
      }

      return name;
  }

  public void method1867(int var1, int var2, int var3, int var4, int var5 ) {
  }

  public void draw(int var1, int var2, int var3, int var4, int var5, int var6,
      int var7,
      int var8,
      long var9,
      int var11,
      DummyClass0 var12 ) {
    if (this.appearance != null) {
        AnimationSequence var13 =
            this.animationId != -1 && this.anInt2828 == 0 ?
          GlobalStatics_8.method45(this.animationId, (byte) -20) :
          null;
        AnimationSequence var14 = (this.anInt2764 != -1)
            && !this.aBoolean3968 && (
          (this.anInt2764 != Objects
              .requireNonNull(this.getRenderAnimationId(false)).anInt368) || var13 == null) ?
          GlobalStatics_8.method45(this.anInt2764, (byte) -20) :
          null;
        AbstractModel var15 =
            this.appearance
                .method1165(this.aClass145Array2809, this.anInt2776, var14, var13,
                    this.anInt2802, this.anInt2793, -120, this.anInt2760, true,
                    this.anInt2832,
                    this.anInt2813);
        int var16 = GlobalStatics_5.method1727((byte) 123);
        if (GlRenderer.useOpenGlRenderer && GlobalStatics_6.anInt3492 < 96 && (var16 > 50)) {
          GlobalStatics_10.method90(1);
        }

        int var17;
        if (GlobalStatics_10.usageMode != 0 && var16 < 50) {
          for (var17 = 50 - var16; DummyClass42.anInt893 < var17; ++DummyClass42.anInt893) {
            GlobalStatics_9.byteArrayPool[DummyClass42.anInt893] = new byte[102400];
          }

          while (DummyClass42.anInt893 > var17) {
            --DummyClass42.anInt893;
            GlobalStatics_9.byteArrayPool[DummyClass42.anInt893] = null;
          }
        }

        if (var15 != null) {
          this.anInt2820 = var15.getMinimumY();
          AbstractModel var23;
          if (GlobalStatics_9.aBoolean2910 && (this.appearance.npcId == -1
            || GlobalStatics_2.getNpcConfiguration(this.appearance.npcId).aBoolean1249)) {
            var23 = GlobalStatics_8.method1957(160,
                this.aBoolean2810, var14 == null ? var13 : var14,
                this.anInt2819, 0, this.anInt2829, 0, 1, var15, var1,
                var14 != null ? this.anInt2813 : this.anInt2832, this.anInt2831, 240, (byte) -49);
            if (GlRenderer.useOpenGlRenderer) {
              float var18 = GlRenderer.method1852();
              float var19 = GlRenderer.method1839();
              GlRenderer.method1851();
              GlRenderer.method1825(var18, -150.0f + var19);
              assert var23 != null;
              var23.draw(0, var2, var3, var4, var5, var6, var7, var8, -1L, var11, null);
              GlRenderer.method1830();
              GlRenderer.method1825(var18, var19);
            } else {
              assert var23 != null;
              var23.draw(0, var2, var3, var4, var5, var6, var7, var8, -1L, var11, null);
            }
          }

          if (GlobalStatics_9.localPlayer == this) {
            for (var17 = GlobalStatics_8.aClass96Array2114.length - 1;
                (var17 >= 0); --var17) {
              HintMarker var27 = GlobalStatics_8.aClass96Array2114[var17];
              if (var27 != null && (var27.anInt1355 != -1)) {
                int var21;
                int var20;
                if ((var27.anInt1360 == 1) && var27.anInt1359 >= 0
                  && GlobalStatics_8.npcs.length > var27.anInt1359) {
                  NPC var24 = GlobalStatics_8.npcs[var27.anInt1359];
                  if (var24 != null) {
                    var20 = var24.anInt2819 / 32 - GlobalStatics_9.localPlayer.anInt2819 / 32;
                    var21 = -(GlobalStatics_9.localPlayer.anInt2829 / 32) + var24.anInt2829 / 32;
                    this.draw(null, var21, var15, var20, var6, var11, 2047, var1, var8, var5, var4,
                      var2, var27.anInt1355, var3, var7);
                  }
                }

                if (var27.anInt1360 == 2) {
                  int var29 = 4 * (-GlobalStatics_10.anInt1716 + var27.anInt1356) + 2 - (
                    GlobalStatics_9.localPlayer.anInt2819 / 32);
                  var20 = 2 + (4 * (var27.anInt1347 - GlobalStatics_9.anInt1152)
                    - GlobalStatics_9.localPlayer.anInt2829 / 32);
                  this.draw(null, var20, var15, var29, var6, var11, 2047, var1, var8, var5, var4,
                    var2, var27.anInt1355, var3, var7);
                }

                if ((var27.anInt1360 == 10) && var27.anInt1359 >= 0
                  && GlobalStatics_9.players.length > var27.anInt1359) {
                  Player var28 = GlobalStatics_9.players[var27.anInt1359];
                  if (var28 != null) {
                    var20 = -(GlobalStatics_9.localPlayer.anInt2819 / 32) + var28.anInt2819 / 32;
                    var21 = var28.anInt2829 / 32 - (GlobalStatics_9.localPlayer.anInt2829 / 32);
                    this.draw(null, var21, var15, var20, var6, var11, 2047, var1, var8, var5, var4,
                      var2, var27.anInt1355, var3, var7);
                  }
                }
              }
            }
          }

          this.method1971(var15, (byte) -103);
          this.method1969((byte) 110, var15, var1);
          var23 = null;
          if (!this.aBoolean3968 && (this.anInt2842 != -1) && this.anInt2805 != -1) {
            SpotAnimationConfig var26 = GlobalStatics_9.method898((byte) 42,
                this.anInt2842);
            var23 = var26.method966(this.anInt2826, (byte) -30, this.anInt2805,
                this.anInt2761);
            if (var23 != null) {
              var23.method1897(0, -this.anInt2799, 0);
              if (var26.aBoolean536) {
                if (GlobalStatics_10.anInt3198 != 0) {
                  var23.method1896(GlobalStatics_10.anInt3198);
                }

                if (GlobalStatics_9.anInt3623 != 0) {
                  var23.method1886(GlobalStatics_9.anInt3623);
                }

                if (GlobalStatics_10.anInt3111 != 0) {
                  var23.method1897(0, GlobalStatics_10.anInt3111, 0);
                }
              }
            }
          }

          AbstractModel var25 = null;
          if (!this.aBoolean3968 && this.anObject2796 != null) {
            if (GlobalStatics_4.updateCycle >= this.anInt2778) {
              this.anObject2796 = null;
            }

            if ((this.anInt2797 <= GlobalStatics_4.updateCycle)
              && this.anInt2778 > GlobalStatics_4.updateCycle) {
              if (this.anObject2796 instanceof GameObject) {
                var25 = (AbstractModel) ((GameObject) this.anObject2796)
                    .method1963(3);
              } else {
                var25 = (AbstractModel) this.anObject2796;
              }

              var25.method1897(this.anInt2782 - this.anInt2819, this.anInt2812
                      - this.anInt2831,
                  this.anInt2833 - this.anInt2829);
              if ((this.anInt2806 == 512)) {
                var25.method1900();
              } else {
                if ((this.anInt2806 == 1024)) {
                  var25.method1874();
                } else {
                  if ((this.anInt2806 == 1536)) {
                    var25.rotateQuarterY();
                  }
                }
              }
            }
          }

          if (GlRenderer.useOpenGlRenderer) {
            var15.aBoolean2699 = true;
            var15.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11,
                this.aClass127_Sub1_2801);
            if (var23 != null) {
              var23.aBoolean2699 = true;
              var23.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11,
                  this.aClass127_Sub1_2801);
            }
          } else {
            if (var23 != null) {
              var15 = ((SoftwareModel) var15).method1943(var23);
            }

            if (var25 != null) {
              var15 = ((SoftwareModel) var15).method1943(var25);
            }

            var15.aBoolean2699 = true;
            var15.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11,
                this.aClass127_Sub1_2801);
          }

          if (var25 != null) {
            if (this.anInt2806 == 512) {
              var25.rotateQuarterY();
            } else if (this.anInt2806 == 1024) {
              var25.method1874();
            } else if (this.anInt2806 == 1536) {
              var25.method1900();
            }

            var25.method1897(-this.anInt2782 + this.anInt2819, -this.anInt2812
                    + this.anInt2831,
              -this.anInt2833 + this.anInt2829);
          }

        }
      }
  }

  public int getMinimumY() {
    return this.anInt2820;
  }

  public void setPosition(byte var1, int x, boolean var3, int y ) {
    this.setPosition(this.getSize(), x, y, var3);
  }

  protected void finalize() {
  }

}
