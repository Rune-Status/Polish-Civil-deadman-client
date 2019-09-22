package com.jagex.runescape.model;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.statics.GlobalStatics_10;

public final class WorldMapLabel {

  public short[] aShortArray1718;
  public int anInt1720;
  public GameString[] aClass94Array1721;
  public int[] anIntArray1725;
  public short[] aShortArray1727;
  public byte[] aByteArray1730;

  public WorldMapLabel(int var1) {
    this.anInt1720 = var1;
    this.aClass94Array1721 = new GameString[this.anInt1720];
    this.aShortArray1718 = new short[this.anInt1720];
    this.anIntArray1725 = new int[this.anInt1720];
    this.aByteArray1730 = new byte[this.anInt1720];
    this.aShortArray1727 = new short[this.anInt1720];
  }

  public boolean method1787(int var1, byte var2) {
    if (var2 != -124) {
      GlobalStatics_10.method1793(null, null, -17, (byte) 94);
    }

    return (this.aByteArray1730[var1] & 8) != 0;
  }

  public boolean method1789(int var1, int var2) {
    if (var2 != 530) {
      this.method1794(-111, 26);
    }

    return (4 & this.aByteArray1730[var1]) != 0;
  }

  public int method1791(int var1, int var2) {
    return var2 == 8 ? this.aByteArray1730[var1] & 3 : 35;
  }

  public boolean method1794(int var1, int var2) {
    if (var2 != -20138) {
      GlobalStatics_10.method1788(122, 38, -120, -29, false);
    }

    return (this.aByteArray1730[var1] & 16) == 0;
  }

}
