package com.jagex.runescape;

public final class ProjectileNode extends SubNode {

  public static GameString aClass94_3771 = GameString.create("Chargement en cours)3)3)3");
  public static FileUnpacker animationBases;
  public static int primaryPort;
  public static GameString aClass94_3774 = GameString.create("clignotant1:");
  public static int anInt3775;
  public static Cache aClass47_3776 = new Cache(64);
  public static GameString aClass94_3777 = GameString.create(" x ");
  public static boolean aBoolean3779;
  public static int[] anIntArray3780 = new int[32];
  public Projectile projectile;


  public ProjectileNode(Projectile var1 ) {
    try {
      this.projectile = var1;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "ud.<init>(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  public static boolean method715(int var0, Widget var1) {
    try {
      if (var0 == var1.anInt189) {
        DummyClass13.anInt2023 = 250;
        return true;
      } else {
        return false;
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
          "ud.B(" + var0 + ',' + "null" + ')');
    }
  }

  public static void method716(int var0) {
    try {
      SceneShadowMap.aClass93_1772.method1524(3);
      if (var0 != 14073) {
        ProjectileNode.method717(9);
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ud.A(" + var0 + ')');
    }
  }

  public static void method717(int var0) {
    try {
      ProjectileNode.aClass94_3777 = null;
      ProjectileNode.aClass94_3774 = null;
      int var1 = 54 % ((48 - var0) / 56);
      ProjectileNode.anIntArray3780 = null;
      ProjectileNode.animationBases = null;
      ProjectileNode.aClass47_3776 = null;
      ProjectileNode.aClass94_3771 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ud.C(" + var0 + ')');
    }
  }

}
