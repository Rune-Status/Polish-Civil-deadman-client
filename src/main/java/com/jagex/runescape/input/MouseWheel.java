package com.jagex.runescape.input;

import com.jagex.runescape.camera.CameraStatics;
import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public final class MouseWheel extends AbstractMouseWheel implements
    MouseWheelListener {

  private int offset;

  public synchronized int pollOffset() {
    int offset = this.offset;
    this.offset = 0;
    return offset;
  }

  public void unbind(Component component) {
    component.removeMouseWheelListener(this);
  }

  public void bind(Component component) {
    component.addMouseWheelListener(this);
  }

  public synchronized void mouseWheelMoved(MouseWheelEvent event) {
    this.offset += event.getWheelRotation();
    CameraStatics.SOMETHING_SCENE_Y_0_1 += event.getWheelRotation() * 15;
  }

}
