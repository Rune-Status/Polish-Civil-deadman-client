package com.jagex.runescape.model;

import com.jagex.runescape.model.AbstractAudioOutputStream;
import com.jagex.runescape.sound.audio.AudioStatics;
import com.jagex.runescape.sound.audio.AudioStreamEncoder3Statics;
import java.awt.Component;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.SourceDataLine;

public final class BufferedAudioOutputStream extends AbstractAudioOutputStream {

  private int bufferSize;
  private SourceDataLine sourceDataLine;
  private boolean soundMax;
  private AudioFormat audioFormat;
  private byte[] buffer;

  public void write() {
    Synthesizer synthesizer = null;
    try {
      synthesizer = MidiSystem.getSynthesizer();
    } catch (MidiUnavailableException e) {
      e.printStackTrace();
    }
    synthesizer.getLatency();
    int sampleLen = 256;
    if (AudioStatics.STEREO) {
      sampleLen <<= 1;
    }
    for (int i = 0; i < sampleLen; ++i) {
      int sample = this.samples[i];
      if ((sample + 0x800000 & 0xff000000) != 0) {
        sample = 0x7fffff ^ sample >> 31;
      }

      this.buffer[i * 2] = (byte) (sample >> 8);
      this.buffer[i * 2 + 1] = (byte) (sample >> 16);
    }

    this.sourceDataLine.write(this.buffer, 0, sampleLen << 1);
  }

  public void setBufferSize(int bufferSize)
      throws LineUnavailableException {
    javax.sound.sampled.DataLine.Info var2 =
        new javax.sound.sampled.DataLine.Info(SourceDataLine.class,
            this.audioFormat,
            bufferSize << (AudioStatics.STEREO ? 2 : 1));
    this.sourceDataLine = (SourceDataLine) AudioSystem.getLine(var2);
    this.sourceDataLine.open();
    this.sourceDataLine.start();
    this.bufferSize = bufferSize;
  }

  public void flush() throws LineUnavailableException {
    this.sourceDataLine.flush();
    if (this.soundMax) {
      this.sourceDataLine.close();
      this.sourceDataLine = null;
      javax.sound.sampled.DataLine.Info var1 =
          new javax.sound.sampled.DataLine.Info(SourceDataLine.class,
              this.audioFormat,
              this.bufferSize << (AudioStatics.STEREO ? 2 : 1));
      this.sourceDataLine = (SourceDataLine) AudioSystem.getLine(var1);
      this.sourceDataLine.open();
      this.sourceDataLine.start();
    }

  }

  public int getAmountBufferedSamples() {
    return this.bufferSize - (this.sourceDataLine.available() >> (
        AudioStatics.STEREO ? 2 : 1));
  }

  public void close() {
    if (this.sourceDataLine != null) {
      this.sourceDataLine.close();
      this.sourceDataLine = null;
    }
  }

  public void bind(Component var1) {
    Mixer.Info[] var2 = AudioSystem.getMixerInfo();
    if (var2 != null) {
      Mixer.Info[] var3 = var2;

      for (Mixer.Info var5 : var3) {
        if (var5 != null) {
          String var6 = var5.getName();
          if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
            this.soundMax = true;
          }
        }
      }
    }

    this.audioFormat =
        new AudioFormat(AudioStreamEncoder3Statics.sampleRate, 16,
            AudioStatics.STEREO ? 2 : 1, true, false);
    this.buffer = new byte[256 << (AudioStatics.STEREO ? 2 : 1)];
  }
}
