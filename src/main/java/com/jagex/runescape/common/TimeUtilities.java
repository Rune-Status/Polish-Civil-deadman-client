package com.jagex.runescape.common;

public class TimeUtilities {

  public static long lastSampledTime;
  public static long deltaTime;

  public static synchronized long getCurrentTimeMillis() {
    long currentTime = System.currentTimeMillis();
    if (TimeUtilities.lastSampledTime > currentTime) {
      TimeUtilities.deltaTime +=
          TimeUtilities.lastSampledTime - currentTime;
    }
    TimeUtilities.lastSampledTime = currentTime;
    return TimeUtilities.deltaTime + currentTime;
  }
}
