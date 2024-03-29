package com.jagex.runescape.statics;

import com.jagex.runescape.cache.FileUnpacker;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.model.GameWorldSomething;
import com.jagex.runescape.model.SomethingFont;
import com.jagex.runescape.model.WorldMapLabel;
import com.jagex.runescape.opengl.GlRenderer;
import java.awt.Component;
import java.awt.Insets;

public final class DummyClass25 {

  public static WorldMapLabel aClass131_1624;
  public static GameString aClass94_1625 = GameStringStatics
      .create("Memory before cleanup=");
  public static SomethingFont aClass33_1626;
  public static GameWorldSomething[] aClass26Array1627;
  public static FileUnpacker aClass153_1628;
  public static int anInt1629;
  public static GameString MEMORY_PREFIX = GameStringStatics.create("Mem:");

  public static void clear55(int var0) {
    DummyClass25.aClass33_1626 = null;
    DummyClass25.aClass131_1624 = null;
    DummyClass25.aClass26Array1627 = null;
    DummyClass25.MEMORY_PREFIX = null;
    DummyClass25.aClass153_1628 = null;
    DummyClass25.aClass94_1625 = null;
    if (var0 != -14256) {
      DummyClass25.clear55(46);
    }
  }

  public static void resizeCanvas() {
    Component var1 = null;
    if (GlobalStatics_10.fullScreenFrame == null) {
      if (GlobalStatics_10.FRAME != null) {
        var1 = GlobalStatics_10.FRAME;
      }
    } else {
      var1 = GlobalStatics_10.fullScreenFrame;
    }

    GlobalStatics_6.windowWidth = var1.getSize().width;
    GlobalStatics_9.windowHeight = var1.getSize().height;
    Insets var2;
    if (var1 == GlobalStatics_10.FRAME) {
      var2 = GlobalStatics_10.FRAME.getInsets();
      GlobalStatics_9.windowHeight -= var2.bottom + var2.top;
      GlobalStatics_6.windowWidth -= var2.right + var2.left;
    }

    if (GlobalStatics_9.getWindowMode() >= 2) {
      DummyClass30.viewWidth = GlobalStatics_6.windowWidth;
      DummyClass51.viewX = 0;
      GlobalStatics_7.viewY = 0;
      GlobalStatics_9.viewHeight = GlobalStatics_9.windowHeight;
    } else {
      GlobalStatics_7.viewY = 0;
      DummyClass51.viewX = (-765 + GlobalStatics_6.windowWidth) / 2;
      GlobalStatics_9.viewHeight = 503;
      DummyClass30.viewWidth = 765;
    }

    if (GlRenderer.USE_OPENGL) {
      GlRenderer.setViewportDimensions(DummyClass30.viewWidth,
          GlobalStatics_9.viewHeight);
    }

    GlobalStatics_8.GAME_CANVAS
        .setSize(DummyClass30.viewWidth, GlobalStatics_9.viewHeight);
    if (var1 == GlobalStatics_10.FRAME) {
      var2 = GlobalStatics_10.FRAME.getInsets();
      GlobalStatics_8.GAME_CANVAS.setLocation(var2.left + DummyClass51.viewX,
          GlobalStatics_7.viewY + var2.top);
    } else {
      GlobalStatics_8.GAME_CANVAS
          .setLocation(DummyClass51.viewX, GlobalStatics_7.viewY);
    }

    if (GlobalStatics_9.anInt3655 != -1) {
      DummyClass23.method1746(true);
    }

    GlobalStatics_9.method1396(-1);
  }

}
