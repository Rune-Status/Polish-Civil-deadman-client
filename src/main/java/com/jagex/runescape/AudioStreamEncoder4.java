package com.jagex.runescape;

import com.jagex.runescape.opengl.GlTexture2d;

public final class AudioStreamEncoder4 extends AudioStreamEncoder {

  public static GameString aClass94_3496 = GameString.create("Spielwelt erstellt)3");
  public static boolean[] aBooleanArray3503;
  public static int anInt3507;
  public static int anInt3517;
  public int[] anIntArray3509 = new int[16];
  public int[] anIntArray3518 = new int[16];
  public int[] anIntArray3519 = new int[16];
  private int[] anIntArray3497 = new int[16];
  private int[] anIntArray3498 = new int[16];
  private final int[] anIntArray3499 = new int[16];
  private final int[] anIntArray3500 = new int[16];
  private int[] anIntArray3501 = new int[16];
  private final int[] anIntArray3502 = new int[16];
  private final int[] anIntArray3504 = new int[16];
  private final SomethingMidiFile0 aClass78_3505 = new SomethingMidiFile0();
  private final int[] anIntArray3506 = new int[16];
  private final HashTable aClass130_3508;
  private final int[] anIntArray3510 = new int[16];
  private final int anInt3511 = 1000000;
  private final AudioSomethingSomething[][] aClass3_Sub22ArrayArray3512 =
    new AudioSomethingSomething[16][128];
  private final AudioSomethingSomething[][] aClass3_Sub22ArrayArray3513 =
    new AudioSomethingSomething[16][128];
  private int[] anIntArray3514 = new int[16];
  private final int[] anIntArray3515 = new int[16];
  private final int[] anIntArray3516 = new int[16];
  private int[] anIntArray3520 = new int[16];
  private int anInt3521 = 256;
  private boolean aBoolean3522;
  private long aLong3523;
  private int anInt3524;
  private int anInt3525;
  private long aLong3526;
  private AudioStreamEncoder3 aClass3_Sub24_Sub3_3527 = new AudioStreamEncoder3(this);
  private MidiFile aClass3_Sub27_3528;
  private int anInt3529;
  private boolean aBoolean3530;


  public AudioStreamEncoder4() {
    this.aClass130_3508 = new HashTable(128);
      this.method483(-1, -48, 256);
      this.method500(true, (byte) -40);
  }

  public synchronized boolean method470(MidiFile var1, int var2,
      FileUnpacker var3,
      MidiSomething var4,
      int var5 ) {
    var1.method516();
      boolean var6 = true;
      int[] var7 = null;
      if (var5 > 0) {
        var7 = new int[] {var5};
      }

      for (SomethingMidiFile var9 = (SomethingMidiFile) var1.aClass130_2564.getFirst(20);
           var9 != null; var9 = (SomethingMidiFile) var1.aClass130_2564.getNext(-107)) {
        int var10 = (int) var9.key;
        SomethingVolume15 var11 = (SomethingVolume15) this.aClass130_3508.get(
            var10);
        if (var11 == null) {
          var11 = OndemandRequester.method1245(117, var3, var10);
          if (var11 == null) {
            var6 = false;
            continue;
          }

          this.aClass130_3508.put(var10, var11);
        }

        if (!var11.method373(17904, var7, var4, var9.aByteArray2289)) {
          var6 = false;
        }
      }

      if (var6) {
        var1.method515();
      }

      return var6;
  }

  public synchronized void method471(byte var1 ) {
    if (var1 == 53) {
        for (SomethingVolume15 var2 = (SomethingVolume15) this.aClass130_3508.getFirst(75);
             var2 != null; var2 = (SomethingVolume15) this.aClass130_3508.getNext(-117)) {
          var2.method369((byte) -124);
        }

      }
  }

  private void method472(int var1, int var2, int var3) {
    this.anIntArray3501[var2] = var1;
      this.anIntArray3506[var2] = ClientScript.bitAnd(var1, -128);
      this.method484(0, var1, var2);
  }

  public synchronized boolean method473(int var1 ) {
    if (var1 >= -121) {
        this.anIntArray3509 = null;
      }

      return this.aClass78_3505.method1373();
  }

  private synchronized void method475(boolean var1, MidiFile var2, boolean var3, byte var4) {
    this.method507(var3, (byte) -68);
      this.aClass78_3505.method1380(var2.aByteArray2565);
      this.aBoolean3522 = var1;
      this.aLong3526 = 0L;
      int var5 = this.aClass78_3505.method1374();

      for (int var6 = 0; var6 < var5; ++var6) {
        this.aClass78_3505.method1376(var6);
        this.aClass78_3505.method1377(var6);
        this.aClass78_3505.method1381(var6);
      }

      if (var4 != -52) {
        this.anIntArray3509 = null;
      }

      this.anInt3525 = this.aClass78_3505.method1382();
      this.anInt3524 = this.aClass78_3505.anIntArray1114[this.anInt3525];
      this.aLong3523 = this.aClass78_3505.method1370(this.anInt3524);
  }

  private void method476(int var1, int var2, int var3) {
    this.anIntArray3499[var1] = var2;
      if (var3 != 0) {
        this.method478(109, true, 108);
      }
  }

  public synchronized int method409() {
    return 0;
  }

  public synchronized AudioStreamEncoder method411() {
    return this.aClass3_Sub24_Sub3_3527;
  }

  public synchronized void method413(int[] var1,int var2,int var3 ) {
    if (this.aClass78_3505.method1373()) {
        int var4 = this.aClass78_3505.anInt1116 * this.anInt3511 / DummyClass60.sampleRate;

        while (true) {
          long var5 = this.aLong3526 - -((long) var3 * var4);
          if (~(this.aLong3523 + -var5) > -1L) {
            int var7 = (int) ((-1L + this.aLong3523 - this.aLong3526 + var4) / var4);
            this.aLong3526 += (long) var4 * var7;
            this.aClass3_Sub24_Sub3_3527.method413(var1, var2, var7);
            var3 -= var7;
            var2 += var7;
            this.method494(100);
            if (this.aClass78_3505.method1373()) {
              continue;
            }
            break;
          }

          this.aLong3526 = var5;
          break;
        }
      }

      this.aClass3_Sub24_Sub3_3527.method413(var1, var2, var3);
  }

  public synchronized AudioStreamEncoder method414() {
    return null;
  }

  public synchronized void method415(int var1 ) {
    if (this.aClass78_3505.method1373()) {
        int var2 = this.aClass78_3505.anInt1116 * this.anInt3511 / DummyClass60.sampleRate;

        while (true) {
          long var3 = this.aLong3526 - -((long) var1 * var2);
          if (~(this.aLong3523 + -var3) > -1L) {
            int var5 =
              (int) ((var2 + (-this.aLong3526 + this.aLong3523 - 1L)) / var2);
            var1 -= var5;
            this.aLong3526 += (long) var5 * var2;
            this.aClass3_Sub24_Sub3_3527.method415(var5);
            this.method494(64);
            if (this.aClass78_3505.method1373()) {
              continue;
            }
            break;
          }

          this.aLong3526 = var3;
          break;
        }
      }

      this.aClass3_Sub24_Sub3_3527.method415(var1);
  }

  private void method478(int var1, boolean var2, int var3) {
    if (var2) {
        this.aLong3526 = 101L;
      }
  }

  public synchronized void method479(byte var1, int var2, int var3 ) {
    this.method472(var3, var2, 85);
      if (var1 != 98) {
        AudioStreamEncoder4.aBooleanArray3503 = null;
      }
  }

  private void method480(int var1, int var2) {
    if (var2 >= 0) {
        this.anIntArray3497[var2] = 12800;
        this.anIntArray3498[var2] = 8192;
        this.anIntArray3514[var2] = 16383;
        this.anIntArray3499[var2] = 8192;
        this.anIntArray3502[var2] = 0;
        this.anIntArray3510[var2] = 8192;
        this.method502(var2, var1 ^ -8388490);
        this.method497(var2, -128);
        this.anIntArray3518[var2] = 0;
        if (var1 == 8388489) {
          this.anIntArray3500[var2] = 32767;
          this.anIntArray3504[var2] = 256;
          this.anIntArray3519[var2] = 0;
          this.method482((byte) -125, var2, 8192);
        }
      } else {
        for (var2 = 0; var2 < 16; ++var2) {
          this.method480(8388489, var2);
        }

      }
  }

  private void method481(byte var1, int var2) {
    for (AudioSomethingSomething var4 =
           (AudioSomethingSomething) this.aClass3_Sub24_Sub3_3527.aClass61_3489.getFirst();
        var4 != null;
           var4 = (AudioSomethingSomething) this.aClass3_Sub24_Sub3_3527.aClass61_3489.getNext()) {
        if (~var2 > -1 || var4.anInt2514 == var2) {
          if (var4.aClass3_Sub24_Sub1_2507 != null) {
            var4.aClass3_Sub24_Sub1_2507.method417(DummyClass60.sampleRate / 100);
            if (var4.aClass3_Sub24_Sub1_2507.method445()) {
              this.aClass3_Sub24_Sub3_3527.aClass3_Sub24_Sub2_3495.method457(
                var4.aClass3_Sub24_Sub1_2507);
            }

            var4.method401(221);
          }

          if (var4.anInt2506 < 0) {
            this.aClass3_Sub22ArrayArray3512[var4.anInt2514][var4.anInt2520] = null;
          }

          var4.unlinkNode();
        }
      }
  }

  private void method482(byte var1, int var2, int var3) {
    this.anIntArray3520[var2] = var3;
      this.anIntArray3509[var2] =
        (int) (0.5D + 2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * var3));
      if (var1 > -53) {
        this.method505((byte) 114);
      }
  }

  private synchronized void method483(int var1, int var2, int var3) {
    if (var1 < 0) {
        for (int var4 = 0; var4 < 16; ++var4) {
          this.anIntArray3516[var4] = var3;
        }
      } else {
        this.anIntArray3516[var1] = var3;
      }

      if (var2 > -14) {
        this.anIntArray3514 = null;
      }
  }

  private void method484(int var1, int var2, int var3) {
    if (var1 == 0) {
        if (this.anIntArray3515[var3] != var2) {
          this.anIntArray3515[var3] = var2;

          for (int var4 = 0; ~var4 > -129; ++var4) {
            this.aClass3_Sub22ArrayArray3513[var3][var4] = null;
          }
        }

      }
  }

  public synchronized void method485(int var1 ) {
    for (SomethingVolume15 var2 = (SomethingVolume15) this.aClass130_3508.getFirst(63);
           var2 != null; var2 = (SomethingVolume15) this.aClass130_3508.getNext(-106)) {
        var2.unlinkNode();
      }
  }

  private void method486(int var1, int var2, int var3, int var4) {
    this.method493((byte) -123, var4, 64, var2);
      if (((2 & this.anIntArray3518[var2]) != 1 -1)) {
        for (AudioSomethingSomething var5 =
             (AudioSomethingSomething) this.aClass3_Sub24_Sub3_3527.aClass61_3489.method1212(2);
             var5 != null; var5 =
               (AudioSomethingSomething) this.aClass3_Sub24_Sub3_3527.aClass61_3489.method1219(
                 98)) {
          if (~var2 == ~var5.anInt2514 && ~var5.anInt2506 > -1) {
            this.aClass3_Sub22ArrayArray3512[var2][var5.anInt2520] = null;
            this.aClass3_Sub22ArrayArray3512[var2][var4] = var5;
            int var6 = var5.anInt2510 - -(var5.anInt2502 * var5.anInt2522 >> 12);
            var5.anInt2502 = 4096;
            var5.anInt2510 += -var5.anInt2520 + var4 << 8;
            var5.anInt2522 = -var5.anInt2510 + var6;
            var5.anInt2520 = var4;
            return;
          }
        }
      }

      SomethingVolume15 var11 =
        (SomethingVolume15) this.aClass130_3508.get(this.anIntArray3515[var2]);
      if (var11 != null) {
        SomethingMusic0 var12 = var11.aClass3_Sub12_Sub1Array2431[var4];
        if (var12 != null) {
          AudioSomethingSomething var7 = new AudioSomethingSomething();
          var7.aClass3_Sub12_Sub1_2509 = var12;
          var7.aClass3_Sub15_2527 = var11;
          var7.anInt2514 = var2;
          var7.aClass166_2504 = var11.aClass166Array2435[var4];
          var7.anInt2517 = var11.aByteArray2425[var4];
          var7.anInt2520 = var4;
          var7.anInt2513 = var11.aByteArray2430[var4] * var1 * var1 * var11.anInt2424 - -1024 >> 11;
          var7.anInt2503 = var11.aByteArray2422[var4] & 255;
          var7.anInt2510 = -(32767 & var11.aShortArray2434[var4]) + (var4 << 8);
          var7.anInt2506 = -1;
          var7.anInt2511 = 0;
          var7.anInt2519 = 0;
          var7.anInt2523 = 0;
          var7.anInt2501 = 0;
          if (this.anIntArray3519[var2] == 0) {
            var7.aClass3_Sub24_Sub1_2507 =
              AudioStreamEncoder1.method432(var12,
                  this.method498((byte) 85, var7),
                  this.method508((byte) 36, var7), this.method496(0, var7));
          } else {
            var7.aClass3_Sub24_Sub1_2507 =
              AudioStreamEncoder1.method432(var12,
                  this.method498((byte) 85, var7), 0,
                  this.method496(0, var7));
            this.method501(var7, var11.aShortArray2434[var4] < 0, (byte) -114);
          }

          if (var11.aShortArray2434[var4] < 0) {
            var7.aClass3_Sub24_Sub1_2507.method429(-1);
          }

          if (var7.anInt2517 >= 0) {
            AudioSomethingSomething var9 = this.aClass3_Sub22ArrayArray3513[var2][var7.anInt2517];
            if (var9 != null && var9.anInt2506 < 0) {
              this.aClass3_Sub22ArrayArray3512[var2][var9.anInt2520] = null;
              var9.anInt2506 = 0;
            }

            this.aClass3_Sub22ArrayArray3513[var2][var7.anInt2517] = var7;
          }

          this.aClass3_Sub24_Sub3_3527.aClass61_3489.addLast(var7);
          this.aClass3_Sub22ArrayArray3512[var2][var4] = var7;
        }
      }
  }

  private void method488(byte var1, int var2) {
    int var3 = 240 & var2;
      if (var1 == 56) {
        int var4;
        int var5;
        int var6;
        if (var3 == 128) {
          var4 = 15 & var2;
          var6 = (8353073 & var2) >> 16;
          var5 = (32634 & var2) >> 8;
          this.method493((byte) -95, var5, var6, var4);
        } else if (var3 == 144) {
          var5 = 127 & var2 >> 8;
          var4 = var2 & 15;
          var6 = 127 & var2 >> 16;
          if ((var6 > 1 -1)) {
            this.method486(var6, var4, 71, var5);
          } else {
            this.method493((byte) -122, var5, 64, var4);
          }

        } else if (var3 == 160) {
          var4 = var2 & 15;
          var5 = 127 & var2 >> 8;
          var6 = 127 & var2 >> 16;
          this.method495(var6, var5, var1 ^ 17363, var4);
        } else if ((var3 != 177 -1)) {
          if (var3 == 192) {
            var5 = var2 >> 8 & 127;
            var4 = 15 & var2;
            this.method484(0, this.anIntArray3506[var4] - -var5, var4);
          } else if (var3 == 208) {
            var4 = 15 & var2;
            var5 = (var2 & 32549) >> 8;
            this.method478(var4, false, var5);
          } else if ((var3 == 225 -1)) {
            var4 = 15 & var2;
            var5 = (var2 >> 9 & 16256) + ((32702 & var2) >> 8);
            this.method476(var4, var5, 0);
          } else {
            var3 = var2 & 255;
            if (var3 == 255) {
              this.method500(true, (byte) -40);
            }
          }
        } else {
          var5 = (32630 & var2) >> 8;
          var4 = var2 & 15;
          var6 = (8388489 & var2) >> 16;
          if ((var5 == 1 -1)) {
            this.anIntArray3506[var4] =
              (var6 << 14) + ClientScript.bitAnd(-2080769, this.anIntArray3506[var4]);
          }

          if ((var5 == 33 -1)) {
            this.anIntArray3506[var4] =
              ClientScript.bitAnd(-16257, this.anIntArray3506[var4]) + (var6 << 7);
          }

          if ((var5 == 2 -1)) {
            this.anIntArray3502[var4] =
              (var6 << 7) + ClientScript.bitAnd(this.anIntArray3502[var4], -16257);
          }

          if (var5 == 33) {
            this.anIntArray3502[var4] =
              ClientScript.bitAnd(-128, this.anIntArray3502[var4]) - -var6;
          }

          if ((var5 == 6 -1)) {
            this.anIntArray3510[var4] =
              ClientScript.bitAnd(this.anIntArray3510[var4], -16257) + (var6 << 7);
          }

          if (var5 == 37) {
            this.anIntArray3510[var4] = var6 + ClientScript.bitAnd(
                this.anIntArray3510[var4], -128);
          }

          if ((var5 == 8 -1)) {
            this.anIntArray3497[var4] =
              (var6 << 7) + ClientScript.bitAnd(this.anIntArray3497[var4], -16257);
          }

          if ((var5 == 40 -1)) {
            this.anIntArray3497[var4] = ClientScript.bitAnd(this.anIntArray3497[var4], -128) + var6;
          }

          if ((var5 == 11 -1)) {
            this.anIntArray3498[var4] =
              ClientScript.bitAnd(-16257, this.anIntArray3498[var4]) - -(var6 << 7);
          }

          if ((var5 == 43 -1)) {
            this.anIntArray3498[var4] = var6 + ClientScript.bitAnd(-128,
                this.anIntArray3498[var4]);
          }

          if (var5 == 11) {
            this.anIntArray3514[var4] =
              ClientScript.bitAnd(this.anIntArray3514[var4], -16257) + (var6 << 7);
          }

          if ((var5 == 44 -1)) {
            this.anIntArray3514[var4] = var6 + ClientScript.bitAnd(-128,
                this.anIntArray3514[var4]);
          }

          if ((var5 == 65 -1)) {
            if (var6 >= 64) {
              this.anIntArray3518[var4] = TextureSampler3.method308(
                  this.anIntArray3518[var4], 1);
            } else {
              this.anIntArray3518[var4] = ClientScript.bitAnd(
                  this.anIntArray3518[var4], -2);
            }
          }

          if (var5 == 65) {
            if (~var6 > -65) {
              this.method502(var4, var1 ^ -57);
              this.anIntArray3518[var4] = ClientScript.bitAnd(
                  this.anIntArray3518[var4], -3);
            } else {
              this.anIntArray3518[var4] = TextureSampler3.method308(
                  this.anIntArray3518[var4], 2);
            }
          }

          if (var5 == 99) {
            this.anIntArray3500[var4] =
              (var6 << 7) + ClientScript.bitAnd(this.anIntArray3500[var4], 127);
          }

          if (var5 == 98) {
            this.anIntArray3500[var4] =
              ClientScript.bitAnd(this.anIntArray3500[var4], 16256) - -var6;
          }

          if ((var5 == 102 -1)) {
            this.anIntArray3500[var4] =
              (var6 << 7) + ClientScript.bitAnd(127, this.anIntArray3500[var4]) + 16384;
          }

          if ((var5 == 101 -1)) {
            this.anIntArray3500[var4] =
              var6 + ClientScript.bitAnd(16256, this.anIntArray3500[var4]) + 16384;
          }

          if ((var5 == 121 -1)) {
            this.method481((byte) -50, var4);
          }

          if (var5 == 121) {
            this.method480(8388489, var4);
          }

          if (var5 == 123) {
            this.method489(-32323, var4);
          }

          int var7;
          if (var5 == 6) {
            var7 = this.anIntArray3500[var4];
            if ((var7 == 16385 -1)) {
              this.anIntArray3504[var4] =
                ClientScript.bitAnd(this.anIntArray3504[var4], -16257) + (var6 << 7);
            }
          }

          if ((var5 == 39 -1)) {
            var7 = this.anIntArray3500[var4];
            if ((var7 == 16385 -1)) {
              this.anIntArray3504[var4] =
                ClientScript.bitAnd(this.anIntArray3504[var4], -128) + var6;
            }
          }

          if ((var5 == 17 -1)) {
            this.anIntArray3519[var4] =
              ClientScript.bitAnd(this.anIntArray3519[var4], -16257) - -(var6 << 7);
          }

          if ((var5 == 49 -1)) {
            this.anIntArray3519[var4] =
              ClientScript.bitAnd(this.anIntArray3519[var4], -128) - -var6;
          }

          if (var5 == 81) {
            if ((var6 >= 65 -1)) {
              this.anIntArray3518[var4] = TextureSampler3.method308(
                  this.anIntArray3518[var4], 4);
            } else {
              this.method497(var4, -102);
              this.anIntArray3518[var4] = ClientScript.bitAnd(
                  this.anIntArray3518[var4], -5);
            }
          }

          if ((var5 == 18 -1)) {
            this.method482((byte) -117, var4,
              (var6 << 7) + (this.anIntArray3520[var4] & -16257));
          }

          if (var5 == 49) {
            this.method482((byte) -61, var4, (this.anIntArray3520[var4] & -128) + var6);
          }

        }
      }
  }

  private void method489(int var1, int var2) {
    for (AudioSomethingSomething var3 =
           (AudioSomethingSomething) this.aClass3_Sub24_Sub3_3527.aClass61_3489.getFirst();
           var3 != null;
           var3 = (AudioSomethingSomething) this.aClass3_Sub24_Sub3_3527.aClass61_3489.getNext()) {
        if ((~var2 > -1 || ~var2 == ~var3.anInt2514) && var3.anInt2506 < 0) {
          this.aClass3_Sub22ArrayArray3512[var3.anInt2514][var3.anInt2520] = null;
          var3.anInt2506 = 0;
        }
      }

      if (var1 != -32323) {
        this.anInt3525 = -99;
      }
  }

  public synchronized void method490(boolean var1, MidiFile var2, int var3 ) {
    this.method475(var1, var2, true, (byte) -52);
      if (var3 != 17774) {
        this.method413(null, -32, -26);
      }
  }

  public boolean method492(int var1, int var2,
      AudioSomethingSomething var3,
      byte var4,
      int[] var5 ) {
    var3.anInt2512 = DummyClass60.sampleRate / 100;
      if (var3.anInt2506 >= 0 && (var3.aClass3_Sub24_Sub1_2507 == null
        || var3.aClass3_Sub24_Sub1_2507.method444())) {
        var3.method401(221);
        var3.unlinkNode();
        if (var3.anInt2517 > 0
          && var3 == this.aClass3_Sub22ArrayArray3513[var3.anInt2514][var3.anInt2517]) {
          this.aClass3_Sub22ArrayArray3513[var3.anInt2514][var3.anInt2517] = null;
        }

        return true;
      } else {
        int var6 = var3.anInt2502;
        if (var4 != 14) {
          this.anIntArray3497 = null;
        }

        if (var6 > 0) {
          var6 -= (int) (0.5D
            + Math.pow(2.0D, this.anIntArray3510[var3.anInt2514] * 4.921259842519685E-4D)
            * 16.0D);
          if (~var6 > -1) {
            var6 = 0;
          }

          var3.anInt2502 = var6;
        }

        var3.aClass3_Sub24_Sub1_2507.method443(this.method498((byte) 85, var3));
        SomethingIndex150 var7 = var3.aClass166_2504;
        var3.anInt2508 += var7.anInt2077;
        ++var3.anInt2515;
        double var9 =
          ((var3.anInt2520 - 60 << 8) + (var3.anInt2502 * var3.anInt2522
            >> 12)) * 5.086263020833333E-6D;
        boolean var8 = false;
        if ((var7.anInt2078 > 1 -1)) {
          if ((var7.anInt2063 > 1 -1)) {
            var3.anInt2523 +=
              (int) (Math.pow(2.0D, var9 * var7.anInt2063) * 128.0D + 0.5D);
          } else {
            var3.anInt2523 += 128;
          }

          if (((var3.anInt2523 * var7.anInt2078) >= 819201 -1)) {
            var8 = true;
          }
        }

        if (var7.aByteArray2064 != null) {
          if (var7.anInt2067 <= 0) {
            var3.anInt2511 += 128;
          } else {
            var3.anInt2511 +=
              (int) (0.5D + Math.pow(2.0D, var7.anInt2067 * var9) * 128.0D);
          }

          while (~var3.anInt2501 > ~(var7.aByteArray2064.length - 2) && var3.anInt2511 > ('\uff00'
            & var7.aByteArray2064[var3.anInt2501 - -2] << 8)) {
            var3.anInt2501 += 2;
          }

          if (~(-2 + var7.aByteArray2064.length) == ~var3.anInt2501
            && var7.aByteArray2064[1 + var3.anInt2501] == 0) {
            var8 = true;
          }
        }

        if ((var3.anInt2506 >= 1 -1) && var7.aByteArray2076 != null && ((1
            & this.anIntArray3518[var3.anInt2514]) == 1 -1) && (var3.anInt2517 < 0
          || this.aClass3_Sub22ArrayArray3513[var3.anInt2514][var3.anInt2517] != var3)) {
          if ((var7.anInt2071 > 1 -1)) {
            var3.anInt2506 +=
              (int) (Math.pow(2.0D, var7.anInt2071 * var9) * 128.0D + 0.5D);
          } else {
            var3.anInt2506 += 128;
          }

          while ((-2 + var7.aByteArray2076.length) > var3.anInt2519
            && ~((255 & var7.aByteArray2076[2 + var3.anInt2519]) << 8)
            > ~var3.anInt2506) {
            var3.anInt2519 += 2;
          }

          if (~var3.anInt2519 == ~(-2 + var7.aByteArray2076.length)) {
            var8 = true;
          }
        }

        if (var8) {
          var3.aClass3_Sub24_Sub1_2507.method417(var3.anInt2512);
          if (var5 != null) {
            var3.aClass3_Sub24_Sub1_2507.method413(var5, var2, var1);
          } else {
            var3.aClass3_Sub24_Sub1_2507.method415(var1);
          }

          if (var3.aClass3_Sub24_Sub1_2507.method445()) {
            this.aClass3_Sub24_Sub3_3527.aClass3_Sub24_Sub2_3495.method457(
              var3.aClass3_Sub24_Sub1_2507);
          }

          var3.method401(221);
          if (var3.anInt2506 >= 0) {
            var3.unlinkNode();
            if ((var3.anInt2517 > 1 -1)
              && this.aClass3_Sub22ArrayArray3513[var3.anInt2514][var3.anInt2517] == var3) {
              this.aClass3_Sub22ArrayArray3513[var3.anInt2514][var3.anInt2517] = null;
            }
          }

          return true;
        } else {
          var3.aClass3_Sub24_Sub1_2507.method450(var3.anInt2512,
              this.method508((byte) 36, var3),
              this.method496(0, var3));
          return false;
        }
      }
  }

  private void method493(byte var1, int var2, int var3, int var4) {
    AudioSomethingSomething var5 = this.aClass3_Sub22ArrayArray3512[var4][var2];
      if (var5 != null) {
        if (var1 > -92) {
          this.aClass3_Sub24_Sub3_3527 = null;
        }

        this.aClass3_Sub22ArrayArray3512[var4][var2] = null;
        if ((2 & this.anIntArray3518[var4]) == 0) {
          var5.anInt2506 = 0;
        } else {
          assert this.aClass3_Sub24_Sub3_3527 != null;
          for (AudioSomethingSomething var6 =
              (AudioSomethingSomething) this.aClass3_Sub24_Sub3_3527.aClass61_3489
                  .getFirst();
              var6 != null; var6 =
              (AudioSomethingSomething) this.aClass3_Sub24_Sub3_3527.aClass61_3489
                  .getNext()) {
            if (~var6.anInt2514 == ~var5.anInt2514 && ~var6.anInt2506 > -1
                && var6 != var5) {
              var5.anInt2506 = 0;
              break;
            }
          }
        }

      }
  }

  private void method494(int var1) {
    int var2 = this.anInt3525;
      int var3 = this.anInt3524;
      if (var1 <= 54) {
        this.method505((byte) 124);
      }

      long var4 = this.aLong3523;
      if (this.aClass3_Sub27_3528 != null && ~var3 == ~this.anInt3529) {
        this.method475(this.aBoolean3522, this.aClass3_Sub27_3528, this.aBoolean3530, (byte) -52);
        this.method494(71);
      } else {
        while (this.anInt3524 == var3) {
          while (var3 == this.aClass78_3505.anIntArray1114[var2]) {
            this.aClass78_3505.method1376(var2);
            int var6 = this.aClass78_3505.method1375(var2);
            if (var6 == 1) {
              this.aClass78_3505.method1384();
              this.aClass78_3505.method1381(var2);
              if (this.aClass78_3505.method1371()) {
                if (this.aClass3_Sub27_3528 != null) {
                  this.method490(this.aBoolean3522, this.aClass3_Sub27_3528, 17774);
                  this.method494(126);
                  return;
                }

                if (!this.aBoolean3522 || var3 == 0) {
                  this.method500(true, (byte) -40);
                  this.aClass78_3505.method1383();
                  return;
                }

                this.aClass78_3505.method1372(var4);
              }
              break;
            }

            if (((var6 & 128) != 1 -1)) {
              this.method488((byte) 56, var6);
            }

            this.aClass78_3505.method1377(var2);
            this.aClass78_3505.method1381(var2);
          }

          var2 = this.aClass78_3505.method1382();
          var3 = this.aClass78_3505.anIntArray1114[var2];
          var4 = this.aClass78_3505.method1370(var3);
        }

        this.anInt3525 = var2;
        this.aLong3523 = var4;
        this.anInt3524 = var3;
        if (this.aClass3_Sub27_3528 != null && var3 > this.anInt3529) {
          this.anInt3525 = -1;
          this.anInt3524 = this.anInt3529;
          this.aLong3523 = this.aClass78_3505.method1370(this.anInt3524);
        }

      }
  }

  private void method495(int var1, int var2, int var3, int var4) {
    if (var3 != 17387) {
        this.aClass3_Sub24_Sub3_3527 = null;
      }
  }

  private int method496(int var1, AudioSomethingSomething var2) {
    int var3 = this.anIntArray3498[var2.anInt2514];
      if (var1 != 0) {
        this.anIntArray3498 = null;
      }

      return ~var3 > -8193 ?
        32 + var2.anInt2503 * var3 >> 6 :
        16384 - ((128 + -var2.anInt2503) * (16384 + -var3) + 32 >> 6);
  }

  private void method497(int var1, int var2) {
    if ((4 & this.anIntArray3518[var1]) != 0) {
        for (AudioSomethingSomething var4 =
             (AudioSomethingSomething) this.aClass3_Sub24_Sub3_3527.aClass61_3489.getFirst();
            var4 != null; var4 =
               (AudioSomethingSomething) this.aClass3_Sub24_Sub3_3527.aClass61_3489.getNext()) {
          if (~var4.anInt2514 == ~var1) {
            var4.anInt2516 = 0;
          }
        }
      }
  }

  private int method498(byte var1, AudioSomethingSomething var2) {
    SomethingIndex150 var4 = var2.aClass166_2504;
      int var3 = (var2.anInt2522 * var2.anInt2502 >> 12) + var2.anInt2510;
      var3 += this.anIntArray3504[var2.anInt2514] * (-8192 + this.anIntArray3499[var2.anInt2514])
        >> 12;
      int var5;
      if ((var4.anInt2077 > 1 -1) && ((var4.anInt2066 > 1 -1)
        || (this.anIntArray3502[var2.anInt2514] > 1 -1))) {
        var5 = var4.anInt2066 << 2;
        int var6 = var4.anInt2069 << 1;
        if (var6 > var2.anInt2515) {
          var5 = var2.anInt2515 * var5 / var6;
        }

        var5 += this.anIntArray3502[var2.anInt2514] >> 7;
        double var7 = Math.sin(0.01227184630308513D * (511 & var2.anInt2508));
        var3 += (int) (var5 * var7);
      }

      var5 = (int) (0.5D + (256 * var2.aClass3_Sub12_Sub1_2509.anInt3034) * Math.pow(2.0D,
        var3 * 3.255208333333333E-4D) / DummyClass60.sampleRate);
      if (var1 != 85) {
        this.method414();
      }

      return var5 >= 1 ? var5 : 1;
  }

  public int method499(boolean var1 ) {
    if (var1) {
        this.method500(true, (byte) 91);
      }

      return this.anInt3521;
  }

  private void method500(boolean var1, byte var2) {
    if (var1) {
        this.method481((byte) 91, -1);
      } else {
        this.method489(var2 + -32283, -1);
      }

      this.method480(8388489, -1);
      if (var2 == -40) {
        int var3;
        for (var3 = 0; var3 < 16; ++var3) {
          this.anIntArray3515[var3] = this.anIntArray3501[var3];
        }

        for (var3 = 0; var3 < 16; ++var3) {
          this.anIntArray3506[var3] = ClientScript.bitAnd(-128, this.anIntArray3501[var3]);
        }

      }
  }

  public void method501(AudioSomethingSomething var1, boolean var2,
      byte var3 ) {
    int var4 = var1.aClass3_Sub12_Sub1_2509.aByteArray3030.length;
      int var5;
      if (var2 && var1.aClass3_Sub12_Sub1_2509.aBoolean3031) {
        int var6 = var4 + (var4 - var1.aClass3_Sub12_Sub1_2509.anInt3033);
        var4 <<= 8;
        var5 = (int) ((long) var6 * this.anIntArray3519[var1.anInt2514] >> 6);
        if (~var5 <= ~var4) {
          var1.aClass3_Sub24_Sub1_2507.method442(true);
          var5 = -1 + (var4 - -var4) + -var5;
        }
      } else {
        var5 = (int) ((long) var4 * this.anIntArray3519[var1.anInt2514] >> 6);
      }

      var1.aClass3_Sub24_Sub1_2507.method434(var5);
      if (var3 >= -70) {
        this.aLong3523 = 47L;
      }
  }

  private void method502(int var1, int var2) {
    if (var2 != ~(this.anIntArray3518[var1] & 2)) {
        for (AudioSomethingSomething var3 =
             (AudioSomethingSomething) this.aClass3_Sub24_Sub3_3527.aClass61_3489.getFirst();
             var3 != null; var3 =
               (AudioSomethingSomething) this.aClass3_Sub24_Sub3_3527.aClass61_3489.getNext()) {
          if (~var1 == ~var3.anInt2514
            && this.aClass3_Sub22ArrayArray3512[var1][var3.anInt2520] == null
            && var3.anInt2506 < 0) {
            var3.anInt2506 = 0;
          }
        }
      }
  }

  public boolean method504(AudioSomethingSomething var1, int var2 ) {
    if (var1.aClass3_Sub24_Sub1_2507 != null) {
        return false;
      } else {
        if ((var1.anInt2506 >= 1 -1)) {
          var1.unlinkNode();
          if ((var1.anInt2517 > 1 -1)
            && this.aClass3_Sub22ArrayArray3513[var1.anInt2514][var1.anInt2517] == var1) {
            this.aClass3_Sub22ArrayArray3513[var1.anInt2514][var1.anInt2517] = null;
          }
        }

        return true;
      }
  }

  public synchronized void method505(byte var1 ) {
    this.method507(true, (byte) -68);
      if (var1 > -125) {
        this.anIntArray3520 = null;
      }
  }

  public synchronized void method506(int var1, int var2 ) {
    this.anInt3521 = var2;
      if (var1 != 128) {
        this.method480(-80, 93);
      }
  }

  private synchronized void method507(boolean var1, byte var2) {
    this.aClass78_3505.method1383();
      if (var2 == -68) {
        this.aClass3_Sub27_3528 = null;
        this.method500(var1, (byte) -40);
      }
  }

  private int method508(byte var1, AudioSomethingSomething var2) {
    if (var1 != 36) {
        this.anIntArray3501 = null;
      }

      if (this.anIntArray3516[var2.anInt2514] == 0) {
        return 0;
      } else {
        SomethingIndex150 var3 = var2.aClass166_2504;
        int var4 = 4096 + this.anIntArray3497[var2.anInt2514] * this.anIntArray3514[var2.anInt2514]
          >> 13;
        var4 = 16384 + var4 * var4 >> 15;
        var4 = 16384 + var2.anInt2513 * var4 >> 15;
        var4 = 128 + var4 * this.anInt3521 >> 8;
        var4 = this.anIntArray3516[var2.anInt2514] * var4 + 128 >> 8;
        if (var3.anInt2078 > 0) {
          var4 = (int) (0.5D
            + Math.pow(0.5D, var2.anInt2523 * 1.953125E-5D * var3.anInt2078)
            * var4);
        }

        int var5;
        int var6;
        int var7;
        int var8;
        if (var3.aByteArray2064 != null) {
          var5 = var2.anInt2511;
          var6 = var3.aByteArray2064[1 + var2.anInt2501];
          if (var3.aByteArray2064.length - 2 > var2.anInt2501) {
            var8 = (var3.aByteArray2064[2 + var2.anInt2501] & 255) << 8;
            var7 = '\uff00' & var3.aByteArray2064[var2.anInt2501] << 8;
            var6 +=
              (var3.aByteArray2064[3 + var2.anInt2501] + -var6) * (var5 - var7) / (var8 + -var7);
          }

          var4 = 32 + var6 * var4 >> 6;
        }

        if (var2.anInt2506 > 0 && var3.aByteArray2076 != null) {
          var5 = var2.anInt2506;
          var6 = var3.aByteArray2076[1 + var2.anInt2519];
          if (-2 + var3.aByteArray2076.length > var2.anInt2519) {
            var7 = '\uff00' & var3.aByteArray2076[var2.anInt2519] << 8;
            var8 = (var3.aByteArray2076[var2.anInt2519 + 2] & 255) << 8;
            var6 +=
              (var5 - var7) * (-var6 + var3.aByteArray2076[3 + var2.anInt2519]) / (-var7 + var8);
          }

          var4 = 32 + var4 * var6 >> 6;
        }

        return var4;
      }
  }

  public static void method474(int var0, int var1) {
    DummyCanvas.aClass93_21.method1522(-125, var1);
      DummyClass54.aClass93_1401.method1522(-126, var1);
      if (var0 != 2) {
        AudioStreamEncoder4.aBooleanArray3503 = null;
      }

      ObjectNode.aClass93_4051.method1522(var0 ^ -127, var1);
      DummyClass14.aClass93_1965.method1522(-128, var1);
  }

  public static void method477(int var0, boolean var1, int var2, Widget var3) {
    if (!var1) {
        AudioStreamEncoder4.method487(98, (byte) 74);
      }

      if ((var3.anInt318 == 2 -1)) {
        ++AnimationFrame.anInt2459;
        ScriptState.method1177(-1, 0L, (byte) -78, GroundItemNode.EMPTY_STRING, 0, (short) 8,
          var3.aClass94_289, var3.anInt279);
      }

      GameString var4;
      if ((var3.anInt318 == 3 -1) && !SceneNode.aBoolean1837) {
        var4 = DummyClass41.method1174(var3, (byte) -31);
        if (var4 != null) {
          ++TextureSampler27.anInt3090;
          ScriptState.method1177(-1, 0L, (byte) -120, RenderAnimation.concat(
            new GameString[] {SomethingSceneI.aClass94_431, var3.aClass94_243}), -1, (short) 32,
            var4, var3.anInt279);
        }
      }

      if ((var3.anInt318 == 4 -1)) {
        ++HintMarker.anInt1361;
        ScriptState.method1177(-1, 0L, (byte) -59, GroundItemNode.EMPTY_STRING, 0, (short) 28,
          TextureSampler27.aClass94_3097, var3.anInt279);
      }

      if ((var3.anInt318 == 5 -1)) {
        ++AudioWorker.anInt349;
        ScriptState.method1177(-1, 0L, (byte) -71, GroundItemNode.EMPTY_STRING, 0, (short) 59,
          var3.aClass94_289, var3.anInt279);
      }

      if ((var3.anInt318 == 6 -1)) {
        ScriptState.method1177(-1, 0L, (byte) -92, GroundItemNode.EMPTY_STRING, 0, (short) 51,
          var3.aClass94_289, var3.anInt279);
        ++AbstractObjectNodeWrapper.anInt1623;
      }

      if ((var3.anInt318 == 7 -1) && TextureSampler27.aClass11_3087 == null) {
        ScriptState.method1177(-1, 0L, (byte) -100, GroundItemNode.EMPTY_STRING, -1, (short) 41,
          var3.aClass94_289, var3.anInt279);
        ++ClientScriptCall.anInt2437;
      }

      int var5;
      int var15;
      if ((var3.anInt187 == 3 -1)) {
        var15 = 0;

        for (var5 = 0; ~var5 > ~var3.anInt244; ++var5) {
          for (int var6 = 0; var6 < var3.anInt177; ++var6) {
            int var7 = (32 - -var3.anInt285) * var6;
            int var8 = (32 + var3.anInt290) * var5;
            if (~var15 > -21) {
              var8 += var3.anIntArray300[var15];
              var7 += var3.anIntArray272[var15];
            }

            if (~var2 <= ~var7 && ~var8 >= ~var0 && 32 + var7 > var2 && (var8 + 32) > var0) {
              DummyClass54.aClass11_1402 = var3;
              StillGraphic.anInt2701 = var15;
              if ((var3.anIntArray254[var15] > 1 -1)) {
                WidgetAccess var9 = GameClient.method44(var3);
                ItemConfig var10 =
                  DummyClass35.getItemConfig(var3.anIntArray254[var15] + -1, (byte) 69);
                if (Something3d.anInt3012 == 1 && var9.method99(31595)) {
                  if (~GlTexture2d.anInt3764 != ~var3.anInt279
                    || ~DummyClass31.anInt1473 != ~var15) {
                    ++AudioWorker.anInt342;
                    ScriptState.method1177(-1, var10.anInt787, (byte) -91,
                      RenderAnimation.concat(new GameString[] {
                        RenderAnimation.aClass94_378, HashTable.aClass94_1699, var10.aClass94_770
                      }), var15, (short) 40, TextureSampler14.aClass94_3388, var3.anInt279);
                  }
                } else if (SceneNode.aBoolean1837 && var9.method99(31595)) {
                  Parameter var18 = ~LinearHashTable.anInt1038 != 0 ?
                    Deque.method1210(64, LinearHashTable.anInt1038) :
                    null;
                  if ((16 & Something3dRoot.anInt2051) != 0 && (var18 == null
                    || ~var10.method1115(var18.anInt3614, 103, LinearHashTable.anInt1038)
                    != ~var18.anInt3614)) {
                    ++ByteArrayNode.anInt3609;
                    ScriptState.method1177(BufferObject.anInt1887,
                        var10.anInt787,
                      (byte) -89, RenderAnimation.concat(new GameString[] {
                        DummyClass59.aClass94_676, HashTable.aClass94_1699, var10.aClass94_770
                      }), var15, (short) 3, Parameter.aClass94_3621, var3.anInt279);
                  }
                } else {
                  ++SomethingOtherWorldMap.anInt2540;
                  GameString[] var11 = var10.inventoryOptions;
                  if (DummyClass24.aBoolean1656) {
                    var11 = SomethingPacket151.method822(19406, var11);
                  }

                  int var12;
                  byte var13;
                  if (var9.method99(31595)) {
                    for (var12 = 4; (var12 >= 4 -1); --var12) {
                      if (var11 != null && var11[var12] != null) {
                        ++GroundItemNode.anInt3670;
                        if ((var12 == 4 -1)) {
                          var13 = 35;
                        } else {
                          var13 = 58;
                        }

                        ScriptState.method1177(-1, var10.anInt787, (byte) -65,
                          RenderAnimation.concat(
                            new GameString[] {TextureSampler6.aClass94_3042, var10.aClass94_770}),
                          var15, var13, var11[var12], var3.anInt279);
                      }
                    }
                  }

                  if (var9.method96(-2063688673)) {
                    ++SceneSomething.anInt494;
                    ScriptState.method1177(DummyClass54.anInt1403,
                        var10.anInt787,
                      (byte) -96, RenderAnimation.concat(
                        new GameString[] {TextureSampler6.aClass94_3042, var10.aClass94_770}),
                      var15, (short) 22, TextureSampler14.aClass94_3388, var3.anInt279);
                  }

                  if (var9.method99(31595) && var11 != null) {
                    for (var12 = 2; var12 >= 0; --var12) {
                      if (var11[var12] != null) {
                        ++DummyClass50.anInt1141;
                        var13 = 0;
                        if ((var12 == 1 -1)) {
                          var13 = 47;
                        }

                        if (var12 == 1) {
                          var13 = 5;
                        }

                        if (var12 == 2) {
                          var13 = 43;
                        }

                        ScriptState.method1177(-1, var10.anInt787, (byte) -82,
                          RenderAnimation.concat(
                            new GameString[] {TextureSampler6.aClass94_3042, var10.aClass94_770}),
                          var15, var13, var11[var12], var3.anInt279);
                      }
                    }
                  }

                  var11 = var3.aClass94Array173;
                  if (DummyClass24.aBoolean1656) {
                    var11 = SomethingPacket151.method822(19406, var11);
                  }

                  if (var11 != null) {
                    for (var12 = 4; var12 >= 0; --var12) {
                      if (var11[var12] != null) {
                        ++TextureSampler22.anInt3420;
                        var13 = 0;
                        if (var12 == 0) {
                          var13 = 25;
                        }

                        if ((var12 == 2 -1)) {
                          var13 = 23;
                        }

                        if ((var12 == 3 -1)) {
                          var13 = 48;
                        }

                        if (var12 == 3) {
                          var13 = 7;
                        }

                        if (var12 == 4) {
                          var13 = 13;
                        }

                        ScriptState.method1177(-1, var10.anInt787, (byte) -51,
                          RenderAnimation.concat(
                            new GameString[] {TextureSampler6.aClass94_3042, var10.aClass94_770}),
                          var15, var13, var11[var12], var3.anInt279);
                      }
                    }
                  }

                  ScriptState.method1177(WorldMapLabel.anInt1719,
                      var10.anInt787, (byte) -98,
                    RenderAnimation.concat(
                      new GameString[] {TextureSampler6.aClass94_3042, var10.aClass94_770}), var15,
                    (short) 1006, BlockConfig.aClass94_1180, var3.anInt279);
                }
              }
            }

            ++var15;
          }
        }
      }

      if (var3.aBoolean233) {
        if (SceneNode.aBoolean1837) {
          if (GameClient.method44(var3).method97(-20710)
            && ((32 & Something3dRoot.anInt2051) != 1 -1)) {
            ++PlayerVariable.anInt562;
            ScriptState.method1177(BufferObject.anInt1887, 0L, (byte) -113,
              RenderAnimation.concat(new GameString[] {
                DummyClass59.aClass94_676, AbstractDirectColorSprite.aClass94_3703,
                var3.aClass94_277
              }), var3.anInt191, (short) 12, Parameter.aClass94_3621, var3.anInt279);
          }
        } else {
          for (var15 = 9; var15 >= 5; --var15) {
            GameString var16 = FaceNormal.method1732(var3, (byte) -71, var15);
            if (var16 != null) {
              ScriptState.method1177(TextureSampler6.method173((byte) 126, var15, var3),
                  var15 + 1, (byte) -85, var3.aClass94_277, var3.anInt191, (short) 1003,
                var16, var3.anInt279);
              ++TextureSampler1.anInt3136;
            }
          }

          var4 = DummyClass41.method1174(var3, (byte) -101);
          if (var4 != null) {
            ++TextureSampler27.anInt3090;
            ScriptState.method1177(-1, 0L, (byte) -116, var3.aClass94_277, var3.anInt191,
              (short) 32, var4, var3.anInt279);
          }

          for (var5 = 4; (var5 >= 1 -1); --var5) {
            GameString var17 = FaceNormal.method1732(var3, (byte) -65, var5);
            if (var17 != null) {
              ++TextureSampler1.anInt3136;
              ScriptState.method1177(TextureSampler6.method173((byte) 53, var5, var3),
                  var5 - -1, (byte) -48, var3.aClass94_277, var3.anInt191, (short) 9, var17,
                var3.anInt279);
            }
          }

          if (GameClient.method44(var3).method95(-13081)) {
            ++ClientScriptCall.anInt2437;
            ScriptState.method1177(-1, 0L, (byte) -74, GroundItemNode.EMPTY_STRING, var3.anInt191,
              (short) 41, DummyClass44.aClass94_935, var3.anInt279);
          }
        }
      }
  }

  public static boolean method487(int var0, byte var1) {
    if (var1 != -85) {
        AudioStreamEncoder4.anInt3507 = 56;
      }

      return var0 >= 97 && ~var0 >= -123 || (var0 >= 66 -1) && var0 <= 90;
  }

  public static void method491(byte var0) {
    AudioStreamEncoder4.aBooleanArray3503 = null;
      AudioStreamEncoder4.aClass94_3496 = null;
  }

  public static void method503(byte var0, int var1) {
    FileSystem.anInt101 = var1;
      if (var0 == -53) {
        ByteArrayNode.anInt3611 = 20;
        AbstractDirectColorSprite.anInt3704 = 3;
      }
  }

}
