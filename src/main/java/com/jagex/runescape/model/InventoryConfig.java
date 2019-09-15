package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.node.SubNode;
import com.jagex.runescape.statics.GlobalStatics_9;

public final class InventoryConfig extends SubNode {

  public int size;

  public void method610(Buffer var1, int var2 ) {
    if (var2 != 0) {
        GlobalStatics_9.aClass94_3649 = null;
      }

      while (true) {
        int var3 = var1.readUnsignedByte();
        if (var3 == 0) {
          return;
        }

        this.method614(var1, var3, false);
      }
  }

  private void method614(Buffer var1, int var2, boolean var3) {
    if (var3) {
        this.method610(null, -89);
      }

      if ((var2 == 2)) {
        this.size = var1.readUnsignedShort();
      }
  }

}
