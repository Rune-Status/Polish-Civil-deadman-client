package com.jagex.runescape.model;

import com.jagex.runescape.model.AudioWorker;
import com.jagex.runescape.sound.audio.AudioStreamEncoder;

public class AbstractAudioOutputStreamStatics {

  public static AudioWorker aClass15_2613;

  public static void method1591(AudioStreamEncoder encoder) {
    if (encoder.aClass3_Sub12_2544 != null) {
      encoder.aClass3_Sub12_2544.anInt2374 = 0;
    }

    encoder.aBoolean2545 = false;

    for (AudioStreamEncoder var2 = encoder.method411(); var2 != null;
        var2 = encoder.method414()) {
      method1591(var2);
    }
  }
}
