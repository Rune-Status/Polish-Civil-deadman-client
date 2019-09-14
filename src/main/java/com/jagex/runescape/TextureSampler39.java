package com.jagex.runescape;

import com.jagex.runescape.opengl.shader.MaterialShader5;

public class TextureSampler39 extends AbstractTextureSampler {

  private static GameString aClass94_3286 =
    GameString.create("Loading )2 please wait)3");
  public static GameString aClass94_3279 = GameString.create("Lade)3)3)3");
  public static GameString aClass94_3281 = GameString.create("sch-Utteln:");
  public static int anInt3285 = 128;
  public static int anInt3287;
  public static int[] anIntArray3288 =
      {4, 4, 1, 2, 6, 4, 2, 49, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
  public static GameString aClass94_3289 = GameString.create("::fps ");
  public static GameString LOADING_PLEASE_WAIT = TextureSampler39.aClass94_3286;
  public int anInt3280;
  public int anInt3283;
  public int[] anIntArray3284;
  private int anInt3278 = -1;

  public TextureSampler39() {
    super(0, false);
  }

  public final boolean method279(int var1) {
    int var2 = 62 / ((var1 - 2) / 62);
      if (this.anIntArray3284 == null) {
        if (~this.anInt3278 > -1) {
          return false;
        } else {
          SoftwareDirectColorSprite var3 = ~SomethingTilek.anInt1668 > -1 ?
            GameString.method1537(MaterialShader5.aClass153_2172,
                this.anInt3278, false) :
            DummyClass59.method1043(this.anInt3278, MaterialShader5.aClass153_2172, -3178,
              SomethingTilek.anInt1668);
          assert var3 != null;
          assert var3 != null;
          var3.method665();
          this.anInt3283 = var3.anInt3696;
          this.anInt3280 = var3.anInt3707;
          this.anIntArray3284 = var3.pixels;
          return true;
        }
      } else {
        return true;
      }
  }

  public final void parseConfig(int var1, Buffer var2, boolean var3) {
    if (var1 == 0) {
        this.anInt3278 = var2.readUnsignedShort();
      }

      if (!var3) {
        TextureSampler39.method276(115, 107, 22, 20, null, 87L, false);
      }
  }

  public final int method159(int var1) {
    return var1 != 4 ? 40 : this.anInt3278;
  }

  public final void method161(byte var1) {
    super.method161(var1);
      this.anIntArray3284 = null;
  }

  public int[][] method166(int var1, int var2 ) {
    if (var1 != -1) {
        this.method159(32);
      }

      int[][] var3 = this.triChromaticImageCache
          .method1594((byte) 65, var2);
      if (this.triChromaticImageCache.aBoolean1379 && this.method279(-113)) {
        int[] var4 = var3[0];
        int[] var5 = var3[1];
        int[] var6 = var3[2];
        int var7 = (~this.anInt3283 == ~DummyClass55.anInt1427 ?
          var2 :
            this.anInt3283 * var2 / DummyClass55.anInt1427) * this.anInt3280;
        int var8;
        int var9;
        if (SomethingLight0.anInt1559 == this.anInt3280) {
          for (var8 = 0; SomethingLight0.anInt1559 > var8; ++var8) {
            var9 = this.anIntArray3284[var7++];
            var6[var8] = ClientScript.bitAnd(255, var9) << 4;
            var5[var8] = ClientScript.bitAnd('\uff00', var9) >> 4;
            var4[var8] = ClientScript.bitAnd(var9, 16711680) >> 12;
          }
        } else {
          for (var8 = 0; SomethingLight0.anInt1559 > var8; ++var8) {
            var9 = this.anInt3280 * var8 / SomethingLight0.anInt1559;
            int var10 = this.anIntArray3284[var7 - -var9];
            var6[var8] = ClientScript.bitAnd(var10 << 4, 4080);
            var5[var8] = ClientScript.bitAnd(var10, '\uff00') >> 4;
            var4[var8] = ClientScript.bitAnd(var10 >> 12, 4080);
          }
        }
      }

      return var3;
  }

  public static int method275(int var0, int var1, int var2, int var3, int var4) {
    if (var3 <= 8) {
        TextureSampler39.anIntArray3288 = null;
      }

      int var5 = -DummyClass40.COSINE_TABLE[1024 * var2 / var4] + 65536 >> 1;
      return (var0 * (-var5 + 65536) >> 16) + (var1 * var5 >> 16);
  }

  public static void method276(int var0, int var1, int var2, int var3, SceneNode var4, long var5,
                              boolean var7) {
    if (var4 != null) {
      SomethingSceneJ var8 = new SomethingSceneJ();
      var8.aClass140_320 = var4;
      var8.anInt324 = var1 * 128 + 64;
      var8.anInt330 = var2 * 128 + 64;
      var8.anInt326 = var3;
      var8.aLong328 = var5;
      var8.aBoolean329 = var7;
      if (SomethingTexture1.sceneGraphTiles[var0][var1][var2] == null) {
        SomethingTexture1.sceneGraphTiles[var0][var1][var2] = new SceneGraphTile(var0, var1, var2);
      }

      SomethingTexture1.sceneGraphTiles[var0][var1][var2].aClass12_2230 = var8;
    }
  }

  public static void method277(byte var0) {
    TextureSampler39.aClass94_3281 = null;
      TextureSampler39.aClass94_3286 = null;
      if (var0 >= -11) {
        TextureSampler39.anInt3287 = -68;
      }

      TextureSampler39.LOADING_PLEASE_WAIT = null;
      TextureSampler39.aClass94_3289 = null;
      TextureSampler39.anIntArray3288 = null;
      TextureSampler39.aClass94_3279 = null;
  }

  public static boolean method278(int var0, byte[] var1) {
    if (var0 == 4) {
        Buffer var2 = new Buffer(var1);
        int var3 = var2.readUnsignedByte();
        if (var3 == 1) {
          boolean var4 = ~var2.readUnsignedByte() == -2;
          if (var4) {
            DummyClass41.method1173(var2, var0 ^ -84);
          }

          TextureSampler30.method216(var2, -14991);
          return true;
        } else {
          return false;
        }
      } else {
        return false;
      }
  }

  public static void method280(int var0, int var1, int var2, int var3, int var4, int var5, int var6,
                              int var7, int var8, int var9, int var10, int var11, int var12) {
    SomethingInScenePacket202 var13 = new SomethingInScenePacket202();
      if (var10 == -745213428) {
        var13.anInt2284 = var6;
        var13.anInt2283 = var3;
        var13.anInt2266 = var1;
        var13.anInt2279 = var5;
        var13.anInt2273 = var2;
        var13.anInt2271 = var8;
        var13.anInt2277 = var11;
        var13.anInt2282 = var4;
        var13.anInt2270 = var12;
        var13.anInt2268 = var7;
        var13.anInt2272 = var0;
        var13.anInt2278 = var9;
        IntegerNode.aClass61_2468.addLast(var13);
      }
  }

  public static void updateVariable(int id, int var1) {
    LightIntensity.variables[id] = var1;
      VariableUpdate var3 = (VariableUpdate) ClientScript.variableUpdates.get(
          id);
      if (var3 != null) {
        if (var3.timestamp != 0x4000000000000001L) {
          var3.timestamp = Time.getCurrentTimeMillis() + 500L | 0x4000000000000000L;
        }
      } else {
        var3 = new VariableUpdate(0x4000000000000001L);
        ClientScript.variableUpdates.put(id, var3);
      }
  }

}
