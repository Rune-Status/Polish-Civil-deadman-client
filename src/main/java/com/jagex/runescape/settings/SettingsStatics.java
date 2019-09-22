package com.jagex.runescape.settings;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.ThreadUtilities;
import com.jagex.runescape.model.FileOnDisk;
import com.jagex.runescape.model.SignLink;
import com.jagex.runescape.model.SignLinkRequest;
import java.io.IOException;

public final class SettingsStatics {

  public static int GL_RENDERING_SAMPLES;
  public static int RENDERING_SAMPLES;
  public static boolean SHOULD_USE_OPENGL = true;
  public static boolean USE_BUMP_MAPS = true;
  public static boolean USE_INT_ARRAY_KEYBOARD_EVENTS;
  public static boolean SAFE_MODE;
  public static int BRIGHTNESS = 3;
  public static boolean aBoolean3004 = true;

  public static int anInt2378;
  public static int anInt3071;
  public static int anInt120 = 255;
  public static int anInt340 = 127;
  public static int anInt2453 = 127;
  public static boolean aBoolean3184 = true;
  public static boolean aBoolean1685 = true;
  public static boolean aBoolean661 = true;
  public static boolean aBoolean3604 = true;
  public static boolean aBoolean1905 = true;
  public static boolean aBoolean488 = true;
  public static boolean aBoolean2623 = true;
  public static boolean aBoolean236 = true;
  public static boolean aBoolean3275 = true;
  public static int anInt1137 = 2;
  public static boolean aBoolean2910 = true;
  public static int anInt2682 = 2;
  public static int anInt3492 = 64;
  public static int anInt2148;
  public static boolean aBoolean1080;
  public static int anInt2488;
  public static int anInt2577;

  public static void readSettings(Buffer buffer) {
    if (buffer.bytes.length == 0) {
      return;
    }
    int version = buffer.readUnsignedByte();
    int expectedSize = 33;

    if (buffer.bytes.length - buffer.position >= expectedSize) {
      SettingsStatics.BRIGHTNESS = buffer.readUnsignedByte();
      if (SettingsStatics.BRIGHTNESS >= 1) {
        if (SettingsStatics.BRIGHTNESS > 4) {
          SettingsStatics.BRIGHTNESS = 4;
        }
      } else {
        SettingsStatics.BRIGHTNESS = 1;
      }

      SettingsStatics.SHOULD_USE_OPENGL = buffer.readUnsignedByte() == 1;
      SettingsStatics.aBoolean3604 = buffer.readUnsignedByte() == 1;
      SettingsStatics.aBoolean1905 = buffer.readUnsignedByte() == 1;
      SettingsStatics.aBoolean488 = buffer.readUnsignedByte() == 1;
      SettingsStatics.aBoolean236 = buffer.readUnsignedByte() == 1;
      SettingsStatics.aBoolean2623 = buffer.readUnsignedByte() == 1;
      SettingsStatics.aBoolean3275 = buffer.readUnsignedByte() == 1;
      SettingsStatics.aBoolean2910 = buffer.readUnsignedByte() == 1;
      SettingsStatics.anInt1137 = buffer.readUnsignedByte();
      if (SettingsStatics.anInt1137 > 2) {
        SettingsStatics.anInt1137 = 2;
      }
      SettingsStatics.USE_BUMP_MAPS = buffer.readUnsignedByte() == 1;
      if (version < 2) {
        buffer.readUnsignedByte();
      }

      SettingsStatics.aBoolean1685 = buffer.readUnsignedByte() == 1;
      SettingsStatics.aBoolean661 = buffer.readUnsignedByte() == 1;
      SettingsStatics.RENDERING_SAMPLES = buffer.readUnsignedByte();

      if (SettingsStatics.RENDERING_SAMPLES > 2) {
        SettingsStatics.RENDERING_SAMPLES = 2;
      }

      SettingsStatics.GL_RENDERING_SAMPLES = SettingsStatics.RENDERING_SAMPLES;
      SettingsStatics.aBoolean3184 = buffer.readUnsignedByte() == 1;
      SettingsStatics.anInt2453 = buffer.readUnsignedByte();
      if (SettingsStatics.anInt2453 > 127) {
        SettingsStatics.anInt2453 = 127;
      }

      SettingsStatics.anInt120 = buffer.readUnsignedByte();
      SettingsStatics.anInt340 = buffer.readUnsignedByte();
      if (SettingsStatics.anInt340 > 127) {
        SettingsStatics.anInt340 = 127;
      }

      if (version >= 1) {
        SettingsStatics.anInt2378 = buffer.readUnsignedShort();
        SettingsStatics.anInt3071 = buffer.readUnsignedShort();
      }

      if (version >= 3 && version < 6) {
        buffer.readUnsignedByte();
      }

      if (version >= 4) {
        int var4 = buffer.readUnsignedByte();
        if (SettingsStatics.anInt3492 < 96) {
          var4 = 0;
        }

        SettingsStatics.anInt2682 = var4;
      }

      if (version >= 5) {
        SettingsStatics.anInt2148 = buffer.readInt();
      }

      if (version >= 6) {
        SettingsStatics.anInt2577 = buffer.readUnsignedByte();
      }

      if (version >= 7) {
        SettingsStatics.SAFE_MODE = buffer.readUnsignedByte() == 1;
      }

      if (version >= 8) {
        SettingsStatics.USE_INT_ARRAY_KEYBOARD_EVENTS =
            buffer.readUnsignedByte() == 1;
      }

      if (version >= 9) {
        SettingsStatics.anInt2488 = buffer.readUnsignedByte();
      }

      if (version >= 10) {
        SettingsStatics.aBoolean1080 = buffer.readUnsignedByte() != 0;
      }

      if (version >= 11) {
        SettingsStatics.aBoolean3004 = buffer.readUnsignedByte() != 0;
      }

    }
  }

  public static void writeSettings(SignLink link) {
    try {
      SignLinkRequest var3 = link.getSettings("runescape");

      while (var3.status == 0) {
        ThreadUtilities.sleep(1L);
      }

      if (var3.status == 1) {
        FileOnDisk file = (FileOnDisk) var3.result;
        Buffer buffer = SettingsStatics.createSettingsBuffer();
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
    buffer.writeByte(SettingsStatics.BRIGHTNESS);
    buffer.writeByte(SettingsStatics.SHOULD_USE_OPENGL ? 1 : 0);
    buffer.writeByte(SettingsStatics.aBoolean3604 ? 1 : 0);
    buffer.writeByte(SettingsStatics.aBoolean1905 ? 1 : 0);
    buffer.writeByte(SettingsStatics.aBoolean488 ? 1 : 0);
    buffer.writeByte(SettingsStatics.aBoolean236 ? 1 : 0);
    buffer.writeByte(SettingsStatics.aBoolean2623 ? 1 : 0);
    buffer.writeByte(SettingsStatics.aBoolean3275 ? 1 : 0);
    buffer.writeByte(SettingsStatics.aBoolean2910 ? 1 : 0);
    buffer.writeByte(SettingsStatics.anInt1137);
    buffer.writeByte(SettingsStatics.USE_BUMP_MAPS ? 1 : 0);
    buffer.writeByte(SettingsStatics.aBoolean1685 ? 1 : 0);
    buffer.writeByte(SettingsStatics.aBoolean661 ? 1 : 0);
    buffer.writeByte(SettingsStatics.RENDERING_SAMPLES);
    buffer.writeByte(SettingsStatics.aBoolean3184 ? 1 : 0);
    buffer.writeByte(SettingsStatics.anInt2453);
    buffer.writeByte(SettingsStatics.anInt120);
    buffer.writeByte(SettingsStatics.anInt340);
    buffer.writeShort(SettingsStatics.anInt2378);
    buffer.writeShort(SettingsStatics.anInt3071);
    buffer.writeByte(SettingsStatics.anInt2682);
    buffer.writeInt(SettingsStatics.anInt2148);
    buffer.writeByte(SettingsStatics.anInt2577);
    buffer.writeByte(SettingsStatics.SAFE_MODE ? 1 : 0);
    buffer.writeByte(SettingsStatics.USE_INT_ARRAY_KEYBOARD_EVENTS ? 1 : 0);
    buffer.writeByte(SettingsStatics.anInt2488);
    buffer.writeByte(SettingsStatics.aBoolean1080 ? 1 : 0);
    buffer.writeByte(SettingsStatics.aBoolean3004 ? 1 : 0);
    return buffer;
  }

  public static void loadSettings(SignLink var0) {
    SettingsStatics.reset();

    FileOnDisk file = null;
    try {
      SignLinkRequest var3 = var0.getSettings("runescape");

      while (var3.status == 0) {
        ThreadUtilities.sleep(1L);
      }

      if (var3.status == 1) {
        file = (FileOnDisk) var3.result;
        byte[] buffer = new byte[(int) file.length()];

        int read;
        for (int offset = 0; offset < buffer.length; offset += read) {
          read = file.readBytes(offset, 0, buffer.length - offset, buffer);
          if (read == -1) {
            throw new IOException("EOF");
          }
        }

        SettingsStatics.readSettings(new Buffer(buffer));
      }
    } catch (Exception var8) {
    }

    try {
      if (file != null) {
        file.close();
      }
    } catch (Exception var7) {
    }
  }

  private static void reset() {
    SettingsStatics.BRIGHTNESS = 3;
    SettingsStatics.SHOULD_USE_OPENGL = true;
    SettingsStatics.aBoolean3604 = true;
    SettingsStatics.aBoolean3184 = true;
    SettingsStatics.aBoolean1685 = true;
    SettingsStatics.RENDERING_SAMPLES = 0;
    SettingsStatics.GL_RENDERING_SAMPLES = 0;
    SettingsStatics.anInt3071 = 0;
    SettingsStatics.aBoolean1905 = true;
    SettingsStatics.aBoolean2623 = true;
    SettingsStatics.aBoolean236 = true;
    SettingsStatics.anInt340 = 127;
    SettingsStatics.aBoolean661 = true;
    SettingsStatics.aBoolean2910 = true;
    SettingsStatics.anInt2378 = 0;
    SettingsStatics.anInt1137 = 2;
    SettingsStatics.aBoolean3275 = true;
    SettingsStatics.USE_BUMP_MAPS = true;
    SettingsStatics.anInt120 = 255;
    SettingsStatics.aBoolean488 = true;
    SettingsStatics.anInt2453 = 127;
    if (SettingsStatics.anInt3492 >= 96) {
      SettingsStatics.anInt2682 = 2;
    } else {
      SettingsStatics.anInt2682 = 0;
    }
    SettingsStatics.anInt2148 = 0;
    SettingsStatics.anInt2488 = 0;
    SettingsStatics.USE_INT_ARRAY_KEYBOARD_EVENTS = false;
    SettingsStatics.aBoolean3004 = true;
    SettingsStatics.SAFE_MODE = false;
    SettingsStatics.aBoolean1080 = false;
    SettingsStatics.anInt2577 = 0;
  }
}
