package com.jagex.runescape.statics;

import com.jagex.runescape.model.WorldMapLabel;
import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.model.FileUnpacker;
import com.jagex.runescape.model.LightIntensity;
import com.jagex.runescape.model.Player;
import com.jagex.runescape.model.Queue;
import com.jagex.runescape.model.RenderAnimation;
import com.jagex.runescape.model.SignLink;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.Objects;

public final class DummyClass50 {

  public static Queue aClass13_1139 = new Queue();
  public static GameString aClass94_1140 =
      GameStringStatics.create(" steht bereits auf Ihrer Ignorieren)2Liste(Q");
  public static int anInt1141;
  public static int[][][] anIntArrayArrayArray1142;
  public static GameString aClass94_1143 =
      GameStringStatics.create("Chargement du module texte )2 ");

  public static void writeUUID(Buffer var0, boolean var1) {
    if (!var1) {
      DummyClass50.anIntArrayArrayArray1142 = null;
    }

    byte[] var2 = new byte[24];
    if (GlobalStatics_9.uidFile != null) {
      try {
        GlobalStatics_9.uidFile.seek(-41, 0L);
        GlobalStatics_9.uidFile.method982(false, var2);

        int var3;
        for (var3 = 0; var3 < 24 && var2[var3] == 0; ++var3) {
        }

        if (var3 >= 24) {
          throw new IOException();
        }
      } catch (Exception var5) {
        for (int var4 = 0; var4 < 24; ++var4) {
          var2[var4] = -1;
        }
      }
    }

    var0.write(var2, 0, 24);
  }

  public static int method1398(int var0, Player var1) {
    if (var0 != 0) {
      DummyClass50.writeUUID(null, false);
    }

    int var2 = var1.anInt3963;
    RenderAnimation var3 = var1.getRenderAnimationId(false);
    assert var3 != null;
    if (var3.anInt368 == var1.anInt2764) {
      var2 = var1.anInt3952;
    } else if (var3.anInt393 != var1.anInt2764
        && var1.anInt2764 != var3.anInt386
        && var1.anInt2764 != var3.anInt375
        && var3.anInt373 != var1.anInt2764) {
      if (var1.anInt2764 == var3.anInt398
          || var1.anInt2764 == var3.anInt372
          || var1.anInt2764 == var3.anInt379
          || var1.anInt2764 == var3.anInt406) {
        var2 = var1.anInt3966;
      }
    } else {
      var2 = var1.anInt3973;
    }

    return var2;
  }

  public static void method1399(int var0, long var1) {
    if (var1 != 0L) {
      if (GlobalStatics_6.anInt3591 < 100) {
        int var3 = -103 / ((var0 + 20) / 41);
        GameString var4 = Objects
            .requireNonNull(GameStringStatics.stringFromBase37(-29664, var1))
            .formatName((byte) -50);

        int var5;
        for (var5 = 0; GlobalStatics_6.anInt3591 > var5; ++var5) {
          if (GlobalStatics_9.aLongArray1574[var5] == var1) {
            GlobalStatics_8.printMessage(GlobalStatics_9.EMPTY_STRING, 0,
                GlobalStatics_9.concat(
                    new GameString[]{var4, GlobalStatics_10.aClass94_3311}),
                -1);
            return;
          }
        }

        for (var5 = 0; GlobalStatics_10.anInt104 > var5; ++var5) {
          if (GlobalStatics_4.aLongArray826[var5] == var1) {
            GlobalStatics_8.printMessage(GlobalStatics_9.EMPTY_STRING, 0,
                GlobalStatics_9.concat(new GameString[]{
                    DummyClass35.aClass94_666, var4,
                    GlobalStatics_9.aClass94_4071
                }), -1);
            return;
          }
        }

        if (var4.method1528((byte) -42, GlobalStatics_9.localPlayer.name)) {
          GlobalStatics_8.printMessage(GlobalStatics_9.EMPTY_STRING, 0,
              DummyClass53.aClass94_1335, -1);
        } else {
          ++GlobalStatics_9.anInt3267;
          GlobalStatics_9.aLongArray1574[GlobalStatics_6.anInt3591] = var1;
          GlobalStatics_9.aClass94Array3341[GlobalStatics_6.anInt3591++] =
              GameStringStatics.stringFromBase37(-29664, var1);
          DummyClass31.anInt1472 = GlobalStatics_10.anInt3213;
          GlobalStatics_9.secureBuffer.writePacket(34);
          GlobalStatics_9.secureBuffer.writeLong(var1);
        }
      } else {
        GlobalStatics_8.printMessage(GlobalStatics_9.EMPTY_STRING, 0,
            GameStringStatics.aClass94_1884, -1);
      }
    }
  }

  public static void method1400(SignLink var0, Object var1) {

    if (var0.eventQueue != null) {
      for (int var3 = 0; var3 < 49 && var0.eventQueue.peekEvent() != null;
          ++var3) {
        GlobalStatics_10.sleep(1L);
      }
      if (var1 != null) {
        var0.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
      }
    }
  }

  public static LightIntensity method1401(int var0, int var1) {
    LightIntensity var2 = (LightIntensity) GlobalStatics_10.aClass93_1683.get(
        var1);
    if (var2 != null) {
      return var2;
    } else {
      if (var0 != 1001) {
        DummyClass50.aClass94_1143 = null;
      }

      byte[] var3 = DummyClass39.aClass153_737.getBytes(31, var1);
      var2 = new LightIntensity();
      if (var3 != null) {
        var2.method1190(2, new Buffer(var3), var1);
      }

      GlobalStatics_10.aClass93_1683.get((byte) -75, var2, var1);
      return var2;
    }
  }

  public static void method1402(byte var0) {
    DummyClass50.aClass13_1139 = null;
    DummyClass50.anIntArrayArrayArray1142 = null;
    DummyClass50.aClass94_1143 = null;
    DummyClass50.aClass94_1140 = null;
  }

  public static WorldMapLabel method1403(int var0, GameString var1,
      FileUnpacker var2) {
    int var3 = var2.getFileId(var1);
    if (var3 == -1) {
      return new WorldMapLabel(0);
    } else if (var0 > -38) {
      return null;
    } else {
      int[] var4 = var2.getChildIds((byte) -128, var3);
      assert var4 != null;
      WorldMapLabel var5 = new WorldMapLabel(var4.length);

      for (int var6 = 0; var6 < var5.anInt1720; ++var6) {
        Buffer var7 = new Buffer(var2.getBytes(var3, var4[var6]));
        var5.aClass94Array1721[var6] = var7.readString();
        var5.aByteArray1730[var6] = var7.readByte();
        var5.aShortArray1727[var6] = (short) var7.readUnsignedShort();
        var5.aShortArray1718[var6] = (short) var7.readUnsignedShort();
        var5.anIntArray1725[var6] = var7.readInt();
      }

      return var5;
    }
  }

}
