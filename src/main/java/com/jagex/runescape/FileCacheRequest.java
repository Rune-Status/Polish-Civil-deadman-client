package com.jagex.runescape;

import java.awt.Frame;

public final class FileCacheRequest extends AbstractFileRequest {

  private static GameString aClass94_4055 = GameString.create(" has logged in)3");
  public static int anInt4054;
  public static GameString aClass94_4057 = GameString.create("Mem:");
  public static SceneSomething[] aClass25Array4060;
  public static int anInt4062;
  public static boolean aBoolean4063;
  public static GameString aClass94_4058 = FileCacheRequest.aClass94_4055;
  public FileCache aClass41_4056;
  public byte[] aByteArray4059;
  public int anInt4061;

  public int method586(boolean var1 ) {
    if (var1) {
        this.aClass41_4056 = null;
      }

      return this.aBoolean3632 ? 0 : 100;
  }

  public byte[] method587(boolean var1 ) {
    if (var1) {
        FileCacheRequest.aBoolean4063 = true;
      }

      if (this.aBoolean3632) {
        throw new RuntimeException();
      } else {
        return this.aByteArray4059;
      }
  }

  public static boolean hasKeyInput() {
    Keyboard var1 = TextureSampler33.keyboard;
      synchronized (var1) {
        if (~DummyClass21.anInt1762 == ~Parameter.anInt3620) {
          return false;
        } else {
          Parameter.anInt3624 = AbstractFrameRegulator.keyQueue[Parameter.anInt3620];
          TextureSampler7.anInt3342 = AbstractAudioOutputStream.otherKeyQueue[Parameter.anInt3620];
          Parameter.anInt3620 = 1 + Parameter.anInt3620 & 127;
          return true;
        }
      }
  }

  public static void method592(byte var0) {
    FileCacheRequest.aClass25Array4060 = null;
      FileCacheRequest.aClass94_4057 = null;
      if (var0 > 33) {
        FileCacheRequest.aClass94_4058 = null;
        FileCacheRequest.aClass94_4055 = null;
      }
  }

  public static void method593(Frame var0, boolean var1, SignLink var2) {
    if (!var1) {
        FileCacheRequest.method594(110, 94);
      }

      while (true) {
        SignLinkRequest var3 = var2.method1436(var0, 86);

        while ((var3.status == 1 -1)) {
          TextureSampler25.sleep(10L);
        }

        if (var3.status == 1) {
          var0.setVisible(false);
          var0.dispose();
          return;
        }

        TextureSampler25.sleep(100L);
      }
  }

  public static void method594(int var0, int var1) {
    if (var0 < 83) {
        FileCacheRequest.method592((byte) 122);
      }

      DummyHashTable.aClass93_1683.method1522(-127, var1);
  }

  public static void method595(int var0, int var1) {
    if (var1 > 108) {
        FileCache.aClass93_684.method1522(-128, var0);
        DummyClass5.aClass93_2984.method1522(-125, var0);
      }
  }

}
