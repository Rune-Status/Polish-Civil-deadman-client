package com.jagex.runescape;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.opengl.GLStatics;

public final class SomethingTexture1 extends AbstractSomethingTexture {

  public static SomethingFont aClass33_2637;
  public static int[] anIntArray2639;
  public static int anInt2640;
  public static GameString aClass94_2641 = GameStringStatics.create("K");
  public static int[] anIntArray2642 = {
    1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0,
    1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5
  };
  public static int p12FontFileId;
  public static FileUnpacker fileUnpacker6;
  public static SomethingFont aClass33_2648;
  private final int anInt2636;
  private int anInt2644;
  private final int anInt2646;
  private final int anInt2647;


  public SomethingTexture1(int var1, int var2, int var3, int var4, int var5,
      int var6,
      int var7 ) {
    super(var5, var6, var7);

    this.anInt2647 = var4;
      this.anInt2646 = var1;
      this.anInt2644 = var2;
      this.anInt2636 = var3;
  }

  public void method1335(int var1, int var2, int var3 ) {
    int var4 = var2 * this.anInt2646 >> 12;
      if (var3 != 4898) {
        this.anInt2644 = -39;
      }

      int var7 = this.anInt2647 * var1 >> 12;
      int var6 = this.anInt2644 * var1 >> 12;
      int var5 = this.anInt2636 * var2 >> 12;
      TextureSampler24.method223(true, this.anInt1106, var4, var6, var7,
          this.anInt1104,
          this.anInt1101, var5);
  }

  public void method1337(int var1, boolean var2, int var3 ) {
    if (!var2) {
        this.method1337(-7, false, 66);
      }
  }

  public void method1341(int var1, int var2, int var3 ) {
    int var4 = this.anInt2646 * var2 >> 12;
      int var5 = var2 * this.anInt2636 >> 12;
      int var6 = this.anInt2644 * var3 >> 12;
      int var7 = this.anInt2647 * var3 >> 12;
      if (var1 == 2) {
        DummyClass53.method1584(this.anInt1101, var7, var4, var6, -26571, var5);
      }
  }

  public static AbstractDirectColorSprite method1344(int var0, FileUnpacker var1, int var2) {
    if (var0 < 29) {
        GLStatics.sceneGraphTiles = null;
      }

      return !GroundItem.loadSprites(var1, var2) ? null : Light.method1062(99);
  }

  public static void method1345(int var0) {
    SomethingTexture1.aClass94_2641 = null;
      if (var0 >= -38) {
        SomethingTexture1.method1344(93, null, -70);
      }

      SomethingTexture1.anIntArray2642 = null;
      GLStatics.sceneGraphTiles = null;
      SomethingTexture1.aClass33_2648 = null;
      SomethingTexture1.aClass33_2637 = null;
      SomethingTexture1.fileUnpacker6 = null;
      SomethingTexture1.anIntArray2639 = null;
  }

}
