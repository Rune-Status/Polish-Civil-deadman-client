package com.jagex.runescape.statics;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.buffer.BufferStatics;
import com.jagex.runescape.cache.FileUnpacker;
import com.jagex.runescape.camera.CameraStatics;
import com.jagex.runescape.common.ArrayUtils;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.common.HashTable;
import com.jagex.runescape.common.ThreadUtilities;
import com.jagex.runescape.common.TimeUtilities;
import com.jagex.runescape.image_producer.AbstractImageProducerStatics;
import com.jagex.runescape.input.Keyboard;
import com.jagex.runescape.input.KeyboardStatics;
import com.jagex.runescape.input.MouseStatics;
import com.jagex.runescape.input.MouseWheelStatics;
import com.jagex.runescape.model.AbstractAudioOutputStream;
import com.jagex.runescape.model.AbstractDirectColorSprite;
import com.jagex.runescape.model.AbstractFont;
import com.jagex.runescape.model.AbstractFrameRegulator;
import com.jagex.runescape.image_producer.AbstractImageProducer;
import com.jagex.runescape.model.AnimationSequence;
import com.jagex.runescape.model.AnimationSomething;
import com.jagex.runescape.model.AreaSoundEffect;
import com.jagex.runescape.sound.audio.AudioStreamEncoder1;
import com.jagex.runescape.sound.audio.AudioStreamEncoder2;
import com.jagex.runescape.sound.audio.AudioStreamEncoder4;
import com.jagex.runescape.model.BitVariable;
import com.jagex.runescape.model.BufferedFile;
import com.jagex.runescape.model.ByteArrayNode;
import com.jagex.runescape.model.Cache;
import com.jagex.runescape.model.ClassCheckRequest;
import com.jagex.runescape.model.ClientScriptCall;
import com.jagex.runescape.model.CollisionMap;
import com.jagex.runescape.model.Cursor;
import com.jagex.runescape.model.DisplayMode;
import com.jagex.runescape.model.FileOnDisk;
import com.jagex.runescape.model.FloorOverlay;
import com.jagex.runescape.model.FloorUnderlay;
import com.jagex.runescape.model.GameBuffer;
import com.jagex.runescape.model.GameClient;
import com.jagex.runescape.model.GameObjectConfig;
import com.jagex.runescape.model.GameWorld;
import com.jagex.runescape.model.HintMarker;
import com.jagex.runescape.model.Interface4;
import com.jagex.runescape.model.Inventory;
import com.jagex.runescape.model.ItemConfig;
import com.jagex.runescape.model.MapScene;
import com.jagex.runescape.model.Mobile;
import com.jagex.runescape.model.Model;
import com.jagex.runescape.model.NPC;
import com.jagex.runescape.model.NpcConfiguration;
import com.jagex.runescape.model.ObjectCache;
import com.jagex.runescape.model.Player;
import com.jagex.runescape.model.PlayerVariable;
import com.jagex.runescape.common.Queue;
import com.jagex.runescape.model.RenderAnimation;
import com.jagex.runescape.model.ScriptState;
import com.jagex.runescape.model.SignLink;
import com.jagex.runescape.model.SignLinkRequest;
import com.jagex.runescape.model.SocketStream;
import com.jagex.runescape.model.SoftwareDirectColorSprite;
import com.jagex.runescape.model.SoftwareDirectFullColorSprite;
import com.jagex.runescape.model.SoftwareFont;
import com.jagex.runescape.model.SomethingFont;
import com.jagex.runescape.model.SomethingLight0;
import com.jagex.runescape.model.SomethingOtherWorldMap;
import com.jagex.runescape.model.SomethingPacket151;
import com.jagex.runescape.model.SomethingQuickChat;
import com.jagex.runescape.model.SomethingQuickChatK;
import com.jagex.runescape.model.SomethingTexture3;
import com.jagex.runescape.model.SomethingWorldMapy;
import com.jagex.runescape.model.SpawnedGameObject;
import com.jagex.runescape.model.SpotAnimationConfig;
import com.jagex.runescape.model.Structure;
import com.jagex.runescape.model.TextureCache;
import com.jagex.runescape.model.TriChromaticImageBuffer;
import com.jagex.runescape.model.Unsure;
import com.jagex.runescape.model.VariableUpdate;
import com.jagex.runescape.model.Widget;
import com.jagex.runescape.model.WidgetUpdate;
import com.jagex.runescape.model.WorldMapLabel;
import com.jagex.runescape.node.Deque;
import com.jagex.runescape.node.Node;
import com.jagex.runescape.opengl.GLStatics;
import com.jagex.runescape.opengl.GlDirectColorSprite;
import com.jagex.runescape.opengl.GlDirectFullColorSprite;
import com.jagex.runescape.opengl.GlEnvironment;
import com.jagex.runescape.opengl.GlFont;
import com.jagex.runescape.opengl.GlIndexedColorSprite;
import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.GlTexture2d;
import com.jagex.runescape.opengl.GlUtils;
import com.jagex.runescape.opengl.MaterialShader;
import com.jagex.runescape.opengl.SomethingGl0;
import com.jagex.runescape.opengl.Texture;
import com.jagex.runescape.scene.SceneGraphTile;
import com.jagex.runescape.scene.SceneSomething;
import com.jagex.runescape.scene.SceneStatics;
import com.jagex.runescape.scene.SomethingSceneI;
import com.jagex.runescape.scene.SomethingSceneTile;
import com.jagex.runescape.settings.SettingsStatics;
import com.jagex.runescape.sound.midi.MidiFile;
import com.jagex.runescape.sound.midi.MidiInstrumentStatics;
import com.jagex.runescape.sound.midi.MidiSomething;
import com.jagex.runescape.sound.midi.MidiSomethingStatics;
import com.jagex.runescape.sound.midi.SomethingMidiFile0Statics;
import com.jagex.runescape.sound.midi.SomethingMidiIStatics;
import com.jagex.runescape.sound.SomethingMusic0;
import com.jagex.runescape.sound.effect.SomethingSoundEffectStatics;
import com.jagex.runescape.sound.effect.SoundEffect;
import com.jagex.runescape.sprite.AbstractIndexedColorSprite;
import com.jagex.runescape.sprite.SoftwareIndexedColorSprite;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.Objects;
import java.util.Random;

public class GlobalStatics_9 {

  public static final Hashtable CACHED_FILES = new Hashtable(16);
  public static int IS_ON_TUTORIAL_ISLAND;
  public static int deltaTime = 20;
  public static AbstractAudioOutputStream audioOutputStream0;
  public static int currentPlane;
  public static int anInt502;
  public static int anInt503;
  public static short aShort505 = 1;
  public static int anInt506;
  public static int[] anIntArray509 = new int[5];
  public static int[] anIntArray2929 = new int[1000];
  public static int[] anIntArray2931;
  public static int[] anIntArray2933 = {2, 0, 0, 2, 0, 0, 0, 4, 4};
  public static int viewHeight;
  public static int anInt2937;
  public static int anInt2938;
  public static FileUnpacker fileUnpacker24;
  public static boolean aBoolean3668;
  public static byte[][] updatedMapsData;
  public static int anInt3670;
  public static boolean[] aBooleanArray3674 = new boolean[100];
  public static int anInt3677;
  public static AbstractDirectColorSprite aClass3_Sub28_Sub16_812;
  public static boolean[][] tileOnScreen;
  public static int anInt815;
  public static int anInt816;
  public static int anInt817;
  public static Cache aClass47_818 = new Cache(64);
  public static int anInt819;
  public static ObjectCache aClass93_1131 = new ObjectCache(5);
  public static ObjectCache aClass93_1135 = new ObjectCache(4);
  public static AbstractDirectColorSprite[] aClass3_Sub28_Sub16Array1136;
  public static int[] anIntArray1138;
  public static int anInt1345;
  public static int p11FontFileId;
  public static int loadingState;
  public static int anInt1357;
  public static int anInt1358;
  public static int anInt1361;
  public static int anInt467;
  public static int lastPacketId2;
  public static int anInt472;
  public static Deque aClass61_2468 = new Deque();
  public static int[] anIntArray2469;
  public static int[] anIntArray2470 = {0, 0, 2, 0, 0, 2, 1, 1, 0};
  public static int anInt2471;
  public static short[] aShortArray2548;
  public static int anInt2549;
  public static int[] anIntArray2550 = new int[50];
  public static AbstractFrameRegulator frameRateRegulator;
  public static int fogColor;
  public static GameString aClass94_3653 = GameStringStatics
      .create("Shift)2click disabled)3");
  public static short[][] aShortArrayArray3654 = {
      {
          (short) 6798, (short) 107, (short) 10283, (short) 16, (short) 4797,
          (short) 7744,
          (short) 5799, (short) 4634, (short) -31839, (short) 22433,
          (short) 2983, (short) -11343,
          (short) 8, (short) 5281, (short) 10438, (short) 3650, (short) -27322,
          (short) -21845,
          (short) 200, (short) 571, (short) 908, (short) 21830, (short) 28946,
          (short) -15701,
          (short) -14010
      }, {
      (short) 8741, (short) 12, (short) -1506, (short) -22374, (short) 7735,
      (short) 8404,
      (short) 1701, (short) -27106, (short) 24094, (short) 10153, (short) -8915,
      (short) 4783,
      (short) 1341, (short) 16578, (short) -30533, (short) 25239, (short) 8,
      (short) 5281,
      (short) 10438, (short) 3650, (short) -27322, (short) -21845, (short) 200,
      (short) 571,
      (short) 908, (short) 21830, (short) 28946, (short) -15701, (short) -14010
  }, {
      (short) 25238, (short) 8742, (short) 12, (short) -1506, (short) -22374,
      (short) 7735,
      (short) 8404, (short) 1701, (short) -27106, (short) 24094, (short) 10153,
      (short) -8915,
      (short) 4783, (short) 1341, (short) 16578, (short) -30533, (short) 8,
      (short) 5281,
      (short) 10438, (short) 3650, (short) -27322, (short) -21845, (short) 200,
      (short) 571,
      (short) 908, (short) 21830, (short) 28946, (short) -15701, (short) -14010
  }, {(short) 4626, (short) 11146, (short) 6439, (short) 12, (short) 4758,
      (short) 10270}, {
      (short) 4550, (short) 4537, (short) 5681, (short) 5673, (short) 5790,
      (short) 6806,
      (short) 8076, (short) 4574
  }
  };
  public static int anInt3655 = -1;
  public static int anInt969;
  public static int anInt1906;
  public static int anInt1908;
  public static int anInt1909;
  public static int anInt1910;
  public static ObjectCache aClass93_1911 = new ObjectCache(260);
  public static int openingMusicFileId;
  public static int anInt1914;
  public static FileUnpacker sprites;
  public static int anInt1918;
  public static Cache aClass47_480 = new Cache(16);
  public static int anInt486 = 5063219;
  public static int anInt494;
  public static int anInt497;
  public static int[][] anIntArrayArray499 = {
      new int[0], {128, 0, 128, 128, 0, 128}, {0, 0, 128, 0, 128, 128, 64, 128},
      {0, 128, 0, 0, 128, 0, 64, 128}, {0, 0, 64, 128, 0, 128},
      {128, 128, 64, 128, 128, 0},
      {64, 0, 128, 0, 128, 128, 64, 128},
      {128, 0, 128, 128, 0, 128, 0, 64, 64, 0},
      {0, 0, 64, 0, 0, 64}, {0, 0, 128, 0, 128, 128, 64, 96, 32, 64},
      {0, 128, 0, 0, 32, 64, 64, 96, 128, 128},
      {0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128}
  };
  public static FileUnpacker animationBases;
  public static int primaryPort;
  public static int anInt3775;
  public static Cache aClass47_3776 = new Cache(64);
  public static boolean aBoolean3779;
  public static int[] anIntArray3780 = new int[32];
  public static ObjectCache aClass93_2604 = new ObjectCache(64);
  public static GameString COMMAND_DROP_JS5 = GameStringStatics
      .create("::clientjs5drop");
  public static int[] anIntArray2606;
  public static int anInt2607;
  public static int anInt3640;
  public static boolean aBoolean3641;
  public static int anInt3642;
  public static int anInt3644;
  public static AbstractDirectColorSprite aClass3_Sub28_Sub16_895;
  public static int[] variables = new int[2500];
  public static int anInt900;
  public static int anInt902 = 100;
  public static int anInt903;
  public static int[] anIntArray904 = new int[200];
  public static int anInt906;
  public static int pitchCosine;
  public static int anInt1038;
  public static BufferedFile uidFile;
  public static boolean aBoolean1040;
  public static int anInt1042;
  public static FileUnpacker aClass153_1043;
  public static int anInt59;
  public static short[] aShortArray63 =
      {(short) 960, (short) 957, (short) -21568, (short) -21571, (short) 22464};
  public static int anInt65;
  public static boolean aBoolean66;
  public static MaterialShader[] anInterface5Array70;
  public static MidiFile aClass3_Sub27_1154;
  public static int anInt1156;
  public static boolean aBoolean1158;
  public static int anInt2684;
  public static Cache aClass47_2686 = new Cache(128);
  public static int anInt2689;
  public static AbstractDirectColorSprite[] aClass3_Sub28_Sub16Array2690;
  public static int anInt2693;
  public static Image anImage2695;
  public static int[] anIntArray2696 = new int[2];
  public static int CAMERA_X;
  public static int anInt2756;
  public static int anInt2770;
  public static boolean aBoolean2774 = true;
  public static ObjectCache aClass93_2792 = new ObjectCache(64);
  public static int[] quady1 = new int[100];
  public static AbstractDirectColorSprite[] aClass3_Sub28_Sub16Array2839;
  public static ScriptState[] aClass54Array2841 = new ScriptState[50];
  public static int affiliateId;
  public static int anInt2556;
  public static Deque aClass61_2557 = new Deque();
  public static boolean tweening;
  public static int[] anIntArray2559 = {0, 1, 2, 3, 4, 5, 6, 14};
  public static AbstractDirectColorSprite aClass3_Sub28_Sub16_2560;
  public static int anInt2561 = -1;
  public static AudioStreamEncoder2 aClass3_Sub24_Sub2_2563;
  public static int[] anIntArray1920;
  public static int anInt1921;
  public static GameString aClass94_1922 = GameStringStatics.create("weiss:");
  public static int anInt1923;
  public static int anInt1924;
  public static int anInt1925;
  public static int anInt1926;
  public static ObjectCache aClass93_1569 = new ObjectCache(200);
  public static BufferedFile tableIndexFile;
  public static long[] aLongArray1574 = new long[100];
  public static int[] anIntArray1578 = new int[500];
  public static ObjectCache aClass93_1013 = new ObjectCache(100);
  public static byte[][][] SCENE_SHADOW;
  public static Widget aClass11_1017;
  public static boolean aBoolean3975;
  public static AbstractDirectColorSprite[] aClass3_Sub28_Sub16Array3977;
  public static float aFloat3979;
  public static int[] anIntArray3986 = new int[32];
  public static FileUnpacker fileUnpacker17;
  public static FileUnpacker fileUnpacker15;
  public static int[] anIntArray3997 = {19, 55, 38, 155, 255, 110, 137, 205,
      76};
  public static int runesFileId;
  public static int anInt4002;
  public static int anInt1252 = -1;
  public static int[] anIntArray1277 = new int[2000];
  public static GameString aClass94_1294 =
      GameStringStatics
          .create("Votre liste noire est pleine (X100 noms maximum(Y)3");
  public static int anInt1297;
  public static int anInt1325;
  public static byte[][][] tileOrientation;
  public static int anInt1330;
  public static ObjectCache aClass93_4043 = new ObjectCache(64);
  public static HashTable aClass130_4046 = new HashTable(16);
  public static FileUnpacker models;
  public static int[] anIntArray4050 = new int[1000];
  public static ObjectCache aClass93_4051 = new ObjectCache(30);
  public static int anInt4065;
  public static boolean aBoolean4068 = true;
  public static SceneGraphTile[][][] tiles;
  public static int anInt4073;
  public static int anInt994;
  public static GameString aClass94_995 = GameStringStatics.create("(Y<)4col>");
  public static AbstractDirectColorSprite[] aClass3_Sub28_Sub16Array996;
  public static int anInt997;
  public static int anInt998;
  public static int anInt999 = -1;
  public static int anInt1002;
  public static int anInt3615;
  public static Calendar aCalendar3616 = Calendar.getInstance();
  public static int anInt3618;
  public static int anInt3623;
  public static int CURRENT_KEY;
  public static int[] anIntArray3951 = new int[4];
  public static byte aByte3953;
  public static int[] quady0 = new int[100];
  public static int[] anIntArray3959 = new int[2];
  public static GameString LABELS = GameStringStatics.create("_labels");
  public static int[] anIntArray859;
  public static int[] anIntArray861;
  public static boolean aBoolean554;
  public static int anInt555;
  public static FileUnpacker aClass153_557;
  public static int[][][] anIntArrayArrayArray558;
  public static int mouseWheelOffset;
  public static int anInt562;
  public static ObjectCache aClass93_1146 = new ObjectCache(64);
  public static int anInt1150 = -1;
  public static int REGION_BASE_Y;
  public static int anInt2894;
  public static int anInt2901;
  public static int anInt2905;
  public static FileUnpacker globalQuickchats;
  public static int[] anIntArray356 = {1, 0, -1, 0};
  public static int anInt377;
  public static int headIconsPrayerFileId;
  public static byte[][][] aByteArrayArrayArray383;
  public static int anInt384;
  public static int anInt396;
  public static boolean interfaceCounterUpdated;
  public static AbstractIndexedColorSprite[] aClass109Array1831;
  public static int[] anIntArray1833 = new int[14];
  public static Widget[][] aClass11ArrayArray1834;
  public static int[] anIntArray1835 = new int[100];
  public static Widget[] aClass11Array1836;
  public static boolean aBoolean1837;
  public static int[] anIntArray1838;
  public static SoftwareDirectColorSprite[] aClass3_Sub28_Sub16_Sub2Array1839;
  public static int anInt1771;
  public static ObjectCache aClass93_1772 = new ObjectCache(64);
  public static byte[][][] aByteArrayArrayArray1774;
  public static int anInt1776;
  public static SignLinkRequest aClass64_1778;
  public static short[] aShortArray1779 = new short[256];
  public static int anInt1780;
  public static int windowHeight;
  public static double aDouble1050 = -1.0;
  public static int anInt1053;
  public static SomethingQuickChatK aClass10_1056;
  public static FileUnpacker fileUnpacker21;
  public static int anInt1060;
  public static int amountFloors;
  public static int anInt872;
  public static int anInt876;
  public static FileUnpacker configs;
  public static String aString1209;
  public static String aString1196;
  public static String formattedOsName;
  public static String aString1205;
  public static String aString1210;
  public static int anInt1214 = 1;
  public static String aString1216;
  public static String aString1218;
  public static Method aMethod1220;
  public static Method setFocusTraversalKeyEnabledMethod;
  public static volatile long aLong1221;
  public static AbstractImageProducer viewImageProducer;
  public static short[] aShortArray3011 =
      {(short) 6798, (short) 8741, (short) 25238, (short) 4626, (short) 4550};
  public static int anInt3012;
  public static int anInt3017;
  public static SomethingFont aClass33_3019;
  public static int anInt3020;
  public static byte[][] aByteArrayArray3027;
  public static int[] anIntArray2048;
  public static int anInt2050;
  public static int anInt2051;
  public static Widget aClass11_2055;
  public static Model[] aClass140_Sub5Array2058 = new Model[4];
  public static int anInt2059;
  public static int anInt1996;
  public static SoftwareFont aClass3_Sub28_Sub17_Sub1_2000;
  public static SceneGraphTile[][][] aClass3_Sub2ArrayArrayArray2065;
  public static int[] anIntArray2068 = new int[50];
  public static AnimationSomething[] aClass3_Sub28_Sub5Array2070 = new AnimationSomething[14];
  public static AbstractDirectColorSprite[] aClass3_Sub28_Sub16Array2072;
  public static int[] anIntArray2073 = new int[5];
  public static int anInt2079;
  public static int anInt2081;
  public static int anInt2275 = 1;
  public static int NEXT_CAMERA_YAW_DELTA;
  public static int interfaceCounter;
  public static int anInt1552;
  public static int anInt1559;
  public static byte[][] byteArrayPool;
  public static int[] BIT_MASKS = new int[32];
  public static int anInt2290;
  public static int anInt2291;
  public static int anInt2530 = 2301979;
  public static int[] anIntArray2533;
  public static int anInt2534;
  public static int anInt2535 = -2;
  public static FileUnpacker aClass153_2536;
  public static int anInt2537;
  public static boolean[] aBooleanArray2538 = {
      true, true, true, true, true, true, true, true, true, true, true, true,
      true, true, true, true,
      true, true, true, true, true, true, true, true, false
  };
  public static int anInt2540;
  public static int anInt2541;
  public static int[] anIntArray1743 = new int[25];
  public static int anInt1748;
  public static Widget aClass11_1749;
  public static FileUnpacker worldMapData;
  public static int anInt1753;
  public static int cycles;
  public static int[] anIntArray1755 = new int[128];
  public static int anInt1756;
  public static int[] anIntArray3565 = new int[32];
  public static int anInt3569;
  public static ObjectCache aClass93_3572 = new ObjectCache(64);
  public static MidiSomething aClass83_3579;
  public static boolean aBoolean3531;
  public static TriChromaticImageBuffer aClass3_Sub20_3532 = new TriChromaticImageBuffer(
      0, 0);
  public static int anInt3536;
  public static int anInt3537;
  public static int anInt3539;
  public static FileUnpacker aClass153_152;
  public static int anInt154;
  public static int anInt1071;
  public static boolean aBoolean1074;
  public static float aFloat319;
  public static FileUnpacker aClass153_322;
  public static FileUnpacker aClass153_323;
  public static int[] anIntArray614 = new int[6];
  public static int[] anIntArray622 = new int[6];
  public static int[] anIntArray623 = new int[6];
  public static int[] anIntArray628 = new int[6];
  public static int[] anIntArray630 = new int[6];
  public static SoftwareIndexedColorSprite aClass109_Sub1_2631;
  public static int anInt2633;
  public static short[][] aShortArrayArray2634 = {
      {
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
          (short) 4, (short) 24, (short) 44, (short) 64, (short) 84,
          (short) 104, (short) 304,
          (short) 678, (short) 698, (short) 550, (short) 934, (short) 954,
          (short) 6448, (short) 6946,
          (short) 6966, (short) 2352, (short) 2726, (short) 2746, (short) 10544,
          (short) 10918,
          (short) 10938, (short) 10304, (short) 10550, (short) 10570,
          (short) 14640, (short) 15014,
          (short) 15034, (short) 19760, (short) 20134, (short) 20154,
          (short) -29392, (short) -29018,
          (short) -28998, (short) 31024, (short) 31270, (short) 31290,
          (short) -24272, (short) -23898,
          (short) -23878, (short) -19152, (short) -18778, (short) -18758,
          (short) -14032,
          (short) -13658, (short) -13638, (short) -6864, (short) -6490,
          (short) -6470, (short) 516,
          (short) 536, (short) 6788, (short) 6808, (short) 11012, (short) 11032,
          (short) 14980,
          (short) 15000, (short) 21124, (short) 21144, (short) -28924,
          (short) -28904, (short) -22012,
          (short) -21992, (short) -12924, (short) -12904
      }, {
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
      (short) 10339, (short) 10574, (short) 10425, (short) 10398, (short) 10345,
      (short) 7512,
      (short) 8507, (short) 7378, (short) 0, (short) 0, (short) 0, (short) 0,
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
      (short) 4, (short) 24, (short) 44, (short) 64, (short) 84, (short) 104,
      (short) 304,
      (short) 678, (short) 698, (short) 550, (short) 934, (short) 954,
      (short) 6448, (short) 6946,
      (short) 6966, (short) 2352, (short) 2726, (short) 2746, (short) 10544,
      (short) 10918,
      (short) 10938, (short) 10304, (short) 10550, (short) 10570, (short) 14640,
      (short) 15014,
      (short) 15034, (short) 19760, (short) 20134, (short) 20154,
      (short) -29392, (short) -29018,
      (short) -28998, (short) 31024, (short) 31270, (short) 31290,
      (short) -24272, (short) -23898,
      (short) -23878, (short) -19152, (short) -18778, (short) -18758,
      (short) -14032, (short) -13658,
      (short) -13638, (short) -6864, (short) -6490, (short) -6470, (short) 516,
      (short) 536,
      (short) 6788, (short) 6808, (short) 11012, (short) 11032, (short) 14980,
      (short) 15000,
      (short) 21124, (short) 21144, (short) -28924, (short) -28904,
      (short) -22012, (short) -21992,
      (short) -12924, (short) -12904
  }, {
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
      (short) 13753, (short) 13737, (short) 13719, (short) 13883, (short) 13863,
      (short) 13974,
      (short) 19643, (short) 18601, (short) 16532, (short) 23993, (short) 25121,
      (short) 24980,
      (short) 26944, (short) 26921, (short) 24854, (short) 27191, (short) 27171,
      (short) 26130,
      (short) 26941, (short) 28696, (short) 30100, (short) 12477, (short) 10407,
      (short) 10388,
      (short) 10685, (short) 10665, (short) 10646, (short) 6711, (short) 6693,
      (short) 6674,
      (short) 6965, (short) 7073, (short) 7056, (short) 2361, (short) 4387,
      (short) 3346, (short) 0,
      (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
      (short) 0, (short) 0,
      (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
      (short) 0, (short) 0,
      (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
      (short) 0, (short) 0,
      (short) 0, (short) 0, (short) 0
  }, {
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
      (short) 4, (short) 24, (short) 44, (short) 64, (short) 84, (short) 104,
      (short) 304,
      (short) 678, (short) 698, (short) 550, (short) 934, (short) 954,
      (short) 6448, (short) 6946,
      (short) 6966, (short) 2352, (short) 2726, (short) 2746, (short) 10544,
      (short) 10918,
      (short) 10938, (short) 10304, (short) 10550, (short) 10570, (short) 14640,
      (short) 15014,
      (short) 15034, (short) 19760, (short) 20134, (short) 20154,
      (short) -29392, (short) -29018,
      (short) -28998, (short) 31024, (short) 31270, (short) 31290,
      (short) -24272, (short) -23898,
      (short) -23878, (short) -19152, (short) -18778, (short) -18758,
      (short) -14032, (short) -13658,
      (short) -13638, (short) -6864, (short) -6490, (short) -6470, (short) 516,
      (short) 536,
      (short) 6788, (short) 6808, (short) 11012, (short) 11032, (short) 14980,
      (short) 15000,
      (short) 21124, (short) 21144, (short) -28924, (short) -28904,
      (short) -22012, (short) -21992,
      (short) -12924, (short) -12904
  }
  };
  public static SomethingFont aClass33_2637;
  public static int[] anIntArray2639;
  public static int anInt2640;
  public static int[] anIntArray2642 = {
      1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6,
      1, 7, 0, 0, 6, 7, 0,
      1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5
  };
  public static int p12FontFileId;
  public static FileUnpacker fileUnpacker6;
  public static SomethingFont aClass33_2648;
  public static int anInt2651;
  public static AbstractDirectColorSprite[] aClass3_Sub28_Sub16Array2656;
  public static int anInt2658;
  public static FileUnpacker animationFrames;
  public static int[] anIntArray2663;
  public static int[] anIntArray2664;
  public static int[] PACKET_LENGTHS = {
      -1,
      0,
      8,
      0,
      2,
      0,
      0,
      0,
      0,
      12,
      0,
      1,
      0,
      3,
      7,
      0,
      15,
      6,
      0,
      0,
      4,
      7,
      -2,
      -1,
      2,
      0,
      2,
      8,
      0,
      0,
      0,
      0,
      -2,
      5,
      0,
      0,
      8,
      3,
      6,
      0,
      0,
      0,
      -1,
      0,
      -1,
      0,
      0,
      6,
      -2,
      0,
      12,
      0,
      0,
      0,
      -1,
      -2,
      10,
      0,
      0,
      0,
      3,
      0,
      -1,
      0,
      0,
      5,
      6,
      0,
      0,
      8,
      -1,
      -1,
      0,
      8,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      -1,
      0,
      0,
      6,
      2,
      0,
      0,
      0,
      0,
      1,
      0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 5, 0, 0, -2, 0, 0, 0, 0, 0, 12, 2, 0,
      -2, -2, 20, 0, 0, 10,
      0, 15, 0, -1, 0, 8, -2, 0, 0, 0, 8, 0, 12, 0, 0, 7, 0, 0, 0, 0, 0, -1, -1,
      0, 4, 5, 0, 0, 0, 6,
      0, 0, 0, 0, 8, 9, 0, 0, 0, 2, -1, 0, -2, 0, 4, 14, 0, 0, 0, 24, 0, -2, 5,
      0, 0, 0, 10, 0, 0, 4,
      0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 2, 1, 0, 0, 2, -1, 1, 0, 0, 0, 0, 14, 0,
      0, 0, 0, 10, 5, 0, 0,
      0, 0, 0, -2, 0, 0, 9, 0, 0, 8, 0, 0, 0, 0, -2, 6, 0, 0, 0, -2, 0, 3, 0, 1,
      7, 0, 0, 0, 0, 3, 0,
      0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 3, 0, 0
  };
  public static int anInt2670;
  public static int[] anIntArray1662;
  public static int viewportUpperZ;
  public static Queue aClass13_1666 = new Queue();
  public static int anInt1668 = -1;
  public static AbstractFont p12Font;
  public static GameClient client;
  public static int anInt1672;
  public static int anInt1676;
  public static int anInt1677;
  public static int anInt2421 = -1;
  public static int anInt2426;
  public static boolean aBoolean2427;
  public static ObjectCache aClass93_2428 = new ObjectCache(50);
  public static SocketStream GAME_SOCKET;
  public static boolean aBoolean2433;
  public static int anInt2436;
  public static AbstractAudioOutputStream audioOutputStream1;
  public static Widget aClass11_3551;
  public static int anInt3552;
  public static int widgetQuads;
  public static int anInt3564;
  public static int anInt2249;
  public static int anInt2251;
  public static FileUnpacker fileUnpacker25;
  public static int anInt529;
  public static int NEXT_CAMERA_YAW;
  public static GameBuffer GAME_BUFFER = new GameBuffer(5000);
  public static int anInt544;
  public static int anInt546;
  public static int anInt548;
  public static GameString FONT_P11 = GameStringStatics.create("p11_full");
  public static int anInt2701;
  public static boolean aBoolean2705 = true;
  public static boolean aBoolean2713;
  public static int anInt3542;
  public static int anInt2337;
  public static int[] anIntArray2338 = {160, 192, 80, 96, 0, 144, 80, 48, 160};
  public static byte[][][] aByteArrayArrayArray2339;
  public static int[] anIntArray2125;
  public static int anInt2130;
  public static SoundEffect[] aClass135Array2131 = new SoundEffect[50];
  public static int anInt2136;
  public static SoftwareDirectColorSprite[] aClass3_Sub28_Sub16_Sub2Array2140;
  public static Player localPlayer;
  public static int anInt3267;
  public static Player[] PLAYERS = new Player[2048];
  public static AbstractIndexedColorSprite[] aClass109Array3270;
  public static long[] aLongArray3271 = new long[500];
  public static boolean[] aBooleanArray3272;
  public static Deque[][][] groundItems = new Deque[4][104][104];
  public static int sunPositionY;
  public static int anInt3277;
  public static ObjectCache aClass93_3130 = new ObjectCache(4);
  public static int b12FontFileId;
  public static int anInt3136;
  public static Cache aClass47_3137 = new Cache(64);
  public static GameString FONT_B12 = GameStringStatics.create("b12_full");
  public static int[] anIntArray3139 = new int[14];
  public static ObjectCache aClass93_3369 = new ObjectCache(64);
  public static AbstractDirectColorSprite[] aClass3_Sub28_Sub16Array3373;
  public static int anInt3375;
  public static int anInt3377 = 7759444;
  public static int hintHeadIconsFileId;
  public static boolean aBoolean3358;
  public static int[] anIntArray3359 = new int[5];
  public static FileUnpacker aClass153_3361;
  public static SoftwareDirectColorSprite aClass3_Sub28_Sub16_Sub2_3221;
  public static FileUnpacker aClass153_3227;
  public static int[] anIntArray3228 = {7, 8, 9, 10, 11, 12, 13, 15};
  public static short aShort3241 = 1;
  public static float aFloat3044;
  public static int[] anIntArray3045;
  public static long serverCipherKey;
  public static GameString[] aClass94Array3341 = new GameString[100];
  public static int OTHER_CURRENT_KEY;
  public static AbstractDirectColorSprite[] aClass3_Sub28_Sub16Array3458;
  public static int anInt3459;
  public static int anInt3460;
  public static int anInt3463;
  public static int anInt3464;
  public static boolean[][] aBooleanArrayArray3468 = {
      {true, true, true}, {false, false}, {false, true}, {true, false},
      {false, true, true},
      {true, false, true}, {false, true, false}, {true, false, false}
  };
  public static int anInt3101;
  public static int anInt3102;
  public static int anInt3103;
  public static float aFloat3105;
  public static int anInt3439;
  public static SoftwareFont aClass3_Sub28_Sub17_Sub1_3440;
  public static int anInt3442;
  public static int anInt3244;
  public static int anInt3248;
  public static GameBuffer SECURE_BUFFER = new GameBuffer(5000);
  public static AnimationSomething[] aClass3_Sub28_Sub5Array3041 = new AnimationSomething[14];
  public static int anInt3362 = -1;
  public static int CAMERA_Z;
  public static Deque projectiles = new Deque();
  public static int anInt3365;
  public static long lastWrittenTime;
  public static int[] anIntArray3367 = new int[64];

  public static void method1076(int var0) {
    DummyClass14.aClass93_1964.method1524(3);
    int var1 = -86 % ((var0 + 55) / 41);
  }

  public static void method1077(int var0) {
    GameStringStatics.aClass94_2619 = null;
    GameStringStatics.aClass94_2624 = null;
    GlobalStatics_9.audioOutputStream0 = null;
    if (var0 != 0) {
      GlobalStatics_9.deltaTime = 89;
    }

    GameStringStatics.aClass94_2628 = null;
  }

  public static int getInventoryFreeSpace(int var0, byte var1) {
    if (var0 < 0) {
      return 0;
    } else {
      Inventory var2 = (Inventory) GlobalStatics_2.aClass130_2220.get(var0);
      if (var2 == null) {
        return Objects
            .requireNonNull(GlobalStatics_6.method2069(var0, -126)).size;
      } else if (var1 > -56) {
        return -13;
      } else {
        int var3 = 0;

        for (int var4 = 0; var4 < var2.ids.length; ++var4) {
          if (var2.ids[var4] == -1) {
            ++var3;
          }
        }

        var3 +=
            Objects.requireNonNull(GlobalStatics_6.method2069(var0, -100)).size
                - var2.ids.length;
        return var3;
      }
    }
  }

  public static void method960(int var0) {
    GlobalStatics_9.anIntArray509 = null;
    GameStringStatics.aClass94_500 = null;
    GameStringStatics.FONT_P12 = null;
  }

  public static boolean loadSprites(FileUnpacker sprites, int fileId) {
    byte[] bytes = sprites.getBytes(fileId);
    if (bytes != null) {
      DummyClass38.loadSprites(bytes, 19);
      return true;
    } else {
      return false;
    }
  }

  public static void method2030(byte var0) {
    GlobalStatics_9.anIntArray2929 = null;
    if (var0 < 82) {
      GlobalStatics_9.method2031((byte) -61, false, -20, 24, null, 124);
    }

    GlobalStatics_9.anIntArray2931 = null;
    GlobalStatics_9.anIntArray2933 = null;
    GameStringStatics.aClass94Array2935 = null;
    GameStringStatics.aClass94_2928 = null;
    GlobalStatics_9.fileUnpacker24 = null;
  }

  public static boolean method2031(byte var0, boolean var1, int var2, int var3,
      SceneGraphTile[][][] var4, int var5) {
    byte var6 = var1 ? 1 : (byte) (255 & GlobalStatics_6.anInt1127);
    if (var6
        == GlobalStatics_5.aByteArrayArrayArray2008[GlobalStatics_9.currentPlane][var2][var3]) {
      return false;
    } else if ((
        GlobalStatics_10.tileFlags[GlobalStatics_9.currentPlane][var2][var3]
            & 4) == 0) {
      return false;
    } else {
      int var8 = 0;
      byte var7 = 0;
      GlobalStatics_10.anIntArray3456[var7] = var2;
      if (var0 >= -9) {
        GlobalStatics_9.method2031((byte) -29, false, 59, 52, null, 75);
      }

      int var23 = var7 + 1;
      DummyClass38.anIntArray729[var7] = var3;
      GlobalStatics_5.aByteArrayArrayArray2008[GlobalStatics_9.currentPlane][var2][var3] =
          var6;

      while (var8 != var23) {
        int var10 = (16740943 & GlobalStatics_10.anIntArray3456[var8]) >> 16;
        int var11 = 255 & GlobalStatics_10.anIntArray3456[var8] >> 24;
        int var9 = GlobalStatics_10.anIntArray3456[var8] & 0xffff;
        int var13 = (DummyClass38.anIntArray729[var8] & 16721603) >> 16;
        int var12 = DummyClass38.anIntArray729[var8] & 0xffff;
        var8 = 4095 & 1 + var8;
        boolean var14 = false;
        boolean var15 = false;
        if ((
            GlobalStatics_10.tileFlags[GlobalStatics_9.currentPlane][var9][var12]
                & 4) == 0) {
          var14 = true;
        }

        int var17;
        int var16;
        label257:
        for (var16 = 1 + GlobalStatics_9.currentPlane; var16 <= 3; ++var16) {
          if ((GlobalStatics_10.tileFlags[var16][var9][var12] & 8) == 0) {
            int var18;
            int var20;
            if (var14 && var4[var16][var9][var12] != null) {
              if (var4[var16][var9][var12].aClass70_2234 != null) {
                var17 = GlobalStatics_7.method1184(var10, (byte) 82);
                if (var4[var16][var9][var12].aClass70_2234.anInt1055 == var17
                    || var4[var16][var9][var12].aClass70_2234.anInt1059
                    == var17) {
                  continue;
                }

                if (var11 != 0) {
                  var18 = GlobalStatics_7.method1184(var11, (byte) -93);
                  if (var18 == var4[var16][var9][var12].aClass70_2234.anInt1055
                      || var4[var16][var9][var12].aClass70_2234.anInt1059
                      == var18) {
                    continue;
                  }
                }

                if (var13 != 0) {
                  var18 = GlobalStatics_7.method1184(var13, (byte) 99);
                  if (var18 == var4[var16][var9][var12].aClass70_2234.anInt1055
                      || var18
                      == var4[var16][var9][var12].aClass70_2234.anInt1059) {
                    continue;
                  }
                }
              }

              if (var4[var16][var9][var12].sceneGraphNodes != null) {
                for (var17 = 0; var4[var16][var9][var12].anInt2223 > var17;
                    ++var17) {
                  var18 =
                      (int) (63L &
                          var4[var16][var9][var12].sceneGraphNodes[var17].aLong498
                              >> 14);
                  if (var18 == 21) {
                    var18 = 19;
                  }

                  int var19 =
                      (int) (
                          var4[var16][var9][var12].sceneGraphNodes[var17].aLong498
                              >> 20 & 3L);
                  var20 = var18 | var19 << 6;
                  if (var20 == var10 || var11 != 0 && var20 == var11
                      || var13 != 0 && var13 == var20) {
                    continue label257;
                  }
                }
              }
            }

            var15 = true;
            SceneGraphTile var24 = var4[var16][var9][var12];
            if (var24 != null && var24.anInt2223 > 0) {
              for (var18 = 0; var24.anInt2223 > var18; ++var18) {
                SceneSomething var25 = var24.sceneGraphNodes[var18];
                if (var25.anInt495 != var25.anInt483 || var25.anInt481
                    != var25.anInt478) {
                  for (var20 = var25.anInt483; var25.anInt495 >= var20;
                      ++var20) {
                    for (int var21 = var25.anInt478; var21 <= var25.anInt481;
                        ++var21) {
                      GlobalStatics_5.aByteArrayArrayArray2008[var16][var20][var21] = var6;
                    }
                  }
                }
              }
            }

            GlobalStatics_5.aByteArrayArrayArray2008[var16][var9][var12] = var6;
          }
        }

        if (var15) {
          if (GlobalStatics_4.heightMap[GlobalStatics_9.currentPlane
              + 1][var9][var12]
              > GlobalStatics_7.anIntArray686[var5]) {
            GlobalStatics_7.anIntArray686[var5] =
                GlobalStatics_4.heightMap[GlobalStatics_9.currentPlane
                    + 1][var9][var12];
          }

          var16 = var9 << 7;
          if (var16 >= GlobalStatics_9.anIntArray2696[var5]) {
            if (DummyClass13.anIntArray2021[var5] < var16) {
              DummyClass13.anIntArray2021[var5] = var16;
            }
          } else {
            GlobalStatics_9.anIntArray2696[var5] = var16;
          }

          var17 = var12 << 7;
          if (GlobalStatics_3.anIntArray1871[var5] > var17) {
            GlobalStatics_3.anIntArray1871[var5] = var17;
          } else if (GlobalStatics_9.anIntArray3959[var5] < var17) {
            GlobalStatics_9.anIntArray3959[var5] = var17;
          }
        }

        if (!var14) {
          if (var9 >= 1 &&
              GlobalStatics_5.aByteArrayArrayArray2008[GlobalStatics_9.currentPlane][
                  -1
                      + var9][var12] != var6) {
            GlobalStatics_10.anIntArray3456[var23] =
                var9 - 1 | 1179648 | -754974720;
            DummyClass38.anIntArray729[var23] = var12 | 1245184;
            var23 = 1 + var23 & 4095;
            GlobalStatics_5.aByteArrayArrayArray2008[GlobalStatics_9.currentPlane][
                var9
                    - 1][var12] = var6;
          }

          ++var12;
          if (var12 < 104) {
            if (var9 - 1 >= 0 && var6
                != GlobalStatics_5.aByteArrayArrayArray2008[GlobalStatics_9.currentPlane][
                -1 + var9][var12] &&
                (GlobalStatics_10.tileFlags[GlobalStatics_9.currentPlane][var9][var12]
                    & 4)
                    == 0 &&
                (GlobalStatics_10.tileFlags[GlobalStatics_9.currentPlane][-1
                    + var9][var12
                    - 1] & 4) == 0) {
              GlobalStatics_10.anIntArray3456[var23] =
                  1375731712 | (1179648 | -1 + var9);
              DummyClass38.anIntArray729[var23] = var12 | 1245184;
              GlobalStatics_5.aByteArrayArrayArray2008[GlobalStatics_9.currentPlane][
                  -1
                      + var9][var12] = var6;
              var23 = 1 + var23 & 4095;
            }

            if (var6
                != GlobalStatics_5.aByteArrayArrayArray2008[GlobalStatics_9.currentPlane][var9][var12]) {
              GlobalStatics_10.anIntArray3456[var23] =
                  318767104 | (var9 | 5373952);
              DummyClass38.anIntArray729[var23] = 5439488 | var12;
              var23 = 4095 & 1 + var23;
              GlobalStatics_5.aByteArrayArrayArray2008[GlobalStatics_9.currentPlane][var9][var12] =
                  var6;
            }

            if (1 + var9 < 104 &&
                GlobalStatics_5.aByteArrayArrayArray2008[GlobalStatics_9.currentPlane][
                    var9
                        + 1][var12] != var6 && (
                GlobalStatics_10.tileFlags[GlobalStatics_9.currentPlane][var9][var12]
                    & 4) == 0
                &&
                (GlobalStatics_10.tileFlags[GlobalStatics_9.currentPlane][1
                    + var9][var12
                    - 1] & 4) == 0) {
              GlobalStatics_10.anIntArray3456[var23] =
                  -1845493760 | (5373952 | var9 + 1);
              DummyClass38.anIntArray729[var23] = 5439488 | var12;
              GlobalStatics_5.aByteArrayArrayArray2008[GlobalStatics_9.currentPlane][
                  var9
                      + 1][var12] = var6;
              var23 = 4095 & var23 + 1;
            }
          }

          --var12;
          if (1 + var9 < 104 && var6
              != GlobalStatics_5.aByteArrayArrayArray2008[GlobalStatics_9.currentPlane][
              var9 + 1][var12]) {
            GlobalStatics_10.anIntArray3456[var23] =
                1 + var9 | 9568256 | 1392508928;
            DummyClass38.anIntArray729[var23] = var12 | 9633792;
            GlobalStatics_5.aByteArrayArrayArray2008[GlobalStatics_9.currentPlane][
                1
                    + var9][var12] = var6;
            var23 = var23 + 1 & 4095;
          }

          --var12;
          if (var12 >= 0) {
            if (var9 - 1 >= 0 &&
                GlobalStatics_5.aByteArrayArrayArray2008[GlobalStatics_9.currentPlane][
                    -1
                        + var9][var12] != var6 &&
                (GlobalStatics_10.tileFlags[GlobalStatics_9.currentPlane][var9][var12]
                    & 4)
                    == 0 &&
                (GlobalStatics_10.tileFlags[GlobalStatics_9.currentPlane][var9
                    - 1][1
                    + var12] & 4) == 0) {
              GlobalStatics_10.anIntArray3456[var23] =
                  -1 + var9 | 13762560 | 301989888;
              DummyClass38.anIntArray729[var23] = var12 | 13828096;
              GlobalStatics_5.aByteArrayArrayArray2008[GlobalStatics_9.currentPlane][
                  -1
                      + var9][var12] = var6;
              var23 = 4095 & var23 + 1;
            }

            if (var6
                != GlobalStatics_5.aByteArrayArrayArray2008[GlobalStatics_9.currentPlane][var9][var12]) {
              GlobalStatics_10.anIntArray3456[var23] =
                  var9 | 13762560 | -1828716544;
              DummyClass38.anIntArray729[var23] = 13828096 | var12;
              var23 = var23 + 1 & 4095;
              GlobalStatics_5.aByteArrayArrayArray2008[GlobalStatics_9.currentPlane][var9][var12] =
                  var6;
            }

            if (var9 + 1 < 104 &&
                GlobalStatics_5.aByteArrayArrayArray2008[GlobalStatics_9.currentPlane][
                    var9
                        + 1][var12] != var6 &&
                (4
                    & GlobalStatics_10.tileFlags[GlobalStatics_9.currentPlane][var9][var12])
                    == 0 &&
                (GlobalStatics_10.tileFlags[GlobalStatics_9.currentPlane][1
                    + var9][1
                    + var12] & 4) == 0) {
              GlobalStatics_10.anIntArray3456[var23] =
                  -771751936 | (var9 + 1 | 9568256);
              DummyClass38.anIntArray729[var23] = 9633792 | var12;
              GlobalStatics_5.aByteArrayArrayArray2008[GlobalStatics_9.currentPlane][
                  var9
                      + 1][var12] = var6;
              var23 = 4095 & 1 + var23;
            }
          }
        }
      }

      if (GlobalStatics_7.anIntArray686[var5] != -1000000) {
        GlobalStatics_7.anIntArray686[var5] += 10;
        GlobalStatics_9.anIntArray2696[var5] -= 50;
        DummyClass13.anIntArray2021[var5] += 50;
        GlobalStatics_9.anIntArray3959[var5] += 50;
        GlobalStatics_3.anIntArray1871[var5] -= 50;
      }

      return true;
    }
  }

  public static int method2032(int var0, int var1) {
    if (var1 != 5439488) {
      GlobalStatics_9.anInt2937 = 102;
    }

    return var0 >>> 10;
  }

  public static GameString decompressString(Buffer buffer, int maximumLen) {
    try {
      int len = buffer.readUnsignedShortSmart();
      if (maximumLen < len) {
        len = maximumLen;
      }
      byte[] dest = new byte[len];
      buffer.position +=
          GlobalStatics_10.huffmanEncoder
              .decompress(buffer.bytes, buffer.position, dest, 0, len);
      GameString var5 = GameStringStatics.createString(dest, 0, len);
      return var5;
    } catch (Exception var6) {
      return DummyClass13.aClass94_2018;
    }
  }

  public static void method626(int var0) {
    if (com.jagex.runescape.statics.GlobalStatics_0.aClass3_Sub28_Sub3_2600
        != null) {
      if (GlobalStatics_8.anInt2737 < 10) {
        if (!GlobalStatics_10.worldMaps.method2127((byte) -83,
            com.jagex.runescape.statics.GlobalStatics_0.aClass3_Sub28_Sub3_2600.aClass94_3561)) {
          GlobalStatics_8.anInt2737 =
              GlobalStatics_9.worldMapData.method2116(22813,
                  com.jagex.runescape.statics.GlobalStatics_0.aClass3_Sub28_Sub3_2600.aClass94_3561)
                  / 10;
          return;
        }

        GlobalStatics_9.method169(var0 ^ 22166);
        GlobalStatics_8.anInt2737 = 10;
      }

      if (GlobalStatics_8.anInt2737 == 10) {
        GlobalStatics_10.anInt3256 =
            com.jagex.runescape.statics.GlobalStatics_0.aClass3_Sub28_Sub3_2600.anInt3555
                >> 6 << 6;
        GlobalStatics_9.anInt65 =
            com.jagex.runescape.statics.GlobalStatics_0.aClass3_Sub28_Sub3_2600.anInt3562
                >> 6 << 6;
        DummyClass58.anInt1460 =
            (com.jagex.runescape.statics.GlobalStatics_0.aClass3_Sub28_Sub3_2600.anInt3549
                >> 6 << 6) - GlobalStatics_9.anInt65 + 64;
        DummyClass30.anInt455 =
            64 + (
                com.jagex.runescape.statics.GlobalStatics_0.aClass3_Sub28_Sub3_2600.anInt3559
                    >> 6 << 6) - GlobalStatics_10.anInt3256;
        if (GlobalStatics_0.aClass3_Sub28_Sub3_2600.anInt3563 == 37) {
          GlobalStatics_4.aFloat727 = 3.0F;
          GlobalStatics_9.aFloat3979 = 3.0F;
        } else {
          if (GlobalStatics_0.aClass3_Sub28_Sub3_2600.anInt3563
              == 50) {
            GlobalStatics_4.aFloat727 = 4.0F;
            GlobalStatics_9.aFloat3979 = 4.0F;
          } else {
            if (com.jagex.runescape.statics.GlobalStatics_0.aClass3_Sub28_Sub3_2600.anInt3563
                == 75) {
              GlobalStatics_4.aFloat727 = 6.0F;
              GlobalStatics_9.aFloat3979 = 6.0F;
            } else if (GlobalStatics_0.aClass3_Sub28_Sub3_2600.anInt3563
                != 100) {
              if (com.jagex.runescape.statics.GlobalStatics_0.aClass3_Sub28_Sub3_2600.anInt3563
                  == 200) {
                GlobalStatics_4.aFloat727 = 16.0F;
                GlobalStatics_9.aFloat3979 = 16.0F;
              } else {
                GlobalStatics_4.aFloat727 = 8.0F;
                GlobalStatics_9.aFloat3979 = 8.0F;
              }
            } else {
              GlobalStatics_4.aFloat727 = 8.0F;
              GlobalStatics_9.aFloat3979 = 8.0F;
            }
          }
        }

        int var1 =
            -GlobalStatics_10.anInt3256 + (GlobalStatics_9.localPlayer.sceneX
                >> 7)
                + GlobalStatics_10.REGION_BASE_X;
        var1 += -5 + (int) (Math.random() * 10.0D);
        int var2 =
            -GlobalStatics_9.REGION_BASE_Y - (GlobalStatics_9.localPlayer.sceneY
                >> 7)
                + GlobalStatics_9.anInt65 - 1 + DummyClass58.anInt1460;
        var2 += -5 + (int) (Math.random() * 10.0D);
        if (var1 >= 0 && DummyClass30.anInt455 > var1 && var2 >= 0
            && var2 < DummyClass58.anInt1460) {
          GlobalStatics_9.anInt3536 = var1;
          GlobalStatics_9.anInt2251 = var2;
        } else {
          GlobalStatics_9.anInt2251 =
              GlobalStatics_9.anInt65 -
                  com.jagex.runescape.statics.GlobalStatics_0.aClass3_Sub28_Sub3_2600.anInt3556
                      * 64
                  + DummyClass58.anInt1460 - 1;
          GlobalStatics_9.anInt3536 =
              com.jagex.runescape.statics.GlobalStatics_0.aClass3_Sub28_Sub3_2600.anInt3558
                  * 64 - GlobalStatics_10.anInt3256;
        }

        GlobalStatics_9.method117((byte) 87);
        DummyClass51.anIntArray1161 = new int[1 + GlobalStatics_9.amountFloors];
        int var4 = DummyClass58.anInt1460 >> 6;
        int var3 = DummyClass30.anInt455 >> 6;
        GlobalStatics_9.aByteArrayArrayArray2339 = new byte[var3][var4][];
        int var5 = GlobalStatics_10.anInt3158 >> 2 << 10;
        com.jagex.runescape.statics.GlobalStatics_0.aByteArrayArrayArray640 = new byte[var3][var4][];
        GlobalStatics_4.anIntArrayArrayArray720 = new int[var3][var4][];
        GlobalStatics_9.aByteArrayArrayArray383 = new byte[var3][var4][];
        GlobalStatics_5.anIntArrayArrayArray1903 = new int[var3][var4][];
        GlobalStatics_10.aByteArrayArrayArray3390 = new byte[var3][var4][];
        int var6 = GlobalStatics_1.anInt1463 >> 1;
        GlobalStatics_7.aByteArrayArrayArray2452 = new byte[var3][var4][];
        GlobalStatics_9.anIntArrayArrayArray558 = new int[var3][var4][];
        com.jagex.runescape.statics.GlobalStatics_0
            .method1014(-120, var6, var5);
        GlobalStatics_8.anInt2737 = 20;
      } else if (GlobalStatics_8.anInt2737 != 20) {
        if (var0 != 64) {
          GlobalStatics_9.method628(-40, -12, 40, null);
        }

        if (GlobalStatics_8.anInt2737 == 30) {
          DummyClass7.method2219(new Buffer(
                  GlobalStatics_10.worldMaps.method2123(0, DummyClass18.aClass94_85,
                      com.jagex.runescape.statics.GlobalStatics_0.aClass3_Sub28_Sub3_2600.aClass94_3561)),
              false);
          GlobalStatics_8.anInt2737 = 40;
          GlobalStatics_9.resetFrameRegulator();
        } else if (GlobalStatics_8.anInt2737 != 40) {
          if (GlobalStatics_8.anInt2737 == 50) {
            GlobalStatics_9.method1587((byte) -83, new Buffer(
                GlobalStatics_10.worldMaps
                    .method2123(var0 - 64, GameStringStatics.aClass94_422,
                        com.jagex.runescape.statics.GlobalStatics_0.aClass3_Sub28_Sub3_2600.aClass94_3561)));
            GlobalStatics_8.anInt2737 = 60;
            DummyClass5.method2210((byte) -90, true);
            GlobalStatics_9.resetFrameRegulator();
          } else {
            if (GlobalStatics_8.anInt2737 == 60) {
              if (GlobalStatics_10.worldMaps
                  .method2135(GlobalStatics_9.concat(new GameString[]{
                      com.jagex.runescape.statics.GlobalStatics_0.aClass3_Sub28_Sub3_2600.aClass94_3561,
                      GameStringStatics.aClass94_2003
                  }), -106)) {
                if (!GlobalStatics_10.worldMaps.method2127((byte) -83,
                    GlobalStatics_9.concat(new GameString[]{
                        com.jagex.runescape.statics.GlobalStatics_0.aClass3_Sub28_Sub3_2600.aClass94_3561,
                        GameStringStatics.aClass94_2003
                    }))) {
                  return;
                }

                DummyClass25.aClass131_1624 =
                    DummyClass50.method1403(var0 - 120,
                        GlobalStatics_9.concat(new GameString[]{
                            com.jagex.runescape.statics.GlobalStatics_0.aClass3_Sub28_Sub3_2600.aClass94_3561,
                            GameStringStatics.aClass94_2003
                        }), GlobalStatics_10.worldMaps);
              } else {
                DummyClass25.aClass131_1624 = new WorldMapLabel(0);
              }

              GlobalStatics_8.anInt2737 = 70;
              GlobalStatics_9.resetFrameRegulator();
            } else if (GlobalStatics_8.anInt2737 == 70) {
              GlobalStatics_9.aClass33_3019 = new SomethingFont(11, true,
                  GlobalStatics_8.GAME_CANVAS);
              GlobalStatics_8.anInt2737 = 73;
              DummyClass5.method2210((byte) -90, true);
              GlobalStatics_9.resetFrameRegulator();
            } else if (GlobalStatics_8.anInt2737 != 73) {
              if (GlobalStatics_8.anInt2737 == 76) {
                DummyClass54.aClass33_1399 = new SomethingFont(14, true,
                    GlobalStatics_8.GAME_CANVAS);
                GlobalStatics_8.anInt2737 = 79;
                DummyClass5.method2210((byte) -90, true);
                GlobalStatics_9.resetFrameRegulator();
              } else if (GlobalStatics_8.anInt2737 == 79) {
                GlobalStatics_9.aClass33_2637 =
                    new SomethingFont(17, true, GlobalStatics_8.GAME_CANVAS);
                GlobalStatics_8.anInt2737 = 82;
                DummyClass5.method2210((byte) -90, true);
                GlobalStatics_9.resetFrameRegulator();
              } else if (GlobalStatics_8.anInt2737 == 82) {
                DummyClass25.aClass33_1626 = new SomethingFont(19, true,
                    GlobalStatics_8.GAME_CANVAS);
                GlobalStatics_8.anInt2737 = 85;
                DummyClass5.method2210((byte) -90, true);
                GlobalStatics_9.resetFrameRegulator();
              } else if (GlobalStatics_8.anInt2737 == 85) {
                GlobalStatics_9.aClass33_2648 =
                    new SomethingFont(22, true, GlobalStatics_8.GAME_CANVAS);
                GlobalStatics_8.anInt2737 = 88;
                DummyClass5.method2210((byte) -90, true);
                GlobalStatics_9.resetFrameRegulator();
              } else if (GlobalStatics_8.anInt2737 != 88) {
                GlobalStatics_7.aClass33_1305 = new SomethingFont(30, true,
                    GlobalStatics_8.GAME_CANVAS);
                GlobalStatics_8.anInt2737 = 100;
                DummyClass5.method2210((byte) -90, true);
                GlobalStatics_9.resetFrameRegulator();
                System.gc();
              } else {
                DummyClass12.aClass33_2034 = new SomethingFont(26, true,
                    GlobalStatics_8.GAME_CANVAS);
                GlobalStatics_8.anInt2737 = 91;
                DummyClass5.method2210((byte) -90, true);
                GlobalStatics_9.resetFrameRegulator();
              }
            } else {
              GlobalStatics_4.aClass33_1238 = new SomethingFont(12, true,
                  GlobalStatics_8.GAME_CANVAS);
              GlobalStatics_8.anInt2737 = 76;
              DummyClass5.method2210((byte) -90, true);
              GlobalStatics_9.resetFrameRegulator();
            }
          }
        } else {
          GlobalStatics_10.method328(-21774, new Buffer(
              GlobalStatics_10.worldMaps.method2123(0,
                  GameStringStatics.aClass94_3140,
                  com.jagex.runescape.statics.GlobalStatics_0.aClass3_Sub28_Sub3_2600.aClass94_3561)));
          GlobalStatics_8.anInt2737 = 50;
          GlobalStatics_9.resetFrameRegulator();
        }
      } else {
        GlobalStatics_2.method889((byte) 105, new Buffer(
            GlobalStatics_10.worldMaps.method2123(0,
                GameStringStatics.aClass94_1349,
                com.jagex.runescape.statics.GlobalStatics_0.aClass3_Sub28_Sub3_2600.aClass94_3561)));
        GlobalStatics_8.anInt2737 = 30;
        DummyClass5.method2210((byte) -90, true);
        GlobalStatics_9.resetFrameRegulator();
      }
    }
  }

  public static void method627(byte var0) {
    if (var0 <= -112) {
      GameStringStatics.username = null;
      GameStringStatics.password = null;
      GlobalStatics_9.updatedMapsData = null;
      GameStringStatics.EMPTY_STRING = null;
      GlobalStatics_9.aBooleanArray3674 = null;
    }
  }

  public static void method628(int var0, int var1, int var2, Player var3) {
    if (var0 != 0) {
      GlobalStatics_9.aBooleanArray3674 = null;
    }

    if (var2 == var3.animationId && var2 != -1) {
      AnimationSequence var4 = GlobalStatics_8.method45(var2, (byte) -20);
      int var5 = var4.anInt1845;
      if (var5 == 1) {
        var3.anInt2828 = var1;
        var3.anInt2760 = 0;
        var3.anInt2776 = 1;
        var3.anInt2832 = 0;
        var3.anInt2773 = 0;
        GlobalStatics_4
            .method1470(var3.sceneY, var4, var0 + 183921384, var3.sceneX,
                GlobalStatics_9.localPlayer == var3, var3.anInt2832);
      }

      if (var5 == 2) {
        var3.anInt2773 = 0;
      }
    } else if (var2 == -1 || var3.animationId == -1
        || GlobalStatics_8.method45(var2, (byte) -20).anInt1857
        >= GlobalStatics_8.method45(var3.animationId,
        (byte) -20).anInt1857) {
      var3.anInt2776 = 1;
      var3.anInt2832 = 0;
      var3.anInt2828 = var1;
      var3.anInt2811 = var3.anInt2816;
      var3.anInt2773 = 0;
      var3.anInt2760 = 0;
      var3.animationId = var2;
      if (var3.animationId != -1) {
        GlobalStatics_4.method1470(var3.sceneY,
            GlobalStatics_8.method45(var3.animationId, (byte) -20),
            183921384, var3.sceneX, var3 == GlobalStatics_9.localPlayer,
            var3.anInt2832);
      }
    }
  }

  public static void method1121(boolean var0, byte var1) {
    byte var2;
    byte[][] var3;
    if (GlRenderer.USE_OPENGL && var0) {
      var2 = 1;
      var3 = GlobalStatics_9.updatedMapsData;
    } else {
      var3 = GlobalStatics_9.aByteArrayArray3027;
      var2 = 4;
    }

    for (int var4 = 0; var4 < var2; ++var4) {
      DummyClass43.method1194();

      for (int var5 = 0; var5 < 13; ++var5) {
        for (int var6 = 0; var6 < 13; ++var6) {
          int var8 = GlobalStatics_8.anIntArrayArrayArray1497[var4][var5][var6];
          boolean var7 = false;
          if (var8 != -1) {
            int var9 = var8 >> 24 & 3;
            if (!var0 || var9 == 0) {
              int var12 = 2047 & var8 >> 3;
              int var10 = var8 >> 1 & 3;
              int var11 = 1023 & var8 >> 14;
              int var13 = (var11 / 8 << 8) + var12 / 8;

              for (int var14 = 0;
                  GlobalStatics_6.regionHashes.length > var14;
                  ++var14) {
                if (GlobalStatics_6.regionHashes[var14] == var13
                    && var3[var14] != null) {
                  GlobalStatics_11.method60(var10, 8 * var5, var4,
                      com.jagex.runescape.statics.GlobalStatics_0.collisionMaps,
                      var6 * 8, (byte) -100, var3[var14], var9,
                      (var12 & 7) * 8, 8 * (var11 & 7),
                      var0);
                  var7 = true;
                  break;
                }
              }
            }
          }

          if (!var7) {
            GlobalStatics_9
                .method870(var4, (byte) 84, 8 * var6, var5 * 8, 8, 8);
          }
        }
      }
    }

    if (var1 <= 49) {
      GlobalStatics_9.anInt817 = 32;
    }
  }

  public static Widget method1122(int var0, Widget var1) {
    if (var0 != 0) {
      GlobalStatics_9.method1123(103, 118);
    }

    Widget var2 = GlobalStatics_8.method42(var1);
    if (var2 == null) {
      var2 = var1.aClass11_302;
    }

    return var2;
  }

  public static byte[] method1123(int var0, int var1) {
    ByteArrayNode var2 =
        (ByteArrayNode) GlobalStatics_9.aClass47_480
            .get(var1, var0 - 16710535);
    if (var2 == null) {
      Random var4 = new Random(var1);
      byte[] var3 = new byte[512];

      int var5;
      for (var5 = 0; var5 < 255; ++var5) {
        var3[var5] = (byte) var5;
      }

      for (var5 = 0; var5 < 255; ++var5) {
        int var6 = 255 - var5;
        int var7 = GlobalStatics_8.method1603((byte) 125, var6, var4);
        byte var8 = var3[var7];
        var3[var7] = var3[var6];
        var3[var6] = var3[511 - var5] = var8;
      }

      var2 = new ByteArrayNode(var3);
      GlobalStatics_9.aClass47_480.put(var1, var2);
    }

    return var0 == 16711935 ? var2.aByteArray3612 : null;
  }

  public static GameString method1124(int[] var0, long var1, int var3,
      boolean var4) {
    if (var4) {
      return null;
    } else {
      if (DummyClass43.anInterface4_915 != null) {
        GameString var5 = DummyClass43.anInterface4_915
            .method20(var3, var0, 4936, var1);
        if (var5 != null) {
          return var5;
        }
      }

      return GlobalStatics_9.method612(var1, (byte) 124);
    }
  }

  public static void reportError(String var0, Throwable var1, byte var2) {
    if (var2 <= 100) {
      GlobalStatics_9.aClass47_818 = null;
    }
    var1.printStackTrace();
  }

  public static void method1126(int var0, int var1) {
    WidgetUpdate var2 = GlobalStatics_6.method466(4, 2, var1);
    int var3 = -67 % ((var0 + 37) / 48);
    var2.createIndexedColorSprite(true);
  }

  public static void method1127(int var0) {
    if (!DummyClass36.aBoolean2615) {
      if (GlobalStatics_7.anInt3660 != 0) {
        GlobalStatics_9.anInt1297 = GlobalStatics_9.anInt3460;
        DummyClass36.anInt2612 = GlobalStatics_8.anInt2099;
      } else if (GlobalStatics_9.anInt3644 == 0) {
        GlobalStatics_9.anInt1297 = GlobalStatics_9.anInt1676;
        DummyClass36.anInt2612 = com.jagex.runescape.statics.GlobalStatics_0.anInt1709;
      } else {
        GlobalStatics_9.anInt1297 = DummyClass5.anInt2993;
        DummyClass36.anInt2612 = DummyClass36.anInt2614;
      }

      GlobalStatics_10.amountContextActions = 1;
      GameStringStatics.aClass94Array2935[0] = DummyClass12.aClass94_2031;
      DummyClass8.aClass94Array4016[0] = GameStringStatics.EMPTY_STRING;
      GlobalStatics_10.aShortArray3095[0] = 1005;
      GlobalStatics_9.anIntArray1578[0] = GlobalStatics_6.anInt3590;
    }

    if (GlobalStatics_9.anInt3655 != -1) {
      GlobalStatics_9.method1160(-113, GlobalStatics_9.anInt3655);
    }

    if (var0 == 0) {
      int var1;
      for (var1 = 0; var1 < GlobalStatics_9.widgetQuads; ++var1) {
        if (GlobalStatics_9.aBooleanArray3674[var1]) {
          DummyClass9.aBooleanArray4008[var1] = true;
        }

        com.jagex.runescape.statics.GlobalStatics_0.aBooleanArray1712[var1] = GlobalStatics_9.aBooleanArray3674[var1];
        GlobalStatics_9.aBooleanArray3674[var1] = false;
      }

      GlobalStatics_2.aClass11_3708 = null;
      DummyClass41.anInt865 = -1;
      GlobalStatics_2.anInt2567 = -1;
      DummyClass54.aClass11_1402 = null;
      if (GlRenderer.USE_OPENGL) {
        GlobalStatics_11.aBoolean47 = true;
      }

      GlobalStatics_9.anInt2535 = GlobalStatics_4.updateCycle;
      if (GlobalStatics_9.anInt3655 != -1) {
        GlobalStatics_9.widgetQuads = 0;
        GlobalStatics_10.method841(true);
      }

      if (GlRenderer.USE_OPENGL) {
        GlUtils.resetClip();
      } else {
        DummyClass47.method1331();
      }

      GlobalStatics_8.method2278(122);
      if (DummyClass36.aBoolean2615) {
        if (GlobalStatics_8.aBoolean1951) {
          GlobalStatics_9.method1230((byte) 116);
        } else {
          DummyClass51.method1419(-117);
        }
      } else if (GlobalStatics_2.aClass11_3708 == null) {
        if (DummyClass41.anInt865 != -1) {
          GlobalStatics_9.method950(null, GlobalStatics_2.anInt2567,
              DummyClass41.anInt865);
        }
      } else {
        GlobalStatics_9.method950(GlobalStatics_2.aClass11_3708,
            GlobalStatics_8.anInt2115, GlobalStatics_10.anInt4041);
      }

      var1 = DummyClass36.aBoolean2615 ? -1
          : GlobalStatics_10.method335(var0 + 16859);
      if (var1 == -1) {
        var1 = DummyClass12.anInt2027;
      }

      GlobalStatics_10.method229(var1, 20827);
      if (GlobalStatics_7.anInt2440 == 1) {
        GlobalStatics_7.anInt2440 = 2;
      }

      if (GlobalStatics_8.anInt1521 == 1) {
        GlobalStatics_8.anInt1521 = 2;
      }

      if (GlobalStatics_6.rectangleDebugType == 3) {
        for (int var2 = 0; var2 < GlobalStatics_9.widgetQuads; ++var2) {
          if (!com.jagex.runescape.statics.GlobalStatics_0.aBooleanArray1712[var2]) {
            if (DummyClass9.aBooleanArray4008[var2]) {
              if (GlRenderer.USE_OPENGL) {
                GlUtils.fillQuad(GlobalStatics_5.quadx0[var2],
                    GlobalStatics_9.quady0[var2],
                    GlTexture2d.quadx1[var2], GlobalStatics_9.quady1[var2],
                    0xff0000,
                    0x80);
              } else {
                DummyClass47
                    .method1312(GlobalStatics_5.quadx0[var2],
                        GlobalStatics_9.quady0[var2], GlTexture2d.quadx1[var2],
                        GlobalStatics_9.quady1[var2], 0xff0000,
                        0x80);
              }
            }
          } else if (!GlRenderer.USE_OPENGL) {
            DummyClass47.method1312(GlobalStatics_5.quadx0[var2],
                GlobalStatics_9.quady0[var2],
                GlTexture2d.quadx1[var2], GlobalStatics_9.quady1[var2],
                16711935, 128);
          } else {
            GlUtils.fillQuad(GlobalStatics_5.quadx0[var2],
                GlobalStatics_9.quady0[var2],
                GlTexture2d.quadx1[var2], GlobalStatics_9.quady1[var2],
                16711935, 128);
          }
        }
      }

      com.jagex.runescape.statics.GlobalStatics_0
          .method1214(GlobalStatics_7.loopCycle,
              GlobalStatics_9.localPlayer.sceneX,
              GlobalStatics_9.localPlayer.sceneY,
              GlobalStatics_9.currentPlane,
              1);
      GlobalStatics_7.loopCycle = 0;
    }
  }

  public static void method1129(int var0, int var1, int var2, int var3,
      int var4) {
    int var5 = var3;
    int var6 = var2;
    int var7 = -var2;
    int var8 = -1;
    int var9 = DummyClass59
        .method1040(GlTexture2d.anInt3765, var2 + var4, (byte) 0,
            DummyClass55.anInt1425);
    int var10 = DummyClass59
        .method1040(GlTexture2d.anInt3765, var4 - var2, (byte) 0,
            DummyClass55.anInt1425);
    GlobalStatics_10
        .method282(DummyClass35.anIntArrayArray663[var1], var10, -98, var9,
            var0);

    while (var5 < var6) {
      var8 += 2;
      var7 += var8;
      int var11;
      int var12;
      int var13;
      int var14;
      if (var7 > 0) {
        --var6;
        var11 = -var6 + var1;
        var7 -= var6 << 1;
        var12 = var1 + var6;
        if (var12 >= DummyClass13.anInt2020
            && var11 <= GlobalStatics_9.anInt902) {
          var13 = DummyClass59
              .method1040(GlTexture2d.anInt3765, var4 + var5, (byte) 0,
                  DummyClass55.anInt1425);
          var14 = DummyClass59
              .method1040(GlTexture2d.anInt3765, -var5 + var4, (byte) 0,
                  DummyClass55.anInt1425);
          if (GlobalStatics_9.anInt902 >= var12) {
            GlobalStatics_10
                .method282(DummyClass35.anIntArrayArray663[var12], var14,
                    var3 ^ 111,
                    var13, var0);
          }

          if (DummyClass13.anInt2020 <= var11) {
            GlobalStatics_10
                .method282(DummyClass35.anIntArrayArray663[var11], var14, -84,
                    var13,
                    var0);
          }
        }
      }

      ++var5;
      var11 = -var5 + var1;
      var12 = var5 + var1;
      if (var12 >= DummyClass13.anInt2020
          && GlobalStatics_9.anInt902 >= var11) {
        var13 = DummyClass59
            .method1040(GlTexture2d.anInt3765, var4 + var6, (byte) 0,
                DummyClass55.anInt1425);
        var14 = DummyClass59
            .method1040(GlTexture2d.anInt3765, -var6 + var4, (byte) 0,
                DummyClass55.anInt1425);
        if (var12 <= GlobalStatics_9.anInt902) {
          GlobalStatics_10
              .method282(DummyClass35.anIntArrayArray663[var12], var14, 90,
                  var13,
                  var0);
        }

        if (var11 >= DummyClass13.anInt2020) {
          GlobalStatics_10
              .method282(DummyClass35.anIntArrayArray663[var11], var14, -103,
                  var13,
                  var0);
        }
      }
    }
  }

  public static void clear97(int var0) {
    GlobalStatics_9.aClass3_Sub28_Sub16_812 = null;
    if (var0 < 54) {
      GlobalStatics_9.anInt819 = -109;
    }

    GlobalStatics_9.aClass47_818 = null;
    GlobalStatics_9.tileOnScreen = null;
  }

  public static void method1394(byte var0) {
    GlobalStatics_9.anIntArray1138 = null;
    int var1 = 118 / ((-33 - var0) / 45);
    GlobalStatics_9.aClass93_1131 = null;
    GameStringStatics.aClass94_1133 = null;
    GlobalStatics_9.aClass93_1135 = null;
    GlobalStatics_9.aClass3_Sub28_Sub16Array1136 = null;
  }

  public static long method1395(int var0, int var1, int var2) {
    SceneGraphTile var3 = GLStatics.sceneGraphTiles[var0][var1][var2];
    return var3 != null && var3.aClass19_2233 != null
        ? var3.aClass19_2233.aLong428 : 0L;
  }

  public static void method1396(int var0) {
    int var2 = GlobalStatics_7.viewY;
    int var1 = DummyClass51.viewX;
    int var4 =
        -GlobalStatics_9.viewHeight + GlobalStatics_9.windowHeight - var2;
    int var3 = -var1 + GlobalStatics_6.windowWidth - DummyClass30.viewWidth;
    if (var1 > var0 || var3 > 0 || var2 > 0 || var4 > 0) {
      try {
        Component var5 = null;
        if (GlobalStatics_10.fullScreenFrame != null) {
          var5 = GlobalStatics_10.fullScreenFrame;
        } else {
          if (GlobalStatics_10.FRAME != null) {
            var5 = GlobalStatics_10.FRAME;
          }
        }

        int var7 = 0;
        int var6 = 0;
        if (GlobalStatics_10.FRAME == var5) {
          assert GlobalStatics_10.FRAME != null;
          Insets var8 = GlobalStatics_10.FRAME.getInsets();
          var6 = var8.left;
          var7 = var8.top;
        }

        Graphics var11 = var5.getGraphics();
        var11.setColor(Color.black);
        if (var1 > 0) {
          var11.fillRect(var6, var7, var1, GlobalStatics_9.windowHeight);
        }

        if (var2 > 0) {
          var11.fillRect(var6, var7, GlobalStatics_6.windowWidth, var2);
        }

        if (var3 > 0) {
          var11.fillRect(-var3 + var6 + GlobalStatics_6.windowWidth, var7, var3,
              GlobalStatics_9.windowHeight);
        }

        if (var4 > 0) {
          var11.fillRect(var6, -var4 + var7 + GlobalStatics_9.windowHeight,
              GlobalStatics_6.windowWidth, var4);
        }
      } catch (Exception var9) {
      }
    }
  }

  public static void method1587(byte var0, Buffer var1) {
    label134:
    while (true) {
      if (var1.bytes.length > var1.position) {
        boolean var18 = false;
        int var5 = 0;
        int var6 = 0;
        if (var1.readUnsignedByte() == 1) {
          var5 = var1.readUnsignedByte();
          var18 = true;
          var6 = var1.readUnsignedByte();
        }

        int var7 = var1.readUnsignedByte();
        int var8 = var1.readUnsignedByte();
        int var9 = -GlobalStatics_10.anInt3256 + 64 * var7;
        int var10 = -(var8 * 64) - (-GlobalStatics_9.anInt65 + 1)
            + DummyClass58.anInt1460;
        int var11;
        int var12;
        if (var9 >= 0 && -63 + var10 >= 0 && DummyClass30.anInt455 > var9 + 63
            && var10 < DummyClass58.anInt1460) {
          var11 = var9 >> 6;
          var12 = var10 >> 6;
          int var13 = 0;

          while (true) {
            if (var13 >= 64) {
              continue label134;
            }

            for (int var14 = 0; var14 < 64; ++var14) {
              if (!var18 || 8 * var5 <= var13 && var13 < 8 * var5 + 8
                  && var14 >= 8
                  * var6 && var14 < var6 * 8 + 8) {
                int var15 = var1.readUnsignedByte();
                if (var15 != 0) {
                  int var2;
                  if ((1 & var15) == 1) {
                    var2 = var1.readUnsignedByte();
                    if (com.jagex.runescape.statics.GlobalStatics_0.aByteArrayArrayArray640[var11][var12]
                        == null) {
                      com.jagex.runescape.statics.GlobalStatics_0.aByteArrayArrayArray640[var11][var12] = new byte[4096];
                    }

                    com.jagex.runescape.statics.GlobalStatics_0.aByteArrayArrayArray640[var11][var12][
                        var13 + (-var14 + 63
                            << 6)] = (byte) var2;
                  }

                  if ((var15 & 2) == 2) {
                    var2 = var1.readUnsignedMedium((byte) 85);
                    if (GlobalStatics_9.anIntArrayArrayArray558[var11][var12]
                        == null) {
                      GlobalStatics_9.anIntArrayArrayArray558[var11][var12] = new int[4096];
                    }

                    GlobalStatics_9.anIntArrayArrayArray558[var11][var12][
                        (-var14 + 63 << 6)
                            + var13] = var2;
                  }

                  if ((var15 & 4) == 4) {
                    var2 = var1.readUnsignedMedium((byte) 117);
                    if (GlobalStatics_4.anIntArrayArrayArray720[var11][var12]
                        == null) {
                      GlobalStatics_4.anIntArrayArrayArray720[var11][var12] = new int[4096];
                    }

                    --var2;
                    GameObjectConfig var3 = DummyClass11.method2207(4, var2);
                    if (var3.anIntArray1524 != null) {
                      var3 = var3.method1685(0);
                      if (var3 == null || var3.anInt1482 == -1) {
                        continue;
                      }
                    }

                    GlobalStatics_4.anIntArrayArrayArray720[var11][var12][
                        (-var14 + 63 << 6)
                            + var13] = 1 + var3.anInt1527;
                    SomethingOtherWorldMap var16 = new SomethingOtherWorldMap();
                    var16.anInt2532 = var3.anInt1482;
                    var16.anInt2531 = var9;
                    var16.anInt2539 = var10;
                    DummyClass51.aClass61_1162.addLast(var16);
                  }
                }
              }
            }

            ++var13;
          }
        }

        var11 = 0;

        while (true) {
          if (var11 >= (var18 ? 64 : 4096)) {
            continue label134;
          }

          var12 = var1.readUnsignedByte();
          if (var12 != 0) {
            if ((var12 & 1) == 1) {
              ++var1.position;
            }

            if ((var12 & 2) == 2) {
              var1.position += 2;
            }

            if ((var12 & 4) == 4) {
              var1.position += 3;
            }
          }

          ++var11;
        }
      }

      int var4 = -58 % ((var0 - 42) / 32);
      return;
    }
  }

  public static void clear10(byte var0) {
    if (var0 <= 38) {
      GlobalStatics_9.clear10((byte) -126);
    }

    GameStringStatics.aClass94_1349 = null;
    GameStringStatics.aClass94_1348 = null;
  }

  public static void method943(int var0) {
    GameStringStatics.aClass94_468 = null;
    GameStringStatics.aClass94_473 = null;
    if (var0 == -9893) {
      GameStringStatics.aClass94_477 = null;
      GameStringStatics.aClass94_465 = null;
      GameStringStatics.aClass94_462 = null;
      GameStringStatics.aClass94_463 = null;
      GameStringStatics.aClass94_461 = null;
    }
  }

  public static boolean method944(byte var0, int var1, int var2, byte[] var3) {
    int var4 = 106 % ((-11 - var0) / 51);
    boolean var5 = true;
    int var7 = -1;
    Buffer var6 = new Buffer(var3);

    while (true) {
      int var8 = var6.method773((byte) -121);
      if (var8 == 0) {
        return var5;
      }

      int var9 = 0;
      var7 += var8;
      boolean var10 = false;

      while (true) {
        int var11;
        if (var10) {
          var11 = var6.readUnsignedShortSmart();
          if (var11 == 0) {
            break;
          }

          var6.readUnsignedByte();
        } else {
          var11 = var6.readUnsignedShortSmart();
          if (var11 == 0) {
            break;
          }

          var9 += var11 - 1;
          int var12 = 63 & var9;
          int var13 = (4088 & var9) >> 6;
          int var16 = var2 + var12;
          int var15 = var1 + var13;
          int var14 = var6.readUnsignedByte() >> 2;
          if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
            GameObjectConfig var17 = DummyClass11.method2207(4, var7);
            if (var14 != 22 || SettingsStatics.aBoolean1905
                || var17.anInt1529 != 0
                || var17.anInt1538 == 1 || var17.aBoolean1483) {
              var10 = true;
              if (!var17.method1694(false)) {
                var5 = false;
                ++DummyClass11.anInt2038;
              }
            }
          }
        }
      }
    }
  }

  public static void method945(byte var0) {
    GlobalStatics_9.GAME_BUFFER.method807((byte) -98);
    int var1 = GlobalStatics_9.GAME_BUFFER.readBits(8);
    int var2;
    if (DummyClass6.anInt2046 > var1) {
      for (var2 = var1; var2 < DummyClass6.anInt2046; ++var2) {
        GlobalStatics_10.anIntArray2292[DummyClass17.anInt1829++] = GlobalStatics_2.anIntArray347[var2];
      }
    }

    if (DummyClass6.anInt2046 < var1) {
      throw new RuntimeException("gnpov1");
    } else {
      DummyClass6.anInt2046 = 0;

      for (var2 = 0; var2 < var1; ++var2) {
        int var3 = GlobalStatics_2.anIntArray347[var2];
        NPC var4 = GlobalStatics_8.NPCS[var3];
        int var5 = GlobalStatics_9.GAME_BUFFER.readBits(1);
        if (var5 == 0) {
          GlobalStatics_2.anIntArray347[DummyClass6.anInt2046++] = var3;
          var4.anInt2838 = GlobalStatics_4.updateCycle;
        } else {
          int var6 = GlobalStatics_9.GAME_BUFFER.readBits(2);
          if (var6 == 0) {
            GlobalStatics_2.anIntArray347[DummyClass6.anInt2046++] = var3;
            var4.anInt2838 = GlobalStatics_4.updateCycle;
            DummyClass60.anIntArray441[GlobalStatics_9.anInt997++] = var3;
          } else {
            int var7;
            int var8;
            if (var6 == 1) {
              GlobalStatics_2.anIntArray347[DummyClass6.anInt2046++] = var3;
              var4.anInt2838 = GlobalStatics_4.updateCycle;
              var7 = GlobalStatics_9.GAME_BUFFER.readBits(3);
              var4.method1968(1, (byte) 32, var7);
              var8 = GlobalStatics_9.GAME_BUFFER.readBits(1);
              if (var8 == 1) {
                DummyClass60.anIntArray441[GlobalStatics_9.anInt997++] = var3;
              }
            } else {
              if (var6 == 2) {
                GlobalStatics_2.anIntArray347[DummyClass6.anInt2046++] = var3;
                var4.anInt2838 = GlobalStatics_4.updateCycle;
                if (GlobalStatics_9.GAME_BUFFER.readBits(1) == 1) {
                  var7 = GlobalStatics_9.GAME_BUFFER.readBits(3);
                  var4.method1968(2, (byte) -122, var7);
                  var8 = GlobalStatics_9.GAME_BUFFER.readBits(3);
                  var4.method1968(2, (byte) 85, var8);
                } else {
                  var7 = GlobalStatics_9.GAME_BUFFER.readBits(3);
                  var4.method1968(0, (byte) -80, var7);
                }

                var7 = GlobalStatics_9.GAME_BUFFER.readBits(1);
                if (var7 == 1) {
                  DummyClass60.anIntArray441[GlobalStatics_9.anInt997++] = var3;
                }
              } else if (var6 == 3) {
                GlobalStatics_10.anIntArray2292[DummyClass17.anInt1829++] = var3;
              }
            }
          }
        }
      }

    }
  }

  public static void method949(int var0, int var2, int var3, int var4) {
    int var6 = 0;
    GlobalStatics_10
        .method282(DummyClass35.anIntArrayArray663[var4], -var2 + var0, 100,
            var0 + var2, var3);
    int var8 = -var2;
    int var7 = var2;
    int var9 = -1;

    while (var6 < var7) {
      ++var6;
      var9 += 2;
      var8 += var9;
      if (var8 >= 0) {
        --var7;
        var8 -= var7 << 1;
        int[] var10 = DummyClass35.anIntArrayArray663[var4 + var7];
        int[] var11 = DummyClass35.anIntArrayArray663[var4 - var7];
        int var12 = var0 + var6;
        int var13 = -var6 + var0;
        GlobalStatics_10.method282(var10, var13, 115, var12, var3);
        GlobalStatics_10.method282(var11, var13, 114, var12, var3);
      }

      int var16 = var7 + var0;
      int var15 = -var7 + var0;
      int[] var17 = DummyClass35.anIntArrayArray663[var4 + var6];
      int[] var18 = DummyClass35.anIntArrayArray663[-var6 + var4];
      GlobalStatics_10.method282(var17, var15, -61, var16, var3);
      GlobalStatics_10.method282(var18, var15, -93, var16, var3);
    }
  }

  public static void method950(Widget var0, int var2, int var3) {
    if (GlobalStatics_10.amountContextActions >= 2 || GlobalStatics_9.anInt3012
        != 0
        || GlobalStatics_9.aBoolean1837) {

      GameString var4 = GlobalStatics_9.method531((byte) 94);
      if (var0 == null) {
        int var5 =
            GlobalStatics_8.aClass3_Sub28_Sub17_2096
                .method683(var4, 4 + var3, var2 + 15, 16777215, 0,
                    GlobalStatics_10.random, DummyClass36.anInt2618);
        GlobalStatics_3.method1340(4 + var3,
            GlobalStatics_8.aClass3_Sub28_Sub17_2096.method682(var4) + var5,
            (byte) -40, var2, 15);
      } else {
        AbstractFont font = var0
            .method868(GlobalStatics_9.aClass109Array3270, 0);
        if (font == null) {
          font = GlobalStatics_8.aClass3_Sub28_Sub17_2096;
        }

        font.method702(var4, var3, var2, var0.anInt168, var0.zoom,
            var0.anInt218,
            var0.anInt287, var0.anInt194, var0.anInt225,
            GlobalStatics_10.random,
            DummyClass36.anInt2618, GlobalStatics_9.anIntArray3951);
        GlobalStatics_3.method1340(GlobalStatics_9.anIntArray3951[0],
            GlobalStatics_9.anIntArray3951[2],
            (byte) -40, GlobalStatics_9.anIntArray3951[1],
            GlobalStatics_9.anIntArray3951[3]);
      }

    }
  }

  public static void method951(int var0) {
    GlTexture2d.aBoolean3769 = false;
    GlobalStatics_10.anInt3413 = 0;
    GlobalStatics_5.loginResponse = -3;
    GlobalStatics_8.anInt820 = 0;
    GlobalStatics_10.LOGIN_STATE = 1;
    GlobalStatics_9.anInt2079 = var0;
    GlobalStatics_9.anInt2561 = -1;
  }

  public static void method382(int var0) {
    GlobalStatics_9.anIntArray2469 = null;
    GlobalStatics_9.aClass61_2468 = null;
    if (var0 == 1) {
      GlobalStatics_9.anIntArray2470 = null;
    }
  }

  public static void method383(int var0, int var1) {
    if (var1 == DummyClass30.anInt453 && var1 != 0) {
      MaterialShader var2 = GlobalStatics_9.anInterface5Array70[var1];
      var2.set(GlobalStatics_10.anInt3263);
    }

    if (var0 != -32584) {
      GlobalStatics_9.method383(60, 23);
    }
  }

  public static void method509(int var0, int var1) {
    --GlobalStatics_10.amountContextActions;
    if (GlobalStatics_10.amountContextActions != var1) {
      ArrayUtils.copy(GameStringStatics.aClass94Array2935, var1 + 1,
          GameStringStatics.aClass94Array2935, var1,
          -var1 + GlobalStatics_10.amountContextActions);
      ArrayUtils.copy(DummyClass8.aClass94Array4016, 1 + var1,
          DummyClass8.aClass94Array4016,
          var1, GlobalStatics_10.amountContextActions - var1);
      ArrayUtils.method1358(GlobalStatics_9.anIntArray1578, 1 + var1,
          GlobalStatics_9.anIntArray1578, var1,
          -var1 + GlobalStatics_10.amountContextActions);
      ArrayUtils.method1361(GlobalStatics_10.aShortArray3095, 1 + var1,
          GlobalStatics_10.aShortArray3095, var1,
          GlobalStatics_10.amountContextActions - var1);
      ArrayUtils.method1356(GlobalStatics_9.aLongArray3271, 1 + var1,
          GlobalStatics_9.aLongArray3271, var1,
          -var1 + GlobalStatics_10.amountContextActions);
      ArrayUtils.method1358(DummyClass26.anIntArray1613, var1 + var0,
          DummyClass26.anIntArray1613,
          var1, -var1 + GlobalStatics_10.amountContextActions);
      ArrayUtils.method1358(DummyClass32.anIntArray512, 1 + var1,
          DummyClass32.anIntArray512,
          var1, GlobalStatics_10.amountContextActions - var1);
    }
  }

  public static void method510(int var0) {
    if (var0 > -73) {
      GlobalStatics_9.method510(-59);
    }

    GlobalStatics_9.frameRateRegulator = null;
    GlobalStatics_9.aShortArray2548 = null;
    GlobalStatics_9.anIntArray2550 = null;
  }

  public static boolean method609(Widget var0, int var1) {
    if (var0.anIntArray275 != null) {
      int var2 = 0;
      if (var1 <= 20) {
        GameStringStatics.aClass94_3651 = null;
      }

      for (; var2 < var0.anIntArray275.length; ++var2) {
        int var3 = GlobalStatics_9.method2247((byte) 119, var2, var0);
        int var4 = var0.anIntArray307[var2];
        if (var0.anIntArray275[var2] != 2) {
          if (var0.anIntArray275[var2] != 3) {
            if (var0.anIntArray275[var2] == 4) {
              if (var3 == var4) {
                return false;
              }
            } else if (var4 != var3) {
              return false;
            }
          } else if (var3 <= var4) {
            return false;
          }
        } else if (var4 <= var3) {
          return false;
        }
      }

      return true;
    } else {
      return false;
    }
  }

  public static void method611(int var0, int var1, GameString var2,
      GameString var3, byte var4,
      GameString var5) {
    if (var4 != 50) {
      GlobalStatics_9.aShortArrayArray3654 = null;
    }

    for (int var6 = 99; var6 > 0; --var6) {
      GlobalStatics_10.anIntArray3082[var6] = GlobalStatics_10.anIntArray3082[
          var6 - 1];
      GameStringStatics.aClass94Array3226[var6] = GameStringStatics.aClass94Array3226[
          var6 - 1];
      com.jagex.runescape.statics.GlobalStatics_0.aClass94Array2580[var6] = com.jagex.runescape.statics.GlobalStatics_0.aClass94Array2580[
          -1 + var6];
      DummyClass4.aClass94Array3003[var6] = DummyClass4.aClass94Array3003[var6
          - 1];
      GlobalStatics_9.anIntArray1835[var6] = GlobalStatics_9.anIntArray1835[var6
          - 1];
    }

    ++GlobalStatics_10.anInt3114;
    GlobalStatics_10.anIntArray3082[0] = var1;
    GameStringStatics.aClass94Array3226[0] = var5;
    GlobalStatics_9.anInt472 = GlobalStatics_10.anInt3213;
    GlobalStatics_9.anIntArray1835[0] = var0;
    com.jagex.runescape.statics.GlobalStatics_0.aClass94Array2580[0] = var2;
    DummyClass4.aClass94Array3003[0] = var3;
  }

  public static GameString method612(long var0, byte var2) {
    return var2 <= 85 ? null : GlobalStatics_9.method207(10, false, 116, var0);
  }

  public static void method613(int var0) {
    GameStringStatics.aClass94_3646 = null;
    GameStringStatics.aClass94_3656 = null;
    GlobalStatics_8.GAME_CANVAS = null;
    GameStringStatics.aClass94_3649 = null;
    GlobalStatics_9.aClass94_3653 = null;
    GlobalStatics_9.aShortArrayArray3654 = null;
    if (var0 > 22) {
      GameStringStatics.aClass94_3651 = null;
      GameStringStatics.aClass94_3650 = null;
    }
  }

  public static void method1230(byte var0) {
    int var1 = GlobalStatics_1.anInt1462;
    int var2 = GlobalStatics_10.anInt3395;
    int var4 = GlobalStatics_9.anInt3537;
    int var3 = GlobalStatics_9.anInt3552;
    if (GlobalStatics_10.aClass3_Sub28_Sub16_3099 == null
        || DummyClass58.aClass3_Sub28_Sub16_1457 == null) {
      if (GlobalStatics_10.sprites.isLoaded(GlobalStatics_9.anInt502)
          && GlobalStatics_10.sprites.isLoaded(
          DummyClass54.anInt1400)) {
        GlobalStatics_10.aClass3_Sub28_Sub16_3099 =
            GlobalStatics_2
                .method562(GlobalStatics_10.sprites, 0,
                    GlobalStatics_9.anInt502,
                    (byte) 39);
        DummyClass58.aClass3_Sub28_Sub16_1457 =
            GlobalStatics_2
                .method562(GlobalStatics_10.sprites, 0, DummyClass54.anInt1400,
                    (byte) 39);
        if (GlRenderer.USE_OPENGL) {
          if (GlobalStatics_10.aClass3_Sub28_Sub16_3099 instanceof SoftwareDirectFullColorSprite) {
            GlobalStatics_10.aClass3_Sub28_Sub16_3099 = new GlDirectFullColorSprite(
                (SoftwareDirectColorSprite) GlobalStatics_10.aClass3_Sub28_Sub16_3099);
          } else {
            GlobalStatics_10.aClass3_Sub28_Sub16_3099 = new GlDirectColorSprite(
                (SoftwareDirectColorSprite) GlobalStatics_10.aClass3_Sub28_Sub16_3099);
          }

          if (DummyClass58.aClass3_Sub28_Sub16_1457 instanceof SoftwareDirectFullColorSprite) {
            DummyClass58.aClass3_Sub28_Sub16_1457 = new GlDirectFullColorSprite(
                (SoftwareDirectColorSprite) DummyClass58.aClass3_Sub28_Sub16_1457);
          } else {
            DummyClass58.aClass3_Sub28_Sub16_1457 = new GlDirectColorSprite(
                (SoftwareDirectColorSprite) DummyClass58.aClass3_Sub28_Sub16_1457);
          }
        }
      } else if (GlRenderer.USE_OPENGL) {
        GlUtils.fillQuad(var1, var2, var3, 20, GlobalStatics_10.anInt3600,
            -GlobalStatics_8.anInt963 + 256);
      } else {
        DummyClass47
            .method1312(var1, var2, var3, 20, GlobalStatics_10.anInt3600,
                -GlobalStatics_8.anInt963 + 256);
      }
    }

    int var5;
    int var6;
    if (GlobalStatics_10.aClass3_Sub28_Sub16_3099 != null
        && DummyClass58.aClass3_Sub28_Sub16_1457 != null) {
      var5 = var3 / GlobalStatics_10.aClass3_Sub28_Sub16_3099.anInt3707;

      for (var6 = 0; var5 > var6; ++var6) {
        GlobalStatics_10.aClass3_Sub28_Sub16_3099.method643(
            var6 * GlobalStatics_10.aClass3_Sub28_Sub16_3099.anInt3707 + var1,
            var2);
      }

      DummyClass58.aClass3_Sub28_Sub16_1457.method643(var1, var2);
      DummyClass58.aClass3_Sub28_Sub16_1457.method641(
          -DummyClass58.aClass3_Sub28_Sub16_1457.anInt3707 + var1 + var3,
          var2);
    }

    GlobalStatics_8.aClass3_Sub28_Sub17_2096
        .method681(GameStringStatics.aClass94_2667, var1 + 3,
            14 + var2, GlobalStatics_10.anInt3351, -1);
    if (GlRenderer.USE_OPENGL) {
      GlUtils
          .fillQuad(var1, 20 + var2, var3, var4 - 20,
              GlobalStatics_10.anInt3600,
              -GlobalStatics_8.anInt963 + 256);
    } else {
      DummyClass47.method1312(var1, 20 + var2, var3, -20 + var4,
          GlobalStatics_10.anInt3600,
          -GlobalStatics_8.anInt963 + 256);
    }

    var6 = com.jagex.runescape.statics.GlobalStatics_0.anInt1709;
    var5 = GlobalStatics_9.anInt1676;
    if (var0 < 85) {
      GameStringStatics.aClass94_965 = null;
    }

    int var7;
    int var8;
    for (var7 = 0; GlobalStatics_10.amountContextActions > var7; ++var7) {
      var8 = (-var7 + GlobalStatics_10.amountContextActions - 1) * 15 + var2
          + 35;
      if (var1 < var5 && var5 < var1 + var3 && var6 > -13 + var8
          && var6 < var8 + 3) {
        if (GlRenderer.USE_OPENGL) {
          GlUtils.fillQuad(var1, var8 - 13, var3, 16, GlobalStatics_9.anInt1926,
              -GlobalStatics_9.anInt1771 + 256);
        } else {
          DummyClass47.method1312(var1, var8 - 13, var3, 16,
              GlobalStatics_9.anInt1926,
              -GlobalStatics_9.anInt1771 + 256);
        }
      }
    }

    if ((DummyClass53.aClass3_Sub28_Sub16_1339 == null
        || GlobalStatics_8.aClass3_Sub28_Sub16_824 == null
        || GlobalStatics_9.aClass3_Sub28_Sub16_2560 == null)
        && GlobalStatics_10.sprites.isLoaded(DummyClass39.anInt739)
        && GlobalStatics_10.sprites.isLoaded(
        GlobalStatics_6.anInt1126) && GlobalStatics_10.sprites
        .isLoaded(GlobalStatics_9.anInt2937)) {
      DummyClass53.aClass3_Sub28_Sub16_1339 =
          GlobalStatics_2
              .method562(GlobalStatics_10.sprites, 0, DummyClass39.anInt739,
                  (byte) 39);
      GlobalStatics_8.aClass3_Sub28_Sub16_824 =
          GlobalStatics_2
              .method562(GlobalStatics_10.sprites, 0, GlobalStatics_6.anInt1126,
                  (byte) 39);
      GlobalStatics_9.aClass3_Sub28_Sub16_2560 =
          GlobalStatics_2
              .method562(GlobalStatics_10.sprites, 0, GlobalStatics_9.anInt2937,
                  (byte) 39);
      if (GlRenderer.USE_OPENGL) {
        if (DummyClass53.aClass3_Sub28_Sub16_1339 instanceof SoftwareDirectFullColorSprite) {
          DummyClass53.aClass3_Sub28_Sub16_1339 = new GlDirectFullColorSprite(
              (SoftwareDirectColorSprite) DummyClass53.aClass3_Sub28_Sub16_1339);
        } else {
          DummyClass53.aClass3_Sub28_Sub16_1339 = new GlDirectColorSprite(
              (SoftwareDirectColorSprite) DummyClass53.aClass3_Sub28_Sub16_1339);
        }

        if (GlobalStatics_8.aClass3_Sub28_Sub16_824 instanceof SoftwareDirectFullColorSprite) {
          GlobalStatics_8.aClass3_Sub28_Sub16_824 = new GlDirectFullColorSprite(
              (SoftwareDirectColorSprite) GlobalStatics_8.aClass3_Sub28_Sub16_824);
        } else {
          GlobalStatics_8.aClass3_Sub28_Sub16_824 = new GlDirectColorSprite(
              (SoftwareDirectColorSprite) GlobalStatics_8.aClass3_Sub28_Sub16_824);
        }

        if (GlobalStatics_9.aClass3_Sub28_Sub16_2560 instanceof SoftwareDirectFullColorSprite) {
          GlobalStatics_9.aClass3_Sub28_Sub16_2560 = new GlDirectFullColorSprite(
              (SoftwareDirectColorSprite) GlobalStatics_9.aClass3_Sub28_Sub16_2560);
        } else {
          GlobalStatics_9.aClass3_Sub28_Sub16_2560 = new GlDirectColorSprite(
              (SoftwareDirectColorSprite) GlobalStatics_9.aClass3_Sub28_Sub16_2560);
        }
      }
    }

    int var9;
    if (DummyClass53.aClass3_Sub28_Sub16_1339 != null
        && GlobalStatics_8.aClass3_Sub28_Sub16_824 != null
        && GlobalStatics_9.aClass3_Sub28_Sub16_2560 != null) {
      var7 = var3 / DummyClass53.aClass3_Sub28_Sub16_1339.anInt3707;

      for (var8 = 0; var7 > var8; ++var8) {
        DummyClass53.aClass3_Sub28_Sub16_1339.method643(
            var1 + DummyClass53.aClass3_Sub28_Sub16_1339.anInt3707 * var8,
            var4 + var2 - DummyClass53.aClass3_Sub28_Sub16_1339.anInt3696);
      }

      var8 = (-20 + var4) / GlobalStatics_8.aClass3_Sub28_Sub16_824.anInt3696;

      for (var9 = 0; var9 < var8; ++var9) {
        GlobalStatics_8.aClass3_Sub28_Sub16_824.method643(var1,
            var2 + 20
                + var9 * GlobalStatics_8.aClass3_Sub28_Sub16_824.anInt3696);
        GlobalStatics_8.aClass3_Sub28_Sub16_824.method641(
            var1 - (-var3 + GlobalStatics_8.aClass3_Sub28_Sub16_824.anInt3707),
            var2 + 20
                + var9 * GlobalStatics_8.aClass3_Sub28_Sub16_824.anInt3696);
      }

      GlobalStatics_9.aClass3_Sub28_Sub16_2560.method643(var1,
          var4 + var2
              - GlobalStatics_9.aClass3_Sub28_Sub16_2560.anInt3696);
      GlobalStatics_9.aClass3_Sub28_Sub16_2560.method641(
          var1 + var3
              - GlobalStatics_9.aClass3_Sub28_Sub16_2560.anInt3707,
          var2 + var4
              - GlobalStatics_9.aClass3_Sub28_Sub16_2560.anInt3696);
    }

    for (var7 = 0; var7 < GlobalStatics_10.amountContextActions; ++var7) {
      var8 = 15 * (GlobalStatics_10.amountContextActions - 1 - var7) + var2
          + 35;
      var9 = GlobalStatics_10.anInt3351;
      if (var1 < var5 && var3 + var1 > var5 && var8 - 13 < var6
          && var6 < var8 + 3) {
        var9 = DummyClass14.anInt1957;
      }

      GlobalStatics_8.aClass3_Sub28_Sub17_2096
          .method681(com.jagex.runescape.statics.GlobalStatics_0
                  .method802(var7, true), 3 + var1,
              var8, var9, 0);
    }

    GlobalStatics_9.method1282(GlobalStatics_1.anInt1462, (byte) 122,
        GlobalStatics_10.anInt3395, GlobalStatics_9.anInt3537,
        GlobalStatics_9.anInt3552);
  }

  public static void clear47(int var0) {
    GameStringStatics.aClass94_973 = null;
    GameStringStatics.aClass94_965 = null;
    if (var0 <= 116) {
      GlobalStatics_9.method1230((byte) -73);
    }
  }

  public static int method1232(NPC var0, int var1) {
    if (var1 == -1) {
      NpcConfiguration var2 = var0.config;
      if (var2.anIntArray1292 != null) {
        var2 = var2.method1471((byte) -108);
        if (var2 == null) {
          return -1;
        }
      }

      int var3 = var2.anInt1293;
      RenderAnimation var4 = var0.getRenderAnimationId(false);
      assert var4 != null;
      if (var4.anInt368 == var0.anInt2764) {
        var3 = var2.anInt1262;
      } else if (var0.anInt2764 != var4.anInt393
          && var4.anInt386 != var0.anInt2764
          && var0.anInt2764 != var4.anInt375
          && var0.anInt2764 != var4.anInt373) {
        if (var4.anInt398 == var0.anInt2764
            || var0.anInt2764 == var4.anInt372
            || var0.anInt2764 == var4.anInt379
            || var0.anInt2764 == var4.anInt406) {
          var3 = var2.anInt1290;
        }
      } else {
        var3 = var2.anInt1276;
      }

      return var3;
    } else {
      return 103;
    }
  }

  public static void clear72(int var0) {
    GlobalStatics_9.aClass93_1911 = null;
    GlobalStatics_9.sprites = null;
    if (var0 > 81) {
      GameStringStatics.aClass94_1915 = null;
      GameStringStatics.aClass94_1913 = null;
      GameStringStatics.aClass94_1917 = null;
      GameStringStatics.aClass94_1907 = null;
    }
  }

  public static void method2086(byte var0) {
    if (var0 >= 62) {
      int var1 =
          GlobalStatics_9.localPlayer.sceneX + GlobalStatics_10.anInt3216;
      int var2 =
          GlobalStatics_9.localPlayer.sceneY + GlobalStatics_2.anInt42;
      if (-var1 + GlobalStatics_10.CAMERA_X_OFFSET < 499
          || -var1 + GlobalStatics_10.CAMERA_X_OFFSET > 500
          || GlobalStatics_8.anInt942 - var2 < 499
          || -var2 + GlobalStatics_8.anInt942 > 500) {
        GlobalStatics_10.CAMERA_X_OFFSET = var1;
        GlobalStatics_8.anInt942 = var2;
      }

      if (GlobalStatics_8.anInt942 != var2) {
        GlobalStatics_8.anInt942 += (-GlobalStatics_8.anInt942 + var2) / 16;
      }

      if (GlobalStatics_10.CAMERA_X_OFFSET != var1) {
        GlobalStatics_10.CAMERA_X_OFFSET +=
            (-GlobalStatics_10.CAMERA_X_OFFSET + var1) / 16;
      }
      if (SettingsStatics.USE_INT_ARRAY_KEYBOARD_EVENTS) {
        for (int var3 = 0; GlobalStatics_9.anInt2537 > var3; ++var3) {
          int var4 = GlobalStatics_9.anIntArray1755[var3];
          if (var4 == KeyEvent.VK_NUMPAD2) {
            GlobalStatics_6.NEXT_CAMERA_PITCH =
                -16 & GlobalStatics_6.NEXT_CAMERA_PITCH
                    + 47;
          } else {
            if (var4 == 6) {
              GlobalStatics_6.NEXT_CAMERA_PITCH =
                  -16 & GlobalStatics_6.NEXT_CAMERA_PITCH
                      - 17;
            } else {
              if (var4 == KeyEvent.VK_NUMPAD0) {
                GlobalStatics_9.NEXT_CAMERA_YAW =
                    GlobalStatics_9.NEXT_CAMERA_YAW - 65 & -128;
              } else {
                if (var4 == KeyEvent.VK_NUMPAD1) {
                  GlobalStatics_9.NEXT_CAMERA_YAW =
                      GlobalStatics_9.NEXT_CAMERA_YAW + 191 & -128;
                }
              }
            }
          }
        }
      } else {

        if (KeyboardStatics.PRESSED_KEYS[KeyEvent.VK_NUMPAD2]) {
          DummyClass32.NEXT_CAMERA_PITCH_DELTA +=
              (-DummyClass32.NEXT_CAMERA_PITCH_DELTA
                  + 12) / 2;
        } else if (!KeyboardStatics.PRESSED_KEYS[KeyEvent.VK_NUMPAD3]) {
          DummyClass32.NEXT_CAMERA_PITCH_DELTA /= 2;
        } else {
          DummyClass32.NEXT_CAMERA_PITCH_DELTA +=
              (-DummyClass32.NEXT_CAMERA_PITCH_DELTA
                  - 12) / 2;
        }

        if (KeyboardStatics.PRESSED_KEYS[KeyEvent.VK_NUMPAD0]) {
          GlobalStatics_9.NEXT_CAMERA_YAW_DELTA +=
              (-GlobalStatics_9.NEXT_CAMERA_YAW_DELTA
                  - 24) / 2;
        } else {
          if (KeyboardStatics.PRESSED_KEYS[KeyEvent.VK_NUMPAD1]) {
            GlobalStatics_9.NEXT_CAMERA_YAW_DELTA +=
                (-GlobalStatics_9.NEXT_CAMERA_YAW_DELTA
                    + 24) / 2;
          } else {
            GlobalStatics_9.NEXT_CAMERA_YAW_DELTA /= 2;
          }
        }

        GlobalStatics_6.NEXT_CAMERA_PITCH +=
            DummyClass32.NEXT_CAMERA_PITCH_DELTA / 2;
        GlobalStatics_9.NEXT_CAMERA_YAW +=
            GlobalStatics_9.NEXT_CAMERA_YAW_DELTA / 2;
      }

      GlobalStatics_6.method1098((byte) -94);
    }
  }

  public static void method953(int var0, int var1) {
    GlobalStatics_9.aClass93_1569.method1522(var0 ^ 13501, var1);
    if (var0 != -13508) {
      GameStringStatics.aClass94_485 = null;
    }

    GlobalStatics_9.aClass93_2428.method1522(-126, var1);
    GlobalStatics_6.aClass93_743.method1522(-126, var1);
  }

  public static void method954(int var0) {
    GlobalStatics_9.aClass47_480 = null;
    GlobalStatics_9.anIntArrayArray499 = null;
    GameStringStatics.aClass94_492 = null;
    if (var0 != 128) {
      GlobalStatics_9.method954(113);
    }

    GameStringStatics.aClass94_485 = null;
  }

  public static void method955(int[][] var0, boolean var1, int var2,
      SomethingGl0 var3, int[] var4,
      int var5, int var6, int var7, boolean var8, float[][] var9,
      boolean var10, int var11, float[][] var12, int var13, int var14,
      int var15, boolean var16, int[][] var17, float[][] var18, byte var19,
      int var20, boolean[] var21) {
    int var22 = (var2 << 8) + (var1 ? 255 : 0);
    int var24 = (var8 ? 255 : 0) + (var15 << 8);
    int[] var26 = new int[var4.length / var11];
    int var25 = (var10 ? 255 : 0) + (var14 << 8);
    int var23 = (var20 << 8) + (var16 ? 255 : 0);

    for (int var27 = 0; var27 < var26.length; ++var27) {
      int var28 = var4[var27 + var27];
      int[][] var30 =
          var0 != null && var21 != null && var21[var27] ? var0 : var17;
      int var29 = var4[var27 + var27 + 1];
      var26[var27] =
          GlobalStatics_6
              .method1734(var25, var13, var22, var23, var0, var30, var7, var18,
                  var24,
                  (byte) -116, var19, false, var3, var9, var5, var28, var12,
                  var29);
    }

    var3.method150(var6, var7, var5, var26, null, false);
  }

  public static void method956(Object[] var0, int var1, int[] var2, int var3,
      int var4) {
    if (var4 < var1) {
      int var5 = (var4 + var1) / 2;
      int var7 = var2[var5];
      int var6 = var4;
      var2[var5] = var2[var1];
      var2[var1] = var7;
      Object var8 = var0[var5];
      var0[var5] = var0[var1];
      var0[var1] = var8;

      for (int var9 = var4; var9 < var1; ++var9) {
        if ((var9 & 1) + var7 > var2[var9]) {
          int var10 = var2[var9];
          var2[var9] = var2[var6];
          var2[var6] = var10;
          Object var11 = var0[var9];
          var0[var9] = var0[var6];
          var0[var6++] = var11;
        }
      }

      var2[var1] = var2[var6];
      var2[var6] = var7;
      var0[var1] = var0[var6];
      var0[var6] = var8;
      GlobalStatics_9.method956(var0, var6 - 1, var2, 47, var4);
      GlobalStatics_9.method956(var0, var1, var2, 100, 1 + var6);
    }

    if (var3 < 16) {
      GlobalStatics_9
          .method955(null, true, 94, null, null, -50, -107, -51, false, null,
              true,
              73, null, -92, -7,
              -23, true, null, null, (byte) 52, 41, null);
    }
  }

  public static void method958() {
    if (GlobalStatics_9.aBoolean1837) {
      Widget var1 =
          GlobalStatics_2
              .method638((byte) -19, GlobalStatics_9.anInt872,
                  GlobalStatics_10.anInt278);
      if (var1 != null && var1.anObjectArray303 != null) {
        ClientScriptCall var3 = new ClientScriptCall();
        var3.arguments = var1.anObjectArray303;
        var3.aClass11_2449 = var1;
        GLStatics.executeScript(var3);
      }

      GlobalStatics_9.aBoolean1837 = false;
      GlobalStatics_6.anInt3590 = -1;
      DummyClass29.method909(-107, var1);
    }
  }

  public static void method959(int var0) {
    GlobalStatics_7.aClass93_2450.method1524(3);
    if (var0 != 0) {
      SettingsStatics.SHOULD_USE_OPENGL = true;
    }
  }

  public static boolean method715(int var0, Widget var1) {
    if (var0 == var1.anInt189) {
      DummyClass13.anInt2023 = 250;
      return true;
    } else {
      return false;
    }
  }

  public static void method716(int var0) {
    GlobalStatics_9.aClass93_1772.method1524(3);
    if (var0 != 14073) {
      GlobalStatics_9.method717(9);
    }
  }

  public static void method717(int var0) {
    GameStringStatics.aClass94_3777 = null;
    GameStringStatics.aClass94_3774 = null;
    int var1 = 54 % ((48 - var0) / 56);
    GlobalStatics_9.anIntArray3780 = null;
    GlobalStatics_9.animationBases = null;
    GlobalStatics_9.aClass47_3776 = null;
    GameStringStatics.aClass94_3771 = null;
  }

  public static void method820(int var0, int var1) {
    GlobalStatics_9.aClass93_1911.method1522(-127, var0);
    if (var1 == 64) {
      GlobalStatics_9.aClass93_1131.method1522(-126, var0);
    }
  }

  public static void clear43(int var0) {
    GlobalStatics_9.aClass93_2604 = null;
    GlobalStatics_9.anIntArray2606 = null;
    GlobalStatics_9.COMMAND_DROP_JS5 = null;
    GameStringStatics.aClass94_2608 = null;
    if (var0 != 26971) {
      GlobalStatics_9.method820(-51, -76);
    }
  }

  public static GameString[] method822(int var0, GameString[] var1) {
    GameString[] var2 = new GameString[5];
    if (var0 != 19406) {
      GlobalStatics_9.clear43(-26);
    }

    for (int var3 = 0; var3 < 5; ++var3) {
      var2[var3] = GlobalStatics_9.concat(
          new GameString[]{GlobalStatics_9.toString(var3),
              GameStringStatics.aClass94_3577});
      if (var1 != null && var1[var3] != null) {
        var2[var3] = GlobalStatics_9
            .concat(new GameString[]{var2[var3], var1[var3]});
      }
    }

    return var2;
  }

  public static int method599(int var0, FileUnpacker var1) {
    int var2 = 0;
    if (var0 == -20916) {
      if (var1.isLoaded(DummyClass14.titleBackgroundFileId)) {
        ++var2;
      }

      if (var1.isLoaded(GlobalStatics_6.logoFileId)) {
        ++var2;
      }

      return var2;
    } else {
      return -88;
    }
  }

  public static AbstractDirectColorSprite method602(int var0, int var1,
      byte var2,
      FileUnpacker var3) {
    if (GlobalStatics_9.loadSprites(var3, var0, var1, var2 ^ 30885)) {
      if (var2 != -18) {
        GlobalStatics_9.method607(true);
      }

      return GLStatics.method1062(var2 + 103);
    } else {
      return null;
    }
  }

  public static void method603(int var0, int var1, int var2, Widget var3,
      boolean var4) {
    int var5 = var3.anInt168;
    int var6 = var3.zoom;
    if (var1 != 13987) {
      GlobalStatics_9.method602(-115, 65, (byte) -119, null);
    }

    if (var3.aByte304 == 0) {
      var3.anInt168 = var3.anInt177;
    } else {
      if (var3.aByte304 == 1) {
        var3.anInt168 = var2 - var3.anInt177;
      } else {
        if (var3.aByte304 == 2) {
          var3.anInt168 = var3.anInt177 * var2 >> 14;
        } else if (var3.aByte304 == 3) {
          if (var3.anInt187 == 2) {
            var3.anInt168 =
                var3.anInt177 * 32 + (var3.anInt177 - 1) * var3.anInt285;
          } else {
            if (var3.anInt187 == 7) {
              var3.anInt168 =
                  115 * var3.anInt177 + var3.anInt285 * (-1 + var3.anInt177);
            }
          }
        }
      }
    }

    if (var3.aByte241 == 0) {
      var3.zoom = var3.anInt244;
    } else if (var3.aByte241 == 1) {
      var3.zoom = -var3.anInt244 + var0;
    } else if (var3.aByte241 == 2) {
      var3.zoom = var0 * var3.anInt244 >> 14;
    } else if (var3.aByte241 == 3) {
      if (var3.anInt187 == 2) {
        var3.zoom =
            (var3.anInt244 - 1) * var3.anInt290 + var3.anInt244 * 32;
      } else if (var3.anInt187 == 7) {
        var3.zoom =
            var3.anInt244 * 12 + (-1 + var3.anInt244) * var3.anInt290;
      }
    }

    if (var3.aByte304 == 4) {
      var3.anInt168 = var3.anInt216 * var3.zoom / var3.anInt160;
    }

    if (var3.aByte241 == 4) {
      var3.zoom = var3.anInt160 * var3.anInt168 / var3.anInt216;
    }

    if (GlobalStatics_9.aBoolean1040 && (
        GlobalStatics_8.method44(var3).anInt2205 != 0
            || var3.anInt187 == 0)) {
      if (var3.zoom < 5 && var3.anInt168 < 5) {
        var3.zoom = 5;
        var3.anInt168 = 5;
      } else {
        if (var3.anInt168 <= 0) {
          var3.anInt168 = 5;
        }

        if (var3.zoom <= 0) {
          var3.zoom = 5;
        }
      }
    }

    if (var3.anInt189 == 1337) {
      GlobalStatics_8.aClass11_2091 = var3;
    }

    if (var4 && var3.anObjectArray235 != null && (var5 != var3.anInt168
        || var3.zoom != var6)) {
      ClientScriptCall var7 = new ClientScriptCall();
      var7.arguments = var3.anObjectArray235;
      var7.aClass11_2449 = var3;
      DummyClass31.aClass61_1471.addLast(var7);
    }
  }

  public static void method605(int var0) {
    GameStringStatics.aClass94_3637 = null;
    GameStringStatics.aClass94_3638 = null;
    GameStringStatics.aClass94_3639 = null;
    GameStringStatics.aClass94_3643 = null;
    GameStringStatics.aClass94_3645 = null;
  }

  public static void method606(int var0, AreaSoundEffect var1, int var2,
      int var3, int var4,
      int var5) {
    if (var5 > 44) {
      if (var1.anInt2332 != -1 || var1.anIntArray2333 != null) {
        int var6 = 0;
        if (var1.anInt2321 < var0) {
          var6 += -var1.anInt2321 + var0;
        } else if (var1.anInt2326 > var0) {
          var6 += var1.anInt2326 - var0;
        }

        if (var1.anInt2307 >= var4) {
          if (var4 < var1.anInt2308) {
            var6 += -var4 + var1.anInt2308;
          }
        } else {
          var6 += -var1.anInt2307 + var4;
        }

        if (var1.anInt2328 != 0 && var1.anInt2328 >= var6 - 64 &&
            SettingsStatics.anInt340 != 0
            && var2 == var1.anInt2314) {
          var6 -= 64;
          if (var6 < 0) {
            var6 = 0;
          }

          int var7 =
              (-var6 + var1.anInt2328) * SettingsStatics.anInt340
                  / var1.anInt2328;
          if (var1.aClass3_Sub24_Sub1_2312 == null) {
            if (var1.anInt2332 >= 0) {
              SoundEffect var8 =
                  MidiSomethingStatics
                      .method1811(GlobalStatics_5.soundEffects, var1.anInt2332,
                          0);
              if (var8 != null) {
                SomethingMusic0 var9 = var8.method1812()
                    .method151(DummyClass32.aClass157_524);
                AudioStreamEncoder1 var10 = GlobalStatics_11
                    .method437(var9, 100, var7);
                assert var10 != null;
                var10.method429(-1);
                GlobalStatics_9.aClass3_Sub24_Sub2_2563.method457(var10);
                var1.aClass3_Sub24_Sub1_2312 = var10;
              }
            }
          } else {
            var1.aClass3_Sub24_Sub1_2312.method419(var7);
          }

          if (var1.aClass3_Sub24_Sub1_2315 != null) {
            var1.aClass3_Sub24_Sub1_2315.method419(var7);
            if (!var1.aClass3_Sub24_Sub1_2315.method82(0)) {
              var1.aClass3_Sub24_Sub1_2315 = null;
            }
          } else if (var1.anIntArray2333 != null && (var1.anInt2316 -= var3)
              <= 0) {
            int var13 = (int) (var1.anIntArray2333.length * Math.random());
            SoundEffect var14 =
                MidiSomethingStatics.method1811(GlobalStatics_5.soundEffects,
                    var1.anIntArray2333[var13],
                    0);
            if (var14 != null) {
              SomethingMusic0 var15 = var14.method1812()
                  .method151(DummyClass32.aClass157_524);
              AudioStreamEncoder1 var11 = GlobalStatics_11
                  .method437(var15, 100, var7);
              assert var11 != null;
              var11.method429(0);
              GlobalStatics_9.aClass3_Sub24_Sub2_2563.method457(var11);
              var1.anInt2316 =
                  (int) ((-var1.anInt2310 + var1.anInt2325) * Math.random())
                      + var1.anInt2310;
              var1.aClass3_Sub24_Sub1_2315 = var11;
            }
          }

        } else {
          if (var1.aClass3_Sub24_Sub1_2312 != null) {
            GlobalStatics_9.aClass3_Sub24_Sub2_2563.method461(
                var1.aClass3_Sub24_Sub1_2312);
            var1.aClass3_Sub24_Sub1_2312 = null;
          }

          if (var1.aClass3_Sub24_Sub1_2315 != null) {
            GlobalStatics_9.aClass3_Sub24_Sub2_2563.method461(
                var1.aClass3_Sub24_Sub1_2315);
            var1.aClass3_Sub24_Sub1_2315 = null;
          }

        }
      }
    }
  }

  public static void method607(boolean var0) {
    GlobalStatics_8.aClass94_2751 = GameStringStatics.aClass94_1546;
    GameStringStatics.aClass94_3426 = GameStringStatics.aClass94_1575;
    GameStringStatics.aClass94_662 = GameStringStatics.aClass94_463;
    GameStringStatics.aClass94_3142 = GlobalStatics_2.aClass94_2215;
    DummyClass15.aClass94_1879 = GameStringStatics.aClass94_3432;
    GameStringStatics.aClass94_4071 = GameStringStatics.aClass94_560;
    GameStringStatics.aClass94_2285 = GameStringStatics.aClass94_559;
    GameStringStatics.aClass94_3988 = DummyClass36.aClass94_2616;
    DummyClass8.aClass94_4024 = DummyClass37.aClass94_669;
    DummyClass53.aClass94_1335 = GameStringStatics.aClass94_3344;
    GameStringStatics.aClass94_327 = GameStringStatics.aClass94_2255;
    GameStringStatics.aClass94_2210 = GlobalStatics_9.aClass94_1922;
    GlobalStatics_8.OPTION_DROP = GameStringStatics.aClass94_2687;
    GlobalStatics_7.aClass94_4058 = GameStringStatics.aClass94_3324;
    GameStringStatics.aClass94_2526 = GameStringStatics.aClass94_1348;
    GameStringStatics.aClass94_3586 = GlobalStatics_7.aClass94_3661;
    DummyClass24.aClass94_1653 = GlobalStatics_5.aClass94_2013;
    GlobalStatics_2.aClass94_43 = GameStringStatics.aClass94_1558;
    GlobalStatics_11.aClass94_809 = DummyClass52.aClass94_1173;
    GameStringStatics.aClass94_62 = GameStringStatics.aClass94_3326;
    GlobalStatics_8.aClass94_1409 = GameStringStatics.aClass94_1728;
    GameStringStatics.aClass94_2481 = GameStringStatics.aClass94_2276;
    DummyClass27.aClass94_1583 = GameStringStatics.aClass94_2499;
    GameStringStatics.aClass94_485 = Texture.aClass94_3798;
    if (var0) {
      GlobalStatics_9.aBoolean3641 = false;
    }

    GameStringStatics.aClass94_825 = GameStringStatics.aClass94_2269;
    GameStringStatics.aClass94_3629 = GameStringStatics.aClass94_3496;
    GameStringStatics.aClass94_666 = GameStringStatics.aClass94_463;
    GameStringStatics.aClass94_3643 = GameStringStatics.aClass94_3053;
    DummyClass12.aClass94_2031 = GlobalStatics_10.aClass94_1377;
    GameStringStatics.aClass94_1688 = GameStringStatics.aClass94_3281;
    GameStringStatics.aClass94_1884 = GameStringStatics.aClass94_901;
    DummyClass44.aClass94_935 = GameStringStatics.aClass94_3401;
    GameStringStatics.LOADING_PLEASE_WAIT = DummyClass44.aClass94_933;
    GameStringStatics.aClass94_3427 = GameStringStatics.aClass94_3355;
    com.jagex.runescape.statics.GlobalStatics_0.aClass94_1707 = GameStringStatics.aClass94_552;
    GameStringStatics.aClass94_1892 = GameStringStatics.aClass94_334;
    GlobalStatics_1.aClass94_2196 = GameStringStatics.aClass94_700;
    com.jagex.runescape.statics.GlobalStatics_0.aClass94_1180 = GameStringStatics.aClass94_3408;
    GameStringStatics.CONNECTION_LOST = DummyClass1.aClass94_414;
    DummyClass32.SKILL = GameStringStatics.aClass94_2170;
    GameStringStatics.aClass94_3691 = GlobalStatics_7.aClass94_2163;
    GameStringStatics.aClass94_374 = GlTexture2d.aClass94_3763;
    GlobalStatics_8.aClass94_4 = GlobalStatics_11.aClass94_808;
    GlobalStatics_2.aClass94_2216 = GameStringStatics.aClass94_2340;
    GameStringStatics.aClass94_822 = DummyClass56.aClass94_1455;
    GameStringStatics.aClass94_2267 = GameStringStatics.aClass94_2524;
    GameStringStatics.aClass94_3584 = GlobalStatics_7.aClass94_3661;
    GameStringStatics.aClass94_1722 = GameStringStatics.aClass94_150;
    DummyClass14.aClass94_1962 = DummyClass38.aClass94_728;
    GameStringStatics.aClass94_3397 = GameStringStatics.aClass94_297;
    GameStringStatics.aClass94_691 = DummyClass6.aClass94_2042;
    GameStringStatics.aClass94_461 = GlobalStatics_1.aClass94_1466;
    GameStringStatics.CONNECTING_TO_UPDATE_SERVER = GlobalStatics_5.aClass94_1974;
    DummyClass42.DEFAULT_WALK_TOOLTIP = GameStringStatics.aClass94_2653;
    GlTexture2d.aClass94_3762 = com.jagex.runescape.statics.GlobalStatics_0.aClass94_1702;
    GameStringStatics.aClass94_3445 = GameStringStatics.aClass94_3169;
    GameStringStatics.aClass94_3124 = GameStringStatics.aClass94_2336;
    GameStringStatics.aClass94_2667 = GlobalStatics_2.aClass94_3705;
    GlobalStatics_2.aClass94_2576 = GlobalStatics_3.aClass94_2461;
    GameStringStatics.aClass94_3388 = GameStringStatics.aClass94_875;
    GameStringStatics.aClass94_4040 = GameStringStatics.aClass94_3547;
    DummyClass14.ATTEMPTING_TO_RECONNECT = com.jagex.runescape.statics.GlobalStatics_0.aClass94_2149;
    com.jagex.runescape.statics.GlobalStatics_0.LOADED_INTERFACES = Texture.aClass94_3785;
    GameStringStatics.aClass94_551 = GameStringStatics.aClass94_1647;
    GameStringStatics.aClass94_2624 = GameStringStatics.aClass94_2053;
    GameStringStatics.aClass94_3544 = GameStringStatics.aClass94_145;
    GlobalStatics_8.aClass94_36 = GameStringStatics.aClass94_1889;
    GameStringStatics.aClass94_3249 = DummyClass7.aClass94_2997;
    GameStringStatics.aClass94_462 = GameStringStatics.aClass94_3279;
    GameStringStatics.aClass94_3117 = GameStringStatics.aClass94_2336;
    GameStringStatics.aClass94_3546 = GameStringStatics.aClass94_355;
    com.jagex.runescape.statics.GlobalStatics_0.aClass94_2151 = GameStringStatics.aClass94_2662;
    GameStringStatics.aClass94_3575 = GameStringStatics.aClass94_1044;
    DummyClass5.aClass94_2991 = GlobalStatics_0.aClass94_22;
    GlobalStatics_8.aClass94_957 = GameStringStatics.aClass94_1696;
    DummyClass26.aClass94_1615 = GameStringStatics.aClass94_2297;
    GameStringStatics.aClass94_3311 = DummyClass50.aClass94_1140;
    GlobalStatics_7.CONNECTED_TO_UPDATE_SERVER = GlobalStatics_5.aClass94_1618;
    GameStringStatics.aClass94_361 = DummyClass28.aClass94_338;
    GameStringStatics.aClass94_3051 = DummyClass23.aClass94_1660;
    GameStringStatics.aClass94_3333 = GlobalStatics_2.aClass94_2242;
    GlobalStatics_7.aClass94_2961 = DummyClass34.aClass94_591;
    GameStringStatics.aClass94_3645 = GlobalStatics_3.aClass94_1863;
    DummyClass30.aClass94_459 = GameStringStatics.aClass94_2132;
    GameStringStatics.aClass94_3097 = GlobalStatics_8.aClass94_3291;
    DummyClass32.aClass94_523 = GameStringStatics.aClass94_2496;
    GameStringStatics.aClass94_3167 = GlobalStatics_7.aClass94_1637;
    com.jagex.runescape.statics.GlobalStatics_0.aClass94_1183 = GameStringStatics.aClass94_2260;
    GameStringStatics.aClass94_1731 = GameStringStatics.aClass94_3409;
    DummyClass32.aClass94_525 = GameStringStatics.aClass94_2628;
  }

  public static void method1192(byte var0) {
    GameStringStatics.aClass94_897 = null;
    GlobalStatics_9.variables = null;
    GameStringStatics.aClass94_901 = null;
    GlobalStatics_9.anIntArray904 = null;
    GameStringStatics.aClass94_905 = null;
    if (var0 == -86) {
      GlobalStatics_9.aClass3_Sub28_Sub16_895 = null;
    }
  }

  public static SoftwareIndexedColorSprite[] createSprites(int var0) {
    SoftwareIndexedColorSprite[] var1 = new SoftwareIndexedColorSprite[DummyClass53.spriteCount];

    for (int var2 = var0; var2 < DummyClass53.spriteCount; ++var2) {
      var1[var2] =
          new SoftwareIndexedColorSprite(GlobalStatics_9.anInt2426,
              GlobalStatics_9.anInt1748,
              GlobalStatics_9.anIntArray2048[var2],
              com.jagex.runescape.statics.GlobalStatics_0.anIntArray2591[var2],
              GlobalStatics_9.anIntArray2931[var2],
              GlobalStatics_10.anIntArray3076[var2],
              DummyClass5.aByteArrayArray2987[var2],
              GlobalStatics_10.anIntArray3446);
    }

    DummyClass37.method1035((byte) 116);
    return var1;
  }

  public static void method1282(int var0, byte var1, int var2, int var3,
      int var4) {
    int var5 = 0;

    for (int var6 = 58 / ((56 - var1) / 49); GlobalStatics_9.widgetQuads > var5;
        ++var5) {
      if (var0 < GlobalStatics_5.quadx0[var5] + GlTexture2d.quadx1[var5]
          && var0 + var4 > GlobalStatics_5.quadx0[var5]
          && GlobalStatics_9.quady0[var5] + GlobalStatics_9.quady1[var5]
          > var2 && GlobalStatics_9.quady0[var5] < var3
          + var2) {
        DummyClass9.aBooleanArray4008[var5] = true;
      }
    }
  }

  public static void method1283(byte var0) {
    GlobalStatics_9.aClass153_1043 = null;
    GlobalStatics_9.uidFile = null;
    GameStringStatics.aClass94_1044 = null;
    int var1 = -9 / ((var0 - 64) / 53);
  }

  public static boolean method73(short var0, int var1) {
    if (var0 != 47 && var0 != 5 && var0 != 43 && var0 != 35 && var0 != 58
        &&
        var0 != 22
        && var0 != 40 && var0 != 3) {
      if (var0 != 9 && var0 != 12 && var0 != 1006 && var0 != 1003) {
        if (var1 <= 42) {
          GlobalStatics_9.anInt59 = 1;
        }

        return var0 == 25 || var0 == 23 || var0 == 48 || var0 == 7
            || var0 == 13 || var0 == 8 || var0 == 32 || var0 == 28
            || var0 == 59 || var0 == 51
            || var0 == 41;
      } else {
        return true;
      }
    } else {
      return true;
    }
  }

  public static void method75(Widget[] var0, boolean var1, int var2) {
    if (var1) {
      for (Widget var4 : var0) {
        if (var4 != null) {
          if (var4.anInt187 == 0) {
            if (var4.aClass11Array262 != null) {
              GlobalStatics_9.method75(var4.aClass11Array262, true, var2);
            }

            SomethingPacket151 var5 =
                (SomethingPacket151) GlobalStatics_10.aClass130_3208.get(
                    var4.anInt279);
            if (var5 != null) {
              GlobalStatics_6.method124(49, var2, var5.anInt2602);
            }
          }

          ClientScriptCall var7;
          if (var2 == 0 && var4.anObjectArray206 != null) {
            var7 = new ClientScriptCall();
            var7.arguments = var4.anObjectArray206;
            var7.aClass11_2449 = var4;
            GLStatics.executeScript(var7);
          }

          if (var2 == 1 && var4.anObjectArray176 != null) {
            if (var4.anInt191 >= 0) {
              Widget var8 = GlobalStatics_7
                  .getWidget((byte) 121, var4.anInt279);
              if (var8 == null || var8.aClass11Array262 == null
                  || var4.anInt191 >= var8.aClass11Array262.length
                  || var8.aClass11Array262[var4.anInt191] != var4) {
                continue;
              }
            }

            var7 = new ClientScriptCall();
            var7.arguments = var4.anObjectArray176;
            var7.aClass11_2449 = var4;
            GLStatics.executeScript(var7);
          }
        }
      }

    }
  }

  public static boolean method76(int var0, int var1, int var2, int var3,
      int var4, boolean var5,
      int var6, int var7, int var8, int var9, int var10, int var11) {
    int var12;
    int var13;
    for (var12 = 0; var12 < 104; ++var12) {
      for (var13 = 0; var13 < 104; ++var13) {
        DummyClass51.anIntArrayArray1160[var12][var13] = 0;
        GlobalStatics_10.anIntArrayArray1373[var12][var13] = 99999999;
      }
    }

    DummyClass51.anIntArrayArray1160[var11][var3] = 99;
    GlobalStatics_10.anIntArrayArray1373[var11][var3] = 0;
    var13 = var3;
    var12 = var11;
    byte var14 = 0;
    GlobalStatics_10.anIntArray3456[var14] = var11;
    boolean var16 = false;
    int var15 = 0;
    int var27 = var14 + 1;
    DummyClass38.anIntArray729[var14] = var3;
    int[][] var17 =
        com.jagex.runescape.statics.GlobalStatics_0.collisionMaps[GlobalStatics_9.currentPlane].anIntArrayArray1304;

    int var18;
    while (var15 != var27) {
      var12 = GlobalStatics_10.anIntArray3456[var15];
      var13 = DummyClass38.anIntArray729[var15];
      var15 = 4095 & var15 + 1;
      if (var8 == var12 && var4 == var13) {
        var16 = true;
        break;
      }

      if (var1 != 0) {
        if ((var1 < 5 || var1 == 10)
            && com.jagex.runescape.statics.GlobalStatics_0.collisionMaps[GlobalStatics_9.currentPlane]
            .method1488(var4, var12,
                false, var13, var8, -1 + var1, 2, var7)) {
          var16 = true;
          break;
        }

        if (var1 < 10
            && com.jagex.runescape.statics.GlobalStatics_0.collisionMaps[GlobalStatics_9.currentPlane]
            .method1492(
                var4, var1 - 1, var8, var13, 2, var7, var12, 88)) {
          var16 = true;
          break;
        }
      }

      if (var0 != 0 && var6 != 0
          && com.jagex.runescape.statics.GlobalStatics_0.collisionMaps[GlobalStatics_9.currentPlane]
          .method1498(true, var8,
              var13, var12, 2, var0, var2, var4, var6)) {
        var16 = true;
        break;
      }

      var18 = GlobalStatics_10.anIntArrayArray1373[var12][var13] + 1;
      if (var12 > 0 && DummyClass51.anIntArrayArray1160[var12 - 1][var13] == 0
          &&
          (
              var17[-1 + var12][var13] & 19661070) == 0
          && (var17[-1 + var12][var13 + 1] & 19661112) == 0) {
        GlobalStatics_10.anIntArray3456[var27] = var12 - 1;
        DummyClass38.anIntArray729[var27] = var13;
        var27 = 1 + var27 & 4095;
        DummyClass51.anIntArrayArray1160[var12 - 1][var13] = 2;
        GlobalStatics_10.anIntArrayArray1373[-1 + var12][var13] = var18;
      }

      if (var12 < 102
          && DummyClass51.anIntArrayArray1160[1 + var12][var13] == 0 &&
          (
              var17[2 + var12][var13] & 19661187) == 0 &&
          (var17[var12 + 2][1 + var13] & 19661280) == 0) {
        GlobalStatics_10.anIntArray3456[var27] = 1 + var12;
        DummyClass38.anIntArray729[var27] = var13;
        var27 = 4095 & var27 + 1;
        DummyClass51.anIntArrayArray1160[var12 + 1][var13] = 8;
        GlobalStatics_10.anIntArrayArray1373[var12 + 1][var13] = var18;
      }

      if (var13 > 0 && DummyClass51.anIntArrayArray1160[var12][var13 - 1] == 0
          && (19661070 & var17[var12][-1 + var13]) == 0
          && (var17[var12 + 1][var13 - 1] & 19661187) == 0) {
        GlobalStatics_10.anIntArray3456[var27] = var12;
        DummyClass38.anIntArray729[var27] = -1 + var13;
        DummyClass51.anIntArrayArray1160[var12][-1 + var13] = 1;
        GlobalStatics_10.anIntArrayArray1373[var12][-1 + var13] = var18;
        var27 = 4095 & 1 + var27;
      }

      if (var13 < 102 && DummyClass51.anIntArrayArray1160[var12][var13 + 1]
          == 0
          && (var17[var12][2 + var13] & 19661112) == 0 &&
          (var17[1 + var12][var13 + 2]
              & 19661280) == 0) {
        GlobalStatics_10.anIntArray3456[var27] = var12;
        DummyClass38.anIntArray729[var27] = var13 + 1;
        DummyClass51.anIntArrayArray1160[var12][1 + var13] = 4;
        var27 = 1 + var27 & 4095;
        GlobalStatics_10.anIntArrayArray1373[var12][var13 + 1] = var18;
      }

      if (var12 > 0 && var13 > 0 &&
          DummyClass51.anIntArrayArray1160[-1 + var12][-1
              + var13] == 0 && (19661112 & var17[-1 + var12][var13]) == 0
          && (
          var17[-1 + var12][-1 + var13] & 19661070) == 0 &&
          (19661187 & var17[var12][-1 + var13]) == 0) {
        GlobalStatics_10.anIntArray3456[var27] = -1 + var12;
        DummyClass38.anIntArray729[var27] = -1 + var13;
        DummyClass51.anIntArrayArray1160[-1 + var12][-1 + var13] = 3;
        GlobalStatics_10.anIntArrayArray1373[-1 + var12][-1 + var13] = var18;
        var27 = 4095 & var27 + 1;
      }

      if (var12 < 102 && var13 > 0
          && DummyClass51.anIntArrayArray1160[1 + var12][var13 - 1] == 0 &&
          (
              var17[var12 + 1][var13 - 1] & 19661070) == 0 &&
          (19661187 & var17[2 + var12][var13
              - 1]) == 0 && (19661280 & var17[var12 + 2][var13]) == 0) {
        GlobalStatics_10.anIntArray3456[var27] = var12 + 1;
        DummyClass38.anIntArray729[var27] = var13 - 1;
        var27 = 4095 & 1 + var27;
        DummyClass51.anIntArrayArray1160[var12 + 1][-1 + var13] = 9;
        GlobalStatics_10.anIntArrayArray1373[1 + var12][var13 - 1] = var18;
      }

      if (var12 > 0 && var13 < 102 &&
          DummyClass51.anIntArrayArray1160[var12 - 1][var13
              + 1] == 0 && (var17[-1 + var12][var13 + 1] & 19661070) == 0 &&
          (19661112 & var17[-1
              + var12][var13 + 2]) == 0
          && (19661280 & var17[var12][var13 + 2]) == 0) {
        GlobalStatics_10.anIntArray3456[var27] = var12 - 1;
        DummyClass38.anIntArray729[var27] = 1 + var13;
        DummyClass51.anIntArrayArray1160[var12 - 1][1 + var13] = 6;
        GlobalStatics_10.anIntArrayArray1373[-1 + var12][1 + var13] = var18;
        var27 = 1 + var27 & 4095;
      }

      if (var12 < 102 && var13 < 102 &&
          DummyClass51.anIntArrayArray1160[1 + var12][1
              + var13] == 0
          && (19661112 & var17[var12 + 1][2 + var13]) == 0 &&
          (19661280 & var17[
              var12 + 2][var13 + 2]) == 0
          && (19661187 & var17[var12 + 2][var13 + 1]) == 0) {
        GlobalStatics_10.anIntArray3456[var27] = 1 + var12;
        DummyClass38.anIntArray729[var27] = var13 + 1;
        var27 = var27 + 1 & 4095;
        DummyClass51.anIntArrayArray1160[var12 + 1][var13 + 1] = 12;
        GlobalStatics_10.anIntArrayArray1373[1 + var12][1 + var13] = var18;
      }
    }

    GlobalStatics_4.anInt1692 = 0;
    int var19;
    if (!var16) {
      if (!var5) {
        return false;
      }

      var18 = 1000;
      var19 = 100;
      byte var20 = 10;

      for (int var21 = -var20 + var8; var21 <= var20 + var8; ++var21) {
        for (int var22 = var4 - var20; var22 <= var20 + var4; ++var22) {
          if (var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104
              && GlobalStatics_10.anIntArrayArray1373[var21][var22] < 100) {
            int var23 = 0;
            int var24 = 0;
            if (var21 >= var8) {
              if (var21 > -1 + var0 + var8) {
                var23 = var21 + 1 - var0 - var8;
              }
            } else {
              var23 = var8 - var21;
            }

            if (var4 <= var22) {
              if (var22 > -1 + var4 + var6) {
                var24 = -var4 - var6 + 1 + var22;
              }
            } else {
              var24 = -var22 + var4;
            }

            int var25 = var23 * var23 + var24 * var24;
            if (var25 < var18 || var18 == var25
                && GlobalStatics_10.anIntArrayArray1373[var21][var22] < var19) {
              var13 = var22;
              var19 = GlobalStatics_10.anIntArrayArray1373[var21][var22];
              var18 = var25;
              var12 = var21;
            }
          }
        }
      }

      if (var18 == 1000) {
        return false;
      }

      if (var11 == var12 && var13 == var3) {
        return false;
      }

      GlobalStatics_4.anInt1692 = 1;
    }

    byte var28 = 0;
    GlobalStatics_10.anIntArray3456[var28] = var12;
    var15 = var28 + 1;
    DummyClass38.anIntArray729[var28] = var13;
    var18 = var19 = DummyClass51.anIntArrayArray1160[var12][var13];
    if (var10 <= 2) {
      GameStringStatics.aClass94_60 = null;
    }

    for (;
        var11 != var12 || var3 != var13;
        var18 = DummyClass51.anIntArrayArray1160[var12][var13]) {
      if (var19 != var18) {
        GlobalStatics_10.anIntArray3456[var15] = var12;
        DummyClass38.anIntArray729[var15++] = var13;
        var19 = var18;
      }

      if ((var18 & 2) != 0) {
        ++var12;
      } else if ((8 & var18) != 0) {
        --var12;
      }

      if ((var18 & 1) == 0) {
        if ((var18 & 4) != 0) {
          --var13;
        }
      } else {
        ++var13;
      }
    }

    if (var15 <= 0) {
      return var9 != 1;
    } else {
      GlobalStatics_9.method299(113, var15, var9);
      return true;
    }
  }

  public static void method78(int var0, boolean var1, int var2) {
    ++GlobalStatics_8.anInt1944;
    GlobalStatics_9.SECURE_BUFFER.writePacket(132);
    GlobalStatics_9.SECURE_BUFFER.method775(var2, 1437452424);
    if (!var1) {
      GlobalStatics_9.SECURE_BUFFER.writeShortLE(-1, var0);
    }
  }

  public static void method80(int var0) {
    GameStringStatics.aClass94_60 = null;
    GlobalStatics_9.aShortArray63 = null;
    if (var0 != -27401) {
      GlobalStatics_9.anInt65 = 93;
    }

    GameStringStatics.aClass94_68 = null;
    GlobalStatics_9.anInterface5Array70 = null;
    GameStringStatics.aClass94_62 = null;
  }

  public static void method81(byte var0, Widget var1) {
    if (var0 != -128) {
      GlobalStatics_9.method75(null, true, 21);
    }

    int var2 = var1.anInt189;
    if (var2 == 324) {
      if (GlobalStatics_10.anInt3260 == -1) {
        GlobalStatics_10.anInt3260 = var1.anInt224;
        DummyClass51.anInt1165 = var1.anInt296;
      }

      if (DummyClass49.aClass52_1112.aBoolean864) {
        var1.anInt224 = GlobalStatics_10.anInt3260;
      } else {
        var1.anInt224 = DummyClass51.anInt1165;
      }

    } else {
      if (var2 == 325) {
        if (GlobalStatics_10.anInt3260 == -1) {
          DummyClass51.anInt1165 = var1.anInt296;
          GlobalStatics_10.anInt3260 = var1.anInt224;
        }

        if (DummyClass49.aClass52_1112.aBoolean864) {
          var1.anInt224 = DummyClass51.anInt1165;
        } else {
          var1.anInt224 = GlobalStatics_10.anInt3260;
        }

      } else {
        if (var2 == 327) {
          var1.rotationX0 = 150;
          var1.rotationY =
              2047 & (int) (Math.sin(GlobalStatics_4.updateCycle / 40.0D)
                  * 256.0D);
          var1.anInt202 = 5;
          var1.anInt201 = -1;
        } else if (var2 == 328) {
          if (GlobalStatics_9.localPlayer.name == null) {
            var1.anInt201 = 0;
          } else {
            var1.rotationX0 = 150;
            var1.rotationY =
                2047 & (int) (256.0D * Math
                    .sin(GlobalStatics_4.updateCycle / 40.0D));
            var1.anInt202 = 5;
            var1.anInt201 =
                2047 + ((int) GlobalStatics_9.localPlayer.name.toBase37()
                    << 11);
            var1.anInt260 = GlobalStatics_9.localPlayer.anInt2793;
            var1.anInt267 = 0;
            var1.anInt305 = GlobalStatics_9.localPlayer.anInt2764;
            var1.anInt283 = GlobalStatics_9.localPlayer.anInt2813;
          }
        }
      }
    }
  }

  public static void method1410(int var0, int var1, int var2, int var3,
      int var4, int var5, int var6,
      int var7, int var8, int var9, int var10) {
    int var11 = var4 - var6;
    int var12 = -var3 + var2;
    if (DummyClass30.anInt455 > var4) {
      ++var11;
    }

    if (DummyClass58.anInt1460 > var2) {
      ++var12;
    }

    if (var10 != -12541) {
      GlobalStatics_9.getWindowMode();
    }

    int var13;
    int var14;
    int var15;
    int var17;
    int var16;
    int var19;
    int var21;
    int var20;
    int var22;
    int var25;
    int var24;
    int var26;
    int var28;
    int var31;
    int var30;
    int var32;
    int var33;
    int[][] var41;
    int var10000;
    for (var13 = 0; var11 > var13; ++var13) {
      var14 = var13 * var8 + var1 >> 16;
      var15 = (var13 + 1) * var8 + var1 >> 16;
      var16 = -var14 + var15;
      if (var16 > 0) {
        var17 = var13 + var6 >> 6;
        if (var17 >= 0
            && GlobalStatics_5.anIntArrayArrayArray1903.length - 1
            >= var17) {
          var14 += var5;
          var41 = GlobalStatics_5.anIntArrayArrayArray1903[var17];
          byte[][] var45 = GlobalStatics_9.aByteArrayArrayArray383[var17];
          byte[][] var42 = GlobalStatics_9.aByteArrayArrayArray2339[var17];
          byte[][] var23 = com.jagex.runescape.statics.GlobalStatics_0.aByteArrayArrayArray640[var17];
          byte[][] var43 = GlobalStatics_7.aByteArrayArrayArray2452[var17];
          var15 += var5;
          byte[][] var46 = GlobalStatics_10.aByteArrayArrayArray3390[var17];

          for (var24 = 0; var12 > var24; ++var24) {
            var25 = var7 * var24 + var9 >> 16;
            var26 = var9 + (1 + var24) * var7 >> 16;
            int var27 = -var25 + var26;
            if (var27 > 0) {
              var26 += var0;
              var28 = var3 + var24 >> 6;
              int var29 = 63 & var3 + var24;
              var25 += var0;
              var30 = var13 + var6 & 63;
              var31 = (var29 << 6) + var30;
              if (var28 >= 0 && var41.length - 1 >= var28 && var41[var28]
                  != null) {
                var32 = var41[var28][var31];
              } else {
                if (GlobalStatics_0.aClass3_Sub28_Sub3_2600.anInt3550
                    == -1) {
                  if ((4 & var24 + var3) == (var6 + var13 & 4)) {
                    var32 = DummyClass51.anIntArray1161[1
                        + GlobalStatics_10.anInt3081];
                  } else {
                    var32 = 4936552;
                  }
                } else {
                  var32 = com.jagex.runescape.statics.GlobalStatics_0.aClass3_Sub28_Sub3_2600.anInt3550;
                }

                if (var28 < 0 || var28 > var41.length - 1) {
                  if (var32 == 0) {
                    var32 = 1;
                  }

                  DummyClass47.method1323(var14, var25, var16, var27, var32);
                  continue;
                }
              }

              var33 =
                  var45[var28] == null ? 0
                      : DummyClass51.anIntArray1161[var45[var28][var31] & 255];
              if (var32 == 0) {
                var32 = 1;
              }

              int var34 =
                  var46[var28] != null ? DummyClass51.anIntArray1161[255
                      & var46[var28][var31]] : 0;
              int var36;
              if (var33 == 0 && var34 == 0) {
                DummyClass47.method1323(var14, var25, var16, var27, var32);
              } else {
                byte var35;
                if (var33 != 0) {
                  if (var33 == -1) {
                    var33 = 1;
                  }

                  var35 = var42[var28] != null ? var42[var28][var31] : 0;
                  var36 = var35 & 252;
                  if (var36 != 0 && var16 > 1 && var27 > 1) {
                    GlobalStatics_8.method2272(
                        AbstractImageProducerStatics.anIntArray1100, var33,
                        var14, var35 & 3,
                        var32, var36 >> 2, var27, var16, var25, true,
                        (byte) 21);
                  } else {
                    DummyClass47.method1323(var14, var25, var16, var27, var33);
                  }
                }

                if (var34 != 0) {
                  if (var34 == -1) {
                    var34 = var32;
                  }

                  var35 = var43[var28][var31];
                  var36 = 252 & var35;
                  if (var36 == 0 || var16 <= 1 || var27 <= 1) {
                    DummyClass47.method1323(var14, var25, var16, var27, var34);
                  }

                  GlobalStatics_8.method2272(
                      AbstractImageProducerStatics.anIntArray1100, var34,
                      var14, var35 & 3, 0,
                      var36 >> 2, var27, var16, var25, var33 == 0, (byte) 21);
                }
              }

              if (var23[var28] != null) {
                int var49 = var23[var28][var31] & 255;
                if (var49 != 0) {
                  if (var16 == 1) {
                    var36 = var14;
                  } else {
                    var36 = var15 - 1;
                  }

                  int var37;
                  if (var27 == 1) {
                    var37 = var25;
                  } else {
                    var37 = -1 + var26;
                  }

                  int var38 = 13421772;
                  if (var49 >= 5 && var49 <= 8 || var49 >= 13 && var49 <= 16
                      || var49 >= 21 && var49 <= 24 || var49 == 27 || var49
                      == 28) {
                    var38 = 13369344;
                    var49 -= 4;
                  }

                  if (var49 == 1) {
                    DummyClass47.method1318(var14, var25, var27, var38);
                  } else if (var49 == 2) {
                    DummyClass47.method1317(var14, var25, var16, var38);
                  } else if (var49 != 3) {
                    if (var49 == 4) {
                      DummyClass47.method1317(var14, var37, var16, var38);
                    } else {
                      if (var49 == 9) {
                        DummyClass47
                            .method1318(var14, var25, var27, 16777215);
                        DummyClass47.method1317(var14, var25, var16, var38);
                      } else {
                        if (var49 == 10) {
                          DummyClass47
                              .method1318(var36, var25, var27, 16777215);
                          DummyClass47.method1317(var14, var25, var16, var38);
                        } else {
                          if (var49 == 11) {
                            DummyClass47
                                .method1318(var36, var25, var27, 16777215);
                            DummyClass47
                                .method1317(var14, var37, var16, var38);
                          } else if (var49 != 12) {
                            if (var49 == 17) {
                              DummyClass47.method1317(var14, var25, 1, var38);
                            } else if (var49 != 18) {
                              if (var49 == 19) {
                                DummyClass47
                                    .method1317(var36, var37, 1, var38);
                              } else if (var49 == 20) {
                                DummyClass47
                                    .method1317(var14, var37, 1, var38);
                              } else {
                                int var39;
                                if (var49 == 25) {
                                  for (var39 = 0; var39 < var27; ++var39) {
                                    DummyClass47.method1317(var39 + var14,
                                        -var39 + var37, 1,
                                        var38);
                                  }
                                } else if (var49 == 26) {
                                  for (var39 = 0; var39 < var27; ++var39) {
                                    DummyClass47.method1317(var39 + var14,
                                        var25 + var39, 1,
                                        var38);
                                  }
                                }
                              }
                            } else {
                              DummyClass47.method1317(var36, var25, 1, var38);
                            }
                          } else {
                            DummyClass47
                                .method1318(var14, var25, var27, 16777215);
                            DummyClass47
                                .method1317(var14, var37, var16, var38);
                          }
                        }
                      }
                    }
                  } else {
                    DummyClass47.method1318(var36, var25, var27, var38);
                  }
                }
              }
            }
          }
        } else {
          var14 += var5;

          for (int var18 = 0; var12 > var18; ++var18) {
            if (com.jagex.runescape.statics.GlobalStatics_0.aClass3_Sub28_Sub3_2600.anInt3550
                != -1) {
              var19 = com.jagex.runescape.statics.GlobalStatics_0.aClass3_Sub28_Sub3_2600.anInt3550;
            } else if ((var13 + var6 & 4) == (4 & var18 + var3)) {
              var19 = DummyClass51.anIntArray1161[1
                  + GlobalStatics_10.anInt3081];
            } else {
              var19 = 4936552;
            }

            if (var19 == 0) {
              var19 = 1;
            }

            var20 = (var7 * var18 + var9 >> 16) + var0;
            var21 = var0 + ((var18 + 1) * var7 + var9 >> 16);
            var22 = var21 - var20;
            DummyClass47.method1323(var14, var20, var16, var22, var19);
          }

          var10000 = var15 + var5;
        }
      }
    }

    for (var13 = -2; 2 + var11 > var13; ++var13) {
      var14 = var1 + var13 * var8 >> 16;
      var15 = var8 * (var13 + 1) + var1 >> 16;
      var16 = -var14 + var15;
      if (var16 > 0) {
        var14 += var5;
        var17 = var6 + var13 >> 6;
        var10000 = var15 + var5;
        if (var17 >= 0
            && GlobalStatics_9.anIntArrayArrayArray558.length - 1 >= var17) {
          var41 = GlobalStatics_9.anIntArrayArrayArray558[var17];

          for (var19 = -2; var19 < var12 + 2; ++var19) {
            var20 = var9 + var19 * var7 >> 16;
            var21 = var9 + (var19 + 1) * var7 >> 16;
            var22 = var21 - var20;
            if (var22 > 0) {
              var20 += var0;
              int var44 = var19 + var3 >> 6;
              var10000 = var21 + var0;
              if (var44 >= 0 && var44 <= -1 + var41.length) {
                var24 = ((63 & var3 + var19) << 6) + (var13 + var6 & 63);
                if (var41[var44] != null) {
                  var25 = var41[var44][var24];
                  var26 = 16383 & var25;
                  if (var26 != 0) {
                    var28 = (0xd228 & var25) >> 14;
                    MapScene var47 = GlobalStatics_10.c(-1 + var26, 0);
                    SoftwareIndexedColorSprite var48 = var47
                        .getSprite(var28, (byte) -71);
                    if (var48 != null) {
                      var31 = var22 * var48.height / 4;
                      var30 = var16 * var48.width / 4;
                      if (var47.aBoolean69) {
                        var32 = var25 >> 16 & 15;
                        var33 = (16103184 & var25) >> 20;
                        if ((1 & var28) == 1) {
                          var28 = var32;
                          var32 = var33;
                          var33 = var28;
                        }

                        var30 = var16 * var32;
                        var31 = var22 * var33;
                      }

                      if (var30 != 0 && var31 != 0) {
                        if (var47.anInt61 == 0) {
                          var48.method1677(var14, -var31 + var20 + var22, var30,
                              var31);
                        } else {
                          var48
                              .method1669(var14, var20 - (var31 - var22), var30,
                                  var31,
                                  var47.anInt61);
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  public static int getWindowMode() {
    if (GlobalStatics_10.fullScreenFrame == null) {
      if (GlRenderer.USE_OPENGL && GlobalStatics_9.aBoolean2427) {
        return 2;
      } else {

        return GlRenderer.USE_OPENGL ? 1 : 0;
      }
    } else {
      return 3;
    }
  }

  public static void clear75(int var0) {
    if (var0 < 86) {
      GlobalStatics_9
          .method1410(73, 59, 119, 60, 89, -42, -25, 37, 88, -62, 69);
    }

    GlobalStatics_9.aClass3_Sub27_1154 = null;
  }

  public static void method1771(int var0) {
    GameStringStatics.aClass94_2687 = null;
    GlobalStatics_9.anIntArray2696 = null;
    GlobalStatics_9.anImage2695 = null;
    if (var0 != 14635) {
      GlobalStatics_9.aClass47_2686 = null;
    }

    GlobalStatics_9.aClass3_Sub28_Sub16Array2690 = null;
    GlobalStatics_9.aClass47_2686 = null;
  }

  public static void clear38(byte var0) {
    if (var0 > -101) {
      GlobalStatics_9.aClass3_Sub28_Sub16Array2839 = null;
    }

    GlobalStatics_9.aClass54Array2841 = null;
    GameStringStatics.aClass94_2765 = null;
    GlobalStatics_9.aClass93_2792 = null;
    GlobalStatics_9.aClass3_Sub28_Sub16Array2839 = null;
    GlobalStatics_9.quady1 = null;
  }

  public static void method511(byte var0) {
    int var1 = -59 / ((var0 - 67) / 36);
    GlobalStatics_9.aClass3_Sub28_Sub16_2560 = null;
    GlobalStatics_9.anIntArray2559 = null;
    GameStringStatics.aClass94_2562 = null;
    GlobalStatics_9.aClass61_2557 = null;
    GlobalStatics_9.aClass3_Sub24_Sub2_2563 = null;
  }

  public static void method512(byte var0) {
    GlobalStatics_9.aClass93_4043.method1524(3);
    GlobalStatics_7.aClass93_2442.method1524(3);
    DummyClass14.aClass93_1964.method1524(3);
    if (var0 != -108) {
      GlobalStatics_9.aClass3_Sub24_Sub2_2563 = null;
    }
  }

  public static int method514(int var0, int var1, byte var2, int var3) {
    var0 &= 3;
    if (var2 >= -66) {
      MidiInstrumentStatics.method513(-92, 76);
    }

    return var0 == 0 ? var1 : var0 == 1
        ? var3 : var0 == 2 ? 1023 - var1 : -var3 + 1023;
  }

  public static void method2087(byte var0) {
    SpawnedGameObject var1 = (SpawnedGameObject) GlobalStatics_10.aClass61_3075
        .getFirst();

    for (int var2 = -37 / ((-21 - var0) / 48);
        var1 != null;
        var1 = (SpawnedGameObject) GlobalStatics_10.aClass61_3075.getNext()) {
      if (var1.aliveTime > 0) {
        --var1.aliveTime;
      }

      if (var1.aliveTime != 0) {
        if (var1.anInt2261 > 0) {
          --var1.anInt2261;
        }

        if (var1.anInt2261 == 0 && var1.anInt2264 >= 1
            && var1.anInt2248 >= 1
            && var1.anInt2264 <= 102 && var1.anInt2248 <= 102 && (
            var1.anInt2265 < 0
                || GlobalStatics_4
                .method590((byte) -34, var1.anInt2265, var1.anInt2262))) {
          GlobalStatics_7
              .method1048(var1.anInt2265, var1.anInt2264, var1.anInt2250,
                  var1.anInt2256,
                  var1.anInt2248, -65, var1.anInt2262, var1.anInt2263);
          var1.anInt2261 = -1;
          if (var1.anInt2254 == var1.anInt2265 && var1.anInt2254 == -1) {
            var1.unlinkNode();
          } else if (var1.anInt2265 == var1.anInt2254
              && var1.anInt2256 == var1.anInt2257
              && var1.anInt2253 == var1.anInt2262) {
            var1.unlinkNode();
          }
        }
      } else if (var1.anInt2254 < 0 || GlobalStatics_4
          .method590((byte) -66, var1.anInt2254,
              var1.anInt2253)) {
        GlobalStatics_7
            .method1048(var1.anInt2254, var1.anInt2264, var1.anInt2250,
                var1.anInt2257,
                var1.anInt2248, -71, var1.anInt2253, var1.anInt2263);
        var1.unlinkNode();
      }
    }
  }

  public static void clear73(boolean var0) {
    GlobalStatics_9.aClass94_1922 = null;
    GlobalStatics_9.anIntArray1920 = null;

    GLStatics.FOG_COLOR = null;
  }

  public static void method2089(byte var0) {
    GlobalStatics_7.aClass93_2982.method1523();
  }

  public static void method2091(int var0, int var1) {
    if (GlobalStatics_9.anIntArray1838 == null
        || GlobalStatics_9.anIntArray1838.length < var0) {
      GlobalStatics_9.anIntArray1838 = new int[var0];
    }

    if (var1 != 4) {
      GlobalStatics_9.anInt1926 = -75;
    }
  }

  public static void method2092(int var0, byte var1) {
    if (var1 != -47) {
      GlobalStatics_9.aClass94_1922 = null;
    }

    WidgetUpdate var2 = GlobalStatics_6.method466(4, 9, var0);
    var2.createIndexedColorSprite(true);
  }

  public static void method1704(int var0) {
    GlobalStatics_9.aClass93_1569 = null;
    if (var0 != 65536) {
      GLStatics.method1705(-109, -68);
    }

    GlobalStatics_9.anIntArray1578 = null;
    GlobalStatics_9.aLongArray1574 = null;
    GameStringStatics.aClass94_1575 = null;
    GlobalStatics_9.tableIndexFile = null;
  }

  public static AbstractDirectColorSprite method1707(int var0, int var1,
      boolean var2, int var3,
      int var4, int var5) {
    if (var5 == 65536) {
      int var7 = (var2 ? 65536 : 0) + var1 + (var0 << 17) + (var4 << 19);
      long var8 = var7 * 3849834839L + 3147483667L * var3;
      AbstractDirectColorSprite var10 =
          (AbstractDirectColorSprite) GlobalStatics_9.aClass93_1013.get(var8);
      if (var10 == null) {
        DummyClass40.aBoolean837 = false;
        var10 = com.jagex.runescape.statics.GlobalStatics_0
            .method1570(var4, (byte) 13, false, var1, var2, var0, var3,
                false);
        if (var10 != null && !DummyClass40.aBoolean837) {
          GlobalStatics_9.aClass93_1013.get((byte) -79, var10, var8);
        }

        return var10;
      } else {
        return var10;
      }
    } else {
      return null;
    }
  }

  public static void method1708(int var0, int var1, int var2) {
    if (var2 == -2553) {
      WidgetUpdate var3 = GlobalStatics_6.method466(4, 13, var1);
      var3.g((byte) 33);
      var3.anInt3598 = var0;
    }
  }

  public static void method1711(int var0, int var1) {
    GlobalStatics_9.aClass93_3572.method1522(-127, var0);
    DummyClass15.aClass93_1874.method1522(var1 - 383, var0);
    GlobalStatics_9.aClass93_1013.method1522(var1 ^ -132, var0);
    if (var1 != 255) {
      GlobalStatics_9.method1711(20, 87);
    }
  }

  public static void clear9(int var0) {
    if (var0 == 25951) {
      GlobalStatics_9.aClass11_1017 = null;
      GlobalStatics_9.SCENE_SHADOW = null;
      GlobalStatics_9.aClass93_1013 = null;
    }
  }

  public static int method1258(byte var0) {
    GlobalStatics_9.anInt1780 = 0;
    if (var0 != -53) {
      GlobalStatics_9.method1258((byte) -35);
    }

    return GlobalStatics_10.method251(-1);
  }

  public static void method1259(int var0, byte var1) {
    if (var1 > 12) {
      WidgetUpdate var2 = GlobalStatics_6.method466(4, 12, var0);
      var2.createIndexedColorSprite(true);
    }
  }

  public static void method1260(int var0, int var1, Widget[] var2) {
    for (Widget var4 : var2) {
      if (var4 != null && var4.anInt190 == var1 && (!var4.aBoolean233
          || !GlobalStatics_8.method51(
          var4))) {
        if (var4.anInt187 == 0) {
          if (!var4.aBoolean233 && GlobalStatics_8.method51(var4)
              && var4 != DummyClass56.aClass11_1453) {
            continue;
          }

          GlobalStatics_9.method1260(var0, var4.anInt279, var2);
          if (var4.aClass11Array262 != null) {
            GlobalStatics_9
                .method1260(23206, var4.anInt279, var4.aClass11Array262);
          }

          SomethingPacket151 var5 =
              (SomethingPacket151) GlobalStatics_10.aClass130_3208.get(
                  var4.anInt279);
          if (var5 != null) {
            GlobalStatics_9.method1160(-111, var5.anInt2602);
          }
        }

        if (var4.anInt187 == 6) {
          int var6;
          if (var4.anInt305 != -1 || var4.anInt198 != -1) {
            boolean var9 = GlobalStatics_9.method609(var4, var0 - 23173);
            if (var9) {
              var6 = var4.anInt198;
            } else {
              var6 = var4.anInt305;
            }

            if (var6 != -1) {
              AnimationSequence var7 = GlobalStatics_8
                  .method45(var6, (byte) -20);
              for (
                  var4.anInt267 += GlobalStatics_7.loopCycle;
                  var4.anInt267 > var7.anIntArray1869[var4.anInt283];
                  DummyClass29.method909(
                      115, var4)) {
                var4.anInt267 -= var7.anIntArray1869[var4.anInt283];
                ++var4.anInt283;
                if (var7.anIntArray1851.length <= var4.anInt283) {
                  var4.anInt283 -= var7.anInt1865;
                  if (var4.anInt283 < 0
                      || var7.anIntArray1851.length <= var4.anInt283) {
                    var4.anInt283 = 0;
                  }
                }

                var4.anInt260 = var4.anInt283 + 1;
                if (var7.anIntArray1851.length <= var4.anInt260) {
                  var4.anInt260 -= var7.anInt1865;
                  if (var4.anInt260 < 0
                      || var7.anIntArray1851.length <= var4.anInt260) {
                    var4.anInt260 = -1;
                  }
                }
              }
            }
          }

          if (var4.anInt237 != 0 && !var4.aBoolean233) {
            int var10 = var4.anInt237 >> 16;
            var10 *= GlobalStatics_7.loopCycle;
            var6 = var4.anInt237 << 16 >> 16;
            var4.rotationX0 = 2047 & var10 + var4.rotationX0;
            var6 *= GlobalStatics_7.loopCycle;
            var4.rotationY = var4.rotationY + var6 & 2047;
            DummyClass29.method909(117, var4);
          }
        }
      }
    }

    if (var0 != 23206) {
      GlobalStatics_9.clear9(107);
    }
  }

  public static GameString method1261(int var0, int var1, GameString[] var2,
      int var3) {
    int var4 = 0;

    for (int var5 = 0; var1 > var5; ++var5) {
      if (var2[var0 + var5] == null) {
        var2[var5 + var0] = GameStringStatics.aClass94_3339;
      }

      var4 += var2[var5 + var0].length;
    }

    byte[] var10 = new byte[var4];
    int var6 = 0;

    for (int var7 = 0; var1 > var7; ++var7) {
      GameString var8 = var2[var7 + var0];
      ArrayUtils.copy(var8.bytes, 0, var10, var6, var8.length);
      var6 += var8.length;
    }

    GameString var11 = new GameString();
    var11.length = var4;
    if (var3 != 2774) {
      GlobalStatics_9.method1262(83, 28);
    }

    var11.bytes = var10;
    return var11;
  }

  public static int method1262(int var0, int var1) {
    if (var0 < 20) {
      GlobalStatics_9.method1262(15, 87);
    }

    return var1 & 127;
  }

  public static void clear21(int var0) {
    GlobalStatics_9.anIntArray3986 = null;
    GameStringStatics.aClass94_3984 = null;
    GameStringStatics.aClass94_3983 = null;
    GameStringStatics.aClass94_3989 = null;
    if (var0 == -3) {
      GlobalStatics_9.fileUnpacker15 = null;
      GlobalStatics_9.anIntArray3997 = null;
      GameStringStatics.aClass94_4004 = null;
      GameStringStatics.aClass94_3991 = null;
      GameStringStatics.aClass94_3998 = null;
      GameStringStatics.aClass94_3999 = null;
      GlobalStatics_9.aClass3_Sub28_Sub16Array3977 = null;
      GameStringStatics.aClass94_3978 = null;
      GameStringStatics.aClass94_3992 = null;
      GameStringStatics.aClass94_3990 = null;
      GameStringStatics.aClass94_3996 = null;
      GameStringStatics.aClass94_3981 = null;
      GlobalStatics_9.fileUnpacker17 = null;
      GameStringStatics.aClass94_3987 = null;
      GameStringStatics.aClass94Array3985 = null;
      GameStringStatics.aClass94_3982 = null;
      GameStringStatics.aClass94_3988 = null;
      GameStringStatics.aClass94_3980 = null;
      GameStringStatics.aClass94_4003 = null;
      GameStringStatics.aClass94_4000 = null;
    }
  }

  public static int method1984(int var0, int var1, int var2) {
    if (var1 == 38) {
      int var3 = 57 * var2 + var0;
      var3 ^= var3 << 13;
      int var4 = Integer.MAX_VALUE
          & 1376312589 + (var3 * var3 * 15731 + 789221) * var3;
      return (var4 & 133802063) >> 19;
    } else {
      return 88;
    }
  }

  public static boolean method1986() {
    return GlRenderer.USE_OPENGL || SettingsStatics.SHOULD_USE_OPENGL;
  }

  public static boolean method1988(boolean var0) {
    if (var0) {
      GameStringStatics.aClass94_3980 = null;
    }

    try {
      if (GlobalStatics_9.anInt154 == 2) {
        if (GlobalStatics_9.aClass3_Sub27_1154 == null) {
          GlobalStatics_9.aClass3_Sub27_1154 =
              GlobalStatics_2.method517(DummyClass55.aClass153_1423,
                  GlobalStatics_9.anInt3463,
                  DummyClass22.anInt1741);
          if (GlobalStatics_9.aClass3_Sub27_1154 == null) {
            return false;
          }
        }

        if (GlobalStatics_9.aClass83_3579 == null) {
          GlobalStatics_9.aClass83_3579 =
              new MidiSomething(DummyClass59.soundEffects,
                  Texture.midiInstruments);
        }

        if (DummyClass55.aClass3_Sub24_Sub4_1421
            .method470(GlobalStatics_9.aClass3_Sub27_1154, -122,
                DummyClass23.aClass153_1661, GlobalStatics_9.aClass83_3579,
                22050)) {
          DummyClass55.aClass3_Sub24_Sub4_1421.method471((byte) 53);
          DummyClass55.aClass3_Sub24_Sub4_1421
              .method506(128, GlobalStatics_10.anInt3423);
          DummyClass55.aClass3_Sub24_Sub4_1421
              .method490(GlobalStatics_6.aBoolean2311,
                  GlobalStatics_9.aClass3_Sub27_1154, 17774);
          GlobalStatics_9.anInt154 = 0;
          GlobalStatics_9.aClass3_Sub27_1154 = null;
          GlobalStatics_9.aClass83_3579 = null;
          DummyClass55.aClass153_1423 = null;
          return true;
        }
      }
    } catch (Exception var2) {
      var2.printStackTrace();
      DummyClass55.aClass3_Sub24_Sub4_1421.method505((byte) -128);
      DummyClass55.aClass153_1423 = null;
      GlobalStatics_9.aClass3_Sub27_1154 = null;
      GlobalStatics_9.anInt154 = 0;
      GlobalStatics_9.aClass83_3579 = null;
    }

    return false;
  }

  public static void clear42(byte var0) {
    GlobalStatics_9.anIntArray1277 = null;
    if (var0 != 103) {
      GlobalStatics_9.anInt1297 = -20;
    }

    GlobalStatics_9.aClass94_1294 = null;
    GameStringStatics.aClass94_1281 = null;
  }

  public static void method1479(int var0, byte var1) {
    GlobalStatics_9.anInt3362 = -1;
    if (var1 < 5) {
      GlobalStatics_9.anIntArray1277 = null;
    }

    if (var0 == 37) {
      GlobalStatics_9.aFloat3979 = 3.0F;
    } else if (var0 != 50) {
      if (var0 == 75) {
        GlobalStatics_9.aFloat3979 = 6.0F;
      } else if (var0 != 100) {
        if (var0 == 200) {
          GlobalStatics_9.aFloat3979 = 16.0F;
        }
      } else {
        GlobalStatics_9.aFloat3979 = 8.0F;
      }
    } else {
      GlobalStatics_9.aFloat3979 = 4.0F;
    }
  }

  public static void method1480(boolean var0, GameString var1, int var2) {
    short[] var3 = new short[16];
    var1 = var1.method1534();
    int var4 = 0;

    for (int var5 = 0; var5 < GlobalStatics_10.anInt3287; ++var5) {
      ItemConfig var6 = DummyClass35.getItemConfig(var5);
      if ((!var0 || var6.aBoolean807) && var6.anInt791 == -1 && var6.anInt762
          == -1
          && var6.anInt800 == 0
          && var6.aClass94_770.method1534().indexOf(var1) != -1) {
        if (var4 >= 250) {
          DummyClass54.aShortArray1398 = null;
          GlobalStatics_8.anInt952 = -1;
          return;
        }

        if (var4 >= var3.length) {
          short[] var7 = new short[2 * var3.length];

          for (int var8 = 0; var8 < var4; ++var8) {
            var7[var8] = var3[var8];
          }

          var3 = var7;
        }

        var3[var4++] = (short) var5;
      }
    }

    DummyClass54.aShortArray1398 = var3;
    GlobalStatics_9.anInt2756 = 0;
    GlobalStatics_8.anInt952 = var4;
    GameString[] var10 = new GameString[GlobalStatics_8.anInt952];

    for (int var11 = 0; GlobalStatics_8.anInt952 > var11; ++var11) {
      var10[var11] = DummyClass35
          .getItemConfig(var3[var11]).aClass94_770;
    }

    int var12 = -44 / ((45 - var2) / 33);
    GlobalStatics_9.method307(var10, DummyClass54.aShortArray1398, 77);
  }

  public static int method1484(int var0, int var1) {
    if (var0 != 64835055) {
      GlobalStatics_9.anIntArray1277 = null;
    }

    BitVariable var2 = GlobalStatics_7.method378(var1, (byte) 127);
    assert var2 != null;
    int var3 = var2.id;
    int var5 = var2.high;
    int var4 = var2.low;
    int var6 = GlobalStatics_9.BIT_MASKS[var5 - var4];
    return DummyClass5.anIntArray2985[var3] >> var4 & var6;
  }

  public static void method1516(int var0, int var1) {
    WidgetUpdate var2 = GlobalStatics_6.method466(4, 3, var0);
    var2.createIndexedColorSprite(true);
    if (var1 < 87) {
      GameStringStatics.aClass94_1326 = null;
    }
  }

  public static void method1517(byte var0) {
    DummyClass17.aFontMetrics1822 = null;
    GlobalStatics_10.aFont3384 = null;
    if (var0 != -118) {
      GlobalStatics_9.method1516(64, 82);
    }

    GlobalStatics_9.anImage2695 = null;
  }

  public static int bitXor(int var0, int var1) {
    return var0 ^ var1;
  }

  public static void clear20(int var0) {
    GlobalStatics_9.tileOrientation = null;
    GameStringStatics.aClass94_1326 = null;
    if (var0 != 3101) {
      GlobalStatics_9.method1516(99, -14);
    }
  }

  public static void method1525(int var0, int var1, int var2, int var3,
      int var4, int var5) {
    int var6 =
        DummyClass59
            .method1040(GlobalStatics_9.anInt902, var3, (byte) 0,
                DummyClass13.anInt2020);
    int var7 =
        DummyClass59
            .method1040(GlobalStatics_9.anInt902, var5, (byte) 0,
                DummyClass13.anInt2020);
    int var8 =
        DummyClass59.method1040(GlTexture2d.anInt3765, var4, (byte) 0,
            DummyClass55.anInt1425);
    if (var0 != 3074) {
      GlobalStatics_9.method1516(75, -7);
    }

    int var9 =
        DummyClass59.method1040(GlTexture2d.anInt3765, var2, (byte) 0,
            DummyClass55.anInt1425);

    for (int var10 = var6; var10 <= var7; ++var10) {
      GlobalStatics_10
          .method282(DummyClass35.anIntArrayArray663[var10], var8, var0 - 2974,
              var9,
              var1);
    }
  }

  public static void method569(int var0, int var1) {
    if (var0 < -78) {
      WidgetUpdate var2 = GlobalStatics_6.method466(4, 7, var1);
      var2.createIndexedColorSprite(true);
    }
  }

  public static void method570(int var0) {
    GameStringStatics.aClass94_4049 = null;
    GlobalStatics_9.anIntArray4050 = null;
    MouseStatics.INSTANCE = null;
    GlobalStatics_9.aClass130_4046 = null;
    GameStringStatics.aClass94_4052 = null;
    GlobalStatics_9.aClass93_4043 = null;
    GlobalStatics_9.models = null;
    GlobalStatics_9.aClass93_4051 = null;
  }

  public static DisplayMode[] method596(int var0, SignLink var1) {
    if (var1.method1432(false)) {
      SignLinkRequest var2 = var1.method1453((byte) 8);

      while (var2.status == 0) {
        ThreadUtilities.sleep(10L);
      }

      if (var2.status == 2) {
        return new DisplayMode[0];
      } else {
        int[] var3 = (int[]) var2.result;
        DisplayMode[] var4 = new DisplayMode[var3.length >> 2];

        for (int var5 = 0; var4.length > var5; ++var5) {
          DisplayMode var6 = new DisplayMode();
          var4[var5] = var6;
          var6.anInt1447 = var3[var5 << 2];
          var6.anInt1449 = var3[(var5 << 2) + 1];
          var6.anInt1450 = var3[(var5 << 2) + 2];
          var6.anInt1448 = var3[(var5 << 2) + 3];
        }

        if (var0 != 10) {
          GlobalStatics_9.clear63();
        }

        return var4;
      }
    } else {
      return new DisplayMode[0];
    }
  }

  public static void clear63() {
    GameStringStatics.aClass94_4072 = null;
    GlobalStatics_9.tiles = null;
    GameStringStatics.aClass94_4066 = null;

    GameStringStatics.aClass94_4071 = null;
  }

  public static void setWindowMode(boolean replaceCanvas, int var1,
      boolean releaseGlResources, int antialiasing,
      boolean var4, int var5, int var6) {
    if (releaseGlResources) {
      GlRenderer.releaseGlResources();
    }
    ///fullscreen things
    if (GlobalStatics_10.fullScreenFrame != null && (var1 != 3
        || var5 != SettingsStatics.anInt2378
        || var6 != SettingsStatics.anInt3071)) {
      GlobalStatics_7.method593(GlobalStatics_10.fullScreenFrame, true,
          DummyClass35.signLink);
      GlobalStatics_10.fullScreenFrame = null;
    }

    if (var1 == 3 && GlobalStatics_10.fullScreenFrame == null) {
      GlobalStatics_10.fullScreenFrame =
          DummyClass54.method1597(2, 0, 0, var6, var5, DummyClass35.signLink);
      if (GlobalStatics_10.fullScreenFrame != null) {
        SettingsStatics.anInt3071 = var6;
        SettingsStatics.anInt2378 = var5;
        SettingsStatics.writeSettings(DummyClass35.signLink);
      }
    }

    if (var1 == 3 && GlobalStatics_10.fullScreenFrame == null) {
      GlobalStatics_9
          .setWindowMode(true, SettingsStatics.anInt2577, true, antialiasing,
              var4, -1,
              -1);
    } else {
      Component var7 = null;
      if (GlobalStatics_10.fullScreenFrame == null) {
        if (GlobalStatics_10.FRAME != null) {
          var7 = GlobalStatics_10.FRAME;
        }
      } else {
        var7 = GlobalStatics_10.fullScreenFrame;
      }

      GlobalStatics_6.windowWidth = var7.getSize().width;
      GlobalStatics_9.windowHeight = var7.getSize().height;
      if (GlobalStatics_10.FRAME == var7) {
        Insets var8 = GlobalStatics_10.FRAME.getInsets();
        GlobalStatics_6.windowWidth -= var8.right + var8.left;
        GlobalStatics_9.windowHeight -= var8.bottom + var8.top;
      }

      if (var4) {
        GameStringStatics.aClass94_4071 = null;
      }

      if (var1 >= 2) {
        DummyClass30.viewWidth = GlobalStatics_6.windowWidth;
        GlobalStatics_9.viewHeight = GlobalStatics_9.windowHeight;
        DummyClass51.viewX = 0;
        GlobalStatics_7.viewY = 0;
      } else {
        GlobalStatics_7.viewY = 0;
        DummyClass51.viewX = (GlobalStatics_6.windowWidth - 765) / 2;
        DummyClass30.viewWidth = 765;
        GlobalStatics_9.viewHeight = 503;
      }

      if (replaceCanvas) {
        DummyClass9.unbindKeyboard(GlobalStatics_8.GAME_CANVAS, -9320);
        MouseStatics.unbind(GlobalStatics_8.GAME_CANVAS);
        if (MouseWheelStatics.MOUSE_WHEEL != null) {
          MouseWheelStatics.MOUSE_WHEEL.unbind(GlobalStatics_8.GAME_CANVAS);
        }
        GlobalStatics_9.client.initializeCanvas();
        GlobalStatics_10.method193(GlobalStatics_8.GAME_CANVAS);
        MouseStatics.bindMouseListener(GlobalStatics_8.GAME_CANVAS);
        if (MouseWheelStatics.MOUSE_WHEEL != null) {
          MouseWheelStatics.MOUSE_WHEEL.bind(GlobalStatics_8.GAME_CANVAS);
        }
      } else {
        if (GlRenderer.USE_OPENGL) {
          GlRenderer.setViewportDimensions(DummyClass30.viewWidth,
              GlobalStatics_9.viewHeight);
        }

        GlobalStatics_8.GAME_CANVAS
            .setSize(DummyClass30.viewWidth, GlobalStatics_9.viewHeight);
        if (GlobalStatics_10.FRAME == var7) {
          Insets var8 = GlobalStatics_10.FRAME.getInsets();
          GlobalStatics_8.GAME_CANVAS
              .setLocation(var8.left + DummyClass51.viewX,
                  var8.top + GlobalStatics_7.viewY);
        } else {
          GlobalStatics_8.GAME_CANVAS
              .setLocation(DummyClass51.viewX, GlobalStatics_7.viewY);
        }
      }

      if (var1 == 0 && antialiasing > 0) {
        GlRenderer.method1834(GlobalStatics_8.GAME_CANVAS);
      }

      if (releaseGlResources && var1 > 0) {
        GlobalStatics_8.GAME_CANVAS.setIgnoreRepaint(true);
        if (!GlobalStatics_8.BIND_CANVAS) {
          DummyClass34.method995();
          GlobalStatics_9.viewImageProducer = null;
          GlobalStatics_9.viewImageProducer =
              GlobalStatics_10.createImageProducer(GlobalStatics_9.viewHeight,
                  DummyClass30.viewWidth,
                  true, GlobalStatics_8.GAME_CANVAS);
          DummyClass47.method1320();
          if (DummyClass15.state == 5) {
            GlobalStatics_9
                .drawLoadingScreen(GlobalStatics_8.aClass3_Sub28_Sub17_2096,
                    true);
          } else {
            GlobalStatics_3
                .drawLoadingBox(GameStringStatics.LOADING_PLEASE_WAIT, false);
          }

          Graphics var11 = GlobalStatics_8.GAME_CANVAS.getGraphics();
          GlobalStatics_9.viewImageProducer.draw(0, 0, var11, 0);

          GlobalStatics_9.method1396(-1);
          if (antialiasing == 0) {
            GlobalStatics_9.viewImageProducer =
                GlobalStatics_10.createImageProducer(503, 765, true,
                    GlobalStatics_8.GAME_CANVAS);
          } else {
            GlobalStatics_9.viewImageProducer = null;
          }

          SignLinkRequest var13 =
              DummyClass35.signLink
                  .method1444(GlobalStatics_9.client.getClass());

          while (var13.status == 0) {
            ThreadUtilities.sleep(100L);
          }

          if (var13.status == 1) {
            GlobalStatics_8.BIND_CANVAS = true;
          }
        }

        if (GlobalStatics_8.BIND_CANVAS) {
          GlRenderer
              .bindCanvas(GlobalStatics_8.GAME_CANVAS,
                  2 * SettingsStatics.GL_RENDERING_SAMPLES);
        }
      }

      if (!GlRenderer.USE_OPENGL && var1 > 0) {
        GlobalStatics_9
            .setWindowMode(true, 0, true, antialiasing, false, -1, -1);
      } else {
        if (var1 > 0 && antialiasing == 0) {
          DummyClass1.gameThread.setPriority(5);
          GlobalStatics_9.viewImageProducer = null;
          GlobalStatics_1.method1935();
          ((TextureCache) GLStatics.textureCache).method1619(200, -1);
          if (SettingsStatics.USE_BUMP_MAPS) {
            DummyClass40.updateLightness(0.7F);
          }

          GlobalStatics_3.method165(-7878);
        } else if (var1 == 0 && antialiasing > 0) {
          DummyClass1.gameThread.setPriority(1);
          GlobalStatics_9.viewImageProducer =
              GlobalStatics_10.createImageProducer(503, 765, true,
                  GlobalStatics_8.GAME_CANVAS);
          GlobalStatics_1.method1938();
          DummyClass0.method1756();
          ((TextureCache) GLStatics.textureCache).method1619(20, -1);
          if (SettingsStatics.USE_BUMP_MAPS) {
            if (SettingsStatics.BRIGHTNESS == 1) {
              DummyClass40.updateLightness(0.9F);
            }

            if (SettingsStatics.BRIGHTNESS == 2) {
              DummyClass40.updateLightness(0.8F);
            }

            if (SettingsStatics.BRIGHTNESS == 3) {
              DummyClass40.updateLightness(0.7F);
            }

            if (SettingsStatics.BRIGHTNESS == 4) {
              DummyClass40.updateLightness(0.6F);
            }
          }

          GLStatics.method144();
          GlobalStatics_3.method165(-7878);
        }

        if (releaseGlResources) {
          GlobalStatics_10.method389(false);
        }

        GlobalStatics_9.aBoolean2427 = var1 >= 2;

        if (GlobalStatics_9.anInt3655 != -1) {
          DummyClass23.method1746(true);
        }

        if (GlobalStatics_9.GAME_SOCKET != null && (
            DummyClass15.state == 30
                || DummyClass15.state == 25)) {
          GlobalStatics_9.method204(-3);
        }

        for (int var12 = 0; var12 < 100; ++var12) {
          GlobalStatics_9.aBooleanArray3674[var12] = true;
        }

        GlobalStatics_10.aBoolean3116 = true;
      }
    }
  }

  public static void clear13(byte var0) {
    GlobalStatics_9.aClass3_Sub28_Sub16Array996 = null;
    if (var0 != -88) {
      GlobalStatics_9.method1250(-72, true);
    }

    GlobalStatics_9.aClass94_995 = null;
  }

  public static void method1250(int var0, boolean var1) {
    GlobalStatics_9.aByteArrayArrayArray2339 = null;
    GlobalStatics_4.anIntArrayArrayArray720 = null;
    if (var0 < 14) {
      GlobalStatics_9.method1250(10, true);
    }

    GlobalStatics_9.aClass11_3551 = null;
    GlobalStatics_9.aByteArrayArrayArray383 = null;
    DummyClass51.anIntArray1161 = null;
    GlobalStatics_7.aByteArrayArrayArray2452 = null;
    if (var1
        && com.jagex.runescape.statics.GlobalStatics_0.aClass3_Sub28_Sub3_2600
        != null) {
      GameStringStatics.aClass94_3220 = com.jagex.runescape.statics.GlobalStatics_0.aClass3_Sub28_Sub3_2600.aClass94_3561;
    } else {
      GameStringStatics.aClass94_3220 = null;
    }

    com.jagex.runescape.statics.GlobalStatics_0.aByteArrayArrayArray640 = null;
    GlobalStatics_10.aByteArrayArrayArray3390 = null;
    GlobalStatics_9.anIntArrayArrayArray558 = null;
    GlobalStatics_5.anIntArrayArrayArray1903 = null;
    GlobalStatics_8.anInt2737 = 0;
    com.jagex.runescape.statics.GlobalStatics_0.aClass3_Sub28_Sub3_2600 = null;
    DummyClass51.aClass61_1162.clear(-108);
    DummyClass25.aClass131_1624 = null;
    GlobalStatics_9.anInt3362 = -1;
    GlobalStatics_9.aClass33_2648 = null;
    GlobalStatics_7.aClass33_1305 = null;
    GlobalStatics_4.aClass33_1238 = null;
    DummyClass12.aClass33_2034 = null;
    GlobalStatics_9.aClass33_3019 = null;
    DummyClass54.aClass33_1399 = null;
    GlobalStatics_9.aClass33_2637 = null;
    DummyClass25.aClass33_1626 = null;
    com.jagex.runescape.statics.GlobalStatics_0.aClass3_Sub28_Sub16_637 = null;
    GlobalStatics_9.anInt1150 = -1;
    GlobalStatics_9.aClass3_Sub28_Sub16_Sub2_3221 = null;
  }

  public static SoftwareDirectColorSprite method578(int var0) {
    int var1 =
        GlobalStatics_10.anIntArray3076[0] * GlobalStatics_9.anIntArray2931[0];
    byte[] var2 = DummyClass5.aByteArrayArray2987[0];
    if (var0 != 115) {
      GlobalStatics_9.CURRENT_KEY = 112;
    }

    SoftwareDirectColorSprite var3;
    if (GlobalStatics_9.aBooleanArray3272[0]) {
      byte[] var4 = DummyClass4.aByteArrayArray3005[0];
      int[] var5 = new int[var1];

      for (int var6 = 0; var6 < var1; ++var6) {
        var5[var6] =
            var4[var6] << 24 & -16777216 | GlobalStatics_10.anIntArray3446[255
                & (int) var2[var6]];
      }

      var3 = new SoftwareDirectFullColorSprite(GlobalStatics_9.anInt2426,
          GlobalStatics_9.anInt1748, GlobalStatics_9.anIntArray2048[0],
          com.jagex.runescape.statics.GlobalStatics_0.anIntArray2591[0],
          GlobalStatics_9.anIntArray2931[0], GlobalStatics_10.anIntArray3076[0],
          var5);
    } else {
      int[] var8 = new int[var1];

      for (int var9 = 0; var9 < var1; ++var9) {
        var8[var9] = GlobalStatics_10.anIntArray3446[(int) var2[var9] & 255];
      }

      var3 =
          new SoftwareDirectColorSprite(GlobalStatics_9.anInt2426,
              GlobalStatics_9.anInt1748,
              GlobalStatics_9.anIntArray2048[0],
              com.jagex.runescape.statics.GlobalStatics_0.anIntArray2591[0],
              GlobalStatics_9.anIntArray2931[0],
              GlobalStatics_10.anIntArray3076[0], var8);
    }

    DummyClass37.method1035((byte) 127);
    return var3;
  }

  public static void method580(byte var0) {
    if (var0 != 80) {
      GlobalStatics_9
          .method582(88, 85, -8, true, 72, 12, 29, 96, 6, 57, -13, 15);
    }

    GlobalStatics_2.aClass130_2220 = new HashTable(32);
  }

  public static void method581(FileUnpacker var0, int var1, FileUnpacker var2) {
    GlobalStatics_3.aClass3_Sub28_Sub17_2379 =
        GlobalStatics_7
            .createFont(0, GlobalStatics_9.p11FontFileId, (byte) 124, var2,
                var0);
    if (GlRenderer.USE_OPENGL) {
      GlobalStatics_9.aClass3_Sub28_Sub17_Sub1_2000 =
          GlobalStatics_9
              .method1287(GlobalStatics_9.p11FontFileId, 0, var0, var2, -1);
    } else {
      GlobalStatics_9.aClass3_Sub28_Sub17_Sub1_2000 =
          (SoftwareFont) GlobalStatics_3.aClass3_Sub28_Sub17_2379;
    }

    GlobalStatics_9.p12Font =
        GlobalStatics_7
            .createFont(var1, GlobalStatics_9.p12FontFileId, (byte) 125, var2,
                var0);
    GlobalStatics_8.aClass3_Sub28_Sub17_2096 =
        GlobalStatics_7
            .createFont(0, GlobalStatics_9.b12FontFileId, (byte) 124, var2,
                var0);
  }

  public static boolean method582(int var0, int var1, int var2, boolean var3,
      int var4, int var5,
      int var6, int var7, int var8, int var9, int var10, int var11) {
    return GlobalStatics_9.localPlayer.getSize() == var5 ? GlobalStatics_9
        .method76(var7, var8, var4, var0, var10, var3, var2, var1, var6,
            var9,
            127, var11) : GlobalStatics_9.localPlayer.getSize() <= 2 ?
        GlobalStatics_7
            .method2191(var6, var4, var11, -1001, var10, var9, var2, var1,
                var3,
                var8, var0, var7) :
        GlobalStatics_9.method1166(var10, (byte) 34, var7, var9, var1,
            GlobalStatics_9.localPlayer.getSize(), var6, var8, var4, var11,
            var2, var3,
            var0);
  }

  public static void clear98(int var0) {
    GlobalStatics_9.aCalendar3616 = null;
    if (var0 != 0) {
      GlobalStatics_9.method580((byte) -90);
    }

    GameStringStatics.aClass94_3621 = null;
  }

  public static void clear26(byte var0) {
    GameStringStatics.aClass94_3971 = null;
    GameStringStatics.aClass94_3957 = null;
    GlobalStatics_9.anIntArray3951 = null;
    GameStringStatics.FORCED_TWEENING_ENABLED = null;
    GlobalStatics_9.anIntArray3959 = null;
    if (var0 <= 116) {
      GlobalStatics_9.clear26((byte) -48);
    }

    GlobalStatics_9.quady0 = null;
    GlobalStatics_9.LABELS = null;
  }

  public static void method1160(int var0, int var1) {
    if (GlobalStatics_11.method57(var1, 104)) {
      if (var0 > -100) {
        GlobalStatics_9.clear36(52);
      }

      GlobalStatics_9
          .method1260(23206, -1, GlobalStatics_9.aClass11ArrayArray1834[var1]);
    }
  }

  public static boolean method1166(int var0, byte var1, int var2, int var3,
      int var4, int var5,
      int var6, int var7, int var8, int var9, int var10, boolean var11,
      int var12) {
    int var13;
    int var14;
    for (var13 = 0; var13 < 104; ++var13) {
      for (var14 = 0; var14 < 104; ++var14) {
        DummyClass51.anIntArrayArray1160[var13][var14] = 0;
        GlobalStatics_10.anIntArrayArray1373[var13][var14] = 99999999;
      }
    }

    var13 = var9;
    var14 = var12;
    DummyClass51.anIntArrayArray1160[var9][var12] = 99;
    GlobalStatics_10.anIntArrayArray1373[var9][var12] = 0;
    byte var15 = 0;
    if (var1 == 34) {
      GlobalStatics_10.anIntArray3456[var15] = var9;
      int var28 = var15 + 1;
      DummyClass38.anIntArray729[var15] = var12;
      int var16 = 0;
      boolean var17 = false;
      int[][] var18 =
          com.jagex.runescape.statics.GlobalStatics_0.collisionMaps[GlobalStatics_9.currentPlane].anIntArrayArray1304;

      int var19;
      int var20;
      label410:
      while (var16 != var28) {
        var13 = GlobalStatics_10.anIntArray3456[var16];
        var14 = DummyClass38.anIntArray729[var16];
        var16 = 1 + var16 & 4095;
        if (var6 == var13 && var14 == var0) {
          var17 = true;
          break;
        }

        if (var7 != 0) {
          if ((var7 < 5 || var7 == 10)
              && com.jagex.runescape.statics.GlobalStatics_0.collisionMaps[GlobalStatics_9.currentPlane]
              .method1488(var0, var13,
                  false, var14, var6, var7 - 1, var5, var4)) {
            var17 = true;
            break;
          }

          if (var7 < 10
              && com.jagex.runescape.statics.GlobalStatics_0.collisionMaps[GlobalStatics_9.currentPlane]
              .method1492(
                  var0, -1 + var7, var6, var14, var5, var4, var13, 95)) {
            var17 = true;
            break;
          }
        }

        if (var2 != 0 && var10 != 0
            && com.jagex.runescape.statics.GlobalStatics_0.collisionMaps[GlobalStatics_9.currentPlane]
            .method1498(true, var6,
                var14, var13, var5, var2, var8, var0, var10)) {
          var17 = true;
          break;
        }

        var19 = 1 + GlobalStatics_10.anIntArrayArray1373[var13][var14];
        if (var13 > 0
            && DummyClass51.anIntArrayArray1160[-1 + var13][var14] == 0
            && (var18[var13 - 1][var14] & 19661070) == 0 && (19661112
            & var18[-1 + var13][-1
            + var5 + var14]) == 0) {
          var20 = 1;

          while (true) {
            if (-1 + var5 <= var20) {
              GlobalStatics_10.anIntArray3456[var28] = -1 + var13;
              DummyClass38.anIntArray729[var28] = var14;
              DummyClass51.anIntArrayArray1160[-1 + var13][var14] = 2;
              var28 = 4095 & 1 + var28;
              GlobalStatics_10.anIntArrayArray1373[var13
                  - 1][var14] = var19;
              break;
            }

            if ((19661118 & var18[-1 + var13][var14 + var20]) != 0) {
              break;
            }

            ++var20;
          }
        }

        if (var13 < 102
            && DummyClass51.anIntArrayArray1160[1 + var13][var14] == 0
            && (19661187 & var18[var13 + var5][var14]) == 0
            && (19661280 & var18[var5 + var13][var14 + var5 - 1]) == 0) {
          var20 = 1;

          while (true) {
            if (var20 >= -1 + var5) {
              GlobalStatics_10.anIntArray3456[var28] = var13 + 1;
              DummyClass38.anIntArray729[var28] = var14;
              DummyClass51.anIntArrayArray1160[var13 + 1][var14] = 8;
              GlobalStatics_10.anIntArrayArray1373[var13
                  + 1][var14] = var19;
              var28 = 4095 & var28 + 1;
              break;
            }

            if ((var18[var5 + var13][var14 + var20] & 19661283) != 0) {
              break;
            }

            ++var20;
          }
        }

        if (var14 > 0 && DummyClass51.anIntArrayArray1160[var13][-1
            + var14] == 0
            && (19661070 & var18[var13][-1 + var14]) == 0 && (19661187
            & var18[-1 + var5
            + var13][var14 - 1]) == 0) {
          var20 = 1;

          while (true) {
            if (-1 + var5 <= var20) {
              GlobalStatics_10.anIntArray3456[var28] = var13;
              DummyClass38.anIntArray729[var28] = -1 + var14;
              DummyClass51.anIntArrayArray1160[var13][-1 + var14] = 1;
              var28 = 4095 & 1 + var28;
              GlobalStatics_10.anIntArrayArray1373[var13][-1
                  + var14] = var19;
              break;
            }

            if ((var18[var13 + var20][var14 - 1] & 19661199) != 0) {
              break;
            }

            ++var20;
          }
        }

        if (var14 < 102
            && DummyClass51.anIntArrayArray1160[var13][1 + var14] == 0
            && (var18[var13][var14 + var5] & 19661112) == 0 && (
            19661280 & var18[-1 + var13
                + var5][var5 + var14]) == 0) {
          var20 = 1;

          while (true) {
            if (var20 >= var5 - 1) {
              GlobalStatics_10.anIntArray3456[var28] = var13;
              DummyClass38.anIntArray729[var28] = var14 + 1;
              DummyClass51.anIntArrayArray1160[var13][1 + var14] = 4;
              GlobalStatics_10.anIntArrayArray1373[var13][1
                  + var14] = var19;
              var28 = 4095 & var28 + 1;
              break;
            }

            if ((19661304 & var18[var13 + var20][var5 + var14]) != 0) {
              break;
            }

            ++var20;
          }
        }

        if (var13 > 0 && var14 > 0
            && DummyClass51.anIntArrayArray1160[var13 - 1][var14
            - 1] == 0
            && (var18[var13 - 1][-1 + var5 - 1 + var14] & 19661112) == 0
            && (19661070
            & var18[-1 + var13][var14 - 1]) == 0
            && (var18[var5 - 1 + var13 - 1][-1 + var14] & 19661187) == 0) {
          var20 = 1;

          while (true) {
            if (var5 - 1 <= var20) {
              GlobalStatics_10.anIntArray3456[var28] = var13 - 1;
              DummyClass38.anIntArray729[var28] = -1 + var14;
              var28 = 4095 & var28 + 1;
              DummyClass51.anIntArrayArray1160[var13 - 1][-1 + var14] = 3;
              GlobalStatics_10.anIntArrayArray1373[-1 + var13][var14
                  - 1] = var19;
              break;
            }

            if ((var18[var13 - 1][var14 - 1 + var20] & 19661118) != 0
                || (19661199 & var18[
                var20 - 1 + var13][-1 + var14]) != 0) {
              break;
            }

            ++var20;
          }
        }

        if (var13 < 102 && var14 > 0
            && DummyClass51.anIntArrayArray1160[1 + var13][-1
            + var14] == 0 && (19661070 & var18[1 + var13][-1 + var14]) == 0
            && (var18[var5 + var13][-1 + var14] & 19661187) == 0
            && (var18[var13 + var5][-1 + var14 + var5 - 1] & 19661280)
            == 0) {
          var20 = 1;

          while (true) {
            if (var20 >= -1 + var5) {
              GlobalStatics_10.anIntArray3456[var28] = 1 + var13;
              DummyClass38.anIntArray729[var28] = -1 + var14;
              var28 = 1 + var28 & 4095;
              DummyClass51.anIntArrayArray1160[var13 + 1][-1 + var14] = 9;
              GlobalStatics_10.anIntArrayArray1373[1 + var13][-1
                  + var14] = var19;
              break;
            }

            if ((19661283 & var18[var13 + var5][var14 - (1 - var20)]) != 0
                || (19661199 & var18[var20 + var13 + 1][-1 + var14]) != 0) {
              break;
            }

            ++var20;
          }
        }

        if (var13 > 0 && var14 < 102
            && DummyClass51.anIntArrayArray1160[-1 + var13][
            var14 + 1] == 0 && (19661070 & var18[var13 - 1][1 + var14]) == 0
            && (19661112 & var18[-1 + var13][var14 + var5]) == 0 && (
            19661280 & var18[var13][
                var14 + var5]) == 0) {
          var20 = 1;

          while (true) {
            if (-1 + var5 <= var20) {
              GlobalStatics_10.anIntArray3456[var28] = var13 - 1;
              DummyClass38.anIntArray729[var28] = var14 + 1;
              var28 = 4095 & var28 + 1;
              DummyClass51.anIntArrayArray1160[-1 + var13][1 + var14] = 6;
              GlobalStatics_10.anIntArrayArray1373[-1 + var13][1
                  + var14] = var19;
              break;
            }

            if ((var18[var13 - 1][var14 + 1 + var20] & 19661118) != 0
                || (var18[var20 - 1 + var13][var5 + var14] & 19661304) != 0) {
              break;
            }

            ++var20;
          }
        }

        if (var13 < 102 && var14 < 102
            && DummyClass51.anIntArrayArray1160[var13 + 1][1 + var14] == 0
            && (19661112
            & var18[var13 + 1][var14 + var5]) == 0 && (
            var18[var13 + var5][var14 + var5]
                & 19661280) == 0
            && (19661187 & var18[var5 + var13][1 + var14]) == 0) {
          for (var20 = 1; var20 < -1 + var5; ++var20) {
            if ((var18[var20 + var13 + 1][var14 + var5] & 19661304) != 0
                || (
                var18[var5 + var13][var20 + var14 + 1] & 19661283) != 0) {
              continue label410;
            }
          }

          GlobalStatics_10.anIntArray3456[var28] = 1 + var13;
          DummyClass38.anIntArray729[var28] = var14 + 1;
          DummyClass51.anIntArrayArray1160[1 + var13][1 + var14] = 12;
          GlobalStatics_10.anIntArrayArray1373[1 + var13][1
              + var14] = var19;
          var28 = 1 + var28 & 4095;
        }
      }

      GlobalStatics_4.anInt1692 = 0;
      if (!var17) {
        if (!var11) {
          return false;
        }

        var19 = 1000;
        var20 = 100;
        byte var21 = 10;

        for (int var22 = var6 - var21; var22 <= var21 + var6; ++var22) {
          for (int var23 = -var21 + var0; var23 <= var0 + var21;
              ++var23) {
            if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104
                && GlobalStatics_10.anIntArrayArray1373[var22][var23] < 100) {
              int var24 = 0;
              if (var6 > var22) {
                var24 = -var22 + var6;
              } else if (var6 - (-var2 + 1) < var22) {
                var24 = -var2 - var6 + 1 + var22;
              }

              int var25 = 0;
              if (var23 < var0) {
                var25 = -var23 + var0;
              } else if (var0 + var10 - 1 < var23) {
                var25 = var23 + 1 - var0 - var10;
              }

              int var26 = var24 * var24 + var25 * var25;
              if (var26 < var19 || var26 == var19
                  && var20
                  > GlobalStatics_10.anIntArrayArray1373[var22][var23]) {
                var20 = GlobalStatics_10.anIntArrayArray1373[var22][var23];
                var13 = var22;
                var19 = var26;
                var14 = var23;
              }
            }
          }
        }

        if (var19 == 1000) {
          return false;
        }

        if (var13 == var9 && var12 == var14) {
          return false;
        }

        GlobalStatics_4.anInt1692 = 1;
      }

      byte var29 = 0;
      GlobalStatics_10.anIntArray3456[var29] = var13;
      var16 = var29 + 1;
      DummyClass38.anIntArray729[var29] = var14;

      for (
          var19 = var20 = DummyClass51.anIntArrayArray1160[var13][var14];
          var13 != var9 || var12 != var14;
          var19 = DummyClass51.anIntArrayArray1160[var13][var14]) {
        if (var20 != var19) {
          GlobalStatics_10.anIntArray3456[var16] = var13;
          var20 = var19;
          DummyClass38.anIntArray729[var16++] = var14;
        }

        if ((2 & var19) == 0) {
          if ((8 & var19) != 0) {
            --var13;
          }
        } else {
          ++var13;
        }

        if ((var19 & 1) != 0) {
          ++var14;
        } else if ((var19 & 4) != 0) {
          --var14;
        }
      }

      if (var16 <= 0) {
        return var3 != 1;
      } else {
        GlobalStatics_9.method299(93, var16, var3);
        return true;
      }
    } else {
      return true;
    }
  }

  public static void clear36(int var0) {
    GameStringStatics.aClass94_853 = null;
    GameStringStatics.aClass94_852 = null;
    if (var0 == 8160) {
      GlobalStatics_9.anIntArray859 = null;
      GameStringStatics.COMMAND_WM0 = null;
      GlobalStatics_9.anIntArray861 = null;
    }
  }

  public static void method968(int var0) {
    int[] var1 = new int[GlobalStatics_10.anInt3287];
    int var2 = 0;

    int var3;
    for (var3 = 0; GlobalStatics_10.anInt3287 > var3; ++var3) {
      ItemConfig var4 = DummyClass35.getItemConfig(var3);
      if (var4.anInt793 >= 0 || var4.anInt761 >= 0) {
        var1[var2++] = var3;
      }
    }

    GlobalStatics_9.anIntArray2664 = new int[var2];

    for (var3 = 0; var3 < var2; ++var3) {
      GlobalStatics_9.anIntArray2664[var3] = var1[var3];
    }

    if (var0 != 128) {
      GlobalStatics_9.method968(19);
    }
  }

  public static void method969(FileUnpacker var0, int var1) {
    GlobalStatics_9.aClass153_322 = var0;
    if (var1 < 39) {
      GlobalStatics_9.mouseWheelOffset = -82;
    }
  }

  public static void method971(int var0, int[][] var1, float[][] var2, int var3,
      float[][] var4,
      int var5, byte var6, int var7, int var8, byte var9, boolean var10,
      byte var11, int var12, float[][] var13, int var14,
      SomethingGl0 var15) {
    int var16 = 255 + (var0 << 8);
    int var17 = (var5 << 8) + 255;
    int var18 = (var8 << 8) + 255;
    int var19 = (var14 << 8) + 255;
    int[] var20 = DummyClass21.anIntArrayArray1763[var11];
    int[] var22 = new int[var20.length >> 1];

    int var23;
    for (var23 = 0; var23 < var22.length; ++var23) {
      var22[var23] =
          GlobalStatics_6
              .method1734(var19, 0.0F, var16, var17, null, var1, var3, var13,
                  var18,
                  (byte) -125, var6, false, var15, var2, var12,
                  var20[var23 + var23], var4,
                  var20[var23 + var23 + 1]);
    }

    if (var9 == 88) {
      int[] var21 = null;
      if (var10) {
        int var24;
        if (var11 == 1) {
          var23 = GlobalStatics_6
              .method1734(var19, 0.0F, var16, var17, null, var1, var3, var13,
                  var18,
                  (byte) -122, var6, true, var15, var2, var12, 64, var4, 128);
          var24 = GlobalStatics_6
              .method1734(var19, 0.0F, var16, var17, null, var1, var3, var13,
                  var18,
                  (byte) -114, var6, true, var15, var2, var12, 128, var4, 64);
          var21 = new int[]{var24, var23, var22[2], var23, var22[0], var22[2]};
        } else if (var11 == 2) {
          var21 = new int[6];
          var23 = GlobalStatics_6
              .method1734(var19, 0.0F, var16, var17, null, var1, var3, var13,
                  var18,
                  (byte) -121, var6, true, var15, var2, var12, 128, var4, 128);
          var24 = GlobalStatics_6
              .method1734(var19, 0.0F, var16, var17, null, var1, var3, var13,
                  var18,
                  (byte) -128, var6, true, var15, var2, var12, 64, var4, 0);
          var21[2] = var23;
          var21[0] = var22[0];
          var21[5] = var22[0];
          var21[3] = var23;
          var21[1] = var24;
          var21[4] = var22[1];
        } else if (var11 != 3) {
          if (var11 == 4) {
            var21 = new int[3];
            var23 =
                GlobalStatics_6
                    .method1734(var19, 0.0F, var16, var17, null, var1, var3,
                        var13, var18,
                        (byte) -115, var6, true, var15, var2, var12, 0, var4,
                        128);
            var21[0] = var22[3];
            var21[2] = var22[0];
            var21[1] = var23;
          } else if (var11 != 5) {
            if (var11 == 6) {
              var21 = new int[6];
              var23 =
                  GlobalStatics_6
                      .method1734(var19, 0.0F, var16, var17, null, var1, var3,
                          var13, var18,
                          (byte) -123, var6, true, var15, var2, var12, 128,
                          var4, 0);
              var24 =
                  GlobalStatics_6
                      .method1734(var19, 0.0F, var16, var17, null, var1, var3,
                          var13, var18,
                          (byte) -115, var6, true, var15, var2, var12, 128,
                          var4, 128);
              var21[1] = var23;
              var21[0] = var22[3];
              var21[2] = var24;
              var21[4] = var22[0];
              var21[3] = var24;
              var21[5] = var22[3];
            } else {
              if (var11 == 7) {
                var21 = new int[6];
                var23 =
                    GlobalStatics_6
                        .method1734(var19, 0.0F, var16, var17, null, var1,
                            var3, var13, var18,
                            (byte) -126, var6, true, var15, var2, var12, 0,
                            var4, 128);
                var24 =
                    GlobalStatics_6
                        .method1734(var19, 0.0F, var16, var17, null, var1,
                            var3, var13, var18,
                            (byte) -117, var6, true, var15, var2, var12, 128,
                            var4, 0);
                var21[3] = var23;
                var21[2] = var23;
                var21[0] = var22[1];
                var21[4] = var22[2];
                var21[1] = var24;
                var21[5] = var22[1];
              } else if (var11 == 8) {
                var21 = new int[3];
                var23 =
                    GlobalStatics_6
                        .method1734(var19, 0.0F, var16, var17, null, var1,
                            var3, var13, var18,
                            (byte) -117, var6, true, var15, var2, var12, 0,
                            var4, 0);
                var21[2] = var22[4];
                var21[0] = var22[3];
                var21[1] = var23;
              } else if (var11 == 9) {
                var23 =
                    GlobalStatics_6
                        .method1734(var19, 0.0F, var16, var17, null, var1,
                            var3, var13, var18,
                            (byte) -118, var6, true, var15, var2, var12, 128,
                            var4, 64);
                var24 =
                    GlobalStatics_6
                        .method1734(var19, 0.0F, var16, var17, null, var1,
                            var3, var13, var18,
                            (byte) -121, var6, true, var15, var2, var12, 96,
                            var4, 32);
                int var25 =
                    GlobalStatics_6
                        .method1734(var19, 0.0F, var16, var17, null, var1,
                            var3, var13, var18,
                            (byte) -120, var6, true, var15, var2, var12, 64,
                            var4, 0);
                var21 = new int[]{
                    var24, var23, var22[4], var24, var22[4], var22[3], var24,
                    var22[3], var22[2],
                    var24, var22[2], var22[1], var24, var22[1], var25
                };
              } else if (var11 != 10) {
                if (var11 == 11) {
                  var21 = new int[12];
                  var23 =
                      GlobalStatics_6
                          .method1734(var19, 0.0F, var16, var17, null, var1,
                              var3, var13,
                              var18, (byte) -119, var6, true, var15, var2,
                              var12, 0, var4, 64);
                  var24 =
                      GlobalStatics_6
                          .method1734(var19, 0.0F, var16, var17, null, var1,
                              var3, var13,
                              var18, (byte) -121, var6, true, var15, var2,
                              var12, 128, var4, 64);
                  var21[5] = var23;
                  var21[1] = var23;
                  var21[8] = var23;
                  var21[0] = var22[3];
                  var21[2] = var22[0];
                  var21[11] = var24;
                  var21[6] = var22[2];
                  var21[7] = var24;
                  var21[10] = var22[1];
                  var21[3] = var22[3];
                  var21[4] = var22[2];
                  var21[9] = var22[2];
                }
              } else {
                var21 = new int[9];
                var23 =
                    GlobalStatics_6
                        .method1734(var19, 0.0F, var16, var17, null, var1,
                            var3, var13, var18,
                            (byte) -120, var6, true, var15, var2, var12, 0,
                            var4, 128);
                var21[0] = var22[2];
                var21[8] = var22[0];
                var21[1] = var23;
                var21[4] = var23;
                var21[2] = var22[3];
                var21[7] = var23;
                var21[3] = var22[3];
                var21[5] = var22[4];
                var21[6] = var22[4];
              }
            }
          } else {
            var21 = new int[3];
            var23 =
                GlobalStatics_6
                    .method1734(var19, 0.0F, var16, var17, null, var1, var3,
                        var13, var18,
                        (byte) -112, var6, true, var15, var2, var12, 128, var4,
                        128);
            var21[1] = var23;
            var21[0] = var22[2];
            var21[2] = var22[3];
          }
        } else {
          var21 = new int[6];
          var23 = GlobalStatics_6
              .method1734(var19, 0.0F, var16, var17, null, var1, var3, var13,
                  var18,
                  (byte) -114, var6, true, var15, var2, var12, 0, var4, 128);
          var24 = GlobalStatics_6
              .method1734(var19, 0.0F, var16, var17, null, var1, var3, var13,
                  var18,
                  (byte) -115, var6, true, var15, var2, var12, 64, var4, 0);
          var21[4] = var24;
          var21[1] = var22[1];
          var21[0] = var22[2];
          var21[3] = var23;
          var21[2] = var23;
          var21[5] = var22[2];
        }
      }

      var15.method150(var7, var3, var12, var22, var21, false);
    }
  }

  public static void method973(byte var0) {
    GameStringStatics.aClass94_559 = null;
    GameStringStatics.aClass94_560 = null;
    GlobalStatics_9.aClass153_557 = null;
    GlobalStatics_9.anIntArrayArrayArray558 = null;
  }

  public static void method1405(int var0, int var1, int var2, int var3,
      int var4, int var5,
      int var6) {
    GlobalStatics_9.anInt3464 = 0;

    int var7;
    int var15;
    int var19;
    int var21;
    int var22;
    int var29;
    int var32;
    for (var7 = -1; var7 < DummyClass13.anInt2022 + DummyClass6.anInt2046;
        ++var7) {
      Mobile var8;
      if (var7 == -1) {
        var8 = GlobalStatics_9.localPlayer;
      } else if (DummyClass13.anInt2022 > var7) {
        var8 = GlobalStatics_9.PLAYERS[DummyClass42.anIntArray887[var7]];
      } else {
        var8 = GlobalStatics_8.NPCS[GlobalStatics_2.anIntArray347[
            -DummyClass13.anInt2022 + var7]];
      }

      if (var8 != null && var8.hasConfiguration((byte) 17)) {
        NpcConfiguration var9;
        if (var8 instanceof NPC) {
          var9 = ((NPC) var8).config;
          if (var9.anIntArray1292 != null) {
            var9 = var9.method1471((byte) -93);
          }

          if (var9 == null) {
            continue;
          }
        }

        int var12;
        if (var7 < DummyClass13.anInt2022) {
          var19 = 30;
          assert var8 instanceof Player;
          Player var10 = (Player) var8;
          if (var10.anInt3972 != -1 || var10.anInt3955 != -1) {
            DummyClass56.method1647((byte) 122, var4 >> 1, var3, var8, var5,
                var8.method1975(var6 ^ -28716) + 15, var1 >> 1);
            if (DummyClass34.anInt590 > -1) {
              if (var10.anInt3972 != -1) {
                GlobalStatics_9.aClass3_Sub28_Sub16Array3373[var10.anInt3972]
                    .method643(
                        -12 + DummyClass34.anInt590 + var2,
                        -var19 + var0 + GlobalStatics_10.anInt2208);
                var19 += 25;
              }

              if (var10.anInt3955 != -1) {
                GlobalStatics_9.aClass3_Sub28_Sub16Array3977[var10.anInt3955]
                    .method643(
                        -12 + var2 + DummyClass34.anInt590,
                        var0 - (-GlobalStatics_10.anInt2208 + var19));
                var19 += 25;
              }
            }
          }

          if (var7 >= 0) {
            HintMarker[] var11 = GlobalStatics_8.aClass96Array2114;

            for (var12 = 0; var11.length > var12; ++var12) {
              HintMarker var13 = var11[var12];
              if (var13 != null && var13.anInt1360 == 10
                  && DummyClass42.anIntArray887[var7] == var13.anInt1359) {
                DummyClass56.method1647((byte) 122, var4 >> 1, var3, var8, var5,
                    var8.method1975(var6 ^ -28716) + 15, var1 >> 1);
                if (DummyClass34.anInt590 > -1) {
                  GlobalStatics_9.aClass3_Sub28_Sub16Array2072[var13.anInt1351]
                      .method643(
                          var2 - (-DummyClass34.anInt590 + 12),
                          var0 + GlobalStatics_10.anInt2208 - var19);
                }
              }
            }
          }
        } else {
          assert var8 instanceof NPC;
          var9 = ((NPC) var8).config;
          if (var9.anIntArray1292 != null) {
            var9 = var9.method1471((byte) 102);
          }

          assert var9 != null;
          if (var9.anInt1269 >= 0
              && GlobalStatics_9.aClass3_Sub28_Sub16Array3977.length
              > var9.anInt1269) {
            if (var9.anInt1265 == -1) {
              var22 = 15 + var8.method1975(27855);
            } else {
              var22 = 15 + var9.anInt1265;
            }

            DummyClass56
                .method1647((byte) 122, var4 >> 1, var3, var8, var5, var22,
                    var1 >> 1);
            if (DummyClass34.anInt590 > 0) {
              GlobalStatics_9.aClass3_Sub28_Sub16Array3977[var9.anInt1269]
                  .method643(
                      var2 + DummyClass34.anInt590 - 12,
                      -30 + var0 + GlobalStatics_10.anInt2208);
            }
          }

          HintMarker[] var20 = GlobalStatics_8.aClass96Array2114;

          for (var21 = 0; var21 < var20.length; ++var21) {
            HintMarker var24 = var20[var21];
            if (var24 != null && var24.anInt1360 == 1
                && var24.anInt1359 == GlobalStatics_2.anIntArray347[
                -DummyClass13.anInt2022 + var7]
                && GlobalStatics_4.updateCycle % 20 < 10) {
              if (var9.anInt1265 == -1) {
                var29 = 15 + var8.method1975(var6 + 0x89b4);
              } else {
                var29 = 15 + var9.anInt1265;
              }

              DummyClass56
                  .method1647((byte) 122, var4 >> 1, var3, var8, var5, var29,
                      var1 >> 1);
              if (DummyClass34.anInt590 > 0) {
                GlobalStatics_9.aClass3_Sub28_Sub16Array2072[var24.anInt1351]
                    .method643(
                        -12 + var2 + DummyClass34.anInt590,
                        -28 + GlobalStatics_10.anInt2208 + var0);
              }
            }
          }
        }

        assert var8 instanceof Player;
        if (var8.aClass94_2825 != null && (var7 >= DummyClass13.anInt2022
            || GlobalStatics_9.anInt3101 == 0 || GlobalStatics_9.anInt3101
            == 3
            || GlobalStatics_9.anInt3101 == 1 && GlobalStatics_9
            .method1176(((Player) var8).name,
                (byte) -82))) {
          DummyClass56.method1647((byte) 122, var4 >> 1, var3, var8, var5,
              var8.method1975(27855), var1 >> 1);
          if (DummyClass34.anInt590 > -1
              && GlobalStatics_9.anInt3464 < GlobalStatics_10.anInt3332) {
            GlobalStatics_10.anIntArray3329[GlobalStatics_9.anInt3464] =
                GlobalStatics_8.aClass3_Sub28_Sub17_2096
                    .method682(var8.aClass94_2825) / 2;
            GlobalStatics_10.anIntArray3327[GlobalStatics_9.anInt3464] =
                GlobalStatics_8.aClass3_Sub28_Sub17_2096.anInt3727;
            GlobalStatics_10.anIntArray3319[GlobalStatics_9.anInt3464] = DummyClass34.anInt590;
            GlobalStatics_10.anIntArray3337[GlobalStatics_9.anInt3464] = GlobalStatics_10.anInt2208;
            GlobalStatics_10.anIntArray3331[GlobalStatics_9.anInt3464] =
                var8.anInt2837;
            GlobalStatics_10.anIntArray3336[GlobalStatics_9.anInt3464] =
                var8.anInt2753;
            GlobalStatics_10.anIntArray3318[GlobalStatics_9.anInt3464] =
                var8.anInt2814;
            GlobalStatics_10.aClass94Array3317[GlobalStatics_9.anInt3464] =
                var8.aClass94_2825;
            ++GlobalStatics_9.anInt3464;
          }
        }

        if (var8.anInt2781 > GlobalStatics_4.updateCycle) {
          AbstractDirectColorSprite var23 = GlobalStatics_9.aClass3_Sub28_Sub16Array996[0];
          AbstractDirectColorSprite var25 = GlobalStatics_9.aClass3_Sub28_Sub16Array996[1];
          if (var8 instanceof NPC) {
            NPC var28 = (NPC) var8;
            AbstractDirectColorSprite[] var31 =
                (AbstractDirectColorSprite[]) GlobalStatics_9.aClass93_3130.get(
                    var28.config.anInt1279);
            if (var31 == null) {
              var31 =
                  GlobalStatics_9
                      .method2027(0, (byte) 11, var28.config.anInt1279,
                          GlobalStatics_10.sprites);
              if (var31 != null) {
                GlobalStatics_9.aClass93_3130.get((byte) -98, var31,
                    var28.config.anInt1279);
              }
            }

            if (var31 != null && var31.length == 2) {
              var25 = var31[1];
              var23 = var31[0];
            }

            NpcConfiguration var14 = var28.config;
            if (var14.anInt1265 == -1) {
              var21 = var8.method1975(27855);
            } else {
              var21 = var14.anInt1265;
            }
          } else {
            var21 = var8.method1975(27855);
          }

          DummyClass56.method1647((byte) 122, var4 >> 1, var3, var8, var5,
              var23.anInt3696 + 10 + var21, var1 >> 1);
          if (DummyClass34.anInt590 > -1) {
            var12 = -(var23.anInt3707 >> 1) + DummyClass34.anInt590 + var2;
            var29 = GlobalStatics_10.anInt2208 + var0 - 3;
            var23.method643(var12, var29);
            var32 = var23.anInt3707 * var8.anInt2775 / 255;
            var15 = var23.anInt3696;
            if (GlRenderer.USE_OPENGL) {
              GlUtils.method931(var12, var29, var12 + var32, var29 + var15);
            } else {
              DummyClass47
                  .method1326(var12, var29, var12 + var32, var15 + var29);
            }

            var25.method643(var12, var29);
            if (GlRenderer.USE_OPENGL) {
              GlUtils.clip(var2, var0, var1 + var2, var0 + var4);
            } else {
              AbstractImageProducerStatics
                  .method1324(var2, var0, var1 + var2, var4 + var0);
            }
          }
        }

        for (var19 = 0; var19 < 4; ++var19) {
          if (var8.anIntArray2768[var19] > GlobalStatics_4.updateCycle) {
            if (var8 instanceof NPC) {
              NPC var30 = (NPC) var8;
              NpcConfiguration var26 = var30.config;
              if (var26.anInt1265 == -1) {
                var22 = var8.method1975(27855) / 2;
              } else {
                var22 = var26.anInt1265 / 2;
              }
            } else {
              var22 = var8.method1975(var6 ^ -28716) / 2;
            }

            DummyClass56
                .method1647((byte) 122, var4 >> 1, var3, var8, var5, var22,
                    var1 >> 1);
            if (DummyClass34.anInt590 > -1) {
              if (var19 == 1) {
                GlobalStatics_10.anInt2208 -= 20;
              }

              if (var19 == 2) {
                GlobalStatics_10.anInt2208 -= 10;
                DummyClass34.anInt590 -= 15;
              }

              if (var19 == 3) {
                GlobalStatics_10.anInt2208 -= 10;
                DummyClass34.anInt590 += 15;
              }

              GlobalStatics_9.aClass3_Sub28_Sub16Array2656[var8.anIntArray2815[var19]]
                  .method643(-12 + var2 + DummyClass34.anInt590,
                      var0 + GlobalStatics_10.anInt2208 - 12);
              GlobalStatics_3.aClass3_Sub28_Sub17_2379.draw(
                  GlobalStatics_9.toString(var8.anIntArray2836[var19]),
                  -1 + DummyClass34.anInt590 + var2,
                  3 + GlobalStatics_10.anInt2208 + var0, 16777215,
                  0);
            }
          }
        }
      }
    }

    var7 = 0;
    if (var6 != -7397) {
      GlobalStatics_9.method1409(true);
    }

    for (; GlobalStatics_9.anInt3464 > var7; ++var7) {
      var19 = GlobalStatics_10.anIntArray3337[var7];
      int var18 = GlobalStatics_10.anIntArray3319[var7];
      var21 = GlobalStatics_10.anIntArray3327[var7];
      var22 = GlobalStatics_10.anIntArray3329[var7];
      boolean var27 = true;

      while (var27) {
        var27 = false;

        for (var29 = 0; var7 > var29; ++var29) {
          if (GlobalStatics_10.anIntArray3337[var29]
              - GlobalStatics_10.anIntArray3327[var29]
              < 2 + var19
              && -var21 + var19 < GlobalStatics_10.anIntArray3337[var29] + 2
              && -var22 + var18
              < GlobalStatics_10.anIntArray3319[var29]
              + GlobalStatics_10.anIntArray3329[var29]
              && GlobalStatics_10.anIntArray3319[var29]
              - GlobalStatics_10.anIntArray3329[var29]
              < var22 + var18 &&
              -GlobalStatics_10.anIntArray3327[var29]
                  + GlobalStatics_10.anIntArray3337[var29]
                  < var19) {
            var19 =
                GlobalStatics_10.anIntArray3337[var29]
                    - GlobalStatics_10.anIntArray3327[var29];
            var27 = true;
          }
        }
      }

      DummyClass34.anInt590 = GlobalStatics_10.anIntArray3319[var7];
      GlobalStatics_10.anInt2208 = GlobalStatics_10.anIntArray3337[var7] = var19;
      GameString var33 = GlobalStatics_10.aClass94Array3317[var7];
      if (GlobalStatics_7.anInt688 == 0) {
        var32 = 16776960;
        if (GlobalStatics_10.anIntArray3331[var7] < 6) {
          var32 = GlobalStatics_10.anIntArray2213[GlobalStatics_10.anIntArray3331[var7]];
        }

        if (GlobalStatics_10.anIntArray3331[var7] == 6) {
          var32 = GlobalStatics_6.anInt1127 % 20 >= 10 ? 16776960 : 16711680;
        }

        if (GlobalStatics_10.anIntArray3331[var7] == 7) {
          var32 = GlobalStatics_6.anInt1127 % 20 < 10 ? 255 : 0xffff;
        }

        if (GlobalStatics_10.anIntArray3331[var7] == 8) {
          var32 = GlobalStatics_6.anInt1127 % 20 >= 10 ? 8454016 : 0xb000;
        }

        if (GlobalStatics_10.anIntArray3331[var7] == 9) {
          var15 = -GlobalStatics_10.anIntArray3318[var7] + 150;
          if (var15 >= 50) {
            if (var15 >= 100) {
              if (var15 < 150) {
                var32 = -500 - (-(5 * var15) - 0xff00);
              }
            } else {
              var32 = 16776960 + 16384000 - 327680 * var15;
            }
          } else {
            var32 = var15 * 1280 + 16711680;
          }
        }

        if (GlobalStatics_10.anIntArray3331[var7] == 10) {
          var15 = -GlobalStatics_10.anIntArray3318[var7] + 150;
          if (var15 >= 50) {
            if (var15 < 100) {
              var32 = -(327680 * (-50 + var15)) + 16711935;
            } else if (var15 < 150) {
              var32 = 327680 * var15 - (32768000 - (255 - 5 * var15 + 500));
            }
          } else {
            var32 = 16711680 + var15 * 5;
          }
        }

        if (GlobalStatics_10.anIntArray3331[var7] == 11) {
          var15 = 150 - GlobalStatics_10.anIntArray3318[var7];
          if (var15 >= 50) {
            if (var15 >= 100) {
              if (var15 < 150) {
                var32 = 16777215 - var15 * 327680 + 32768000;
              }
            } else {
              var32 = 0xff00 - (-(327685 * var15) + 16384250);
            }
          } else {
            var32 = 16777215 - 327685 * var15;
          }
        }

        if (GlobalStatics_10.anIntArray3336[var7] == 0) {
          GlobalStatics_8.aClass3_Sub28_Sub17_2096
              .draw(var33, DummyClass34.anInt590 + var2,
                  var0 + GlobalStatics_10.anInt2208, var32, 0);
        }

        if (GlobalStatics_10.anIntArray3336[var7] == 1) {
          GlobalStatics_8.aClass3_Sub28_Sub17_2096
              .method696(var33, var2 + DummyClass34.anInt590,
                  GlobalStatics_10.anInt2208 + var0, var32, 0,
                  GlobalStatics_6.anInt1127);
        }

        if (GlobalStatics_10.anIntArray3336[var7] == 2) {
          GlobalStatics_8.aClass3_Sub28_Sub17_2096
              .method695(var33, var2 + DummyClass34.anInt590,
                  var0 + GlobalStatics_10.anInt2208, var32, 0,
                  GlobalStatics_6.anInt1127);
        }

        if (GlobalStatics_10.anIntArray3336[var7] == 3) {
          GlobalStatics_8.aClass3_Sub28_Sub17_2096
              .method692(var33, var2 + DummyClass34.anInt590,
                  GlobalStatics_10.anInt2208 + var0, var32, 0,
                  GlobalStatics_6.anInt1127,
                  150 - GlobalStatics_10.anIntArray3318[var7]);
        }

        if (GlobalStatics_10.anIntArray3336[var7] == 4) {
          var15 = (-GlobalStatics_10.anIntArray3318[var7] + 150) * (
              GlobalStatics_8.aClass3_Sub28_Sub17_2096.method682(var33) + 100)
              / 150;
          if (GlRenderer.USE_OPENGL) {
            GlUtils.method931(DummyClass34.anInt590 + var2 - 50, var0,
                DummyClass34.anInt590 + var2 + 50, var4 + var0);
          } else {
            DummyClass47
                .method1326(-50 + var2 + DummyClass34.anInt590, var0,
                    50 + DummyClass34.anInt590 + var2, var4 + var0);
          }

          GlobalStatics_8.aClass3_Sub28_Sub17_2096.method681(var33,
              var2 - (-DummyClass34.anInt590 - 50) - var15,
              var0 + GlobalStatics_10.anInt2208, var32,
              0);
          if (GlRenderer.USE_OPENGL) {
            GlUtils.clip(var2, var0, var1 + var2, var4 + var0);
          } else {
            AbstractImageProducerStatics
                .method1324(var2, var0, var2 + var1, var0 + var4);
          }
        }

        if (GlobalStatics_10.anIntArray3336[var7] == 5) {
          int var16 = 0;
          var15 = -GlobalStatics_10.anIntArray3318[var7] + 150;
          if (GlRenderer.USE_OPENGL) {
            GlUtils.method931(var2,
                -1 - GlobalStatics_8.aClass3_Sub28_Sub17_2096.anInt3727
                    + GlobalStatics_10.anInt2208
                    + var0, var1 + var2, 5 + var0 + GlobalStatics_10.anInt2208);
          } else {
            DummyClass47.method1326(var2,
                -1 - GlobalStatics_8.aClass3_Sub28_Sub17_2096.anInt3727
                    + GlobalStatics_10.anInt2208
                    + var0, var2 + var1, 5 + GlobalStatics_10.anInt2208 + var0);
          }

          if (var15 < 25) {
            var16 = var15 - 25;
          } else if (var15 > 125) {
            var16 = var15 - 125;
          }

          GlobalStatics_8.aClass3_Sub28_Sub17_2096
              .draw(var33, DummyClass34.anInt590 + var2,
                  var16 + var0 + GlobalStatics_10.anInt2208, var32, 0);
          if (GlRenderer.USE_OPENGL) {
            GlUtils.clip(var2, var0, var2 + var1, var0 + var4);
          } else {
            AbstractImageProducerStatics
                .method1324(var2, var0, var2 + var1, var0 + var4);
          }
        }
      } else {
        GlobalStatics_8.aClass3_Sub28_Sub17_2096
            .draw(var33, var2 + DummyClass34.anInt590,
                var0 + GlobalStatics_10.anInt2208, 16776960, 0);
      }
    }
  }

  public static int method1406(byte var0) {
    int var1 = -21 % ((63 - var0) / 49);
    return MouseStatics.anInt4045;
  }

  public static void method1409(boolean var0) {
    GlobalStatics_9.aClass93_1146 = null;
    if (var0) {
      GameStringStatics.SETTINGS_EQ = null;
    }

    GameStringStatics.SETTINGS_EQ = null;
  }

  public static void method2019(boolean var0) {
    if (var0) {
      GlobalStatics_10.sprites = null;
    }
  }

  public static void method2020(int var0, GameObjectConfig var1, byte var2,
      int var3, int var4) {
    AreaSoundEffect var5 = (AreaSoundEffect) com.jagex.runescape.statics.GlobalStatics_0.aClass61_78
        .getFirst();
    if (var2 != -73) {
      GlobalStatics_9.method2019(true);
    }

    while (var5 != null) {
      if (var4 == var5.anInt2314 && var5.anInt2326 == 128 * var0
          && var5.anInt2308 == 128 * var3 && var1.anInt1527
          == var5.aClass111_2320.anInt1527) {
        if (var5.aClass3_Sub24_Sub1_2312 != null) {
          GlobalStatics_9.aClass3_Sub24_Sub2_2563.method461(
              var5.aClass3_Sub24_Sub1_2312);
          var5.aClass3_Sub24_Sub1_2312 = null;
        }

        if (var5.aClass3_Sub24_Sub1_2315 != null) {
          GlobalStatics_9.aClass3_Sub24_Sub2_2563.method461(
              var5.aClass3_Sub24_Sub1_2315);
          var5.aClass3_Sub24_Sub1_2315 = null;
        }

        var5.unlinkNode();
        return;
      }

      var5 = (AreaSoundEffect) com.jagex.runescape.statics.GlobalStatics_0.aClass61_78
          .getNext();
    }
  }

  public static boolean isPo2(byte var0, int var1) {
    if (var0 > -63) {
      GlobalStatics_9.anInt2905 = 66;
    }

    return var1 == (-var1 & var1);
  }

  public static void method2025(byte var0, int var1) {
    if (var0 <= -25) {
      GlobalStatics_9.aClass93_4043.method1522(-128, var1);
      GlobalStatics_7.aClass93_2442.method1522(-126, var1);
      DummyClass14.aClass93_1964.method1522(-127, var1);
    }
  }

  public static void method2026(byte var0, int var1, int var2, int var3) {
    if (var0 > 114) {
      WidgetUpdate var4 = GlobalStatics_6.method466(4, 9, var1);
      var4.g((byte) 33);
      var4.anInt3598 = var3;
      var4.anInt3597 = var2;
    }
  }

  public static AbstractDirectColorSprite[] method2027(int var0, byte var1,
      int var2,
      FileUnpacker var3) {
    return GlobalStatics_9.loadSprites(var3, var0, var2, -30901) ? var1 == 11
        ? GlobalStatics_9.method1347(-26802) : null : null;
  }

  public static void clear46(byte var0) {
    int var1 = -102 / ((var0 - 35) / 48);
    GlobalStatics_9.globalQuickchats = null;
    GameStringStatics.aClass94_334 = null;
  }

  public static AbstractFont createFont(int var0, byte[] var1) {
    if (var1 != null) {
      if (var0 == -22376) {
        AbstractFont var2;
        if (GlRenderer.USE_OPENGL) {
          var2 = new GlFont(var1, GlobalStatics_9.anIntArray2048,
              com.jagex.runescape.statics.GlobalStatics_0.anIntArray2591,
              GlobalStatics_9.anIntArray2931, GlobalStatics_10.anIntArray3076,
              DummyClass5.aByteArrayArray2987);
        } else {
          var2 = new SoftwareFont(var1, GlobalStatics_9.anIntArray2048,
              com.jagex.runescape.statics.GlobalStatics_0.anIntArray2591,
              GlobalStatics_9.anIntArray2931, GlobalStatics_10.anIntArray3076,
              DummyClass5.aByteArrayArray2987);
        }

        DummyClass37.method1035((byte) 106);
        return var2;
      } else {
        return null;
      }
    } else {
      return null;
    }
  }

  public static void method881(int var0, int var1, int var2, int var3, int var4,
      int var5, int var6,
      int var7, int var8, int var9) {
    if (var2 <= -65) {
      SpawnedGameObject var10 = null;

      for (SpawnedGameObject var11 =
          (SpawnedGameObject) GlobalStatics_10.aClass61_3075.getFirst();
          var11 != null;
          var11 = (SpawnedGameObject) GlobalStatics_10.aClass61_3075
              .getNext()) {
        if (var11.anInt2250 == var0 && var4 == var11.anInt2264
            && var11.anInt2248 == var1
            && var7 == var11.anInt2263) {
          var10 = var11;
          break;
        }
      }

      if (var10 == null) {
        var10 = new SpawnedGameObject();
        var10.anInt2264 = var4;
        var10.anInt2248 = var1;
        var10.anInt2250 = var0;
        var10.anInt2263 = var7;
        DummyClass22.method1798(72, var10);
        GlobalStatics_10.aClass61_3075.addLast(var10);
      }

      var10.anInt2262 = var8;
      var10.anInt2261 = var9;
      var10.aliveTime = var5;
      var10.anInt2265 = var6;
      var10.anInt2256 = var3;
    }
  }

  public static void method882(int var0, int var1) {
    GlobalStatics_10.anInt3423 = 0;
    DummyClass22.anInt1741 = -1;
    GlobalStatics_9.anInt154 = 1;
    GlobalStatics_9.anInt546 = var1;
    GlobalStatics_6.aBoolean2311 = false;
    DummyClass55.aClass153_1423 = null;
    GlobalStatics_9.anInt3463 = var0;
  }

  public static SomethingWorldMapy method884(int var0, byte var1, int var2) {
    Deque deque = DummyClass21.aClass61_1758;
    SomethingWorldMapy var3 = (SomethingWorldMapy) deque
        .getFirst();

    for (; var3 != null; var3 = (SomethingWorldMapy) deque.getNext()) {
      if (var3.aBoolean3553 && var3.method537(var2, (byte) 97, var0)) {
        return var3;
      }
    }

    return null;
  }

  public static void method896(boolean var0) {
    GameStringStatics.aClass94_388 = null;
    GameStringStatics.aClass94_374 = null;
    GameStringStatics.aClass94_392 = null;
    GameStringStatics.aClass94_385 = null;
    GameStringStatics.aClass94_355 = null;
    GameStringStatics.aClass94_376 = null;
    GameStringStatics.aClass94_397 = null;
    GlobalStatics_9.anIntArray356 = null;
    GameStringStatics.aClass94_366 = null;
    GameStringStatics.aClass94Array358 = null;
    GameStringStatics.aClass94_378 = null;
    GameStringStatics.aClass94_354 = null;
    GameStringStatics.aClass94_365 = null;
    GameStringStatics.aClass94_394 = null;
    if (!var0) {
      GlobalStatics_9.method898((byte) 20, -109);
    }

    GameStringStatics.aClass94_361 = null;
    GameStringStatics.aClass94_391 = null;
    GameStringStatics.aClass94_401 = null;
    GameStringStatics.aClass94_405 = null;
    GameStringStatics.aClass94_363 = null;
    GlobalStatics_9.aByteArrayArrayArray383 = null;
    GameStringStatics.aClass94_404 = null;
  }

  public static boolean method897(int var0, AudioStreamEncoder4 var1,
      FileUnpacker var2,
      FileUnpacker midiInstruments, FileUnpacker soundEffects) {
    DummyClass23.aClass153_1661 = var2;
    if (var0 != 17770) {
      GameStringStatics.aClass94_366 = null;
    }

    DummyClass59.soundEffects = soundEffects;
    Texture.midiInstruments = midiInstruments;
    DummyClass55.aClass3_Sub24_Sub4_1421 = var1;
    return true;
  }

  public static SpotAnimationConfig method898(byte var0, int var1) {
    SpotAnimationConfig var2 =
        (SpotAnimationConfig) GlobalStatics_9.aClass93_2604.get(var1);
    if (var2 != null) {
      return var2;
    } else {
      byte[] var3 =
          GlobalStatics_10.spotAnimations.getBytes(
              GlobalStatics_2.method64(true, var1),
              GlobalStatics_3.method1338(var1, var0 ^ 7));
      var2 = new SpotAnimationConfig();
      var2.anInt539 = var1;
      if (var0 != 42) {
        GlobalStatics_9.method898((byte) -83, -12);
      }

      if (var3 != null) {
        var2.method963(new Buffer(var3), (byte) -113);
      }

      GlobalStatics_9.aClass93_2604.get((byte) -109, var2, var1);
      return var2;
    }
  }

  public static void method900(Mobile var0, int var1) {
    var0.aBoolean2810 = false;
    AnimationSequence var2;
    if (var0.anInt2764 != -1) {
      var2 = GlobalStatics_8.method45(var0.anInt2764, (byte) -20);
      if (var2.anIntArray1851 != null) {
        ++var0.anInt2802;
        if (var2.anIntArray1851.length > var0.anInt2813
            && var0.anInt2802 > var2.anIntArray1869[var0.anInt2813]) {
          var0.anInt2802 = 1;
          ++var0.anInt2813;
          ++var0.anInt2793;
          GlobalStatics_4
              .method1470(var0.sceneY, var2, 183921384, var0.sceneX,
                  var0 == GlobalStatics_9.localPlayer, var0.anInt2813);
        }

        if (var0.anInt2813 >= var2.anIntArray1851.length) {
          var0.anInt2813 = 0;
          var0.anInt2802 = 0;
          GlobalStatics_4
              .method1470(var0.sceneY, var2, 183921384, var0.sceneX,
                  GlobalStatics_9.localPlayer == var0, var0.anInt2813);
        }

        var0.anInt2793 = var0.anInt2813 + 1;
        if (var0.anInt2793 >= var2.anIntArray1851.length) {
          var0.anInt2793 = 0;
        }
      } else {
        var0.anInt2764 = -1;
      }
    }

    int var6;
    if (var0.anInt2842 != -1 && GlobalStatics_4.updateCycle
        >= var0.anInt2759) {
      var6 = GlobalStatics_9.method898((byte) 42, var0.anInt2842).anInt542;
      if (var6 == -1) {
        var0.anInt2842 = -1;
      } else {
        AnimationSequence var3 = GlobalStatics_8.method45(var6, (byte) -20);
        if (var3.anIntArray1851 != null) {
          if (var0.anInt2805 < 0) {
            var0.anInt2805 = 0;
            GlobalStatics_4
                .method1470(var0.sceneY, var3, 183921384, var0.sceneX,
                    GlobalStatics_9.localPlayer == var0, 0);
          }

          ++var0.anInt2761;
          if (var0.anInt2805 < var3.anIntArray1851.length
              && var3.anIntArray1869[var0.anInt2805] < var0.anInt2761) {
            ++var0.anInt2805;
            var0.anInt2761 = 1;
            GlobalStatics_4.method1470(var0.sceneY, var3, var1 ^ -183911469,
                var0.sceneX,
                GlobalStatics_9.localPlayer == var0, var0.anInt2805);
          }

          if (var0.anInt2805 >= var3.anIntArray1851.length) {
            var0.anInt2842 = -1;
          }

          var0.anInt2826 = var0.anInt2805 + 1;
          if (var3.anIntArray1851.length <= var0.anInt2826) {
            var0.anInt2826 = -1;
          }
        } else {
          var0.anInt2842 = -1;
        }
      }
    }

    if (var0.animationId != -1 && var0.anInt2828 <= 1) {
      var2 = GlobalStatics_8.method45(var0.animationId, (byte) -20);
      if (var2.anInt1866 == 1 && var0.anInt2811 > 0
          && GlobalStatics_4.updateCycle >= var0.anInt2800
          && GlobalStatics_4.updateCycle > var0.anInt2790) {
        var0.anInt2828 = 1;
        return;
      }
    }

    if (var1 == -11973) {
      if (var0.animationId != -1 && var0.anInt2828 == 0) {
        var2 = GlobalStatics_8.method45(var0.animationId, (byte) -20);
        if (var2.anIntArray1851 != null) {
          ++var0.anInt2760;
          if (var0.anInt2832 < var2.anIntArray1851.length
              && var0.anInt2760 > var2.anIntArray1869[var0.anInt2832]) {
            var0.anInt2760 = 1;
            ++var0.anInt2832;
            GlobalStatics_4
                .method1470(var0.sceneY, var2, 183921384, var0.sceneX,
                    var0 == GlobalStatics_9.localPlayer, var0.anInt2832);
          }

          if (var2.anIntArray1851.length <= var0.anInt2832) {
            var0.anInt2832 -= var2.anInt1865;
            ++var0.anInt2773;
            if (var0.anInt2773 < var2.anInt1861) {
              if (var0.anInt2832 >= 0
                  && var2.anIntArray1851.length > var0.anInt2832) {
                GlobalStatics_4
                    .method1470(var0.sceneY, var2, 183921384, var0.sceneX,
                        GlobalStatics_9.localPlayer == var0, var0.anInt2832);
              } else {
                var0.animationId = -1;
              }
            } else {
              var0.animationId = -1;
            }
          }

          var0.anInt2776 = var0.anInt2832 + 1;
          if (var0.anInt2776 >= var2.anIntArray1851.length) {
            var0.anInt2776 -= var2.anInt1865;
            if (var2.anInt1861 > var0.anInt2773 + 1) {
              if (var0.anInt2776 < 0
                  || var0.anInt2776 >= var2.anIntArray1851.length) {
                var0.anInt2776 = -1;
              }
            } else {
              var0.anInt2776 = -1;
            }
          }

          var0.aBoolean2810 = var2.aBoolean1859;
        } else {
          var0.animationId = -1;
        }
      }

      if (var0.anInt2828 > 0) {
        --var0.anInt2828;
      }

      for (var6 = 0; var0.aClass145Array2809.length > var6; ++var6) {
        Unsure var7 = var0.aClass145Array2809[var6];
        if (var7 != null) {
          if (var7.anInt1900 <= 0) {
            AnimationSequence var4 = GlobalStatics_8
                .method45(var7.anInt1890, (byte) -20);
            if (var4.anIntArray1851 != null) {
              ++var7.anInt1897;
              if (var7.anInt1893 < var4.anIntArray1851.length
                  && var7.anInt1897 > var4.anIntArray1869[var7.anInt1893]) {
                ++var7.anInt1893;
                var7.anInt1897 = 1;
                GlobalStatics_4
                    .method1470(var0.sceneY, var4, 183921384, var0.sceneX,
                        var0 == GlobalStatics_9.localPlayer, var7.anInt1893);
              }

              if (var4.anIntArray1851.length <= var7.anInt1893) {
                ++var7.anInt1894;
                var7.anInt1893 -= var4.anInt1865;
                if (var4.anInt1861 > var7.anInt1894) {
                  if (var7.anInt1893 >= 0 && var7.anInt1893
                      < var4.anIntArray1851.length) {
                    GlobalStatics_4
                        .method1470(var0.sceneY, var4, 183921384,
                            var0.sceneX,
                            GlobalStatics_9.localPlayer == var0,
                            var7.anInt1893);
                  } else {
                    var0.aClass145Array2809[var6] = null;
                  }
                } else {
                  var0.aClass145Array2809[var6] = null;
                }
              }

              var7.anInt1891 = 1 + var7.anInt1893;
              if (var4.anIntArray1851.length <= var7.anInt1891) {
                var7.anInt1891 -= var4.anInt1865;
                if (1 + var7.anInt1894 < var4.anInt1861) {
                  if (var7.anInt1891 < 0
                      || var4.anIntArray1851.length <= var7.anInt1891) {
                    var7.anInt1891 = -1;
                  }
                } else {
                  var7.anInt1891 = -1;
                }
              }
            } else {
              var0.aClass145Array2809[var6] = null;
            }
          } else {
            --var7.anInt1900;
          }
        }
      }

    }
  }

  public static GameString concat(GameString[] var0) {
    if (var0.length >= 2) {

      return GlobalStatics_9.method1261(0, var0.length, var0, 2774);
    } else {
      throw new IllegalArgumentException();
    }
  }

  public static void method1859(double var0, int var2) {
    if (GlobalStatics_9.aDouble1050 != var0) {
      for (int var3 = 0; var3 < 256; ++var3) {
        int var4 = (int) (255.0D * Math.pow(var3 / 255.0D, var0));
        GlobalStatics_8.anIntArray3804[var3] = var4 > 255 ? 255 : var4;
      }

      GlobalStatics_9.aDouble1050 = var0;
    }

    if (var2 != 32258) {
      GlobalStatics_9.aBoolean1837 = false;
    }
  }

  public static void method1860(int var0) {
    GlobalStatics_9.aClass109Array1831 = null;
    GlobalStatics_9.aClass11Array1836 = null;
    GlobalStatics_9.aClass11ArrayArray1834 = null;
    if (var0 != 0) {
      GlobalStatics_9.method1860(-87);
    }

    GlobalStatics_9.aClass3_Sub28_Sub16_Sub2Array1839 = null;
    GlobalStatics_9.anIntArray1835 = null;
    GameStringStatics.COMMAND_SET_PARTICLES = null;
    GlobalStatics_9.anIntArray1833 = null;
    GlobalStatics_9.anIntArray1838 = null;
  }

  public static void setWindowMode(
      boolean replaceCanvas,
      int windowMode,
      int var3,
      int var4
  ) {
    DummyClass41.aLong866 = 0L;
    int currentWindowMode = GlobalStatics_9.getWindowMode();
    if (windowMode == 3 || currentWindowMode == 3) {
      replaceCanvas = true;
    }

    if (GlobalStatics_9.formattedOsName.startsWith("mac") && windowMode > 0) {
      replaceCanvas = true;
    }

    boolean var6 = false;
    if (currentWindowMode > 0 != windowMode > 0) {
      var6 = true;
    }

    if (replaceCanvas && windowMode > 0) {
      var6 = true;
    }

    GlobalStatics_9
        .setWindowMode(replaceCanvas, windowMode, var6, currentWindowMode,
            false,
            var3, var4);
  }

  public static int method1863(int var0, int var1, byte var2, int var3,
      int var4, int var5,
      int var6) {
    int var7;
    if ((1 & var5) == 1) {
      var7 = var0;
      var0 = var3;
      var3 = var7;
    }

    var7 = 121 % ((var2 - 75) / 50);
    var1 &= 3;
    return var1 == 0 ?
        var6 :
        var1 == 1 ? -var4 + 7 - var0 + 1
            : var1 == 2 ? -var3 + 1 - var6 + 7 : var4;
  }

  public static void method1864(boolean var0, byte var1, FileUnpacker var2,
      SoftwareFont var3,
      FileUnpacker var4) {
    DummyClass17.aBoolean1827 = var0;
    com.jagex.runescape.statics.GlobalStatics_0.aClass153_2581 = var4;
    int var6 = -127 / ((var1 + 87) / 32);
    GlobalStatics_10.aClass153_1370 = var2;
    int var5 = GlobalStatics_10.aClass153_1370.method2121(0) - 1;
    GlobalStatics_10.anInt3287 =
        GlobalStatics_10.aClass153_1370.getAmountChildren(var5, (byte) 101)
            + var5 * 256;
    GlobalStatics_8.DEFAULT_INVENTORY_OPTIONS =
        new GameString[]{null, null, null, null, GlobalStatics_8.OPTION_DROP};
    com.jagex.runescape.statics.GlobalStatics_0.aClass94Array2596 =
        new GameString[]{null, null, GameStringStatics.aClass94_3397, null,
            null};
    GlobalStatics_9.aClass3_Sub28_Sub17_Sub1_3440 = var3;
  }

  public static void method1869(byte var0, int var1, int var2, int var3,
      int var4, int var5) {
    int var6 = var2 - var3;
    int var7 = var4 - var5;
    if (var7 == 0) {
      if (var6 != 0) {
        GlobalStatics_10.method244(2, var3, var5, var2, var1);
      }

    } else if (var6 != 0) {
      if (var6 < 0) {
        var6 = -var6;
      }

      if (var7 < 0) {
        var7 = -var7;
      }

      int var8 = -102 / ((-53 - var0) / 38);
      boolean var9 = var7 < var6;
      int var10;
      int var11;
      if (var9) {
        var10 = var5;
        var5 = var3;
        var11 = var4;
        var3 = var10;
        var4 = var2;
        var2 = var11;
      }

      if (var4 < var5) {
        var10 = var5;
        var5 = var4;
        var4 = var10;
        var11 = var3;
        var3 = var2;
        var2 = var11;
      }

      var10 = var3;
      var11 = var4 - var5;
      int var12 = var2 - var3;
      int var13 = -(var11 >> 1);
      int var14 = var2 <= var3 ? -1 : 1;
      if (var12 < 0) {
        var12 = -var12;
      }

      int var15;
      if (var9) {
        for (var15 = var5; var4 >= var15; ++var15) {
          DummyClass35.anIntArrayArray663[var15][var10] = var1;
          var13 += var12;
          if (var13 > 0) {
            var10 += var14;
            var13 -= var11;
          }
        }
      } else {
        for (var15 = var5; var15 <= var4; ++var15) {
          var13 += var12;
          DummyClass35.anIntArrayArray663[var10][var15] = var1;
          if (var13 > 0) {
            var10 += var14;
            var13 -= var11;
          }
        }
      }

    } else {
      GlobalStatics_10.method320(var1, var3, var4, (byte) -107, var5);
    }
  }

  public static void method1870(boolean var0) {
    DummyClass55.aClass3_Sub24_Sub4_1421.method505((byte) -128);
    GlobalStatics_9.anInt154 = 1;
    if (!var0) {
      DummyClass55.aClass153_1423 = null;
    }
  }

  public static void method1814(int var0, int var1, int var2, int var3,
      int var4, int var5, int var6,
      int var7, int var8, int var9, int var10) {
    int var11 = var2 - var4;
    int var13 = -1;
    if (GlobalStatics_2.anInt3704 > 0) {
      if (GlobalStatics_6.anInt3611 <= 10) {
        var13 = 5 * GlobalStatics_6.anInt3611;
      } else {
        var13 = -((-10 + GlobalStatics_6.anInt3611) * 5) + 50;
      }
    }

    int var12 = -var9 + var1;
    int var15 = 983040 / var8;
    int var16 = 983040 / var3;

    for (int var17 = -var15; var17 < var11 + var15; ++var17) {
      int var18 = var5 + var17 * var8 >> 16;
      int var19 = var8 * (var17 + 1) + var5 >> 16;
      int var20 = -var18 + var19;
      if (var20 > 0) {
        int var21 = var4 + var17 >> 6;
        var18 += var0;
        int var10000 = var19 + var0;
        if (var21 >= 0
            && var21 <= -1 + GlobalStatics_4.anIntArrayArrayArray720.length) {
          int[][] var22 = GlobalStatics_4.anIntArrayArrayArray720[var21];

          for (int var23 = -var16; var23 < var12 + var16; ++var23) {
            int var25 = var6 + var3 * (var23 + 1) >> 16;
            int var24 = var23 * var3 + var6 >> 16;
            int var26 = var25 - var24;
            if (var26 > 0) {
              var24 += var10;
              int var27 = var9 + var23 >> 6;
              var10000 = var25 + var10;
              if (var27 >= 0 && var27 <= -1 + var22.length &&
                  var22[var27] != null) {
                int var28 = (63 & var17 + var4) + (4032 & var9 + var23 << 6);
                int var29 = var22[var27][var28];
                if (var29 != 0) {
                  GameObjectConfig var14 = DummyClass11
                      .method2207(4, -1 + var29);
                  if (!GlobalStatics_6.aBooleanArray3503[var14.anInt1482]) {
                    if (var13 != -1 && var14.anInt1482
                        == GlobalStatics_10.anInt101) {
                      SomethingOtherWorldMap var30 = new SomethingOtherWorldMap();
                      var30.anInt2531 = var18;
                      var30.anInt2539 = var24;
                      var30.anInt2532 = var14.anInt1482;
                      DummyClass55.aClass61_1424.addLast(var30);
                    } else {
                      GlobalStatics_9.aClass3_Sub28_Sub16_Sub2Array1839[var14.anInt1482]
                          .method643(
                              var18 - 7, -7 + var24);
                    }
                  }
                }
              }
            }
          }
        }
      }
    }

    if (var7 >= 124) {
      for (SomethingOtherWorldMap var32 =
          (SomethingOtherWorldMap) DummyClass55.aClass61_1424.getFirst();
          var32 != null;
          var32 = (SomethingOtherWorldMap) DummyClass55.aClass61_1424
              .getNext()) {
        DummyClass47
            .method1330(var32.anInt2531, var32.anInt2539, 15, 16776960, var13);
        DummyClass47
            .method1330(var32.anInt2531, var32.anInt2539, 13, 16776960, var13);
        DummyClass47
            .method1330(var32.anInt2531, var32.anInt2539, 11, 16776960, var13);
        DummyClass47
            .method1330(var32.anInt2531, var32.anInt2539, 9, 16776960, var13);
        GlobalStatics_9.aClass3_Sub28_Sub16_Sub2Array1839[var32.anInt2532]
            .method643(
                -7 + var32.anInt2531, -7 + var32.anInt2539);
      }

      DummyClass55.aClass61_1424.clear(-76);
    }
  }

  public static void clear68(byte var0) {
    GlobalStatics_9.aShortArray1779 = null;
    GlobalStatics_9.aClass93_1772 = null;
    GlobalStatics_9.aClass64_1778 = null;
    if (var0 > -33) {
      GlobalStatics_9.method1816(-10, 68);
    }

    GameStringStatics.CONNECTION_LOST = null;
    GlobalStatics_9.aByteArrayArrayArray1774 = null;
    GameStringStatics.aClass94_1775 = null;
  }

  public static void method1816(int var0, int var1) {
    if (var1 == -7) {
      GlobalStatics_9.anIntArray2696 = new int[var0];
      DummyClass13.anIntArray2021 = new int[var0];
      GlobalStatics_3.anIntArray1871 = new int[var0];
      GlobalStatics_9.anIntArray3959 = new int[var0];
      GlobalStatics_7.anIntArray686 = new int[var0];
    }
  }

  public static void method1284(byte var0) {
    if (var0 != -87) {
      GameStringStatics.aClass94Array1046 = null;
    }

    GlobalStatics_9.fileUnpacker21 = null;
    GameStringStatics.aClass94_1051 = null;
    GameStringStatics.aClass94Array1046 = null;
    GlobalStatics_9.aClass10_1056 = null;
  }

  public static void method1285(FileUnpacker var0, boolean var1, int var2,
      int var3, boolean var4,
      int var5) {
    DummyClass55.aClass153_1423 = var0;
    GlobalStatics_9.anInt154 = 1;
    GlobalStatics_10.anInt3423 = var5;
    DummyClass22.anInt1741 = var3;
    GlobalStatics_9.anInt3463 = var2;
    GlobalStatics_6.aBoolean2311 = var4;
    if (var1) {
      GlobalStatics_9.anInt1053 = 125;
    }

    GlobalStatics_9.anInt546 = 10000;
  }

  public static void method1286(int var0, boolean var1, GameObjectConfig var2,
      int var3, NPC var4,
      int var5, int var6, Player var7) {
    if (var1) {
      GlobalStatics_9.windowHeight = 94;
    }

    AreaSoundEffect var8 = new AreaSoundEffect();
    var8.anInt2308 = var0 * 128;
    var8.anInt2326 = 128 * var5;
    var8.anInt2314 = var6;
    if (var2 != null) {
      var8.anIntArray2333 = var2.anIntArray1539;
      var8.anInt2328 = var2.anInt1484 * 128;
      var8.anInt2325 = var2.anInt1515;
      var8.aClass111_2320 = var2;
      var8.anInt2332 = var2.anInt1512;
      var8.anInt2310 = var2.anInt1518;
      int var9 = var2.anInt1480;
      int var10 = var2.anInt1485;
      if (var3 == 1 || var3 == 3) {
        var9 = var2.anInt1485;
        var10 = var2.anInt1480;
      }

      var8.anInt2307 = (var10 + var0) * 128;
      var8.anInt2321 = (var5 + var9) * 128;
      if (var2.anIntArray1524 != null) {
        var8.aBoolean2329 = true;
        var8.method134(1);
      }

      if (var8.anIntArray2333 != null) {
        var8.anInt2316 =
            var8.anInt2310 + (int) (Math.random() * (-var8.anInt2310
                + var8.anInt2325));
      }

      com.jagex.runescape.statics.GlobalStatics_0.aClass61_78.addLast(var8);
    } else if (var4 != null) {
      var8.aClass140_Sub4_Sub2_2324 = var4;
      NpcConfiguration var12 = var4.config;
      if (var12.anIntArray1292 != null) {
        var8.aBoolean2329 = true;
        var12 = var12.method1471((byte) -112);
      }

      if (var12 != null) {
        var8.anInt2307 = 128 * (var12.size + var0);
        var8.anInt2321 = 128 * (var5 + var12.size);
        var8.anInt2332 = GlobalStatics_9.method1232(var4, -1);
        var8.anInt2328 = 128 * var12.anInt1291;
      }

      GlobalStatics_4.aClass61_1242.addLast(var8);
    } else if (var7 != null) {
      var8.aClass140_Sub4_Sub1_2327 = var7;
      var8.anInt2321 = (var7.getSize() + var5) * 128;
      var8.anInt2307 = 128 * (var7.getSize() + var0);
      var8.anInt2332 = DummyClass50.method1398(0, var7);
      var8.anInt2328 = 128 * var7.anInt3969;
      GlobalStatics_9.aClass130_4046.put(var7.name.toBase37(), var8);
    }
  }

  public static SoftwareFont method1287(int var0, int var1, FileUnpacker var2,
      FileUnpacker var3,
      int var4) {
    if (GlobalStatics_9.loadSprites(var3, var1, var0, var4 ^ 30900)) {
      if (var4 != -1) {
        GlobalStatics_9.method1284((byte) -124);
      }

      return GlobalStatics_3.method163(var2.getBytes(var0, var1), 25208);
    } else {
      return null;
    }
  }

  public static void method1175(int var0, int var1) {
    GlobalStatics_9.anInt3362 = -1;
    GlobalStatics_9.anInt1150 = -1;
    if (var1 <= 55) {
      GlobalStatics_9
          .method1177(-67, 28L, (byte) 76, null, -45, (short) 94, null, -125);
    }

    GlobalStatics_9.anInt3536 = var0;
    GlobalStatics_9.method117((byte) 87);
  }

  public static boolean method1176(GameString var0, byte var1) {
    if (var0 != null) {
      for (int var2 = 0; GlobalStatics_10.anInt104 > var2; ++var2) {
        if (var0.method1531(GameStringStatics.aClass94Array1046[var2])) {
          return true;
        }
      }

      if (var1 != -82) {
        GameStringStatics.HINT_HEAD_ICONS = null;
      }

      return var0.method1531(GlobalStatics_9.localPlayer.name);
    } else {
      return false;
    }
  }

  public static void method1177(int var0, long var1, byte var3, GameString var4,
      int var5,
      short var6, GameString var7, int var8) {
    if (var3 > -23) {
      GlobalStatics_9
          .method1177(-45, 37L, (byte) -37, null, -16, (short) 110, null, -75);
    }

    if (!DummyClass36.aBoolean2615) {
      if (GlobalStatics_10.amountContextActions < 500) {
        GameStringStatics.aClass94Array2935[GlobalStatics_10.amountContextActions] = var7;
        DummyClass8.aClass94Array4016[GlobalStatics_10.amountContextActions] = var4;
        GlobalStatics_9.anIntArray1578[GlobalStatics_10.amountContextActions] =
            var0 == -1 ? GlobalStatics_6.anInt3590 : var0;
        GlobalStatics_10.aShortArray3095[GlobalStatics_10.amountContextActions] = var6;
        GlobalStatics_9.aLongArray3271[GlobalStatics_10.amountContextActions] = var1;
        DummyClass26.anIntArray1613[GlobalStatics_10.amountContextActions] = var5;
        DummyClass32.anIntArray512[GlobalStatics_10.amountContextActions] = var8;
        ++GlobalStatics_10.amountContextActions;
      }

    }
  }

  public static void method1178(byte var0) {
    int var1 = 103 / ((var0 + 13) / 52);
    GameStringStatics.aClass94_875 = null;
    GameStringStatics.HINT_HEAD_ICONS = null;
    GlobalStatics_9.configs = null;
  }

  public static FileOnDisk openGamePreferences(boolean var0, String var1) {
    if (var0) {
      GlobalStatics_9.openGamePreferences(true, null);
    }

    String[] var2 = {
        "c:/rscache/", "/rscache/", GlobalStatics_9.aString1209, "c:/windows/",
        "c:/winnt/", "c:/", "/tmp/", ""
    };

    for (String var4 : var2) {
      if (var4.length() <= 0 || new File(var4).exists()) {
        try {
          FileOnDisk var5 =
              new FileOnDisk(
                  new File(var4, "jagex_" + var1 + "_preferences.dat"), "rw",
                  10000L);
          return var5;
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }

    return null;
  }

  public static File openFile(String parent, boolean dontOpenGamePreferences,
      String name) {
    File cached = (File) GlobalStatics_9.CACHED_FILES.get(name);
    if (cached != null) {
      return cached;
    } else {
      if (!dontOpenGamePreferences) {
        GlobalStatics_9.openGamePreferences(true, null);
      }

      File cacheHome = new File(
          String.join(
              File.separator,
              System.getProperty("user.home"),
              "DMM",
              ".cache"
          )
      );

      GlobalStatics_9.ensureDirectoryCreated(cacheHome);

      File parentFile = new File(cacheHome + File.separator + parent);
      GlobalStatics_9.ensureDirectoryCreated(parentFile);

      File file =
          new File(parentFile.getAbsolutePath() + File.separator + name);
      GlobalStatics_9.ensureFileCreated(file);

      try (RandomAccessFile rwFile = new RandomAccessFile(file, "rw")) {
        int firstByte = rwFile.read();
        rwFile.seek(0L);
        rwFile.write(firstByte);
        rwFile.seek(0L);
        rwFile.close();
        GlobalStatics_9.CACHED_FILES.put(name, rwFile);
      } catch (IOException e) {
        throw new IllegalStateException(e);
      }
      return file;
    }
  }

  public static void ensureFileCreated(File file) {
    if (!file.exists()) {
      try {
        boolean fileNotCreated = !file.createNewFile();
        if (fileNotCreated) {
          throw new IllegalStateException(
              String.format(
                  "Couldn't create file at %s",
                  file.getAbsolutePath()
              )
          );
        }
      } catch (IOException exception) {
        throw new IllegalStateException(
            String.format("File = [%s]", file.getAbsolutePath()),
            exception
        );
      }
    }
  }

  public static void ensureDirectoryCreated(File cacheHome) {
    if (!cacheHome.exists()) {
      boolean homeNotCreated = !cacheHome.mkdirs();
      if (homeNotCreated) {
        throw new IllegalStateException(
            String.format(
                "Couldn't create home at %s",
                cacheHome.getAbsolutePath())
        );
      }
    }
  }

  public static void method2238(int var0, int var1, int var2, int var3,
      byte var4, int var5) {
    GlobalStatics_3.anInt1105 = var2;
    GlobalStatics_9.anInt1996 = var1;
    DummyClass8.anInt4014 = var5;
    GlobalStatics_9.anInt1923 = var3;
    GlobalStatics_9.anInt529 = var0;
    if (var4 != -21) {
      GameStringStatics.ZERO = null;
    }

    if (DummyClass8.anInt4014 >= 100) {
      int var6 = 64 + 128 * GlobalStatics_9.anInt1923;
      int var7 = 64 + GlobalStatics_9.anInt1996 * 128;
      int var8 = GlobalStatics_6
          .method1736(GlobalStatics_9.currentPlane, 1, var6, var7)
          - GlobalStatics_9.anInt529;
      int var10 = var8 - CameraStatics.CURRENT_Y;
      int var9 = var6 - CameraStatics.CURRENT_X;
      int var11 = -CameraStatics.CURRENT_Z + var7;
      int var12 = (int) Math.sqrt(var11 * var11 + var9 * var9);
      CameraStatics.CURRENT_PITCH =
          2047 & (int) (Math.atan2(var10, var12) * 325.949D);
      CameraStatics.CURRENT_YAW =
          2047 & (int) (Math.atan2(var9, var11) * -325.949);
      if (CameraStatics.CURRENT_PITCH < 128) {
        CameraStatics.CURRENT_PITCH = 128;
      }

      if (CameraStatics.CURRENT_PITCH > 383) {
        CameraStatics.CURRENT_PITCH = 383;
      }
    }

    GlobalStatics_9.anInt1753 = 2;
  }

  public static boolean method2239(int var0, int var1, int var2, int var3) {
    if (GlobalStatics_10.method846(var0, var1, var2)) {
      int var4 = var1 << 7;
      int var5 = var2 << 7;
      int var6 = GlobalStatics_4.heightMap[var0][var1][var2] - 1;
      int var7 = var6 - 120;
      int var8 = var6 - 230;
      int var9 = var6 - 238;
      if (var3 < 16) {
        if (var3 == 1) {
          if (var4 > GlobalStatics_9.CAMERA_X) {
            if (!GlobalStatics_9.method349(var4, var6, var5)) {
              return false;
            }

            if (!GlobalStatics_9.method349(var4, var6, var5 + 128)) {
              return false;
            }
          }

          if (var0 > 0) {
            if (!GlobalStatics_9.method349(var4, var7, var5)) {
              return false;
            }

            if (!GlobalStatics_9.method349(var4, var7, var5 + 128)) {
              return false;
            }
          }

          if (!GlobalStatics_9.method349(var4, var8, var5)) {
            return false;
          }

          return GlobalStatics_9.method349(var4, var8, var5 + 128);

        }

        if (var3 == 2) {
          if (var5 < GlobalStatics_9.CAMERA_Z) {
            if (!GlobalStatics_9.method349(var4, var6, var5 + 128)) {
              return false;
            }

            if (!GlobalStatics_9.method349(var4 + 128, var6, var5 + 128)) {
              return false;
            }
          }

          if (var0 > 0) {
            if (!GlobalStatics_9.method349(var4, var7, var5 + 128)) {
              return false;
            }

            if (!GlobalStatics_9.method349(var4 + 128, var7, var5 + 128)) {
              return false;
            }
          }

          if (!GlobalStatics_9.method349(var4, var8, var5 + 128)) {
            return false;
          }

          return GlobalStatics_9.method349(var4 + 128, var8, var5 + 128);

        }

        if (var3 == 4) {
          if (var4 < GlobalStatics_9.CAMERA_X) {
            if (!GlobalStatics_9.method349(var4 + 128, var6, var5)) {
              return false;
            }

            if (!GlobalStatics_9.method349(var4 + 128, var6, var5 + 128)) {
              return false;
            }
          }

          if (var0 > 0) {
            if (!GlobalStatics_9.method349(var4 + 128, var7, var5)) {
              return false;
            }

            if (!GlobalStatics_9.method349(var4 + 128, var7, var5 + 128)) {
              return false;
            }
          }

          if (!GlobalStatics_9.method349(var4 + 128, var8, var5)) {
            return false;
          }

          return GlobalStatics_9.method349(var4 + 128, var8, var5 + 128);

        }

        if (var3 == 8) {
          if (var5 > GlobalStatics_9.CAMERA_Z) {
            if (!GlobalStatics_9.method349(var4, var6, var5)) {
              return false;
            }

            if (!GlobalStatics_9.method349(var4 + 128, var6, var5)) {
              return false;
            }
          }

          if (var0 > 0) {
            if (!GlobalStatics_9.method349(var4, var7, var5)) {
              return false;
            }

            if (!GlobalStatics_9.method349(var4 + 128, var7, var5)) {
              return false;
            }
          }

          if (!GlobalStatics_9.method349(var4, var8, var5)) {
            return false;
          }

          return GlobalStatics_9.method349(var4 + 128, var8, var5);

        }
      }

      return GlobalStatics_9.method349(var4 + 64, var9, var5 + 64) && (
          var3 == 16 ?
              GlobalStatics_9.method349(var4, var8, var5 + 128) :
              var3 == 32 ?
                  GlobalStatics_9.method349(var4 + 128, var8, var5 + 128) :
                  var3 == 64 ?
                      GlobalStatics_9.method349(var4 + 128, var8, var5) :
                      var3 != 128 || GlobalStatics_9
                          .method349(var4, var8, var5));
    } else {
      return false;
    }
  }

  public static void method2240(int var0) {
    GameStringStatics.aClass94_3008 = null;
    GlobalStatics_9.aShortArray3011 = null;
    GameStringStatics.ZERO = null;
    if (var0 == 128) {
      GlobalStatics_9.viewImageProducer = null;
    }
  }

  public static void method2241(byte var0, boolean var1) {
    int var2 = -47 / ((var0 - 5) / 49);

    AreaSoundEffect var3;
    for (
        var3 = (AreaSoundEffect) com.jagex.runescape.statics.GlobalStatics_0.aClass61_78
            .getFirst();
        var3 != null;
        var3 = (AreaSoundEffect) com.jagex.runescape.statics.GlobalStatics_0.aClass61_78
            .getNext()) {
      if (var3.aClass3_Sub24_Sub1_2312 != null) {
        GlobalStatics_9.aClass3_Sub24_Sub2_2563
            .method461(var3.aClass3_Sub24_Sub1_2312);
        var3.aClass3_Sub24_Sub1_2312 = null;
      }

      if (var3.aClass3_Sub24_Sub1_2315 != null) {
        GlobalStatics_9.aClass3_Sub24_Sub2_2563
            .method461(var3.aClass3_Sub24_Sub1_2315);
        var3.aClass3_Sub24_Sub1_2315 = null;
      }

      var3.unlinkNode();
    }

    if (var1) {
      for (
          var3 = (AreaSoundEffect) GlobalStatics_4.aClass61_1242.getFirst();
          var3 != null;
          var3 = (AreaSoundEffect) GlobalStatics_4.aClass61_1242.getNext()) {
        if (var3.aClass3_Sub24_Sub1_2312 != null) {
          GlobalStatics_9.aClass3_Sub24_Sub2_2563.method461(
              var3.aClass3_Sub24_Sub1_2312);
          var3.aClass3_Sub24_Sub1_2312 = null;
        }

        var3.unlinkNode();
      }

      for (
          var3 = (AreaSoundEffect) GlobalStatics_9.aClass130_4046.getFirst(68);
          var3 != null; var3 = (AreaSoundEffect) GlobalStatics_9.aClass130_4046
          .getNext(-66)) {
        if (var3.aClass3_Sub24_Sub1_2312 != null) {
          GlobalStatics_9.aClass3_Sub24_Sub2_2563.method461(
              var3.aClass3_Sub24_Sub1_2312);
          var3.aClass3_Sub24_Sub1_2312 = null;
        }

        var3.unlinkNode();
      }
    }
  }

  public static void method2245(byte var0) {
    GlobalStatics_9.aClass33_3019 = null;
    if (var0 != -74) {
      GlobalStatics_9.aByteArrayArray3027 = null;
    }

    GlobalStatics_9.aByteArrayArray3027 = null;
  }

  public static int method2246(byte var0, int var1) {
    int var2 = var1 * (var1 * var1 >> 12) >> 12;
    if (var0 <= 59) {
      GlobalStatics_9.aByteArrayArray3027 = null;
    }

    int var3 = 6 * var1 - 0xf000;
    int var4 = (var1 * var3 >> 12) + 0xa000;
    return var2 * var4 >> 12;
  }

  public static int method2247(byte var0, int var1, Widget var2) {
    if (var2.anIntArrayArray298 != null && var1
        < var2.anIntArrayArray298.length) {
      int var3 = -92 % ((var0 - 71) / 34);

      try {
        int[] var4 = var2.anIntArrayArray298[var1];
        byte var7 = 0;
        int var5 = 0;
        int var6 = 0;

        while (true) {
          int var9 = 0;
          int var8 = var4[var6++];
          byte var10 = 0;
          if (var8 == 0) {
            return var5;
          }

          if (var8 == 15) {
            var10 = 1;
          }

          if (var8 == 16) {
            var10 = 2;
          }

          if (var8 == 1) {
            var9 = GlobalStatics_1.anIntArray3185[var4[var6++]];
          }

          if (var8 == 17) {
            var10 = 3;
          }

          if (var8 == 2) {
            var9 = GlobalStatics_10.anIntArray2480[var4[var6++]];
          }

          if (var8 == 3) {
            var9 = GlobalStatics_9.anIntArray1743[var4[var6++]];
          }

          int var11;
          Widget var12;
          int var13;
          int var14;
          if (var8 == 4) {
            var11 = var4[var6++] << 16;
            var11 += var4[var6++];
            var12 = GlobalStatics_7.getWidget((byte) 124, var11);
            var13 = var4[var6++];
            if (var13 != -1 && (
                !DummyClass35.getItemConfig(var13).aBoolean779
                    || GlobalStatics_9.aBoolean66)) {
              assert var12 != null;
              for (var14 = 0; var12.anIntArray254.length > var14; ++var14) {
                if (1 + var13 == var12.anIntArray254[var14]) {
                  var9 += var12.anIntArray317[var14];
                }
              }
            }
          }

          if (var8 == 5) {
            var9 = DummyClass5.anIntArray2985[var4[var6++]];
          }

          if (var8 == 6) {
            var9 =
                GlobalStatics_11.anIntArray781[-1
                    + GlobalStatics_10.anIntArray2480[var4[var6++]]];
          }

          if (var8 == 7) {
            var9 = 100 * DummyClass5.anIntArray2985[var4[var6++]] / 0xb71b;
          }

          if (var8 == 8) {
            var9 = GlobalStatics_9.localPlayer.combatLevel;
          }

          if (var8 == 9) {
            for (var11 = 0; var11 < 25; ++var11) {
              if (GlobalStatics_9.aBooleanArray2538[var11]) {
                var9 += GlobalStatics_10.anIntArray2480[var11];
              }
            }
          }

          if (var8 == 10) {
            var11 = var4[var6++] << 16;
            var11 += var4[var6++];
            var12 = GlobalStatics_7.getWidget((byte) 115, var11);
            var13 = var4[var6++];
            if (var13 != -1 && (
                !DummyClass35.getItemConfig(var13).aBoolean779
                    || GlobalStatics_9.aBoolean66)) {
              assert var12 != null;
              for (var14 = 0; var12.anIntArray254.length > var14; ++var14) {
                if (var12.anIntArray254[var14] == 1 + var13) {
                  var9 = 999999999;
                  break;
                }
              }
            }
          }

          if (var8 == 11) {
            var9 = GlobalStatics_10.anInt136;
          }

          if (var8 == 12) {
            var9 = GlobalStatics_9.anInt1925;
          }

          if (var8 == 13) {
            var11 = DummyClass5.anIntArray2985[var4[var6++]];
            int var17 = var4[var6++];
            var9 = (1 << var17 & var11) == 0 ? 0 : 1;
          }

          if (var8 == 14) {
            var11 = var4[var6++];
            var9 = GlobalStatics_9.method1484(64835055, var11);
          }

          if (var8 == 18) {
            var9 = (GlobalStatics_9.localPlayer.sceneX >> 7)
                + GlobalStatics_10.REGION_BASE_X;
          }

          if (var8 == 19) {
            var9 = (
                GlobalStatics_9.localPlayer.sceneY >> 7)
                + GlobalStatics_9.REGION_BASE_Y;
          }

          if (var8 == 20) {
            var9 = var4[var6++];
          }

          if (var10 == 0) {
            if (var7 == 0) {
              var5 += var9;
            }

            if (var7 == 1) {
              var5 -= var9;
            }

            if (var7 == 2 && var9 != 0) {
              var5 /= var9;
            }

            if (var7 == 3) {
              var5 *= var9;
            }

            var7 = 0;
          } else {
            var7 = var10;
          }
        }
      } catch (Exception var15) {
        return -1;
      }
    } else {
      return -2;
    }
  }

  public static boolean method2248(int var0, int var1) {
    if (var0 != -157) {
      GlobalStatics_9.aClass33_3019 = null;
    }

    return var1 >= 32 && var1 <= 126 || var1 >= 160 && var1 <= 255
        || var1 == 128 || var1 == 140
        || var1 == 151 || var1 == 156 || var1 == 159;
  }

  public static void method2249(byte var0, int var1) {
    Node var2 = DummyClass23.aClass130_1659.getFirst(var0 - 6);
    if (var0 != 83) {
      GlobalStatics_9.aClass33_3019 = null;
    }

    for (; var2 != null; var2 = DummyClass23.aClass130_1659.getNext(-97)) {
      if ((65535L & var2.key >> 48) == var1) {
        var2.unlinkNode();
      }
    }
  }

  public static int method2234(int var0, int var1) {
    int var2 = -27 / ((var1 + 87) / 39);
    return 1023 & var0;
  }

  public static void method2235(int var0) {
    GlobalStatics_9.anIntArray2048 = null;
    GlobalStatics_2.configs = null;
    if (var0 == 4) {
      GameStringStatics.aClass94_2053 = null;
      GlobalStatics_9.aClass140_Sub5Array2058 = null;
      GameStringStatics.aClass94_2061 = null;
      GlobalStatics_9.aClass11_2055 = null;
    }
  }

  public static long method2174(int var0, int var1, int var2) {
    SceneGraphTile var3 = GLStatics.sceneGraphTiles[var0][var1][var2];
    return var3 != null && var3.aClass70_2234 != null ? var3.aClass70_2234.key
        : 0L;
  }

  public static void clear35(byte var0) {
    GameStringStatics.aClass94_2002 = null;
    GameStringStatics.CONNECTING_TO_UPDATE_SERVER = null;
    GlobalStatics_9.aClass3_Sub28_Sub17_Sub1_2000 = null;
    if (var0 == -110) {
      GameStringStatics.aClass94_2003 = null;
      GameStringStatics.aClass94_1998 = null;
    }
  }

  public static SoftwareDirectColorSprite[] method2176(int var0, int var1,
      int var2,
      FileUnpacker var3) {
    if (GlobalStatics_9.loadSprites(var3, var0, var2, -30901)) {
      if (var1 != 32767) {
        GlobalStatics_9.method2176(-111, 55, -18, null);
      }

      return GlobalStatics_9.createSprites();
    } else {
      return null;
    }
  }

  public static void method2255(byte var0) {
    GlobalStatics_9.anIntArray2073 = null;
    GlobalStatics_9.aClass3_Sub2ArrayArrayArray2065 = null;
    GameStringStatics.aClass94_2080 = null;
    GameStringStatics.RECTANGLE_DEBUG_EQ = null;

    GlobalStatics_9.anIntArray2068 = null;
    GlobalStatics_9.aClass3_Sub28_Sub5Array2070 = null;
    GlobalStatics_9.aClass3_Sub28_Sub16Array2072 = null;
    GameStringStatics.aClass94_2074 = null;
  }

  public static boolean method2256(int var0, int var1, int var2, int var3) {
    if (GlobalStatics_10.method846(var0, var1, var2)) {
      int var4 = var1 << 7;
      int var5 = var2 << 7;
      return
          GlobalStatics_9.method349(var4 + 1,
              GlobalStatics_4.heightMap[var0][var1][var2] + var3,
              var5 + 1) && GlobalStatics_9.method349(var4 + 128 - 1,
              GlobalStatics_4.heightMap[var0][var1 + 1][var2] + var3,
              var5 + 1)
              && GlobalStatics_9.method349(var4 + 128 - 1,
              GlobalStatics_4.heightMap[var0][var1 + 1][var2 + 1] + var3,
              var5 + 128 - 1)
              && GlobalStatics_9.method349(var4 + 1,
              GlobalStatics_4.heightMap[var0][var1][var2 + 1] + var3,
              var5 + 128 - 1);
    } else {
      return false;
    }
  }

  public static void method2257(int var0) {
    if (var0 < 60) {
      GlobalStatics_9.aClass3_Sub28_Sub16Array2072 = null;
    }

    DummyClass8.aClass93_4015.method1524(3);
  }

  public static void method2258(int var0, int var1, GameString var2) {
    GameString var3 = Objects.requireNonNull(var2.method1579(-17))
        .formatName((byte) -50);
    boolean var4 = false;

    for (int var5 = var1; var5 < DummyClass13.anInt2022; ++var5) {
      Player var6 = GlobalStatics_9.PLAYERS[DummyClass42.anIntArray887[var5]];
      if (var6 != null && var6.name != null && var6.name.method1531(var3)) {
        var4 = true;
        GlobalStatics_9
            .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0, 1, false,
                0, 2,
                var6.waypointsX[0], 1, 0, 2, var6.waypointsY[0],
                GlobalStatics_9.localPlayer.waypointsX[0]);
        if (var0 == 1) {
          ++GlobalStatics_11.anInt759;
          GlobalStatics_9.SECURE_BUFFER.writePacket(68);
          GlobalStatics_9.SECURE_BUFFER
              .method765(DummyClass42.anIntArray887[var5], (byte) 3);
        } else if (var0 != 4) {
          if (var0 == 5) {
            GlobalStatics_9.SECURE_BUFFER.writePacket(4);
            GlobalStatics_9.SECURE_BUFFER.writeShortLE(var1 - 1,
                DummyClass42.anIntArray887[var5]);
            ++GlobalStatics_4.anInt1240;
          } else {
            if (var0 == 6) {
              GlobalStatics_9.SECURE_BUFFER.writePacket(133);
              GlobalStatics_9.SECURE_BUFFER
                  .writeShortLE(-1, DummyClass42.anIntArray887[var5]);
              ++GlobalStatics_6.anInt3517;
            } else {
              if (var0 == 7) {
                ++DummyClass29.anInt437;
                GlobalStatics_9.SECURE_BUFFER.writePacket(114);
                GlobalStatics_9.SECURE_BUFFER
                    .method765(DummyClass42.anIntArray887[var5],
                        (byte) 3);
              }
            }
          }
        } else {
          ++GlobalStatics_9.anInt1910;
          GlobalStatics_9.SECURE_BUFFER.writePacket(180);
          GlobalStatics_9.SECURE_BUFFER
              .method765(DummyClass42.anIntArray887[var5], (byte) 3);
        }
        break;
      }
    }

    if (!var4) {
      GlobalStatics_8.printMessage(GameStringStatics.EMPTY_STRING, 0,
          GlobalStatics_9
              .concat(new GameString[]{GameStringStatics.aClass94_691, var3}),
          -1);
    }
  }

  public static AbstractIndexedColorSprite createIndexedColorSprite() {
    AbstractIndexedColorSprite var1;
    if (GlRenderer.USE_OPENGL) {
      var1 = new GlIndexedColorSprite(GlobalStatics_9.anInt2426,
          GlobalStatics_9.anInt1748,
          GlobalStatics_9.anIntArray2048[0],
          com.jagex.runescape.statics.GlobalStatics_0.anIntArray2591[0],
          GlobalStatics_9.anIntArray2931[0],
          GlobalStatics_10.anIntArray3076[0],
          DummyClass5.aByteArrayArray2987[0],
          GlobalStatics_10.anIntArray3446);
    } else {
      var1 =
          new SoftwareIndexedColorSprite(GlobalStatics_9.anInt2426,
              GlobalStatics_9.anInt1748,
              GlobalStatics_9.anIntArray2048[0],
              com.jagex.runescape.statics.GlobalStatics_0.anIntArray2591[0],
              GlobalStatics_9.anIntArray2931[0],
              GlobalStatics_10.anIntArray3076[0],
              DummyClass5.aByteArrayArray2987[0],
              GlobalStatics_10.anIntArray3446);
    }
    DummyClass37.method1035((byte) 116);
    return var1;
  }

  public static void method2260(int var0, int var1) {
    GlobalStatics_10.aClass93_3412.method1522(var0 + 919, var1);
    if (var0 == -1045) {
      GlobalStatics_9.aClass93_3369.method1522(-127, var1);
    }
  }

  public static void method111(byte var0, int var1, int var2, int var3,
      int var4, int var5, int var6,
      int var7, int var8) {
    if (var0 < -47) {
      for (int var9 = 0; DummyClass25.aClass131_1624.anInt1720 > var9; ++var9) {
        if (DummyClass25.aClass131_1624.method1787(var9, (byte) -124)) {
          int var10 =
              -GlobalStatics_10.anInt3256
                  + DummyClass25.aClass131_1624.aShortArray1727[var9];
          int var11 =
              GlobalStatics_9.anInt65 - (
                  DummyClass25.aClass131_1624.aShortArray1718[var9] + 1
                      - DummyClass58.anInt1460);
          int var12 = var1 + (-var1 + var4) * (var10 - var3) / (-var3 + var7);
          int var14 = DummyClass25.aClass131_1624.method1791(var9, 8);
          int var13 = (var8 - var2) * (var11 - var6) / (var5 - var6) + var2;
          int var15 = 16777215;
          SomethingFont var16 = null;
          if (var14 == 0) {
            if (GlobalStatics_4.aFloat727 == 3.0D) {
              var16 = GlobalStatics_9.aClass33_3019;
            }

            if (GlobalStatics_4.aFloat727 == 4.0D) {
              var16 = GlobalStatics_4.aClass33_1238;
            }

            if (GlobalStatics_4.aFloat727 == 6.0D) {
              var16 = DummyClass54.aClass33_1399;
            }

            if (GlobalStatics_4.aFloat727 >= 8.0D) {
              var16 = GlobalStatics_9.aClass33_2637;
            }
          }

          if (var14 == 1) {
            if (GlobalStatics_4.aFloat727 == 3.0D) {
              var16 = DummyClass54.aClass33_1399;
            }

            if (GlobalStatics_4.aFloat727 == 4.0D) {
              var16 = GlobalStatics_9.aClass33_2637;
            }

            if (GlobalStatics_4.aFloat727 == 6.0D) {
              var16 = DummyClass25.aClass33_1626;
            }

            if (GlobalStatics_4.aFloat727 >= 8.0D) {
              var16 = GlobalStatics_9.aClass33_2648;
            }
          }

          if (var14 == 2) {
            if (GlobalStatics_4.aFloat727 == 3.0D) {
              var16 = DummyClass25.aClass33_1626;
            }

            var15 = 16755200;
            if (GlobalStatics_4.aFloat727 == 4.0D) {
              var16 = GlobalStatics_9.aClass33_2648;
            }

            if (GlobalStatics_4.aFloat727 == 6.0D) {
              var16 = DummyClass12.aClass33_2034;
            }

            if (GlobalStatics_4.aFloat727 >= 8.0D) {
              var16 = GlobalStatics_7.aClass33_1305;
            }
          }

          if (DummyClass25.aClass131_1624.anIntArray1725[var9] != -1) {
            var15 = DummyClass25.aClass131_1624.anIntArray1725[var9];
          }

          if (var16 != null) {
            int var17 = GlobalStatics_3.aClass3_Sub28_Sub17_2379.method691(
                DummyClass25.aClass131_1624.aClass94Array1721[var9], null,
                GlobalStatics_7.aClass94Array2977);
            var13 -= var16.method998() * (var17 - 1) / 2;
            var13 += var16.method1006() / 2;

            for (int var18 = 0; var17 > var18; ++var18) {
              GameString var19 = GlobalStatics_7.aClass94Array2977[var18];
              if (-1 + var17 > var18) {
                var19.method1553(-4 + var19.getLength(), false);
              }

              var16.method1003(var19, var12, var13, var15, true);
              var13 += var16.method998();
            }
          }
        }
      }

    }
  }

  public static void method112(byte var0, byte var1) {
    if (GlobalStatics_5.aByteArrayArrayArray2008 == null) {
      GlobalStatics_5.aByteArrayArrayArray2008 = new byte[4][104][104];
    }

    if (var1 != 55) {
      GlobalStatics_9.NEXT_CAMERA_YAW_DELTA = -87;
    }

    for (int var2 = 0; var2 < 4; ++var2) {
      for (int var3 = 0; var3 < 104; ++var3) {
        for (int var4 = 0; var4 < 104; ++var4) {
          GlobalStatics_5.aByteArrayArrayArray2008[var2][var3][var4] = var0;
        }
      }
    }
  }

  public static void method113(byte var0) {
    GameStringStatics.aClass94_2274 = null;
    GameStringStatics.aClass94_2276 = null;
    GameStringStatics.aClass94_2280 = null;
    GameStringStatics.aClass94_2267 = null;
    GameStringStatics.aClass94_2269 = null;
    int var1 = -100 % ((var0 + 43) / 46);
  }

  public static void method114(int var0, int var1, int var2, int var3, int var4,
      int var5, int var6,
      int var7, int var8, int var9) {
    if (var0 != 3) {
      GlobalStatics_9.method117((byte) -26);
    }

    if (var9 == var8 && var3 == var7 && var5 == var4 && var1 == var6) {
      GlobalStatics_9.method1869((byte) 84, var2, var6, var7, var5, var9);
    } else {
      int var11 = var7;
      int var10 = var9;
      int var12 = var9 * 3;
      int var13 = 3 * var7;
      int var14 = var8 * 3;
      int var15 = var3 * 3;
      int var16 = var4 * 3;
      int var17 = var1 * 3;
      int var18 = var5 - var16 + var14 - var9;
      int var19 = -var7 + var6 - (var17 - var15);
      int var20 = var12 - var14 - var14 + var16;
      int var21 = var13 - var15 + var17 - var15;
      int var22 = -var12 + var14;
      int var23 = var15 - var13;

      for (int var24 = 128; var24 <= 4096; var24 += 128) {
        int var25 = var24 * var24 >> 12;
        int var26 = var24 * var25 >> 12;
        int var28 = var19 * var26;
        int var29 = var25 * var20;
        int var27 = var18 * var26;
        int var30 = var25 * var21;
        int var31 = var22 * var24;
        int var32 = var23 * var24;
        int var33 = (var31 + var27 + var29 >> 12) + var9;
        int var34 = var7 + (var32 + var28 + var30 >> 12);
        GlobalStatics_9
            .method1869((byte) -119, var2, var34, var11, var33, var10);
        var10 = var33;
        var11 = var34;
      }
    }
  }

  public static int method115(boolean var0, int var1) {
    long var2 = TimeUtilities.getCurrentTimeMillis();
    if (var1 != -1) {
      GlobalStatics_9.method116(false, 11);
    }

    for (VariableUpdate var4 =
        var0 ? (VariableUpdate) GlobalStatics_6.variableUpdates
            .getFirst(var1 + 56)
            : (VariableUpdate) GlobalStatics_6.variableUpdates.getNext(-123);
        var4 != null;
        var4 = (VariableUpdate) GlobalStatics_6.variableUpdates.getNext(-64)) {
      if ((4611686018427387903L & var4.timestamp) < var2) {
        if ((4611686018427387904L & var4.timestamp) != 0L) {
          int var5 = (int) var4.key;
          DummyClass5.anIntArray2985[var5] = GlobalStatics_9.variables[var5];
          var4.unlinkNode();
          return var5;
        }

        var4.unlinkNode();
      }
    }

    return -1;
  }

  public static void method116(boolean var0, int var1) {
    int var2 = DummyClass13.anInt2022;
    if (DummyClass45.anInt987 == GlobalStatics_9.localPlayer.sceneX >> 7
        && GlobalStatics_9.localPlayer.sceneY >> 7
        == DummyClass38.anInt733) {
      DummyClass45.anInt987 = 0;
    }

    if (var0) {
      var2 = 1;
    }

    int var3;
    Player var4;
    int var7;
    int var8;
    int var9;
    int var10;
    int var11;
    for (var3 = 0; var3 < var2; ++var3) {
      if (var0) {
        var4 = GlobalStatics_9.localPlayer;
      } else {
        var4 = GlobalStatics_9.PLAYERS[DummyClass42.anIntArray887[var3]];
      }

      if (var4 != null && var4.hasConfiguration((byte) 17)) {
        int var5 = var4.getSize();
        int var6;
        if (var5 == 1) {
          if ((127 & var4.sceneX) == 64 && (127 & var4.sceneY) == 64) {
            var6 = var4.sceneX >> 7;
            var7 = var4.sceneY >> 7;
            if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
              ++DummyClass9.anIntArrayArray4010[var6][var7];
            }
          }
        } else if (
            ((1 & var5) != 0 || (var4.sceneX & 127) == 0
                && (127 & var4.sceneY) == 0) && (
                (1 & var5) != 1 || (var4.sceneX & 127) == 64 && (127
                    & var4.sceneY) == 64)) {
          var6 = var4.sceneX - var5 * 64 >> 7;
          var7 = var4.sceneY - var5 * 64 >> 7;
          var8 = var4.getSize() + var6;
          if (var8 > 104) {
            var8 = 104;
          }

          if (var6 < 0) {
            var6 = 0;
          }

          var9 = var7 + var4.getSize();
          if (var7 < 0) {
            var7 = 0;
          }

          if (var9 > 104) {
            var9 = 104;
          }

          for (var10 = var6; var10 < var8; ++var10) {
            for (var11 = var7; var11 < var9; ++var11) {
              ++DummyClass9.anIntArrayArray4010[var10][var11];
            }
          }
        }
      }
    }

    if (var1 == 670232012) {
      label226:
      for (var3 = 0; var2 > var3; ++var3) {
        long var16;
        if (var0) {
          var4 = GlobalStatics_9.localPlayer;
          var16 = 8791798054912L;
        } else {
          var4 = GlobalStatics_9.PLAYERS[DummyClass42.anIntArray887[var3]];
          var16 = (long) DummyClass42.anIntArray887[var3] << 32;
        }

        if (var4 != null && var4.hasConfiguration((byte) 17)) {
          var4.aBoolean3968 =
              (SettingsStatics.aBoolean236 && DummyClass13.anInt2022 > 200 ||
                  DummyClass13.anInt2022 > 50)
                  && !var0 && var4.anInt2764 == Objects
                  .requireNonNull(var4.getRenderAnimationId(false)).anInt368;

          var7 = var4.getSize();
          if (var7 == 1) {
            if ((127 & var4.sceneX) == 64 && (127 & var4.sceneY) == 64) {
              var8 = var4.sceneX >> 7;
              var9 = var4.sceneY >> 7;
              if (var8 < 0 || var8 >= 104 || var9 < 0 || var9 >= 104) {
                continue;
              }

              if (DummyClass9.anIntArrayArray4010[var8][var9] > 1) {
                --DummyClass9.anIntArrayArray4010[var8][var9];
                continue;
              }
            }
          } else if (
              (1 & var7) == 0 && (127 & var4.sceneX) == 0
                  && (var4.sceneY & 127) == 0
                  || (1 & var7) == 1 && (127 & var4.sceneX) == 64
                  && (var4.sceneY & 127) == 0) {
            var8 = var4.sceneX - 64 * var7 >> 7;
            var10 = var7 + var8;
            var9 = -(var7 * 64) + var4.sceneY >> 7;
            if (var10 > 104) {
              var10 = 104;
            }

            if (var8 < 0) {
              var8 = 0;
            }

            var11 = var7 + var9;
            if (var9 < 0) {
              var9 = 0;
            }

            boolean var12 = true;
            if (var11 > 104) {
              var11 = 104;
            }

            int var13;
            int var14;
            for (var13 = var8; var13 < var10; ++var13) {
              for (var14 = var9; var11 > var14; ++var14) {
                if (DummyClass9.anIntArrayArray4010[var13][var14] <= 1) {
                  var12 = false;
                  break;
                }
              }
            }

            if (var12) {
              var13 = var8;

              while (true) {
                if (var13 >= var10) {
                  continue label226;
                }

                for (var14 = var9; var11 > var14; ++var14) {
                  --DummyClass9.anIntArrayArray4010[var13][var14];
                }

                ++var13;
              }
            }
          }

          if (var4.anObject2796 != null && GlobalStatics_4.updateCycle
              >= var4.anInt2797
              && var4.anInt2778 > GlobalStatics_4.updateCycle) {
            var4.aBoolean3968 = false;
            var4.anInt2831 =
                GlobalStatics_6
                    .method1736(GlobalStatics_9.currentPlane, 1, var4.sceneX,
                        var4.sceneY);
            GlobalStatics_10
                .method292(GlobalStatics_9.currentPlane, var4.sceneX,
                    var4.sceneY, var4.anInt2831, var4, var4.rotationY, var16,
                    var4.anInt2788,
                    var4.anInt2777, var4.anInt2818, var4.anInt2817);
          } else {
            var4.anInt2831 =
                GlobalStatics_6
                    .method1736(GlobalStatics_9.currentPlane, 1, var4.sceneX,
                        var4.sceneY);
            DummyClass29.addNodeToSceneGraph(GlobalStatics_9.currentPlane,
                var4.sceneX,
                var4.sceneY, var4.anInt2831, 64 * (var7 - 1) + 60, var4,
                var4.rotationY, var16,
                var4.aBoolean2810);
          }
        }
      }

    }
  }

  public static void method117(byte var0) {
    if (GlobalStatics_9.anInt3536 < 0) {
      GlobalStatics_9.anInt3362 = -1;
      GlobalStatics_9.anInt3536 = 0;
      GlobalStatics_9.anInt1150 = -1;
    }

    if (GlobalStatics_9.anInt3536 > DummyClass30.anInt455) {
      GlobalStatics_9.anInt3362 = -1;
      GlobalStatics_9.anInt3536 = DummyClass30.anInt455;
      GlobalStatics_9.anInt1150 = -1;
    }

    if (var0 != 87) {
      GameStringStatics.aClass94_2280 = null;
    }

    if (GlobalStatics_9.anInt2251 < 0) {
      GlobalStatics_9.anInt1150 = -1;
      GlobalStatics_9.anInt3362 = -1;
      GlobalStatics_9.anInt2251 = 0;
    }

    if (DummyClass58.anInt1460 < GlobalStatics_9.anInt2251) {
      GlobalStatics_9.anInt2251 = DummyClass58.anInt1460;
      GlobalStatics_9.anInt3362 = -1;
      GlobalStatics_9.anInt1150 = -1;
    }
  }

  public static void method1702(byte var0, boolean var1) {
    if (!var1 != !DummyClass28.aBoolean337) {
      DummyClass28.aBoolean337 = var1;
      if (var0 > -117) {
        GameStringStatics.aClass94_1546 = null;
      }

      GlobalStatics_9.method139(76);
    }
  }

  public static void method1703(int var0) {
    GameStringStatics.aClass94_1558 = null;
    if (var0 != 10967) {
      GlobalStatics_9.method1703(-117);
    }

    GameStringStatics.aClass94_1546 = null;
    GameStringStatics.aClass94_1556 = null;
    GameStringStatics.aClass94_1567 = null;
  }

  public static void method118(int var0) {
    GlobalStatics_9.BIT_MASKS = null;
    GlobalStatics_9.byteArrayPool = null;
    GameStringStatics.aClass94_2285 = null;
    if (var0 != 2) {
      GlobalStatics_9.method119(null, 91);
    }

    GameStringStatics.aClass94_2286 = null;
  }

  public static float[] method119(float[] var0, int var1) {
    if (var0 != null) {
      float[] var2 = new float[var0.length];
      ArrayUtils.method1360(var0, var1, var2, 0, var0.length);
      return var2;
    } else {
      return null;
    }
  }

  public static void clear84() {
    SomethingMidiFile0Statics.aByteArray1117 = null;
  }

  public static void method1204() {
    SomethingMidiIStatics.anIntArray928 = null;
    SomethingMidiIStatics.aFloatArray929 = null;
    SomethingMidiIStatics.anIntArray925 = null;
    SomethingMidiIStatics.anIntArray927 = null;
    SomethingMidiIStatics.aBooleanArray919 = null;
  }

  public static void method405() {
    GlobalStatics_9.aClass153_2536 = null;
    GlobalStatics_9.anIntArray2533 = null;
    GLStatics.aClass3_Sub11ArrayArray2542 = null;
    GlobalStatics_9.aBooleanArray2538 = null;
  }

  public static void drawLoadingScreen(AbstractFont var2, boolean var1) {
    int var3;
    if (GlRenderer.USE_OPENGL || var1) {
      var3 = GlobalStatics_9.viewHeight;
      int var4 = var3 * 956 / 503;
      DummyClass59.titlebackground
          .draw((DummyClass30.viewWidth - var4) / 2, 0, var4, var3);
      GlobalStatics_3.logoSprite.draw(
          -(GlobalStatics_3.logoSprite.width / 2) + DummyClass30.viewWidth / 2,
          18);
    }

    var2.draw(GameStringStatics.aClass94_485, DummyClass30.viewWidth / 2,
        GlobalStatics_9.viewHeight / 2 - 26, 16777215, -1);
    var3 = GlobalStatics_9.viewHeight / 2 - 18;
    if (GlRenderer.USE_OPENGL) {
      GlUtils
          .drawQuad(DummyClass30.viewWidth / 2 - 152, var3, 304, 34, 9179409);
      GlUtils.drawQuad(-151 + DummyClass30.viewWidth / 2, var3 + 1, 302, 32, 0);
      GlUtils.fillQuad(DummyClass30.viewWidth / 2 - 150, var3 + 2,
          GlobalStatics_6.loadingPercent * 3, 30, 9179409);
      GlUtils.fillQuad(DummyClass30.viewWidth / 2 - 150 + 3
              * GlobalStatics_6.loadingPercent,
          2 + var3, 300 - 3 * GlobalStatics_6.loadingPercent, 30, 0);
    } else {
      DummyClass47
          .method1311(DummyClass30.viewWidth / 2 - 152, var3, 304, 34, 9179409);
      DummyClass47
          .method1311(-151 + DummyClass30.viewWidth / 2, var3 + 1, 302, 32, 0);
      DummyClass47.method1323(DummyClass30.viewWidth / 2 - 150, var3 + 2,
          GlobalStatics_6.loadingPercent * 3, 30, 9179409);
      DummyClass47.method1323(
          3 * GlobalStatics_6.loadingPercent - 150 + DummyClass30.viewWidth / 2,
          2 + var3, -(3 * GlobalStatics_6.loadingPercent) + 300, 30, 0);
    }

    var2.draw(GlobalStatics_3.loadingText, DummyClass30.viewWidth / 2,
        4 + GlobalStatics_9.viewHeight / 2, 16777215, -1);
  }

  public static GameString method407(int var0, boolean var1, int var2,
      long var3, int var5) {
    GameString var6 = GameStringStatics.createString(0);
    if (var3 < 0L) {
      var3 = -var3;
      var6.append(GameStringStatics.aClass94_3133);
    }

    GameString var8 = DummyClass15.aClass94_1880;
    GameString var7 = DummyClass28.aClass94_341;
    if (var0 == 1) {
      var8 = DummyClass28.aClass94_341;
      var7 = DummyClass15.aClass94_1880;
    }

    if (var0 == 2) {
      var7 = DummyClass15.aClass94_1880;
      var8 = GameStringStatics.aClass94_3080;
    }

    if (var0 == 3) {
      var8 = DummyClass28.aClass94_341;
      var7 = DummyClass15.aClass94_1880;
    }

    GameString var10 = GameStringStatics.createString(0);

    int var11;
    for (var11 = 0; var11 < var2; ++var11) {
      var10.append(GlobalStatics_9.toString((int) (var3 % 10L)));
      var3 /= 10L;
    }

    var11 = 0;
    GameString var9;
    if (var3 == 0L) {
      var9 = GameStringStatics.aClass94_3039;
    } else {
      GameString var12;
      for (var12 = GameStringStatics.createString(0); var3 > 0L; var3 /= 10L) {
        if (var1 && var11 != 0 && var11 % 3 == 0) {
          var12.append(var8);
        }

        var12.append(GlobalStatics_9.toString((int) (var3 % 10L)));
        ++var11;
      }

      var9 = var12;
    }

    if (var5 == 2) {
      if (var10.getLength() > 0) {
        var10.append(var7);
      }

      return GlobalStatics_9.concat(
          new GameString[]{var6, var9.method1544(true),
              var10.method1544(true)});
    } else {
      return null;
    }
  }

  public static int method408(int var0, byte var1, int var2, int[][] var3,
      int var4, int var5) {
    int var6 =
        var0 * var3[1 + var4][var2] + (128 - var0) * var3[var4][var2] >> 7;
    int var7 =
        var3[var4][1 + var2] * (-var0 + 128) + var3[var4 + 1][var2 + 1] * var0
            >> 7;
    int var8 = -121 / ((var1 - 5) / 46);
    return var6 * (128 - var5) + var5 * var7 >> 7;
  }

  public static void clear32() {
    GameStringStatics.aClass94_1745 = null;
    GlobalStatics_9.anIntArray1743 = null;
    GlobalStatics_9.anIntArray1755 = null;
    GlobalStatics_9.worldMapData = null;
    GlobalStatics_9.aClass11_1749 = null;
  }

  public static void method1803(byte var0) {
    if (var0 >= 4) {
      GlobalStatics_9.aClass93_1146.method1523();
      DummyClass13.aClass93_2016.method1523();
    }
  }

  public static void method547(int var0) {
    if (var0 != -2951) {
      GameStringStatics.aClass94_3576 = null;
    }

    GameStringStatics.aClass94_3578 = null;
    GlobalStatics_9.aClass93_3572 = null;
    GameStringStatics.aClass94_3575 = null;
    GameStringStatics.TITLE_BACKGROUND = null;
    GameStringStatics.aClass94_3577 = null;
    GameStringStatics.aClass94_3576 = null;
    GameStringStatics.aClass94_3573 = null;
    GlobalStatics_9.aClass83_3579 = null;
    GlobalStatics_9.anIntArray3565 = null;
  }

  public static void method528(int var0) {
    GlobalStatics_9.aClass3_Sub20_3532 = null;
    if (var0 != -1667) {
      GlobalStatics_9.anInt3539 = 101;
    }
  }

  public static GameString method531(byte var0) {
    GameString var1;
    if (GlobalStatics_9.anInt3012 == 1
        && GlobalStatics_10.amountContextActions < 2) {
      var1 = GlobalStatics_9.concat(new GameString[]{
          GameStringStatics.aClass94_3388, GlobalStatics_2.aClass94_43,
          GameStringStatics.aClass94_378, GameStringStatics.aClass94_1724
      });
    } else if (GlobalStatics_9.aBoolean1837
        && GlobalStatics_10.amountContextActions
        < 2) {
      var1 = GlobalStatics_9.concat(new GameString[]{
          GameStringStatics.aClass94_3621, GlobalStatics_2.aClass94_43,
          DummyClass59.aClass94_676,
          GameStringStatics.aClass94_1724
      });
    } else if (DummyClass55.aBoolean1419
        && KeyboardStatics.PRESSED_KEYS[81]
        && GlobalStatics_10.amountContextActions > 2) {
      var1 = com.jagex.runescape.statics.GlobalStatics_0
          .method802(GlobalStatics_10.amountContextActions - 2, true);
    } else {
      var1 = com.jagex.runescape.statics.GlobalStatics_0
          .method802(GlobalStatics_10.amountContextActions - 1, true);
    }

    if (GlobalStatics_10.amountContextActions > 2) {
      var1 = GlobalStatics_9.concat(new GameString[]{
          var1, DummyClass3.aClass94_58,
          GlobalStatics_9.toString(GlobalStatics_10.amountContextActions - 2),
          GameStringStatics.aClass94_3426
      });
    }

    int var2 = -97 % ((var0 - 55) / 32);
    return var1;
  }

  public static void method532(int var0, int var1) {
    if (var1 == -28236) {
      Inventory var2 = (Inventory) GlobalStatics_2.aClass130_2220.get(var0);
      if (var2 != null) {
        var2.unlinkNode();
      }
    }
  }

  public static void drawLoadingBar(Color var0, boolean var1, boolean var2,
      GameString var3,
      int var4) {
    try {
      Graphics var5 = GlobalStatics_8.GAME_CANVAS.getGraphics();
      if (GlobalStatics_10.aFont3384 == null) {
        GlobalStatics_10.aFont3384 = new Font("Helvetica", 1, 13);
        DummyClass17.aFontMetrics1822 =
            GlobalStatics_8.GAME_CANVAS
                .getFontMetrics(GlobalStatics_10.aFont3384);
      }

      if (var2) {
        var5.setColor(Color.black);
        var5.fillRect(0, 0, DummyClass30.viewWidth, GlobalStatics_9.viewHeight);
      }

      if (var0 == null) {
        var0 = new Color(140, 17, 17);
      }

      if (var1) {
        return;
      }

      try {
        if (GlobalStatics_9.anImage2695 == null) {
          GlobalStatics_9.anImage2695 = GlobalStatics_8.GAME_CANVAS
              .createImage(304, 34);
        }

        Graphics var6 = GlobalStatics_9.anImage2695.getGraphics();
        var6.setColor(var0);
        var6.drawRect(0, 0, 303, 33);
        var6.fillRect(2, 2, var4 * 3, 30);
        var6.setColor(Color.black);
        var6.drawRect(1, 1, 301, 31);
        var6.fillRect(3 * var4 + 2, 2, -(3 * var4) + 300, 30);
        var6.setFont(GlobalStatics_10.aFont3384);
        var6.setColor(Color.white);
        var3.method1532(22,
            (-var3.method1575(-21018, DummyClass17.aFontMetrics1822) + 304) / 2,
            var6, (byte) -90);
        var5.drawImage(GlobalStatics_9.anImage2695,
            DummyClass30.viewWidth / 2 - 152,
            -18 + GlobalStatics_9.viewHeight / 2, null);
      } catch (Exception var9) {
        int var7 = -152 + DummyClass30.viewWidth / 2;
        int var8 = -18 + GlobalStatics_9.viewHeight / 2;
        var5.setColor(var0);
        var5.drawRect(var7, var8, 303, 33);
        var5.fillRect(var7 + 2, 2 + var8, 3 * var4, 30);
        var5.setColor(Color.black);
        var5.drawRect(1 + var7, var8 + 1, 301, 31);
        var5.fillRect(3 * var4 + var7 + 2, 2 + var8, 300 - var4 * 3, 30);
        var5.setFont(GlobalStatics_10.aFont3384);
        var5.setColor(Color.white);
        var3.method1532(22 + var8,
            var7 +
                (-var3.method1575(-21018, DummyClass17.aFontMetrics1822) + 304)
                    / 2, var5,
            (byte) -125);
      }

      if (DummyClass10.aClass94_2083 != null) {
        var5.setFont(GlobalStatics_10.aFont3384);
        var5.setColor(Color.white);
        DummyClass10.aClass94_2083
            .method1532(GlobalStatics_9.viewHeight / 2 - 26,
                DummyClass30.viewWidth / 2
                    - DummyClass10.aClass94_2083
                    .method1575(-21018, DummyClass17.aFontMetrics1822) / 2,
                var5, (byte) -116);
      }
    } catch (Exception var10) {
      GlobalStatics_8.GAME_CANVAS.repaint();
    }
  }

  public static SoftwareDirectColorSprite[] createSprites() {
    SoftwareDirectColorSprite[] var1 = new SoftwareDirectColorSprite[DummyClass53.spriteCount];
    for (int var2 = 0; var2 < DummyClass53.spriteCount; ++var2) {
      int var3 = GlobalStatics_10.anIntArray3076[var2]
          * GlobalStatics_9.anIntArray2931[var2];
      byte[] var4 = DummyClass5.aByteArrayArray2987[var2];
      int[] var5 = new int[var3];

      for (int var6 = 0; var6 < var3; ++var6) {
        var5[var6] = GlobalStatics_10.anIntArray3446[255 & (int) var4[var6]];
      }

      var1[var2] =
          new SoftwareDirectColorSprite(GlobalStatics_9.anInt2426,
              GlobalStatics_9.anInt1748,
              GlobalStatics_9.anIntArray2048[var2],
              com.jagex.runescape.statics.GlobalStatics_0.anIntArray2591[var2],
              GlobalStatics_9.anIntArray2931[var2],
              GlobalStatics_10.anIntArray3076[var2],
              var5);
    }

    DummyClass37.method1035((byte) 113);
    return var1;
  }

  public static void method852(byte var0, int var1) {
    Inventory var2 = (Inventory) GlobalStatics_2.aClass130_2220.get(var1);
    if (var2 != null) {
      if (var0 != 114) {
        GlobalStatics_9.aClass153_152 = null;
      }

      for (int var3 = 0; var2.ids.length > var3; ++var3) {
        var2.ids[var3] = -1;
        var2.counts[var3] = 0;
      }

    }
  }

  public static void method853(int var0) {
    GameStringStatics.aClass94_148 = null;
    GameStringStatics.aClass94_150 = null;

    GlobalStatics_9.aClass153_152 = null;
  }

  public static Structure method1292(byte var0, int var1) {
    Structure var2 = (Structure) GlobalStatics_10.aClass47_3407.get(var1, 1400);
    if (var2 != null) {
      return var2;
    } else {
      if (var0 <= 23) {
        GameStringStatics.aClass94_1070 = null;
      }

      byte[] var3 = GlobalStatics_9.aClass153_322.getBytes(26, var1);
      var2 = new Structure();
      if (var3 != null) {
        var2.method608(5, new Buffer(var3));
      }

      GlobalStatics_10.aClass47_3407.put(var1, var2);
      return var2;
    }
  }

  public static void method1293(boolean var0) {
    if (!GlobalStatics_9.aBoolean3779 && GlobalStatics_4.usageLocation != 2) {
      GlobalStatics_2.aClass94_38.method1577(-1857);
      if (!var0) {
        GlobalStatics_9.toString(1);
      }
    }
  }

  public static void method1294() {
    GlobalStatics_9.anInt1672 = 0;

    label188:
    for (int var0 = 0; var0 < GlobalStatics_9.anInt2249; ++var0) {
      SomethingLight0 var1 = GlobalStatics_6.aClass113Array3610[var0];
      int var2;
      if (GlobalStatics_9.anIntArray3045 != null) {
        for (var2 = 0; var2 < GlobalStatics_9.anIntArray3045.length; ++var2) {
          if (GlobalStatics_9.anIntArray3045[var2] != -1000000 && (
              var1.anInt1544 <= GlobalStatics_9.anIntArray3045[var2]
                  || var1.anInt1548 <= GlobalStatics_9.anIntArray3045[var2])
              && (
              var1.anInt1562 <= GlobalStatics_9.anIntArray859[var2]
                  || var1.anInt1545 <= GlobalStatics_9.anIntArray859[var2]) && (
              var1.anInt1562 >= GlobalStatics_7.anIntArray1083[var2]
                  || var1.anInt1545 >= GlobalStatics_7.anIntArray1083[var2])
              && (
              var1.anInt1560 <= GlobalStatics_9.anIntArray2663[var2]
                  || var1.anInt1550 <= GlobalStatics_9.anIntArray2663[var2])
              && (
              var1.anInt1560 >= GlobalStatics_2.anIntArray39[var2]
                  || var1.anInt1550 >= GlobalStatics_2.anIntArray39[var2])) {
            continue label188;
          }
        }
      }

      int var3;
      int var4;
      boolean var5;
      int var6;
      if (var1.anInt1554 == 1) {
        var2 =
            var1.anInt1553 - GLStatics.CAMERA_TILE_X
                + GLStatics.CURRENT_VIEWPORT_SIZE;
        if (var2 >= 0
            && var2 <= GLStatics.CURRENT_VIEWPORT_SIZE
            + GLStatics.CURRENT_VIEWPORT_SIZE) {
          var3 =
              var1.anInt1563 - GLStatics.CAMERA_TILE_Y
                  + GLStatics.CURRENT_VIEWPORT_SIZE;
          if (var3 < 0) {
            var3 = 0;
          }

          var4 =
              var1.anInt1566 - GLStatics.CAMERA_TILE_Y
                  + GLStatics.CURRENT_VIEWPORT_SIZE;
          if (var4 > GLStatics.CURRENT_VIEWPORT_SIZE
              + GLStatics.CURRENT_VIEWPORT_SIZE) {
            var4 = GLStatics.CURRENT_VIEWPORT_SIZE
                + GLStatics.CURRENT_VIEWPORT_SIZE;
          }

          var5 = false;

          while (var3 <= var4) {
            if (GLStatics.adjacentTileOnScreen[var2][var3++]) {
              var5 = true;
              break;
            }
          }

          if (var5) {
            var6 = GlobalStatics_9.CAMERA_X - var1.anInt1562;
            if (var6 > 32) {
              var1.anInt1564 = 1;
            } else {
              if (var6 >= -32) {
                continue;
              }

              var1.anInt1564 = 2;
              var6 = -var6;
            }

            var1.anInt1555 =
                (var1.anInt1560 - GlobalStatics_9.CAMERA_Z << 8) / var6;
            var1.anInt1551 =
                (var1.anInt1550 - GlobalStatics_9.CAMERA_Z << 8) / var6;
            var1.anInt1561 =
                (var1.anInt1544 - GlobalStatics_7.CAMERA_Y << 8) / var6;
            var1.anInt1565 =
                (var1.anInt1548 - GlobalStatics_7.CAMERA_Y << 8) / var6;
            GlobalStatics_10.aClass113Array1895[GlobalStatics_9.anInt1672++] = var1;
          }
        }
      } else if (var1.anInt1554 == 2) {
        var2 =
            var1.anInt1563 - GLStatics.CAMERA_TILE_Y
                + GLStatics.CURRENT_VIEWPORT_SIZE;
        if (var2 >= 0
            && var2 <= GLStatics.CURRENT_VIEWPORT_SIZE
            + GLStatics.CURRENT_VIEWPORT_SIZE) {
          var3 =
              var1.anInt1553 - GLStatics.CAMERA_TILE_X
                  + GLStatics.CURRENT_VIEWPORT_SIZE;
          if (var3 < 0) {
            var3 = 0;
          }

          var4 =
              var1.anInt1547 - GLStatics.CAMERA_TILE_X
                  + GLStatics.CURRENT_VIEWPORT_SIZE;
          if (var4 > GLStatics.CURRENT_VIEWPORT_SIZE
              + GLStatics.CURRENT_VIEWPORT_SIZE) {
            var4 = GLStatics.CURRENT_VIEWPORT_SIZE
                + GLStatics.CURRENT_VIEWPORT_SIZE;
          }

          var5 = false;

          while (var3 <= var4) {
            if (GLStatics.adjacentTileOnScreen[var3++][var2]) {
              var5 = true;
              break;
            }
          }

          if (var5) {
            var6 = GlobalStatics_9.CAMERA_Z - var1.anInt1560;
            if (var6 > 32) {
              var1.anInt1564 = 3;
            } else {
              if (var6 >= -32) {
                continue;
              }

              var1.anInt1564 = 4;
              var6 = -var6;
            }

            var1.anInt1549 =
                (var1.anInt1562 - GlobalStatics_9.CAMERA_X << 8) / var6;
            var1.anInt1557 =
                (var1.anInt1545 - GlobalStatics_9.CAMERA_X << 8) / var6;
            var1.anInt1561 =
                (var1.anInt1544 - GlobalStatics_7.CAMERA_Y << 8) / var6;
            var1.anInt1565 =
                (var1.anInt1548 - GlobalStatics_7.CAMERA_Y << 8) / var6;
            GlobalStatics_10.aClass113Array1895[GlobalStatics_9.anInt1672++] = var1;
          }
        }
      } else if (var1.anInt1554 == 4) {
        var2 = var1.anInt1544 - GlobalStatics_7.CAMERA_Y;
        if (var2 > 128) {
          var3 =
              var1.anInt1563 - GLStatics.CAMERA_TILE_Y
                  + GLStatics.CURRENT_VIEWPORT_SIZE;
          if (var3 < 0) {
            var3 = 0;
          }

          var4 =
              var1.anInt1566 - GLStatics.CAMERA_TILE_Y
                  + GLStatics.CURRENT_VIEWPORT_SIZE;
          if (var4 > GLStatics.CURRENT_VIEWPORT_SIZE
              + GLStatics.CURRENT_VIEWPORT_SIZE) {
            var4 = GLStatics.CURRENT_VIEWPORT_SIZE
                + GLStatics.CURRENT_VIEWPORT_SIZE;
          }

          if (var3 <= var4) {
            int var10 =
                var1.anInt1553 - GLStatics.CAMERA_TILE_X
                    + GLStatics.CURRENT_VIEWPORT_SIZE;
            if (var10 < 0) {
              var10 = 0;
            }

            var6 =
                var1.anInt1547 - GLStatics.CAMERA_TILE_X
                    + GLStatics.CURRENT_VIEWPORT_SIZE;
            if (var6 > GLStatics.CURRENT_VIEWPORT_SIZE
                + GLStatics.CURRENT_VIEWPORT_SIZE) {
              var6 = GLStatics.CURRENT_VIEWPORT_SIZE
                  + GLStatics.CURRENT_VIEWPORT_SIZE;
            }

            boolean var7 = false;

            label114:
            for (int var8 = var10; var8 <= var6; ++var8) {
              for (int var9 = var3; var9 <= var4; ++var9) {
                if (GLStatics.adjacentTileOnScreen[var8][var9]) {
                  var7 = true;
                  break label114;
                }
              }
            }

            if (var7) {
              var1.anInt1564 = 5;
              var1.anInt1549 =
                  (var1.anInt1562 - GlobalStatics_9.CAMERA_X << 8) / var2;
              var1.anInt1557 =
                  (var1.anInt1545 - GlobalStatics_9.CAMERA_X << 8) / var2;
              var1.anInt1555 =
                  (var1.anInt1560 - GlobalStatics_9.CAMERA_Z << 8) / var2;
              var1.anInt1551 =
                  (var1.anInt1550 - GlobalStatics_9.CAMERA_Z << 8) / var2;
              GlobalStatics_10.aClass113Array1895[GlobalStatics_9.anInt1672++] = var1;
            }
          }
        }
      }
    }

  }

  public static GameString method1295(int var0, byte var1, int var2) {
    int var3 = -var0 + var2;
    return var3 >= 8 ?
        var3 >= 5 ?
            var3 >= 2 ?
                var3 < 0 ?
                    GameStringStatics.aClass94_3394 :
                    var1 > -52 ?
                        null :
                        var3 <= 9 ?
                            var3 > 6 ?
                                GameStringStatics.aClass94_3040 :
                                var3 <= 3 ?
                                    var3 > 0 ? GlobalStatics_8.aClass94_2723
                                        : DummyClass22.aClass94_1738 :
                                    GlobalStatics_11.aClass94_50 :
                            GameStringStatics.aClass94_431 :
                GlobalStatics_0.aClass94_1714 :
            DummyClass4.aClass94_3006 :
        GlobalStatics_8.aClass94_3298;
  }

  public static void method1296(int var0) {
    GameStringStatics.aClass94_1076 = null;
    if (var0 == 1) {
      GameStringStatics.aClass94_1072 = null;
      GameStringStatics.aClass94_1070 = null;
    }
  }

  public static GameString toString(int var1) {
    return GlobalStatics_5.method1723((byte) -117, false, 10, var1);
  }

  public static void method870(int var0, byte var1, int var2, int var3,
      int var4, int var5) {
    int var6;
    int var7;
    for (var6 = var2; var4 + var2 >= var6; ++var6) {
      for (var7 = var3; var5 + var3 >= var7; ++var7) {
        if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
          GlobalStatics_9.SCENE_SHADOW[var0][var7][var6] = 127;
        }
      }
    }

    for (var6 = var2; var4 + var2 > var6; ++var6) {
      for (var7 = var3; var3 + var5 > var7; ++var7) {
        if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
          GlobalStatics_4.heightMap[var0][var7][var6] =
              var0 <= 0 ? 0 : GlobalStatics_4.heightMap[var0 - 1][var7][var6];
        }
      }
    }

    if (var3 > 0 && var3 < 104) {
      for (var6 = 1 + var2; var2 + var4 > var6; ++var6) {
        if (var6 >= 0 && var6 < 104) {
          GlobalStatics_4.heightMap[var0][var3][var6] =
              GlobalStatics_4.heightMap[var0][var3 - 1][var6];
        }
      }
    }

    if (var2 > 0 && var2 < 104) {
      for (var6 = var3 + 1; var3 + var5 > var6; ++var6) {
        if (var6 >= 0 && var6 < 104) {
          GlobalStatics_4.heightMap[var0][var6][var2] =
              GlobalStatics_4.heightMap[var0][var6][var2 - 1];
        }
      }
    }

    var6 = 56 % ((var1 + 18) / 50);
    if (var3 >= 0 && var2 >= 0 && var3 < 104 && var2 < 104) {
      if (var0 != 0) {
        if (var3 > 0 && GlobalStatics_4.heightMap[-1 + var0][var3 - 1][var2]
            != GlobalStatics_4.heightMap[var0][-1 + var3][var2]) {
          GlobalStatics_4.heightMap[var0][var3][var2] =
              GlobalStatics_4.heightMap[var0][-1 + var3][var2];
        } else if (var2 > 0
            && GlobalStatics_4.heightMap[var0][var3][-1 + var2]
            != GlobalStatics_4.heightMap[
            -1 + var0][var3][var2 - 1]) {
          GlobalStatics_4.heightMap[var0][var3][var2] =
              GlobalStatics_4.heightMap[var0][var3][var2 - 1];
        } else if (var3 > 0 && var2 > 0
            && GlobalStatics_4.heightMap[var0][-1 + var3][var2 - 1]
            != GlobalStatics_4.heightMap[var0 - 1][-1 + var3][var2 - 1]) {
          GlobalStatics_4.heightMap[var0][var3][var2] =
              GlobalStatics_4.heightMap[var0][-1 + var3][var2 - 1];
        }
      } else if (var3 > 0 &&
          GlobalStatics_4.heightMap[var0][var3 - 1][var2] != 0) {
        GlobalStatics_4.heightMap[var0][var3][var2] =
            GlobalStatics_4.heightMap[var0][var3 - 1][var2];
      } else if (var2 > 0
          && GlobalStatics_4.heightMap[var0][var3][var2 - 1] != 0) {
        GlobalStatics_4.heightMap[var0][var3][var2] =
            GlobalStatics_4.heightMap[var0][var3][var2 - 1];
      } else if (var3 > 0 && var2 > 0
          && GlobalStatics_4.heightMap[var0][var3 - 1][var2 - 1] != 0) {
        GlobalStatics_4.heightMap[var0][var3][var2] =
            GlobalStatics_4.heightMap[var0][var3 - 1][var2 - 1];
      }
    }
  }

  public static void method871(byte var0) {
    GameStringStatics.aClass94_321 = null;
    GameStringStatics.aClass94_327 = null;
    GameStringStatics.aClass94_331 = null;
    GlobalStatics_9.aClass153_322 = null;
    GlobalStatics_9.aClass153_323 = null;
    GameStringStatics.aClass94_325 = null;
    int var1 = -93 / ((2 - var0) / 50);
  }

  public static int method872(int var0, int var1, int var2) {
    Inventory var3 = (Inventory) GlobalStatics_2.aClass130_2220.get(var1);
    return var3 == null ?
        0 :
        var0 >= ~var2 && var2 < var3.counts.length ? var3.counts[var2] : 0;
  }

  public static void method1011() {
    GlobalStatics_9.anIntArray623 = null;
    GlobalStatics_9.anIntArray622 = null;
    GlobalStatics_9.anIntArray614 = null;
    GlobalStatics_9.anIntArray630 = null;
    GlobalStatics_9.anIntArray628 = null;
    SceneStatics.anIntArrayArray619 = null;
    SceneStatics.anIntArrayArray620 = null;
  }

  public static void method1715() {
    SomethingSoundEffectStatics.anIntArray1598 = null;
    SomethingSoundEffectStatics.anIntArray1594 = null;
    SomethingSoundEffectStatics.anIntArray1591 = null;
    SomethingSoundEffectStatics.anIntArray1601 = null;
    SomethingSoundEffectStatics.anIntArray1602 = null;
    SomethingSoundEffectStatics.anIntArray1603 = null;
    SomethingSoundEffectStatics.anIntArray1599 = null;
    SomethingSoundEffectStatics.anIntArray1600 = null;
  }

  public static void method1342(int[] var0, int[] var1, Player var2, byte var3,
      int[] var4) {
    int var5 = 0;
    if (var3 > -97) {
      GlobalStatics_9.method1343(true);
    }

    while (var1.length > var5) {
      int var6 = var1[var5];
      int var7 = var4[var5];
      int var8 = var0[var5];

      for (int var9 = 0; var7 != 0 && var9 < var2.aClass145Array2809.length;
          var7 >>>= 1) {
        if ((1 & var7) != 0) {
          if (var6 == -1) {
            var2.aClass145Array2809[var9] = null;
          } else {
            AnimationSequence var10 = GlobalStatics_8
                .method45(var6, (byte) -20);
            int var11 = var10.anInt1845;
            Unsure var12 = var2.aClass145Array2809[var9];
            if (var12 != null) {
              if (var6 == var12.anInt1890) {
                if (var11 == 0) {
                  var12 = var2.aClass145Array2809[var9] = null;
                } else {
                  if (var11 == 1) {
                    var12.anInt1894 = 0;
                    var12.anInt1891 = 1;
                    var12.anInt1893 = 0;
                    var12.anInt1900 = var8;
                    var12.anInt1897 = 0;
                    GlobalStatics_4
                        .method1470(var2.sceneY, var10, 183921384,
                            var2.sceneX,
                            var2 == GlobalStatics_9.localPlayer, 0);
                  } else if (var11 == 2) {
                    var12.anInt1894 = 0;
                  }
                }
              } else if (var10.anInt1857 >= GlobalStatics_8
                  .method45(var12.anInt1890,
                      (byte) -20).anInt1857) {
                var12 = var2.aClass145Array2809[var9] = null;
              }
            }

            if (var12 == null) {
              var12 = var2.aClass145Array2809[var9] = new Unsure();
              var12.anInt1890 = var6;
              var12.anInt1891 = 1;
              var12.anInt1897 = 0;
              var12.anInt1900 = var8;
              var12.anInt1893 = 0;
              var12.anInt1894 = 0;
              GlobalStatics_4
                  .method1470(var2.sceneY, var10, 183921384, var2.sceneX,
                      var2 == GlobalStatics_9.localPlayer, 0);
            }
          }
        }

        ++var9;
      }

      ++var5;
    }
  }

  public static void method1343(boolean var0) {
    GlobalStatics_9.aClass109_Sub1_2631 = null;
    GlobalStatics_9.aShortArrayArray2634 = null;
  }

  public static AbstractDirectColorSprite method1344(int var0,
      FileUnpacker var1, int var2) {
    if (var0 < 29) {
      GLStatics.sceneGraphTiles = null;
    }

    return GlobalStatics_9.loadSprites(var1, var2) ? GLStatics.method1062(99)
        : null;
  }

  public static void method1345(int var0) {
    GameStringStatics.aClass94_2641 = null;
    if (var0 >= -38) {
      GlobalStatics_9.method1344(93, null, -70);
    }

    GlobalStatics_9.anIntArray2642 = null;
    GLStatics.sceneGraphTiles = null;
    GlobalStatics_9.aClass33_2648 = null;
    GlobalStatics_9.aClass33_2637 = null;
    GlobalStatics_9.fileUnpacker6 = null;
    GlobalStatics_9.anIntArray2639 = null;
  }

  public static void method1346(int var0) {
    GlobalStatics_9.method174(4096, 5);
    DummyClass35.method1027(5);
    GlobalStatics_6.method465(5, true);
    GlobalStatics_6.method474(2, 5);
    GlobalStatics_9.method2025((byte) -62, 5);
    GlobalStatics_9.method1711(5, var0 - 25956);
    GlobalStatics_6.method137(5, (byte) -118);
    GlobalStatics_6.method386(5, var0 ^ -26138);
    com.jagex.runescape.statics.GlobalStatics_0.method795((byte) 14, 5);
    GlobalStatics_9.method539(0, 5);
    GlobalStatics_10.method188(5, 0);
    GlobalStatics_9.method2260(var0 - 27256, 5);
    GlobalStatics_7.method594(var0 - 26090, 5);
    GlobalStatics_7.method595(5, 109);
    GlobalStatics_9.method820(5, 64);
    GlobalStatics_9.method953(-13508, 50);
    GlobalStatics_10.method269(-5, 5);
    DummyClass49.method1366(104, 5);
    GlobalStatics_9.aClass93_3130.method1522(-125, 5);
    GlobalStatics_9.aClass93_1135.method1522(var0 ^ -26142, 5);
  }

  public static AbstractDirectColorSprite[] method1347(int var0) {
    if (var0 == -26802) {
      AbstractDirectColorSprite[] var1 = new AbstractDirectColorSprite[DummyClass53.spriteCount];

      for (int var2 = 0; DummyClass53.spriteCount > var2; ++var2) {
        byte[] var4 = DummyClass5.aByteArrayArray2987[var2];
        int var3 = GlobalStatics_10.anIntArray3076[var2]
            * GlobalStatics_9.anIntArray2931[var2];
        if (GlobalStatics_9.aBooleanArray3272[var2]) {
          int[] var6 = new int[var3];
          byte[] var5 = DummyClass4.aByteArrayArray3005[var2];

          for (int var7 = 0; var3 > var7; ++var7) {
            var6[var7] = GlobalStatics_10.anIntArray3446[(int) var4[var7] & 255]
                | -16777216 & var5[var7] << 24;
          }

          if (GlRenderer.USE_OPENGL) {
            var1[var2] = new GlDirectFullColorSprite(
                GlobalStatics_9.anInt2426,
                GlobalStatics_9.anInt1748,
                GlobalStatics_9.anIntArray2048[var2],
                com.jagex.runescape.statics.GlobalStatics_0.anIntArray2591[var2],
                GlobalStatics_9.anIntArray2931[var2],
                GlobalStatics_10.anIntArray3076[var2], var6);
          } else {
            var1[var2] = new SoftwareDirectFullColorSprite(
                GlobalStatics_9.anInt2426,
                GlobalStatics_9.anInt1748,
                GlobalStatics_9.anIntArray2048[var2],
                com.jagex.runescape.statics.GlobalStatics_0.anIntArray2591[var2],
                GlobalStatics_9.anIntArray2931[var2],
                GlobalStatics_10.anIntArray3076[var2], var6);
          }
        } else {
          int[] var9 = new int[var3];

          for (int var10 = 0; var10 < var3; ++var10) {
            var9[var10] = GlobalStatics_10.anIntArray3446[(int) var4[var10]
                & 255];
          }

          if (GlRenderer.USE_OPENGL) {
            var1[var2] =
                new GlDirectColorSprite(GlobalStatics_9.anInt2426,
                    GlobalStatics_9.anInt1748,
                    GlobalStatics_9.anIntArray2048[var2],
                    com.jagex.runescape.statics.GlobalStatics_0.anIntArray2591[var2],
                    GlobalStatics_9.anIntArray2931[var2],
                    GlobalStatics_10.anIntArray3076[var2], var9);
          } else {
            var1[var2] = new SoftwareDirectColorSprite(
                GlobalStatics_9.anInt2426,
                GlobalStatics_9.anInt1748,
                GlobalStatics_9.anIntArray2048[var2],
                com.jagex.runescape.statics.GlobalStatics_0.anIntArray2591[var2],
                GlobalStatics_9.anIntArray2931[var2],
                GlobalStatics_10.anIntArray3076[var2], var9);
          }
        }
      }

      DummyClass37.method1035((byte) 106);
      return var1;
    } else {
      return null;
    }
  }

  public static void method1348(byte var0) {
    GlobalStatics_9.animationFrames = null;
    if (var0 != 100) {
      GlobalStatics_9.method1347(-79);
    }

    GameStringStatics.aClass94_2653 = null;
    GlobalStatics_9.aClass3_Sub28_Sub16Array2656 = null;
  }

  public static void method1349() {
    int var1;
    for (var1 = 0; GlobalStatics_9.anInt997 > var1; ++var1) {
      int var2 = DummyClass60.anIntArray441[var1];
      NPC var3 = GlobalStatics_8.NPCS[var2];
      int var4 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      if ((var4 & 8) != 0) {
        var4 += GlobalStatics_9.GAME_BUFFER.readUnsignedByte() << 8;
      }

      int var5;
      int var6;
      if ((64 & var4) != 0) {
        var5 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
        var6 = GlobalStatics_9.GAME_BUFFER.method786(true);
        var3.method1970(var6, -8, GlobalStatics_4.updateCycle, var5);
        var3.anInt2781 = 300 + GlobalStatics_4.updateCycle;
        var3.anInt2775 = GlobalStatics_9.GAME_BUFFER.method754(true);
      }

      if ((var4 & 2) != 0) {
        var5 = GlobalStatics_9.GAME_BUFFER.method786(true);
        var6 = GlobalStatics_9.GAME_BUFFER.method754(true);
        var3.method1970(var6, -8, GlobalStatics_4.updateCycle, var5);
      }

      if ((var4 & 16) != 0) {
        var5 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
        var6 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
        if (var5 == 0xffff) {
          var5 = -1;
        }

        com.jagex.runescape.statics.GlobalStatics_0
            .method1772(var6, var5, 39, var3);
      }

      if ((var4 & 4) != 0) {
        var3.anInt2772 = GlobalStatics_9.GAME_BUFFER
            .readUnsignedShortAdd();
        if (var3.anInt2772 == 65535) {
          var3.anInt2772 = -1;
        }
      }

      if ((var4 & 128) != 0) {
        var5 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortAdd();
        if (var5 == 0xffff) {
          var5 = -1;
        }

        var6 = GlobalStatics_9.GAME_BUFFER.method782(-46);
        boolean var7 = true;
        if (var5 != -1 && var3.anInt2842 != -1 &&
            GlobalStatics_8
                .method45(GlobalStatics_9.method898((byte) 42, var5).anInt542,
                    (byte) -20).anInt1857 < GlobalStatics_8.method45(
                GlobalStatics_9.method898((byte) 42, var3.anInt2842).anInt542,
                (byte) -20).anInt1857) {
          var7 = false;
        }

        if (var7) {
          var3.anInt2842 = var5;
          var3.anInt2759 = (0xffff & var6) + GlobalStatics_4.updateCycle;
          var3.anInt2761 = 0;
          var3.anInt2805 = 0;
          var3.anInt2799 = var6 >> 16;
          var3.anInt2826 = 1;
          if (var3.anInt2759 > GlobalStatics_4.updateCycle) {
            var3.anInt2805 = -1;
          }

          if (var3.anInt2842 != -1
              && var3.anInt2759 == GlobalStatics_4.updateCycle) {
            int var8 = GlobalStatics_9
                .method898((byte) 42, var3.anInt2842).anInt542;
            if (var8 != -1) {
              AnimationSequence var9 = GlobalStatics_8
                  .method45(var8, (byte) -20);
              if (var9.anIntArray1851 != null) {
                GlobalStatics_4.method1470(var3.sceneY, var9, 183921384,
                    var3.sceneX, false,
                    0);
              }
            }
          }
        }
      }

      if ((1 & var4) != 0) {
        if (var3.config.method1474(-1)) {
          GlobalStatics_6.method574(var3, false);
        }

        var3.setConfiguration(-1,
            GlobalStatics_2.getNpcConfiguration(
                GlobalStatics_9.GAME_BUFFER.readUnsignedShortLE()));
        var3.method1976(var3.config.size, 2);
        var3.renderAnimationId = var3.config.renderAnimationId;
        if (var3.config.method1474(-1)) {
          GlobalStatics_9.method1286(var3.waypointsY[0], false, null, 0, var3,
              var3.waypointsX[0],
              GlobalStatics_9.currentPlane, null);
        }
      }

      if ((var4 & 32) != 0) {
        var3.aClass94_2825 = GlobalStatics_9.GAME_BUFFER.readString();
        var3.anInt2814 = 100;
      }

      if ((256 & var4) != 0) {
        var5 = GlobalStatics_9.GAME_BUFFER.method786(true);
        int[] var12 = new int[var5];
        int[] var13 = new int[var5];
        int[] var14 = new int[var5];

        for (int var15 = 0; var15 < var5; ++var15) {
          int var10 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortLE();
          if (var10 == 0xffff) {
            var10 = -1;
          }

          var12[var15] = var10;
          var13[var15] = GlobalStatics_9.GAME_BUFFER.method754(true);
          var14[var15] = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
        }

        GlobalStatics_9.method273(var14, (byte) 92, var3, var13, var12);
      }

      if ((var4 & 512) != 0) {
        var3.anInt2786 = GlobalStatics_9.GAME_BUFFER
            .readUnsignedShortAdd();
        var3.anInt2762 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
      }
    }
  }

  public static void method1350(byte var0) {
    GlobalStatics_9.anIntArray2664 = null;
    GameStringStatics.aClass94_2662 = null;
    GameStringStatics.aClass94_2665 = null;
    if (var0 != 75) {
      GlobalStatics_9.method1350((byte) -116);
    }

    GameStringStatics.aClass94_2667 = null;
    GlobalStatics_9.PACKET_LENGTHS = null;
    GlobalStatics_9.anIntArray2663 = null;
  }

  public static boolean loadSprites(FileUnpacker var0, int var1, int var2,
      int var3) {
    byte[] var4 = var0.getBytes(var2, var1);
    if (var3 != -30901) {
      GameStringStatics.aClass94_2662 = null;
    }

    if (var4 != null) {
      DummyClass38.loadSprites(var4, 98);
      return true;
    } else {
      return false;
    }
  }

  public static void method1352(int var0, boolean var1, int var2, int var3,
      int var4) {
    if (GlobalStatics_11.method57(var3, 104)) {
      GlobalStatics_5.method2183(var2, var1, var4, 235, var0,
          GlobalStatics_9.aClass11ArrayArray1834[var3]);
    }
  }

  public static void method1353(SoftwareDirectColorSprite[] var0, int var1,
      FileUnpacker var2) {
    GlobalStatics_10.worldMaps = var2;
    GlobalStatics_9.aClass3_Sub28_Sub16_Sub2Array1839 = var0;
    if (var1 == -11931) {
      GlobalStatics_6.aBooleanArray3503 =
          new boolean[GlobalStatics_9.aClass3_Sub28_Sub16_Sub2Array1839.length];
      DummyClass21.aClass61_1758.clear(-68);
      int var3 = GlobalStatics_10.worldMaps
          .getFileId(GlobalStatics_6.DETAILS);
      int[] var4 = GlobalStatics_10.worldMaps.getChildIds(var3);

      assert var4 != null;
      for (int i : var4) {
        DummyClass21.aClass61_1758.addLast(DummyClass23.method1747(
            new Buffer(GlobalStatics_10.worldMaps.getBytes(var3, i))
        ));
      }

    }
  }

  public static void method1354(int var0, int var1, boolean var2, int var3,
      int var4) {
    if (var4 >= DummyClass13.anInt2020 && var4 <= GlobalStatics_9.anInt902) {
      var0 =
          DummyClass59.method1040(GlTexture2d.anInt3765, var0, (byte) 0,
              DummyClass55.anInt1425);
      var3 =
          DummyClass59.method1040(GlTexture2d.anInt3765, var3, (byte) 0,
              DummyClass55.anInt1425);
      GlobalStatics_10.method320(var1, var4, var3, (byte) -123, var0);
    }

    if (!var2) {
      GameStringStatics.aClass94_2665 = null;
    }
  }

  public static void resetFrameRegulator() {
    GlobalStatics_9.frameRateRegulator.reset(-124);
    int var1;
    for (var1 = 0; var1 < 32; ++var1) {
      DummyClass5.drawMemory[var1] = 0L;
    }
    for (var1 = 0; var1 < 32; ++var1) {
      DummyClass21.updateMemory[var1] = 0L;
    }
    GlobalStatics_9.cycles = 0;
  }

  public static void method1751(byte var0) {
    GlobalStatics_9.aClass13_1666 = null;
    GlobalStatics_9.client = null;
    GameString.OK = null;
    GlobalStatics_9.anIntArray1662 = null;
    GlobalStatics_9.p12Font = null;
  }

  public static void method370(byte var0) {
    int var1 = -125 / ((0 - var0) / 59);
    DummyClass14.aClass93_1955.method1524(3);
  }

  public static SomethingWorldMapy method371(int var0, GameString var1) {
    if (var0 != 2) {
      GlobalStatics_9.clear86(false);
    }

    for (
        SomethingWorldMapy var2 = (SomethingWorldMapy) DummyClass21.aClass61_1758
            .getFirst();
        var2 != null;
        var2 = (SomethingWorldMapy) DummyClass21.aClass61_1758.getNext()) {
      if (var2.aClass94_3561.method1528((byte) -42, var1)) {
        return var2;
      }
    }

    return null;
  }

  public static void clear86(boolean var0) {
    GameStringStatics.COMMAND_TWEEN = null;
    if (var0) {
      GlobalStatics_9.aClass93_2428 = null;
      GlobalStatics_9.GAME_SOCKET = null;
    }
  }

  public static void method374(int var0, boolean var1, byte[] var2, int var3,
      int var4,
      CollisionMap[] var5) {
    Buffer var6 = new Buffer(var2);
    int var7 = -1;

    while (true) {
      int var8 = var6.method773((byte) -126);
      if (var8 == 0) {
        if (var4 != 0) {
          GlobalStatics_9.clear86(true);
        }

        return;
      }

      var7 += var8;
      int var9 = 0;

      while (true) {
        int var10 = var6.readUnsignedShortSmart();
        if (var10 == 0) {
          break;
        }

        var9 += var10 - 1;
        int var11 = var9 & 63;
        int var13 = var9 >> 12;
        int var12 = var9 >> 6 & 63;
        int var14 = var6.readUnsignedByte();
        int var15 = var14 >> 2;
        int var16 = var14 & 3;
        int var17 = var0 + var12;
        int var18 = var11 + var3;
        if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
          CollisionMap var19 = null;
          if (!var1) {
            int var20 = var13;
            if ((2 & GlobalStatics_10.tileFlags[1][var17][var18]) == 2) {
              var20 = var13 - 1;
            }

            if (var20 >= 0) {
              var19 = var5[var20];
            }
          }

          DummyClass31
              .method1683(var13, !var1, var13, var1, var19, var7, var15, var17,
                  (byte) 50,
                  var18, var16);
        }
      }
    }
  }

  public static void method394(int var0, int var1) {
    GlobalStatics_10.anInt3285 = var0;
    GlobalStatics_9.method383(-32584, 3);
    GlobalStatics_9.method383(-32584, 4);
    if (var1 <= 83) {
      GlobalStatics_9.method395(null, -43, -61, -51, 101, -106, -58, true);
    }
  }

  public static void method395(SomethingSceneTile var0, int var1, int var2,
      int var3, int var4,
      int var5, int var6, boolean var7) {
    int var8 = var0.anIntArray627.length;

    int var9;
    int var10;
    int var11;
    int var12;
    int var13;
    for (var9 = 0; var9 < var8; ++var9) {
      var10 = var0.anIntArray627[var9] - GlobalStatics_9.CAMERA_X;
      var11 = var0.anIntArray615[var9] - GlobalStatics_7.CAMERA_Y;
      var12 = var0.anIntArray618[var9] - GlobalStatics_9.CAMERA_Z;
      var13 = var12 * var3 + var10 * var4 >> 16;
      var12 = var12 * var4 - var10 * var3 >> 16;
      var10 = var13;
      var13 = var11 * var2 - var12 * var1 >> 16;
      var12 = var11 * var1 + var12 * var2 >> 16;
      if (var12 < 50) {
        return;
      }

      if (var0.anIntArray616 != null) {
        GlobalStatics_9.anIntArray614[var9] = var10;
        GlobalStatics_9.anIntArray630[var9] = var13;
        GlobalStatics_9.anIntArray628[var9] = var12;
      }

      GlobalStatics_9.anIntArray623[var9] =
          DummyClass40.anInt846 + (var10 << 9) / var12;
      GlobalStatics_9.anIntArray622[var9] =
          DummyClass40.anInt835 + (var13 << 9) / var12;
    }

    DummyClass40.anInt850 = 0;
    var8 = var0.anIntArray624.length;

    for (var9 = 0; var9 < var8; ++var9) {
      var10 = var0.anIntArray624[var9];
      var11 = var0.anIntArray617[var9];
      var12 = var0.anIntArray613[var9];
      var13 = GlobalStatics_9.anIntArray623[var10];
      int var14 = GlobalStatics_9.anIntArray623[var11];
      int var15 = GlobalStatics_9.anIntArray623[var12];
      int var16 = GlobalStatics_9.anIntArray622[var10];
      int var17 = GlobalStatics_9.anIntArray622[var11];
      int var18 = GlobalStatics_9.anIntArray622[var12];
      if ((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14)
          > 0) {
        if (GlobalStatics_10.aBoolean3261 && GlobalStatics_10.method185(
            GlobalStatics_9.anInt819 + DummyClass40.anInt846,
            GlobalStatics_10.anInt4039 + DummyClass40.anInt835, var16, var17,
            var18, var13, var14,
            var15)) {
          DummyClass32.anInt515 = var5;
          GlobalStatics_9.anInt999 = var6;
        }

        if (!GlRenderer.USE_OPENGL && !var7) {
          DummyClass40.aBoolean849 =
              var13 < 0 || var14 < 0 || var15 < 0
                  || var13 > DummyClass40.anInt847
                  || var14 > DummyClass40.anInt847
                  || var15 > DummyClass40.anInt847;

          if (var0.anIntArray616 != null && var0.anIntArray616[var9] != -1) {
            if (SettingsStatics.aBoolean3275) {
              if (var0.aBoolean629) {
                DummyClass40
                    .method1135(var16, var17, var18, var13, var14, var15,
                        var0.anIntArray625[var9], var0.anIntArray632[var9],
                        var0.anIntArray631[var9],
                        GlobalStatics_9.anIntArray614[0],
                        GlobalStatics_9.anIntArray614[1],
                        GlobalStatics_9.anIntArray614[3],
                        GlobalStatics_9.anIntArray630[0],
                        GlobalStatics_9.anIntArray630[1],
                        GlobalStatics_9.anIntArray630[3],
                        GlobalStatics_9.anIntArray628[0],
                        GlobalStatics_9.anIntArray628[1],
                        GlobalStatics_9.anIntArray628[3],
                        var0.anIntArray616[var9]);
              } else {
                DummyClass40
                    .method1135(var16, var17, var18, var13, var14, var15,
                        var0.anIntArray625[var9], var0.anIntArray632[var9],
                        var0.anIntArray631[var9],
                        GlobalStatics_9.anIntArray614[var10],
                        GlobalStatics_9.anIntArray614[var11],
                        GlobalStatics_9.anIntArray614[var12],
                        GlobalStatics_9.anIntArray630[var10],
                        GlobalStatics_9.anIntArray630[var11],
                        GlobalStatics_9.anIntArray630[var12],
                        GlobalStatics_9.anIntArray628[var10],
                        GlobalStatics_9.anIntArray628[var11],
                        GlobalStatics_9.anIntArray628[var12],
                        var0.anIntArray616[var9]);
              }
            } else {
              int var19 = GLStatics.textureCache
                  .method15(var0.anIntArray616[var9], 0xffff);
              DummyClass40.method1154(var16, var17, var18, var13, var14, var15,
                  DummyClass2.repackHSL(var19, var0.anIntArray625[var9]),
                  DummyClass2.repackHSL(var19, var0.anIntArray632[var9]),
                  DummyClass2.repackHSL(var19, var0.anIntArray631[var9]));
            }
          } else if (var0.anIntArray625[var9] != 12345678) {
            DummyClass40.method1154(var16, var17, var18, var13, var14, var15,
                var0.anIntArray625[var9], var0.anIntArray632[var9],
                var0.anIntArray631[var9]);
          }
        }
      }
    }

  }

  public static void method396(int var0) {
    if (var0 != 0) {
      GlobalStatics_9.method397((byte) 35);
    }

    GlobalStatics_9.audioOutputStream1 = null;
    GameStringStatics.aClass94_2498 = null;
    GameStringStatics.aClass94_2496 = null;
  }

  public static void method397(byte var0) {
    GlobalStatics_9.aClass93_1569.method1524(3);
    GlobalStatics_9.aClass93_2428.method1524(3);
    if (var0 != -41) {
      GlobalStatics_9.method394(14, 52);
    }

    GlobalStatics_6.aClass93_743.method1524(3);
  }

  public static void method539(int var0, int var1) {
    if (var0 != 0) {
      GlobalStatics_9.clear3((byte) 73);
    }

    GlobalStatics_9.aClass93_1772.method1522(var0 ^ -126, var1);
  }

  public static void method541(byte var0, boolean var1, GameString var2) {
    var2 = var2.method1534();
    int var4 = 0;
    int var5 = -26 / ((62 - var0) / 58);
    short[] var3 = new short[16];
    int var6 = var1 ? 0x8000 : 0;
    int var7 =
        (var1 ? GlobalStatics_9.anInt377 : GlobalStatics_9.anInt1156) + var6;

    for (int var8 = var6; var8 < var7; ++var8) {
      SomethingQuickChat var9 = com.jagex.runescape.statics.GlobalStatics_0
          .method733(12345678, var8);
      if (var9.aBoolean3568 &&
          Objects.requireNonNull(var9.method554(-1)).method1534().indexOf(var2)
              != -1) {
        if (var4 >= 50) {
          GlobalStatics_8.anInt952 = -1;
          DummyClass54.aShortArray1398 = null;
          return;
        }

        if (var4 >= var3.length) {
          short[] var10 = new short[2 * var3.length];

          for (int var11 = 0; var4 > var11; ++var11) {
            var10[var11] = var3[var11];
          }

          var3 = var10;
        }

        var3[var4++] = (short) var8;
      }
    }

    DummyClass54.aShortArray1398 = var3;
    GlobalStatics_8.anInt952 = var4;
    GlobalStatics_9.anInt2756 = 0;
    GameString[] var13 = new GameString[GlobalStatics_8.anInt952];

    for (int var14 = 0; GlobalStatics_8.anInt952 > var14; ++var14) {
      var13[var14] = com.jagex.runescape.statics.GlobalStatics_0
          .method733(12345678, var3[var14]).method554(-1);
    }

    GlobalStatics_9.method307(var13, DummyClass54.aShortArray1398, 100);
  }

  public static void clear3(byte var0) {
    if (var0 != -46) {
      GlobalStatics_9.anInt3552 = 7;
    }

    GlobalStatics_9.aClass11_3551 = null;
  }

  public static int method543(int var0, int var1, byte var2) {
    if (var2 > -71) {
      return -52;
    } else {
      int var3 =
          GlobalStatics_9.method1984(var0 - 1, 38, -1 + var1) + GlobalStatics_9
              .method1984(1 + var0, 38,
                  -1 + var1) - (
              -GlobalStatics_9.method1984(-1 + var0, 38, var1 + 1)
                  - GlobalStatics_9
                  .method1984(var0 + 1, 38,
                      var1 + 1));
      int var4 =
          GlobalStatics_9.method1984(var0 - 1, 38, var1) + GlobalStatics_9
              .method1984(var0 + 1, 38, var1) + GlobalStatics_9
              .method1984(var0, 38, -1 + var1) + GlobalStatics_9
              .method1984(var0, 38, 1 + var1);
      int var5 = GlobalStatics_9.method1984(var0, 38, var1);
      return var4 / 8 + var3 / 16 + var5 / 4;
    }
  }

  public static boolean method544(int var0, int var1) {
    return var0 != -49 || var1 >= 48 && var1 <= 57;
  }

  public static int method107(FileUnpacker var0, byte var1) {
    int var2 = 0;
    if (var0.isLoaded(GlobalStatics_8.anInt2104)) {
      ++var2;
    }

    if (var0.isLoaded(GlobalStatics_10.anInt4042)) {
      ++var2;
    }

    if (var0.isLoaded(GlobalStatics_1.anInt2195)) {
      ++var2;
    }

    if (var0.isLoaded(GlobalStatics_2.anInt2575)) {
      ++var2;
    }

    if (var0.isLoaded(GlobalStatics_9.headIconsPrayerFileId)) {
      ++var2;
    }

    if (var0.isLoaded(GlobalStatics_9.hintHeadIconsFileId)) {
      ++var2;
    }

    if (var0.isLoaded(GlobalStatics_9.anInt2689)) {
      ++var2;
    }

    if (var1 > -124) {
      GlobalStatics_9.clear41(68);
    }

    if (var0.isLoaded(GlobalStatics_10.anInt3061)) {
      ++var2;
    }

    if (var0.isLoaded(GlobalStatics_9.anInt2633)) {
      ++var2;
    }

    if (var0.isLoaded(DummyClass59.anInt678)) {
      ++var2;
    }

    if (var0.isLoaded(GlobalStatics_9.anInt2436)) {
      ++var2;
    }

    if (var0.isLoaded(GlTexture2d.anInt3757)) {
      ++var2;
    }

    if (var0.isLoaded(DummyClass38.floorShadowsFileId)) {
      ++var2;
    }

    if (var0.isLoaded(GlobalStatics_9.anInt1325)) {
      ++var2;
    }

    if (var0.isLoaded(GlobalStatics_9.anInt2471)) {
      ++var2;
    }

    return var2;
  }

  public static void clear41(int var0) {
    GameStringStatics.aClass94_2255 = null;
    GameStringStatics.aClass94_2260 = null;
    GameStringStatics.aClass94_2252 = null;
    if (var0 != 2) {
      GlobalStatics_9.clear41(-22);
    }

    GlobalStatics_9.fileUnpacker25 = null;
  }

  public static void initializeScene(int regionLevels, int sceneWidth,
      int sceneHeight, int viewportSize) {
    GlobalStatics_4.REGION_WIDTH = sceneWidth;
    GlobalStatics_1.REGION_HEIGHT = sceneHeight;
    GLStatics.CURRENT_VIEWPORT_SIZE = viewportSize;
    GlobalStatics_9.tiles =
        new SceneGraphTile[regionLevels][GlobalStatics_4.REGION_WIDTH][GlobalStatics_1.REGION_HEIGHT];
    DummyClass43.somethingHeightMap =
        new int[regionLevels][GlobalStatics_4.REGION_WIDTH + 1][
            GlobalStatics_1.REGION_HEIGHT + 1];
    if (GlRenderer.USE_OPENGL) {
      GLStatics.aClass3_Sub11ArrayArray2199 = new SomethingGl0[4][];
    }

    GlobalStatics_9.aClass3_Sub2ArrayArrayArray2065 =
        new SceneGraphTile[1][GlobalStatics_4.REGION_WIDTH][GlobalStatics_1.REGION_HEIGHT];
    GlobalStatics_10.anIntArrayArray3115 =
        new int[GlobalStatics_4.REGION_WIDTH][GlobalStatics_1.REGION_HEIGHT];
    GlobalStatics_2.othrrHeightMap =
        new int[1][GlobalStatics_4.REGION_WIDTH + 1][
            GlobalStatics_1.REGION_HEIGHT
                + 1];
    if (GlRenderer.USE_OPENGL) {
      GlobalStatics_10.aClass3_Sub11ArrayArray3346 = new SomethingGl0[1][];
    }

    DummyClass10.method2264(false);
    GlobalStatics_6.aClass113Array3610 = new SomethingLight0[500];
    GlobalStatics_9.anInt2249 = 0;
    GlobalStatics_10.aClass113Array1895 = new SomethingLight0[500];
    GlobalStatics_9.anInt1672 = 0;
    DummyClass50.anIntArrayArrayArray1142 =
        new int[regionLevels][GlobalStatics_4.REGION_WIDTH + 1][
            GlobalStatics_1.REGION_HEIGHT + 1];
    GlobalStatics_3.aClass25Array1868 = new SceneSomething[5000];
    GlobalStatics_10.anInt3070 = 0;
    GlobalStatics_7.aClass25Array4060 = new SceneSomething[100];
    GLStatics.adjacentTileOnScreen =
        new boolean[GLStatics.CURRENT_VIEWPORT_SIZE
            + GLStatics.CURRENT_VIEWPORT_SIZE + 1][
            GLStatics.CURRENT_VIEWPORT_SIZE + GLStatics.CURRENT_VIEWPORT_SIZE
                + 1];
    GlobalStatics_9.tileOnScreen =
        new boolean[GLStatics.CURRENT_VIEWPORT_SIZE
            + GLStatics.CURRENT_VIEWPORT_SIZE + 2][
            GLStatics.CURRENT_VIEWPORT_SIZE + GLStatics.CURRENT_VIEWPORT_SIZE
                + 2];
    GlobalStatics_9.aByteArrayArrayArray1774 =
        new byte[regionLevels][GlobalStatics_4.REGION_WIDTH][GlobalStatics_1.REGION_HEIGHT];
  }

  public static void method964(int var0) {
    GameStringStatics.aClass94_553 = null;
    GlobalStatics_9.GAME_BUFFER = null;
    if (var0 != 6) {
      GlobalStatics_9.method964(-57);
    }

    GameStringStatics.aClass94_550 = null;
    GameStringStatics.aClass94_547 = null;
    GameStringStatics.aClass94_551 = null;
    GameStringStatics.aClass94_552 = null;
  }

  public static void method967(int var0, int var1, int var2, int var3, int var4,
      int var5, int var6,
      int var7) {
    if (GlobalStatics_11.method57(var5, 104)) {
      if (var2 == 2) {
        GlobalStatics_8
            .method50(GlobalStatics_9.aClass11ArrayArray1834[var5], -1, var6,
                var1, var4, var7,
                var0, var3);
      }
    }
  }

  public static void method1950(Mobile var0, boolean var1) {
    int var2 = var0.anInt2800 - GlobalStatics_4.updateCycle;
    int var3 = 128 * var0.anInt2784 + 64 * var0.getSize();
    if (var1) {
      int var4 = 128 * var0.anInt2835 + var0.getSize() * 64;
      if (var0.anInt2840 == 0) {
        var0.anInt2806 = 1024;
      }

      var0.sceneX += (-var0.sceneX + var3) / var2;
      var0.sceneY += (var4 - var0.sceneY) / var2;
      if (var0.anInt2840 == 1) {
        var0.anInt2806 = 1536;
      }

      var0.anInt2824 = 0;
      if (var0.anInt2840 == 2) {
        var0.anInt2806 = 0;
      }

      if (var0.anInt2840 == 3) {
        var0.anInt2806 = 512;
      }

    }
  }

  public static int method1951(int var0, byte var1) {
    if (var1 > -67) {
      GlobalStatics_9.aBoolean2713 = false;
    }

    return var0 >>> 8;
  }

  public static GameWorld method1953(byte var0) {
    if (var0 <= 97) {
      GlobalStatics_3.BIT_MASKS = null;
    }

    GlobalStatics_9.anInt2291 = 0;
    return GlobalStatics_11.method1107(5422);
  }

  public static void method1954(int var0) {
    if (var0 == 0) {
      GameStringStatics.FLOOR_SHADOWS = null;
      GlobalStatics_9.FONT_P11 = null;
      GlobalStatics_3.BIT_MASKS = null;
      GameStringStatics.aClass94_2707 = null;
    }
  }

  public static void method1956(int var0, int var1, int var2, int var3) {
    SceneGraphTile var4 = GLStatics.sceneGraphTiles[var0][var1][var2];
    if (var4 != null) {
      SomethingSceneI var5 = var4.aClass19_2233;
      if (var5 != null) {
        var5.anInt430 = var5.anInt430 * var3 / 16;
        var5.anInt426 = var5.anInt426 * var3 / 16;
      }
    }
  }

  public static void method534(int var0) {
    GameStringStatics.aClass94_3546 = null;
    GameStringStatics.aClass94_3548 = null;
    GameStringStatics.aClass94_3543 = null;
    GameStringStatics.aClass94_3544 = null;
    GameStringStatics.aClass94_3547 = null;
    GameStringStatics.aClass94_3541 = null;
  }

  public static SomethingTexture3 method536(byte var0, Buffer var1) {
    if (var0 != 54) {
      GlobalStatics_9.method534(117);
    }

    return new SomethingTexture3(var1.method787((byte) 25),
        var1.method787((byte) 73),
        var1.method787((byte) 114), var1.method787((byte) 33),
        var1.method787((byte) 78),
        var1.method787((byte) 91), var1.method787((byte) 120),
        var1.method787((byte) 113),
        var1.readUnsignedMedium((byte) 115), var1.readUnsignedByte());
  }

  public static void method138(GameString var0, int var1) {
    GlobalStatics_9.method1250(var1 ^ 93, false);
    GlobalStatics_3.method1339(var0, var1 + var1);
  }

  public static void method139(int var0) {
    if (var0 >= 63) {
      GlobalStatics_0.aClass93_21.method1524(3);
      DummyClass54.aClass93_1401.method1524(3);
      GlobalStatics_9.aClass93_4051.method1524(3);
      DummyClass14.aClass93_1965.method1524(3);
    }
  }

  public static boolean method140(int var0, int var1) {
    return
        var0 >= 0 && GlobalStatics_6.aBooleanArray3503.length > var0
            && GlobalStatics_6.aBooleanArray3503[var0];
  }

  public static RenderAnimation getRenderAnimation(boolean var0, int var1) {
    RenderAnimation var2 = (RenderAnimation) DummyClass14.aClass93_1955.get(
        var1);
    if (var2 == null) {
      byte[] var3 = GlobalStatics_10.aClass153_1372.getBytes(32, var1);
      if (var0) {
        GlobalStatics_9.aByteArrayArrayArray2339 = null;
      }

      var2 = new RenderAnimation();
      if (var3 != null) {
        var2.method901(-1, new Buffer(var3));
      }

      var2.method899(96);
      DummyClass14.aClass93_1955.get((byte) -96, var2, var1);
      return var2;
    } else {
      return var2;
    }
  }

  public static void method142(boolean var0) {
    if (!var0) {
      GlobalStatics_9.aByteArrayArrayArray2339 = null;
    }

    GlobalStatics_7.aClass93_2982.method1524(3);
  }

  public static void method143(int var0) {
    GameStringStatics.aClass94_2340 = null;
    GlobalStatics_9.anIntArray2338 = null;
    GameStringStatics.aClass94_2336 = null;
    if (var0 <= -16) {
      GlobalStatics_9.aByteArrayArrayArray2339 = null;
    }
  }

  public static void method1611(boolean var1) {
    int var2;
    NPC var3;
    int var6;
    int var7;
    int var8;
    int var9;
    int var10;
    for (var2 = 0; var2 < DummyClass6.anInt2046; ++var2) {
      var3 = GlobalStatics_8.NPCS[GlobalStatics_2.anIntArray347[var2]];
      if (var3 != null
          && var3.hasConfiguration((byte) 17)
          && !var3.config.aBoolean1263 != var1
          && var3.config.method1472((byte) 74)) {
        int var4 = var3.getSize();
        int var5;
        if (var4 != 1) {
          if (((1 & var4) != 0 || (127 & var3.sceneX) == 0 &&
              (127 & var3.sceneY) == 0)
              && ((var4 & 1) != 1 || (127 & var3.sceneX) == 64 && (127
              & var3.sceneY) == 64)) {
            var5 = var3.sceneX - var4 * 64 >> 7;
            var6 = -(var4 * 64) + var3.sceneY >> 7;
            var7 = var3.getSize() + var5;
            if (var5 < 0) {
              var5 = 0;
            }

            if (var7 > 104) {
              var7 = 104;
            }

            var8 = var6 + var3.getSize();
            if (var6 < 0) {
              var6 = 0;
            }

            if (var8 > 104) {
              var8 = 104;
            }

            for (var9 = var5; var7 > var9; ++var9) {
              for (var10 = var6; var10 < var8; ++var10) {
                ++DummyClass9.anIntArrayArray4010[var9][var10];
              }
            }
          }
        } else if (
            (127 & var3.sceneX) == 64 && (var3.sceneY & 127) == 64) {
          var5 = var3.sceneX >> 7;
          var6 = var3.sceneY >> 7;
          if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
            ++DummyClass9.anIntArrayArray4010[var5][var6];
          }
        }
      }
    }

    label200:
    for (var2 = 0; var2 < DummyClass6.anInt2046; ++var2) {
      var3 = GlobalStatics_8.NPCS[GlobalStatics_2.anIntArray347[var2]];
      long var15 =
          (long) GlobalStatics_2.anIntArray347[var2] << 32 | 536870912L;
      if (var3 != null && var3.hasConfiguration((byte) 17)
          && !var3.config.aBoolean1263 == !var1
          && var3.config.method1472((byte) 74)) {
        var6 = var3.getSize();
        if (var6 != 1) {
          if ((var6 & 1) == 0 && (var3.sceneX & 127) == 0 &&
              (127 & var3.sceneY) == 0
              || (var6 & 1) == 1 && (var3.sceneX & 127) == 64
              && (127 & var3.sceneY) == 64) {
            var7 = -(64 * var6) + var3.sceneX >> 7;
            var8 = -(var6 * 64) + var3.sceneY >> 7;
            var10 = var8 + var6;
            if (var8 < 0) {
              var8 = 0;
            }

            boolean var11 = true;
            var9 = var7 + var6;
            if (var10 > 104) {
              var10 = 104;
            }

            if (var7 < 0) {
              var7 = 0;
            }

            if (var9 > 104) {
              var9 = 104;
            }

            int var12;
            int var13;
            for (var12 = var7; var12 < var9; ++var12) {
              for (var13 = var8; var13 < var10; ++var13) {
                if (DummyClass9.anIntArrayArray4010[var12][var13] <= 1) {
                  var11 = false;
                  break;
                }
              }
            }

            if (var11) {
              var12 = var7;

              while (true) {
                if (var12 >= var9) {
                  continue label200;
                }

                for (var13 = var8; var13 < var10; ++var13) {
                  --DummyClass9.anIntArrayArray4010[var12][var13];
                }

                ++var12;
              }
            }
          }
        } else if ((127 & var3.sceneX) == 64 && (127 & var3.sceneY)
            == 64) {
          var7 = var3.sceneX >> 7;
          var8 = var3.sceneY >> 7;
          if (var7 < 0 || var7 >= 104 || var8 < 0 || var8 >= 104) {
            continue;
          }

          if (DummyClass9.anIntArrayArray4010[var7][var8] > 1) {
            --DummyClass9.anIntArrayArray4010[var7][var8];
            continue;
          }
        }

        if (!var3.config.aBoolean1270) {
          var15 |= Long.MIN_VALUE;
        }

        var3.anInt2831 = GlobalStatics_6
            .method1736(GlobalStatics_9.currentPlane, 1, var3.sceneX,
                var3.sceneY);
        DummyClass29
            .addNodeToSceneGraph(GlobalStatics_9.currentPlane, var3.sceneX,
                var3.sceneY, var3.anInt2831, -64 + 64 * var6 + 60, var3,
                var3.rotationY, var15,
                var3.aBoolean2810);
      }
    }
  }

  public static void method1612(int var0) {
    GlobalStatics_9.localPlayer = null;
    if (var0 != -11565) {
      GlobalStatics_9.method1614(false, null, null);
    }

    GlobalStatics_9.anIntArray2125 = null;
    GameStringStatics.aClass94_2132 = null;
    GlobalStatics_9.aClass3_Sub28_Sub16_Sub2Array2140 = null;
    GlobalStatics_9.aClass135Array2131 = null;
  }

  public static void method1614(boolean var0, long[] var1, int[] var2) {
    GlobalStatics_4.method1069(var1, 0, -1 + var1.length, var2, -24337);
    if (!var0) {
      GlobalStatics_9.method1612(103);
    }
  }

  public static void method1617(int var0, int var1, int var2, int var3,
      int var4, byte var5) {
    if (var4 <= GlobalStatics_9.anInt902 && var2
        >= DummyClass13.anInt2020) {
      boolean var6;
      if (DummyClass55.anInt1425 <= var1) {
        if (GlTexture2d.anInt3765 >= var1) {
          var6 = true;
        } else {
          var6 = false;
          var1 = GlTexture2d.anInt3765;
        }
      } else {
        var6 = false;
        var1 = DummyClass55.anInt1425;
      }

      boolean var7;
      if (var3 < DummyClass55.anInt1425) {
        var3 = DummyClass55.anInt1425;
        var7 = false;
      } else if (var3 > GlTexture2d.anInt3765) {
        var3 = GlTexture2d.anInt3765;
        var7 = false;
      } else {
        var7 = true;
      }

      if (DummyClass13.anInt2020 > var4) {
        var4 = DummyClass13.anInt2020;
      } else {
        GlobalStatics_10
            .method282(DummyClass35.anIntArrayArray663[var4++], var1, -66, var3,
                var0);
      }

      if (var2 <= GlobalStatics_9.anInt902) {
        GlobalStatics_10
            .method282(DummyClass35.anIntArrayArray663[var2--], var1, -54, var3,
                var0);
      } else {
        var2 = GlobalStatics_9.anInt902;
      }

      int var8;
      if (var6 && var7) {
        for (var8 = var4; var8 <= var2; ++var8) {
          int[] var9 = DummyClass35.anIntArrayArray663[var8];
          var9[var1] = var9[var3] = var0;
        }
      } else if (!var6) {
        if (var7) {
          for (var8 = var4; var2 >= var8; ++var8) {
            DummyClass35.anIntArrayArray663[var8][var3] = var0;
          }
        }
      } else {
        for (var8 = var4; var8 <= var2; ++var8) {
          DummyClass35.anIntArrayArray663[var8][var1] = var0;
        }
      }
    }
  }

  public static void method273(int[] var0, byte var1, NPC var2, int[] var3,
      int[] var4) {
    int var5 = 0;
    if (var1 > 81) {
      while (var5 < var4.length) {
        int var6 = var4[var5];
        int var7 = var0[var5];
        int var8 = var3[var5];

        for (int var9 = 0; var7 != 0
            && var2.aClass145Array2809.length > var9; ++var9) {
          if ((1 & var7) != 0) {
            if (var6 == -1) {
              var2.aClass145Array2809[var9] = null;
            } else {
              AnimationSequence var10 = GlobalStatics_8
                  .method45(var6, (byte) -20);
              Unsure var12 = var2.aClass145Array2809[var9];
              int var11 = var10.anInt1845;
              if (var12 != null) {
                if (var6 != var12.anInt1890) {
                  if (var10.anInt1857 >= GlobalStatics_8
                      .method45(var12.anInt1890,
                          (byte) -20).anInt1857) {
                    var12 = var2.aClass145Array2809[var9] = null;
                  }
                } else if (var11 == 0) {
                  var12 = var2.aClass145Array2809[var9] = null;
                } else if (var11 == 1) {
                  var12.anInt1893 = 0;
                  var12.anInt1894 = 0;
                  var12.anInt1891 = 1;
                  var12.anInt1897 = 0;
                  var12.anInt1900 = var8;
                  GlobalStatics_4
                      .method1470(var2.sceneY, var10, 183921384,
                          var2.sceneX, false,
                          0);
                } else if (var11 == 2) {
                  var12.anInt1894 = 0;
                }
              }

              if (var12 == null) {
                var12 = var2.aClass145Array2809[var9] = new Unsure();
                var12.anInt1891 = 1;
                var12.anInt1897 = 0;
                var12.anInt1900 = var8;
                var12.anInt1890 = var6;
                var12.anInt1894 = 0;
                var12.anInt1893 = 0;
                GlobalStatics_4
                    .method1470(var2.sceneY, var10, 183921384,
                        var2.sceneX, false,
                        0);
              }
            }
          }

          var7 >>>= 1;
        }

        ++var5;
      }

    }
  }

  public static void method274(int var0) {
    GlobalStatics_9.PLAYERS = null;
    if (var0 != -2) {
      GameStringStatics.aClass94_3268 = null;
    }

    GameStringStatics.aClass94_3268 = null;
    GlobalStatics_9.aBooleanArray3272 = null;
    GlobalStatics_9.aClass109Array3270 = null;
    GlobalStatics_9.aLongArray3271 = null;
    GlobalStatics_9.groundItems = null;
  }

  public static void method217(int var0) {
    GlobalStatics_9.FONT_B12 = null;
    GameStringStatics.aClass94_3133 = null;
    GameStringStatics.aClass94_3140 = null;
    GlobalStatics_9.aClass93_3130 = null;
    GlobalStatics_9.anIntArray3139 = null;
    GameStringStatics.aClass94_3131 = null;

    GlobalStatics_9.aClass47_3137 = null;
  }

  public static void method219(boolean var0, int var1) {
    if (var0) {
      if (GlobalStatics_9.anInt3655 != -1) {
        DummyClass44.method1208((byte) -128, GlobalStatics_9.anInt3655);
      }

      for (SomethingPacket151 var2 =
          (SomethingPacket151) GlobalStatics_10.aClass130_3208
              .getFirst(var1 - 2908);
          var2 != null;
          var2 = (SomethingPacket151) GlobalStatics_10.aClass130_3208
              .getNext(-122)) {
        GlobalStatics_10.method254(true, var2, false);
      }

      GlobalStatics_9.anInt3655 = -1;
      GlobalStatics_10.aClass130_3208 = new HashTable(8);
      GlobalStatics_10.method122(var1 - 2918);
      GlobalStatics_9.anInt3655 = GlobalStatics_6.anInt2529;
      DummyClass23.method1746(false);
      GlobalStatics_6.method1093(false);
      GlobalStatics_10.method226(GlobalStatics_9.anInt3655, var1 ^ 2960);
    }

    GlobalStatics_6.anInt3590 = -1;
    GlobalStatics_10.method229(DummyClass12.anInt2027, 20827);
    GlobalStatics_9.localPlayer = new Player();
    GlobalStatics_9.localPlayer.sceneY = 3000;
    GlobalStatics_9.localPlayer.sceneX = var1;
    if (GlRenderer.USE_OPENGL) {
      if (GlobalStatics_9.anInt1753 == 2) {
        CameraStatics.CURRENT_X = GlobalStatics_8.anInt30 << 7;
        CameraStatics.CURRENT_Z = GlobalStatics_5.anInt1904 << 7;
      } else {
        GlobalStatics_10.d(var1 ^ 0xf447);
      }

      GlobalStatics_10.method236((byte) 64);
      GlobalStatics_10.method195(var1 + 17479);
      DummyClass26.setState(28, 5);
    } else {
      DummyClass51.method1418(-110, GlobalStatics_10.sprites);
      DummyClass26.setState(10, 5);
    }
  }

  public static void updateSunPosition(int x, int y) {
    DummyClass39.sunPositionX = DummyClass27.blockConfigs[x][y].sunPositionX;
    GlobalStatics_9.sunPositionY = DummyClass27.blockConfigs[x][y].sunPositionY;
    com.jagex.runescape.statics.GlobalStatics_0.sunPositionZ = DummyClass27.blockConfigs[x][y].sunPosZ;
    GlEnvironment.setSunPosition(DummyClass39.sunPositionX,
        GlobalStatics_9.sunPositionY,
        com.jagex.runescape.statics.GlobalStatics_0.sunPositionZ);
  }

  public static void method221(int var0, GameString var1, GameString var2,
      GameString var3,
      int var4) {
    GlobalStatics_9.method611(var0, var4, var1, var3, (byte) 50, var2);
  }

  public static boolean method222(int var0, int var1, int var2, int var3,
      int var4, int var5) {
    int var6;
    int var7;
    if (var1 == var2 && var3 == var4) {
      if (GlobalStatics_10.method846(var0, var1, var3)) {
        var6 = var1 << 7;
        var7 = var3 << 7;
        return
            GlobalStatics_9.method349(var6 + 1,
                GlobalStatics_4.heightMap[var0][var1][var3] + var5,
                var7 + 1) && GlobalStatics_9.method349(var6 + 128 - 1,
                GlobalStatics_4.heightMap[var0][var1 + 1][var3] + var5,
                var7 + 1)
                && GlobalStatics_9.method349(var6 + 128 - 1,
                GlobalStatics_4.heightMap[var0][var1 + 1][var3 + 1] + var5,
                var7 + 128 - 1)
                && GlobalStatics_9.method349(var6 + 1,
                GlobalStatics_4.heightMap[var0][var1][var3 + 1] + var5,
                var7 + 128 - 1);
      } else {
        return false;
      }
    } else {
      for (var6 = var1; var6 <= var2; ++var6) {
        for (var7 = var3; var7 <= var4; ++var7) {
          if (DummyClass50.anIntArrayArrayArray1142[var0][var6][var7]
              == -GlobalStatics_9.anInt3539) {
            return false;
          }
        }
      }

      var6 = (var1 << 7) + 1;
      var7 = (var3 << 7) + 2;
      int var8 = GlobalStatics_4.heightMap[var0][var1][var3] + var5;
      if (GlobalStatics_9.method349(var6, var8, var7)) {
        int var9 = (var2 << 7) - 1;
        if (GlobalStatics_9.method349(var9, var8, var7)) {
          int var10 = (var4 << 7) - 1;
          if (GlobalStatics_9.method349(var6, var8, var10)) {
            return GlobalStatics_9.method349(var9, var8, var10);
          } else {
            return false;
          }
        } else {
          return false;
        }
      } else {
        return false;
      }
    }
  }

  public static void method317(int var0) {
    GameStringStatics.aClass94Array3376 = null;
    GameStringStatics.aClass94_3378 = null;
    GameStringStatics.aClass94_3374 = null;
    GameStringStatics.aClass94_3382 = null;
    GameStringStatics.aClass94_3381 = null;
    GameStringStatics.aClass94_3372 = null;
    GameStringStatics.aClass94_3380 = null;
    if (var0 != 7759444) {
      GlobalStatics_9.method317(72);
    }

    GlobalStatics_9.aClass93_3369 = null;
    GameStringStatics.aClass94_3379 = null;
    GlobalStatics_9.aClass3_Sub28_Sub16Array3373 = null;
    GameStringStatics.aClass94_3370 = null;
    GameStringStatics.aClass94_3371 = null;
  }

  public static void method318(int var0) {
    SpawnedGameObject var1 = (SpawnedGameObject) GlobalStatics_10.aClass61_3075
        .getFirst();
    if (var0 != 7759444) {
      GameStringStatics.aClass94_3379 = null;
    }

    for (; var1 != null;
        var1 = (SpawnedGameObject) GlobalStatics_10.aClass61_3075.getNext()) {
      if (var1.aliveTime == -1) {
        var1.anInt2261 = 0;
        DummyClass22.method1798(56, var1);
      } else {
        var1.unlinkNode();
      }
    }
  }

  public static void method304(int var0) {
    if (var0 != 6799) {
      GlobalStatics_9.method305(null, null, -13, (byte) 41);
    }

    GlobalStatics_10.aClass93_3412.method1524(3);
    GlobalStatics_9.aClass93_3369.method1524(3);
  }

  public static void method305(SignLink var0, Buffer var1, int var2,
      byte var3) {
    int var5 = 123 % ((var3 + 66) / 57);
    ClassCheckRequest var4 = new ClassCheckRequest();
    var4.anInt2296 = var1.readUnsignedByte();
    var4.anInt2305 = var1.readInt();
    var4.aClass64Array2298 = new SignLinkRequest[var4.anInt2296];
    var4.anIntArray2300 = new int[var4.anInt2296];
    var4.aByteArrayArrayArray2302 = new byte[var4.anInt2296][][];
    var4.aClass64Array2303 = new SignLinkRequest[var4.anInt2296];
    var4.anIntArray2301 = new int[var4.anInt2296];
    var4.anIntArray2299 = new int[var4.anInt2296];

    for (int var6 = 0; var6 < var4.anInt2296; ++var6) {
      try {
        int var7 = var1.readUnsignedByte();
        String var8;
        String var9;
        int var10;
        if (var7 != 0 && var7 != 1 && var7 != 2) {
          if (var7 == 3 || var7 == 4) {
            var8 = new String(var1.readString().method1568(0));
            var9 = new String(var1.readString().method1568(0));
            var10 = var1.readUnsignedByte();
            String[] var11 = new String[var10];

            for (int var12 = 0; var10 > var12; ++var12) {
              var11[var12] = new String(var1.readString().method1568(0));
            }

            byte[][] var21 = new byte[var10][];
            int var14;
            if (var7 == 3) {
              for (int var13 = 0; var10 > var13; ++var13) {
                var14 = var1.readInt();
                var21[var13] = new byte[var14];
                var1.copy(0, var14, var21[var13]);
              }
            }

            var4.anIntArray2301[var6] = var7;
            Class[] var22 = new Class[var10];

            for (var14 = 0; var10 > var14; ++var14) {
              var22[var14] = GlobalStatics_9.method170(6092, var11[var14]);
            }

            var4.aClass64Array2298[var6] =
                var0.method1443(GlobalStatics_9.method170(6092, var8), var22,
                    -80, var9);
            var4.aByteArrayArrayArray2302[var6] = var21;
          }
        } else {
          var8 = new String(var1.readString().method1568(0));
          var10 = 0;
          var9 = new String(var1.readString().method1568(0));
          if (var7 == 1) {
            var10 = var1.readInt();
          }

          var4.anIntArray2301[var6] = var7;
          var4.anIntArray2299[var6] = var10;
          var4.aClass64Array2303[var6] =
              var0.method1447(-41, var9, GlobalStatics_9.method170(6092, var8));
        }
      } catch (ClassNotFoundException var15) {
        var4.anIntArray2300[var6] = -1;
      } catch (SecurityException var16) {
        var4.anIntArray2300[var6] = -2;
      } catch (NullPointerException var17) {
        var4.anIntArray2300[var6] = -3;
      } catch (Exception var18) {
        var4.anIntArray2300[var6] = -4;
      } catch (Throwable var19) {
        var4.anIntArray2300[var6] = -5;
      }
    }

    GlobalStatics_9.aClass61_2557.addLast(var4);
  }

  public static void method306(int var0, boolean var1, int var2) {
    BitVariable var3 = GlobalStatics_7.method378(var0, (byte) 127);
    assert var3 != null;
    int var6 = var3.high;
    if (!var1) {
      int var5 = var3.low;
      int var4 = var3.id;
      int var7 = GlobalStatics_9.BIT_MASKS[var6 - var5];
      if (var2 < 0 || var2 > var7) {
        var2 = 0;
      }

      var7 <<= var5;
      com.jagex.runescape.statics.GlobalStatics_0.method1428(var4, 72,
          var7 & var2 << var5 | DummyClass5.anIntArray2985[var4] & ~var7);
    }
  }

  public static void method307(GameString[] var0, short[] var1, int var2) {
    GlobalStatics_6.method127(var1, -1 + var0.length, var0, -909, 0);
    int var3 = 91 % ((var2 + 1) / 63);
  }

  public static void method309(boolean var0) {
    GlobalStatics_9.anIntArray3359 = null;
    if (var0) {
      GlobalStatics_9.aClass153_3361 = null;
      GameStringStatics.aClass94_3357 = null;
      GameStringStatics.aClass94_3360 = null;
    }
  }

  public static int method310(int var0, byte var1, int var2, int var3) {
    var0 &= 3;
    if (var0 == 0) {
      return var3;
    } else {
      if (var1 >= -17) {
        GameStringStatics.aClass94_3357 = null;
      }

      return var0 == 1 ? 7 - var2 : var0 == 2 ? -var3 + 7 : var2;
    }
  }

  public static Cursor method311(int var0, int var1) {
    Cursor var2 = (Cursor) GlobalStatics_7.aClass93_684.get(var0);
    if (var2 != null) {
      return var2;
    } else {
      byte[] var3 = GlobalStatics_9.aClass153_3227.getBytes(33, var0);
      if (var1 != 5) {
        GameStringStatics.aClass94_3357 = null;
      }

      var2 = new Cursor();
      if (var3 != null) {
        var2.method1182(new Buffer(var3), var0, (byte) 85);
      }

      GlobalStatics_7.aClass93_684.get((byte) -112, var2, var0);
      return var2;
    }
  }

  public static void method260(int var0, int var1, int var2) {
    if (var0 != -16207) {
      GameStringStatics.LANG_PORTUGUESE = null;
    }

    WidgetUpdate var3 = GlobalStatics_6.method466(4, 7, var1);
    var3.g((byte) 33);
    var3.anInt3598 = var2;
  }

  public static void method261(int var0) {
    int var1 = -31 / ((-43 - var0) / 55);
    GlobalStatics_9.aClass153_3227 = null;
    GameStringStatics.LANG_GERMAN = null;
    GameStringStatics.LANG_PORTUGUESE = null;
    GameStringStatics.LANG_FRENCH = null;
    GameStringStatics.aClass94_3220 = null;
    GlobalStatics_9.anIntArray3228 = null;
    GameStringStatics.LANGUAGES = null;
    GameStringStatics.aClass94Array3226 = null;
    GameStringStatics.LANG_ENGLISH = null;
    GlobalStatics_9.aClass3_Sub28_Sub16_Sub2_3221 = null;
  }

  public static void method262(int var0, int var1, int var2, int var3, int var4,
      int var5, int var6,
      int var7) {
    int var8 = var5 + var2;
    int var10 = var5 + var7;

    int var12;
    for (var12 = var2; var12 < var8; ++var12) {
      GlobalStatics_10
          .method282(DummyClass35.anIntArrayArray663[var12], var7, 125, var6,
              var0);
    }

    int var9 = -var5 + var3;
    int var11 = -var5 + var6;

    for (var12 = var3; var12 > var9; --var12) {
      GlobalStatics_10
          .method282(DummyClass35.anIntArrayArray663[var12], var7, 103, var6,
              var0);
    }

    if (var1 > 118) {
      for (var12 = var8; var9 >= var12; ++var12) {
        int[] var13 = DummyClass35.anIntArrayArray663[var12];
        GlobalStatics_10.method282(var13, var7, 117, var10, var0);
        GlobalStatics_10.method282(var13, var10, 111, var11, var4);
        GlobalStatics_10.method282(var13, var11, -75, var6, var0);
      }

    }
  }

  public static void method264(byte var0) {
    ++GlobalStatics_10.anInt3402;
    GlobalStatics_9.SECURE_BUFFER.writePacket(184);

    for (SomethingPacket151 var1 =
        (SomethingPacket151) GlobalStatics_10.aClass130_3208.getFirst(124);
        var1 != null;
        var1 = (SomethingPacket151) GlobalStatics_10.aClass130_3208
            .getNext(-79)) {
      if (var1.anInt2603 == 0) {
        GlobalStatics_10.method254(true, var1, false);
      }
    }

    if (var0 < 83) {
      GameStringStatics.LANG_PORTUGUESE = null;
    }

    if (GlobalStatics_10.aClass11_3087 != null) {
      DummyClass29.method909(125, GlobalStatics_10.aClass11_3087);
      GlobalStatics_10.aClass11_3087 = null;
    }
  }

  public static void method265(byte var0, int var1) {
    WidgetUpdate var2 = GlobalStatics_6.method466(4, 8, var1);
    var2.createIndexedColorSprite(true);
    if (var0 != -42) {
      GameStringStatics.LANG_FRENCH = null;
    }
  }

  public static void method172(int var0) {
    GlobalStatics_9.anIntArray3045 = null;
    if (var0 == 11597) {
      GameStringStatics.aClass94_3042 = null;
    }
  }

  public static int method173(byte var0, int var1, Widget var2) {
    if (var0 < 4) {
      GlobalStatics_9.resetVariables(-50);
    }

    return
        !GlobalStatics_8.method44(var2).method92(var1, (byte) -109) &&
            var2.anObjectArray314 == null ?
            -1 :
            var2.anIntArray249 != null && var1 < var2.anIntArray249.length ?
                var2.anIntArray249[var1] :
                -1;
  }

  public static void method174(int var0, int var1) {
    DummyClass8.aClass93_4015.method1522(-127, var1);
    if (var0 != 4096) {
      GlobalStatics_9.resetVariables(92);
    }
  }

  public static void method175(int var0, int var1, int var2, boolean var3,
      int var4, int var5,
      int var6) {
    GlobalStatics_9.method2091(var5, 4);
    int var8 = var5 - var1;
    int var7 = 0;
    if (var8 < 0) {
      var8 = 0;
    }

    int var10 = -var5;
    int var9 = var5;
    int var11 = var8;
    int var12 = -var8;
    int var14 = -1;
    int[] var15 = DummyClass35.anIntArrayArray663[var2];
    int var17 = var6 + var8;
    int var13 = -1;
    int var16 = -var8 + var6;
    GlobalStatics_10.method282(var15, -var5 + var6, -40, var16, var0);
    GlobalStatics_10.method282(var15, var16, -51, var17, var4);
    GlobalStatics_10.method282(var15, var17, -41, var6 + var5, var0);
    if (!var3) {
      GlobalStatics_9.anIntArray3045 = null;
    }

    while (var7 < var9) {
      var14 += 2;
      var12 += var14;
      if (var12 >= 0 && var11 >= 1) {
        GlobalStatics_9.anIntArray1838[var11] = var7;
        --var11;
        var12 -= var11 << 1;
      }

      ++var7;
      var13 += 2;
      var10 += var13;
      int[] var19;
      int[] var18;
      int var21;
      int var20;
      int var23;
      int var22;
      int var24;
      if (var10 >= 0) {
        --var9;
        var10 -= var9 << 1;
        if (var8 > var9) {
          var18 = DummyClass35.anIntArrayArray663[var9 + var2];
          var19 = DummyClass35.anIntArrayArray663[-var9 + var2];
          var22 = -var7 + var6;
          var21 = var7 + var6;
          var20 = GlobalStatics_9.anIntArray1838[var9];
          var24 = -var20 + var6;
          var23 = var20 + var6;
          GlobalStatics_10.method282(var18, var22, -113, var24, var0);
          GlobalStatics_10.method282(var18, var24, 95, var23, var4);
          GlobalStatics_10.method282(var18, var23, 117, var21, var0);
          GlobalStatics_10.method282(var19, var22, 113, var24, var0);
          GlobalStatics_10.method282(var19, var24, -76, var23, var4);
          GlobalStatics_10.method282(var19, var23, -97, var21, var0);
        } else {
          var18 = DummyClass35.anIntArrayArray663[var2 + var9];
          var19 = DummyClass35.anIntArrayArray663[var2 - var9];
          var20 = var7 + var6;
          var21 = var6 - var7;
          GlobalStatics_10.method282(var18, var21, 113, var20, var0);
          GlobalStatics_10.method282(var19, var21, -100, var20, var0);
        }
      }

      var18 = DummyClass35.anIntArrayArray663[var2 + var7];
      var19 = DummyClass35.anIntArrayArray663[var2 - var7];
      var20 = var9 + var6;
      var21 = -var9 + var6;
      if (var8 <= var7) {
        GlobalStatics_10.method282(var18, var21, 104, var20, var0);
        GlobalStatics_10.method282(var19, var21, -127, var20, var0);
      } else {
        var22 = var7 <= var11 ? var11 : GlobalStatics_9.anIntArray1838[var7];
        var23 = var22 + var6;
        var24 = var6 - var22;
        GlobalStatics_10.method282(var18, var21, -94, var24, var0);
        GlobalStatics_10.method282(var18, var24, 115, var23, var4);
        GlobalStatics_10.method282(var18, var23, 110, var20, var0);
        GlobalStatics_10.method282(var19, var21, -114, var24, var0);
        GlobalStatics_10.method282(var19, var24, -79, var23, var4);
        GlobalStatics_10.method282(var19, var23, 120, var20, var0);
      }
    }
  }

  public static void resetVariables(int var0) {
    int var1 = 0;
    if (var0 >= -111) {
      GlobalStatics_9.resetVariables(40);
    }

    for (; DummyClass53.anInt1344 > var1; ++var1) {
      PlayerVariable var2 = GlobalStatics_10.getPlayerVariable(-109, var1);
      if (var2 != null && var2.anInt556 == 0) {
        GlobalStatics_9.variables[var1] = 0;
        DummyClass5.anIntArray2985[var1] = 0;
      }
    }

    GlobalStatics_6.variableUpdates = new HashTable(16);
  }

  public static void method295(GameString var0, byte var1, int var2) {
    WidgetUpdate var3 = GlobalStatics_6.method466(var1 - 36, 2, var2);
    var3.g((byte) 33);
    var3.text = var0;
  }

  public static void method296() {
    GlobalStatics_9.aClass94Array3341 = null;
    GLStatics.CAMERA_TILE_Y = 30;
    GameStringStatics.aClass94_3344 = null;
    GameStringStatics.aClass94_3339 = null;
  }

  public static void method297(long var0, int var2) {
    if (var0 != 0L) {
      for (int var3 = 0; var3 < GlobalStatics_10.anInt104; ++var3) {
        if (GlobalStatics_8.aLongArray826[var3] == var0) {
          ++DummyClass52.anInt1170;
          --GlobalStatics_10.anInt104;

          for (int var4 = var3; var4 < GlobalStatics_10.anInt104; ++var4) {
            GameStringStatics.aClass94Array1046[var4] =
                GameStringStatics.aClass94Array1046[var4 + 1];
            GlobalStatics_7.anIntArray882[var4] = GlobalStatics_7.anIntArray882[
                var4 + 1];
            GlobalStatics_2.aClass94Array2566[var4] = GlobalStatics_2.aClass94Array2566[
                1 + var4];
            GlobalStatics_8.aLongArray826[var4] = GlobalStatics_8.aLongArray826[
                1 + var4];
            GlobalStatics_9.anIntArray904[var4] = GlobalStatics_9.anIntArray904[
                var4 + 1];
            com.jagex.runescape.statics.GlobalStatics_0.aBooleanArray73[var4] = com.jagex.runescape.statics.GlobalStatics_0.aBooleanArray73[
                1 + var4];
          }

          DummyClass31.anInt1472 = GlobalStatics_10.anInt3213;
          GlobalStatics_9.SECURE_BUFFER.writePacket(57);
          GlobalStatics_9.SECURE_BUFFER.writeLong(var0);
          break;
        }
      }

      if (var2 != 1) {
        GlobalStatics_9.aClass94Array3341 = null;
      }

    }
  }

  public static SomethingGl0[] method298(byte[][][] var0, byte[][] var1,
      byte[][] var2, int[][] var3,
      float[][] var4, int[][] var5, byte[][] var6, byte[][] var7,
      float[][] var8, int var9, float[][] var10, int[][] var11,
      int[][] var12, int[][] var13, int var14) {
    int[][] var15 = new int[105][105];

    int var17;
    for (int var16 = 1; var16 <= 103; ++var16) {
      for (var17 = 1; var17 <= 103; ++var17) {
        byte var18 = var2[var16][var17];
        if (var18 == 0) {
          var18 = var2[var16 - 1][var17];
        }

        if (var18 == 0) {
          var18 = var2[var16][-1 + var17];
        }

        if (var18 == 0) {
          var18 = var2[-1 + var16][var17 - 1];
        }

        if (var18 != 0) {
          FloorUnderlay var19 = GlobalStatics_6
              .getFloorUnderlay(-1 + (255 & var18));
          var15[var16][var17] = (1 + var19.anInt1412 << 16) + var19.anInt1414;
        }
      }
    }

    HashTable var52 = new HashTable(128);

    int var21;
    int var20;
    int var22;
    int var56;
    for (var17 = 1; var17 <= 102; ++var17) {
      for (var56 = 1; var56 <= 102; ++var56) {
        if (var2[var17][var56] != 0) {
          int[] var53;
          if (var6[var17][var56] == 0) {
            var53 = DummyClass21.anIntArrayArray1763[0];
          } else {
            var53 = GlobalStatics_9.anIntArrayArray499[var1[var17][var56]];
            if (var53.length == 0) {
              continue;
            }
          }

          var20 = 0;
          var21 = var15[var17][var56];
          var22 = var15[var17 + 1][var56];
          if (var5 != null) {
            var20 = var5[var17][var56] & 16777215;
          }

          long var27 = var20 | (long) var22 << 32;
          int var24 = var15[var17][var56 + 1];
          int var23 = var15[var17 + 1][var56 + 1];
          long var31 = (long) var24 << 32 | var20;
          int var33 = var53.length / 2;
          long var25 = var20 | (long) var21 << 32;
          SomethingGl0 var34 = (SomethingGl0) var52.get(var25);
          if (var34 == null) {
            var34 = new SomethingGl0(-1 + (var21 >> 16), 0xffff & var21,
                false,
                var13 != null, var20);
            var52.put(var25, var34);
          }

          ++var34.anInt2344;
          var34.anInt2342 += var33;
          if (var27 != var25) {
            var34 = (SomethingGl0) var52.get(var27);
            if (var34 == null) {
              var34 = new SomethingGl0((var22 >> 16) - 1, 0xffff & var22,
                  false,
                  var13 != null, var20);
              var52.put(var27, var34);
            }

            ++var34.anInt2344;
            var34.anInt2342 += var33;
          }

          long var29 = (long) var23 << 32 | var20;
          if (var29 != var25 && var29 != var27) {
            var34 = (SomethingGl0) var52.get(var29);
            if (var34 == null) {
              var34 = new SomethingGl0((var23 >> 16) - 1, 0xffff & var23,
                  false,
                  var13 != null, var20);
              var52.put(var29, var34);
            }

            var34.anInt2342 += var33;
            ++var34.anInt2344;
          }

          if (var31 != var25 && var27 != var31 && var31 != var29) {
            var34 = (SomethingGl0) var52.get(var31);
            if (var34 == null) {
              var34 = new SomethingGl0((var24 >> 16) - 1, var24 & 0xffff,
                  false,
                  var13 != null, var20);
              var52.put(var31, var34);
            }

            ++var34.anInt2344;
            var34.anInt2342 += var33;
          }
        }
      }
    }

    if (var14 != 4096) {
      GlobalStatics_9.method297(-10L, 48);
    }

    SomethingGl0 var54;
    for (
        var54 = (SomethingGl0) var52.getFirst(92);
        var54 != null; var54 = (SomethingGl0) var52.getNext(-102)) {
      var54.method145();
    }

    for (var17 = 1; var17 <= 102; ++var17) {
      for (var56 = 1; var56 <= 102; ++var56) {
        byte var57 = var2[var17][var56];
        if (var57 != 0) {
          if ((8 & var0[var9][var17][var56]) == 0) {
            if ((2 & var0[1][var17][var56]) == 2 && var9 > 0) {
              var20 = var9 - 1;
            } else {
              var20 = var9;
            }
          } else {
            var20 = 0;
          }

          var21 = 0;
          boolean[] var60 = null;
          var22 = 128;
          if (var5 != null) {
            var22 = var5[var17][var56] >>> 24 << 3;
            var21 = 16777215 & var5[var17][var56];
          }

          int[] var58;
          int var63;
          int var62;
          byte var61;
          int var69;
          int var64;
          if (var6[var17][var56] == 0) {
            byte var26 = 0;
            var64 = var26 + (var57 == var2[var17 - 1][-1 + var56] ? 1 : -1);
            byte var65 = 0;
            var58 = DummyClass21.anIntArrayArray1763[0];
            var62 = var65 + (var57 == var2[1 + var17][var56 - 1] ? 1 : -1);
            if (var2[var17][var56 - 1] == var57) {
              ++var62;
              ++var64;
            } else {
              --var64;
              --var62;
            }

            byte var28 = 0;
            var63 = var28 + (var57 == var2[1 + var17][1 + var56] ? 1 : -1);
            byte var68 = 0;
            if (var57 == var2[1 + var17][var56]) {
              ++var63;
              ++var62;
            } else {
              --var62;
              --var63;
            }

            var69 = var68 + (var57 == var2[var17 - 1][1 + var56] ? 1 : -1);
            if (var2[var17][1 + var56] == var57) {
              ++var69;
              ++var63;
            } else {
              --var63;
              --var69;
            }

            if (var2[-1 + var17][var56] == var57) {
              ++var69;
              ++var64;
            } else {
              --var69;
              --var64;
            }

            int var30 = var64 - var63;
            int var66 = -var69 + var62;
            if (var66 < 0) {
              var66 = -var66;
            }

            if (var30 < 0) {
              var30 = -var30;
            }

            var61 = (byte) (var66 <= var30 ? 0 : 1);
            var7[var17][var56] = var61;
          } else {
            var58 = GlobalStatics_9.anIntArrayArray499[var1[var17][var56]];
            var60 = GlobalStatics_10.aBooleanArrayArray3118[var1[var17][var56]];
            var61 = var7[var17][var56];
            if (var58.length == 0) {
              continue;
            }
          }

          var64 = var15[var17][var56];
          var62 = var15[var17 + 1][var56];
          var63 = var15[var17 + 1][var56 + 1];
          long var67 = (long) var64 << 32 | var21;
          long var32 = (long) var62 << 32 | var21;
          long var70 = (long) var63 << 32 | var21;
          int var38 = var11[var17][var56];
          var69 = var15[var17][var56 + 1];
          int var40 = var11[var17 + 1][var56 + 1];
          int var39 = var11[1 + var17][var56];
          long var36 = var21 | (long) var69 << 32;
          int var41 = var11[var17][var56 + 1];
          int var42 = var3[var17][var56];
          int var43 = var3[var17 + 1][var56];
          int var44 = var3[var17 + 1][var56 + 1];
          int var45 = var3[var17][1 + var56];
          int var47 = -1 + (var62 >> 16);
          int var46 = (var64 >> 16) - 1;
          int var48 = (var63 >> 16) - 1;
          SomethingGl0 var50 = (SomethingGl0) var52.get(var67);
          GlobalStatics_9.method955(var13, true,
              GlobalStatics_10.method190(var46, var38, (byte) -92, var42),
              var50, var58, var56,
              var20, var17, var64 <= var63, var8, var69 >= var64, 2, var4,
              var22,
              GlobalStatics_10.method190(var46, var41, (byte) -80, var45),
              GlobalStatics_10.method190(var46, var40, (byte) -103, var44),
              var64 <= var62, var12,
              var10, var61,
              GlobalStatics_10.method190(var46, var39, (byte) -118, var43),
              var60);
          int var49 = (var69 >> 16) - 1;
          if (var32 != var67) {
            var50 = (SomethingGl0) var52.get(var32);
            GlobalStatics_9.method955(var13, var62 <= var64,
                GlobalStatics_10.method190(var47, var38, (byte) 88, var42),
                var50, var58, var56,
                var20, var17, var63 >= var62, var8, var62 <= var69, 2, var4,
                var22,
                GlobalStatics_10.method190(var47, var41, (byte) -82, var45),
                GlobalStatics_10.method190(var47, var40, (byte) -113, var44),
                true, var12,
                var10, var61,
                GlobalStatics_10.method190(var47, var39, (byte) 113, var43),
                var60);
          }

          if (var70 != var67 && var70 != var32) {
            var50 = (SomethingGl0) var52.get(var70);
            GlobalStatics_9.method955(var13, var64 >= var63,
                GlobalStatics_10.method190(var48, var38, (byte) 59, var42),
                var50, var58, var56,
                var20, var17, true, var8, var63 <= var69, var14 ^ 4098, var4,
                var22,
                GlobalStatics_10.method190(var48, var41, (byte) 54, var45),
                GlobalStatics_10.method190(var48, var40, (byte) -87, var44),
                var62 >= var63,
                var12, var10, var61,
                GlobalStatics_10.method190(var48, var39, (byte) -77, var43),
                var60);
          }

          if (var36 != var67 && var36 != var32 && var36 != var70) {
            var50 = (SomethingGl0) var52.get(var36);
            GlobalStatics_9.method955(var13, var69 <= var64,
                GlobalStatics_10.method190(var49, var38, (byte) -118, var42),
                var50, var58, var56,
                var20, var17, var69 <= var63, var8, true, var14 ^ 4098, var4,
                var22,
                GlobalStatics_10.method190(var49, var41, (byte) -96, var45),
                GlobalStatics_10.method190(var49, var40, (byte) 115, var44),
                var62 >= var69,
                var12, var10, var61,
                GlobalStatics_10.method190(var49, var39, (byte) 58, var43),
                var60);
          }
        }
      }
    }

    for (
        var54 = (SomethingGl0) var52.getFirst(54);
        var54 != null; var54 = (SomethingGl0) var52.getNext(-62)) {
      if (var54.anInt2343 == 0) {
        var54.unlinkNode();
      } else {
        var54.method148();
      }
    }

    var17 = var52.getSize();
    SomethingGl0[] var59 = new SomethingGl0[var17];
    var52.getNodes(var59);
    long[] var55 = new long[var17];

    for (var20 = 0; var17 > var20; ++var20) {
      var55[var20] = var59[var20].key;
    }

    DummyClass18.method824(var55, var59, -86);
    return var59;
  }

  public static void method299(int var0, int var1, int var2) {
    if (var0 <= 92) {
      GlobalStatics_9.method297(-6L, -85);
    }

    int var3 = var1;
    if (var1 > 25) {
      var3 = 25;
    }

    --var1;
    int var4 = GlobalStatics_10.anIntArray3456[var1];
    int var5 = DummyClass38.anIntArray729[var1];
    if (var2 == 0) {
      GlobalStatics_9.SECURE_BUFFER.writePacket(215);
      GlobalStatics_9.SECURE_BUFFER.writeByte(var3 + var3 + 3);
      ++DummyClass30.anInt452;
    }

    if (var2 == 1) {
      GlobalStatics_9.SECURE_BUFFER.writePacket(39);
      GlobalStatics_9.SECURE_BUFFER.writeByte(3 + var3 - (-var3 - 14));
      ++GlobalStatics_9.anInt503;
    }

    if (var2 == 2) {
      ++DummyClass15.anInt1873;
      GlobalStatics_9.SECURE_BUFFER.writePacket(77);
      GlobalStatics_9.SECURE_BUFFER.writeByte(var3 + var3 + 3);
    }

    GlobalStatics_9.SECURE_BUFFER
        .method790(KeyboardStatics.PRESSED_KEYS[82] ? 1 : 0,
            -13071);
    GlobalStatics_9.SECURE_BUFFER
        .writeShort(GlobalStatics_10.REGION_BASE_X + var4);
    GlobalStatics_9.SECURE_BUFFER
        .method783(GlobalStatics_9.REGION_BASE_Y + var5, -268435456);
    DummyClass38.anInt733 = DummyClass38.anIntArray729[0];
    DummyClass45.anInt987 = GlobalStatics_10.anIntArray3456[0];

    for (int var6 = 1; var3 > var6; ++var6) {
      --var1;
      GlobalStatics_9.SECURE_BUFFER
          .method790(-var4 + GlobalStatics_10.anIntArray3456[var1],
              -13071);
      GlobalStatics_9.SECURE_BUFFER
          .method743(DummyClass38.anIntArray729[var1] - var5);
    }
  }

  public static boolean method353(int var0, int var1) {
    if (var1 > var0) {
      return false;
    } else {
      int var2 = GlobalStatics_10.aShortArray3095[var0];
      if (var2 >= 2000) {
        var2 -= 2000;
      }

      return var2 == 1003;
    }
  }

  public static void method354(int var0, int var1) {
    GlobalStatics_9.anInt3362 = -1;
    GlobalStatics_9.anInt2251 = var1;
    GlobalStatics_9.method117((byte) 87);
  }

  public static void method357(boolean var0) {
    BufferStatics.aByteArrayArray3461 = null;
    GlobalStatics_9.aClass3_Sub28_Sub16Array3458 = null;
    if (var0) {
      GlobalStatics_9.method353(-71, 100);
    }

    GlobalStatics_9.aBooleanArrayArray3468 = null;
  }

  public static void method203(int var0) {
    int var1 = 15 / ((-11 - var0) / 63);
    if (GlobalStatics_7.anInt3660 == 2) {
      if (GlobalStatics_9.anInt1297 == GlobalStatics_9.anInt3460
          && DummyClass36.anInt2612 == GlobalStatics_8.anInt2099) {
        GlobalStatics_7.anInt3660 = 0;
        if (DummyClass55.aBoolean1419 && KeyboardStatics.PRESSED_KEYS[81]
            && GlobalStatics_10.amountContextActions > 2) {
          GlobalStatics_8
              .method806(2597, GlobalStatics_10.amountContextActions - 2);
        } else {
          GlobalStatics_8
              .method806(2597, GlobalStatics_10.amountContextActions - 1);
        }
      }
    } else if (GlobalStatics_9.anInt1297 == DummyClass5.anInt2993
        && DummyClass36.anInt2612 == DummyClass36.anInt2614) {
      GlobalStatics_7.anInt3660 = 0;
      if (DummyClass55.aBoolean1419 && KeyboardStatics.PRESSED_KEYS[81]
          && GlobalStatics_10.amountContextActions > 2) {
        GlobalStatics_8
            .method806(2597, GlobalStatics_10.amountContextActions - 2);
      } else {
        GlobalStatics_8
            .method806(2597, GlobalStatics_10.amountContextActions - 1);
      }
    } else {
      GlobalStatics_8.anInt2099 = DummyClass36.anInt2614;
      GlobalStatics_7.anInt3660 = 2;
      GlobalStatics_9.anInt3460 = DummyClass5.anInt2993;
    }
  }

  public static void method204(int var0) {
    GlobalStatics_9.SECURE_BUFFER.writePacket(243);
    GlobalStatics_9.SECURE_BUFFER.writeByte(GlobalStatics_9.getWindowMode());
    GlobalStatics_9.SECURE_BUFFER.writeShort(DummyClass30.viewWidth);
    if (var0 != -3) {
      GlobalStatics_9.anInt3103 = -41;
    }

    ++GlobalStatics_8.anInt2;
    GlobalStatics_9.SECURE_BUFFER.writeShort(GlobalStatics_9.viewHeight);
    GlobalStatics_9.SECURE_BUFFER
        .writeByte(SettingsStatics.GL_RENDERING_SAMPLES);
  }

  public static void method205(FileUnpacker var0, int var1, FileUnpacker var2,
      Interface4 var3) {
    DummyClass14.aClass153_1967 = var0;
    DummyClass43.anInterface4_915 = var3;
    GlobalStatics_6.aClass153_3490 = var2;
    if (GlobalStatics_6.aClass153_3490 != null) {
      GlobalStatics_9.anInt1156 =
          GlobalStatics_6.aClass153_3490.getAmountChildren(1, (byte) 100);
    }

    if (DummyClass14.aClass153_1967 != null) {
      GlobalStatics_9.anInt377 = DummyClass14.aClass153_1967
          .getAmountChildren(1, (byte) 83);
    }

    if (var1 <= 32) {
      GameStringStatics.aClass94_3106 = null;
    }
  }

  public static void method206(boolean var0) {
    GameStringStatics.aClass94_3106 = null;
    if (!var0) {
      GlobalStatics_9.method204(-76);
    }
  }

  public static GameString method207(int var0, boolean var1, int var2,
      long var3) {
    if (var0 >= 2 && var0 <= 36) {
      if (var2 <= 71) {
        GlobalStatics_9.aFloat3105 = 1.3008908F;
      }

      long var6 = var3 / var0;

      int var5;
      for (var5 = 1; var6 != 0L; var6 /= var0) {
        ++var5;
      }

      int var8 = var5;
      if (var3 < 0L || var1) {
        var8 = var5 + 1;
      }

      byte[] var9 = new byte[var8];
      if (var3 >= 0L) {
        if (var1) {
          var9[0] = 43;
        }
      } else {
        var9[0] = 45;
      }

      for (int var10 = 0; var5 > var10; ++var10) {
        int var11 = (int) (var3 % var0);
        var3 /= var0;
        if (var11 < 0) {
          var11 = -var11;
        }

        if (var11 > 9) {
          var11 += 39;
        }

        var9[-1 - var10 + var8] = (byte) (var11 + 48);
      }

      GameString var13 = new GameString();
      var13.bytes = var9;
      var13.length = var8;
      return var13;
    } else {
      throw new IllegalArgumentException("Invalid radix:" + var0);
    }
  }

  public static void method347(boolean var0) {
    GlobalStatics_9.IS_ON_TUTORIAL_ISLAND = 0;
    if (!var0) {
      GlobalStatics_9.method347(true);
    }

    int var1 =
        GlobalStatics_10.REGION_BASE_X + (GlobalStatics_9.localPlayer.sceneX
            >> 7);
    int var2 = (GlobalStatics_9.localPlayer.sceneY >> 7)
        + GlobalStatics_9.REGION_BASE_Y;
    if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
      GlobalStatics_9.IS_ON_TUTORIAL_ISLAND = 1;
    }

    if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
      GlobalStatics_9.IS_ON_TUTORIAL_ISLAND = 1;
    }

    if (GlobalStatics_9.IS_ON_TUTORIAL_ISLAND == 1 && var1 >= 3139
        && var1 <= 3199
        && var2 >= 3008
        && var2 <= 3062) {
      GlobalStatics_9.IS_ON_TUTORIAL_ISLAND = 0;
    }
  }

  public static void method348(int var0) {
    if (var0 >= 7) {
      GlobalStatics_9.aClass3_Sub28_Sub17_Sub1_3440 = null;
      RSAConfiguration.MODULUS = null;
    }
  }

  public static boolean method349(int var0, int var1, int var2) {
    for (int var3 = 0; var3 < GlobalStatics_9.anInt1672; ++var3) {
      SomethingLight0 var4 = GlobalStatics_10.aClass113Array1895[var3];
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      if (var4.anInt1564 == 1) {
        var5 = var4.anInt1562 - var0;
        if (var5 > 0) {
          var6 = var4.anInt1560 + (var4.anInt1555 * var5 >> 8);
          var7 = var4.anInt1550 + (var4.anInt1551 * var5 >> 8);
          var8 = var4.anInt1544 + (var4.anInt1561 * var5 >> 8);
          var9 = var4.anInt1548 + (var4.anInt1565 * var5 >> 8);
          if (var2 >= var6 && var2 <= var7 && var1 >= var8 && var1 <= var9) {
            return true;
          }
        }
      } else if (var4.anInt1564 == 2) {
        var5 = var0 - var4.anInt1562;
        if (var5 > 0) {
          var6 = var4.anInt1560 + (var4.anInt1555 * var5 >> 8);
          var7 = var4.anInt1550 + (var4.anInt1551 * var5 >> 8);
          var8 = var4.anInt1544 + (var4.anInt1561 * var5 >> 8);
          var9 = var4.anInt1548 + (var4.anInt1565 * var5 >> 8);
          if (var2 >= var6 && var2 <= var7 && var1 >= var8 && var1 <= var9) {
            return true;
          }
        }
      } else if (var4.anInt1564 == 3) {
        var5 = var4.anInt1560 - var2;
        if (var5 > 0) {
          var6 = var4.anInt1562 + (var4.anInt1549 * var5 >> 8);
          var7 = var4.anInt1545 + (var4.anInt1557 * var5 >> 8);
          var8 = var4.anInt1544 + (var4.anInt1561 * var5 >> 8);
          var9 = var4.anInt1548 + (var4.anInt1565 * var5 >> 8);
          if (var0 >= var6 && var0 <= var7 && var1 >= var8 && var1 <= var9) {
            return true;
          }
        }
      } else if (var4.anInt1564 == 4) {
        var5 = var2 - var4.anInt1560;
        if (var5 > 0) {
          var6 = var4.anInt1562 + (var4.anInt1549 * var5 >> 8);
          var7 = var4.anInt1545 + (var4.anInt1557 * var5 >> 8);
          var8 = var4.anInt1544 + (var4.anInt1561 * var5 >> 8);
          var9 = var4.anInt1548 + (var4.anInt1565 * var5 >> 8);
          if (var0 >= var6 && var0 <= var7 && var1 >= var8 && var1 <= var9) {
            return true;
          }
        }
      } else if (var4.anInt1564 == 5) {
        var5 = var1 - var4.anInt1544;
        if (var5 > 0) {
          var6 = var4.anInt1562 + (var4.anInt1549 * var5 >> 8);
          var7 = var4.anInt1545 + (var4.anInt1557 * var5 >> 8);
          var8 = var4.anInt1560 + (var4.anInt1555 * var5 >> 8);
          var9 = var4.anInt1550 + (var4.anInt1551 * var5 >> 8);
          if (var0 >= var6 && var0 <= var7 && var2 >= var8 && var2 <= var9) {
            return true;
          }
        }
      }
    }

    return false;
  }

  public static FloorOverlay method350(byte var0, int var1) {
    FloorOverlay var2 = (FloorOverlay) DummyClass8.aClass93_4015.get(var1);
    if (var2 == null) {
      int var3 = 70 % ((var0 - 43) / 57);
      byte[] var4 = GlobalStatics_6.configs.getBytes(4, var1);
      var2 = new FloorOverlay();
      if (var4 != null) {
        var2.method2274(24559, new Buffer(var4), var1);
      }

      DummyClass8.aClass93_4015.get((byte) -109, var2, var1);
      return var2;
    } else {
      return var2;
    }
  }

  public static void method266(int var0) {
    GameStringStatics.aClass94_3249 = null;
    GameStringStatics.aClass94_3247 = null;
    if (var0 == -1443422260) {
      GameStringStatics.aClass94_3246 = null;
      GameStringStatics.aClass94_3251 = null;
    }
  }

  public static void method167(int var0) {
    if (KeyboardStatics.KEYBOARD != null) {
      Keyboard var1 = KeyboardStatics.KEYBOARD;
      synchronized (var1) {
        KeyboardStatics.KEYBOARD = null;
      }
    }

    if (var0 != 0) {
      GlobalStatics_9.method171(119, -44, -76, -104, 29, -65, 34, 18, 104);
    }
  }

  public static void method168(int var0) {
    GameStringStatics.aClass94_3040 = null;
    if (var0 != -1771542303) {
      GlobalStatics_9.aClass3_Sub28_Sub5Array3041 = null;
    }

    GlobalStatics_9.aClass3_Sub28_Sub5Array3041 = null;
    GameStringStatics.aClass94_3039 = null;
    GlobalStatics_9.SECURE_BUFFER = null;
  }

  public static void method169(int var0) {
    DummyClass34.method995();
    if (var0 != 22230) {
      GlobalStatics_9.method167(124);
    }

    for (int var1 = 0; var1 < 4; ++var1) {
      com.jagex.runescape.statics.GlobalStatics_0.collisionMaps[var1]
          .method1496(var0 - 22230);
    }

    System.gc();
  }

  public static Class method170(int var0, String var1)
      throws ClassNotFoundException {

    return var1.equals("B") ?
        Byte.TYPE :
        var1.equals("I") ? Integer.TYPE : var1.equals("S") ?
            Short.TYPE :
            var1.equals("J") ? Long.TYPE : var1.equals("Z") ?
                Boolean.TYPE :
                var1.equals("F") ?
                    Float.TYPE :
                    var1.equals("D") ?
                        Double.TYPE :
                        var1.equals("C") ? Character.TYPE
                            : Class.forName(var1);
  }

  public static void method171(int var0, int var1, int var2, int var3, int var4,
      int var5, int var6,
      int var7, int var8) {
    if (var0 != -101) {
      GlobalStatics_9.method167(-46);
    }

    if (GlobalStatics_11.method57(var1, 104)) {
      GlobalStatics_6
          .method1095(var2, var8, var4,
              GlobalStatics_9.aClass11ArrayArray1834[var1], var3, -1,
              var7,
              var6, (byte) 119, var5);
    } else {
      if (var5 == -1) {
        for (int var9 = 0; var9 < 100; ++var9) {
          GlobalStatics_9.aBooleanArray3674[var9] = true;
        }
      } else {
        GlobalStatics_9.aBooleanArray3674[var5] = true;
      }

    }
  }

  public static void method312(int var0, int var1, int var2, Player var3,
      int var4) {
    if (GlobalStatics_9.localPlayer != var3) {
      if (GlobalStatics_10.amountContextActions < 400) {
        GameString var5;
        if (var3.skillTotal == 0) {
          boolean var6 = true;
          if (GlobalStatics_9.localPlayer.anInt3970 != -1 && var3.anInt3970
              != -1) {
            int var7 =
                var3.combatLevel < GlobalStatics_9.localPlayer.combatLevel ?
                    GlobalStatics_9.localPlayer.combatLevel :
                    var3.combatLevel;
            int var8 =
                GlobalStatics_9.localPlayer.anInt3970 < var3.anInt3970 ?
                    GlobalStatics_9.localPlayer.anInt3970 :
                    var3.anInt3970;
            int var9 = 5 + var7 * 10 / 100 + var8;
            int var10 =
                -var3.combatLevel + GlobalStatics_9.localPlayer.combatLevel;
            if (var10 < 0) {
              var10 = -var10;
            }

            if (var9 < var10) {
              var6 = false;
            }
          }

          GameString var13 =
              GlobalStatics_5.gameId == 1 ? GameStringStatics.aClass94_2526
                  : DummyClass32.aClass94_525;
          if (var3.combatLevel < var3.anInt3965) {
            var5 = GlobalStatics_9.concat(new GameString[]{
                var3.getFullName(), var6 ?
                GlobalStatics_9.method1295(var3.combatLevel, (byte) -73,
                    GlobalStatics_9.localPlayer.combatLevel) :
                GameStringStatics.aClass94_2562,
                GameStringStatics.aClass94_1072,
                var13,
                GlobalStatics_9.toString(var3.combatLevel),
                DummyClass59.aClass94_673,
                GlobalStatics_9.toString(var3.anInt3965 - var3.combatLevel),
                GameStringStatics.aClass94_2335
            });
          } else {
            var5 = GlobalStatics_9.concat(new GameString[]{
                var3.getFullName(), var6 ?
                GlobalStatics_9.method1295(var3.combatLevel, (byte) -128,
                    GlobalStatics_9.localPlayer.combatLevel) :
                GameStringStatics.aClass94_2562,
                GameStringStatics.aClass94_1072,
                var13,
                GlobalStatics_9.toString(var3.combatLevel),
                GameStringStatics.aClass94_2335
            });
          }
        } else {
          var5 = GlobalStatics_9.concat(new GameString[]{
              var3.getFullName(), GameStringStatics.aClass94_1072,
              DummyClass32.SKILL,
              GlobalStatics_9.toString(var3.skillTotal),
              GameStringStatics.aClass94_2335
          });
        }

        int var12;
        if (GlobalStatics_9.anInt3012 == 1) {
          GlobalStatics_9.method1177(DummyClass54.anInt1403, var0, (byte) -80,
              GlobalStatics_9.concat(
                  new GameString[]{GameStringStatics.aClass94_378,
                      DummyClass42.aClass94_892,
                      var5}),
              var4, (short) 1, GameStringStatics.aClass94_3388, var2);
          ++GlobalStatics_9.anInt2684;
        } else if (!GlobalStatics_9.aBoolean1837) {
          for (var12 = 7; var12 >= 0; --var12) {
            if (GlobalStatics_7.playerOptions[var12] != null) {
              ++GlobalStatics_7.anInt880;
              short var14 = 0;
              boolean var16 = false;
              if (GlobalStatics_5.gameId == 0
                  && GlobalStatics_7.playerOptions[var12]
                  .method1531(GameStringStatics.aClass94_3427)) {
                if (var3.combatLevel
                    > GlobalStatics_9.localPlayer.combatLevel) {
                  var14 = 2000;
                }

                if (GlobalStatics_9.localPlayer.anInt3956 != 0
                    && var3.anInt3956 != 0) {
                  if (GlobalStatics_9.localPlayer.anInt3956
                      == var3.anInt3956) {
                    var14 = 2000;
                  } else {
                    var14 = 0;
                  }
                }
              } else if (DummyClass3.aBooleanArray54[var12]) {
                var14 = 2000;
              }

              short var15 = GlobalStatics_7.aShortArray2167[var12];
              var15 += var14;
              GlobalStatics_9.method1177(GlobalStatics_10.anIntArray3328[var12],
                  var0,
                  (byte) -73, GlobalStatics_9.concat(
                      new GameString[]{GameStringStatics.aClass94_2562, var5}),
                  var4, var15,
                  GlobalStatics_7.playerOptions[var12], var2);
            }
          }
        } else if ((8 & GlobalStatics_9.anInt2051) != 0) {
          ++GlobalStatics_10.anInt3151;
          GlobalStatics_9
              .method1177(GlobalStatics_6.anInt1887, var0, (byte) -58,
                  GlobalStatics_9.concat(
                      new GameString[]{DummyClass59.aClass94_676,
                          DummyClass42.aClass94_892, var5}),
                  var4, (short) 15, GameStringStatics.aClass94_3621, var2);
        }

        if (var1 <= 0) {
          GlobalStatics_9.lastWrittenTime = -79L;
        }

        for (var12 = 0; GlobalStatics_10.amountContextActions > var12;
            ++var12) {
          if (GlobalStatics_10.aShortArray3095[var12] == 60) {
            DummyClass8.aClass94Array4016[var12] = GlobalStatics_9.concat(
                new GameString[]{GameStringStatics.aClass94_2562, var5});
            break;
          }
        }

      }
    }
  }

  public static void method313(byte var0) {
    if (var0 <= 51) {
      GlobalStatics_9.method312(77, -52, -42, null, 120);
    }

    GlobalStatics_9.method2257(96);
    GlobalStatics_6.method128(2);
    DummyClass8.method2220(0);
    GlobalStatics_9.method139(69);
    GlobalStatics_9.method512((byte) -108);
    GLStatics.method1626((byte) -128);
    GlobalStatics_10.method182(true);
    GlobalStatics_10.method2077(true);
    GlobalStatics_9.method959(0);
    GlobalStatics_9.method716(14073);
    GlobalStatics_9.method370((byte) -73);
    GlobalStatics_9.method304(6799);
    DummyClass59.method1045(-19761);
    GlobalStatics_10.method183(-108);
    com.jagex.runescape.statics.GlobalStatics_0.method727(91);
    GlobalStatics_9.method397((byte) -41);
    if (GlobalStatics_10.usageMode != 0) {
      for (int var1 = 0; GlobalStatics_9.byteArrayPool.length > var1; ++var1) {
        GlobalStatics_9.byteArrayPool[var1] = null;
      }

      DummyClass42.anInt893 = 0;
    }

    DummyClass58.method1659(16712751);
    GlobalStatics_9.method142(true);
    GlobalStatics_9.aClass93_1135.method1524(3);
    if (!GlRenderer.USE_OPENGL) {
      ((TextureCache) GLStatics.textureCache).method1618(0);
    }

    DummyClass42.aClass47_885.method1101(2);
    GlobalStatics_9.animationFrames.method2137((byte) 56);
    GlobalStatics_9.animationBases.method2137((byte) 56);
    GlobalStatics_8.widgets.method2137((byte) 56);
    GlobalStatics_5.soundEffects.method2137((byte) 56);
    GlobalStatics_10.maps.method2137((byte) 56);
    GlobalStatics_9.fileUnpacker6.method2137((byte) 56);
    DummyClass13.models.method2137((byte) 56);
    GlobalStatics_10.sprites.method2137((byte) 56);
    GlobalStatics_10.fileUnpacker10.method2137((byte) 56);
    GlobalStatics_2.fileUnpacker11.method2137((byte) 56);
    GlobalStatics_10.scripts.method2137((byte) 56);
    GlobalStatics_9.aClass93_3130.method1524(3);
  }

  public static void method315(int var0) {
    GlobalStatics_9.projectiles = null;
    GlobalStatics_9.anIntArray3367 = null;

    GameStringStatics.aClass94_3368 = null;
  }

  public static void method316(CollisionMap[] var0, int var1, byte[] var2,
      int var3, int var4,
      int var5, int var6, boolean var7, int var8, int var9, byte var10) {
    if (var10 == -54) {
      int var12 = -1;
      Buffer var11 = new Buffer(var2);

      while (true) {
        int var13 = var11.method773((byte) -127);
        if (var13 == 0) {
          return;
        }

        var12 += var13;
        int var14 = 0;

        while (true) {
          int var15 = var11.readUnsignedShortSmart();
          if (var15 == 0) {
            break;
          }

          var14 += -1 + var15;
          int var16 = 63 & var14;
          int var17 = var14 >> 6 & 63;
          int var18 = var14 >> 12;
          int var19 = var11.readUnsignedByte();
          int var20 = var19 >> 2;
          int var21 = 3 & var19;
          if (var3 == var18 && var17 >= var8 && var17 < 8 + var8
              && var9 <= var16
              && 8 + var9 > var16) {
            GameObjectConfig var22 = DummyClass11.method2207(4, var12);
            int var23 =
                GlobalStatics_10
                    .method121(var16 & 7, var4, var21, var22.anInt1485,
                        var22.anInt1480,
                        1, 7 & var17) + var5;
            int var24 =
                GlobalStatics_9
                    .method1863(var22.anInt1480, var4, (byte) 126,
                        var22.anInt1485,
                        7 & var17,
                        var21, 7 & var16) + var6;
            if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
              CollisionMap var25 = null;
              if (!var7) {
                int var26 = var1;
                if ((GlobalStatics_10.tileFlags[1][var23][var24] & 2)
                    == 2) {
                  var26 = var1 - 1;
                }

                if (var26 >= 0) {
                  var25 = var0[var26];
                }
              }

              DummyClass31
                  .method1683(var1, !var7, var1, var7, var25, var12, var20,
                      var23,
                      (byte) 50, var24, 3 & var21 + var4);
            }
          }
        }
      }
    }
  }
}
