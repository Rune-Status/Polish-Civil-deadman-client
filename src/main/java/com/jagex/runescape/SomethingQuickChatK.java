package com.jagex.runescape;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;

public final class SomethingQuickChatK {

  public static GameString aClass94_148 = GameStringStatics.create("(U(Y");
  public static GameString aClass94_150 = GameStringStatics.create("Ausw-=hlen");
  public static FileUnpacker aClass153_152;
  public static int anInt154;
  public int anInt149;
  public SomethingQuickChat aClass3_Sub28_Sub4_151;
  public int[] anIntArray153;

  public static SoftwareDirectColorSprite[] createSprites() {
    SoftwareDirectColorSprite[] var1 = new SoftwareDirectColorSprite[DummyClass53.spriteCount];
      for (int var2 = 0; (var2 < DummyClass53.spriteCount); ++var2) {
        int var3 = TextureSampler26.anIntArray3076[var2] * GroundItem.anIntArray2931[var2];
        byte[] var4 = DummyClass5.aByteArrayArray2987[var2];
        int[] var5 = new int[var3];

        for (int var6 = 0; (var6 < var3); ++var6) {
          var5[var6] = TextureSampler38.anIntArray3446[255 & (int) var4[var6]];
        }

        var1[var2] =
          new SoftwareDirectColorSprite(SomethingVolume15.anInt2426, SomethingPacket116.anInt1748,
            Something3dRoot.anIntArray2048[var2], GlobalStatics_0.anIntArray2591[var2],
            GroundItem.anIntArray2931[var2], TextureSampler26.anIntArray3076[var2], var5);
      }

      DummyClass37.method1035((byte) 113);
      return var1;
  }

  public static void method852(byte var0, int var1) {
    Inventory var2 = (Inventory) GlobalStatics_2.aClass130_2220.get(var1);
      if (var2 != null) {
        if (var0 != 114) {
          SomethingQuickChatK.aClass153_152 = null;
        }

        for (int var3 = 0; var2.ids.length > var3; ++var3) {
          var2.ids[var3] = -1;
          var2.counts[var3] = 0;
        }

      }
  }

  public static void method853(int var0) {
    SomethingQuickChatK.aClass94_148 = null;
      SomethingQuickChatK.aClass94_150 = null;

      SomethingQuickChatK.aClass153_152 = null;
  }

}
