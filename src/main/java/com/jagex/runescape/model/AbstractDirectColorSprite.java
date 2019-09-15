package com.jagex.runescape.model;

import com.jagex.runescape.node.SubNode;

public abstract class AbstractDirectColorSprite extends SubNode {

  public int anInt3696;
  public int anInt3697;
  public int anInt3698;
  public int anInt3701;
  public int anInt3706;
  public int anInt3707;

  public abstract void method635(int var1,int var2 );

  public abstract void method636(int var1,int var2,int var3,int var4,int var5,int var6 );

  public abstract void method637(int var1,int var2,int var3 );

  public abstract void draw(int var1,int var2,int var3,int var4 );

  public final void method640(int var1, int var2, int var3, int var4, int var5) {
    if (var5 == -1470985020) {
        int var6 = this.anInt3697 << 3;
        int var7 = this.anInt3706 << 3;
        var4 = (var4 << 4) + (var6 & 15);
        var1 = (var1 << 4) + (15 & var7);
        this.method636(var6, var7, var4, var1, var2, var3);
      }
  }

  public abstract void method641(int var1,int var2 );

  public abstract void method642(int var1,int var2,int var3,int var4,int var5 );

  public abstract void method643(int var1,int var2 );

}
