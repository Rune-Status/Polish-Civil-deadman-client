package com.jagex.runescape;

public abstract class AbstractIndexedColorSprite {

  public static int anInt1462;
  public static int anInt1463 = -16 + (int) (Math.random() * 33.0D);
  public static long aLong1465;
  public static GameString aClass94_1466 = GameString.create("Lade Titelbild )2 ");
  public int width;
  public int offsetY;
  public int anInt1467;
  public int height;
  public int anInt1469;
  public int offsetX;

  public abstract void draw(int var1,int var2,int var3 );

  public abstract void draw(int var1,int var2 );

  public static void addLast(Node first, Node second) {
    if (first.prevNode != null) {
        first.unlinkNode();
      }

      first.nextNode = second;
      first.prevNode = second.prevNode;
      first.prevNode.nextNode = first;
      first.nextNode.prevNode = first;
  }

  public static void method1663(int var0) {
    AbstractIndexedColorSprite.aClass94_1466 = null;
      if (var0 != 33) {
        AbstractIndexedColorSprite.anInt1463 = 15;
      }
  }

  public static Queue method1664(int var0, int var1, byte var2) {
    Queue var3 = new Queue();

      for (SomethingWorldMapy var4 = (SomethingWorldMapy) DummyClass21.aClass61_1758.getFirst();
           var4 != null; var4 = (SomethingWorldMapy) DummyClass21.aClass61_1758.getNext()) {
        if (var4.aBoolean3553 && var4.method537(var1, (byte) 97, var0)) {
          var3.addLast(var4);
        }
      }

      return var3;
  }

  public static void method1665(int var0, int var1, int var2, int var3, int var4, int var5,
                               int var6) {
    int var7 = var5 + var2;
      int var8 = -var5 + var4;
      if (var0 != -19619) {
        AbstractIndexedColorSprite.method1665(-17, 11, -118, -38, 115, -2, 113);
      }

      int var9 = var5 + var6;

      int var11;
      for (var11 = var2; ~var11 > ~var7; ++var11) {
        TextureSampler18.method282(DummyClass35.anIntArrayArray663[var11], var6, -91, var1, var3);
      }

      for (var11 = var4; var8 < var11; --var11) {
        TextureSampler18.method282(DummyClass35.anIntArrayArray663[var11], var6, -113, var1, var3);
      }

      int var10 = -var5 + var1;

      for (var11 = var7; ~var8 <= ~var11; ++var11) {
        int[] var12 = DummyClass35.anIntArrayArray663[var11];
        TextureSampler18.method282(var12, var6, -111, var9, var3);
        TextureSampler18.method282(var12, var10, -124, var1, var3);
      }
  }

}
