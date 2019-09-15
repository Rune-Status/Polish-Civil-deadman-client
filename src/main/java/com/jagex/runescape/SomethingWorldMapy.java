package com.jagex.runescape;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.node.Deque;
import com.jagex.runescape.node.SubNode;

public final class SomethingWorldMapy extends SubNode {

  public int anInt3549;
  public int anInt3550 = -1;
  public boolean aBoolean3553 = true;
  public GameString aClass94_3554;
  public int anInt3555 = 12800;
  public int anInt3556;
  public int anInt3558;
  public int anInt3559;
  public Deque aClass61_3560;
  public GameString aClass94_3561;
  public int anInt3562 = 12800;
  public int anInt3563 = -1;


  public SomethingWorldMapy(GameString var1, GameString var2, int var3, int var4,
      int var5,
      boolean var6,
      int var7 ) {
    this.anInt3556 = var4;
      this.anInt3550 = var5;
      this.aBoolean3553 = var6;
      this.aClass94_3561 = var1;
      this.aClass94_3554 = var2;
      this.anInt3563 = var7;
      this.anInt3558 = var3;
      if ((this.anInt3563 == 255)) {
        this.anInt3563 = 0;
      }

      this.aClass61_3560 = new Deque();
  }

  public boolean method537(int var1, byte var2, int var3 ) {
    if ((this.anInt3555 <= var3) && var3 <= this.anInt3559
          && var1 >= this.anInt3562
        && var1 <= this.anInt3549) {
        for (SomethingWorldMappy var4 = (SomethingWorldMappy) this.aClass61_3560
            .getFirst();
             var4 != null; var4 = (SomethingWorldMappy) this.aClass61_3560.getNext()) {
          if (var4.method393((byte) -45, var1, var3)) {
            return true;
          }
        }

        if (var2 != 97) {
          GlobalStatics_9.method544(-51, 82);
        }

        return false;
      } else {
        return false;
      }
  }

  public void method538(byte var1 ) {
    this.anInt3562 = 12800;
      this.anInt3559 = 0;
      if (var1 != 103) {
        GlobalStatics_9.aClass11_3551 = null;
      }

      this.anInt3549 = 0;
      this.anInt3555 = 12800;

      for (SomethingWorldMappy var2 = (SomethingWorldMappy) this.aClass61_3560.getFirst();
          var2 != null; var2 = (SomethingWorldMappy) this.aClass61_3560.getNext()) {
        if ((var2.anInt2494 < this.anInt3562)) {
          this.anInt3562 = var2.anInt2494;
        }

        if ((var2.anInt2492 < this.anInt3555)) {
          this.anInt3555 = var2.anInt2492;
        }

        if (var2.anInt2495 > this.anInt3559) {
          this.anInt3559 = var2.anInt2495;
        }

        if (this.anInt3549 < var2.anInt2497) {
          this.anInt3549 = var2.anInt2497;
        }
      }
  }

}
