package com.jagex.runescape.statics;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.model.AbstractDirectColorSprite;
import com.jagex.runescape.model.FileUnpacker;
import com.jagex.runescape.model.SoftwareDirectColorSprite;
import com.jagex.runescape.model.WorldMapLabel;
import com.jagex.runescape.opengl.DummyClass46;
import com.jagex.runescape.opengl.GLStatics;
import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.SomethingShadows;

public final class DummyClass59 {

  public static GameString aClass94_672 = GameStringStatics.create("null");
  public static GameString aClass94_673 = GameStringStatics.create(")0");
  public static int anInt674;
  public static int[] anIntArray675 = {16, 32, 64, 128};
  public static GameString aClass94_676;
  public static int anInt677;
  public static int anInt678;
  public static FileUnpacker soundEffects;
  public static AbstractDirectColorSprite titlebackground;

  public static int method1040(int var0, int var1, byte var2, int var3) {
    return var2 != 0 ? -127
        : var3 > var1 ? var3 : var1 > var0 ? var0 : var1;
  }

  public static void method1041(long var0, int var2) {
    GlobalStatics_9.secureBuffer.position = 0;
    GlobalStatics_9.secureBuffer.writeByte(186);
    GlobalStatics_9.secureBuffer.writeLong(var0);
    GlobalStatics_0.anInt23 = 1;
    if (var2 == -28236) {
      DummyClass22.anInt1734 = 0;
      GlobalStatics_9.anInt548 = 0;
      GlobalStatics_0.anInt1711 = -3;
    }
  }

  public static void clear66(boolean var0) {
    DummyClass59.soundEffects = null;
    DummyClass59.aClass94_676 = null;

    DummyClass59.aClass94_672 = null;
    DummyClass59.anIntArray675 = null;
    DummyClass59.aClass94_673 = null;
    DummyClass59.titlebackground = null;
  }

  public static SoftwareDirectColorSprite method1043(int var0,
      FileUnpacker var1, int var2,
      int var3) {
    if (var2 != -3178) {
      DummyClass59.method1044(-55);
    }

    return GlobalStatics_9.loadSprites(var1, var0, var3, -30901) ?
        DummyClass26.method1722(-53) :
        null;
  }

  public static void method1044(int var0) {
    if (var0 != -3782) {
      DummyClass59.aClass94_672 = null;
    }

    GlobalStatics_7.aClass93_2450.method1523();
  }

  public static void method1045(int var0) {
    if (var0 != -19761) {
      DummyClass59.method1046(-110);
    }

    GlobalStatics_10.aClass93_1683.method1524(3);
  }

  public static void method1046(int var0) {
    DummyClass5.method2210((byte) -90, false);
    GlobalStatics_8.anInt3293 = 0;
    boolean var1 = true;

    int var2;
    for (var2 = 0; var2 < GlobalStatics_9.aByteArrayArray3027.length;
        ++var2) {
      if (GlobalStatics_1.mapFileIds[var2] != -1 &&
          GlobalStatics_9.aByteArrayArray3027[var2] == null) {
        GlobalStatics_9.aByteArrayArray3027[var2] =
            GlobalStatics_10.maps.getBytes(GlobalStatics_1.mapFileIds[var2], 0);
        if (GlobalStatics_9.aByteArrayArray3027[var2] == null) {
          ++GlobalStatics_8.anInt3293;
          var1 = false;
        }
      }

      if (DummyClass55.landscapeFileIds[var2] != -1
          && GlobalStatics_6.landscapesData[var2] == null) {
        GlobalStatics_6.landscapesData[var2] =
            GlobalStatics_10.maps.unpack(DummyClass55.landscapeFileIds[var2],
                GlobalStatics_6.landscapeEncryptionKeys[var2], 37, 0);
        if (GlobalStatics_6.landscapesData[var2] == null) {
          var1 = false;
          ++GlobalStatics_8.anInt3293;
        }
      }

      if (GlRenderer.USE_OPENGL) {
        if (GlobalStatics_1.updatedMapIds[var2] != -1
            && GlobalStatics_9.updatedMapsData[var2] == null) {
          GlobalStatics_9.updatedMapsData[var2] =
              GlobalStatics_10.maps
                  .getBytes(GlobalStatics_1.updatedMapIds[var2], 0);
          if (GlobalStatics_9.updatedMapsData[var2] == null) {
            var1 = false;
            ++GlobalStatics_8.anInt3293;
          }
        }

        if (GlobalStatics_6.updatedLandscapeIds[var2] != -1
            && GlobalStatics_10.updatedLandscapesData[var2] == null) {
          GlobalStatics_10.updatedLandscapesData[var2] =
              GlobalStatics_10.maps
                  .getBytes(GlobalStatics_6.updatedLandscapeIds[var2], 0);
          if (GlobalStatics_10.updatedLandscapesData[var2] == null) {
            ++GlobalStatics_8.anInt3293;
            var1 = false;
          }
        }
      }

      if (GlobalStatics_8.anIntArray3290 != null
          && GlobalStatics_10.aByteArrayArray3335[var2] == null
          && GlobalStatics_8.anIntArray3290[var2] != -1) {
        GlobalStatics_10.aByteArrayArray3335[var2] =
            GlobalStatics_10.maps.unpack(GlobalStatics_8.anIntArray3290[var2],
                GlobalStatics_6.landscapeEncryptionKeys[var2], 92, 0);
        if (GlobalStatics_10.aByteArrayArray3335[var2] == null) {
          ++GlobalStatics_8.anInt3293;
          var1 = false;
        }
      }
    }

    if (GlobalStatics_10.aClass131_3421 == null) {
      if (GlobalStatics_10.aClass3_Sub28_Sub3_3264 != null
          && GlobalStatics_9.worldMapData
          .method2135(GlobalStatics_9.concat(new GameString[]{
              GlobalStatics_10.aClass3_Sub28_Sub3_3264.aClass94_3561,
              GlobalStatics_9.LABELS
          }), -104)) {
        if (GlobalStatics_9.worldMapData.method2127((byte) -83,
            GlobalStatics_9.concat(new GameString[]{
                GlobalStatics_10.aClass3_Sub28_Sub3_3264.aClass94_3561,
                GlobalStatics_9.LABELS
            }))) {
          GlobalStatics_10.aClass131_3421 =
              DummyClass50
                  .method1403(-41, GlobalStatics_9.concat(new GameString[]{
                      GlobalStatics_10.aClass3_Sub28_Sub3_3264.aClass94_3561,
                      GlobalStatics_9.LABELS
                  }), GlobalStatics_9.worldMapData);
        } else {
          var1 = false;
          ++GlobalStatics_8.anInt3293;
        }
      } else {
        GlobalStatics_10.aClass131_3421 = new WorldMapLabel(0);
      }
    }

    if (var1) {
      DummyClass11.anInt2038 = 0;
      var1 = true;

      int var4;
      int var5;
      for (var2 = 0; GlobalStatics_9.aByteArrayArray3027.length > var2;
          ++var2) {
        byte[] var3 = GlobalStatics_6.landscapesData[var2];
        if (var3 != null) {
          var5 =
              -GlobalStatics_9.anInt1152
                  + (GlobalStatics_6.regionHashes[var2] & 255) * 64;
          var4 = -GlobalStatics_10.anInt1716
              + (GlobalStatics_6.regionHashes[var2] >> 8) * 64;
          if (GlobalStatics_0.dynamicScene) {
            var5 = 10;
            var4 = 10;
          }

          var1 &= GlobalStatics_9.method944((byte) -97, var4, var5, var3);
        }

        if (GlRenderer.USE_OPENGL) {
          var3 = GlobalStatics_10.updatedLandscapesData[var2];
          if (var3 != null) {
            var4 = -GlobalStatics_10.anInt1716 + 64 * (
                GlobalStatics_6.regionHashes[var2] >> 8);
            var5 =
                -GlobalStatics_9.anInt1152 + 64 * (
                    GlobalStatics_6.regionHashes[var2] & 255);
            if (GlobalStatics_0.dynamicScene) {
              var5 = 10;
              var4 = 10;
            }

            var1 &= GlobalStatics_9.method944((byte) -74, var4, var5, var3);
          }
        }
      }

      if (var0 >= -92) {
        DummyClass59.clear66(true);
      }

      if (var1) {
        if (DummyClass8.anInt4019 != 0) {
          GlobalStatics_3.drawLoadingBox(GlobalStatics_9.concat(
              new GameString[]{GlobalStatics_10.LOADING_PLEASE_WAIT,
                  GlobalStatics_9.aClass94_2707}),
              true);
        }

        DummyClass43.method1194();
        GlobalStatics_9.method313((byte) 58);
        boolean var11 = false;
        int var12;
        if (GlRenderer.USE_OPENGL && GLStatics.aBoolean1685) {
          for (var12 = 0; GlobalStatics_9.aByteArrayArray3027.length > var12;
              ++var12) {
            if (GlobalStatics_10.updatedLandscapesData[var12] != null
                || GlobalStatics_9.updatedMapsData[var12] != null) {
              var11 = true;
              break;
            }
          }
        }

        // 28x28
        //TODO
        int viewportLength = GlRenderer.USE_OPENGL ? 104 : 25;
        GlobalStatics_9.initializeScene(4, 104, 104, viewportLength);

        for (var12 = 0; var12 < 4; ++var12) {
          GlobalStatics_0.collisionMaps[var12].method1496(0);
        }

        for (var12 = 0; var12 < 4; ++var12) {
          for (var4 = 0; var4 < 104; ++var4) {
            for (var5 = 0; var5 < 104; ++var5) {
              GlobalStatics_10.tileFlags[var12][var4][var5] = 0;
            }
          }
        }

        GlobalStatics_9.method2241((byte) -115, false);
        if (GlRenderer.USE_OPENGL) {
          SomethingShadows.shadowsSprite.clear();

          for (var12 = 0; var12 < 13; ++var12) {
            for (var4 = 0; var4 < 13; ++var4) {
              SomethingShadows.blockShadows[var12][var4].needsUpdate = true;
            }
          }
        }

        if (GlRenderer.USE_OPENGL) {
          DummyClass46.method1279();
        }

        if (GlRenderer.USE_OPENGL) {
          DummyClass37.method1036(118);
        }

        DummyClass43.method1194();
        DummyClass5.method2210((byte) -90, true);
        DummyClass26.method1720(false, 105);
        if (!GlobalStatics_0.dynamicScene) {
          GlobalStatics_6.method1091(false, -93);
          DummyClass5.method2210((byte) -90, true);
          if (GlRenderer.USE_OPENGL) {
            var12 = GlobalStatics_9.localPlayer.waypointsX[0] >> 3;
            var4 = GlobalStatics_9.localPlayer.waypointsY[0] >> 3;
            GlobalStatics_9.updateSunPosition(var12, var4);
          }

          GlobalStatics_10.method198(false, -32624);
          if (GlobalStatics_10.aByteArrayArray3335 != null) {
            GlobalStatics_10.method272((byte) -124);
          }
        }

        if (GlobalStatics_0.dynamicScene) {
          GlobalStatics_9.method1121(false, (byte) 98);
          DummyClass5.method2210((byte) -90, true);
          if (GlRenderer.USE_OPENGL) {
            var12 = GlobalStatics_9.localPlayer.waypointsX[0] >> 3;
            var4 = GlobalStatics_9.localPlayer.waypointsY[0] >> 3;
            GlobalStatics_9.updateSunPosition(var12, var4);
          }

          DummyClass8.method2223(false, (byte) -121);
        }

        GlobalStatics_9.method313((byte) 90);
        DummyClass5.method2210((byte) -90, true);
        GlobalStatics_7.method2189(GlobalStatics_0.collisionMaps, false, 66);
        if (GlRenderer.USE_OPENGL) {
          DummyClass46.method1270();
        }

        DummyClass5.method2210((byte) -90, true);
        var12 = DummyClass52.anInt1174;
        if (var12 > GlobalStatics_9.currentPlane) {
          var12 = GlobalStatics_9.currentPlane;
        }

        if (var12 < GlobalStatics_9.currentPlane - 1) {
          var12 = -1 + GlobalStatics_9.currentPlane;
        }

        if (GlobalStatics_9.method1986(39)) {
          DummyClass52.method1425(0);
        } else {
          DummyClass52.method1425(DummyClass52.anInt1174);
        }

        DummyClass42.method1188(-113);
        if (GlRenderer.USE_OPENGL && var11) {
          DummyClass10.method2264(true);
          DummyClass26.method1720(true, 105);
          if (!GlobalStatics_0.dynamicScene) {
            GlobalStatics_6.method1091(true, -121);
            DummyClass5.method2210((byte) -90, true);
            GlobalStatics_10.method198(true, -32624);
          }

          if (GlobalStatics_0.dynamicScene) {
            GlobalStatics_9.method1121(true, (byte) 56);
            DummyClass5.method2210((byte) -90, true);
            DummyClass8.method2223(true, (byte) -105);
          }

          GlobalStatics_9.method313((byte) 102);
          DummyClass5.method2210((byte) -90, true);
          GlobalStatics_7
              .method2189(GlobalStatics_0.collisionMaps, true, 112);
          DummyClass5.method2210((byte) -90, true);
          DummyClass42.method1188(-113);
          DummyClass10.method2264(false);
        }

        if (GlRenderer.USE_OPENGL) {
          for (var4 = 0; var4 < 13; ++var4) {
            for (var5 = 0; var5 < 13; ++var5) {
              SomethingShadows.blockShadows[var4][var5]
                  .update(GlobalStatics_4.heightMap[0],
                      var4 * 8, var5 * 8);
            }
          }
        }

        for (var4 = 0; var4 < 104; ++var4) {
          for (var5 = 0; var5 < 104; ++var5) {
            GlobalStatics_10.method1760(var5, (byte) 65, var4);
          }
        }

        GlobalStatics_0.method792(9179409);
        DummyClass43.method1194();
        GlobalStatics_9.method318(7759444);
        GlobalStatics_9.method313((byte) 100);
        GlobalStatics_10.aBoolean3416 = false;
        if (GlobalStatics_10.FRAME != null
            && GlobalStatics_9.gameSocket != null
            && DummyClass15.state == 25) {
          GlobalStatics_9.secureBuffer.writePacket(20);
          GlobalStatics_9.secureBuffer.writeInt(1057001181);
          ++GlobalStatics_9.anInt3365;
        }

        if (!GlobalStatics_0.dynamicScene) {
          int var7 = (GlobalStatics_10.anInt2294 + 6) / 8;
          int var6 = (GlobalStatics_10.anInt2294 - 6) / 8;
          var4 = (GlobalStatics_2.anInt3606 - 6) / 8;
          var5 = (GlobalStatics_2.anInt3606 + 6) / 8;

          for (int var8 = var4 - 1; var8 <= var5 + 1; ++var8) {
            for (int var9 = -1 + var6; var9 <= var7 + 1; ++var9) {
              if (var8 < var4 || var8 > var5 || var9 < var6
                  || var9 > var7) {
                GlobalStatics_10.maps
                    .method2124(-124, GlobalStatics_9.concat(new GameString[]{
                        GlobalStatics_8.MAP_PREFIX,
                        GlobalStatics_9.toString(var8),
                        GlobalStatics_10.UNDERSCORE,
                        GlobalStatics_9.toString(var9)
                    }));
                GlobalStatics_10.maps
                    .method2124(-123, GlobalStatics_9.concat(new GameString[]{
                        DummyClass12.LANDSCAPE_PREFIX,
                        GlobalStatics_9.toString(var8),
                        GlobalStatics_10.UNDERSCORE,
                        GlobalStatics_9.toString(var9)
                    }));
              }
            }
          }
        }

        if (DummyClass15.state == 28) {
          DummyClass26.setState(10, 5);
        } else {
          DummyClass26.setState(30, 5);
          if (GlobalStatics_9.gameSocket != null) {
            GlobalStatics_9.secureBuffer.writePacket(110);
          }
        }

        GlobalStatics_10.method388((byte) 116);
        DummyClass43.method1194();
        GlobalStatics_9.resetFrameRegulator();
      } else {
        DummyClass8.anInt4019 = 2;
      }
    } else {
      DummyClass8.anInt4019 = 1;
    }
  }

}
