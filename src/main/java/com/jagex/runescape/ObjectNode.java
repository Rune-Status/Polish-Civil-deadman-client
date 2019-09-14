package com.jagex.runescape;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.common.HashTable;
import com.jagex.runescape.node.AbstractObjectNode;

public final class ObjectNode extends AbstractObjectNode {

  public static ObjectCache aClass93_4043 = new ObjectCache(64);
  public static volatile int anInt4045;
  public static HashTable aClass130_4046 = new HashTable(16);
  public static FileUnpacker models;
  public static GameString aClass94_4049 = GameStringStatics.create("");
  public static int[] anIntArray4050 = new int[1000];
  public static ObjectCache aClass93_4051 = new ObjectCache(30);
  public static GameString aClass94_4052 = GameStringStatics.create("www");
  private final Object anObject4044;

  public ObjectNode(Object var1) {
    this.anObject4044 = var1;
  }

  public Object getObject(boolean var1) {
    return !var1 ? null : this.anObject4044;
  }

  public boolean method568(int var1) {
    return var1 != -22358;
  }

  public static void method569(int var0, int var1) {
    if (var0 < -78) {
      WidgetUpdate var2 = GlobalStatics_6.method466(4, 7, var1);
      var2.createIndexedColorSprite(true);
    }
  }

  public static void method570(int var0) {
    ObjectNode.aClass94_4049 = null;
      ObjectNode.anIntArray4050 = null;
      Mouse.INSTANCE = null;
      ObjectNode.aClass130_4046 = null;
      ObjectNode.aClass94_4052 = null;
      ObjectNode.aClass93_4043 = null;
      ObjectNode.models = null;
      if (var0 > -101) {
        ObjectNode.method570(-94);
      }

      ObjectNode.aClass93_4051 = null;
  }

}
