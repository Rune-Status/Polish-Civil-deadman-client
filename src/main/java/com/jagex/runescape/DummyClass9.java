package com.jagex.runescape;

import com.jagex.runescape.opengl.shader.MaterialShader5;
import java.awt.Component;
import java.io.IOException;
import java.net.Socket;

public final class DummyClass9 extends DummyClass5 {

  public static byte[] aByteArray4005 = {
    (byte) 95, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102, (byte) 103,
    (byte) 104, (byte) 105, (byte) 106, (byte) 107, (byte) 108, (byte) 109, (byte) 110, (byte) 111,
    (byte) 112, (byte) 113, (byte) 114, (byte) 115, (byte) 116, (byte) 117, (byte) 118, (byte) 119,
    (byte) 120, (byte) 121, (byte) 122, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52,
    (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57
  };
  public static int viewportLowerX;
  public static GameString aClass94_4007 = GameString.create(":");
  public static boolean[] aBooleanArray4008 = new boolean[100];
  public static int[] anIntArray4009 = new int[5];
  public static int[][] anIntArrayArray4010 = new int[104][104];
  public static int anInt4011;


  public static void method2213(byte var0) {
    DummyClass9.anIntArray4009 = null;
      DummyClass9.aByteArray4005 = null;
      DummyClass9.aBooleanArray4008 = null;
      if (var0 != 104) {
        DummyClass9.aClass94_4007 = null;
      }

      DummyClass9.aClass94_4007 = null;
      DummyClass9.anIntArrayArray4010 = null;
  }

  public static void method2214(int var0) {
    if (var0 != 0) {
        DummyClass9.aByteArray4005 = null;
      }

      if (!NPC.method1986(90) && ~GameObject.plane != ~GameWorldSomething.currentPlane) {
        FileCacheRequester.rebuildScene(GameWorldSomething.currentPlane, VariableUpdate.anInt2294,
          AbstractObjectNode.anInt3606, TextureCache.localPlayer.waypointsY[0], false,
          TextureCache.localPlayer.waypointsX[0], true);
      } else {
        if (~GameWorldSomething.currentPlane != ~DummyClass43.anInt909 && ClanChatUser.method385(
          var0 + 0, GameWorldSomething.currentPlane)) {
          DummyClass43.anInt909 = GameWorldSomething.currentPlane;
          Buffer.method792(var0 + 9179409);
        }

      }
  }

  public static void unbindKeyboard(Component var0, int var1) {
    if (var1 == -9320) {
        var0.removeKeyListener(TextureSampler33.keyboard);
        var0.removeFocusListener(TextureSampler33.keyboard);
        AbstractTextureSampler.anInt2384 = -1;
      }
  }

  public static void method2216(byte var0) {
    if (var0 != 81) {
        DummyClass9.unbindKeyboard(null, 14);
      }

      if (~TextureSampler2.anInt3375 != -1) {
        try {
          if (++SceneGraphTile.anInt2246 > 1500) {
            if (SomethingVolume15.gameSocket != null) {
              SomethingVolume15.gameSocket.destroy();
              SomethingVolume15.gameSocket = null;
            }

            if (DummyClass26.anInt1616 >= 1) {
              AbstractImageProducer.loginResponse = -5;
              TextureSampler2.anInt3375 = 0;
              return;
            }

            SceneGraphTile.anInt2246 = 0;
            ++DummyClass26.anInt1616;
            TextureSampler2.anInt3375 = 1;
            if (DummyClass24.anInt1658 == ProjectileNode.primaryPort) {
              DummyClass24.anInt1658 = DummyClass41.secondaryPort;
            } else {
              DummyClass24.anInt1658 = ProjectileNode.primaryPort;
            }
          }

          if (~TextureSampler2.anInt3375 == -2) {
            AreaSoundEffect.socketRequest =
              DummyClass35.signLink.method1441((byte) 8, GameException.serverHost,
                DummyClass24.anInt1658);
            TextureSampler2.anInt3375 = 2;
          }

          int var1;
          if (~TextureSampler2.anInt3375 == -3) {
            assert AreaSoundEffect.socketRequest != null;
            if (~AreaSoundEffect.socketRequest.status == -3) {
              throw new IOException();
            }

            if (AreaSoundEffect.socketRequest.status != 1) {
              return;
            }

            SomethingVolume15.gameSocket =
              new SocketStream((Socket) AreaSoundEffect.socketRequest.result,
                DummyClass35.signLink);
            AreaSoundEffect.socketRequest = null;
            SomethingVolume15.gameSocket.write(TextureSampler12.secureBuffer.bytes, 0,
              TextureSampler12.secureBuffer.position);
            if (GameWorld.audioOutputStream0 != null) {
              GameWorld.audioOutputStream0.pause();
            }

            if (SomethingWorldMappy.audioOutputStream1 != null) {
              SomethingWorldMappy.audioOutputStream1.pause();
            }

            var1 = SomethingVolume15.gameSocket.read();
            if (GameWorld.audioOutputStream0 != null) {
              GameWorld.audioOutputStream0.pause();
            }

            if (SomethingWorldMappy.audioOutputStream1 != null) {
              SomethingWorldMappy.audioOutputStream1.pause();
            }

            if (~var1 != -102) {
              AbstractImageProducer.loginResponse = var1;
              TextureSampler2.anInt3375 = 0;
              SomethingVolume15.gameSocket.destroy();
              SomethingVolume15.gameSocket = null;
              return;
            }

            TextureSampler2.anInt3375 = 3;
          }

          if (~TextureSampler2.anInt3375 == -4) {
            assert SomethingVolume15.gameSocket != null;
            if (~SomethingVolume15.gameSocket.available() > -3) {
              return;
            }

            var1 = SomethingVolume15.gameSocket.read() << 8 | SomethingVolume15.gameSocket.read();
            MaterialShader5.method1627(var1, (byte) -16);
            if (ClientScriptCall.anInt2451 == -1) {
              TextureSampler2.anInt3375 = 0;
              AbstractImageProducer.loginResponse = 6;
              SomethingVolume15.gameSocket.destroy();
              SomethingVolume15.gameSocket = null;
              return;
            }

            TextureSampler2.anInt3375 = 0;
            SomethingVolume15.gameSocket.destroy();
            SomethingVolume15.gameSocket = null;
            IdentityKit.method951(0);
            return;
          }
        } catch (IOException var2) {
          if (SomethingVolume15.gameSocket != null) {
            SomethingVolume15.gameSocket.destroy();
            SomethingVolume15.gameSocket = null;
          }

          if (DummyClass26.anInt1616 < 1) {
            if (DummyClass24.anInt1658 == ProjectileNode.primaryPort) {
              DummyClass24.anInt1658 = DummyClass41.secondaryPort;
            } else {
              DummyClass24.anInt1658 = ProjectileNode.primaryPort;
            }

            TextureSampler2.anInt3375 = 1;
            SceneGraphTile.anInt2246 = 0;
            ++DummyClass26.anInt1616;
          } else {
            AbstractImageProducer.loginResponse = -4;
            TextureSampler2.anInt3375 = 0;
          }
        }

      }
  }

}
