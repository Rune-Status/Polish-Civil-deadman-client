package com.jagex.runescape;

public final class TextureSampler2 extends AbstractTextureSampler {

  private static GameString aClass94_3371 = GameString.create("Sat");
  private static GameString aClass94_3372 = GameString.create("Mon");
  private static GameString aClass94_3374 = GameString.create("Fri");
  private static GameString aClass94_3378 = GameString.create("Wed");
  private static GameString aClass94_3379 = GameString.create("Thu");
  private static GameString aClass94_3380 = GameString.create("Tue");
  private static GameString aClass94_3381 = GameString.create("Sun");
  public static ObjectCache aClass93_3369 = new ObjectCache(64);
  public static GameString aClass94_3370 = GameString.create("hitmarks");
  public static AbstractDirectColorSprite[] aClass3_Sub28_Sub16Array3373;
  public static int anInt3375;
  public static int anInt3377 = 7759444;
  public static GameString aClass94_3382 = GameString.create("(U0a )2 in: ");
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
    try {
      int var3 = -96 / ((var2 - 30) / 36);
      return TextureCache.anIntArray2125;
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "rl.D(" + var1 + ',' + var2 + ')');
    }
  }

  public static void method317(int var0) {
    try {
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
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "rl.C(" + var0 + ')');
    }
  }

  public static void method318(int var0) {
    try {
      SpawnedGameObject var1 = (SpawnedGameObject) TextureSampler26.aClass61_3075.getFirst();
      if (var0 != 7759444) {
        TextureSampler2.aClass94_3379 = null;
      }

      for (; null != var1; var1 = (SpawnedGameObject) TextureSampler26.aClass61_3075.getNext()) {
        if (var1.aliveTime == -1) {
          var1.anInt2261 = 0;
          DummyClass22.method1798(56, var1);
        } else {
          var1.unlinkNode();
        }
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "rl.B(" + var0 + ')');
    }
  }

}
