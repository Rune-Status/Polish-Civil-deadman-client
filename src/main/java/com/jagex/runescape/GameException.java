package com.jagex.runescape;

public final class GameException extends RuntimeException {

  public static int[] anIntArray2113 = {2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0};
  public static HintMarker[] aClass96Array2114 = new HintMarker[4];
  public static int anInt2115 = -1;
  public static GameString aClass94_2116 = GameString.create("Hidden)2use");
  public static GameString[] DEFAULT_INVENTORY_OPTIONS;
  public static int anInt2120;
  public static String serverHost;
  public String source;
  public Throwable aThrowable2118;


  public GameException(Throwable var1, String var2 ) {
    this.source = var2;
    this.aThrowable2118 = var1;
  }

  public static void method2285(int var0, int var1, int var2, int var3, boolean var4, int var5) {
    StringNode.anInt2587 = var1;
      if (!var4) {
        TextureSampler9.anInt3103 = var5;
        GroundItem.anInt2938 = var0;
        BZipDecompressorState.anInt144 = var3;
        ClientScript.anInt3695 = var2;
      }
  }

  public static int method2286(byte var0) {
    if (var0 != -5) {
        GameException.serverHost = null;
      }

      return 6;
  }

  public static int method2287(int var0, byte var1) {
    return (~var0 > -98 || ~var0 < -123) && (~var0 > -225 || ~var0 < -255 ||
        var0 == 247) ?
        (~var0 != -256 ? (var0 != 156 ? (var1 != 59 ? 72 : var0) : 140) : 159) :
        var0 + -32;
  }

  public static void method2288(boolean var0) {
    GameException.anIntArray2113 = null;
    GameException.aClass94_2116 = null;
    GameException.aClass96Array2114 = null;
    GameException.DEFAULT_INVENTORY_OPTIONS = null;
    if (var0) {
      GameException.method2287(-64, (byte) -87);
    }

    GameException.serverHost = null;
  }

}
