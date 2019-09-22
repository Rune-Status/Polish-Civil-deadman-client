package com.jagex.runescape.model;

import com.jagex.runescape.common.ThreadUtilities;
import java.io.InputStream;

public final class DummyInputStream extends InputStream {

  public int read() {
    ThreadUtilities.sleep(30000L);
    return -1;
  }

}
