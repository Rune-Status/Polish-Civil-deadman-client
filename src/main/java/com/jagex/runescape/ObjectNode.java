package com.jagex.runescape;

import com.jagex.runescape.node.AbstractObjectNode;

public final class ObjectNode extends AbstractObjectNode {

  private final Object anObject4044;

  public ObjectNode(Object var1) {
    this.anObject4044 = var1;
  }

  public Object getObject(boolean var1) {
    return !var1 ? null : this.anObject4044;
  }

  public boolean method568(int var1) {
    return var1 != -22358;
  }

}
