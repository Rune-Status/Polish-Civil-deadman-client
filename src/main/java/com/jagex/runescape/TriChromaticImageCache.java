package com.jagex.runescape;

public final class TriChromaticImageCache {

  public static GameString aClass94_1363 = GameString.create("Clientscript error in: ");
  public static byte[] aByteArray1364 = new byte['\u8080'];
  public static FileUnpacker aClass153_1370;
  public static FileUnpacker aClass153_1372;
  public static int[][] anIntArrayArray1373;
  public static GameString aClass94_1374;
  public static int cameraTileX;
  public static FileUnpacker materials;
  public static GameString aClass94_1377;
  public static FileUnpacker aClass153_1378;
  public static GameString aClass94_1380;
  public static SoftwareDirectColorSprite aClass3_Sub28_Sub16_Sub2_1381;

  static {
    int var0 = 0;

    for (int var1 = 0; var1 < 256; ++var1) {
      for (int var2 = 0; var2 <= var1; ++var2) {
        TriChromaticImageCache.aByteArray1364[var0++] = (byte) ((int) (255.0D / Math.sqrt(
            ('\uffff' + var2 * var2 + var1 * var1) / 65535.0F)));
      }
    }

    TriChromaticImageCache.aClass94_1374 = GameString.create("zap");
    TriChromaticImageCache.aClass94_1377 = GameString.create("Abbrechen");
    TriChromaticImageCache.anIntArrayArray1373 = new int[104][104];
    TriChromaticImageCache.aClass94_1380 = GameString.create(")4p=");
  }

  public boolean aBoolean1379;
  private int[][][] anIntArrayArrayArray1362;
  private int anInt1365 = -1;
  private Deque aClass61_1366 = new Deque();
  private final int anInt1367;
  private int anInt1368;
  private final int anInt1369;
  private TriChromaticImageBuffer[] aClass3_Sub20Array1371;

  public TriChromaticImageCache(int var1, int var2, int var3 ) {
    this.anInt1369 = var2;
      this.anInt1367 = var1;
      this.aClass3_Sub20Array1371 = new TriChromaticImageBuffer[this.anInt1369];
      this.anIntArrayArrayArray1362 = new int[this.anInt1367][3][var3];
  }

  public int[][][] method1589(byte var1 ) {
    if (~this.anInt1369 == ~this.anInt1367) {
        if (var1 > -12) {
          this.anInt1365 = -104;
        }

        for (int var2 = 0; ~this.anInt1367 < ~var2; ++var2) {
          this.aClass3_Sub20Array1371[var2] = SomethingQuickChat2.aClass3_Sub20_3532;
        }

        return this.anIntArrayArrayArray1362;
      } else {
        throw new RuntimeException("Can only retrieve a full image cache");
      }
  }

  public void method1590(byte var1 ) {
    if (var1 < -1) {
        for (int var2 = 0; ~this.anInt1367 < ~var2; ++var2) {
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

  public int[][] method1594(byte var1, int var2 ) {
    int var3 = -50 % ((var1 - -57) / 57);
      if (this.anInt1367 == this.anInt1369) {
        this.aBoolean1379 = null == this.aClass3_Sub20Array1371[var2];
        this.aClass3_Sub20Array1371[var2] = SomethingQuickChat2.aClass3_Sub20_3532;
        return this.anIntArrayArrayArray1362[var2];
      } else {
        if (1 == this.anInt1367) {
          this.aBoolean1379 = this.anInt1365 != var2;
          this.anInt1365 = var2;
          return this.anIntArrayArrayArray1362[0];
        } else {
          TriChromaticImageBuffer var4 = this.aClass3_Sub20Array1371[var2];
          if (null == var4) {
            this.aBoolean1379 = true;
            if (~this.anInt1368 > ~this.anInt1367) {
              var4 = new TriChromaticImageBuffer(var2, this.anInt1368);
              ++this.anInt1368;
            } else {
              TriChromaticImageBuffer var5 =
                  (TriChromaticImageBuffer) this.aClass61_1366.method1212(2);
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

  public static void method1591(boolean var0, AudioStreamEncoder var1) {
    if (var1.aClass3_Sub12_2544 != null) {
        var1.aClass3_Sub12_2544.anInt2374 = 0;
      }

      var1.aBoolean2545 = false;

      for (AudioStreamEncoder var2 = var1.method411(); var2 != null; var2 = var1.method414()) {
        TriChromaticImageCache.method1591(true, var2);
      }

      if (!var0) {
        TriChromaticImageCache.cameraTileX = -103;
      }
  }

  public static void method1592(byte var0) {
    TriChromaticImageCache.materials = null;
      TriChromaticImageCache.aClass153_1378 = null;
      TriChromaticImageCache.anIntArrayArray1373 = null;
      TriChromaticImageCache.aClass94_1363 = null;
      TriChromaticImageCache.aClass3_Sub28_Sub16_Sub2_1381 = null;
      if (var0 > 25) {
        TriChromaticImageCache.aClass94_1377 = null;
        TriChromaticImageCache.aClass94_1380 = null;
        TriChromaticImageCache.aClass153_1372 = null;
        TriChromaticImageCache.aClass153_1370 = null;
        TriChromaticImageCache.aByteArray1364 = null;
        TriChromaticImageCache.aClass94_1374 = null;
      }
  }

  public static void method1593(int var0, FileUnpacker var1) {
    DummyClass14.titleBackgroundFileId = var1.getFileId(SomethingQuickChat.TITLE_BACKGROUND);
      BitVariable.logoFileId = var1.getFileId(DummyClass53.LOGO);
  }
}
