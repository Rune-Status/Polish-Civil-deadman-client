package com.jagex.runescape;

public final class SomethingVolume15 extends Node {

  public static int anInt2421 = -1;
  public static int anInt2426;
  public static boolean aBoolean2427;
  public static ObjectCache aClass93_2428 = new ObjectCache(50);
  public static SocketStream gameSocket;
  public static GameString COMMAND_TWEEN = GameString.create("::tween");
  public static boolean aBoolean2433;
  public static int anInt2436;
  public byte[] aByteArray2422;
  public int anInt2424;
  public byte[] aByteArray2425;
  public byte[] aByteArray2430;
  public SomethingMusic0[] aClass3_Sub12_Sub1Array2431;
  public short[] aShortArray2434;
  public SomethingIndex150[] aClass166Array2435;
  private int[] anIntArray2423;


  public SomethingVolume15() {
  }

  public SomethingVolume15(byte[] var1 ) {
    this.aShortArray2434 = new short[128];
      this.aByteArray2430 = new byte[128];
      this.aClass3_Sub12_Sub1Array2431 = new SomethingMusic0[128];
      this.aByteArray2422 = new byte[128];
      this.aClass166Array2435 = new SomethingIndex150[128];
      this.anIntArray2423 = new int[128];
      int var3 = 0;
      this.aByteArray2425 = new byte[128];

      Buffer var2;
      for (var2 = new Buffer(var1); (var2.bytes[var3 + var2.position] != 1 -1); ++var3) {
      }

      byte[] var4 = new byte[var3];

      int var5;
      for (var5 = 0; ~var5 > ~var3; ++var5) {
        var4[var5] = var2.readByte();
      }

      ++var2.position;
      ++var3;
      var5 = var2.position;
      var2.position += var3;

      int var6;
      for (var6 = 0; var2.bytes[var2.position + var6] != 0; ++var6) {
      }

      byte[] var7 = new byte[var6];

      int var8;
      for (var8 = 0; ~var8 > ~var6; ++var8) {
        var7[var8] = var2.readByte();
      }

      ++var2.position;
      ++var6;
      int var9 = 0;
      var8 = var2.position;

      for (var2.position += var6; (var2.bytes[var9 + var2.position] != 1 -1); ++var9) {
      }

      byte[] var10 = new byte[var9];

      for (int var11 = 0; ~var11 > ~var9; ++var11) {
        var10[var11] = var2.readByte();
      }

      ++var2.position;
      ++var9;
      byte[] var37 = new byte[var9];
      int var12;
      int var14;
      if (~var9 >= -2) {
        var12 = var9;
      } else {
        var12 = 2;
        var37[1] = 1;
        int var13 = 1;

        for (var14 = 2; var9 > var14; ++var14) {
          int var15 = var2.readUnsignedByte();
          if (var15 == 0) {
            var13 = var12++;
          } else {
            if (var15 <= var13) {
              --var15;
            }

            var13 = var15;
          }

          var37[var14] = (byte) var13;
        }
      }

      SomethingIndex150[] var38 = new SomethingIndex150[var12];

      SomethingIndex150 var41;
      for (var14 = 0; var14 < var38.length; ++var14) {
        var41 = var38[var14] = new SomethingIndex150();
        int var16 = var2.readUnsignedByte();
        if (var16 > 0) {
          var41.aByteArray2064 = new byte[2 * var16];
        }

        var16 = var2.readUnsignedByte();
        if ((var16 > 1 -1)) {
          var41.aByteArray2076 = new byte[var16 * 2 + 2];
          var41.aByteArray2076[1] = 64;
        }
      }

      var14 = var2.readUnsignedByte();
      byte[] var40 = (var14 > 1 -1) ? new byte[var14 * 2] : null;
      var14 = var2.readUnsignedByte();
      byte[] var39 = (var14 > 1 -1) ? new byte[var14 * 2] : null;

      int var17;
      for (var17 = 0; (var2.bytes[var17 + var2.position] != 1 -1); ++var17) {
      }

      byte[] var18 = new byte[var17];

      int var19;
      for (var19 = 0; var17 > var19; ++var19) {
        var18[var19] = var2.readByte();
      }

      ++var2.position;
      ++var17;
      var19 = 0;

      int var20;
      for (var20 = 0; ~var20 > -129; ++var20) {
        var19 += var2.readUnsignedByte();
        this.aShortArray2434[var20] = (short) var19;
      }

      var19 = 0;

      for (var20 = 0; ~var20 > -129; ++var20) {
        var19 += var2.readUnsignedByte();
        this.aShortArray2434[var20] = (short) (this.aShortArray2434[var20] + (var19 << 8));
      }

      var20 = 0;
      int var21 = 0;
      int var22 = 0;

      int var23;
      for (var23 = 0; ~var23 > -129; ++var23) {
        if (~var20 == -1) {
          if (var18.length > var21) {
            var20 = var18[var21++];
          } else {
            var20 = -1;
          }

          var22 = var2.method741((byte) 122);
        }

        this.aShortArray2434[var23] =
          (short) (this.aShortArray2434[var23] + ClientScript.bitAnd('\u8000', -1 + var22 << 14));
        this.anIntArray2423[var23] = var22;
        --var20;
      }

      var20 = 0;
      var23 = 0;
      var21 = 0;

      int var24;
      for (var24 = 0; ~var24 > -129; ++var24) {
        if ((this.anIntArray2423[var24] != 1 -1)) {
          if (var20 == 0) {
            var23 = var2.bytes[var5++] + -1;
            if (var4.length > var21) {
              var20 = var4[var21++];
            } else {
              var20 = -1;
            }
          }

          --var20;
          this.aByteArray2425[var24] = (byte) var23;
        }
      }

      var20 = 0;
      var21 = 0;
      var24 = 0;

      for (int var25 = 0; ~var25 > -129; ++var25) {
        if ((this.anIntArray2423[var25] != 1 -1)) {
          if (var20 == 0) {
            var24 = var2.bytes[var8++] - -16 << 2;
            if (~var21 > ~var7.length) {
              var20 = var7[var21++];
            } else {
              var20 = -1;
            }
          }

          --var20;
          this.aByteArray2422[var25] = (byte) var24;
        }
      }

      var21 = 0;
      var20 = 0;
      SomethingIndex150 var43 = null;

      int var26;
      for (var26 = 0; ~var26 > -129; ++var26) {
        if ((this.anIntArray2423[var26] != 1 -1)) {
          if (var20 == 0) {
            var43 = var38[var37[var21]];
            if (var21 >= var10.length) {
              var20 = -1;
            } else {
              var20 = var10[var21++];
            }
          }

          this.aClass166Array2435[var26] = var43;
          --var20;
        }
      }

      var20 = 0;
      var21 = 0;
      var26 = 0;

      int var27;
      for (var27 = 0; ~var27 > -129; ++var27) {
        if (~var20 == -1) {
          if (~var21 > ~var18.length) {
            var20 = var18[var21++];
          } else {
            var20 = -1;
          }

          if (this.anIntArray2423[var27] > 0) {
            var26 = var2.readUnsignedByte() + 1;
          }
        }

        --var20;
        this.aByteArray2430[var27] = (byte) var26;
      }

      this.anInt2424 = var2.readUnsignedByte() + 1;

      int var29;
      SomethingIndex150 var28;
      for (var27 = 0; var27 < var12; ++var27) {
        var28 = var38[var27];
        if (var28.aByteArray2064 != null) {
          for (var29 = 1; var29 < var28.aByteArray2064.length; var29 += 2) {
            var28.aByteArray2064[var29] = var2.readByte();
          }
        }

        if (var28.aByteArray2076 != null) {
          for (var29 = 3; var29 < var28.aByteArray2076.length + -2; var29 += 2) {
            var28.aByteArray2076[var29] = var2.readByte();
          }
        }
      }

      if (var40 != null) {
        for (var27 = 1; var40.length > var27; var27 += 2) {
          var40[var27] = var2.readByte();
        }
      }

      if (var39 != null) {
        for (var27 = 1; var39.length > var27; var27 += 2) {
          var39[var27] = var2.readByte();
        }
      }

      for (var27 = 0; var12 > var27; ++var27) {
        var28 = var38[var27];
        if (var28.aByteArray2076 != null) {
          var19 = 0;

          for (var29 = 2; ~var29 > ~var28.aByteArray2076.length; var29 += 2) {
            var19 -= -1 + -var2.readUnsignedByte();
            var28.aByteArray2076[var29] = (byte) var19;
          }
        }
      }

      for (var27 = 0; var12 > var27; ++var27) {
        var28 = var38[var27];
        if (var28.aByteArray2064 != null) {
          var19 = 0;

          for (var29 = 2; ~var29 > ~var28.aByteArray2064.length; var29 += 2) {
            var19 = var19 - -1 - -var2.readUnsignedByte();
            var28.aByteArray2064[var29] = (byte) var19;
          }
        }
      }

      byte var30;
      int var34;
      int var32;
      int var33;
      int var44;
      byte var48;
      if (var40 != null) {
        var19 = var2.readUnsignedByte();
        var40[0] = (byte) var19;

        for (var27 = 2; var40.length > var27; var27 += 2) {
          var19 = 1 + (var19 - -var2.readUnsignedByte());
          var40[var27] = (byte) var19;
        }

        var48 = var40[0];
        byte var46 = var40[1];

        for (var29 = 0; var48 > var29; ++var29) {
          this.aByteArray2430[var29] = (byte) (32 + var46 * this.aByteArray2430[var29] >> 6);
        }

        for (var29 = 2; var29 < var40.length; var48 = var30) {
          var30 = var40[var29];
          byte var31 = var40[1 + var29];
          var29 += 2;
          var32 = (var30 - var48) * var46 + (var30 - var48) / 2;

          for (var33 = var48; ~var33 > ~var30; ++var33) {
            var34 = TextureSampler14.method319(var32, -125, -var48 + var30);
            var32 += var31 + -var46;
            this.aByteArray2430[var33] = (byte) (var34 * this.aByteArray2430[var33] - -32 >> 6);
          }

          var46 = var31;
        }

        var41 = null;

        for (var44 = var48; ~var44 > -129; ++var44) {
          this.aByteArray2430[var44] = (byte) (32 + this.aByteArray2430[var44] * var46 >> 6);
        }
      }

      if (var39 != null) {
        var19 = var2.readUnsignedByte();
        var39[0] = (byte) var19;

        for (var27 = 2; var27 < var39.length; var27 += 2) {
          var19 = 1 + (var19 - -var2.readUnsignedByte());
          var39[var27] = (byte) var19;
        }

        var48 = var39[0];
        int var47 = var39[1] << 1;

        for (var29 = 0; var48 > var29; ++var29) {
          var44 = var47 + (255 & this.aByteArray2422[var29]);
          if (var44 < 0) {
            var44 = 0;
          }

          if (var44 > 128) {
            var44 = 128;
          }

          this.aByteArray2422[var29] = (byte) var44;
        }

        int var45;
        for (var29 = 2; ~var29 > ~var39.length; var47 = var45) {
          var30 = var39[var29];
          var32 = (-var48 + var30) * var47 - -((var30 - var48) / 2);
          var45 = var39[1 + var29] << 1;
          var29 += 2;

          for (var33 = var48; var30 > var33; ++var33) {
            var34 = TextureSampler14.method319(var32, -116, -var48 + var30);
            var32 += -var47 + var45;
            int var35 = var34 + (this.aByteArray2422[var33] & 255);
            if (var35 < 0) {
              var35 = 0;
            }

            if ((var35 > 129 -1)) {
              var35 = 128;
            }

            this.aByteArray2422[var33] = (byte) var35;
          }

          var48 = var30;
        }

        for (var44 = var48; var44 < 128; ++var44) {
          var45 = (255 & this.aByteArray2422[var44]) + var47;
          if (~var45 > -1) {
            var45 = 0;
          }

          if (var45 > 128) {
            var45 = 128;
          }

          this.aByteArray2422[var44] = (byte) var45;
        }

        Object var42 = null;
      }

      for (var27 = 0; var12 > var27; ++var27) {
        var38[var27].anInt2078 = var2.readUnsignedByte();
      }

      for (var27 = 0; var27 < var12; ++var27) {
        var28 = var38[var27];
        if (var28.aByteArray2064 != null) {
          var28.anInt2067 = var2.readUnsignedByte();
        }

        if (var28.aByteArray2076 != null) {
          var28.anInt2071 = var2.readUnsignedByte();
        }

        if ((var28.anInt2078 > 1 -1)) {
          var28.anInt2063 = var2.readUnsignedByte();
        }
      }

      for (var27 = 0; ~var27 > ~var12; ++var27) {
        var38[var27].anInt2077 = var2.readUnsignedByte();
      }

      for (var27 = 0; ~var27 > ~var12; ++var27) {
        var28 = var38[var27];
        if (var28.anInt2077 > 0) {
          var28.anInt2066 = var2.readUnsignedByte();
        }
      }

      for (var27 = 0; var27 < var12; ++var27) {
        var28 = var38[var27];
        if ((var28.anInt2066 > 1 -1)) {
          var28.anInt2069 = var2.readUnsignedByte();
        }
      }
  }

  public void method369(byte var1 ) {
    int var2 = 127 % ((-70 - var1) / 42);
      this.anIntArray2423 = null;
  }

  public boolean method373(int var1, int[] var2, MidiSomething var3,
      byte[] var4 ) {
    if (var1 == 17904) {
        int var6 = 0;
        SomethingMusic0 var7 = null;
        boolean var5 = true;

        for (int var8 = 0; ~var8 > -129; ++var8) {
          if (var4 == null || var4[var8] != 0) {
            int var9 = this.anIntArray2423[var8];
            if ((var9 != 1 -1)) {
              if (var6 != var9) {
                var6 = var9--;
                if ((var9 & 1) == 0) {
                  var7 = var3.method1413(var9 >> 2, 33, var2);
                } else {
                  var7 = var3.method1416(10089, var9 >> 2, var2);
                }

                if (var7 == null) {
                  var5 = false;
                }
              }

              if (var7 != null) {
                this.aClass3_Sub12_Sub1Array2431[var8] = var7;
                this.anIntArray2423[var8] = 0;
              }
            }
          }
        }

        return var5;
      } else {
        return false;
      }
  }

  public static void method370(byte var0) {
    int var1 = -125 / ((0 - var0) / 59);
      DummyClass14.aClass93_1955.method1524(3);
  }

  public static SomethingWorldMapy method371(int var0, GameString var1) {
    if (var0 != 2) {
        SomethingVolume15.method372(false);
      }

      for (SomethingWorldMapy var2 = (SomethingWorldMapy) DummyClass21.aClass61_1758.getFirst();
           var2 != null; var2 = (SomethingWorldMapy) DummyClass21.aClass61_1758.getNext()) {
        if (var2.aClass94_3561.method1528((byte) -42, var1)) {
          return var2;
        }
      }

      return null;
  }

  public static void method372(boolean var0) {
    SomethingVolume15.COMMAND_TWEEN = null;
      if (var0) {
        SomethingVolume15.aClass93_2428 = null;
        SomethingVolume15.gameSocket = null;
      }
  }

  public static void method374(int var0, boolean var1, byte[] var2, int var3, int var4,
                              CollisionMap[] var5) {
    Buffer var6 = new Buffer(var2);
      int var7 = -1;

      while (true) {
        int var8 = var6.method773((byte) -126);
        if (var8 == 0) {
          if (var4 != 0) {
            SomethingVolume15.method372(true);
          }

          return;
        }

        var7 += var8;
        int var9 = 0;

        while (true) {
          int var10 = var6.readUnsignedShortSmart();
          if (~var10 == -1) {
            break;
          }

          var9 += var10 - 1;
          int var11 = var9 & 63;
          int var13 = var9 >> 12;
          int var12 = var9 >> 6 & 63;
          int var14 = var6.readUnsignedByte();
          int var15 = var14 >> 2;
          int var16 = var14 & 3;
          int var17 = var0 + var12;
          int var18 = var11 + var3;
          if (var17 > 0 && var18 > 0 && var17 < 103 && ~var18 > -104) {
            CollisionMap var19 = null;
            if (!var1) {
              int var20 = var13;
              if (~(2 & BZipDecompressorState.tileFlags[1][var17][var18]) == -3) {
                var20 = var13 - 1;
              }

              if (var20 >= 0) {
                var19 = var5[var20];
              }
            }

            DummyClass31.method1683(var13, !var1, var13, var1, var19, var7, var15, var17, (byte) 50,
              var18, var16);
          }
        }
      }
  }

}
