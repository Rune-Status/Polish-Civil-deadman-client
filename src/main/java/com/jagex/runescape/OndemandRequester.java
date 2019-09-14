package com.jagex.runescape;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.done.AbstractDirectColorSprite;

import java.io.IOException;

public final class OndemandRequester {

  public static int anInt994;
  public static GameString aClass94_995 = GameStringStatics.create("(Y<)4col>");
  public static AbstractDirectColorSprite[] aClass3_Sub28_Sub16Array996;
  public static int anInt997;
  public static int anInt998;
  public static int anInt999 = -1;
  public static int anInt1002;
  public volatile int anInt1010;
  public volatile int anInt1011;
  private final Queue aClass13_993 = new Queue();
  private Queue priorityRequests = new Queue();
  private final Queue aClass13_1001 = new Queue();
  private final Queue normalRequests = new Queue();
  private long lastUpdatedTime;
  private SocketStream socketStream;
  private int timeDiff;
  private final Buffer buffer = new Buffer(4);
  private final Buffer aClass3_Sub30_1008 = new Buffer(8);
  private byte encryptionKey;
  private OndemandFileRequest currentRequest;

  public boolean method1241(int var1 ) {
    if (var1 != -30064) {
        this.priorityRequests = null;
      }

      return this.method1246(11706) >= 20;
  }

  public boolean method1243(byte var1 ) {
    int avail;
      if (this.socketStream != null) {
        long currentTime = Time.getCurrentTimeMillis();
        int diff = (int) (currentTime - this.lastUpdatedTime);
        this.lastUpdatedTime = currentTime;
        if (diff > 200) {
          diff = 200;
        }

        this.timeDiff += diff;
        if (this.timeDiff > 30000) {
          try {
            this.socketStream.destroy();
          } catch (Exception var18) {
          }

          this.socketStream = null;
        }
      }

      if (this.socketStream == null) {
        return this.method1253(4) == 0 && (this.method1246(11706) == 0);
      } else {
        try {
          this.socketStream.method1466(127);

          OndemandFileRequest var21;
          for (
            var21 = (OndemandFileRequest) this.aClass13_993.getFirst();
              var21 != null; var21 = (OndemandFileRequest) this.aClass13_993.getNext()) {
            this.buffer.position = 0;
            this.buffer.writeByte(1);
            this.buffer.writeMedium((int) var21.subnodeKey);
            this.socketStream.write(this.buffer.bytes, 0, 4);
            this.priorityRequests.addLast(var21);
          }

          for (
            var21 = (OndemandFileRequest) this.aClass13_1001.getFirst();
            var21 != null; var21 = (OndemandFileRequest) this.aClass13_1001.getNext()) {
            this.buffer.position = 0;
            this.buffer.writeByte(0);
            this.buffer.writeMedium((int) var21.subnodeKey);
            this.socketStream.write(this.buffer.bytes, 0, 4);
            this.normalRequests.addLast(var21);
          }

          for (int var3 = 0; var3 < 100; ++var3) {
            avail = this.socketStream.available();
            if (avail < 0) {
              throw new IOException();
            }

            if ((avail == 0)) {
              break;
            }

            this.timeDiff = 0;
            byte read = 0;
            if (this.currentRequest != null) {
              if ((this.currentRequest.anInt4067 == 0)) {
                read = 1;
              }
            } else {
              read = 8;
            }

            int var6;
            int var7;
            int var8;
            if (read <= 0) {
              var6 = -this.currentRequest.aByte4064 + this.currentRequest.buffer.bytes.length;
              var7 = -this.currentRequest.anInt4067 + 512;
              if (var7 > -this.currentRequest.buffer.position + var6) {
                var7 = -this.currentRequest.buffer.position + var6;
              }

              if (var7 > avail) {
                var7 = avail;
              }

              this.socketStream.read(this.currentRequest.buffer.bytes,
                  this.currentRequest.buffer.position, var7);
              if ((this.encryptionKey != 0)) {
                for (var8 = 0; var7 > var8; ++var8) {
                  this.currentRequest.buffer.bytes[this.currentRequest.buffer.position + var8] =
                    (byte) ObjectCache.bitXor(
                        this.currentRequest.buffer.bytes[this.currentRequest.buffer.position + var8],
                        this.encryptionKey);
                }
              }

              this.currentRequest.anInt4067 += var7;
              this.currentRequest.buffer.position += var7;
              if ((this.currentRequest.buffer.position == var6)) {
                this.currentRequest.unlinkSubNode();
                this.currentRequest.aBoolean3632 = false;
                this.currentRequest = null;
              } else {
                if ((this.currentRequest.anInt4067 == 512)) {
                  this.currentRequest.anInt4067 = 0;
                }
              }
            } else {
              var6 = -this.aClass3_Sub30_1008.position + read;
              if (avail < var6) {
                var6 = avail;
              }

              this.socketStream.read(this.aClass3_Sub30_1008.bytes,
                  this.aClass3_Sub30_1008.position, var6);
              if (this.encryptionKey != 0) {
                for (var7 = 0; var7 < var6; ++var7) {
                  this.aClass3_Sub30_1008.bytes[var7 + this.aClass3_Sub30_1008.position] =
                    (byte) ObjectCache.bitXor(
                        this.aClass3_Sub30_1008.bytes[var7 + this.aClass3_Sub30_1008.position],
                        this.encryptionKey);
                }
              }

              this.aClass3_Sub30_1008.position += var6;
              if ((this.aClass3_Sub30_1008.position >= read)) {
                if (this.currentRequest != null) {
                  if (this.currentRequest.anInt4067 != 0) {
                    throw new IOException();
                  }

                  if ((this.aClass3_Sub30_1008.bytes[0] == -1)) {
                    this.currentRequest.anInt4067 = 1;
                    this.aClass3_Sub30_1008.position = 0;
                  } else {
                    this.currentRequest = null;
                  }
                } else {
                  this.aClass3_Sub30_1008.position = 0;
                  var7 = this.aClass3_Sub30_1008.readUnsignedByte();
                  var8 = this.aClass3_Sub30_1008.readUnsignedShort();
                  int var9 = this.aClass3_Sub30_1008.readUnsignedByte();
                  int length = this.aClass3_Sub30_1008.readInt();
                  int compression = 127 & var9;
                  boolean priority = ((var9 & 128) != 0);
                  OndemandFileRequest var15 = null;
                  long var13 = (var7 << 16) + var8;
                  if (priority) {
                    for (
                        var15 = (OndemandFileRequest) this.normalRequests
                            .getFirst();
                        var15 != null && (var15.subnodeKey != var13);
                        var15 = (OndemandFileRequest) this.normalRequests
                            .getNext()) {
                    }
                  } else {
                    for (
                        var15 = (OndemandFileRequest) this.priorityRequests
                            .getFirst();
                        var15 != null && (var13 != var15.subnodeKey);
                        var15 = (OndemandFileRequest) this.priorityRequests
                            .getNext()) {
                    }
                  }

                  if (var15 == null) {
                    throw new IOException();
                  }

                  int var16 = compression != 0 ? 9 : 5;
                  this.currentRequest = var15;
                  this.currentRequest.buffer =
                    new Buffer(length - (-var16 - this.currentRequest.aByte4064));
                  this.currentRequest.buffer.writeByte(compression);
                  this.currentRequest.buffer.writeInt(length);
                  this.currentRequest.anInt4067 = 8;
                  this.aClass3_Sub30_1008.position = 0;
                }
              }
            }
          }

          return true;
        } catch (IOException var19) {
          try {
            this.socketStream.destroy();
          } catch (Exception var17) {
          }

          this.anInt1010 = -2;
          ++this.anInt1011;
          this.socketStream = null;
          return this.method1253(4) == 0 && (this.method1246(11706) == 0);
        }
      }
  }

  public void drop(boolean var1 ) {
    if (this.socketStream != null) {
        try {
          this.buffer.position = 0;
          if (!var1) {
            this.method1256((byte) 21);
          }

          this.buffer.writeByte(7);
          this.buffer.writeMedium(0);
          this.socketStream.write(this.buffer.bytes, 0, 4);
        } catch (IOException var5) {
          try {
            this.socketStream.destroy();
          } catch (Exception var4) {
          }

          ++this.anInt1011;
          this.anInt1010 = -2;
          this.socketStream = null;
        }

      }
  }

  private int method1246(int var1) {
    if (var1 != 11706) {
        OndemandRequester.aClass3_Sub28_Sub16Array996 = null;
      }

      return this.aClass13_1001.size() + this.normalRequests.size();
  }

  public void writeStatus(boolean var1, boolean var2 ) {
    if (var2) {
        if (this.socketStream != null) {
          try {
            this.buffer.position = 0;
            this.buffer.writeByte(var1 ? 2 : 3);
            this.buffer.writeMedium(0);
            this.socketStream.write(this.buffer.bytes, 0, 4);
          } catch (IOException var6) {
            try {
              this.socketStream.destroy();
            } catch (Exception var5) {
            }

            ++this.anInt1011;
            this.anInt1010 = -2;
            this.socketStream = null;
          }

        }
      }
  }

  public void method1248(int var1 ) {
    if (var1 != -29340) {
        this.method1246(-28);
      }

      if (this.socketStream != null) {
        this.socketStream.method1467();
      }
  }

  public void setSocket(boolean var1, SocketStream var2 ) {
    if (this.socketStream != null) {
        try {
          this.socketStream.destroy();
        } catch (Exception var8) {
        }

        this.socketStream = null;
      }

      this.socketStream = var2;
      this.method1256((byte) -77);
      this.writeStatus(var1, true);
      this.aClass3_Sub30_1008.position = 0;
      this.currentRequest = null;

      while (true) {
        OndemandFileRequest var4 = (OndemandFileRequest) this.priorityRequests.poll();
        if (var4 == null) {
          while (true) {
            var4 = (OndemandFileRequest) this.normalRequests.poll();
            if (var4 == null) {
              if (this.encryptionKey != 0) {
                try {
                  this.buffer.position = 0;
                  this.buffer.writeByte(4);
                  this.buffer.writeByte(this.encryptionKey);
                  this.buffer.writeShort(0);
                  this.socketStream.write(this.buffer.bytes, 0, 4);
                } catch (IOException var7) {
                  try {
                    this.socketStream.destroy();
                  } catch (Exception var6) {
                  }

                  this.anInt1010 = -2;
                  ++this.anInt1011;
                  this.socketStream = null;
                }
              }

              this.timeDiff = 0;
              this.lastUpdatedTime = Time.getCurrentTimeMillis();
              return;
            }

            this.aClass13_1001.addLast(var4);
          }
        }

        this.aClass13_993.addLast(var4);
      }
  }

  public boolean method1251(byte var1 ) {
    int var2 = 33 % ((2 - var1) / 58);
      return this.method1253(4) >= 20;
  }

  public void method1252(byte var1 ) {
    int var2 = -116 / ((var1 - 45) / 51);

      try {
        this.socketStream.destroy();
      } catch (Exception var4) {
      }

      this.anInt1010 = -1;
      this.encryptionKey = (byte) ((int) (255.0D * Math.random() + 1.0D));
      this.socketStream = null;
      ++this.anInt1011;
  }

  public int method1253(int var1 ) {
    if (var1 != 4) {
        this.method1252((byte) -45);
      }

      return this.aClass13_993.size() + this.priorityRequests.size();
  }

  public void shutdown(boolean var1 ) {
    if (this.socketStream != null) {
        this.socketStream.destroy();
      }

      if (var1) {
        this.writeStatus(true, false);
      }
  }

  public OndemandFileRequest request(int var1, int var2, byte var3,
      int var4,
      boolean var5 ) {
    OndemandFileRequest var8 = new OndemandFileRequest();
      long var6 = var4 + (var2 << 16);
      var8.aBoolean3628 = var5;
      var8.subnodeKey = var6;
      var8.aByte4064 = var3;
      int var9 = 120 / ((63 - var1) / 47);
      if (var5) {
        if ((this.method1253(4) >= 20)) {
          throw new RuntimeException();
        }

        this.aClass13_993.addLast(var8);
      } else {
        if (this.method1246(11706) >= 20) {
          throw new RuntimeException();
        }

        this.aClass13_1001.addLast(var8);
      }

      return var8;
  }

  private void method1256(byte var1) {
    if (this.socketStream != null) {
        if (var1 == -77) {
          try {
            this.buffer.position = 0;
            this.buffer.writeByte(6);
            this.buffer.writeMedium(3);
            this.socketStream.write(this.buffer.bytes, 0, 4);
          } catch (IOException var5) {
            try {
              this.socketStream.destroy();
            } catch (Exception var4) {
            }

            ++this.anInt1011;
            this.socketStream = null;
            this.anInt1010 = -2;
          }

        }
      }
  }

  public static void method1242(byte var0) {
    OndemandRequester.aClass3_Sub28_Sub16Array996 = null;
      if (var0 != -88) {
        OndemandRequester.method1250(-72, true);
      }

      OndemandRequester.aClass94_995 = null;
  }

  public static SomethingVolume15 method1245(int var0, FileUnpacker var1, int var2) {
    if (var0 <= 12) {
        OndemandRequester.anInt1002 = 107;
      }

      byte[] var3 = var1.getBytes(var2);
      return var3 != null ? new SomethingVolume15(var3) : null;
  }

  public static void method1250(int var0, boolean var1) {
    StringNode0.aByteArrayArrayArray2339 = null;
      GlobalStatics_4.anIntArrayArrayArray720 = null;
      if (var0 < 14) {
        OndemandRequester.method1250(10, true);
      }

      SomethingWorldMapy.aClass11_3551 = null;
      RenderAnimation.aByteArrayArrayArray383 = null;
      DummyClass51.anIntArray1161 = null;
      GlobalStatics_7.aByteArrayArrayArray2452 = null;
      if (var1 && GlobalStatics_0.aClass3_Sub28_Sub3_2600 != null) {
        TextureSampler4.aClass94_3220 = GlobalStatics_0.aClass3_Sub28_Sub3_2600.aClass94_3561;
      } else {
        TextureSampler4.aClass94_3220 = null;
      }

      GlobalStatics_0.aByteArrayArrayArray640 = null;
      TextureSampler29.aByteArrayArrayArray3390 = null;
      PlayerVariable.anIntArrayArrayArray558 = null;
      GlobalStatics_5.anIntArrayArrayArray1903 = null;
      GameObject.anInt2737 = 0;
      GlobalStatics_0.aClass3_Sub28_Sub3_2600 = null;
      DummyClass51.aClass61_1162.clear(-108);
      DummyClass25.aClass131_1624 = null;
      TextureSampler13.anInt3362 = -1;
      SomethingTexture1.aClass33_2648 = null;
      GlobalStatics_7.aClass33_1305 = null;
      SocketStream.aClass33_1238 = null;
      DummyClass12.aClass33_2034 = null;
      Something3d2.aClass33_3019 = null;
      DummyClass54.aClass33_1399 = null;
      SomethingTexture1.aClass33_2637 = null;
      DummyClass25.aClass33_1626 = null;
      GlobalStatics_0.aClass3_Sub28_Sub16_637 = null;
      ProceduralTexture.anInt1150 = -1;
      TextureSampler4.aClass3_Sub28_Sub16_Sub2_3221 = null;
  }

}
