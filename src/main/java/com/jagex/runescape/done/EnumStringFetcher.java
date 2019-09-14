package com.jagex.runescape.done;

import com.jagex.runescape.DummyClass35;
import com.jagex.runescape.Interface4;
import com.jagex.runescape.ItemConfig;
import com.jagex.runescape.TextureSampler36;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.done.ClientScriptEnum;

public final class EnumStringFetcher implements Interface4 {

  public GameString method20(int var1, int[] enums, int var3, long key) {
    if (var1 == 0) {
        ClientScriptEnum var6 = TextureSampler36.getEnum(enums[0], true);
        return var6.getString((int) key, (byte) 120);
      } else {
        if (var1 != 1 && (var1 != 10)) {
          return var1 != 6 && var1 != 7 && var1 != 11 ?
              (var3 != 4936 ? null : null) :
              TextureSampler36.getEnum(enums[0], true)
                  .getString((int) key, (byte) -69);
        } else {
          ItemConfig var8 = DummyClass35.getItemConfig((int) key, (byte) 82);
          return var8.aClass94_770;
        }
      }
  }

}
