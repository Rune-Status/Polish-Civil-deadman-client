package com.jagex.runescape;

import com.jagex.runescape.buffer.BufferStatics;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.opengl.GlTexture2d;

public final class BZipDecompressorState {

  public static byte[][][] tileFlags = new byte[4][104][104];
  public static GameString FILE_RUNES = GameStringStatics.create("runes");
  public static int anInt120 = 255;
  public static GameString COMMAND_PREFIX = GameStringStatics.create("::");
  public static int anInt136;
  public static int anInt144;
  public static GameString aClass94_145 = GameStringStatics.create("gelb:");
  public int[][] anIntArrayArray108 = new int[6][258];
  public byte[] aByteArray109 = new byte[4096];
  public int[][] anIntArrayArray110 = new int[6][258];
  public byte aByte111;
  public boolean[] aBooleanArray112 = new boolean[256];
  public byte[] aByteArray114 = new byte[256];
  public int[][] anIntArrayArray115 = new int[6][258];
  public int anInt116;
  public byte[] aByteArray117;
  public int anInt118;
  public int anInt121;
  public int[] anIntArray122 = new int[257];
  public int[] anIntArray123 = new int[16];
  public boolean[] aBooleanArray124 = new boolean[16];
  public int anInt126;
  public byte[] aByteArray127;
  public int anInt128;
  public int anInt129;
  public byte[] aByteArray130 = new byte[18002];
  public int anInt131;
  public int anInt133;
  public int[] anIntArray134 = new int[256];
  public int anInt135;
  public int anInt137;
  public int[] anIntArray138 = new int[6];
  public byte[] aByteArray139 = new byte[18002];
  public int anInt140;
  public int anInt141;
  public int anInt142;
  public int anInt143;
  public byte[][] aByteArrayArray146 = new byte[6][258];
  public int anInt147;


  public static void method848(int var0) {
    if (AbstractGameWorld.aFloat727 < NPC.aFloat3979) {
        AbstractGameWorld.aFloat727 = (float) (AbstractGameWorld.aFloat727
          + AbstractGameWorld.aFloat727 / 30.0D);
        if (NPC.aFloat3979 < AbstractGameWorld.aFloat727) {
          AbstractGameWorld.aFloat727 = NPC.aFloat3979;
        }

        SomethingInScenePacket202.method117((byte) 87);
      } else if (NPC.aFloat3979 < AbstractGameWorld.aFloat727) {
        AbstractGameWorld.aFloat727 = (float) (AbstractGameWorld.aFloat727
          - AbstractGameWorld.aFloat727 / 30.0D);
        if (NPC.aFloat3979 > AbstractGameWorld.aFloat727) {
          AbstractGameWorld.aFloat727 = NPC.aFloat3979;
        }

        SomethingInScenePacket202.method117((byte) 87);
      }

      if ((ProceduralTexture.anInt1150 != -1) && TextureSampler13.anInt3362 != -1) {
        int var1 = -SomethingQuickChat2.anInt3536 + ProceduralTexture.anInt1150;
        if (var1 < 2 || (var1 > 2)) {
          var1 >>= 4;
        }

        int var2 = -SpawnedGameObject.anInt2251 + TextureSampler13.anInt3362;
        if (var2 < 2 || var2 > 2) {
          var2 >>= 4;
        }

        SpawnedGameObject.anInt2251 -= -var2;
        SomethingQuickChat2.anInt3536 += var1;
        if (var1 == 0 && var2 == 0) {
          ProceduralTexture.anInt1150 = -1;
          TextureSampler13.anInt3362 = -1;
        }

        SomethingInScenePacket202.method117((byte) 87);
      }

      if (var0 != 4) {
        BZipDecompressorState.COMMAND_PREFIX = null;
      }
  }

  public static void method849(int var0) {
    BZipDecompressorState.aClass94_145 = null;
      if (var0 == 2) {
        BufferStatics.aByteArrayArray125 = null;
        BZipDecompressorState.FILE_RUNES = null;
        BZipDecompressorState.COMMAND_PREFIX = null;
        BZipDecompressorState.tileFlags = null;
      }
  }

  public static void method850(byte var0) {
    TextureSampler24.aClass94_3142 = InventoryConfig.aClass94_3649;
      StillGraphicNode.aClass94_3546 = SomethingAudio.aClass94_2002;
      VertexNormal.aClass94_825 = NpcConfiguration.aClass94_1281;
      DummyClass44.aClass94_935 = DummyClass10.aClass94_2086;
      DummyClass32.SKILL = DummyClass1.aClass94_415;
      GlobalStatics_0.aClass94_1180 = TextureSampler26.aClass94_3079;
      GlobalStatics_0.aClass94_1183 = DummyClass50.aClass94_1143;
      DummyClass14.aClass94_1962 = WidgetAccess.aClass94_2207;
      TextureSampler30.aClass94_3124 = DummyClass4.aClass94_3002;
      GameCanvas.aClass94_36 = TextureSampler9.aClass94_3106;
      TextureSampler35.aClass94_3333 = DummyClass35.aClass94_667;
      TextureSampler36.aClass94_3427 = DummyClass49.aClass94_1110;
      DummyClass8.aClass94_4024 = FileRequester.aClass94_2945;
      TextureSampler28.aClass94_3311 = TextureSampler20.aClass94_3157;
      RenderAnimation.aClass94_374 = AbstractFileRequest.aClass94_3634;
      FloorUnderlay.aClass94_1409 = Player.aClass94_3957;
      TriChromaticImageBuffer.aClass94_2481 = FaceNormal.aClass94_1636;
      GameObject.aClass94_2751 = NPC.aClass94_3991;
      SomethingAudio.CONNECTING_TO_UPDATE_SERVER = GlobalStatics_0.aClass94_2585;
      if (var0 != 121) {
        BZipDecompressorState.method848(-68);
      }

      Structure.aClass94_3645 = DummyClass45.aClass94_989;
      DummyHashTable.aClass94_1688 = DummyClass15.aClass94_1878;
      IdentityKit.aClass94_461 = DummyClass41.aClass94_868;
      TextureSampler36.aClass94_3426 = Keyboard.aClass94_1907;
      DummyClass30.aClass94_459 = AnimationSomething.aClass94_3585;
      SubNode.aClass94_2576 = BufferObject.aClass94_1882;
      SceneGraphTile.aClass94_2216 = GlobalStatics_0.aClass94_1179;
      GlTexture2d.aClass94_3762 = TextureSampler31.aClass94_3172;
      TextureSampler30.aClass94_3117 = DummyClass4.aClass94_3002;
      FileCacheRequest.aClass94_4058 = TextureSampler20.aClass94_3146;
      GameClient.aClass94_2196 = DummyClass58.aClass94_1459;
      Structure.aClass94_3643 = AbstractObjectNodeWrapper.aClass94_1621;
      NPC.aClass94_3988 = Light.aClass94_699;
      DummyClass27.aClass94_1583 = SomethingTilek.OK;
      DummyClass53.aClass94_1335 = SomethingInScenePacket202.aClass94_2274;
      TextureSampler31.aClass94_3167 = AbstractFileRequest.aClass94_3633;
      DummyClass5.aClass94_2991 = AnimationSomething.aClass94_3583;
      SomethingInScenePacket202.aClass94_2267 = InventoryConfig.aClass94_3646;
      SomethingSceneJ.aClass94_327 = DummyClass35.aClass94_659;
      DummyClass14.ATTEMPTING_TO_RECONNECT = GlTexture2d.aClass94_3758;
      SpotAnimationConfig.aClass94_551 = TextureSampler32.aClass94_3345;
      TextureSampler18.aClass94_4040 = BitVariable.aClass94_1122;
      WorldMapLabel.aClass94_1731 = TextureSampler15.aClass94_3206;
      GlobalStatics_0.aClass94_2151 = TextureSampler11.aClass94_3251;
      GameObject.OPTION_DROP = AudioSomethingSomething.aClass94_2518;
      DummyInputStream.aClass94_43 = TextureSampler1.aClass94_3131;
      DummyClass42.DEFAULT_WALK_TOOLTIP = SpawnedGameObject.aClass94_2252;
      Light.aClass94_691 = InventoryConfig.aClass94_3656;
      SomethingQuickChat.aClass94_3575 = SomethingSceneJ.aClass94_325;
      OndemandFileRequest.aClass94_4071 = DummyClass20.aClass94_1783;
      TextureSampler38.aClass94_3445 = FileCacheRequester.aClass94_1089;
      ClientScript.aClass94_3691 = GlobalStatics_0.aClass94_77;
      GameWorld.aClass94_2624 = LightIntensity.aClass94_897;
      DummyClass15.aClass94_1879 = GlobalStatics_0.aClass94_2594;
      TextureSampler29.aClass94_3397 = DummyClass20.aClass94_1782;
      AudioSomethingSomething.aClass94_2526 = DummyClass26.aClass94_1612;
      RenderAnimation.aClass94_361 = SpotAnimationConfig.aClass94_550;
      TextureSampler27.aClass94_3097 = InventoryConfig.aClass94_3650;
      SomethingMidiFile.aClass94_2285 = DummyClass45.aClass94_988;
      StillGraphicNode.aClass94_3544 = TextureSampler36.aClass94_3436;
      GameStub.aClass94_4 = ISAACCipher.aClass94_973;
      MapScene.aClass94_62 = FileCacheRequester.aClass94_1085;
      SomethingTexture4.aClass94_2667 = GameObjectConfig.aClass94_1508;
      IdentityKit.aClass94_462 = ProjectileNode.aClass94_3771;
      WidgetAccess.aClass94_2210 = AudioWorker.aClass94_343;
      GlobalStatics_0.aClass94_1707 = LightIntensity.aClass94_905;
      FileRequester.aClass94_2961 = DummyClass32.aClass94_520;
      FileTable.aClass94_957 = DummyClass1.aClass94_412;
      DummyClass35.aClass94_662 = DummyClass5.aClass94_2995;
      DummyClass12.aClass94_2031 = GameCanvas.aClass94_35;
      DummyClass26.aClass94_1615 = AnimationFrame.aClass94_2458;
      AbstractFileRequest.aClass94_3629 = DummyClass39.aClass94_738;
      AnimationSomething.aClass94_3584 = SomethingTexture1.aClass94_2641;
      DummyClass32.aClass94_525 = DummyClass45.aClass94_982;
      AnimationSomething.aClass94_3586 = SomethingTexture1.aClass94_2641;
      WorldMapLabel.aClass94_1722 = DummyClass45.aClass94_981;
      SceneShadowMap.CONNECTION_LOST = TextureSampler28.aClass94_3302;
      BufferObject.aClass94_1884 = NpcConfiguration.aClass94_1294;
      GlobalStatics_0.LOADED_INTERFACES = FileTable.aClass94_951;
      SceneSomething.aClass94_485 = DummyCanvas.aClass94_24;
      TextureSampler11.aClass94_3249 = ProjectileNode.aClass94_3774;
      DummyClass35.aClass94_666 = DummyClass5.aClass94_2995;
      ItemConfig.aClass94_809 = TextureSampler30.aClass94_3119;
      TextureSampler33.aClass94_3051 = AbstractObjectNodeWrapper.aClass94_1620;
      TextureSampler39.LOADING_PLEASE_WAIT = GameObjectConfig.aClass94_1523;
      DisplayMode.CONNECTED_TO_UPDATE_SERVER = TextureSampler18.aClass94_4036;
      VertexNormal.aClass94_822 = GameStub.aClass94_7;
      Unsure.aClass94_1892 = GameObjectConfig.aClass94_1509;
      TextureSampler14.aClass94_3388 = DummyClass34.aClass94_593;
      DummyClass32.aClass94_523 = GlobalStatics_0.aClass94_2599;
      DummyClass24.aClass94_1653 = Light.aClass94_701;
  }

}
