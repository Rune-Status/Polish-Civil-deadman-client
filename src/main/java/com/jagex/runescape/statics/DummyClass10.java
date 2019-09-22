package com.jagex.runescape.statics;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.model.Inventory;
import com.jagex.runescape.model.NPC;
import com.jagex.runescape.model.SomethingLight0;
import com.jagex.runescape.opengl.GLStatics;
import com.jagex.runescape.settings.SettingsStatics;

public final class DummyClass10 {

  public static GameString aClass94_2082 = GameStringStatics
      .create(" <col=ffff00>");
  public static GameString aClass94_2083;
  public static GameString UL_PREFIX = GameStringStatics.create("ul");
  public static int anInt2085;
  public static GameString aClass94_2086 = GameStringStatics
      .create("Continuer");
  public static int anInt2087;

  public static void method2261(int var0) {
    while (true) {
      if (GlobalStatics_9.GAME_BUFFER
          .method815(GlobalStatics_0.packetLength, 32666) >= 27) {
        int var1 = GlobalStatics_9.GAME_BUFFER.readBits(15);
        if (var1 != 32767) {
          boolean var2 = false;
          if (GlobalStatics_8.NPCS[var1] == null) {
            var2 = true;
            GlobalStatics_8.NPCS[var1] = new NPC();
          }

          NPC var3 = GlobalStatics_8.NPCS[var1];
          GlobalStatics_2.anIntArray347[DummyClass6.anInt2046++] = var1;
          var3.anInt2838 = GlobalStatics_4.updateCycle;
          if (var3.config != null && var3.config.method1474(-1)) {
            GlobalStatics_6.method574(var3, false);
          }

          int var4 = GlobalStatics_9.GAME_BUFFER.readBits(1);
          int var5 = DummyClass32.anIntArray510[GlobalStatics_9.GAME_BUFFER
              .readBits(3)];
          if (var2) {
            var3.anInt2806 = var3.rotationY = var5;
          }

          int var6 = GlobalStatics_9.GAME_BUFFER.readBits(1);
          if (var6 == 1) {
            DummyClass60.anIntArray441[GlobalStatics_9.anInt997++] = var1;
          }

          int var7 = GlobalStatics_9.GAME_BUFFER.readBits(5);
          var3.setConfiguration(-1,
              GlobalStatics_2.getNpcConfiguration(
                  GlobalStatics_9.GAME_BUFFER.readBits(14)));
          if (var7 > 15) {
            var7 -= 32;
          }

          int var8 = GlobalStatics_9.GAME_BUFFER.readBits(5);
          if (var8 > 15) {
            var8 -= 32;
          }

          var3.method1976(var3.config.size, 2);
          var3.renderAnimationId = var3.config.renderAnimationId;
          var3.anInt2779 = var3.config.anInt1274;
          if (var3.anInt2779 == 0) {
            var3.rotationY = 0;
          }

          var3.setPosition(var3.getSize(),
              GlobalStatics_9.localPlayer.waypointsX[0] + var8,
              var7 + GlobalStatics_9.localPlayer.waypointsY[0], var4 == 1);
          if (var3.config.method1474(-1)) {
            GlobalStatics_9.method1286(var3.waypointsY[0], false, null, 0, var3,
                var3.waypointsX[0], GlobalStatics_9.currentPlane, null);
          }
          continue;
        }
      }

      GlobalStatics_9.GAME_BUFFER.method818(false);
      if (var0 <= 0) {
        DummyClass10.method2265(-16);
      }

      return;
    }
  }

  public static void clear61(byte var0) {
    DummyClass10.aClass94_2083 = null;
    if (var0 > 0) {
      DummyClass10.aClass94_2086 = null;
      DummyClass10.aClass94_2082 = null;
      DummyClass10.UL_PREFIX = null;
    }
  }

  public static void method2263(int var0, int var1, int var2, int var3,
      int var4, int var5,
      int var6) {
    SomethingLight0 var7 = new SomethingLight0();
    var7.anInt1553 = var1 / 128;
    var7.anInt1547 = var2 / 128;
    var7.anInt1563 = var3 / 128;
    var7.anInt1566 = var4 / 128;
    var7.anInt1554 = var0;
    var7.anInt1562 = var1;
    var7.anInt1545 = var2;
    var7.anInt1560 = var3;
    var7.anInt1550 = var4;
    var7.anInt1544 = var5;
    var7.anInt1548 = var6;
    GlobalStatics_6.aClass113Array3610[GlobalStatics_9.anInt2249++] = var7;
  }

  public static void method2264(boolean var0) {
    if (var0) {
      GLStatics.sceneGraphTiles = GlobalStatics_9.aClass3_Sub2ArrayArrayArray2065;
      GlobalStatics_4.heightMap = GlobalStatics_2.othrrHeightMap;
      GLStatics.aClass3_Sub11ArrayArray2542 =
          GlobalStatics_10.aClass3_Sub11ArrayArray3346;
    } else {
      GLStatics.sceneGraphTiles = GlobalStatics_9.tiles;
      GlobalStatics_4.heightMap = DummyClass43.somethingHeightMap;
      GLStatics.aClass3_Sub11ArrayArray2542 = GLStatics.aClass3_Sub11ArrayArray2199;
    }
    GLStatics.anInt2456 = GLStatics.sceneGraphTiles.length;
  }

  public static void method2265(int var0) {
    GlobalStatics_7.aClass93_2442.method1524(3);
    if (var0 != 0) {
      DummyClass10.UL_PREFIX = null;
    }
  }

  public static void method2266(int var0, int var1, byte var2) {
    if (SettingsStatics.anInt120 != 0 && var1 != -1) {
      GlobalStatics_9
          .method1285(GlobalStatics_2.fileUnpacker11, false, var1, 0, false,
              SettingsStatics.anInt120);
      GlobalStatics_9.aBoolean1158 = true;
    }

    if (var2 != -1) {
      DummyClass10.UL_PREFIX = null;
    }
  }

  public static void readTileData(int var0, int var1, boolean var2, Buffer var3,
      int y, int x,
      byte var6, int var7, int var8) {
    int opcode;
    if (x >= 0 && x < 104 && y >= 0 && y < 104) {
      if (!var2) {
        GlobalStatics_10.tileFlags[var8][x][y] = 0;
      }

      while (true) {
        opcode = var3.readUnsignedByte();
        if (opcode == 0) {
          if (var2) {
            GlobalStatics_4.heightMap[0][x][y] = DummyClass43.somethingHeightMap[0][x][y];
          } else {
            if (var8 == 0) {
              GlobalStatics_4.heightMap[0][x][y] =
                  8 * -DummyClass34
                      .perlinNoise(y + 556238 + var1, var0 + x + 932731);
            } else {
              GlobalStatics_4.heightMap[var8][x][y] =
                  -240 + GlobalStatics_4.heightMap[var8 - 1][x][y];
            }
          }
          break;
        }

        if (opcode == 1) {
          int var10 = var3.readUnsignedByte();
          if (var2) {
            GlobalStatics_4.heightMap[0][x][y] =
                DummyClass43.somethingHeightMap[0][x][y] + var10 * 8;
          } else {
            if (var10 == 1) {
              var10 = 0;
            }

            if (var8 == 0) {
              GlobalStatics_4.heightMap[0][x][y] = 8 * -var10;
            } else {
              GlobalStatics_4.heightMap[var8][x][y] =
                  -(var10 * 8) + GlobalStatics_4.heightMap[-1 + var8][x][y];
            }
          }
          break;
        }

        if (opcode <= 49) {
          DummyClass17.tileFloors[var8][x][y] = var3.readByte();
          GlobalStatics_9.tileOrientation[var8][x][y] = (byte) ((-2 + opcode)
              / 4);
          DummyClass18.aByteArrayArrayArray81[var8][x][y] =
              (byte) (-2 + opcode + var7 & 3);
        } else if (opcode > 81) {
          GlobalStatics_10.floorUnderlayIds[var8][x][y] = (byte) (-81 + opcode);
        } else if (!var2) {
          GlobalStatics_10.tileFlags[var8][x][y] = (byte) (opcode - 49);
        }
      }
    } else {
      while (true) {
        opcode = var3.readUnsignedByte();
        if (opcode == 0) {
          break;
        }

        if (opcode == 1) {
          var3.readUnsignedByte();
          break;
        }

        if (opcode <= 49) {
          var3.readUnsignedByte();
        }
      }
    }

    if (var6 < 58) {
      DummyClass10.anInt2087 = 87;
    }
  }

  public static int method2268(byte var0, int var1, int var2) {
    Inventory var3 = (Inventory) GlobalStatics_2.aClass130_2220.get(var1);
    if (var3 != null) {
      if (var2 == -1) {
        return 0;
      } else {
        int var4 = 0;

        for (int var5 = 0; var5 < var3.counts.length; ++var5) {
          if (var2 == var3.ids[var5]) {
            var4 += var3.counts[var5];
          }
        }

        if (var0 > -45) {
          DummyClass10.aClass94_2086 = null;
        }

        return var4;
      }
    } else {
      return 0;
    }
  }

  public static void destroyGame(byte var0) {
    if (GlobalStatics_9.GAME_SOCKET != null) {
      GlobalStatics_9.GAME_SOCKET.destroy();
      GlobalStatics_9.GAME_SOCKET = null;
    }

    GlobalStatics_9.method313((byte) 110);
    DummyClass34.method995();

    int var1;
    for (var1 = 0; var1 < 4; ++var1) {
      GlobalStatics_0.collisionMaps[var1].method1496(0);
    }

    GlobalStatics_9.method1250(62, false);
    System.gc();
    GlobalStatics_9.method882(-1, 2);
    GlobalStatics_9.aBoolean1158 = false;
    GlobalStatics_4.anInt1691 = -1;
    GlobalStatics_9.method2241((byte) -77, true);
    GlobalStatics_0.dynamicScene = false;
    GlobalStatics_9.REGION_BASE_Y = 0;
    GlobalStatics_2.anInt3606 = 0;
    GlobalStatics_10.anInt2294 = 0;
    GlobalStatics_10.REGION_BASE_X = 0;

    for (var1 = 0; GlobalStatics_8.aClass96Array2114.length > var1; ++var1) {
      GlobalStatics_8.aClass96Array2114[var1] = null;
    }

    DummyClass13.anInt2022 = 0;
    DummyClass6.anInt2046 = 0;
    if (var0 != 46) {
      DummyClass10.destroyGame((byte) 43);
    }

    for (var1 = 0; var1 < 2048; ++var1) {
      GlobalStatics_9.PLAYERS[var1] = null;
      DummyClass45.configs[var1] = null;
    }

    for (var1 = 0; var1 < 32768; ++var1) {
      GlobalStatics_8.NPCS[var1] = null;
    }

    for (var1 = 0; var1 < 4; ++var1) {
      for (int var2 = 0; var2 < 104; ++var2) {
        for (int var3 = 0; var3 < 104; ++var3) {
          GlobalStatics_9.groundItems[var1][var2][var3] = null;
        }
      }
    }

    GlobalStatics_6.method560(-21556);
    GlobalStatics_9.interfaceCounter = 0;
    GlobalStatics_9.resetVariables(var0 - 161);
    GlobalStatics_9.method219(true, 3000);
  }

}
