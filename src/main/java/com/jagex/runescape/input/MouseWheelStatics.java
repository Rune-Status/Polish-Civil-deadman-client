package com.jagex.runescape.input;

public class MouseWheelStatics {

  public static AbstractMouseWheel MOUSE_WHEEL;

  public static AbstractMouseWheel createMouseWheel() {
    return new MouseWheel();
  }
}
