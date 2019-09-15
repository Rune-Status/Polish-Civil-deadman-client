package com.jagex.runescape;

import com.jagex.runescape.node.Deque;

public final class MonoChromaticImageCache {

  public boolean aBoolean1580;
  private final int anInt1568;
  private int anInt1570;
  private MonoChromaticImageBuffer[] aClass3_Sub26Array1571;
  private int[][] anIntArrayArray1573;
  private int anInt1576 = -1;
  private Deque aClass61_1577 = new Deque();
  private final int anInt1579;


  public MonoChromaticImageCache(int var1, int var2, int var3 ) {
    this.anInt1568 = var2;
      this.aClass3_Sub26Array1571 = new MonoChromaticImageBuffer[this.anInt1568];
      this.anInt1579 = var1;
      this.anIntArrayArray1573 = new int[this.anInt1579][var3];
  }

  public void method1706(int var1 ) {
    for (int var2 = 0; var2 < this.anInt1579; ++var2) {
        this.anIntArrayArray1573[var2] = null;
      }

      if (var1 != 1127165736) {
        GlobalStatics_9.method1711(118, 75);
      }

      this.anIntArrayArray1573 = null;
      this.aClass3_Sub26Array1571 = null;
      this.aClass61_1577.clear(-85);
      this.aClass61_1577 = null;
  }

  public int[] method1709(int var1, int var2 ) {
    if (var1 != -16409) {
        this.aBoolean1580 = false;
      }

      if ((this.anInt1568 == this.anInt1579)) {
        this.aBoolean1580 = this.aClass3_Sub26Array1571[var2] == null;
        this.aClass3_Sub26Array1571[var2] = DummyClass42.aClass3_Sub26_884;
        return this.anIntArrayArray1573[var2];
      } else {
        if (this.anInt1579 == 1) {
          this.aBoolean1580 = this.anInt1576 != var2;
          this.anInt1576 = var2;
          return this.anIntArrayArray1573[0];
        } else {
          MonoChromaticImageBuffer var3 = this.aClass3_Sub26Array1571[var2];
          if (var3 != null) {
            this.aBoolean1580 = false;
          } else {
            this.aBoolean1580 = true;
            if (this.anInt1570 < this.anInt1579) {
              var3 = new MonoChromaticImageBuffer(var2, this.anInt1570);
              ++this.anInt1570;
            } else {
              MonoChromaticImageBuffer var4 =
                  (MonoChromaticImageBuffer) this.aClass61_1577.method1212();
              assert var4 != null;
              var3 = new MonoChromaticImageBuffer(var2, var4.anInt2555);
              this.aClass3_Sub26Array1571[var4.anInt2553] = null;
              var4.unlinkNode();
            }

            this.aClass3_Sub26Array1571[var2] = var3;
          }

          this.aClass61_1577.method1216(64, var3);
          return this.anIntArrayArray1573[var3.anInt2555];
        }
      }
  }

  public int[][] method1710(byte var1 ) {
    if (var1 <= 67) {
        return null;
      } else if (this.anInt1579 != this.anInt1568) {
        throw new RuntimeException("Can only retrieve a full image cache");
      } else {
        for (int var2 = 0; this.anInt1579 > var2; ++var2) {
          this.aClass3_Sub26Array1571[var2] = DummyClass42.aClass3_Sub26_884;
        }

        return this.anIntArrayArray1573;
      }
  }

}
