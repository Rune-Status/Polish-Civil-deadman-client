package com.jagex.runescape.input;

import java.awt.Component;

public abstract class AbstractMouseWheel {

  public abstract int pollOffset();

  public abstract void unbind(Component var2);

  public abstract void bind(Component var1);

}
