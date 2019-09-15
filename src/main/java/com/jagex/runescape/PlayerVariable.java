package com.jagex.runescape;

import com.jagex.runescape.buffer.Buffer;

public final class PlayerVariable {

  public int anInt556;

  public void method970(int var1, Buffer var2 ) {
    while (true) {
        int var3 = var2.readUnsignedByte();
        if (var3 == 0) {
          if (var1 != -20638) {
            GlobalStatics_9.method969(null, 55);
          }

          return;
        }

        this.method972(var2, (byte) -117, var3);
      }
  }

  private void method972(Buffer var1, byte var2, int var3) {
    if (var2 > -86) {
        this.method970(-83, null);
      }

      if ((var3 == 5)) {
        this.anInt556 = var1.readUnsignedShort();
      }
  }

}
