package com.jagex.runescape;

public final class GroundItemNode extends SubNode {

  public static boolean aBoolean3668;
  public static byte[][] updatedMapsData;
  public static int anInt3670;
  public static int anInt3671;
  public static GameString EMPTY_STRING = GameString.create("");
  public static GameString password = GroundItemNode.EMPTY_STRING;
  public static boolean[] aBooleanArray3674 = new boolean[100];
  public static GameString username = GroundItemNode.EMPTY_STRING;
  public static int anInt3677;
  public GroundItem aClass140_Sub7_3676;


  public GroundItemNode(GroundItem var1 ) {
    this.aClass140_Sub7_3676 = var1;
  }

  public static void method626(int var0) {
    if (Buffer.aClass3_Sub28_Sub3_2600 != null) {
        if (GameObject.anInt2737 < 10) {
          if (!TextureSampler23.worldMaps.method2127((byte) -83,
            Buffer.aClass3_Sub28_Sub3_2600.aClass94_3561)) {
            GameObject.anInt2737 = SomethingPacket116.worldMapData.method2116(22813,
              Buffer.aClass3_Sub28_Sub3_2600.aClass94_3561) / 10;
            return;
          }

          TextureSampler12.method169(var0 ^ 22166);
          GameObject.anInt2737 = 10;
        }

        if ((GameObject.anInt2737 == 10)) {
          TextureSampler37.anInt3256 = Buffer.aClass3_Sub28_Sub3_2600.anInt3555 >> 6 << 6;
          MapScene.anInt65 = Buffer.aClass3_Sub28_Sub3_2600.anInt3562 >> 6 << 6;
          DummyClass58.anInt1460 =
            (Buffer.aClass3_Sub28_Sub3_2600.anInt3549 >> 6 << 6) - MapScene.anInt65 + 64;
          DummyClass30.anInt455 =
            64 + (Buffer.aClass3_Sub28_Sub3_2600.anInt3559 >> 6 << 6) + -TextureSampler37.anInt3256;
          if (Buffer.aClass3_Sub28_Sub3_2600.anInt3563 == 37) {
            AbstractGameWorld.aFloat727 = 3.0F;
            NPC.aFloat3979 = 3.0F;
          } else {
            if ((Buffer.aClass3_Sub28_Sub3_2600.anInt3563 == 50)) {
              AbstractGameWorld.aFloat727 = 4.0F;
              NPC.aFloat3979 = 4.0F;
            } else {
              if (Buffer.aClass3_Sub28_Sub3_2600.anInt3563 == 75) {
                AbstractGameWorld.aFloat727 = 6.0F;
                NPC.aFloat3979 = 6.0F;
              } else if ((Buffer.aClass3_Sub28_Sub3_2600.anInt3563 != 100)) {
                if (Buffer.aClass3_Sub28_Sub3_2600.anInt3563 == 200) {
                  AbstractGameWorld.aFloat727 = 16.0F;
                  NPC.aFloat3979 = 16.0F;
                } else {
                  AbstractGameWorld.aFloat727 = 8.0F;
                  NPC.aFloat3979 = 8.0F;
                }
              } else {
                AbstractGameWorld.aFloat727 = 8.0F;
                NPC.aFloat3979 = 8.0F;
              }
            }
          }

          int var1 = -TextureSampler37.anInt3256 + (TextureCache.localPlayer.anInt2819 >> 7)
            + WorldMapLabel.anInt1716;
          var1 += -5 + (int) (Math.random() * 10.0D);
          int var2 = -ProceduralTexture.anInt1152 + -(TextureCache.localPlayer.anInt2829 >> 7)
            + MapScene.anInt65 + -1 + DummyClass58.anInt1460;
          var2 += -5 + (int) (Math.random() * 10.0D);
          if ((var1 >= 0) && DummyClass30.anInt455 > var1 && var2 >= 0
            && (var2 < DummyClass58.anInt1460)) {
            SomethingQuickChat2.anInt3536 = var1;
            SpawnedGameObject.anInt2251 = var2;
          } else {
            SpawnedGameObject.anInt2251 =
              MapScene.anInt65 - Buffer.aClass3_Sub28_Sub3_2600.anInt3556 * 64
                + DummyClass58.anInt1460 + -1;
            SomethingQuickChat2.anInt3536 =
              Buffer.aClass3_Sub28_Sub3_2600.anInt3558 * 64 + -TextureSampler37.anInt3256;
          }

          SomethingInScenePacket202.method117((byte) 87);
          DummyClass51.anIntArray1161 = new int[1 + ScriptState.amountFloors];
          int var4 = DummyClass58.anInt1460 >> 6;
          int var3 = DummyClass30.anInt455 >> 6;
          StringNode0.aByteArrayArrayArray2339 = new byte[var3][var4][];
          int var5 = TextureSampler31.anInt3158 >> 2 << 10;
          HuffmanEncoder.aByteArrayArrayArray640 = new byte[var3][var4][];
          AbstractGameWorld.anIntArrayArrayArray720 = new int[var3][var4][];
          RenderAnimation.aByteArrayArrayArray383 = new byte[var3][var4][];
          AbstractMouseWheel.anIntArrayArrayArray1903 = new int[var3][var4][];
          TextureSampler29.aByteArrayArrayArray3390 = new byte[var3][var4][];
          int var6 = AbstractIndexedColorSprite.anInt1463 >> 1;
          ClientScriptCall.aByteArrayArrayArray2452 = new byte[var3][var4][];
          PlayerVariable.anIntArrayArrayArray558 = new int[var3][var4][];
          HuffmanEncoder.method1014(-120, var6, var5);
          GameObject.anInt2737 = 20;
        } else if (GameObject.anInt2737 != 20) {
          if (var0 != 64) {
            GroundItemNode.method628(-40, -12, 40, null);
          }

          if (GameObject.anInt2737 == 30) {
            DummyClass7.method2219(new Buffer(
              TextureSampler23.worldMaps.method2123(0, DummyClass18.aClass94_85,
                Buffer.aClass3_Sub28_Sub3_2600.aClass94_3561)), false);
            GameObject.anInt2737 = 40;
            SomethingTexture4.resetFrameRegulator();
          } else if ((GameObject.anInt2737 != 40)) {
            if (GameObject.anInt2737 == 50) {
              HintMarker.method1587((byte) -83, new Buffer(
                  TextureSampler23.worldMaps
                      .method2123(var0 + -64, SomethingSceneI.aClass94_422,
                          Buffer.aClass3_Sub28_Sub3_2600.aClass94_3561)));
              GameObject.anInt2737 = 60;
              DummyClass5.method2210((byte) -90, true);
              SomethingTexture4.resetFrameRegulator();
            } else {
              if ((GameObject.anInt2737 == 60)) {
                if (TextureSampler23.worldMaps
                    .method2135(RenderAnimation.concat(new GameString[]{
                        Buffer.aClass3_Sub28_Sub3_2600.aClass94_3561,
                        SomethingAudio.aClass94_2003
                    }), -106)) {
                  if (!TextureSampler23.worldMaps.method2127((byte) -83,
                      RenderAnimation.concat(new GameString[]{
                          Buffer.aClass3_Sub28_Sub3_2600.aClass94_3561,
                          SomethingAudio.aClass94_2003
                      }))) {
                    return;
                  }

                  DummyClass25.aClass131_1624 =
                      DummyClass50.method1403(var0 + -120,
                          RenderAnimation.concat(new GameString[]{
                              Buffer.aClass3_Sub28_Sub3_2600.aClass94_3561,
                              SomethingAudio.aClass94_2003
                          }), TextureSampler23.worldMaps);
                } else {
                  DummyClass25.aClass131_1624 = new WorldMapLabel(0);
                }

                GameObject.anInt2737 = 70;
                SomethingTexture4.resetFrameRegulator();
              } else if (GameObject.anInt2737 == 70) {
                Something3d2.aClass33_3019 = new SomethingFont(11, true,
                    GameCanvas.INSTANCE);
                GameObject.anInt2737 = 73;
                DummyClass5.method2210((byte) -90, true);
                SomethingTexture4.resetFrameRegulator();
              } else if (GameObject.anInt2737 != 73) {
                if ((GameObject.anInt2737 == 76)) {
                  DummyClass54.aClass33_1399 = new SomethingFont(14, true,
                      GameCanvas.INSTANCE);
                  GameObject.anInt2737 = 79;
                  DummyClass5.method2210((byte) -90, true);
                  SomethingTexture4.resetFrameRegulator();
                } else if ((GameObject.anInt2737 == 79)) {
                  SomethingTexture1.aClass33_2637 =
                      new SomethingFont(17, true, GameCanvas.INSTANCE);
                  GameObject.anInt2737 = 82;
                  DummyClass5.method2210((byte) -90, true);
                  SomethingTexture4.resetFrameRegulator();
                } else if ((GameObject.anInt2737 == 82)) {
                  DummyClass25.aClass33_1626 = new SomethingFont(19, true,
                      GameCanvas.INSTANCE);
                  GameObject.anInt2737 = 85;
                  DummyClass5.method2210((byte) -90, true);
                  SomethingTexture4.resetFrameRegulator();
                } else if (GameObject.anInt2737 == 85) {
                  SomethingTexture1.aClass33_2648 =
                      new SomethingFont(22, true, GameCanvas.INSTANCE);
                  GameObject.anInt2737 = 88;
                  DummyClass5.method2210((byte) -90, true);
                  SomethingTexture4.resetFrameRegulator();
                } else if (GameObject.anInt2737 != 88) {
                  CollisionMap.aClass33_1305 = new SomethingFont(30, true,
                      GameCanvas.INSTANCE);
                  GameObject.anInt2737 = 100;
                  DummyClass5.method2210((byte) -90, true);
                  SomethingTexture4.resetFrameRegulator();
                  System.gc();
                } else {
                  DummyClass12.aClass33_2034 = new SomethingFont(26, true,
                      GameCanvas.INSTANCE);
                  GameObject.anInt2737 = 91;
                  DummyClass5.method2210((byte) -90, true);
                  SomethingTexture4.resetFrameRegulator();
                }
              } else {
                SocketStream.aClass33_1238 = new SomethingFont(12, true,
                    GameCanvas.INSTANCE);
                GameObject.anInt2737 = 76;
                DummyClass5.method2210((byte) -90, true);
                SomethingTexture4.resetFrameRegulator();
              }
            }
          } else {
            TextureSampler25.method328(-21774, new Buffer(
              TextureSampler23.worldMaps.method2123(0, TextureSampler1.aClass94_3140,
                Buffer.aClass3_Sub28_Sub3_2600.aClass94_3561)));
            GameObject.anInt2737 = 50;
            SomethingTexture4.resetFrameRegulator();
          }
        } else {
          AudioWorker.method889((byte) 105, new Buffer(
            TextureSampler23.worldMaps.method2123(0, HintMarker.aClass94_1349,
              Buffer.aClass3_Sub28_Sub3_2600.aClass94_3561)));
          GameObject.anInt2737 = 30;
          DummyClass5.method2210((byte) -90, true);
          SomethingTexture4.resetFrameRegulator();
        }
      }
  }

  public static void method627(byte var0) {
    if (var0 <= -112) {
        GroundItemNode.username = null;
        GroundItemNode.password = null;
        GroundItemNode.updatedMapsData = null;
        GroundItemNode.EMPTY_STRING = null;
        GroundItemNode.aBooleanArray3674 = null;
      }
  }

  public static void method628(int var0, int var1, int var2, Player var3) {
    if (var0 != 0) {
        GroundItemNode.aBooleanArray3674 = null;
      }

      if ((var2 == var3.animationId) && (var2 != -1)) {
        AnimationSequence var4 = GameClient.method45(var2, (byte) -20);
        int var5 = var4.anInt1845;
        if (var5 == 1) {
          var3.anInt2828 = var1;
          var3.anInt2760 = 0;
          var3.anInt2776 = 1;
          var3.anInt2832 = 0;
          var3.anInt2773 = 0;
          SocketStream.method1470(var3.anInt2829, var4, var0 + 183921384, var3.anInt2819,
            TextureCache.localPlayer == var3, var3.anInt2832);
        }

        if (var5 == 2) {
          var3.anInt2773 = 0;
        }
      } else if (var2 == -1 || var3.animationId == -1
        || GameClient.method45(var2, (byte) -20).anInt1857 >= GameClient.method45(var3.animationId,
        (byte) -20).anInt1857) {
        var3.anInt2776 = 1;
        var3.anInt2832 = 0;
        var3.anInt2828 = var1;
        var3.anInt2811 = var3.anInt2816;
        var3.anInt2773 = 0;
        var3.anInt2760 = 0;
        var3.animationId = var2;
        if (var3.animationId != -1) {
          SocketStream.method1470(var3.anInt2829, GameClient.method45(var3.animationId, (byte) -20),
            183921384, var3.anInt2819, var3 == TextureCache.localPlayer, var3.anInt2832);
        }
      }
  }

}
