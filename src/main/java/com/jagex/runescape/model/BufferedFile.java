package com.jagex.runescape.model;

import com.jagex.runescape.common.ArrayUtils;
import com.jagex.runescape.statics.GlobalStatics_6;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;

public final class BufferedFile {

  private long aLong563;
  private final byte[] aByteArray564;
  private int anInt566;
  private long aLong568;
  private long aLong569;
  private long aLong570;
  private long aLong571 = -1L;
  private final byte[] aByteArray572;
  private final FileOnDisk aClass122_573;
  private int anInt575;
  private long aLong576 = -1L;

  public BufferedFile(FileOnDisk var1, int var2, int var3) throws IOException {
    this.aClass122_573 = var1;
    this.aLong568 = this.aLong563 = var1.length();
    this.aByteArray572 = new byte[var3];
    this.aByteArray564 = new byte[var2];
    this.aLong569 = 0L;
  }

  private void method975(byte var1) throws IOException {
    int var2 = 56 % ((45 - var1) / 44);
    if (this.aLong571 != -1L) {
      if (this.aLong571 != this.aLong570) {
        this.aClass122_573.seek(this.aLong571);
        this.aLong570 = this.aLong571;
      }

      this.aClass122_573.writeBytes(this.aByteArray572, 0, this.anInt566);
      long var3 = -1L;
      if (this.aLong576 <= this.aLong571
          && this.aLong576 + this.anInt575 > this.aLong571) {
        var3 = this.aLong571;
      } else if (this.aLong571 <= this.aLong576 && this.aLong576 < this.aLong571
          + this.anInt566) {
        var3 = this.aLong576;
      }

      this.aLong570 += this.anInt566;
      if (this.aLong563 < this.aLong570) {
        this.aLong563 = this.aLong570;
      }

      long var5 = -1L;
      if (this.aLong576 < this.aLong571 + this.anInt566
          && this.anInt575 + this.aLong576
          >= this.anInt566 + this.aLong571) {
        var5 = this.aLong571 + this.anInt566;
      } else if (this.aLong576 + this.anInt575 > this.aLong571
          && this.anInt566 + this.aLong571
          >= this.anInt575 + this.aLong576) {
        var5 = this.anInt575 + this.aLong576;
      }

      if (var3 > -1L && var5 > var3) {
        int var7 = (int) (-var3 + var5);
        ArrayUtils.copy(this.aByteArray572, (int) (var3 - this.aLong571),
            this.aByteArray564,
            (int) (var3 - this.aLong576), var7);
      }

      this.anInt566 = 0;
      this.aLong571 = -1L;
    }
  }

  public long method976(int var1) {
    if (var1 != 0) {
      this.method976(19);
    }

    return this.aLong568;
  }

  private File method977(int var1) {
    if (var1 != 281669816) {
      GlobalStatics_6.clear18(true);
    }

    return this.aClass122_573.file();
  }

  public void method978(int var1, byte[] var2, int var3, int var4)
      throws IOException {
    try {
      if (var1 + var3 > var2.length) {
        throw new ArrayIndexOutOfBoundsException(var3 + var1 - var2.length);
      }

      if (this.aLong571 != -1L && this.aLong569 >= this.aLong571
          && this.anInt566 + this.aLong571
          >= var3 + this.aLong569) {
        ArrayUtils.copy(
            this.aByteArray572, (int) (-this.aLong571 + this.aLong569), var2,
            var1,
            var3);
        this.aLong569 += var3;
        return;
      }

      long var5 = this.aLong569;
      int var8 = var3;
      int var9;
      if (this.aLong576 <= this.aLong569
          && this.aLong576 + this.anInt575 > this.aLong569) {
        var9 = (int) (this.anInt575 - this.aLong569 + this.aLong576);
        if (var9 > var3) {
          var9 = var3;
        }

        ArrayUtils.copy(
            this.aByteArray564, (int) (this.aLong569 - this.aLong576), var2,
            var1,
            var9);
        var1 += var9;
        var3 -= var9;
        this.aLong569 += var9;
      }

      if (this.aByteArray564.length < var3) {
        this.aClass122_573.seek(this.aLong569);

        for (this.aLong570 = this.aLong569; var3 > 0; this.aLong569 += var9) {
          var9 = this.aClass122_573.readBytes(var1, 0, var3, var2);
          if (var9 == -1) {
            break;
          }

          this.aLong570 += var9;
          var3 -= var9;
          var1 += var9;
        }
      } else if (var3 > 0) {
        this.method981(4393);
        var9 = var3;
        if (var3 > this.anInt575) {
          var9 = this.anInt575;
        }

        ArrayUtils.copy(this.aByteArray564, 0, var2, var1, var9);
        var3 -= var9;
        var1 += var9;
        this.aLong569 += var9;
      }

      if (this.aLong571 != -1L) {
        if (this.aLong569 < this.aLong571 && var3 > 0) {
          var9 = (int) (-this.aLong569 + this.aLong571) + var1;
          if (var1 + var3 < var9) {
            var9 = var1 + var3;
          }

          while (var1 < var9) {
            var2[var1++] = 0;
            ++this.aLong569;
            --var3;
          }
        }

        long var16 = -1L;
        long var11 = -1L;
        if (this.anInt566 + this.aLong571 > var5
            && var8 + var5 >= this.anInt566 + this.aLong571) {
          var11 = this.anInt566 + this.aLong571;
        } else if (this.aLong571 < var8 + var5
            && this.anInt566 + this.aLong571 >= var8 + var5) {
          var11 = var8 + var5;
        }

        if (var5 <= this.aLong571
            && var5 + var8 > this.aLong571) {
          var16 = this.aLong571;
        } else if (var5 >= this.aLong571
            && var5 < this.anInt566 + this.aLong571) {
          var16 = var5;
        }

        if (var16 > -1L && var11 > var16) {
          int var13 = (int) (var11 - var16);
          ArrayUtils
              .copy(this.aByteArray572, (int) (var16 - this.aLong571), var2,
                  (int) (var16 - var5) + var1, var13);
          if (this.aLong569 < var11) {
            var3 = (int) (var3 - (-this.aLong569 + var11));
            this.aLong569 = var11;
          }
        }
      }
    } catch (IOException var14) {
      this.aLong570 = -1L;
      throw var14;
    }

    if (var4 < var3) {
      throw new EOFException();
    }
  }

  public void close(boolean var1) throws IOException {
    this.method975((byte) -75);
    this.aClass122_573.close();
    if (var1) {
      this.aLong569 = 91L;
    }
  }

  private void method981(int var1) throws IOException {
    this.anInt575 = 0;
    if (var1 != 4393) {
      this.method976(-127);
    }

    if (this.aLong570 != this.aLong569) {
      this.aClass122_573.seek(this.aLong569);
      this.aLong570 = this.aLong569;
    }

    int var3;
    for (
        this.aLong576 = this.aLong569;
        this.aByteArray564.length > this.anInt575; this.anInt575 += var3) {
      int var2 = this.aByteArray564.length - this.anInt575;
      if (var2 > 200000000) {
        var2 = 200000000;
      }

      var3 = this.aClass122_573.readBytes(this.anInt575, 0, var2,
          this.aByteArray564);
      if (var3 == -1) {
        break;
      }

      this.aLong570 += var3;
    }
  }

  public void method982(boolean var1, byte[] var2) throws IOException {
    if (var1) {
      GlobalStatics_6.method979(-72, 3, 3, (byte) -115);
    }

    this.method978(0, var2, var2.length, 0);
  }

  public void write(byte[] var1, int var2, int var3, int var4)
      throws IOException {
    try {
      if (this.aLong568 < var4 + this.aLong569) {
        this.aLong568 = var4 + this.aLong569;
      }

      if (~this.aLong571 != 0L && (this.aLong571 > this.aLong569
          || this.aLong569 > this.anInt566 + this.aLong571)) {
        this.method975((byte) 124);
      }

      if (~this.aLong571 != 0L
          && this.aByteArray572.length + this.aLong571
          < var4 + this.aLong569) {
        int var5 = (int) (this.aByteArray572.length - this.aLong569
            + this.aLong571);
        var4 -= var5;
        ArrayUtils.copy(var1, var2,
            this.aByteArray572, (int) (this.aLong569 - this.aLong571),
            var5);
        this.aLong569 += var5;
        this.anInt566 = this.aByteArray572.length;
        this.method975((byte) 93);
        var2 += var5;
      }

      if (this.aByteArray572.length < var4) {
        if (this.aLong569 != this.aLong570) {
          this.aClass122_573.seek(this.aLong569);
          this.aLong570 = this.aLong569;
        }

        this.aClass122_573.writeBytes(var1, var2, var4);
        long var12 = -1L;
        if (this.aLong576 <= this.aLong569
            && this.anInt575 + this.aLong576 > this.aLong569) {
          var12 = this.aLong569;
        } else if (this.aLong569 <= this.aLong576
            && var4 + this.aLong569 > this.aLong576) {
          var12 = this.aLong576;
        }

        this.aLong570 += var4;
        long var7 = -1L;
        if (this.aLong563 < this.aLong570) {
          this.aLong563 = this.aLong570;
        }

        if (this.aLong569 + var4 > this.aLong576
            && this.aLong569 + var4 <= this.aLong576 + this.anInt575) {
          var7 = var4 + this.aLong569;
        } else if (this.aLong576 + this.anInt575 > this.aLong569
            && this.aLong569 + var4 >= this.anInt575
            + this.aLong576) {
          var7 = this.anInt575 + this.aLong576;
        }

        if (var12 > 0L && var7 > var12) {
          int var9 = (int) (-var12 + var7);
          ArrayUtils.copy(var1, (int) (-this.aLong569 + var12 + var2),
              this.aByteArray564,
              (int) (-this.aLong576 + var12), var9);
        }

        this.aLong569 += var4;
        return;
      }

      if (var4 > 0) {
        if (this.aLong571 == -1L) {
          this.aLong571 = this.aLong569;
        }

        ArrayUtils.copy(var1, var2,
            this.aByteArray572, (int) (this.aLong569 - this.aLong571),
            var4);
        this.aLong569 += var4;
        if (this.anInt566 < -this.aLong571 + this.aLong569) {
          this.anInt566 = (int) (-this.aLong571 + this.aLong569);
        }

        return;
      }
    } catch (IOException var10) {
      this.aLong570 = -1L;
      throw var10;
    }

    if (var3 != -903171152) {
      this.aLong563 = -28L;
    }
  }

  public void seek(int var1, long var2) throws IOException {
    if (var2 >= 0L) {
      this.aLong569 = var2;
      if (var1 > -6) {
        this.aLong569 = 89L;
      }

    } else {
      throw new IOException("Invalid seek to " + var2 + " in file " + this
          .method977(281669816));
    }
  }

}
