package com.jagex.runescape;

public final class FileTable {

  private static GameString aClass94_948 =
    GameString.create("You can(Wt add yourself to your own friend list)3");
  public static int anInt942;
  public static int anInt944;
  public static GameString aClass94_946 = GameString.create(")2");
  public static int drawMemoryCounter;
  public static GameString aClass94_951 = GameString.create("Interfaces charg-Bes");
  public static int anInt952;
  public static int anInt963;
  public static GameString aClass94_957 = FileTable.aClass94_948;
  public int[][] unpackedNames;
  public int[] anIntArray945;
  public int anInt947;
  public LinearHashTable fileNameTable;
  public int[] anIntArray953;
  public int[] unpackedLengths;
  public int[] anIntArray955;
  public int[] unpackedSizes;
  public int[] anIntArray958;
  public int[][] unpackedIds;
  public int anInt960;
  public int version;
  public LinearHashTable[] childNameTables;
  public int checksum;


  public FileTable(byte[] var1, int var2 ) {
    this.checksum = DummyClass35.getChecksum(var1, var1.length, false);
      if (var2 == this.checksum) {
        this.parse(2, var1);
      } else {
        throw new RuntimeException();
      }
  }

  private void parse(int var1, byte[] var2) {
    Buffer var3 = new Buffer(ClientScriptEnum.method623((byte) -114, var2));
      int var4 = var3.readUnsignedByte();
      if (var4 != 5 && ~var4 != -7) {
        throw new RuntimeException();
      } else {
        if ((var4 >= 7 -1)) {
          this.version = var3.readInt();
        } else {
          this.version = 0;
        }

        int var5 = var3.readUnsignedByte();
        int var6 = 0;
        this.anInt947 = var3.readUnsignedShort();
        int var7 = -1;
        this.anIntArray953 = new int[this.anInt947];

        int var8;
        for (var8 = 0; this.anInt947 > var8; ++var8) {
          this.anIntArray953[var8] = var6 += var3.readUnsignedShort();
          if (this.anIntArray953[var8] > var7) {
            var7 = this.anIntArray953[var8];
          }
        }

        this.anInt960 = var7 - -1;
        this.anIntArray958 = new int[this.anInt960];
        this.unpackedIds = new int[this.anInt960][];
        this.anIntArray945 = new int[this.anInt960];
        this.unpackedLengths = new int[this.anInt960];
        this.unpackedSizes = new int[this.anInt960];
        if (~var5 != -1) {
          this.anIntArray955 = new int[this.anInt960];

          for (var8 = 0; ~var8 > ~this.anInt960; ++var8) {
            this.anIntArray955[var8] = -1;
          }

          for (var8 = 0; ~var8 > ~this.anInt947; ++var8) {
            this.anIntArray955[this.anIntArray953[var8]] = var3.readInt();
          }

          this.fileNameTable = new LinearHashTable(this.anIntArray955);
          for (int x = 0; x < 255; x++) {
            for (int y = 0; y < 255; y++) {
              String a = "l" + x + "_" + y;
              int i = this.fileNameTable.get(Djb2.djb2(a));
              if (i != -1) {
                System.out.println("{" + i + ", " + x + ", " + y + "},");
              }
            }
          }
        }

        for (var8 = 0; this.anInt947 > var8; ++var8) {
          this.anIntArray945[this.anIntArray953[var8]] = var3.readInt();
        }

        for (var8 = 0; this.anInt947 > var8; ++var8) {
          this.anIntArray958[this.anIntArray953[var8]] = var3.readInt();
        }

        var8 = 0;
        if (var1 != 2) {
          FileTable.aClass94_957 = null;
        }

        while (this.anInt947 > var8) {
          this.unpackedSizes[this.anIntArray953[var8]] = var3.readUnsignedShort();
          ++var8;
        }

        int entryId;
        int var10;
        int maximumId;
        int var12;
        for (var8 = 0; ~var8 > ~this.anInt947; ++var8) {
          var6 = 0;
          entryId = this.anIntArray953[var8];
          var10 = this.unpackedSizes[entryId];
          maximumId = -1;
          this.unpackedIds[entryId] = new int[var10];

          for (var12 = 0; var10 > var12; ++var12) {
            int id = this.unpackedIds[entryId][var12] = var6 += var3.readUnsignedShort();
            if (id > maximumId) {
              maximumId = id;
            }
          }

          this.unpackedLengths[entryId] = maximumId + 1;
          if (~(1 + maximumId) == ~var10) {
            this.unpackedIds[entryId] = null;
          }
        }

        if (~var5 != -1) {
          this.childNameTables = new LinearHashTable[var7 - -1];
          this.unpackedNames = new int[1 + var7][];

          for (var8 = 0; var8 < this.anInt947; ++var8) {
            entryId = this.anIntArray953[var8];
            var10 = this.unpackedSizes[entryId];
            this.unpackedNames[entryId] = new int[this.unpackedLengths[entryId]];

            for (maximumId = 0; maximumId < this.unpackedLengths[entryId]; ++maximumId) {
              this.unpackedNames[entryId][maximumId] = -1;
            }

            for (maximumId = 0; ~maximumId > ~var10; ++maximumId) {
              if (this.unpackedIds[entryId] != null) {
                var12 = this.unpackedIds[entryId][maximumId];
              } else {
                var12 = maximumId;
              }

              this.unpackedNames[entryId][var12] = var3.readInt();
            }

            this.childNameTables[entryId] = new LinearHashTable(
                this.unpackedNames[entryId]);
          }
        }

      }
  }

  public static void method1223(int var0) {
    FileTable.aClass94_951 = null;
      FileTable.aClass94_946 = null;
      if (var0 == 0) {
        FileTable.aClass94_948 = null;
        FileTable.aClass94_957 = null;
      }
  }

  public static void method1224(Widget var0, int var1, int var2, int var3) {
    if (var0.aByte162 == 0) {
        var0.anInt210 = var0.anInt166;
      } else {
        if (var0.aByte162 == 1) {
          var0.anInt210 = (var2 - var0.anInt193) / 2 + var0.anInt166;
        } else {
          if (var0.aByte162 == 2) {
            var0.anInt210 = var2 - var0.anInt193 - var0.anInt166;
          } else if (var0.aByte162 != 3) {
            if (var0.aByte162 == 4) {
              var0.anInt210 =
                  (var2 * var0.anInt166 >> 14) + (-var0.anInt193 + var2) / 2;
            } else {
              var0.anInt210 =
                  -(var2 * var0.anInt166 >> 14) + -var0.anInt193 + var2;
            }
          } else {
            var0.anInt210 = var0.anInt166 * var2 >> 14;
          }
        }
      }

      if (var0.aByte273 == 0) {
        var0.anInt306 = var0.anInt316;
      } else if (~var0.aByte273 != -2) {
        if (var0.aByte273 == 2) {
          var0.anInt306 = -var0.anInt316 + -var0.anInt168 + var3;
        } else if (var0.aByte273 != 3) {
          if (var0.aByte273 == 4) {
            var0.anInt306 =
                (var0.anInt316 * var3 >> 14) + (var3 - var0.anInt168) / 2;
          } else {
            var0.anInt306 =
                -(var3 * var0.anInt316 >> 14) + var3 + -var0.anInt168;
          }
        } else {
          var0.anInt306 = var0.anInt316 * var3 >> 14;
        }
      } else {
        var0.anInt306 = var0.anInt316 + (var3 - var0.anInt168) / 2;
      }

      if (LinearHashTable.aBoolean1040 && (GameClient.method44(var0).anInt2205 != 0
        || ~var0.anInt187 == -1)) {
        if (~var0.anInt210 > -1) {
          var0.anInt210 = 0;
        } else if (var0.anInt193 + var0.anInt210 > var2) {
          var0.anInt210 = var2 + -var0.anInt193;
        }

        if (var0.anInt306 < 0) {
          var0.anInt306 = 0;
        } else if (var3 < var0.anInt306 - -var0.anInt168) {
          var0.anInt306 = var3 + -var0.anInt168;
        }
      }

      if (var1 != 23730) {
        FileTable.method1223(19);
      }
  }

  public static void method1225(int var0) {
    Mouse var1 = Mouse.INSTANCE;
      synchronized (var1) {
        if (var0 != 18074) {
          FileTable.aClass94_946 = null;
        }

        TextureSampler21.anInt3069 = SpotAnimationConfig.anInt549;
        SomethingTilek.anInt1676 = SomethingWorldMappy.lastMouseX;
        HashTable.anInt1709 = DummyClass53.lastMouseY;
        Structure.anInt3644 = GameObject.anInt2743;
        DummyClass5.anInt2993 = RenderAnimation.anInt362;
        ++ObjectNode.anInt4045;
        DummyClass36.anInt2614 = TextureSampler14.anInt3389;
        AbstractSomethingTexture.aLong1102 = Projectile.lastMousePressedTime;
        GameObject.anInt2743 = 0;
      }
  }

}
