package com.jagex.runescape.input;

import com.jagex.runescape.common.TimeUtilities;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public final class Mouse implements MouseListener, MouseMotionListener,
    FocusListener {

  public void mouseDragged(MouseEvent e) {
    MouseStatics.anInt4045 = 0;
    MouseStatics.LAST_MOUSE_X = e.getX();
    MouseStatics.LAST_MOUSE_Y = e.getY();
  }

  public void mouseMoved(MouseEvent e) {
    MouseStatics.anInt4045 = 0;
    MouseStatics.LAST_MOUSE_X = e.getX();
    MouseStatics.LAST_MOUSE_Y = e.getY();
  }

  public void mouseClicked(MouseEvent e) {
    if (e.isPopupTrigger()) {
      e.consume();
    }
  }

  public void mousePressed(MouseEvent e) {
    MouseStatics.anInt4045 = 0;
    MouseStatics.anInt362 = e.getX();
    MouseStatics.anInt3389 = e.getY();
    MouseStatics.LAST_MOUSE_PRESS_TIME = TimeUtilities.getCurrentTimeMillis();

    if (e.isMetaDown()) {
      MouseStatics.anInt2743 = 2;
      MouseStatics.anInt549 = 2;
    } else {
      MouseStatics.anInt2743 = 1;
      MouseStatics.anInt549 = 1;
    }

    if (e.isPopupTrigger()) {
      e.consume();
    }
  }

  public void mouseReleased(MouseEvent e) {
    MouseStatics.anInt4045 = 0;
    MouseStatics.anInt549 = 0;

    if (e.isPopupTrigger()) {
      e.consume();
    }
  }

  public void mouseEntered(MouseEvent e) {
    MouseStatics.anInt4045 = 0;
    MouseStatics.LAST_MOUSE_X = e.getX();
    MouseStatics.LAST_MOUSE_Y = e.getY();
  }

  public void mouseExited(MouseEvent e) {
    MouseStatics.anInt4045 = 0;
    MouseStatics.LAST_MOUSE_X = -1;
    MouseStatics.LAST_MOUSE_Y = -1;
  }

  public void focusGained(FocusEvent e) {
  }

  public void focusLost(FocusEvent e) {
    MouseStatics.anInt549 = 0;
  }

}
