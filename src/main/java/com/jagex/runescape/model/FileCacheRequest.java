package com.jagex.runescape.model;

import com.jagex.runescape.statics.GlobalStatics_7;

public final class FileCacheRequest extends AbstractFileRequest {

  public FileCache aClass41_4056;
  public byte[] aByteArray4059;
  public int anInt4061;

  public int method586(boolean var1) {
    if (var1) {
      this.aClass41_4056 = null;
    }

    return this.aBoolean3632 ? 0 : 100;
  }

  public byte[] method587(boolean var1) {
    if (var1) {
      GlobalStatics_7.aBoolean4063 = true;
    }

    if (this.aBoolean3632) {
      throw new RuntimeException();
    } else {
      return this.aByteArray4059;
    }
  }

}
