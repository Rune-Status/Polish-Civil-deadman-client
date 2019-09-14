package com.jagex.runescape;

import java.util.Objects;

public final class DummyClass4 extends DummyClass6 {

  public static int[] anIntArray2999;
  public static GameString aClass94_3000 = GameString.create("; Max)2Age=");
  public static int anInt3001;
  public static GameString aClass94_3002 = GameString.create("M");
  public static GameString[] aClass94Array3003 = new GameString[100];
  public static boolean aBoolean3004 = true;
  public static byte[][] aByteArrayArray3005;
  public static GameString aClass94_3006 = GameString.create("<col=ff3000>");
  public static int[] anIntArray3007 = {-1, -1, 1, 1};


  public static void method2227(byte var0) {
    DummyClass4.aClass94_3006 = null;
      DummyClass4.anIntArray3007 = null;
      DummyClass4.aClass94Array3003 = null;
      if (var0 == 37) {
        DummyClass4.aByteArrayArray3005 = null;
        DummyClass4.aClass94_3002 = null;
        DummyClass4.aClass94_3000 = null;
        DummyClass4.anIntArray2999 = null;
      }
  }

  public static void parsePlayerUpdate(byte var0) {
    OndemandRequester.anInt997 = 0;
      DummyClass17.anInt1829 = 0;
      FileRequester.method2100((byte) 81);
      GameObject.method1964(false);
      WorldMapLabel.method1786(-59);
      MovedStatics0.method58(-102);
      if (var0 <= -69) {
        int var1;
        for (var1 = 0; DummyClass17.anInt1829 > var1; ++var1) {
          int var2 = VariableUpdate.anIntArray2292[var1];
          if (AbstractGameWorld.updateCycle != TextureSampler0.players[var2].anInt2838) {
            if (TextureSampler0.players[var2].anInt3969 > 0) {
              DummyClass11.method2203(TextureSampler0.players[var2], 8);
            }

            TextureSampler0.players[var2] = null;
          }
        }

        if ((HashTable.packetLength == SpotAnimationConfig.gameBuffer.position)) {
          for (var1 = 0; var1 < DummyClass13.anInt2022; ++var1) {
            if (TextureSampler0.players[DummyClass42.anIntArray887[var1]]
                == null) {
              throw new RuntimeException(
                  "gpp2 pos:" + var1 + " size:" + DummyClass13.anInt2022);
            }
          }

        } else {
          throw new RuntimeException(
              "gpp1 pos:" + SpotAnimationConfig.gameBuffer.position + " psize:"
                  + HashTable.packetLength);
        }
      }
  }

  public static void method2229(long var0, byte var2) {
    if ((var0 != 1L -1)) {
        if ((FileSystem.anInt104 < 100 || TextureSampler3.aBoolean3358)
          && (FileSystem.anInt104 < 201 -1)) {
          GameString var3 = Objects
              .requireNonNull(FileCache.stringFromBase37(-29664, var0)).formatName((byte) -50);
          if (var2 != -91) {
            DummyClass4.method2227((byte) 22);
          }

          int var4;
          for (var4 = 0; FileSystem.anInt104 > var4; ++var4) {
            if ((VertexNormal.aLongArray826[var4] == var0)) {
              GameBuffer.printMessage(GroundItemNode.EMPTY_STRING, 0,
                RenderAnimation.concat(new GameString[] {var3, Structure.aClass94_3645}), -1);
              return;
            }
          }

          for (var4 = 0; AnimationSomething.anInt3591 > var4; ++var4) {
            if ((var0 == MonoChromaticImageCache.aLongArray1574[var4])) {
              GameBuffer.printMessage(GroundItemNode.EMPTY_STRING, 0, RenderAnimation.concat(
                new GameString[] {DummyClass35.aClass94_662, var3, GameStub.aClass94_4}), -1);
              return;
            }
          }

          if (var3.method1528((byte) -42, TextureCache.localPlayer.name)) {
            GameBuffer.printMessage(GroundItemNode.EMPTY_STRING, 0, FileTable.aClass94_957, -1);
          } else {
            ++SpotAnimationConfig.anInt544;
            SceneSomething2.aClass94Array1046[FileSystem.anInt104] = var3;
            VertexNormal.aLongArray826[FileSystem.anInt104] = var0;
            Cursor.anIntArray882[FileSystem.anInt104] = 0;
            SubNode.aClass94Array2566[FileSystem.anInt104] = GroundItemNode.EMPTY_STRING;
            LightIntensity.anIntArray904[FileSystem.anInt104] = 0;
            Node.aBooleanArray73[FileSystem.anInt104] = false;
            ++FileSystem.anInt104;
            DummyClass31.anInt1472 = TextureSampler23.anInt3213;
            TextureSampler12.secureBuffer.writePacket(120);
            TextureSampler12.secureBuffer.writeLong(var0);
          }
        } else {
          GameBuffer.printMessage(GroundItemNode.EMPTY_STRING, 0, DummyClass8.aClass94_4024, -1);
        }
      }
  }

}
