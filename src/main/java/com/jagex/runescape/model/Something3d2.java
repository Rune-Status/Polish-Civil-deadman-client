package com.jagex.runescape.model;

import com.jagex.runescape.statics.GlobalStatics_9;

public class Something3d2 extends Something3dRoot {

  private int anInt3018;
  private final int anInt3021;
  private final int anInt3022;
  private int anInt3023;
  private int anInt3024;
  private byte[] aByteArray3025;
  private final int anInt3026;
  private int anInt3028;
  private int anInt3029;


  public Something3d2(int var1, int var2, int var3, int var4, int var5, float var6,
      float var7,
      float var8 ) {
    super(var1, var2, var3, var4, var5);

    this.anInt3022 = (int) (4096.0F * var8);
      this.anInt3026 = (int) (var7 * 4096.0F);
      this.anInt3018 = this.anInt3021 = (int) (Math.pow(0.5D, -var6) * 4096.0D);
  }

  public void method2244(int var1, byte var2 ) {
    this.aByteArray3025[var1] = var2;
  }

  public final void method2231(byte var1) {
    this.anInt3018 = this.anInt3021;
      this.anInt3029 >>= 4;
      if (this.anInt3029 < 0) {
        this.anInt3029 = 0;
      } else if (this.anInt3029 > 255) {
        this.anInt3029 = 255;
      }

      this.method2244(this.anInt3028++, (byte) this.anInt3029);
      if (var1 == -92) {
        this.anInt3029 = 0;
      }
  }

  public final void method2233(int var1) {
    this.anInt3028 = 0;
      this.anInt3029 = 0;
      if (var1 != -949697716) {
        GlobalStatics_9.method2249((byte) -82, -73);
      }
  }

  public final void method2237(int var1, int var2, int var3) {
    if (var2 == 0) {
        this.anInt3023 = 4096;
        this.anInt3024 = -(var1 >= 0 ? var1 : -var1) + this.anInt3026;
        this.anInt3024 = this.anInt3024 * this.anInt3024 >> 12;
        this.anInt3029 = this.anInt3024;
      } else {
        this.anInt3023 = this.anInt3022 * this.anInt3024 >> 12;
        if (this.anInt3023 >= 0) {
          if (this.anInt3023 > 4096) {
            this.anInt3023 = 4096;
          }
        } else {
          this.anInt3023 = 0;
        }

        this.anInt3024 = -(var1 >= 0 ? var1 : -var1) + this.anInt3026;
        this.anInt3024 = this.anInt3024 * this.anInt3024 >> 12;
        this.anInt3024 = this.anInt3024 * this.anInt3023 >> 12;
        this.anInt3029 += this.anInt3018 * this.anInt3024 >> 12;
        this.anInt3018 = this.anInt3021 * this.anInt3018 >> 12;
      }

      if (var3 != -20975) {
        this.method2244(-80, (byte) -24);
      }
  }

}
