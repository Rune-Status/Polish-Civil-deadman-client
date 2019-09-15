package com.jagex.runescape.model;

import com.jagex.runescape.node.Deque;
import com.jagex.runescape.statics.GlobalStatics_9;

public final class TriChromaticImageCache {

  public boolean aBoolean1379;
  private int[][][] anIntArrayArrayArray1362;
  private int anInt1365 = -1;
  private Deque aClass61_1366 = new Deque();
  private final int anInt1367;
  private int anInt1368;
  private final int anInt1369;
  private TriChromaticImageBuffer[] aClass3_Sub20Array1371;

  public TriChromaticImageCache(int var1, int var2, int var3) {
    this.anInt1369 = var2;
    this.anInt1367 = var1;
    this.aClass3_Sub20Array1371 = new TriChromaticImageBuffer[this.anInt1369];
    this.anIntArrayArrayArray1362 = new int[this.anInt1367][3][var3];
  }

  public int[][][] method1589(byte var1) {
    if ((this.anInt1369 == this.anInt1367)) {
      if (var1 > -12) {
        this.anInt1365 = -104;
      }

      for (int var2 = 0; this.anInt1367 > var2; ++var2) {
        this.aClass3_Sub20Array1371[var2] = GlobalStatics_9.aClass3_Sub20_3532;
      }

      return this.anIntArrayArrayArray1362;
    } else {
      throw new RuntimeException("Can only retrieve a full image cache");
    }
  }

  public void method1590(byte var1) {
    if (var1 < -1) {
      for (int var2 = 0; this.anInt1367 > var2; ++var2) {
        this.anIntArrayArrayArray1362[var2][0] = null;
        this.anIntArrayArrayArray1362[var2][1] = null;
        this.anIntArrayArrayArray1362[var2][2] = null;
        this.anIntArrayArrayArray1362[var2] = null;
      }

      this.aClass3_Sub20Array1371 = null;
      this.anIntArrayArrayArray1362 = null;
      this.aClass61_1366.clear(-118);
      this.aClass61_1366 = null;
    }
  }

  public int[][] method1594(byte var1, int var2) {
    int var3 = -50 % ((var1 + 57) / 57);
    if (this.anInt1367 == this.anInt1369) {
      this.aBoolean1379 = this.aClass3_Sub20Array1371[var2] == null;
      this.aClass3_Sub20Array1371[var2] = GlobalStatics_9.aClass3_Sub20_3532;
      return this.anIntArrayArrayArray1362[var2];
    } else {
      if (this.anInt1367 == 1) {
        this.aBoolean1379 = this.anInt1365 != var2;
        this.anInt1365 = var2;
        return this.anIntArrayArrayArray1362[0];
      } else {
        TriChromaticImageBuffer var4 = this.aClass3_Sub20Array1371[var2];
        if (var4 == null) {
          this.aBoolean1379 = true;
          if ((this.anInt1368 < this.anInt1367)) {
            var4 = new TriChromaticImageBuffer(var2, this.anInt1368);
            ++this.anInt1368;
          } else {
            TriChromaticImageBuffer var5 =
                (TriChromaticImageBuffer) this.aClass61_1366.method1212();
            assert var5 != null;
            var4 = new TriChromaticImageBuffer(var2, var5.anInt2483);
            this.aClass3_Sub20Array1371[var5.anInt2489] = null;
            var5.unlinkNode();
          }

          this.aClass3_Sub20Array1371[var2] = var4;
        } else {
          this.aBoolean1379 = false;
        }

        this.aClass61_1366.method1216(64, var4);
        return this.anIntArrayArrayArray1362[var4.anInt2483];
      }
    }
  }

}
