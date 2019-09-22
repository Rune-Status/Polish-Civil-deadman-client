package com.jagex.runescape.model;

import com.jagex.runescape.common.ThreadUtilities;
import com.jagex.runescape.statics.GlobalStatics_0;
import com.jagex.runescape.statics.GlobalStatics_9;

public final class MouseRecorder implements Runnable {

  public boolean aBoolean1015 = true;
  public Object anObject1016 = new Object();
  public int anInt1018;
  public int[] anIntArray1019 = new int[500];
  public int[] anIntArray1020 = new int[500];

  public void run() {
    for (; this.aBoolean1015; ThreadUtilities.sleep(50L)) {
        Object var1 = this.anObject1016;
        synchronized (var1) {
          if (this.anInt1018 < 500) {
            this.anIntArray1020[this.anInt1018] = GlobalStatics_9.anInt1676;
            this.anIntArray1019[this.anInt1018] = GlobalStatics_0.anInt1709;
            ++this.anInt1018;
          }
        }
      }
  }

}
