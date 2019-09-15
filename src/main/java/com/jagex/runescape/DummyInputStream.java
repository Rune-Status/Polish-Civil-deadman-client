package com.jagex.runescape;

import java.io.InputStream;

public final class DummyInputStream extends InputStream {

  public int read() {
    GlobalStatics_10.sleep(30000L);
    return -1;
  }

}
