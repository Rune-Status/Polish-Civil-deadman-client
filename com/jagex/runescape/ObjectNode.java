package com.jagex.runescape;

public final class ObjectNode extends AbstractObjectNode {

  public static ObjectCache aClass93_4043 = new ObjectCache(64);
  public static volatile int anInt4045;
  public static HashTable aClass130_4046 = new HashTable(16);
  public static FileUnpacker models;
  public static GameString aClass94_4049 = GameString.create("");
  public static int[] anIntArray4050 = new int[1000];
  public static ObjectCache aClass93_4051 = new ObjectCache(30);
  public static GameString aClass94_4052 = GameString.create("www");
  private final Object anObject4044;

  public ObjectNode(Object var1) {
    try {
      this.anObject4044 = var1;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
          "he.<init>(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  public Object getObject(boolean var1) {
    try {
      return !var1 ? null : this.anObject4044;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "he.B(" + var1 + ')');
    }
  }

  public boolean method568(int var1) {
    try {
      return var1 != -22358;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "he.A(" + var1 + ')');
    }
  }

  public static void method569(int var0, int var1) {
    if (var0 < -78) {
      WidgetUpdate var2 = AudioStreamEncoder3.method466(4, 7, var1);
      var2.createIndexedColorSprite(true);
    }
  }

  public static void method570(int var0) {
    try {
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
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "he.D(" + var0 + ')');
    }
  }

}
