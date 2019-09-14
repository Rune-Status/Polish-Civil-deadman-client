package com.jagex.runescape;

import com.jagex.runescape.opengl.GlRenderer;

public abstract class AbstractObjectNodeWrapper {

  public static GameString aClass94_1617 = GameString.create(")1a2)1m");
  public static GameString aClass94_1618 =
    GameString.create("Verbindung zum Update)2Server hergestellt)3");
  public static short[][] aShortArrayArray1619 = {
    {
      (short) 10, (short) 30, (short) 50, (short) 70, (short) 90, (short) 110, (short) 310,
      (short) 684, (short) 704, (short) 556, (short) 940, (short) 960, (short) 6454, (short) 6952,
      (short) 6972, (short) 2358, (short) 2732, (short) 2752, (short) 10550, (short) 10924,
      (short) 10944, (short) 10310, (short) 10556, (short) 10576, (short) 14646, (short) 15020,
      (short) 15040, (short) 19766, (short) 20140, (short) 20160, (short) -29386, (short) -29012,
      (short) -28992, (short) 31030, (short) 31276, (short) 31296, (short) -24266, (short) -23892,
      (short) -23872, (short) -19146, (short) -18772, (short) -18752, (short) -14026,
      (short) -13652, (short) -13632, (short) -6858, (short) -6484, (short) -6464, (short) 522,
      (short) 542, (short) 6794, (short) 6814, (short) 11018, (short) 11038, (short) 14986,
      (short) 15006, (short) 21130, (short) 21150, (short) -28918, (short) -28898, (short) -22006,
      (short) -21986, (short) -12918, (short) -12898, (short) 10, (short) 30, (short) 50,
      (short) 70, (short) 90, (short) 110, (short) 310, (short) 684, (short) 704, (short) 556,
      (short) 940, (short) 960, (short) 6454, (short) 6952, (short) 6972, (short) 2358,
      (short) 2732, (short) 2752, (short) 10550, (short) 10924, (short) 10944, (short) 10310,
      (short) 10556, (short) 10576, (short) 14646, (short) 15020, (short) 15040, (short) 19766,
      (short) 20140, (short) 20160, (short) -29386, (short) -29012, (short) -28992, (short) 31030,
      (short) 31276, (short) 31296, (short) -24266, (short) -23892, (short) -23872, (short) -19146,
      (short) -18772, (short) -18752, (short) -14026, (short) -13652, (short) -13632, (short) -6858,
      (short) -6484, (short) -6464, (short) 522, (short) 542, (short) 6794, (short) 6814,
      (short) 11018, (short) 11038, (short) 14986, (short) 15006, (short) 21130, (short) 21150,
      (short) -28918, (short) -28898, (short) -22006, (short) -21986, (short) -12918,
      (short) -12898, (short) 10, (short) 30, (short) 50, (short) 70, (short) 90, (short) 110,
      (short) 310, (short) 684, (short) 704, (short) 556, (short) 940, (short) 960, (short) 6454,
      (short) 6952, (short) 6972, (short) 2358, (short) 2732, (short) 2752, (short) 10550,
      (short) 10924, (short) 10944, (short) 10310, (short) 10556, (short) 10576, (short) 14646,
      (short) 15020, (short) 15040, (short) 19766, (short) 20140, (short) 20160, (short) -29386,
      (short) -29012, (short) -28992, (short) 31030, (short) 31276, (short) 31296, (short) -24266,
      (short) -23892, (short) -23872, (short) -19146, (short) -18772, (short) -18752,
      (short) -14026, (short) -13652, (short) -13632, (short) -6858, (short) -6484, (short) -6464,
      (short) 522, (short) 542, (short) 6794, (short) 6814, (short) 11018, (short) 11038,
      (short) 14986, (short) 15006, (short) 21130, (short) 21150, (short) -28918, (short) -28898,
      (short) -22006, (short) -21986, (short) -12918, (short) -12898, (short) 10, (short) 30,
      (short) 50, (short) 70, (short) 90, (short) 110, (short) 310, (short) 684, (short) 704,
      (short) 556, (short) 940, (short) 960, (short) 6454, (short) 6952, (short) 6972, (short) 2358,
      (short) 2732, (short) 2752, (short) 10550, (short) 10924, (short) 10944, (short) 10310,
      (short) 10556, (short) 10576, (short) 14646, (short) 15020, (short) 15040, (short) 19766,
      (short) 20140, (short) 20160, (short) -29386, (short) -29012, (short) -28992, (short) 31030,
      (short) 31276, (short) 31296, (short) -24266, (short) -23892, (short) -23872, (short) -19146,
      (short) -18772, (short) -18752, (short) -14026, (short) -13652, (short) -13632, (short) -6858,
      (short) -6484, (short) -6464, (short) 522, (short) 542, (short) 6794, (short) 6814,
      (short) 11018, (short) 11038, (short) 14986, (short) 15006, (short) 21130, (short) 21150,
      (short) -28918, (short) -28898, (short) -22006, (short) -21986, (short) -12918, (short) -12898
    }, {
    (short) 10, (short) 30, (short) 50, (short) 70, (short) 90, (short) 110, (short) 310,
    (short) 684, (short) 704, (short) 556, (short) 940, (short) 960, (short) 6454, (short) 6952,
    (short) 6972, (short) 2358, (short) 2732, (short) 2752, (short) 10550, (short) 10924,
    (short) 10944, (short) 10310, (short) 10556, (short) 10576, (short) 14646, (short) 15020,
    (short) 15040, (short) 19766, (short) 20140, (short) 20160, (short) -29386, (short) -29012,
    (short) -28992, (short) 31030, (short) 31276, (short) 31296, (short) -24266, (short) -23892,
    (short) -23872, (short) -19146, (short) -18772, (short) -18752, (short) -14026, (short) -13652,
    (short) -13632, (short) -6858, (short) -6484, (short) -6464, (short) 522, (short) 542,
    (short) 6794, (short) 6814, (short) 11018, (short) 11038, (short) 14986, (short) 15006,
    (short) 21130, (short) 21150, (short) -28918, (short) -28898, (short) -22006, (short) -21986,
    (short) -12918, (short) -12898, (short) 10, (short) 30, (short) 50, (short) 70, (short) 90,
    (short) 110, (short) 310, (short) 684, (short) 704, (short) 556, (short) 940, (short) 960,
    (short) 6454, (short) 6952, (short) 6972, (short) 2358, (short) 2732, (short) 2752,
    (short) 10550, (short) 10924, (short) 10944, (short) 10310, (short) 10556, (short) 10576,
    (short) 14646, (short) 15020, (short) 15040, (short) 19766, (short) 20140, (short) 20160,
    (short) -29386, (short) -29012, (short) -28992, (short) 31030, (short) 31276, (short) 31296,
    (short) -24266, (short) -23892, (short) -23872, (short) -19146, (short) -18772, (short) -18752,
    (short) -14026, (short) -13652, (short) -13632, (short) -6858, (short) -6484, (short) -6464,
    (short) 522, (short) 542, (short) 6794, (short) 6814, (short) 11018, (short) 11038,
    (short) 14986, (short) 15006, (short) 21130, (short) 21150, (short) -28918, (short) -28898,
    (short) -22006, (short) -21986, (short) -12918, (short) -12898, (short) 10, (short) 30,
    (short) 50, (short) 70, (short) 90, (short) 110, (short) 310, (short) 684, (short) 704,
    (short) 556, (short) 940, (short) 960, (short) 6454, (short) 6952, (short) 6972, (short) 2358,
    (short) 2732, (short) 2752, (short) 10550, (short) 10924, (short) 10944, (short) 10310,
    (short) 10556, (short) 10576, (short) 14646, (short) 15020, (short) 15040, (short) 19766,
    (short) 20140, (short) 20160, (short) -29386, (short) -29012, (short) -28992, (short) 31030,
    (short) 31276, (short) 31296, (short) -24266, (short) -23892, (short) -23872, (short) -19146,
    (short) -18772, (short) -18752, (short) -14026, (short) -13652, (short) -13632, (short) -6858,
    (short) -6484, (short) -6464, (short) 522, (short) 542, (short) 6794, (short) 6814,
    (short) 11018, (short) 11038, (short) 14986, (short) 15006, (short) 21130, (short) 21150,
    (short) -28918, (short) -28898, (short) -22006, (short) -21986, (short) -12918, (short) -12898,
    (short) 10347, (short) 10582, (short) 10429, (short) 10407, (short) 10359, (short) 8414,
    (short) 9540, (short) 10456, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
    (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
    (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
    (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
    (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
    (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
    (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
    (short) 0, (short) 0
  }, {
    (short) 10, (short) 30, (short) 50, (short) 70, (short) 90, (short) 110, (short) 310,
    (short) 684, (short) 704, (short) 556, (short) 940, (short) 960, (short) 6454, (short) 6952,
    (short) 6972, (short) 2358, (short) 2732, (short) 2752, (short) 10550, (short) 10924,
    (short) 10944, (short) 10310, (short) 10556, (short) 10576, (short) 14646, (short) 15020,
    (short) 15040, (short) 19766, (short) 20140, (short) 20160, (short) -29386, (short) -29012,
    (short) -28992, (short) 31030, (short) 31276, (short) 31296, (short) -24266, (short) -23892,
    (short) -23872, (short) -19146, (short) -18772, (short) -18752, (short) -14026, (short) -13652,
    (short) -13632, (short) -6858, (short) -6484, (short) -6464, (short) 522, (short) 542,
    (short) 6794, (short) 6814, (short) 11018, (short) 11038, (short) 14986, (short) 15006,
    (short) 21130, (short) 21150, (short) -28918, (short) -28898, (short) -22006, (short) -21986,
    (short) -12918, (short) -12898, (short) 10, (short) 30, (short) 50, (short) 70, (short) 90,
    (short) 110, (short) 310, (short) 684, (short) 704, (short) 556, (short) 940, (short) 960,
    (short) 6454, (short) 6952, (short) 6972, (short) 2358, (short) 2732, (short) 2752,
    (short) 10550, (short) 10924, (short) 10944, (short) 10310, (short) 10556, (short) 10576,
    (short) 14646, (short) 15020, (short) 15040, (short) 19766, (short) 20140, (short) 20160,
    (short) -29386, (short) -29012, (short) -28992, (short) 31030, (short) 31276, (short) 31296,
    (short) -24266, (short) -23892, (short) -23872, (short) -19146, (short) -18772, (short) -18752,
    (short) -14026, (short) -13652, (short) -13632, (short) -6858, (short) -6484, (short) -6464,
    (short) 522, (short) 542, (short) 6794, (short) 6814, (short) 11018, (short) 11038,
    (short) 14986, (short) 15006, (short) 21130, (short) 21150, (short) -28918, (short) -28898,
    (short) -22006, (short) -21986, (short) -12918, (short) -12898, (short) 10, (short) 30,
    (short) 50, (short) 70, (short) 90, (short) 110, (short) 310, (short) 684, (short) 704,
    (short) 556, (short) 940, (short) 960, (short) 6454, (short) 6952, (short) 6972, (short) 2358,
    (short) 2732, (short) 2752, (short) 10550, (short) 10924, (short) 10944, (short) 10310,
    (short) 10556, (short) 10576, (short) 14646, (short) 15020, (short) 15040, (short) 19766,
    (short) 20140, (short) 20160, (short) -29386, (short) -29012, (short) -28992, (short) 31030,
    (short) 31276, (short) 31296, (short) -24266, (short) -23892, (short) -23872, (short) -19146,
    (short) -18772, (short) -18752, (short) -14026, (short) -13652, (short) -13632, (short) -6858,
    (short) -6484, (short) -6464, (short) 522, (short) 542, (short) 6794, (short) 6814,
    (short) 11018, (short) 11038, (short) 14986, (short) 15006, (short) 21130, (short) 21150,
    (short) -28918, (short) -28898, (short) -22006, (short) -21986, (short) -12918, (short) -12898,
    (short) 10, (short) 30, (short) 50, (short) 70, (short) 90, (short) 110, (short) 310,
    (short) 684, (short) 704, (short) 556, (short) 940, (short) 960, (short) 6454, (short) 6952,
    (short) 6972, (short) 2358, (short) 2732, (short) 2752, (short) 10550, (short) 10924,
    (short) 10944, (short) 10310, (short) 10556, (short) 10576, (short) 14646, (short) 15020,
    (short) 15040, (short) 19766, (short) 20140, (short) 20160, (short) -29386, (short) -29012,
    (short) -28992, (short) 31030, (short) 31276, (short) 31296, (short) -24266, (short) -23892,
    (short) -23872, (short) -19146, (short) -18772, (short) -18752, (short) -14026, (short) -13652,
    (short) -13632, (short) -6858, (short) -6484, (short) -6464, (short) 522, (short) 542,
    (short) 6794, (short) 6814, (short) 11018, (short) 11038, (short) 14986, (short) 15006,
    (short) 21130, (short) 21150, (short) -28918, (short) -28898, (short) -22006, (short) -21986,
    (short) -12918, (short) -12898
  }, {
    (short) 4300, (short) 3294, (short) 3303, (short) 3264, (short) 4506, (short) 4382,
    (short) 4387, (short) 5293, (short) 7622, (short) 7384, (short) 8412, (short) 7496, (short) 86,
    (short) 123, (short) 111, (short) 99, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
    (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
    (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
    (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
    (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
    (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
    (short) 0, (short) 0, (short) 0, (short) 10, (short) 30, (short) 50, (short) 70, (short) 90,
    (short) 110, (short) 310, (short) 684, (short) 704, (short) 556, (short) 940, (short) 960,
    (short) 6454, (short) 6952, (short) 6972, (short) 2358, (short) 2732, (short) 2752,
    (short) 10550, (short) 10924, (short) 10944, (short) 10310, (short) 10556, (short) 10576,
    (short) 14646, (short) 15020, (short) 15040, (short) 19766, (short) 20140, (short) 20160,
    (short) -29386, (short) -29012, (short) -28992, (short) 31030, (short) 31276, (short) 31296,
    (short) -24266, (short) -23892, (short) -23872, (short) -19146, (short) -18772, (short) -18752,
    (short) -14026, (short) -13652, (short) -13632, (short) -6858, (short) -6484, (short) -6464,
    (short) 522, (short) 542, (short) 6794, (short) 6814, (short) 11018, (short) 11038,
    (short) 14986, (short) 15006, (short) 21130, (short) 21150, (short) -28918, (short) -28898,
    (short) -22006, (short) -21986, (short) -12918, (short) -12898, (short) 10, (short) 30,
    (short) 50, (short) 70, (short) 90, (short) 110, (short) 310, (short) 684, (short) 704,
    (short) 556, (short) 940, (short) 960, (short) 6454, (short) 6952, (short) 6972, (short) 2358,
    (short) 2732, (short) 2752, (short) 10550, (short) 10924, (short) 10944, (short) 10310,
    (short) 10556, (short) 10576, (short) 14646, (short) 15020, (short) 15040, (short) 19766,
    (short) 20140, (short) 20160, (short) -29386, (short) -29012, (short) -28992, (short) 31030,
    (short) 31276, (short) 31296, (short) -24266, (short) -23892, (short) -23872, (short) -19146,
    (short) -18772, (short) -18752, (short) -14026, (short) -13652, (short) -13632, (short) -6858,
    (short) -6484, (short) -6464, (short) 522, (short) 542, (short) 6794, (short) 6814,
    (short) 11018, (short) 11038, (short) 14986, (short) 15006, (short) 21130, (short) 21150,
    (short) -28918, (short) -28898, (short) -22006, (short) -21986, (short) -12918, (short) -12898,
    (short) 13766, (short) 13745, (short) 13726, (short) 13890, (short) 13743, (short) 13852,
    (short) 17602, (short) 18605, (short) 21660, (short) 24000, (short) 24997, (short) 24088,
    (short) 27972, (short) 25903, (short) 26904, (short) 27193, (short) 27175, (short) 27156,
    (short) 30020, (short) 28975, (short) 29976, (short) 12482, (short) 13485, (short) 10392,
    (short) 10692, (short) 10669, (short) 10776, (short) 6717, (short) 6695, (short) 7830,
    (short) 6971, (short) 6951, (short) 5910, (short) 3389, (short) 3369, (short) 3356, (short) 0,
    (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
    (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
    (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
    (short) 0, (short) 0, (short) 0
  }, {
    (short) 10, (short) 30, (short) 50, (short) 70, (short) 90, (short) 110, (short) 310,
    (short) 684, (short) 704, (short) 556, (short) 940, (short) 960, (short) 6454, (short) 6952,
    (short) 6972, (short) 2358, (short) 2732, (short) 2752, (short) 10550, (short) 10924,
    (short) 10944, (short) 10310, (short) 10556, (short) 10576, (short) 14646, (short) 15020,
    (short) 15040, (short) 19766, (short) 20140, (short) 20160, (short) -29386, (short) -29012,
    (short) -28992, (short) 31030, (short) 31276, (short) 31296, (short) -24266, (short) -23892,
    (short) -23872, (short) -19146, (short) -18772, (short) -18752, (short) -14026, (short) -13652,
    (short) -13632, (short) -6858, (short) -6484, (short) -6464, (short) 522, (short) 542,
    (short) 6794, (short) 6814, (short) 11018, (short) 11038, (short) 14986, (short) 15006,
    (short) 21130, (short) 21150, (short) -28918, (short) -28898, (short) -22006, (short) -21986,
    (short) -12918, (short) -12898, (short) 10, (short) 30, (short) 50, (short) 70, (short) 90,
    (short) 110, (short) 310, (short) 684, (short) 704, (short) 556, (short) 940, (short) 960,
    (short) 6454, (short) 6952, (short) 6972, (short) 2358, (short) 2732, (short) 2752,
    (short) 10550, (short) 10924, (short) 10944, (short) 10310, (short) 10556, (short) 10576,
    (short) 14646, (short) 15020, (short) 15040, (short) 19766, (short) 20140, (short) 20160,
    (short) -29386, (short) -29012, (short) -28992, (short) 31030, (short) 31276, (short) 31296,
    (short) -24266, (short) -23892, (short) -23872, (short) -19146, (short) -18772, (short) -18752,
    (short) -14026, (short) -13652, (short) -13632, (short) -6858, (short) -6484, (short) -6464,
    (short) 522, (short) 542, (short) 6794, (short) 6814, (short) 11018, (short) 11038,
    (short) 14986, (short) 15006, (short) 21130, (short) 21150, (short) -28918, (short) -28898,
    (short) -22006, (short) -21986, (short) -12918, (short) -12898, (short) 10, (short) 30,
    (short) 50, (short) 70, (short) 90, (short) 110, (short) 310, (short) 684, (short) 704,
    (short) 556, (short) 940, (short) 960, (short) 6454, (short) 6952, (short) 6972, (short) 2358,
    (short) 2732, (short) 2752, (short) 10550, (short) 10924, (short) 10944, (short) 10310,
    (short) 10556, (short) 10576, (short) 14646, (short) 15020, (short) 15040, (short) 19766,
    (short) 20140, (short) 20160, (short) -29386, (short) -29012, (short) -28992, (short) 31030,
    (short) 31276, (short) 31296, (short) -24266, (short) -23892, (short) -23872, (short) -19146,
    (short) -18772, (short) -18752, (short) -14026, (short) -13652, (short) -13632, (short) -6858,
    (short) -6484, (short) -6464, (short) 522, (short) 542, (short) 6794, (short) 6814,
    (short) 11018, (short) 11038, (short) 14986, (short) 15006, (short) 21130, (short) 21150,
    (short) -28918, (short) -28898, (short) -22006, (short) -21986, (short) -12918, (short) -12898,
    (short) 10, (short) 30, (short) 50, (short) 70, (short) 90, (short) 110, (short) 310,
    (short) 684, (short) 704, (short) 556, (short) 940, (short) 960, (short) 6454, (short) 6952,
    (short) 6972, (short) 2358, (short) 2732, (short) 2752, (short) 10550, (short) 10924,
    (short) 10944, (short) 10310, (short) 10556, (short) 10576, (short) 14646, (short) 15020,
    (short) 15040, (short) 19766, (short) 20140, (short) 20160, (short) -29386, (short) -29012,
    (short) -28992, (short) 31030, (short) 31276, (short) 31296, (short) -24266, (short) -23892,
    (short) -23872, (short) -19146, (short) -18772, (short) -18752, (short) -14026, (short) -13652,
    (short) -13632, (short) -6858, (short) -6484, (short) -6464, (short) 522, (short) 542,
    (short) 6794, (short) 6814, (short) 11018, (short) 11038, (short) 14986, (short) 15006,
    (short) 21130, (short) 21150, (short) -28918, (short) -28898, (short) -22006, (short) -21986,
    (short) -12918, (short) -12898
  }
  };
  public static GameString aClass94_1620 = GameString.create("Cach-B");
  public static GameString aClass94_1621 = GameString.create("Chargement des polices )2 ");
  public static GameString aClass94_1622 = GameString.create("Card:");
  public static int anInt1623;

  public abstract AbstractObjectNode wrap(AbstractObjectNode var1);

  public static GameString method1723(byte var0, boolean var1, int var2, int var3) {
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
          if ((var9 < 0)) {
            var9 = -var9;
          }

          if ((var9 > 10 -1)) {
            var9 += 39;
          }

          var7[var6 + -var8 + -1] = (byte) (48 + var9);
          var3 /= var2;
        }

        if (var0 >= -111) {
          AbstractObjectNodeWrapper.method1727((byte) 53);
        }

        GameString var11 = new GameString();
        var11.bytes = var7;
        var11.length = var6;
        return var11;
      } else {
        throw new IllegalArgumentException("Invalid radix:" + var2);
      }
  }

  public static void method1724(int var0, int var1, int var2, int var3, int var4, int var5,
                               byte var6, int var7) {
    if (var5 >= 128 && (var2 >= 129 -1) && (var5 <= 13057 -1) && (var2 <= 13057 -1)) {
        int var8 = BufferData.method1736(GameWorldSomething.currentPlane, 1, var5, var2) + -var3;
        var2 -= DummyClass49.anInt1111;
        var8 -= EnumStringFetcher.anInt2162;
        var5 -= NPC.anInt3995;
        int var9 = DummyClass40.SINE_TABLE[DummyClass17.anInt1823];
        int var10 = DummyClass40.COSINE_TABLE[DummyClass17.anInt1823];
        int var11 = DummyClass40.SINE_TABLE[TextureSampler28.anInt3315];
        int var12 = DummyClass40.COSINE_TABLE[TextureSampler28.anInt3315];
        int var13 = var5 * var12 + var11 * var2 >> 16;
        var2 = var2 * var12 + -(var11 * var5) >> 16;
        var5 = var13;
        var13 = var10 * var8 - var2 * var9 >> 16;
        if (var6 <= -47) {
          var2 = var2 * var10 + var8 * var9 >> 16;
          if (var2 < 50) {
            WidgetAccess.anInt2208 = -1;
            DummyClass34.anInt590 = -1;
          } else if (!GlRenderer.useOpenGlRenderer) {
            DummyClass34.anInt590 = (var5 << 9) / var2 + var0;
            WidgetAccess.anInt2208 = (var13 << 9) / var2 + var4;
          } else {
            int var14 = var1 * 512 >> 8;
            DummyClass34.anInt590 = var14 * var5 / var2 + var0;
            int var15 = 512 * var7 >> 8;
            WidgetAccess.anInt2208 = var15 * var13 / var2 + var4;
          }

        }
      } else {
        WidgetAccess.anInt2208 = -1;
        DummyClass34.anInt590 = -1;
      }
  }

  public static void method1726(int var0) {
    AbstractObjectNodeWrapper.aClass94_1618 = null;
      AbstractObjectNodeWrapper.aClass94_1620 = null;
      AbstractObjectNodeWrapper.aClass94_1622 = null;
      AbstractObjectNodeWrapper.aShortArrayArray1619 = null;
      AbstractObjectNodeWrapper.aClass94_1617 = null;
      AbstractObjectNodeWrapper.aClass94_1621 = null;
  }

  public static int method1727(byte var0) {
    if (var0 != 123) {
        AbstractObjectNodeWrapper.method1726(-123);
      }

      return Keyboard.aClass93_1911.method1520(-12623);
  }

}
