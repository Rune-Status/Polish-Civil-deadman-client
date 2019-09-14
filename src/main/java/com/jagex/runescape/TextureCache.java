package com.jagex.runescape;

import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.GlTexture2d;
import com.jagex.runescape.opengl.Texture;

public final class TextureCache implements ITextureCache {

  public static int[] anIntArray2125;
  public static int anInt2130;
  public static SoundEffect[] aClass135Array2131 = new SoundEffect[50];
  public static GameString aClass94_2132 = GameString.create("Titelbild ge-Offnet)3");
  public static int anInt2136;
  public static SoftwareDirectColorSprite[] aClass3_Sub28_Sub16_Sub2Array2140;
  public static Player localPlayer;
  private final boolean[] aBooleanArray2122;
  private final FileUnpacker sprites;
  private final boolean[] aBooleanArray2124;
  private final byte[] aByteArray2126;
  private final FileUnpacker textures;
  private boolean[] aBooleanArray2128;
  private final byte[] aByteArray2129;
  private final boolean[] materialActive;
  private boolean aBoolean2134;
  private final boolean[] aBooleanArray2135;
  private final short[] textureColors;
  private Cache glTextures;
  private int cacheSize = 50;
  private Cache aClass47_2142;
  private final byte[] aByteArray2143;
  private final byte[] aByteArray2144;


  public TextureCache(FileUnpacker textures, FileUnpacker materials,
      FileUnpacker sprites,
      int var4,
      boolean var5 ) {
    this.sprites = sprites;
      this.aBoolean2134 = var5;
      this.cacheSize = var4;
      this.textures = textures;
      this.aClass47_2142 = new Cache(this.cacheSize);
      if (GlRenderer.useOpenGlRenderer) {
        this.glTextures = new Cache(this.cacheSize);
      } else {
        this.glTextures = null;
      }

      Buffer var6 = new Buffer(materials.getBytes(0, 0));
      int amountMaterials = var6.readUnsignedShort();
      this.aByteArray2143 = new byte[amountMaterials];
      this.aByteArray2129 = new byte[amountMaterials];
      this.aByteArray2126 = new byte[amountMaterials];
      this.textureColors = new short[amountMaterials];
      this.aByteArray2144 = new byte[amountMaterials];
      this.aBooleanArray2128 = new boolean[amountMaterials];
      this.aBooleanArray2122 = new boolean[amountMaterials];
      this.aBooleanArray2124 = new boolean[amountMaterials];
      this.materialActive = new boolean[amountMaterials];
      this.aBooleanArray2135 = new boolean[amountMaterials];

      int var8;
      for (var8 = 0; amountMaterials > var8; ++var8) {
        this.materialActive[var8] = var6.readUnsignedByte() == 1;
      }

      for (var8 = 0; amountMaterials > var8; ++var8) {
        if (this.materialActive[var8]) {
          this.aBooleanArray2124[var8] = (var6.readUnsignedByte() == 1);
        }
      }

      for (var8 = 0; (var8 < amountMaterials); ++var8) {
        if (this.materialActive[var8]) {
          this.aBooleanArray2128[var8] = var6.readUnsignedByte() == 1;
        }
      }

      for (var8 = 0; (var8 < amountMaterials); ++var8) {
        if (this.materialActive[var8]) {
          this.aBooleanArray2122[var8] = (var6.readUnsignedByte() == 1);
        }
      }

      for (var8 = 0; var8 < amountMaterials; ++var8) {
        if (this.materialActive[var8]) {
          this.aBooleanArray2135[var8] = (var6.readUnsignedByte() == 1);
        }
      }

      for (var8 = 0; amountMaterials > var8; ++var8) {
        if (this.materialActive[var8]) {
          this.aByteArray2126[var8] = var6.readByte();
        }
      }

      for (var8 = 0; amountMaterials > var8; ++var8) {
        if (this.materialActive[var8]) {
          this.aByteArray2129[var8] = var6.readByte();
        }
      }

      for (var8 = 0; var8 < amountMaterials; ++var8) {
        if (this.materialActive[var8]) {
          this.aByteArray2144[var8] = var6.readByte();
        }
      }

      for (var8 = 0; (var8 < amountMaterials); ++var8) {
        if (this.materialActive[var8]) {
          this.aByteArray2143[var8] = var6.readByte();
        }
      }

      for (var8 = 0; amountMaterials > var8; ++var8) {
        if (this.materialActive[var8]) {
          this.textureColors[var8] = (short) var6.readUnsignedShort();
        }
      }
  }

  public void update(boolean var1, int cycle ) {
    if (!var1) {
        this.method7((byte) 113, 17);
      }

      for (Texture var3 = (Texture) this.aClass47_2142.method1094(0);
          var3 != null; var3 = (Texture) this.aClass47_2142.method1099(-1)) {
        if (var3.needsUpdate) {
          var3.update(cycle, (byte) -120);
          var3.needsUpdate = false;
        }
      }
  }

  private Texture getConfig(int var1, int var2) {
    if (var2 != 1) {
        this.aBooleanArray2128 = null;
      }

      Texture var3 = (Texture) this.aClass47_2142.get(var1, 1400);
      if (var3 != null) {
        return var3;
      } else {
        byte[] var4 = this.textures.getBytes(var1, 0);
        if (var4 != null) {
          Buffer var5 = new Buffer(var4);
          var3 = new Texture(var5);
          this.aClass47_2142.put(var1, var3);
          return var3;
        } else {
          return null;
        }
      }
  }

  public boolean method7(byte var1, int var2) {
    if (var1 != 88) {
        this.method19(-99, -37);
      }

      return this.aBooleanArray2128[var2];
  }

  public void initializeMaterial(int var1, boolean var2) {
    SomethingQuickChat.method551(0, 255 & this.aByteArray2143[var1],
          this.aByteArray2144[var1] & 255);
      if (var2) {
        boolean var3 = false;
        Texture var4 = this.getConfig(var1, 1);
        if (var4 != null) {
          var3 = var4.method719(this.sprites, this, 579100487,
              this.aBoolean2134 || this.aBooleanArray2122[var1]);
        }

        if (!var3) {
          GlTexture2d var6 = this.getTexture(var1);
          var6.initialize((byte) 6);
        }

      }
  }

  public int method9(int var1, boolean var2) {
    return var2 ? -63 : 255 & this.aByteArray2143[var1];
  }

  public int method10(int var1, int var2) {
    int var3 = -81 % ((var1 - 4) / 55);
      return this.aByteArray2126[var2] & 255;
  }

  public boolean method11(int var1, int var2) {
    if (var1 < 0) {
        this.method7((byte) 68, -47);
      }

      Texture var3 = this.getConfig(var2, 1);
      return var3 != null && var3.method722(-5, this, this.sprites);
  }

  public boolean method12(int var1, int var2) {
    if (var2 != -65) {
        TextureCache.method1614(false, null, null);
      }

      return this.aBooleanArray2135[var1];
  }

  public int[] method13(int var1, boolean var2, float var3) {
    Texture var4 = this.getConfig(var1, 1);
      if (var4 == null) {
        return null;
      } else {
        var4.needsUpdate = var2;
        return var4.method718(this, 0, var3, this.sprites,
            this.aBoolean2134 || this.aBooleanArray2122[var1]);
      }
  }

  public boolean method14(byte var1, int var2) {
    return var1 >= -97 || (this.aBoolean2134 || this.aBooleanArray2122[var2]);
  }

  public int method15(int var1, int var2) {
    if (var2 != '\uffff') {
        this.method11(-82, -17);
      }

      return '\uffff' & this.textureColors[var1];
  }

  public int[] method16(int var1, int var2) {
    if (var1 != 64) {
        this.method12(105, -92);
      }

      Texture var3 = this.getConfig(var2, 1);
      return var3 == null ?
        null :
        var3.method720(false, this.aBoolean2134 || this.aBooleanArray2122[var2], this,
            this.sprites);
  }

  public boolean method17(int var1, int var2) {
    int var3 = -8 / ((20 - var2) / 45);
      return this.aBooleanArray2124[var1];
  }

  public int method18(int var1, int var2) {
    if (var2 != 255) {
        TextureCache.method1612(-48);
      }

      return 255 & this.aByteArray2144[var1];
  }

  public int method19(int var1, int var2) {
    int var3 = -115 / ((-12 - var1) / 56);
      return 255 & this.aByteArray2129[var2];
  }

  private GlTexture2d getTexture(int textureId) {
    GlTexture2d var4 = (GlTexture2d) this.glTextures.get(textureId, 1400);
      if (var4 == null) {
        var4 = new GlTexture2d(this.textureColors[textureId] & '\uffff');
        this.glTextures.put(textureId, var4);
        return var4;
      } else {
        return var4;
      }
  }

  public void method1616(boolean var1, int var2 ) {
    this.aBoolean2134 = var1;
      this.method1618(0);
  }

  public void method1618(int var1 ) {
    this.aClass47_2142.method1101(2);
      if (var1 == 0) {
        if (this.glTextures != null) {
          this.glTextures.method1101(2);
        }

      }
  }

  public void method1619(int var1, int var2 ) {
    if (var2 != -1) {
        TextureCache.localPlayer = null;
      }

      this.cacheSize = var1;
      this.aClass47_2142 = new Cache(this.cacheSize);
      if (GlRenderer.useOpenGlRenderer) {
        this.glTextures = new Cache(this.cacheSize);
      } else {
        this.glTextures = null;
      }
  }

  public static void method1611(int var0, boolean var1) {
    int var2;
      NPC var3;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      for (var2 = 0; var2 < DummyClass6.anInt2046; ++var2) {
        var3 = TextureSampler5.npcs[AudioWorker.anIntArray347[var2]];
        if (var3 != null
            && var3.hasConfiguration((byte) 17) && !var3.config.aBoolean1263 != var1
          && var3.config.method1472((byte) 74)) {
          int var4 = var3.getSize();
          int var5;
          if (var4 != 1) {
            if ((((1 & var4) != 0) || ((127 & var3.anInt2819) == 0) &&
                (127 & var3.anInt2829) == 0)
              && ((var4 & 1) != 1 || ((127 & var3.anInt2819) == 64) && (127
                & var3.anInt2829) == 64)) {
              var5 = var3.anInt2819 - (var4 * 64) >> 7;
              var6 = -(var4 * 64) + var3.anInt2829 >> 7;
              var7 = var3.getSize() + var5;
              if ((var5 < 0)) {
                var5 = 0;
              }

              if ((var7 > 104)) {
                var7 = 104;
              }

              var8 = var6 + var3.getSize();
              if ((var6 < 0)) {
                var6 = 0;
              }

              if (var8 > 104) {
                var8 = 104;
              }

              for (var9 = var5; var7 > var9; ++var9) {
                for (var10 = var6; (var10 < var8); ++var10) {
                  ++DummyClass9.anIntArrayArray4010[var9][var10];
                }
              }
            }
          } else if (
              ((127 & var3.anInt2819) == 64) && (var3.anInt2829 & 127) == 64) {
            var5 = var3.anInt2819 >> 7;
            var6 = var3.anInt2829 >> 7;
            if ((var5 >= 0) && var5 < 104 && (var6 >= 0) && (var6 < 104)) {
              ++DummyClass9.anIntArrayArray4010[var5][var6];
            }
          }
        }
      }

      label200:
      for (var2 = 0; (var2 < DummyClass6.anInt2046); ++var2) {
        var3 = TextureSampler5.npcs[AudioWorker.anIntArray347[var2]];
        long var15 = (long) AudioWorker.anIntArray347[var2] << 32 | 536870912L;
        if (var3 != null && var3.hasConfiguration((byte) 17) && !var3.config.aBoolean1263 == !var1
          && var3.config.method1472((byte) 74)) {
          var6 = var3.getSize();
          if ((var6 != 1)) {
            if ((var6 & 1) == 0 && ((var3.anInt2819 & 127) == 0) &&
                ((127 & var3.anInt2829) == 0)
              || ((var6 & 1) == 1) && ((var3.anInt2819 & 127) == 64)
              && (127 & var3.anInt2829) == 64) {
              var7 = -(64 * var6) + var3.anInt2819 >> 7;
              var8 = -(var6 * 64) + var3.anInt2829 >> 7;
              var10 = var8 + var6;
              if (var8 < 0) {
                var8 = 0;
              }

              boolean var11 = true;
              var9 = var7 + var6;
              if ((var10 > 104)) {
                var10 = 104;
              }

              if ((var7 < 0)) {
                var7 = 0;
              }

              if ((var9 > 104)) {
                var9 = 104;
              }

              int var12;
              int var13;
              for (var12 = var7; var12 < var9; ++var12) {
                for (var13 = var8; (var13 < var10); ++var13) {
                  if ((DummyClass9.anIntArrayArray4010[var12][var13] <= 1)) {
                    var11 = false;
                    break;
                  }
                }
              }

              if (var11) {
                var12 = var7;

                while (true) {
                  if (var12 >= var9) {
                    continue label200;
                  }

                  for (var13 = var8; var13 < var10; ++var13) {
                    --DummyClass9.anIntArrayArray4010[var12][var13];
                  }

                  ++var12;
                }
              }
            }
          } else if ((127 & var3.anInt2819) == 64 && ((127 & var3.anInt2829) == 64)) {
            var7 = var3.anInt2819 >> 7;
            var8 = var3.anInt2829 >> 7;
            if (var7 < 0 || (var7 >= 104) || var8 < 0 || (var8 >= 104)) {
              continue;
            }

            if (DummyClass9.anIntArrayArray4010[var7][var8] > 1) {
              --DummyClass9.anIntArrayArray4010[var7][var8];
              continue;
            }
          }

          if (!var3.config.aBoolean1270) {
            var15 |= Long.MIN_VALUE;
          }

          var3.anInt2831 = BufferData.method1736(GameWorldSomething.currentPlane, 1, var3.anInt2819,
            var3.anInt2829);
          DummyClass29.addNodeToSceneGraph(GameWorldSomething.currentPlane, var3.anInt2819,
            var3.anInt2829, var3.anInt2831, -64 + 64 * var6 + 60, var3, var3.rotationY, var15,
            var3.aBoolean2810);
        }
      }

      var2 = -28 / ((var0 + 7) / 34);
  }

  public static void method1612(int var0) {
    TextureCache.localPlayer = null;
      if (var0 != -11565) {
        TextureCache.method1614(false, null, null);
      }

      TextureCache.anIntArray2125 = null;
      TextureCache.aClass94_2132 = null;
      TextureCache.aClass3_Sub28_Sub16_Sub2Array2140 = null;
      TextureCache.aClass135Array2131 = null;
  }

  public static void method1614(boolean var0, long[] var1, int[] var2) {
    AbstractGameWorld.method1069(var1, 0, -1 + var1.length, var2, -24337);
      if (!var0) {
        TextureCache.method1612(103);
      }
  }

  public static void method1617(int var0, int var1, int var2, int var3, int var4, byte var5) {
    if ((var4 <= LightIntensity.anInt902) && (var2 >= DummyClass13.anInt2020)) {
        boolean var6;
        if (DummyClass55.anInt1425 <= var1) {
          if (GlTexture2d.anInt3765 >= var1) {
            var6 = true;
          } else {
            var6 = false;
            var1 = GlTexture2d.anInt3765;
          }
        } else {
          var6 = false;
          var1 = DummyClass55.anInt1425;
        }

        boolean var7;
        if (var3 < DummyClass55.anInt1425) {
          var3 = DummyClass55.anInt1425;
          var7 = false;
        } else if (var3 > GlTexture2d.anInt3765) {
          var3 = GlTexture2d.anInt3765;
          var7 = false;
        } else {
          var7 = true;
        }

        if (DummyClass13.anInt2020 > var4) {
          var4 = DummyClass13.anInt2020;
        } else {
          TextureSampler18.method282(DummyClass35.anIntArrayArray663[var4++], var1, -66, var3,
            var0);
        }

        if (var2 <= LightIntensity.anInt902) {
          TextureSampler18.method282(DummyClass35.anIntArrayArray663[var2--], var1, -54, var3,
            var0);
        } else {
          var2 = LightIntensity.anInt902;
        }

        int var8;
        if (var6 && var7) {
          for (var8 = var4; var8 <= var2; ++var8) {
            int[] var9 = DummyClass35.anIntArrayArray663[var8];
            var9[var1] = var9[var3] = var0;
          }
        } else if (!var6) {
          if (var7) {
            for (var8 = var4; (var2 >= var8); ++var8) {
              DummyClass35.anIntArrayArray663[var8][var3] = var0;
            }
          }
        } else {
          for (var8 = var4; (var8 <= var2); ++var8) {
            DummyClass35.anIntArrayArray663[var8][var1] = var0;
          }
        }
      }
  }

}
