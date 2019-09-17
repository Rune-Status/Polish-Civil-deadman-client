package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_8;

public final class FloorOverlay {

  public int anInt2090 = 128;
  public boolean aBoolean2092;
  public boolean aBoolean2093 = true;
  public int anInt2094 = 0x122b3d;
  public int anInt2095 = -1;
  public int anInt2098 = -1;
  public int anInt2100 = 8;
  public int anInt2101 = 16;
  public boolean aBoolean2102 = true;
  public int anInt2103;

  public void method2274(int var1, Buffer var2, int var3 ) {
    while (true) {
        int var4 = var2.readUnsignedByte();
        if (var4 == 0) {
          if (var1 != 24559) {
            GlobalStatics_8.method2276(-85);
          }

          return;
        }

        this.method2279(0, var4, var2, var3);
      }
  }

  private void method2279(int var1, int var2, Buffer var3, int var4) {
    if (var1 == 0) {
        if (var2 == 1) {
          this.anInt2103 = GlobalStatics_10
              .method869(116, var3.readUnsignedMedium((byte) 83));
        } else {
          if (var2 == 2) {
            this.anInt2095 = var3.readUnsignedByte();
          } else {
            if (var2 == 3) {
              this.anInt2095 = var3.readUnsignedShort();
              if (this.anInt2095 == '\uffff') {
                this.anInt2095 = -1;
              }
            } else {
              if (var2 == 5) {
                this.aBoolean2102 = false;
              } else {
                if (var2 == 7) {
                  this.anInt2098 = GlobalStatics_10
                      .method869(116, var3.readUnsignedMedium((byte) 82));
                } else {
                  if (var2 == 8) {
                    GlobalStatics_10.anInt3081 = var4;
                  } else {
                    if (var2 == 9) {
                      this.anInt2090 = var3.readUnsignedShort();
                    } else {
                      if (var2 == 10) {
                        this.aBoolean2093 = false;
                      } else {
                        if (var2 == 11) {
                          this.anInt2100 = var3.readUnsignedByte();
                        } else {
                          if (var2 == 12) {
                            this.aBoolean2092 = true;
                          } else {
                            if (var2 == 13) {
                              this.anInt2094 = var3
                                  .readUnsignedMedium((byte) 110);
                            } else {
                              if (var2 == 14) {
                                this.anInt2101 = var3.readUnsignedByte();
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }

      }
  }

}
