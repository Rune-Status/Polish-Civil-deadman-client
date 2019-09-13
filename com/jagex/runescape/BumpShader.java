package com.jagex.runescape;

import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.shader.MaterialShader;

public final class BumpShader implements MaterialShader {

  public void disable() {
    if (DisplayMode.useBumpMaps) {
      GlRenderer.setLightingEnabled(true);
    }
  }

  public void enable() {
    if (DisplayMode.useBumpMaps) {
      GlRenderer.setLightingEnabled(false);
    }
  }

  public void set(int var1) {
  }

  public int method24() {
    return 0;
  }
}
