package com.jagex.runescape.statics;

import com.jagex.runescape.model.UnusedInterface0;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.common.HashTable;
import com.jagex.runescape.model.AbstractFont;
import com.jagex.runescape.model.AnimationSomething;
import com.jagex.runescape.model.FileUnpacker;
import com.jagex.runescape.model.FloorOverlay;
import com.jagex.runescape.model.Player;
import com.jagex.runescape.scene.SceneGraphTile;
import com.jagex.runescape.scene.SceneSomething;
import com.jagex.runescape.model.SoftwareFont;
import com.jagex.runescape.model.SomethingPacket116;
import com.jagex.runescape.model.SomethingPacket151;
import com.jagex.runescape.model.SomethingWorldMapy;
import com.jagex.runescape.node.Deque;
import com.jagex.runescape.opengl.GLStatics;
import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.GlTexture2d;
import com.jagex.runescape.opengl.GlUtils;
import com.jagex.runescape.opengl.SomethingGl0;
import com.jagex.runescape.sprite.AbstractIndexedColorSprite;
import com.jagex.runescape.sprite.SoftwareIndexedColorSpriteStatics;
import java.awt.Graphics;

public class GlobalStatics_3 {

  public static long aLong1102;
  public static AnimationSomething[] aClass3_Sub28_Sub5Array1103 = new AnimationSomething[14];
  public static int anInt1105;
  public static int[] OBJECT_TYPES =
      {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
  public static int anInt1108;
  public static int anInt1109;
  public static int anInt2378;
  public static AbstractFont aClass3_Sub28_Sub17_2379;
  public static GameString COMMAND_SHIFT_CLICK = GameStringStatics
      .create("::shiftclick");
  public static int anInt2383;
  public static int anInt2384;
  public static GameString COMMAND_REPLACE_CANVAS = GameStringStatics
      .create("::replacecanvas");
  public static int[] anIntArray2386 = {1, -1, -1, 1};
  public static byte[] aByteArray1389 = new byte[500];
  public static short[] aShortArray1390 = new short[500];
  public static short[] aShortArray1391 = new short[500];
  public static short[] aShortArray1392 = new short[500];
  public static short[] aShortArray1394 = new short[500];
  public static short[] aShortArray1397 = new short[500];
  public static GameString aClass94_2465 = GameStringStatics.create("");
  public static GameString loadingText = GlobalStatics_3.aClass94_2465;
  public static float aFloat2457;
  public static GameString aClass94_2458 = GameStringStatics
      .create("Module texte charg-B");
  public static int anInt2459;
  public static GameString aClass94_2461 =
      GameStringStatics.create("3D)2Softwarebibliothek gestartet)3");
  public static volatile long canvasInitializedTime;
  public static FileUnpacker aClass153_1852;
  public static int anInt1853;
  public static AbstractIndexedColorSprite logoSprite;
  public static int anInt1858;
  public static FileUnpacker animationSequences;
  public static int fps;
  public static GameString aClass94_1863 =
      GameStringStatics.create(" steht bereits auf Ihrer Freunde)2Liste(Q");
  public static SceneSomething[] aClass25Array1868;
  public static int[] anIntArray1871 = new int[2];
  public static UnusedInterface0 anInterface1_2970;
  public static int[] BIT_MASKS = {
    0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 0xffff, 131071,
    262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727,
    268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1
  };

  public static void method1334(byte var0) {
    GlobalStatics_3.OBJECT_TYPES = null;
    GlobalStatics_3.aClass3_Sub28_Sub5Array1103 = null;
  }

  public static SceneSomething method1336(int var0, int var1, int var2) {
    SceneGraphTile var3 = GLStatics.sceneGraphTiles[var0][var1][var2];
    if (var3 == null) {
      return null;
    } else {
      for (int var4 = 0; var4 < var3.anInt2223; ++var4) {
        SceneSomething var5 = var3.sceneGraphNodes[var4];
        if ((var5.aLong498 >> 29 & 3L) == 2L && var5.anInt483 == var1
            && var5.anInt478 == var2) {
          return var5;
        }
      }

      return null;
    }
  }

  public static int method1338(int var0, int var1) {
    if (var1 <= 13) {
      GlobalStatics_3.OBJECT_TYPES = null;
    }

    return 255 & var0;
  }

  public static void method1339(GameString var0, int var1) {
    if (var1 == 0) {
      for (
          SomethingWorldMapy var2 = (SomethingWorldMapy) DummyClass21.aClass61_1758
              .getFirst();
          var2 != null;
          var2 = (SomethingWorldMapy) DummyClass21.aClass61_1758.getNext()) {
        if (var2.aClass94_3561.method1528((byte) -42, var0)) {
          GlobalStatics_0.aClass3_Sub28_Sub3_2600 = var2;
          return;
        }
      }

    }
  }

  public static void method1340(int var0, int var1, byte var2, int var3,
      int var4) {
    if (var2 != -40) {
      GlobalStatics_3.anInt1105 = 43;
    }

    for (int var5 = 0; GlobalStatics_9.widgetQuads > var5; ++var5) {
      if (GlTexture2d.quadx1[var5] + GlobalStatics_5.quadx0[var5] > var0
          && var1 + var0 > GlobalStatics_5.quadx0[var5] &&
          var3 < GlobalStatics_9.quady1[var5] + GlobalStatics_9.quady0[var5]
          && GlobalStatics_9.quady0[var5] < var3 + var4) {
        GlobalStatics_9.aBooleanArray3674[var5] = true;
      }
    }
  }

  public static void method153(int var0) {
    if (var0 >= 91) {
      GlobalStatics_9.aClass61_2557 = new Deque();
    }
  }

  public static void method156(int var0) {
    if (var0 != 2) {
      GlobalStatics_3.method153(18);
    }

    GlobalStatics_3.anIntArray2386 = null;
    GlobalStatics_3.COMMAND_REPLACE_CANVAS = null;
    GlobalStatics_3.COMMAND_SHIFT_CLICK = null;
    GlobalStatics_3.aClass3_Sub28_Sub17_2379 = null;
  }

  public static SoftwareFont method163(byte[] var0, int var1) {
    if (var0 == null) {
      return null;
    } else {
      if (var1 != 25208) {
        GlobalStatics_3.anInt2378 = 5;
      }

      SoftwareFont var2 =
          new SoftwareFont(var0, GlobalStatics_9.anIntArray2048,
              GlobalStatics_0.anIntArray2591,
              GlobalStatics_9.anIntArray2931, GlobalStatics_10.anIntArray3076,
              DummyClass5.aByteArrayArray2987);
      DummyClass37.method1035((byte) 126);
      return var2;
    }
  }

  public static void drawLoadingBox(GameString text, boolean draw) {
    byte var3 = 4;
    int var4 = var3 + 6;
    int var5 = var3 + 6;
    int var6 = GlobalStatics_9.p12Font.method680(text, 250);
    int var7 = GlobalStatics_9.p12Font.method684(text, 250) * 13;
    if (GlRenderer.USE_OPENGL) {
      GlUtils.fillQuad(var4 - var3, -var3 + var5, var3 + var6 + var3,
          var3 + var3 + var7, 0);
      GlUtils.drawQuad(-var3 + var4, -var3 + var5, var6 + var3 + var3,
          var3 + var7 + var3,
          16777215);
    } else {
      DummyClass47.method1323(var4 - var3, -var3 + var5, var3 + var6 + var3,
          var3 + var3 + var7,
          0);
      DummyClass47.method1311(var4 - var3, var5 - var3, var3 + var3 + var6,
          var3 + var3 + var7,
          16777215);
    }

    GlobalStatics_9.p12Font
        .draw(text, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
    GlobalStatics_3.method1340(var4 - var3, var6 + var3 + var3, (byte) -40,
        -var3 + var5, var3 + var7 + var3);
    if (draw) {
      if (GlRenderer.USE_OPENGL) {
        GlRenderer.swapBuffers();
      } else {
        try {
          Graphics graphics = GlobalStatics_8.GAME_CANVAS.getGraphics();
          GlobalStatics_9.viewImageProducer.draw(0, 0, graphics, 0);
        } catch (Exception var9) {
          GlobalStatics_8.GAME_CANVAS.repaint();
        }
      }
    } else {
      GlobalStatics_9.method1282(var4, (byte) -97, var5, var7, var6);
    }
  }

  public static void method165(int var0) {
    DummyClass53.aClass3_Sub28_Sub16_1339 = null;
    GlobalStatics_10.aClass3_Sub28_Sub16_3099 = null;
    GameStringStatics.aClass3_Sub28_Sub16_824 = null;
    if (var0 != -7878) {
      GlobalStatics_3.drawLoadingBox(null, false);
    }

    DummyClass58.aClass3_Sub28_Sub16_1457 = null;
    GlobalStatics_9.aClass3_Sub28_Sub16_2560 = null;
  }

  public static void method1595() {
    GlobalStatics_3.aShortArray1397 = null;
    GlobalStatics_3.aShortArray1394 = null;
    GlobalStatics_3.aShortArray1391 = null;
    GlobalStatics_3.aShortArray1390 = null;
    GlobalStatics_3.aShortArray1392 = null;
    GlobalStatics_3.aByteArray1389 = null;
  }

  public static void method380(int var0) {
    GlobalStatics_3.loadingText = null;
    if (var0 != -29113) {
      GlobalStatics_3.method381(false);
    }

    GlobalStatics_3.aClass94_2458 = null;
    GlobalStatics_3.aClass94_2465 = null;
    GlobalStatics_3.aClass94_2461 = null;
  }

  public static void method381(boolean var0) {
    if (GlobalStatics_9.anInt3655 != -1) {
      GlobalStatics_9.method1160(-120, GlobalStatics_9.anInt3655);
    }

    for (int var1 = 0; var1 < GlobalStatics_9.widgetQuads; ++var1) {
      if (GlobalStatics_9.aBooleanArray3674[var1]) {
        DummyClass9.aBooleanArray4008[var1] = true;
      }

      GlobalStatics_0.aBooleanArray1712[var1] = GlobalStatics_9.aBooleanArray3674[var1];
      GlobalStatics_9.aBooleanArray3674[var1] = false;
    }

    DummyClass41.anInt865 = -1;
    DummyClass54.aClass11_1402 = null;
    GlobalStatics_9.anInt2535 = GlobalStatics_4.updateCycle;
    if (GlRenderer.USE_OPENGL) {
      GlobalStatics_11.aBoolean47 = true;
    }

    GlobalStatics_2.anInt2567 = -1;
    if (!var0) {
      GlobalStatics_3.method380(-78);
    }

    if (GlobalStatics_9.anInt3655 != -1) {
      GlobalStatics_9.widgetQuads = 0;
      GlobalStatics_10.method841(true);
    }

    if (GlRenderer.USE_OPENGL) {
      GlUtils.resetClip();
    } else {
      DummyClass47.method1331();
    }

    GlobalStatics_7.loopCycle = 0;
  }

  public static SomethingGl0 method2052(HashTable var0, boolean var1,
      FloorOverlay var2) {
    long var3 =
        ((var2.anInt2095 + 1 << 16) + var2.anInt2090) + ((long) var2.anInt2100
            << 56) + (
            (long) var2.anInt2094 << 32);
    if (var1) {
      GlobalStatics_3.aClass94_1863 = null;
    }

    SomethingGl0 var5 = (SomethingGl0) var0.get(var3);
    if (var5 == null) {
      var5 =
          new SomethingGl0(var2.anInt2095, var2.anInt2090, true, false,
              var2.anInt2094);
      var0.put(var3, var5);
    }

    return var5;
  }

  public static void clear37(byte var0) {
    GlobalStatics_3.aClass25Array1868 = null;
    GlobalStatics_3.logoSprite = null;
    GlobalStatics_3.animationSequences = null;
    GlobalStatics_3.aClass153_1852 = null;

    GlobalStatics_3.aClass94_1863 = null;
    GlobalStatics_3.anIntArray1871 = null;
  }

  public static void method2061(boolean var0) {
    GlobalStatics_9.anInt2556 = 0;
    GlobalStatics_9.aBoolean2774 = true;
    GlobalStatics_1.aLong1465 = 0L;
    GlobalStatics_9.anInt1060 = 0;
    GlobalStatics_6.anInt3613 = 0;
    DummyClass52.anInt1172 = 0;
    GlobalStatics_9.anInt969 = 0;
    GlobalStatics_9.anInt903 = 0;
    GlobalStatics_9.anInt1361 = 0;
    GlobalStatics_9.anInt3677 = 0;
    GlobalStatics_8.anInt2 = 0;
    DummyClass50.anInt1141 = 0;
    GlobalStatics_6.anInt2500 = 0;
    GlobalStatics_10.anInt3199 = 0;
    GlobalStatics_9.anInt3569 = 0;
    GlobalStatics_9.anInt3248 = 0;
    GlobalStatics_10.anInt3090 = 0;
    DummyClass32.anInt513 = 0;
    GlobalStatics_9.anInt1330 = 0;
    DummyClass14.anInt1956 = 0;
    GlobalStatics_9.anInt3136 = 0;
    GlobalStatics_0.anInt16 = 0;
    GlobalStatics_7.anInt4054 = 0;
    GlobalStatics_9.anInt1677 = 0;
    GlobalStatics_4.anInt1240 = 0;
    GlobalStatics_0.anInt19 = 0;
    GlobalStatics_4.anInt3630 = 0;
    GlobalStatics_1.anInt3187 = 0;
    GlobalStatics_9.anInt2541 = 0;
    GlobalStatics_0.anInt937 = 0;
    GlobalStatics_7.anInt1307 = 0;
    GlobalStatics_7.anInt880 = 0;
    GlobalStatics_10.anInt3259 = 0;
    GlobalStatics_7.anInt2437 = 0;
    GlobalStatics_7.anInt2165 = 0;
    GlobalStatics_10.anInt3151 = 0;
    DummyClass52.anInt1170 = 0;
    GlobalStatics_8.anInt1405 = 0;
    GlobalStatics_7.anInt3659 = 0;
    GlobalStatics_9.anInt900 = 0;
    GlobalStatics_10.anInt2204 = 0;
    DummyClass18.anInt79 = 0;
    GlobalStatics_0.anInt1701 = 0;
    GlobalStatics_9.anInt3365 = 0;
    GlobalStatics_6.anInt1886 = 0;
    GlobalStatics_9.anInt3442 = 0;
    GlobalStatics_9.anInt2081 = 0;
    GLStatics.anInt715 = 0;
    GlobalStatics_0.anInt2145 = 0;
    GlobalStatics_6.anInt3609 = 0;
    GlobalStatics_9.anInt2540 = 0;
    GlobalStatics_10.anInt3402 = 0;
    GlobalStatics_9.anInt3439 = 0;
    DummyClass59.anInt674 = 0;
    DummyClass10.anInt2085 = 0;
    GlobalStatics_9.anInt1910 = 0;
    GlobalStatics_10.anInt3144 = 0;
    GlobalStatics_0.anInt17 = 0;
    GlobalStatics_7.anInt1633 = 0;
    GlobalStatics_2.anInt342 = 0;
    DummyClass15.anInt1873 = 0;
    GlobalStatics_9.anInt2651 = 0;
    GlobalStatics_9.anInt1909 = 0;
    GlobalStatics_9.anInt1776 = 0;
    DummyClass30.anInt456 = 0;
    GlobalStatics_9.anInt2290 = 0;
    DummyClass4.anInt3001 = 0;
    GlobalStatics_3.anInt1858 = 0;
    GlobalStatics_9.anInt4065 = 0;
    GlobalStatics_0.anInt938 = 0;
    GlobalStatics_4.anInt421 = 0;
    GlobalStatics_11.anInt763 = 0;
    GlobalStatics_9.anInt1906 = 0;
    GlobalStatics_2.anInt348 = 0;
    GlobalStatics_9.anInt876 = 0;
    DummyClass42.anInt889 = 0;
    GlobalStatics_9.anInt2337 = 0;
    GlobalStatics_7.anInt1439 = 0;
    GlobalStatics_6.anInt2479 = 0;
    GlobalStatics_9.anInt2534 = 0;
    GlobalStatics_10.anInt1896 = 0;
    GlobalStatics_5.anInt1623 = 0;
    DummyClass11.anInt2037 = 0;
    DummyClass24.anInt1657 = 0;
    DummyClass52.anInt1166 = 0;
    GlobalStatics_10.anInt3255 = 0;
    DummyClass9.anInt4011 = 0;
    GlobalStatics_8.anInt27 = 0;
    GlobalStatics_9.anInt2640 = 0;
    GlobalStatics_6.anInt1883 = 0;
    GlobalStatics_9.anInt3277 = 0;
    GlobalStatics_9.anInt3459 = 0;
    GlobalStatics_10.anInt3122 = 0;
    GlobalStatics_9.anInt2684 = 0;
    DummyClass28.anInt336 = 0;
    DummyClass29.anInt437 = 0;
    GlobalStatics_9.anInt994 = 0;
    GlobalStatics_9.anInt3618 = 0;
    DummyClass37.anInt671 = 0;
    GlobalStatics_9.anInt2901 = 0;
    GlobalStatics_9.anInt1756 = 0;
    GlobalStatics_9.anInt3670 = 0;
    GlobalStatics_10.anInt3420 = 0;
    GlobalStatics_9.anInt2770 = 0;
    DummyClass25.anInt1629 = 0;
    GlobalStatics_9.anInt544 = 0;
    GlobalStatics_3.anInt1853 = 0;
    GlobalStatics_9.anInt3615 = 0;
    GlobalStatics_8.anInt1944 = 0;
    GlobalStatics_9.anInt2059 = 0;
    GlobalStatics_2.anInt2571 = 0;
    GlobalStatics_9.anInt503 = 0;
    GlobalStatics_9.anInt3267 = 0;
    GlobalStatics_9.anInt3542 = 0;
    GlobalStatics_9.anInt494 = 0;
    GlobalStatics_9.anInt3017 = 0;
    GlobalStatics_9.anInt816 = 0;
    GlobalStatics_0.anInt18 = 0;
    GlobalStatics_9.anInt562 = 0;
    GlobalStatics_9.anInt3640 = 0;
    GlobalStatics_4.anInt3627 = 0;
    GlobalStatics_9.anInt2549 = 0;
    GlobalStatics_11.anInt759 = 0;
    GlobalStatics_9.anInt2130 = 0;
    GlobalStatics_7.anInt685 = 0;
    GlobalStatics_10.anInt3205 = 0;
    DummyClass1.anInt411 = 0;
    GlobalStatics_9.anInt555 = 0;
    DummyClass30.anInt452 = 0;
    GlobalStatics_3.anInt2459 = 0;
    GlobalStatics_2.anInt349 = 0;
    DummyClass20.anInt1781 = 0;
    GlobalStatics_6.anInt3681 = 0;
    GlobalStatics_6.anInt3517 = 0;
    GlobalStatics_0.anInt2592 = 0;
    GlobalStatics_8.anInt2088 = 0;
    GlobalStatics_10.anInt3084 = 0;
    GlobalStatics_7.aClass67_1443.anInt1018 = 0;
    GlobalStatics_10.FOCUSED = true;
    GlobalStatics_3.method153(112);
    GlobalStatics_9.lastPacketId2 = -1;
    GlobalStatics_7.lastPacketId1 = -1;
    GlobalStatics_0.packetId = -1;
    DummyClass13.anInt2023 = 0;
    DummyClass36.updateTime = 0;
    GlobalStatics_9.secureBuffer.position = 0;
    GlobalStatics_0.lastPacketId0 = -1;
    GlobalStatics_2.anInt3699 = 0;
    GlobalStatics_9.GAME_BUFFER.position = 0;

    int var1;
    for (var1 = 0; var1 < GlobalStatics_8.aClass96Array2114.length; ++var1) {
      GlobalStatics_8.aClass96Array2114[var1] = null;
    }

    GlobalStatics_10.amountContextActions = 0;
    DummyClass36.aBoolean2615 = false;
    DummyClass30.method940(119, 0);

    for (var1 = 0; var1 < 100; ++var1) {
      GlobalStatics_0.aClass94Array2580[var1] = null;
    }

    GlobalStatics_9.anInt3012 = 0;
    GlobalStatics_10.anInt3216 = (int) (Math.random() * 100.0D) - 50;
    DummyClass38.anInt733 = 0;
    GlobalStatics_9.NEXT_CAMERA_YAW = 2047 & (int) (Math.random() * 20.0D) - 10;
    DummyClass43.anInt909 = -1;
    DummyClass13.anInt2022 = 0;
    DummyClass12.minimapMode = 0;
    GlobalStatics_2.anInt42 = (int) (110.0D * Math.random()) - 55;
    GlobalStatics_9.aBoolean1837 = false;
    GlobalStatics_9.anInt3020 = -20 + (int) (30.0D * Math.random());
    GlobalStatics_9.anInt1552 = 0;
    DummyClass45.anInt987 = 0;
    GlobalStatics_9.anInt3102 = -60 + (int) (Math.random() * 120.0D);
    GlobalStatics_10.anInt3114 = 0;
    GlobalStatics_0.anInt2589 = (int) (80.0D * Math.random()) - 40;
    DummyClass6.anInt2046 = 0;

    for (var1 = 0; var1 < 2048; ++var1) {
      GlobalStatics_9.players[var1] = null;
      DummyClass45.configs[var1] = null;
    }

    for (var1 = 0; var1 < 0x8000; ++var1) {
      GlobalStatics_8.NPCS[var1] = null;
    }

    GlobalStatics_9.localPlayer = GlobalStatics_9.players[2047] = new Player();
    GlobalStatics_9.projectiles.clear(-112);
    GlobalStatics_1.stillGraphics.clear(-58);
    if (GlobalStatics_9.groundItems != null) {
      for (var1 = 0; var1 < 4; ++var1) {
        for (int var2 = 0; var2 < 104; ++var2) {
          for (int var3 = 0; var3 < 104; ++var3) {
            GlobalStatics_9.groundItems[var1][var2][var3] = null;
          }
        }
      }
    }

    GlobalStatics_10.aClass61_3075 = new Deque();
    GlobalStatics_9.anInt1357 = 0;
    GlobalStatics_10.anInt104 = 0;
    GlobalStatics_9.resetVariables(-114);
    GlobalStatics_2.method103((byte) 24);
    GlobalStatics_3.anInt1105 = 0;
    DummyClass8.anInt4014 = 0;
    GlobalStatics_9.anInt1996 = 0;
    GlobalStatics_10.anInt3414 = 0;
    GlobalStatics_5.anInt1904 = 0;
    GlobalStatics_8.anInt30 = 0;
    GlobalStatics_9.anInt529 = 0;
    GlobalStatics_9.anInt1923 = 0;
    GlobalStatics_4.anInt3631 = 0;
    DummyClass8.anInt4021 = 0;

    for (var1 = 0; GlobalStatics_9.anIntArray1277.length > var1; ++var1) {
      GlobalStatics_9.anIntArray1277[var1] = -1;
    }

    if (GlobalStatics_9.anInt3655 != -1) {
      DummyClass44.method1208((byte) -128, GlobalStatics_9.anInt3655);
    }

    for (SomethingPacket151 var7 =
        (SomethingPacket151) GlobalStatics_10.aClass130_3208.getFirst(82);
        var7 != null;
        var7 = (SomethingPacket151) GlobalStatics_10.aClass130_3208
            .getNext(-104)) {
      GlobalStatics_10.method254(true, var7, false);
    }

    GlobalStatics_9.anInt3655 = -1;
    GlobalStatics_10.aClass130_3208 = new HashTable(8);
    GlobalStatics_10.method122(-113);
    GlobalStatics_10.aClass11_3087 = null;
    DummyClass36.aBoolean2615 = false;
    GlobalStatics_10.amountContextActions = 0;
    DummyClass49.aClass52_1112
        .update(new int[]{0, 0, 0, 0, 0}, -1, false, 0, null, -1);

    for (var1 = 0; var1 < 8; ++var1) {
      GlobalStatics_7.playerOptions[var1] = null;
      DummyClass3.aBooleanArray54[var1] = false;
      GlobalStatics_10.anIntArray3328[var1] = -1;
    }

    GlobalStatics_9.method580((byte) 80);
    GlobalStatics_10.aBoolean3064 = true;

    for (var1 = 0; var1 < 100; ++var1) {
      GlobalStatics_9.aBooleanArray3674[var1] = true;
    }

    GlobalStatics_2.anInt2572 = 0;
    GlobalStatics_6.aClass3_Sub19Array3694 = null;
    GameStringStatics.aClass94_251 = null;

    for (var1 = 0; var1 < 6; ++var1) {
      GlobalStatics_10.aClass133Array3393[var1] = new SomethingPacket116();
    }

    for (var1 = 0; var1 < 25; ++var1) {
      GlobalStatics_1.anIntArray3185[var1] = 0;
      GlobalStatics_10.anIntArray2480[var1] = 0;
      GlobalStatics_9.anIntArray1743[var1] = 0;
    }

    if (GlRenderer.USE_OPENGL) {
      GlobalStatics_10.method236((byte) 64);
    }

    GlobalStatics_9.aBoolean4068 = var0;
    GlobalStatics_9.interfaceCounter = 0;
    GameStringStatics.walkTooltip = DummyClass42.DEFAULT_WALK_TOOLTIP;
    GlobalStatics_7.aBoolean1084 = false;
    GlobalStatics_10.aShortArray3455 = GlobalStatics_10.aShortArray3110 =
        GlobalStatics_9.aShortArray1779 = GlobalStatics_10.aShortArray3453 = new short[256];
    GlobalStatics_3.method165(-7878);
    GlobalStatics_8.aBoolean1951 = false;
    GlobalStatics_9.method204(-3);
  }

  public static void method2166() {
    GlobalStatics_3.anInterface1_2970 = null;
  }

  public static void method704(int[] var0, byte[] var1, int var2, int var3,
      int var4,
      int var5, int var6, int var7, int var8) {
    int var9 = -(var5 >> 2);
    var5 = -(var5 & 3);

    for (int var10 = -var6; var10 < 0; ++var10) {
      int var11;
      for (var11 = var9; var11 < 0; ++var11) {
        if (var1[var3++] == 0) {
          ++var4;
        } else {
          var0[var4++] = var2;
        }

        if (var1[var3++] == 0) {
          ++var4;
        } else {
          var0[var4++] = var2;
        }

        if (var1[var3++] == 0) {
          ++var4;
        } else {
          var0[var4++] = var2;
        }

        if (var1[var3++] == 0) {
          ++var4;
        } else {
          var0[var4++] = var2;
        }
      }

      for (var11 = var5; var11 < 0; ++var11) {
        if (var1[var3++] == 0) {
          ++var4;
        } else {
          var0[var4++] = var2;
        }
      }

      var4 += var7;
      var3 += var8;
    }

  }

  public static void method705(int[] var0, byte[] var1, int var2, int var3,
      int var4,
      int var5, int var6, int var7, int var8, int var9, int var10,
      int[] var11, int[] var12) {
    int var13 = var2 - SoftwareIndexedColorSpriteStatics.anInt1093;
    int var14 = var3 - SoftwareIndexedColorSpriteStatics.anInt1095;

    for (int var15 = var14; var15 < var14 + var5; ++var15) {
      int var16 = var11[var15];
      int var17 = var12[var15];
      int var18 = var4;
      int var19;
      if (var13 > var16) {
        var19 = var13 - var16;
        if (var19 >= var17) {
          var7 += var4 + var10;
          var8 += var4 + var9;
          continue;
        }

        var17 -= var19;
      } else {
        var19 = var16 - var13;
        if (var19 >= var4) {
          var7 += var4 + var10;
          var8 += var4 + var9;
          continue;
        }

        var7 += var19;
        var18 = var4 - var19;
        var8 += var19;
      }

      var19 = 0;
      if (var18 < var17) {
        var17 = var18;
      } else {
        var19 = var18 - var17;
      }

      for (int var20 = -var17; var20 < 0; ++var20) {
        if (var1[var7++] == 0) {
          ++var8;
        } else {
          SoftwareIndexedColorSpriteStatics.anIntArray1100[var8++] = var6;
        }
      }

      var7 += var19 + var10;
      var8 += var19 + var9;
    }

  }

  public static void method706(int[] var0, byte[] var1, int var2, int var3,
      int var4,
      int var5, int var6, int var7, int var8, int var9) {
    var2 = ((var2 & 16711935) * var9 & -16711936) + ((var2 & 0xff00) * var9
        & 16711680) >> 8;
    var9 = 256 - var9;

    for (int var10 = -var6; var10 < 0; ++var10) {
      for (int var11 = -var5; var11 < 0; ++var11) {
        if (var1[var3++] == 0) {
          ++var4;
        } else {
          int var12 = var0[var4];
          var0[var4++] =
              (((var12 & 16711935) * var9 & -16711936) + (
                  (var12 & 0xff00) * var9 & 16711680) >> 8)
                  + var2;
        }
      }

      var4 += var7;
      var3 += var8;
    }

  }
}
