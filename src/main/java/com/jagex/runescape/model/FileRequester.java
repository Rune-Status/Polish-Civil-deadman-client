package com.jagex.runescape.model;

import com.jagex.runescape.common.HashTable;
import com.jagex.runescape.node.Deque;
import com.jagex.runescape.node.Node;
import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_7;

public final class FileRequester extends AbstractFileRequester {

  private final FileCache aClass41_2943;
  private FileTable aClass62_2944;
  private final HashTable aClass130_2946 = new HashTable(16);
  private final int anInt2947;
  private int anInt2948;
  private byte[] aByteArray2949;
  private AbstractFileRequest aClass3_Sub28_Sub10_2950;
  private final OndemandRequester aClass66_2953;
  private final FileCache aClass41_2954;
  private final int anInt2955;
  private final FileCacheRequester aClass73_2956;
  private final int anInt2957;
  private boolean aBoolean2962;
  private final Deque aClass61_2963 = new Deque();
  private int anInt2964;
  private boolean aBoolean2965;
  private Deque aClass61_2966;
  private long aLong2967;
  private final boolean aBoolean2968;


  public FileRequester(int var1, FileCache var2, FileCache var3,
      OndemandRequester var4,
      FileCacheRequester var5,
      int var6,
      int var7,
      boolean var8 ) {
    this.anInt2957 = var1;
      this.aClass41_2954 = var2;
      if (this.aClass41_2954 != null) {
        this.aBoolean2962 = true;
        this.aClass61_2966 = new Deque();
      } else {
        this.aBoolean2962 = false;
      }

      this.aClass73_2956 = var5;
      this.anInt2955 = var6;
      this.aBoolean2968 = var8;
      this.aClass41_2943 = var3;
      this.aClass66_2953 = var4;
      this.anInt2947 = var7;
      if (this.aClass41_2943 != null) {
        this.aClass3_Sub28_Sub10_2950 =
            this.aClass73_2956.method1309(this.aClass41_2943, (byte) 113,
                this.anInt2957);
      }
  }

  public FileTable method2094(int var1 ) {
    if (this.aClass62_2944 != null) {
        return this.aClass62_2944;
      } else if (var1 != 0) {
        return null;
      } else {
        if (this.aClass3_Sub28_Sub10_2950 == null) {
          if (this.aClass66_2953.method1251((byte) 73)) {
            return null;
          }

          this.aClass3_Sub28_Sub10_2950 =
              this.aClass66_2953
                  .request(var1 ^ 115, 255, (byte) 0, this.anInt2957, true);
        }

        if (this.aClass3_Sub28_Sub10_2950.aBoolean3632) {
          return null;
        } else {
          byte[] var2 = this.aClass3_Sub28_Sub10_2950.method587(false);
          if (this.aClass3_Sub28_Sub10_2950 instanceof FileCacheRequest) {
            try {
              if (var2 == null) {
                throw new RuntimeException();
              }

              this.aClass62_2944 = new FileTable(var2, this.anInt2955);
              if ((this.anInt2947 != this.aClass62_2944.version)) {
                throw new RuntimeException();
              }
            } catch (RuntimeException var4) {
              this.aClass62_2944 = null;
              if (this.aClass66_2953.method1251((byte) 124)) {
                this.aClass3_Sub28_Sub10_2950 = null;
              } else {
                this.aClass3_Sub28_Sub10_2950 =
                    this.aClass66_2953
                        .request(-81, 255, (byte) 0, this.anInt2957, true);
              }

              return null;
            }
          } else {
            try {
              if (var2 == null) {
                throw new RuntimeException();
              }

              this.aClass62_2944 = new FileTable(var2, this.anInt2955);
            } catch (RuntimeException var5) {
              this.aClass66_2953.method1252((byte) -107);
              this.aClass62_2944 = null;
              if (this.aClass66_2953.method1251((byte) -71)) {
                this.aClass3_Sub28_Sub10_2950 = null;
              } else {
                this.aClass3_Sub28_Sub10_2950 =
                    this.aClass66_2953.request(var1 + 120, 255, (byte) 0,
                        this.anInt2957, true);
              }

              return null;
            }

            if (this.aClass41_2943 != null) {
              this.aClass73_2956.method1305(this.aClass41_2943, 2, var2,
                  this.anInt2957);
            }
          }

          if (this.aClass41_2954 != null) {
            this.aByteArray2949 = new byte[this.aClass62_2944.anInt960];
            this.anInt2948 = 0;
          }

          this.aClass3_Sub28_Sub10_2950 = null;
          return this.aClass62_2944;
        }
      }
  }

  public void method2095(int var1, int var2 ) {
    if (this.aClass41_2954 != null) {
        Node var3;
        for (
          var3 = this.aClass61_2963
              .getFirst(); var3 != null; var3 = this.aClass61_2963
            .getNext()) {
          if ((var3.key == var1)) {
            return;
          }
        }

        int var4 = -66 / ((var2 - 53) / 56);
        var3 = new Node();
        var3.key = var1;
        this.aClass61_2963.addLast(var3);
      }
  }

  public int method2097(int var1, int var2 ) {
    if (var2 != '\uffff') {
        this.anInt2964 = 25;
      }

      AbstractFileRequest var3 = (AbstractFileRequest) this.aClass130_2946
          .get(
          var1);
      return var3 != null ? var3.method586(false) : 0;
  }

  public byte[] method2098(int var1, int var2 ) {
    AbstractFileRequest var3 = this.method2109(var2, var1, 103);
      if (var3 == null) {
        return null;
      } else {
        byte[] var4 = var3.method587(false);
        var3.unlinkNode();
        return var4;
      }
  }

  public void method2101(boolean var1 ) {
    if (this.aClass41_2954 != null) {
        this.aBoolean2965 = var1;
        if (this.aClass61_2966 == null) {
          this.aClass61_2966 = new Deque();
        }

      }
  }

  public int method2102(int var1 ) {
    if (var1 != 0) {
        this.method2106(-4);
      }

      return this.anInt2948;
  }

  public int method2106(int var1 ) {
    if (this.aClass62_2944 != null) {
        if (this.aBoolean2962) {
          Node var2 = this.aClass61_2966.getFirst();
          if (var2 != null) {
            if (var1 != 1) {
              this.anInt2964 = -91;
            }

            return (int) var2.key;
          } else {
            return 0;
          }
        } else {
          return this.aClass62_2944.anInt947;
        }
      } else {
        return 0;
      }
  }

  public void method2107(boolean var1 ) {
    if (var1) {
        if (this.aClass61_2966 != null) {
          if (this.method2094(0) == null) {
            return;
          }

          boolean var2;
          Node var3;
          int var4;
          if (this.aBoolean2962) {
            var2 = true;

            for (
                var3 = this.aClass61_2966.getFirst();
                var3 != null; var3 = this.aClass61_2966.getNext()) {
              var4 = (int) var3.key;
              if ((this.aByteArray2949[var4] == 0)) {
                this.method2109(1, var4, 51);
              }

              if ((this.aByteArray2949[var4] == 0)) {
                var2 = false;
              } else {
                var3.unlinkNode();
              }
            }

            while (this.aClass62_2944.unpackedSizes.length > this.anInt2964) {
              if ((this.aClass62_2944.unpackedSizes[this.anInt2964] == 0)) {
                ++this.anInt2964;
              } else {
                if ((this.aClass73_2956.anInt1087 >= 250)) {
                  var2 = false;
                  break;
                }

                if (this.aByteArray2949[this.anInt2964] == 0) {
                  this.method2109(1, this.anInt2964, 99);
                }

                if ((this.aByteArray2949[this.anInt2964] == 0)) {
                  var2 = false;
                  var3 = new Node();
                  var3.key = this.anInt2964;
                  this.aClass61_2966.addLast(var3);
                }

                ++this.anInt2964;
              }
            }

            if (var2) {
              this.aBoolean2962 = false;
              this.anInt2964 = 0;
            }
          } else {
            if (this.aBoolean2965) {
              var2 = true;

              for (
                  var3 = this.aClass61_2966.getFirst();
                  var3 != null; var3 = this.aClass61_2966.getNext()) {
                var4 = (int) var3.key;
                if (this.aByteArray2949[var4] != 1) {
                  this.method2109(2, var4, 96);
                }

                if (this.aByteArray2949[var4] == 1) {
                  var3.unlinkNode();
                } else {
                  var2 = false;
                }
              }

              while (this.aClass62_2944.unpackedSizes.length > this.anInt2964) {
                if ((this.aClass62_2944.unpackedSizes[this.anInt2964] == 0)) {
                  ++this.anInt2964;
                } else {
                  if (this.aClass66_2953.method1241(-30064)) {
                    var2 = false;
                    break;
                  }

                  if (this.aByteArray2949[this.anInt2964] != 1) {
                    this.method2109(2, this.anInt2964, 47);
                  }

                  if ((this.aByteArray2949[this.anInt2964] != 1)) {
                    var3 = new Node();
                    var3.key = this.anInt2964;
                    this.aClass61_2966.addLast(var3);
                    var2 = false;
                  }

                  ++this.anInt2964;
                }
              }

              if (var2) {
                this.anInt2964 = 0;
                this.aBoolean2965 = false;
              }
            } else {
              this.aClass61_2966 = null;
            }
          }
        }

        if (this.aBoolean2968 && this.aLong2967 <= GlobalStatics_10.getCurrentTimeMillis()) {
          for (AbstractFileRequest var6 = (AbstractFileRequest) this.aClass130_2946
              .getFirst(71);
               var6 != null; var6 = (AbstractFileRequest) this.aClass130_2946.getNext(-115)) {
            if (!var6.aBoolean3632) {
              if (var6.aBoolean3635) {
                if (!var6.aBoolean3628) {
                  throw new RuntimeException();
                }

                var6.unlinkNode();
              } else {
                var6.aBoolean3635 = true;
              }
            }
          }

          this.aLong2967 = 1000L + GlobalStatics_10.getCurrentTimeMillis();
        }

      }
  }

  public int method2108(byte var1 ) {
    if (this.aClass62_2944 != null) {
        if (var1 != 1) {
          GlobalStatics_7.anInt2958 = 100;
        }

        return this.aClass62_2944.anInt947;
      } else {
        return 0;
      }
  }

  private AbstractFileRequest method2109(int var1, int var2, int var3) {
    Node var4 = this.aClass130_2946.get(var2);
      if (var4 != null && (var1 == 0) && !((AbstractFileRequest) var4).aBoolean3628
        && ((AbstractFileRequest) var4).aBoolean3632) {
        var4.unlinkNode();
        var4 = null;
      }

      if (var4 == null) {
        if (var1 == 0) {
          if (this.aClass41_2954 != null && (this.aByteArray2949[var2] != -1)) {
            var4 = this.aClass73_2956
                .method1309(this.aClass41_2954, (byte) 106, var2);
          } else {
            if (this.aClass66_2953.method1251((byte) -83)) {
              return null;
            }

            var4 = this.aClass66_2953
                .request(-51, this.anInt2957, (byte) 2, var2, true);
          }
        } else if (var1 != 1) {
          if ((var1 != 2)) {
            throw new RuntimeException();
          }

          if (this.aClass41_2954 == null) {
            throw new RuntimeException();
          }

          if ((this.aByteArray2949[var2] != -1)) {
            throw new RuntimeException();
          }

          if (this.aClass66_2953.method1241(-30064)) {
            return null;
          }

          var4 = this.aClass66_2953
              .request(-37, this.anInt2957, (byte) 2, var2, false);
        } else {
          if (this.aClass41_2954 == null) {
            throw new RuntimeException();
          }

          var4 = this.aClass73_2956.method1307(var2, -27447, this.aClass41_2954);
        }

        this.aClass130_2946.put(var2, var4);
      }

      assert var4 != null;
      if (((AbstractFileRequest) var4).aBoolean3632) {
        return null;
      } else {
        byte[] var5 = ((AbstractFileRequest) var4).method587(false);
        int var6 = -57 % ((var3 + 10) / 55);
        int var7;
        OndemandFileRequest var12;
        if (var4 instanceof FileCacheRequest) {
          try {
            if (var5 != null && (var5.length > 2)) {
              GlobalStatics_10.aCRC32_3143.reset();
              GlobalStatics_10.aCRC32_3143.update(var5, 0, -2 + var5.length);
              var7 = (int) GlobalStatics_10.aCRC32_3143.getValue();
              if (this.aClass62_2944.anIntArray945[var2] == var7) {
                int var8 =
                    (var5[-2 + var5.length] << 8 & '\uff00') + (255 & var5[-1
                        + var5.length]);
                if ((var8 == ('\uffff'
                    & this.aClass62_2944.anIntArray958[var2]))) {
                  if (this.aByteArray2949[var2] != 1) {

                    ++this.anInt2948;
                    this.aByteArray2949[var2] = 1;
                  }

                  if (!((AbstractFileRequest) var4).aBoolean3628) {
                    var4.unlinkNode();
                  }

                  return (AbstractFileRequest) var4;
                } else {
                  throw new RuntimeException();
                }
              } else {
                throw new RuntimeException();
              }
            } else {
              throw new RuntimeException();
            }
          } catch (Exception var9) {
            this.aByteArray2949[var2] = -1;
            var4.unlinkNode();
            if (((AbstractFileRequest) var4).aBoolean3628 && !this.aClass66_2953
                .method1251(
              (byte) -78)) {
              var12 = this.aClass66_2953
                  .request(-13, this.anInt2957, (byte) 2, var2, true);
              this.aClass130_2946.put(var2, var12);
            }

            return null;
          }
        } else {
          try {
            if (var5 == null || (var5.length <= 2)) {
              throw new RuntimeException();
            }

            GlobalStatics_10.aCRC32_3143.reset();
            GlobalStatics_10.aCRC32_3143.update(var5, 0, var5.length - 2);
            var7 = (int) GlobalStatics_10.aCRC32_3143.getValue();
            if ((this.aClass62_2944.anIntArray945[var2] != var7)) {
              throw new RuntimeException();
            }

            this.aClass66_2953.anInt1011 = 0;
            this.aClass66_2953.anInt1010 = 0;
          } catch (RuntimeException var10) {
            this.aClass66_2953.method1252((byte) -67);
            var4.unlinkNode();
            if (((AbstractFileRequest) var4).aBoolean3628 && !this.aClass66_2953
                .method1251(
              (byte) 90)) {
              var12 = this.aClass66_2953
                  .request(112, this.anInt2957, (byte) 2, var2, true);
              this.aClass130_2946.put(var2, var12);
            }

            return null;
          }

          var5[var5.length - 2] = (byte) (this.aClass62_2944.anIntArray958[var2] >>> 8);
          var5[var5.length - 1] = (byte) this.aClass62_2944.anIntArray958[var2];
          if (this.aClass41_2954 != null) {
            this.aClass73_2956.method1305(this.aClass41_2954, 2, var5, var2);
            if (this.aByteArray2949[var2] != 1) {
              ++this.anInt2948;
              this.aByteArray2949[var2] = 1;
            }
          }

          if (!((AbstractFileRequest) var4).aBoolean3628) {
            var4.unlinkNode();
          }

          return (AbstractFileRequest) var4;
        }
      }
  }

  public void method2110(int var1 ) {
    if (this.aClass61_2966 != null) {
        if (this.method2094(var1) != null) {
          for (Node var2 = this.aClass61_2963.getFirst();
              var2 != null; var2 = this.aClass61_2963.getNext()) {
            int var3 = (int) var2.key;
            if (var3 >= 0 && this.aClass62_2944.anInt960 > var3
              && (this.aClass62_2944.unpackedSizes[var3] != 0)) {
              if (this.aByteArray2949[var3] == 0) {
                this.method2109(1, var3, var1 + 80);
              }

              if (this.aByteArray2949[var3] == -1) {
                this.method2109(2, var3, var1 + 78);
              }

              if ((this.aByteArray2949[var3] == 1)) {
                var2.unlinkNode();
              }
            } else {
              var2.unlinkNode();
            }
          }

        }
      }
  }

  public int method2111(int var1 ) {
    int var2 = -96 / ((20 - var1) / 33);
      return this.method2094(0) != null ?
        100 :
        (this.aClass3_Sub28_Sub10_2950 == null ?
          0 :
            this.aClass3_Sub28_Sub10_2950.method586(false));
  }

}
