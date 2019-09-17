package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.statics.GlobalStatics_9;

public final class SomethingPacket116 {

  public int anInt1746;
  public int anInt1747;
  public int anInt1750;
  public int anInt1752;
  public int anInt1757;
  private byte aByte1742;

  public SomethingPacket116() {
  }

  public SomethingPacket116(Buffer var1) {
    this.aByte1742 = var1.readByte();
    this.anInt1752 = var1.readUnsignedShort();
    this.anInt1757 = var1.readInt();
    this.anInt1747 = var1.readInt();
    this.anInt1746 = var1.readInt();
    this.anInt1750 = var1.readInt();
  }

  public int method1804(boolean var1) {
    if (var1) {
        GlobalStatics_9.anInt1753 = -21;
      }

      return this.aByte1742 & 7;
  }

  public int method1805(byte var1) {
    return (this.aByte1742 & 8) == 8 ? 1 : 0;
  }

}
