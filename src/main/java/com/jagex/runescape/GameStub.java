package com.jagex.runescape;

import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.GlTexture2d;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public abstract class GameStub implements Runnable,
    FocusListener, WindowListener {

  private static GameString aClass94_5 =
      GameString.create(" from your ignore list first)3");
  public static int anInt12;
  public static boolean aBoolean13;
  public static int anInt2;
  public static int anInt3;
  public static boolean aBoolean6;
  public static GameString aClass94_7 = GameString
      .create(" s(West d-Bconnect-B)3");
  public static GameString aClass94_8 = GameString.create("");
  public static GameString aClass94_9 = GameString.create(")3)3)3");
  public static GameString COMMAND_RECTANGLE_DEBUG = GameString
      .create("::rect_debug");
  public static boolean aBoolean11;
  public static GameString aClass94_4 = GameStub.aClass94_5;
  private boolean encounteredError;

  public abstract void update();

  public final void focusGained(FocusEvent var1) {
    System.out.println("GameStub.focusGained");
    DummyClass8.focused = true;
    TextureSampler30.aBoolean3116 = true;
  }

  public final void focusLost(FocusEvent var1) {
    System.out.println("GameStub.focusLost");
    DummyClass8.focused = false;
  }

  public final boolean isValidHost() {
    return true;
  }

  public final void initializeCanvas() {
    if (GameCanvas.INSTANCE != null) {
      GameCanvas.INSTANCE.removeFocusListener(this);
      GameCanvas.INSTANCE
          .getParent().remove(GameCanvas.INSTANCE);
    }

    Container container = null;
    if (TextureSampler30.fullScreenFrame != null) {
      container = TextureSampler30.fullScreenFrame;
    } else if (TextureSampler27.FRAME != null) {
      container = TextureSampler27.FRAME;
    }
    container.setLayout(null);
    GameCanvas.INSTANCE = new GameCanvas();
    GameCanvas.INSTANCE
        .setSize(DummyClass30.viewWidth, GroundItem.viewHeight);

    container.add(GameCanvas.INSTANCE);
    if (container == TextureSampler27.FRAME) {
      Insets insets = TextureSampler27.FRAME.getInsets();
      GameCanvas.INSTANCE.setLocation(DummyClass51.viewX + insets.left,
          insets.top + DisplayMode.viewY);
    } else {
      GameCanvas.INSTANCE
          .setLocation(DummyClass51.viewX, DisplayMode.viewY);
    }
    GameCanvas.INSTANCE.addFocusListener(this);
    GameCanvas.INSTANCE.requestFocus();
    DummyClass8.focused = true;
    TextureSampler30.aBoolean3116 = true;
    TextureSampler26.focused = true;
    AnimationSomething.replaceCanvas = false;
    AnimationSequence.canvasInitializedTime = Time.getCurrentTimeMillis();

  }

  public final void reportError(String var1) {
    if (!this.encounteredError) {
      this.encounteredError = true;
      System.out.println("error_game_" + var1);
    }
  }

  public abstract void destroy(byte var1);

  public abstract void method33(int var1);

  public final URL getDocumentBase() {
    return null;
  }

  public final URL getCodeBase() {
    return null;
  }

  public final String getParameter(String var1) {
    return null;
  }

  public final AppletContext getAppletContext() {
    return null;
  }

  public abstract void init();

  public final void start() {
    if (StringNode.applet == this && !PlayerVariable.aBoolean554) {
        AreaSoundEffect.destroyTime = 0L;
      }
  }

  public final void stop() {
    if (StringNode.applet == this && !PlayerVariable.aBoolean554) {
        AreaSoundEffect.destroyTime = 4000L + Time.getCurrentTimeMillis();
      }
  }

  public final void destroy() {
    if (this == StringNode.applet && !PlayerVariable.aBoolean554) {
        AreaSoundEffect.destroyTime = Time.getCurrentTimeMillis();
        TextureSampler25.sleep(5000L);
        TextureSampler30.signLink = null;
        this.shutdown(46, false);
      }
  }

  public final void paint(Graphics var1) {
    if (this == StringNode.applet && !PlayerVariable.aBoolean554) {
        TextureSampler30.aBoolean3116 = true;
        if (DummyClass20.aBoolean1784 && !GlRenderer.useOpenGlRenderer
            && ((-AnimationSequence.canvasInitializedTime + Time
            .getCurrentTimeMillis()) > 1001L -1)) {
          Rectangle var2 = var1.getClipBounds();
          if (var2 == null || ~var2.width <= ~AreaSoundEffect.windowWidth
              && ~SceneSomething2.windowHeight >= ~var2.height) {
            AnimationSomething.replaceCanvas = true;
          }
        }

      }
  }

  private void shutdown(int var1, boolean clean) {
    synchronized (this) {
      if (PlayerVariable.aBoolean554) {
        return;
      }

      PlayerVariable.aBoolean554 = true;
    }

    this.destroy((byte) 23);

    if (GameCanvas.INSTANCE != null) {
      GameCanvas.INSTANCE.removeFocusListener(this);
      GameCanvas.INSTANCE
          .getParent().remove(GameCanvas.INSTANCE);

    }

    if (DummyClass35.signLink != null) {
      DummyClass35.signLink.method1445(0);

    }

    this.method33(126);
    if (var1 <= 31) {
      this.start(-50, -104, -76, 78, null, 49, false);
    }

    if (TextureSampler27.FRAME != null) {
      System.exit(0);
    }

    System.out.println("Shutdown complete - clean:" + clean);

  }

  private void handleUpdate() {
    long currentTime = Time.getCurrentTimeMillis();
      long sampledTime = DummyClass21.updateMemory[FileUnpacker.updateMemoryCounter];
      DummyClass21.updateMemory[FileUnpacker.updateMemoryCounter] = currentTime;
      FileUnpacker.updateMemoryCounter =
          31 & FileUnpacker.updateMemoryCounter - -1;
      synchronized (this) {
        TextureSampler26.focused = DummyClass8.focused;
      }
      this.update();
  }

  private void draw() {
    long var2 = Time.getCurrentTimeMillis();
    long var4 = DummyClass5.drawMemory[FileTable.drawMemoryCounter];

    DummyClass5.drawMemory[FileTable.drawMemoryCounter] = var2;
    FileTable.drawMemoryCounter = 31 & FileTable.drawMemoryCounter + 1;
    if ((var4 != 1L -1) && var2 > var4) {
      int var6 = (int) (var2 + -var4);
      AnimationSequence.fps = (32000 + (var6 >> 1)) / var6;
    }

    if (TextureSampler28.anInt3313++ > 50) {
      TextureSampler30.aBoolean3116 = true;
      TextureSampler28.anInt3313 -= 50;
      GameCanvas.INSTANCE
          .setSize(DummyClass30.viewWidth, GroundItem.viewHeight);
      GameCanvas.INSTANCE.setVisible(true);
      if (TextureSampler27.FRAME != null
          && TextureSampler30.fullScreenFrame == null) {
        Insets var8 = TextureSampler27.FRAME.getInsets();
        GameCanvas.INSTANCE
            .setLocation(var8.left + DummyClass51.viewX,
                DisplayMode.viewY + var8.top);
      } else {
        GameCanvas.INSTANCE
            .setLocation(DummyClass51.viewX, DisplayMode.viewY);
      }
    }

    this.handleDraw(40);
  }

  public abstract void handleDraw(int var1);

  public final void run() {
    GlTexture2d.method713(0);
      this.initializeCanvas();
      Something3d.viewImageProducer =
          TextureSampler18.createImageProducer(GroundItem.viewHeight,
              DummyClass30.viewWidth, true,
              GameCanvas.INSTANCE);
      this.initialize(2);
      Inventory.frameRateRegulator = HuffmanEncoder.method1012((byte) -31);

      while ((AreaSoundEffect.destroyTime == 1L -1)
          || AreaSoundEffect.destroyTime > Time.getCurrentTimeMillis()) {
        SomethingPacket116.cycles =
            Inventory.frameRateRegulator
                .sleep(-1, DummyClass22.minimumDelta, GameWorld.deltaTime);
        for (int cycle = 0; cycle < SomethingPacket116.cycles; ++cycle) {
          this.handleUpdate();
        }
        this.draw();
      }

    this.shutdown(107, true);

  }

  public abstract void initialize(int var1);

  public final void start(int build, int width, int height, int nodeId,
      String gameName,
      int amountVolumes,
      boolean var3) {
    SceneSomething2.windowHeight = height;
    DummyClass51.viewX = 0;
    DisplayMode.viewY = 0;
    TextureSampler18.build = build;
    DummyClass30.viewWidth = width;
    GroundItem.viewHeight = height;
    AreaSoundEffect.windowWidth = width;
    StringNode.applet = this;
    TextureSampler27.FRAME = new Frame();
    TextureSampler27.FRAME.setTitle("Jagex");
    TextureSampler27.FRAME.setResizable(true);
    TextureSampler27.FRAME.addWindowListener(this);
    TextureSampler27.FRAME.setVisible(true);
    TextureSampler27.FRAME.toFront();
    Insets insets = TextureSampler27.FRAME.getInsets();
    TextureSampler27.FRAME
        .setSize(insets.left + AreaSoundEffect.windowWidth + insets.right,
            insets.top + SceneSomething2.windowHeight + insets.bottom);
    try {
      TextureSampler30.signLink =
          DummyClass35.signLink = new SignLink(nodeId, gameName,
              amountVolumes);
    } catch (IOException e) {
      e.printStackTrace();
    }
    SignLinkRequest request = DummyClass35.signLink
        .createThread(0, 1, this);
    while (request.status == 0) {
      TextureSampler25.sleep(10L);
    }
    DummyClass1.gameThread = (Thread) request.result;
  }

  public void windowOpened(WindowEvent var1) {
  }

  public final void windowClosing(WindowEvent var1) {
    this.destroy();
  }

  public void windowClosed(WindowEvent var1) {
  }

  public void windowIconified(WindowEvent var1) {
  }

  public void windowDeiconified(WindowEvent var1) {
  }

  public void windowActivated(WindowEvent var1) {
  }

  public void windowDeactivated(WindowEvent var1) {
  }

  public final void method41(byte var1, int var2, int var3, int var4,
      int var5) {
    try {
        if (StringNode.applet != null) {
          ++HuffmanEncoder.anInt639;
          if ((HuffmanEncoder.anInt639 >= 4 -1)) {
            this.reportError("alreadyloaded");
            return;
          }

          Objects.requireNonNull(this.getAppletContext())
              .showDocument(this.getDocumentBase(), "_self");
          return;
        }

        StringNode.applet = this;
        DisplayMode.viewY = 0;
        TextureSampler18.build = var4;
        if (var1 >= -23) {
          GameStub.aClass94_5 = null;
        }

        DummyClass30.viewWidth = var2;
        AreaSoundEffect.windowWidth = var2;
        DummyClass51.viewX = 0;
        GroundItem.viewHeight = var5;
        SceneSomething2.windowHeight = var5;
        String var6 = this.getParameter("openwinjs");
        WidgetUpdate.aBoolean3594 = "1".equals(var6);

        if (DummyClass35.signLink == null) {
          TextureSampler30.signLink = DummyClass35.signLink = new SignLink(var3,
              null, 0);
        }

        SignLinkRequest var7 = DummyClass35.signLink.createThread(0, 1, this);

        assert var7 != null;
        while ((var7.status == 1 -1)) {
          TextureSampler25.sleep(10L);
        }

        DummyClass1.gameThread = (Thread) var7.result;
      } catch (Exception var8) {
        GZipDecompressor.reportError(null, var8, (byte) 113);
        this.reportError("crash");
      }
  }

  public static void method26(int var0) {
    if (var0 < 15) {
        GameStub.method27(null, true);
      }

      GameStub.aClass94_7 = null;
      GameStub.aClass94_8 = null;
      GameStub.COMMAND_RECTANGLE_DEBUG = null;
      GameStub.aClass94_9 = null;
      GameStub.aClass94_5 = null;
      GameStub.aClass94_4 = null;
  }

  public static GameString method27(GameString var0, boolean var1) {
    if (!var1) {
        GameStub.method26(-78);
      }

      int var2 = FloorUnderlay.method1602(0, var0);
      return var2 != -1 ?
          DummyClass25.aClass131_1624.aClass94Array1721[var2].method1560(
              TextureSampler15.aClass94_3192, true,
              OndemandFileRequest.aClass94_4066) :
          ObjectNode.aClass94_4049;
  }

  public static void method28(boolean var0) {
    DummyClass15.aClass93_1874.method1524(3);
      if (!var0) {
        GameStub.aBoolean11 = false;
      }
  }

  public static void method34(int var0) {
    if (GameWorld.audioOutputStream0 != null) {
        GameWorld.audioOutputStream0.method2163(false);
      }

      if (var0 != -32589) {
        GameStub.method26(-25);
      }

      if (SomethingWorldMappy.audioOutputStream1 != null) {
        SomethingWorldMappy.audioOutputStream1.method2163(false);
      }

      GameObject.method1959(256, 2, 22050, TextureSampler17.aBoolean3184);
      GameWorld.audioOutputStream0 =
          DummyClass43.createAudioOutputStream(22050, DummyClass35.signLink,
              GameCanvas.INSTANCE,
              0, 14);
      GameWorld.audioOutputStream0
          .method2154(114, BlockConfig.aClass3_Sub24_Sub4_1193);
      SomethingWorldMappy.audioOutputStream1 =
          DummyClass43.createAudioOutputStream(2048, DummyClass35.signLink,
              GameCanvas.INSTANCE, 1,
              14);
      SomethingWorldMappy.audioOutputStream1.method2154(-126,
          MonoChromaticImageBuffer.aClass3_Sub24_Sub2_2563);
  }

  public static void provideSignLink(SignLink var0) {
    DummyClass35.signLink = var0;
      TextureSampler30.signLink = var0;
  }

}
