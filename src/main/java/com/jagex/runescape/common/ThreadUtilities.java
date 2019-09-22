package com.jagex.runescape.common;

public class ThreadUtilities {

  public static void sleep(long var0) {
    try {
      Thread.sleep(var0);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
