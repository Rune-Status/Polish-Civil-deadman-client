package com.jagex.runescape.statics;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.input.KeyboardStatics;
import com.jagex.runescape.model.SocketStream;
import com.jagex.runescape.opengl.GLStatics;
import java.awt.Component;
import java.io.IOException;
import java.net.Socket;

public final class DummyClass9 extends DummyClass5 {

  public static GameString aClass94_4007 = GameStringStatics.create(":");
  public static boolean[] aBooleanArray4008 = new boolean[100];
  public static int[] anIntArray4009 = new int[5];
  public static int[][] anIntArrayArray4010 = new int[104][104];
  public static int anInt4011;

  public static void method2213(byte var0) {
    DummyClass9.anIntArray4009 = null;
    GameStringStatics.aByteArray4005 = null;
    DummyClass9.aBooleanArray4008 = null;
    if (var0 != 104) {
      DummyClass9.aClass94_4007 = null;
    }

    DummyClass9.aClass94_4007 = null;
    DummyClass9.anIntArrayArray4010 = null;
  }

  public static void method2214(int var0) {
    if (var0 != 0) {
      GameStringStatics.aByteArray4005 = null;
    }

    if (!GlobalStatics_9.method1986() && GlobalStatics_8.plane
        != GlobalStatics_9.currentPlane) {
      GlobalStatics_7
          .rebuildScene(GlobalStatics_9.currentPlane,
              GlobalStatics_10.anInt2294,
              GlobalStatics_2.anInt3606,
              GlobalStatics_9.localPlayer.waypointsY[0], false,
              GlobalStatics_9.localPlayer.waypointsX[0], true);
    } else {
      if (GlobalStatics_9.currentPlane != DummyClass43.anInt909
          && GlobalStatics_6
          .method385(
              var0, GlobalStatics_9.currentPlane)) {
        DummyClass43.anInt909 = GlobalStatics_9.currentPlane;
        GlobalStatics_0.method792(var0 + 9179409);
      }

    }
  }

  public static void unbindKeyboard(Component var0, int var1) {
    if (var1 == -9320) {
      var0.removeKeyListener(KeyboardStatics.KEYBOARD);
      var0.removeFocusListener(KeyboardStatics.KEYBOARD);
      KeyboardStatics.anInt2384 = -1;
    }
  }

  public static void method2216(byte var0) {
    if (var0 != 81) {
      DummyClass9.unbindKeyboard(null, 14);
    }

    if (GlobalStatics_9.anInt3375 != 0) {
      try {
        if (++GlobalStatics_2.anInt2246 > 1500) {
          if (GlobalStatics_9.GAME_SOCKET != null) {
            GlobalStatics_9.GAME_SOCKET.destroy();
            GlobalStatics_9.GAME_SOCKET = null;
          }

          if (DummyClass26.anInt1616 >= 1) {
            GlobalStatics_5.loginResponse = -5;
            GlobalStatics_9.anInt3375 = 0;
            return;
          }

          GlobalStatics_2.anInt2246 = 0;
          ++DummyClass26.anInt1616;
          GlobalStatics_9.anInt3375 = 1;
          if (DummyClass24.anInt1658 == GlobalStatics_9.primaryPort) {
            DummyClass24.anInt1658 = DummyClass41.secondaryPort;
          } else {
            DummyClass24.anInt1658 = GlobalStatics_9.primaryPort;
          }
        }

        if (GlobalStatics_9.anInt3375 == 1) {
          GlobalStatics_6.socketRequest =
              DummyClass35.signLink
                  .method1441((byte) 8, GlobalStatics_8.serverHost,
                      DummyClass24.anInt1658);
          GlobalStatics_9.anInt3375 = 2;
        }

        int var1;
        if (GlobalStatics_9.anInt3375 == 2) {
          assert GlobalStatics_6.socketRequest != null;
          if (GlobalStatics_6.socketRequest.status == 2) {
            throw new IOException();
          }

          if (GlobalStatics_6.socketRequest.status != 1) {
            return;
          }

          GlobalStatics_9.GAME_SOCKET =
              new SocketStream((Socket) GlobalStatics_6.socketRequest.result,
                  DummyClass35.signLink);
          GlobalStatics_6.socketRequest = null;
          GlobalStatics_9.GAME_SOCKET
              .write(GlobalStatics_9.SECURE_BUFFER.bytes, 0,
                  GlobalStatics_9.SECURE_BUFFER.position);
          if (GlobalStatics_9.audioOutputStream0 != null) {
            GlobalStatics_9.audioOutputStream0.pause();
          }

          if (GlobalStatics_9.audioOutputStream1 != null) {
            GlobalStatics_9.audioOutputStream1.pause();
          }

          var1 = GlobalStatics_9.GAME_SOCKET.read();
          if (GlobalStatics_9.audioOutputStream0 != null) {
            GlobalStatics_9.audioOutputStream0.pause();
          }

          if (GlobalStatics_9.audioOutputStream1 != null) {
            GlobalStatics_9.audioOutputStream1.pause();
          }

          if (var1 != 101) {
            GlobalStatics_5.loginResponse = var1;
            GlobalStatics_9.anInt3375 = 0;
            GlobalStatics_9.GAME_SOCKET.destroy();
            GlobalStatics_9.GAME_SOCKET = null;
            return;
          }

          GlobalStatics_9.anInt3375 = 3;
        }

        if (GlobalStatics_9.anInt3375 == 3) {
          assert GlobalStatics_9.GAME_SOCKET != null;
          if (GlobalStatics_9.GAME_SOCKET.available() < 2) {
            return;
          }

          var1 = GlobalStatics_9.GAME_SOCKET.read() << 8
              | GlobalStatics_9.GAME_SOCKET.read();
          GLStatics.method1627(var1, (byte) -16);
          if (GlobalStatics_7.anInt2451 == -1) {
            GlobalStatics_9.anInt3375 = 0;
            GlobalStatics_5.loginResponse = 6;
            GlobalStatics_9.GAME_SOCKET.destroy();
            GlobalStatics_9.GAME_SOCKET = null;
            return;
          }

          GlobalStatics_9.anInt3375 = 0;
          GlobalStatics_9.GAME_SOCKET.destroy();
          GlobalStatics_9.GAME_SOCKET = null;
          GlobalStatics_9.method951(0);
          return;
        }
      } catch (IOException var2) {
        if (GlobalStatics_9.GAME_SOCKET != null) {
          GlobalStatics_9.GAME_SOCKET.destroy();
          GlobalStatics_9.GAME_SOCKET = null;
        }

        if (DummyClass26.anInt1616 < 1) {
          if (DummyClass24.anInt1658 == GlobalStatics_9.primaryPort) {
            DummyClass24.anInt1658 = DummyClass41.secondaryPort;
          } else {
            DummyClass24.anInt1658 = GlobalStatics_9.primaryPort;
          }

          GlobalStatics_9.anInt3375 = 1;
          GlobalStatics_2.anInt2246 = 0;
          ++DummyClass26.anInt1616;
        } else {
          GlobalStatics_5.loginResponse = -4;
          GlobalStatics_9.anInt3375 = 0;
        }
      }

    }
  }

}
