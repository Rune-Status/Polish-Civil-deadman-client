package com.jagex.runescape.sound.audio;

import com.jagex.runescape.sound.SomethingMusic0;

public final class AudioStreamEncoder1 extends AudioStreamEncoder {

  public int anInt3470;
  public int anInt3471;
  public int anInt3472;
  public final int anInt3473;
  public int anInt3474;
  public int anInt3475;
  public int anInt3476;
  public final boolean aBoolean3477;
  public int anInt3478;
  public int anInt3479;
  public int anInt3480;
  public int anInt3481;
  public final int anInt3482;
  public int anInt3483;
  public int anInt3484;

  public AudioStreamEncoder1(SomethingMusic0 var1, int var2, int var3) {
    this.aClass3_Sub12_2544 = var1;
    this.anInt3473 = var1.anInt3033;
    this.anInt3482 = var1.anInt3032;
    this.aBoolean3477 = var1.aBoolean3031;
    this.anInt3470 = var2;
    this.anInt3471 = var3;
    this.anInt3478 = 8192;
    this.anInt3474 = 0;
    this.method449();
  }

  public AudioStreamEncoder1(SomethingMusic0 var1, int var2, int var3,
      int var4) {
    this.aClass3_Sub12_2544 = var1;
    this.anInt3473 = var1.anInt3033;
    this.anInt3482 = var1.anInt3032;
    this.aBoolean3477 = var1.aBoolean3031;
    this.anInt3470 = var2;
    this.anInt3471 = var3;
    this.anInt3478 = var4;
    this.anInt3474 = 0;
    this.method449();
  }

  public boolean method416() {
    int var1 = this.anInt3471;
    int var2;
    int var3;
    if (var1 == Integer.MIN_VALUE) {
      var3 = 0;
      var2 = 0;
      var1 = 0;
    } else {
      var2 = AudioStreamEncoder1Statics.method452(var1, this.anInt3478);
      var3 = AudioStreamEncoder1Statics.method454(var1, this.anInt3478);
    }

    if (this.anInt3476 == var1 && this.anInt3484 == var2
        && this.anInt3481 == var3) {
      if (this.anInt3471 == Integer.MIN_VALUE) {
        this.anInt3471 = 0;
        this.anInt3476 = this.anInt3484 = this.anInt3481 = 0;
        this.unlinkNode();
        return true;
      } else {
        this.method449();
        return false;
      }
    } else {
      if (this.anInt3476 < var1) {
        this.anInt3472 = 1;
        this.anInt3480 = var1 - this.anInt3476;
      } else if (this.anInt3476 > var1) {
        this.anInt3472 = -1;
        this.anInt3480 = this.anInt3476 - var1;
      } else {
        this.anInt3472 = 0;
      }

      if (this.anInt3484 < var2) {
        this.anInt3475 = 1;
        if (this.anInt3480 == 0 || this.anInt3480 > var2 - this.anInt3484) {
          this.anInt3480 = var2 - this.anInt3484;
        }
      } else if (this.anInt3484 > var2) {
        this.anInt3475 = -1;
        if (this.anInt3480 == 0 || this.anInt3480 > this.anInt3484 - var2) {
          this.anInt3480 = this.anInt3484 - var2;
        }
      } else {
        this.anInt3475 = 0;
      }

      if (this.anInt3481 < var3) {
        this.anInt3483 = 1;
        if (this.anInt3480 == 0 || this.anInt3480 > var3 - this.anInt3481) {
          this.anInt3480 = var3 - this.anInt3481;
        }
      } else if (this.anInt3481 > var3) {
        this.anInt3483 = -1;
        if (this.anInt3480 == 0 || this.anInt3480 > this.anInt3481 - var3) {
          this.anInt3480 = this.anInt3481 - var3;
        }
      } else {
        this.anInt3483 = 0;
      }

      return false;
    }
  }

  public synchronized void method417(int var1) {
    if (var1 == 0) {
      this.method430(0);
      this.unlinkNode();
    } else if (this.anInt3484 == 0 && this.anInt3481 == 0) {
      this.anInt3480 = 0;
      this.anInt3471 = 0;
      this.anInt3476 = 0;
      this.unlinkNode();
    } else {
      int var2 = -this.anInt3476;
      if (this.anInt3476 > var2) {
        var2 = this.anInt3476;
      }

      if (-this.anInt3484 > var2) {
        var2 = -this.anInt3484;
      }

      if (this.anInt3484 > var2) {
        var2 = this.anInt3484;
      }

      if (-this.anInt3481 > var2) {
        var2 = -this.anInt3481;
      }

      if (this.anInt3481 > var2) {
        var2 = this.anInt3481;
      }

      if (var1 > var2) {
        var1 = var2;
      }

      this.anInt3480 = var1;
      this.anInt3471 = Integer.MIN_VALUE;
      this.anInt3472 = -this.anInt3476 / var1;
      this.anInt3475 = -this.anInt3484 / var1;
      this.anInt3483 = -this.anInt3481 / var1;
    }
  }

  public int method418(int[] var1, int var2, int var3, int var4, int var5) {
    while (true) {
      if (this.anInt3480 > 0) {
        int var6 = var2 + this.anInt3480;
        if (var6 > var4) {
          var6 = var4;
        }

        this.anInt3480 += var2;
        if (this.anInt3470 == 256 && (this.anInt3474 & 255) == 0) {
          if (AudioStatics.STEREO) {
            var2 = AudioStreamEncoder1Statics.method426(
                ((SomethingMusic0) this.aClass3_Sub12_2544).aByteArray3030,
                var1,
                this.anInt3474, var2, this.anInt3484, this.anInt3481,
                this.anInt3475,
                this.anInt3483,
                0, var6, var3, this);
          } else {
            var2 = AudioStreamEncoder1Statics.method428(
                ((SomethingMusic0) this.aClass3_Sub12_2544).aByteArray3030,
                var1,
                this.anInt3474, var2, this.anInt3476, this.anInt3472, 0, var6,
                var3, this);
          }
        } else if (AudioStatics.STEREO) {
          var2 = AudioStreamEncoder1Statics.method421(0, 0,
              ((SomethingMusic0) this.aClass3_Sub12_2544).aByteArray3030, var1,
              this.anInt3474, var2, this.anInt3484, this.anInt3481,
              this.anInt3475,
              this.anInt3483, 0,
              var6, var3, this, this.anInt3470, var5);
        } else {
          var2 = AudioStreamEncoder1Statics.method422(0,
              ((SomethingMusic0) this.aClass3_Sub12_2544).aByteArray3030, var1,
              this.anInt3474, var2, this.anInt3476, this.anInt3472, 0, var6,
              var3, this,
              this.anInt3470, var5);
        }

        this.anInt3480 -= var2;
        if (this.anInt3480 != 0) {
          return var2;
        }

        if (!this.method416()) {
          continue;
        }

        return var4;
      }

      if (this.anInt3470 == 256 && (this.anInt3474 & 255) == 0) {
        if (AudioStatics.STEREO) {
          return AudioStreamEncoder1Statics.method420(
              ((SomethingMusic0) this.aClass3_Sub12_2544).aByteArray3030, var1,
              this.anInt3474, var2, this.anInt3484, this.anInt3481, 0, var4,
              var3, this);
        }

        return AudioStreamEncoder1Statics.method424(
            ((SomethingMusic0) this.aClass3_Sub12_2544).aByteArray3030, var1,
            this.anInt3474, var2, this.anInt3476, 0, var4, var3, this);
      }

      if (AudioStatics.STEREO) {
        return AudioStreamEncoder1Statics.method433(0, 0,
            ((SomethingMusic0) this.aClass3_Sub12_2544).aByteArray3030, var1,
            this.anInt3474, var2, this.anInt3484, this.anInt3481, 0, var4, var3,
            this,
            this.anInt3470,
            var5);
      }

      return AudioStreamEncoder1Statics
          .method455(0,
              ((SomethingMusic0) this.aClass3_Sub12_2544).aByteArray3030, var1,
              this.anInt3474, var2, this.anInt3476, 0, var4, var3, this,
              this.anInt3470, var5);
    }
  }

  public synchronized void method419(int var1) {
    this.method441(var1 << 6, this.method451());
  }

  public int method409() {
    return this.anInt3471 == 0 && this.anInt3480 == 0 ? 0 : 1;
  }

  public AudioStreamEncoder method411() {
    return null;
  }

  public int method412() {
    int var1 = this.anInt3476 * 3 >> 6;
    var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
    if (this.anInt3479 == 0) {
      var1 -=
          var1 * this.anInt3474 / (
              ((SomethingMusic0) this.aClass3_Sub12_2544).aByteArray3030.length
                  << 8);
    } else if (this.anInt3479 >= 0) {
      var1 -=
          var1 * this.anInt3473
              / ((SomethingMusic0) this.aClass3_Sub12_2544).aByteArray3030.length;
    }

    return var1 > 255 ? 255 : var1;
  }

  public synchronized void method413(int[] samples, int var2, int var3) {
    if (this.anInt3471 == 0 && this.anInt3480 == 0) {
      this.method415(var3);
    } else {
      SomethingMusic0 var4 = (SomethingMusic0) this.aClass3_Sub12_2544;
      int var5 = this.anInt3473 << 8;
      int var6 = this.anInt3482 << 8;
      int var7 = var4.aByteArray3030.length << 8;
      int var8 = var6 - var5;
      if (var8 <= 0) {
        this.anInt3479 = 0;
      }

      int var9 = var2;
      var3 += var2;
      if (this.anInt3474 < 0) {
        if (this.anInt3470 <= 0) {
          this.method439();
          this.unlinkNode();
          return;
        }

        this.anInt3474 = 0;
      }

      if (this.anInt3474 >= var7) {
        if (this.anInt3470 >= 0) {
          this.method439();
          this.unlinkNode();
          return;
        }

        this.anInt3474 = var7 - 1;
      }

      if (this.anInt3479 < 0) {
        if (this.aBoolean3477) {
          if (this.anInt3470 < 0) {
            var9 = this.method436(samples, var2, var5, var3,
                var4.aByteArray3030[this.anInt3473]);
            if (this.anInt3474 >= var5) {
              return;
            }

            this.anInt3474 = var5 + var5 - 1 - this.anInt3474;
            this.anInt3470 = -this.anInt3470;
          }

          while (true) {
            var9 =
                this.method418(samples, var9, var6, var3, var4.aByteArray3030[
                    this.anInt3482 - 1]);
            if (this.anInt3474 < var6) {
              return;
            }

            this.anInt3474 = var6 + var6 - 1 - this.anInt3474;
            this.anInt3470 = -this.anInt3470;
            var9 = this.method436(samples, var9, var5, var3,
                var4.aByteArray3030[this.anInt3473]);
            if (this.anInt3474 >= var5) {
              return;
            }

            this.anInt3474 = var5 + var5 - 1 - this.anInt3474;
            this.anInt3470 = -this.anInt3470;
          }
        } else if (this.anInt3470 < 0) {
          while (true) {
            var9 =
                this.method436(samples, var9, var5, var3, var4.aByteArray3030[
                    this.anInt3482 - 1]);
            if (this.anInt3474 >= var5) {
              return;
            }

            this.anInt3474 = var6 - 1 - (var6 - 1 - this.anInt3474) % var8;
          }
        } else {
          while (true) {
            var9 = this.method418(samples, var9, var6, var3,
                var4.aByteArray3030[this.anInt3473]);
            if (this.anInt3474 < var6) {
              return;
            }

            this.anInt3474 = var5 + (this.anInt3474 - var5) % var8;
          }
        }
      } else {
        if (this.anInt3479 > 0) {
          if (this.aBoolean3477) {
            label134:
            {
              if (this.anInt3470 < 0) {
                var9 =
                    this.method436(samples, var2, var5, var3,
                        var4.aByteArray3030[this.anInt3473]);
                if (this.anInt3474 >= var5) {
                  return;
                }

                this.anInt3474 = var5 + var5 - 1 - this.anInt3474;
                this.anInt3470 = -this.anInt3470;
                if (--this.anInt3479 == 0) {
                  break label134;
                }
              }

              do {
                var9 = this.method418(samples, var9, var6, var3,
                    var4.aByteArray3030[this.anInt3482 - 1]);
                if (this.anInt3474 < var6) {
                  return;
                }

                this.anInt3474 = var6 + var6 - 1 - this.anInt3474;
                this.anInt3470 = -this.anInt3470;
                if (--this.anInt3479 == 0) {
                  break;
                }

                var9 =
                    this.method436(samples, var9, var5, var3,
                        var4.aByteArray3030[this.anInt3473]);
                if (this.anInt3474 >= var5) {
                  return;
                }

                this.anInt3474 = var5 + var5 - 1 - this.anInt3474;
                this.anInt3470 = -this.anInt3470;
              } while (--this.anInt3479 != 0);
            }
          } else {
            int var10;
            if (this.anInt3470 < 0) {
              while (true) {
                var9 = this.method436(samples, var9, var5, var3,
                    var4.aByteArray3030[this.anInt3482 - 1]);
                if (this.anInt3474 >= var5) {
                  return;
                }

                var10 = (var6 - 1 - this.anInt3474) / var8;
                if (var10 >= this.anInt3479) {
                  this.anInt3474 += var8 * this.anInt3479;
                  this.anInt3479 = 0;
                  break;
                }

                this.anInt3474 += var8 * var10;
                this.anInt3479 -= var10;
              }
            } else {
              while (true) {
                var9 =
                    this.method418(samples, var9, var6, var3,
                        var4.aByteArray3030[this.anInt3473]);
                if (this.anInt3474 < var6) {
                  return;
                }

                var10 = (this.anInt3474 - var5) / var8;
                if (var10 >= this.anInt3479) {
                  this.anInt3474 -= var8 * this.anInt3479;
                  this.anInt3479 = 0;
                  break;
                }

                this.anInt3474 -= var8 * var10;
                this.anInt3479 -= var10;
              }
            }
          }
        }

        if (this.anInt3470 < 0) {
          this.method436(samples, var9, 0, var3, 0);
          if (this.anInt3474 < 0) {
            this.anInt3474 = -1;
            this.method439();
            this.unlinkNode();
          }
        } else {
          this.method418(samples, var9, var7, var3, 0);
          if (this.anInt3474 >= var7) {
            this.anInt3474 = var7;
            this.method439();
            this.unlinkNode();
          }
        }

      }
    }
  }

  public AudioStreamEncoder method414() {
    return null;
  }

  public synchronized void method415(int var1) {
    if (this.anInt3480 > 0) {
      if (var1 >= this.anInt3480) {
        if (this.anInt3471 == Integer.MIN_VALUE) {
          this.anInt3471 = 0;
          this.anInt3476 = this.anInt3484 = this.anInt3481 = 0;
          this.unlinkNode();
          var1 = this.anInt3480;
        }

        this.anInt3480 = 0;
        this.method449();
      } else {
        this.anInt3476 += this.anInt3472 * var1;
        this.anInt3484 += this.anInt3475 * var1;
        this.anInt3481 += this.anInt3483 * var1;
        this.anInt3480 -= var1;
      }
    }

    SomethingMusic0 var2 = (SomethingMusic0) this.aClass3_Sub12_2544;
    int var3 = this.anInt3473 << 8;
    int var4 = this.anInt3482 << 8;
    int var5 = var2.aByteArray3030.length << 8;
    int var6 = var4 - var3;
    if (var6 <= 0) {
      this.anInt3479 = 0;
    }

    if (this.anInt3474 < 0) {
      if (this.anInt3470 <= 0) {
        this.method439();
        this.unlinkNode();
        return;
      }

      this.anInt3474 = 0;
    }

    if (this.anInt3474 >= var5) {
      if (this.anInt3470 >= 0) {
        this.method439();
        this.unlinkNode();
        return;
      }

      this.anInt3474 = var5 - 1;
    }

    this.anInt3474 += this.anInt3470 * var1;
    if (this.anInt3479 < 0) {
      if (this.aBoolean3477) {
        if (this.anInt3470 < 0) {
          if (this.anInt3474 >= var3) {
            return;
          }

          this.anInt3474 = var3 + var3 - 1 - this.anInt3474;
          this.anInt3470 = -this.anInt3470;
        }

        while (this.anInt3474 >= var4) {
          this.anInt3474 = var4 + var4 - 1 - this.anInt3474;
          this.anInt3470 = -this.anInt3470;
          if (this.anInt3474 >= var3) {
            return;
          }

          this.anInt3474 = var3 + var3 - 1 - this.anInt3474;
          this.anInt3470 = -this.anInt3470;
        }

      } else {
        if (this.anInt3470 < 0) {
          if (this.anInt3474 >= var3) {
            return;
          }

          this.anInt3474 = var4 - 1 - (var4 - 1 - this.anInt3474) % var6;
        } else {
          if (this.anInt3474 < var4) {
            return;
          }

          this.anInt3474 = var3 + (this.anInt3474 - var3) % var6;
        }

      }
    } else {
      if (this.anInt3479 > 0) {
        if (this.aBoolean3477) {
          label122:
          {
            if (this.anInt3470 < 0) {
              if (this.anInt3474 >= var3) {
                return;
              }

              this.anInt3474 = var3 + var3 - 1 - this.anInt3474;
              this.anInt3470 = -this.anInt3470;
              if (--this.anInt3479 == 0) {
                break label122;
              }
            }

            do {
              if (this.anInt3474 < var4) {
                return;
              }

              this.anInt3474 = var4 + var4 - 1 - this.anInt3474;
              this.anInt3470 = -this.anInt3470;
              if (--this.anInt3479 == 0) {
                break;
              }

              if (this.anInt3474 >= var3) {
                return;
              }

              this.anInt3474 = var3 + var3 - 1 - this.anInt3474;
              this.anInt3470 = -this.anInt3470;
            } while (--this.anInt3479 != 0);
          }
        } else {
          label132:
          {
            int var7;
            if (this.anInt3470 < 0) {
              if (this.anInt3474 >= var3) {
                return;
              }

              var7 = (var4 - 1 - this.anInt3474) / var6;
              if (var7 >= this.anInt3479) {
                this.anInt3474 += var6 * this.anInt3479;
                this.anInt3479 = 0;
                break label132;
              }

              this.anInt3474 += var6 * var7;
              this.anInt3479 -= var7;
            } else {
              if (this.anInt3474 < var4) {
                return;
              }

              var7 = (this.anInt3474 - var3) / var6;
              if (var7 >= this.anInt3479) {
                this.anInt3474 -= var6 * this.anInt3479;
                this.anInt3479 = 0;
                break label132;
              }

              this.anInt3474 -= var6 * var7;
              this.anInt3479 -= var7;
            }

            return;
          }
        }
      }

      if (this.anInt3470 < 0) {
        if (this.anInt3474 < 0) {
          this.anInt3474 = -1;
          this.method439();
          this.unlinkNode();
        }
      } else if (this.anInt3474 >= var5) {
        this.anInt3474 = var5;
        this.method439();
        this.unlinkNode();
      }

    }
  }

  public synchronized int method425() {
    return this.anInt3471 == Integer.MIN_VALUE ? 0 : this.anInt3471;
  }

  public synchronized void method429(int var1) {
    this.anInt3479 = var1;
  }

  public synchronized void method430(int var1) {
    this.method441(var1, this.method451());
  }

  public synchronized void method431(int var1, int var2) {
    this.method450(var1, var2, this.method451());
  }

  public synchronized void method434(int var1) {
    int var2 =
        ((SomethingMusic0) this.aClass3_Sub12_2544).aByteArray3030.length << 8;
    if (var1 < -1) {
      var1 = -1;
    }

    if (var1 > var2) {
      var1 = var2;
    }

    this.anInt3474 = var1;
  }

  public int method436(int[] samples, int var2, int var3, int var4, int var5) {
    while (true) {
      if (this.anInt3480 > 0) {
        int var6 = var2 + this.anInt3480;
        if (var6 > var4) {
          var6 = var4;
        }

        this.anInt3480 += var2;
        if (this.anInt3470 == -256 && (this.anInt3474 & 255) == 0) {
          if (AudioStatics.STEREO) {
            var2 = AudioStreamEncoder1Statics.method435(
                ((SomethingMusic0) this.aClass3_Sub12_2544).aByteArray3030,
                samples,
                this.anInt3474, var2, this.anInt3484, this.anInt3481,
                this.anInt3475,
                this.anInt3483,
                0, var6, var3, this);
          } else {
            var2 = AudioStreamEncoder1Statics.method427(
                ((SomethingMusic0) this.aClass3_Sub12_2544).aByteArray3030,
                samples,
                this.anInt3474, var2, this.anInt3476, this.anInt3472, 0, var6,
                var3, this);
          }
        } else if (AudioStatics.STEREO) {
          var2 =
              AudioStreamEncoder1Statics.method440(0, 0,
                  ((SomethingMusic0) this.aClass3_Sub12_2544).aByteArray3030,
                  samples,
                  this.anInt3474, var2, this.anInt3484, this.anInt3481,
                  this.anInt3475,
                  this.anInt3483,
                  0, var6, var3, this, this.anInt3470, var5);
        } else {
          var2 =
              AudioStreamEncoder1Statics.method448(0, 0,
                  ((SomethingMusic0) this.aClass3_Sub12_2544).aByteArray3030,
                  samples,
                  this.anInt3474, var2, this.anInt3476, this.anInt3472, 0, var6,
                  var3, this,
                  this.anInt3470, var5);
        }

        this.anInt3480 -= var2;
        if (this.anInt3480 != 0) {
          return var2;
        }

        if (!this.method416()) {
          continue;
        }

        return var4;
      }

      if (this.anInt3470 == -256 && (this.anInt3474 & 255) == 0) {
        if (AudioStatics.STEREO) {
          return AudioStreamEncoder1Statics.method447(
              ((SomethingMusic0) this.aClass3_Sub12_2544).aByteArray3030,
              samples,
              this.anInt3474, var2, this.anInt3484, this.anInt3481, 0, var4,
              var3, this);
        }

        return AudioStreamEncoder1Statics.method446(
            ((SomethingMusic0) this.aClass3_Sub12_2544).aByteArray3030, samples,
            this.anInt3474, var2, this.anInt3476, 0, var4, var3, this);
      }

      if (AudioStatics.STEREO) {
        return AudioStreamEncoder1Statics.method453(0, 0,
            ((SomethingMusic0) this.aClass3_Sub12_2544).aByteArray3030, samples,
            this.anInt3474, var2, this.anInt3484, this.anInt3481, 0, var4, var3,
            this,
            this.anInt3470,
            var5);
      }

      return AudioStreamEncoder1Statics
          .method423(0, 0,
              ((SomethingMusic0) this.aClass3_Sub12_2544).aByteArray3030,
              samples,
              this.anInt3474, var2, this.anInt3476, 0, var4, var3, this,
              this.anInt3470, var5);
    }
  }

  public synchronized int method438() {
    return this.anInt3470 < 0 ? -this.anInt3470 : this.anInt3470;
  }

  public void method439() {
    if (this.anInt3480 != 0) {
      if (this.anInt3471 == Integer.MIN_VALUE) {
        this.anInt3471 = 0;
      }

      this.anInt3480 = 0;
      this.method449();
    }

  }

  public synchronized void method441(int var1, int var2) {
    this.anInt3471 = var1;
    this.anInt3478 = var2;
    this.anInt3480 = 0;
    this.method449();
  }

  public synchronized void method442(boolean var1) {
    this.anInt3470 = (this.anInt3470 ^ this.anInt3470 >> 31) + (this.anInt3470
        >>> 31);
    if (var1) {
      this.anInt3470 = -this.anInt3470;
    }

  }

  public synchronized void method443(int var1) {
    if (this.anInt3470 < 0) {
      this.anInt3470 = -var1;
    } else {
      this.anInt3470 = var1;
    }

  }

  public boolean method444() {
    return this.anInt3474 < 0
        || this.anInt3474
        >= ((SomethingMusic0) this.aClass3_Sub12_2544).aByteArray3030.length
        << 8;
  }

  public boolean method445() {
    return this.anInt3480 != 0;
  }

  public void method449() {
    this.anInt3476 = this.anInt3471;
    this.anInt3484 = AudioStreamEncoder1Statics.method452(this.anInt3471,
        this.anInt3478);
    this.anInt3481 = AudioStreamEncoder1Statics.method454(this.anInt3471,
        this.anInt3478);
  }

  public synchronized void method450(int var1, int var2, int var3) {
    if (var1 == 0) {
      this.method441(var2, var3);
    } else {
      int var4 = AudioStreamEncoder1Statics.method452(var2, var3);
      int var5 = AudioStreamEncoder1Statics.method454(var2, var3);
      if (this.anInt3484 == var4 && this.anInt3481 == var5) {
        this.anInt3480 = 0;
      } else {
        int var6 = var2 - this.anInt3476;
        if (this.anInt3476 - var2 > var6) {
          var6 = this.anInt3476 - var2;
        }

        if (var4 - this.anInt3484 > var6) {
          var6 = var4 - this.anInt3484;
        }

        if (this.anInt3484 - var4 > var6) {
          var6 = this.anInt3484 - var4;
        }

        if (var5 - this.anInt3481 > var6) {
          var6 = var5 - this.anInt3481;
        }

        if (this.anInt3481 - var5 > var6) {
          var6 = this.anInt3481 - var5;
        }

        if (var1 > var6) {
          var1 = var6;
        }

        this.anInt3480 = var1;
        this.anInt3471 = var2;
        this.anInt3478 = var3;
        this.anInt3472 = (var2 - this.anInt3476) / var1;
        this.anInt3475 = (var4 - this.anInt3484) / var1;
        this.anInt3483 = (var5 - this.anInt3481) / var1;
      }
    }
  }

  public synchronized int method451() {
    return this.anInt3478 < 0 ? -1 : this.anInt3478;
  }

}
