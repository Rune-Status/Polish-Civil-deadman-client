package com.jagex.runescape.input;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class Keyboard implements KeyListener, FocusListener {

  public void keyTyped(KeyEvent event) {
    if (KeyboardStatics.KEYBOARD != null) {
      int var2 = KeyboardStatics.method1386(event);
      if (var2 >= 0) {
        int index = 1 + KeyboardStatics.CURRENT_KEY_QUEUE_INDEX & 127;
        if (KeyboardStatics.KEY_QUEUE_INDEX != index) {
          KeyboardStatics.KEY_QUEUE[KeyboardStatics.CURRENT_KEY_QUEUE_INDEX] = -1;
          KeyboardStatics.OTHER_KEY_QUEUE[KeyboardStatics.CURRENT_KEY_QUEUE_INDEX] = var2;
          KeyboardStatics.CURRENT_KEY_QUEUE_INDEX = index;
        }
      }
    }
    event.consume();
  }

  public synchronized void keyPressed(KeyEvent var1) {
    if (KeyboardStatics.KEYBOARD != null) {
      KeyboardStatics.anInt3398 = 0;
      int var2 = var1.getKeyCode();
      if (var2 >= 0 && KeyboardStatics.KEY_TABLE.length > var2) {
        var2 = KeyboardStatics.KEY_TABLE[var2];
        if ((var2 & 128) != 0) {
          var2 = -1;
        }
      } else {
        var2 = -1;
      }

      if (KeyboardStatics.anInt2384 >= 0 && var2 >= 0) {
        KeyboardStatics.anIntArray2952[KeyboardStatics.anInt2384] = var2;
        KeyboardStatics.anInt2384 = 127 & KeyboardStatics.anInt2384 + 1;
        if (KeyboardStatics.anInt2384 == KeyboardStatics.anInt1744) {
          KeyboardStatics.anInt2384 = -1;
        }
      }

      if (var2 >= 0) {
        int nextIndex = 127 & 1 + KeyboardStatics.CURRENT_KEY_QUEUE_INDEX;
        if (nextIndex != KeyboardStatics.KEY_QUEUE_INDEX) {
          KeyboardStatics.KEY_QUEUE[KeyboardStatics.CURRENT_KEY_QUEUE_INDEX] = var2;
          KeyboardStatics.OTHER_KEY_QUEUE[KeyboardStatics.CURRENT_KEY_QUEUE_INDEX] = -1;
          KeyboardStatics.CURRENT_KEY_QUEUE_INDEX = nextIndex;
        }
      }

      int modifiers = var1.getModifiers();
      if ((modifiers & 10) != 0 || var2 == 85 || var2 == 10) {
        var1.consume();
      }
    }
  }

  public synchronized void keyReleased(KeyEvent event) {
    if (KeyboardStatics.KEYBOARD != null) {
      KeyboardStatics.anInt3398 = 0;
      int keyCode = event.getKeyCode();
      if (keyCode >= 0 && KeyboardStatics.KEY_TABLE.length > keyCode) {
        keyCode = KeyboardStatics.KEY_TABLE[keyCode] & -129;
      } else {
        keyCode = -1;
      }

      if (KeyboardStatics.anInt2384 >= 0 && keyCode >= 0) {
        KeyboardStatics.anIntArray2952[KeyboardStatics.anInt2384] = ~keyCode;
        KeyboardStatics.anInt2384 = 127 & 1 + KeyboardStatics.anInt2384;
        if (KeyboardStatics.anInt1744 == KeyboardStatics.anInt2384) {
          KeyboardStatics.anInt2384 = -1;
        }
      }
    }

    event.consume();
  }

  public void focusGained(FocusEvent var1) {
  }

  public synchronized void focusLost(FocusEvent var1) {
    if (KeyboardStatics.KEYBOARD != null) {
      KeyboardStatics.anInt2384 = -1;
    }
  }

}
