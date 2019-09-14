package com.jagex.runescape.done;

import com.jagex.runescape.DummyClass60;
import com.jagex.runescape.node.Deque;

public final class AudioStreamEncoder3 extends AudioStreamEncoder {

  public Deque aClass61_3489 = new Deque();
  public AudioStreamEncoder2 aClass3_Sub24_Sub2_3495 = new AudioStreamEncoder2();
  private final AudioStreamEncoder4 aClass3_Sub24_Sub4_3493;


  public AudioStreamEncoder3(AudioStreamEncoder4 var1 ) {
    this.aClass3_Sub24_Sub4_3493 = var1;
  }

  private void method464(AudioSomethingSomething var1, int var2, int var3) {
    if (((this.aClass3_Sub24_Sub4_3493.anIntArray3518[var1.anInt2514] & 4) != 0)
        && (var1.anInt2506 < 0)) {
        int var4 =
            this.aClass3_Sub24_Sub4_3493.anIntArray3509[var1.anInt2514] / DummyClass60.sampleRate;
        int var5 = (var4 + 1048575 - var1.anInt2516) / var4;
        var1.anInt2516 = 1048575 & var4 * var3 + var1.anInt2516;
        if ((var3 >= var5)) {
          if (this.aClass3_Sub24_Sub4_3493.anIntArray3519[var1.anInt2514] == 0) {
            var1.aClass3_Sub24_Sub1_2507 =
                AudioStreamEncoder1.method432(var1.aClass3_Sub12_Sub1_2509,
                    var1.aClass3_Sub24_Sub1_2507.method438(),
                    var1.aClass3_Sub24_Sub1_2507.method425(),
                    var1.aClass3_Sub24_Sub1_2507.method451());
          } else {
            var1.aClass3_Sub24_Sub1_2507 =
                AudioStreamEncoder1.method432(var1.aClass3_Sub12_Sub1_2509,
                    var1.aClass3_Sub24_Sub1_2507.method438(), 0,
                    var1.aClass3_Sub24_Sub1_2507.method451());
            this.aClass3_Sub24_Sub4_3493.method501(var1,
                var1.aClass3_Sub15_2527.aShortArray2434[var1.anInt2520] < 0,
                (byte) -101);
          }

          if ((var1.aClass3_Sub15_2527.aShortArray2434[var1.anInt2520] < 0)) {
            assert var1.aClass3_Sub24_Sub1_2507 != null;
            var1.aClass3_Sub24_Sub1_2507.method429(-1);
          }

          var3 = var1.anInt2516 / var4;
        }
      }

      assert var1.aClass3_Sub24_Sub1_2507 != null;
      var1.aClass3_Sub24_Sub1_2507.method415(var3);
      if (var2 != 7) {
        this.aClass3_Sub24_Sub2_3495 = null;
      }
  }

  public int method409() {
    return 0;
  }

  public AudioStreamEncoder method411() {
    AudioSomethingSomething var1 = (AudioSomethingSomething) this.aClass61_3489
          .getFirst();
      return var1 != null ?
        (var1.aClass3_Sub24_Sub1_2507 != null ? var1.aClass3_Sub24_Sub1_2507 : this
            .method414()) :
        null;
  }

  public void method413(int[] var1, int var2, int var3 ) {
    this.aClass3_Sub24_Sub2_3495.method413(var1, var2, var3);

      for (AudioSomethingSomething var6 = (AudioSomethingSomething) this.aClass61_3489
          .getFirst();
           var6 != null; var6 = (AudioSomethingSomething) this.aClass61_3489.getNext()) {
        if (!this.aClass3_Sub24_Sub4_3493.method504(var6, 126)) {
          int var5 = var3;
          int var4 = var2;

          while (true) {
            if (var5 > var6.anInt2512) {
              this.method469(var1, var6, var4, var6.anInt2512, var5 + var4, (byte) 4);
              var5 -= var6.anInt2512;
              var4 += var6.anInt2512;
              if (!this.aClass3_Sub24_Sub4_3493
                  .method492(var5, var4, var6, (byte) 14, var1)) {
                continue;
              }
              break;
            }

            this.method469(var1, var6, var4, var5, var4 + var5, (byte) 4);
            var6.anInt2512 -= var5;
            break;
          }
        }
      }
  }

  public AudioStreamEncoder method414() {
    AudioSomethingSomething var1;
      do {
        var1 = (AudioSomethingSomething) this.aClass61_3489.getNext();
        if (var1 == null) {
          return null;
        }
      } while (var1.aClass3_Sub24_Sub1_2507 == null);

      return var1.aClass3_Sub24_Sub1_2507;
  }

  public void method415(int var1 ) {
    this.aClass3_Sub24_Sub2_3495.method415(var1);

      for (AudioSomethingSomething var3 = (AudioSomethingSomething) this.aClass61_3489
          .getFirst();
           var3 != null; var3 = (AudioSomethingSomething) this.aClass61_3489.getNext()) {
        if (!this.aClass3_Sub24_Sub4_3493.method504(var3, 121)) {
          int var2 = var1;

          while (true) {
            if (var2 > var3.anInt2512) {
              this.method464(var3, 7, var3.anInt2512);
              var2 -= var3.anInt2512;
              if (!this.aClass3_Sub24_Sub4_3493
                  .method492(var2, 0, var3, (byte) 14, null)) {
                continue;
              }
              break;
            }

            this.method464(var3, 7, var2);
            var3.anInt2512 -= var2;
            break;
          }
        }
      }
  }

  private void method469(int[] var1, AudioSomethingSomething var2, int var3, int var4,
                               int var5, byte var6) {
    if ((4 & this.aClass3_Sub24_Sub4_3493.anIntArray3518[var2.anInt2514]) != 0
        && (var2.anInt2506 < 0)) {
        int var7 =
            this.aClass3_Sub24_Sub4_3493.anIntArray3509[var2.anInt2514] / DummyClass60.sampleRate;

        while (true) {
          int var8 = (-var2.anInt2516 + 1048575 + var7) / var7;
          if (var4 < var8) {
            var2.anInt2516 += var4 * var7;
            break;
          }

          var4 -= var8;
          var2.aClass3_Sub24_Sub1_2507.method413(var1, var3, var8);
          int var9 = DummyClass60.sampleRate / 100;
          AudioStreamEncoder1 var11 = var2.aClass3_Sub24_Sub1_2507;
          int var10 = 262144 / var7;
          if (var10 < var9) {
            var9 = var10;
          }

          var2.anInt2516 += var7 * var8 - 1048576;
          if ((this.aClass3_Sub24_Sub4_3493.anIntArray3519[var2.anInt2514] == 0)) {
            var2.aClass3_Sub24_Sub1_2507 =
                AudioStreamEncoder1
                    .method432(var2.aClass3_Sub12_Sub1_2509, var11.method438(),
                        var11.method425(), var11.method451());
          } else {
            var2.aClass3_Sub24_Sub1_2507 =
                AudioStreamEncoder1
                    .method432(var2.aClass3_Sub12_Sub1_2509, var11.method438(),
                        0,
                        var11.method451());
            this.aClass3_Sub24_Sub4_3493.method501(var2,
                var2.aClass3_Sub15_2527.aShortArray2434[var2.anInt2520] < 0,
                (byte) -88);
            var2.aClass3_Sub24_Sub1_2507.method431(var9, var11.method425());
          }

          if (var2.aClass3_Sub15_2527.aShortArray2434[var2.anInt2520] < 0) {
            assert var2.aClass3_Sub24_Sub1_2507 != null;
            var2.aClass3_Sub24_Sub1_2507.method429(-1);
          }

          var3 += var8;
          var11.method417(var9);
          var11.method413(var1, var3, var5 - var3);
          if (var11.method445()) {
            this.aClass3_Sub24_Sub2_3495.method457(var11);
          }
        }
      }

      if (var6 == 4) {
        var2.aClass3_Sub24_Sub1_2507.method413(var1, var3, var4);
      }
  }

}
