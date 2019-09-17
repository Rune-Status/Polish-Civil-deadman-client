package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;

public final class OndemandFileRequest extends AbstractFileRequest {

  public byte aByte4064;
  public int anInt4067;
  public Buffer buffer;

  public int method586(boolean var1) {
    return var1 ?
          92 :
        this.buffer == null ?
            0 :
            this.buffer.position * 100 / (-this.aByte4064
                + this.buffer.bytes.length);
  }

  public byte[] method587(boolean var1) {
    if (!this.aBoolean3632 && this.buffer.position >= -this.aByte4064
          + this.buffer.bytes.length) {
        if (var1) {
          this.method586(false);
        }

        return this.buffer.bytes;
      } else {
        throw new RuntimeException();
      }
  }

}
