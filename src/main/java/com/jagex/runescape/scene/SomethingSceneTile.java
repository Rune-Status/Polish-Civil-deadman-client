package com.jagex.runescape.scene;

public final class SomethingSceneTile {

  public int anInt611;
  public int anInt612;
  public int[] anIntArray613;
  public int[] anIntArray615;
  public int[] anIntArray616;
  public int[] anIntArray617;
  public int[] anIntArray618;
  public int anInt621;
  public int[] anIntArray624;
  public int[] anIntArray625;
  public int anInt626;
  public int[] anIntArray627;
  public boolean aBoolean629 = true;
  public int[] anIntArray631;
  public int[] anIntArray632;

  public SomethingSceneTile(int var1, int var2, int var3, int var4, int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17,
      int var18,
      int var19) {
    if (var6 != var7 || var6 != var8 || var6 != var9) {
      this.aBoolean629 = false;
    }

    this.anInt611 = var1;
    this.anInt612 = var2;
    this.anInt626 = var18;
    this.anInt621 = var19;
    short var20 = 128;
    int var21 = var20 / 2;
    int var22 = var20 / 4;
    int var23 = var20 * 3 / 4;
    int[] var24 = SceneStatics.anIntArrayArray619[var1];
    int var25 = var24.length;
    this.anIntArray627 = new int[var25];
    this.anIntArray615 = new int[var25];
    this.anIntArray618 = new int[var25];
    int[] var26 = new int[var25];
    int[] var27 = new int[var25];
    int var28 = var4 * var20;
    int var29 = var5 * var20;

    int var31;
    int var34;
    int var35;
    int var32;
    int var33;
    int var36;
    for (int var30 = 0; var30 < var25; ++var30) {
      var31 = var24[var30];
      if ((var31 & 1) == 0 && var31 <= 8) {
        var31 = (var31 - var2 - var2 - 1 & 7) + 1;
      }

      if (var31 > 8 && var31 <= 12) {
        var31 = (var31 - 9 - var2 & 3) + 9;
      }

      if (var31 > 12 && var31 <= 16) {
        var31 = (var31 - 13 - var2 & 3) + 13;
      }

      if (var31 == 1) {
        var32 = var28;
        var33 = var29;
        var34 = var6;
        var35 = var10;
        var36 = var14;
      } else if (var31 == 2) {
        var32 = var28 + var21;
        var33 = var29;
        var34 = var6 + var7 >> 1;
        var35 = var10 + var11 >> 1;
        var36 = var14 + var15 >> 1;
      } else if (var31 == 3) {
        var32 = var28 + var20;
        var33 = var29;
        var34 = var7;
        var35 = var11;
        var36 = var15;
      } else if (var31 == 4) {
        var32 = var28 + var20;
        var33 = var29 + var21;
        var34 = var7 + var8 >> 1;
        var35 = var11 + var12 >> 1;
        var36 = var15 + var16 >> 1;
      } else if (var31 == 5) {
        var32 = var28 + var20;
        var33 = var29 + var20;
        var34 = var8;
        var35 = var12;
        var36 = var16;
      } else if (var31 == 6) {
        var32 = var28 + var21;
        var33 = var29 + var20;
        var34 = var8 + var9 >> 1;
        var35 = var12 + var13 >> 1;
        var36 = var16 + var17 >> 1;
      } else if (var31 == 7) {
        var32 = var28;
        var33 = var29 + var20;
        var34 = var9;
        var35 = var13;
        var36 = var17;
      } else if (var31 == 8) {
        var32 = var28;
        var33 = var29 + var21;
        var34 = var9 + var6 >> 1;
        var35 = var13 + var10 >> 1;
        var36 = var17 + var14 >> 1;
      } else if (var31 == 9) {
        var32 = var28 + var21;
        var33 = var29 + var22;
        var34 = var6 + var7 >> 1;
        var35 = var10 + var11 >> 1;
        var36 = var14 + var15 >> 1;
      } else if (var31 == 10) {
        var32 = var28 + var23;
        var33 = var29 + var21;
        var34 = var7 + var8 >> 1;
        var35 = var11 + var12 >> 1;
        var36 = var15 + var16 >> 1;
      } else if (var31 == 11) {
        var32 = var28 + var21;
        var33 = var29 + var23;
        var34 = var8 + var9 >> 1;
        var35 = var12 + var13 >> 1;
        var36 = var16 + var17 >> 1;
      } else if (var31 == 12) {
        var32 = var28 + var22;
        var33 = var29 + var21;
        var34 = var9 + var6 >> 1;
        var35 = var13 + var10 >> 1;
        var36 = var17 + var14 >> 1;
      } else if (var31 == 13) {
        var32 = var28 + var22;
        var33 = var29 + var22;
        var34 = var6;
        var35 = var10;
        var36 = var14;
      } else if (var31 == 14) {
        var32 = var28 + var23;
        var33 = var29 + var22;
        var34 = var7;
        var35 = var11;
        var36 = var15;
      } else if (var31 == 15) {
        var32 = var28 + var23;
        var33 = var29 + var23;
        var34 = var8;
        var35 = var12;
        var36 = var16;
      } else {
        var32 = var28 + var22;
        var33 = var29 + var23;
        var34 = var9;
        var35 = var13;
        var36 = var17;
      }

      this.anIntArray627[var30] = var32;
      this.anIntArray615[var30] = var34;
      this.anIntArray618[var30] = var33;
      var26[var30] = var35;
      var27[var30] = var36;
    }

    int[] var38 = SceneStatics.anIntArrayArray620[var1];
    var31 = var38.length / 4;
    this.anIntArray624 = new int[var31];
    this.anIntArray617 = new int[var31];
    this.anIntArray613 = new int[var31];
    this.anIntArray625 = new int[var31];
    this.anIntArray632 = new int[var31];
    this.anIntArray631 = new int[var31];
    if (var3 != -1) {
      this.anIntArray616 = new int[var31];
    }

    var32 = 0;

    for (var33 = 0; var33 < var31; ++var33) {
      var34 = var38[var32];
      var35 = var38[var32 + 1];
      var36 = var38[var32 + 2];
      int var37 = var38[var32 + 3];
      var32 += 4;
      if (var35 < 4) {
        var35 = var35 - var2 & 3;
      }

      if (var36 < 4) {
        var36 = var36 - var2 & 3;
      }

      if (var37 < 4) {
        var37 = var37 - var2 & 3;
      }

      this.anIntArray624[var33] = var35;
      this.anIntArray617[var33] = var36;
      this.anIntArray613[var33] = var37;
      if (var34 == 0) {
        this.anIntArray625[var33] = var26[var35];
        this.anIntArray632[var33] = var26[var36];
        this.anIntArray631[var33] = var26[var37];
        if (this.anIntArray616 != null) {
          this.anIntArray616[var33] = -1;
        }
      } else {
        this.anIntArray625[var33] = var27[var35];
        this.anIntArray632[var33] = var27[var36];
        this.anIntArray631[var33] = var27[var37];
        if (this.anIntArray616 != null) {
          this.anIntArray616[var33] = var3;
        }
      }
    }

    var33 = var6;
    var34 = var7;
    if (var7 < var6) {
      var33 = var7;
    }

    if (var8 < var33) {
      var33 = var8;
    }

    if (var8 > var34) {
      var34 = var8;
    }

    if (var9 < var33) {
      var33 = var9;
    }

    if (var9 > var34) {
      var34 = var9;
    }

    var33 /= 14;
    var34 /= 14;
  }

}
