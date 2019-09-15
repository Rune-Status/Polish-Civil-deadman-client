package com.jagex.runescape.model;

import com.jagex.runescape.statics.GlobalStatics_10;
import java.io.InputStream;

public final class DummyInputStream extends InputStream {

  public int read() {
    GlobalStatics_10.sleep(30000L);
    return -1;
  }

}
