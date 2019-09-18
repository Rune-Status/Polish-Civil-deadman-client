package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.node.SubNode;
import com.jagex.runescape.statics.GlobalStatics_9;

public final class Parameter extends SubNode {

  public int anInt3614;
  public GameString aClass94_3619;
  private int anInt3617;

  private void method579(int var1, Buffer var2, int var3) {
    if (var1 == 1) {
        this.anInt3617 = var2.readUnsignedByte();
      } else {
        if (var1 == 2) {
          this.anInt3614 = var2.readInt();
        } else if (var1 == 5) {
          this.aClass94_3619 = var2.readString();
        }
      }

      if (var3 != 0) {
        GlobalStatics_9
            .method582(5, 31, 114, true, -67, 14, -33, -115, -101, -61, -25, -121);
      }
  }

  public void method583(int var1, Buffer var2 ) {
    if (var1 == 207) {
        while (true) {
          int var3 = var2.readUnsignedByte();
          if (var3 == 0) {
            return;
          }

          this.method579(var3, var2, 0);
        }
      }
  }

  public boolean method585(int var1 ) {
    if (var1 != 0) {
        GameStringStatics.aClass94_3621 = null;
      }

      return this.anInt3617 == 115;
  }

}
