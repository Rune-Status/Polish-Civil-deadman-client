package com.jagex.runescape.settings;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.model.FileOnDisk;
import com.jagex.runescape.model.SignLink;
import com.jagex.runescape.model.SignLinkRequest;
import com.jagex.runescape.opengl.GLStatics;
import com.jagex.runescape.statics.DummyClass0;
import com.jagex.runescape.statics.DummyClass28;
import com.jagex.runescape.statics.DummyClass35;
import com.jagex.runescape.statics.DummyClass4;
import com.jagex.runescape.statics.GlobalStatics_0;
import com.jagex.runescape.statics.GlobalStatics_1;
import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_2;
import com.jagex.runescape.statics.GlobalStatics_3;
import com.jagex.runescape.statics.GlobalStatics_4;
import com.jagex.runescape.statics.GlobalStatics_6;
import com.jagex.runescape.statics.GlobalStatics_7;
import com.jagex.runescape.statics.GlobalStatics_9;

public final class SettingsStatics {

  public static void parseSettings(Buffer buffer, int var1) {
    if (buffer.bytes.length == 0) {
      return;
    }
    int version = buffer.readUnsignedByte();
    int expectedSize = 33;

    if (buffer.bytes.length - buffer.position >= expectedSize) {
      GlobalStatics_4.brightnessSetting = buffer.readUnsignedByte();
      if (GlobalStatics_4.brightnessSetting >= 1) {
        if (GlobalStatics_4.brightnessSetting > 4) {
          GlobalStatics_4.brightnessSetting = 4;
        }
      } else {
        GlobalStatics_4.brightnessSetting = 1;
      }

      GlobalStatics_9.method957(buffer.readUnsignedByte() == 1);
      GlobalStatics_2.aBoolean3604 = buffer.readUnsignedByte() == 1;
      GlobalStatics_9.aBoolean1905 = buffer.readUnsignedByte() == 1;
      GlobalStatics_9.aBoolean488 = buffer.readUnsignedByte() == 1;
      GlobalStatics_10.aBoolean236 = buffer.readUnsignedByte() == 1;
      GlobalStatics_9.aBoolean2623 = buffer.readUnsignedByte() == 1;
      GlobalStatics_9.aBoolean3275 = buffer.readUnsignedByte() == 1;
      GlobalStatics_9.aBoolean2910 = buffer.readUnsignedByte() == 1;
      GLStatics.anInt1137 = buffer.readUnsignedByte();
      if (GLStatics.anInt1137 > 2) {
        GLStatics.anInt1137 = 2;
      }
      GLStatics.USE_BUMP_MAPS = buffer.readUnsignedByte() == 1;
      if (version < 2) {
        buffer.readUnsignedByte();
      }

      GLStatics.aBoolean1685 = buffer.readUnsignedByte() == 1;
      DummyClass35.aBoolean661 = buffer.readUnsignedByte() == 1;
      GlobalStatics_9.RENDERING_SAMPLES = buffer.readUnsignedByte();

      if (GlobalStatics_9.RENDERING_SAMPLES > 2) {
        GlobalStatics_9.RENDERING_SAMPLES = 2;
      }

      GlobalStatics_9.GL_RENDERING_SAMPLES = GlobalStatics_9.RENDERING_SAMPLES;
      GlobalStatics_1.aBoolean3184 = buffer.readUnsignedByte() == 1;
      GlobalStatics_7.anInt2453 = buffer.readUnsignedByte();
      if (GlobalStatics_7.anInt2453 > 127) {
        GlobalStatics_7.anInt2453 = 127;
      }

      GlobalStatics_10.anInt120 = buffer.readUnsignedByte();
      DummyClass28.anInt340 = buffer.readUnsignedByte();
      if (DummyClass28.anInt340 > 127) {
        DummyClass28.anInt340 = 127;
      }

      if (version >= 1) {
        GlobalStatics_3.anInt2378 = buffer.readUnsignedShort();
        GlobalStatics_10.anInt3071 = buffer.readUnsignedShort();
      }

      if (version >= 3 && version < 6) {
        buffer.readUnsignedByte();
      }

      if (version >= 4) {
        int var4 = buffer.readUnsignedByte();
        if (GlobalStatics_6.anInt3492 < 96) {
          var4 = 0;
        }

        DummyClass0.method1758(var4);
      }

      if (version >= 5) {
        GlobalStatics_0.anInt2148 = buffer.readInt();
      }

      if (var1 != -1) {
        GlobalStatics_6.CLIENT_SCRIPT_ERROR = null;
      }

      if (version >= 6) {
        GlobalStatics_2.anInt2577 = buffer.readUnsignedByte();
      }

      if (version >= 7) {
        GlobalStatics_0.SAFE_MODE = buffer.readUnsignedByte() == 1;
      }

      if (version >= 8) {
        GlobalStatics_2.aBoolean346 = buffer.readUnsignedByte() == 1;
      }

      if (version >= 9) {
        GlobalStatics_10.anInt2488 = buffer.readUnsignedByte();
      }

      if (version >= 10) {
        GlobalStatics_7.aBoolean1080 = buffer.readUnsignedByte() != 0;
      }

      if (version >= 11) {
        DummyClass4.aBoolean3004 = buffer.readUnsignedByte() != 0;
      }

    }
  }

  public static void writeSettings(SignLink link) {
    try {
      SignLinkRequest var3 = link.getSettings("runescape");

      while (var3.status == 0) {
        GlobalStatics_10.sleep(1L);
      }

      if (var3.status == 1) {
        FileOnDisk file = (FileOnDisk) var3.result;
        Buffer buffer = createSettingsBuffer();
        file.writeBytes(buffer.bytes, 0, buffer.position);
        file.close();
      }
    } catch (Exception exception) {
      exception.printStackTrace();
    }

  }

  public static Buffer createSettingsBuffer() {
    Buffer buffer = new Buffer(34);
    buffer.writeByte(11);
    buffer.writeByte(GlobalStatics_4.brightnessSetting);
    buffer.writeByte(GlobalStatics_7.aBoolean3665 ? 1 : 0);
    buffer.writeByte(GlobalStatics_2.aBoolean3604 ? 1 : 0);
    buffer.writeByte(GlobalStatics_9.aBoolean1905 ? 1 : 0);
    buffer.writeByte(GlobalStatics_9.aBoolean488 ? 1 : 0);
    buffer.writeByte(GlobalStatics_10.aBoolean236 ? 1 : 0);
    buffer.writeByte(GlobalStatics_9.aBoolean2623 ? 1 : 0);
    buffer.writeByte(GlobalStatics_9.aBoolean3275 ? 1 : 0);
    buffer.writeByte(GlobalStatics_9.aBoolean2910 ? 1 : 0);
    buffer.writeByte(GLStatics.anInt1137);
    buffer.writeByte(GLStatics.USE_BUMP_MAPS ? 1 : 0);
    buffer.writeByte(GLStatics.aBoolean1685 ? 1 : 0);
    buffer.writeByte(DummyClass35.aBoolean661 ? 1 : 0);
    buffer.writeByte(GlobalStatics_9.RENDERING_SAMPLES);
    buffer.writeByte(GlobalStatics_1.aBoolean3184 ? 1 : 0);
    buffer.writeByte(GlobalStatics_7.anInt2453);
    buffer.writeByte(GlobalStatics_10.anInt120);
    buffer.writeByte(DummyClass28.anInt340);
    buffer.writeShort(GlobalStatics_3.anInt2378);
    buffer.writeShort(GlobalStatics_10.anInt3071);
    buffer.writeByte(DummyClass0.method1757());
    buffer.writeInt(GlobalStatics_0.anInt2148);
    buffer.writeByte(GlobalStatics_2.anInt2577);
    buffer.writeByte(GlobalStatics_0.SAFE_MODE ? 1 : 0);
    buffer.writeByte(GlobalStatics_2.aBoolean346 ? 1 : 0);
    buffer.writeByte(GlobalStatics_10.anInt2488);
    buffer.writeByte(GlobalStatics_7.aBoolean1080 ? 1 : 0);
    buffer.writeByte(DummyClass4.aBoolean3004 ? 1 : 0);
    return buffer;
  }
}
