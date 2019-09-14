package com.jagex.runescape;

public final class TextureSampler35 extends AbstractTextureSampler {

  private static GameString aClass94_3334 = GameString.create("wave2:");
  public static int anInt3332 = 50;
  public static GameString[] aClass94Array3317 = new GameString[TextureSampler35.anInt3332];
  public static int[] anIntArray3318 = new int[TextureSampler35.anInt3332];
  public static int[] anIntArray3319 = new int[TextureSampler35.anInt3332];
  public static int rights;
  public static int[] anIntArray3321 = {76, 8, 137, 4, 0, 1, 38, 2, 19};
  public static int anInt3323 = 50;
  public static GameString aClass94_3324 = GameString.create(" loggt sich ein)3");
  public static GameString aClass94_3326 = GameString.create("leuchten1:");
  public static int[] anIntArray3327 = new int[TextureSampler35.anInt3332];
  public static int[] anIntArray3328 = new int[8];
  public static int[] anIntArray3329 = new int[TextureSampler35.anInt3332];
  public static GameString ASSIST_REQ = GameString.create(":assistreq:");
  public static int[] anIntArray3331 = new int[TextureSampler35.anInt3332];
  public static byte[][] aByteArrayArray3335;
  public static int[] anIntArray3336 = new int[TextureSampler35.anInt3332];
  public static int[] anIntArray3337 = new int[TextureSampler35.anInt3332];
  public static GameString aClass94_3325 = TextureSampler35.aClass94_3334;
  public static GameString aClass94_3333 = TextureSampler35.aClass94_3334;
  private int anInt3322 = 4096;


  public TextureSampler35() {
    super(1, true);
  }

  public int[] method154(int var1, byte var2 ) {
    int var3 = 42 / ((30 - var2) / 36);
      int[] var4 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        int[] var5 = this
            .method152(0, var1 - 1 & TriChromaticImageBuffer.anInt2487, 32755);
        int[] var6 = this.method152(0, var1, 32755);
        int[] var7 = this
            .method152(0, TriChromaticImageBuffer.anInt2487 & var1 + 1, 32755);

        for (int var8 = 0; SomethingLight0.anInt1559 > var8; ++var8) {
          int var9 = (var7[var8] + -var5[var8]) * this.anInt3322;
          int var10 = this.anInt3322 * (-var6[var8 - 1 & RenderAnimation.anInt396] + var6[
            RenderAnimation.anInt396 & var8 - -1]);
          int var11 = var10 >> 12;
          int var12 = var9 >> 12;
          int var13 = var11 * var11 >> 12;
          int var14 = var12 * var12 >> 12;
          int var15 =
            (int) (Math.sqrt((4096 + var14 + var13) / 4096.0F) * 4096.0D);
          int var16 = var15 != 0 ? 16777216 / var15 : 0;
          var4[var8] = 4096 + -var16;
        }
      }

      return var4;
  }

  public void parseConfig(int var1, Buffer var2, boolean var3 ) {
    if (!var3) {
        TextureSampler35.method294((byte) -57);
      }

      if (var1 == 0) {
        this.anInt3322 = var2.readUnsignedShort();
      }
  }

  public static void method294(byte var0) {
    TextureSampler35.anIntArray3327 = null;
      TextureSampler35.anIntArray3337 = null;
      TextureSampler35.aClass94_3326 = null;
      TextureSampler35.aClass94Array3317 = null;
      TextureSampler35.aClass94_3334 = null;
      TextureSampler35.anIntArray3328 = null;
      TextureSampler35.ASSIST_REQ = null;
      TextureSampler35.aClass94_3324 = null;
      TextureSampler35.anIntArray3319 = null;
      TextureSampler35.aByteArrayArray3335 = null;
      TextureSampler35.anIntArray3329 = null;
      TextureSampler35.aClass94_3333 = null;
      TextureSampler35.anIntArray3336 = null;
      int var1 = -62 % ((-59 - var0) / 47);
      TextureSampler35.anIntArray3321 = null;
      TextureSampler35.anIntArray3318 = null;
      TextureSampler35.anIntArray3331 = null;
      TextureSampler35.aClass94_3325 = null;
  }

}
