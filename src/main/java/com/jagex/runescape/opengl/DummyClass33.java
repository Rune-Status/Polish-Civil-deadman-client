package com.jagex.runescape.opengl;

import com.jagex.runescape.node.Deque;
import com.jagex.runescape.IntegerNode;
import com.jagex.runescape.Time;

public final class DummyClass33 {

  private static Deque aClass61_581 = new Deque();
  private static long aLong583;
  private static Deque aClass61_586 = new Deque();
  private static Deque aClass61_587 = new Deque();
  private static Deque aClass61_588 = new Deque();
  private static int[] anIntArray589 = new int[1000];
  public static int textureMemory;
  public static int anInt582;
  public static int texture2dMemory;
  public static int anInt585;

  public static synchronized void method985(int var0, int var1, int var2) {
    if (var2 == DummyClass33.anInt582) {
      IntegerNode var3 = new IntegerNode(var1);
      var3.key = var0;
      DummyClass33.aClass61_587.addLast(var3);
    }
  }

  public static synchronized void method986(int var0, int var1) {
    if (var1 == DummyClass33.anInt582) {
      IntegerNode var2 = new IntegerNode();
      var2.key = var0;
      DummyClass33.aClass61_588.addLast(var2);
    }
  }

  public static void method987() {
    DummyClass33.aClass61_581 = null;
    DummyClass33.aClass61_586 = null;
    DummyClass33.aClass61_587 = null;
    DummyClass33.aClass61_588 = null;
    DummyClass33.anIntArray589 = null;
  }

  public static synchronized void method988() {
    ++DummyClass33.anInt582;
    DummyClass33.aClass61_581.clear(-110);
    DummyClass33.aClass61_586.clear(-88);
    DummyClass33.aClass61_587.clear(-123);
    DummyClass33.aClass61_588.clear(-115);
    DummyClass33.anInt585 = 0;
    DummyClass33.texture2dMemory = 0;
    DummyClass33.textureMemory = 0;
  }

  public static synchronized void method989(int var0, int var1, int var2) {
    if (var2 == DummyClass33.anInt582) {
      IntegerNode var3 = new IntegerNode(var1);
      var3.key = var0;
      DummyClass33.aClass61_581.addLast(var3);
    }
  }

  public static synchronized void clearGlResources() {
    int var1 = 0;

    while (true) {
      IntegerNode var2 = (IntegerNode) DummyClass33.aClass61_581.method1220((byte) -3);
      if (var2 == null) {
        if (var1 > 0) {
          GlRenderer.GL.glDeleteBuffers(var1, DummyClass33.anIntArray589, 0);
          var1 = 0;
        }

        while (true) {
          var2 = (IntegerNode) DummyClass33.aClass61_586.method1220((byte) -3);
          if (var2 == null) {
            while (true) {
              var2 = (IntegerNode) DummyClass33.aClass61_587.method1220((byte) -3);
              if (var2 == null) {
                if (var1 > 0) {
                  GlRenderer.GL
                      .glDeleteTextures(var1, DummyClass33.anIntArray589, 0);
                  boolean var4 = false;
                }

                while (true) {
                  var2 = (IntegerNode) DummyClass33.aClass61_588.method1220((byte) -3);
                  if (var2 == null) {
                    if (DummyClass33.anInt585 + DummyClass33.texture2dMemory + DummyClass33.textureMemory
                        > 100663296
                      && Time.getCurrentTimeMillis() > DummyClass33.aLong583 + 60000L) {
                      System.gc();
                      DummyClass33.aLong583 = Time.getCurrentTimeMillis();
                    }

                    return;
                  }

                  int var3 = (int) var2.key;
                  GlRenderer.GL.glDeleteLists(var3, 1);
                }
              }

              DummyClass33.anIntArray589[var1++] = (int) var2.key;
              DummyClass33.textureMemory -= var2.anInt2467;
              if (var1 == 1000) {
                GlRenderer.GL
                    .glDeleteTextures(1000, DummyClass33.anIntArray589, 0);
                var1 = 0;
              }
            }
          }

          DummyClass33.anIntArray589[var1++] = (int) var2.key;
          DummyClass33.texture2dMemory -= var2.anInt2467;
          if (var1 == 1000) {
            GlRenderer.GL.glDeleteTextures(1000, DummyClass33.anIntArray589, 0);
            var1 = 0;
          }
        }
      }

      DummyClass33.anIntArray589[var1++] = (int) var2.key;
      DummyClass33.anInt585 -= var2.anInt2467;
      if (var1 == 1000) {
        GlRenderer.GL.glDeleteBuffers(1000, DummyClass33.anIntArray589, 0);
        var1 = 0;
      }
    }
  }

  public static synchronized void method991(int var0, int var1, int var2) {
    if (var2 == DummyClass33.anInt582) {
      IntegerNode var3 = new IntegerNode(var1);
      var3.key = var0;
      DummyClass33.aClass61_586.addLast(var3);
    }
  }

}
