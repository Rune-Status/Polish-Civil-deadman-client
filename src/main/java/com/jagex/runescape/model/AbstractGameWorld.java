package com.jagex.runescape.model;

import com.jagex.runescape.statics.GlobalStatics_4;

public abstract class AbstractGameWorld {

  public int anInt721;
  public int anInt722;
  public int flags;

  public final boolean method1070(int var1) {
    if (var1 != 8) {
        this.method1070(15);
      }

      return (1 & this.flags) != 0;
  }

  public final boolean method1072(boolean var1) {
    return !var1 && (this.flags & 4) != 0;
  }

  public final boolean method1074(int var1) {
    if (var1 >= -106) {
        GlobalStatics_4.aFloat727 = -0.6283864f;
      }

      return (this.flags & 8) != 0;
  }

  public final boolean method1075(int var1) {
    if (var1 != 64) {
        this.flags = 51;
      }

      return (2 & this.flags) != 0;
  }

}
