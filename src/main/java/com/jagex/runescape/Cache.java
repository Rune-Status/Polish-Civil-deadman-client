package com.jagex.runescape;

import com.jagex.runescape.opengl.DummyClass33;
import com.jagex.runescape.opengl.GlDirectColorSprite;
import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.GlTexture2d;
import com.jagex.runescape.opengl.GlUtils;

public final class Cache {

  public static boolean aBoolean742;
  public static ObjectCache aClass93_743 = new ObjectCache(20);
  public static FileUnpacker quickchats;
  public static GameString aClass94_750 = GameString.create("null");
  private SubNode aClass3_Sub28_744 = new SubNode();
  private final HashTable table;
  private final int size;
  private final Queue queue = new Queue();
  private int capacity;


  public Cache(int size ) {
    int tableSize = 1;
      for (this.capacity = size; tableSize + tableSize < size; tableSize += tableSize) {
      }
      this.size = size;
      this.table = new HashTable(tableSize);
  }

  public SubNode get(long var1, int var3 ) {
    if (var3 != 1400) {
        this.capacity = -79;
      }

      SubNode var4 = (SubNode) this.table.get(var1);
      if (var4 != null) {
        this.queue.addLast(var4);
      }

      return var4;
  }

  public Node method1094(int var1 ) {
    return var1 != 0 ? null : this.table.getFirst(38);
  }

  public void put(long var2, SubNode var1 ) {
    if ((this.capacity == 0)) {
        SubNode var5 = this.queue.poll();
        var5.unlinkNode();
        var5.unlinkSubNode();
        if (this.aClass3_Sub28_744 == var5) {
          var5 = this.queue.poll();
          var5.unlinkNode();
          var5.unlinkSubNode();
        }
      } else {
        --this.capacity;
      }

      this.table.put(var2, var1);
      this.queue.addLast(var1);
  }

  public Node method1099(int var1 ) {
    if (var1 != -1) {
        Cache.aClass93_743 = null;
      }

      return this.table.getNext(-119);
  }

  public void method1101(int var1 ) {
    this.queue.clear();
      this.table.clear(-112);
      this.aClass3_Sub28_744 = new SubNode();
      if (var1 != 2) {
        this.get(-36L, 52);
      }

      this.capacity = this.size;
  }

  public static boolean method1088(boolean var0) {
    if (Structure.aBoolean3641) {
        try {
          FileSystem.aClass94_106.method1577(-1857);
          return true;
        } catch (Throwable var2) {
        }
      }

      if (var0) {
        Cache.aClass93_743 = null;
      }

      return false;
  }

  public static AnimationSomething method1089(FileUnpacker bases, boolean var1, FileUnpacker frames,
                                             byte var3, int var4) {
    boolean var5 = true;
      if (var3 <= 71) {
        return null;
      } else {
        int[] var6 = bases.getChildIds((byte) -128, var4);

        for (int var7 = 0; var7 < var6.length; ++var7) {
          byte[] var8 = bases.getBytes(var6[var7], var4, 0);
          if (var8 == null) {
            var5 = false;
          } else {
            int var9 = (255 & var8[0]) << 8 | var8[1] & 255;
            byte[] var10;
            if (var1) {
              var10 = frames.getBytes(var9, 0, 0);
            } else {
              var10 = frames.getBytes(0, var9, 0);
            }

            if (var10 == null) {
              var5 = false;
            }
          }
        }

        if (var5) {
          try {
            return new AnimationSomething(bases, frames, var4, var1);
          } catch (Exception var11) {
            return null;
          }
        } else {
          return null;
        }
      }
  }

  public static GameString createString(int len) {
    GameString str = new GameString();
      str.length = 0;
      str.bytes = new byte[len];
      return str;
  }

  public static void method1091(boolean var0, int var1) {
    byte var2;
      byte[][] fileData;
      if (GlRenderer.useOpenGlRenderer && var0) {
        var2 = 1;
        fileData = GroundItemNode.updatedMapsData;
      } else {
        var2 = 4;
        fileData = Something3d2.aByteArrayArray3027;
      }

      int var4 = fileData.length;

      int var5;
      int var6;
      int var7;
      byte[] bytes;
      for (var5 = 0; var4 > var5; ++var5) {
        var6 = -WorldMapLabel.anInt1716 + 64 * (AudioStreamEncoder3.regionHashes[var5] >> 8);
        var7 = -ProceduralTexture.anInt1152 + 64 * (255 & AudioStreamEncoder3.regionHashes[var5]);
        bytes = fileData[var5];
        if (bytes != null) {
          DummyClass43.method1194(-16385);
          Buffer.method777(BlockConfig.collisionMaps, var0, -48 + 8 * AbstractObjectNode.anInt3606,
            var7, 4, var6, (VariableUpdate.anInt2294 - 6) * 8, bytes);
        }
      }

      var5 = 0;
      if (var1 > -66) {
        Cache.method1088(true);
      }

      for (; var4 > var5; ++var5) {
        var6 = -WorldMapLabel.anInt1716 + 64 * (AudioStreamEncoder3.regionHashes[var5] >> 8);
        var7 = -ProceduralTexture.anInt1152 + 64 * (255 & AudioStreamEncoder3.regionHashes[var5]);
        bytes = fileData[var5];
        if (bytes == null && (VariableUpdate.anInt2294 < 800)) {
          DummyClass43.method1194(-16385);

          for (int var9 = 0; var9 < var2; ++var9) {
            SomethingSceneJ.method870(var9, (byte) 102, var7, var6, 64, 64);
          }
        }
      }
  }

  public static void method1093(boolean var0) {
    if (var0) {
        Cache.method1093(true);
      }

      for (int var1 = 0; var1 < 100; ++var1) {
        GroundItemNode.aBooleanArray3674[var1] = true;
      }
  }

  public static void method1095(int x, int var1, int var2, Widget[] var3, int width, int var5, int y,
                               int height, byte var8, int var9) {
    if (GlRenderer.useOpenGlRenderer) {
        GlUtils.clip(x, y, width, height);
      } else {
        DummyClass47.method1324(x, y, width, height);
        DummyClass40.method1134();
      }

      for (int var10 = 0; var3.length > var10; ++var10) {
        Widget var11 = var3[var10];
        if (var11 != null && ((var11.anInt190 == var5)
          || var5 == 0xabcdabcd && var11 == DummyClass42.aClass11_886)) {
          int var12;
          if ((var9 == -1)) {
            AbstractAudioOutputStream.quadx0[SomethingWorldMapy.widgetQuads] =
                var2 + var11.anInt306;
            Player.quady0[SomethingWorldMapy.widgetQuads] =
                var11.anInt210 + var1;
            GlTexture2d.quadx1[SomethingWorldMapy.widgetQuads] = var11.anInt168;
            Mobile.quady1[SomethingWorldMapy.widgetQuads] = var11.anInt193;
            var12 = SomethingWorldMapy.widgetQuads++;
          } else {
            var12 = var9;
          }

          var11.anInt204 = AbstractGameWorld.updateCycle;
          var11.anInt292 = var12;
          if (!var11.aBoolean233 || !GameClient.method51(var11)) {
            if (var11.anInt189 > 0) {
              MapScene.method81((byte) -128, var11);
            }

            int var14 = var1 + var11.anInt210;
            int var15 = var11.anInt223;
            int var13 = var11.anInt306 + var2;
            if (LinearHashTable.aBoolean1040 && (
                GameClient.method44(var11).anInt2205 != 0
              || var11.anInt187 == 0) && var15 > 127) {
              var15 = 127;
            }

            int var17;
            int var16;
            if (var11 == DummyClass42.aClass11_886) {
              if (var5 != -1412584499 && !var11.aBoolean200) {
                AbstractObjectNode.anInt3602 = var2;
                FileCacheRequester.anInt1082 = var1;
                SceneNode.aClass11Array1836 = var3;
                continue;
              }

              if (NPC.aBoolean3975 && DummyClass52.aBoolean1167) {
                var17 = HashTable.anInt1709;
                var16 = SomethingTilek.anInt1676;
                var17 -= DummyClass53.anInt1336;
                if (var17 < DummyClass21.anInt1761) {
                  var17 = DummyClass21.anInt1761;
                }

                if ((var17 + var11.anInt193) > (DummyClass18.aClass11_88.anInt193
                  + DummyClass21.anInt1761)) {
                  var17 =
                    -var11.anInt193 + DummyClass18.aClass11_88.anInt193 + DummyClass21.anInt1761;
                }

                var14 = var17;
                var16 -= BufferObject.anInt1881;
                if (TextureSampler20.anInt3156 > var16) {
                  var16 = TextureSampler20.anInt3156;
                }

                if (((DummyClass18.aClass11_88.anInt168 + TextureSampler20.anInt3156) < (
                  var11.anInt168 + var16))) {
                  var16 = -var11.anInt168 + DummyClass18.aClass11_88.anInt168
                    + TextureSampler20.anInt3156;
                }

                var13 = var16;
              }

              if (!var11.aBoolean200) {
                var15 = 128;
              }
            }

            int var19;
            int var18;
            int var21;
            int var20;
            if (var11.anInt187 == 2) {
              var19 = height;
              var18 = width;
              var17 = y;
              var16 = x;
            } else {
              var17 = var14 > y ? var14 : y;
              var16 = (x < var13) ? var13 : x;
              var20 = var11.anInt168 + var13;
              var21 = var14 + var11.anInt193;
              if ((var11.anInt187 == 9)) {
                ++var21;
                ++var20;
              }

              var19 = height <= var21 ? height : var21;
              var18 = (var20 >= width) ? width : var20;
            }

            if (!var11.aBoolean233 || var18 > var16 && (var17 < var19)) {
              int var23;
              int var22;
              int var25;
              int var24;
              int var26;
              int var29;
              int var28;
              int var47;
              if ((var11.anInt189 != 0)) {
                if ((var11.anInt189 == 1337)
                  || var11.anInt189 == 1403 && GlRenderer.useOpenGlRenderer) {
                  FloorOverlay.aClass11_2091 = var11;
                  SubNode.anInt2567 = var14;
                  DummyClass41.anInt865 = var13;
                  TextureSampler36.method338(-6403, var11.anInt193, (var11.anInt189 == 1403), var13,
                    var11.anInt168, var14);
                  if (GlRenderer.useOpenGlRenderer) {
                    GlUtils.clip(x, y, width, height);
                  } else {
                    DummyClass47.method1324(x, y, width, height);
                  }
                  continue;
                }

                if ((var11.anInt189 == 1338)) {
                  if (!var11.method855(-30721)) {
                    continue;
                  }

                  ClassCheckRequest.method125(var12, (byte) 59, var14, var13, var11);
                  if (GlRenderer.useOpenGlRenderer) {
                    GlUtils.clip(x, y, width, height);
                  } else {
                    DummyClass47.method1324(x, y, width, height);
                  }

                  if (DummyClass12.minimapMode != 0 && DummyClass12.minimapMode
                      != 3
                    || DummyClass36.aBoolean2615 || var16 > NpcConfiguration.anInt1297
                    || (DummyClass36.anInt2612 < var17) || (NpcConfiguration.anInt1297 >= var18)
                    || (var19 <= DummyClass36.anInt2612)) {
                    continue;
                  }

                  var20 = NpcConfiguration.anInt1297 - var13;
                  var21 = -var14 + DummyClass36.anInt2612;
                  var22 = var11.anIntArray207[var21];
                  if ((var20 < var22) || var20 > (var22 + var11.anIntArray291[var21])) {
                    continue;
                  }

                  var21 -= var11.anInt193 / 2;
                  var23 = 2047 & SpotAnimationConfig.anInt531 + TextureSampler9.anInt3102;
                  var20 -= var11.anInt168 / 2;
                  var24 = DummyClass40.SINE_TABLE[var23];
                  var25 = DummyClass40.COSINE_TABLE[var23];
                  var24 = (Something3d2.anInt3020 + 256) * var24 >> 8;
                  var25 = (Something3d2.anInt3020 + 256) * var25 >> 8;
                  var47 = -(var24 * var20) + var25 * var21 >> 11;
                  var26 = var21 * var24 + (var20 * var25) >> 11;
                  var28 = TextureCache.localPlayer.anInt2819 + var26 >> 7;
                  var29 = -var47 + TextureCache.localPlayer.anInt2829 >> 7;
                  if (SceneNode.aBoolean1837 && (Something3dRoot.anInt2051 & 64)
                      != 0) {
                    Widget var53 =
                      AbstractDirectColorSprite.method638((byte) -19, ScriptState.anInt872,
                        Widget.anInt278);
                    if (var53 != null) {
                      ScriptState.method1177(BufferObject.anInt1887, 1L, (byte) -49,
                        WorldMapLabel.aClass94_1724, var28, (short) 11, Parameter.aClass94_3621,
                        var29);
                    } else {
                      SceneSomething.method958((byte) -91);
                    }
                    continue;
                  }

                  if ((AbstractImageProducer.gameId == 1)) {
                    ScriptState.method1177(-1, 1L, (byte) -41, GroundItemNode.EMPTY_STRING, var28,
                      (short) 36, GlTexture2d.aClass94_3762, var29);
                  }

                  ScriptState.method1177(-1, 1L, (byte) -125, GroundItemNode.EMPTY_STRING, var28,
                    (short) 60, TextureSampler32.walkTooltip, var29);
                  continue;
                }

                if (var11.anInt189 == 1339) {
                  if (var11.method855(-30721)) {
                    CollisionMap.method1493(var13, var14, var11, var12, (byte) 59);
                    if (GlRenderer.useOpenGlRenderer) {
                      GlUtils.clip(x, y, width, height);
                    } else {
                      DummyClass47.method1324(x, y, width, height);
                    }
                  }
                  continue;
                }

                if (var11.anInt189 == 1400) {
                  Buffer.method799(var13, 64, var14, var11.anInt193, var11.anInt168);
                  GroundItemNode.aBooleanArray3674[var12] = true;
                  DummyClass9.aBooleanArray4008[var12] = true;
                  if (GlRenderer.useOpenGlRenderer) {
                    GlUtils.clip(x, y, width, height);
                  } else {
                    DummyClass47.method1324(x, y, width, height);
                  }
                  continue;
                }

                if ((var11.anInt189 == 1401)) {
                  DummyClass3.method72(var13, var11.anInt193, var11.anInt168, 19481, var14);
                  GroundItemNode.aBooleanArray3674[var12] = true;
                  DummyClass9.aBooleanArray4008[var12] = true;
                  if (GlRenderer.useOpenGlRenderer) {
                    GlUtils.clip(x, y, width, height);
                  } else {
                    DummyClass47.method1324(x, y, width, height);
                  }
                  continue;
                }

                if (var11.anInt189 == 1402) {
                  if (!GlRenderer.useOpenGlRenderer) {
                    AbstractFrameRegulator.method1768(var13, 95, var14);
                    GroundItemNode.aBooleanArray3674[var12] = true;
                    DummyClass9.aBooleanArray4008[var12] = true;
                  }
                  continue;
                }

                if ((var11.anInt189 == 1405)) {
                  if (!DummyClass29.aBoolean438) {
                    continue;
                  }

                  var20 = var11.anInt168 + var13;
                  var21 = 15 + var14;
                  SomethingTilek.p12Font.method688(RenderAnimation.concat(new GameString[] {
                    TextureSampler15.aClass94_3196, SomethingScene.toString(AnimationSequence.fps)
                  }), var20, var21, 16776960, -1);
                  var21 += 15;
                  Runtime var57 = Runtime.getRuntime();
                  var23 = (int) ((var57.totalMemory() - var57.freeMemory()) / 1024L);
                  var24 = 16776960;
                  if ((var23 > 65536)) {
                    var24 = 16711680;
                  }

                  SomethingTilek.p12Font.method688(RenderAnimation.concat(new GameString[] {
                    FileCacheRequest.aClass94_4057, SomethingScene.toString(var23),
                    FileRequester.aClass94_2951
                  }), var20, var21, var24, -1);
                  var21 += 15;
                  if (GlRenderer.useOpenGlRenderer) {
                    var24 = 16776960;
                    var25 = (DummyClass33.textureMemory + DummyClass33.anInt585
                      + DummyClass33.texture2dMemory) / 1024;
                    if (var25 > 65536) {
                      var24 = 16711680;
                    }

                    SomethingTilek.p12Font.method688(RenderAnimation.concat(new GameString[] {
                      AbstractObjectNodeWrapper.aClass94_1622, SomethingScene.toString(var25),
                      FileRequester.aClass94_2951
                    }), var20, var21, var24, -1);
                    var21 += 15;
                  }

                  var24 = 16776960;
                  var25 = 0;
                  var47 = 0;
                  var26 = 0;

                  for (var28 = 0; var28 < 28; ++var28) {
                    var25 += Buffer.aClass151_Sub1Array2601[var28].method2108((byte) 1);
                    var26 += Buffer.aClass151_Sub1Array2601[var28].method2102(0);
                    var47 += Buffer.aClass151_Sub1Array2601[var28].method2106(1);
                  }

                  var29 = 10000 * var26 / var25;
                  var28 = var47 * 100 / var25;
                  GameString var55 = RenderAnimation.concat(new GameString[] {
                    DummyClass29.aClass94_436,
                    SomethingOtherWorldMap.method407(0, true, 2, var29, 2),
                    SomethingWorldMappy.aClass94_2498, SomethingScene.toString(var28),
                    SomethingQuickChatK.aClass94_148
                  });
                  AbstractTextureSampler.aClass3_Sub28_Sub17_2379.method688(var55, var20, var21,
                    var24, -1);
                  var21 += 12;
                  GroundItemNode.aBooleanArray3674[var12] = true;
                  DummyClass9.aBooleanArray4008[var12] = true;
                  continue;
                }

                if ((var11.anInt189 == 1406)) {
                  GameException.anInt2115 = var14;
                  AbstractDirectColorSprite.aClass11_3708 = var11;
                  TextureSampler18.anInt4041 = var13;
                  continue;
                }
              }

              if (!DummyClass36.aBoolean2615) {
                if ((var11.anInt187 == 0) && var11.aBoolean219
                  && NpcConfiguration.anInt1297 >= var16 && (DummyClass36.anInt2612 >= var17)
                  && NpcConfiguration.anInt1297 < var18 && var19 > DummyClass36.anInt2612
                  && !LinearHashTable.aBoolean1040) {
                  TextureSampler25.amountContextActions = 1;
                  MonoChromaticImageCache.anIntArray1578[0] = AnimationSomething.anInt3590;
                  GroundItem.aClass94Array2935[0] = DummyClass12.aClass94_2031;
                  DummyClass8.aClass94Array4016[0] = GroundItemNode.EMPTY_STRING;
                  TextureSampler27.aShortArray3095[0] = 1005;
                }

                if (var16 <= NpcConfiguration.anInt1297 && (var17 <= DummyClass36.anInt2612)
                  && var18 > NpcConfiguration.anInt1297 && var19 > DummyClass36.anInt2612) {
                  AudioStreamEncoder4.method477(DummyClass36.anInt2612 - var14, true,
                    -var13 + NpcConfiguration.anInt1297, var11);
                }
              }

              if ((var11.anInt187 == 0)) {
                if (!var11.aBoolean233 && GameClient.method51(var11)
                  && DummyClass56.aClass11_1453 != var11) {
                  continue;
                }

                if (!var11.aBoolean233) {
                  if (((-var11.anInt193 + var11.anInt252) < var11.anInt208)) {
                    var11.anInt208 = -var11.anInt193 + var11.anInt252;
                  }

                  if (var11.anInt208 < 0) {
                    var11.anInt208 = 0;
                  }
                }

                Cache.method1095(var16, -var11.anInt208 + var14, -var11.anInt247 + var13, var3, var18,
                  var11.anInt279, var17, var19, (byte) 87, var12);
                if (var11.aClass11Array262 != null) {
                  Cache.method1095(var16, -var11.anInt208 + var14, -var11.anInt247 + var13,
                    var11.aClass11Array262, var18, var11.anInt279, var17, var19, (byte) 52, var12);
                }

                SomethingPacket151 var36 =
                  (SomethingPacket151) TextureSampler23.aClass130_3208.get(
                      var11.anInt279);
                if (var36 != null) {
                  if (var36.anInt2603 == 0 && !DummyClass36.aBoolean2615
                    && NpcConfiguration.anInt1297 >= var16 && (var17 <= DummyClass36.anInt2612)
                    && var18 > NpcConfiguration.anInt1297 && DummyClass36.anInt2612 < var19
                    && !LinearHashTable.aBoolean1040) {
                    GroundItem.aClass94Array2935[0] = DummyClass12.aClass94_2031;
                    TextureSampler25.amountContextActions = 1;
                    MonoChromaticImageCache.anIntArray1578[0] = AnimationSomething.anInt3590;
                    TextureSampler27.aShortArray3095[0] = 1005;
                    DummyClass8.aClass94Array4016[0] = GroundItemNode.EMPTY_STRING;
                  }

                  TextureSampler12.method171(-101, var36.anInt2602, var16, var18, var13, var12,
                    var19, var17, var14);
                }

                if (GlRenderer.useOpenGlRenderer) {
                  GlUtils.clip(x, y, width, height);
                } else {
                  DummyClass47.method1324(x, y, width, height);
                  DummyClass40.method1134();
                }
              }

              if (HashTable.aBooleanArray1712[var12] || (ClientScript.rectangleDebugType > 1)) {
                if ((var11.anInt187 == 0) && !var11.aBoolean233
                  && var11.anInt252 > var11.anInt193) {
                  TextureSampler24.method224((byte) 120, var11.anInt208, var11.anInt252,
                    var11.anInt168 + var13, var14, var11.anInt193);
                }

                if (var11.anInt187 != 1) {
                  boolean var39;
                  boolean var46;
                  if ((var11.anInt187 == 2)) {
                    var20 = 0;

                    for (var21 = 0; (var21 < var11.anInt244); ++var21) {
                      for (var22 = 0; var11.anInt177 > var22; ++var22) {
                        var24 = var14 + var21 * (32 + var11.anInt290);
                        var23 = (var11.anInt285 + 32) * var22 + var13;
                        if (var20 < 20) {
                          var24 += var11.anIntArray300[var20];
                          var23 += var11.anIntArray272[var20];
                        }

                        if (var11.anIntArray254[var20] <= 0) {
                          if (var11.anIntArray197 != null && var20 < 20) {
                            AbstractDirectColorSprite var58 = var11.method859(true, var20);
                            if (var58 == null) {
                              if (GameStub.aBoolean6) {
                                DummyClass29.method909(125, var11);
                              }
                            } else {
                              var58.method643(var23, var24);
                            }
                          }
                        } else {
                          var39 = false;
                          var46 = false;
                          var47 = var11.anIntArray254[var20] - 1;
                          if (x < 32 + var23 && (var23 < width) && (y < (var24 + 32))
                            && (var24 < height) || var11 == MouseRecorder.aClass11_1017
                            && (DummyClass18.anInt86 == var20)) {
                            AbstractDirectColorSprite var54;
                            if ((Something3d.anInt3012 == 1)
                                && DummyClass31.anInt1473 == var20
                              && (var11.anInt279 == GlTexture2d.anInt3764)) {
                              var54 =
                                MonoChromaticImageCache.method1707(2, var47, var11.aBoolean227,
                                  var11.anIntArray317[var20], 0, 65536);
                            } else {
                              var54 =
                                MonoChromaticImageCache.method1707(1, var47, var11.aBoolean227,
                                  var11.anIntArray317[var20], 3153952, 65536);
                            }

                            if (DummyClass40.aBoolean837) {
                              GroundItemNode.aBooleanArray3674[var12] = true;
                            }

                            if (var54 == null) {
                              DummyClass29.method909(-106, var11);
                            } else if (MouseRecorder.aClass11_1017 == var11
                              && var20 == DummyClass18.anInt86) {
                              var25 = SomethingTilek.anInt1676 - MilliFrameRegulator.anInt2693;
                              var26 = -DummyInputStream.anInt40 + HashTable.anInt1709;
                              if ((var26 < 5) && (var26 > 4)) {
                                var26 = 0;
                              }

                              if (var25 < 5 && (var25 > 4)) {
                                var25 = 0;
                              }

                              if (DummyClass59.anInt677 < 5) {
                                var25 = 0;
                                var26 = 0;
                              }

                              var54.method637(var23 + var25, var24 + var26, 128);
                              if (var5 != -1) {
                                Widget var51 = var3[var5 & '\uffff'];
                                int var31;
                                int var30;
                                if (GlRenderer.useOpenGlRenderer) {
                                  var31 = GlUtils.anInt451;
                                  var30 = GlUtils.anInt448;
                                } else {
                                  var30 = DummyClass47.anInt1095;
                                  var31 = DummyClass47.anInt1099;
                                }

                                int var32;
                                if (var30 > (var26 + var24) && (var51.anInt208 > 0)) {
                                  var32 = DisplayMode.loopCycle * (-var26 + var30 - var24) / 3;
                                  if (var32 > (DisplayMode.loopCycle * 10)) {
                                    var32 = 10 * DisplayMode.loopCycle;
                                  }

                                  if (var32 > var51.anInt208) {
                                    var32 = var51.anInt208;
                                  }

                                  var51.anInt208 -= var32;
                                  DummyInputStream.anInt40 += var32;
                                  DummyClass29.method909(121, var51);
                                }

                                if (var31 < 32 + var26 + var24
                                  && var51.anInt208 < -var51.anInt193 + var51.anInt252) {
                                  var32 =
                                    (-var31 + 32 + (var24 + var26)) * DisplayMode.loopCycle / 3;
                                  if (var32 > DisplayMode.loopCycle * 10) {
                                    var32 = 10 * DisplayMode.loopCycle;
                                  }

                                  if (-var51.anInt208 + var51.anInt252 - var51.anInt193 < var32) {
                                    var32 = var51.anInt252 - var51.anInt193 - var51.anInt208;
                                  }

                                  var51.anInt208 += var32;
                                  DummyInputStream.anInt40 -= var32;
                                  DummyClass29.method909(-81, var51);
                                }
                              }
                            } else if (var11 == AbstractFileRequester.aClass11_1933
                              && var20 == Keyboard.anInt1918) {
                              var54.method637(var23, var24, 128);
                            } else {
                              var54.method643(var23, var24);
                            }
                          }
                        }

                        ++var20;
                      }
                    }
                  } else if (var11.anInt187 == 3) {
                    if (InventoryConfig.method609(var11, 26)) {
                      var20 = var11.anInt253;
                      if (DummyClass56.aClass11_1453 == var11
                          && var11.anInt222 != 0) {
                        var20 = var11.anInt222;
                      }
                    } else {
                      var20 = var11.anInt218;
                      if (var11 == DummyClass56.aClass11_1453
                          && var11.anInt228 != 0) {
                        var20 = var11.anInt228;
                      }
                    }

                    if ((var15 != 0)) {
                      if (var11.aBoolean226) {
                        if (GlRenderer.useOpenGlRenderer) {
                          GlUtils.fillQuad(var13, var14, var11.anInt168,
                              var11.anInt193, var20,
                              256 - (var15 & 255));
                        } else {
                          DummyClass47.method1312(var13, var14, var11.anInt168,
                              var11.anInt193,
                              var20, 256 - (255 & var15));
                        }
                      } else if (GlRenderer.useOpenGlRenderer) {
                        GlUtils.drawQuad(var13, var14, var11.anInt168, var11.anInt193, var20,
                          256 - (var15 & 255));
                      } else {
                        DummyClass47.method1315(var13, var14, var11.anInt168, var11.anInt193, var20,
                          -(var15 & 255) + 256);
                      }
                    } else if (var11.aBoolean226) {
                      if (GlRenderer.useOpenGlRenderer) {
                        GlUtils.fillQuad(var13, var14, var11.anInt168, var11.anInt193, var20);
                      } else {
                        DummyClass47.method1323(var13, var14, var11.anInt168, var11.anInt193,
                          var20);
                      }
                    } else if (!GlRenderer.useOpenGlRenderer) {
                      DummyClass47.method1311(var13, var14, var11.anInt168, var11.anInt193, var20);
                    } else {
                      GlUtils.drawQuad(var13, var14, var11.anInt168, var11.anInt193, var20);
                    }
                  } else {
                    AbstractFont var34;
                    if ((var11.anInt187 == 4)) {
                      var34 = var11.method868(TextureSampler0.aClass109Array3270, 0);
                      if (var34 != null) {
                        GameString var45 = var11.aClass94_232;
                        if (InventoryConfig.method609(var11, 97)) {
                          var21 = var11.anInt253;
                          if (DummyClass56.aClass11_1453 == var11
                              && var11.anInt222 != 0) {
                            var21 = var11.anInt222;
                          }

                          if ((var11.aClass94_172.getLength() > 0)) {
                            var45 = var11.aClass94_172;
                          }
                        } else {
                          var21 = var11.anInt218;
                          if (DummyClass56.aClass11_1453 == var11
                              && var11.anInt228 != 0) {
                            var21 = var11.anInt228;
                          }
                        }

                        if (var11.aBoolean233 && (var11.anInt192 != -1)) {
                          ItemConfig var50 = DummyClass35.getItemConfig(var11.anInt192, (byte) 113);
                          var45 = var50.aClass94_770;
                          if (var45 == null) {
                            var45 = VertexNormal.aClass94_829;
                          }

                          if (((var50.anInt764 == 1) || (var11.anInt271 != 1))
                            && var11.anInt271 != -1) {
                            var45 = RenderAnimation.concat(new GameString[] {
                              TextureSampler6.aClass94_3042, var45, ClassCheckRequest.aClass94_2306,
                              HuffmanEncoder.method1013((byte) -125, var11.anInt271)
                            });
                          }
                        }

                        if (TextureSampler27.aClass11_3087 == var11) {
                          var21 = var11.anInt218;
                          var45 = SceneGraphTile.aClass94_2216;
                        }

                        if (!var11.aBoolean233) {
                          var45 = FileCacheRequester.method1303(var11, var45, 0);
                        }

                        var34.draw(var45, var13, var14, var11.anInt168, var11.anInt193, var21,
                          !var11.aBoolean215 ? -1 : 0, var11.anInt194, var11.anInt225,
                          var11.anInt205);
                      } else if (GameStub.aBoolean6) {
                        DummyClass29.method909(-13, var11);
                      }
                    } else if (var11.anInt187 != 5) {
                      ItemConfig var42;
                      if (var11.anInt187 == 6) {
                        boolean var41 = InventoryConfig.method609(var11, 110);
                        AbstractModel var38 = null;
                        if (var41) {
                          var21 = var11.anInt198;
                        } else {
                          var21 = var11.anInt305;
                        }

                        var23 = 0;
                        if ((var11.anInt192 != -1)) {
                          var42 = DummyClass35.getItemConfig(var11.anInt192, (byte) 76);
                          if (var42 != null) {
                            var42 = var42.method1106(var11.anInt271, 78);
                            AnimationSequence var52 =
                              (var21 == -1) ? null : GameClient.method45(var21, (byte) -20);
                            var38 = var42.getModel(100, var11.anInt260, var11.anInt267, var52, 1,
                              var11.anInt283);
                            if (var38 == null) {
                              DummyClass29.method909(116, var11);
                            } else {
                              var23 = -var38.getMinimumY() / 2;
                            }
                          }
                        } else if (var11.anInt202 != 5) {
                          if ((var21 == -1)) {
                            var38 = var11.method865(-1, null, -1, 126, 0, var41,
                              TextureCache.localPlayer.appearance);
                            if (var38 == null && GameStub.aBoolean6) {
                              DummyClass29.method909(122, var11);
                            }
                          } else {
                            AnimationSequence var48 = GameClient.method45(var21, (byte) -20);
                            var38 = var11.method865(var11.anInt260, var48, var11.anInt283, 127,
                              var11.anInt267, var41, TextureCache.localPlayer.appearance);
                            if (var38 == null && GameStub.aBoolean6) {
                              DummyClass29.method909(3, var11);
                            }
                          }
                        } else if (var11.anInt201 == -1) {
                          var38 =
                            DummyClass49.aClass52_1112.method1165(null, -1, null, null, 0, -1, 100,
                              0, true, -1, -1);
                        } else {
                          var24 = 2047 & var11.anInt201;
                          if ((var24 == WidgetAccess.localPlayerId)) {
                            var24 = 2047;
                          }

                          Player var49 = TextureSampler0.players[var24];
                          AnimationSequence var56 =
                            var21 == -1 ? null : GameClient.method45(var21, (byte) -20);
                          if (var49 != null
                              && (((int) var49.name.toBase37() << 11) == (
                            -2048 & var11.anInt201))) {
                            var38 =
                              var49.appearance.method1165(null, -1, null, var56, 0, -1, -126, 0,
                                true, var11.anInt283, 0);
                          }
                        }

                        if (var38 != null) {
                          if ((var11.anInt184 > 0)) {
                            var24 = (var11.anInt168 << 8) / var11.anInt184;
                          } else {
                            var24 = 256;
                          }

                          if (var11.anInt312 <= 0) {
                            var25 = 256;
                          } else {
                            var25 = (var11.anInt193 << 8) / var11.anInt312;
                          }

                          var26 = var13 + (var11.anInt168 / 2) + (var24 * var11.anInt259
                            >> 8);
                          var47 =
                            var11.anInt193 / 2 + var14 + (var25 * var11.anInt230 >> 8);
                          if (GlRenderer.useOpenGlRenderer) {
                            if (var11.aBoolean181) {
                              GlRenderer.ortho(var26, var47, var11.anInt164, var11.aShort293, var24,
                                var25);
                            } else {
                              GlRenderer.method1821(var26, var47, var24, var25);
                              GlRenderer.method1825(var11.aShort169,
                                1.5F * var11.aShort293);
                            }

                            GlRenderer.method1846();
                            GlRenderer.setDepthTestEnabled(true);
                            GlRenderer.setFogEnabled(false);
                            TextureSampler29.setupDefaultSun(AbstractFileRequest.brightnessSetting);
                            if (DummyOutputStream.aBoolean47) {
                              GlUtils.resetClip();
                              GlRenderer.method1841();
                              GlUtils.clip(x, y, width, height);
                              DummyOutputStream.aBoolean47 = false;
                            }

                            if (var11.aBoolean309) {
                              GlRenderer.method1851();
                            }

                            var28 = DummyClass40.SINE_TABLE[var11.rotationX0] * var11.anInt164
                              >> 16;
                            var29 = var11.anInt164 * DummyClass40.COSINE_TABLE[var11.rotationX0]
                              >> 16;
                            if (var11.aBoolean233) {
                              var38.draw(0, var11.rotationY, var11.rotationZ, var11.rotationX0,
                                var11.anInt258, var11.anInt264 + var28 + var23,
                                var11.anInt264 + var29, -1L);
                            } else {
                              var38.draw(0, var11.rotationY, 0, var11.rotationX0, 0, var28, var29,
                                -1L);
                            }

                            if (var11.aBoolean309) {
                              GlRenderer.method1830();
                            }
                          } else {
                            DummyClass40.method1145(var26, var47);
                            var28 = DummyClass40.SINE_TABLE[var11.rotationX0] * var11.anInt164
                              >> 16;
                            var29 = var11.anInt164 * DummyClass40.COSINE_TABLE[var11.rotationX0]
                              >> 16;
                            if (!var11.aBoolean233) {
                              var38.draw(0, var11.rotationY, 0, var11.rotationX0, 0, var28, var29,
                                -1L);
                            } else if (var11.aBoolean181) {
                              ((SoftwareModel) var38).method1946(0, var11.rotationY,
                                var11.rotationZ, var11.rotationX0, var11.anInt258,
                                var11.anInt264 + var23 + var28, var29 + var11.anInt264,
                                var11.anInt164);
                            } else {
                              var38.draw(0, var11.rotationY, var11.rotationZ, var11.rotationX0,
                                var11.anInt258, var11.anInt264 + (var28 + var23),
                                var29 + var11.anInt264, -1L);
                            }

                            DummyClass40.method1141();
                          }
                        }
                      } else {
                        if ((var11.anInt187 == 7)) {
                          var34 = var11.method868(TextureSampler0.aClass109Array3270, 0);
                          if (var34 == null) {
                            if (GameStub.aBoolean6) {
                              DummyClass29.method909(-115, var11);
                            }
                            continue;
                          }

                          var21 = 0;

                          for (var22 = 0; var11.anInt244 > var22; ++var22) {
                            for (var23 = 0; var23 < var11.anInt177; ++var23) {
                              if (var11.anIntArray254[var21] > 0) {
                                var42 = DummyClass35.getItemConfig(var11.anIntArray254[var21] - 1,
                                  (byte) 104);
                                GameString var40;
                                if (var42.anInt764 != 1 &&
                                    var11.anIntArray317[var21] == 1) {
                                  var40 = RenderAnimation.concat(new GameString[] {
                                    TextureSampler6.aClass94_3042, var42.aClass94_770,
                                    StringNode.aClass94_2584
                                  });
                                } else {
                                  var40 = RenderAnimation.concat(new GameString[] {
                                    TextureSampler6.aClass94_3042, var42.aClass94_770,
                                    ClassCheckRequest.aClass94_2306,
                                    HuffmanEncoder.method1013((byte) -100,
                                      var11.anIntArray317[var21])
                                  });
                                }

                                var26 = var13 + var23 * (var11.anInt285 + 115);
                                var47 = (var11.anInt290 + 12) * var22 + var14;
                                if ((var11.anInt194 == 0)) {
                                  var34.method681(var40, var26, var47,
                                      var11.anInt218,
                                      var11.aBoolean215 ? 0 : -1);
                                } else {
                                  if ((var11.anInt194 == 1)) {
                                    var34.draw(var40, 57 + var26, var47,
                                        var11.anInt218,
                                        !var11.aBoolean215 ? -1 : 0);
                                  } else {
                                    var34.method688(var40, -1 + var26 + 115,
                                        var47, var11.anInt218,
                                        !var11.aBoolean215 ? -1 : 0);
                                  }
                                }
                              }

                              ++var21;
                            }
                          }
                        }

                        if (var11.anInt187 == 8 && DummyClass29.aClass11_439 == var11
                          && (AbstractSomethingTexture.anInt1109 == TextureSampler35.anInt3323)) {
                          var21 = 0;
                          var20 = 0;
                          GameString var43 = var11.aClass94_232;
                          AbstractFont var35 = SomethingTilek.p12Font;
                          var43 = FileCacheRequester.method1303(var11, var43, 0);

                          GameString var44;
                          while ((var43.getLength() > 0)) {
                            var25 = var43.indexOf(Buffer.LINE_BREAK);
                            if (var25 == -1) {
                              var44 = var43;
                              var43 = GroundItemNode.EMPTY_STRING;
                            } else {
                              var44 = var43.substring(var25, 0, 0);
                              var43 = var43.substring(var25 + 4);
                            }

                            var26 = var35.method682(var44);
                            var21 += var35.anInt3727 + 1;
                            if ((var20 < var26)) {
                              var20 = var26;
                            }
                          }

                          var26 = var14 + var11.anInt193 + 5;
                          var20 += 6;
                          var21 += 7;
                          if ((var26 + var21) > height) {
                            var26 = -var21 + height;
                          }

                          var25 = -var20 - 5 + var13 + var11.anInt168;
                          if (var25 < 5 + var13) {
                            var25 = 5 + var13;
                          }

                          if ((var20 + var25) > width) {
                            var25 = -var20 + width;
                          }

                          if (GlRenderer.useOpenGlRenderer) {
                            GlUtils.fillQuad(var25, var26, var20, var21, 16777120);
                            GlUtils.drawQuad(var25, var26, var20, var21, 0);
                          } else {
                            DummyClass47.method1323(var25, var26, var20, var21, 16777120);
                            DummyClass47.method1311(var25, var26, var20, var21, 0);
                          }

                          var43 = var11.aClass94_232;
                          var47 = 2 + (var26 + var35.anInt3727);

                          for (
                            var43 = FileCacheRequester.method1303(var11, var43, 0);
                            (var43.getLength() > 0); var47 += var35.anInt3727 + 1) {
                            var28 = var43.indexOf(Buffer.LINE_BREAK);
                            if ((var28 == -1)) {
                              var44 = var43;
                              var43 = GroundItemNode.EMPTY_STRING;
                            } else {
                              var44 = var43.substring(var28, 0, 0);
                              var43 = var43.substring(4 + var28);
                            }

                            var35.method681(var44, 3 + var25, var47, 0, -1);
                          }
                        }

                        if ((var11.anInt187 == 9)) {
                          if (var11.aBoolean167) {
                            var20 = var13;
                            var22 = var13 + var11.anInt168;
                            var21 = var14 + var11.anInt193;
                            var23 = var14;
                          } else {
                            var20 = var13;
                            var21 = var14;
                            var23 = var14 + var11.anInt193;
                            var22 = var13 + var11.anInt168;
                          }

                          if (var11.anInt250 == 1) {
                            if (GlRenderer.useOpenGlRenderer) {
                              GlUtils.method933(var20, var21, var22, var23,
                                  var11.anInt218);
                            } else {
                              DummyClass47
                                  .method1328(var20, var21, var22, var23,
                                      var11.anInt218);
                            }
                          } else if (!GlRenderer.useOpenGlRenderer) {
                            DummyClass47.method1322(var20, var21, var22, var23, var11.anInt218,
                              var11.anInt250);
                          } else {
                            GlUtils.method929(var20, var21, var22, var23, var11.anInt218,
                              var11.anInt250);
                          }
                        }
                      }
                    } else {
                      AbstractDirectColorSprite var37;
                      if (var11.aBoolean233) {
                        if (var11.anInt192 == -1) {
                          var37 = var11.method866((byte) -113, false);
                        } else {
                          var37 = MonoChromaticImageCache
                              .method1707(var11.anInt288, var11.anInt192,
                                  var11.aBoolean227, var11.anInt271,
                                  var11.anInt287, 65536);
                        }

                        if (var37 == null) {
                          if (GameStub.aBoolean6) {
                            DummyClass29.method909(-40, var11);
                          }
                        } else {
                          var21 = var37.anInt3697;
                          var22 = var37.anInt3706;
                          if (var11.aBoolean186) {
                            var23 = (var21 - 1 + var11.anInt168) / var21;
                            var24 = (var11.anInt193 - 1 + var22) / var22;
                            if (GlRenderer.useOpenGlRenderer) {
                              GlUtils.method931(var13, var14,
                                  var11.anInt168 + var13,
                                  var11.anInt193 + var14);
                              var39 = Projectile
                                  .isPo2((byte) -94, var37.anInt3707);
                              var46 = Projectile
                                  .isPo2((byte) -113, var37.anInt3696);
                              GlDirectColorSprite var27 = (GlDirectColorSprite) var37;
                              if (var39 && var46) {
                                if (var15 == 0) {
                                  var27.method649(var13, var14, var23, var24);
                                } else {
                                  var27.method646(var13, var14,
                                      -(255 & var15) + 256, var23, var24);
                                }
                              } else if (var39) {
                                for (var28 = 0; var24 > var28; ++var28) {
                                  if ((var15 == 0)) {
                                    var27
                                        .method649(var13, var28 * var22 + var14,
                                            var23, 1);
                                  } else {
                                    var27
                                        .method646(var13, var14 + var28 * var22,
                                            256 - (var15 & 255), var23, 1);
                                  }
                                }
                              } else if (!var46) {
                                for (var28 = 0; (var28 < var23); ++var28) {
                                  for (var29 = 0; var24 > var29; ++var29) {
                                    if (var15 == 0) {
                                      var37.method643(var13 + (var21 * var28),
                                          var22 * var29 + var14);
                                    } else {
                                      var37.method637(var28 * var21 + var13,
                                          var22 * var29 + var14,
                                          -(255 & var15) + 256);
                                    }
                                  }
                                }
                              } else {
                                for (var28 = 0; var23 > var28; ++var28) {
                                  if ((var15 == 0)) {
                                    var27
                                        .method649(var21 * var28 + var13, var14,
                                            1, var24);
                                  } else {
                                    var27
                                        .method646(var21 * var28 + var13, var14,
                                            -(var15 & 255) + 256, 1, var24);
                                  }
                                }
                              }

                              GlUtils.clip(x, y, width, height);
                            } else {
                              DummyClass47.method1326(var13, var14,
                                  var13 + var11.anInt168,
                                  var14 + var11.anInt193);

                              for (var25 = 0; var25 < var23; ++var25) {
                                for (var26 = 0; (var26 < var24); ++var26) {
                                  if (var11.anInt301 == 0) {
                                    if (var15 == 0) {
                                      var37.method643(var25 * var21 + var13,
                                          var22 * var26 + var14);
                                    } else {
                                      var37.method637(var25 * var21 + var13,
                                          var14 + var26 * var22,
                                          256 - (255 & var15));
                                    }
                                  } else {
                                    var37.method640(
                                        var14 + (var22 * var26) + var22 / 2,
                                        var11.anInt301, 4096,
                                        var25 * var21 + var13 + var21 / 2,
                                        -1470985020);
                                  }
                                }
                              }

                              DummyClass47.method1324(x, y, width, height);
                            }
                          } else {
                            var23 = var11.anInt168 * 4096 / var21;
                            if ((var11.anInt301 == 0)) {
                              if (var15 != 0) {
                                var37.method642(var13, var14, var11.anInt168,
                                    var11.anInt193,
                                    -(255 & var15) + 256);
                              } else if ((var21 == var11.anInt168)
                                  && (var22 == var11.anInt193)) {
                                var37.method643(var13, var14);
                              } else {
                                var37.draw(var13, var14, var11.anInt168,
                                    var11.anInt193);
                              }
                            } else {
                              var37.method640(var14 + var11.anInt193 / 2,
                                  var11.anInt301, var23,
                                  var13 + var11.anInt168 / 2, -1470985020);
                            }
                          }
                        }
                      } else {
                        var37 = var11.method866((byte) -113,
                            InventoryConfig.method609(var11, 69));
                        if (var37 != null) {
                          var37.method643(var13, var14);
                        } else if (GameStub.aBoolean6) {
                          DummyClass29.method909(118, var11);
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }

      if (var8 <= 31) {
        Cache.quickchats = null;
      }
  }

  public static void method1096(byte var0) {
    Cache.quickchats = null;
      if (var0 < 84) {
        Cache.method1091(true, -127);
      }

      Cache.aClass94_750 = null;
      Cache.aClass93_743 = null;
  }

  public static void method1098(byte var0) {
    if ((AreaSoundEffect.anInt2309 < 128)) {
        AreaSoundEffect.anInt2309 = 128;
      }

      if ((AreaSoundEffect.anInt2309 > 383)) {
        AreaSoundEffect.anInt2309 = 383;
      }

      SpotAnimationConfig.anInt531 &= 2047;
      if (var0 >= -31) {
        Cache.quickchats = null;
      }

      int var1 = TextureSampler20.anInt3155 >> 7;
      int var2 = FileTable.anInt942 >> 7;
      int var3 =
        BufferData.method1736(GameWorldSomething.currentPlane, 1, TextureSampler20.anInt3155,
          FileTable.anInt942);
      int var4 = 0;
      int var5;
      if ((var1 > 3) && var2 > 3 && var1 < 100 && var2 < 100) {
        for (var5 = -4 + var1; var1 + 4 >= var5; ++var5) {
          for (int var6 = -4 + var2; var6 <= 4 + var2; ++var6) {
            int var7 = GameWorldSomething.currentPlane;
            if (var7 < 3 && (2 & BZipDecompressorState.tileFlags[1][var5][var6])
                == 2) {
              ++var7;
            }

            int var8 = (255 & SceneShadowMap.aByteArrayArrayArray1774[var7][var5][var6]) * 8
              - AbstractGameWorld.heightMap[var7][var5][var6] + var3;
            if (var8 > var4) {
              var4 = var8;
            }
          }
        }
      }

      var5 = 192 * var4;
      if ((var5 > 98048)) {
        var5 = 98048;
      }

      if ((var5 < 32768)) {
        var5 = '\u8000';
      }

      if ((SomethingTexture4.anInt2670 >= var5)) {
        if ((var5 < SomethingTexture4.anInt2670)) {
          SomethingTexture4.anInt2670 += (var5 - SomethingTexture4.anInt2670) / 80;
        }
      } else {
        SomethingTexture4.anInt2670 += (-SomethingTexture4.anInt2670 + var5) / 24;
      }
  }

  public static int repackHSL(int lightness, boolean var1, int hsl) {
    if ((hsl == -1)) {
        return 12345678;
      } else {

        lightness = lightness * (127 & hsl) >> 7;
        if (lightness >= 2) {
          if (lightness > 126) {
            lightness = 126;
          }
        } else {
          lightness = 2;
        }

        return lightness + ('\uff80' & hsl);
      }
  }

}
