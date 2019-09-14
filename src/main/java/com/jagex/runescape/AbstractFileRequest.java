package com.jagex.runescape;

public abstract class AbstractFileRequest extends SubNode {

  private static GameString aClass94_3626 = GameString.create("Created gameworld");
  public static int brightnessSetting = 3;
  public static int anInt3627;
  public static int anInt3630;
  public static int anInt3631;
  public static GameString aClass94_3633 = GameString.create("Textures charg-Bes");
  public static GameString aClass94_3634 = GameString.create("Liste des serveurs charg-Be");
  public static GameString aClass94_3629 = AbstractFileRequest.aClass94_3626;
  public boolean aBoolean3628;
  public volatile boolean aBoolean3632 = true;
  public boolean aBoolean3635;

  public abstract int method586(boolean var1 );

  public abstract byte[] method587(boolean var1 );

  public static void method588(byte var0) {
    AbstractFileRequest.aClass94_3626 = null;
      AbstractFileRequest.aClass94_3634 = null;
      if (var0 != 120) {
        AbstractFileRequest.aClass94_3633 = null;
      }

      AbstractFileRequest.aClass94_3633 = null;
      AbstractFileRequest.aClass94_3629 = null;
  }

  public static void method589(int var0, int var1, int var2) {
    TextureSampler37.aBoolean3261 = true;
    CollisionMap.anInt1302 = var0;
    GZipDecompressor.anInt819 = var1;
    TextureSampler18.anInt4039 = var2;
    DummyClass32.anInt515 = -1;
    OndemandRequester.anInt999 = -1;
  }

  public static boolean method590(byte var0, int var1, int var2) {
    if (var2 == 11) {
        var2 = 10;
      }

      if (~var2 <= -6 && var2 <= 8) {
        var2 = 4;
      }

      GameObjectConfig var4 = DummyClass11.method2207(4, var1);
      return var4.method1684(115, var2);
  }

}
