package com.jagex.runescape.statics;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.model.ClassCheckRequest;
import com.jagex.runescape.model.GameBuffer;
import com.jagex.runescape.model.GameObjectConfig;
import com.jagex.runescape.model.HintMarker;
import com.jagex.runescape.model.ObjectCache;
import com.jagex.runescape.model.SocketStream;
import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.sprite.SoftwareIndexedColorSprite;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class DummyClass8 extends DummyClass7 {

  public static GameString aClass94_4022 = GameStringStatics.create(
      "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");
  public static SocketStream aClass89_4012;
  public static volatile boolean FOCUSED = true;
  public static int anInt4014;
  public static ObjectCache aClass93_4015 = new ObjectCache(64);
  public static GameString[] aClass94Array4016 = new GameString[500];
  public static long[] aLongArray4017 = new long[100];
  public static boolean aBoolean4018;
  public static int anInt4019;
  public static int anInt4020;
  public static int anInt4021;
  public static GameString aClass94_4023 = GameStringStatics.create(")3");
  public static int[] anIntArray4025 = new int[32];
  public static int anInt4026;
  public static SoftwareIndexedColorSprite[] aClass109_Sub1Array4027;
  public static GameString aClass94_4024 = DummyClass8.aClass94_4022;

  public static void method2220(int var0) {
    if (var0 == 0) {
      GlobalStatics_9.aClass93_2792.method1524(3);
    }
  }

  public static void method2221(int var0, int var1, int var2, boolean var3,
      int var4, int var5,
      int var6) {
    int var8 = 0;

    for (HintMarker[] var7 = GlobalStatics_8.aClass96Array2114;
        var7.length > var8; ++var8) {
      HintMarker var9 = var7[var8];
      if (var9 != null && var9.anInt1360 == 2) {
        GlobalStatics_5.method1724(var0 >> 1, var5,
            (-GlobalStatics_9.REGION_BASE_Y + var9.anInt1347 << 7)
                + var9.anInt1350,
            var9.anInt1353 * 2, var2 >> 1,
            var9.anInt1346 + (var9.anInt1356 - GlobalStatics_10.REGION_BASE_X
                << 7),
            (byte) -114, var4);
        if (DummyClass34.anInt590 > -1
            && GlobalStatics_4.updateCycle % 20 < 10) {
          GlobalStatics_9.aClass3_Sub28_Sub16Array2072[var9.anInt1351]
              .method643(
                  -12 + var1 + DummyClass34.anInt590,
                  -28 + var6 + GlobalStatics_10.anInt2208);
        }
      }
    }

    if (!var3) {
      DummyClass8.aBoolean4018 = true;
    }
  }

  public static void method2222(byte var0) {
    GlobalStatics_9.aClass93_4043.method1523();
    GlobalStatics_7.aClass93_2442.method1523();
    DummyClass14.aClass93_1964.method1523();
    if (var0 <= 122) {
      DummyClass8.method2223(true, (byte) -67);
    }
  }

  public static void method2223(boolean var0, byte var1) {
    int var2 = 85 % ((-17 - var1) / 59);
    byte var3;
    byte[][] var4;
    if (GlRenderer.USE_OPENGL && var0) {
      var4 = GlobalStatics_10.updatedLandscapesData;
      var3 = 1;
    } else {
      var3 = 4;
      var4 = GlobalStatics_6.landscapesData;
    }

    for (int var5 = 0; var5 < var3; ++var5) {
      DummyClass43.method1194();

      for (int var6 = 0; var6 < 13; ++var6) {
        for (int var7 = 0; var7 < 13; ++var7) {
          int var8 = GlobalStatics_8.anIntArrayArrayArray1497[var5][var6][var7];
          if (var8 != -1) {
            int var9 = var8 >> 24 & 3;
            if (!var0 || var9 == 0) {
              int var10 = (6 & var8) >> 1;
              int var11 = var8 >> 14 & 1023;
              int var12 = 2047 & var8 >> 3;
              int var13 = var12 / 8 + (var11 / 8 << 8);

              for (int var14 = 0; GlobalStatics_6.regionHashes.length > var14;
                  ++var14) {
                if (GlobalStatics_6.regionHashes[var14] == var13
                    && var4[var14] != null) {
                  GlobalStatics_9.method316(GlobalStatics_0.collisionMaps, var5,
                      var4[var14], var9,
                      var10, 8 * var6, var7 * 8, var0, (var11 & 7) * 8,
                      8 * (7 & var12),
                      (byte) -54);
                  break;
                }
              }
            }
          }
        }
      }
    }
  }

  public static boolean method2224(byte var0, long var1, int var3, int var4) {
    int var5 = (int) var1 >> 14 & 31;
    if (var0 != 39) {
      DummyClass8.method2220(-62);
    }

    int var6 = (int) var1 >> 20 & 3;
    int var7 = (int) (var1 >>> 32) & Integer.MAX_VALUE;
    if (var5 != 10 && var5 != 11 && var5 != 22) {
      GlobalStatics_9
          .method582(GlobalStatics_9.localPlayer.waypointsY[0], var6, 0, true,
              0, 2, var4, 0,
              1 + var5, 2, var3, GlobalStatics_9.localPlayer.waypointsX[0]);
    } else {
      GameObjectConfig var8 = DummyClass11.method2207(4, var7);
      int var9;
      int var10;
      if (var6 != 0 && var6 != 2) {
        var10 = var8.anInt1480;
        var9 = var8.anInt1485;
      } else {
        var10 = var8.anInt1485;
        var9 = var8.anInt1480;
      }

      int var11 = var8.anInt1533;
      if (var6 != 0) {
        var11 = (var11 << var6 & 15) + (var11 >> -var6 + 4);
      }

      GlobalStatics_9
          .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0, var10, true,
              var11, 2, var4,
              var9, 0, 2, var3, GlobalStatics_9.localPlayer.waypointsX[0]);
    }

    GlobalStatics_7.anInt4062 = DummyClass36.anInt2614;
    GlobalStatics_7.anInt2958 = 0;
    GlobalStatics_0.anInt638 = 2;
    GlobalStatics_9.anInt1053 = DummyClass5.anInt2993;
    return true;
  }

  public static void method2225(byte var0) {
    int var1 = 58 % ((var0 - 7) / 43);
    DummyClass8.aClass89_4012 = null;
    DummyClass8.aClass94_4024 = null;
    DummyClass8.aClass109_Sub1Array4027 = null;
    DummyClass8.anIntArray4025 = null;
    DummyClass8.aClass94Array4016 = null;
    DummyClass8.aClass93_4015 = null;
    DummyClass8.aLongArray4017 = null;
    DummyClass8.aClass94_4022 = null;
    DummyClass8.aClass94_4023 = null;
  }

  public static void method2226(GameBuffer var0, int var1, int var2) {
    if (var2 > -109) {
      DummyClass8.method2226(null, 67, 54);
    }

    while (true) {
      ClassCheckRequest var3 =
          (ClassCheckRequest) GlobalStatics_9.aClass61_2557.getFirst();
      if (var3 == null) {
        return;
      }

      boolean var4 = false;

      int var5;
      for (var5 = 0; var5 < var3.anInt2296; ++var5) {
        if (var3.aClass64Array2303[var5] != null) {
          if (var3.aClass64Array2303[var5].status == 2) {
            var3.anIntArray2300[var5] = -5;
          }

          if (var3.aClass64Array2303[var5].status == 0) {
            var4 = true;
          }
        }

        if (var3.aClass64Array2298[var5] != null) {
          if (var3.aClass64Array2298[var5].status == 2) {
            var3.anIntArray2300[var5] = -6;
          }

          if (var3.aClass64Array2298[var5].status == 0) {
            var4 = true;
          }
        }
      }

      if (var4) {
        return;
      }

      var0.writePacket(var1);
      var0.writeByte(0);
      var5 = var0.position;
      var0.writeInt(var3.anInt2305);

      for (int var6 = 0; var3.anInt2296 > var6; ++var6) {
        if (var3.anIntArray2300[var6] == 0) {
          try {
            int var7 = var3.anIntArray2301[var6];
            Field var8;
            int var9;
            if (var7 == 0) {
              var8 = (Field) var3.aClass64Array2303[var6].result;
              var9 = var8.getInt(null);
              var0.writeByte(0);
              var0.writeInt(var9);
            } else {
              if (var7 == 1) {
                var8 = (Field) var3.aClass64Array2303[var6].result;
                var8.setInt(null, var3.anIntArray2299[var6]);
                var0.writeByte(0);
              } else if (var7 == 2) {
                var8 = (Field) var3.aClass64Array2303[var6].result;
                var9 = var8.getModifiers();
                var0.writeByte(0);
                var0.writeInt(var9);
              }
            }

            Method var26;
            if (var7 == 3) {
              var26 = (Method) var3.aClass64Array2298[var6].result;
              byte[][] var27 = var3.aByteArrayArrayArray2302[var6];
              Object[] var10 = new Object[var27.length];

              for (int var11 = 0; var11 < var27.length; ++var11) {
                ObjectInputStream var12 =
                    new ObjectInputStream(
                        new ByteArrayInputStream(var27[var11]));
                var10[var11] = var12.readObject();
              }

              Object var28 = var26.invoke(null, var10);
              if (var28 == null) {
                var0.writeByte(0);
              } else if (!(var28 instanceof Number)) {
                if (var28 instanceof GameString) {
                  var0.writeByte(2);
                  var0.writeString((GameString) var28);
                } else {
                  var0.writeByte(4);
                }
              } else {
                var0.writeByte(1);
                var0.writeLong(((Number) var28).longValue());
              }
            } else if (var7 == 4) {
              var26 = (Method) var3.aClass64Array2298[var6].result;
              var9 = var26.getModifiers();
              var0.writeByte(0);
              var0.writeInt(var9);
            }
          } catch (ClassNotFoundException var13) {
            var0.writeByte(-10);
          } catch (InvalidClassException var14) {
            var0.writeByte(-11);
          } catch (StreamCorruptedException var15) {
            var0.writeByte(-12);
          } catch (OptionalDataException var16) {
            var0.writeByte(-13);
          } catch (IllegalAccessException var17) {
            var0.writeByte(-14);
          } catch (IllegalArgumentException var18) {
            var0.writeByte(-15);
          } catch (InvocationTargetException var19) {
            var0.writeByte(-16);
          } catch (SecurityException var20) {
            var0.writeByte(-17);
          } catch (IOException var21) {
            var0.writeByte(-18);
          } catch (NullPointerException var22) {
            var0.writeByte(-19);
          } catch (Exception var23) {
            var0.writeByte(-20);
          } catch (Throwable var24) {
            var0.writeByte(-21);
          }
        } else {
          var0.writeByte(var3.anIntArray2300[var6]);
        }
      }

      var0.writeChecksum((byte) 86, var5);
      var0.method769((byte) -127, var0.position - var5);
      var3.unlinkNode();
    }
  }

}
