package com.jagex.runescape.statics;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.model.BufferedFile;
import com.jagex.runescape.opengl.GLStatics;
import com.jagex.runescape.scene.SceneGraphTile;
import com.jagex.runescape.scene.SceneSomething;

public class DummyClass7 extends DummyClass6 {

  public static GameString settings;
  public static GameString aClass94_2997 = GameStringStatics
      .create("blinken1:");
  public static BufferedFile[] cacheIndexFiles = new BufferedFile[28];

  public static SceneSomething method2217(int var0, int var1, int var2) {
    SceneGraphTile var3 = GLStatics.sceneGraphTiles[var0][var1][var2];
    if (var3 == null) {
      return null;
    } else {
      for (int var4 = 0; var4 < var3.anInt2223; ++var4) {
        SceneSomething var5 = var3.sceneGraphNodes[var4];
        if ((var5.aLong498 >> 29 & 3L) == 2L && var5.anInt483 == var1
            && var5.anInt478 == var2) {
          GlobalStatics_5.method2186(var5);
          return var5;
        }
      }

      return null;
    }
  }

  public static void method2218(byte var0) {
    DummyClass7.settings = null;
    DummyClass7.aClass94_2997 = null;
    if (var0 != -83) {
      DummyClass7.method2218((byte) -9);
    }

    DummyClass7.cacheIndexFiles = null;
  }

  public static void method2219(Buffer var0, boolean var1) {
    if (var1) {
      DummyClass7.cacheIndexFiles = null;
    }

    while (var0.position < var0.bytes.length) {
      int var4 = 0;
      boolean var3 = false;
      int var5 = 0;
      if (var0.readUnsignedByte() == 1) {
        var3 = true;
        var4 = var0.readUnsignedByte();
        var5 = var0.readUnsignedByte();
      }

      int var6 = var0.readUnsignedByte();
      int var7 = var0.readUnsignedByte();
      int var9 =
          -(var7 * 64) - (-GlobalStatics_9.anInt65 - DummyClass58.anInt1460
              + 1);
      int var8 = var6 * 64 - GlobalStatics_10.anInt3256;
      byte var2;
      int var10;
      if (var8 >= 0 && var9 - 63 >= 0 && var8 + 63 < DummyClass30.anInt455
          && var9 < DummyClass58.anInt1460) {
        var10 = var8 >> 6;
        int var11 = var9 >> 6;

        for (int var12 = 0; var12 < 64; ++var12) {
          for (int var13 = 0; var13 < 64; ++var13) {
            if (!var3
                || var12 >= 8 * var4 && var12 < 8 + var4 * 8
                && var13 >= var5 * 8 && var13 < 8 + var5 * 8) {
              var2 = var0.readByte();
              if (var2 != 0) {
                if (GlobalStatics_9.aByteArrayArrayArray383[var10][var11]
                    == null) {
                  GlobalStatics_9.aByteArrayArrayArray383[var10][var11] = new byte[4096];
                }

                GlobalStatics_9.aByteArrayArrayArray383[var10][var11][var12 + (
                    -var13 + 63
                        << 6)] = var2;
                byte var14 = var0.readByte();
                if (GlobalStatics_9.aByteArrayArrayArray2339[var10][var11]
                    == null) {
                  GlobalStatics_9.aByteArrayArrayArray2339[var10][var11] = new byte[4096];
                }

                GlobalStatics_9.aByteArrayArrayArray2339[var10][var11][var12 + (
                    63 - var13 << 6)] =
                    var14;
              }
            }
          }
        }
      } else {
        for (var10 = 0; (var3 ? 64 : 4096) > var10; ++var10) {
          var2 = var0.readByte();
          if (var2 != 0) {
            ++var0.position;
          }
        }
      }
    }
  }

}
