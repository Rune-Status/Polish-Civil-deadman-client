package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_9;

public final class IdentityKit {

  public int anInt466 = -1;
  public boolean aBoolean476;
  private short[] aShortArray460;
  private short[] aShortArray464;
  private short[] aShortArray470;
  private short[] aShortArray471;
  private int[] anIntArray474;
  private final int[] anIntArray475 = {-1, -1, -1, -1, -1};

  public Model method941(boolean var1 ) {
    if (var1) {
        int var3 = 0;
        Model[] var2 = new Model[5];

        for (int var4 = 0; (var4 < 5); ++var4) {
          if ((this.anIntArray475[var4] != -1)) {
            var2[var3++] =
                GlobalStatics_10.getModel(GlobalStatics_9.aClass153_152,
                    this.anIntArray475[var4], 0);
          }
        }

        Model var7 = new Model(var2, var3);
        int var5;
        if (this.aShortArray464 != null) {
          for (var5 = 0; (var5 < this.aShortArray464.length); ++var5) {
            var7.replaceColor(this.aShortArray464[var5],
                this.aShortArray460[var5]);
          }
        }

        if (this.aShortArray471 != null) {
          for (var5 = 0; this.aShortArray471.length > var5; ++var5) {
            var7.replaceMaterial(this.aShortArray471[var5],
                this.aShortArray470[var5]);
          }
        }

        return var7;
      } else {
        return null;
      }
  }

  public boolean method942(int var1 ) {
    if (this.anIntArray474 == null) {
        return true;
      } else {
        boolean var2 = true;
        if (var1 < 72) {
          this.method948(44);
        }

        for (int var3 = 0; (var3 < this.anIntArray474.length); ++var3) {
          if (!GlobalStatics_9.aClass153_152.method2129((byte) -90, 0,
              this.anIntArray474[var3])) {
            var2 = false;
          }
        }

        return var2;
      }
  }

  private void method946(byte var1, Buffer var2, int var3) {
    if (var1 >= -16) {
        this.aShortArray470 = null;
      }

      if ((var3 == 1)) {
        this.anInt466 = var2.readUnsignedByte();
      } else {
        int var4;
        int var5;
        if ((var3 == 2)) {
          var4 = var2.readUnsignedByte();
          this.anIntArray474 = new int[var4];

          for (var5 = 0; var4 > var5; ++var5) {
            this.anIntArray474[var5] = var2.readUnsignedShort();
          }
        } else if ((var3 == 3)) {
          this.aBoolean476 = true;
        } else if ((var3 != 40)) {
          if ((var3 == 41)) {
            var4 = var2.readUnsignedByte();
            this.aShortArray471 = new short[var4];
            this.aShortArray470 = new short[var4];

            for (var5 = 0; var4 > var5; ++var5) {
              this.aShortArray471[var5] = (short) var2.readUnsignedShort();
              this.aShortArray470[var5] = (short) var2.readUnsignedShort();
            }
          } else if ((var3 >= 60) && var3 < 70) {
            this.anIntArray475[-60 + var3] = var2.readUnsignedShort();
          }
        } else {
          var4 = var2.readUnsignedByte();
          this.aShortArray460 = new short[var4];
          this.aShortArray464 = new short[var4];

          for (var5 = 0; var5 < var4; ++var5) {
            this.aShortArray464[var5] = (short) var2.readUnsignedShort();
            this.aShortArray460[var5] = (short) var2.readUnsignedShort();
          }
        }
      }
  }

  public Model method947(byte var1 ) {
    if (this.anIntArray474 == null) {
        return null;
      } else {
        Model[] var2 = new Model[this.anIntArray474.length];

        for (int var3 = 0; (var3 < this.anIntArray474.length); ++var3) {
          var2[var3] =
            GlobalStatics_10.getModel(GlobalStatics_9.aClass153_152, this.anIntArray474[var3], 0);
        }

        int var4 = 27 / ((var1 - 74) / 35);
        Model var7;
        if (var2.length == 1) {
          var7 = var2[0];
        } else {
          var7 = new Model(var2, var2.length);
        }

        int var5;
        if (this.aShortArray464 != null) {
          for (var5 = 0; var5 < this.aShortArray464.length; ++var5) {
            assert var7 != null;
            var7.replaceColor(this.aShortArray464[var5], this.aShortArray460[var5]);
          }
        }

        if (this.aShortArray471 != null) {
          for (var5 = 0; (var5 < this.aShortArray471.length); ++var5) {
            assert var7 != null;
            var7.replaceMaterial(this.aShortArray471[var5], this.aShortArray470[var5]);
          }
        }

        return var7;
      }
  }

  public boolean method948(int var1 ) {
    boolean var2 = true;
      if (var1 != 18991) {
        this.aShortArray460 = null;
      }

      for (int var3 = 0; var3 < 5; ++var3) {
        if (this.anIntArray475[var3] != -1 && !GlobalStatics_9.aClass153_152.method2129(
          (byte) 95, 0, this.anIntArray475[var3])) {
          var2 = false;
        }
      }

      return var2;
  }

  public void method952(int var1, Buffer var2 ) {
    if (var1 == -31957) {
        while (true) {
          int var3 = var2.readUnsignedByte();
          if (var3 == 0) {
            return;
          }

          this.method946((byte) -84, var2, var3);
        }
      }
  }

}
