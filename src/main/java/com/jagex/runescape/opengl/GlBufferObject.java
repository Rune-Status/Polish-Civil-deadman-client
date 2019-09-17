package com.jagex.runescape.opengl;

import java.nio.ByteBuffer;

public final class GlBufferObject {

  private int anInt1991;
  private final int anInt1992;
  private int anInt1993;
  private final boolean aBoolean1994;


  public GlBufferObject() {
    this(false);
  }

  public GlBufferObject(boolean var1 ) {
    this.anInt1991 = -1;
    this.anInt1993 = 0;
    int[] var3 = new int[1];
 //TODO ARB
    GlRenderer.GL.glGenBuffers(1, var3, 0);
    this.aBoolean1994 = var1;
    this.anInt1991 = var3[0];
    this.anInt1992 = DummyClass33.anInt582;
  }

  public void method2168(ByteBuffer var1 ) {
    if (var1.limit() <= this.anInt1993) {
      GlRenderer.GL.glBindBuffer('\u8892', this.anInt1991);
      GlRenderer.GL.glBufferSubData('\u8892', 0, var1.limit(), var1);
    } else {
      this.setVertexBufferData(var1);
    }

  }

  protected void finalize() throws Throwable {
    if (this.anInt1991 != -1) {
      DummyClass33.method989(this.anInt1991, this.anInt1993, this.anInt1992);
      this.anInt1991 = -1;
      this.anInt1993 = 0;
    }

    super.finalize();
  }

  public void bindVertexBuffer() {
    GlRenderer.GL.glBindBuffer('\u8892', this.anInt1991);
  }

  public void setElementBufferData(ByteBuffer var1 ) {
    GlRenderer.GL.glBindBuffer('\u8893', this.anInt1991);
    GlRenderer.GL.glBufferData('\u8893', var1.limit(), var1,
        this.aBoolean1994 ? '\u88e0' : '\u88e4');
    DummyClass33.anInt585 += var1.limit() - this.anInt1993;
    this.anInt1993 = var1.limit();
  }

  public void bindElementBuffer() {
    GlRenderer.GL.glBindBuffer('\u8893', this.anInt1991);
  }

  public void setVertexBufferData(ByteBuffer buffer ) {
    GlRenderer.GL.glBindBuffer('\u8892', this.anInt1991);
    GlRenderer.GL.glBufferData('\u8892', buffer.limit(), buffer,
        this.aBoolean1994 ? '\u88e0' : '\u88e4');
    DummyClass33.anInt585 += buffer.limit() - this.anInt1993;
    this.anInt1993 = buffer.limit();
  }
}
