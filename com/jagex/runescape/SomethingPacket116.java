package com.jagex.runescape;

public final class SomethingPacket116 {

  public static int[] anIntArray1743 = new int[25];
  public static int anInt1744;
  public static GameString aClass94_1745 = GameString.create("settings");
  public static int anInt1748;
  public static Widget aClass11_1749;
  public static FileUnpacker worldMapData;
  public static int anInt1753;
  public static int cycles;
  public static int[] anIntArray1755 = new int[128];
  public static int anInt1756;
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
    try {
      if (var1) {
        SomethingPacket116.anInt1753 = -21;
      }

      return this.aByte1742 & 7;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "sg.B(" + var1 + ')');
    }
  }

  public int method1805(byte var1) {
    try {
      return 8 != (this.aByte1742 & 8) ? 0 : 1;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "sg.C(" + var1 + ')');
    }
  }

  public static void method1802() {
    SomethingPacket116.aClass94_1745 = null;
    SomethingPacket116.anIntArray1743 = null;
    SomethingPacket116.anIntArray1755 = null;
    SomethingPacket116.worldMapData = null;
    SomethingPacket116.aClass11_1749 = null;
  }

  public static void method1803(byte var0) {
    if (var0 >= 4) {
      ProceduralTexture.aClass93_1146.method1523((byte) -119);
      DummyClass13.aClass93_2016.method1523((byte) -103);
    }
  }

}
