package com.jagex.runescape.model;

import com.jagex.runescape.opengl.GlBufferObject;

import java.nio.ByteBuffer;

public final class BufferData {

  public int pointer;
  public boolean updated;
  public GlBufferObject buffer;
  public ByteBuffer byteBuffer;
  public int stride;


}
