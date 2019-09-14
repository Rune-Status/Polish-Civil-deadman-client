package com.jagex.runescape;

import com.jagex.runescape.opengl.GlTexture2d;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public final class SocketStream implements Runnable {

  public static int sceneWidth;
  public static SomethingFont aClass33_1238;
  public static int anInt1240;
  public static Deque aClass61_1242 = new Deque();
  public static int anInt1244 = -1;
  private int anInt1230;
  private OutputStream anOutputStream1231;
  private InputStream anInputStream1232;
  private byte[] aByteArray1233;
  private final Socket aSocket1235;
  private int anInt1236;
  private SignLinkRequest aClass64_1237;
  private final SignLink aClass87_1239;
  private boolean aBoolean1241;
  private boolean aBoolean1243;

  public SocketStream(Socket var1, SignLink var2) throws IOException {
    this.aClass87_1239 = var2;
      this.aSocket1235 = var1;
      this.aSocket1235.setSoTimeout(30000);
      this.aSocket1235.setTcpNoDelay(true);
      this.anInputStream1232 = this.aSocket1235.getInputStream();
      this.anOutputStream1231 = this.aSocket1235.getOutputStream();
  }

  public void run() {
    while (true) {
        try {
          label88:
          {
            int var1;
            int var2;
            synchronized (this) {
              if (this.anInt1230 == this.anInt1236) {
                if (this.aBoolean1241) {
                  break label88;
                }

                try {
                  this.wait();
                } catch (InterruptedException var9) {
                }
              }

              var2 = this.anInt1236;
              if (this.anInt1236 > this.anInt1230) {
                var1 = -this.anInt1236 + 5000;
              } else {
                var1 = this.anInt1230 - this.anInt1236;
              }
            }

            if (var1 <= 0) {
              continue;
            }

            try {
              this.anOutputStream1231.write(this.aByteArray1233, var2, var1);
            } catch (IOException var8) {
              this.aBoolean1243 = true;
            }

            this.anInt1236 = (var1 + this.anInt1236) % 5000;

            try {
              if ((this.anInt1230 == this.anInt1236)) {
                this.anOutputStream1231.flush();
              }
            } catch (IOException var7) {
              this.aBoolean1243 = true;
            }
            continue;
          }

          try {
            if (this.anInputStream1232 != null) {
              this.anInputStream1232.close();
            }

            if (this.anOutputStream1231 != null) {
              this.anOutputStream1231.close();
            }

            if (this.aSocket1235 != null) {
              this.aSocket1235.close();
            }
          } catch (IOException var6) {
          }

          this.aByteArray1233 = null;
        } catch (Exception var11) {
          GZipDecompressor.reportError(null, var11, (byte) 103);
        }

        return;
      }
  }

  public void read(byte[] var4, int var1, int var2) throws IOException {
    if (!this.aBoolean1241) {
        while (var2 > 0) {
          int var5 = this.anInputStream1232.read(var4, var1, var2);
          if (var5 <= 0) {
            throw new EOFException();
          }

          var1 += var5;
          var2 -= var5;
        }

      }
  }

  public int read() throws IOException {
    return !this.aBoolean1241 ? this.anInputStream1232.read() : 0;
  }

  public void write(byte[] var3, int var2, int var4) throws IOException {
    if (!this.aBoolean1241) {
        if (this.aBoolean1243) {
          this.aBoolean1243 = false;
          throw new IOException();
        } else {
          if (this.aByteArray1233 == null) {
            this.aByteArray1233 = new byte[5000];
          }

          synchronized (this) {
            for (int var6 = 0; var4 > var6; ++var6) {
              this.aByteArray1233[this.anInt1230] = var3[var2 + var6];
              this.anInt1230 = (this.anInt1230 + 1) % 5000;
              if ((this.anInt1230 == ((4900 + this.anInt1236) % 5000))) {
                throw new IOException();
              }
            }

            if (this.aClass64_1237 == null) {
              this.aClass64_1237 = this.aClass87_1239.createThread(0, 3, this);
            }
            this.notifyAll();
          }
        }
      }
  }

  protected void finalize() {
    this.destroy();
  }

  public int available() throws IOException {
    return this.aBoolean1241 ? 0 : this.anInputStream1232.available();
  }

  public void method1466(int var1) throws IOException {
    int var2 = -97 % ((52 - var1) / 50);
      if (!this.aBoolean1241) {
        if (this.aBoolean1243) {
          this.aBoolean1243 = false;
          throw new IOException();
        }
      }
  }

  public void method1467() {
    if (!this.aBoolean1241) {
        this.anInputStream1232 = new DummyInputStream();
        this.anOutputStream1231 = new DummyOutputStream();
      }
  }

  public void destroy() {
    if (!this.aBoolean1241) {
        synchronized (this) {
          this.aBoolean1241 = true;
          this.notifyAll();
        }

        if (this.aClass64_1237 != null) {
          while (this.aClass64_1237.status == 0) {
            TextureSampler25.sleep(1L);
          }

          if ((this.aClass64_1237.status == 2 -1)) {
            try {
              ((Thread) this.aClass64_1237.result).join();
            } catch (InterruptedException var4) {
            }
          }
        }

        this.aClass64_1237 = null;
      }
  }

  public static void method1460(int var0, int var1, byte var2, int var3,
      int var4, int var5,
      int var6) {
    if (((var5 - var4) >= DummyClass55.anInt1425)
          && GlTexture2d.anInt3765 >= var5 - -var4
          && DummyClass13.anInt2020 <= -var4 + var1
          && LightIntensity.anInt902 >= var4 + var1) {
        TextureSampler6.method175(var6, var0, var1, true, var3, var4, var5);
      } else {
        FloorOverlay.method2275(var3, (byte) 109, var1, var4, var6, var0, var5);
      }

      if (var2 > -107) {
        SocketStream.anInt1244 = 89;
      }
  }

  public static void method1463(int var0) {
    if (var0 != 0) {
        SocketStream.aClass61_1242 = null;
      }

      SocketStream.aClass61_1242 = null;
      SocketStream.aClass33_1238 = null;
  }

  public static void method1469(int[] var0, int var1, int var2, int var3,
      int var4, int var5) {
    SceneGraphTile var6 = SomethingTexture1.sceneGraphTiles[var3][var4][var5];
    if (var6 != null) {
      SomethingTilek var7 = var6.aClass126_2240;
      int var9;
      if (var7 != null) {
        int var17 = var7.anInt1673;
        if (var17 != 0) {
          for (var9 = 0; var9 < 4; ++var9) {
            var0[var1] = var17;
            var0[var1 + 1] = var17;
            var0[var1 + 2] = var17;
            var0[var1 + 3] = var17;
            var1 += var2;
          }

        }
      } else {
        SomethingSceneTile var8 = var6.aClass35_2226;
        if (var8 != null) {
          var9 = var8.anInt611;
          int var10 = var8.anInt612;
          int var11 = var8.anInt626;
          int var12 = var8.anInt621;
          int[] var13 = TextureSampler19.anIntArrayArray3215[var9];
          int[] var14 = DummyClass11.anIntArrayArray2039[var10];
          int var15 = 0;
          int var16;
          if (var11 == 0) {
            for (var16 = 0; var16 < 4; ++var16) {
              if (var13[var14[var15++]] != 0) {
                var0[var1] = var12;
              }

              if (var13[var14[var15++]] != 0) {
                var0[var1 + 1] = var12;
              }

              if (var13[var14[var15++]] != 0) {
                var0[var1 + 2] = var12;
              }

              if (var13[var14[var15++]] != 0) {
                var0[var1 + 3] = var12;
              }

              var1 += var2;
            }
          } else {
            for (var16 = 0; var16 < 4; ++var16) {
              var0[var1] = var13[var14[var15++]] == 0 ? var11 : var12;
              var0[var1 + 1] = var13[var14[var15++]] == 0 ? var11 : var12;
              var0[var1 + 2] = var13[var14[var15++]] == 0 ? var11 : var12;
              var0[var1 + 3] = var13[var14[var15++]] == 0 ? var11 : var12;
              var1 += var2;
            }
          }

        }
      }
    }
  }

  public static void method1470(int var0, AnimationSequence var1, int var2,
      int var3, boolean var4,
      int var5) {
    if ((SomethingLight0.anInt1552 < 51 -1)) {
        if (var1.anIntArrayArray1867 != null
            && (var5 < var1.anIntArrayArray1867.length)
            && var1.anIntArrayArray1867[var5] != null) {
          int var6 = var1.anIntArrayArray1867[var5][0];
          int var7 = var6 >> 8;
          int var10;
          if (var1.anIntArrayArray1867[var5].length > 1) {
            var10 = (int) (var1.anIntArrayArray1867[var5].length * Math
                .random());
            if (var10 > 0) {
              var7 = var1.anIntArrayArray1867[var5][var10];
            }
          }

          int var8 = var6 >> 5 & 7;
          int var9 = var6 & 31;
          if ((var9 == 0)) {
            if (var4) {
              TextureSampler26.method199(var8, var7, 0, -799);
            }

          } else {
            if (DummyClass28.anInt340 != 0) {
              Inventory.anIntArray2550[SomethingLight0.anInt1552] = var7;
              SomethingIndex150.anIntArray2068[SomethingLight0.anInt1552] = var8;
              int var11 = (-64 + var0) / 128;
              var10 = (var3 + -64) / 128;
              GameString.anIntArray2157[SomethingLight0.anInt1552] = 0;
              TextureCache.aClass135Array2131[SomethingLight0.anInt1552] = null;
              TextureSampler26.anIntArray3083[SomethingLight0.anInt1552] =
                  var9 + (var10 << 16) + (var11 << 8);
              if (var2 != 183921384) {
                SocketStream.aClass33_1238 = null;
              }

              ++SomethingLight0.anInt1552;
            }
          }
        }
      }
  }

}
