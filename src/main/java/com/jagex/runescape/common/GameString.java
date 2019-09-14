package com.jagex.runescape.common;

import java.awt.FontMetrics;
import java.awt.Graphics;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public final class GameString {

  public byte[] bytes;
  public int length;
  private boolean immutable = true;

  public URL method1527(boolean var1) {
    if (var1) {
      this.method1548(true, 22);
    }

    try {
      return new URL(new String(this.bytes, 0, this.length));
    } catch (MalformedURLException e) {
      throw new RuntimeException(e);
    }
  }

  public boolean method1528(byte var1, GameString var2) {
    if (var2 == null) {
      return false;
    } else if (this == var2) {
      return true;
    } else if (this.length != var2.length) {
      return false;
    } else {
      if (var1 != -42) {
        this.method1568(-127);
      }

      byte[] var4 = var2.bytes;
      byte[] var3 = this.bytes;

      for (int var5 = 0; this.length > var5; ++var5) {
        if (var3[var5] != var4[var5]) {
          return false;
        }
      }

      return true;
    }
  }

  public int method1530(byte var1, int var2) {
    if (var2 < 1 || (var2 > 36)) {
      var2 = 10;
    }

    boolean var3 = false;
    boolean var4 = false;
    int var5 = 0;
    int var6 = 0;

    for (int var7 = 29 / ((-47 - var1) / 37); this.length > var6; ++var6) {
      int var8 = 255 & this.bytes[var6];
      if ((var6 == 0)) {
        if (var8 == 45) {
          var3 = true;
          continue;
        }

        if (var8 == 43) {
          continue;
        }
      }

      if (var8 >= 48 && var8 <= 57) {
        var8 -= 48;
      } else if (var8 >= 65 && (var8 <= 90)) {
        var8 -= 55;
      } else {
        if ((var8 < 97) || (var8 > 122)) {
          throw new NumberFormatException();
        }

        var8 -= 87;
      }

      if ((var2 <= var8)) {
        throw new NumberFormatException();
      }

      if (var3) {
        var8 = -var8;
      }

      int var9 = var8 + var5 * var2;
      if (var9 / var2 != var5) {
        throw new NumberFormatException();
      }

      var5 = var9;
      var4 = true;
    }

    if (var4) {
      return var5;
    } else {
      throw new NumberFormatException();
    }
  }

  public boolean method1531(GameString var2) {
    if (var2 == null) {
      return false;
    } else if (this.length != var2.length) {
      return false;
    } else {
      for (int var3 = 0; this.length > var3; ++var3) {
        byte var5 = (byte) (this.bytes[var3] & 0xff);
        if ((var5 >= 65) && (var5 <= 90)) {
          var5 = (byte) (var5 + 32);
        }

        byte var6 = (byte) (var2.bytes[var3] & 0xff);
        if (var6 >= 65 && (var6 <= 90)) {
          var6 = (byte) (var6 + 32);
        }

        if ((var5 != var6)) {
          return false;
        }
      }

      return true;
    }
  }

  public void method1532(int var1, int var2, Graphics var3, byte var4) {
    if (var4 < -85) {
      String var5;
      var5 = new String(this.bytes, 0, this.length,
          StandardCharsets.ISO_8859_1);

      var3.drawString(var5, var2, var1);
    }
  }

  public GameString append(GameString var1) {
    if (this.immutable) {
      if (var1.length + this.length > this.bytes.length) {
        int var3;
        for (var3 = 1; (var1.length + this.length) > var3; var3 += var3) {
        }

        byte[] temp = new byte[var3];
        ArrayUtils.copy(this.bytes, 0, temp, 0, this.length);
        this.bytes = temp;
      }

      ArrayUtils.copy(var1.bytes, 0, this.bytes, this.length, var1.length);
      this.length += var1.length;
      return this;

    } else {
      throw new IllegalArgumentException();
    }
  }

  public GameString method1534() {
    GameString var2 = new GameString();
    var2.length = this.length;
    var2.bytes = new byte[this.length];

    for (int var3 = 0; this.length > var3; ++var3) {
      byte var4 = (byte) (this.bytes[var3] & 0xff);
      if (var4 >= 65 && var4 <= 90) {
        var4 = (byte) (var4 + 32);
      }

      var2.bytes[var3] = var4;
    }

    return var2;
  }

  public GameString format(int var1) {
    byte var3 = 2;
    GameString var2 = new GameString();
    var2.length = this.length;
    if (var1 < 67) {
      return null;
    } else {
      var2.bytes = new byte[this.length];

      for (int var4 = 0; this.length > var4; ++var4) {
        byte var5 = this.bytes[var4];
        if (((var5 < 97) || var5 > 122) &&
            ((var5 < 31) || (var5 > 1) || var5 == -9)) {
          if ((var5 < 65 || (var5 > 90)) &&
              (var5 < -64 || var5 > -34 || ~var5 == 40)) {
            if ((var5 != 46) && var5 != 33 && var5 != 63) {
              if (var5 == 32) {
                if (var3 != 2) {
                  var3 = 1;
                }
              } else {
                var3 = 1;
              }
            } else {
              var3 = 2;
            }
          } else {
            if (var3 == 0) {
              var5 = (byte) (var5 + 32);
            }

            var3 = 0;
          }
        } else {
          if (var3 == 2) {
            var5 = (byte) (var5 - 32);
          }

          var3 = 0;
        }

        var2.bytes[var4] = var5;
      }

      return var2;
    }
  }

  public long hash() {
    long var2 = 0L;

    for (int var4 = 0; var4 < this.length; ++var4) {
      var2 = (this.bytes[var4] & 255) + (var2 << 5) - var2;
    }

    return var2;
  }

  public int getLength() {
    return this.length;
  }

  public GameString method1542(int var1, GameString var2, int var3,
      int var4) {
    if (!this.immutable) {
      throw new IllegalArgumentException();
    } else if (var3 >= 0 && var3 <= var4 && (var4 <= var2.length)) {
      if (this.length + (var4 - var3) > this.bytes.length) {
        int var5;
        for (var5 = 1; (this.length + var2.length) > var5; var5 += var5) {
        }

        byte[] var6 = new byte[var5];
        ArrayUtils.copy(this.bytes, 0, var6, 0, this.length);
        this.bytes = var6;
      }

      ArrayUtils.copy(var2.bytes, var3, this.bytes, this.length,
          -var3 + var4);
      this.length += var4 - var3;
      return this;
    } else {
      throw new IllegalArgumentException();
    }
  }

  public boolean method1543(int var1) {
    if (var1 < 79) {
      this.toInteger();
    }

    return this.method1561(10, true);
  }

  public GameString method1544(boolean var1) {
    GameString var2 = new GameString();
    var2.length = this.length;
    var2.bytes = new byte[var2.length];
    if (var1) {
      for (int var3 = 0; this.length > var3; ++var3) {
        var2.bytes[this.length - var3 - 1] = this.bytes[var3];
      }

      return var2;
    } else {
      return null;
    }
  }

  public GameString formatName(byte var1) {
    GameString var2 = new GameString();
    var2.length = this.length;
    var2.bytes = new byte[this.length];
    boolean var3 = true;
    int var4 = 0;
    if (var1 != -50) {
      this.toString();
    }

    for (; this.length > var4; ++var4) {
      byte var5 = this.bytes[var4];
      if ((var5 == 95)) {
        var3 = true;
        var2.bytes[var4] = 32;
      } else {
        if (var5 >= 97 && var5 <= 122 && var3) {
          var3 = false;
          var2.bytes[var4] = (byte) (-32 + var5);
        } else {
          var2.bytes[var4] = var5;
          var3 = false;
        }
      }
    }

    return var2;
  }

  public int method1546(byte var1, GameString var2) {
    int var3 = 0;
    int var4 = 0;
    int var6 = var2.length;
    int var5 = this.length;
    int var7 = this.length;
    int var8 = var2.length;
    int var9 = 0;
    int var10 = 0;

    while ((var5 != 0) && var6 != 0) {
      if ((var3 != 156) && var3 != 230) {
        if (var3 != 140 && (var3 != 198)) {
          if (var3 == 223) {
            var3 = 115;
          } else {
            var3 = this.bytes[var9] & 255;
            ++var9;
          }
        } else {
          var3 = 69;
        }
      } else {
        var3 = 101;
      }

      if (GameStringStatics.method2103(var3, -116)) {
        ++var7;
      } else {
        --var5;
      }

      if (var4 != 156 && var4 != 230) {
        if ((var4 != 140) && (var4 != 198)) {
          if (var4 == 223) {
            var4 = 115;
          } else {
            var4 = 255 & var2.bytes[var10];
            ++var10;
          }
        } else {
          var4 = 69;
        }
      } else {
        var4 = 101;
      }

      if (GameStringStatics.method2103(var4, -86)) {
        ++var8;
      } else {
        --var6;
      }

      if ((GameStringStatics.anIntArray2004[var3]
          < GameStringStatics.anIntArray2004[var4])) {
        return -1;
      }

      if ((GameStringStatics.anIntArray2004[var4]
          < GameStringStatics.anIntArray2004[var3])) {
        return 1;
      }
    }

    return var8 <= var7 ? (var7 > var8 ? 1 : 0) : -1;
  }

  public GameString method1548(boolean var1, int var2) {
    if ((var2 > 0) && (var2 <= 255)) {
      GameString var3 = new GameString();
      var3.bytes = new byte[1 + this.length];
      var3.length = this.length + 1;
      ArrayUtils.copy(this.bytes, 0, var3.bytes, 0, this.length);
      var3.bytes[this.length] = (byte) var2;
      return var3;
    } else {
      throw new IllegalArgumentException("invalid char");
    }
  }

  public void method1549(boolean var1) {
    String var2;
    if (var1) {
      return;
    }

    var2 = new String(this.bytes, 0, this.length,
        StandardCharsets.ISO_8859_1);

    System.out.println(var2);
  }

  public boolean endsWith(GameString var2) {
    if (var2.length > this.length) {
      return false;
    }
    int diff = this.length - var2.length;
    for (int off = 0; off < var2.length; off++) {
      if (this.bytes[diff + off] != var2.bytes[off]) {
        return false;
      }
    }

    return true;
  }

  public int indexOf(GameString var1) {
    return this.indexOf(var1, 0, -1);
  }

  public int toInteger() {
    return this.method1530((byte) -114, 10);
  }

  public void method1553(int var1, boolean var2) {
    if (!this.immutable) {
      throw new IllegalArgumentException();
    } else if ((var1 < 0)) {
      throw new IllegalArgumentException();
    } else {
      int var3;
      if (var1 > this.bytes.length) {
        for (var3 = 1; (var3 < var1); var3 += var3) {
        }

        byte[] var4 = new byte[var3];
        ArrayUtils.copy(this.bytes, 0, var4, 0, this.length);
        this.bytes = var4;
      }

      for (var3 = this.length; (var3 < var1); ++var3) {
        this.bytes[var3] = 32;
      }

      this.length = var1;
    }
  }

  public void method1554(boolean var1) {

  }

  public int method1555(int var1, int var2, int var3) {
    byte var4 = (byte) var1;
    if (var3 == 1536) {
      for (int var5 = var2; (var5 < this.length); ++var5) {
        if (this.bytes[var5] == var4) {
          return var5;
        }
      }

      return -1;
    } else {
      return 123;
    }
  }

  public GameString substring(int var1) {
    return this.substring(this.length, 0, var1);
  }

  public GameString substring(int var1, int var2, int var3) {
    GameString var4 = new GameString();
    var4.length = -var3 + var1;
    var4.bytes = new byte[-var3 + var1];
    ArrayUtils.copy(this.bytes, var3, var4.bytes, var2, var4.length);
    return var4;
  }

  public boolean method1558(GameString var1, int var2) {
    if ((this.length >= var1.length)) {
      for (int var3 = var2; var3 < var1.length; ++var3) {
        if ((this.bytes[var3] != var1.bytes[var3])) {
          return false;
        }
      }

      return true;
    } else {
      return false;
    }
  }

  public int method1559(GameString var1, int var2) {
    if (var2 != -1) {
      this.method1544(true);
    }

    int var3;
    if (var1.length < this.length) {
      var3 = var1.length;
    } else {
      var3 = this.length;
    }

    for (int var4 = 0; var3 > var4; ++var4) {
      if ((255 & this.bytes[var4]) < (var1.bytes[var4] & 255)) {
        return -1;
      }

      if (((var1.bytes[var4] & 255) < (this.bytes[var4] & 255))) {
        return 1;
      }
    }

    if (var1.length > this.length) {
      return -1;
    } else if ((var1.length >= this.length)) {
      return 0;
    } else {
      return 1;
    }
  }

  public GameString method1560(GameString var1, boolean var2,
      GameString var3) {
    int var4 = this.length;
    int var5 = var1.length - var3.length;
    int var6 = 0;

    while (true) {
      int var7 = this.indexOf(var3, var6, -1);
      if (var7 < 0) {
        var6 = 0;
        GameString var10 = GameStringStatics.createString(var4);

        while (true) {
          int var8 = this.indexOf(var3, var6, -1);
          if (var8 < 0) {
            while ((var6 < this.length)) {
              var10.method1572(255 & this.bytes[var6++], (byte) 117);
            }

            if (!var2) {
              this.split(-5);
            }

            return var10;
          }

          while (var6 < var8) {
            var10.method1572(this.bytes[var6++] & 255, (byte) 125);
          }

          var10.append(var1);
          var6 += var3.length;
        }
      }

      var6 = var7 + var3.length;
      var4 += var5;
    }
  }

  public int hashCode() {
    return this.getDbj2Hash(false);
  }

  public boolean equals(Object var1) {
    if (var1 instanceof GameString) {
      return this.method1528((byte) -42, (GameString) var1);
    } else {
      throw new IllegalArgumentException();
    }
  }

  public String toString() {
    throw new RuntimeException();
  }

  private boolean method1561(int var1, boolean var2) {
    if ((var1 < 1) || var1 > 36) {
      var1 = 10;
    }

    boolean var4 = false;
    boolean var3 = false;
    int var5 = 0;

    for (int var6 = 0; var6 < this.length; ++var6) {
      int var7 = this.bytes[var6] & 255;
      if (var6 == 0) {
        if (var7 == 45) {
          var3 = true;
          continue;
        }

        if (var7 == 43) {
          continue;
        }
      }

      if (var7 >= 48 && (var7 <= 57)) {
        var7 -= 48;
      } else if ((var7 >= 65) && (var7 <= 90)) {
        var7 -= 55;
      } else {
        if (var7 < 97 || (var7 > 122)) {
          return false;
        }

        var7 -= 87;
      }

      if ((var7 >= var1)) {
        return false;
      }

      if (var3) {
        var7 = -var7;
      }

      int var8 = var7 + var1 * var5;
      if ((var5 != (var8 / var1))) {
        return false;
      }

      var5 = var8;
      var4 = true;
    }

    return var4;
  }

  public boolean method1562(byte var1, GameString var2) {
    if (this.length < var2.length) {
      return false;
    } else {
      if (var1 != -32) {
        this.length = 13;
      }

      for (int var3 = 0; var2.length > var3; ++var3) {
        byte var4 = this.bytes[var3];
        byte var5 = var2.bytes[var3];
        if (var5 >= 65 && var5 <= 90 ||
            var5 >= -64 && var5 <= -34 && var5 != -41) {
          var5 = (byte) (var5 + 32);
        }

        if (var4 >= 65 && (var4 <= 90) ||
            var4 >= -64 && var4 <= -34 && var4 != -41) {
          var4 = (byte) (var4 + 32);
        }

        if ((var4 != var5)) {
          return false;
        }
      }

      return true;
    }
  }

  public GameString method1563(int var1) {
    if (var1 <= 86) {
      this.method1564(117);
    }

    return this;
  }

  public GameString method1564(int var1) {
    int var2;
    for (var2 = 0; var2 < this.length &&
        (this.bytes[var2] >= 0 && this.bytes[var2] <= 32 ||
            ((255 & this.bytes[var2]) == 160));
        ++var2) {
    }

    int var3;
    for (var3 = this.length;
        var3 > var2 &&
            ((this.bytes[var3 - 1] >= 0) && (this.bytes[var3 - 1] <= 32)
                ||
                ((255 & this.bytes[var3 - 1]) == 160));
        --var3) {
    }

    if ((var2 == 0) && (this.length == var3)) {
      return this;
    } else {
      GameString var4 = new GameString();
      var4.length = var3 - var2;
      var4.bytes = new byte[var4.length];

      for (int var5 = 0; var5 < var4.length; ++var5) {
        var4.bytes[var5] = this.bytes[var2 + var5];
      }

      return var4;
    }
  }

  public GameString method1565(int var1, int var2, int var3) {
    byte var4 = (byte) var3;
    GameString var6 = new GameString();
    byte var5 = (byte) var1;
    var6.length = this.length;
    var6.bytes = new byte[this.length];

    for (int var7 = 0; this.length > var7; ++var7) {
      byte var8 = this.bytes[var7];
      if ((var8 == var4)) {
        var6.bytes[var7] = var5;
      } else {
        var6.bytes[var7] = var8;
      }
    }

    return var6;
  }

  public int indexOf(GameString var1, int start, int var3) {
    int var4 = var1.length;
    if (start >= this.length) {
      return (var4 == 0) ? this.length : -1;
    } else {
      if ((start < 0)) {
        start = 0;
      }

      if (var3 == ~var4) {
        return start;
      } else {
        int var7 = this.length - var4;
        byte[] var5 = var1.bytes;
        byte var6 = var5[0];
        int var8 = start;

        while ((var8 <= var7)) {
          if ((var6 != this.bytes[var8])) {
            do {
              ++var8;
              if (var8 > var7) {
                return -1;
              }
            } while ((var6 != this.bytes[var8]));
          }

          boolean var9 = true;
          int var10 = 1 + var8;
          int var11 = 1;

          while (true) {
            if (var11 < var4) {
              if ((var5[var11] == this.bytes[var10])) {
                ++var10;
                ++var11;
                continue;
              }

              var9 = false;
            }

            if (var9) {
              return var8;
            }

            ++var8;
            break;
          }
        }

        return -1;
      }
    }
  }

  public GameString[] split(int ch) {
    int var3 = 0;

    for (int var4 = 0; this.length > var4; ++var4) {
      if ((ch == this.bytes[var4])) {
        ++var3;
      }
    }

    GameString[] var11 = new GameString[1 + var3];
    if (var3 == 0) {
      var11[0] = this;
      return var11;
    } else {
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;

      for (; (var7 < var3); ++var7) {
        int var9;
        for (var9 = 0; (ch != this.bytes[var9 + var6]); ++var9) {
        }

        var11[var5++] = this.substring(var6 + var9, 0, var6);
        var6 += 1 + var9;
      }

      var11[var3] = this.substring(this.length, 0, var6);
      return var11;
    }
  }

  public byte[] method1568(int var1) {
    byte[] var2 = new byte[this.length];
    ArrayUtils.copy(this.bytes, 0, var2, var1, this.length);
    return var2;
  }

  public int charAt(int off) {
    return this.bytes[off] & 255;
  }

  public GameString cache() {
    long var2 = this.hash();
    Class stringClass = GameString.class;
    synchronized (stringClass) {
      StringNode var5;
      if (GameStringStatics.aClass130_1194 != null) {
        for (var5 = (StringNode) GameStringStatics.aClass130_1194.get(var2);
            var5 != null;
            var5 = (StringNode)
                GameStringStatics.aClass130_1194.getLastFetchedNode()) {
          if (this.method1528((byte) -42, var5.aClass94_2586)) {
            return var5.aClass94_2586;
          }
        }
      } else {
        GameStringStatics.aClass130_1194 = new HashTable(4096);
      }

      var5 = new StringNode();

      var5.aClass94_2586 = this;
      this.immutable = false;
      GameStringStatics.aClass130_1194.put(var2, var5);
    }

    return this;
  }

  public GameString method1572(int var1, byte var2) {
    if (var1 > 0 && var1 <= 255) {
      if (this.immutable) {
        if (this.length == this.bytes.length) {
          int var3;
          for (var3 = 1; (var3 <= this.length); var3 += var3) {
          }

          byte[] var4 = new byte[var3];
          ArrayUtils.copy(this.bytes, 0, var4, 0, this.length);
          this.bytes = var4;
        }

        this.bytes[this.length++] = (byte) var1;
        return this;
      } else {
        throw new IllegalArgumentException();
      }
    } else {
      throw new IllegalArgumentException("invalid char:" + var1);
    }
  }

  public GameString getParameter(byte var1) {
    System.out.println("GameString.getParameter");
    return null;
  }

  public int getDbj2Hash(boolean var1) {
    int var2 = 0;

    for (int var3 = 0; var3 < this.length; ++var3) {
      var2 = (255 & this.bytes[var3]) - var2 + (var2 << 5);
    }

    return var2;
  }

  public int method1575(int var1, FontMetrics var2) {
    if (var1 == -21018) {
      String var3;
      var3 = new String(this.bytes, 0, this.length,
          StandardCharsets.ISO_8859_1);

      return var2.stringWidth(var3);
    } else {
      return 63;
    }
  }

  public GameString pack() {
    if (this.immutable) {

      if (this.bytes.length != this.length) {
        byte[] array = new byte[this.length];
        ArrayUtils.copy(this.bytes, 0, array, 0, this.length);
        this.bytes = array;
      }

      return this;
    } else {
      throw new IllegalArgumentException();
    }
  }

  public Object method1577(int var1) {
    System.out.println("GameString.method1577");
    return null;
  }

  public long toBase37() {
    long var2 = 0L;

    for (int var4 = 0; this.length > var4 && (var4 < 12); ++var4) {
      byte var5 = this.bytes[var4];
      var2 *= 37L;
      if (var5 >= 65 && var5 <= 90) {
        var2 += -65 + 1 + var5;
      } else if ((var5 >= 97) && var5 <= 122) {
        var2 += -97 + var5 + 1;
      } else if (var5 >= 48 && var5 <= 57) {
        var2 += -48 + var5 + 27;
      }
    }

    while (((var2 % 37L) == 0L) && var2 != 0L) {
      var2 /= 37L;
    }

    return var2;
  }

  public GameString method1579(int var1) {
    GameString var2 = GameStringStatics
        .stringFromBase37(-29664, this.toBase37());
    return var1 >= -4 ? null
        : (var2 == null ? GameStringStatics.aClass94_1760 : var2);
  }

  public int method1580(boolean var1, byte[] var2, int var3, int var4,
      int var5) {
    ArrayUtils.copy(this.bytes, var4, var2, var3, -var4 + var5);
    return -var4 + var5;
  }

}
