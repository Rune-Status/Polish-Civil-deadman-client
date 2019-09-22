package com.jagex.runescape.sound;

public class SomethingAudioStatics {

  public static int method1651(int var1, int var2) {
    int var3;
    if (var2 < var1) {
      var3 = var2;
      var2 = var1;
      var1 = var3;
    }

    while (var1 != 0) {
      var3 = var2 % var1;
      var2 = var1;
      var1 = var3;
    }
    return var2;
  }
}
