package com.jagex.runescape.model;

import com.jagex.runescape.statics.GlobalStatics_7;

public final class CollisionMap {

  public int[][] anIntArrayArray1304;
  private final int anInt1300;
  private final int anInt1303;
  private final int anInt1306;
  private int anInt1309;

  public CollisionMap(int var1, int var2) {
    this.anInt1303 = var2;
    this.anInt1306 = 0;
    this.anInt1309 = 0;
    this.anInt1300 = var1;
    this.anIntArrayArray1304 = new int[this.anInt1300][this.anInt1303];
    this.method1496(0);
  }

  public void method1485(int var1, boolean var2, int var3, int var4,
      int var5, int var6) {
    var6 -= this.anInt1309;
    if (var3 > -101) {
      GlobalStatics_7.isOnScreen(-88, -61, -44, 72, 121);
    }

    var4 -= this.anInt1306;
    if (var5 == 0) {
      if (var1 == 0) {
        this.method1501((byte) 114, var4, var6, 128);
        this.method1501((byte) 122, var4, var6 - 1, 8);
      }

      if (var1 == 1) {
        this.method1501((byte) 77, var4, var6, 2);
        this.method1501((byte) 105, 1 + var4, var6, 32);
      }

      if (var1 == 2) {
        this.method1501((byte) 75, var4, var6, 8);
        this.method1501((byte) 38, var4, var6 + 1, 128);
      }

      if (var1 == 3) {
        this.method1501((byte) 110, var4, var6, 32);
        this.method1501((byte) 26, var4 - 1, var6, 2);
      }
    }

    if (var5 == 1 || var5 == 3) {
      if (var1 == 0) {
        this.method1501((byte) 99, var4, var6, 1);
        this.method1501((byte) 23, 1 + var4, -1 + var6, 16);
      }

      if (var1 == 1) {
        this.method1501((byte) 52, var4, var6, 4);
        this.method1501((byte) 60, 1 + var4, 1 + var6, 64);
      }

      if (var1 == 2) {
        this.method1501((byte) 126, var4, var6, 16);
        this.method1501((byte) 103, var4 - 1, var6 + 1, 1);
      }

      if (var1 == 3) {
        this.method1501((byte) 125, var4, var6, 64);
        this.method1501((byte) 64, var4 - 1, -1 + var6, 4);
      }
    }

    if (var5 == 2) {
      if (var1 == 0) {
        this.method1501((byte) 110, var4, var6, 130);
        this.method1501((byte) 78, var4, -1 + var6, 8);
        this.method1501((byte) 45, var4 + 1, var6, 32);
      }

      if (var1 == 1) {
        this.method1501((byte) 93, var4, var6, 10);
        this.method1501((byte) 72, var4 + 1, var6, 32);
        this.method1501((byte) 23, var4, var6 + 1, 128);
      }

      if (var1 == 2) {
        this.method1501((byte) 33, var4, var6, 40);
        this.method1501((byte) 102, var4, var6 + 1, 128);
        this.method1501((byte) 102, var4 - 1, var6, 2);
      }

      if (var1 == 3) {
        this.method1501((byte) 24, var4, var6, 160);
        this.method1501((byte) 122, -1 + var4, var6, 2);
        this.method1501((byte) 77, var4, var6 - 1, 8);
      }
    }

    if (var2) {
      if (var5 == 0) {
        if (var1 == 0) {
          this.method1501((byte) 24, var4, var6, 65536);
          this.method1501((byte) 115, var4, var6 - 1, 4096);
        }

        if (var1 == 1) {
          this.method1501((byte) 120, var4, var6, 1024);
          this.method1501((byte) 110, var4 + 1, var6, 16384);
        }

        if (var1 == 2) {
          this.method1501((byte) 101, var4, var6, 4096);
          this.method1501((byte) 38, var4, 1 + var6, 65536);
        }

        if (var1 == 3) {
          this.method1501((byte) 31, var4, var6, 16384);
          this.method1501((byte) 65, var4 - 1, var6, 1024);
        }
      }

      if (var5 == 1 || var5 == 3) {
        if (var1 == 0) {
          this.method1501((byte) 47, var4, var6, 512);
          this.method1501((byte) 66, 1 + var4, var6 - 1, 8192);
        }

        if (var1 == 1) {
          this.method1501((byte) 40, var4, var6, 2048);
          this.method1501((byte) 88, 1 + var4, var6 + 1, 0x8000);
        }

        if (var1 == 2) {
          this.method1501((byte) 96, var4, var6, 8192);
          this.method1501((byte) 41, var4 - 1, 1 + var6, 512);
        }

        if (var1 == 3) {
          this.method1501((byte) 90, var4, var6, 0x8000);
          this.method1501((byte) 47, var4 - 1, var6 - 1, 2048);
        }
      }

      if (var5 == 2) {
        if (var1 == 0) {
          this.method1501((byte) 51, var4, var6, 66560);
          this.method1501((byte) 82, var4, var6 - 1, 4096);
          this.method1501((byte) 68, var4 + 1, var6, 16384);
        }

        if (var1 == 1) {
          this.method1501((byte) 112, var4, var6, 5120);
          this.method1501((byte) 89, 1 + var4, var6, 16384);
          this.method1501((byte) 48, var4, 1 + var6, 65536);
        }

        if (var1 == 2) {
          this.method1501((byte) 126, var4, var6, 20480);
          this.method1501((byte) 25, var4, var6 + 1, 65536);
          this.method1501((byte) 46, -1 + var4, var6, 1024);
        }

        if (var1 == 3) {
          this.method1501((byte) 39, var4, var6, 81920);
          this.method1501((byte) 113, var4 - 1, var6, 1024);
          this.method1501((byte) 86, var4, var6 - 1, 4096);
        }
      }
    }
  }

  public void method1486(int var1, int var2, int var3, boolean var4, int var5,
      int var6) {
    var6 -= this.anInt1309;
    var5 -= this.anInt1306;
    if (var3 == 0) {
      if (var1 == 0) {
        this.method1490(128, (byte) -80, var6, var5);
        this.method1490(8, (byte) -80, -1 + var6, var5);
      }

      if (var1 == 1) {
        this.method1490(2, (byte) -80, var6, var5);
        this.method1490(32, (byte) -80, var6, 1 + var5);
      }

      if (var1 == 2) {
        this.method1490(8, (byte) -80, var6, var5);
        this.method1490(128, (byte) -80, 1 + var6, var5);
      }

      if (var1 == 3) {
        this.method1490(32, (byte) -80, var6, var5);
        this.method1490(2, (byte) -80, var6, -1 + var5);
      }
    }

    if (var2 == 2) {
      if (var3 == 1 || var3 == 3) {
        if (var1 == 0) {
          this.method1490(1, (byte) -80, var6, var5);
          this.method1490(16, (byte) -80, var6 - 1, 1 + var5);
        }

        if (var1 == 1) {
          this.method1490(4, (byte) -80, var6, var5);
          this.method1490(64, (byte) -80, var6 + 1, var5 + 1);
        }

        if (var1 == 2) {
          this.method1490(16, (byte) -80, var6, var5);
          this.method1490(1, (byte) -80, 1 + var6, -1 + var5);
        }

        if (var1 == 3) {
          this.method1490(64, (byte) -80, var6, var5);
          this.method1490(4, (byte) -80, -1 + var6, var5 - 1);
        }
      }

      if (var3 == 2) {
        if (var1 == 0) {
          this.method1490(130, (byte) -80, var6, var5);
          this.method1490(8, (byte) -80, -1 + var6, var5);
          this.method1490(32, (byte) -80, var6, var5 + 1);
        }

        if (var1 == 1) {
          this.method1490(10, (byte) -80, var6, var5);
          this.method1490(32, (byte) -80, var6, 1 + var5);
          this.method1490(128, (byte) -80, var6 + 1, var5);
        }

        if (var1 == 2) {
          this.method1490(40, (byte) -80, var6, var5);
          this.method1490(128, (byte) -80, 1 + var6, var5);
          this.method1490(2, (byte) -80, var6, var5 - 1);
        }

        if (var1 == 3) {
          this.method1490(160, (byte) -80, var6, var5);
          this.method1490(2, (byte) -80, var6, -1 + var5);
          this.method1490(8, (byte) -80, -1 + var6, var5);
        }
      }

      if (var4) {
        if (var3 == 0) {
          if (var1 == 0) {
            this.method1490(65536, (byte) -80, var6, var5);
            this.method1490(4096, (byte) -80, var6 - 1, var5);
          }

          if (var1 == 1) {
            this.method1490(1024, (byte) -80, var6, var5);
            this.method1490(16384, (byte) -80, var6, var5 + 1);
          }

          if (var1 == 2) {
            this.method1490(4096, (byte) -80, var6, var5);
            this.method1490(65536, (byte) -80, 1 + var6, var5);
          }

          if (var1 == 3) {
            this.method1490(16384, (byte) -80, var6, var5);
            this.method1490(1024, (byte) -80, var6, var5 - 1);
          }
        }

        if (var3 == 1 || var3 == 3) {
          if (var1 == 0) {
            this.method1490(512, (byte) -80, var6, var5);
            this.method1490(8192, (byte) -80, -1 + var6, 1 + var5);
          }

          if (var1 == 1) {
            this.method1490(2048, (byte) -80, var6, var5);
            this.method1490(0x8000, (byte) -80, 1 + var6, var5 + 1);
          }

          if (var1 == 2) {
            this.method1490(8192, (byte) -80, var6, var5);
            this.method1490(512, (byte) -80, var6 + 1, var5 - 1);
          }

          if (var1 == 3) {
            this.method1490(0x8000, (byte) -80, var6, var5);
            this.method1490(2048, (byte) -80, -1 + var6, var5 - 1);
          }
        }

        if (var3 == 2) {
          if (var1 == 0) {
            this.method1490(66560, (byte) -80, var6, var5);
            this.method1490(4096, (byte) -80, -1 + var6, var5);
            this.method1490(16384, (byte) -80, var6, 1 + var5);
          }

          if (var1 == 1) {
            this.method1490(5120, (byte) -80, var6, var5);
            this.method1490(16384, (byte) -80, var6, var5 + 1);
            this.method1490(65536, (byte) -80, 1 + var6, var5);
          }

          if (var1 == 2) {
            this.method1490(20480, (byte) -80, var6, var5);
            this.method1490(65536, (byte) -80, var6 + 1, var5);
            this.method1490(1024, (byte) -80, var6, -1 + var5);
          }

          if (var1 == 3) {
            this.method1490(81920, (byte) -80, var6, var5);
            this.method1490(1024, (byte) -80, var6, var5 - 1);
            this.method1490(4096, (byte) -80, -1 + var6, var5);
          }
        }
      }

    }
  }

  private boolean method1487(int var1, int var2, int var3, int var4, int var5,
      int var6,
      int var7, int var8, byte var9) {
    if (var2 + var3 > var8 && var3 < var1 + var8) {
      if (var9 != -125) {
        this.method1488(92, -42, true, -119, -67, -14, -88, 5);
      }

      return var4 + var6 > var5 && var7 + var5 > var6;
    } else {
      return false;
    }
  }

  public boolean method1488(int var1, int var2, boolean var3, int var4,
      int var5,
      int var6,
      int var7,
      int var8) {
    if (var7 != 1) {
      if (var2 <= var5 && var2 + var7 - 1 >= var5 && var1 <= var7 + var1
          - 1) {
        return true;
      }
    } else if (var2 == var5 && var4 == var1) {
      return true;
    }

    if (var3) {
      return false;
    } else {
      var4 -= this.anInt1306;
      var5 -= this.anInt1309;
      var1 -= this.anInt1306;
      var2 -= this.anInt1309;
      if (var7 == 1) {
        if (var6 == 0) {
          if (var8 == 0) {
            if (var2 == var5 - 1 && var4 == var1) {
              return true;
            }

            if (var2 == var5 && var1 + 1 == var4
                && (this.anIntArrayArray1304[var2][var4] & 19661088) == 0) {
              return true;
            }

            if (var5 == var2 && -1 + var1 == var4 && (
                this.anIntArrayArray1304[var2][var4]
                    & 19661058) == 0) {
              return true;
            }
          } else if (var8 != 1) {
            if (var8 == 2) {
              if (1 + var5 == var2 && var4 == var1) {
                return true;
              }

              if (var5 == var2 && var4 == 1 + var1
                  && (this.anIntArrayArray1304[var2][var4] & 19661088) == 0) {
                return true;
              }

              if (var5 == var2 && -var1 == ~var4
                  && (this.anIntArrayArray1304[var2][var4] & 19661058) == 0) {
                return true;
              }
            } else if (var8 == 3) {
              if (var2 == var5 && var1 - 1 == var4) {
                return true;
              }

              if (-1 + var5 == var2 && var1 == var4 && (
                  this.anIntArrayArray1304[var2][var4] & 19661064) == 0) {
                return true;
              }

              if (var5 + 1 == var2 && var4 == var1
                  && (this.anIntArrayArray1304[var2][var4] & 19661184) == 0) {
                return true;
              }
            }
          } else {
            if (var5 == var2 && var4 == var1 + 1) {
              return true;
            }

            if (var5 - 1 == var2 && var1 == var4 && (
                this.anIntArrayArray1304[var2][var4]
                    & 19661064) == 0) {
              return true;
            }

            if (var2 == 1 + var5 && var4 == var1
                && (this.anIntArrayArray1304[var2][var4] & 19661184) == 0) {
              return true;
            }
          }
        }

        if (var6 == 2) {
          if (var8 == 0) {
            if (var2 == var5 - 1 && var1 == var4) {
              return true;
            }

            if (var2 == var5 && var4 == 1 + var1) {
              return true;
            }

            if (var2 == 1 + var5 && var4 == var1
                && (19661184 & this.anIntArrayArray1304[var2][var4]) == 0) {
              return true;
            }

            if (var5 == var2 && var4 == var1 - 1
                && (this.anIntArrayArray1304[var2][var4] & 19661058) == 0) {
              return true;
            }
          } else {
            if (var8 == 1) {
              if (var2 == var5 - 1 && var1 == var4 && (
                  this.anIntArrayArray1304[var2][var4]
                      & 19661064) == 0) {
                return true;
              }

              if (var5 == var2 && var1 + 1 == var4) {
                return true;
              }

              if (var2 == var5 + 1 && var1 == var4) {
                return true;
              }

              if (var5 == var2 && var4 == -1 + var1 && (19661058
                  & this.anIntArrayArray1304[var2][var4]) == 0) {
                return true;
              }
            } else if (var8 != 2) {
              if (var8 == 3) {
                if (var2 == var5 - 1 && var1 == var4) {
                  return true;
                }

                if (var2 == var5 && var1 + 1 == var4 && (19661088
                    & this.anIntArrayArray1304[var2][var4]) == 0) {
                  return true;
                }

                if (var2 == var5 + 1 && var1 == var4
                    && (19661184 & this.anIntArrayArray1304[var2][var4]) == 0) {
                  return true;
                }

                if (var2 == var5 && var4 == -1 + var1) {
                  return true;
                }
              }
            } else {
              if (var2 == -1 + var5 && var1 == var4
                  && (this.anIntArrayArray1304[var2][var4] & 19661064) == 0) {
                return true;
              }

              if (var5 == var2 && var4 == 1 + var1
                  && (19661088 & this.anIntArrayArray1304[var2][var4]) == 0) {
                return true;
              }

              if (var5 + 1 == var2 && var1 == var4) {
                return true;
              }

              if (var2 == var5 && var1 - 1 == var4) {
                return true;
              }
            }
          }
        }

        if (var6 == 9) {
          if (var2 == var5 && 1 + var1 == var4 && (
              this.anIntArrayArray1304[var2][var4]
                  & 32) == 0) {
            return true;
          }

          if (var2 == var5 && var4 == -1 + var1
              && (this.anIntArrayArray1304[var2][var4] & 2) == 0) {
            return true;
          }

          if (var2 == -1 + var5 && var4 == var1 && (
              this.anIntArrayArray1304[var2][var4]
                  & 8) == 0) {
            return true;
          }

          return var5 + 1 == var2 && var1 == var4
              && (this.anIntArrayArray1304[var2][var4] & 128) == 0;
        }
      } else {
        int var9 = -1 + var7 + var2;
        int var10 = -1 + var4 + var7;
        if (var6 == 0) {
          if (var8 == 0) {
            if (var2 == -var7 + var5 && var4 <= var1 && var1 <= var10) {
              return true;
            }

            if (var2 <= var5 && var9 >= var5 && 1 + var1 == var4 && (
                this.anIntArrayArray1304[var5][var4] & 19661088) == 0) {
              return true;
            }

            if (var2 <= var5 && var9 >= var5 && -var7 + var1 == var4
                && (this.anIntArrayArray1304[var5][var10] & 19661058) == 0) {
              return true;
            }
          } else if (var8 == 1) {
            if (var5 >= var2 && var5 <= var9 && var1 + 1 == var4) {
              return true;
            }

            if (var2 == var5 - var7 && var4 <= var1 && var10 >= var1
                && (this.anIntArrayArray1304[var9][var1] & 19661064) == 0) {
              return true;
            }

            if (var2 == var5 + 1 && var4 <= var1 && var10 >= var1 && (
                this.anIntArrayArray1304[var2][var1] & 19661184) == 0) {
              return true;
            }
          } else if (var8 != 2) {
            if (var8 == 3) {
              if (var2 <= var5 && var9 >= var5 && var1 - var7 == var4) {
                return true;
              }

              if (var2 == var5 - var7 && var1 >= var4 && var10 >= var1
                  && (19661064 & this.anIntArrayArray1304[var9][var1]) == 0) {
                return true;
              }

              if (1 + var5 == var2 && var4 <= var1 && var1 <= var10
                  && (this.anIntArrayArray1304[var2][var1] & 19661184) == 0) {
                return true;
              }
            }
          } else {
            if (1 + var5 == var2 && var4 <= var1 && var1 <= var10) {
              return true;
            }

            if (var5 >= var2 && var9 >= var5 && var4 == 1 + var1
                && (this.anIntArrayArray1304[var5][var4] & 19661088) == 0) {
              return true;
            }

            if (var5 >= var2 && var9 >= var5 && var1 - var7 == var4 &&
                (19661058
                    & this.anIntArrayArray1304[var5][var10]) == 0) {
              return true;
            }
          }
        }

        if (var6 == 2) {
          if (var8 == 0) {
            if (var2 == -var7 + var5 && var1 >= var4 && var1 <= var10) {
              return true;
            }

            if (var2 <= var5 && var9 >= var5 && var4 == 1 + var1) {
              return true;
            }

            if (1 + var5 == var2 && var1 >= var4 && var1 <= var10
                && (
                this.anIntArrayArray1304[var2][var1] & 19661184) == 0) {
              return true;
            }

            if (var5 >= var2 && var9 >= var5 && -var7 + var1 == var4
                && (19661058 & this.anIntArrayArray1304[var5][var10]) == 0) {
              return true;
            }
          } else {
            if (var8 == 1) {
              if (var2 == var5 - var7 && var1 >= var4 && var1 <= var10
                  && (19661064 & this.anIntArrayArray1304[var9][var1]) == 0) {
                return true;
              }

              if (var2 <= var5 && var9 >= var5 && var4 == 1 + var1) {
                return true;
              }

              if (var5 + 1 == var2 && var1 >= var4 && var1 <= var10) {
                return true;
              }

              if (var5 >= var2 && var5 <= var9 && var4 == -var7 + var1
                  && (this.anIntArrayArray1304[var5][var10] & 19661058) == 0) {
                return true;
              }
            } else {
              if (var8 == 2) {
                if (-var7 + var5 == var2 && var4 <= var1 && var10 >= var1
                    && (this.anIntArrayArray1304[var9][var1] & 19661064)
                    == 0) {
                  return true;
                }

                if (var2 <= var5 && var5 <= var9 && var4 == var1 + 1
                    && (this.anIntArrayArray1304[var5][var4] & 19661088) == 0) {
                  return true;
                }

                if (var2 == 1 + var5 && var4 <= var1 && var1 <= var10) {
                  return true;
                }

                if (var2 <= var5 && var9 >= var5
                    && -var7 + var1 == var4) {
                  return true;
                }
              } else if (var8 == 3) {
                if (-var7 + var5 == var2 && var1 >= var4 && var1 <= var10) {
                  return true;
                }

                if (var2 <= var5 && var5 <= var9 && 1 + var1 == var4
                    && (
                    this.anIntArrayArray1304[var5][var4] & 19661088) == 0) {
                  return true;
                }

                if (var2 == 1 + var5 && var1 >= var4 && var1 <= var10
                    && (this.anIntArrayArray1304[var2][var1] & 19661184) == 0) {
                  return true;
                }

                if (var2 <= var5 && var9 >= var5 && var1 - var7 == var4) {
                  return true;
                }
              }
            }
          }
        }

        if (var6 == 9) {
          if (var2 <= var5 && var5 <= var9 && var4 == var1 + 1
              && (this.anIntArrayArray1304[var5][var4] & 19661088) == 0) {
            return true;
          }

          if (var5 >= var2 && var5 <= var9 && var4 == var1 - var7 &&
              (19661058
                  & this.anIntArrayArray1304[var5][var10]) == 0) {
            return true;
          }

          if (-var7 + var5 == var2 && var1 >= var4 && var1 <= var10
              && (19661064 & this.anIntArrayArray1304[var9][var1]) == 0) {
            return true;
          }

          return var2 == 1 + var5 && var1 >= var4 && var10 >= var1
              && (
              this.anIntArrayArray1304[var2][var1] & 19661184) == 0;
        }
      }

      return false;
    }
  }

  public void method1489(int var1, boolean var2, byte var3, int var4,
      int var5,
      int var6) {
    var4 -= this.anInt1306;
    var1 -= this.anInt1309;
    int var7 = 256;
    if (var2) {
      var7 += 131072;
    }

    int var8 = var1;
    if (var3 > 57) {
      for (; var8 < var1 + var5; ++var8) {
        if (var8 >= 0 && var8 < this.anInt1300) {
          for (int var9 = var4; var9 < var6 + var4; ++var9) {
            if (var9 >= 0 && this.anInt1303 > var9) {
              this.method1490(var7, (byte) -80, var8, var9);
            }
          }
        }
      }

    }
  }

  private void method1490(int var1, byte var2, int var3, int var4) {
    if (var2 != -80) {
      this.method1498(false, 25, 78, -38, 60, 54, 58, 117, 109);
    }

    this.anIntArrayArray1304[var3][var4] =
        this.anIntArrayArray1304[var3][var4] | var1;
  }

  public boolean method1492(int var1, int var2, int var3, int var4, int var5,
      int var6, int var7,
      int var8) {
    if (var5 == 1) {
      if (var3 == var7 && var1 == var4) {
        return true;
      }
    } else if (var7 <= var3 && -1 + var5 + var7 >= var3
        && -1 + var1 + var5 >= var1) {
      return true;
    }

    if (var8 <= 78) {
      GlobalStatics_7.aClass94_1301 = null;
    }

    var7 -= this.anInt1309;
    var1 -= this.anInt1306;
    var3 -= this.anInt1309;
    var4 -= this.anInt1306;
    if (var5 == 1) {
      if (var2 == 6 || var2 == 7) {
        if (var2 == 7) {
          var6 = var6 + 2 & 3;
        }

        if (var6 == 0) {
          if (var7 == 1 + var3 && var1 == var4
              && (this.anIntArrayArray1304[var7][var4] & 128) == 0) {
            return true;
          }

          if (var3 == var7 && var4 == -1 + var1
              && (2 & this.anIntArrayArray1304[var7][var4]) == 0) {
            return true;
          }
        } else if (var6 == 1) {
          if (var7 == var3 - 1 && var1 == var4 && (
              this.anIntArrayArray1304[var7][var4]
                  & 8) == 0) {
            return true;
          }

          if (var3 == var7 && var4 == -1 + var1 && (2
              & this.anIntArrayArray1304[var7][var4]) == 0) {
            return true;
          }
        } else if (var6 != 2) {
          if (var6 == 3) {
            if (var7 == var3 + 1 && var4 == var1
                && (128 & this.anIntArrayArray1304[var7][var4]) == 0) {
              return true;
            }

            if (var3 == var7 && var4 == var1 + 1
                && (32 & this.anIntArrayArray1304[var7][var4]) == 0) {
              return true;
            }
          }
        } else {
          if (var7 == var3 - 1 && var4 == var1 && (8
              & this.anIntArrayArray1304[var7][var4]) == 0) {
            return true;
          }

          if (var3 == var7 && 1 + var1 == var4 && (32
              & this.anIntArrayArray1304[var7][var4]) == 0) {
            return true;
          }
        }
      }

      if (var2 == 8) {
        if (var7 == var3 && 1 + var1 == var4 && (32
            & this.anIntArrayArray1304[var7][var4]) == 0) {
          return true;
        }

        if (var7 == var3 && var1 - 1 == var4
            && (this.anIntArrayArray1304[var7][var4] & 2) == 0) {
          return true;
        }

        if (-1 + var3 == var7 && var4 == var1 && (8
            & this.anIntArrayArray1304[var7][var4]) == 0) {
          return true;
        }

        return var7 == var3 + 1 && var1 == var4
            && (128 & this.anIntArrayArray1304[var7][var4]) == 0;
      }
    } else {
      int var9 = var7 + var5 - 1;
      int var10 = -1 + var4 + var5;
      if (var2 == 6 || var2 == 7) {
        if (var2 == 7) {
          var6 = 2 + var6 & 3;
        }

        if (var6 == 0) {
          if (1 + var3 == var7 && var4 <= var1 && var1 <= var10
              && (
              this.anIntArrayArray1304[var7][var1] & 128) == 0) {
            return true;
          }

          if (var3 >= var7 && var9 >= var3 && var1 - var5 == var4
              && (2 & this.anIntArrayArray1304[var3][var10]) == 0) {
            return true;
          }
        } else {
          if (var6 == 1) {
            if (-var5 + var3 == var7 && var1 >= var4 && var10 >= var1
                && (8
                & this.anIntArrayArray1304[var9][var1]) == 0) {
              return true;
            }

            if (var3 >= var7 && var9 >= var3 && var1 - var5 == var4
                && (
                this.anIntArrayArray1304[var3][var10] & 2) == 0) {
              return true;
            }
          } else if (var6 != 2) {
            if (var6 == 3) {
              if (1 + var3 == var7 && var4 <= var1 && var1 <= var10
                  && (128 & this.anIntArrayArray1304[var7][var1]) == 0) {
                return true;
              }

              if (var3 >= var7 && var3 <= var9 && var4 == var1 + 1
                  && (
                  this.anIntArrayArray1304[var3][var4] & 32) == 0) {
                return true;
              }
            }
          } else {
            if (var7 == -var5 + var3 && var1 >= var4 && var1 <= var10
                && (8
                & this.anIntArrayArray1304[var9][var1]) == 0) {
              return true;
            }

            if (var7 <= var3 && var3 <= var9 && var4 == var1 + 1 && (
                32
                    & this.anIntArrayArray1304[var3][var4]) == 0) {
              return true;
            }
          }
        }
      }

      if (var2 == 8) {
        if (var7 <= var3 && var9 >= var3 && var4 == 1 + var1 && (
            this.anIntArrayArray1304[var3][var4] & 32) == 0) {
          return true;
        }

        if (var3 >= var7 && var9 >= var3 && var4 == var1 - var5
            && (this.anIntArrayArray1304[var3][var10] & 2) == 0) {
          return true;
        }

        if (var7 == -var5 + var3 && var4 <= var1 && var10 >= var1
            && (this.anIntArrayArray1304[var9][var1] & 8) == 0) {
          return true;
        }

        return var7 == 1 + var3 && var1 >= var4 && var1 <= var10 && (
            this.anIntArrayArray1304[var7][var1] & 128) == 0;
      }
    }

    return false;
  }

  private boolean method1494(int var1, int var2, int var3, int var4,
      boolean var5, int var6,
      int var7, int var8, int var9, int var10) {
    int var11 = var7 + var9;
    int var12 = var8 + var10;
    if (var5) {
      int var13 = var3 + var1;
      int var14 = var2 + var6;
      int var15;
      int var16;
      if (var7 >= var1 && var7 < var13) {
        if (var12 == var2 && (4 & var4) == 0) {
          var15 = var7;

          for (var16 = var13 >= var11 ? var11 : var13; var16 > var15;
              ++var15) {
            if ((
                this.anIntArrayArray1304[-this.anInt1309 + var15][var12 - (
                    this.anInt1306 + 1)]
                    & 2) == 0) {
              return true;
            }
          }
        } else if (var14 == var8 && (1 & var4) == 0) {
          var15 = var7;

          for (var16 = var11 > var13 ? var13 : var11; var16 > var15;
              ++var15) {
            if ((32 & this.anIntArrayArray1304[var15 - this.anInt1309][var8
                - this.anInt1306])
                == 0) {
              return true;
            }
          }
        }
      } else if (var11 > var1 && var11 <= var13) {
        if (var2 == var12 && (4 & var4) == 0) {
          for (var15 = var1; var11 > var15; ++var15) {
            if ((2 & this.anIntArrayArray1304[-this.anInt1309 + var15][var12
                - (
                this.anInt1306
                    + 1)]) == 0) {
              return true;
            }
          }
        } else if (var8 == var14 && (1 & var4) == 0) {
          for (var15 = var1; var11 > var15; ++var15) {
            if ((32 & this.anIntArrayArray1304[-this.anInt1309
                + var15][-this.anInt1306
                + var8]) == 0) {
              return true;
            }
          }
        }
      } else if (var8 >= var2 && var14 > var8) {
        if (var11 == var1 && (8 & var4) == 0) {
          var15 = var8;

          for (var16 = var14 >= var12 ? var12 : var14; var15 < var16;
              ++var15) {
            if ((8 & this.anIntArrayArray1304[-1 - this.anInt1309 + var11][
                var15
                    - this.anInt1306]) == 0) {
              return true;
            }
          }
        } else if (var7 == var13 && (var4 & 2) == 0) {
          var15 = var8;

          for (var16 = var14 < var12 ? var14 : var12; var15 < var16;
              ++var15) {
            if ((this.anIntArrayArray1304[-this.anInt1309
                + var7][-this.anInt1306 + var15] & 128)
                == 0) {
              return true;
            }
          }
        }
      } else if (var2 < var12 && var14 >= var12) {
        if (var11 == var1 && (var4 & 8) == 0) {
          for (var15 = var2; var12 > var15; ++var15) {
            if ((
                this.anIntArrayArray1304[-this.anInt1309
                    + var11 - 1][-this.anInt1306
                    + var15]
                    & 8) == 0) {
              return true;
            }
          }
        } else if (var13 == var7 && (var4 & 2) == 0) {
          for (var15 = var2; var15 < var12; ++var15) {
            if ((128 & this.anIntArrayArray1304[var7
                - this.anInt1309][-this.anInt1306
                + var15]) == 0) {
              return true;
            }
          }
        }
      }

      return false;
    } else {
      return true;
    }
  }

  public void method1496(int var1) {
    for (int var2 = var1; this.anInt1300 > var2; ++var2) {
      for (int var3 = 0; this.anInt1303 > var3; ++var3) {
        if (var2 != 0 && var3 != 0 && var2 < this.anInt1300
            - 5 && this.anInt1303 - 5 > var3) {
          this.anIntArrayArray1304[var2][var3] = 0x1000000;
        } else {
          this.anIntArrayArray1304[var2][var3] = 0xffffff;
        }
      }
    }
  }

  public void method1497(int var1, int var2, int var3) {
    if (var2 == 7605) {
      var1 -= this.anInt1306;
      var3 -= this.anInt1309;
      this.anIntArrayArray1304[var3][var1] =
          this.anIntArrayArray1304[var3][var1] | 2097152;
    }
  }

  public boolean method1498(boolean var1, int var2, int var3, int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9) {
    if (var5 > 1) {
      return this.method1487(var5, var6, var2, var9, var3, var8, var5, var4,
          (byte) -125) || this
          .method1494(var2, var8, var6, var7, true, var9, var4,
              var3, var5, var5);
    } else {
      int var10 = -1 + var6 + var2;
      int var11 = var8 + var9 - 1;
      if (var2 <= var4 && var10 >= var4 && var8 <= var3 && var3 <= var11) {
        return true;
      } else {
        if (!var1) {
          this.method1501((byte) -85, 4, 106, -39);
        }

        return
            var2 - 1 == var4 && var3 >= var8 && var3 <= var11 && (
                this.anIntArrayArray1304[-this.anInt1309
                    + var4][var3 - this.anInt1306] & 8) == 0
                && (
                var7 & 8) == 0
                || var4 == 1 + var10 && var8 <= var3 && var11 >= var3
                && (128
                & this.anIntArrayArray1304[var4 - this.anInt1309][
                -this.anInt1306
                    + var3]) == 0
                && (var7 & 2) == 0
                || var3 == var8 - 1 && var2 <= var4 && var10 >= var4
                &&
                (2 & this.anIntArrayArray1304[-this.anInt1309
                    + var4][-this.anInt1306
                    + var3])
                    == 0 && (4 & var7) == 0
                || var3 == 1 + var11 && var4 >= var2
                && var10 >= var4
                && (32 & this.anIntArrayArray1304[var4 - this.anInt1309][var3
                - this.anInt1306]) == 0 && (var7 & 1) == 0;
      }
    }
  }

  public void method1499(int var1, byte var2, int var3) {
    var3 -= this.anInt1309;
    var1 -= this.anInt1306;
    this.anIntArrayArray1304[var3][var1] =
        this.anIntArrayArray1304[var3][var1] & -262145;
    if (var2 != -73) {
      this.method1502(-117, 28, -110, true, 123, -33, 13);
    }
  }

  public boolean method1500(int var1, int var2, int var3, int var4, int var5) {
    if (var5 == var4 && var2 == var3) {
      return true;
    } else {
      var3 -= this.anInt1306;
      if (var1 != -2) {
        this.anInt1309 = -82;
      }

      var4 -= this.anInt1309;
      if (var4 >= 0 && this.anInt1300
          > var4 && var3 >= 0 && var3 < this.anInt1303) {
        var2 -= this.anInt1306;
        var5 -= this.anInt1309;
        int var6;
        if (var4 > var5) {
          var6 = var4 - var5;
        } else {
          var6 = -var4 + var5;
        }

        int var7;
        if (var3 <= var2) {
          var7 = -var3 + var2;
        } else {
          var7 = var3 - var2;
        }

        int var8;
        int var9;
        if (var6 <= var7) {
          var9 = 0x8000;
          var8 = 65536 * var6 / var7;

          while (var2 != var3) {
            if (var3 > var2) {
              if ((this.anIntArrayArray1304[var5][var2] & 19661058) != 0) {
                return false;
              }

              ++var2;
            } else if (var3 < var2) {
              if ((19661088 & this.anIntArrayArray1304[var5][var2]) != 0) {
                return false;
              }

              --var2;
            }

            var9 += var8;
            if (var9 >= 65536) {
              var9 -= 65536;
              if (var5 >= var4) {
                if (var5 > var4) {
                  if ((19661184 & this.anIntArrayArray1304[var5][var2]) != 0) {
                    return false;
                  }

                  --var5;
                }
              } else {
                if ((19661064 & this.anIntArrayArray1304[var5][var2]) != 0) {
                  return false;
                }

                ++var5;
              }
            }
          }
        } else {
          var8 = 65536 * var7 / var6;
          var9 = 0x8000;

          while (var4 != var5) {
            if (var5 >= var4) {
              if (var4 < var5) {
                if ((this.anIntArrayArray1304[var5][var2] & 19661184) != 0) {
                  return false;
                }

                --var5;
              }
            } else {
              if ((this.anIntArrayArray1304[var5][var2] & 19661064) != 0) {
                return false;
              }

              ++var5;
            }

            var9 += var8;
            if (var9 >= 65536) {
              var9 -= 65536;
              if (var2 < var3) {
                if ((this.anIntArrayArray1304[var5][var2] & 19661058) != 0) {
                  return false;
                }

                ++var2;
              } else if (var3 < var2) {
                if ((19661088 & this.anIntArrayArray1304[var5][var2]) != 0) {
                  return false;
                }

                --var2;
              }
            }
          }
        }

        return (19136768 & this.anIntArrayArray1304[var4][var3]) == 0;
      } else {
        return false;
      }
    }
  }

  private void method1501(byte var1, int var2, int var3, int var4) {
    if (var1 >= 18) {
      int var11 = ~var4;
      this.anIntArrayArray1304[var3][var2] =
          this.anIntArrayArray1304[var3][var2] & var11;
    }
  }

  public void method1502(int var1, int var2, int var3, boolean var4,
      int var5, int var6, int var7) {
    var2 -= this.anInt1309;
    var7 -= this.anInt1306;
    int var8 = 256;
    if (var1 != 20851) {
      GlobalStatics_7.aClass33_1305 = null;
    }

    if (var4) {
      var8 += 131072;
    }

    int var9;
    if (var5 == 1 || var5 == 3) {
      var9 = var3;
      var3 = var6;
      var6 = var9;
    }

    for (var9 = var2; var9 < var2 + var3; ++var9) {
      if (var9 >= 0 && var9 < this.anInt1300) {
        for (int var10 = var7; var10 < var6 + var7; ++var10) {
          if (var10 >= 0 && this.anInt1303 > var10) {
            this.method1501((byte) 32, var10, var9, var8);
          }
        }
      }
    }
  }

  public void method1503(int var1, int var2) {
    var2 -= this.anInt1306;
    var1 -= this.anInt1309;
    int value = this.anIntArrayArray1304[var1][var2];
    this.anIntArrayArray1304[var1][var2] = value | 262144;
  }

}
