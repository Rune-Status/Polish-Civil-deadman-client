package com.jagex.runescape;

import com.jagex.runescape.opengl.GlEnvironment;

public final class BlockConfig {

  public static CollisionMap[] collisionMaps = new CollisionMap[4];
  public static FileCache tableCache;
  public static int sunPositionZ;
  public static AudioStreamEncoder4 aClass3_Sub24_Sub4_1193;
  public static HashTable aClass130_1194;
  private static GameString aClass94_1176 = GameString.create("Loading wordpack )2 ");
  private static GameString aClass94_1192 = GameString.create("Examine");
  public static GameString aClass94_1179 = GameString.create("Veuillez patienter)3)3)3");
  public static GameString COMMAND_REBUILD = GameString.create("::rebuild");
  public static int screenLowerY;
  public static GameString aClass94_1183 = BlockConfig.aClass94_1176;
  public static GameString aClass94_1180 = BlockConfig.aClass94_1192;
  public int anInt1175;
  public int anInt1177;
  public int sunPosZ;
  public int sunPositionY;
  public int anInt1184;
  public int sunPositionX;
  public float aFloat1187;
  public float aFloat1189;
  public float aFloat1190;

  public BlockConfig() {
    this.anInt1177 = GlEnvironment.defaultSunColor;
      this.aFloat1189 = 1.2F;
      this.sunPosZ = -50;
      this.aFloat1187 = 1.1523438F;
      this.anInt1175 = GlEnvironment.defaultFogColor;
      this.sunPositionY = -60;
      this.aFloat1190 = 0.69921875F;
      this.anInt1184 = 0;
      this.sunPositionX = -50;
  }

  public BlockConfig(Buffer var1 ) {
    int var2 = var1.readUnsignedByte();
      if (~(var2 & 1) == -1) {
        this.anInt1177 = GlEnvironment.defaultSunColor;
      } else {
        this.anInt1177 = var1.readInt();
      }

      if (~(2 & var2) == -1) {
        this.aFloat1187 = 1.1523438F;
      } else {
        this.aFloat1187 = var1.readUnsignedShort() / 256.0F;
      }

      if ((var2 & 4) == 0) {
        this.aFloat1190 = 0.69921875F;
      } else {
        this.aFloat1190 = var1.readUnsignedShort() / 256.0F;
      }

      if (~(var2 & 8) == -1) {
        this.aFloat1189 = 1.2F;
      } else {
        this.aFloat1189 = var1.readUnsignedShort() / 256.0F;
      }

      if (~(16 & var2) == -1) {
        this.sunPosZ = -50;
        this.sunPositionX = -50;
        this.sunPositionY = -60;
      } else {
        this.sunPositionX = var1.method787((byte) 53);
        this.sunPositionY = var1.method787((byte) 15);
        this.sunPosZ = var1.method787((byte) 50);
      }

      if ((32 & var2) == 0) {
        this.anInt1175 = GlEnvironment.defaultFogColor;
      } else {
        this.anInt1175 = var1.readInt();
      }

      if (~(64 & var2) == -1) {
        this.anInt1184 = 0;
      } else {
        this.anInt1184 = var1.readUnsignedShort();
      }
  }

  public static void method1427(boolean var0, int var1) {
    if (var1 == -1 && !MidiSomething.aBoolean1158) {
        SceneNode.method1870(false);
      } else if (var1 != -1 && (AbstractFrameRegulator.anInt1691 != var1 || !BitVariable.method1391(
        -1)) && BZipDecompressorState.anInt120 != 0 && !MidiSomething.aBoolean1158) {
        AbstractFileRequester.method2099(true, var1, 0, SomethingTexture1.fileUnpacker6, false,
          BZipDecompressorState.anInt120, 2);
      }

      if (!var0) {
        BlockConfig.aClass94_1192 = null;
      }

      AbstractFrameRegulator.anInt1691 = var1;
  }

  public static void method1428(int var0, int var1, int var2) {
    if (var1 < 21) {
        BlockConfig.method1430(34, -13);
      }

      DummyClass5.anIntArray2985[var0] = var2;
      VariableUpdate var3 = (VariableUpdate) ClientScript.variableUpdates.get(
          var0);
      if (var3 == null) {
        var3 = new VariableUpdate(Time.getCurrentTimeMillis() - -500L);
        ClientScript.variableUpdates.put(var0, var3);
      } else {
        var3.timestamp = 500L + Time.getCurrentTimeMillis();
      }
  }

  public static void method1429(byte var0) {
    BlockConfig.aClass3_Sub24_Sub4_1193 = null;
      BlockConfig.COMMAND_REBUILD = null;
      BlockConfig.collisionMaps = null;
      BlockConfig.aClass94_1192 = null;
      BlockConfig.aClass94_1183 = null;
      BlockConfig.aClass94_1179 = null;
      BlockConfig.aClass94_1176 = null;
      BlockConfig.tableCache = null;
      BlockConfig.aClass130_1194 = null;
      BlockConfig.aClass94_1180 = null;
  }

  public static SoftwareFont method1430(int var0, int var1) {
    if (var0 == -28922) {
        SoftwareFont var2 = (SoftwareFont) HashTableIterator.aClass93_1135.get(
            var1);
        if (var2 != null) {
          return var2;
        } else {
          byte[] var3 = FileUnpacker.fileUnpacker13.getBytes(var1, 0);
          var2 = new SoftwareFont(var3);
          var2.method697(TextureSampler0.aClass109Array3270, null);
          HashTableIterator.aClass93_1135.get((byte) -96, var2, var1);
          return var2;
        }
      } else {
        return null;
      }
  }

}
