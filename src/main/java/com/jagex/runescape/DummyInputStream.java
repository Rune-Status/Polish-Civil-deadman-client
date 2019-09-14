package com.jagex.runescape;

import java.io.InputStream;

public final class DummyInputStream extends InputStream {

  public int read() {
    TextureSampler25.sleep(30000L);
    return -1;
  }

}
