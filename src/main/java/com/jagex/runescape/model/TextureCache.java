package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.cache.FileUnpacker;
import com.jagex.runescape.opengl.GLStatics;
import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.GlTexture2d;
import com.jagex.runescape.opengl.Texture;
import com.jagex.runescape.statics.GlobalStatics_9;

public final class TextureCache implements ITextureCache {

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
      if (GlRenderer.USE_OPENGL) {
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
          this.aBooleanArray2124[var8] = var6.readUnsignedByte() == 1;
        }
      }

      for (var8 = 0; var8 < amountMaterials; ++var8) {
        if (this.materialActive[var8]) {
          this.aBooleanArray2128[var8] = var6.readUnsignedByte() == 1;
        }
      }

      for (var8 = 0; var8 < amountMaterials; ++var8) {
        if (this.materialActive[var8]) {
          this.aBooleanArray2122[var8] = var6.readUnsignedByte() == 1;
        }
      }

      for (var8 = 0; var8 < amountMaterials; ++var8) {
        if (this.materialActive[var8]) {
          this.aBooleanArray2135[var8] = var6.readUnsignedByte() == 1;
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

      for (var8 = 0; var8 < amountMaterials; ++var8) {
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
    GLStatics.method551(255 & this.aByteArray2143[var1],
          this.aByteArray2144[var1] & 255);
      if (var2) {
        boolean var3 = false;
        Texture var4 = this.getConfig(var1, 1);
        if (var4 != null) {
          var3 = var4.method719(this.sprites, this,
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
        GlobalStatics_9.method1614(false, null, null);
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
    return var1 >= -97 || this.aBoolean2134 || this.aBooleanArray2122[var2];
  }

  public int method15(int var1, int var2) {
    if (var2 != 0xffff) {
        this.method11(-82, -17);
      }

      return 0xffff & this.textureColors[var1];
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
        GlobalStatics_9.method1612(-48);
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
        var4 = new GlTexture2d(this.textureColors[textureId] & 0xffff);
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
        GlobalStatics_9.localPlayer = null;
      }

      this.cacheSize = var1;
      this.aClass47_2142 = new Cache(this.cacheSize);
      if (GlRenderer.USE_OPENGL) {
        this.glTextures = new Cache(this.cacheSize);
      } else {
        this.glTextures = null;
      }
  }

}
