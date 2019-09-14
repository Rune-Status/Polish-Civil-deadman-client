package com.jagex.runescape;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.opengl.GLStatics;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

public abstract class AbstractImageProducer {

  public static int loginResponse = -2;
  public static GameString aClass94_2006 = GameStringStatics.create("null");
  public static byte[][][] aByteArrayArrayArray2008;
  public static int anInt2010 = -16 + (int) (33.0D * Math.random());
  public static GameString aClass94_2013 = GameStringStatics.create("Lade Liste der Welten");
  public static int gameId;
  public static int anInt2015;
  public int[] anIntArray2007;
  public Image anImage2009;
  public int anInt2011;
  public int anInt2012;

  public abstract void draw(int var1,int var2,Graphics var3,int var4 );

  public final void method2182(int var1) {
    DummyClass47.method1319(this.anIntArray2007, this.anInt2012,
          this.anInt2011);
      if (var1 != 0) {
        AbstractImageProducer.anInt2015 = -118;
      }
  }

  public abstract void draw(Graphics var5,int var1,int var2,int var4,int var6,int var3 );

  public abstract void setDimensions(int var1,boolean var2,int var3,Component var4 );

  public static void method2180(FileUnpacker var0, FileUnpacker var1, int var2) {
    if (var2 != 11504) {
        AbstractImageProducer.aClass94_2013 = null;
      }

      ObjectNode.models = var0;
      TextureSampler19.spotAnimations = var1;
  }

  public static void method2181(boolean var0) {
    AbstractImageProducer.aByteArrayArrayArray2008 = null;
      GameStringStatics.anIntArray2004 = null;
      AbstractImageProducer.aClass94_2013 = null;
      if (var0) {
        AbstractImageProducer.method2181(false);
      }

      AbstractImageProducer.aClass94_2006 = null;
  }

  public static void method2183(int var0, boolean var1, int var2, int var3, int var4,
                               Widget[] var5) {
    int var6 = 0;
      if (var3 == 235) {
        for (; (var6 < var5.length); ++var6) {
          Widget var7 = var5[var6];
          if (var7 != null && var7.anInt190 == var0) {
            Structure.method603(var4, 13987, var2, var7, var1);
            FileTable.method1224(var7, 23730, var4, var2);
            if (((var7.anInt240 - var7.anInt168) < var7.anInt247)) {
              var7.anInt247 = var7.anInt240 - var7.anInt168;
            }

            if (var7.anInt208 > -var7.anInt193 + var7.anInt252) {
              var7.anInt208 = var7.anInt252 - var7.anInt193;
            }

            if ((var7.anInt208 < 0)) {
              var7.anInt208 = 0;
            }

            if (var7.anInt247 < 0) {
              var7.anInt247 = 0;
            }

            if ((var7.anInt187 == 0)) {
              FileRequester.method2104(var7, var1, -108);
            }
          }
        }

      }
  }

  public static void method2186(SceneSomething var0) {
    for (int var1 = var0.anInt483; var1 <= var0.anInt495; ++var1) {
      for (int var2 = var0.anInt478; var2 <= var0.anInt481; ++var2) {
        SceneGraphTile var3 = GLStatics.sceneGraphTiles[var0.anInt493][var1][var2];
        if (var3 != null) {
          int var4;
          for (var4 = 0; var4 < var3.anInt2223; ++var4) {
            if (var3.sceneGraphNodes[var4] == var0) {
              --var3.anInt2223;

              for (int var5 = var4; var5 < var3.anInt2223; ++var5) {
                var3.sceneGraphNodes[var5] = var3.sceneGraphNodes[var5 + 1];
                var3.anIntArray2237[var5] = var3.anIntArray2237[var5 + 1];
              }

              var3.sceneGraphNodes[var3.anInt2223] = null;
              break;
            }
          }

          var3.flags = 0;

          for (var4 = 0; var4 < var3.anInt2223; ++var4) {
            var3.flags |= var3.anIntArray2237[var4];
          }
        }
      }
    }

  }

}
