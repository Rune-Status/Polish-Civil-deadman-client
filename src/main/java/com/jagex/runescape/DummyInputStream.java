package com.jagex.runescape;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import java.io.InputStream;

public final class DummyInputStream extends InputStream {

  private static GameString aClass94_44 = GameStringStatics.create(" ");
  public static GameString aClass94_37 = GameStringStatics.create("0(U");
  public static GameString aClass94_38 = GameStringStatics.create("tbrefresh");
  public static int[] anIntArray39;
  public static int anInt40;
  public static SocketStream updateSocket;
  public static int anInt42;
  public static GameString aClass94_43 = DummyInputStream.aClass94_44;

  public int read() {
    TextureSampler25.sleep(30000L);
      return -1;
  }

  public static void method61(int var0) {
    int var1 = 10 / ((-37 - var0) / 33);
      DummyInputStream.aClass94_44 = null;
      DummyInputStream.updateSocket = null;
      DummyInputStream.aClass94_43 = null;
      DummyInputStream.aClass94_38 = null;
      DummyInputStream.aClass94_37 = null;
      DummyInputStream.anIntArray39 = null;
  }

  public static int[] method62(boolean var0, int var1, int var2, int var3, int var4, float var5,
                              int var6, int var7) {
    if (var1 != 14585) {
        DummyInputStream.anInt40 = 43;
      }

      int[] var8 = new int[var3];
      TextureSampler34 var9 = new TextureSampler34();
      var9.anInt3060 = var6;
      var9.anInt3058 = var4;
      var9.anInt3067 = var7;
      var9.anInt3056 = var2;
      var9.anInt3062 = (int) (var5 * 4096.0F);
      var9.aBoolean3065 = var0;
      var9.method158(16251);
      TextureSampler33.method180(-106, 1, var3);
      var9.method186(true, 0, var8);
      return var8;
  }

  public static AbstractTextureSampler method63(byte var0, Buffer var1) {
    var1.readUnsignedByte();
      int var2 = var1.readUnsignedByte();
      AbstractTextureSampler var3 = GlobalStatics_0
          .createTextureSampler(var2, true);
      assert var3 != null;
      var3.cacheSize = var1.readUnsignedByte();
      int var4 = var1.readUnsignedByte();
      if (var0 > -26) {
        DummyInputStream.aClass94_43 = null;
      }

      for (int var5 = 0; var5 < var4; ++var5) {
        int var6 = var1.readUnsignedByte();
        var3.parseConfig(var6, var1, true);
      }

      var3.method158(16251);
      return var3;
  }

  public static int method64(boolean var0, int var1) {
    if (!var0) {
        DummyInputStream.aClass94_43 = null;
      }

      return var1 >>> 8;
  }

}
