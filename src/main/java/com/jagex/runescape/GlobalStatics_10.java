package com.jagex.runescape;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.common.HashTable;
import com.jagex.runescape.done.*;
import com.jagex.runescape.done.Cursor;
import com.jagex.runescape.huffman.HuffmanEncoder;
import com.jagex.runescape.node.Deque;
import com.jagex.runescape.opengl.*;
import com.jagex.runescape.sprite.AbstractIndexedColorSprite;
import com.jagex.runescape.sprite.SoftwareIndexedColorSprite;

import java.awt.*;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Random;
import java.util.zip.CRC32;

public class GlobalStatics_10 {
    public static GameString aClass94_3386 = GameStringStatics.create("Use");
    public static GameString aClass94_3388 = aClass94_3386;
    public static int[] anIntArray3383 = new int[5];
    public static Font aFont3384;
    public static boolean aBoolean3387 = true;
    public static volatile int anInt3389;
    public static GameString aClass94_3190 = GameStringStatics.create("<img=1>");
    public static GameString aClass94_3192 = GameStringStatics.create(" ");
    public static GameString aClass94_3196 = GameStringStatics.create("Fps:");
    public static int anInt3198;
    public static int anInt3199;
    public static GameWorld[] aClass44_Sub1Array3201 = new GameWorld[0];
    public static long encodedUsername;
    public static int anInt3205;
    public static GameString aClass94_3206 = GameStringStatics.create("Moteur son pr-Bpar-B");
    public static int[] anIntArray3107;
    public static short[] aShortArray3110 = new short[256];
    public static int anInt3111;
    public static HuffmanEncoder huffmanEncoder;
    public static int anInt3114;
    public static int[][] anIntArrayArray3115;
    public static GameString aClass94_4030 = GameStringStatics.create("Allocating memory");
    public static GameString aClass94_4040 = aClass94_4030;
    public static AnimationSomething[] aClass3_Sub28_Sub5Array4031 = new AnimationSomething[14];
    public static int anInt4032;
    public static int build;
    public static int anInt4034 = -8 + (int) (17.0D * Math.random());
    public static int[] anIntArray4035 = {1, 1, 0, 0, 0, 8, 0, 0, 8};
    public static GameString aClass94_4036 =
      GameStringStatics.create("Connect-B au serveur de mise -9 jour");
    public static int anInt4037;
    public static short aShort4038 = 32767;
    public static int anInt4039;
    public static int anInt4041 = -1;
    public static int anInt4042;
    public static FileUnpacker spotAnimations;
    public static int[][] anIntArrayArray3215 = {
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
      {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
      {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1},
      {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
      {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1},
      {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
      {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1},
      {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0},
      {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1},
      {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1},
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}
    };
    public static int anInt3216;
    public static int[] anIntArray3218 = {1, 4};
    public static GameString aClass94_3146 = GameStringStatics.create(" s(West connect-B)3");
    public static int usageMode;
    public static GameString aClass94_3150 = GameStringStatics.create("null");
    public static int anInt3151;
    public static GameString COMMAND_GC = GameStringStatics.create("::gc");
    public static int yawCosine;
    public static FileUnpacker aClass153_3154;
    public static int anInt3155;
    public static int anInt3156 = -1;
    public static GameString aClass94_3157 =
      GameStringStatics.create(" est d-Bj-9 dans votre liste noire)3");
    public static int anInt3068;
    public static int anInt3069;
    public static int anInt3070;
    public static int anInt3071;
    public static GameString aClass94_3418 = GameStringStatics.create("(U5");
    public static int anInt3420;
    public static WorldMapLabel aClass131_3421;
    public static HashTable aClass130_3208 = new HashTable(8);
    public static GameString aClass94_3209 = GameStringStatics.create("showingVideoAd");
    public static FileUnpacker worldMaps;
    public static GameString aClass94_3211 = GameStringStatics.create(" <col=ffffff>");
    public static int[] anIntArray3212;
    public static int anInt3213 = 1;
    public static GameString aClass94_3141 = GameStringStatics.create("Loaded config");
    public static GameString aClass94_3142 = aClass94_3141;
    public static CRC32 aCRC32_3143 = new CRC32();
    public static int anInt3144;
    public static GameString aClass94_3145 = GameStringStatics.create(")1 ");
    public static int anInt3402;
    public static Cache aClass47_3407 = new Cache(64);
    public static GameString aClass94_3408 = GameStringStatics.create("Untersuchen");
    public static GameString aClass94_3409 = GameStringStatics.create("Musik)2Engine vorbereitet)3");
    public static long aLong3411;
    public static ObjectCache aClass93_3412 = new ObjectCache(64);
    public static int anInt3413;
    public static int anInt3414;
    public static int amountContextActions;
    public static boolean aBoolean3416;
    public static int yawSine;
    public static Deque aClass61_3075 = new Deque();
    public static int[] anIntArray3076;
    public static FileUnpacker maps;
    public static boolean focused;
    public static GameString aClass94_3079 = GameStringStatics.create("Examiner");
    public static GameString aClass94_3080 = DummyClass53.method1586(23161, 160);
    public static int anInt3081;
    public static int[] anIntArray3082 = new int[100];
    public static int[] anIntArray3083 = new int[50];
    public static int anInt3084;
    public static GameString aClass94_3096 = GameStringStatics.create("Close");
    public static GameString aClass94_3097 = aClass94_3096;
    public static Widget aClass11_3087;
    public static Random random = new Random();
    public static int anInt3090;
    public static Frame FRAME;
    public static boolean aBoolean3094;
    public static short[] aShortArray3095 = new short[500];
    public static FileUnpacker aClass153_3098;
    public static AbstractDirectColorSprite aClass3_Sub28_Sub16_3099;
    public static GameString aClass94_3306 =
      GameStringStatics.create(" is already on your ignore list)3");
    public static GameString aClass94_3311 = aClass94_3306;
    public static GameString aClass94_3302 = GameStringStatics.create("Connexion perdue)3");
    public static FileUnpacker fileUnpacker10;
    public static int loginState;
    public static GameString aClass94_3307 = GameStringStatics.create("<col=00ff80>");
    public static int anInt3313 = 500;
    public static int anInt3315;
    public static GameString aClass94_3400 = GameStringStatics.create("Take");
    public static GameString aClass94_3397 = aClass94_3400;
    public static byte[][][] aByteArrayArrayArray3390;
    public static GameString[] aClass94Array3391;
    public static SomethingPacket116[] aClass133Array3393 = new SomethingPacket116[6];
    public static GameString aClass94_3394 = GameStringStatics.create("<col=ffb000>");
    public static int anInt3395;
    public static byte[] aByteArray3396;
    public static volatile int anInt3398;
    public static GameString aClass94_3399 = GameStringStatics.create("<br>(X");
    public static GameString aClass94_3401 = GameStringStatics.create("Weiter");
    public static GameString aClass94_3120 = GameStringStatics.create("M");
    public static GameString aClass94_3117 = aClass94_3120;
    public static GameString aClass94_3124 = aClass94_3120;
    public static volatile boolean aBoolean3116 = true;
    public static boolean[][] aBooleanArrayArray3118 = {
      new boolean[0], {true, false, true}, {true, false, false, true}, {false, false, true, true},
      {true, true, false}, {false, true, true}, {true, false, false, true},
      {false, false, false, true, true}, {false, true, true}, {true, false, true, true, true},
      {false, true, true, true, true}, {false, true, true, true, true, false}
    };
    public static GameString aClass94_3119 = GameStringStatics.create("vert:");
    public static Frame fullScreenFrame;
    public static int anInt3122;
    public static GameString COMMAND_NOCLIP = GameStringStatics.create("::noclip");
    public static SignLink signLink;
    public static GameString aClass94_3170 = GameStringStatics.create("Loaded textures");
    public static GameString aClass94_3167 = aClass94_3170;
    public static int anInt3158 = -8 + (int) (17.0D * Math.random());
    public static FileCacheRequester fileCacheRequester;
    public static GameString UNDERSCORE = GameStringStatics.create("_");
    public static boolean aBoolean3166;
    public static GameString aClass94_3168 = GameStringStatics.create("cross");
    public static GameString aClass94_3169 = GameStringStatics.create("Lade Sprites )2 ");
    public static int[] anIntArray3171 = {0, 4, 4, 8, 0, 0, 8, 0, 0};
    public static GameString aClass94_3172 = GameStringStatics.create("Regarder dans cette direction");
    public static FileUnpacker aClass153_3173;
    public static GameString aClass94_3345 = GameStringStatics.create("glissement:");
    public static SomethingGl0[][] aClass3_Sub11ArrayArray3346;
    public static short[] aShortArray3349 =
        {(short) -10304, (short) 9104, (short) -1, (short) -1, (short) -1};
    public static int anInt3351;
    public static FileUnpacker textures;
    public static GameString walkTooltip;
    public static GameString aClass94_3355 = GameStringStatics.create("Angreifen");
    public static GameString aClass94_3048 = GameStringStatics.create("Hidden");
    public static GameString aClass94_3051 = aClass94_3048;
    public static Keyboard keyboard = new Keyboard();
    public static short aShort3052 = 205;
    public static GameString aClass94_3053 = GameStringStatics.create("Lade Schrifts-=tze )2 ");
    public static int anInt3054;
    public static GameString aClass94_3055 = GameStringStatics.create("k");
    public static byte[][] updatedLandscapesData;
    public static int anInt3061;
    public static boolean aBoolean3064 = true;
    public static GameString aClass94_3334 = GameStringStatics.create("wave2:");
    public static GameString aClass94_3333 = aClass94_3334;
    public static GameString aClass94_3325 = aClass94_3334;
    public static int anInt3332 = 50;
    public static int[] anIntArray3337 = new int[anInt3332];
    public static int[] anIntArray3336 = new int[anInt3332];
    public static int[] anIntArray3331 = new int[anInt3332];
    public static int[] anIntArray3329 = new int[anInt3332];
    public static int[] anIntArray3327 = new int[anInt3332];
    public static int[] anIntArray3319 = new int[anInt3332];
    public static int[] anIntArray3318 = new int[anInt3332];
    public static GameString[] aClass94Array3317 = new GameString[anInt3332];
    public static int rights;
    public static int[] anIntArray3321 = {76, 8, 137, 4, 0, 1, 38, 2, 19};
    public static int anInt3323 = 50;
    public static GameString aClass94_3324 = GameStringStatics.create(" loggt sich ein)3");
    public static GameString aClass94_3326 = GameStringStatics.create("leuchten1:");
    public static int[] anIntArray3328 = new int[8];
    public static GameString ASSIST_REQ = GameStringStatics.create(":assistreq:");
    public static byte[][] aByteArrayArray3335;
    public static GameString aClass94_3428 = GameStringStatics.create(" more options");
    public static GameString aClass94_3426 = aClass94_3428;
    public static GameString aClass94_3437 = GameStringStatics.create("Attack");
    public static GameString aClass94_3427 = aClass94_3437;
    public static int anInt3422;
    public static int anInt3423;
    public static float diffuseIntensity;
    public static FileUnpacker animationSequences;
    public static byte[][][] floorUnderlayIds;
    public static GameString aClass94_3432 = GameStringStatics.create("Schrifts-=tze geladen)3");
    public static float aFloat3435;
    public static GameString aClass94_3436 = GameStringStatics.create("jaune:");
    public static int anInt3255;
    public static int anInt3256;
    public static int anInt3259;
    public static int anInt3260 = -1;
    public static boolean aBoolean3261;
    public static int anInt3263;
    public static SomethingWorldMapy aClass3_Sub28_Sub3_3264;
    public static GameString aClass94_3449 = GameStringStatics.create("Loading sprites )2 ");
    public static GameString aClass94_3445 = aClass94_3449;
    public static int[] anIntArray3446;
    public static long[] entityKeys = new long[1000];
    public static GameString aClass94_3452 = GameStringStatics.create("mapflag");
    public static short[] aShortArray3453 = new short[256];
    public static short[] aShortArray3455;
    public static int[] anIntArray3456 = new int[4096];
    public static GameString aClass94_3286 =
      GameStringStatics.create("Loading )2 please wait)3");
    public static GameString LOADING_PLEASE_WAIT = aClass94_3286;
    public static GameString aClass94_3279 = GameStringStatics.create("Lade)3)3)3");
    public static GameString aClass94_3281 = GameStringStatics.create("sch-Utteln:");
    public static int anInt3285 = 128;
    public static int anInt3287;
    public static int[] anIntArray3288 =
        {4, 4, 1, 2, 6, 4, 2, 49, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    public static GameString aClass94_3289 = GameStringStatics.create("::fps ");
    public static long deltaTime;
    public static long lastSampledTime;
    public static GameString aClass94_2486 = GameStringStatics.create("red:");
    public static GameString aClass94_2481 = aClass94_2486;
    public static GameString aClass94_2490 = aClass94_2486;
    public static int[] anIntArray2480 = new int[25];
    public static GameString aClass94_2482 = GameStringStatics.create(":clan:");
    public static int anInt2484;
    public static int languageId;
    public static int anInt2487;
    public static int anInt2488;
    public static GameString aClass94_1363 = GameStringStatics.create("Clientscript error in: ");
    public static byte[] aByteArray1364 = new byte['\u8080'];
    public static FileUnpacker aClass153_1370;
    public static FileUnpacker aClass153_1372;
    public static int[][] anIntArrayArray1373;
    public static GameString aClass94_1374;
    public static FileUnpacker materials;
    public static GameString aClass94_1377;
    public static FileUnpacker aClass153_1378;
    public static GameString aClass94_1380;
    public static SoftwareDirectColorSprite aClass3_Sub28_Sub16_Sub2_1381;
    public static GameString aClass94_1899 = GameStringStatics.create("Loading textures )2 ");
    public static GameString aClass94_1892 = aClass94_1899;
    public static GameString aClass94_1889 = GameStringStatics.create("blinken2:");
    public static SomethingLight0[] aClass113Array1895;
    public static int anInt1896;
    public static int screenUpperX;
    public static int[] anIntArray2292 = new int[1000];
    public static int anInt2293 = -1;
    public static int anInt2294;
    public static GameString EVENT_OP_BASE = GameStringStatics.create("event_opbase");
    public static boolean aBoolean236 = true;
    public static float aFloat246;
    public static GameString aClass94_251;
    public static long aLong261;
    public static int anInt278 = -1;
    public static GameString aClass94_297 = GameStringStatics.create("Nehmen");
    public static GameString aClass94_2206 = GameStringStatics.create("white:");
    public static GameString aClass94_2214 = aClass94_2206;
    public static GameString aClass94_2210 = aClass94_2206;
    public static FileUnpacker scripts;
    public static int anInt2204;
    public static GameString aClass94_2207 = GameStringStatics.create("brillant2:");
    public static int anInt2208 = -1;
    public static int[] anIntArray2209 = {2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1};
    public static int localPlayerId = -1;
    public static int anInt2212;
    public static int[] anIntArray2213 =
        {16776960, 16711680, '\uff00', '\uffff', 16711935, 16777215};
    public static boolean aBoolean3594;
    public static GameString aClass94_3595 = GameStringStatics.create("(U0a )2 via: ");
    public static int anInt3600;
    public static GameString aClass94_1717 = GameStringStatics.create("Prepared sound engine");
    public static GameString aClass94_1731 = aClass94_1717;
    public static GameString aClass94_1726 = GameStringStatics.create("Select");
    public static GameString aClass94_1722 = aClass94_1726;
    public static int anInt1716;
    public static int anInt1719 = -1;
    public static FileUnpacker animationBases;
    public static GameString aClass94_1724 = GameStringStatics.create(" )2>");
    public static GameString aClass94_1728 = GameStringStatics.create("Eingabeprozedur geladen)3");
    public static int[] anIntArray1729 = {12543016, 15504954, 15914854, 16773818};

    public static int method319(int var0, int var1, int var2) {
      if (var1 >= -99) {
          aBoolean3387 = true;
        }

        int var3 = var0 >>> 31;
        return (var0 + var3) / var2 - var3;
    }

    public static void method320(int var0, int var1, int var2, byte var3, int var4) {
      if ((var4 <= var2)) {
          method282(DummyClass35.anIntArrayArray663[var1], var4, -83, var2, var0);
        } else {
          method282(DummyClass35.anIntArrayArray663[var1], var2, -48, var4, var0);
        }

        if (var3 > -55) {
          method320(99, 100, 74, (byte) 13, 92);
        }
    }

    public static void method321(int var0) {
      aClass94_3386 = null;
        anIntArray3383 = null;
        aFont3384 = null;
        aClass94_3388 = null;
        if (var0 != -21136) {
          method319(-38, -96, -102);
        }
    }

    public static int getLanguageForTag(GameString var0) {
      for (int i = 0; (i < GlobalStatics_9.LANGUAGES.length); ++i) {
          if (GlobalStatics_9.LANGUAGES[i].method1531(var0)) {
            return i;
          }
        }

        return -1;
    }

    public static void method244(int var0, int var1, int var2, int var3, int var4) {
      int var5;
        if ((var1 <= var3)) {
          for (var5 = var1; var5 < var3; ++var5) {
            DummyClass35.anIntArrayArray663[var5][var2] = var4;
          }
        } else {
          for (var5 = var3; (var5 < var1); ++var5) {
            DummyClass35.anIntArrayArray663[var5][var2] = var4;
          }
        }

        if (var0 != 2) {
          anInt3198 = -110;
        }
    }

    public static void method245(int var0) {
      aClass44_Sub1Array3201 = null;
        aClass94_3192 = null;
        aClass94_3206 = null;
        if (var0 != 0) {
          method245(111);
        }

        aClass94_3190 = null;
        aClass94_3196 = null;
    }

    public static int method208(int var0) {
      if (var0 > -22) {
          aShortArray3110 = null;
        }

        return 15;
    }

    public static void method209(byte var0) {
      aShortArray3110 = null;
        huffmanEncoder = null;
        if (var0 >= 30) {
          anIntArray3107 = null;
          anIntArrayArray3115 = null;
        }
    }

    public static void method282(int[] var0, int var1, int var2, int var3, int var4) {
      int var5 = 116 / ((24 - var2) / 63);
        --var1;
        --var3;

        for (int var6 = -7 + var3; var6 > var1; var0[var1] = var4) {
          ++var1;
          var0[var1] = var4;
          ++var1;
          var0[var1] = var4;
          ++var1;
          var0[var1] = var4;
          ++var1;
          var0[var1] = var4;
          ++var1;
          var0[var1] = var4;
          ++var1;
          var0[var1] = var4;
          ++var1;
          var0[var1] = var4;
          ++var1;
        }

        while (var3 > var1) {
          ++var1;
          var0[var1] = var4;
        }
    }

    public static void printUsage(String var0) {
      System.out.println(
          "Bad " + var0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
    }

    public static void method284(float[][] var0, int[][] var1, int var2, float[][] var3, int var4,
                                 int[] var5, SomethingLight var6, byte var7, Light var8,
                                 float[][] var9, int var10) {
      int[] var11 = new int[var5.length / 2];

        int var12;
        for (var12 = 0; (var12 < var11.length); ++var12) {
          int var13 = var5[var12 + var12];
          int var14 = var5[var12 + var12 + 1];
          int var15;
          if ((var10 == 1)) {
            var15 = var13;
            var13 = var14;
            var14 = -var15 + 128;
          } else {
            if ((var10 == 2)) {
              var14 = -var14 + 128;
              var13 = -var13 + 128;
            } else {
              if ((var10 == 3)) {
                var15 = var13;
                var13 = 128 - var14;
                var14 = var15;
              }
            }
          }

          float var17;
          float var16;
          float var24;
          if ((var13 == 0) && var14 == 0) {
            var16 = var3[var2][var4];
            var24 = var9[var2][var4];
            var17 = var0[var2][var4];
          } else if ((var13 == 128) && (var14 == 0)) {
            var17 = var0[var2 + 1][var4];
            var24 = var9[1 + var2][var4];
            var16 = var3[var2 + 1][var4];
          } else if (var13 == 128 && (var14 == 128)) {
            var16 = var3[var2 + 1][var4 + 1];
            var24 = var9[var2 + 1][var4 + 1];
            var17 = var0[var2 + 1][var4 + 1];
          } else if (var13 == 0 && var14 == 128) {
            var17 = var0[var2][1 + var4];
            var16 = var3[var2][var4 + 1];
            var24 = var9[var2][1 + var4];
          } else {
            var24 = var9[var2][var4];
            var17 = var0[var2][var4];
            float var18 = var13 / 128.0F;
            var16 = var3[var2][var4];
            var16 += (-var16 + var3[1 + var2][var4]) * var18;
            var17 += var18 * (var0[1 + var2][var4] - var17);
            var24 += (-var24 + var9[var2 + 1][var4]) * var18;
            float var20 = var9[var2][1 + var4];
            var20 += (var9[var2 + 1][var4 + 1] - var20) * var18;
            float var21 = var3[var2][1 + var4];
            float var19 = var14 / 128.0F;
            var24 += (-var24 + var20) * var19;
            float var22 = var0[var2][1 + var4];
            var22 += (var0[1 + var2][var4 + 1] - var22) * var18;
            var21 += (-var21 + var3[var2 + 1][1 + var4]) * var18;
            var16 += (-var16 + var21) * var19;
            var17 += (var22 - var17) * var19;
          }

          int var26 = (var2 << 7) + var13;
          int var25 = (var4 << 7) + var14;
          int var27 = GlobalStatics_9.method408(var13, (byte) -53, var4, var1, var2, var14);
          var11[var12] = var6.method1018(var8, var26, var27, var25, var24, var16, var17);
        }

        var6.method1022(var11);
        var12 = 105 % ((-20 - var7) / 54);
    }

    public static AbstractImageProducer createImageProducer(int var0, int var1, boolean var2,
                                                            Component var3) {
      if (var2) {
          try {
            Class var4 = Class.forName(
                "com.jagex.runescape.ComponentImageProducer");
            AbstractImageProducer var8 = (AbstractImageProducer) var4
                .newInstance();
            var8.setDimensions(var0, false, var1, var3);
            return var8;
          } catch (Throwable var6) {
            DirectImageProducer var5 = new DirectImageProducer();
            var5.setDimensions(var0, false, var1, var3);
            return var5;
          }
        } else {
          return null;
        }
    }

    public static AbstractDirectColorSprite[] method286(int var0, int var1, int var2,
                                                        FileUnpacker var3) {
      if (var0 != -1) {
          createImageProducer(-95, 48, true, null);
        }

        return !GlobalStatics_9.loadSprites(var3, var1, var2, -30901) ?
          null :
          GlobalStatics_2.method891(var0 ^ 4);
    }

    public static void method287(boolean var0) {
      aClass94_4030 = null;
        aClass94_4036 = null;
        aClass94_4040 = null;
        anIntArray4035 = null;
        aClass3_Sub28_Sub5Array4031 = null;
        if (var0) {
          method282(null, -113, 119, -92, 70);
        }
    }

    public static void method254(boolean var0, SomethingPacket151 var1, boolean var2) {
      int var4 = (int) var1.key;
        if (var2) {
          method258(25);
        }

        int var3 = var1.anInt2602;
        var1.unlinkNode();
        if (var0) {
          DummyClass44.method1208((byte) 79, var3);
        }

        GlobalStatics_9.method2249((byte) 83, var3);
        Widget var5 = GlobalStatics_7.getWidget((byte) 109, var4);
        if (var5 != null) {
          DummyClass29.method909(107, var5);
        }

        int var6 = amountContextActions;

        int var7;
        for (var7 = 0; var6 > var7; ++var7) {
          if (GlobalStatics_9.method73(aShortArray3095[var7], 121)) {
            GlobalStatics_9.method509(1, var7);
          }
        }

        if ((amountContextActions == 1)) {
          DummyClass36.aBoolean2615 = false;
          GlobalStatics_3
              .method1340(GlobalStatics_1.anInt1462,
                  GlobalStatics_9.anInt3552, (byte) -40,
                  anInt3395,
                  GlobalStatics_9.anInt3537);
        } else {
          GlobalStatics_3
              .method1340(GlobalStatics_1.anInt1462,
                  GlobalStatics_9.anInt3552, (byte) -40,
                  anInt3395,
                  GlobalStatics_9.anInt3537);
          var7 = GlobalStatics_8.aClass3_Sub28_Sub17_2096
              .method682(GlobalStatics_9.aClass94_2667);

          for (int var8 = 0; (var8 < amountContextActions);
              ++var8) {
            int var9 = GlobalStatics_8.aClass3_Sub28_Sub17_2096
                .method682(GlobalStatics_0.method802(var8, true));
            if (var7 < var9) {
              var7 = var9;
            }
          }

          GlobalStatics_9.anInt3537 =
              amountContextActions * 15 + (
                  GlobalStatics_8.aBoolean1951 ? 26 : 22);
          GlobalStatics_9.anInt3552 = var7 + 8;
        }

        if (GlobalStatics_9.anInt3655 != -1) {
          GlobalStatics_6.method124(115, 1, GlobalStatics_9.anInt3655);
        }
    }

    public static void method255(int var0, int var1, int var2) {
      WidgetUpdate var3 = GlobalStatics_6.method466(4, var2, var0);
        var3.g((byte) 33);
        var3.anInt3598 = var1;
    }

    public static void method256(int var0, int var1, int var2, byte var3, int var4) {
      WidgetUpdate var5 = GlobalStatics_6.method466(4, 4, var2);
        var5.g((byte) 33);
        var5.anInt3597 = var4;
        var5.anInt3596 = var0;
        if (var3 >= -108) {
          method258(-75);
        }

        var5.anInt3598 = var1;
    }

    public static void method257(byte var0) {
      int var1 = 0;
        if (var0 <= 122) {
          method259(null, 69, 54, -87, 72, -85, 88, 37, true);
        }

        for (int var2 = 0; (var2 < 104); ++var2) {
          for (int var3 = 0; (var3 < 104); ++var3) {
            if (GlobalStatics_9.method2031((byte) -106, true, var2, var3,
              GLStatics.sceneGraphTiles, var1)) {
              ++var1;
            }

            if (var1 >= 512) {
              return;
            }
          }
        }
    }

    public static void method258(int var0) {
      anIntArray3218 = null;
        anIntArrayArray3215 = null;
        int var1 = -20 % ((-31 - var0) / 39);
        spotAnimations = null;
    }

    public static void method259(SomethingTilek var0, int var1, int var2, int var3, int var4, int var5,
                                 int var6, int var7, boolean var8) {
      int var9;
      int var10 = var9 = (var6 << 7) - GlobalStatics_9.cameraPosX;
      int var11;
      int var12 = var11 = (var7 << 7) - GlobalStatics_9.cameraZ;
      int var13;
      int var14 = var13 = var10 + 128;
      int var15;
      int var16 = var15 = var12 + 128;
      int var17 = GlobalStatics_4.heightMap[var1][var6][var7] - GlobalStatics_7.cameraY;
      int var18 = GlobalStatics_4.heightMap[var1][var6 + 1][var7] - GlobalStatics_7.cameraY;
      int var19 = GlobalStatics_4.heightMap[var1][var6 + 1][var7 + 1] - GlobalStatics_7.cameraY;
      int var20 = GlobalStatics_4.heightMap[var1][var6][var7 + 1] - GlobalStatics_7.cameraY;
      int var21 = var12 * var4 + var10 * var5 >> 16;
      var12 = var12 * var5 - var10 * var4 >> 16;
      var10 = var21;
      var21 = var17 * var3 - var12 * var2 >> 16;
      var12 = var17 * var2 + var12 * var3 >> 16;
      var17 = var21;
      if (var12 >= 50) {
        var21 = var11 * var4 + var14 * var5 >> 16;
        var11 = var11 * var5 - var14 * var4 >> 16;
        var14 = var21;
        var21 = var18 * var3 - var11 * var2 >> 16;
        var11 = var18 * var2 + var11 * var3 >> 16;
        var18 = var21;
        if (var11 >= 50) {
          var21 = var16 * var4 + var13 * var5 >> 16;
          var16 = var16 * var5 - var13 * var4 >> 16;
          var13 = var21;
          var21 = var19 * var3 - var16 * var2 >> 16;
          var16 = var19 * var2 + var16 * var3 >> 16;
          var19 = var21;
          if (var16 >= 50) {
            var21 = var15 * var4 + var9 * var5 >> 16;
            var15 = var15 * var5 - var9 * var4 >> 16;
            var9 = var21;
            var21 = var20 * var3 - var15 * var2 >> 16;
            var15 = var20 * var2 + var15 * var3 >> 16;
            if (var15 >= 50) {
              int var22 = DummyClass40.anInt846 + (var10 << 9) / var12;
              int var23 = DummyClass40.anInt835 + (var17 << 9) / var12;
              int var24 = DummyClass40.anInt846 + (var14 << 9) / var11;
              int var25 = DummyClass40.anInt835 + (var18 << 9) / var11;
              int var26 = DummyClass40.anInt846 + (var13 << 9) / var16;
              int var27 = DummyClass40.anInt835 + (var19 << 9) / var16;
              int var28 = DummyClass40.anInt846 + (var9 << 9) / var15;
              int var29 = DummyClass40.anInt835 + (var21 << 9) / var15;
              DummyClass40.anInt850 = 0;
              int var30;
              if ((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) {
                if (aBoolean3261 && method185(
                  GlobalStatics_9.anInt819 + DummyClass40.anInt846,
                  anInt4039 + DummyClass40.anInt835, var27, var29, var25, var26,
                  var28, var24)) {
                  DummyClass32.anInt515 = var6;
                  GlobalStatics_9.anInt999 = var7;
                }

                if (!GlRenderer.useOpenGlRenderer && !var8) {
                  DummyClass40.aBoolean849 =
                    var26 < 0 || var28 < 0 || var24 < 0 || var26 > DummyClass40.anInt847
                      || var28 > DummyClass40.anInt847 || var24 > DummyClass40.anInt847;

                  if (var0.anInt1670 == -1) {
                    if (var0.anInt1664 != 12345678) {
                      DummyClass40.method1154(var27, var29, var25, var26, var28, var24,
                        var0.anInt1664, var0.anInt1663, var0.anInt1667);
                    }
                  } else if (GlobalStatics_9.aBoolean3275) {
                    if (var0.aBoolean1674) {
                      DummyClass40.method1135(var27, var29, var25, var26, var28, var24,
                        var0.anInt1664, var0.anInt1663, var0.anInt1667, var10, var14, var9, var17,
                        var18, var21, var12, var11, var15, var0.anInt1670);
                    } else {
                      DummyClass40.method1135(var27, var29, var25, var26, var28, var24,
                        var0.anInt1664, var0.anInt1663, var0.anInt1667, var13, var9, var14, var19,
                        var21, var18, var16, var15, var11, var0.anInt1670);
                    }
                  } else {
                    var30 = GLStatics.textureCache.method15(var0.anInt1670, '\uffff');
                    DummyClass40.method1154(var27, var29, var25, var26, var28, var24,
                      DummyClass2.repackHSL(var30, var0.anInt1664),
                      DummyClass2.repackHSL(var30, var0.anInt1663),
                      DummyClass2.repackHSL(var30, var0.anInt1667));
                  }
                }
              }

              if ((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) {
                if (aBoolean3261 && method185(
                  GlobalStatics_9.anInt819 + DummyClass40.anInt846,
                  anInt4039 + DummyClass40.anInt835, var23, var25, var29, var22,
                  var24, var28)) {
                  DummyClass32.anInt515 = var6;
                  GlobalStatics_9.anInt999 = var7;
                }

                if (!GlRenderer.useOpenGlRenderer && !var8) {
                  DummyClass40.aBoolean849 =
                    var22 < 0 || var24 < 0 || var28 < 0 || var22 > DummyClass40.anInt847
                      || var24 > DummyClass40.anInt847 || var28 > DummyClass40.anInt847;

                  if (var0.anInt1670 == -1) {
                    if (var0.anInt1675 != 12345678) {
                      DummyClass40.method1154(var23, var25, var29, var22, var24, var28,
                        var0.anInt1675, var0.anInt1667, var0.anInt1663);
                    }
                  } else if (GlobalStatics_9.aBoolean3275) {
                    DummyClass40.method1135(var23, var25, var29, var22, var24, var28, var0.anInt1675,
                      var0.anInt1667, var0.anInt1663, var10, var14, var9, var17, var18, var21, var12,
                      var11, var15, var0.anInt1670);
                  } else {
                    var30 = GLStatics.textureCache.method15(var0.anInt1670, '\uffff');
                    DummyClass40.method1154(var23, var25, var29, var22, var24, var28,
                      DummyClass2.repackHSL(var30, var0.anInt1675),
                      DummyClass2.repackHSL(var30, var0.anInt1667),
                      DummyClass2.repackHSL(var30, var0.anInt1663));
                  }
                }
              }

            }
          }
        }
      }
    }

    public static void method229(int var0, int var1) {
      if (!DummyClass4.aBoolean3004) {
          var0 = -1;
        }

        if (var1 == 20827) {
          if (var0 != DummyClass45.anInt991) {
            if ((var0 != -1)) {
              Cursor var2 = GlobalStatics_9.method311(var0, 5);
              SoftwareDirectColorSprite var3 = var2.method1179((byte) 95);
              if (var3 != null) {
                DummyClass35.signLink.method1434(var3.method655(), 10000, var3.anInt3697,
                  GlobalStatics_8.INSTANCE, new Point(var2.anInt881, var2.anInt879), var3.anInt3706);
                DummyClass45.anInt991 = var0;
              } else {
                var0 = -1;
              }
            }

            if ((var0 == -1) && (DummyClass45.anInt991 != -1)) {
              DummyClass35.signLink.method1434(null, 10000, -1, GlobalStatics_8.INSTANCE, new Point(),
                -1);
              DummyClass45.anInt991 = -1;
            }

          }
        }
    }

    public static void method230(int[][] var0, boolean var1) {
      DummyClass35.anIntArrayArray663 = var0;
        if (!var1) {
          method234(20);
        }
    }

    public static IdentityKit getIdentityKit(int var0, int var1) {
      IdentityKit var2 = (IdentityKit) GlobalStatics_9.aClass93_2792.get(var0);
        if (var2 == null) {
          byte[] var3 = DummyClass2.aClass153_1680.getBytes(3, var0);
          var2 = new IdentityKit();
          if (var3 != null) {
            var2.method952(-31957, new Buffer(var3));
          }

          GlobalStatics_9.aClass93_2792.get((byte) -89, var2, var0);
          if (var1 != 0) {
            aClass153_3154 = null;
          }

          return var2;
        } else {
          return var2;
        }
    }

    public static void method232(int var0, int var1) {
      if (MovedStatics0.method57(var0, 104)) {
          Widget[] var2 = GlobalStatics_9.aClass11ArrayArray1834[var0];

          for (int var3 = 0; var2.length > var3; ++var3) {
            Widget var4 = var2[var3];
            if (var4 != null) {
              var4.anInt260 = 1;
              var4.anInt283 = 0;
              var4.anInt267 = 0;
            }
          }

          if (var1 != 16182) {
            method229(25, -86);
          }

        }
    }

    public static void setRunesFileId(FileUnpacker var1) {
      GlobalStatics_9.runesFileId = var1.getFileId(BZipDecompressorState.FILE_RUNES);
    }

    public static void method234(int var0) {
      aClass94_3157 = null;
        aClass94_3150 = null;
        if (var0 != -3) {
          setRunesFileId(null);
        }

        aClass94_3146 = null;
        aClass153_3154 = null;
        COMMAND_GC = null;
    }

    public static void method235(boolean var0) {
      if ((DummyClass13.anInt2023 > 0)) {
          --DummyClass13.anInt2023;
        }

        if ((DummyClass36.updateTime > 1)) {
          --DummyClass36.updateTime;
          GlobalStatics_9.anInt2905 = anInt3213;
        }

        if (GlTexture2d.aBoolean3769) {
          GlTexture2d.aBoolean3769 = false;
          GlobalStatics_8.method289(false);
        } else {
          int var1;
          for (var1 = 0; (var1 < 100) && parsePacket(-15450); var1++) {
          }

          if (DummyClass15.state == 30) {
            DummyClass8.method2226(GlobalStatics_9.secureBuffer, 163, -116);
            Object var14 = GlobalStatics_7.aClass67_1443.anObject1016;
            int var2;
            int var3;
            int var4;
            int var5;
            int var6;
            int var8;
            int var9;
            synchronized (var14) {
              if (GlobalStatics_8.aBoolean29) {
                if (GlobalStatics_9.anInt3644 != 0 || GlobalStatics_7.aClass67_1443.anInt1018 >= 40) {
                  ++GlobalStatics_0.anInt2145;
                  GlobalStatics_9.secureBuffer.writePacket(123);
                  var3 = 0;
                  GlobalStatics_9.secureBuffer.writeByte(0);
                  var2 = GlobalStatics_9.secureBuffer.position;

                  for (
                          var4 = 0; GlobalStatics_7.aClass67_1443.anInt1018 > var4
                    && ((GlobalStatics_9.secureBuffer.position - var2) < 240); ++var4) {
                    ++var3;
                    var5 = GlobalStatics_7.aClass67_1443.anIntArray1019[var4];
                    var6 = GlobalStatics_7.aClass67_1443.anIntArray1020[var4];
                    if ((var5 < 0)) {
                      var5 = 0;
                    } else if ((var5 > 65534)) {
                      var5 = '\ufffe';
                    }

                    if (var6 >= 0) {
                      if (var6 > '\ufffe') {
                        var6 = '\ufffe';
                      }
                    } else {
                      var6 = 0;
                    }

                    boolean var7 = false;
                    if (GlobalStatics_7.aClass67_1443.anIntArray1019[var4] == -1
                      && (GlobalStatics_7.aClass67_1443.anIntArray1020[var4] == -1)) {
                      var7 = true;
                      var5 = -1;
                      var6 = -1;
                    }

                    if (GlobalStatics_5.anInt1977 == var6 && var5 == DummyCanvas.anInt14) {
                      if (GlobalStatics_9.anInt2556 < 2047) {
                        ++GlobalStatics_9.anInt2556;
                      }
                    } else {
                      var8 = -GlobalStatics_5.anInt1977 + var6;
                      GlobalStatics_5.anInt1977 = var6;
                      var9 = var5 - DummyCanvas.anInt14;
                      DummyCanvas.anInt14 = var5;
                      if ((GlobalStatics_9.anInt2556 < 8) && var8 >= -32 &&
                          var8 <= 31
                        && var9 >= -32 && var9 <= 31) {
                        var9 += 32;
                        var8 += 32;
                        GlobalStatics_9.secureBuffer.writeShort(
                          var9 + (GlobalStatics_9.anInt2556 << 12) + (var8 << 6));
                        GlobalStatics_9.anInt2556 = 0;
                      } else if (GlobalStatics_9.anInt2556 < 32 && (var8 >= 127)
                        && (var8 <= 127) && var9 >= -128 && var9 <= 127) {
                        GlobalStatics_9.secureBuffer.writeByte(
                          128 + GlobalStatics_9.anInt2556);
                        var9 += 128;
                        var8 += 128;
                        GlobalStatics_9.secureBuffer.writeShort((var8 << 8) + var9);
                        GlobalStatics_9.anInt2556 = 0;
                      } else if (GlobalStatics_9.anInt2556 < 32) {
                        GlobalStatics_9.secureBuffer.writeByte(
                          192 + GlobalStatics_9.anInt2556);
                        if (var7) {
                          GlobalStatics_9.secureBuffer.writeInt(Integer.MIN_VALUE);
                        } else {
                          GlobalStatics_9.secureBuffer.writeInt(var6 | var5 << 16);
                        }

                        GlobalStatics_9.anInt2556 = 0;
                      } else {
                        GlobalStatics_9.secureBuffer.writeShort(
                          GlobalStatics_9.anInt2556 + '\ue000');
                        if (var7) {
                          GlobalStatics_9.secureBuffer.writeInt(Integer.MIN_VALUE);
                        } else {
                          GlobalStatics_9.secureBuffer.writeInt(var6 | var5 << 16);
                        }

                        GlobalStatics_9.anInt2556 = 0;
                      }
                    }
                  }

                  GlobalStatics_9.secureBuffer.method769((byte) -126,
                    -var2 + GlobalStatics_9.secureBuffer.position);
                  if (GlobalStatics_7.aClass67_1443.anInt1018 > var3) {
                    GlobalStatics_7.aClass67_1443.anInt1018 -= var3;

                    for (var4 = 0; GlobalStatics_7.aClass67_1443.anInt1018 > var4; ++var4) {
                      GlobalStatics_7.aClass67_1443.anIntArray1020[var4] =
                        GlobalStatics_7.aClass67_1443.anIntArray1020[var3 + var4];
                      GlobalStatics_7.aClass67_1443.anIntArray1019[var4] =
                        GlobalStatics_7.aClass67_1443.anIntArray1019[var4 + var3];
                    }
                  } else {
                    GlobalStatics_7.aClass67_1443.anInt1018 = 0;
                  }
                }
              } else {
                GlobalStatics_7.aClass67_1443.anInt1018 = 0;
              }
            }

            if ((GlobalStatics_9.anInt3644 != 0)) {
              ++GlobalStatics_9.anInt900;
              long var15 =
                (-GlobalStatics_1.aLong1465 + GlobalStatics_3.aLong1102) / 50L;
              var3 = DummyClass36.anInt2614;
              if (var3 >= 0) {
                if (var3 > '\uffff') {
                  var3 = '\uffff';
                }
              } else {
                var3 = 0;
              }

              if (var15 > 32767L) {
                var15 = 32767L;
              }

              var4 = DummyClass5.anInt2993;
              GlobalStatics_1.aLong1465 = GlobalStatics_3.aLong1102;
              byte var19 = 0;
              if ((var4 >= 0)) {
                if (var4 > '\uffff') {
                  var4 = '\uffff';
                }
              } else {
                var4 = 0;
              }

              var6 = (int) var15;
              if ((GlobalStatics_9.anInt3644 == 2)) {
                var19 = 1;
              }

              GlobalStatics_9.secureBuffer.writePacket(75);
              GlobalStatics_9.secureBuffer.method765(var19 << 15 | var6, (byte) 3);
              GlobalStatics_9.secureBuffer.method759(-105, var4 | var3 << 16);
            }

            if (anInt2212 > 0) {
              --anInt2212;
            }

            if (GlobalStatics_2.aBoolean346) {
              for (var1 = 0; (var1 < GlobalStatics_9.anInt2537); ++var1) {
                var2 = GlobalStatics_9.anIntArray1755[var1];
                if (var2 == 98 || (var2 == 99) || (var2 == 96) || var2 == 97) {
                  GlobalStatics_9.aBoolean4068 = true;
                  break;
                }
              }
            } else if (GlobalStatics_8.aBooleanArray1490[96]
              || GlobalStatics_8.aBooleanArray1490[97] || GlobalStatics_8.aBooleanArray1490[98]
              || GlobalStatics_8.aBooleanArray1490[99]) {
              GlobalStatics_9.aBoolean4068 = true;
            }

            if (GlobalStatics_9.aBoolean4068 && anInt2212 <= 0) {
              anInt2212 = 20;
              GlobalStatics_9.aBoolean4068 = false;
              ++GlobalStatics_9.anInt1756;
              GlobalStatics_9.secureBuffer.writePacket(21);
              GlobalStatics_9.secureBuffer.method783(GlobalStatics_6.anInt2309, -268435456);
              GlobalStatics_9.secureBuffer.writeShortLE(-1, GlobalStatics_9.anInt531);
            }

            if (!focused != var0 && !GlobalStatics_9.aBoolean2774) {
              ++TextureSampler17.anInt3187;
              GlobalStatics_9.aBoolean2774 = true;
              GlobalStatics_9.secureBuffer.writePacket(22);
              GlobalStatics_9.secureBuffer.writeByte(1);
            }

            if (!focused && GlobalStatics_9.aBoolean2774) {
              ++TextureSampler17.anInt3187;
              GlobalStatics_9.aBoolean2774 = false;
              GlobalStatics_9.secureBuffer.writePacket(22);
              GlobalStatics_9.secureBuffer.writeByte(0);
            }

            if (!GlobalStatics_9.aBoolean2705) {
              ++GlobalStatics_7.anInt3659;
              GlobalStatics_9.secureBuffer.writePacket(98);
              GlobalStatics_9.secureBuffer.writeInt(DummyClass51.getSettings());
              GlobalStatics_9.aBoolean2705 = true;
            }

            DummyClass9.method2214(0);
            if (DummyClass15.state == 30) {
              GlobalStatics_9.method2087((byte) -82);
              DummyClass27.method1713((byte) -91);
              GlobalStatics_6.method132((byte) -92);
              ++GlobalStatics_2.anInt3699;
              if (GlobalStatics_2.anInt3699 > 750) {
                GlobalStatics_8.method289(false);
              } else {
                DummyClass35.method1028(-102);
                DummyClass44.method1207(-72);
                method189((byte) -62);
                if (GlobalStatics_9.aClass11_3551 != null) {
                  BZipDecompressorState.method848(4);
                }

                for (
                  var1 = GlobalStatics_9.method115(true, -1);
                  (var1 != -1); var1 = GlobalStatics_9.method115(false, -1)) {
                  DummyClass39.method1087(40, var1);
                  int var01 = GlobalStatics_0.anInt641++;
                  GlobalStatics_4.anIntArray726[var01 & 31] = var1;
                }

                int var22;
                for (WidgetUpdate var16 = GlobalStatics_7.method1302((byte) -36);
                     var16 != null; var16 = GlobalStatics_7.method1302((byte) -36)) {
                  var3 = var16.e(2063817568);
                  var4 = var16.f((byte) 117);
                  if (var3 == 1) {
                    GlobalStatics_9.anIntArray1277[var4] = var16.anInt3598;
                    int var11 = DummyClass18.anInt87++;
                    GlobalStatics_9.anIntArray3986[31 & var11] = var4;
                  } else if (var3 == 2) {
                    DummyClass22.aClass94Array1739[var4] = var16.text;
                    int var11 = GlobalStatics_6.anInt2317++;
                    DummyClass8.anIntArray4025[31 & var11] =
                      var4;
                  } else {
                    Widget var20;
                    if ((var3 == 3)) {
                      var20 = GlobalStatics_7.getWidget((byte) 118, var4);
                      assert var20 != null;
                      if (!var16.text
                          .method1528((byte) -42, var20.aClass94_232)) {
                        var20.aClass94_232 = var16.text;
                        DummyClass29.method909(107, var20);
                      }
                    } else {
                      if ((var3 == 4)) {
                        var20 = GlobalStatics_7.getWidget((byte) 109, var4);
                        var6 = var16.anInt3598;
                        var8 = var16.anInt3596;
                        var22 = var16.anInt3597;
                        assert var20 != null;
                        if (var20.anInt202 != var6 || (var20.anInt201 != var22)
                            || var8 != var20.anInt265) {
                          var20.anInt201 = var22;
                          var20.anInt265 = var8;
                          var20.anInt202 = var6;
                          DummyClass29.method909(120, var20);
                        }
                      } else if ((var3 == 5)) {
                        var20 = GlobalStatics_7.getWidget((byte) 117, var4);
                        assert var20 != null;
                        if ((var20.anInt305 != var16.anInt3598)
                            || (var16.anInt3598 == -1)) {
                          var20.anInt260 = 1;
                          var20.anInt267 = 0;
                          var20.anInt305 = var16.anInt3598;
                          var20.anInt283 = 0;
                          DummyClass29.method909(-117, var20);
                        }
                      } else if ((var3 != 6)) {
                        if ((var3 == 7)) {
                          var20 = GlobalStatics_7.getWidget((byte) 124, var4);
                          boolean var24 = var16.anInt3598 == 1;
                          assert var20 != null;
                          if (!var24 != !var20.aBoolean155) {
                            var20.aBoolean155 = var24;
                            DummyClass29.method909(119, var20);
                          }
                        } else {
                          if ((var3 == 8)) {
                            var20 = GlobalStatics_7.getWidget((byte) 122, var4);
                            assert var20 != null;
                            if (var16.anInt3598 != var20.rotationX0
                                || var20.rotationY != var16.anInt3597
                                || (var16.anInt3596 != var20.anInt164)) {
                              var20.rotationX0 = var16.anInt3598;
                              var20.anInt164 = var16.anInt3596;
                              var20.rotationY = var16.anInt3597;
                              if (var20.anInt192 != -1) {
                                if ((var20.anInt184 <= 0)) {
                                  if ((var20.anInt177 > 0)) {
                                    var20.anInt164 =
                                        32 * var20.anInt164 / var20.anInt177;
                                  }
                                } else {
                                  var20.anInt164 =
                                      var20.anInt164 * 32 / var20.anInt184;
                                }
                              }

                              DummyClass29.method909(112, var20);
                            }
                          } else {
                            if (var3 == 9) {
                              var20 = GlobalStatics_7
                                  .getWidget((byte) 119, var4);
                              assert var20 != null;
                              if ((var16.anInt3598 != var20.anInt192)
                                  || var20.anInt271 != var16.anInt3597) {
                                var20.anInt192 = var16.anInt3598;
                                var20.anInt271 = var16.anInt3597;
                                DummyClass29.method909(127, var20);
                              }
                            } else {
                              if ((var3 == 10)) {
                                var20 = GlobalStatics_7
                                    .getWidget((byte) 121, var4);
                                assert var20 != null;
                                if ((var20.anInt258 != var16.anInt3598)
                                    || (var16.anInt3597 != var20.anInt264)
                                    || var20.rotationZ != var16.anInt3596) {
                                  var20.anInt264 = var16.anInt3597;
                                  var20.rotationZ = var16.anInt3596;
                                  var20.anInt258 = var16.anInt3598;
                                  DummyClass29.method909(-69, var20);
                                }
                              } else if ((var3 == 11)) {
                                var20 = GlobalStatics_7
                                    .getWidget((byte) 124, var4);
                                assert var20 != null;
                                var20.anInt306 = var20.anInt316 = var16.anInt3598;
                                var20.aByte273 = 0;
                                var20.aByte162 = 0;
                                var20.anInt210 = var20.anInt166 = var16.anInt3597;
                                DummyClass29.method909(110, var20);
                              } else if ((var3 == 12)) {
                                var20 = GlobalStatics_7
                                    .getWidget((byte) 116, var4);
                                var6 = var16.anInt3598;
                                if (var20 != null && var20.anInt187 == 0) {
                                  if (var6 > var20.anInt252 - var20.anInt193) {
                                    var6 = var20.anInt252 - var20.anInt193;
                                  }

                                  if (var6 < 0) {
                                    var6 = 0;
                                  }

                                  if (var6 != var20.anInt208) {
                                    var20.anInt208 = var6;
                                    DummyClass29.method909(-71, var20);
                                  }
                                }
                              } else if ((var3 == 13)) {
                                var20 = GlobalStatics_7
                                    .getWidget((byte) 124, var4);
                                assert var20 != null;
                                var20.anInt237 = var16.anInt3598;
                              }
                            }
                          }
                        }
                      } else {
                        var5 = var16.anInt3598;
                        var6 = (32195 & var5) >> 10;
                        var8 = var5 & 31;
                        var22 = (var5 & 1000) >> 5;
                        Widget var10 = GlobalStatics_7
                            .getWidget((byte) 120, var4);
                        var9 = (var8 << 3) + (var22 << 11) + (var6 << 19);
                        assert var10 != null;
                        if ((var9 != var10.anInt218)) {
                          var10.anInt218 = var9;
                          DummyClass29.method909(123, var10);
                        }
                      }
                    }
                  }
                }

                if (GlobalStatics_0.anInt638 != 0) {
                  GlobalStatics_7.anInt2958 += 20;
                  if (GlobalStatics_7.anInt2958 >= 400) {
                    GlobalStatics_0.anInt638 = 0;
                  }
                }

                ++GlobalStatics_7.loopCycle;
                if (GlobalStatics_5.aClass11_1933 != null) {
                  ++GlobalStatics_6.anInt2330;
                  if (GlobalStatics_6.anInt2330 >= 15) {
                    DummyClass29.method909(-30, GlobalStatics_5.aClass11_1933);
                    GlobalStatics_5.aClass11_1933 = null;
                  }
                }

                Widget var17;
                if (GlobalStatics_9.aClass11_1017 != null) {
                  DummyClass29.method909(117, GlobalStatics_9.aClass11_1017);
                  if (((5 + GlobalStatics_9.anInt2693) < GlobalStatics_9.anInt1676)
                    || GlobalStatics_9.anInt1676 < -5 + GlobalStatics_9.anInt2693
                    || ((GlobalStatics_2.anInt40 + 5) < GlobalStatics_0.anInt1709)
                    || -5 + GlobalStatics_2.anInt40 > GlobalStatics_0.anInt1709) {
                    GlobalStatics_9.aBoolean1074 = true;
                  }

                  ++DummyClass59.anInt677;
                  if (anInt3069 == 0) {
                    if (GlobalStatics_9.aBoolean1074 && DummyClass59.anInt677 >= 5) {
                      if (GlobalStatics_9.aClass11_1017 == DummyClass54.aClass11_1402
                        && DummyClass18.anInt86 != GlobalStatics_9.anInt2701) {
                        ++GlobalStatics_9.anInt2541;
                        var17 = GlobalStatics_9.aClass11_1017;
                        byte var18 = 0;
                        if (DummyCanvas.anInt15 == 1 && var17.anInt189 == 206) {
                          var18 = 1;
                        }

                        if (var17.anIntArray254[GlobalStatics_9.anInt2701] <= 0) {
                          var18 = 0;
                        }

                        if (GlobalStatics_8.method44(var17).method93(572878952)) {
                          var5 = DummyClass18.anInt86;
                          var6 = GlobalStatics_9.anInt2701;
                          var17.anIntArray254[var6] = var17.anIntArray254[var5];
                          var17.anIntArray317[var6] = var17.anIntArray317[var5];
                          var17.anIntArray254[var5] = -1;
                          var17.anIntArray317[var5] = 0;
                        } else {
                          if ((var18 == 1)) {
                            var6 = GlobalStatics_9.anInt2701;
                            var5 = DummyClass18.anInt86;

                            while (var6 != var5) {
                              if (var5 > var6) {
                                var17.method864(-1 + var5, var5, -71);
                                --var5;
                              } else if (var6 > var5) {
                                var17.method864(1 + var5, var5, -95);
                                ++var5;
                              }
                            }
                          } else {
                            var17.method864(GlobalStatics_9.anInt2701,
                                DummyClass18.anInt86, -93);
                          }
                        }

                        GlobalStatics_9.secureBuffer.writePacket(231);
                        GlobalStatics_9.secureBuffer.writeShort(DummyClass18.anInt86);
                        GlobalStatics_9.secureBuffer.method785(GlobalStatics_9.aClass11_1017.anInt279,
                          (byte) -125);
                        GlobalStatics_9.secureBuffer.method783(GlobalStatics_9.anInt2701, -268435456);
                        GlobalStatics_9.secureBuffer.method743(10213, var18);
                      }
                    } else if (((GlobalStatics_9.anInt998 == 1) || GlobalStatics_9.method353(
                      -1 + amountContextActions, 0))
                      && amountContextActions > 2) {
                      DummyClass22.method1801((byte) -116);
                    } else if ((amountContextActions > 0)) {
                      GlobalStatics_9.method203(56);
                    }

                    GlobalStatics_9.anInt3644 = 0;
                    GlobalStatics_6.anInt2330 = 10;
                    GlobalStatics_9.aClass11_1017 = null;
                  }
                }

                DummyClass52.aBoolean1167 = false;
                DummyClass32.aClass11_526 = null;
                DummyClass60.aBoolean440 = false;
                GlobalStatics_9.anInt2537 = 0;
                var17 = DummyClass56.aClass11_1453;
                DummyClass56.aClass11_1453 = null;
                Widget var21 = DummyClass29.aClass11_439;

                for (
                        DummyClass29.aClass11_439 = null; GlobalStatics_7.hasKeyInput()
                  && GlobalStatics_9.anInt2537 < 128; ++GlobalStatics_9.anInt2537) {
                  GlobalStatics_9.anIntArray1755[GlobalStatics_9.anInt2537] =
                    GlobalStatics_9.anInt3624;
                  GlobalStatics_7.anIntArray1638[GlobalStatics_9.anInt2537] =
                    GlobalStatics_9.anInt3342;
                }

                GlobalStatics_9.aClass11_3551 = null;
                if ((GlobalStatics_9.anInt3655 != -1)) {
                  GlobalStatics_9.method967(0, 0, 2, 0, DummyClass30.viewWidth,
                    GlobalStatics_9.anInt3655, 0, GlobalStatics_9.viewHeight);
                }

                ++anInt3213;

                while (true) {
                  ClientScriptCall var26 =
                    (ClientScriptCall) DummyClass18.aClass61_82.method1220((byte) -3);
                  Widget var23;
                  Widget var25;
                  if (var26 == null) {
                    while (true) {
                      var26 = (ClientScriptCall) DummyClass45.aClass61_983.method1220((byte) -3);
                      if (var26 == null) {
                        while (true) {
                          var26 = (ClientScriptCall) DummyClass31.aClass61_1471.method1220((byte) -3);
                          if (var26 == null) {
                            if (GlobalStatics_9.aClass11_3551 == null) {
                              GlobalStatics_6.anInt2475 = 0;
                            }

                            if (DummyClass42.aClass11_886 != null) {
                              DummyClass18.method829(-1);
                            }

                            if ((rights > 0)
                              && GlobalStatics_8.aBooleanArray1490[82]
                              && GlobalStatics_8.aBooleanArray1490[81]
                              && GlobalStatics_9.mouseWheelOffset != 0) {
                              var5 =
                                GlobalStatics_9.currentPlane - GlobalStatics_9.mouseWheelOffset;
                              if (var5 < 0) {
                                var5 = 0;
                              } else if (var5 > 3) {
                                var5 = 3;
                              }

                              GlobalStatics_6.method979(
                                GlobalStatics_9.localPlayer.waypointsX[0] + anInt1716,
                                GlobalStatics_9.localPlayer.waypointsY[0] + GlobalStatics_9.anInt1152,
                                var5, (byte) -4);
                            }

                            if (rights > 0 && GlobalStatics_8.aBooleanArray1490[82]
                              && GlobalStatics_8.aBooleanArray1490[81]) {
                              if (DummyClass32.anInt515 != -1) {
                                GlobalStatics_6.method979(
                                  anInt1716 + DummyClass32.anInt515,
                                  GlobalStatics_9.anInt1152 + GlobalStatics_9.anInt999,
                                  GlobalStatics_9.currentPlane, (byte) -4);
                              }

                              GlobalStatics_8.anInt1521 = 0;
                              GlobalStatics_7.anInt2440 = 0;
                            } else if ((GlobalStatics_7.anInt2440 == 2)) {
                              if ((DummyClass32.anInt515 != -1)) {
                                GlobalStatics_9.secureBuffer.writePacket(131);
                                ++GlobalStatics_9.anInt2651;
                                GlobalStatics_9.secureBuffer.method759(-123, GlobalStatics_9.anInt872);
                                GlobalStatics_9.secureBuffer.method783(
                                  anInt1716 + DummyClass32.anInt515, -268435456);
                                GlobalStatics_9.secureBuffer.method765(anInt278, (byte) 3);
                                GlobalStatics_9.secureBuffer.method783(
                                  GlobalStatics_9.anInt999 + GlobalStatics_9.anInt1152,
                                  -268435456);
                                GlobalStatics_0.anInt638 = 1;
                                GlobalStatics_7.anInt2958 = 0;
                                GlobalStatics_7.anInt4062 = DummyClass36.anInt2614;
                                GlobalStatics_9.anInt1053 = DummyClass5.anInt2993;
                              }

                              GlobalStatics_7.anInt2440 = 0;
                            } else if (GlobalStatics_8.anInt1521 == 2) {
                              if (DummyClass32.anInt515 != -1) {
                                GlobalStatics_9.secureBuffer.writePacket(179);
                                GlobalStatics_9.secureBuffer.writeShort(
                                  GlobalStatics_9.anInt1152 + GlobalStatics_9.anInt999);
                                ++GlobalStatics_9.anInt2130;
                                GlobalStatics_9.secureBuffer.writeShort(
                                  DummyClass32.anInt515 + anInt1716);
                                GlobalStatics_7.anInt2958 = 0;
                                GlobalStatics_0.anInt638 = 1;
                                GlobalStatics_9.anInt1053 = DummyClass5.anInt2993;
                                GlobalStatics_7.anInt4062 = DummyClass36.anInt2614;
                              }

                              GlobalStatics_8.anInt1521 = 0;
                            } else if (DummyClass32.anInt515 != -1 &&
                                GlobalStatics_7.anInt2440 == 0
                              && GlobalStatics_8.anInt1521 == 0) {
                              boolean var27 =
                                GlobalStatics_9.method582(GlobalStatics_9.localPlayer.waypointsY[0], 0, 0,
                                  true, 0, 2, DummyClass32.anInt515, 0, 0, 0,
                                  GlobalStatics_9.anInt999, GlobalStatics_9.localPlayer.waypointsX[0]);
                              if (var27) {
                                GlobalStatics_7.anInt4062 = DummyClass36.anInt2614;
                                GlobalStatics_7.anInt2958 = 0;
                                GlobalStatics_9.anInt1053 = DummyClass5.anInt2993;
                                GlobalStatics_0.anInt638 = 1;
                              }
                            }

                            DummyClass32.anInt515 = -1;
                            DummyClass5.method2211(-48);
                            if (DummyClass56.aClass11_1453 != var17) {
                              if (var17 != null) {
                                DummyClass29.method909(-52, var17);
                              }

                              if (DummyClass56.aClass11_1453 != null) {
                                DummyClass29.method909(119, DummyClass56.aClass11_1453);
                              }
                            }

                            if (var21 != DummyClass29.aClass11_439
                              && (anInt3323 == GlobalStatics_3.anInt1109)) {
                              if (var21 != null) {
                                DummyClass29.method909(112, var21);
                              }

                              if (DummyClass29.aClass11_439 != null) {
                                DummyClass29.method909(-22, DummyClass29.aClass11_439);
                              }
                            }

                            if (DummyClass29.aClass11_439 == null) {
                              if ((GlobalStatics_3.anInt1109 > 0)) {
                                --GlobalStatics_3.anInt1109;
                              }
                            } else if (GlobalStatics_3.anInt1109
                              < anInt3323) {
                              ++GlobalStatics_3.anInt1109;
                              if (anInt3323 == GlobalStatics_3.anInt1109) {
                                DummyClass29.method909(-48, DummyClass29.aClass11_439);
                              }
                            }

                            if (GlobalStatics_9.anInt1753 == 1) {
                              GlobalStatics_9.method2086((byte) 68);
                            } else if ((GlobalStatics_9.anInt1753 == 2)) {
                              GlobalStatics_7.method379(1024);
                            } else {
                              d('\uffff');
                            }

                            for (var5 = 0; (var5 < 5); ++var5) {
                              ++DummyClass9.anIntArray4009[var5];
                            }

                            var5 = GlobalStatics_9.method1406((byte) -43);
                            var6 = method301((byte) -119);
                            if ((var5 > 15000) && (var6 > 15000)) {
                              DummyClass13.anInt2023 = 250;
                              DummyClass30.method940(112, 14500);
                              ++GlobalStatics_9.anInt1330;
                              GlobalStatics_9.secureBuffer.writePacket(245);
                            }

                            if (GlobalStatics_2.aClass64_351 != null
                              && GlobalStatics_2.aClass64_351.status == 1) {
                              if (GlobalStatics_2.aClass64_351.result != null) {
                                DummyClass54.method1596(GlobalStatics_8.aClass94_3295, (byte) 126,
                                  GlobalStatics_0.aBoolean2154);
                              }

                              GlobalStatics_8.aClass94_3295 = null;
                              GlobalStatics_2.aClass64_351 = null;
                              GlobalStatics_0.aBoolean2154 = false;
                            }

                            ++anInt4032;
                            ++GLStatics.anInt716;
                            ++GlobalStatics_8.anInt2120;
                            if (GlobalStatics_8.anInt2120 > 500) {
                              GlobalStatics_8.anInt2120 = 0;
                              var22 = (int) (8.0D * Math.random());
                              if (((var22 & 4) == 4)) {
                                GlobalStatics_0.anInt2589 += DummyHashTable.anInt1682;
                              }

                              if (((var22 & 2) == 2)) {
                                GlobalStatics_2.anInt42 += GlobalStatics_2.anInt2217;
                              }

                              if (((var22 & 1) == 1)) {
                                anInt3216 += GlobalStatics_5.anInt1901;
                              }
                            }

                            if ((GLStatics.anInt716 > 500)) {
                              GLStatics.anInt716 = 0;
                              var22 = (int) (8.0D * Math.random());
                              if (((1 & var22) == 1)) {
                                GlobalStatics_9.anInt3102 += DummyOutputStream.anInt48;
                              }

                              if (((2 & var22) == 2)) {
                                GlobalStatics_9.anInt3020 += DummyCanvas.anInt25;
                              }
                            }

                            if ((anInt3216 < 49)) {
                              GlobalStatics_5.anInt1901 = 2;
                            }

                            if ((GlobalStatics_9.anInt3102 < 59)) {
                              DummyOutputStream.anInt48 = 2;
                            }

                            if ((GlobalStatics_9.anInt3020 < 19)) {
                              DummyCanvas.anInt25 = 1;
                            }

                            if (GlobalStatics_2.anInt42 < -55) {
                              GlobalStatics_2.anInt2217 = 2;
                            }

                            if (GlobalStatics_2.anInt42 > 55) {
                              GlobalStatics_2.anInt2217 = -2;
                            }

                            if (GlobalStatics_0.anInt2589 < -40) {
                              DummyHashTable.anInt1682 = 1;
                            }

                            if (anInt3216 > 50) {
                              GlobalStatics_5.anInt1901 = -2;
                            }

                            if ((GlobalStatics_0.anInt2589 > 40)) {
                              DummyHashTable.anInt1682 = -1;
                            }

                            if (GlobalStatics_9.anInt3020 > 10) {
                              DummyCanvas.anInt25 = -1;
                            }

                            if (GlobalStatics_9.anInt3102 > 60) {
                              DummyOutputStream.anInt48 = -2;
                            }

                            if ((anInt4032 > 50)) {
                              ++GlobalStatics_9.anInt3569;
                              GlobalStatics_9.secureBuffer.writePacket(93);
                            }

                            if (GlobalStatics_9.interfaceCounterUpdated) {
                              DummyClass35.method1029(0);
                              GlobalStatics_9.interfaceCounterUpdated = false;
                            }

                            try {
                              if (GlobalStatics_9.gameSocket != null
                                && (GlobalStatics_9.secureBuffer.position > 0)) {
                                GlobalStatics_9.gameSocket.write(
                                  GlobalStatics_9.secureBuffer.bytes, 0,
                                  GlobalStatics_9.secureBuffer.position);
                                anInt4032 = 0;
                                GlobalStatics_9.secureBuffer.position = 0;
                              }
                            } catch (IOException var11) {
                              GlobalStatics_8.method289(false);
                            }

                            return;
                          }

                          var25 = var26.aClass11_2449;
                          if ((var25.anInt191 >= 0)) {
                            var23 = GlobalStatics_7.getWidget((byte) 118, var25.anInt190);
                            if (var23 == null || var23.aClass11Array262 == null
                              || (var25.anInt191 >= var23.aClass11Array262.length)
                              || var25 != var23.aClass11Array262[var25.anInt191]) {
                              continue;
                            }
                          }

                          GLStatics.executeScript(var26);
                        }
                      }

                      var25 = var26.aClass11_2449;
                      if ((var25.anInt191 >= 0)) {
                        var23 = GlobalStatics_7.getWidget((byte) 120, var25.anInt190);
                        if (var23 == null || var23.aClass11Array262 == null
                          || var23.aClass11Array262.length <= var25.anInt191
                          || var23.aClass11Array262[var25.anInt191] != var25) {
                          continue;
                        }
                      }

                      GLStatics.executeScript(var26);
                    }
                  }

                  var25 = var26.aClass11_2449;
                  if (var25.anInt191 >= 0) {
                    var23 = GlobalStatics_7.getWidget((byte) 127, var25.anInt190);
                    if (var23 == null || var23.aClass11Array262 == null
                      || var25.anInt191 >= var23.aClass11Array262.length
                      || var23.aClass11Array262[var25.anInt191] != var25) {
                      continue;
                    }
                  }

                  GLStatics.executeScript(var26);
                }
              }
            }
          }
        }
    }

    public static void method194(int var0, int var1, int var2, int var3, int var4, int var5, int var6,
                                 int var7) {
      if ((DummyClass55.anInt1425 <= var7) && GlTexture2d.anInt3765 >= var6
          && var4 >= DummyClass13.anInt2020 && var1 <= GlobalStatics_9.anInt902) {
          GlobalStatics_9.method262(var3, 119, var4, var1, var2, var0, var6, var7);
        } else {
          DummyClass15.method2062(var6, var2, var5 - 4185, var1, var0, var3, var4, var7);
        }
    }

    public static int method335(int var0) {
      if (var0 != 16859) {
          aClass131_3421 = null;
        }

        return DummyClass55.aBoolean1419 && GlobalStatics_8.aBooleanArray1490[81]
          && amountContextActions > 2 ?
          GlobalStatics_9.anIntArray1578[-2 + amountContextActions] :
          GlobalStatics_9.anIntArray1578[amountContextActions - 1];
    }

    public static SomethingQuickChat2 method336(int var0, byte var1) {
      SomethingQuickChat2 var2 =
          (SomethingQuickChat2) GlobalStatics_9.aClass47_3137.get(var0, 1400);
        if (var2 != null) {
          return var2;
        } else {
          byte[] var3;
          if (var0 < '\u8000') {
            var3 = GlobalStatics_6.quickchats.getBytes(0, var0);
          } else {
            var3 = GlobalStatics_9.globalQuickchats.getBytes(0, var0 & 32767);
          }

          var2 = new SomethingQuickChat2();
          if (var3 != null) {
            var2.method530(new Buffer(var3), (byte) 116);
          }

          if (var1 != -54) {
            method337(19);
          }

          if ((var0 >= 32768)) {
            var2.method525(-85);
          }

          GlobalStatics_9.aClass47_3137.put(var0, var2);
          return var2;
        }
    }

    public static void method337(int var0) {
      aClass94_3418 = null;
        if (var0 != 2) {
          GLStatics.anInt3419 = -53;
        }

        aClass131_3421 = null;
    }

    public static void method246(int var0) {
      Texture.method724(-109);
        GlTexture2d.method710((byte) 126);
        DummyClass58.method1654(var0 ^ -15455);
        DummyCanvas.method55(22683);
        DummyClass8.method2222((byte) 127);
        GlobalStatics_8.method813(1974);
        GlobalStatics_9.method1803((byte) 22);
        DummyClass35.method1025((byte) -93);
        DummyClass59.method1044(-3782);
        GlobalStatics_0.method85((byte) -114);
        GlobalStatics_7.method2192(-68);
        DummyClass13.method2196(128);
        GlobalStatics_4.method1132(103);
        method196(false);
        if (var0 != 8) {
          method246(-120);
        }

        DummyClass27.method1714((byte) -6);
        h((byte) 3);
        DummyClass56.method1650(21);
        GlobalStatics_9.method2089((byte) 115);
        GlobalStatics_9.aClass93_3130.method1523((byte) -103);
        GlobalStatics_9.aClass93_1135.method1523((byte) -122);
    }

    public static void method247(byte var0) {
      int var1 = 105 % ((var0 + 39) / 41);
        if (GlobalStatics_9.aBoolean2713) {
          GlobalStatics_3.logoSprite = null;
          GlobalStatics_9.aBoolean2713 = false;
          DummyClass59.titlebackground = null;
        }
    }

    public static void method249(int var0) {
      anIntArray3212 = null;
        aClass94_3211 = null;
        aClass130_3208 = null;
        worldMaps = null;
        aClass94_3209 = null;
    }

    public static void method250(int var0, FileUnpacker var1) {
      if (var0 == 2048) {
          FileSystem.aClass153_105 = var1;
        }
    }

    public static int method251(int var0) {
      if (var0 != -1) {
          return 18;
        } else if (DummyClass25.aClass131_1624 == null) {
          return -1;
        } else {
          while ((GlobalStatics_9.anInt1780 < DummyClass25.aClass131_1624.anInt1720)) {
            if (DummyClass25.aClass131_1624.method1794(GlobalStatics_9.anInt1780, -20138)) {
              return GlobalStatics_9.anInt1780++;
            }

            ++GlobalStatics_9.anInt1780;
          }

          return -1;
        }
    }

    public static void method252(int var0) {
      AreaSoundEffect var1;
        for (
          var1 = (AreaSoundEffect) GlobalStatics_0.aClass61_78.getFirst();
            var1 != null; var1 = (AreaSoundEffect) GlobalStatics_0.aClass61_78.getNext()) {
          if (var1.aBoolean2329) {
            var1.method134(1);
          }
        }

        for (
          var1 = (AreaSoundEffect) SocketStream.aClass61_1242.getFirst();
            var1 != null; var1 = (AreaSoundEffect) SocketStream.aClass61_1242.getNext()) {
          if (var1.aBoolean2329) {
            var1.method134(1);
          }
        }

        if (var0 != 8) {
          anInt3213 = 122;
        }
    }

    public static void method253(int var0, int var1, int var2, int var3, int var4) {
      if (var0 != -22611) {
          method246(83);
        }

        GlobalStatics_9.anInt3536 = DummyClass30.anInt455 * var3 / var1;
        GlobalStatics_9.anInt2251 = DummyClass58.anInt1460 * var2 / var4;
        GlobalStatics_9.anInt1150 = -1;
        GlobalStatics_9.anInt3362 = -1;
        GlobalStatics_9.method117((byte) 87);
    }

    public static void method223(boolean var0, int var1, int var2, int var3, int var4, int var5,
                                 int var6, int var7) {
      if ((var4 == var7)) {
          SocketStream.method1460(var1, var3, (byte) -113, var6, var7, var2, var5);
        } else {
          if (!var0) {
            method226(87, 8);
          }

          if (((var2 - var7) >= DummyClass55.anInt1425) && var7 + var2 <= GlTexture2d.anInt3765
            && (DummyClass13.anInt2020 <= (var3 - var4)) && GlobalStatics_9.anInt902 >= var3 + var4) {
            DummyClass12.method2200(var6, var2, var3, var5, var7, 95, var4, var1);
          } else {
            method329(var7, var6, var5, var1, (byte) -54, var3, var2, var4);
          }

        }
    }

    public static void method224(byte var0, int var1, int var2, int var3, int var4, int var5) {
      GlobalStatics_9.aClass109Array1831[0].draw(var3, var4);
        GlobalStatics_9.aClass109Array1831[1].draw(var3, -16 + var5 + var4);
        int var8 = 44 % ((var0 - 38) / 57);
        int var6 = var5 * (var5 - 32) / var2;
        if (var6 < 8) {
          var6 = 8;
        }

        int var7 = var1 * (-var6 - 32 + var5) / (var2 - var5);
        if (GlRenderer.useOpenGlRenderer) {
          GlUtils.fillQuad(var3, 16 + var4, 16, -32 + var5, GlobalStatics_9.anInt2530);
          GlUtils.fillQuad(var3, 16 + var4 + var7, 16, var6, GlobalStatics_9.anInt486);
          GlUtils.drawVerticalLine(var3, var7 + (var4 + 16), var6, GlobalStatics_9.anInt3377);
          GlUtils.drawVerticalLine(var3 + 1, var7 + 16 + var4, var6, GlobalStatics_9.anInt3377);
          GlUtils.drawHorizontalLine(var3, var7 + 16 + var4, 16, GlobalStatics_9.anInt3377);
          GlUtils.drawHorizontalLine(var3, var7 + var4 + 17, 16, GlobalStatics_9.anInt3377);
          GlUtils.drawVerticalLine(15 + var3, var4 + (16 + var7), var6, GlobalStatics_2.anInt2243);
          GlUtils.drawVerticalLine(14 + var3, 17 + (var4 + var7), -1 + var6,
            GlobalStatics_2.anInt2243);
          GlUtils.drawHorizontalLine(var3, var6 + 15 + var4 + var7, 16, GlobalStatics_2.anInt2243);
          GlUtils.drawHorizontalLine(var3 + 1, var4 + 14 + var7 + var6, 15,
            GlobalStatics_2.anInt2243);
        } else {
          DummyClass47.method1323(var3, 16 + var4, 16, -32 + var5, GlobalStatics_9.anInt2530);
          DummyClass47.method1323(var3, var7 + (var4 + 16), 16, var6, GlobalStatics_9.anInt486);
          DummyClass47.method1318(var3, var7 + var4 + 16, var6, GlobalStatics_9.anInt3377);
          DummyClass47.method1318(var3 + 1, var7 + 16 + var4, var6, GlobalStatics_9.anInt3377);
          DummyClass47.method1317(var3, var4 + (16 + var7), 16, GlobalStatics_9.anInt3377);
          DummyClass47.method1317(var3, 17 + var4 + var7, 16, GlobalStatics_9.anInt3377);
          DummyClass47.method1318(var3 + 15, var7 + 16 + var4, var6, GlobalStatics_2.anInt2243);
          DummyClass47.method1318(14 + var3, var4 + 17 + var7, -1 + var6, GlobalStatics_2.anInt2243);
          DummyClass47.method1317(var3, var6 + 15 + var4 + var7, 16, GlobalStatics_2.anInt2243);
          DummyClass47.method1317(1 + var3, var6 + var4 - (-14 - var7), 15,
            GlobalStatics_2.anInt2243);
        }
    }

    public static void method225(int var0, Widget var1) {
      Widget var2 = GlobalStatics_8.method2273(var1, 123);
        if (var0 != 14) {
          method227(true);
        }

        int var3;
        int var4;
        if (var2 == null) {
          var4 = GlobalStatics_9.viewHeight;
          var3 = DummyClass30.viewWidth;
        } else {
          var4 = var2.anInt193;
          var3 = var2.anInt168;
        }

        GlobalStatics_9.method603(var4, 13987, var3, var1, false);
        GlobalStatics_8.method1224(var1, var0 + 23716, var4, var3);
    }

    public static void method226(int var0, int var1) {
      if ((var0 != -1)) {
          if (var1 <= 27) {
            method228(null, null, true);
          }

          if (MovedStatics0.method57(var0, 104)) {
            Widget[] var2 = GlobalStatics_9.aClass11ArrayArray1834[var0];

            for (int var3 = 0; var3 < var2.length; ++var3) {
              Widget var4 = var2[var3];
              if (var4.anObjectArray159 != null) {
                ClientScriptCall var5 = new ClientScriptCall();
                var5.arguments = var4.anObjectArray159;
                var5.aClass11_2449 = var4;
                ItemConfig.callScript((byte) -86, 2000000, var5);
              }
            }

          }
        }
    }

    public static void method227(boolean var0) {
      aClass94_3142 = null;
        aClass94_3145 = null;
        aCRC32_3143 = null;

        aClass94_3141 = null;
    }

    public static int method228(FileUnpacker var0, FileUnpacker var1, boolean var2) {
      int var3 = 0;
        if (var0.isLoaded(GlobalStatics_9.p11FontFileId)) {
          ++var3;
        }

        if (var0.isLoaded(GlobalStatics_9.p12FontFileId)) {
          ++var3;
        }

        if (var0.isLoaded(GlobalStatics_9.b12FontFileId)) {
          ++var3;
        }

        if (var1.isLoaded(GlobalStatics_9.p11FontFileId)) {
          ++var3;
        }

        if (var2) {
          aClass94_3142 = null;
        }

        if (var1.isLoaded(GlobalStatics_9.p12FontFileId)) {
          ++var3;
        }

        if (var1.isLoaded(GlobalStatics_9.b12FontFileId)) {
          ++var3;
        }

        return var3;
    }

    public static void method328(int var0, Buffer var1) {
      if (var0 != -21774) {
          method330(-115, 107, 60, 70, -41, 115);
        }

        while (var1.position < var1.bytes.length) {
          int var4 = 0;
          boolean var3 = false;
          int var5 = 0;
          if (var1.readUnsignedByte() == 1) {
            var3 = true;
            var4 = var1.readUnsignedByte();
            var5 = var1.readUnsignedByte();
          }

          int var6 = var1.readUnsignedByte();
          int var7 = var1.readUnsignedByte();
          int var8 = -anInt3256 + var6 * 64;
          int var9 = DummyClass58.anInt1460 - 1 + GlobalStatics_9.anInt65 - 64 * var7;
          byte var2;
          int var10;
          if ((var8 >= 0) && ((-63 + var9) >= 0) && DummyClass30.anInt455 > var8 + 63
            && (var9 < DummyClass58.anInt1460)) {
            var10 = var8 >> 6;
            int var11 = var9 >> 6;

            for (int var12 = 0; var12 < 64; ++var12) {
              for (int var13 = 0; (var13 < 64); ++var13) {
                if (!var3 || ((var4 * 8) <= var12) && 8 + 8 * var4 > var12 && var13 >= var5 * 8
                  && 8 + var5 * 8 > var13) {
                  var2 = var1.readByte();
                  if (var2 != 0) {
                    if (aByteArrayArrayArray3390[var10][var11]
                        == null) {
                      aByteArrayArrayArray3390[var10][var11] = new byte[4096];
                    }

                    aByteArrayArrayArray3390[var10][var11][(63 - var13 << 6)
                      + var12] = var2;
                    byte var14 = var1.readByte();
                    if (GlobalStatics_7.aByteArrayArrayArray2452[var10][var11]
                        == null) {
                      GlobalStatics_7.aByteArrayArrayArray2452[var10][var11] = new byte[4096];
                    }

                    GlobalStatics_7.aByteArrayArrayArray2452[var10][var11][var12 + (-var13 + 63
                      << 6)] = var14;
                  }
                }
              }
            }
          } else {
            for (var10 = 0; (var10 < (!var3 ? 4096 : 64)); ++var10) {
              var2 = var1.readByte();
              if ((var2 != 0)) {
                ++var1.position;
              }
            }
          }
        }
    }

    public static void method329(int var0, int var1, int var2, int var3, byte var4, int var5, int var6,
                                 int var7) {
      int var8 = 0;
        int var11 = -var3 + var0;
        int var10 = 0;
        int var9 = var7;
        int var14 = var7 * var7;
        int var12 = -var3 + var7;
        int var13 = var0 * var0;
        int var17 = var14 << 1;
        int var16 = var12 * var12;
        int var15 = var11 * var11;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var22 = var12 << 1;
        int var21 = var7 << 1;
        int var23 = var17 + var13 * (1 - var21);
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = var19 + var15 * (1 - var22);
        int var26 = var16 - var20 * (var22 - 1);
        int var28 = var14 << 2;
        int var27 = var13 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var34 = -113 % ((var4 - 56) / 41);
        int var29 = var15 << 2;
        int var33 = var19 * 3;
        int var35 = (-3 + var22) * var20;
        int var37 = (-1 + var7) * var27;
        int var38 = var30;
        int var36 = var28;
        int var39 = (-1 + var12) * var29;
        int var42;
        int var43;
        int var41;
        int var44;
        if (var5 >= DummyClass13.anInt2020 && GlobalStatics_9.anInt902 >= var5) {
          int[] var40 = DummyClass35.anIntArrayArray663[var5];
          var41 = DummyClass59.method1040(GlTexture2d.anInt3765, var6 - var0, (byte) 0,
            DummyClass55.anInt1425);
          var42 = DummyClass59.method1040(GlTexture2d.anInt3765, var6 + var0, (byte) 0,
            DummyClass55.anInt1425);
          var43 = DummyClass59.method1040(GlTexture2d.anInt3765, var6 - var11, (byte) 0,
            DummyClass55.anInt1425);
          var44 = DummyClass59.method1040(GlTexture2d.anInt3765, var6 + var11, (byte) 0,
            DummyClass55.anInt1425);
          method282(var40, var41, 127, var43, var2);
          method282(var40, var43, 105, var44, var1);
          method282(var40, var44, -67, var42, var2);
        }

        while (var9 > 0) {
          if (var23 < 0) {
            while (var23 < 0) {
              var23 += var31;
              var31 += var28;
              ++var8;
              var24 += var36;
              var36 += var28;
            }
          }

          boolean var49 = (var9 <= var12);
          if (var24 < 0) {
            var24 += var36;
            var23 += var31;
            ++var8;
            var36 += var28;
            var31 += var28;
          }

          if (var49) {
            if ((var25 < 0)) {
              while (var25 < 0) {
                ++var10;
                var26 += var38;
                var38 += var30;
                var25 += var33;
                var33 += var30;
              }
            }

            if (var26 < 0) {
              ++var10;
              var26 += var38;
              var25 += var33;
              var38 += var30;
              var33 += var30;
            }

            var25 += -var39;
            var39 -= var29;
            var26 += -var35;
            var35 -= var29;
          }

          var24 += -var32;
          var23 += -var37;
          var37 -= var27;
          var32 -= var27;
          --var9;
          var42 = var5 + var9;
          var41 = -var9 + var5;
          if (DummyClass13.anInt2020 <= var42 && GlobalStatics_9.anInt902 >= var41) {
            var43 = DummyClass59.method1040(GlTexture2d.anInt3765, var6 + var8, (byte) 0,
              DummyClass55.anInt1425);
            var44 = DummyClass59.method1040(GlTexture2d.anInt3765, -var8 + var6, (byte) 0,
              DummyClass55.anInt1425);
            if (var49) {
              int var45 = DummyClass59.method1040(GlTexture2d.anInt3765, var6 + var10, (byte) 0,
                DummyClass55.anInt1425);
              int var46 = DummyClass59.method1040(GlTexture2d.anInt3765, var6 - var10, (byte) 0,
                DummyClass55.anInt1425);
              int[] var47;
              if (DummyClass13.anInt2020 <= var41) {
                var47 = DummyClass35.anIntArrayArray663[var41];
                method282(var47, var44, 120, var46, var2);
                method282(var47, var46, -107, var45, var1);
                method282(var47, var45, -102, var43, var2);
              }

              if ((var42 <= GlobalStatics_9.anInt902)) {
                var47 = DummyClass35.anIntArrayArray663[var42];
                method282(var47, var44, 87, var46, var2);
                method282(var47, var46, -92, var45, var1);
                method282(var47, var45, 124, var43, var2);
              }
            } else {
              if ((DummyClass13.anInt2020 <= var41)) {
                method282(DummyClass35.anIntArrayArray663[var41], var44, -122, var43,
                  var2);
              }

              if (GlobalStatics_9.anInt902 >= var42) {
                method282(DummyClass35.anIntArrayArray663[var42], var44, 89, var43,
                  var2);
              }
            }
          }
        }
    }

    public static void method330(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var1 > -83) {
          amountContextActions = 115;
        }

        int var6 = -var3 + var5;
        int var7 = var2 - var4;
        if (var6 == 0) {
          if (var7 != 0) {
            GlobalStatics_6.method126(false, var2, var4, var0, var3);
          }

        } else if ((var7 == 0)) {
          GlobalStatics_9.method1354(var3, var0, true, var5, var4);
        } else {
          int var12 = (var7 << 12) / var6;
          int var13 = -(var12 * var3 >> 12) + var4;
          int var8;
          int var10;
          if (DummyClass55.anInt1425 > var3) {
            var8 = DummyClass55.anInt1425;
            var10 = (DummyClass55.anInt1425 * var12 >> 12) + var13;
          } else if (var3 > GlTexture2d.anInt3765) {
            var10 = (GlTexture2d.anInt3765 * var12 >> 12) + var13;
            var8 = GlTexture2d.anInt3765;
          } else {
            var8 = var3;
            var10 = var4;
          }

          int var9;
          int var11;
          if ((var5 >= DummyClass55.anInt1425)) {
            if (GlTexture2d.anInt3765 < var5) {
              var9 = GlTexture2d.anInt3765;
              var11 = var13 + (var12 * GlTexture2d.anInt3765 >> 12);
            } else {
              var11 = var2;
              var9 = var5;
            }
          } else {
            var9 = DummyClass55.anInt1425;
            var11 = var13 + (var12 * DummyClass55.anInt1425 >> 12);
          }

          if ((DummyClass13.anInt2020 <= var11)) {
            if (var11 > GlobalStatics_9.anInt902) {
              var11 = GlobalStatics_9.anInt902;
              var9 = (GlobalStatics_9.anInt902 - var13 << 12) / var12;
            }
          } else {
            var9 = (DummyClass13.anInt2020 - var13 << 12) / var12;
            var11 = DummyClass13.anInt2020;
          }

          if ((var10 < DummyClass13.anInt2020)) {
            var10 = DummyClass13.anInt2020;
            var8 = (DummyClass13.anInt2020 - var13 << 12) / var12;
          } else if (GlobalStatics_9.anInt902 < var10) {
            var10 = GlobalStatics_9.anInt902;
            var8 = (-var13 + GlobalStatics_9.anInt902 << 12) / var12;
          }

          GlobalStatics_9.method1869((byte) 6, var0, var11, var10, var9, var8);
        }
    }

    public static void sleep(long var0) {
      if (var0 > 0L) {
          if (var0 % 10L == 0L) {
            DummyHashTable.sleep(var0 - 1L);
            DummyHashTable.sleep(1L);
          } else {
            DummyHashTable.sleep(var0);
          }


        }
    }

    public static int method332(int var0, int var1) {
      if (var0 != 2) {
          anInt3414 = -40;
        }

        return ((var1 < 65) || var1 > 90) && ((var1 < 192)
            || var1 > 222 || var1 == 215) ?
          ((var1 != 159) ? (var1 != 140 ? var1 : 156) : 255) :
          32 + var1;
    }

    public static void method333(byte var0) {
      int var1 = 100 / ((76 - var0) / 44);
        aClass93_3412 = null;
        aClass94_3409 = null;
        aClass94_3408 = null;
        aClass47_3407 = null;
    }

    public static boolean isRunesSpritesLoaded(FileUnpacker var0) {
      return var0.isLoaded(GlobalStatics_9.runesFileId);
    }

    public static void method195(int var0) {
      int var1 = (GlobalStatics_9.anInt3995 >> 10) + (anInt1716 >> 3);
        int var2 = (DummyClass49.anInt1111 >> 10) + (GlobalStatics_9.anInt1152 >> 3);
        if (var0 == 20479) {
          byte var3 = 0;
          byte var4 = 8;
          byte var6 = 18;
          GlobalStatics_6.landscapesData = new byte[var6][];
          GlobalStatics_6.updatedLandscapeIds = new int[var6];
          aByteArrayArray3335 = new byte[var6][];
          GlobalStatics_1.mapFileIds = new int[var6];
          GlobalStatics_6.landscapeEncryptionKeys = new int[var6][4];
          GlobalStatics_9.updatedMapsData = new byte[var6][];
          GlobalStatics_6.regionHashes = new int[var6];
          GlobalStatics_9.aByteArrayArray3027 = new byte[var6][];
          GlobalStatics_8.anIntArray3290 = new int[var6];
          TextureSampler17.updatedMapIds = new int[var6];
          DummyClass55.landscapeFileIds = new int[var6];
          byte var5 = 8;
          updatedLandscapesData = new byte[var6][];
          int var11 = 0;

          int var7;
          for (var7 = (-6 + var1) / 8; (var7 <= ((6 + var1) / 8)); ++var7) {
            for (int var8 = (-6 + var2) / 8; (((var2 + 6) / 8) >= var8); ++var8) {
              int var9 = (var7 << 8) + var8;
              GlobalStatics_6.regionHashes[var11] = var9;
              GlobalStatics_1.mapFileIds[var11] = maps.getFileId(GlobalStatics_9.concat(new GameString[] {
                GlobalStatics_8.MAP_PREFIX, GlobalStatics_9.toString(var7), UNDERSCORE,
                GlobalStatics_9.toString(var8)
              }));
              DummyClass55.landscapeFileIds[var11] =
                  maps.getFileId(GlobalStatics_9.concat(new GameString[] {
                  DummyClass12.LANDSCAPE_PREFIX, GlobalStatics_9.toString(var7),
                  UNDERSCORE, GlobalStatics_9.toString(var8)
                }));
              GlobalStatics_8.anIntArray3290[var11] =
                  maps.getFileId(GlobalStatics_9.concat(new GameString[] {
                  DummyCanvas.aClass94_26, GlobalStatics_9.toString(var7), UNDERSCORE,
                  GlobalStatics_9.toString(var8)
                }));
              TextureSampler17.updatedMapIds[var11] =
                  maps.getFileId(GlobalStatics_9.concat(new GameString[] {
                  DummyClass53.UM_PREFIX, GlobalStatics_9.toString(var7), UNDERSCORE,
                  GlobalStatics_9.toString(var8)
                }));
              GlobalStatics_6.updatedLandscapeIds[var11] =
                  maps.getFileId(GlobalStatics_9.concat(new GameString[] {
                  DummyClass10.UL_PREFIX, GlobalStatics_9.toString(var7), UNDERSCORE,
                  GlobalStatics_9.toString(var8)
                }));
              if ((GlobalStatics_8.anIntArray3290[var11] == -1)) {
                GlobalStatics_1.mapFileIds[var11] = -1;
                DummyClass55.landscapeFileIds[var11] = -1;
                TextureSampler17.updatedMapIds[var11] = -1;
                GlobalStatics_6.updatedLandscapeIds[var11] = -1;
              }

              ++var11;
            }
          }

          for (var7 = var11; (var7 < GlobalStatics_8.anIntArray3290.length); ++var7) {
            GlobalStatics_8.anIntArray3290[var7] = -1;
            GlobalStatics_1.mapFileIds[var7] = -1;
            DummyClass55.landscapeFileIds[var7] = -1;
            TextureSampler17.updatedMapIds[var7] = -1;
            GlobalStatics_6.updatedLandscapeIds[var7] = -1;
          }

          GlobalStatics_7.rebuildScene(var3, var2, var1, var5, true, var4, true);
        }
    }

    public static void method196(boolean var0) {
      GlobalStatics_7.aClass93_684.method1523((byte) -117);
        DummyClass5.aClass93_2984.method1523((byte) -111);
        if (var0) {
          anIntArray3083 = null;
        }
    }

    public static void method197(int var0) {
      aClass94_3079 = null;
        anIntArray3076 = null;
        aClass61_3075 = null;
        anIntArray3082 = null;
        aClass94_3080 = null;
        if (var0 == 1) {
          anIntArray3083 = null;
          maps = null;
        }
    }

    public static void method198(boolean var0, int var1) {
      if (var1 != -32624) {
          method196(true);
        }

        int var3 = GlobalStatics_9.aByteArrayArray3027.length;
        byte[][] var2;
        if (GlRenderer.useOpenGlRenderer && var0) {
          var2 = updatedLandscapesData;
        } else {
          var2 = GlobalStatics_6.landscapesData;
        }

        for (int var4 = 0; var4 < var3; ++var4) {
          byte[] var5 = var2[var4];
          if (var5 != null) {
            int var6 = -anInt1716 + 64 * (GlobalStatics_6.regionHashes[var4] >> 8);
            int var7 =
              (GlobalStatics_6.regionHashes[var4] & 255) * 64 - GlobalStatics_9.anInt1152;
            DummyClass43.method1194(var1 + 16239);
            GlobalStatics_9.method374(var6, var0, var5, var7, 0, GlobalStatics_0.collisionMaps);
          }
        }
    }

    public static void method199(int var0, int var1, int var2, int var3) {
      if (var3 != -799) {
          focused = true;
        }

        if ((GlobalStatics_7.anInt2453 != 0)
            && var0 != 0 && (GlobalStatics_9.anInt1552 < 50)
          && (var1 != -1)) {
          GlobalStatics_9.anIntArray2550[GlobalStatics_9.anInt1552] = var1;
          GlobalStatics_9.anIntArray2068[GlobalStatics_9.anInt1552] = var0;
          GlobalStatics_0.anIntArray2157[GlobalStatics_9.anInt1552] = var2;
          GlobalStatics_9.aClass135Array2131[GlobalStatics_9.anInt1552] = null;
          anIntArray3083[GlobalStatics_9.anInt1552] = 0;
          ++GlobalStatics_9.anInt1552;
        }
    }

    public static void method200(byte var0) {
      aClass94_3097 = null;
        aShortArray3095 = null;
        if (var0 != 122) {
          method201(62, -109, 127);
        }

        FRAME = null;
        random = null;
        aClass94_3096 = null;
        aClass3_Sub28_Sub16_3099 = null;
        aClass11_3087 = null;
        aClass153_3098 = null;
    }

    public static int method201(int var0, int var1, int var2) {
      int var3 = var1 - 1 & var0 >> 31;
        int var4 = -95 % ((33 - var2) / 54);
        return var3 + (var0 + (var0 >>> 31)) % var1;
    }

    public static void method290(int var0) {
      aClass94_3307 = null;
        aClass94_3302 = null;
        if (var0 == -9) {
          fileUnpacker10 = null;
          aClass94_3306 = null;
          aClass94_3311 = null;
        }
    }

    public static boolean method292(int var0, int var1, int var2, int var3, SceneNode var4, int var5,
                                    long var6, int var8, int var9, int var10, int var11) {
      return var4 == null || DummyClass42
          .addNodeToSceneGraph(var0, var8, var9, var10 - var8 + 1,
              var11 - var9 + 1, var1,
              var2, var3, var4, var5, true, var6);
    }

    public static int method293(int var0, int var1, boolean var2, int var3) {
      var1 &= 3;
        return var2 ?
          120 :
          (var1 == 0
              ? var3 : (var1 != 1 ? ((var1 != 2) ? var0 : -var3 + 1023) : -var0 + 1023));
    }

    public static int method322(boolean var0, byte var1) {
      return !var0 ? 104 : 255 & var1;
    }

    public static void setupDefaultSun(int brightness) {
      GlEnvironment.setSunColor(GlEnvironment.defaultSunColor,
          (0.7F + brightness * 0.1F) * 1.1523438F, 0.69921875F, 0.69921875F);
        GlEnvironment.setSunPosition(-50.0f, -60.0f, -50.0f);
        GlEnvironment.setFogColor(GlEnvironment.defaultFogColor, 0);
        GlEnvironment.updateSunPosition();
    }

    public static void method325(int var0) {
      aClass94_3401 = null;
        aByteArrayArrayArray3390 = null;
        if (var0 == 0) {
          aByteArray3396 = null;
          aClass133Array3393 = null;
          aClass94_3400 = null;
          aClass94Array3391 = null;
          aClass94_3397 = null;
          aClass94_3399 = null;
          aClass94_3394 = null;
        }
    }

    public static int getByteLength(GameString var1) {
      return var1.getLength() + 1;
    }

    public static void method327(int var0, int var1, byte var2) {
      if (var2 != 68) {
          aClass94_3397 = null;
        }

        WidgetUpdate var3 = GlobalStatics_6.method466(var2 - 64, 12, var1);
        var3.g((byte) 33);
        var3.anInt3598 = var0;
    }

    public static int method210(int var0, int var1, int var2, int var3) {
      if ((var2 == var3)) {
          return var2;
        } else {
          int var4 = -var1 + 128;
          if (var0 != 18348) {
            method213(82, -103, 50, -59, null, 126L, null, null);
          }

          int var5 =
            var1 * ((-16711936 & var3) >>> 7) + var4 * ((-16711936 & var2) >>> 7) & -16711936;
          int var6 = var4 * (16711935 & var2) + ((var3 & 16711935) * var1) & -16711936;
          return var5 + (var6 >> 7);
        }
    }

    public static void method211(int var0) {
      aClass94_3124 = null;
        aClass94_3117 = null;
        if (var0 != 1024) {
          signLink = null;
        }

        aClass94_3120 = null;
        COMMAND_NOCLIP = null;
        fullScreenFrame = null;
        aBooleanArrayArray3118 = null;
        aClass94_3119 = null;
        signLink = null;
    }

    public static void method212(long var0, int var2) {
      if (var0 != 0L) {
          for (int var3 = var2; (var3 < GlobalStatics_6.anInt3591); ++var3) {
            if (GlobalStatics_9.aLongArray1574[var3] == var0) {
              ++DummyClass20.anInt1781;
              --GlobalStatics_6.anInt3591;

              for (int var4 = var3; GlobalStatics_6.anInt3591 > var4; ++var4) {
                GlobalStatics_9.aLongArray1574[var4] =
                  GlobalStatics_9.aLongArray1574[var4 + 1];
                GlobalStatics_9.aClass94Array3341[var4] = GlobalStatics_9.aClass94Array3341[1 + var4];
              }

              DummyClass31.anInt1472 = anInt3213;
              GlobalStatics_9.secureBuffer.writePacket(213);
              GlobalStatics_9.secureBuffer.writeLong(var0);
              break;
            }
          }

        }
    }

    public static void method213(int var0, int var1, int var2, int var3, SceneNode var4, long var5,
                                 SceneNode var7, SceneNode var8) {
      SomethingScene var9 = new SomethingScene();
      var9.aClass140_1073 = var4;
      var9.anInt1078 = var1 * 128 + 64;
      var9.anInt1075 = var2 * 128 + 64;
      var9.anInt1068 = var3;
      var9.aLong1079 = var5;
      var9.aClass140_1067 = var7;
      var9.aClass140_1069 = var8;
      int var10 = 0;
      SceneGraphTile var11 = GLStatics.sceneGraphTiles[var0][var1][var2];
      if (var11 != null) {
        for (int var12 = 0; var12 < var11.anInt2223; ++var12) {
          SceneSomething var13 = var11.sceneGraphNodes[var12];
          if ((var13.aLong498 & 4194304L) == 4194304L) {
            int var14 = var13.sceneNode.getMinimumY();
            if (var14 != -32768 && var14 < var10) {
              var10 = var14;
            }
          }
        }
      }

      var9.anInt1077 = -var10;
      if (GLStatics.sceneGraphTiles[var0][var1][var2] == null) {
        GLStatics.sceneGraphTiles[var0][var1][var2] = new SceneGraphTile(var0, var1, var2);
      }

      GLStatics.sceneGraphTiles[var0][var1][var2].aClass72_2245 = var9;
    }

    public static void method214(SceneNode var0, int var1, int var2, int var3, int var4, int var5) {
      boolean var6 = true;
      int var7 = var2;
      int var8 = var2 + var4;
      int var9 = var3 - 1;
      int var10 = var3 + var5;

      for (int var11 = var1; var11 <= var1 + 1; ++var11) {
        if (var11 != GLStatics.anInt2456) {
          for (int var12 = var7; var12 <= var8; ++var12) {
            if (var12 >= 0 && var12 < SocketStream.sceneWidth) {
              for (int var13 = var9; var13 <= var10; ++var13) {
                if (var13 >= 0 && var13 < TextureSampler17.sceneHeight && (!var6 || var12 >= var8
                  || var13 >= var10 || var13 < var3 && var12 != var2)) {
                  SceneGraphTile var14 = GLStatics.sceneGraphTiles[var11][var12][var13];
                  if (var14 != null) {
                    int var15 = (GlobalStatics_4.heightMap[var11][var12][var13]
                      + GlobalStatics_4.heightMap[var11][var12 + 1][var13]
                      + GlobalStatics_4.heightMap[var11][var12][var13 + 1]
                      + GlobalStatics_4.heightMap[var11][var12 + 1][var13 + 1]) / 4 -
                      (GlobalStatics_4.heightMap[var1][var2][var3]
                        + GlobalStatics_4.heightMap[var1][var2 + 1][var3]
                        + GlobalStatics_4.heightMap[var1][var2][var3 + 1]
                        + GlobalStatics_4.heightMap[var1][var2 + 1][var3 + 1]) / 4;
                    SceneSomething2 var16 = var14.aClass70_2234;
                    if (var16 != null) {
                      if (var16.sceneNode0.method1865()) {
                        var0.method1866(var16.sceneNode0, (var12 - var2) * 128 + (1 - var4) * 64,
                          var15, (var13 - var3) * 128 + (1 - var5) * 64, var6);
                      }

                      if (var16.sceneNode1 != null && var16.sceneNode1.method1865()) {
                        var0.method1866(var16.sceneNode1, (var12 - var2) * 128 + (1 - var4) * 64,
                          var15, (var13 - var3) * 128 + (1 - var5) * 64, var6);
                      }
                    }

                    for (int var17 = 0; var17 < var14.anInt2223; ++var17) {
                      SceneSomething var18 = var14.sceneGraphNodes[var17];
                      if (var18 != null && var18.sceneNode.method1865() && (var12 == var18.anInt483
                        || var12 == var7) && (var13 == var18.anInt478 || var13 == var9)) {
                        int var19 = var18.anInt495 - var18.anInt483 + 1;
                        int var20 = var18.anInt481 - var18.anInt478 + 1;
                        var0.method1866(var18.sceneNode,
                          (var18.anInt483 - var2) * 128 + (var19 - var4) * 64, var15,
                          (var18.anInt478 - var3) * 128 + (var20 - var5) * 64, var6);
                      }
                    }
                  }
                }
              }
            }
          }

          --var7;
          var6 = false;
        }
      }

    }

    public static void method215(byte var0, SoftwareIndexedColorSprite var1) {
      short var2 = 256;
        int var3 = 0;
        if (var0 >= -80) {
          aBoolean3116 = true;
        }

        while (DummyClass12.anIntArray2026.length > var3) {
          DummyClass12.anIntArray2026[var3] = 0;
          ++var3;
        }

        int var4;
        for (var3 = 0; (var3 < 5000); ++var3) {
          var4 = (int) (var2 * Math.random() * 128.0D);
          DummyClass12.anIntArray2026[var4] = (int) (Math.random() * 284.0D);
        }

        int var5;
        int var6;
        for (var3 = 0; (var3 < 20); ++var3) {
          for (var4 = 1; (-1 + var2) > var4; ++var4) {
            for (var5 = 1; var5 < 127; ++var5) {
              var6 = var5 + (var4 << 7);
              DummyOutputStream.anIntArray49[var6] =
                (DummyClass12.anIntArray2026[128 + var6] + DummyClass12.anIntArray2026[-1 + var6]
                  + DummyClass12.anIntArray2026[1 + var6] + DummyClass12.anIntArray2026[-128 + var6])
                  / 4;
            }
          }

          int[] var10 = DummyClass12.anIntArray2026;
          DummyClass12.anIntArray2026 = DummyOutputStream.anIntArray49;
          DummyOutputStream.anIntArray49 = var10;
        }

        if (var1 != null) {
          var3 = 0;

          for (var4 = 0; var1.height > var4; ++var4) {
            for (var5 = 0; var1.width > var5; ++var5) {
              if (var1.aByteArray2674[var3++] != 0) {
                var6 = var1.offsetX + var5 + 16;
                int var7 = var1.offsetY + (var4 + 16);
                int var8 = var6 + (var7 << 7);
                DummyClass12.anIntArray2026[var8] = 0;
              }
            }
          }
        }
    }

    public static void method216(Buffer var0, int var1) {
      for (int var2 = 0; GlobalStatics_9.anInt906 > var2; ++var2) {
          int var3 = var0.readUnsignedShortSmart();
          int var4 = var0.readUnsignedShort();
          if ((var4 == 65535)) {
            var4 = -1;
          }

          if (DummyClass26.aClass44_Sub1Array1609[var3] != null) {
            DummyClass26.aClass44_Sub1Array1609[var3].anInt722 = var4;
          }
        }

        if (var1 != -14991) {
          COMMAND_NOCLIP = null;
        }
    }

    public static void method236(byte var0) {
      if (var0 == 64) {
          aBoolean3387 = true;
        }
    }

    public static void parseNpcUpdate() {
      GlobalStatics_9.anInt997 = 0;
        DummyClass17.anInt1829 = 0;
        GlobalStatics_9.method945((byte) -11);
        DummyClass10.method2261(113);
        GlobalStatics_9.method1349();

        int var1;
        for (var1 = 0; (var1 < DummyClass17.anInt1829); ++var1) {
          int var2 = anIntArray2292[var1];
          if ((GlobalStatics_8.npcs[var2].anInt2838 != GlobalStatics_4.updateCycle)) {
            if (GlobalStatics_8.npcs[var2].config.method1474(-1)) {
              GlobalStatics_6.method574(GlobalStatics_8.npcs[var2], false);
            }

            GlobalStatics_8.npcs[var2].setConfiguration(-1, null);
            GlobalStatics_8.npcs[var2] = null;
          }
        }
        if (GlobalStatics_0.packetLength == GlobalStatics_9.gameBuffer.position) {
          for (var1 = 0; var1 < DummyClass6.anInt2046; ++var1) {
            if (GlobalStatics_8.npcs[GlobalStatics_2.anIntArray347[var1]] == null) {
              throw new RuntimeException("gnp2 pos:" + var1 + " size:" + DummyClass6.anInt2046);
            }
          }

        } else {
          throw new RuntimeException("gnp1 pos:" + GlobalStatics_9.gameBuffer.position + " psize:"
            + GlobalStatics_0.packetLength);
        }
    }

    public static void method238(int var0) {
      if (var0 == 9423) {
          RSAConfiguration.PUBLIC_EXPONENT = null;
          aClass94_3169 = null;
          anIntArray3171 = null;
          fileCacheRequester = null;
          aClass153_3173 = null;
          aClass94_3168 = null;
          aClass94_3167 = null;
          UNDERSCORE = null;
          aClass94_3170 = null;
          aClass94_3172 = null;
        }
    }

    public static void method300(int var0) {
      walkTooltip = null;
        if (var0 <= 6) {
          aClass94_3345 = null;
        }

        aShortArray3349 = null;
        aClass3_Sub11ArrayArray3346 = null;
        aClass94_3355 = null;
        aClass94_3345 = null;
        textures = null;
    }

    public static int method301(byte var0) {
      int var1 = -47 / ((45 - var0) / 57);
        return anInt3398;
    }

    public static void updateProjectiles() {
      for (ProjectileNode node = (ProjectileNode) GlobalStatics_9.projectiles.getFirst();
           node != null; node = (ProjectileNode) GlobalStatics_9.projectiles.getNext()) {
          Projectile projectile = node.projectile;
          if ((GlobalStatics_9.currentPlane == projectile.anInt2907)
            && (projectile.anInt2899 >= GlobalStatics_4.updateCycle)) {
            if (GlobalStatics_4.updateCycle >= projectile.anInt2925) {
              if ((projectile.targetId > 0)) {
                NPC var3 = GlobalStatics_8.npcs[-1 + projectile.targetId];
                if (var3 != null && var3.anInt2819 >= 0 && var3.anInt2819 < 13312
                  && var3.anInt2829 >= 0 && (var3.anInt2829 < 13312)) {
                  projectile.method2024(var3.anInt2829, 1, GlobalStatics_4.updateCycle,
                    GlobalStatics_6.method1736(projectile.anInt2907, 1, var3.anInt2819, var3.anInt2829)
                      - projectile.anInt2903, var3.anInt2819);
                }
              }

              if (projectile.targetId < 0) {
                int var4 = -1 - projectile.targetId;
                Player player;
                if (localPlayerId == var4) {
                  player = GlobalStatics_9.localPlayer;
                } else {
                  player = GlobalStatics_9.players[var4];
                }

                if (player != null && player.anInt2819 >= 0 && (player.anInt2819 < 13312)
                  && player.anInt2829 >= 0 && (player.anInt2829 < 13312)) {
                  projectile.method2024(player.anInt2829, 1, GlobalStatics_4.updateCycle,
                    GlobalStatics_6.method1736(projectile.anInt2907, 1, player.anInt2819, player.anInt2829)
                      - projectile.anInt2903, player.anInt2819);
                }
              }

              projectile.update(GlobalStatics_7.loopCycle);
              DummyClass29.addNodeToSceneGraph(GlobalStatics_9.currentPlane,
                (int) projectile.aDouble2920, (int) projectile.aDouble2900,
                (int) projectile.aDouble2914, 60, projectile, projectile.anInt2924, -1L, false);
            }
          } else {
            node.unlinkNode();
          }
        }
    }

    public static void method177(byte var0) {
      aClass94_3053 = null;
        aClass94_3051 = null;
        aClass94_3048 = null;
        if (var0 != 119) {
          aShort3052 = 109;
        }

        keyboard = null;
    }

    public static int method179(byte var0, int var1) {
      if (var0 == 92) {
          if (GlobalStatics_9.gameSocket != null) {
            GlobalStatics_9.gameSocket.destroy();
            GlobalStatics_9.gameSocket = null;
          }

          ++GlobalStatics_7.anInt1088;
          if ((GlobalStatics_7.anInt1088 > 4)) {
            GLStatics.anInt692 = 0;
            GlobalStatics_7.anInt1088 = 0;
            return var1;
          } else {
            GLStatics.anInt692 = 0;
            if (DummyClass24.anInt1658 == GlobalStatics_9.primaryPort) {
              DummyClass24.anInt1658 = DummyClass41.secondaryPort;
            } else {
              DummyClass24.anInt1658 = GlobalStatics_9.primaryPort;
            }

            return -1;
          }
        } else {
          return 122;
        }
    }

    public static void method180(int var0, int var1, int var2) {
      int var3;
        if (GlobalStatics_9.anInt1559 != var2) {
          GlobalStatics_9.anIntArray2125 = new int[var2];

          for (var3 = 0; var2 > var3; ++var3) {
            GlobalStatics_9.anIntArray2125[var3] = (var3 << 12) / var2;
          }

          DummyClass53.anInt1343 = var2 != 64 ? 4096 : 2048;
          GlobalStatics_9.anInt396 = -1 + var2;
          GlobalStatics_9.anInt1559 = var2;
        }

        var3 = 111 / ((56 - var0) / 38);
        if (DummyClass55.anInt1427 != var1) {
          if (GlobalStatics_9.anInt1559 == var1) {
            DummyClass4.anIntArray2999 = GlobalStatics_9.anIntArray2125;
          } else {
            DummyClass4.anIntArray2999 = new int[var1];

            for (int var4 = 0; var4 < var1; ++var4) {
              DummyClass4.anIntArray2999[var4] = (var4 << 12) / var1;
            }
          }

          DummyClass55.anInt1427 = var1;
          anInt2487 = var1 - 1;
        }
    }

    public static boolean parsePacket(int var0) {
      try {
          return DummyClass18.parsePacket((byte) -83);
        } catch (IOException var4) {
          GlobalStatics_8.method289(false);
          return true;
        } catch (Exception var5) {
          String var2 = "T2 - " + GlobalStatics_0.packetId + "," + GlobalStatics_7.lastPacketId1 + ","
            + GlobalStatics_9.lastPacketId2 + " - " + GlobalStatics_0.packetLength + "," + (
            anInt1716 + GlobalStatics_9.localPlayer.waypointsX[0]) + "," + (
            GlobalStatics_9.localPlayer.waypointsY[0] + GlobalStatics_9.anInt1152) + " - ";

          for (int var3 = 0; var3 < GlobalStatics_0.packetLength && var3 < 50; ++var3) {
            var2 = var2 + GlobalStatics_9.gameBuffer.bytes[var3] + ",";
          }

          GlobalStatics_9.reportError(var2, var5, (byte) 108);
          DummyClass10.destroyGame((byte) 46);
          return true;
        }
    }

    public static void method182(boolean var0) {
      if (!var0) {
          method179((byte) 120, -73);
        }

        GlobalStatics_9.aClass93_1146.method1524(3);
        DummyClass13.aClass93_2016.method1524(3);
    }

    public static void method183(int var0) {
      if (var0 > -91) {
          keyboard = null;
        }

        GlobalStatics_7.aClass93_684.method1524(3);
        DummyClass5.aClass93_2984.method1524(3);
    }

    public static void method184(int var0, int var1, int var2, int var3, int var4, int var5,
                                 int var6) {
      int var11 =
          DummyClass59.method1040(GlobalStatics_9.anInt902, var6, (byte) 0, DummyClass13.anInt2020);
        int var12 =
          DummyClass59.method1040(GlobalStatics_9.anInt902, var0, (byte) 0, DummyClass13.anInt2020);
        int var13 =
          DummyClass59.method1040(GlTexture2d.anInt3765, var3, (byte) 0, DummyClass55.anInt1425);
        int var14 =
          DummyClass59.method1040(GlTexture2d.anInt3765, var2, (byte) 0, DummyClass55.anInt1425);
        if (var4 != 1) {
          method183(-1);
        }

        int var7 = DummyClass59.method1040(GlobalStatics_9.anInt902, var6 + var1, (byte) 0,
          DummyClass13.anInt2020);
        int var8 = DummyClass59.method1040(GlobalStatics_9.anInt902, -var1 + var0, (byte) 0,
          DummyClass13.anInt2020);

        int var15;
        for (var15 = var11; var7 > var15; ++var15) {
          method282(DummyClass35.anIntArrayArray663[var15], var13, 127, var14, var5);
        }

        for (var15 = var12; (var8 < var15); --var15) {
          method282(DummyClass35.anIntArrayArray663[var15], var13, -76, var14, var5);
        }

        int var9 = DummyClass59.method1040(GlTexture2d.anInt3765, var1 + var3, (byte) 0,
          DummyClass55.anInt1425);
        int var10 = DummyClass59.method1040(GlTexture2d.anInt3765, -var1 + var2, (byte) 0,
          DummyClass55.anInt1425);

        for (var15 = var7; (var15 <= var8); ++var15) {
          int[] var16 = DummyClass35.anIntArrayArray663[var15];
          method282(var16, var13, -59, var9, var5);
          method282(var16, var10, var4 - 97, var14, var5);
        }
    }

    public static boolean method185(int var0, int var1, int var2, int var3,
                                    int var4, int var5,
                                    int var6, int var7) {
      if (var1 < var2 && var1 < var3 && var1 < var4) {
        return false;
      } else if (var1 > var2 && var1 > var3 && var1 > var4) {
        return false;
      } else if (var0 < var5 && var0 < var6 && var0 < var7) {
        return false;
      } else if (var0 > var5 && var0 > var6 && var0 > var7) {
        return false;
      } else {
        int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
        int var9 = (var1 - var4) * (var5 - var7) - (var0 - var7) * (var2 - var4);
        int var10 = (var1 - var3) * (var7 - var6) - (var0 - var6) * (var4 - var3);
        return var8 * var10 > 0 && var10 * var9 > 0;
      }
    }

    public static void method187(boolean var0) {
      updatedLandscapesData = null;
        if (var0) {
          aClass94_3055 = null;
        }

        aClass94_3055 = null;
    }

    public static void method188(int var0, int var1) {
      if (var1 != 0) {
          method188(38, 29);
        }

        DummyClass14.aClass93_1955.method1522(-125, var0);
    }

    public static void method189(byte var0) {
      int var2 = -18 / ((28 - var0) / 32);

        int var1;
        for (var1 = -1; DummyClass13.anInt2022 > var1; ++var1) {
          int var3;
          if ((var1 == -1)) {
            var3 = 2047;
          } else {
            var3 = DummyClass42.anIntArray887[var1];
          }

          Player var4 = GlobalStatics_9.players[var3];
          if (var4 != null && var4.anInt2814 > 0) {
            --var4.anInt2814;
            if ((var4.anInt2814 == 0)) {
              var4.aClass94_2825 = null;
            }
          }
        }

        for (var1 = 0; DummyClass6.anInt2046 > var1; ++var1) {
          var2 = GlobalStatics_2.anIntArray347[var1];
          NPC var6 = GlobalStatics_8.npcs[var2];
          if (var6 != null && (var6.anInt2814 > 0)) {
            --var6.anInt2814;
            if ((var6.anInt2814 == 0)) {
              var6.aClass94_2825 = null;
            }
          }
        }
    }

    public static int method190(int var0, int hsl, byte var2, int lightness) {
      int var5 = GLStatics.hslTable[GlobalStatics_1.repackHSL(hsl, lightness)];
        if ((var0 > 0)) {
          int var6 = GLStatics.textureCache.method19(111, var0 & '\uffff');
          int var7;
          int var9;
          if ((var6 != 0)) {
            if ((lightness >= 0)) {
              if ((lightness > 127)) {
                var7 = 16777215;
              } else {
                var7 = 131586 * lightness;
              }
            } else {
              var7 = 0;
            }

            if (var6 == 256) {
              var5 = var7;
            } else {
              var9 = -var6 + 256;
              var5 =
                  (16711680 & (var7 & '\uff00') * var6 + var9 * (var5 & '\uff00'))
                      + (
                      var6 * (var7 & 16711935) + ((16711935 & var5) * var9)
                          & -16711936) >> 8;
            }
          }

          var7 = GLStatics.textureCache.method10(106, '\uffff' & var0);
          if ((var7 != 0)) {
            var7 += 256;
            int var8 = ((16711680 & var5) >> 16) * var7;
            if (var8 > '\uffff') {
              var8 = '\uffff';
            }

            var9 = ((var5 & '\uff00') >> 8) * var7;
            if (var9 > '\uffff') {
              var9 = '\uffff';
            }

            int var10 = var7 * (var5 & 255);
            if (var10 > '\uffff') {
              var10 = '\uffff';
            }

            var5 = (var10 >> 8) + ('\uff00' & var9) + (16711711 & var8 << 8);
          }
        }

        return var5;
    }

    public static void method193(byte var0, Component var1) {
      if (var0 < 49) {
          anInt3054 = 85;
        }
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(keyboard);
        var1.addFocusListener(keyboard);
    }

    public static void method294(byte var0) {
      anIntArray3327 = null;
        anIntArray3337 = null;
        aClass94_3326 = null;
        aClass94Array3317 = null;
        aClass94_3334 = null;
        anIntArray3328 = null;
        ASSIST_REQ = null;
        aClass94_3324 = null;
        anIntArray3319 = null;
        aByteArrayArray3335 = null;
        anIntArray3329 = null;
        aClass94_3333 = null;
        anIntArray3336 = null;
        int var1 = -62 % ((-59 - var0) / 47);
        anIntArray3321 = null;
        anIntArray3318 = null;
        anIntArray3331 = null;
        aClass94_3325 = null;
    }

    public static void method338(int var0, int var1, boolean var2, int var3, int var4, int var5) {
      ++GlobalStatics_6.anInt1127;
        DummyClass23.method1745(0);
        if (!var2) {
          GlobalStatics_9.method116(true, 670232012);
          GlobalStatics_9.method1611(71, true);
          GlobalStatics_9.method116(false, 670232012);
        }

        GlobalStatics_9.method1611(100, false);
        if (!var2) {
          updateProjectiles();
        }

        GlobalStatics_6.method2067(false);
        if (GlRenderer.useOpenGlRenderer) {
          DummyClass45.method1239(var4, 125, var5, var1, var3, true);
          var3 = DummyClass5.anInt2989;
          var5 = GlobalStatics_9.anInt3564;
          var4 = GlobalStatics_9.anInt1358;
          var1 = GlobalStatics_8.anInt31;
        }

        int var6;
        int var7;
        if (GlobalStatics_9.anInt1753 == 1) {
          var7 = 2047 & GlobalStatics_0.anInt2589 + GlobalStatics_9.anInt531;
          var6 = GlobalStatics_6.anInt2309;
          if ((var6 < (GlobalStatics_9.anInt2670 / 256))) {
            var6 = GlobalStatics_9.anInt2670 / 256;
          }

          if (MaterialShader5.aBooleanArray2169[4]
            && GlobalStatics_9.anIntArray2073[4] + 128 > var6) {
            var6 = 128 + GlobalStatics_9.anIntArray2073[4];
          }

          GlobalStatics_9.method1952(anInt3155, -1907397104, var1,
            GlobalStatics_6.method1736(GlobalStatics_9.currentPlane, 1,
              GlobalStatics_9.localPlayer.anInt2819, GlobalStatics_9.localPlayer.anInt2829) - 50,
            600 + (var6 * 3), var7, GlobalStatics_8.anInt942, var6);
        }

        if (var0 == -6403) {
          var7 = GlobalStatics_7.anInt2162;
          var6 = GlobalStatics_9.anInt3995;
          int var8 = DummyClass49.anInt1111;
          int var9 = DummyClass17.anInt1823;
          int var10 = anInt3315;

          int var11;
          int var12;
          for (var11 = 0; var11 < 5; ++var11) {
            if (MaterialShader5.aBooleanArray2169[var11]) {
              var12 = (int) ((-anIntArray3383[var11])
                + (anIntArray3383[var11] * 2 + 1) * Math.random() +
                Math.sin(DummyClass9.anIntArray4009[var11] * (
                  GlobalStatics_9.anIntArray3359[var11] / 100.0D))
                  * GlobalStatics_9.anIntArray2073[var11]);
              if (var11 == 3) {
                anInt3315 = var12 + anInt3315 & 2047;
              }

              if ((var11 == 4)) {
                DummyClass17.anInt1823 += var12;
                if (DummyClass17.anInt1823 < 128) {
                  DummyClass17.anInt1823 = 128;
                }

                if ((DummyClass17.anInt1823 > 383)) {
                  DummyClass17.anInt1823 = 383;
                }
              }

              if ((var11 == 2)) {
                DummyClass49.anInt1111 += var12;
              }

              if (var11 == 1) {
                GlobalStatics_7.anInt2162 += var12;
              }

              if (var11 == 0) {
                GlobalStatics_9.anInt3995 += var12;
              }
            }
          }

          Texture.method725(-118);
          if (GlRenderer.useOpenGlRenderer) {
            GlUtils.clip(var3, var5, var3 + var4, var5 + var1);
            float var17 = DummyClass17.anInt1823 * 0.17578125F;
            float var16 = 0.17578125F * anInt3315;
            if (GlobalStatics_9.anInt1753 == 3) {
              var17 = 360.0F * DummyClass52.aFloat1169 / 6.2831855F;
              var16 = DummyClass38.aFloat730 * 360.0F / 6.2831855F;
            }

            GlRenderer.method1844(var3, var5, var4, var1, var4 / 2 + var3, var5 + (var1 / 2), var17,
              var16, GlobalStatics_0.anInt1705, GlobalStatics_0.anInt1705);
          } else {
            DummyClass47.method1324(var3, var5, var4 + var3, var1 + var5);
            DummyClass40.method1134();
          }

          if (!DummyClass36.aBoolean2615 && (GlobalStatics_9.anInt1297 >= var3)
            && (GlobalStatics_9.anInt1297 < (var4 + var3)) && var5 <= DummyClass36.anInt2612
            && (var1 + var5) > DummyClass36.anInt2612) {
            aBoolean3094 = true;
            GlobalStatics_9.anInt59 = 0;
            var12 = screenUpperX;
            int var13 = DummyClass3.screenUpperY;
            var11 = DummyClass17.screenLowerX;
            GlobalStatics_9.anInt3642 =
              var11 + (var12 - var11) * (-var3 + GlobalStatics_9.anInt1297) / var4;
            int var14 = GLStatics.screenLowerY;
            GlobalStatics_9.anInt384 =
              (-var13 + var14) * (DummyClass36.anInt2612 - var5) / var1 + var13;
          } else {
            aBoolean3094 = false;
            GlobalStatics_9.anInt59 = 0;
          }

          DummyClass43.method1194(-16385);
          byte var19 = (DummyClass20.method1817((byte) 70) != 2) ? 1 : (byte) GlobalStatics_6.anInt1127;
          if (GlRenderer.useOpenGlRenderer) {
            GlRenderer.method1846();
            GlRenderer.setDepthTestEnabled(true);
            boolean var18 = false;
            GlRenderer.setFogEnabled(true);
            if ((DummyClass15.state == 10)) {
              var12 = GlobalStatics_8.method809(GlobalStatics_7.loopCycle, DummyClass49.anInt1111 >> 10,
                GlobalStatics_4.brightnessSetting, GlobalStatics_9.anInt3995 >> 10,
                  1);
            } else {
              var12 = GlobalStatics_8.method809(GlobalStatics_7.loopCycle,
                GlobalStatics_9.localPlayer.waypointsY[0] >> 3, GlobalStatics_4.brightnessSetting,
                GlobalStatics_9.localPlayer.waypointsX[0] >> 3, 1);
            }

            DummyClass46.method1269(GlobalStatics_4.updateCycle, !GlobalStatics_9.aBoolean2623);
            GlRenderer.clearBuffers(var12);
            GlobalStatics_8.method2285(DummyClass17.anInt1823, DummyClass49.anInt1111,
              GlobalStatics_7.anInt2162, GlobalStatics_9.anInt3995, false, anInt3315);
            GlRenderer.anInt1791 = GlobalStatics_4.updateCycle;
            GlobalStatics_6.drawScene(GlobalStatics_9.anInt3995, GlobalStatics_7.anInt2162,
              DummyClass49.anInt1111, DummyClass17.anInt1823, anInt3315,
              GlobalStatics_5.aByteArrayArrayArray2008, GlobalStatics_7.anIntArray686,
              GlobalStatics_9.anIntArray2696, DummyClass13.anIntArray2021, GlobalStatics_9.anIntArray3959,
              GlobalStatics_3.anIntArray1871, GlobalStatics_9.currentPlane + 1, var19,
              GlobalStatics_9.localPlayer.anInt2819 >> 7, GlobalStatics_9.localPlayer.anInt2829 >> 7);
            DummyOutputStream.aBoolean47 = true;
            DummyClass46.disableLights();
            GlobalStatics_8.method2285(0, 0, 0, 0, false, 0);
            DummyClass43.method1194(-16385);
            GlobalStatics_0.method1775();
            GlobalStatics_9.method1405(var5, var4, var3, GlobalStatics_0.anInt1705, var1,
              GlobalStatics_0.anInt1705, -7397);
            DummyClass8.method2221(var4, var3, var1, true, GlobalStatics_0.anInt1705, GlobalStatics_0.anInt1705,
              var5);
          } else {
            DummyClass47.method1323(var3, var5, var4, var1, 0);
            GlobalStatics_6.drawScene(GlobalStatics_9.anInt3995, GlobalStatics_7.anInt2162,
              DummyClass49.anInt1111, DummyClass17.anInt1823, anInt3315,
              GlobalStatics_5.aByteArrayArrayArray2008, GlobalStatics_7.anIntArray686,
              GlobalStatics_9.anIntArray2696, DummyClass13.anIntArray2021, GlobalStatics_9.anIntArray3959,
              GlobalStatics_3.anIntArray1871, GlobalStatics_9.currentPlane + 1, var19,
              GlobalStatics_9.localPlayer.anInt2819 >> 7, GlobalStatics_9.localPlayer.anInt2829 >> 7);
            DummyClass43.method1194(var0 - 9982);
            GlobalStatics_0.method1775();
            GlobalStatics_9.method1405(var5, var4, var3, 256, var1, 256, var0 - 994);
            DummyClass8.method2221(var4, var3, var1, true, 256, 256, var5);
          }

          ((TextureCache) GLStatics.textureCache).update(true, GlobalStatics_7.loopCycle);
          DummyClass45.method1235(var4, var5, var1, var3, (byte) -121);
          DummyClass17.anInt1823 = var9;
          DummyClass49.anInt1111 = var8;
          GlobalStatics_7.anInt2162 = var7;
          GlobalStatics_9.anInt3995 = var6;
          anInt3315 = var10;
          if (aBoolean3064 && DummyClass43.ondemandRequester.method1253(4) == 0) {
            aBoolean3064 = false;
          }

          if (aBoolean3064) {
            if (GlRenderer.useOpenGlRenderer) {
              GlUtils.fillQuad(var3, var5, var4, var1, 0);
            } else {
              DummyClass47.method1323(var3, var5, var4, var1, 0);
            }

            GlobalStatics_3.drawLoadingBox(LOADING_PLEASE_WAIT, false);
          }

          if (!var2 && !aBoolean3064 && !DummyClass36.aBoolean2615
            && var3 <= GlobalStatics_9.anInt1297 && var4 + var3 > GlobalStatics_9.anInt1297
            && (var5 <= DummyClass36.anInt2612) && var1 + var5 > DummyClass36.anInt2612) {
            MaterialShader5.method1628(var5, var4, var1, var3, DummyClass36.anInt2612,
              GlobalStatics_9.anInt1297, (byte) 97);
          }

        }
    }

    public static int method340(int var0, int var1) {
      int var2 = 74 % ((8 - var1) / 54);
        return var0 >>> 8;
    }

    public static void method341(byte var0) {
      aClass94_3428 = null;
        aClass94_3437 = null;
        aClass94_3427 = null;
        aClass94_3426 = null;
        aClass94_3432 = null;
        if (var0 > 66) {
          animationSequences = null;
          floorUnderlayIds = null;
          aClass94_3436 = null;
        }
    }

    public static ClientScriptEnum getEnum(int var0, boolean var1) {
      ClientScriptEnum var2 =
          (ClientScriptEnum) GlobalStatics_9.aClass47_2686.get(var0, 1400);
        if (var2 != null) {
          return var2;
        } else {
          byte[] var3 = DummyClass38.aClass153_731.getBytes(DummyClass41.method1170((byte) 44, var0),
            GlobalStatics_8.method810((byte) 3, var0));
          var2 = new ClientScriptEnum();
          if (!var1) {
            method344(-42, 33);
          }

          if (var3 != null) {
            var2.parseConfig(new Buffer(var3));
          }

          GlobalStatics_9.aClass47_2686.put(var0, var2);
          return var2;
        }
    }

    public static AbstractIndexedColorSprite[] method343(int var0) {
      AbstractIndexedColorSprite[] var1 = new AbstractIndexedColorSprite[DummyClass53.spriteCount];

        for (int i = 0; i < DummyClass53.spriteCount; i++) {
          if (GlRenderer.useOpenGlRenderer) {
            var1[i] =
                new GlIndexedColorSprite(GlobalStatics_9.anInt2426,
                    GlobalStatics_9.anInt1748,
                    GlobalStatics_9.anIntArray2048[i], GlobalStatics_0.anIntArray2591[i],
                    GlobalStatics_9.anIntArray2931[i],
                    anIntArray3076[i],
                    DummyClass5.aByteArrayArray2987[i],
                    anIntArray3446);
          } else {
            var1[i] = new SoftwareIndexedColorSprite(GlobalStatics_9.anInt2426,
                GlobalStatics_9.anInt1748, GlobalStatics_9.anIntArray2048[i],
                GlobalStatics_0.anIntArray2591[i], GlobalStatics_9.anIntArray2931[i],
                anIntArray3076[i],
                DummyClass5.aByteArrayArray2987[i],
                anIntArray3446);
          }
        }

        if (var0 != 1854847236) {
          aClass94_3428 = null;
        }

        DummyClass37.method1035((byte) 113);
        return var1;
    }

    public static void method344(int var0, int var1) {
      if (var0 >= 0 && GlobalStatics_6.aBooleanArray3503.length > var0) {
          GlobalStatics_6.aBooleanArray3503[var0] = !GlobalStatics_6.aBooleanArray3503[var0];
          if (var1 != 4) {
            floorUnderlayIds = null;
          }

        }
    }

    public static void method267(byte var0) {
      if (DummyCanvas.anInt23 != 0) {
          try {
            if (++DummyClass22.anInt1734 > 2000) {
              if (GlobalStatics_9.gameSocket != null) {
                GlobalStatics_9.gameSocket.destroy();
                GlobalStatics_9.gameSocket = null;
              }

              if ((GlobalStatics_9.anInt548 >= 1)) {
                GlobalStatics_0.anInt1711 = -5;
                DummyCanvas.anInt23 = 0;
                return;
              }

              DummyCanvas.anInt23 = 1;
              DummyClass22.anInt1734 = 0;
              ++GlobalStatics_9.anInt548;
              if (GlobalStatics_9.anInt2894 == DummyClass11.anInt2036) {
                GlobalStatics_9.anInt2894 = GlobalStatics_9.anInt506;
              } else {
                GlobalStatics_9.anInt2894 = DummyClass11.anInt2036;
              }
            }

            if (DummyCanvas.anInt23 == 1) {
              GlobalStatics_6.socketRequest =
                DummyClass35.signLink.method1441((byte) 8, DummyClass36.aString2611,
                  GlobalStatics_9.anInt2894);
              DummyCanvas.anInt23 = 2;
            }

            int var1;
            if ((DummyCanvas.anInt23 == 2)) {
              assert GlobalStatics_6.socketRequest != null;
              if ((GlobalStatics_6.socketRequest.status == 2)) {
                throw new IOException();
              }

              if (GlobalStatics_6.socketRequest.status != 1) {
                return;
              }

              GlobalStatics_9.gameSocket =
                new SocketStream((Socket) GlobalStatics_6.socketRequest.result,
                  DummyClass35.signLink);
              GlobalStatics_6.socketRequest = null;
              GlobalStatics_9.gameSocket.write(GlobalStatics_9.secureBuffer.bytes, 0,
                GlobalStatics_9.secureBuffer.position);
              if (GlobalStatics_9.audioOutputStream0 != null) {
                GlobalStatics_9.audioOutputStream0.pause();
              }

              if (GlobalStatics_9.audioOutputStream1 != null) {
                GlobalStatics_9.audioOutputStream1.pause();
              }

              var1 = GlobalStatics_9.gameSocket.read();
              if (GlobalStatics_9.audioOutputStream0 != null) {
                GlobalStatics_9.audioOutputStream0.pause();
              }

              if (GlobalStatics_9.audioOutputStream1 != null) {
                GlobalStatics_9.audioOutputStream1.pause();
              }

              if (var1 != 21) {
                GlobalStatics_0.anInt1711 = var1;
                DummyCanvas.anInt23 = 0;
                GlobalStatics_9.gameSocket.destroy();
                GlobalStatics_9.gameSocket = null;
                return;
              }

              DummyCanvas.anInt23 = 3;
            }

            if (var0 <= 26) {
              method269(-75, 44);
            }

            if (DummyCanvas.anInt23 == 3) {
              if ((GlobalStatics_9.gameSocket.available() < 1)) {
                return;
              }

              aClass94Array3391 =
                new GameString[GlobalStatics_9.gameSocket.read()];
              DummyCanvas.anInt23 = 4;
            }

            if ((DummyCanvas.anInt23 == 4)) {
              if ((GlobalStatics_9.gameSocket.available() < (8
                * aClass94Array3391.length))) {
                return;
              }

              GlobalStatics_9.gameBuffer.position = 0;
              GlobalStatics_9.gameSocket.read(GlobalStatics_9.gameBuffer.bytes, 0,
                8 * aClass94Array3391.length);

              for (var1 = 0; aClass94Array3391.length > var1; ++var1) {
                aClass94Array3391[var1] =
                  GameStringStatics.stringFromBase37(-29664, GlobalStatics_9.gameBuffer.readLong());
              }

              GlobalStatics_0.anInt1711 = 21;
              DummyCanvas.anInt23 = 0;
              GlobalStatics_9.gameSocket.destroy();
              GlobalStatics_9.gameSocket = null;
              return;
            }
          } catch (IOException var2) {
            if (GlobalStatics_9.gameSocket != null) {
              GlobalStatics_9.gameSocket.destroy();
              GlobalStatics_9.gameSocket = null;
            }

            if ((GlobalStatics_9.anInt548 < 1)) {
              ++GlobalStatics_9.anInt548;
              if (DummyClass11.anInt2036 == GlobalStatics_9.anInt2894) {
                GlobalStatics_9.anInt2894 = GlobalStatics_9.anInt506;
              } else {
                GlobalStatics_9.anInt2894 = DummyClass11.anInt2036;
              }

              DummyClass22.anInt1734 = 0;
              DummyCanvas.anInt23 = 1;
            } else {
              GlobalStatics_0.anInt1711 = -4;
              DummyCanvas.anInt23 = 0;
            }
          }

        }
    }

    public static void method268(byte var0) {
      if (var0 != -91) {
          method268((byte) 7);
        }

        aClass3_Sub28_Sub3_3264 = null;
    }

    public static void method269(int var0, int var1) {
      if (var0 != -5) {
          anInt3263 = 109;
        }

        GlobalStatics_0.aClass93_939.method1522(-128, var1);
    }

    public static void method272(byte var0) {
      if (var0 != -124) {
          aClass3_Sub28_Sub3_3264 = null;
        }

        int var1 = aByteArrayArray3335.length;

        for (int var2 = 0; var2 < var1; ++var2) {
          if (aByteArrayArray3335[var2] != null) {
            int var3 = -1;

            for (int var4 = 0; (var4 < GlobalStatics_9.anInt3244); ++var4) {
              if (GlobalStatics_9.anIntArray3367[var4] == GlobalStatics_6.regionHashes[var2]) {
                var3 = var4;
                break;
              }
            }

            if ((var3 == -1)) {
              GlobalStatics_9.anIntArray3367[GlobalStatics_9.anInt3244] =
                GlobalStatics_6.regionHashes[var2];
              var3 = GlobalStatics_9.anInt3244++;
            }

            int var5 = 0;
            Buffer var16 = new Buffer(aByteArrayArray3335[var2]);

            while ((var16.position < aByteArrayArray3335[var2].length)
              && var5 < 511) {
              int var6 = var5++ << 6 | var3;
              int var7 = var16.readUnsignedShort();
              int var8 = var7 >> 14;
              int var9 = 63 & var7 >> 7;
              int var11 =
                var9 + 64 * (GlobalStatics_6.regionHashes[var2] >> 8) - anInt1716;
              int var10 = var7 & 63;
              int var12 = var10 - GlobalStatics_9.anInt1152 + 64 * (255
                & GlobalStatics_6.regionHashes[var2]);
              NpcConfiguration var13 = GlobalStatics_2.getNpcConfiguration(var16.readUnsignedShort());
              if (GlobalStatics_8.npcs[var6] == null && (var13.aByte1267 & 1) > 0
                && (var8 == GlobalStatics_8.plane) && (var11 >= 0) &&
                  var13.size + var11 < 104
                && (var12 >= 0) && var12 + var13.size < 104) {
                GlobalStatics_8.npcs[var6] = new NPC();
                NPC npc = GlobalStatics_8.npcs[var6];
                GlobalStatics_2.anIntArray347[DummyClass6.anInt2046++] = var6;
                npc.anInt2838 = GlobalStatics_4.updateCycle;
                npc.setConfiguration(-1, var13);
                npc.method1976(npc.config.size, 2);
                npc.anInt2806 =
                  npc.rotationY = DummyClass32.anIntArray510[npc.config.defaultFaceDirection];
                npc.anInt2779 = npc.config.anInt1274;
                if ((npc.anInt2779 == 0)) {
                  npc.rotationY = 0;
                }

                npc.renderAnimationId = npc.config.renderAnimationId;
                npc.setPosition(npc.getSize(), var11, var12, true);
              }
            }
          }
        }
    }

    public static void method351(int var0) {
      aShortArray3455 = null;
        aClass94_3449 = null;
        anIntArray3446 = null;
        if (var0 == -1) {
          aClass94_3445 = null;
          aShortArray3453 = null;
          entityKeys = null;
          anIntArray3456 = null;
          aClass94_3452 = null;
        }
    }

    public static int method275(int var0, int var1, int var2, int var3, int var4) {
      if (var3 <= 8) {
          anIntArray3288 = null;
        }

        int var5 = -DummyClass40.COSINE_TABLE[1024 * var2 / var4] + 65536 >> 1;
        return (var0 * (-var5 + 65536) >> 16) + (var1 * var5 >> 16);
    }

    public static void method276(int var0, int var1, int var2, int var3, SceneNode var4, long var5,
                                 boolean var7) {
      if (var4 != null) {
        SomethingSceneJ var8 = new SomethingSceneJ();
        var8.aClass140_320 = var4;
        var8.anInt324 = var1 * 128 + 64;
        var8.anInt330 = var2 * 128 + 64;
        var8.anInt326 = var3;
        var8.aLong328 = var5;
        var8.aBoolean329 = var7;
        if (GLStatics.sceneGraphTiles[var0][var1][var2] == null) {
          GLStatics.sceneGraphTiles[var0][var1][var2] = new SceneGraphTile(var0, var1, var2);
        }

        GLStatics.sceneGraphTiles[var0][var1][var2].aClass12_2230 = var8;
      }
    }

    public static void method277(byte var0) {
      aClass94_3281 = null;
        aClass94_3286 = null;
        if (var0 >= -11) {
          anInt3287 = -68;
        }

        LOADING_PLEASE_WAIT = null;
        aClass94_3289 = null;
        anIntArray3288 = null;
        aClass94_3279 = null;
    }

    public static boolean method278(int var0, byte[] var1) {
      if (var0 == 4) {
          Buffer var2 = new Buffer(var1);
          int var3 = var2.readUnsignedByte();
          if (var3 == 1) {
            boolean var4 = (var2.readUnsignedByte() == 1);
            if (var4) {
              DummyClass41.method1173(var2, var0 ^ -84);
            }

            method216(var2, -14991);
            return true;
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    public static void method280(int var0, int var1, int var2, int var3, int var4, int var5, int var6,
                                 int var7, int var8, int var9, int var10, int var11, int var12) {
      SomethingInScenePacket202 var13 = new SomethingInScenePacket202();
        if (var10 == -745213428) {
          var13.anInt2284 = var6;
          var13.anInt2283 = var3;
          var13.anInt2266 = var1;
          var13.anInt2279 = var5;
          var13.anInt2273 = var2;
          var13.anInt2271 = var8;
          var13.anInt2277 = var11;
          var13.anInt2282 = var4;
          var13.anInt2270 = var12;
          var13.anInt2268 = var7;
          var13.anInt2272 = var0;
          var13.anInt2278 = var9;
          GlobalStatics_9.aClass61_2468.addLast(var13);
        }
    }

    public static void updateVariable(int id, int var1) {
      GlobalStatics_9.variables[id] = var1;
        VariableUpdate var3 = (VariableUpdate) GlobalStatics_6.variableUpdates.get(
            id);
        if (var3 != null) {
          if (var3.timestamp != 0x4000000000000001L) {
            var3.timestamp = getCurrentTimeMillis() + 500L | 0x4000000000000000L;
          }
        } else {
          var3 = new VariableUpdate(0x4000000000000001L);
          GlobalStatics_6.variableUpdates.put(id, var3);
        }
    }

    public static synchronized long getCurrentTimeMillis() {
      long currentTime = System.currentTimeMillis();
      if (lastSampledTime > currentTime) {
        deltaTime += lastSampledTime - currentTime;
      }
      lastSampledTime = currentTime;
      return deltaTime + currentTime;
    }

    public static void method388(byte var0) {
      int var1 = 44 / ((-2 - var0) / 52);
        if (GlobalStatics_9.aClass94_3220 != null) {
          GlobalStatics_9.method138(GlobalStatics_9.aClass94_3220, 0);
          GlobalStatics_9.aClass94_3220 = null;
        }
    }

    public static void method389(boolean var0) {
      DummyClass34.method995();
        GlobalStatics_9.aClass3_Sub28_Sub16_812 = null;
        DummyClass43.anInt909 = -1;
        GlobalStatics_9.method313((byte) 55);
        DummyClass61.aClass47_3801.method1101(2);
        GlobalStatics_8.aClass136_1413 = new SceneShadowMap();
        ((TextureCache) GLStatics.textureCache).method1618(0);
        DummyClass46.anInt1032 = 0;
        DummyClass46.lights = new Light[255];
        GlModel.method1929();
        SomethingShadows.method2043();
        DummyClass45.method1240(false);
        GlobalStatics_9.method1250(17, var0);
        method247((byte) 51);

        for (int var1 = 0; var1 < 2048; ++var1) {
          Player var2 = GlobalStatics_9.players[var1];
          if (var2 != null) {
            var2.anObject2796 = null;
          }
        }

        if (GlRenderer.useOpenGlRenderer) {
          SomethingShadows.initializeShadows(104, 104);
          DummyClass0.method1755();
        }

        GlobalStatics_9.method581(GlobalStatics_8.fileUnpacker13, 0, Projectile.sprites);
        DummyClass28.method887(21, Projectile.sprites);
        GlobalStatics_9.aClass3_Sub28_Sub16_2560 = null;
        aClass3_Sub28_Sub16_3099 = null;
        GlobalStatics_4.aClass3_Sub28_Sub16_824 = null;
        DummyClass53.aClass3_Sub28_Sub16_1339 = null;
        DummyClass58.aClass3_Sub28_Sub16_1457 = null;
        if (DummyClass15.state == 5) {
          DummyClass58.loadTitleScreenSprites(Projectile.sprites, (byte) -60);
        }

        if (DummyClass15.state == 10) {
          GlobalStatics_9.method219(false, 3000);
        }

        if (DummyClass15.state == 30) {
          DummyClass26.setState(25, 5);
        }
    }

    public static void method390(boolean var0, int var1, int var2, int var3, byte var4, int var5,
                                 int var6) {
      GlobalStatics_4.anInt3631 = var3;
        anInt3414 = var2;
        GlobalStatics_8.anInt30 = var6;
        DummyClass8.anInt4021 = var1;
        GlobalStatics_5.anInt1904 = var5;
        if (var0 && GlobalStatics_4.anInt3631 >= 100) {
          GlobalStatics_9.anInt3995 = 128 * GlobalStatics_8.anInt30 + 64;
          DummyClass49.anInt1111 = 128 * GlobalStatics_5.anInt1904 + 64;
          GlobalStatics_7.anInt2162 =
            GlobalStatics_6.method1736(GlobalStatics_9.currentPlane, 1, GlobalStatics_9.anInt3995,
              DummyClass49.anInt1111) - anInt3414;
        }

        int var7 = 76 % ((-79 - var4) / 35);
        GlobalStatics_9.anInt1753 = 2;
    }

    public static void method391(int var0) {
      aClass94_2490 = null;
        anIntArray2480 = null;
        aClass94_2481 = null;
        if (var0 != 25) {
          method388((byte) -58);
        }

        aClass94_2486 = null;
        aClass94_2482 = null;
    }

    public static void setAnimationFileUnpackers(FileUnpacker var0, FileUnpacker var1, int var2,
                                                 FileUnpacker var3) {
      GlobalStatics_3.animationSequences = var1;
        int var4 = -110 / ((-7 - var2) / 43);
        GlobalStatics_7.animationFrames = var0;
        animationBases = var3;
    }

    public static void method1591(boolean var0, AudioStreamEncoder var1) {
      if (var1.aClass3_Sub12_2544 != null) {
          var1.aClass3_Sub12_2544.anInt2374 = 0;
        }

        var1.aBoolean2545 = false;

        for (AudioStreamEncoder var2 = var1.method411(); var2 != null; var2 = var1.method414()) {
          method1591(true, var2);
        }

        if (!var0) {
          GLStatics.cameraTileX = -103;
        }
    }

    public static void method1592(byte var0) {
      materials = null;
        aClass153_1378 = null;
        anIntArrayArray1373 = null;
        aClass94_1363 = null;
        aClass3_Sub28_Sub16_Sub2_1381 = null;
        if (var0 > 25) {
          aClass94_1377 = null;
          aClass94_1380 = null;
          aClass153_1372 = null;
          aClass153_1370 = null;
          aByteArray1364 = null;
          aClass94_1374 = null;
        }
    }

    public static void method1593(int var0, FileUnpacker var1) {
      DummyClass14.titleBackgroundFileId = var1.getFileId(GlobalStatics_9.TITLE_BACKGROUND);
        GlobalStatics_6.logoFileId = var1.getFileId(DummyClass53.LOGO);
    }

    public static void method2071(byte var0) {
      aClass94_1892 = null;
        aClass94_1889 = null;
        aClass113Array1895 = null;
        aClass94_1899 = null;
        if (var0 <= 1) {
          method2075(112, (byte) 44);
        }
    }

    public static void method2072(int var0, int var1, int var2, int var3, int var4, int var5,
                                  int var6) {
      if (DummyClass55.anInt1425 <= var1 && GlTexture2d.anInt3765 >= var3
          && (DummyClass13.anInt2020 <= var2) && var4 <= GlobalStatics_9.anInt902) {
          if ((var5 == 1)) {
            DummyClass49.method1367(var0, var3, var2, (byte) 34, var4, var1);
          } else {
            GlobalStatics_1
                .method1665(var6 - 19617, var3, var2, var0, var4, var5, var1);
          }
        } else if (var5 != 1) {
          method184(var4, var5, var3, var1, 1, var0, var2);
        } else {
          GlobalStatics_9.method1617(var0, var1, var4, var3, var2, (byte) 29);
        }

        if (var6 != -2) {
          method2075(89, (byte) -73);
        }
    }

    public static void drawSceneTile(SceneGraphTile var0, boolean var1) {
      DummyClass5.aClass61_2990.addLast(var0);

      while (true) {
        SceneGraphTile var2 = (SceneGraphTile) DummyClass5.aClass61_2990.method1220((byte) -3);
        if (var2 == null) {
          return;
        }

        if (var2.aBoolean2225) {
          int var3 = var2.anInt2239;
          int var4 = var2.anInt2231;
          int var5 = var2.anInt2244;
          int var6 = var2.anInt2238;
          SceneGraphTile[][] var7 = GLStatics.sceneGraphTiles[var5];
          float var8 = 0.0F;
          int var9;
          int var10;
          int var11;
          int var12;
          if (GlRenderer.useOpenGlRenderer) {
            if (Arrays.deepEquals(GlobalStatics_2.othrrHeightMap,
                GlobalStatics_4.heightMap)) {
              var9 = anIntArrayArray3115[var3][var4];
              var10 = var9 & 16777215;
              if (var10 != GLStatics.anInt1244) {
                GLStatics.anInt1244 = var10;
                GLStatics.method535((byte) 56, var10);
                GlEnvironment.setFogColor(GLStatics.calculateFogColor());
              }

              var11 = var9 >>> 24 << 3;
              if (var11 != GLStatics.anInt3072) {
                GLStatics.anInt3072 = var11;
                GlobalStatics_9.method394(var11, 121);
              }

              var12 =
                DummyClass43.somethingHeightMap[0][var3][var4] + DummyClass43.somethingHeightMap[0][
                  var3 + 1][var4] + DummyClass43.somethingHeightMap[0][var3][var4 + 1]
                  + DummyClass43.somethingHeightMap[0][var3 + 1][var4 + 1] >> 2;
              GLStatics.method551(0, -var12, 3);
              var8 = 201.5F;
              GlRenderer.method1832(var8);
            } else {
              var8 = 201.5F - 50.0F * (var6 + 1);
              GlRenderer.method1832(var8);
            }
          }

          int var14;
          int var15;
          int var17;
          int var16;
          int var18;
          SceneGraphTile var21;
          SceneSomething2 var23;
          boolean var22;
          SceneSomething var25;
          SceneGraphTile var35;
          if (var2.aBoolean2222) {
            if (var1) {
              if (var5 > 0) {
                var21 = GLStatics.sceneGraphTiles[var5 - 1][var3][var4];
                if (var21 != null && var21.aBoolean2225) {
                  continue;
                }
              }

              if (var3 <= GLStatics.cameraTileX && var3 > GLStatics.viewportLowerX) {
                var21 = var7[var3 - 1][var4];
                if (var21 != null && var21.aBoolean2225 && (var21.aBoolean2222
                  || (var2.flags & 1) == 0)) {
                  continue;
                }
              }

              if (var3 >= GLStatics.cameraTileX && var3 < GLStatics.viewportUpperX - 1) {
                var21 = var7[var3 + 1][var4];
                if (var21 != null && var21.aBoolean2225 && (var21.aBoolean2222
                  || (var2.flags & 4) == 0)) {
                  continue;
                }
              }

              if (var4 <= GLStatics.cameraTileZ && var4 > GLStatics.viewportLowerZ) {
                var21 = var7[var3][var4 - 1];
                if (var21 != null && var21.aBoolean2225 && (var21.aBoolean2222
                  || (var2.flags & 8) == 0)) {
                  continue;
                }
              }

              if (var4 >= GLStatics.cameraTileZ && var4 < GlobalStatics_9.viewportUpperZ - 1) {
                var21 = var7[var3][var4 + 1];
                if (var21 != null && var21.aBoolean2225 && (var21.aBoolean2222
                  || (var2.flags & 2) == 0)) {
                  continue;
                }
              }
            } else {
              var1 = true;
            }

            var2.aBoolean2222 = false;
            if (var2.aClass3_Sub2_2235 != null) {
              var21 = var2.aClass3_Sub2_2235;
              if (GlRenderer.useOpenGlRenderer) {
                GlRenderer.method1832(201.5F - 50.0F * (var21.anInt2238 + 1));
              }

              if (var21.aClass126_2240 != null) {
                if (FileSystem.method846(0, var3, var4)) {
                  method259(var21.aClass126_2240, 0, DummyClass44.pitchSine,
                          GlobalStatics_9.pitchCosine, yawSine,
                          yawCosine,
                          var3, var4, true);
                } else {
                  method259(var21.aClass126_2240, 0, DummyClass44.pitchSine,
                          GlobalStatics_9.pitchCosine, yawSine,
                          yawCosine,
                          var3, var4, false);
                }
              } else if (var21.aClass35_2226 != null) {
                if (FileSystem.method846(0, var3, var4)) {
                  GlobalStatics_9
                      .method395(var21.aClass35_2226, DummyClass44.pitchSine,
                          GlobalStatics_9.pitchCosine, yawSine,
                              yawCosine,
                          var3, var4, true);
                } else {
                  GlobalStatics_9
                      .method395(var21.aClass35_2226, DummyClass44.pitchSine,
                          GlobalStatics_9.pitchCosine, yawSine,
                              yawCosine,
                          var3, var4, false);
                }
              }

              var23 = var21.aClass70_2234;
              if (var23 != null) {
                if (GlRenderer.useOpenGlRenderer) {
                  if ((var23.anInt1055 & var2.anInt2241) == 0) {
                    DummyClass46.method1268(GlobalStatics_9.cameraPosX,
                        GlobalStatics_7.cameraY,
                        GlobalStatics_9.cameraZ, var5, var3, var4);
                  } else {
                    DummyClass46.method1263(var23.anInt1055,
                        GlobalStatics_9.cameraPosX,
                        GlobalStatics_7.cameraY, GlobalStatics_9.cameraZ, var6,
                        var3, var4);
                  }
                }

                var23.sceneNode0.draw(0, DummyClass44.pitchSine, GlobalStatics_9.pitchCosine,
                        yawSine, yawCosine,
                  var23.positionX - GlobalStatics_9.cameraPosX,
                  var23.positionY - GlobalStatics_7.cameraY,
                  var23.positionZ - GlobalStatics_9.cameraZ, var23.key, var5, null);
              }

              for (var11 = 0; var11 < var21.anInt2223; ++var11) {
                var25 = var21.sceneGraphNodes[var11];
                if (var25 != null) {
                  if (GlRenderer.useOpenGlRenderer) {
                    DummyClass46.method1268(GlobalStatics_9.cameraPosX, GlobalStatics_7.cameraY,
                      GlobalStatics_9.cameraZ, var5, var3, var4);
                  }

                  var25.sceneNode.draw(var25.anInt496, DummyClass44.pitchSine,
                    GlobalStatics_9.pitchCosine, yawSine, yawCosine,
                    var25.anInt482 - GlobalStatics_9.cameraPosX,
                    var25.anInt489 - GlobalStatics_7.cameraY,
                    var25.anInt484 - GlobalStatics_9.cameraZ, var25.aLong498, var5, null);
                }
              }

              if (GlRenderer.useOpenGlRenderer) {
                GlRenderer.method1832(var8);
              }
            }

            var22 = false;
            if (var2.aClass126_2240 != null) {
              if (FileSystem.method846(var6, var3, var4)) {
                method259(var2.aClass126_2240, var6, DummyClass44.pitchSine,
                        GlobalStatics_9.pitchCosine, yawSine,
                        yawCosine,
                        var3, var4, true);
              } else {
                var22 = true;
                if (var2.aClass126_2240.anInt1664 != 12345678
                    || aBoolean3261
                    && var5 <= GlobalStatics_7.anInt1302) {
                  method259(var2.aClass126_2240, var6,
                      DummyClass44.pitchSine,
                      GlobalStatics_9.pitchCosine, yawSine,
                          yawCosine,
                      var3, var4, false);
                }
              }
            } else if (var2.aClass35_2226 != null) {
              if (FileSystem.method846(var6, var3, var4)) {
                GlobalStatics_9
                    .method395(var2.aClass35_2226, DummyClass44.pitchSine,
                        GlobalStatics_9.pitchCosine, yawSine,
                            yawCosine,
                        var3, var4, true);
              } else {
                var22 = true;
                GlobalStatics_9
                    .method395(var2.aClass35_2226, DummyClass44.pitchSine,
                        GlobalStatics_9.pitchCosine, yawSine,
                            yawCosine,
                        var3, var4, false);
              }
            }

            if (var22) {
              SomethingSceneJ var24 = var2.aClass12_2230;
              if (var24 != null && (var24.aLong328 & 2147483648L) != 0L) {
                if (GlRenderer.useOpenGlRenderer && var24.aBoolean329) {
                  GlRenderer.method1832(var8 + 50.0F - 1.5F);
                }

                if (GlRenderer.useOpenGlRenderer) {
                  DummyClass46.method1268(GlobalStatics_9.cameraPosX, GlobalStatics_7.cameraY,
                    GlobalStatics_9.cameraZ, var5, var3, var4);
                }

                var24.aClass140_320.draw(0, DummyClass44.pitchSine, GlobalStatics_9.pitchCosine,
                        yawSine, yawCosine,
                  var24.anInt324 - GlobalStatics_9.cameraPosX,
                  var24.anInt326 - GlobalStatics_7.cameraY,
                  var24.anInt330 - GlobalStatics_9.cameraZ, var24.aLong328, var5, null);
                if (GlRenderer.useOpenGlRenderer && var24.aBoolean329) {
                  GlRenderer.method1832(var8);
                }
              }
            }

            var10 = 0;
            var11 = 0;
            SceneSomething2 var26 = var2.aClass70_2234;
            SomethingSceneI var13 = var2.aClass19_2233;
            if (var26 != null || var13 != null) {
              if (GLStatics.cameraTileX == var3) {
                ++var10;
              } else if (GLStatics.cameraTileX < var3) {
                var10 += 2;
              }

              if (GLStatics.cameraTileZ == var4) {
                var10 += 3;
              } else if (GLStatics.cameraTileZ > var4) {
                var10 += 6;
              }

              var11 = GlobalStatics_9.anIntArray3997[var10];
              var2.anInt2241 = anIntArray3321[var10];
            }

            if (var26 != null) {
              if ((var26.anInt1055 & GlobalStatics_9.anIntArray2338[var10]) == 0) {
                var2.anInt2227 = 0;
              } else {
                if (var26.anInt1055 == 16) {
                  var2.anInt2227 = 3;
                  var2.anInt2229 = GlobalStatics_9.anIntArray2470[var10];
                  var2.anInt2232 = 3 - var2.anInt2229;
                } else if (var26.anInt1055 == 32) {
                  var2.anInt2227 = 6;
                  var2.anInt2229 = GlobalStatics_9.anIntArray2933[var10];
                  var2.anInt2232 = 6 - var2.anInt2229;
                } else if (var26.anInt1055 == 64) {
                  var2.anInt2227 = 12;
                  var2.anInt2229 = anIntArray3171[var10];
                  var2.anInt2232 = 12 - var2.anInt2229;
                } else {
                  var2.anInt2227 = 9;
                  var2.anInt2229 = anIntArray4035[var10];
                  var2.anInt2232 = 9 - var2.anInt2229;
                }
              }

              if ((var26.anInt1055 & var11) != 0 && !GlobalStatics_9.method2239(var6, var3, var4,
                var26.anInt1055)) {
                if (GlRenderer.useOpenGlRenderer) {
                  DummyClass46.method1268(GlobalStatics_9.cameraPosX, GlobalStatics_7.cameraY,
                    GlobalStatics_9.cameraZ, var5, var3, var4);
                }

                var26.sceneNode0.draw(0, DummyClass44.pitchSine, GlobalStatics_9.pitchCosine,
                        yawSine, yawCosine,
                  var26.positionX - GlobalStatics_9.cameraPosX,
                  var26.positionY - GlobalStatics_7.cameraY,
                  var26.positionZ - GlobalStatics_9.cameraZ, var26.key, var5, null);
              }

              if ((var26.anInt1059 & var11) != 0 && !GlobalStatics_9.method2239(var6, var3, var4,
                var26.anInt1059)) {
                if (GlRenderer.useOpenGlRenderer) {
                  DummyClass46.method1268(GlobalStatics_9.cameraPosX, GlobalStatics_7.cameraY,
                    GlobalStatics_9.cameraZ, var5, var3, var4);
                }

                var26.sceneNode1.draw(0, DummyClass44.pitchSine, GlobalStatics_9.pitchCosine,
                        yawSine, yawCosine,
                  var26.positionX - GlobalStatics_9.cameraPosX,
                  var26.positionY - GlobalStatics_7.cameraY,
                  var26.positionZ - GlobalStatics_9.cameraZ, var26.key, var5, null);
              }
            }

            if (var13 != null && !GlobalStatics_9.method2256(var6, var3, var4,
              var13.aClass140_429.getMinimumY())) {
              if (GlRenderer.useOpenGlRenderer) {
                GlRenderer.method1832(var8 - 0.5F);
              }

              if ((var13.anInt432 & var11) != 0) {
                if (GlRenderer.useOpenGlRenderer) {
                  DummyClass46.method1268(GlobalStatics_9.cameraPosX, GlobalStatics_7.cameraY,
                    GlobalStatics_9.cameraZ, var5, var3, var4);
                }

                var13.aClass140_429.draw(0, DummyClass44.pitchSine, GlobalStatics_9.pitchCosine,
                        yawSine, yawCosine,
                  var13.anInt424 - GlobalStatics_9.cameraPosX + var13.anInt430,
                  var13.anInt425 - GlobalStatics_7.cameraY,
                  var13.anInt427 - GlobalStatics_9.cameraZ + var13.anInt426, var13.aLong428, var5,
                  null);
              } else if (var13.anInt432 == 256) {
                var14 = var13.anInt424 - GlobalStatics_9.cameraPosX;
                var15 = var13.anInt425 - GlobalStatics_7.cameraY;
                var16 = var13.anInt427 - GlobalStatics_9.cameraZ;
                var17 = var13.anInt420;
                if (var17 != 1 && var17 != 2) {
                  var18 = var14;
                } else {
                  var18 = -var14;
                }

                int var19;
                if (var17 != 2 && var17 != 3) {
                  var19 = var16;
                } else {
                  var19 = -var16;
                }

                if (var19 < var18) {
                  if (GlRenderer.useOpenGlRenderer) {
                    DummyClass46.method1268(GlobalStatics_9.cameraPosX, GlobalStatics_7.cameraY,
                      GlobalStatics_9.cameraZ, var5, var3, var4);
                  }

                  var13.aClass140_429.draw(0, DummyClass44.pitchSine, GlobalStatics_9.pitchCosine,
                          yawSine, yawCosine, var14 + var13.anInt430,
                    var15, var16 + var13.anInt426, var13.aLong428, var5, null);
                } else if (var13.aClass140_423 != null) {
                  if (GlRenderer.useOpenGlRenderer) {
                    DummyClass46.method1268(GlobalStatics_9.cameraPosX, GlobalStatics_7.cameraY,
                      GlobalStatics_9.cameraZ, var5, var3, var4);
                  }

                  var13.aClass140_423.draw(0, DummyClass44.pitchSine, GlobalStatics_9.pitchCosine,
                          yawSine, yawCosine, var14, var15, var16,
                    var13.aLong428, var5, null);
                }
              }

              if (GlRenderer.useOpenGlRenderer) {
                GlRenderer.method1832(var8);
              }
            }

            if (var22) {
              SomethingSceneJ var30 = var2.aClass12_2230;
              if (var30 != null && (var30.aLong328 & 2147483648L) == 0L) {
                if (GlRenderer.useOpenGlRenderer && var30.aBoolean329) {
                  GlRenderer.method1832(var8 + 50.0F - 1.5F);
                }

                if (GlRenderer.useOpenGlRenderer) {
                  DummyClass46.method1268(GlobalStatics_9.cameraPosX, GlobalStatics_7.cameraY,
                    GlobalStatics_9.cameraZ, var5, var3, var4);
                }

                var30.aClass140_320.draw(0, DummyClass44.pitchSine, GlobalStatics_9.pitchCosine,
                        yawSine, yawCosine,
                  var30.anInt324 - GlobalStatics_9.cameraPosX,
                  var30.anInt326 - GlobalStatics_7.cameraY,
                  var30.anInt330 - GlobalStatics_9.cameraZ, var30.aLong328, var5, null);
                if (GlRenderer.useOpenGlRenderer && var30.aBoolean329) {
                  GlRenderer.method1832(var8);
                }
              }

              SomethingScene var28 = var2.aClass72_2245;
              if (var28 != null && var28.anInt1077 == 0) {
                if (GlRenderer.useOpenGlRenderer) {
                  DummyClass46.method1268(GlobalStatics_9.cameraPosX, GlobalStatics_7.cameraY,
                    GlobalStatics_9.cameraZ, var5, var3, var4);
                }

                if (var28.aClass140_1067 != null) {
                  var28.aClass140_1067.draw(0, DummyClass44.pitchSine, GlobalStatics_9.pitchCosine,
                          yawSine, yawCosine,
                    var28.anInt1078 - GlobalStatics_9.cameraPosX,
                    var28.anInt1068 - GlobalStatics_7.cameraY,
                    var28.anInt1075 - GlobalStatics_9.cameraZ, var28.aLong1079, var5, null);
                }

                if (var28.aClass140_1069 != null) {
                  var28.aClass140_1069.draw(0, DummyClass44.pitchSine, GlobalStatics_9.pitchCosine,
                          yawSine, yawCosine,
                    var28.anInt1078 - GlobalStatics_9.cameraPosX,
                    var28.anInt1068 - GlobalStatics_7.cameraY,
                    var28.anInt1075 - GlobalStatics_9.cameraZ, var28.aLong1079, var5, null);
                }

                if (var28.aClass140_1073 != null) {
                  var28.aClass140_1073.draw(0, DummyClass44.pitchSine, GlobalStatics_9.pitchCosine,
                          yawSine, yawCosine,
                    var28.anInt1078 - GlobalStatics_9.cameraPosX,
                    var28.anInt1068 - GlobalStatics_7.cameraY,
                    var28.anInt1075 - GlobalStatics_9.cameraZ, var28.aLong1079, var5, null);
                }
              }
            }

            var14 = var2.flags;
            if (var14 != 0) {
              if (var3 < GLStatics.cameraTileX && (var14 & 4) != 0) {
                var35 = var7[var3 + 1][var4];
                if (var35 != null && var35.aBoolean2225) {
                  DummyClass5.aClass61_2990.addLast(var35);
                }
              }

              if (var4 < GLStatics.cameraTileZ && (var14 & 2) != 0) {
                var35 = var7[var3][var4 + 1];
                if (var35 != null && var35.aBoolean2225) {
                  DummyClass5.aClass61_2990.addLast(var35);
                }
              }

              if (var3 > GLStatics.cameraTileX && (var14 & 1) != 0) {
                var35 = var7[var3 - 1][var4];
                if (var35 != null && var35.aBoolean2225) {
                  DummyClass5.aClass61_2990.addLast(var35);
                }
              }

              if (var4 > GLStatics.cameraTileZ && (var14 & 8) != 0) {
                var35 = var7[var3][var4 - 1];
                if (var35 != null && var35.aBoolean2225) {
                  DummyClass5.aClass61_2990.addLast(var35);
                }
              }
            }
          }

          int var27;
          if (var2.anInt2227 != 0) {
            var22 = true;

            for (var10 = 0; var10 < var2.anInt2223; ++var10) {
              if (var2.sceneGraphNodes[var10].anInt490 != GlobalStatics_9.anInt3539
                && (var2.anIntArray2237[var10] & var2.anInt2227) == var2.anInt2229) {
                var22 = false;
                break;
              }
            }

            if (var22) {
              var23 = var2.aClass70_2234;
              if (!GlobalStatics_9.method2239(var6, var3, var4, var23.anInt1055)) {
                if (GlRenderer.useOpenGlRenderer) {
                  label736:
                  {
                    if ((var23.key & 1032192L) == 16384L) {
                      var11 = var23.positionX - GlobalStatics_9.cameraPosX;
                      var12 = var23.positionZ - GlobalStatics_9.cameraZ;
                      var27 = (int) (var23.key >> 20 & 3L);
                      if (var27 == 0) {
                        var11 -= 64;
                        var12 += 64;
                        if (var12 < var11 && var3 > 0 && var4 < TextureSampler17.sceneHeight - 1) {
                          DummyClass46.method1268(GlobalStatics_9.cameraPosX,
                            GlobalStatics_7.cameraY, GlobalStatics_9.cameraZ, var5, var3 - 1,
                            var4 + 1);
                          break label736;
                        }
                      } else if (var27 == 1) {
                        var11 += 64;
                        var12 += 64;
                        if (var12 < -var11 && var3 < SocketStream.sceneWidth - 1
                          && var4 < TextureSampler17.sceneHeight - 1) {
                          DummyClass46.method1268(GlobalStatics_9.cameraPosX,
                            GlobalStatics_7.cameraY, GlobalStatics_9.cameraZ, var5, var3 + 1,
                            var4 + 1);
                          break label736;
                        }
                      } else if (var27 == 2) {
                        var11 += 64;
                        var12 -= 64;
                        if (var12 > var11 && var3 < SocketStream.sceneWidth - 1 && var4 > 0) {
                          DummyClass46.method1268(GlobalStatics_9.cameraPosX,
                            GlobalStatics_7.cameraY, GlobalStatics_9.cameraZ, var5, var3 + 1,
                            var4 - 1);
                          break label736;
                        }
                      } else {
                        var11 -= 64;
                        var12 -= 64;
                        if (var12 > -var11 && var3 > 0 && var4 > 0) {
                          DummyClass46.method1268(GlobalStatics_9.cameraPosX,
                            GlobalStatics_7.cameraY, GlobalStatics_9.cameraZ, var5, var3 - 1,
                            var4 - 1);
                          break label736;
                        }
                      }
                    }

                    DummyClass46.method1268(GlobalStatics_9.cameraPosX, GlobalStatics_7.cameraY,
                      GlobalStatics_9.cameraZ, var5, var3, var4);
                  }
                }

                var23.sceneNode0.draw(0, DummyClass44.pitchSine, GlobalStatics_9.pitchCosine,
                        yawSine, yawCosine,
                  var23.positionX - GlobalStatics_9.cameraPosX,
                  var23.positionY - GlobalStatics_7.cameraY,
                  var23.positionZ - GlobalStatics_9.cameraZ, var23.key, var5, null);
              }

              var2.anInt2227 = 0;
            }
          }

          if (var2.aBoolean2236) {
            var9 = var2.anInt2223;
              var2.aBoolean2236 = false;
              var10 = 0;

              label712:
              for (var11 = 0; var11 < var9; ++var11) {
                var25 = var2.sceneGraphNodes[var11];
                if (var25.anInt490 != GlobalStatics_9.anInt3539) {
                  for (var27 = var25.anInt483; var27 <= var25.anInt495; ++var27) {
                    for (var14 = var25.anInt478; var14 <= var25.anInt481; ++var14) {
                      var35 = var7[var27][var14];
                      if (var35.aBoolean2222) {
                        var2.aBoolean2236 = true;
                        continue label712;
                      }

                      if (var35.anInt2227 != 0) {
                        var16 = 0;
                        if (var27 > var25.anInt483) {
                          ++var16;
                        }

                        if (var27 < var25.anInt495) {
                          var16 += 4;
                        }

                        if (var14 > var25.anInt478) {
                          var16 += 8;
                        }

                        if (var14 < var25.anInt481) {
                          var16 += 2;
                        }

                        if ((var16 & var35.anInt2227) == var2.anInt2232) {
                          var2.aBoolean2236 = true;
                          continue label712;
                        }
                      }
                    }
                  }

                  GlobalStatics_7.aClass25Array4060[var10++] = var25;
                  var27 = GLStatics.cameraTileX - var25.anInt483;
                  var14 = var25.anInt495 - GLStatics.cameraTileX;
                  if (var14 > var27) {
                    var27 = var14;
                  }

                  var15 = GLStatics.cameraTileZ - var25.anInt478;
                  var16 = var25.anInt481 - GLStatics.cameraTileZ;
                  if (var16 > var15) {
                    var25.anInt487 = var27 + var16;
                  } else {
                    var25.anInt487 = var27 + var15;
                  }
                }
              }

              while (var10 > 0) {
                var11 = -50;
                var12 = -1;

                for (var27 = 0; var27 < var10; ++var27) {
                  SceneSomething var34 = GlobalStatics_7.aClass25Array4060[var27];
                  if (var34.anInt490 != GlobalStatics_9.anInt3539) {
                    if (var34.anInt487 > var11) {
                      var11 = var34.anInt487;
                      var12 = var27;
                    } else if (var34.anInt487 == var11) {
                      var15 = var34.anInt482 - GlobalStatics_9.cameraPosX;
                      var16 = var34.anInt484 - GlobalStatics_9.cameraZ;
                      var17 = GlobalStatics_7.aClass25Array4060[var12].anInt482
                        - GlobalStatics_9.cameraPosX;
                      var18 =
                        GlobalStatics_7.aClass25Array4060[var12].anInt484 - GlobalStatics_9.cameraZ;
                      if (var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) {
                        var12 = var27;
                      }
                    }
                  }
                }

                if (var12 == -1) {
                  break;
                }

                SceneSomething var32 = GlobalStatics_7.aClass25Array4060[var12];
                var32.anInt490 = GlobalStatics_9.anInt3539;
                if (!GlobalStatics_9.method222(var6, var32.anInt483, var32.anInt495, var32.anInt478,
                  var32.anInt481, var32.sceneNode.getMinimumY())) {
                  if (GlRenderer.useOpenGlRenderer) {
                    if ((var32.aLong498 & 1032192L) == 147456L) {
                      DummyClass46.method1268(GlobalStatics_9.cameraPosX,
                        GlobalStatics_7.cameraY, GlobalStatics_9.cameraZ, var5, var3, var4);
                      var14 = var32.anInt482 - GlobalStatics_9.cameraPosX;
                      var15 = var32.anInt484 - GlobalStatics_9.cameraZ;
                      var16 = (int) (var32.aLong498 >> 20 & 3L);
                      if (var16 != 1 && var16 != 3) {
                        if (var15 > var14) {
                          DummyClass46.method1272(var5, var3, var4 - 1, var3 + 1, var4);
                        } else {
                          DummyClass46.method1272(var5, var3, var4 + 1, var3 - 1, var4);
                        }
                      } else if (var15 > -var14) {
                        DummyClass46.method1272(var5, var3, var4 - 1, var3 - 1, var4);
                      } else {
                        DummyClass46.method1272(var5, var3, var4 + 1, var3 + 1, var4);
                      }
                    } else {
                      DummyClass46.method1266(GlobalStatics_9.cameraPosX,
                        GlobalStatics_7.cameraY, GlobalStatics_9.cameraZ, var5, var32.anInt483,
                        var32.anInt478, var32.anInt495, var32.anInt481);
                    }
                  }

                  var32.sceneNode.draw(var32.anInt496, DummyClass44.pitchSine,
                    GlobalStatics_9.pitchCosine, yawSine, yawCosine,
                    var32.anInt482 - GlobalStatics_9.cameraPosX,
                    var32.anInt489 - GlobalStatics_7.cameraY,
                    var32.anInt484 - GlobalStatics_9.cameraZ, var32.aLong498, var5, null);
                }

                for (var14 = var32.anInt483; var14 <= var32.anInt495; ++var14) {
                  for (var15 = var32.anInt478; var15 <= var32.anInt481; ++var15) {
                    SceneGraphTile var37 = var7[var14][var15];
                    if (var37.anInt2227 != 0) {
                      DummyClass5.aClass61_2990.addLast(var37);
                    } else if ((var14 != var3 || var15 != var4) && var37.aBoolean2225) {
                      DummyClass5.aClass61_2990.addLast(var37);
                    }
                  }
                }
              }

              if (var2.aBoolean2236) {
                continue;
              }
          }

          if (var2.aBoolean2225 && var2.anInt2227 == 0) {
            if (var3 <= GLStatics.cameraTileX && var3 > GLStatics.viewportLowerX) {
              var21 = var7[var3 - 1][var4];
              if (var21 != null && var21.aBoolean2225) {
                continue;
              }
            }

            if (var3 >= GLStatics.cameraTileX && var3 < GLStatics.viewportUpperX - 1) {
              var21 = var7[var3 + 1][var4];
              if (var21 != null && var21.aBoolean2225) {
                continue;
              }
            }

            if (var4 <= GLStatics.cameraTileZ && var4 > GLStatics.viewportLowerZ) {
              var21 = var7[var3][var4 - 1];
              if (var21 != null && var21.aBoolean2225) {
                continue;
              }
            }

            if (var4 >= GLStatics.cameraTileZ && var4 < GlobalStatics_9.viewportUpperZ - 1) {
              var21 = var7[var3][var4 + 1];
              if (var21 != null && var21.aBoolean2225) {
                continue;
              }
            }

            var2.aBoolean2225 = false;
            --GlobalStatics_8.anInt3;
            SomethingScene var29 = var2.aClass72_2245;
            if (var29 != null && var29.anInt1077 != 0) {
              if (GlRenderer.useOpenGlRenderer) {
                DummyClass46.method1268(GlobalStatics_9.cameraPosX, GlobalStatics_7.cameraY,
                  GlobalStatics_9.cameraZ, var5, var3, var4);
              }

              if (var29.aClass140_1067 != null) {
                var29.aClass140_1067.draw(0, DummyClass44.pitchSine, GlobalStatics_9.pitchCosine,
                        yawSine, yawCosine,
                  var29.anInt1078 - GlobalStatics_9.cameraPosX,
                  var29.anInt1068 - GlobalStatics_7.cameraY - var29.anInt1077,
                  var29.anInt1075 - GlobalStatics_9.cameraZ, var29.aLong1079, var5, null);
              }

              if (var29.aClass140_1069 != null) {
                var29.aClass140_1069.draw(0, DummyClass44.pitchSine, GlobalStatics_9.pitchCosine,
                        yawSine, yawCosine,
                  var29.anInt1078 - GlobalStatics_9.cameraPosX,
                  var29.anInt1068 - GlobalStatics_7.cameraY - var29.anInt1077,
                  var29.anInt1075 - GlobalStatics_9.cameraZ, var29.aLong1079, var5, null);
              }

              if (var29.aClass140_1073 != null) {
                var29.aClass140_1073.draw(0, DummyClass44.pitchSine, GlobalStatics_9.pitchCosine,
                        yawSine, yawCosine,
                  var29.anInt1078 - GlobalStatics_9.cameraPosX,
                  var29.anInt1068 - GlobalStatics_7.cameraY - var29.anInt1077,
                  var29.anInt1075 - GlobalStatics_9.cameraZ, var29.aLong1079, var5, null);
              }
            }

            if (var2.anInt2241 != 0) {
              SomethingSceneI var36 = var2.aClass19_2233;
              if (var36 != null && !GlobalStatics_9.method2256(var6, var3, var4,
                var36.aClass140_429.getMinimumY())) {
                if ((var36.anInt432 & var2.anInt2241) != 0) {
                  if (GlRenderer.useOpenGlRenderer) {
                    DummyClass46.method1268(GlobalStatics_9.cameraPosX, GlobalStatics_7.cameraY,
                      GlobalStatics_9.cameraZ, var5, var3, var4);
                  }

                  var36.aClass140_429.draw(0, DummyClass44.pitchSine, GlobalStatics_9.pitchCosine,
                          yawSine, yawCosine,
                    var36.anInt424 - GlobalStatics_9.cameraPosX + var36.anInt430,
                    var36.anInt425 - GlobalStatics_7.cameraY,
                    var36.anInt427 - GlobalStatics_9.cameraZ + var36.anInt426, var36.aLong428, var5,
                    null);
                } else if (var36.anInt432 == 256) {
                  var11 = var36.anInt424 - GlobalStatics_9.cameraPosX;
                  var12 = var36.anInt425 - GlobalStatics_7.cameraY;
                  var27 = var36.anInt427 - GlobalStatics_9.cameraZ;
                  var14 = var36.anInt420;
                  if (var14 != 1 && var14 != 2) {
                    var15 = var11;
                  } else {
                    var15 = -var11;
                  }

                  if (var14 != 2 && var14 != 3) {
                    var16 = var27;
                  } else {
                    var16 = -var27;
                  }

                  if (var16 >= var15) {
                    if (GlRenderer.useOpenGlRenderer) {
                      DummyClass46.method1268(GlobalStatics_9.cameraPosX,
                        GlobalStatics_7.cameraY, GlobalStatics_9.cameraZ, var5, var3, var4);
                    }

                    var36.aClass140_429.draw(0, DummyClass44.pitchSine, GlobalStatics_9.pitchCosine,
                            yawSine, yawCosine, var11 + var36.anInt430,
                      var12, var27 + var36.anInt426, var36.aLong428, var5, null);
                  } else if (var36.aClass140_423 != null) {
                    if (GlRenderer.useOpenGlRenderer) {
                      DummyClass46.method1268(GlobalStatics_9.cameraPosX,
                        GlobalStatics_7.cameraY, GlobalStatics_9.cameraZ, var5, var3, var4);
                    }

                    var36.aClass140_423.draw(0, DummyClass44.pitchSine, GlobalStatics_9.pitchCosine,
                            yawSine, yawCosine, var11, var12, var27,
                      var36.aLong428, var5, null);
                  }
                }
              }

              SceneSomething2 var31 = var2.aClass70_2234;
              if (var31 != null) {
                if ((var31.anInt1059 & var2.anInt2241) != 0 && !GlobalStatics_9.method2239(var6, var3,
                  var4, var31.anInt1059)) {
                  if (GlRenderer.useOpenGlRenderer) {
                    DummyClass46.method1263(var31.anInt1059, GlobalStatics_9.cameraPosX,
                      GlobalStatics_7.cameraY, GlobalStatics_9.cameraZ, var6, var3, var4);
                  }

                  var31.sceneNode1.draw(0, DummyClass44.pitchSine, GlobalStatics_9.pitchCosine,
                          yawSine, yawCosine,
                    var31.positionX - GlobalStatics_9.cameraPosX,
                    var31.positionY - GlobalStatics_7.cameraY,
                    var31.positionZ - GlobalStatics_9.cameraZ, var31.key, var5, null);
                }

                if ((var31.anInt1055 & var2.anInt2241) != 0 && !GlobalStatics_9.method2239(var6, var3,
                  var4, var31.anInt1055)) {
                  if (GlRenderer.useOpenGlRenderer) {
                    DummyClass46.method1263(var31.anInt1055, GlobalStatics_9.cameraPosX,
                      GlobalStatics_7.cameraY, GlobalStatics_9.cameraZ, var6, var3, var4);
                  }

                  var31.sceneNode0.draw(0, DummyClass44.pitchSine, GlobalStatics_9.pitchCosine,
                          yawSine, yawCosine,
                    var31.positionX - GlobalStatics_9.cameraPosX,
                    var31.positionY - GlobalStatics_7.cameraY,
                    var31.positionZ - GlobalStatics_9.cameraZ, var31.key, var5, null);
                }
              }
            }

            SceneGraphTile var33;
            if (var5 < GLStatics.anInt2456 - 1) {
              var33 = GLStatics.sceneGraphTiles[var5 + 1][var3][var4];
              if (var33 != null && var33.aBoolean2225) {
                DummyClass5.aClass61_2990.addLast(var33);
              }
            }

            if (var3 < GLStatics.cameraTileX) {
              var33 = var7[var3 + 1][var4];
              if (var33 != null && var33.aBoolean2225) {
                DummyClass5.aClass61_2990.addLast(var33);
              }
            }

            if (var4 < GLStatics.cameraTileZ) {
              var33 = var7[var3][var4 + 1];
              if (var33 != null && var33.aBoolean2225) {
                DummyClass5.aClass61_2990.addLast(var33);
              }
            }

            if (var3 > GLStatics.cameraTileX) {
              var33 = var7[var3 - 1][var4];
              if (var33 != null && var33.aBoolean2225) {
                DummyClass5.aClass61_2990.addLast(var33);
              }
            }

            if (var4 > GLStatics.cameraTileZ) {
              var33 = var7[var3][var4 - 1];
              if (var33 != null && var33.aBoolean2225) {
                DummyClass5.aClass61_2990.addLast(var33);
              }
            }
          }
        }
      }
    }

    public static void method2074(int var0, int var1, int var2, int var3, int var4, int var5,
                                  int var6) {
      Widget var7 = GlobalStatics_2.method638((byte) -19, var0, var1);
        if (var7 != null && var7.anObjectArray203 != null) {
          ClientScriptCall var8 = new ClientScriptCall();
          var8.aClass11_2449 = var7;
          var8.arguments = var7.anObjectArray203;
          GLStatics.executeScript(var8);
        }

        anInt278 = var1;
        GlobalStatics_9.anInt1038 = var3;
        if (var5 < -110) {
          GlobalStatics_9.anInt872 = var0;
          GlobalStatics_9.anInt2051 = var2;
          GlobalStatics_9.aBoolean1837 = true;
          GlobalStatics_6.anInt1887 = var4;
          GlobalStatics_6.anInt3590 = var6;
          DummyClass29.method909(126, var7);
        }
    }

    public static int method2075(int var0, byte var1) {
      int var2 = 110 / ((var1 - 34) / 61);
        return 255 & var0;
    }

    public static PlayerVariable getPlayerVariable(int var0, int var1) {
      PlayerVariable var2 = (PlayerVariable) GlobalStatics_9.aClass93_1772.get(
            var1);
        if (var2 != null) {
          return var2;
        } else {
          byte[] var3 = aClass153_3154.getBytes(16, var1);
          if (var0 > -4) {
            return null;
          } else {
            var2 = new PlayerVariable();
            if (var3 != null) {
              var2.method970(-20638, new Buffer(var3));
            }

            GlobalStatics_9.aClass93_1772.get((byte) -108, var2, var1);
            return var2;
          }
        }
    }

    public static void method2077(boolean var0) {
      GlobalStatics_9.aClass93_2604.method1524(3);
        if (!var0) {
          aClass94_1899 = null;
        }

        DummyClass32.aClass93_511.method1524(3);
    }

    public static void method120(int var0) {
      anIntArray2292 = null;
        if (var0 != 1000) {
          anInt2293 = 55;
        }
    }

    public static int method121(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if ((var2 & 1) == var5) {
          int var7 = var4;
          var4 = var3;
          var3 = var7;
        }

        var1 &= 3;
        return var1 != 0 ?
          ((var1 != 1) ? (var1 != 2 ? -var0 + 7 + 1 - var3 : -var6 + (7 - (var4 - 1))) : var0) :
          var6;
    }

    public static void method122(int var0) {
      int var1 = -101 / ((var0 - 10) / 59);
        GlobalStatics_9.aClass11ArrayArray1834 = new Widget[GlobalStatics_9.aClass153_3361.method2121(0)][];
        GlobalStatics_0.aBooleanArray1703 = new boolean[GlobalStatics_9.aClass153_3361.method2121(0)];
    }

    public static GameString method123(int var0, int var1) {
      if (var1 < 100000) {
          return GlobalStatics_9.concat(new GameString[] {
            DummyClass42.aClass94_888, GlobalStatics_9.toString(var1), GlobalStatics_9.aClass94_1076
          });
        } else {
          if (var0 != 1000) {
            method123(-54, 54);
          }

          return var1 >= 10000000 ? GlobalStatics_9.concat(new GameString[] {
                  aClass94_3307, GlobalStatics_9.toString(var1 / 1000000),
                  aClass94_3117, GlobalStatics_9.aClass94_1076
          }) : GlobalStatics_9.concat(new GameString[] {
            GlobalStatics_6.aClass94_2477, GlobalStatics_9.toString(var1 / 1000),
            GlobalStatics_6.aClass94_3584, GlobalStatics_9.aClass94_1076
          });
        }
    }

    public static GameString method856(boolean var0) {
      if (!var0) {
          method869(127, -68);
        }

        GameString var1 = GlobalStatics_9.aClass94_4052;
        GameString var2 = GlobalStatics_9.EMPTY_STRING;
        if ((GlobalStatics_4.usageLocation != 0)) {
          var1 = GlobalStatics_9.aClass94_3971;
        }

        if (DummyClass7.settings != null) {
          var2 =
            GlobalStatics_9.concat(new GameString[] {GlobalStatics_9.aClass94_3637, DummyClass7.settings});
        }

        return GlobalStatics_9.concat(new GameString[] {
          GlobalStatics_6.aClass94_577, var1, GlobalStatics_2.aClass94_3601,
          GlobalStatics_9.toString(languageId),
          GlobalStatics_5.aClass94_1932,
          GlobalStatics_9.toString(GlobalStatics_9.affiliateId), var2,
          GlobalStatics_8.aClass94_2735
        });
    }

    public static void method860(int var0) {
      aClass94_297 = null;
        EVENT_OP_BASE = null;
        if (var0 < 63) {
          method860(42);
        }

        aClass94_251 = null;
    }

    public static int method861(int var0, int var1, int var2) {
      Inventory var3 = (Inventory) GlobalStatics_2.aClass130_2220.get(var0);
        return var3 == null ?
          -1 :
          (var2 >= 0 && var2 < var3.ids.length ? (var1 < 39 ? -69 : var3.ids[var2]) : -1);
    }

    public static int method869(int var0, int var1) {
      return (var1 != 16711935) ? (var0 < 97 ? -63 : DummyClass42.method1186(0, var1)) : -1;
    }

    public static void method90(int var0) {
      if (GlRenderer.useOpenGlRenderer) {
          if (!aBoolean3416) {
            SceneGraphTile[][][] var1 = GLStatics.sceneGraphTiles;
            if (var0 != 1) {
              aClass94_2214 = null;
            }

            for (int var2 = 0; var2 < var1.length; ++var2) {
              SceneGraphTile[][] var3 = var1[var2];

              for (int var4 = 0; var3.length > var4; ++var4) {
                for (int var5 = 0; var3[var4].length > var5; ++var5) {
                  SceneGraphTile var6 = var3[var4][var5];
                  if (var6 != null) {
                    GlModel var7;
                    if (var6.aClass12_2230 != null
                      && var6.aClass12_2230.aClass140_320 instanceof GlModel) {
                      var7 = (GlModel) var6.aClass12_2230.aClass140_320;
                      if (((var6.aClass12_2230.aLong328 & Long.MIN_VALUE) == 0L)) {
                        var7.method1920(false, true, true, true, false, true, true);
                      } else {
                        var7.method1920(true, true, true, true, true, true, true);
                      }
                    }

                    if (var6.aClass19_2233 != null) {
                      if (var6.aClass19_2233.aClass140_429 instanceof GlModel) {
                        var7 = (GlModel) var6.aClass19_2233.aClass140_429;
                        if ((var6.aClass19_2233.aLong428 & Long.MIN_VALUE) == 0L) {
                          var7.method1920(false, true, true, true, false, true, true);
                        } else {
                          var7.method1920(true, true, true, true, true, true, true);
                        }
                      }

                      if (var6.aClass19_2233.aClass140_423 instanceof GlModel) {
                        var7 = (GlModel) var6.aClass19_2233.aClass140_423;
                        if (((Long.MIN_VALUE
                            & var6.aClass19_2233.aLong428) == 0L)) {
                          var7.method1920(false, true, true, true, false, true,
                              true);
                        } else {
                          var7.method1920(true, true, true, true, true, true,
                              true);
                        }
                      }
                    }

                    if (var6.aClass70_2234 != null) {
                      if (var6.aClass70_2234.sceneNode0 instanceof GlModel) {
                        var7 = (GlModel) var6.aClass70_2234.sceneNode0;
                        if (((var6.aClass70_2234.key & Long.MIN_VALUE) == 0L)) {
                          var7.method1920(false, true, true, true, false, true,
                              true);
                        } else {
                          var7.method1920(true, true, true, true, true, true,
                              true);
                        }
                      }

                      if (var6.aClass70_2234.sceneNode1 instanceof GlModel) {
                        var7 = (GlModel) var6.aClass70_2234.sceneNode1;
                        if (((Long.MIN_VALUE & var6.aClass70_2234.key) == 0L)) {
                          var7.method1920(false, true, true, true, false, true,
                              true);
                        } else {
                          var7.method1920(true, true, true, true, true, true,
                              true);
                        }
                      }
                    }

                    for (int var10 = 0; (var10 < var6.anInt2223); ++var10) {
                      if (var6.sceneGraphNodes[var10].sceneNode instanceof GlModel) {
                        GlModel var8 = (GlModel) var6.sceneGraphNodes[var10].sceneNode;
                        if (((Long.MIN_VALUE
                            & var6.sceneGraphNodes[var10].aLong498) == 0L)) {
                          var8.method1920(false, true, true, true, false, true, true);
                        } else {
                          var8.method1920(true, true, true, true, true, true, true);
                        }
                      }
                    }
                  }
                }
              }
            }

            aBoolean3416 = true;
          }
        }
    }

    public static void method91(byte var0) {
      anIntArray2213 = null;
        if (var0 <= 110) {
          method90(-74);
        }

        scripts = null;
        anIntArray2209 = null;
        aClass94_2206 = null;
        aClass94_2210 = null;
        aClass94_2207 = null;
        aClass94_2214 = null;
    }

    public static void d(int var0) {
      if ((GlobalStatics_9.anInt1252 != -1) && (anInt2293 != -1)) {
          int var1 =
            (DummyClass8.anInt4020 * (-DummyClass21.anInt1759 + GlobalStatics_3.anInt2383)
              >> 16) + DummyClass21.anInt1759;
          float[] var3 = new float[3];
          DummyClass8.anInt4020 += var1;
          if ((DummyClass8.anInt4020 >= 65535)) {
            DummyClass8.anInt4020 = '\uffff';
            GlobalStatics_9.aBoolean3531 = !GlobalStatics_9.aBoolean3668;

            GlobalStatics_9.aBoolean3668 = true;
          } else {
            GlobalStatics_9.aBoolean3668 = false;
            GlobalStatics_9.aBoolean3531 = false;
          }

          if (var0 == '\uffff') {
            float var2 = DummyClass8.anInt4020 / 65535.0F;
            int var4 = GlobalStatics_7.anInt1081 * 2;

            int var6;
            int var7;
            int var8;
            int var9;
            int var10;
            int var11;
            int var12;
            for (int var5 = 0; (var5 < 3); ++var5) {
              var8 =
                (DummyClass43.anIntArrayArrayArray911[GlobalStatics_9.anInt1252][var4 + 2][var5]
                  - DummyClass43.anIntArrayArrayArray911[GlobalStatics_9.anInt1252][var4 + 3][var5]
                  + DummyClass43.anIntArrayArrayArray911[GlobalStatics_9.anInt1252][var4
                  + 2][var5]) * 3;
              var9 = DummyClass43.anIntArrayArrayArray911[GlobalStatics_9.anInt1252][var4][var5];
              var7 =
                3 * DummyClass43.anIntArrayArrayArray911[GlobalStatics_9.anInt1252][var4 + 1][var5];
              var6 = 3 * DummyClass43.anIntArrayArrayArray911[GlobalStatics_9.anInt1252][var4][var5];
              var10 = -var6 + var7;
              var11 = var8 - (var7 * 2) + var6;
              var12 = DummyClass43.anIntArrayArrayArray911[GlobalStatics_9.anInt1252][2 + var4][var5]
                - var9 + var7 - var8;
              var3[var5] =
                var9 + ((var12 * var2 + var11) * var2 + var10) * var2;
            }

            GlobalStatics_7.anInt2162 = -1 * (int) var3[1];
            GlobalStatics_9.anInt3995 = (int) var3[0] - (128 * anInt1716);
            DummyClass49.anInt1111 = (int) var3[2] - (GlobalStatics_9.anInt1152 * 128);
            float[] var16 = new float[3];
            var6 = DummyClass37.anInt670 * 2;

            for (var7 = 0; (var7 < 3); ++var7) {
              var8 = DummyClass43.anIntArrayArrayArray911[anInt2293][var6][var7] * 3;
              var10 = (DummyClass43.anIntArrayArrayArray911[anInt2293][2 + var6][var7]
                - DummyClass43.anIntArrayArrayArray911[anInt2293][3 + var6][var7]
                + DummyClass43.anIntArrayArrayArray911[anInt2293][var6 + 2][var7])
                * 3;
              var11 = DummyClass43.anIntArrayArrayArray911[anInt2293][var6][var7];
              var9 =
                DummyClass43.anIntArrayArrayArray911[anInt2293][1 + var6][var7] * 3;
              var12 = var9 - var8;
              int var13 = var10 + var8 - (2 * var9);
              int var14 = -var10 + DummyClass43.anIntArrayArrayArray911[anInt2293][var6
                + 2][var7] - var11 + var9;
              var16[var7] = var11 + var2 * (var2 * (var2 * var14 + var13)
                + var12);
            }

            float var17 = -var3[0] + var16[0];
            float var19 = var16[2] - var3[2];
            float var18 = (-var3[1] + var16[1]) * -1.0f;
            double var20 = Math.sqrt(var19 * var19 + var17 * var17);
            DummyClass52.aFloat1169 = (float) Math.atan2(var18, var20);
            DummyClass38.aFloat730 = -((float) Math.atan2(var17, var19));
            DummyClass17.anInt1823 = 2047 & (int) (325.949D * DummyClass52.aFloat1169);
            anInt3315 = 2047 & (int) (DummyClass38.aFloat730 * 325.949D);
          }
        }
    }

    public static AbstractIndexedColorSprite createIndexedColorSprite(
            FileUnpacker var1, int fileId) {
      return !GlobalStatics_9.loadSprites(var1, fileId) ?
          null :
          (GlobalStatics_9.createIndexedColorSprite());
    }

    public static MapScene c(int var0, int var1) {
      MapScene var2 = (MapScene) aClass93_3412.get(var0);
        if (var2 != null) {
          return var2;
        } else {
          byte[] var3 = GlobalStatics_9.configs.getBytes(34, var0);
          if (var1 != 0) {
            aClass94_3595 = null;
          }

          var2 = new MapScene();
          if (var3 != null) {
            var2.method74((byte) -115, new Buffer(var3), var0);
          }

          aClass93_3412.get((byte) -86, var2, var0);
          return var2;
        }
    }

    public static String createIndexedColorSprite(String var0, String var1, int var2, String var3) {
      for (int var4 = var3.indexOf(var0);
          (var4 != -1); var4 = var3.indexOf(var0, var4 + var1.length())) {
        var3 = var3.substring(0, var4) + var1 + var3.substring(var0.length() + var4);
      }

      return var3;
    }

    public static void createIndexedColorSprite(int var0, int var1, int var2, Widget var3) {
      if (DummyClass42.aClass11_886 == null && !DummyClass36.aBoolean2615) {
          if (var2 < 61) {
            createIndexedColorSprite(19, 20, -32, null);
          }

          if (var3 != null && GlobalStatics_9.method1122(0, var3) != null) {
            DummyClass42.aClass11_886 = var3;
            DummyClass18.aClass11_88 = GlobalStatics_9.method1122(0, var3);
            GlobalStatics_6.anInt1881 = var1;
            GlobalStatics_9.aBoolean3975 = false;
            GlobalStatics_9.anInt2658 = 0;
            DummyClass53.anInt1336 = var0;
          }
        }
    }

    public static void createIndexedColorSprite(int var0, int var1, int var2, int var3,
                                                GameString var4, long var5, int var7) {
      Buffer var8 = new Buffer(128);
        var8.writeByte(10);
        var8.writeShort((int) (Math.random() * 99999.0D));
        var8.writeShort(530);
        var8.writeLong(var5);
        var8.writeInt((int) (Math.random() * 9.9999999E7D));
        var8.writeString(var4);
        var8.writeInt((int) (Math.random() * 9.9999999E7D));
        var8.writeShort(GlobalStatics_9.affiliateId);
        var8.writeByte(var0);
        var8.writeByte(var3);
        if (var1 != 10603) {
          h((byte) -43);
        }

        var8.writeInt((int) (Math.random() * 9.9999999E7D));
        var8.writeShort(var7);
        var8.writeShort(var2);
        var8.writeInt((int) (9.9999999E7D * Math.random()));
        var8.encipherRSA(RSAConfiguration.PUBLIC_EXPONENT, RSAConfiguration.MODULUS);
        GlobalStatics_9.secureBuffer.position = 0;
        GlobalStatics_9.secureBuffer.writeByte(36);
        GlobalStatics_9.secureBuffer.writeByte(var8.position);
        GlobalStatics_9.secureBuffer.write(var8.bytes, 0, var8.position);
        GlobalStatics_0.anInt1711 = -3;
        DummyCanvas.anInt23 = 1;
        DummyClass22.anInt1734 = 0;
        GlobalStatics_9.anInt548 = 0;
    }

    public static void f(int var0) {
      if (var0 == 3) {
          aClass94_3595 = null;
        }
    }

    public static void h(byte var0) {
      GlobalStatics_9.aClass93_1569.method1523((byte) -109);
        if (var0 != 3) {
          aBoolean3594 = false;
        }

        GlobalStatics_9.aClass93_2428.method1523((byte) -123);
        GlobalStatics_6.aClass93_743.method1523((byte) -106);
    }

    public static void method1786(int var0) {
      while (true) {
          if ((GlobalStatics_9.gameBuffer.method815(GlobalStatics_0.packetLength, 32666) >= 11)) {
            int var1 = GlobalStatics_9.gameBuffer.readBits(11);
            if (var1 != 2047) {
              boolean var2 = false;
              if (GlobalStatics_9.players[var1] == null) {
                GlobalStatics_9.players[var1] = new Player();
                var2 = true;
                if (DummyClass45.configs[var1] != null) {
                  GlobalStatics_9.players[var1].parseConfig(DummyClass45.configs[var1]);
                }
              }

              DummyClass42.anIntArray887[DummyClass13.anInt2022++] = var1;
              Player var3 = GlobalStatics_9.players[var1];
              var3.anInt2838 = GlobalStatics_4.updateCycle;
              int var4 = GlobalStatics_9.gameBuffer.readBits(1);
              if ((var4 == 1)) {
                DummyClass60.anIntArray441[GlobalStatics_9.anInt997++] = var1;
              }

              int var5 = GlobalStatics_9.gameBuffer.readBits(5);
              int var6 = DummyClass32.anIntArray510[GlobalStatics_9.gameBuffer.readBits(3)];
              if (var5 > 15) {
                var5 -= 32;
              }

              if (var2) {
                var3.anInt2806 = var3.rotationY = var6;
              }

              int var7 = GlobalStatics_9.gameBuffer.readBits(1);
              int var8 = GlobalStatics_9.gameBuffer.readBits(5);
              if (var8 > 15) {
                var8 -= 32;
              }

              var3.setPosition((byte) 126, var5 + GlobalStatics_9.localPlayer.waypointsX[0], (var7 == 1),
                GlobalStatics_9.localPlayer.waypointsY[0] + var8);
              continue;
            }
          }

          if (var0 >= -46) {
            return;
          }

          GlobalStatics_9.gameBuffer.method818(false);
          return;
        }
    }

    public static int method1788(int var0, int var1, int var2, int var3, boolean var4) {
      if (var4) {
          int var5 = 15 & var3;
          int var7 =
              (var5 >= 4) ? ((var5 != 12) && (var5 != 14) ? var1 : var0) : var2;
          int var6 = (var5 < 8) ? var0 : var2;
          return (((var5 & 1) != 0) ? -var6 : var6) + (((2 & var5) != 0) ? -var7
              : var7);
        } else {
          return 127;
        }
    }

    public static void method1790(int var0, int var1, int var2) {
      if (var2 < 90) {
          aClass94_1731 = null;
        }

        WidgetUpdate var3 = GlobalStatics_6.method466(4, 5, var0);
        var3.g((byte) 33);
        var3.anInt3598 = var1;
    }

    public static void method1792(int var0) {
      anIntArray1729 = null;
        if (var0 == 0) {
          animationBases = null;
          aClass94_1726 = null;
          aClass94_1731 = null;
          aClass94_1717 = null;
          aClass94_1722 = null;
          aClass94_1728 = null;
          aClass94_1724 = null;
        }
    }

    public static void method1793(GameString var0, GameString var1, int var2, byte var3) {
      GlobalStatics_9.password = var1;
        GlobalStatics_7.anInt2161 = var2;
        GlobalStatics_9.username = var0;
        if (!GlobalStatics_9.username.method1528((byte) -42, GlobalStatics_9.EMPTY_STRING)
          && !GlobalStatics_9.password.method1528((byte) -42, GlobalStatics_9.EMPTY_STRING)) {
          if ((GlobalStatics_7.anInt2451 == -1)) {
            GlobalStatics_2.anInt2246 = 0;
            DummyClass26.anInt1616 = 0;
            GlobalStatics_5.loginResponse = -3;
            GlobalStatics_9.anInt3375 = 1;
            Buffer var4 = new Buffer(128);
            var4.writeByte(10);
            var4.writeShort((int) (Math.random() * 99999.0D));
            var4.writeShort(530);
            var4.writeLong(GlobalStatics_9.username.toBase37());
            var4.writeInt((int) (Math.random() * 9.9999999E7D));
            var4.writeString(GlobalStatics_9.password);
            var4.writeInt((int) (Math.random() * 9.9999999E7D));
            var4.encipherRSA(RSAConfiguration.PUBLIC_EXPONENT,
                RSAConfiguration.MODULUS);
            GlobalStatics_9.secureBuffer.position = 0;
            GlobalStatics_9.secureBuffer.writeByte(210);
            GlobalStatics_9.secureBuffer.writeByte(var4.position);
            GlobalStatics_9.secureBuffer.write(var4.bytes, 0, var4.position);
          } else {
            GlobalStatics_9.method951(0);
          }
        } else {
          GlobalStatics_5.loginResponse = 3;
        }
    }
}
