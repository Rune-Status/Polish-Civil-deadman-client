package com.jagex.runescape.model;

import java.awt.Component;

public abstract class AbstractMouseWheel {

  public abstract int pollOffset();

  public abstract void unbind(boolean var1, Component var2);

  public abstract void bind(Component var1, int var2);

}
