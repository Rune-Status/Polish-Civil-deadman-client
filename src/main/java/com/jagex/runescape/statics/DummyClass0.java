package com.jagex.runescape.statics;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.DummyHashTable;
import com.jagex.runescape.node.Deque;
import com.jagex.runescape.opengl.GlRenderer;
import java.nio.FloatBuffer;

public final class DummyClass0 {

  static {
    new DummyHashTable(8);
    new Buffer(131056);
  }

  public DummyClass0() {
    new DummyClass1();
    new Deque();
  }

  public static void method1755() {
    //TODO ARB
    if (GlRenderer.GL.isExtensionAvailable("GL_ARB_point_parameters")) {
      float[] var1 = {1.0F, 0.0F, 5.0E-4F};
      GlRenderer.GL.glPointParameterfv(0x8129, var1, 0);
      FloatBuffer var2 = FloatBuffer.allocate(1);
      GlRenderer.GL.glGetFloatv(0x8127, var2);
      float var3 = var2.get(0);
      if (var3 > 1024.0F) {
        var3 = 1024.0F;
      }

      GlRenderer.GL.glPointParameterf(0x8126, 1.0F);
      GlRenderer.GL.glPointParameterf(0x8127, var3);
    }

    if (GlRenderer.GL.isExtensionAvailable("GL_ARB_point_sprite")) {
    }

  }

  public static void method1756() {
  }

}
