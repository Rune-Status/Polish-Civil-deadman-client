package com.jagex.runescape.buffer;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.node.Node;
import java.math.BigInteger;

public class Buffer extends Node {

  public byte[] bytes;
  public int position;

  public Buffer(int var1) {
    this.bytes = BufferStatics.method1807(66, var1);
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
    if (var2 >= 0 && var2 <= 7) {
      if (var1 == 0) {
        for (int var5 = var2 << 3; var5 >= 0; var5 -= 8) {
          this.bytes[this.position++] = (byte) (int) (var3 >> var5);
        }
      }
    } else {
      throw new IllegalArgumentException();
    }
  }

  public final void writeLong(long var1) {
    this.bytes[this.position++] = (byte) (int) (var1 >> 56);
    this.bytes[this.position++] = (byte) (int) (var1 >> 48);

    this.bytes[this.position++] = (byte) (int) (var1 >> 40);
    this.bytes[this.position++] = (byte) (int) (var1 >> 32);
    this.bytes[this.position++] = (byte) (int) (var1 >> 24);
    this.bytes[this.position++] = (byte) (int) (var1 >> 16);
    this.bytes[this.position++] = (byte) (int) (var1 >> 8);
    this.bytes[this.position++] = (byte) (int) var1;
  }

  public final int method741() {
    byte var2 = this.bytes[this.position++];
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

  public final void writeString(GameString data) {
    this.position += data
        .method1580(this.bytes, this.position, 0, data.getLength());
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
        ((0xff & this.bytes[this.position - 2]) << 8) +
        (this.bytes[this.position - 1] & 255);
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
    while (var5 < var2 + var3) {
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

  public final int method755() {
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
      while (this.bytes[this.position++] != 0) {
      }

      return GameStringStatics.createString(this.bytes, var3,
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
    return (byte) -this.bytes[this.position++];

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

    if (var2 >= 0 && var2 < 128) {
      this.writeByte(var2);
    } else if (var2 >= 0 && var2 < 32768) {
      this.writeShort(0x8000 + var2);
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
    this.position = var5;
  }

  public final void method771(int var1, int var2) {
    if ((-128 & var2) != 0) {
      if ((-16384 & var2) != 0) {
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
  }

  public final long readVariableLengthValue(int bytes, int var2) {
    --bytes;
    if (var2 <= bytes && bytes <= 7) {
      long var4 = 0L;

      for (int var3 = bytes * 8; var3 >= 0; var3 -= 8) {
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
      for (int var5 = var4 - (-var2 + 1); var4 <= var5; --var5) {
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

    return GameStringStatics.createString(this.bytes, var2,
        -var2 + this.position - 1);
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
      if (var2 > 32767) {
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
          BufferStatics
              .method1599(var2, this.position, this.bytes);
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
        ('\uff00' & this.bytes[-2 + this.position] << 8) -
        -(this.bytes[this.position - 1] & 255);
  }

  public final void writeShortLE(int var1, int var2) {
    this.bytes[this.position++] = (byte) var2;
    this.bytes[this.position++] = (byte) (var2 >> 8);
  }

  public final int readUnsignedSmart() {
    int var2 = this.bytes[this.position] & 255;
    return var2 < 128 ? -64 + this.readUnsignedByte()
        : this.readUnsignedShort() - '\uc000';
  }

  public final int readInt(byte var1) {
    this.position += 4;
    return ((this.bytes[-3 + this.position] & 255) << 24) -
        -(16711680 & this.bytes[this.position - 4] << 16) +
        ((this.bytes[this.position - 1] & 255) << 8) -
        -(255 & this.bytes[this.position - 2]);
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

}
