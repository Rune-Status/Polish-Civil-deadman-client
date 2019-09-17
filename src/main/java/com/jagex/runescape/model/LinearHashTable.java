package com.jagex.runescape.model;

public final class LinearHashTable {

  private final int[] anIntArray1041;


  public LinearHashTable(int[] var1 ) {
    int var2;
      for (var2 = 1; (var1.length >> 1) + var1.length >= var2; var2 <<= 1) {
      }

      this.anIntArray1041 = new int[var2 + var2];

      int var3;
      for (var3 = 0; var2 + var2 > var3; ++var3) {
        this.anIntArray1041[var3] = -1;
      }

      int var4;
      for (var3 = 0; var1.length > var3; this.anIntArray1041[var4 + var4 + 1] = var3++) {
        for (
          var4 = -1 + var2 & var1[var3];
            this.anIntArray1041[1 + var4 + var4] != -1; var4 = -1 + var2 & 1 + var4) {
        }

        this.anIntArray1041[var4 + var4] = var1[var3];
      }
  }

  public int get(int var1 ) {
    int var3 = (this.anIntArray1041.length >> 1) - 1;
      int var4 = var3 & var1;

      while (true) {
        int var5 = this.anIntArray1041[1 + var4 + var4];
        if (var5 == -1) {
          return -1;
        }

        if (var1 == this.anIntArray1041[var4 + var4]) {
          return var5;
        }

        var4 = var4 + 1 & var3;
      }
  }

}
