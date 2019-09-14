package com.jagex.runescape;

public class Node {

  public static int anInt72;
  public static boolean[] aBooleanArray73 = new boolean[200];
  public static GameString[] aClass94Array75 = new GameString[1000];
  public static GameString aClass94_77 = GameString.create("Objet d(Wabonn-Bs");
  public static Deque aClass61_78 = new Deque();
  public long key;
  public Node nextNode;
  public Node prevNode;

  public final boolean method82(int var1) {
    return var1 == 0 && this.prevNode != null;
  }

  public final void unlinkNode() {
    if (this.prevNode != null) {
      this.prevNode.nextNode = this.nextNode;
      this.nextNode.prevNode = this.prevNode;
      this.prevNode = null;
      this.nextNode = null;
    }
  }

  public static void method83(byte var0) {
    Node.aClass94_77 = null;
    Node.aClass94Array75 = null;
    if (var0 != 30) {
      Node.method84(null, 89);
    }

    Node.aClass61_78 = null;
    Node.aBooleanArray73 = null;
  }

  public static void method84(GameString var0, int var1) {
    if (var1 != -801) {
      Node.aClass94_77 = null;
    }

    int var2 = FloorUnderlay.method1602(0, var0);
    if (~var2 != 0) {
      AbstractObjectNode.method565((byte) 86,
          DummyClass25.aClass131_1624.aShortArray1727[var2],
          DummyClass25.aClass131_1624.aShortArray1718[var2]);
    }
  }

  public static void method85(byte var0) {
    SceneShadowMap.aClass93_1772.method1523((byte) -99);
  }

  public static void setupLanguagePacket(int var1) {
    if (var1 != 0) {
      if (var1 == 1) {
        Structure.method607(false);
      } else {
        if (var1 != 2) {
          throw new RuntimeException("Invalid language ID.");
        }
        BZipDecompressorState.method850((byte) 121);
      }

    }
  }

  public static DisplayMode[] method88(byte var0) {
    if (var0 != 28) {
      Node.aBooleanArray73 = null;
    }

    if (DummyClass42.aClass106Array890 == null) {
      DisplayMode[] var1 = OndemandFileRequest
          .method596(var0 ^ 22, DummyClass35.signLink);
      DisplayMode[] var2 = new DisplayMode[var1.length];
      int var3 = 0;

      label58:
      for (int var4 = 0; var4 < var1.length; ++var4) {
        DisplayMode var5 = var1[var4];
        if ((var5.anInt1450 <= 0 || var5.anInt1450 >= 24)
            && (var5.anInt1447 >= 801 -1)
            && var5.anInt1449 >= 600) {
          for (int var6 = 0; var3 > var6; ++var6) {
            DisplayMode var7 = var2[var6];
            if (var5.anInt1447 == var7.anInt1447
                && (var7.anInt1449 == var5.anInt1449)) {
              if (var5.anInt1450 > var7.anInt1450) {
                var2[var6] = var5;
              }
              continue label58;
            }
          }

          var2[var3] = var5;
          ++var3;
        }
      }

      DummyClass42.aClass106Array890 = new DisplayMode[var3];
      ArrayUtils.copy(var2, 0, DummyClass42.aClass106Array890, 0, var3);
      int[] var9 = new int[DummyClass42.aClass106Array890.length];

      for (int var10 = 0; DummyClass42.aClass106Array890.length > var10;
          ++var10) {
        DisplayMode var11 = DummyClass42.aClass106Array890[var10];
        var9[var10] = var11.anInt1449 * var11.anInt1447;
      }

      DummyClass58.method1658(21, var9, DummyClass42.aClass106Array890);
    }

    return DummyClass42.aClass106Array890;
  }

  public static void method89(boolean var0, FileUnpacker var1,
      FileUnpacker var2, FileUnpacker var3,
      FileUnpacker var4) {
    SomethingSceneJ.aClass153_323 = var2;
    TriChromaticImageCache.aClass153_1378 = var1;
    TextureSampler3.aClass153_3361 = var3;
    DummyClass25.aClass153_1628 = var4;
    if (!var0) {
      Node.setupLanguagePacket(11);
    }

    SceneNode.aClass11ArrayArray1834 = new Widget[TextureSampler3.aClass153_3361
        .method2121(0)][];
    HashTable.aBooleanArray1703 = new boolean[TextureSampler3.aClass153_3361
        .method2121(0)];
  }

}
