package com.jagex.runescape.model;

import com.jagex.runescape.common.ArrayUtils;
import com.jagex.runescape.common.ThreadUtilities;
import com.jagex.runescape.common.TimeUtilities;
import com.jagex.runescape.sound.AbstractSomethingMusic;
import com.jagex.runescape.sound.audio.AudioStatics;
import com.jagex.runescape.sound.audio.AudioStreamEncoder;
import com.jagex.runescape.sound.audio.AudioStreamEncoder3Statics;
import java.awt.Component;
import javax.sound.sampled.LineUnavailableException;

public class AbstractAudioOutputStream {

  public int[] samples;
  public int sampleRate;
  public int sampleBufferSize;
  private final int anInt1968 = 32;
  private long aLong1972 = TimeUtilities.getCurrentTimeMillis();
  private AudioStreamEncoder aClass3_Sub24_1973;
  private long aLong1979;
  private final AudioStreamEncoder[] aClass3_Sub24Array1980 = new AudioStreamEncoder[8];
  private int anInt1981;
  private long pauseTime;
  private final AudioStreamEncoder[] aClass3_Sub24Array1983 = new AudioStreamEncoder[8];
  private boolean paused = true;
  private int anInt1985;
  private int overflow;
  private int anInt1987;
  private int anInt1988;

  void write() throws Exception {
  }

  public void setBufferSize(int var1) throws Exception {
  }

  public void flush() throws LineUnavailableException {
  }

  private void fill(int[] samples, int len) {
    int length = len;
    if (AudioStatics.STEREO) {
      length = len << 1;
    }

    ArrayUtils.clear(samples, 0, length);
    this.anInt1987 -= len;
    if (this.aClass3_Sub24_1973 != null && this.anInt1987 <= 0) {
      this.anInt1987 += AudioStreamEncoder3Statics.sampleRate >> 4;
      AbstractAudioOutputStreamStatics.method1591(this.aClass3_Sub24_1973);
      this.method2155(this.aClass3_Sub24_1973,
          this.aClass3_Sub24_1973.method412(), (byte) -24);
      int var4 = 0;
      int var5 = 255;

      int var6;
      label101:
      for (var6 = 7; var5 != 0; --var6) {
        int var7;
        int var8;
        if (var6 < 0) {
          var7 = var6 & 3;
          var8 = -(var6 >> 2);
        } else {
          var7 = var6;
          var8 = 0;
        }

        for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 4) {
          if ((var9 & 1) != 0) {
            var5 &= ~(1 << var7);
            AudioStreamEncoder var10 = null;
            AudioStreamEncoder var11 = this.aClass3_Sub24Array1980[var7];

            while (var11 != null) {
              AbstractSomethingMusic var12 = var11.aClass3_Sub12_2544;
              if (var12 != null && var12.anInt2374 > var8) {
                var5 |= 1 << var7;
                var10 = var11;
                var11 = var11.aClass3_Sub24_2546;
              } else {
                var11.aBoolean2545 = true;
                int var13 = var11.method409();
                var4 += var13;
                if (var12 != null) {
                  var12.anInt2374 += var13;
                }

                if (var4 >= this.anInt1968) {
                  break label101;
                }

                AudioStreamEncoder var14 = var11.method411();
                if (var14 != null) {
                  for (int var15 = var11.anInt2543; var14 != null;
                      var14 = var11.method414()) {
                    this.method2155(var14, var15 * var14.method412() >> 8,
                        (byte) -24);
                  }
                }

                AudioStreamEncoder var18 = var11.aClass3_Sub24_2546;
                var11.aClass3_Sub24_2546 = null;
                if (var10 == null) {
                  this.aClass3_Sub24Array1980[var7] = var18;
                } else {
                  var10.aClass3_Sub24_2546 = var18;
                }

                if (var18 == null) {
                  this.aClass3_Sub24Array1983[var7] = var10;
                }

                var11 = var18;
              }
            }
          }

          var7 += 4;
          ++var8;
        }
      }

      for (var6 = 0; var6 < 8; ++var6) {
        AudioStreamEncoder var16 = this.aClass3_Sub24Array1980[var6];

        AudioStreamEncoder var17;
        for (
            this.aClass3_Sub24Array1980[var6] = this.aClass3_Sub24Array1983[var6] = null;
            var16 != null; var16 = var17) {
          var17 = var16.aClass3_Sub24_2546;
          var16.aClass3_Sub24_2546 = null;
        }
      }
    }

    if (this.anInt1987 < 0) {
      this.anInt1987 = 0;
    }

    if (this.aClass3_Sub24_1973 != null) {
      this.aClass3_Sub24_1973.method413(samples, 0, len);
    }

    this.aLong1972 = TimeUtilities.getCurrentTimeMillis();
  }

  public final synchronized void process(byte var1) {
    if (this.samples != null) {
      long start = TimeUtilities.getCurrentTimeMillis();

      try {
        if (this.pauseTime != 0L) {
          if (start < this.pauseTime) {
            return;
          }

          this.setBufferSize(this.sampleBufferSize);
          this.paused = true;
          this.pauseTime = 0L;
        }

        int amountBufferedSamples = this.getAmountBufferedSamples();
        if (this.anInt1981 < this.anInt1985 - amountBufferedSamples) {
          this.anInt1981 = this.anInt1985 - amountBufferedSamples;
        }

        int writeLen = this.sampleRate + this.overflow;
        if (writeLen + 256 > 16384) {
          writeLen = 16128;
        }

        if (this.sampleBufferSize < writeLen + 256) {
          this.sampleBufferSize += 1024;
          if (this.sampleBufferSize > 16384) {
            this.sampleBufferSize = 16384;
          }

          this.close();
          amountBufferedSamples = 0;
          this.setBufferSize(this.sampleBufferSize);
          if (this.sampleBufferSize < 256 + writeLen) {
            writeLen = this.sampleBufferSize - 256;
            this.overflow = writeLen - this.sampleRate;
          }

          this.paused = true;
        }

        while (writeLen > amountBufferedSamples) {
          amountBufferedSamples += 256;
          this.fill(this.samples, 256);
          this.write();
        }

        if (start > this.aLong1979) {
          if (this.paused) {
            this.paused = false;
          } else {
            if (this.anInt1981 == 0 && this.anInt1988 == 0) {
              this.close();
              this.pauseTime = start + 2000L;
              return;
            }

            this.overflow = Math.min(this.anInt1988, this.anInt1981);
            this.anInt1988 = this.anInt1981;
          }

          this.aLong1979 = 2000L + start;
          this.anInt1981 = 0;
        }

        this.anInt1985 = amountBufferedSamples;
      } catch (Exception var7) {
        this.close();
        this.pauseTime = start + 2000L;
      }

      try {
        if (start > 500000L + this.aLong1972) {
          start = this.aLong1972;
        }

        if (var1 != -34) {
          return;
        }

        while (start > this.aLong1972 + 5000L) {
          this.method2161(256, 1);
          this.aLong1972 += 256000 / AudioStreamEncoder3Statics.sampleRate;
        }
      } catch (Exception var6) {
        this.aLong1972 = start;
      }

    }
  }

  public final synchronized void method2154(int var1, AudioStreamEncoder var2) {
    this.aClass3_Sub24_1973 = var2;
  }

  private void method2155(AudioStreamEncoder var1, int var2, byte var3) {
    if (var3 != -24) {
      this.method2155(null, -105, (byte) 87);
    }

    int var4 = var2 >> 5;
    AudioStreamEncoder var5 = this.aClass3_Sub24Array1983[var4];
    if (var5 == null) {
      this.aClass3_Sub24Array1980[var4] = var1;
    } else {
      var5.aClass3_Sub24_2546 = var1;
    }

    this.aClass3_Sub24Array1983[var4] = var1;
    var1.anInt2543 = var2;
  }

  public int getAmountBufferedSamples() {
    return this.sampleBufferSize;
  }

  public final synchronized void method2158(byte var1) {
    this.paused = true;

    try {
      this.flush();
    } catch (Exception var3) {
      this.close();
      this.pauseTime = TimeUtilities.getCurrentTimeMillis() + 2000L;
    }
  }

  public final void pause() {
    this.paused = true;
  }

  public void close() {
  }

  private void method2161(int var1, int var2) {
    this.anInt1987 -= var1;
    if (this.anInt1987 < 0) {
      this.anInt1987 = 0;
    }

    if (var2 != 1) {
      this.aLong1972 = -60L;
    }

    if (this.aClass3_Sub24_1973 != null) {
      this.aClass3_Sub24_1973.method415(var1);
    }
  }

  public final synchronized void method2163(boolean var1) {
    if (AbstractAudioOutputStreamStatics.aClass15_2613 != null) {
      boolean var2 = true;

      for (int var3 = 0; var3 < 2; ++var3) {
        if (this
            == AbstractAudioOutputStreamStatics.aClass15_2613.aClass155Array352[var3]) {
          AbstractAudioOutputStreamStatics.aClass15_2613.aClass155Array352[var3] = null;
        }

        if (AbstractAudioOutputStreamStatics.aClass15_2613.aClass155Array352[var3]
            != null) {
          var2 = false;
        }
      }

      if (var2) {
        AbstractAudioOutputStreamStatics.aClass15_2613.aBoolean345 = true;

        while (AbstractAudioOutputStreamStatics.aClass15_2613.aBoolean353) {
          ThreadUtilities.sleep(50L);
        }

        AbstractAudioOutputStreamStatics.aClass15_2613 = null;
      }
    }

    this.close();
    this.samples = null;
  }

  public void bind(Component component) throws Exception {
    throw new IllegalStateException(
        "Tried to bind undefined audio output stream");
  }
}
