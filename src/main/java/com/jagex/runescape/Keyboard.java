package com.jagex.runescape;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class Keyboard implements KeyListener, FocusListener {

  public static boolean aBoolean1905 = true;
  public static int anInt1906;
  public static GameString aClass94_1907 = GameStringStatics.create(" autres options");
  public static int anInt1908;
  public static int anInt1909;
  public static int anInt1910;
  public static ObjectCache aClass93_1911 = new ObjectCache(260);
  public static int openingMusicFileId;
  public static GameString aClass94_1913 = GameStringStatics.create("scrollbar");
  public static int anInt1914;
  public static GameString aClass94_1915 = GameStringStatics.create("Null");
  public static FileUnpacker sprites;
  public static GameString aClass94_1917 = GameStringStatics.create(" <col=00ff80>");
  public static int anInt1918;

  public void keyTyped(KeyEvent var1) {
    if (TextureSampler33.keyboard != null) {
        int var2 = GlobalStatics_6.method1386(true, var1);
        if ((var2 >= 0)) {
          int var3 = 1 + SceneSomething.anInt491 & 127;
          if ((Parameter.anInt3620 != var3)) {
            GlobalStatics_4.keyQueue[SceneSomething.anInt491] = -1;
            GlobalStatics_5.otherKeyQueue[SceneSomething.anInt491] = var2;
            SceneSomething.anInt491 = var3;
          }
        }
      }

      var1.consume();
  }

  public synchronized void keyPressed(KeyEvent var1) {
    if (TextureSampler33.keyboard != null) {
        TextureSampler29.anInt3398 = 0;
        int var2 = var1.getKeyCode();
        if (var2 >= 0 && DummyClass26.keyTable.length > var2) {
          var2 = DummyClass26.keyTable[var2];
          if ((var2 & 128) != 0) {
            var2 = -1;
          }
        } else {
          var2 = -1;
        }

        if ((GlobalStatics_3.anInt2384 >= 0) && (var2 >= 0)) {
          GlobalStatics_7.anIntArray2952[GlobalStatics_3.anInt2384] = var2;
          GlobalStatics_3.anInt2384 = 127 & GlobalStatics_3.anInt2384 + 1;
          if (GlobalStatics_3.anInt2384 == SomethingPacket116.anInt1744) {
            GlobalStatics_3.anInt2384 = -1;
          }
        }

        int var3;
        if ((var2 >= 0)) {
          var3 = 127 & 1 + SceneSomething.anInt491;
          if (var3 != Parameter.anInt3620) {
            GlobalStatics_4.keyQueue[SceneSomething.anInt491] = var2;
            GlobalStatics_5.otherKeyQueue[SceneSomething.anInt491] = -1;
            SceneSomething.anInt491 = var3;
          }
        }

        var3 = var1.getModifiers();
        if (((var3 & 10) != 0) || var2 == 85 || (var2 == 10)) {
          var1.consume();
        }
      }
  }

  public synchronized void keyReleased(KeyEvent var1) {
    if (TextureSampler33.keyboard != null) {
        TextureSampler29.anInt3398 = 0;
        int var2 = var1.getKeyCode();
        if (var2 >= 0 && DummyClass26.keyTable.length > var2) {
          var2 = DummyClass26.keyTable[var2] & -129;
        } else {
          var2 = -1;
        }

        if (GlobalStatics_3.anInt2384 >= 0 && (var2 >= 0)) {
          GlobalStatics_7.anIntArray2952[GlobalStatics_3.anInt2384] = ~var2;
          GlobalStatics_3.anInt2384 = 127 & 1 + GlobalStatics_3.anInt2384;
          if ((SomethingPacket116.anInt1744 == GlobalStatics_3.anInt2384)) {
            GlobalStatics_3.anInt2384 = -1;
          }
        }
      }

      var1.consume();
  }

  public void focusGained(FocusEvent var1) {
  }

  public synchronized void focusLost(FocusEvent var1) {
    if (TextureSampler33.keyboard != null) {
        GlobalStatics_3.anInt2384 = -1;
      }
  }

  public static void method2085(int var0) {
    Keyboard.aClass93_1911 = null;
      Keyboard.sprites = null;
      if (var0 > 81) {
        Keyboard.aClass94_1915 = null;
        Keyboard.aClass94_1913 = null;
        Keyboard.aClass94_1917 = null;
        Keyboard.aClass94_1907 = null;
      }
  }

  public static void method2086(byte var0) {
    if (var0 >= 62) {
        int var1 = TextureCache.localPlayer.anInt2819 + TextureSampler19.anInt3216;
        int var2 = TextureCache.localPlayer.anInt2829 + GlobalStatics_2.anInt42;
        if (((-var1 + TextureSampler20.anInt3155) < 499)
          || ((-var1 + TextureSampler20.anInt3155) > 500) || ((FileTable.anInt942 - var2) < 499)
          || ((-var2 + FileTable.anInt942) > 500)) {
          TextureSampler20.anInt3155 = var1;
          FileTable.anInt942 = var2;
        }

        if ((FileTable.anInt942 != var2)) {
          FileTable.anInt942 += (-FileTable.anInt942 + var2) / 16;
        }

        if ((TextureSampler20.anInt3155 != var1)) {
          TextureSampler20.anInt3155 += (-TextureSampler20.anInt3155 + var1) / 16;
        }

        if (GlobalStatics_2.aBoolean346) {
          for (int var3 = 0; SomethingOtherWorldMap.anInt2537 > var3; ++var3) {
            int var4 = SomethingPacket116.anIntArray1755[var3];
            if (var4 == 98) {
              GlobalStatics_6.anInt2309 = -16 & GlobalStatics_6.anInt2309 + 47;
            } else {
              if ((var4 == 99)) {
                GlobalStatics_6.anInt2309 =
                    -16 & GlobalStatics_6.anInt2309 - 17;
              } else {
                if (var4 == 96) {
                  SpotAnimationConfig.anInt531 =
                      SpotAnimationConfig.anInt531 - 65 & -128;
                } else {
                  if (var4 == 97) {
                    SpotAnimationConfig.anInt531 =
                        SpotAnimationConfig.anInt531 + 191 & -128;
                  }
                }
              }
            }
          }
        } else {
          if (GameObjectConfig.aBooleanArray1490[98]) {
            DummyClass32.anInt517 += (-DummyClass32.anInt517 + 12) / 2;
          } else if (!GameObjectConfig.aBooleanArray1490[99]) {
            DummyClass32.anInt517 /= 2;
          } else {
            DummyClass32.anInt517 += (-DummyClass32.anInt517 - 12) / 2;
          }

          if (GameObjectConfig.aBooleanArray1490[96]) {
            SomethingInScenePacket202.anInt2281 +=
                (-SomethingInScenePacket202.anInt2281 - 24) / 2;
          } else {
            if (GameObjectConfig.aBooleanArray1490[97]) {
              SomethingInScenePacket202.anInt2281 +=
                  (-SomethingInScenePacket202.anInt2281 + 24) / 2;
            } else {
              SomethingInScenePacket202.anInt2281 /= 2;
            }
          }

          GlobalStatics_6.anInt2309 += DummyClass32.anInt517 / 2;
          SpotAnimationConfig.anInt531 += SomethingInScenePacket202.anInt2281 / 2;
        }

        GlobalStatics_6.method1098((byte) -94);
      }
  }

}
