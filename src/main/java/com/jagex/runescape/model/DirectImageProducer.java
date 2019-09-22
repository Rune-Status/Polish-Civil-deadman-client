package com.jagex.runescape.model;

import com.jagex.runescape.statics.GlobalStatics_7;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public final class DirectImageProducer extends AbstractImageProducer
    implements ImageProducer, ImageObserver {

  private ImageConsumer anImageConsumer2978;
  private ColorModel aColorModel2979;

  public synchronized void addConsumer(ImageConsumer var1) {
    this.anImageConsumer2978 = var1;
    var1.setDimensions(this.anInt2012, this.anInt2011);
    var1.setProperties(null);
    var1.setColorModel(this.aColorModel2979);
    var1.setHints(14);
  }

  public synchronized boolean isConsumer(ImageConsumer var1) {
    return this.anImageConsumer2978 == var1;
  }

  public synchronized void removeConsumer(ImageConsumer var1) {
    if (this.anImageConsumer2978 == var1) {
      this.anImageConsumer2978 = null;
    }
  }

  public void startProduction(ImageConsumer var1) {
    this.addConsumer(var1);
  }

  public void requestTopDownLeftRightResend(ImageConsumer var1) {
  }

  private synchronized void method2188(int var1, int var2, int var3, byte var4,
      int var5) {
    if (this.anImageConsumer2978 != null) {
      this.anImageConsumer2978.setPixels(var3, var5, var1, var2,
          this.aColorModel2979,
          this.anIntArray2007, var5 * this.anInt2012 + var3, this.anInt2012);
      this.anImageConsumer2978.imageComplete(2);
      if (var4 > -29) {
        GlobalStatics_7.method2189(null, false, -53);
      }

    }
  }

  private synchronized void method2190(int var1) {
    if (var1 == 19661184) {
      if (this.anImageConsumer2978 != null) {
        this.anImageConsumer2978
            .setPixels(0, 0, this.anInt2012, this.anInt2011,
                this.aColorModel2979, this.anIntArray2007, 0, this.anInt2012);
        this.anImageConsumer2978.imageComplete(2);
      }
    }
  }

  public void draw(int var1, int var2, Graphics var3, int var4) {
    if (var4 != 0) {
      GlobalStatics_7.aBoolean2981 = true;
    }

    this.method2190(var4 ^ 19661184);
    var3.drawImage(this.anImage2009, var1, var2, this);
  }

  public void draw(Graphics var5, int var1, int var2, int var4, int var6,
      int var3) {
    this.method2188(var1, var4, var2, (byte) -124, var6);
    if (var3 == 6260) {
      Shape var7 = var5.getClip();
      var5.clipRect(var2, var6, var1, var4);
      var5.drawImage(this.anImage2009, 0, 0, this);
      var5.setClip(var7);
    }
  }

  public void setDimensions(int var1, boolean var2, int var3,
      Component var4) {
    this.anInt2011 = var1;
    this.anIntArray2007 = new int[var3 * var1 + 1];
    this.anInt2012 = var3;
    this.aColorModel2979 = new DirectColorModel(32, 16711680, 0xff00, 255);
    this.anImage2009 = var4.createImage(this);
    this.method2190(19661184);
    var4.prepareImage(this.anImage2009, this);
    this.method2190(19661184);
    var4.prepareImage(this.anImage2009, this);
    this.method2190(19661184);
    var4.prepareImage(this.anImage2009, this);
    this.method2182(0);
    if (var2) {
      this.addConsumer(null);
    }
  }

  public boolean imageUpdate(Image var1, int var2, int var3, int var4, int var5,
      int var6) {
    return true;
  }

}
