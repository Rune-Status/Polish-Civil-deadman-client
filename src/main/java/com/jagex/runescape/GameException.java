package com.jagex.runescape;

public final class GameException extends RuntimeException {

  public String source;
  public Throwable aThrowable2118;


  public GameException(Throwable var1, String var2 ) {
    this.source = var2;
    this.aThrowable2118 = var1;
  }

}
