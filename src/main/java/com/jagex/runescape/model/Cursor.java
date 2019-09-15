package com.jagex.runescape.model;

import com.jagex.runescape.statics.DummyClass5;
import com.jagex.runescape.statics.GlobalStatics_2;
import com.jagex.runescape.statics.GlobalStatics_3;
import com.jagex.runescape.buffer.Buffer;

public final class Cursor {

  public int anInt879;
  public int anInt881;
  private int anInt883;

  public SoftwareDirectColorSprite method1179(byte var1 ) {
    SoftwareDirectColorSprite var2 =
        (SoftwareDirectColorSprite) DummyClass5.aClass93_2984.get(this.anInt883);
      if (var2 != null) {
        return var2;
      } else if (var1 != 95) {
        return null;
      } else {
        var2 = GlobalStatics_2.method562(GlobalStatics_3.aClass153_1852, 0,
            this.anInt883,
          (byte) 39);
        if (var2 != null) {
          DummyClass5.aClass93_2984.get((byte) -87, var2, this.anInt883);
        }

        return var2;
      }
  }

  public void method1182(Buffer var1, int var2, byte var3 ) {
    if (var3 < 75) {
        this.method1182(null, -111, (byte) 47);
      }

      while (true) {
        int var4 = var1.readUnsignedByte();
        if ((var4 == 0)) {
          return;
        }

        this.method1183(-18426, var2, var4, var1);
      }
  }

  private void method1183(int var1, int var2, int var3, Buffer var4) {
    if (var1 != -18426) {
        this.anInt881 = -82;
      }

      if ((var3 == 1)) {
        this.anInt883 = var4.readUnsignedShort();
      } else {
        if (var3 == 2) {
          this.anInt881 = var4.readUnsignedByte();
          this.anInt879 = var4.readUnsignedByte();
        }
      }
  }

}
