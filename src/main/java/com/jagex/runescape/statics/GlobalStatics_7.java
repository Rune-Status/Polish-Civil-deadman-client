package com.jagex.runescape.statics;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.model.AbstractDirectColorSprite;
import com.jagex.runescape.model.AbstractFont;
import com.jagex.runescape.model.AnimationSequence;
import com.jagex.runescape.model.BitVariable;
import com.jagex.runescape.model.CollisionMap;
import com.jagex.runescape.model.FileUnpacker;
import com.jagex.runescape.model.FloorOverlay;
import com.jagex.runescape.model.FloorUnderlay;
import com.jagex.runescape.model.GameBuffer;
import com.jagex.runescape.model.GameWorld;
import com.jagex.runescape.model.IntegerNode;
import com.jagex.runescape.model.Inventory;
import com.jagex.runescape.model.ItemConfig;
import com.jagex.runescape.model.Mobile;
import com.jagex.runescape.model.MouseRecorder;
import com.jagex.runescape.model.NPC;
import com.jagex.runescape.model.ObjectCache;
import com.jagex.runescape.model.Player;
import com.jagex.runescape.model.RenderAnimation;
import com.jagex.runescape.scene.SceneNode;
import com.jagex.runescape.scene.SceneSomething;
import com.jagex.runescape.model.SignLink;
import com.jagex.runescape.model.SignLinkRequest;
import com.jagex.runescape.model.SoftwareDirectColorSprite;
import com.jagex.runescape.model.SomethingFont;
import com.jagex.runescape.model.SomethingPacket151;
import com.jagex.runescape.model.SpawnedGameObject;
import com.jagex.runescape.model.Widget;
import com.jagex.runescape.model.WidgetAccess;
import com.jagex.runescape.model.WidgetUpdate;
import com.jagex.runescape.opengl.DummyClass46;
import com.jagex.runescape.opengl.GLStatics;
import com.jagex.runescape.opengl.GlDirectColorSprite;
import com.jagex.runescape.opengl.GlEnvironment;
import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.GlTexture2d;
import com.jagex.runescape.opengl.GlUtils;
import com.jagex.runescape.opengl.MaterialShader5;
import com.jagex.runescape.opengl.SomethingGl0;
import com.jagex.runescape.settings.SettingsStatics;
import com.jagex.runescape.sprite.SoftwareIndexedColorSprite;
import java.awt.Frame;
import java.nio.charset.StandardCharsets;

public class GlobalStatics_7 {

  public static int anInt2437;
  public static int anInt2440;
  public static ObjectCache aClass93_2442 = new ObjectCache(50);
  public static ObjectCache aClass93_2450 = new ObjectCache(64);
  public static int anInt2451 = -1;
  public static byte[][][] aByteArrayArrayArray2452;
  public static int anInt2453 = 127;
  public static int CAMERA_Y;
  public static int anInt3659;
  public static int anInt3660;
  public static GameString aClass94_3661 = GameStringStatics.create("T");
  public static boolean aBoolean3665 = true;
  public static GameString[] playerOptions = new GameString[8];
  public static GameString aClass94_1301 = GameStringStatics.create("(U3");
  public static int anInt1302;
  public static SomethingFont aClass33_1305;
  public static int anInt1307;
  public static byte aByte1308;
  public static long aLong1310;
  public static short[] aShortArray1311;
  public static int anInt880;
  public static int[] anIntArray882 = new int[200];
  public static GameString[] aClass94Array2977 = new GameString[5];
  public static WidgetAccess aClass3_Sub1_2980 = new WidgetAccess(0, -1);
  public static boolean aBoolean2981;
  public static ObjectCache aClass93_2982 = new ObjectCache(32);
  public static GameString aClass94_1440 =
      GameStringStatics.create("Connected to update server");
  public static GameString CONNECTED_TO_UPDATE_SERVER = GlobalStatics_7.aClass94_1440;
  public static int anInt1439;
  public static int viewY;
  public static MouseRecorder aClass67_1443;
  public static short SOMETHING_SCENE_Y_1_0 = 256;
  public static int loopCycle;
  public static boolean aBoolean1451;
  public static FileUnpacker animationFrames;
  public static int anInt2161 = -1;
  public static int SCENE_CAMERA_Y;
  public static GameString aClass94_2163 = GameStringStatics
      .create("Gegenstand f-Ur Mitglieder");
  public static GameString aClass94_2164 = GameStringStatics
      .create("hint_mapedge");
  public static int anInt2165;
  public static int lastPacketId1;
  public static short[] aShortArray2167 = {
      (short) 30, (short) 6, (short) 31, (short) 29, (short) 10, (short) 44,
      (short) 37, (short) 57
  };
  public static GameString aClass94_2168 = GameStringStatics.create("<br>");
  public static long[] aLongArray1631 = new long[256];
  public static int anInt1633;
  public static GameString aClass94_1636;
  public static GameString aClass94_1637;
  public static int[] anIntArray1638;
  public static GameString aClass94_4055 = GameStringStatics
      .create(" has logged in)3");
  public static GameString aClass94_4058 = GlobalStatics_7.aClass94_4055;
  public static int anInt4054;
  public static GameString aClass94_4057 = GameStringStatics.create("Mem:");
  public static SceneSomething[] aClass25Array4060;
  public static int anInt4062;
  public static boolean aBoolean4063;
  public static boolean aBoolean1080;
  public static int anInt1081;
  public static int anInt1082;
  public static int[] anIntArray1083;
  public static boolean aBoolean1084;
  public static GameString aClass94_1085 = GameStringStatics
      .create("brillant1:");
  public static int anInt1088;
  public static GameString aClass94_1089 = GameStringStatics
      .create("Chargement des sprites )2 ");
  public static ObjectCache aClass93_684 = new ObjectCache(64);
  public static int anInt685;
  public static int[] anIntArray686 = new int[2];
  public static int anInt688;
  public static int fogOffset;
  public static GameString aClass94_2960 =
      GameStringStatics.create("Loading interfaces )2 ");
  public static GameString aClass94_2961 = GlobalStatics_7.aClass94_2960;
  public static GameBuffer loginBuffer = new GameBuffer(5000);
  public static GameString aClass94_2945 = GameStringStatics.create(
      "Votre liste d(Wamis est pleine (X100 noms maximum pour la version gratuite et 200 pour les abonn-Bs(Y)3");
  public static GameString aClass94_2951 = GameStringStatics.create("k");
  public static int[] anIntArray2952 = new int[128];
  public static int anInt2958;
  public static GameString aClass94_2959 = GameStringStatics
      .create("mapfunction");

  public static void method375(int var0, FileUnpacker var1, FileUnpacker var2) {
    GlobalStatics_9.aClass153_152 = var1;
    DummyClass2.aClass153_1680 = var2;
    GlobalStatics_9.anInt497 = DummyClass2.aClass153_1680
        .getAmountChildren(var0, (byte) 95);
  }

  public static void method376(boolean var0) {
    GlobalStatics_7.aClass93_2442 = null;
    if (var0) {
      GlobalStatics_7.method378(97, (byte) -80);
    }

    GlobalStatics_7.aByteArrayArrayArray2452 = null;
    GlobalStatics_7.aClass93_2450 = null;
  }

  public static void method377(int var0, int var1, int var2, int var3,
      int var4) {
    GlobalStatics_9.secureBuffer.position = 0;
    GlobalStatics_9.secureBuffer.writeByte(147);
    GlobalStatics_9.secureBuffer.writeByte(var2);
    GlobalStatics_9.secureBuffer.writeByte(var3);
    GlobalStatics_9.secureBuffer.writeShort(var0);
    GlobalStatics_9.secureBuffer.writeShort(var1);
    DummyClass22.anInt1734 = 0;
    GlobalStatics_9.anInt548 = 0;
    GlobalStatics_0.anInt23 = var4;
    com.jagex.runescape.statics.GlobalStatics_0.anInt1711 = -3;
  }

  public static BitVariable method378(int var0, byte var1) {
    BitVariable var2 = (BitVariable) GlobalStatics_7.aClass93_2450.get(var0);
    if (var2 == null) {
      if (var1 < 126) {
        return null;
      } else {
        byte[] var3 = DummyClass55.aClass153_1420
            .getBytes(GlobalStatics_9.method2032(var0, 5439488),
                GlobalStatics_9.method2234(var0, -127));
        var2 = new BitVariable();
        if (var3 != null) {
          var2.method1387(new Buffer(var3));
        }

        GlobalStatics_7.aClass93_2450.get((byte) -84, var2, var0);
        return var2;
      }
    } else {
      return var2;
    }
  }

  public static void method379(int var0) {
    int var2 = GlobalStatics_5.anInt1904 * 128 + 64;
    int var1 = 128 * GlobalStatics_8.anInt30 + 64;
    int var3 =
        GlobalStatics_6.method1736(GlobalStatics_9.currentPlane, 1, var1, var2)
            - GlobalStatics_10.anInt3414;
    if (GlobalStatics_4.anInt3631 >= 100) {
      GlobalStatics_9.SCENE_CAMERA_X = 64 + GlobalStatics_8.anInt30 * 128;
      DummyClass49.SCENE_CAMERA_Z = 64 + GlobalStatics_5.anInt1904 * 128;
      GlobalStatics_7.SCENE_CAMERA_Y =
          GlobalStatics_6.method1736(GlobalStatics_9.currentPlane, var0 - 1023,
              GlobalStatics_9.SCENE_CAMERA_X,
              DummyClass49.SCENE_CAMERA_Z) - GlobalStatics_10.anInt3414;
    } else {
      if (GlobalStatics_9.SCENE_CAMERA_X < var1) {
        GlobalStatics_9.SCENE_CAMERA_X +=
            DummyClass8.anInt4021 +
                GlobalStatics_4.anInt3631 * (-GlobalStatics_9.SCENE_CAMERA_X + var1)
                    / 1000;
        if (GlobalStatics_9.SCENE_CAMERA_X > var1) {
          GlobalStatics_9.SCENE_CAMERA_X = var1;
        }
      }

      if (GlobalStatics_7.SCENE_CAMERA_Y < var3) {
        GlobalStatics_7.SCENE_CAMERA_Y +=
            (-GlobalStatics_7.SCENE_CAMERA_Y + var3) * GlobalStatics_4.anInt3631 / 1000
                + DummyClass8.anInt4021;
        if (GlobalStatics_7.SCENE_CAMERA_Y > var3) {
          GlobalStatics_7.SCENE_CAMERA_Y = var3;
        }
      }

      if (GlobalStatics_9.SCENE_CAMERA_X > var1) {
        GlobalStatics_9.SCENE_CAMERA_X -=
            DummyClass8.anInt4021
                + (GlobalStatics_9.SCENE_CAMERA_X - var1) * GlobalStatics_4.anInt3631
                / 1000;
        if (GlobalStatics_9.SCENE_CAMERA_X < var1) {
          GlobalStatics_9.SCENE_CAMERA_X = var1;
        }
      }

      if (DummyClass49.SCENE_CAMERA_Z < var2) {
        DummyClass49.SCENE_CAMERA_Z += DummyClass8.anInt4021
            + GlobalStatics_4.anInt3631 * (var2 - DummyClass49.SCENE_CAMERA_Z)
            / 1000;
        if (var2 < DummyClass49.SCENE_CAMERA_Z) {
          DummyClass49.SCENE_CAMERA_Z = var2;
        }
      }

      if (var3 < GlobalStatics_7.SCENE_CAMERA_Y) {
        GlobalStatics_7.SCENE_CAMERA_Y -=
            (GlobalStatics_7.SCENE_CAMERA_Y - var3) * GlobalStatics_4.anInt3631 / 1000
                + DummyClass8.anInt4021;
        if (var3 > GlobalStatics_7.SCENE_CAMERA_Y) {
          GlobalStatics_7.SCENE_CAMERA_Y = var3;
        }
      }

      if (DummyClass49.SCENE_CAMERA_Z > var2) {
        DummyClass49.SCENE_CAMERA_Z -= DummyClass8.anInt4021 +
            (-var2 + DummyClass49.SCENE_CAMERA_Z) * GlobalStatics_4.anInt3631
                / 1000;
        if (var2 > DummyClass49.SCENE_CAMERA_Z) {
          DummyClass49.SCENE_CAMERA_Z = var2;
        }
      }
    }

    var2 = GlobalStatics_9.anInt1996 * 128 + 64;
    var1 = GlobalStatics_9.anInt1923 * 128 + 64;
    var3 =
        GlobalStatics_6.method1736(GlobalStatics_9.currentPlane, 1, var1, var2)
            - GlobalStatics_9.anInt529;
    int var5 = var3 - GlobalStatics_7.SCENE_CAMERA_Y;
    int var6 = -DummyClass49.SCENE_CAMERA_Z + var2;
    int var4 = -GlobalStatics_9.SCENE_CAMERA_X + var1;
    int var7 = (int) Math.sqrt(var4 * var4 + var6 * var6);
    int var8 = (int) (325.949D * Math.atan2(var5, var7)) & 2047;
    if (var8 < 128) {
      var8 = 128;
    }

    if (var8 > 383) {
      var8 = 383;
    }

    int var9 = (int) (-325.949 * Math.atan2(var4, var6)) & 2047;
    if (DummyClass17.SCENE_CAMERA_PITCH < var8) {
      DummyClass17.SCENE_CAMERA_PITCH += GlobalStatics_3.anInt1105
          + DummyClass8.anInt4014 * (-DummyClass17.SCENE_CAMERA_PITCH + var8) / 1000;
      if (DummyClass17.SCENE_CAMERA_PITCH > var8) {
        DummyClass17.SCENE_CAMERA_PITCH = var8;
      }
    }

    if (DummyClass17.SCENE_CAMERA_PITCH > var8) {
      DummyClass17.SCENE_CAMERA_PITCH -=
          (DummyClass17.SCENE_CAMERA_PITCH - var8) * DummyClass8.anInt4014 / 1000
              + GlobalStatics_3.anInt1105;
      if (DummyClass17.SCENE_CAMERA_PITCH < var8) {
        DummyClass17.SCENE_CAMERA_PITCH = var8;
      }
    }

    int var10 = -GlobalStatics_10.SCENE_CAMERA_YAW + var9;
    if (var10 > var0) {
      var10 -= 2048;
    }

    if (var10 < -1024) {
      var10 += 2048;
    }

    if (var10 > 0) {
      GlobalStatics_10.SCENE_CAMERA_YAW +=
          var10 * DummyClass8.anInt4014 / 1000 + GlobalStatics_3.anInt1105;
      GlobalStatics_10.SCENE_CAMERA_YAW &= 2047;
    }

    if (var10 < 0) {
      GlobalStatics_10.SCENE_CAMERA_YAW -=
          DummyClass8.anInt4014 * -var10 / 1000 + GlobalStatics_3.anInt1105;
      GlobalStatics_10.SCENE_CAMERA_YAW &= 2047;
    }

    int var11 = -GlobalStatics_10.SCENE_CAMERA_YAW + var9;
    if (var11 > 1024) {
      var11 -= 2048;
    }

    if (var11 < 1023) {
      var11 += 2048;
    }

    if (var11 < 0 && var10 > 0 || var11 > 0 && var10 < 0) {
      GlobalStatics_10.SCENE_CAMERA_YAW = var9;
    }
  }

  public static SoftwareIndexedColorSprite[] createSprites(byte var0, int var1,
      FileUnpacker var2) {
    return GlobalStatics_9.loadSprites(var2, var1) ?
        var0 <= 52 ? null : GlobalStatics_9.createSprites(0) :
        null;
  }

  public static byte[] method623(byte var0, byte[] var1) {
    if (var0 > -112) {
      GlobalStatics_7.createSprites((byte) 43, -121, null);
    }

    Buffer var2 = new Buffer(var1);
    int var3 = var2.readUnsignedByte();
    int var4 = var2.readInt();
    if (var4 >= 0 && (GlobalStatics_3.anInt1108 == 0
        || GlobalStatics_3.anInt1108 >= var4)) {
      if (var3 == 0) {
        byte[] var8 = new byte[var4];
        var2.copy(0, var4, var8);
        return var8;
      } else {
        int var5 = var2.readInt();
        if (var5 >= 0 && (GlobalStatics_3.anInt1108 == 0
            || GlobalStatics_3.anInt1108 >= var5)) {
          byte[] var6 = new byte[var5];
          if (var3 == 1) {
            BZipDecompressor.method1640(var6, var5, var1, 9);
          } else {
            GlobalStatics_6.aClass49_2505
                .decompress(var6, var2, false);
          }

          return var6;
        } else {
          throw new RuntimeException();
        }
      }
    } else {
      throw new RuntimeException();
    }
  }

  public static void method624(int var0) {
    GlobalStatics_7.aClass94_3661 = null;
    if (var0 != -1) {
      GlobalStatics_7.method623((byte) -86, null);
    }
  }

  public static void clear23(byte var0) {
    if (var0 > -123) {
      GlobalStatics_7.clear23((byte) -27);
    }

    GlobalStatics_7.aShortArray1311 = null;
    GlobalStatics_7.playerOptions = null;
    GlobalStatics_7.aClass94_1301 = null;
    GlobalStatics_7.aClass33_1305 = null;
  }

  public static void method1493(int var0, int var1, Widget var2, int var3,
      byte var4) {
    if (var4 == 59) {
      if (GlRenderer.USE_OPENGL) {
        GlUtils.clip(var0, var1, var2.anInt168 + var0, var2.zoom + var1);
      }

      if (DummyClass12.minimapMode >= 3) {
        if (GlRenderer.USE_OPENGL) {
          AbstractDirectColorSprite var5 = var2.method866((byte) -113, false);
          if (var5 != null) {
            var5.method643(var0, var1);
          }
        } else {
          DummyClass47.method1332(var0, var1, 0, var2.anIntArray207,
              var2.anIntArray291);
        }
      } else if (GlRenderer.USE_OPENGL) {
        ((GlDirectColorSprite) GlobalStatics_9.aClass3_Sub28_Sub16_895)
            .draw(var0, var1,
                var2.anInt168, var2.zoom,
                GlobalStatics_9.aClass3_Sub28_Sub16_895.anInt3707 / 2,
                GlobalStatics_9.aClass3_Sub28_Sub16_895.anInt3696 / 2,
                GlobalStatics_9.anInt531, 256,
                (GlDirectColorSprite) var2.method866((byte) -113, false));
      } else {
        ((SoftwareDirectColorSprite) GlobalStatics_9.aClass3_Sub28_Sub16_895)
            .method667(var0, var1,
                var2.anInt168, var2.zoom,
                GlobalStatics_9.aClass3_Sub28_Sub16_895.anInt3707 / 2,
                GlobalStatics_9.aClass3_Sub28_Sub16_895.anInt3696 / 2,
                GlobalStatics_9.anInt531, 256,
                var2.anIntArray207, var2.anIntArray291);
      }

      DummyClass9.aBooleanArray4008[var3] = true;
    }
  }

  public static boolean isOnScreen(int x, int var1, int var2, int z, int far) {
    int xx =
        z * GlobalStatics_10.yawSine + x * GlobalStatics_10.yawCosine >> 16;
    int var6 =
        z * GlobalStatics_10.yawCosine - x * GlobalStatics_10.yawSine >> 16;
    int zz = var1 * DummyClass44.pitchSine + var6 * GlobalStatics_9.pitchCosine
        >> 16;
    int yy = var1 * GlobalStatics_9.pitchCosine - var6 * DummyClass44.pitchSine
        >> 16;
    if (zz < 1) {
      zz = 1;
    }

    int screenX = (xx << 9) / zz;
    int screenY = (yy << 9) / zz;
    int zz0 = var2 * DummyClass44.pitchSine + var6 * GlobalStatics_9.pitchCosine
        >> 16;
    int yy0 = var2 * GlobalStatics_9.pitchCosine - var6 * DummyClass44.pitchSine
        >> 16;
    if (zz0 < 1) {
      zz0 = 1;
    }

    int screenX0 = (xx << 9) / zz0;
    int screenY0 = (yy0 << 9) / zz0;
    return !(zz < 50 && zz0 < 50) && !(zz > far && zz0 > far) && !(
        screenX < DummyClass17.screenLowerX
            && screenX0 < DummyClass17.screenLowerX) && !(
        screenX > GlobalStatics_10.screenUpperX
            && screenX0 > GlobalStatics_10.screenUpperX) && !(
        screenY < DummyClass3.screenUpperY
            && screenY0 < DummyClass3.screenUpperY) && (
        screenY <= GLStatics.screenLowerY
            || screenY0 <= GLStatics.screenLowerY);
  }

  public static void method1180(byte var0, Mobile var1) {
    RenderAnimation var2 = var1.getRenderAnimationId(false);
    assert var2 != null;
    var1.anInt2764 = var2.anInt368;
    if (var0 >= -5) {
      GlobalStatics_7.anIntArray882 = null;
    }

    if (var1.anInt2816 == 0) {
      var1.anInt2824 = 0;
    } else {
      if (var1.animationId != -1 && var1.anInt2828 == 0) {
        AnimationSequence var3 = GlobalStatics_8
            .method45(var1.animationId, (byte) -20);
        if (var1.anInt2811 > 0 && var3.anInt1866 == 0) {
          ++var1.anInt2824;
          return;
        }

        if (var1.anInt2811 <= 0 && var3.anInt1850 == 0) {
          ++var1.anInt2824;
          return;
        }
      }

      int var18 = var1.sceneX;
      int var4 = var1.sceneY;
      int var5 =
          var1.waypointsX[-1 + var1.anInt2816] * 128 + var1.getSize() * 64;
      int var6 =
          128 * var1.waypointsY[-1 + var1.anInt2816] + var1.getSize() * 64;
      if (var5 - var18 > 256 || -var18 + var5 < -256
          || var6 - var4 > 256
          || var6 - var4 < -256) {
        var1.sceneX = var5;
        var1.sceneY = var6;
        return;
      }

      if (var5 <= var18) {
        if (var18 <= var5) {
          if (var6 <= var4) {
            if (var4 > var6) {
              var1.anInt2806 = 0;
            }
          } else {
            var1.anInt2806 = 1024;
          }
        } else if (var6 > var4) {
          var1.anInt2806 = 768;
        } else if (var6 < var4) {
          var1.anInt2806 = 256;
        } else {
          var1.anInt2806 = 512;
        }
      } else if (var6 > var4) {
        var1.anInt2806 = 1280;
      } else if (var4 > var6) {
        var1.anInt2806 = 1792;
      } else {
        var1.anInt2806 = 1536;
      }

      int var7 = 2047 & -var1.rotationY + var1.anInt2806;
      int var8 = var2.anInt389;
      if (var7 > 1024) {
        var7 -= 2048;
      }

      boolean var10 = true;
      byte var11 = 1;
      if (var7 >= -256 && var7 <= 256) {
        var8 = var2.anInt382;
      } else if (var7 >= 256 && var7 < 768) {
        var8 = var2.anInt364;
      } else if (var7 >= 767 && var7 <= -256) {
        var8 = var2.anInt390;
      }

      int var9 = 4;
      if (var8 == -1) {
        var8 = var2.anInt382;
      }

      var1.anInt2764 = var8;
      if (var1 instanceof NPC) {
        var10 = ((NPC) var1).config.aBoolean1255;
      }

      if (var10) {
        if (var1.rotationY != var1.anInt2806 && var1.anInt2772 == -1
            && var1.anInt2779 != 0) {
          var9 = 2;
        }

        if (var1.anInt2816 > 2) {
          var9 = 6;
        }

        if (var1.anInt2816 > 3) {
          var9 = 8;
        }

        if (var1.anInt2824 > 0 && var1.anInt2816 > 1) {
          var9 = 8;
          --var1.anInt2824;
        }
      } else {
        if (var1.anInt2816 > 1) {
          var9 = 6;
        }

        if (var1.anInt2816 > 2) {
          var9 = 8;
        }

        if (var1.anInt2824 > 0 && var1.anInt2816 > 1) {
          --var1.anInt2824;
          var9 = 8;
        }
      }

      if (var1.aByteArray2795[var1.anInt2816 - 1] == 2) {
        var9 <<= 1;
        var11 = 2;
      } else {
        if (var1.aByteArray2795[-1 + var1.anInt2816] == 0) {
          var11 = 0;
          var9 >>= 1;
        }
      }

      if (var9 >= 8 && var2.anInt393 != -1) {
        if (var2.anInt389 == var1.anInt2764 && var2.anInt386 != -1) {
          var1.anInt2764 = var2.anInt386;
        } else if (var1.anInt2764 == var2.anInt390 && var2.anInt373 != -1) {
          var1.anInt2764 = var2.anInt373;
        } else if (var1.anInt2764 == var2.anInt364 && var2.anInt375 != -1) {
          var1.anInt2764 = var2.anInt375;
        } else {
          var1.anInt2764 = var2.anInt393;
        }
      } else if (var2.anInt398 != -1 && var11 == 0) {
        if (var2.anInt389 == var1.anInt2764 && var2.anInt372 != -1) {
          var1.anInt2764 = var2.anInt372;
        } else if (var2.anInt390 == var1.anInt2764 && var2.anInt406 != -1) {
          var1.anInt2764 = var2.anInt406;
        } else if (var2.anInt364 == var1.anInt2764 && var2.anInt379 != -1) {
          var1.anInt2764 = var2.anInt379;
        } else {
          var1.anInt2764 = var2.anInt398;
        }
      }

      if (var2.anInt360 != -1) {
        var9 <<= 7;
        if (var1.anInt2816 == 1) {
          int var13 =
              (var5 >= var1.sceneX ? var5 - var1.sceneX
                  : -var5 + var1.sceneX) << 7;
          int var12 = var1.anInt2758 * var1.anInt2758;
          int var14 =
              (var6 < var1.sceneY ? -var6 + var1.sceneY
                  : -var1.sceneY + var6) << 7;
          int var15 = var13 > var14 ? var13 : var14;
          int var16 = var2.anInt360 * 2 * var15;
          if (var16 >= var12) {
            if (var15 < var12 / 2) {
              var1.anInt2758 -= var2.anInt360;
              if (var1.anInt2758 < 0) {
                var1.anInt2758 = 0;
              }
            } else if (var1.anInt2758 < var9) {
              var1.anInt2758 += var2.anInt360;
              if (var1.anInt2758 > var9) {
                var1.anInt2758 = var9;
              }
            }
          } else {
            var1.anInt2758 /= 2;
          }
        } else if (var9 > var1.anInt2758) {
          var1.anInt2758 += var2.anInt360;
          if (var9 < var1.anInt2758) {
            var1.anInt2758 = var9;
          }
        } else if (var1.anInt2758 > 0) {
          var1.anInt2758 -= var2.anInt360;
          if (var1.anInt2758 < 0) {
            var1.anInt2758 = 0;
          }
        }

        var9 = var1.anInt2758 >> 7;
        if (var9 < 1) {
          var9 = 1;
        }
      }

      if (var18 < var5) {
        var1.sceneX += var9;
        if (var5 < var1.sceneX) {
          var1.sceneX = var5;
        }
      } else if (var18 > var5) {
        var1.sceneX -= var9;
        if (var5 > var1.sceneX) {
          var1.sceneX = var5;
        }
      }

      if (var4 >= var6) {
        if (var6 < var4) {
          var1.sceneY -= var9;
          if (var6 > var1.sceneY) {
            var1.sceneY = var6;
          }
        }
      } else {
        var1.sceneY += var9;
        if (var1.sceneY > var6) {
          var1.sceneY = var6;
        }
      }

      if (var1.sceneX == var5 && var6 == var1.sceneY) {
        --var1.anInt2816;
        if (var1.anInt2811 > 0) {
          --var1.anInt2811;
        }
      }
    }
  }

  public static void method1181(byte var0) {
    GlobalStatics_7.anIntArray882 = null;
  }

  public static int method1184(int var0, byte var1) {
    int var2 = 91 / ((var1 - 28) / 39);
    int var3 = var0 & 63;
    int var4 = (var0 & 217) >> 6;
    if (var3 == 18) {
      if (var4 == 0) {
        return 1;
      }

      if (var4 == 1) {
        return 2;
      }

      if (var4 == 2) {
        return 4;
      }

      if (var4 == 3) {
        return 8;
      }
    } else {
      if (var3 == 19 || var3 == 21) {
        if (var4 == 0) {
          return 16;
        }

        if (var4 == 1) {
          return 32;
        }

        if (var4 == 2) {
          return 64;
        }

        if (var4 == 3) {
          return 128;
        }
      }
    }

    return 0;
  }

  public static int method1185(int var0) {
    if (var0 != 6098) {
      GlobalStatics_7.method1180((byte) -98, null);
    }

    return 2;
  }

  public static void method2187(int var0) {
    GlobalStatics_7.aClass94Array2977 = null;
    GlobalStatics_7.aClass93_2982 = null;
    GlobalStatics_7.aClass3_Sub1_2980 = null;
    if (var0 != 27316) {
      GlobalStatics_7.aBoolean2981 = true;
    }
  }

  public static void method2189(CollisionMap[] collisionMaps, boolean var1,
      int var2) {
    int var4;
    int var5;
    if (!var1) {
      for (var4 = 0; var4 < 4; ++var4) {
        for (var5 = 0; var5 < 104; ++var5) {
          for (int var6 = 0; var6 < 104; ++var6) {
            if ((1 & GlobalStatics_10.tileFlags[var4][var5][var6]) == 1) {
              int var7 = var4;
              if ((2 & GlobalStatics_10.tileFlags[1][var5][var6]) == 2) {
                var7 = var4 - 1;
              }

              if (var7 >= 0) {
                collisionMaps[var7].method1497(var6, 7605, var5);
              }
            }
          }
        }
      }

      GlobalStatics_1.anInt1463 += (int) (Math.random() * 5.0D) - 2;
      if (GlobalStatics_1.anInt1463 < 15) {
        GlobalStatics_1.anInt1463 = -16;
      }

      if (GlobalStatics_1.anInt1463 > 16) {
        GlobalStatics_1.anInt1463 = 16;
      }

      GlobalStatics_10.anInt3158 += (int) (Math.random() * 5.0D) - 2;
      if (GlobalStatics_10.anInt3158 < -8) {
        GlobalStatics_10.anInt3158 = -8;
      }

      if (GlobalStatics_10.anInt3158 > 8) {
        GlobalStatics_10.anInt3158 = 8;
      }
    }

    byte var3;
    if (var1) {
      var3 = 1;
    } else {
      var3 = 4;
    }

    var4 = GlobalStatics_10.anInt3158 >> 2 << 10;
    int[][] var34 = new int[104][104];
    int[][] var35 = new int[104][104];
    var5 = GlobalStatics_1.anInt1463 >> 1;

    int var8;
    int lightPosX;
    int lightPosY;
    int lightMagnitude;
    int var14;
    int var15;
    int var16;
    int var19;
    int var18;
    int var20;
    int lightPosZ;
    int var44;
    for (var8 = 0; var3 > var8; ++var8) {
      byte[][] var9 = GlobalStatics_9.SCENE_SHADOW[var8];
      int var21;
      int var23;
      int var22;
      int var24;
      if (GlRenderer.USE_OPENGL) {
        if (GLStatics.USE_BUMP_MAPS) {
          for (lightPosX = 1; lightPosX < 103; ++lightPosX) {
            for (lightPosY = 1; lightPosY < 103; ++lightPosY) {
              lightMagnitude =
                  (var9[1 + lightPosY][lightPosX] >> 3) + (
                      var9[-1 + lightPosY][lightPosX] >> 2)
                      + (var9[lightPosY][-1 + lightPosX] >> 2) + (
                      var9[lightPosY][1 + lightPosX]
                          >> 3) + (var9[lightPosY][lightPosX] >> 1);
              byte var12 = 74;
              var35[lightPosY][lightPosX] = -lightMagnitude + var12;
            }
          }
        } else {
          lightPosX = (int) GlEnvironment.DIFFUSE_LIGHT_0[0];
          lightPosY = (int) GlEnvironment.DIFFUSE_LIGHT_0[1];
          lightPosZ = (int) GlEnvironment.DIFFUSE_LIGHT_0[2];
          lightMagnitude = (int) Math.sqrt(
              lightPosY * lightPosY + lightPosX * lightPosX + lightPosZ
                  * lightPosZ);
          var14 = 1024 * lightMagnitude >> 8;

          for (var15 = 1; var15 < 103; ++var15) {
            for (var16 = 1; var16 < 103; ++var16) {
              byte var17 = 96;
              var18 = GlobalStatics_4.heightMap[var8][var16 + 1][var15]
                  - GlobalStatics_4.heightMap[var8][-1 + var16][var15];
              var19 = GlobalStatics_4.heightMap[var8][var16][var15 + 1]
                  - GlobalStatics_4.heightMap[var8][var16][-1 + var15];
              var20 = (int) Math.sqrt(var18 * var18 + 65536 + var19 * var19);
              var21 = (var18 << 8) / var20;
              var24 = (var9[var16][1 + var15] >> 3) + (var9[var16][var15 - 1]
                  >> 2) + (var9[var16 - 1][var15] >> 2) + (
                  var9[var16 + 1][var15]
                      >> 3) + (
                  var9[var16][var15] >> 1);
              var22 = -65536 / var20;
              var23 = (var19 << 8) / var20;
              var44 =
                  var17 + (lightPosZ * var23 + lightPosX * var21 + var22
                      * lightPosY) / var14;
              var35[var16][var15] = var44 - (int) (var24 * 1.7F);
            }
          }
        }
      } else {
        lightPosX = (int) Math.sqrt(5100.0D);
        lightPosY = 768 * lightPosX >> 8;

        for (lightPosZ = 1; lightPosZ < 103; ++lightPosZ) {
          for (lightMagnitude = 1; lightMagnitude < 103; ++lightMagnitude) {
            var16 =
                -GlobalStatics_4.heightMap[var8][lightMagnitude][-1 + lightPosZ]
                    + GlobalStatics_4.heightMap[var8][lightMagnitude][lightPosZ
                    + 1];
            byte var41 = 74;
            var15 =
                -GlobalStatics_4.heightMap[var8][lightMagnitude - 1][lightPosZ]
                    + GlobalStatics_4.heightMap[var8][lightMagnitude
                    + 1][lightPosZ];
            var44 = (int) Math.sqrt(var15 * var15 + 65536 + var16 * var16);
            var20 = (var16 << 8) / var44;
            var19 = -65536 / var44;
            var18 = (var15 << 8) / var44;
            var21 =
                (var9[lightMagnitude][lightPosZ] >> 1) + (
                    var9[lightMagnitude][-1 + lightPosZ] >> 2)
                    + (var9[lightMagnitude + 1][lightPosZ] >> 3) + (
                    var9[lightMagnitude - 1][lightPosZ] >> 2) + (
                    var9[lightMagnitude][lightPosZ + 1]
                        >> 3);
            var14 =
                var41 + (var20 * -50 + var18 * -50 + var19 * -10) / lightPosY;
            var35[lightMagnitude][lightPosZ] = var14 - var21;
          }
        }
      }

      for (lightPosX = 0; lightPosX < 104; ++lightPosX) {
        GlobalStatics_4.anIntArray1695[lightPosX] = 0;
        GlobalStatics_9.anIntArray1138[lightPosX] = 0;
        GlobalStatics_9.anIntArray2606[lightPosX] = 0;
        GlobalStatics_9.anIntArray1920[lightPosX] = 0;
        GlobalStatics_9.anIntArray2469[lightPosX] = 0;
      }

      for (lightPosX = -5; lightPosX < 104; ++lightPosX) {
        for (lightPosY = 0; lightPosY < 104; ++lightPosY) {
          lightPosZ = lightPosX + 5;
          if (lightPosZ < 104) {
            lightMagnitude = 255
                & GlobalStatics_10.floorUnderlayIds[var8][lightPosZ][lightPosY];
            if (lightMagnitude > 0) {
              FloorUnderlay underlay = GlobalStatics_6
                  .getFloorUnderlay(-1 + lightMagnitude);
              GlobalStatics_4.anIntArray1695[lightPosY] += underlay.anInt1408;
              GlobalStatics_9.anIntArray1138[lightPosY] += underlay.anInt1406;
              GlobalStatics_9.anIntArray2606[lightPosY] += underlay.anInt1417;
              GlobalStatics_9.anIntArray1920[lightPosY] += underlay.anInt1418;
              ++GlobalStatics_9.anIntArray2469[lightPosY];
            }
          }

          lightMagnitude = -5 + lightPosX;
          if (lightMagnitude >= 0) {
            var14 = 255
                & GlobalStatics_10.floorUnderlayIds[var8][lightMagnitude][lightPosY];
            if (var14 > 0) {
              FloorUnderlay var42 = GlobalStatics_6
                  .getFloorUnderlay(-1 + var14);
              GlobalStatics_4.anIntArray1695[lightPosY] -= var42.anInt1408;
              GlobalStatics_9.anIntArray1138[lightPosY] -= var42.anInt1406;
              GlobalStatics_9.anIntArray2606[lightPosY] -= var42.anInt1417;
              GlobalStatics_9.anIntArray1920[lightPosY] -= var42.anInt1418;
              --GlobalStatics_9.anIntArray2469[lightPosY];
            }
          }
        }

        if (lightPosX >= 0) {
          lightPosY = 0;
          lightMagnitude = 0;
          lightPosZ = 0;
          var14 = 0;
          var15 = 0;

          for (var16 = -5; var16 < 104; ++var16) {
            var44 = var16 + 5;
            if (var44 < 104) {
              lightPosZ += GlobalStatics_9.anIntArray1138[var44];
              var15 += GlobalStatics_9.anIntArray2469[var44];
              lightPosY += GlobalStatics_4.anIntArray1695[var44];
              var14 += GlobalStatics_9.anIntArray1920[var44];
              lightMagnitude += GlobalStatics_9.anIntArray2606[var44];
            }

            var18 = var16 - 5;
            if (var18 >= 0) {
              lightPosZ -= GlobalStatics_9.anIntArray1138[var18];
              var14 -= GlobalStatics_9.anIntArray1920[var18];
              lightPosY -= GlobalStatics_4.anIntArray1695[var18];
              var15 -= GlobalStatics_9.anIntArray2469[var18];
              lightMagnitude -= GlobalStatics_9.anIntArray2606[var18];
            }

            if (var16 >= 0 && var15 > 0) {
              var34[lightPosX][var16] =
                  GlobalStatics_6
                      .method129(lightMagnitude / var15, 2, lightPosZ / var15,
                          256 * lightPosY / var14);
            }
          }
        }
      }

      for (lightPosX = 1; lightPosX < 103; ++lightPosX) {
        label754:
        for (lightPosY = 1; lightPosY < 103; ++lightPosY) {
          if (var1 || GlobalStatics_9.method1986(66)
              || (2 & GlobalStatics_10.tileFlags[0][lightPosX][lightPosY])
              != 0
              || (16 & GlobalStatics_10.tileFlags[var8][lightPosX][lightPosY])
              == 0
              && DummyClass18.method823(lightPosY, lightPosX, var8)
              == GlobalStatics_8.plane) {
            if (DummyClass52.anInt1174 > var8) {
              DummyClass52.anInt1174 = var8;
            }

            lightPosZ = 255
                & GlobalStatics_10.floorUnderlayIds[var8][lightPosX][lightPosY];
            lightMagnitude =
                DummyClass17.tileFloors[var8][lightPosX][lightPosY] & 255;
            if (lightPosZ > 0 || lightMagnitude > 0) {
              var15 = GlobalStatics_4.heightMap[var8][lightPosX + 1][lightPosY];
              var14 = GlobalStatics_4.heightMap[var8][lightPosX][lightPosY];
              var44 = GlobalStatics_4.heightMap[var8][lightPosX][1 + lightPosY];
              var16 = GlobalStatics_4.heightMap[var8][1 + lightPosX][lightPosY
                  + 1];
              if (var8 > 0) {
                boolean var47 = true;
                if (lightPosZ == 0
                    &&
                    GlobalStatics_9.tileOrientation[var8][lightPosX][lightPosY]
                        != 0) {
                  var47 = false;
                }

                if (lightMagnitude > 0 && !GlobalStatics_9
                    .method350((byte) -73,
                        lightMagnitude - 1).aBoolean2102) {
                  var47 = false;
                }

                if (var47 && var14 == var15 && var14 == var16 && var44
                    == var14) {
                  DummyClass36.anIntArrayArrayArray2609[var8][lightPosX][lightPosY] =
                      DummyClass36.anIntArrayArrayArray2609[var8][lightPosX][lightPosY]
                          | 4;
                }
              }

              if (lightPosZ <= 0) {
                var18 = -1;
                var19 = 0;
              } else {
                var18 = var34[lightPosX][lightPosY];
                var20 = (var18 & 127) + var5;
                if (var20 >= 0) {
                  if (var20 > 127) {
                    var20 = 127;
                  }
                } else {
                  var20 = 0;
                }

                var21 = (896 & var18) + (var18 + var4 & 0xfc00) + var20;
                var19 = GLStatics.hslTable[GlobalStatics_6
                    .repackHSL(96, true, var21)];
              }

              var20 = var35[lightPosX][lightPosY];
              var23 = var35[lightPosX][lightPosY + 1];
              var21 = var35[1 + lightPosX][lightPosY];
              var22 = var35[lightPosX + 1][lightPosY + 1];
              if (lightMagnitude == 0) {
                MaterialShader5
                    .method1629(var8, lightPosX, lightPosY, 0, 0, -1, var14,
                        var15,
                        var16, var44,
                        GlobalStatics_6.repackHSL(var20, true, var18),
                        GlobalStatics_6.repackHSL(var21, true, var18),
                        GlobalStatics_6.repackHSL(var22, true, var18),
                        GlobalStatics_6.repackHSL(var23, true, var18), 0, 0, 0,
                        0,
                        var19, 0);
                if (GlRenderer.USE_OPENGL && var8 > 0 && var18 != -1
                    && GlobalStatics_6
                    .getFloorUnderlay(-1 + lightPosZ).aBoolean1411) {
                  GlobalStatics_2
                      .method2037(0, 0, true, false, lightPosX, lightPosY,
                          var14
                              - GlobalStatics_4.heightMap[0][lightPosX][lightPosY],
                          -GlobalStatics_4.heightMap[0][1
                              + lightPosX][lightPosY] + var15,
                          var16 - GlobalStatics_4.heightMap[0][1
                              + lightPosX][1 + lightPosY],
                          var44 - GlobalStatics_4.heightMap[0][lightPosX][1
                              + lightPosY]);
                }

                if (GlRenderer.USE_OPENGL && !var1
                    && GlobalStatics_10.anIntArrayArray3115 != null
                    && var8 == 0) {
                  for (var24 = lightPosX - 1; var24 <= lightPosX + 1;
                      ++var24) {
                    for (int var52 = -1 + lightPosY;
                        1 + lightPosY >= var52; ++var52) {
                      if ((var24 != lightPosX || lightPosY != var52)
                          && var24 >= 0 && var24 < 104
                          && var52 >= 0 && var52 < 104) {
                        int var54 =
                            DummyClass17.tileFloors[0][var24][var52] & 255;
                        if (var54 != 0) {
                          FloorOverlay var53 = GlobalStatics_9
                              .method350((byte) -25, -1 + var54);
                          if (var53.anInt2095 != -1
                              && GLStatics.textureCache.method18(
                              var53.anInt2095, 255) == 4) {
                            GlobalStatics_10.anIntArrayArray3115[lightPosX][lightPosY] =
                                var53.anInt2094 + (var53.anInt2101 << 24);
                            continue label754;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                var24 = 1
                    + GlobalStatics_9.tileOrientation[var8][lightPosX][lightPosY];
                byte var25 = DummyClass18.aByteArrayArrayArray81[var8][lightPosX][lightPosY];
                FloorOverlay var26 = GlobalStatics_9
                    .method350((byte) -105, lightMagnitude - 1);
                int var27;
                int var29;
                int var28;
                if (GlRenderer.USE_OPENGL && !var1
                    && GlobalStatics_10.anIntArrayArray3115 != null
                    && var8 == 0) {
                  if (var26.anInt2095 != -1
                      &&
                      GLStatics.textureCache.method18(var26.anInt2095, 255)
                          == 4) {
                    GlobalStatics_10.anIntArrayArray3115[lightPosX][lightPosY] =
                        (var26.anInt2101 << 24) + var26.anInt2094;
                  } else {
                    label722:
                    for (var27 = lightPosX - 1; var27 <= 1 + lightPosX;
                        ++var27) {
                      for (var28 = lightPosY - 1; var28 <= 1 + lightPosY;
                          ++var28) {
                        if ((lightPosX != var27 || var28 != lightPosY)
                            && var27 >= 0
                            && var27 < 104 && var28 >= 0 && var28 < 104) {
                          var29 =
                              DummyClass17.tileFloors[0][var27][var28] & 255;
                          if (var29 != 0) {
                            FloorOverlay var30 =
                                GlobalStatics_9
                                    .method350((byte) -14, -1 + var29);
                            if (var30.anInt2095 != -1
                                && GLStatics.textureCache
                                .method18(var30.anInt2095,
                                    255) == 4) {
                              GlobalStatics_10.anIntArrayArray3115[lightPosX][lightPosY] =
                                  var30.anInt2094 + (var30.anInt2101 << 24);
                              break label722;
                            }
                          }
                        }
                      }
                    }
                  }
                }

                var27 = var26.anInt2095;
                if (var27 >= 0 && !GLStatics.textureCache
                    .method17(var27, 101)) {
                  var27 = -1;
                }

                int var31;
                int var55;
                if (var27 < 0) {
                  if (var26.anInt2103 == -1) {
                    var28 = -2;
                    var29 = 0;
                  } else {
                    var28 = var26.anInt2103;
                    var55 = var5 + (var28 & 127);
                    if (var55 >= 0) {
                      if (var55 > 127) {
                        var55 = 127;
                      }
                    } else {
                      var55 = 0;
                    }

                    var31 =
                        (var28 & 896) + (0xfc00 & var28 + var4) + var55;
                    var29 = GLStatics.hslTable[com.jagex.runescape.statics.GlobalStatics_0
                        .method729((byte) -85, var31, 96)];
                  }
                } else {
                  var28 = -1;
                  var29 = GLStatics.hslTable[com.jagex.runescape.statics.GlobalStatics_0
                      .method729((byte) -126,
                          GLStatics.textureCache.method15(var27, 0xffff),
                          96)];
                }

                if (var26.anInt2098 >= 0) {
                  var55 = var26.anInt2098;
                  var31 = var5 + (var55 & 127);
                  if (var31 >= 0) {
                    if (var31 > 127) {
                      var31 = 127;
                    }
                  } else {
                    var31 = 0;
                  }

                  int var32 =
                      (896 & var55) + (0xfc00 & var55 + var4) + var31;
                  var29 = GLStatics.hslTable[com.jagex.runescape.statics.GlobalStatics_0
                      .method729((byte) -101, var32, 96)];
                }

                MaterialShader5
                    .method1629(var8, lightPosX, lightPosY, var24, var25,
                        var27, var14,
                        var15, var16, var44,
                        GlobalStatics_6.repackHSL(var20, true, var18),
                        GlobalStatics_6.repackHSL(var21, true, var18),
                        GlobalStatics_6.repackHSL(var22, true, var18),
                        GlobalStatics_6.repackHSL(var23, true, var18),
                        com.jagex.runescape.statics.GlobalStatics_0
                            .method729((byte) -72, var28, var20),
                        com.jagex.runescape.statics.GlobalStatics_0
                            .method729((byte) -107, var28, var21),
                        com.jagex.runescape.statics.GlobalStatics_0
                            .method729((byte) -82, var28, var22),
                        com.jagex.runescape.statics.GlobalStatics_0
                            .method729((byte) -93, var28, var23), var19,
                        var29);
                if (GlRenderer.USE_OPENGL && var8 > 0) {
                  GlobalStatics_2.method2037(var24, var25,
                      var28 == -1 || !var26.aBoolean2093,
                      var18 == -1 || !GlobalStatics_6
                          .getFloorUnderlay(-1 + lightPosZ).aBoolean1411,
                      lightPosX, lightPosY,
                      -GlobalStatics_4.heightMap[0][lightPosX][lightPosY]
                          + var14,
                      var15 - GlobalStatics_4.heightMap[0][1
                          + lightPosX][lightPosY],
                      -GlobalStatics_4.heightMap[0][1 + lightPosX][lightPosY
                          + 1] + var16,
                      -GlobalStatics_4.heightMap[0][lightPosX][1
                          + lightPosY] + var44);
                }
              }
            }
          }
        }
      }

      if (GlRenderer.USE_OPENGL) {
        float[][] var38 = new float[105][105];
        int[][] var45 = GlobalStatics_4.heightMap[var8];
        float[][] var40 = new float[105][105];
        float[][] var43 = new float[105][105];

        for (var14 = 1; var14 <= 103; ++var14) {
          for (var15 = 1; var15 <= 103; ++var15) {
            var44 = var45[var15][var14 + 1] - var45[var15][-1 + var14];
            var16 = -var45[var15 - 1][var14] + var45[var15 + 1][var14];
            float var51 = (float) Math.sqrt(
                var16 * var16 + 65536 + var44 * var44);
            var38[var15][var14] = var16 / var51;
            var40[var15][var14] = -256.0f / var51;
            var43[var15][var14] = var44 / var51;
          }
        }

        SomethingGl0[] var50;
        if (var1) {
          var50 = GlobalStatics_9.method298(GlobalStatics_10.tileFlags,
              GlobalStatics_9.tileOrientation[var8],
              GlobalStatics_10.floorUnderlayIds[var8], var35,
              var40, GlobalStatics_10.anIntArrayArray3115,
              DummyClass17.tileFloors[var8],
              DummyClass18.aByteArrayArrayArray81[var8], var38, var8, var43,
              var34,
              GlobalStatics_4.heightMap[var8],
              DummyClass43.somethingHeightMap[0], 4096);
          com.jagex.runescape.statics.GlobalStatics_0.method1213(var8, var50);
        } else {
          var50 = GlobalStatics_9.method298(GlobalStatics_10.tileFlags,
              GlobalStatics_9.tileOrientation[var8],
              GlobalStatics_10.floorUnderlayIds[var8], var35,
              var40, null, DummyClass17.tileFloors[var8],
              DummyClass18.aByteArrayArrayArray81[var8],
              var38, var8, var43, var34, GlobalStatics_4.heightMap[var8],
              null, 4096);
          SomethingGl0[] var46 =
              DummyClass3
                  .method70(var40, var38, GlobalStatics_4.heightMap[var8],
                      var8, var43,
                      DummyClass18.aByteArrayArrayArray81[var8], var35, 0,
                      GlobalStatics_9.tileOrientation[var8],
                      GlobalStatics_10.floorUnderlayIds[var8],
                      DummyClass17.tileFloors[var8],
                      GlobalStatics_10.tileFlags);
          SomethingGl0[] var49 = new SomethingGl0[var50.length
              + var46.length];

          for (var44 = 0; var50.length > var44; ++var44) {
            var49[var44] = var50[var44];
          }

          for (var44 = 0; var46.length > var44; ++var44) {
            var49[var50.length + var44] = var46[var44];
          }

          com.jagex.runescape.statics.GlobalStatics_0.method1213(var8, var49);
          GlobalStatics_4
              .method1769(var43, GlobalStatics_10.floorUnderlayIds[var8],
                  DummyClass18.aByteArrayArrayArray81[var8],
                  DummyClass46.LIGHTS, var8,
                  DummyClass46.anInt1032, var40,
                  GlobalStatics_9.tileOrientation[var8],
                  DummyClass17.tileFloors[var8],
                  GlobalStatics_4.heightMap[var8], -8771, var38);
        }
      }

      GlobalStatics_10.floorUnderlayIds[var8] = null;
      DummyClass17.tileFloors[var8] = null;
      GlobalStatics_9.tileOrientation[var8] = null;
      DummyClass18.aByteArrayArrayArray81[var8] = null;
      GlobalStatics_9.SCENE_SHADOW[var8] = null;
    }

    if (var2 <= 26) {
      GlobalStatics_7.method2187(86);
    }

    GlobalStatics_10.method1764(-50, -10, -50);
    if (!var1) {
      int var36;
      for (var8 = 0; var8 < 104; ++var8) {
        for (var36 = 0; var36 < 104; ++var36) {
          if ((GlobalStatics_10.tileFlags[1][var8][var36] & 2) == 2) {
            GlTexture2d.method709(var8, var36);
          }
        }
      }

      for (var8 = 0; var8 < 4; ++var8) {
        for (var36 = 0; var36 <= 104; ++var36) {
          for (lightPosX = 0; lightPosX <= 104; ++lightPosX) {
            short var48;
            if ((
                DummyClass36.anIntArrayArrayArray2609[var8][lightPosX][var36]
                    & 1) != 0) {
              var14 = var8;

              for (
                  lightPosY = var36; lightPosY > 0 && (1
                  & DummyClass36.anIntArrayArrayArray2609[var8][lightPosX][-1
                  + lightPosY]) != 0; --lightPosY) {
              }

              lightMagnitude = var8;

              for (
                  lightPosZ = var36; lightPosZ < 104
                  &&
                  (1 & DummyClass36.anIntArrayArrayArray2609[var8][lightPosX][
                      lightPosZ + 1])
                      != 0; ++lightPosZ) {
              }

              label453:
              while (lightMagnitude > 0) {
                for (var15 = lightPosY; var15 <= lightPosZ; ++var15) {
                  if ((
                      DummyClass36.anIntArrayArrayArray2609[lightMagnitude
                          - 1][lightPosX][var15]
                          & 1) == 0) {
                    break label453;
                  }
                }

                --lightMagnitude;
              }

              label464:
              while (var14 < 3) {
                for (var15 = lightPosY; lightPosZ >= var15; ++var15) {
                  if ((1 & DummyClass36.anIntArrayArrayArray2609[var14
                      + 1][lightPosX][var15]) == 0) {
                    break label464;
                  }
                }

                ++var14;
              }

              var15 = (var14 - (-1 + lightMagnitude)) * (-lightPosY + lightPosZ
                  + 1);
              if (var15 >= 8) {
                var48 = 240;
                var44 = -var48
                    + GlobalStatics_4.heightMap[var14][lightPosX][lightPosY];
                var18 = GlobalStatics_4.heightMap[lightMagnitude][lightPosX][lightPosY];
                DummyClass10
                    .method2263(1, 128 * lightPosX, 128 * lightPosX,
                        128 * lightPosY,
                        lightPosZ * 128 + 128, var44, var18);

                for (var19 = lightMagnitude; var14 >= var19; ++var19) {
                  for (var20 = lightPosY; lightPosZ >= var20; ++var20) {
                    DummyClass36.anIntArrayArrayArray2609[var19][lightPosX][var20] =
                        DummyClass36.anIntArrayArrayArray2609[var19][lightPosX][var20]
                            & -2;
                  }
                }
              }
            }

            if ((2
                & DummyClass36.anIntArrayArrayArray2609[var8][lightPosX][var36])
                != 0) {
              for (
                  lightPosY = lightPosX; lightPosY > 0
                  && (DummyClass36.anIntArrayArrayArray2609[var8][-1
                  + lightPosY][var36] & 2) != 0; --lightPosY) {
              }

              var14 = var8;
              lightMagnitude = var8;

              for (
                  lightPosZ = lightPosX; lightPosZ < 104
                  && (2 & DummyClass36.anIntArrayArrayArray2609[var8][lightPosZ
                  + 1][var36])
                  != 0; ++lightPosZ) {
              }

              label503:
              while (lightMagnitude > 0) {
                for (var15 = lightPosY; var15 <= lightPosZ; ++var15) {
                  if ((2 & DummyClass36.anIntArrayArrayArray2609[-1
                      + lightMagnitude][var15][var36]) == 0) {
                    break label503;
                  }
                }

                --lightMagnitude;
              }

              label514:
              while (var14 < 3) {
                for (var15 = lightPosY; var15 <= lightPosZ; ++var15) {
                  if ((2 & DummyClass36.anIntArrayArrayArray2609[var14
                      + 1][var15][var36]) == 0) {
                    break label514;
                  }
                }

                ++var14;
              }

              var15 =
                  (-lightPosY + lightPosZ + 1) * (-lightMagnitude + var14 + 1);
              if (var15 >= 8) {
                var48 = 240;
                var44 =
                    GlobalStatics_4.heightMap[var14][lightPosY][var36] - var48;
                var18 = GlobalStatics_4.heightMap[lightMagnitude][lightPosY][var36];
                DummyClass10
                    .method2263(2, lightPosY * 128, 128 * lightPosZ + 128,
                        128 * var36,
                        var36 * 128, var44, var18);

                for (var19 = lightMagnitude; var14 >= var19; ++var19) {
                  for (var20 = lightPosY; var20 <= lightPosZ; ++var20) {
                    DummyClass36.anIntArrayArrayArray2609[var19][var20][var36] =
                        DummyClass36.anIntArrayArrayArray2609[var19][var20][var36]
                            & -3;
                  }
                }
              }
            }

            if ((4
                & DummyClass36.anIntArrayArrayArray2609[var8][lightPosX][var36])
                != 0) {
              lightPosY = lightPosX;
              lightPosZ = lightPosX;

              for (
                  lightMagnitude = var36; lightMagnitude > 0 && (4
                  & DummyClass36.anIntArrayArrayArray2609[var8][lightPosX][-1
                  + lightMagnitude]) != 0; --lightMagnitude) {
              }

              for (
                  var14 = var36; var14 < 104
                  && (DummyClass36.anIntArrayArrayArray2609[var8][lightPosX][var14
                      + 1] & 4) != 0; ++var14) {
              }

              label554:
              while (lightPosY > 0) {
                for (var15 = lightMagnitude; var15 <= var14; ++var15) {
                  if ((DummyClass36.anIntArrayArrayArray2609[var8][lightPosY
                      - 1][var15]
                      & 4) == 0) {
                    break label554;
                  }
                }

                --lightPosY;
              }

              label565:
              while (lightPosZ < 104) {
                for (var15 = lightMagnitude; var14 >= var15; ++var15) {
                  if ((4 & DummyClass36.anIntArrayArrayArray2609[var8][1
                      + lightPosZ][var15]) == 0) {
                    break label565;
                  }
                }

                ++lightPosZ;
              }

              if ((1 - lightPosY + lightPosZ) * (var14 - (lightMagnitude
                  - 1)) >= 4) {
                var15 = GlobalStatics_4.heightMap[var8][lightPosY][lightMagnitude];
                DummyClass10
                    .method2263(4, lightPosY * 128, 128 * lightPosZ + 128,
                        lightMagnitude * 128, 128 + 128 * var14, var15, var15);

                for (var16 = lightPosY; lightPosZ >= var16; ++var16) {
                  for (var44 = lightMagnitude; var14 >= var44; ++var44) {
                    DummyClass36.anIntArrayArrayArray2609[var8][var16][var44] =
                        DummyClass36.anIntArrayArrayArray2609[var8][var16][var44]
                            & -5;
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  public static boolean method2191(int var0, int var1, int var2, int var3,
      int var4, int var5,
      int var6, int var7, boolean var8, int var9, int var10,
      int var11) {
    int var12;
    int var13;
    for (var12 = 0; var12 < 104; ++var12) {
      for (var13 = 0; var13 < 104; ++var13) {
        DummyClass51.anIntArrayArray1160[var12][var13] = 0;
        GlobalStatics_10.anIntArrayArray1373[var12][var13] = 99999999;
      }
    }

    var12 = var2;
    DummyClass51.anIntArrayArray1160[var2][var10] = 99;
    var13 = var10;
    GlobalStatics_10.anIntArrayArray1373[var2][var10] = 0;
    byte var14 = 0;
    boolean var16 = false;
    if (var3 == -1001) {
      int var15 = 0;
      GlobalStatics_10.anIntArray3456[var14] = var2;
      int var27 = var14 + 1;
      DummyClass38.anIntArray729[var14] = var10;
      int[][] var17 =
          com.jagex.runescape.statics.GlobalStatics_0.collisionMaps[GlobalStatics_9.currentPlane].anIntArrayArray1304;

      int var18;
      while (var27 != var15) {
        var13 = DummyClass38.anIntArray729[var15];
        var12 = GlobalStatics_10.anIntArray3456[var15];
        var15 = 4095 & var15 + 1;
        if (var12 == var0 && var13 == var4) {
          var16 = true;
          break;
        }

        if (var9 != 0) {
          if ((var9 < 5 || var9 == 10)
              && com.jagex.runescape.statics.GlobalStatics_0.collisionMaps[GlobalStatics_9.currentPlane]
              .method1488(var4, var12,
                  false, var13, var0, var9 - 1, 1, var7)) {
            var16 = true;
            break;
          }

          if (var9 < 10
              && com.jagex.runescape.statics.GlobalStatics_0.collisionMaps[GlobalStatics_9.currentPlane]
              .method1492(var4,
                  -1 + var9, var0, var13, 1, var7, var12, 95)) {
            var16 = true;
            break;
          }
        }

        if (var11 != 0 && var6 != 0
            && com.jagex.runescape.statics.GlobalStatics_0.collisionMaps[GlobalStatics_9.currentPlane]
            .method1498(true, var0,
                var13, var12, 1, var11, var1, var4, var6)) {
          var16 = true;
          break;
        }

        var18 = 1 + GlobalStatics_10.anIntArrayArray1373[var12][var13];
        if (var12 > 0
            && DummyClass51.anIntArrayArray1160[var12 - 1][var13] == 0
            && (19661064 & var17[var12 - 1][var13]) == 0) {
          GlobalStatics_10.anIntArray3456[var27] = -1 + var12;
          DummyClass38.anIntArray729[var27] = var13;
          var27 = var27 + 1 & 4095;
          DummyClass51.anIntArrayArray1160[-1 + var12][var13] = 2;
          GlobalStatics_10.anIntArrayArray1373[-1
              + var12][var13] = var18;
        }

        if (var12 < 103
            && DummyClass51.anIntArrayArray1160[var12 + 1][var13] == 0
            && (
            var17[var12 + 1][var13] & 19661184) == 0) {
          GlobalStatics_10.anIntArray3456[var27] = var12 + 1;
          DummyClass38.anIntArray729[var27] = var13;
          var27 = 1 + var27 & 4095;
          DummyClass51.anIntArrayArray1160[var12 + 1][var13] = 8;
          GlobalStatics_10.anIntArrayArray1373[1
              + var12][var13] = var18;
        }

        if (var13 > 0 && DummyClass51.anIntArrayArray1160[var12][
            var13 - 1] == 0 && (
            19661058 & var17[var12][-1 + var13]) == 0) {
          GlobalStatics_10.anIntArray3456[var27] = var12;
          DummyClass38.anIntArray729[var27] = -1 + var13;
          DummyClass51.anIntArrayArray1160[var12][var13 - 1] = 1;
          var27 = var27 + 1 & 4095;
          GlobalStatics_10.anIntArrayArray1373[var12][-1
              + var13] = var18;
        }

        if (var13 < 103
            && DummyClass51.anIntArrayArray1160[var12][1 + var13] == 0
            && (
            19661088 & var17[var12][var13 + 1]) == 0) {
          GlobalStatics_10.anIntArray3456[var27] = var12;
          DummyClass38.anIntArray729[var27] = var13 + 1;
          var27 = 1 + var27 & 4095;
          DummyClass51.anIntArrayArray1160[var12][1 + var13] = 4;
          GlobalStatics_10.anIntArrayArray1373[var12][var13
              + 1] = var18;
        }

        if (var12 > 0 && var13 > 0
            && DummyClass51.anIntArrayArray1160[-1 + var12][var13 - 1] == 0
            && (var17[var12 - 1][-1 + var13] & 19661070) == 0
            && (19661064 & var17[var12 - 1][var13]) == 0
            && (19661058 & var17[var12][-1 + var13]) == 0) {
          GlobalStatics_10.anIntArray3456[var27] = -1 + var12;
          DummyClass38.anIntArray729[var27] = var13 - 1;
          var27 = 1 + var27 & 4095;
          DummyClass51.anIntArrayArray1160[-1 + var12][-1 + var13] = 3;
          GlobalStatics_10.anIntArrayArray1373[var12 - 1][var13
              - 1] = var18;
        }

        if (var12 < 103 && var13 > 0
            && DummyClass51.anIntArrayArray1160[var12 + 1][
            var13 - 1] == 0
            && (19661187 & var17[var12 + 1][-1 + var13]) == 0
            && (19661184
            & var17[var12 + 1][var13]) == 0 && (19661058 & var17[var12][-1
            + var13]) == 0) {
          GlobalStatics_10.anIntArray3456[var27] = var12 + 1;
          DummyClass38.anIntArray729[var27] = -1 + var13;
          var27 = 4095 & var27 + 1;
          DummyClass51.anIntArrayArray1160[1 + var12][var13 - 1] = 9;
          GlobalStatics_10.anIntArrayArray1373[var12 + 1][-1
              + var13] = var18;
        }

        if (var12 > 0 && var13 < 103
            && DummyClass51.anIntArrayArray1160[var12 - 1][var13
            + 1] == 0 && (19661112 & var17[var12 - 1][1 + var13]) == 0 && (
            var17[var12 - 1][var13]
                & 19661064) == 0
            && (19661088 & var17[var12][1 + var13]) == 0) {
          GlobalStatics_10.anIntArray3456[var27] = var12 - 1;
          DummyClass38.anIntArray729[var27] = 1 + var13;
          DummyClass51.anIntArrayArray1160[-1 + var12][var13 + 1] = 6;
          var27 = 4095 & 1 + var27;
          GlobalStatics_10.anIntArrayArray1373[-1 + var12][1
              + var13] = var18;
        }

        if (var12 < 103 && var13 < 103
            && DummyClass51.anIntArrayArray1160[var12 + 1][1
            + var13] == 0 && (19661280 & var17[1 + var12][var13 + 1]) == 0
            && (var17[1 + var12][var13] & 19661184) == 0 && (19661088
            & var17[var12][var13
            + 1]) == 0) {
          GlobalStatics_10.anIntArray3456[var27] = var12 + 1;
          DummyClass38.anIntArray729[var27] = var13 + 1;
          DummyClass51.anIntArrayArray1160[var12 + 1][1 + var13] = 12;
          var27 = var27 + 1 & 4095;
          GlobalStatics_10.anIntArrayArray1373[1 + var12][var13
              + 1] = var18;
        }
      }

      GlobalStatics_4.anInt1692 = 0;
      int var19;
      if (!var16) {
        if (!var8) {
          return false;
        }

        var18 = 1000;
        var19 = 100;
        byte var20 = 10;

        for (int var21 = var0 - var20; var20 + var0 >= var21; ++var21) {
          for (int var22 = var4 - var20; var22 <= var4 + var20;
              ++var22) {
            if (var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104
                && GlobalStatics_10.anIntArrayArray1373[var21][var22]
                < 100) {
              int var24 = 0;
              if (var22 < var4) {
                var24 = var4 - var22;
              } else if (var6 + var4 - 1 < var22) {
                var24 = 1 + -var4 - var6 + var22;
              }

              int var23 = 0;
              if (var21 >= var0) {
                if (var21 > -1 + var11 + var0) {
                  var23 = 1 - var11 - (var0 - var21);
                }
              } else {
                var23 = var0 - var21;
              }

              int var25 = var24 * var24 + var23 * var23;
              if (var25 < var18 || var25 == var18
                  && GlobalStatics_10.anIntArrayArray1373[var21][var22]
                  < var19) {
                var13 = var22;
                var18 = var25;
                var12 = var21;
                var19 = GlobalStatics_10.anIntArrayArray1373[var21][var22];
              }
            }
          }
        }

        if (var18 == 1000) {
          return false;
        }

        if (var2 == var12 && var13 == var10) {
          return false;
        }

        GlobalStatics_4.anInt1692 = 1;
      }

      byte var28 = 0;
      GlobalStatics_10.anIntArray3456[var28] = var12;
      var15 = var28 + 1;
      DummyClass38.anIntArray729[var28] = var13;

      for (
          var18 = var19 = DummyClass51.anIntArrayArray1160[var12][var13];
          var2 != var12 || var13 != var10;
          var18 = DummyClass51.anIntArrayArray1160[var12][var13]) {
        if (var19 != var18) {
          var19 = var18;
          GlobalStatics_10.anIntArray3456[var15] = var12;
          DummyClass38.anIntArray729[var15++] = var13;
        }

        if ((var18 & 2) == 0) {
          if ((8 & var18) != 0) {
            --var12;
          }
        } else {
          ++var12;
        }

        if ((1 & var18) == 0) {
          if ((4 & var18) != 0) {
            --var13;
          }
        } else {
          ++var13;
        }
      }

      if (var15 > 0) {
        GlobalStatics_9.method299(100, var15, var5);
        return true;
      } else {
        return var5 != 1;
      }
    } else {
      return false;
    }
  }

  public static void method2192(int var0) {
    if (var0 > -26) {
      GlobalStatics_7
          .method2191(-54, -79, 96, 36, -65, 4, -120, 29, false, -60, -74, 43);
    }

    DummyClass14.aClass93_1955.method1523();
  }

  public static void method1642(int var0, GameString var1) {
    if (GlobalStatics_6.aClass3_Sub19Array3694 != null) {
      if (var0 != 3803) {
        GlobalStatics_7.aClass67_1443 = null;
      }

      long var3 = var1.toBase37();
      int var2 = 0;
      if (var3 != 0L) {
        while (GlobalStatics_6.aClass3_Sub19Array3694.length > var2
            && GlobalStatics_6.aClass3_Sub19Array3694[var2].key != var3) {
          ++var2;
        }

        if (var2 < GlobalStatics_6.aClass3_Sub19Array3694.length
            && GlobalStatics_6.aClass3_Sub19Array3694[var2] != null) {
          ++DummyClass37.anInt671;
          GlobalStatics_9.secureBuffer.writePacket(162);
          GlobalStatics_9.secureBuffer
              .writeLong(GlobalStatics_6.aClass3_Sub19Array3694[var2].key);
        }
      }
    }
  }

  public static int method1643(int var0, boolean var1, int var2, int var3) {
    if (var0 != 10131) {
      GlobalStatics_7.clear25((byte) 95);
    }

    Inventory var4 = (Inventory) GlobalStatics_2.aClass130_2220.get(var2);
    if (var4 != null) {
      int var5 = 0;

      for (int var6 = 0; var4.ids.length > var6; ++var6) {
        if (var4.ids[var6] >= 0
            && GlobalStatics_10.anInt3287 > var4.ids[var6]) {
          ItemConfig var7 = DummyClass35
              .getItemConfig(var4.ids[var6], (byte) 79);
          if (var7.aClass130_798 != null) {
            IntegerNode var8 = (IntegerNode) var7.aClass130_798.get(var3);
            if (var8 != null) {
              if (var1) {
                var5 += var4.counts[var6] * var8.anInt2467;
              } else {
                var5 += var8.anInt2467;
              }
            }
          }
        }
      }

      return var5;
    } else {
      return 0;
    }
  }

  public static void clear25(byte var0) {
    GlobalStatics_7.aClass67_1443 = null;

    GlobalStatics_7.CONNECTED_TO_UPDATE_SERVER = null;
    GlobalStatics_7.aClass94_1440 = null;
  }

  public static void printError(int var0, String var1) {
    System.out.println("Error: " + GlobalStatics_10
        .createIndexedColorSprite("%0a", "\n", 105, var1));
    if (var0 < 33) {
      GlobalStatics_7.aClass94_2163 = null;
    }

  }

  public static Widget getWidget(byte var0, int var1) {
    int var2 = var1 >> 16;
    if (var0 < 108) {
      GlobalStatics_7.getWidget((byte) 87, 19);
    }

    int var3 = 0xffff & var1;
    if (GlobalStatics_9.aClass11ArrayArray1834[var2] == null
        || GlobalStatics_9.aClass11ArrayArray1834[var2][var3] == null) {
      boolean var4 = GlobalStatics_11.method57(var2, 104);
      if (!var4) {
        return null;
      }
    }

    return GlobalStatics_9.aClass11ArrayArray1834[var2][var3];
  }

  public static void method833(byte var0) {
    GlobalStatics_7.aShortArray2167 = null;
    GlobalStatics_7.animationFrames = null;
    GlobalStatics_7.aClass94_2164 = null;
    GlobalStatics_7.aClass94_2168 = null;
    int var1 = 124 / ((var0 - 28) / 41);
    GlobalStatics_7.aClass94_2163 = null;
  }

  public static void method834(byte var0) {
    GlobalStatics_9.method1250(43, false);
    System.gc();
    DummyClass26.setState(25, 5);
    if (var0 >= -80) {
      GlobalStatics_7.lastPacketId1 = -89;
    }
  }

  public static boolean method835(int var0, int var1, int var2, int var3,
      int var4, int var5,
      SceneNode var6, int var7, long var8) {
    if (var6 == null) {
      return true;
    } else {
      int var10 = var1 * 128 + 64 * var4;
      int var11 = var2 * 128 + 64 * var5;
      return DummyClass42
          .addNodeToSceneGraph(var0, var1, var2, var4, var5, var10, var11, var3,
              var6, var7, false, var8);
    }
  }

  public static void method1731(int var0) {
    GlobalStatics_7.anIntArray1638 = null;
    GlobalStatics_7.aClass94_1637 = null;
    GlobalStatics_7.aClass94_1636 = null;
    GlobalStatics_7.aLongArray1631 = null;
    if (var0 != 12881) {
      GlobalStatics_7.method1732(null, (byte) -74, -125);
    }
  }

  public static GameString method1732(Widget var0, byte var1, int var2) {
    if (var1 >= -8) {
      GlobalStatics_7.anIntArray1638 = null;
    }

    return
        !GlobalStatics_8.method44(var0).method92(var2, (byte) -110)
            && var0.anObjectArray314 == null ?
            null :
            var0.aClass94Array171 != null
                && var0.aClass94Array171.length > var2
                && var0.aClass94Array171[var2] != null
                && var0.aClass94Array171[var2].method1564(1).getLength() != 0
                ?
                var0.aClass94Array171[var2] :
                GlobalStatics_9.aBoolean1040 ? GlobalStatics_9.concat(
                    new GameString[]{GlobalStatics_6.aClass94_1645,
                        GlobalStatics_9.toString(var2)}) : null;
  }

  public static boolean hasKeyInput() {
    synchronized (GlobalStatics_10.KEYBOARD) {
      if (DummyClass21.anInt1762 == GlobalStatics_9.KEY_QUEUE_INDEX) {
        return false;
      } else {
        GlobalStatics_9.CURRENT_KEY = GlobalStatics_4.KEY_QUEUE[GlobalStatics_9.KEY_QUEUE_INDEX];
        GlobalStatics_9.OTHER_CURRENT_KEY = GlobalStatics_5.OTHER_KEY_QUEUE[GlobalStatics_9.KEY_QUEUE_INDEX];
        GlobalStatics_9.KEY_QUEUE_INDEX = 1 + GlobalStatics_9.KEY_QUEUE_INDEX & 127;
        return true;
      }
    }
  }

  public static void clear62(byte var0) {
    GlobalStatics_7.aClass25Array4060 = null;
    GlobalStatics_7.aClass94_4057 = null;
    if (var0 > 33) {
      GlobalStatics_7.aClass94_4058 = null;
      GlobalStatics_7.aClass94_4055 = null;
    }
  }

  public static void method593(Frame var0, boolean var1, SignLink var2) {
    if (!var1) {
      GlobalStatics_7.method594(110, 94);
    }

    while (true) {
      SignLinkRequest var3 = var2.method1436(var0, 86);

      while (var3.status == 0) {
        GlobalStatics_10.sleep(10L);
      }

      if (var3.status == 1) {
        var0.setVisible(false);
        var0.dispose();
        return;
      }

      GlobalStatics_10.sleep(100L);
    }
  }

  public static void method594(int var0, int var1) {
    if (var0 < 83) {
      GlobalStatics_7.clear62((byte) 122);
    }

    GlobalStatics_10.aClass93_1683.method1522(-127, var1);
  }

  public static void method595(int var0, int var1) {
    if (var1 > 108) {
      GlobalStatics_7.aClass93_684.method1522(-128, var0);
      DummyClass5.aClass93_2984.method1522(-125, var0);
    }
  }

  public static AbstractFont createFont(int var0, int var1, byte var2,
      FileUnpacker var3,
      FileUnpacker var4) {
    if (var2 < 123) {
      GlobalStatics_7.aBoolean1080 = false;
    }

    return GlobalStatics_9.loadSprites(var3, var0, var1, -30901)
        ? GlobalStatics_9.createFont(-22376, var4.getBytes(var1, var0)) : null;
  }

  public static void rebuildScene(int plane, int var1, int var2, int y,
      boolean var4, int x,
      boolean var6) {
    if (GlobalStatics_2.anInt3606 != var2 || var1
        != GlobalStatics_10.anInt2294
        || GlobalStatics_8.plane != plane && !GlobalStatics_9
        .method1986(45)) {
      GlobalStatics_2.anInt3606 = var2;
      GlobalStatics_10.anInt2294 = var1;
      GlobalStatics_8.plane = plane;
      if (GlobalStatics_9.method1986(105)) {
        GlobalStatics_8.plane = 0;
      }

      if (var4) {
        DummyClass26.setState(28, 5);
      } else {
        DummyClass26.setState(25, 5);
      }

      GlobalStatics_3
          .drawLoadingBox(GlobalStatics_10.LOADING_PLEASE_WAIT, true);
      int var8 = GlobalStatics_9.REGION_BASE_Y;
      int var7 = GlobalStatics_10.REGION_BASE_X;
      GlobalStatics_9.REGION_BASE_Y = var1 * 8 - 48;
      GlobalStatics_10.REGION_BASE_X = 8 * (-6 + var2);
      GlobalStatics_10.aClass3_Sub28_Sub3_3264 =
          GlobalStatics_9.method884(8 * GlobalStatics_2.anInt3606, (byte) 88,
              8 * GlobalStatics_10.anInt2294);
      int var10 = -var8 + GlobalStatics_9.REGION_BASE_Y;
      int var9 = GlobalStatics_10.REGION_BASE_X - var7;
      var7 = GlobalStatics_10.REGION_BASE_X;
      var8 = GlobalStatics_9.REGION_BASE_Y;
      GlobalStatics_10.aClass131_3421 = null;
      int var11;
      NPC var12;
      int var13;
      if (var4) {
        DummyClass6.anInt2046 = 0;

        for (var11 = 0; var11 < 32768; ++var11) {
          var12 = GlobalStatics_8.NPCS[var11];
          if (var12 != null) {
            var12.sceneX -= 128 * var9;
            var12.sceneY -= 128 * var10;
            if (var12.sceneX >= 0 && var12.sceneX <= 13184
                && var12.sceneY >= 0
                && var12.sceneY <= 13184) {
              for (var13 = 0; var13 < 10; ++var13) {
                var12.waypointsX[var13] -= var9;
                var12.waypointsY[var13] -= var10;
              }

              GlobalStatics_2.anIntArray347[DummyClass6.anInt2046++] = var11;
            } else {
              GlobalStatics_8.NPCS[var11].setConfiguration(-1, null);
              GlobalStatics_8.NPCS[var11] = null;
            }
          }
        }
      } else {
        for (var11 = 0; var11 < 0x8000; ++var11) {
          var12 = GlobalStatics_8.NPCS[var11];
          if (var12 != null) {
            for (var13 = 0; var13 < 10; ++var13) {
              var12.waypointsX[var13] -= var9;
              var12.waypointsY[var13] -= var10;
            }

            var12.sceneX -= 128 * var9;
            var12.sceneY -= var10 * 128;
          }
        }
      }

      for (var11 = 0; var11 < 2048; ++var11) {
        Player var23 = GlobalStatics_9.players[var11];
        if (var23 != null) {
          for (var13 = 0; var13 < 10; ++var13) {
            var23.waypointsX[var13] -= var9;
            var23.waypointsY[var13] -= var10;
          }

          var23.sceneX -= 128 * var9;
          var23.sceneY -= 128 * var10;
        }
      }

      GlobalStatics_9.currentPlane = plane;
      GlobalStatics_9.localPlayer.setPosition((byte) 126, x, false, y);
      byte var25 = 104;
      byte var24 = 0;
      byte var14 = 0;
      byte var16 = 1;
      byte var15 = 104;
      byte var26 = 1;
      if (var10 < 0) {
        var16 = -1;
        var15 = -1;
        var14 = 103;
      }

      if (var9 < 0) {
        var26 = -1;
        var24 = 103;
        var25 = -1;
      }

      for (int var17 = var24; var17 != var25; var17 += var26) {
        for (int var18 = var14; var15 != var18; var18 += var16) {
          int var19 = var9 + var17;
          int var20 = var18 + var10;

          for (int var21 = 0; var21 < 4; ++var21) {
            if (var19 >= 0
                && var20 >= 0 && var19 < 104 && var20 < 104) {
              GlobalStatics_9.groundItems[var21][var17][var18] =
                  GlobalStatics_9.groundItems[var21][var19][var20];
            } else {
              GlobalStatics_9.groundItems[var21][var17][var18] = null;
            }
          }
        }
      }

      for (SpawnedGameObject var27 =
          (SpawnedGameObject) GlobalStatics_10.aClass61_3075.getFirst();
          var27 != null;
          var27 = (SpawnedGameObject) GlobalStatics_10.aClass61_3075
              .getNext()) {
        var27.anInt2248 -= var10;
        var27.anInt2264 -= var9;
        if (var27.anInt2264 < 0 || var27.anInt2248 < 0
            || var27.anInt2264 >= 104
            || var27.anInt2248 >= 104) {
          var27.unlinkNode();
        }
      }

      if (var4) {
        GlobalStatics_9.SCENE_CAMERA_X -= 128 * var9;
        DummyClass49.SCENE_CAMERA_Z -= var10 * 128;
        GlobalStatics_5.anInt1904 -= var10;
        GlobalStatics_9.anInt1923 -= var9;
        GlobalStatics_9.anInt1996 -= var10;
        GlobalStatics_8.anInt30 -= var9;
      } else {
        GlobalStatics_9.anInt1753 = 1;
      }

      GlobalStatics_9.anInt1552 = 0;
      if (DummyClass45.anInt987 != 0) {
        DummyClass38.anInt733 -= var10;
        DummyClass45.anInt987 -= var9;
      }

      if (var6) {
        if (GlRenderer.USE_OPENGL && var4 && (Math.abs(var9) > 104 ||
            Math.abs(
                var10) > 104)) {
          GlobalStatics_10.method236((byte) 64);
        }

        DummyClass43.anInt909 = -1;
        GlobalStatics_1.stillGraphics.clear(-122);
        GlobalStatics_9.projectiles.clear(-87);
      }
    }
  }

  public static WidgetUpdate method1302(byte var0) {
    WidgetUpdate var1 = (WidgetUpdate) GlobalStatics_9.aClass13_1666.getFirst();
    if (var1 != null) {
      var1.unlinkNode();
      var1.unlinkSubNode();
      return var1;
    } else if (var0 != -36) {
      return null;
    } else {
      do {
        var1 = (WidgetUpdate) DummyClass50.aClass13_1139.getFirst();
        if (var1 == null) {
          return null;
        }

        if (var1.b(true) > GlobalStatics_10.getCurrentTimeMillis()) {
          return null;
        }

        var1.unlinkNode();
        var1.unlinkSubNode();
      } while ((Long.MIN_VALUE & var1.subnodeKey) == 0L);

      return var1;
    }
  }

  public static GameString method1303(Widget var0, GameString var1, int var2) {
    if (~var1.indexOf(GlobalStatics_9.aClass94_468) == var2) {
      return var1;
    } else {
      while (true) {
        int var3 = var1.indexOf(GlobalStatics_9.aClass94_331);
        if (var3 == -1) {
          while (true) {
            var3 = var1.indexOf(GlobalStatics_9.aClass94_2080);
            if (var3 == -1) {
              while (true) {
                var3 = var1.indexOf(GlobalStatics_7.aClass94_1301);
                if (var3 == -1) {
                  while (true) {
                    var3 = var1.indexOf(GlobalStatics_9.aClass94_852);
                    if (var3 == -1) {
                      while (true) {
                        var3 = var1.indexOf(GlobalStatics_10.aClass94_3418);
                        if (var3 == -1) {
                          while (true) {
                            var3 = var1
                                .indexOf(GlobalStatics_9.aClass94_1051);
                            if (var3 == -1) {
                              return var1;
                            }

                            GameString var4 = GlobalStatics_9.EMPTY_STRING;
                            if (GlobalStatics_9.aClass64_1778 != null) {
                              var4 =
                                  DummyClass58.method1653(
                                      GlobalStatics_9.aClass64_1778.anInt979,
                                      0);

                              if (GlobalStatics_9.aClass64_1778.result
                                  != null) {
                                byte[] var5 =
                                    ((String) GlobalStatics_9.aClass64_1778.result)
                                        .getBytes(
                                            StandardCharsets.ISO_8859_1);
                                var4 = GameStringStatics
                                    .createString(var5, 0, var5.length);
                              }
                            }

                            var1 = GlobalStatics_9.concat(new GameString[]{
                                var1.substring(var3, 0, 0), var4,
                                var1.substring(4 + var3)
                            });
                          }
                        }

                        var1 = GlobalStatics_9.concat(new GameString[]{
                            var1.substring(var3, 0, 0),
                            DummyClass14.method2148(
                                GlobalStatics_9.method2247((byte) -4, 4, var0),
                                (byte) -78), var1.substring(var3 + 2)
                        });
                      }
                    }

                    var1 = GlobalStatics_9.concat(new GameString[]{
                        var1.substring(var3, 0, 0),
                        DummyClass14.method2148(
                            GlobalStatics_9.method2247((byte) -109, 3, var0),
                            (byte) -78), var1.substring(2 + var3)
                    });
                  }
                }

                var1 = GlobalStatics_9.concat(new GameString[]{
                    var1.substring(var3, 0, 0),
                    DummyClass14.method2148(
                        GlobalStatics_9.method2247((byte) 111, 2, var0),
                        (byte) -78), var1.substring(2 + var3)
                });
              }
            }

            var1 = GlobalStatics_9.concat(new GameString[]{
                var1.substring(var3, 0, 0),
                DummyClass14.method2148(
                    GlobalStatics_9.method2247((byte) 23, 1, var0), (byte) -78),
                var1.substring(var3 + 2)
            });
          }
        }

        var1 = GlobalStatics_9.concat(new GameString[]{
            var1.substring(var3, var2, 0),
            DummyClass14.method2148(
                GlobalStatics_9.method2247((byte) 107, 0, var0), (byte) -78),
            var1.substring(2 + var3)
        });
      }
    }
  }

  public static void clear14(int var0) {
    GlobalStatics_7.aClass94_1089 = null;
    if (var0 == -16222) {
      GlobalStatics_7.aClass94_1085 = null;
      GlobalStatics_7.anIntArray1083 = null;
    }
  }

  public static void handleCommand(GameString command) {
    if (GlobalStatics_10.rights >= 2) {
      int var2;
      int var3;
      Runtime var6;
      if (command.method1531(GlobalStatics_10.COMMAND_GC)) {
        GlobalStatics_10.method246(8);

        for (var2 = 0; var2 < 10; ++var2) {
          System.gc();
        }

        var6 = Runtime.getRuntime();
        var3 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
        GlobalStatics_8
            .printMessage(null, 0, GlobalStatics_9.concat(new GameString[]{
                GlobalStatics_9.aClass94_3360, GlobalStatics_9.toString(var3),
                GlobalStatics_7.aClass94_2951
            }), -1);
      }

      int var4;
      if (command.method1531(GlobalStatics_9.aClass94_3651)) {
        GlobalStatics_10.method246(8);

        for (var2 = 0; var2 < 10; ++var2) {
          System.gc();
        }

        var6 = Runtime.getRuntime();
        var3 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
        GlobalStatics_8
            .printMessage(null, 0, GlobalStatics_9.concat(new GameString[]{
                DummyClass25.aClass94_1625, GlobalStatics_9.toString(var3),
                GlobalStatics_7.aClass94_2951
            }), -1);
        GlobalStatics_10.method90(1);
        GlobalStatics_10.method246(8);

        for (var4 = 0; var4 < 10; ++var4) {
          System.gc();
        }

        var3 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
        GlobalStatics_8
            .printMessage(null, 0, GlobalStatics_9.concat(new GameString[]{
                DummyClass12.aClass94_2033, GlobalStatics_9.toString(var3),
                GlobalStatics_7.aClass94_2951
            }), -1);
      }

      if (command.method1531(DummyClass17.aClass94_1830)) {
        GlobalStatics_8
            .printMessage(null, 0, GlobalStatics_9.concat(new GameString[]{
                DummyClass60.aClass94_442,
                GlobalStatics_9.toString(GlobalStatics_5.method1727((byte) 123))
            }), -1);
      }

      if (GlRenderer.USE_OPENGL && command.method1531(
          GlobalStatics_2.COMMAND_CARD_MEMORY)) {
      }

      if (command.method1531(GlobalStatics_5.COMMAND_DROP_CLIENT)) {
        GlobalStatics_8.method289(false);
      }

      if (command.method1531(GlobalStatics_9.COMMAND_DROP_JS5)) {
        DummyClass43.ondemandRequester.shutdown(false);
      }

      if (command.method1531(DummyClass31.SERVER_JS5_DROP)) {
        DummyClass43.ondemandRequester.drop(true);
      }

      if (command.method1531(DummyClass53.aClass94_1337)) {
        DummyClass35.signLink.method1431(0);
        GlobalStatics_9.gameSocket.method1467();
        DummyClass43.ondemandRequester.method1248(-29340);
      }

      if (command.method1531(GlobalStatics_3.COMMAND_REPLACE_CANVAS)) {
        GlobalStatics_6.REPLACE_CANVAS = true;
      }

      if (command.method1531(
          com.jagex.runescape.statics.GlobalStatics_0.COMMAND_REBUILD)) {
        DummyClass26.setState(25, 5);
      }

      if (command.method1531(DummyClass43.COMMAND_FPS_ON)) {
        DummyClass29.aBoolean438 = true;
      }

      if (command.method1531(GlobalStatics_6.COMMAND_FPS_OFF)) {
        DummyClass29.aBoolean438 = false;
      }

      if (command.method1531(GlobalStatics_9.COMMAND_WM0)) {
        GlobalStatics_9.setWindowMode(false, 0, -1, -1);
      }

      if (command.method1531(DummyClass58.COMMAND_WM1)) {
        GlobalStatics_9.setWindowMode(false, 1, -1, -1);
      }

      if (command.method1531(GlobalStatics_6.COMMAND_WM2)) {
        GlobalStatics_9.setWindowMode(false, 2, -1, -1);
      }

      if (command.method1531(GlobalStatics_1.COMMAND_WM3)) {
        GlobalStatics_9.setWindowMode(false, 3, 1024, 768);
      }

      if (command.method1531(GlobalStatics_10.COMMAND_NOCLIP)) {
        for (var2 = 0; var2 < 4; ++var2) {
          for (var3 = 1; var3 < 103; ++var3) {
            for (var4 = 1; var4 < 103; ++var4) {
              com.jagex.runescape.statics.GlobalStatics_0.collisionMaps[var2].anIntArrayArray1304[var3][var4] = 0;
            }
          }
        }
      }

      if (command.method1558(GlobalStatics_9.COMMAND_SET_PARTICLES, 0)) {
        DummyClass0.method1758(command.substring(15).toInteger());
        SettingsStatics.writeSettings(DummyClass35.signLink);
        GlobalStatics_9.aBoolean2705 = false;
      }

      if (command.method1558(GlobalStatics_10.aClass94_3289, 0)
          && GlobalStatics_4.usageLocation != 0) {
        DummyClass45.method1237(command.substring(6).toInteger(), 1000);
      }

      if (command.method1531(DummyClass6.COMMAND_ERROR_TEST)) {
        throw new RuntimeException();
      }

      if (command.method1558(GlobalStatics_8.COMMAND_RECTANGLE_DEBUG, 0)) {
        GlobalStatics_6.rectangleDebugType = command.substring(12).method1564(1)
            .toInteger();
        GlobalStatics_8
            .printMessage(null, 0, GlobalStatics_9.concat(new GameString[]{
                GlobalStatics_9.RECTANGLE_DEBUG_EQ,
                GlobalStatics_9.toString(GlobalStatics_6.rectangleDebugType)
            }), -1);
      }

      if (command.method1531(DummyClass58.COMMAND_QA_OP_TEST)) {
        GlobalStatics_9.aBoolean1040 = true;
      }

      if (command.method1531(GlobalStatics_9.COMMAND_TWEEN)) {
        if (GlobalStatics_9.tweening) {
          GlobalStatics_9.tweening = false;
          GlobalStatics_8
              .printMessage(null, 0, GlobalStatics_9.aClass94_2061, -1);
        } else {
          GlobalStatics_9.tweening = true;
          GlobalStatics_8
              .printMessage(null, 0, GlobalStatics_9.FORCED_TWEENING_ENABLED,
                  -1);
        }
      }

      if (command.method1531(GlobalStatics_3.COMMAND_SHIFT_CLICK)) {
        if (DummyClass55.aBoolean1419) {
          GlobalStatics_9.aClass94_3653.method1549(false);
          DummyClass55.aBoolean1419 = false;
        } else {
          DummyClass29.aClass94_434.method1549(false);
          DummyClass55.aBoolean1419 = true;
        }
      }
    }

    GlobalStatics_9.secureBuffer.writePacket(44);
    GlobalStatics_9.secureBuffer.writeByte(command.getLength() - 2 + 1);
    GlobalStatics_9.secureBuffer.writeString(command.substring(2));
    ++GlobalStatics_7.anInt1633;
  }

  public static void method1047(int var0, int var1, int var2, boolean var3,
      int var4, boolean var5,
      boolean var6) {
    if (!var6) {
      if (var2 > var4) {
        int var7 = (var2 + var4) / 2;
        int var8 = var4;
        GameWorld var9 = GlobalStatics_10.aClass44_Sub1Array3201[var7];
        GlobalStatics_10.aClass44_Sub1Array3201[var7] =
            GlobalStatics_10.aClass44_Sub1Array3201[var2];
        GlobalStatics_10.aClass44_Sub1Array3201[var2] = var9;

        for (int var10 = var4; var10 < var2; ++var10) {
          if (GlobalStatics_0
              .method1535(var9, GlobalStatics_10.aClass44_Sub1Array3201[var10],
                  5730,
                  var0, var1, var3, var5) <= 0) {
            GameWorld var11 = GlobalStatics_10.aClass44_Sub1Array3201[var10];
            GlobalStatics_10.aClass44_Sub1Array3201[var10] =
                GlobalStatics_10.aClass44_Sub1Array3201[var8];
            GlobalStatics_10.aClass44_Sub1Array3201[var8++] = var11;
          }
        }

        GlobalStatics_10.aClass44_Sub1Array3201[var2] =
            GlobalStatics_10.aClass44_Sub1Array3201[var8];
        GlobalStatics_10.aClass44_Sub1Array3201[var8] = var9;
        GlobalStatics_7
            .method1047(var0, var1, -1 + var8, var3, var4, var5, false);
        GlobalStatics_7.method1047(var0, var1, var2, var3, var8 + 1, var5, false);
      }

    }
  }

  public static void method1048(int var0, int var1, int var2, int var3,
      int var4, int var5, int var6,
      int var7) {
    if (var5 > -15) {
      GlobalStatics_7.anInt688 = -64;
    }

    if (var1 >= 1 && var4 >= 1 && var1 <= 102 && var4 <= 102) {
      int var8;
      if (!GlobalStatics_9.method1986(41) &&
          (2 & GlobalStatics_10.tileFlags[0][var1][var4]) == 0) {
        var8 = var2;
        if ((8 & GlobalStatics_10.tileFlags[var2][var1][var4]) != 0) {
          var8 = 0;
        }

        if (var8 != GlobalStatics_8.plane) {
          return;
        }
      }

      var8 = var2;
      if (var2 < 3 && (2 & GlobalStatics_10.tileFlags[1][var1][var4])
          == 2) {
        var8 = var2 + 1;
      }

      DummyClass29.method910(-96, var4, var1, var2, var7, var8,
          com.jagex.runescape.statics.GlobalStatics_0.collisionMaps[var2]);
      if (var0 >= 0) {
        boolean var9 = GlobalStatics_9.aBoolean1905;
        GlobalStatics_9.aBoolean1905 = true;
        DummyClass31.method1683(var8, false, var2, false,
            com.jagex.runescape.statics.GlobalStatics_0.collisionMaps[var2],
            var0,
            var6, var1, (byte) 50, var4, var3);
        GlobalStatics_9.aBoolean1905 = var9;
      }
    }
  }

  public static void clear19(boolean var0) {
    GlobalStatics_7.anIntArray686 = null;
    GlobalStatics_7.aClass93_684 = null;
  }

  public static void method1053(byte var0, FileUnpacker var1) {
    GlobalStatics_10.aClass153_1372 = var1;
    int var2 = -52 / ((var0 + 55) / 36);
  }

  public static void method2100(byte var0) {
    GlobalStatics_9.gameBuffer.method807((byte) 118);
    int var1 = GlobalStatics_9.gameBuffer.readBits(1);
    if (var1 != 0) {
      int var2 = GlobalStatics_9.gameBuffer.readBits(2);
      if (var2 == 0) {
        DummyClass60.anIntArray441[GlobalStatics_9.anInt997++] = 2047;
      } else {
        int var3 = -112 / ((var0 - 26) / 40);
        int var4;
        int var5;
        if (var2 == 1) {
          var4 = GlobalStatics_9.gameBuffer.readBits(3);
          GlobalStatics_9.localPlayer.method1968(1, (byte) -128, var4);
          var5 = GlobalStatics_9.gameBuffer.readBits(1);
          if (var5 == 1) {
            DummyClass60.anIntArray441[GlobalStatics_9.anInt997++] = 2047;
          }

        } else if (var2 != 2) {
          if (var2 == 3) {
            var4 = GlobalStatics_9.gameBuffer.readBits(7);
            var5 = GlobalStatics_9.gameBuffer.readBits(1);
            GlobalStatics_9.currentPlane = GlobalStatics_9.gameBuffer
                .readBits(2);
            int var6 = GlobalStatics_9.gameBuffer.readBits(1);
            if (var6 == 1) {
              DummyClass60.anIntArray441[GlobalStatics_9.anInt997++] = 2047;
            }

            int var7 = GlobalStatics_9.gameBuffer.readBits(7);
            GlobalStatics_9.localPlayer
                .setPosition((byte) 126, var7, var5 == 1, var4);
          }
        } else {
          if (GlobalStatics_9.gameBuffer.readBits(1) == 1) {
            var4 = GlobalStatics_9.gameBuffer.readBits(3);
            GlobalStatics_9.localPlayer.method1968(2, (byte) -104, var4);
            var5 = GlobalStatics_9.gameBuffer.readBits(3);
            GlobalStatics_9.localPlayer.method1968(2, (byte) -126, var5);
          } else {
            var4 = GlobalStatics_9.gameBuffer.readBits(3);
            GlobalStatics_9.localPlayer.method1968(0, (byte) -109, var4);
          }

          var4 = GlobalStatics_9.gameBuffer.readBits(1);
          if (var4 == 1) {
            DummyClass60.anIntArray441[GlobalStatics_9.anInt997++] = 2047;
          }

        }
      }
    }
  }

  public static void method2104(Widget var0, boolean var1, int var2) {
    int var3 = 57 % ((var2 + 58) / 47);
    int var4 = var0.anInt240 != 0 ? var0.anInt240 : var0.anInt168;
    int var5 = var0.anInt252 != 0 ? var0.anInt252 : var0.zoom;
    GlobalStatics_5.method2183(var0.anInt279, var1, var4, 235, var5,
        GlobalStatics_9.aClass11ArrayArray1834[var0.anInt279 >> 16]);
    if (var0.aClass11Array262 != null) {
      GlobalStatics_5.method2183(var0.anInt279, var1, var4, 235, var5,
          var0.aClass11Array262);
    }

    SomethingPacket151 var6 =
        (SomethingPacket151) GlobalStatics_10.aClass130_3208.get(var0.anInt279);
    if (var6 != null) {
      GlobalStatics_9.method1352(var5, var1, -1, var6.anInt2602, var4);
    }
  }

  public static void clear16(boolean var0) {
    GlobalStatics_7.aClass94_2959 = null;
    GlobalStatics_7.aClass94_2951 = null;
    if (!var0) {
      GlobalStatics_7.anIntArray2952 = null;
      GlobalStatics_7.loginBuffer = null;
      GlobalStatics_7.aClass94_2960 = null;
      GlobalStatics_7.aClass94_2961 = null;
      GlobalStatics_7.aClass94_2945 = null;
    }
  }
}
