package com.jagex.runescape;

import com.jagex.runescape.buffer.BufferStatics;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.opengl.GLStatics;
import com.jagex.runescape.opengl.GlTexture2d;

public final class BZipDecompressorState {

  public static byte[][][] tileFlags = new byte[4][104][104];
  public static GameString FILE_RUNES = GameStringStatics.create("runes");
  public static int anInt120 = 255;
  public static GameString COMMAND_PREFIX = GameStringStatics.create("::");
  public static int anInt136;
  public static int anInt144;
  public static GameString aClass94_145 = GameStringStatics.create("gelb:");
  public int[][] anIntArrayArray108 = new int[6][258];
  public byte[] aByteArray109 = new byte[4096];
  public int[][] anIntArrayArray110 = new int[6][258];
  public byte aByte111;
  public boolean[] aBooleanArray112 = new boolean[256];
  public byte[] aByteArray114 = new byte[256];
  public int[][] anIntArrayArray115 = new int[6][258];
  public int anInt116;
  public byte[] aByteArray117;
  public int anInt118;
  public int anInt121;
  public int[] anIntArray122 = new int[257];
  public int[] anIntArray123 = new int[16];
  public boolean[] aBooleanArray124 = new boolean[16];
  public int anInt126;
  public byte[] aByteArray127;
  public int anInt128;
  public int anInt129;
  public byte[] aByteArray130 = new byte[18002];
  public int anInt131;
  public int anInt133;
  public int[] anIntArray134 = new int[256];
  public int anInt135;
  public int anInt137;
  public int[] anIntArray138 = new int[6];
  public byte[] aByteArray139 = new byte[18002];
  public int anInt140;
  public int anInt141;
  public int anInt142;
  public int anInt143;
  public byte[][] aByteArrayArray146 = new byte[6][258];
  public int anInt147;


  public static void method848(int var0) {
    if (GlobalStatics_4.aFloat727 < GlobalStatics_9.aFloat3979) {
        GlobalStatics_4.aFloat727 = (float) (GlobalStatics_4.aFloat727
          + GlobalStatics_4.aFloat727 / 30.0D);
        if (GlobalStatics_9.aFloat3979 < GlobalStatics_4.aFloat727) {
          GlobalStatics_4.aFloat727 = GlobalStatics_9.aFloat3979;
        }

        GlobalStatics_9.method117((byte) 87);
      } else if (GlobalStatics_9.aFloat3979 < GlobalStatics_4.aFloat727) {
        GlobalStatics_4.aFloat727 = (float) (GlobalStatics_4.aFloat727
          - GlobalStatics_4.aFloat727 / 30.0D);
        if (GlobalStatics_9.aFloat3979 > GlobalStatics_4.aFloat727) {
          GlobalStatics_4.aFloat727 = GlobalStatics_9.aFloat3979;
        }

        GlobalStatics_9.method117((byte) 87);
      }

      if ((GlobalStatics_9.anInt1150 != -1) && GlobalStatics_9.anInt3362 != -1) {
        int var1 = -GlobalStatics_9.anInt3536 + GlobalStatics_9.anInt1150;
        if (var1 < 2 || (var1 > 2)) {
          var1 >>= 4;
        }

        int var2 = -GlobalStatics_9.anInt2251 + GlobalStatics_9.anInt3362;
        if (var2 < 2 || var2 > 2) {
          var2 >>= 4;
        }

        GlobalStatics_9.anInt2251 -= -var2;
        GlobalStatics_9.anInt3536 += var1;
        if (var1 == 0 && var2 == 0) {
          GlobalStatics_9.anInt1150 = -1;
          GlobalStatics_9.anInt3362 = -1;
        }

        GlobalStatics_9.method117((byte) 87);
      }

      if (var0 != 4) {
        BZipDecompressorState.COMMAND_PREFIX = null;
      }
  }

  public static void method849(int var0) {
    BZipDecompressorState.aClass94_145 = null;
      if (var0 == 2) {
        BufferStatics.aByteArrayArray125 = null;
        BZipDecompressorState.FILE_RUNES = null;
        BZipDecompressorState.COMMAND_PREFIX = null;
        BZipDecompressorState.tileFlags = null;
      }
  }

  public static void method850(byte var0) {
    GlobalStatics_10.aClass94_3142 = GlobalStatics_9.aClass94_3649;
      GlobalStatics_9.aClass94_3546 = GlobalStatics_9.aClass94_2002;
      GlobalStatics_4.aClass94_825 = GlobalStatics_9.aClass94_1281;
      DummyClass44.aClass94_935 = DummyClass10.aClass94_2086;
      DummyClass32.SKILL = DummyClass1.aClass94_415;
      GlobalStatics_0.aClass94_1180 = GlobalStatics_10.aClass94_3079;
      GlobalStatics_0.aClass94_1183 = DummyClass50.aClass94_1143;
      DummyClass14.aClass94_1962 = GlobalStatics_10.aClass94_2207;
      GlobalStatics_10.aClass94_3124 = DummyClass4.aClass94_3002;
      GlobalStatics_8.aClass94_36 = GlobalStatics_9.aClass94_3106;
      GlobalStatics_10.aClass94_3333 = DummyClass35.aClass94_667;
      GlobalStatics_10.aClass94_3427 = DummyClass49.aClass94_1110;
      DummyClass8.aClass94_4024 = GlobalStatics_7.aClass94_2945;
      GlobalStatics_10.aClass94_3311 = GlobalStatics_10.aClass94_3157;
      GlobalStatics_9.aClass94_374 = GlobalStatics_4.aClass94_3634;
      GlobalStatics_8.aClass94_1409 = GlobalStatics_9.aClass94_3957;
      GlobalStatics_10.aClass94_2481 = GlobalStatics_7.aClass94_1636;
      GlobalStatics_8.aClass94_2751 = GlobalStatics_9.aClass94_3991;
      GlobalStatics_9.CONNECTING_TO_UPDATE_SERVER = GlobalStatics_0.aClass94_2585;
      if (var0 != 121) {
        BZipDecompressorState.method848(-68);
      }

      GlobalStatics_9.aClass94_3645 = DummyClass45.aClass94_989;
      DummyHashTable.aClass94_1688 = DummyClass15.aClass94_1878;
      GlobalStatics_9.aClass94_461 = DummyClass41.aClass94_868;
      GlobalStatics_10.aClass94_3426 = GlobalStatics_9.aClass94_1907;
      DummyClass30.aClass94_459 = GlobalStatics_6.aClass94_3585;
      GlobalStatics_2.aClass94_2576 = GlobalStatics_6.aClass94_1882;
      GlobalStatics_2.aClass94_2216 = GlobalStatics_0.aClass94_1179;
      GlTexture2d.aClass94_3762 = GlobalStatics_10.aClass94_3172;
      GlobalStatics_10.aClass94_3117 = DummyClass4.aClass94_3002;
      GlobalStatics_7.aClass94_4058 = GlobalStatics_10.aClass94_3146;
      GlobalStatics_1.aClass94_2196 = DummyClass58.aClass94_1459;
      GlobalStatics_9.aClass94_3643 = GlobalStatics_5.aClass94_1621;
      GlobalStatics_9.aClass94_3988 = GLStatics.aClass94_699;
      DummyClass27.aClass94_1583 = GlobalStatics_9.OK;
      DummyClass53.aClass94_1335 = GlobalStatics_9.aClass94_2274;
      GlobalStatics_10.aClass94_3167 = GlobalStatics_4.aClass94_3633;
      DummyClass5.aClass94_2991 = GlobalStatics_6.aClass94_3583;
      GlobalStatics_9.aClass94_2267 = GlobalStatics_9.aClass94_3646;
      GlobalStatics_9.aClass94_327 = DummyClass35.aClass94_659;
      DummyClass14.ATTEMPTING_TO_RECONNECT = GlTexture2d.aClass94_3758;
      GlobalStatics_9.aClass94_551 = GlobalStatics_10.aClass94_3345;
      GlobalStatics_10.aClass94_4040 = GlobalStatics_6.aClass94_1122;
      GlobalStatics_10.aClass94_1731 = GlobalStatics_10.aClass94_3206;
      GlobalStatics_0.aClass94_2151 = GlobalStatics_9.aClass94_3251;
      GlobalStatics_8.OPTION_DROP = GlobalStatics_6.aClass94_2518;
      GlobalStatics_2.aClass94_43 = GlobalStatics_9.aClass94_3131;
      DummyClass42.DEFAULT_WALK_TOOLTIP = GlobalStatics_9.aClass94_2252;
      GLStatics.aClass94_691 = GlobalStatics_9.aClass94_3656;
      GlobalStatics_9.aClass94_3575 = GlobalStatics_9.aClass94_325;
      GlobalStatics_9.aClass94_4071 = DummyClass20.aClass94_1783;
      GlobalStatics_10.aClass94_3445 = GlobalStatics_7.aClass94_1089;
      GlobalStatics_6.aClass94_3691 = GlobalStatics_0.aClass94_77;
      GlobalStatics_9.aClass94_2624 = GlobalStatics_9.aClass94_897;
      DummyClass15.aClass94_1879 = GlobalStatics_0.aClass94_2594;
      GlobalStatics_10.aClass94_3397 = DummyClass20.aClass94_1782;
      GlobalStatics_6.aClass94_2526 = DummyClass26.aClass94_1612;
      GlobalStatics_9.aClass94_361 = GlobalStatics_9.aClass94_550;
      GlobalStatics_10.aClass94_3097 = GlobalStatics_9.aClass94_3650;
      GlobalStatics_9.aClass94_2285 = DummyClass45.aClass94_988;
      GlobalStatics_9.aClass94_3544 = GlobalStatics_10.aClass94_3436;
      GlobalStatics_8.aClass94_4 = GlobalStatics_9.aClass94_973;
      GlobalStatics_9.aClass94_62 = GlobalStatics_7.aClass94_1085;
      GlobalStatics_9.aClass94_2667 = GlobalStatics_8.aClass94_1508;
      GlobalStatics_9.aClass94_462 = GlobalStatics_9.aClass94_3771;
      GlobalStatics_10.aClass94_2210 = GlobalStatics_2.aClass94_343;
      GlobalStatics_0.aClass94_1707 = GlobalStatics_9.aClass94_905;
      GlobalStatics_7.aClass94_2961 = DummyClass32.aClass94_520;
      GlobalStatics_8.aClass94_957 = DummyClass1.aClass94_412;
      DummyClass35.aClass94_662 = DummyClass5.aClass94_2995;
      DummyClass12.aClass94_2031 = GlobalStatics_8.aClass94_35;
      DummyClass26.aClass94_1615 = GlobalStatics_3.aClass94_2458;
      GlobalStatics_4.aClass94_3629 = DummyClass39.aClass94_738;
      GlobalStatics_6.aClass94_3584 = GlobalStatics_9.aClass94_2641;
      DummyClass32.aClass94_525 = DummyClass45.aClass94_982;
      GlobalStatics_6.aClass94_3586 = GlobalStatics_9.aClass94_2641;
      GlobalStatics_10.aClass94_1722 = DummyClass45.aClass94_981;
      GlobalStatics_9.CONNECTION_LOST = GlobalStatics_10.aClass94_3302;
      GlobalStatics_6.aClass94_1884 = GlobalStatics_9.aClass94_1294;
      GlobalStatics_0.LOADED_INTERFACES = GlobalStatics_8.aClass94_951;
      GlobalStatics_9.aClass94_485 = DummyCanvas.aClass94_24;
      GlobalStatics_9.aClass94_3249 = GlobalStatics_9.aClass94_3774;
      DummyClass35.aClass94_666 = DummyClass5.aClass94_2995;
      ItemConfig.aClass94_809 = GlobalStatics_10.aClass94_3119;
      GlobalStatics_10.aClass94_3051 = GlobalStatics_5.aClass94_1620;
      GlobalStatics_10.LOADING_PLEASE_WAIT = GlobalStatics_8.aClass94_1523;
      GlobalStatics_7.CONNECTED_TO_UPDATE_SERVER = GlobalStatics_10.aClass94_4036;
      GlobalStatics_4.aClass94_822 = GlobalStatics_8.aClass94_7;
      GlobalStatics_10.aClass94_1892 = GlobalStatics_8.aClass94_1509;
      GlobalStatics_10.aClass94_3388 = DummyClass34.aClass94_593;
      DummyClass32.aClass94_523 = GlobalStatics_0.aClass94_2599;
      DummyClass24.aClass94_1653 = GLStatics.aClass94_701;
  }

}
