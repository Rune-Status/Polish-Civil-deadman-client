package com.jagex.runescape.model;

import com.jagex.runescape.statics.GlobalStatics_6;
import com.jagex.runescape.statics.GlobalStatics_7;
import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.HashTable;
import com.jagex.runescape.common.StringNode;
import com.jagex.runescape.node.Node;
import com.jagex.runescape.node.SubNode;
import com.jagex.runescape.opengl.GLStatics;

public final class ClientScriptEnum extends SubNode {

  public int paramType;
  public int someType;
  public HashTable table;
  private GameString defaultValue;
  private HashTable aClass130_3666;
  private int defaultIntegerValue;


  public ClientScriptEnum() {
    this.defaultValue = GlobalStatics_6.aClass94_750;
  }

  private void parseOpcode(int opcode, Buffer var2, byte var3) {
    if (var3 > -29) {
        GlobalStatics_7.cameraY = 70;
      }

      if (opcode == 1) {
        this.someType = var2.readUnsignedByte();
      } else {
        if (opcode == 2) {
          this.paramType = var2.readUnsignedByte();
        } else if (opcode != 3) {
          if (opcode == 4) {
            this.defaultIntegerValue = var2.readInt();
          } else {
            if (opcode == 5 || opcode == 6) {
              int size = var2.readUnsignedShort();
              this.table = new HashTable(
                  GLStatics.nearestPo2((byte) 94, size));

              for (int var5 = 0; var5 < size; ++var5) {
                int key = var2.readInt();
                Node var7;
                if (opcode == 5) {
                  var7 = new StringNode(var2.readString());
                } else {
                  var7 = new IntegerNode(var2.readInt());
                }

                this.table.put(key, var7);
              }
            }
          }
        } else {
          this.defaultValue = var2.readString();
        }
      }
  }

  public GameString getString(int var1, byte var2 ) {
    int var3 = 10 / ((var2 - 68) / 50);
      if (this.table == null) {
        return this.defaultValue;
      } else {
        StringNode var4 = (StringNode) this.table.get(var1);
        return var4 == null ? this.defaultValue : var4.aClass94_2586;
      }
  }

  public boolean hasValue(GameString name, int var2 ) {
    if (this.table == null) {
        return false;
      } else {
        if (var2 != 8729) {
          this.parseOpcode(-97, null, (byte) -91);
        }

        if (this.aClass130_3666 == null) {
          this.method618(0);
        }

        for (StringNode0 var3 = (StringNode0) this.aClass130_3666.get(name.hash());
             var3 != null; var3 = (StringNode0) this.aClass130_3666.getLastFetchedNode()) {
          if (var3.aClass94_2341.method1528((byte) -42, name)) {
            return true;
          }
        }

        return false;
      }
  }

  private void method618(int var1) {
    this.aClass130_3666 = new HashTable(this.table.getCapacity());
      StringNode var2 = (StringNode) this.table.getFirst(var1 + 88);
      if (var1 == 0) {
        while (var2 != null) {
          StringNode0 var3 = new StringNode0(var2.aClass94_2586, (int) var2.key);
          this.aClass130_3666.put(var2.aClass94_2586.hash(), var3);
          var2 = (StringNode) this.table.getNext(-99);
        }

      }
  }

  public int getInteger(int var1, int var2 ) {
    if (this.table != null) {
        IntegerNode var3 = (IntegerNode) this.table.get(var2);
        return var3 != null ? var3.anInt2467 : this.defaultIntegerValue;
      } else {
        return this.defaultIntegerValue;
      }
  }

  public boolean method621(int var1, int var2 ) {
    if (this.table != null) {
        if (this.aClass130_3666 == null) {
          this.method622(109);
        }

        IntegerNode var3 = (IntegerNode) this.aClass130_3666.get(var2);
        return var3 != null;
      } else {
        return false;
      }
  }

  private void method622(int var1) {
    this.aClass130_3666 = new HashTable(this.table.getCapacity());
      int var3 = -48 % ((26 - var1) / 58);

      for (IntegerNode var2 = (IntegerNode) this.table.getFirst(123);
          var2 != null; var2 = (IntegerNode) this.table.getNext(-88)) {
        IntegerNode var4 = new IntegerNode((int) var2.key);
        this.aClass130_3666.put(var2.anInt2467, var4);
      }
  }

  public void parseConfig(Buffer buffer ) {
    while (true) {
        int opcode = buffer.readUnsignedByte();
        if (opcode == 0) {
          return;
        }

        this.parseOpcode(opcode, buffer, (byte) -84);
      }
  }

}
