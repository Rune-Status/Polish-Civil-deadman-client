package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.node.SubNode;
import com.jagex.runescape.statics.GlobalStatics_10;

public final class SomethingQuickChat2 extends SubNode {

  public int[] anIntArray3533;
  public int[] anIntArray3534;
  public int[] anIntArray3535;
  public GameString aClass94_3538;
  public int[] anIntArray3540;

  public void method525(int var1) {
    int var2;
    if (this.anIntArray3540 != null) {
      for (var2 = 0; this.anIntArray3540.length > var2; ++var2) {
        this.anIntArray3540[var2] =
            this.anIntArray3540[var2] | 0x8000;
      }
    }

    if (this.anIntArray3534 != null) {
      for (var2 = 0; this.anIntArray3534.length > var2; ++var2) {
        this.anIntArray3534[var2] =
            this.anIntArray3534[var2] | 0x8000;
      }
    }

    var2 = 46 / ((var1 + 27) / 38);
  }

  public int method526(int var1, int var2) {
    if (this.anIntArray3540 != null) {
      for (int var3 = var2; var3 < this.anIntArray3540.length; ++var3) {
        if (var1 == this.anIntArray3533[var3]) {
          return this.anIntArray3540[var3];
        }
      }

      return -1;
    } else {
      return -1;
    }
  }

  private void method527(Buffer var1, int var2, int var3) {
    if (var2 != 0) {
      this.method526(-91, -3);
    }

    if (var3 == 1) {
      this.aClass94_3538 = var1.readString();
    } else {
      int var4;
      int var5;
      if (var3 == 2) {
        var4 = var1.readUnsignedByte();
        this.anIntArray3534 = new int[var4];
        this.anIntArray3535 = new int[var4];

        for (var5 = 0; var5 < var4; ++var5) {
          this.anIntArray3534[var5] = var1.readUnsignedShort();
          this.anIntArray3535[var5] = GlobalStatics_10
              .method322(true, var1.readByte());
        }
      } else {
        if (var3 == 3) {
          var4 = var1.readUnsignedByte();
          this.anIntArray3540 = new int[var4];
          this.anIntArray3533 = new int[var4];

          for (var5 = 0; var5 < var4; ++var5) {
            this.anIntArray3540[var5] = var1.readUnsignedShort();
            this.anIntArray3533[var5] = GlobalStatics_10
                .method322(true, var1.readByte());
          }
        }
      }
    }
  }

  public int method529(byte var1, int var2) {
    int var3 = 45 / ((var1 + 30) / 49);
    if (this.anIntArray3534 == null) {
      return -1;
    } else {
      for (int var4 = 0; this.anIntArray3534.length > var4; ++var4) {
        if (this.anIntArray3535[var4] == var2) {
          return this.anIntArray3534[var4];
        }
      }

      return -1;
    }
  }

  public void method530(Buffer var1, byte var2) {
    if (var2 <= 104) {
      this.anIntArray3534 = null;
    }

    while (true) {
      int var3 = var1.readUnsignedByte();
      if (var3 == 0) {
        return;
      }

      this.method527(var1, 0, var3);
    }
  }

}
