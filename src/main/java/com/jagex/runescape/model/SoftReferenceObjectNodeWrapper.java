package com.jagex.runescape.model;

import com.jagex.runescape.node.AbstractObjectNode;

public final class SoftReferenceObjectNodeWrapper extends AbstractObjectNodeWrapper {

  public AbstractObjectNode wrap(AbstractObjectNode var1) {
    return new SoftReferenceObjectNode(var1.getObject(true));
  }
}
