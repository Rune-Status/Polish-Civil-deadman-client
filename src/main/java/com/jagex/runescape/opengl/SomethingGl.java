package com.jagex.runescape.opengl;

import com.jagex.runescape.model.Something3dTexture;
import com.jagex.runescape.model.Something3dTexture1;
import java.nio.ByteBuffer;

public final class SomethingGl {

  private static ByteBuffer aByteBuffer1225;
  private static ByteBuffer aByteBuffer1226;
  public static int[] anIntArray1223;
  public static int[] anIntArray1224;
  public static boolean aBoolean1227;
  public static int anInt1228 = -1;
  public static int anInt1229 = -1;

  public static void method1454() {
    byte[] var1;
    if (SomethingGl.aByteBuffer1226 == null) {
      Something3dTexture1 var0 = new Something3dTexture1();
      var1 = var0.method2250(64, 64, 64);
      SomethingGl.aByteBuffer1226 = ByteBuffer.allocateDirect(var1.length);
      SomethingGl.aByteBuffer1226.position(0);
      SomethingGl.aByteBuffer1226.put(var1);
      SomethingGl.aByteBuffer1226.flip();
    }

    if (SomethingGl.aByteBuffer1225 == null) {
      Something3dTexture var2 = new Something3dTexture();
      var1 = var2.method2243(64, 64, 64);
      SomethingGl.aByteBuffer1225 = ByteBuffer.allocateDirect(var1.length);
      SomethingGl.aByteBuffer1225.position(0);
      SomethingGl.aByteBuffer1225.put(var1);
      SomethingGl.aByteBuffer1225.flip();
    }

  }

  public static void method1455() {
    if (SomethingGl.anInt1228 != -1) {
      int[] var1 = new int[]{SomethingGl.anInt1228};
      GlRenderer.GL.glDeleteTextures(1, var1, 0);
      SomethingGl.anInt1228 = -1;
      DummyClass33.textureMemory -= SomethingGl.aByteBuffer1226.limit() * 2;
    }

    if (SomethingGl.anIntArray1224 != null) {
      GlRenderer.GL.glDeleteTextures(64, SomethingGl.anIntArray1224, 0);
      SomethingGl.anIntArray1224 = null;
      DummyClass33.textureMemory -= SomethingGl.aByteBuffer1226.limit() * 2;
    }

    if (SomethingGl.anInt1229 != -1) {
      int[] var1 = new int[]{SomethingGl.anInt1229};
      GlRenderer.GL.glDeleteTextures(1, var1, 0);
      SomethingGl.anInt1229 = -1;
      DummyClass33.textureMemory -= SomethingGl.aByteBuffer1225.limit() * 2;
    }

    if (SomethingGl.anIntArray1223 != null) {
      GlRenderer.GL.glDeleteTextures(64, SomethingGl.anIntArray1223, 0);
      SomethingGl.anIntArray1223 = null;
      DummyClass33.textureMemory -= SomethingGl.aByteBuffer1225.limit() * 2;
    }

  }

  public static void method1456() {
    SomethingGl.aBoolean1227 = GlRenderer.texture3dSupport;
    SomethingGl.method1454();
    SomethingGl.method1458();
    SomethingGl.method1459();
  }

  public static void method1457() {
    SomethingGl.anIntArray1224 = null;
    SomethingGl.anIntArray1223 = null;
    SomethingGl.aByteBuffer1226 = null;
    SomethingGl.aByteBuffer1225 = null;
  }

  private static void method1458() {
    if (SomethingGl.aBoolean1227) {
      int[] var1 = new int[1];
      GlRenderer.GL.glGenTextures(1, var1, 0);
      GlRenderer.GL.glBindTexture('\u806f', var1[0]);
      SomethingGl.aByteBuffer1226.position(0);
      GlRenderer.GL.glTexImage3D('\u806f', 0, 6410, 64, 64, 64, 0, 6410, 5121,
          SomethingGl.aByteBuffer1226);
      GlRenderer.GL.glTexParameteri('\u806f', 10241, 9729);
      GlRenderer.GL.glTexParameteri('\u806f', 10240, 9729);
      SomethingGl.anInt1228 = var1[0];
      DummyClass33.textureMemory += SomethingGl.aByteBuffer1226.limit() * 2;
    } else {
      SomethingGl.anIntArray1224 = new int[64];
      GlRenderer.GL.glGenTextures(64, SomethingGl.anIntArray1224, 0);

      for (int var2 = 0; var2 < 64; ++var2) {
        GlRenderer.bindTexture(SomethingGl.anIntArray1224[var2]);
        SomethingGl.aByteBuffer1226.position(var2 * 64 * 64 * 2);
        GlRenderer.GL.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121,
            SomethingGl.aByteBuffer1226);
        GlRenderer.GL.glTexParameteri(3553, 10241, 9729);
        GlRenderer.GL.glTexParameteri(3553, 10240, 9729);
      }

      DummyClass33.textureMemory += SomethingGl.aByteBuffer1226.limit() * 2;
    }

  }

  private static void method1459() {
    if (SomethingGl.aBoolean1227) {
      int[] var1 = new int[1];
      GlRenderer.GL.glGenTextures(1, var1, 0);
      GlRenderer.GL.glBindTexture('\u806f', var1[0]);
      SomethingGl.aByteBuffer1225.position(0);
      GlRenderer.GL.glTexImage3D('\u806f', 0, 6410, 64, 64, 64, 0, 6410, 5121,
          SomethingGl.aByteBuffer1225);
      GlRenderer.GL.glTexParameteri('\u806f', 10241, 9729);
      GlRenderer.GL.glTexParameteri('\u806f', 10240, 9729);
      SomethingGl.anInt1229 = var1[0];
      DummyClass33.textureMemory += SomethingGl.aByteBuffer1225.limit() * 2;
    } else {
      SomethingGl.anIntArray1223 = new int[64];
      GlRenderer.GL.glGenTextures(64, SomethingGl.anIntArray1223, 0);

      for (int var2 = 0; var2 < 64; ++var2) {
        GlRenderer.bindTexture(SomethingGl.anIntArray1223[var2]);
        SomethingGl.aByteBuffer1225.position(var2 * 64 * 64 * 2);
        GlRenderer.GL.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121,
            SomethingGl.aByteBuffer1225);
        GlRenderer.GL.glTexParameteri(3553, 10241, 9729);
        GlRenderer.GL.glTexParameteri(3553, 10240, 9729);
      }

      DummyClass33.textureMemory += SomethingGl.aByteBuffer1225.limit() * 2;
    }

  }

}
