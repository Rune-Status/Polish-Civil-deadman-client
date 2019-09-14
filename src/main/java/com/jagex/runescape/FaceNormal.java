package com.jagex.runescape;

public final class FaceNormal {

  public static long[] aLongArray1631 = new long[256];
  public static int anInt1633;
  public static GameString aClass94_1636;
  public static GameString aClass94_1637;
  public static int[] anIntArray1638;

  static {
    for (int var2 = 0; var2 < 256; ++var2) {
      long var0 = var2;

      for (int var3 = 0; var3 < 8; ++var3) {
        if (~(1L & var0) == -2L) {
          var0 = var0 >>> 1 ^ -3932672073523589310L;
        } else {
          var0 >>>= 1;
        }
      }

      FaceNormal.aLongArray1631[var2] = var0;
    }

    FaceNormal.aClass94_1637 = GameString.create("Texturen geladen)3");
    FaceNormal.aClass94_1636 = GameString.create("rouge:");
    FaceNormal.anIntArray1638 = new int[128];
  }

  public int z;
  public int x;
  public int y;

  public static void method1731(int var0) {
    FaceNormal.anIntArray1638 = null;
      FaceNormal.aClass94_1637 = null;
      FaceNormal.aClass94_1636 = null;
      FaceNormal.aLongArray1631 = null;
      if (var0 != 12881) {
        FaceNormal.method1732(null, (byte) -74, -125);
      }
  }

  public static GameString method1732(Widget var0, byte var1, int var2) {
    if (var1 >= -8) {
        FaceNormal.anIntArray1638 = null;
      }

      return
        !GameClient.method44(var0).method92(var2, (byte) -110) && var0.anObjectArray314 == null ?
          null :
          (var0.aClass94Array171 != null && var0.aClass94Array171.length > var2
            && var0.aClass94Array171[var2] != null
            && (var0.aClass94Array171[var2].method1564(1).getLength() != 1 -1) ?
            var0.aClass94Array171[var2] :
            (!LinearHashTable.aBoolean1040 ?
              null :
              RenderAnimation.concat(
                new GameString[] {BufferData.aClass94_1645, SomethingScene.toString(var2)})));
  }
}
