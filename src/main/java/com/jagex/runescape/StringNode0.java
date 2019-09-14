package com.jagex.runescape;

public final class StringNode0 extends Node {

  public static GameString aClass94_2336 = GameString.create("M");
  public static int anInt2337;
  public static int[] anIntArray2338 = {160, 192, 80, 96, 0, 144, 80, 48, 160};
  public static byte[][][] aByteArrayArrayArray2339;
  public static GameString aClass94_2340 = GameString.create("Bitte warten Sie)3)3)3");
  public GameString aClass94_2341;


  public StringNode0() {
  }

  public StringNode0(GameString var1, int var2 ) {
    this.aClass94_2341 = var1;
  }

  public static void method138(GameString var0, int var1) {
    OndemandRequester.method1250(var1 ^ 93, false);
      AbstractSomethingTexture.method1339(var0, var1 + var1);
  }

  public static void method139(int var0) {
    if (var0 >= 63) {
        DummyCanvas.aClass93_21.method1524(3);
        DummyClass54.aClass93_1401.method1524(3);
        ObjectNode.aClass93_4051.method1524(3);
        DummyClass14.aClass93_1965.method1524(3);
      }
  }

  public static boolean method140(int var0, int var1) {
    int var2 = -11 / ((-29 - var1) / 49);
      return
          (~var0 <= -1 && AudioStreamEncoder4.aBooleanArray3503.length > var0)
              && AudioStreamEncoder4.aBooleanArray3503[var0];
  }

  public static RenderAnimation getRenderAnimation(boolean var0, int var1) {
    RenderAnimation var2 = (RenderAnimation) DummyClass14.aClass93_1955.get(
          var1);
      if (var2 == null) {
        byte[] var3 = TriChromaticImageCache.aClass153_1372.getBytes(32, var1);
        if (var0) {
          StringNode0.aByteArrayArrayArray2339 = null;
        }

        var2 = new RenderAnimation();
        if (var3 != null) {
          var2.method901(-1, new Buffer(var3));
        }

        var2.method899(96);
        DummyClass14.aClass93_1955.get((byte) -96, var2, var1);
        return var2;
      } else {
        return var2;
      }
  }

  public static void method142(boolean var0) {
    if (!var0) {
        StringNode0.aByteArrayArrayArray2339 = null;
      }

      DirectImageProducer.aClass93_2982.method1524(3);
  }

  public static void method143(int var0) {
    StringNode0.aClass94_2340 = null;
      StringNode0.anIntArray2338 = null;
      StringNode0.aClass94_2336 = null;
      if (var0 <= -16) {
        StringNode0.aByteArrayArrayArray2339 = null;
      }
  }

}
