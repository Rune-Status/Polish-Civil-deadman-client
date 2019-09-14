package com.jagex.runescape;

import com.jagex.runescape.opengl.DummyClass46;
import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.GlUtils;
import java.math.BigInteger;

public class Buffer extends Node {

  private static GameString aClass94_2593 =
      GameString.create("Loaded interfaces");
  public static int[] anIntArray2591;
  public static int anInt2592;
  public static GameString aClass94_2594 =
      GameString.create("Polices charg-Bes");
  public static GameString[] aClass94Array2596;
  public static GameString LINE_BREAK = GameString.create("<br>");
  public static GameString aClass94_2599 =
      GameString.create("d-Broulement:");
  public static SomethingWorldMapy aClass3_Sub28_Sub3_2600;
  public static FileRequester[] aClass151_Sub1Array2601 = new FileRequester[28];
  public static GameString LOADED_INTERFACES = Buffer.aClass94_2593;
  public byte[] bytes;
  public int position;

  public Buffer(int var1) {
    this.bytes = DummyClass21.method1807(66, var1);
      this.position = 0;
  }

  public Buffer(byte[] var1) {
    this.position = 0;
      this.bytes = var1;
  }

  public final int readUnsignedShort() {
    this.position += 2;
      return (this.bytes[-2 + this.position] << 8 & '\uff00') +
          (this.bytes[-1 + this.position] & 255);
  }

  public final void writeInt(int var2) {
    this.bytes[this.position++] = (byte) (var2 >> 24);
      this.bytes[this.position++] = (byte) (var2 >> 16);
      this.bytes[this.position++] = (byte) (var2 >> 8);
      this.bytes[this.position++] = (byte) var2;
  }

  public final void method739(int var1, int var2, long var3) {
    --var2;
      if ((var2 >= 0) && (var2 <= 7)) {
        if (var1 == 0) {
          for (int var5 = var2 * 8; var5 >= 0; var5 -= 8) {
            this.bytes[this.position++] = (byte) ((int) (var3 >> var5));
          }
        }
      } else {
        throw new IllegalArgumentException();
      }
  }

  public final void writeLong(long var1) {
    this.bytes[this.position++] = (byte) ((int) (var1 >> 56));
      this.bytes[this.position++] = (byte) ((int) (var1 >> 48));

      this.bytes[this.position++] = (byte) ((int) (var1 >> 40));
      this.bytes[this.position++] = (byte) ((int) (var1 >> 32));
      this.bytes[this.position++] = (byte) ((int) (var1 >> 24));
      this.bytes[this.position++] = (byte) ((int) (var1 >> 16));
      this.bytes[this.position++] = (byte) ((int) (var1 >> 8));
      this.bytes[this.position++] = (byte) ((int) var1);
  }

  public final int method741(byte var1) {
    byte var2 = this.bytes[this.position++];
      if (var1 < 112) {
        Buffer.aClass94_2599 = null;
      }

      int var3;
      for (var3 = 0; var2 < 0; var2 = this.bytes[this.position++]) {
        var3 = (127 & var2 | var3) << 7;
      }

      return var2 | var3;
  }

  public final void method742(int var1, int var2) {
    this.bytes[-4 + this.position - var2] = (byte) (var2 >> 24);
      this.bytes[-var2 + this.position - 3] = (byte) (var2 >> 16);
      this.bytes[-2 + this.position - var2] = (byte) (var2 >> 8);
      if (var1 < 78) {
        this.method771(-102, 37);
      }

      this.bytes[-var2 + this.position - 1] = (byte) var2;
  }

  public final void method743(int var1, int var2) {
    this.bytes[this.position++] = (byte) (-var2 + 128);
      if (var1 != 10213) {
        this.method759(-121, -23);
      }
  }

  public final void writeString(GameString var2) {
    this.position +=
          var2.method1580(true, this.bytes, this.position, 0, var2.getLength());
      this.bytes[this.position++] = 0;
  }

  public final int method747(int var1) {
    this.position += 2;
      int var2 = (this.bytes[-2 + this.position] << 8 & '\uff00') -
          -(-128 + this.bytes[this.position - 1] & 255);
      if (var1 != -58) {
        this.readByte();
      }

      if (var2 > 32767) {
        var2 -= 65536;
      }

      return var2;
  }

  public final int readInt() {
    this.position += 4;
      return ((255 & this.bytes[this.position - 4]) << 24) +
          (0xff0000 & this.bytes[this.position - 3] << 16) +
          (((0xff & this.bytes[this.position - 2]) << 8) +
              (this.bytes[this.position - 1] & 255));
  }

  public final byte method749(boolean var1) {
    return var1 ? -79 : (byte) (-this.bytes[this.position++] + 128);
  }

  public final GameString method750(byte var1) {
    if (var1 != 78) {
        return null;
      } else if (this.bytes[this.position] != 0) {
        return this.readString();
      } else {
        ++this.position;
        return null;
      }
  }

  public final int method751(byte var1) {
    return 255 & this.bytes[this.position++] - 128;
  }

  public final void writeByte(int var2) {
    this.bytes[this.position++] = (byte) var2;
  }

  public final void write(byte[] var1, int var2, int var3) {
    int var5 = var2;
      while ((var5 < (var2 + var3))) {
        this.bytes[this.position++] = var1[var5];
        ++var5;
      }
  }

  public final int method754(boolean var1) {
    if (!var1) {
        this.position = 61;
      }

      return -this.bytes[this.position++] + 128 & 255;
  }

  public final int method755(byte var1) {
    this.position += 3;
    return ((this.bytes[this.position - 2] & 255) << 8) +
        ((this.bytes[-1 + this.position] & 255) << 16) +
        (this.bytes[-3 + this.position] & 255);
  }

  public final long readLong() {
    long var2 = this.readInt() & 0xffffffffL;
      long var4 = this.readInt() & 0xffffffffL;
      return var4 + (var2 << 32);
  }

  public final void writeIntLE(int var1, int var2) {
    this.bytes[this.position++] = (byte) var1;
      if (var2 < 54) {
        this.method749(false);
      }

      this.bytes[this.position++] = (byte) (var1 >> 8);
      this.bytes[this.position++] = (byte) (var1 >> 16);
      this.bytes[this.position++] = (byte) (var1 >> 24);
  }

  public final int readUnsignedShortAdd() {
    this.position += 2;
      return (this.bytes[-1 + this.position] - 128 & 255) +
          ('\uff00' & this.bytes[-2 + this.position] << 8);
  }

  public final void method759(int var1, int var2) {
    this.bytes[this.position++] = (byte) (var2 >> 16);
      this.bytes[this.position++] = (byte) (var2 >> 24);
      if (var1 >= -56) {
        this.writeSmart(82, 22);
      }

      this.bytes[this.position++] = (byte) var2;
      this.bytes[this.position++] = (byte) (var2 >> 8);
  }

  public final byte readByte() {
    return this.bytes[this.position++];
  }

  public final GameString method761(int var1) {
    byte var2 = this.bytes[this.position++];
      if (var1 < 50) {
        this.bytes = null;
      }

      if (var2 == 0) {
        int var3 = this.position;

        assert this.bytes != null;
        while ((this.bytes[this.position++] != 0)) {
        }

        return TextureSampler33.createString(this.bytes, var3,
            this.position - (var3 + 1));
      } else {
        throw new IllegalStateException("Bad version number in gjstr2");
      }
  }

  public final void writeFloatLE(float var1) {
    int var3 = Float.floatToRawIntBits(var1);
      this.bytes[this.position++] = (byte) var3;

      this.bytes[this.position++] = (byte) (var3 >> 8);
      this.bytes[this.position++] = (byte) (var3 >> 16);
      this.bytes[this.position++] = (byte) (var3 >> 24);
  }

  public final byte readByteNegate() {
      return (byte) (-this.bytes[this.position++]);

  }

  public final void copy(int offset, int size, byte[] data) {
    for (int index = offset; offset + size > index; ++index) {
      data[index] = this.bytes[this.position++];
    }
  }

  public final void method765(int var1, byte var2) {
      this.bytes[this.position++] = (byte) (var1 + 128);
      if (var2 == 3) {
        this.bytes[this.position++] = (byte) (var1 >> 8);
      }
  }

  public final int readUnsignedShortLE() {
    this.position += 2;
      return (255 & this.bytes[this.position - 2]) +
          ('\uff00' & this.bytes[this.position - 1] << 8);
  }

  public final void writeSmart(int var1, int var2) {
    if (var1 != -32769) {
        this.writeInt(-9);
      }

      if (var2 >= 0 && (var2 < 128)) {
        this.writeByte(var2);
      } else if (var2 >= 0 && (var2 < 32768)) {
        this.writeShort('\u8000' + var2);
      } else {
        throw new IllegalArgumentException();
      }
  }

  public final void method769(byte var1, int var2) {
    this.bytes[-1 - var2 + this.position] = (byte) var2;
      int var3 = 120 % ((-78 - var1) / 48);
  }

  public final void method770(int[] var1, int var2, int var3, int var4) {
    int var5 = this.position;
      this.position = var3;
      int var6 = (-var3 + var4) / 8;

      for (int var7 = 0; var6 > var7; ++var7) {
        int var10 = -957401312;
        int var8 = this.readInt();
        int var9 = this.readInt();
        int var12 = 32;

        for (int var11 = -1640531527; var12-- > 0;
            var8 -=
                (var9 >>> 5 ^ var9 << 4) + var9 ^ var1[var10 & 3] + var10) {
          var9 -= var1[(6754 & var10) >>> 11] + var10 ^
              var8 + (var8 >>> 5 ^ var8 << 4);
          var10 -= var11;
        }

        this.position -= 8;
        this.writeInt(var8);
        this.writeInt(var9);
      }

      if (var2 <= 102) {
        Buffer.anIntArray2591 = null;
      }

      this.position = var5;
  }

  public final void method771(int var1, int var2) {
    if (((-128 & var2) != 0)) {
        if (((-16384 & var2) != 0)) {
          if ((var2 & -2097152) != 0) {
            if ((-268435456 & var2) != 0) {
              this.writeByte(var2 >>> 28 | 128);
            }

            this.writeByte(128 | var2 >>> 21);
          }

          this.writeByte(128 | var2 >>> 14);
        }

        this.writeByte(var2 >>> 7 | 128);
      }

      this.writeByte(var2 & 127);
      if (var1 != 17038) {
        Buffer.aClass94_2594 = null;
      }
  }

  public final long readVariableLengthValue(int bytes, int var2) {
    --bytes;
      if (var2 <= bytes && (bytes <= 7)) {
        long var4 = 0L;

        for (int var3 = bytes * 8; (var3 >= 0); var3 -= 8) {
          var4 |= (this.bytes[this.position++] & 255L) << var3;
        }

        return var4;
      } else {
        throw new IllegalArgumentException();
      }
  }

  public final int method773(byte var1) {
    if (var1 >= -120) {
        return 3;
      } else {
        int var3 = readUnsignedShortSmart();

        int var2;
        for (var2 = 0; var3 == 32767; var2 += 32767) {
          var3 = readUnsignedShortSmart();
        }

        var2 += var3;
        return var2;
      }
  }

  public final void method774(int var1, int var2, byte[] var3, int var4) {
    if (var1 == 2) {
        for (int var5 = var4 - (-var2 + 1); (var4 <= var5); --var5) {
          var3[var5] = this.bytes[this.position++];
        }
      }
  }

  public final void method775(int var1, int var2) {
    if (var2 != 1437452424) {
        this.readInt((byte) 113);
      }

      this.bytes[this.position++] = (byte) (var1 >> 8);
      this.bytes[this.position++] = (byte) var1;
      this.bytes[this.position++] = (byte) (var1 >> 24);
      this.bytes[this.position++] = (byte) (var1 >> 16);
  }

  public final GameString readString() {
    int var2 = this.position;

      while (this.bytes[this.position++] != 0) {
      }

      return TextureSampler33.createString(this.bytes, var2,
          -var2 + (this.position - 1));
  }

  public final int readUnsignedShortSmart() {
    int first = this.bytes[this.position] & 255;
      return first >= 128 ? -32768 + this.readUnsignedShort()
          : this.readUnsignedByte();
  }

  public final void writeMedium(int var1) {
    this.bytes[this.position++] = (byte) (var1 >> 16);
      this.bytes[this.position++] = (byte) (var1 >> 8);
      this.bytes[this.position++] = (byte) var1;
  }

  public final int method780(int var1) {
    this.position += 4;
      return ((this.bytes[this.position - 2] & 255) << 24) +
          ((255 & this.bytes[this.position - 1]) << 16) +
          ('\uff00' & this.bytes[-4 + this.position] << 8) -
          -(this.bytes[this.position - 3] & 255);
  }

  public final int readShortLEAdd() {
    this.position += 2;

      return (this.bytes[-1 + this.position] << 8 & '\uff00') -
          -(255 & -128 + this.bytes[this.position - 2]);
  }

  public final int method782(int var1) {
    this.position += 4;
      if (var1 >= -42) {
        this.readByteNegate();
      }

      return (255 & this.bytes[-4 + this.position]) +
          (16711680 & this.bytes[this.position - 2] << 16) +
          ((255 & this.bytes[this.position - 1]) << 24) +
          ((this.bytes[-3 + this.position] & 255) << 8);
  }

  public final void method783(int var1, int var2) {
    if (var2 == -268435456) {
        this.bytes[this.position++] = (byte) (var1 >> 8);
        this.bytes[this.position++] = (byte) (128 + var1);
      }
  }

  public final void method785(int var1, byte var2) {
    this.bytes[this.position++] = (byte) var1;
      this.bytes[this.position++] = (byte) (var1 >> 8);
      if (var2 <= -118) {
        this.bytes[this.position++] = (byte) (var1 >> 16);
        this.bytes[this.position++] = (byte) (var1 >> 24);
      }
  }

  public final int method786(boolean var1) {
    if (!var1) {
        this.position = 46;
      }

      return 255 & -this.bytes[this.position++];
  }

  public final int method787(byte var1) {
    this.position += 2;
      int var2 = (this.bytes[-1 + this.position] & 255) +
          ((255 & this.bytes[this.position - 2]) << 8);
      if (var1 < 4) {
        return -83;
      } else {
        if ((var2 > 32767)) {
          var2 -= 65536;
        }

        return var2;
      }
  }

  public final int method788(int var1) {
    this.position += 2;
      int var2 = ((this.bytes[this.position - 1] & 255) << 8) -
          -(this.bytes[-2 + this.position] - 128 & 255);
      if (var1 != -1741292848) {
        //TODO rsa
        System.out.println("Buffer.method788");
        this.encipherRSA(null, null);
      }

      if (var2 > 32767) {
        var2 -= 65536;
      }

      return var2;
  }

  public final byte method789(int var1) {
    return var1 != 0 ? -51 : (byte) (-128 + this.bytes[this.position++]);
  }

  public final void method790(int var1, int var2) {
    if (var2 != -13071) {
        readUnsignedSmart();
      }

      this.bytes[this.position++] = (byte) (128 + var1);
  }

  public final int method791(byte var1) {
    this.position += 2;
      if (var1 != 10) {
        this.method751((byte) 109);
      }

      int var2 = (this.bytes[-2 + this.position] & 255) +
          ('\uff00' & this.bytes[this.position - 1] << 8);
      if (var2 > 32767) {
        var2 -= 65536;
      }

      return var2;
  }

  public final int writeChecksum(byte var1, int var2) {
    if (var1 < 1) {
        return 65;
      } else {
        int var3 =
            DummyClass54
                .method1599(var2, this.position, this.bytes, (byte) -49);
        this.writeInt(var3);
        return var3;
      }
  }

  public final int readUnsignedMedium(byte var1) {
    if (var1 < 76) {
        this.readUnsignedShortLE();
      }

      this.position += 3;
      return (16711680 & this.bytes[this.position - 3] << 16) +
          (('\uff00' & this.bytes[-2 + this.position] << 8) -
              -(this.bytes[this.position - 1] & 255));
  }

  public final void writeShortLE(int var1, int var2) {
    if (var1 != -1) {
        Buffer.aClass94Array2596 = null;
      }

      this.bytes[this.position++] = (byte) var2;
      this.bytes[this.position++] = (byte) (var2 >> 8);
  }

  public final int readUnsignedSmart() {
    int var2 = this.bytes[this.position] & 255;
      return (var2 < 128) ? -64 + this.readUnsignedByte()
          : this.readUnsignedShort() - '\uc000';
  }

  public final int readInt(byte var1) {
    this.position += 4;
      return ((this.bytes[-3 + this.position] & 255) << 24) -
          -(16711680 & this.bytes[this.position - 4] << 16) +
          (((this.bytes[this.position - 1] & 255) << 8) -
              -(255 & this.bytes[this.position - 2]));
  }

  public final void encipherRSA(BigInteger exponent, BigInteger modulus) {
    int var4 = this.position;
    this.position = 0;
    byte[] var5 = new byte[var4];
    this.copy(0, var4, var5);
    BigInteger var6 = new BigInteger(var5);
    BigInteger var7 = var6.modPow(exponent, modulus);
    byte[] var8 = var7.toByteArray();
    this.position = 0;
    this.writeByte(var8.length);
    this.write(var8, 0, var8.length);
  }

  public final void writeFloat(float var2) {
    int var3 = Float.floatToRawIntBits(var2);
      this.bytes[this.position++] = (byte) (var3 >> 24);
      this.bytes[this.position++] = (byte) (var3 >> 16);
      this.bytes[this.position++] = (byte) (var3 >> 8);
      this.bytes[this.position++] = (byte) var3;
  }

  public final int readUnsignedByte() {
    return this.bytes[this.position++] & 255;
  }

  public final void writeShort(int var2) {
    this.bytes[this.position++] = (byte) (var2 >> 8);
      this.bytes[this.position++] = (byte) var2;
  }

  public static void method744(boolean var0) {
    if (!var0) {
        Buffer.method784(-10, -32, -21);
      }

      ++Keyboard.anInt1908;
  }

  public static void method746(byte var0) {
    MouseRecorder.aClass93_1013.method1524(3);
  }

  public static void method767(int var0) {
    Buffer.aClass94_2599 = null;
      Buffer.anIntArray2591 = null;
      Buffer.LOADED_INTERFACES = null;
      Buffer.aClass3_Sub28_Sub3_2600 = null;
      Buffer.aClass94_2594 = null;
      Buffer.aClass94Array2596 = null;
      Buffer.aClass94_2593 = null;
      Buffer.aClass151_Sub1Array2601 = null;
      Buffer.LINE_BREAK = null;
  }

  public static void method777(CollisionMap[] collisionMaps, boolean var1,
      int var2, int var3, int var4, int var5, int var6,
      byte[] bytes) {
    int var10;
      int var11;
      if (!var1) {
        for (int var9 = 0; var9 < 4; ++var9) {
          for (var10 = 0; (var10 < 64); ++var10) {
            for (var11 = 0; (var11 < 64); ++var11) {
              if (((var5 + var10) > 0) && var10 + var5 < 103 &&
                  ((var3 + var11) > 0) && ((var11 + var3) < 103)) {
                collisionMaps[var9]
                    .anIntArrayArray1304[var10 + var5][var3 + var11] =
                    ClientScript.bitAnd(
                        collisionMaps[var9]
                            .anIntArrayArray1304[var10 + var5][var3 + var11],
                        -16777217);
              }
            }
          }
        }
      }

      Buffer var20 = new Buffer(bytes);
      byte var8;
      if (var1) {
        var8 = 1;
      } else {
        var8 = 4;
      }

      int var12;
      for (var10 = 0; var8 > var10; ++var10) {
        for (var11 = 0; (var11 < 64); ++var11) {
          for (var12 = 0; var12 < 64; ++var12) {
            DummyClass10.readTileData(var2, var6, var1, var20, var12 + var3,
                var5 + var11, (byte) 91, 0, var10);
          }
        }
      }

      int var14;
      int var15;
      int var17;
      boolean var21;
      int var24;
      for (var21 = false; var20.position < var20.bytes.length; var21 = true) {
        var11 = var20.readUnsignedByte();
        if (var11 != 129) {
          --var20.position;
          break;
        }

        for (var12 = 0; var12 < 4; ++var12) {
          byte var13 = var20.readByte();
          if (var13 == 0) {
            var14 = var5;
            if (var5 >= 0) {
              if ((var5 >= 104)) {
                var14 = 104;
              }
            } else {
              var14 = 0;
            }

            var24 = var3;
            if ((var3 < 0)) {
              var24 = 0;
            } else if ((var3 >= 104)) {
              var24 = 104;
            }

            var15 = 64 + var5;
            var17 = var3 + 64;
            if ((var17 >= 0)) {
              if (var17 >= 104) {
                var17 = 104;
              }
            } else {
              var17 = 0;
            }

            if ((var15 < 0)) {
              var15 = 0;
            } else if (var15 >= 104) {
              var15 = 104;
            }

            while ((var14 < var15)) {
              while (var24 < var17) {
                SceneShadowMap.aByteArrayArrayArray1774[var12][var14][var24] =
                    0;
                ++var24;
              }

              ++var14;
            }
          } else {
            if (var13 == 1) {
              for (var14 = 0; (var14 < 64); var14 += 4) {
                for (var15 = 0; var15 < 64; var15 += 4) {
                  byte var16 = var20.readByte();

                  for (var17 = var14 + var5; 4 + var5 + var14 > var17;
                      ++var17) {
                    for (int var18 = var3 + var15; (var18 < (4 + var3 + var15));
                        ++var18) {
                      if (var17 >= 0 && (var17 < 104) && var18 >= 0 &&
                          (var18 < 104)) {
                        SceneShadowMap
                            .aByteArrayArrayArray1774[var12][var17][var18] =
                            var16;
                      }
                    }
                  }
                }
              }
            } else {
              if (var13 == 2 && (var12 > 0)) {
                var15 = var5 + 64;
                var24 = var3;
                var17 = var3 + 64;
                if ((var15 < 0)) {
                  var15 = 0;
                } else if (var15 >= 104) {
                  var15 = 104;
                }

                if ((var3 >= 0)) {
                  if ((var3 >= 104)) {
                    var24 = 104;
                  }
                } else {
                  var24 = 0;
                }

                if ((var17 >= 0)) {
                  if ((var17 >= 104)) {
                    var17 = 104;
                  }
                } else {
                  var17 = 0;
                }

                var14 = var5;
                if (var5 >= 0) {
                  if (var5 >= 104) {
                    var14 = 104;
                  }
                } else {
                  var14 = 0;
                }

                while (var15 > var14) {
                  while ((var24 < var17)) {
                    SceneShadowMap
                        .aByteArrayArrayArray1774[var12][var14][var24] =
                        SceneShadowMap
                            .aByteArrayArrayArray1774[var12 - 1][var14][var24];
                    ++var24;
                  }

                  ++var14;
                }
              }
            }
          }
        }
      }

      if (var4 == 4) {
        int var23;
        if (GlRenderer.useOpenGlRenderer && !var1) {
          BlockConfig var22 = null;

          while ((var20.position < var20.bytes.length)) {
            var12 = var20.readUnsignedByte();
            if (var12 == 0) {
              var22 = new BlockConfig(var20);
            } else {
              if ((var12 != 1)) {
                throw new IllegalStateException();
              }

              var23 = var20.readUnsignedByte();
              if (var23 > 0) {
                for (var14 = 0; var23 > var14; ++var14) {
                  Light var25 = new Light(var20);
                  if ((var25.anInt705 == 31)) {
                    LightIntensity var26 = DummyClass50.method1401(
                        1001, var20.readUnsignedShort());
                    var25.method1060((byte) -67, var26.anInt896, var26.anInt908,
                        var26.anInt899, var26.anInt907);
                  }

                  var25.anInt708 += var3 << 7;
                  var25.anInt703 += var5 << 7;
                  var17 = var25.anInt708 >> 7;
                  var24 = var25.anInt703 >> 7;
                  if ((var24 >= 0) && var17 >= 0 && (var24 < 104) &&
                      (var17 < 104)) {
                    var25.aBoolean696 =
                        (BZipDecompressorState.tileFlags[1][var24][var17]
                            & 2) != 0;
                    var25.anInt697 =
                        AbstractGameWorld
                            .heightMap[var25.anInt704][var24][var17] +
                            -var25.anInt697;
                    DummyClass46.method1264(var25);
                  }
                }
              }
            }
          }

          if (var22 == null) {
            var22 = new BlockConfig();
          }

          for (var12 = 0; (var12 < 8); ++var12) {
            for (var23 = 0; (var23 < 8); ++var23) {
              var14 = var12 + (var5 >> 3);
              var15 = (var3 >> 3) + var23;
              if (var14 >= 0 && var14 < 13 && (var15 >= 0) && (var15 < 13)) {
                DummyClass27.blockConfigs[var14][var15] = var22;
              }
            }
          }
        }

        if (!var21) {
          for (var11 = 0; var11 < 4; ++var11) {
            for (var12 = 0; var12 < 16; ++var12) {
              for (var23 = 0; var23 < 16; ++var23) {
                var14 = (var5 >> 2) + var12;
                var15 = var23 + (var3 >> 2);
                if (var14 >= 0 && var14 < 26 && var15 >= 0 && var15 < 26) {
                  SceneShadowMap.aByteArrayArrayArray1774[var11][var14][var15] =
                      0;
                }
              }
            }
          }
        }
      }
  }

  public static SomethingSceneJ method784(int var0, int var1, int var2) {
    SceneGraphTile var3 = SomethingTexture1.sceneGraphTiles[var0][var1][var2];
    return var3 != null && var3.aClass12_2230 != null ? var3.aClass12_2230
        : null;
  }

  public static void method792(int var0) {
    if (var0 == 9179409) {
        int var1 = DummyClass20.method1817((byte) 70);
        if (var1 == 0) {
          AbstractImageProducer.aByteArrayArrayArray2008 = null;
          SceneShadowMap.method1816(0, -7);
        } else if ((var1 == 1)) {
          SomethingInScenePacket202.method112((byte) 0, (byte) 55);
          SceneShadowMap.method1816(512, -7);
          TextureSampler19.method257((byte) 125);
        } else {
          SomethingInScenePacket202.method112(
              (byte) (-4 + BitVariable.anInt1127 & 255), (byte) 55);
          SceneShadowMap.method1816(2, -7);
        }
      }
  }

  public static void method795(byte var0, int var1) {
    if (var0 != 14) {
        Buffer.anIntArray2591 = null;
      }

      ClientScriptCall.aClass93_2450.method1522(var0 ^ -114, var1);
  }

  public static void method799(int var0, int var1, int var2, int var3,
      int var4) {
    if ((GameObject.anInt2737 < 100)) {
        GroundItemNode.method626(64);
      }

      if (GlRenderer.useOpenGlRenderer) {
        GlUtils.clip(var0, var2, var0 + var4, var3 + var2);
      } else {
        DummyClass47.method1324(var0, var2, var0 + var4, var3 + var2);
      }

      int var6;
      int var7;
      if ((GameObject.anInt2737 >= 100)) {
        DummyClass1.anInt410 =
            (int) ((var3 * 2) / AbstractGameWorld.aFloat727);
        DummyClass44.anInt930 =
            SomethingQuickChat2.anInt3536 +
                -((int) (var4 / AbstractGameWorld.aFloat727));
        int var15 = -((int) (var4 / AbstractGameWorld.aFloat727)) +
            SomethingQuickChat2.anInt3536;
        var6 = SpawnedGameObject.anInt2251 -
            (int) (var3 / AbstractGameWorld.aFloat727);
        DummyClass44.anInt934 =
            SpawnedGameObject.anInt2251 +
                -((int) (var3 / AbstractGameWorld.aFloat727));
        int var8 = SpawnedGameObject.anInt2251 +
            (int) (var3 / AbstractGameWorld.aFloat727);
        var7 = (int) (var4 / AbstractGameWorld.aFloat727) +
            SomethingQuickChat2.anInt3536;
        GZipDecompressor.anInt817 =
            (int) ((var4 * 2) / AbstractGameWorld.aFloat727);
        if (var1 != 64) {
          Buffer.aClass94Array2596 = null;
        }

        if (GlRenderer.useOpenGlRenderer) {
          if (TextureSampler4.aClass3_Sub28_Sub16_Sub2_3221 == null ||
              (TextureSampler4.aClass3_Sub28_Sub16_Sub2_3221.anInt3707 != var4) ||
              (TextureSampler4.aClass3_Sub28_Sub16_Sub2_3221.anInt3696 != var3)) {
            TextureSampler4.aClass3_Sub28_Sub16_Sub2_3221 = null;
            TextureSampler4.aClass3_Sub28_Sub16_Sub2_3221 =
                new SoftwareDirectColorSprite(var4, var3);
          }

          DummyClass47.method1319(
              TextureSampler4.aClass3_Sub28_Sub16_Sub2_3221.pixels, var4, var3);
          SubNode.method523(var4, 0, 0, var7, var6, 0, var8, var3, var15);
          DummyClass30.method938(var4, 0, var7, var8, var3, 0, 1, var15, var6);
          SomethingInScenePacket202.method111((byte) -54, 0, 0, var15, var4,
              var8, var6, var7, var3);
          GlUtils.drawImage(
              TextureSampler4.aClass3_Sub28_Sub16_Sub2_3221.pixels, var0, var2,
              var4, var3);
          DummyClass47.anIntArray1100 = null;
        } else {
          SubNode.method523(var4 + var0, var2, 0, var7, var6, var0, var8,
              var2 + var3, var15);
          DummyClass30.method938(var0 + var4, var0, var7, var8, var3 + var2,
              var2, 1, var15, var6);
          SomethingInScenePacket202.method111((byte) -100, var0, var2, var15,
              var0 + var4, var8, var6, var7,
              var3 + var2);
        }

        if (AbstractDirectColorSprite.anInt3704 > 0) {
          --ByteArrayNode.anInt3611;
          if ((ByteArrayNode.anInt3611 == 0)) {
            ByteArrayNode.anInt3611 = 20;
            --AbstractDirectColorSprite.anInt3704;
          }
        }

        if (DummyClass29.aBoolean438) {
          int var10 = -8 + var2 + var3;
          int var9 = -5 + (var0 + var4);
          SomethingTilek.p12Font.method688(
              RenderAnimation.concat(new GameString[]{
                  DummyClass45.aClass94_985,
                  SomethingScene.toString(AnimationSequence.fps)}),
              var9, var10, 16776960, -1);
          Runtime var11 = Runtime.getRuntime();
          int var12 = (int) ((var11.totalMemory() - var11.freeMemory())
              / 1024L);
          int var13 = 16776960;
          var10 -= 15;
          if ((var12 > 65536)) {
            var13 = 16711680;
          }

          SomethingTilek.p12Font.method688(
              RenderAnimation.concat(new GameString[]{
                  DummyClass25.MEMORY_PREFIX, SomethingScene.toString(var12),
                  TextureSampler34.aClass94_3055}),
              var9, var10, var13, -1);
          var10 -= 15;
        }

      } else {
        byte var5 = 20;
        var6 = var0 + (var4 / 2);
        var7 = var3 / 2 + (var2 - 18) - var5;
        if (GlRenderer.useOpenGlRenderer) {
          GlUtils.fillQuad(var0, var2, var4, var3, 0);
          GlUtils.drawQuad(var6 - 152, var7, 304, 34, 9179409);
          GlUtils.drawQuad(var6 - 151, var7 + 1, 302, 32, 0);
          GlUtils.fillQuad(-150 + var6, var7 + 2, 3 * GameObject.anInt2737, 30,
              9179409);
          GlUtils.fillQuad(-150 + var6 + GameObject.anInt2737 * 3, var7 + 2,
              300 - (3 * GameObject.anInt2737), 30, 0);
        } else {
          DummyClass47.method1323(var0, var2, var4, var3, 0);
          DummyClass47.method1311(var6 - 152, var7, 304, 34, 9179409);
          DummyClass47.method1311(var6 - 151, 1 + var7, 302, 32, 0);
          DummyClass47.method1323(var6 - 150, var7 + 2,
              GameObject.anInt2737 * 3, 30, 9179409);
          DummyClass47.method1323(3 * GameObject.anInt2737 - 150 + var6,
              var7 + 2, -(GameObject.anInt2737 * 3) + 300,
              30, 0);
        }

        FloorOverlay.aClass3_Sub28_Sub17_2096.draw(
            IdentityKit.aClass94_462, var6, var5 + var7, 16777215, -1);
      }
  }

  public static GameString method802(int var0, boolean var1) {
    if (!var1) {
        Buffer.method746((byte) -33);
      }

      return (DummyClass8.aClass94Array4016[var0].getLength() > 0)
          ? RenderAnimation.concat(
          new GameString[]{GroundItem.aClass94Array2935[var0],
              DummyInputStream.aClass94_43,
              DummyClass8.aClass94Array4016[var0]})
          : GroundItem.aClass94Array2935[var0];
  }
}
