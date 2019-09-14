package com.jagex.runescape;

public final class DummyClass32 {

  private static GameString aClass94_519 = GameString.create("skill: ");
  private static GameString aClass94_521 = GameString.create("scroll:");
  private static GameString aClass94_527 = GameString.create("level: ");
  public static int[] anIntArray510 = {768, 1024, 1280, 512, 1536, 256, 0, 1792};
  public static ObjectCache aClass93_511 = new ObjectCache(30);
  public static int[] anIntArray512 = new int[500];
  public static int anInt513;
  public static GameString aClass94_514 = GameString.create(":duelstake:");
  public static int anInt515 = -1;
  public static GameString aClass94_516 = GameString.create("unzap");
  public static int anInt517;
  public static SoftwareDirectColorSprite aClass3_Sub28_Sub16_Sub2_518;
  public static GameString aClass94_520 = GameString.create("Chargement des interfaces )2 ");
  public static SomethingAudio aClass157_524;
  public static Widget aClass11_526;
  public static GameString SKILL = DummyClass32.aClass94_519;
  public static GameString aClass94_523 = DummyClass32.aClass94_521;
  public static GameString aClass94_528 = DummyClass32.aClass94_521;
  public static GameString aClass94_525 = DummyClass32.aClass94_527;

  public static int method961(int var0) {
    try {
      return var0 != 1536 ?
        96 :
        (DummyClass30.anInt453 == 0 ?
          0 :
          MapScene.anInterface5Array70[DummyClass30.anInt453].method24());
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ef.B(" + var0 + ')');
    }
  }

  public static void method962(byte var0) {
    try {
      DummyClass32.aClass94_528 = null;
      DummyClass32.aClass94_523 = null;
      DummyClass32.aClass94_525 = null;
      DummyClass32.anIntArray512 = null;
      DummyClass32.aClass94_527 = null;
      DummyClass32.aClass94_520 = null;
      DummyClass32.aClass3_Sub28_Sub16_Sub2_518 = null;
      if (var0 > -44) {
        DummyClass32.SKILL = null;
      }

      DummyClass32.aClass11_526 = null;
      DummyClass32.anIntArray510 = null;
      DummyClass32.SKILL = null;
      DummyClass32.aClass94_521 = null;
      DummyClass32.aClass94_514 = null;
      DummyClass32.aClass94_516 = null;
      DummyClass32.aClass94_519 = null;
      DummyClass32.aClass157_524 = null;
      DummyClass32.aClass93_511 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ef.A(" + var0 + ')');
    }
  }

}
