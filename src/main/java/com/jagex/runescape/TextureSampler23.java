package com.jagex.runescape;

import com.jagex.runescape.opengl.GlTexture2d;
import com.jagex.runescape.opengl.Texture;

public final class TextureSampler23 extends AbstractTextureSampler {

  public static boolean aBoolean3207;
  public static HashTable aClass130_3208 = new HashTable(8);
  public static GameString aClass94_3209 = GameString.create("showingVideoAd");
  public static FileUnpacker worldMaps;
  public static GameString aClass94_3211 = GameString.create(" <col=ffffff>");
  public static int[] anIntArray3212;
  public static int anInt3213 = 1;


  public TextureSampler23() {
    super(1, false);
  }

  private void method248(int var1, byte var2, int var3) {
    if (var2 > 80) {
        int var4 = TextureCache.anIntArray2125[var3];
        int var5 = DummyClass4.anIntArray2999[var1];
        float var6 = (float) Math.atan2(var4 - 2048, var5 - 2048);
        if (var6 >= -3.141592653589793D && var6 <= -2.356194490192345D) {
          VertexNormal.anInt828 = var1;
          DummyClass13.anInt2024 = var3;
        } else if (var6 <= -1.5707963267948966D && var6 >= -2.356194490192345D) {
          DummyClass13.anInt2024 = var1;
          VertexNormal.anInt828 = var3;
        } else if (var6 <= -0.7853981633974483D && var6 >= -1.5707963267948966D) {
          DummyClass13.anInt2024 = -var1 + SomethingLight0.anInt1559;
          VertexNormal.anInt828 = var3;
        } else if (var6 <= 0.0F && var6 >= -0.7853981633974483D) {
          DummyClass13.anInt2024 = var3;
          VertexNormal.anInt828 = DummyClass55.anInt1427 - var1;
        } else if (var6 >= 0.0F && var6 <= 0.7853981633974483D) {
          DummyClass13.anInt2024 = -var3 + SomethingLight0.anInt1559;
          VertexNormal.anInt828 = -var1 + DummyClass55.anInt1427;
        } else if (var6 >= 0.7853981633974483D && var6 <= 1.5707963267948966D) {
          DummyClass13.anInt2024 = -var1 + SomethingLight0.anInt1559;
          VertexNormal.anInt828 = -var3 + DummyClass55.anInt1427;
        } else if (var6 >= 1.5707963267948966D && var6 <= 2.356194490192345D) {
          VertexNormal.anInt828 = -var3 + DummyClass55.anInt1427;
          DummyClass13.anInt2024 = var1;
        } else if (var6 >= 2.356194490192345D && var6 <= 3.141592653589793D) {
          DummyClass13.anInt2024 = -var3 + SomethingLight0.anInt1559;
          VertexNormal.anInt828 = var1;
        }

        DummyClass13.anInt2024 &= RenderAnimation.anInt396;
        VertexNormal.anInt828 &= TriChromaticImageBuffer.anInt2487;
      }
  }

  public int[] method154(int var1, byte var2 ) {
    int var3 = -113 % ((30 - var2) / 36);
      int[] var4 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        for (int var5 = 0; var5 < SomethingLight0.anInt1559; ++var5) {
          this.method248(var1, (byte) 105, var5);
          int[] var6 = this.method152(0, VertexNormal.anInt828, 32755);
          var4[var5] = var6[DummyClass13.anInt2024];
        }
      }

      return var4;
  }

  public void parseConfig(int var1, Buffer var2, boolean var3 ) {
    if ((var1 == 0)) {
        this.monoChromatic = (var2.readUnsignedByte() == 2 -1);
      }

      if (!var3) {
        TextureSampler23.worldMaps = null;
      }
  }

  public int[][] method166(int var1, int var2 ) {
    if (var1 != -1) {
        this.method166(-38, 67);
      }

      int[][] var3 = this.triChromaticImageCache
          .method1594((byte) -125, var2);
      if (this.triChromaticImageCache.aBoolean1379) {
        int[] var4 = var3[0];
        int[] var6 = var3[2];
        int[] var5 = var3[1];

        for (int var7 = 0; SomethingLight0.anInt1559 > var7; ++var7) {
          this.method248(var2, (byte) 107, var7);
          int[][] var8 = this.method162(VertexNormal.anInt828, 0, (byte) -49);
          assert var8 != null;
          var4[var7] = var8[0][DummyClass13.anInt2024];
          var5[var7] = var8[1][DummyClass13.anInt2024];
          var6[var7] = var8[2][DummyClass13.anInt2024];
        }
      }

      return var3;
  }

  public static void method246(int var0) {
    Texture.method724(-109);
      GlTexture2d.method710((byte) 126);
      DummyClass58.method1654(var0 ^ -15455);
      DummyCanvas.method55(22683);
      DummyClass8.method2222((byte) 127);
      GameBuffer.method813(1974);
      SomethingPacket116.method1803((byte) 22);
      DummyClass35.method1025((byte) -93);
      DummyClass59.method1044(-3782);
      Node.method85((byte) -114);
      DirectImageProducer.method2192(-68);
      DummyClass13.method2196(128);
      VertexNormal.method1132(103);
      TextureSampler26.method196(false);
      if (var0 != 8) {
        TextureSampler23.method246(-120);
      }

      DummyClass27.method1714((byte) -6);
      WidgetUpdate.h((byte) 3);
      DummyClass56.method1650(21);
      Mouse.method2089((byte) 115);
      TextureSampler1.aClass93_3130.method1523((byte) -103);
      HashTableIterator.aClass93_1135.method1523((byte) -122);
  }

  public static void method247(byte var0) {
    int var1 = 105 % ((var0 - -39) / 41);
      if (StillGraphic.aBoolean2713) {
        AnimationSequence.logoSprite = null;
        StillGraphic.aBoolean2713 = false;
        DummyClass59.titlebackground = null;
      }
  }

  public static void method249(int var0) {
    TextureSampler23.anIntArray3212 = null;
      TextureSampler23.aClass94_3211 = null;
      TextureSampler23.aClass130_3208 = null;
      TextureSampler23.worldMaps = null;
      TextureSampler23.aClass94_3209 = null;
  }

  public static void method250(int var0, FileUnpacker var1) {
    if (var0 == 2048) {
        FileSystem.aClass153_105 = var1;
      }
  }

  public static int method251(int var0) {
    if (var0 != -1) {
        return 18;
      } else if (DummyClass25.aClass131_1624 == null) {
        return -1;
      } else {
        while ((SceneShadowMap.anInt1780 < DummyClass25.aClass131_1624.anInt1720)) {
          if (DummyClass25.aClass131_1624.method1794(SceneShadowMap.anInt1780, -20138)) {
            return SceneShadowMap.anInt1780++;
          }

          ++SceneShadowMap.anInt1780;
        }

        return -1;
      }
  }

  public static void method252(int var0) {
    AreaSoundEffect var1;
      for (
        var1 = (AreaSoundEffect) Node.aClass61_78.getFirst();
          var1 != null; var1 = (AreaSoundEffect) Node.aClass61_78.getNext()) {
        if (var1.aBoolean2329) {
          var1.method134(1);
        }
      }

      for (
        var1 = (AreaSoundEffect) SocketStream.aClass61_1242.getFirst();
          var1 != null; var1 = (AreaSoundEffect) SocketStream.aClass61_1242.getNext()) {
        if (var1.aBoolean2329) {
          var1.method134(1);
        }
      }

      if (var0 != 8) {
        TextureSampler23.anInt3213 = 122;
      }
  }

  public static void method253(int var0, int var1, int var2, int var3, int var4) {
    if (var0 != -22611) {
        TextureSampler23.method246(83);
      }

      SomethingQuickChat2.anInt3536 = DummyClass30.anInt455 * var3 / var1;
      SpawnedGameObject.anInt2251 = DummyClass58.anInt1460 * var2 / var4;
      ProceduralTexture.anInt1150 = -1;
      TextureSampler13.anInt3362 = -1;
      SomethingInScenePacket202.method117((byte) 87);
  }

}
