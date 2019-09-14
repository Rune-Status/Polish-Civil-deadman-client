package com.jagex.runescape;

public final class WidgetUpdate extends SubNode {

  public static boolean aBoolean3594;
  public static GameString aClass94_3595 = GameString.create("(U0a )2 via: ");
  public static int anInt3600;
  public int anInt3596;
  public int anInt3597;
  public int anInt3598;
  public GameString text;


  public WidgetUpdate(int var1, int var2 ) {
    this.key = (long) var1 << 32 | var2;
  }

  public void createIndexedColorSprite(boolean var1 ) {
    this.subnodeKey = Time.getCurrentTimeMillis() - -500L | Long.MIN_VALUE & this.subnodeKey;
      if (!var1) {
        WidgetUpdate.f(-42);
      }

      DummyClass50.aClass13_1139.addLast(this);
  }

  public long b(boolean var1 ) {
    if (!var1) {
        this.e(90);
      }

      return this.subnodeKey & Long.MAX_VALUE;
  }

  public int e(int var1 ) {
    if (var1 != 2063817568) {
        this.anInt3598 = -47;
      }

      return (int) (255L & this.key >>> 32);
  }

  public int f(byte var1 ) {
    int var2 = -88 / ((var1 - 83) / 34);
      return (int) this.key;
  }

  public void g(byte var1 ) {
    this.subnodeKey |= Long.MIN_VALUE;
      if (~this.b(true) == -1L) {
        SomethingTilek.aClass13_1666.addLast(this);
      }

      if (var1 != 33) {
        WidgetUpdate.anInt3600 = 3;
      }
  }

  public static void d(int var0) {
    if (~NpcConfiguration.anInt1252 != 0 && ~VariableUpdate.anInt2293 != 0) {
        int var1 =
          (DummyClass8.anInt4020 * (-DummyClass21.anInt1759 + AbstractTextureSampler.anInt2383)
            >> 16) + DummyClass21.anInt1759;
        float[] var3 = new float[3];
        DummyClass8.anInt4020 += var1;
        if ((DummyClass8.anInt4020 >= 65536 -1)) {
          DummyClass8.anInt4020 = '\uffff';
          SomethingQuickChat2.aBoolean3531 = !GroundItemNode.aBoolean3668;

          GroundItemNode.aBoolean3668 = true;
        } else {
          GroundItemNode.aBoolean3668 = false;
          SomethingQuickChat2.aBoolean3531 = false;
        }

        if (var0 == '\uffff') {
          float var2 = DummyClass8.anInt4020 / 65535.0F;
          int var4 = FileCacheRequester.anInt1081 * 2;

          int var6;
          int var7;
          int var8;
          int var9;
          int var10;
          int var11;
          int var12;
          for (int var5 = 0; ~var5 > -4; ++var5) {
            var8 =
              (DummyClass43.anIntArrayArrayArray911[NpcConfiguration.anInt1252][var4 - -2][var5]
                + -DummyClass43.anIntArrayArrayArray911[NpcConfiguration.anInt1252][var4 - -3][var5]
                - -DummyClass43.anIntArrayArrayArray911[NpcConfiguration.anInt1252][var4
                - -2][var5]) * 3;
            var9 = DummyClass43.anIntArrayArrayArray911[NpcConfiguration.anInt1252][var4][var5];
            var7 =
              3 * DummyClass43.anIntArrayArrayArray911[NpcConfiguration.anInt1252][var4 + 1][var5];
            var6 = 3 * DummyClass43.anIntArrayArrayArray911[NpcConfiguration.anInt1252][var4][var5];
            var10 = -var6 + var7;
            var11 = var8 + -(var7 * 2) + var6;
            var12 = DummyClass43.anIntArrayArrayArray911[NpcConfiguration.anInt1252][2 + var4][var5]
              + -var9 - -var7 - var8;
            var3[var5] =
              var9 + ((var12 * var2 + var11) * var2 + var10) * var2;
          }

          EnumStringFetcher.anInt2162 = -1 * (int) var3[1];
          NPC.anInt3995 = (int) var3[0] + -(128 * WorldMapLabel.anInt1716);
          DummyClass49.anInt1111 = (int) var3[2] + -(ProceduralTexture.anInt1152 * 128);
          float[] var16 = new float[3];
          var6 = DummyClass37.anInt670 * 2;

          for (var7 = 0; ~var7 > -4; ++var7) {
            var8 = DummyClass43.anIntArrayArrayArray911[VariableUpdate.anInt2293][var6][var7] * 3;
            var10 = (DummyClass43.anIntArrayArrayArray911[VariableUpdate.anInt2293][2 + var6][var7]
              - DummyClass43.anIntArrayArrayArray911[VariableUpdate.anInt2293][3 + var6][var7]
              + DummyClass43.anIntArrayArrayArray911[VariableUpdate.anInt2293][var6 - -2][var7])
              * 3;
            var11 = DummyClass43.anIntArrayArrayArray911[VariableUpdate.anInt2293][var6][var7];
            var9 =
              DummyClass43.anIntArrayArrayArray911[VariableUpdate.anInt2293][1 + var6][var7] * 3;
            var12 = var9 + -var8;
            int var13 = var10 + var8 + -(2 * var9);
            int var14 = -var10 + DummyClass43.anIntArrayArrayArray911[VariableUpdate.anInt2293][var6
              - -2][var7] + -var11 + var9;
            var16[var7] = var11 + var2 * (var2 * (var2 * var14 + var13)
              + var12);
          }

          float var17 = -var3[0] + var16[0];
          float var19 = var16[2] - var3[2];
          float var18 = (-var3[1] + var16[1]) * -1.0F;
          double var20 = Math.sqrt(var19 * var19 + var17 * var17);
          DummyClass52.aFloat1169 = (float) Math.atan2(var18, var20);
          DummyClass38.aFloat730 = -((float) Math.atan2(var17, var19));
          DummyClass17.anInt1823 = 2047 & (int) (325.949D * DummyClass52.aFloat1169);
          TextureSampler28.anInt3315 = 2047 & (int) (DummyClass38.aFloat730 * 325.949D);
        }
      }
  }

  public static AbstractIndexedColorSprite createIndexedColorSprite(
      FileUnpacker var1, int fileId) {
    return !GroundItem.loadSprites(var1, fileId) ?
        null :
        (SomethingIndex150.createIndexedColorSprite());
  }

  public static MapScene c(int var0, int var1) {
    MapScene var2 = (MapScene) TextureSampler25.aClass93_3412.get(var0);
      if (var2 != null) {
        return var2;
      } else {
        byte[] var3 = ScriptState.configs.getBytes(34, var0);
        if (var1 != 0) {
          WidgetUpdate.aClass94_3595 = null;
        }

        var2 = new MapScene();
        if (var3 != null) {
          var2.method74((byte) -115, new Buffer(var3), var0);
        }

        TextureSampler25.aClass93_3412.get((byte) -86, var2, var0);
        return var2;
      }
  }

  public static String createIndexedColorSprite(String var0, String var1, int var2, String var3) {
    for (int var4 = var3.indexOf(var0);
        ~var4 != 0; var4 = var3.indexOf(var0, var4 + var1.length())) {
      var3 = var3.substring(0, var4) + var1 + var3.substring(var0.length() + var4);
    }

    return var3;
  }

  public static void createIndexedColorSprite(int var0, int var1, int var2, Widget var3) {
    if (DummyClass42.aClass11_886 == null && !DummyClass36.aBoolean2615) {
        if (var2 < 61) {
          WidgetUpdate.createIndexedColorSprite(19, 20, -32, null);
        }

        if (var3 != null && GZipDecompressor.method1122(0, var3) != null) {
          DummyClass42.aClass11_886 = var3;
          DummyClass18.aClass11_88 = GZipDecompressor.method1122(0, var3);
          BufferObject.anInt1881 = var1;
          NPC.aBoolean3975 = false;
          SomethingTexture3.anInt2658 = 0;
          DummyClass53.anInt1336 = var0;
        }
      }
  }

  public static void createIndexedColorSprite(int var0, int var1, int var2, int var3,
                                             GameString var4, long var5, int var7) {
    Buffer var8 = new Buffer(128);
      var8.writeByte(10);
      var8.writeShort((int) (Math.random() * 99999.0D));
      var8.writeShort(530);
      var8.writeLong(var5);
      var8.writeInt((int) (Math.random() * 9.9999999E7D));
      var8.writeString(var4);
      var8.writeInt((int) (Math.random() * 9.9999999E7D));
      var8.writeShort(MonoChromaticImageBuffer.affiliateId);
      var8.writeByte(var0);
      var8.writeByte(var3);
      if (var1 != 10603) {
        WidgetUpdate.h((byte) -43);
      }

      var8.writeInt((int) (Math.random() * 9.9999999E7D));
      var8.writeShort(var7);
      var8.writeShort(var2);
      var8.writeInt((int) (9.9999999E7D * Math.random()));
      var8.encipherRSA(RSAConfiguration.PUBLIC_EXPONENT, RSAConfiguration.MODULUS);
      TextureSampler12.secureBuffer.position = 0;
      TextureSampler12.secureBuffer.writeByte(36);
      TextureSampler12.secureBuffer.writeByte(var8.position);
      TextureSampler12.secureBuffer.write(var8.bytes, 0, var8.position);
      HashTable.anInt1711 = -3;
      DummyCanvas.anInt23 = 1;
      DummyClass22.anInt1734 = 0;
      SpotAnimationConfig.anInt548 = 0;
  }

  public static void f(int var0) {
    if (var0 == 3) {
        WidgetUpdate.aClass94_3595 = null;
      }
  }

  public static void h(byte var0) {
    MonoChromaticImageCache.aClass93_1569.method1523((byte) -109);
      if (var0 != 3) {
        WidgetUpdate.aBoolean3594 = false;
      }

      SomethingVolume15.aClass93_2428.method1523((byte) -123);
      Cache.aClass93_743.method1523((byte) -106);
  }

}
