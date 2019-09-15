package com.jagex.runescape;

public final class SomethingMidiI {

  private final int[] anIntArray918;
  private final int[][] anIntArrayArray920;
  private final int[] anIntArray921;
  private final int[] anIntArray922;
  private final int anInt923;
  private final int[] anIntArray924;
  private final int[] anIntArray926;


  public SomethingMidiI() {
    int var1 = MidiInstrument.method368(16);
    if (var1 == 1) {
      int var2 = MidiInstrument.method368(5);
      int var3 = 0;
      this.anIntArray922 = new int[var2];

      int var4;
      int var5;
      for (var4 = 0; var4 < var2; ++var4) {
        var5 = MidiInstrument.method368(4);
        this.anIntArray922[var4] = var5;
        if (var5 >= var3) {
          var3 = var5 + 1;
        }
      }

      this.anIntArray926 = new int[var3];
      this.anIntArray924 = new int[var3];
      this.anIntArray918 = new int[var3];
      this.anIntArrayArray920 = new int[var3][];

      int var7;
      for (var4 = 0; var4 < var3; ++var4) {
        this.anIntArray926[var4] = MidiInstrument.method368(3) + 1;
        var5 = this.anIntArray924[var4] = MidiInstrument.method368(2);
        if (var5 != 0) {
          this.anIntArray918[var4] = MidiInstrument.method368(8);
        }

        var5 = 1 << var5;
        int[] var6 = new int[var5];
        this.anIntArrayArray920[var4] = var6;

        for (var7 = 0; var7 < var5; ++var7) {
          var6[var7] = MidiInstrument.method368(8) - 1;
        }
      }

      this.anInt923 = MidiInstrument.method368(2) + 1;
      var4 = MidiInstrument.method368(4);
      var5 = 2;

      int var9;
      for (var9 = 0; var9 < var2; ++var9) {
        var5 += this.anIntArray926[this.anIntArray922[var9]];
      }

      this.anIntArray921 = new int[var5];
      this.anIntArray921[0] = 0;
      this.anIntArray921[1] = 1 << var4;
      var5 = 2;

      for (var9 = 0; var9 < var2; ++var9) {
        var7 = this.anIntArray922[var9];

        for (int var8 = 0; var8 < this.anIntArray926[var7]; ++var8) {
          this.anIntArray921[var5++] = MidiInstrument.method368(var4);
        }
      }

      if (GlobalStatics_9.anIntArray925 == null
          || GlobalStatics_9.anIntArray925.length < var5) {
        GlobalStatics_9.anIntArray925 = new int[var5];
        GlobalStatics_9.anIntArray927 = new int[var5];
        GlobalStatics_9.aBooleanArray919 = new boolean[var5];
      }

    } else {
      throw new RuntimeException();
    }
  }

  private void method1198(int var1, int var2, int var3, int var4, float[] var5, int var6) {
    int var7 = var4 - var2;
    int var8 = var3 - var1;
    int var9 = var7 < 0 ? -var7 : var7;
    int var10 = var7 / var8;
    int var11 = var2;
    int var12 = 0;
    int var13 = var7 < 0 ? var10 - 1 : var10 + 1;
    var9 -= (var10 < 0 ? -var10 : var10) * var8;
    var5[var1] *= GlobalStatics_9.aFloatArray929[var2];
    if (var3 > var6) {
      var3 = var6;
    }

    for (int var14 = var1 + 1; var14 < var3; ++var14) {
      var12 += var9;
      if (var12 >= var8) {
        var12 -= var8;
        var11 += var13;
      } else {
        var11 += var10;
      }

      var5[var14] *= GlobalStatics_9.aFloatArray929[var11];
    }

  }

  private void method1199(int var1, int var2) {
    if (var1 < var2) {
      int var3 = var1;
      int var4 = GlobalStatics_9.anIntArray925[var1];
      int var5 = GlobalStatics_9.anIntArray927[var1];
      boolean var6 = GlobalStatics_9.aBooleanArray919[var1];

      for (int var7 = var1 + 1; var7 <= var2; ++var7) {
        int var8 = GlobalStatics_9.anIntArray925[var7];
        if (var8 < var4) {
          GlobalStatics_9.anIntArray925[var3] = var8;
          GlobalStatics_9.anIntArray927[var3] = GlobalStatics_9.anIntArray927[var7];
          GlobalStatics_9.aBooleanArray919[var3] = GlobalStatics_9.aBooleanArray919[var7];
          ++var3;
          GlobalStatics_9.anIntArray925[var7] = GlobalStatics_9.anIntArray925[var3];
          GlobalStatics_9.anIntArray927[var7] = GlobalStatics_9.anIntArray927[var3];
          GlobalStatics_9.aBooleanArray919[var7] = GlobalStatics_9.aBooleanArray919[var3];
        }
      }

      GlobalStatics_9.anIntArray925[var3] = var4;
      GlobalStatics_9.anIntArray927[var3] = var5;
      GlobalStatics_9.aBooleanArray919[var3] = var6;
      this.method1199(var1, var3 - 1);
      this.method1199(var3 + 1, var2);
    }
  }

  private int method1200(int var1, int var2, int var3, int var4, int var5) {
    int var6 = var4 - var2;
    int var7 = var3 - var1;
    int var8 = var6 < 0 ? -var6 : var6;
    int var9 = var8 * (var5 - var1);
    int var10 = var9 / var7;
    return var6 < 0 ? var2 - var10 : var2 + var10;
  }

  public void method1202(float[] var1, int var2 ) {
    int var3 = this.anIntArray921.length;
    int var4 = GlobalStatics_9.anIntArray928[this.anInt923 - 1];
    GlobalStatics_9.aBooleanArray919[0] = GlobalStatics_9.aBooleanArray919[1] = true;

    int var5;
    int var6;
    int var7;
    int var8;
    int var9;
    for (var5 = 2; var5 < var3; ++var5) {
      var6 = GlobalStatics_9.method1201(GlobalStatics_9.anIntArray925, var5);
      var7 = GlobalStatics_9.method1203(GlobalStatics_9.anIntArray925, var5);
      var8 = this.method1200(GlobalStatics_9.anIntArray925[var6], GlobalStatics_9.anIntArray927[var6],
          GlobalStatics_9.anIntArray925[var7],
          GlobalStatics_9.anIntArray927[var7], GlobalStatics_9.anIntArray925[var5]);
      var9 = GlobalStatics_9.anIntArray927[var5];
      int var10 = var4 - var8;
      int var12 = (var10 < var8 ? var10 : var8) << 1;
      if (var9 == 0) {
        GlobalStatics_9.aBooleanArray919[var5] = false;
        GlobalStatics_9.anIntArray927[var5] = var8;
      } else {
        GlobalStatics_9.aBooleanArray919[var6] = GlobalStatics_9.aBooleanArray919[var7] = true;
        GlobalStatics_9.aBooleanArray919[var5] = true;
        if (var9 >= var12) {
          GlobalStatics_9.anIntArray927[var5] =
              var10 > var8 ? var9 - var8 + var8 : var8 - var9 + var10 - 1;
        } else {
          GlobalStatics_9.anIntArray927[var5] =
              (var9 & 1) != 0 ? var8 - (var9 + 1) / 2 : var8 + var9 / 2;
        }
      }
    }

    this.method1199(0, var3 - 1);
    var5 = 0;
    var6 = GlobalStatics_9.anIntArray927[0] * this.anInt923;

    for (var7 = 1; var7 < var3; ++var7) {
      if (GlobalStatics_9.aBooleanArray919[var7]) {
        var8 = GlobalStatics_9.anIntArray925[var7];
        var9 = GlobalStatics_9.anIntArray927[var7] * this.anInt923;
        this.method1198(var5, var6, var8, var9, var1, var2);
        if (var8 >= var2) {
          return;
        }

        var5 = var8;
        var6 = var9;
      }
    }

    float var13 = GlobalStatics_9.aFloatArray929[var6];

    for (var8 = var5; var8 < var2; ++var8) {
      var1[var8] *= var13;
    }

  }

  public boolean method1205() {
    boolean var1 = MidiInstrument.method364() != 0;
    if (var1) {
      int var2 = this.anIntArray921.length;

      int var3;
      for (var3 = 0; var3 < var2; ++var3) {
        GlobalStatics_9.anIntArray925[var3] = this.anIntArray921[var3];
      }

      var3 = GlobalStatics_9.anIntArray928[this.anInt923 - 1];
      int var4 = GlobalStatics_9.method513(var3 - 1, 4);
      GlobalStatics_9.anIntArray927[0] = MidiInstrument.method368(var4);
      GlobalStatics_9.anIntArray927[1] = MidiInstrument.method368(var4);
      int var5 = 2;

      for (int var6 = 0; var6 < this.anIntArray922.length; ++var6) {
        int var7 = this.anIntArray922[var6];
        int var8 = this.anIntArray926[var7];
        int var9 = this.anIntArray924[var7];
        int var10 = (1 << var9) - 1;
        int var11 = 0;
        if (var9 > 0) {
          var11 = MidiInstrument.aClass71Array2406[this.anIntArray918[var7]]
              .method1290();
        }

        for (int var12 = 0; var12 < var8; ++var12) {
          int var13 = this.anIntArrayArray920[var7][var11 & var10];
          var11 >>>= var9;
          GlobalStatics_9.anIntArray927[var5++] =
              var13 >= 0 ? MidiInstrument.aClass71Array2406[var13].method1290()
                  : 0;
        }
      }

      return true;
    } else {
      return false;
    }
  }

}
