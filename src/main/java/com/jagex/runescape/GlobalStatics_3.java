package com.jagex.runescape;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.common.HashTable;
import com.jagex.runescape.done.AbstractFont;
import com.jagex.runescape.done.AnimationSomething;
import com.jagex.runescape.node.Deque;
import com.jagex.runescape.opengl.*;
import com.jagex.runescape.sprite.AbstractIndexedColorSprite;

import java.awt.*;

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
    public static GameString COMMAND_SHIFT_CLICK = GameStringStatics.create("::shiftclick");
    public static int anInt2383;
    public static int anInt2384;
    public static GameString COMMAND_REPLACE_CANVAS = GameStringStatics.create("::replacecanvas");
    public static int[] anIntArray2386 = {1, -1, -1, 1};
    public static byte[] aByteArray1389 = new byte[500];
    public static short[] aShortArray1390 = new short[500];
    public static short[] aShortArray1391 = new short[500];
    public static short[] aShortArray1392 = new short[500];
    public static short[] aShortArray1394 = new short[500];
    public static short[] aShortArray1397 = new short[500];
    public static GameString aClass94_2465 = GameStringStatics.create("");
    public static GameString loadingText = aClass94_2465;
    public static float aFloat2457;
    public static GameString aClass94_2458 = GameStringStatics.create("Module texte charg-B");
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

    public static void method1334(byte var0) {
      OBJECT_TYPES = null;
        aClass3_Sub28_Sub5Array1103 = null;
    }

    public static SceneSomething method1336(int var0, int var1, int var2) {
      SceneGraphTile var3 = GLStatics.sceneGraphTiles[var0][var1][var2];
      if (var3 == null) {
        return null;
      } else {
        for (int var4 = 0; var4 < var3.anInt2223; ++var4) {
          SceneSomething var5 = var3.sceneGraphNodes[var4];
          if ((var5.aLong498 >> 29 & 3L) == 2L && var5.anInt483 == var1 && var5.anInt478 == var2) {
            return var5;
          }
        }

        return null;
      }
    }

    public static int method1338(int var0, int var1) {
      if (var1 <= 13) {
          OBJECT_TYPES = null;
        }

        return 255 & var0;
    }

    public static void method1339(GameString var0, int var1) {
      if (var1 == 0) {
          for (SomethingWorldMapy var2 = (SomethingWorldMapy) DummyClass21.aClass61_1758.getFirst();
               var2 != null; var2 = (SomethingWorldMapy) DummyClass21.aClass61_1758.getNext()) {
            if (var2.aClass94_3561.method1528((byte) -42, var0)) {
              GlobalStatics_0.aClass3_Sub28_Sub3_2600 = var2;
              return;
            }
          }

        }
    }

    public static void method1340(int var0, int var1, byte var2, int var3, int var4) {
      if (var2 != -40) {
          anInt1105 = 43;
        }

        for (int var5 = 0; SomethingWorldMapy.widgetQuads > var5; ++var5) {
          if ((GlTexture2d.quadx1[var5] + GlobalStatics_5.quadx0[var5]) > var0
            && (var1 + var0) > GlobalStatics_5.quadx0[var5] && (var3 < (
            Mobile.quady1[var5] + Player.quady0[var5])) && Player.quady0[var5] < var3 + var4) {
            GroundItemNode.aBooleanArray3674[var5] = true;
          }
        }
    }

    public static void method153(int var0) {
      if (var0 >= 91) {
          MonoChromaticImageBuffer.aClass61_2557 = new Deque();
        }
    }

    public static void method156(int var0) {
      if (var0 != 2) {
          method153(18);
        }

        anIntArray2386 = null;
        COMMAND_REPLACE_CANVAS = null;
        COMMAND_SHIFT_CLICK = null;
        aClass3_Sub28_Sub17_2379 = null;
    }

    public static SoftwareFont method163(byte[] var0, int var1) {
      if (var0 == null) {
          return null;
        } else {
          if (var1 != 25208) {
            anInt2378 = 5;
          }

          SoftwareFont var2 =
            new SoftwareFont(var0, Something3dRoot.anIntArray2048, GlobalStatics_0.anIntArray2591,
              GroundItem.anIntArray2931, TextureSampler26.anIntArray3076,
              DummyClass5.aByteArrayArray2987);
          DummyClass37.method1035((byte) 126);
          return var2;
        }
    }

    public static void drawLoadingBox(GameString text, boolean draw) {
      byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = SomethingTilek.p12Font.method680(text, 250);
        int var7 = SomethingTilek.p12Font.method684(text, 250) * 13;
        if (GlRenderer.useOpenGlRenderer) {
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

        SomethingTilek.p12Font.draw(text, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        method1340(var4 - var3, var6 + (var3 + var3), (byte) -40,
          -var3 + var5, var3 + var7 + var3);
        if (draw) {
          if (GlRenderer.useOpenGlRenderer) {
            GlRenderer.swapBuffers();
          } else {
            try {
              Graphics graphics = GameCanvas.INSTANCE.getGraphics();
              Something3d.viewImageProducer.draw(0, 0, graphics, 0);
            } catch (Exception var9) {
              GameCanvas.INSTANCE.repaint();
            }
          }
        } else {
          LinearHashTable.method1282(var4, (byte) -97, var5, var7, var6);
        }
    }

    public static void method165(int var0) {
      DummyClass53.aClass3_Sub28_Sub16_1339 = null;
        TextureSampler27.aClass3_Sub28_Sub16_3099 = null;
        GlobalStatics_4.aClass3_Sub28_Sub16_824 = null;
        if (var0 != -7878) {
          drawLoadingBox(null, false);
        }

        DummyClass58.aClass3_Sub28_Sub16_1457 = null;
        MonoChromaticImageBuffer.aClass3_Sub28_Sub16_2560 = null;
    }

    public static void method1595() {
      aShortArray1397 = null;
      aShortArray1394 = null;
      aShortArray1391 = null;
      aShortArray1390 = null;
      aShortArray1392 = null;
      aByteArray1389 = null;
    }

    public static void method380(int var0) {
      loadingText = null;
        if (var0 != -29113) {
          method381(false);
        }

        aClass94_2458 = null;
        aClass94_2465 = null;
        aClass94_2461 = null;
    }

    public static void method381(boolean var0) {
      if ((InventoryConfig.anInt3655 != -1)) {
          PlayerAppearance.method1160(-120, InventoryConfig.anInt3655);
        }

        for (int var1 = 0; var1 < SomethingWorldMapy.widgetQuads; ++var1) {
          if (GroundItemNode.aBooleanArray3674[var1]) {
            DummyClass9.aBooleanArray4008[var1] = true;
          }

          GlobalStatics_0.aBooleanArray1712[var1] = GroundItemNode.aBooleanArray3674[var1];
          GroundItemNode.aBooleanArray3674[var1] = false;
        }

        DummyClass41.anInt865 = -1;
        DummyClass54.aClass11_1402 = null;
        SomethingOtherWorldMap.anInt2535 = GlobalStatics_4.updateCycle;
        if (GlRenderer.useOpenGlRenderer) {
          DummyOutputStream.aBoolean47 = true;
        }

        GlobalStatics_2.anInt2567 = -1;
        if (!var0) {
          method380(-78);
        }

        if ((InventoryConfig.anInt3655 != -1)) {
          SomethingWorldMapy.widgetQuads = 0;
          FileSystem.method841(true);
        }

        if (GlRenderer.useOpenGlRenderer) {
          GlUtils.resetClip();
        } else {
          DummyClass47.method1331();
        }

        GlobalStatics_7.loopCycle = 0;
    }

    public static SomethingGl0 method2052(HashTable var0, boolean var1, FloorOverlay var2) {
      long var3 =
          ((var2.anInt2095 + 1 << 16) + var2.anInt2090) + (((long) var2.anInt2100 << 56) + (
            (long) var2.anInt2094 << 32));
        if (var1) {
          aClass94_1863 = null;
        }

        SomethingGl0 var5 = (SomethingGl0) var0.get(var3);
        if (var5 == null) {
          var5 =
            new SomethingGl0(var2.anInt2095, var2.anInt2090, true, false, var2.anInt2094);
          var0.put(var3, var5);
        }

        return var5;
    }

    public static void method2057(byte var0) {
      aClass25Array1868 = null;
        logoSprite = null;
        animationSequences = null;
        aClass153_1852 = null;

        aClass94_1863 = null;
        anIntArray1871 = null;
    }

    public static void method2061(boolean var0) {
      MonoChromaticImageBuffer.anInt2556 = 0;
        Mobile.aBoolean2774 = true;
        GlobalStatics_1.aLong1465 = 0L;
        SceneSomething2.anInt1060 = 0;
        GlobalStatics_6.anInt3613 = 0;
        DummyClass52.anInt1172 = 0;
        ISAACCipher.anInt969 = 0;
        LightIntensity.anInt903 = 0;
        HintMarker.anInt1361 = 0;
        GroundItemNode.anInt3677 = 0;
        GameStub.anInt2 = 0;
        DummyClass50.anInt1141 = 0;
        GlobalStatics_6.anInt2500 = 0;
        TextureSampler15.anInt3199 = 0;
        SomethingQuickChat.anInt3569 = 0;
        TextureSampler11.anInt3248 = 0;
        TextureSampler27.anInt3090 = 0;
        DummyClass32.anInt513 = 0;
        ObjectCache.anInt1330 = 0;
        DummyClass14.anInt1956 = 0;
        TextureSampler1.anInt3136 = 0;
        DummyCanvas.anInt16 = 0;
        GlobalStatics_7.anInt4054 = 0;
        SomethingTilek.anInt1677 = 0;
        SocketStream.anInt1240 = 0;
        DummyCanvas.anInt19 = 0;
        GlobalStatics_4.anInt3630 = 0;
        TextureSampler17.anInt3187 = 0;
        SomethingOtherWorldMap.anInt2541 = 0;
        GlobalStatics_0.anInt937 = 0;
        GlobalStatics_7.anInt1307 = 0;
        GlobalStatics_7.anInt880 = 0;
        TextureSampler37.anInt3259 = 0;
        GlobalStatics_7.anInt2437 = 0;
        GlobalStatics_7.anInt2165 = 0;
        TextureSampler20.anInt3151 = 0;
        DummyClass52.anInt1170 = 0;
        FloorUnderlay.anInt1405 = 0;
        GlobalStatics_7.anInt3659 = 0;
        LightIntensity.anInt900 = 0;
        WidgetAccess.anInt2204 = 0;
        DummyClass18.anInt79 = 0;
        GlobalStatics_0.anInt1701 = 0;
        TextureSampler13.anInt3365 = 0;
        GlobalStatics_6.anInt1886 = 0;
        TextureSampler10.anInt3442 = 0;
        SomethingIndex150.anInt2081 = 0;
        GLStatics.anInt715 = 0;
        GlobalStatics_0.anInt2145 = 0;
        GlobalStatics_6.anInt3609 = 0;
        SomethingOtherWorldMap.anInt2540 = 0;
        TextureSampler25.anInt3402 = 0;
        TextureSampler10.anInt3439 = 0;
        DummyClass59.anInt674 = 0;
        DummyClass10.anInt2085 = 0;
        Keyboard.anInt1910 = 0;
        TextureSampler24.anInt3144 = 0;
        DummyCanvas.anInt17 = 0;
        GlobalStatics_7.anInt1633 = 0;
        GlobalStatics_2.anInt342 = 0;
        DummyClass15.anInt1873 = 0;
        SomethingTexture3.anInt2651 = 0;
        Keyboard.anInt1909 = 0;
        SceneShadowMap.anInt1776 = 0;
        DummyClass30.anInt456 = 0;
        SomethingMidiFile.anInt2290 = 0;
        DummyClass4.anInt3001 = 0;
        anInt1858 = 0;
        OndemandFileRequest.anInt4065 = 0;
        GlobalStatics_0.anInt938 = 0;
        SomethingSceneI.anInt421 = 0;
        ItemConfig.anInt763 = 0;
        Keyboard.anInt1906 = 0;
        GlobalStatics_2.anInt348 = 0;
        ScriptState.anInt876 = 0;
        DummyClass42.anInt889 = 0;
        StringNode0.anInt2337 = 0;
        GlobalStatics_7.anInt1439 = 0;
        GlobalStatics_6.anInt2479 = 0;
        SomethingOtherWorldMap.anInt2534 = 0;
        Unsure.anInt1896 = 0;
        GlobalStatics_5.anInt1623 = 0;
        DummyClass11.anInt2037 = 0;
        DummyClass24.anInt1657 = 0;
        DummyClass52.anInt1166 = 0;
        TextureSampler37.anInt3255 = 0;
        DummyClass9.anInt4011 = 0;
        GameCanvas.anInt27 = 0;
        SomethingTexture1.anInt2640 = 0;
        GlobalStatics_6.anInt1883 = 0;
        TextureSampler0.anInt3277 = 0;
        TextureSampler8.anInt3459 = 0;
        TextureSampler30.anInt3122 = 0;
        MilliFrameRegulator.anInt2684 = 0;
        DummyClass28.anInt336 = 0;
        DummyClass29.anInt437 = 0;
        OndemandRequester.anInt994 = 0;
        Parameter.anInt3618 = 0;
        DummyClass37.anInt671 = 0;
        Projectile.anInt2901 = 0;
        SomethingPacket116.anInt1756 = 0;
        GroundItemNode.anInt3670 = 0;
        TextureSampler22.anInt3420 = 0;
        Mobile.anInt2770 = 0;
        DummyClass25.anInt1629 = 0;
        SpotAnimationConfig.anInt544 = 0;
        anInt1853 = 0;
        Parameter.anInt3615 = 0;
        FileUnpacker.anInt1944 = 0;
        Something3dRoot.anInt2059 = 0;
        GlobalStatics_2.anInt2571 = 0;
        GameWorldSomething.anInt503 = 0;
        TextureSampler0.anInt3267 = 0;
        StillGraphicNode.anInt3542 = 0;
        SceneSomething.anInt494 = 0;
        Something3d.anInt3017 = 0;
        GZipDecompressor.anInt816 = 0;
        DummyCanvas.anInt18 = 0;
        PlayerVariable.anInt562 = 0;
        Structure.anInt3640 = 0;
        GlobalStatics_4.anInt3627 = 0;
        Inventory.anInt2549 = 0;
        ItemConfig.anInt759 = 0;
        TextureCache.anInt2130 = 0;
        GlobalStatics_7.anInt685 = 0;
        TextureSampler15.anInt3205 = 0;
        DummyClass1.anInt411 = 0;
        PlayerVariable.anInt555 = 0;
        DummyClass30.anInt452 = 0;
        anInt2459 = 0;
        GlobalStatics_2.anInt349 = 0;
        DummyClass20.anInt1781 = 0;
        GlobalStatics_6.anInt3681 = 0;
        GlobalStatics_6.anInt3517 = 0;
        GlobalStatics_0.anInt2592 = 0;
        FloorOverlay.anInt2088 = 0;
        TextureSampler26.anInt3084 = 0;
        GlobalStatics_7.aClass67_1443.anInt1018 = 0;
        TextureSampler26.focused = true;
        method153(112);
        IdentityKit.lastPacketId2 = -1;
        GlobalStatics_7.lastPacketId1 = -1;
        GlobalStatics_0.packetId = -1;
        DummyClass13.anInt2023 = 0;
        DummyClass36.updateTime = 0;
        TextureSampler12.secureBuffer.position = 0;
        GlobalStatics_0.lastPacketId0 = -1;
        GlobalStatics_2.anInt3699 = 0;
        SpotAnimationConfig.gameBuffer.position = 0;

        int var1;
        for (var1 = 0; (var1 < GameException.aClass96Array2114.length); ++var1) {
          GameException.aClass96Array2114[var1] = null;
        }

        TextureSampler25.amountContextActions = 0;
        DummyClass36.aBoolean2615 = false;
        DummyClass30.method940(119, 0);

        for (var1 = 0; (var1 < 100); ++var1) {
          GlobalStatics_0.aClass94Array2580[var1] = null;
        }

        Something3d.anInt3012 = 0;
        TextureSampler19.anInt3216 = (int) (Math.random() * 100.0D) - 50;
        DummyClass38.anInt733 = 0;
        SpotAnimationConfig.anInt531 = 2047 & (int) (Math.random() * 20.0D) - 10;
        DummyClass43.anInt909 = -1;
        DummyClass13.anInt2022 = 0;
        DummyClass12.minimapMode = 0;
        GlobalStatics_2.anInt42 = (int) (110.0D * Math.random()) - 55;
        SceneNode.aBoolean1837 = false;
        Something3d2.anInt3020 = -20 + (int) (30.0D * Math.random());
        SomethingLight0.anInt1552 = 0;
        DummyClass45.anInt987 = 0;
        TextureSampler9.anInt3102 = -60 + (int) (Math.random() * 120.0D);
        TextureSampler16.anInt3114 = 0;
        GlobalStatics_0.anInt2589 = (int) (80.0D * Math.random()) - 40;
        DummyClass6.anInt2046 = 0;

        for (var1 = 0; var1 < 2048; ++var1) {
          TextureSampler0.players[var1] = null;
          DummyClass45.configs[var1] = null;
        }

        for (var1 = 0; var1 < '\u8000'; ++var1) {
          TextureSampler5.npcs[var1] = null;
        }

        TextureCache.localPlayer = TextureSampler0.players[2047] = new Player();
        TextureSampler13.projectiles.clear(-112);
        TextureSampler17.stillGraphics.clear(-58);
        if (TextureSampler0.groundItems != null) {
          for (var1 = 0; var1 < 4; ++var1) {
            for (int var2 = 0; (var2 < 104); ++var2) {
              for (int var3 = 0; (var3 < 104); ++var3) {
                TextureSampler0.groundItems[var1][var2][var3] = null;
              }
            }
          }
        }

        TextureSampler26.aClass61_3075 = new Deque();
        HintMarker.anInt1357 = 0;
        FileSystem.anInt104 = 0;
        TextureSampler6.resetVariables(-114);
        GlobalStatics_2.method103((byte) 24);
        anInt1105 = 0;
        DummyClass8.anInt4014 = 0;
        SomethingAudio.anInt1996 = 0;
        TextureSampler25.anInt3414 = 0;
        GlobalStatics_5.anInt1904 = 0;
        GameCanvas.anInt30 = 0;
        SpotAnimationConfig.anInt529 = 0;
        Mouse.anInt1923 = 0;
        GlobalStatics_4.anInt3631 = 0;
        DummyClass8.anInt4021 = 0;

        for (var1 = 0; NpcConfiguration.anIntArray1277.length > var1; ++var1) {
          NpcConfiguration.anIntArray1277[var1] = -1;
        }

        if ((InventoryConfig.anInt3655 != -1)) {
          DummyClass44.method1208((byte) -128, InventoryConfig.anInt3655);
        }

        for (SomethingPacket151 var7 =
             (SomethingPacket151) TextureSampler23.aClass130_3208.getFirst(82);
             var7 != null;
             var7 = (SomethingPacket151) TextureSampler23.aClass130_3208.getNext(-104)) {
          TextureSampler19.method254(true, var7, false);
        }

        InventoryConfig.anInt3655 = -1;
        TextureSampler23.aClass130_3208 = new HashTable(8);
        VariableUpdate.method122(-113);
        TextureSampler27.aClass11_3087 = null;
        DummyClass36.aBoolean2615 = false;
        TextureSampler25.amountContextActions = 0;
        DummyClass49.aClass52_1112.update(new int[] {0, 0, 0, 0, 0}, -1, false, 0, null, -1);

        for (var1 = 0; var1 < 8; ++var1) {
          GlobalStatics_7.playerOptions[var1] = null;
          DummyClass3.aBooleanArray54[var1] = false;
          TextureSampler35.anIntArray3328[var1] = -1;
        }

        Parameter.method580((byte) 80);
        TextureSampler34.aBoolean3064 = true;

        for (var1 = 0; var1 < 100; ++var1) {
          GroundItemNode.aBooleanArray3674[var1] = true;
        }

        GlobalStatics_2.anInt2572 = 0;
        GlobalStatics_6.aClass3_Sub19Array3694 = null;
        Widget.aClass94_251 = null;

        for (var1 = 0; var1 < 6; ++var1) {
          TextureSampler29.aClass133Array3393[var1] = new SomethingPacket116();
        }

        for (var1 = 0; (var1 < 25); ++var1) {
          TextureSampler17.anIntArray3185[var1] = 0;
          TriChromaticImageBuffer.anIntArray2480[var1] = 0;
          SomethingPacket116.anIntArray1743[var1] = 0;
        }

        if (GlRenderer.useOpenGlRenderer) {
          TextureSampler31.method236((byte) 64);
        }

        OndemandFileRequest.aBoolean4068 = var0;
        SomethingLight0.interfaceCounter = 0;
        TextureSampler32.walkTooltip = DummyClass42.DEFAULT_WALK_TOOLTIP;
        GlobalStatics_7.aBoolean1084 = false;
        TextureSampler38.aShortArray3455 = TextureSampler16.aShortArray3110 =
          SceneShadowMap.aShortArray1779 = TextureSampler38.aShortArray3453 = new short[256];
        method165(-7878);
        FileUnpacker.aBoolean1951 = false;
        TextureSampler9.method204(-3);
    }
}
