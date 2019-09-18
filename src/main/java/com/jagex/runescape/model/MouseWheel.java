package com.jagex.runescape.model;

import com.jagex.runescape.camera.CameraStatics;
import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public final class MouseWheel extends AbstractMouseWheel implements MouseWheelListener {

  private int offset;

  public synchronized int pollOffset() {
    int var2 = this.offset;
    this.offset = 0;

    return var2;
  }

  public void unbind(boolean var1, Component var2 ) {
    if (var1) {
      this.mouseWheelMoved(null);
    }

    var2.removeMouseWheelListener(this);
  }

  public void bind(Component var1, int var2 ) {
    if (var2 < -70) {
      var1.addMouseWheelListener(this);
    }
  }

  public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
    this.offset += var1.getWheelRotation();
    System.out.println("var1 = " + var1);
    CameraStatics.SOMETHING_SCENE_Y_0_1 += var1.getWheelRotation();
  }

}
