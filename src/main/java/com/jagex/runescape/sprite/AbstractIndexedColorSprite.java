package com.jagex.runescape.sprite;

public abstract class AbstractIndexedColorSprite {

  public int width;
  public int height;
  public int offsetX;
  public int offsetY;
  public int anInt1467;
  public int anInt1469;

  public abstract void draw(int x, int y, int alpha);

  public abstract void draw(int x, int y);

}
