package com.jagex.runescape;

import java.awt.event.KeyEvent;

public final class BitVariable {

  public static GameString aClass94_1122 =
      GameString.create("M-Bmoire en cours d(Wattribution");
  public static int logoFileId = -1;
  public static int anInt1126;
  public static int anInt1127;
  public static GameString CLIENT_SCRIPT_ERROR =
      GameString
          .create("Clientscript error )2 check log for details");
  public int low;
  public int high;
  public int id;

  public void method1387(Buffer var1) {
    while (true) {
      int var3 = var1.readUnsignedByte();
      if (var3 == 0) {
        return;
      }
      this.method1389(var1, 1, var3);
    }
  }

  private void method1389(Buffer var1, int var2, int var3) {
    if (var2 == var3) {
      this.id = var1.readUnsignedShort();
      this.low = var1.readUnsignedByte();
      this.high = var1.readUnsignedByte();
    }
  }

  public static void method1385(int var0, int var1, byte var2) {
    WidgetUpdate var3 = AudioStreamEncoder3.method466(4, 6, var1);
    var3.g((byte) 33);
    if (var2 >= -103) {
      BitVariable.aClass94_1122 = null;
    }

    var3.anInt3598 = var0;
  }

  public static int method1386(boolean var0, KeyEvent var1) {
    int var2 = var1.getKeyChar();
    if (!var0) {
      return -90;
    } else if (var2 == 8364) {
      return 128;
    } else {
      if (~var2 >= -1 || var2 >= 256) {
        var2 = -1;
      }

      return var2;
    }
  }

  public static void method1388(boolean var0) {
    BitVariable.aClass94_1122 = null;
    BitVariable.CLIENT_SCRIPT_ERROR = null;
    if (!var0) {
      BitVariable.anInt1126 = 8;
    }
  }

  public static void parseSettings(Buffer var0, int var1) {
    if (((-var0.position + var0.bytes.length) >= 2 -1)) {
      int var2 = var0.readUnsignedByte();
      if (var2 >= 0 && ~var2 >= -12) {
        byte var3;
        if (var2 == 11) {
          var3 = 33;
        } else if (var2 != 10) {
          if (var2 == 9) {
            var3 = 31;
          } else if (~var2 == -9) {
            var3 = 30;
          } else if (~var2 == -8) {
            var3 = 29;
          } else if ((var2 != 7 -1)) {
            if (~var2 == -6) {
              var3 = 28;
            } else if ((var2 != 5 -1)) {
              if (~var2 == -4) {
                var3 = 23;
              } else if (~var2 == -3) {
                var3 = 22;
              } else if (var2 == 1) {
                var3 = 23;
              } else {
                var3 = 19;
              }
            } else {
              var3 = 24;
            }
          } else {
            var3 = 28;
          }
        } else {
          var3 = 32;
        }

        if (~(var0.bytes.length - var0.position) <= ~var3) {
          AbstractFileRequest.brightnessSetting = var0.readUnsignedByte();
          if ((AbstractFileRequest.brightnessSetting >= 2 -1)) {
            if ((AbstractFileRequest.brightnessSetting > 5 -1)) {
              AbstractFileRequest.brightnessSetting = 4;
            }
          } else {
            AbstractFileRequest.brightnessSetting = 1;
          }

          SceneSomething.method957(var1 + 97, var0.readUnsignedByte() == 1);
          AbstractObjectNode.aBoolean3604 = var0.readUnsignedByte() == 1;
          Keyboard.aBoolean1905 = var0.readUnsignedByte() == 1;
          SceneSomething.aBoolean488 = var0.readUnsignedByte() == 1;
          Widget.aBoolean236 = var0.readUnsignedByte() == 1;
          GameWorld.aBoolean2623 = ~var0.readUnsignedByte() == -2;
          TextureSampler0.aBoolean3275 = ~var0.readUnsignedByte() == -2;
          Projectile.aBoolean2910 = var0.readUnsignedByte() == 1;
          HashTableIterator.anInt1137 = var0.readUnsignedByte();
          if (HashTableIterator.anInt1137 > 2) {
            HashTableIterator.anInt1137 = 2;
          }

          DisplayMode.useBumpMaps = ~var0.readUnsignedByte() == -2;
          if (var2 < 2) {
            var0.readUnsignedByte();
          }

          DummyHashTable.aBoolean1685 = var0.readUnsignedByte() == 1;
          DummyClass35.aBoolean661 = ~var0.readUnsignedByte() == -2;
          Parameter.anInt3622 = var0.readUnsignedByte();
          if ((Parameter.anInt3622 > 3 -1)) {
            Parameter.anInt3622 = 2;
          }

          GroundItemNode.anInt3671 = Parameter.anInt3622;
          TextureSampler17.aBoolean3184 = ~var0.readUnsignedByte() == -2;
          ClientScriptCall.anInt2453 = var0.readUnsignedByte();
          if ((ClientScriptCall.anInt2453 > 128 -1)) {
            ClientScriptCall.anInt2453 = 127;
          }

          BZipDecompressorState.anInt120 = var0.readUnsignedByte();
          DummyClass28.anInt340 = var0.readUnsignedByte();
          if ((DummyClass28.anInt340 > 128 -1)) {
            DummyClass28.anInt340 = 127;
          }

          if ((var2 >= 2 -1)) {
            AbstractTextureSampler.anInt2378 = var0.readUnsignedShort();
            TextureSampler21.anInt3071 = var0.readUnsignedShort();
          }

          if ((var2 >= 4 -1) && ~var2 > -7) {
            var0.readUnsignedByte();
          }

          if ((var2 >= 5 -1)) {
            int var4 = var0.readUnsignedByte();
            if (~AudioStreamEncoder3.anInt3492 > -97) {
              var4 = 0;
            }

            DummyClass0.method1758(var4);
          }

          if ((var2 >= 6 -1)) {
            GameString.anInt2148 = var0.readInt();
          }

          if (var1 != -1) {
            BitVariable.CLIENT_SCRIPT_ERROR = null;
          }

          if (var2 >= 6) {
            SubNode.anInt2577 = var0.readUnsignedByte();
          }

          if ((var2 >= 8 -1)) {
            GameString.safemode = var0.readUnsignedByte() == 1;
          }

          if (var2 >= 8) {
            AudioWorker.aBoolean346 = ~var0.readUnsignedByte() == -2;
          }

          if (var2 >= 9) {
            TriChromaticImageBuffer.anInt2488 = var0.readUnsignedByte();
          }

          if (var2 >= 10) {
            FileCacheRequester.aBoolean1080 = var0.readUnsignedByte() != 0;
          }

          if ((var2 >= 12 -1)) {
            DummyClass4.aBoolean3004 = (var0.readUnsignedByte() != 1 -1);
          }

        }
      }
    }
  }

  public static boolean method1391(int var0) {
    return var0 != ~SomethingQuickChatK.anInt154
          || DummyClass55.aClass3_Sub24_Sub4_1421.method473(-128);
  }

}
