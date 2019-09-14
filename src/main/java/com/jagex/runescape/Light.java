package com.jagex.runescape;

import com.jagex.runescape.opengl.GlDirectColorSprite;
import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.GlTexture2d;
import com.jagex.runescape.opengl.SomethingLight;

public final class Light {

  private static GameString aClass94_695 = GameString.create("Unable to find ");
  public static int anInt692;
  public static GameString aClass94_699 = GameString.create("clignotant3:");
  public static GameString aClass94_700 = GameString.create("blaugr-Un:");
  public static GameString aClass94_701 =
    GameString.create("Chargement de la liste des serveurs");
  public static int anInt715;
  public static int anInt716;
  public static GameString aClass94_691 = Light.aClass94_695;
  public boolean aBoolean690;
  public boolean aBoolean696;
  public int anInt697;
  public int anInt698;
  public int anInt703;
  public int anInt704;
  public int anInt705;
  public short[] aShortArray706;
  public float aFloat707;
  public int anInt708;
  public float aFloat710;
  public boolean aBoolean711;
  public SomethingLight aClass37_712;
  public int color;
  public float[] colors = new float[4];
  private int anInt693;
  private int anInt694;
  private int anInt702;
  private int anInt709;
  private int anInt714;

  protected Light() {
    if (TextureSampler16.anIntArray3107 == null) {
        DummyClass38.method1083((byte) -90);
      }

      this.method1064(3);
  }

  public Light(Buffer var1 ) {
    if (TextureSampler16.anIntArray3107 == null) {
        DummyClass38.method1083((byte) -94);
      }

      this.anInt704 = var1.readUnsignedByte();
      this.aBoolean690 = ((this.anInt704 & 16) != 1 -1);
      this.aBoolean711 = ((this.anInt704 & 8) != 1 -1);
      this.anInt704 &= 7;
      this.anInt703 = var1.readUnsignedShort();
      this.anInt708 = var1.readUnsignedShort();
      this.anInt697 = var1.readUnsignedShort();
      this.anInt698 = var1.readUnsignedByte();
      this.method1061(66);
      this.aShortArray706 = new short[this.anInt698 * 2 + 1];

      int var2;
      for (var2 = 0; var2 < this.aShortArray706.length; ++var2) {
        this.aShortArray706[var2] = (short) var1.readUnsignedShort();
      }

      this.color = DummyClass40.hslTable[var1.readUnsignedShort()];
      var2 = var1.readUnsignedByte();
      this.anInt714 = 1792 & var2 << 3;
      this.anInt705 = var2 & 31;
      if (this.anInt705 != 31) {
        this.method1064(3);
      }
  }

  public void method1060(byte var1, int var2, int var3, int var4, int var5 ) {
    this.anInt694 = var2;
      this.anInt702 = var4;
      this.anInt693 = var5;
      int var6 = -4 % ((var1 - 7) / 62);
      this.anInt709 = var3;
  }

  private void method1061(int var1) {
    int var2 = (this.anInt698 << 7) - -64;
      this.aFloat710 = 1.0F / (var2 * var2);
      int var3 = 9 % ((9 - var1) / 57);
  }

  public void method1063(boolean var1, int var2, int var3 ) {
    if (var3 != -3696) {
        Light.method1058(-127, -32, -68, -32, (byte) -77);
      }

      int var5 = this.anInt714 + var2 * this.anInt709 / 50 & 2047;
      int var6 = this.anInt694;
      int var4;
      if (var6 == 1) {
        var4 = 1024 - -(DummyClass40.SINE_TABLE[var5] >> 6);
      } else if (var6 != 3) {
        if (var6 == 4) {
          var4 = var5 >> 10 << 11;
        } else if ((var6 != 3 -1)) {
          if ((var6 == 6 -1)) {
            var4 = (var5 < 1024 ? var5 : 2048 - var5) << 1;
          } else {
            var4 = 2048;
          }
        } else {
          var4 = var5;
        }
      } else {
        var4 = TextureSampler16.anIntArray3107[var5] >> 1;
      }

      if (var1) {
        var4 = 2048;
      }

      this.aFloat707 = (this.anInt693 + (var4 * this.anInt702 >> 11)) / 2048.0F;
      float var8 = this.aFloat707 / 255.0F;
      this.colors[0] = (ClientScript.bitAnd(this.color, 16771365) >> 16) * var8;
      this.colors[2] = var8 * ClientScript.bitAnd(255, this.color);
      this.colors[1] = (ClientScript.bitAnd(this.color, '\uffe7') >> 8) * var8;
  }

  private void method1064(int var1) {
    int var2 = this.anInt705;
      if (var2 == 2) {
        this.anInt702 = 2048;
        this.anInt693 = 0;
        this.anInt694 = 1;
        this.anInt709 = 2048;
      } else {
        if ((var2 == 4 -1)) {
          this.anInt693 = 0;
          this.anInt709 = 4096;
          this.anInt694 = 1;
          this.anInt702 = 2048;
        } else if ((var2 != 5 -1)) {
          if ((var2 == 6 -1)) {
            this.anInt694 = 4;
            this.anInt702 = 2048;
            this.anInt709 = 8192;
            this.anInt693 = 0;
          } else if ((var2 != 13 -1)) {
            if (var2 == 13) {
              this.anInt709 = 8192;
              this.anInt702 = 2048;
              this.anInt694 = 2;
              this.anInt693 = 0;
            } else if ((var2 != 11 -1)) {
              if (var2 == 11) {
                this.anInt694 = 3;
                this.anInt709 = 4096;
                this.anInt702 = 512;
                this.anInt693 = 1536;
              } else if ((var2 != 7 -1)) {
                if ((var2 == 8 -1)) {
                  this.anInt702 = 768;
                  this.anInt693 = 1280;
                  this.anInt709 = 4096;
                  this.anInt694 = 3;
                } else if ((var2 == 9 -1)) {
                  this.anInt709 = 2048;
                  this.anInt694 = 3;
                  this.anInt702 = 1024;
                  this.anInt693 = 1024;
                } else if (var2 == 9) {
                  this.anInt709 = 4096;
                  this.anInt693 = 1024;
                  this.anInt702 = 1024;
                  this.anInt694 = 3;
                } else if ((var2 != 15 -1)) {
                  if ((var2 == 16 -1)) {
                    this.anInt702 = 512;
                    this.anInt709 = 4096;
                    this.anInt693 = 1536;
                    this.anInt694 = 1;
                  } else if ((var2 != 17 -1)) {
                    this.anInt709 = 2048;
                    this.anInt693 = 0;
                    this.anInt702 = 2048;
                    this.anInt694 = 0;
                  } else {
                    this.anInt709 = 8192;
                    this.anInt693 = 1792;
                    this.anInt694 = 1;
                    this.anInt702 = 256;
                  }
                } else {
                  this.anInt709 = 2048;
                  this.anInt693 = 1280;
                  this.anInt694 = 1;
                  this.anInt702 = 768;
                }
              } else {
                this.anInt702 = 768;
                this.anInt693 = 1280;
                this.anInt694 = 3;
                this.anInt709 = 2048;
              }
            } else {
              this.anInt702 = 512;
              this.anInt694 = 3;
              this.anInt693 = 1536;
              this.anInt709 = 2048;
            }
          } else {
            this.anInt702 = 2048;
            this.anInt694 = 2;
            this.anInt709 = 2048;
            this.anInt693 = 0;
          }
        } else {
          this.anInt693 = 0;
          this.anInt702 = 2048;
          this.anInt694 = 4;
          this.anInt709 = 2048;
        }
      }

      if (var1 != 3) {
        this.anInt714 = -84;
      }
  }

  public static void method1058(int var0, int var1, int var2, int var3, byte var4) {
    int var5 = 25 % ((25 - var4) / 52);
      if (((var1 + -var0) >= DummyClass55.anInt1425) && GlTexture2d.anInt3765 >= var0 + var1
        && var3 + -var0 >= DummyClass13.anInt2020 && LightIntensity.anInt902 >= var0 + var3) {
        IdentityKit.method949(var1, (byte) 118, var0, var2, var3);
      } else {
        GZipDecompressor.method1129(var2, var3, var0, 0, var1);
      }
  }

  public static void method1059(byte var0) {
    Light.aClass94_695 = null;
      Light.aClass94_701 = null;
      Light.aClass94_699 = null;
      Light.aClass94_691 = null;
      if (var0 == -2) {
        Light.aClass94_700 = null;
      }
  }

  public static AbstractDirectColorSprite method1062(int var0) {
    byte[] var2 = DummyClass5.aByteArrayArray2987[0];
      int var1 = GroundItem.anIntArray2931[0] * TextureSampler26.anIntArray3076[0];
      int[] var3 = new int[var1];
      if (var0 < 70) {
        Light.method1062(67);
      }

      for (int var4 = 0; var1 > var4; ++var4) {
        var3[var4] = TextureSampler38.anIntArray3446[ClientScript.bitAnd(var2[var4], 255)];
      }

      AbstractDirectColorSprite var6;
      if (GlRenderer.useOpenGlRenderer) {
        var6 = new GlDirectColorSprite(SomethingVolume15.anInt2426,
            SomethingPacket116.anInt1748,
            Something3dRoot.anIntArray2048[0], Buffer.anIntArray2591[0],
            GroundItem.anIntArray2931[0],
            TextureSampler26.anIntArray3076[0], var3);
      } else {
        var6 =
            new SoftwareDirectColorSprite(SomethingVolume15.anInt2426,
                SomethingPacket116.anInt1748,
                Something3dRoot.anIntArray2048[0], Buffer.anIntArray2591[0],
                GroundItem.anIntArray2931[0],
                TextureSampler26.anIntArray3076[0], var3);
      }

      DummyClass37.method1035((byte) 111);
      return var6;
  }

  public static void executeScript(ClientScriptCall var1) {
    ItemConfig.callScript((byte) -93, 200000, var1);
  }

}
