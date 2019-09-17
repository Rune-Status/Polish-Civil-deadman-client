package com.jagex.runescape.model;

import com.jagex.runescape.common.HashTable;
import com.jagex.runescape.node.Node;

public final class HashTableIterator {

  private Node iterator;
  private int anInt1132;
  private final HashTable table;


  public HashTableIterator(HashTable var1 ) {
    this.table = var1;
  }

  public Node getNext() {
    Node var2;
      if (this.anInt1132 > 0
          && this.table.nodes[this.anInt1132 - 1] != this.iterator) {
        var2 = this.iterator;
        this.iterator = var2.nextNode;
        return var2;
      } else {
        do {
          if (this.table.capacity <= this.anInt1132) {
            return null;
          }

          var2 = this.table.nodes[this.anInt1132++].nextNode;
        } while (var2 == this.table.nodes[-1 + this.anInt1132]);

        this.iterator = var2.nextNode;
        return var2;
      }
  }

  public Node getFirst() {
    this.anInt1132 = 0;
      return this.getNext();
  }

}
