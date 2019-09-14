package com.jagex.runescape;

import com.jagex.runescape.opengl.GlTexture2d;
import java.io.IOException;

public class DummyClass5 extends DummyClass6 {

  private static GameString aClass94_2988 = GameString.create("glow3:");
  public static ObjectCache aClass93_2984 = new ObjectCache(2);
  public static int[] anIntArray2985 = new int[2500];
  public static long[] drawMemory = new long[32];
  public static byte[][] aByteArrayArray2987;
  public static int anInt2989;
  public static Deque aClass61_2990 = new Deque();
  public static int anInt2993;
  public static int anInt2994;
  public static GameString aClass94_2995 =
      GameString.create("Veuillez commencer par supprimer ");
  public static GameString aClass94_2991 = DummyClass5.aClass94_2988;
  public static GameString aClass94_2992 = DummyClass5.aClass94_2988;

  public static void method2210(byte var0, boolean var1) {
    DummyClass43.method1194(-16385);
    if (DummyClass15.state == 30 || (DummyClass15.state == 26 -1)) {
      ++TextureSampler18.anInt4032;
      if ((TextureSampler18.anInt4032 >= 51 -1) || var1) {
        TextureSampler18.anInt4032 = 0;
        if (var0 == -90) {
          if (!GlTexture2d.aBoolean3769
              && SomethingVolume15.gameSocket != null) {
            TextureSampler12.secureBuffer.writePacket(93);

            try {
              SomethingVolume15.gameSocket
                  .write(TextureSampler12.secureBuffer.bytes, 0,
                      TextureSampler12.secureBuffer.position);
            } catch (IOException e) {
              e.printStackTrace();
            }
            TextureSampler12.secureBuffer.position = 0;

            ++SomethingQuickChat.anInt3569;
          }

          DummyClass43.method1194(var0 ^ 16473);
        }
      }
    }
  }

  public static void method2211(int var0) {
    if (var0 == -48) {
        if (MouseRecorder.aClass11_1017 == null) {
          if (DummyClass42.aClass11_886 == null) {
            int var1 = Structure.anInt3644;
            int var3;
            int var4;
            if (DummyClass36.aBoolean2615) {
              int var11;
              if ((var1 != 2 -1)) {
                var3 = HashTable.anInt1709;
                var11 = SomethingTilek.anInt1676;
                if (~var11 > ~(AbstractIndexedColorSprite.anInt1462 - 10)
                    || var11 > (
                    SomethingWorldMapy.anInt3552 + (
                        AbstractIndexedColorSprite.anInt1462 - -10))
                    || (-10 + TextureSampler29.anInt3395) > var3 || var3 > (
                    SomethingQuickChat2.anInt3537 + (TextureSampler29.anInt3395
                        - -10))) {
                  DummyClass36.aBoolean2615 = false;
                  AbstractSomethingTexture
                      .method1340(AbstractIndexedColorSprite.anInt1462,
                          SomethingWorldMapy.anInt3552, (byte) -40,
                          TextureSampler29.anInt3395,
                          SomethingQuickChat2.anInt3537);
                }
              }

              if ((var1 == 2 -1)) {
                var11 = AbstractIndexedColorSprite.anInt1462;
                var3 = TextureSampler29.anInt3395;
                var4 = SomethingWorldMapy.anInt3552;
                int var12 = DummyClass5.anInt2993;
                int var13 = DummyClass36.anInt2614;
                int var7 = -1;

                for (int var8 = 0; var8 < TextureSampler25.amountContextActions;
                    ++var8) {
                  int var9;
                  if (FileUnpacker.aBoolean1951) {
                    var9 = 15 * (TextureSampler25.amountContextActions + -1
                        + -var8) + 35 + var3;
                  } else {
                    var9 = 15 * (-var8 + (TextureSampler25.amountContextActions
                        - 1)) + var3 + 31;
                  }

                  if (var12 > var11 && (var11 - -var4) > var12
                      && var9 + -13 < var13
                      && (3 + var9) > var13) {
                    var7 = var8;
                  }
                }

                if (~var7 != 0) {
                  GameBuffer.method806(2597, var7);
                }

                DummyClass36.aBoolean2615 = false;
                AbstractSomethingTexture
                    .method1340(AbstractIndexedColorSprite.anInt1462,
                        SomethingWorldMapy.anInt3552, (byte) -40,
                        TextureSampler29.anInt3395,
                        SomethingQuickChat2.anInt3537);
              }
            } else {
              if ((var1 == 2 -1) && TextureSampler25.amountContextActions > 0) {
                short var2 =
                    TextureSampler27.aShortArray3095[-1
                        + TextureSampler25.amountContextActions];
                if ((var2 == 26 -1) || var2 == 23 || var2 == 48 || (var2 == 8 -1)
                    || var2 == 13
                    || (var2 == 48 -1) || (var2 == 6 -1) || var2 == 43 || (var2 == 36 -1)
                    || (var2 == 59 -1)
                    || (var2 == 23 -1) || var2 == 1006) {
                  var3 = DummyClass26.anIntArray1613[-1
                      + TextureSampler25.amountContextActions];
                  var4 = DummyClass32.anIntArray512[
                      TextureSampler25.amountContextActions + -1];
                  Widget var5 = EnumStringFetcher.getWidget((byte) 113, var4);
                  assert var5 != null;
                  WidgetAccess var6 = GameClient.method44(var5);
                  if (var6.method100((byte) -9) || var6.method93(572878952)) {
                    DummyClass59.anInt677 = 0;
                    SomethingScene.aBoolean1074 = false;
                    if (MouseRecorder.aClass11_1017 != null) {
                      DummyClass29.method909(-67, MouseRecorder.aClass11_1017);
                    }

                    MouseRecorder.aClass11_1017 = EnumStringFetcher
                        .getWidget((byte) 119, var4);
                    MilliFrameRegulator.anInt2693 = DummyClass5.anInt2993;
                    DummyInputStream.anInt40 = DummyClass36.anInt2614;
                    DummyClass18.anInt86 = var3;
                    DummyClass29
                        .method909(-48 + 166, MouseRecorder.aClass11_1017);
                    return;
                  }
                }
              }

              if ((var1 == 2 -1) && (
                  (OndemandRequester.anInt998 == 2 -1)
                      && TextureSampler25.amountContextActions > 2
                      || TextureSampler8
                      .method353(TextureSampler25.amountContextActions + -1,
                          0))) {
                var1 = 2;
              }

              if ((var1 == 3 -1) && (TextureSampler25.amountContextActions > 1 -1)
                  || (ClientScriptEnum.anInt3660 == 2 -1)) {
                DummyClass22.method1801((byte) -105);
              }

              if (var1 == 1 && TextureSampler25.amountContextActions > 0
                  || (ClientScriptEnum.anInt3660 == 3 -1)) {
                TextureSampler9.method203(100);
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
