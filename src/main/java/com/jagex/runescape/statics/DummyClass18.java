package com.jagex.runescape.statics;

import com.jagex.runescape.camera.CameraStatics;
import com.jagex.runescape.model.SpawnedGameObject;
import com.jagex.runescape.model.StillGraphic;
import com.jagex.runescape.model.StillGraphicNode;
import com.jagex.runescape.model.Widget;
import com.jagex.runescape.model.WidgetAccess;
import com.jagex.runescape.model.WidgetUpdate;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.model.AnimationSequence;
import com.jagex.runescape.model.ClanChatUser;
import com.jagex.runescape.model.ClientScriptCall;
import com.jagex.runescape.model.HintMarker;
import com.jagex.runescape.model.ItemConfig;
import com.jagex.runescape.model.NPC;
import com.jagex.runescape.model.Player;
import com.jagex.runescape.model.RenderAnimation;
import com.jagex.runescape.model.SomethingPacket116;
import com.jagex.runescape.model.SomethingPacket151;
import com.jagex.runescape.node.Deque;
import com.jagex.runescape.opengl.GLStatics;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public final class DummyClass18 {

  public static int anInt79;
  public static int anInt80;
  public static byte[][][] aByteArrayArrayArray81;
  public static Deque aClass61_82 = new Deque();
  public static short aShort83 = 32767;
  public static RenderAnimation DEFAULT_RENDER_ANIMATION = new RenderAnimation();
  public static GameString aClass94_85 = GameStringStatics.create("overlay");
  public static int anInt86;
  public static int anInt87;
  public static Widget aClass11_88;

  public static int method823(int planeY, int planeX, int plane) {

    return (8 & GlobalStatics_10.tileFlags[plane][planeX][planeY]) == 0 ?
        plane > 0 && (GlobalStatics_10.tileFlags[1][planeX][planeY] & 2) != 0 ?
            -1 + plane :
            plane :
        0;
  }

  public static void method824(long[] var0, Object[] var1, int var2) {
    DummyClass21.method1809(var0.length - 1, var0, 122, 0, var1);
  }

  public static void method825(byte var0, int var1) {
    WidgetUpdate var3 = GlobalStatics_6.method466(4, 1, var1);
    var3.createIndexedColorSprite(true);
  }

  public static int method826(GameString var0, int var1) {
    if (var1 != -1) {
      DummyClass18.method826(null, 65);
    }

    if (var0 != null) {
      for (int var2 = 0; GlobalStatics_10.anInt104 > var2; ++var2) {
        if (var0.method1531(GameStringStatics.aClass94Array1046[var2])) {
          return var2;
        }
      }

      return -1;
    } else {
      return -1;
    }
  }

  public static boolean parsePacket(byte var0) throws IOException {
    if (GlobalStatics_9.GAME_SOCKET == null) {
      return false;
    }
    int available = GlobalStatics_9.GAME_SOCKET.available();
    if (available == 0) {
      return false;
    }
    if (GlobalStatics_0.packetId == -1) {
      GlobalStatics_9.GAME_SOCKET.readBytes(GlobalStatics_9.GAME_BUFFER.bytes, 0, 1);
      GlobalStatics_9.GAME_BUFFER.position = 0;
      GlobalStatics_0.packetId = GlobalStatics_9.GAME_BUFFER.readPacketId();
      GlobalStatics_0.packetLength = GlobalStatics_9.PACKET_LENGTHS[GlobalStatics_0.packetId];
      --available;
    }

    if (GlobalStatics_0.packetLength == -1) {
      if (available <= 0) {
        return false;
      }
      GlobalStatics_9.GAME_SOCKET.readBytes(GlobalStatics_9.GAME_BUFFER.bytes, 0, 1);
      GlobalStatics_0.packetLength = GlobalStatics_9.GAME_BUFFER.bytes[0] & 255;
      --available;
    }

    if (GlobalStatics_0.packetLength == -2) {
      if (available <= 1) {
        return false;
      }

      available -= 2;
      GlobalStatics_9.GAME_SOCKET.readBytes(GlobalStatics_9.GAME_BUFFER.bytes, 0, 2);
      GlobalStatics_9.GAME_BUFFER.position = 0;
      GlobalStatics_0.packetLength = GlobalStatics_9.GAME_BUFFER
          .readUnsignedShort();
    }

    if (GlobalStatics_0.packetLength > available) {
      return false;
    }
    GlobalStatics_9.GAME_BUFFER.position = 0;
    GlobalStatics_9.GAME_SOCKET.readBytes(GlobalStatics_9.GAME_BUFFER.bytes, 0,
        GlobalStatics_0.packetLength);
    GlobalStatics_9.lastPacketId2 = GlobalStatics_7.lastPacketId1;
    GlobalStatics_7.lastPacketId1 = GlobalStatics_0.lastPacketId0;
    GlobalStatics_0.lastPacketId0 = GlobalStatics_0.packetId;
    GlobalStatics_2.anInt3699 = 0;

    int var20;
    // Update variable small
    if (GlobalStatics_0.packetId == 60) {
      int id = GlobalStatics_9.GAME_BUFFER.readUnsignedShortAdd();
      byte value = GlobalStatics_9.GAME_BUFFER.readByteNegate();
      GlobalStatics_10.updateVariable(id, value);
      GlobalStatics_0.packetId = -1;
      return true;
    }

    int var5;
    GameString var24;

    // Execute script
    if (GlobalStatics_0.packetId == 115) {
      int a = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
      GameString b = GlobalStatics_9.GAME_BUFFER.readString();
      Object[] arguments = new Object[b.getLength() + 1];

      for (var5 = b.getLength() - 1; var5 >= 0; --var5) {
        if (b.charAt(var5) == 115) {
          arguments[1 + var5] = GlobalStatics_9.GAME_BUFFER.readString();
        } else {
          arguments[1 + var5] = new Integer(
              GlobalStatics_9.GAME_BUFFER.readInt());
        }
      }
      arguments[0] = new Integer(GlobalStatics_9.GAME_BUFFER.readInt());
      if (GlobalStatics_5.updateInterfaceCounter(a, (byte) -25)) {
        ClientScriptCall call = new ClientScriptCall();
        call.arguments = arguments;
        GLStatics.executeScript(call);
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }

    long var4;
    boolean var31;
    int var30;
    GameString var41;
    if (GlobalStatics_0.packetId == 70) {
      GameString var70 = GlobalStatics_9.GAME_BUFFER.readString();
      if (var70.endsWith(DummyClass26.TRADE_REQUEST)) {
        var24 = var70
            .substring(var70.indexOf(GlobalStatics_5.aClass94_1970),
                0, 0);
        var4 = var24.toBase37();
        var31 = false;

        for (var30 = 0; var30 < GlobalStatics_6.anInt3591; ++var30) {
          if (GlobalStatics_9.aLongArray1574[var30] == var4) {
            var31 = true;
            break;
          }
        }

        if (!var31 && GlobalStatics_9.IS_ON_TUTORIAL_ISLAND == 0) {
          GlobalStatics_8.printMessage(var24, 4, GameStringStatics.aClass94_2285,
              var0 + 82);
        }
      } else {
        if (var70.endsWith(GameStringStatics.CHALLENGE_REQ)) {
          var24 = var70.substring(
              var70.indexOf(GlobalStatics_5.aClass94_1970), 0, 0);
          var4 = var24.toBase37();
          var31 = false;

          for (var30 = 0; GlobalStatics_6.anInt3591 > var30; ++var30) {
            if (GlobalStatics_9.aLongArray1574[var30] == var4) {
              var31 = true;
              break;
            }
          }

          if (!var31 && GlobalStatics_9.IS_ON_TUTORIAL_ISLAND == 0) {
            var41 = var70.substring(var70.getLength() - 9, var0 ^ -83,
                1 + var70.indexOf(GlobalStatics_5.aClass94_1970));
            GlobalStatics_8.printMessage(var24, 8, var41, var0 ^ 82);
          }
        } else if (var70.endsWith(GameStringStatics.ASSIST_REQ)) {
          var31 = false;
          var24 = var70.substring(
              var70.indexOf(GlobalStatics_5.aClass94_1970), 0, 0);
          var4 = var24.toBase37();

          for (var30 = 0; GlobalStatics_6.anInt3591 > var30; ++var30) {
            if (var4 == GlobalStatics_9.aLongArray1574[var30]) {
              var31 = true;
              break;
            }
          }

          if (!var31 && GlobalStatics_9.IS_ON_TUTORIAL_ISLAND == 0) {
            GlobalStatics_8
                .printMessage(var24, 10, GameStringStatics.EMPTY_STRING, -1);
          }
        } else if (var70.endsWith(GameStringStatics.aClass94_2482)) {
          var24 = var70
              .substring(var70.indexOf(GameStringStatics.aClass94_2482),
                  0, 0);
          GlobalStatics_8
              .printMessage(GameStringStatics.EMPTY_STRING, 11, var24, -1);
        } else if (var70.endsWith(GameStringStatics.aClass94_3998)) {
          var24 = var70
              .substring(var70.indexOf(GameStringStatics.aClass94_3998), 0, 0);
          if (GlobalStatics_9.IS_ON_TUTORIAL_ISLAND == 0) {
            GlobalStatics_8
                .printMessage(GameStringStatics.EMPTY_STRING, 12, var24, -1);
          }
        } else if (var70.endsWith(DummyClass15.aClass94_1877)) {
          var24 = var70
              .substring(var70.indexOf(DummyClass15.aClass94_1877), 0, 0);
          if (GlobalStatics_9.IS_ON_TUTORIAL_ISLAND == 0) {
            GlobalStatics_8
                .printMessage(GameStringStatics.EMPTY_STRING, 13, var24, -1);
          }
        } else if (!var70.endsWith(DummyClass32.aClass94_514)) {
          if (var70.endsWith(GameStringStatics.aClass94_965)) {
            var24 = var70.substring(
                var70.indexOf(GlobalStatics_5.aClass94_1970), 0, 0);
            var31 = false;
            var4 = var24.toBase37();

            for (var30 = 0; GlobalStatics_6.anInt3591 > var30; ++var30) {
              if (GlobalStatics_9.aLongArray1574[var30] == var4) {
                var31 = true;
                break;
              }
            }

            if (!var31 && GlobalStatics_9.IS_ON_TUTORIAL_ISLAND == 0) {
              GlobalStatics_8
                  .printMessage(var24, 15, GameStringStatics.EMPTY_STRING, -1);
            }
          } else {
            if (var70.endsWith(GameStringStatics.aClass94_3368)) {
              var24 =
                  var70.substring(
                      var70.indexOf(GlobalStatics_5.aClass94_1970),
                      0, 0);
              var4 = var24.toBase37();
              var31 = false;

              for (var30 = 0; GlobalStatics_6.anInt3591 > var30;
                  ++var30) {
                if (var4 == GlobalStatics_9.aLongArray1574[var30]) {
                  var31 = true;
                  break;
                }
              }

              if (!var31 && GlobalStatics_9.IS_ON_TUTORIAL_ISLAND == 0) {
                GlobalStatics_8
                    .printMessage(var24, 16, GameStringStatics.EMPTY_STRING, -1);
              }
            } else if (var70.endsWith(GlobalStatics_0.aClass94_2155)) {
              var24 =
                  var70.substring(
                      var70.indexOf(GlobalStatics_5.aClass94_1970),
                      var0 + 83,
                      0);
              var31 = false;
              var4 = var24.toBase37();

              for (var30 = 0; GlobalStatics_6.anInt3591 > var30;
                  ++var30) {
                if (GlobalStatics_9.aLongArray1574[var30] == var4) {
                  var31 = true;
                  break;
                }
              }

              if (!var31 && GlobalStatics_9.IS_ON_TUTORIAL_ISLAND == 0) {
                var41 = var70.substring(var70.getLength() - 9, var0 ^ -83,
                    1 + var70
                        .indexOf(GlobalStatics_5.aClass94_1970));
                GlobalStatics_8.printMessage(var24, 21, var41, -1);
              }
            } else {
              GlobalStatics_8
                  .printMessage(GameStringStatics.EMPTY_STRING, 0, var70,
                      var0 + 82);
            }
          }
        } else {
          var31 = false;
          var24 = var70.substring(
              var70.indexOf(GlobalStatics_5.aClass94_1970), 0, 0);
          var4 = var24.toBase37();

          for (var30 = 0; GlobalStatics_6.anInt3591 > var30; ++var30) {
            if (var4 == GlobalStatics_9.aLongArray1574[var30]) {
              var31 = true;
              break;
            }
          }

          if (!var31 && GlobalStatics_9.IS_ON_TUTORIAL_ISLAND == 0) {
            GlobalStatics_8
                .printMessage(var24, 14, GameStringStatics.EMPTY_STRING, -1);
          }
        }
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }
    int var3;
    GameString var58;

    // Set widget text
    //TODO
    if (GlobalStatics_0.packetId == 123) {
      int a = GlobalStatics_9.GAME_BUFFER.readUnsignedShortLE();
      int b = GlobalStatics_9.GAME_BUFFER.readUnsignedShortAdd();
      GameString c = GlobalStatics_9.GAME_BUFFER.readString();
      if (GlobalStatics_5.updateInterfaceCounter(b, (byte) -25)) {
        GlobalStatics_9.method295(c, (byte) 40, a);
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }

    // Bulk entity update
    if (GlobalStatics_0.packetId == 230) {
      DummyClass56.spawnSceneY = GlobalStatics_9.GAME_BUFFER
          .method751((byte) -88);
      DummyClass45.spawnSceneX = GlobalStatics_9.GAME_BUFFER.method754(true);

      while (GlobalStatics_0.packetLength
          > GlobalStatics_9.GAME_BUFFER.position) {
        GlobalStatics_0.packetId = GlobalStatics_9.GAME_BUFFER
            .readUnsignedByte();
        DummyClass37.parseEntityUpdate((byte) -82);
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 153) {
      GlobalStatics_0.packetId = -1;
      DummyClass45.anInt987 = 0;
      return true;
    }
    int var21;
    if (GlobalStatics_0.packetId == 220) {
      var20 = GlobalStatics_9.GAME_BUFFER.readInt((byte) -59);
      var3 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortLE();
      var21 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
      if (GlobalStatics_5.updateInterfaceCounter(var21, (byte) -25)) {
        GlobalStatics_10.method327(var3, var20, (byte) 68);
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }
    long var2;
    int var10;
    int var11;
    long var29;
    long var36;
    if (GlobalStatics_0.packetId == 81) {
      var2 = GlobalStatics_9.GAME_BUFFER.readLong();
      GlobalStatics_9.GAME_BUFFER.readByte();
      var4 = GlobalStatics_9.GAME_BUFFER.readLong();
      var29 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
      var36 = GlobalStatics_9.GAME_BUFFER.readUnsignedMedium((byte) 104);
      var10 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      boolean var63 = false;
      var11 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
      long var55 = (var29 << 32) + var36;
      int var54 = 0;

      label1521:
      while (true) {
        if (var54 < 100) {
          if (var55 != DummyClass8.aLongArray4017[var54]) {
            ++var54;
            continue;
          }

          var63 = true;
          break;
        }

        if (var10 <= 1) {
          for (var54 = 0; GlobalStatics_6.anInt3591 > var54; ++var54) {
            if (GlobalStatics_9.aLongArray1574[var54] == var2) {
              var63 = true;
              break label1521;
            }
          }
        }
        break;
      }

      if (!var63 && GlobalStatics_9.IS_ON_TUTORIAL_ISLAND == 0) {
        DummyClass8.aLongArray4017[GlobalStatics_9.anInt1921] = var55;
        GlobalStatics_9.anInt1921 = (1 + GlobalStatics_9.anInt1921) % 100;
        GameString var61 =
            GlobalStatics_0
                .method733(12345678, var11)
                .method555(28021, GlobalStatics_9.GAME_BUFFER);
        if (var10 != 2 && var10 != 3) {
          if (var10 == 1) {
            GlobalStatics_9.method611(var11, 20, var61,
                GameStringStatics.stringFromBase37(-29664, var4)
                    .formatName((byte) -50), (byte) 50,
                GlobalStatics_9.concat(new GameString[]{
                    DummyClass34.aClass94_592,
                    GameStringStatics
                        .stringFromBase37(var0 - 29581, var2).formatName(
                        (byte) -50)
                }));
          } else {
            GlobalStatics_9.method611(var11, 20, var61,
                GameStringStatics.stringFromBase37(var0 - 29581, var4)
                    .formatName((byte) -50), (byte) 50,
                GameStringStatics.stringFromBase37(-29664, var2)
                    .formatName((byte) -50));
          }
        } else {
          GlobalStatics_9.method611(var11, 20, var61,
              GameStringStatics.stringFromBase37(var0 - 29581, var4)
                  .formatName((byte) -50), (byte) 50,
              GlobalStatics_9.concat(new GameString[]{
                  DummyClass60.aClass94_444,
                  GameStringStatics.stringFromBase37(-29664, var2).formatName(
                      (byte) -50)
              }));
        }
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }
    int var6;
    int var8;
    boolean var32;
    if (GlobalStatics_0.packetId == 55) {
      DummyClass10.anInt2087 = GlobalStatics_10.anInt3213;
      var2 = GlobalStatics_9.GAME_BUFFER.readLong();
      if (var2 == 0L) {
        DummyClass12.aClass94_2035 = null;
        GlobalStatics_0.packetId = -1;
        GameStringStatics.aClass94_251 = null;
        GlobalStatics_6.aClass3_Sub19Array3694 = null;
        GlobalStatics_2.anInt2572 = 0;
        return true;
      } else {
        var4 = GlobalStatics_9.GAME_BUFFER.readLong();
        GameStringStatics.aClass94_251 = GameStringStatics
            .stringFromBase37(-29664, var4);
        DummyClass12.aClass94_2035 = GameStringStatics
            .stringFromBase37(var0 - 29581, var2);
        GlobalStatics_9.aByte3953 = GlobalStatics_9.GAME_BUFFER.readByte();
        var6 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
        if (var6 == 255) {
          GlobalStatics_0.packetId = -1;
          return true;
        } else {
          GlobalStatics_2.anInt2572 = var6;
          ClanChatUser[] var7 = new ClanChatUser[100];

          for (var8 = 0; GlobalStatics_2.anInt2572 > var8; ++var8) {
            var7[var8] = new ClanChatUser();
            var7[var8].key = GlobalStatics_9.GAME_BUFFER.readLong();
            var7[var8].name = GameStringStatics
                .stringFromBase37(var0 - 29581, var7[var8].key);
            var7[var8].anInt2478 = GlobalStatics_9.GAME_BUFFER
                .readUnsignedShort();
            var7[var8].aByte2472 = GlobalStatics_9.GAME_BUFFER.readByte();
            var7[var8].aClass94_2473 = GlobalStatics_9.GAME_BUFFER.readString();
            if (GlobalStatics_10.encodedUsername == var7[var8].key) {
              GlobalStatics_7.aByte1308 = var7[var8].aByte2472;
            }
          }

          var32 = false;
          var10 = GlobalStatics_2.anInt2572;

          while (var10 > 0) {
            var32 = true;
            --var10;

            for (var11 = 0; var10 > var11; ++var11) {
              if (var7[var11].name
                  .method1559(var7[var11 + 1].name, var0 ^ 82) > 0) {
                var32 = false;
                ClanChatUser var9 = var7[var11];
                var7[var11] = var7[1 + var11];
                var7[var11 + 1] = var9;
              }
            }

            if (var32) {
              break;
            }
          }

          GlobalStatics_6.aClass3_Sub19Array3694 = var7;
          GlobalStatics_0.packetId = -1;
          return true;
        }
      }
    }
    if (GlobalStatics_0.packetId == 164) {
      var20 = GlobalStatics_9.GAME_BUFFER.method780(-1);
      GlobalStatics_9.aClass64_1778 = DummyClass35.signLink
          .method1449(var0 ^ -82, var20);
      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 225) {
      DummyClass4.parsePlayerUpdate((byte) -122);
      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 48) {
      int a = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
      GameString b = GlobalStatics_9.GAME_BUFFER.readString();
      int c = GlobalStatics_9.GAME_BUFFER.readShortLEAdd();
      if (GlobalStatics_5.updateInterfaceCounter(a, (byte) -25)) {
        GlobalStatics_9.method295(b, (byte) 40, c);
      }
      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 232) {
      GlobalStatics_9.anInt3101 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      GlobalStatics_9.anInt467 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      DummyClass38.anInt734 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      GlobalStatics_0.packetId = -1;
      return true;
    }

    // com.jagex.runescape.done.Player option update
    GameString var56;
    if (GlobalStatics_0.packetId == 44) {
      var20 = GlobalStatics_9.GAME_BUFFER.readShortLEAdd();
      if (var20 == 0xffff) {
        var20 = -1;
      }

      var3 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      var21 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      var56 = GlobalStatics_9.GAME_BUFFER.readString();
      if (var21 >= 1 && var21 <= 8) {
        if (var56.method1531(GameStringStatics.aClass94_829)) {
          var56 = null;
        }

        GlobalStatics_7.playerOptions[-1 + var21] = var56;
        GlobalStatics_10.anIntArray3328[var21 - 1] = var20;
        DummyClass3.aBooleanArray54[var21 - 1] = var3 == 0;
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }

    // Update Variable large
    if (GlobalStatics_0.packetId == 226) {
      int value = GlobalStatics_9.GAME_BUFFER.readInt();
      int id = GlobalStatics_9.GAME_BUFFER.readUnsignedShortAdd();
      GlobalStatics_10.updateVariable(id, value);
      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 21) {
      var20 = GlobalStatics_9.GAME_BUFFER.method786(true);
      var3 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
      var21 = GlobalStatics_9.GAME_BUFFER.method782(var0 ^ 19);
      if (GlobalStatics_5.updateInterfaceCounter(var3, (byte) -25)) {
        GlobalStatics_9.method260(-16207, var21, var20);
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 145) {
      var20 = GlobalStatics_9.GAME_BUFFER.readShortLEAdd();
      var3 = GlobalStatics_9.GAME_BUFFER.method751((byte) -101);
      var21 = GlobalStatics_9.GAME_BUFFER.readShortLEAdd();
      if (GlobalStatics_5.updateInterfaceCounter(var21, (byte) -25)) {
        if (var3 == 2) {
          GlobalStatics_7.method834((byte) -86);
        }

        GlobalStatics_9.anInt3655 = var20;
        GlobalStatics_10.method232(var20, 16182);
        DummyClass23.method1746(false);
        GlobalStatics_10.method226(GlobalStatics_9.anInt3655, 69);

        for (var5 = 0; var5 < 100; ++var5) {
          GlobalStatics_9.aBooleanArray3674[var5] = true;
        }
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 69) {
      var20 = GlobalStatics_9.GAME_BUFFER.readShortLEAdd();
      var3 = GlobalStatics_9.GAME_BUFFER.readInt();
      var21 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortAdd();
      if (GlobalStatics_5.updateInterfaceCounter(var20, (byte) -25)) {
        GlobalStatics_10.method255(var21, var3, 1);
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 141) {
      var2 = GlobalStatics_9.GAME_BUFFER.readLong();
      var21 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
      var56 = GlobalStatics_0.method733(var0 + 12345761, var21)
          .method555(28021, GlobalStatics_9.GAME_BUFFER);
      GlobalStatics_9.method611(var21, 19, var56, null, (byte) 50,
          GameStringStatics.stringFromBase37(-29664, var2)
              .formatName((byte) -50));
      GlobalStatics_0.packetId = -1;
      return true;
    }

    // Write UID
    if (GlobalStatics_0.packetId == 169) {
      DummyClass11.writeUID(GlobalStatics_9.GAME_BUFFER, var0 ^ -43);
      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 89) {
      GlobalStatics_9.resetVariables(-117);
      GlobalStatics_8.method819(false);
      GlobalStatics_0.anInt641 += 32;
      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 125) {
      var20 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
      var3 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      var21 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      var5 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
      var6 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      var30 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      if (GlobalStatics_5.updateInterfaceCounter(var20, (byte) -25)) {
        GlobalStatics_9.method2238(var5, var21, var6, var3, (byte) -21, var30);
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 36) {
      var20 = GlobalStatics_9.GAME_BUFFER.readInt((byte) 122);
      var3 = GlobalStatics_9.GAME_BUFFER.method791((byte) 10);
      var21 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortAdd();
      if (GlobalStatics_5.updateInterfaceCounter(var21, (byte) -25)) {
        GlobalStatics_10.method1790(var20, var3, var0 + 178);
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }

    WidgetAccess var38;
    WidgetAccess var47;
    if (GlobalStatics_0.packetId == 9) {
      var20 = GlobalStatics_9.GAME_BUFFER.readShortLEAdd();
      var3 = GlobalStatics_9.GAME_BUFFER.method782(-101);
      var21 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortAdd();
      var5 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortLE();
      if (var5 == 65535) {
        var5 = -1;
      }

      var6 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortAdd();
      if (var6 == 65535) {
        var6 = -1;
      }

      if (GlobalStatics_5.updateInterfaceCounter(var21, (byte) -25)) {
        for (var30 = var6; var5 >= var30; ++var30) {
          var36 = var30 + ((long) var3 << 32);
          var47 = (WidgetAccess) DummyClass23.aClass130_1659.get(var36);
          if (var47 != null) {
            var38 = new WidgetAccess(var47.anInt2205, var20);
            var47.unlinkNode();
          } else if (var30 != -1) {
            var38 = new WidgetAccess(0, var20);
          } else {
            var38 = new WidgetAccess(
                GlobalStatics_7
                    .getWidget((byte) 119, var3).aClass3_Sub1_257.anInt2205,
                var20);
          }

          DummyClass23.aClass130_1659.put(var36, var38);
        }
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }

    int var33;
    if (GlobalStatics_0.packetId == 56) {
      var20 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
      var3 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortLE();
      var21 = GlobalStatics_9.GAME_BUFFER.method780(-1);
      var5 = GlobalStatics_9.GAME_BUFFER.readShortLEAdd();
      if (var21 >> 30 == 0) {
        AnimationSequence var53;
        if (var21 >> 29 != 0) {
          var6 = 0xffff & var21;
          NPC var62 = GlobalStatics_8.NPCS[var6];
          if (var62 != null) {
            if (var5 == 65535) {
              var5 = -1;
            }

            var32 = !(var5 != -1 && var62.anInt2842 != -1 &&
                GlobalStatics_8.method45(
                    GlobalStatics_9.method898((byte) 42, var5).anInt542,
                    (byte) -20).anInt1857 < GlobalStatics_8.method45(
                    GlobalStatics_9
                        .method898((byte) 42, var62.anInt2842).anInt542,
                    (byte) -20).anInt1857);

            if (var32) {
              var62.anInt2761 = 0;
              var62.anInt2842 = var5;
              var62.anInt2759 = GlobalStatics_4.updateCycle + var20;
              var62.anInt2805 = 0;
              if (var62.anInt2759 > GlobalStatics_4.updateCycle) {
                var62.anInt2805 = -1;
              }

              var62.anInt2799 = var3;
              var62.anInt2826 = 1;
              if (var62.anInt2842 != -1
                  && GlobalStatics_4.updateCycle == var62.anInt2759) {
                var33 = GlobalStatics_9
                    .method898((byte) 42, var62.anInt2842).anInt542;
                if (var33 != -1) {
                  var53 = GlobalStatics_8.method45(var33, (byte) -20);
                  if (var53 != null && var53.anIntArray1851 != null) {
                    GlobalStatics_4
                        .method1470(var62.sceneY, var53, 183921384,
                            var62.sceneX,
                            false, 0);
                  }
                }
              }
            }
          }
        } else if (var21 >> 28 != 0) {
          var6 = var21 & 0xffff;
          Player var60;
          if (GlobalStatics_10.LOCAL_PLAYER_ID == var6) {
            var60 = GlobalStatics_9.localPlayer;
          } else {
            var60 = GlobalStatics_9.players[var6];
          }

          if (var60 != null) {
            if (var5 == 0xffff) {
              var5 = -1;
            }

            var32 = !(var5 != -1 && var60.anInt2842 != -1 &&
                GlobalStatics_8.method45(
                    GlobalStatics_9.method898((byte) 42, var5).anInt542,
                    (byte) -20).anInt1857 < GlobalStatics_8.method45(
                    GlobalStatics_9
                        .method898((byte) 42, var60.anInt2842).anInt542,
                    (byte) -20).anInt1857);

            if (var32) {
              var60.anInt2759 = var20 + GlobalStatics_4.updateCycle;
              var60.anInt2799 = var3;
              var60.anInt2842 = var5;
              if (var60.anInt2842 == 65535) {
                var60.anInt2842 = -1;
              }

              var60.anInt2826 = 1;
              var60.anInt2761 = 0;
              var60.anInt2805 = 0;
              if (var60.anInt2759 > GlobalStatics_4.updateCycle) {
                var60.anInt2805 = -1;
              }

              if (var60.anInt2842 != -1 && var60.anInt2759
                  == GlobalStatics_4.updateCycle) {
                var33 = GlobalStatics_9
                    .method898((byte) 42, var60.anInt2842).anInt542;
                if (var33 != -1) {
                  var53 = GlobalStatics_8.method45(var33, (byte) -20);
                  if (var53 != null && var53.anIntArray1851 != null) {
                    GlobalStatics_4
                        .method1470(var60.sceneY, var53, 183921384,
                            var60.sceneX,
                            var60 == GlobalStatics_9.localPlayer, 0);
                  }
                }
              }
            }
          }
        }
      } else {
        var6 = 3 & var21 >> 28;
        var30 = ((var21 & 268434277) >> 14) - GlobalStatics_10.REGION_BASE_X;
        var8 = (var21 & 16383) - GlobalStatics_9.REGION_BASE_Y;
        if (var30 >= 0 && var8 >= 0 && var30 < 104 && var8 < 104) {
          var8 = var8 * 128 + 64;
          var30 = 128 * var30 + 64;
          StillGraphic var50 = new StillGraphic(var5, var6, var30, var8,
              -var3 + GlobalStatics_6.method1736(var6, 1, var30, var8), var20,
              GlobalStatics_4.updateCycle);
          GlobalStatics_1.stillGraphics.addLast(new StillGraphicNode(var50));
        }
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 207) {
      var20 = GlobalStatics_9.GAME_BUFFER.readInt((byte) -87);
      var3 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortAdd();
      var21 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
      var5 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortAdd();
      if (GlobalStatics_5.updateInterfaceCounter(var3, (byte) -25)) {
        GlobalStatics_9.method1708(var5 + (var21 << 16), var20, var0 ^ 2474);
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 38) {
      GlobalStatics_8.method819(false);
      var20 = GlobalStatics_9.GAME_BUFFER.method751((byte) -111);
      var3 = GlobalStatics_9.GAME_BUFFER.method780(-1);
      var21 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      GlobalStatics_9.anIntArray1743[var21] = var3;
      GlobalStatics_1.anIntArray3185[var21] = var20;
      GlobalStatics_10.anIntArray2480[var21] = 1;

      for (var5 = 0; var5 < 98; ++var5) {
        if (GlobalStatics_11.anIntArray781[var5] <= var3) {
          GlobalStatics_10.anIntArray2480[var21] = var5 + 2;
        }
      }

      int var1 = GlobalStatics_9.anInt815++;
      GlobalStatics_9.anIntArray3780[31 & var1] = var21;
      GlobalStatics_0.packetId = -1;
      return true;
    }
    if (GlobalStatics_0.packetId == 104 || GlobalStatics_0.packetId == 121 ||
        GlobalStatics_0.packetId == 97
        || GlobalStatics_0.packetId == 14 || GlobalStatics_0.packetId == 202
        || GlobalStatics_0.packetId == 135 || GlobalStatics_0.packetId == 17
        || GlobalStatics_0.packetId == 16
        || GlobalStatics_0.packetId == 240 || GlobalStatics_0.packetId == 33 ||
        GlobalStatics_0.packetId == 20
        || GlobalStatics_0.packetId == 195 || GlobalStatics_0.packetId == 179) {
      DummyClass37.parseEntityUpdate((byte) -99);
      GlobalStatics_0.packetId = -1;
      return true;
    }
    if (GlobalStatics_0.packetId == 149) {
      var20 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
      var3 = GlobalStatics_9.GAME_BUFFER.readInt();
      if (GlobalStatics_5.updateInterfaceCounter(var20, (byte) -25)) {
        SomethingPacket151 var67 =
            (SomethingPacket151) GlobalStatics_10.aClass130_3208.get(var3);
        if (var67 != null) {
          GlobalStatics_10.method254(true, var67, false);
        }

        if (GlobalStatics_10.aClass11_3087 != null) {
          DummyClass29.method909(115, GlobalStatics_10.aClass11_3087);
          GlobalStatics_10.aClass11_3087 = null;
        }
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }
    if (GlobalStatics_0.packetId == 187) {
      var20 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortLE();
      var3 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
      var21 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
      if (GlobalStatics_5.updateInterfaceCounter(var3, (byte) -25)) {
        GlobalStatics_9.NEXT_CAMERA_YAW = var20;
        GlobalStatics_6.NEXT_CAMERA_PITCH = var21;
        if (GlobalStatics_9.anInt1753 == 2) {
          CameraStatics.CURRENT_PITCH = GlobalStatics_6.NEXT_CAMERA_PITCH;
          CameraStatics.CURRENT_YAW = GlobalStatics_9.NEXT_CAMERA_YAW;
        }

        GlobalStatics_6.method1098((byte) -117);
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }
    if (GlobalStatics_0.packetId == 132) {
      var20 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
      var3 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortAdd();
      var21 = GlobalStatics_9.GAME_BUFFER.readShortLEAdd();
      var5 = GlobalStatics_9.GAME_BUFFER.readShortLEAdd();
      var6 = GlobalStatics_9.GAME_BUFFER.readInt();
      if (GlobalStatics_5.updateInterfaceCounter(var3, (byte) -25)) {
        GlobalStatics_8.method2143(var21, var6, var5, var20);
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }

    // Remove all game objects and ground items
    if (GlobalStatics_0.packetId == 112) {
      DummyClass45.spawnSceneX = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      DummyClass56.spawnSceneY = GlobalStatics_9.GAME_BUFFER.method786(true);

      for (var20 = DummyClass45.spawnSceneX;
          var20 < 8 + DummyClass45.spawnSceneX; ++var20) {
        for (var3 = DummyClass56.spawnSceneY;
            var3 < 8 + DummyClass56.spawnSceneY; ++var3) {
          if (GlobalStatics_9.groundItems[GlobalStatics_9.currentPlane][var20][var3]
              != null) {
            GlobalStatics_9.groundItems[GlobalStatics_9.currentPlane][var20][var3] = null;
            GlobalStatics_10.method1760(var3, (byte) 65, var20);
          }
        }
      }

      for (SpawnedGameObject var68 =
          (SpawnedGameObject) GlobalStatics_10.aClass61_3075.getFirst();
          var68 != null;
          var68 = (SpawnedGameObject) GlobalStatics_10.aClass61_3075
              .getNext()) {
        if (var68.anInt2264 >= DummyClass45.spawnSceneX
            && 8 + DummyClass45.spawnSceneX > var68.anInt2264
            && var68.anInt2248 >= DummyClass56.spawnSceneY && var68.anInt2248
            < 8
            + DummyClass56.spawnSceneY
            && var68.anInt2250 == GlobalStatics_9.currentPlane) {
          var68.aliveTime = 0;
        }
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 144) {
      var20 = GlobalStatics_9.GAME_BUFFER.readInt((byte) 72);
      Widget var65 = GlobalStatics_7.getWidget((byte) 111, var20);

      for (var21 = 0; var65.anIntArray254.length > var21; ++var21) {
        var65.anIntArray254[var21] = -1;
        var65.anIntArray254[var21] = 0;
      }

      DummyClass29.method909(123, var65);
      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 130) {
      var20 = GlobalStatics_9.GAME_BUFFER.method782(-104);
      var3 = GlobalStatics_9.GAME_BUFFER.readShortLEAdd();
      var21 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortAdd();
      if (var21 == 0xffff) {
        var21 = -1;
      }

      if (GlobalStatics_5.updateInterfaceCounter(var3, (byte) -25)) {
        GlobalStatics_10.method256(-1, 1, var20, (byte) -109, var21);
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }

    // Set minimap mode
    if (GlobalStatics_0.packetId == 192) {
      DummyClass12.minimapMode = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      GlobalStatics_0.packetId = -1;
      return true;
    }

    // Set player position
    if (GlobalStatics_0.packetId == 13) {
      var20 = GlobalStatics_9.GAME_BUFFER.method754(true);
      var3 = GlobalStatics_9.GAME_BUFFER.method751((byte) 108);
      var21 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      GlobalStatics_9.currentPlane = var3 >> 1;
      GlobalStatics_9.localPlayer
          .setPosition((byte) 126, var20, (var3 & 1) == 1, var21);
      GlobalStatics_0.packetId = -1;
      return true;
    }

    int var12;
    GameString var57;
    GameString var64;
    if (GlobalStatics_0.packetId == 62) {
      var2 = GlobalStatics_9.GAME_BUFFER.readLong();
      var21 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
      var5 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      var31 = true;
      if (var2 < 0L) {
        var2 &= Long.MAX_VALUE;
        var31 = false;
      }

      var41 = GameStringStatics.EMPTY_STRING;
      if (var21 > 0) {
        var41 = GlobalStatics_9.GAME_BUFFER.readString();
      }

      GameString var46 = GameStringStatics.stringFromBase37(-29664, var2)
          .formatName((byte) -50);

      for (var33 = 0; var33 < GlobalStatics_10.anInt104; ++var33) {
        if (var2 == GameStringStatics.aLongArray826[var33]) {
          if (var21 != GlobalStatics_7.anIntArray882[var33]) {
            GlobalStatics_7.anIntArray882[var33] = var21;
            if (var21 > 0) {
              GlobalStatics_8.printMessage(GameStringStatics.EMPTY_STRING, 5,
                  GlobalStatics_9.concat(new GameString[]{
                      var46, GlobalStatics_7.aClass94_4058
                  }), -1);
            }

            if (var21 == 0) {
              GlobalStatics_8.printMessage(GameStringStatics.EMPTY_STRING, 5,
                  GlobalStatics_9.concat(new GameString[]{
                      var46, GameStringStatics.aClass94_822
                  }), -1);
            }
          }

          GlobalStatics_2.aClass94Array2566[var33] = var41;
          GlobalStatics_9.anIntArray904[var33] = var5;
          var46 = null;
          GlobalStatics_0.aBooleanArray73[var33] = var31;
          break;
        }
      }

      boolean var45 = false;
      if (var46 != null && GlobalStatics_10.anInt104 < 200) {
        GameStringStatics.aLongArray826[GlobalStatics_10.anInt104] = var2;
        GameStringStatics.aClass94Array1046[GlobalStatics_10.anInt104] = var46;
        GlobalStatics_7.anIntArray882[GlobalStatics_10.anInt104] = var21;
        GlobalStatics_2.aClass94Array2566[GlobalStatics_10.anInt104] = var41;
        GlobalStatics_9.anIntArray904[GlobalStatics_10.anInt104] = var5;
        GlobalStatics_0.aBooleanArray73[GlobalStatics_10.anInt104] = var31;
        ++GlobalStatics_10.anInt104;
      }

      DummyClass31.anInt1472 = GlobalStatics_10.anInt3213;
      var10 = GlobalStatics_10.anInt104;

      while (var10 > 0) {
        --var10;
        var45 = true;

        for (var11 = 0; var11 < var10; ++var11) {
          if (GlobalStatics_7.anIntArray882[var11]
              != GlobalStatics_7.anInt2451
              && GlobalStatics_7.anInt2451 == GlobalStatics_7.anIntArray882[
              var11 + 1]
              || GlobalStatics_7.anIntArray882[var11] == 0
              && GlobalStatics_7.anIntArray882[var11 + 1] != 0) {
            var45 = false;
            var12 = GlobalStatics_7.anIntArray882[var11];
            GlobalStatics_7.anIntArray882[var11] = GlobalStatics_7.anIntArray882[
                var11 + 1];
            GlobalStatics_7.anIntArray882[1 + var11] = var12;
            var64 = GlobalStatics_2.aClass94Array2566[var11];
            GlobalStatics_2.aClass94Array2566[var11] = GlobalStatics_2.aClass94Array2566[
                var11 + 1];
            GlobalStatics_2.aClass94Array2566[var11 + 1] = var64;
            var57 = GameStringStatics.aClass94Array1046[var11];
            GameStringStatics.aClass94Array1046[var11] =
                GameStringStatics.aClass94Array1046[var11 + 1];
            GameStringStatics.aClass94Array1046[var11 + 1] = var57;
            long var15 = GameStringStatics.aLongArray826[var11];
            GameStringStatics.aLongArray826[var11] = GameStringStatics.aLongArray826[
                var11 + 1];
            GameStringStatics.aLongArray826[var11 + 1] = var15;
            int var17 = GlobalStatics_9.anIntArray904[var11];
            GlobalStatics_9.anIntArray904[var11] = GlobalStatics_9.anIntArray904[
                var11 + 1];
            GlobalStatics_9.anIntArray904[1 + var11] = var17;
            boolean var18 = GlobalStatics_0.aBooleanArray73[var11];
            GlobalStatics_0.aBooleanArray73[var11] = GlobalStatics_0.aBooleanArray73[
                var11 + 1];
            GlobalStatics_0.aBooleanArray73[var11 + 1] = var18;
          }
        }

        if (var45) {
          break;
        }
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 160) {
      if (GlobalStatics_0.packetLength == 0) {
        GameStringStatics.walkTooltip = DummyClass42.DEFAULT_WALK_TOOLTIP;
      } else {
        GameStringStatics.walkTooltip = GlobalStatics_9.GAME_BUFFER
            .readString();
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 128) {
      for (var20 = 0; DummyClass5.anIntArray2985.length > var20; ++var20) {
        if (GlobalStatics_9.variables[var20]
            != DummyClass5.anIntArray2985[var20]) {
          DummyClass5.anIntArray2985[var20] = GlobalStatics_9.variables[var20];
          DummyClass39.method1087(98, var20);
          int var01 = GlobalStatics_0.anInt641++;
          GlobalStatics_4.anIntArray726[var01 & 31] =
              var20;
        }
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 154) {
      var20 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
      var3 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      var21 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      var5 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
      var6 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      var30 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      if (GlobalStatics_5.updateInterfaceCounter(var20, (byte) -25)) {
        GlobalStatics_10
            .method390(true, var6, var5, var30, (byte) -124, var21, var3);
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 247) {
      var2 = GlobalStatics_9.GAME_BUFFER.readLong();
      var4 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
      var29 = GlobalStatics_9.GAME_BUFFER.readUnsignedMedium((byte) 77);
      var8 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      var33 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
      boolean var49 = false;
      long var51 = (var4 << 32) + var29;
      int var59 = 0;

      label1603:
      while (true) {
        if (var59 < 100) {
          if (var51 != DummyClass8.aLongArray4017[var59]) {
            ++var59;
            continue;
          }

          var49 = true;
          break;
        }

        if (var8 <= 1) {
          for (var59 = 0; var59 < GlobalStatics_6.anInt3591; ++var59) {
            if (var2 == GlobalStatics_9.aLongArray1574[var59]) {
              var49 = true;
              break label1603;
            }
          }
        }
        break;
      }

      if (!var49 && GlobalStatics_9.IS_ON_TUTORIAL_ISLAND == 0) {
        DummyClass8.aLongArray4017[GlobalStatics_9.anInt1921] = var51;
        GlobalStatics_9.anInt1921 = (1 + GlobalStatics_9.anInt1921) % 100;
        var64 =
            GlobalStatics_0
                .method733(12345678, var33)
                .method555(28021, GlobalStatics_9.GAME_BUFFER);
        if (var8 == 2) {
          GlobalStatics_9.method611(var33, 18, var64, null, (byte) 50,
              GlobalStatics_9.concat(new GameString[]{
                  DummyClass60.aClass94_444,
                  GameStringStatics.stringFromBase37(-29664, var2).formatName(
                      (byte) -50)
              }));
        } else if (var8 == 1) {
          GlobalStatics_9.method611(var33, 18, var64, null, (byte) 50,
              GlobalStatics_9.concat(new GameString[]{
                  DummyClass34.aClass94_592,
                  GameStringStatics.stringFromBase37(-29664, var2).formatName(
                      (byte) -50)
              }));
        } else {
          GlobalStatics_9.method611(var33, 18, var64, null, (byte) 50,
              GameStringStatics.stringFromBase37(var0 - 29581, var2)
                  .formatName((byte) -50));
        }
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }

    SomethingPacket151 var26;
    if (GlobalStatics_0.packetId == 176) {
      var20 = GlobalStatics_9.GAME_BUFFER.method780(var0 ^ 82);
      var3 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortAdd();
      var21 = GlobalStatics_9.GAME_BUFFER.method780(-1);
      if (GlobalStatics_5.updateInterfaceCounter(var3, (byte) -25)) {
        SomethingPacket151 var23 =
            (SomethingPacket151) GlobalStatics_10.aClass130_3208.get(var20);
        var26 = (SomethingPacket151) GlobalStatics_10.aClass130_3208.get(
            var21);
        if (var26 != null) {
          GlobalStatics_10
              .method254(var23 == null || var26.anInt2602 != var23.anInt2602,
                  var26,
                  false);
        }

        if (var23 != null) {
          var23.unlinkNode();
          GlobalStatics_10.aClass130_3208.put(var21, var23);
        }

        Widget var27 = GlobalStatics_7.getWidget((byte) 113, var20);
        if (var27 != null) {
          DummyClass29.method909(var0 + 57, var27);
        }

        var27 = GlobalStatics_7.getWidget((byte) 114, var21);
        if (var27 != null) {
          DummyClass29.method909(119, var27);
          GlobalStatics_7.method2104(var27, true, 48);
        }

        if (GlobalStatics_9.anInt3655 != -1) {
          GlobalStatics_6.method124(28, 1, GlobalStatics_9.anInt3655);
        }
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }
    if (GlobalStatics_0.packetId == 27) {
      var20 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
      var3 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      var21 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      var5 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      var6 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      var30 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
      if (GlobalStatics_5.updateInterfaceCounter(var20, (byte) -25)) {
        GLStatics.aBooleanArray2169[var3] = true;
        GlobalStatics_10.anIntArray3383[var3] = var21;
        GlobalStatics_9.anIntArray2073[var3] = var5;
        GlobalStatics_9.anIntArray3359[var3] = var6;
        DummyClass9.anIntArray4009[var3] = var30;
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 2) {
      var20 = GlobalStatics_9.GAME_BUFFER.method780(-1);
      var3 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortAdd();
      var21 = GlobalStatics_9.GAME_BUFFER.readShortLEAdd();
      if (GlobalStatics_5.updateInterfaceCounter(var3, (byte) -25)) {
        GlobalStatics_6.method1385(var21, var20, (byte) -127);
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }
    if (GlobalStatics_0.packetId == 85) {
      DummyClass36.updateTime =
          GlobalStatics_9.GAME_BUFFER.readUnsignedShort() * 30;
      GlobalStatics_0.packetId = -1;
      GlobalStatics_9.anInt2905 = GlobalStatics_10.anInt3213;
      return true;
    }
    if (GlobalStatics_0.packetId == 114) {
      GlobalStatics_9
          .method305(DummyClass35.signLink, GlobalStatics_9.GAME_BUFFER,
              GlobalStatics_0.packetLength, (byte) -126);
      GlobalStatics_0.packetId = -1;
      return true;
    }
    if (GlobalStatics_0.packetId == 65) {
      var20 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortLE();
      var3 = GlobalStatics_9.GAME_BUFFER.method786(true);
      var21 = GlobalStatics_9.GAME_BUFFER.readShortLEAdd();
      if (GlobalStatics_5.updateInterfaceCounter(var20, (byte) -25)) {
        GlobalStatics_10.method255(var21, var3, var0 ^ -84);
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }
    if (GlobalStatics_0.packetId == 234) {
      GlobalStatics_8.method819(false);
      GlobalStatics_10.anInt136 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      GlobalStatics_9.anInt2905 = GlobalStatics_10.anInt3213;
      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 209) {
      if (GlobalStatics_9.anInt3655 != -1) {
        GlobalStatics_6.method124(48, 0, GlobalStatics_9.anInt3655);
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }
    if (GlobalStatics_0.packetId == 191) {
      var20 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortLE();
      GlobalStatics_9.method532(var20, var0 ^ 28185);
      int var1 = GlobalStatics_8.anInt944++;
      GlobalStatics_9.anIntArray3565[31 & var1] =
          var20 & 32767;
      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 102) {
      var20 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortLE();
      var3 = GlobalStatics_9.GAME_BUFFER.method754(true);
      var21 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
      NPC var39 = GlobalStatics_8.NPCS[var20];
      if (var39 != null) {
        GlobalStatics_0.method1772(var3, var21, 39, var39);
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 159) {
      GlobalStatics_8.method819(false);
      GlobalStatics_9.anInt1925 = GlobalStatics_9.GAME_BUFFER
          .method787((byte) 59);
      GlobalStatics_9.anInt2905 = GlobalStatics_10.anInt3213;
      GlobalStatics_0.packetId = -1;
      return true;
    }

    // Chat
    if (GlobalStatics_0.packetId == 71) {
      var2 = GlobalStatics_9.GAME_BUFFER.readLong();
      var58 = GameStringStatics.otherFormat(
          DummyClass34.decompressString(GlobalStatics_9.GAME_BUFFER)
              .format(121));
      GlobalStatics_8.printMessage(
          GameStringStatics.stringFromBase37(-29664, var2)
              .formatName((byte) -50), 6,
          var58, var0 ^ 82);
      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 42) {
      if (GlobalStatics_10.fullScreenFrame != null) {
        GlobalStatics_9
            .setWindowMode(false, GlobalStatics_2.anInt2577, -1, -1);
      }

      byte[] var22 = new byte[GlobalStatics_0.packetLength];
      GlobalStatics_9.GAME_BUFFER
          .method811((byte) 30, 0, var22, GlobalStatics_0.packetLength);
      var24 = GameStringStatics
          .createString(var22, 0, GlobalStatics_0.packetLength);
      if (GlobalStatics_10.FRAME == null && (GlobalStatics_9.anInt1214 == 3
          || !GlobalStatics_9.formattedOsName.startsWith("win")
          || GlobalStatics_7.aBoolean1451)) {
        DummyClass54.method1596(var24, (byte) 127, true);
      } else {
        GlobalStatics_8.aClass94_3295 = var24;
        GlobalStatics_0.aBoolean2154 = true;
        GlobalStatics_2.aClass64_351 =
            DummyClass35.signLink.method1452(new String(var24.method1568(0),
                StandardCharsets.ISO_8859_1), true);
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 111) {
      var20 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortAdd();
      var3 = GlobalStatics_9.GAME_BUFFER.readInt((byte) -45);
      var21 = GlobalStatics_9.GAME_BUFFER.readShortLEAdd();
      var5 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortLE();
      var6 = GlobalStatics_9.GAME_BUFFER.readShortLEAdd();
      if (GlobalStatics_5.updateInterfaceCounter(var20, (byte) -25)) {
        GlobalStatics_10
            .method256(var21, 7, var3, (byte) -126, var5 << 16 | var6);
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 37) {
      var20 = GlobalStatics_9.GAME_BUFFER.method751((byte) 122);
      var3 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortLE();
      DummyClass6.method2209((byte) -122, var20, var3);
      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 155) {
      var20 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      var3 = GlobalStatics_9.GAME_BUFFER.readInt((byte) -51);
      var21 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortAdd();
      var5 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
      if (GlobalStatics_5.updateInterfaceCounter(var21, (byte) -25)) {
        var26 = (SomethingPacket151) GlobalStatics_10.aClass130_3208.get(var3);
        if (var26 != null) {
          GlobalStatics_10.method254(var26.anInt2602 != var5, var26, false);
        }

        DummyClass60.method914(6422, var5, var3, var20);
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 131) {
      for (var20 = 0; var20 < GlobalStatics_9.players.length; ++var20) {
        if (GlobalStatics_9.players[var20] != null) {
          GlobalStatics_9.players[var20].animationId = -1;
        }
      }

      for (var20 = 0; GlobalStatics_8.NPCS.length > var20; ++var20) {
        if (GlobalStatics_8.NPCS[var20] != null) {
          GlobalStatics_8.NPCS[var20].animationId = -1;
        }
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 217) {
      var20 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      HintMarker var48 = new HintMarker();
      var3 = var20 >> 6;
      var48.anInt1360 = var20 & 63;
      var48.anInt1351 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      if (var48.anInt1351 >= 0
          && var48.anInt1351
          < GlobalStatics_9.aClass3_Sub28_Sub16Array2072.length) {
        if (var48.anInt1360 != 1 && var48.anInt1360 != 10) {
          if (var48.anInt1360 >= 2 && var48.anInt1360 <= 6) {
            if (var48.anInt1360 == 2) {
              var48.anInt1346 = 64;
              var48.anInt1350 = 64;
            }

            if (var48.anInt1360 == 3) {
              var48.anInt1346 = 0;
              var48.anInt1350 = 64;
            }

            if (var48.anInt1360 == 4) {
              var48.anInt1346 = 128;
              var48.anInt1350 = 64;
            }

            if (var48.anInt1360 == 5) {
              var48.anInt1346 = 64;
              var48.anInt1350 = 0;
            }

            if (var48.anInt1360 == 6) {
              var48.anInt1346 = 64;
              var48.anInt1350 = 128;
            }

            var48.anInt1360 = 2;
            var48.anInt1356 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
            var48.anInt1347 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
            var48.anInt1353 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
          }
        } else {
          var48.anInt1359 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
          GlobalStatics_9.GAME_BUFFER.position += 3;
        }

        var48.anInt1355 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
        if (var48.anInt1355 == 0xffff) {
          var48.anInt1355 = -1;
        }

        GlobalStatics_8.aClass96Array2114[var3] = var48;
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 126) {
      GlobalStatics_6.anInt3591 = GlobalStatics_0.packetLength / 8;

      for (var20 = 0; var20 < GlobalStatics_6.anInt3591; ++var20) {
        GlobalStatics_9.aLongArray1574[var20] = GlobalStatics_9.GAME_BUFFER
            .readLong();
        GlobalStatics_9.aClass94Array3341[var20] =
            GameStringStatics.stringFromBase37(-29664,
                GlobalStatics_9.aLongArray1574[var20]);
      }

      DummyClass31.anInt1472 = GlobalStatics_10.anInt3213;
      GlobalStatics_0.packetId = -1;
      return true;
    }
    if (GlobalStatics_0.packetId == 32) {
      GlobalStatics_10.parseNpcUpdate();
      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 119) {
      var20 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortAdd();
      var3 = GlobalStatics_9.GAME_BUFFER.method782(-48);
      var21 = GlobalStatics_9.GAME_BUFFER.method787((byte) 74);
      var5 = GlobalStatics_9.GAME_BUFFER.method747(-58);
      if (GlobalStatics_5.updateInterfaceCounter(var20, (byte) -25)) {
        GlobalStatics_8.method2271(var21, var3, 1, var5);
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }
    if (GlobalStatics_0.packetId == 235) {
      var20 = GlobalStatics_9.GAME_BUFFER.method754(true);
      var3 = var20 >> 2;
      var21 = 3 & var20;
      var5 = GlobalStatics_3.OBJECT_TYPES[var3];
      var6 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
      var30 = GlobalStatics_9.GAME_BUFFER.readInt();
      if (var6 == 0xffff) {
        var6 = -1;
      }

      var10 = 16383 & var30;
      var33 = 16383 & var30 >> 14;
      var33 -= GlobalStatics_10.REGION_BASE_X;
      var10 -= GlobalStatics_9.REGION_BASE_Y;
      var8 = 3 & var30 >> 28;
      GlobalStatics_4
          .method1131(var8, 110, var21, var3, var10, var5, var33, var6);
      GlobalStatics_0.packetId = -1;
      return true;
    }
    if (GlobalStatics_0.packetId == 0) {
      var2 = GlobalStatics_9.GAME_BUFFER.readLong();
      var4 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
      var29 = GlobalStatics_9.GAME_BUFFER.readUnsignedMedium((byte) 93);
      var8 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      boolean var42 = false;
      long var35 = var29 + (var4 << 32);
      var12 = 0;

      label1651:
      while (true) {
        if (var12 >= 100) {
          if (var8 <= 1) {
            if ((!GlobalStatics_9.aBoolean2433 || GlobalStatics_6.aBoolean1641)
                && !GlobalStatics_10.aBoolean3166) {
              for (var12 = 0; var12 < GlobalStatics_6.anInt3591; ++var12) {
                if (var2 == GlobalStatics_9.aLongArray1574[var12]) {
                  var42 = true;
                  break label1651;
                }
              }
            } else {
              var42 = true;
            }
          }
          break;
        }

        if (var35 == DummyClass8.aLongArray4017[var12]) {
          var42 = true;
          break;
        }

        ++var12;
      }

      if (!var42 && GlobalStatics_9.IS_ON_TUTORIAL_ISLAND == 0) {
        DummyClass8.aLongArray4017[GlobalStatics_9.anInt1921] = var35;
        GlobalStatics_9.anInt1921 = (GlobalStatics_9.anInt1921 + 1) % 100;
        GameString var52 = GameStringStatics.otherFormat(
            DummyClass34.decompressString(GlobalStatics_9.GAME_BUFFER)
                .format(96));
        if (var8 != 2 && var8 != 3) {
          if (var8 == 1) {
            GlobalStatics_8
                .printMessage(GlobalStatics_9.concat(new GameString[]{
                    DummyClass34.aClass94_592,
                    GameStringStatics.stringFromBase37(-29664, var2).formatName(
                        (byte) -50)
                }), 7, var52, -1);
          } else {
            GlobalStatics_8.printMessage(
                GameStringStatics.stringFromBase37(var0 - 29581, var2)
                    .formatName((byte) -50), 3, var52,
                var0 + 82);
          }
        } else {
          GlobalStatics_8.printMessage(GlobalStatics_9.concat(new GameString[]{
              DummyClass60.aClass94_444,
              GameStringStatics.stringFromBase37(-29664, var2).formatName(
                  (byte) -50)
          }), 7, var52, -1);
        }
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 54) {
      var2 = GlobalStatics_9.GAME_BUFFER.readLong();
      GlobalStatics_9.GAME_BUFFER.readByte();
      var4 = GlobalStatics_9.GAME_BUFFER.readLong();
      var29 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
      var36 = GlobalStatics_9.GAME_BUFFER.readUnsignedMedium((byte) 81);
      long var44 = (var29 << 32) + var36;
      var10 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      boolean var13 = false;
      int var14 = 0;

      label1774:
      while (true) {
        if (var14 >= 100) {
          if (var10 <= 1) {
            if ((!GlobalStatics_9.aBoolean2433 || GlobalStatics_6.aBoolean1641)
                && !GlobalStatics_10.aBoolean3166) {
              for (var14 = 0; GlobalStatics_6.anInt3591 > var14; ++var14) {
                if (GlobalStatics_9.aLongArray1574[var14] == var2) {
                  var13 = true;
                  break label1774;
                }
              }
            } else {
              var13 = true;
            }
          }
          break;
        }

        if (DummyClass8.aLongArray4017[var14] == var44) {
          var13 = true;
          break;
        }

        ++var14;
      }

      if (!var13 && GlobalStatics_9.IS_ON_TUTORIAL_ISLAND == 0) {
        DummyClass8.aLongArray4017[GlobalStatics_9.anInt1921] = var44;
        GlobalStatics_9.anInt1921 = (GlobalStatics_9.anInt1921 + 1) % 100;
        var57 = GameStringStatics.otherFormat(
            DummyClass34.decompressString(GlobalStatics_9.GAME_BUFFER)
                .format(116));
        if (var10 != 2 && var10 != 3) {
          if (var10 == 1) {
            GlobalStatics_9
                .method221(-1, var57, GlobalStatics_9.concat(new GameString[]{
                    DummyClass34.aClass94_592,
                    GameStringStatics
                        .stringFromBase37(var0 ^ 29581, var2).formatName(
                        (byte) -50)
                }), GameStringStatics.stringFromBase37(-29664, var4)
                    .formatName((byte) -50), 9);
          } else {
            GlobalStatics_9.method221(-1, var57,
                GameStringStatics.stringFromBase37(-29664, var2)
                    .formatName((byte) -50),
                GameStringStatics.stringFromBase37(-29664, var4)
                    .formatName((byte) -50), 9);
          }
        } else {
          GlobalStatics_9
              .method221(-1, var57, GlobalStatics_9.concat(new GameString[]{
                  DummyClass60.aClass94_444,
                  GameStringStatics.stringFromBase37(-29664, var2).formatName(
                      (byte) -50)
              }), GameStringStatics.stringFromBase37(var0 - 29581, var4)
                  .formatName((byte) -50), 9);
        }
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 214) {
      DummyClass37.parseSceneRebuild(true);
      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 172) {
      var20 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
      var3 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      if (var20 == 65535) {
        var20 = -1;
      }

      var21 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
      GlobalStatics_10.method199(var3, var20, var21, -799);
      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 66) {
      var20 = GlobalStatics_9.GAME_BUFFER.readShortLEAdd();
      var3 = GlobalStatics_9.GAME_BUFFER.method780(-1);
      if (GlobalStatics_5.updateInterfaceCounter(var20, (byte) -25)) {
        var21 = 0;
        if (GlobalStatics_9.localPlayer.appearance != null) {
          var21 = GlobalStatics_9.localPlayer.appearance.method1163(-24861);
        }

        GlobalStatics_10.method256(-1, 3, var3, (byte) -110, var21);
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 171) {
      var20 = GlobalStatics_9.GAME_BUFFER.readInt((byte) -55);
      var24 = GlobalStatics_9.GAME_BUFFER.readString();
      var21 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortAdd();
      if (GlobalStatics_5.updateInterfaceCounter(var21, (byte) -25)) {
        GlobalStatics_2.method566(var24, 0, var20);
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }
    if (GlobalStatics_0.packetId == 84) {
      var20 = GlobalStatics_9.GAME_BUFFER.method782(-79);
      var3 = GlobalStatics_9.GAME_BUFFER.readShortLEAdd();
      DummyClass6.method2209((byte) -106, var20, var3);
      GlobalStatics_0.packetId = -1;
      return true;
    }

    Widget var25;
    if (GlobalStatics_0.packetId == 22) {
      var20 = GlobalStatics_9.GAME_BUFFER.readInt();
      var3 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
      if (var20 < 69999) {
        var3 += 0x8000;
      }

      if (var20 < 0) {
        var25 = null;
      } else {
        var25 = GlobalStatics_7.getWidget((byte) 127, var20);
      }

      for (;
          GlobalStatics_9.GAME_BUFFER.position < GlobalStatics_0.packetLength;
          GlobalStatics_8.method2277(var6 - 1, var5, var30, var3,
              (byte) 46)) {
        var5 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortSmart();
        var6 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
        var30 = 0;
        if (var6 != 0) {
          var30 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
          if (var30 == 255) {
            var30 = GlobalStatics_9.GAME_BUFFER.readInt();
          }
        }

        if (var25 != null && var5 >= 0 &&
            var25.anIntArray254.length > var5) {
          var25.anIntArray254[var5] = var6;
          var25.anIntArray317[var5] = var30;
        }
      }

      if (var25 != null) {
        DummyClass29.method909(-128, var25);
      }

      GlobalStatics_8.method819(false);
      int var01 = GlobalStatics_8.anInt944++;
      GlobalStatics_9.anIntArray3565[var01 & 31] =
          32767 & var3;
      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 24) {
      var20 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
      if (GlobalStatics_5.updateInterfaceCounter(var20, (byte) -25)) {
        GlobalStatics_6.method560(-21556);
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 86) {
      DummyClass10.destroyGame((byte) 46);
      GlobalStatics_0.packetId = -1;
      return false;
    }
    if (GlobalStatics_0.packetId == 116) {
      var20 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      if (GlobalStatics_9.GAME_BUFFER.readUnsignedByte() == 0) {
        GlobalStatics_10.aClass133Array3393[var20] = new SomethingPacket116();
      } else {
        --GlobalStatics_9.GAME_BUFFER.position;
        GlobalStatics_10.aClass133Array3393[var20] =
            new SomethingPacket116(GlobalStatics_9.GAME_BUFFER);
      }

      GlobalStatics_0.packetId = -1;
      GlobalStatics_6.anInt1642 = GlobalStatics_10.anInt3213;
      return true;
    }
    if (GlobalStatics_0.packetId == 73) {
      var20 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortAdd();
      var3 = GlobalStatics_9.GAME_BUFFER.method782(-105);
      if (var20 == 65535) {
        var20 = -1;
      }

      var21 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortLE();
      if (GlobalStatics_5.updateInterfaceCounter(var21, (byte) -25)) {
        GlobalStatics_10.method256(-1, 2, var3, (byte) -113, var20);
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 162) {
      DummyClass37.parseSceneRebuild(false);
      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 165) {
      var20 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortLE();
      var3 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortLE();
      if (var3 == 0xffff) {
        var3 = -1;
      }

      var21 = GlobalStatics_9.GAME_BUFFER.readInt();
      var5 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortAdd();
      var6 = GlobalStatics_9.GAME_BUFFER.method780(-1);
      if (var5 == 65535) {
        var5 = -1;
      }

      if (GlobalStatics_5.updateInterfaceCounter(var20, (byte) -25)) {
        for (var30 = var5; var3 >= var30; ++var30) {
          var36 = ((long) var21 << 32) + var30;
          var47 = (WidgetAccess) DummyClass23.aClass130_1659.get(var36);
          if (var47 == null) {
            if (var30 == -1) {
              var38 = new WidgetAccess(var6,
                  GlobalStatics_7
                      .getWidget((byte) 116, var21).aClass3_Sub1_257.anInt2202);
            } else {
              var38 = new WidgetAccess(var6, -1);
            }
          } else {
            var38 = new WidgetAccess(var6, var47.anInt2202);
            var47.unlinkNode();
          }

          DummyClass23.aClass130_1659.put(var36, var38);
        }
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 197) {
      GlobalStatics_9.anInt1357 = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      DummyClass31.anInt1472 = GlobalStatics_10.anInt3213;
      GlobalStatics_0.packetId = -1;
      return true;
    }
    if (GlobalStatics_0.packetId == 196) {
      var2 = GlobalStatics_9.GAME_BUFFER.readLong();
      var21 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
      byte var28 = GlobalStatics_9.GAME_BUFFER.readByte();
      var31 = (Long.MIN_VALUE & var2) != 0L;

      if (var31) {
        if (GlobalStatics_2.anInt2572 == 0) {
          GlobalStatics_0.packetId = -1;
          return true;
        }

        boolean var37 = false;
        var2 &= Long.MAX_VALUE;

        for (
            var30 = 0;
            GlobalStatics_2.anInt2572 > var30 && (
                var2 != GlobalStatics_6.aClass3_Sub19Array3694[var30].key
                    || var21
                    != GlobalStatics_6.aClass3_Sub19Array3694[var30].anInt2478);
            ++var30) {
        }

        if (var30 < GlobalStatics_2.anInt2572) {
          while (-1 + GlobalStatics_2.anInt2572 > var30) {
            GlobalStatics_6.aClass3_Sub19Array3694[var30] =
                GlobalStatics_6.aClass3_Sub19Array3694[1 + var30];
            ++var30;
          }

          --GlobalStatics_2.anInt2572;
          GlobalStatics_6.aClass3_Sub19Array3694[GlobalStatics_2.anInt2572] = null;
        }
      } else {
        var41 = GlobalStatics_9.GAME_BUFFER.readString();
        ClanChatUser var40 = new ClanChatUser();
        var40.key = var2;
        var40.name = GameStringStatics.stringFromBase37(-29664, var40.key);
        var40.aByte2472 = var28;
        var40.aClass94_2473 = var41;
        var40.anInt2478 = var21;

        for (var33 = -1 + GlobalStatics_2.anInt2572; var33 >= 0; --var33) {
          var10 =
              GlobalStatics_6.aClass3_Sub19Array3694[var33].name
                  .method1559(var40.name, var0 ^ 82);
          if (var10 == 0) {
            GlobalStatics_6.aClass3_Sub19Array3694[var33].anInt2478 = var21;
            GlobalStatics_6.aClass3_Sub19Array3694[var33].aByte2472 = var28;
            GlobalStatics_6.aClass3_Sub19Array3694[var33].aClass94_2473 = var41;
            if (var2 == GlobalStatics_10.encodedUsername) {
              GlobalStatics_7.aByte1308 = var28;
            }

            DummyClass10.anInt2087 = GlobalStatics_10.anInt3213;
            GlobalStatics_0.packetId = -1;
            return true;
          }

          if (var10 < 0) {
            break;
          }
        }

        if (GlobalStatics_6.aClass3_Sub19Array3694.length
            <= GlobalStatics_2.anInt2572) {
          GlobalStatics_0.packetId = -1;
          return true;
        }

        for (var10 = GlobalStatics_2.anInt2572 - 1; var33 < var10; --var10) {
          GlobalStatics_6.aClass3_Sub19Array3694[1 + var10] =
              GlobalStatics_6.aClass3_Sub19Array3694[var10];
        }

        if (GlobalStatics_2.anInt2572 == 0) {
          GlobalStatics_6.aClass3_Sub19Array3694 = new ClanChatUser[100];
        }

        GlobalStatics_6.aClass3_Sub19Array3694[1 + var33] = var40;
        if (GlobalStatics_10.encodedUsername == var2) {
          GlobalStatics_7.aByte1308 = var28;
        }

        ++GlobalStatics_2.anInt2572;
      }

      GlobalStatics_0.packetId = -1;
      DummyClass10.anInt2087 = GlobalStatics_10.anInt3213;
      return true;
    }

    if (GlobalStatics_0.packetId == 50) {
      var20 = GlobalStatics_9.GAME_BUFFER.readInt();
      var3 = GlobalStatics_9.GAME_BUFFER.readInt((byte) -79);
      var21 = GlobalStatics_9.GAME_BUFFER.readShortLEAdd();
      if (var21 == 0xffff) {
        var21 = -1;
      }

      var5 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortLE();
      if (GlobalStatics_5.updateInterfaceCounter(var5, (byte) -25)) {
        Widget var34 = GlobalStatics_7.getWidget((byte) 115, var3);
        ItemConfig var43;
        if (var34.aBoolean233) {
          GlobalStatics_9.method2026((byte) 122, var3, var20, var21);
          var43 = DummyClass35.getItemConfig(var21, (byte) 70);
          GlobalStatics_8
              .method2143(var43.anInt810, var3, var43.rotationY,
                  var43.rotationX);
          DummyClass51.method1420(var3, var43.rotationZ, var43.translateOther,
              var43.translateX,
              (byte) -85);
        } else {
          if (var21 == -1) {
            var34.anInt202 = 0;
            GlobalStatics_0.packetId = -1;
            return true;
          }

          var43 = DummyClass35.getItemConfig(var21, (byte) 91);
          var34.rotationX0 = var43.rotationX;
          var34.anInt164 = 100 * var43.anInt810 / var20;
          var34.anInt202 = 4;
          var34.anInt201 = var21;
          var34.rotationY = var43.rotationY;
          DummyClass29.method909(117, var34);
        }
      }

      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 105) {
      var20 = GlobalStatics_9.GAME_BUFFER.readInt();
      var3 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
      if (var20 < 69999) {
        var3 += 0x8000;
      }

      if (var20 >= 0) {
        var25 = GlobalStatics_7.getWidget((byte) 118, var20);
      } else {
        var25 = null;
      }

      if (var25 != null) {
        for (var5 = 0; var25.anIntArray254.length > var5; ++var5) {
          var25.anIntArray254[var5] = 0;
          var25.anIntArray317[var5] = 0;
        }
      }

      GlobalStatics_9.method852((byte) 114, var3);
      var5 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();

      for (var6 = 0; var5 > var6; ++var6) {
        var30 = GlobalStatics_9.GAME_BUFFER.method754(true);
        if (var30 == 255) {
          var30 = GlobalStatics_9.GAME_BUFFER.readInt();
        }

        var8 = GlobalStatics_9.GAME_BUFFER.readUnsignedShort();
        if (var25 != null && var6 < var25.anIntArray254.length) {
          var25.anIntArray254[var6] = var8;
          var25.anIntArray317[var6] = var30;
        }

        GlobalStatics_8.method2277(-1 + var8, var6, var30, var3, (byte) 41);
      }

      if (var25 != null) {
        DummyClass29.method909(-9, var25);
      }

      GlobalStatics_8.method819(false);
      int var01 = GlobalStatics_8.anInt944++;
      GlobalStatics_9.anIntArray3565[var01 & 31] =
          32767 & var3;
      GlobalStatics_0.packetId = -1;
      return true;
    }

    // Set settings
    if (GlobalStatics_0.packetId == 142) {
      GlobalStatics_0.setSettings(0, GlobalStatics_9.GAME_BUFFER.readString());
      GlobalStatics_0.packetId = -1;
      return true;
    }

    // Set block coordinates
    if (GlobalStatics_0.packetId == 26) {
      DummyClass45.spawnSceneX = GlobalStatics_9.GAME_BUFFER.method786(true);
      DummyClass56.spawnSceneY = GlobalStatics_9.GAME_BUFFER.readUnsignedByte();
      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 4) {
      var20 = GlobalStatics_9.GAME_BUFFER.readShortLEAdd();
      if (var20 == 0xffff) {
        var20 = -1;
      }

      GlobalStatics_0.method1427(true, var20);
      GlobalStatics_0.packetId = -1;
      return true;
    }

    if (GlobalStatics_0.packetId == 208) {
      var20 = GlobalStatics_9.GAME_BUFFER.method755();
      var3 = GlobalStatics_9.GAME_BUFFER.readUnsignedShortLE();
      if (var3 == 0xffff) {
        var3 = -1;
      }

      DummyClass10.method2266(var20, var3, (byte) -1);
      GlobalStatics_0.packetId = -1;
      return true;
    }

    GlobalStatics_9.reportError(
        "T1 - " + GlobalStatics_0.packetId + "," + GlobalStatics_7.lastPacketId1
            + ","
            + GlobalStatics_9.lastPacketId2 + " - "
            + GlobalStatics_0.packetLength, null, (byte) 117);
    DummyClass10.destroyGame((byte) 46);
    return true;
  }

  public static void clear96(int var0) {
    DummyClass18.DEFAULT_RENDER_ANIMATION = null;
    DummyClass18.aByteArrayArrayArray81 = null;
    DummyClass18.aClass94_85 = null;
    if (var0 > -88) {
      DummyClass18.clear96(-84);
    }

    DummyClass18.aClass61_82 = null;
    DummyClass18.aClass11_88 = null;
  }

  public static void method829(int var0) {
    DummyClass29.method909(var0 + 111, DummyClass42.aClass11_886);
    ++GlobalStatics_9.anInt2658;
    if (DummyClass60.aBoolean440 && DummyClass52.aBoolean1167) {
      int var1 = GlobalStatics_9.anInt1676;
      var1 -= GlobalStatics_6.anInt1881;
      if (GlobalStatics_10.anInt3156 > var1) {
        var1 = GlobalStatics_10.anInt3156;
      }

      int var2 = GlobalStatics_0.anInt1709;
      if (GlobalStatics_10.anInt3156 + DummyClass18.aClass11_88.anInt168 < var1
              + DummyClass42.aClass11_886.anInt168) {
        var1 =
            -DummyClass42.aClass11_886.anInt168 + GlobalStatics_10.anInt3156
                + DummyClass18.aClass11_88.anInt168;
      }

      var2 -= DummyClass53.anInt1336;
      if (var2 < DummyClass21.anInt1761) {
        var2 = DummyClass21.anInt1761;
      }

      if (DummyClass21.anInt1761 + DummyClass18.aClass11_88.zoom
          < var2 + DummyClass42.aClass11_886.zoom) {
        var2 =
            DummyClass21.anInt1761 + DummyClass18.aClass11_88.zoom
                - DummyClass42.aClass11_886.zoom;
      }

      if (var0 != -1) {
        DummyClass18.aClass61_82 = null;
      }

      int var4 = var2 - GlobalStatics_2.anInt2218;
      int var3 = var1 - GlobalStatics_9.anInt2421;
      int var6 =
          var1 - GlobalStatics_10.anInt3156 + DummyClass18.aClass11_88.anInt247;
      int var7 =
          DummyClass18.aClass11_88.anInt208 - DummyClass21.anInt1761 + var2;
      int var5 = DummyClass42.aClass11_886.anInt214;
      if (GlobalStatics_9.anInt2658 > DummyClass42.aClass11_886.anInt179 && (
          var5 < var3
              || -var5 > var3 || var4 > var5 || var4 < -var5)) {
        GlobalStatics_9.aBoolean3975 = true;
      }

      ClientScriptCall var8;
      if (DummyClass42.aClass11_886.anObjectArray295 != null
          && GlobalStatics_9.aBoolean3975) {
        var8 = new ClientScriptCall();
        var8.aClass11_2449 = DummyClass42.aClass11_886;
        var8.arguments = DummyClass42.aClass11_886.anObjectArray295;
        var8.anInt2447 = var6;
        var8.anInt2441 = var7;
        GLStatics.executeScript(var8);
      }

      if (GlobalStatics_10.anInt3069 == 0) {
        if (GlobalStatics_9.aBoolean3975) {
          if (DummyClass42.aClass11_886.anObjectArray229 != null) {
            var8 = new ClientScriptCall();
            var8.anInt2441 = var7;
            var8.aClass11_2438 = DummyClass32.aClass11_526;
            var8.anInt2447 = var6;
            var8.arguments = DummyClass42.aClass11_886.anObjectArray229;
            var8.aClass11_2449 = DummyClass42.aClass11_886;
            GLStatics.executeScript(var8);
          }

          if (DummyClass32.aClass11_526 != null
              && GlobalStatics_8.method42(DummyClass42.aClass11_886) != null) {
            GlobalStatics_9.secureBuffer.writePacket(79);
            ++DummyClass30.anInt456;
            GlobalStatics_9.secureBuffer
                .method759(-93, DummyClass42.aClass11_886.anInt279);
            GlobalStatics_9.secureBuffer.writeShortLE(var0,
                DummyClass32.aClass11_526.anInt191);
            GlobalStatics_9.secureBuffer
                .writeInt(DummyClass32.aClass11_526.anInt279);
            GlobalStatics_9.secureBuffer
                .writeShortLE(-1, DummyClass42.aClass11_886.anInt191);
          }
        } else if (
            (GlobalStatics_9.anInt998 == 1 || GlobalStatics_9.method353(
                -1 + GlobalStatics_10.amountContextActions, ~var0))
                && GlobalStatics_10.amountContextActions > 2) {
          DummyClass22.method1801((byte) -97);
        } else if (GlobalStatics_10.amountContextActions > 0) {
          GlobalStatics_9.method203(96);
        }

        DummyClass42.aClass11_886 = null;
      }

    } else {
      if (GlobalStatics_9.anInt2658 > 1) {
        DummyClass42.aClass11_886 = null;
      }

    }
  }

}
