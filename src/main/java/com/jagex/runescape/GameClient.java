package com.jagex.runescape;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.huffman.HuffmanEncoder;
import com.jagex.runescape.opengl.SomethingShadows;
import com.jagex.runescape.opengl.DummyClass33;
import com.jagex.runescape.opengl.DummyClass46;
import com.jagex.runescape.opengl.GLStatics;
import com.jagex.runescape.opengl.GlEnvironment;
import com.jagex.runescape.opengl.GlModel;
import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.GlTexture2d;
import com.jagex.runescape.opengl.GlUtils;
import com.jagex.runescape.opengl.SomethingGl;
import com.jagex.runescape.opengl.SomethingGl0;
import com.jagex.runescape.opengl.Texture;
import com.jagex.runescape.opengl.WaterShader;
import com.jagex.runescape.opengl.MaterialShader4;
import com.jagex.runescape.opengl.MaterialShader5;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.GregorianCalendar;

public final class GameClient extends GameStub {

  public static GameString aClass94_2198 = GameStringStatics.create("cyan:");
  public static boolean aBoolean2201;

  private void setUpdateError(int var2) {
    ++DummyClass43.ondemandRequester.anInt1011;
      DummyClass1.socketRequest = null;
      DummyClass43.ondemandRequester.anInt1010 = var2;
      DummyInputStream.updateSocket = null;
      DummyClass18.anInt80 = 0;
  }

  private void updateGame(byte var1) {
    for (
          SomethingOtherWorldMap.anInt2537 = 0; FileCacheRequest.hasKeyInput()
          && (SomethingOtherWorldMap.anInt2537 < 128);
          ++SomethingOtherWorldMap.anInt2537) {
        SomethingPacket116.anIntArray1755[SomethingOtherWorldMap.anInt2537] = Parameter.anInt3624;
        FaceNormal.anIntArray1638[SomethingOtherWorldMap.anInt2537] = TextureSampler7.anInt3342;
      }

      ++DisplayMode.loopCycle;
      if (InventoryConfig.anInt3655 != -1) {
        SpotAnimationConfig.method967(0, 0, 2, 0, DummyClass30.viewWidth,
            InventoryConfig.anInt3655,
            0, GroundItem.viewHeight);
      }

      ++TextureSampler23.anInt3213;
      if (GlRenderer.useOpenGlRenderer) {
        int var2 = 19137023;

        label191:
        for (int var3 = 0; (var3 < 32768); ++var3) {
          NPC var4 = TextureSampler5.npcs[var3];
          if (var4 != null) {
            byte var5 = var4.config.aByte1267;
            if ((var5 & 2) > 0 && (var4.anInt2816 == 0)
                && Math.random() * 1000.0D < 10.0D) {
              int var6 = (int) Math.round(-1.0 + 2.0D * Math.random());
              int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
              if (var6 != 0 || var7 != 0) {
                var4.aByteArray2795[0] = 1;
                var4.waypointsX[0] = var6 + (var4.anInt2819 >> 7);
                var4.waypointsY[0] = var7 + (var4.anInt2829 >> 7);
                GlobalStatics_0.collisionMaps[GameWorldSomething.currentPlane]
                    .method1502(var1 + 20850,
                        var4.anInt2819 >> 7, var4.getSize(), false, 0,
                        var4.getSize(),
                        var4.anInt2829 >> 7);
                if (var4.waypointsX[0] >= 0 && var4.waypointsX[0] <= 104 - var4
                    .getSize()
                    && var4.waypointsY[0] >= 0
                    && var4.waypointsY[0] <= 104 - var4.getSize()
                    && GlobalStatics_0.collisionMaps[GameWorldSomething.currentPlane]
                    .method1500(-2,
                        var4.anInt2829 >> 7, var4.waypointsY[0],
                        var4.waypointsX[0],
                        var4.anInt2819 >> 7)) {
                  if (var4.getSize() > 1) {
                    for (int var8 = var4.waypointsX[0];
                        (var4.waypointsX[0] + var4.getSize()) > var8;
                        ++var8) {
                      for (int var9 = var4.waypointsY[0];
                          var4.waypointsY[0] + var4.getSize() > var9; ++var9) {
                        if ((var2
                            & GlobalStatics_0.collisionMaps[GameWorldSomething.currentPlane].anIntArrayArray1304[var8][var9])
                            != 0) {
                          continue label191;
                        }
                      }
                    }
                  }

                  var4.anInt2816 = 1;
                }
              }
            }

            Cursor.method1180((byte) -122, var4);
            DummyClass1.method904(65536, var4);
            RenderAnimation.method900(var4, var1 ^ -11974);
            GlobalStatics_0.collisionMaps[GameWorldSomething.currentPlane]
                .method1489(
                    var4.anInt2819 >> 7, false, (byte) 85, var4.anInt2829 >> 7,
                    var4.getSize(), var4.getSize());
          }
        }
      }

      if (var1 != 1) {
        GlobalStatics_1.aClass94_2196 = null;
      }

      if (!GlRenderer.useOpenGlRenderer) {
        GlobalStatics_0.method744(true);
      } else if (TextureSampler28.loginState == 0 && DummyCanvas.anInt23 == 0) {
        if ((SomethingPacket116.anInt1753 == 2)) {
          ClientScriptCall.method379(var1 ^ 1025);
        } else {
          WidgetUpdate.d('\uffff');
        }

        if (NPC.anInt3995 >> 7 < 14 || NPC.anInt3995 >> 7 >= 90
            || DummyClass49.anInt1111 >> 7 < 14 || ((
            DummyClass49.anInt1111
                >> 7) >= 90)) {
          TextureSampler26.method195(var1 ^ 20478);
        }
      }

      while (true) {
        ClientScriptCall var11 = (ClientScriptCall) DummyClass18.aClass61_82
            .method1220((byte) -3);
        Widget var12;
        Widget var13;
        if (var11 == null) {
          while (true) {
            var11 = (ClientScriptCall) DummyClass45.aClass61_983
                .method1220((byte) -3);
            if (var11 == null) {
              while (true) {
                var11 = (ClientScriptCall) DummyClass31.aClass61_1471
                    .method1220((byte) -3);
                if (var11 == null) {
                  if (DummyClass42.aClass11_886 != null) {
                    DummyClass18.method829(-1);
                  }

                  if (AudioWorker.aClass64_351 != null
                      && AudioWorker.aClass64_351.status == 1) {
                    if (AudioWorker.aClass64_351.result != null) {
                      DummyClass54
                          .method1596(TextureSampler5.aClass94_3295, (byte) 126,
                              GlobalStatics_0.aBoolean2154);
                    }

                    GlobalStatics_0.aBoolean2154 = false;
                    TextureSampler5.aClass94_3295 = null;
                    AudioWorker.aClass64_351 = null;
                  }

                  if (AbstractGameWorld.updateCycle % 1500 == 0) {
                    SomethingScene.method1293(true);
                  }

                  return;
                }

                var12 = var11.aClass11_2449;
                if (var12.anInt191 >= 0) {
                  var13 = EnumStringFetcher
                      .getWidget((byte) 118, var12.anInt190);
                  if (var13 == null || var13.aClass11Array262 == null
                      || (var13.aClass11Array262.length <= var12.anInt191)
                      || var12 != var13.aClass11Array262[var12.anInt191]) {
                    continue;
                  }
                }

                Light.executeScript(var11);
              }
            }

            var12 = var11.aClass11_2449;
            if ((var12.anInt191 >= 0)) {
              var13 = EnumStringFetcher.getWidget((byte) 112, var12.anInt190);
              if (var13 == null || var13.aClass11Array262 == null
                  || (var12.anInt191 >= var13.aClass11Array262.length)
                  || var12 != var13.aClass11Array262[var12.anInt191]) {
                continue;
              }
            }

            Light.executeScript(var11);
          }
        }

        var12 = var11.aClass11_2449;
        if (var12.anInt191 >= 0) {
          var13 = EnumStringFetcher.getWidget((byte) 126, var12.anInt190);
          if (var13 == null || var13.aClass11Array262 == null
              || (var13.aClass11Array262.length <= var12.anInt191)
              || var12 != var13.aClass11Array262[var12.anInt191]) {
            continue;
          }
        }

        Light.executeScript(var11);
      }
  }

  private void method48(boolean var1) {
    boolean var2 = DummyClass43.ondemandRequester.method1243((byte) -61);
      if (!var1) {
        GameClient.aClass94_2198 = null;
      }

      if (!var2) {
        this.method49();
      }
  }

  private void method49() {
    if ((DummyClass8.anInt4026 < DummyClass43.ondemandRequester.anInt1011)) {
        TextureSampler21.anInt3068 =
            5 * 50 * (DummyClass43.ondemandRequester.anInt1011 - 1);
        if (DummyClass11.anInt2036 == Projectile.anInt2894) {
          Projectile.anInt2894 = GameWorldSomething.anInt506;
        } else {
          Projectile.anInt2894 = DummyClass11.anInt2036;
        }

        if (TextureSampler21.anInt3068 > 3000) {
          TextureSampler21.anInt3068 = 3000;
        }

        if ((DummyClass43.ondemandRequester.anInt1011 >= 2)
            && DummyClass43.ondemandRequester.anInt1010 == 6) {
          this.reportError("js5connect_outofdate");
          DummyClass15.state = 1000;
          return;
        }

        if ((DummyClass43.ondemandRequester.anInt1011 >= 4)
            && (DummyClass43.ondemandRequester.anInt1010 == -1)) {
          this.reportError("js5crc");
          DummyClass15.state = 1000;
          return;
        }

        if (DummyClass43.ondemandRequester.anInt1011 >= 4 && (
            DummyClass15.state == 0
                || (DummyClass15.state == 5))) {
          if ((DummyClass43.ondemandRequester.anInt1010 != 7)
              && (DummyClass43.ondemandRequester.anInt1010 != 9)) {
            if (DummyClass43.ondemandRequester.anInt1010 > 0) {
              this.reportError("js5connect");
            } else {
              this.reportError("js5io");
            }
          } else {
            this.reportError("js5connect_full");
          }

          DummyClass15.state = 1000;
          return;
        }
      }

      DummyClass8.anInt4026 = DummyClass43.ondemandRequester.anInt1011;
      if ((TextureSampler21.anInt3068 > 0)) {
        --TextureSampler21.anInt3068;
      } else {
        try {
          if ((DummyClass18.anInt80 == 0)) {
            DummyClass1.socketRequest =
                DummyClass35.signLink
                    .method1441((byte) 8, DummyClass36.aString2611,
                        Projectile.anInt2894);
            ++DummyClass18.anInt80;
          }

          if (DummyClass18.anInt80 == 1) {
            if (DummyClass1.socketRequest.status == 2) {
              this.setUpdateError(1000);
              return;
            }

            if ((DummyClass1.socketRequest.status == 1)) {
              ++DummyClass18.anInt80;
            }
          }

          if (DummyClass18.anInt80 == 2) {
            DummyInputStream.updateSocket =
                new SocketStream((Socket) DummyClass1.socketRequest.result,
                    DummyClass35.signLink);
            Buffer buffer = new Buffer(5);
            buffer.writeByte(15);
            buffer.writeInt(530);
            DummyInputStream.updateSocket.write(buffer.bytes, 0, 5);
            ++DummyClass18.anInt80;
            TextureSampler13.lastWrittenTime = Time.getCurrentTimeMillis();
          }

          if (DummyClass18.anInt80 == 3) {
            if ((DummyClass15.state != 0) && (DummyClass15.state != 5)
                && DummyInputStream.updateSocket.available() <= 0) {
              if (((Time.getCurrentTimeMillis()
                  - TextureSampler13.lastWrittenTime) > 30000L)) {
                this.setUpdateError(1001);
                return;
              }
            } else {
              int status = DummyInputStream.updateSocket.read();
              if (status != 0) {
                this.setUpdateError(status);
                return;
              }

              ++DummyClass18.anInt80;
            }
          }

          if ((DummyClass18.anInt80 == 4)) {
            boolean offline =
                DummyClass15.state == 5 || DummyClass15.state == 10 ||
                    DummyClass15.state == 28;
            DummyClass43.ondemandRequester
                .setSocket(!offline, DummyInputStream.updateSocket);
            DummyInputStream.updateSocket = null;
            DummyClass1.socketRequest = null;
            DummyClass18.anInt80 = 0;
          }
        } catch (IOException var3) {
          this.setUpdateError(1002);
        }

      }
  }

  private void handleLoading() {
    if (!GlobalStatics_0.safemode) {
        while (FileCacheRequest.hasKeyInput()) {
          if ((TextureSampler7.anInt3342 == 115)
              || (TextureSampler7.anInt3342 == 83)) {
            GlobalStatics_0.safemode = true;
          }
        }
      }

      int kkkk;
      if (HintMarker.loadingState == 0) {
        Runtime runtime = Runtime.getRuntime();
        int usedMemory = (int) ((runtime.totalMemory() - runtime.freeMemory())
            / 1024L);
        long var4 = Time.getCurrentTimeMillis();
        if ((TextureSampler5.aLong3296 == 0L)) {
          TextureSampler5.aLong3296 = var4;
        }

        if (usedMemory > 16384 && -TextureSampler5.aLong3296 + var4 < 5000L) {
          if (-CollisionMap.aLong1310 + var4 > 1000L) {
            System.gc();
            CollisionMap.aLong1310 = var4;
          }

          ClientScript.loadingPercent = 5;
          AnimationFrame.loadingText = TextureSampler18.aClass94_4040;
        } else {
          AnimationFrame.loadingText = GlobalStatics_0.aClass94_2151;
          HintMarker.loadingState = 10;
          ClientScript.loadingPercent = 5;
        }
      } else {
        int var2;
        if ((HintMarker.loadingState == 10)) {
          DummyClass46.setSceneDimensions(4, 104, 104);

          for (var2 = 0; (var2 < 4); ++var2) {
            GlobalStatics_0.collisionMaps[var2] = new CollisionMap(104, 104);
          }

          ClientScript.loadingPercent = 10;
          HintMarker.loadingState = 30;
          AnimationFrame.loadingText = AbstractFileRequest.aClass94_3629;
        } else if (HintMarker.loadingState == 30) {
          if (AbstractFileRequester.fileSystem == null) {
            AbstractFileRequester.fileSystem =
                new FileSystem(DummyClass43.ondemandRequester,
                    TextureSampler31.fileCacheRequester);
          }

          if (AbstractFileRequester.fileSystem.isUpdateTableReceived()) {
            SomethingTexture3.animationFrames =
                FileSystem.createUnpacker(false, true, true, 0, true);
            ProjectileNode.animationBases = FileSystem
                .createUnpacker(false, true, true, 1, true);
            Something3dRoot.configs = FileSystem
                .createUnpacker(true, true, false, 2, true);
            GameObject.widgets = FileSystem
                .createUnpacker(false, true, true, 3, true);
            AbstractMouseWheel.soundEffects = FileSystem
                .createUnpacker(false, true, true, 4, true);
            TextureSampler26.maps = FileSystem
                .createUnpacker(true, true, true, 5, true);
            SomethingTexture1.fileUnpacker6 = FileSystem
                .createUnpacker(true, false, true, 6, true);
            DummyClass13.models = FileSystem
                .createUnpacker(false, true, true, 7, true);
            Projectile.sprites = FileSystem
                .createUnpacker(false, true, true, 8, true);
            TextureSampler32.textures = FileSystem
                .createUnpacker(false, true, true, 9, true);
            TextureSampler28.fileUnpacker10 =
                FileSystem.createUnpacker(false, true, true, 10, true);
            SubNode.fileUnpacker11 = FileSystem
                .createUnpacker(false, true, true, 11, true);
            WidgetAccess.scripts = FileSystem
                .createUnpacker(false, true, true, 12, true);
            FileUnpacker.fileUnpacker13 = FileSystem
                .createUnpacker(false, true, true, 13, true);
            ClanChatUser.midiInstruments = FileSystem
                .createUnpacker(false, false, true, 14, true);
            NPC.fileUnpacker15 = FileSystem
                .createUnpacker(false, true, true, 15, true);
            FloorOverlay.fileUnpacker16 = FileSystem
                .createUnpacker(false, true, true, 16, true);
            NPC.fileUnpacker17 = FileSystem
                .createUnpacker(false, true, true, 17, true);
            DummyClass55.fileUnpacker18 = FileSystem
                .createUnpacker(false, true, true, 18, true);
            FloorUnderlay.fileUnpacker19 = FileSystem
                .createUnpacker(false, true, true, 19, true);
            TextureSampler36.animationSequences =
                FileSystem.createUnpacker(false, true, true, 20, true);
            SceneSomething2.fileUnpacker21 = FileSystem
                .createUnpacker(false, true, true, 21, true);
            AudioSomethingSomething.fileUnpacker22 =
                FileSystem.createUnpacker(false, true, true, 22, true);
            SomethingPacket116.worldMapData = FileSystem
                .createUnpacker(true, true, true, 23, true);
            GroundItem.fileUnpacker24 = FileSystem
                .createUnpacker(false, true, true, 24, true);
            SpawnedGameObject.fileUnpacker25 =
                FileSystem.createUnpacker(false, true, true, 25, true);
            TriChromaticImageCache.materials =
                FileSystem.createUnpacker(true, true, true, 26, true);
            DummyClass22.particles = FileSystem
                .createUnpacker(false, true, true, 27, true);
            ClientScript.loadingPercent = 15;
            AnimationFrame.loadingText = DisplayMode.CONNECTED_TO_UPDATE_SERVER;
            HintMarker.loadingState = 40;
          } else {
            AnimationFrame.loadingText = SomethingAudio.CONNECTING_TO_UPDATE_SERVER;
            ClientScript.loadingPercent = 12;
          }
        } else if ((HintMarker.loadingState != 40)) {
          if ((HintMarker.loadingState == 45)) {
            GameObject.method1959(256, 2, 22050, TextureSampler17.aBoolean3184);
            GlobalStatics_0.aClass3_Sub24_Sub4_1193 = new AudioStreamEncoder4();
            GlobalStatics_0.aClass3_Sub24_Sub4_1193.method479((byte) 98, 9, 128);
            GameWorld.audioOutputStream0 =
                DummyClass43
                    .createAudioOutputStream(22050, DummyClass35.signLink,
                        GameCanvas.INSTANCE, 0, 14);
            GameWorld.audioOutputStream0
                .method2154(-116, GlobalStatics_0.aClass3_Sub24_Sub4_1193);
            RenderAnimation
                .method897(17770, GlobalStatics_0.aClass3_Sub24_Sub4_1193,
                    NPC.fileUnpacker15, ClanChatUser.midiInstruments,
                    AbstractMouseWheel.soundEffects);
            SomethingWorldMappy.audioOutputStream1 =
                DummyClass43
                    .createAudioOutputStream(2048, DummyClass35.signLink,
                        GameCanvas.INSTANCE, 1, 14);
            MonoChromaticImageBuffer.aClass3_Sub24_Sub2_2563 = new AudioStreamEncoder2();
            SomethingWorldMappy.audioOutputStream1.method2154(-128,
                MonoChromaticImageBuffer.aClass3_Sub24_Sub2_2563);
            DummyClass32.aClass157_524 = new SomethingAudio(22050,
                DummyClass60.sampleRate);
            Keyboard.openingMusicFileId =
                SomethingTexture1.fileUnpacker6
                    .getFileId(DummyClass3.openingMusic);
            ClientScript.loadingPercent = 30;
            HintMarker.loadingState = 50;
            AnimationFrame.loadingText = WorldMapLabel.aClass94_1731;
          } else if ((HintMarker.loadingState != 50)) {
            if (HintMarker.loadingState == 60) {
              var2 = Structure.method599(-20916, Projectile.sprites);
              kkkk = Cursor.method1185(6098);
              if (kkkk <= var2) {
                AnimationFrame.loadingText = SomethingQuickChat.aClass94_3575;
                HintMarker.loadingState = 65;
                ClientScript.loadingPercent = 40;
              } else {
                AnimationFrame.loadingText = RenderAnimation
                    .concat(new GameString[]{
                        IdentityKit.aClass94_461,
                        SomethingScene.toString(100 * var2 / kkkk),
                        IdentityKit.aClass94_468
                    });
                ClientScript.loadingPercent = 40;
              }
            } else {
              if ((HintMarker.loadingState == 65)) {
                Parameter.method581(FileUnpacker.fileUnpacker13, 0,
                    Projectile.sprites);
                ClientScript.loadingPercent = 45;
                AnimationFrame.loadingText = DummyClass30.aClass94_459;
                DummyClass26.setState(5, 5);
                HintMarker.loadingState = 70;
              } else {
                if (HintMarker.loadingState == 70) {
                  Something3dRoot.configs.method2113((byte) 34);
                  byte var7 = 0;
                  var2 = var7 + Something3dRoot.configs.method2136((byte) -124);
                  FloorOverlay.fileUnpacker16.method2113((byte) 120);
                  var2 += FloorOverlay.fileUnpacker16.method2136((byte) -128);
                  NPC.fileUnpacker17.method2113((byte) 70);
                  var2 += NPC.fileUnpacker17.method2136((byte) -123);
                  DummyClass55.fileUnpacker18.method2113((byte) 32);
                  var2 += DummyClass55.fileUnpacker18.method2136((byte) -127);
                  FloorUnderlay.fileUnpacker19.method2113((byte) 48);
                  var2 += FloorUnderlay.fileUnpacker19.method2136((byte) -128);
                  TextureSampler36.animationSequences.method2113((byte) 43);
                  var2 += TextureSampler36.animationSequences
                      .method2136((byte) -122);
                  SceneSomething2.fileUnpacker21.method2113((byte) 23);
                  var2 += SceneSomething2.fileUnpacker21
                      .method2136((byte) -122);
                  AudioSomethingSomething.fileUnpacker22.method2113((byte) 94);
                  var2 += AudioSomethingSomething.fileUnpacker22
                      .method2136((byte) -128);
                  GroundItem.fileUnpacker24.method2113((byte) 91);
                  var2 += GroundItem.fileUnpacker24.method2136((byte) -126);
                  SpawnedGameObject.fileUnpacker25.method2113((byte) 102);
                  var2 += SpawnedGameObject.fileUnpacker25
                      .method2136((byte) -128);
                  DummyClass22.particles.method2113((byte) 126);
                  var2 += DummyClass22.particles.method2136((byte) -124);
                  if ((var2 >= 1100)) {
                    DummyClass22.method1799((byte) 96, Something3dRoot.configs);
                    ClientScript
                        .setFloorFileUnpacker(false, Something3dRoot.configs);
                    ByteArrayNode.method575(Something3dRoot.configs, -1);
                    ClientScriptCall.method375(3, DummyClass13.models,
                        Something3dRoot.configs);
                    DummyClass58.method1661(2, FloorOverlay.fileUnpacker16,
                        DummyClass13.models,
                        true);
                    ItemConfig.method1103(DummyClass13.models,
                        DummyClass55.fileUnpacker18, false);
                    SceneNode.method1864(true, (byte) -126,
                        FloorUnderlay.fileUnpacker19,
                        SomethingAudio.aClass3_Sub28_Sub17_Sub1_2000,
                        DummyClass13.models);
                    PlayerVariable.method969(Something3dRoot.configs, 59);
                    TriChromaticImageBuffer.setAnimationFileUnpackers(
                        ProjectileNode.animationBases,
                        TextureSampler36.animationSequences, -77,
                        SomethingTexture3.animationFrames);
                    FileCache.method1053((byte) -117, Something3dRoot.configs);
                    AbstractImageProducer.method2180(DummyClass13.models,
                        SceneSomething2.fileUnpacker21, 11504);
                    DummyClass56
                        .method1648(AudioSomethingSomething.fileUnpacker22,
                            255);
                    GlobalStatics_0.method731(Something3dRoot.configs, (byte) -113);
                    GlobalStatics_0.method89(true, FileUnpacker.fileUnpacker13,
                        Projectile.sprites,
                        GameObject.widgets, DummyClass13.models);
                    TextureSampler23.method250(2048, Something3dRoot.configs);
                    DummyClass39.method1086(NPC.fileUnpacker17, -6);
                    TextureSampler9
                        .method205(SpawnedGameObject.fileUnpacker25, 115,
                            GroundItem.fileUnpacker24, new EnumStringFetcher());
                    DummyClass45.setQuickchatFileUnpackers(
                        SpawnedGameObject.fileUnpacker25,
                        GroundItem.fileUnpacker24, -117);
                    DummyClass43.method1197(Something3dRoot.configs, (byte) 69);
                    BufferObject
                        .method2065((byte) -125, Something3dRoot.configs,
                            Projectile.sprites);
                    DummyClass56
                        .method1645(Something3dRoot.configs, Projectile.sprites,
                            (byte) -67);
                    ClientScript.loadingPercent = 50;
                    AnimationFrame.loadingText = TextureSampler24.aClass94_3142;
                    PlayerVariable.method968(128);
                    HintMarker.loadingState = 80;
                  } else {
                    AnimationFrame.loadingText = RenderAnimation
                        .concat(new GameString[]{
                            StillGraphicNode.aClass94_3546,
                            SomethingScene.toString(var2 / 11),
                            IdentityKit.aClass94_468
                        });
                    ClientScript.loadingPercent = 50;
                  }
                } else {
                  if (HintMarker.loadingState == 80) {
                    var2 = SpawnedGameObject
                        .method107(Projectile.sprites, (byte) -125);
                    kkkk = TextureSampler16.method208(-119);
                    if (kkkk > var2) {
                      AnimationFrame.loadingText = RenderAnimation
                          .concat(new GameString[]{
                              TextureSampler38.aClass94_3445,
                              SomethingScene.toString(var2 * 100 / kkkk),
                              IdentityKit.aClass94_468
                          });
                      ClientScript.loadingPercent = 60;
                    } else {
                      DummyClass28.method887(21, Projectile.sprites);
                      HintMarker.loadingState = 90;
                      ClientScript.loadingPercent = 60;
                      AnimationFrame.loadingText = GlobalStatics_0.aClass94_1707;
                    }
                  } else if (HintMarker.loadingState != 90) {
                    if (HintMarker.loadingState == 100) {
                      if (TextureSampler25
                          .isRunesSpritesLoaded(Projectile.sprites)) {
                        HintMarker.loadingState = 110;
                      }
                    } else if ((HintMarker.loadingState != 110)) {
                      if ((HintMarker.loadingState != 120)) {
                        if ((HintMarker.loadingState == 130)) {
                          if (GameObject.widgets.method2113((byte) 20)) {
                            if (WidgetAccess.scripts.method2113((byte) 46)) {
                              if (FileUnpacker.fileUnpacker13
                                  .method2113((byte) 89)) {
                                if (SomethingPacket116.worldMapData
                                    .method2127((byte) -83,
                                        DummyClass53.aClass94_1342)) {
                                  SomethingTexture4.method1353(
                                      TextureCache.aClass3_Sub28_Sub16_Sub2Array2140,
                                      -11931,
                                      SomethingPacket116.worldMapData);
                                  ClientScript.loadingPercent = 95;
                                  AnimationFrame.loadingText = GlobalStatics_0.LOADED_INTERFACES;
                                  HintMarker.loadingState = 135;
                                } else {
                                  AnimationFrame.loadingText =
                                      RenderAnimation.concat(new GameString[]{
                                          FileRequester.aClass94_2961,
                                          SomethingScene.toString(90 + (
                                              SomethingPacket116.worldMapData
                                                  .method2116(22813,
                                                      DummyClass53.aClass94_1342)
                                                  / 10)),
                                          IdentityKit.aClass94_468
                                      });
                                  ClientScript.loadingPercent = 85;
                                }
                              } else {
                                AnimationFrame.loadingText =
                                    RenderAnimation.concat(new GameString[]{
                                        FileRequester.aClass94_2961,
                                        SomethingScene.toString(
                                            85 + (FileUnpacker.fileUnpacker13
                                                .method2136((byte) -124)
                                                / 20)), IdentityKit.aClass94_468
                                    });
                                ClientScript.loadingPercent = 85;
                              }
                            } else {
                              AnimationFrame.loadingText = RenderAnimation
                                  .concat(new GameString[]{
                                      FileRequester.aClass94_2961,
                                      SomethingScene.toString(
                                          75 + (WidgetAccess.scripts
                                              .method2136((byte) -128) / 10)),
                                      IdentityKit.aClass94_468
                                  });
                              ClientScript.loadingPercent = 85;
                            }
                          } else {
                            AnimationFrame.loadingText = RenderAnimation
                                .concat(new GameString[]{
                                    FileRequester.aClass94_2961,
                                    SomethingScene.toString(
                                        GameObject.widgets
                                            .method2136((byte) -123) * 3 / 4),
                                    IdentityKit.aClass94_468
                                });
                            ClientScript.loadingPercent = 85;
                          }
                        } else if (HintMarker.loadingState == 135) {
                          var2 = BufferData.method1735(29984);
                          if (var2 == -1) {
                            ClientScript.loadingPercent = 95;
                            AnimationFrame.loadingText = DummyClass24.aClass94_1653;
                          } else if ((var2 != 7) && var2 != 9) {
                            if (BufferedFile.aBoolean579) {
                              AnimationFrame.loadingText = RenderAnimation.aClass94_374;
                              HintMarker.loadingState = 140;
                              ClientScript.loadingPercent = 96;
                            } else {
                              this.reportError("worldlistio_" + var2);
                              DummyClass26.setState(1000, 5);
                            }
                          } else {
                            this.reportError("worldlistfull");
                            DummyClass26.setState(1000, 5);
                          }
                        } else if ((HintMarker.loadingState != 140)) {
                          if ((HintMarker.loadingState == 150)) {
                            SomethingGl.method1454();
                            if (GlobalStatics_0.safemode) {
                              Parameter.anInt3622 = 0;
                              GroundItemNode.anInt3671 = 0;
                              SubNode.anInt2577 = 0;
                              TriChromaticImageBuffer.anInt2488 = 0;
                            }

                            GlobalStatics_0.safemode = true;
                            DummyClass25.writeSettings(DummyClass35.signLink);
                            SceneNode
                                .setWindowMode(false, SubNode.anInt2577, -8914,
                                    -1, -1);
                            ClientScript.loadingPercent = 100;
                            HintMarker.loadingState = 160;
                            AnimationFrame.loadingText = SubNode.aClass94_2576;
                          } else if ((HintMarker.loadingState == 160)) {
                            TextureSampler1.method219(true, 3000);
                          }
                        } else {
                          AudioSomethingSomething.anInt2529 =
                              GameObject.widgets.getFileId(NPC.aClass94_3992);
                          TextureSampler26.maps.method2115(-9, false, true);
                          SomethingTexture1.fileUnpacker6
                              .method2115(111, true, true);
                          Projectile.sprites.method2115(-76, true, true);
                          FileUnpacker.fileUnpacker13
                              .method2115(91, true, true);
                          TextureSampler28.fileUnpacker10
                              .method2115(-116, true, true);
                          GameObject.widgets.method2115(99, true, true);
                          ClientScript.loadingPercent = 97;
                          AnimationFrame.loadingText = SomethingInScenePacket202.aClass94_2267;
                          HintMarker.loadingState = 150;
                          DummyClass43.aBoolean913 = true;
                        }
                      } else if (TextureSampler28.fileUnpacker10.method2125(
                          GroundItemNode.EMPTY_STRING, (byte) 116,
                          Texture.aClass94_3792)) {
                        HuffmanEncoder var9 = new HuffmanEncoder(
                            TextureSampler28.fileUnpacker10
                                .method2123(0, GroundItemNode.EMPTY_STRING,
                                    Texture.aClass94_3792));
                        DummyClass3.method69(var9, 104);
                        AnimationFrame.loadingText = DummyClass26.aClass94_1615;
                        HintMarker.loadingState = 130;
                        ClientScript.loadingPercent = 80;
                      } else {
                        AnimationFrame.loadingText = RenderAnimation
                            .concat(new GameString[]{
                                GlobalStatics_0.aClass94_1183,
                                DummyInputStream.aClass94_37
                            });
                        ClientScript.loadingPercent = 80;
                      }
                    } else {
                      DisplayMode.aClass67_1443 = new MouseRecorder();
                      DummyClass35.signLink
                          .createThread(0, 10, DisplayMode.aClass67_1443);
                      AnimationFrame.loadingText = FloorUnderlay.aClass94_1409;
                      ClientScript.loadingPercent = 75;
                      HintMarker.loadingState = 120;
                    }
                  } else if (!TriChromaticImageCache.materials
                      .method2113((byte) 58)) {
                    AnimationFrame.loadingText = RenderAnimation
                        .concat(new GameString[]{
                            Unsure.aClass94_1892, SomethingScene.toString(
                            TriChromaticImageCache.materials
                                .method2136((byte) -125)),
                            IdentityKit.aClass94_468
                        });
                    ClientScript.loadingPercent = 70;
                  } else {
                    TextureCache var8 =
                        new TextureCache(TextureSampler32.textures,
                            TriChromaticImageCache.materials,
                            Projectile.sprites, 20,
                            !SceneSomething.aBoolean488);
                    DummyClass40.setTextureCache(var8);
                    if ((AbstractFileRequest.brightnessSetting == 1)) {
                      DummyClass40.updateLightness(0.9F);
                    }

                    if (AbstractFileRequest.brightnessSetting == 2) {
                      DummyClass40.updateLightness(0.8F);
                    }

                    if (AbstractFileRequest.brightnessSetting == 3) {
                      DummyClass40.updateLightness(0.7F);
                    }

                    if ((AbstractFileRequest.brightnessSetting == 4)) {
                      DummyClass40.updateLightness(0.6F);
                    }

                    AnimationFrame.loadingText = TextureSampler31.aClass94_3167;
                    HintMarker.loadingState = 100;
                    ClientScript.loadingPercent = 70;
                  }
                }
              }
            }
          } else {
            var2 =
                TextureSampler24
                    .method228(Projectile.sprites, FileUnpacker.fileUnpacker13,
                        false);
            kkkk = GameException.method2286((byte) -5);
            if ((var2 >= kkkk)) {
              AnimationFrame.loadingText = DummyClass15.aClass94_1879;
              ClientScript.loadingPercent = 35;
              HintMarker.loadingState = 60;
            } else {
              AnimationFrame.loadingText = RenderAnimation
                  .concat(new GameString[]{
                      Structure.aClass94_3643,
                      SomethingScene.toString(100 * var2 / kkkk),
                      IdentityKit.aClass94_468
                  });
              ClientScript.loadingPercent = 35;
            }
          }
        } else {
          var2 = 0;

          for (kkkk = 0; kkkk < 28; ++kkkk) {
            var2 += GlobalStatics_0.aClass151_Sub1Array2601[kkkk].method2111(-61)
                * TextureSampler39.anIntArray3288[kkkk] / 100;
          }

          if (var2 == 100) {
            ClientScript.loadingPercent = 20;
            AnimationFrame.loadingText = GameWorld.aClass94_2624;
            DummyClass37.method1039(208, Projectile.sprites);
            TriChromaticImageCache.method1593(111, Projectile.sprites);
            TextureSampler20.setRunesFileId(Projectile.sprites);
            HintMarker.loadingState = 45;
          } else {
            if ((var2 != 0)) {
              AnimationFrame.loadingText = RenderAnimation
                  .concat(new GameString[]{
                      SomethingSceneJ.aClass94_327,
                      SomethingScene.toString(var2),
                      IdentityKit.aClass94_468
                  });
            }

            ClientScript.loadingPercent = 20;
          }
        }

      }
  }

  public void update() {
    if ((DummyClass15.state != 1000)) {
        ++AbstractGameWorld.updateCycle;
        if (AbstractGameWorld.updateCycle % 1000 == 1) {
          GregorianCalendar calendar = new GregorianCalendar();
          DummyClass36.anInt2618 =
              calendar.get(11) * 600 - (-(calendar.get(12) * 10) - (
                  calendar.get(13) / 6));
          TextureSampler27.random.setSeed(DummyClass36.anInt2618);
        }

        this.method48(true);
        if (AbstractFileRequester.fileSystem != null) {
          AbstractFileRequester.fileSystem.method838((byte) -70);
        }

        GlobalStatics_0.method728(false);
        DummyClass43.method1194(-16385);
        DummyClass34.method996(-43);
        FileTable.method1225(18074);
        if (GlRenderer.useOpenGlRenderer) {
          DummyClass33.clearGlResources();
        }

        int var4;
        if (DummyClass35.mouseWheel != null) {
          var4 = DummyClass35.mouseWheel.pollOffset();
          PlayerVariable.mouseWheelOffset = var4;
        }

        if ((DummyClass15.state == 0)) {
          this.handleLoading();
          SomethingTexture4.resetFrameRegulator();
        } else if ((DummyClass15.state == 5)) {
          this.handleLoading();
          SomethingTexture4.resetFrameRegulator();
        } else if (
            (DummyClass15.state == 25) || (DummyClass15.state == 28)) {
          DummyClass59.method1046(-117);
        }

        if (DummyClass15.state == 10) {
          this.updateGame((byte) 1);
          TextureSampler37.method267((byte) 36);
          DummyClass9.method2216((byte) 81);
          DummyClass2.handleLogin();
        } else if (DummyClass15.state == 30) {
          TextureSampler20.method235(true);
        } else if (DummyClass15.state == 40) {
          DummyClass2.handleLogin();
          if (~AbstractImageProducer.loginResponse != 2) {
            if ((AbstractImageProducer.loginResponse == 15)) {
              DummyClass60.method912(false);
            } else if ((AbstractImageProducer.loginResponse != 2)) {
              DummyClass10.destroyGame((byte) 46);
            }
          }
        }

      }
  }

  public void destroy(byte var1) {
    if (GlRenderer.useOpenGlRenderer) {
        GlRenderer.releaseGlResources();
      }

      if (TextureSampler30.fullScreenFrame != null) {
        FileCacheRequest.method593(TextureSampler30.fullScreenFrame, true,
            DummyClass35.signLink);
        TextureSampler30.fullScreenFrame = null;
      }

      if (DummyClass35.signLink != null) {
        DummyClass35.signLink.method1442(this.getClass(), 0);
      }

      if (DisplayMode.aClass67_1443 != null) {
        DisplayMode.aClass67_1443.aBoolean1015 = false;
      }

      DisplayMode.aClass67_1443 = null;
      if (SomethingVolume15.gameSocket != null) {
        SomethingVolume15.gameSocket.destroy();
        SomethingVolume15.gameSocket = null;
      }

      DummyClass9.unbindKeyboard(GameCanvas.INSTANCE, -9320);
      Mouse.unbind(GameCanvas.INSTANCE);
      if (DummyClass35.mouseWheel != null) {
        DummyClass35.mouseWheel.unbind(false, GameCanvas.INSTANCE);
      }

      TextureSampler12.method167(0);
      Mouse.method2090(8);
      DummyClass35.mouseWheel = null;
      if (GameWorld.audioOutputStream0 != null) {
        GameWorld.audioOutputStream0.method2163(false);
      }

      if (SomethingWorldMappy.audioOutputStream1 != null) {
        SomethingWorldMappy.audioOutputStream1.method2163(false);
      }

      DummyClass43.ondemandRequester.shutdown(false);
      TextureSampler31.fileCacheRequester.shutdown(3208);

      try {
        if (DummyClass55.cacheDataFile != null) {
          DummyClass55.cacheDataFile.close(false);
        }

        if (var1 <= 20) {
          return;
        }

        if (DummyClass7.cacheIndexFiles != null) {
          for (int var2 = 0; var2 < DummyClass7.cacheIndexFiles.length;
              ++var2) {
            if (DummyClass7.cacheIndexFiles[var2] != null) {
              DummyClass7.cacheIndexFiles[var2].close(false);
            }
          }
        }

        if (MonoChromaticImageCache.tableIndexFile != null) {
          MonoChromaticImageCache.tableIndexFile.close(false);
        }

        if (LinearHashTable.uidFile != null) {
          LinearHashTable.uidFile.close(false);
        }
      } catch (IOException var3) {
      }
  }

  public void method33(int var1) {
    GameClient.method43(true);
      GlobalStatics_0.method1541(-8635);
      DummyClass35.method1024(21474);
      SomethingWorldMapy.method542((byte) -46);
      WorldMapLabel.method1792(0);
      GameStub.method26(113);
      GlRenderer.method1838();
      AbstractFrameRegulator.method1766(24241);
      AbstractImageProducer.method2181(false);
      MouseRecorder.method1257(25951);
      HintMarker.method1588((byte) 106);
      GlobalStatics_0.method767(0);
      SocketStream.method1463(0);
      OndemandRequester.method1242((byte) -88);
      FileCacheRequester.method1306(-16222);
      FileSystem.method836(-114);
      FileRequester.method2105(false);
      FileUnpacker.method2119(100);
      BufferedFile.method974(true);
      FileCache.method1049(true);
      ObjectCache.method1521(3101);
      NPC.method1983(-3);
      GameBuffer.method808(1);
      CollisionMap.method1491((byte) -124);
      Widget.method860(126);
      DisplayMode.method1644((byte) 121);
      Player.method1982((byte) 121);
      Deque.method1217(0);
      AbstractDirectColorSprite.method634((byte) 108);
      GlobalStatics_0.method1774(103);
      AbstractMouseWheel.method2081(0);
      ClanChatUser.method387(103);
      SomethingPacket116.method1802();
      AudioStreamEncoder4.method491((byte) 85);
      AbstractAudioOutputStream.method2165(0);
      SomethingAudio.method2175((byte) -110);
      PlayerAppearance.method1168(8160);
      AnimationSequence.method2057((byte) -108);
      Mobile.method1974((byte) -116);
      GlobalStatics_2.method102(3353893);
      GameObjectConfig.method1687(-11);
      SpawnedGameObject.method109(2);
      NpcConfiguration.method1473((byte) 103);
      SomethingPacket151.method821(26971);
      WidgetAccess.method91((byte) 120);
      GlobalStatics_0.method83((byte) 30);
      Queue.method875((byte) 106);
      ISAACCipher.method1231(119);
      DummyClass53.method1582(3);
      AnimationSomething.method558(-29679);
      Unsure.method2071((byte) 59);
      DummyClass39.method1085(-1);
      DummyClass22.method1800((byte) 104);
      DummyClass28.method886((byte) 35);
      DummyClass25.method1728(-14256);
      DummyClass2.method1754(-79);
      DummyClass1.method905(-24912);
      DummyHashTable.method1761((byte) -55);
      GameException.method2288(false);
      DummyClass29.method908(5157);
      DummyClass10.method2262((byte) 126);
      FileCacheRequest.method592((byte) 38);
      OndemandFileRequest.method597((byte) 108);
      DummyClass54.method1598(-126);
      DummyClass51.method1422((byte) 24);
      GlEnvironment.method1507();
      DummyClass59.method1042(true);
      Model.destroy();
      SceneShadowMap.method1815((byte) -45);
      GlModel.method1915();
      ItemConfig.method1111(3327);
      GlobalStatics_1.method1948();
      Keyboard.method2085(118);
      Mouse.method2088(true);
      DummyClass30.method937(0);
      MidiSomething.method1414(90);
      DummyClass33.method987();
      AudioWorker.method892(100);
      DummyCanvas.method53(0);
      DummyClass11.method2205(-17413);
      GlobalStatics_1.method1663(33);
      AbstractFont.method689();
      DummyClass52.method1426(-25247);
      AudioSomethingSomething.method399(186);
      SomethingMidiFile0.method1369();
      AudioStreamEncoder3.method463(-28918);
      SomethingVolume15.method372(true);
      DummyClass36.method1032(false);
      SomethingFont.method999();
      DummyClass46.method1274();
      Light.method1059((byte) -2);
      AbstractFileRequester.method2093(1);
      FileTable.method1223(0);
      AbstractFileRequest.method588((byte) 120);
      DummyClass15.method2063(0);
      DummyClass47.method1333();
      DummyClass18.method828(-90);
      GZipDecompressor.method1130(99);
      Parameter.method584(0);
      SubNode.method521(-3);
      Cache.method1096((byte) 89);
      FloorOverlay.method2276(-2);
      DummyClass17.method1858(-17124);
      FloorUnderlay.method1606((byte) -48);
      IdentityKit.method943(-9893);
      Structure.method605(221301966);
      DummyClass26.method1721(true);
      DummyClass27.method1712(69);
      RenderAnimation.method896(true);
      SpotAnimationConfig.method964(6);
      BitVariable.method1388(true);
      PlayerVariable.method973((byte) 62);
      InventoryConfig.method613(119);
      ClientScriptEnum.method624(-1);
      SomethingQuickChat.method547(-2951);
      EnumStringFetcher.method833((byte) 126);
      SomethingQuickChat2.method528(-1667);
      LightIntensity.method1192((byte) -86);
      Cursor.method1181((byte) -118);
      MapScene.method80(-27401);
      TextureCache.method1612(-11565);
      Texture.method721(20413);
      GlTexture2d.method711(1);
      DummyClass40.method1155();
      GlobalStatics_0.method1016((byte) 127);
      DummyClass3.method71((byte) -124);
      DummyClass55.method1608((byte) 110);
      DummyClass41.method1169(false);
      GameWorld.method1077(0);
      GameWorldSomething.method960(31);
      SomethingGl.method1457();
      DummyClass20.method1818(false);
      ScriptState.method1178((byte) -93);
      SomethingQuickChatK.method853(0);
      ClientScriptCall.method376(false);
      SceneNode.method1860(0);
      GlobalStatics_0.method1429((byte) 53);
      SomethingGl0.method147();
      SceneSomething.method954(128);
      SomethingLight0.method1703(10967);
      SceneSomething2.method1284((byte) -87);
      SomethingSceneI.method906((byte) 112);
      SomethingSceneJ.method871((byte) 115);
      SomethingScene.method1296(1);
      SomethingTilek.method1751((byte) -58);
      SomethingSceneTile.method1011();
      AnimationFrame.method380(-29113);
      DummyClass42.method1187(30351);
      DummyClass43.method1193(-26723);
      AnimationBase.method1595();
      DummyClass24.method1743(false);
      DummyClass61.method726();
      BufferData.method1733(-17148);
      SomethingShadows.method2045();
      GlobalStatics_0.clear();
      DummyClass49.method1365(119);
      DummyClass31.method1682(-82);
      VariableUpdate.method120(1000);
      WidgetUpdate.f(3);
      Inventory.method510(-128);
      AreaSoundEffect.method136(-3);
      DummyClass37.method1034(8642);
      ClientScript.method632(-30497);
      SomethingSoundEffect.method1715();
      DummyClass12.method2202(-196);
      DummyClass50.method1402((byte) 73);
      GlUtils.method923();
      DummyClass38.method1081((byte) 81);
      Projectile.method2019(true);
      StillGraphic.method1954(0);
      DummyClass56.method1646(true);
      GroundItem.method2030((byte) 83);
      SomethingInScenePacket202.method113((byte) -120);
      GameObject.method1958(2);
      DummyClass23.method1744(true);
      HashTableIterator.method1394((byte) -94);
      GlobalStatics_0.method735(-22749);
      DummyClass21.method1806();
      IntegerNode.method382(1);
      SomethingWorldMappy.method396(0);
      MovedStatics0.method59((byte) -87);
      DummyClass58.method1660(13123);
      MilliFrameRegulator.method1771(14635);
      DirectImageProducer.method2187(27316);
      FaceNormal.method1731(12881);
      VertexNormal.method1133((byte) 81);
      LinearHashTable.method1283((byte) 122);
      BufferObject.method2070((byte) 67);
      BZipDecompressor.method1641();
      BZipDecompressorState.method849(2);
      AbstractObjectNode.method563(3);
      ObjectNode.method570(-119);
      AbstractObjectNodeWrapper.method1726(0);
      SomethingMidiFile.method118(2);
      SomethingIndex150.method2255((byte) -128);
      SignLinkAudioOutputStream.method2166();
      FilterPossibly.method1623();
      DummyClass60.method911(26);
      DummyClass14.method2145((byte) -69);
      WaterShader.method1748();
      MaterialShader4.method1700();
      MaterialShader5.method1630((byte) -113);
      DummyClass45.method1238(-112);
      MidiInstrument.method361();
      SomethingMidiI.method1204();
      TextureSampler34.method187(false);
      DummyClass13.method2197(true);
      AbstractTextureSampler.method156(2);
      Something3dRoot.method2235(4);
      TriChromaticImageCache.method1592((byte) 102);
      MonoChromaticImageCache.method1704(65536);
      StringNode0.method143(-46);
      ProceduralTexture.method1409(false);
      AbstractGameWorld.method1071((byte) -115);
      Something3d2.method2245((byte) -74);
      Something3d.method2240(128);
      DummyClass32.method962((byte) -67);
      ClassCheckRequest.method131(-109);
      DummyClass34.method994('\u93bd');
      DummyClass44.method1206((byte) 26);
      int var2 = 87 % ((68 - var1) / 49);
      TextureSampler0.method274(-2);
      TextureSampler1.method217(1);
      TextureSampler2.method317(7759444);
      TextureSampler3.method309(true);
      TextureSampler4.method261(-125);
      TextureSampler5.method288((byte) 110);
      TextureSampler6.method172(11597);
      TextureSampler7.method296((byte) -107);
      TextureSampler8.method357(false);
      TextureSampler9.method206(true);
      TextureSampler10.method348(48);
      TextureSampler11.method266(-1443422260);
      TextureSampler12.method168(-1771542303);
      TextureSampler13.method315(-15028);
      TextureSampler14.method321(-21136);
      TextureSampler15.method245(0);
      TextureSampler16.method209((byte) 79);
      TextureSampler17.method241((byte) 74);
      TextureSampler18.method287(false);
      TextureSampler39.method277((byte) -41);
      TextureSampler19.method258(-97);
      TextureSampler20.method234(-3);
      TextureSampler22.method337(2);
      TextureSampler23.method249(-127);
      TextureSampler24.method227(true);
      TextureSampler25.method333((byte) -54);
      TextureSampler26.method197(1);
      TextureSampler27.method200((byte) 122);
      TextureSampler28.method290(-9);
      TextureSampler29.method325(0);
      TextureSampler30.method211(1024);
      TextureSampler31.method238(9423);
      TextureSampler32.method300(103);
      TextureSampler33.method177((byte) 119);
      TextureSampler35.method294((byte) 30);
      TextureSampler36.method341((byte) 85);
      TextureSampler37.method268((byte) -91);
      TextureSampler38.method351(-1);
      DummyClass7.method2218((byte) -83);
      DummyClass6.method2208(30358);
      DummyClass8.method2225((byte) -120);
      DummyClass4.method2227((byte) 37);
      DummyClass9.method2213((byte) 104);
      DummyClass5.method2212(false);
      GroundItemNode.method627((byte) -122);
      ProjectileNode.method717(109);
      StillGraphicNode.method534(99);
      SomethingOtherWorldMap.method405(true);
      DummyInputStream.method61(-93);
      DummyOutputStream.method67(true);
      ByteArrayNode.method573(-11346);
      TriChromaticImageBuffer.method391(25);
      MonoChromaticImageBuffer.method511((byte) 121);
      AbstractSomethingTexture.method1334((byte) -115);
      SomethingTexture.method1343(false);
      SomethingTexture3.method1348((byte) 100);
      SomethingTexture4.method1350((byte) 75);
      SomethingTexture1.method1345(-71);

    if (GameStub.anInt12 != 0) {
      GameClient.aBoolean2201 = true;
    }

  }

  public void init() {
    if (this.isValidHost()) {
        GameObjectConfig.portOffset = Integer
            .parseInt(this.getParameter("worldid"));
        AbstractGameWorld.usageLocation = Integer
            .parseInt(this.getParameter("modewhere"));
        if (AbstractGameWorld.usageLocation < 0
            || AbstractGameWorld.usageLocation > 1) {
          AbstractGameWorld.usageLocation = 0;
        }

        TextureSampler20.usageMode = Integer
            .parseInt(this.getParameter("modewhat"));
        if ((TextureSampler20.usageMode < 0)
            || TextureSampler20.usageMode > 2) {
          TextureSampler20.usageMode = 0;
        }

        String var1 = this.getParameter("advertsuppressed");
        ProjectileNode.aBoolean3779 = "1".equals(var1);

        try {
          TriChromaticImageBuffer.languageId = Integer.parseInt(
              this.getParameter("lang"));
        } catch (Exception var10) {
          TriChromaticImageBuffer.languageId = 0;
        }

        GlobalStatics_0.setupLanguagePacket(TriChromaticImageBuffer.languageId);
        String var2 = this.getParameter("objecttag");
        DummyClass8.aBoolean4018 = "1".equals(var2);

        String var3 = this.getParameter("js");
        Structure.aBoolean3641 = "1".equals(var3);

        String var4 = this.getParameter("game");
        if ("1".equals(var4)) {
          AbstractImageProducer.gameId = 1;
        } else {
          AbstractImageProducer.gameId = 0;
        }

        try {
          MonoChromaticImageBuffer.affiliateId = Integer.parseInt(
              this.getParameter("affid"));
        } catch (Exception var9) {
          MonoChromaticImageBuffer.affiliateId = 0;
        }

        DummyClass7.settings = SomethingPacket116.aClass94_1745
            .getParameter((byte) 126);
        if (DummyClass7.settings == null) {
          DummyClass7.settings = GroundItemNode.EMPTY_STRING;
        }

        String var5 = this.getParameter("country");
        if (var5 != null) {
          try {
            SomethingPacket151.anInt2607 = Integer.parseInt(var5);
          } catch (Exception var8) {
            SomethingPacket151.anInt2607 = 0;
          }
        }

        String var6 = this.getParameter("haveie6");
        DisplayMode.aBoolean1451 = "1".equals(var6);

        SomethingTilek.client = this;
        this.method41((byte) -56, 765, 32 + TextureSampler20.usageMode, 1530,
            503);
      }
  }

  public void handleDraw(int var1) {
    if ((DummyClass15.state != 1000)) {
        boolean var2 = NPC.method1988(false);
        if (var2 && MidiSomething.aBoolean1158
            && GameWorld.audioOutputStream0 != null) {
          GameWorld.audioOutputStream0.method2158((byte) -78);
        }

        if (((DummyClass15.state == 30) || (DummyClass15.state == 10)) && (
            AnimationSomething.replaceCanvas || (DummyClass41.aLong866 != 0L)
                && DummyClass41.aLong866 < Time.getCurrentTimeMillis())) {
          SceneNode.setWindowMode(AnimationSomething.replaceCanvas,
              MidiSomething.getWindowMode(),
              -8914, AbstractTextureSampler.anInt2378,
              TextureSampler21.anInt3071);
        }

        int var4;
        int var5;
        if (TextureSampler30.fullScreenFrame == null) {
          Component container = null;
          if (TextureSampler30.fullScreenFrame != null) {
            container = TextureSampler30.fullScreenFrame;
          } else if (TextureSampler27.FRAME != null) {
            container = TextureSampler27.FRAME;
          }

          var4 = container.getSize().width;
          var5 = container.getSize().height;
          if (container == TextureSampler27.FRAME) {
            Insets insets = TextureSampler27.FRAME.getInsets();
            var4 -= insets.right + insets.left;
            var5 -= insets.top + insets.bottom;
          }

          if (var4 != AreaSoundEffect.windowWidth
              || (var5 != SceneSomething2.windowHeight)) {
            if (SignLink.formattedOsName.startsWith("mac")) {
              AreaSoundEffect.windowWidth = var4;
              SceneSomething2.windowHeight = var5;
            } else {
              DummyClass25.resizeCanvas();
            }

            DummyClass41.aLong866 = Time.getCurrentTimeMillis() + 500L;
          }
        }

        if (TextureSampler30.fullScreenFrame != null
            && !TextureSampler26.focused && (
            DummyClass15.state == 30 || DummyClass15.state == 10)) {
          SceneNode.setWindowMode(false, SubNode.anInt2577, -8914, -1, -1);
        }

        if (var1 != 40) {
          GameClient.method44(null);
        }

        boolean var10 = false;
        if (TextureSampler30.aBoolean3116) {
          var10 = true;
          TextureSampler30.aBoolean3116 = false;
        }

        if (var10) {
          HashTableIterator.method1396(var1 ^ -41);
        }

        if (GlRenderer.useOpenGlRenderer) {
          for (var4 = 0; (var4 < 100); ++var4) {
            GroundItemNode.aBooleanArray3674[var4] = true;
          }
        }

        if ((DummyClass15.state == 0)) {
          SomethingQuickChat2
              .drawLoadingBar(null, false, var10, AnimationFrame.loadingText,
                  ClientScript.loadingPercent);
        } else if (DummyClass15.state == 5) {
          SomethingOtherWorldMap
              .drawLoadingScreen(FloorOverlay.aClass3_Sub28_Sub17_2096, false);
        } else if ((DummyClass15.state != 10)) {
          if (DummyClass15.state != 25 && (DummyClass15.state != 28)) {
            if (DummyClass15.state == 30) {
              GZipDecompressor.method1127(var1 - 40);
            } else if (DummyClass15.state == 40) {
              AbstractTextureSampler
                  .drawLoadingBox(RenderAnimation.concat(new GameString[]{
                      SceneShadowMap.CONNECTION_LOST, GlobalStatics_0.LINE_BREAK,
                      DummyClass14.ATTEMPTING_TO_RECONNECT
                  }), false);
            }
          } else if ((DummyClass8.anInt4019 != 1)) {
            if (DummyClass8.anInt4019 == 2) {
              if (SomethingInScenePacket202.anInt2275
                  < DummyClass11.anInt2038) {
                SomethingInScenePacket202.anInt2275 = DummyClass11.anInt2038;
              }

              var4 = (-DummyClass11.anInt2038
                  + SomethingInScenePacket202.anInt2275) * 50
                  / SomethingInScenePacket202.anInt2275 + 50;
              AbstractTextureSampler
                  .drawLoadingBox(RenderAnimation.concat(new GameString[]{
                      TextureSampler39.LOADING_PLEASE_WAIT,
                      TextureSampler29.aClass94_3399,
                      SomethingScene.toString(var4),
                      SomethingQuickChatK.aClass94_148
                  }), false);
            } else {
              AbstractTextureSampler
                  .drawLoadingBox(TextureSampler39.LOADING_PLEASE_WAIT, false);
            }
          } else {
            if ((GlobalStatics_0.anInt2579 < TextureSampler5.anInt3293)) {
              GlobalStatics_0.anInt2579 = TextureSampler5.anInt3293;
            }

            var4 = 50 * (GlobalStatics_0.anInt2579 - TextureSampler5.anInt3293)
                / GlobalStatics_0.anInt2579;
            AbstractTextureSampler
                .drawLoadingBox(RenderAnimation.concat(new GameString[]{
                    TextureSampler39.LOADING_PLEASE_WAIT,
                    TextureSampler29.aClass94_3399,
                    SomethingScene.toString(var4),
                    SomethingQuickChatK.aClass94_148
                }), false);
          }
        } else {
          AnimationFrame.method381(true);
        }
        if (GlRenderer.useOpenGlRenderer && (DummyClass15.state != 0)) {
          GlRenderer.swapBuffers();
          Arrays.fill(DummyClass9.aBooleanArray4008, false);
        } else {
          Graphics graphics;
          if (((DummyClass15.state == 30) || DummyClass15.state == 10)
              && (ClientScript.rectangleDebugType == 0) && !var10) {
            try {
              graphics = GameCanvas.INSTANCE.getGraphics();

              for (var5 = 0; SomethingWorldMapy.widgetQuads > var5; ++var5) {
                if (DummyClass9.aBooleanArray4008[var5]) {
                  Something3d.viewImageProducer
                      .draw(graphics, GlTexture2d.quadx1[var5],
                          AbstractAudioOutputStream.quadx0[var5],
                          Mobile.quady1[var5],
                          Player.quady0[var5], 6260);
                  DummyClass9.aBooleanArray4008[var5] = false;
                }
              }
            } catch (Exception var8) {
              GameCanvas.INSTANCE.repaint();
            }
          } else if (DummyClass15.state != 0) {
            try {
              graphics = GameCanvas.INSTANCE.getGraphics();
              Something3d.viewImageProducer.draw(0, 0, graphics, 0);

              for (var5 = 0; var5 < SomethingWorldMapy.widgetQuads; ++var5) {
                DummyClass9.aBooleanArray4008[var5] = false;
              }
            } catch (Exception var7) {
              var7.printStackTrace();
              GameCanvas.INSTANCE.repaint();
            }
          }
        }

        if (DummyClass43.aBoolean913) {
          SomethingTexture3.method1346(26211);
        }

        if (GlobalStatics_0.safemode && DummyClass15.state == 10
            && (InventoryConfig.anInt3655 != -1)) {
          GlobalStatics_0.safemode = false;
          DummyClass25.writeSettings(DummyClass35.signLink);
        }

      }
  }

  public void initialize(int var1) {
    DummyClass25.resizeCanvas();
      TextureSampler31.fileCacheRequester = new FileCacheRequester();
      DummyClass43.ondemandRequester = new OndemandRequester();
      if (TextureSampler20.usageMode != 0) {
        SomethingMidiFile.byteArrayPool = new byte[50][];
      }

      ClientScriptCall.anInt2451 = GameObjectConfig.portOffset;
      AbstractObjectNode.loadSettings(DummyClass35.signLink, 0);
      if (AbstractGameWorld.usageLocation == 0) {
        GameException.serverHost = this.getCodeBase().getHost();
        DummyClass41.secondaryPort = 443;
        ProjectileNode.primaryPort = '\uaa4a';
      } else {
        if (AbstractGameWorld.usageLocation == 1) {
          GameException.serverHost = this.getCodeBase().getHost();
          DummyClass41.secondaryPort = GameObjectConfig.portOffset + 50000;
          ProjectileNode.primaryPort = GameObjectConfig.portOffset + 40000;
        } else if (AbstractGameWorld.usageLocation == 2) {
          DummyClass41.secondaryPort = GameObjectConfig.portOffset + 50000;
          ProjectileNode.primaryPort = GameObjectConfig.portOffset + 40000;
        }
      }

      if (AbstractImageProducer.gameId == 1) {
        DummyClass55.aBoolean1419 = true;
        GlEnvironment.defaultSunColor = 0xffffff;
        GlEnvironment.defaultFogColor = 0;
        AudioWorker.aShortArrayArray344 = AbstractObjectNodeWrapper.aShortArrayArray1619;
        DummyClass55.aShortArrayArray1429 = SomethingTexture.aShortArrayArray2634;
        Inventory.aShortArray2548 = MapScene.aShortArray63;
        CollisionMap.aShortArray1311 = GlobalStatics_2.aShortArray2219;
      } else {
        AudioWorker.aShortArrayArray344 = InventoryConfig.aShortArrayArray3654;
        CollisionMap.aShortArray1311 = TextureSampler32.aShortArray3349;
        DummyClass55.aShortArrayArray1429 = DummyClass29.aShortArrayArray435;
        Inventory.aShortArray2548 = Something3d.aShortArray3011;
      }

      GameWorldSomething.anInt506 = DummyClass41.secondaryPort;
      DummyClass11.anInt2036 = ProjectileNode.primaryPort;
      DummyClass36.aString2611 = GameException.serverHost;
      DummyClass24.anInt1658 = ProjectileNode.primaryPort;
      TextureSampler38.aShortArray3455 = TextureSampler16.aShortArray3110 =
          SceneShadowMap.aShortArray1779 = TextureSampler38.aShortArray3453 = new short[256];
      if (var1 != 2) {
        GameClient.method51(null);
      }

      Projectile.anInt2894 = DummyClass24.anInt1658;
      if (SignLink.anInt1214 == 3 && AbstractGameWorld.usageLocation != 2) {
        ClientScriptCall.anInt2451 = GameObjectConfig.portOffset;
      }

      AudioSomethingSomething.initializeKeyTable();
      TextureSampler34.method193((byte) 115, GameCanvas.INSTANCE);
      Mouse.bindMouseListener(GameCanvas.INSTANCE);
      DummyClass35.mouseWheel = DummyClass60.createMouseWheel((byte) 15);
      if (DummyClass35.mouseWheel != null) {
        DummyClass35.mouseWheel.bind(GameCanvas.INSTANCE, -97);
      }

      DummyClass5.anInt2994 = SignLink.anInt1214;

      try {
        if (DummyClass35.signLink.cacheDataFile != null) {
          DummyClass55.cacheDataFile =
              new BufferedFile(DummyClass35.signLink.cacheDataFile, 5200, 0);

          for (int var2 = 0; (var2 < 28); ++var2) {
            DummyClass7.cacheIndexFiles[var2] =
                new BufferedFile(DummyClass35.signLink.cacheIndexFiles[var2],
                    6000, 0);
          }

          MonoChromaticImageCache.tableIndexFile =
              new BufferedFile(DummyClass35.signLink.tableIndexFile, 6000, 0);
          GlobalStatics_0.tableCache =
              new FileCache(255, DummyClass55.cacheDataFile,
                  MonoChromaticImageCache.tableIndexFile,
                  500000);
          LinearHashTable.uidFile = new BufferedFile(
              DummyClass35.signLink.aClass122_1207, 24, 0);
          DummyClass35.signLink.cacheIndexFiles = null;
          DummyClass35.signLink.tableIndexFile = null;
          DummyClass35.signLink.aClass122_1207 = null;
          DummyClass35.signLink.cacheDataFile = null;
        }
      } catch (IOException var3) {
        LinearHashTable.uidFile = null;
        DummyClass55.cacheDataFile = null;
        MonoChromaticImageCache.tableIndexFile = null;
        GlobalStatics_0.tableCache = null;
      }

      DummyClass10.aClass94_2083 = SceneSomething.aClass94_485;
      if ((AbstractGameWorld.usageLocation != 0)) {
        DummyClass29.aBoolean438 = true;
      }
  }

  public static Widget method42(Widget var0) {
    int var1 = GameClient.method44(var0).method94((byte) -74);
    if (var1 == 0) {
      return null;
    } else {
      for (int var2 = 0; var2 < var1; ++var2) {
        var0 = EnumStringFetcher.getWidget((byte) 127, var0.anInt190);
        if (var0 == null) {
          return null;
        }
      }

      return var0;
    }
  }

  public static void method43(boolean var0) {
    if (!var0) {
        GLStatics.aClass3_Sub11ArrayArray2199 = null;
      }

      GlobalStatics_1.mapFileIds = null;
      GlobalStatics_1.aClass94_2196 = null;
      GameClient.aClass94_2198 = null;
      GlobalStatics_1.aClass130_2194 = null;
      GlobalStatics_1.aClass94_2197 = null;
      GLStatics.aClass3_Sub11ArrayArray2199 = null;
  }

  public static WidgetAccess method44(Widget var0) {
    WidgetAccess var1 = (WidgetAccess) DummyClass23.aClass130_1659.get(
        ((long) var0.anInt279 << 32) + var0.anInt191);
    return var1 != null ? var1 : var0.aClass3_Sub1_257;
  }

  public static AnimationSequence method45(int id, byte var1) {
    if (var1 != -20) {
      GLStatics.aClass3_Sub11ArrayArray2199 = null;
    }

    AnimationSequence var2 = (AnimationSequence) ProceduralTexture.aClass93_1146
        .get(
            id);
    if (var2 == null) {
      byte[] var3 = AnimationSequence.animationSequences.getBytes(
          AbstractFrameRegulator.method1765(id, -1732504441),
          MouseRecorder.method1262(117, id));
      var2 = new AnimationSequence();
      var2.anInt1864 = id;
      if (var3 != null) {
        var2.method2053(new Buffer(var3), (byte) -102);
      }

      var2.method2058((byte) -41);
      ProceduralTexture.aClass93_1146.get((byte) -103, var2, id);
      return var2;
    } else {
      return var2;
    }

  }



  public static void method50(Widget[] var0, int var1, int var2, int var3,
      int var4, int var5,
      int var6, int var7) {
    for (int var8 = 0; var8 < var0.length; ++var8) {
      Widget var9 = var0[var8];
      if (var9 != null && var9.anInt190 == var1 && (!var9.aBoolean233
          || var9.anInt187 == 0
          || var9.aBoolean195 || GameClient.method44(var9).anInt2205 != 0
          || var9 == DummyClass18.aClass11_88
          || var9.anInt189 == 1338) && (!var9.aBoolean233 || !GameClient
          .method51(var9))) {
        int var10 = var9.anInt306 + var6;
        int var11 = var9.anInt210 + var7;
        int var12;
        int var13;
        int var14;
        int var15;
        if (var9.anInt187 == 2) {
          var12 = var2;
          var13 = var3;
          var14 = var4;
          var15 = var5;
        } else {
          int var16 = var10 + var9.anInt168;
          int var17 = var11 + var9.anInt193;
          if (var9.anInt187 == 9) {
            ++var16;
            ++var17;
          }

          var12 = var10 > var2 ? var10 : var2;
          var13 = var11 > var3 ? var11 : var3;
          var14 = var16 < var4 ? var16 : var4;
          var15 = var17 < var5 ? var17 : var5;
        }

        if (var9 == DummyClass42.aClass11_886) {
          DummyClass60.aBoolean440 = true;
          SomethingVolume15.anInt2421 = var10;
          GlobalStatics_2.anInt2218 = var11;
        }

        if (!var9.aBoolean233 || var12 < var14 && var13 < var15) {
          if (var9.anInt187 == 0) {
            if (!var9.aBoolean233 && GameClient.method51(var9)
                && DummyClass56.aClass11_1453 != var9) {
              continue;
            }

            if (var9.aBoolean219 && SomethingTilek.anInt1676 >= var12
                && GlobalStatics_0.anInt1709 >= var13
                && SomethingTilek.anInt1676 < var14
                && GlobalStatics_0.anInt1709 < var15) {
              for (ClientScriptCall var27 =
                  (ClientScriptCall) DummyClass31.aClass61_1471.getFirst();
                  var27 != null;
                  var27 = (ClientScriptCall) DummyClass31.aClass61_1471
                      .getNext()) {
                if (var27.aBoolean2446) {
                  var27.unlinkNode();
                  var27.aClass11_2449.aBoolean163 = false;
                }
              }

              if (SomethingTexture3.anInt2658 == 0) {
                DummyClass42.aClass11_886 = null;
                DummyClass18.aClass11_88 = null;
              }

              ClanChatUser.anInt2475 = 0;
            }
          }

          if (var9.aBoolean233) {
            boolean var26;
            var26 = SomethingTilek.anInt1676 >= var12
                && GlobalStatics_0.anInt1709 >= var13
                && SomethingTilek.anInt1676 < var14
                && GlobalStatics_0.anInt1709 < var15;

            boolean var25 = false;
            if (TextureSampler21.anInt3069 == 1 && var26) {
              var25 = true;
            }

            boolean var18 = false;
            if (Structure.anInt3644 == 1 && DummyClass5.anInt2993 >= var12
                && DummyClass36.anInt2614 >= var13
                && DummyClass5.anInt2993 < var14
                && DummyClass36.anInt2614 < var15) {
              var18 = true;
            }

            int var19;
            int var21;
            if (var9.aByteArray263 != null) {
              for (var19 = 0; var19 < var9.aByteArray263.length; ++var19) {
                if (!GameObjectConfig.aBooleanArray1490[var9.aByteArray263[var19]]) {
                  if (var9.anIntArray310 != null) {
                    var9.anIntArray310[var19] = 0;
                  }
                } else if (var9.anIntArray310 == null
                    || AbstractGameWorld.updateCycle
                    >= var9.anIntArray310[var19]) {
                  byte var20 = var9.aByteArray231[var19];
                  if (var20 == 0
                      || ((var20 & 2) == 0
                      || GameObjectConfig.aBooleanArray1490[86]) && (
                      (var20 & 1) == 0
                          || GameObjectConfig.aBooleanArray1490[82]) && (
                      (var20 & 4) == 0
                          || GameObjectConfig.aBooleanArray1490[81])) {
                    DummyOutputStream
                        .method66(GroundItemNode.EMPTY_STRING, -1, var19 + 1,
                            (byte) -29, var9.anInt279);
                    var21 = var9.anIntArray299[var19];
                    if (var9.anIntArray310 == null) {
                      var9.anIntArray310 = new int[var9.aByteArray263.length];
                    }

                    if (var21 == 0) {
                      var9.anIntArray310[var19] = Integer.MAX_VALUE;
                    } else {
                      var9.anIntArray310[var19] =
                          AbstractGameWorld.updateCycle + var21;
                    }
                  }
                }
              }
            }

            if (var18) {
              WidgetUpdate
                  .createIndexedColorSprite(DummyClass36.anInt2614 - var11,
                      DummyClass5.anInt2993 - var10, 97, var9);
            }

            if (DummyClass42.aClass11_886 != null
                && DummyClass42.aClass11_886 != var9 && var26
                && GameClient.method44(var9).method98(false)) {
              DummyClass32.aClass11_526 = var9;
            }

            if (var9 == DummyClass18.aClass11_88) {
              DummyClass52.aBoolean1167 = true;
              TextureSampler20.anInt3156 = var10;
              DummyClass21.anInt1761 = var11;
            }

            if (var9.aBoolean195 || var9.anInt189 != 0) {
              ClientScriptCall var30;
              if (var26 && PlayerVariable.mouseWheelOffset != 0
                  && var9.anObjectArray183 != null) {
                var30 = new ClientScriptCall();
                var30.aBoolean2446 = true;
                var30.aClass11_2449 = var9;
                var30.anInt2441 = PlayerVariable.mouseWheelOffset;
                var30.arguments = var9.anObjectArray183;
                DummyClass31.aClass61_1471.addLast(var30);
              }

              if (DummyClass42.aClass11_886 != null
                  || MouseRecorder.aClass11_1017 != null
                  || DummyClass36.aBoolean2615
                  || var9.anInt189 != 1400 && ClanChatUser.anInt2475 > 0) {
                var18 = false;
                var25 = false;
                var26 = false;
              }

              int var29;
              if (var9.anInt189 != 0) {
                if (var9.anInt189 == 1337) {
                  FloorOverlay.aClass11_2091 = var9;
                  DummyClass29.method909(124, var9);
                  continue;
                }

                if (var9.anInt189 == 1338) {
                  if (var18) {
                    DummyClass3.anInt56 = DummyClass5.anInt2993 - var10;
                    DummyClass43.anInt916 = DummyClass36.anInt2614 - var11;
                  }
                  continue;
                }

                if (var9.anInt189 == 1400) {
                  SomethingWorldMapy.aClass11_3551 = var9;
                  if (var18) {
                    if (GameObjectConfig.aBooleanArray1490[82]
                        && TextureSampler35.rights > 0) {
                      var19 =
                          (int) ((DummyClass5.anInt2993 - var10
                              - var9.anInt168 / 2)
                              * 2.0D
                              / AbstractGameWorld.aFloat727);
                      var29 =
                          (int) ((DummyClass36.anInt2614 - var11
                              - var9.anInt193 / 2)
                              * 2.0D
                              / AbstractGameWorld.aFloat727);
                      var21 = SomethingQuickChat2.anInt3536 + var19;
                      int var32 = SpawnedGameObject.anInt2251 + var29;
                      int var23 = var21 + TextureSampler37.anInt3256;
                      int var24 =
                          DummyClass58.anInt1460 - 1 - var32 + MapScene.anInt65;
                      BufferedFile.method979(var23, var24, 0, (byte) -4);
                      TextureSampler4.method264((byte) 126);
                      continue;
                    }

                    ClanChatUser.anInt2475 = 1;
                    BufferObject.anInt1881 = SomethingTilek.anInt1676;
                    DummyClass53.anInt1336 = GlobalStatics_0.anInt1709;
                    continue;
                  }

                  if (var25 && ClanChatUser.anInt2475 > 0) {
                    if (ClanChatUser.anInt2475 == 1 && (
                        BufferObject.anInt1881 != SomethingTilek.anInt1676
                            || DummyClass53.anInt1336 != GlobalStatics_0.anInt1709)) {
                      OndemandFileRequest.anInt4073 = SomethingQuickChat2.anInt3536;
                      DummyClass35.anInt660 = SpawnedGameObject.anInt2251;
                      ClanChatUser.anInt2475 = 2;
                    }

                    if (ClanChatUser.anInt2475 == 2) {
                      ScriptState
                          .method1175(OndemandFileRequest.anInt4073 + (int) (
                              (BufferObject.anInt1881
                                  - SomethingTilek.anInt1676) * 2.0D
                                  / NPC.aFloat3979), 112);
                      TextureSampler8
                          .method354(-126, DummyClass35.anInt660 + (int) (
                              (DummyClass53.anInt1336 - GlobalStatics_0.anInt1709)
                                  * 2.0D
                                  / NPC.aFloat3979));
                    }
                    continue;
                  }

                  ClanChatUser.anInt2475 = 0;
                  continue;
                }

                if (var9.anInt189 == 1401) {
                  if (var25) {
                    TextureSampler23.method253(-22611, var9.anInt168,
                        GlobalStatics_0.anInt1709 - var11,
                        SomethingTilek.anInt1676 - var10, var9.anInt193);
                  }
                  continue;
                }

                if (var9.anInt189 == 1402) {
                  if (!GlRenderer.useOpenGlRenderer) {
                    DummyClass29.method909(113, var9);
                  }
                  continue;
                }
              }

              if (!var9.aBoolean188 && var18) {
                var9.aBoolean188 = true;
                if (var9.anObjectArray165 != null) {
                  var30 = new ClientScriptCall();
                  var30.aBoolean2446 = true;
                  var30.aClass11_2449 = var9;
                  var30.anInt2447 = DummyClass5.anInt2993 - var10;
                  var30.anInt2441 = DummyClass36.anInt2614 - var11;
                  var30.arguments = var9.anObjectArray165;
                  DummyClass31.aClass61_1471.addLast(var30);
                }
              }

              if (var9.aBoolean188 && var25 && var9.anObjectArray170 != null) {
                var30 = new ClientScriptCall();
                var30.aBoolean2446 = true;
                var30.aClass11_2449 = var9;
                var30.anInt2447 = SomethingTilek.anInt1676 - var10;
                var30.anInt2441 = GlobalStatics_0.anInt1709 - var11;
                var30.arguments = var9.anObjectArray170;
                DummyClass31.aClass61_1471.addLast(var30);
              }

              if (var9.aBoolean188 && !var25) {
                var9.aBoolean188 = false;
                if (var9.anObjectArray239 != null) {
                  var30 = new ClientScriptCall();
                  var30.aBoolean2446 = true;
                  var30.aClass11_2449 = var9;
                  var30.anInt2447 = SomethingTilek.anInt1676 - var10;
                  var30.anInt2441 = GlobalStatics_0.anInt1709 - var11;
                  var30.arguments = var9.anObjectArray239;
                  DummyClass45.aClass61_983.addLast(var30);
                }
              }

              if (var25 && var9.anObjectArray180 != null) {
                var30 = new ClientScriptCall();
                var30.aBoolean2446 = true;
                var30.aClass11_2449 = var9;
                var30.anInt2447 = SomethingTilek.anInt1676 - var10;
                var30.anInt2441 = GlobalStatics_0.anInt1709 - var11;
                var30.arguments = var9.anObjectArray180;
                DummyClass31.aClass61_1471.addLast(var30);
              }

              if (!var9.aBoolean163 && var26) {
                var9.aBoolean163 = true;
                if (var9.anObjectArray248 != null) {
                  var30 = new ClientScriptCall();
                  var30.aBoolean2446 = true;
                  var30.aClass11_2449 = var9;
                  var30.anInt2447 = SomethingTilek.anInt1676 - var10;
                  var30.anInt2441 = GlobalStatics_0.anInt1709 - var11;
                  var30.arguments = var9.anObjectArray248;
                  DummyClass31.aClass61_1471.addLast(var30);
                }
              }

              if (var9.aBoolean163 && var26 && var9.anObjectArray276 != null) {
                var30 = new ClientScriptCall();
                var30.aBoolean2446 = true;
                var30.aClass11_2449 = var9;
                var30.anInt2447 = SomethingTilek.anInt1676 - var10;
                var30.anInt2441 = GlobalStatics_0.anInt1709 - var11;
                var30.arguments = var9.anObjectArray276;
                DummyClass31.aClass61_1471.addLast(var30);
              }

              if (var9.aBoolean163 && !var26) {
                var9.aBoolean163 = false;
                if (var9.anObjectArray281 != null) {
                  var30 = new ClientScriptCall();
                  var30.aBoolean2446 = true;
                  var30.aClass11_2449 = var9;
                  var30.anInt2447 = SomethingTilek.anInt1676 - var10;
                  var30.anInt2441 = GlobalStatics_0.anInt1709 - var11;
                  var30.arguments = var9.anObjectArray281;
                  DummyClass45.aClass61_983.addLast(var30);
                }
              }

              if (var9.anObjectArray269 != null) {
                var30 = new ClientScriptCall();
                var30.aClass11_2449 = var9;
                var30.arguments = var9.anObjectArray269;
                DummyClass18.aClass61_82.addLast(var30);
              }

              ClientScriptCall var22;
              if (var9.anObjectArray161 != null
                  && DummyClass18.anInt87 > var9.anInt284) {
                if (var9.anIntArray211 != null
                    && DummyClass18.anInt87 - var9.anInt284 <= 32) {
                  label531:
                  for (var19 = var9.anInt284; var19 < DummyClass18.anInt87;
                      ++var19) {
                    var29 = NPC.anIntArray3986[var19 & 31];

                    for (var21 = 0; var21 < var9.anIntArray211.length;
                        ++var21) {
                      if (var9.anIntArray211[var21] == var29) {
                        var22 = new ClientScriptCall();
                        var22.aClass11_2449 = var9;
                        var22.arguments = var9.anObjectArray161;
                        DummyClass31.aClass61_1471.addLast(var22);
                        break label531;
                      }
                    }
                  }
                } else {
                  var30 = new ClientScriptCall();
                  var30.aClass11_2449 = var9;
                  var30.arguments = var9.anObjectArray161;
                  DummyClass31.aClass61_1471.addLast(var30);
                }

                var9.anInt284 = DummyClass18.anInt87;
              }

              if (var9.anObjectArray221 != null
                  && AreaSoundEffect.anInt2317 > var9.anInt242) {
                if (var9.anIntArray185 != null
                    && AreaSoundEffect.anInt2317 - var9.anInt242 <= 32) {
                  label512:
                  for (var19 = var9.anInt242; var19 < AreaSoundEffect.anInt2317;
                      ++var19) {
                    var29 = DummyClass8.anIntArray4025[var19 & 31];

                    for (var21 = 0; var21 < var9.anIntArray185.length;
                        ++var21) {
                      if (var9.anIntArray185[var21] == var29) {
                        var22 = new ClientScriptCall();
                        var22.aClass11_2449 = var9;
                        var22.arguments = var9.anObjectArray221;
                        DummyClass31.aClass61_1471.addLast(var22);
                        break label512;
                      }
                    }
                  }
                } else {
                  var30 = new ClientScriptCall();
                  var30.aClass11_2449 = var9;
                  var30.arguments = var9.anObjectArray221;
                  DummyClass31.aClass61_1471.addLast(var30);
                }

                var9.anInt242 = AreaSoundEffect.anInt2317;
              }

              if (var9.anObjectArray282 != null
                  && GlobalStatics_0.anInt641 > var9.anInt213) {
                if (var9.anIntArray286 != null
                    && GlobalStatics_0.anInt641 - var9.anInt213 <= 32) {
                  label493:
                  for (var19 = var9.anInt213; var19 < GlobalStatics_0.anInt641;
                      ++var19) {
                    var29 = AbstractGameWorld.anIntArray726[var19 & 31];

                    for (var21 = 0; var21 < var9.anIntArray286.length;
                        ++var21) {
                      if (var9.anIntArray286[var21] == var29) {
                        var22 = new ClientScriptCall();
                        var22.aClass11_2449 = var9;
                        var22.arguments = var9.anObjectArray282;
                        DummyClass31.aClass61_1471.addLast(var22);
                        break label493;
                      }
                    }
                  }
                } else {
                  var30 = new ClientScriptCall();
                  var30.aClass11_2449 = var9;
                  var30.arguments = var9.anObjectArray282;
                  DummyClass31.aClass61_1471.addLast(var30);
                }

                var9.anInt213 = GlobalStatics_0.anInt641;
              }

              if (var9.anObjectArray174 != null
                  && FileTable.anInt944 > var9.anInt255) {
                if (var9.anIntArray175 != null
                    && FileTable.anInt944 - var9.anInt255 <= 32) {
                  label474:
                  for (var19 = var9.anInt255; var19 < FileTable.anInt944;
                      ++var19) {
                    var29 = SomethingQuickChat.anIntArray3565[var19 & 31];

                    for (var21 = 0; var21 < var9.anIntArray175.length;
                        ++var21) {
                      if (var9.anIntArray175[var21] == var29) {
                        var22 = new ClientScriptCall();
                        var22.aClass11_2449 = var9;
                        var22.arguments = var9.anObjectArray174;
                        DummyClass31.aClass61_1471.addLast(var22);
                        break label474;
                      }
                    }
                  }
                } else {
                  var30 = new ClientScriptCall();
                  var30.aClass11_2449 = var9;
                  var30.arguments = var9.anObjectArray174;
                  DummyClass31.aClass61_1471.addLast(var30);
                }

                var9.anInt255 = FileTable.anInt944;
              }

              if (var9.anObjectArray158 != null
                  && GZipDecompressor.anInt815 > var9.anInt311) {
                if (var9.anIntArray274 != null
                    && GZipDecompressor.anInt815 - var9.anInt311 <= 32) {
                  label455:
                  for (var19 = var9.anInt311; var19 < GZipDecompressor.anInt815;
                      ++var19) {
                    var29 = ProjectileNode.anIntArray3780[var19 & 31];

                    for (var21 = 0; var21 < var9.anIntArray274.length;
                        ++var21) {
                      if (var9.anIntArray274[var21] == var29) {
                        var22 = new ClientScriptCall();
                        var22.aClass11_2449 = var9;
                        var22.arguments = var9.anObjectArray158;
                        DummyClass31.aClass61_1471.addLast(var22);
                        break label455;
                      }
                    }
                  }
                } else {
                  var30 = new ClientScriptCall();
                  var30.aClass11_2449 = var9;
                  var30.arguments = var9.anObjectArray158;
                  DummyClass31.aClass61_1471.addLast(var30);
                }

                var9.anInt311 = GZipDecompressor.anInt815;
              }

              if (IdentityKit.anInt472 > var9.anInt234
                  && var9.anObjectArray256 != null) {
                var30 = new ClientScriptCall();
                var30.aClass11_2449 = var9;
                var30.arguments = var9.anObjectArray256;
                DummyClass31.aClass61_1471.addLast(var30);
              }

              if (DummyClass31.anInt1472 > var9.anInt234
                  && var9.anObjectArray156 != null) {
                var30 = new ClientScriptCall();
                var30.aClass11_2449 = var9;
                var30.arguments = var9.anObjectArray156;
                DummyClass31.aClass61_1471.addLast(var30);
              }

              if (DummyClass10.anInt2087 > var9.anInt234
                  && var9.anObjectArray313 != null) {
                var30 = new ClientScriptCall();
                var30.aClass11_2449 = var9;
                var30.arguments = var9.anObjectArray313;
                DummyClass31.aClass61_1471.addLast(var30);
              }

              if (BufferData.anInt1642 > var9.anInt234
                  && var9.anObjectArray268 != null) {
                var30 = new ClientScriptCall();
                var30.aClass11_2449 = var9;
                var30.arguments = var9.anObjectArray268;
                DummyClass31.aClass61_1471.addLast(var30);
              }

              if (Projectile.anInt2905 > var9.anInt234
                  && var9.anObjectArray315 != null) {
                var30 = new ClientScriptCall();
                var30.aClass11_2449 = var9;
                var30.arguments = var9.anObjectArray315;
                DummyClass31.aClass61_1471.addLast(var30);
              }

              var9.anInt234 = TextureSampler23.anInt3213;
              if (var9.anObjectArray220 != null) {
                for (var19 = 0; var19 < SomethingOtherWorldMap.anInt2537;
                    ++var19) {
                  ClientScriptCall var31 = new ClientScriptCall();
                  var31.aClass11_2449 = var9;
                  var31.anInt2444 = SomethingPacket116.anIntArray1755[var19];
                  var31.anInt2443 = FaceNormal.anIntArray1638[var19];
                  var31.arguments = var9.anObjectArray220;
                  DummyClass31.aClass61_1471.addLast(var31);
                }
              }

              if (SomethingQuickChat2.aBoolean3531
                  && var9.anObjectArray217 != null) {
                var30 = new ClientScriptCall();
                var30.aClass11_2449 = var9;
                var30.arguments = var9.anObjectArray217;
                DummyClass31.aClass61_1471.addLast(var30);
              }
            }
          }

          if (!var9.aBoolean233 && DummyClass42.aClass11_886 == null
              && MouseRecorder.aClass11_1017 == null
              && !DummyClass36.aBoolean2615) {
            if ((var9.anInt212 >= 0 || var9.anInt228 != 0)
                && SomethingTilek.anInt1676 >= var12
                && GlobalStatics_0.anInt1709 >= var13
                && SomethingTilek.anInt1676 < var14
                && GlobalStatics_0.anInt1709 < var15) {
              if (var9.anInt212 >= 0) {
                DummyClass56.aClass11_1453 = var0[var9.anInt212];
              } else {
                DummyClass56.aClass11_1453 = var9;
              }
            }

            if (var9.anInt187 == 8 && SomethingTilek.anInt1676 >= var12
                && GlobalStatics_0.anInt1709 >= var13
                && SomethingTilek.anInt1676 < var14
                && GlobalStatics_0.anInt1709 < var15) {
              DummyClass29.aClass11_439 = var9;
            }

            if (var9.anInt252 > var9.anInt193) {
              DummyClass20.method1819(GlobalStatics_0.anInt1709, var9.anInt193, var9,
                  (byte) -101,
                  SomethingTilek.anInt1676, var10 + var9.anInt168, var11,
                  var9.anInt252);
            }
          }

          if (var9.anInt187 == 0) {
            GameClient
                .method50(var0, var9.anInt279, var12, var13, var14, var15,
                    var10 - var9.anInt247,
                    var11 - var9.anInt208);
            if (var9.aClass11Array262 != null) {
              GameClient
                  .method50(var9.aClass11Array262, var9.anInt279, var12, var13,
                      var14, var15,
                      var10 - var9.anInt247, var11 - var9.anInt208);
            }

            SomethingPacket151 var28 =
                (SomethingPacket151) TextureSampler23.aClass130_3208.get(
                    var9.anInt279);
            if (var28 != null) {
              SpotAnimationConfig
                  .method967(var10, var13, 2, var11, var14, var28.anInt2602,
                      var12,
                      var15);
            }
          }
        }
      }
    }

  }

  public static boolean method51(Widget var0) {
    if (LinearHashTable.aBoolean1040) {
      if (GameClient.method44(var0).anInt2205 != 0) {
        return false;
      }

      if (var0.anInt187 == 0) {
        return false;
      }
    }

    return var0.aBoolean155;
  }

}
