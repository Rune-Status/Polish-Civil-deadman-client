package com.jagex.runescape;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Vector;

public class SignLink implements Runnable {

  public FileOnDisk[] cacheIndexFiles;
  public FileOnDisk cacheDataFile;
  public EventQueue eventQueue;
  public FileOnDisk tableIndexFile;
  public FileOnDisk aClass122_1207;
  private final Thread aThread1200;
  private boolean aBoolean1201;
  private SignLinkRequest aClass64_1203;
  private Sensor aSensor1206;
  private Display aDisplay1208;
  private final String gameName;
  private SignLinkRequest aClass64_1213;
  private final int anInt1215;
  private UnusedInterface0 anInterface1_1217;

  public SignLink(int var2, String gameName, int var4)
      throws IOException {
    GlobalStatics_9.aString1196 = "1.1";
    this.gameName = gameName;
    this.anInt1215 = var2;
    GlobalStatics_9.aString1216 = "Unknown";

    GlobalStatics_9.aString1216 = System.getProperty("java.vendor");
    GlobalStatics_9.aString1196 = System.getProperty("java.version");
    GlobalStatics_9.aString1205 = System.getProperty("os.name");
    GlobalStatics_9.formattedOsName = GlobalStatics_9.aString1205.toLowerCase();
    GlobalStatics_9.aString1218 = System.getProperty("os.arch").toLowerCase();
    GlobalStatics_9.aString1210 = System.getProperty("os.version").toLowerCase();
    GlobalStatics_9.aString1209 = System.getProperty("user.home");
    if (GlobalStatics_9.aString1209 != null) {
      GlobalStatics_9.aString1209 = GlobalStatics_9.aString1209 + "/";
    }

    if (GlobalStatics_9.aString1209 == null) {
      GlobalStatics_9.aString1209 = "~/";
    }
    this.eventQueue = Toolkit.getDefaultToolkit().getSystemEventQueue();

    this.aClass122_1207 =
        new FileOnDisk(
            GlobalStatics_9.openFile(this.gameName, true, "random.dat"),
            "rw",
            25L);
    this.cacheDataFile =
        new FileOnDisk(
            GlobalStatics_9.openFile(this.gameName, true,
                "main_file_cache.dat2"), "rw",
            104857600L);
    this.tableIndexFile =
        new FileOnDisk(GlobalStatics_9.openFile(this.gameName, true,
            "main_file_cache.idx255"),
            "rw", 1048576L);
    this.cacheIndexFiles = new FileOnDisk[var4];

    for (int var5 = 0; var4 > var5; ++var5) {
      this.cacheIndexFiles[var5] = new FileOnDisk(
          GlobalStatics_9.openFile(this.gameName, true,
              "main_file_cache.idx" + var5), "rw",
          1048576L);
    }

    try {
      this.aDisplay1208 = new Display();
    } catch (Throwable var9) {
    }

    try {
      this.aSensor1206 = new Sensor();
    } catch (Throwable var8) {
    }

    this.aBoolean1201 = false;
    this.aThread1200 = new Thread(this);
    this.aThread1200.setPriority(10);
    this.aThread1200.setDaemon(true);
    this.aThread1200.start();
  }

  public final void method1431(int var1) {
    if (var1 != 0) {
      this.method1442(null, 99);
    }

    GlobalStatics_9.aLong1221 = GlobalStatics_10.getCurrentTimeMillis() + 5000L;
  }

  public final boolean method1432(boolean var1) {
    if (var1) {
      this.cacheIndexFiles = null;
    }

    return this.aDisplay1208 != null;
  }

  public final SignLinkRequest getSettings(String var1, int var2) {
    if (var2 != 12) {
      this.aClass122_1207 = null;
    }

    return this.method1435(12, 0, var1, 0, var2 - 58);
  }

  public final SignLinkRequest method1434(int[] var1, int var2, int var3,
      Component var4,
      Point var5, int var6) {
    return var2 != 10000 ?
        null :
        this.method1435(17, var6, new Object[]{var4, var1, var5}, var3, -57);
  }

  private SignLinkRequest method1435(int var1, int var2, Object var3, int var4,
      int var5) {
    SignLinkRequest var6 = new SignLinkRequest();
    var6.anInt980 = var2;
    var6.anInt979 = var4;
    var6.anInt975 = var1;
    var6.anObject977 = var3;
    synchronized (this) {
      if (var5 >= -2) {
        return null;
      } else {
        if (this.aClass64_1203 != null) {
          this.aClass64_1203.aClass64_976 = var6;
          this.aClass64_1203 = var6;
        } else {
          this.aClass64_1203 = this.aClass64_1213 = var6;
        }

        this.notify();
        return var6;
      }
    }
  }

  public final SignLinkRequest method1436(Frame var1, int var2) {
    return this.method1435(7, 0, var1, 0, -112);
  }

  public final SignLinkRequest method1437(int var1, int var2, Component var3,
      int var4) {
    if (var1 == 14) {
      Point var5 = var3.getLocationOnScreen();
      return this
          .method1435(14, var4 + var5.y, null, var5.x + var2, var1 - 105);
    } else {
      return null;
    }
  }

  public final SignLinkRequest method1439(boolean var1, URL var2) {
    if (var1) {
      this.tableIndexFile = null;
    }

    return this.method1435(4, 0, var2, 0, -118);
  }

  public final SignLinkRequest method1440(boolean var1, int var2,
      Component var3) {
    int var4 = 34 % ((-10 - var2) / 52);
    return this.method1435(15, 0, var3, var1 ? 1 : 0, -84);
  }

  public final SignLinkRequest method1441(byte var1, String var2, int var3) {
    return var1 != 8 ? null : this.method1435(1, 0, var2, var3, -17);
  }

  public final SignLinkRequest method1442(Class var1, int var2) {
    return var2 != 0 ? null : this.method1435(11, 0, var1, 0, -5);
  }

  public final SignLinkRequest method1443(Class var1, Class[] var2, int var3,
      String var4) {
    if (var3 > -7) {
      GlobalStatics_9.aString1209 = null;
    }

    return this.method1435(8, 0, new Object[]{var1, var4, var2}, 0, -75);
  }

  public final void run() {
    while (true) {
      SignLinkRequest var1;
      synchronized (this) {
        while (true) {
          if (this.aBoolean1201) {
            return;
          }

          if (this.aClass64_1213 != null) {
            var1 = this.aClass64_1213;
            this.aClass64_1213 = this.aClass64_1213.aClass64_976;
            if (this.aClass64_1213 == null) {
              this.aClass64_1203 = null;
            }
            break;
          }

          try {
            this.wait();
          } catch (InterruptedException var11) {
          }
        }
      }

      try {
        int var2 = var1.anInt975;
        if (var2 == 1) {
          if (GlobalStatics_9.aLong1221 > GlobalStatics_10.getCurrentTimeMillis()) {
            throw new IOException();
          }

          String host = (String) var1.anObject977;
          int port = var1.anInt979;
          System.out.println("host = " + host);
          System.out.println("port = " + port);
          var1.result = new Socket(InetAddress.getByName(host), port);
        } else if (var2 != 2) {
          if ((var2 == 4)) {
            if (GlobalStatics_9.aLong1221 > GlobalStatics_10.getCurrentTimeMillis()) {
              throw new IOException();
            }

            var1.result = new DataInputStream(
                ((URL) var1.anObject977).openStream());
          } else {
            Object[] var3;
            if ((var2 == 8)) {
              var3 = (Object[]) var1.anObject977;
              if (((Class) var3[0]).getClassLoader() == null) {
                throw new SecurityException();
              }

              var1.result =
                  ((Class) var3[0])
                      .getDeclaredMethod((String) var3[1],
                          (Class<?>[]) var3[2]);
            } else {
              if ((var2 == 9)) {
                var3 = (Object[]) var1.anObject977;
                if (((Class) var3[0]).getClassLoader() == null) {
                  throw new SecurityException();
                }

                var1.result = ((Class) var3[0])
                    .getDeclaredField((String) var3[1]);
              } else {
                String var4;
                if ((var2 == 3)) {
                  if ((GlobalStatics_10.getCurrentTimeMillis() < GlobalStatics_9.aLong1221)) {
                    throw new IOException();
                  }

                  var4 =
                      (var1.anInt979 >> 24 & 255) + "." + (var1.anInt979 >> 16
                          & 255) + "." + (
                          var1.anInt979 >> 8 & 255) + "." + (255
                          & var1.anInt979);
                  var1.result = InetAddress.getByName(var4).getHostName();
                } else if ((var2 != 5)) {
                  if ((var2 == 6)) {
                    Frame var5 = new Frame("Jagex Full Screen");
                    var1.result = var5;
                    var5.setResizable(false);
                    this.aDisplay1208.method918(-56, var1.anInt980 & '\uffff',
                        var1.anInt980 >> 16, '\uffff' & var1.anInt979, var5,
                        var1.anInt979 >>> 16);
                  } else if ((var2 != 7)) {
                    if (var2 == 10) {
                    } else {
                      int var18;
                      if ((var2 == 11)) {
                        Field var20 = Class.forName("java.lang.ClassLoader")
                            .getDeclaredField("nativeLibraries");
                        var20.setAccessible(true);
                        Vector var24 =
                            (Vector) var20.get(
                                ((Class) var1.anObject977).getClassLoader());

                        for (var18 = 0; var24.size() > var18; ++var18) {
                          Object var26 = var24.elementAt(var18);
                          Method var9 = var26.getClass()
                              .getDeclaredMethod("finalize");
                          var9.setAccessible(true);
                          var9.invoke(var26);
                          var9.setAccessible(false);
                          Field var10 = var26.getClass()
                              .getDeclaredField("handle");
                          var10.setAccessible(true);
                          var10.set(var26, new Integer(0));
                          var10.setAccessible(false);
                        }

                        var20.setAccessible(false);
                      } else if ((var2 == 12)) {
                        var4 = (String) var1.anObject977;
                        FileOnDisk var19 = GlobalStatics_9
                            .openGamePreferences(false, var4);
                        var1.result = var19;
                      } else if ((var2 == 14)) {
                        int var22 = var1.anInt980;
                        int var23 = var1.anInt979;
                        this.aSensor1206.method1796(var23, -112, var22);
                      } else if (var2 == 15) {
                        boolean var21 = var1.anInt979 != 0;
                        Component var27 = (Component) var1.anObject977;
                        this.aSensor1206.method1797(var27, 1, var21);
                      } else if (var2 != 17) {
                        if (var2 != 16) {
                          throw new Exception();
                        }

                        try {
                          if (!GlobalStatics_9.formattedOsName.startsWith("win")) {
                            throw new Exception();
                          }

                          var4 = (String) var1.anObject977;
                          if (!var4.startsWith("http://") && !var4
                              .startsWith("https://")) {
                            throw new Exception();
                          }

                          String var25 =
                              "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

                          for (var18 = 0; var18 < var4.length(); ++var18) {
                            if ((var25.indexOf(var4.charAt(var18)) == -1)) {
                              throw new Exception();
                            }
                          }

                          Runtime.getRuntime()
                              .exec("cmd /c start \"j\" \"" + var4 + "\"");
                          var1.result = null;
                        } catch (Exception var12) {
                          var1.result = var12;
                        }
                      } else {
                        var3 = (Object[]) var1.anObject977;
                        this.aSensor1206
                            .method1795((byte) 113, (Point) var3[2],
                                var1.anInt979,
                                (Component) var3[0], var1.anInt980,
                                (int[]) var3[1]);
                      }
                    }
                  } else {
                    this.aDisplay1208.method920(-117);
                  }
                } else {
                  var1.result = this.aDisplay1208.method919(true);
                }
              }
            }
          }
        } else {
          Thread var16 = new Thread((Runnable) var1.anObject977);
          var16.setDaemon(true);
          var16.start();
          var16.setPriority(var1.anInt979);
          var1.result = var16;
        }

        var1.status = 1;
      } catch (Exception var14) {
        var14.printStackTrace();
        var1.status = 2;
      }
    }
  }

  public final SignLinkRequest method1444(int var1, Class var2) {
    if (var1 > -13) {
      this.method1435(88, -20, null, 76, -127);
    }

    return this.method1435(10, 0, var2, 0, -113);
  }

  public final void method1445(int var1) {
    synchronized (this) {
      this.aBoolean1201 = true;
      this.notifyAll();
    }

    try {
      this.aThread1200.join();
    } catch (InterruptedException var8) {
    }

    if (var1 != 0) {
      GlobalStatics_9.openGamePreferences(false, null);
    }

    if (this.cacheDataFile != null) {
      try {
        this.cacheDataFile.close(var1 ^ 1);
      } catch (IOException var7) {
      }
    }

    if (this.tableIndexFile != null) {
      try {
        this.tableIndexFile.close(1);
      } catch (IOException var6) {
      }
    }

    if (this.cacheIndexFiles != null) {
      for (int var2 = 0; this.cacheIndexFiles.length > var2; ++var2) {
        if (this.cacheIndexFiles[var2] != null) {
          try {
            this.cacheIndexFiles[var2].close(var1 ^ 1);
          } catch (IOException var5) {
          }
        }
      }
    }

    if (this.aClass122_1207 != null) {
      try {
        this.aClass122_1207.close(var1 + 1);
      } catch (IOException var4) {
      }
    }

  }

  public final UnusedInterface0 method1446(byte var1) {
    if (var1 < 71) {
      this.method1452(null, true);
    }

    return this.anInterface1_1217;
  }

  public final SignLinkRequest method1447(int var1, String var2, Class var3) {
    if (var1 > -39) {
      this.method1452(null, true);
    }

    return this.method1435(9, 0, new Object[]{var3, var2}, 0, -43);
  }

  public final SignLinkRequest method1449(int var1, int var2) {
    if (var1 != 3) {
      this.tableIndexFile = null;
    }

    return this.method1435(3, 0, null, var2, var1 - 96);
  }

  public final SignLinkRequest method1450(int var1, int var2, int var3,
      int var4, int var5) {
    int var6 = -68 % ((var5 - 4) / 53);
    return this
        .method1435(6, var1 + (var2 << 16), null, (var4 << 16) + var3, -49);
  }

  public final SignLinkRequest createThread(int var1, int var2, Runnable var3) {
    return var1 != 0 ? null : this.method1435(2, 0, var3, var2, -27);
  }

  public final SignLinkRequest method1452(String var1, boolean var2) {
    if (!var2) {
      this.method1436(null, 101);
    }

    return this.method1435(16, 0, var1, 0, -10);
  }

  public final SignLinkRequest method1453(byte var1) {
    if (var1 < 7) {
      this.method1443(null, null, -91, null);
    }

    return this.method1435(5, 0, null, 0, -127);
  }

}
