package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.statics.GlobalStatics_3;
import com.jagex.runescape.statics.GlobalStatics_8;

public final class GameBuffer extends Buffer {

  private ISAACCipher cipher;
  private int bitOffset;

  public GameBuffer(int var1) {
    super(var1);
  }

  public void method807(byte var1) {
    this.bitOffset = this.position * 8;
  }

  public void method811(byte var1, int var2, byte[] var3, int var4) {
    if (var1 < 16) {
      GlobalStatics_8.printMessage(null, 126, null, -28);
    }

    for (int var5 = 0; var5 < var4; ++var5) {
      var3[var2 + var5] = (byte) (this.bytes[this.position++] - this.cipher
          .getNextValue());
    }
  }

  public int readBits(int len) {
    int byteOffset = this.bitOffset >> 3;
    int pass = 8 - (7 & this.bitOffset);
    int value = 0;
    this.bitOffset += len;

    while ((pass < len)) {
      value += (GlobalStatics_3.BIT_MASKS[pass] & this.bytes[byteOffset++])
          << -pass + len;
      len -= pass;
      pass = 8;
    }

    if ((pass == len)) {
      value += this.bytes[byteOffset] & GlobalStatics_3.BIT_MASKS[pass];
    } else {
      value +=
          this.bytes[byteOffset] >> pass - len & GlobalStatics_3.BIT_MASKS[len];
    }

    return value;
  }

  public void initializeCipher(int[] keys) {
    this.cipher = new ISAACCipher(keys);
  }

  public int method815(int var1, int var2) {
    if (var2 != 32666) {
      this.method811((byte) 96, 46, null, -50);
    }

    return var1 * 8 - this.bitOffset;
  }

  public void writePacket(int id) {
    System.out.println("GameBuffer.writePacket " + id);
    this.bytes[this.position++] = (byte) (id + this.cipher.getNextValue());
  }

  public int readPacketId() {
    return 255 & this.bytes[this.position++] - this.cipher.getNextValue();
  }

  public void method818(boolean var1) {
    this.position = (this.bitOffset + 7) / 8;
      if (var1) {
        this.readBits(-75);
      }
  }

}
