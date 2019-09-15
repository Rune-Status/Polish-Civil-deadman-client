package com.jagex.runescape.statics;

import com.jagex.runescape.model.FileUnpacker;
import com.jagex.runescape.model.SocketStream;
import java.io.IOException;
import java.net.Socket;

public class DummyClass2 {

  public static int[] anIntArray1679 = new int[14];
  public static FileUnpacker aClass153_1680;
  public static int[] anIntArray1681;

  public static void handleLogin() {
    if (GlobalStatics_10.loginState != 0
        && GlobalStatics_10.loginState != 5) {
      try {
        if (((++GlobalStatics_4.anInt820) > 2000)) {
          if (GlobalStatics_9.gameSocket != null) {
            GlobalStatics_9.gameSocket.destroy();
            GlobalStatics_9.gameSocket = null;
          }

          if ((GlobalStatics_9.anInt2079 >= 1)) {
            GlobalStatics_5.loginResponse = -5;
            GlobalStatics_10.loginState = 0;
            return;
          }

          GlobalStatics_4.anInt820 = 0;
          if (GlobalStatics_9.anInt2894 == DummyClass11.anInt2036) {
            GlobalStatics_9.anInt2894 = GlobalStatics_9.anInt506;
          } else {
            GlobalStatics_9.anInt2894 = DummyClass11.anInt2036;
          }

          GlobalStatics_10.loginState = 1;
          ++GlobalStatics_9.anInt2079;
        }

        if (GlobalStatics_10.loginState == 1) {
          GlobalStatics_6.socketRequest =
              DummyClass35.signLink
                  .method1441((byte) 8, DummyClass36.aString2611,
                      GlobalStatics_9.anInt2894);
          GlobalStatics_10.loginState = 2;
        }

        if ((GlobalStatics_10.loginState == 2)) {
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
          long encodedUsername =
              GlobalStatics_10.encodedUsername = GlobalStatics_9.username
                  .toBase37();
          GlobalStatics_9.secureBuffer.position = 0;
          GlobalStatics_9.secureBuffer.writeByte(14);
          int hash = (int) (encodedUsername >> 16 & 31L);
          GlobalStatics_9.secureBuffer.writeByte(hash);
          GlobalStatics_9.gameSocket
              .write(GlobalStatics_9.secureBuffer.bytes, 0, 2);
          if (GlobalStatics_9.audioOutputStream0 != null) {
            GlobalStatics_9.audioOutputStream0.pause();
          }

          if (GlobalStatics_9.audioOutputStream1 != null) {
            GlobalStatics_9.audioOutputStream1.pause();
          }

          int response = GlobalStatics_9.gameSocket.read();
          if (GlobalStatics_9.audioOutputStream0 != null) {
            GlobalStatics_9.audioOutputStream0.pause();
          }

          if (GlobalStatics_9.audioOutputStream1 != null) {
            GlobalStatics_9.audioOutputStream1.pause();
          }

          if (response != 0) {
            GlobalStatics_5.loginResponse = response;
            GlobalStatics_10.loginState = 0;
            GlobalStatics_9.gameSocket.destroy();
            GlobalStatics_9.gameSocket = null;
            return;
          }

          GlobalStatics_10.loginState = 3;
        }

        if (GlobalStatics_10.loginState == 3) {
          if (GlobalStatics_9.gameSocket.available() < 8) {
            return;
          }

          GlobalStatics_9.gameSocket
              .read(GlobalStatics_9.gameBuffer.bytes, 0, 8);
          GlobalStatics_9.gameBuffer.position = 0;
          GlobalStatics_9.serverCipherKey = GlobalStatics_9.gameBuffer
              .readLong();
          GlobalStatics_9.secureBuffer.position = 0;
          int[] keys = new int[4];
          keys[2] = (int) (GlobalStatics_9.serverCipherKey >> 32);
          keys[3] = (int) GlobalStatics_9.serverCipherKey;
          keys[1] = (int) (Math.random() * 9.9999999E7D);
          keys[0] = (int) (Math.random() * 9.9999999E7D);
          GlobalStatics_9.secureBuffer.writeByte(10);
          GlobalStatics_9.secureBuffer.writeInt(keys[0]);
          GlobalStatics_9.secureBuffer.writeInt(keys[1]);
          GlobalStatics_9.secureBuffer.writeInt(keys[2]);
          GlobalStatics_9.secureBuffer.writeInt(keys[3]);
          GlobalStatics_9.secureBuffer
              .writeLong(GlobalStatics_9.username.toBase37());
          GlobalStatics_9.secureBuffer.writeString(GlobalStatics_9.password);
          GlobalStatics_9.secureBuffer
              .encipherRSA(RSAConfiguration.PUBLIC_EXPONENT,
                  RSAConfiguration.MODULUS);
          GlobalStatics_7.loginBuffer.position = 0;
          if (DummyClass15.state == 40) {
            GlobalStatics_7.loginBuffer.writeByte(18);
          } else {
            GlobalStatics_7.loginBuffer.writeByte(16);
          }

          GlobalStatics_7.loginBuffer.writeShort(
              GlobalStatics_9.secureBuffer.position + 159 + GlobalStatics_10
                  .getByteLength(
                      DummyClass7.settings));
          GlobalStatics_7.loginBuffer.writeInt(530);
          GlobalStatics_7.loginBuffer.writeByte(GlobalStatics_7.anInt2161);
          GlobalStatics_7.loginBuffer
              .writeByte(!GlobalStatics_9.aBoolean3779 ? 0 : 1);
          GlobalStatics_7.loginBuffer.writeByte(1);
          GlobalStatics_7.loginBuffer
              .writeByte(GlobalStatics_9.getWindowMode());
          GlobalStatics_7.loginBuffer.writeShort(DummyClass30.viewWidth);
          GlobalStatics_7.loginBuffer.writeShort(GlobalStatics_9.viewHeight);
          GlobalStatics_7.loginBuffer.writeByte(GlobalStatics_9.anInt3671);
          DummyClass50.writeUUID(GlobalStatics_7.loginBuffer, true);
          GlobalStatics_7.loginBuffer.writeString(DummyClass7.settings);
          GlobalStatics_7.loginBuffer
              .writeInt(GlobalStatics_9.affiliateId);
          GlobalStatics_7.loginBuffer.writeInt(DummyClass51.getSettings());
          GlobalStatics_9.aBoolean2705 = true;
          GlobalStatics_7.loginBuffer
              .writeShort(GlobalStatics_9.interfaceCounter);
          GlobalStatics_7.loginBuffer.writeInt(
              GlobalStatics_9.animationFrames.getTableChecksum());
          GlobalStatics_7.loginBuffer
              .writeInt(GlobalStatics_9.animationBases.getTableChecksum());
          GlobalStatics_7.loginBuffer
              .writeInt(GlobalStatics_2.configs.getTableChecksum());
          GlobalStatics_7.loginBuffer
              .writeInt(GlobalStatics_8.widgets.getTableChecksum());
          GlobalStatics_7.loginBuffer
              .writeInt(GlobalStatics_5.soundEffects.getTableChecksum());
          GlobalStatics_7.loginBuffer
              .writeInt(GlobalStatics_10.maps.getTableChecksum());
          GlobalStatics_7.loginBuffer
              .writeInt(GlobalStatics_9.fileUnpacker6.getTableChecksum());
          GlobalStatics_7.loginBuffer
              .writeInt(DummyClass13.models.getTableChecksum());
          GlobalStatics_7.loginBuffer
              .writeInt(GlobalStatics_10.sprites.getTableChecksum());
          GlobalStatics_7.loginBuffer
              .writeInt(GlobalStatics_10.textures.getTableChecksum());
          GlobalStatics_7.loginBuffer
              .writeInt(GlobalStatics_10.fileUnpacker10.getTableChecksum());
          GlobalStatics_7.loginBuffer
              .writeInt(GlobalStatics_2.fileUnpacker11.getTableChecksum());
          GlobalStatics_7.loginBuffer
              .writeInt(GlobalStatics_10.scripts.getTableChecksum());
          GlobalStatics_7.loginBuffer
              .writeInt(GlobalStatics_8.fileUnpacker13.getTableChecksum());
          GlobalStatics_7.loginBuffer
              .writeInt(GlobalStatics_6.midiInstruments.getTableChecksum());
          GlobalStatics_7.loginBuffer
              .writeInt(GlobalStatics_9.fileUnpacker15.getTableChecksum());
          GlobalStatics_7.loginBuffer
              .writeInt(GlobalStatics_8.fileUnpacker16.getTableChecksum());
          GlobalStatics_7.loginBuffer
              .writeInt(GlobalStatics_9.fileUnpacker17.getTableChecksum());
          GlobalStatics_7.loginBuffer
              .writeInt(DummyClass55.fileUnpacker18.getTableChecksum());
          GlobalStatics_7.loginBuffer
              .writeInt(GlobalStatics_8.fileUnpacker19.getTableChecksum());
          GlobalStatics_7.loginBuffer.writeInt(
              GlobalStatics_10.animationSequences.getTableChecksum());
          GlobalStatics_7.loginBuffer
              .writeInt(GlobalStatics_9.fileUnpacker21.getTableChecksum());
          GlobalStatics_7.loginBuffer.writeInt(
              GlobalStatics_6.fileUnpacker22.getTableChecksum());
          GlobalStatics_7.loginBuffer
              .writeInt(GlobalStatics_9.worldMapData.getTableChecksum());
          GlobalStatics_7.loginBuffer
              .writeInt(GlobalStatics_9.fileUnpacker24.getTableChecksum());
          GlobalStatics_7.loginBuffer
              .writeInt(GlobalStatics_9.fileUnpacker25.getTableChecksum());
          GlobalStatics_7.loginBuffer
              .writeInt(GlobalStatics_10.materials.getTableChecksum());
          GlobalStatics_7.loginBuffer
              .writeInt(DummyClass22.particles.getTableChecksum());
          GlobalStatics_7.loginBuffer
              .write(GlobalStatics_9.secureBuffer.bytes, 0,
                  GlobalStatics_9.secureBuffer.position);
          GlobalStatics_9.gameSocket
              .write(GlobalStatics_7.loginBuffer.bytes, 0,
                  GlobalStatics_7.loginBuffer.position);

          GlobalStatics_9.secureBuffer.initializeCipher(keys);
          for (int i = 0; i < 4; i++) {
            keys[i] += 50;
          }
          GlobalStatics_9.gameBuffer.initializeCipher(keys);

          GlobalStatics_10.loginState = 4;
        }

        if ((GlobalStatics_10.loginState == 4)) {
          if ((GlobalStatics_9.gameSocket.available() < 1)) {
            return;
          }

          int response = GlobalStatics_9.gameSocket.read();
          if ((response == 21)) {
            GlobalStatics_10.loginState = 7;
          } else {
            if (response == 29) {
              GlobalStatics_10.loginState = 10;
            } else {
              if (response == 1) {
                GlobalStatics_10.loginState = 5;
                GlobalStatics_5.loginResponse = 1;
                return;
              }

              if (response != 2) {
                if ((response != 15)) {
                  if (response == 23 && (GlobalStatics_9.anInt2079 < 1)) {
                    GlobalStatics_10.loginState = 1;
                    ++GlobalStatics_9.anInt2079;
                    GlobalStatics_4.anInt820 = 0;
                    GlobalStatics_9.gameSocket.destroy();
                    GlobalStatics_9.gameSocket = null;
                    return;
                  }

                  GlobalStatics_5.loginResponse = response;
                  GlobalStatics_10.loginState = 0;
                  GlobalStatics_9.gameSocket.destroy();
                  GlobalStatics_9.gameSocket = null;
                  return;
                }

                GlobalStatics_10.loginState = 0;
                GlobalStatics_5.loginResponse = response;
                return;
              }

              GlobalStatics_10.loginState = 8;
            }
          }
        }

        if (GlobalStatics_10.loginState == 6) {
          GlobalStatics_9.secureBuffer.position = 0;
          GlobalStatics_9.secureBuffer.writePacket(17);
          GlobalStatics_9.gameSocket
              .write(GlobalStatics_9.secureBuffer.bytes, 0,
                  GlobalStatics_9.secureBuffer.position);
          GlobalStatics_10.loginState = 4;
          return;
        }

        if (GlobalStatics_10.loginState == 7) {
          if ((GlobalStatics_9.gameSocket.available() >= 1)) {
            GlobalStatics_10.anInt3413 =
                60 * (3 + GlobalStatics_9.gameSocket.read());
            GlobalStatics_10.loginState = 0;
            GlobalStatics_5.loginResponse = 21;
            GlobalStatics_9.gameSocket.destroy();
            GlobalStatics_9.gameSocket = null;
            return;
          }

          return;
        }

        if ((GlobalStatics_10.loginState == 10)) {
          if (GlobalStatics_9.gameSocket.available() >= 1) {
            GlobalStatics_9.anInt2561 = GlobalStatics_9.gameSocket
                .read();
            GlobalStatics_10.loginState = 0;
            GlobalStatics_5.loginResponse = 29;
            GlobalStatics_9.gameSocket.destroy();
            GlobalStatics_9.gameSocket = null;
            return;
          }

          return;
        }

        if (GlobalStatics_10.loginState == 8) {
          if ((GlobalStatics_9.gameSocket.available() < 14)) {
            return;
          }

          GlobalStatics_9.gameSocket
              .read(GlobalStatics_9.gameBuffer.bytes, 0, 14);
          GlobalStatics_9.gameBuffer.position = 0;
          GlobalStatics_10.rights = GlobalStatics_9.gameBuffer
              .readUnsignedByte();
          GlobalStatics_9.anInt3775 = GlobalStatics_9.gameBuffer
              .readUnsignedByte();
          GlobalStatics_9.aBoolean2433 =
              GlobalStatics_9.gameBuffer.readUnsignedByte() == 1;
          GlobalStatics_6.aBoolean1641 =
              GlobalStatics_9.gameBuffer.readUnsignedByte() == 1;
          GlobalStatics_7.aBoolean4063 =
              (GlobalStatics_9.gameBuffer.readUnsignedByte() == 1);
          GlobalStatics_10.aBoolean3166 =
              GlobalStatics_9.gameBuffer.readUnsignedByte() == 1;
          GlobalStatics_8.aBoolean29 =
              GlobalStatics_9.gameBuffer.readUnsignedByte() == 1;
          GlobalStatics_10.localPlayerId = GlobalStatics_9.gameBuffer
              .readUnsignedShort();
          GlobalStatics_9.aBoolean3358 =
              GlobalStatics_9.gameBuffer.readUnsignedByte() == 1;
          GlobalStatics_9.aBoolean66 =
              (GlobalStatics_9.gameBuffer.readUnsignedByte() == 1);
          GlobalStatics_9.method1702((byte) -124, GlobalStatics_9.aBoolean66);
          GlobalStatics_10.method845(GlobalStatics_9.aBoolean66, 255);
          if (!GlobalStatics_9.aBoolean3779) {
            if ((!GlobalStatics_9.aBoolean2433
                || GlobalStatics_7.aBoolean4063)
                && !GlobalStatics_9.aBoolean3358) {
              DummyClass32.aClass94_516.method1577(-1857);
            } else {
              GlobalStatics_10.aClass94_1374.method1577(-1857);
            }
          }

          GlobalStatics_0.packetId = GlobalStatics_9.gameBuffer.readPacketId();
          GlobalStatics_0.packetLength = GlobalStatics_9.gameBuffer
              .readUnsignedShort();
          GlobalStatics_10.loginState = 9;
        }

        if ((GlobalStatics_10.loginState == 9)) {
          if ((GlobalStatics_9.gameSocket.available()
              < GlobalStatics_0.packetLength)) {
            return;
          }

          GlobalStatics_9.gameBuffer.position = 0;
          GlobalStatics_9.gameSocket
              .read(GlobalStatics_9.gameBuffer.bytes, 0,
                  GlobalStatics_0.packetLength);
          GlobalStatics_5.loginResponse = 2;
          GlobalStatics_10.loginState = 0;
          GlobalStatics_3.method2061(true);
          GlobalStatics_2.anInt3606 = -1;
          DummyClass37.parseSceneRebuild(false);
          GlobalStatics_0.packetId = -1;
          return;
        }

      } catch (IOException var7) {
        if (GlobalStatics_9.gameSocket != null) {
          GlobalStatics_9.gameSocket.destroy();
          GlobalStatics_9.gameSocket = null;
        }

        if (GlobalStatics_9.anInt2079 >= 1) {
          GlobalStatics_10.loginState = 0;
          GlobalStatics_5.loginResponse = -4;
        } else {
          GlobalStatics_10.loginState = 1;
          GlobalStatics_4.anInt820 = 0;
          ++GlobalStatics_9.anInt2079;
          if ((DummyClass11.anInt2036 == GlobalStatics_9.anInt2894)) {
            GlobalStatics_9.anInt2894 = GlobalStatics_9.anInt506;
          } else {
            GlobalStatics_9.anInt2894 = DummyClass11.anInt2036;
          }
        }
      }

    }
  }

  public static int repackHSL(int var0, int var1) {
    var1 = var1 * (var0 & 127) >> 7;
    if (var1 < 2) {
      var1 = 2;
    } else if (var1 > 126) {
      var1 = 126;
    }

    return (var0 & '\uff80') + var1;
  }

  public static void method1754(int var0) {
    DummyClass2.aClass153_1680 = null;
    DummyClass2.anIntArray1679 = null;
    if (var0 >= -49) {
      DummyClass2.handleLogin();
    }

    DummyClass2.anIntArray1681 = null;
  }

}
