package com.jagex.runescape;

import java.io.IOException;
import java.net.Socket;

public class DummyClass2 {

  public static int[] anIntArray1679 = new int[14];
  public static FileUnpacker aClass153_1680;
  public static int[] anIntArray1681;

  public static void handleLogin() {
    if (TextureSampler28.loginState != 0
          && TextureSampler28.loginState != 5) {
        try {
          if (((++VertexNormal.anInt820) > 2001 -1)) {
            if (SomethingVolume15.gameSocket != null) {
              SomethingVolume15.gameSocket.destroy();
              SomethingVolume15.gameSocket = null;
            }

            if ((SomethingIndex150.anInt2079 >= 2 -1)) {
              AbstractImageProducer.loginResponse = -5;
              TextureSampler28.loginState = 0;
              return;
            }

            VertexNormal.anInt820 = 0;
            if (Projectile.anInt2894 == DummyClass11.anInt2036) {
              Projectile.anInt2894 = GameWorldSomething.anInt506;
            } else {
              Projectile.anInt2894 = DummyClass11.anInt2036;
            }

            TextureSampler28.loginState = 1;
            ++SomethingIndex150.anInt2079;
          }

          if (TextureSampler28.loginState == 1) {
            AreaSoundEffect.socketRequest =
                DummyClass35.signLink
                    .method1441((byte) 8, DummyClass36.aString2611,
                        Projectile.anInt2894);
            TextureSampler28.loginState = 2;
          }

          if (~TextureSampler28.loginState == -3) {
            assert AreaSoundEffect.socketRequest != null;
            if (~AreaSoundEffect.socketRequest.status == -3) {
              throw new IOException();
            }

            if (AreaSoundEffect.socketRequest.status != 1) {
              return;
            }

            SomethingVolume15.gameSocket =
                new SocketStream((Socket) AreaSoundEffect.socketRequest.result,
                    DummyClass35.signLink);
            AreaSoundEffect.socketRequest = null;
            long encodedUsername =
                TextureSampler15.encodedUsername = GroundItemNode.username
                    .toBase37();
            TextureSampler12.secureBuffer.position = 0;
            TextureSampler12.secureBuffer.writeByte(14);
            int hash = (int) (encodedUsername >> 16 & 31L);
            TextureSampler12.secureBuffer.writeByte(hash);
            SomethingVolume15.gameSocket
                .write(TextureSampler12.secureBuffer.bytes, 0, 2);
            if (GameWorld.audioOutputStream0 != null) {
              GameWorld.audioOutputStream0.pause();
            }

            if (SomethingWorldMappy.audioOutputStream1 != null) {
              SomethingWorldMappy.audioOutputStream1.pause();
            }

            int response = SomethingVolume15.gameSocket.read();
            if (GameWorld.audioOutputStream0 != null) {
              GameWorld.audioOutputStream0.pause();
            }

            if (SomethingWorldMappy.audioOutputStream1 != null) {
              SomethingWorldMappy.audioOutputStream1.pause();
            }

            if (response != 0) {
              AbstractImageProducer.loginResponse = response;
              TextureSampler28.loginState = 0;
              SomethingVolume15.gameSocket.destroy();
              SomethingVolume15.gameSocket = null;
              return;
            }

            TextureSampler28.loginState = 3;
          }

          if (TextureSampler28.loginState == 3) {
            if (SomethingVolume15.gameSocket.available() < 8) {
              return;
            }

            SomethingVolume15.gameSocket
                .read(SpotAnimationConfig.gameBuffer.bytes, 0, 8);
            SpotAnimationConfig.gameBuffer.position = 0;
            TextureSampler7.serverCipherKey = SpotAnimationConfig.gameBuffer
                .readLong();
            TextureSampler12.secureBuffer.position = 0;
            int[] keys = new int[4];
            keys[2] = (int) (TextureSampler7.serverCipherKey >> 32);
            keys[3] = (int) TextureSampler7.serverCipherKey;
            keys[1] = (int) (Math.random() * 9.9999999E7D);
            keys[0] = (int) (Math.random() * 9.9999999E7D);
            TextureSampler12.secureBuffer.writeByte(10);
            TextureSampler12.secureBuffer.writeInt(keys[0]);
            TextureSampler12.secureBuffer.writeInt(keys[1]);
            TextureSampler12.secureBuffer.writeInt(keys[2]);
            TextureSampler12.secureBuffer.writeInt(keys[3]);
            TextureSampler12.secureBuffer
                .writeLong(GroundItemNode.username.toBase37());
            TextureSampler12.secureBuffer.writeString(GroundItemNode.password);
            TextureSampler12.secureBuffer
                .encipherRSA(RSAConfiguration.PUBLIC_EXPONENT,
                    RSAConfiguration.MODULUS);
            FileRequester.loginBuffer.position = 0;
            if (DummyClass15.state == 40) {
              FileRequester.loginBuffer.writeByte(18);
            } else {
              FileRequester.loginBuffer.writeByte(16);
            }

            FileRequester.loginBuffer.writeShort(
                TextureSampler12.secureBuffer.position + 159 + TextureSampler29
                    .getByteLength(
                        DummyClass7.settings));
            FileRequester.loginBuffer.writeInt(530);
            FileRequester.loginBuffer.writeByte(EnumStringFetcher.anInt2161);
            FileRequester.loginBuffer
                .writeByte(!ProjectileNode.aBoolean3779 ? 0 : 1);
            FileRequester.loginBuffer.writeByte(1);
            FileRequester.loginBuffer.writeByte(MidiSomething.getWindowMode());
            FileRequester.loginBuffer.writeShort(DummyClass30.viewWidth);
            FileRequester.loginBuffer.writeShort(GroundItem.viewHeight);
            FileRequester.loginBuffer.writeByte(GroundItemNode.anInt3671);
            DummyClass50.writeUUID(FileRequester.loginBuffer, true);
            FileRequester.loginBuffer.writeString(DummyClass7.settings);
            FileRequester.loginBuffer
                .writeInt(MonoChromaticImageBuffer.affiliateId);
            FileRequester.loginBuffer.writeInt(DummyClass51.getSettings());
            StillGraphic.aBoolean2705 = true;
            FileRequester.loginBuffer
                .writeShort(SomethingLight0.interfaceCounter);
            FileRequester.loginBuffer.writeInt(
                SomethingTexture3.animationFrames.getTableChecksum());
            FileRequester.loginBuffer
                .writeInt(ProjectileNode.animationBases.getTableChecksum());
            FileRequester.loginBuffer
                .writeInt(Something3dRoot.configs.getTableChecksum());
            FileRequester.loginBuffer
                .writeInt(GameObject.widgets.getTableChecksum());
            FileRequester.loginBuffer
                .writeInt(AbstractMouseWheel.soundEffects.getTableChecksum());
            FileRequester.loginBuffer
                .writeInt(TextureSampler26.maps.getTableChecksum());
            FileRequester.loginBuffer
                .writeInt(SomethingTexture1.fileUnpacker6.getTableChecksum());
            FileRequester.loginBuffer
                .writeInt(DummyClass13.models.getTableChecksum());
            FileRequester.loginBuffer
                .writeInt(Projectile.sprites.getTableChecksum());
            FileRequester.loginBuffer
                .writeInt(TextureSampler32.textures.getTableChecksum());
            FileRequester.loginBuffer
                .writeInt(TextureSampler28.fileUnpacker10.getTableChecksum());
            FileRequester.loginBuffer
                .writeInt(SubNode.fileUnpacker11.getTableChecksum());
            FileRequester.loginBuffer
                .writeInt(WidgetAccess.scripts.getTableChecksum());
            FileRequester.loginBuffer
                .writeInt(FileUnpacker.fileUnpacker13.getTableChecksum());
            FileRequester.loginBuffer
                .writeInt(ClanChatUser.midiInstruments.getTableChecksum());
            FileRequester.loginBuffer
                .writeInt(NPC.fileUnpacker15.getTableChecksum());
            FileRequester.loginBuffer
                .writeInt(FloorOverlay.fileUnpacker16.getTableChecksum());
            FileRequester.loginBuffer
                .writeInt(NPC.fileUnpacker17.getTableChecksum());
            FileRequester.loginBuffer
                .writeInt(DummyClass55.fileUnpacker18.getTableChecksum());
            FileRequester.loginBuffer
                .writeInt(FloorUnderlay.fileUnpacker19.getTableChecksum());
            FileRequester.loginBuffer.writeInt(
                TextureSampler36.animationSequences.getTableChecksum());
            FileRequester.loginBuffer
                .writeInt(SceneSomething2.fileUnpacker21.getTableChecksum());
            FileRequester.loginBuffer.writeInt(
                AudioSomethingSomething.fileUnpacker22.getTableChecksum());
            FileRequester.loginBuffer
                .writeInt(SomethingPacket116.worldMapData.getTableChecksum());
            FileRequester.loginBuffer
                .writeInt(GroundItem.fileUnpacker24.getTableChecksum());
            FileRequester.loginBuffer
                .writeInt(SpawnedGameObject.fileUnpacker25.getTableChecksum());
            FileRequester.loginBuffer
                .writeInt(TriChromaticImageCache.materials.getTableChecksum());
            FileRequester.loginBuffer
                .writeInt(DummyClass22.particles.getTableChecksum());
            FileRequester.loginBuffer
                .write(TextureSampler12.secureBuffer.bytes, 0,
                    TextureSampler12.secureBuffer.position);
            SomethingVolume15.gameSocket
                .write(FileRequester.loginBuffer.bytes, 0,
                    FileRequester.loginBuffer.position);

            TextureSampler12.secureBuffer.initializeCipher(keys);
            for (int i = 0; i < 4; i++) {
              keys[i] += 50;
            }
            SpotAnimationConfig.gameBuffer.initializeCipher(keys);

            TextureSampler28.loginState = 4;
          }

          if (~TextureSampler28.loginState == -5) {
            if (~SomethingVolume15.gameSocket.available() > -2) {
              return;
            }

            int response = SomethingVolume15.gameSocket.read();
            if (~response == -22) {
              TextureSampler28.loginState = 7;
            } else {
              if (response == 29) {
                TextureSampler28.loginState = 10;
              } else {
                if (response == 1) {
                  TextureSampler28.loginState = 5;
                  AbstractImageProducer.loginResponse = 1;
                  return;
                }

                if (response != 2) {
                  if ((response != 16 -1)) {
                    if (response == 23 && ~SomethingIndex150.anInt2079 > -2) {
                      TextureSampler28.loginState = 1;
                      ++SomethingIndex150.anInt2079;
                      VertexNormal.anInt820 = 0;
                      SomethingVolume15.gameSocket.destroy();
                      SomethingVolume15.gameSocket = null;
                      return;
                    }

                    AbstractImageProducer.loginResponse = response;
                    TextureSampler28.loginState = 0;
                    SomethingVolume15.gameSocket.destroy();
                    SomethingVolume15.gameSocket = null;
                    return;
                  }

                  TextureSampler28.loginState = 0;
                  AbstractImageProducer.loginResponse = response;
                  return;
                }

                TextureSampler28.loginState = 8;
              }
            }
          }

          if (TextureSampler28.loginState == 6) {
            TextureSampler12.secureBuffer.position = 0;
            TextureSampler12.secureBuffer.writePacket(17);
            SomethingVolume15.gameSocket
                .write(TextureSampler12.secureBuffer.bytes, 0,
                    TextureSampler12.secureBuffer.position);
            TextureSampler28.loginState = 4;
            return;
          }

          if (TextureSampler28.loginState == 7) {
            if ((SomethingVolume15.gameSocket.available() >= 2 -1)) {
              TextureSampler25.anInt3413 =
                  60 * (3 + SomethingVolume15.gameSocket.read());
              TextureSampler28.loginState = 0;
              AbstractImageProducer.loginResponse = 21;
              SomethingVolume15.gameSocket.destroy();
              SomethingVolume15.gameSocket = null;
              return;
            }

            return;
          }

          if (~TextureSampler28.loginState == -11) {
            if (SomethingVolume15.gameSocket.available() >= 1) {
              MonoChromaticImageBuffer.anInt2561 = SomethingVolume15.gameSocket
                  .read();
              TextureSampler28.loginState = 0;
              AbstractImageProducer.loginResponse = 29;
              SomethingVolume15.gameSocket.destroy();
              SomethingVolume15.gameSocket = null;
              return;
            }

            return;
          }

          if (TextureSampler28.loginState == 8) {
            if (~SomethingVolume15.gameSocket.available() > -15) {
              return;
            }

            SomethingVolume15.gameSocket
                .read(SpotAnimationConfig.gameBuffer.bytes, 0, 14);
            SpotAnimationConfig.gameBuffer.position = 0;
            TextureSampler35.rights = SpotAnimationConfig.gameBuffer
                .readUnsignedByte();
            ProjectileNode.anInt3775 = SpotAnimationConfig.gameBuffer
                .readUnsignedByte();
            SomethingVolume15.aBoolean2433 =
                SpotAnimationConfig.gameBuffer.readUnsignedByte() == 1;
            BufferData.aBoolean1641 =
                SpotAnimationConfig.gameBuffer.readUnsignedByte() == 1;
            FileCacheRequest.aBoolean4063 =
                ~SpotAnimationConfig.gameBuffer.readUnsignedByte() == -2;
            TextureSampler31.aBoolean3166 =
                SpotAnimationConfig.gameBuffer.readUnsignedByte() == 1;
            GameCanvas.aBoolean29 =
                SpotAnimationConfig.gameBuffer.readUnsignedByte() == 1;
            WidgetAccess.localPlayerId = SpotAnimationConfig.gameBuffer
                .readUnsignedShort();
            TextureSampler3.aBoolean3358 =
                SpotAnimationConfig.gameBuffer.readUnsignedByte() == 1;
            MapScene.aBoolean66 =
                ~SpotAnimationConfig.gameBuffer.readUnsignedByte() == -2;
            SomethingLight0.method1702((byte) -124, MapScene.aBoolean66);
            FileSystem.method845(MapScene.aBoolean66, 255);
            if (!ProjectileNode.aBoolean3779) {
              if ((!SomethingVolume15.aBoolean2433
                  || FileCacheRequest.aBoolean4063)
                  && !TextureSampler3.aBoolean3358) {
                DummyClass32.aClass94_516.method1577(-1857);
              } else {
                TriChromaticImageCache.aClass94_1374.method1577(-1857);
              }
            }

            GameString.packetId = SpotAnimationConfig.gameBuffer.readPacketId();
            HashTable.packetLength = SpotAnimationConfig.gameBuffer
                .readUnsignedShort();
            TextureSampler28.loginState = 9;
          }

          if (~TextureSampler28.loginState == -10) {
            if (~SomethingVolume15.gameSocket.available()
                > ~HashTable.packetLength) {
              return;
            }

            SpotAnimationConfig.gameBuffer.position = 0;
            SomethingVolume15.gameSocket
                .read(SpotAnimationConfig.gameBuffer.bytes, 0,
                    HashTable.packetLength);
            AbstractImageProducer.loginResponse = 2;
            TextureSampler28.loginState = 0;
            AnimationSequence.method2061(true);
            AbstractObjectNode.anInt3606 = -1;
            DummyClass37.parseSceneRebuild(false);
            GameString.packetId = -1;
            return;
          }

        } catch (IOException var7) {
          if (SomethingVolume15.gameSocket != null) {
            SomethingVolume15.gameSocket.destroy();
            SomethingVolume15.gameSocket = null;
          }

          if (SomethingIndex150.anInt2079 >= 1) {
            TextureSampler28.loginState = 0;
            AbstractImageProducer.loginResponse = -4;
          } else {
            TextureSampler28.loginState = 1;
            VertexNormal.anInt820 = 0;
            ++SomethingIndex150.anInt2079;
            if (~DummyClass11.anInt2036 == ~Projectile.anInt2894) {
              Projectile.anInt2894 = GameWorldSomething.anInt506;
            } else {
              Projectile.anInt2894 = DummyClass11.anInt2036;
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
