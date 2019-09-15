package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.statics.DummyClass32;
import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_8;
import com.jagex.runescape.statics.GlobalStatics_9;

public final class SpotAnimationConfig {

  public boolean aBoolean536;
  public int anInt539;
  public int anInt542 = -1;
  private int scaleXZ = 128;
  private short[] faceIds;
  private short[] aShortArray534;
  private short[] aShortArray535;
  private int anInt537;
  private int anInt538;
  private int scaleY = 128;
  private int anInt541;
  private int rotationY;
  private short[] colorIds;

  public void method963(Buffer var1, byte var2 ) {
    if (var2 != -113) {
        GlobalStatics_9.method967(88, -118, 75, -51, -96, -50, 45, 127);
      }

      while (true) {
        int var3 = var1.readUnsignedByte();
        if (var3 == 0) {
          return;
        }

        this.method965(var1, var3, 128);
      }
  }

  private void method965(Buffer var1, int var2, int var3) {
    if (var2 == 1) {
        this.anInt541 = var1.readUnsignedShort();
      } else if (var2 == 2) {
        this.anInt542 = var1.readUnsignedShort();
      } else if (var2 != 4) {
        if ((var2 == 5)) {
          this.scaleY = var1.readUnsignedShort();
        } else {
          if (var2 == 6) {
            this.rotationY = var1.readUnsignedShort();
          } else if (var2 == 7) {
            this.anInt538 = var1.readUnsignedByte();
          } else if ((var2 != 8)) {
            if ((var2 == 9)) {
              this.aBoolean536 = true;
            } else {
              int var4;
              int var5;
              if (var2 == 40) {
                var4 = var1.readUnsignedByte();
                this.faceIds = new short[var4];
                this.colorIds = new short[var4];

                for (var5 = 0; (var5 < var4); ++var5) {
                  this.faceIds[var5] = (short) var1.readUnsignedShort();
                  this.colorIds[var5] = (short) var1.readUnsignedShort();
                }
              } else {
                if (var2 == 41) {
                  var4 = var1.readUnsignedByte();
                  this.aShortArray534 = new short[var4];
                  this.aShortArray535 = new short[var4];

                  for (var5 = 0; var4 > var5; ++var5) {
                    this.aShortArray534[var5] = (short) var1
                        .readUnsignedShort();
                    this.aShortArray535[var5] = (short) var1
                        .readUnsignedShort();
                  }
                }
              }
            }
          } else {
            this.anInt537 = var1.readUnsignedByte();
          }
        }
      } else {
        this.scaleXZ = var1.readUnsignedShort();
      }

      if (var3 != 128) {
        this.colorIds = null;
      }
  }

  public AbstractModel method966(int var1, byte var2, int var3, int var4 ) {
    AbstractModel var5 = (AbstractModel) DummyClass32.aClass93_511.get(
          this.anInt539);
      if (var2 == -30) {
        if (var5 == null) {
          Model var6 = GlobalStatics_10
              .getModel(GlobalStatics_9.models, this.anInt541, 0);
          if (var6 == null) {
            return null;
          }

          int var7;
          if (this.faceIds != null) {
            for (var7 = 0; this.faceIds.length > var7; ++var7) {
              var6.replaceColor(this.faceIds[var7], this.colorIds[var7]);
            }
          }

          if (this.aShortArray534 != null) {
            for (var7 = 0; var7 < this.aShortArray534.length; ++var7) {
              var6.replaceMaterial(
                  this.aShortArray534[var7], this.aShortArray535[var7]);
            }
          }

          var5 = var6
              .method2008(64 + this.anInt538, this.anInt537 + 850, -30, -50,
                  -30);
          DummyClass32.aClass93_511.get((byte) -96, var5, this.anInt539);
        }

        AbstractModel var9;
        if ((this.anInt542 != -1) && var3 != -1) {
          var9 = GlobalStatics_8.method45(this.anInt542, (byte) -20)
              .method2059(var1, var4, var3, (byte) -52, var5);
        } else {
          var9 = var5.method1882(true, true, true);
        }

        if (this.scaleXZ != 128 || this.scaleY != 128) {
          var9.scale(this.scaleXZ, this.scaleY, this.scaleXZ);
        }

        if (this.rotationY != 0) {
          if ((this.rotationY == 90)) {
            var9.rotateQuarterY();
          }

          if (this.rotationY == 180) {
            var9.method1874();
          }

          if (this.rotationY == 270) {
            var9.method1900();
          }
        }

        return var9;
      } else {
        return null;
      }
  }

}
