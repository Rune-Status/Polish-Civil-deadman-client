package com.jagex.runescape;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.opengl.GLStatics;

public final class MonoChromaticImageCache {

  public static ObjectCache aClass93_1569 = new ObjectCache(200);
  public static BufferedFile tableIndexFile;
  public static long[] aLongArray1574 = new long[100];
  public static GameString aClass94_1575 = GameStringStatics.create(" weitere Optionen");
  public static int[] anIntArray1578 = new int[500];
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
        MonoChromaticImageCache.method1711(118, 75);
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
                  (MonoChromaticImageBuffer) this.aClass61_1577.method1212(2);
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

  public static void method1704(int var0) {
    MonoChromaticImageCache.aClass93_1569 = null;
      if (var0 != 65536) {
        GLStatics.method1705(-109, -68);
      }

      MonoChromaticImageCache.anIntArray1578 = null;
      MonoChromaticImageCache.aLongArray1574 = null;
      MonoChromaticImageCache.aClass94_1575 = null;
      MonoChromaticImageCache.tableIndexFile = null;
  }

  public static AbstractDirectColorSprite method1707(int var0, int var1, boolean var2, int var3,
                                                    int var4, int var5) {
    if (var5 == 65536) {
        int var7 = (!var2 ? 0 : 65536) + var1 + (var0 << 17) + (var4 << 19);
        long var8 = var7 * 3849834839L + 3147483667L * var3;
        AbstractDirectColorSprite var10 =
            (AbstractDirectColorSprite) MouseRecorder.aClass93_1013.get(var8);
        if (var10 == null) {
          DummyClass40.aBoolean837 = false;
          var10 = GlobalStatics_0
              .method1570(var4, (byte) 13, false, var1, var2, var0, var3,
                  false);
          if (var10 != null && !DummyClass40.aBoolean837) {
            MouseRecorder.aClass93_1013.get((byte) -79, var10, var8);
          }

          return var10;
        } else {
          return var10;
        }
      } else {
        return null;
      }
  }

  public static void method1708(int var0, int var1, int var2) {
    if (var2 == -2553) {
        WidgetUpdate var3 = AudioStreamEncoder3.method466(4, 13, var1);
        var3.g((byte) 33);
        var3.anInt3598 = var0;
      }
  }

  public static void method1711(int var0, int var1) {
    SomethingQuickChat.aClass93_3572.method1522(-127, var0);
      DummyClass15.aClass93_1874.method1522(var1 - 383, var0);
      MouseRecorder.aClass93_1013.method1522(var1 ^ -132, var0);
      if (var1 != 255) {
        MonoChromaticImageCache.method1711(20, 87);
      }
  }

}
