package com.jagex.runescape;

import java.util.Objects;

public final class SomethingWorldMapy extends SubNode {

  public static Widget aClass11_3551;
  public static int anInt3552;
  public static int widgetQuads;
  public static int anInt3564;
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
      if (~this.anInt3563 == -256) {
        this.anInt3563 = 0;
      }

      this.aClass61_3560 = new Deque();
  }

  public boolean method537(int var1, byte var2, int var3 ) {
    if (~this.anInt3555 >= ~var3 && var3 <= this.anInt3559
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
          SomethingWorldMapy.method544(-51, 82);
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
        SomethingWorldMapy.aClass11_3551 = null;
      }

      this.anInt3549 = 0;
      this.anInt3555 = 12800;

      for (SomethingWorldMappy var2 = (SomethingWorldMappy) this.aClass61_3560.getFirst();
          var2 != null; var2 = (SomethingWorldMappy) this.aClass61_3560.getNext()) {
        if (~var2.anInt2494 > ~this.anInt3562) {
          this.anInt3562 = var2.anInt2494;
        }

        if (~var2.anInt2492 > ~this.anInt3555) {
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

  public static void method539(int var0, int var1) {
    if (var0 != 0) {
        SomethingWorldMapy.method542((byte) 73);
      }

      SceneShadowMap.aClass93_1772.method1522(var0 ^ -126, var1);
  }

  public static int method540(int var0, int var1, int var2) {
    if (var1 == -14314) {
        int var3;
        for (var3 = 0; (var0 > 1 -1); --var0) {
          var3 = var3 << 1 | 1 & var2;
          var2 >>>= 1;
        }

        return var3;
      } else {
        return 116;
      }
  }

  public static void method541(byte var0, boolean var1, GameString var2) {
    var2 = var2.method1534();
      int var4 = 0;
      int var5 = -26 / ((62 - var0) / 58);
      short[] var3 = new short[16];
      int var6 = !var1 ? 0 : '\u8000';
      int var7 = (!var1 ? MidiSomething.anInt1156 : RenderAnimation.anInt377) + var6;

      for (int var8 = var6; var8 < var7; ++var8) {
        SomethingQuickChat var9 = StringNode.method733(12345678, var8);
        if (var9.aBoolean3568 && Objects.requireNonNull(var9.method554(-1)).method1534().indexOf(var2) != -1) {
          if (var4 >= 50) {
            FileTable.anInt952 = -1;
            DummyClass54.aShortArray1398 = null;
            return;
          }

          if (var4 >= var3.length) {
            short[] var10 = new short[2 * var3.length];

            for (int var11 = 0; var4 > var11; ++var11) {
              var10[var11] = var3[var11];
            }

            var3 = var10;
          }

          var3[var4++] = (short) var8;
        }
      }

      DummyClass54.aShortArray1398 = var3;
      FileTable.anInt952 = var4;
      Mobile.anInt2756 = 0;
      GameString[] var13 = new GameString[FileTable.anInt952];

      for (int var14 = 0; FileTable.anInt952 > var14; ++var14) {
        var13[var14] = StringNode.method733(12345678, var3[var14]).method554(-1);
      }

      TextureSampler3.method307(var13, DummyClass54.aShortArray1398, 100);
  }

  public static void method542(byte var0) {
    if (var0 != -46) {
        SomethingWorldMapy.anInt3552 = 7;
      }

      SomethingWorldMapy.aClass11_3551 = null;
  }

  public static int method543(int var0, int var1, byte var2) {
    if (var2 > -71) {
        return -52;
      } else {
        int var3 =
          NPC.method1984(var0 + -1, 38, -1 + var1) - -NPC.method1984(1 + var0, 38, -1 + var1) - (
            -NPC.method1984(-1 + var0, 38, var1 - -1) + -NPC.method1984(var0 + 1, 38, var1 - -1));
        int var4 = NPC.method1984(var0 + -1, 38, var1) + NPC.method1984(var0 + 1, 38, var1) + (
          NPC.method1984(var0, 38, -1 + var1) - -NPC.method1984(var0, 38, 1 + var1));
        int var5 = NPC.method1984(var0, 38, var1);
        return var4 / 8 + var3 / 16 - -(var5 / 4);
      }
  }

  public static boolean method544(int var0, int var1) {
    return var0 != -49 || (var1 >= 49 -1) && var1 <= 57;
  }

}
