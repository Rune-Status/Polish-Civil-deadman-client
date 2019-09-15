package com.jagex.runescape;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.node.Deque;
import com.jagex.runescape.opengl.GlTexture2d;
import java.io.IOException;

public class DummyClass5 extends DummyClass6 {

  private static GameString aClass94_2988 = GameStringStatics.create("glow3:");
  public static ObjectCache aClass93_2984 = new ObjectCache(2);
  public static int[] anIntArray2985 = new int[2500];
  public static long[] drawMemory = new long[32];
  public static byte[][] aByteArrayArray2987;
  public static int anInt2989;
  public static Deque aClass61_2990 = new Deque();
  public static int anInt2993;
  public static int anInt2994;
  public static GameString aClass94_2995 =
      GameStringStatics.create("Veuillez commencer par supprimer ");
  public static GameString aClass94_2991 = DummyClass5.aClass94_2988;
  public static GameString aClass94_2992 = DummyClass5.aClass94_2988;

  public static void method2210(byte var0, boolean var1) {
    DummyClass43.method1194(-16385);
    if (DummyClass15.state == 30 || (DummyClass15.state == 25)) {
      ++GlobalStatics_10.anInt4032;
      if ((GlobalStatics_10.anInt4032 >= 50) || var1) {
        GlobalStatics_10.anInt4032 = 0;
        if (var0 == -90) {
          if (!GlTexture2d.aBoolean3769
              && GlobalStatics_9.gameSocket != null) {
            GlobalStatics_9.secureBuffer.writePacket(93);

            try {
              GlobalStatics_9.gameSocket
                  .write(GlobalStatics_9.secureBuffer.bytes, 0,
                      GlobalStatics_9.secureBuffer.position);
            } catch (IOException e) {
              e.printStackTrace();
            }
            GlobalStatics_9.secureBuffer.position = 0;

            ++GlobalStatics_9.anInt3569;
          }

          DummyClass43.method1194(var0 ^ 16473);
        }
      }
    }
  }

  public static void method2211(int var0) {
    if (var0 == -48) {
        if (GlobalStatics_9.aClass11_1017 == null) {
          if (DummyClass42.aClass11_886 == null) {
            int var1 = GlobalStatics_9.anInt3644;
            int var3;
            int var4;
            if (DummyClass36.aBoolean2615) {
              int var11;
              if ((var1 != 1)) {
                var3 = GlobalStatics_0.anInt1709;
                var11 = GlobalStatics_9.anInt1676;
                if ((var11 < (GlobalStatics_1.anInt1462 - 10))
                    || var11 > (
                    GlobalStatics_9.anInt3552 + (
                        GlobalStatics_1.anInt1462 + 10))
                    || (-10 + GlobalStatics_10.anInt3395) > var3 || var3 > (
                    GlobalStatics_9.anInt3537 + (GlobalStatics_10.anInt3395
                        + 10))) {
                  DummyClass36.aBoolean2615 = false;
                  GlobalStatics_3
                      .method1340(GlobalStatics_1.anInt1462,
                          GlobalStatics_9.anInt3552, (byte) -40,
                          GlobalStatics_10.anInt3395,
                          GlobalStatics_9.anInt3537);
                }
              }

              if ((var1 == 1)) {
                var11 = GlobalStatics_1.anInt1462;
                var3 = GlobalStatics_10.anInt3395;
                var4 = GlobalStatics_9.anInt3552;
                int var12 = DummyClass5.anInt2993;
                int var13 = DummyClass36.anInt2614;
                int var7 = -1;

                for (int var8 = 0; var8 < GlobalStatics_10.amountContextActions;
                    ++var8) {
                  int var9;
                  if (GlobalStatics_8.aBoolean1951) {
                    var9 = 15 * (GlobalStatics_10.amountContextActions - 1
                        - var8) + 35 + var3;
                  } else {
                    var9 = 15 * (-var8 + (GlobalStatics_10.amountContextActions
                        - 1)) + var3 + 31;
                  }

                  if (var12 > var11 && (var11 + var4) > var12
                      && var9 - 13 < var13
                      && (3 + var9) > var13) {
                    var7 = var8;
                  }
                }

                if ((var7 != -1)) {
                  GlobalStatics_8.method806(2597, var7);
                }

                DummyClass36.aBoolean2615 = false;
                GlobalStatics_3
                    .method1340(GlobalStatics_1.anInt1462,
                        GlobalStatics_9.anInt3552, (byte) -40,
                        GlobalStatics_10.anInt3395,
                        GlobalStatics_9.anInt3537);
              }
            } else {
              if ((var1 == 1) && GlobalStatics_10.amountContextActions > 0) {
                short var2 =
                    GlobalStatics_10.aShortArray3095[-1
                        + GlobalStatics_10.amountContextActions];
                if ((var2 == 25) || var2 == 23 || var2 == 48 || (var2 == 7)
                    || var2 == 13
                    || (var2 == 47) || (var2 == 5) || var2 == 43 || (var2 == 35)
                    || (var2 == 58)
                    || (var2 == 22) || var2 == 1006) {
                  var3 = DummyClass26.anIntArray1613[-1
                      + GlobalStatics_10.amountContextActions];
                  var4 = DummyClass32.anIntArray512[
                      GlobalStatics_10.amountContextActions - 1];
                  Widget var5 = GlobalStatics_7.getWidget((byte) 113, var4);
                  assert var5 != null;
                  WidgetAccess var6 = GlobalStatics_8.method44(var5);
                  if (var6.method100((byte) -9) || var6.method93(572878952)) {
                    DummyClass59.anInt677 = 0;
                    GlobalStatics_9.aBoolean1074 = false;
                    if (GlobalStatics_9.aClass11_1017 != null) {
                      DummyClass29.method909(-67, GlobalStatics_9.aClass11_1017);
                    }

                    GlobalStatics_9.aClass11_1017 = GlobalStatics_7
                        .getWidget((byte) 119, var4);
                    GlobalStatics_9.anInt2693 = DummyClass5.anInt2993;
                    GlobalStatics_2.anInt40 = DummyClass36.anInt2614;
                    DummyClass18.anInt86 = var3;
                    DummyClass29
                        .method909(118, GlobalStatics_9.aClass11_1017);
                    return;
                  }
                }
              }

              if ((var1 == 1) && (
                  (GlobalStatics_9.anInt998 == 1)
                      && GlobalStatics_10.amountContextActions > 2
                      || GlobalStatics_9
                      .method353(GlobalStatics_10.amountContextActions - 1,
                          0))) {
                var1 = 2;
              }

              if ((var1 == 2) && (GlobalStatics_10.amountContextActions > 0)
                  || (GlobalStatics_7.anInt3660 == 1)) {
                DummyClass22.method1801((byte) -105);
              }

              if (var1 == 1 && GlobalStatics_10.amountContextActions > 0
                  || (GlobalStatics_7.anInt3660 == 2)) {
                GlobalStatics_9.method203(100);
              }
            }

          }
        }
      }
  }

  public static void method2212(boolean var0) {
    DummyClass5.anIntArray2985 = null;
      DummyClass5.aClass94_2988 = null;
      DummyClass5.aClass93_2984 = null;
      DummyClass5.aClass61_2990 = null;
      DummyClass5.drawMemory = null;
      if (var0) {
        DummyClass5.method2211(68);
      }

      DummyClass5.aClass94_2992 = null;
      DummyClass5.aByteArrayArray2987 = null;
      DummyClass5.aClass94_2995 = null;
      DummyClass5.aClass94_2991 = null;
  }

}
