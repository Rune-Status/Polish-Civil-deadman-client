package com.jagex.runescape.done;

import com.jagex.runescape.*;
import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.ArrayUtils;
import com.jagex.runescape.common.GameString;

public final class FileUnpacker {

  private boolean aBoolean1945;
  private final boolean aBoolean1946;
  private final AbstractFileRequester aClass151_1947;
  private FileTable table;
  private Object[][] buffers;
  private Object[] anObjectArray1954;


  public FileUnpacker(AbstractFileRequester var1, boolean var2, boolean var3 ) {
    this.aClass151_1947 = var1;
      this.aBoolean1945 = var2;
      this.aBoolean1946 = var3;
  }

  public boolean method2113(byte var1 ) {
    if (this.method2122()) {
        if (var1 <= 15) {
          this.method2113((byte) 39);
        }

        boolean var2 = true;

        for (int var3 = 0; (var3 < this.table.anIntArray953.length); ++var3) {
          int var4 = this.table.anIntArray953[var3];
          if (this.anObjectArray1954[var4] == null) {
            this.method2134(false, var4);
            if (this.anObjectArray1954[var4] == null) {
              var2 = false;
            }
          }
        }

        return var2;
      } else {
        return false;
      }
  }

  private int method2114(int var1, int var2) {
    if (this.method2130(false, var1)) {
        if (var2 != 0) {
          this.method2115(36, false, true);
        }

        return this.anObjectArray1954[var1] != null ?
            100 :
            this.aClass151_1947.method2097(var1, '\uffff');
      } else {
        return 0;
      }
  }

  public void method2115(int var1, boolean var2, boolean var3 ) {
    int var4 = 9 / ((var1 - 35) / 44);
      if (this.method2122()) {
        if (var2) {
          this.table.anIntArray955 = null;
          this.table.fileNameTable = null;
        }

        if (var3) {
          this.table.childNameTables = null;
          this.table.unpackedNames = null;
        }

      }
  }

  public int method2116(int var1, GameString var2 ) {
    if (this.method2122()) {
        var2 = var2.method1534();
        if (var1 == 22813) {
          int var3 = this.table.fileNameTable.get(var2.getDbj2Hash(false));
          return this.method2114(var3, 0);
        } else {
          return -12;
        }
      } else {
        return 0;
      }
  }

  public boolean method2117(int var1, int var2 ) {
    if (var1 >= -88) {
        this.aBoolean1945 = true;
      }

      if (this.method2130(false, var2)) {
        if (this.anObjectArray1954[var2] == null) {
          this.method2134(false, var2);
          return this.anObjectArray1954[var2] != null;
        } else {
          return true;
        }
      } else {
        return false;
      }
  }

  public int getTableChecksum() {
    if (this.method2122()) {
        return this.table.checksum;
      } else {
        throw new IllegalStateException("");
      }
  }

  public int getFileId(GameString var1 ) {
    if (this.method2122()) {
        var1 = var1.method1534();
        int var3 = this.table.fileNameTable.get(var1.getDbj2Hash(false));
        return this.method2130(false, var3) ? (var3) : -1;
      } else {
        return -1;
      }
  }

  public int method2121(int var1 ) {
    if (this.method2122()) {
        if (var1 != 0) {
          this.method2139(45, 104, -3);
        }

        return this.table.unpackedLengths.length;
      } else {
        return -1;
      }
  }

  private boolean method2122() {
    if (this.table == null) {
        this.table = this.aClass151_1947.method2094(0);
        if (this.table == null) {
          return false;
        }

        this.buffers = new Object[this.table.anInt960][];
        this.anObjectArray1954 = new Object[this.table.anInt960];
      }

      return true;
  }

  public byte[] method2123(int var1,GameString var2,GameString var3 ) {
    if (this.method2122()) {
        var3 = var3.method1534();
        var2 = var2.method1534();
        int var4 = this.table.fileNameTable.get(var3.getDbj2Hash(false));
        if (var1 != 0) {
          this.table = null;
        }

        if (this.method2130(false, var4)) {
          int var5 = this.table.childNameTables[var4]
              .get(var2.getDbj2Hash(false));
          return this.getBytes(var4, var5);
        } else {
          return null;
        }
      } else {
        return null;
      }
  }

  public void method2124(int var1,GameString var2 ) {
    if (this.method2122()) {
        var2 = var2.method1534();
        int var3 = this.table.fileNameTable.get(var2.getDbj2Hash(false));
        this.method2131(119, var3);
        int var4 = 123 % ((var1 + 60) / 62);
      }
  }

  public boolean method2125(GameString var1, byte var2,GameString var3 ) {
    if (this.method2122()) {
        var3 = var3.method1534();
        var1 = var1.method1534();
        int var4 = this.table.fileNameTable.get(var3.getDbj2Hash(false));
        if (this.method2130(false, var4)) {
          int var5 = this.table.childNameTables[var4]
              .get(var1.getDbj2Hash(false));
          if (var2 != 116) {
            this.aBoolean1945 = true;
          }

          return this.method2129((byte) 70, var5, var4);
        } else {
          return false;
        }
      } else {
        return false;
      }
  }

  public byte[] unpack(int fileId, int[] var2, int var3, int childId ) {
    if (this.method2139(fileId, 0, childId)) {
        if (this.buffers[fileId] == null
            || this.buffers[fileId][childId] == null) {
          boolean var5 = this.method2132(fileId, false, var2);
          if (!var5) {
            this.method2134(false, fileId);
            var5 = this.method2132(fileId, false, var2);
            if (!var5) {
              return null;
            }
          }
        }

        if (var3 < 35) {
          return null;
        } else {
          byte[] var7 = GlobalStatics_9
              .method1985(-119, this.buffers[fileId][childId], false);
          if (this.aBoolean1946) {
            this.buffers[fileId][childId] = null;
            if (this.table.unpackedLengths[fileId] == 1) {
              this.buffers[fileId] = null;
            }
          }

          return var7;
        }
      } else {
        return null;
      }
  }

  public boolean method2127(byte var1,GameString var2 ) {
    if (this.method2122()) {
        var2 = var2.method1534();
        int var3 = this.table.fileNameTable.get(var2.getDbj2Hash(false));
        return var1 != -83 || this.method2117(-104, var3);
      } else {
        return false;
      }
  }

  public void method2128(int var1, int var2 ) {
    if (var1 == 7561) {
        if (this.method2130(false, var2)) {
          if (this.buffers != null) {
            this.buffers[var2] = null;
          }

        }
      }
  }

  public boolean method2129(byte var1, int var2, int var3 ) {
    int var4 = 78 / ((-10 - var1) / 59);
      if (this.method2139(var3, 0, var2)) {
        if (this.buffers[var3] != null && this.buffers[var3][var2] != null) {
          return true;
        } else if (this.anObjectArray1954[var3] == null) {
          this.method2134(false, var3);
          return this.anObjectArray1954[var3] != null;
        } else {
          return true;
        }
      } else {
        return false;
      }
  }

  private boolean method2130(boolean var1, int var2) {
    if (var1) {
        GlobalStatics_8.aBoolean1951 = false;
      }

      if (this.method2122()) {
        if (var2 >= 0 && this.table.unpackedLengths.length > var2
          && (this.table.unpackedLengths[var2] != 0)) {
          return true;
        } else if (!DummyClass21.aBoolean1765) {
          return false;
        } else {
          throw new IllegalArgumentException(Integer.toString(var2));
        }
      } else {
        return false;
      }
  }

  private void method2131(int var1, int var2) {
    this.aClass151_1947.method2095(var2, 127);
      if (var1 < 101) {
        this.method2132(53, false, null);
      }
  }

  private boolean method2132(int var1, boolean var2, int[] var3) {
    if (!this.method2130(var2, var1)) {
        return false;
      } else if (this.anObjectArray1954[var1] == null) {
        return false;
      } else {
        int[] var5 = this.table.unpackedIds[var1];
        int var4 = this.table.unpackedSizes[var1];
        if (this.buffers[var1] == null) {
          this.buffers[var1] = new Object[this.table.unpackedLengths[var1]];
        }

        boolean var7 = true;
        Object[] var6 = this.buffers[var1];

        for (int var8 = 0; var8 < var4; ++var8) {
          int var9;
          if (var5 == null) {
            var9 = var8;
          } else {
            var9 = var5[var8];
          }

          if (var6[var9] == null) {
            var7 = false;
            break;
          }
        }

        if (var7) {
          return true;
        } else {
          byte[] var21;
          if (var3 != null && ((var3[0] != 0) || (var3[1] != 0) || var3[2] != 0
              || var3[3] != 0)) {
            var21 = GlobalStatics_9.method1985(-124, this.anObjectArray1954[var1], true);
            Buffer var22 = new Buffer(var21);
            var22.method770(var3, 120, 5, var22.bytes.length);
          } else {
            var21 = GlobalStatics_9.method1985(-128, this.anObjectArray1954[var1], false);
          }

          byte[] var23;
          try {
            var23 = GlobalStatics_7.method623((byte) -125, var21);
          } catch (RuntimeException var19) {
            assert var21 != null;
            throw GlobalStatics_4.cascadeException(var19,
              "T3 - " + (var3 != null) + "," + var1 + "," + var21.length + ","
                + DummyClass35.getChecksum(var21, var21.length, false) + ","
                + DummyClass35.getChecksum(var21, var21.length - 2, false) + ","
                + this.table.anIntArray945[var1] + "," + this.table.checksum);
          }

          if (this.aBoolean1945) {
            this.anObjectArray1954[var1] = null;
          }

          int var10;
          if (var4 > 1) {
            var10 = var23.length;
            --var10;
            int var11 = 255 & var23[var10];
            if (var11 > 1) {
              int a = 5;
            }
            var10 -= var4 * var11 * 4;
            Buffer var12 = new Buffer(var23);
            var12.position = var10;
            int[] var13 = new int[var4];

            int var15;
            int var16;
            for (int var14 = 0; (var14 < var11); ++var14) {
              var15 = 0;

              for (var16 = 0; var4 > var16; ++var16) {
                var15 += var12.readInt();

                var13[var16] += var15;
              }
            }

            byte[][] var24 = new byte[var4][];

            for (var15 = 0; (var15 < var4); ++var15) {
              var24[var15] = new byte[var13[var15]];
              var13[var15] = 0;
            }

            var12.position = var10;
            var15 = 0;

            int var17;
            for (var16 = 0; (var16 < var11); ++var16) {
              var17 = 0;

              for (int var18 = 0; var4 > var18; ++var18) {
                var17 += var12.readInt();
                ArrayUtils.copy(var23, var15, var24[var18], var13[var18], var17);
                var15 += var17;
                var13[var18] += var17;
              }
            }

            for (var16 = 0; var4 > var16; ++var16) {
              if (var5 != null) {
                var17 = var5[var16];
              } else {
                var17 = var16;
              }

              if (this.aBoolean1946) {
                var6[var17] = var24[var16];
              } else {
                var6[var17] = GlobalStatics_2.method890(false, -114, var24[var16]);
              }
            }
          } else {
            if (var5 != null) {
              var10 = var5[0];
            } else {
              var10 = 0;
            }

            if (this.aBoolean1946) {
              var6[var10] = var23;
            } else {
              var6[var10] = GlobalStatics_2.method890(false, -80, var23);
            }
          }

          return true;
        }
      }
  }

  public byte[] getBytes(int fileId, int childId ) {
    return this.unpack(fileId, null, 52, childId);
  }

  private void method2134(boolean var1, int var2) {
    if (this.aBoolean1945) {
        this.anObjectArray1954[var2] = this.aClass151_1947.method2098(var2, 0);
      } else {
        this.anObjectArray1954[var2] =
            GlobalStatics_2.method890(false, -101, this.aClass151_1947
                .method2098(var2, 0));
      }

      if (var1) {
        this.aBoolean1945 = false;
      }
  }

  public boolean method2135(GameString var1, int var2 ) {
    if (var2 >= -103) {
        return false;
      } else if (this.method2122()) {
        var1 = var1.method1534();
        int var3 = this.table.fileNameTable.get(var1.getDbj2Hash(false));
        return (var3 >= 0);
      } else {
        return false;
      }
  }

  public int method2136(byte var1 ) {
    if (var1 > -121) {
        GlobalStatics_8.sunColor = -3;
      }

      if (this.method2122()) {
        int var2 = 0;
        int var3 = 0;

        int var4;
        for (var4 = 0; var4 < this.anObjectArray1954.length; ++var4) {
          if (this.table.unpackedSizes[var4] > 0) {
            var2 += 100;
            var3 += this.method2114(var4, 0);
          }
        }

        if (var2 == 0) {
          return 100;
        } else {
          var4 = var3 * 100 / var2;
          return var4;
        }
      } else {
        return 0;
      }
  }

  public void method2137(byte var1 ) {
    if (var1 != 56) {
        this.buffers = null;
      }

      if (this.buffers != null) {
        for (int var2 = 0; this.buffers.length > var2; ++var2) {
          this.buffers[var2] = null;
        }
      }
  }

  public byte[] getBytes(int var1 ) {
    if (!this.method2122()) {
        return null;
      } else if ((this.table.unpackedLengths.length == 1)) {
        return this.getBytes(0, var1);
      } else if (!this.method2130(false, var1)) {
        return null;
      } else if ((this.table.unpackedLengths[var1] != 1)) {

        throw new RuntimeException();

      } else {
        return this.getBytes(var1, 0);
      }
  }

  private boolean method2139(int var1, int var2, int var3) {
    if (this.method2122()) {
        if (var2 <= var1 && (var3 >= 0) && this.table.unpackedLengths.length > var1
          && this.table.unpackedLengths[var1] > var3) {
          return true;
        } else if (!DummyClass21.aBoolean1765) {
          return false;
        } else {
          throw new IllegalArgumentException(var1 + "," + var3);
        }
      } else {
        return false;
      }
  }

  public byte[] getBytes(int var1, int var2, int var3 ) {
    if (this.method2139(var2, var3 + var3, var1)) {
        if (this.buffers[var2] == null || this.buffers[var2][var1] == null) {
          boolean var4 = this.method2132(var2, false, null);
          if (!var4) {
            this.method2134(false, var2);
            var4 = this.method2132(var2, false, null);
            if (!var4) {
              return null;
            }
          }
        }

        byte[] var6 = GlobalStatics_9.method1985(-126, this.buffers[var2][var1], false);
        return var6;
      } else {
        return null;
      }
  }

  public int[] getChildIds(byte var1, int var2 ) {
    if (var1 != -128) {
        GlobalStatics_8.updateMemoryCounter = -69;
      }

      if (this.method2130(false, var2)) {
        int[] var3 = this.table.unpackedIds[var2];
        if (var3 == null) {
          var3 = new int[this.table.unpackedSizes[var2]];

          for (int var4 = 0; var3.length > var4; var3[var4] = var4++) {
          }
        }

        return var3;
      } else {
        return null;
      }
  }

  public int getAmountChildren(int var1, byte var2 ) {
    if (this.method2130(false, var1)) {
        if (var2 <= 60) {
          this.method2122();
        }

        return this.table.unpackedLengths[var1];
      } else {
        return 0;
      }
  }

  public boolean isLoaded(int fileId ) {
    if (!this.method2122()) {
        return false;
      } else if ((this.table.unpackedLengths.length == 1)) {
        return this.method2129((byte) 86, fileId, 0);
      } else if (this.method2130(false, fileId)) {
        if (this.table.unpackedLengths[fileId] == 1) {
          return this.method2129((byte) 109, 0, fileId);
        } else {
          throw new RuntimeException();
        }
      } else {
        return false;
      }
  }

}
