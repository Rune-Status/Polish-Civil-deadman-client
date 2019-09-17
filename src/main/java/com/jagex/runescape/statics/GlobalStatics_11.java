package com.jagex.runescape.statics;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.ArrayUtils;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.common.HashTable;
import com.jagex.runescape.huffman.HuffmanEncoderStatics;
import com.jagex.runescape.model.AudioStreamEncoder1;
import com.jagex.runescape.model.BlockConfig;
import com.jagex.runescape.model.ClientScript;
import com.jagex.runescape.model.ClientScriptCall;
import com.jagex.runescape.model.ClientScriptEnum;
import com.jagex.runescape.model.CollisionMap;
import com.jagex.runescape.model.DisplayMode;
import com.jagex.runescape.model.FileUnpacker;
import com.jagex.runescape.model.GameWorld;
import com.jagex.runescape.model.GameWorldSomething;
import com.jagex.runescape.model.IntegerNode;
import com.jagex.runescape.model.ItemConfig;
import com.jagex.runescape.model.LightIntensity;
import com.jagex.runescape.model.MidiInstrument;
import com.jagex.runescape.model.Mobile;
import com.jagex.runescape.model.Parameter;
import com.jagex.runescape.model.Player;
import com.jagex.runescape.model.Queue;
import com.jagex.runescape.model.ScriptState;
import com.jagex.runescape.model.SomethingMidiI;
import com.jagex.runescape.model.SomethingMidiInstrument;
import com.jagex.runescape.model.SomethingMidiOther;
import com.jagex.runescape.model.SomethingMidik;
import com.jagex.runescape.model.SomethingMusic0;
import com.jagex.runescape.model.SomethingPacket151;
import com.jagex.runescape.model.SomethingQuickChat;
import com.jagex.runescape.model.SomethingQuickChat2;
import com.jagex.runescape.model.SomethingQuickChatK;
import com.jagex.runescape.model.SomethingWorldMapy;
import com.jagex.runescape.model.TextureCache;
import com.jagex.runescape.model.Widget;
import com.jagex.runescape.model.WidgetUpdate;
import com.jagex.runescape.opengl.DummyClass46;
import com.jagex.runescape.opengl.GLStatics;
import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.Light;
import com.jagex.runescape.opengl.MaterialShader5;
import com.jagex.runescape.settings.SettingsStatics;
import java.nio.charset.StandardCharsets;
import java.util.Date;

public final class GlobalStatics_11 {

  public static GameString aClass94_806;
  public static GameString aClass94_811;
  public static int anInt759;
  public static int anInt763;
  public static int[] anIntArray781 = new int[99];
  public static GameString aClass94_808;
  public static GameString aClass94_809;
  public static float[] aFloatArray2387;
  public static float[] aFloatArray2388;
  public static int[] anIntArray2391;
  public static SomethingMidik[] aClass152Array2392;
  public static boolean[] aBooleanArray2393;
  public static int anInt2396;
  public static SomethingMidiOther[] aClass150Array2398;
  public static float[] aFloatArray2399;
  public static float[] aFloatArray2400;
  public static int anInt2402;
  public static float[] aFloatArray2403;
  public static int anInt2404;
  public static boolean aBoolean2405;
  public static SomethingMidiI[] aClass59Array2407;
  public static int[] anIntArray2409;
  public static float[] aFloatArray2413;
  public static int anInt2414;
  public static float[] aFloatArray2416;
  public static byte[] aByteArray2417;
  public static int[] anIntArray2420;
  public static SomethingMidiInstrument[] aClass71Array2406;
  public static GameString[] titleSuffixes;
  public static short aShort46 = 256;
  public static boolean aBoolean47;
  public static int anInt48 = 2;
  public static int[] anIntArray49;
  public static GameString aClass94_50 = GameStringStatics
      .create("<col=80ff00>");
  public static GameString aClass94_51 = GameStringStatics.create("; Expires=");

  public static void method58(int var0) {
    int var1 = 0;
    if (var0 >= -46) {
      GlobalStatics_11
          .method60(95, -37, -27, null, -59, (byte) -121, null, -69, -50, -72,
              false);
    }

    while (var1 < GlobalStatics_9.anInt997) {
      int var2 = DummyClass60.anIntArray441[var1];
      Player var3 = GlobalStatics_9.players[var2];
      int var4 = GlobalStatics_9.gameBuffer.readUnsignedByte();
      if ((16 & var4) != 0) {
        var4 += GlobalStatics_9.gameBuffer.readUnsignedByte() << 8;
      }

      DummyClass38.method1080(var4, var2, (byte) -79, var3);
      ++var1;
    }
  }

  public static void method56(int var0, int var1) {
    int var3 = 81 % ((39 - var1) / 41);
    WidgetUpdate var2 = GlobalStatics_6.method466(4, 6, var0);
    var2.createIndexedColorSprite(true);
  }

  public static boolean method57(int var0, int var1) {
    if (com.jagex.runescape.statics.GlobalStatics_0.aBooleanArray1703[var0]) {
      return true;
    } else {
      if (GlobalStatics_9.aClass153_3361.method2117(-99, var0)) {
        int var2 = GlobalStatics_9.aClass153_3361
            .getAmountChildren(var0, (byte) 94);
        if (var2 == 0) {
          com.jagex.runescape.statics.GlobalStatics_0.aBooleanArray1703[var0] = true;
          return true;
        } else {
          if (GlobalStatics_9.aClass11ArrayArray1834[var0] == null) {
            GlobalStatics_9.aClass11ArrayArray1834[var0] = new Widget[var2];
          }

          for (int var3 = 0; var3 < var2; ++var3) {
            if (GlobalStatics_9.aClass11ArrayArray1834[var0][var3] == null) {
              byte[] var4 = GlobalStatics_9.aClass153_3361
                  .getBytes(var0, var3);
              if (var4 != null) {
                Widget var5 = GlobalStatics_9.aClass11ArrayArray1834[var0][var3] = new Widget();
                var5.anInt279 = var3 + (var0 << 16);
                if (var4[0] == -1) {
                  var5.method867(var1 ^ -105, new Buffer(var4));
                } else {
                  var5.method858(-115, new Buffer(var4));
                }
              }
            }
          }

          com.jagex.runescape.statics.GlobalStatics_0.aBooleanArray1703[var0] = true;
          if (var1 != 104) {
            GlobalStatics_11.method58(100);
          }

          return true;
        }
      } else {
        return false;
      }
    }
  }

  public static void method60(int var0, int var1, int var2, CollisionMap[] var3,
      int var4, byte var5,
      byte[] var6, int var7, int var8, int var9, boolean var10) {
    int var13;
    if (!var10) {
      for (int var12 = 0; var12 < 8; ++var12) {
        for (var13 = 0; var13 < 8; ++var13) {
          if (var1 + var12 > 0 && var12 + var1 < 103 && var13 + var4 > 0
              && var4
              + var13 < 103) {
            var3[var2].anIntArrayArray1304[var12 + var1][var13 + var4] =
                var3[var2].anIntArrayArray1304[var12 + var1][var13
                    + var4] & -16777217;
          }
        }
      }
    }

    if (var5 >= -91) {
      GlobalStatics_8.aClass94_36 = null;
    }

    byte var11;
    if (var10) {
      var11 = 1;
    } else {
      var11 = 4;
    }

    Buffer var25 = new Buffer(var6);

    int var14;
    int var15;
    for (var13 = 0; var13 < var11; ++var13) {
      for (var14 = 0; var14 < 64; ++var14) {
        for (var15 = 0; var15 < 64; ++var15) {
          if (var7 == var13 && var9 <= var14 && 8 + var9 > var14
              && var8 <= var15
              && var15 < 8 + var8) {
            DummyClass10.readTileData(0, 0, var10, var25,
                GlobalStatics_9
                    .method310(var0, (byte) -117, 7 & var14, 7 & var15)
                    + var4,
                GlobalStatics_2.method519(var0, true, var15 & 7, var14 & 7)
                    + var1,
                (byte) 63, var0, var2);
          } else {
            DummyClass10
                .readTileData(0, 0, var10, var25, -1, -1, (byte) 123, 0, 0);
          }
        }
      }
    }

    int var17;
    int var21;
    int var20;
    int var22;
    int var29;
    while (var25.bytes.length > var25.position) {
      var14 = var25.readUnsignedByte();
      if (var14 != 129) {
        --var25.position;
        break;
      }

      for (var15 = 0; var15 < 4; ++var15) {
        byte var16 = var25.readByte();
        int var18;
        if (var16 != 0) {
          if (var16 == 1) {
            for (var17 = 0; var17 < 64; var17 += 4) {
              for (var18 = 0; var18 < 64; var18 += 4) {
                byte var19 = var25.readByte();
                if (var15 <= var7) {
                  for (var20 = var17; var20 < var17 + 4; ++var20) {
                    for (var21 = var18; var21 < 4 + var18; ++var21) {
                      if (var20 >= var9 && var20 < 8 + var9
                          && var21 >= var8
                          && var8 + 8 > var8) {
                        var22 = var1 + GlobalStatics_2
                            .method519(var0, true, var21 & 7, var20 & 7);

                        int var23 =
                            GlobalStatics_9
                                .method310(var0, (byte) -97, 7 & var20,
                                    var21 & 7)
                                + var4;
                        if (var22 >= 0 && var22 < 104 && var23 >= 0
                            && var23 < 104) {
                          GlobalStatics_9.aByteArrayArrayArray1774[var2][var22][var23] = var19;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } else if (var15 <= var7) {
          var18 = 7 + var1;
          var17 = var1;
          var20 = var4 + 7;
          if (var20 < 0) {
            var20 = 0;
          } else if (var20 >= 104) {
            var20 = 104;
          }

          if (var18 >= 0) {
            if (var18 >= 104) {
              var18 = 104;
            }
          } else {
            var18 = 0;
          }

          var29 = var4;
          if (var4 < 0) {
            var29 = 0;
          } else if (var4 >= 104) {
            var29 = 104;
          }

          if (var1 < 0) {
            var17 = 0;
          } else if (var1 >= 104) {
            var17 = 104;
          }

          while (var18 > var17) {
            while (var29 < var20) {
              GlobalStatics_9.aByteArrayArrayArray1774[var2][var17][var29] = 0;
              ++var29;
            }

            ++var17;
          }
        }
      }
    }

    boolean var27 = false;
    int var28;
    if (GlRenderer.useOpenGlRenderer && !var10) {
      BlockConfig var26 = null;

      while (var25.bytes.length > var25.position) {
        var15 = var25.readUnsignedByte();
        if (var15 == 0) {
          var26 = new BlockConfig(var25);
        } else {
          if (var15 != 1) {
            throw new IllegalStateException();
          }

          var28 = var25.readUnsignedByte();
          if (var28 > 0) {
            for (var17 = 0; var17 < var28; ++var17) {
              Light var30 = new Light(var25);
              if (var30.anInt705 == 31) {
                LightIntensity var31 = DummyClass50
                    .method1401(1001, var25.readUnsignedShort());
                var30.method1060((byte) 123, var31.anInt896, var31.anInt908,
                    var31.anInt899,
                    var31.anInt907);
              }

              var29 = var30.anInt703 >> 7;
              var20 = var30.anInt708 >> 7;
              if (var7 == var30.anInt704 && var29 >= var9
                  && var9 + 8 > var29
                  && var8 <= var20 && var8 + 8 > var20) {
                var21 =
                    GlobalStatics_9
                        .method514(var0, var30.anInt703 & 1023, (byte) -83,
                            1023 & var30.anInt708) + (var1 << 7);
                var22 = GlobalStatics_10
                    .method293(var30.anInt703 & 1023, var0, false,
                        1023 & var30.anInt708) + (var4 << 7);
                var30.anInt703 = var21;
                var30.anInt708 = var22;
                var29 = var30.anInt703 >> 7;
                var20 = var30.anInt708 >> 7;
                if (var29 >= 0 && var20 >= 0 && var29 < 104
                    && var20 < 104) {
                  var30.aBoolean696 =
                      (2 & GlobalStatics_10.tileFlags[1][var29][var20]) != 0;
                  var30.anInt697 =
                      GlobalStatics_4.heightMap[var30.anInt704][var29][var20]
                          - var30.anInt697;
                  DummyClass46.method1264(var30);
                }
              }
            }
          }
        }
      }

      if (var26 == null) {
        var26 = new BlockConfig();
      }

      DummyClass27.blockConfigs[var1 >> 3][var4 >> 3] = var26;
    }

    var14 = 7 + var1;
    var15 = var4 + 7;

    for (var28 = var1; var28 < var14; ++var28) {
      for (var17 = var4; var17 < var15; ++var17) {
        GlobalStatics_9.aByteArrayArrayArray1774[var2][var28][var17] = 0;
      }
    }
  }

  public static void method59(byte var0) {
    GlobalStatics_8.aClass94_28 = null;
    GlobalStatics_8.aClass94_35 = null;
    GlobalStatics_8.aClass94_34 = null;
    if (var0 >= -69) {
      GlobalStatics_8.aBoolean29 = false;
    }

    GlobalStatics_8.aClass94_36 = null;
    GlobalStatics_8.aClass94_32 = null;
  }

  public static void method1103(FileUnpacker var0, FileUnpacker var1,
      boolean var2) {
    GlobalStatics_10.aClass153_3173 = var0;
    GlobalStatics_9.aClass153_557 = var1;
  }

  public static void callScript(byte byte0, int i,
      ClientScriptCall class3_sub16) {
    Object[] aobj = class3_sub16.arguments;
    int j = ((Integer) aobj[0]).intValue();
    ClientScript class3_sub28_sub15 = GlobalStatics_6.method572(j, (byte) -91);
    if (class3_sub28_sub15 == null) {
      return;
    }
    GlobalStatics_9.anInt4002 = 0;
    int l = 0;
    int k = 0;
    int i1 = -1;
    int[] ai1 = class3_sub28_sub15.anIntArray3690;
    int[] ai = class3_sub28_sub15.anIntArray3683;
    if (byte0 > -9) {
      GlobalStatics_11.aClass94_811 = null;
    }
    byte byte1 = -1;
    GlobalStatics_9.anIntArray1662 = new int[class3_sub28_sub15.anInt3680];
    int k1 = 0;
    DummyClass56.aClass94Array1454 = new GameString[class3_sub28_sub15.anInt3687];
    int l1 = 0;
    for (int i2 = 1; i2 < aobj.length; i2++) {
      if (aobj[i2] instanceof Integer) {
        int k2 = ((Integer) aobj[i2]).intValue();
        if (~k2 == 0x7ffffffe) {
          k2 = class3_sub16.anInt2447;
        }
        if (k2 == 0x80000002) {
          k2 = class3_sub16.anInt2441;
        }
        if (~k2 == 0x7ffffffc) {
          k2 = class3_sub16.aClass11_2449 == null ? -1
              : class3_sub16.aClass11_2449.anInt279;
        }
        if (k2 == 0x80000004) {
          k2 = class3_sub16.anInt2445;
        }
        if (~k2 == 0x7ffffffa) {
          k2 = class3_sub16.aClass11_2449 == null ? -1
              : class3_sub16.aClass11_2449.anInt191;
        }
        if (~k2 == 0x7ffffff9) {
          k2 = class3_sub16.aClass11_2438 == null ? -1
              : class3_sub16.aClass11_2438.anInt279;
        }
        if (~k2 == 0x7ffffff8) {
          k2 = class3_sub16.aClass11_2438 != null
              ? class3_sub16.aClass11_2438.anInt191 : -1;
        }
        if (~k2 == 0x7ffffff7) {
          k2 = class3_sub16.anInt2444;
        }
        if (~k2 == 0x7ffffff6) {
          k2 = class3_sub16.anInt2443;
        }
        GlobalStatics_9.anIntArray1662[k1++] = k2;
        continue;
      }
      if (!(aobj[i2] instanceof GameString)) {
        continue;
      }
      GameString class94 = (GameString) aobj[i2];
      if (class94.method1528((byte) -42, GlobalStatics_10.EVENT_OP_BASE)) {
        class94 = class3_sub16.aClass94_2439;
      }
      DummyClass56.aClass94Array1454[l1++] = class94;
    }

    int j2 = 0;
    label0:
    do {
      j2++;
      if (i < j2) {
        throw new RuntimeException("slow");
      }
      int j1 = ai[++i1];
      if (j1 < 100) {
        if (j1 == 0) {
          GlobalStatics_9.anIntArray2929[k++] = ai1[i1];
          continue;
        }
        if (j1 == 1) {
          int l2 = ai1[i1];
          GlobalStatics_9.anIntArray2929[k++] = DummyClass5.anIntArray2985[l2];
          continue;
        }
        if (j1 == 2) {
          int i3 = ai1[i1];
          GlobalStatics_0
              .method1428(i3, 63, GlobalStatics_9.anIntArray2929[--k]);
          continue;
        }
        if (j1 == 3) {
          GlobalStatics_0.aClass94Array75[l++] = class3_sub28_sub15.aClass94Array3688[i1];
          continue;
        }
        if (j1 == 6) {
          i1 += ai1[i1];
          continue;
        }
        if (j1 == 7) {
          k -= 2;
          if (GlobalStatics_9.anIntArray2929[k]
              != GlobalStatics_9.anIntArray2929[1 + k]) {
            i1 += ai1[i1];
          }
          continue;
        }
        if (j1 == 8) {
          k -= 2;
          if (GlobalStatics_9.anIntArray2929[k + 1]
              == GlobalStatics_9.anIntArray2929[k]) {
            i1 += ai1[i1];
          }
          continue;
        }
        if (j1 == 9) {
          k -= 2;
          if (GlobalStatics_9.anIntArray2929[k]
              < GlobalStatics_9.anIntArray2929[1 + k]) {
            i1 += ai1[i1];
          }
          continue;
        }
        if (j1 == 10) {
          k -= 2;
          if (GlobalStatics_9.anIntArray2929[k + 1]
              < GlobalStatics_9.anIntArray2929[k]) {
            i1 += ai1[i1];
          }
          continue;
        }
        if (j1 == 21) {
          if (GlobalStatics_9.anInt4002 == 0) {
            return;
          }
          ScriptState class54 = GlobalStatics_9.aClass54Array2841[--GlobalStatics_9.anInt4002];
          class3_sub28_sub15 = class54.aClass3_Sub28_Sub15_874;
          GlobalStatics_9.anIntArray1662 = class54.anIntArray870;
          ai = class3_sub28_sub15.anIntArray3683;
          i1 = class54.anInt877;
          DummyClass56.aClass94Array1454 = class54.aClass94Array873;
          ai1 = class3_sub28_sub15.anIntArray3690;
          continue;
        }
        if (j1 == 25) {
          int j3 = ai1[i1];
          GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_9
              .method1484(0x3dd4def, j3);
          continue;
        }
        if (j1 == 27) {
          int k3 = ai1[i1];
          GlobalStatics_9
              .method306(k3, false, GlobalStatics_9.anIntArray2929[--k]);
          continue;
        }
        if (j1 == 31) {
          k -= 2;
          if (GlobalStatics_9.anIntArray2929[1 + k]
              >= GlobalStatics_9.anIntArray2929[k]) {
            i1 += ai1[i1];
          }
          continue;
        }
        if (j1 == 32) {
          k -= 2;
          if (GlobalStatics_9.anIntArray2929[k]
              >= GlobalStatics_9.anIntArray2929[1 + k]) {
            i1 += ai1[i1];
          }
          continue;
        }
        if (j1 == 33) {
          GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_9.anIntArray1662[ai1[i1]];
          continue;
        }
        if (j1 == 34) {
          GlobalStatics_9.anIntArray1662[ai1[i1]] = GlobalStatics_9.anIntArray2929[--k];
          continue;
        }
        if (j1 == 35) {
          GlobalStatics_0.aClass94Array75[l++] = DummyClass56.aClass94Array1454[ai1[i1]];
          continue;
        }
        if (j1 == 36) {
          DummyClass56.aClass94Array1454[ai1[i1]] = GlobalStatics_0.aClass94Array75[--l];
          continue;
        }
        if (j1 == 37) {
          int l3 = ai1[i1];
          l -= l3;
          GameString class94_2 = GlobalStatics_9
              .method1261(l, l3, GlobalStatics_0.aClass94Array75, 2774);
          GlobalStatics_0.aClass94Array75[l++] = class94_2;
          continue;
        }
        if (j1 == 38) {
          k--;
          continue;
        }
        if (j1 == 39) {
          l--;
          continue;
        }
        if (j1 == 40) {
          int i4 = ai1[i1];
          ClientScript class3_sub28_sub15_1 = GlobalStatics_6
              .method572(i4, (byte) -91);
          int[] ai2 = new int[class3_sub28_sub15_1.anInt3680];
          GameString[] aclass94 = new GameString[class3_sub28_sub15_1.anInt3687];
          for (int l75 = 0; class3_sub28_sub15_1.anInt3678 > l75; l75++) {
            ai2[l75] = GlobalStatics_9.anIntArray2929[l75 + k
                - class3_sub28_sub15_1.anInt3678];
          }

          for (int i76 = 0; class3_sub28_sub15_1.anInt3682 > i76; i76++) {
            aclass94[i76] = GlobalStatics_0.aClass94Array75[
                i76 - class3_sub28_sub15_1.anInt3682 + l];
          }

          k -= class3_sub28_sub15_1.anInt3678;
          l -= class3_sub28_sub15_1.anInt3682;
          ScriptState class54_1 = new ScriptState();
          class54_1.aClass94Array873 = DummyClass56.aClass94Array1454;
          class54_1.anIntArray870 = GlobalStatics_9.anIntArray1662;
          class54_1.anInt877 = i1;
          class54_1.aClass3_Sub28_Sub15_874 = class3_sub28_sub15;
          if (GlobalStatics_9.anInt4002
              >= GlobalStatics_9.aClass54Array2841.length) {
            throw new RuntimeException();
          }
          class3_sub28_sub15 = class3_sub28_sub15_1;
          i1 = -1;
          GlobalStatics_9.aClass54Array2841[GlobalStatics_9.anInt4002++] = class54_1;
          GlobalStatics_9.anIntArray1662 = ai2;
          ai1 = class3_sub28_sub15.anIntArray3690;
          ai = class3_sub28_sub15.anIntArray3683;
          DummyClass56.aClass94Array1454 = aclass94;
          continue;
        }
        if (j1 == 42) {
          GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_9.anIntArray1277[ai1[i1]];
          continue;
        }
        if (j1 == 43) {
          int j4 = ai1[i1];
          GlobalStatics_9.anIntArray1277[j4] = GlobalStatics_9.anIntArray2929[--k];
          DummyClass18.method825((byte) 92, j4);
          continue;
        }
        if (j1 == 44) {
          int k4 = ai1[i1] >> 16;
          int l43 = GlobalStatics_9.anIntArray2929[--k];
          int k5 = 0xffff & ai1[i1];
          if (l43 < 0 || l43 > 5000) {
            throw new RuntimeException();
          }
          GlobalStatics_9.anIntArray509[k4] = l43;
          byte byte2 = -1;
          if (k5 == 105) {
            byte2 = 0;
          }
          int j76 = 0;
          while (l43 > j76) {
            GlobalStatics_0.anIntArrayArray20[k4][j76] = byte2;
            j76++;
          }
          continue;
        }
        if (j1 == 45) {
          int l4 = ai1[i1];
          int l5 = GlobalStatics_9.anIntArray2929[--k];
          if (l5 < 0 || l5 >= GlobalStatics_9.anIntArray509[l4]) {
            throw new RuntimeException();
          }
          GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_0.anIntArrayArray20[l4][l5];
          continue;
        }
        if (j1 == 46) {
          int i5 = ai1[i1];
          k -= 2;
          int i6 = GlobalStatics_9.anIntArray2929[k];
          if (i6 < 0 || i6 >= GlobalStatics_9.anIntArray509[i5]) {
            throw new RuntimeException();
          }
          GlobalStatics_0.anIntArrayArray20[i5][i6] = GlobalStatics_9.anIntArray2929[
              1 + k];
          continue;
        }
        if (j1 == 47) {
          GameString class94_1 = DummyClass22.aClass94Array1739[ai1[i1]];
          if (class94_1 == null) {
            class94_1 = GlobalStatics_9.aClass94_2928;
          }
          GlobalStatics_0.aClass94Array75[l++] = class94_1;
          continue;
        }
        if (j1 == 48) {
          int j5 = ai1[i1];
          DummyClass22.aClass94Array1739[j5] = GlobalStatics_0.aClass94Array75[--l];
          GlobalStatics_9.method1126(-94, j5);
          continue;
        }
        if (j1 == 51) {
          HashTable class130 = class3_sub28_sub15.aClass130Array3685[ai1[i1]];
          IntegerNode class3_sub18 = (IntegerNode) class130
              .get(GlobalStatics_9.anIntArray2929[--k]);
          if (class3_sub18 != null) {
            i1 += class3_sub18.anInt2467;
          }
          continue;
        }
      }
      boolean flag;
      flag = ai1[i1] == 1;
      if (j1 < 300) {
        if (j1 == 100) {
          k -= 3;
          int j6 = GlobalStatics_9.anIntArray2929[k];
          int i44 = GlobalStatics_9.anIntArray2929[1 + k];
          int k66 = GlobalStatics_9.anIntArray2929[2 + k];
          if (i44 == 0) {
            throw new RuntimeException();
          }
          Widget class11_21 = GlobalStatics_7.getWidget((byte) 121, j6);
          if (class11_21.aClass11Array262 == null) {
            class11_21.aClass11Array262 = new Widget[k66 + 1];
          }
          if (k66 >= class11_21.aClass11Array262.length) {
            Widget[] aclass11 = new Widget[k66 + 1];
            for (int k81 = 0; k81 < class11_21.aClass11Array262.length;
                k81++) {
              aclass11[k81] = class11_21.aClass11Array262[k81];
            }

            class11_21.aClass11Array262 = aclass11;
          }
          if (k66 > 0 && class11_21.aClass11Array262[-1 + k66] == null) {
            throw new RuntimeException("Gap at:" + (-1 + k66));
          }
          Widget class11_23 = new Widget();
          class11_23.aBoolean233 = true;
          class11_23.anInt191 = k66;
          class11_23.anInt190 = class11_23.anInt279 = class11_21.anInt279;
          class11_23.anInt187 = i44;
          class11_21.aClass11Array262[k66] = class11_23;
          if (flag) {
            GlobalStatics_9.aClass11_2055 = class11_23;
          } else {
            GlobalStatics_9.aClass11_1749 = class11_23;
          }
          DummyClass29.method909(110, class11_21);
          continue;
        }
        if (j1 == 101) {
          Widget class11 = flag ? GlobalStatics_9.aClass11_2055
              : GlobalStatics_9.aClass11_1749;
          if (class11.anInt191 == -1) {
            if (flag) {
              throw new RuntimeException(
                  "Tried to .cc_delete public static .active-component!");
            } else {
              throw new RuntimeException(
                  "Tried to cc_delete public static active-component!");
            }
          }
          Widget class11_17 = GlobalStatics_7
              .getWidget((byte) 111, class11.anInt279);
          class11_17.aClass11Array262[class11.anInt191] = null;
          DummyClass29.method909(-8, class11_17);
          continue;
        }
        if (j1 == 102) {
          Widget class11_1 =
              GlobalStatics_7
                  .getWidget((byte) 109, GlobalStatics_9.anIntArray2929[--k]);
          class11_1.aClass11Array262 = null;
          DummyClass29.method909(-50, class11_1);
          continue;
        }
        if (j1 == 200) {
          k -= 2;
          int k6 = GlobalStatics_9.anIntArray2929[k];
          int j44 = GlobalStatics_9.anIntArray2929[k + 1];
          Widget class11_19 = GlobalStatics_2.method638((byte) -19, k6, j44);
          if (class11_19 == null || j44 == -1) {
            GlobalStatics_9.anIntArray2929[k++] = 0;
          } else {
            GlobalStatics_9.anIntArray2929[k++] = 1;
            if (flag) {
              GlobalStatics_9.aClass11_2055 = class11_19;
            } else {
              GlobalStatics_9.aClass11_1749 = class11_19;
            }
          }
          continue;
        }
        if (j1 != 201) {
          break;
        }
        int l6 = GlobalStatics_9.anIntArray2929[--k];
        Widget class11_18 = GlobalStatics_7.getWidget((byte) 113, l6);
        if (class11_18 != null) {
          GlobalStatics_9.anIntArray2929[k++] = 1;
          if (flag) {
            GlobalStatics_9.aClass11_2055 = class11_18;
          } else {
            GlobalStatics_9.aClass11_1749 = class11_18;
          }
        } else {
          GlobalStatics_9.anIntArray2929[k++] = 0;
        }
        continue;
      }
      if (j1 >= 500) {
        if (j1 >= 1000 && j1 < 1100 || j1 >= 2000 && j1 < 2100) {
          Widget class11_2;
          if (j1 < 2000) {
            class11_2 = flag ? GlobalStatics_9.aClass11_2055
                : GlobalStatics_9.aClass11_1749;
          } else {
            class11_2 = GlobalStatics_7
                .getWidget((byte) 122, GlobalStatics_9.anIntArray2929[--k]);
            j1 -= 1000;
          }
          if (j1 == 1000) {
            k -= 4;
            class11_2.anInt316 = GlobalStatics_9.anIntArray2929[k];
            class11_2.anInt166 = GlobalStatics_9.anIntArray2929[k + 1];
            int l66 = GlobalStatics_9.anIntArray2929[3 + k];
            if (l66 < 0) {
              l66 = 0;
            } else if (l66 > 5) {
              l66 = 5;
            }
            int k44 = GlobalStatics_9.anIntArray2929[k + 2];
            if (k44 >= 0) {
              if (k44 > 5) {
                k44 = 5;
              }
            } else {
              k44 = 0;
            }
            class11_2.aByte162 = (byte) l66;
            class11_2.aByte273 = (byte) k44;
            DummyClass29.method909(109, class11_2);
            GlobalStatics_10.method225(14, class11_2);
            if (class11_2.anInt191 == -1) {
              GlobalStatics_8.method2280(2714, class11_2.anInt279);
            }
            continue;
          }
          if (j1 == 1001) {
            k -= 4;
            class11_2.anInt177 = GlobalStatics_9.anIntArray2929[k];
            class11_2.anInt244 = GlobalStatics_9.anIntArray2929[1 + k];
            class11_2.anInt184 = 0;
            class11_2.anInt312 = 0;
            int l44 = GlobalStatics_9.anIntArray2929[k + 2];
            int i67 = GlobalStatics_9.anIntArray2929[3 + k];
            if (i67 >= 0) {
              if (i67 > 4) {
                i67 = 4;
              }
            } else {
              i67 = 0;
            }
            class11_2.aByte241 = (byte) i67;
            if (l44 < 0) {
              l44 = 0;
            } else if (l44 > 4) {
              l44 = 4;
            }
            class11_2.aByte304 = (byte) l44;
            DummyClass29.method909(122, class11_2);
            GlobalStatics_10.method225(14, class11_2);
            if (class11_2.anInt187 == 0) {
              GlobalStatics_7.method2104(class11_2, false, 32);
            }
            continue;
          }
          if (j1 == 1003) {
            boolean flag3 = GlobalStatics_9.anIntArray2929[--k] == 1;
            if (flag3 == !class11_2.aBoolean155) {
              class11_2.aBoolean155 = flag3;
              DummyClass29.method909(-103, class11_2);
            }
            if (class11_2.anInt191 == -1) {
              GlobalStatics_9.method569(-82, class11_2.anInt279);
            }
            continue;
          }
          if (j1 == 1004) {
            k -= 2;
            class11_2.anInt216 = GlobalStatics_9.anIntArray2929[k];
            class11_2.anInt160 = GlobalStatics_9.anIntArray2929[k + 1];
            DummyClass29.method909(-99, class11_2);
            GlobalStatics_10.method225(14, class11_2);
            if (class11_2.anInt187 == 0) {
              GlobalStatics_7.method2104(class11_2, false, -127);
            }
            continue;
          }
          if (j1 != 1005) {
            break;
          }
          class11_2.aBoolean219 = GlobalStatics_9.anIntArray2929[--k] == 1;
          continue;
        }
        if ((j1 < 1100 || j1 >= 1200) && (j1 < 2100 || j1 >= 2200)) {
          if ((j1 < 1200 || j1 >= 1300) && (j1 < 2200 || j1 >= 2300)) {
            if (j1 >= 1300 && j1 < 1400 || j1 >= 2300 && j1 < 2400) {
              Widget class11_3;
              if (j1 >= 2000) {
                class11_3 = GlobalStatics_7
                    .getWidget((byte) 119, GlobalStatics_9.anIntArray2929[--k]);
                j1 -= 1000;
              } else {
                class11_3 = flag ? GlobalStatics_9.aClass11_2055
                    : GlobalStatics_9.aClass11_1749;
              }
              if (j1 == 1300) {
                int i45 = GlobalStatics_9.anIntArray2929[--k] - 1;
                if (i45 < 0 || i45 > 9) {
                  l--;
                } else {
                  class11_3.method857((byte) 112,
                      GlobalStatics_0.aClass94Array75[--l], i45);
                }
                continue;
              }
              if (j1 == 1301) {
                k -= 2;
                int j67 = GlobalStatics_9.anIntArray2929[1 + k];
                int j45 = GlobalStatics_9.anIntArray2929[k];
                class11_3.aClass11_302 = GlobalStatics_2
                    .method638((byte) -19, j45, j67);
                continue;
              }
              if (j1 == 1302) {
                class11_3.aBoolean200 = GlobalStatics_9.anIntArray2929[--k]
                    == 1;
                continue;
              }
              if (j1 == 1303) {
                class11_3.anInt214 = GlobalStatics_9.anIntArray2929[--k];
                continue;
              }
              if (j1 == 1304) {
                class11_3.anInt179 = GlobalStatics_9.anIntArray2929[--k];
                continue;
              }
              if (j1 == 1305) {
                class11_3.aClass94_277 = GlobalStatics_0.aClass94Array75[--l];
                continue;
              }
              if (j1 == 1306) {
                class11_3.aClass94_245 = GlobalStatics_0.aClass94Array75[--l];
                continue;
              }
              if (j1 == 1307) {
                class11_3.aClass94Array171 = null;
                continue;
              }
              if (j1 == 1308) {
                class11_3.anInt238 = GlobalStatics_9.anIntArray2929[--k];
                class11_3.anInt266 = GlobalStatics_9.anIntArray2929[--k];
                continue;
              }
              if (j1 != 1309) {
                break;
              }
              int k45 = GlobalStatics_9.anIntArray2929[--k];
              int k67 = GlobalStatics_9.anIntArray2929[--k];
              if (k67 >= 1 && k67 <= 10) {
                class11_3.method854(k67 - 1, k45, (byte) 43);
              }
              continue;
            }
            if ((j1 < 1400 || j1 >= 1500) && (j1 < 2400 || j1 >= 2500)) {
              if (j1 < 1600) {
                Widget class11_4 =
                    flag ? GlobalStatics_9.aClass11_2055
                        : GlobalStatics_9.aClass11_1749;
                if (j1 == 1500) {
                  GlobalStatics_9.anIntArray2929[k++] = class11_4.anInt306;
                  continue;
                }
                if (j1 == 1501) {
                  GlobalStatics_9.anIntArray2929[k++] = class11_4.anInt210;
                  continue;
                }
                if (j1 == 1502) {
                  GlobalStatics_9.anIntArray2929[k++] = class11_4.anInt168;
                  continue;
                }
                if (j1 == 1503) {
                  GlobalStatics_9.anIntArray2929[k++] = class11_4.anInt193;
                  continue;
                }
                if (j1 == 1504) {
                  GlobalStatics_9.anIntArray2929[k++] =
                      class11_4.aBoolean155 ? 1 : 0;
                  continue;
                }
                if (j1 != 1505) {
                  break;
                }
                GlobalStatics_9.anIntArray2929[k++] = class11_4.anInt190;
                continue;
              }
              if (j1 < 1700) {
                Widget class11_5 =
                    flag ? GlobalStatics_9.aClass11_2055
                        : GlobalStatics_9.aClass11_1749;
                if (j1 == 1600) {
                  GlobalStatics_9.anIntArray2929[k++] = class11_5.anInt247;
                  continue;
                }
                if (j1 == 1601) {
                  GlobalStatics_9.anIntArray2929[k++] = class11_5.anInt208;
                  continue;
                }
                if (j1 == 1602) {
                  GlobalStatics_0.aClass94Array75[l++] = class11_5.aClass94_232;
                  continue;
                }
                if (j1 == 1603) {
                  GlobalStatics_9.anIntArray2929[k++] = class11_5.anInt240;
                  continue;
                }
                if (j1 == 1604) {
                  GlobalStatics_9.anIntArray2929[k++] = class11_5.anInt252;
                  continue;
                }
                if (j1 == 1605) {
                  GlobalStatics_9.anIntArray2929[k++] = class11_5.anInt164;
                  continue;
                }
                if (j1 == 1606) {
                  GlobalStatics_9.anIntArray2929[k++] = class11_5.rotationX0;
                  continue;
                }
                if (j1 == 1607) {
                  GlobalStatics_9.anIntArray2929[k++] = class11_5.rotationZ;
                  continue;
                }
                if (j1 == 1608) {
                  GlobalStatics_9.anIntArray2929[k++] = class11_5.rotationY;
                  continue;
                }
                if (j1 == 1609) {
                  GlobalStatics_9.anIntArray2929[k++] = class11_5.anInt223;
                  continue;
                }
                if (j1 == 1610) {
                  GlobalStatics_9.anIntArray2929[k++] = class11_5.anInt258;
                  continue;
                }
                if (j1 == 1611) {
                  GlobalStatics_9.anIntArray2929[k++] = class11_5.anInt264;
                  continue;
                }
                if (j1 != 1612) {
                  break;
                }
                GlobalStatics_9.anIntArray2929[k++] = class11_5.anInt224;
                continue;
              }
              if (j1 >= 1800) {
                if (j1 < 1900) {
                  Widget class11_6 =
                      flag ? GlobalStatics_9.aClass11_2055
                          : GlobalStatics_9.aClass11_1749;
                  if (j1 == 1800) {
                    GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_8
                        .method44(class11_6).method101(-95);
                    continue;
                  }
                  if (j1 == 1801) {
                    int l45 = GlobalStatics_9.anIntArray2929[--k];
                    l45--;
                    if (class11_6.aClass94Array171 == null
                        || l45 >= class11_6.aClass94Array171.length
                        || class11_6.aClass94Array171[l45] == null) {
                      GlobalStatics_0.aClass94Array75[l++] = GlobalStatics_6.aClass94_2331;
                    } else {
                      GlobalStatics_0.aClass94Array75[l++] = class11_6.aClass94Array171[l45];
                    }
                    continue;
                  }
                  if (j1 != 1802) {
                    break;
                  }
                  if (class11_6.aClass94_277 != null) {
                    GlobalStatics_0.aClass94Array75[l++] = class11_6.aClass94_277;
                  } else {
                    GlobalStatics_0.aClass94Array75[l++] = GlobalStatics_6.aClass94_2331;
                  }
                  continue;
                }
                if (j1 < 2600) {
                  Widget class11_7 =
                      GlobalStatics_7.getWidget((byte) 114,
                          GlobalStatics_9.anIntArray2929[--k]);
                  if (j1 == 2500) {
                    GlobalStatics_9.anIntArray2929[k++] = class11_7.anInt306;
                    continue;
                  }
                  if (j1 == 2501) {
                    GlobalStatics_9.anIntArray2929[k++] = class11_7.anInt210;
                    continue;
                  }
                  if (j1 == 2502) {
                    GlobalStatics_9.anIntArray2929[k++] = class11_7.anInt168;
                    continue;
                  }
                  if (j1 == 2503) {
                    GlobalStatics_9.anIntArray2929[k++] = class11_7.anInt193;
                    continue;
                  }
                  if (j1 == 2504) {
                    GlobalStatics_9.anIntArray2929[k++] =
                        class11_7.aBoolean155 ? 1 : 0;
                    continue;
                  }
                  if (j1 != 2505) {
                    break;
                  }
                  GlobalStatics_9.anIntArray2929[k++] = class11_7.anInt190;
                  continue;
                }
                if (j1 >= 2700) {
                  if (j1 >= 2800) {
                    if (j1 >= 2900) {
                      if (j1 < 3200) {
                        if (j1 == 3100) {
                          GameString class94_3 = GlobalStatics_0.aClass94Array75[--l];
                          GlobalStatics_8
                              .printMessage(GlobalStatics_6.aClass94_2331, 0,
                                  class94_3, -1);
                          continue;
                        }
                        if (j1 == 3101) {
                          k -= 2;
                          GlobalStatics_9.method628(0,
                              GlobalStatics_9.anIntArray2929[k + 1],
                              GlobalStatics_9.anIntArray2929[k],
                              GlobalStatics_9.localPlayer);
                          continue;
                        }
                        if (j1 == 3103) {
                          GlobalStatics_9.method264((byte) 87);
                          continue;
                        }
                        if (j1 == 3104) {
                          GlobalStatics_8.anInt1405++;
                          GameString class94_4 = GlobalStatics_0.aClass94Array75[--l];
                          int i46 = 0;
                          if (class94_4.method1543(82)) {
                            i46 = class94_4.toInteger();
                          }
                          GlobalStatics_9.secureBuffer.writePacket(23);
                          GlobalStatics_9.secureBuffer.writeInt(i46);
                          continue;
                        }
                        if (j1 == 3105) {
                          GlobalStatics_6.anInt2500++;
                          GameString class94_5 = GlobalStatics_0.aClass94Array75[--l];
                          GlobalStatics_9.secureBuffer.writePacket(244);
                          GlobalStatics_9.secureBuffer
                              .writeLong(class94_5.toBase37());
                          continue;
                        }
                        if (j1 == 3106) {
                          GlobalStatics_7.anInt2165++;
                          GameString class94_6 = GlobalStatics_0.aClass94Array75[--l];
                          GlobalStatics_9.secureBuffer.writePacket(65);
                          GlobalStatics_9.secureBuffer
                              .writeByte(1 + class94_6.getLength());
                          GlobalStatics_9.secureBuffer.writeString(class94_6);
                          continue;
                        }
                        if (j1 == 3107) {
                          int i7 = GlobalStatics_9.anIntArray2929[--k];
                          GameString class94_44 = GlobalStatics_0.aClass94Array75[--l];
                          GlobalStatics_9.method2258(i7, 0, class94_44);
                          continue;
                        }
                        if (j1 == 3108) {
                          k -= 3;
                          int j46 = GlobalStatics_9.anIntArray2929[k + 1];
                          int j7 = GlobalStatics_9.anIntArray2929[k];
                          int l67 = GlobalStatics_9.anIntArray2929[2 + k];
                          Widget class11_22 = GlobalStatics_7
                              .getWidget((byte) 114, l67);
                          GlobalStatics_10
                              .createIndexedColorSprite(j46, j7, 115,
                                  class11_22);
                          continue;
                        }
                        if (j1 == 3109) {
                          k -= 2;
                          int k7 = GlobalStatics_9.anIntArray2929[k];
                          Widget class11_20 =
                              flag ? GlobalStatics_9.aClass11_2055
                                  : GlobalStatics_9.aClass11_1749;
                          int k46 = GlobalStatics_9.anIntArray2929[1 + k];
                          GlobalStatics_10.createIndexedColorSprite(k46, k7, 79,
                              class11_20);
                          continue;
                        }
                        if (j1 != 3110) {
                          break;
                        }
                        GlobalStatics_10.anInt3199++;
                        int l7 = GlobalStatics_9.anIntArray2929[--k];
                        GlobalStatics_9.secureBuffer.writePacket(111);
                        GlobalStatics_9.secureBuffer.writeShort(l7);
                        continue;
                      }
                      if (j1 < 3300) {
                        if (j1 == 3200) {
                          k -= 3;
                          GlobalStatics_10
                              .method199(GlobalStatics_9.anIntArray2929[k + 1],
                                  GlobalStatics_9.anIntArray2929[k],
                                  GlobalStatics_9.anIntArray2929[k + 2], -799);
                          continue;
                        }
                        if (j1 == 3201) {
                          GlobalStatics_0
                              .method1427(true,
                                  GlobalStatics_9.anIntArray2929[--k]);
                          continue;
                        }
                        if (j1 != 3202) {
                          break;
                        }
                        k -= 2;
                        DummyClass10
                            .method2266(GlobalStatics_9.anIntArray2929[1 + k],
                                GlobalStatics_9.anIntArray2929[k], (byte) -1);
                        continue;
                      }
                      if (j1 < 3400) {
                        if (j1 == 3300) {
                          GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_4.updateCycle;
                          continue;
                        }
                        if (j1 == 3301) {
                          k -= 2;
                          int i8 = GlobalStatics_9.anIntArray2929[k];
                          int l46 = GlobalStatics_9.anIntArray2929[1 + k];
                          GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_10
                              .method861(i8, 89, l46);
                          continue;
                        }
                        if (j1 == 3302) {
                          k -= 2;
                          int i47 = GlobalStatics_9.anIntArray2929[k + 1];
                          int j8 = GlobalStatics_9.anIntArray2929[k];
                          GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_9
                              .method872(-1, j8, i47);
                          continue;
                        }
                        if (j1 == 3303) {
                          k -= 2;
                          int j47 = GlobalStatics_9.anIntArray2929[k + 1];
                          int k8 = GlobalStatics_9.anIntArray2929[k];
                          GlobalStatics_9.anIntArray2929[k++] =
                              DummyClass10.method2268((byte) -107, k8, j47);
                          continue;
                        }
                        if (j1 == 3304) {
                          int l8 = GlobalStatics_9.anIntArray2929[--k];
                          GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_6
                              .method2069(l8, -127).size;
                          continue;
                        }
                        if (j1 == 3305) {
                          int i9 = GlobalStatics_9.anIntArray2929[--k];
                          GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_1.anIntArray3185[i9];
                          continue;
                        }
                        if (j1 == 3306) {
                          int j9 = GlobalStatics_9.anIntArray2929[--k];
                          GlobalStatics_9.anIntArray2929[k++] =
                              GlobalStatics_10.anIntArray2480[j9];
                          continue;
                        }
                        if (j1 == 3307) {
                          int k9 = GlobalStatics_9.anIntArray2929[--k];
                          GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_9.anIntArray1743[k9];
                          continue;
                        }
                        if (j1 == 3308) {
                          int l9 = GlobalStatics_9.currentPlane;
                          int k47 =
                              GlobalStatics_10.anInt1716 + (
                                  GlobalStatics_9.localPlayer.anInt2819 >> 7);
                          int i68 = (GlobalStatics_9.localPlayer.anInt2829 >> 7)
                              + GlobalStatics_9.anInt1152;
                          GlobalStatics_9.anIntArray2929[k++] =
                              (l9 << 28) - (-(k47 << 14) - i68);
                          continue;
                        }
                        if (j1 == 3309) {
                          int i10 = GlobalStatics_9.anIntArray2929[--k];
                          GlobalStatics_9.anIntArray2929[k++] =
                              16383 & i10 >> 14;
                          continue;
                        }
                        if (j1 == 3310) {
                          int j10 = GlobalStatics_9.anIntArray2929[--k];
                          GlobalStatics_9.anIntArray2929[k++] = j10 >> 28;
                          continue;
                        }
                        if (j1 == 3311) {
                          int k10 = GlobalStatics_9.anIntArray2929[--k];
                          GlobalStatics_9.anIntArray2929[k++] = k10 & 16383;
                          continue;
                        }
                        if (j1 == 3312) {
                          GlobalStatics_9.anIntArray2929[k++] =
                              GlobalStatics_9.aBoolean66 ? 1 : 0;
                          continue;
                        }
                        if (j1 == 3313) {
                          k -= 2;
                          int l10 = 32768 + GlobalStatics_9.anIntArray2929[k];
                          int l47 = GlobalStatics_9.anIntArray2929[k + 1];
                          GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_10
                              .method861(l10, 118, l47);
                          continue;
                        }
                        if (j1 == 3314) {
                          k -= 2;
                          int i11 = GlobalStatics_9.anIntArray2929[k] + 32768;
                          int i48 = GlobalStatics_9.anIntArray2929[1 + k];
                          GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_9
                              .method872(-1, i11, i48);
                          continue;
                        }
                        if (j1 == 3315) {
                          k -= 2;
                          int j11 = 32768 + GlobalStatics_9.anIntArray2929[k];
                          int j48 = GlobalStatics_9.anIntArray2929[1 + k];
                          GlobalStatics_9.anIntArray2929[k++] =
                              DummyClass10.method2268((byte) -52, j11, j48);
                          continue;
                        }
                        if (j1 == 3316) {
                          if (GlobalStatics_10.rights < 2) {
                            GlobalStatics_9.anIntArray2929[k++] = 0;
                          } else {
                            GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_10.rights;
                          }
                          continue;
                        }
                        if (j1 == 3317) {
                          GlobalStatics_9.anIntArray2929[k++] = DummyClass36.updateTime;
                          continue;
                        }
                        if (j1 == 3318) {
                          GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_7.anInt2451;
                          continue;
                        }
                        if (j1 == 3321) {
                          GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_10.anInt136;
                          continue;
                        }
                        if (j1 == 3322) {
                          GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_9.anInt1925;
                          continue;
                        }
                        if (j1 == 3323) {
                          if (GlobalStatics_9.anInt3775 >= 5 &&
                              GlobalStatics_9.anInt3775 <= 9) {
                            GlobalStatics_9.anIntArray2929[k++] = 1;
                          } else {
                            GlobalStatics_9.anIntArray2929[k++] = 0;
                          }
                          continue;
                        }
                        if (j1 == 3324) {
                          if (GlobalStatics_9.anInt3775 < 5
                              || GlobalStatics_9.anInt3775 > 9) {
                            GlobalStatics_9.anIntArray2929[k++] = 0;
                          } else {
                            GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_9.anInt3775;
                          }
                          continue;
                        }
                        if (j1 == 3325) {
                          GlobalStatics_9.anIntArray2929[k++] =
                              GlobalStatics_9.aBoolean3358 ? 1 : 0;
                          continue;
                        }
                        if (j1 == 3326) {
                          GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_9.localPlayer.combatLevel;
                          continue;
                        }
                        if (j1 == 3327) {
                          GlobalStatics_9.anIntArray2929[k++] =
                              GlobalStatics_9.localPlayer.appearance.aBoolean864
                                  ? 1 : 0;
                          continue;
                        }
                        if (j1 == 3328) {
                          GlobalStatics_9.anIntArray2929[k++] =
                              !GlobalStatics_9.aBoolean2433
                                  || GlobalStatics_6.aBoolean1641 ? 0 : 1;
                          continue;
                        }
                        if (j1 == 3329) {
                          GlobalStatics_9.anIntArray2929[k++] =
                              GlobalStatics_10.aBoolean3166 ? 1 : 0;
                          continue;
                        }
                        if (j1 == 3330) {
                          int k11 = GlobalStatics_9.anIntArray2929[--k];
                          GlobalStatics_9.anIntArray2929[k++] =
                              GlobalStatics_9
                                  .getInventoryFreeSpace(k11, (byte) -80);
                          continue;
                        }
                        if (j1 == 3331) {
                          k -= 2;
                          int k48 = GlobalStatics_9.anIntArray2929[1 + k];
                          int l11 = GlobalStatics_9.anIntArray2929[k];
                          GlobalStatics_9.anIntArray2929[k++] =
                              GlobalStatics_7
                                  .method1643(10131, false, l11, k48);
                          continue;
                        }
                        if (j1 == 3332) {
                          k -= 2;
                          int i12 = GlobalStatics_9.anIntArray2929[k];
                          int l48 = GlobalStatics_9.anIntArray2929[k + 1];
                          GlobalStatics_9.anIntArray2929[k++] =
                              GlobalStatics_7.method1643(10131, true, i12, l48);
                          continue;
                        }
                        if (j1 == 3333) {
                          GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_7.anInt2161;
                          continue;
                        }
                        if (j1 == 3335) {
                          GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_10.languageId;
                          continue;
                        }
                        if (j1 == 3336) {
                          k -= 4;
                          int i49 = GlobalStatics_9.anIntArray2929[k + 1];
                          int j12 = GlobalStatics_9.anIntArray2929[k];
                          j12 += i49 << 14;
                          int k76 = GlobalStatics_9.anIntArray2929[3 + k];
                          int j68 = GlobalStatics_9.anIntArray2929[2 + k];
                          j12 += j68 << 28;
                          j12 += k76;
                          GlobalStatics_9.anIntArray2929[k++] = j12;
                          continue;
                        }
                        if (j1 != 3337) {
                          break;
                        }
                        GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_9.affiliateId;
                        continue;
                      }
                      if (j1 < 3500) {
                        if (j1 == 3400) {
                          k -= 2;
                          int k12 = GlobalStatics_9.anIntArray2929[k];
                          int j49 = GlobalStatics_9.anIntArray2929[1 + k];
                          ClientScriptEnum class3_sub28_sub13_1 =
                              GlobalStatics_10.getEnum(k12, true);
                          GlobalStatics_0.aClass94Array75[l++] =
                              class3_sub28_sub13_1.getString(j49, (byte) 121);
                          continue;
                        }
                        if (j1 == 3408) {
                          k -= 4;
                          int l12 = GlobalStatics_9.anIntArray2929[k];
                          int k49 = GlobalStatics_9.anIntArray2929[1 + k];
                          int l76 = GlobalStatics_9.anIntArray2929[3 + k];
                          int k68 = GlobalStatics_9.anIntArray2929[k + 2];
                          ClientScriptEnum class3_sub28_sub13_4 =
                              GlobalStatics_10.getEnum(k68, true);
                          if (class3_sub28_sub13_4.someType != l12
                              || class3_sub28_sub13_4.paramType != k49) {
                            throw new RuntimeException("C3408-1");
                          }
                          if (k49 == 115) {
                            GlobalStatics_0.aClass94Array75[l++] =
                                class3_sub28_sub13_4.getString(l76, (byte) -25);
                          } else {
                            GlobalStatics_9.anIntArray2929[k++] =
                                class3_sub28_sub13_4.getInteger(0, l76);
                          }
                          continue;
                        }
                        if (j1 == 3409) {
                          k -= 3;
                          int l49 = GlobalStatics_9.anIntArray2929[k + 1];
                          int l68 = GlobalStatics_9.anIntArray2929[k + 2];
                          int i13 = GlobalStatics_9.anIntArray2929[k];
                          if (l49 == -1) {
                            throw new RuntimeException("C3409-2");
                          }
                          ClientScriptEnum class3_sub28_sub13_3 =
                              GlobalStatics_10.getEnum(l49, true);
                          if (class3_sub28_sub13_3.paramType != i13) {
                            throw new RuntimeException("C3409-1");
                          }
                          GlobalStatics_9.anIntArray2929[k++] =
                              class3_sub28_sub13_3.method621(-8143, l68) ? 1
                                  : 0;
                          continue;
                        }
                        if (j1 == 3410) {
                          int j13 = GlobalStatics_9.anIntArray2929[--k];
                          GameString class94_45 = GlobalStatics_0.aClass94Array75[--l];
                          if (j13 == -1) {
                            throw new RuntimeException("C3410-2");
                          }
                          ClientScriptEnum class3_sub28_sub13_2 =
                              GlobalStatics_10.getEnum(j13, true);
                          if (class3_sub28_sub13_2.paramType != 115) {
                            throw new RuntimeException("C3410-1");
                          }
                          GlobalStatics_9.anIntArray2929[k++] =
                              class3_sub28_sub13_2.hasValue(class94_45, 8729)
                                  ? 1 : 0;
                          continue;
                        }
                        if (j1 != 3411) {
                          break;
                        }
                        int k13 = GlobalStatics_9.anIntArray2929[--k];
                        ClientScriptEnum class3_sub28_sub13 = GlobalStatics_10
                            .getEnum(k13, true);
                        GlobalStatics_9.anIntArray2929[k++] = class3_sub28_sub13.table
                            .getSize();
                        continue;
                      }
                      if (j1 < 3700) {
                        if (j1 == 3600) {
                          if (GlobalStatics_9.anInt1357 == 0) {
                            GlobalStatics_9.anIntArray2929[k++] = -2;
                          } else if (GlobalStatics_9.anInt1357 != 1) {
                            GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_10.anInt104;
                          } else {
                            GlobalStatics_9.anIntArray2929[k++] = -1;
                          }
                          continue;
                        }
                        if (j1 == 3601) {
                          int l13 = GlobalStatics_9.anIntArray2929[--k];
                          if (GlobalStatics_9.anInt1357 != 2 || l13
                              >= GlobalStatics_10.anInt104) {
                            GlobalStatics_0.aClass94Array75[l++] = GlobalStatics_6.aClass94_2331;
                          } else {
                            GlobalStatics_0.aClass94Array75[l++] = GlobalStatics_9.aClass94Array1046[l13];
                          }
                          continue;
                        }
                        if (j1 == 3602) {
                          int i14 = GlobalStatics_9.anIntArray2929[--k];
                          if (GlobalStatics_9.anInt1357 != 2
                              || GlobalStatics_10.anInt104 <= i14) {
                            GlobalStatics_9.anIntArray2929[k++] = 0;
                          } else {
                            GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_7.anIntArray882[i14];
                          }
                          continue;
                        }
                        if (j1 == 3603) {
                          int j14 = GlobalStatics_9.anIntArray2929[--k];
                          if (GlobalStatics_9.anInt1357 == 2
                              && GlobalStatics_10.anInt104 > j14) {
                            GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_9.anIntArray904[j14];
                          } else {
                            GlobalStatics_9.anIntArray2929[k++] = 0;
                          }
                          continue;
                        }
                        if (j1 == 3604) {
                          int i50 = GlobalStatics_9.anIntArray2929[--k];
                          GameString class94_7 = GlobalStatics_0.aClass94Array75[--l];
                          GlobalStatics_8.method1605(255, class94_7, i50);
                          continue;
                        }
                        if (j1 == 3605) {
                          GameString class94_8 = GlobalStatics_0.aClass94Array75[--l];
                          DummyClass4
                              .method2229(class94_8.toBase37(), (byte) -91);
                          continue;
                        }
                        if (j1 == 3606) {
                          GameString class94_9 = GlobalStatics_0.aClass94Array75[--l];
                          GlobalStatics_9.method297(class94_9.toBase37(), 1);
                          continue;
                        }
                        if (j1 == 3607) {
                          GameString class94_10 = GlobalStatics_0.aClass94Array75[--l];
                          DummyClass50.method1399(32, class94_10.toBase37());
                          continue;
                        }
                        if (j1 == 3608) {
                          GameString class94_11 = GlobalStatics_0.aClass94Array75[--l];
                          GlobalStatics_10.method212(class94_11.toBase37(), 0);
                          continue;
                        }
                        if (j1 == 3609) {
                          GameString class94_12 = GlobalStatics_0.aClass94Array75[--l];
                          if (class94_12
                              .method1558(GlobalStatics_6.aClass94_2323, 0)
                              || class94_12
                              .method1558(GlobalStatics_10.aClass94_3190, 0)) {
                            class94_12 = class94_12.substring(7);
                          }
                          GlobalStatics_9.anIntArray2929[k++] =
                              GlobalStatics_9.method1176(class94_12, (byte) -82)
                                  ? 1 : 0;
                          continue;
                        }
                        if (j1 == 3610) {
                          int k14 = GlobalStatics_9.anIntArray2929[--k];
                          if (GlobalStatics_9.anInt1357 == 2
                              && GlobalStatics_10.anInt104 > k14) {
                            GlobalStatics_0.aClass94Array75[l++] = GlobalStatics_2.aClass94Array2566[k14];
                          } else {
                            GlobalStatics_0.aClass94Array75[l++] = GlobalStatics_6.aClass94_2331;
                          }
                          continue;
                        }
                        if (j1 == 3611) {
                          if (GlobalStatics_10.aClass94_251 != null) {
                            GlobalStatics_0.aClass94Array75[l++] = GlobalStatics_10.aClass94_251
                                .formatName((byte) -50);
                          } else {
                            GlobalStatics_0.aClass94Array75[l++] = GlobalStatics_6.aClass94_2331;
                          }
                          continue;
                        }
                        if (j1 == 3612) {
                          if (GlobalStatics_10.aClass94_251 != null) {
                            GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_2.anInt2572;
                          } else {
                            GlobalStatics_9.anIntArray2929[k++] = 0;
                          }
                          continue;
                        }
                        if (j1 == 3613) {
                          int l14 = GlobalStatics_9.anIntArray2929[--k];
                          if (GlobalStatics_10.aClass94_251 == null ||
                              GlobalStatics_2.anInt2572 <= l14) {
                            GlobalStatics_0.aClass94Array75[l++] = GlobalStatics_6.aClass94_2331;
                          } else {
                            GlobalStatics_0.aClass94Array75[l++] =
                                GlobalStatics_6.aClass3_Sub19Array3694[l14].name
                                    .formatName((byte) -50);
                          }
                          continue;
                        }
                        if (j1 == 3614) {
                          int i15 = GlobalStatics_9.anIntArray2929[--k];
                          if (GlobalStatics_10.aClass94_251 == null
                              || i15 >= GlobalStatics_2.anInt2572) {
                            GlobalStatics_9.anIntArray2929[k++] = 0;
                          } else {
                            GlobalStatics_9.anIntArray2929[k++] =
                                GlobalStatics_6.aClass3_Sub19Array3694[i15].anInt2478;
                          }
                          continue;
                        }
                        if (j1 == 3615) {
                          int j15 = GlobalStatics_9.anIntArray2929[--k];
                          if (GlobalStatics_10.aClass94_251 == null
                              || GlobalStatics_2.anInt2572 <= j15) {
                            GlobalStatics_9.anIntArray2929[k++] = 0;
                          } else {
                            GlobalStatics_9.anIntArray2929[k++] =
                                GlobalStatics_6.aClass3_Sub19Array3694[j15].aByte2472;
                          }
                          continue;
                        }
                        if (j1 == 3616) {
                          GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_9.aByte3953;
                          continue;
                        }
                        if (j1 == 3617) {
                          GameString class94_13 = GlobalStatics_0.aClass94Array75[--l];
                          GlobalStatics_7.method1642(3803, class94_13);
                          continue;
                        }
                        if (j1 == 3618) {
                          GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_7.aByte1308;
                          continue;
                        }
                        if (j1 == 3619) {
                          GameString class94_14 = GlobalStatics_0.aClass94Array75[--l];
                          GlobalStatics_6.method400(class94_14.toBase37(), 0);
                          continue;
                        }
                        if (j1 == 3620) {
                          DummyClass49.method1368(-90);
                          continue;
                        }
                        if (j1 == 3621) {
                          if (GlobalStatics_9.anInt1357 == 0) {
                            GlobalStatics_9.anIntArray2929[k++] = -1;
                          } else {
                            GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_6.anInt3591;
                          }
                          continue;
                        }
                        if (j1 == 3622) {
                          int k15 = GlobalStatics_9.anIntArray2929[--k];
                          if (GlobalStatics_9.anInt1357 == 0
                              || GlobalStatics_6.anInt3591 <= k15) {
                            GlobalStatics_0.aClass94Array75[l++] = GlobalStatics_6.aClass94_2331;
                          } else {
                            GlobalStatics_0.aClass94Array75[l++] = GameStringStatics
                                .stringFromBase37(-29664,
                                    GlobalStatics_9.aLongArray1574[k15])
                                .formatName((byte) -50);
                          }
                          continue;
                        }
                        if (j1 == 3623) {
                          GameString class94_15 = GlobalStatics_0.aClass94Array75[--l];
                          if (class94_15
                              .method1558(GlobalStatics_6.aClass94_2323, 0)
                              || class94_15
                              .method1558(GlobalStatics_10.aClass94_3190, 0)) {
                            class94_15 = class94_15.substring(7);
                          }
                          GlobalStatics_9.anIntArray2929[k++] =
                              GlobalStatics_6.method467(class94_15, 0) ? 1 : 0;
                          continue;
                        }
                        if (j1 == 3624) {
                          int l15 = GlobalStatics_9.anIntArray2929[--k];
                          if (GlobalStatics_6.aClass3_Sub19Array3694 != null
                              && GlobalStatics_2.anInt2572 > l15
                              && GlobalStatics_6.aClass3_Sub19Array3694[l15].name
                              .method1531(
                                  GlobalStatics_9.localPlayer.name)) {
                            GlobalStatics_9.anIntArray2929[k++] = 1;
                          } else {
                            GlobalStatics_9.anIntArray2929[k++] = 0;
                          }
                          continue;
                        }
                        if (j1 == 3625) {
                          if (DummyClass12.aClass94_2035 == null) {
                            GlobalStatics_0.aClass94Array75[l++] = GlobalStatics_6.aClass94_2331;
                          } else {
                            GlobalStatics_0.aClass94Array75[l++] =
                                DummyClass12.aClass94_2035
                                    .formatName((byte) -50);
                          }
                          continue;
                        }
                        if (j1 == 3626) {
                          int i16 = GlobalStatics_9.anIntArray2929[--k];
                          if (GlobalStatics_10.aClass94_251 == null ||
                              GlobalStatics_2.anInt2572 <= i16) {
                            GlobalStatics_0.aClass94Array75[l++] = GlobalStatics_6.aClass94_2331;
                          } else {
                            GlobalStatics_0.aClass94Array75[l++] =
                                GlobalStatics_6.aClass3_Sub19Array3694[i16].aClass94_2473;
                          }
                          continue;
                        }
                        if (j1 == 3627) {
                          int j16 = GlobalStatics_9.anIntArray2929[--k];
                          if (GlobalStatics_9.anInt1357 != 2 || j16 < 0
                              || j16 >= GlobalStatics_10.anInt104) {
                            GlobalStatics_9.anIntArray2929[k++] = 0;
                          } else {
                            GlobalStatics_9.anIntArray2929[k++] =
                                GlobalStatics_0.aBooleanArray73[j16] ? 1 : 0;
                          }
                          continue;
                        }
                        if (j1 == 3628) {
                          GameString class94_16 = GlobalStatics_0.aClass94Array75[--l];
                          if (class94_16
                              .method1558(GlobalStatics_6.aClass94_2323, 0)
                              || class94_16
                              .method1558(GlobalStatics_10.aClass94_3190, 0)) {
                            class94_16 = class94_16.substring(7);
                          }
                          GlobalStatics_9.anIntArray2929[k++] = DummyClass18
                              .method826(class94_16, -1);
                          continue;
                        }
                        if (j1 != 3629) {
                          break;
                        }
                        GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_9.anInt2607;
                        continue;
                      }
                      if (j1 < 4000) {
                        if (j1 == 3903) {
                          int k16 = GlobalStatics_9.anIntArray2929[--k];
                          GlobalStatics_9.anIntArray2929[k++] =
                              GlobalStatics_10.aClass133Array3393[k16]
                                  .method1805((byte) -33);
                          continue;
                        }
                        if (j1 == 3904) {
                          int l16 = GlobalStatics_9.anIntArray2929[--k];
                          GlobalStatics_9.anIntArray2929[k++] =
                              GlobalStatics_10.aClass133Array3393[l16].anInt1752;
                          continue;
                        }
                        if (j1 == 3905) {
                          int i17 = GlobalStatics_9.anIntArray2929[--k];
                          GlobalStatics_9.anIntArray2929[k++] =
                              GlobalStatics_10.aClass133Array3393[i17].anInt1757;
                          continue;
                        }
                        if (j1 == 3906) {
                          int j17 = GlobalStatics_9.anIntArray2929[--k];
                          GlobalStatics_9.anIntArray2929[k++] =
                              GlobalStatics_10.aClass133Array3393[j17].anInt1747;
                          continue;
                        }
                        if (j1 == 3907) {
                          int k17 = GlobalStatics_9.anIntArray2929[--k];
                          GlobalStatics_9.anIntArray2929[k++] =
                              GlobalStatics_10.aClass133Array3393[k17].anInt1746;
                          continue;
                        }
                        if (j1 == 3908) {
                          int l17 = GlobalStatics_9.anIntArray2929[--k];
                          GlobalStatics_9.anIntArray2929[k++] =
                              GlobalStatics_10.aClass133Array3393[l17].anInt1750;
                          continue;
                        }
                        if (j1 == 3910) {
                          int i18 = GlobalStatics_9.anIntArray2929[--k];
                          int j50 = GlobalStatics_10.aClass133Array3393[i18]
                              .method1804(false);
                          GlobalStatics_9.anIntArray2929[k++] =
                              j50 == 0 ? 1 : 0;
                          continue;
                        }
                        if (j1 == 3911) {
                          int j18 = GlobalStatics_9.anIntArray2929[--k];
                          int k50 = GlobalStatics_10.aClass133Array3393[j18]
                              .method1804(false);
                          GlobalStatics_9.anIntArray2929[k++] =
                              k50 == 2 ? 1 : 0;
                          continue;
                        }
                        if (j1 == 3912) {
                          int k18 = GlobalStatics_9.anIntArray2929[--k];
                          int l50 = GlobalStatics_10.aClass133Array3393[k18]
                              .method1804(false);
                          GlobalStatics_9.anIntArray2929[k++] =
                              l50 == 5 ? 1 : 0;
                          continue;
                        }
                        if (j1 != 3913) {
                          break;
                        }
                        int l18 = GlobalStatics_9.anIntArray2929[--k];
                        int i51 = GlobalStatics_10.aClass133Array3393[l18]
                            .method1804(false);
                        GlobalStatics_9.anIntArray2929[k++] = i51 == 1 ? 1 : 0;
                        continue;
                      }
                      if (j1 < 4100) {
                        if (j1 == 4000) {
                          k -= 2;
                          int i19 = GlobalStatics_9.anIntArray2929[k];
                          int j51 = GlobalStatics_9.anIntArray2929[k + 1];
                          GlobalStatics_9.anIntArray2929[k++] = j51 + i19;
                          continue;
                        }
                        if (j1 == 4001) {
                          k -= 2;
                          int j19 = GlobalStatics_9.anIntArray2929[k];
                          int k51 = GlobalStatics_9.anIntArray2929[1 + k];
                          GlobalStatics_9.anIntArray2929[k++] = -k51 + j19;
                          continue;
                        }
                        if (j1 == 4002) {
                          k -= 2;
                          int k19 = GlobalStatics_9.anIntArray2929[k];
                          int l51 = GlobalStatics_9.anIntArray2929[1 + k];
                          GlobalStatics_9.anIntArray2929[k++] = l51 * k19;
                          continue;
                        }
                        if (j1 == 4003) {
                          k -= 2;
                          int l19 = GlobalStatics_9.anIntArray2929[k];
                          int i52 = GlobalStatics_9.anIntArray2929[k + 1];
                          GlobalStatics_9.anIntArray2929[k++] = l19 / i52;
                          continue;
                        }
                        if (j1 == 4004) {
                          int i20 = GlobalStatics_9.anIntArray2929[--k];
                          GlobalStatics_9.anIntArray2929[k++] = (int) (i20
                              * Math.random());
                          continue;
                        }
                        if (j1 == 4005) {
                          int j20 = GlobalStatics_9.anIntArray2929[--k];
                          GlobalStatics_9.anIntArray2929[k++] =
                              (int) (Math.random() * (1 + j20));
                          continue;
                        }
                        if (j1 == 4006) {
                          k -= 5;
                          int k20 = GlobalStatics_9.anIntArray2929[k];
                          int j52 = GlobalStatics_9.anIntArray2929[k + 1];
                          int i77 = GlobalStatics_9.anIntArray2929[k + 3];
                          int i69 = GlobalStatics_9.anIntArray2929[2 + k];
                          int j79 = GlobalStatics_9.anIntArray2929[k + 4];
                          GlobalStatics_9.anIntArray2929[k++] =
                              (-k20 + j52) * (j79 - i69) / (-i69 + i77) + k20;
                          continue;
                        }
                        if (j1 == 4007) {
                          k -= 2;
                          long l20 = GlobalStatics_9.anIntArray2929[k];
                          long l69 = GlobalStatics_9.anIntArray2929[k + 1];
                          GlobalStatics_9.anIntArray2929[k++] = (int) (
                              l20 * l69 / 100L + l20);
                          continue;
                        }
                        if (j1 == 4008) {
                          k -= 2;
                          int i21 = GlobalStatics_9.anIntArray2929[k];
                          int k52 = GlobalStatics_9.anIntArray2929[1 + k];
                          GlobalStatics_9.anIntArray2929[k++] = HuffmanEncoderStatics
                              .method308(i21, 1 << k52);
                          continue;
                        }
                        if (j1 == 4009) {
                          k -= 2;
                          int j21 = GlobalStatics_9.anIntArray2929[k];
                          int l52 = GlobalStatics_9.anIntArray2929[1 + k];
                          GlobalStatics_9.anIntArray2929[k++] =
                              -1 - (1 << l52) & j21;
                          continue;
                        }
                        if (j1 == 4010) {
                          k -= 2;
                          int k21 = GlobalStatics_9.anIntArray2929[k];
                          int i53 = GlobalStatics_9.anIntArray2929[k + 1];
                          GlobalStatics_9.anIntArray2929[k++] =
                              (k21 & 1 << i53) != 0 ? 1 : 0;
                          continue;
                        }
                        if (j1 == 4011) {
                          k -= 2;
                          int j53 = GlobalStatics_9.anIntArray2929[k + 1];
                          int l21 = GlobalStatics_9.anIntArray2929[k];
                          GlobalStatics_9.anIntArray2929[k++] = l21 % j53;
                          continue;
                        }
                        if (j1 == 4012) {
                          k -= 2;
                          int k53 = GlobalStatics_9.anIntArray2929[k + 1];
                          int i22 = GlobalStatics_9.anIntArray2929[k];
                          if (i22 == 0) {
                            GlobalStatics_9.anIntArray2929[k++] = 0;
                          } else {
                            GlobalStatics_9.anIntArray2929[k++] = (int) Math
                                .pow(i22, k53);
                          }
                          continue;
                        }
                        if (j1 == 4013) {
                          k -= 2;
                          int l53 = GlobalStatics_9.anIntArray2929[k + 1];
                          int j22 = GlobalStatics_9.anIntArray2929[k];
                          if (j22 == 0) {
                            GlobalStatics_9.anIntArray2929[k++] = 0;
                          } else {
                            if (l53 == 0) {
                              GlobalStatics_9.anIntArray2929[k++] = 0x7fffffff;
                            } else {
                              GlobalStatics_9.anIntArray2929[k++] =
                                  (int) Math.pow(j22, 1.0D / l53);
                            }
                          }
                          continue;
                        }
                        if (j1 == 4014) {
                          k -= 2;
                          int i54 = GlobalStatics_9.anIntArray2929[k + 1];
                          int k22 = GlobalStatics_9.anIntArray2929[k];
                          GlobalStatics_9.anIntArray2929[k++] = i54 & k22;
                          continue;
                        }
                        if (j1 == 4015) {
                          k -= 2;
                          int l22 = GlobalStatics_9.anIntArray2929[k];
                          int j54 = GlobalStatics_9.anIntArray2929[k + 1];
                          GlobalStatics_9.anIntArray2929[k++] = HuffmanEncoderStatics
                              .method308(l22, j54);
                          continue;
                        }
                        if (j1 == 4016) {
                          k -= 2;
                          int i23 = GlobalStatics_9.anIntArray2929[k];
                          int k54 = GlobalStatics_9.anIntArray2929[1 + k];
                          GlobalStatics_9.anIntArray2929[k++] =
                              i23 >= k54 ? k54 : i23;
                          continue;
                        }
                        if (j1 == 4017) {
                          k -= 2;
                          int l54 = GlobalStatics_9.anIntArray2929[1 + k];
                          int j23 = GlobalStatics_9.anIntArray2929[k];
                          GlobalStatics_9.anIntArray2929[k++] =
                              l54 < j23 ? j23 : l54;
                          continue;
                        }
                        if (j1 != 4018) {
                          break;
                        }
                        k -= 3;
                        long l23 = GlobalStatics_9.anIntArray2929[k];
                        long l70 = GlobalStatics_9.anIntArray2929[k + 1];
                        long l79 = GlobalStatics_9.anIntArray2929[2 + k];
                        GlobalStatics_9.anIntArray2929[k++] = (int) (l23 * l79
                            / l70);
                        continue;
                      }
                      if (j1 >= 4200) {
                        if (j1 >= 4300) {
                          if (j1 < 4400) {
                            if (j1 != 4300) {
                              break;
                            }
                            k -= 2;
                            int k23 = GlobalStatics_9.anIntArray2929[k];
                            int i55 = GlobalStatics_9.anIntArray2929[1 + k];
                            Parameter class3_sub28_sub9 = GlobalStatics_0
                                .method1210(64, i55);
                            if (class3_sub28_sub9.method585(0)) {
                              GlobalStatics_0.aClass94Array75[l++] = GlobalStatics_2
                                  .getNpcConfiguration(k23)
                                  .method1477(i55,
                                      class3_sub28_sub9.aClass94_3619, true);
                            } else {
                              GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_2
                                  .getNpcConfiguration(k23)
                                  .method1475(i55, -26460,
                                      class3_sub28_sub9.anInt3614);
                            }
                            continue;
                          }
                          if (j1 >= 4500) {
                            if (j1 >= 4600) {
                              if (j1 < 5100) {
                                if (j1 == 5000) {
                                  GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_9.anInt3101;
                                  continue;
                                }
                                if (j1 == 5001) {
                                  DummyClass24.anInt1657++;
                                  k -= 3;
                                  GlobalStatics_9.anInt3101 = GlobalStatics_9.anIntArray2929[k];
                                  GlobalStatics_9.anInt467 = GlobalStatics_9.anIntArray2929[
                                      1 + k];
                                  DummyClass38.anInt734 = GlobalStatics_9.anIntArray2929[
                                      2 + k];
                                  GlobalStatics_9.secureBuffer.writePacket(157);
                                  GlobalStatics_9.secureBuffer.writeByte(
                                      GlobalStatics_9.anInt3101);
                                  GlobalStatics_9.secureBuffer
                                      .writeByte(GlobalStatics_9.anInt467);
                                  GlobalStatics_9.secureBuffer
                                      .writeByte(DummyClass38.anInt734);
                                  continue;
                                }
                                if (j1 == 5002) {
                                  GameString class94_17 = GlobalStatics_0.aClass94Array75[--l];
                                  k -= 2;
                                  int j55 = GlobalStatics_9.anIntArray2929[k];
                                  DummyClass14.anInt1956++;
                                  int j69 = GlobalStatics_9.anIntArray2929[1
                                      + k];
                                  GlobalStatics_9.secureBuffer.writePacket(99);
                                  GlobalStatics_9.secureBuffer
                                      .writeLong(class94_17.toBase37());
                                  GlobalStatics_9.secureBuffer
                                      .writeByte(j55 - 1);
                                  GlobalStatics_9.secureBuffer.writeByte(j69);
                                  continue;
                                }
                                if (j1 == 5003) {
                                  GameString class94_46 = null;
                                  int i24 = GlobalStatics_9.anIntArray2929[--k];
                                  if (i24 < 100) {
                                    class94_46 = GlobalStatics_0.aClass94Array2580[i24];
                                  }
                                  if (class94_46 == null) {
                                    class94_46 = GlobalStatics_6.aClass94_2331;
                                  }
                                  GlobalStatics_0.aClass94Array75[l++] = class94_46;
                                  continue;
                                }
                                if (j1 == 5004) {
                                  int j24 = GlobalStatics_9.anIntArray2929[--k];
                                  int k55 = -1;
                                  if (j24 < 100 &&
                                      GlobalStatics_0.aClass94Array2580[j24]
                                          != null) {
                                    k55 = GlobalStatics_10.anIntArray3082[j24];
                                  }
                                  GlobalStatics_9.anIntArray2929[k++] = k55;
                                  continue;
                                }
                                if (j1 == 5005) {
                                  GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_9.anInt467;
                                  continue;
                                }
                                if (j1 == 5008) {
                                  GameString string = GlobalStatics_0.aClass94Array75[--l];
                                  if (string.method1558(
                                      GlobalStatics_10.COMMAND_PREFIX, 0)) {
                                    GlobalStatics_7.handleCommand(string);
                                  } else if (GlobalStatics_10.rights != 0
                                      || (!GlobalStatics_9.aBoolean2433
                                      || GlobalStatics_6.aBoolean1641)
                                      && !GlobalStatics_10.aBoolean3166) {
                                    GameString class94_47 = string.method1534();
                                    DummyClass11.anInt2037++;
                                    byte byte3 = 0;
                                    if (class94_47.method1558(
                                        GlobalStatics_9.aClass94_3548, 0)) {
                                      byte3 = 0;
                                      string = string.substring(
                                          GlobalStatics_9.aClass94_3548
                                              .getLength());
                                    } else if (!class94_47.method1558(
                                        GlobalStatics_10.aClass94_2490, 0)) {
                                      if (class94_47.method1558(
                                          GlobalStatics_11.aClass94_806, 0)) {
                                        string = string.substring(
                                            GlobalStatics_11.aClass94_806
                                                .getLength());
                                        byte3 = 2;
                                      } else {
                                        if (class94_47.method1558(
                                            GlobalStatics_1.aClass94_2197, 0)) {
                                          byte3 = 3;
                                          string =
                                              string.substring(
                                                  GlobalStatics_1.aClass94_2197
                                                      .getLength());
                                        } else if (class94_47.method1558(
                                            GlobalStatics_4.aClass94_833,
                                            0)) {
                                          string =
                                              string.substring(
                                                  GlobalStatics_4.aClass94_833
                                                      .getLength());
                                          byte3 = 4;
                                        } else if (class94_47.method1558(
                                            GlobalStatics_10.aClass94_2214,
                                            0)) {
                                          string = string.substring(
                                              GlobalStatics_10.aClass94_2214
                                                  .getLength());
                                          byte3 = 5;
                                        } else if (!class94_47.method1558(
                                            GlobalStatics_9.aClass94_3246,
                                            0)) {
                                          if (class94_47.method1558(
                                              GlobalStatics_8.aClass94_32,
                                              0)) {
                                            byte3 = 7;
                                            string = string.substring(
                                                GlobalStatics_8.aClass94_32
                                                    .getLength());
                                          } else {
                                            if (class94_47
                                                .method1558(
                                                    GlobalStatics_9.aClass94_3981,
                                                    0)) {
                                              string =
                                                  string.substring(
                                                      GlobalStatics_9.aClass94_3981
                                                          .getLength());
                                              byte3 = 8;
                                            } else if (!class94_47.method1558(
                                                GlobalStatics_9.aClass94_60,
                                                0)) {
                                              if (class94_47.method1558(
                                                  DummyClass14.aClass94_1961,
                                                  0)) {
                                                byte3 = 10;
                                                string = string.substring(
                                                    DummyClass14.aClass94_1961
                                                        .getLength());
                                              } else if (!class94_47.method1558(
                                                  DummyClass5.aClass94_2992,
                                                  0)) {
                                                if (GlobalStatics_10.languageId
                                                    != 0) {
                                                  if (class94_47.method1558(
                                                      GlobalStatics_9.aClass94_3544,
                                                      0)) {
                                                    byte3 = 0;
                                                    string = string.substring(
                                                        GlobalStatics_9.aClass94_3544
                                                            .getLength());
                                                  } else if (class94_47
                                                      .method1558(
                                                          GlobalStatics_10.aClass94_2481,
                                                          0)) {
                                                    string = string.substring(
                                                        GlobalStatics_10.aClass94_2481
                                                            .getLength());
                                                    byte3 = 1;
                                                  } else if (class94_47
                                                      .method1558(
                                                          GlobalStatics_11.aClass94_809,
                                                          0)) {
                                                    string =
                                                        string.substring(
                                                            GlobalStatics_11.aClass94_809
                                                                .getLength());
                                                    byte3 = 2;
                                                  } else if (!class94_47
                                                      .method1558(
                                                          GlobalStatics_1.aClass94_2196,
                                                          0)) {
                                                    if (class94_47.method1558(
                                                        GlobalStatics_4.aClass94_825,
                                                        0)) {
                                                      string = string.substring(
                                                          GlobalStatics_4.aClass94_825
                                                              .getLength());
                                                      byte3 = 4;
                                                    } else {
                                                      if (class94_47.method1558(
                                                          GlobalStatics_10.aClass94_2210,
                                                          0)) {
                                                        byte3 = 5;
                                                        string = string
                                                            .substring(
                                                                GlobalStatics_10.aClass94_2210
                                                                    .getLength());
                                                      } else if (class94_47
                                                          .method1558(
                                                              GlobalStatics_9.aClass94_3249,
                                                              0)) {
                                                        string = string
                                                            .substring(
                                                                GlobalStatics_9.aClass94_3249
                                                                    .getLength());
                                                        byte3 = 6;
                                                      } else if (class94_47
                                                          .method1558(
                                                              GlobalStatics_8.aClass94_36,
                                                              0)) {
                                                        byte3 = 7;
                                                        string = string
                                                            .substring(
                                                                GlobalStatics_8.aClass94_36
                                                                    .getLength());
                                                      } else if (class94_47
                                                          .method1558(
                                                              GlobalStatics_9.aClass94_3988,
                                                              0)) {
                                                        byte3 = 8;
                                                        string = string
                                                            .substring(
                                                                GlobalStatics_9.aClass94_3988
                                                                    .getLength());
                                                      } else if (class94_47
                                                          .method1558(
                                                              GlobalStatics_9.aClass94_62,
                                                              0)) {
                                                        byte3 = 9;
                                                        string = string
                                                            .substring(
                                                                GlobalStatics_9.aClass94_62
                                                                    .getLength());
                                                      } else if (class94_47
                                                          .method1558(
                                                              DummyClass14.aClass94_1962,
                                                              0)) {
                                                        string = string
                                                            .substring(
                                                                DummyClass14.aClass94_1962
                                                                    .getLength());
                                                        byte3 = 10;
                                                      } else if (class94_47
                                                          .method1558(
                                                              DummyClass5.aClass94_2991,
                                                              0)) {
                                                        string = string
                                                            .substring(
                                                                DummyClass5.aClass94_2991
                                                                    .getLength());
                                                        byte3 = 11;
                                                      }
                                                    }
                                                  } else {
                                                    string = string.substring(
                                                        GlobalStatics_1.aClass94_2196
                                                            .getLength());
                                                    byte3 = 3;
                                                  }
                                                }
                                              } else {
                                                string = string.substring(
                                                    DummyClass5.aClass94_2992
                                                        .getLength());
                                                byte3 = 11;
                                              }
                                            } else {
                                              byte3 = 9;
                                              string =
                                                  string.substring(
                                                      GlobalStatics_9.aClass94_60
                                                          .getLength());
                                            }
                                          }
                                        } else {
                                          byte3 = 6;
                                          string = string.substring(
                                              GlobalStatics_9.aClass94_3246
                                                  .getLength());
                                        }
                                      }
                                    } else {
                                      string = string.substring(
                                          GlobalStatics_10.aClass94_2490
                                              .getLength());
                                      byte3 = 1;
                                    }
                                    byte byte4 = 0;
                                    class94_47 = string.method1534();
                                    if (class94_47.method1558(
                                        GlobalStatics_8.aClass94_2740, 0)) {
                                      string =
                                          string.substring(
                                              GlobalStatics_8.aClass94_2740
                                                  .getLength());
                                      byte4 = 1;
                                    } else if (!class94_47.method1558(
                                        GlobalStatics_10.aClass94_3325, 0)) {
                                      if (class94_47.method1558(
                                          GlobalStatics_10.aClass94_1689, 0)) {
                                        string = string.substring(
                                            GlobalStatics_10.aClass94_1689
                                                .getLength());
                                        byte4 = 3;
                                      } else {
                                        if (class94_47.method1558(
                                            DummyClass32.aClass94_528, 0)) {
                                          byte4 = 4;
                                          string =
                                              string.substring(
                                                  DummyClass32.aClass94_528
                                                      .getLength());
                                        } else {
                                          if (class94_47.method1558(
                                              GlobalStatics_9.aClass94_547,
                                              0)) {
                                            byte4 = 5;
                                            string = string.substring(
                                                GlobalStatics_9.aClass94_547
                                                    .getLength());
                                          } else if (
                                              GlobalStatics_10.languageId
                                                  != 0) {
                                            if (class94_47.method1558(
                                                GlobalStatics_8.aClass94_2751,
                                                0)) {
                                              string = string.substring(
                                                  GlobalStatics_8.aClass94_2751
                                                      .getLength());
                                              byte4 = 1;
                                            } else {
                                              if (class94_47.method1558(
                                                  GlobalStatics_10.aClass94_3333,
                                                  0)) {
                                                byte4 = 2;
                                                string = string.substring(
                                                    GlobalStatics_10.aClass94_3333
                                                        .getLength());
                                              } else {
                                                if (class94_47.method1558(
                                                    GlobalStatics_10.aClass94_1688,
                                                    0)) {
                                                  byte4 = 3;
                                                  string = string.substring(
                                                      GlobalStatics_10.aClass94_1688
                                                          .getLength());
                                                } else {
                                                  if (class94_47.method1558(
                                                      DummyClass32.aClass94_523,
                                                      0)) {
                                                    byte4 = 4;
                                                    string = string.substring(
                                                        DummyClass32.aClass94_523
                                                            .getLength());
                                                  } else {
                                                    if (class94_47.method1558(
                                                        GlobalStatics_9.aClass94_551,
                                                        0)) {
                                                      string = string.substring(
                                                          GlobalStatics_9.aClass94_551
                                                              .getLength());
                                                      byte4 = 5;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      byte4 = 2;
                                      string = string.substring(
                                          GlobalStatics_10.aClass94_3325
                                              .getLength());
                                    }
                                    GlobalStatics_9.secureBuffer
                                        .writePacket(237);
                                    GlobalStatics_9.secureBuffer.writeByte(0);
                                    int k79 = GlobalStatics_9.secureBuffer.position;
                                    GlobalStatics_9.secureBuffer
                                        .writeByte(byte3);
                                    GlobalStatics_9.secureBuffer
                                        .writeByte(byte4);
                                    DummyClass52
                                        .method1423(false,
                                            GlobalStatics_9.secureBuffer,
                                            string);
                                    GlobalStatics_9.secureBuffer
                                        .method769((byte) -127,
                                            -k79
                                                + GlobalStatics_9.secureBuffer.position);
                                  }
                                  continue;
                                }
                                if (j1 == 5009) {
                                  l -= 2;
                                  GameString class94_48 = GlobalStatics_0.aClass94Array75[
                                      l + 1];
                                  GameString class94_19 = GlobalStatics_0.aClass94Array75[l];
                                  if (GlobalStatics_10.rights != 0
                                      || (!GlobalStatics_9.aBoolean2433
                                      || GlobalStatics_6.aBoolean1641)
                                      && !GlobalStatics_10.aBoolean3166) {
                                    GlobalStatics_9.secureBuffer
                                        .writePacket(201);
                                    GlobalStatics_2.anInt348++;
                                    GlobalStatics_9.secureBuffer.writeByte(0);
                                    int k69 = GlobalStatics_9.secureBuffer.position;
                                    GlobalStatics_9.secureBuffer
                                        .writeLong(class94_19.toBase37());
                                    DummyClass52.method1423(false,
                                        GlobalStatics_9.secureBuffer,
                                        class94_48);
                                    GlobalStatics_9.secureBuffer
                                        .method769((byte) -127,
                                            GlobalStatics_9.secureBuffer.position
                                                - k69);
                                  }
                                  continue;
                                }
                                if (j1 == 5010) {
                                  int k24 = GlobalStatics_9.anIntArray2929[--k];
                                  GameString class94_49 = null;
                                  if (k24 < 100) {
                                    class94_49 = GlobalStatics_9.aClass94Array3226[k24];
                                  }
                                  if (class94_49 == null) {
                                    class94_49 = GlobalStatics_6.aClass94_2331;
                                  }
                                  GlobalStatics_0.aClass94Array75[l++] = class94_49;
                                  continue;
                                }
                                if (j1 == 5011) {
                                  int l24 = GlobalStatics_9.anIntArray2929[--k];
                                  GameString class94_50 = null;
                                  if (l24 < 100) {
                                    class94_50 = DummyClass4.aClass94Array3003[l24];
                                  }
                                  if (class94_50 == null) {
                                    class94_50 = GlobalStatics_6.aClass94_2331;
                                  }
                                  GlobalStatics_0.aClass94Array75[l++] = class94_50;
                                  continue;
                                }
                                if (j1 == 5012) {
                                  int i25 = GlobalStatics_9.anIntArray2929[--k];
                                  int l55 = -1;
                                  if (i25 < 100) {
                                    l55 = GlobalStatics_9.anIntArray1835[i25];
                                  }
                                  GlobalStatics_9.anIntArray2929[k++] = l55;
                                  continue;
                                }
                                if (j1 == 5015) {
                                  GameString class94_20;
                                  if (GlobalStatics_9.localPlayer == null
                                      || GlobalStatics_9.localPlayer.name
                                      == null) {
                                    class94_20 = GlobalStatics_9.username;
                                  } else {
                                    class94_20 = GlobalStatics_9.localPlayer
                                        .getFullName();
                                  }
                                  GlobalStatics_0.aClass94Array75[l++] = class94_20;
                                  continue;
                                }
                                if (j1 == 5016) {
                                  GlobalStatics_9.anIntArray2929[k++] = DummyClass38.anInt734;
                                  continue;
                                }
                                if (j1 == 5017) {
                                  GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_10.anInt3114;
                                  continue;
                                }
                                if (j1 == 5050) {
                                  int j25 = GlobalStatics_9.anIntArray2929[--k];
                                  GlobalStatics_0.aClass94Array75[l++] =
                                      GlobalStatics_10.method336(j25,
                                          (byte) -54).aClass94_3538;
                                  continue;
                                }
                                if (j1 == 5051) {
                                  int k25 = GlobalStatics_9.anIntArray2929[--k];
                                  SomethingQuickChat2 class3_sub28_sub1 =
                                      GlobalStatics_10
                                          .method336(k25, (byte) -54);
                                  if (class3_sub28_sub1.anIntArray3534
                                      != null) {
                                    GlobalStatics_9.anIntArray2929[k++] =
                                        class3_sub28_sub1.anIntArray3534.length;
                                  } else {
                                    GlobalStatics_9.anIntArray2929[k++] = 0;
                                  }
                                  continue;
                                }
                                if (j1 == 5052) {
                                  k -= 2;
                                  int l25 = GlobalStatics_9.anIntArray2929[k];
                                  int i56 = GlobalStatics_9.anIntArray2929[k
                                      + 1];
                                  SomethingQuickChat2 class3_sub28_sub1_2 =
                                      GlobalStatics_10
                                          .method336(l25, (byte) -54);
                                  int j77 = class3_sub28_sub1_2.anIntArray3534[i56];
                                  GlobalStatics_9.anIntArray2929[k++] = j77;
                                  continue;
                                }
                                if (j1 == 5053) {
                                  int i26 = GlobalStatics_9.anIntArray2929[--k];
                                  SomethingQuickChat2 class3_sub28_sub1_1 =
                                      GlobalStatics_10
                                          .method336(i26, (byte) -54);
                                  if (class3_sub28_sub1_1.anIntArray3540
                                      != null) {
                                    GlobalStatics_9.anIntArray2929[k++] =
                                        class3_sub28_sub1_1.anIntArray3540.length;
                                  } else {
                                    GlobalStatics_9.anIntArray2929[k++] = 0;
                                  }
                                  continue;
                                }
                                if (j1 == 5054) {
                                  k -= 2;
                                  int j56 = GlobalStatics_9.anIntArray2929[1
                                      + k];
                                  int j26 = GlobalStatics_9.anIntArray2929[k];
                                  GlobalStatics_9.anIntArray2929[k++] =
                                      GlobalStatics_10.method336(j26,
                                          (byte) -54).anIntArray3540[j56];
                                  continue;
                                }
                                if (j1 == 5055) {
                                  int k26 = GlobalStatics_9.anIntArray2929[--k];
                                  GlobalStatics_0.aClass94Array75[l++] =
                                      GlobalStatics_0
                                          .method733(0xbc614e, k26)
                                          .method554(-1);
                                  continue;
                                }
                                if (j1 == 5056) {
                                  int l26 = GlobalStatics_9.anIntArray2929[--k];
                                  SomethingQuickChat class3_sub28_sub4 =
                                      GlobalStatics_0
                                          .method733(0xbc614e, l26);
                                  if (class3_sub28_sub4.anIntArray3567
                                      != null) {
                                    GlobalStatics_9.anIntArray2929[k++] =
                                        class3_sub28_sub4.anIntArray3567.length;
                                  } else {
                                    GlobalStatics_9.anIntArray2929[k++] = 0;
                                  }
                                  continue;
                                }
                                if (j1 == 5057) {
                                  k -= 2;
                                  int k56 = GlobalStatics_9.anIntArray2929[1
                                      + k];
                                  int i27 = GlobalStatics_9.anIntArray2929[k];
                                  GlobalStatics_9.anIntArray2929[k++] =
                                      GlobalStatics_0
                                          .method733(0xbc614e,
                                              i27).anIntArray3567[k56];
                                  continue;
                                }
                                if (j1 == 5058) {
                                  GlobalStatics_9.aClass10_1056 = new SomethingQuickChatK();
                                  GlobalStatics_9.aClass10_1056.anInt149 =
                                      GlobalStatics_9.anIntArray2929[--k];
                                  GlobalStatics_9.aClass10_1056.aClass3_Sub28_Sub4_151 =
                                      GlobalStatics_0.method733(0xbc614e,
                                          GlobalStatics_9.aClass10_1056.anInt149);
                                  GlobalStatics_9.aClass10_1056.anIntArray153 =
                                      new int[GlobalStatics_9.aClass10_1056.aClass3_Sub28_Sub4_151
                                          .method552(
                                              true)];
                                  continue;
                                }
                                if (j1 == 5059) {
                                  GlobalStatics_6.anInt3613++;
                                  GlobalStatics_9.secureBuffer.writePacket(167);
                                  GlobalStatics_9.secureBuffer.writeByte(0);
                                  int j27 = GlobalStatics_9.secureBuffer.position;
                                  GlobalStatics_9.secureBuffer.writeByte(0);
                                  GlobalStatics_9.secureBuffer.writeShort(
                                      GlobalStatics_9.aClass10_1056.anInt149);
                                  GlobalStatics_9.aClass10_1056.aClass3_Sub28_Sub4_151
                                      .method545(
                                          GlobalStatics_9.secureBuffer,
                                          GlobalStatics_9.aClass10_1056.anIntArray153,
                                          false);
                                  GlobalStatics_9.secureBuffer
                                      .method769((byte) -126,
                                          -j27
                                              + GlobalStatics_9.secureBuffer.position);
                                  continue;
                                }
                                if (j1 == 5060) {
                                  GlobalStatics_9.anInt1906++;
                                  GameString class94_21 = GlobalStatics_0.aClass94Array75[--l];
                                  GlobalStatics_9.secureBuffer.writePacket(178);
                                  GlobalStatics_9.secureBuffer.writeByte(0);
                                  int l56 = GlobalStatics_9.secureBuffer.position;
                                  GlobalStatics_9.secureBuffer
                                      .writeLong(class94_21.toBase37());
                                  GlobalStatics_9.secureBuffer.writeShort(
                                      GlobalStatics_9.aClass10_1056.anInt149);
                                  GlobalStatics_9.aClass10_1056.aClass3_Sub28_Sub4_151
                                      .method545(
                                          GlobalStatics_9.secureBuffer,
                                          GlobalStatics_9.aClass10_1056.anIntArray153,
                                          false);
                                  GlobalStatics_9.secureBuffer
                                      .method769((byte) 108,
                                          GlobalStatics_9.secureBuffer.position
                                              - l56);
                                  continue;
                                }
                                if (j1 == 5061) {
                                  GlobalStatics_9.secureBuffer.writePacket(167);
                                  GlobalStatics_6.anInt3613++;
                                  GlobalStatics_9.secureBuffer.writeByte(0);
                                  int k27 = GlobalStatics_9.secureBuffer.position;
                                  GlobalStatics_9.secureBuffer.writeByte(1);
                                  GlobalStatics_9.secureBuffer.writeShort(
                                      GlobalStatics_9.aClass10_1056.anInt149);
                                  GlobalStatics_9.aClass10_1056.aClass3_Sub28_Sub4_151
                                      .method545(
                                          GlobalStatics_9.secureBuffer,
                                          GlobalStatics_9.aClass10_1056.anIntArray153,
                                          false);
                                  GlobalStatics_9.secureBuffer
                                      .method769((byte) -126,
                                          -k27
                                              + GlobalStatics_9.secureBuffer.position);
                                  continue;
                                }
                                if (j1 == 5062) {
                                  k -= 2;
                                  int i57 = GlobalStatics_9.anIntArray2929[1
                                      + k];
                                  int l27 = GlobalStatics_9.anIntArray2929[k];
                                  GlobalStatics_9.anIntArray2929[k++] =
                                      GlobalStatics_10.method336(l27,
                                          (byte) -54).anIntArray3535[i57];
                                  continue;
                                }
                                if (j1 == 5063) {
                                  k -= 2;
                                  int j57 = GlobalStatics_9.anIntArray2929[k
                                      + 1];
                                  int i28 = GlobalStatics_9.anIntArray2929[k];
                                  GlobalStatics_9.anIntArray2929[k++] =
                                      GlobalStatics_10.method336(i28,
                                          (byte) -54).anIntArray3533[j57];
                                  continue;
                                }
                                if (j1 == 5064) {
                                  k -= 2;
                                  int k57 = GlobalStatics_9.anIntArray2929[1
                                      + k];
                                  int j28 = GlobalStatics_9.anIntArray2929[k];
                                  if (k57 == -1) {
                                    GlobalStatics_9.anIntArray2929[k++] = -1;
                                  } else {
                                    GlobalStatics_9.anIntArray2929[k++] =
                                        GlobalStatics_10
                                            .method336(j28, (byte) -54)
                                            .method529((byte) 50, k57);
                                  }
                                  continue;
                                }
                                if (j1 == 5065) {
                                  k -= 2;
                                  int k28 = GlobalStatics_9.anIntArray2929[k];
                                  int l57 = GlobalStatics_9.anIntArray2929[k
                                      + 1];
                                  if (l57 == -1) {
                                    GlobalStatics_9.anIntArray2929[k++] = -1;
                                  } else {
                                    GlobalStatics_9.anIntArray2929[k++] =
                                        GlobalStatics_10
                                            .method336(k28, (byte) -54)
                                            .method526(l57, 0);
                                  }
                                  continue;
                                }
                                if (j1 == 5066) {
                                  int l28 = GlobalStatics_9.anIntArray2929[--k];
                                  GlobalStatics_9.anIntArray2929[k++] =
                                      GlobalStatics_0
                                          .method733(0xbc614e, l28)
                                          .method552(true);
                                  continue;
                                }
                                if (j1 == 5067) {
                                  k -= 2;
                                  int i58 = GlobalStatics_9.anIntArray2929[k
                                      + 1];
                                  int i29 = GlobalStatics_9.anIntArray2929[k];
                                  int i70 = GlobalStatics_0
                                      .method733(0xbc614e, i29)
                                      .method550(49, i58);
                                  GlobalStatics_9.anIntArray2929[k++] = i70;
                                  continue;
                                }
                                if (j1 == 5068) {
                                  k -= 2;
                                  int j29 = GlobalStatics_9.anIntArray2929[k];
                                  int j58 = GlobalStatics_9.anIntArray2929[1
                                      + k];
                                  GlobalStatics_9.aClass10_1056.anIntArray153[j29] = j58;
                                  continue;
                                }
                                if (j1 == 5069) {
                                  k -= 2;
                                  int k29 = GlobalStatics_9.anIntArray2929[k];
                                  int k58 = GlobalStatics_9.anIntArray2929[k
                                      + 1];
                                  GlobalStatics_9.aClass10_1056.anIntArray153[k29] = k58;
                                  continue;
                                }
                                if (j1 == 5070) {
                                  k -= 3;
                                  int l29 = GlobalStatics_9.anIntArray2929[k];
                                  int j70 = GlobalStatics_9.anIntArray2929[k
                                      + 2];
                                  int l58 = GlobalStatics_9.anIntArray2929[k
                                      + 1];
                                  SomethingQuickChat class3_sub28_sub4_1 =
                                      GlobalStatics_0
                                          .method733(0xbc614e, l29);
                                  if (class3_sub28_sub4_1.method550(73, l58)
                                      != 0) {
                                    throw new RuntimeException("bad command");
                                  }
                                  GlobalStatics_9.anIntArray2929[k++] =
                                      class3_sub28_sub4_1
                                          .method549(-117, j70, l58);
                                  continue;
                                }
                                if (j1 == 5071) {
                                  GameString class94_22 = GlobalStatics_0.aClass94Array75[--l];
                                  boolean flag4 =
                                      GlobalStatics_9.anIntArray2929[--k] == 1;
                                  GlobalStatics_9
                                      .method541((byte) 123, flag4, class94_22);
                                  GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_8.anInt952;
                                  continue;
                                }
                                if (j1 == 5072) {
                                  if (DummyClass54.aShortArray1398 == null
                                      || GlobalStatics_9.anInt2756
                                      >= GlobalStatics_8.anInt952) {
                                    GlobalStatics_9.anIntArray2929[k++] = -1;
                                  } else {
                                    int var0 = DummyClass54.aShortArray1398[GlobalStatics_9.anInt2756++];
                                    GlobalStatics_9.anIntArray2929[k++] =
                                        var0 & 65535;
                                  }
                                  continue;
                                }
                                if (j1 != 5073) {
                                  break;
                                }
                                GlobalStatics_9.anInt2756 = 0;
                                continue;
                              }
                              if (j1 < 5200) {
                                if (j1 == 5100) {
                                  if (GlobalStatics_8.aBooleanArray1490[86]) {
                                    GlobalStatics_9.anIntArray2929[k++] = 1;
                                  } else {
                                    GlobalStatics_9.anIntArray2929[k++] = 0;
                                  }
                                  continue;
                                }
                                if (j1 == 5101) {
                                  if (GlobalStatics_8.aBooleanArray1490[82]) {
                                    GlobalStatics_9.anIntArray2929[k++] = 1;
                                  } else {
                                    GlobalStatics_9.anIntArray2929[k++] = 0;
                                  }
                                  continue;
                                }
                                if (j1 != 5102) {
                                  break;
                                }
                                if (GlobalStatics_8.aBooleanArray1490[81]) {
                                  GlobalStatics_9.anIntArray2929[k++] = 1;
                                } else {
                                  GlobalStatics_9.anIntArray2929[k++] = 0;
                                }
                                continue;
                              }
                              if (j1 < 5300) {
                                if (j1 == 5200) {
                                  GlobalStatics_9.method1479(
                                      GlobalStatics_9.anIntArray2929[--k],
                                      (byte) 56);
                                  continue;
                                }
                                if (j1 == 5201) {
                                  GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_6
                                      .method571(-109);
                                  continue;
                                }
                                if (j1 == 5202) {
                                  GlobalStatics_6.method503((byte) -53,
                                      GlobalStatics_9.anIntArray2929[--k]);
                                  continue;
                                }
                                if (j1 == 5203) {
                                  GlobalStatics_0.method84(
                                      GlobalStatics_0.aClass94Array75[--l],
                                      -801);
                                  continue;
                                }
                                if (j1 == 5204) {
                                  GlobalStatics_0.aClass94Array75[l - 1] =
                                      GlobalStatics_8.method27(
                                          GlobalStatics_0.aClass94Array75[l
                                              - 1], true);
                                  continue;
                                }
                                if (j1 == 5205) {
                                  GlobalStatics_9.method138(
                                      GlobalStatics_0.aClass94Array75[--l], 0);
                                  continue;
                                }
                                if (j1 == 5206) {
                                  int i30 = GlobalStatics_9.anIntArray2929[--k];
                                  SomethingWorldMapy class3_sub28_sub3_4 =
                                      GlobalStatics_9
                                          .method884(0x3fff & i30 >> 14,
                                              (byte) 111,
                                              0x3fff & i30);
                                  if (class3_sub28_sub3_4 != null) {
                                    GlobalStatics_0.aClass94Array75[l++] = class3_sub28_sub3_4.aClass94_3561;
                                  } else {
                                    GlobalStatics_0.aClass94Array75[l++] = GlobalStatics_6.aClass94_2331;
                                  }
                                  continue;
                                }
                                if (j1 == 5207) {
                                  SomethingWorldMapy class3_sub28_sub3 =
                                      GlobalStatics_9.method371(2,
                                          GlobalStatics_0.aClass94Array75[--l]);
                                  if (class3_sub28_sub3 != null
                                      && class3_sub28_sub3.aClass94_3554
                                      != null) {
                                    GlobalStatics_0.aClass94Array75[l++] = class3_sub28_sub3.aClass94_3554;
                                  } else {
                                    GlobalStatics_0.aClass94Array75[l++] = GlobalStatics_6.aClass94_2331;
                                  }
                                  continue;
                                }
                                if (j1 == 5208) {
                                  GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_9.anInt817;
                                  GlobalStatics_9.anIntArray2929[k++] = DummyClass1.anInt410;
                                  continue;
                                }
                                if (j1 == 5209) {
                                  GlobalStatics_9.anIntArray2929[k++] =
                                      GlobalStatics_10.anInt3256
                                          + GlobalStatics_9.anInt3536;
                                  GlobalStatics_9.anIntArray2929[k++] =
                                      GlobalStatics_9.anInt65
                                          - GlobalStatics_9.anInt2251 + -1
                                          + DummyClass58.anInt1460;
                                  continue;
                                }
                                if (j1 == 5210) {
                                  SomethingWorldMapy class3_sub28_sub3_1 =
                                      GlobalStatics_2.method520((byte) -82);
                                  if (class3_sub28_sub3_1 == null) {
                                    GlobalStatics_9.anIntArray2929[k++] = 0;
                                    GlobalStatics_9.anIntArray2929[k++] = 0;
                                  } else {
                                    GlobalStatics_9.anIntArray2929[k++] =
                                        class3_sub28_sub3_1.anInt3558 * 64;
                                    GlobalStatics_9.anIntArray2929[k++] =
                                        64 * class3_sub28_sub3_1.anInt3556;
                                  }
                                  continue;
                                }
                                if (j1 == 5211) {
                                  SomethingWorldMapy class3_sub28_sub3_2 =
                                      GlobalStatics_2.method520((byte) -121);
                                  if (class3_sub28_sub3_2 != null) {
                                    GlobalStatics_9.anIntArray2929[k++] =
                                        class3_sub28_sub3_2.anInt3559
                                            - class3_sub28_sub3_2.anInt3555;
                                    GlobalStatics_9.anIntArray2929[k++] =
                                        -class3_sub28_sub3_2.anInt3562
                                            + class3_sub28_sub3_2.anInt3549;
                                  } else {
                                    GlobalStatics_9.anIntArray2929[k++] = 0;
                                    GlobalStatics_9.anIntArray2929[k++] = 0;
                                  }
                                  continue;
                                }
                                if (j1 == 5212) {
                                  int j30 = GlobalStatics_9
                                      .method1258((byte) -53);
                                  int k70 = 0;
                                  GameString class94_51;
                                  if (j30 == -1) {
                                    class94_51 = GlobalStatics_6.aClass94_2331;
                                  } else {
                                    class94_51 = DummyClass25.aClass131_1624.aClass94Array1721[j30];
                                    k70 = DummyClass25.aClass131_1624
                                        .method1791(j30, 8);
                                  }
                                  class94_51 = class94_51
                                      .method1560(GlobalStatics_9.aClass94_2765,
                                          true,
                                          GlobalStatics_7.aClass94_2168);
                                  GlobalStatics_0.aClass94Array75[l++] = class94_51;
                                  GlobalStatics_9.anIntArray2929[k++] = k70;
                                  continue;
                                }
                                if (j1 == 5213) {
                                  int i71 = 0;
                                  int k30 = GlobalStatics_10.method251(-1);
                                  GameString class94_52;
                                  if (k30 == -1) {
                                    class94_52 = GlobalStatics_6.aClass94_2331;
                                  } else {
                                    class94_52 = DummyClass25.aClass131_1624.aClass94Array1721[k30];
                                    i71 = DummyClass25.aClass131_1624
                                        .method1791(k30, 8);
                                  }
                                  class94_52 = class94_52
                                      .method1560(GlobalStatics_9.aClass94_2765,
                                          true,
                                          GlobalStatics_7.aClass94_2168);
                                  GlobalStatics_0.aClass94Array75[l++] = class94_52;
                                  GlobalStatics_9.anIntArray2929[k++] = i71;
                                  continue;
                                }
                                if (j1 == 5214) {
                                  int l30 = GlobalStatics_9.anIntArray2929[--k];
                                  GlobalStatics_2.method565((byte) 86,
                                      0x3fff & l30 >> 14, 0x3fff & l30);
                                  continue;
                                }
                                if (j1 == 5215) {
                                  int i31 = GlobalStatics_9.anIntArray2929[--k];
                                  GameString class94_53 = GlobalStatics_0.aClass94Array75[--l];
                                  boolean flag10 = false;
                                  Queue class13 = GlobalStatics_1.method1664(
                                      0x3fff & i31 >> 14, 0x3fff & i31,
                                      (byte) -118);
                                  SomethingWorldMapy class3_sub28_sub3_5 =
                                      (SomethingWorldMapy) class13.getFirst();
                                  do {
                                    if (class3_sub28_sub3_5 == null) {
                                      break;
                                    }
                                    if (class3_sub28_sub3_5.aClass94_3561
                                        .method1531(class94_53)) {
                                      flag10 = true;
                                      break;
                                    }
                                    class3_sub28_sub3_5 = (SomethingWorldMapy) class13
                                        .getNext();
                                  } while (true);
                                  if (flag10) {
                                    GlobalStatics_9.anIntArray2929[k++] = 1;
                                  } else {
                                    GlobalStatics_9.anIntArray2929[k++] = 0;
                                  }
                                  continue;
                                }
                                if (j1 == 5216) {
                                  int j31 = GlobalStatics_9.anIntArray2929[--k];
                                  GlobalStatics_10.method344(j31, 4);
                                  continue;
                                }
                                if (j1 == 5217) {
                                  int k31 = GlobalStatics_9.anIntArray2929[--k];
                                  if (GlobalStatics_9.method140(k31, 20)) {
                                    GlobalStatics_9.anIntArray2929[k++] = 1;
                                  } else {
                                    GlobalStatics_9.anIntArray2929[k++] = 0;
                                  }
                                  continue;
                                }
                                if (j1 == 5218) {
                                  SomethingWorldMapy class3_sub28_sub3_3 =
                                      GlobalStatics_2.method520((byte) -124);
                                  if (class3_sub28_sub3_3 != null) {
                                    GlobalStatics_9.anIntArray2929[k++] = class3_sub28_sub3_3.anInt3563;
                                  } else {
                                    GlobalStatics_9.anIntArray2929[k++] = -1;
                                  }
                                  continue;
                                }
                                if (j1 == 5219) {
                                  DummyClass60.method915(
                                      GlobalStatics_0.aClass94Array75[--l], -1);
                                  continue;
                                }
                                if (j1 != 5220) {
                                  break;
                                }
                                GlobalStatics_9.anIntArray2929[k++] =
                                    GlobalStatics_8.anInt2737 == 100 ? 1 : 0;
                                continue;
                              }
                              if (j1 < 5400) {
                                if (j1 == 5300) {
                                  k -= 2;
                                  int i59 = GlobalStatics_9.anIntArray2929[1
                                      + k];
                                  int l31 = GlobalStatics_9.anIntArray2929[k];
                                  GlobalStatics_9
                                      .setWindowMode(false, 3, l31, i59);
                                  GlobalStatics_9.anIntArray2929[k++] =
                                      GlobalStatics_10.fullScreenFrame != null
                                          ? 1 : 0;
                                  continue;
                                }
                                if (j1 == 5301) {
                                  if (GlobalStatics_10.fullScreenFrame
                                      != null) {
                                    GlobalStatics_9.setWindowMode(false,
                                        GlobalStatics_2.anInt2577, -1,
                                        -1);
                                  }
                                  continue;
                                }
                                if (j1 == 5302) {
                                  DisplayMode[] aclass106 = GlobalStatics_0
                                      .method88((byte) 28);
                                  GlobalStatics_9.anIntArray2929[k++] = aclass106.length;
                                  continue;
                                }
                                if (j1 == 5303) {
                                  int i32 = GlobalStatics_9.anIntArray2929[--k];
                                  DisplayMode[] aclass106_1 = GlobalStatics_0
                                      .method88((byte) 28);
                                  GlobalStatics_9.anIntArray2929[k++] = aclass106_1[i32].anInt1447;
                                  GlobalStatics_9.anIntArray2929[k++] = aclass106_1[i32].anInt1449;
                                  continue;
                                }
                                if (j1 == 5305) {
                                  int j59 = GlobalStatics_10.anInt3071;
                                  int j32 = GlobalStatics_3.anInt2378;
                                  int j71 = -1;
                                  DisplayMode[] aclass106_2 = GlobalStatics_0
                                      .method88((byte) 28);
                                  int i80 = 0;
                                  do {
                                    if (aclass106_2.length <= i80) {
                                      break;
                                    }
                                    DisplayMode class106 = aclass106_2[i80];
                                    if (j32 == class106.anInt1447
                                        && class106.anInt1449 == j59) {
                                      j71 = i80;
                                      break;
                                    }
                                    i80++;
                                  } while (true);
                                  GlobalStatics_9.anIntArray2929[k++] = j71;
                                  continue;
                                }
                                if (j1 == 5306) {
                                  GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_9
                                      .getWindowMode();
                                  continue;
                                }
                                if (j1 == 5307) {
                                  int k32 = GlobalStatics_9.anIntArray2929[--k];
                                  if (k32 < 0 || k32 > 2) {
                                    k32 = 0;
                                  }
                                  GlobalStatics_9
                                      .setWindowMode(false, k32, -1, -1);
                                  continue;
                                }
                                if (j1 == 5308) {
                                  GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_2.anInt2577;
                                  continue;
                                }
                                if (j1 != 5309) {
                                  break;
                                }
                                int l32 = GlobalStatics_9.anIntArray2929[--k];
                                if (l32 < 0 || l32 > 2) {
                                  l32 = 0;
                                }
                                GlobalStatics_2.anInt2577 = l32;
                                SettingsStatics
                                    .writeSettings(DummyClass35.signLink);
                                continue;
                              }
                              if (j1 < 5500) {
                                if (j1 == 5400) {
                                  l -= 2;
                                  GameString class94_23 = GlobalStatics_0.aClass94Array75[l];
                                  GameString class94_54 = GlobalStatics_0.aClass94Array75[
                                      l + 1];
                                  int k71 = GlobalStatics_9.anIntArray2929[--k];
                                  GlobalStatics_3.anInt1853++;
                                  GlobalStatics_9.secureBuffer.writePacket(117);
                                  GlobalStatics_9.secureBuffer.writeByte(
                                      GlobalStatics_10.getByteLength(class94_23)
                                          - (
                                          -GlobalStatics_10
                                              .getByteLength(class94_54) - 1));
                                  GlobalStatics_9.secureBuffer
                                      .writeString(class94_23);
                                  GlobalStatics_9.secureBuffer
                                      .writeString(class94_54);
                                  GlobalStatics_9.secureBuffer.writeByte(k71);
                                  continue;
                                }
                                if (j1 == 5401) {
                                  k -= 2;
                                  GlobalStatics_10.aShortArray3455[GlobalStatics_9.anIntArray2929[k]] =
                                      (short) DummyClass42.method1186(0,
                                          GlobalStatics_9.anIntArray2929[k
                                              + 1]);
                                  GlobalStatics_8.method28(true);
                                  GlobalStatics_0.method746((byte) -29);
                                  DummyClass10.method2265(0);
                                  GlobalStatics_9.method1076(88);
                                  GlobalStatics_6.method1093(false);
                                  continue;
                                }
                                if (j1 == 5405) {
                                  k -= 2;
                                  int i33 = GlobalStatics_9.anIntArray2929[k];
                                  int k59 = GlobalStatics_9.anIntArray2929[1
                                      + k];
                                  if (i33 >= 0 && i33 < 2) {
                                    DummyClass43.anIntArrayArrayArray911[i33] =
                                        new int[k59 << 1][4];
                                  }
                                  continue;
                                }
                                if (j1 == 5406) {
                                  k -= 7;
                                  int j33 = GlobalStatics_9.anIntArray2929[k];
                                  int l59 =
                                      GlobalStatics_9.anIntArray2929[1 + k]
                                          << 1;
                                  int k77 = GlobalStatics_9.anIntArray2929[k
                                      + 3];
                                  int l71 = GlobalStatics_9.anIntArray2929[2
                                      + k];
                                  int j80 = GlobalStatics_9.anIntArray2929[4
                                      + k];
                                  int j82 = GlobalStatics_9.anIntArray2929[6
                                      + k];
                                  int l81 = GlobalStatics_9.anIntArray2929[5
                                      + k];
                                  if (j33 >= 0 && j33 < 2
                                      &&
                                      DummyClass43.anIntArrayArrayArray911[j33]
                                          != null
                                      && l59 >= 0
                                      &&
                                      DummyClass43.anIntArrayArrayArray911[j33].length
                                          > l59) {
                                    DummyClass43.anIntArrayArrayArray911[j33][l59] = new int[]{
                                        ((0xfffc3b9 & l71) >> 14) * 128,
                                        k77, 128 * (l71 & 16383), j82
                                    };
                                    DummyClass43.anIntArrayArrayArray911[j33][
                                        l59 + 1] =
                                        new int[]{
                                            128 * ((j80 & 0xfffed27) >> 14),
                                            l81, 128 * (j80 & 16383)
                                        };
                                  }
                                  continue;
                                }
                                if (j1 == 5407) {
                                  int k33 =
                                      DummyClass43.anIntArrayArrayArray911[GlobalStatics_9.anIntArray2929[--k]].length
                                          >> 1;
                                  GlobalStatics_9.anIntArray2929[k++] = k33;
                                  continue;
                                }
                                if (j1 == 5411) {
                                  if (GlobalStatics_10.fullScreenFrame
                                      != null) {
                                    GlobalStatics_9.setWindowMode(false,
                                        GlobalStatics_2.anInt2577, -1,
                                        -1);
                                  }
                                  if (GlobalStatics_10.FRAME == null) {
                                    DummyClass54.method1596(
                                        GlobalStatics_10.method856(true),
                                        (byte) 126,
                                        false);
                                  } else {
                                    System.exit(0);
                                  }
                                  continue;
                                }
                                if (j1 == 5419) {
                                  GameString class94_24 = GlobalStatics_6.aClass94_2331;
                                  if (GlobalStatics_9.aClass64_1778 != null) {
                                    class94_24 =
                                        DummyClass58.method1653(
                                            GlobalStatics_9.aClass64_1778.anInt979,
                                            0);
                                    if (GlobalStatics_9.aClass64_1778.result
                                        != null) {
                                      byte[] abyte0 = null;
                                      abyte0 =
                                          ((String) GlobalStatics_9.aClass64_1778.result)
                                              .getBytes(
                                                  StandardCharsets.ISO_8859_1);
                                      class94_24 =
                                          GameStringStatics
                                              .createString(abyte0, 0,
                                                  abyte0.length);
                                    }
                                  }
                                  GlobalStatics_0.aClass94Array75[l++] = class94_24;
                                  continue;
                                }
                                if (j1 == 5420) {
                                  GlobalStatics_9.anIntArray2929[k++] =
                                      GlobalStatics_9.anInt1214 == 3 ? 1 : 0;
                                  continue;
                                }
                                if (j1 == 5421) {
                                  if (GlobalStatics_10.fullScreenFrame
                                      != null) {
                                    GlobalStatics_9.setWindowMode(false,
                                        GlobalStatics_2.anInt2577, -1,
                                        -1);
                                  }
                                  boolean flag5 =
                                      GlobalStatics_9.anIntArray2929[--k] == 1;
                                  GameString class94_25 = GlobalStatics_0.aClass94Array75[--l];
                                  GameString class94_64 = GlobalStatics_9
                                      .concat(new GameString[]{
                                          GlobalStatics_10.method856(true),
                                          class94_25
                                      });
                                  if (GlobalStatics_10.FRAME == null && (!flag5
                                      || GlobalStatics_9.anInt1214 == 3
                                      || !GlobalStatics_9.formattedOsName
                                      .startsWith("win")
                                      || GlobalStatics_7.aBoolean1451)) {
                                    DummyClass54
                                        .method1596(class94_64, (byte) 127,
                                            flag5);
                                  } else {
                                    GlobalStatics_0.aBoolean2154 = flag5;
                                    GlobalStatics_8.aClass94_3295 = class94_64;
                                    GlobalStatics_2.aClass64_351 = DummyClass35.signLink
                                        .method1452(
                                            new String(class94_64.method1568(0),
                                                StandardCharsets.ISO_8859_1),
                                            true);
                                  }
                                  continue;
                                }
                                if (j1 == 5422) {
                                  int i72 = GlobalStatics_9.anIntArray2929[--k];
                                  l -= 2;
                                  GameString class94_55 = GlobalStatics_0.aClass94Array75[
                                      1 + l];
                                  GameString class94_26 = GlobalStatics_0.aClass94Array75[l];
                                  if (class94_26.getLength() > 0) {
                                    if (GlobalStatics_8.titlePrefixes == null) {
                                      GlobalStatics_8.titlePrefixes =
                                          new GameString[GlobalStatics_10.anIntArray3218[GlobalStatics_5.gameId]];
                                    }
                                    GlobalStatics_8.titlePrefixes[i72] = class94_26;
                                  }
                                  if (class94_55.getLength() > 0) {
                                    if (GlobalStatics_11.titleSuffixes
                                        == null) {
                                      GlobalStatics_11.titleSuffixes =
                                          new GameString[GlobalStatics_10.anIntArray3218[GlobalStatics_5.gameId]];
                                    }
                                    GlobalStatics_11.titleSuffixes[i72] = class94_55;
                                  }
                                  continue;
                                }
                                if (j1 == 5423) {
                                  GlobalStatics_0.aClass94Array75[--l]
                                      .method1549(false);
                                  continue;
                                }
                                if (j1 == 5424) {
                                  k -= 11;
                                  GlobalStatics_10.anInt3600 = GlobalStatics_9.anIntArray2929[k];
                                  GlobalStatics_8.anInt963 = GlobalStatics_9.anIntArray2929[
                                      k + 1];
                                  GlobalStatics_9.anInt1926 = GlobalStatics_9.anIntArray2929[
                                      k + 2];
                                  GlobalStatics_9.anInt1771 = GlobalStatics_9.anIntArray2929[
                                      3 + k];
                                  GlobalStatics_9.anInt502 = GlobalStatics_9.anIntArray2929[
                                      4 + k];
                                  DummyClass54.anInt1400 = GlobalStatics_9.anIntArray2929[
                                      5 + k];
                                  DummyClass39.anInt739 = GlobalStatics_9.anIntArray2929[
                                      6 + k];
                                  GlobalStatics_6.anInt1126 = GlobalStatics_9.anIntArray2929[
                                      7 + k];
                                  GlobalStatics_9.anInt2937 = GlobalStatics_9.anIntArray2929[
                                      8 + k];
                                  GlobalStatics_10.anInt3351 = GlobalStatics_9.anIntArray2929[
                                      k + 9];
                                  DummyClass14.anInt1957 = GlobalStatics_9.anIntArray2929[
                                      10 + k];
                                  GlobalStatics_10.sprites
                                      .isLoaded(GlobalStatics_9.anInt502);
                                  GlobalStatics_10.sprites
                                      .isLoaded(DummyClass54.anInt1400);
                                  GlobalStatics_10.sprites
                                      .isLoaded(DummyClass39.anInt739);
                                  GlobalStatics_10.sprites
                                      .isLoaded(GlobalStatics_6.anInt1126);
                                  GlobalStatics_10.sprites
                                      .isLoaded(GlobalStatics_9.anInt2937);
                                  GlobalStatics_8.aBoolean1951 = true;
                                  continue;
                                }
                                if (j1 == 5425) {
                                  GlobalStatics_3.method165(-7878);
                                  GlobalStatics_8.aBoolean1951 = false;
                                  continue;
                                }
                                if (j1 == 5426) {
                                  DummyClass12.anInt2027 = GlobalStatics_9.anIntArray2929[--k];
                                  continue;
                                }
                                if (j1 != 5427) {
                                  break;
                                }
                                k -= 2;
                                DummyClass54.anInt1403 = GlobalStatics_9.anIntArray2929[k];
                                GlobalStatics_10.anInt1719 = GlobalStatics_9.anIntArray2929[
                                    k + 1];
                                continue;
                              }
                              if (j1 < 5600) {
                                if (j1 == 5500) {
                                  k -= 4;
                                  int l33 = GlobalStatics_9.anIntArray2929[k];
                                  int l77 = GlobalStatics_9.anIntArray2929[k
                                      + 3];
                                  int j72 = GlobalStatics_9.anIntArray2929[k
                                      + 2];
                                  int i60 = GlobalStatics_9.anIntArray2929[k
                                      + 1];
                                  GlobalStatics_10
                                      .method390(false, j72, i60, l77,
                                          (byte) -128,
                                          -GlobalStatics_9.anInt1152 + (0x3fff
                                              & l33),
                                          ((0xffffe30 & l33) >> 14)
                                              - GlobalStatics_10.anInt1716);
                                  continue;
                                }
                                if (j1 == 5501) {
                                  k -= 4;
                                  int j60 = GlobalStatics_9.anIntArray2929[1
                                      + k];
                                  int i34 = GlobalStatics_9.anIntArray2929[k];
                                  int i78 = GlobalStatics_9.anIntArray2929[k
                                      + 3];
                                  int k72 = GlobalStatics_9.anIntArray2929[k
                                      + 2];
                                  GlobalStatics_9.method2238(j60,
                                      (0x3fff & i34)
                                          - GlobalStatics_9.anInt1152, k72,
                                      -GlobalStatics_10.anInt1716 + (
                                          (0xffff221 & i34) >> 14),
                                      (byte) -21, i78);
                                  continue;
                                }
                                if (j1 == 5502) {
                                  k -= 6;
                                  int j34 = GlobalStatics_9.anIntArray2929[k];
                                  if (j34 >= 2) {
                                    throw new RuntimeException();
                                  }
                                  GlobalStatics_9.anInt1252 = j34;
                                  int k60 = GlobalStatics_9.anIntArray2929[k
                                      + 1];
                                  if (
                                      DummyClass43.anIntArrayArrayArray911[GlobalStatics_9.anInt1252].length
                                          >> 1 <= 1 + k60) {
                                    throw new RuntimeException();
                                  }
                                  GlobalStatics_7.anInt1081 = k60;
                                  DummyClass8.anInt4020 = 0;
                                  DummyClass21.anInt1759 = GlobalStatics_9.anIntArray2929[
                                      k + 2];
                                  GlobalStatics_3.anInt2383 =
                                      GlobalStatics_9.anIntArray2929[k + 3];
                                  int l72 = GlobalStatics_9.anIntArray2929[k
                                      + 4];
                                  if (l72 >= 2) {
                                    throw new RuntimeException();
                                  }
                                  GlobalStatics_10.anInt2293 = l72;
                                  int j78 = GlobalStatics_9.anIntArray2929[5
                                      + k];
                                  if (
                                      DummyClass43.anIntArrayArrayArray911[GlobalStatics_10.anInt2293].length
                                          >> 1 <= 1 + j78) {
                                    throw new RuntimeException();
                                  }
                                  DummyClass37.anInt670 = j78;
                                  GlobalStatics_9.anInt1753 = 3;
                                  continue;
                                }
                                if (j1 == 5503) {
                                  GlobalStatics_6.method560(-21556);
                                  continue;
                                }
                                if (j1 == 5504) {
                                  k -= 2;
                                  GlobalStatics_6.anInt2309 = GlobalStatics_9.anIntArray2929[k];
                                  GlobalStatics_9.anInt531 = GlobalStatics_9.anIntArray2929[
                                      k + 1];
                                  if (GlobalStatics_9.anInt1753 == 2) {
                                    GlobalStatics_10.anInt3315 = GlobalStatics_9.anInt531;
                                    DummyClass17.anInt1823 = GlobalStatics_6.anInt2309;
                                  }
                                  GlobalStatics_6.method1098((byte) -74);
                                  continue;
                                }
                                if (j1 == 5505) {
                                  GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_6.anInt2309;
                                  continue;
                                }
                                if (j1 != 5506) {
                                  break;
                                }
                                GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_9.anInt531;
                                continue;
                              }
                              if (j1 >= 5700) {
                                if (j1 < 6100) {
                                  if (j1 == 6001) {
                                    int k34 = GlobalStatics_9.anIntArray2929[--k];
                                    if (k34 < 1) {
                                      k34 = 1;
                                    }
                                    if (k34 > 4) {
                                      k34 = 4;
                                    }
                                    GlobalStatics_4.brightnessSetting = k34;
                                    if (!GlRenderer.useOpenGlRenderer
                                        || !GLStatics.useBumpMaps) {
                                      if (GlobalStatics_4.brightnessSetting
                                          == 1) {
                                        DummyClass40.updateLightness(0.9F);
                                      }
                                      if (GlobalStatics_4.brightnessSetting
                                          == 2) {
                                        DummyClass40.updateLightness(0.8F);
                                      }
                                      if (GlobalStatics_4.brightnessSetting
                                          == 3) {
                                        DummyClass40.updateLightness(0.7F);
                                      }
                                      if (GlobalStatics_4.brightnessSetting
                                          == 4) {
                                        DummyClass40.updateLightness(0.6F);
                                      }
                                    }
                                    if (GlRenderer.useOpenGlRenderer) {
                                      GlobalStatics_10.method236((byte) 64);
                                      if (!GLStatics.useBumpMaps) {
                                        DummyClass51.method1417(104);
                                      }
                                    }
                                    GlobalStatics_0.method746((byte) -29);
                                    SettingsStatics
                                        .writeSettings(DummyClass35.signLink);
                                    GlobalStatics_9.aBoolean2705 = false;
                                    continue;
                                  }
                                  if (j1 == 6002) {
                                    GlobalStatics_9.method957(
                                        GlobalStatics_9.anIntArray2929[--k]
                                            == 1);
                                    GlobalStatics_9.method139(66);
                                    DummyClass51.method1417(101);
                                    GlobalStatics_0.method792(0x8c1111);
                                    SettingsStatics
                                        .writeSettings(DummyClass35.signLink);
                                    GlobalStatics_9.aBoolean2705 = false;
                                    continue;
                                  }
                                  if (j1 == 6003) {
                                    GlobalStatics_2.aBoolean3604 =
                                        GlobalStatics_9.anIntArray2929[--k]
                                            == 1;
                                    GlobalStatics_0.method792(0x8c1111);
                                    SettingsStatics
                                        .writeSettings(DummyClass35.signLink);
                                    GlobalStatics_9.aBoolean2705 = false;
                                    continue;
                                  }
                                  if (j1 == 6005) {
                                    GlobalStatics_9.aBoolean1905 =
                                        GlobalStatics_9.anIntArray2929[--k]
                                            == 1;
                                    DummyClass51.method1417(112);
                                    SettingsStatics
                                        .writeSettings(DummyClass35.signLink);
                                    GlobalStatics_9.aBoolean2705 = false;
                                    continue;
                                  }
                                  if (j1 == 6006) {
                                    GlobalStatics_9.aBoolean488 =
                                        GlobalStatics_9.anIntArray2929[--k]
                                            == 1;
                                    ((TextureCache) GLStatics.textureCache)
                                        .method1616(
                                            !GlobalStatics_9.aBoolean488,
                                            -17830);
                                    SettingsStatics
                                        .writeSettings(DummyClass35.signLink);
                                    GlobalStatics_9.aBoolean2705 = false;
                                    continue;
                                  }
                                  if (j1 == 6007) {
                                    GlobalStatics_10.aBoolean236 =
                                        GlobalStatics_9.anIntArray2929[--k]
                                            == 1;
                                    SettingsStatics
                                        .writeSettings(DummyClass35.signLink);
                                    GlobalStatics_9.aBoolean2705 = false;
                                    continue;
                                  }
                                  if (j1 == 6008) {
                                    GlobalStatics_9.aBoolean2623 =
                                        GlobalStatics_9.anIntArray2929[--k]
                                            == 1;
                                    SettingsStatics
                                        .writeSettings(DummyClass35.signLink);
                                    GlobalStatics_9.aBoolean2705 = false;
                                    continue;
                                  }
                                  if (j1 == 6009) {
                                    GlobalStatics_9.aBoolean3275 =
                                        GlobalStatics_9.anIntArray2929[--k]
                                            == 1;
                                    SettingsStatics
                                        .writeSettings(DummyClass35.signLink);
                                    GlobalStatics_9.aBoolean2705 = false;
                                    continue;
                                  }
                                  if (j1 == 6010) {
                                    GlobalStatics_9.aBoolean2910 =
                                        GlobalStatics_9.anIntArray2929[--k]
                                            == 1;
                                    SettingsStatics
                                        .writeSettings(DummyClass35.signLink);
                                    GlobalStatics_9.aBoolean2705 = false;
                                    continue;
                                  }
                                  if (j1 == 6011) {
                                    int l34 = GlobalStatics_9.anIntArray2929[--k];
                                    if (l34 < 0 || l34 > 2) {
                                      l34 = 0;
                                    }
                                    GLStatics.anInt1137 = l34;
                                    SettingsStatics
                                        .writeSettings(DummyClass35.signLink);
                                    GlobalStatics_9.aBoolean2705 = false;
                                    continue;
                                  }
                                  if (j1 == 6012) {
                                    if (GlRenderer.useOpenGlRenderer) {
                                      GLStatics.method551(0, 0, 0);
                                    }
                                    GLStatics.useBumpMaps =
                                        GlobalStatics_9.anIntArray2929[--k]
                                            == 1;
                                    if (GlRenderer.useOpenGlRenderer
                                        && GLStatics.useBumpMaps) {
                                      DummyClass40.updateLightness(0.7F);
                                    } else {
                                      if (GlobalStatics_4.brightnessSetting
                                          == 1) {
                                        DummyClass40.updateLightness(0.9F);
                                      }
                                      if (GlobalStatics_4.brightnessSetting
                                          == 2) {
                                        DummyClass40.updateLightness(0.8F);
                                      }
                                      if (GlobalStatics_4.brightnessSetting
                                          == 3) {
                                        DummyClass40.updateLightness(0.7F);
                                      }
                                      if (GlobalStatics_4.brightnessSetting
                                          == 4) {
                                        DummyClass40.updateLightness(0.6F);
                                      }
                                    }
                                    DummyClass51.method1417(108);
                                    SettingsStatics
                                        .writeSettings(DummyClass35.signLink);
                                    GlobalStatics_9.aBoolean2705 = false;
                                    continue;
                                  }
                                  if (j1 == 6014) {
                                    GLStatics.aBoolean1685 =
                                        GlobalStatics_9.anIntArray2929[--k]
                                            == 1;
                                    if (GlRenderer.useOpenGlRenderer) {
                                      DummyClass51.method1417(109);
                                    }
                                    SettingsStatics
                                        .writeSettings(DummyClass35.signLink);
                                    GlobalStatics_9.aBoolean2705 = false;
                                    continue;
                                  }
                                  if (j1 == 6015) {
                                    DummyClass35.aBoolean661 =
                                        GlobalStatics_9.anIntArray2929[--k]
                                            == 1;
                                    if (GlRenderer.useOpenGlRenderer) {
                                      GlobalStatics_10.method236((byte) 64);
                                    }
                                    SettingsStatics
                                        .writeSettings(DummyClass35.signLink);
                                    GlobalStatics_9.aBoolean2705 = false;
                                    continue;
                                  }
                                  if (j1 == 6016) {
                                    int value = GlobalStatics_9.anIntArray2929[--k];
                                    if (GlRenderer.useOpenGlRenderer) {
                                      GlobalStatics_6.replaceCanvas = true;
                                    }
                                    if (value < 0 || value > 2) {
                                      value = 0;
                                    }
                                    System.out.printf(
                                        "Setting rendering samples %d%n",
                                        value);
                                    GlobalStatics_9.GL_RENDERING_SAMPLES = value;
                                    continue;
                                  }
                                  if (j1 == 6017) {
                                    GlobalStatics_1.aBoolean3184 =
                                        GlobalStatics_9.anIntArray2929[--k]
                                            == 1;
                                    GlobalStatics_8.method34(-32589);
                                    SettingsStatics
                                        .writeSettings(DummyClass35.signLink);
                                    GlobalStatics_9.aBoolean2705 = false;
                                    continue;
                                  }
                                  if (j1 == 6018) {
                                    int j35 = GlobalStatics_9.anIntArray2929[--k];
                                    if (j35 < 0) {
                                      j35 = 0;
                                    }
                                    if (j35 > 127) {
                                      j35 = 127;
                                    }
                                    GlobalStatics_7.anInt2453 = j35;
                                    SettingsStatics
                                        .writeSettings(DummyClass35.signLink);
                                    GlobalStatics_9.aBoolean2705 = false;
                                    continue;
                                  }
                                  if (j1 == 6019) {
                                    int k35 = GlobalStatics_9.anIntArray2929[--k];
                                    if (k35 < 0) {
                                      k35 = 0;
                                    }
                                    if (k35 > 255) {
                                      k35 = 255;
                                    }
                                    if (k35 != GlobalStatics_10.anInt120) {
                                      if (GlobalStatics_10.anInt120 == 0
                                          && GlobalStatics_4.anInt1691
                                          != -1) {
                                        GlobalStatics_9.method1285(
                                            GlobalStatics_9.fileUnpacker6,
                                            false, GlobalStatics_4.anInt1691, 0,
                                            false, k35);
                                        GlobalStatics_9.aBoolean1158 = false;
                                      } else if (k35 == 0) {
                                        GlobalStatics_9.method1870(false);
                                        GlobalStatics_9.aBoolean1158 = false;
                                      } else {
                                        GlobalStatics_0
                                            .method736(k35, 115);
                                      }
                                      GlobalStatics_10.anInt120 = k35;
                                    }
                                    SettingsStatics
                                        .writeSettings(DummyClass35.signLink);
                                    GlobalStatics_9.aBoolean2705 = false;
                                    continue;
                                  }
                                  if (j1 == 6020) {
                                    int l35 = GlobalStatics_9.anIntArray2929[--k];
                                    if (l35 < 0) {
                                      l35 = 0;
                                    }
                                    if (l35 > 127) {
                                      l35 = 127;
                                    }
                                    DummyClass28.anInt340 = l35;
                                    SettingsStatics
                                        .writeSettings(DummyClass35.signLink);
                                    GlobalStatics_9.aBoolean2705 = false;
                                    continue;
                                  }
                                  if (j1 == 6021) {
                                    GlobalStatics_7.aBoolean1084 =
                                        GlobalStatics_9.anIntArray2929[--k]
                                            == 1;
                                    GlobalStatics_0.method792(0x8c1111);
                                    continue;
                                  }
                                  if (j1 == 6023) {
                                    int i36 = GlobalStatics_9.anIntArray2929[--k];
                                    if (i36 < 0) {
                                      i36 = 0;
                                    }
                                    if (i36 > 2) {
                                      i36 = 2;
                                    }
                                    boolean flag6 = false;
                                    if (GlobalStatics_6.anInt3492 < 96) {
                                      flag6 = true;
                                      i36 = 0;
                                    }
                                    DummyClass0.method1758(i36);
                                    SettingsStatics
                                        .writeSettings(DummyClass35.signLink);
                                    GlobalStatics_9.aBoolean2705 = false;
                                    GlobalStatics_9.anIntArray2929[k++] =
                                        flag6 ? 0 : 1;
                                    continue;
                                  }
                                  if (j1 == 6024) {
                                    int value = GlobalStatics_9.anIntArray2929[--k];
                                    if (value < 0 || value > 2) {
                                      value = 0;
                                    }
                                    GlobalStatics_9.RENDERING_SAMPLES = value;
                                    SettingsStatics
                                        .writeSettings(DummyClass35.signLink);
                                    continue;
                                  }
                                  if (j1 != 6028) {
                                    break;
                                  }
                                  DummyClass4.aBoolean3004 =
                                      GlobalStatics_9.anIntArray2929[--k] != 0;
                                  SettingsStatics
                                      .writeSettings(DummyClass35.signLink);
                                  continue;
                                }
                                if (j1 < 6200) {
                                  if (j1 == 6101) {
                                    GlobalStatics_9.anIntArray2929[k++] =
                                        GlobalStatics_4.brightnessSetting;
                                    continue;
                                  }
                                  if (j1 == 6102) {
                                    GlobalStatics_9.anIntArray2929[k++] =
                                        GlobalStatics_9.method1986(109) ? 1 : 0;
                                    continue;
                                  }
                                  if (j1 == 6103) {
                                    GlobalStatics_9.anIntArray2929[k++] =
                                        GlobalStatics_2.aBoolean3604 ? 1 : 0;
                                    continue;
                                  }
                                  if (j1 == 6105) {
                                    GlobalStatics_9.anIntArray2929[k++] =
                                        GlobalStatics_9.aBoolean1905 ? 1 : 0;
                                    continue;
                                  }
                                  if (j1 == 6106) {
                                    GlobalStatics_9.anIntArray2929[k++] =
                                        GlobalStatics_9.aBoolean488 ? 1 : 0;
                                    continue;
                                  }
                                  if (j1 == 6107) {
                                    GlobalStatics_9.anIntArray2929[k++] =
                                        GlobalStatics_10.aBoolean236 ? 1 : 0;
                                    continue;
                                  }
                                  if (j1 == 6108) {
                                    GlobalStatics_9.anIntArray2929[k++] =
                                        GlobalStatics_9.aBoolean2623 ? 1 : 0;
                                    continue;
                                  }
                                  if (j1 == 6109) {
                                    GlobalStatics_9.anIntArray2929[k++] =
                                        GlobalStatics_9.aBoolean3275 ? 1 : 0;
                                    continue;
                                  }
                                  if (j1 == 6110) {
                                    GlobalStatics_9.anIntArray2929[k++] =
                                        GlobalStatics_9.aBoolean2910 ? 1 : 0;
                                    continue;
                                  }
                                  if (j1 == 6111) {
                                    GlobalStatics_9.anIntArray2929[k++] = GLStatics.anInt1137;
                                    continue;
                                  }
                                  if (j1 == 6112) {
                                    GlobalStatics_9.anIntArray2929[k++] =
                                        GLStatics.useBumpMaps ? 1 : 0;
                                    continue;
                                  }
                                  if (j1 == 6114) {
                                    GlobalStatics_9.anIntArray2929[k++] =
                                        GLStatics.aBoolean1685 ? 1 : 0;
                                    continue;
                                  }
                                  if (j1 == 6115) {
                                    GlobalStatics_9.anIntArray2929[k++] =
                                        DummyClass35.aBoolean661 ? 1 : 0;
                                    continue;
                                  }
                                  if (j1 == 6116) {
                                    GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_9.GL_RENDERING_SAMPLES;
                                    continue;
                                  }
                                  if (j1 == 6117) {
                                    GlobalStatics_9.anIntArray2929[k++] =
                                        GlobalStatics_1.aBoolean3184 ? 1 : 0;
                                    continue;
                                  }
                                  if (j1 == 6118) {
                                    GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_7.anInt2453;
                                    continue;
                                  }
                                  if (j1 == 6119) {
                                    GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_10.anInt120;
                                    continue;
                                  }
                                  if (j1 == 6120) {
                                    GlobalStatics_9.anIntArray2929[k++] = DummyClass28.anInt340;
                                    continue;
                                  }
                                  if (j1 == 6121) {
                                    if (GlRenderer.useOpenGlRenderer) {
                                      GlobalStatics_9.anIntArray2929[k++] =
                                          GlRenderer.multiSampleSupport ? 1 : 0;
                                    } else {
                                      GlobalStatics_9.anIntArray2929[k++] = 0;
                                    }
                                    continue;
                                  }
                                  if (j1 == 6123) {
                                    GlobalStatics_9.anIntArray2929[k++] = DummyClass0
                                        .method1757();
                                    continue;
                                  }
                                  if (j1 == 6124) {
                                    GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_9.RENDERING_SAMPLES;
                                    continue;
                                  }
                                  if (j1 != 6128) {
                                    break;
                                  }
                                  GlobalStatics_9.anIntArray2929[k++] =
                                      DummyClass4.aBoolean3004 ? 1 : 0;
                                  continue;
                                }
                                if (j1 >= 6300) {
                                  if (j1 < 6400) {
                                    if (j1 == 6300) {
                                      GlobalStatics_9.anIntArray2929[k++] =
                                          (int) (GlobalStatics_10
                                              .getCurrentTimeMillis() / 60000L);
                                      continue;
                                    }
                                    if (j1 == 6301) {
                                      GlobalStatics_9.anIntArray2929[k++] =
                                          -11745 + (int) (GlobalStatics_10
                                              .getCurrentTimeMillis()
                                              / 0x5265c00L);
                                      continue;
                                    }
                                    if (j1 == 6302) {
                                      k -= 3;
                                      int i73 = GlobalStatics_9.anIntArray2929[k
                                          + 2];
                                      int l60 = GlobalStatics_9.anIntArray2929[k
                                          + 1];
                                      int k36 = GlobalStatics_9.anIntArray2929[k];
                                      GlobalStatics_9.aCalendar3616.clear();
                                      GlobalStatics_9.aCalendar3616.set(11, 12);
                                      GlobalStatics_9.aCalendar3616
                                          .set(i73, l60, k36);
                                      GlobalStatics_9.anIntArray2929[k++] =
                                          -11745 + (int) (
                                              GlobalStatics_9.aCalendar3616
                                                  .getTime().getTime()
                                                  / 0x5265c00L);
                                      continue;
                                    }
                                    if (j1 == 6303) {
                                      GlobalStatics_9.aCalendar3616.clear();
                                      GlobalStatics_9.aCalendar3616.setTime(
                                          new Date(GlobalStatics_10
                                              .getCurrentTimeMillis()));
                                      GlobalStatics_9.anIntArray2929[k++] =
                                          GlobalStatics_9.aCalendar3616.get(1);
                                      continue;
                                    }
                                    if (j1 != 6304) {
                                      break;
                                    }
                                    boolean flag7 = true;
                                    int l36 = GlobalStatics_9.anIntArray2929[--k];
                                    if (l36 >= 0) {
                                      if (l36 >= 1582) {
                                        if (l36 % 4 == 0) {
                                          if (l36 % 100 != 0) {
                                            flag7 = true;
                                          } else if (l36 % 400 != 0) {
                                            flag7 = false;
                                          }
                                        } else {
                                          flag7 = false;
                                        }
                                      } else {
                                        flag7 = l36 % 4 == 0;
                                      }
                                    } else {
                                      flag7 = (1 + l36) % 4 == 0;
                                    }
                                    GlobalStatics_9.anIntArray2929[k++] =
                                        flag7 ? 1 : 0;
                                    continue;
                                  }
                                  if (j1 >= 6500) {
                                    if (j1 < 6600) {
                                      if (j1 == 6500) {
                                        if (DummyClass15.state != 10
                                            || GlobalStatics_9.anInt3375 != 0
                                            || GlobalStatics_10.loginState != 0
                                            || GlobalStatics_0.anInt23 != 0) {
                                          GlobalStatics_9.anIntArray2929[k++] = 1;
                                        } else {
                                          GlobalStatics_9.anIntArray2929[k++] =
                                              GlobalStatics_6.method1735(29984)
                                                  == -1 ? 0 : 1;
                                        }
                                        continue;
                                      }
                                      if (j1 == 6501) {
                                        GameWorld class44_sub1 =
                                            GlobalStatics_9
                                                .method1953((byte) 124);
                                        if (class44_sub1 == null) {
                                          GlobalStatics_9.anIntArray2929[k++] = -1;
                                          GlobalStatics_9.anIntArray2929[k++] = 0;
                                          GlobalStatics_0.aClass94Array75[l++] = GlobalStatics_6.aClass94_2331;
                                          GlobalStatics_9.anIntArray2929[k++] = 0;
                                          GlobalStatics_0.aClass94Array75[l++] = GlobalStatics_6.aClass94_2331;
                                          GlobalStatics_9.anIntArray2929[k++] = 0;
                                        } else {
                                          GlobalStatics_9.anIntArray2929[k++] = class44_sub1.anInt2621;
                                          GlobalStatics_9.anIntArray2929[k++] = class44_sub1.flags;
                                          GlobalStatics_0.aClass94Array75[l++] = class44_sub1.aClass94_2620;
                                          GameWorldSomething class26 = class44_sub1
                                              .method1078(60);
                                          GlobalStatics_9.anIntArray2929[k++] = class26.anInt507;
                                          GlobalStatics_0.aClass94Array75[l++] = class26.aClass94_508;
                                          GlobalStatics_9.anIntArray2929[k++] = class44_sub1.anInt722;
                                        }
                                        continue;
                                      }
                                      if (j1 == 6502) {
                                        GameWorld class44_sub1_1 = GlobalStatics_11
                                            .method1107(
                                                5422);
                                        if (class44_sub1_1 == null) {
                                          GlobalStatics_9.anIntArray2929[k++] = -1;
                                          GlobalStatics_9.anIntArray2929[k++] = 0;
                                          GlobalStatics_0.aClass94Array75[l++] = GlobalStatics_6.aClass94_2331;
                                          GlobalStatics_9.anIntArray2929[k++] = 0;
                                          GlobalStatics_0.aClass94Array75[l++] = GlobalStatics_6.aClass94_2331;
                                          GlobalStatics_9.anIntArray2929[k++] = 0;
                                        } else {
                                          GlobalStatics_9.anIntArray2929[k++] = class44_sub1_1.anInt2621;
                                          GlobalStatics_9.anIntArray2929[k++] = class44_sub1_1.flags;
                                          GlobalStatics_0.aClass94Array75[l++] = class44_sub1_1.aClass94_2620;
                                          GameWorldSomething class26_1 =
                                              class44_sub1_1.method1078(70);
                                          GlobalStatics_9.anIntArray2929[k++] = class26_1.anInt507;
                                          GlobalStatics_0.aClass94Array75[l++] = class26_1.aClass94_508;
                                          GlobalStatics_9.anIntArray2929[k++] = class44_sub1_1.anInt722;
                                        }
                                        continue;
                                      }
                                      if (j1 == 6503) {
                                        int i37 = GlobalStatics_9.anIntArray2929[--k];
                                        if (DummyClass15.state != 10
                                            || GlobalStatics_9.anInt3375 != 0
                                            || GlobalStatics_10.loginState != 0
                                            || GlobalStatics_0.anInt23 != 0) {
                                          GlobalStatics_9.anIntArray2929[k++] = 0;
                                        } else {
                                          GlobalStatics_9.anIntArray2929[k++] =
                                              MaterialShader5
                                                  .method1627(i37, (byte) -7)
                                                  ? 1 : 0;
                                        }
                                        continue;
                                      }
                                      if (j1 == 6504) {
                                        GlobalStatics_0.anInt2148 = GlobalStatics_9.anIntArray2929[--k];
                                        SettingsStatics.writeSettings(
                                            DummyClass35.signLink);
                                        continue;
                                      }
                                      if (j1 == 6505) {
                                        GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_0.anInt2148;
                                        continue;
                                      }
                                      if (j1 == 6506) {
                                        int j37 = GlobalStatics_9.anIntArray2929[--k];
                                        GameWorld class44_sub1_2 =
                                            GlobalStatics_6.method130(120, j37);
                                        if (class44_sub1_2 != null) {
                                          GlobalStatics_9.anIntArray2929[k++] = class44_sub1_2.flags;
                                          GlobalStatics_0.aClass94Array75[l++] = class44_sub1_2.aClass94_2620;
                                          GameWorldSomething class26_2 =
                                              class44_sub1_2.method1078(-87);
                                          GlobalStatics_9.anIntArray2929[k++] = class26_2.anInt507;
                                          GlobalStatics_0.aClass94Array75[l++] = class26_2.aClass94_508;
                                          GlobalStatics_9.anIntArray2929[k++] = class44_sub1_2.anInt722;
                                        } else {
                                          GlobalStatics_9.anIntArray2929[k++] = -1;
                                          GlobalStatics_0.aClass94Array75[l++] = GlobalStatics_6.aClass94_2331;
                                          GlobalStatics_9.anIntArray2929[k++] = 0;
                                          GlobalStatics_0.aClass94Array75[l++] = GlobalStatics_6.aClass94_2331;
                                          GlobalStatics_9.anIntArray2929[k++] = 0;
                                        }
                                        continue;
                                      }
                                      if (j1 != 6507) {
                                        break;
                                      }
                                      k -= 4;
                                      int j73 = GlobalStatics_9.anIntArray2929[k
                                          + 2];
                                      int k37 = GlobalStatics_9.anIntArray2929[k];
                                      boolean flag11 =
                                          GlobalStatics_9.anIntArray2929[k + 3]
                                              == 1;
                                      boolean flag8 =
                                          GlobalStatics_9.anIntArray2929[1 + k]
                                              == 1;
                                      DummyClass21
                                          .method1808(j73, flag8, (byte) 30,
                                              k37, flag11);
                                      continue;
                                    }
                                    if (j1 >= 6700) {
                                      break;
                                    }
                                    if (j1 == 6600) {
                                      GlobalStatics_2.aBoolean346 =
                                          GlobalStatics_9.anIntArray2929[--k]
                                              == 1;
                                      SettingsStatics
                                          .writeSettings(DummyClass35.signLink);
                                      continue;
                                    }
                                    if (j1 != 6601) {
                                      break;
                                    }
                                    GlobalStatics_9.anIntArray2929[k++] =
                                        GlobalStatics_2.aBoolean346 ? 1 : 0;
                                    continue;
                                  }
                                  if (j1 == 6405) {
                                    GlobalStatics_9.anIntArray2929[k++] =
                                        GlobalStatics_6.method1088(false) ? 1
                                            : 0;
                                    continue;
                                  }
                                  if (j1 != 6406) {
                                    break;
                                  }
                                  GlobalStatics_9.anIntArray2929[k++] =
                                      DummyClass13.method2194(255) ? 1 : 0;
                                  continue;
                                }
                                if (j1 == 6200) {
                                  k -= 2;
                                  GlobalStatics_7.aShort1444 = (short) GlobalStatics_9.anIntArray2929[k];
                                  if (GlobalStatics_7.aShort1444 <= 0) {
                                    GlobalStatics_7.aShort1444 = 256;
                                  }
                                  GlobalStatics_10.aShort3052 =
                                      (short) GlobalStatics_9.anIntArray2929[1
                                          + k];
                                  if (GlobalStatics_10.aShort3052 <= 0) {
                                    GlobalStatics_10.aShort3052 = 205;
                                  }
                                  continue;
                                }
                                if (j1 == 6201) {
                                  k -= 2;
                                  GlobalStatics_11.aShort46 = (short) GlobalStatics_9.anIntArray2929[k];
                                  if (GlobalStatics_11.aShort46 <= 0) {
                                    GlobalStatics_11.aShort46 = 256;
                                  }
                                  GlobalStatics_8.aShort1535 =
                                      (short) GlobalStatics_9.anIntArray2929[1
                                          + k];
                                  if (GlobalStatics_8.aShort1535 <= 0) {
                                    GlobalStatics_8.aShort1535 = 320;
                                  }
                                  continue;
                                }
                                if (j1 == 6202) {
                                  k -= 4;
                                  GlobalStatics_9.aShort3241 = (short) GlobalStatics_9.anIntArray2929[k];
                                  if (GlobalStatics_9.aShort3241 <= 0) {
                                    GlobalStatics_9.aShort3241 = 1;
                                  }
                                  DummyClass18.aShort83 = (short) GlobalStatics_9.anIntArray2929[
                                      1 + k];
                                  if (DummyClass18.aShort83 > 0) {
                                    if (GlobalStatics_9.aShort3241
                                        > DummyClass18.aShort83) {
                                      DummyClass18.aShort83 = GlobalStatics_9.aShort3241;
                                    }
                                  } else {
                                    DummyClass18.aShort83 = 32767;
                                  }
                                  GlobalStatics_9.aShort505 =
                                      (short) GlobalStatics_9.anIntArray2929[2
                                          + k];
                                  if (GlobalStatics_9.aShort505 <= 0) {
                                    GlobalStatics_9.aShort505 = 1;
                                  }
                                  GlobalStatics_10.aShort4038 =
                                      (short) GlobalStatics_9.anIntArray2929[k
                                          + 3];
                                  if (GlobalStatics_10.aShort4038 > 0) {
                                    if (GlobalStatics_10.aShort4038
                                        < GlobalStatics_9.aShort505) {
                                      GlobalStatics_10.aShort4038 = GlobalStatics_9.aShort505;
                                    }
                                  } else {
                                    GlobalStatics_10.aShort4038 = 32767;
                                  }
                                  continue;
                                }
                                if (j1 == 6203) {
                                  DummyClass45.method1239(
                                      GlobalStatics_8.aClass11_2091.anInt168,
                                      81,
                                      0, GlobalStatics_8.aClass11_2091.anInt193,
                                      0, false);
                                  GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_9.anInt1358;
                                  GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_8.anInt31;
                                  continue;
                                }
                                if (j1 == 6204) {
                                  GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_11.aShort46;
                                  GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_8.aShort1535;
                                  continue;
                                }
                                if (j1 != 6205) {
                                  break;
                                }
                                GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_7.aShort1444;
                                GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_10.aShort3052;
                                continue;
                              }
                              if (j1 == 5600) {
                                l -= 2;
                                GameString class94_27 = GlobalStatics_0.aClass94Array75[l];
                                GameString class94_56 = GlobalStatics_0.aClass94Array75[
                                    l + 1];
                                int k73 = GlobalStatics_9.anIntArray2929[--k];
                                if (DummyClass15.state == 10
                                    && GlobalStatics_9.anInt3375 == 0
                                    && GlobalStatics_10.loginState == 0
                                    && GlobalStatics_0.anInt23 == 0 &&
                                    GLStatics.anInt692 == 0) {
                                  GlobalStatics_10
                                      .method1793(class94_27, class94_56, k73,
                                          (byte) -38);
                                }
                                continue;
                              }
                              if (j1 == 5601) {
                                DummyClass31.method1681(-1);
                                continue;
                              }
                              if (j1 == 5602) {
                                if (GlobalStatics_10.loginState == 0) {
                                  GlobalStatics_5.loginResponse = -2;
                                }
                                continue;
                              }
                              if (j1 == 5603) {
                                k -= 4;
                                if (DummyClass15.state == 10 &&
                                    GlobalStatics_9.anInt3375 == 0
                                    && GlobalStatics_10.loginState == 0
                                    && GlobalStatics_0.anInt23 == 0
                                    && GLStatics.anInt692 == 0) {
                                  GlobalStatics_7.method377(
                                      GlobalStatics_9.anIntArray2929[k + 2],
                                      GlobalStatics_9.anIntArray2929[k + 3],
                                      GlobalStatics_9.anIntArray2929[k],
                                      GlobalStatics_9.anIntArray2929[k + 1], 1);
                                }
                                continue;
                              }
                              if (j1 == 5604) {
                                l--;
                                if (DummyClass15.state == 10
                                    && GlobalStatics_9.anInt3375 == 0
                                    && GlobalStatics_10.loginState == 0
                                    && GlobalStatics_0.anInt23 == 0
                                    && GLStatics.anInt692 == 0) {
                                  DummyClass59.method1041(
                                      GlobalStatics_0.aClass94Array75[l]
                                          .toBase37(),
                                      -28236);
                                }
                                continue;
                              }
                              if (j1 == 5605) {
                                k -= 4;
                                l -= 2;
                                if (DummyClass15.state == 10 &&
                                    GlobalStatics_9.anInt3375 == 0
                                    && GlobalStatics_10.loginState == 0
                                    && GlobalStatics_0.anInt23 == 0
                                    && GLStatics.anInt692 == 0) {
                                  GlobalStatics_10.createIndexedColorSprite(
                                      GlobalStatics_9.anIntArray2929[k], 10603,
                                      GlobalStatics_9.anIntArray2929[k + 3],
                                      GlobalStatics_9.anIntArray2929[1 + k],
                                      GlobalStatics_0.aClass94Array75[1 + l],
                                      GlobalStatics_0.aClass94Array75[l]
                                          .toBase37(),
                                      GlobalStatics_9.anIntArray2929[2 + k]);
                                }
                                continue;
                              }
                              if (j1 == 5606) {
                                if (GlobalStatics_0.anInt23 == 0) {
                                  GlobalStatics_0.anInt1711 = -2;
                                }
                                continue;
                              }
                              if (j1 == 5607) {
                                GlobalStatics_9.anIntArray2929[k++] =
                                    GlobalStatics_5.loginResponse;
                                continue;
                              }
                              if (j1 == 5608) {
                                GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_10.anInt3413;
                                continue;
                              }
                              if (j1 == 5609) {
                                GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_0.anInt1711;
                                continue;
                              }
                              if (j1 == 5610) {
                                for (int l37 = 0; l37 < 5; l37++) {
                                  GlobalStatics_0.aClass94Array75[l++] =
                                      GlobalStatics_10.aClass94Array3391.length
                                          <= l37 ?
                                          GlobalStatics_6.aClass94_2331 :
                                          GlobalStatics_10.aClass94Array3391[l37]
                                              .formatName(
                                                  (byte) -50);
                                }

                                GlobalStatics_10.aClass94Array3391 = null;
                                continue;
                              }
                              if (j1 != 5611) {
                                break;
                              }
                              GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_9.anInt2561;
                              continue;
                            }
                            if (j1 != 4500) {
                              break;
                            }
                            k -= 2;
                            int i38 = GlobalStatics_9.anIntArray2929[k];
                            int i61 = GlobalStatics_9.anIntArray2929[k + 1];
                            Parameter class3_sub28_sub9_1 = GlobalStatics_0
                                .method1210(64, i61);
                            if (class3_sub28_sub9_1.method585(0)) {
                              GlobalStatics_0.aClass94Array75[l++] = GlobalStatics_9
                                  .method1292((byte) 31, i38)
                                  .method604(class3_sub28_sub9_1.aClass94_3619,
                                      (byte) -44, i61);
                            } else {
                              GlobalStatics_9.anIntArray2929[k++] =
                                  GlobalStatics_9.method1292((byte) 94, i38)
                                      .method600(i61,
                                          class3_sub28_sub9_1.anInt3614,
                                          (byte) -29);
                            }
                            continue;
                          }
                          if (j1 != 4400) {
                            break;
                          }
                          k -= 2;
                          int j61 = GlobalStatics_9.anIntArray2929[k + 1];
                          int j38 = GlobalStatics_9.anIntArray2929[k];
                          Parameter class3_sub28_sub9_2 = GlobalStatics_0
                              .method1210(64, j61);
                          if (class3_sub28_sub9_2.method585(0)) {
                            GlobalStatics_0.aClass94Array75[l++] = DummyClass11
                                .method2207(4, j38)
                                .method1698(class3_sub28_sub9_2.aClass94_3619,
                                    -23085, j61);
                          } else {
                            GlobalStatics_9.anIntArray2929[k++] = DummyClass11
                                .method2207(4, j38)
                                .method1691(class3_sub28_sub9_2.anInt3614, j61,
                                    (byte) 105);
                          }
                          continue;
                        }
                        if (j1 == 4200) {
                          int k38 = GlobalStatics_9.anIntArray2929[--k];
                          GlobalStatics_0.aClass94Array75[l++] =
                              DummyClass35
                                  .getItemConfig(k38, (byte) 72).aClass94_770;
                          continue;
                        }
                        if (j1 == 4201) {
                          k -= 2;
                          int l38 = GlobalStatics_9.anIntArray2929[k];
                          int k61 = GlobalStatics_9.anIntArray2929[k + 1];
                          ItemConfig class48_2 = DummyClass35
                              .getItemConfig(l38, (byte) 77);
                          if (k61 < 1 || k61 > 5
                              || class48_2.aClass94Array801[-1 + k61] == null) {
                            GlobalStatics_0.aClass94Array75[l++] = GlobalStatics_6.aClass94_2331;
                          } else {
                            GlobalStatics_0.aClass94Array75[l++] = class48_2.aClass94Array801[
                                k61 - 1];
                          }
                          continue;
                        }
                        if (j1 == 4202) {
                          k -= 2;
                          int i39 = GlobalStatics_9.anIntArray2929[k];
                          int l61 = GlobalStatics_9.anIntArray2929[k + 1];
                          ItemConfig class48_3 = DummyClass35
                              .getItemConfig(i39, (byte) 70);
                          if (l61 >= 1 && l61 <= 5 &&
                              class48_3.inventoryOptions[l61
                                  - 1] != null) {
                            GlobalStatics_0.aClass94Array75[l++] = class48_3.inventoryOptions[
                                -1 + l61];
                          } else {
                            GlobalStatics_0.aClass94Array75[l++] = GlobalStatics_6.aClass94_2331;
                          }
                          continue;
                        }
                        if (j1 == 4203) {
                          int j39 = GlobalStatics_9.anIntArray2929[--k];
                          GlobalStatics_9.anIntArray2929[k++] =
                              DummyClass35
                                  .getItemConfig(j39, (byte) 85).anInt757;
                          continue;
                        }
                        if (j1 == 4204) {
                          int k39 = GlobalStatics_9.anIntArray2929[--k];
                          GlobalStatics_9.anIntArray2929[k++] =
                              DummyClass35
                                  .getItemConfig(k39, (byte) 99).anInt764 == 1
                                  ? 1 : 0;
                          continue;
                        }
                        if (j1 == 4205) {
                          int l39 = GlobalStatics_9.anIntArray2929[--k];
                          ItemConfig class48 = DummyClass35
                              .getItemConfig(l39, (byte) 96);
                          if (class48.anInt791 == -1 && class48.anInt789
                              >= 0) {
                            GlobalStatics_9.anIntArray2929[k++] = class48.anInt789;
                          } else {
                            GlobalStatics_9.anIntArray2929[k++] = l39;
                          }
                          continue;
                        }
                        if (j1 == 4206) {
                          int i40 = GlobalStatics_9.anIntArray2929[--k];
                          ItemConfig class48_1 = DummyClass35
                              .getItemConfig(i40, (byte) 126);
                          if (class48_1.anInt791 >= 0 && class48_1.anInt789
                              >= 0) {
                            GlobalStatics_9.anIntArray2929[k++] = class48_1.anInt789;
                          } else {
                            GlobalStatics_9.anIntArray2929[k++] = i40;
                          }
                          continue;
                        }
                        if (j1 == 4207) {
                          int j40 = GlobalStatics_9.anIntArray2929[--k];
                          GlobalStatics_9.anIntArray2929[k++] =
                              DummyClass35
                                  .getItemConfig(j40, (byte) 121).aBoolean779
                                  ? 1 : 0;
                          continue;
                        }
                        if (j1 == 4208) {
                          k -= 2;
                          int k40 = GlobalStatics_9.anIntArray2929[k];
                          int i62 = GlobalStatics_9.anIntArray2929[k + 1];
                          Parameter class3_sub28_sub9_3 = GlobalStatics_0
                              .method1210(64, i62);
                          if (class3_sub28_sub9_3.method585(0)) {
                            GlobalStatics_0.aClass94Array75[l++] = DummyClass35
                                .getItemConfig(k40, (byte) 126)
                                .method1105(107,
                                    class3_sub28_sub9_3.aClass94_3619, i62);
                          } else {
                            GlobalStatics_9.anIntArray2929[k++] =
                                DummyClass35.getItemConfig(k40, (byte) 79)
                                    .method1115(class3_sub28_sub9_3.anInt3614,
                                        -119, i62);
                          }
                          continue;
                        }
                        if (j1 == 4210) {
                          GameString class94_28 = GlobalStatics_0.aClass94Array75[--l];
                          int j62 = GlobalStatics_9.anIntArray2929[--k];
                          GlobalStatics_9
                              .method1480(j62 == 1, class94_28, 102);
                          GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_8.anInt952;
                          continue;
                        }
                        if (j1 == 4211) {
                          if (DummyClass54.aShortArray1398 == null
                              || GlobalStatics_9.anInt2756
                              >= GlobalStatics_8.anInt952) {
                            GlobalStatics_9.anIntArray2929[k++] = -1;
                          } else {
                            int var0 = DummyClass54.aShortArray1398[GlobalStatics_9.anInt2756++];
                            GlobalStatics_9.anIntArray2929[k++] =
                                var0 & 65535;
                          }
                          continue;
                        }
                        if (j1 != 4212) {
                          break;
                        }
                        GlobalStatics_9.anInt2756 = 0;
                        continue;
                      }
                      if (j1 == 4100) {
                        GameString class94_29 = GlobalStatics_0.aClass94Array75[--l];
                        int k62 = GlobalStatics_9.anIntArray2929[--k];
                        GlobalStatics_0.aClass94Array75[l++] = GlobalStatics_9
                            .concat(new GameString[]{
                                class94_29, GlobalStatics_9.toString(k62)
                            });
                        continue;
                      }
                      if (j1 == 4101) {
                        l -= 2;
                        GameString class94_57 = GlobalStatics_0.aClass94Array75[
                            l + 1];
                        GameString class94_30 = GlobalStatics_0.aClass94Array75[l];
                        GlobalStatics_0.aClass94Array75[l++] = GlobalStatics_9
                            .concat(new GameString[]{
                                class94_30, class94_57
                            });
                        continue;
                      }
                      if (j1 == 4102) {
                        GameString class94_31 = GlobalStatics_0.aClass94Array75[--l];
                        int l62 = GlobalStatics_9.anIntArray2929[--k];
                        GlobalStatics_0.aClass94Array75[l++] = GlobalStatics_9
                            .concat(new GameString[]{
                                class94_31,
                                GlobalStatics_0.method1218(true, 127, l62)
                            });
                        continue;
                      }
                      if (j1 == 4103) {
                        GameString class94_32 = GlobalStatics_0.aClass94Array75[--l];
                        GlobalStatics_0.aClass94Array75[l++] = class94_32
                            .method1534();
                        continue;
                      }
                      if (j1 == 4104) {
                        int l40 = GlobalStatics_9.anIntArray2929[--k];
                        long l63 = 0xec44e2dc00L + l40 * 0x5265c00L;
                        GlobalStatics_9.aCalendar3616.setTime(new Date(l63));
                        int k78 = GlobalStatics_9.aCalendar3616.get(5);
                        int k80 = GlobalStatics_9.aCalendar3616.get(2);
                        int i82 = GlobalStatics_9.aCalendar3616.get(1);
                        GlobalStatics_0.aClass94Array75[l++] = GlobalStatics_9
                            .concat(new GameString[]{
                                GlobalStatics_9.toString(k78),
                                GlobalStatics_9.aClass94_1326,
                                GlobalStatics_9.aClass94Array358[k80],
                                GlobalStatics_9.aClass94_1326,
                                GlobalStatics_9.toString(i82)
                            });
                        continue;
                      }
                      if (j1 == 4105) {
                        l -= 2;
                        GameString class94_58 = GlobalStatics_0.aClass94Array75[
                            l + 1];
                        GameString class94_33 = GlobalStatics_0.aClass94Array75[l];
                        if (GlobalStatics_9.localPlayer.appearance == null
                            || !GlobalStatics_9.localPlayer.appearance.aBoolean864) {
                          GlobalStatics_0.aClass94Array75[l++] = class94_33;
                        } else {
                          GlobalStatics_0.aClass94Array75[l++] = class94_58;
                        }
                        continue;
                      }
                      if (j1 == 4106) {
                        int i41 = GlobalStatics_9.anIntArray2929[--k];
                        GlobalStatics_0.aClass94Array75[l++] = GlobalStatics_9
                            .toString(i41);
                        continue;
                      }
                      if (j1 == 4107) {
                        l -= 2;
                        GlobalStatics_9.anIntArray2929[k++] =
                            GlobalStatics_0.aClass94Array75[l]
                                .method1546((byte) -63,
                                    GlobalStatics_0.aClass94Array75[l + 1]);
                        continue;
                      }
                      if (j1 == 4108) {
                        GameString class94_34 = GlobalStatics_0.aClass94Array75[--l];
                        k -= 2;
                        int l73 = GlobalStatics_9.anIntArray2929[k + 1];
                        int i63 = GlobalStatics_9.anIntArray2929[k];
                        GlobalStatics_9.anIntArray2929[k++] =
                            GlobalStatics_0
                                .method1430(-28922, l73)
                                .method684(class94_34, i63);
                        continue;
                      }
                      if (j1 == 4109) {
                        k -= 2;
                        GameString class94_35 = GlobalStatics_0.aClass94Array75[--l];
                        int i74 = GlobalStatics_9.anIntArray2929[1 + k];
                        int j63 = GlobalStatics_9.anIntArray2929[k];
                        GlobalStatics_9.anIntArray2929[k++] =
                            GlobalStatics_0
                                .method1430(-28922, i74)
                                .method680(class94_35, j63);
                        continue;
                      }
                      if (j1 == 4110) {
                        l -= 2;
                        GameString class94_36 = GlobalStatics_0.aClass94Array75[l];
                        GameString class94_59 = GlobalStatics_0.aClass94Array75[
                            l + 1];
                        if (GlobalStatics_9.anIntArray2929[--k] == 1) {
                          GlobalStatics_0.aClass94Array75[l++] = class94_36;
                        } else {
                          GlobalStatics_0.aClass94Array75[l++] = class94_59;
                        }
                        continue;
                      }
                      if (j1 == 4111) {
                        GameString class94_37 = GlobalStatics_0.aClass94Array75[--l];
                        GlobalStatics_0.aClass94Array75[l++] = GlobalStatics_4
                            .otherFormat(class94_37);
                        continue;
                      }
                      if (j1 == 4112) {
                        GameString class94_38 = GlobalStatics_0.aClass94Array75[--l];
                        int k63 = GlobalStatics_9.anIntArray2929[--k];
                        if (k63 == -1) {
                          throw new RuntimeException("null char");
                        }
                        GlobalStatics_0.aClass94Array75[l++] = class94_38
                            .method1548(false, k63);
                        continue;
                      }
                      if (j1 == 4113) {
                        int j41 = GlobalStatics_9.anIntArray2929[--k];
                        GlobalStatics_9.anIntArray2929[k++] =
                            GlobalStatics_9.method2248(-157, j41) ? 1 : 0;
                        continue;
                      }
                      if (j1 == 4114) {
                        int k41 = GlobalStatics_9.anIntArray2929[--k];
                        GlobalStatics_9.anIntArray2929[k++] =
                            GlobalStatics_4.method1066(k41, -32) ? 1 : 0;
                        continue;
                      }
                      if (j1 == 4115) {
                        int l41 = GlobalStatics_9.anIntArray2929[--k];
                        GlobalStatics_9.anIntArray2929[k++] =
                            GlobalStatics_6.method487(l41, (byte) -85) ? 1 : 0;
                        continue;
                      }
                      if (j1 == 4116) {
                        int i42 = GlobalStatics_9.anIntArray2929[--k];
                        GlobalStatics_9.anIntArray2929[k++] =
                            GlobalStatics_9.method544(-49, i42) ? 1 : 0;
                        continue;
                      }
                      if (j1 == 4117) {
                        GameString class94_39 = GlobalStatics_0.aClass94Array75[--l];
                        if (class94_39 != null) {
                          GlobalStatics_9.anIntArray2929[k++] = class94_39
                              .getLength();
                        } else {
                          GlobalStatics_9.anIntArray2929[k++] = 0;
                        }
                        continue;
                      }
                      if (j1 == 4118) {
                        k -= 2;
                        GameString class94_40 = GlobalStatics_0.aClass94Array75[--l];
                        int i64 = GlobalStatics_9.anIntArray2929[k];
                        int j74 = GlobalStatics_9.anIntArray2929[1 + k];
                        GlobalStatics_0.aClass94Array75[l++] = class94_40
                            .substring(j74, 0, i64);
                        continue;
                      }
                      if (j1 == 4119) {
                        GameString class94_41 = GlobalStatics_0.aClass94Array75[--l];
                        GameString class94_60 = GameStringStatics
                            .createString(class94_41.getLength());
                        boolean flag9 = false;
                        for (int l78 = 0; l78 < class94_41.getLength();
                            l78++) {
                          int l80 = class94_41.charAt(l78);
                          if (l80 == 60) {
                            flag9 = true;
                            continue;
                          }
                          if (l80 == 62) {
                            flag9 = false;
                          } else {
                            if (!flag9) {
                              class94_60.method1572(l80, (byte) 125);
                            }
                          }
                        }

                        class94_60.pack();
                        GlobalStatics_0.aClass94Array75[l++] = class94_60;
                        continue;
                      }
                      if (j1 == 4120) {
                        k -= 2;
                        GameString class94_42 = GlobalStatics_0.aClass94Array75[--l];
                        int j64 = GlobalStatics_9.anIntArray2929[k];
                        int k74 = GlobalStatics_9.anIntArray2929[1 + k];
                        GlobalStatics_9.anIntArray2929[k++] = class94_42
                            .method1555(j64, k74, 1536);
                        continue;
                      }
                      if (j1 == 4121) {
                        l -= 2;
                        GameString class94_43 = GlobalStatics_0.aClass94Array75[l];
                        GameString class94_61 = GlobalStatics_0.aClass94Array75[
                            1 + l];
                        int l74 = GlobalStatics_9.anIntArray2929[--k];
                        GlobalStatics_9.anIntArray2929[k++] = class94_43
                            .indexOf(class94_61, l74, -1);
                        continue;
                      }
                      if (j1 == 4122) {
                        int j42 = GlobalStatics_9.anIntArray2929[--k];
                        GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_10
                            .method332(2, j42);
                        continue;
                      }
                      if (j1 == 4123) {
                        int k42 = GlobalStatics_9.anIntArray2929[--k];
                        GlobalStatics_9.anIntArray2929[k++] = GlobalStatics_8
                            .method2287(k42, (byte) 59);
                        continue;
                      }
                      if (j1 != 4124) {
                        break;
                      }
                      boolean flag1 = GlobalStatics_9.anIntArray2929[--k]
                          != 0;
                      int k64 = GlobalStatics_9.anIntArray2929[--k];
                      GlobalStatics_0.aClass94Array75[l++] =
                          GlobalStatics_9
                              .method407(GlobalStatics_10.languageId, flag1,
                                  0, k64, 2);
                      continue;
                    }
                    Widget class11_8 =
                        GlobalStatics_7.getWidget((byte) 115,
                            GlobalStatics_9.anIntArray2929[--k]);
                    if (j1 == 2800) {
                      GlobalStatics_9.anIntArray2929[k++] =
                          GlobalStatics_8.method44(class11_8).method101(-94);
                      continue;
                    }
                    if (j1 == 2801) {
                      int l64 = GlobalStatics_9.anIntArray2929[--k];
                      l64--;
                      if (class11_8.aClass94Array171 != null
                          && class11_8.aClass94Array171.length > l64
                          && class11_8.aClass94Array171[l64] != null) {
                        GlobalStatics_0.aClass94Array75[l++] = class11_8.aClass94Array171[l64];
                      } else {
                        GlobalStatics_0.aClass94Array75[l++] = GlobalStatics_6.aClass94_2331;
                      }
                      continue;
                    }
                    if (j1 != 2802) {
                      break;
                    }
                    if (class11_8.aClass94_277 != null) {
                      GlobalStatics_0.aClass94Array75[l++] = class11_8.aClass94_277;
                    } else {
                      GlobalStatics_0.aClass94Array75[l++] = GlobalStatics_6.aClass94_2331;
                    }
                    continue;
                  }
                  if (j1 == 2700) {
                    Widget class11_9 =
                        GlobalStatics_7.getWidget((byte) 126,
                            GlobalStatics_9.anIntArray2929[--k]);
                    GlobalStatics_9.anIntArray2929[k++] = class11_9.anInt192;
                    continue;
                  }
                  if (j1 == 2701) {
                    Widget class11_10 =
                        GlobalStatics_7.getWidget((byte) 117,
                            GlobalStatics_9.anIntArray2929[--k]);
                    if (class11_10.anInt192 == -1) {
                      GlobalStatics_9.anIntArray2929[k++] = 0;
                    } else {
                      GlobalStatics_9.anIntArray2929[k++] = class11_10.anInt271;
                    }
                    continue;
                  }
                  if (j1 == 2702) {
                    int l42 = GlobalStatics_9.anIntArray2929[--k];
                    SomethingPacket151 class3_sub31 =
                        (SomethingPacket151) GlobalStatics_10.aClass130_3208
                            .get(l42);
                    if (class3_sub31 == null) {
                      GlobalStatics_9.anIntArray2929[k++] = 0;
                    } else {
                      GlobalStatics_9.anIntArray2929[k++] = 1;
                    }
                    continue;
                  }
                  if (j1 == 2703) {
                    Widget class11_11 =
                        GlobalStatics_7.getWidget((byte) 125,
                            GlobalStatics_9.anIntArray2929[--k]);
                    if (class11_11.aClass11Array262 == null) {
                      GlobalStatics_9.anIntArray2929[k++] = 0;
                    } else {
                      int i65 = class11_11.aClass11Array262.length;
                      int i75 = 0;
                      do {
                        if (class11_11.aClass11Array262.length <= i75) {
                          break;
                        }
                        if (class11_11.aClass11Array262[i75] == null) {
                          i65 = i75;
                          break;
                        }
                        i75++;
                      } while (true);
                      GlobalStatics_9.anIntArray2929[k++] = i65;
                    }
                    continue;
                  }
                  if (j1 != 2704 && j1 != 2705) {
                    break;
                  }
                  k -= 2;
                  int i43 = GlobalStatics_9.anIntArray2929[k];
                  int j65 = GlobalStatics_9.anIntArray2929[k + 1];
                  SomethingPacket151 class3_sub31_1 =
                      (SomethingPacket151) GlobalStatics_10.aClass130_3208
                          .get(i43);
                  if (class3_sub31_1 == null
                      || class3_sub31_1.anInt2602 != j65) {
                    GlobalStatics_9.anIntArray2929[k++] = 0;
                  } else {
                    GlobalStatics_9.anIntArray2929[k++] = 1;
                  }
                  continue;
                }
                Widget class11_12 =
                    GlobalStatics_7.getWidget((byte) 124,
                        GlobalStatics_9.anIntArray2929[--k]);
                if (j1 == 2600) {
                  GlobalStatics_9.anIntArray2929[k++] = class11_12.anInt247;
                  continue;
                }
                if (j1 == 2601) {
                  GlobalStatics_9.anIntArray2929[k++] = class11_12.anInt208;
                  continue;
                }
                if (j1 == 2602) {
                  GlobalStatics_0.aClass94Array75[l++] = class11_12.aClass94_232;
                  continue;
                }
                if (j1 == 2603) {
                  GlobalStatics_9.anIntArray2929[k++] = class11_12.anInt240;
                  continue;
                }
                if (j1 == 2604) {
                  GlobalStatics_9.anIntArray2929[k++] = class11_12.anInt252;
                  continue;
                }
                if (j1 == 2605) {
                  GlobalStatics_9.anIntArray2929[k++] = class11_12.anInt164;
                  continue;
                }
                if (j1 == 2606) {
                  GlobalStatics_9.anIntArray2929[k++] = class11_12.rotationX0;
                  continue;
                }
                if (j1 == 2607) {
                  GlobalStatics_9.anIntArray2929[k++] = class11_12.rotationZ;
                  continue;
                }
                if (j1 == 2608) {
                  GlobalStatics_9.anIntArray2929[k++] = class11_12.rotationY;
                  continue;
                }
                if (j1 == 2609) {
                  GlobalStatics_9.anIntArray2929[k++] = class11_12.anInt223;
                  continue;
                }
                if (j1 == 2610) {
                  GlobalStatics_9.anIntArray2929[k++] = class11_12.anInt258;
                  continue;
                }
                if (j1 == 2611) {
                  GlobalStatics_9.anIntArray2929[k++] = class11_12.anInt264;
                  continue;
                }
                if (j1 != 2612) {
                  break;
                }
                GlobalStatics_9.anIntArray2929[k++] = class11_12.anInt224;
                continue;
              }
              Widget class11_13 =
                  flag ? GlobalStatics_9.aClass11_2055
                      : GlobalStatics_9.aClass11_1749;
              if (j1 == 1700) {
                GlobalStatics_9.anIntArray2929[k++] = class11_13.anInt192;
                continue;
              }
              if (j1 == 1701) {
                if (class11_13.anInt192 == -1) {
                  GlobalStatics_9.anIntArray2929[k++] = 0;
                } else {
                  GlobalStatics_9.anIntArray2929[k++] = class11_13.anInt271;
                }
                continue;
              }
              if (j1 != 1702) {
                break;
              }
              GlobalStatics_9.anIntArray2929[k++] = class11_13.anInt191;
            } else {
              Widget class11_14;
              if (j1 < 2000) {
                class11_14 =
                    flag ? GlobalStatics_9.aClass11_2055
                        : GlobalStatics_9.aClass11_1749;
              } else {
                j1 -= 1000;
                class11_14 =
                    GlobalStatics_7.getWidget((byte) 115,
                        GlobalStatics_9.anIntArray2929[--k]);
              }
              int[] ai3 = null;
              GameString class94_62 = GlobalStatics_0.aClass94Array75[--l];
              if (class94_62.getLength() > 0 && class94_62.charAt(
                  class94_62.getLength() - 1) == 89) {
                int i79 = GlobalStatics_9.anIntArray2929[--k];
                if (i79 > 0) {
                  ai3 = new int[i79];
                  while (i79-- > 0) {
                    ai3[i79] = GlobalStatics_9.anIntArray2929[--k];
                  }
                }
                class94_62 = class94_62
                    .substring(class94_62.getLength() - 1, 0, 0);
              }
              Object[] aobj1 = new Object[class94_62.getLength() + 1];
              for (int i81 = -1 + aobj1.length; i81 >= 1; i81--) {
                if (class94_62.charAt(i81 - 1) == 115) {
                  aobj1[i81] = GlobalStatics_0.aClass94Array75[--l];
                } else {
                  aobj1[i81] = new Integer(GlobalStatics_9.anIntArray2929[--k]);
                }
              }

              int j81 = GlobalStatics_9.anIntArray2929[--k];
              if (j81 == -1) {
                aobj1 = null;
              } else {
                aobj1[0] = new Integer(j81);
              }
              class11_14.aBoolean195 = true;
              if (j1 == 1400) {
                class11_14.anObjectArray165 = aobj1;
              } else if (j1 == 1401) {
                class11_14.anObjectArray180 = aobj1;
              } else if (j1 != 1402) {
                if (j1 == 1403) {
                  class11_14.anObjectArray248 = aobj1;
                } else {
                  if (j1 == 1404) {
                    class11_14.anObjectArray281 = aobj1;
                  } else {
                    if (j1 == 1405) {
                      class11_14.anObjectArray295 = aobj1;
                    } else if (j1 == 1406) {
                      class11_14.anObjectArray303 = aobj1;
                    } else if (j1 != 1407) {
                      if (j1 == 1408) {
                        class11_14.anObjectArray269 = aobj1;
                      } else if (j1 != 1409) {
                        if (j1 == 1410) {
                          class11_14.anObjectArray229 = aobj1;
                        } else {
                          if (j1 == 1411) {
                            class11_14.anObjectArray170 = aobj1;
                          } else {
                            if (j1 == 1412) {
                              class11_14.anObjectArray276 = aobj1;
                            } else if (j1 == 1414) {
                              class11_14.anIntArray175 = ai3;
                              class11_14.anObjectArray174 = aobj1;
                            } else if (j1 == 1415) {
                              class11_14.anIntArray274 = ai3;
                              class11_14.anObjectArray158 = aobj1;
                            } else if (j1 == 1416) {
                              class11_14.anObjectArray203 = aobj1;
                            } else if (j1 != 1417) {
                              if (j1 == 1418) {
                                class11_14.anObjectArray256 = aobj1;
                              } else if (j1 == 1419) {
                                class11_14.anObjectArray220 = aobj1;
                              } else if (j1 == 1420) {
                                class11_14.anObjectArray156 = aobj1;
                              } else if (j1 != 1421) {
                                if (j1 == 1422) {
                                  class11_14.anObjectArray315 = aobj1;
                                } else if (j1 != 1423) {
                                  if (j1 == 1424) {
                                    class11_14.anObjectArray176 = aobj1;
                                  } else if (j1 == 1425) {
                                    class11_14.anObjectArray268 = aobj1;
                                  } else if (j1 != 1426) {
                                    if (j1 == 1427) {
                                      class11_14.anObjectArray235 = aobj1;
                                    } else {
                                      if (j1 == 1428) {
                                        class11_14.anObjectArray161 = aobj1;
                                        class11_14.anIntArray211 = ai3;
                                      } else if (j1 == 1429) {
                                        class11_14.anIntArray185 = ai3;
                                        class11_14.anObjectArray221 = aobj1;
                                      }
                                    }
                                  } else {
                                    class11_14.anObjectArray217 = aobj1;
                                  }
                                } else {
                                  class11_14.anObjectArray206 = aobj1;
                                }
                              } else {
                                class11_14.anObjectArray313 = aobj1;
                              }
                            } else {
                              class11_14.anObjectArray183 = aobj1;
                            }
                          }
                        }
                      } else {
                        class11_14.anObjectArray314 = aobj1;
                      }
                    } else {
                      class11_14.anIntArray286 = ai3;
                      class11_14.anObjectArray282 = aobj1;
                    }
                  }
                }
              } else {
                class11_14.anObjectArray239 = aobj1;
              }
            }
            continue;
          }
          Widget class11_15;
          if (j1 < 2000) {
            class11_15 = flag ? GlobalStatics_9.aClass11_2055
                : GlobalStatics_9.aClass11_1749;
          } else {
            class11_15 = GlobalStatics_7
                .getWidget((byte) 118, GlobalStatics_9.anIntArray2929[--k]);
            j1 -= 1000;
          }
          DummyClass29.method909(-21, class11_15);
          if (j1 == 1200 || j1 == 1205) {
            k -= 2;
            int j75 = GlobalStatics_9.anIntArray2929[1 + k];
            int k65 = GlobalStatics_9.anIntArray2929[k];
            if (class11_15.anInt191 == -1) {
              GlobalStatics_9.method2092(class11_15.anInt279, (byte) -47);
              GlobalStatics_9.method265((byte) -42, class11_15.anInt279);
              DummyClass56.method1649(class11_15.anInt279, -101);
            }
            if (k65 == -1) {
              class11_15.anInt201 = -1;
              class11_15.anInt202 = 1;
              class11_15.anInt192 = -1;
            } else {
              class11_15.anInt192 = k65;
              class11_15.anInt271 = j75;
              ItemConfig class48_4 = DummyClass35
                  .getItemConfig(k65, (byte) 108);
              class11_15.rotationZ = class48_4.rotationZ;
              class11_15.anInt258 = class48_4.translateX;
              class11_15.rotationX0 = class48_4.rotationX;
              class11_15.anInt264 = class48_4.translateOther;
              class11_15.rotationY = class48_4.rotationY;
              class11_15.anInt164 = class48_4.anInt810;
              if (class11_15.anInt184 > 0) {
                class11_15.anInt164 =
                    class11_15.anInt164 * 32 / class11_15.anInt184;
              } else if (class11_15.anInt177 > 0) {
                class11_15.anInt164 =
                    class11_15.anInt164 * 32 / class11_15.anInt177;
              }
              class11_15.aBoolean227 = j1 != 1205;
            }
            continue;
          }
          if (j1 == 1201) {
            class11_15.anInt202 = 2;
            class11_15.anInt201 = GlobalStatics_9.anIntArray2929[--k];
            if (class11_15.anInt191 == -1) {
              DummyClass11.method2206(true, class11_15.anInt279);
            }
            continue;
          }
          if (j1 == 1202) {
            class11_15.anInt202 = 3;
            class11_15.anInt201 = GlobalStatics_9.localPlayer.appearance
                .method1163(-24861);
            if (class11_15.anInt191 == -1) {
              DummyClass11.method2206(true, class11_15.anInt279);
            }
            continue;
          }
          if (j1 == 1203) {
            class11_15.anInt202 = 6;
            class11_15.anInt201 = GlobalStatics_9.anIntArray2929[--k];
            if (class11_15.anInt191 == -1) {
              DummyClass11.method2206(true, class11_15.anInt279);
            }
            continue;
          }
          if (j1 != 1204) {
            break;
          }
          class11_15.anInt202 = 5;
          class11_15.anInt201 = GlobalStatics_9.anIntArray2929[--k];
          if (class11_15.anInt191 == -1) {
            DummyClass11.method2206(true, class11_15.anInt279);
          }
          continue;
        }
        Widget class11_16;
        if (j1 < 2000) {
          class11_16 = flag ? GlobalStatics_9.aClass11_2055
              : GlobalStatics_9.aClass11_1749;
        } else {
          j1 -= 1000;
          class11_16 = GlobalStatics_7
              .getWidget((byte) 120, GlobalStatics_9.anIntArray2929[--k]);
        }
        if (j1 == 1100) {
          k -= 2;
          class11_16.anInt247 = GlobalStatics_9.anIntArray2929[k];
          if (class11_16.anInt247 > class11_16.anInt240
              - class11_16.anInt168) {
            class11_16.anInt247 = class11_16.anInt240 - class11_16.anInt168;
          }
          if (class11_16.anInt247 < 0) {
            class11_16.anInt247 = 0;
          }
          class11_16.anInt208 = GlobalStatics_9.anIntArray2929[k + 1];
          if (class11_16.anInt208 > class11_16.anInt252 - class11_16.anInt193) {
            class11_16.anInt208 = class11_16.anInt252 - class11_16.anInt193;
          }
          if (class11_16.anInt208 < 0) {
            class11_16.anInt208 = 0;
          }
          DummyClass29.method909(111, class11_16);
          if (class11_16.anInt191 == -1) {
            GlobalStatics_9.method1259(class11_16.anInt279, (byte) 109);
          }
          continue;
        }
        if (j1 == 1101) {
          class11_16.anInt218 = GlobalStatics_9.anIntArray2929[--k];
          DummyClass29.method909(-123, class11_16);
          if (class11_16.anInt191 == -1) {
            GlobalStatics_11.method56(class11_16.anInt279, 99);
          }
          continue;
        }
        if (j1 == 1102) {
          class11_16.aBoolean226 = GlobalStatics_9.anIntArray2929[--k] == 1;
          DummyClass29.method909(107, class11_16);
          continue;
        }
        if (j1 == 1103) {
          class11_16.anInt223 = GlobalStatics_9.anIntArray2929[--k];
          DummyClass29.method909(-64, class11_16);
          continue;
        }
        if (j1 == 1104) {
          class11_16.anInt250 = GlobalStatics_9.anIntArray2929[--k];
          DummyClass29.method909(-52, class11_16);
          continue;
        }
        if (j1 == 1105) {
          class11_16.anInt224 = GlobalStatics_9.anIntArray2929[--k];
          DummyClass29.method909(-122, class11_16);
          continue;
        }
        if (j1 == 1106) {
          class11_16.anInt301 = GlobalStatics_9.anIntArray2929[--k];
          DummyClass29.method909(-33, class11_16);
          continue;
        }
        if (j1 == 1107) {
          class11_16.aBoolean186 = GlobalStatics_9.anIntArray2929[--k] == 1;
          DummyClass29.method909(114, class11_16);
          continue;
        }
        if (j1 == 1108) {
          class11_16.anInt202 = 1;
          class11_16.anInt201 = GlobalStatics_9.anIntArray2929[--k];
          DummyClass29.method909(2, class11_16);
          if (class11_16.anInt191 == -1) {
            DummyClass11.method2206(true, class11_16.anInt279);
          }
          continue;
        }
        if (j1 == 1109) {
          k -= 6;
          class11_16.anInt258 = GlobalStatics_9.anIntArray2929[k];
          class11_16.anInt264 = GlobalStatics_9.anIntArray2929[k + 1];
          class11_16.rotationX0 = GlobalStatics_9.anIntArray2929[2 + k];
          class11_16.rotationY = GlobalStatics_9.anIntArray2929[k + 3];
          class11_16.rotationZ = GlobalStatics_9.anIntArray2929[k + 4];
          class11_16.anInt164 = GlobalStatics_9.anIntArray2929[5 + k];
          DummyClass29.method909(-59, class11_16);
          if (class11_16.anInt191 == -1) {
            GlobalStatics_9.method265((byte) -42, class11_16.anInt279);
            DummyClass56.method1649(class11_16.anInt279, -106);
          }
          continue;
        }
        if (j1 == 1110) {
          int l65 = GlobalStatics_9.anIntArray2929[--k];
          if (class11_16.anInt305 != l65) {
            class11_16.anInt305 = l65;
            class11_16.anInt283 = 0;
            class11_16.anInt267 = 0;
            class11_16.anInt260 = 1;
            DummyClass29.method909(116, class11_16);
          }
          if (class11_16.anInt191 == -1) {
            DummyClass58.method1657(class11_16.anInt279, -903);
          }
          continue;
        }
        if (j1 == 1111) {
          class11_16.aBoolean181 = GlobalStatics_9.anIntArray2929[--k] == 1;
          DummyClass29.method909(118, class11_16);
          continue;
        }
        if (j1 == 1112) {
          GameString class94_63 = GlobalStatics_0.aClass94Array75[--l];
          if (!class94_63.method1528((byte) -42, class11_16.aClass94_232)) {
            class11_16.aClass94_232 = class94_63;
            DummyClass29.method909(117, class11_16);
          }
          if (class11_16.anInt191 == -1) {
            GlobalStatics_9.method1516(class11_16.anInt279, 91);
          }
          continue;
        }
        if (j1 == 1113) {
          class11_16.anInt270 = GlobalStatics_9.anIntArray2929[--k];
          DummyClass29.method909(111, class11_16);
          continue;
        }
        if (j1 == 1114) {
          k -= 3;
          class11_16.anInt194 = GlobalStatics_9.anIntArray2929[k];
          class11_16.anInt225 = GlobalStatics_9.anIntArray2929[1 + k];
          class11_16.anInt205 = GlobalStatics_9.anIntArray2929[2 + k];
          DummyClass29.method909(113, class11_16);
          continue;
        }
        if (j1 == 1115) {
          class11_16.aBoolean215 = GlobalStatics_9.anIntArray2929[--k] == 1;
          DummyClass29.method909(-33, class11_16);
          continue;
        }
        if (j1 == 1116) {
          class11_16.anInt288 = GlobalStatics_9.anIntArray2929[--k];
          DummyClass29.method909(-26, class11_16);
          continue;
        }
        if (j1 == 1117) {
          class11_16.anInt287 = GlobalStatics_9.anIntArray2929[--k];
          DummyClass29.method909(117, class11_16);
          continue;
        }
        if (j1 == 1118) {
          class11_16.aBoolean178 = GlobalStatics_9.anIntArray2929[--k] == 1;
          DummyClass29.method909(123, class11_16);
          continue;
        }
        if (j1 == 1119) {
          class11_16.aBoolean199 = GlobalStatics_9.anIntArray2929[--k] == 1;
          DummyClass29.method909(-20, class11_16);
          continue;
        }
        if (j1 == 1120) {
          k -= 2;
          class11_16.anInt240 = GlobalStatics_9.anIntArray2929[k];
          class11_16.anInt252 = GlobalStatics_9.anIntArray2929[1 + k];
          DummyClass29.method909(117, class11_16);
          if (class11_16.anInt187 == 0) {
            GlobalStatics_7.method2104(class11_16, false, -116);
          }
          continue;
        }
        if (j1 == 1121) {
          k -= 2;
          class11_16.aShort293 = (short) GlobalStatics_9.anIntArray2929[k];
          class11_16.aShort169 = (short) GlobalStatics_9.anIntArray2929[k + 1];
          DummyClass29.method909(126, class11_16);
          continue;
        }
        if (j1 == 1122) {
          class11_16.aBoolean157 = GlobalStatics_9.anIntArray2929[--k] == 1;
          DummyClass29.method909(-66, class11_16);
          continue;
        }
        if (j1 != 1123) {
          break;
        }
        class11_16.anInt164 = GlobalStatics_9.anIntArray2929[--k];
        DummyClass29.method909(-126, class11_16);
        if (class11_16.anInt191 == -1) {
          GlobalStatics_9.method265((byte) -42, class11_16.anInt279);
        }
        continue;
      }
      if (j1 == 403) {
        k -= 2;
        int i66 = GlobalStatics_9.anIntArray2929[k + 1];
        int j43 = GlobalStatics_9.anIntArray2929[k];
        int k75 = 0;
        do {
          if (GlobalStatics_9.anIntArray2559.length <= k75) {
            break;
          }
          if (j43 == GlobalStatics_9.anIntArray2559[k75]) {
            GlobalStatics_9.localPlayer.appearance.method1164(k75, i66, 0);
            continue label0;
          }
          k75++;
        } while (true);
        k75 = 0;
        do {
          if (k75 >= GlobalStatics_9.anIntArray3228.length) {
            continue label0;
          }
          if (j43 == GlobalStatics_9.anIntArray3228[k75]) {
            GlobalStatics_9.localPlayer.appearance.method1164(k75, i66, 0);
            continue label0;
          }
          k75++;
        } while (true);
      }
      if (j1 == 404) {
        k -= 2;
        int k43 = GlobalStatics_9.anIntArray2929[k];
        int j66 = GlobalStatics_9.anIntArray2929[1 + k];
        GlobalStatics_9.localPlayer.appearance.method1162(k43, false, j66);
        continue;
      }
      if (j1 != 410) {
        break;
      }
      boolean flag2 = GlobalStatics_9.anIntArray2929[--k] != 0;
      GlobalStatics_9.localPlayer.appearance.method1159(flag2, true);
    } while (true);
    throw new IllegalStateException();
  }

  public static GameWorld method1107(int var0) {
    if (GlobalStatics_10.aClass44_Sub1Array3201.length
        > GlobalStatics_9.anInt2291) {
      return GlobalStatics_10.aClass44_Sub1Array3201[GlobalStatics_9.anInt2291++];
    } else {
      if (var0 != 5422) {
        GlobalStatics_11.method1107(-66);
      }

      return null;
    }
  }

  public static void method1111(int var0) {
    GlobalStatics_11.aClass94_808 = null;
    GlobalStatics_11.anIntArray781 = null;
    GlobalStatics_11.aClass94_809 = null;
    if (var0 == 3327) {
      GlobalStatics_11.aClass94_806 = null;
      GlobalStatics_11.aClass94_811 = null;
    }
  }

  public static float method358(int var0) {
    int var1 = var0 & 2097151;
    int var2 = var0 & Integer.MIN_VALUE;
    int var3 = (var0 & 2145386496) >> 21;
    if (var2 != 0) {
      var1 = -var1;
    }

    return (float) (var1 * Math.pow(2.0D, var3 - 788));
  }

  public static void method361() {
    GlobalStatics_11.aByteArray2417 = null;
    GlobalStatics_11.aClass71Array2406 = null;
    GlobalStatics_11.aClass59Array2407 = null;
    GlobalStatics_11.aClass152Array2392 = null;
    GlobalStatics_11.aClass150Array2398 = null;
    GlobalStatics_11.aBooleanArray2393 = null;
    GlobalStatics_11.anIntArray2420 = null;
    GlobalStatics_11.aFloatArray2403 = null;
    GlobalStatics_11.aFloatArray2400 = null;
    GlobalStatics_11.aFloatArray2413 = null;
    GlobalStatics_11.aFloatArray2416 = null;
    GlobalStatics_11.aFloatArray2399 = null;
    GlobalStatics_11.aFloatArray2387 = null;
    GlobalStatics_11.aFloatArray2388 = null;
    GlobalStatics_11.anIntArray2391 = null;
    GlobalStatics_11.anIntArray2409 = null;
  }

  public static boolean method362(FileUnpacker var0) {
    if (!GlobalStatics_11.aBoolean2405) {
      byte[] var1 = var0.getBytes(0, 0);
      if (var1 == null) {
        return false;
      }

      GlobalStatics_11.method367(var1);
      GlobalStatics_11.aBoolean2405 = true;
    }

    return true;
  }

  public static MidiInstrument method363(FileUnpacker var0, int var1,
      int var2) {
    if (GlobalStatics_11.method362(var0)) {
      byte[] var3 = var0.getBytes(var1, var2);
      return var3 == null ? null : new MidiInstrument(var3);
    } else {
      var0.method2129((byte) 95, var2, var1);
      return null;
    }
  }

  public static int method364() {
    int var0 = GlobalStatics_11.aByteArray2417[GlobalStatics_11.anInt2404]
        >> GlobalStatics_11.anInt2414
        & 1;
    ++GlobalStatics_11.anInt2414;
    GlobalStatics_11.anInt2404 += GlobalStatics_11.anInt2414 >> 3;
    GlobalStatics_11.anInt2414 &= 7;
    return var0;
  }

  public static void method365(byte[] var0, int var1) {
    GlobalStatics_11.aByteArray2417 = var0;
    GlobalStatics_11.anInt2404 = var1;
    GlobalStatics_11.anInt2414 = 0;
  }

  public static void method367(byte[] var0) {
    GlobalStatics_11.method365(var0, 0);
    GlobalStatics_11.anInt2402 = 1 << GlobalStatics_11.method368(4);
    GlobalStatics_11.anInt2396 = 1 << GlobalStatics_11.method368(4);
    GlobalStatics_11.aFloatArray2403 = new float[GlobalStatics_11.anInt2396];

    int var1;
    int var2;
    int var3;
    int var4;
    int var5;
    for (var1 = 0; var1 < 2; ++var1) {
      var2 = var1 != 0 ? GlobalStatics_11.anInt2396
          : GlobalStatics_11.anInt2402;
      var3 = var2 >> 1;
      var4 = var2 >> 2;
      var5 = var2 >> 3;
      float[] var6 = new float[var3];

      for (int var7 = 0; var7 < var4; ++var7) {
        var6[2 * var7] = (float) Math.cos(
            (4 * var7) * 3.141592653589793D / var2);
        var6[2 * var7 + 1] =
            -((float) Math.sin((4 * var7) * 3.141592653589793D / var2));
      }

      float[] var13 = new float[var3];

      for (int var8 = 0; var8 < var4; ++var8) {
        var13[2 * var8] =
            (float) Math.cos((2 * var8 + 1) * 3.141592653589793D / (2 * var2));
        var13[2 * var8 + 1] =
            (float) Math.sin((2 * var8 + 1) * 3.141592653589793D / (2 * var2));
      }

      float[] var14 = new float[var4];

      for (int var9 = 0; var9 < var5; ++var9) {
        var14[2 * var9] =
            (float) Math.cos((4 * var9 + 2) * 3.141592653589793D / var2);
        var14[2 * var9 + 1] =
            -((float) Math.sin((4 * var9 + 2) * 3.141592653589793D / var2));
      }

      int[] var15 = new int[var5];
      int var10 = GlobalStatics_9.method513(var5 - 1, 4);

      for (int var11 = 0; var11 < var5; ++var11) {
        var15[var11] = GlobalStatics_9.method540(var10, -14314, var11);
      }

      if (var1 == 0) {
        GlobalStatics_11.aFloatArray2400 = var6;
        GlobalStatics_11.aFloatArray2413 = var13;
        GlobalStatics_11.aFloatArray2416 = var14;
        GlobalStatics_11.anIntArray2391 = var15;
      } else {
        GlobalStatics_11.aFloatArray2399 = var6;
        GlobalStatics_11.aFloatArray2387 = var13;
        GlobalStatics_11.aFloatArray2388 = var14;
        GlobalStatics_11.anIntArray2409 = var15;
      }
    }

    var1 = GlobalStatics_11.method368(8) + 1;
    GlobalStatics_11.aClass71Array2406 = new SomethingMidiInstrument[var1];

    for (var2 = 0; var2 < var1; ++var2) {
      GlobalStatics_11.aClass71Array2406[var2] = new SomethingMidiInstrument();
    }

    var2 = GlobalStatics_11.method368(6) + 1;

    for (var3 = 0; var3 < var2; ++var3) {
      GlobalStatics_11.method368(16);
    }

    var2 = GlobalStatics_11.method368(6) + 1;
    GlobalStatics_11.aClass59Array2407 = new SomethingMidiI[var2];

    for (var3 = 0; var3 < var2; ++var3) {
      GlobalStatics_11.aClass59Array2407[var3] = new SomethingMidiI();
    }

    var3 = GlobalStatics_11.method368(6) + 1;
    GlobalStatics_11.aClass152Array2392 = new SomethingMidik[var3];

    for (var4 = 0; var4 < var3; ++var4) {
      GlobalStatics_11.aClass152Array2392[var4] = new SomethingMidik();
    }

    var4 = GlobalStatics_11.method368(6) + 1;
    GlobalStatics_11.aClass150Array2398 = new SomethingMidiOther[var4];

    for (var5 = 0; var5 < var4; ++var5) {
      GlobalStatics_11.aClass150Array2398[var5] = new SomethingMidiOther();
    }

    var5 = GlobalStatics_11.method368(6) + 1;
    GlobalStatics_11.aBooleanArray2393 = new boolean[var5];
    GlobalStatics_11.anIntArray2420 = new int[var5];

    for (int var12 = 0; var12 < var5; ++var12) {
      GlobalStatics_11.aBooleanArray2393[var12] =
          GlobalStatics_11.method364() != 0;
      GlobalStatics_11.method368(16);
      GlobalStatics_11.method368(16);
      GlobalStatics_11.anIntArray2420[var12] = GlobalStatics_11.method368(8);
    }

  }

  public static int method368(int var0) {
    int var1 = 0;

    int var2;
    int var3;
    for (var2 = 0; var0 >= 8 - GlobalStatics_11.anInt2414; var0 -= var3) {
      var3 = 8 - GlobalStatics_11.anInt2414;
      int var4 = (1 << var3) - 1;
      var1 += (
          GlobalStatics_11.aByteArray2417[GlobalStatics_11.anInt2404]
              >> GlobalStatics_11.anInt2414
              & var4) << var2;
      GlobalStatics_11.anInt2414 = 0;
      ++GlobalStatics_11.anInt2404;
      var2 += var3;
    }

    if (var0 > 0) {
      var3 = (1 << var0) - 1;
      var1 += (
          GlobalStatics_11.aByteArray2417[GlobalStatics_11.anInt2404]
              >> GlobalStatics_11.anInt2414
              & var3) << var2;
      GlobalStatics_11.anInt2414 += var0;
    }

    return var1;
  }

  public static short[] copy(int var0, short[] var1) {
    if (var0 != 23032) {
      return null;
    } else if (var1 != null) {
      short[] var2 = new short[var1.length];
      ArrayUtils.method1361(var1, 0, var2, 0, var1.length);
      return var2;
    } else {
      return null;
    }
  }

  public static void method66(GameString var0, int var1, int var2, byte var3,
      int var4) {
    Widget var5 = GlobalStatics_2.method638((byte) -19, var4, var1);
    if (var5 != null) {
      if (var5.anObjectArray314 != null) {
        ClientScriptCall var6 = new ClientScriptCall();
        var6.arguments = var5.anObjectArray314;
        var6.aClass11_2449 = var5;
        var6.aClass94_2439 = var0;
        var6.anInt2445 = var2;
        GLStatics.executeScript(var6);
      }

      boolean var8 = true;
      if (var5.anInt189 > 0) {
        var8 = GlobalStatics_9.method715(205, var5);
      }

      if (var8) {
        if (GlobalStatics_8.method44(var5).method92(var2 - 1, (byte) -108)) {
          if (var2 == 1) {
            GlobalStatics_9.secureBuffer.writePacket(155);
            GlobalStatics_9.secureBuffer.writeInt(var4);
            ++GlobalStatics_0.anInt937;
            GlobalStatics_9.secureBuffer.writeShort(var1);
          }

          if (var3 < -7) {
            if (var2 == 2) {
              ++GlobalStatics_10.anInt3122;
              GlobalStatics_9.secureBuffer.writePacket(196);
              GlobalStatics_9.secureBuffer.writeInt(var4);
              GlobalStatics_9.secureBuffer.writeShort(var1);
            }

            if (var2 == 3) {
              ++DummyClass42.anInt889;
              GlobalStatics_9.secureBuffer.writePacket(124);
              GlobalStatics_9.secureBuffer.writeInt(var4);
              GlobalStatics_9.secureBuffer.writeShort(var1);
            }

            if (var2 == 4) {
              GlobalStatics_9.secureBuffer.writePacket(199);
              GlobalStatics_9.secureBuffer.writeInt(var4);
              GlobalStatics_9.secureBuffer.writeShort(var1);
              ++GlobalStatics_9.anInt1909;
            }

            if (var2 == 5) {
              GlobalStatics_9.secureBuffer.writePacket(234);
              GlobalStatics_9.secureBuffer.writeInt(var4);
              GlobalStatics_9.secureBuffer.writeShort(var1);
              ++GlobalStatics_9.anInt2081;
            }

            if (var2 == 6) {
              GlobalStatics_9.secureBuffer.writePacket(168);
              ++DummyClass52.anInt1172;
              GlobalStatics_9.secureBuffer.writeInt(var4);
              GlobalStatics_9.secureBuffer.writeShort(var1);
            }

            if (var2 == 7) {
              ++DummyClass59.anInt674;
              GlobalStatics_9.secureBuffer.writePacket(166);
              GlobalStatics_9.secureBuffer.writeInt(var4);
              GlobalStatics_9.secureBuffer.writeShort(var1);
            }

            if (var2 == 8) {
              GlobalStatics_9.secureBuffer.writePacket(64);
              ++GlobalStatics_9.anInt903;
              GlobalStatics_9.secureBuffer.writeInt(var4);
              GlobalStatics_9.secureBuffer.writeShort(var1);
            }

            if (var2 == 9) {
              ++DummyClass52.anInt1166;
              GlobalStatics_9.secureBuffer.writePacket(53);
              GlobalStatics_9.secureBuffer.writeInt(var4);
              GlobalStatics_9.secureBuffer.writeShort(var1);
            }

            if (var2 == 10) {
              ++GlobalStatics_7.anInt1307;
              GlobalStatics_9.secureBuffer.writePacket(9);
              GlobalStatics_9.secureBuffer.writeInt(var4);
              GlobalStatics_9.secureBuffer.writeShort(var1);
            }

          }
        }
      }
    }
  }

  public static void method67(boolean var0) {
    GlobalStatics_11.aClass94_50 = null;
    GlobalStatics_11.titleSuffixes = null;
    if (!var0) {
      GlobalStatics_11.aBoolean47 = true;
    }

    GlobalStatics_11.anIntArray49 = null;
    GlobalStatics_11.aClass94_51 = null;
  }

  public static void method68(int var0, int var1, Mobile var2) {
    if (GlobalStatics_4.updateCycle >= var2.anInt2800) {
      if (var2.anInt2790 >= GlobalStatics_4.updateCycle) {
        GlobalStatics_8.method2270(var2, (byte) -56);
      } else {
        GlobalStatics_7.method1180((byte) -22, var2);
      }
    } else {
      GlobalStatics_9.method1950(var2, true);
    }

    if (var2.anInt2819 < 128 || var2.anInt2829 < 128
        || var2.anInt2819 >= 13184
        || var2.anInt2829 >= 13184) {
      var2.animationId = -1;
      var2.anInt2842 = -1;
      var2.anInt2800 = 0;
      var2.anInt2790 = 0;
      var2.anInt2819 = 128 * var2.waypointsX[0] + 64 * var2.getSize();
      var2.anInt2829 = var2.waypointsY[0] * 128 + var2.getSize() * 64;
      var2.method1973(var1 - 2395);
    }

    if (var1 == 2279) {
      if (var2 == GlobalStatics_9.localPlayer && (var2.anInt2819 < 1536 ||
          var2.anInt2829 < 1536
          || var2.anInt2819 >= 11776 || var2.anInt2829 >= 11776)) {
        var2.anInt2842 = -1;
        var2.anInt2800 = 0;
        var2.anInt2790 = 0;
        var2.animationId = -1;
        var2.anInt2819 = var2.waypointsX[0] * 128 + var2.getSize() * 64;
        var2.anInt2829 = 128 * var2.waypointsY[0] + 64 * var2.getSize();
        var2.method1973(-98);
      }

      DummyClass1.method904(65536, var2);
      GlobalStatics_9.method900(var2, -11973);
    }
  }

  public static int method420(byte[] var1, int[] var2, int var3,
      int var4,
      int var5, int var6, int var7, int var8, int var9,
      AudioStreamEncoder1 var10) {
    var3 >>= 8;
    var9 >>= 8;
    var5 <<= 2;
    var6 <<= 2;
    if ((var7 = var4 + var9 - var3) > var8) {
      var7 = var8;
    }

    var4 <<= 1;
    var7 <<= 1;

    byte var11;
    int var10001;
    for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
      var11 = var1[var3++];
      var10001 = var4++;
      var2[var10001] += var11 * var5;
      var10001 = var4++;
      var2[var10001] += var11 * var6;
      var11 = var1[var3++];
      var10001 = var4++;
      var2[var10001] += var11 * var5;
      var10001 = var4++;
      var2[var10001] += var11 * var6;
      var11 = var1[var3++];
      var10001 = var4++;
      var2[var10001] += var11 * var5;
      var10001 = var4++;
      var2[var10001] += var11 * var6;
      var11 = var1[var3++];
      var10001 = var4++;
      var2[var10001] += var11 * var5;
      var10001 = var4++;
    }

    for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
      var11 = var1[var3++];
      var10001 = var4++;
      var2[var10001] += var11 * var5;
      var10001 = var4++;
    }

    var10.anInt3474 = var3 << 8;
    return var4 >> 1;
  }

  public static int method421(int var0, int var1, byte[] var2, int[] var3,
      int var4,
      int var5, int var6, int var7, int var8, int var9, int var10,
      int var11, int var12, AudioStreamEncoder1 var13, int var14,
      int var15) {
    var13.anInt3476 -= var13.anInt3472 * var5;
    if (var14 == 0
        || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
      var10 = var11;
    }

    var5 <<= 1;

    int var10001;
    byte var16;
    for (var10 <<= 1; var5 < var10; var4 += var14) {
      var1 = var4 >> 8;
      var16 = var2[var1];
      var0 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & 255);
      var10001 = var5++;
      var3[var10001] += var0 * var6 >> 6;
      var6 += var8;
      var10001 = var5++;
      var3[var10001] += var0 * var7 >> 6;
      var7 += var9;
    }

    if (var14 == 0
        || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
      var10 = var11;
    }

    var10 <<= 1;

    for (var1 = var15; var5 < var10; var4 += var14) {
      var16 = var2[var4 >> 8];
      var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
      var10001 = var5++;
      var3[var10001] += var0 * var6 >> 6;
      var6 += var8;
      var10001 = var5++;
      var3[var10001] += var0 * var7 >> 6;
      var7 += var9;
    }

    var5 >>= 1;
    var13.anInt3476 += var13.anInt3472 * var5;
    var13.anInt3484 = var6;
    var13.anInt3481 = var7;
    var13.anInt3474 = var4;
    return var5;
  }

  public static int method422(int var1, byte[] var2, int[] var3,
      int var4,
      int var5, int var6, int var7, int var8, int var9, int var10,
      AudioStreamEncoder1 var11, int var12, int var13) {
    var11.anInt3484 -= var11.anInt3475 * var5;
    var11.anInt3481 -= var11.anInt3483 * var5;
    if (var12 == 0
        || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
      var8 = var9;
    }

    int var10001;
    byte var14;
    while (var5 < var8) {
      var1 = var4 >> 8;
      var14 = var2[var1];
      var10001 = var5++;
      var3[var10001] +=
          ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
      var6 += var7;
      var4 += var12;
    }

    if (var12 == 0
        || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
      var8 = var9;
    }

    for (var1 = var13; var5 < var8; var4 += var12) {
      var14 = var2[var4 >> 8];
      var10001 = var5++;
      var3[var10001] +=
          ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
      var6 += var7;
    }

    var11.anInt3484 += var11.anInt3475 * var5;
    var11.anInt3481 += var11.anInt3483 * var5;
    var11.anInt3476 = var6;
    var11.anInt3474 = var4;
    return var5;
  }

  public static int method423(int var0, int var1, byte[] var2, int[] var3,
      int var4,
      int var5, int var6, int var7, int var8, int var9,
      AudioStreamEncoder1 var10, int var11, int var12) {
    if (var11 == 0
        || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
      var7 = var8;
    }

    int var10001;
    while (var5 < var7) {
      var1 = var4 >> 8;
      byte var13 = var2[var1 - 1];
      var10001 = var5++;
      var3[var10001] +=
          ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
      var4 += var11;
    }

    if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
      var7 = var8;
    }

    var0 = var12;

    for (var1 = var11; var5 < var7; var4 += var1) {
      var10001 = var5++;
      var3[var10001] +=
          ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
    }

    var10.anInt3474 = var4;
    return var5;
  }

  public static int method424(byte[] var0, int[] var1, int var2, int var3,
      int var4,
      int var5, int var6, int var7, AudioStreamEncoder1 var8) {
    var2 >>= 8;
    var7 >>= 8;
    var4 <<= 2;
    if ((var5 = var3 + var7 - var2) > var6) {
      var5 = var6;
    }

    int var10001;
    for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
      var10001 = var3++;
      var1[var10001] += var0[var2++] * var4;
      var10001 = var3++;
      var1[var10001] += var0[var2++] * var4;
      var10001 = var3++;
      var1[var10001] += var0[var2++] * var4;
      var10001 = var3++;
    }

    for (var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
      var10001 = var3++;
    }

    var8.anInt3474 = var2 << 8;
    return var3;
  }

  public static int method426(byte[] var1, int[] var2, int var3,
      int var4,
      int var5, int var6, int var7, int var8, int var9, int var10,
      int var11, AudioStreamEncoder1 var12) {
    var3 >>= 8;
    var11 >>= 8;
    var5 <<= 2;
    var6 <<= 2;
    var7 <<= 2;
    var8 <<= 2;
    if ((var9 = var4 + var11 - var3) > var10) {
      var9 = var10;
    }

    var12.anInt3476 += var12.anInt3472 * (var9 - var4);
    var4 <<= 1;
    var9 <<= 1;

    int var10001;
    byte var13;
    for (var9 -= 6; var4 < var9; var6 += var8) {
      var13 = var1[var3++];
      var10001 = var4++;
      var2[var10001] += var13 * var5;
      var5 += var7;
      var10001 = var4++;
      var2[var10001] += var13 * var6;
      var6 += var8;
      var13 = var1[var3++];
      var10001 = var4++;
      var2[var10001] += var13 * var5;
      var5 += var7;
      var10001 = var4++;
      var2[var10001] += var13 * var6;
      var6 += var8;
      var13 = var1[var3++];
      var10001 = var4++;
      var2[var10001] += var13 * var5;
      var5 += var7;
      var10001 = var4++;
      var2[var10001] += var13 * var6;
      var6 += var8;
      var13 = var1[var3++];
      var10001 = var4++;
      var2[var10001] += var13 * var5;
      var5 += var7;
      var10001 = var4++;
      var2[var10001] += var13 * var6;
    }

    for (var9 += 6; var4 < var9; var6 += var8) {
      var13 = var1[var3++];
      var10001 = var4++;
      var2[var10001] += var13 * var5;
      var5 += var7;
      var10001 = var4++;
      var2[var10001] += var13 * var6;
    }

    var12.anInt3484 = var5 >> 2;
    var12.anInt3481 = var6 >> 2;
    var12.anInt3474 = var3 << 8;
    return var4 >> 1;
  }

  public static int method427(byte[] var0, int[] var1, int var2, int var3,
      int var4,
      int var5, int var6, int var7, int var8,
      AudioStreamEncoder1 var9) {
    var2 >>= 8;
    var8 >>= 8;
    var4 <<= 2;
    var5 <<= 2;
    if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
      var6 = var7;
    }

    var9.anInt3484 += var9.anInt3475 * (var6 - var3);
    var9.anInt3481 += var9.anInt3483 * (var6 - var3);

    int var10001;
    for (var6 -= 3; var3 < var6; var4 += var5) {
      var10001 = var3++;
      var1[var10001] += var0[var2--] * var4;
      var4 += var5;
      var10001 = var3++;
      var1[var10001] += var0[var2--] * var4;
      var4 += var5;
      var10001 = var3++;
      var1[var10001] += var0[var2--] * var4;
      var4 += var5;
      var10001 = var3++;
      var1[var10001] += var0[var2--] * var4;
    }

    for (var6 += 3; var3 < var6; var4 += var5) {
      var10001 = var3++;
      var1[var10001] += var0[var2--] * var4;
    }

    var9.anInt3476 = var4 >> 2;
    var9.anInt3474 = var2 << 8;
    return var3;
  }

  public static int method428(byte[] var0, int[] var1, int var2, int var3,
      int var4,
      int var5, int var6, int var7, int var8,
      AudioStreamEncoder1 var9) {
    var2 >>= 8;
    var8 >>= 8;
    var4 <<= 2;
    var5 <<= 2;
    if ((var6 = var3 + var8 - var2) > var7) {
      var6 = var7;
    }

    var9.anInt3484 += var9.anInt3475 * (var6 - var3);
    var9.anInt3481 += var9.anInt3483 * (var6 - var3);

    int var10001;
    for (var6 -= 3; var3 < var6; var4 += var5) {
      var10001 = var3++;
      var1[var10001] += var0[var2++] * var4;
      var4 += var5;
      var10001 = var3++;
      var1[var10001] += var0[var2++] * var4;
      var4 += var5;
      var10001 = var3++;
      var1[var10001] += var0[var2++] * var4;
      var4 += var5;
      var10001 = var3++;
      var1[var10001] += var0[var2++] * var4;
    }

    for (var6 += 3; var3 < var6; var4 += var5) {
      var10001 = var3++;
      var1[var10001] += var0[var2++] * var4;
    }

    var9.anInt3476 = var4 >> 2;
    var9.anInt3474 = var2 << 8;
    return var3;
  }

  public static AudioStreamEncoder1 method432(SomethingMusic0 var0, int var1,
      int var2, int var3) {
    return var0.aByteArray3030 != null && var0.aByteArray3030.length != 0 ?
        new AudioStreamEncoder1(var0, var1, var2, var3) :
        null;
  }

  public static int method433(int encoded, int srcOff, byte[] src, int[] dest,
      int sourceOff,
      int destOff, int mul0, int mul1, int len, int var9, int var10,
      AudioStreamEncoder1 var11, int offsetStep, int var13) {
    if (offsetStep == 0
        || (len = destOff + (var10 - sourceOff + offsetStep - 257) / offsetStep)
        > var9) {
      len = var9;
    }

    destOff <<= 1;

    int off;
    byte value;
    for (len <<= 1; destOff < len; sourceOff += offsetStep) {
      srcOff = sourceOff >> 8;
      value = src[srcOff];
      encoded = (value << 8) + (src[srcOff + 1] - value) * (sourceOff & 255);
      off = destOff++;
      dest[off] += encoded * mul0 >> 6;
      off = destOff++;
      dest[off] += encoded * mul1 >> 6;
    }

    if (offsetStep == 0
        || (len =
        (destOff >> 1) + (var10 - sourceOff + offsetStep - 1) / offsetStep)
        > var9) {
      len = var9;
    }

    len <<= 1;

    for (srcOff = var13; destOff < len; sourceOff += offsetStep) {
      value = src[sourceOff >> 8];
      encoded = (value << 8) + (srcOff - value) * (sourceOff & 255);
      off = destOff++;
      dest[off] += encoded * mul0 >> 6;
      off = destOff++;
      dest[off] += encoded * mul1 >> 6;
    }

    var11.anInt3474 = sourceOff;
    return destOff >> 1;
  }

  public static int method435(byte[] src, int[] samples, int srcOff,
      int destOff,
      int mul0, int mul1, int mulStep, int mul1Step, int destLen,
      int maximumLen, int var11, AudioStreamEncoder1 var12) {
    srcOff >>= 8;
    var11 >>= 8;
    mul0 <<= 2;
    mul1 <<= 2;
    mulStep <<= 2;
    mul1Step <<= 2;
    if ((destLen = destOff + srcOff - (var11 - 1)) > maximumLen) {
      destLen = maximumLen;
    }

    var12.anInt3476 += var12.anInt3472 * (destLen - destOff);
    destOff <<= 1;
    destLen <<= 1;

    int off;
    byte b;
    for (destLen -= 6; destOff < destLen; mul1 += mul1Step) {
      b = src[srcOff--];
      off = destOff++;
      samples[off] += b * mul0;
      mul0 += mulStep;
      off = destOff++;
      samples[off] += b * mul1;
      mul1 += mul1Step;
      b = src[srcOff--];
      off = destOff++;
      samples[off] += b * mul0;
      mul0 += mulStep;
      off = destOff++;
      samples[off] += b * mul1;
      mul1 += mul1Step;
      b = src[srcOff--];
      off = destOff++;
      samples[off] += b * mul0;
      mul0 += mulStep;
      off = destOff++;
      samples[off] += b * mul1;
      mul1 += mul1Step;
      b = src[srcOff--];
      off = destOff++;
      samples[off] += b * mul0;
      mul0 += mulStep;
      off = destOff++;
      samples[off] += b * mul1;
    }

    for (destLen += 6; destOff < destLen; mul1 += mul1Step) {
      b = src[srcOff--];
      off = destOff++;
      samples[off] += b * mul0;
      mul0 += mulStep;
      off = destOff++;
      samples[off] += b * mul1;
    }

    var12.anInt3484 = mul0 >> 2;
    var12.anInt3481 = mul1 >> 2;
    var12.anInt3474 = srcOff << 8;
    return destOff >> 1;
  }

  public static AudioStreamEncoder1 method437(SomethingMusic0 var0, int var1,
      int var2) {
    return var0.aByteArray3030 != null && var0.aByteArray3030.length != 0 ?
        new AudioStreamEncoder1(var0,
            (int) (var0.anInt3034 * 256L * var1 / (100
                * DummyClass60.sampleRate)),
            var2 << 6) :
        null;
  }

  public static int method440(int var0, int var1, byte[] var2, int[] var3,
      int var4,
      int var5, int var6, int var7, int var8, int var9, int var10,
      int var11, int var12, AudioStreamEncoder1 var13, int var14,
      int var15) {
    var13.anInt3476 -= var13.anInt3472 * var5;
    if (var14 == 0
        || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
      var10 = var11;
    }

    var5 <<= 1;

    int var10001;
    for (var10 <<= 1; var5 < var10; var4 += var14) {
      var1 = var4 >> 8;
      byte var16 = var2[var1 - 1];
      var0 = (var16 << 8) + (var2[var1] - var16) * (var4 & 255);
      var10001 = var5++;
      var3[var10001] += var0 * var6 >> 6;
      var6 += var8;
      var10001 = var5++;
      var3[var10001] += var0 * var7 >> 6;
      var7 += var9;
    }

    if (var14 == 0
        || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
      var10 = var11;
    }

    var10 <<= 1;

    for (var1 = var15; var5 < var10; var4 += var14) {
      var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
      var10001 = var5++;
      var3[var10001] += var0 * var6 >> 6;
      var6 += var8;
      var10001 = var5++;
      var3[var10001] += var0 * var7 >> 6;
      var7 += var9;
    }

    var5 >>= 1;
    var13.anInt3476 += var13.anInt3472 * var5;
    var13.anInt3484 = var6;
    var13.anInt3481 = var7;
    var13.anInt3474 = var4;
    return var5;
  }

  public static int method446(byte[] var0, int[] var1, int var2, int var3,
      int var4,
      int var5, int var6, int var7, AudioStreamEncoder1 var8) {
    var2 >>= 8;
    var7 >>= 8;
    var4 <<= 2;
    if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
      var5 = var6;
    }

    int var10001;
    for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
      var10001 = var3++;
      var1[var10001] += var0[var2--] * var4;
      var10001 = var3++;
      var1[var10001] += var0[var2--] * var4;
      var10001 = var3++;
      var1[var10001] += var0[var2--] * var4;
      var10001 = var3++;
    }

    for (var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
      var10001 = var3++;
    }

    var8.anInt3474 = var2 << 8;
    return var3;
  }

  public static int method447(byte[] var1, int[] var2, int var3,
      int var4,
      int var5, int var6, int var7, int var8, int var9,
      AudioStreamEncoder1 var10) {
    var3 >>= 8;
    var9 >>= 8;
    var5 <<= 2;
    var6 <<= 2;
    if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
      var7 = var8;
    }

    var4 <<= 1;
    var7 <<= 1;

    byte var11;
    int var10001;
    for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
      var11 = var1[var3--];
      var10001 = var4++;
      var2[var10001] += var11 * var5;
      var10001 = var4++;
      var2[var10001] += var11 * var6;
      var11 = var1[var3--];
      var10001 = var4++;
      var2[var10001] += var11 * var5;
      var10001 = var4++;
      var2[var10001] += var11 * var6;
      var11 = var1[var3--];
      var10001 = var4++;
      var2[var10001] += var11 * var5;
      var10001 = var4++;
      var2[var10001] += var11 * var6;
      var11 = var1[var3--];
      var10001 = var4++;
      var2[var10001] += var11 * var5;
      var10001 = var4++;
    }

    for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
      var11 = var1[var3--];
      var10001 = var4++;
      var2[var10001] += var11 * var5;
      var10001 = var4++;
    }

    var10.anInt3474 = var3 << 8;
    return var4 >> 1;
  }

  public static int method448(int var0, int var1, byte[] var2, int[] var3,
      int var4,
      int var5, int var6, int var7, int var8, int var9, int var10,
      AudioStreamEncoder1 var11, int var12, int var13) {
    var11.anInt3484 -= var11.anInt3475 * var5;
    var11.anInt3481 -= var11.anInt3483 * var5;
    if (var12 == 0
        || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
      var8 = var9;
    }

    int var10001;
    while (var5 < var8) {
      var1 = var4 >> 8;
      byte var14 = var2[var1 - 1];
      var10001 = var5++;
      var3[var10001] +=
          ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
      var6 += var7;
      var4 += var12;
    }

    if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
      var8 = var9;
    }

    var0 = var13;

    for (var1 = var12; var5 < var8; var4 += var1) {
      var10001 = var5++;
      var3[var10001] +=
          ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
      var6 += var7;
    }

    var11.anInt3484 += var11.anInt3475 * var5;
    var11.anInt3481 += var11.anInt3483 * var5;
    var11.anInt3476 = var6;
    var11.anInt3474 = var4;
    return var5;
  }

  public static int method452(int var0, int var1) {
    return var1 < 0 ?
        var0 :
        (int) (var0 * Math.sqrt((16384 - var1) * 1.220703125E-4D) + 0.5D);
  }

  public static int method453(int var0, int var1, byte[] var2, int[] var3,
      int var4,
      int var5, int var6, int var7, int var8, int var9, int var10,
      AudioStreamEncoder1 var11, int var12, int var13) {
    if (var12 == 0
        || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
      var8 = var9;
    }

    var5 <<= 1;

    int var10001;
    for (var8 <<= 1; var5 < var8; var4 += var12) {
      var1 = var4 >> 8;
      byte var14 = var2[var1 - 1];
      var0 = (var14 << 8) + (var2[var1] - var14) * (var4 & 255);
      var10001 = var5++;
      var3[var10001] += var0 * var6 >> 6;
      var10001 = var5++;
      var3[var10001] += var0 * var7 >> 6;
    }

    if (var12 == 0
        || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
      var8 = var9;
    }

    var8 <<= 1;

    for (var1 = var13; var5 < var8; var4 += var12) {
      var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
      var10001 = var5++;
      var3[var10001] += var0 * var6 >> 6;
      var10001 = var5++;
      var3[var10001] += var0 * var7 >> 6;
    }

    var11.anInt3474 = var4;
    return var5 >> 1;
  }

  public static int method454(int var0, int var1) {
    return var1 < 0 ?
        -var0 :
        (int) (var0 * Math.sqrt(var1 * 1.220703125E-4D) + 0.5D);
  }

  public static int method455(int var1, byte[] var2, int[] var3,
      int var4,
      int var5, int var6, int var7, int var8, int var9,
      AudioStreamEncoder1 var10, int var11, int var12) {
    if (var11 == 0
        || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
      var7 = var8;
    }

    int var10001;
    byte var13;
    while (var5 < var7) {
      var1 = var4 >> 8;
      var13 = var2[var1];
      var10001 = var5++;
      var3[var10001] +=
          ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
      var4 += var11;
    }

    if (var11 == 0
        || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
      var7 = var8;
    }

    for (var1 = var12; var5 < var7; var4 += var11) {
      var13 = var2[var4 >> 8];
      var10001 = var5++;
      var3[var10001] +=
          ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
    }

    var10.anInt3474 = var4;
    return var5;
  }
}
