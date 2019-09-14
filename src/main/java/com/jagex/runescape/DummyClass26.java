package com.jagex.runescape;

import com.jagex.runescape.opengl.GlRenderer;

public final class DummyClass26 {

  private static GameString aClass94_1610 = GameString.create("Loaded wordpack");
  public static GameWorld[] aClass44_Sub1Array1609;
  public static int[] keyTable = {
    -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1,
    -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1,
    -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51,
    52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1,
    -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6,
    7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1
  };
  public static GameString aClass94_1612 = GameString.create("classement ");
  public static int[] anIntArray1613 = new int[500];
  public static GameString TRADE_REQUEST = GameString.create(":tradereq:");
  public static int anInt1616;
  public static GameString aClass94_1615 = DummyClass26.aClass94_1610;

  public static void setState(int var0, int var1) {
    if (DummyClass15.state != var0) {
        if ((DummyClass15.state == 0)) {
          ObjectCache.method1517((byte) -118);
        }

        if (var0 == 40) {
          IdentityKit.method951(0);
        }

        boolean var2 = var0 == 5 || var0 == 10 || var0 == 28;
        if (var0 != 40 && DummyClass8.aClass89_4012 != null) {
          DummyClass8.aClass89_4012.destroy();
          DummyClass8.aClass89_4012 = null;
        }

        if (var0 == 25 || var0 == 28) {
          DummyClass11.anInt2038 = 0;
          StringNode.anInt2579 = 1;
          DummyClass8.anInt4019 = 0;
          SomethingInScenePacket202.anInt2275 = 1;
          TextureSampler5.anInt3293 = 0;
          OndemandRequester.method1250(102, true);
        }

        if ((var0 == 25) || var0 == 10) {
          SomethingScene.method1293(true);
        }

        if ((var0 == 5)) {
          DummyClass58.loadTitleScreenSprites(Projectile.sprites, (byte) -111);
        } else {
          TextureSampler23.method247((byte) -121);
        }

        boolean var3 =
          var1 == DummyClass15.state || (DummyClass15.state == 10) ||
              (DummyClass15.state == 28);
        if (var3 == !var2) {
          if (var2) {
            AbstractFrameRegulator.anInt1691 = Keyboard.openingMusicFileId;
            if (BZipDecompressorState.anInt120 == 0) {
              Queue.method882(-1, 2);
            } else {
              AbstractFileRequester
                  .method2099(true, Keyboard.openingMusicFileId, 0,
                      SomethingTexture1.fileUnpacker6, false, 255, 2);
            }

            DummyClass43.ondemandRequester.writeStatus(false, true);
          } else {
            Queue.method882(-1, 2);
            DummyClass43.ondemandRequester.writeStatus(true, true);
          }
        }

        if (GlRenderer.useOpenGlRenderer && (var0 == 25 || var0 == 28 || (var0 == 40))) {
          GlRenderer.method1833();
        }

        DummyClass15.state = var0;
      }
  }

  public static void method1720(boolean var0, int var1) {
    AbstractFrameRegulator.anIntArray1695 = new int[104];
      HashTableIterator.anIntArray1138 = new int[104];
      DummyClass52.anInt1174 = 99;
      Mouse.anIntArray1920 = new int[104];
      byte var2;
      if (var0) {
        var2 = 1;
      } else {
        var2 = 4;
      }

      ObjectCache.tileOrientation = new byte[var2][104][104];
      IntegerNode.anIntArray2469 = new int[104];
      DummyClass36.anIntArrayArrayArray2609 = new int[var2][105][var1];
      MouseRecorder.aByteArrayArrayArray1014 = new byte[var2][105][105];
      DummyClass17.tileFloors = new byte[var2][104][104];
      SomethingPacket151.anIntArray2606 = new int[104];
      DummyClass18.aByteArrayArrayArray81 = new byte[var2][104][104];
      TextureSampler36.floorUnderlayIds = new byte[var2][104][104];
  }

  public static void method1721(boolean var0) {
    DummyClass26.aClass94_1610 = null;
      DummyClass26.keyTable = null;
      DummyClass26.aClass94_1612 = null;
      DummyClass26.TRADE_REQUEST = null;
      DummyClass26.aClass44_Sub1Array1609 = null;
      if (!var0) {
        DummyClass26.method1720(true, 30);
      }

      DummyClass26.anIntArray1613 = null;
      DummyClass26.aClass94_1615 = null;
  }

  public static SoftwareDirectColorSprite method1722(int var0) {
    int var1 = GroundItem.anIntArray2931[0] * TextureSampler26.anIntArray3076[0];
      byte[] var2 = DummyClass5.aByteArrayArray2987[0];
      int[] var3 = new int[var1];

      for (int var4 = 0; var1 > var4; ++var4) {
        var3[var4] = TextureSampler38.anIntArray3446[ClientScript.bitAnd(var2[var4], 255)];
      }

      SoftwareDirectColorSprite var6 =
        new SoftwareDirectColorSprite(SomethingVolume15.anInt2426, SomethingPacket116.anInt1748,
          Something3dRoot.anIntArray2048[0], Buffer.anIntArray2591[0], GroundItem.anIntArray2931[0],
          TextureSampler26.anIntArray3076[0], var3);
      DummyClass37.method1035((byte) 122);
      return var0 >= -51 ? null : var6;
  }

}
