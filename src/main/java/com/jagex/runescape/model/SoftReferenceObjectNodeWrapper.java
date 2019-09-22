package com.jagex.runescape.model;

import com.jagex.runescape.node.AbstractObjectNode;
import com.jagex.runescape.node.AbstractObjectNodeWrapper;
import com.jagex.runescape.node.SoftReferenceObjectNode;

public final class SoftReferenceObjectNodeWrapper extends
    AbstractObjectNodeWrapper {

  public AbstractObjectNode wrap(AbstractObjectNode var1) {
    return new SoftReferenceObjectNode(var1.getObject(true));
  }
}
