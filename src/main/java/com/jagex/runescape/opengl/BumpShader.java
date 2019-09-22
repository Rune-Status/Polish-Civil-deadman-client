package com.jagex.runescape.opengl;

import com.jagex.runescape.settings.SettingsStatics;

public final class BumpShader implements MaterialShader {

  public void disable() {
    if (SettingsStatics.USE_BUMP_MAPS) {
      GlRenderer.setLightingEnabled(true);
    }
  }

  public void enable() {
    if (SettingsStatics.USE_BUMP_MAPS) {
      GlRenderer.setLightingEnabled(false);
    }
  }

  public void set(int var1) {
  }

  public int method24() {
    return 0;
  }
}
