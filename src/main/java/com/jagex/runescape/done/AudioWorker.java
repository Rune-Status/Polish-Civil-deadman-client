package com.jagex.runescape.done;

import com.jagex.runescape.GZipDecompressor;
import com.jagex.runescape.SignLink;
import com.jagex.runescape.TextureSampler25;
import com.jagex.runescape.done.AbstractAudioOutputStream;

public final class AudioWorker implements Runnable {

  public volatile boolean aBoolean345;
  public SignLink aClass87_350;
  public volatile AbstractAudioOutputStream[] aClass155Array352 = new AbstractAudioOutputStream[2];
  public volatile boolean aBoolean353;

  public void run() {
    this.aBoolean353 = true;

      try {
        while (!this.aBoolean345) {
          for (int var1 = 0; (var1 < 2); ++var1) {
            AbstractAudioOutputStream var2 = this.aClass155Array352[var1];
            if (var2 != null) {
              var2.process((byte) -34);
            }
          }

          TextureSampler25.sleep(10L);
        }
      } catch (Exception var7) {
        GZipDecompressor.reportError(null, var7, (byte) 111);
      } finally {
        this.aBoolean353 = false;
      }
  }

}
