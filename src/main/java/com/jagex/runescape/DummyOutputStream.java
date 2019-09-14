package com.jagex.runescape;

import java.io.IOException;
import java.io.OutputStream;

public final class DummyOutputStream extends OutputStream {

  public static GameString[] titleSuffixes;
  public static short aShort46 = 256;
  public static boolean aBoolean47;
  public static int anInt48 = 2;
  public static int[] anIntArray49;
  public static GameString aClass94_50 = GameString.create("<col=80ff00>");
  public static GameString aClass94_51 = GameString.create("; Expires=");

  public void write(int var1) throws IOException {
    throw new IOException();
  }

  public static short[] copy(int var0, short[] var1) {
    if (var0 != 23032) {
        return null;
      } else if (var1 != null) {
        short[] var2 = new short[var1.length];
        ArrayUtils.method1361(var1, 0, var2, 0, var1.length);
        return var2;
      } else {
        return null;
      }
  }

  public static void method66(GameString var0, int var1, int var2, byte var3, int var4) {
    Widget var5 = AbstractDirectColorSprite.method638((byte) -19, var4, var1);
      if (var5 != null) {
        if (var5.anObjectArray314 != null) {
          ClientScriptCall var6 = new ClientScriptCall();
          var6.arguments = var5.anObjectArray314;
          var6.aClass11_2449 = var5;
          var6.aClass94_2439 = var0;
          var6.anInt2445 = var2;
          Light.executeScript(var6);
        }

        boolean var8 = true;
        if (var5.anInt189 > 0) {
          var8 = ProjectileNode.method715(205, var5);
        }

        if (var8) {
          if (GameClient.method44(var5).method92(var2 - 1, (byte) -108)) {
            if (var2 == 1) {
              TextureSampler12.secureBuffer.writePacket(155);
              TextureSampler12.secureBuffer.writeInt(var4);
              ++Deque.anInt937;
              TextureSampler12.secureBuffer.writeShort(var1);
            }

            if (var3 < -7) {
              if (~var2 == -3) {
                ++TextureSampler30.anInt3122;
                TextureSampler12.secureBuffer.writePacket(196);
                TextureSampler12.secureBuffer.writeInt(var4);
                TextureSampler12.secureBuffer.writeShort(var1);
              }

              if (~var2 == -4) {
                ++DummyClass42.anInt889;
                TextureSampler12.secureBuffer.writePacket(124);
                TextureSampler12.secureBuffer.writeInt(var4);
                TextureSampler12.secureBuffer.writeShort(var1);
              }

              if (var2 == 4) {
                TextureSampler12.secureBuffer.writePacket(199);
                TextureSampler12.secureBuffer.writeInt(var4);
                TextureSampler12.secureBuffer.writeShort(var1);
                ++Keyboard.anInt1909;
              }

              if (~var2 == -6) {
                TextureSampler12.secureBuffer.writePacket(234);
                TextureSampler12.secureBuffer.writeInt(var4);
                TextureSampler12.secureBuffer.writeShort(var1);
                ++SomethingIndex150.anInt2081;
              }

              if (var2 == 6) {
                TextureSampler12.secureBuffer.writePacket(168);
                ++DummyClass52.anInt1172;
                TextureSampler12.secureBuffer.writeInt(var4);
                TextureSampler12.secureBuffer.writeShort(var1);
              }

              if (~var2 == -8) {
                ++DummyClass59.anInt674;
                TextureSampler12.secureBuffer.writePacket(166);
                TextureSampler12.secureBuffer.writeInt(var4);
                TextureSampler12.secureBuffer.writeShort(var1);
              }

              if (~var2 == -9) {
                TextureSampler12.secureBuffer.writePacket(64);
                ++LightIntensity.anInt903;
                TextureSampler12.secureBuffer.writeInt(var4);
                TextureSampler12.secureBuffer.writeShort(var1);
              }

              if (~var2 == -10) {
                ++DummyClass52.anInt1166;
                TextureSampler12.secureBuffer.writePacket(53);
                TextureSampler12.secureBuffer.writeInt(var4);
                TextureSampler12.secureBuffer.writeShort(var1);
              }

              if (~var2 == -11) {
                ++CollisionMap.anInt1307;
                TextureSampler12.secureBuffer.writePacket(9);
                TextureSampler12.secureBuffer.writeInt(var4);
                TextureSampler12.secureBuffer.writeShort(var1);
              }

            }
          }
        }
      }
  }

  public static void method67(boolean var0) {
    DummyOutputStream.aClass94_50 = null;
      DummyOutputStream.titleSuffixes = null;
      if (!var0) {
        DummyOutputStream.aBoolean47 = true;
      }

      DummyOutputStream.anIntArray49 = null;
      DummyOutputStream.aClass94_51 = null;
  }

  public static void method68(int var0, int var1, Mobile var2) {
    if (~AbstractGameWorld.updateCycle <= ~var2.anInt2800) {
        if (var2.anInt2790 >= AbstractGameWorld.updateCycle) {
          FloorOverlay.method2270(var2, (byte) -56);
        } else {
          Cursor.method1180((byte) -22, var2);
        }
      } else {
        StillGraphic.method1950(var2, true);
      }

      if (~var2.anInt2819 > -129 || var2.anInt2829 < 128 || var2.anInt2819 >= 13184
        || var2.anInt2829 >= 13184) {
        var2.animationId = -1;
        var2.anInt2842 = -1;
        var2.anInt2800 = 0;
        var2.anInt2790 = 0;
        var2.anInt2819 = 128 * var2.waypointsX[0] - -(64 * var2.getSize());
        var2.anInt2829 = var2.waypointsY[0] * 128 + var2.getSize() * 64;
        var2.method1973(var1 + -2395);
      }

      if (var1 == 2279) {
        if (var2 == TextureCache.localPlayer && (var2.anInt2819 < 1536 ||
            ~var2.anInt2829 > -1537
          || ~var2.anInt2819 <= -11777 || var2.anInt2829 >= 11776)) {
          var2.anInt2842 = -1;
          var2.anInt2800 = 0;
          var2.anInt2790 = 0;
          var2.animationId = -1;
          var2.anInt2819 = var2.waypointsX[0] * 128 + var2.getSize() * 64;
          var2.anInt2829 = 128 * var2.waypointsY[0] + 64 * var2.getSize();
          var2.method1973(-98);
        }

        DummyClass1.method904(65536, var2);
        RenderAnimation.method900(var2, -11973);
      }
  }

}
