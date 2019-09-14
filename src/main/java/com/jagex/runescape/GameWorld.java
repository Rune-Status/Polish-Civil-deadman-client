package com.jagex.runescape;

import java.util.Objects;

public final class GameWorld extends AbstractGameWorld {

  private static GameString aClass94_2619 = GameString.create("Loaded update list");
  public static int anInt2622;
  public static boolean aBoolean2623 = true;
  public static int deltaTime = 20;
  public static AbstractAudioOutputStream audioOutputStream0;
  public static GameString aClass94_2628 = GameString.create("Stufe: ");
  public static GameString aClass94_2624 = GameWorld.aClass94_2619;
  public GameString aClass94_2620;
  public int anInt2621;
  public GameString aClass94_2625;

  public GameWorldSomething method1078(int var1 ) {
    int var2 = -35 / ((var1 - 0) / 56);
      return DummyClass25.aClass26Array1627[this.anInt721];
  }

  public static void method1076(int var0) {
    DummyClass14.aClass93_1964.method1524(3);
      int var1 = -86 % ((var0 - -55) / 41);
  }

  public static void method1077(int var0) {
    GameWorld.aClass94_2619 = null;
      GameWorld.aClass94_2624 = null;
      GameWorld.audioOutputStream0 = null;
      if (var0 != 0) {
        GameWorld.deltaTime = 89;
      }

      GameWorld.aClass94_2628 = null;
  }

  public static int getInventoryFreeSpace(int var0, byte var1) {
    if (var0 < 0) {
        return 0;
      } else {
        Inventory var2 = (Inventory) SceneGraphTile.aClass130_2220.get(var0);
        if (var2 == null) {
          return Objects.requireNonNull(BufferObject.method2069(var0, -126)).size;
        } else if (var1 > -56) {
          return -13;
        } else {
          int var3 = 0;

          for (int var4 = 0; var4 < var2.ids.length; ++var4) {
            if (~var2.ids[var4] == 0) {
              ++var3;
            }
          }

          var3 += Objects.requireNonNull(BufferObject.method2069(var0, -100)).size + -var2.ids.length;
          return var3;
        }
      }
  }

}
