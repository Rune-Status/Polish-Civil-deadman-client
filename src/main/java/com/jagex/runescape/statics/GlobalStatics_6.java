package com.jagex.runescape.statics;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.cache.CacheStatics;
import com.jagex.runescape.cache.FileUnpacker;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.common.HashTable;
import com.jagex.runescape.common.MathUtilities;
import com.jagex.runescape.common.TimeUtilities;
import com.jagex.runescape.input.KeyboardStatics;
import com.jagex.runescape.model.AbstractDirectColorSprite;
import com.jagex.runescape.model.AbstractFont;
import com.jagex.runescape.model.AbstractModel;
import com.jagex.runescape.model.AnimationSequence;
import com.jagex.runescape.model.AnimationSomething;
import com.jagex.runescape.model.AreaSoundEffect;
import com.jagex.runescape.sound.audio.AudioStreamEncoder1;
import com.jagex.runescape.model.ClanChatUser;
import com.jagex.runescape.model.ClientScript;
import com.jagex.runescape.model.FloorUnderlay;
import com.jagex.runescape.model.GameObjectConfig;
import com.jagex.runescape.model.GameWorld;
import com.jagex.runescape.model.HintMarker;
import com.jagex.runescape.model.IntegerNode;
import com.jagex.runescape.model.InventoryConfig;
import com.jagex.runescape.model.ItemConfig;
import com.jagex.runescape.model.NPC;
import com.jagex.runescape.model.NpcConfiguration;
import com.jagex.runescape.model.ObjectCache;
import com.jagex.runescape.model.Parameter;
import com.jagex.runescape.model.Player;
import com.jagex.runescape.model.SignLinkRequest;
import com.jagex.runescape.model.SocketStream;
import com.jagex.runescape.model.SoftwareDirectColorSprite;
import com.jagex.runescape.model.SoftwareModel;
import com.jagex.runescape.model.SomethingLight0;
import com.jagex.runescape.model.SomethingPacket151;
import com.jagex.runescape.model.SomethingTexture1;
import com.jagex.runescape.model.SomethingTexture4;
import com.jagex.runescape.model.StillGraphic;
import com.jagex.runescape.model.StillGraphicNode;
import com.jagex.runescape.model.Widget;
import com.jagex.runescape.model.WidgetAccess;
import com.jagex.runescape.model.WidgetUpdate;
import com.jagex.runescape.node.Deque;
import com.jagex.runescape.opengl.BumpShader;
import com.jagex.runescape.opengl.DummyClass33;
import com.jagex.runescape.opengl.DummyClass46;
import com.jagex.runescape.opengl.GLStatics;
import com.jagex.runescape.opengl.GlDirectColorSprite;
import com.jagex.runescape.opengl.GlEnvironment;
import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.GlTexture2d;
import com.jagex.runescape.opengl.GlUtils;
import com.jagex.runescape.opengl.MaterialShader;
import com.jagex.runescape.opengl.MaterialShader3;
import com.jagex.runescape.opengl.MaterialShader4;
import com.jagex.runescape.opengl.MaterialShader5;
import com.jagex.runescape.opengl.SkyboxMaterialShader;
import com.jagex.runescape.opengl.SomethingGl;
import com.jagex.runescape.opengl.SomethingGl0;
import com.jagex.runescape.opengl.WaterShader;
import com.jagex.runescape.scene.SceneGraphTile;
import com.jagex.runescape.scene.SceneNode;
import com.jagex.runescape.scene.SceneSomething;
import com.jagex.runescape.scene.SomethingSceneI;
import com.jagex.runescape.settings.SettingsStatics;
import com.jagex.runescape.sound.midi.MidiSomethingStatics;
import com.jagex.runescape.sound.SomethingMusic0;
import com.jagex.runescape.sound.effect.SoundEffect;
import com.jagex.runescape.sprite.SoftwareIndexedColorSpriteStatics;
import java.io.IOException;
import java.net.Socket;
import java.util.Calendar;
import java.util.Objects;
import java.util.TimeZone;

public class GlobalStatics_6 {

  public static int FAR = 28 * 128;
  public static int NEAR = 50;

  public static FileUnpacker configs;
  public static Calendar aCalendar3581 = Calendar
      .getInstance(TimeZone.getTimeZone("GMT"));
  public static int[] updatedLandscapeIds;
  public static int anInt3589;
  public static int anInt3590 = -1;
  public static int anInt3591;
  public static int[] anIntArray3592 = new int[256];
  public static volatile boolean REPLACE_CANVAS;
  public static int NEXT_CAMERA_PITCH = 128;
  public static boolean aBoolean2311;
  public static long destroyTime;
  public static int anInt2317;
  public static SignLinkRequest socketRequest;
  public static int[][] landscapeEncryptionKeys;
  public static int anInt2330;
  public static int windowWidth;
  public static int anInt2500;
  public static GameString aClass94_2518 = GameStringStatics
      .create("Poser");
  public static byte[][] landscapesData;
  public static FileUnpacker fileUnpacker22;
  public static int anInt2529;
  public static FileUnpacker aClass153_3490;
  public static int[] anIntArray3491 = {0, -1, 0, 1};
  public static int[] regionHashes;
  public static boolean[] aBooleanArray3503;
  public static int anInt3507;
  public static int anInt3517;
  public static int logoFileId = -1;
  public static int anInt1126;
  public static int anInt1127;
  public static boolean aBoolean1641;
  public static int anInt1642;
  public static int[] anIntArray574 = new int[14];
  public static float ambientIntensity;
  public static boolean aBoolean579;
  public static int anInt1881;
  public static int anInt1883;
  public static int anInt1886;
  public static int anInt1887;
  public static int anInt3609;
  public static SomethingLight0[] aClass113Array3610;
  public static int anInt3611;
  public static int anInt3613;
  public static ObjectCache aClass93_743 = new ObjectCache(20);
  public static FileUnpacker quickchats;
  public static FileUnpacker midiInstruments;
  public static int anInt2475;
  public static int anInt2479;
  public static GameString DETAILS = GameStringStatics.create("details");
  public static HashTable variableUpdates = new HashTable(16);
  public static int anInt3681;
  public static int loadingPercent = 10;
  public static int rectangleDebugType;
  public static int[] anIntArray3693 = new int[1000];
  public static ClanChatUser[] aClass3_Sub19Array3694;
  public static int anInt3695;

  public static void method556(int var0, int var1, int var2, byte var3,
      int var4, int var5) {
    if (var3 < -93) {
      int var8 = var2 * var2;
      int var6 = 0;
      int var7 = var1;
      int var11 = var8 << 1;
      int var9 = var1 * var1;
      int var12 = var1 << 1;
      int var10 = var9 << 1;
      int var13 = var8 * (-var12 + 1) + var10;
      int var14 = -(var11 * (-1 + var12)) + var9;
      int var16 = var9 << 2;
      int var17 = var10 * ((var6 << 1) + 3);
      int var15 = var8 << 2;
      int var18 = ((var1 << 1) - 3) * var11;
      int var19 = var16 * (1 + var6);
      int var21;
      int var22;
      if (var5 >= DummyClass13.anInt2020 && GlobalStatics_9.anInt902 >= var5) {
        var21 = DummyClass59
            .method1040(GlTexture2d.anInt3765, var2 + var4, (byte) 0,
                DummyClass55.anInt1425);
        var22 = DummyClass59
            .method1040(GlTexture2d.anInt3765, -var2 + var4, (byte) 0,
                DummyClass55.anInt1425);
        GlobalStatics_10
            .method282(DummyClass35.anIntArrayArray663[var5], var22, 91, var21,
                var0);
      }

      for (int var20 = var15 * (-1 + var1); var7 > 0; var20 -= var15) {
        --var7;
        if (var13 < 0) {
          while (var13 < 0) {
            ++var6;
            var13 += var17;
            var14 += var19;
            var19 += var16;
            var17 += var16;
          }
        }

        var21 = var5 - var7;
        if (var14 < 0) {
          var14 += var19;
          var13 += var17;
          var17 += var16;
          var19 += var16;
          ++var6;
        }

        var14 += -var18;
        var18 -= var15;
        var13 += -var20;
        var22 = var7 + var5;
        if (DummyClass13.anInt2020 <= var22 && GlobalStatics_9.anInt902
            >= var21) {
          int var23 = DummyClass59
              .method1040(GlTexture2d.anInt3765, var6 + var4, (byte) 0,
                  DummyClass55.anInt1425);
          int var24 = DummyClass59
              .method1040(GlTexture2d.anInt3765, -var6 + var4, (byte) 0,
                  DummyClass55.anInt1425);
          if (var21 >= DummyClass13.anInt2020) {
            GlobalStatics_10
                .method282(DummyClass35.anIntArrayArray663[var21], var24, 121,
                    var23,
                    var0);
          }

          if (GlobalStatics_9.anInt902 >= var22) {
            GlobalStatics_10
                .method282(DummyClass35.anIntArrayArray663[var22], var24, -110,
                    var23,
                    var0);
          }
        }
      }

    }
  }

  public static long method557(int var0, int var1, int var2) {
    SceneGraphTile var3 = GLStatics.sceneGraphTiles[var0][var1][var2];
    if (var3 == null) {
      return 0L;
    } else {
      for (int var4 = 0; var4 < var3.anInt2223; ++var4) {
        SceneSomething var5 = var3.sceneGraphNodes[var4];
        if ((var5.aLong498 >> 29 & 3L) == 2L && var5.anInt483 == var1
            && var5.anInt478 == var2) {
          return var5.aLong498;
        }
      }

      return 0L;
    }
  }

  public static void clear49(int var0) {
    GameStringStatics.aClass94_3585 = null;
    GlobalStatics_6.anIntArray3592 = null;
    GameStringStatics.aClass94_3582 = null;
    GameStringStatics.aClass94_3586 = null;
    GlobalStatics_6.configs = null;
    GlobalStatics_6.updatedLandscapeIds = null;
    if (var0 != -29679) {
      GlobalStatics_6.method556(-76, 24, -17, (byte) -85, 58, -87);
    }

    GameStringStatics.aClass94_3583 = null;
    GameStringStatics.aClass94_3584 = null;
    GlobalStatics_6.aCalendar3581 = null;
  }

  public static void method560(int var0) {
    for (int var1 = 0; var1 < 5; ++var1) {
      GLStatics.aBooleanArray2169[var1] = false;
    }

    if (var0 != -21556) {
      GlobalStatics_6.method556(21, 1, 64, (byte) 40, -34, -70);
    }

    GlobalStatics_3.anInt1105 = 0;
    DummyClass8.anInt4014 = 0;
    GlobalStatics_9.anInt1252 = -1;
    GlobalStatics_10.anInt2293 = -1;
    GlobalStatics_9.anInt1753 = 1;
  }

  public static AnimationSomething method133(int var0, int var1) {
    if (var1 != 0) {
      GlobalStatics_6.method135(-59, 112, 16, -6, 77, -69);
    }

    AnimationSomething var2 = (AnimationSomething) DummyClass13.aClass93_2016
        .get(
            var0);
    if (var2 == null) {
      var2 =
          GlobalStatics_6.method1089(GlobalStatics_10.animationBases, false,
              GlobalStatics_7.animationFrames,
              (byte) 118, var0);
      if (var2 != null) {
        DummyClass13.aClass93_2016.get((byte) -75, var2, var0);
      }

      return var2;
    } else {
      return var2;
    }
  }

  public static void method135(int var0, int var1, int var2, int var3, int var4,
      int var5) {
    GlobalStatics_10
        .method282(DummyClass35.anIntArrayArray663[var0], var1 - var2, -76,
            var2 + var1, var5);
    int var6 = 0;
    int var8 = var2 * var2;
    int var9 = var4 * var4;
    int var7 = var4;
    int var10 = var9 << 1;
    int var11 = var8 << 1;
    int var12 = var4 << 1;
    int var13 = var10 + (1 - var12) * var8;
    int var14 = var9 - var11 * (var12 - 1);
    int var15 = var8 << 2;
    if (var3 > -110) {
      GlobalStatics_6.method137(-83, (byte) -91);
    }

    int var16 = var9 << 2;
    int var17 = var10 * (3 + (var6 << 1));
    int var18 = var11 * ((var4 << 1) - 3);
    int var19 = (1 + var6) * var16;
    int var20 = var15 * (var4 - 1);

    while (var7 > 0) {
      --var7;
      int var22 = var7 + var0;
      int var21 = var0 - var7;
      if (var13 < 0) {
        while (var13 < 0) {
          ++var6;
          var13 += var17;
          var14 += var19;
          var19 += var16;
          var17 += var16;
        }
      }

      if (var14 < 0) {
        var13 += var17;
        var17 += var16;
        var14 += var19;
        ++var6;
        var19 += var16;
      }

      int var23 = var6 + var1;
      var14 += -var18;
      var18 -= var15;
      var13 += -var20;
      int var24 = var1 - var6;
      var20 -= var15;
      GlobalStatics_10
          .method282(DummyClass35.anIntArrayArray663[var21], var24, -110, var23,
              var5);
      GlobalStatics_10
          .method282(DummyClass35.anIntArrayArray663[var22], var24, 112, var23,
              var5);
    }
  }

  public static void method136(int var0) {
    GameStringStatics.aClass94_2323 = null;
    GameStringStatics.aClass94_2335 = null;
    if (var0 != -3) {
      GlobalStatics_6.anInt2317 = 98;
    }

    GameStringStatics.aClass94_2331 = null;
    GlobalStatics_6.socketRequest = null;
    GlobalStatics_6.landscapeEncryptionKeys = null;
  }

  public static void method137(int var0, byte var1) {
    if (var1 >= -111) {
      GameStringStatics.aClass94_2335 = null;
    }

    GlobalStatics_9.aClass93_1146.method1522(-127, var0);
    DummyClass13.aClass93_2016.method1522(-126, var0);
  }

  public static void drawScene(int cameraX, int cameraY, int cameraZ, int pitch,
      int yaw,
      byte[][][] var5, int[] var6, int[] var7, int[] var8, int[] var9,
      int[] var10, int var11, byte var12, int var13, int var14) {
    if (cameraX < 0) {
      cameraX = 0;
    } else if (cameraX >= GlobalStatics_4.REGION_WIDTH * 128) {
      cameraX = GlobalStatics_4.REGION_WIDTH * 128 - 1;
    }

    if (cameraZ < 0) {
      cameraZ = 0;
    } else if (cameraZ >= GlobalStatics_1.REGION_HEIGHT * 128) {
      cameraZ = GlobalStatics_1.REGION_HEIGHT * 128 - 1;
    }

    DummyClass44.pitchSine = MathUtilities.SINE_TABLE[pitch];
    GlobalStatics_9.pitchCosine = MathUtilities.COSINE_TABLE[pitch];
    GlobalStatics_10.yawSine = MathUtilities.SINE_TABLE[yaw];
    GlobalStatics_10.yawCosine = MathUtilities.COSINE_TABLE[yaw];
    GlobalStatics_9.CAMERA_X = cameraX;
    GlobalStatics_7.CAMERA_Y = cameraY;
    GlobalStatics_9.CAMERA_Z = cameraZ;
    GLStatics.CAMERA_TILE_X = cameraX / 128;
    GLStatics.CAMERA_TILE_Y = cameraZ / 128;
    GLStatics.viewportLowerX =
        GLStatics.CAMERA_TILE_X - GLStatics.CURRENT_VIEWPORT_SIZE;
    if (GLStatics.viewportLowerX < 0) {
      GLStatics.viewportLowerX = 0;
    }

    GLStatics.viewportLowerZ =
        GLStatics.CAMERA_TILE_Y - GLStatics.CURRENT_VIEWPORT_SIZE;
    if (GLStatics.viewportLowerZ < 0) {
      GLStatics.viewportLowerZ = 0;
    }

    GLStatics.viewportUpperX =
        GLStatics.CAMERA_TILE_X + GLStatics.CURRENT_VIEWPORT_SIZE;
    if (GLStatics.viewportUpperX > GlobalStatics_4.REGION_WIDTH) {
      GLStatics.viewportUpperX = GlobalStatics_4.REGION_WIDTH;
    }

    GlobalStatics_9.viewportUpperZ =
        GLStatics.CAMERA_TILE_Y + GLStatics.CURRENT_VIEWPORT_SIZE;
    if (GlobalStatics_9.viewportUpperZ > GlobalStatics_1.REGION_HEIGHT) {
      GlobalStatics_9.viewportUpperZ = GlobalStatics_1.REGION_HEIGHT;
    }

    int far = GlobalStatics_6.FAR;
    int offsetX;
    int offsetZ;
    for (
        offsetX = 0;
        offsetX
            < GLStatics.CURRENT_VIEWPORT_SIZE + GLStatics.CURRENT_VIEWPORT_SIZE
            + 2; offsetX++) {
      for (
          offsetZ = 0;
          offsetZ
              < GLStatics.CURRENT_VIEWPORT_SIZE
              + GLStatics.CURRENT_VIEWPORT_SIZE
              + 2; offsetZ++) {
        int sceneX =
            (offsetX - GLStatics.CURRENT_VIEWPORT_SIZE << 7) - (
                GlobalStatics_9.CAMERA_X & 127);
        int sceneZ =
            (offsetZ - GLStatics.CURRENT_VIEWPORT_SIZE << 7) - (
                GlobalStatics_9.CAMERA_Z & 127);
        int sceneTileX =
            offsetX + GLStatics.CAMERA_TILE_X
                - GLStatics.CURRENT_VIEWPORT_SIZE;
        int sceneTileZ = offsetZ + GLStatics.CAMERA_TILE_Y
            - GLStatics.CURRENT_VIEWPORT_SIZE;
        if (sceneTileX >= 0 && sceneTileZ >= 0
            && sceneTileX < GlobalStatics_4.REGION_WIDTH
            && sceneTileZ < GlobalStatics_1.REGION_HEIGHT) {
          int lowerZ;
          if (GlobalStatics_2.othrrHeightMap != null) {
            lowerZ =
                GlobalStatics_2.othrrHeightMap[0][sceneTileX][sceneTileZ]
                    - GlobalStatics_7.CAMERA_Y + 128;
          } else {
            lowerZ =
                DummyClass43.somethingHeightMap[0][sceneTileX][sceneTileZ]
                    - GlobalStatics_7.CAMERA_Y
                    + 128;
          }

          int upperZ =
              DummyClass43.somethingHeightMap[3][sceneTileX][sceneTileZ]
                  - GlobalStatics_7.CAMERA_Y
                  - 1000;
          GlobalStatics_9.tileOnScreen[offsetX][offsetZ] =
              GlobalStatics_7.isOnScreen(sceneX, upperZ, lowerZ, sceneZ, far);
        } else {
          GlobalStatics_9.tileOnScreen[offsetX][offsetZ] = false;
        }
      }
    }

    for (
        offsetX = 0;
        offsetX
            < GLStatics.CURRENT_VIEWPORT_SIZE + GLStatics.CURRENT_VIEWPORT_SIZE
            + 1; offsetX++) {
      for (
          offsetZ = 0;
          offsetZ
              < GLStatics.CURRENT_VIEWPORT_SIZE
              + GLStatics.CURRENT_VIEWPORT_SIZE
              + 1; offsetZ++) {
        GLStatics.adjacentTileOnScreen[offsetX][offsetZ] =
            GlobalStatics_9.tileOnScreen[offsetX][offsetZ]
                || GlobalStatics_9.tileOnScreen[offsetX
                + 1][offsetZ] || GlobalStatics_9.tileOnScreen[offsetX][offsetZ
                + 1]
                || GlobalStatics_9.tileOnScreen[offsetX + 1][offsetZ + 1];
      }
    }

    GlobalStatics_9.anIntArray3045 = var6;
    GlobalStatics_7.anIntArray1083 = var7;
    GlobalStatics_9.anIntArray859 = var8;
    GlobalStatics_9.anIntArray2663 = var9;
    GlobalStatics_2.anIntArray39 = var10;
    GlobalStatics_9.method1294();
    if (GlobalStatics_9.aClass3_Sub2ArrayArrayArray2065 != null) {
      DummyClass10.method2264(true);
      GlobalStatics_5
          .drawScene(cameraX, cameraY, cameraZ, null, 0, (byte) 0, var13,
              var14);
      if (GlRenderer.USE_OPENGL) {
        GLStatics.aBoolean3207 = false;
        GLStatics.method551(0, 0);
        GlEnvironment.setFogColor(null);
        DummyClass46.disableLights();
      }

      DummyClass10.method2264(false);
    }

    GlobalStatics_5
        .drawScene(cameraX, cameraY, cameraZ, var5, var11, var12, var13, var14);
  }

  public static void clear83(int var0) {
    GameStringStatics.aClass94_2525 = null;
    GlobalStatics_6.landscapesData = null;
    GameStringStatics.aClass94_2524 = null;
    GlobalStatics_6.fileUnpacker22 = null;
    GameStringStatics.aClass94_2526 = null;
    GameStringStatics.aClass94_2499 = null;
    CacheStatics.aClass49_2505 = null;
    GlobalStatics_6.aClass94_2518 = null;
  }

  public static void method400(long var0, int var2) {
    if (var2 != var0) {
      GlobalStatics_9.SECURE_BUFFER.writePacket(104);
      GlobalStatics_9.SECURE_BUFFER.writeLong(var0);
      ++DummyClass4.anInt3001;
    }
  }

  public static void initializeKeyTable() {
    if (GlobalStatics_9.aString1216.toLowerCase().indexOf("microsoft")
        == -1) {
      if (GlobalStatics_9.setFocusTraversalKeyEnabledMethod == null) {
        KeyboardStatics.KEY_TABLE[192] = 58;
        KeyboardStatics.KEY_TABLE[222] = 59;
      } else {
        KeyboardStatics.KEY_TABLE[222] = 58;
        KeyboardStatics.KEY_TABLE[192] = 28;
        KeyboardStatics.KEY_TABLE[520] = 59;
      }

      KeyboardStatics.KEY_TABLE[45] = 26;
      KeyboardStatics.KEY_TABLE[61] = 27;
      KeyboardStatics.KEY_TABLE[91] = 42;
      KeyboardStatics.KEY_TABLE[59] = 57;
      KeyboardStatics.KEY_TABLE[93] = 43;
      KeyboardStatics.KEY_TABLE[44] = 71;
      KeyboardStatics.KEY_TABLE[92] = 74;
      KeyboardStatics.KEY_TABLE[46] = 72;
      KeyboardStatics.KEY_TABLE[47] = 73;
    } else {
      KeyboardStatics.KEY_TABLE[187] = 27;
      KeyboardStatics.KEY_TABLE[223] = 28;
      KeyboardStatics.KEY_TABLE[221] = 43;
      KeyboardStatics.KEY_TABLE[188] = 71;
      KeyboardStatics.KEY_TABLE[222] = 59;
      KeyboardStatics.KEY_TABLE[192] = 58;
      KeyboardStatics.KEY_TABLE[191] = 73;
      KeyboardStatics.KEY_TABLE[219] = 42;
      KeyboardStatics.KEY_TABLE[190] = 72;
      KeyboardStatics.KEY_TABLE[186] = 57;
      KeyboardStatics.KEY_TABLE[220] = 74;
      KeyboardStatics.KEY_TABLE[189] = 26;
    }
  }

  public static SomethingTexture4 method404(byte var0, Buffer var1) {
    return var0 > -55 ?
        null :
        new SomethingTexture4(var1.method787((byte) 93),
            var1.method787((byte) 55),
            var1.method787((byte) 81), var1.method787((byte) 95),
            var1.readUnsignedMedium((byte) 124),
            var1.readUnsignedMedium((byte) 120), var1.readUnsignedByte());
  }

  public static void clear85(int var0) {
    GlobalStatics_6.aClass153_3490 = null;
    GlobalStatics_6.anIntArray3491 = null;
    GlobalStatics_6.regionHashes = null;
    if (var0 != -28918) {
      GlobalStatics_6.method468(-39);
    }
  }

  public static void method465(int var0, boolean var1) {
    if (!var1) {
      GlobalStatics_6.clear85(92);
    }

    GlobalStatics_9.aClass93_2792.method1522(-128, var0);
  }

  public static WidgetUpdate method466(int var0, int var1, int var2) {
    WidgetUpdate var3 =
        (WidgetUpdate) GlobalStatics_1.aClass130_2194
            .get(var2 | (long) var1 << 32);
    if (var3 == null) {
      var3 = new WidgetUpdate(var1, var2);
      GlobalStatics_1.aClass130_2194.put(var3.key, var3);
    }

    return var3;
  }

  public static boolean method467(GameString var0, int var1) {
    if (var0 == null) {
      return false;
    } else {
      for (int var2 = var1; GlobalStatics_6.anInt3591 > var2; ++var2) {
        if (var0.method1531(GlobalStatics_9.aClass94Array3341[var2])) {
          return true;
        }
      }

      return false;
    }
  }

  public static void method468(int var0) {
    SomethingGl.method1456();
    GlobalStatics_9.anInterface5Array70 = new MaterialShader[7];
    GlobalStatics_9.anInterface5Array70[1] = new SkyboxMaterialShader();
    GlobalStatics_9.anInterface5Array70[2] = new WaterShader();
    GlobalStatics_9.anInterface5Array70[3] = new MaterialShader3();
    GlobalStatics_9.anInterface5Array70[4] = new MaterialShader4();
    GlobalStatics_9.anInterface5Array70[5] = new MaterialShader5();
    GlobalStatics_9.anInterface5Array70[var0] = new BumpShader();
  }

  public static void method474(int var0, int var1) {
    GlobalStatics_0.aClass93_21.method1522(-125, var1);
    DummyClass54.aClass93_1401.method1522(-126, var1);
    if (var0 != 2) {
      GlobalStatics_6.aBooleanArray3503 = null;
    }

    GlobalStatics_9.aClass93_4051.method1522(var0 ^ -127, var1);
    DummyClass14.aClass93_1965.method1522(-128, var1);
  }

  public static void method477(int var0, boolean var1, int var2, Widget var3) {
    if (!var1) {
      GlobalStatics_6.method487(98, (byte) 74);
    }

    if (var3.anInt318 == 1) {
      ++GlobalStatics_3.anInt2459;
      GlobalStatics_9
          .method1177(-1, 0L, (byte) -78, GameStringStatics.EMPTY_STRING, 0,
              (short) 8,
              var3.aClass94_289, var3.anInt279);
    }

    GameString var4;
    if (var3.anInt318 == 2 && !GlobalStatics_9.aBoolean1837) {
      var4 = DummyClass41.method1174(var3, (byte) -31);
      if (var4 != null) {
        ++GlobalStatics_10.anInt3090;
        GlobalStatics_9.method1177(-1, 0L, (byte) -120, GlobalStatics_9.concat(
            new GameString[]{GameStringStatics.aClass94_431,
                var3.aClass94_243}),
            -1, (short) 32,
            var4, var3.anInt279);
      }
    }

    if (var3.anInt318 == 3) {
      ++GlobalStatics_9.anInt1361;
      GlobalStatics_9
          .method1177(-1, 0L, (byte) -59, GameStringStatics.EMPTY_STRING, 0,
              (short) 28,
              GameStringStatics.aClass94_3097, var3.anInt279);
    }

    if (var3.anInt318 == 4) {
      ++GlobalStatics_2.anInt349;
      GlobalStatics_9
          .method1177(-1, 0L, (byte) -71, GameStringStatics.EMPTY_STRING, 0,
              (short) 59,
              var3.aClass94_289, var3.anInt279);
    }

    if (var3.anInt318 == 5) {
      GlobalStatics_9
          .method1177(-1, 0L, (byte) -92, GameStringStatics.EMPTY_STRING, 0,
              (short) 51,
              var3.aClass94_289, var3.anInt279);
      ++GlobalStatics_5.anInt1623;
    }

    if (var3.anInt318 == 6 && GlobalStatics_10.aClass11_3087 == null) {
      GlobalStatics_9
          .method1177(-1, 0L, (byte) -100, GameStringStatics.EMPTY_STRING, -1,
              (short) 41,
              var3.aClass94_289, var3.anInt279);
      ++GlobalStatics_7.anInt2437;
    }

    int var5;
    int var15;
    if (var3.anInt187 == 2) {
      var15 = 0;

      for (var5 = 0; var5 < var3.anInt244; ++var5) {
        for (int var6 = 0; var6 < var3.anInt177; ++var6) {
          int var7 = (32 + var3.anInt285) * var6;
          int var8 = (32 + var3.anInt290) * var5;
          if (var15 < 20) {
            var8 += var3.anIntArray300[var15];
            var7 += var3.anIntArray272[var15];
          }

          if (var2 >= var7 && var8 <= var0 && 32 + var7 > var2
              && var8 + 32 > var0) {
            DummyClass54.aClass11_1402 = var3;
            GlobalStatics_9.anInt2701 = var15;
            if (var3.anIntArray254[var15] > 0) {
              WidgetAccess var9 = GlobalStatics_8.method44(var3);
              ItemConfig var10 =
                  DummyClass35
                      .getItemConfig(var3.anIntArray254[var15] - 1);
              if (GlobalStatics_9.anInt3012 == 1 && var9.method99(31595)) {
                if (GlTexture2d.anInt3764 != var3.anInt279
                    || DummyClass31.anInt1473 != var15) {
                  ++GlobalStatics_2.anInt342;
                  GlobalStatics_9.method1177(-1, var10.anInt787, (byte) -91,
                      GlobalStatics_9.concat(new GameString[]{
                          GameStringStatics.aClass94_378,
                          com.jagex.runescape.statics.GlobalStatics_0.aClass94_1699,
                          var10.aClass94_770
                      }), var15, (short) 40, GameStringStatics.aClass94_3388,
                      var3.anInt279);
                }
              } else if (GlobalStatics_9.aBoolean1837 && var9.method99(31595)) {
                Parameter var18 =
                    GlobalStatics_9.anInt1038 == -1 ? null : GlobalStatics_0
                        .method1210(64, GlobalStatics_9.anInt1038);
                if ((16 & GlobalStatics_9.anInt2051) != 0 && (var18 == null
                    || var10
                    .method1115(var18.anInt3614, 103, GlobalStatics_9.anInt1038)
                    != var18.anInt3614)) {
                  ++GlobalStatics_6.anInt3609;
                  GlobalStatics_9.method1177(GlobalStatics_6.anInt1887,
                      var10.anInt787,
                      (byte) -89, GlobalStatics_9.concat(new GameString[]{
                          DummyClass59.aClass94_676,
                          com.jagex.runescape.statics.GlobalStatics_0.aClass94_1699,
                          var10.aClass94_770
                      }), var15, (short) 3, GameStringStatics.aClass94_3621,
                      var3.anInt279);
                }
              } else {
                ++GlobalStatics_9.anInt2540;
                GameString[] var11 = var10.inventoryOptions;
                if (DummyClass24.aBoolean1656) {
                  var11 = GlobalStatics_9.method822(19406, var11);
                }

                int var12;
                byte var13;
                if (var9.method99(31595)) {
                  for (var12 = 4; var12 >= 3; --var12) {
                    if (var11 != null && var11[var12] != null) {
                      ++GlobalStatics_9.anInt3670;
                      if (var12 == 3) {
                        var13 = 35;
                      } else {
                        var13 = 58;
                      }

                      GlobalStatics_9.method1177(-1, var10.anInt787, (byte) -65,
                          GlobalStatics_9.concat(
                              new GameString[]{GameStringStatics.aClass94_3042,
                                  var10.aClass94_770}),
                          var15, var13, var11[var12], var3.anInt279);
                    }
                  }
                }

                if (var9.method96(-2063688673)) {
                  ++GlobalStatics_9.anInt494;
                  GlobalStatics_9.method1177(DummyClass54.anInt1403,
                      var10.anInt787,
                      (byte) -96, GlobalStatics_9.concat(
                          new GameString[]{GameStringStatics.aClass94_3042,
                              var10.aClass94_770}),
                      var15, (short) 22, GameStringStatics.aClass94_3388,
                      var3.anInt279);
                }

                if (var9.method99(31595) && var11 != null) {
                  for (var12 = 2; var12 >= 0; --var12) {
                    if (var11[var12] != null) {
                      ++DummyClass50.anInt1141;
                      var13 = 0;
                      if (var12 == 0) {
                        var13 = 47;
                      }

                      if (var12 == 1) {
                        var13 = 5;
                      }

                      if (var12 == 2) {
                        var13 = 43;
                      }

                      GlobalStatics_9.method1177(-1, var10.anInt787, (byte) -82,
                          GlobalStatics_9.concat(
                              new GameString[]{GameStringStatics.aClass94_3042,
                                  var10.aClass94_770}),
                          var15, var13, var11[var12], var3.anInt279);
                    }
                  }
                }

                var11 = var3.aClass94Array173;
                if (DummyClass24.aBoolean1656) {
                  var11 = GlobalStatics_9.method822(19406, var11);
                }

                if (var11 != null) {
                  for (var12 = 4; var12 >= 0; --var12) {
                    if (var11[var12] != null) {
                      ++GlobalStatics_10.anInt3420;
                      var13 = 0;
                      if (var12 == 0) {
                        var13 = 25;
                      }

                      if (var12 == 1) {
                        var13 = 23;
                      }

                      if (var12 == 2) {
                        var13 = 48;
                      }

                      if (var12 == 3) {
                        var13 = 7;
                      }

                      if (var12 == 4) {
                        var13 = 13;
                      }

                      GlobalStatics_9.method1177(-1, var10.anInt787, (byte) -51,
                          GlobalStatics_9.concat(
                              new GameString[]{GameStringStatics.aClass94_3042,
                                  var10.aClass94_770}),
                          var15, var13, var11[var12], var3.anInt279);
                    }
                  }
                }

                GlobalStatics_9.method1177(GlobalStatics_10.anInt1719,
                    var10.anInt787, (byte) -98,
                    GlobalStatics_9.concat(
                        new GameString[]{GameStringStatics.aClass94_3042,
                            var10.aClass94_770}), var15,
                    (short) 1006,
                    com.jagex.runescape.statics.GlobalStatics_0.aClass94_1180,
                    var3.anInt279);
              }
            }
          }

          ++var15;
        }
      }
    }

    if (var3.aBoolean233) {
      if (GlobalStatics_9.aBoolean1837) {
        if (GlobalStatics_8.method44(var3).method97(-20710)
            && (32 & GlobalStatics_9.anInt2051) != 0) {
          ++GlobalStatics_9.anInt562;
          GlobalStatics_9.method1177(GlobalStatics_6.anInt1887, 0L, (byte) -113,
              GlobalStatics_9.concat(new GameString[]{
                  DummyClass59.aClass94_676, GlobalStatics_2.aClass94_3703,
                  var3.aClass94_277
              }), var3.anInt191, (short) 12, GameStringStatics.aClass94_3621,
              var3.anInt279);
        }
      } else {
        for (var15 = 9; var15 >= 5; --var15) {
          GameString var16 = GlobalStatics_7
              .method1732(var3, (byte) -71, var15);
          if (var16 != null) {
            GlobalStatics_9
                .method1177(GlobalStatics_9.method173((byte) 126, var15, var3),
                    var15 + 1, (byte) -85, var3.aClass94_277, var3.anInt191,
                    (short) 1003,
                    var16, var3.anInt279);
            ++GlobalStatics_9.anInt3136;
          }
        }

        var4 = DummyClass41.method1174(var3, (byte) -101);
        if (var4 != null) {
          ++GlobalStatics_10.anInt3090;
          GlobalStatics_9
              .method1177(-1, 0L, (byte) -116, var3.aClass94_277, var3.anInt191,
                  (short) 32, var4, var3.anInt279);
        }

        for (var5 = 4; var5 >= 0; --var5) {
          GameString var17 = GlobalStatics_7.method1732(var3, (byte) -65, var5);
          if (var17 != null) {
            ++GlobalStatics_9.anInt3136;
            GlobalStatics_9
                .method1177(GlobalStatics_9.method173((byte) 53, var5, var3),
                    var5 + 1, (byte) -48, var3.aClass94_277, var3.anInt191,
                    (short) 9, var17,
                    var3.anInt279);
          }
        }

        if (GlobalStatics_8.method44(var3).method95(-13081)) {
          ++GlobalStatics_7.anInt2437;
          GlobalStatics_9
              .method1177(-1, 0L, (byte) -74, GameStringStatics.EMPTY_STRING,
                  var3.anInt191,
                  (short) 41, DummyClass44.aClass94_935, var3.anInt279);
        }
      }
    }
  }

  public static boolean method487(int var0, byte var1) {
    if (var1 != -85) {
      GlobalStatics_6.anInt3507 = 56;
    }

    return var0 >= 97 && var0 <= 122 || var0 >= 65 && var0 <= 90;
  }

  public static void clear33(byte var0) {
    GlobalStatics_6.aBooleanArray3503 = null;
    GameStringStatics.aClass94_3496 = null;
  }

  public static void method503(byte var0, int var1) {
    GlobalStatics_10.anInt101 = var1;
    if (var0 == -53) {
      GlobalStatics_6.anInt3611 = 20;
      GlobalStatics_2.anInt3704 = 3;
    }
  }

  public static void method1385(int var0, int var1, byte var2) {
    WidgetUpdate var3 = GlobalStatics_6.method466(4, 6, var1);
    var3.g((byte) 33);
    if (var2 >= -103) {
      GameStringStatics.aClass94_1122 = null;
    }

    var3.anInt3598 = var0;
  }

  public static void method1388(boolean var0) {
    GameStringStatics.aClass94_1122 = null;
    GameStringStatics.CLIENT_SCRIPT_ERROR = null;
    if (!var0) {
      GlobalStatics_6.anInt1126 = 8;
    }
  }

  public static boolean method1391(int var0) {
    return var0 != ~GlobalStatics_9.anInt154
        || DummyClass55.aClass3_Sub24_Sub4_1421.method473(-128);
  }

  public static void method1733(int var0) {
    GameStringStatics.aClass94_1647 = null;
    GameStringStatics.COMMAND_WM2 = null;
    GameStringStatics.aClass94_1645 = null;
    if (var0 != -17148) {
      GlobalStatics_6.anInt1642 = 54;
    }
  }

  public static int method1734(int var0, float var1, int var2, int var3,
      int[][] var4, int[][] var5,
      int var6, float[][] var7, int var8, byte var9, int var10,
      boolean var11, SomethingGl0 var12, float[][] var13, int var14,
      int var15, float[][] var16, int var17) {
    int var18;
    if (var10 == 1) {
      var18 = var15;
      var15 = var17;
      var17 = -var18 + 128;
    } else {
      if (var10 == 2) {
        var17 = -var17 + 128;
        var15 = -var15 + 128;
      } else {
        if (var10 == 3) {
          var18 = var15;
          var15 = 128 - var17;
          var17 = var18;
        }
      }
    }

    float var19;
    int var21;
    float var20;
    float var30;
    if (var15 == 0 && var17 == 0) {
      var19 = var16[var6][var14];
      var20 = var7[var6][var14];
      var30 = var13[var6][var14];
      var21 = var2;
    } else if (var15 == 128 && var17 == 0) {
      var21 = var3;
      var19 = var16[var6 + 1][var14];
      var20 = var7[1 + var6][var14];
      var30 = var13[var6 + 1][var14];
    } else if (var15 == 128 && var17 == 128) {
      var20 = var7[1 + var6][var14 + 1];
      var30 = var13[var6 + 1][1 + var14];
      var19 = var16[1 + var6][var14 + 1];
      var21 = var8;
    } else if (var15 == 0 && var17 == 128) {
      var20 = var7[var6][1 + var14];
      var19 = var16[var6][1 + var14];
      var30 = var13[var6][var14 + 1];
      var21 = var0;
    } else {
      var30 = var13[var6][var14];
      var19 = var16[var6][var14];
      float var23 = var17 / 128.0F;
      float var22 = var15 / 128.0F;
      var30 += (var13[var6 + 1][var14] - var30) * var22;
      var19 += (-var19 + var16[var6 + 1][var14]) * var22;
      float var24 = var13[var6][var14 + 1];
      float var25 = var16[var6][var14 + 1];
      var25 += (-var25 + var16[var6 + 1][var14 + 1]) * var22;
      var20 = var7[var6][var14];
      var19 += var23 * (-var19 + var25);
      float var26 = var7[var6][1 + var14];
      var24 += (-var24 + var13[var6 + 1][var14 + 1]) * var22;
      var30 += var23 * (-var30 + var24);
      var26 += (-var26 + var7[1 + var6][var14 + 1]) * var22;
      var20 += (-var20 + var7[var6 + 1][var14]) * var22;
      var20 += (-var20 + var26) * var23;
      int var27 = GlobalStatics_10.method210(18348, var15, var2, var3);
      int var28 = GlobalStatics_10.method210(18348, var15, var0, var8);
      var21 = GlobalStatics_10.method210(18348, var17, var27, var28);
    }

    if (var9 > -111) {
      return -54;
    } else {
      int var32 = var17 + (var14 << 7);
      int var33 = GlobalStatics_9
          .method408(var15, (byte) -51, var14, var5, var6, var17);
      int var31 = (var6 << 7) + var15;
      return var12.method146(var31, var33, var32, var30, var19, var20,
          var11 ? -256 & var21 : var21, var4 != null ?
              (var33 - GlobalStatics_9
                  .method408(var15, (byte) 103, var14, var4, var6,
                      var17)) / var1 :
              0.0F);
    }
  }

  public static int method1735(int var0) {
    try {
      if (GLStatics.anInt692 == 0) {
        if (TimeUtilities.getCurrentTimeMillis() - 5000L
            < GlobalStatics_10.aLong3411) {
          return 0;
        }

        GlobalStatics_6.socketRequest =
            DummyClass35.signLink
                .method1441((byte) 8, GlobalStatics_8.serverHost,
                    DummyClass24.anInt1658);
        GlobalStatics_10.aLong261 = TimeUtilities.getCurrentTimeMillis();
        GLStatics.anInt692 = 1;
      }

      if (30000L + GlobalStatics_10.aLong261 < TimeUtilities
          .getCurrentTimeMillis()) {
        return GlobalStatics_10.method179((byte) 92, 1000);
      }

      int var1;
      int var2;
      if (GLStatics.anInt692 == 1) {
        if (GlobalStatics_6.socketRequest.status == 2) {
          return GlobalStatics_10.method179((byte) 92, 1001);
        }

        if (GlobalStatics_6.socketRequest.status != 1) {
          return -1;
        }

        GlobalStatics_9.GAME_SOCKET =
            new SocketStream((Socket) GlobalStatics_6.socketRequest.result,
                DummyClass35.signLink);
        GlobalStatics_9.SECURE_BUFFER.position = 0;
        GlobalStatics_6.socketRequest = null;
        var1 = 0;
        if (GlobalStatics_6.aBoolean579) {
          var1 = GlobalStatics_2.anInt3608;
        }

        GlobalStatics_9.SECURE_BUFFER.writeByte(255);
        GlobalStatics_9.SECURE_BUFFER.writeInt(var1);
        GlobalStatics_9.GAME_SOCKET
            .write(GlobalStatics_9.SECURE_BUFFER.bytes, 0,
                GlobalStatics_9.SECURE_BUFFER.position);
        if (GlobalStatics_9.audioOutputStream0 != null) {
          GlobalStatics_9.audioOutputStream0.pause();
        }

        if (GlobalStatics_9.audioOutputStream1 != null) {
          GlobalStatics_9.audioOutputStream1.pause();
        }

        var2 = GlobalStatics_9.GAME_SOCKET.read();
        if (GlobalStatics_9.audioOutputStream0 != null) {
          GlobalStatics_9.audioOutputStream0.pause();
        }

        if (GlobalStatics_9.audioOutputStream1 != null) {
          GlobalStatics_9.audioOutputStream1.pause();
        }

        if (var2 != 0) {
          return GlobalStatics_10.method179((byte) 92, var2);
        }

        GLStatics.anInt692 = 2;
      }

      if (GLStatics.anInt692 == 2) {
        if (GlobalStatics_9.GAME_SOCKET.available() < 2) {
          return -1;
        }

        GlobalStatics_9.anInt1002 = GlobalStatics_9.GAME_SOCKET.read();
        GlobalStatics_9.anInt1002 <<= 8;
        GlobalStatics_9.anInt1002 += GlobalStatics_9.GAME_SOCKET.read();
        GLStatics.anInt692 = 3;
        GlobalStatics_10.anInt2484 = 0;
        GlobalStatics_10.aByteArray3396 = new byte[GlobalStatics_9.anInt1002];
      }

      if (GLStatics.anInt692 == 3) {
        var1 = GlobalStatics_9.GAME_SOCKET.available();
        if (var1 < 1) {
          return -1;
        }

        if (var1 > -GlobalStatics_10.anInt2484 + GlobalStatics_9.anInt1002) {
          var1 = GlobalStatics_9.anInt1002 - GlobalStatics_10.anInt2484;
        }

        GlobalStatics_9.GAME_SOCKET.readBytes(GlobalStatics_10.aByteArray3396,
            GlobalStatics_10.anInt2484, var1);
        GlobalStatics_10.anInt2484 += var1;
        if (GlobalStatics_10.anInt2484 >= GlobalStatics_9.anInt1002) {
          if (GlobalStatics_10.method278(4, GlobalStatics_10.aByteArray3396)) {
            GlobalStatics_10.aClass44_Sub1Array3201 = new GameWorld[GlobalStatics_9.anInt906];
            var2 = 0;

            for (int var3 = GlobalStatics_10.anInt3054;
                var3 <= GlobalStatics_8.anInt1416; ++var3) {
              GameWorld var4 = GlobalStatics_6.method130(91, var3);
              if (var4 != null) {
                GlobalStatics_10.aClass44_Sub1Array3201[var2++] = var4;
              }
            }

            GlobalStatics_9.GAME_SOCKET.destroy();
            GlobalStatics_9.GAME_SOCKET = null;
            GlobalStatics_7.anInt1088 = 0;
            GLStatics.anInt692 = 0;
            GlobalStatics_10.aByteArray3396 = null;
            GlobalStatics_10.aLong3411 = TimeUtilities
                .getCurrentTimeMillis();
            return 0;
          }

          return GlobalStatics_10.method179((byte) 92, 1002);
        }

        return -1;
      }
    } catch (IOException var5) {
      return GlobalStatics_10.method179((byte) 92, 1003);
    }

    if (var0 != 29984) {
      GlobalStatics_6
          .method1734(13, 0.10791027F, 20, 124, null, null, -85, null, -119,
              (byte) -105, -5, false,
              null, null, 5, -100, null, -36);
    }

    return -1;
  }

  public static int method1736(int var0, int var1, int var2, int var3) {
    if (GlobalStatics_4.heightMap == null) {
      return 0;
    } else {
      int var4 = var2 >> 7;
      int var5 = var3 >> 7;
      if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
        int var7 = 127 & var2;
        int var8 = var3 & 127;
        int var6 = var0;
        if (var0 < 3
            && (2 & GlobalStatics_10.tileFlags[1][var4][var5]) == 2) {
          var6 = var0 + 1;
        }

        int var10 =
            var7 * GlobalStatics_4.heightMap[var6][var1 + var4][1 + var5]
                + GlobalStatics_4.heightMap[var6][var4][var5 + 1] * (-var7
                + 128) >> 7;
        int var9 = var7 * GlobalStatics_4.heightMap[var6][var4 + 1][var5]
            + (-var7 + 128) * GlobalStatics_4.heightMap[var6][var4][var5] >> 7;
        return var8 * var10 + (128 - var8) * var9 >> 7;
      } else {
        return 0;
      }
    }
  }

  public static void clear18(boolean var0) {
    GameStringStatics.aClass94_577 = null;
    if (var0) {
      GlobalStatics_6.anIntArray574 = null;
      GameStringStatics.CHALLENGE_REQ = null;
      GameStringStatics.COMMAND_FPS_OFF = null;
    }
  }

  public static void method979(int var0, int var1, int var2, byte var3) {
    GameString var4 = GlobalStatics_9.concat(new GameString[]{
        GameStringStatics.aClass94_853, GlobalStatics_9.toString(var2),
        GameStringStatics.aClass94_3268,
        GlobalStatics_9.toString(var0 >> 6), GameStringStatics.aClass94_3268,
        GlobalStatics_9.toString(var1 >> 6), GameStringStatics.aClass94_3268,
        GlobalStatics_9.toString(var0 & 63), GameStringStatics.aClass94_3268,
        GlobalStatics_9.toString(63 & var1)
    });
    var4.method1549(false);
    if (var3 != -4) {
      GameStringStatics.aClass94_577 = null;
    }

    GlobalStatics_7.handleCommand(var4);
  }

  public static void method2065(byte var0, FileUnpacker var1,
      FileUnpacker var2) {
    GlobalStatics_9.aClass153_3227 = var1;
    if (var0 <= -103) {
      GlobalStatics_3.aClass153_1852 = var2;
    }
  }

  public static void method2067(boolean var0) {
    if (!var0) {
      for (
          StillGraphicNode var1 = (StillGraphicNode) GlobalStatics_1.stillGraphics
              .getFirst();
          var1 != null;
          var1 = (StillGraphicNode) GlobalStatics_1.stillGraphics.getNext()) {
        StillGraphic var2 = var1.aClass140_Sub2_3545;
        if (var2.anInt2717 == GlobalStatics_9.currentPlane
            && !var2.aBoolean2718) {
          if (var2.anInt2703 <= GlobalStatics_4.updateCycle) {
            var2.method1955(true, GlobalStatics_7.loopCycle);
            if (var2.aBoolean2718) {
              var1.unlinkNode();
            } else {
              DummyClass29.addNodeToSceneGraph(var2.anInt2717, var2.anInt2716,
                  var2.anInt2710,
                  var2.anInt2712, 60, var2, 0, -1L, false);
            }
          }
        } else {
          var1.unlinkNode();
        }
      }

    }
  }

  public static void method2068(NpcConfiguration var0, int var1, int var2,
      int var3, int var4) {
    if (GlobalStatics_10.amountContextActions < 400) {
      if (var0.anIntArray1292 != null) {
        var0 = var0.method1471((byte) 66);
      }

      if (var0 != null) {
        if (var0.aBoolean1270) {
          if (var2 > -83) {
            GameStringStatics.aClass94_1884 = null;
          }

          GameString var5 = var0.aClass94_1273;
          if (var0.anInt1260 != 0) {
            GameString var6 =
                GlobalStatics_5.gameId == 1 ? GameStringStatics.aClass94_2526
                    : DummyClass32.aClass94_525;
            var5 = GlobalStatics_9.concat(new GameString[]{
                var5, GlobalStatics_9.method1295(var0.anInt1260, (byte) -122,
                GlobalStatics_9.localPlayer.combatLevel),
                GameStringStatics.aClass94_1072, var6,
                GlobalStatics_9.toString(var0.anInt1260),
                GameStringStatics.aClass94_2335
            });
          }

          if (GlobalStatics_9.anInt3012 == 1) {
            GlobalStatics_9
                .method1177(DummyClass54.anInt1403, var3, (byte) -125,
                    GlobalStatics_9.concat(new GameString[]{
                        GameStringStatics.aClass94_378,
                        GlobalStatics_2.aClass94_3702, var5
                    }), var1, (short) 26, GameStringStatics.aClass94_3388,
                    var4);
            ++GlobalStatics_9.anInt816;
          } else if (!GlobalStatics_9.aBoolean1837) {
            ++com.jagex.runescape.statics.GlobalStatics_0.anInt2592;
            GameString[] var11 = var0.aClass94Array1259;
            if (DummyClass24.aBoolean1656) {
              var11 = GlobalStatics_9.method822(19406, var11);
            }

            int var7;
            if (var11 != null) {
              for (var7 = 4; var7 >= 0; --var7) {
                if (var11[var7] != null && (GlobalStatics_5.gameId != 0
                    || !var11[var7]
                    .method1531(GameStringStatics.aClass94_3427))) {
                  ++GlobalStatics_11.anInt763;
                  byte var8 = 0;
                  if (var7 == 0) {
                    var8 = 17;
                  }

                  if (var7 == 1) {
                    var8 = 16;
                  }

                  int var9 = -1;
                  if (var7 == 2) {
                    var8 = 4;
                  }

                  if (var7 == 3) {
                    var8 = 19;
                  }

                  if (var0.anInt1296 == var7) {
                    var9 = var0.anInt1253;
                  }

                  if (var7 == var0.anInt1289) {
                    var9 = var0.anInt1278;
                  }

                  if (var7 == 4) {
                    var8 = 2;
                  }

                  GlobalStatics_9.method1177(var9, var3, (byte) -103,
                      GlobalStatics_9.concat(
                          new GameString[]{DummyClass22.aClass94_1738, var5}),
                      var1, var8, var11[var7], var4);
                }
              }
            }

            if (GlobalStatics_5.gameId == 0 && var11 != null) {
              for (var7 = 4; var7 >= 0; --var7) {
                if (var11[var7] != null && var11[var7].method1531(
                    GameStringStatics.aClass94_3427)) {
                  ++GlobalStatics_7.anInt4054;
                  short var14 = 0;
                  if (var0.anInt1260
                      > GlobalStatics_9.localPlayer.combatLevel) {
                    var14 = 2000;
                  }

                  short var13 = 0;
                  if (var7 == 0) {
                    var13 = 17;
                  }

                  if (var7 == 1) {
                    var13 = 16;
                  }

                  if (var7 == 2) {
                    var13 = 4;
                  }

                  if (var7 == 3) {
                    var13 = 19;
                  }

                  if (var7 == 4) {
                    var13 = 2;
                  }

                  if (var13 != 0) {
                    var13 += var14;
                  }

                  GlobalStatics_9.method1177(var0.anInt1298, var3, (byte) -128,
                      GlobalStatics_9.concat(
                          new GameString[]{DummyClass22.aClass94_1738, var5}),
                      var1, var13, var11[var7], var4);
                }
              }
            }

            GlobalStatics_9
                .method1177(GlobalStatics_10.anInt1719, var3, (byte) -73,
                    GlobalStatics_9.concat(
                        new GameString[]{DummyClass22.aClass94_1738, var5}),
                    var1,
                    (short) 1007,
                    com.jagex.runescape.statics.GlobalStatics_0.aClass94_1180,
                    var4);
          } else {
            Parameter var12 = GlobalStatics_9.anInt1038 == -1 ?
                null :
                com.jagex.runescape.statics.GlobalStatics_0
                    .method1210(64, GlobalStatics_9.anInt1038);
            if ((2 & GlobalStatics_9.anInt2051) != 0 && (var12 == null
                || var0.method1475(GlobalStatics_9.anInt1038, -26460,
                var12.anInt3614)
                != var12.anInt3614)) {
              GlobalStatics_9
                  .method1177(GlobalStatics_6.anInt1887, var3, (byte) -93,
                      GlobalStatics_9.concat(new GameString[]{
                          DummyClass59.aClass94_676,
                          GlobalStatics_2.aClass94_3702,
                          var5
                      }), var1, (short) 45, GameStringStatics.aClass94_3621,
                      var4);
              ++DummyClass25.anInt1629;
            }
          }

        }
      }
    }
  }

  public static InventoryConfig method2069(int var0, int var1) {
    if (var1 >= -99) {
      return null;
    } else {
      InventoryConfig var2 =
          (InventoryConfig) GlobalStatics_9.aClass47_818.get(var0, 1400);
      if (var2 != null) {
        return var2;
      } else {
        byte[] var3 = GlobalStatics_10.aClass153_105.getBytes(5, var0);
        var2 = new InventoryConfig();
        if (var3 != null) {
          var2.method610(new Buffer(var3), 0);
        }

        GlobalStatics_9.aClass47_818.put(var0, var2);
        return var2;
      }
    }
  }

  public static void method2070(byte var0) {
    GameStringStatics.aClass94_1884 = null;
    GameStringStatics.aClass94_1888 = null;
    if (var0 < 0) {
      GlobalStatics_6.anInt1881 = -60;
    }

    GameStringStatics.aClass94_1882 = null;
    GameStringStatics.COOKIE_HOST = null;
  }

  public static int method571(int var0) {
    return var0 >= -57 ?
        -107 :
        GlobalStatics_9.aFloat3979 == 3.0D ?
            37 :
            GlobalStatics_9.aFloat3979 == 4.0D ?
                50 :
                GlobalStatics_9.aFloat3979 == 6.0D ? 75
                    : GlobalStatics_9.aFloat3979 == 8.0D ? 100 : 200;
  }

  public static ClientScript method572(int var0, byte var1) {
    ClientScript var2 = (ClientScript) DummyClass42.aClass47_885
        .get(var0, 1400);
    if (var2 != null) {
      return var2;
    } else {
      byte[] var3 = GlobalStatics_10.scripts.getBytes(var0, 0);
      if (var3 != null) {
        var2 = new ClientScript();
        if (var1 != -91) {
          GlobalStatics_6.aClass113Array3610 = null;
        }

        Buffer var4 = new Buffer(var3);
        var4.position = -2 + var4.bytes.length;
        int var5 = var4.readUnsignedShort();
        int var6 = -12 + var4.bytes.length - 2 - var5;
        var4.position = var6;
        int var7 = var4.readInt();
        var2.anInt3680 = var4.readUnsignedShort();
        var2.anInt3687 = var4.readUnsignedShort();
        var2.anInt3678 = var4.readUnsignedShort();
        var2.anInt3682 = var4.readUnsignedShort();
        int var8 = var4.readUnsignedByte();
        int var9;
        int var10;
        if (var8 > 0) {
          var2.aClass130Array3685 = new HashTable[var8];

          for (var9 = 0; var9 < var8; ++var9) {
            var10 = var4.readUnsignedShort();
            HashTable var11 = new HashTable(
                GLStatics.nearestPo2(var10));
            var2.aClass130Array3685[var9] = var11;

            while (var10-- > 0) {
              int var12 = var4.readInt();
              int var13 = var4.readInt();
              var11.put(var12, new IntegerNode(var13));
            }
          }
        }

        var4.position = 0;
        var2.aClass94_3686 = var4.method750();
        var2.anIntArray3683 = new int[var7];
        var2.aClass94Array3688 = new GameString[var7];
        var9 = 0;

        for (
            var2.anIntArray3690 = new int[var7];
            var6 > var4.position; var2.anIntArray3683[var9++] = var10) {
          var10 = var4.readUnsignedShort();
          if (var10 == 3) {
            var2.aClass94Array3688[var9] = var4.readString();
          } else {
            if (var10 < 100 && var10 != 21 && var10 != 38 && var10 != 39) {
              var2.anIntArray3690[var9] = var4.readInt();
            } else {
              var2.anIntArray3690[var9] = var4.readUnsignedByte();
            }
          }
        }

        DummyClass42.aClass47_885.put(var0, var2);
        return var2;
      } else {
        return null;
      }
    }
  }

  public static void method573(int var0) {
    if (var0 != -11346) {
      GlobalStatics_6.anInt3611 = -69;
    }

    GlobalStatics_6.aClass113Array3610 = null;
  }

  public static void method574(NPC var0, boolean var1) {
    if (!var1) {
      for (
          AreaSoundEffect var2 = (AreaSoundEffect) GlobalStatics_4.aClass61_1242
              .getFirst();
          var2 != null;
          var2 = (AreaSoundEffect) GlobalStatics_4.aClass61_1242.getNext()) {
        if (var0 == var2.aClass140_Sub4_Sub2_2324) {
          if (var2.aClass3_Sub24_Sub1_2312 != null) {
            GlobalStatics_9.aClass3_Sub24_Sub2_2563.method461(
                var2.aClass3_Sub24_Sub1_2312);
            var2.aClass3_Sub24_Sub1_2312 = null;
          }

          var2.unlinkNode();
          return;
        }
      }

    }
  }

  public static void method575(FileUnpacker var0, int var1) {
    if (var1 != -1) {
      GlobalStatics_6.method575(null, -38);
    }

    GlobalStatics_9.aClass153_2536 = var0;
  }

  public static int method576(GameString var0, boolean var1) {
    if (DummyClass25.aClass131_1624 != null && var0.getLength() != 0) {
      if (var1) {
        return -117;
      } else {
        for (int var2 = 0; var2 < DummyClass25.aClass131_1624.anInt1720;
            ++var2) {
          if (DummyClass25.aClass131_1624.aClass94Array1721[var2].method1560(
              GameStringStatics.aClass94_3192, true,
              GameStringStatics.aClass94_4066)
              .method1528((byte) -42, var0)) {
            return var2;
          }
        }

        return -1;
      }
    } else {
      return -1;
    }
  }

  public static void method577(int var0, int var1, int var2, int var3,
      SceneNode var4,
      SceneNode var5, int var6, int var7, int var8, int var9, long var10) {
    if (var4 != null) {
      SomethingSceneI var12 = new SomethingSceneI();
      var12.aLong428 = var10;
      var12.anInt424 = var1 * 128 + 64;
      var12.anInt427 = var2 * 128 + 64;
      var12.anInt425 = var3;
      var12.aClass140_429 = var4;
      var12.aClass140_423 = var5;
      var12.anInt432 = var6;
      var12.anInt420 = var7;
      var12.anInt430 = var8;
      var12.anInt426 = var9;

      for (int var13 = var0; var13 >= 0; --var13) {
        if (GLStatics.sceneGraphTiles[var13][var1][var2] == null) {
          GLStatics.sceneGraphTiles[var13][var1][var2] =
              new SceneGraphTile(var13, var1, var2);
        }
      }

      GLStatics.sceneGraphTiles[var0][var1][var2].aClass19_2233 = var12;
    }
  }

  public static boolean method1088(boolean var0) {
    if (GlobalStatics_9.aBoolean3641) {
      try {
        GameStringStatics.aClass94_106.method1577(-1857);
        return true;
      } catch (Throwable var2) {
      }
    }

    if (var0) {
      GlobalStatics_6.aClass93_743 = null;
    }

    return false;
  }

  public static AnimationSomething method1089(FileUnpacker bases, boolean var1,
      FileUnpacker frames,
      byte var3, int var4) {
    boolean var5 = true;
    if (var3 <= 71) {
      return null;
    } else {
      int[] var6 = bases.getChildIds(var4);

      for (int i : var6) {
        byte[] var8 = bases.getBytes(i, var4, 0);
        if (var8 == null) {
          var5 = false;
        } else {
          int var9 = (255 & var8[0]) << 8 | var8[1] & 255;
          byte[] var10;
          if (var1) {
            var10 = frames.getBytes(var9, 0, 0);
          } else {
            var10 = frames.getBytes(0, var9, 0);
          }

          if (var10 == null) {
            var5 = false;
          }
        }
      }

      if (var5) {
        try {
          return new AnimationSomething(bases, frames, var4, var1);
        } catch (Exception var11) {
          return null;
        }
      } else {
        return null;
      }
    }
  }

  public static void method1091(boolean var0, int var1) {
    byte var2;
    byte[][] fileData;
    if (GlRenderer.USE_OPENGL && var0) {
      var2 = 1;
      fileData = GlobalStatics_9.updatedMapsData;
    } else {
      var2 = 4;
      fileData = GlobalStatics_9.aByteArrayArray3027;
    }

    int var4 = fileData.length;

    int var5;
    int var6;
    int var7;
    byte[] bytes;
    for (var5 = 0; var4 > var5; ++var5) {
      var6 =
          -GlobalStatics_10.REGION_BASE_X + 64 * (
              GlobalStatics_6.regionHashes[var5]
                  >> 8);
      var7 = -GlobalStatics_9.REGION_BASE_Y + 64 * (255
          & GlobalStatics_6.regionHashes[var5]);
      bytes = fileData[var5];
      if (bytes != null) {
        DummyClass43.method1194();
        com.jagex.runescape.statics.GlobalStatics_0.method777(
            com.jagex.runescape.statics.GlobalStatics_0.collisionMaps, var0,
            -48 + 8 * GlobalStatics_2.anInt3606,
            var7, 4, var6, (GlobalStatics_10.anInt2294 - 6) * 8, bytes);
      }
    }

    var5 = 0;
    if (var1 > -66) {
      GlobalStatics_6.method1088(true);
    }

    for (; var4 > var5; ++var5) {
      var6 =
          -GlobalStatics_10.REGION_BASE_X + 64 * (
              GlobalStatics_6.regionHashes[var5]
                  >> 8);
      var7 = -GlobalStatics_9.REGION_BASE_Y + 64 * (255
          & GlobalStatics_6.regionHashes[var5]);
      bytes = fileData[var5];
      if (bytes == null && GlobalStatics_10.anInt2294 < 800) {
        DummyClass43.method1194();

        for (int var9 = 0; var9 < var2; ++var9) {
          GlobalStatics_9.method870(var9, (byte) 102, var7, var6, 64, 64);
        }
      }
    }
  }

  public static void method1093(boolean var0) {
    if (var0) {
      GlobalStatics_6.method1093(true);
    }

    for (int var1 = 0; var1 < 100; ++var1) {
      GlobalStatics_9.aBooleanArray3674[var1] = true;
    }
  }

  public static void method1095(int x, int var1, int var2, Widget[] widgets,
      int width, int var5, int y,
      int height, byte var8, int var9) {
    if (GlRenderer.USE_OPENGL) {
      GlUtils.clip(x, y, width, height);
    } else {
      DummyClass47.method1324(x, y, width, height);
      DummyClass40.method1134();
    }

    for (Widget widget : widgets) {
      if (widget != null && (widget.anInt190 == var5
          || var5 == 0xabcdabcd && widget == DummyClass42.aClass11_886)) {
        int var12;
        if (var9 == -1) {
          GlobalStatics_5.quadx0[GlobalStatics_9.widgetQuads] =
              var2 + widget.anInt306;
          GlobalStatics_9.quady0[GlobalStatics_9.widgetQuads] =
              widget.anInt210 + var1;
          GlTexture2d.quadx1[GlobalStatics_9.widgetQuads] = widget.anInt168;
          GlobalStatics_9.quady1[GlobalStatics_9.widgetQuads] = widget.zoom;
          var12 = GlobalStatics_9.widgetQuads++;
        } else {
          var12 = var9;
        }

        widget.anInt204 = GlobalStatics_4.updateCycle;
        widget.anInt292 = var12;
        if (!widget.aBoolean233 || !GlobalStatics_8.method51(widget)) {
          if (widget.anInt189 > 0) {
            GlobalStatics_9.method81((byte) -128, widget);
          }

          int var14 = var1 + widget.anInt210;
          int var15 = widget.anInt223;
          int var13 = widget.anInt306 + var2;
          if (GlobalStatics_9.aBoolean1040 && (
              GlobalStatics_8.method44(widget).anInt2205 != 0
                  || widget.anInt187 == 0) && var15 > 127) {
            var15 = 127;
          }

          int var17;
          int var16;
          if (widget == DummyClass42.aClass11_886) {
            if (var5 != -1412584499 && !widget.aBoolean200) {
              GlobalStatics_2.anInt3602 = var2;
              GlobalStatics_7.anInt1082 = var1;
              GlobalStatics_9.aClass11Array1836 = widgets;
              continue;
            }

            if (GlobalStatics_9.aBoolean3975 && DummyClass52.aBoolean1167) {
              var17 = GlobalStatics_0.anInt1709;
              var16 = GlobalStatics_9.anInt1676;
              var17 -= DummyClass53.anInt1336;
              if (var17 < DummyClass21.anInt1761) {
                var17 = DummyClass21.anInt1761;
              }

              if (var17 + widget.zoom > DummyClass18.aClass11_88.zoom
                  + DummyClass21.anInt1761) {
                var17 =
                    -widget.zoom + DummyClass18.aClass11_88.zoom
                        + DummyClass21.anInt1761;
              }

              var14 = var17;
              var16 -= GlobalStatics_6.anInt1881;
              if (GlobalStatics_10.anInt3156 > var16) {
                var16 = GlobalStatics_10.anInt3156;
              }

              if (DummyClass18.aClass11_88.anInt168
                  + GlobalStatics_10.anInt3156 < widget.anInt168 + var16) {
                var16 = -widget.anInt168 + DummyClass18.aClass11_88.anInt168
                    + GlobalStatics_10.anInt3156;
              }

              var13 = var16;
            }

            if (!widget.aBoolean200) {
              var15 = 128;
            }
          }

          int var19;
          int var18;
          int var21;
          int var20;
          if (widget.anInt187 == 2) {
            var19 = height;
            var18 = width;
            var17 = y;
            var16 = x;
          } else {
            var17 = var14 > y ? var14 : y;
            var16 = x < var13 ? var13 : x;
            var20 = widget.anInt168 + var13;
            var21 = var14 + widget.zoom;
            if (widget.anInt187 == 9) {
              ++var21;
              ++var20;
            }

            var19 = height <= var21 ? height : var21;
            var18 = var20 >= width ? width : var20;
          }

          if (!widget.aBoolean233 || var18 > var16 && var17 < var19) {
            int var23;
            int var22;
            int var25;
            int var24;
            int var26;
            int var29;
            int var28;
            int var47;
            if (widget.anInt189 != 0) {
              if (widget.anInt189 == 1337
                  || widget.anInt189 == 1403 && GlRenderer.USE_OPENGL) {
                GlobalStatics_8.aClass11_2091 = widget;
                GlobalStatics_2.anInt2567 = var14;
                DummyClass41.anInt865 = var13;
                GlobalStatics_10
                    .method338(-6403, widget.zoom, widget.anInt189 == 1403,
                        var13,
                        widget.anInt168, var14);
                if (GlRenderer.USE_OPENGL) {
                  GlUtils.clip(x, y, width, height);
                } else {
                  DummyClass47.method1324(x, y, width, height);
                }
                continue;
              }

              if (widget.anInt189 == 1338) {
                if (!widget.method855(-30721)) {
                  continue;
                }

                GlobalStatics_6
                    .method125(var12, (byte) 59, var14, var13, widget);
                if (GlRenderer.USE_OPENGL) {
                  GlUtils.clip(x, y, width, height);
                } else {
                  DummyClass47.method1324(x, y, width, height);
                }

                if (DummyClass12.minimapMode != 0 && DummyClass12.minimapMode
                    != 3
                    || DummyClass36.aBoolean2615
                    || var16 > GlobalStatics_9.anInt1297
                    || DummyClass36.anInt2612 < var17
                    || GlobalStatics_9.anInt1297 >= var18
                    || var19 <= DummyClass36.anInt2612) {
                  continue;
                }

                var20 = GlobalStatics_9.anInt1297 - var13;
                var21 = -var14 + DummyClass36.anInt2612;
                var22 = widget.anIntArray207[var21];
                if (var20 < var22 || var20 > var22
                    + widget.anIntArray291[var21]) {
                  continue;
                }

                var21 -= widget.zoom / 2;
                var23 =
                    2047 & GlobalStatics_9.NEXT_CAMERA_YAW
                        + GlobalStatics_9.anInt3102;
                var20 -= widget.anInt168 / 2;
                var24 = MathUtilities.SINE_TABLE[var23];
                var25 = MathUtilities.COSINE_TABLE[var23];
                var24 = (GlobalStatics_9.anInt3020 + 256) * var24 >> 8;
                var25 = (GlobalStatics_9.anInt3020 + 256) * var25 >> 8;
                var47 = -(var24 * var20) + var25 * var21 >> 11;
                var26 = var21 * var24 + var20 * var25 >> 11;
                var28 = GlobalStatics_9.localPlayer.sceneX + var26 >> 7;
                var29 = -var47 + GlobalStatics_9.localPlayer.sceneY >> 7;
                if (GlobalStatics_9.aBoolean1837
                    && (GlobalStatics_9.anInt2051 & 64)
                    != 0) {
                  Widget var53 =
                      GlobalStatics_2
                          .method638((byte) -19, GlobalStatics_9.anInt872,
                              GlobalStatics_10.anInt278);
                  if (var53 != null) {
                    GlobalStatics_9
                        .method1177(GlobalStatics_6.anInt1887, 1L, (byte) -49,
                            GameStringStatics.aClass94_1724, var28, (short) 11,
                            GameStringStatics.aClass94_3621,
                            var29);
                  } else {
                    GlobalStatics_9.method958();
                  }
                  continue;
                }

                if (GlobalStatics_5.gameId == 1) {
                  GlobalStatics_9.method1177(-1, 1L, (byte) -41,
                      GameStringStatics.EMPTY_STRING, var28,
                      (short) 36, GlTexture2d.aClass94_3762, var29);
                }

                GlobalStatics_9.method1177(-1, 1L, (byte) -125,
                    GameStringStatics.EMPTY_STRING, var28,
                    (short) 60, GameStringStatics.walkTooltip, var29);
                continue;
              }

              if (widget.anInt189 == 1339) {
                if (widget.method855(-30721)) {
                  GlobalStatics_7
                      .method1493(var13, var14, widget, var12, (byte) 59);
                  if (GlRenderer.USE_OPENGL) {
                    GlUtils.clip(x, y, width, height);
                  } else {
                    DummyClass47.method1324(x, y, width, height);
                  }
                }
                continue;
              }

              if (widget.anInt189 == 1400) {
                GlobalStatics_0
                    .method799(var13, 64, var14, widget.zoom,
                        widget.anInt168);
                GlobalStatics_9.aBooleanArray3674[var12] = true;
                DummyClass9.aBooleanArray4008[var12] = true;
                if (GlRenderer.USE_OPENGL) {
                  GlUtils.clip(x, y, width, height);
                } else {
                  DummyClass47.method1324(x, y, width, height);
                }
                continue;
              }

              if (widget.anInt189 == 1401) {
                DummyClass3
                    .method72(var13, widget.zoom, widget.anInt168, 19481,
                        var14);
                GlobalStatics_9.aBooleanArray3674[var12] = true;
                DummyClass9.aBooleanArray4008[var12] = true;
                if (GlRenderer.USE_OPENGL) {
                  GlUtils.clip(x, y, width, height);
                } else {
                  DummyClass47.method1324(x, y, width, height);
                }
                continue;
              }

              if (widget.anInt189 == 1402) {
                if (!GlRenderer.USE_OPENGL) {
                  GlobalStatics_4.method1768(var13, 95, var14);
                  GlobalStatics_9.aBooleanArray3674[var12] = true;
                  DummyClass9.aBooleanArray4008[var12] = true;
                }
                continue;
              }

              if (widget.anInt189 == 1405) {
                if (!DummyClass29.aBoolean438) {
                  continue;
                }

                var20 = widget.anInt168 + var13;
                var21 = 15 + var14;
                GlobalStatics_9.p12Font
                    .method688(GlobalStatics_9.concat(new GameString[]{
                        GameStringStatics.aClass94_3196,
                        GlobalStatics_9.toString(GlobalStatics_3.fps)
                    }), var20, var21, 16776960, -1);
                var21 += 15;
                Runtime var57 = Runtime.getRuntime();
                var23 = (int) ((var57.totalMemory() - var57.freeMemory())
                    / 1024L);
                var24 = 16776960;
                if (var23 > 65536) {
                  var24 = 16711680;
                }

                GlobalStatics_9.p12Font
                    .method688(GlobalStatics_9.concat(new GameString[]{
                        GlobalStatics_7.aClass94_4057,
                        GlobalStatics_9.toString(var23),
                        GlobalStatics_7.aClass94_2951
                    }), var20, var21, var24, -1);
                var21 += 15;
                if (GlRenderer.USE_OPENGL) {
                  var24 = 16776960;
                  var25 = (DummyClass33.textureMemory + DummyClass33.anInt585
                      + DummyClass33.texture2dMemory) / 1024;
                  if (var25 > 65536) {
                    var24 = 16711680;
                  }

                  GlobalStatics_9.p12Font
                      .method688(GlobalStatics_9.concat(new GameString[]{
                          GlobalStatics_5.aClass94_1622,
                          GlobalStatics_9.toString(var25),
                          GlobalStatics_7.aClass94_2951
                      }), var20, var21, var24, -1);
                  var21 += 15;
                }

                var24 = 16776960;
                var25 = 0;
                var47 = 0;
                var26 = 0;

                for (var28 = 0; var28 < 28; ++var28) {
                  var25 += GlobalStatics_0.aClass151_Sub1Array2601[var28]
                      .method2108((byte) 1);
                  var26 += GlobalStatics_0.aClass151_Sub1Array2601[var28]
                      .method2102(0);
                  var47 += GlobalStatics_0.aClass151_Sub1Array2601[var28]
                      .method2106(1);
                }

                var29 = 10000 * var26 / var25;
                var28 = var47 * 100 / var25;
                GameString var55 = GlobalStatics_9.concat(new GameString[]{
                    DummyClass29.aClass94_436,
                    GlobalStatics_9.method407(0, true, 2, var29, 2),
                    GameStringStatics.aClass94_2498,
                    GlobalStatics_9.toString(var28),
                    GameStringStatics.aClass94_148
                });
                GlobalStatics_3.aClass3_Sub28_Sub17_2379
                    .method688(var55, var20, var21,
                        var24, -1);
                var21 += 12;
                GlobalStatics_9.aBooleanArray3674[var12] = true;
                DummyClass9.aBooleanArray4008[var12] = true;
                continue;
              }

              if (widget.anInt189 == 1406) {
                GlobalStatics_8.anInt2115 = var14;
                GlobalStatics_2.aClass11_3708 = widget;
                GlobalStatics_10.anInt4041 = var13;
                continue;
              }
            }

            if (!DummyClass36.aBoolean2615) {
              if (widget.anInt187 == 0 && widget.aBoolean219
                  && GlobalStatics_9.anInt1297 >= var16
                  && DummyClass36.anInt2612 >= var17
                  && GlobalStatics_9.anInt1297 < var18
                  && var19 > DummyClass36.anInt2612
                  && !GlobalStatics_9.aBoolean1040) {
                GlobalStatics_10.amountContextActions = 1;
                GlobalStatics_9.anIntArray1578[0] = GlobalStatics_6.anInt3590;
                GameStringStatics.aClass94Array2935[0] = DummyClass12.aClass94_2031;
                DummyClass8.aClass94Array4016[0] = GameStringStatics.EMPTY_STRING;
                GlobalStatics_10.aShortArray3095[0] = 1005;
              }

              if (var16 <= GlobalStatics_9.anInt1297 && var17
                  <= DummyClass36.anInt2612
                  && var18 > GlobalStatics_9.anInt1297
                  && var19 > DummyClass36.anInt2612) {
                GlobalStatics_6.method477(DummyClass36.anInt2612 - var14, true,
                    -var13 + GlobalStatics_9.anInt1297, widget);
              }
            }

            if (widget.anInt187 == 0) {
              if (!widget.aBoolean233 && GlobalStatics_8.method51(widget)
                  && DummyClass56.aClass11_1453 != widget) {
                continue;
              }

              if (!widget.aBoolean233) {
                if (-widget.zoom + widget.anInt252 < widget.anInt208) {
                  widget.anInt208 = -widget.zoom + widget.anInt252;
                }

                if (widget.anInt208 < 0) {
                  widget.anInt208 = 0;
                }
              }

              GlobalStatics_6.method1095(var16, -widget.anInt208 + var14,
                  -widget.anInt247 + var13, widgets, var18,
                  widget.anInt279, var17, var19, (byte) 87, var12);
              if (widget.aClass11Array262 != null) {
                GlobalStatics_6.method1095(var16, -widget.anInt208 + var14,
                    -widget.anInt247 + var13,
                    widget.aClass11Array262, var18, widget.anInt279, var17,
                    var19,
                    (byte) 52, var12);
              }

              SomethingPacket151 var36 =
                  (SomethingPacket151) GlobalStatics_10.aClass130_3208.get(
                      widget.anInt279);
              if (var36 != null) {
                if (var36.anInt2603 == 0 && !DummyClass36.aBoolean2615
                    && GlobalStatics_9.anInt1297 >= var16 && var17
                    <= DummyClass36.anInt2612
                    && var18 > GlobalStatics_9.anInt1297
                    && DummyClass36.anInt2612 < var19
                    && !GlobalStatics_9.aBoolean1040) {
                  GameStringStatics.aClass94Array2935[0] = DummyClass12.aClass94_2031;
                  GlobalStatics_10.amountContextActions = 1;
                  GlobalStatics_9.anIntArray1578[0] = GlobalStatics_6.anInt3590;
                  GlobalStatics_10.aShortArray3095[0] = 1005;
                  DummyClass8.aClass94Array4016[0] = GameStringStatics.EMPTY_STRING;
                }

                GlobalStatics_9
                    .method171(-101, var36.anInt2602, var16, var18, var13,
                        var12,
                        var19, var17, var14);
              }

              if (GlRenderer.USE_OPENGL) {
                GlUtils.clip(x, y, width, height);
              } else {
                DummyClass47.method1324(x, y, width, height);
                DummyClass40.method1134();
              }
            }

            if (GlobalStatics_0.aBooleanArray1712[var12]
                || GlobalStatics_6.rectangleDebugType > 1) {
              if (widget.anInt187 == 0 && !widget.aBoolean233
                  && widget.anInt252 > widget.zoom) {
                GlobalStatics_10
                    .method224((byte) 120, widget.anInt208, widget.anInt252,
                        widget.anInt168 + var13, var14, widget.zoom);
              }

              if (widget.anInt187 != 1) {
                boolean var39;
                boolean var46;
                if (widget.anInt187 == 2) {
                  var20 = 0;

                  for (var21 = 0; var21 < widget.anInt244; ++var21) {
                    for (var22 = 0; widget.anInt177 > var22; ++var22) {
                      var24 = var14 + var21 * (32 + widget.anInt290);
                      var23 = (widget.anInt285 + 32) * var22 + var13;
                      if (var20 < 20) {
                        var24 += widget.anIntArray300[var20];
                        var23 += widget.anIntArray272[var20];
                      }

                      if (widget.anIntArray254[var20] <= 0) {
                        if (widget.anIntArray197 != null && var20 < 20) {
                          AbstractDirectColorSprite var58 = widget
                              .method859(true, var20);
                          if (var58 == null) {
                            if (GlobalStatics_8.aBoolean6) {
                              DummyClass29.method909(125, widget);
                            }
                          } else {
                            var58.method643(var23, var24);
                          }
                        }
                      } else {
                        var39 = false;
                        var46 = false;
                        var47 = widget.anIntArray254[var20] - 1;
                        if (x < 32 + var23 && var23 < width && y < var24
                            + 32
                            && var24 < height
                            || widget == GlobalStatics_9.aClass11_1017
                            && DummyClass18.anInt86 == var20) {
                          AbstractDirectColorSprite var54;
                          if (GlobalStatics_9.anInt3012 == 1
                              && DummyClass31.anInt1473 == var20
                              && widget.anInt279 == GlTexture2d.anInt3764) {
                            var54 =
                                GlobalStatics_9
                                    .method1707(2, var47, widget.aBoolean227,
                                        widget.anIntArray317[var20], 0, 65536);
                          } else {
                            var54 =
                                GlobalStatics_9
                                    .method1707(1, var47, widget.aBoolean227,
                                        widget.anIntArray317[var20], 3153952,
                                        65536);
                          }

                          if (DummyClass40.aBoolean837) {
                            GlobalStatics_9.aBooleanArray3674[var12] = true;
                          }

                          if (var54 == null) {
                            DummyClass29.method909(-106, widget);
                          } else if (GlobalStatics_9.aClass11_1017 == widget
                              && var20 == DummyClass18.anInt86) {
                            var25 = GlobalStatics_9.anInt1676
                                - GlobalStatics_9.anInt2693;
                            var26 = -GlobalStatics_2.anInt40
                                + GlobalStatics_0.anInt1709;
                            if (var26 < 5 && var26 > 4) {
                              var26 = 0;
                            }

                            if (var25 < 5 && var25 > 4) {
                              var25 = 0;
                            }

                            if (DummyClass59.anInt677 < 5) {
                              var25 = 0;
                              var26 = 0;
                            }

                            var54.method637(var23 + var25, var24 + var26, 128);
                            if (var5 != -1) {
                              Widget var51 = widgets[var5 & 0xffff];
                              int var31;
                              int var30;
                              if (GlRenderer.USE_OPENGL) {
                                var31 = GlUtils.anInt451;
                                var30 = GlUtils.anInt448;
                              } else {
                                var30 = SoftwareIndexedColorSpriteStatics.anInt1095;
                                var31 = SoftwareIndexedColorSpriteStatics.anInt1099;
                              }

                              int var32;
                              if (var30 > var26 + var24 && var51.anInt208
                                  > 0) {
                                var32 =
                                    GlobalStatics_7.loopCycle * (-var26 + var30
                                        - var24) / 3;
                                if (var32 > GlobalStatics_7.loopCycle * 10) {
                                  var32 = 10 * GlobalStatics_7.loopCycle;
                                }

                                if (var32 > var51.anInt208) {
                                  var32 = var51.anInt208;
                                }

                                var51.anInt208 -= var32;
                                GlobalStatics_2.anInt40 += var32;
                                DummyClass29.method909(121, var51);
                              }

                              if (var31 < 32 + var26 + var24
                                  && var51.anInt208
                                  < -var51.zoom + var51.anInt252) {
                                var32 =
                                    (-var31 + 32 + var24 + var26)
                                        * GlobalStatics_7.loopCycle / 3;
                                if (var32 > GlobalStatics_7.loopCycle * 10) {
                                  var32 = 10 * GlobalStatics_7.loopCycle;
                                }

                                if (-var51.anInt208 + var51.anInt252
                                    - var51.zoom < var32) {
                                  var32 = var51.anInt252 - var51.zoom
                                      - var51.anInt208;
                                }

                                var51.anInt208 += var32;
                                GlobalStatics_2.anInt40 -= var32;
                                DummyClass29.method909(-81, var51);
                              }
                            }
                          } else if (widget == GlobalStatics_5.aClass11_1933
                              && var20 == GlobalStatics_9.anInt1918) {
                            var54.method637(var23, var24, 128);
                          } else {
                            var54.method643(var23, var24);
                          }
                        }
                      }

                      ++var20;
                    }
                  }
                } else if (widget.anInt187 == 3) {
                  if (GlobalStatics_9.method609(widget, 26)) {
                    var20 = widget.anInt253;
                    if (DummyClass56.aClass11_1453 == widget
                        && widget.anInt222 != 0) {
                      var20 = widget.anInt222;
                    }
                  } else {
                    var20 = widget.anInt218;
                    if (widget == DummyClass56.aClass11_1453
                        && widget.anInt228 != 0) {
                      var20 = widget.anInt228;
                    }
                  }

                  if (var15 != 0) {
                    if (widget.aBoolean226) {
                      if (GlRenderer.USE_OPENGL) {
                        GlUtils.fillQuad(var13, var14, widget.anInt168,
                            widget.zoom, var20,
                            256 - (var15 & 255));
                      } else {
                        DummyClass47.method1312(var13, var14, widget.anInt168,
                            widget.zoom,
                            var20, 256 - (255 & var15));
                      }
                    } else if (GlRenderer.USE_OPENGL) {
                      GlUtils.drawQuad(var13, var14, widget.anInt168,
                          widget.zoom, var20,
                          256 - (var15 & 255));
                    } else {
                      DummyClass47.method1315(var13, var14, widget.anInt168,
                          widget.zoom, var20,
                          -(var15 & 255) + 256);
                    }
                  } else if (widget.aBoolean226) {
                    if (GlRenderer.USE_OPENGL) {
                      GlUtils.fillQuad(var13, var14, widget.anInt168,
                          widget.zoom, var20);
                    } else {
                      DummyClass47.method1323(var13, var14, widget.anInt168,
                          widget.zoom,
                          var20);
                    }
                  } else if (!GlRenderer.USE_OPENGL) {
                    DummyClass47.method1311(var13, var14, widget.anInt168,
                        widget.zoom, var20);
                  } else {
                    GlUtils
                        .drawQuad(var13, var14, widget.anInt168, widget.zoom,
                            var20);
                  }
                } else {
                  AbstractFont var34;
                  if (widget.anInt187 == 4) {
                    var34 = widget
                        .method868(GlobalStatics_9.aClass109Array3270, 0);
                    if (var34 != null) {
                      GameString var45 = widget.aClass94_232;
                      if (GlobalStatics_9.method609(widget, 97)) {
                        var21 = widget.anInt253;
                        if (DummyClass56.aClass11_1453 == widget
                            && widget.anInt222 != 0) {
                          var21 = widget.anInt222;
                        }

                        if (widget.aClass94_172.getLength() > 0) {
                          var45 = widget.aClass94_172;
                        }
                      } else {
                        var21 = widget.anInt218;
                        if (DummyClass56.aClass11_1453 == widget
                            && widget.anInt228 != 0) {
                          var21 = widget.anInt228;
                        }
                      }

                      if (widget.aBoolean233 && widget.anInt192 != -1) {
                        ItemConfig var50 = DummyClass35
                            .getItemConfig(widget.anInt192);
                        var45 = var50.aClass94_770;
                        if (var45 == null) {
                          var45 = GameStringStatics.aClass94_829;
                        }

                        if ((var50.anInt764 == 1 || widget.anInt271 != 1)
                            && widget.anInt271 != -1) {
                          var45 = GlobalStatics_9.concat(new GameString[]{
                              GameStringStatics.aClass94_3042, var45,
                              GameStringStatics.aClass94_2306,
                              GlobalStatics_0.method1013(
                                  (byte) -125, widget.anInt271)
                          });
                        }
                      }

                      if (GlobalStatics_10.aClass11_3087 == widget) {
                        var21 = widget.anInt218;
                        var45 = GlobalStatics_2.aClass94_2216;
                      }

                      if (!widget.aBoolean233) {
                        var45 = GlobalStatics_7.method1303(widget, var45, 0);
                      }

                      var34.draw(var45, var13, var14, widget.anInt168,
                          widget.zoom, var21,
                          widget.aBoolean215 ? 0 : -1, widget.anInt194,
                          widget.anInt225,
                          widget.anInt205);
                    } else if (GlobalStatics_8.aBoolean6) {
                      DummyClass29.method909(-13, widget);
                    }
                  } else if (widget.anInt187 != 5) {
                    ItemConfig var42;
                    if (widget.anInt187 == 6) {
                      boolean var41 = GlobalStatics_9.method609(widget, 110);
                      AbstractModel var38 = null;
                      if (var41) {
                        var21 = widget.anInt198;
                      } else {
                        var21 = widget.anInt305;
                      }

                      var23 = 0;
                      if (widget.anInt192 != -1) {
                        var42 = DummyClass35
                            .getItemConfig(widget.anInt192);
                        if (var42 != null) {
                          var42 = var42.method1106(widget.anInt271, 78);
                          AnimationSequence var52 =
                              var21 == -1 ? null
                                  : GlobalStatics_8.method45(var21, (byte) -20);
                          var38 = var42
                              .getModel(100, widget.anInt260, widget.anInt267,
                                  var52, 1,
                                  widget.anInt283);
                          if (var38 == null) {
                            DummyClass29.method909(116, widget);
                          } else {
                            var23 = -var38.getMinimumY() / 2;
                          }
                        }
                      } else if (widget.anInt202 != 5) {
                        if (var21 == -1) {
                          var38 = widget.method865(-1, null, -1, 126, 0, var41,
                              GlobalStatics_9.localPlayer.appearance);
                          if (var38 == null && GlobalStatics_8.aBoolean6) {
                            DummyClass29.method909(122, widget);
                          }
                        } else {
                          AnimationSequence var48 = GlobalStatics_8
                              .method45(var21, (byte) -20);
                          var38 = widget
                              .method865(widget.anInt260, var48,
                                  widget.anInt283,
                                  127,
                                  widget.anInt267, var41,
                                  GlobalStatics_9.localPlayer.appearance);
                          if (var38 == null && GlobalStatics_8.aBoolean6) {
                            DummyClass29.method909(3, widget);
                          }
                        }
                      } else if (widget.anInt201 == -1) {
                        var38 =
                            DummyClass49.aClass52_1112
                                .method1165(null, -1, null, null, 0, -1, 100,
                                    0, true, -1, -1);
                      } else {
                        var24 = 2047 & widget.anInt201;
                        if (var24 == GlobalStatics_10.LOCAL_PLAYER_ID) {
                          var24 = 2047;
                        }

                        Player var49 = GlobalStatics_9.PLAYERS[var24];
                        AnimationSequence var56 =
                            var21 == -1 ? null
                                : GlobalStatics_8.method45(var21, (byte) -20);
                        if (var49 != null
                            && (int) var49.name.toBase37() << 11 == (
                            -2048 & widget.anInt201)) {
                          var38 =
                              var49.appearance
                                  .method1165(null, -1, null, var56, 0, -1,
                                      -126, 0,
                                      true, widget.anInt283, 0);
                        }
                      }

                      if (var38 != null) {
                        if (widget.anInt184 > 0) {
                          var24 = (widget.anInt168 << 8) / widget.anInt184;
                        } else {
                          var24 = 256;
                        }

                        if (widget.anInt312 <= 0) {
                          var25 = 256;
                        } else {
                          var25 = (widget.zoom << 8) / widget.anInt312;
                        }

                        var26 = var13 + widget.anInt168 / 2 + (
                            var24 * widget.anInt259
                                >> 8);
                        var47 =
                            widget.zoom / 2 + var14 + (var25 * widget.anInt230
                                >> 8);
                        if (GlRenderer.USE_OPENGL) {
                          if (widget.aBoolean181) {
                            GlRenderer.ortho(var26, var47, widget.anInt164,
                                widget.aShort293, var24,
                                var25);
                          } else {
                            GlRenderer.method1821(var26, var47, var24, var25);
                            GlRenderer.method1825(widget.aShort169,
                                1.5F * widget.aShort293);
                          }

                          GlRenderer.method1846();
                          GlRenderer.setDepthTestEnabled(true);
                          GlRenderer.setFogEnabled(false);
                          GlobalStatics_10.setupDefaultSun(
                              SettingsStatics.BRIGHTNESS);
                          if (GlobalStatics_11.aBoolean47) {
                            GlUtils.resetClip();
                            GlRenderer.GL.glClear(256);
                            GlUtils.clip(x, y, width, height);
                            GlobalStatics_11.aBoolean47 = false;
                          }

                          if (widget.aBoolean309) {
                            GlRenderer.method1851();
                          }

                          var28 = MathUtilities.SINE_TABLE[widget.rotationX0]
                              * widget.anInt164
                              >> 16;
                          var29 = widget.anInt164
                              * MathUtilities.COSINE_TABLE[widget.rotationX0]
                              >> 16;
                          if (widget.aBoolean233) {
                            var38.draw(0, widget.rotationY, widget.rotationZ,
                                widget.rotationX0,
                                widget.anInt258,
                                widget.anInt264 + var28 + var23,
                                widget.anInt264 + var29, -1L);
                          } else {
                            var38
                                .draw(0, widget.rotationY, 0, widget.rotationX0,
                                    0, var28, var29,
                                    -1L);
                          }

                          if (widget.aBoolean309) {
                            GlRenderer.method1830();
                          }
                        } else {
                          DummyClass40.method1145(var26, var47);
                          var28 = MathUtilities.SINE_TABLE[widget.rotationX0]
                              * widget.anInt164
                              >> 16;
                          var29 = widget.anInt164
                              * MathUtilities.COSINE_TABLE[widget.rotationX0]
                              >> 16;
                          if (!widget.aBoolean233) {
                            var38
                                .draw(0, widget.rotationY, 0, widget.rotationX0,
                                    0, var28, var29,
                                    -1L);
                          } else if (widget.aBoolean181) {
                            ((SoftwareModel) var38)
                                .method1946(0, widget.rotationY,
                                    widget.rotationZ, widget.rotationX0,
                                    widget.anInt258,
                                    widget.anInt264 + var23 + var28,
                                    var29 + widget.anInt264,
                                    widget.anInt164);
                          } else {
                            var38.draw(0, widget.rotationY, widget.rotationZ,
                                widget.rotationX0,
                                widget.anInt258,
                                widget.anInt264 + var28 + var23,
                                var29 + widget.anInt264, -1L);
                          }

                          DummyClass40.method1141();
                        }
                      }
                    } else {
                      if (widget.anInt187 == 7) {
                        var34 = widget
                            .method868(GlobalStatics_9.aClass109Array3270, 0);
                        if (var34 == null) {
                          if (GlobalStatics_8.aBoolean6) {
                            DummyClass29.method909(-115, widget);
                          }
                          continue;
                        }

                        var21 = 0;

                        for (var22 = 0; widget.anInt244 > var22; ++var22) {
                          for (var23 = 0; var23 < widget.anInt177; ++var23) {
                            if (widget.anIntArray254[var21] > 0) {
                              var42 = DummyClass35
                                  .getItemConfig(widget.anIntArray254[var21] - 1
                                  );
                              GameString var40;
                              if (var42.anInt764 != 1 &&
                                  widget.anIntArray317[var21] == 1) {
                                var40 = GlobalStatics_9.concat(new GameString[]{
                                    GameStringStatics.aClass94_3042,
                                    var42.aClass94_770,
                                    GlobalStatics_0.aClass94_2584
                                });
                              } else {
                                var40 = GlobalStatics_9.concat(new GameString[]{
                                    GameStringStatics.aClass94_3042,
                                    var42.aClass94_770,
                                    GameStringStatics.aClass94_2306,
                                    GlobalStatics_0.method1013(
                                        (byte) -100,
                                        widget.anIntArray317[var21])
                                });
                              }

                              var26 = var13 + var23 * (widget.anInt285 + 115);
                              var47 = (widget.anInt290 + 12) * var22 + var14;
                              if (widget.anInt194 == 0) {
                                var34.method681(var40, var26, var47,
                                    widget.anInt218,
                                    widget.aBoolean215 ? 0 : -1);
                              } else {
                                if (widget.anInt194 == 1) {
                                  var34.draw(var40, 57 + var26, var47,
                                      widget.anInt218,
                                      widget.aBoolean215 ? 0 : -1);
                                } else {
                                  var34.method688(var40, -1 + var26 + 115,
                                      var47, widget.anInt218,
                                      widget.aBoolean215 ? 0 : -1);
                                }
                              }
                            }

                            ++var21;
                          }
                        }
                      }

                      if (widget.anInt187 == 8
                          && DummyClass29.aClass11_439 == widget
                          && GlobalStatics_3.anInt1109
                          == GlobalStatics_10.anInt3323) {
                        var21 = 0;
                        var20 = 0;
                        GameString var43 = widget.aClass94_232;
                        AbstractFont var35 = GlobalStatics_9.p12Font;
                        var43 = GlobalStatics_7.method1303(widget, var43, 0);

                        GameString var44;
                        while (var43.getLength() > 0) {
                          var25 = var43.indexOf(
                              GlobalStatics_0.LINE_BREAK);
                          if (var25 == -1) {
                            var44 = var43;
                            var43 = GameStringStatics.EMPTY_STRING;
                          } else {
                            var44 = var43.substring(var25, 0, 0);
                            var43 = var43.substring(var25 + 4);
                          }

                          var26 = var35.method682(var44);
                          var21 += var35.anInt3727 + 1;
                          if (var20 < var26) {
                            var20 = var26;
                          }
                        }

                        var26 = var14 + widget.zoom + 5;
                        var20 += 6;
                        var21 += 7;
                        if (var26 + var21 > height) {
                          var26 = -var21 + height;
                        }

                        var25 = -var20 - 5 + var13 + widget.anInt168;
                        if (var25 < 5 + var13) {
                          var25 = 5 + var13;
                        }

                        if (var20 + var25 > width) {
                          var25 = -var20 + width;
                        }

                        if (GlRenderer.USE_OPENGL) {
                          GlUtils
                              .fillQuad(var25, var26, var20, var21, 16777120);
                          GlUtils.drawQuad(var25, var26, var20, var21, 0);
                        } else {
                          DummyClass47
                              .method1323(var25, var26, var20, var21, 16777120);
                          DummyClass47
                              .method1311(var25, var26, var20, var21, 0);
                        }

                        var43 = widget.aClass94_232;
                        var47 = 2 + var26 + var35.anInt3727;

                        for (
                            var43 = GlobalStatics_7
                                .method1303(widget, var43, 0);
                            var43.getLength() > 0;
                            var47 += var35.anInt3727 + 1) {
                          var28 = var43.indexOf(
                              GlobalStatics_0.LINE_BREAK);
                          if (var28 == -1) {
                            var44 = var43;
                            var43 = GameStringStatics.EMPTY_STRING;
                          } else {
                            var44 = var43.substring(var28, 0, 0);
                            var43 = var43.substring(4 + var28);
                          }

                          var35.method681(var44, 3 + var25, var47, 0, -1);
                        }
                      }

                      if (widget.anInt187 == 9) {
                        if (widget.aBoolean167) {
                          var20 = var13;
                          var22 = var13 + widget.anInt168;
                          var21 = var14 + widget.zoom;
                          var23 = var14;
                        } else {
                          var20 = var13;
                          var21 = var14;
                          var23 = var14 + widget.zoom;
                          var22 = var13 + widget.anInt168;
                        }

                        if (widget.anInt250 == 1) {
                          if (GlRenderer.USE_OPENGL) {
                            GlUtils.method933(var20, var21, var22, var23,
                                widget.anInt218);
                          } else {
                            DummyClass47
                                .method1328(var20, var21, var22, var23,
                                    widget.anInt218);
                          }
                        } else if (!GlRenderer.USE_OPENGL) {
                          DummyClass47.method1322(var20, var21, var22, var23,
                              widget.anInt218,
                              widget.anInt250);
                        } else {
                          GlUtils.method929(var20, var21, var22, var23,
                              widget.anInt218,
                              widget.anInt250);
                        }
                      }
                    }
                  } else {
                    AbstractDirectColorSprite var37;
                    if (widget.aBoolean233) {
                      if (widget.anInt192 == -1) {
                        var37 = widget.method866((byte) -113, false);
                      } else {
                        var37 = GlobalStatics_9
                            .method1707(widget.anInt288, widget.anInt192,
                                widget.aBoolean227, widget.anInt271,
                                widget.anInt287, 65536);
                      }

                      if (var37 == null) {
                        if (GlobalStatics_8.aBoolean6) {
                          DummyClass29.method909(-40, widget);
                        }
                      } else {
                        var21 = var37.anInt3697;
                        var22 = var37.anInt3706;
                        if (widget.aBoolean186) {
                          var23 = (var21 - 1 + widget.anInt168) / var21;
                          var24 = (widget.zoom - 1 + var22) / var22;
                          if (GlRenderer.USE_OPENGL) {
                            GlUtils.method931(var13, var14,
                                widget.anInt168 + var13,
                                widget.zoom + var14);
                            var39 = GlobalStatics_9
                                .isPo2((byte) -94, var37.anInt3707);
                            var46 = GlobalStatics_9
                                .isPo2((byte) -113, var37.anInt3696);
                            GlDirectColorSprite var27 = (GlDirectColorSprite) var37;
                            if (var39 && var46) {
                              if (var15 == 0) {
                                var27.method649(var13, var14, var23, var24);
                              } else {
                                var27.method646(var13, var14,
                                    -(255 & var15) + 256, var23, var24);
                              }
                            } else if (var39) {
                              for (var28 = 0; var24 > var28; ++var28) {
                                if (var15 == 0) {
                                  var27
                                      .method649(var13, var28 * var22 + var14,
                                          var23, 1);
                                } else {
                                  var27
                                      .method646(var13, var14 + var28 * var22,
                                          256 - (var15 & 255), var23, 1);
                                }
                              }
                            } else if (!var46) {
                              for (var28 = 0; var28 < var23; ++var28) {
                                for (var29 = 0; var24 > var29; ++var29) {
                                  if (var15 == 0) {
                                    var37.method643(var13 + var21 * var28,
                                        var22 * var29 + var14);
                                  } else {
                                    var37.method637(var28 * var21 + var13,
                                        var22 * var29 + var14,
                                        -(255 & var15) + 256);
                                  }
                                }
                              }
                            } else {
                              for (var28 = 0; var23 > var28; ++var28) {
                                if (var15 == 0) {
                                  var27
                                      .method649(var21 * var28 + var13, var14,
                                          1, var24);
                                } else {
                                  var27
                                      .method646(var21 * var28 + var13, var14,
                                          -(var15 & 255) + 256, 1, var24);
                                }
                              }
                            }

                            GlUtils.clip(x, y, width, height);
                          } else {
                            DummyClass47.method1326(var13, var14,
                                var13 + widget.anInt168,
                                var14 + widget.zoom);

                            for (var25 = 0; var25 < var23; ++var25) {
                              for (var26 = 0; var26 < var24; ++var26) {
                                if (widget.anInt301 == 0) {
                                  if (var15 == 0) {
                                    var37.method643(var25 * var21 + var13,
                                        var22 * var26 + var14);
                                  } else {
                                    var37.method637(var25 * var21 + var13,
                                        var14 + var26 * var22,
                                        256 - (255 & var15));
                                  }
                                } else {
                                  var37.method640(
                                      var14 + var22 * var26 + var22 / 2,
                                      widget.anInt301, 4096,
                                      var25 * var21 + var13 + var21 / 2,
                                      -1470985020);
                                }
                              }
                            }

                            DummyClass47.method1324(x, y, width, height);
                          }
                        } else {
                          var23 = widget.anInt168 * 4096 / var21;
                          if (widget.anInt301 == 0) {
                            if (var15 != 0) {
                              var37.method642(var13, var14, widget.anInt168,
                                  widget.zoom,
                                  -(255 & var15) + 256);
                            } else if (var21 == widget.anInt168
                                && var22 == widget.zoom) {
                              var37.method643(var13, var14);
                            } else {
                              var37.draw(var13, var14, widget.anInt168,
                                  widget.zoom);
                            }
                          } else {
                            var37.method640(var14 + widget.zoom / 2,
                                widget.anInt301, var23,
                                var13 + widget.anInt168 / 2, -1470985020);
                          }
                        }
                      }
                    } else {
                      var37 = widget.method866((byte) -113,
                          GlobalStatics_9.method609(widget, 69));
                      if (var37 != null) {
                        var37.method643(var13, var14);
                      } else if (GlobalStatics_8.aBoolean6) {
                        DummyClass29.method909(118, widget);
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }

    if (var8 <= 31) {
      GlobalStatics_6.quickchats = null;
    }
  }

  public static void clear100(byte var0) {
    GlobalStatics_6.quickchats = null;
    GameStringStatics.aClass94_750 = null;
    GlobalStatics_6.aClass93_743 = null;
  }

  public static void method1098(byte var0) {
    if (GlobalStatics_6.NEXT_CAMERA_PITCH < 128) {
      GlobalStatics_6.NEXT_CAMERA_PITCH = 128;
    }

    //TODO
    if (GlobalStatics_6.NEXT_CAMERA_PITCH > 383) {
      GlobalStatics_6.NEXT_CAMERA_PITCH = 383;
    }

    GlobalStatics_9.NEXT_CAMERA_YAW &= 2047;

    int var1 = GlobalStatics_10.CAMERA_X_OFFSET >> 7;
    int var2 = GlobalStatics_8.anInt942 >> 7;
    int var3 =
        GlobalStatics_6
            .method1736(GlobalStatics_9.currentPlane, 1,
                GlobalStatics_10.CAMERA_X_OFFSET,
                GlobalStatics_8.anInt942);
    int var4 = 0;
    int var5;
    if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
      for (var5 = -4 + var1; var1 + 4 >= var5; ++var5) {
        for (int var6 = -4 + var2; var6 <= 4 + var2; ++var6) {
          int var7 = GlobalStatics_9.currentPlane;
          if (var7 < 3 && (2 & GlobalStatics_10.tileFlags[1][var5][var6])
              == 2) {
            ++var7;
          }

          int var8 =
              (255 & GlobalStatics_9.aByteArrayArrayArray1774[var7][var5][var6])
                  * 8
                  - GlobalStatics_4.heightMap[var7][var5][var6] + var3;
          if (var8 > var4) {
            var4 = var8;
          }
        }
      }
    }

    var5 = 192 * var4;
    if (var5 > 98048) {
      var5 = 98048;
    }

    if (var5 < 32768) {
      var5 = 0x8000;
    }

    if (GlobalStatics_9.anInt2670 >= var5) {
      if (var5 < GlobalStatics_9.anInt2670) {
        GlobalStatics_9.anInt2670 += (var5 - GlobalStatics_9.anInt2670) / 80;
      }
    } else {
      GlobalStatics_9.anInt2670 += (-GlobalStatics_9.anInt2670 + var5) / 24;
    }
  }

  public static int repackHSL(int lightness, boolean var1, int hsl) {
    if (hsl == -1) {
      return 12345678;
    } else {

      lightness = lightness * (127 & hsl) >> 7;
      if (lightness >= 2) {
        if (lightness > 126) {
          lightness = 126;
        }
      } else {
        lightness = 2;
      }

      return lightness + (0xff80 & hsl);
    }
  }

  public static SomethingTexture1 method384(Buffer var0, byte var1) {
    if (var1 <= 40) {
      GlobalStatics_6.midiInstruments = null;
    }

    return new SomethingTexture1(var0.method787((byte) 38),
        var0.method787((byte) 51),
        var0.method787((byte) 66), var0.method787((byte) 68),
        var0.readUnsignedMedium((byte) 86),
        var0.readUnsignedMedium((byte) 86), var0.readUnsignedByte());
  }

  public static boolean method385(int var0, int var1) {
    int var2 = var0;
    byte var3 = 0;
    int var5;
    int var6;
    int var7;
    int var8;
    if (DummyClass32.aClass3_Sub28_Sub16_Sub2_518 == null) {
      if (!GlRenderer.USE_OPENGL &&
          GlobalStatics_9.aClass3_Sub28_Sub16_812 != null) {
        DummyClass32.aClass3_Sub28_Sub16_Sub2_518 =
            (SoftwareDirectColorSprite) GlobalStatics_9.aClass3_Sub28_Sub16_812;
      } else {
        DummyClass32.aClass3_Sub28_Sub16_Sub2_518 = new SoftwareDirectColorSprite(
            512, 512);
      }

      int[] var4 = DummyClass32.aClass3_Sub28_Sub16_Sub2_518.pixels;
      var5 = var4.length;

      for (var6 = 0; var6 < var5; ++var6) {
        var4[var6] = 1;
      }

      for (var6 = var3 + 1; -1 - var3 + 104 > var6; ++var6) {
        var7 = 4 * 512 * (var3 + 103 - var6) + 24628;

        for (var8 = 1 + var2; var8 < -var2 + 104 - 1; ++var8) {
          if ((GlobalStatics_10.tileFlags[var1][var8][var6] & 24) == 0) {
            GlobalStatics_4.method1469(var4, var7, 512, var1, var8, var6);
          }

          if (var1 < 3 &&
              (GlobalStatics_10.tileFlags[1 + var1][var8][var6] & 8)
                  != 0) {
            GlobalStatics_4.method1469(var4, var7, 512, var1 + 1, var8, var6);
          }

          var7 += 4;
        }
      }

      GlobalStatics_9.anInt1924 = 0;

      for (var6 = 0; var6 < 104; ++var6) {
        for (var7 = 0; var7 < 104; ++var7) {
          long var20 =
              GLStatics
                  .method104(GlobalStatics_9.currentPlane, var6 + var2,
                      var7 + var3);
          if (var20 != 0L) {
            GameObjectConfig var10 =
                DummyClass11
                    .method2207(4, (int) (var20 >>> 32) & Integer.MAX_VALUE);
            int var11 = var10.anInt1482;
            int var12;
            if (var10.anIntArray1524 != null) {
              for (var12 = 0; var10.anIntArray1524.length > var12; ++var12) {
                if (var10.anIntArray1524[var12] != -1) {
                  GameObjectConfig var13 =
                      DummyClass11.method2207(4, var10.anIntArray1524[var12]);
                  if (var13.anInt1482 >= 0) {
                    var11 = var13.anInt1482;
                    break;
                  }
                }
              }
            }

            if (var11 >= 0) {
              int var21 = var3 + var7;
              var12 = var2 + var6;
              if (var11 != 22 && var11 != 29 && var11 != 34 && var11 != 36
                  &&
                  var11 != 46
                  && var11 != 47 && var11 != 48) {
                int[][] var14 =
                    com.jagex.runescape.statics.GlobalStatics_0.collisionMaps[GlobalStatics_9.currentPlane].anIntArrayArray1304;

                for (int var15 = 0; var15 < 10; ++var15) {
                  int var16 = (int) (Math.random() * 4.0D);
                  if (var16 == 0 && var12 > 0 && var6 - 3 < var12
                      && (var14[var12 - 1][var21] & 19661064) == 0) {
                    --var12;
                  }

                  if (var16 == 1 && var12 < 103 && 3 + var6 > var12
                      && (var14[var12 + 1][var21] & 19661184) == 0) {
                    ++var12;
                  }

                  if (var16 == 2 && var21 > 0 && -3 + var7 < var21 && (
                      var14[var12][-1 + var21] & 19661058) == 0) {
                    --var21;
                  }

                  if (var16 == 3 && var21 < 103 && var21 < var7 + 3 &&
                      (19661088
                          & var14[var12][1 + var21]) == 0) {
                    ++var21;
                  }
                }
              }

              GlobalStatics_6.anIntArray3693[GlobalStatics_9.anInt1924] = var10.anInt1527;
              DummyClass51.anIntArray1163[GlobalStatics_9.anInt1924] =
                  -var2 + var12;
              GlobalStatics_9.anIntArray4050[GlobalStatics_9.anInt1924] =
                  var21 - var3;
              ++GlobalStatics_9.anInt1924;
            }
          }
        }
      }
    }

    DummyClass32.aClass3_Sub28_Sub16_Sub2_518.method658();
    int var18 =
        (238 + (int) (20.0D * Math.random()) - 10 << 8) + (
            -10 + (int) (Math.random() * 20.0D) + 238
                << 16) + 228 + (int) (20.0D * Math.random());
    var5 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;

    for (var6 = 1; var6 < 103; ++var6) {
      for (var7 = 1; var7 < 103; ++var7) {
        if ((GlobalStatics_10.tileFlags[var1][var7 + var2][var6 + var3]
            & 24) == 0
            && !com.jagex.runescape.statics.GlobalStatics_0
            .method1529(var3, var7, var18, var6, var5, var2, var1, true)) {
          if (GlRenderer.USE_OPENGL) {
            SoftwareIndexedColorSpriteStatics.anIntArray1100 = null;
          } else {
            GlobalStatics_9.viewImageProducer.method2182(0);
          }

          return false;
        }

        if (var1 < 3
            &&
            (GlobalStatics_10.tileFlags[1 + var1][var7 + var2][var6 + var3] & 8)
                != 0
            && !com.jagex.runescape.statics.GlobalStatics_0
            .method1529(var3, var7, var18, var6, var5, var2, 1 + var1, true)) {
          if (GlRenderer.USE_OPENGL) {
            SoftwareIndexedColorSpriteStatics.anIntArray1100 = null;
          } else {
            GlobalStatics_9.viewImageProducer.method2182(0);
          }

          return false;
        }
      }
    }

    if (GlRenderer.USE_OPENGL) {
      int[] var19 = DummyClass32.aClass3_Sub28_Sub16_Sub2_518.pixels;
      var7 = var19.length;

      for (var8 = 0; var7 > var8; ++var8) {
        if (var19[var8] == 0) {
          var19[var8] = 1;
        }
      }

      GlobalStatics_9.aClass3_Sub28_Sub16_812 =
          new GlDirectColorSprite(DummyClass32.aClass3_Sub28_Sub16_Sub2_518);
    } else {
      GlobalStatics_9.aClass3_Sub28_Sub16_812 = DummyClass32.aClass3_Sub28_Sub16_Sub2_518;
    }

    if (GlRenderer.USE_OPENGL) {
      SoftwareIndexedColorSpriteStatics.anIntArray1100 = null;
    } else {
      GlobalStatics_9.viewImageProducer.method2182(0);
    }

    DummyClass32.aClass3_Sub28_Sub16_Sub2_518 = null;
    return true;
  }

  public static void method386(int var0, int var1) {
    GlobalStatics_9.aClass93_2604.method1522(-128, var0);
    if (var1 <= -109) {
      DummyClass32.aClass93_511.method1522(-126, var0);
    }
  }

  public static void clear31(int var0) {
    int var1 = 41 % ((var0 + 70) / 32);
    GameStringStatics.aClass94_2477 = null;
    GlobalStatics_6.midiInstruments = null;
  }

  public static void method124(int var0, int var1, int var2) {
    if (var0 <= 23) {
      GameStringStatics.aClass94_2306 = null;
    }

    if (GlobalStatics_11.method57(var2, 104)) {
      GlobalStatics_9
          .method75(GlobalStatics_9.aClass11ArrayArray1834[var2], true, var1);
    }
  }

  public static void method125(int var0, byte var1, int var2, int var3,
      Widget var4) {
    DummyClass43.method1194();
    if (GlRenderer.USE_OPENGL) {
      GlUtils.clip(var3, var2, var3 + var4.anInt168, var2 + var4.zoom);
    } else {
      DummyClass47
          .method1324(var3, var2, var3 + var4.anInt168, var2 + var4.zoom);
    }

    if (DummyClass12.minimapMode != 2 && DummyClass12.minimapMode != 5
        && GlobalStatics_9.aClass3_Sub28_Sub16_812 != null) {
      int var19 =
          GlobalStatics_9.anInt3102 + GlobalStatics_9.NEXT_CAMERA_YAW & 2047;
      int var6 = GlobalStatics_9.localPlayer.sceneX / 32 + 48;
      int var7 = -(GlobalStatics_9.localPlayer.sceneY / 32) + 464;
      if (GlRenderer.USE_OPENGL) {
        ((GlDirectColorSprite) GlobalStatics_9.aClass3_Sub28_Sub16_812)
            .draw(var3, var2,
                var4.anInt168, var4.zoom, var6, var7, var19,
                GlobalStatics_9.anInt3020 + 256,
                (GlDirectColorSprite) var4.method866((byte) -113, false));
      } else {
        ((SoftwareDirectColorSprite) GlobalStatics_9.aClass3_Sub28_Sub16_812)
            .method664(var3,
                var2, var4.anInt168, var4.zoom, var6, var7, var19,
                256 + GlobalStatics_9.anInt3020,
                var4.anIntArray207, var4.anIntArray291);
      }

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var17;
      int var16;
      if (GlobalStatics_10.aClass131_3421 != null) {
        for (int var8 = 0; var8 < GlobalStatics_10.aClass131_3421.anInt1720;
            ++var8) {
          if (GlobalStatics_10.aClass131_3421.method1789(var8, var1 ^ 553)) {
            var9 =
                2 + 4 * (GlobalStatics_10.aClass131_3421.aShortArray1727[var8]
                    - GlobalStatics_10.REGION_BASE_X)
                    - GlobalStatics_9.localPlayer.sceneX / 32;
            var11 = MathUtilities.SINE_TABLE[var19];
            var12 = MathUtilities.COSINE_TABLE[var19];
            AbstractFont var15 = GlobalStatics_3.aClass3_Sub28_Sub17_2379;
            var11 = var11 * 256 / (256 + GlobalStatics_9.anInt3020);
            var10 = 2 + 4 * (-GlobalStatics_9.REGION_BASE_Y
                + GlobalStatics_10.aClass131_3421.aShortArray1718[var8])
                - GlobalStatics_9.localPlayer.sceneY / 32;
            var12 = var12 * 256 / (256 + GlobalStatics_9.anInt3020);
            var14 = -(var9 * var11) + var10 * var12 >> 16;
            if (GlobalStatics_10.aClass131_3421.method1791(var8, var1 - 51)
                == 1) {
              var15 = GlobalStatics_9.p12Font;
            }

            if (GlobalStatics_10.aClass131_3421.method1791(var8, 8) == 2) {
              var15 = GlobalStatics_8.aClass3_Sub28_Sub17_2096;
            }

            var13 = var11 * var10 + var12 * var9 >> 16;
            var16 = var15.method680(
                GlobalStatics_10.aClass131_3421.aClass94Array1721[var8], 100);
            var13 -= var16 / 2;
            if (var13 >= -var4.anInt168 && var13 <= var4.anInt168
                && var14 >= -var4.zoom
                && var14 <= var4.zoom) {
              var17 = 16777215;
              if (GlobalStatics_10.aClass131_3421.anIntArray1725[var8]
                  != -1) {
                var17 = GlobalStatics_10.aClass131_3421.anIntArray1725[var8];
              }

              if (GlRenderer.USE_OPENGL) {
                GlUtils.method936((GlDirectColorSprite) Objects
                    .requireNonNull(var4.method866((byte) -113, false)));
              } else {
                DummyClass47
                    .method1314(var4.anIntArray207, var4.anIntArray291);
              }

              var15.method693(
                  GlobalStatics_10.aClass131_3421.aClass94Array1721[var8],
                  var3 + var13 + var4.anInt168 / 2,
                  var2 + var4.zoom / 2 - var14, var16, 50,
                  var17, 0, 256, 1, 0, 0);
              if (GlRenderer.USE_OPENGL) {
                GlUtils.method921();
              } else {
                DummyClass47.method1310();
              }
            }
          }
        }
      }

      for (var9 = 0; GlobalStatics_9.anInt1924 > var9; ++var9) {
        var10 =
            -(GlobalStatics_9.localPlayer.sceneX / 32) + 2
                + 4 * DummyClass51.anIntArray1163[var9];
        var11 =
            -(GlobalStatics_9.localPlayer.sceneY / 32) + 2
                + GlobalStatics_9.anIntArray4050[var9] * 4;
        GameObjectConfig var20 = DummyClass11
            .method2207(4, GlobalStatics_6.anIntArray3693[var9]);
        if (var20.anIntArray1524 != null) {
          var20 = var20.method1685(var1 - 59);
          if (var20 == null || var20.anInt1482 == -1) {
            continue;
          }
        }

        DummyClass36.method1030(var4,
            GlobalStatics_9.aClass3_Sub28_Sub16Array2839[var20.anInt1482],
            var11,
            var10, var2, (byte) 11, var3);
      }

      for (var9 = 0; var9 < 104; ++var9) {
        for (var10 = 0; var10 < 104; ++var10) {
          Deque var25 = GlobalStatics_9.groundItems[GlobalStatics_9.currentPlane][var9][var10];
          if (var25 != null) {
            var12 = 2 + var9 * 4 - GlobalStatics_9.localPlayer.sceneX / 32;
            var13 =
                -(GlobalStatics_9.localPlayer.sceneY / 32) + 2 + 4 * var10;
            DummyClass36.method1030(var4,
                GlobalStatics_9.aClass3_Sub28_Sub16Array1136[0],
                var13, var12, var2, (byte) 11, var3);
          }
        }
      }

      for (var9 = 0; DummyClass6.anInt2046 > var9; ++var9) {
        NPC var21 = GlobalStatics_8.NPCS[GlobalStatics_2.anIntArray347[var9]];
        if (var21 != null && var21.hasConfiguration((byte) 17)) {
          NpcConfiguration var22 = var21.config;
          if (var22 != null && var22.anIntArray1292 != null) {
            var22 = var22.method1471((byte) -3);
          }

          if (var22 != null && var22.aBoolean1285 && var22.aBoolean1270) {
            var12 = var21.sceneX / 32
                - GlobalStatics_9.localPlayer.sceneX / 32;
            var13 =
                var21.sceneY / 32 - GlobalStatics_9.localPlayer.sceneY
                    / 32;
            if (var22.anInt1283 == -1) {
              DummyClass36.method1030(var4,
                  GlobalStatics_9.aClass3_Sub28_Sub16Array1136[1],
                  var13, var12, var2, (byte) 11, var3);
            } else {
              DummyClass36.method1030(var4,
                  GlobalStatics_9.aClass3_Sub28_Sub16Array2839[var22.anInt1283],
                  var13, var12, var2, (byte) 11, var3);
            }
          }
        }
      }

      for (var9 = 0; var9 < DummyClass13.anInt2022; ++var9) {
        Player var23 = GlobalStatics_9.PLAYERS[DummyClass42.anIntArray887[var9]];
        if (var23 != null && var23.hasConfiguration((byte) 17)) {
          var12 =
              var23.sceneY / 32 - GlobalStatics_9.localPlayer.sceneY / 32;
          var11 = -(GlobalStatics_9.localPlayer.sceneX / 32)
              + var23.sceneX / 32;
          long var29 = var23.name.toBase37();
          boolean var28 = false;

          for (var16 = 0; GlobalStatics_10.anInt104 > var16; ++var16) {
            if (var29 == GlobalStatics_8.aLongArray826[var16]
                && GlobalStatics_7.anIntArray882[var16] != 0) {
              var28 = true;
              break;
            }
          }

          boolean var31 = false;

          for (var17 = 0; GlobalStatics_2.anInt2572 > var17; ++var17) {
            if (var29 == GlobalStatics_6.aClass3_Sub19Array3694[var17].key) {
              var31 = true;
              break;
            }
          }

          boolean var32 = false;
          if (GlobalStatics_9.localPlayer.anInt3956 != 0 && var23.anInt3956
              != 0
              && var23.anInt3956 == GlobalStatics_9.localPlayer.anInt3956) {
            var32 = true;
          }

          if (var28) {
            DummyClass36.method1030(var4,
                GlobalStatics_9.aClass3_Sub28_Sub16Array1136[3],
                var12, var11, var2, (byte) 11, var3);
          } else if (!var31) {
            if (var32) {
              DummyClass36.method1030(var4,
                  GlobalStatics_9.aClass3_Sub28_Sub16Array1136[4],
                  var12, var11, var2, (byte) 11, var3);
            } else {
              DummyClass36.method1030(var4,
                  GlobalStatics_9.aClass3_Sub28_Sub16Array1136[2],
                  var12, var11, var2, (byte) 11, var3);
            }
          } else {
            DummyClass36.method1030(var4,
                GlobalStatics_9.aClass3_Sub28_Sub16Array1136[5],
                var12, var11, var2, (byte) 11, var3);
          }
        }
      }

      HintMarker[] var24 = GlobalStatics_8.aClass96Array2114;

      for (var10 = 0; var10 < var24.length; ++var10) {
        HintMarker var26 = var24[var10];
        if (var26 != null && var26.anInt1360 != 0
            && GlobalStatics_4.updateCycle % 20 < 10) {
          if (var26.anInt1360 == 1 && var26.anInt1359 >= 0
              && var26.anInt1359 < GlobalStatics_8.NPCS.length) {
            NPC var27 = GlobalStatics_8.NPCS[var26.anInt1359];
            if (var27 != null) {
              var13 = -(GlobalStatics_9.localPlayer.sceneX / 32)
                  + var27.sceneX / 32;
              var14 =
                  var27.sceneY / 32 - GlobalStatics_9.localPlayer.sceneY
                      / 32;
              DummyClass41
                  .method1171(var26.anInt1351, var2, var3, var13, var14, var4,
                      false);
            }
          }

          if (var26.anInt1360 == 2) {
            var12 = (-GlobalStatics_10.REGION_BASE_X + var26.anInt1356) * 4 + 2
                - GlobalStatics_9.localPlayer.sceneX / 32;
            var13 = -(GlobalStatics_9.localPlayer.sceneY / 32) + 2
                + (-GlobalStatics_9.REGION_BASE_Y + var26.anInt1347) * 4;
            DummyClass41
                .method1171(var26.anInt1351, var2, var3, var12, var13, var4,
                    false);
          }

          if (var26.anInt1360 == 10 && var26.anInt1359 >= 0
              && GlobalStatics_9.PLAYERS.length > var26.anInt1359) {
            Player var30 = GlobalStatics_9.PLAYERS[var26.anInt1359];
            if (var30 != null) {
              var14 =
                  var30.sceneY / 32 - GlobalStatics_9.localPlayer.sceneY
                      / 32;
              var13 =
                  var30.sceneX / 32 - GlobalStatics_9.localPlayer.sceneX
                      / 32;
              DummyClass41
                  .method1171(var26.anInt1351, var2, var3, var13, var14, var4,
                      false);
            }
          }
        }
      }

      if (DummyClass45.anInt987 != 0) {
        var9 = 4 * DummyClass45.anInt987 + 2
            - GlobalStatics_9.localPlayer.sceneX / 32;
        var10 = 2 + 4 * DummyClass38.anInt733
            - GlobalStatics_9.localPlayer.sceneY / 32;
        DummyClass36
            .method1030(var4, DummyClass38.aClass3_Sub28_Sub16_736, var10, var9,
                var2,
                (byte) 11, var3);
      }

      if (GlRenderer.USE_OPENGL) {
        GlUtils.fillQuad(-1 + var3 + var4.anInt168 / 2,
            -1 + var2 + var4.zoom / 2, 3,
            3, 16777215);
      } else {
        DummyClass47.method1323(-1 + var4.anInt168 / 2 + var3,
            -1 + var4.zoom / 2 + var2, 3,
            3, 16777215);
      }
    } else if (!GlRenderer.USE_OPENGL) {
      DummyClass47
          .method1332(var3, var2, 0, var4.anIntArray207, var4.anIntArray291);
    } else {
      AbstractDirectColorSprite var5 = var4.method866((byte) -113, false);
      if (var5 != null) {
        var5.method643(var3, var2);
      }
    }

    if (var1 == 59) {
      DummyClass9.aBooleanArray4008[var0] = true;
    }
  }

  public static void method126(boolean var0, int var1, int var2, int var3,
      int var4) {
    if (!var0) {
      if (var4 >= DummyClass55.anInt1425 && var4 <= GlTexture2d.anInt3765) {
        var2 = DummyClass59.method1040(GlobalStatics_9.anInt902, var2, (byte) 0,
            DummyClass13.anInt2020);
        var1 = DummyClass59.method1040(GlobalStatics_9.anInt902, var1, (byte) 0,
            DummyClass13.anInt2020);
        GlobalStatics_10.method244(2, var2, var4, var1, var3);
      }

    }
  }

  public static void method127(short[] var0, int var1, GameString[] var2,
      int var3, int var4) {
    if (var1 > var4) {
      int var6 = var4;
      int var5 = (var4 + var1) / 2;
      GameString var7 = var2[var5];
      var2[var5] = var2[var1];
      var2[var1] = var7;
      short var8 = var0[var5];
      var0[var5] = var0[var1];
      var0[var1] = var8;

      for (int var9 = var4; var1 > var9; ++var9) {
        if (var7 == null || var2[var9] != null
            && var2[var9].method1559(var7, -1) < (var9 & 1)) {
          GameString var10 = var2[var9];
          var2[var9] = var2[var6];
          var2[var6] = var10;
          short var11 = var0[var9];
          var0[var9] = var0[var6];
          var0[var6++] = var11;
        }
      }

      var2[var1] = var2[var6];
      var2[var6] = var7;
      var0[var1] = var0[var6];
      var0[var6] = var8;
      GlobalStatics_6.method127(var0, -1 + var6, var2, -909, var4);
      GlobalStatics_6.method127(var0, var1, var2, -909, var6 + 1);
    }

    if (var3 != -909) {
      GlobalStatics_6.method125(-13, (byte) 113, -27, -120, null);
    }
  }

  public static void method128(int var0) {
    GlobalStatics_4.floorUnderlays.method1524(3);
    if (var0 != 2) {
      GlobalStatics_6.method127(null, -27, null, -4, -64);
    }
  }

  public static int method129(int var0, int var1, int var2, int var3) {
    if (var1 != 2) {
      GlobalStatics_6.method131(14);
    }

    if (var0 <= 243) {
      if (var0 > 217) {
        var2 >>= 3;
      } else if (var0 <= 192) {
        if (var0 > 179) {
          var2 >>= 1;
        }
      } else {
        var2 >>= 2;
      }
    } else {
      var2 >>= 4;
    }

    return (var0 >> 1) + (var2 >> 5 << 7) + (var3 >> 2 << 10);
  }

  public static GameWorld method130(int var0, int var1) {
    if (GlobalStatics_6.aBoolean579 && var1 >= GlobalStatics_10.anInt3054
        && var1 <= GlobalStatics_8.anInt1416) {
      int var2 = 120 / ((0 - var0) / 32);
      return DummyClass26.aClass44_Sub1Array1609[var1
          - GlobalStatics_10.anInt3054];
    } else {
      return null;
    }
  }

  public static void method131(int var0) {
    GameStringStatics.aClass94_2297 = null;
    GlobalStatics_6.DETAILS = null;
    GameStringStatics.aClass94_2306 = null;
    if (var0 >= -104) {
      GlobalStatics_6.method132((byte) -28);
    }
  }

  public static void method132(byte var0) {
    for (int var1 = 0; var1 < GlobalStatics_9.anInt1552; ++var1) {
      --com.jagex.runescape.statics.GlobalStatics_0.anIntArray2157[var1];
      if (GlobalStatics_0.anIntArray2157[var1]
          < 9) {
        --GlobalStatics_9.anInt1552;

        for (int var2 = var1; var2 < GlobalStatics_9.anInt1552; ++var2) {
          GlobalStatics_9.anIntArray2550[var2] = GlobalStatics_9.anIntArray2550[
              var2 + 1];
          GlobalStatics_9.aClass135Array2131[var2] = GlobalStatics_9.aClass135Array2131[
              var2 + 1];
          GlobalStatics_9.anIntArray2068[var2] = GlobalStatics_9.anIntArray2068[
              1 + var2];
          com.jagex.runescape.statics.GlobalStatics_0.anIntArray2157[var2] = com.jagex.runescape.statics.GlobalStatics_0.anIntArray2157[
              1 + var2];
          GlobalStatics_10.anIntArray3083[var2] = GlobalStatics_10.anIntArray3083[
              var2 + 1];
        }

        --var1;
      } else {
        SoundEffect var11 = GlobalStatics_9.aClass135Array2131[var1];
        if (var11 == null) {
          var11 = MidiSomethingStatics.method1811(GlobalStatics_5.soundEffects,
              GlobalStatics_9.anIntArray2550[var1], 0);
          if (var11 == null) {
            continue;
          }

          com.jagex.runescape.statics.GlobalStatics_0.anIntArray2157[var1] += var11
              .method1813();
          GlobalStatics_9.aClass135Array2131[var1] = var11;
        }

        if (com.jagex.runescape.statics.GlobalStatics_0.anIntArray2157[var1]
            < 0) {
          int var3;
          if (GlobalStatics_10.anIntArray3083[var1] == 0) {
            var3 = SettingsStatics.anInt2453;
          } else {
            int var4 = 128 * (255 & GlobalStatics_10.anIntArray3083[var1]);
            int var7 = GlobalStatics_10.anIntArray3083[var1] >> 8 & 255;
            int var5 = 255 & GlobalStatics_10.anIntArray3083[var1] >> 16;
            int var8 = -GlobalStatics_9.localPlayer.sceneY + 64 + 128 * var7;
            if (var8 < 0) {
              var8 = -var8;
            }

            int var6 = -GlobalStatics_9.localPlayer.sceneX + 64 + var5 * 128;
            if (var6 < 0) {
              var6 = -var6;
            }

            int var9 = -128 + var6 + var8;
            if (var4 < var9) {
              com.jagex.runescape.statics.GlobalStatics_0.anIntArray2157[var1] = -100;
              continue;
            }

            if (var9 < 0) {
              var9 = 0;
            }

            var3 = SettingsStatics.anInt340 * (var4 - var9) / var4;
          }

          if (var3 > 0) {
            SomethingMusic0 var12 = var11.method1812()
                .method151(DummyClass32.aClass157_524);
            AudioStreamEncoder1 var13 = GlobalStatics_11
                .method437(var12, 100, var3);
            assert var13 != null;
            var13.method429(GlobalStatics_9.anIntArray2068[var1] - 1);
            GlobalStatics_9.aClass3_Sub24_Sub2_2563.method457(var13);
          }

          com.jagex.runescape.statics.GlobalStatics_0.anIntArray2157[var1] = -100;
        }
      }
    }

    if (var0 != -92) {
      GlobalStatics_6.method126(true, 36, 42, 14, 51);
    }

    if (GlobalStatics_9.aBoolean1158 && !GlobalStatics_6.method1391(-1)) {
      if (SettingsStatics.anInt120 != 0
          && GlobalStatics_4.anInt1691 != -1) {
        GlobalStatics_9.method1285(GlobalStatics_9.fileUnpacker6, false,
            GlobalStatics_4.anInt1691, 0, false, SettingsStatics.anInt120);
      }

      GlobalStatics_9.aBoolean1158 = false;
    } else if (SettingsStatics.anInt120 != 0
        && GlobalStatics_4.anInt1691 != -1
        && !GlobalStatics_6.method1391(var0 + 91)) {
      GlobalStatics_9.SECURE_BUFFER.writePacket(137);
      GlobalStatics_9.SECURE_BUFFER.writeInt(GlobalStatics_4.anInt1691);
      GlobalStatics_4.anInt1691 = -1;
      ++GlobalStatics_9.anInt3618;
    }
  }

  public static FloorUnderlay getFloorUnderlay(int var1) {
    FloorUnderlay underlay = (FloorUnderlay) GlobalStatics_4.floorUnderlays.get(
        var1);
    if (underlay != null) {
      return underlay;
    }
    byte[] bytes = GlobalStatics_9.aClass153_2536.getBytes(1, var1);
    underlay = new FloorUnderlay();
    if (bytes != null) {
      underlay.parseConfig(var1, new Buffer(bytes), 255);
    }
    GlobalStatics_4.floorUnderlays.get((byte) -104, underlay, var1);
    return underlay;
  }

  public static int method630(byte var0, int var1) {
    if (var0 != -34) {
      GameStringStatics.aClass94_3692 = null;
    }

    return 127 & var1 >> 11;
  }

  public static void setFloorFileUnpacker(boolean var0, FileUnpacker var1) {
    if (!var0) {
      GlobalStatics_6.configs = var1;
      GlobalStatics_9.amountFloors = GlobalStatics_6.configs
          .getAmountChildren(4, (byte) 112);
    }
  }

  public static void method632(int var0) {
    GameStringStatics.aClass94_3692 = null;
    GameStringStatics.aClass94_3691 = null;
    GlobalStatics_6.aClass3_Sub19Array3694 = null;
    GlobalStatics_6.variableUpdates = null;
    GlobalStatics_6.anIntArray3693 = null;
  }

  public static void method671(int[] var0, int[] var1, int var2, int var3,
      int var4,
      int var5, int var6, int var7, int var8, int var9, int var10,
      int var11, int var12) {
    int var13 = var3;

    for (int var14 = -var8; var14 < 0; ++var14) {
      int var15 = (var4 >> 16) * var11;

      for (int var16 = -var7; var16 < 0; ++var16) {
        int var17 = var1[(var3 >> 16) + var15];
        int var18 = var0[var5];
        int var19 = (var17 >>> 24) * var12 >> 8;
        int var20 = 256 - var19;
        var0[var5++] = ((var17 & 16711935) * var19 + (var18 & 16711935) * var20
            & -16711936) + (
            (var17 & 0xff00) * var19 + (var18 & 0xff00) * var20 & 16711680)
            >>> 8;
        var3 += var9;
      }

      var4 += var10;
      var3 = var13;
      var5 += var6;
    }

  }

  public static void method672(int[] var0, int[] var1, int var2, int var3,
      int var4,
      int var5, int var6, int var7, int var8) {
    int var9 = -var5;

    for (int var10 = -var6; var10 < 0; ++var10) {
      for (int var11 = var9; var11 < 0; ++var11) {
        var2 = var1[var3--];
        int var12 = var2 >>> 24;
        if (var12 == 0) {
          ++var4;
        } else {
          int var13 = 256 - var12;
          int var14 = var0[var4];
          var0[var4++] = ((var2 & 16711935) * var12 + (var14 & 16711935) * var13
              & -16711936) + (
              (var2 & 0xff00) * var12 + (var14 & 0xff00) * var13 & 16711680)
              >>> 8;
        }
      }

      var4 += var7;
      var3 += var8;
    }

  }

  public static void method673(int[] var0, int[] var1, int var2, int var3,
      int var4,
      int var5, int var6, int var7, int var8) {
    int var9 = -var5;

    for (int var10 = -var6; var10 < 0; ++var10) {
      for (int var11 = var9; var11 < 0; ++var11) {
        var2 = var1[var3++];
        int var12 = var2 >>> 24;
        if (var12 == 0) {
          ++var4;
        } else {
          int var13 = 256 - var12;
          int var14 = var0[var4];
          var0[var4++] = ((var2 & 16711935) * var12 + (var14 & 16711935) * var13
              & -16711936) + (
              (var2 & 0xff00) * var12 + (var14 & 0xff00) * var13 & 16711680)
              >>> 8;
        }
      }

      var4 += var7;
      var3 += var8;
    }

  }

  public static void method674(int[] var0, int[] var1, int var2, int var3,
      int var4,
      int var5, int var6, int var7, int var8, int var9) {
    for (int var10 = -var6; var10 < 0; ++var10) {
      for (int var11 = -var5; var11 < 0; ++var11) {
        int var12 = (var1[var3] >>> 24) * var9 >> 8;
        int var13 = 256 - var12;
        int var14 = var1[var3++];
        int var15 = var0[var4];
        var0[var4++] = ((var14 & 16711935) * var12 + (var15 & 16711935) * var13
            & -16711936) + (
            (var14 & 0xff00) * var12 + (var15 & 0xff00) * var13 & 16711680)
            >>> 8;
      }

      var4 += var7;
      var3 += var8;
    }

  }

  public static void method675(int[] var0, int[] var1, int var2, int var3,
      int var4,
      int var5, int var6, int var7, int var8, int var9, int var10,
      int var11) {
    int var12 = var3;

    for (int var13 = -var8; var13 < 0; ++var13) {
      int var14 = (var4 >> 16) * var11;

      for (int var15 = -var7; var15 < 0; ++var15) {
        var2 = var1[(var3 >> 16) + var14];
        int var16 = var2 >>> 24;
        if (var16 == 0) {
          ++var5;
        } else {
          int var17 = 256 - var16;
          int var18 = var0[var5];
          var0[var5++] = ((var2 & 16711935) * var16 + (var18 & 16711935) * var17
              & -16711936) + (
              (var2 & 0xff00) * var16 + (var18 & 0xff00) * var17 & 16711680)
              >>> 8;
        }

        var3 += var9;
      }

      var4 += var10;
      var3 = var12;
      var5 += var6;
    }

  }
}
