package com.jagex.runescape.done;

import com.jagex.runescape.FileUnpacker;
import com.jagex.runescape.done.AnimationBase;
import com.jagex.runescape.done.AnimationFrame;
import com.jagex.runescape.node.Deque;
import com.jagex.runescape.node.SubNode;

public final class AnimationSomething extends SubNode {

  public AnimationBase[] aClass98Array3588;


  public AnimationSomething(FileUnpacker bases, FileUnpacker frames, int var3,
                            boolean var4 ) {
    Deque var5 = new Deque();
      int var6 = bases.getAmountChildren(var3, (byte) 69);
      this.aClass98Array3588 = new AnimationBase[var6];
      int[] var7 = bases.getChildIds((byte) -128, var3);
      int var8 = 0;

      assert var7 != null;
      while ((var8 < var7.length)) {
        byte[] var9 = bases.getBytes(var3, var7[var8]);
        int var11 = 255 & var9[1] | (var9[0] & 255) << 8;
        AnimationFrame var12 = (AnimationFrame) var5.getFirst();
        AnimationFrame var10 = null;

        while (true) {
          if (var12 != null) {
            if (var12.anInt2454 != var11) {
              var12 = (AnimationFrame) var5.getNext();
              continue;
            }

            var10 = var12;
          }

          if (var10 == null) {
            byte[] var13;
            if (var4) {
              var13 = frames.getBytes(var11, 0, 0);
            } else {
              var13 = frames.getBytes(0, var11, 0);
            }

            var10 = new AnimationFrame(var11, var13);
            var5.addLast(var10);
          }

          this.aClass98Array3588[var7[var8]] = new AnimationBase(var9, var10);
          ++var8;
          break;
        }
      }
  }

  public boolean method559(int var1, int var2 ) {
    return var1 == 1317095745 && this.aClass98Array3588[var2].aBoolean1386;
  }

  public boolean method561(int var1, byte var2 ) {
    return var2 < 114 || this.aClass98Array3588[var1].aBoolean1382;
  }

}
