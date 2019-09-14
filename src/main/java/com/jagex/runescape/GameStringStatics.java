package com.jagex.runescape;

public final class GameStringStatics {

  public static GameString createString(byte[] bytes, int off, int len) {
    GameString string = new GameString();
    string.bytes = new byte[len];
    string.length = 0;

    for (int i = off; i < len + off; i++) {
      if (bytes[i] != 0) {
        string.bytes[string.length++] = bytes[i];
      }
    }
    return string;
  }
}
