package com.jagex.runescape;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public final class Mouse implements MouseListener, MouseMotionListener,
    FocusListener {

  public void mouseDragged(MouseEvent e) {
    System.out.println("Mouse.mouseDragged");
    GlobalStatics_9.anInt4045 = 0;
    GlobalStatics_9.lastMouseX = e.getX();
    DummyClass53.lastMouseY = e.getY();
  }

  public void mouseMoved(MouseEvent e) {
    System.out.println("Mouse.mouseMoved");
    GlobalStatics_9.anInt4045 = 0;
    GlobalStatics_9.lastMouseX = e.getX();
    DummyClass53.lastMouseY = e.getY();
  }

  public void mouseClicked(MouseEvent e) {
    System.out.println("var1 = " + e);
    if (e.isPopupTrigger()) {
      e.consume();
    }
  }

  public void mousePressed(MouseEvent e) {
    System.out.println("Mouse.mousePressed");
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
    System.out.println("Mouse.focusGained");
  }

  public void focusLost(FocusEvent e) {
    System.out.println("Mouse.focusLost");
    GlobalStatics_9.anInt549 = 0;
  }

}
