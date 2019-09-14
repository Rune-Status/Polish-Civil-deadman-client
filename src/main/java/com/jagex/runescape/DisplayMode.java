package com.jagex.runescape;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;

public final class DisplayMode {

  private static GameString aClass94_1440 =
    GameStringStatics.create("Connected to update server");
  public static int anInt1439;
  public static boolean useBumpMaps = true;
  public static int viewY;
  public static MouseRecorder aClass67_1443;
  public static short aShort1444 = 256;
  public static int loopCycle;
  public static boolean aBoolean1451;
  public static GameString CONNECTED_TO_UPDATE_SERVER = DisplayMode.aClass94_1440;
  public int anInt1447;
  public int anInt1448;
  public int anInt1449;
  public int anInt1450;

  public static void method1642(int var0, GameString var1) {
    if (ClientScript.aClass3_Sub19Array3694 != null) {
        if (var0 != 3803) {
          DisplayMode.aClass67_1443 = null;
        }

        long var3 = var1.toBase37();
        int var2 = 0;
        if (var3 != 0L) {
          while (ClientScript.aClass3_Sub19Array3694.length > var2
            && (ClientScript.aClass3_Sub19Array3694[var2].key != var3)) {
            ++var2;
          }

          if (var2 < ClientScript.aClass3_Sub19Array3694.length
            && ClientScript.aClass3_Sub19Array3694[var2] != null) {
            ++DummyClass37.anInt671;
            TextureSampler12.secureBuffer.writePacket(162);
            TextureSampler12.secureBuffer.writeLong(ClientScript.aClass3_Sub19Array3694[var2].key);
          }
        }
      }
  }

  public static int method1643(int var0, boolean var1, int var2, int var3) {
    if (var0 != 10131) {
        DisplayMode.method1644((byte) 95);
      }

      Inventory var4 = (Inventory) GlobalStatics_2.aClass130_2220.get(var2);
      if (var4 != null) {
        int var5 = 0;

        for (int var6 = 0; var4.ids.length > var6; ++var6) {
          if (var4.ids[var6] >= 0 && TextureSampler39.anInt3287 > var4.ids[var6]) {
            ItemConfig var7 = DummyClass35.getItemConfig(var4.ids[var6], (byte) 79);
            if (var7.aClass130_798 != null) {
              IntegerNode var8 = (IntegerNode) var7.aClass130_798.get(var3);
              if (var8 != null) {
                if (var1) {
                  var5 += var4.counts[var6] * var8.anInt2467;
                } else {
                  var5 += var8.anInt2467;
                }
              }
            }
          }
        }

        return var5;
      } else {
        return 0;
      }
  }

  public static void method1644(byte var0) {
    DisplayMode.aClass67_1443 = null;

      DisplayMode.CONNECTED_TO_UPDATE_SERVER = null;
      DisplayMode.aClass94_1440 = null;
  }

}
