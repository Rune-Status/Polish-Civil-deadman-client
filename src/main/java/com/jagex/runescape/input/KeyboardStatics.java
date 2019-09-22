package com.jagex.runescape.input;

import java.awt.event.KeyEvent;

public class KeyboardStatics {

  public static Keyboard KEYBOARD = new Keyboard();
  public static int[] KEY_QUEUE = new int[128];
  public static int[] OTHER_KEY_QUEUE = new int[128];
  public static int[] anIntArray2952 = new int[128];
  public static int CURRENT_KEY_QUEUE_INDEX;
  public static volatile int anInt3398;
  public static int[] KEY_TABLE = {
      -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82,
      86, -1, -1, -1, -1, -1,
      -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99,
      -1, -1, -1, -1, -1, -1,
      -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1,
      48, 68, 66, 50, 34, 51,
      52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65,
      37, 64, -1, -1, -1, -1,
      -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229,
      90, 1, 2, 3, 4, 5, 6,
      7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1
  };
  public static int anInt2384;
  public static int anInt1744;
  public static int KEY_QUEUE_INDEX;
  public static boolean[] PRESSED_KEYS = new boolean[112];
  public static int anInt1762;

  public static int method1386(KeyEvent event) {
    int character = event.getKeyChar();
    if (character == 8364) {
      return 128;
    } else {
      if (character <= 0 || character >= 256) {
        character = -1;
      }
      return character;
    }
  }

  public static void method996() {
    synchronized (KeyboardStatics.KEYBOARD) {
      KeyboardStatics.KEY_QUEUE_INDEX = KeyboardStatics.anInt1762;
      ++KeyboardStatics.anInt3398;
      if (KeyboardStatics.anInt2384 < 0) {
        for (int index = 0; index < 112; ++index) {
          KeyboardStatics.PRESSED_KEYS[index] = false;
        }
        KeyboardStatics.anInt2384 = KeyboardStatics.anInt1744;
      } else {
        while (KeyboardStatics.anInt2384 != KeyboardStatics.anInt1744) {
          int keyCode = KeyboardStatics.anIntArray2952[KeyboardStatics.anInt1744];
          KeyboardStatics.anInt1744 = 127 & 1 + KeyboardStatics.anInt1744;
          if (keyCode >= 0) {
            KeyboardStatics.PRESSED_KEYS[keyCode] = true;
          } else {
            KeyboardStatics.PRESSED_KEYS[~keyCode] = false;
          }
        }
      }
      KeyboardStatics.anInt1762 = KeyboardStatics.CURRENT_KEY_QUEUE_INDEX;
    }
  }
}
