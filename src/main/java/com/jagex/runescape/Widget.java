package com.jagex.runescape;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.opengl.GlDirectColorSprite;
import com.jagex.runescape.opengl.GlDirectFullColorSprite;
import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.shader.MaterialShader5;

public final class Widget {

  public static GameString EVENT_OP_BASE = GameString.create("event_opbase");
  public static boolean aBoolean236 = true;
  public static float aFloat246;
  public static GameString aClass94_251;
  public static long aLong261;
  public static int anInt278 = -1;
  public static GameString aClass94_297 = GameString.create("Nehmen");
  public boolean aBoolean155;
  public Object[] anObjectArray156;
  public boolean aBoolean157;
  public Object[] anObjectArray158;
  public Object[] anObjectArray159;
  public int anInt160 = 1;
  public Object[] anObjectArray161;
  public byte aByte162;
  public boolean aBoolean163;
  public int anInt164 = 100;
  public Object[] anObjectArray165;
  public int anInt166;
  public boolean aBoolean167;
  public int anInt168;
  public short aShort169 = 3000;
  public Object[] anObjectArray170;
  public GameString[] aClass94Array171;
  public GameString aClass94_172;
  public GameString[] aClass94Array173;
  public Object[] anObjectArray174;
  public int[] anIntArray175;
  public Object[] anObjectArray176;
  public int anInt177;
  public boolean aBoolean178;
  public int anInt179;
  public Object[] anObjectArray180;
  public boolean aBoolean181;
  public int rotationX0;
  public Object[] anObjectArray183;
  public int anInt184;
  public int[] anIntArray185;
  public boolean aBoolean186;
  public int anInt187;
  public boolean aBoolean188;
  public int anInt189;
  public int anInt190;
  public int anInt191 = -1;
  public int anInt192;
  public int anInt193;
  public int anInt194;
  public boolean aBoolean195;
  public int[] anIntArray197;
  public int anInt198 = -1;
  public boolean aBoolean199;
  public boolean aBoolean200;
  public int anInt201;
  public int anInt202;
  public Object[] anObjectArray203;
  public int anInt204;
  public int anInt205;
  public Object[] anObjectArray206;
  public int[] anIntArray207;
  public int anInt208;
  public int anInt210;
  public int[] anIntArray211;
  public int anInt212;
  public int anInt213;
  public int anInt214;
  public boolean aBoolean215;
  public int anInt216;
  public Object[] anObjectArray217;
  public int anInt218;
  public boolean aBoolean219;
  public Object[] anObjectArray220;
  public Object[] anObjectArray221;
  public int anInt222;
  public int anInt223;
  public int anInt224 = -1;
  public int anInt225;
  public boolean aBoolean226;
  public boolean aBoolean227;
  public int anInt228;
  public Object[] anObjectArray229;
  public int anInt230;
  public byte[] aByteArray231;
  public GameString aClass94_232;
  public boolean aBoolean233;
  public int anInt234;
  public Object[] anObjectArray235;
  public int anInt237;
  public int anInt238 = -1;
  public Object[] anObjectArray239;
  public int anInt240;
  public byte aByte241;
  public int anInt242;
  public GameString aClass94_243;
  public int anInt244;
  public GameString aClass94_245;
  public int anInt247;
  public Object[] anObjectArray248;
  public int[] anIntArray249;
  public int anInt250 = 1;
  public int anInt252;
  public int anInt253;
  public int[] anIntArray254;
  public int anInt255;
  public Object[] anObjectArray256;
  public WidgetAccess aClass3_Sub1_257;
  public int anInt258;
  public int anInt259;
  public int anInt260;
  public Widget[] aClass11Array262;
  public byte[] aByteArray263;
  public int anInt264;
  public int anInt265;
  public int anInt266;
  public int anInt267;
  public Object[] anObjectArray268;
  public Object[] anObjectArray269;
  public int anInt270;
  public int anInt271;
  public int[] anIntArray272;
  public byte aByte273;
  public int[] anIntArray274;
  public int[] anIntArray275;
  public Object[] anObjectArray276;
  public GameString aClass94_277;
  public int anInt279;
  public int rotationZ;
  public Object[] anObjectArray281;
  public Object[] anObjectArray282;
  public int anInt283;
  public int anInt284;
  public int anInt285;
  public int[] anIntArray286;
  public int anInt287;
  public int anInt288;
  public GameString aClass94_289;
  public int anInt290;
  public int[] anIntArray291;
  public int anInt292;
  public short aShort293;
  public Object[] anObjectArray295;
  public int anInt296;
  public int[][] anIntArrayArray298;
  public int[] anIntArray299;
  public int[] anIntArray300;
  public int anInt301;
  public Widget aClass11_302;
  public Object[] anObjectArray303;
  public byte aByte304;
  public int anInt305;
  public int anInt306;
  public int[] anIntArray307;
  public int rotationY;
  public boolean aBoolean309;
  public int[] anIntArray310;
  public int anInt311;
  public int anInt312;
  public Object[] anObjectArray313;
  public Object[] anObjectArray314;
  public Object[] anObjectArray315;
  public int anInt316;
  public int[] anIntArray317;
  public int anInt318;
  private int anInt196;
  private int anInt294;


  public Widget() {
    this.aClass94_243 = MaterialShader5.aClass94_2171;
    this.aBoolean163 = false;
    this.anInt225 = 0;
    this.anInt212 = -1;
    this.aBoolean167 = false;
    this.anInt266 = -1;
    this.aByte241 = 0;
    this.anInt252 = 0;
    this.aBoolean200 = false;
    this.aBoolean215 = false;
    this.anInt204 = -1;
    this.anInt260 = 1;
    this.anInt228 = 0;
    this.aBoolean233 = false;
    this.aClass3_Sub1_257 = DirectImageProducer.aClass3_Sub1_2980;
    this.anInt253 = 0;
    this.aClass94_232 = MaterialShader5.aClass94_2171;
    this.anInt168 = 0;
    this.anInt247 = 0;
    this.aBoolean219 = false;
    this.anInt196 = -1;
    this.anInt190 = -1;
    this.anInt216 = 1;
    this.anInt192 = -1;
    this.anInt222 = 0;
    this.anInt264 = 0;
    this.aClass94_277 = MaterialShader5.aClass94_2171;
    this.anInt284 = 0;
    this.anInt177 = 0;
    this.anInt285 = 0;
    this.anInt234 = -1;
    this.aBoolean157 = false;
    this.anInt184 = 0;
    this.anInt223 = 0;
    this.anInt258 = 0;
    this.aClass94_245 = MaterialShader5.aClass94_2171;
    this.anInt237 = 0;
    this.aClass94_172 = MaterialShader5.aClass94_2171;
    this.anInt288 = 0;
    this.anInt265 = -1;
    this.anInt242 = 0;
    this.anInt259 = 0;
    this.anInt290 = 0;
    this.anInt244 = 0;
    this.anInt279 = -1;
    this.anInt296 = -1;
    this.aByte273 = 0;
    this.anInt267 = 0;
    this.anInt270 = -1;
    this.anInt240 = 0;
    this.anInt255 = 0;
    this.aShort293 = 0;
    this.anInt301 = 0;
    this.anInt305 = -1;
    this.aClass94_289 = DummyClass27.aClass94_1583;
    this.rotationZ = 0;
    this.anInt271 = 0;
    this.anInt292 = -1;
    this.anInt189 = 0;
    this.anInt287 = 0;
    this.aClass11_302 = null;
    this.anInt311 = 0;
    this.anInt202 = 1;
    this.aBoolean309 = false;
    this.aByte304 = 0;
    this.anInt294 = 1;
    this.anInt312 = 0;
    this.rotationY = 0;
    this.aBoolean195 = false;
    this.anInt316 = 0;
    this.anInt306 = 0;
    this.anInt166 = 0;
    this.aBoolean227 = true;
    this.anInt283 = 0;
    this.anInt213 = 0;
    this.anInt218 = 0;
    this.anInt318 = 0;
  }

  public void method854(int var1, int var2, byte var3 ) {
    if (this.anIntArray249 == null || (this.anIntArray249.length <= var1)) {
        int[] var4 = new int[1 + var1];
        if (this.anIntArray249 != null) {
          int var5;
          for (var5 = 0; this.anIntArray249.length > var5; ++var5) {
            var4[var5] = this.anIntArray249[var5];
          }

          for (var5 = this.anIntArray249.length; var1 > var5; ++var5) {
            var4[var5] = -1;
          }
        }

        this.anIntArray249 = var4;
      }

      this.anIntArray249[var1] = var2;
      if (var3 != 43) {
        this.anIntArray211 = null;
      }
  }

  public boolean method855(int var1 ) {
    if (this.anIntArray207 != null) {
        return true;
      } else {
        SoftwareIndexedColorSprite var2 =
          GameString.createSprite(0, true, this.anInt224, SomethingSceneJ.aClass153_323);
        if (var2 == null) {
          return false;
        } else {
          var2.method1675();
          this.anIntArray207 = new int[var2.height];
          this.anIntArray291 = new int[var2.height];
          int var3 = 0;

          while ((var3 < var2.height)) {
            int var4 = 0;
            int var5 = var2.width;
            int var6 = 0;

            while (true) {
              if ((var6 < var2.width)) {
                if ((var2.aByteArray2674[var2.width * var3 + var6] == 0)) {
                  ++var6;
                  continue;
                }

                var4 = var6;
              }

              for (var6 = var4; var2.width > var6; ++var6) {
                if (var2.aByteArray2674[var3 * var2.width + var6] == 0) {
                  var5 = var6;
                  break;
                }
              }

              this.anIntArray207[var3] = var4;
              this.anIntArray291[var3] = var5 - var4;
              ++var3;
              break;
            }
          }

          if (var1 != -30721) {
            this.anInt205 = -68;
          }

          return true;
        }
      }
  }

  public void method857(byte var1, GameString var2, int var3 ) {
    if (this.aClass94Array171 == null || (this.aClass94Array171.length <= var3)) {
        GameString[] var4 = new GameString[1 + var3];
        if (this.aClass94Array171 != null) {
          for (int var5 = 0; this.aClass94Array171.length > var5; ++var5) {
            var4[var5] = this.aClass94Array171[var5];
          }
        }

        this.aClass94Array171 = var4;
      }

      this.aClass94Array171[var3] = var2;
      int var7 = -124 % ((-10 - var1) / 60);
  }

  public void method858(int var1, Buffer var2 ) {
    if (var1 >= -94) {
        this.anInt214 = -74;
      }

      this.aBoolean233 = false;
      this.anInt187 = var2.readUnsignedByte();
      this.anInt318 = var2.readUnsignedByte();
      this.anInt189 = var2.readUnsignedShort();
      this.anInt316 = var2.method787((byte) 100);
      this.anInt166 = var2.method787((byte) 109);
      this.anInt177 = var2.readUnsignedShort();
      this.anInt244 = var2.readUnsignedShort();
      this.aByte304 = 0;
      this.aByte241 = 0;
      this.aByte273 = 0;
      this.aByte162 = 0;
      this.anInt223 = var2.readUnsignedByte();
      this.anInt190 = var2.readUnsignedShort();
      if ((this.anInt190 == 65535)) {
        this.anInt190 = -1;
      } else {
        this.anInt190 += -65536 & this.anInt279;
      }

      this.anInt212 = var2.readUnsignedShort();
      if ((this.anInt212 == 65535)) {
        this.anInt212 = -1;
      }

      int var3 = var2.readUnsignedByte();
      int var4;
      if ((var3 > 0)) {
        this.anIntArray307 = new int[var3];
        this.anIntArray275 = new int[var3];

        for (var4 = 0; var3 > var4; ++var4) {
          this.anIntArray275[var4] = var2.readUnsignedByte();
          this.anIntArray307[var4] = var2.readUnsignedShort();
        }
      }

      var4 = var2.readUnsignedByte();
      int var5;
      int var6;
      int var7;
      if ((var4 > 0)) {
        this.anIntArrayArray298 = new int[var4][];

        for (var5 = 0; var4 > var5; ++var5) {
          var6 = var2.readUnsignedShort();
          this.anIntArrayArray298[var5] = new int[var6];

          for (var7 = 0; (var7 < var6); ++var7) {
            this.anIntArrayArray298[var5][var7] = var2.readUnsignedShort();
            if ((this.anIntArrayArray298[var5][var7] == 65535)) {
              this.anIntArrayArray298[var5][var7] = -1;
            }
          }
        }
      }

      if ((this.anInt187 == 0)) {
        this.anInt252 = var2.readUnsignedShort();
        this.aBoolean155 = var2.readUnsignedByte() == 1;
      }

      if ((this.anInt187 == 1)) {
        var2.readUnsignedShort();
        var2.readUnsignedByte();
      }

      var5 = 0;
      if ((this.anInt187 == 2)) {
        this.aByte241 = 3;
        this.anIntArray317 = new int[this.anInt177 * this.anInt244];
        this.anIntArray254 = new int[this.anInt244 * this.anInt177];
        this.aByte304 = 3;
        var6 = var2.readUnsignedByte();
        var7 = var2.readUnsignedByte();
        if ((var6 == 1)) {
          var5 |= 268435456;
        }

        int var8 = var2.readUnsignedByte();
        if ((var7 == 1)) {
          var5 |= 1073741824;
        }

        if (var8 == 1) {
          var5 |= Integer.MIN_VALUE;
        }

        int var9 = var2.readUnsignedByte();
        if (var9 == 1) {
          var5 |= 536870912;
        }

        this.anInt285 = var2.readUnsignedByte();
        this.anInt290 = var2.readUnsignedByte();
        this.anIntArray300 = new int[20];
        this.anIntArray272 = new int[20];
        this.anIntArray197 = new int[20];

        int var10;
        for (var10 = 0; var10 < 20; ++var10) {
          int var11 = var2.readUnsignedByte();
          if (var11 == 1) {
            this.anIntArray272[var10] = var2.method787((byte) 110);
            this.anIntArray300[var10] = var2.method787((byte) 58);
            this.anIntArray197[var10] = var2.readInt();
          } else {
            this.anIntArray197[var10] = -1;
          }
        }

        this.aClass94Array173 = new GameString[5];

        for (var10 = 0; var10 < 5; ++var10) {
          GameString var14 = var2.readString();
          if ((var14.getLength() > 0)) {
            this.aClass94Array173[var10] = var14;
            var5 |= 1 << 23 + var10;
          }
        }
      }

      if (this.anInt187 == 3) {
        this.aBoolean226 = var2.readUnsignedByte() == 1;
      }

      if (this.anInt187 == 4 || this.anInt187 == 1) {
        this.anInt194 = var2.readUnsignedByte();
        this.anInt225 = var2.readUnsignedByte();
        this.anInt205 = var2.readUnsignedByte();
        this.anInt270 = var2.readUnsignedShort();
        if ((this.anInt270 == 65535)) {
          this.anInt270 = -1;
        }

        this.aBoolean215 = var2.readUnsignedByte() == 1;
      }

      if (this.anInt187 == 4) {
        this.aClass94_232 = var2.readString();
        this.aClass94_172 = var2.readString();
      }

      if (this.anInt187 == 1 || this.anInt187 == 3 || this.anInt187 == 4) {
        this.anInt218 = var2.readInt();
      }

      if ((this.anInt187 == 3) || (this.anInt187 == 4)) {
        this.anInt253 = var2.readInt();
        this.anInt228 = var2.readInt();
        this.anInt222 = var2.readInt();
      }

      if ((this.anInt187 == 5)) {
        this.anInt224 = var2.readInt();
        this.anInt296 = var2.readInt();
      }

      if (this.anInt187 == 6) {
        this.anInt202 = 1;
        this.anInt201 = var2.readUnsignedShort();
        this.anInt294 = 1;
        if (this.anInt201 == '\uffff') {
          this.anInt201 = -1;
        }

        this.anInt196 = var2.readUnsignedShort();
        if (this.anInt196 == '\uffff') {
          this.anInt196 = -1;
        }

        this.anInt305 = var2.readUnsignedShort();
        if ((this.anInt305 == 65535)) {
          this.anInt305 = -1;
        }

        this.anInt198 = var2.readUnsignedShort();
        if (this.anInt198 == '\uffff') {
          this.anInt198 = -1;
        }

        this.anInt164 = var2.readUnsignedShort();
        this.rotationX0 = var2.readUnsignedShort();
        this.rotationY = var2.readUnsignedShort();
      }

      if (this.anInt187 == 7) {
        this.aByte241 = 3;
        this.aByte304 = 3;
        this.anIntArray317 = new int[this.anInt244 * this.anInt177];
        this.anIntArray254 = new int[this.anInt177 * this.anInt244];
        this.anInt194 = var2.readUnsignedByte();
        this.anInt270 = var2.readUnsignedShort();
        if ((this.anInt270 == 65535)) {
          this.anInt270 = -1;
        }

        this.aBoolean215 = (var2.readUnsignedByte() == 1);
        this.anInt218 = var2.readInt();
        this.anInt285 = var2.method787((byte) 31);
        this.anInt290 = var2.method787((byte) 83);
        var6 = var2.readUnsignedByte();
        if ((var6 == 1)) {
          var5 |= 1073741824;
        }

        this.aClass94Array173 = new GameString[5];

        for (var7 = 0; var7 < 5; ++var7) {
          GameString var13 = var2.readString();
          if (var13.getLength() > 0) {
            this.aClass94Array173[var7] = var13;
            var5 |= 1 << 23 + var7;
          }
        }
      }

      if (this.anInt187 == 8) {
        this.aClass94_232 = var2.readString();
      }

      if ((this.anInt318 == 2) || (this.anInt187 == 2)) {
        this.aClass94_245 = var2.readString();
        this.aClass94_243 = var2.readString();
        var6 = 63 & var2.readUnsignedShort();
        var5 |= var6 << 11;
      }

      if (this.anInt318 == 1 || this.anInt318 == 4 || (this.anInt318 == 5) ||
          this.anInt318 == 6) {
        this.aClass94_289 = var2.readString();
        if (this.aClass94_289.getLength() == 0) {
          if ((this.anInt318 == 1)) {
            this.aClass94_289 = DummyClass27.aClass94_1583;
          }

          if ((this.anInt318 == 4)) {
            this.aClass94_289 = WorldMapLabel.aClass94_1722;
          }

          if (this.anInt318 == 5) {
            this.aClass94_289 = WorldMapLabel.aClass94_1722;
          }

          if (this.anInt318 == 6) {
            this.aClass94_289 = DummyClass44.aClass94_935;
          }
        }
      }

      if ((this.anInt318 == 1) || (this.anInt318 == 4) || (this.anInt318 == 5)) {
        var5 |= 4194304;
      }

      if ((this.anInt318 == 6)) {
        var5 |= 1;
      }

      this.aClass3_Sub1_257 = new WidgetAccess(var5, -1);
  }

  public AbstractDirectColorSprite method859(boolean var1, int var2 ) {
    GameStub.aBoolean6 = false;
      if (!var1) {
        return null;
      } else if ((var2 >= 0) && var2 < this.anIntArray197.length) {
        int var3 = this.anIntArray197[var2];
        if ((var3 == -1)) {
          return null;
        } else {
          AbstractDirectColorSprite var4 =
              (AbstractDirectColorSprite) MonoChromaticImageCache.aClass93_1569
                  .get(
                      var3);
          if (var4 == null) {
            var4 = Structure
                .method602(0, var3, (byte) -18, SomethingSceneJ.aClass153_323);
            if (var4 != null) {
              MonoChromaticImageCache.aClass93_1569
                  .get((byte) -126, var4, var3);
            } else {
              GameStub.aBoolean6 = true;
            }

            return var4;
          } else {
            return var4;
          }
        }
      } else {
        return null;
      }
  }

  private Object[] method862(int var1, Buffer var2) {
    if (var1 == -65536) {
        int var3 = var2.readUnsignedByte();
        if ((var3 == 0)) {
          return null;
        } else {
          Object[] var4 = new Object[var3];

          for (int var5 = 0; var3 > var5; ++var5) {
            int var6 = var2.readUnsignedByte();
            if (var6 == 0) {
              var4[var5] = new Integer(var2.readInt());
            } else {
              if ((var6 == 1)) {
                var4[var5] = var2.readString();
              }
            }
          }

          this.aBoolean195 = true;
          return var4;
        }
      } else {
        return null;
      }
  }

  private int[] method863(Buffer var1, boolean var2) {
    int var3 = var1.readUnsignedByte();
      if ((var3 == 0)) {
        return null;
      } else {
        int[] var4 = new int[var3];
        if (var2) {
          this.anInt312 = 20;
        }

        for (int var5 = 0; (var5 < var3); ++var5) {
          var4[var5] = var1.readInt();
        }

        return var4;
      }
  }

  public void method864(int var1, int var2, int var3 ) {
    int var4 = this.anIntArray254[var2];
      this.anIntArray254[var2] = this.anIntArray254[var1];
      if (var3 > -66) {
        this.method858(36, null);
      }

      this.anIntArray254[var1] = var4;
      var4 = this.anIntArray317[var2];
      this.anIntArray317[var2] = this.anIntArray317[var1];
      this.anIntArray317[var1] = var4;
  }

  public AbstractModel method865(int var1, AnimationSequence var2,
      int var3,
      int var4,
      int var5,
      boolean var6,
      PlayerAppearance var7 ) {
    GameStub.aBoolean6 = false;
      int var8;
      int var9;
      if (var6) {
        var8 = this.anInt294;
        var9 = this.anInt196;
      } else {
        var9 = this.anInt201;
        var8 = this.anInt202;
      }

      if (var4 < 125) {
        return null;
      } else if ((var8 != 0)) {
        if ((var8 == 1) && var9 == -1) {
          return null;
        } else {
          AbstractModel var10;
          if (var8 == 1) {
            var10 =
              (AbstractModel) SomethingVolume15.aClass93_2428.get(
                  (65536) + var9);
            if (var10 == null) {
              Model var18 = Model.getModel(DummyClass25.aClass153_1628, var9, 0);
              if (var18 == null) {
                GameStub.aBoolean6 = true;
                return null;
              }

              var10 = var18.method2008(64, 768, -50, -10, -50);
              SomethingVolume15.aClass93_2428.get((byte) -115, var10,
                  var9 + (var8 << 16));
            }

            if (var2 != null) {
              var10 = var2.method2055(var10, (byte) 119, var1, var5, var3);
            }

            return var10;
          } else if (var8 != 2) {
            if (var8 != 3) {
              if (var8 == 4) {
                ItemConfig var16 = DummyClass35.getItemConfig(var9, (byte) 94);
                AbstractModel var17 = var16.getModel(110, var1, var5, var2, 10, var3);
                if (var17 != null) {
                  return var17;
                } else {
                  GameStub.aBoolean6 = true;
                  return null;
                }
              } else if (var8 != 6) {
                if ((var8 != 7)) {
                  return null;
                } else if (var7 != null) {
                  int var15 = this.anInt201 >>> 16;
                  int var11 = this.anInt201 & '\uffff';
                  int var12 = this.anInt265;
                  AbstractModel var13 =
                    var7.method1157(var1, var12, var15, var5, var2, var3, var11, -2012759707);
                  if (var13 == null) {
                    GameStub.aBoolean6 = true;
                    return null;
                  } else {
                    return var13;
                  }
                } else {
                  return null;
                }
              } else {
                var10 = SubNode.getNpcConfiguration(var9)
                  .method1476(null, 0, (byte) -120, 0, var1, var5, var3, null, 0, var2);
                if (var10 != null) {
                  return var10;
                } else {
                  GameStub.aBoolean6 = true;
                  return null;
                }
              }
            } else if (var7 == null) {
              return null;
            } else {
              var10 = var7.method1167(var5, (byte) 127, var2, var3, var1);
              if (var10 == null) {
                GameStub.aBoolean6 = true;
                return null;
              } else {
                return var10;
              }
            }
          } else {
            var10 = SubNode.getNpcConfiguration(var9).method1482(var2, var5, var1, 27, var3);
            if (var10 != null) {
              return var10;
            } else {
              GameStub.aBoolean6 = true;
              return null;
            }
          }
        }
      } else {
        return null;
      }
  }

  public AbstractDirectColorSprite method866(byte var1, boolean var2 ) {
    GameStub.aBoolean6 = false;
      int var3;
      if (var2) {
        var3 = this.anInt296;
      } else {
        var3 = this.anInt224;
      }

      if ((var3 == -1)) {
        return null;
      } else {
        long var4 =
          ((this.aBoolean178 ? 1L : 0L) << 38) + ((!this.aBoolean157 ? 0L : 1L) << 35) + var3
            + ((long) this.anInt288 << 36) + ((this.aBoolean199 ? 1L : 0L) << 39) + (
            (long) this.anInt287 << 40);
        AbstractDirectColorSprite var6 =
          (AbstractDirectColorSprite) MonoChromaticImageCache.aClass93_1569.get(var4);
        if (var6 != null) {
          return var6;
        } else {
          SoftwareDirectColorSprite var7;
          if (this.aBoolean157) {
            var7 = AbstractObjectNode.method562(SomethingSceneJ.aClass153_323, 0, var3, (byte) 39);
          } else {
            var7 = DummyClass59.method1043(0, SomethingSceneJ.aClass153_323, -3178, var3);
          }

          if (var7 == null) {
            GameStub.aBoolean6 = true;
            return null;
          } else if (var1 != -113) {
            return null;
          } else {
            if (this.aBoolean178) {
              var7.method663();
            }

            if (this.aBoolean199) {
              var7.method653();
            }

            if (this.anInt288 > 0) {
              var7.method652(this.anInt288);
            }

            if ((this.anInt288 >= 1)) {
              var7.method657(1);
            }

            if (this.anInt288 >= 2) {
              var7.method657(16777215);
            }

            if (this.anInt287 != 0) {
              var7.method668(this.anInt287);
            }

            AbstractDirectColorSprite var9;
            if (GlRenderer.useOpenGlRenderer) {
              if (var7 instanceof SoftwareDirectFullColorSprite) {
                var9 = new GlDirectFullColorSprite(var7);
              } else {
                var9 = new GlDirectColorSprite(var7);
              }
            } else {
              var9 = var7;
            }

            MonoChromaticImageCache.aClass93_1569.get((byte) -75, var9, var4);
            return var9;
          }
        }
      }
  }

  public void method867(int var1, Buffer var2 ) {
    this.aBoolean233 = true;
      ++var2.position;
      this.anInt187 = var2.readUnsignedByte();
      if (((128 & this.anInt187) != 0)) {
        this.anInt187 &= 127;
        var2.readString();
      }

      this.anInt189 = var2.readUnsignedShort();
      this.anInt316 = var2.method787((byte) 66);
      this.anInt166 = var2.method787((byte) 121);
      this.anInt177 = var2.readUnsignedShort();
      this.anInt244 = var2.readUnsignedShort();
      this.aByte304 = var2.readByte();
      this.aByte241 = var2.readByte();
      this.aByte273 = var2.readByte();
      this.aByte162 = var2.readByte();
      this.anInt190 = var2.readUnsignedShort();
      if ((this.anInt190 == 65535)) {
        this.anInt190 = -1;
      } else {
        this.anInt190 = (this.anInt279 & -65536) + this.anInt190;
      }

      this.aBoolean155 = (var2.readUnsignedByte() == 1);
      if ((this.anInt187 == 0)) {
        this.anInt240 = var2.readUnsignedShort();
        this.anInt252 = var2.readUnsignedShort();
        this.aBoolean219 = (var2.readUnsignedByte() == 1);
      }

      int var3;
      if ((this.anInt187 == 5)) {
        this.anInt224 = var2.readInt();
        this.anInt301 = var2.readUnsignedShort();
        var3 = var2.readUnsignedByte();
        this.aBoolean157 = ((2 & var3) != 0);
        this.aBoolean186 = ((1 & var3) != 0);
        this.anInt223 = var2.readUnsignedByte();
        this.anInt288 = var2.readUnsignedByte();
        this.anInt287 = var2.readInt();
        this.aBoolean178 = (var2.readUnsignedByte() == 1);
        this.aBoolean199 = var2.readUnsignedByte() == 1;
      }

      if ((this.anInt187 == 6)) {
        this.anInt202 = 1;
        this.anInt201 = var2.readUnsignedShort();
        if ((this.anInt201 == 65535)) {
          this.anInt201 = -1;
        }

        this.anInt259 = var2.method787((byte) 122);
        this.anInt230 = var2.method787((byte) 32);
        this.rotationX0 = var2.readUnsignedShort();
        this.rotationY = var2.readUnsignedShort();
        this.rotationZ = var2.readUnsignedShort();
        this.anInt164 = var2.readUnsignedShort();
        this.anInt305 = var2.readUnsignedShort();
        if (this.anInt305 == '\uffff') {
          this.anInt305 = -1;
        }

        this.aBoolean181 = var2.readUnsignedByte() == 1;
        this.aShort293 = (short) var2.readUnsignedShort();
        this.aShort169 = (short) var2.readUnsignedShort();
        this.aBoolean309 = var2.readUnsignedByte() == 1;
        if (this.aByte304 != 0) {
          this.anInt184 = var2.readUnsignedShort();
        }

        if (this.aByte241 != 0) {
          this.anInt312 = var2.readUnsignedShort();
        }
      }

      if ((this.anInt187 == 4)) {
        this.anInt270 = var2.readUnsignedShort();
        if ((this.anInt270 == 65535)) {
          this.anInt270 = -1;
        }

        this.aClass94_232 = var2.readString();
        this.anInt205 = var2.readUnsignedByte();
        this.anInt194 = var2.readUnsignedByte();
        this.anInt225 = var2.readUnsignedByte();
        this.aBoolean215 = var2.readUnsignedByte() == 1;
        this.anInt218 = var2.readInt();
      }

      if (this.anInt187 == 3) {
        this.anInt218 = var2.readInt();
        this.aBoolean226 = var2.readUnsignedByte() == 1;
        this.anInt223 = var2.readUnsignedByte();
      }

      if ((this.anInt187 == 9)) {
        this.anInt250 = var2.readUnsignedByte();
        this.anInt218 = var2.readInt();
        this.aBoolean167 = var2.readUnsignedByte() == 1;
      }

      var3 = var2.readUnsignedMedium((byte) 87);
      int var4 = var2.readUnsignedByte();
      int var5;
      if (var4 != 0) {
        this.anIntArray299 = new int[10];
        this.aByteArray263 = new byte[10];

        for (this.aByteArray231 = new byte[10]; (var4 != 0); var4 = var2.readUnsignedByte()) {
          var5 = (var4 >> 4) - 1;
          var4 = var2.readUnsignedByte() | var4 << 8;
          var4 &= 4095;
          if (var4 == 4095) {
            this.anIntArray299[var5] = -1;
          } else {
            this.anIntArray299[var5] = var4;
          }

          this.aByteArray263[var5] = var2.readByte();
          this.aByteArray231[var5] = var2.readByte();
        }
      }

      this.aClass94_277 = var2.readString();
      var5 = var2.readUnsignedByte();
      int var6 = var5 & 15;
      int var8;
      if (var6 > 0) {
        this.aClass94Array171 = new GameString[var6];

        for (var8 = 0; var6 > var8; ++var8) {
          this.aClass94Array171[var8] = var2.readString();
        }
      }

      int var7 = var5 >> 4;
      if (var7 > 0) {
        var8 = var2.readUnsignedByte();
        this.anIntArray249 = new int[var8 + 1];

        for (int var9 = 0; var9 < this.anIntArray249.length; ++var9) {
          this.anIntArray249[var9] = -1;
        }

        this.anIntArray249[var8] = var2.readUnsignedShort();
      }

      if (var7 > 1) {
        var8 = var2.readUnsignedByte();
        this.anIntArray249[var8] = var2.readUnsignedShort();
      }

      this.anInt214 = var2.readUnsignedByte();
      this.anInt179 = var2.readUnsignedByte();
      this.aBoolean200 = var2.readUnsignedByte() == 1;
      var8 = var1;
      this.aClass94_245 = var2.readString();
      if (ClientScript.method630((byte) -34, var3) != 0) {
        var8 = var2.readUnsignedShort();
        this.anInt266 = var2.readUnsignedShort();
        if ((var8 == 65535)) {
          var8 = -1;
        }

        if (this.anInt266 == '\uffff') {
          this.anInt266 = -1;
        }

        this.anInt238 = var2.readUnsignedShort();
        if (this.anInt238 == '\uffff') {
          this.anInt238 = -1;
        }
      }

      this.aClass3_Sub1_257 = new WidgetAccess(var3, var8);
      this.anObjectArray159 = this.method862(-65536, var2);
      this.anObjectArray248 = this.method862(var1 - 65535, var2);
      this.anObjectArray281 = this.method862(-65536, var2);
      this.anObjectArray303 = this.method862(var1 ^ '\uffff', var2);
      this.anObjectArray203 = this.method862(-65536, var2);
      this.anObjectArray282 = this.method862(var1 ^ '\uffff', var2);
      this.anObjectArray174 = this.method862(var1 - 65535, var2);
      this.anObjectArray158 = this.method862(-65536, var2);
      this.anObjectArray269 = this.method862(-65536, var2);
      this.anObjectArray314 = this.method862(var1 ^ '\uffff', var2);
      this.anObjectArray276 = this.method862(-65536, var2);
      this.anObjectArray165 = this.method862(-65536, var2);
      this.anObjectArray170 = this.method862(var1 ^ '\uffff', var2);
      this.anObjectArray239 = this.method862(var1 ^ '\uffff', var2);
      this.anObjectArray180 = this.method862(-65536, var2);
      this.anObjectArray295 = this.method862(-65536, var2);
      this.anObjectArray229 = this.method862(-65536, var2);
      this.anObjectArray183 = this.method862(-65536, var2);
      this.anObjectArray161 = this.method862(-65536, var2);
      this.anObjectArray221 = this.method862(-65536, var2);
      this.anIntArray286 = this.method863(var2, false);
      this.anIntArray175 = this.method863(var2, false);
      this.anIntArray274 = this.method863(var2, false);
      this.anIntArray211 = this.method863(var2, false);
      this.anIntArray185 = this.method863(var2, false);
  }

  public AbstractFont method868(AbstractIndexedColorSprite[] var1,
      int var2 ) {
    GameStub.aBoolean6 = false;
      if ((this.anInt270 == -1)) {
        return null;
      } else {
        AbstractFont var3 = (AbstractFont) Cache.aClass93_743.get(this.anInt270);
        if (var3 != null) {
          return var3;
        } else {
          var3 = FileCacheRequester.createFont(var2, this.anInt270, (byte) 127,
            SomethingSceneJ.aClass153_323, TriChromaticImageCache.aClass153_1378);
          if (var3 == null) {
            GameStub.aBoolean6 = true;
          } else {
            var3.method697(var1, null);
            Cache.aClass93_743.get((byte) -77, var3, this.anInt270);
          }

          return var3;
        }
      }
  }

  public static GameString method856(boolean var0) {
    if (!var0) {
        Widget.method869(127, -68);
      }

      GameString var1 = ObjectNode.aClass94_4052;
      GameString var2 = GroundItemNode.EMPTY_STRING;
      if ((AbstractGameWorld.usageLocation != 0)) {
        var1 = Player.aClass94_3971;
      }

      if (DummyClass7.settings != null) {
        var2 =
          RenderAnimation.concat(new GameString[] {Structure.aClass94_3637, DummyClass7.settings});
      }

      return RenderAnimation.concat(new GameString[] {
        BufferedFile.aClass94_577, var1, AbstractObjectNode.aClass94_3601,
        SomethingScene.toString(TriChromaticImageBuffer.languageId),
        AbstractFileRequester.aClass94_1932,
        SomethingScene.toString(MonoChromaticImageBuffer.affiliateId), var2,
        GameObject.aClass94_2735
      });
  }

  public static void method860(int var0) {
    Widget.aClass94_297 = null;
      Widget.EVENT_OP_BASE = null;
      if (var0 < 63) {
        Widget.method860(42);
      }

      Widget.aClass94_251 = null;
  }

  public static int method861(int var0, int var1, int var2) {
    Inventory var3 = (Inventory) SceneGraphTile.aClass130_2220.get(var0);
      return var3 == null ?
        -1 :
        (var2 >= 0 && var2 < var3.ids.length ? (var1 < 39 ? -69 : var3.ids[var2]) : -1);
  }

  public static int method869(int var0, int var1) {
    return (var1 != 16711935) ? (var0 < 97 ? -63 : DummyClass42.method1186(0, var1)) : -1;
  }

}
