package com.jagex.runescape;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;

public final class StillGraphicNode extends SubNode {

  private static GameString aClass94_3541 = GameStringStatics.create("yellow:");
  private static GameString aClass94_3543 = GameStringStatics.create("Loading config )2 ");
  public static int anInt3542;
  public static GameString aClass94_3547 = GameStringStatics.create("Speicher wird zugewiesen)3");
  public static GameString aClass94_3544 = StillGraphicNode.aClass94_3541;
  public static GameString aClass94_3548 = StillGraphicNode.aClass94_3541;
  public static GameString aClass94_3546 = StillGraphicNode.aClass94_3543;
  public StillGraphic aClass140_Sub2_3545;


  public StillGraphicNode(StillGraphic var1 ) {
    this.aClass140_Sub2_3545 = var1;
  }

  public static void method534(int var0) {
    StillGraphicNode.aClass94_3546 = null;
      StillGraphicNode.aClass94_3548 = null;
      StillGraphicNode.aClass94_3543 = null;
      int var1 = 101 % ((-29 - var0) / 45);
      StillGraphicNode.aClass94_3544 = null;
      StillGraphicNode.aClass94_3547 = null;
      StillGraphicNode.aClass94_3541 = null;
  }

  public static SomethingTexture3 method536(byte var0, Buffer var1) {
    if (var0 != 54) {
        StillGraphicNode.method534(117);
      }

      return new SomethingTexture3(var1.method787((byte) 25), var1.method787((byte) 73),
        var1.method787((byte) 114), var1.method787((byte) 33), var1.method787((byte) 78),
        var1.method787((byte) 91), var1.method787((byte) 120), var1.method787((byte) 113),
        var1.readUnsignedMedium((byte) 115), var1.readUnsignedByte());
  }

}
