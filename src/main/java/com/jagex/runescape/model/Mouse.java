package com.jagex.runescape.model;

import com.jagex.runescape.statics.DummyClass53;
import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_8;
import com.jagex.runescape.statics.GlobalStatics_9;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public final class Mouse implements MouseListener, MouseMotionListener,
    FocusListener {

  public void mouseDragged(MouseEvent e) {
    GlobalStatics_9.anInt4045 = 0;
    GlobalStatics_9.lastMouseX = e.getX();
    DummyClass53.lastMouseY = e.getY();
  }

  public void mouseMoved(MouseEvent e) {
    GlobalStatics_9.anInt4045 = 0;
    GlobalStatics_9.lastMouseX = e.getX();
    DummyClass53.lastMouseY = e.getY();
  }

  public void mouseClicked(MouseEvent e) {
    if (e.isPopupTrigger()) {
      e.consume();
    }
  }

  public void mousePressed(MouseEvent e) {
    GlobalStatics_9.anInt4045 = 0;
    GlobalStatics_9.anInt362 = e.getX();
    GlobalStatics_10.anInt3389 = e.getY();
    GlobalStatics_9.lastMousePressedTime = GlobalStatics_10.getCurrentTimeMillis();

    if (e.isMetaDown()) {
      GlobalStatics_8.anInt2743 = 2;
      GlobalStatics_9.anInt549 = 2;
    } else {
      GlobalStatics_8.anInt2743 = 1;
      GlobalStatics_9.anInt549 = 1;
    }

    if (e.isPopupTrigger()) {
      e.consume();
    }
  }

  public void mouseReleased(MouseEvent e) {
    GlobalStatics_9.anInt4045 = 0;
    GlobalStatics_9.anInt549 = 0;

    if (e.isPopupTrigger()) {
      e.consume();
    }
  }

  public void mouseEntered(MouseEvent e) {
    GlobalStatics_9.anInt4045 = 0;
    GlobalStatics_9.lastMouseX = e.getX();
    DummyClass53.lastMouseY = e.getY();
  }

  public void mouseExited(MouseEvent e) {
    GlobalStatics_9.anInt4045 = 0;
    GlobalStatics_9.lastMouseX = -1;
    DummyClass53.lastMouseY = -1;
  }

  public void focusGained(FocusEvent e) {
  }

  public void focusLost(FocusEvent e) {
    GlobalStatics_9.anInt549 = 0;
  }

}
