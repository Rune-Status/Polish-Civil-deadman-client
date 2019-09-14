package com.jagex.runescape;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.done.AbstractDirectColorSprite;
import com.jagex.runescape.done.AbstractTextureSampler;

public final class TextureSampler2 extends AbstractTextureSampler {

  private static GameString aClass94_3371 = GameStringStatics.create("Sat");
  private static GameString aClass94_3372 = GameStringStatics.create("Mon");
  private static GameString aClass94_3374 = GameStringStatics.create("Fri");
  private static GameString aClass94_3378 = GameStringStatics.create("Wed");
  private static GameString aClass94_3379 = GameStringStatics.create("Thu");
  private static GameString aClass94_3380 = GameStringStatics.create("Tue");
  private static GameString aClass94_3381 = GameStringStatics.create("Sun");
  public static ObjectCache aClass93_3369 = new ObjectCache(64);
  public static GameString aClass94_3370 = GameStringStatics.create("hitmarks");
  public static AbstractDirectColorSprite[] aClass3_Sub28_Sub16Array3373;
  public static int anInt3375;
  public static int anInt3377 = 7759444;
  public static GameString aClass94_3382 = GameStringStatics.create("(U0a )2 in: ");
  public static GameString[] aClass94Array3376 = {
      TextureSampler2.aClass94_3381, TextureSampler2.aClass94_3372, TextureSampler2.aClass94_3380, TextureSampler2.aClass94_3378,
      TextureSampler2.aClass94_3379,
      TextureSampler2.aClass94_3374,
      TextureSampler2.aClass94_3371
  };

  public TextureSampler2() {
    super(0, true);
  }

  public int[] method154(int var1, byte var2 ) {
    int var3 = -96 / ((var2 - 30) / 36);
      return TextureCache.anIntArray2125;
  }

  public static void method317(int var0) {
    TextureSampler2.aClass94Array3376 = null;
      TextureSampler2.aClass94_3378 = null;
      TextureSampler2.aClass94_3374 = null;
      TextureSampler2.aClass94_3382 = null;
      TextureSampler2.aClass94_3381 = null;
      TextureSampler2.aClass94_3372 = null;
      TextureSampler2.aClass94_3380 = null;
      if (var0 != 7759444) {
        TextureSampler2.method317(72);
      }

      TextureSampler2.aClass93_3369 = null;
      TextureSampler2.aClass94_3379 = null;
      TextureSampler2.aClass3_Sub28_Sub16Array3373 = null;
      TextureSampler2.aClass94_3370 = null;
      TextureSampler2.aClass94_3371 = null;
  }

  public static void method318(int var0) {
    SpawnedGameObject var1 = (SpawnedGameObject) TextureSampler26.aClass61_3075.getFirst();
      if (var0 != 7759444) {
        TextureSampler2.aClass94_3379 = null;
      }

      for (; var1 != null; var1 = (SpawnedGameObject) TextureSampler26.aClass61_3075.getNext()) {
        if (var1.aliveTime == -1) {
          var1.anInt2261 = 0;
          DummyClass22.method1798(56, var1);
        } else {
          var1.unlinkNode();
        }
      }
  }

}
