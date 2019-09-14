package com.jagex.runescape;

public final class VariableUpdate extends Node {

  public static int[] anIntArray2292 = new int[1000];
  public static int anInt2293 = -1;
  public static int anInt2294;
  public long timestamp;


  public VariableUpdate() {
  }

  public VariableUpdate(long var1 ) {
    this.timestamp = var1;
  }

  public static void method120(int var0) {
    VariableUpdate.anIntArray2292 = null;
      if (var0 != 1000) {
        VariableUpdate.anInt2293 = 55;
      }
  }

  public static int method121(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
    if ((var2 & 1) == var5) {
        int var7 = var4;
        var4 = var3;
        var3 = var7;
      }

      var1 &= 3;
      return var1 != 0 ?
        ((var1 != 1) ? (var1 != 2 ? -var0 + 7 + 1 - var3 : -var6 + (7 - (var4 - 1))) : var0) :
        var6;
  }

  public static void method122(int var0) {
    int var1 = -101 / ((var0 - 10) / 59);
      SceneNode.aClass11ArrayArray1834 = new Widget[TextureSampler3.aClass153_3361.method2121(0)][];
      HashTable.aBooleanArray1703 = new boolean[TextureSampler3.aClass153_3361.method2121(0)];
  }

  public static GameString method123(int var0, int var1) {
    if (var1 < 100000) {
        return RenderAnimation.concat(new GameString[] {
          DummyClass42.aClass94_888, SomethingScene.toString(var1), SomethingScene.aClass94_1076
        });
      } else {
        if (var0 != 1000) {
          VariableUpdate.method123(-54, 54);
        }

        return var1 >= 10000000 ? RenderAnimation.concat(new GameString[] {
          TextureSampler28.aClass94_3307, SomethingScene.toString(var1 / 1000000),
          TextureSampler30.aClass94_3117, SomethingScene.aClass94_1076
        }) : RenderAnimation.concat(new GameString[] {
          ClanChatUser.aClass94_2477, SomethingScene.toString(var1 / 1000),
          AnimationSomething.aClass94_3584, SomethingScene.aClass94_1076
        });
      }
  }

}
