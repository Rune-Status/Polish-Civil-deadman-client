package com.jagex.runescape;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.node.Node;

public final class MonoChromaticImageBuffer extends Node {

  public static int affiliateId;
  public static int anInt2556;
  public static Deque aClass61_2557 = new Deque();
  public static boolean tweening;
  public static int[] anIntArray2559 = {0, 1, 2, 3, 4, 5, 6, 14};
  public static AbstractDirectColorSprite aClass3_Sub28_Sub16_2560;
  public static int anInt2561 = -1;
  public static GameString aClass94_2562 = GameStringStatics.create("<col=ffffff>");
  public static AudioStreamEncoder2 aClass3_Sub24_Sub2_2563;
  public int anInt2553;
  public int anInt2555;


  public MonoChromaticImageBuffer(int var1, int var2 ) {
    this.anInt2555 = var2;
      this.anInt2553 = var1;
  }

  public static void method511(byte var0) {
    int var1 = -59 / ((var0 - 67) / 36);
      MonoChromaticImageBuffer.aClass3_Sub28_Sub16_2560 = null;
      MonoChromaticImageBuffer.anIntArray2559 = null;
      MonoChromaticImageBuffer.aClass94_2562 = null;
      MonoChromaticImageBuffer.aClass61_2557 = null;
      MonoChromaticImageBuffer.aClass3_Sub24_Sub2_2563 = null;
  }

  public static void method512(byte var0) {
    ObjectNode.aClass93_4043.method1524(3);
      ClientScriptCall.aClass93_2442.method1524(3);
      DummyClass14.aClass93_1964.method1524(3);
      if (var0 != -108) {
        MonoChromaticImageBuffer.aClass3_Sub24_Sub2_2563 = null;
      }
  }

  public static int method513(int var0, int var1) {
    int var2 = 0;
      if ((var0 < 0) || (var0 >= 65536)) {
        var2 += 16;
        var0 >>>= 16;
      }

      if (var0 >= 256) {
        var2 += 8;
        var0 >>>= 8;
      }

      if (var0 >= 16) {
        var2 += 4;
        var0 >>>= 4;
      }

      if (var1 <= var0) {
        var0 >>>= 2;
        var2 += 2;
      }

      if ((var0 >= 1)) {
        var0 >>>= 1;
        ++var2;
      }

      return var0 + var2;
  }

  public static int method514(int var0, int var1, byte var2, int var3) {
    var0 &= 3;
      if (var2 >= -66) {
        MonoChromaticImageBuffer.method513(-92, 76);
      }

      return (var0 == 0) ? var1 : (var0 == 1
          ? var3 : (var0 != 2 ? -var3 + 1023 : 1023 - var1));
  }

}
