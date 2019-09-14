package com.jagex.runescape;

public abstract class AbstractDirectColorSprite extends SubNode {

  public static int anInt3699;
  public static GameString COMMAND_CARD_MEMORY = GameString.create("::cardmem");
  public static GameString aClass94_3702 = GameString.create(" )2> <col=ffff00>");
  public static GameString aClass94_3703 = GameString.create(" )2> ");
  public static int anInt3704;
  public static GameString aClass94_3705 = GameString.create("W-=hlen Sie eine Option");
  public static Widget aClass11_3708;
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

  public static void method634(byte var0) {
    AbstractDirectColorSprite.aClass11_3708 = null;
      AbstractDirectColorSprite.aClass94_3702 = null;
      AbstractDirectColorSprite.aClass94_3705 = null;
      if (var0 == 108) {
        AbstractDirectColorSprite.aClass94_3703 = null;
        AbstractDirectColorSprite.COMMAND_CARD_MEMORY = null;
      }
  }

  public static Widget method638(byte var0, int var1, int var2) {
    Widget var3 = EnumStringFetcher.getWidget((byte) 109, var1);
      return (var2 == -1) ?
        var3 :
        (var0 != -19 ?
          null :
          (var3 != null && var3.aClass11Array262 != null && var3.aClass11Array262.length > var2 ?
            var3.aClass11Array262[var2] :
            null));
  }

}
