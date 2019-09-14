package com.jagex.runescape;

public final class DummyClass49 {

  public static GameString aClass94_1110 = GameString.create("Attaquer");
  public static int anInt1111;
  public static PlayerAppearance aClass52_1112 = new PlayerAppearance();


  public static SoftwareIndexedColorSprite method1364(byte var0) {
    try {
      SoftwareIndexedColorSprite var1 =
        new SoftwareIndexedColorSprite(SomethingVolume15.anInt2426, SomethingPacket116.anInt1748,
          Something3dRoot.anIntArray2048[0], Buffer.anIntArray2591[0], GroundItem.anIntArray2931[0],
          TextureSampler26.anIntArray3076[0], DummyClass5.aByteArrayArray2987[0],
          TextureSampler38.anIntArray3446);
      if (var0 <= 55) {
        DummyClass49.method1366(86, -88);
      }

      DummyClass37.method1035((byte) 127);
      return var1;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "kh.B(" + var0 + ')');
    }
  }

  public static void method1365(int var0) {
    try {
      DummyClass49.aClass52_1112 = null;
      DummyClass49.aClass94_1110 = null;
      if (var0 <= 96) {
        DummyClass49.anInt1111 = 55;
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "kh.E(" + var0 + ')');
    }
  }

  public static void method1366(int var0, int var1) {
    try {
      if (var0 != 104) {
        DummyClass49.method1367(114, 95, -80, (byte) -90, -2, 56);
      }

      DirectImageProducer.aClass93_2982.method1522(var0 ^ -22, var1);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "kh.C(" + var0 + ',' + var1 + ')');
    }
  }

  public static void method1367(int var0, int var1, int var2, byte var3, int var4, int var5) {
    try {
      TextureSampler18.method282(DummyClass35.anIntArrayArray663[var2++], var5, 92, var1, var0);
      TextureSampler18.method282(DummyClass35.anIntArrayArray663[var4--], var5, 97, var1, var0);
      if (var3 >= 23) {
        for (int var6 = var2; ~var6 >= ~var4; ++var6) {
          int[] var7 = DummyClass35.anIntArrayArray663[var6];
          var7[var5] = var7[var1] = var0;
        }

      }
    } catch (RuntimeException var8) {
      throw AbstractGameWorld.cascadeException(var8,
        "kh.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
    }
  }

  public static void method1368(int var0) {
    try {
      ++DummyClass4.anInt3001;
      int var1 = -126 / ((-26 - var0) / 52);
      TextureSampler12.secureBuffer.writePacket(104);
      TextureSampler12.secureBuffer.writeLong(0L);
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "kh.D(" + var0 + ')');
    }
  }

}
