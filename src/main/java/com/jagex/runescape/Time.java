package com.jagex.runescape;

public final class Time {
  private static long deltaTime;
  private static long lastSampledTime;

  public static synchronized long getCurrentTimeMillis() {
    long currentTime = System.currentTimeMillis();
    if (Time.lastSampledTime > currentTime) {
      Time.deltaTime += Time.lastSampledTime - currentTime;
    }
    Time.lastSampledTime = currentTime;
    return Time.deltaTime + currentTime;
  }
}
