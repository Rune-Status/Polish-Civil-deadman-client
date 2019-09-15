package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.HashTable;
import com.jagex.runescape.common.StringNode;
import com.jagex.runescape.node.Node;
import com.jagex.runescape.node.SubNode;
import com.jagex.runescape.opengl.GLStatics;
import com.jagex.runescape.statics.GlobalStatics_9;

public final class Structure extends SubNode {

  private HashTable aClass130_3636;

  public int method600(int var1, int var2, byte var3 ) {
    if (this.aClass130_3636 != null) {
        if (var3 != -29) {
          this.method604(null, (byte) 56, 110);
        }

        IntegerNode var4 = (IntegerNode) this.aClass130_3636.get(var1);
        return var4 == null ? var2 : var4.anInt2467;
      } else {
        return var2;
      }
  }

  private void method601(Buffer var1, int var2, byte var3) {
    if (var3 < -2) {
        if (var2 == 249) {
          int var4 = var1.readUnsignedByte();
          int var5;
          if (this.aClass130_3636 == null) {
            var5 = GLStatics.nearestPo2((byte) 105, var4);
            this.aClass130_3636 = new HashTable(var5);
          }

          for (var5 = 0; var4 > var5; ++var5) {
            boolean var6 = var1.readUnsignedByte() == 1;
            int var7 = var1.readUnsignedMedium((byte) 95);
            Node var8;
            if (var6) {
              var8 = new StringNode(var1.readString());
            } else {
              var8 = new IntegerNode(var1.readInt());
            }

            this.aClass130_3636.put(var7, var8);
          }
        }

      }
  }

  public GameString method604(GameString var1, byte var2, int var3 ) {
    if (this.aClass130_3636 == null) {
        return var1;
      } else {
        StringNode var4 = (StringNode) this.aClass130_3636.get(var3);
        if (var2 != -44) {
          GlobalStatics_9.method607(false);
        }

        return var4 != null ? var4.aClass94_2586 : var1;
      }
  }

  public void method608(int var1, Buffer var2 ) {
    while (true) {
        int var3 = var2.readUnsignedByte();
        if (var3 == 0) {
          if (var1 != 5) {
            GlobalStatics_9.method607(false);
          }

          return;
        }

        this.method601(var2, var3, (byte) -5);
      }
  }

}
