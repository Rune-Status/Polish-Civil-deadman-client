package com.jagex.runescape.statics;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.cache.CacheStatics;
import com.jagex.runescape.cache.FileUnpacker;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.model.AbstractDirectColorSprite;
import com.jagex.runescape.model.AnimationSequence;
import com.jagex.runescape.model.Player;
import com.jagex.runescape.model.SomethingQuickChatK;
import com.jagex.runescape.node.SubNode;
import java.util.Objects;

public final class DummyClass38 {

  public static GameString aClass94_728 = GameStringStatics
      .create("leuchten2:");
  public static int[] anIntArray729 = new int[4096];
  public static float aFloat730;
  public static FileUnpacker aClass153_731;
  public static int anInt733;
  public static int anInt734;
  public static int floorShadowsFileId;
  public static AbstractDirectColorSprite aClass3_Sub28_Sub16_736;

  public static void method1080(int var0, int var1, byte var2, Player var3) {
    int var4;
    int var5;
    int var7;
    if ((var0 & 128) != 0) {
      var4 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortLE();
      var5 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      int var6 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      var7 = GlobalStatics_9.GAME_BUFFER.position;
      boolean var8 = (0x8000 & var4) != 0;
      if (var3.name != null && var3.appearance != null) {
        long var9 = var3.name.toBase37();
        boolean var11 = false;
        if (var5 <= 1) {
          if (!var8 && (
              GlobalStatics_9.aBoolean2433 && !GlobalStatics_6.aBoolean1641
                  || GlobalStatics_10.aBoolean3166)) {
            var11 = true;
          } else {
            for (int var12 = 0; var12 < GlobalStatics_6.anInt3591; ++var12) {
              if (GlobalStatics_9.aLongArray1574[var12] == var9) {
                var11 = true;
                break;
              }
            }
          }
        }

        if (!var11 && GlobalStatics_9.IS_ON_TUTORIAL_ISLAND == 0) {
          DummyClass12.aClass3_Sub30_2030.position = 0;
          GlobalStatics_9.GAME_BUFFER
              .method774(2, var6, DummyClass12.aClass3_Sub30_2030.bytes,
                  0);
          DummyClass12.aClass3_Sub30_2030.position = 0;
          int var13 = -1;
          GameString var25;
          if (var8) {
            SomethingQuickChatK var14 =
                GlobalStatics_5
                    .method2156(1024, DummyClass12.aClass3_Sub30_2030);
            var4 &= 32767;
            var13 = var14.anInt149;
            var25 = var14.aClass3_Sub28_Sub4_151.method555(var2 + 28100,
                DummyClass12.aClass3_Sub30_2030);
          } else {
            var25 = GameStringStatics.otherFormat(
                Objects.requireNonNull(DummyClass34
                    .decompressString(DummyClass12.aClass3_Sub30_2030)
                    .format(78)));
          }

          var3.aClass94_2825 = var25.method1564(1);
          var3.anInt2753 = var4 & 255;
          var3.anInt2814 = 150;
          var3.anInt2837 = var4 >> 8;
          if (var5 == 2) {
            GlobalStatics_9
                .method611(var13, var8 ? 17 : 1, var25, null, (byte) 50,
                    GlobalStatics_9.concat(
                        new GameString[]{DummyClass60.aClass94_444,
                            var3.getFullName()}));
          } else {
            if (var5 == 1) {
              GlobalStatics_9
                  .method611(var13, var8 ? 17 : 1, var25, null, (byte) 50,
                      GlobalStatics_9.concat(
                          new GameString[]{DummyClass34.aClass94_592,
                              var3.getFullName()}));
            } else {
              GlobalStatics_9
                  .method611(var13, var8 ? 17 : 2, var25, null, (byte) 50,
                      var3.getFullName());
            }
          }
        }
      }

      GlobalStatics_9.GAME_BUFFER.position = var7 + var6;
    }

    if ((var0 & 1) != 0) {
      var4 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortSmart();
      var5 = GlobalStatics_9.GAME_BUFFER.method751();
      var3.method1970(var5, -8, GlobalStatics_4.updateCycle, var4);
      var3.anInt2781 = 300 + GlobalStatics_4.updateCycle;
      var3.anInt2775 = GlobalStatics_9.GAME_BUFFER.method754(true);
    }

    if ((var0 & 8) != 0) {
      var4 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
      if (var4 == 65535) {
        var4 = -1;
      }

      var5 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      GlobalStatics_9.method628(0, var5, var4, var3);
    }

    if ((4 & var0) != 0) {
      var4 = GlobalStatics_9.GAME_BUFFER.method751();
      byte[] var16 = new byte[var4];
      Buffer var19 = new Buffer(var16);
      GlobalStatics_9.GAME_BUFFER.copy(0, var4, var16);
      DummyClass45.configs[var1] = var19;
      var3.parseConfig(var19);
    }

    if ((2 & var0) != 0) {
      var3.anInt2772 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortAdd();
      if (var3.anInt2772 == 65535) {
        var3.anInt2772 = -1;
      }
    }

    if ((1024 & var0) != 0) {
      var3.anInt2784 = GlobalStatics_9.GAME_BUFFER.method786(true);
      var3.anInt2835 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      var3.anInt2823 = GlobalStatics_9.GAME_BUFFER.method751();
      var3.anInt2798 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      var3.anInt2800 =
          GlobalStatics_9.GAME_BUFFER.readUnsignedShortLE()
              + GlobalStatics_4.updateCycle;
      var3.anInt2790 =
          GlobalStatics_9.GAME_BUFFER.readUnsignedShortLE()
              + GlobalStatics_4.updateCycle;
      var3.anInt2840 = GlobalStatics_9.GAME_BUFFER.method786(true);
      var3.anInt2816 = 1;
      var3.anInt2811 = 0;
    }

    if ((var0 & 32) != 0) {
      var3.aClass94_2825 = GlobalStatics_9.GAME_BUFFER.readString();
      if (var3.aClass94_2825.charAt(0) == 126) {
        var3.aClass94_2825 = var3.aClass94_2825.substring(1);
        GlobalStatics_8
            .printMessage(var3.getFullName(), 2, var3.aClass94_2825, var2 ^ 78);
      } else if (var3 == GlobalStatics_9.localPlayer) {
        GlobalStatics_8
            .printMessage(var3.getFullName(), 2, var3.aClass94_2825, var2 + 78);
      }

      var3.anInt2753 = 0;
      var3.anInt2837 = 0;
      var3.anInt2814 = 150;
    }

    if ((var0 & 512) != 0) {
      var4 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortSmart();
      var5 = GlobalStatics_9.GAME_BUFFER.method754(true);
      var3.method1970(var5, var2 + 71, GlobalStatics_4.updateCycle, var4);
    }

    if ((2048 & var0) != 0) {
      var4 = GlobalStatics_9.GAME_BUFFER.method786(true);
      int[] var18 = new int[var4];
      int[] var17 = new int[var4];
      int[] var20 = new int[var4];

      for (int var22 = 0; var4 > var22; ++var22) {
        int var23 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortLE();
        if (var23 == 0xffff) {
          var23 = -1;
        }

        var18[var22] = var23;
        var17[var22] = GlobalStatics_9.GAME_BUFFER.method751();
        var20[var22] = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
      }

      GlobalStatics_9.method1342(var17, var18, var3, (byte) -113, var20);
    }

    if ((256 & var0) != 0) {
      var4 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortLE();
      if (var4 == 0xffff) {
        var4 = -1;
      }

      var5 = GlobalStatics_9.GAME_BUFFER.readInt((byte) -73);
      boolean var21 = true;
      if (var4 != -1 && var3.anInt2842 != -1 &&
          GlobalStatics_8
              .method45(GlobalStatics_9.method898((byte) 42, var4).anInt542,
                  (byte) -20).anInt1857 < GlobalStatics_8.method45(
              GlobalStatics_9.method898((byte) 42, var3.anInt2842).anInt542,
              (byte) -20).anInt1857) {
        var21 = false;
      }

      if (var21) {
        var3.anInt2759 = (var5 & 0xffff) + GlobalStatics_4.updateCycle;
        var3.anInt2761 = 0;
        var3.anInt2805 = 0;
        var3.anInt2842 = var4;
        if (var3.anInt2759 > GlobalStatics_4.updateCycle) {
          var3.anInt2805 = -1;
        }

        var3.anInt2799 = var5 >> 16;
        var3.anInt2826 = 1;
        if (var3.anInt2842 != -1
            && GlobalStatics_4.updateCycle == var3.anInt2759) {
          var7 = GlobalStatics_9.method898((byte) 42, var3.anInt2842).anInt542;
          if (var7 != -1) {
            AnimationSequence var24 = GlobalStatics_8
                .method45(var7, (byte) -20);
            if (var24.anIntArray1851 != null) {
              GlobalStatics_4
                  .method1470(var3.sceneY, var24, 183921384, var3.sceneX,
                      var3 == GlobalStatics_9.localPlayer, 0);
            }
          }
        }
      }
    }

    if (var2 == -79) {
      if ((var0 & 64) != 0) {
        var3.anInt2786 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
        var3.anInt2762 = GlobalStatics_9.GAME_BUFFER.readShortLEAdd();
      }

    }
  }

  public static void method1081(byte var0) {
    DummyClass38.aClass3_Sub28_Sub16_736 = null;
    DummyClass38.anIntArray729 = null;
    DummyClass38.aClass94_728 = null;
    if (var0 <= 63) {
      DummyClass38.loadSprites(null, -60);
    }

    DummyClass38.aClass153_731 = null;
  }

  public static void loadSprites(byte[] var0, int var1) {
    Buffer var2 = new Buffer(var0);
    var2.position = -2 + var0.length;
    DummyClass53.spriteCount = var2.readUnsignedShort();
    GlobalStatics_10.anIntArray3076 = new int[DummyClass53.spriteCount];
    GlobalStatics_9.anIntArray2931 = new int[DummyClass53.spriteCount];
    GlobalStatics_9.anIntArray2048 = new int[DummyClass53.spriteCount];
    GlobalStatics_9.aBooleanArray3272 = new boolean[DummyClass53.spriteCount];
    DummyClass4.aByteArrayArray3005 = new byte[DummyClass53.spriteCount][];
    GlobalStatics_0.anIntArray2591 = new int[DummyClass53.spriteCount];
    DummyClass5.aByteArrayArray2987 = new byte[DummyClass53.spriteCount][];
    var2.position = -(8 * DummyClass53.spriteCount) + var0.length - 7;
    GlobalStatics_9.anInt2426 = var2.readUnsignedShort();
    GlobalStatics_9.anInt1748 = var2.readUnsignedShort();
    int var3 = (var2.readUnsignedByte() & 255) + 1;

    int var4;
    for (var4 = 0; var4 < DummyClass53.spriteCount; ++var4) {
      GlobalStatics_9.anIntArray2048[var4] = var2.readUnsignedShort();
    }

    if (var1 < 11) {
      DummyClass38.method1081((byte) -52);
    }

    for (var4 = 0; var4 < DummyClass53.spriteCount; ++var4) {
      GlobalStatics_0.anIntArray2591[var4] = var2.readUnsignedShort();
    }

    for (var4 = 0; DummyClass53.spriteCount > var4; ++var4) {
      GlobalStatics_9.anIntArray2931[var4] = var2.readUnsignedShort();
    }

    for (var4 = 0; var4 < DummyClass53.spriteCount; ++var4) {
      GlobalStatics_10.anIntArray3076[var4] = var2.readUnsignedShort();
    }

    var2.position =
        -(8 * DummyClass53.spriteCount) + var0.length - 7 + 3 - var3 * 3;
    GlobalStatics_10.anIntArray3446 = new int[var3];

    for (var4 = 1; var4 < var3; ++var4) {
      GlobalStatics_10.anIntArray3446[var4] = var2
          .readUnsignedMedium((byte) 122);
      if (GlobalStatics_10.anIntArray3446[var4] == 0) {
        GlobalStatics_10.anIntArray3446[var4] = 1;
      }
    }

    var2.position = 0;

    for (var4 = 0; var4 < DummyClass53.spriteCount; ++var4) {
      int var5 = GlobalStatics_9.anIntArray2931[var4];
      int var6 = GlobalStatics_10.anIntArray3076[var4];
      int var7 = var5 * var6;
      byte[] var8 = new byte[var7];
      boolean var10 = false;
      DummyClass5.aByteArrayArray2987[var4] = var8;
      byte[] var9 = new byte[var7];
      DummyClass4.aByteArrayArray3005[var4] = var9;
      int var11 = var2.readUnsignedByte();
      int var12;
      if ((1 & var11) == 0) {
        for (var12 = 0; var7 > var12; ++var12) {
          var8[var12] = var2.readByte();
        }

        if ((2 & var11) != 0) {
          for (var12 = 0; var12 < var7; ++var12) {
            byte var16 = var9[var12] = var2.readByte();
            var10 |= var16 != -1;
          }
        }
      } else {
        int var13;
        for (var12 = 0; var12 < var5; ++var12) {
          for (var13 = 0; var13 < var6; ++var13) {
            var8[var12 + var13 * var5] = var2.readByte();
          }
        }

        if ((var11 & 2) != 0) {
          for (var12 = 0; var12 < var5; ++var12) {
            for (var13 = 0; var13 < var6; ++var13) {
              byte var14 = var9[var5 * var13 + var12] = var2.readByte();
              var10 |= var14 != -1;
            }
          }
        }
      }

      GlobalStatics_9.aBooleanArray3272[var4] = var10;
    }
  }

  public static void method1084(SubNode var0, SubNode var1, byte var2) {
    if (var1.prevSubNode != null) {
      var1.unlinkSubNode();
    }

    var1.prevSubNode = var0;
    var1.nextSubNode = var0.nextSubNode;
    var1.prevSubNode.nextSubNode = var1;
    if (var2 <= 101) {
      CacheStatics.errorOccurred = true;
    }

    var1.nextSubNode.prevSubNode = var1;
  }

}
