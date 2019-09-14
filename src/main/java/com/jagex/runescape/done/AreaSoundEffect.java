package com.jagex.runescape.done;

import com.jagex.runescape.*;
import com.jagex.runescape.node.Node;

public final class AreaSoundEffect extends Node {

  public int anInt2307;
  public int anInt2308;
  public int anInt2310;
  public AudioStreamEncoder1 aClass3_Sub24_Sub1_2312;
  public int anInt2314;
  public AudioStreamEncoder1 aClass3_Sub24_Sub1_2315;
  public int anInt2316;
  public GameObjectConfig aClass111_2320;
  public int anInt2321;
  public int anInt2322;
  public NPC aClass140_Sub4_Sub2_2324;
  public int anInt2325;
  public int anInt2326;
  public Player aClass140_Sub4_Sub1_2327;
  public int anInt2328;
  public boolean aBoolean2329;
  public int anInt2332;
  public int[] anIntArray2333;

  public void method134(int var1 ) {
    int var2 = this.anInt2332;
      if (this.aClass111_2320 != null) {
        GameObjectConfig var3 = this.aClass111_2320.method1685(0);
        if (var3 == null) {
          this.anInt2332 = -1;
          this.anIntArray2333 = null;
          this.anInt2325 = 0;
          this.anInt2328 = 0;
          this.anInt2310 = 0;
        } else {
          this.anInt2325 = var3.anInt1515;
          this.anInt2332 = var3.anInt1512;
          this.anInt2310 = var3.anInt1518;
          this.anInt2328 = var3.anInt1484 * 128;
          this.anIntArray2333 = var3.anIntArray1539;
        }
      } else if (this.aClass140_Sub4_Sub2_2324 == null) {
        if (this.aClass140_Sub4_Sub1_2327 != null) {
          this.anInt2332 = DummyClass50.method1398(var1 - 1,
              this.aClass140_Sub4_Sub1_2327);
          this.anInt2328 = 128 * this.aClass140_Sub4_Sub1_2327.anInt3969;
        }
      } else {
        int var6 = ISAACCipher.method1232(this.aClass140_Sub4_Sub2_2324, var1 ^ -2);
        if (var2 != var6) {
          NpcConfiguration var4 = this.aClass140_Sub4_Sub2_2324.config;
          this.anInt2332 = var6;
          if (var4.anIntArray1292 != null) {
            var4 = var4.method1471((byte) -87);
          }

          if (var4 != null) {
            this.anInt2328 = var4.anInt1291 * 128;
          } else {
            this.anInt2328 = 0;
          }
        }
      }

      if (var1 == 1) {
        if (this.anInt2332 != var2 && this.aClass3_Sub24_Sub1_2312 != null) {
          MonoChromaticImageBuffer.aClass3_Sub24_Sub2_2563.method461(
              this.aClass3_Sub24_Sub1_2312);
          this.aClass3_Sub24_Sub1_2312 = null;
        }

      }
  }

}
