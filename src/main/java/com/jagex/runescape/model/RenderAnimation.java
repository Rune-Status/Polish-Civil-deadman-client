package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.statics.GlobalStatics_9;

public final class RenderAnimation {

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

  public void method899(int var1) {
    if (var1 <= 68) {
      GlobalStatics_9.method900(null, -23);
    }
  }

  public void method901(int var1, Buffer var2) {
    if (var1 != -1) {
      GlobalStatics_9.method900(null, -18);
    }

    while (true) {
      int var3 = var2.readUnsignedByte();
      if (var3 == 0) {
        return;
      }

      this.method902(var3, (byte) -106, var2);
    }
  }

  private void method902(int var1, byte var2, Buffer var3) {
    if (var1 == 1) {
      this.anInt368 = var3.readUnsignedShort();
      this.anInt382 = var3.readUnsignedShort();
      if (this.anInt382 == 65535) {
        this.anInt382 = -1;
      }

      if (this.anInt368 == 0xffff) {
        this.anInt368 = -1;
      }
    } else if (var1 == 2) {
      this.anInt398 = var3.readUnsignedShort();
    } else if (var1 != 3) {
      if (var1 == 4) {
        this.anInt406 = var3.readUnsignedShort();
      } else if (var1 != 5) {
        if (var1 == 6) {
          this.anInt393 = var3.readUnsignedShort();
        } else {
          if (var1 == 7) {
            this.anInt386 = var3.readUnsignedShort();
          } else if (var1 != 8) {
            if (var1 == 9) {
              this.anInt375 = var3.readUnsignedShort();
            } else {
              if (var1 == 26) {
                this.anInt395 = (short) (4 * var3.readUnsignedByte());
                this.anInt381 = (short) (4 * var3.readUnsignedByte());
              } else if (var1 != 27) {
                if (var1 == 29) {
                  this.anInt369 = var3.readUnsignedByte();
                } else {
                  if (var1 == 30) {
                    this.anInt357 = var3.readUnsignedShort();
                  } else {
                    if (var1 == 31) {
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
                          if (var1 == 37) {
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
                            } else if (var1 != 43) {
                              if (var1 == 44) {
                                var3.readUnsignedShort();
                              } else {
                                if (var1 == 45) {
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

}
