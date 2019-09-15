package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;

public final class BitVariable {

  public int low;
  public int high;
  public int id;

  public void method1387(Buffer var1) {
    while (true) {
      int var3 = var1.readUnsignedByte();
      if (var3 == 0) {
        return;
      }
      this.method1389(var1, 1, var3);
    }
  }

  private void method1389(Buffer var1, int var2, int var3) {
    if (var2 == var3) {
      this.id = var1.readUnsignedShort();
      this.low = var1.readUnsignedByte();
      this.high = var1.readUnsignedByte();
    }
  }

}
