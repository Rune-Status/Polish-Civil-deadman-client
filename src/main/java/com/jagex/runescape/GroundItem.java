package com.jagex.runescape;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.huffman.HuffmanEncoderStatics;

public final class GroundItem extends SceneNode {

  public static GameString aClass94_2928 = GameStringStatics.create("null");
  public static int[] anIntArray2929 = new int[1000];
  public static int[] anIntArray2931;
  public static int[] anIntArray2933 = {2, 0, 0, 2, 0, 0, 0, 4, 4};
  public static int viewHeight;
  public static GameString[] aClass94Array2935 = new GameString[500];
  public static int anInt2937;
  public static int anInt2938;
  public static FileUnpacker fileUnpacker24;
  public int anInt2930;
  public int anInt2936;
  private int anInt2932 = -32768;

  public void method1867(int var1, int var2, int var3, int var4, int var5 ) {
  }

  public void draw(int var1, int var2, int var3, int var4, int var5, int translateX,
      int translateY,
      int translateZ,
      long var9,
      int var11,
      DummyClass0 var12 ) {
    AbstractModel var13 = DummyClass35.getItemConfig(this.anInt2936, (byte) 84)
        .getModel(124, -1, 0, null, this.anInt2930, 0);
      if (var13 != null) {
        var13.draw(var1, var2, var3, var4, var5, translateX, translateY, translateZ, var9, var11,
          var12);
        this.anInt2932 = var13.getMinimumY();
      }
  }

  public int getMinimumY() {
    return this.anInt2932;
  }

  public static boolean loadSprites(FileUnpacker sprites, int fileId) {
    byte[] bytes = sprites.getBytes(fileId);
      if (bytes != null) {
        DummyClass38.loadSprites(bytes, 19);
        return true;
      } else {
        return false;
      }
  }

  public static void method2030(byte var0) {
    GroundItem.anIntArray2929 = null;
      if (var0 < 82) {
        GroundItem.method2031((byte) -61, false, -20, 24, null, 124);
      }

      GroundItem.anIntArray2931 = null;
      GroundItem.anIntArray2933 = null;
      GroundItem.aClass94Array2935 = null;
      GroundItem.aClass94_2928 = null;
      GroundItem.fileUnpacker24 = null;
  }

  public static boolean method2031(byte var0, boolean var1, int var2, int var3,
                                  SceneGraphTile[][][] var4, int var5) {
    byte var6 = !var1 ? (byte) (255 & BitVariable.anInt1127) : 1;
      if ((var6 == AbstractImageProducer.aByteArrayArrayArray2008[GameWorldSomething.currentPlane][var2][var3])) {
        return false;
      } else if (((
          BZipDecompressorState.tileFlags[GameWorldSomething.currentPlane][var2][var3]
              & 4) == 0)) {
        return false;
      } else {
        int var8 = 0;
        byte var7 = 0;
        TextureSampler38.anIntArray3456[var7] = var2;
        if (var0 >= -9) {
          GroundItem.method2031((byte) -29, false, 59, 52, null, 75);
        }

        int var23 = var7 + 1;
        DummyClass38.anIntArray729[var7] = var3;
        AbstractImageProducer.aByteArrayArrayArray2008[GameWorldSomething.currentPlane][var2][var3] =
          var6;

        while ((var8 != var23)) {
          int var10 = (16740943 & TextureSampler38.anIntArray3456[var8]) >> 16;
          int var11 = 255 & TextureSampler38.anIntArray3456[var8] >> 24;
          int var9 = TextureSampler38.anIntArray3456[var8] & '\uffff';
          int var13 = (DummyClass38.anIntArray729[var8] & 16721603) >> 16;
          int var12 = DummyClass38.anIntArray729[var8] & '\uffff';
          var8 = 4095 & 1 + var8;
          boolean var14 = false;
          boolean var15 = false;
          if ((
              BZipDecompressorState.tileFlags[GameWorldSomething.currentPlane][var9][var12]
                  & 4) == 0) {
            var14 = true;
          }

          int var17;
          int var16;
          label257:
          for (var16 = 1 + GameWorldSomething.currentPlane; var16 <= 3; ++var16) {
            if (((BZipDecompressorState.tileFlags[var16][var9][var12] & 8) == 0)) {
              int var18;
              int var20;
              if (var14 && var4[var16][var9][var12] != null) {
                if (var4[var16][var9][var12].aClass70_2234 != null) {
                  var17 = Cursor.method1184(var10, (byte) 82);
                  if ((var4[var16][var9][var12].aClass70_2234.anInt1055 == var17)
                    || var4[var16][var9][var12].aClass70_2234.anInt1059 == var17) {
                    continue;
                  }

                  if (var11 != 0) {
                    var18 = Cursor.method1184(var11, (byte) -93);
                    if (var18 == var4[var16][var9][var12].aClass70_2234.anInt1055
                      || var4[var16][var9][var12].aClass70_2234.anInt1059 == var18) {
                      continue;
                    }
                  }

                  if (var13 != 0) {
                    var18 = Cursor.method1184(var13, (byte) 99);
                    if (var18 == var4[var16][var9][var12].aClass70_2234.anInt1055
                      || (var18 == var4[var16][var9][var12].aClass70_2234.anInt1059)) {
                      continue;
                    }
                  }
                }

                if (var4[var16][var9][var12].sceneGraphNodes != null) {
                  for (var17 = 0; var4[var16][var9][var12].anInt2223 > var17; ++var17) {
                    var18 =
                      (int) (63L & var4[var16][var9][var12].sceneGraphNodes[var17].aLong498 >> 14);
                    if ((var18 == 21)) {
                      var18 = 19;
                    }

                    int var19 =
                      (int) (var4[var16][var9][var12].sceneGraphNodes[var17].aLong498 >> 20 & 3L);
                    var20 = var18 | var19 << 6;
                    if ((var20 == var10) || var11 != 0 && var20 == var11
                      || (var13 != 0) && var13 == var20) {
                      continue label257;
                    }
                  }
                }
              }

              var15 = true;
              SceneGraphTile var24 = var4[var16][var9][var12];
              if (var24 != null && (var24.anInt2223 > 0)) {
                for (var18 = 0; var24.anInt2223 > var18; ++var18) {
                  SceneSomething var25 = var24.sceneGraphNodes[var18];
                  if ((var25.anInt495 != var25.anInt483) || (var25.anInt481 != var25.anInt478)) {
                    for (var20 = var25.anInt483; (var25.anInt495 >= var20); ++var20) {
                      for (int var21 = var25.anInt478; (var21 <= var25.anInt481); ++var21) {
                        AbstractImageProducer.aByteArrayArrayArray2008[var16][var20][var21] = var6;
                      }
                    }
                  }
                }
              }

              AbstractImageProducer.aByteArrayArrayArray2008[var16][var9][var12] = var6;
            }
          }

          if (var15) {
            if (AbstractGameWorld.heightMap[GameWorldSomething.currentPlane + 1][var9][var12]
              > FileCache.anIntArray686[var5]) {
              FileCache.anIntArray686[var5] =
                AbstractGameWorld.heightMap[GameWorldSomething.currentPlane + 1][var9][var12];
            }

            var16 = var9 << 7;
            if (var16 >= MilliFrameRegulator.anIntArray2696[var5]) {
              if ((DummyClass13.anIntArray2021[var5] < var16)) {
                DummyClass13.anIntArray2021[var5] = var16;
              }
            } else {
              MilliFrameRegulator.anIntArray2696[var5] = var16;
            }

            var17 = var12 << 7;
            if (AnimationSequence.anIntArray1871[var5] > var17) {
              AnimationSequence.anIntArray1871[var5] = var17;
            } else if (Player.anIntArray3959[var5] < var17) {
              Player.anIntArray3959[var5] = var17;
            }
          }

          if (!var14) {
            if ((var9 >= 1) &&
              AbstractImageProducer.aByteArrayArrayArray2008[GameWorldSomething.currentPlane][-1
                + var9][var12] != var6) {
              TextureSampler38.anIntArray3456[var23] =
                HuffmanEncoderStatics
                    .method308(HuffmanEncoderStatics.method308(var9 - 1, 1179648), -754974720);
              DummyClass38.anIntArray729[var23] = HuffmanEncoderStatics
                  .method308(var12, 1245184);
              var23 = 1 + var23 & 4095;
              AbstractImageProducer.aByteArrayArrayArray2008[GameWorldSomething.currentPlane][var9
                - 1][var12] = var6;
            }

            ++var12;
            if (var12 < 104) {
              if (((var9 - 1) >= 0) && (var6 != AbstractImageProducer.aByteArrayArrayArray2008[GameWorldSomething.currentPlane][
                -1 + var9][var12]) &&
                ((BZipDecompressorState.tileFlags[GameWorldSomething.currentPlane][var9][var12] & 4) == 0) &&
                ((BZipDecompressorState.tileFlags[GameWorldSomething.currentPlane][-1 + var9][var12
                  - 1] & 4) == 0)) {
                TextureSampler38.anIntArray3456[var23] = HuffmanEncoderStatics.method308(1375731712,
                  HuffmanEncoderStatics.method308(1179648, -1 + var9));
                DummyClass38.anIntArray729[var23] = HuffmanEncoderStatics
                    .method308(var12, 1245184);
                AbstractImageProducer.aByteArrayArrayArray2008[GameWorldSomething.currentPlane][-1
                  + var9][var12] = var6;
                var23 = 1 + var23 & 4095;
              }

              if (var6
                != AbstractImageProducer.aByteArrayArrayArray2008[GameWorldSomething.currentPlane][var9][var12]) {
                TextureSampler38.anIntArray3456[var23] =
                  HuffmanEncoderStatics
                      .method308(318767104, HuffmanEncoderStatics
                          .method308(var9, 5373952));
                DummyClass38.anIntArray729[var23] = HuffmanEncoderStatics
                    .method308(5439488, var12);
                var23 = 4095 & 1 + var23;
                AbstractImageProducer.aByteArrayArrayArray2008[GameWorldSomething.currentPlane][var9][var12] =
                  var6;
              }

              if (((1 + var9) < 104) &&
                AbstractImageProducer.aByteArrayArrayArray2008[GameWorldSomething.currentPlane][var9
                  + 1][var12] != var6 && (
                  BZipDecompressorState.tileFlags[GameWorldSomething.currentPlane][var9][var12]
                      & 4) == 0
                &&
                ((BZipDecompressorState.tileFlags[GameWorldSomething.currentPlane][1 + var9][var12
                  - 1] & 4) == 0)) {
                TextureSampler38.anIntArray3456[var23] = HuffmanEncoderStatics.method308(-1845493760,
                  HuffmanEncoderStatics.method308(5373952, var9 + 1));
                DummyClass38.anIntArray729[var23] = HuffmanEncoderStatics
                    .method308(5439488, var12);
                AbstractImageProducer.aByteArrayArrayArray2008[GameWorldSomething.currentPlane][var9
                  + 1][var12] = var6;
                var23 = 4095 & var23 + 1;
              }
            }

            --var12;
            if (1 + var9 < 104 && var6
              != AbstractImageProducer.aByteArrayArrayArray2008[GameWorldSomething.currentPlane][
              var9 + 1][var12]) {
              TextureSampler38.anIntArray3456[var23] =
                HuffmanEncoderStatics
                    .method308(HuffmanEncoderStatics.method308(1 + var9, 9568256), 1392508928);
              DummyClass38.anIntArray729[var23] = HuffmanEncoderStatics
                  .method308(var12, 9633792);
              AbstractImageProducer.aByteArrayArrayArray2008[GameWorldSomething.currentPlane][1
                + var9][var12] = var6;
              var23 = var23 + 1 & 4095;
            }

            --var12;
            if ((var12 >= 0)) {
              if (var9 - 1 >= 0 &&
                AbstractImageProducer.aByteArrayArrayArray2008[GameWorldSomething.currentPlane][-1
                  + var9][var12] != var6 &&
                ((BZipDecompressorState.tileFlags[GameWorldSomething.currentPlane][var9][var12] & 4) == 0) &&
                ((BZipDecompressorState.tileFlags[GameWorldSomething.currentPlane][var9 - 1][1
                  + var12] & 4) == 0)) {
                TextureSampler38.anIntArray3456[var23] =
                  HuffmanEncoderStatics.method308(
                      HuffmanEncoderStatics.method308(-1 + var9, 13762560),
                    301989888);
                DummyClass38.anIntArray729[var23] = HuffmanEncoderStatics
                    .method308(var12, 13828096);
                AbstractImageProducer.aByteArrayArrayArray2008[GameWorldSomething.currentPlane][-1
                  + var9][var12] = var6;
                var23 = 4095 & var23 + 1;
              }

              if (var6
                != AbstractImageProducer.aByteArrayArrayArray2008[GameWorldSomething.currentPlane][var9][var12]) {
                TextureSampler38.anIntArray3456[var23] =
                  HuffmanEncoderStatics
                      .method308(HuffmanEncoderStatics.method308(var9, 13762560), -1828716544);
                DummyClass38.anIntArray729[var23] = HuffmanEncoderStatics
                    .method308(13828096, var12);
                var23 = var23 + 1 & 4095;
                AbstractImageProducer.aByteArrayArrayArray2008[GameWorldSomething.currentPlane][var9][var12] =
                  var6;
              }

              if (((var9 + 1) < 104) &&
                AbstractImageProducer.aByteArrayArrayArray2008[GameWorldSomething.currentPlane][var9
                  + 1][var12] != var6 &&
                ((4 & BZipDecompressorState.tileFlags[GameWorldSomething.currentPlane][var9][var12]) == 0) &&
                ((BZipDecompressorState.tileFlags[GameWorldSomething.currentPlane][1 + var9][1
                  + var12] & 4) == 0)) {
                TextureSampler38.anIntArray3456[var23] = HuffmanEncoderStatics.method308(-771751936,
                  HuffmanEncoderStatics.method308(var9 + 1, 9568256));
                DummyClass38.anIntArray729[var23] = HuffmanEncoderStatics
                    .method308(9633792, var12);
                AbstractImageProducer.aByteArrayArrayArray2008[GameWorldSomething.currentPlane][var9
                  + 1][var12] = var6;
                var23 = 4095 & 1 + var23;
              }
            }
          }
        }

        if (FileCache.anIntArray686[var5] != -1000000) {
          FileCache.anIntArray686[var5] += 10;
          MilliFrameRegulator.anIntArray2696[var5] -= 50;
          DummyClass13.anIntArray2021[var5] += 50;
          Player.anIntArray3959[var5] += 50;
          AnimationSequence.anIntArray1871[var5] -= 50;
        }

        return true;
      }
  }

  public static int method2032(int var0, int var1) {
    if (var1 != 5439488) {
        GroundItem.anInt2937 = 102;
      }

      return var0 >>> 10;
  }

  public static GameString decompressString(Buffer buffer, int maximumLen) {
    try {
        int len = buffer.readUnsignedShortSmart();
        if (maximumLen < len) {
          len = maximumLen;
        }
        byte[] dest = new byte[len];
        buffer.position +=
          TextureSampler16.huffmanEncoder.decompress(buffer.bytes, buffer.position, dest, 0, len);
        GameString var5 = GameStringStatics.createString(dest, 0, len);
        return var5;
      } catch (Exception var6) {
        return DummyClass13.aClass94_2018;
      }
  }

}
