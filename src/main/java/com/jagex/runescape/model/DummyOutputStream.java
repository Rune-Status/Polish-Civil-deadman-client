package com.jagex.runescape.model;

import java.io.IOException;
import java.io.OutputStream;

public final class DummyOutputStream extends OutputStream {

  public void write(int var1) throws IOException {
    throw new IOException();
  }

}
