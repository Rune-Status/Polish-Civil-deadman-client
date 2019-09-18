package com.jagex.runescape.camera;

import com.jagex.runescape.math.MathUtilities;

public class CameraStatics {

  public static int CURRENT_PITCH;
  public static int CURRENT_YAW;
  public static int CURRENT_Z;
  public static int CURRENT_X;
  public static int CURRENT_Y;
  public static short SOMETHING_SCENE_Y_0 = 256;
  public static short SOMETHING_SCENE_Y_0_1 = 320;

  public static void update(
      int cameraXOffset,
      int zoom,
      int cameraYOffset,
      int cameraZ,
      int yaw,
      int cameraZOffset,
      int pitch
  ) {
    //update zoom
    zoom = zoom - 334;
    if (zoom >= 0) {
      if (100 > zoom) {
        zoom = 100;
      }
    } else {
      zoom = 0;
    }

    int zoomOffset = zoom * (SOMETHING_SCENE_Y_0 - SOMETHING_SCENE_Y_0_1) / 100
        + SOMETHING_SCENE_Y_0;
    cameraZ = cameraZ * zoomOffset >> 8;
    //update zoom end

    int var8 = 2047 & 2048 - pitch;
    int var9 = 2047 & 2048 - yaw;
    int cameraX = 0;
    int cameraY = 0;

    if (var8 != 0) {
      int sin = MathUtilities.SINE_TABLE[var8];
      int cos = MathUtilities.COSINE_TABLE[var8];
      cameraY = sin * -cameraZ >> 16;
      cameraZ = cos * cameraZ >> 16;
    }

    if (var9 != 0) {
      int sin = MathUtilities.SINE_TABLE[var9];
      int cos = MathUtilities.COSINE_TABLE[var9];
      cameraX = sin * cameraZ >> 16;
      cameraZ = cameraZ * cos >> 16;
    }

    CURRENT_PITCH = pitch;
    CURRENT_YAW = yaw;
    CURRENT_Z = cameraZOffset - cameraZ;
    CURRENT_X = cameraXOffset - cameraX;
    CURRENT_Y = cameraYOffset - cameraY;
  }
}
