package com.jagex.runescape.model;

import com.jagex.runescape.statics.GlobalStatics_9;

public class Something3d extends Something3dRoot {

  private int anInt3010;
  private final int[] anIntArray3014;
  private byte[] aByteArray3015;
  private int anInt3016;


  public Something3d(int var1, int var2, int var3, int var4, int var5, float var6 ) {
    super(var1, var2, var3, var4, var5);

    this.anIntArray3014 = new int[this.anInt2062];

      for (int var7 = 0; this.anInt2062 > var7; ++var7) {
        this.anIntArray3014[var7] =
          (short) ((int) (Math.pow(var6, var7) * 4096.0D));
      }
  }

  public void method2242(int var1, byte var2 ) {
    this.aByteArray3015[this.anInt3016++] = (byte) (127 + (((int) var2 & 255) >> 1));
  }

  public final void method2231(byte var1) {
    this.anInt3010 = Math.abs(this.anInt3010);
      if (var1 != -92) {
        this.method2231((byte) -112);
      }

      if (this.anInt3010 >= 4096) {
        this.anInt3010 = 4095;
      }

      this.method2242(this.anInt3016++, (byte) (this.anInt3010 >> 4));
      this.anInt3010 = 0;
  }

  public final void method2233(int var1) {
    if (var1 == -949697716) {
        this.anInt3016 = 0;
        this.anInt3010 = 0;
      }
  }

  public final void method2237(int var1, int var2, int var3) {
    this.anInt3010 += var1 * this.anIntArray3014[var2] >> 12;
      if (var3 != -20975) {
        GlobalStatics_9.method2239(-22, -68, -14, 89);
      }
  }

}
