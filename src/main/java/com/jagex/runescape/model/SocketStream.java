package com.jagex.runescape.model;

import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_9;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public final class SocketStream implements Runnable {

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
              if (this.anInt1230 == this.anInt1236) {
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
          GlobalStatics_9.reportError(null, var11, (byte) 103);
        }

        return;
      }
  }

  public void readBytes(byte[] var4, int var1, int var2) throws IOException {
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
    return this.aBoolean1241 ? 0 : this.anInputStream1232.read();
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
              if (this.anInt1230 == (4900 + this.anInt1236) % 5000) {
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
            GlobalStatics_10.sleep(1L);
          }

          if (this.aClass64_1237.status == 1) {
            try {
              ((Thread) this.aClass64_1237.result).join();
            } catch (InterruptedException var4) {
            }
          }
        }

        this.aClass64_1237 = null;
      }
  }

}
