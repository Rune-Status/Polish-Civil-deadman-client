package com.jagex.runescape.model;

import com.jagex.runescape.opengl.GlRenderer;

import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_4;
import com.jagex.runescape.statics.GlobalStatics_5;
import com.jagex.runescape.statics.GlobalStatics_8;
import com.jagex.runescape.statics.GlobalStatics_9;
import java.util.Objects;

public final class NPC extends Mobile {

  public NpcConfiguration config;

  protected void finalize() {
  }

  public void method1867(int var1, int var2, int var3, int var4, int var5 ) {
    try {
    } catch (RuntimeException var7) {
      throw GlobalStatics_4.cascadeException(var7,
        "km.IB(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
    }
  }

  public void draw(int var1, int var2, int var3, int var4, int var5, int var6,
      int var7,
      int var8,
      long var9,
      int var11) {
    if (this.config != null) {
        AnimationSequence var13 = this.animationId != -1
            && this.anInt2828 == 0 ?
          GlobalStatics_8.method45(this.animationId, (byte) -20) :
          null;
        AnimationSequence var14 =
            this.anInt2764 != -1 && (this.anInt2764 != Objects
              .requireNonNull(this.getRenderAnimationId(false)).anInt368
            || var13 == null) ? GlobalStatics_8.method45(this.anInt2764, (byte) -20) : null;
        AbstractModel var15 =
            this.config.method1476(this.aClass145Array2809, this.anInt2793, (byte) -116,
                this.anInt2813, this.anInt2776, this.anInt2760, this.anInt2832, var14,
                this.anInt2802,
            var13);
        if (var15 != null) {
          this.anInt2820 = var15.getMinimumY();
          NpcConfiguration var16 = this.config;
          if (var16.anIntArray1292 != null) {
            var16 = var16.method1471((byte) -110);
          }

          AbstractModel var17;
          assert var16 != null;
          if (GlobalStatics_9.aBoolean2910 && var16.aBoolean1249) {
            var17 = GlobalStatics_8.method1957(this.config.aByte1287,
                this.aBoolean2810,
                var14 == null ? var13 : var14, this.anInt2819, this.config.aShort1256,
                this.sceneY,
                this.config.aShort1286, this.config.size, var15, var1,
                var14 != null ? this.anInt2813 : this.anInt2832, this.anInt2831,
                this.config.aByte1275, (byte) -49);
            if (GlRenderer.USE_OPENGL) {
              float var18 = GlRenderer.method1852();
              float var19 = GlRenderer.method1839();
              GlRenderer.method1851();
              GlRenderer.method1825(var18, -150.0f + var19);
              assert var17 != null;
              var17.draw(0, var2, var3, var4, var5, var6, var7, var8, -1L, var11
              );
              GlRenderer.method1830();
              GlRenderer.method1825(var18, var19);
            } else {
              assert var17 != null;
              var17.draw(0, var2, var3, var4, var5, var6, var7, var8, -1L, var11
              );
            }
          }

          this.method1971(var15, (byte) -111);
          this.method1969((byte) 115, var15, var1);
          var17 = null;
          if (this.anInt2842 != -1 && this.anInt2805 != -1) {
            SpotAnimationConfig var21 = GlobalStatics_9.method898((byte) 42,
                this.anInt2842);
            var17 = var21.method966(this.anInt2826, (byte) -30, this.anInt2805,
                this.anInt2761);
            if (var17 != null) {
              var17.method1897(0, -this.anInt2799, 0);
              if (var21.aBoolean536) {
                if (GlobalStatics_10.anInt3198 != 0) {
                  var17.method1896(GlobalStatics_10.anInt3198);
                }

                if (GlobalStatics_9.anInt3623 != 0) {
                  var17.method1886(GlobalStatics_9.anInt3623);
                }

                if (GlobalStatics_10.anInt3111 != 0) {
                  var17.method1897(0, GlobalStatics_10.anInt3111, 0);
                }
              }
            }
          }

          if (GlRenderer.USE_OPENGL) {
            if (this.config.size == 1) {
              var15.aBoolean2699 = true;
            }

            var15.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9,
                var11
            );
            if (var17 != null) {
              if (this.config.size == 1) {
                var17.aBoolean2699 = true;
              }

              var17.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9,
                  var11
              );
            }
          } else {
            if (var17 != null) {
              var15 = ((SoftwareModel) var15).method1943(var17);
            }

            if (this.config.size == 1) {
              var15.aBoolean2699 = true;
            }

            var15.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9,
                var11
            );
          }

        }
      }
  }

  public int getMinimumY() {
    return this.anInt2820;
  }

  public boolean hasConfiguration(byte var1 ) {
    if (var1 != 17) {
        GlobalStatics_9.method1984(-101, -40, 63);
      }

      return this.config != null;
  }

  public int getRenderAnimationId() {
    if (GlobalStatics_5.gameId != 0 && this.config.anIntArray1292 != null) {
        NpcConfiguration var2 = this.config.method1471((byte) 21);
        if (var2 != null && var2.renderAnimationId != -1) {
          return var2.renderAnimationId;
        }
      }

      return this.renderAnimationId;
  }

  public void setConfiguration(int var1, NpcConfiguration var2 ) {
    this.config = var2;
  }

}
