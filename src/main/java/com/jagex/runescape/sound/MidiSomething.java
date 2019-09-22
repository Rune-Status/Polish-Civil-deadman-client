package com.jagex.runescape.sound;

import com.jagex.runescape.common.HashTable;
import com.jagex.runescape.cache.FileUnpacker;

public final class MidiSomething {

  private final FileUnpacker soundEffects;
  private final HashTable aClass130_1155 = new HashTable(256);
  private final FileUnpacker midiInstruments;
  private HashTable aClass130_1159 = new HashTable(256);

  public MidiSomething(FileUnpacker var1, FileUnpacker var2) {
    this.soundEffects = var1;
    this.midiInstruments = var2;
  }

  private SomethingMusic0 method1412(int[] var1, int var2, int var3, int var4) {
    if (var2 == 31947) {
      int var5 = var4 ^ (var3 >>> 12 | var3 << 4 & 0xfff3);
      var5 |= var3 << 16;
      long var6 = var5;
      SomethingMusic0 var8 = (SomethingMusic0) this.aClass130_1159.get(var6);
      if (var8 != null) {
        return var8;
      } else if (var1 != null && var1[0] <= 0) {
        return null;
      } else {
        SoundEffect var9 = MidiSomethingStatics
            .method1811(this.soundEffects, var3, var4);
        if (var9 != null) {
          var8 = var9.method1812();
          this.aClass130_1159.put(var6, var8);
          if (var1 != null) {
            var1[0] -= var8.aByteArray3030.length;
          }

          return var8;
        } else {
          return null;
        }
      }
    } else {
      return null;
    }
  }

  public SomethingMusic0 method1413(int var1, int var2, int[] var3) {
    if (this.soundEffects.method2121(0) == 1) {
      return this.method1412(var3, 31947, 0, var1);
    } else {
      if (this.soundEffects.getAmountChildren(var1, (byte) 83) == 1) {
        return this.method1412(var3, 31947, var1, 0);
      } else {
        if (var2 < 0) {
          this.aClass130_1159 = null;
        }

        throw new RuntimeException();
      }
    }
  }

  private SomethingMusic0 method1415(int var1, int[] var2, int var3,
      byte var4) {
    int var5 = var3 ^ (var1 >>> 12 | 0xfff3 & var1 << 4);
    var5 |= var1 << 16;
    long var6 = var5 ^ 4294967296L;
    SomethingMusic0 var8 = (SomethingMusic0) this.aClass130_1159.get(var6);
    if (var8 != null) {
      return var8;
    } else if (var2 != null && var2[0] <= 0) {
      return null;
    } else {
      MidiInstrument var9 = (MidiInstrument) this.aClass130_1155.get(var6);
      if (var9 == null) {
        var9 = MidiSomethingStatics.method363(this.midiInstruments, var1, var3);
        if (var9 == null) {
          return null;
        }

        this.aClass130_1155.put(var6, var9);
      }

      var8 = var9.method359(var2);
      if (var8 == null) {
        return null;
      } else {
        var9.unlinkNode();
        this.aClass130_1159.put(var6, var8);
        if (var4 != 11) {
          this.method1413(64, -18, null);
        }

        return var8;
      }
    }
  }

  public SomethingMusic0 method1416(int var2, int[] var3) {
    if (this.midiInstruments.method2121(0) == 1) {
      return this.method1415(0, var3, var2, (byte) 11);
    } else if (this.midiInstruments.getAmountChildren(var2, (byte) 99) != 1) {
      throw new RuntimeException();
    } else {
      return this.method1415(var2, var3, 0, (byte) 11);
    }
  }

}
