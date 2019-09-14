package com.jagex.runescape;

import com.jagex.runescape.opengl.Texture;

public final class RenderAnimation {

  private static GameString aClass94_354 = GameString.create("Discard");
  private static GameString aClass94_363 = GameString.create("Aug");
  private static GameString aClass94_365 = GameString.create("May");
  private static GameString aClass94_366 = GameString.create("Loaded world list data");
  private static GameString aClass94_376 = GameString.create("Jul");
  private static GameString aClass94_385 = GameString.create("Jun");
  private static GameString aClass94_388 = GameString.create("Dec");
  private static GameString aClass94_391 = GameString.create("Oct");
  private static GameString aClass94_392 = GameString.create("Jan");
  private static GameString aClass94_394 = GameString.create("Sep");
  private static GameString aClass94_397 = GameString.create("Nov");
  private static GameString aClass94_401 = GameString.create("Apr");
  private static GameString aClass94_404 = GameString.create("Mar");
  private static GameString aClass94_405 = GameString.create("Feb");
  public static GameString aClass94_355 = GameString.create("Lade Konfiguration )2 ");
  public static int[] anIntArray356 = {1, 0, -1, 0};
  public static volatile int anInt362;
  public static int anInt377;
  public static GameString aClass94_378;
  public static int headIconsPrayerFileId;
  public static byte[][][] aByteArrayArrayArray383;
  public static int anInt384;
  public static int anInt396;
  public static boolean interfaceCounterUpdated;
  public static GameString aClass94_361 = RenderAnimation.aClass94_354;
  public static GameString aClass94_374 = RenderAnimation.aClass94_366;
  public static GameString[] aClass94Array358 = {
      RenderAnimation.aClass94_392, RenderAnimation.aClass94_405, RenderAnimation.aClass94_404, RenderAnimation.aClass94_401,
      RenderAnimation.aClass94_365,
      RenderAnimation.aClass94_385,
      RenderAnimation.aClass94_376, RenderAnimation.aClass94_363, RenderAnimation.aClass94_394, RenderAnimation.aClass94_391,
      RenderAnimation.aClass94_397,
      RenderAnimation.aClass94_388
  };
  public int anInt357;
  public int[][] anIntArrayArray359;
  public int anInt360 = -1;
  public int anInt364 = -1;
  public int anInt367 = -1;
  public int anInt368 = -1;
  public int anInt369;
  public int anInt370;
  public int anInt371;
  public int anInt372 = -1;
  public int anInt373 = -1;
  public int anInt375 = -1;
  public int anInt379 = -1;
  public int anInt381;
  public int anInt382 = -1;
  public int anInt386 = -1;
  public int anInt387;
  public int anInt389 = -1;
  public int anInt390 = -1;
  public int anInt393 = -1;
  public int anInt395;
  public int anInt398 = -1;
  public int anInt399;
  public int anInt400;
  public int anInt403;
  public int anInt406 = -1;
  public int anInt407 = -1;

  public void method899(int var1 ) {
    if (var1 <= 68) {
        RenderAnimation.method900(null, -23);
      }
  }

  public void method901(int var1, Buffer var2 ) {
    if (var1 != -1) {
        RenderAnimation.method900(null, -18);
      }

      while (true) {
        int var3 = var2.readUnsignedByte();
        if (~var3 == -1) {
          return;
        }

        this.method902(var3, (byte) -106, var2);
      }
  }

  private void method902(int var1, byte var2, Buffer var3) {
    if (var1 == 1) {
        this.anInt368 = var3.readUnsignedShort();
        this.anInt382 = var3.readUnsignedShort();
        if (~this.anInt382 == -65536) {
          this.anInt382 = -1;
        }

        if (this.anInt368 == '\uffff') {
          this.anInt368 = -1;
        }
      } else if (~var1 == -3) {
        this.anInt398 = var3.readUnsignedShort();
      } else if (~var1 != -4) {
        if (var1 == 4) {
          this.anInt406 = var3.readUnsignedShort();
        } else if (var1 != 5) {
          if (var1 == 6) {
            this.anInt393 = var3.readUnsignedShort();
          } else {
            if (var1 == 7) {
              this.anInt386 = var3.readUnsignedShort();
            } else if (var1 != 8) {
              if (~var1 == -10) {
                this.anInt375 = var3.readUnsignedShort();
              } else {
                if (var1 == 26) {
                  this.anInt395 = (short) (4 * var3.readUnsignedByte());
                  this.anInt381 = (short) (4 * var3.readUnsignedByte());
                } else if (~var1 != -28) {
                  if (~var1 == -30) {
                    this.anInt369 = var3.readUnsignedByte();
                  } else {
                    if (var1 == 30) {
                      this.anInt357 = var3.readUnsignedShort();
                    } else {
                      if (~var1 == -32) {
                        this.anInt387 = var3.readUnsignedByte();
                      } else if (var1 != 32) {
                        if (var1 == 33) {
                          this.anInt400 = var3.method787((byte) 41);
                        } else if (var1 == 34) {
                          this.anInt403 = var3.readUnsignedByte();
                        } else if (var1 != 35) {
                          if (var1 == 36) {
                            this.anInt371 = var3.method787((byte) 122);
                          } else {
                            if (~var1 == -38) {
                              this.anInt360 = var3.readUnsignedByte();
                            } else {
                              if (var1 == 38) {
                                this.anInt367 = var3.readUnsignedShort();
                              } else if (var1 == 39) {
                                this.anInt407 = var3.readUnsignedShort();
                              } else if (var1 == 40) {
                                this.anInt389 = var3.readUnsignedShort();
                              } else if (var1 == 41) {
                                this.anInt390 = var3.readUnsignedShort();
                              } else if (var1 == 42) {
                                this.anInt364 = var3.readUnsignedShort();
                              } else if (~var1 != -44) {
                                if (~var1 == -45) {
                                  var3.readUnsignedShort();
                                } else {
                                  if (~var1 == -46) {
                                    var3.readUnsignedShort();
                                  }
                                }
                              } else {
                                var3.readUnsignedShort();
                              }
                            }
                          }
                        } else {
                          this.anInt399 = var3.readUnsignedShort();
                        }
                      } else {
                        this.anInt370 = var3.readUnsignedShort();
                      }
                    }
                  }
                } else {
                  if (this.anIntArrayArray359 == null) {
                    this.anIntArrayArray359 = new int[12][];
                  }

                  int var4 = var3.readUnsignedByte();
                  this.anIntArrayArray359[var4] = new int[6];

                  for (int var5 = 0; var5 < 6; ++var5) {
                    this.anIntArrayArray359[var4][var5] = var3
                        .method787((byte) 85);
                  }
                }
              }
            } else {
              this.anInt373 = var3.readUnsignedShort();
            }
          }
        } else {
          this.anInt379 = var3.readUnsignedShort();
        }
      } else {
        this.anInt372 = var3.readUnsignedShort();
      }

      if (var2 != -106) {
        this.method901(96, null);
      }
  }

  public static void method896(boolean var0) {
    RenderAnimation.aClass94_388 = null;
      RenderAnimation.aClass94_374 = null;
      RenderAnimation.aClass94_392 = null;
      RenderAnimation.aClass94_385 = null;
      RenderAnimation.aClass94_355 = null;
      RenderAnimation.aClass94_376 = null;
      RenderAnimation.aClass94_397 = null;
      RenderAnimation.anIntArray356 = null;
      RenderAnimation.aClass94_366 = null;
      RenderAnimation.aClass94Array358 = null;
      RenderAnimation.aClass94_378 = null;
      RenderAnimation.aClass94_354 = null;
      RenderAnimation.aClass94_365 = null;
      RenderAnimation.aClass94_394 = null;
      if (!var0) {
        RenderAnimation.method898((byte) 20, -109);
      }

      RenderAnimation.aClass94_361 = null;
      RenderAnimation.aClass94_391 = null;
      RenderAnimation.aClass94_401 = null;
      RenderAnimation.aClass94_405 = null;
      RenderAnimation.aClass94_363 = null;
      RenderAnimation.aByteArrayArrayArray383 = null;
      RenderAnimation.aClass94_404 = null;
  }

  public static boolean method897(int var0, AudioStreamEncoder4 var1, FileUnpacker var2,
                                 FileUnpacker midiInstruments, FileUnpacker soundEffects) {
    DummyClass23.aClass153_1661 = var2;
      if (var0 != 17770) {
        RenderAnimation.aClass94_366 = null;
      }

      DummyClass59.soundEffects = soundEffects;
      Texture.midiInstruments = midiInstruments;
      DummyClass55.aClass3_Sub24_Sub4_1421 = var1;
      return true;
  }

  public static SpotAnimationConfig method898(byte var0, int var1) {
    SpotAnimationConfig var2 =
        (SpotAnimationConfig) SomethingPacket151.aClass93_2604.get(var1);
      if (var2 != null) {
        return var2;
      } else {
        byte[] var3 =
          TextureSampler19.spotAnimations.getBytes(DummyInputStream.method64(true, var1),
            AbstractSomethingTexture.method1338(var1, var0 ^ 7));
        var2 = new SpotAnimationConfig();
        var2.anInt539 = var1;
        if (var0 != 42) {
          RenderAnimation.method898((byte) -83, -12);
        }

        if (var3 != null) {
          var2.method963(new Buffer(var3), (byte) -113);
        }

        SomethingPacket151.aClass93_2604.get((byte) -109, var2, var1);
        return var2;
      }
  }

  public static void method900(Mobile var0, int var1) {
    var0.aBoolean2810 = false;
      AnimationSequence var2;
      if (var0.anInt2764 != -1) {
        var2 = GameClient.method45(var0.anInt2764, (byte) -20);
        if (var2.anIntArray1851 != null) {
          ++var0.anInt2802;
          if (var2.anIntArray1851.length > var0.anInt2813
            && var0.anInt2802 > var2.anIntArray1869[var0.anInt2813]) {
            var0.anInt2802 = 1;
            ++var0.anInt2813;
            ++var0.anInt2793;
            SocketStream.method1470(var0.anInt2829, var2, 183921384, var0.anInt2819,
              var0 == TextureCache.localPlayer, var0.anInt2813);
          }

          if (~var0.anInt2813 <= ~var2.anIntArray1851.length) {
            var0.anInt2813 = 0;
            var0.anInt2802 = 0;
            SocketStream.method1470(var0.anInt2829, var2, 183921384, var0.anInt2819,
              TextureCache.localPlayer == var0, var0.anInt2813);
          }

          var0.anInt2793 = var0.anInt2813 - -1;
          if (~var0.anInt2793 <= ~var2.anIntArray1851.length) {
            var0.anInt2793 = 0;
          }
        } else {
          var0.anInt2764 = -1;
        }
      }

      int var6;
      if (~var0.anInt2842 != 0 && ~AbstractGameWorld.updateCycle <= ~var0.anInt2759) {
        var6 = RenderAnimation.method898((byte) 42, var0.anInt2842).anInt542;
        if (~var6 == 0) {
          var0.anInt2842 = -1;
        } else {
          AnimationSequence var3 = GameClient.method45(var6, (byte) -20);
          if (var3.anIntArray1851 != null) {
            if (var0.anInt2805 < 0) {
              var0.anInt2805 = 0;
              SocketStream
                  .method1470(var0.anInt2829, var3, 183921384, var0.anInt2819,
                      TextureCache.localPlayer == var0, 0);
            }

            ++var0.anInt2761;
            if (var0.anInt2805 < var3.anIntArray1851.length
                && ~var3.anIntArray1869[var0.anInt2805] > ~var0.anInt2761) {
              ++var0.anInt2805;
              var0.anInt2761 = 1;
              SocketStream.method1470(var0.anInt2829, var3, var1 ^ -183911469,
                  var0.anInt2819,
                  TextureCache.localPlayer == var0, var0.anInt2805);
            }

            if (var0.anInt2805 >= var3.anIntArray1851.length) {
              var0.anInt2842 = -1;
            }

            var0.anInt2826 = var0.anInt2805 - -1;
            if (~var3.anIntArray1851.length >= ~var0.anInt2826) {
              var0.anInt2826 = -1;
            }
          } else {
            var0.anInt2842 = -1;
          }
        }
      }

      if (~var0.animationId != 0 && ~var0.anInt2828 >= -2) {
        var2 = GameClient.method45(var0.animationId, (byte) -20);
        if (~var2.anInt1866 == -2 && var0.anInt2811 > 0
          && ~AbstractGameWorld.updateCycle <= ~var0.anInt2800
          && AbstractGameWorld.updateCycle > var0.anInt2790) {
          var0.anInt2828 = 1;
          return;
        }
      }

      if (var1 == -11973) {
        if (~var0.animationId != 0 && ~var0.anInt2828 == -1) {
          var2 = GameClient.method45(var0.animationId, (byte) -20);
          if (var2.anIntArray1851 != null) {
            ++var0.anInt2760;
            if (~var0.anInt2832 > ~var2.anIntArray1851.length
              && var0.anInt2760 > var2.anIntArray1869[var0.anInt2832]) {
              var0.anInt2760 = 1;
              ++var0.anInt2832;
              SocketStream.method1470(var0.anInt2829, var2, 183921384, var0.anInt2819,
                var0 == TextureCache.localPlayer, var0.anInt2832);
            }

            if (var2.anIntArray1851.length <= var0.anInt2832) {
              var0.anInt2832 -= var2.anInt1865;
              ++var0.anInt2773;
              if (~var0.anInt2773 > ~var2.anInt1861) {
                if (var0.anInt2832 >= 0 && var2.anIntArray1851.length > var0.anInt2832) {
                  SocketStream.method1470(var0.anInt2829, var2, -11973 ^ -183911469, var0.anInt2819,
                    TextureCache.localPlayer == var0, var0.anInt2832);
                } else {
                  var0.animationId = -1;
                }
              } else {
                var0.animationId = -1;
              }
            }

            var0.anInt2776 = var0.anInt2832 + 1;
            if (var0.anInt2776 >= var2.anIntArray1851.length) {
              var0.anInt2776 -= var2.anInt1865;
              if (var2.anInt1861 > var0.anInt2773 + 1) {
                if (var0.anInt2776 < 0 || var0.anInt2776 >= var2.anIntArray1851.length) {
                  var0.anInt2776 = -1;
                }
              } else {
                var0.anInt2776 = -1;
              }
            }

            var0.aBoolean2810 = var2.aBoolean1859;
          } else {
            var0.animationId = -1;
          }
        }

        if (var0.anInt2828 > 0) {
          --var0.anInt2828;
        }

        for (var6 = 0; var0.aClass145Array2809.length > var6; ++var6) {
          Unsure var7 = var0.aClass145Array2809[var6];
          if (var7 != null) {
            if (~var7.anInt1900 >= -1) {
              AnimationSequence var4 = GameClient.method45(var7.anInt1890, (byte) -20);
              if (var4.anIntArray1851 != null) {
                ++var7.anInt1897;
                if (var7.anInt1893 < var4.anIntArray1851.length
                  && var7.anInt1897 > var4.anIntArray1869[var7.anInt1893]) {
                  ++var7.anInt1893;
                  var7.anInt1897 = 1;
                  SocketStream.method1470(var0.anInt2829, var4, 183921384, var0.anInt2819,
                    var0 == TextureCache.localPlayer, var7.anInt1893);
                }

                if (~var4.anIntArray1851.length >= ~var7.anInt1893) {
                  ++var7.anInt1894;
                  var7.anInt1893 -= var4.anInt1865;
                  if (var4.anInt1861 > var7.anInt1894) {
                    if (~var7.anInt1893 <= -1 && ~var7.anInt1893 > ~var4.anIntArray1851.length) {
                      SocketStream.method1470(var0.anInt2829, var4, 183921384, var0.anInt2819,
                        TextureCache.localPlayer == var0, var7.anInt1893);
                    } else {
                      var0.aClass145Array2809[var6] = null;
                    }
                  } else {
                    var0.aClass145Array2809[var6] = null;
                  }
                }

                var7.anInt1891 = 1 + var7.anInt1893;
                if (var4.anIntArray1851.length <= var7.anInt1891) {
                  var7.anInt1891 -= var4.anInt1865;
                  if (1 + var7.anInt1894 < var4.anInt1861) {
                    if (~var7.anInt1891 > -1 || var4.anIntArray1851.length <= var7.anInt1891) {
                      var7.anInt1891 = -1;
                    }
                  } else {
                    var7.anInt1891 = -1;
                  }
                }
              } else {
                var0.aClass145Array2809[var6] = null;
              }
            } else {
              --var7.anInt1900;
            }
          }
        }

      }
  }

  public static GameString concat(GameString[] var0) {
    if (~var0.length <= -3) {

        return MouseRecorder.method1261(0, var0.length, var0, 2774);
      } else {
        throw new IllegalArgumentException();
      }
  }

}
