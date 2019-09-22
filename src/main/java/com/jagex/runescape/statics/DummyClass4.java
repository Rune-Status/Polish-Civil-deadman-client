package com.jagex.runescape.statics;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import java.util.Objects;

public final class DummyClass4 extends DummyClass6 {

  public static int[] anIntArray2999;
  public static GameString aClass94_3000 = GameStringStatics
      .create("; Max)2Age=");
  public static int anInt3001;
  public static GameString aClass94_3002 = GameStringStatics.create("M");
  public static GameString[] aClass94Array3003 = new GameString[100];
  public static byte[][] aByteArrayArray3005;
  public static GameString aClass94_3006 = GameStringStatics
      .create("<col=ff3000>");
  public static int[] anIntArray3007 = {-1, -1, 1, 1};

  public static void method2227(byte var0) {
    DummyClass4.aClass94_3006 = null;
    DummyClass4.anIntArray3007 = null;
    DummyClass4.aClass94Array3003 = null;
    if (var0 == 37) {
      DummyClass4.aByteArrayArray3005 = null;
      DummyClass4.aClass94_3002 = null;
      DummyClass4.aClass94_3000 = null;
      DummyClass4.anIntArray2999 = null;
    }
  }

  public static void parsePlayerUpdate(byte var0) {
    GlobalStatics_9.anInt997 = 0;
    DummyClass17.anInt1829 = 0;
    GlobalStatics_7.method2100((byte) 81);
    GlobalStatics_8.method1964(false);
    GlobalStatics_10.method1786(-59);
    GlobalStatics_11.method58(-102);
    if (var0 <= -69) {
      int var1;
      for (var1 = 0; DummyClass17.anInt1829 > var1; ++var1) {
        int var2 = GlobalStatics_10.anIntArray2292[var1];
        if (GlobalStatics_4.updateCycle
            != GlobalStatics_9.PLAYERS[var2].anInt2838) {
          if (GlobalStatics_9.PLAYERS[var2].anInt3969 > 0) {
            DummyClass11.method2203(GlobalStatics_9.PLAYERS[var2], 8);
          }

          GlobalStatics_9.PLAYERS[var2] = null;
        }
      }

      if (GlobalStatics_0.packetLength
          == GlobalStatics_9.GAME_BUFFER.position) {
        for (var1 = 0; var1 < DummyClass13.anInt2022; ++var1) {
          if (GlobalStatics_9.PLAYERS[DummyClass42.anIntArray887[var1]]
              == null) {
            throw new RuntimeException(
                "gpp2 pos:" + var1 + " size:" + DummyClass13.anInt2022);
          }
        }

      } else {
        throw new RuntimeException(
            "gpp1 pos:" + GlobalStatics_9.GAME_BUFFER.position + " psize:"
                + com.jagex.runescape.statics.GlobalStatics_0.packetLength);
      }
    }
  }

  public static void method2229(long var0, byte var2) {
    if (var0 != 0L) {
      if ((GlobalStatics_10.anInt104 < 100 || GlobalStatics_9.aBoolean3358)
          && GlobalStatics_10.anInt104 < 200) {
        GameString var3 = Objects
            .requireNonNull(GameStringStatics.stringFromBase37(-29664, var0))
            .formatName((byte) -50);
        if (var2 != -91) {
          DummyClass4.method2227((byte) 22);
        }

        int var4;
        for (var4 = 0; GlobalStatics_10.anInt104 > var4; ++var4) {
          if (GlobalStatics_8.aLongArray826[var4] == var0) {
            GlobalStatics_8.printMessage(GameStringStatics.EMPTY_STRING, 0,
                GlobalStatics_9.concat(
                    new GameString[]{var3, GameStringStatics.aClass94_3645}),
                -1);
            return;
          }
        }

        for (var4 = 0; GlobalStatics_6.anInt3591 > var4; ++var4) {
          if (var0 == GlobalStatics_9.aLongArray1574[var4]) {
            GlobalStatics_8.printMessage(GameStringStatics.EMPTY_STRING, 0,
                GlobalStatics_9.concat(
                    new GameString[]{GameStringStatics.aClass94_662, var3,
                        GlobalStatics_8.aClass94_4}), -1);
            return;
          }
        }

        if (var3.method1528((byte) -42, GlobalStatics_9.localPlayer.name)) {
          GlobalStatics_8.printMessage(GameStringStatics.EMPTY_STRING, 0,
              GlobalStatics_8.aClass94_957, -1);
        } else {
          ++GlobalStatics_9.anInt544;
          GameStringStatics.aClass94Array1046[GlobalStatics_10.anInt104] = var3;
          GlobalStatics_8.aLongArray826[GlobalStatics_10.anInt104] = var0;
          GlobalStatics_7.anIntArray882[GlobalStatics_10.anInt104] = 0;
          GlobalStatics_2.aClass94Array2566[GlobalStatics_10.anInt104] = GameStringStatics.EMPTY_STRING;
          GlobalStatics_9.anIntArray904[GlobalStatics_10.anInt104] = 0;
          com.jagex.runescape.statics.GlobalStatics_0.aBooleanArray73[GlobalStatics_10.anInt104] = false;
          ++GlobalStatics_10.anInt104;
          DummyClass31.anInt1472 = GlobalStatics_10.anInt3213;
          GlobalStatics_9.SECURE_BUFFER.writePacket(120);
          GlobalStatics_9.SECURE_BUFFER.writeLong(var0);
        }
      } else {
        GlobalStatics_8.printMessage(GameStringStatics.EMPTY_STRING, 0,
            DummyClass8.aClass94_4024, -1);
      }
    }
  }

}
