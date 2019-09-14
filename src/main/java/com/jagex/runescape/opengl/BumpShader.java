package com.jagex.runescape.opengl;

import com.jagex.runescape.opengl.GLStatics;
import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.MaterialShader;

public final class BumpShader implements MaterialShader {

  public void disable() {
    if (GLStatics.useBumpMaps) {
      GlRenderer.setLightingEnabled(true);
    }
  }

  public void enable() {
    if (GLStatics.useBumpMaps) {
      GlRenderer.setLightingEnabled(false);
    }
  }

  public void set(int var1) {
  }

  public int method24() {
    return 0;
  }
}
