package com.jagex.runescape;

import com.jagex.runescape.opengl.GlEnvironment;
import com.jagex.runescape.opengl.GlRenderer;

public final class TextureSampler1 extends AbstractTextureSampler {

  public static ObjectCache aClass93_3130 = new ObjectCache(4);
  public static GameString aClass94_3131 = GameString.create(" ");
  public static int b12FontFileId;
  public static GameString aClass94_3133 = GameString.create(")2");
  public static int anInt3136;
  public static Cache aClass47_3137 = new Cache(64);
  public static GameString FONT_B12 = GameString.create("b12_full");
  public static int[] anIntArray3139 = new int[14];
  public static GameString aClass94_3140 = GameString.create("overlay2");
  private int anInt3129;
  private int anInt3134;
  private int anInt3135;


  private TextureSampler1(int var1) {
    super(0, false);

    this.method218((byte) 75, var1);
  }

  public TextureSampler1() {
    this(0);
  }

  private void method218(byte var1, int var2) {
    this.anInt3134 = 4080 & var2 >> 4;
      this.anInt3135 = var2 << 4 & 4080;
      if (var1 == 75) {
        this.anInt3129 = (var2 & 16711680) >> 12;
      }
  }

  public void parseConfig(int var1, Buffer var2, boolean var3 ) {
    if (!var3) {
        TextureSampler1.method221(-64, null, null, null, 34);
      }

      if ((var1 == 0)) {
        this.method218((byte) 75, var2.readUnsignedMedium((byte) 82));
      }
  }

  public int[][] method166(int var1, int var2 ) {
    if (var1 != -1) {
        TextureSampler1.method222(-87, 26, 75, -56, 22, -68);
      }

      int[][] var3 = this.triChromaticImageCache
          .method1594((byte) -123, var2);
      if (this.triChromaticImageCache.aBoolean1379) {
        int[] var4 = var3[0];
        int[] var5 = var3[1];
        int[] var6 = var3[2];

        for (int var7 = 0; (var7 < SomethingLight0.anInt1559); ++var7) {
          var4[var7] = this.anInt3129;
          var5[var7] = this.anInt3134;
          var6[var7] = this.anInt3135;
        }
      }

      return var3;
  }

  public static void method217(int var0) {
    TextureSampler1.FONT_B12 = null;
      TextureSampler1.aClass94_3133 = null;
      TextureSampler1.aClass94_3140 = null;
      TextureSampler1.aClass93_3130 = null;
      TextureSampler1.anIntArray3139 = null;
      TextureSampler1.aClass94_3131 = null;

      TextureSampler1.aClass47_3137 = null;
  }

  public static void method219(boolean var0, int var1) {
    if (var0) {
        if (InventoryConfig.anInt3655 != -1) {
          DummyClass44.method1208((byte) -128, InventoryConfig.anInt3655);
        }

        for (SomethingPacket151 var2 =
             (SomethingPacket151) TextureSampler23.aClass130_3208.getFirst(var1 + -2908);
            var2 != null;
             var2 = (SomethingPacket151) TextureSampler23.aClass130_3208.getNext(-122)) {
          TextureSampler19.method254(true, var2, false);
        }

        InventoryConfig.anInt3655 = -1;
        TextureSampler23.aClass130_3208 = new HashTable(8);
        VariableUpdate.method122(var1 + -2918);
        InventoryConfig.anInt3655 = AudioSomethingSomething.anInt2529;
        DummyClass23.method1746(false, (byte) -36);
        Cache.method1093(false);
        TextureSampler24.method226(InventoryConfig.anInt3655, var1 ^ 2960);
      }

      AnimationSomething.anInt3590 = -1;
      TextureSampler20.method229(DummyClass12.anInt2027, 20827);
      TextureCache.localPlayer = new Player();
      TextureCache.localPlayer.anInt2829 = 3000;
      TextureCache.localPlayer.anInt2819 = var1;
      if (GlRenderer.useOpenGlRenderer) {
        if ((SomethingPacket116.anInt1753 == 2)) {
          NPC.anInt3995 = GameCanvas.anInt30 << 7;
          DummyClass49.anInt1111 = AbstractMouseWheel.anInt1904 << 7;
        } else {
          WidgetUpdate.d(var1 ^ '\uf447');
        }

        TextureSampler31.method236((byte) 64);
        TextureSampler26.method195(var1 + 17479);
        DummyClass26.setState(28, 5);
      } else {
        DummyClass51.method1418(-110, Projectile.sprites);
        DummyClass26.setState(10, 5);
      }
  }

  public static void updateSunPosition(int x, int y) {
    DummyClass39.sunPositionX = DummyClass27.blockConfigs[x][y].sunPositionX;
      TextureSampler0.sunPositionY = DummyClass27.blockConfigs[x][y].sunPositionY;
      BlockConfig.sunPositionZ = DummyClass27.blockConfigs[x][y].sunPosZ;
      GlEnvironment.setSunPosition(DummyClass39.sunPositionX,
          TextureSampler0.sunPositionY, BlockConfig.sunPositionZ);
  }

  public static void method221(int var0, GameString var1, GameString var2, GameString var3,
                              int var4) {
    InventoryConfig.method611(var0, var4, var1, var3, (byte) 50, var2);
  }

  public static boolean method222(int var0, int var1, int var2, int var3, int var4, int var5) {
    int var6;
    int var7;
    if (var1 == var2 && var3 == var4) {
      if (FileSystem.method846(var0, var1, var3)) {
        var6 = var1 << 7;
        var7 = var3 << 7;
        return
            TextureSampler10.method349(var6 + 1,
                AbstractGameWorld.heightMap[var0][var1][var3] + var5,
                var7 + 1) && TextureSampler10.method349(var6 + 128 - 1,
                AbstractGameWorld.heightMap[var0][var1 + 1][var3] + var5,
                var7 + 1)
                && TextureSampler10.method349(var6 + 128 - 1,
                AbstractGameWorld.heightMap[var0][var1 + 1][var3 + 1] + var5,
                var7 + 128 - 1)
                && TextureSampler10.method349(var6 + 1,
                AbstractGameWorld.heightMap[var0][var1][var3 + 1] + var5,
                var7 + 128 - 1);
      } else {
        return false;
      }
    } else {
      for (var6 = var1; var6 <= var2; ++var6) {
        for (var7 = var3; var7 <= var4; ++var7) {
          if (DummyClass50.anIntArrayArrayArray1142[var0][var6][var7]
            == -SomethingQuickChat2.anInt3539) {
            return false;
          }
        }
      }

      var6 = (var1 << 7) + 1;
      var7 = (var3 << 7) + 2;
      int var8 = AbstractGameWorld.heightMap[var0][var1][var3] + var5;
      if (TextureSampler10.method349(var6, var8, var7)) {
        int var9 = (var2 << 7) - 1;
        if (TextureSampler10.method349(var9, var8, var7)) {
          int var10 = (var4 << 7) - 1;
          if (TextureSampler10.method349(var6, var8, var10)) {
            return TextureSampler10.method349(var9, var8, var10);
          } else {
            return false;
          }
        } else {
          return false;
        }
      } else {
        return false;
      }
    }
  }

}
