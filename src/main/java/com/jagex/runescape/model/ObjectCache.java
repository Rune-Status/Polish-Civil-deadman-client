package com.jagex.runescape.model;

import com.jagex.runescape.common.HashTable;
import com.jagex.runescape.node.AbstractObjectNode;
import com.jagex.runescape.node.ObjectNode;
import com.jagex.runescape.opengl.Texture;
import com.jagex.runescape.statics.DummyClass38;

public final class ObjectCache {

  private int anInt1327;
  private final Queue aClass13_1329 = new Queue();
  private int anInt1331;
  private HashTable table;

  public ObjectCache(int var1) {
    this.anInt1331 = var1;

    int var2;
    for (var2 = 1; var2 + var2 < var1; var2 += var2) {
    }

    this.anInt1327 = var1;
    this.table = new HashTable(var2);
  }

  public void get(byte var1, Object var2, long var3) {
    this.method1518(var3, (byte) -124);
    if (var1 > -72) {
      this.table = null;
    }

    if (this.anInt1327 == 0) {
      AbstractObjectNode var5 = (AbstractObjectNode) this.aClass13_1329.poll();
      assert var5 != null;
      var5.unlinkNode();
      var5.unlinkSubNode();
    } else {
      --this.anInt1327;
    }

    ObjectNode var7 = new ObjectNode(var2);
    this.table.put(var3, var7);
    this.aClass13_1329.addLast(var7);
    var7.subnodeKey = 0L;
  }

  public void method1518(long var1, byte var3) {
    AbstractObjectNode var4 = (AbstractObjectNode) this.table.get(var1);
    if (var3 == -124) {
      if (var4 != null) {
        var4.unlinkNode();
        var4.unlinkSubNode();
        ++this.anInt1327;
      }

    }
  }

  public int method1520(int var1) {
    if (var1 == -12623) {
      int var2 = 0;

      for (AbstractObjectNode var3 = (AbstractObjectNode) this.aClass13_1329
          .getFirst();
          var3 != null;
          var3 = (AbstractObjectNode) this.aClass13_1329.getNext()) {
        if (!var3.method568(-22358)) {
          ++var2;
        }
      }

      return var2;
    } else {
      return -85;
    }
  }

  public void method1522(int var1, int var2) {
    if (Texture.aClass118_3794 != null) {
      for (AbstractObjectNode var3 = (AbstractObjectNode) this.aClass13_1329
          .getFirst();
          var3 != null;
          var3 = (AbstractObjectNode) this.aClass13_1329.getNext()) {
        if (!var3.method568(-22358)) {
          if (++var3.subnodeKey > var2) {
            AbstractObjectNode var4 = Texture.aClass118_3794.wrap(var3);
            this.table.put(var3.key, var4);
            DummyClass38.method1084(var3, var4, (byte) 121);
            var3.unlinkNode();
            var3.unlinkSubNode();
          }
        } else if (var3.getObject(true) == null) {
          var3.unlinkNode();
          var3.unlinkSubNode();
          ++this.anInt1327;
        }
      }
    }

    if (var1 > -124) {
      this.method1518(24L, (byte) -18);
    }
  }

  public void method1523() {
    for (AbstractObjectNode var2 = (AbstractObjectNode) this.aClass13_1329
        .getFirst();
        var2 != null;
        var2 = (AbstractObjectNode) this.aClass13_1329.getNext()) {
      if (var2.method568(-22358)) {
        var2.unlinkNode();
        var2.unlinkSubNode();
        ++this.anInt1327;
      }
    }
  }

  public void method1524(int var1) {
    if (var1 == 3) {
      this.aClass13_1329.clear();
      this.table.clear(114);
      this.anInt1327 = this.anInt1331;
    }
  }

  public Object get(long var1) {
    AbstractObjectNode var4 = (AbstractObjectNode) this.table.get(var1);
    if (var4 == null) {
      return null;
    } else {
      Object var5 = var4.getObject(true);
      if (var5 != null) {
        if (var4.method568(-22358)) {
          ObjectNode var6 = new ObjectNode(var5);
          this.table.put(var4.key, var6);
          this.aClass13_1329.addLast(var6);
          var6.subnodeKey = 0L;
          var4.unlinkNode();
          var4.unlinkSubNode();
        } else {
          this.aClass13_1329.addLast(var4);
          var4.subnodeKey = 0L;
        }

        return var5;
      } else {
        var4.unlinkNode();
        var4.unlinkSubNode();
        ++this.anInt1327;
        return null;
      }
    }
  }

}
