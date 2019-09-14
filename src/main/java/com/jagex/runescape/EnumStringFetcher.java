package com.jagex.runescape;

public final class EnumStringFetcher implements Interface4 {

  public static FileUnpacker animationFrames;
  public static int anInt2161 = -1;
  public static int anInt2162;
  public static GameString aClass94_2163 = GameString.create("Gegenstand f-Ur Mitglieder");
  public static GameString aClass94_2164 = GameString.create("hint_mapedge");
  public static int anInt2165;
  public static int lastPacketId1;
  public static short[] aShortArray2167 = {
    (short) 30, (short) 6, (short) 31, (short) 29, (short) 10, (short) 44, (short) 37, (short) 57
  };
  public static GameString aClass94_2168 = GameString.create("<br>");

  public GameString method20(int var1, int[] enums, int var3, long key) {
    if (var1 == 0) {
        ClientScriptEnum var6 = TextureSampler36.getEnum(enums[0], true);
        return var6.getString((int) key, (byte) 120);
      } else {
        if (var1 != 1 && (var1 != 10)) {
          return var1 != 6 && var1 != 7 && var1 != 11 ?
              (var3 != 4936 ? null : null) :
              TextureSampler36.getEnum(enums[0], true)
                  .getString((int) key, (byte) -69);
        } else {
          ItemConfig var8 = DummyClass35.getItemConfig((int) key, (byte) 82);
          return var8.aClass94_770;
        }
      }
  }

  public static void printError(int var0, String var1) {
    System.out.println("Error: " + WidgetUpdate.createIndexedColorSprite("%0a", "\n", 105, var1));
    if (var0 < 33) {
      EnumStringFetcher.aClass94_2163 = null;
    }

  }

  public static Widget getWidget(byte var0, int var1) {
    int var2 = var1 >> 16;
      if (var0 < 108) {
        EnumStringFetcher.getWidget((byte) 87, 19);
      }

      int var3 = '\uffff' & var1;
      if (SceneNode.aClass11ArrayArray1834[var2] == null
        || SceneNode.aClass11ArrayArray1834[var2][var3] == null) {
        boolean var4 = MovedStatics0.method57(var2, 104);
        if (!var4) {
          return null;
        }
      }

      return SceneNode.aClass11ArrayArray1834[var2][var3];
  }

  public static void method833(byte var0) {
    EnumStringFetcher.aShortArray2167 = null;
      EnumStringFetcher.animationFrames = null;
      EnumStringFetcher.aClass94_2164 = null;
      EnumStringFetcher.aClass94_2168 = null;
      int var1 = 124 / ((var0 - 28) / 41);
      EnumStringFetcher.aClass94_2163 = null;
  }

  public static void method834(byte var0) {
    OndemandRequester.method1250(43, false);
      System.gc();
      DummyClass26.setState(25, 5);
      if (var0 >= -80) {
        EnumStringFetcher.lastPacketId1 = -89;
      }
  }

  public static boolean method835(int var0, int var1, int var2, int var3, int var4, int var5,
                                 SceneNode var6, int var7, long var8) {
    if (var6 == null) {
      return true;
    } else {
      int var10 = var1 * 128 + 64 * var4;
      int var11 = var2 * 128 + 64 * var5;
      return DummyClass42.addNodeToSceneGraph(var0, var1, var2, var4, var5, var10, var11, var3,
        var6, var7, false, var8);
    }
  }

}
