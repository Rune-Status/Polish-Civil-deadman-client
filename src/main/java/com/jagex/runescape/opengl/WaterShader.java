package com.jagex.runescape.opengl;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.statics.GlobalStatics_0;
import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_2;
import com.jagex.runescape.statics.GlobalStatics_6;
import com.jagex.runescape.statics.GlobalStatics_9;
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2ES2;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public final class WaterShader implements MaterialShader {

  private static float[] aFloatArray2185 = new float[4];
  private int anInt2182 = -1;
  private FloatBuffer aFloatBuffer2183;
  private int anInt2184;
  private int anInt2186 = -1;

  public WaterShader() {
    if (GlRenderer.vertexProgramSupport && GlRenderer.maxTextureUnits >= 2) {
      int[] var1 = new int[1];
      GlRenderer.GL.glGenProgramsARB(1, var1, 0);
      this.anInt2184 = var1[0];
      int[][] var3 = GlobalStatics_2
          .method895(false, 3, 64, 256, 4, 8, 0.4F, (byte) -73);
      int[][] var4 = GlobalStatics_2
          .method895(false, 3, 64, 256, 4, 8, 0.4F, (byte) -109);
      Buffer var5 = new Buffer(262144);

      for (int var6 = 0; var6 < 256; ++var6) {
        int[] var7 = var3[var6];
        int[] var8 = var4[var6];

        for (int var9 = 0; var9 < 64; ++var9) {
          if (GlRenderer.USE_BIG_ENDIAN) {
            var5.writeFloat(var7[var9] / 4096.0F);
            var5.writeFloat(var8[var9] / 4096.0F);
            var5.writeFloat(1.0F);
            var5.writeFloat(1.0F);
          } else {
            var5.writeFloatLE(var7[var9] / 4096.0F);
            var5.writeFloatLE(var8[var9] / 4096.0F);
            var5.writeFloatLE(1.0F);
            var5.writeFloatLE(1.0F);
          }
        }
      }

      ByteBuffer var10 = ByteBuffer.allocateDirect(var5.position)
          .order(ByteOrder.nativeOrder());
      var10.put(var5.bytes, 0, var5.position);
      var10.flip();
      this.aFloatBuffer2183 = var10.asFloatBuffer().asReadOnlyBuffer();
      this.method1749();
      this.method1750();
    }

  }

  public void disable() {
    if (this.anInt2186 >= 0) {
      GlRenderer.GL.glCallList(this.anInt2186 + 1);
    }
  }

  public void enable() {
    if (this.anInt2186 >= 0) {
      GlRenderer.GL.glCallList(this.anInt2186);
      GlRenderer.GL.glActiveTexture(0x84c1);
      GlRenderer.GL.glMatrixMode(5890);
      GlRenderer.GL
          .glTranslatef(GlobalStatics_10.anInt144, GlobalStatics_6.anInt3695,
              GlobalStatics_0.anInt2587);
      GlRenderer.GL
          .glRotatef(-(GlobalStatics_9.anInt3103 * 360.0F) / 2048.0F, 0.0F,
              1.0F, 0.0F);
      GlRenderer.GL
          .glRotatef(-(GlobalStatics_9.anInt2938 * 360.0F) / 2048.0F, 1.0F,
              0.0F, 0.0F);
      GlRenderer.GL.glRotatef(-180.0f, 1.0F, 0.0F, 0.0F);
      GlRenderer.GL.glMatrixMode(5888);
      if (!SomethingGl.aBoolean1227) {
        GlRenderer.GL.glBindTexture(GL.GL_TEXTURE_2D,
            SomethingGl.anIntArray1224[
                (int) ((GlRenderer.anInt1791 * 64) * 0.0050F) % 64]);
      }

      GlRenderer.GL.glActiveTexture(0x84c0);
      if (this.anInt2182 != GlRenderer.anInt1791) {
        int var2 = (GlRenderer.anInt1791 & 255) * 256;

        for (int var3 = 0; var3 < 64; ++var3) {
          this.aFloatBuffer2183.position(var2);
          GlRenderer.GL.glProgramLocalParameter4fvARB(0x8620, var3,
              this.aFloatBuffer2183);
          var2 += 4;
        }

        if (SomethingGl.aBoolean1227) {
          GlRenderer.GL
              .glProgramLocalParameter4fARB(0x8620, 65,
                  GlRenderer.anInt1791 * 0.0050F,
                  0.0F, 0.0F, 1.0F);
        } else {
          GlRenderer.GL
              .glProgramLocalParameter4fARB(0x8620, 65, 0.0F, 0.0F, 0.0F,
                  1.0F);
        }

        this.anInt2182 = GlRenderer.anInt1791;
      }

    }
  }

  public void set(int var1) {
    if (this.anInt2186 >= 0) {
      GlRenderer.GL.glActiveTexture(0x84c1);
      if ((var1 & 128) == 0) {
        GlRenderer.GL
            .glEnable(SomethingGl.aBoolean1227 ? 0x806f : GL.GL_TEXTURE_2D);
      } else {
        GlRenderer.GL
            .glDisable(SomethingGl.aBoolean1227 ? 0x806f : GL.GL_TEXTURE_2D);
      }

      GlRenderer.GL.glActiveTexture(0x84c0);
      if ((var1 & 64) == 0) {
        GlRenderer.GL.glGetFloatv(2899, WaterShader.aFloatArray2185, 0);
        GlRenderer.GL.glProgramLocalParameter4fvARB(0x8620, 66,
            WaterShader.aFloatArray2185, 0);
      } else {
        GlRenderer.GL
            .glProgramLocalParameter4fARB(0x8620, 66, 1.0F, 1.0F, 1.0F, 1.0F);
      }

      int var3 = var1 & 3;
      if (var3 == 2) {
        GlRenderer.GL
            .glProgramLocalParameter4fARB(0x8620, 64, 0.05F, 1.0F, 1.0F,
                1.0F);
      } else if (var3 == 3) {
        GlRenderer.GL
            .glProgramLocalParameter4fARB(0x8620, 64, 0.1F, 1.0F, 1.0F, 1.0F);
      } else {
        GlRenderer.GL
            .glProgramLocalParameter4fARB(0x8620, 64, 0.025F, 1.0F, 1.0F,
                1.0F);
      }

    }
  }

  public int method24() {
    return 0;
  }

  private void method1749() {
    this.anInt2186 = GlRenderer.GL.glGenLists(2);
    GlRenderer.GL.glNewList(this.anInt2186, 4864);
    GlRenderer.GL.glActiveTexture(0x84c1);
    if (SomethingGl.aBoolean1227) {
      GlRenderer.GL.glBindTexture(GL2ES2.GL_TEXTURE_3D, SomethingGl.anInt1228);
    }

    GlRenderer.GL.glTexEnvi(8960, 0x8571, 260);
    GlRenderer.GL.glTexEnvi(8960, 0x8572, 7681);
    GlRenderer.GL.glTexEnvi(8960, 0x8588, 0x8578);
    GlRenderer.GL.glActiveTexture(0x84c0);
    GlRenderer.GL.glBindProgramARB(0x8620, this.anInt2184);
    GlRenderer.GL.glEnable(0x8620);
    GlRenderer.GL.glEndList();
    GlRenderer.GL.glNewList(this.anInt2186 + 1, 4864);
    GlRenderer.GL.glActiveTexture(0x84c1);
    GlRenderer.GL.glMatrixMode(5890);
    GlRenderer.GL.glLoadIdentity();
    GlRenderer.GL.glMatrixMode(5888);
    GlRenderer.GL.glTexEnvi(8960, 0x8571, 8448);
    GlRenderer.GL.glTexEnvi(8960, 0x8572, 8448);
    GlRenderer.GL.glTexEnvi(8960, 0x8588, 5890);
    GlRenderer.GL
        .glDisable(SomethingGl.aBoolean1227 ? 0x806f : GL.GL_TEXTURE_2D);
    GlRenderer.GL.glActiveTexture(0x84c0);
    GlRenderer.GL.glBindProgramARB(0x8620, 0);
    GlRenderer.GL.glDisable(0x8620);
    GlRenderer.GL.glDisable(0x8804);
    GlRenderer.GL.glEndList();
  }

  private void method1750() {
    if (this.anInt2186 >= 0) {
      int[] var2 = new int[1];
      GlRenderer.GL.glBindProgramARB(0x8620, this.anInt2184);
      GlRenderer.GL.glProgramStringARB(0x8620, 0x8875,
          ("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\n"
              + "ATTRIB  iColour      = vertex.color;\n"
              + "OUTPUT  oPos         = result.position;\n"
              + "OUTPUT  oColour      = result.color;\n"
              + "OUTPUT  oTexCoord0   = result.texcoord[0];\n"
              + "OUTPUT  oTexCoord1   = result.texcoord[1];\n"
              + "OUTPUT  oFogCoord    = result.fogcoord;\n"
              + "PARAM   time         = program.local[65];\n"
              + "PARAM   turbulence   = program.local[64];\n"
              + "PARAM   lightAmbient = program.local[66]; \n"
              + "PARAM   pMatrix[4]   = { state.matrix.projection };\n"
              + "PARAM   mvMatrix[4]  = { state.matrix.modelview };\n"
              + "PARAM   ivMatrix[4]  = { state.matrix.texture[1] };\n"
              + "PARAM   fNoise[64]   = { program.local[0..63] };\n"
              + "TEMP    noise, clipPos, viewPos, worldPos;\n"
              + "ADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\n"
              + "DP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\n"
              + "DP4   viewPos.w, mvMatrix[3], iPos;\nDP4   worldPos.x, ivMatrix[0], viewPos;\n"
              + "DP4   worldPos.y, ivMatrix[1], viewPos;\n"
              + "DP4   worldPos.z, ivMatrix[2], viewPos;\n"
              + "DP4   worldPos.w, ivMatrix[3], viewPos;\n"
              + "ADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\n"
              + "FRC   noise, noise;\n" + "MUL   noise, noise, 64;\n"
              + "ARL   noiseAddr.x, noise.x;\n"
              + "MOV   noise.x, fNoise[noiseAddr.x].x;\n"
              + "ARL   noiseAddr.x, noise.y;\n"
              + "MOV   noise.y, fNoise[noiseAddr.x].y;\n"
              + "MUL   noise, noise, turbulence.x;\n"
              + "MAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\n"
              + "MOV   oTexCoord0.w, 1;\n"
              + "MUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\n"
              + "MOV   oTexCoord1.zw, time.xxxw;\n"
              + "DP4   clipPos.x, pMatrix[0], viewPos;\n"
              + "DP4   clipPos.y, pMatrix[1], viewPos;\n"
              + "DP4   clipPos.z, pMatrix[2], viewPos;\n"
              + "DP4   clipPos.w, pMatrix[3], viewPos;\n"
              + "MUL   oColour.xyz, iColour, lightAmbient;\n"
              + "MOV   oColour.w, 1;\n"
              + "MOV   oFogCoord.x, clipPos.z;\n" + "MOV   oPos, clipPos; \n"
              + "END").length(),
          "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, 1;\nMOV   oFogCoord.x, clipPos.z;\nMOV   oPos, clipPos; \nEND");
      GlRenderer.GL.glGetIntegerv(0x864b, var2, 0);
      if (var2[0] != -1) {
        return;
      }
    }

  }

  public static void method1748() {
    WaterShader.aFloatArray2185 = null;
  }

}
