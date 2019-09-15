package com.jagex.runescape.statics;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.model.Mouse;
import com.jagex.runescape.opengl.GLStatics;

public final class DummyClass30 {

  public static GameString aClass94_458 = GameStringStatics
      .create("Opened title screen");
  public static int anInt452;
  public static int anInt453;
  public static int viewWidth;
  public static int anInt455;
  public static int anInt456;
  public static GameString aClass94_459 = DummyClass30.aClass94_458;

  public static void method937(int var0) {
    GLStatics.adjacentTileOnScreen = null;
    DummyClass30.aClass94_458 = null;

    DummyClass30.aClass94_459 = null;
  }

  public static void method938(int var0, int var1, int var2, int var3, int var4,
      int var5, int var6,
      int var7, int var8) {
    if (var6 != 1) {
      DummyClass30.aClass94_458 = null;
    }

    int var9 = var2 - var7;
    int var10 = var3 - var8;
    int var11 = (-var1 + var0 << 16) / var9;
    int var12 = (-var5 + var4 << 16) / var10;
    GlobalStatics_9
        .method1814(var1, var3, var2, var12, var7, 0, 0, 127, var11, var8,
            var5);
  }

  public static Buffer method939(byte var0) {
    Buffer var1 = new Buffer(34);
    var1.writeByte(11);
    var1.writeByte(GlobalStatics_4.brightnessSetting);
    var1.writeByte(!GlobalStatics_7.aBoolean3665 ? 0 : 1);
    var1.writeByte(GlobalStatics_2.aBoolean3604 ? 1 : 0);
    var1.writeByte(GlobalStatics_9.aBoolean1905 ? 1 : 0);
    var1.writeByte(GlobalStatics_9.aBoolean488 ? 1 : 0);
    var1.writeByte(!GlobalStatics_10.aBoolean236 ? 0 : 1);
    var1.writeByte(!GlobalStatics_9.aBoolean2623 ? 0 : 1);
    var1.writeByte(GlobalStatics_9.aBoolean3275 ? 1 : 0);
    var1.writeByte(!GlobalStatics_9.aBoolean2910 ? 0 : 1);
    var1.writeByte(GLStatics.anInt1137);
    var1.writeByte(!GLStatics.useBumpMaps ? 0 : 1);
    var1.writeByte(GLStatics.aBoolean1685 ? 1 : 0);
    var1.writeByte(DummyClass35.aBoolean661 ? 1 : 0);
    var1.writeByte(GlobalStatics_9.anInt3622);
    var1.writeByte(!GlobalStatics_1.aBoolean3184 ? 0 : 1);
    var1.writeByte(GlobalStatics_7.anInt2453);
    var1.writeByte(GlobalStatics_10.anInt120);
    var1.writeByte(DummyClass28.anInt340);
    var1.writeShort(GlobalStatics_3.anInt2378);
    var1.writeShort(GlobalStatics_10.anInt3071);
    var1.writeByte(DummyClass0.method1757());
    var1.writeInt(GlobalStatics_0.anInt2148);
    var1.writeByte(GlobalStatics_2.anInt2577);
    var1.writeByte(GlobalStatics_0.safemode ? 1 : 0);
    var1.writeByte(!GlobalStatics_2.aBoolean346 ? 0 : 1);
    var1.writeByte(GlobalStatics_10.anInt2488);
    var1.writeByte(GlobalStatics_7.aBoolean1080 ? 1 : 0);
    var1.writeByte(DummyClass4.aBoolean3004 ? 1 : 0);
    return var1;
  }

  public static void method940(int var0, int var1) {
    if (var0 >= 101) {
      Mouse var2 = GlobalStatics_9.INSTANCE;
      synchronized (var2) {
        GlobalStatics_9.anInt4045 = var1;
      }
    }
  }

}
