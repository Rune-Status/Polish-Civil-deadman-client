package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.compression.BZipDecompressorStatics;
import com.jagex.runescape.camera.CameraStatics;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.common.TimeUtilities;
import com.jagex.runescape.compression.HuffmanEncoder;
import com.jagex.runescape.input.KeyboardStatics;
import com.jagex.runescape.input.MouseStatics;
import com.jagex.runescape.input.MouseWheelStatics;
import com.jagex.runescape.opengl.DummyClass33;
import com.jagex.runescape.opengl.DummyClass46;
import com.jagex.runescape.opengl.GLStatics;
import com.jagex.runescape.opengl.GlEnvironment;
import com.jagex.runescape.opengl.GlModel;
import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.GlTexture2d;
import com.jagex.runescape.opengl.GlUtils;
import com.jagex.runescape.opengl.MaterialShader4;
import com.jagex.runescape.opengl.SomethingGl;
import com.jagex.runescape.opengl.SomethingShadows;
import com.jagex.runescape.opengl.Texture;
import com.jagex.runescape.opengl.WaterShader;
import com.jagex.runescape.settings.SettingsStatics;
import com.jagex.runescape.sound.SomethingAudio;
import com.jagex.runescape.statics.DummyClass1;
import com.jagex.runescape.statics.DummyClass10;
import com.jagex.runescape.statics.DummyClass11;
import com.jagex.runescape.statics.DummyClass12;
import com.jagex.runescape.statics.DummyClass13;
import com.jagex.runescape.statics.DummyClass14;
import com.jagex.runescape.statics.DummyClass15;
import com.jagex.runescape.statics.DummyClass17;
import com.jagex.runescape.statics.DummyClass18;
import com.jagex.runescape.statics.DummyClass2;
import com.jagex.runescape.statics.DummyClass20;
import com.jagex.runescape.statics.DummyClass21;
import com.jagex.runescape.statics.DummyClass22;
import com.jagex.runescape.statics.DummyClass23;
import com.jagex.runescape.statics.DummyClass24;
import com.jagex.runescape.statics.DummyClass25;
import com.jagex.runescape.statics.DummyClass26;
import com.jagex.runescape.statics.DummyClass27;
import com.jagex.runescape.statics.DummyClass28;
import com.jagex.runescape.statics.DummyClass29;
import com.jagex.runescape.statics.DummyClass3;
import com.jagex.runescape.statics.DummyClass30;
import com.jagex.runescape.statics.DummyClass31;
import com.jagex.runescape.statics.DummyClass32;
import com.jagex.runescape.statics.DummyClass34;
import com.jagex.runescape.statics.DummyClass35;
import com.jagex.runescape.statics.DummyClass36;
import com.jagex.runescape.statics.DummyClass37;
import com.jagex.runescape.statics.DummyClass38;
import com.jagex.runescape.statics.DummyClass39;
import com.jagex.runescape.statics.DummyClass4;
import com.jagex.runescape.statics.DummyClass40;
import com.jagex.runescape.statics.DummyClass41;
import com.jagex.runescape.statics.DummyClass42;
import com.jagex.runescape.statics.DummyClass43;
import com.jagex.runescape.statics.DummyClass44;
import com.jagex.runescape.statics.DummyClass45;
import com.jagex.runescape.statics.DummyClass47;
import com.jagex.runescape.statics.DummyClass49;
import com.jagex.runescape.statics.DummyClass5;
import com.jagex.runescape.statics.DummyClass50;
import com.jagex.runescape.statics.DummyClass51;
import com.jagex.runescape.statics.DummyClass52;
import com.jagex.runescape.statics.DummyClass53;
import com.jagex.runescape.statics.DummyClass54;
import com.jagex.runescape.statics.DummyClass55;
import com.jagex.runescape.statics.DummyClass56;
import com.jagex.runescape.statics.DummyClass58;
import com.jagex.runescape.statics.DummyClass59;
import com.jagex.runescape.statics.DummyClass6;
import com.jagex.runescape.statics.DummyClass60;
import com.jagex.runescape.statics.DummyClass61;
import com.jagex.runescape.statics.DummyClass7;
import com.jagex.runescape.statics.DummyClass8;
import com.jagex.runescape.statics.DummyClass9;
import com.jagex.runescape.statics.GlobalStatics_0;
import com.jagex.runescape.statics.GlobalStatics_1;
import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_11;
import com.jagex.runescape.statics.GlobalStatics_2;
import com.jagex.runescape.statics.GlobalStatics_3;
import com.jagex.runescape.statics.GlobalStatics_4;
import com.jagex.runescape.statics.GlobalStatics_5;
import com.jagex.runescape.statics.GlobalStatics_6;
import com.jagex.runescape.statics.GlobalStatics_7;
import com.jagex.runescape.statics.GlobalStatics_8;
import com.jagex.runescape.statics.GlobalStatics_9;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.GregorianCalendar;

public final class GameClient extends GameStub {

  private void setUpdateError(int var2) {
    ++DummyClass43.ondemandRequester.anInt1011;
    DummyClass1.socketRequest = null;
    DummyClass43.ondemandRequester.anInt1010 = var2;
    GlobalStatics_2.updateSocket = null;
    DummyClass18.anInt80 = 0;
  }

  private void updateGame(byte var1) {
    for (
        GlobalStatics_9.anInt2537 = 0; GlobalStatics_7.hasKeyInput()
        && GlobalStatics_9.anInt2537 < 128;
        ++GlobalStatics_9.anInt2537) {
      GlobalStatics_9.anIntArray1755[GlobalStatics_9.anInt2537] = GlobalStatics_9.CURRENT_KEY;
      GlobalStatics_7.anIntArray1638[GlobalStatics_9.anInt2537] = GlobalStatics_9.OTHER_CURRENT_KEY;
    }

    ++GlobalStatics_7.loopCycle;
    if (GlobalStatics_9.anInt3655 != -1) {
      GlobalStatics_9.method967(0, 0, 2, 0, DummyClass30.viewWidth,
          GlobalStatics_9.anInt3655,
          0, GlobalStatics_9.viewHeight);
    }

    ++GlobalStatics_10.anInt3213;
    if (GlRenderer.USE_OPENGL) {
      int var2 = 19137023;

      label191:
      for (int var3 = 0; var3 < 32768; ++var3) {
        NPC var4 = GlobalStatics_8.NPCS[var3];
        if (var4 != null) {
          byte var5 = var4.config.aByte1267;
          if ((var5 & 2) > 0 && var4.anInt2816 == 0
              && Math.random() * 1000.0D < 10.0D) {
            int var6 = (int) Math.round(-1.0 + 2.0D * Math.random());
            int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
            if (var6 != 0 || var7 != 0) {
              var4.aByteArray2795[0] = 1;
              var4.waypointsX[0] = var6 + (var4.sceneX >> 7);
              var4.waypointsY[0] = var7 + (var4.sceneY >> 7);
              GlobalStatics_0.collisionMaps[GlobalStatics_9.currentPlane]
                  .method1502(var1 + 20850,
                      var4.sceneX >> 7, var4.getSize(), false, 0,
                      var4.getSize(),
                      var4.sceneY >> 7);
              if (var4.waypointsX[0] >= 0 && var4.waypointsX[0] <= 104 - var4
                  .getSize()
                  && var4.waypointsY[0] >= 0
                  && var4.waypointsY[0] <= 104 - var4.getSize()
                  && GlobalStatics_0.collisionMaps[GlobalStatics_9.currentPlane]
                  .method1500(-2,
                      var4.sceneY >> 7, var4.waypointsY[0],
                      var4.waypointsX[0],
                      var4.sceneX >> 7)) {
                if (var4.getSize() > 1) {
                  for (int var8 = var4.waypointsX[0];
                      var4.waypointsX[0] + var4.getSize() > var8;
                      ++var8) {
                    for (int var9 = var4.waypointsY[0];
                        var4.waypointsY[0] + var4.getSize() > var9; ++var9) {
                      if ((var2
                          & GlobalStatics_0.collisionMaps[GlobalStatics_9.currentPlane].anIntArrayArray1304[var8][var9])
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

          GlobalStatics_7.method1180((byte) -122, var4);
          DummyClass1.method904(65536, var4);
          GlobalStatics_9.method900(var4, var1 ^ -11974);
          GlobalStatics_0.collisionMaps[GlobalStatics_9.currentPlane]
              .method1489(
                  var4.sceneX >> 7, false, (byte) 85, var4.sceneY >> 7,
                  var4.getSize(), var4.getSize());
        }
      }
    }

    if (var1 != 1) {
      GlobalStatics_1.aClass94_2196 = null;
    }

    if (!GlRenderer.USE_OPENGL) {
      GlobalStatics_0.method744(true);
    } else if (GlobalStatics_10.LOGIN_STATE == 0
        && GlobalStatics_0.anInt23 == 0) {
      if (GlobalStatics_9.anInt1753 == 2) {
        GlobalStatics_7.method379(var1 ^ 1025);
      } else {
        GlobalStatics_10.d(0xffff);
      }

      if (CameraStatics.CURRENT_X >> 7 < 14
          || CameraStatics.CURRENT_X >> 7 >= 90
          || CameraStatics.CURRENT_Z
          >> 7 < 14 || CameraStatics.CURRENT_Z
          >> 7 >= 90) {
        GlobalStatics_10.method195(var1 ^ 20478);
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

                if (GlobalStatics_2.aClass64_351 != null
                    && GlobalStatics_2.aClass64_351.status == 1) {
                  if (GlobalStatics_2.aClass64_351.result != null) {
                    DummyClass54
                        .method1596(GlobalStatics_8.aClass94_3295, (byte) 126,
                            GlobalStatics_0.aBoolean2154);
                  }

                  GlobalStatics_0.aBoolean2154 = false;
                  GlobalStatics_8.aClass94_3295 = null;
                  GlobalStatics_2.aClass64_351 = null;
                }

                if (GlobalStatics_4.updateCycle % 1500 == 0) {
                  GlobalStatics_9.method1293(true);
                }

                return;
              }

              var12 = var11.aClass11_2449;
              if (var12.anInt191 >= 0) {
                var13 = GlobalStatics_7
                    .getWidget((byte) 118, var12.anInt190);
                if (var13 == null || var13.aClass11Array262 == null
                    || var13.aClass11Array262.length <= var12.anInt191
                    || var12 != var13.aClass11Array262[var12.anInt191]) {
                  continue;
                }
              }

              GLStatics.executeScript(var11);
            }
          }

          var12 = var11.aClass11_2449;
          if (var12.anInt191 >= 0) {
            var13 = GlobalStatics_7.getWidget((byte) 112, var12.anInt190);
            if (var13 == null || var13.aClass11Array262 == null
                || var12.anInt191 >= var13.aClass11Array262.length
                || var12 != var13.aClass11Array262[var12.anInt191]) {
              continue;
            }
          }

          GLStatics.executeScript(var11);
        }
      }

      var12 = var11.aClass11_2449;
      if (var12.anInt191 >= 0) {
        var13 = GlobalStatics_7.getWidget((byte) 126, var12.anInt190);
        if (var13 == null || var13.aClass11Array262 == null
            || var13.aClass11Array262.length <= var12.anInt191
            || var12 != var13.aClass11Array262[var12.anInt191]) {
          continue;
        }
      }

      GLStatics.executeScript(var11);
    }
  }

  private void method48(boolean var1) {
    boolean var2 = DummyClass43.ondemandRequester.method1243((byte) -61);
    if (!var1) {
      GlobalStatics_8.aClass94_2198 = null;
    }

    if (!var2) {
      this.method49();
    }
  }

  private void method49() {
    if (DummyClass8.anInt4026 < DummyClass43.ondemandRequester.anInt1011) {
      GlobalStatics_10.anInt3068 =
          5 * 50 * (DummyClass43.ondemandRequester.anInt1011 - 1);
      if (DummyClass11.anInt2036 == GlobalStatics_9.anInt2894) {
        GlobalStatics_9.anInt2894 = GlobalStatics_9.anInt506;
      } else {
        GlobalStatics_9.anInt2894 = DummyClass11.anInt2036;
      }

      if (GlobalStatics_10.anInt3068 > 3000) {
        GlobalStatics_10.anInt3068 = 3000;
      }

      if (DummyClass43.ondemandRequester.anInt1011 >= 2
          && DummyClass43.ondemandRequester.anInt1010 == 6) {
        this.reportError("js5connect_outofdate");
        DummyClass15.state = 1000;
        return;
      }

      if (DummyClass43.ondemandRequester.anInt1011 >= 4
          && DummyClass43.ondemandRequester.anInt1010 == -1) {
        this.reportError("js5crc");
        DummyClass15.state = 1000;
        return;
      }

      if (DummyClass43.ondemandRequester.anInt1011 >= 4 && (
          DummyClass15.state == 0
              || DummyClass15.state == 5)) {
        if (DummyClass43.ondemandRequester.anInt1010 != 7
            && DummyClass43.ondemandRequester.anInt1010 != 9) {
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
    if (GlobalStatics_10.anInt3068 > 0) {
      --GlobalStatics_10.anInt3068;
    } else {
      try {
        if (DummyClass18.anInt80 == 0) {
          DummyClass1.socketRequest =
              DummyClass35.signLink
                  .method1441((byte) 8, DummyClass36.aString2611,
                      GlobalStatics_9.anInt2894);
          ++DummyClass18.anInt80;
        }

        if (DummyClass18.anInt80 == 1) {
          if (DummyClass1.socketRequest.status == 2) {
            this.setUpdateError(1000);
            return;
          }

          if (DummyClass1.socketRequest.status == 1) {
            ++DummyClass18.anInt80;
          }
        }

        if (DummyClass18.anInt80 == 2) {
          GlobalStatics_2.updateSocket =
              new SocketStream((Socket) DummyClass1.socketRequest.result,
                  DummyClass35.signLink);
          Buffer buffer = new Buffer(5);
          buffer.writeByte(15);
          buffer.writeInt(530);
          GlobalStatics_2.updateSocket.write(buffer.bytes, 0, 5);
          ++DummyClass18.anInt80;
          GlobalStatics_9.lastWrittenTime = TimeUtilities
              .getCurrentTimeMillis();
        }

        if (DummyClass18.anInt80 == 3) {
          if (DummyClass15.state != 0 && DummyClass15.state != 5
              && GlobalStatics_2.updateSocket.available() <= 0) {
            if (TimeUtilities.getCurrentTimeMillis()
                - GlobalStatics_9.lastWrittenTime > 30000L) {
              this.setUpdateError(1001);
              return;
            }
          } else {
            int status = GlobalStatics_2.updateSocket.read();
            if (status != 0) {
              this.setUpdateError(status);
              return;
            }

            ++DummyClass18.anInt80;
          }
        }

        if (DummyClass18.anInt80 == 4) {
          boolean offline =
              DummyClass15.state == 5 || DummyClass15.state == 10 ||
                  DummyClass15.state == 28;
          DummyClass43.ondemandRequester
              .setSocket(!offline, GlobalStatics_2.updateSocket);
          GlobalStatics_2.updateSocket = null;
          DummyClass1.socketRequest = null;
          DummyClass18.anInt80 = 0;
        }
      } catch (IOException var3) {
        this.setUpdateError(1002);
      }

    }
  }

  private void handleLoading() {
    if (!SettingsStatics.SAFE_MODE) {
      while (GlobalStatics_7.hasKeyInput()) {
        if (GlobalStatics_9.OTHER_CURRENT_KEY == 115
            || GlobalStatics_9.OTHER_CURRENT_KEY == 83) {
          SettingsStatics.SAFE_MODE = true;
        }
      }
    }

    int kkkk;
    if (GlobalStatics_9.loadingState == 0) {
      Runtime runtime = Runtime.getRuntime();
      int usedMemory = (int) ((runtime.totalMemory() - runtime.freeMemory())
          / 1024L);
      long var4 = TimeUtilities.getCurrentTimeMillis();
      if (GlobalStatics_8.aLong3296 == 0L) {
        GlobalStatics_8.aLong3296 = var4;
      }

      if (usedMemory > 16384 && -GlobalStatics_8.aLong3296 + var4 < 5000L) {
        if (-GlobalStatics_7.aLong1310 + var4 > 1000L) {
          System.gc();
          GlobalStatics_7.aLong1310 = var4;
        }

        GlobalStatics_6.loadingPercent = 5;
        GlobalStatics_3.loadingText = GameStringStatics.aClass94_4040;
      } else {
        GlobalStatics_3.loadingText = GlobalStatics_0.aClass94_2151;
        GlobalStatics_9.loadingState = 10;
        GlobalStatics_6.loadingPercent = 5;
      }
    } else {
      int var2;
      if (GlobalStatics_9.loadingState == 10) {
        DummyClass46.setSceneDimensions(4, 104, 104);

        for (var2 = 0; var2 < 4; ++var2) {
          GlobalStatics_0.collisionMaps[var2] = new CollisionMap(
              104, 104);
        }

        GlobalStatics_6.loadingPercent = 10;
        GlobalStatics_9.loadingState = 30;
        GlobalStatics_3.loadingText = GameStringStatics.aClass94_3629;
      } else if (GlobalStatics_9.loadingState == 30) {
        if (GlobalStatics_5.fileSystem == null) {
          GlobalStatics_5.fileSystem =
              new FileSystem(DummyClass43.ondemandRequester,
                  GlobalStatics_10.fileCacheRequester);
        }

        if (GlobalStatics_5.fileSystem.isUpdateTableReceived()) {
          GlobalStatics_9.animationFrames =
              GlobalStatics_10.createUnpacker(false, true, true, 0, true);
          GlobalStatics_9.animationBases = GlobalStatics_10
              .createUnpacker(false, true, true, 1, true);
          GlobalStatics_2.configs = GlobalStatics_10
              .createUnpacker(true, true, false, 2, true);
          GlobalStatics_8.widgets = GlobalStatics_10
              .createUnpacker(false, true, true, 3, true);
          GlobalStatics_5.soundEffects = GlobalStatics_10
              .createUnpacker(false, true, true, 4, true);
          GlobalStatics_10.maps = GlobalStatics_10
              .createUnpacker(true, true, true, 5, true);
          GlobalStatics_9.fileUnpacker6 = GlobalStatics_10
              .createUnpacker(true, false, true, 6, true);
          DummyClass13.models = GlobalStatics_10
              .createUnpacker(false, true, true, 7, true);
          GlobalStatics_10.sprites = GlobalStatics_10
              .createUnpacker(false, true, true, 8, true);
          GlobalStatics_10.textures = GlobalStatics_10
              .createUnpacker(false, true, true, 9, true);
          GlobalStatics_10.fileUnpacker10 =
              GlobalStatics_10.createUnpacker(false, true, true, 10, true);
          GlobalStatics_2.fileUnpacker11 = GlobalStatics_10
              .createUnpacker(false, true, true, 11, true);
          GlobalStatics_10.scripts = GlobalStatics_10
              .createUnpacker(false, true, true, 12, true);
          GlobalStatics_8.fileUnpacker13 = GlobalStatics_10
              .createUnpacker(false, true, true, 13, true);
          GlobalStatics_6.midiInstruments = GlobalStatics_10
              .createUnpacker(false, false, true, 14, true);
          GlobalStatics_9.fileUnpacker15 = GlobalStatics_10
              .createUnpacker(false, true, true, 15, true);
          GlobalStatics_8.fileUnpacker16 = GlobalStatics_10
              .createUnpacker(false, true, true, 16, true);
          GlobalStatics_9.fileUnpacker17 = GlobalStatics_10
              .createUnpacker(false, true, true, 17, true);
          DummyClass55.fileUnpacker18 = GlobalStatics_10
              .createUnpacker(false, true, true, 18, true);
          GlobalStatics_8.fileUnpacker19 = GlobalStatics_10
              .createUnpacker(false, true, true, 19, true);
          GlobalStatics_10.animationSequences =
              GlobalStatics_10.createUnpacker(false, true, true, 20, true);
          GlobalStatics_9.fileUnpacker21 = GlobalStatics_10
              .createUnpacker(false, true, true, 21, true);
          GlobalStatics_6.fileUnpacker22 =
              GlobalStatics_10.createUnpacker(false, true, true, 22, true);
          GlobalStatics_9.worldMapData = GlobalStatics_10
              .createUnpacker(true, true, true, 23, true);
          GlobalStatics_9.fileUnpacker24 = GlobalStatics_10
              .createUnpacker(false, true, true, 24, true);
          GlobalStatics_9.fileUnpacker25 =
              GlobalStatics_10.createUnpacker(false, true, true, 25, true);
          GlobalStatics_10.materials =
              GlobalStatics_10.createUnpacker(true, true, true, 26, true);
          DummyClass22.particles = GlobalStatics_10
              .createUnpacker(false, true, true, 27, true);
          GlobalStatics_6.loadingPercent = 15;
          GlobalStatics_3.loadingText = GlobalStatics_7.CONNECTED_TO_UPDATE_SERVER;
          GlobalStatics_9.loadingState = 40;
        } else {
          GlobalStatics_3.loadingText = GameStringStatics.CONNECTING_TO_UPDATE_SERVER;
          GlobalStatics_6.loadingPercent = 12;
        }
      } else if (GlobalStatics_9.loadingState != 40) {
        if (GlobalStatics_9.loadingState == 45) {
          GlobalStatics_8
              .method1959(256, 2, 22050, SettingsStatics.aBoolean3184);
          GlobalStatics_0.aClass3_Sub24_Sub4_1193 = new AudioStreamEncoder4();
          GlobalStatics_0.aClass3_Sub24_Sub4_1193
              .method479((byte) 98, 9, 128);
          GlobalStatics_9.audioOutputStream0 =
              DummyClass43
                  .createAudioOutputStream(22050, DummyClass35.signLink,
                      GlobalStatics_8.GAME_CANVAS, 0, 14);
          GlobalStatics_9.audioOutputStream0
              .method2154(-116,
                  GlobalStatics_0.aClass3_Sub24_Sub4_1193);
          GlobalStatics_9
              .method897(17770,
                  GlobalStatics_0.aClass3_Sub24_Sub4_1193,
                  GlobalStatics_9.fileUnpacker15,
                  GlobalStatics_6.midiInstruments,
                  GlobalStatics_5.soundEffects);
          GlobalStatics_9.audioOutputStream1 =
              DummyClass43
                  .createAudioOutputStream(2048, DummyClass35.signLink,
                      GlobalStatics_8.GAME_CANVAS, 1, 14);
          GlobalStatics_9.aClass3_Sub24_Sub2_2563 = new AudioStreamEncoder2();
          GlobalStatics_9.audioOutputStream1.method2154(-128,
              GlobalStatics_9.aClass3_Sub24_Sub2_2563);
          DummyClass32.aClass157_524 = new SomethingAudio(22050,
              DummyClass60.sampleRate);
          GlobalStatics_9.openingMusicFileId =
              GlobalStatics_9.fileUnpacker6
                  .getFileId(DummyClass3.openingMusic);
          GlobalStatics_6.loadingPercent = 30;
          GlobalStatics_9.loadingState = 50;
          GlobalStatics_3.loadingText = GameStringStatics.aClass94_1731;
        } else if (GlobalStatics_9.loadingState != 50) {
          if (GlobalStatics_9.loadingState == 60) {
            var2 = GlobalStatics_9.method599(-20916, GlobalStatics_10.sprites);
            kkkk = GlobalStatics_7.method1185(6098);
            if (kkkk <= var2) {
              GlobalStatics_3.loadingText = GameStringStatics.aClass94_3575;
              GlobalStatics_9.loadingState = 65;
              GlobalStatics_6.loadingPercent = 40;
            } else {
              GlobalStatics_3.loadingText = GlobalStatics_9
                  .concat(new GameString[]{
                      GameStringStatics.aClass94_461,
                      GlobalStatics_9.toString(100 * var2 / kkkk),
                      GameStringStatics.aClass94_468
                  });
              GlobalStatics_6.loadingPercent = 40;
            }
          } else {
            if (GlobalStatics_9.loadingState == 65) {
              GlobalStatics_9.method581(GlobalStatics_8.fileUnpacker13, 0,
                  GlobalStatics_10.sprites);
              GlobalStatics_6.loadingPercent = 45;
              GlobalStatics_3.loadingText = DummyClass30.aClass94_459;
              DummyClass26.setState(5, 5);
              GlobalStatics_9.loadingState = 70;
            } else {
              if (GlobalStatics_9.loadingState == 70) {
                GlobalStatics_2.configs.method2113((byte) 34);
                byte var7 = 0;
                var2 = var7 + GlobalStatics_2.configs.method2136();
                GlobalStatics_8.fileUnpacker16.method2113((byte) 120);
                var2 += GlobalStatics_8.fileUnpacker16.method2136();
                GlobalStatics_9.fileUnpacker17.method2113((byte) 70);
                var2 += GlobalStatics_9.fileUnpacker17.method2136();
                DummyClass55.fileUnpacker18.method2113((byte) 32);
                var2 += DummyClass55.fileUnpacker18.method2136();
                GlobalStatics_8.fileUnpacker19.method2113((byte) 48);
                var2 += GlobalStatics_8.fileUnpacker19.method2136();
                GlobalStatics_10.animationSequences.method2113((byte) 43);
                var2 += GlobalStatics_10.animationSequences
                    .method2136();
                GlobalStatics_9.fileUnpacker21.method2113((byte) 23);
                var2 += GlobalStatics_9.fileUnpacker21
                    .method2136();
                GlobalStatics_6.fileUnpacker22.method2113((byte) 94);
                var2 += GlobalStatics_6.fileUnpacker22
                    .method2136();
                GlobalStatics_9.fileUnpacker24.method2113((byte) 91);
                var2 += GlobalStatics_9.fileUnpacker24.method2136();
                GlobalStatics_9.fileUnpacker25.method2113((byte) 102);
                var2 += GlobalStatics_9.fileUnpacker25
                    .method2136();
                DummyClass22.particles.method2113((byte) 126);
                var2 += DummyClass22.particles.method2136();
                if (var2 >= 1100) {
                  DummyClass22.method1799((byte) 96, GlobalStatics_2.configs);
                  GlobalStatics_6
                      .setFloorFileUnpacker(false, GlobalStatics_2.configs);
                  GlobalStatics_6.method575(GlobalStatics_2.configs, -1);
                  GlobalStatics_7.method375(3, DummyClass13.models,
                      GlobalStatics_2.configs);
                  DummyClass58.method1661(2, GlobalStatics_8.fileUnpacker16,
                      DummyClass13.models,
                      true);
                  GlobalStatics_11.method1103(DummyClass13.models,
                      DummyClass55.fileUnpacker18, false);
                  GlobalStatics_9.method1864(true, (byte) -126,
                      GlobalStatics_8.fileUnpacker19,
                      GlobalStatics_9.aClass3_Sub28_Sub17_Sub1_2000,
                      DummyClass13.models);
                  GlobalStatics_9.method969(GlobalStatics_2.configs, 59);
                  GlobalStatics_10.setAnimationFileUnpackers(
                      GlobalStatics_9.animationBases,
                      GlobalStatics_10.animationSequences,
                      GlobalStatics_9.animationFrames);
                  GlobalStatics_7
                      .method1053((byte) -117, GlobalStatics_2.configs);
                  GlobalStatics_5.method2180(DummyClass13.models,
                      GlobalStatics_9.fileUnpacker21, 11504);
                  DummyClass56
                      .method1648(GlobalStatics_6.fileUnpacker22,
                          255);
                  GlobalStatics_0
                      .method731(GlobalStatics_2.configs, (byte) -113);
                  GlobalStatics_0
                      .method89(true, GlobalStatics_8.fileUnpacker13,
                          GlobalStatics_10.sprites,
                          GlobalStatics_8.widgets, DummyClass13.models);
                  GlobalStatics_10.method250(2048, GlobalStatics_2.configs);
                  DummyClass39.method1086(GlobalStatics_9.fileUnpacker17, -6);
                  GlobalStatics_9
                      .method205(GlobalStatics_9.fileUnpacker25, 115,
                          GlobalStatics_9.fileUnpacker24,
                          new EnumStringFetcher());
                  DummyClass45.setQuickchatFileUnpackers(
                      GlobalStatics_9.fileUnpacker25,
                      GlobalStatics_9.fileUnpacker24, -117);
                  DummyClass43.method1197(GlobalStatics_2.configs, (byte) 69);
                  GlobalStatics_6
                      .method2065((byte) -125, GlobalStatics_2.configs,
                          GlobalStatics_10.sprites);
                  DummyClass56
                      .method1645(GlobalStatics_2.configs,
                          GlobalStatics_10.sprites,
                          (byte) -67);
                  GlobalStatics_6.loadingPercent = 50;
                  GlobalStatics_3.loadingText = GameStringStatics.aClass94_3142;
                  GlobalStatics_9.method968(128);
                  GlobalStatics_9.loadingState = 80;
                } else {
                  GlobalStatics_3.loadingText = GlobalStatics_9
                      .concat(new GameString[]{
                          GameStringStatics.aClass94_3546,
                          GlobalStatics_9.toString(var2 / 11),
                          GameStringStatics.aClass94_468
                      });
                  GlobalStatics_6.loadingPercent = 50;
                }
              } else {
                if (GlobalStatics_9.loadingState == 80) {
                  var2 = GlobalStatics_9
                      .method107(GlobalStatics_10.sprites, (byte) -125);
                  kkkk = GlobalStatics_10.method208(-119);
                  if (kkkk > var2) {
                    GlobalStatics_3.loadingText = GlobalStatics_9
                        .concat(new GameString[]{
                            GameStringStatics.aClass94_3445,
                            GlobalStatics_9.toString(var2 * 100 / kkkk),
                            GameStringStatics.aClass94_468
                        });
                    GlobalStatics_6.loadingPercent = 60;
                  } else {
                    DummyClass28.method887(21, GlobalStatics_10.sprites);
                    GlobalStatics_9.loadingState = 90;
                    GlobalStatics_6.loadingPercent = 60;
                    GlobalStatics_3.loadingText = GlobalStatics_0.aClass94_1707;
                  }
                } else if (GlobalStatics_9.loadingState != 90) {
                  if (GlobalStatics_9.loadingState == 100) {
                    if (GlobalStatics_10
                        .isRunesSpritesLoaded(GlobalStatics_10.sprites)) {
                      GlobalStatics_9.loadingState = 110;
                    }
                  } else if (GlobalStatics_9.loadingState != 110) {
                    if (GlobalStatics_9.loadingState != 120) {
                      if (GlobalStatics_9.loadingState == 130) {
                        if (GlobalStatics_8.widgets.method2113((byte) 20)) {
                          if (GlobalStatics_10.scripts.method2113((byte) 46)) {
                            if (GlobalStatics_8.fileUnpacker13
                                .method2113((byte) 89)) {
                              if (GlobalStatics_9.worldMapData
                                  .method2127((byte) -83,
                                      DummyClass53.aClass94_1342)) {
                                GlobalStatics_9.method1353(
                                    GlobalStatics_9.aClass3_Sub28_Sub16_Sub2Array2140,
                                    -11931,
                                    GlobalStatics_9.worldMapData);
                                GlobalStatics_6.loadingPercent = 95;
                                GlobalStatics_3.loadingText = GlobalStatics_0.LOADED_INTERFACES;
                                GlobalStatics_9.loadingState = 135;
                              } else {
                                GlobalStatics_3.loadingText =
                                    GlobalStatics_9.concat(new GameString[]{
                                        GlobalStatics_7.aClass94_2961,
                                        GlobalStatics_9.toString(90 +
                                            GlobalStatics_9.worldMapData
                                                .method2116(22813,
                                                    DummyClass53.aClass94_1342)
                                                / 10),
                                        GameStringStatics.aClass94_468
                                    });
                                GlobalStatics_6.loadingPercent = 85;
                              }
                            } else {
                              GlobalStatics_3.loadingText =
                                  GlobalStatics_9.concat(new GameString[]{
                                      GlobalStatics_7.aClass94_2961,
                                      GlobalStatics_9.toString(
                                          85 + GlobalStatics_8.fileUnpacker13
                                              .method2136()
                                              / 20),
                                      GameStringStatics.aClass94_468
                                  });
                              GlobalStatics_6.loadingPercent = 85;
                            }
                          } else {
                            GlobalStatics_3.loadingText = GlobalStatics_9
                                .concat(new GameString[]{
                                    GlobalStatics_7.aClass94_2961,
                                    GlobalStatics_9.toString(
                                        75 + GlobalStatics_10.scripts
                                            .method2136() / 10),
                                    GameStringStatics.aClass94_468
                                });
                            GlobalStatics_6.loadingPercent = 85;
                          }
                        } else {
                          GlobalStatics_3.loadingText = GlobalStatics_9
                              .concat(new GameString[]{
                                  GlobalStatics_7.aClass94_2961,
                                  GlobalStatics_9.toString(
                                      GlobalStatics_8.widgets
                                          .method2136() * 3 / 4),
                                  GameStringStatics.aClass94_468
                              });
                          GlobalStatics_6.loadingPercent = 85;
                        }
                      } else if (GlobalStatics_9.loadingState == 135) {
                        var2 = GlobalStatics_6.method1735(29984);
                        if (var2 == -1) {
                          GlobalStatics_6.loadingPercent = 95;
                          GlobalStatics_3.loadingText = DummyClass24.aClass94_1653;
                        } else if (var2 != 7 && var2 != 9) {
                          if (GlobalStatics_6.aBoolean579) {
                            GlobalStatics_3.loadingText = GameStringStatics.aClass94_374;
                            GlobalStatics_9.loadingState = 140;
                            GlobalStatics_6.loadingPercent = 96;
                          } else {
                            this.reportError("worldlistio_" + var2);
                            DummyClass26.setState(1000, 5);
                          }
                        } else {
                          this.reportError("worldlistfull");
                          DummyClass26.setState(1000, 5);
                        }
                      } else if (GlobalStatics_9.loadingState != 140) {
                        if (GlobalStatics_9.loadingState == 150) {
                          SomethingGl.method1454();
                          if (SettingsStatics.SAFE_MODE) {
                            System.out.println("Settling up safe mode config");
                            SettingsStatics.RENDERING_SAMPLES = 0;
                            SettingsStatics.GL_RENDERING_SAMPLES = 0;
                            SettingsStatics.anInt2577 = 0;
                            SettingsStatics.anInt2488 = 0;
                          }

                          SettingsStatics.SAFE_MODE = true;
                          SettingsStatics.writeSettings(DummyClass35.signLink);
                          GlobalStatics_9
                              .setWindowMode(false, SettingsStatics.anInt2577,
                                  -1, -1);
                          GlobalStatics_6.loadingPercent = 100;
                          GlobalStatics_9.loadingState = 160;
                          GlobalStatics_3.loadingText = GlobalStatics_2.aClass94_2576;
                        } else if (GlobalStatics_9.loadingState == 160) {
                          GlobalStatics_9.method219(true, 3000);
                        }
                      } else {
                        GlobalStatics_6.anInt2529 =
                            GlobalStatics_8.widgets
                                .getFileId(GameStringStatics.aClass94_3992);
                        GlobalStatics_10.maps.method2115(-9, false, true);
                        GlobalStatics_9.fileUnpacker6
                            .method2115(111, true, true);
                        GlobalStatics_10.sprites.method2115(-76, true, true);
                        GlobalStatics_8.fileUnpacker13
                            .method2115(91, true, true);
                        GlobalStatics_10.fileUnpacker10
                            .method2115(-116, true, true);
                        GlobalStatics_8.widgets.method2115(99, true, true);
                        GlobalStatics_6.loadingPercent = 97;
                        GlobalStatics_3.loadingText = GameStringStatics.aClass94_2267;
                        GlobalStatics_9.loadingState = 150;
                        DummyClass43.aBoolean913 = true;
                      }
                    } else if (GlobalStatics_10.fileUnpacker10.method2125(
                        GameStringStatics.EMPTY_STRING, (byte) 116,
                        Texture.aClass94_3792)) {
                      HuffmanEncoder var9 = new HuffmanEncoder(
                          GlobalStatics_10.fileUnpacker10
                              .method2123(0, GameStringStatics.EMPTY_STRING,
                                  Texture.aClass94_3792));
                      DummyClass3.method69(var9, 104);
                      GlobalStatics_3.loadingText = DummyClass26.aClass94_1615;
                      GlobalStatics_9.loadingState = 130;
                      GlobalStatics_6.loadingPercent = 80;
                    } else {
                      GlobalStatics_3.loadingText = GlobalStatics_9
                          .concat(new GameString[]{
                              GlobalStatics_0.aClass94_1183,
                              GlobalStatics_2.aClass94_37
                          });
                      GlobalStatics_6.loadingPercent = 80;
                    }
                  } else {
                    GlobalStatics_7.aClass67_1443 = new MouseRecorder();
                    DummyClass35.signLink
                        .createThread(0, 10, GlobalStatics_7.aClass67_1443);
                    GlobalStatics_3.loadingText = GlobalStatics_8.aClass94_1409;
                    GlobalStatics_6.loadingPercent = 75;
                    GlobalStatics_9.loadingState = 120;
                  }
                } else if (!GlobalStatics_10.materials
                    .method2113((byte) 58)) {
                  GlobalStatics_3.loadingText = GlobalStatics_9
                      .concat(new GameString[]{
                          GameStringStatics.aClass94_1892,
                          GlobalStatics_9.toString(
                              GlobalStatics_10.materials
                                  .method2136()),
                          GameStringStatics.aClass94_468
                      });
                  GlobalStatics_6.loadingPercent = 70;
                } else {
                  TextureCache var8 =
                      new TextureCache(GlobalStatics_10.textures,
                          GlobalStatics_10.materials,
                          GlobalStatics_10.sprites, 20,
                          !SettingsStatics.aBoolean488);
                  DummyClass40.setTextureCache(var8);
                  if (SettingsStatics.BRIGHTNESS == 1) {
                    DummyClass40.updateLightness(0.9F);
                  }

                  if (SettingsStatics.BRIGHTNESS == 2) {
                    DummyClass40.updateLightness(0.8F);
                  }

                  if (SettingsStatics.BRIGHTNESS == 3) {
                    DummyClass40.updateLightness(0.7F);
                  }

                  if (SettingsStatics.BRIGHTNESS == 4) {
                    DummyClass40.updateLightness(0.6F);
                  }

                  GlobalStatics_3.loadingText = GameStringStatics.aClass94_3167;
                  GlobalStatics_9.loadingState = 100;
                  GlobalStatics_6.loadingPercent = 70;
                }
              }
            }
          }
        } else {
          var2 =
              GlobalStatics_10
                  .method228(GlobalStatics_10.sprites,
                      GlobalStatics_8.fileUnpacker13,
                      false);
          kkkk = GlobalStatics_8.method2286((byte) -5);
          if (var2 >= kkkk) {
            GlobalStatics_3.loadingText = DummyClass15.aClass94_1879;
            GlobalStatics_6.loadingPercent = 35;
            GlobalStatics_9.loadingState = 60;
          } else {
            GlobalStatics_3.loadingText = GlobalStatics_9
                .concat(new GameString[]{
                    GameStringStatics.aClass94_3643,
                    GlobalStatics_9.toString(100 * var2 / kkkk),
                    GameStringStatics.aClass94_468
                });
            GlobalStatics_6.loadingPercent = 35;
          }
        }
      } else {
        var2 = 0;

        for (kkkk = 0; kkkk < 28; ++kkkk) {
          var2 +=
              GlobalStatics_0.aClass151_Sub1Array2601[kkkk]
                  .method2111(-61)
                  * GlobalStatics_10.anIntArray3288[kkkk] / 100;
        }

        if (var2 == 100) {
          GlobalStatics_6.loadingPercent = 20;
          GlobalStatics_3.loadingText = GameStringStatics.aClass94_2624;
          DummyClass37.method1039(208, GlobalStatics_10.sprites);
          GlobalStatics_10.method1593(111, GlobalStatics_10.sprites);
          GlobalStatics_10.setRunesFileId(GlobalStatics_10.sprites);
          GlobalStatics_9.loadingState = 45;
        } else {
          if (var2 != 0) {
            GlobalStatics_3.loadingText = GlobalStatics_9
                .concat(new GameString[]{
                    GameStringStatics.aClass94_327,
                    GlobalStatics_9.toString(var2),
                    GameStringStatics.aClass94_468
                });
          }

          GlobalStatics_6.loadingPercent = 20;
        }
      }

    }
  }

  public void update() {
    if (DummyClass15.state != 1000) {
      ++GlobalStatics_4.updateCycle;
      if (GlobalStatics_4.updateCycle % 1000 == 1) {
        GregorianCalendar calendar = new GregorianCalendar();
        DummyClass36.anInt2618 =
            calendar.get(11) * 600 - (-(calendar.get(12) * 10)
                - calendar.get(13) / 6);
        GlobalStatics_10.random.setSeed(DummyClass36.anInt2618);
      }

      this.method48(true);
      if (GlobalStatics_5.fileSystem != null) {
        GlobalStatics_5.fileSystem.method838((byte) -70);
      }

      GlobalStatics_0.method728(false);
      DummyClass43.method1194();
      KeyboardStatics.method996();
      GlobalStatics_8.method1225();
      if (GlRenderer.USE_OPENGL) {
        DummyClass33.clearGlResources();
      }

      int var4;
      if (MouseWheelStatics.MOUSE_WHEEL != null) {
        var4 = MouseWheelStatics.MOUSE_WHEEL.pollOffset();
        GlobalStatics_9.mouseWheelOffset = var4;
      }

      if (DummyClass15.state == 0) {
        this.handleLoading();
        GlobalStatics_9.resetFrameRegulator();
      } else if (DummyClass15.state == 5) {
        this.handleLoading();
        GlobalStatics_9.resetFrameRegulator();
      } else if (
          DummyClass15.state == 25 || DummyClass15.state == 28) {
        DummyClass59.method1046();
      }

      if (DummyClass15.state == 10) {
        this.updateGame((byte) 1);
        GlobalStatics_10.method267((byte) 36);
        DummyClass9.method2216((byte) 81);
        DummyClass2.handleLogin();
      } else if (DummyClass15.state == 30) {
        GlobalStatics_10.method235(true);
      } else if (DummyClass15.state == 40) {
        DummyClass2.handleLogin();
        if (~GlobalStatics_5.loginResponse != 2) {
          if (GlobalStatics_5.loginResponse == 15) {
            DummyClass60.method912(false);
          } else if (GlobalStatics_5.loginResponse != 2) {
            DummyClass10.destroyGame((byte) 46);
          }
        }
      }

    }
  }

  public void destroy(byte var1) {
    if (GlRenderer.USE_OPENGL) {
      GlRenderer.releaseGlResources();
    }

    if (GlobalStatics_10.fullScreenFrame != null) {
      GlobalStatics_7.method593(GlobalStatics_10.fullScreenFrame, true,
          DummyClass35.signLink);
      GlobalStatics_10.fullScreenFrame = null;
    }

    if (DummyClass35.signLink != null) {
      DummyClass35.signLink.method1442(this.getClass(), 0);
    }

    if (GlobalStatics_7.aClass67_1443 != null) {
      GlobalStatics_7.aClass67_1443.aBoolean1015 = false;
    }

    GlobalStatics_7.aClass67_1443 = null;
    if (GlobalStatics_9.GAME_SOCKET != null) {
      GlobalStatics_9.GAME_SOCKET.destroy();
      GlobalStatics_9.GAME_SOCKET = null;
    }

    DummyClass9.unbindKeyboard(GlobalStatics_8.GAME_CANVAS, -9320);
    MouseStatics.unbind(GlobalStatics_8.GAME_CANVAS);
    if (MouseWheelStatics.MOUSE_WHEEL != null) {
      MouseWheelStatics.MOUSE_WHEEL.unbind(GlobalStatics_8.GAME_CANVAS);
    }

    GlobalStatics_9.method167(0);
    MouseStatics.clearMouse();
    MouseWheelStatics.MOUSE_WHEEL = null;
    if (GlobalStatics_9.audioOutputStream0 != null) {
      GlobalStatics_9.audioOutputStream0.method2163(false);
    }

    if (GlobalStatics_9.audioOutputStream1 != null) {
      GlobalStatics_9.audioOutputStream1.method2163(false);
    }

    DummyClass43.ondemandRequester.shutdown(false);
    GlobalStatics_10.fileCacheRequester.shutdown(3208);

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

      if (GlobalStatics_9.tableIndexFile != null) {
        GlobalStatics_9.tableIndexFile.close(false);
      }

      if (GlobalStatics_9.uidFile != null) {
        GlobalStatics_9.uidFile.close(false);
      }
    } catch (IOException var3) {
    }
  }

  public void clearThings(int var1) {
    GlobalStatics_8.clear0(true);
    GlobalStatics_0.clear1(-8635);
    DummyClass35.clear2();
    GlobalStatics_9.clear3((byte) -46);
    GlobalStatics_10.clear4(0);
    GlobalStatics_8.clear5(113);
    GlRenderer.clear6();
    GlobalStatics_4.clear7(24241);
    GlobalStatics_5.clear8(false);
    GlobalStatics_9.clear9(25951);
    GlobalStatics_9.clear10((byte) 106);
    GlobalStatics_0.clear11(0);
    GlobalStatics_4.clear12(0);
    GlobalStatics_9.clear13((byte) -88);
    GlobalStatics_7.clear14(-16222);
    GlobalStatics_10.clear15(-114);
    GlobalStatics_7.clear16(false);
    GlobalStatics_8.clear17(100);
    GlobalStatics_6.clear18(true);
    GlobalStatics_7.clear19(true);
    GlobalStatics_9.clear20(3101);
    GlobalStatics_9.clear21(-3);
    GlobalStatics_8.clear22(1);
    GlobalStatics_7.clear23((byte) -124);
    GlobalStatics_10.clear24(126);
    GlobalStatics_7.clear25((byte) 121);
    GlobalStatics_9.clear26((byte) 121);
    GlobalStatics_0.clear27();
    GlobalStatics_2.clear28((byte) 108);
    GlobalStatics_0.clear29(103);
    GlobalStatics_5.clear30(0);
    GlobalStatics_6.clear31(103);
    GlobalStatics_9.clear32();
    GlobalStatics_6.clear33((byte) 85);
    GlobalStatics_5.clear34(0);
    GlobalStatics_9.clear35((byte) -110);
    GlobalStatics_9.clear36(8160);
    GlobalStatics_3.clear37((byte) -108);
    GlobalStatics_9.clear38((byte) -116);
    GlobalStatics_2.clear39(3353893);
    GlobalStatics_8.clear40(-11);
    GlobalStatics_9.clear41(2);
    GlobalStatics_9.clear42((byte) 103);
    GlobalStatics_9.clear43(26971);
    GlobalStatics_10.clear44((byte) 120);
    GlobalStatics_0.clear45((byte) 30);
    GlobalStatics_9.clear46((byte) 106);
    GlobalStatics_9.clear47(119);
    DummyClass53.clear48(3);
    GlobalStatics_6.clear49(-29679);
    GlobalStatics_10.clear50((byte) 59);
    DummyClass39.clear51(-1);
    DummyClass22.clear52((byte) 104);
    DummyClass28.clear53((byte) 35);
    DummyClass25.clear55(-14256);
    DummyClass2.clear56(-79);
    DummyClass1.clear57(-24912);
    GlobalStatics_10.clear58((byte) -55);
    GlobalStatics_8.clear59(false);
    DummyClass29.clear60(5157);
    DummyClass10.clear61((byte) 126);
    GlobalStatics_7.clear62((byte) 38);
    GlobalStatics_9.clear63();
    DummyClass54.clear64(-126);
    DummyClass51.clear65((byte) 24);
    GlEnvironment.clear();
    DummyClass59.clear66(true);
    GlobalStatics_10.clear67();
    GlobalStatics_9.clear68((byte) -45);
    GlModel.clear69();
    GlobalStatics_11.clear70(3327);
    GlobalStatics_1.lear71();
    GlobalStatics_9.clear72(118);
    GlobalStatics_9.clear73(true);
    DummyClass30.clear74(0);
    GlobalStatics_9.clear75(90);
    DummyClass33.clear76();
    GlobalStatics_2.clear77(100);
    GlobalStatics_0.clear78();
    DummyClass11.clear79(-17413);
    GlobalStatics_1.clear80(33);
    GlobalStatics_4.clear81();
    DummyClass52.clear82(-25247);
    GlobalStatics_6.clear83(186);
    GlobalStatics_9.clear84();
    GlobalStatics_6.clear85(-28918);
    GlobalStatics_9.clear86(true);
    DummyClass36.clear87(false);
    GlobalStatics_2.clear88();
    DummyClass46.clear89();
    GLStatics.clear90((byte) -2);
    GlobalStatics_5.clear91(1);
    GlobalStatics_8.clear92(0);
    GlobalStatics_4.clear93((byte) 120);
    DummyClass15.clear94(0);
    DummyClass47.clear95();
    DummyClass18.clear96(-90);
    GlobalStatics_9.clear97(99);
    GlobalStatics_9.clear98(0);
    GlobalStatics_2.clear99(-3);
    GlobalStatics_6.clear100((byte) 89);
    GlobalStatics_8.clear101(-2);
    DummyClass17.clear102(-17124);
    GlobalStatics_8.method1606((byte) -48);
    GlobalStatics_9.method943(-9893);
    GlobalStatics_9.method605(221301966);
    DummyClass26.method1721(true);
    DummyClass27.method1712(69);
    GlobalStatics_9.method896(true);
    GlobalStatics_9.method964(6);
    GlobalStatics_6.method1388(true);
    GlobalStatics_9.method973((byte) 62);
    GlobalStatics_9.method613(119);
    GlobalStatics_7.method624(-1);
    GlobalStatics_9.method547(-2951);
    GlobalStatics_7.method833((byte) 126);
    GlobalStatics_9.method528(-1667);
    GlobalStatics_9.method1192((byte) -86);
    GlobalStatics_7.method1181((byte) -118);
    GlobalStatics_9.method80(-27401);
    GlobalStatics_9.method1612(-11565);
    Texture.method721(20413);
    GlTexture2d.method711(1);
    DummyClass40.method1155();
    GlobalStatics_0.method1016((byte) 127);
    DummyClass3.method71((byte) -124);
    DummyClass55.method1608((byte) 110);
    DummyClass41.method1169(false);
    GlobalStatics_9.method1077(0);
    GlobalStatics_9.method960(31);
    SomethingGl.method1457();
    DummyClass20.method1818(false);
    GlobalStatics_9.method1178((byte) -93);
    GlobalStatics_9.method853(0);
    GlobalStatics_7.method376(false);
    GlobalStatics_9.method1860(0);
    GlobalStatics_0.method1429((byte) 53);
    GLStatics.method147();
    GlobalStatics_9.method954(128);
    GlobalStatics_9.method1703(10967);
    GlobalStatics_9.method1284((byte) -87);
    GlobalStatics_4.method906((byte) 112);
    GlobalStatics_9.method871((byte) 115);
    GlobalStatics_9.method1296(1);
    GlobalStatics_9.method1751((byte) -58);
    GlobalStatics_9.method1011();
    GlobalStatics_3.method380(-29113);
    DummyClass42.method1187(30351);
    DummyClass43.method1193(-26723);
    GlobalStatics_3.method1595();
    DummyClass24.method1743(false);
    DummyClass61.method726();
    GlobalStatics_6.method1733(-17148);
    SomethingShadows.method2045();
    GlobalStatics_0.clear();
    DummyClass49.method1365(119);
    DummyClass31.method1682(-82);
    GlobalStatics_10.method120(1000);
    GlobalStatics_10.f(3);
    GlobalStatics_9.method510(-128);
    GlobalStatics_6.method136(-3);
    DummyClass37.method1034(8642);
    GlobalStatics_6.method632(-30497);
    GlobalStatics_9.method1715();
    DummyClass12.method2202(-196);
    DummyClass50.method1402((byte) 73);
    GlUtils.method923();
    DummyClass38.method1081((byte) 81);
    GlobalStatics_9.method2019(true);
    GlobalStatics_9.method1954(0);
    DummyClass56.method1646(true);
    GlobalStatics_9.method2030((byte) 83);
    GlobalStatics_9.method113((byte) -120);
    GlobalStatics_8.method1958(2);
    DummyClass23.method1744(true);
    GlobalStatics_9.method1394((byte) -94);
    GlobalStatics_0.method735(-22749);
    DummyClass21.method1806();
    GlobalStatics_9.method382(1);
    GlobalStatics_9.method396(0);
    GlobalStatics_11.method59((byte) -87);
    DummyClass58.method1660(13123);
    GlobalStatics_9.method1771(14635);
    GlobalStatics_7.method2187(27316);
    GlobalStatics_7.method1731(12881);
    GlobalStatics_4.method1133((byte) 81);
    GlobalStatics_9.method1283((byte) 122);
    GlobalStatics_6.method2070((byte) 67);
    BZipDecompressorStatics.method1641();
    GlobalStatics_10.method849(2);
    GlobalStatics_2.method563(3);
    GlobalStatics_9.method570(-119);
    GlobalStatics_5.method1726(0);
    GlobalStatics_9.method118(2);
    GlobalStatics_9.method2255((byte) -128);
    GlobalStatics_3.method2166();
    GlobalStatics_8.method1623();
    DummyClass60.method911(26);
    DummyClass14.method2145((byte) -69);
    WaterShader.method1748();
    MaterialShader4.method1700();
    GLStatics.method1630((byte) -113);
    DummyClass45.method1238(-112);
    GlobalStatics_11.method361();
    GlobalStatics_9.method1204();
    GlobalStatics_10.method187(false);
    DummyClass13.method2197(true);
    GlobalStatics_3.method156(2);
    GlobalStatics_9.method2235(4);
    GlobalStatics_10.method1592();
    GlobalStatics_9.method1704(65536);
    GlobalStatics_9.method143(-46);
    GlobalStatics_9.method1409(false);
    GlobalStatics_4.method1071((byte) -115);
    GlobalStatics_9.method2245((byte) -74);
    GlobalStatics_9.method2240(128);
    DummyClass32.method962((byte) -67);
    GlobalStatics_6.method131(-109);
    DummyClass34.method994(0x93bd);
    DummyClass44.method1206((byte) 26);
    GlobalStatics_9.method274(-2);
    GlobalStatics_9.method217(1);
    GlobalStatics_9.method317(7759444);
    GlobalStatics_9.method309(true);
    GlobalStatics_9.method261(-125);
    GlobalStatics_8.method288((byte) 110);
    GlobalStatics_9.method172(11597);
    GlobalStatics_9.method296();
    GlobalStatics_9.method357(false);
    GlobalStatics_9.method206(true);
    GlobalStatics_9.method348(48);
    GlobalStatics_9.method266(-1443422260);
    GlobalStatics_9.method168(-1771542303);
    GlobalStatics_9.method315(-15028);
    GlobalStatics_10.method321(-21136);
    GlobalStatics_10.method245(0);
    GlobalStatics_10.method209((byte) 79);
    GlobalStatics_1.method241((byte) 74);
    GlobalStatics_10.method287(false);
    GlobalStatics_10.method277((byte) -41);
    GlobalStatics_10.method258(-97);
    GlobalStatics_10.method234(-3);
    GlobalStatics_10.method337(2);
    GlobalStatics_10.method249(-127);
    GlobalStatics_10.method227(true);
    GlobalStatics_10.method333((byte) -54);
    GlobalStatics_10.method197(1);
    GlobalStatics_10.method200((byte) 122);
    GlobalStatics_10.method290(-9);
    GlobalStatics_10.method325(0);
    GlobalStatics_10.method211(1024);
    GlobalStatics_10.method238(9423);
    GlobalStatics_10.method300(103);
    GlobalStatics_10.method177((byte) 119);
    GlobalStatics_10.method294();
    GlobalStatics_10.method341((byte) 85);
    GlobalStatics_10.method268((byte) -91);
    GlobalStatics_10.method351(-1);
    DummyClass7.method2218((byte) -83);
    DummyClass6.method2208(30358);
    DummyClass8.method2225((byte) -120);
    DummyClass4.method2227((byte) 37);
    DummyClass9.method2213((byte) 104);
    DummyClass5.method2212(false);
    GlobalStatics_9.method627((byte) -122);
    GlobalStatics_9.method717(109);
    GlobalStatics_9.method534(99);
    GlobalStatics_9.method405();
    GlobalStatics_2.method61(-93);
    GlobalStatics_11.method67(true);
    GlobalStatics_6.method573(-11346);
    GlobalStatics_10.method391();
    GlobalStatics_9.method511((byte) 121);
    GlobalStatics_3.method1334((byte) -115);
    GlobalStatics_9.method1343(false);
    GlobalStatics_9.method1348((byte) 100);
    GlobalStatics_9.method1350((byte) 75);
    GlobalStatics_9.method1345(-71);

    if (GlobalStatics_8.anInt12 != 0) {
      GlobalStatics_8.aBoolean2201 = true;
    }

  }

  public void init() {
    GlobalStatics_8.portOffset = Integer
        .parseInt(this.getParameter("worldid"));
    GlobalStatics_4.usageLocation = Integer
        .parseInt(this.getParameter("modewhere"));
    if (GlobalStatics_4.usageLocation < 0
        || GlobalStatics_4.usageLocation > 1) {
      GlobalStatics_4.usageLocation = 0;
    }

    GlobalStatics_10.usageMode = Integer
        .parseInt(this.getParameter("modewhat"));
    if (GlobalStatics_10.usageMode < 0
        || GlobalStatics_10.usageMode > 2) {
      GlobalStatics_10.usageMode = 0;
    }

    String var1 = this.getParameter("advertsuppressed");
    GlobalStatics_9.aBoolean3779 = "1".equals(var1);

    try {
      GlobalStatics_10.languageId = Integer.parseInt(
          this.getParameter("lang"));
    } catch (Exception var10) {
      GlobalStatics_10.languageId = 0;
    }

    GlobalStatics_0
        .setupLanguagePacket(GlobalStatics_10.languageId);
    String var2 = this.getParameter("objecttag");
    DummyClass8.aBoolean4018 = "1".equals(var2);

    String var3 = this.getParameter("js");
    GlobalStatics_9.aBoolean3641 = "1".equals(var3);

    String var4 = this.getParameter("game");
    if ("1".equals(var4)) {
      GlobalStatics_5.gameId = 1;
    } else {
      GlobalStatics_5.gameId = 0;
    }

    try {
      GlobalStatics_9.affiliateId = Integer.parseInt(
          this.getParameter("affid"));
    } catch (Exception var9) {
      GlobalStatics_9.affiliateId = 0;
    }

    DummyClass7.settings = GameStringStatics.aClass94_1745
        .getParameter((byte) 126);
    if (DummyClass7.settings == null) {
      DummyClass7.settings = GameStringStatics.EMPTY_STRING;
    }

    String var5 = this.getParameter("country");
    if (var5 != null) {
      try {
        GlobalStatics_9.anInt2607 = Integer.parseInt(var5);
      } catch (Exception var8) {
        GlobalStatics_9.anInt2607 = 0;
      }
    }

    String var6 = this.getParameter("haveie6");
    GlobalStatics_7.aBoolean1451 = "1".equals(var6);

    GlobalStatics_9.client = this;
    this.method41((byte) -56, 765, 32 + GlobalStatics_10.usageMode, 1530,
        503);
  }

  public void handleDraw(int var1) {
    if (DummyClass15.state != 1000) {
      boolean var2 = GlobalStatics_9.method1988(false);
      if (var2 && GlobalStatics_9.aBoolean1158
          && GlobalStatics_9.audioOutputStream0 != null) {
        GlobalStatics_9.audioOutputStream0.method2158((byte) -78);
      }
      if ((DummyClass15.state == 30 || DummyClass15.state == 10) && (
          GlobalStatics_6.REPLACE_CANVAS || DummyClass41.aLong866 != 0L
              && DummyClass41.aLong866 < TimeUtilities
              .getCurrentTimeMillis())) {
        GlobalStatics_9.setWindowMode(GlobalStatics_6.REPLACE_CANVAS,
            GlobalStatics_9.getWindowMode(),
            SettingsStatics.anInt2378,
            SettingsStatics.anInt3071);
      }

      int var4;
      int var5;
      if (GlobalStatics_10.fullScreenFrame == null) {
        Component container = null;
        if (GlobalStatics_10.fullScreenFrame != null) {
          container = GlobalStatics_10.fullScreenFrame;
        } else if (GlobalStatics_10.FRAME != null) {
          container = GlobalStatics_10.FRAME;
        }

        var4 = container.getSize().width;
        var5 = container.getSize().height;
        if (container == GlobalStatics_10.FRAME) {
          Insets insets = GlobalStatics_10.FRAME.getInsets();
          var4 -= insets.right + insets.left;
          var5 -= insets.top + insets.bottom;
        }

        if (var4 != GlobalStatics_6.windowWidth
            || var5 != GlobalStatics_9.windowHeight) {
          if (GlobalStatics_9.formattedOsName.startsWith("mac")) {
            GlobalStatics_6.windowWidth = var4;
            GlobalStatics_9.windowHeight = var5;
          } else {
            DummyClass25.resizeCanvas();
          }

          DummyClass41.aLong866 =
              TimeUtilities.getCurrentTimeMillis() + 500L;
        }
      }

      if (GlobalStatics_10.fullScreenFrame != null
          && !GlobalStatics_10.FOCUSED && (
          DummyClass15.state == 30 || DummyClass15.state == 10)) {
        GlobalStatics_9
            .setWindowMode(false, SettingsStatics.anInt2577, -1, -1);
      }

      if (var1 != 40) {
        GlobalStatics_8.method44(null);
      }

      boolean var10 = false;
      if (GlobalStatics_10.aBoolean3116) {
        var10 = true;
        GlobalStatics_10.aBoolean3116 = false;
      }

      if (var10) {
        GlobalStatics_9.method1396(var1 ^ -41);
      }

      if (GlRenderer.USE_OPENGL) {
        for (var4 = 0; var4 < 100; ++var4) {
          GlobalStatics_9.aBooleanArray3674[var4] = true;
        }
      }

      if (DummyClass15.state == 0) {
        GlobalStatics_9
            .drawLoadingBar(null, false, var10, GlobalStatics_3.loadingText,
                GlobalStatics_6.loadingPercent);
      } else if (DummyClass15.state == 5) {
        GlobalStatics_9
            .drawLoadingScreen(GlobalStatics_8.aClass3_Sub28_Sub17_2096, false);
      } else if (DummyClass15.state != 10) {
        if (DummyClass15.state != 25 && DummyClass15.state != 28) {
          if (DummyClass15.state == 30) {
            GlobalStatics_9.method1127(var1 - 40);
          } else if (DummyClass15.state == 40) {
            GlobalStatics_3
                .drawLoadingBox(GlobalStatics_9.concat(new GameString[]{
                    GameStringStatics.CONNECTION_LOST,
                    GlobalStatics_0.LINE_BREAK,
                    DummyClass14.ATTEMPTING_TO_RECONNECT
                }), false);
          }
        } else if (DummyClass8.anInt4019 != 1) {
          if (DummyClass8.anInt4019 == 2) {
            if (GlobalStatics_9.anInt2275
                < DummyClass11.anInt2038) {
              GlobalStatics_9.anInt2275 = DummyClass11.anInt2038;
            }

            var4 = (-DummyClass11.anInt2038
                + GlobalStatics_9.anInt2275) * 50
                / GlobalStatics_9.anInt2275 + 50;
            GlobalStatics_3
                .drawLoadingBox(GlobalStatics_9.concat(new GameString[]{
                    GameStringStatics.LOADING_PLEASE_WAIT,
                    GameStringStatics.aClass94_3399,
                    GlobalStatics_9.toString(var4),
                    GameStringStatics.aClass94_148
                }), false);
          } else {
            GlobalStatics_3
                .drawLoadingBox(GameStringStatics.LOADING_PLEASE_WAIT, false);
          }
        } else {
          if (GlobalStatics_0.anInt2579
              < GlobalStatics_8.anInt3293) {
            GlobalStatics_0.anInt2579 = GlobalStatics_8.anInt3293;
          }

          var4 = 50 * (GlobalStatics_0.anInt2579
              - GlobalStatics_8.anInt3293)
              / GlobalStatics_0.anInt2579;
          GlobalStatics_3
              .drawLoadingBox(GlobalStatics_9.concat(new GameString[]{
                  GameStringStatics.LOADING_PLEASE_WAIT,
                  GameStringStatics.aClass94_3399,
                  GlobalStatics_9.toString(var4),
                  GameStringStatics.aClass94_148
              }), false);
        }
      } else {
        GlobalStatics_3.method381(true);
      }
      if (GlRenderer.USE_OPENGL && DummyClass15.state != 0) {
        GlRenderer.swapBuffers();
        Arrays.fill(DummyClass9.aBooleanArray4008, false);
      } else {
        Graphics graphics;
        if ((DummyClass15.state == 30 || DummyClass15.state == 10)
            && GlobalStatics_6.rectangleDebugType == 0 && !var10) {
          try {
            graphics = GlobalStatics_8.GAME_CANVAS.getGraphics();

            for (var5 = 0; GlobalStatics_9.widgetQuads > var5; ++var5) {
              if (DummyClass9.aBooleanArray4008[var5]) {
                GlobalStatics_9.viewImageProducer
                    .draw(graphics, GlTexture2d.quadx1[var5],
                        GlobalStatics_5.quadx0[var5],
                        GlobalStatics_9.quady1[var5],
                        GlobalStatics_9.quady0[var5], 6260);
                DummyClass9.aBooleanArray4008[var5] = false;
              }
            }
          } catch (Exception var8) {
            GlobalStatics_8.GAME_CANVAS.repaint();
          }
        } else if (DummyClass15.state != 0) {
          try {
            graphics = GlobalStatics_8.GAME_CANVAS.getGraphics();
            GlobalStatics_9.viewImageProducer.draw(0, 0, graphics, 0);

            for (var5 = 0; var5 < GlobalStatics_9.widgetQuads; ++var5) {
              DummyClass9.aBooleanArray4008[var5] = false;
            }
          } catch (Exception var7) {
            var7.printStackTrace();
            GlobalStatics_8.GAME_CANVAS.repaint();
          }
        }
      }

      if (DummyClass43.aBoolean913) {
        GlobalStatics_9.method1346(26211);
      }

      if (SettingsStatics.SAFE_MODE
          && DummyClass15.state == 10
          && GlobalStatics_9.anInt3655 != -1) {
        SettingsStatics.SAFE_MODE = false;
        SettingsStatics.writeSettings(DummyClass35.signLink);
      }

    }
  }

  public void initialize(int var1) {
    DummyClass25.resizeCanvas();
    GlobalStatics_10.fileCacheRequester = new FileCacheRequester();
    DummyClass43.ondemandRequester = new OndemandRequester();
    if (GlobalStatics_10.usageMode != 0) {
      GlobalStatics_9.byteArrayPool = new byte[50][];
    }

    GlobalStatics_7.anInt2451 = GlobalStatics_8.portOffset;
    SettingsStatics.loadSettings(DummyClass35.signLink);
    if (GlobalStatics_4.usageLocation == 0) {
      GlobalStatics_8.serverHost = this.getCodeBase().getHost();
      DummyClass41.secondaryPort = 443;
      GlobalStatics_9.primaryPort = 0xaa4a;
    } else {
      if (GlobalStatics_4.usageLocation == 1) {
        GlobalStatics_8.serverHost = this.getCodeBase().getHost();
        DummyClass41.secondaryPort = GlobalStatics_8.portOffset + 50000;
        GlobalStatics_9.primaryPort = GlobalStatics_8.portOffset + 40000;
      } else if (GlobalStatics_4.usageLocation == 2) {
        DummyClass41.secondaryPort = GlobalStatics_8.portOffset + 50000;
        GlobalStatics_9.primaryPort = GlobalStatics_8.portOffset + 40000;
      }
    }

    if (GlobalStatics_5.gameId == 1) {
      DummyClass55.aBoolean1419 = true;
      GlEnvironment.DEFAULT_SUN_COLOR = 0xffffff;
      GlobalStatics_2.aShortArrayArray344 = GlobalStatics_5.aShortArrayArray1619;
      DummyClass55.aShortArrayArray1429 = GlobalStatics_9.aShortArrayArray2634;
      GlobalStatics_9.aShortArray2548 = GlobalStatics_9.aShortArray63;
      GlobalStatics_7.aShortArray1311 = GlobalStatics_2.aShortArray2219;
    } else {
      GlobalStatics_2.aShortArrayArray344 = GlobalStatics_9.aShortArrayArray3654;
      GlobalStatics_7.aShortArray1311 = GlobalStatics_10.aShortArray3349;
      DummyClass55.aShortArrayArray1429 = DummyClass29.aShortArrayArray435;
      GlobalStatics_9.aShortArray2548 = GlobalStatics_9.aShortArray3011;
    }

    GlobalStatics_9.anInt506 = DummyClass41.secondaryPort;
    DummyClass11.anInt2036 = GlobalStatics_9.primaryPort;
    DummyClass36.aString2611 = GlobalStatics_8.serverHost;
    DummyClass24.anInt1658 = GlobalStatics_9.primaryPort;
    GlobalStatics_10.aShortArray3455 = GlobalStatics_10.aShortArray3110 =
        GlobalStatics_9.aShortArray1779 = GlobalStatics_10.aShortArray3453 = new short[256];
    if (var1 != 2) {
      GlobalStatics_8.method51(null);
    }

    GlobalStatics_9.anInt2894 = DummyClass24.anInt1658;
    if (GlobalStatics_9.anInt1214 == 3 && GlobalStatics_4.usageLocation != 2) {
      GlobalStatics_7.anInt2451 = GlobalStatics_8.portOffset;
    }

    GlobalStatics_6.initializeKeyTable();
    GlobalStatics_10.method193(GlobalStatics_8.GAME_CANVAS);
    MouseStatics.bindMouseListener(GlobalStatics_8.GAME_CANVAS);
    MouseWheelStatics.MOUSE_WHEEL = MouseWheelStatics.createMouseWheel();
    if (MouseWheelStatics.MOUSE_WHEEL != null) {
      MouseWheelStatics.MOUSE_WHEEL.bind(GlobalStatics_8.GAME_CANVAS);
    }

    DummyClass5.anInt2994 = GlobalStatics_9.anInt1214;

    try {
      if (DummyClass35.signLink.cacheDataFile != null) {
        DummyClass55.cacheDataFile =
            new BufferedFile(DummyClass35.signLink.cacheDataFile, 5200, 0);

        for (int var2 = 0; var2 < 28; ++var2) {
          DummyClass7.cacheIndexFiles[var2] =
              new BufferedFile(DummyClass35.signLink.cacheIndexFiles[var2],
                  6000, 0);
        }

        GlobalStatics_9.tableIndexFile =
            new BufferedFile(DummyClass35.signLink.tableIndexFile, 6000, 0);
        GlobalStatics_0.tableCache =
            new FileCache(255, DummyClass55.cacheDataFile,
                GlobalStatics_9.tableIndexFile,
                500000);
        GlobalStatics_9.uidFile = new BufferedFile(
            DummyClass35.signLink.randomDataFile, 24, 0);
        DummyClass35.signLink.cacheIndexFiles = null;
        DummyClass35.signLink.tableIndexFile = null;
        DummyClass35.signLink.randomDataFile = null;
        DummyClass35.signLink.cacheDataFile = null;
      }
    } catch (IOException var3) {
      GlobalStatics_9.uidFile = null;
      DummyClass55.cacheDataFile = null;
      GlobalStatics_9.tableIndexFile = null;
      GlobalStatics_0.tableCache = null;
    }

    DummyClass10.aClass94_2083 = GameStringStatics.aClass94_485;
    if (GlobalStatics_4.usageLocation != 0) {
      DummyClass29.aBoolean438 = true;
    }
  }


}
