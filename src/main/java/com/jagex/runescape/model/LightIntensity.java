package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.statics.GlobalStatics_9;

public final class LightIntensity {

  public int anInt896;
  public int anInt899 = 2048;
  public int anInt907;
  public int anInt908 = 2048;

  public void method1190(int var1, Buffer var2, int var3) {
    while (true) {
      int var4 = var2.readUnsignedByte();
      if (var4 == 0) {
        if (var1 != 2) {
          GameStringStatics.aClass94_905 = null;
        }

        return;
      }

      this.method1191(var4, var2, var3, true);
    }
  }

  private void method1191(int var1, Buffer var2, int var3, boolean var4) {
    if (var1 == 1) {
      this.anInt896 = var2.readUnsignedByte();
    } else {
      if (var1 == 2) {
        this.anInt908 = var2.readUnsignedShort();
      } else if (var1 == 3) {
        this.anInt899 = var2.readUnsignedShort();
      } else if (var1 == 4) {
        this.anInt907 = var2.method787((byte) 46);
      }
    }

    if (!var4) {
      GlobalStatics_9.method1192((byte) 123);
    }
  }

}
