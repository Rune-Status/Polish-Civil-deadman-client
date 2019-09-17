package com.jagex.runescape.common;

public final class GameStringStatics {

  public static int[] anIntArray2004 = {
      0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
      21, 22, 23, 24, 25,
      26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43,
      44, 45, 46, 47, 48, 49,
      50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74,
      76, 78, 83, 84, 85, 86,
      91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116,
      118, 119, 120, 121,
      122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153,
      154, 155, 157, 163,
      164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185,
      186, 187, 188, 189,
      190, 191, 192, 193, 194, 195, 196, 197, 97, 199, 200, 201, 202, 203, 204,
      205, 206, 207, 208,
      209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220, 221, 222, 223,
      224, 225, 226, 227,
      228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242,
      243, 244, 245, 246,
      247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87,
      87, 77, 96, 98, 98,
      98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126,
      126, 126, 126, 125, 135,
      139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158,
      253, 254, 170, 170,
      170, 170, 178, 255, 178
  };
  public static HashTable aClass130_1194;
  public static GameString aClass94_1760 = GameStringStatics.create("");
  public static byte[] aByteArray4005 = {
      (byte) 95, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101,
      (byte) 102, (byte) 103,
      (byte) 104, (byte) 105, (byte) 106, (byte) 107, (byte) 108, (byte) 109,
      (byte) 110, (byte) 111,
      (byte) 112, (byte) 113, (byte) 114, (byte) 115, (byte) 116, (byte) 117,
      (byte) 118, (byte) 119,
      (byte) 120, (byte) 121, (byte) 122, (byte) 48, (byte) 49, (byte) 50,
      (byte) 51, (byte) 52,
      (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57
  };

  public static GameString createString(byte[] bytes, int off, int len) {
    GameString string = new GameString();
    string.bytes = new byte[len];
    string.length = 0;

    for (int i = off; i < len + off; i++) {
      if (bytes[i] != 0) {
        string.bytes[string.length++] = bytes[i];
      }
    }
    return string;
  }

  public static GameString createString(int len) {
    GameString str = new GameString();
    str.length = 0;
    str.bytes = new byte[len];
    return str;
  }

  public static GameString stringFromBase37(int var0, long var1) {
    if (var1 > 0L && var1 < 6582952005840035281L) {
      if (var1 % 37L == 0L) {
        return null;
      } else {
        int var3 = 0;

        for (long var4 = var1; var4 != 0L; ++var3) {
          var4 /= 37L;
        }

        byte[] var6 = new byte[var3];

        while (var1 != 0L) {
          long var7 = var1;
          var1 /= 37L;
          --var3;
          var6[var3] = GameStringStatics.aByteArray4005[(int) (-(var1 * 37L) + var7)];
        }

        GameString var10 = new GameString();
        var10.bytes = var6;
        var10.length = var6.length;
        return var10;
      }
    } else {
      return null;
    }
  }

  public static boolean method2103(int var0, int var1) {
    return var1 >= -78 || var0 == 198 || var0 == 230 || var0 == 156
        || var0 == 140 || var0 == 223;
  }

  public static GameString create(String string) {
    byte[] bytes = string.getBytes();
    int len = bytes.length;
    GameString str = new GameString();
    int i = 0;
    str.bytes = new byte[len];

    while (len > i) {
      int ch = bytes[i++] & 255;
      // Special case for symbols: ()*+,-
      if (ch >= 40 && ch <= 45) {
        if (i >= len) {
          break;
        }
        // 0-9
        int offset = bytes[i++] & 255;
        str.bytes[str.length++] = (byte) (offset - 48 + 43 * (ch - 40));
      } else if (ch != 0) {
        str.bytes[str.length++] = (byte) ch;
      }
    }
    str.pack();
    return str.cache();
  }
}
