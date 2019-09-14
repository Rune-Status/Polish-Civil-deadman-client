package com.jagex.runescape;

import com.jagex.runescape.opengl.GlTexture2d;
import com.jagex.runescape.opengl.shader.MaterialShader5;
import java.nio.charset.StandardCharsets;

public final class StringNode extends Node {

  public static int anInt2579 = 1;
  public static GameString[] aClass94Array2580 = new GameString[100];
  public static FileUnpacker aClass153_2581;
  public static int lastPacketId0;
  public static boolean dynamicScene;
  public static GameString aClass94_2584 = GameString.create("<)4col>");
  public static GameString aClass94_2585 =
      GameString.create("Connexion au serveur de mise -9 jour en cours");
  public static int anInt2587;
  public static GameStub applet;
  public static int anInt2589;
  public GameString aClass94_2586;

  public StringNode() {
  }

  public StringNode(GameString var1) {
    this.aClass94_2586 = var1;
  }

  public static void method727(int var0) {
    Keyboard.aClass93_1911.method1524(3);
      int var1 = 56 / ((var0 - 7) / 54);
      HashTableIterator.aClass93_1131.method1524(3);
  }

  public static void method728(boolean var0) {
    if (var0) {
        StringNode.method731(null, (byte) 118);
      }

      try {
        if (SomethingQuickChatK.anInt154 == 1) {
          int var1 = DummyClass55.aClass3_Sub24_Sub4_1421.method499(var0);
          if (-1 > ~var1 && DummyClass55.aClass3_Sub24_Sub4_1421
              .method473(-124)) {
            var1 -= SpotAnimationConfig.anInt546;
            if (-1 < ~var1) {
              var1 = 0;
            }

            DummyClass55.aClass3_Sub24_Sub4_1421.method506(128, var1);
            return;
          }

          DummyClass55.aClass3_Sub24_Sub4_1421.method505((byte) -128);
          DummyClass55.aClass3_Sub24_Sub4_1421.method485(-110);
          MidiSomething.aClass3_Sub27_1154 = null;
          SomethingQuickChat.aClass83_3579 = null;
          if (DummyClass55.aClass153_1423 != null) {
            SomethingQuickChatK.anInt154 = 2;
          } else {
            SomethingQuickChatK.anInt154 = 0;
          }
        }
      } catch (Exception var2) {
        var2.printStackTrace();
        DummyClass55.aClass3_Sub24_Sub4_1421.method505((byte) -127);
        DummyClass55.aClass153_1423 = null;
        MidiSomething.aClass3_Sub27_1154 = null;
        SomethingQuickChatK.anInt154 = 0;
        SomethingQuickChat.aClass83_3579 = null;
      }
  }

  public static int method729(byte var0, int var1, int var2) {
    if (var0 > -32) {
        return 88;
      } else if (var1 == -2) {
        return 12345678;
      } else if (~var1 == 0) {
        if (2 > var2) {
          var2 = 2;
        } else if (~var2 < -127) {
          var2 = 126;
        }

        return var2;
      } else {
        var2 = (127 & var1) * var2 >> 7;
        if (var2 < 2) {
          var2 = 2;
        } else if (var2 > 126) {
          var2 = 126;
        }

        return (var1 & '\uff80') - -var2;
      }
  }

  public static void method730(int var0, int var1, byte var2, int var3,
      int var4, int var5) {
    int var6 = 19 % ((var2 - -44) / 47);
      if (~var0 <= ~DummyClass55.anInt1425 && var4 <= GlTexture2d.anInt3765
          && DummyClass13.anInt2020 <= var5
          && LightIntensity.anInt902 >= var3) {
        MaterialShader5.method1632(95, var3, var4, var5, var0, var1);
      } else {
        ObjectCache.method1525(3074, var1, var4, var5, var0, var3);
      }
  }

  public static void method731(FileUnpacker var0, byte var1) {
    int var2 = 3 / ((var1 - -62) / 37);
      TextureSampler20.aClass153_3154 = var0;
      DummyClass53.anInt1344 = TextureSampler20.aClass153_3154
          .getAmountChildren(16, (byte) 71);
  }

  public static GameString method732(String var0, int var1) {
    if (var1 != 27307) {
        StringNode.anInt2589 = -93;
      }

      byte[] var2;
      var2 = var0.getBytes(StandardCharsets.ISO_8859_1);

      GameString var3 = new GameString();
      var3.bytes = var2;
      var3.length = 0;

      for (int var4 = 0; var4 < var2.length; ++var4) {
        if (-1 != ~var2[var4]) {
          var2[var3.length++] = var2[var4];
        }
      }

      return var3;
  }

  public static SomethingQuickChat method733(int var0, int var1) {
    SomethingQuickChat var2 =
          (SomethingQuickChat) ProjectileNode.aClass47_3776.get(var1, 1400);
      if (null == var2) {
        byte[] var3;
        if (-32769 < ~var1) {
          var3 = AudioStreamEncoder3.aClass153_3490.getBytes(1, var1);
        } else {
          var3 = DummyClass14.aClass153_1967.getBytes(1, 32767 & var1);
        }

        var2 = new SomethingQuickChat();
        if (var0 != 12345678) {
          StringNode.lastPacketId0 = 56;
        }

        if (var3 != null) {
          var2.method546(new Buffer(var3), -1);
        }

        if (var1 >= '\u8000') {
          var2.method548(60);
        }

        ProjectileNode.aClass47_3776.put(var1, var2);
        return var2;
      } else {
        return var2;
      }
  }

  public static void setSettings(int var0, GameString var1) {
    System.out.println("StringNode.setSettings");
  }

  public static void method735(int var0) {
    StringNode.aClass153_2581 = null;
      StringNode.aClass94Array2580 = null;
      StringNode.aClass94_2584 = null;
      if (var0 != -22749) {
        StringNode.anInt2579 = 66;
      }

      StringNode.aClass94_2585 = null;
  }

  public static void method736(int var0, int var1) {
    if (var1 <= 61) {
        StringNode.method736(-60, -93);
      }

      if (-1 == ~SomethingQuickChatK.anInt154) {
        DummyClass55.aClass3_Sub24_Sub4_1421.method506(128, var0);
      } else {
        TextureSampler36.anInt3423 = var0;
      }
  }

}
