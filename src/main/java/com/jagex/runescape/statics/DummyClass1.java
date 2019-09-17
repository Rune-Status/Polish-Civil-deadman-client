package com.jagex.runescape.statics;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.model.ITextureCache;
import com.jagex.runescape.model.Mobile;
import com.jagex.runescape.model.NPC;
import com.jagex.runescape.model.Player;
import com.jagex.runescape.model.RenderAnimation;
import com.jagex.runescape.model.SignLinkRequest;

public final class DummyClass1 {

  public static ITextureCache anInterface2_408;
  public static Thread gameThread;
  public static int anInt410;
  public static int anInt411;
  public static GameString aClass94_412 =
      GameStringStatics.create(
          "Vous ne pouvez pas ajouter votre nom -9 votre liste d(Wamis)3");
  public static SignLinkRequest socketRequest;
  public static GameString aClass94_414 = GameStringStatics
      .create("Verbindung abgebrochen)3");
  public static GameString aClass94_415 = GameStringStatics
      .create("comp-Btence ");

  public DummyClass1() {
    new DummyClass2();
  }

  public static void method904(int var0, Mobile var1) {
    if (var1.anInt2779 != 0) {
      RenderAnimation var2 = var1.getRenderAnimationId(false);
      int var4;
      int var5;
      if (var1.anInt2772 != -1 && var1.anInt2772 < 0x8000) {
        NPC var3 = GlobalStatics_8.npcs[var1.anInt2772];
        if (var3 != null) {
          var5 = -var3.anInt2829 + var1.anInt2829;
          var4 = -var3.anInt2819 + var1.anInt2819;
          if (var4 != 0 || var5 != 0) {
            var1.anInt2806 = (int) (Math.atan2(var4, var5) * 325.949D) & 2047;
          }
        }
      }

      int var6;
      int var9;
      if (var1.anInt2772 >= 0x8000) {
        var9 = -32768 + var1.anInt2772;
        if (var9 == GlobalStatics_10.localPlayerId) {
          var9 = 2047;
        }

        Player var10 = GlobalStatics_9.players[var9];
        if (var10 != null) {
          var6 = -var10.anInt2829 + var1.anInt2829;
          var5 = -var10.anInt2819 + var1.anInt2819;
          if (var5 != 0 || var6 != 0) {
            var1.anInt2806 = (int) (Math.atan2(var5, var6) * 325.949D) & 2047;
          }
        }
      }

      if ((var1.anInt2786 != 0 || var1.anInt2762 != 0) && (var1.anInt2816 == 0
          || var1.anInt2824 > 0)) {
        var9 = var1.anInt2819 - (-GlobalStatics_10.anInt1716 + var1.anInt2786
            - GlobalStatics_10.anInt1716) * 64;
        var4 =
            -((-GlobalStatics_9.anInt1152 + var1.anInt2762
                - GlobalStatics_9.anInt1152) * 64)
                + var1.anInt2829;
        if (var9 != 0 || var4 != 0) {
          var1.anInt2806 = (int) (Math.atan2(var9, var4) * 325.949D) & 2047;
        }

        var1.anInt2762 = 0;
        var1.anInt2786 = 0;
      }

      var9 = var1.anInt2806 - var1.rotationY & 2047;
      if (var9 == 0) {
        var1.anInt2789 = 0;
        var1.anInt2821 = 0;
      } else {
        assert var2 != null;
        if (var2.anInt369 == 0) {
          ++var1.anInt2789;
          boolean var11;
          if (var9 > 1024) {
            var1.rotationY -= var1.anInt2779;
            var11 = true;
            if (var9 < var1.anInt2779 || var9 > -var1.anInt2779 + 2048) {
              var1.rotationY = var1.anInt2806;
              var11 = false;
            }

            if (var2.anInt368 == var1.anInt2764 && (var1.anInt2789 > 25
                || var11)) {
              if (var2.anInt367 == -1) {
                var1.anInt2764 = var2.anInt382;
              } else {
                var1.anInt2764 = var2.anInt367;
              }
            }
          } else {
            var11 = true;
            var1.rotationY += var1.anInt2779;
            if (var1.anInt2779 > var9 || var9 > 2048 - var1.anInt2779) {
              var11 = false;
              var1.rotationY = var1.anInt2806;
            }

            if (var2.anInt368 == var1.anInt2764 && (var1.anInt2789 > 25
                || var11)) {
              if (var2.anInt407 == -1) {
                var1.anInt2764 = var2.anInt382;
              } else {
                var1.anInt2764 = var2.anInt407;
              }
            }
          }

          var1.rotationY &= 2047;
        } else {
          if (var2.anInt368 == var1.anInt2764 && var1.anInt2789 > 25) {
            if (var2.anInt407 == -1) {
              var1.anInt2764 = var2.anInt382;
            } else {
              var1.anInt2764 = var2.anInt407;
            }
          }

          var4 = var1.anInt2806 << 5;
          if (var4 != var1.anInt2808) {
            var1.anInt2791 = 0;
            var1.anInt2808 = var4;
            var5 = -var1.anInt2780 + var4 & 0xffff;
            var6 = var1.anInt2821 * var1.anInt2821 / (var2.anInt369 * 2);
            int var7;
            if (var1.anInt2821 > 0 && var5 >= var6
                && -var6 + var5 < 0x8000) {
              var1.anInt2803 = var5 / 2;
              var1.aBoolean2769 = true;
              var7 = var2.anInt357 * var2.anInt357 / (var2.anInt369 * 2);
              if (var7 > 32767) {
                var7 = 32767;
              }

              if (var7 < var1.anInt2803) {
                var1.anInt2803 = -var7 + var5;
              }
            } else if (var1.anInt2821 < 0 && var6 <= -var5 + 65536
                && 65536 - var5 - var6 < 0x8000) {
              var1.anInt2803 = (-var5 + 65536) / 2;
              var1.aBoolean2769 = true;
              var7 = var2.anInt357 * var2.anInt357 / (var2.anInt369 * 2);
              if (var7 > 32767) {
                var7 = 32767;
              }

              if (var7 < var1.anInt2803) {
                var1.anInt2803 = 65536 - (var5 + var7);
              }
            } else {
              var1.aBoolean2769 = false;
            }
          }

          if (var1.anInt2821 == 0) {
            var5 = -var1.anInt2780 + var1.anInt2808 & 0xffff;
            if (var5 < var2.anInt369) {
              var1.anInt2780 = var1.anInt2808;
            } else {
              var1.anInt2791 = 0;
              var6 = var2.anInt357 * var2.anInt357 / (2 * var2.anInt369);
              var1.aBoolean2769 = true;
              if (var6 > 32767) {
                var6 = 32767;
              }

              if (var5 >= 32768) {
                var1.anInt2821 = -var2.anInt369;
                var1.anInt2803 = (65536 - var5) / 2;
                if (var6 < var1.anInt2803) {
                  var1.anInt2803 = 65536 - (var5 + var6);
                }
              } else {
                var1.anInt2821 = var2.anInt369;
                var1.anInt2803 = var5 / 2;
                if (var6 < var1.anInt2803) {
                  var1.anInt2803 = -var6 + var5;
                }
              }
            }
          } else if (var1.anInt2821 <= 0) {
            if (var1.anInt2791 >= var1.anInt2803) {
              var1.aBoolean2769 = false;
            }

            if (!var1.aBoolean2769) {
              var1.anInt2821 += var2.anInt369;
              if (var1.anInt2821 > 0) {
                var1.anInt2821 = 0;
              }
            } else if (-var2.anInt357 < var1.anInt2821) {
              var1.anInt2821 -= var2.anInt369;
            }
          } else {
            if (var1.anInt2803 <= var1.anInt2791) {
              var1.aBoolean2769 = false;
            }

            if (!var1.aBoolean2769) {
              var1.anInt2821 -= var2.anInt369;
              if (var1.anInt2821 < 0) {
                var1.anInt2821 = 0;
              }
            } else if (var1.anInt2821 < var2.anInt357) {
              var1.anInt2821 += var2.anInt369;
            }
          }

          var1.anInt2780 += var1.anInt2821;
          var1.anInt2780 &= 0xffff;
          if (var1.anInt2821 <= 0) {
            var1.anInt2791 -= var1.anInt2821;
          } else {
            var1.anInt2791 += var1.anInt2821;
          }

          var1.rotationY = var1.anInt2780 >> 5;
        }
      }

      if (var0 != 65536) {
        DummyClass1.method904(-93, null);
      }

    }
  }

  public static void clear57(int var0) {
    DummyClass1.anInterface2_408 = null;
    DummyClass1.aClass94_414 = null;
    DummyClass1.aClass94_415 = null;
    DummyClass1.aClass94_412 = null;
    DummyClass1.socketRequest = null;

    DummyClass1.gameThread = null;
  }

}
