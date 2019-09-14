package com.jagex.runescape.done;

import com.jagex.runescape.GlobalStatics_7;
import com.jagex.runescape.common.GameStringStatics;

public final class FaceNormal {

  static {
    for (int var2 = 0; var2 < 256; ++var2) {
      long var0 = var2;

      for (int var3 = 0; var3 < 8; ++var3) {
        if (((1L & var0) == 1L)) {
          var0 = var0 >>> 1 ^ -3932672073523589310L;
        } else {
          var0 >>>= 1;
        }
      }

      GlobalStatics_7.aLongArray1631[var2] = var0;
    }

    GlobalStatics_7.aClass94_1637 = GameStringStatics.create("Texturen geladen)3");
    GlobalStatics_7.aClass94_1636 = GameStringStatics.create("rouge:");
    GlobalStatics_7.anIntArray1638 = new int[128];
  }

  public int z;
  public int x;
  public int y;

}
