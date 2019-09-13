package com.jagex.runescape;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class Keyboard implements KeyListener, FocusListener {

  public static boolean aBoolean1905 = true;
  public static int anInt1906;
  public static GameString aClass94_1907 = GameString.create(" autres options");
  public static int anInt1908;
  public static int anInt1909;
  public static int anInt1910;
  public static ObjectCache aClass93_1911 = new ObjectCache(260);
  public static int openingMusicFileId;
  public static GameString aClass94_1913 = GameString.create("scrollbar");
  public static int anInt1914;
  public static GameString aClass94_1915 = GameString.create("Null");
  public static FileUnpacker sprites;
  public static GameString aClass94_1917 = GameString.create(" <col=00ff80>");
  public static int anInt1918;

  public void keyTyped(KeyEvent var1) {
    try {
      if (TextureSampler33.keyboard != null) {
        int var2 = BitVariable.method1386(true, var1);
        if (-1 >= ~var2) {
          int var3 = 1 + SceneSomething.anInt491 & 127;
          if (~Parameter.anInt3620 != ~var3) {
            AbstractFrameRegulator.keyQueue[SceneSomething.anInt491] = -1;
            AbstractAudioOutputStream.otherKeyQueue[SceneSomething.anInt491] = var2;
            SceneSomething.anInt491 = var3;
          }
        }
      }

      var1.consume();
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "uf.keyTyped(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  public synchronized void keyPressed(KeyEvent var1) {
    try {
      if (null != TextureSampler33.keyboard) {
        TextureSampler29.anInt3398 = 0;
        int var2 = var1.getKeyCode();
        if (0 <= var2 && DummyClass26.keyTable.length > var2) {
          var2 = DummyClass26.keyTable[var2];
          if (0 != (var2 & 128)) {
            var2 = -1;
          }
        } else {
          var2 = -1;
        }

        if (-1 >= ~AbstractTextureSampler.anInt2384 && -1 >= ~var2) {
          FileRequester.anIntArray2952[AbstractTextureSampler.anInt2384] = var2;
          AbstractTextureSampler.anInt2384 = 127 & AbstractTextureSampler.anInt2384 - -1;
          if (AbstractTextureSampler.anInt2384 == SomethingPacket116.anInt1744) {
            AbstractTextureSampler.anInt2384 = -1;
          }
        }

        int var3;
        if (~var2 <= -1) {
          var3 = 127 & 1 + SceneSomething.anInt491;
          if (var3 != Parameter.anInt3620) {
            AbstractFrameRegulator.keyQueue[SceneSomething.anInt491] = var2;
            AbstractAudioOutputStream.otherKeyQueue[SceneSomething.anInt491] = -1;
            SceneSomething.anInt491 = var3;
          }
        }

        var3 = var1.getModifiers();
        if (-1 != ~(var3 & 10) || 85 == var2 || -11 == ~var2) {
          var1.consume();
        }
      }

    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "uf.keyPressed(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  public synchronized void keyReleased(KeyEvent var1) {
    try {
      if (null != TextureSampler33.keyboard) {
        TextureSampler29.anInt3398 = 0;
        int var2 = var1.getKeyCode();
        if (var2 >= 0 && ~DummyClass26.keyTable.length < ~var2) {
          var2 = DummyClass26.keyTable[var2] & -129;
        } else {
          var2 = -1;
        }

        if (AbstractTextureSampler.anInt2384 >= 0 && ~var2 <= -1) {
          FileRequester.anIntArray2952[AbstractTextureSampler.anInt2384] = ~var2;
          AbstractTextureSampler.anInt2384 = 127 & 1 + AbstractTextureSampler.anInt2384;
          if (~SomethingPacket116.anInt1744 == ~AbstractTextureSampler.anInt2384) {
            AbstractTextureSampler.anInt2384 = -1;
          }
        }
      }

      var1.consume();
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "uf.keyReleased(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  public void focusGained(FocusEvent var1) {
  }

  public synchronized void focusLost(FocusEvent var1) {
    try {
      if (null != TextureSampler33.keyboard) {
        AbstractTextureSampler.anInt2384 = -1;
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "uf.focusLost(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  public static void method2085(int var0) {
    try {
      Keyboard.aClass93_1911 = null;
      Keyboard.sprites = null;
      if (var0 > 81) {
        Keyboard.aClass94_1915 = null;
        Keyboard.aClass94_1913 = null;
        Keyboard.aClass94_1917 = null;
        Keyboard.aClass94_1907 = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "uf.A(" + var0 + ')');
    }
  }

  public static void method2086(byte var0) {
    try {
      if (var0 >= 62) {
        int var1 = TextureCache.localPlayer.anInt2819 + TextureSampler19.anInt3216;
        int var2 = TextureCache.localPlayer.anInt2829 - -DummyInputStream.anInt42;
        if (499 < ~(-var1 + TextureSampler20.anInt3155)
          || ~(-var1 + TextureSampler20.anInt3155) < -501 || ~(FileTable.anInt942 + -var2) > 499
          || -501 > ~(-var2 + FileTable.anInt942)) {
          TextureSampler20.anInt3155 = var1;
          FileTable.anInt942 = var2;
        }

        if (~FileTable.anInt942 != ~var2) {
          FileTable.anInt942 += (-FileTable.anInt942 + var2) / 16;
        }

        if (~TextureSampler20.anInt3155 != ~var1) {
          TextureSampler20.anInt3155 += (-TextureSampler20.anInt3155 + var1) / 16;
        }

        if (AudioWorker.aBoolean346) {
          for (int var3 = 0; ~SomethingOtherWorldMap.anInt2537 < ~var3; ++var3) {
            int var4 = SomethingPacket116.anIntArray1755[var3];
            if (98 == var4) {
              AreaSoundEffect.anInt2309 = -16 & AreaSoundEffect.anInt2309 + 47;
            } else {
              if (-100 == ~var4) {
                AreaSoundEffect.anInt2309 =
                    -16 & AreaSoundEffect.anInt2309 - 17;
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
            DummyClass32.anInt517 += (-DummyClass32.anInt517 + -12) / 2;
          }

          if (GameObjectConfig.aBooleanArray1490[96]) {
            SomethingInScenePacket202.anInt2281 +=
                (-SomethingInScenePacket202.anInt2281 + -24) / 2;
          } else {
            if (GameObjectConfig.aBooleanArray1490[97]) {
              SomethingInScenePacket202.anInt2281 +=
                  (-SomethingInScenePacket202.anInt2281 + 24) / 2;
            } else {
              SomethingInScenePacket202.anInt2281 /= 2;
            }
          }

          AreaSoundEffect.anInt2309 += DummyClass32.anInt517 / 2;
          SpotAnimationConfig.anInt531 += SomethingInScenePacket202.anInt2281 / 2;
        }

        Cache.method1098((byte) -94);
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5, "uf.B(" + var0 + ')');
    }
  }

}
