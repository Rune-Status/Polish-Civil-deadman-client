package com.jagex.runescape.model;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.node.SubNode;
import com.jagex.runescape.statics.DummyClass50;
import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_9;

public final class WidgetUpdate extends SubNode {

  public int anInt3596;
  public int anInt3597;
  public int anInt3598;
  public GameString text;


  public WidgetUpdate(int var1, int var2 ) {
    this.key = (long) var1 << 32 | var2;
  }

  public void createIndexedColorSprite(boolean var1 ) {
    this.subnodeKey = GlobalStatics_10.getCurrentTimeMillis() + 500L | Long.MIN_VALUE & this.subnodeKey;
      if (!var1) {
        GlobalStatics_10.f(-42);
      }

      DummyClass50.aClass13_1139.addLast(this);
  }

  public long b(boolean var1 ) {
    if (!var1) {
        this.e(90);
      }

      return this.subnodeKey & Long.MAX_VALUE;
  }

  public int e(int var1 ) {
    if (var1 != 2063817568) {
        this.anInt3598 = -47;
      }

      return (int) (255L & this.key >>> 32);
  }

  public int f(byte var1 ) {
    int var2 = -88 / ((var1 - 83) / 34);
      return (int) this.key;
  }

  public void g(byte var1 ) {
    this.subnodeKey |= Long.MIN_VALUE;
      if ((this.b(true) == 0L)) {
        GlobalStatics_9.aClass13_1666.addLast(this);
      }

      if (var1 != 33) {
        GlobalStatics_10.anInt3600 = 3;
      }
  }

}
