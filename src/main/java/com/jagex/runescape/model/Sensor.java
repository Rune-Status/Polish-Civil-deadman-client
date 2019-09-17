package com.jagex.runescape.model;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

public class Sensor {

  private Robot robot;
  private Component component;

  public Sensor() {
    try {
      this.robot = new Robot();
    } catch (Throwable exception) {
      exception.printStackTrace();
    }
  }

  public final void createCustomCursor(
      Point hotSpot,
      int width,
      Component component,
      int height,
      int[] rgb
  ) {
    if (rgb != null) {
      BufferedImage image = new BufferedImage(width, height, 2);
      image.setRGB(0, 0, width, height, rgb, 0, width);
      Toolkit toolkit = component.getToolkit();
      component.setCursor(toolkit.createCustomCursor(image, hotSpot, null));
    } else {
      component.setCursor(null);
    }
  }

  public final void moveMouse(int x, int y) {
    this.robot.mouseMove(x, y);
  }

  public final void method1797(Component component, boolean var3) {
    if (var3) {
      component = null;
    } else {
      if (component == null) {
        throw new NullPointerException();
      }
    }

    if (component != this.component) {
      if (this.component != null) {
        this.component.setCursor(null);
        this.component = null;
      }

      if (component != null) {
        Toolkit toolkit = component.getToolkit();
        BufferedImage cursorImage = new BufferedImage(1, 1, 2);
        Cursor customCursor =
            toolkit.createCustomCursor(cursorImage, new Point(0, 0), null);
        component.setCursor(customCursor);
        this.component = component;
      }
    }

  }
}
