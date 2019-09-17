package com.jagex.runescape.model;

import com.jagex.runescape.statics.DummyClass26;
import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_3;
import com.jagex.runescape.statics.GlobalStatics_4;
import com.jagex.runescape.statics.GlobalStatics_5;
import com.jagex.runescape.statics.GlobalStatics_6;
import com.jagex.runescape.statics.GlobalStatics_7;
import com.jagex.runescape.statics.GlobalStatics_9;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class Keyboard implements KeyListener, FocusListener {

    public void keyTyped(KeyEvent var1) {
    if (GlobalStatics_10.keyboard != null) {
        int var2 = GlobalStatics_6.method1386(true, var1);
        if (var2 >= 0) {
          int var3 = 1 + GlobalStatics_9.anInt491 & 127;
          if (GlobalStatics_9.anInt3620 != var3) {
            GlobalStatics_4.keyQueue[GlobalStatics_9.anInt491] = -1;
            GlobalStatics_5.otherKeyQueue[GlobalStatics_9.anInt491] = var2;
            GlobalStatics_9.anInt491 = var3;
          }
        }
      }

      var1.consume();
  }

  public synchronized void keyPressed(KeyEvent var1) {
    if (GlobalStatics_10.keyboard != null) {
        GlobalStatics_10.anInt3398 = 0;
        int var2 = var1.getKeyCode();
        if (var2 >= 0 && DummyClass26.keyTable.length > var2) {
          var2 = DummyClass26.keyTable[var2];
          if ((var2 & 128) != 0) {
            var2 = -1;
          }
        } else {
          var2 = -1;
        }

        if (GlobalStatics_3.anInt2384 >= 0 && var2 >= 0) {
          GlobalStatics_7.anIntArray2952[GlobalStatics_3.anInt2384] = var2;
          GlobalStatics_3.anInt2384 = 127 & GlobalStatics_3.anInt2384 + 1;
          if (GlobalStatics_3.anInt2384 == GlobalStatics_9.anInt1744) {
            GlobalStatics_3.anInt2384 = -1;
          }
        }

        int var3;
        if (var2 >= 0) {
          var3 = 127 & 1 + GlobalStatics_9.anInt491;
          if (var3 != GlobalStatics_9.anInt3620) {
            GlobalStatics_4.keyQueue[GlobalStatics_9.anInt491] = var2;
            GlobalStatics_5.otherKeyQueue[GlobalStatics_9.anInt491] = -1;
            GlobalStatics_9.anInt491 = var3;
          }
        }

        var3 = var1.getModifiers();
        if ((var3 & 10) != 0 || var2 == 85 || var2 == 10) {
          var1.consume();
        }
      }
  }

  public synchronized void keyReleased(KeyEvent var1) {
    if (GlobalStatics_10.keyboard != null) {
        GlobalStatics_10.anInt3398 = 0;
        int var2 = var1.getKeyCode();
        if (var2 >= 0 && DummyClass26.keyTable.length > var2) {
          var2 = DummyClass26.keyTable[var2] & -129;
        } else {
          var2 = -1;
        }

        if (GlobalStatics_3.anInt2384 >= 0 && var2 >= 0) {
          GlobalStatics_7.anIntArray2952[GlobalStatics_3.anInt2384] = ~var2;
          GlobalStatics_3.anInt2384 = 127 & 1 + GlobalStatics_3.anInt2384;
          if (GlobalStatics_9.anInt1744 == GlobalStatics_3.anInt2384) {
            GlobalStatics_3.anInt2384 = -1;
          }
        }
      }

      var1.consume();
  }

  public void focusGained(FocusEvent var1) {
  }

  public synchronized void focusLost(FocusEvent var1) {
    if (GlobalStatics_10.keyboard != null) {
        GlobalStatics_3.anInt2384 = -1;
      }
  }

}
