package com.jagex.runescape;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public final class Mouse implements MouseListener, MouseMotionListener,
    FocusListener {

  public static float[] aFloatArray1919 = new float[4];
  public static int[] anIntArray1920;
  public static int anInt1921;
  public static GameString aClass94_1922 = GameString.create("weiss:");
  public static int anInt1923;
  public static int anInt1924;
  public static int anInt1925;
  public static int anInt1926;
  public static int anInt1927;
  public static Mouse INSTANCE = new Mouse();

  public static void bindMouseListener(Component component) {
    System.out.println("Mouse.bindMouseListener");
    component.addMouseListener(INSTANCE);
    component.addMouseMotionListener(INSTANCE);
    component.addFocusListener(INSTANCE);
  }

  public static void unbind(Component var1) {
    System.out.println("Mouse.unbind");
    var1.removeMouseListener(INSTANCE);
    var1.removeMouseMotionListener(INSTANCE);
    var1.removeFocusListener(INSTANCE);
    SpotAnimationConfig.anInt549 = 0;
  }

  public void mouseDragged(MouseEvent e) {
    System.out.println("Mouse.mouseDragged");
    ObjectNode.anInt4045 = 0;
    SomethingWorldMappy.lastMouseX = e.getX();
    DummyClass53.lastMouseY = e.getY();
  }

  public void mouseMoved(MouseEvent e) {
    System.out.println("Mouse.mouseMoved");
    ObjectNode.anInt4045 = 0;
    SomethingWorldMappy.lastMouseX = e.getX();
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
    ObjectNode.anInt4045 = 0;
    RenderAnimation.anInt362 = e.getX();
    TextureSampler14.anInt3389 = e.getY();
    Projectile.lastMousePressedTime = Time.getCurrentTimeMillis();

    if (e.isMetaDown()) {
      GameObject.anInt2743 = 2;
      SpotAnimationConfig.anInt549 = 2;
    } else {
      GameObject.anInt2743 = 1;
      SpotAnimationConfig.anInt549 = 1;
    }

    if (e.isPopupTrigger()) {
      e.consume();
    }
  }

  public void mouseReleased(MouseEvent e) {
    ObjectNode.anInt4045 = 0;
    SpotAnimationConfig.anInt549 = 0;

    if (e.isPopupTrigger()) {
      e.consume();
    }
  }

  public void mouseEntered(MouseEvent e) {
    ObjectNode.anInt4045 = 0;
    SomethingWorldMappy.lastMouseX = e.getX();
    DummyClass53.lastMouseY = e.getY();
  }

  public void mouseExited(MouseEvent e) {
    ObjectNode.anInt4045 = 0;
    SomethingWorldMappy.lastMouseX = -1;
    DummyClass53.lastMouseY = -1;
  }

  public void focusGained(FocusEvent e) {
    System.out.println("Mouse.focusGained");
  }

  public void focusLost(FocusEvent e) {
    System.out.println("Mouse.focusLost");
    SpotAnimationConfig.anInt549 = 0;
  }

  public static void method2087(byte var0) {
    SpawnedGameObject var1 = (SpawnedGameObject) TextureSampler26.aClass61_3075
          .getFirst();

      for (int var2 = -37 / ((-21 - var0) / 48);
          var1 != null;
          var1 = (SpawnedGameObject) TextureSampler26.aClass61_3075.getNext()) {
        if (var1.aliveTime > 0) {
          --var1.aliveTime;
        }

        if (var1.aliveTime != 0) {
          if ((var1.anInt2261 > 1 -1)) {
            --var1.anInt2261;
          }

          if ((var1.anInt2261 == 1 -1) && var1.anInt2264 >= 1
              && var1.anInt2248 >= 1
              && var1.anInt2264 <= 102 && ~var1.anInt2248 >= -103 && (
              ~var1.anInt2265 > -1
                  || AbstractFileRequest
                  .method590((byte) -34, var1.anInt2265, var1.anInt2262))) {
            FileCache.method1048(var1.anInt2265, var1.anInt2264, var1.anInt2250,
                var1.anInt2256,
                var1.anInt2248, -65, var1.anInt2262, var1.anInt2263);
            var1.anInt2261 = -1;
            if (~var1.anInt2254 == ~var1.anInt2265 && var1.anInt2254 == -1) {
              var1.unlinkNode();
            } else if (~var1.anInt2265 == ~var1.anInt2254
                && var1.anInt2256 == var1.anInt2257
                && ~var1.anInt2253 == ~var1.anInt2262) {
              var1.unlinkNode();
            }
          }
        } else if (~var1.anInt2254 > -1 || AbstractFileRequest
            .method590((byte) -66, var1.anInt2254,
                var1.anInt2253)) {
          FileCache.method1048(var1.anInt2254, var1.anInt2264, var1.anInt2250,
              var1.anInt2257,
              var1.anInt2248, -71, var1.anInt2253, var1.anInt2263);
          var1.unlinkNode();
        }
      }
  }

  public static void method2088(boolean var0) {
    Mouse.aClass94_1922 = null;
      Mouse.anIntArray1920 = null;

      Mouse.aFloatArray1919 = null;
  }

  public static void method2089(byte var0) {
    DirectImageProducer.aClass93_2982.method1523((byte) -105);
  }

  public static void method2090(int var0) {
    if (INSTANCE != null) {
        Mouse var1 = INSTANCE;
        synchronized (var1) {
          INSTANCE = null;
        }
      }
  }

  public static void method2091(int var0, int var1) {
    if (SceneNode.anIntArray1838 == null
          || SceneNode.anIntArray1838.length < var0) {
        SceneNode.anIntArray1838 = new int[var0];
      }

      if (var1 != 4) {
        Mouse.anInt1926 = -75;
      }
  }

  public static void method2092(int var0, byte var1) {
    if (var1 != -47) {
        Mouse.aClass94_1922 = null;
      }

      WidgetUpdate var2 = AudioStreamEncoder3.method466(4, 9, var0);
      var2.createIndexedColorSprite(true);
  }

}
