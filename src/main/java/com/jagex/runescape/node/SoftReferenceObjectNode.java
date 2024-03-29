package com.jagex.runescape.node;

import java.lang.ref.SoftReference;

public final class SoftReferenceObjectNode extends AbstractObjectNode {

  private final SoftReference reference;

  public SoftReferenceObjectNode(Object var1) {
    this.reference = new SoftReference(var1);
  }

  public Object getObject(boolean var1) {
    return this.reference.get();
  }

  public boolean method568(int var1) {
    return true;
  }
}
