package com.jagex.runescape;

import com.jagex.runescape.opengl.shader.MaterialShader;

public final class SomethingQuickChat extends SubNode {

  private static GameString aClass94_3578 = GameString.create("Loaded title screen");
  public static int[] anIntArray3565 = new int[32];
  public static int anInt3569;
  public static ObjectCache aClass93_3572 = new ObjectCache(64);
  public static GameString aClass94_3573 = GameString.create(" )2> <col=00ffff>");
  public static GameString TITLE_BACKGROUND = GameString.create("titlebg");
  public static GameString aClass94_3576 = GameString.create("name_icons");
  public static GameString aClass94_3577 = GameString.create(": ");
  public static MidiSomething aClass83_3579;
  public static GameString aClass94_3575 = SomethingQuickChat.aClass94_3578;
  public int[] anIntArray3567;
  public boolean aBoolean3568 = true;
  private int[] anIntArray3566;
  private int[][] anIntArrayArray3570;
  private GameString[] strings;

  public void method545(Buffer var1, int[] var2, boolean var3 ) {
    if (!var3) {
        if (this.anIntArray3566 != null) {
          for (int var4 = 0; this.anIntArray3566.length > var4 && ~var4 > ~var2.length; ++var4) {
            int var5 = GameException.anIntArray2113[this.method550(89, var4)];
            if (~var5 < -1) {
              var1.method739(0, var5, var2[var4]);
            }
          }

        }
      }
  }

  public void method546(Buffer var1, int var2 ) {
    while (true) {
        int var3 = var1.readUnsignedByte();
        if (var3 == 0) {
          if (var2 != -1) {
            this.anIntArray3567 = null;
          }

          return;
        }

        this.method553(var1, var3, -14637);
      }
  }

  public void method548(int var1 ) {
    if (this.anIntArray3567 != null) {
        for (int var2 = 0; this.anIntArray3567.length > var2; ++var2) {
          this.anIntArray3567[var2] =
            TextureSampler3.method308(this.anIntArray3567[var2], '\u8000');
        }
      }

      if (var1 != 60) {
        this.method552(true);
      }
  }

  public int method549(int var1, int var2, int var3 ) {
    if (var1 > -99) {
        SomethingQuickChat.aClass94_3577 = null;
      }

      return this.anIntArray3566 != null
          && var3 >= 0 && ~var3 >= ~this.anIntArray3566.length ?
        (this.anIntArrayArray3570[var3] != null && ~var2 <= -1
          && ~var2 >= ~this.anIntArrayArray3570[var3].length ?
            this.anIntArrayArray3570[var3][var2] :
          -1) :
        -1;
  }

  public int method550(int var1, int var2 ) {
    if (this.anIntArray3566 != null
          && ~var2 <= -1 && var2 <= this.anIntArray3566.length) {
        if (var1 <= 33) {
          SomethingQuickChat.aClass94_3578 = null;
        }

        return this.anIntArray3566[var2];
      } else {
        return -1;
      }
  }

  public int method552(boolean var1 ) {
    return !var1 ? -22 : (this.anIntArray3566 != null ? this.anIntArray3566.length : 0);
  }

  private void method553(Buffer var1, int var2, int var3) {
    if (var3 != -14637) {
        this.method548(-20);
      }

      if (var2 == 1) {
        this.strings = var1.readString().split(60);
      } else {
        int var4;
        int var5;
        if (var2 == 2) {
          var4 = var1.readUnsignedByte();
          this.anIntArray3567 = new int[var4];

          for (var5 = 0; var5 < var4; ++var5) {
            this.anIntArray3567[var5] = var1.readUnsignedShort();
          }
        } else {
          if (var2 == 3) {
            var4 = var1.readUnsignedByte();
            this.anIntArray3566 = new int[var4];
            this.anIntArrayArray3570 = new int[var4][];

            for (var5 = 0; var4 > var5; ++var5) {
              int var6 = var1.readUnsignedShort();
              this.anIntArray3566[var5] = var6;
              this.anIntArrayArray3570[var5] =
                  new int[AbstractAudioOutputStream.anIntArray1976[var6]];

              for (int var7 = 0;
                  AbstractAudioOutputStream.anIntArray1976[var6] > var7;
                  ++var7) {
                this.anIntArrayArray3570[var5][var7] = var1.readUnsignedShort();
              }
            }
          } else {
            if (var2 == 4) {
              this.aBoolean3568 = false;
            }
          }
        }
      }
  }

  public GameString method554(int var1 ) {
    if (var1 == -1) {
        GameString var2 = Cache.createString(80);
        if (this.strings == null) {
          return TextureSampler3.aClass94_3357;
        } else {
          var2.append(this.strings[0]);

          for (int var3 = 1; var3 < this.strings.length; ++var3) {
            var2.append(GameStub.aClass94_9);
            var2.append(this.strings[var3]);
          }

          return var2.pack();
        }
      } else {
        return null;
      }
  }

  public GameString method555(int var1, Buffer var2 ) {
    if (var1 != 28021) {
        this.anIntArrayArray3570 = null;
      }

      GameString string = Cache.createString(80);
      if (this.anIntArray3566 != null) {
        for (int var4 = 0; var4 < this.anIntArray3566.length; ++var4) {
          string.append(this.strings[var4]);
          string.append(GZipDecompressor.method1124(this.anIntArrayArray3570[var4],
            var2.readVariableLengthValue(WidgetAccess.anIntArray2209[this.anIntArray3566[var4]],
              var1 + -28021), this.anIntArray3566[var4], false));
        }
      }

      string.append(this.strings[-1 + this.strings.length]);
      return string.pack();
  }

  public static void method547(int var0) {
    if (var0 != -2951) {
        SomethingQuickChat.aClass94_3576 = null;
      }

      SomethingQuickChat.aClass94_3578 = null;
      SomethingQuickChat.aClass93_3572 = null;
      SomethingQuickChat.aClass94_3575 = null;
      SomethingQuickChat.TITLE_BACKGROUND = null;
      SomethingQuickChat.aClass94_3577 = null;
      SomethingQuickChat.aClass94_3576 = null;
      SomethingQuickChat.aClass94_3573 = null;
      SomethingQuickChat.aClass83_3579 = null;
      SomethingQuickChat.anIntArray3565 = null;
  }

  public static void method551(int var0, int var1, int var2) {
    if (var0 == 0) {
        if (var2 == 4 && !DummyHashTable.aBoolean1685) {
          var2 = 2;
          var1 = 2;
        }

        if (~DummyClass30.anInt453 == ~var2) {
          if (var2 != 0 && var1 != TextureSampler37.anInt3263) {
            MapScene.anInterface5Array70[var2].set(var1);
            TextureSampler37.anInt3263 = var1;
          }
        } else {
          if (TextureSampler23.aBoolean3207) {
            return;
          }

          if (~DummyClass30.anInt453 != -1) {
            MapScene.anInterface5Array70[DummyClass30.anInt453].disable();
          }

          if (~var2 != -1) {
            MaterialShader var3 = MapScene.anInterface5Array70[var2];
            var3.enable();
            var3.set(var1);
          }

          DummyClass30.anInt453 = var2;
          TextureSampler37.anInt3263 = var1;
        }

      }
  }

}
