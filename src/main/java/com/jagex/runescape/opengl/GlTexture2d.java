package com.jagex.runescape.opengl;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.model.SceneGraphTile;
import com.jagex.runescape.model.SceneSomething;
import com.jagex.runescape.node.SubNode;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.statics.DummyClass32;
import com.jagex.runescape.statics.GlobalStatics_4;
import com.jagex.runescape.statics.GlobalStatics_6;
import com.jogamp.opengl.GL;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

public final class GlTexture2d extends SubNode {

  private static GameString aClass94_3761 = GameStringStatics
      .create("Face here");
  public static int anInt3757;
  public static GameString aClass94_3758 =
      GameStringStatics
          .create("Veuillez patienter )2 tentative de r-Btablissement)3");
  public static GameString aClass94_3763 = GameStringStatics
      .create("Liste der Welten geladen");
  public static int anInt3764;
  public static int anInt3765 = 100;
  public static int[] quadx1 = new int[100];
  public static boolean aBoolean3769;
  public static GameString aClass94_3762 = GlTexture2d.aClass94_3761;
  private int anInt3759 = -1;
  private final int anInt3760;
  private int anInt3767;

  public GlTexture2d(int color) {
    int[] var3 = new int[1];
      GlRenderer.GL.glGenTextures(1, var3, 0);
      this.anInt3759 = var3[0];
      this.anInt3760 = DummyClass33.anInt582;
      GlRenderer.bindTexture(this.anInt3759);
      int rgbColor = GLStatics.hslTable[color];
      byte[] var5 =
          {(byte) (rgbColor >> 16), (byte) (rgbColor >> 8), (byte) rgbColor,
              (byte) -1};
      ByteBuffer var6 = ByteBuffer.wrap(var5);
      GlRenderer.GL.glTexImage2D(GL.GL_TEXTURE_2D, 0, GL.GL_RGBA, 1, 1, 0, GL.GL_RGBA, GL.GL_UNSIGNED_BYTE, var6);
      GlRenderer.GL.glTexParameteri(GL.GL_TEXTURE_2D, 10241, GL.GL_LINEAR);
      GlRenderer.GL.glTexParameteri(GL.GL_TEXTURE_2D, 10240, GL.GL_LINEAR);
      DummyClass33.textureMemory += var6.limit() - this.anInt3767;
      this.anInt3767 = var6.limit();
  }

  protected void finalize() throws Throwable {
    if (this.anInt3759 != -1) {
        DummyClass33.method985(this.anInt3759, this.anInt3767, this.anInt3760);
        this.anInt3759 = -1;
        this.anInt3767 = 0;
      }

      super.finalize();
  }

  public void initialize(byte var1) {
    int var2 = DummyClass32.method961(var1 + 1530);
      if ((1 & var2) == 0) {
        GlRenderer.bindTexture(this.anInt3759);
      }

      if ((var2 & 2) == 0) {
        GlRenderer.method1856(0);
      }

      if ((var2 & 4) == 0) {
        GlRenderer.method1847(0);
      }

      if (var1 != 6) {
        GlTexture2d.aClass94_3763 = null;
      }
  }

  public static void method709(int var0, int var1) {
    SceneGraphTile var2 = GLStatics.sceneGraphTiles[0][var0][var1];

    for (int var3 = 0; var3 < 3; ++var3) {
      SceneGraphTile var4 = GLStatics.sceneGraphTiles[var3][var0][var1] =
          GLStatics.sceneGraphTiles[var3 + 1][var0][var1];
      if (var4 != null) {
        --var4.anInt2244;

        for (int var5 = 0; var5 < var4.anInt2223; ++var5) {
          SceneSomething var6 = var4.sceneGraphNodes[var5];
          if ((var6.aLong498 >> 29 & 3L) == 2L && var6.anInt483 == var0
              && var6.anInt478 == var1) {
            --var6.anInt493;
          }
        }
      }
    }

    if (GLStatics.sceneGraphTiles[0][var0][var1] == null) {
      GLStatics.sceneGraphTiles[0][var0][var1] = new SceneGraphTile(0,
          var0, var1);
    }

    GLStatics.sceneGraphTiles[0][var0][var1].aClass3_Sub2_2235 = var2;
    GLStatics.sceneGraphTiles[3][var0][var1] = null;
  }

  public static void method710(byte var0) {
    if (var0 >= 122) {
        GlobalStatics_4.floorUnderlays.method1523((byte) -104);
      }
  }

  public static void method711(int var0) {
    GlTexture2d.aClass94_3762 = null;
      GlTexture2d.aClass94_3758 = null;
      GlTexture2d.quadx1 = null;
      if (var0 != 1) {
        GlTexture2d.aClass94_3761 = null;
      }

      GlTexture2d.aClass94_3763 = null;
      GlTexture2d.aClass94_3761 = null;
  }

  public static void method713(int var0) {
    try {
        Method var1 = Runtime.class.getMethod("maxMemory", new Class[var0]);
        if (var1 != null) {
          try {
            Runtime var2 = Runtime.getRuntime();
            Long var3 = (Long) var1.invoke(var2, (Object[]) null);
            GlobalStatics_6.anInt3492 =
                (int) (var3.longValue() / 1048576L) + 1;
          } catch (Throwable var4) {
          }
        }
      } catch (Exception var5) {
      }
  }

}
