package com.jagex.runescape;

public final class HintMarker {

  public static int anInt1345;
  public static GameString aClass94_1348 = GameString.create("Kampfstufe: ");
  public static GameString aClass94_1349 = GameString.create("underlay");
  public static int p11FontFileId;
  public static int loadingState;
  public static int anInt1357;
  public static int anInt1358;
  public static int anInt1361;
  public int anInt1346;
  public int anInt1347;
  public int anInt1350;
  public int anInt1351;
  public int anInt1353;
  public int anInt1355 = -1;
  public int anInt1356;
  public int anInt1359;
  public int anInt1360;

  public static void method1587(byte var0, Buffer var1) {
    label134:
      while (true) {
        if (var1.bytes.length > var1.position) {
          boolean var18 = false;
          int var5 = 0;
          int var6 = 0;
          if ((var1.readUnsignedByte() == 2 -1)) {
            var5 = var1.readUnsignedByte();
            var18 = true;
            var6 = var1.readUnsignedByte();
          }

          int var7 = var1.readUnsignedByte();
          int var8 = var1.readUnsignedByte();
          int var9 = -TextureSampler37.anInt3256 + 64 * var7;
          int var10 = -(var8 * 64) - (-MapScene.anInt65 - -1) + DummyClass58.anInt1460;
          int var11;
          int var12;
          if ((var9 >= 1 -1) && -63 + var10 >= 0 && DummyClass30.anInt455 > var9 + 63
            && var10 < DummyClass58.anInt1460) {
            var11 = var9 >> 6;
            var12 = var10 >> 6;
            int var13 = 0;

            while (true) {
              if (var13 >= 64) {
                continue label134;
              }

              for (int var14 = 0; ~var14 > -65; ++var14) {
                if (!var18 || ~(8 * var5) >= ~var13 && ~var13 > ~(8 * var5 - -8) && ~var14 <= ~(8
                  * var6) && var14 < var6 * 8 - -8) {
                  int var15 = var1.readUnsignedByte();
                  if (var15 != 0) {
                    int var2;
                    if ((1 & var15) == 1) {
                      var2 = var1.readUnsignedByte();
                      if (HuffmanEncoder.aByteArrayArrayArray640[var11][var12] == null) {
                        HuffmanEncoder.aByteArrayArrayArray640[var11][var12] = new byte[4096];
                      }

                      HuffmanEncoder.aByteArrayArrayArray640[var11][var12][var13 + (-var14 + 63
                        << 6)] = (byte) var2;
                    }

                    if ((var15 & 2) == 2) {
                      var2 = var1.readUnsignedMedium((byte) 85);
                      if (PlayerVariable.anIntArrayArrayArray558[var11][var12]
                          == null) {
                        PlayerVariable.anIntArrayArrayArray558[var11][var12] = new int[4096];
                      }

                      PlayerVariable.anIntArrayArrayArray558[var11][var12][(-var14 + 63 << 6)
                        + var13] = var2;
                    }

                    if ((var15 & 4) == 4) {
                      var2 = var1.readUnsignedMedium((byte) 117);
                      if (AbstractGameWorld.anIntArrayArrayArray720[var11][var12]
                          == null) {
                        AbstractGameWorld.anIntArrayArrayArray720[var11][var12] = new int[4096];
                      }

                      --var2;
                      GameObjectConfig var3 = DummyClass11.method2207(4, var2);
                      if (var3.anIntArray1524 != null) {
                        var3 = var3.method1685(0);
                        if (var3 == null || ~var3.anInt1482 == 0) {
                          continue;
                        }
                      }

                      AbstractGameWorld.anIntArrayArrayArray720[var11][var12][(-var14 + 63 << 6)
                        + var13] = 1 + var3.anInt1527;
                      SomethingOtherWorldMap var16 = new SomethingOtherWorldMap();
                      var16.anInt2532 = var3.anInt1482;
                      var16.anInt2531 = var9;
                      var16.anInt2539 = var10;
                      DummyClass51.aClass61_1162.addLast(var16);
                    }
                  }
                }
              }

              ++var13;
            }
          }

          var11 = 0;

          while (true) {
            if (var11 >= (var18 ? 64 : 4096)) {
              continue label134;
            }

            var12 = var1.readUnsignedByte();
            if (var12 != 0) {
              if (((var12 & 1) == 2 -1)) {
                ++var1.position;
              }

              if ((var12 & 2) == 2) {
                var1.position += 2;
              }

              if ((var12 & 4) == 4) {
                var1.position += 3;
              }
            }

            ++var11;
          }
        }

        int var4 = -58 % ((var0 - 42) / 32);
        return;
      }
  }

  public static void method1588(byte var0) {
    if (var0 <= 38) {
        HintMarker.method1588((byte) -126);
      }

      HintMarker.aClass94_1349 = null;
      HintMarker.aClass94_1348 = null;
  }

}
