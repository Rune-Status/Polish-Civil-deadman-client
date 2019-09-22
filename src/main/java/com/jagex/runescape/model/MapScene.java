package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.sprite.SoftwareIndexedColorSprite;
import com.jagex.runescape.statics.DummyClass39;
import com.jagex.runescape.statics.GlobalStatics_0;
import com.jagex.runescape.statics.GlobalStatics_5;
import com.jagex.runescape.statics.GlobalStatics_9;

public final class MapScene {

  public int anInt61;
  public int spriteId;
  public boolean aBoolean69;

  public void method74(byte var1, Buffer var2, int var3) {
    while (true) {
      int var4 = var2.readUnsignedByte();
      if (var4 == 0) {
        if (var1 > -108) {
          this.method74((byte) 85, null, 63);
        }

        return;
      }

      this.method79(var4, var2, var3, 95);
    }
  }

  public SoftwareIndexedColorSprite getSprite(int var1, byte var2) {
    SoftwareIndexedColorSprite var3 =
        (SoftwareIndexedColorSprite) GlobalStatics_9.aClass93_3369.get(
            var1 << 16 | this.spriteId);
    if (var3 != null) {
      return var3;
    } else {
      GlobalStatics_9.sprites.isLoaded(this.spriteId);
      var3 = GlobalStatics_0
          .createSprite(0, true, this.spriteId, GlobalStatics_9.sprites);
      if (var3 != null) {
        var3.method1668(GlobalStatics_9.anInt2136, DummyClass39.anInt740,
            GlobalStatics_5.anInt2015);
        var3.anInt1469 = var3.width;
        var3.anInt1467 = var3.height;

        for (int var5 = 0; var1 > var5; ++var5) {
          var3.method1674();
        }

        GlobalStatics_9.aClass93_3369.get((byte) -125, var3,
            var1 << 16 | this.spriteId);
      }

      return var3;
    }
  }

  private void method79(int var1, Buffer var2, int var3, int var4) {
    if (var1 == 1) {
      this.spriteId = var2.readUnsignedShort();
    } else if (var1 != 2) {
      if (var1 == 3) {
        this.aBoolean69 = true;
      } else {
        if (var1 == 4) {
          this.spriteId = -1;
        }
      }
    } else {
      this.anInt61 = var2.readUnsignedMedium((byte) 96);
    }

    if (var4 <= 7) {
      GlobalStatics_9.anInt65 = 123;
    }
  }

}
