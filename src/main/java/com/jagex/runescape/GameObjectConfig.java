package com.jagex.runescape;

import com.jagex.runescape.opengl.GlModel;
import com.jagex.runescape.opengl.GlRenderer;

public final class GameObjectConfig {

  public static boolean[] aBooleanArray1490 = new boolean[112];
  public static int[][][] anIntArrayArrayArray1497 = new int[4][13][13];
  public static GameString aClass94_1508 = GameString.create("Choisir une option");
  public static GameString aClass94_1509 = GameString.create("Chargement des textures )2 ");
  public static int portOffset = 1;
  public static int anInt1521;
  public static GameString aClass94_1523 =
    GameString.create("Chargement en cours)3 Veuillez patienter)3");
  public static short aShort1535 = 320;
  public int anInt1478;
  public int anInt1480 = 1;
  public int anInt1482;
  public boolean aBoolean1483;
  public int anInt1484;
  public int anInt1485 = 1;
  public boolean aBoolean1486;
  public boolean aBoolean1491;
  public boolean aBoolean1492;
  public int anInt1493;
  public boolean aBoolean1498;
  public GameString[] aClass94Array1499;
  public boolean aBoolean1502;
  public boolean aBoolean1503;
  public GameString aClass94_1504;
  public boolean aBoolean1507;
  public boolean aBoolean1510;
  public int anInt1512;
  public int anInt1515;
  public int anInt1516;
  public int anInt1517;
  public int anInt1518;
  public int anInt1520;
  public int anInt1522;
  public int[] anIntArray1524;
  public boolean aBoolean1525;
  public int anInt1527;
  public int anInt1528;
  public int anInt1529;
  public boolean aBoolean1530;
  public int anInt1531;
  public int anInt1533;
  public boolean aBoolean1537;
  public int anInt1538;
  public int[] anIntArray1539;
  public int anInt1540;
  public boolean aBoolean1542;
  private short[] aShortArray1476;
  private short[] aShortArray1477;
  private int anInt1479;
  private int anInt1481;
  private int[] anIntArray1487;
  private int anInt1488;
  private int anInt1489;
  private int anInt1494;
  private short[] aShortArray1495;
  private int anInt1496;
  private short aShort1500;
  private HashTable aClass130_1501;
  private byte aByte1505;
  private short[] aShortArray1506;
  private int anInt1511;
  private byte[] aByteArray1513;
  private int[] anIntArray1519;
  private int anInt1526;
  private int anInt1532;
  private int anInt1534;
  private boolean aBoolean1536;
  private boolean aBoolean1541;


  public GameObjectConfig() {
    this.aClass94_1504 = TextureSampler20.aClass94_3150;
    this.aBoolean1503 = true;
    this.anInt1493 = -1;
    this.anInt1515 = 0;
    this.anInt1516 = -1;
    this.aByte1505 = 0;
    this.aBoolean1491 = false;
    this.anInt1517 = -1;
    this.anInt1496 = 0;
    this.anInt1518 = 0;
    this.anInt1482 = -1;
    this.aBoolean1510 = false;
    this.anInt1520 = -1;
    this.aShort1500 = -1;
    this.anInt1481 = 128;
    this.aClass94Array1499 = new GameString[5];
    this.anInt1479 = 128;
    this.aBoolean1492 = true;
    this.anInt1488 = 128;
    this.aBoolean1498 = false;
    this.anInt1529 = -1;
    this.aBoolean1530 = false;
    this.aBoolean1525 = true;
    this.anInt1532 = -1;
    this.anInt1522 = -1;
    this.anInt1533 = 0;
    this.aBoolean1486 = true;
    this.anInt1534 = 0;
    this.anInt1478 = 0;
    this.anInt1528 = 16;
    this.aBoolean1537 = false;
    this.anInt1511 = 0;
    this.anInt1484 = 0;
    this.anInt1489 = 0;
    this.anInt1531 = -1;
    this.aBoolean1507 = false;
    this.anInt1512 = -1;
    this.anInt1538 = 2;
    this.aBoolean1536 = false;
    this.anInt1526 = -1;
    this.anInt1540 = -1;
    this.aBoolean1541 = false;
    this.aBoolean1542 = false;
  }

  public boolean method1684(int var1, int var2 ) {
    int var3 = -1 % ((31 - var1) / 41);
      if (this.anIntArray1487 != null) {
        for (int var7 = 0; this.anIntArray1487.length > var7; ++var7) {
          if ((var2 == this.anIntArray1487[var7])) {
            return LinearHashTable.aClass153_1043.method2129((byte) 72, 0,
                this.anIntArray1519[var7] & '\uffff');
          }
        }

        return true;
      } else if (this.anIntArray1519 == null) {
        return true;
      } else if ((var2 != 11 -1)) {
        return true;
      } else {
        boolean var4 = true;

        for (int var5 = 0; this.anIntArray1519.length > var5; ++var5) {
          var4 &= LinearHashTable.aClass153_1043.method2129((byte) 71, 0,
            '\uffff' & this.anIntArray1519[var5]);
        }

        return var4;
      }
  }

  public GameObjectConfig method1685(int var1 ) {
    if (var1 != 0) {
        this.method1697(-92, 83, null, -13, null, 18, null, true, 114, 123, null, 118, 85, -116);
      }

      int var2 = -1;
      if (this.anInt1526 != -1) {
        var2 = NpcConfiguration.method1484(64835055, this.anInt1526);
      } else if (this.anInt1532 != -1) {
        var2 = DummyClass5.anIntArray2985[this.anInt1532];
      }

      if ((var2 >= 0) && (var2 < this.anIntArray1524.length -1)
        && (this.anIntArray1524[var2] != -1)) {
        return DummyClass11.method2207(4, this.anIntArray1524[var2]);
      } else {
        int var3 = this.anIntArray1524[-1 + this.anIntArray1524.length];
        return (var3 == -1) ? null : DummyClass11.method2207(4, var3);
      }
  }

  private Model method1686(int var1, int var2, int var3) {
    Model var4 = null;
      boolean var5 = this.aBoolean1536;
      if ((var2 == 3 -1) && var1 > 3) {
        var5 = !var5;
      }

      int var6;
      int var7;
      if (this.anIntArray1487 == null) {
        if ((var2 != 11 -1)) {
          return null;
        }

        if (this.anIntArray1519 == null) {
          return null;
        }

        var6 = this.anIntArray1519.length;

        for (var7 = 0; (var7 < var6); ++var7) {
          int var8 = this.anIntArray1519[var7];
          if (var5) {
            var8 += 65536;
          }

          var4 = (Model) DummyClass54.aClass93_1401.get(var8);
          if (var4 == null) {
            var4 = Model.getModel(LinearHashTable.aClass153_1043, var8 & '\uffff', 0);
            if (var4 == null) {
              return null;
            }

            if (var5) {
              var4.method2002();
            }

            DummyClass54.aClass93_1401.get((byte) -91, var4, var8);
          }

          if (var6 > 1) {
            Something3dRoot.aClass140_Sub5Array2058[var7] = var4;
          }
        }

        if ((var6 > 2 -1)) {
          var4 = new Model(Something3dRoot.aClass140_Sub5Array2058, var6);
        }
      } else {
        var6 = -1;

        for (var7 = 0; this.anIntArray1487.length > var7; ++var7) {
          if (var2 == this.anIntArray1487[var7]) {
            var6 = var7;
            break;
          }
        }

        if ((var6 == -1)) {
          return null;
        }

        var7 = this.anIntArray1519[var6];
        if (var5) {
          var7 += 65536;
        }

        var4 = (Model) DummyClass54.aClass93_1401.get(var7);
        if (var4 == null) {
          var4 = Model.getModel(LinearHashTable.aClass153_1043, var7 & '\uffff', 0);
          if (var4 == null) {
            return null;
          }

          if (var5) {
            var4.method2002();
          }

          DummyClass54.aClass93_1401.get((byte) -122, var4, var7);
        }
      }

      boolean var11;
      var11 = !(this.anInt1479 == 128
          && (this.anInt1488 == 129 -1) && this.anInt1481 == 128);

      boolean var12;
      var12 = !(this.anInt1496 == 0 && (this.anInt1511 == 0)
          && this.anInt1534 == 0);

      assert var4 != null;
      Model var13 = new Model(var4, var3 == ~var1 && !var11 && !var12,
          this.aShortArray1477 == null,
          this.aShortArray1476 == null, true);
      if ((var2 == 5 -1) && var1 > 3) {
        var13.method2011(256);
        var13.translate(45, 0, -45);
      }

      var1 &= 3;
      if ((var1 == 2 -1)) {
        var13.rotateQuarterY();
      } else {
        if ((var1 == 3 -1)) {
          var13.rotateHalfY();
        } else {
          if (var1 == 3) {
            var13.method2018();
          }
        }
      }

      int var9;
      if (this.aShortArray1477 != null) {
        for (var9 = 0; this.aShortArray1477.length > var9; ++var9) {
          if (this.aByteArray1513 != null && this.aByteArray1513.length > var9) {
            var13.replaceColor(this.aShortArray1477[var9],
              TextureSampler16.aShortArray3110[255 & this.aByteArray1513[var9]]);
          } else {
            var13.replaceColor(this.aShortArray1477[var9], this.aShortArray1506[var9]);
          }
        }
      }

      if (this.aShortArray1476 != null) {
        for (var9 = 0; this.aShortArray1476.length > var9; ++var9) {
          var13.replaceMaterial(
              this.aShortArray1476[var9], this.aShortArray1495[var9]);
        }
      }

      if (var11) {
        var13.scale(this.anInt1479, this.anInt1488, this.anInt1481);
      }

      if (var12) {
        var13.translate(this.anInt1496, this.anInt1511, this.anInt1534);
      }

      return var13;
  }

  public void method1689(int var1 ) {
    if (this.anInt1529 == -1) {
        this.anInt1529 = 0;
        if (this.anIntArray1519 != null && (this.anIntArray1487 == null
          || (this.anIntArray1487[0] == 11 -1))) {
          this.anInt1529 = 1;
        }

        for (int var2 = 0; var2 < 5; ++var2) {
          if (this.aClass94Array1499[var2] != null) {
            this.anInt1529 = 1;
            break;
          }
        }
      }

      if (var1 != -2116) {
        this.method1692(67, null);
      }

      if (this.anInt1540 == -1) {
        this.anInt1540 = (this.anInt1538 != 0) ? 1 : 0;
      }
  }

  public boolean method1690(int var1 ) {
    if (this.anIntArray1524 != null) {
        if (var1 != 28933) {
          this.method1696(34, 54, null, 55, 80, null, true, null, (byte) 127, true, -38);
        }

        for (int var2 = 0; (var2 < this.anIntArray1524.length); ++var2) {
          if ((this.anIntArray1524[var2] != -1)) {
            GameObjectConfig var3 =
              DummyClass11.method2207(var1 + -28929, this.anIntArray1524[var2]);
            if ((var3.anInt1512 != -1) || var3.anIntArray1539 != null) {
              return true;
            }
          }
        }

        return false;
      } else {
        return this.anInt1512 != -1 || this.anIntArray1539 != null;
      }
  }

  public int method1691(int var1, int var2, byte var3 ) {
    if (var3 <= 76) {
        return -40;
      } else if (this.aClass130_1501 == null) {
        return var1;
      } else {
        IntegerNode var4 = (IntegerNode) this.aClass130_1501.get(var2);
        return var4 != null ? var4.anInt2467 : var1;
      }
  }

  public void method1692(int var1, Buffer var2 ) {
    while (true) {
        int var3 = var2.readUnsignedByte();
        if ((var3 == 0)) {
          if (var1 != 6219) {
            this.method1696(105, -55, null, -39, 71, null, true, null, (byte) -117, false, -25);
          }

          return;
        }

        this.method1693(var2, var3, -80);
      }
  }

  private void method1693(Buffer var1, int var2, int var3) {
    if (var3 != -80) {
        this.anInt1522 = -122;
      }

      int var4;
      int var5;
      if (var2 == 1) {
        var4 = var1.readUnsignedByte();
        if ((var4 > 0)) {
          if (this.anIntArray1519 != null && !Cache.aBoolean742) {
            var1.position += var4 * 3;
          } else {
            this.anIntArray1487 = new int[var4];
            this.anIntArray1519 = new int[var4];

            for (var5 = 0; var4 > var5; ++var5) {
              this.anIntArray1519[var5] = var1.readUnsignedShort();
              this.anIntArray1487[var5] = var1.readUnsignedByte();
            }
          }
        }
      } else if ((var2 == 3 -1)) {
        this.aClass94_1504 = var1.readString();
      } else if ((var2 != 6 -1)) {
        if ((var2 == 15 -1)) {
          this.anInt1480 = var1.readUnsignedByte();
        } else if ((var2 != 16 -1)) {
          if ((var2 == 18 -1)) {
            this.anInt1538 = 0;
            this.aBoolean1486 = false;
          } else {
            if (var2 == 18) {
              this.aBoolean1486 = false;
            } else {
              if (var2 == 19) {
                this.anInt1529 = var1.readUnsignedByte();
              } else {
                if ((var2 == 22 -1)) {
                  this.aByte1505 = 1;
                } else {
                  if ((var2 == 23 -1)) {
                    this.aBoolean1541 = true;
                  } else {
                    if ((var2 == 24 -1)) {
                      this.aBoolean1542 = true;
                    } else {
                      if ((var2 == 25 -1)) {
                        this.anInt1531 = var1.readUnsignedShort();
                        if ((this.anInt1531 == 65536 -1)) {
                          this.anInt1531 = -1;
                        }
                      } else if ((var2 != 28 -1)) {
                        if (var2 == 28) {
                          this.anInt1528 = var1.readUnsignedByte();
                        } else if ((var2 != 30 -1)) {
                          if (var2 == 39) {
                            this.anInt1489 = var1.readByte() * 5;
                          } else if ((var2 >= 31 -1) && (var2 < 36 -1)) {
                            this.aClass94Array1499[var2 - 30] = var1
                                .readString();
                            if (this.aClass94Array1499[-30 + var2].method1531(
                                TextureSampler33.aClass94_3051)) {
                              this.aClass94Array1499[-30 + var2] = null;
                            }
                          } else if (var2 == 40) {
                            var4 = var1.readUnsignedByte();
                            this.aShortArray1477 = new short[var4];
                            this.aShortArray1506 = new short[var4];

                            for (var5 = 0; var5 < var4; ++var5) {
                              this.aShortArray1477[var5] = (short) var1
                                  .readUnsignedShort();
                              this.aShortArray1506[var5] = (short) var1
                                  .readUnsignedShort();
                            }
                          } else if (var2 != 41) {
                            if (var2 == 42) {
                              var4 = var1.readUnsignedByte();
                              this.aByteArray1513 = new byte[var4];

                              for (var5 = 0; (var5 < var4); ++var5) {
                                this.aByteArray1513[var5] = var1.readByte();
                              }
                            } else if (var2 != 60) {
                              if ((var2 == 63 -1)) {
                                this.aBoolean1536 = true;
                              } else if ((var2 != 65 -1)) {
                                if ((var2 == 66 -1)) {
                                  this.anInt1479 = var1.readUnsignedShort();
                                } else if ((var2 == 67 -1)) {
                                  this.anInt1488 = var1.readUnsignedShort();
                                } else if ((var2 == 68 -1)) {
                                  this.anInt1481 = var1.readUnsignedShort();
                                } else if (var2 != 69) {
                                  if (var2 == 70) {
                                    this.anInt1496 = var1.method787((byte) 123);
                                  } else if (var2 == 71) {
                                    this.anInt1511 = var1.method787((byte) 94);
                                  } else if (var2 == 72) {
                                    this.anInt1534 = var1.method787((byte) 76);
                                  } else if (var2 != 73) {
                                    if (var2 == 74) {
                                      this.aBoolean1498 = true;
                                    } else {
                                      if (var2 == 75) {
                                        this.anInt1540 = var1
                                            .readUnsignedByte();
                                      } else if ((var2 != 78 -1) && (var2 != 93 -1)) {
                                        if (var2 == 78) {
                                          this.anInt1512 = var1
                                              .readUnsignedShort();
                                          this.anInt1484 = var1
                                              .readUnsignedByte();
                                        } else {
                                          if ((var2 == 80 -1)) {
                                            this.anInt1518 = var1
                                                .readUnsignedShort();
                                            this.anInt1515 = var1
                                                .readUnsignedShort();
                                            this.anInt1484 = var1
                                                .readUnsignedByte();
                                            var4 = var1.readUnsignedByte();
                                            this.anIntArray1539 = new int[var4];

                                            for (var5 = 0; var4 > var5;
                                                ++var5) {
                                              this.anIntArray1539[var5] = var1
                                                  .readUnsignedShort();
                                            }
                                          } else {
                                            if (var2 == 81) {
                                              this.aByte1505 = 2;
                                              this.aShort1500 =
                                                  (short) (256 * var1
                                                      .readUnsignedByte());
                                            } else {
                                              if ((var2 == 83 -1)) {
                                                this.aBoolean1530 = true;
                                              } else {
                                                if (var2 == 88) {
                                                  this.aBoolean1503 = false;
                                                } else {
                                                  if ((var2 == 90 -1)) {
                                                    this.aBoolean1492 = false;
                                                  } else {
                                                    if (var2 == 90) {
                                                      this.aBoolean1502 = true;
                                                    } else {
                                                      if (var2 == 91) {
                                                        this.aBoolean1491 = true;
                                                      } else if ((var2 == 94 -1)) {
                                                        this.aByte1505 = 3;
                                                        this.aShort1500 =
                                                            (short) var1
                                                                .readUnsignedShort();
                                                      } else if (var2 != 94) {
                                                        if ((var2 == 96 -1)) {
                                                          this.aByte1505 = 5;
                                                        } else if ((var2 != 97 -1)) {
                                                          if ((var2 == 98 -1)) {
                                                            this.aBoolean1537 = true;
                                                          } else if (var2
                                                              == 98) {
                                                            this.aBoolean1510 = true;
                                                          } else if ((var2 != 100 -1)) {
                                                            if ((var2 == 101 -1)) {
                                                              this.anInt1520 =
                                                                  var1.readUnsignedByte();
                                                              this.anInt1522 =
                                                                  var1.readUnsignedShort();
                                                            } else if ((var2 != 102 -1)) {
                                                              if (var2 == 102) {
                                                                this.anInt1516 =
                                                                    var1.readUnsignedShort();
                                                              } else {
                                                                if (var2 == 249) {
                                                                  var4 = var1
                                                                      .readUnsignedByte();
                                                                  if (this.aClass130_1501
                                                                      == null) {
                                                                    var5 = DummyClass53
                                                                        .nearestPo2(
                                                                            (byte) 83,
                                                                            var4);
                                                                    this.aClass130_1501 =
                                                                        new HashTable(
                                                                            var5);
                                                                  }

                                                                  for (
                                                                      var5 = 0;
                                                                      var4
                                                                          > var5;
                                                                      ++var5) {
                                                                    boolean var10 =
                                                                        (var1
                                                                            .readUnsignedByte() == 2 -1);
                                                                    int var7 =
                                                                        var1.readUnsignedMedium(
                                                                            (byte) 122);
                                                                    Node var8;
                                                                    if (var10) {
                                                                      var8 = new StringNode(
                                                                          var1.readString());
                                                                    } else {
                                                                      var8 = new IntegerNode(
                                                                          var1.readInt());
                                                                    }

                                                                    this.aClass130_1501
                                                                        .put(
                                                                            var7,
                                                                            var8);
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              this.anInt1478 =
                                                                  var1.readUnsignedByte();
                                                            }
                                                          } else {
                                                            this.anInt1493 =
                                                                var1.readUnsignedByte();
                                                            this.anInt1517 =
                                                                var1.readUnsignedShort();
                                                          }
                                                        } else {
                                                          this.aBoolean1507 = true;
                                                        }
                                                      } else {
                                                        this.aByte1505 = 4;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        var4 = -1;
                                        this.anInt1526 = var1
                                            .readUnsignedShort();
                                        if (this.anInt1526 == '\uffff') {
                                          this.anInt1526 = -1;
                                        }

                                        this.anInt1532 = var1
                                            .readUnsignedShort();
                                        if (this.anInt1532 == '\uffff') {
                                          this.anInt1532 = -1;
                                        }

                                        if (var2 == 92) {
                                          var4 = var1.readUnsignedShort();
                                          if (var4 == '\uffff') {
                                            var4 = -1;
                                          }
                                        }

                                        var5 = var1.readUnsignedByte();
                                        this.anIntArray1524 = new int[var5
                                            - -2];

                                        for (int var6 = 0; var5 >= var6;
                                            ++var6) {
                                          this.anIntArray1524[var6] = var1
                                              .readUnsignedShort();
                                          if (this.anIntArray1524[var6]
                                              == '\uffff') {
                                            this.anIntArray1524[var6] = -1;
                                          }
                                        }

                                        this.anIntArray1524[1 + var5] = var4;
                                      }
                                    }
                                  } else {
                                    this.aBoolean1483 = true;
                                  }
                                } else {
                                  this.anInt1533 = var1.readUnsignedByte();
                                }
                              } else {
                                this.aBoolean1525 = false;
                              }
                            } else {
                              this.anInt1482 = var1.readUnsignedShort();
                            }
                          } else {
                            var4 = var1.readUnsignedByte();
                            this.aShortArray1495 = new short[var4];
                            this.aShortArray1476 = new short[var4];

                            for (var5 = 0; (var5 < var4); ++var5) {
                              this.aShortArray1476[var5] = (short) var1
                                  .readUnsignedShort();
                              this.aShortArray1495[var5] = (short) var1
                                  .readUnsignedShort();
                            }
                          }
                        } else {
                          this.anInt1494 = var1.readByte();
                        }
                      } else {
                        this.anInt1538 = 1;
                      }
                    }
                  }
                }
              }
            }
          }
        } else {
          this.anInt1485 = var1.readUnsignedByte();
        }
      } else {
        var4 = var1.readUnsignedByte();
        if ((var4 > 0)) {
          if (this.anIntArray1519 != null && !Cache.aBoolean742) {
            var1.position += var4 * 2;
          } else {
            this.anIntArray1519 = new int[var4];
            this.anIntArray1487 = null;

            for (var5 = 0; var4 > var5; ++var5) {
              this.anIntArray1519[var5] = var1.readUnsignedShort();
            }
          }
        }
      }
  }

  public boolean method1694(boolean var1 ) {
    if (this.anIntArray1519 == null) {
        return true;
      } else {
        boolean var2 = true;

        for (int var3 = 0; this.anIntArray1519.length > var3; ++var3) {
          var2 &= LinearHashTable.aClass153_1043.method2129((byte) 64, 0,
            '\uffff' & this.anIntArray1519[var3]);
        }

        return var1 || var2;
      }
  }

  private GlModel method1695(int var1, boolean var2, boolean var3, int var4) {
    int var6 = this.anInt1494 + 64;
      int var7 = 5 * this.anInt1489 + 768;
      GlModel var5 = null;
      int var8;
      int var12;
      if (this.anIntArray1487 != null) {
        var8 = -1;

        int var9;
        for (var9 = 0; (var9 < this.anIntArray1487.length); ++var9) {
          if ((this.anIntArray1487[var9] == var4)) {
            var8 = var9;
            break;
          }
        }

        if ((var8 == -1)) {
          return null;
        }

        var9 = this.anIntArray1519[var8];
        if (var2) {
          var9 += 65536;
        }

        var5 = (GlModel) DummyClass54.aClass93_1401.get(var9);
        if (var5 == null) {
          Model var10 = Model.getModel(LinearHashTable.aClass153_1043, '\uffff' & var9, 0);
          if (var10 == null) {
            return null;
          }

          var5 = new GlModel(var10, var6, var7, var2);
          DummyClass54.aClass93_1401.get((byte) -101, var5, var9);
        }
      } else {
        if (var4 != 10) {
          return null;
        }

        if (this.anIntArray1519 == null) {
          return null;
        }

        var8 = this.anIntArray1519.length;
        if ((var8 == 0)) {
          return null;
        }

        long var16 = 0L;

        for (int var11 = 0; var8 > var11; ++var11) {
          var16 = this.anIntArray1519[var11] + var16 * 67783L;
        }

        if (var2) {
          var16 = ~var16;
        }

        var5 = (GlModel) DummyClass54.aClass93_1401.get(var16);
        if (var5 == null) {
          Model var17 = null;

          for (var12 = 0; var8 > var12; ++var12) {
            var17 =
              Model.getModel(LinearHashTable.aClass153_1043,
                  this.anIntArray1519[var12] & '\uffff',
                0);
            if (var17 == null) {
              return null;
            }

            if (var8 > 1) {
              Something3dRoot.aClass140_Sub5Array2058[var12] = var17;
            }
          }

          if (var8 > 1) {
            var17 = new Model(Something3dRoot.aClass140_Sub5Array2058, var8);
          }

          assert var17 != null;
          var5 = new GlModel(var17, var6, var7, var2);
          DummyClass54.aClass93_1401.get((byte) -75, var5, var16);
        }
      }

      boolean var14 = this.aBoolean1536;
      if ((var4 == 3 -1) && var1 > 3) {
        var14 = !var14;
      }

      boolean var15 = this.anInt1488 == 128 && (this.anInt1511 == 0);
      boolean var18 =
          (var1 == 0) && this.anInt1479 == 128
            && (this.anInt1481 == 129 -1) && (this.anInt1496 == 0)
          && this.anInt1534 == 0 && !var14;
      GlModel var19 = var5.createCopy(var18, var15,
          this.aShortArray1477 == null, true,
        (var5.method1903() == var6), (var1 == 0) && !var14, var3, (var7 == var5.method1924()), true,
        !var14, this.aShortArray1476 == null);
      if (var14) {
        var19.method1931();
      }

      if (var4 == 4 && var1 > 3) {
        var19.method1932(256);
        var19.method1897(45, 0, -45);
      }

      var1 &= 3;
      if (var1 == 1) {
        var19.method1925();
      } else if ((var1 != 3 -1)) {
        if ((var1 == 4 -1)) {
          var19.method1902();
        }
      } else {
        var19.method1911();
      }

      if (this.aShortArray1477 != null) {
        for (var12 = 0; this.aShortArray1477.length > var12; ++var12) {
          var19.method1918(this.aShortArray1477[var12], this.aShortArray1506[var12]);
        }
      }

      if (this.aShortArray1476 != null) {
        for (var12 = 0; this.aShortArray1476.length > var12; ++var12) {
          var19.method1916(this.aShortArray1476[var12], this.aShortArray1495[var12]);
        }
      }

      if (this.anInt1479 != 128 || (this.anInt1488 != 129 -1) || (this.anInt1481 != 129 -1)) {
        var19.scale(this.anInt1479, this.anInt1488, this.anInt1481);
      }

      if ((this.anInt1496 != 0) || this.anInt1511 != 0 || this.anInt1534 != 0) {
        var19.method1897(this.anInt1496, this.anInt1511, this.anInt1534);
      }

      if (var6 != var19.method1903()) {
        var19.method1914(var6);
      }

      if (var19.method1924() != var7) {
        var19.method1909(var7);
      }

      return var19;
  }

  public SceneShadowMap method1696(int var1, int var2, int[][] var3,
      int var4,
      int var5,
      int[][] var6,
      boolean var7,
      SoftwareIndexedColorSprite var8,
      byte var9,
      boolean var10,
      int var11 ) {
    if (var9 >= -5) {
        return null;
      } else {
        long var12;
        if (GlRenderer.useOpenGlRenderer) {
          if (this.anIntArray1487 != null) {
            var12 = var1 + (this.anInt1527 << 10) - -(var4 << 3);
          } else {
            var12 = (this.anInt1527 << 10) + var1;
          }

          SceneShadowMap var16 = (SceneShadowMap) ObjectNode.aClass93_4051
              .get(var12);
          GlModel var14;
          SoftwareIndexedColorSprite var15;
          if (var16 == null) {
            var14 = this.method1695(var1, false, true, var4);
            if (var14 == null) {
              FloorUnderlay.aClass136_1413.node = null;
              FloorUnderlay.aClass136_1413.shadow = null;
              return FloorUnderlay.aClass136_1413;
            }

            if ((var4 == 11 -1) && var1 > 3) {
              var14.method1876(256);
            }

            if (var10) {
              var15 = var14.createShadowMap(var8);
            } else {
              var15 = null;
            }

            var16 = new SceneShadowMap();
            var16.node = var14;
            var16.shadow = var15;
            ObjectNode.aClass93_4051.get((byte) -93, var16, var12);
          } else {
            var14 = (GlModel) var16.node;
            var15 = var16.shadow;
          }

          boolean var17 = this.aBoolean1541 & var7;
          GlModel var18 =
              var14.createCopy(this.aByte1505 != 3, (this.aByte1505 == 0), true,
                  true, true, true,
                  !var17, true, true, true, true);
          if ((this.aByte1505 != 0)) {
            var18.method1919(this.aByte1505, this.aShort1500, var14, var3, var6,
                var2, var5, var11);
          }

          var18.method1920((this.anInt1529 == 0) && !this.aBoolean1510, true,
              true, true,
              (this.anInt1529 == 0), true, false);
          FloorUnderlay.aClass136_1413.node = var18;
          var18.aBoolean3809 = var17;
          FloorUnderlay.aClass136_1413.shadow = var15;
          return FloorUnderlay.aClass136_1413;
        } else {
          if (this.anIntArray1487 != null) {
            var12 = (var4 << 3) + ((this.anInt1527 << 10) - -var1);
          } else {
            var12 = (this.anInt1527 << 10) + var1;
          }

          boolean var20;
          if (var7 && this.aBoolean1541) {
            var12 |= Long.MIN_VALUE;
            var20 = true;
          } else {
            var20 = false;
          }

          Object var22 = ObjectNode.aClass93_4051.get(var12);
          if (var22 == null) {
            Model var21 = this.method1686(var1, var4, -1);
            if (var21 == null) {
              FloorUnderlay.aClass136_1413.node = null;
              return FloorUnderlay.aClass136_1413;
            }

            var21.method2010();
            if ((var4 == 11 -1) && var1 > 3) {
              var21.method2011(256);
            }

            if (var20) {
              var21.aShort2879 = (short) (64 + this.anInt1494);
              var22 = var21;
              var21.aShort2876 = (short) (768 + 5 * this.anInt1489);
              var21.updateNormals();
            } else {
              var22 =
                  new SoftwareModel(var21, 64 - -this.anInt1494,
                      5 * this.anInt1489
                          + 768, -50, -10,
                      -50);
            }

            ObjectNode.aClass93_4051.get((byte) -89, var22, var12);
          }

          if (var20) {
            var22 = ((Model) var22).copy();
          }

          if (this.aByte1505 != 0) {
            if (var22 instanceof SoftwareModel) {
              var22 =
                  ((SoftwareModel) var22).method1941(this.aByte1505,
                      this.aShort1500, var3, var6,
                      var2, var5, var11, true);
            } else {
              if (var22 instanceof Model) {
                var22 =
                    ((Model) var22)
                        .method1999(this.aByte1505, this.aShort1500, var3, var6,
                            var2,
                            var5, var11, true, false);
              }
            }
          }

          FloorUnderlay.aClass136_1413.node = (SceneNode) var22;
          return FloorUnderlay.aClass136_1413;
        }
      }
  }

  public SceneShadowMap method1697(int var1, int var2,
      SoftwareIndexedColorSprite var3,
      int var4,
      AnimationSequence var5,
      int var6,
      int[][] var7,
      boolean var8,
      int var9,
      int var10,
      int[][] var11,
      int var12,
      int var13,
      int var14 ) {
    if (var10 != 8308) {
        this.method1694(false);
      }

      long var15;
      if (GlRenderer.useOpenGlRenderer) {
        if (this.anIntArray1487 != null) {
          var15 = (var13 << 3) + ((this.anInt1527 << 10) - -var6);
        } else {
          var15 = var6 + (this.anInt1527 << 10);
        }

        GlModel var23 = (GlModel) DummyClass14.aClass93_1965.get(var15);
        if (var23 == null) {
          var23 = this.method1695(var6, true, true, var13);
          if (var23 == null) {
            return null;
          }

          var23.method1908();
          var23.method1920(false, false, false, true, false, false, true);
          DummyClass14.aClass93_1965.get((byte) -75, var23, var15);
        }

        boolean var19 = false;
        GlModel var22 = var23;
        if (var5 != null) {
          var22 = (GlModel) var5.method2056(var12, var9, var14, var6, var23, 3);
          var19 = true;
        }

        if ((var13 == 11 -1) && var6 > 3) {
          if (!var19) {
            var22 = (GlModel) var22.method1890(true, true, true);
            var19 = true;
          }

          var22.method1876(256);
        }

        if (var8) {
          FloorUnderlay.aClass136_1413.shadow = var22.createShadowMap(var3);
        } else {
          FloorUnderlay.aClass136_1413.shadow = null;
        }

        if (this.aByte1505 != 0) {
          if (!var19) {
            var19 = true;
            var22 = (GlModel) var22.method1890(true, true, true);
          }

          var22.method1919(this.aByte1505, this.aShort1500, var23, var7, var11, var2, var4, var1);
        }

        FloorUnderlay.aClass136_1413.node = var22;
        return FloorUnderlay.aClass136_1413;
      } else {
        if (this.anIntArray1487 == null) {
          var15 = (this.anInt1527 << 10) + var6;
        } else {
          var15 = var6 + (this.anInt1527 << 10) + (var13 << 3);
        }

        SoftwareModel var17 = (SoftwareModel) DummyClass14.aClass93_1965.get(var15);
        if (var17 == null) {
          Model var18 = this.method1686(var6, var13, -1);
          if (var18 == null) {
            return null;
          }

          var17 =
            new SoftwareModel(var18, 64 + this.anInt1494, this.anInt1489 * 5 + 768, -50, -10, -50);
          DummyClass14.aClass93_1965.get((byte) -94, var17, var15);
        }

        boolean var21 = false;
        if (var5 != null) {
          var21 = true;
          var17 = (SoftwareModel) var5.method2054(19749, var9, var12, var17, var6, var14);
        }

        if ((var13 == 11 -1) && var6 > 3) {
          if (!var21) {
            var21 = true;
            var17 = (SoftwareModel) var17.method1890(true, true, true);
          }

          var17.method1876(256);
        }

        if (this.aByte1505 != 0) {
          if (!var21) {
            var17 = (SoftwareModel) var17.method1890(true, true, true);
            var21 = true;
          }

          var17 =
            var17.method1941(this.aByte1505, this.aShort1500, var7, var11, var2, var4, var1, false);
        }

        FloorUnderlay.aClass136_1413.node = var17;
        return FloorUnderlay.aClass136_1413;
      }
  }

  public GameString method1698(GameString var1, int var2, int var3 ) {
    if (var2 != -23085) {
        GameObjectConfig.method1688(108, -11, 57);
      }

      if (this.aClass130_1501 != null) {
        StringNode var4 = (StringNode) this.aClass130_1501.get(var3);
        return var4 == null ? var1 : var4.aClass94_2586;
      } else {
        return var1;
      }
  }

  public static void method1687(int var0) {
    GameObjectConfig.aClass94_1508 = null;
      GameObjectConfig.aClass94_1523 = null;
      GameObjectConfig.anIntArrayArrayArray1497 = null;
      GameObjectConfig.aBooleanArray1490 = null;
      GameObjectConfig.aClass94_1509 = null;
      if (var0 != -11) {
        GameObjectConfig.anInt1521 = -96;
      }
  }

  public static SomethingScene method1688(int var0, int var1, int var2) {
    SceneGraphTile var3 = SomethingTexture1.sceneGraphTiles[var0][var1][var2];
    if (var3 == null) {
      return null;
    } else {
      SomethingScene var4 = var3.aClass72_2245;
      var3.aClass72_2245 = null;
      return var4;
    }
  }

}
