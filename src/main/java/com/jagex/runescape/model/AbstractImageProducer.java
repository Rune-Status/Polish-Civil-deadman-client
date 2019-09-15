package com.jagex.runescape.model;

import com.jagex.runescape.statics.DummyClass47;
import com.jagex.runescape.statics.GlobalStatics_5;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

public abstract class AbstractImageProducer {

  public int[] anIntArray2007;
  public Image anImage2009;
  public int anInt2011;
  public int anInt2012;

  public abstract void draw(int var1,int var2,Graphics var3,int var4 );

  public final void method2182(int var1) {
    DummyClass47.method1319(this.anIntArray2007, this.anInt2012,
          this.anInt2011);
      if (var1 != 0) {
        GlobalStatics_5.anInt2015 = -118;
      }
  }

  public abstract void draw(Graphics var5,int var1,int var2,int var4,int var6,int var3 );

  public abstract void setDimensions(int var1,boolean var2,int var3,Component var4 );

}
