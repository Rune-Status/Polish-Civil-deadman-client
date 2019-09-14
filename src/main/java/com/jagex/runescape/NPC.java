package com.jagex.runescape;

import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.Texture;
import java.util.Objects;

public final class NPC extends Mobile {

  private static GameString aClass94_3978 = GameString.create("Dec");
  private static GameString aClass94_3980 = GameString.create("Jul");
  private static GameString aClass94_3982 = GameString.create("May");
  private static GameString aClass94_3983 = GameString.create("Nov");
  private static GameString aClass94_3984 = GameString.create("Mar");
  private static GameString aClass94_3987 = GameString.create("flash3:");
  private static GameString aClass94_3989 = GameString.create("Jan");
  private static GameString aClass94_3990 = GameString.create("Feb");
  private static GameString aClass94_3996 = GameString.create("Aug");
  private static GameString aClass94_3999 = GameString.create("Apr");
  private static GameString aClass94_4000 = GameString.create("Jun");
  private static GameString aClass94_4003 = GameString.create("Sep");
  private static GameString aClass94_4004 = GameString.create("Oct");
  public static boolean aBoolean3975;
  public static AbstractDirectColorSprite[] aClass3_Sub28_Sub16Array3977;
  public static float aFloat3979;
  public static int[] anIntArray3986 = new int[32];
  public static GameString aClass94_3991 = GameString.create("ondulation:");
  public static GameString aClass94_3992 = GameString.create("loginscreen");
  public static FileUnpacker fileUnpacker17;
  public static FileUnpacker fileUnpacker15;
  public static int anInt3995;
  public static int[] anIntArray3997 = {19, 55, 38, 155, 255, 110, 137, 205, 76};
  public static GameString aClass94_3998 = GameString.create(":trade:");
  public static int runesFileId;
  public static int anInt4002;
  public static GameString aClass94_3988 = NPC.aClass94_3987;
  public static GameString aClass94_3981 = NPC.aClass94_3987;
  public static GameString[] aClass94Array3985 = {
      NPC.aClass94_3989, NPC.aClass94_3990, NPC.aClass94_3984, NPC.aClass94_3999,
      NPC.aClass94_3982,
      NPC.aClass94_4000,
      NPC.aClass94_3980, NPC.aClass94_3996, NPC.aClass94_4003, NPC.aClass94_4004,
      NPC.aClass94_3983,
      NPC.aClass94_3978
  };
  public NpcConfiguration config;

  protected void finalize() {
  }

  public void method1867(int var1, int var2, int var3, int var4, int var5 ) {
    try {
    } catch (RuntimeException var7) {
      throw AbstractGameWorld.cascadeException(var7,
        "km.IB(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
    }
  }

  public void draw(int var1, int var2, int var3, int var4, int var5, int var6,
      int var7,
      int var8,
      long var9,
      int var11,
      DummyClass0 var12 ) {
    if (this.config != null) {
        AnimationSequence var13 = (this.animationId != -1)
            && (this.anInt2828 == 0) ?
          GameClient.method45(this.animationId, (byte) -20) :
          null;
        AnimationSequence var14 =
            this.anInt2764 != -1 && ((this.anInt2764 != Objects
              .requireNonNull(this.getRenderAnimationId(false)).anInt368)
            || var13 == null) ? GameClient.method45(this.anInt2764, (byte) -20) : null;
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
          if (Projectile.aBoolean2910 && var16.aBoolean1249) {
            var17 = GameObject.method1957(this.config.aByte1287,
                this.aBoolean2810,
                var14 == null ? var13 : var14, this.anInt2819, this.config.aShort1256,
                this.anInt2829,
                this.config.aShort1286, this.config.size, var15, var1,
                var14 != null ? this.anInt2813 : this.anInt2832, this.anInt2831,
                this.config.aByte1275, (byte) -49);
            if (GlRenderer.useOpenGlRenderer) {
              float var18 = GlRenderer.method1852();
              float var19 = GlRenderer.method1839();
              GlRenderer.method1851();
              GlRenderer.method1825(var18, -150.0f + var19);
              assert var17 != null;
              var17.draw(0, var2, var3, var4, var5, var6, var7, var8, -1L, var11,
                  this.aClass127_Sub1_2801);
              GlRenderer.method1830();
              GlRenderer.method1825(var18, var19);
            } else {
              assert var17 != null;
              var17.draw(0, var2, var3, var4, var5, var6, var7, var8, -1L, var11,
                  this.aClass127_Sub1_2801);
            }
          }

          this.method1971(var15, (byte) -111);
          this.method1969((byte) 115, var15, var1);
          var17 = null;
          if ((this.anInt2842 != -1) && this.anInt2805 != -1) {
            SpotAnimationConfig var21 = RenderAnimation.method898((byte) 42,
                this.anInt2842);
            var17 = var21.method966(this.anInt2826, (byte) -30, this.anInt2805,
                this.anInt2761);
            if (var17 != null) {
              var17.method1897(0, -this.anInt2799, 0);
              if (var21.aBoolean536) {
                if ((TextureSampler15.anInt3198 != 0)) {
                  var17.method1896(TextureSampler15.anInt3198);
                }

                if ((Parameter.anInt3623 != 0)) {
                  var17.method1886(Parameter.anInt3623);
                }

                if (TextureSampler16.anInt3111 != 0) {
                  var17.method1897(0, TextureSampler16.anInt3111, 0);
                }
              }
            }
          }

          if (GlRenderer.useOpenGlRenderer) {
            if ((this.config.size == 1)) {
              var15.aBoolean2699 = true;
            }

            var15.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9,
                var11,
                this.aClass127_Sub1_2801);
            if (var17 != null) {
              if ((this.config.size == 1)) {
                var17.aBoolean2699 = true;
              }

              var17.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9,
                  var11,
                  this.aClass127_Sub1_2801);
            }
          } else {
            if (var17 != null) {
              var15 = ((SoftwareModel) var15).method1943(var17);
            }

            if (this.config.size == 1) {
              var15.aBoolean2699 = true;
            }

            var15.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9,
                var11,
                this.aClass127_Sub1_2801);
          }

        }
      }
  }

  public int getMinimumY() {
    return this.anInt2820;
  }

  public boolean hasConfiguration(byte var1 ) {
    if (var1 != 17) {
        NPC.method1984(-101, -40, 63);
      }

      return this.config != null;
  }

  public int getRenderAnimationId() {
    if (AbstractImageProducer.gameId != 0 && this.config.anIntArray1292 != null) {
        NpcConfiguration var2 = this.config.method1471((byte) 21);
        if (var2 != null && (var2.renderAnimationId != -1)) {
          return var2.renderAnimationId;
        }
      }

      return this.renderAnimationId;
  }

  public void setConfiguration(int var1, NpcConfiguration var2 ) {
    this.config = var2;
      if (var1 == -1) {
        if (this.aClass127_Sub1_2801 != null) {
          this.aClass127_Sub1_2801.method1759();
        }

      }
  }

  public static void method1983(int var0) {
    NPC.anIntArray3986 = null;
      NPC.aClass94_3984 = null;
      NPC.aClass94_3983 = null;
      NPC.aClass94_3989 = null;
      if (var0 == -3) {
        NPC.fileUnpacker15 = null;
        NPC.anIntArray3997 = null;
        NPC.aClass94_4004 = null;
        NPC.aClass94_3991 = null;
        NPC.aClass94_3998 = null;
        NPC.aClass94_3999 = null;
        NPC.aClass3_Sub28_Sub16Array3977 = null;
        NPC.aClass94_3978 = null;
        NPC.aClass94_3992 = null;
        NPC.aClass94_3990 = null;
        NPC.aClass94_3996 = null;
        NPC.aClass94_3981 = null;
        NPC.fileUnpacker17 = null;
        NPC.aClass94_3987 = null;
        NPC.aClass94Array3985 = null;
        NPC.aClass94_3982 = null;
        NPC.aClass94_3988 = null;
        NPC.aClass94_3980 = null;
        NPC.aClass94_4003 = null;
        NPC.aClass94_4000 = null;
      }
  }

  public static int method1984(int var0, int var1, int var2) {
    if (var1 == 38) {
        int var3 = 57 * var2 + var0;
        var3 ^= var3 << 13;
        int var4 = Integer.MAX_VALUE
            & 1376312589 + (var3 * var3 * 15731 - -789221) * var3;
        return (var4 & 133802063) >> 19;
      } else {
        return 88;
      }
  }

  public static byte[] method1985(int var0, Object var1, boolean var2) {
    if (var1 == null) {
        return null;
      } else if (var1 instanceof byte[]) {
        byte[] var5 = (byte[]) var1;
        return var2 ? SomethingSceneJ.method873((byte) 62, var5) : var5;
      } else {
        if (var0 > -118) {
          NPC.method1983(19);
        }

        if (var1 instanceof BufferObject) {
          BufferObject var3 = (BufferObject) var1;
          return var3.get(26);
        } else {
          throw new IllegalArgumentException();
        }
      }
  }

  public static boolean method1986(int var0) {
    if (var0 <= 22) {
        NPC.method1984(-48, 88, 31);
      }

      return GlRenderer.useOpenGlRenderer || ClientScriptEnum.aBoolean3665;
  }

  public static boolean method1988(boolean var0) {
    if (var0) {
        NPC.aClass94_3980 = null;
      }

      try {
        if ((SomethingQuickChatK.anInt154 == 2)) {
          if (MidiSomething.aClass3_Sub27_1154 == null) {
            MidiSomething.aClass3_Sub27_1154 =
              MidiFile.method517(DummyClass55.aClass153_1423, TextureSampler8.anInt3463,
                DummyClass22.anInt1741);
            if (MidiSomething.aClass3_Sub27_1154 == null) {
              return false;
            }
          }

          if (SomethingQuickChat.aClass83_3579 == null) {
            SomethingQuickChat.aClass83_3579 =
              new MidiSomething(DummyClass59.soundEffects, Texture.midiInstruments);
          }

          if (DummyClass55.aClass3_Sub24_Sub4_1421.method470(MidiSomething.aClass3_Sub27_1154, -122,
            DummyClass23.aClass153_1661, SomethingQuickChat.aClass83_3579, 22050)) {
            DummyClass55.aClass3_Sub24_Sub4_1421.method471((byte) 53);
            DummyClass55.aClass3_Sub24_Sub4_1421.method506(128, TextureSampler36.anInt3423);
            DummyClass55.aClass3_Sub24_Sub4_1421.method490(AreaSoundEffect.aBoolean2311,
              MidiSomething.aClass3_Sub27_1154, 17774);
            SomethingQuickChatK.anInt154 = 0;
            MidiSomething.aClass3_Sub27_1154 = null;
            SomethingQuickChat.aClass83_3579 = null;
            DummyClass55.aClass153_1423 = null;
            return true;
          }
        }
      } catch (Exception var2) {
        var2.printStackTrace();
        DummyClass55.aClass3_Sub24_Sub4_1421.method505((byte) -128);
        DummyClass55.aClass153_1423 = null;
        MidiSomething.aClass3_Sub27_1154 = null;
        SomethingQuickChatK.anInt154 = 0;
        SomethingQuickChat.aClass83_3579 = null;
      }

      return false;
  }

}
