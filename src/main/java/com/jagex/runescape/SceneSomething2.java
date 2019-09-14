package com.jagex.runescape;

public final class SceneSomething2 {

  public static GameString[] aClass94Array1046 = new GameString[200];
  public static int windowHeight;
  public static double aDouble1050 = -1.0D;
  public static GameString aClass94_1051 = GameString.create("(Udns");
  public static int anInt1053;
  public static SomethingQuickChatK aClass10_1056;
  public static FileUnpacker fileUnpacker21;
  public static int anInt1060;
  public int positionZ;
  public long key;
  public SceneNode sceneNode0;
  public SceneNode sceneNode1;
  public int positionX;
  public int anInt1055;
  public int positionY;
  public int anInt1059;

  public static void method1284(byte var0) {
    if (var0 != -87) {
        SceneSomething2.aClass94Array1046 = null;
      }

      SceneSomething2.fileUnpacker21 = null;
      SceneSomething2.aClass94_1051 = null;
      SceneSomething2.aClass94Array1046 = null;
      SceneSomething2.aClass10_1056 = null;
  }

  public static void method1285(FileUnpacker var0, boolean var1, int var2, int var3, boolean var4,
                               int var5) {
    DummyClass55.aClass153_1423 = var0;
      SomethingQuickChatK.anInt154 = 1;
      TextureSampler36.anInt3423 = var5;
      DummyClass22.anInt1741 = var3;
      TextureSampler8.anInt3463 = var2;
      AreaSoundEffect.aBoolean2311 = var4;
      if (var1) {
        SceneSomething2.anInt1053 = 125;
      }

      SpotAnimationConfig.anInt546 = 10000;
  }

  public static void method1286(int var0, boolean var1, GameObjectConfig var2, int var3, NPC var4,
                               int var5, int var6, Player var7) {
    if (var1) {
        SceneSomething2.windowHeight = 94;
      }

      AreaSoundEffect var8 = new AreaSoundEffect();
      var8.anInt2308 = var0 * 128;
      var8.anInt2326 = 128 * var5;
      var8.anInt2314 = var6;
      if (var2 != null) {
        var8.anIntArray2333 = var2.anIntArray1539;
        var8.anInt2328 = var2.anInt1484 * 128;
        var8.anInt2325 = var2.anInt1515;
        var8.aClass111_2320 = var2;
        var8.anInt2332 = var2.anInt1512;
        var8.anInt2310 = var2.anInt1518;
        int var9 = var2.anInt1480;
        int var10 = var2.anInt1485;
        if (~var3 == -2 || var3 == 3) {
          var9 = var2.anInt1485;
          var10 = var2.anInt1480;
        }

        var8.anInt2307 = (var10 + var0) * 128;
        var8.anInt2321 = (var5 + var9) * 128;
        if (var2.anIntArray1524 != null) {
          var8.aBoolean2329 = true;
          var8.method134(1);
        }

        if (var8.anIntArray2333 != null) {
          var8.anInt2316 =
            var8.anInt2310 - -((int) (Math.random() * (-var8.anInt2310 + var8.anInt2325)));
        }

        Node.aClass61_78.addLast(var8);
      } else if (var4 != null) {
        var8.aClass140_Sub4_Sub2_2324 = var4;
        NpcConfiguration var12 = var4.config;
        if (var12.anIntArray1292 != null) {
          var8.aBoolean2329 = true;
          var12 = var12.method1471((byte) -112);
        }

        if (var12 != null) {
          var8.anInt2307 = 128 * (var12.size + var0);
          var8.anInt2321 = 128 * (var5 - -var12.size);
          var8.anInt2332 = ISAACCipher.method1232(var4, -1);
          var8.anInt2328 = 128 * var12.anInt1291;
        }

        SocketStream.aClass61_1242.addLast(var8);
      } else if (var7 != null) {
        var8.aClass140_Sub4_Sub1_2327 = var7;
        var8.anInt2321 = (var7.getSize() + var5) * 128;
        var8.anInt2307 = 128 * (var7.getSize() + var0);
        var8.anInt2332 = DummyClass50.method1398(0, var7);
        var8.anInt2328 = 128 * var7.anInt3969;
        ObjectNode.aClass130_4046.put(var7.name.toBase37(), var8);
      }
  }

  public static SoftwareFont method1287(int var0, int var1, FileUnpacker var2, FileUnpacker var3,
                                       int var4) {
    if (SomethingTexture4.loadSprites(var3, var1, var0, var4 ^ 30900)) {
        if (var4 != -1) {
          SceneSomething2.method1284((byte) -124);
        }

        return AbstractTextureSampler.method163(var2.getBytes(var0, var1), 25208);
      } else {
        return null;
      }
  }

}
