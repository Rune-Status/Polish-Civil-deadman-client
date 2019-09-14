package com.jagex.runescape;

public final class ByteArrayNode extends SubNode {

  public static int anInt3609;
  public static SomethingLight0[] aClass113Array3610;
  public static int anInt3611;
  public static int anInt3613;
  public byte[] aByteArray3612;


  public ByteArrayNode(byte[] var1 ) {
    this.aByteArray3612 = var1;
  }

  public static int method571(int var0) {
    return var0 >= -57 ?
        -107 :
        (NPC.aFloat3979 == 3.0D ?
          37 :
          (NPC.aFloat3979 == 4.0D ?
            50 :
            (NPC.aFloat3979 != 6.0D ?
              (NPC.aFloat3979 == 8.0D ? 100 : 200) :
              75)));
  }

  public static ClientScript method572(int var0, byte var1) {
    ClientScript var2 = (ClientScript) DummyClass42.aClass47_885.get(var0, 1400);
      if (var2 != null) {
        return var2;
      } else {
        byte[] var3 = WidgetAccess.scripts.getBytes(var0, 0);
        if (var3 != null) {
          var2 = new ClientScript();
          if (var1 != -91) {
            ByteArrayNode.aClass113Array3610 = null;
          }

          Buffer var4 = new Buffer(var3);
          var4.position = -2 + var4.bytes.length;
          int var5 = var4.readUnsignedShort();
          int var6 = -12 + var4.bytes.length + -2 - var5;
          var4.position = var6;
          int var7 = var4.readInt();
          var2.anInt3680 = var4.readUnsignedShort();
          var2.anInt3687 = var4.readUnsignedShort();
          var2.anInt3678 = var4.readUnsignedShort();
          var2.anInt3682 = var4.readUnsignedShort();
          int var8 = var4.readUnsignedByte();
          int var9;
          int var10;
          if (var8 > 0) {
            var2.aClass130Array3685 = new HashTable[var8];

            for (var9 = 0; var9 < var8; ++var9) {
              var10 = var4.readUnsignedShort();
              HashTable var11 = new HashTable(DummyClass53.nearestPo2((byte) 119, var10));
              var2.aClass130Array3685[var9] = var11;

              while (((var10--) > 0)) {
                int var12 = var4.readInt();
                int var13 = var4.readInt();
                var11.put(var12, new IntegerNode(var13));
              }
            }
          }

          var4.position = 0;
          var2.aClass94_3686 = var4.method750((byte) 78);
          var2.anIntArray3683 = new int[var7];
          var2.aClass94Array3688 = new GameString[var7];
          var9 = 0;

          for (
            var2.anIntArray3690 = new int[var7];
            var6 > var4.position; var2.anIntArray3683[var9++] = var10) {
            var10 = var4.readUnsignedShort();
            if (var10 == 3) {
              var2.aClass94Array3688[var9] = var4.readString();
            } else {
              if (var10 < 100 && var10 != 21 && (var10 != 38) && var10 != 39) {
                var2.anIntArray3690[var9] = var4.readInt();
              } else {
                var2.anIntArray3690[var9] = var4.readUnsignedByte();
              }
            }
          }

          DummyClass42.aClass47_885.put(var0, var2);
          return var2;
        } else {
          return null;
        }
      }
  }

  public static void method573(int var0) {
    if (var0 != -11346) {
        ByteArrayNode.anInt3611 = -69;
      }

      ByteArrayNode.aClass113Array3610 = null;
  }

  public static void method574(NPC var0, boolean var1) {
    if (!var1) {
        for (AreaSoundEffect var2 = (AreaSoundEffect) SocketStream.aClass61_1242.getFirst();
             var2 != null; var2 = (AreaSoundEffect) SocketStream.aClass61_1242.getNext()) {
          if (var0 == var2.aClass140_Sub4_Sub2_2324) {
            if (var2.aClass3_Sub24_Sub1_2312 != null) {
              MonoChromaticImageBuffer.aClass3_Sub24_Sub2_2563.method461(
                var2.aClass3_Sub24_Sub1_2312);
              var2.aClass3_Sub24_Sub1_2312 = null;
            }

            var2.unlinkNode();
            return;
          }
        }

      }
  }

  public static void method575(FileUnpacker var0, int var1) {
    if (var1 != -1) {
        ByteArrayNode.method575(null, -38);
      }

      SomethingOtherWorldMap.aClass153_2536 = var0;
  }

  public static int method576(GameString var0, boolean var1) {
    if (DummyClass25.aClass131_1624 != null && var0.getLength() != 0) {
        if (var1) {
          return -117;
        } else {
          for (int var2 = 0; var2 < DummyClass25.aClass131_1624.anInt1720; ++var2) {
            if (DummyClass25.aClass131_1624.aClass94Array1721[var2].method1560(
              TextureSampler15.aClass94_3192, true, OndemandFileRequest.aClass94_4066)
              .method1528((byte) -42, var0)) {
              return var2;
            }
          }

          return -1;
        }
      } else {
        return -1;
      }
  }

  public static void method577(int var0, int var1, int var2, int var3, SceneNode var4,
                              SceneNode var5, int var6, int var7, int var8, int var9, long var10) {
    if (var4 != null) {
      SomethingSceneI var12 = new SomethingSceneI();
      var12.aLong428 = var10;
      var12.anInt424 = var1 * 128 + 64;
      var12.anInt427 = var2 * 128 + 64;
      var12.anInt425 = var3;
      var12.aClass140_429 = var4;
      var12.aClass140_423 = var5;
      var12.anInt432 = var6;
      var12.anInt420 = var7;
      var12.anInt430 = var8;
      var12.anInt426 = var9;

      for (int var13 = var0; var13 >= 0; --var13) {
        if (SomethingTexture1.sceneGraphTiles[var13][var1][var2] == null) {
          SomethingTexture1.sceneGraphTiles[var13][var1][var2] =
            new SceneGraphTile(var13, var1, var2);
        }
      }

      SomethingTexture1.sceneGraphTiles[var0][var1][var2].aClass19_2233 = var12;
    }
  }

}
