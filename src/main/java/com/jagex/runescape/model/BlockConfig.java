package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.opengl.GlEnvironment;

public final class BlockConfig {

  public int anInt1175;
  public int anInt1177;
  public int sunPosZ;
  public int sunPositionY;
  public int anInt1184;
  public int sunPositionX;
  public float aFloat1187;
  public float aFloat1189;
  public float aFloat1190;

  public BlockConfig() {
    this.anInt1177 = GlEnvironment.defaultSunColor;
      this.aFloat1189 = 1.2F;
      this.sunPosZ = -50;
      this.aFloat1187 = 1.1523438F;
      this.anInt1175 = GlEnvironment.defaultFogColor;
      this.sunPositionY = -60;
      this.aFloat1190 = 0.69921875F;
      this.anInt1184 = 0;
      this.sunPositionX = -50;
  }

  public BlockConfig(Buffer var1 ) {
    int var2 = var1.readUnsignedByte();
      if ((var2 & 1) == 0) {
        this.anInt1177 = GlEnvironment.defaultSunColor;
      } else {
        this.anInt1177 = var1.readInt();
      }

      if ((2 & var2) == 0) {
        this.aFloat1187 = 1.1523438F;
      } else {
        this.aFloat1187 = var1.readUnsignedShort() / 256.0F;
      }

      if ((var2 & 4) == 0) {
        this.aFloat1190 = 0.69921875F;
      } else {
        this.aFloat1190 = var1.readUnsignedShort() / 256.0F;
      }

      if ((var2 & 8) == 0) {
        this.aFloat1189 = 1.2F;
      } else {
        this.aFloat1189 = var1.readUnsignedShort() / 256.0F;
      }

      if ((16 & var2) == 0) {
        this.sunPosZ = -50;
        this.sunPositionX = -50;
        this.sunPositionY = -60;
      } else {
        this.sunPositionX = var1.method787((byte) 53);
        this.sunPositionY = var1.method787((byte) 15);
        this.sunPosZ = var1.method787((byte) 50);
      }

      if ((32 & var2) == 0) {
        this.anInt1175 = GlEnvironment.defaultFogColor;
      } else {
        this.anInt1175 = var1.readInt();
      }

      if ((64 & var2) == 0) {
        this.anInt1184 = 0;
      } else {
        this.anInt1184 = var1.readUnsignedShort();
      }
  }

}
