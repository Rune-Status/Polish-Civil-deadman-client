package com.jagex.runescape;

import com.jagex.runescape.node.Node;

public final class WidgetAccess extends Node {

  public int anInt2202;
  public int anInt2205;


  public WidgetAccess(int var1, int var2 ) {
    this.anInt2202 = var2;
      this.anInt2205 = var1;
  }

  public boolean method92(int var1, byte var2 ) {
    int var3 = 13 / ((-60 - var2) / 46);
      return (this.anInt2205 >> 1 + var1 & 1) != 0;
  }

  public boolean method93(int var1 ) {
    return var1 != 572878952 || (572878952 & this.anInt2205) >> 29 != 0;
  }

  public int method94(byte var1 ) {
    if (var1 != -74) {
        this.method96(90);
      }

      return this.anInt2205 >> 18 & 7;
  }

  public boolean method95(int var1 ) {
    if (var1 != -13081) {
        GlobalStatics_10.anInt2212 = 71;
      }

      return ((1 & this.anInt2205) != 0);
  }

  public boolean method96(int var1 ) {
    return var1 == -2063688673 && (this.anInt2205 >> 31 & 1) != 0;
  }

  public boolean method97(int var1 ) {
    return var1 != -20710 || (1 & this.anInt2205 >> 22) != 0;
  }

  public boolean method98(boolean var1 ) {
    if (var1) {
        GlobalStatics_10.anIntArray2209 = null;
      }

      return ((this.anInt2205 >> 21 & 1) != 0);
  }

  public boolean method99(int var1 ) {
    if (var1 != 31595) {
        GlobalStatics_10.scripts = null;
      }

      return (((1738913629 & this.anInt2205) >> 30) != 0);
  }

  public boolean method100(byte var1 ) {
    return var1 != -9 || (this.anInt2205 & 455226656) >> 28 != 0;
  }

  public int method101(int var1 ) {
    if (var1 > -51) {
        GlobalStatics_10.anInt2208 = -42;
      }

      return GlobalStatics_6.method630((byte) -34, this.anInt2205);
  }

}
