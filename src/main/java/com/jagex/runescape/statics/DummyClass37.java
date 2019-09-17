package com.jagex.runescape.statics;

import com.jagex.runescape.model.StillGraphic;
import com.jagex.runescape.model.StillGraphicNode;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.model.BlockConfig;
import com.jagex.runescape.model.FileUnpacker;
import com.jagex.runescape.model.GroundItem;
import com.jagex.runescape.model.GroundItemNode;
import com.jagex.runescape.model.Mobile;
import com.jagex.runescape.model.Projectile;
import com.jagex.runescape.model.ProjectileNode;
import com.jagex.runescape.model.RenderAnimation;
import com.jagex.runescape.model.SceneGraphTile;
import com.jagex.runescape.model.SomethingSceneI;
import com.jagex.runescape.node.Deque;
import com.jagex.runescape.opengl.GLStatics;
import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.GlTexture2d;

public final class DummyClass37 {

  public static GameString aClass94_669 = GameStringStatics.create(
      "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");
  public static int anInt670;
  public static int anInt671;

  public static void parseSceneRebuild(boolean var1) {
    GlobalStatics_0.dynamicScene = var1;
    int var2;
    int count;
    int var4;
    int var5;
    int var6;
    int var7;
    int regionX;
    int regionY;
    int regionHash;
    if (GlobalStatics_0.dynamicScene) {
      var2 = GlobalStatics_9.gameBuffer.readShortLEAdd();
      count = GlobalStatics_9.gameBuffer.readShortLEAdd();
      var4 = GlobalStatics_9.gameBuffer.method754(true);
      var5 = GlobalStatics_9.gameBuffer.readShortLEAdd();
      GlobalStatics_9.gameBuffer.method807((byte) 112);

      int var18;
      for (var6 = 0; var6 < 4; ++var6) {
        for (var7 = 0; var7 < 13; ++var7) {
          for (var18 = 0; var18 < 13; ++var18) {
            regionX = GlobalStatics_9.gameBuffer.readBits(1);
            if (regionX == 1) {
              GlobalStatics_8.anIntArrayArrayArray1497[var6][var7][var18] =
                  GlobalStatics_9.gameBuffer.readBits(26);
            } else {
              GlobalStatics_8.anIntArrayArrayArray1497[var6][var7][var18] = -1;
            }
          }
        }
      }

      GlobalStatics_9.gameBuffer.method818(false);
      var6 =
          (-GlobalStatics_9.gameBuffer.position + GlobalStatics_0.packetLength)
              / 16;
      GlobalStatics_6.landscapeEncryptionKeys = new int[var6][4];

      for (var7 = 0; var7 < var6; ++var7) {
        for (var18 = 0; var18 < 4; ++var18) {
          GlobalStatics_6.landscapeEncryptionKeys[var7][var18] =
              GlobalStatics_9.gameBuffer.readInt((byte) -124);
        }
      }

      var7 = GlobalStatics_9.gameBuffer.readUnsignedShort();
      GlobalStatics_6.updatedLandscapeIds = new int[var6];
      DummyClass55.landscapeFileIds = new int[var6];
      GlobalStatics_1.mapFileIds = new int[var6];
      GlobalStatics_10.updatedLandscapesData = new byte[var6][];
      GlobalStatics_8.anIntArray3290 = null;
      GlobalStatics_1.updatedMapIds = new int[var6];
      GlobalStatics_6.landscapesData = new byte[var6][];
      GlobalStatics_9.aByteArrayArray3027 = new byte[var6][];
      GlobalStatics_6.regionHashes = new int[var6];
      GlobalStatics_10.aByteArrayArray3335 = null;
      GlobalStatics_9.updatedMapsData = new byte[var6][];
      var6 = 0;

      for (var18 = 0; var18 < 4; ++var18) {
        for (regionX = 0; regionX < 13; ++regionX) {
          for (regionY = 0; regionY < 13; ++regionY) {
            regionHash = GlobalStatics_8.anIntArrayArrayArray1497[var18][regionX][regionY];
            if (regionHash != -1) {
              int var12 = regionHash >> 14 & 1023;
              int var13 = (regionHash & 16378) >> 3;
              int var14 = var13 / 8 + (var12 / 8 << 8);

              int var15;
              for (var15 = 0; var15 < var6; ++var15) {
                if (var14 == GlobalStatics_6.regionHashes[var15]) {
                  var14 = -1;
                  break;
                }
              }

              if (var14 != -1) {
                GlobalStatics_6.regionHashes[var6] = var14;
                int var16 = var14 & 255;
                var15 = (0xff6c & var14) >> 8;
                GlobalStatics_1.mapFileIds[var6] =
                    GlobalStatics_10.maps
                        .getFileId(GlobalStatics_9.concat(new GameString[]{
                            GlobalStatics_8.MAP_PREFIX,
                            GlobalStatics_9.toString(var15),
                            GlobalStatics_10.UNDERSCORE,
                            GlobalStatics_9.toString(var16)
                        }));
                DummyClass55.landscapeFileIds[var6] =
                    GlobalStatics_10.maps
                        .getFileId(GlobalStatics_9.concat(new GameString[]{
                            DummyClass12.LANDSCAPE_PREFIX,
                            GlobalStatics_9.toString(var15),
                            GlobalStatics_10.UNDERSCORE,
                            GlobalStatics_9.toString(var16)
                        }));
                GlobalStatics_1.updatedMapIds[var6] =
                    GlobalStatics_10.maps
                        .getFileId(GlobalStatics_9.concat(new GameString[]{
                            DummyClass53.UM_PREFIX,
                            GlobalStatics_9.toString(var15),
                            GlobalStatics_10.UNDERSCORE,
                            GlobalStatics_9.toString(var16)
                        }));
                GlobalStatics_6.updatedLandscapeIds[var6] =
                    GlobalStatics_10.maps
                        .getFileId(GlobalStatics_9.concat(new GameString[]{
                            DummyClass10.UL_PREFIX,
                            GlobalStatics_9.toString(var15),
                            GlobalStatics_10.UNDERSCORE,
                            GlobalStatics_9.toString(var16)
                        }));
                ++var6;
              }
            }
          }
        }
      }

      GlobalStatics_7
          .rebuildScene(var4, var7, count, var5, false, var2, true);
    } else {
      var2 = GlobalStatics_9.gameBuffer.readUnsignedShortAdd();
      count =
          (GlobalStatics_0.packetLength - GlobalStatics_9.gameBuffer.position)
              / 16;
      GlobalStatics_6.landscapeEncryptionKeys = new int[count][4];

      for (var4 = 0; count > var4; ++var4) {
        for (var5 = 0; var5 < 4; ++var5) {
          GlobalStatics_6.landscapeEncryptionKeys[var4][var5] =
              GlobalStatics_9.gameBuffer.readInt((byte) 123);
        }
      }

      var4 = GlobalStatics_9.gameBuffer.method754(true);
      var5 = GlobalStatics_9.gameBuffer.readUnsignedShort();
      var6 = GlobalStatics_9.gameBuffer.readUnsignedShortAdd();
      var7 = GlobalStatics_9.gameBuffer.readUnsignedShortAdd();
      GlobalStatics_6.regionHashes = new int[count];
      GlobalStatics_9.aByteArrayArray3027 = new byte[count][];
      GlobalStatics_10.aByteArrayArray3335 = null;
      GlobalStatics_1.updatedMapIds = new int[count];
      GlobalStatics_6.landscapesData = new byte[count][];
      GlobalStatics_10.updatedLandscapesData = new byte[count][];
      GlobalStatics_8.anIntArray3290 = null;
      GlobalStatics_1.mapFileIds = new int[count];
      GlobalStatics_9.updatedMapsData = new byte[count][];
      DummyClass55.landscapeFileIds = new int[count];
      GlobalStatics_6.updatedLandscapeIds = new int[count];
      count = 0;
      boolean var8 = false;
      if ((var5 / 8 == 48 || var5 / 8 == 49) && var6 / 8 == 48) {
        var8 = true;
      }

      if (var5 / 8 == 48 && var6 / 8 == 148) {
        var8 = true;
      }

      for (regionX = (var5 - 6) / 8; (6 + var5) / 8 >= regionX; ++regionX) {
        for (regionY = (-6 + var6) / 8; (6 + var6) / 8 >= regionY;
            ++regionY) {
          regionHash = (regionX << 8) + regionY;
          if (var8 && (regionY == 49 || regionY == 149 || regionY == 147
              || regionX == 50
              || regionX == 49 && regionY == 47)) {
            GlobalStatics_6.regionHashes[count] = regionHash;
            GlobalStatics_1.mapFileIds[count] = -1;
            DummyClass55.landscapeFileIds[count] = -1;
            GlobalStatics_1.updatedMapIds[count] = -1;
            GlobalStatics_6.updatedLandscapeIds[count] = -1;
          } else {
            GlobalStatics_6.regionHashes[count] = regionHash;
            GlobalStatics_1.mapFileIds[count] =
                GlobalStatics_10.maps
                    .getFileId(GlobalStatics_9.concat(new GameString[]{
                        GlobalStatics_8.MAP_PREFIX,
                        GlobalStatics_9.toString(regionX),
                        GlobalStatics_10.UNDERSCORE,
                        GlobalStatics_9.toString(regionY)
                    }));
            DummyClass55.landscapeFileIds[count] =
                GlobalStatics_10.maps
                    .getFileId(GlobalStatics_9.concat(new GameString[]{
                        DummyClass12.LANDSCAPE_PREFIX,
                        GlobalStatics_9.toString(regionX),
                        GlobalStatics_10.UNDERSCORE,
                        GlobalStatics_9.toString(regionY)
                    }));
            GlobalStatics_1.updatedMapIds[count] =
                GlobalStatics_10.maps
                    .getFileId(GlobalStatics_9.concat(new GameString[]{
                        DummyClass53.UM_PREFIX,
                        GlobalStatics_9.toString(regionX),
                        GlobalStatics_10.UNDERSCORE,
                        GlobalStatics_9.toString(regionY)
                    }));
            GlobalStatics_6.updatedLandscapeIds[count] =
                GlobalStatics_10.maps
                    .getFileId(GlobalStatics_9.concat(new GameString[]{
                        DummyClass10.UL_PREFIX,
                        GlobalStatics_9.toString(regionX),
                        GlobalStatics_10.UNDERSCORE,
                        GlobalStatics_9.toString(regionY)
                    }));
          }

          count++;
        }
      }

      GlobalStatics_7
          .rebuildScene(var4, var6, var5, var7, false, var2, true);
    }
  }

  public static void method1034(int var0) {
    if (var0 != 8642) {
      DummyClass37.aClass94_669 = null;
    }

    DummyClass37.aClass94_669 = null;
  }

  public static void method1035(byte var0) {
    GlobalStatics_9.anIntArray2931 = null;
    GlobalStatics_0.anIntArray2591 = null;
    if (var0 <= 103) {
      DummyClass37.method1037(46, 44, 46);
    }

    GlobalStatics_10.anIntArray3076 = null;
    DummyClass5.aByteArrayArray2987 = null;
    GlobalStatics_9.anIntArray2048 = null;
    GlobalStatics_10.anIntArray3446 = null;
  }

  public static void method1036(int var0) {
    BlockConfig var1 = new BlockConfig();
    if (var0 <= 101) {
      DummyClass37.method1039(22, null);
    }

    for (int var2 = 0; var2 < 13; ++var2) {
      for (int var3 = 0; var3 < 13; ++var3) {
        DummyClass27.blockConfigs[var2][var3] = var1;
      }
    }
  }

  public static SomethingSceneI method1037(int var0, int var1, int var2) {
    SceneGraphTile var3 = GLStatics.sceneGraphTiles[var0][var1][var2];
    if (var3 == null) {
      return null;
    } else {
      SomethingSceneI var4 = var3.aClass19_2233;
      var3.aClass19_2233 = null;
      return var4;
    }
  }

  public static void parseEntityUpdate(byte var0) {
    int var1;
    int var2;
    int var3;
    int var4;
    int var5;
    int var6;
    int var7;
    if (GlobalStatics_0.packetId == 195) {
      var1 = GlobalStatics_9.gameBuffer.method786(true);
      var3 = var1 & 3;
      var2 = var1 >> 2;
      var4 = GlobalStatics_3.OBJECT_TYPES[var2];
      var5 = GlobalStatics_9.gameBuffer.readUnsignedByte();
      var6 = ((125 & var5) >> 4) + DummyClass45.spawnSceneX;
      var7 = (7 & var5) + DummyClass56.spawnSceneY;
      if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
        GlobalStatics_9
            .method881(GlobalStatics_9.currentPlane, var7, -101, var3, var6, -1,
                -1, var4,
                var2, 0);
      }

    } else if (GlobalStatics_0.packetId == 33) {
      var1 = GlobalStatics_9.gameBuffer.readUnsignedShortLE();
      var2 = GlobalStatics_9.gameBuffer.readUnsignedByte();
      var4 = (7 & var2) + DummyClass56.spawnSceneY;
      var3 = ((120 & var2) >> 4) + DummyClass45.spawnSceneX;
      var5 = GlobalStatics_9.gameBuffer.readUnsignedShortAdd();
      if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
        GroundItem var31 = new GroundItem();
        var31.anInt2930 = var5;
        var31.anInt2936 = var1;
        if (GlobalStatics_9.groundItems[GlobalStatics_9.currentPlane][var3][var4]
            == null) {
          GlobalStatics_9.groundItems[GlobalStatics_9.currentPlane][var3][var4] = new Deque();
        }

        GlobalStatics_9.groundItems[GlobalStatics_9.currentPlane][var3][var4]
            .addLast(
                new GroundItemNode(var31));
        GlobalStatics_10.method1760(var4, (byte) 65, var3);
      }

    } else {
      int var8;
      int var10;
      int var11;
      int var13;
      int var28;
      int var35;
      Projectile var36;
      if (GlobalStatics_0.packetId == 121) {
        var1 = GlobalStatics_9.gameBuffer.readUnsignedByte();
        var2 = 2 * DummyClass45.spawnSceneX + (15 & var1 >> 4);
        var3 = (15 & var1) + 2 * DummyClass56.spawnSceneY;
        var4 = var2 + GlobalStatics_9.gameBuffer.readByte();
        var5 = GlobalStatics_9.gameBuffer.readByte() + var3;
        var6 = GlobalStatics_9.gameBuffer.method787((byte) 73);
        var7 = GlobalStatics_9.gameBuffer.readUnsignedShort();
        var8 = GlobalStatics_9.gameBuffer.readUnsignedByte() * 4;
        var28 = GlobalStatics_9.gameBuffer.readUnsignedByte() * 4;
        var10 = GlobalStatics_9.gameBuffer.readUnsignedShort();
        var11 = GlobalStatics_9.gameBuffer.readUnsignedShort();
        var35 = GlobalStatics_9.gameBuffer.readUnsignedByte();
        if (var35 == 255) {
          var35 = -1;
        }

        var13 = GlobalStatics_9.gameBuffer.readUnsignedByte();
        if (var2 >= 0 && var3 >= 0 && var2 < 208 && var3 < 208 && var4 >= 0 &&
            var5 >= 0
            && var4 < 208 && var5 < 208 && var7 != 0xffff) {
          var5 *= 64;
          var4 = 64 * var4;
          var3 = 64 * var3;
          var2 = 64 * var2;
          var36 = new Projectile(var7, GlobalStatics_9.currentPlane, var2, var3,
              GlobalStatics_6
                  .method1736(GlobalStatics_9.currentPlane, 1, var2, var3)
                  - var8,
              GlobalStatics_4.updateCycle + var10,
              var11 + GlobalStatics_4.updateCycle, var35,
              var13, var6, var28);
          var36.method2024(var5, 1, GlobalStatics_4.updateCycle + var10,
              -var28 + GlobalStatics_6
                  .method1736(GlobalStatics_9.currentPlane, 1, var4, var5),
              var4);
          GlobalStatics_9.projectiles.addLast(new ProjectileNode(var36));
        }

      } else if (GlobalStatics_0.packetId == 17) {
        var1 = GlobalStatics_9.gameBuffer.readUnsignedByte();
        var2 = DummyClass45.spawnSceneX + (var1 >> 4 & 7);
        var3 = DummyClass56.spawnSceneY + (var1 & 7);
        var4 = GlobalStatics_9.gameBuffer.readUnsignedShort();
        var5 = GlobalStatics_9.gameBuffer.readUnsignedByte();
        var6 = GlobalStatics_9.gameBuffer.readUnsignedShort();
        if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
          var2 = var2 * 128 + 64;
          var3 = var3 * 128 + 64;
          StillGraphic var32 = new StillGraphic(var4,
              GlobalStatics_9.currentPlane, var2, var3,
              -var5 + GlobalStatics_6
                  .method1736(GlobalStatics_9.currentPlane, 1, var2, var3),
              var6,
              GlobalStatics_4.updateCycle);
          GlobalStatics_1.stillGraphics.addLast(new StillGraphicNode(var32));
        }

      } else if (GlobalStatics_0.packetId == 179) {
        var1 = GlobalStatics_9.gameBuffer.method751((byte) -111);
        var2 = var1 >> 2;
        var3 = 3 & var1;
        var4 = GlobalStatics_3.OBJECT_TYPES[var2];
        var5 = GlobalStatics_9.gameBuffer.readUnsignedByte();
        var6 = DummyClass45.spawnSceneX + ((var5 & 125) >> 4);
        var7 = (7 & var5) + DummyClass56.spawnSceneY;
        var8 = GlobalStatics_9.gameBuffer.readUnsignedShortAdd();
        if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
          GlobalStatics_9
              .method881(GlobalStatics_9.currentPlane, var7, -91, var3, var6,
                  -1, var8, var4,
                  var2, 0);
        }

      } else if (GlobalStatics_0.packetId != 20) {
        int var14;
        if (GlobalStatics_0.packetId == 202) {
          var1 = GlobalStatics_9.gameBuffer.readUnsignedByte();
          var2 = var1 >> 2;
          var3 = var1 & 3;
          var4 = GlobalStatics_9.gameBuffer.readUnsignedByte();
          var5 = (var4 >> 4 & 7) + DummyClass45.spawnSceneX;
          var6 = (7 & var4) + DummyClass56.spawnSceneY;
          byte var25 = GlobalStatics_9.gameBuffer.method789(0);
          byte var30 = GlobalStatics_9.gameBuffer.method789(0);
          byte var9 = GlobalStatics_9.gameBuffer.method749(false);
          var10 = GlobalStatics_9.gameBuffer.readUnsignedShortAdd();
          var11 = GlobalStatics_9.gameBuffer.readUnsignedShortLE();
          byte var12 = GlobalStatics_9.gameBuffer.readByte();
          var13 = GlobalStatics_9.gameBuffer.readUnsignedShort();
          var14 = GlobalStatics_9.gameBuffer.method788(-1741292848);
          if (!GlRenderer.USE_OPENGL) {
            GlobalStatics_10
                .method280(var12, var13, var14, var11, var6, var9, var3, var25,
                    var5,
                    var2, -745213428, var30, var10);
          }
        }

        if (GlobalStatics_0.packetId == 14) {
          var1 = GlobalStatics_9.gameBuffer.readUnsignedByte();
          var3 = DummyClass56.spawnSceneY + (var1 & 7);
          var2 = ((var1 & 119) >> 4) + DummyClass45.spawnSceneX;
          var4 = GlobalStatics_9.gameBuffer.readUnsignedShort();
          var5 = GlobalStatics_9.gameBuffer.readUnsignedShort();
          var6 = GlobalStatics_9.gameBuffer.readUnsignedShort();
          if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
            Deque var29 =
                GlobalStatics_9.groundItems[GlobalStatics_9.currentPlane][var2][var3];
            if (var29 != null) {
              for (GroundItemNode var34 = (GroundItemNode) var29.getFirst();
                  var34 != null; var34 = (GroundItemNode) var29.getNext()) {
                GroundItem var33 = var34.aClass140_Sub7_3676;
                if ((var4 & 32767) == var33.anInt2936
                    && var5 == var33.anInt2930) {
                  var33.anInt2930 = var6;
                  break;
                }
              }

              GlobalStatics_10.method1760(var3, (byte) 65, var2);
            }
          }

        } else if (GlobalStatics_0.packetId == 135) {
          var1 = GlobalStatics_9.gameBuffer.readShortLEAdd();
          var2 = GlobalStatics_9.gameBuffer.method786(true);
          var4 = DummyClass56.spawnSceneY + (7 & var2);
          var3 = (7 & var2 >> 4) + DummyClass45.spawnSceneX;
          var5 = GlobalStatics_9.gameBuffer.readUnsignedShortLE();
          var6 = GlobalStatics_9.gameBuffer.readUnsignedShortLE();
          if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104
              && GlobalStatics_10.localPlayerId != var1) {
            GroundItem var27 = new GroundItem();
            var27.anInt2930 = var5;
            var27.anInt2936 = var6;
            if (GlobalStatics_9.groundItems[GlobalStatics_9.currentPlane][var3][var4]
                == null) {
              GlobalStatics_9.groundItems[GlobalStatics_9.currentPlane][var3][var4] =
                  new Deque();
            }

            GlobalStatics_9.groundItems[GlobalStatics_9.currentPlane][var3][var4]
                .addLast(
                    new GroundItemNode(var27));
            GlobalStatics_10.method1760(var4, (byte) 65, var3);
          }

        } else if (var0 <= -67) {
          if (GlobalStatics_0.packetId == 16) {
            var1 = GlobalStatics_9.gameBuffer.readUnsignedByte();
            var2 = DummyClass45.spawnSceneX + (var1 >> 4 & 7);
            var3 = (var1 & 7) + DummyClass56.spawnSceneY;
            var4 = var2 + GlobalStatics_9.gameBuffer.readByte();
            var5 = GlobalStatics_9.gameBuffer.readByte() + var3;
            var6 = GlobalStatics_9.gameBuffer.method787((byte) 67);
            var7 = GlobalStatics_9.gameBuffer.readUnsignedShort();
            var8 = 4 * GlobalStatics_9.gameBuffer.readUnsignedByte();
            var28 = GlobalStatics_9.gameBuffer.readUnsignedByte() * 4;
            var10 = GlobalStatics_9.gameBuffer.readUnsignedShort();
            var11 = GlobalStatics_9.gameBuffer.readUnsignedShort();
            var35 = GlobalStatics_9.gameBuffer.readUnsignedByte();
            var13 = GlobalStatics_9.gameBuffer.readUnsignedByte();
            if (var35 == 255) {
              var35 = -1;
            }

            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104
                && var4 >= 0 && var5 >= 0
                && var4 < 104 && var5 < 104 && var7 != 65535) {
              var5 = var5 * 128 + 64;
              var3 = 128 * var3 + 64;
              var2 = 128 * var2 + 64;
              var4 = 128 * var4 + 64;
              var36 = new Projectile(var7, GlobalStatics_9.currentPlane,
                  var2, var3,
                  GlobalStatics_6
                      .method1736(GlobalStatics_9.currentPlane, 1, var2,
                          var3) - var8,
                  var10 + GlobalStatics_4.updateCycle,
                  var11 + GlobalStatics_4.updateCycle,
                  var35, var13, var6, var28);
              var36.method2024(var5, 1, GlobalStatics_4.updateCycle + var10,
                  GlobalStatics_6
                      .method1736(GlobalStatics_9.currentPlane, 1, var4,
                          var5) - var28,
                  var4);
              GlobalStatics_9.projectiles.addLast(new ProjectileNode(var36));
            }

          } else {
            if (GlobalStatics_0.packetId == 104) {
              var1 = GlobalStatics_9.gameBuffer.readUnsignedByte();
              var3 = 2 * DummyClass56.spawnSceneY + (var1 & 15);
              var2 = 2 * DummyClass45.spawnSceneX + (var1 >> 4 & 15);
              var4 = GlobalStatics_9.gameBuffer.readByte() + var2;
              var5 = GlobalStatics_9.gameBuffer.readByte() + var3;
              var6 = GlobalStatics_9.gameBuffer.method787((byte) 93);
              var7 = GlobalStatics_9.gameBuffer.method787((byte) 12);
              var8 = GlobalStatics_9.gameBuffer.readUnsignedShort();
              var28 = GlobalStatics_9.gameBuffer.readByte();
              var10 = 4 * GlobalStatics_9.gameBuffer.readUnsignedByte();
              var11 = GlobalStatics_9.gameBuffer.readUnsignedShort();
              var35 = GlobalStatics_9.gameBuffer.readUnsignedShort();
              var13 = GlobalStatics_9.gameBuffer.readUnsignedByte();
              var14 = GlobalStatics_9.gameBuffer.readUnsignedByte();
              if (var13 == 255) {
                var13 = -1;
              }

              if (var2 >= 0 && var3 >= 0 && var2 < 208 && var3 < 208
                  && var4 >= 0 && var5 >= 0
                  && var4 < 208 && var5 < 208 && var8 != 0xffff) {
                var4 = 64 * var4;
                var2 *= 64;
                var5 *= 64;
                var3 *= 64;
                if (var6 != 0) {
                  int var15;
                  int var17;
                  Mobile var16;
                  int var18;
                  if (var6 >= 0) {
                    var17 = var6 - 1;
                    var18 = 2047 & var17;
                    var15 = 15 & var17 >> 11;
                    var16 = GlobalStatics_8.NPCS[var18];
                  } else {
                    var17 = -1 - var6;
                    var15 = (31085 & var17) >> 11;
                    var18 = 2047 & var17;
                    if (GlobalStatics_10.localPlayerId == var18) {
                      var16 = GlobalStatics_9.localPlayer;
                    } else {
                      var16 = GlobalStatics_9.players[var18];
                    }
                  }

                  if (var16 != null) {
                    RenderAnimation var38 = var16
                        .getRenderAnimationId(false);
                    assert var38 != null;
                    if (var38.anIntArrayArray359 != null
                        && var38.anIntArrayArray359[var15] != null) {
                      var18 = var38.anIntArrayArray359[var15][0];
                      var28 -= var38.anIntArrayArray359[var15][1];
                      int var19 = var38.anIntArrayArray359[var15][2];
                      int var20 = GLStatics.SINE_TABLE[var16.rotationY];
                      int var21 = DummyClass40.COSINE_TABLE[var16.rotationY];
                      int var22 = var18 * var21 + var19 * var20 >> 16;
                      var19 = -(var18 * var20) + var21 * var19 >> 16;
                      var3 += var19;
                      var2 += var22;
                    }
                  }
                }

                Projectile var37 =
                    new Projectile(var8, GlobalStatics_9.currentPlane,
                        var2, var3,
                        -var28 + GlobalStatics_6
                            .method1736(GlobalStatics_9.currentPlane, 1,
                                var2,
                                var3), var11 + GlobalStatics_4.updateCycle,
                        var35 + GlobalStatics_4.updateCycle, var13, var14,
                        var7, var10);
                var37.method2024(var5, 1,
                    var11 + GlobalStatics_4.updateCycle,
                    -var10 + GlobalStatics_6
                        .method1736(GlobalStatics_9.currentPlane, 1, var4,
                            var5),
                    var4);
                GlobalStatics_9.projectiles
                    .addLast(new ProjectileNode(var37));
              }

            } else if (GlobalStatics_0.packetId == 97) {
              var1 = GlobalStatics_9.gameBuffer.readUnsignedByte();
              var2 = DummyClass45.spawnSceneX + (7 & var1 >> 4);
              var3 = DummyClass56.spawnSceneY + (var1 & 7);
              var4 = GlobalStatics_9.gameBuffer.readUnsignedShort();
              if (var4 == 65535) {
                var4 = -1;
              }

              var5 = GlobalStatics_9.gameBuffer.readUnsignedByte();
              var6 = (242 & var5) >> 4;
              var8 = GlobalStatics_9.gameBuffer.readUnsignedByte();
              var7 = 7 & var5;
              if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                var28 = 1 + var6;
                if (GlobalStatics_9.localPlayer.waypointsX[0] >= var2
                    - var28
                    && var28 + var2
                    >= GlobalStatics_9.localPlayer.waypointsX[0]
                    && GlobalStatics_9.localPlayer.waypointsY[0]
                    >= -var28 + var3
                    && GlobalStatics_9.localPlayer.waypointsY[0] <= var28 + var3
                    && DummyClass28.anInt340 != 0 && var7 > 0
                    && GlobalStatics_9.anInt1552 < 50
                    && var4 != -1) {
                  GlobalStatics_9.anIntArray2550[GlobalStatics_9.anInt1552] = var4;
                  GlobalStatics_9.anIntArray2068[GlobalStatics_9.anInt1552] = var7;
                  GlobalStatics_0.anIntArray2157[GlobalStatics_9.anInt1552] = var8;
                  GlobalStatics_9.aClass135Array2131[GlobalStatics_9.anInt1552] = null;
                  GlobalStatics_10.anIntArray3083[GlobalStatics_9.anInt1552] =
                      var6 + (var2 << 16) + (var3 << 8);
                  ++GlobalStatics_9.anInt1552;
                }
              }

            } else if (GlobalStatics_0.packetId == 240) {
              var1 = GlobalStatics_9.gameBuffer.method754(true);
              var3 = DummyClass56.spawnSceneY + (var1 & 7);
              var2 = ((113 & var1) >> 4) + DummyClass45.spawnSceneX;
              var4 = GlobalStatics_9.gameBuffer.readUnsignedShort();
              if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                Deque var24 =
                    GlobalStatics_9.groundItems[GlobalStatics_9.currentPlane][var2][var3];
                if (var24 != null) {
                  for (GroundItemNode var26 = (GroundItemNode) var24
                      .getFirst();
                      var26 != null;
                      var26 = (GroundItemNode) var24.getNext()) {
                    if (var26.aClass140_Sub7_3676.anInt2936 == (var4
                        & 32767)) {
                      var26.unlinkNode();
                      break;
                    }
                  }

                  if (var24.getFirst() == null) {
                    GlobalStatics_9.groundItems[GlobalStatics_9.currentPlane][var2][var3] =
                        null;
                  }

                  GlobalStatics_10.method1760(var3, (byte) 65, var2);
                }
              }

            }
          }
        }
      } else {
        var1 = GlobalStatics_9.gameBuffer.method754(true);
        var2 = ((var1 & 125) >> 4) + DummyClass45.spawnSceneX;
        var3 = DummyClass56.spawnSceneY + (7 & var1);
        var4 = GlobalStatics_9.gameBuffer.method754(true);
        var5 = var4 >> 2;
        var6 = 3 & var4;
        var7 = GlobalStatics_3.OBJECT_TYPES[var5];
        var8 = GlobalStatics_9.gameBuffer.readUnsignedShortLE();
        if (var8 == 0xffff) {
          var8 = -1;
        }

        GlobalStatics_4
            .method1131(GlobalStatics_9.currentPlane, 125, var6, var5, var3,
                var7,
                var2, var8);
      }
    }
  }

  public static void method1039(int var0, FileUnpacker var1) {
    GlobalStatics_9.p11FontFileId = var1.getFileId(GlobalStatics_9.FONT_P11);
    GlobalStatics_9.p12FontFileId = var1.getFileId(GlobalStatics_9.FONT_P12);
    GlobalStatics_9.b12FontFileId = var1.getFileId(GlobalStatics_9.FONT_B12);
    GlobalStatics_8.anInt2104 = var1.getFileId(GlobalStatics_7.aClass94_2959);
    GlobalStatics_10.anInt4042 = var1.getFileId(GlobalStatics_9.aClass94_3370);
    GlobalStatics_1.anInt2195 = var1.getFileId(GlobalStatics_9.aClass94_3008);
    GlobalStatics_2.anInt2575 = var1.getFileId(GlobalStatics_9.aClass94_1070);
    if (var0 != 208) {
      DummyClass37.anInt670 = 0;
    }

    GlobalStatics_9.headIconsPrayerFileId = var1
        .getFileId(DummyClass21.HEAD_ICONS_PRAYER);
    GlobalStatics_9.hintHeadIconsFileId = var1
        .getFileId(GlobalStatics_9.HINT_HEAD_ICONS);
    GlobalStatics_9.anInt2689 = var1.getFileId(GlobalStatics_9.aClass94_1556);
    GlobalStatics_10.anInt3061 = var1.getFileId(GlobalStatics_10.aClass94_3452);
    GlobalStatics_9.anInt2633 = var1.getFileId(GlobalStatics_10.aClass94_3168);
    DummyClass59.anInt678 = var1.getFileId(GlobalStatics_9.aClass94_1567);
    GlobalStatics_9.anInt2436 = var1.getFileId(GlobalStatics_9.aClass94_1913);
    GlTexture2d.anInt3757 = var1.getFileId(GlobalStatics_9.aClass94_3576);
    DummyClass38.floorShadowsFileId = var1
        .getFileId(GlobalStatics_9.FLOOR_SHADOWS);
    GlobalStatics_9.anInt1325 = var1.getFileId(GlobalStatics_8.aClass94_2089);
    GlobalStatics_9.anInt2471 = var1.getFileId(GlobalStatics_7.aClass94_2164);
  }

}
