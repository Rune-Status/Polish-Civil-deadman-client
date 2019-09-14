package com.jagex.runescape;

public final class TextureSampler31 extends AbstractTextureSampler {

  private static GameString aClass94_3170 = GameString.create("Loaded textures");
  public static int anInt3158 = -8 + (int) (17.0D * Math.random());
  public static FileCacheRequester fileCacheRequester;
  public static GameString UNDERSCORE = GameString.create("_");
  public static boolean aBoolean3166;
  public static GameString aClass94_3168 = GameString.create("cross");
  public static GameString aClass94_3169 = GameString.create("Lade Sprites )2 ");
  public static int[] anIntArray3171 = {0, 4, 4, 8, 0, 0, 8, 0, 0};
  public static GameString aClass94_3172 = GameString.create("Regarder dans cette direction");
  public static FileUnpacker aClass153_3173;
  public static GameString aClass94_3167 = TextureSampler31.aClass94_3170;
  private int anInt3160;
  private int anInt3163 = 20;
  private int anInt3164 = 1365;
  private int anInt3165;

  public TextureSampler31() {
    super(0, true);
  }

  public int[] method154(int var1, byte var2 ) {
    int var4 = -72 % ((30 - var2) / 36);
      int[] var3 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        for (int var5 = 0; SomethingLight0.anInt1559 > var5; ++var5) {
          int var7 = this.anInt3165
              + (DummyClass4.anIntArray2999[var1] << 12) / this.anInt3164;
          int var6 = this.anInt3160
              + (TextureCache.anIntArray2125[var5] << 12) / this.anInt3164;
          int var8 = var6;
          int var10 = var6;
          int var9 = var7;
          int var11 = var7;
          int var14 = 0;
          int var12 = var6 * var6 >> 12;

          for (int var13 = var7 * var7 >> 12;
               ((var12 - -var13) < 16385 -1) && this.anInt3163 > var14;
               var12 = var10 * var10 >> 12) {
            var11 = (var10 * var11 >> 12) * 2 + var9;
            ++var14;
            var10 = var12 + -var13 + var8;
            var13 = var11 * var11 >> 12;
          }

          var3[var5] = (var14 >= (this.anInt3163
              + -1)) ? 0 : (var14 << 12) / this.anInt3163;
        }
      }

      return var3;
  }

  public void parseConfig(int var1, Buffer var2, boolean var3 ) {
    if (!var3) {
        TextureSampler31.aClass94_3168 = null;
      }

      if ((var1 == 0)) {
        this.anInt3164 = var2.readUnsignedShort();
      } else {
        if ((var1 == 2 -1)) {
          this.anInt3163 = var2.readUnsignedShort();
        } else {
          if ((var1 == 3 -1)) {
            this.anInt3160 = var2.readUnsignedShort();
          } else {
            if (var1 == 3) {
              this.anInt3165 = var2.readUnsignedShort();
            }
          }
        }
      }
  }

  public static void method236(byte var0) {
    if (var0 == 64) {
        TextureSampler14.aBoolean3387 = true;
      }
  }

  public static void parseNpcUpdate() {
    OndemandRequester.anInt997 = 0;
      DummyClass17.anInt1829 = 0;
      IdentityKit.method945((byte) -11);
      DummyClass10.method2261(113);
      SomethingTexture4.method1349();

      int var1;
      for (var1 = 0; (var1 < DummyClass17.anInt1829); ++var1) {
        int var2 = VariableUpdate.anIntArray2292[var1];
        if ((TextureSampler5.npcs[var2].anInt2838 != AbstractGameWorld.updateCycle)) {
          if (TextureSampler5.npcs[var2].config.method1474(-1)) {
            ByteArrayNode.method574(TextureSampler5.npcs[var2], false);
          }

          TextureSampler5.npcs[var2].setConfiguration(-1, null);
          TextureSampler5.npcs[var2] = null;
        }
      }
      if (HashTable.packetLength == SpotAnimationConfig.gameBuffer.position) {
        for (var1 = 0; var1 < DummyClass6.anInt2046; ++var1) {
          if (TextureSampler5.npcs[AudioWorker.anIntArray347[var1]] == null) {
            throw new RuntimeException("gnp2 pos:" + var1 + " size:" + DummyClass6.anInt2046);
          }
        }

      } else {
        throw new RuntimeException("gnp1 pos:" + SpotAnimationConfig.gameBuffer.position + " psize:"
          + HashTable.packetLength);
      }
  }

  public static void method238(int var0) {
    if (var0 == 9423) {
        RSAConfiguration.PUBLIC_EXPONENT = null;
        TextureSampler31.aClass94_3169 = null;
        TextureSampler31.anIntArray3171 = null;
        TextureSampler31.fileCacheRequester = null;
        TextureSampler31.aClass153_3173 = null;
        TextureSampler31.aClass94_3168 = null;
        TextureSampler31.aClass94_3167 = null;
        TextureSampler31.UNDERSCORE = null;
        TextureSampler31.aClass94_3170 = null;
        TextureSampler31.aClass94_3172 = null;
      }
  }

}
