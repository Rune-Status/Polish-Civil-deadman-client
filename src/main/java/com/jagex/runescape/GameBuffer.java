package com.jagex.runescape;

import com.jagex.runescape.opengl.GlEnvironment;
import com.jagex.runescape.opengl.GlTexture2d;

public final class GameBuffer extends Buffer {

  public static GameString[] titlePrefixes;
  public static int[] anIntArray3804 = new int[256];
  public static int[] anIntArray3805;
  public static GameString MAP_PREFIX = GameString.create("m");
  private ISAACCipher cipher;
  private int bitOffset;

  public GameBuffer(int var1) {
    super(var1);
  }

  public void method807(byte var1) {
    this.bitOffset = this.position * 8;
  }

  public void method811(byte var1, int var2, byte[] var3, int var4) {
    if (var1 < 16) {
      GameBuffer.printMessage(null, 126, null, -28);
    }

    for (int var5 = 0; var5 < var4; ++var5) {
      var3[var2 + var5] = (byte) (this.bytes[this.position++] + -this.cipher
          .getNextValue());
    }
  }

  public int readBits(int len) {
    int byteOffset = this.bitOffset >> 3;
    int pass = 8 - (7 & this.bitOffset);
    int value = 0;
    this.bitOffset += len;

    while (~pass > ~len) {
      value += (StillGraphic.BIT_MASKS[pass] & this.bytes[byteOffset++])
          << -pass + len;
      len -= pass;
      pass = 8;
    }

    if (~pass == ~len) {
      value += this.bytes[byteOffset] & StillGraphic.BIT_MASKS[pass];
    } else {
      value +=
          this.bytes[byteOffset] >> pass - len & StillGraphic.BIT_MASKS[len];
    }

    return value;
  }

  public void initializeCipher(int[] keys) {
    this.cipher = new ISAACCipher(keys);
  }

  public int method815(int var1, int var2) {
    if (var2 != 32666) {
      this.method811((byte) 96, 46, null, -50);
    }

    return var1 * 8 - this.bitOffset;
  }

  public void writePacket(int id) {
    System.out.println("GameBuffer.writePacket " + id);
    this.bytes[this.position++] = (byte) (id + this.cipher.getNextValue());
  }

  public int readPacketId() {
    return 255 & this.bytes[this.position++] - this.cipher.getNextValue();
  }

  public void method818(boolean var1) {
    this.position = (this.bitOffset + 7) / 8;
      if (var1) {
        this.readBits(-75);
      }
  }

  public static void printMessage(GameString var0, int var1, GameString var2,
      int var3) {
    InventoryConfig.method611(var3, var1, var2, null, (byte) 50, var0);
  }

  public static void method806(int var0, int var1) {
    if (~var1 <= -1) {
      int var2 = DummyClass26.anIntArray1613[var1];
      int var3 = DummyClass32.anIntArray512[var1];
      int var4 = TextureSampler27.aShortArray3095[var1];
      if (var4 >= 2000) {
        var4 -= 2000;
      }

      long var6 = TextureSampler0.aLongArray3271[var1];
      int var5 = (int) TextureSampler0.aLongArray3271[var1];
      Player var8;
      if (var4 == 31) {
        var8 = TextureSampler0.players[var5];
        if (var8 != null) {
          ++Something3dRoot.anInt2059;
          Parameter
              .method582(TextureCache.localPlayer.waypointsY[0], 0, 1, false,
                  0, 2,
                  var8.waypointsX[0], 1, 0, 2, var8.waypointsY[0],
                  TextureCache.localPlayer.waypointsX[0]);
          HuffmanEncoder.anInt638 = 2;
          FileRequester.anInt2958 = 0;
          SceneSomething2.anInt1053 = DummyClass5.anInt2993;
          FileCacheRequest.anInt4062 = DummyClass36.anInt2614;
          TextureSampler12.secureBuffer.writePacket(71);
          TextureSampler12.secureBuffer.method765(var5, (byte) 3);
        }
      }

      if (~var4 == -47) {
        ++SomethingOtherWorldMap.anInt2534;
        DummyClass8.method2224((byte) 39, var6, var3, var2);
        TextureSampler12.secureBuffer.writePacket(247);
        TextureSampler12.secureBuffer
            .writeShortLE(-1, ProceduralTexture.anInt1152 + var3);
        TextureSampler12.secureBuffer
            .method765(var2 + WorldMapLabel.anInt1716, (byte) 3);
        TextureSampler12.secureBuffer
            .writeShort(Integer.MAX_VALUE & (int) (var6 >>> 32));
      }

      if (~var4 == -41) {
        TextureSampler12.secureBuffer.writePacket(27);
        TextureSampler12.secureBuffer.writeShort(DummyClass31.anInt1473);
        ++SceneShadowMap.anInt1776;
        TextureSampler12.secureBuffer.method785(var3, (byte) -122);
        TextureSampler12.secureBuffer.writeShortLE(-1, var2);
        TextureSampler12.secureBuffer
            .method785(GlTexture2d.anInt3764, (byte) -122);
        TextureSampler12.secureBuffer
            .method765(Something3dRoot.anInt2050, (byte) 3);
        TextureSampler12.secureBuffer.method765(var5, (byte) 3);
        AreaSoundEffect.anInt2330 = 0;
        AbstractFileRequester.aClass11_1933 = EnumStringFetcher
            .getWidget((byte) 120, var3);
        Keyboard.anInt1918 = var2;
      }

      NPC var11;
      if (~var4 == -20) {
        var11 = TextureSampler5.npcs[var5];
        if (var11 != null) {
          Parameter
              .method582(TextureCache.localPlayer.waypointsY[0], 0, 1, false,
                  0, 2,
                  var11.waypointsX[0], 1, 0, 2, var11.waypointsY[0],
                  TextureCache.localPlayer.waypointsX[0]);
          ++DummyClass32.anInt513;
          SceneSomething2.anInt1053 = DummyClass5.anInt2993;
          HuffmanEncoder.anInt638 = 2;
          FileRequester.anInt2958 = 0;
          FileCacheRequest.anInt4062 = DummyClass36.anInt2614;
          TextureSampler12.secureBuffer.writePacket(30);
          TextureSampler12.secureBuffer.writeShort(var5);
        }
      }

      if (var4 == 17) {
        var11 = TextureSampler5.npcs[var5];
        if (var11 != null) {
          Parameter
              .method582(TextureCache.localPlayer.waypointsY[0], 0, 1, false,
                  0, 2,
                  var11.waypointsX[0], 1, 0, 2, var11.waypointsY[0],
                  TextureCache.localPlayer.waypointsX[0]);
          SceneSomething2.anInt1053 = DummyClass5.anInt2993;
          FileRequester.anInt2958 = 0;
          ++AbstractFileRequest.anInt3627;
          HuffmanEncoder.anInt638 = 2;
          FileCacheRequest.anInt4062 = DummyClass36.anInt2614;
          TextureSampler12.secureBuffer.writePacket(78);
          TextureSampler12.secureBuffer.writeShortLE(-1, var5);
        }
      }

      if (var4 == 44) {
        var8 = TextureSampler0.players[var5];
        if (var8 != null) {
          ++AudioStreamEncoder4.anInt3517;
          Parameter
              .method582(TextureCache.localPlayer.waypointsY[0], 0, 1, false,
                  0, 2,
                  var8.waypointsX[0], 1, 0, 2, var8.waypointsY[0],
                  TextureCache.localPlayer.waypointsX[0]);
          SceneSomething2.anInt1053 = DummyClass5.anInt2993;
          HuffmanEncoder.anInt638 = 2;
          FileCacheRequest.anInt4062 = DummyClass36.anInt2614;
          FileRequester.anInt2958 = 0;
          TextureSampler12.secureBuffer.writePacket(133);
          TextureSampler12.secureBuffer.writeShortLE(-1, var5);
        }
      }

      if (~var4 == -59) {
        TextureSampler12.secureBuffer.writePacket(135);
        TextureSampler12.secureBuffer.method783(var5, -268435456);
        ++TextureSampler37.anInt3255;
        TextureSampler12.secureBuffer.method783(var2, -268435456);
        TextureSampler12.secureBuffer.method759(-68, var3);
        AreaSoundEffect.anInt2330 = 0;
        AbstractFileRequester.aClass11_1933 = EnumStringFetcher
            .getWidget((byte) 117, var3);
        Keyboard.anInt1918 = var2;
      }

      if (~var4 == -43) {
        DummyClass8.method2224((byte) 39, var6, var3, var2);
        TextureSampler12.secureBuffer.writePacket(254);
        TextureSampler12.secureBuffer
            .writeShortLE(-1, var2 + WorldMapLabel.anInt1716);
        ++TextureSampler11.anInt3248;
        TextureSampler12.secureBuffer
            .method783((int) (var6 >>> 32) & Integer.MAX_VALUE,
                -268435456);
        TextureSampler12.secureBuffer
            .writeShort(var3 - -ProceduralTexture.anInt1152);
      }

      if (var4 == 28) {
        TextureSampler4.method264((byte) 122);
      }

      if (~var4 == -46) {
        var11 = TextureSampler5.npcs[var5];
        if (var11 != null) {
          Parameter
              .method582(TextureCache.localPlayer.waypointsY[0], 0, 1, false,
                  0, 2,
                  var11.waypointsX[0], 1, 0, 2, var11.waypointsY[0],
                  TextureCache.localPlayer.waypointsX[0]);
          SceneSomething2.anInt1053 = DummyClass5.anInt2993;
          HuffmanEncoder.anInt638 = 2;
          ++TextureSampler15.anInt3205;
          FileRequester.anInt2958 = 0;
          FileCacheRequest.anInt4062 = DummyClass36.anInt2614;
          TextureSampler12.secureBuffer.writePacket(239);
          TextureSampler12.secureBuffer
              .method785(ScriptState.anInt872, (byte) -123);
          TextureSampler12.secureBuffer
              .method783(Widget.anInt278, -268435456);
          TextureSampler12.secureBuffer.method765(var5, (byte) 3);
        }
      }

      boolean var14;
      if (var4 == 18) {
        if (AbstractImageProducer.gameId == 1) {
          Parameter
              .method582(TextureCache.localPlayer.waypointsY[0], 0, 1, false,
                  0, 2, var2, 1,
                  0, 2, var3, TextureCache.localPlayer.waypointsX[0]);
        } else {
          var14 = Parameter
              .method582(TextureCache.localPlayer.waypointsY[0], 0, 0, false,
                  0,
                  var0 ^ 2599, var2, 0, 0, 2, var3,
                  TextureCache.localPlayer.waypointsX[0]);
          if (!var14) {
            Parameter.method582(TextureCache.localPlayer.waypointsY[0], 0, 1,
                false, 0, 2, var2,
                1, 0, 2, var3, TextureCache.localPlayer.waypointsX[0]);
          }
        }

        ++Parameter.anInt3615;
        SceneSomething2.anInt1053 = DummyClass5.anInt2993;
        FileRequester.anInt2958 = 0;
        HuffmanEncoder.anInt638 = 2;
        FileCacheRequest.anInt4062 = DummyClass36.anInt2614;
        TextureSampler12.secureBuffer.writePacket(66);
        TextureSampler12.secureBuffer
            .writeShortLE(-1, WorldMapLabel.anInt1716 + var2);
        TextureSampler12.secureBuffer.writeShort(var5);
        TextureSampler12.secureBuffer
            .method765(var3 - -ProceduralTexture.anInt1152, (byte) 3);
      }

      if (var4 == 1001) {
        ++Unsure.anInt1896;
        DummyClass8.method2224((byte) 39, var6, var3, var2);
        TextureSampler12.secureBuffer.writePacket(170);
        TextureSampler12.secureBuffer
            .method765(Integer.MAX_VALUE & (int) (var6 >>> 32),
                (byte) 3);
        TextureSampler12.secureBuffer
            .method765(var2 - -WorldMapLabel.anInt1716, (byte) 3);
        TextureSampler12.secureBuffer
            .method765(var3 - -ProceduralTexture.anInt1152, (byte) 3);
      }

      if (~var4 == -1003) {
        HuffmanEncoder.anInt638 = 2;
        SceneSomething2.anInt1053 = DummyClass5.anInt2993;
        FileCacheRequest.anInt4062 = DummyClass36.anInt2614;
        ++HashTable.anInt1701;
        FileRequester.anInt2958 = 0;
        TextureSampler12.secureBuffer.writePacket(92);
        TextureSampler12.secureBuffer.method765(var5, (byte) 3);
      }

      Widget var13;
      if (~var4 == -1007) {
        var13 = EnumStringFetcher.getWidget((byte) 119, var3);
        if (var13 != null && ~var13.anIntArray317[var2] <= -100001) {
          GameBuffer
              .printMessage(GroundItemNode.EMPTY_STRING, 0,
                  RenderAnimation.concat(new GameString[]{
                      SomethingScene.toString(var13.anIntArray317[var2]),
                      ProjectileNode.aClass94_3777,
                      DummyClass35
                          .getItemConfig(var5, (byte) 125).aClass94_770
                  }), -1);
        } else {
          TextureSampler12.secureBuffer.writePacket(92);
          ++HashTable.anInt1701;
          TextureSampler12.secureBuffer.method765(var5, (byte) 3);
        }

        AreaSoundEffect.anInt2330 = 0;
        AbstractFileRequester.aClass11_1933 = EnumStringFetcher
            .getWidget((byte) 123, var3);
        Keyboard.anInt1918 = var2;
      }

      if (var4 == 60) {
        if (~var5 == -1) {
          AbstractFileRequest
              .method589(GameWorldSomething.currentPlane, var2, var3);
        } else {
          if (~var5 == -2) {
            if (TextureSampler35.rights > 0
                && GameObjectConfig.aBooleanArray1490[82]
                && GameObjectConfig.aBooleanArray1490[81]) {
              BufferedFile.method979(WorldMapLabel.anInt1716 + var2,
                  ProceduralTexture.anInt1152 + var3,
                  GameWorldSomething.currentPlane, (byte) -4);
            } else if (Parameter
                .method582(TextureCache.localPlayer.waypointsY[0], 0, 0, true,
                    0,
                    2, var2, 0, 0, 1, var3,
                    TextureCache.localPlayer.waypointsX[0])) {
              TextureSampler12.secureBuffer.writeByte(DummyClass3.anInt56);
              TextureSampler12.secureBuffer.writeByte(DummyClass43.anInt916);
              TextureSampler12.secureBuffer
                  .writeShort(SpotAnimationConfig.anInt531);
              TextureSampler12.secureBuffer.writeByte(57);
              TextureSampler12.secureBuffer
                  .writeByte(TextureSampler9.anInt3102);
              TextureSampler12.secureBuffer.writeByte(Something3d2.anInt3020);
              TextureSampler12.secureBuffer.writeByte(89);
              TextureSampler12.secureBuffer
                  .writeShort(TextureCache.localPlayer.anInt2819);
              TextureSampler12.secureBuffer
                  .writeShort(TextureCache.localPlayer.anInt2829);
              TextureSampler12.secureBuffer
                  .writeByte(AbstractFrameRegulator.anInt1692);
              TextureSampler12.secureBuffer.writeByte(63);
            }
          }
        }
      }

      if (var4 == 1007) {
        FileRequester.anInt2958 = 0;
        HuffmanEncoder.anInt638 = 2;
        FileCacheRequest.anInt4062 = DummyClass36.anInt2614;
        SceneSomething2.anInt1053 = DummyClass5.anInt2993;
        var11 = TextureSampler5.npcs[var5];
        if (var11 != null) {
          NpcConfiguration var9 = var11.config;
          if (var9.anIntArray1292 != null) {
            var9 = var9.method1471((byte) 80);
          }

          if (var9 != null) {
            ++Inventory.anInt2549;
            TextureSampler12.secureBuffer.writePacket(72);
            TextureSampler12.secureBuffer.writeShort(var9.anInt1284);
          }
        }
      }

      if (~var4 == -48) {
        TextureSampler12.secureBuffer.writePacket(156);
        TextureSampler12.secureBuffer.method765(var2, (byte) 3);
        TextureSampler12.secureBuffer.method783(var5, -268435456);
        TextureSampler12.secureBuffer.method785(var3, (byte) -120);
        AreaSoundEffect.anInt2330 = 0;
        AbstractFileRequester.aClass11_1933 = EnumStringFetcher
            .getWidget((byte) 109, var3);
        Keyboard.anInt1918 = var2;
      }

      if (~var4 == -4) {
        TextureSampler12.secureBuffer.writePacket(253);
        ++PlayerVariable.anInt555;
        TextureSampler12.secureBuffer
            .method785(ScriptState.anInt872, (byte) -126);
        TextureSampler12.secureBuffer.method765(var2, (byte) 3);
        TextureSampler12.secureBuffer.method785(var3, (byte) -124);
        TextureSampler12.secureBuffer.method783(var5, -268435456);
        TextureSampler12.secureBuffer
            .writeShortLE(var0 ^ -2598, Widget.anInt278);
        AreaSoundEffect.anInt2330 = 0;
        AbstractFileRequester.aClass11_1933 = EnumStringFetcher
            .getWidget((byte) 120, var3);
        Keyboard.anInt1918 = var2;
      }

      if (~var4 == -11) {
        var8 = TextureSampler0.players[var5];
        if (var8 != null) {
          ++SocketStream.anInt1240;
          Parameter
              .method582(TextureCache.localPlayer.waypointsY[0], 0, 1, false,
                  0, 2,
                  var8.waypointsX[0], 1, 0, 2, var8.waypointsY[0],
                  TextureCache.localPlayer.waypointsX[0]);
          HuffmanEncoder.anInt638 = 2;
          FileCacheRequest.anInt4062 = DummyClass36.anInt2614;
          SceneSomething2.anInt1053 = DummyClass5.anInt2993;
          FileRequester.anInt2958 = 0;
          TextureSampler12.secureBuffer.writePacket(4);
          TextureSampler12.secureBuffer.writeShortLE(-1, var5);
        }
      }

      if (var4 == 41 && TextureSampler27.aClass11_3087 == null) {
        MapScene.method78(var2, false, var3);
        TextureSampler27.aClass11_3087 =
            AbstractDirectColorSprite.method638((byte) -19, var3, var2);
        DummyClass29.method909(var0 + -2470, TextureSampler27.aClass11_3087);
      }

      if (var4 == 49) {
        ++AbstractFileRequest.anInt3630;
        DummyClass8.method2224((byte) 39, var6, var3, var2);
        TextureSampler12.secureBuffer.writePacket(84);
        TextureSampler12.secureBuffer
            .method765(Integer.MAX_VALUE & (int) (var6 >>> 32),
                (byte) 3);
        TextureSampler12.secureBuffer
            .method765(ProceduralTexture.anInt1152 + var3, (byte) 3);
        TextureSampler12.secureBuffer
            .writeShortLE(var0 + -2598, var2 - -WorldMapLabel.anInt1716);
      }

      if (~var4 == -24) {
        ++BufferObject.anInt1886;
        TextureSampler12.secureBuffer.writePacket(206);
        TextureSampler12.secureBuffer.method783(var5, -268435456);
        TextureSampler12.secureBuffer.writeShortLE(var0 ^ -2598, var2);
        TextureSampler12.secureBuffer.method785(var3, (byte) -127);
        AreaSoundEffect.anInt2330 = 0;
        AbstractFileRequester.aClass11_1933 = EnumStringFetcher
            .getWidget((byte) 115, var3);
        Keyboard.anInt1918 = var2;
      }

      if (~var4 == -15 && DummyClass8
          .method2224((byte) 39, var6, var3, var2)) {
        ++OndemandFileRequest.anInt4065;
        TextureSampler12.secureBuffer.writePacket(134);
        TextureSampler12.secureBuffer
            .method783(WorldMapLabel.anInt1716 + var2,
                var0 ^ -268432859);
        TextureSampler12.secureBuffer.writeShort(Something3dRoot.anInt2050);
        TextureSampler12.secureBuffer
            .writeShortLE(-1, var3 - -ProceduralTexture.anInt1152);
        TextureSampler12.secureBuffer.writeShort(DummyClass31.anInt1473);
        TextureSampler12.secureBuffer
            .method759(var0 ^ -2588, GlTexture2d.anInt3764);
        TextureSampler12.secureBuffer
            .method783((int) (var6 >>> 32) & Integer.MAX_VALUE,
                -268435456);
      }

      if (var4 == 37) {
        var8 = TextureSampler0.players[var5];
        if (var8 != null) {
          Parameter
              .method582(TextureCache.localPlayer.waypointsY[0], 0, 1, false,
                  0, 2,
                  var8.waypointsX[0], 1, 0, 2, var8.waypointsY[0],
                  TextureCache.localPlayer.waypointsX[0]);
          FileRequester.anInt2958 = 0;
          ++DummyClass29.anInt437;
          HuffmanEncoder.anInt638 = 2;
          FileCacheRequest.anInt4062 = DummyClass36.anInt2614;
          SceneSomething2.anInt1053 = DummyClass5.anInt2993;
          TextureSampler12.secureBuffer.writePacket(114);
          TextureSampler12.secureBuffer.method765(var5, (byte) 3);
        }
      }

      if (var4 == 9 || var4 == 1003) {
        DummyOutputStream
            .method66(DummyClass8.aClass94Array4016[var1], var2, var5,
                (byte) -19,
                var3);
      }

      if (~var4 == -6) {
        TextureSampler12.secureBuffer.writePacket(55);
        TextureSampler12.secureBuffer.writeShortLE(-1, var5);
        TextureSampler12.secureBuffer.method783(var2, -268435456);
        ++TextureSampler26.anInt3084;
        TextureSampler12.secureBuffer.method775(var3, 1437452424);
        AreaSoundEffect.anInt2330 = 0;
        AbstractFileRequester.aClass11_1933 = EnumStringFetcher
            .getWidget((byte) 116, var3);
        Keyboard.anInt1918 = var2;
      }

      if (~var4 == -22) {
        if (~AbstractImageProducer.gameId == -2) {
          Parameter
              .method582(TextureCache.localPlayer.waypointsY[0], 0, 1, false,
                  0,
                  var0 + -2595, var2, 1, 0, 2, var3,
                  TextureCache.localPlayer.waypointsX[0]);
        } else {
          var14 = Parameter
              .method582(TextureCache.localPlayer.waypointsY[0], 0, 0, false,
                  0,
                  var0 + -2595, var2, 0, 0, 2, var3,
                  TextureCache.localPlayer.waypointsX[0]);
          if (!var14) {
            Parameter.method582(TextureCache.localPlayer.waypointsY[0], 0, 1,
                false, 0,
                var0 + -2595, var2, 1, 0, 2, var3,
                TextureCache.localPlayer.waypointsX[0]);
          }
        }

        HuffmanEncoder.anInt638 = 2;
        SceneSomething2.anInt1053 = DummyClass5.anInt2993;
        FileRequester.anInt2958 = 0;
        FileCacheRequest.anInt4062 = DummyClass36.anInt2614;
        TextureSampler12.secureBuffer.writePacket(228);
        ++DummyClass10.anInt2085;
        TextureSampler12.secureBuffer.writeShort(var5);
        TextureSampler12.secureBuffer
            .writeShortLE(var0 ^ -2598, WorldMapLabel.anInt1716 + var2);
        TextureSampler12.secureBuffer
            .method765(ProceduralTexture.anInt1152 + var3, (byte) 3);
      }

      if (var4 == 4) {
        var11 = TextureSampler5.npcs[var5];
        if (var11 != null) {
          Parameter
              .method582(TextureCache.localPlayer.waypointsY[0], 0, 1, false,
                  0, 2,
                  var11.waypointsX[0], 1, 0, 2, var11.waypointsY[0],
                  TextureCache.localPlayer.waypointsX[0]);
          HuffmanEncoder.anInt638 = 2;
          FileRequester.anInt2958 = 0;
          FileCacheRequest.anInt4062 = DummyClass36.anInt2614;
          SceneSomething2.anInt1053 = DummyClass5.anInt2993;
          ++TextureSampler37.anInt3259;
          TextureSampler12.secureBuffer.writePacket(148);
          TextureSampler12.secureBuffer.method783(var5, var0 + -268438053);
        }
      }

      if (var4 == 32) {
        var13 = AbstractDirectColorSprite.method638((byte) -19, var3, var2);
        if (var13 != null) {
          SceneSomething.method958((byte) -126);
          WidgetAccess var16 = GameClient.method44(var13);
          Unsure
              .method2074(var3, var2, var16.method101(-120), var16.anInt2202,
                  var13.anInt266,
                  -120, var13.anInt238);
          Something3d.anInt3012 = 0;
          Parameter.aClass94_3621 = DummyClass41
              .method1174(var13, (byte) -94);
          if (Parameter.aClass94_3621 == null) {
            Parameter.aClass94_3621 = Keyboard.aClass94_1915;
          }

          if (var13.aBoolean233) {
            DummyClass59.aClass94_676 = RenderAnimation.concat(
                new GameString[]{var13.aClass94_277,
                    MonoChromaticImageBuffer.aClass94_2562});
          } else {
            DummyClass59.aClass94_676 = RenderAnimation
                .concat(new GameString[]{
                    SomethingSceneI.aClass94_431, var13.aClass94_243,
                    MonoChromaticImageBuffer.aClass94_2562
                });
          }
        }

      } else {
        if (var4 == 29) {
          var8 = TextureSampler0.players[var5];
          if (var8 != null) {
            ++Keyboard.anInt1910;
            Parameter.method582(TextureCache.localPlayer.waypointsY[0], 0, 1,
                false, 0, 2,
                var8.waypointsX[0], 1, 0, 2, var8.waypointsY[0],
                TextureCache.localPlayer.waypointsX[0]);
            FileCacheRequest.anInt4062 = DummyClass36.anInt2614;
            FileRequester.anInt2958 = 0;
            HuffmanEncoder.anInt638 = 2;
            SceneSomething2.anInt1053 = DummyClass5.anInt2993;
            TextureSampler12.secureBuffer.writePacket(180);
            TextureSampler12.secureBuffer.method765(var5, (byte) 3);
          }
        }

        if (var4 == 35) {
          TextureSampler12.secureBuffer.writePacket(161);
          TextureSampler12.secureBuffer.method785(var3, (byte) -119);
          TextureSampler12.secureBuffer.method765(var5, (byte) 3);
          TextureSampler12.secureBuffer.method765(var2, (byte) 3);
          ++TextureSampler8.anInt3459;
          AreaSoundEffect.anInt2330 = 0;
          AbstractFileRequester.aClass11_1933 = EnumStringFetcher
              .getWidget((byte) 124, var3);
          Keyboard.anInt1918 = var2;
        }

        if (var4 == 15) {
          var8 = TextureSampler0.players[var5];
          if (var8 != null) {
            Parameter.method582(TextureCache.localPlayer.waypointsY[0], 0, 1,
                false, 0, 2,
                var8.waypointsX[0], 1, 0, 2, var8.waypointsY[0],
                TextureCache.localPlayer.waypointsX[0]);
            FileRequester.anInt2958 = 0;
            HuffmanEncoder.anInt638 = 2;
            SceneSomething2.anInt1053 = DummyClass5.anInt2993;
            FileCacheRequest.anInt4062 = DummyClass36.anInt2614;
            TextureSampler12.secureBuffer.writePacket(195);
            ++StillGraphicNode.anInt3542;
            TextureSampler12.secureBuffer
                .method783(Widget.anInt278, -268435456);
            TextureSampler12.secureBuffer
                .method785(ScriptState.anInt872, (byte) -124);
            TextureSampler12.secureBuffer.method765(var5, (byte) 3);
          }
        }

        if (var4 == 34) {
          if (AbstractImageProducer.gameId == 1) {
            Parameter.method582(TextureCache.localPlayer.waypointsY[0], 0, 1,
                false, 0, 2, var2,
                1, 0, 2, var3, TextureCache.localPlayer.waypointsX[0]);
          } else {
            var14 = Parameter
                .method582(TextureCache.localPlayer.waypointsY[0], 0, 0,
                    false, 0,
                    var0 ^ 2599, var2, 0, 0, 2, var3,
                    TextureCache.localPlayer.waypointsX[0]);
            if (!var14) {
              Parameter
                  .method582(TextureCache.localPlayer.waypointsY[0], 0, 1,
                      false, 0, 2, var2,
                      1, 0, 2, var3, TextureCache.localPlayer.waypointsX[0]);
            }
          }

          SceneSomething2.anInt1053 = DummyClass5.anInt2993;
          HuffmanEncoder.anInt638 = 2;
          ++TextureSampler0.anInt3277;
          FileCacheRequest.anInt4062 = DummyClass36.anInt2614;
          FileRequester.anInt2958 = 0;
          TextureSampler12.secureBuffer.writePacket(109);
          TextureSampler12.secureBuffer
              .writeShortLE(-1, var3 - -ProceduralTexture.anInt1152);
          TextureSampler12.secureBuffer
              .writeShort(var2 + WorldMapLabel.anInt1716);
          TextureSampler12.secureBuffer.method765(var5, (byte) 3);
        }

        if (~var4 == -26) {
          ++DummyClass1.anInt411;
          TextureSampler12.secureBuffer.writePacket(81);
          TextureSampler12.secureBuffer.method783(var2, -268435456);
          TextureSampler12.secureBuffer.writeShort(var5);
          TextureSampler12.secureBuffer.method775(var3, 1437452424);
          AreaSoundEffect.anInt2330 = 0;
          AbstractFileRequester.aClass11_1933 = EnumStringFetcher
              .getWidget((byte) 126, var3);
          Keyboard.anInt1918 = var2;
        }

        if (~var4 == -3) {
          var11 = TextureSampler5.npcs[var5];
          if (var11 != null) {
            Parameter.method582(TextureCache.localPlayer.waypointsY[0], 0, 1,
                false, 0,
                var0 + -2595, var11.waypointsX[0], 1, 0, 2,
                var11.waypointsY[0],
                TextureCache.localPlayer.waypointsX[0]);
            FileCacheRequest.anInt4062 = DummyClass36.anInt2614;
            HuffmanEncoder.anInt638 = 2;
            SceneSomething2.anInt1053 = DummyClass5.anInt2993;
            ++WidgetAccess.anInt2204;
            FileRequester.anInt2958 = 0;
            TextureSampler12.secureBuffer.writePacket(218);
            TextureSampler12.secureBuffer.writeShortLE(-1, var5);
          }
        }

        int var12;
        if (~var4 == -52) {
          TextureSampler12.secureBuffer.writePacket(10);
          ++ClientScript.anInt3681;
          TextureSampler12.secureBuffer.writeInt(var3);
          var13 = EnumStringFetcher.getWidget((byte) 117, var3);
          assert var13 != null;
          if (var13.anIntArrayArray298 != null
              && ~var13.anIntArrayArray298[0][0] == -6) {
            var12 = var13.anIntArrayArray298[0][1];
            if (DummyClass5.anIntArray2985[var12] != var13.anIntArray307[0]) {
              DummyClass5.anIntArray2985[var12] = var13.anIntArray307[0];
              DummyClass39.method1087(98, var12);
            }
          }
        }

        if (~var4 == -27) {
          var11 = TextureSampler5.npcs[var5];
          if (var11 != null) {
            ++TextureSampler10.anInt3439;
            Parameter.method582(TextureCache.localPlayer.waypointsY[0], 0, 1,
                false, 0, 2,
                var11.waypointsX[0], 1, 0, 2, var11.waypointsY[0],
                TextureCache.localPlayer.waypointsX[0]);
            HuffmanEncoder.anInt638 = 2;
            FileRequester.anInt2958 = 0;
            FileCacheRequest.anInt4062 = DummyClass36.anInt2614;
            SceneSomething2.anInt1053 = DummyClass5.anInt2993;
            TextureSampler12.secureBuffer.writePacket(115);
            TextureSampler12.secureBuffer
                .method759(var0 ^ -2667, GlTexture2d.anInt3764);
            TextureSampler12.secureBuffer
                .writeShortLE(-1, DummyClass31.anInt1473);
            TextureSampler12.secureBuffer.writeShortLE(var0 ^ -2598, var5);
            TextureSampler12.secureBuffer
                .method765(Something3dRoot.anInt2050, (byte) 3);
          }
        }

        if (var4 == 59) {
          TextureSampler12.secureBuffer.writePacket(10);
          ++ClientScript.anInt3681;
          TextureSampler12.secureBuffer.writeInt(var3);
          var13 = EnumStringFetcher.getWidget((byte) 122, var3);
          assert var13 != null;
          if (var13.anIntArrayArray298 != null
              && ~var13.anIntArrayArray298[0][0] == -6) {
            var12 = var13.anIntArrayArray298[0][1];
            DummyClass5.anIntArray2985[var12] =
                -DummyClass5.anIntArray2985[var12] + 1;
            DummyClass39.method1087(68, var12);
          }
        }

        if (~var4 == -34) {
          var14 =
              Parameter
                  .method582(TextureCache.localPlayer.waypointsY[0], 0, 0,
                      false, 0, 2, var2,
                      0, 0, 2, var3, TextureCache.localPlayer.waypointsX[0]);
          ++Deque.anInt938;
          if (!var14) {
            Parameter.method582(TextureCache.localPlayer.waypointsY[0], 0, 1,
                false, 0,
                var0 + -2595, var2, 1, 0, 2, var3,
                TextureCache.localPlayer.waypointsX[0]);
          }

          SceneSomething2.anInt1053 = DummyClass5.anInt2993;
          FileRequester.anInt2958 = 0;
          FileCacheRequest.anInt4062 = DummyClass36.anInt2614;
          HuffmanEncoder.anInt638 = 2;
          TextureSampler12.secureBuffer.writePacket(101);
          TextureSampler12.secureBuffer
              .method765(var2 - -WorldMapLabel.anInt1716, (byte) 3);
          TextureSampler12.secureBuffer
              .writeShortLE(var0 ^ -2598, DummyClass31.anInt1473);
          TextureSampler12.secureBuffer
              .writeShortLE(-1, Something3dRoot.anInt2050);
          TextureSampler12.secureBuffer.writeShortLE(-1, var5);
          TextureSampler12.secureBuffer
              .method765(ProceduralTexture.anInt1152 + var3, (byte) 3);
          TextureSampler12.secureBuffer
              .method759(-118, GlTexture2d.anInt3764);
        }

        if (~var4 == -1005) {
          FileRequester.anInt2958 = 0;
          SceneSomething2.anInt1053 = DummyClass5.anInt2993;
          HuffmanEncoder.anInt638 = 2;
          FileCacheRequest.anInt4062 = DummyClass36.anInt2614;
          TextureSampler12.secureBuffer.writePacket(94);
          ++Mobile.anInt2770;
          TextureSampler12.secureBuffer.method765(var5, (byte) 3);
        }

        if (var4 == 11) {
          if (~var5 == -1) {
            ClientScriptCall.anInt2440 = 1;
            AbstractFileRequest
                .method589(GameWorldSomething.currentPlane, var2, var3);
          } else {
            if (var5 == 1) {
              TextureSampler12.secureBuffer.writePacket(131);
              ++OndemandRequester.anInt994;
              TextureSampler12.secureBuffer
                  .method759(-57, ScriptState.anInt872);
              TextureSampler12.secureBuffer
                  .method783(WorldMapLabel.anInt1716 + var2,
                      var0 + -268438053);
              TextureSampler12.secureBuffer
                  .method765(Widget.anInt278, (byte) 3);
              TextureSampler12.secureBuffer
                  .method783(var3 + ProceduralTexture.anInt1152,
                      -268435456);
            }
          }
        }

        if (var4 == 8) {
          var13 = EnumStringFetcher.getWidget((byte) 109, var3);
          boolean var15 = true;
          assert var13 != null;
          if (var13.anInt189 > 0) {
            var15 = ProjectileNode.method715(205, var13);
          }

          if (var15) {
            ++ClientScript.anInt3681;
            TextureSampler12.secureBuffer.writePacket(10);
            TextureSampler12.secureBuffer.writeInt(var3);
          }
        }

        if (~var4 == -2) {
          var8 = TextureSampler0.players[var5];
          if (var8 != null) {
            ++ISAACCipher.anInt969;
            Parameter.method582(TextureCache.localPlayer.waypointsY[0], 0, 1,
                false, 0, 2,
                var8.waypointsX[0], 1, 0, 2, var8.waypointsY[0],
                TextureCache.localPlayer.waypointsX[0]);
            FileRequester.anInt2958 = 0;
            FileCacheRequest.anInt4062 = DummyClass36.anInt2614;
            HuffmanEncoder.anInt638 = 2;
            SceneSomething2.anInt1053 = DummyClass5.anInt2993;
            TextureSampler12.secureBuffer.writePacket(248);
            TextureSampler12.secureBuffer.method765(var5, (byte) 3);
            TextureSampler12.secureBuffer
                .writeShort(Something3dRoot.anInt2050);
            TextureSampler12.secureBuffer.writeShort(DummyClass31.anInt1473);
            TextureSampler12.secureBuffer
                .method759(-110, GlTexture2d.anInt3764);
          }
        }

        if (var4 == 7) {
          TextureSampler12.secureBuffer.writePacket(85);
          ++TextureSampler24.anInt3144;
          TextureSampler12.secureBuffer.method775(var3, 1437452424);
          TextureSampler12.secureBuffer.writeShort(var2);
          TextureSampler12.secureBuffer.method783(var5, -268435456);
          AreaSoundEffect.anInt2330 = 0;
          AbstractFileRequester.aClass11_1933 = EnumStringFetcher
              .getWidget((byte) 125, var3);
          Keyboard.anInt1918 = var2;
        }

        if (~var4 == -25) {
          if (~AbstractImageProducer.gameId == -2) {
            Parameter.method582(TextureCache.localPlayer.waypointsY[0], 0, 1,
                false, 0,
                var0 + -2595, var2, 1, 0, 2, var3,
                TextureCache.localPlayer.waypointsX[0]);
          } else {
            var14 =
                Parameter
                    .method582(TextureCache.localPlayer.waypointsY[0], 0, 0,
                        false, 0, 2, var2,
                        0, 0, 2, var3,
                        TextureCache.localPlayer.waypointsX[0]);
            if (!var14) {
              Parameter
                  .method582(TextureCache.localPlayer.waypointsY[0], 0, 1,
                      false, 0, 2, var2,
                      1, 0, 2, var3, TextureCache.localPlayer.waypointsX[0]);
            }
          }

          HuffmanEncoder.anInt638 = 2;
          ++SceneSomething2.anInt1060;
          FileCacheRequest.anInt4062 = DummyClass36.anInt2614;
          SceneSomething2.anInt1053 = DummyClass5.anInt2993;
          FileRequester.anInt2958 = 0;
          TextureSampler12.secureBuffer.writePacket(48);
          TextureSampler12.secureBuffer
              .method783(var2 - -WorldMapLabel.anInt1716, -268435456);
          TextureSampler12.secureBuffer.method765(var5, (byte) 3);
          TextureSampler12.secureBuffer
              .writeShortLE(-1, ProceduralTexture.anInt1152 + var3);
        }

        if (var4 == 38 && DummyClass8
            .method2224((byte) 39, var6, var3, var2)) {
          TextureSampler12.secureBuffer.writePacket(233);
          TextureSampler12.secureBuffer
              .method765(var3 + ProceduralTexture.anInt1152, (byte) 3);
          ++Something3d.anInt3017;
          TextureSampler12.secureBuffer
              .method783(WorldMapLabel.anInt1716 + var2, -268435456);
          TextureSampler12.secureBuffer.method765(Widget.anInt278, (byte) 3);
          TextureSampler12.secureBuffer
              .method775(ScriptState.anInt872, 1437452424);
          TextureSampler12.secureBuffer
              .method783((int) (var6 >>> 32) & Integer.MAX_VALUE,
                  var0 ^ -268432859);
        }

        if (~var4 == -14) {
          TextureSampler12.secureBuffer.writePacket(6);
          TextureSampler12.secureBuffer.writeInt(var3);
          TextureSampler12.secureBuffer.method783(var2, -268435456);
          ++FloorOverlay.anInt2088;
          TextureSampler12.secureBuffer.writeShortLE(-1, var5);
          AreaSoundEffect.anInt2330 = 0;
          AbstractFileRequester.aClass11_1933 = EnumStringFetcher
              .getWidget((byte) 115, var3);
          Keyboard.anInt1918 = var2;
        }

        if (var4 == 57) {
          var8 = TextureSampler0.players[var5];
          if (var8 != null) {
            Parameter.method582(TextureCache.localPlayer.waypointsY[0], 0, 1,
                false, 0, 2,
                var8.waypointsX[0], 1, 0, 2, var8.waypointsY[0],
                TextureCache.localPlayer.waypointsX[0]);
            HuffmanEncoder.anInt638 = 2;
            FileCacheRequest.anInt4062 = DummyClass36.anInt2614;
            ++FileCache.anInt685;
            SceneSomething2.anInt1053 = DummyClass5.anInt2993;
            FileRequester.anInt2958 = 0;
            TextureSampler12.secureBuffer.writePacket(175);
            TextureSampler12.secureBuffer.method783(var5, -268435456);
          }
        }

        if (var4 == 22) {
          SceneSomething.method958((byte) -86);
          var13 = EnumStringFetcher.getWidget((byte) 123, var3);
          GlTexture2d.anInt3764 = var3;
          DummyClass31.anInt1473 = var2;
          Something3d.anInt3012 = 1;
          Something3dRoot.anInt2050 = var5;
          DummyClass29.method909(var0 ^ -2612, var13);
          RenderAnimation.aClass94_378 = RenderAnimation
              .concat(new GameString[]{
                  TextureSampler6.aClass94_3042,
                  DummyClass35.getItemConfig(var5, (byte) 109).aClass94_770,
                  MonoChromaticImageBuffer.aClass94_2562
              });

        } else {
          if (~var4 == -51) {
            ++AnimationSequence.anInt1858;
            DummyClass8.method2224((byte) 39, var6, var3, var2);
            TextureSampler12.secureBuffer.writePacket(194);
            TextureSampler12.secureBuffer
                .method765(var3 + ProceduralTexture.anInt1152, (byte) 3);
            TextureSampler12.secureBuffer
                .writeShortLE(-1, WorldMapLabel.anInt1716 + var2);
            TextureSampler12.secureBuffer
                .writeShort((int) (var6 >>> 32) & Integer.MAX_VALUE);
          }

          if (~var4 == -49) {
            ++SomethingTilek.anInt1677;
            TextureSampler12.secureBuffer.writePacket(154);
            TextureSampler12.secureBuffer.writeShortLE(-1, var2);
            TextureSampler12.secureBuffer.method775(var3, 1437452424);
            TextureSampler12.secureBuffer.method765(var5, (byte) 3);
            AreaSoundEffect.anInt2330 = 0;
            AbstractFileRequester.aClass11_1933 = EnumStringFetcher
                .getWidget((byte) 119, var3);
            Keyboard.anInt1918 = var2;
          }

          if (~var4 == -31) {
            var8 = TextureSampler0.players[var5];
            if (var8 != null) {
              ++ItemConfig.anInt759;
              Parameter
                  .method582(TextureCache.localPlayer.waypointsY[0], 0, 1,
                      false, 0, 2,
                      var8.waypointsX[0], 1, 0, 2, var8.waypointsY[0],
                      TextureCache.localPlayer.waypointsX[0]);
              FileRequester.anInt2958 = 0;
              SceneSomething2.anInt1053 = DummyClass5.anInt2993;
              FileCacheRequest.anInt4062 = DummyClass36.anInt2614;
              HuffmanEncoder.anInt638 = 2;
              TextureSampler12.secureBuffer.writePacket(68);
              TextureSampler12.secureBuffer.method765(var5, (byte) 3);
            }
          }

          if (var4 == 43) {
            ++TextureSampler10.anInt3442;
            TextureSampler12.secureBuffer.writePacket(153);
            TextureSampler12.secureBuffer.method785(var3, (byte) -124);
            TextureSampler12.secureBuffer.writeShortLE(-1, var2);
            TextureSampler12.secureBuffer.writeShortLE(var0 + -2598, var5);
            AreaSoundEffect.anInt2330 = 0;
            AbstractFileRequester.aClass11_1933 = EnumStringFetcher
                .getWidget((byte) 112, var3);
            Keyboard.anInt1918 = var2;
          }

          if (~var4 == -40) {
            ++BufferObject.anInt1883;
            var14 =
                Parameter
                    .method582(TextureCache.localPlayer.waypointsY[0], 0, 0,
                        false, 0, 2, var2,
                        0, 0, 2, var3,
                        TextureCache.localPlayer.waypointsX[0]);
            if (!var14) {
              Parameter
                  .method582(TextureCache.localPlayer.waypointsY[0], 0, 1,
                      false, 0, 2, var2,
                      1, 0, 2, var3, TextureCache.localPlayer.waypointsX[0]);
            }

            FileCacheRequest.anInt4062 = DummyClass36.anInt2614;
            SceneSomething2.anInt1053 = DummyClass5.anInt2993;
            HuffmanEncoder.anInt638 = 2;
            FileRequester.anInt2958 = 0;
            TextureSampler12.secureBuffer.writePacket(73);
            TextureSampler12.secureBuffer
                .method775(ScriptState.anInt872, 1437452424);
            TextureSampler12.secureBuffer
                .writeShort(ProceduralTexture.anInt1152 + var3);
            TextureSampler12.secureBuffer.method765(var5, (byte) 3);
            TextureSampler12.secureBuffer
                .method765(var2 + WorldMapLabel.anInt1716, (byte) 3);
            TextureSampler12.secureBuffer.writeShortLE(-1, Widget.anInt278);
          }

          if (var0 == 2597) {
            if (~var4 == -13) {
              ++DummyClass18.anInt79;
              TextureSampler12.secureBuffer.writePacket(82);
              TextureSampler12.secureBuffer.writeShort(Widget.anInt278);
              TextureSampler12.secureBuffer
                  .method775(var3, 2597 ^ 1437450925);
              TextureSampler12.secureBuffer.writeInt(ScriptState.anInt872);
              TextureSampler12.secureBuffer.method765(var2, (byte) 3);
            }

            if (var4 == 36) {
              if (~var5 == -1) {
                GameObjectConfig.anInt1521 = 1;
                AbstractFileRequest
                    .method589(GameWorldSomething.currentPlane, var2, var3);
              } else {
                if (~TextureSampler35.rights < -1
                    && GameObjectConfig.aBooleanArray1490[82]
                    && GameObjectConfig.aBooleanArray1490[81]) {
                  BufferedFile.method979(var2 + WorldMapLabel.anInt1716,
                      ProceduralTexture.anInt1152 - -var3,
                      GameWorldSomething.currentPlane,
                      (byte) -4);
                } else {
                  ++ClanChatUser.anInt2479;
                  TextureSampler12.secureBuffer.writePacket(179);
                  TextureSampler12.secureBuffer
                      .writeShort(var3 + ProceduralTexture.anInt1152);
                  TextureSampler12.secureBuffer
                      .writeShort(var2 + WorldMapLabel.anInt1716);
                }
              }
            }

            if (var4 == 6) {
              var8 = TextureSampler0.players[var5];
              if (var8 != null) {
                Parameter
                    .method582(TextureCache.localPlayer.waypointsY[0], 0, 1,
                        false, 0, 2,
                        var8.waypointsX[0], 1, 0, 2, var8.waypointsY[0],
                        TextureCache.localPlayer.waypointsX[0]);
                FileCacheRequest.anInt4062 = DummyClass36.anInt2614;
                ++Structure.anInt3640;
                FileRequester.anInt2958 = 0;
                HuffmanEncoder.anInt638 = 2;
                SceneSomething2.anInt1053 = DummyClass5.anInt2993;
                TextureSampler12.secureBuffer.writePacket(106);
                TextureSampler12.secureBuffer.writeShort(var5);
              }
            }

            if (var4 == 20) {
              ++SomethingTexture1.anInt2640;
              if (AbstractImageProducer.gameId == 1) {
                Parameter
                    .method582(TextureCache.localPlayer.waypointsY[0], 0, 1,
                        false, 0, 2,
                        var2, 1, 0, 2, var3,
                        TextureCache.localPlayer.waypointsX[0]);
              } else {
                var14 =
                    Parameter
                        .method582(TextureCache.localPlayer.waypointsY[0], 0,
                            0, false, 0, 2,
                            var2, 0, 0, 2, var3,
                            TextureCache.localPlayer.waypointsX[0]);
                if (!var14) {
                  Parameter
                      .method582(TextureCache.localPlayer.waypointsY[0], 0, 1,
                          false, 0, 2,
                          var2, 1, 0, 2, var3,
                          TextureCache.localPlayer.waypointsX[0]);
                }
              }

              FileCacheRequest.anInt4062 = DummyClass36.anInt2614;
              FileRequester.anInt2958 = 0;
              SceneSomething2.anInt1053 = DummyClass5.anInt2993;
              HuffmanEncoder.anInt638 = 2;
              TextureSampler12.secureBuffer.writePacket(33);
              TextureSampler12.secureBuffer.writeShort(var5);
              TextureSampler12.secureBuffer
                  .writeShort(WorldMapLabel.anInt1716 + var2);
              TextureSampler12.secureBuffer
                  .writeShortLE(-1, ProceduralTexture.anInt1152 + var3);
            }

            if (var4 == 16) {
              var11 = TextureSampler5.npcs[var5];
              if (var11 != null) {
                ++GroundItemNode.anInt3677;
                Parameter
                    .method582(TextureCache.localPlayer.waypointsY[0], 0, 1,
                        false, 0, 2,
                        var11.waypointsX[0], 1, 0, 2, var11.waypointsY[0],
                        TextureCache.localPlayer.waypointsX[0]);
                SceneSomething2.anInt1053 = DummyClass5.anInt2993;
                FileRequester.anInt2958 = 0;
                FileCacheRequest.anInt4062 = DummyClass36.anInt2614;
                HuffmanEncoder.anInt638 = 2;
                TextureSampler12.secureBuffer.writePacket(3);
                TextureSampler12.secureBuffer.method765(var5, (byte) 3);
              }
            }

            if (~Something3d.anInt3012 != -1) {
              Something3d.anInt3012 = 0;
              DummyClass29.method909(120,
                  EnumStringFetcher
                      .getWidget((byte) 121, GlTexture2d.anInt3764));
            }

            if (SceneNode.aBoolean1837) {
              SceneSomething.method958((byte) -36);
            }

            if (AbstractFileRequester.aClass11_1933 != null
                && ~AreaSoundEffect.anInt2330 == -1) {
              DummyClass29
                  .method909(-106, AbstractFileRequester.aClass11_1933);
            }

          }
        }
      }
    }
  }

  public static void method808(int var0) {
    GameBuffer.MAP_PREFIX = null;
    if (var0 != 1) {
      GameBuffer.anIntArray3804 = null;
    }

    GameBuffer.anIntArray3805 = null;
    GameBuffer.anIntArray3804 = null;
    GameBuffer.titlePrefixes = null;
  }

  public static int method809(int var0, int y, int var2, int x, int var4) {
    if (TextureSampler14.aBoolean3387) {
      var0 = 1000000;
      TextureSampler14.aBoolean3387 = false;
    }

    BlockConfig config = DummyClass27.blockConfigs[x][y];
    float var7 = (var2 * 0.1F + 0.7F) * config.aFloat1187;
    float var8 = config.aFloat1190;
    int var6 = config.anInt1177;
    int var11 = config.anInt1184;
    int var10 = config.anInt1175;
    if (!DummyClass35.aBoolean661) {
      var11 = 0;
    }

    float var9 = config.aFloat1189;
    if (var6 != DummyClass44.anInt932 || AnimationFrame.aFloat2457 != var7
        || TextureSampler6.aFloat3044 != var8 || var9 != Widget.aFloat246
        || HintMarker.anInt1345 != var10 || DummyClass22.anInt1736 != var11) {
      AnimationFrame.aFloat2457 = var7;
      TextureSampler36.aFloat3435 = TextureSampler36.diffuseIntensity;
      TextureSampler9.aFloat3105 = BufferedFile.ambientIntensity;
      DummyClass44.anInt932 = var6;
      AbstractAudioOutputStream.anInt1971 = InventoryConfig.fogColor;
      FloorUnderlay.anInt1407 = FileCache.fogOffset;
      Widget.aFloat246 = var9;
      Node.anInt72 = 0;
      TextureSampler18.anInt4037 = FileUnpacker.sunColor;
      DummyClass22.anInt1736 = var11;
      TextureSampler6.aFloat3044 = var8;
      HintMarker.anInt1345 = var10;
      DummyClass31.aFloat1475 = SomethingSceneJ.aFloat319;
    }

    if (Node.anInt72 < 65536) {
      Node.anInt72 += 250 * var0;
      if (~Node.anInt72 <= -65537) {
        Node.anInt72 = 65536;
      }

      float var15 = Node.anInt72 / 65536.0F;
      int var13 = Node.anInt72 >> 8;
      int var12 = -Node.anInt72 + 65536 >> 8;
      InventoryConfig.fogColor =
          (-16711936 & var13 * (HintMarker.anInt1345 & 16711935)
              + (16711935 & AbstractAudioOutputStream.anInt1971) * var12) + (
              16711680
                  & var12 * (AbstractAudioOutputStream.anInt1971 & '\uff00')
                  + ('\uff00' & HintMarker.anInt1345) * var13) >> 8;
      float var14 = (65536 - Node.anInt72) / 65536.0F;
      BufferedFile.ambientIntensity =
          var14 * TextureSampler9.aFloat3105
              + var15 * AnimationFrame.aFloat2457;
      TextureSampler36.diffuseIntensity =
          TextureSampler36.aFloat3435 * var14
              + var15 * TextureSampler6.aFloat3044;
      SomethingSceneJ.aFloat319 =
          var15 * Widget.aFloat246 + var14 * DummyClass31.aFloat1475;
      FileUnpacker.sunColor =
          (16711680 & (DummyClass44.anInt932 & '\uff00') * var13 + var12 * (
              TextureSampler18.anInt4037 & '\uff00')) + (
              (16711935 & TextureSampler18.anInt4037) * var12 - -(
                  (DummyClass44.anInt932 & 16711935)
                      * var13) & -16711936) >> 8;
      FileCache.fogOffset =
          var13 * DummyClass22.anInt1736 + var12 * FloorUnderlay.anInt1407
              >> 8;
    }

    GlEnvironment
        .setSunColor(FileUnpacker.sunColor, BufferedFile.ambientIntensity,
            TextureSampler36.diffuseIntensity, SomethingSceneJ.aFloat319);
    GlEnvironment.setFogColor(InventoryConfig.fogColor, FileCache.fogOffset);
    GlEnvironment.setSunPosition(DummyClass39.sunPositionX,
        TextureSampler0.sunPositionY, BlockConfig.sunPositionZ);
    GlEnvironment.updateSunPosition();
    return InventoryConfig.fogColor;
  }

  public static int method810(byte var0, int var1) {
    return var0 != 3 ? 74 : 255 & var1;
  }

  public static void method813(int var0) {
    SomethingQuickChat.aClass93_3572.method1523((byte) -127);
    if (var0 == 1974) {
      DummyClass15.aClass93_1874.method1523((byte) -113);
      MouseRecorder.aClass93_1013.method1523((byte) -108);
    }
  }

  public static void method819(boolean var0) {
    SomethingPacket151 var1 = (SomethingPacket151) TextureSampler23.aClass130_3208
        .getFirst(73);
    if (!var0) {
      for (; var1 != null;
          var1 = (SomethingPacket151) TextureSampler23.aClass130_3208
              .getNext(-76)) {
        int var2 = var1.anInt2602;
        if (MovedStatics0.method57(var2, 104)) {
          boolean var3 = true;
          Widget[] var4 = SceneNode.aClass11ArrayArray1834[var2];

          int var5;
          for (var5 = 0; var4.length > var5; ++var5) {
            if (var4[var5] != null) {
              var3 = var4[var5].aBoolean233;
              break;
            }
          }

          if (!var3) {
            var5 = (int) var1.key;
            Widget var6 = EnumStringFetcher.getWidget((byte) 123, var5);
            if (var6 != null) {
              DummyClass29.method909(117, var6);
            }
          }
        }
      }

    }
  }

}
