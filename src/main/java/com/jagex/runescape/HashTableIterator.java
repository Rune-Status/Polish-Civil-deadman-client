package com.jagex.runescape;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;

public final class HashTableIterator {

  public static ObjectCache aClass93_1131 = new ObjectCache(5);
  public static GameString aClass94_1133 = GameString.create(")4j");
  public static ObjectCache aClass93_1135 = new ObjectCache(4);
  public static AbstractDirectColorSprite[] aClass3_Sub28_Sub16Array1136;
  public static int anInt1137 = 2;
  public static int[] anIntArray1138;
  private Node iterator;
  private int anInt1132;
  private final HashTable table;


  public HashTableIterator(HashTable var1 ) {
    this.table = var1;
  }

  public Node getNext() {
    Node var2;
      if (~this.anInt1132 < -1
          && this.table.nodes[this.anInt1132 + -1] != this.iterator) {
        var2 = this.iterator;
        this.iterator = var2.nextNode;
        return var2;
      } else {
        do {
          if (~this.table.capacity >= ~this.anInt1132) {
            return null;
          }

          var2 = this.table.nodes[this.anInt1132++].nextNode;
        } while (var2 == this.table.nodes[-1 + this.anInt1132]);

        this.iterator = var2.nextNode;
        return var2;
      }
  }

  public Node getFirst() {
    this.anInt1132 = 0;
      return this.getNext();
  }

  public static void method1394(byte var0) {
    HashTableIterator.anIntArray1138 = null;
      int var1 = 118 / ((-33 - var0) / 45);
      HashTableIterator.aClass93_1131 = null;
      HashTableIterator.aClass94_1133 = null;
      HashTableIterator.aClass93_1135 = null;
      HashTableIterator.aClass3_Sub28_Sub16Array1136 = null;
  }

  public static long method1395(int var0, int var1, int var2) {
    SceneGraphTile var3 = SomethingTexture1.sceneGraphTiles[var0][var1][var2];
    return var3 != null && var3.aClass19_2233 != null ? var3.aClass19_2233.aLong428 : 0L;
  }

  public static void method1396(int var0) {
    int var2 = DisplayMode.viewY;
      int var1 = DummyClass51.viewX;
      int var4 = -GroundItem.viewHeight + (SceneSomething2.windowHeight - var2);
      int var3 = -var1 + AreaSoundEffect.windowWidth - DummyClass30.viewWidth;
      if (~var1 < var0 || ~var3 < -1 || var2 > 0 || ~var4 < -1) {
        try {
          Component var5 = null;
          if (TextureSampler30.fullScreenFrame != null) {
            var5 = TextureSampler30.fullScreenFrame;
          } else {
            if (TextureSampler27.FRAME != null) {
              var5 = TextureSampler27.FRAME;
            }
          }

          int var7 = 0;
          int var6 = 0;
          if (TextureSampler27.FRAME == var5) {
            assert TextureSampler27.FRAME != null;
            Insets var8 = TextureSampler27.FRAME.getInsets();
            var6 = var8.left;
            var7 = var8.top;
          }

          Graphics var11 = var5.getGraphics();
          var11.setColor(Color.black);
          if (~var1 < -1) {
            var11.fillRect(var6, var7, var1, SceneSomething2.windowHeight);
          }

          if (var2 > 0) {
            var11.fillRect(var6, var7, AreaSoundEffect.windowWidth, var2);
          }

          if (var3 > 0) {
            var11.fillRect(-var3 + var6 + AreaSoundEffect.windowWidth, var7, var3,
              SceneSomething2.windowHeight);
          }

          if (~var4 < -1) {
            var11.fillRect(var6, -var4 + var7 + SceneSomething2.windowHeight,
              AreaSoundEffect.windowWidth, var4);
          }
        } catch (Exception var9) {
        }
      }
  }

}
