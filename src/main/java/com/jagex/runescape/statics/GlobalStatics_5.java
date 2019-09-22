package com.jagex.runescape.statics;

import com.jagex.runescape.camera.CameraStatics;
import com.jagex.runescape.math.MathUtilities;
import com.jagex.runescape.model.Widget;
import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.model.FileSystem;
import com.jagex.runescape.cache.FileUnpacker;
import com.jagex.runescape.scene.SceneGraphTile;
import com.jagex.runescape.scene.SceneNode;
import com.jagex.runescape.scene.SceneSomething;
import com.jagex.runescape.scene.SceneSomething2;
import com.jagex.runescape.model.SomethingQuickChatK;
import com.jagex.runescape.scene.SomethingSceneI;
import com.jagex.runescape.scene.SomethingSceneJ;
import com.jagex.runescape.opengl.CommonGL;
import com.jagex.runescape.opengl.GLStatics;
import com.jagex.runescape.opengl.GlRenderer;
import java.util.Arrays;

public class GlobalStatics_5 {

  public static int loginResponse = -2;
  public static GameString aClass94_2006 = GameStringStatics.create("null");
  public static byte[][][] aByteArrayArrayArray2008;
  public static int anInt2010 = -16 + (int) (33.0D * Math.random());
  public static GameString aClass94_2013 = GameStringStatics
      .create("Lade Liste der Welten");
  public static int gameId;
  public static int anInt2015;
  public static int[] quadx0 = new int[100];
  public static GameString aClass94_1970 = GameStringStatics.create(":");
  public static int anInt1971;
  public static GameString aClass94_1974 =
      GameStringStatics.create("Verbindung mit Update)2Server)3)3)3");
  public static int[] anIntArray1976 = {1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0,
      0, 1, 0};
  public static int anInt1977;
  public static int[] OTHER_KEY_QUEUE = new int[128];
  public static GameString aClass94_1932 = GameStringStatics.create(")4a=");
  public static Widget aClass11_1933;
  public static float[] aFloatArray1934 = {0.073F, 0.169F, 0.24F, 1.0F};
  public static GameString COMMAND_DROP_CLIENT = GameStringStatics
      .create("::clientdrop");
  public static FileSystem fileSystem;
  public static int anInt1901 = 2;
  public static FileUnpacker soundEffects;
  public static int[][][] anIntArrayArrayArray1903;
  public static int anInt1904;
  public static GameString aClass94_1617 = GameStringStatics.create(")1a2)1m");
  public static GameString aClass94_1618 =
      GameStringStatics.create("Verbindung zum Update)2Server hergestellt)3");
  public static short[][] aShortArrayArray1619 = {
      {
          (short) 10, (short) 30, (short) 50, (short) 70, (short) 90,
          (short) 110, (short) 310,
          (short) 684, (short) 704, (short) 556, (short) 940, (short) 960,
          (short) 6454, (short) 6952,
          (short) 6972, (short) 2358, (short) 2732, (short) 2752, (short) 10550,
          (short) 10924,
          (short) 10944, (short) 10310, (short) 10556, (short) 10576,
          (short) 14646, (short) 15020,
          (short) 15040, (short) 19766, (short) 20140, (short) 20160,
          (short) -29386, (short) -29012,
          (short) -28992, (short) 31030, (short) 31276, (short) 31296,
          (short) -24266, (short) -23892,
          (short) -23872, (short) -19146, (short) -18772, (short) -18752,
          (short) -14026,
          (short) -13652, (short) -13632, (short) -6858, (short) -6484,
          (short) -6464, (short) 522,
          (short) 542, (short) 6794, (short) 6814, (short) 11018, (short) 11038,
          (short) 14986,
          (short) 15006, (short) 21130, (short) 21150, (short) -28918,
          (short) -28898, (short) -22006,
          (short) -21986, (short) -12918, (short) -12898, (short) 10,
          (short) 30, (short) 50,
          (short) 70, (short) 90, (short) 110, (short) 310, (short) 684,
          (short) 704, (short) 556,
          (short) 940, (short) 960, (short) 6454, (short) 6952, (short) 6972,
          (short) 2358,
          (short) 2732, (short) 2752, (short) 10550, (short) 10924,
          (short) 10944, (short) 10310,
          (short) 10556, (short) 10576, (short) 14646, (short) 15020,
          (short) 15040, (short) 19766,
          (short) 20140, (short) 20160, (short) -29386, (short) -29012,
          (short) -28992, (short) 31030,
          (short) 31276, (short) 31296, (short) -24266, (short) -23892,
          (short) -23872, (short) -19146,
          (short) -18772, (short) -18752, (short) -14026, (short) -13652,
          (short) -13632, (short) -6858,
          (short) -6484, (short) -6464, (short) 522, (short) 542, (short) 6794,
          (short) 6814,
          (short) 11018, (short) 11038, (short) 14986, (short) 15006,
          (short) 21130, (short) 21150,
          (short) -28918, (short) -28898, (short) -22006, (short) -21986,
          (short) -12918,
          (short) -12898, (short) 10, (short) 30, (short) 50, (short) 70,
          (short) 90, (short) 110,
          (short) 310, (short) 684, (short) 704, (short) 556, (short) 940,
          (short) 960, (short) 6454,
          (short) 6952, (short) 6972, (short) 2358, (short) 2732, (short) 2752,
          (short) 10550,
          (short) 10924, (short) 10944, (short) 10310, (short) 10556,
          (short) 10576, (short) 14646,
          (short) 15020, (short) 15040, (short) 19766, (short) 20140,
          (short) 20160, (short) -29386,
          (short) -29012, (short) -28992, (short) 31030, (short) 31276,
          (short) 31296, (short) -24266,
          (short) -23892, (short) -23872, (short) -19146, (short) -18772,
          (short) -18752,
          (short) -14026, (short) -13652, (short) -13632, (short) -6858,
          (short) -6484, (short) -6464,
          (short) 522, (short) 542, (short) 6794, (short) 6814, (short) 11018,
          (short) 11038,
          (short) 14986, (short) 15006, (short) 21130, (short) 21150,
          (short) -28918, (short) -28898,
          (short) -22006, (short) -21986, (short) -12918, (short) -12898,
          (short) 10, (short) 30,
          (short) 50, (short) 70, (short) 90, (short) 110, (short) 310,
          (short) 684, (short) 704,
          (short) 556, (short) 940, (short) 960, (short) 6454, (short) 6952,
          (short) 6972, (short) 2358,
          (short) 2732, (short) 2752, (short) 10550, (short) 10924,
          (short) 10944, (short) 10310,
          (short) 10556, (short) 10576, (short) 14646, (short) 15020,
          (short) 15040, (short) 19766,
          (short) 20140, (short) 20160, (short) -29386, (short) -29012,
          (short) -28992, (short) 31030,
          (short) 31276, (short) 31296, (short) -24266, (short) -23892,
          (short) -23872, (short) -19146,
          (short) -18772, (short) -18752, (short) -14026, (short) -13652,
          (short) -13632, (short) -6858,
          (short) -6484, (short) -6464, (short) 522, (short) 542, (short) 6794,
          (short) 6814,
          (short) 11018, (short) 11038, (short) 14986, (short) 15006,
          (short) 21130, (short) 21150,
          (short) -28918, (short) -28898, (short) -22006, (short) -21986,
          (short) -12918, (short) -12898
      }, {
      (short) 10, (short) 30, (short) 50, (short) 70, (short) 90, (short) 110,
      (short) 310,
      (short) 684, (short) 704, (short) 556, (short) 940, (short) 960,
      (short) 6454, (short) 6952,
      (short) 6972, (short) 2358, (short) 2732, (short) 2752, (short) 10550,
      (short) 10924,
      (short) 10944, (short) 10310, (short) 10556, (short) 10576, (short) 14646,
      (short) 15020,
      (short) 15040, (short) 19766, (short) 20140, (short) 20160,
      (short) -29386, (short) -29012,
      (short) -28992, (short) 31030, (short) 31276, (short) 31296,
      (short) -24266, (short) -23892,
      (short) -23872, (short) -19146, (short) -18772, (short) -18752,
      (short) -14026, (short) -13652,
      (short) -13632, (short) -6858, (short) -6484, (short) -6464, (short) 522,
      (short) 542,
      (short) 6794, (short) 6814, (short) 11018, (short) 11038, (short) 14986,
      (short) 15006,
      (short) 21130, (short) 21150, (short) -28918, (short) -28898,
      (short) -22006, (short) -21986,
      (short) -12918, (short) -12898, (short) 10, (short) 30, (short) 50,
      (short) 70, (short) 90,
      (short) 110, (short) 310, (short) 684, (short) 704, (short) 556,
      (short) 940, (short) 960,
      (short) 6454, (short) 6952, (short) 6972, (short) 2358, (short) 2732,
      (short) 2752,
      (short) 10550, (short) 10924, (short) 10944, (short) 10310, (short) 10556,
      (short) 10576,
      (short) 14646, (short) 15020, (short) 15040, (short) 19766, (short) 20140,
      (short) 20160,
      (short) -29386, (short) -29012, (short) -28992, (short) 31030,
      (short) 31276, (short) 31296,
      (short) -24266, (short) -23892, (short) -23872, (short) -19146,
      (short) -18772, (short) -18752,
      (short) -14026, (short) -13652, (short) -13632, (short) -6858,
      (short) -6484, (short) -6464,
      (short) 522, (short) 542, (short) 6794, (short) 6814, (short) 11018,
      (short) 11038,
      (short) 14986, (short) 15006, (short) 21130, (short) 21150,
      (short) -28918, (short) -28898,
      (short) -22006, (short) -21986, (short) -12918, (short) -12898,
      (short) 10, (short) 30,
      (short) 50, (short) 70, (short) 90, (short) 110, (short) 310, (short) 684,
      (short) 704,
      (short) 556, (short) 940, (short) 960, (short) 6454, (short) 6952,
      (short) 6972, (short) 2358,
      (short) 2732, (short) 2752, (short) 10550, (short) 10924, (short) 10944,
      (short) 10310,
      (short) 10556, (short) 10576, (short) 14646, (short) 15020, (short) 15040,
      (short) 19766,
      (short) 20140, (short) 20160, (short) -29386, (short) -29012,
      (short) -28992, (short) 31030,
      (short) 31276, (short) 31296, (short) -24266, (short) -23892,
      (short) -23872, (short) -19146,
      (short) -18772, (short) -18752, (short) -14026, (short) -13652,
      (short) -13632, (short) -6858,
      (short) -6484, (short) -6464, (short) 522, (short) 542, (short) 6794,
      (short) 6814,
      (short) 11018, (short) 11038, (short) 14986, (short) 15006, (short) 21130,
      (short) 21150,
      (short) -28918, (short) -28898, (short) -22006, (short) -21986,
      (short) -12918, (short) -12898,
      (short) 10347, (short) 10582, (short) 10429, (short) 10407, (short) 10359,
      (short) 8414,
      (short) 9540, (short) 10456, (short) 0, (short) 0, (short) 0, (short) 0,
      (short) 0, (short) 0,
      (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
      (short) 0, (short) 0,
      (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
      (short) 0, (short) 0,
      (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
      (short) 0, (short) 0,
      (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
      (short) 0, (short) 0,
      (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
      (short) 0, (short) 0,
      (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
      (short) 0, (short) 0,
      (short) 0, (short) 0
  }, {
      (short) 10, (short) 30, (short) 50, (short) 70, (short) 90, (short) 110,
      (short) 310,
      (short) 684, (short) 704, (short) 556, (short) 940, (short) 960,
      (short) 6454, (short) 6952,
      (short) 6972, (short) 2358, (short) 2732, (short) 2752, (short) 10550,
      (short) 10924,
      (short) 10944, (short) 10310, (short) 10556, (short) 10576, (short) 14646,
      (short) 15020,
      (short) 15040, (short) 19766, (short) 20140, (short) 20160,
      (short) -29386, (short) -29012,
      (short) -28992, (short) 31030, (short) 31276, (short) 31296,
      (short) -24266, (short) -23892,
      (short) -23872, (short) -19146, (short) -18772, (short) -18752,
      (short) -14026, (short) -13652,
      (short) -13632, (short) -6858, (short) -6484, (short) -6464, (short) 522,
      (short) 542,
      (short) 6794, (short) 6814, (short) 11018, (short) 11038, (short) 14986,
      (short) 15006,
      (short) 21130, (short) 21150, (short) -28918, (short) -28898,
      (short) -22006, (short) -21986,
      (short) -12918, (short) -12898, (short) 10, (short) 30, (short) 50,
      (short) 70, (short) 90,
      (short) 110, (short) 310, (short) 684, (short) 704, (short) 556,
      (short) 940, (short) 960,
      (short) 6454, (short) 6952, (short) 6972, (short) 2358, (short) 2732,
      (short) 2752,
      (short) 10550, (short) 10924, (short) 10944, (short) 10310, (short) 10556,
      (short) 10576,
      (short) 14646, (short) 15020, (short) 15040, (short) 19766, (short) 20140,
      (short) 20160,
      (short) -29386, (short) -29012, (short) -28992, (short) 31030,
      (short) 31276, (short) 31296,
      (short) -24266, (short) -23892, (short) -23872, (short) -19146,
      (short) -18772, (short) -18752,
      (short) -14026, (short) -13652, (short) -13632, (short) -6858,
      (short) -6484, (short) -6464,
      (short) 522, (short) 542, (short) 6794, (short) 6814, (short) 11018,
      (short) 11038,
      (short) 14986, (short) 15006, (short) 21130, (short) 21150,
      (short) -28918, (short) -28898,
      (short) -22006, (short) -21986, (short) -12918, (short) -12898,
      (short) 10, (short) 30,
      (short) 50, (short) 70, (short) 90, (short) 110, (short) 310, (short) 684,
      (short) 704,
      (short) 556, (short) 940, (short) 960, (short) 6454, (short) 6952,
      (short) 6972, (short) 2358,
      (short) 2732, (short) 2752, (short) 10550, (short) 10924, (short) 10944,
      (short) 10310,
      (short) 10556, (short) 10576, (short) 14646, (short) 15020, (short) 15040,
      (short) 19766,
      (short) 20140, (short) 20160, (short) -29386, (short) -29012,
      (short) -28992, (short) 31030,
      (short) 31276, (short) 31296, (short) -24266, (short) -23892,
      (short) -23872, (short) -19146,
      (short) -18772, (short) -18752, (short) -14026, (short) -13652,
      (short) -13632, (short) -6858,
      (short) -6484, (short) -6464, (short) 522, (short) 542, (short) 6794,
      (short) 6814,
      (short) 11018, (short) 11038, (short) 14986, (short) 15006, (short) 21130,
      (short) 21150,
      (short) -28918, (short) -28898, (short) -22006, (short) -21986,
      (short) -12918, (short) -12898,
      (short) 10, (short) 30, (short) 50, (short) 70, (short) 90, (short) 110,
      (short) 310,
      (short) 684, (short) 704, (short) 556, (short) 940, (short) 960,
      (short) 6454, (short) 6952,
      (short) 6972, (short) 2358, (short) 2732, (short) 2752, (short) 10550,
      (short) 10924,
      (short) 10944, (short) 10310, (short) 10556, (short) 10576, (short) 14646,
      (short) 15020,
      (short) 15040, (short) 19766, (short) 20140, (short) 20160,
      (short) -29386, (short) -29012,
      (short) -28992, (short) 31030, (short) 31276, (short) 31296,
      (short) -24266, (short) -23892,
      (short) -23872, (short) -19146, (short) -18772, (short) -18752,
      (short) -14026, (short) -13652,
      (short) -13632, (short) -6858, (short) -6484, (short) -6464, (short) 522,
      (short) 542,
      (short) 6794, (short) 6814, (short) 11018, (short) 11038, (short) 14986,
      (short) 15006,
      (short) 21130, (short) 21150, (short) -28918, (short) -28898,
      (short) -22006, (short) -21986,
      (short) -12918, (short) -12898
  }, {
      (short) 4300, (short) 3294, (short) 3303, (short) 3264, (short) 4506,
      (short) 4382,
      (short) 4387, (short) 5293, (short) 7622, (short) 7384, (short) 8412,
      (short) 7496, (short) 86,
      (short) 123, (short) 111, (short) 99, (short) 0, (short) 0, (short) 0,
      (short) 0, (short) 0,
      (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
      (short) 0, (short) 0,
      (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
      (short) 0, (short) 0,
      (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
      (short) 0, (short) 0,
      (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
      (short) 0, (short) 0,
      (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
      (short) 0, (short) 0,
      (short) 0, (short) 0, (short) 0, (short) 10, (short) 30, (short) 50,
      (short) 70, (short) 90,
      (short) 110, (short) 310, (short) 684, (short) 704, (short) 556,
      (short) 940, (short) 960,
      (short) 6454, (short) 6952, (short) 6972, (short) 2358, (short) 2732,
      (short) 2752,
      (short) 10550, (short) 10924, (short) 10944, (short) 10310, (short) 10556,
      (short) 10576,
      (short) 14646, (short) 15020, (short) 15040, (short) 19766, (short) 20140,
      (short) 20160,
      (short) -29386, (short) -29012, (short) -28992, (short) 31030,
      (short) 31276, (short) 31296,
      (short) -24266, (short) -23892, (short) -23872, (short) -19146,
      (short) -18772, (short) -18752,
      (short) -14026, (short) -13652, (short) -13632, (short) -6858,
      (short) -6484, (short) -6464,
      (short) 522, (short) 542, (short) 6794, (short) 6814, (short) 11018,
      (short) 11038,
      (short) 14986, (short) 15006, (short) 21130, (short) 21150,
      (short) -28918, (short) -28898,
      (short) -22006, (short) -21986, (short) -12918, (short) -12898,
      (short) 10, (short) 30,
      (short) 50, (short) 70, (short) 90, (short) 110, (short) 310, (short) 684,
      (short) 704,
      (short) 556, (short) 940, (short) 960, (short) 6454, (short) 6952,
      (short) 6972, (short) 2358,
      (short) 2732, (short) 2752, (short) 10550, (short) 10924, (short) 10944,
      (short) 10310,
      (short) 10556, (short) 10576, (short) 14646, (short) 15020, (short) 15040,
      (short) 19766,
      (short) 20140, (short) 20160, (short) -29386, (short) -29012,
      (short) -28992, (short) 31030,
      (short) 31276, (short) 31296, (short) -24266, (short) -23892,
      (short) -23872, (short) -19146,
      (short) -18772, (short) -18752, (short) -14026, (short) -13652,
      (short) -13632, (short) -6858,
      (short) -6484, (short) -6464, (short) 522, (short) 542, (short) 6794,
      (short) 6814,
      (short) 11018, (short) 11038, (short) 14986, (short) 15006, (short) 21130,
      (short) 21150,
      (short) -28918, (short) -28898, (short) -22006, (short) -21986,
      (short) -12918, (short) -12898,
      (short) 13766, (short) 13745, (short) 13726, (short) 13890, (short) 13743,
      (short) 13852,
      (short) 17602, (short) 18605, (short) 21660, (short) 24000, (short) 24997,
      (short) 24088,
      (short) 27972, (short) 25903, (short) 26904, (short) 27193, (short) 27175,
      (short) 27156,
      (short) 30020, (short) 28975, (short) 29976, (short) 12482, (short) 13485,
      (short) 10392,
      (short) 10692, (short) 10669, (short) 10776, (short) 6717, (short) 6695,
      (short) 7830,
      (short) 6971, (short) 6951, (short) 5910, (short) 3389, (short) 3369,
      (short) 3356, (short) 0,
      (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
      (short) 0, (short) 0,
      (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
      (short) 0, (short) 0,
      (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
      (short) 0, (short) 0,
      (short) 0, (short) 0, (short) 0
  }, {
      (short) 10, (short) 30, (short) 50, (short) 70, (short) 90, (short) 110,
      (short) 310,
      (short) 684, (short) 704, (short) 556, (short) 940, (short) 960,
      (short) 6454, (short) 6952,
      (short) 6972, (short) 2358, (short) 2732, (short) 2752, (short) 10550,
      (short) 10924,
      (short) 10944, (short) 10310, (short) 10556, (short) 10576, (short) 14646,
      (short) 15020,
      (short) 15040, (short) 19766, (short) 20140, (short) 20160,
      (short) -29386, (short) -29012,
      (short) -28992, (short) 31030, (short) 31276, (short) 31296,
      (short) -24266, (short) -23892,
      (short) -23872, (short) -19146, (short) -18772, (short) -18752,
      (short) -14026, (short) -13652,
      (short) -13632, (short) -6858, (short) -6484, (short) -6464, (short) 522,
      (short) 542,
      (short) 6794, (short) 6814, (short) 11018, (short) 11038, (short) 14986,
      (short) 15006,
      (short) 21130, (short) 21150, (short) -28918, (short) -28898,
      (short) -22006, (short) -21986,
      (short) -12918, (short) -12898, (short) 10, (short) 30, (short) 50,
      (short) 70, (short) 90,
      (short) 110, (short) 310, (short) 684, (short) 704, (short) 556,
      (short) 940, (short) 960,
      (short) 6454, (short) 6952, (short) 6972, (short) 2358, (short) 2732,
      (short) 2752,
      (short) 10550, (short) 10924, (short) 10944, (short) 10310, (short) 10556,
      (short) 10576,
      (short) 14646, (short) 15020, (short) 15040, (short) 19766, (short) 20140,
      (short) 20160,
      (short) -29386, (short) -29012, (short) -28992, (short) 31030,
      (short) 31276, (short) 31296,
      (short) -24266, (short) -23892, (short) -23872, (short) -19146,
      (short) -18772, (short) -18752,
      (short) -14026, (short) -13652, (short) -13632, (short) -6858,
      (short) -6484, (short) -6464,
      (short) 522, (short) 542, (short) 6794, (short) 6814, (short) 11018,
      (short) 11038,
      (short) 14986, (short) 15006, (short) 21130, (short) 21150,
      (short) -28918, (short) -28898,
      (short) -22006, (short) -21986, (short) -12918, (short) -12898,
      (short) 10, (short) 30,
      (short) 50, (short) 70, (short) 90, (short) 110, (short) 310, (short) 684,
      (short) 704,
      (short) 556, (short) 940, (short) 960, (short) 6454, (short) 6952,
      (short) 6972, (short) 2358,
      (short) 2732, (short) 2752, (short) 10550, (short) 10924, (short) 10944,
      (short) 10310,
      (short) 10556, (short) 10576, (short) 14646, (short) 15020, (short) 15040,
      (short) 19766,
      (short) 20140, (short) 20160, (short) -29386, (short) -29012,
      (short) -28992, (short) 31030,
      (short) 31276, (short) 31296, (short) -24266, (short) -23892,
      (short) -23872, (short) -19146,
      (short) -18772, (short) -18752, (short) -14026, (short) -13652,
      (short) -13632, (short) -6858,
      (short) -6484, (short) -6464, (short) 522, (short) 542, (short) 6794,
      (short) 6814,
      (short) 11018, (short) 11038, (short) 14986, (short) 15006, (short) 21130,
      (short) 21150,
      (short) -28918, (short) -28898, (short) -22006, (short) -21986,
      (short) -12918, (short) -12898,
      (short) 10, (short) 30, (short) 50, (short) 70, (short) 90, (short) 110,
      (short) 310,
      (short) 684, (short) 704, (short) 556, (short) 940, (short) 960,
      (short) 6454, (short) 6952,
      (short) 6972, (short) 2358, (short) 2732, (short) 2752, (short) 10550,
      (short) 10924,
      (short) 10944, (short) 10310, (short) 10556, (short) 10576, (short) 14646,
      (short) 15020,
      (short) 15040, (short) 19766, (short) 20140, (short) 20160,
      (short) -29386, (short) -29012,
      (short) -28992, (short) 31030, (short) 31276, (short) 31296,
      (short) -24266, (short) -23892,
      (short) -23872, (short) -19146, (short) -18772, (short) -18752,
      (short) -14026, (short) -13652,
      (short) -13632, (short) -6858, (short) -6484, (short) -6464, (short) 522,
      (short) 542,
      (short) 6794, (short) 6814, (short) 11018, (short) 11038, (short) 14986,
      (short) 15006,
      (short) 21130, (short) 21150, (short) -28918, (short) -28898,
      (short) -22006, (short) -21986,
      (short) -12918, (short) -12898
  }
  };
  public static GameString aClass94_1620 = GameStringStatics.create("Cach-B");
  public static GameString aClass94_1621 = GameStringStatics
      .create("Chargement des polices )2 ");
  public static GameString aClass94_1622 = GameStringStatics.create("Card:");
  public static int anInt1623;

  public static void method2180(FileUnpacker var0, FileUnpacker var1,
      int var2) {
    if (var2 != 11504) {
      GlobalStatics_5.aClass94_2013 = null;
    }

    GlobalStatics_9.models = var0;
    GlobalStatics_10.spotAnimations = var1;
  }

  public static void clear8(boolean var0) {
    GlobalStatics_5.aByteArrayArrayArray2008 = null;
    GameStringStatics.anIntArray2004 = null;
    GlobalStatics_5.aClass94_2013 = null;
    if (var0) {
      GlobalStatics_5.clear8(false);
    }

    GlobalStatics_5.aClass94_2006 = null;
  }

  public static void method2183(int var0, boolean var1, int var2, int var3,
      int var4,
      Widget[] var5) {
    int var6 = 0;
    if (var3 == 235) {
      for (; var6 < var5.length; ++var6) {
        Widget var7 = var5[var6];
        if (var7 != null && var7.anInt190 == var0) {
          GlobalStatics_9.method603(var4, 13987, var2, var7, var1);
          GlobalStatics_8.method1224(var7, 23730, var4, var2);
          if (var7.anInt240 - var7.anInt168 < var7.anInt247) {
            var7.anInt247 = var7.anInt240 - var7.anInt168;
          }

          if (var7.anInt208 > -var7.zoom + var7.anInt252) {
            var7.anInt208 = var7.anInt252 - var7.zoom;
          }

          if (var7.anInt208 < 0) {
            var7.anInt208 = 0;
          }

          if (var7.anInt247 < 0) {
            var7.anInt247 = 0;
          }

          if (var7.anInt187 == 0) {
            GlobalStatics_7.method2104(var7, var1, -108);
          }
        }
      }

    }
  }

  public static void method2186(SceneSomething var0) {
    for (int var1 = var0.anInt483; var1 <= var0.anInt495; ++var1) {
      for (int var2 = var0.anInt478; var2 <= var0.anInt481; ++var2) {
        SceneGraphTile var3 = GLStatics.sceneGraphTiles[var0.anInt493][var1][var2];
        if (var3 != null) {
          int var4;
          for (var4 = 0; var4 < var3.anInt2223; ++var4) {
            if (var3.sceneGraphNodes[var4] == var0) {
              --var3.anInt2223;

              for (int var5 = var4; var5 < var3.anInt2223; ++var5) {
                var3.sceneGraphNodes[var5] = var3.sceneGraphNodes[var5 + 1];
                var3.anIntArray2237[var5] = var3.anIntArray2237[var5 + 1];
              }

              var3.sceneGraphNodes[var3.anInt2223] = null;
              break;
            }
          }

          var3.flags = 0;

          for (var4 = 0; var4 < var3.anInt2223; ++var4) {
            var3.flags |= var3.anIntArray2237[var4];
          }
        }
      }
    }

  }

  public static SomethingQuickChatK method2156(int var0, Buffer var1) {
    SomethingQuickChatK var2 = new SomethingQuickChatK();
    var2.anInt149 = var1.readUnsignedShort();
    if (var0 != 1024) {
      GlobalStatics_5.method2162(null, 34, 103, -93);
    }

    var2.aClass3_Sub28_Sub4_151 = GlobalStatics_0
        .method733(12345678, var2.anInt149);
    return var2;
  }

  public static void method2162(SceneNode var0, int var1, int var2, int var3) {
    SceneGraphTile var4;
    if (var2 < GlobalStatics_4.REGION_WIDTH) {
      var4 = GLStatics.sceneGraphTiles[var1][var2 + 1][var3];
      if (var4 != null && var4.aClass12_2230 != null
          && var4.aClass12_2230.aClass140_320.method1865()) {
        var0.method1866(var4.aClass12_2230.aClass140_320, 128, 0, 0, true);
      }
    }

    if (var3 < GlobalStatics_4.REGION_WIDTH) {
      var4 = GLStatics.sceneGraphTiles[var1][var2][var3 + 1];
      if (var4 != null && var4.aClass12_2230 != null
          && var4.aClass12_2230.aClass140_320.method1865()) {
        var0.method1866(var4.aClass12_2230.aClass140_320, 0, 0, 128, true);
      }
    }

    if (var2 < GlobalStatics_4.REGION_WIDTH
        && var3 < GlobalStatics_1.REGION_HEIGHT) {
      var4 = GLStatics.sceneGraphTiles[var1][var2 + 1][var3 + 1];
      if (var4 != null && var4.aClass12_2230 != null
          && var4.aClass12_2230.aClass140_320.method1865()) {
        var0.method1866(var4.aClass12_2230.aClass140_320, 128, 0, 128, true);
      }
    }

    if (var2 < GlobalStatics_4.REGION_WIDTH && var3 > 0) {
      var4 = GLStatics.sceneGraphTiles[var1][var2 + 1][var3 - 1];
      if (var4 != null && var4.aClass12_2230 != null
          && var4.aClass12_2230.aClass140_320.method1865()) {
        var0.method1866(var4.aClass12_2230.aClass140_320, 128, 0, -128, true);
      }
    }

  }

  public static void clear34(int var0) {
    GlobalStatics_5.aClass94_1970 = null;
    GlobalStatics_5.aClass94_1974 = null;
    GlobalStatics_5.anIntArray1976 = null;
    if (var0 != 0) {
      GlobalStatics_5.clear34(-20);
    }

    GlobalStatics_5.quadx0 = null;
    GlobalStatics_5.OTHER_KEY_QUEUE = null;
  }

  public static void clear91(int var0) {
    GlobalStatics_5.fileSystem = null;
    GlobalStatics_5.aClass94_1932 = null;
    GlobalStatics_5.aFloatArray1934 = null;
    GlobalStatics_5.COMMAND_DROP_CLIENT = null;
    GlobalStatics_5.aClass11_1933 = null;
    if (var0 != 1) {
      GlobalStatics_5.method2096(-83, 44, -77, 121L);
    }
  }

  public static boolean method2096(int var0, int var1, int var2, long var3) {
    SceneGraphTile var5 = GLStatics.sceneGraphTiles[var0][var1][var2];
    if (var5 == null) {
      return false;
    } else if (var5.aClass70_2234 != null && var5.aClass70_2234.key == var3) {
      return true;
    } else if (var5.aClass19_2233 != null
        && var5.aClass19_2233.aLong428 == var3) {
      return true;
    } else if (var5.aClass12_2230 != null
        && var5.aClass12_2230.aLong328 == var3) {
      return true;
    } else {
      for (int var6 = 0; var6 < var5.anInt2223; ++var6) {
        if (var5.sceneGraphNodes[var6].aLong498 == var3) {
          return true;
        }
      }

      return false;
    }
  }

  public static void method2099(boolean var0, int var1, int var2,
      FileUnpacker var3, boolean var4,
      int var5, int var6) {
    DummyClass55.aClass153_1423 = var3;
    DummyClass22.anInt1741 = var2;
    GlobalStatics_9.anInt3463 = var1;
    GlobalStatics_6.aBoolean2311 = var4;
    GlobalStatics_9.anInt154 = 1;
    GlobalStatics_9.anInt546 = var6;
    if (!var0) {
      GlobalStatics_5.method2096(-8, 46, 45, -6L);
    }

    GlobalStatics_10.anInt3423 = var5;
  }

  public static boolean updateInterfaceCounter(int counter, byte var1) {
    GlobalStatics_9.interfaceCounter = counter + 1 & 0xffff;
    GlobalStatics_9.interfaceCounterUpdated = true;
    return true;
  }

  public static int compact(int var0, int var1) {
    var0 = (0xd5555555 & var0 >>> 1) + (0x55555555 & var0);
    var0 = ((0xcccccccc & var0) >>> 2) + (var0 & 0x33333333);
    var0 = 0xf0f0f0f & (var0 >>> 4) + var0;
    var0 += var0 >>> 8;
    var0 += var0 >>> 16;
    return 255 & var0;
  }

  public static void clear30(int var0) {
    GlobalStatics_5.anIntArrayArrayArray1903 = null;
    if (var0 == 0) {
      GlobalStatics_5.soundEffects = null;
    }
  }

  public static void drawScene(int var0, int var1, int var2, byte[][][] var3,
      int var4, byte var5,
      int var6, int var7) {
    ++GlobalStatics_9.anInt3539;
    GlobalStatics_8.anInt3 = 0;
    int var8 = var6 - 16; // 32
    int var9 = var6 + 16;
    int var10 = var7 - 16;
    int var11 = var7 + 16;

    int var14;
    int var15;
    int var29;
    for (int var12 = GLStatics.anInt3419;
        var12 < GLStatics.anInt2456; ++var12) {
      SceneGraphTile[][] var13 = GLStatics.sceneGraphTiles[var12];

      for (var14 = GLStatics.viewportLowerX; var14 < GLStatics.viewportUpperX;
          ++var14) {
        for (
            var15 = GLStatics.viewportLowerZ;
            var15 < GlobalStatics_9.viewportUpperZ; ++var15) {
          SceneGraphTile var16 = var13[var14][var15];
          if (var16 != null) {
            if (GLStatics.adjacentTileOnScreen[
                var14 - GLStatics.CAMERA_TILE_X
                    + GLStatics.CURRENT_VIEWPORT_SIZE][
                var15 - GLStatics.CAMERA_TILE_Y
                    + GLStatics.CURRENT_VIEWPORT_SIZE] && (var3 == null
                || var12 < var4
                || var3[var12][var14][var15] != var5)) {
              var16.aBoolean2222 = true;
              var16.aBoolean2225 = true;
              var16.aBoolean2236 = var16.anInt2223 > 0;

              ++GlobalStatics_8.anInt3;
            } else {
              var16.aBoolean2222 = false;
              var16.aBoolean2225 = false;
              var16.anInt2227 = 0;
              if (var14 >= var8 && var14 <= var9 && var15 >= var10
                  && var15 <= var11) {
                if (var16.aClass70_2234 != null) {
                  SceneSomething2 var17 = var16.aClass70_2234;
                  var17.sceneNode0
                      .method1867(0, var12, var17.positionY, var17.positionX,
                          var17.positionZ);
                  if (var17.sceneNode1 != null) {
                    var17.sceneNode1
                        .method1867(0, var12, var17.positionY, var17.positionX,
                            var17.positionZ);
                  }
                }

                if (var16.aClass19_2233 != null) {
                  SomethingSceneI var31 = var16.aClass19_2233;
                  var31.aClass140_429
                      .method1867(var31.anInt420, var12, var31.anInt425,
                          var31.anInt424, var31.anInt427);
                  if (var31.aClass140_423 != null) {
                    var31.aClass140_423
                        .method1867(var31.anInt420, var12, var31.anInt425,
                            var31.anInt424, var31.anInt427);
                  }
                }

                if (var16.aClass12_2230 != null) {
                  SomethingSceneJ var30 = var16.aClass12_2230;
                  var30.aClass140_320
                      .method1867(0, var12, var30.anInt326, var30.anInt324,
                          var30.anInt330);
                }

                if (var16.sceneGraphNodes != null) {
                  for (var29 = 0; var29 < var16.anInt2223; ++var29) {
                    SceneSomething var18 = var16.sceneGraphNodes[var29];
                    var18.sceneNode
                        .method1867(var18.anInt496, var12, var18.anInt489,
                            var18.anInt482, var18.anInt484);
                  }
                }
              }
            }
          }
        }
      }
    }

    boolean var22 = Arrays.deepEquals(GlobalStatics_4.heightMap,
        GlobalStatics_2.othrrHeightMap);

    if (GlRenderer.USE_OPENGL) {
      CommonGL.drawScene(var0, var1, var2, var22);
    }

    int var19;
    SceneGraphTile var21;
    int var20;
    int var23;
    SceneGraphTile[][] var27;
    int var34;
    int var32;
    for (var23 = GLStatics.anInt3419; var23 < GLStatics.anInt2456;
        ++var23) {
      var27 = GLStatics.sceneGraphTiles[var23];

      for (var15 = -GLStatics.CURRENT_VIEWPORT_SIZE; var15 <= 0; ++var15) {
        var32 = GLStatics.CAMERA_TILE_X + var15;
        var29 = GLStatics.CAMERA_TILE_X - var15;
        if (var32 >= GLStatics.viewportLowerX
            || var29 < GLStatics.viewportUpperX) {
          for (var34 = -GLStatics.CURRENT_VIEWPORT_SIZE; var34 <= 0; ++var34) {
            var19 = GLStatics.CAMERA_TILE_Y + var34;
            var20 = GLStatics.CAMERA_TILE_Y - var34;
            if (var32 >= GLStatics.viewportLowerX) {
              if (var19 >= GLStatics.viewportLowerZ) {
                var21 = var27[var32][var19];
                if (var21 != null && var21.aBoolean2222) {
                  GlobalStatics_10.drawSceneTile(var21, true);
                }
              }

              if (var20 < GlobalStatics_9.viewportUpperZ) {
                var21 = var27[var32][var20];
                if (var21 != null && var21.aBoolean2222) {
                  GlobalStatics_10.drawSceneTile(var21, true);
                }
              }
            }

            if (var29 < GLStatics.viewportUpperX) {
              if (var19 >= GLStatics.viewportLowerZ) {
                var21 = var27[var29][var19];
                if (var21 != null && var21.aBoolean2222) {
                  GlobalStatics_10.drawSceneTile(var21, true);
                }
              }

              if (var20 < GlobalStatics_9.viewportUpperZ) {
                var21 = var27[var29][var20];
                if (var21 != null && var21.aBoolean2222) {
                  GlobalStatics_10.drawSceneTile(var21, true);
                }
              }
            }

            if (GlobalStatics_8.anInt3 == 0) {
              if (!var22) {
                GlobalStatics_10.aBoolean3261 = false;
              }

              return;
            }
          }
        }
      }
    }

    for (var23 = GLStatics.anInt3419; var23 < GLStatics.anInt2456;
        ++var23) {
      var27 = GLStatics.sceneGraphTiles[var23];

      for (var15 = -GLStatics.CURRENT_VIEWPORT_SIZE; var15 <= 0; ++var15) {
        var32 = GLStatics.CAMERA_TILE_X + var15;
        var29 = GLStatics.CAMERA_TILE_X - var15;
        if (var32 >= GLStatics.viewportLowerX
            || var29 < GLStatics.viewportUpperX) {
          for (var34 = -GLStatics.CURRENT_VIEWPORT_SIZE; var34 <= 0; ++var34) {
            var19 = GLStatics.CAMERA_TILE_Y + var34;
            var20 = GLStatics.CAMERA_TILE_Y - var34;
            if (var32 >= GLStatics.viewportLowerX) {
              if (var19 >= GLStatics.viewportLowerZ) {
                var21 = var27[var32][var19];
                if (var21 != null && var21.aBoolean2222) {
                  GlobalStatics_10.drawSceneTile(var21, false);
                }
              }

              if (var20 < GlobalStatics_9.viewportUpperZ) {
                var21 = var27[var32][var20];
                if (var21 != null && var21.aBoolean2222) {
                  GlobalStatics_10.drawSceneTile(var21, false);
                }
              }
            }

            if (var29 < GLStatics.viewportUpperX) {
              if (var19 >= GLStatics.viewportLowerZ) {
                var21 = var27[var29][var19];
                if (var21 != null && var21.aBoolean2222) {
                  GlobalStatics_10.drawSceneTile(var21, false);
                }
              }

              if (var20 < GlobalStatics_9.viewportUpperZ) {
                var21 = var27[var29][var20];
                if (var21 != null && var21.aBoolean2222) {
                  GlobalStatics_10.drawSceneTile(var21, false);
                }
              }
            }

            if (GlobalStatics_8.anInt3 == 0) {
              if (!var22) {
                GlobalStatics_10.aBoolean3261 = false;
              }

              return;
            }
          }
        }
      }
    }

    GlobalStatics_10.aBoolean3261 = false;
  }

  public static GameString method1723(byte var0, boolean var1, int var2,
      int var3) {
    if (var2 >= 2 && var2 <= 36) {
      int var4 = 1;

      for (int var5 = var3 / var2; var5 != 0; ++var4) {
        var5 /= var2;
      }

      int var6 = var4;
      if (var3 < 0 || var1) {
        var6 = var4 + 1;
      }

      byte[] var7 = new byte[var6];
      if (var3 >= 0) {
        if (var1) {
          var7[0] = 43;
        }
      } else {
        var7[0] = 45;
      }

      for (int var8 = 0; var4 > var8; ++var8) {
        int var9 = var3 % var2;
        if (var9 < 0) {
          var9 = -var9;
        }

        if (var9 > 9) {
          var9 += 39;
        }

        var7[var6 - var8 - 1] = (byte) (48 + var9);
        var3 /= var2;
      }

      if (var0 >= -111) {
        GlobalStatics_5.method1727((byte) 53);
      }

      GameString var11 = new GameString();
      var11.bytes = var7;
      var11.length = var6;
      return var11;
    } else {
      throw new IllegalArgumentException("Invalid radix:" + var2);
    }
  }

  public static void method1724(int var0, int var1, int var2, int var3,
      int var4, int var5,
      byte var6, int var7) {
    if (var5 >= 128 && var2 >= 128 && var5 <= 13056 && var2 <= 13056) {
      int var8 = GlobalStatics_6
          .method1736(GlobalStatics_9.currentPlane, 1, var5, var2) - var3;
      var2 -= CameraStatics.CURRENT_Z;
      var8 -= CameraStatics.CURRENT_Y;
      var5 -= CameraStatics.CURRENT_X;
      int var9 = MathUtilities.SINE_TABLE[CameraStatics.CURRENT_PITCH];
      int var10 = MathUtilities.COSINE_TABLE[CameraStatics.CURRENT_PITCH];
      int var11 = MathUtilities.SINE_TABLE[CameraStatics.CURRENT_YAW];
      int var12 = MathUtilities.COSINE_TABLE[CameraStatics.CURRENT_YAW];
      int var13 = var5 * var12 + var11 * var2 >> 16;
      var2 = var2 * var12 - var11 * var5 >> 16;
      var5 = var13;
      var13 = var10 * var8 - var2 * var9 >> 16;
      if (var6 <= -47) {
        var2 = var2 * var10 + var8 * var9 >> 16;
        if (var2 < 50) {
          GlobalStatics_10.anInt2208 = -1;
          DummyClass34.anInt590 = -1;
        } else if (!GlRenderer.USE_OPENGL) {
          DummyClass34.anInt590 = (var5 << 9) / var2 + var0;
          GlobalStatics_10.anInt2208 = (var13 << 9) / var2 + var4;
        } else {
          int var14 = var1 * 512 >> 8;
          DummyClass34.anInt590 = var14 * var5 / var2 + var0;
          int var15 = 512 * var7 >> 8;
          GlobalStatics_10.anInt2208 = var15 * var13 / var2 + var4;
        }

      }
    } else {
      GlobalStatics_10.anInt2208 = -1;
      DummyClass34.anInt590 = -1;
    }
  }

  public static void method1726(int var0) {
    GlobalStatics_5.aClass94_1618 = null;
    GlobalStatics_5.aClass94_1620 = null;
    GlobalStatics_5.aClass94_1622 = null;
    GlobalStatics_5.aShortArrayArray1619 = null;
    GlobalStatics_5.aClass94_1617 = null;
    GlobalStatics_5.aClass94_1621 = null;
  }

  public static int method1727(byte var0) {
    if (var0 != 123) {
      GlobalStatics_5.method1726(-123);
    }

    return GlobalStatics_9.aClass93_1911.method1520(-12623);
  }
}
