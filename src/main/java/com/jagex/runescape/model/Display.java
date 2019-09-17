package com.jagex.runescape.model;

import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;

public class Display {

  private GraphicsDevice device;
  private DisplayMode displayMode;

  public Display() {
    GraphicsEnvironment env = GraphicsEnvironment
        .getLocalGraphicsEnvironment();
    this.device = env.getDefaultScreenDevice();
    if (!this.device.isFullScreenSupported()) {
      GraphicsDevice[] devices = env.getScreenDevices();

      for (GraphicsDevice device : devices) {
        if (device != null && device.isFullScreenSupported()) {
          this.device = device;
          return;
        }
      }
    }
  }

  private void method917(Frame var1, byte var2) {
    boolean var3 = false;

    Field var4;
    boolean var5;
    try {
      var4 = Class.forName("sun.awt.Win32GraphicsDevice")
          .getDeclaredField("valid");
      var4.setAccessible(true);
      var5 = ((Boolean) var4.get(this.device)).booleanValue();
      if (var5) {
        var4.set(this.device, Boolean.FALSE);
        var3 = true;
      }
    } catch (NoSuchFieldException | ClassNotFoundException | IllegalAccessException e) {
      e.printStackTrace();
    }

    var5 = false;

    try {
      var5 = true;
      this.device.setFullScreenWindow(var1);
      if (var2 == -63) {
        var5 = false;
      } else {
        this.method918(90, -112, -67, 27, null, -49);
        var5 = false;
      }
    } finally {
      if (var5 && var3) {
        try {
          Field var7 = Class.forName("sun.awt.Win32GraphicsDevice")
              .getDeclaredField("valid");
          var7.set(this.device, Boolean.TRUE);
        } catch (NoSuchFieldException | ClassNotFoundException | IllegalAccessException e) {
          e.printStackTrace();
        }
      }

    }

    if (var3) {
      try {
        var4 = Class.forName("sun.awt.Win32GraphicsDevice")
            .getDeclaredField("valid");
        var4.set(this.device, Boolean.TRUE);
      } catch (NoSuchFieldException | ClassNotFoundException | IllegalAccessException e) {
        e.printStackTrace();
      }
    }

  }

  public final void method918(int var1, int var2, int var3, int var4,
      Frame var5, int var6) {
    this.displayMode = this.device.getDisplayMode();
    if (var1 > -6) {
      this.method919(false);
    }

    if (this.displayMode == null) {
      throw new NullPointerException();
    } else {
      var5.setUndecorated(true);
      var5.enableInputMethods(false);
      this.method917(var5, (byte) -63);
      if (var2 == 0) {
        int var7 = this.displayMode.getRefreshRate();
        DisplayMode[] var8 = this.device.getDisplayModes();
        boolean var9 = false;

        for (DisplayMode mode : var8) {
          if (mode.getWidth() == var6 && mode.getHeight() == var4
              && var3 == mode.getBitDepth()) {
            int var11 = mode.getRefreshRate();
            if (!var9 || Math.abs(var11 - var7) < Math.abs(0 - var7)) {
              var9 = true;
              var2 = var11;
            }
          }
        }

        if (!var9) {
          var2 = var7;
        }
      }

      this.device
          .setDisplayMode(new DisplayMode(var6, var4, var3, var2));
    }
  }

  public final int[] method919(boolean var1) {
    if (var1) {
      DisplayMode[] var2 = this.device.getDisplayModes();
      int[] var3 = new int[var2.length << 2];

      for (int var4 = 0; var2.length > var4; ++var4) {
        var3[var4 << 2] = var2[var4].getWidth();
        var3[1 + (var4 << 2)] = var2[var4].getHeight();
        var3[(var4 << 2) + 2] = var2[var4].getBitDepth();
        var3[3 + (var4 << 2)] = var2[var4].getRefreshRate();
      }

      return var3;
    } else {
      return null;
    }
  }

  public final void method920(int var1) {
    if (this.displayMode != null) {
      this.device.setDisplayMode(this.displayMode);
      if (!this.device.getDisplayMode()
          .equals(this.displayMode)) {
        throw new RuntimeException("Did not return to correct resolution!");
      }

      this.displayMode = null;
    }

    this.method917(null, (byte) -63);
    int var2 = -121 / ((-64 - var1) / 47);
  }
}
