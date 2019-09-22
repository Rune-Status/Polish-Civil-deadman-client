package com.jagex.runescape.model;

import com.jagex.runescape.common.ThreadUtilities;

public final class AudioWorker implements Runnable {

  public volatile boolean aBoolean345;
  public SignLink aClass87_350;
  public volatile AbstractAudioOutputStream[] aClass155Array352 = new AbstractAudioOutputStream[2];
  public volatile boolean aBoolean353;

  public void run() {
    this.aBoolean353 = true;

    try {
      while (!this.aBoolean345) {
        for (int var1 = 0; var1 < 2; ++var1) {
          AbstractAudioOutputStream var2 = this.aClass155Array352[var1];
          if (var2 != null) {
            var2.process((byte) -34);
          }
        }

        ThreadUtilities.sleep(10L);
      }
    } catch (Exception exception) {
      exception.printStackTrace();
    } finally {
      this.aBoolean353 = false;
    }
  }

}
