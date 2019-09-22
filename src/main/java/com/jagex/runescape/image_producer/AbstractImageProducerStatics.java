package com.jagex.runescape.image_producer;

public class AbstractImageProducerStatics {

  public static int anInt1094;
  public static int[] anIntArray1097;
  public static int[] anIntArray1098;
  public static int anInt1092;
  public static int anInt1093;
  public static int anInt1095;
  public static int anInt1096;
  public static int anInt1099;
  public static int[] anIntArray1100;

  public static void method1310() {
    AbstractImageProducerStatics.anIntArray1097 = null;
    AbstractImageProducerStatics.anIntArray1098 = null;
  }

  public static void method1319(int[] var0, int var1, int var2) {
    anIntArray1100 = var0;
    AbstractImageProducerStatics.anInt1092 = var1;
    AbstractImageProducerStatics.anInt1094 = var2;
    AbstractImageProducerStatics.method1324(0, 0, var1, var2);
  }

  public static void method1324(int var0, int var1, int var2, int var3) {
    if (var0 < 0) {
      var0 = 0;
    }

    if (var1 < 0) {
      var1 = 0;
    }

    if (var2 > AbstractImageProducerStatics.anInt1092) {
      var2 = AbstractImageProducerStatics.anInt1092;
    }

    if (var3 > AbstractImageProducerStatics.anInt1094) {
      var3 = AbstractImageProducerStatics.anInt1094;
    }

    AbstractImageProducerStatics.anInt1093 = var0;
    AbstractImageProducerStatics.anInt1095 = var1;
    AbstractImageProducerStatics.anInt1096 = var2;
    AbstractImageProducerStatics.anInt1099 = var3;
    AbstractImageProducerStatics.method1310();
  }
}
