package com.jagex.runescape;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;

public final class LightIntensity {

  public static AbstractDirectColorSprite aClass3_Sub28_Sub16_895;
  public static GameString aClass94_897 =
    GameStringStatics.create("Liste des mises -9 jour charg-Be");
  public static int[] variables = new int[2500];
  public static int anInt900;
  public static GameString aClass94_901 = GameStringStatics.create(
    "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");
  public static int anInt902 = 100;
  public static int anInt903;
  public static int[] anIntArray904 = new int[200];
  public static GameString aClass94_905 = GameStringStatics.create("Sprites charg-Bs");
  public static int anInt906;
  public int anInt896;
  public int anInt899 = 2048;
  public int anInt907;
  public int anInt908 = 2048;

  public void method1190(int var1, Buffer var2, int var3 ) {
    while (true) {
        int var4 = var2.readUnsignedByte();
        if (var4 == 0) {
          if (var1 != 2) {
            LightIntensity.aClass94_905 = null;
          }

          return;
        }

        this.method1191(var4, var2, var3, true);
      }
  }

  private void method1191(int var1, Buffer var2, int var3, boolean var4) {
    if (var1 == 1) {
        this.anInt896 = var2.readUnsignedByte();
      } else {
        if (var1 == 2) {
          this.anInt908 = var2.readUnsignedShort();
        } else if ((var1 == 3)) {
          this.anInt899 = var2.readUnsignedShort();
        } else if (var1 == 4) {
          this.anInt907 = var2.method787((byte) 46);
        }
      }

      if (!var4) {
        LightIntensity.method1192((byte) 123);
      }
  }

  public static void method1192(byte var0) {
    LightIntensity.aClass94_897 = null;
      LightIntensity.variables = null;
      LightIntensity.aClass94_901 = null;
      LightIntensity.anIntArray904 = null;
      LightIntensity.aClass94_905 = null;
      if (var0 == -86) {
        LightIntensity.aClass3_Sub28_Sub16_895 = null;
      }
  }

}
