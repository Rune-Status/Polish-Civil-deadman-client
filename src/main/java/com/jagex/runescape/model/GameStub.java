package com.jagex.runescape.model;

import com.jagex.runescape.common.ThreadUtilities;
import com.jagex.runescape.common.TimeUtilities;
import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.GlTexture2d;
import com.jagex.runescape.statics.DummyClass1;
import com.jagex.runescape.statics.DummyClass20;
import com.jagex.runescape.statics.DummyClass21;
import com.jagex.runescape.statics.DummyClass22;
import com.jagex.runescape.statics.DummyClass30;
import com.jagex.runescape.statics.DummyClass35;
import com.jagex.runescape.statics.DummyClass5;
import com.jagex.runescape.statics.DummyClass51;
import com.jagex.runescape.statics.DummyClass8;
import com.jagex.runescape.statics.GlobalStatics_0;
import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_3;
import com.jagex.runescape.statics.GlobalStatics_6;
import com.jagex.runescape.statics.GlobalStatics_7;
import com.jagex.runescape.statics.GlobalStatics_8;
import com.jagex.runescape.statics.GlobalStatics_9;
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

  private boolean encounteredError;

  public abstract void update();

  public final void focusGained(FocusEvent var1) {
    DummyClass8.FOCUSED = true;
    GlobalStatics_10.aBoolean3116 = true;
  }

  public final void focusLost(FocusEvent var1) {
    DummyClass8.FOCUSED = false;
  }

  public final void initializeCanvas() {
    GameCanvas previousCanvas = GlobalStatics_8.GAME_CANVAS;
    if (previousCanvas != null) {
      previousCanvas.getParent().remove(previousCanvas);
    }
    Container container = null;
    if (GlobalStatics_10.fullScreenFrame != null) {
      container = GlobalStatics_10.fullScreenFrame;
    } else if (GlobalStatics_10.FRAME != null) {
      container = GlobalStatics_10.FRAME;
    }
    GameCanvas canvas = new GameCanvas();
    canvas.setSize(DummyClass30.viewWidth, GlobalStatics_9.viewHeight);

    if (container == GlobalStatics_10.FRAME) {
      Insets insets = GlobalStatics_10.FRAME.getInsets();
      canvas.setLocation(
          DummyClass51.viewX + insets.left,
          insets.top + GlobalStatics_7.viewY
      );
    } else {
      canvas.setLocation(DummyClass51.viewX, GlobalStatics_7.viewY);
    }
    canvas.addFocusListener(this);
    canvas.requestFocus();
    container.setLayout(null);
    container.add(canvas);
    GlobalStatics_8.GAME_CANVAS = canvas;
    DummyClass8.FOCUSED = true;
    GlobalStatics_10.aBoolean3116 = true;
    GlobalStatics_10.FOCUSED = true;
    GlobalStatics_6.REPLACE_CANVAS = false;
    GlobalStatics_3.canvasInitializedTime =
        TimeUtilities.getCurrentTimeMillis();

  }

  public final void reportError(String var1) {
    if (!this.encounteredError) {
      this.encounteredError = true;
      System.out.println("error_game_" + var1);
    }
  }

  public abstract void destroy(byte var1);

  public abstract void clearThings(int var1);

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
    if (GlobalStatics_0.applet == this && !GlobalStatics_9.aBoolean554) {
      GlobalStatics_6.destroyTime = 0L;
    }
  }

  public final void stop() {
    if (GlobalStatics_0.applet == this && !GlobalStatics_9.aBoolean554) {
      GlobalStatics_6.destroyTime =
          4000L + TimeUtilities.getCurrentTimeMillis();
    }
  }

  public final void destroy() {
    if (this == GlobalStatics_0.applet && !GlobalStatics_9.aBoolean554) {
      GlobalStatics_6.destroyTime = TimeUtilities.getCurrentTimeMillis();
      ThreadUtilities.sleep(5000L);
      GlobalStatics_10.signLink = null;
      this.shutdown(46, false);
    }
  }

  public final void paint(Graphics var1) {
    if (this == GlobalStatics_0.applet && !GlobalStatics_9.aBoolean554) {
      GlobalStatics_10.aBoolean3116 = true;
      if (DummyClass20.aBoolean1784 && !GlRenderer.USE_OPENGL
          && -GlobalStatics_3.canvasInitializedTime + TimeUtilities
          .getCurrentTimeMillis() > 1000L) {
        Rectangle var2 = var1.getClipBounds();
        if (var2 == null || var2.width >= GlobalStatics_6.windowWidth
            && GlobalStatics_9.windowHeight <= var2.height) {
          GlobalStatics_6.REPLACE_CANVAS = true;
        }
      }

    }
  }

  private void shutdown(int var1, boolean clean) {
    synchronized (this) {
      if (GlobalStatics_9.aBoolean554) {
        return;
      }

      GlobalStatics_9.aBoolean554 = true;
    }

    this.destroy((byte) 23);

    if (GlobalStatics_8.GAME_CANVAS != null) {
      GlobalStatics_8.GAME_CANVAS.removeFocusListener(this);
      GlobalStatics_8.GAME_CANVAS
          .getParent().remove(GlobalStatics_8.GAME_CANVAS);

    }

    if (DummyClass35.signLink != null) {
      DummyClass35.signLink.method1445(0);

    }

    this.clearThings(126);
    if (var1 <= 31) {
      this.start(-50, -104, -76, 78, null, 49, false);
    }

    if (GlobalStatics_10.FRAME != null) {
      System.exit(0);
    }

    System.out.println("Shutdown complete - clean:" + clean);

  }

  private void handleUpdate() {
    long currentTime = TimeUtilities.getCurrentTimeMillis();
    long sampledTime = DummyClass21.updateMemory[GlobalStatics_8.updateMemoryCounter];
    DummyClass21.updateMemory[GlobalStatics_8.updateMemoryCounter] = currentTime;
    GlobalStatics_8.updateMemoryCounter =
        31 & GlobalStatics_8.updateMemoryCounter + 1;
    synchronized (this) {
      GlobalStatics_10.FOCUSED = DummyClass8.FOCUSED;
    }
    this.update();
  }

  private void draw() {
    long var2 = TimeUtilities.getCurrentTimeMillis();
    long var4 = DummyClass5.drawMemory[GlobalStatics_8.drawMemoryCounter];

    DummyClass5.drawMemory[GlobalStatics_8.drawMemoryCounter] = var2;
    GlobalStatics_8.drawMemoryCounter =
        31 & GlobalStatics_8.drawMemoryCounter + 1;
    if (var4 != 0L && var2 > var4) {
      int var6 = (int) (var2 - var4);
      GlobalStatics_3.fps = (32000 + (var6 >> 1)) / var6;
    }

    if (GlobalStatics_10.anInt3313++ > 50) {
      GlobalStatics_10.aBoolean3116 = true;
      GlobalStatics_10.anInt3313 -= 50;
      GlobalStatics_8.GAME_CANVAS
          .setSize(DummyClass30.viewWidth, GlobalStatics_9.viewHeight);
      GlobalStatics_8.GAME_CANVAS.setVisible(true);
      if (GlobalStatics_10.FRAME != null
          && GlobalStatics_10.fullScreenFrame == null) {
        Insets var8 = GlobalStatics_10.FRAME.getInsets();
        GlobalStatics_8.GAME_CANVAS
            .setLocation(var8.left + DummyClass51.viewX,
                GlobalStatics_7.viewY + var8.top);
      } else {
        GlobalStatics_8.GAME_CANVAS
            .setLocation(DummyClass51.viewX, GlobalStatics_7.viewY);
      }
    }

    this.handleDraw(40);
  }

  public abstract void handleDraw(int var1);

  public final void run() {
    GlTexture2d.method713(0);
    this.initializeCanvas();
    GlobalStatics_9.viewImageProducer =
        GlobalStatics_10.createImageProducer(GlobalStatics_9.viewHeight,
            DummyClass30.viewWidth, true,
            GlobalStatics_8.GAME_CANVAS);
    this.initialize(2);
    GlobalStatics_9.frameRateRegulator = GlobalStatics_0.method1012((byte) -31);

    while (GlobalStatics_6.destroyTime == 0L
        || GlobalStatics_6.destroyTime > TimeUtilities
        .getCurrentTimeMillis()) {
      GlobalStatics_9.cycles =
          GlobalStatics_9.frameRateRegulator
              .sleep(-1, DummyClass22.minimumDelta, GlobalStatics_9.deltaTime);
      for (int cycle = 0; cycle < GlobalStatics_9.cycles; ++cycle) {
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
    GlobalStatics_9.windowHeight = height;
    DummyClass51.viewX = 0;
    GlobalStatics_7.viewY = 0;
    GlobalStatics_10.build = build;
    DummyClass30.viewWidth = width;
    GlobalStatics_9.viewHeight = height;
    GlobalStatics_6.windowWidth = width;
    GlobalStatics_0.applet = this;
    GlobalStatics_10.FRAME = new Frame();
    GlobalStatics_10.FRAME.setTitle("Jagex");
    GlobalStatics_10.FRAME.setResizable(true);
    GlobalStatics_10.FRAME.addWindowListener(this);
    GlobalStatics_10.FRAME.setVisible(true);
    GlobalStatics_10.FRAME.toFront();
    Insets insets = GlobalStatics_10.FRAME.getInsets();
    GlobalStatics_10.FRAME
        .setSize(insets.left + GlobalStatics_6.windowWidth + insets.right,
            insets.top + GlobalStatics_9.windowHeight + insets.bottom);
    try {
      GlobalStatics_10.signLink =
          DummyClass35.signLink = new SignLink(nodeId, gameName,
              amountVolumes);
    } catch (IOException e) {
      e.printStackTrace();
    }
    SignLinkRequest request = DummyClass35.signLink
        .createThread(0, 1, this);
    while (request.status == 0) {
      ThreadUtilities.sleep(10L);
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
      if (GlobalStatics_0.applet != null) {
        ++GlobalStatics_0.anInt639;
        if (GlobalStatics_0.anInt639 >= 3) {
          this.reportError("alreadyloaded");
          return;
        }

        Objects.requireNonNull(this.getAppletContext())
            .showDocument(this.getDocumentBase(), "_self");
        return;
      }

      GlobalStatics_0.applet = this;
      GlobalStatics_7.viewY = 0;
      GlobalStatics_10.build = var4;
      if (var1 >= -23) {
        GlobalStatics_8.aClass94_5 = null;
      }

      DummyClass30.viewWidth = var2;
      GlobalStatics_6.windowWidth = var2;
      DummyClass51.viewX = 0;
      GlobalStatics_9.viewHeight = var5;
      GlobalStatics_9.windowHeight = var5;
      String var6 = this.getParameter("openwinjs");
      GlobalStatics_10.aBoolean3594 = "1".equals(var6);

      if (DummyClass35.signLink == null) {
        GlobalStatics_10.signLink = DummyClass35.signLink = new SignLink(var3,
            null, 0);
      }

      SignLinkRequest var7 = DummyClass35.signLink.createThread(0, 1, this);

      assert var7 != null;
      while (var7.status == 0) {
        ThreadUtilities.sleep(10L);
      }

      DummyClass1.gameThread = (Thread) var7.result;
    } catch (Exception var8) {
      GlobalStatics_9.reportError(null, var8, (byte) 113);
      this.reportError("crash");
    }
  }

}
