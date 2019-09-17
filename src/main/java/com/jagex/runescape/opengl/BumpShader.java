package com.jagex.runescape.opengl;

public final class BumpShader implements MaterialShader {

  public void disable() {
    if (GLStatics.USE_BUMP_MAPS) {
      GlRenderer.setLightingEnabled(true);
    }
  }

  public void enable() {
    if (GLStatics.USE_BUMP_MAPS) {
      GlRenderer.setLightingEnabled(false);
    }
  }

  public void set(int var1) {
  }

  public int method24() {
    return 0;
  }
}
