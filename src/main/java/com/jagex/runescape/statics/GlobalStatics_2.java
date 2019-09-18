package com.jagex.runescape.statics;

import com.jagex.runescape.model.Widget;
import com.jagex.runescape.model.WidgetUpdate;
import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.common.HashTable;
import com.jagex.runescape.model.AbstractDirectColorSprite;
import com.jagex.runescape.model.AbstractTextureSampler;
import com.jagex.runescape.model.AreaSoundEffect;
import com.jagex.runescape.model.BufferObject;
import com.jagex.runescape.model.FileOnDisk;
import com.jagex.runescape.model.FileUnpacker;
import com.jagex.runescape.model.FloorUnderlay;
import com.jagex.runescape.model.GameObjectConfig;
import com.jagex.runescape.model.MapScene;
import com.jagex.runescape.model.MidiFile;
import com.jagex.runescape.model.NpcConfiguration;
import com.jagex.runescape.model.Player;
import com.jagex.runescape.model.SignLink;
import com.jagex.runescape.model.SignLinkRequest;
import com.jagex.runescape.model.SocketStream;
import com.jagex.runescape.model.SoftwareDirectColorSprite;
import com.jagex.runescape.model.SomethingWorldMapy;
import com.jagex.runescape.model.TextureSampler34;
import com.jagex.runescape.opengl.GLStatics;
import com.jagex.runescape.opengl.GlDirectColorSprite;
import com.jagex.runescape.opengl.GlEnvironment;
import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.SomethingShadows;
import com.jagex.runescape.settings.SettingsStatics;
import com.jagex.runescape.sprite.SoftwareIndexedColorSprite;
import java.io.IOException;
import java.util.Date;

public class GlobalStatics_2 {

  public static GameString aClass94_2215 = GameStringStatics
      .create("Konfig geladen)3");
  public static int anInt2217 = 2;
  public static int anInt2218 = -1;
  public static short[] aShortArray2219 =
      {(short) -4160, (short) -4163, (short) -8256, (short) -8259,
          (short) 22461};
  public static HashTable aClass130_2220 = new HashTable(32);
  public static GameString aClass94_2242 = GameStringStatics.create("welle2:");
  public static int anInt2243 = 3353893;
  public static int anInt2246;
  public static GameString aClass94_3601 = GameStringStatics
      .create(")3runescape)3com)4l=");
  public static int anInt3602;
  public static boolean aBoolean3604 = true;
  public static int[][][] othrrHeightMap;
  public static int anInt3606;
  public static int[] anIntArray3607 = {0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1};
  public static int anInt3608;
  public static GameString[] aClass94Array2566 = new GameString[200];
  public static int anInt2567 = -1;
  public static int anInt2571;
  public static int anInt2572;
  public static FileUnpacker fileUnpacker11;
  public static int[] anIntArray2574 = new int[14];
  public static int anInt2575;
  public static int anInt2577;
  public static GameString aClass94_37 = GameStringStatics.create("0(U");
  public static GameString aClass94_38 = GameStringStatics.create("tbrefresh");
  public static int[] anIntArray39;
  public static int anInt40;
  public static SocketStream updateSocket;
  public static int anInt42;
  public static int anInt342;
  public static GameString aClass94_343 = GameStringStatics
      .create("blanc:");
  public static short[][] aShortArrayArray344;
  public static boolean USE_INT_ARRAY_KEYBOARD_EVENTS;
  public static int[] anIntArray347 = new int[0x8000];
  public static int anInt348;
  public static int anInt349;
  public static SignLinkRequest aClass64_351;
  public static int anInt3699;
  public static GameString COMMAND_CARD_MEMORY = GameStringStatics
      .create("::cardmem");
  public static GameString aClass94_3702 = GameStringStatics
      .create(" )2> <col=ffff00>");
  public static GameString aClass94_3703 = GameStringStatics.create(" )2> ");
  public static int anInt3704;
  public static GameString aClass94_3705 = GameStringStatics
      .create("W-=hlen Sie eine Option");
  public static Widget aClass11_3708;
  public static FileUnpacker configs;
  static GameString aClass94_2224 = GameStringStatics
      .create("Please wait)3)3)3");
  public static GameString aClass94_2216 = GlobalStatics_2.aClass94_2224;
  static GameString aClass94_2568 = GameStringStatics
      .create("Started 3d Library");
  public static GameString aClass94_2576 = GlobalStatics_2.aClass94_2568;
  static GameString aClass94_44 = GameStringStatics.create(" ");
  public static GameString aClass94_43 = GlobalStatics_2.aClass94_44;
  public static String aString597 =
    "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| "
      + 0x00c4 + 0x00cb + 0x00cf + 0x00d6 + 0x00dc + 0x00e4 + 0x00eb
      + 0x00ef + 0x00f6 + 0x00fc + 0x00ff + 0x00df + 0x00c1 + 0x00c0 + 0x00c9
      + 0x00c8 + 0x00cd + 0x00cc + 0x00d3 + 0x00d2 + 0x00da + 0x00d9 + 0x00e1
      + 0x00e0 + 0x00e9 + 0x00e8 + 0x00ed + 0x00ec + 0x00f3 + 0x00f2 + 0x00fa
      + 0x00f9 + 0x00c2 + 0x00ca + 0x00ce + 0x00d4 + 0x00db + 0x00e2 + 0x00ea
      + 0x00ee + 0x00f4 + 0x00fb + 0x00c6 + 0x00e6;
  public static final int anInt598 = GlobalStatics_2.aString597.length();
  public static int[] anIntArray599 = new int[256];

  public static void clear39(int var0) {
    GlobalStatics_2.aClass130_2220 = null;
    if (var0 != 3353893) {
      GlobalStatics_2.aClass94_2216 = null;
    }

    GlobalStatics_2.aShortArray2219 = null;
    GlobalStatics_2.aClass94_2242 = null;
    GlobalStatics_2.aClass94_2215 = null;
    GlobalStatics_2.aClass94_2224 = null;
    GlobalStatics_2.aClass94_2216 = null;
  }

  public static void method103(byte var0) {
    GlobalStatics_1.aClass130_2194.clear(122);
    if (var0 <= 18) {
      GlobalStatics_2.aClass94_2224 = null;
    }

    DummyClass50.aClass13_1139.clear();
    GlobalStatics_9.aClass13_1666.clear();
  }

  public static void method2037(int var0, int var1, boolean var2, boolean var3,
      int var4, int var5,
      int var6, int var7, int var8, int var9) {
    if (!var2 || !var3) {
      if (!var2 || var0 != 1) {
        if (!var3 || var0 != 0) {
          int var10 = var4 << 7;
          int var11 = var6 + var7 + var8 + var9 >> 2;
          int var12 = var5 << 7;
          int var13 = var10 - (var11 * GlEnvironment.anInt1314 >> 8) >> 3;
          int var14 = var12 - (var11 * GlEnvironment.anInt1315 >> 8) >> 3;
          if (var0 != 0 && var0 != 1 && (var2 || var3)) {
            GlobalStatics_2.method2050(SomethingShadows.floorShadows[var0],
                SomethingShadows.shadowsSprite, var13 + 1, var14 + 1, var1,
                var2);
          } else {
            SomethingShadows.method2034(SomethingShadows.floorShadows[1],
                SomethingShadows.shadowsSprite, var13 + 1, var14 + 1);
          }
        }
      }
    }
  }

  public static void method2046(byte[] var0, byte[] var1, int var2, int var3,
      int var4,
      int var5, int var6) {
    for (int var7 = -16; var7 < 0; ++var7) {
      for (int var8 = -4; var8 < 0; ++var8) {
        int var10001 = var3++;
        var0[var10001] = (byte) (var0[var10001] + 1 - var1[var2]);
        var2 += var5;
        var10001 = var3++;
        var0[var10001] = (byte) (var0[var10001] + 1 - var1[var2]);
        var2 += var5;
        var10001 = var3++;
        var0[var10001] = (byte) (var0[var10001] + 1 - var1[var2]);
        var2 += var5;
        var10001 = var3++;
        var0[var10001] = (byte) (var0[var10001] + 1 - var1[var2]);
        var2 += var5;
      }

      var3 += var4;
      var2 += var6;
    }

  }

  public static void method2048(byte[] var0, byte[] var1, int var2, int var3,
      int var4,
      int var5, int var6) {
    for (int var7 = -16; var7 < 0; ++var7) {
      for (int var8 = -4; var8 < 0; ++var8) {
        int var10001 = var3++;
        var0[var10001] += var1[var2];
        var2 += var5;
        var10001 = var3++;
        var0[var10001] += var1[var2];
        var2 += var5;
        var10001 = var3++;
        var0[var10001] += var1[var2];
        var2 += var5;
        var10001 = var3++;
        var0[var10001] += var1[var2];
        var2 += var5;
      }

      var3 += var4;
      var2 += var6;
    }

  }

  public static void method2050(SoftwareIndexedColorSprite var0,
      SoftwareIndexedColorSprite var1, int var2, int var3,
      int var4, boolean var5) {
    if (var2 > 0 && var3 > 0 && var2 + 16 < var1.width
        && var3 + 16 < var1.height) {
      int var6 = var2 + var3 * var1.width;
      int var7 = var1.width - 16;
      short var8;
      byte var9;
      int var10;
      if (var4 == 0) {
        var8 = 240;
        var9 = 1;
        var10 = -var9 * 16 - 16;
      } else if (var4 == 1) {
        var8 = 255;
        var9 = -16;
        var10 = -var9 * 16 - 1;
      } else if (var4 == 2) {
        var8 = 15;
        var9 = -1;
        var10 = -var9 * 16 + 16;
      } else {
        var8 = 0;
        var9 = 16;
        var10 = -var9 * 16 + 1;
      }

      if (var5) {
        GlobalStatics_2
            .method2046(var1.aByteArray2674, var0.aByteArray2674, var8, var6,
            var7, var9, var10);
      } else {
        GlobalStatics_2
            .method2048(var1.aByteArray2674, var0.aByteArray2674, var8, var6,
            var7, var9, var10);
      }

      SomethingShadows.method2036(var2, var3, 16, 16);
    }
  }

  public static SoftwareDirectColorSprite method562(FileUnpacker var0, int var1,
      int var2,
      byte var3) {
    return GlobalStatics_9.loadSprites(var0, var1, var2, -30901) ?
        var3 == 39 ? GlobalStatics_9.method578(var3 ^ 84) : null :
        null;
  }

  public static void method563(int var0) {
    GlobalStatics_2.othrrHeightMap = null;
    GlobalStatics_2.aClass94_3601 = null;
    GlobalStatics_2.anIntArray3607 = null;
    if (var0 != 3) {
      GLStatics.viewportLowerZ = -108;
    }
  }

  public static void loadSettings(SignLink var0, int var1) {
    GlobalStatics_4.brightnessSetting = 3;
    GlobalStatics_9.method957(true);
    GlobalStatics_2.aBoolean3604 = true;
    GlobalStatics_1.aBoolean3184 = true;
    GLStatics.aBoolean1685 = true;
    GlobalStatics_9.RENDERING_SAMPLES = 0;
    GlobalStatics_9.GL_RENDERING_SAMPLES = 0;
    GlobalStatics_10.anInt3071 = 0;
    GlobalStatics_9.aBoolean1905 = true;
    GlobalStatics_9.aBoolean2623 = true;
    GlobalStatics_10.aBoolean236 = true;
    DummyClass28.anInt340 = 127;
    DummyClass35.aBoolean661 = true;
    GlobalStatics_9.aBoolean2910 = true;
    GlobalStatics_3.anInt2378 = 0;
    GLStatics.anInt1137 = 2;
    GlobalStatics_9.aBoolean3275 = true;
    GLStatics.USE_BUMP_MAPS = true;
    GlobalStatics_10.anInt120 = 255;
    GlobalStatics_9.aBoolean488 = true;
    FileOnDisk var2 = null;
    GlobalStatics_7.anInt2453 = 127;
    if (GlobalStatics_6.anInt3492 >= 96) {
      DummyClass0.method1758(2);
    } else {
      DummyClass0.method1758(0);
    }

    GlobalStatics_0.anInt2148 = var1;
    GlobalStatics_10.anInt2488 = 0;
    GlobalStatics_2.USE_INT_ARRAY_KEYBOARD_EVENTS = false;
    DummyClass4.aBoolean3004 = true;
    GlobalStatics_0.SAFE_MODE = false;
    GlobalStatics_7.aBoolean1080 = false;
    GlobalStatics_2.anInt2577 = 0;

    try {
      SignLinkRequest var3 = var0.getSettings("runescape");

      while (var3.status == 0) {
        GlobalStatics_10.sleep(1L);
      }

      if (var3.status == 1) {
        var2 = (FileOnDisk) var3.result;
        byte[] var4 = new byte[(int) var2.length()];

        int var6;
        for (int var5 = 0; var5 < var4.length; var5 += var6) {
          var6 = var2.readBytes(var5, var1, var4.length - var5, var4);
          if (var6 == -1) {
            throw new IOException("EOF");
          }
        }

        SettingsStatics.parseSettings(new Buffer(var4), -1);
      }
    } catch (Exception var8) {
    }

    try {
      if (var2 != null) {
        var2.close();
      }
    } catch (Exception var7) {
    }
  }

  public static void method565(byte var0, int var1, int var2) {
    GlobalStatics_9.anInt1150 = -GlobalStatics_10.anInt3256 + var1;
    if (var0 != 86) {
      GlobalStatics_2.anIntArray3607 = null;
    }

    int var3 =
        -((int) (GlobalStatics_9.aClass11_3551.anInt168
            / GlobalStatics_4.aFloat727))
            + GlobalStatics_9.anInt1150;
    int var4 =
        GlobalStatics_9.anInt1150 + (int) (
            GlobalStatics_9.aClass11_3551.anInt168
                / GlobalStatics_4.aFloat727);
    if (var3 < 0) {
      GlobalStatics_9.anInt1150 =
          (int) (GlobalStatics_9.aClass11_3551.anInt168
              / GlobalStatics_4.aFloat727);
    }

    GlobalStatics_9.anInt3362 =
        DummyClass58.anInt1460 - 1 + GlobalStatics_9.anInt65 - var2;
    int var6 =
        (int) (GlobalStatics_9.aClass11_3551.zoom
            / GlobalStatics_4.aFloat727)
            + GlobalStatics_9.anInt3362;
    int var5 =
        GlobalStatics_9.anInt3362 - (int) (
            GlobalStatics_9.aClass11_3551.zoom
                / GlobalStatics_4.aFloat727);
    if (var4 > DummyClass30.anInt455) {
      GlobalStatics_9.anInt1150 =
          DummyClass30.anInt455 - (int) (GlobalStatics_9.aClass11_3551.anInt168
              / GlobalStatics_4.aFloat727);
    }

    if (var5 < 0) {
      GlobalStatics_9.anInt3362 =
          (int) (GlobalStatics_9.aClass11_3551.zoom
              / GlobalStatics_4.aFloat727);
    }

    if (DummyClass58.anInt1460 < var6) {
      GlobalStatics_9.anInt3362 =
          -((int) (GlobalStatics_9.aClass11_3551.zoom
              / GlobalStatics_4.aFloat727))
              + DummyClass58.anInt1460;
    }
  }

  public static void method566(GameString var0, int var1, int var2) {
    WidgetUpdate var3 = GlobalStatics_6.method466(var1 + 4, 3, var2);
    var3.g((byte) 33);
    if (var1 != 0) {
      GLStatics.viewportLowerZ = 112;
    }

    var3.text = var0;
  }

  public static void method518(Player var0, int var1) {
    AreaSoundEffect var2 = (AreaSoundEffect) GlobalStatics_9.aClass130_4046
        .get(var0.name.toBase37());
    if (var1 >= -85) {
      GlobalStatics_2.method523(40, -17, -52, -32, 9, -51, -85, -84, -19);
    }

    if (var2 != null) {
      var2.method134(1);
    } else {
      GlobalStatics_9.method1286(var0.waypointsY[0], false, null, 0, null,
          var0.waypointsX[0],
          GlobalStatics_9.currentPlane, var0);
    }
  }

  public static int method519(int var0, boolean var1, int var2, int var3) {
    var0 &= 3;
    if (!var1) {
      GlobalStatics_2.method520((byte) -89);
    }

    return var0 != 0 ? var0 == 1 ? var2 : var0 == 2 ? -var3 + 7 : -var2 + 7 : var3;
  }

  public static SomethingWorldMapy method520(byte var0) {
    int var1 = -122 % ((var0 + 48) / 33);
    return GlobalStatics_0.aClass3_Sub28_Sub3_2600;
  }

  public static void clear99(int var0) {
    GlobalStatics_2.fileUnpacker11 = null;
    if (var0 == -3) {
      GlobalStatics_2.aClass94Array2566 = null;
      GlobalStatics_2.aClass94_2568 = null;
      GlobalStatics_2.anIntArray2574 = null;
      GlobalStatics_2.aClass94_2576 = null;
    }
  }

  public static NpcConfiguration getNpcConfiguration(int var0) {
    NpcConfiguration var2 = (NpcConfiguration) GlobalStatics_9.aClass93_4043
        .get(
            var0);
    if (var2 == null) {
      byte[] var3 = GlobalStatics_9.aClass153_557
          .getBytes(DummyClass36.method1031(var0, 2),
              GlobalStatics_0.method54(var0, false));
      var2 = new NpcConfiguration();

      var2.anInt1284 = var0;
      if (var3 != null) {
        var2.method1478(new Buffer(var3), 74);
      }

      var2.method1481(98);
      GlobalStatics_9.aClass93_4043.get((byte) -95, var2, var0);
      return var2;
    } else {
      return var2;
    }
  }

  public static void method523(int var0, int var1, int var2, int var3, int var4,
      int var5, int var6,
      int var7, int var8) {
    int var9 = var3 - var8;
    int var11 = (-var5 + var0 << 16) / var9;
    int var10 = -var4 + var6;
    int var12 = (var7 - var1 << 16) / var10;
    GlobalStatics_9
        .method1410(var1, 0, var6, var4, var3, var5, var8, var12, var11, var2,
            -12541);
  }

  public static void method61(int var0) {
    int var1 = 10 / ((-37 - var0) / 33);
    GlobalStatics_2.aClass94_44 = null;
    GlobalStatics_2.updateSocket = null;
    GlobalStatics_2.aClass94_43 = null;
    GlobalStatics_2.aClass94_38 = null;
    GlobalStatics_2.aClass94_37 = null;
    GlobalStatics_2.anIntArray39 = null;
  }

  public static int[] method62(boolean var0, int var1, int var2, int var3,
      int var4, float var5,
      int var6, int var7) {
    if (var1 != 14585) {
      GlobalStatics_2.anInt40 = 43;
    }

    int[] var8 = new int[var3];
    TextureSampler34 var9 = new TextureSampler34();
    var9.anInt3060 = var6;
    var9.anInt3058 = var4;
    var9.anInt3067 = var7;
    var9.anInt3056 = var2;
    var9.anInt3062 = (int) (var5 * 4096.0F);
    var9.aBoolean3065 = var0;
    var9.method158(16251);
    GlobalStatics_10.method180(-106, 1, var3);
    var9.method186(true, 0, var8);
    return var8;
  }

  public static AbstractTextureSampler method63(byte var0, Buffer var1) {
    var1.readUnsignedByte();
    int var2 = var1.readUnsignedByte();
    AbstractTextureSampler var3 = GlobalStatics_0
        .createTextureSampler(var2, true);
    assert var3 != null;
    var3.cacheSize = var1.readUnsignedByte();
    int var4 = var1.readUnsignedByte();
    if (var0 > -26) {
      GlobalStatics_2.aClass94_43 = null;
    }

    for (int var5 = 0; var5 < var4; ++var5) {
      int var6 = var1.readUnsignedByte();
      var3.parseConfig(var6, var1, true);
    }

    var3.method158(16251);
    return var3;
  }

  public static int method64(boolean var0, int var1) {
    if (!var0) {
      GlobalStatics_2.aClass94_43 = null;
    }

    return var1 >>> 8;
  }

  public static boolean method888(int var0, GameObjectConfig var1, boolean var2,
      int var3, int var4,
      int var5, int var6) {
    MapScene var7 = GlobalStatics_10.c(var1.anInt1516, 0);
    if (var7.spriteId == -1) {
      return true;
    } else {
      if (var1.aBoolean1537) {
        var6 += var1.anInt1478;
        var6 &= 3;
      } else {
        var6 = 0;
      }

      if (var2) {
        GlobalStatics_2.aClass64_351 = null;
      }

      SoftwareIndexedColorSprite var8 = var7.getSprite(var6, (byte) -111);
      if (var8 == null) {
        return false;
      } else {
        int var9 = var1.anInt1480;
        int var10 = var1.anInt1485;
        if ((1 & var6) == 1) {
          var9 = var1.anInt1485;
          var10 = var1.anInt1480;
        }

        int var11 = var8.anInt1469;
        int var12 = var8.anInt1467;
        if (var7.aBoolean69) {
          var12 = 4 * var10;
          var11 = 4 * var9;
        }

        if (var7.anInt61 == 0) {
          var8.method1677(var0 * 4 + 48, 48 + 4 * (-var10 - var5 + 104),
              var11, var12);
        } else {
          var8.method1669(48 + 4 * var0, 4 * (-var10 - var5 + 104) + 48,
              var11, var12,
              var7.anInt61);
        }

        return true;
      }
    }
  }

  public static void method889(byte var0, Buffer var1) {
    if (var0 != 105) {
      GlobalStatics_2.anIntArray347 = null;
    }

    int var3 = GlobalStatics_5.anInt2010 >> 1;
    int var2 = GlobalStatics_10.anInt4034 >> 2 << 10;
    byte[][] var4 = new byte[DummyClass30.anInt455][DummyClass58.anInt1460];

    int var6;
    int var12;
    int var14;
    while (var1.position < var1.bytes.length) {
      int var7 = 0;
      var6 = 0;
      boolean var5 = false;
      if (var1.readUnsignedByte() == 1) {
        var6 = var1.readUnsignedByte();
        var7 = var1.readUnsignedByte();
        var5 = true;
      }

      int var8 = var1.readUnsignedByte();
      int var9 = var1.readUnsignedByte();
      int var10 = -GlobalStatics_10.anInt3256 + var8 * 64;
      int var11 =
          -1 + DummyClass58.anInt1460 - var9 * 64 + GlobalStatics_9.anInt65;
      if (var10 >= 0 && -63 + var11 >= 0
          && DummyClass30.anInt455 > var10 + 63
          && DummyClass58.anInt1460 > var11) {
        for (var12 = 0; var12 < 64; ++var12) {
          byte[] var13 = var4[var10 + var12];

          for (var14 = 0; var14 < 64; ++var14) {
            if (!var5 || var12 >= 8 * var6 && 8 + 8 * var6 > var12
                && var14 >= var7 * 8
                && var14 < 8 + 8 * var7) {
              var13[var11 - var14] = var1.readByte();
            }
          }
        }
      } else if (!var5) {
        var1.position += 4096;
      } else {
        var1.position += 64;
      }
    }

    int var27 = DummyClass30.anInt455;
    var6 = DummyClass58.anInt1460;
    int[] var29 = new int[var6];
    int[] var28 = new int[var6];
    int[] var30 = new int[var6];
    int[] var32 = new int[var6];
    int[] var31 = new int[var6];

    for (var12 = -5; var12 < var27; ++var12) {
      int var15;
      int var35;
      for (int var34 = 0; var34 < var6; ++var34) {
        var14 = var12 + 5;
        if (var27 > var14) {
          var15 = 255 & var4[var14][var34];
          if (var15 > 0) {
            FloorUnderlay var16 = GlobalStatics_6.getFloorUnderlay(var15 - 1);
            var28[var34] += var16.anInt1408;
            var29[var34] += var16.anInt1406;
            var30[var34] += var16.anInt1417;
            var32[var34] += var16.anInt1418;
            ++var31[var34];
          }
        }

        var15 = var12 - 5;
        if (var15 >= 0) {
          var35 = var4[var15][var34] & 255;
          if (var35 > 0) {
            FloorUnderlay var17 = GlobalStatics_6.getFloorUnderlay(-1 + var35);
            var28[var34] -= var17.anInt1408;
            var29[var34] -= var17.anInt1406;
            var30[var34] -= var17.anInt1417;
            var32[var34] -= var17.anInt1418;
            --var31[var34];
          }
        }
      }

      if (var12 >= 0) {
        int[][] var33 = GlobalStatics_5.anIntArrayArrayArray1903[var12
            >> 6];
        var14 = 0;
        var15 = 0;
        int var36 = 0;
        int var18 = 0;
        var35 = 0;

        for (int var19 = -5; var19 < var6; ++var19) {
          int var20 = var19 + 5;
          if (var6 > var20) {
            var18 += var31[var20];
            var15 += var29[var20];
            var35 += var30[var20];
            var14 += var28[var20];
            var36 += var32[var20];
          }

          int var21 = -5 + var19;
          if (var21 >= 0) {
            var35 -= var30[var21];
            var36 -= var32[var21];
            var14 -= var28[var21];
            var18 -= var31[var21];
            var15 -= var29[var21];
          }

          if (var19 >= 0 && var18 > 0) {
            int[] var22 = var33[var19 >> 6];
            int var23 = var36 != 0 ?
                GlobalStatics_6.method129(var35 / var18, 2, var15 / var18,
                    var14 * 256 / var36) :
                0;
            if (var4[var12][var19] == 0) {
              if (var22 != null) {
                var22[(4032 & var19 << 6) + (var12 & 63)] =
                    0;
              }
            } else {
              if (var22 == null) {
                var22 = var33[var19 >> 6] = new int[4096];
              }

              int var24 = var3 + (var23 & 127);
              if (var24 < 0) {
                var24 = 0;
              } else if (var24 > 127) {
                var24 = 127;
              }

              int var25 = var24 + (896 & var23) + (var23 + var2 & 0xfc00);
              var22[(4032 & var19 << 6) + (63 & var12)] =
                  GLStatics.hslTable[GlobalStatics_6
                      .repackHSL(96, true, var25)];
            }
          }
        }
      }
    }
  }

  public static Object method890(boolean var0, int var1, byte[] var2) {
    if (var2 == null) {
      return null;
    } else {
      if (var1 >= -67) {
        GlobalStatics_2.method891(19);
      }

      if (var2.length > 136 && !DummyClass38.aBoolean732) {
        try {
          BufferObject var3 = (BufferObject) Class.forName(
              "com.jagex.runescape.model.NativeBufferObject").newInstance();
          var3.put(400, var2);
          return var3;
        } catch (Throwable var4) {
          DummyClass38.aBoolean732 = true;
        }
      }

      return var0 ? GlobalStatics_9.method873((byte) 62, var2) : var2;
    }
  }

  public static AbstractDirectColorSprite[] method891(int var0) {
    AbstractDirectColorSprite[] var1 = new AbstractDirectColorSprite[DummyClass53.spriteCount];
    if (var0 != -5) {
      GlobalStatics_2.method894(113L, (byte) 48);
    }

    for (int var2 = 0; DummyClass53.spriteCount > var2; ++var2) {
      int var3 = GlobalStatics_9.anIntArray2931[var2]
          * GlobalStatics_10.anIntArray3076[var2];
      byte[] var4 = DummyClass5.aByteArrayArray2987[var2];
      int[] var5 = new int[var3];

      for (int var6 = 0; var6 < var3; ++var6) {
        var5[var6] = GlobalStatics_10.anIntArray3446[255 & (int) var4[var6]];
      }

      if (GlRenderer.USE_OPENGL) {
        var1[var2] =
            new GlDirectColorSprite(GlobalStatics_9.anInt2426,
                GlobalStatics_9.anInt1748,
                GlobalStatics_9.anIntArray2048[var2],
                GlobalStatics_0.anIntArray2591[var2],
                GlobalStatics_9.anIntArray2931[var2],
                GlobalStatics_10.anIntArray3076[var2], var5);
      } else {
        var1[var2] =
            new SoftwareDirectColorSprite(GlobalStatics_9.anInt2426,
                GlobalStatics_9.anInt1748,
                GlobalStatics_9.anIntArray2048[var2],
                GlobalStatics_0.anIntArray2591[var2],
                GlobalStatics_9.anIntArray2931[var2],
                GlobalStatics_10.anIntArray3076[var2], var5);
      }
    }

    DummyClass37.method1035((byte) 116);
    return var1;
  }

  public static void clear77(int var0) {
    GlobalStatics_2.aShortArrayArray344 = null;
    GlobalStatics_2.aClass94_343 = null;
    GlobalStatics_2.aClass64_351 = null;
    if (var0 <= 75) {
      GlobalStatics_2.USE_INT_ARRAY_KEYBOARD_EVENTS = false;
    }

    GlobalStatics_2.anIntArray347 = null;
  }

  public static int method893(int var0, byte var1) {
    return var0 & 255;
  }

  public static GameString method894(long var0, byte var2) {
    GlobalStatics_6.aCalendar3581.setTime(new Date(var0));
    int var3 = GlobalStatics_6.aCalendar3581.get(7);
    int var4 = GlobalStatics_6.aCalendar3581.get(5);
    int var5 = GlobalStatics_6.aCalendar3581.get(2);
    if (var2 < 9) {
      GlobalStatics_2.method889((byte) 7, null);
    }

    int var6 = GlobalStatics_6.aCalendar3581.get(1);
    int var7 = GlobalStatics_6.aCalendar3581.get(11);
    int var8 = GlobalStatics_6.aCalendar3581.get(12);
    int var9 = GlobalStatics_6.aCalendar3581.get(13);
    return GlobalStatics_9.concat(new GameString[]{
        GlobalStatics_9.aClass94Array3376[var3 - 1],
        GlobalStatics_10.aClass94_3145,
        GlobalStatics_9.toString(var4 / 10),
        GlobalStatics_9.toString(var4 % 10),
        DummyClass12.aClass94_2025, GlobalStatics_9.aClass94Array3985[var5],
        DummyClass12.aClass94_2025,
        GlobalStatics_9.toString(var6), GlobalStatics_9.aClass94_465,
        GlobalStatics_9.toString(var7 / 10),
        GlobalStatics_9.toString(var7 % 10),
        GlobalStatics_5.aClass94_1970,
        GlobalStatics_9.toString(var8 / 10),
        GlobalStatics_9.toString(var8 % 10),
        GlobalStatics_5.aClass94_1970,
        GlobalStatics_9.toString(var9 / 10),
        GlobalStatics_9.toString(var9 % 10), GlobalStatics_9.aClass94_500
    });
  }

  public static int[][] method895(boolean var0, int var1, int var2, int var3,
      int var5,
      int var6, float var7, byte var8) {
    if (var8 >= -52) {
      GlobalStatics_2.method891(115);
    }

    int[][] var9 = new int[var3][var2];
    TextureSampler34 var10 = new TextureSampler34();
    var10.anInt3062 = (int) (var7 * 4096.0F);
    var10.anInt3058 = var1;
    var10.anInt3056 = var5;
    var10.aBoolean3065 = var0;
    var10.anInt3060 = var6;
    var10.method158(16251);
    GlobalStatics_10.method180(122, var3, var2);

    for (int var11 = 0; var3 > var11; ++var11) {
      var10.method186(true, var11, var9[var11]);
    }

    return var9;
  }

  public static void clear28(byte var0) {
    GlobalStatics_2.aClass11_3708 = null;
    GlobalStatics_2.aClass94_3702 = null;
    GlobalStatics_2.aClass94_3705 = null;
    if (var0 == 108) {
      GlobalStatics_2.aClass94_3703 = null;
      GlobalStatics_2.COMMAND_CARD_MEMORY = null;
    }
  }

  public static Widget method638(byte var0, int var1, int var2) {
    Widget var3 = GlobalStatics_7.getWidget((byte) 109, var1);
    return var2 == -1 ?
        var3 :
        var0 == -19 ? var3 != null && var3.aClass11Array262 != null
            && var3.aClass11Array262.length > var2 ?
            var3.aClass11Array262[var2] :
            null : null;
  }

  public static MidiFile method517(FileUnpacker unpacker, int fileId,
      int childId) {
    byte[] bytes = unpacker.getBytes(fileId, childId);
    return bytes == null ? null : new MidiFile(new Buffer(bytes));
  }

  public static void clear88() {
    GlobalStatics_2.aString597 = null;
    GlobalStatics_2.anIntArray599 = null;
  }
}
