package com.jagex.runescape.buffer;

import java.nio.ByteBuffer;

public final class NativeBufferObject extends BufferObject {

  private ByteBuffer buffer;

  public byte[] get() {
    byte[] data = new byte[this.buffer.capacity()];
    this.buffer.position(0);
    this.buffer.get(data);
    return data;
  }

  public void put(byte[] data) {
    this.buffer = ByteBuffer.allocateDirect(data.length);
    this.buffer.position(0);
    this.buffer.put(data);
  }

}
