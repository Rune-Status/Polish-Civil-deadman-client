package com.jagex.runescape;

import com.jagex.runescape.done.BufferObject;

import java.nio.ByteBuffer;

public final class NativeBufferObject extends BufferObject {

  private ByteBuffer buffer;

  public byte[] get(int var1 ) {
    byte[] var2 = new byte[this.buffer.capacity()];
    this.buffer.position(0);
    if (var1 == 26) {
      this.buffer.get(var2);
      return var2;
    } else {
      return null;
    }
  }

  public void put(int var1, byte[] var2 ) {
    this.buffer = ByteBuffer.allocateDirect(var2.length);
    this.buffer.position(0);
    if (var1 != 400) {
      this.put(44, null);
    }

    this.buffer.put(var2);
  }

}
