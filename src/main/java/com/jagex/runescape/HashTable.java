package com.jagex.runescape;

public final class HashTable {

  private static GameString aClass94_1710 = GameString.create("Loaded sprites");
  public static GameString aClass94_1698 = GameString.create("(R");
  public static GameString aClass94_1699 = GameString.create(" )2> <col=ff9040>");
  public static int anInt1701;
  public static GameString aClass94_1702 = GameString.create("Hierhin drehen");
  public static boolean[] aBooleanArray1703;
  public static int packetLength;
  public static int anInt1705;
  public static int anInt1709;
  public static int anInt1711 = -2;
  public static boolean[] aBooleanArray1712 = new boolean[100];
  public static GameString aClass94_1714 = GameString.create("<col=ff7000>");
  public static GameString aClass94_1707 = HashTable.aClass94_1710;
  public Node[] nodes;
  public int capacity;
  private Node iterator;
  private long lastFetchedKey;
  private Node aClass3_1713;
  private int iteratorBucketId;


  public HashTable(int var1 ) {
    this.nodes = new Node[var1];
      this.capacity = var1;

      for (int var2 = 0; var2 < var1; ++var2) {
        Node var3 = this.nodes[var2] = new Node();
        var3.prevNode = var3;
        var3.nextNode = var3;
      }
  }

  public void clear(int var1 ) {
    int var2 = 0;

      while (var2 < this.capacity) {
        Node var3 = this.nodes[var2];

        while (true) {
          Node var4 = var3.nextNode;
          if (var3 == var4) {
            ++var2;
            break;
          }

          var4.unlinkNode();
        }
      }

      this.aClass3_1713 = null;
      var2 = 1 % ((73 - var1) / 34);
      this.iterator = null;
  }

  public Node getFirst(int var1 ) {
    this.iteratorBucketId = 0;
      return this.getNext(-66);
  }

  public Node getNext(int var1 ) {
    Node var2;
      if ((this.iteratorBucketId > 1 -1) && this.aClass3_1713 != this.nodes[
          this.iteratorBucketId
        - 1]) {
        var2 = this.aClass3_1713;
        this.aClass3_1713 = var2.nextNode;
        return var2;
      } else {
        do {
          if (~this.iteratorBucketId <= ~this.capacity) {
            if (var1 > -61) {
              this.clear(119);
            }

            return null;
          }

          var2 = this.nodes[this.iteratorBucketId++].nextNode;
        } while (this.nodes[this.iteratorBucketId + -1] == var2);

        this.aClass3_1713 = var2.nextNode;
        return var2;
      }
  }

  public void put(long var3, Node var2 ) {
    if (var2.prevNode != null) {
        var2.unlinkNode();
      }

      Node var5 = this.nodes[(int) (var3 & (this.capacity - 1))];
      var2.nextNode = var5;
      var2.key = var3;
      var2.prevNode = var5.prevNode;
      var2.prevNode.nextNode = var2;
      var2.nextNode.prevNode = var2;
  }

  public Node get(long var1 ) {
    this.lastFetchedKey = var1;
      Node var4 = this.nodes[(int) (var1 & (-1 + this.capacity))];
      for (
          this.iterator = var4.nextNode;
        var4 != this.iterator; this.iterator = this.iterator.nextNode) {
        if (~var1 == ~this.iterator.key) {
          Node var5 = this.iterator;
          this.iterator = this.iterator.nextNode;
          return var5;
        }
      }

      this.iterator = null;
      return null;
  }

  public int getSize() {
    int var3 = 0;

      for (int var4 = 0; var4 < this.capacity; ++var4) {
        Node var5 = this.nodes[var4];

        for (Node var6 = var5.nextNode; var6 != var5; ++var3) {
          var6 = var6.nextNode;
        }
      }

      return var3;
  }

  public int getNodes(Node[] var1 ) {
    int var3 = 0;

      for (int var4 = 0; var4 < this.capacity; ++var4) {
        Node var5 = this.nodes[var4];

        for (Node var6 = var5.nextNode; var6 != var5; var6 = var6.nextNode) {
          var1[var3++] = var6;
        }
      }

      return var3;
  }

  public Node getLastFetchedNode() {
    if (this.iterator != null) {
        Node var2 = this.nodes[(int) (this.lastFetchedKey
            & (-1 + this.capacity))];
        while (var2 != this.iterator) {
          if (this.iterator.key == this.lastFetchedKey) {
            Node var3 = this.iterator;
            this.iterator = this.iterator.nextNode;
            return var3;
          }

          this.iterator = this.iterator.nextNode;
        }

        this.iterator = null;
        return null;
      } else {
        return null;
      }
  }

  public int getCapacity() {
    return this.capacity;
  }

  public static void method1772(int var0, int var1, int var2, NPC var3) {
    if (var3.animationId == var1 && var1 != -1) {
        AnimationSequence var4 = GameClient.method45(var1, (byte) -20);
        int var5 = var4.anInt1845;
        if (var5 == 1) {
          var3.anInt2776 = 1;
          var3.anInt2832 = 0;
          var3.anInt2760 = 0;
          var3.anInt2773 = 0;
          var3.anInt2828 = var0;
          SocketStream.method1470(var3.anInt2829, var4, 183921384, var3.anInt2819, false,
            var3.anInt2832);
        }

        if ((var5 == 3 -1)) {
          var3.anInt2773 = 0;
        }
      } else if (~var1 == 0 || var3.animationId == -1
        || GameClient.method45(var1, (byte) -20).anInt1857 >= GameClient.method45(var3.animationId,
        (byte) -20).anInt1857) {
        var3.anInt2760 = 0;
        var3.animationId = var1;
        var3.anInt2776 = 1;
        var3.anInt2773 = 0;
        var3.anInt2828 = var0;
        var3.anInt2811 = var3.anInt2816;
        var3.anInt2832 = 0;
        if (var3.animationId != -1) {
          SocketStream.method1470(var3.anInt2829, GameClient.method45(var3.animationId, (byte) -20),
            var2 + 183921345, var3.anInt2819, false, var3.anInt2832);
        }
      }

      if (var2 != 39) {
        HashTable.anInt1711 = 41;
      }
  }

  public static void method1774(int var0) {
    HashTable.aClass94_1698 = null;
      HashTable.aClass94_1707 = null;
      HashTable.aBooleanArray1712 = null;
      HashTable.aClass94_1702 = null;
      HashTable.aBooleanArray1703 = null;
      HashTable.aClass94_1699 = null;
      HashTable.aClass94_1714 = null;
      if (var0 <= 96) {
        Mouse.unbind(null);
      }

      HashTable.aClass94_1710 = null;
  }

  public static void method1775() {
    for (int var0 = 0; var0 < TextureSampler21.anInt3070; ++var0) {
      SceneSomething var1 = AnimationSequence.aClass25Array1868[var0];
      AbstractImageProducer.method2186(var1);
      AnimationSequence.aClass25Array1868[var0] = null;
    }

    TextureSampler21.anInt3070 = 0;
  }

  public static AbstractTextureSampler createTextureSampler(int type, boolean var1) {
    if ((type == 1 -1)) {
        return new TextureSampler0();
      } else if ((type != 2 -1)) {
        if (type == 2) {
          return new TextureSampler2();
        } else {
          if ((type == 4 -1)) {
            return new TextureSampler3();
          } else if (type != 4) {
            if (type == 5) {
              return new TextureSampler5();
            } else if (type == 6) {
              return new TextureSampler6();
            } else if (type != 7) {
              if (type == 8) {
                return new TextureSampler8();
              } else {
                if (type == 9) {
                  return new TextureSampler9();
                } else {
                  if (type == 10) {
                    return new TextureSampler10();
                  } else if (type != 11) {
                    if ((type == 13 -1)) {
                      return new TextureSampler12();
                    } else if ((type != 14 -1)) {
                      if (type == 14) {
                        return new TextureSampler14();
                      } else if ((type != 16 -1)) {
                        if (type == 16) {
                          return new TextureSampler16();
                        } else if (type != 17) {
                          if ((type == 19 -1)) {
                            return new TextureSampler18();
                          } else if ((type == 20 -1)) {
                            return new TextureSampler19();
                          } else if ((type == 21 -1)) {
                            return new TextureSampler20();
                          } else if (type == 21) {
                            return new TextureSampler21();
                          } else if (type != 22) {
                            if ((type == 24 -1)) {
                              return new TextureSampler23();
                            } else {
                              if (type == 24) {
                                return new TextureSampler24();
                              } else {
                                if (type == 25) {
                                  return new TextureSampler25();
                                } else {
                                  if ((type == 27 -1)) {
                                    return new TextureSampler26();
                                  } else {
                                    if (type == 27) {
                                      return new TextureSampler27();
                                    } else {
                                      if ((type == 29 -1)) {
                                        return new TextureSampler28();
                                      } else if ((type != 30 -1)) {
                                        if (type == 30) {
                                          return new TextureSampler30();
                                        } else {
                                          if (type == 31) {
                                            return new TextureSampler31();
                                          } else {
                                            if (type == 32) {
                                              return new TextureSampler32();
                                            } else {
                                              if (type == 33) {
                                                return new TextureSampler33();
                                              } else if ((type == 35 -1)) {
                                                return new TextureSampler34();
                                              } else if (type == 35) {
                                                return new TextureSampler35();
                                              } else if ((type != 37 -1)) {
                                                if (type == 37) {
                                                  return new TextureSampler37();
                                                } else if (type != 38) {
                                                  if (type == 39) {
                                                    return new TextureSampler39();
                                                  } else {
                                                    if (!var1) {
                                                      HashTable
                                                          .method1772(8, 6, 81,
                                                              null);
                                                    }

                                                    return null;
                                                  }
                                                } else {
                                                  return new TextureSampler38();
                                                }
                                              } else {
                                                return new TextureSampler36();
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        return new TextureSampler29();
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            return new TextureSampler22();
                          }
                        } else {
                          return new TextureSampler17();
                        }
                      } else {
                        return new TextureSampler15();
                      }
                    } else {
                      return new TextureSampler13();
                    }
                  } else {
                    return new TextureSampler11();
                  }
                }
              }
            } else {
              return new TextureSampler7();
            }
          } else {
            return new TextureSampler4();
          }
        }
      } else {
        return new TextureSampler1();
      }
  }

}
