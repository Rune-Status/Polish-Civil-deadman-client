package com.jagex.runescape.input;

import java.awt.Component;

public class MouseStatics {

  public static volatile int LAST_MOUSE_X = -1;
  public static volatile int anInt4045;
  public static volatile int LAST_MOUSE_Y = -1;
  public static volatile int anInt2743;
  public static volatile int anInt549;
  public static volatile long LAST_MOUSE_PRESS_TIME;
  public static volatile int anInt3389;
  public static volatile int anInt362;
  public static Mouse INSTANCE = new Mouse();

  public static void bindMouseListener(Component component) {
    component.addMouseListener(MouseStatics.INSTANCE);
    component.addMouseMotionListener(MouseStatics.INSTANCE);
    component.addFocusListener(MouseStatics.INSTANCE);
  }

  public static void unbind(Component var1) {
    var1.removeMouseListener(MouseStatics.INSTANCE);
    var1.removeMouseMotionListener(MouseStatics.INSTANCE);
    var1.removeFocusListener(MouseStatics.INSTANCE);
    MouseStatics.anInt549 = 0;
  }

  public static void clearMouse() {
    if (MouseStatics.INSTANCE != null) {
      synchronized (MouseStatics.INSTANCE) {
        MouseStatics.INSTANCE = null;
      }
    }
  }
}
