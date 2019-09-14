package com.jagex.runescape;

public final class LightIntensity {

  public static AbstractDirectColorSprite aClass3_Sub28_Sub16_895;
  public static GameString aClass94_897 =
    GameString.create("Liste des mises -9 jour charg-Be");
  public static int[] variables = new int[2500];
  public static int anInt900;
  public static GameString aClass94_901 = GameString.create(
    "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");
  public static int anInt902 = 100;
  public static int anInt903;
  public static int[] anIntArray904 = new int[200];
  public static GameString aClass94_905 = GameString.create("Sprites charg-Bs");
  public static int anInt906;
  public int anInt896;
  public int anInt899 = 2048;
  public int anInt907;
  public int anInt908 = 2048;

  public void method1190(int var1, Buffer var2, int var3 ) {
    try {
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
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "ic.A(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
    }
  }

  private void method1191(int var1, Buffer var2, int var3, boolean var4) {
    try {
      if (1 == var1) {
        this.anInt896 = var2.readUnsignedByte();
      } else {
        if (var1 == 2) {
          this.anInt908 = var2.readUnsignedShort();
        } else if (-4 == ~var1) {
          this.anInt899 = var2.readUnsignedShort();
        } else if (4 == var1) {
          this.anInt907 = var2.method787((byte) 46);
        }
      }

      if (!var4) {
        LightIntensity.method1192((byte) 123);
      }

    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "ic.C(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + var4 + ')');
    }
  }

  public static void method1192(byte var0) {
    try {
      LightIntensity.aClass94_897 = null;
      LightIntensity.variables = null;
      LightIntensity.aClass94_901 = null;
      LightIntensity.anIntArray904 = null;
      LightIntensity.aClass94_905 = null;
      if (var0 == -86) {
        LightIntensity.aClass3_Sub28_Sub16_895 = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ic.B(" + var0 + ')');
    }
  }

}
