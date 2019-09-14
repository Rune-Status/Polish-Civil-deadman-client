package com.jagex.runescape;

import com.jagex.runescape.opengl.DummyClass33;
import com.jagex.runescape.opengl.GlRenderer;
import java.nio.charset.StandardCharsets;

public final class FileCacheRequester implements Runnable {

  public static boolean aBoolean1080;
  public static int anInt1081;
  public static int anInt1082;
  public static int[] anIntArray1083;
  public static boolean aBoolean1084;
  public static GameString aClass94_1085 = GameString.create("brillant1:");
  public static int anInt1088;
  public static GameString aClass94_1089 = GameString.create("Chargement des sprites )2 ");
  public int anInt1087;
  private final Queue aClass13_1086 = new Queue();
  private Thread aThread1090;
  private boolean aBoolean1091;


  public FileCacheRequester() {
    SignLinkRequest var1 = DummyClass35.signLink.createThread(0, 5, this);

      assert var1 != null;
      while ((var1.status == 0)) {
        TextureSampler25.sleep(10L);
      }

      if (var1.status == 2) {
        throw new RuntimeException();
      } else {
        this.aThread1090 = (Thread) var1.result;
      }
  }

  private void method1299(FileCacheRequest var1, int var2) {
    Queue var3 = this.aClass13_1086;
      synchronized (var3) {
        if (var2 != 104) {
          this.shutdown(-114);
        }

        this.aClass13_1086.addLast(var1);
        ++this.anInt1087;
        this.aClass13_1086.notifyAll();
      }
  }

  public void shutdown(int var1 ) {
    this.aBoolean1091 = true;
      Queue var2 = this.aClass13_1086;
      synchronized (var2) {
        this.aClass13_1086.notifyAll();
      }

      try {
        this.aThread1090.join();
      } catch (InterruptedException var4) {
      }

      this.aThread1090 = null;
  }

  public FileCacheRequest method1305(FileCache var1, int var2, byte[] var3,
      int var4 ) {
    FileCacheRequest var5 = new FileCacheRequest();
      var5.aByteArray4059 = var3;
      var5.aBoolean3628 = false;
      var5.subnodeKey = var4;
      var5.aClass41_4056 = var1;
      var5.anInt4061 = var2;
      this.method1299(var5, 104);
      return var5;
  }

  public FileCacheRequest method1307(int var1, int var2, FileCache var3 ) {
    FileCacheRequest var4 = new FileCacheRequest();
      var4.aClass41_4056 = var3;
      var4.anInt4061 = 3;
      var4.aBoolean3628 = false;
      if (var2 != -27447) {
        FileCacheRequester.aBoolean1084 = false;
      }

      var4.subnodeKey = var1;
      this.method1299(var4, 104);
      return var4;
  }

  public FileCacheRequest method1309(FileCache var1, byte var2, int var3 ) {
    FileCacheRequest var4 = new FileCacheRequest();
      var4.anInt4061 = 1;
      Queue var5 = this.aClass13_1086;
      synchronized (var5) {
        if (var2 < 39) {
          return null;
        }

        FileCacheRequest var6 = (FileCacheRequest) this.aClass13_1086.getFirst();

        while (true) {
          if (var6 == null) {
            break;
          }

          if ((var6.subnodeKey == var3) && var6.aClass41_4056 == var1
            && var6.anInt4061 == 2) {
            var4.aByteArray4059 = var6.aByteArray4059;
            var4.aBoolean3632 = false;
            return var4;
          }

          var6 = (FileCacheRequest) this.aClass13_1086.getNext();
        }
      }

      var4.aByteArray4059 = var1.method1051(var3, (byte) 85);
      var4.aBoolean3632 = false;
      var4.aBoolean3628 = true;
      return var4;
  }

  public void run() {
    while (!this.aBoolean1091) {
        Queue var2 = this.aClass13_1086;
        FileCacheRequest var1;
        synchronized (var2) {
          var1 = (FileCacheRequest) this.aClass13_1086.poll();
          if (var1 == null) {
            try {
              this.aClass13_1086.wait();
            } catch (InterruptedException var6) {
            }
            continue;
          }

          --this.anInt1087;
        }

        try {
          if (var1.anInt4061 == 2) {
            var1.aClass41_4056
                .method1050((int) var1.subnodeKey, var1.aByteArray4059.length,
                    var1.aByteArray4059, (byte) -41);
          } else {
            if ((var1.anInt4061 == 3)) {
              var1.aByteArray4059 =
                  var1.aClass41_4056
                      .method1051((int) var1.subnodeKey, (byte) -77);
            }
          }
        } catch (Exception var5) {
          GZipDecompressor.reportError(null, var5, (byte) 111);
        }

        var1.aBoolean3632 = false;
      }
  }

  public static AbstractFont createFont(int var0, int var1, byte var2, FileUnpacker var3,
                                       FileUnpacker var4) {
    if (var2 < 123) {
        FileCacheRequester.aBoolean1080 = false;
      }

      return !SomethingTexture4.loadSprites(var3, var0, var1, -30901) ?
        null :
        Queue.createFont(-22376, var4.getBytes(var1, var0));
  }

  public static void rebuildScene(int plane, int var1, int var2, int y, boolean var4, int x,
                                 boolean var6) {
    if (AbstractObjectNode.anInt3606 != var2 || (var1 != VariableUpdate.anInt2294)
        || (GameObject.plane != plane) && !NPC.method1986(45)) {
        AbstractObjectNode.anInt3606 = var2;
        VariableUpdate.anInt2294 = var1;
        GameObject.plane = plane;
        if (NPC.method1986(105)) {
          GameObject.plane = 0;
        }

        if (var4) {
          DummyClass26.setState(28, 5);
        } else {
          DummyClass26.setState(25, 5);
        }

        AbstractTextureSampler.drawLoadingBox(TextureSampler39.LOADING_PLEASE_WAIT, true);
        int var8 = ProceduralTexture.anInt1152;
        int var7 = WorldMapLabel.anInt1716;
        ProceduralTexture.anInt1152 = var1 * 8 - 48;
        WorldMapLabel.anInt1716 = 8 * (-6 + var2);
        TextureSampler37.aClass3_Sub28_Sub3_3264 =
          Queue.method884(8 * AbstractObjectNode.anInt3606, (byte) 88,
            8 * VariableUpdate.anInt2294);
        int var10 = -var8 + ProceduralTexture.anInt1152;
        int var9 = WorldMapLabel.anInt1716 - var7;
        var7 = WorldMapLabel.anInt1716;
        var8 = ProceduralTexture.anInt1152;
        TextureSampler22.aClass131_3421 = null;
        int var11;
        NPC var12;
        int var13;
        if (var4) {
          DummyClass6.anInt2046 = 0;

          for (var11 = 0; (var11 < 32768); ++var11) {
            var12 = TextureSampler5.npcs[var11];
            if (var12 != null) {
              var12.anInt2819 -= 128 * var9;
              var12.anInt2829 -= 128 * var10;
              if ((var12.anInt2819 >= 0) && (var12.anInt2819 <= 13184)
                  && (var12.anInt2829 >= 0)
                  && (var12.anInt2829 <= 13184)) {
                for (var13 = 0; var13 < 10; ++var13) {
                  var12.waypointsX[var13] -= var9;
                  var12.waypointsY[var13] -= var10;
                }

                AudioWorker.anIntArray347[DummyClass6.anInt2046++] = var11;
              } else {
                TextureSampler5.npcs[var11].setConfiguration(-1, null);
                TextureSampler5.npcs[var11] = null;
              }
            }
          }
        } else {
          for (var11 = 0; var11 < '\u8000'; ++var11) {
            var12 = TextureSampler5.npcs[var11];
            if (var12 != null) {
              for (var13 = 0; var13 < 10; ++var13) {
                var12.waypointsX[var13] -= var9;
                var12.waypointsY[var13] -= var10;
              }

              var12.anInt2819 -= 128 * var9;
              var12.anInt2829 -= var10 * 128;
            }
          }
        }

        for (var11 = 0; var11 < 2048; ++var11) {
          Player var23 = TextureSampler0.players[var11];
          if (var23 != null) {
            for (var13 = 0; var13 < 10; ++var13) {
              var23.waypointsX[var13] -= var9;
              var23.waypointsY[var13] -= var10;
            }

            var23.anInt2819 -= 128 * var9;
            var23.anInt2829 -= 128 * var10;
          }
        }

        GameWorldSomething.currentPlane = plane;
        TextureCache.localPlayer.setPosition((byte) 126, x, false, y);
        byte var25 = 104;
        byte var24 = 0;
        byte var14 = 0;
        byte var16 = 1;
        byte var15 = 104;
        byte var26 = 1;
        if ((var10 < 0)) {
          var16 = -1;
          var15 = -1;
          var14 = 103;
        }

        if ((var9 < 0)) {
          var26 = -1;
          var24 = 103;
          var25 = -1;
        }

        for (int var17 = var24; (var17 != var25); var17 += var26) {
          for (int var18 = var14; (var15 != var18); var18 += var16) {
            int var19 = var9 + var17;
            int var20 = var18 + var10;

            for (int var21 = 0; var21 < 4; ++var21) {
              if ((var19 >= 0)
                  && (var20 >= 0) && (var19 < 104) && (var20 < 104)) {
                TextureSampler0.groundItems[var21][var17][var18] =
                  TextureSampler0.groundItems[var21][var19][var20];
              } else {
                TextureSampler0.groundItems[var21][var17][var18] = null;
              }
            }
          }
        }

        for (SpawnedGameObject var27 =
             (SpawnedGameObject) TextureSampler26.aClass61_3075.getFirst();
             var27 != null; var27 = (SpawnedGameObject) TextureSampler26.aClass61_3075.getNext()) {
          var27.anInt2248 -= var10;
          var27.anInt2264 -= var9;
          if (var27.anInt2264 < 0 || (var27.anInt2248 < 0) || var27.anInt2264 >= 104
            || var27.anInt2248 >= 104) {
            var27.unlinkNode();
          }
        }

        if (var4) {
          NPC.anInt3995 -= 128 * var9;
          DummyClass49.anInt1111 -= var10 * 128;
          AbstractMouseWheel.anInt1904 -= var10;
          Mouse.anInt1923 -= var9;
          SomethingAudio.anInt1996 -= var10;
          GameCanvas.anInt30 -= var9;
        } else {
          SomethingPacket116.anInt1753 = 1;
        }

        SomethingLight0.anInt1552 = 0;
        if (DummyClass45.anInt987 != 0) {
          DummyClass38.anInt733 -= var10;
          DummyClass45.anInt987 -= var9;
        }

        if (var6) {
          if (GlRenderer.useOpenGlRenderer && var4 && (Math.abs(var9) > 104 ||
              Math.abs(
                  var10) > 104)) {
            TextureSampler31.method236((byte) 64);
          }

          DummyClass43.anInt909 = -1;
          TextureSampler17.stillGraphics.clear(-122);
          TextureSampler13.projectiles.clear(-87);
        }
      }
  }

  public static WidgetUpdate method1302(byte var0) {
    WidgetUpdate var1 = (WidgetUpdate) SomethingTilek.aClass13_1666.getFirst();
      if (var1 != null) {
        var1.unlinkNode();
        var1.unlinkSubNode();
        return var1;
      } else if (var0 != -36) {
        return null;
      } else {
        do {
          var1 = (WidgetUpdate) DummyClass50.aClass13_1139.getFirst();
          if (var1 == null) {
            return null;
          }

          if (var1.b(true) > Time.getCurrentTimeMillis()) {
            return null;
          }

          var1.unlinkNode();
          var1.unlinkSubNode();
        } while ((Long.MIN_VALUE & var1.subnodeKey) == 0L);

        return var1;
      }
  }

  public static GameString method1303(Widget var0, GameString var1, int var2) {
    if (~var1.indexOf(IdentityKit.aClass94_468) == var2) {
        return var1;
      } else {
        while (true) {
          int var3 = var1.indexOf(SomethingSceneJ.aClass94_331);
          if ((var3 == -1)) {
            while (true) {
              var3 = var1.indexOf(SomethingIndex150.aClass94_2080);
              if (var3 == -1) {
                while (true) {
                  var3 = var1.indexOf(CollisionMap.aClass94_1301);
                  if ((var3 == -1)) {
                    while (true) {
                      var3 = var1.indexOf(PlayerAppearance.aClass94_852);
                      if ((var3 == -1)) {
                        while (true) {
                          var3 = var1.indexOf(TextureSampler22.aClass94_3418);
                          if ((var3 == -1)) {
                            while (true) {
                              var3 = var1
                                  .indexOf(SceneSomething2.aClass94_1051);
                              if ((var3 == -1)) {
                                return var1;
                              }

                              GameString var4 = GroundItemNode.EMPTY_STRING;
                              if (SceneShadowMap.aClass64_1778 != null) {
                                var4 =
                                    DummyClass58.method1653(
                                        SceneShadowMap.aClass64_1778.anInt979,
                                        0);

                                if (SceneShadowMap.aClass64_1778.result != null) {
                                  byte[] var5 =
                                      ((String) SceneShadowMap.aClass64_1778.result)
                                          .getBytes(
                                              StandardCharsets.ISO_8859_1);
                                  var4 = GameStringStatics
                                      .createString(var5, 0, var5.length);
                                }
                              }

                              var1 = RenderAnimation.concat(new GameString[]{
                                  var1.substring(var3, 0, 0), var4,
                                  var1.substring(4 + var3)
                              });
                            }
                          }

                          var1 = RenderAnimation.concat(new GameString[]{
                              var1.substring(var3, 0, 0),
                              DummyClass14.method2148(
                                  Something3d2.method2247((byte) -4, 4, var0),
                                  (byte) -78), var1.substring(var3 + 2)
                          });
                        }
                      }

                      var1 = RenderAnimation.concat(new GameString[]{
                          var1.substring(var3, 0, 0),
                          DummyClass14.method2148(
                              Something3d2.method2247((byte) -109, 3, var0),
                              (byte) -78), var1.substring(2 + var3)
                      });
                    }
                  }

                  var1 = RenderAnimation.concat(new GameString[]{
                      var1.substring(var3, 0, 0),
                      DummyClass14.method2148(
                          Something3d2.method2247((byte) 111, 2, var0),
                          (byte) -78), var1.substring(2 + var3)
                  });
                }
              }

              var1 = RenderAnimation.concat(new GameString[]{
                  var1.substring(var3, 0, 0),
                  DummyClass14.method2148(
                      Something3d2.method2247((byte) 23, 1, var0), (byte) -78),
                  var1.substring(var3 + 2)
              });
            }
          }

          var1 = RenderAnimation.concat(new GameString[]{
              var1.substring(var3, var2, 0),
              DummyClass14.method2148(
                  Something3d2.method2247((byte) 107, 0, var0), (byte) -78),
              var1.substring(2 + var3)
          });
        }
      }
  }

  public static void method1306(int var0) {
    FileCacheRequester.aClass94_1089 = null;
      if (var0 == -16222) {
        FileCacheRequester.aClass94_1085 = null;
        FileCacheRequester.anIntArray1083 = null;
      }
  }

  public static void handleCommand(GameString command) {
    if (TextureSampler35.rights >= 2) {
        int var2;
        int var3;
        Runtime var6;
        if (command.method1531(TextureSampler20.COMMAND_GC)) {
          TextureSampler23.method246(8);

          for (var2 = 0; (var2 < 10); ++var2) {
            System.gc();
          }

          var6 = Runtime.getRuntime();
          var3 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
          GameBuffer.printMessage(null, 0, RenderAnimation.concat(new GameString[] {
            TextureSampler3.aClass94_3360, SomethingScene.toString(var3),
            FileRequester.aClass94_2951
          }), -1);
        }

        int var4;
        if (command.method1531(InventoryConfig.aClass94_3651)) {
          TextureSampler23.method246(8);

          for (var2 = 0; var2 < 10; ++var2) {
            System.gc();
          }

          var6 = Runtime.getRuntime();
          var3 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
          GameBuffer.printMessage(null, 0, RenderAnimation.concat(new GameString[] {
            DummyClass25.aClass94_1625, SomethingScene.toString(var3), FileRequester.aClass94_2951
          }), -1);
          WidgetAccess.method90(1);
          TextureSampler23.method246(8);

          for (var4 = 0; var4 < 10; ++var4) {
            System.gc();
          }

          var3 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
          GameBuffer.printMessage(null, 0, RenderAnimation.concat(new GameString[] {
            DummyClass12.aClass94_2033, SomethingScene.toString(var3), FileRequester.aClass94_2951
          }), -1);
        }

        if (command.method1531(DummyClass17.aClass94_1830)) {
          GameBuffer.printMessage(null, 0, RenderAnimation.concat(new GameString[] {
            DummyClass60.aClass94_442,
            SomethingScene.toString(AbstractObjectNodeWrapper.method1727((byte) 123))
          }), -1);
        }

        if (GlRenderer.useOpenGlRenderer && command.method1531(
          AbstractDirectColorSprite.COMMAND_CARD_MEMORY)) {
          System.out.println("oncard_geometry:" + DummyClass33.anInt585);
          System.out.println("oncard_2d:" + DummyClass33.texture2dMemory);
          System.out.println("oncard_texture:" + DummyClass33.textureMemory);
        }

        if (command.method1531(AbstractFileRequester.COMMAND_DROP_CLIENT)) {
          TextureSampler5.method289(false);
        }

        if (command.method1531(SomethingPacket151.COMMAND_DROP_JS5)) {
          DummyClass43.ondemandRequester.shutdown(false);
        }

        if (command.method1531(DummyClass31.SERVER_JS5_DROP)) {
          DummyClass43.ondemandRequester.drop(true);
        }

        if (command.method1531(DummyClass53.aClass94_1337)) {
          DummyClass35.signLink.method1431(0);
          SomethingVolume15.gameSocket.method1467();
          DummyClass43.ondemandRequester.method1248(-29340);
        }

        if (command.method1531(AbstractTextureSampler.COMMAND_REPLACE_CANVAS)) {
          AnimationSomething.replaceCanvas = true;
        }

        if (command.method1531(BlockConfig.COMMAND_REBUILD)) {
          DummyClass26.setState(25, 5);
        }

        if (command.method1531(DummyClass43.COMMAND_FPS_ON)) {
          DummyClass29.aBoolean438 = true;
        }

        if (command.method1531(BufferedFile.COMMAND_FPS_OFF)) {
          DummyClass29.aBoolean438 = false;
        }

        if (command.method1531(PlayerAppearance.COMMAND_WM0)) {
          SceneNode.setWindowMode(false, 0, -8914, -1, -1);
        }

        if (command.method1531(DummyClass58.COMMAND_WM1)) {
          SceneNode.setWindowMode(false, 1, -8914, -1, -1);
        }

        if (command.method1531(BufferData.COMMAND_WM2)) {
          SceneNode.setWindowMode(false, 2, -8914, -1, -1);
        }

        if (command.method1531(TextureSampler17.COMMAND_WM3)) {
          SceneNode.setWindowMode(false, 3, -8914, 1024, 768);
        }

        if (command.method1531(TextureSampler30.COMMAND_NOCLIP)) {
          for (var2 = 0; (var2 < 4); ++var2) {
            for (var3 = 1; (var3 < 103); ++var3) {
              for (var4 = 1; var4 < 103; ++var4) {
                BlockConfig.collisionMaps[var2].anIntArrayArray1304[var3][var4] = 0;
              }
            }
          }
        }

        if (command.method1558(SceneNode.COMMAND_SET_PARTICLES, 0)) {
          DummyClass0.method1758(command.substring(15).toInteger());
          DummyClass25.writeSettings(DummyClass35.signLink);
          StillGraphic.aBoolean2705 = false;
        }

        if (command.method1558(TextureSampler39.aClass94_3289, 0)
          && AbstractGameWorld.usageLocation != 0) {
          DummyClass45.method1237(command.substring(6).toInteger(), 1000);
        }

        if (command.method1531(DummyClass6.COMMAND_ERROR_TEST)) {
          throw new RuntimeException();
        }

        if (command.method1558(GameStub.COMMAND_RECTANGLE_DEBUG, 0)) {
          ClientScript.rectangleDebugType = command.substring(12).method1564(1).toInteger();
          GameBuffer.printMessage(null, 0, RenderAnimation.concat(new GameString[] {
            SomethingIndex150.RECTANGLE_DEBUG_EQ,
            SomethingScene.toString(ClientScript.rectangleDebugType)
          }), -1);
        }

        if (command.method1531(DummyClass58.COMMAND_QA_OP_TEST)) {
          LinearHashTable.aBoolean1040 = true;
        }

        if (command.method1531(SomethingVolume15.COMMAND_TWEEN)) {
          if (MonoChromaticImageBuffer.tweening) {
            MonoChromaticImageBuffer.tweening = false;
            GameBuffer.printMessage(null, 0, Something3dRoot.aClass94_2061, -1);
          } else {
            MonoChromaticImageBuffer.tweening = true;
            GameBuffer
                .printMessage(null, 0, Player.FORCED_TWEENING_ENABLED, -1);
          }
        }

        if (command.method1531(AbstractTextureSampler.COMMAND_SHIFT_CLICK)) {
          if (DummyClass55.aBoolean1419) {
            InventoryConfig.aClass94_3653.method1549(false);
            DummyClass55.aBoolean1419 = false;
          } else {
            DummyClass29.aClass94_434.method1549(false);
            DummyClass55.aBoolean1419 = true;
          }
        }
      }

      TextureSampler12.secureBuffer.writePacket(44);
      TextureSampler12.secureBuffer.writeByte(command.getLength() - 2 - 1);
      ++FaceNormal.anInt1633;
      TextureSampler12.secureBuffer.writeString(command.substring(2));
  }

}
