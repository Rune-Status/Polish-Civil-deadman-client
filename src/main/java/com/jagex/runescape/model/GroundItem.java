package com.jagex.runescape.model;

import com.jagex.runescape.scene.SceneNode;
import com.jagex.runescape.statics.DummyClass35;

public final class GroundItem extends SceneNode {

  public int anInt2930;
  public int anInt2936;
  private int anInt2932 = -32768;

  public void method1867(int var1, int var2, int var3, int var4, int var5 ) {
  }

  public void draw(int var1, int var2, int var3, int var4, int var5,
      int translateX,
      int translateY,
      int translateZ,
      long var9,
      int var11) {
    AbstractModel var13 = DummyClass35.getItemConfig(this.anInt2936, (byte) 84)
        .getModel(124, -1, 0, null, this.anInt2930, 0);
      if (var13 != null) {
        var13.draw(var1, var2, var3, var4, var5, translateX, translateY, translateZ, var9, var11
        );
        this.anInt2932 = var13.getMinimumY();
      }
  }

  public int getMinimumY() {
    return this.anInt2932;
  }

}
