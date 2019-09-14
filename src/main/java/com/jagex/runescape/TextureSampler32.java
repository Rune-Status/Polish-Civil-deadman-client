package com.jagex.runescape;

import com.jagex.runescape.opengl.SomethingGl0;

public final class TextureSampler32 extends AbstractTextureSampler {

  public static GameString aClass94_3345 = GameString.create("glissement:");
  public static SomethingGl0[][] aClass3_Sub11ArrayArray3346;
  public static short[] aShortArray3349 =
      {(short) -10304, (short) 9104, (short) -1, (short) -1, (short) -1};
  public static int anInt3351;
  public static FileUnpacker textures;
  public static GameString walkTooltip;
  public static GameString aClass94_3355 = GameString.create("Angreifen");
  private int anInt3347 = 3216;
  private final int[] anIntArray3348 = new int[3];
  private int anInt3350 = 4096;
  private int anInt3354 = 3216;


  public TextureSampler32() {
    super(1, true);
  }

  public int[] method154(int var1, byte var2 ) {
    int var3 = -79 % ((var2 - 30) / 36);
      int[] var4 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        int var8 = DummyClass53.anInt1343 * this.anInt3350 >> 12;
        int[] var9 = this
            .method152(0, TriChromaticImageBuffer.anInt2487 & var1 + -1, 32755);
        int[] var10 = this.method152(0, var1, 32755);
        int[] var11 = this
            .method152(0, 1 + var1 & TriChromaticImageBuffer.anInt2487, 32755);

        for (int var12 = 0; SomethingLight0.anInt1559 > var12; ++var12) {
          int var14 = (var10[RenderAnimation.anInt396 & -1 + var12] - var10[1 + var12
            & RenderAnimation.anInt396]) * var8 >> 12;
          int var13 = var8 * (-var9[var12] + var11[var12]) >> 12;
          int var15 = var14 >> 4;
          if (var15 < 0) {
            var15 = -var15;
          }

          if (var15 > 255) {
            var15 = 255;
          }

          int var16 = var13 >> 4;
          if (~var16 > -1) {
            var16 = -var16;
          }

          if (var16 > 255) {
            var16 = 255;
          }

          int var17 =
            TriChromaticImageCache.aByteArray1364[(var16 * (var16 - -1) >> 1) + var15] & 255;
          int var6 = var13 * var17 >> 8;
          int var5 = var17 * var14 >> 8;
          var6 = var6 * this.anIntArray3348[1] >> 12;
          var5 = this.anIntArray3348[0] * var5 >> 12;
          int var7 = 4096 * var17 >> 8;
          var7 = var7 * this.anIntArray3348[2] >> 12;
          var4[var12] = var7 + var6 + var5;
        }
      }

      return var4;
  }

  public void parseConfig(int var1, Buffer var2, boolean var3 ) {
    if (var1 == 0) {
        this.anInt3350 = var2.readUnsignedShort();
      } else if (var1 != 1) {
        if (~var1 == -3) {
          this.anInt3354 = var2.readUnsignedShort();
        }
      } else {
        this.anInt3347 = var2.readUnsignedShort();
      }

      if (!var3) {
        TextureSampler32.updateProjectiles();
      }
  }

  public void method158(int var1 ) {
    if (var1 == 16251) {
        this.method303((byte) 59);
      }
  }

  private void method303(byte var1) {
    double var2 = Math.cos(this.anInt3354 / 4096.0F);
      this.anIntArray3348[0] =
        (int) (4096.0D * var2 * Math.sin(this.anInt3347 / 4096.0F));
      if (var1 >= 46) {
        this.anIntArray3348[1] =
          (int) (Math.cos(this.anInt3347 / 4096.0F) * var2 * 4096.0D);
        this.anIntArray3348[2] =
          (int) (4096.0D * Math.sin(this.anInt3354 / 4096.0F));
        int var6 = this.anIntArray3348[2] * this.anIntArray3348[2] >> 12;
        int var5 = this.anIntArray3348[1] * this.anIntArray3348[1] >> 12;
        int var4 = this.anIntArray3348[0] * this.anIntArray3348[0] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt(var4 - (-var5 - var6) >> 12));
        if (~var7 != -1) {
          this.anIntArray3348[2] = (this.anIntArray3348[2] << 12) / var7;
          this.anIntArray3348[0] = (this.anIntArray3348[0] << 12) / var7;
          this.anIntArray3348[1] = (this.anIntArray3348[1] << 12) / var7;
        }

      }
  }

  public static void method300(int var0) {
    TextureSampler32.walkTooltip = null;
      if (var0 <= 6) {
        TextureSampler32.aClass94_3345 = null;
      }

      TextureSampler32.aShortArray3349 = null;
      TextureSampler32.aClass3_Sub11ArrayArray3346 = null;
      TextureSampler32.aClass94_3355 = null;
      TextureSampler32.aClass94_3345 = null;
      TextureSampler32.textures = null;
  }

  public static int method301(byte var0) {
    int var1 = -47 / ((45 - var0) / 57);
      return TextureSampler29.anInt3398;
  }

  public static void updateProjectiles() {
    for (ProjectileNode node = (ProjectileNode) TextureSampler13.projectiles.getFirst();
           node != null; node = (ProjectileNode) TextureSampler13.projectiles.getNext()) {
        Projectile projectile = node.projectile;
        if (~GameWorldSomething.currentPlane == ~projectile.anInt2907
          && ~projectile.anInt2899 <= ~AbstractGameWorld.updateCycle) {
          if (AbstractGameWorld.updateCycle >= projectile.anInt2925) {
            if ((projectile.targetId > 1 -1)) {
              NPC var3 = TextureSampler5.npcs[-1 + projectile.targetId];
              if (var3 != null && var3.anInt2819 >= 0 && var3.anInt2819 < 13312
                && var3.anInt2829 >= 0 && ~var3.anInt2829 > -13313) {
                projectile.method2024(var3.anInt2829, 1, AbstractGameWorld.updateCycle,
                  BufferData.method1736(projectile.anInt2907, 1, var3.anInt2819, var3.anInt2829)
                    + -projectile.anInt2903, var3.anInt2819);
              }
            }

            if (projectile.targetId < 0) {
              int var4 = -1 + -projectile.targetId;
              Player player;
              if (WidgetAccess.localPlayerId == var4) {
                player = TextureCache.localPlayer;
              } else {
                player = TextureSampler0.players[var4];
              }

              if (player != null && player.anInt2819 >= 0 && ~player.anInt2819 > -13313
                && player.anInt2829 >= 0 && ~player.anInt2829 > -13313) {
                projectile.method2024(player.anInt2829, 1, AbstractGameWorld.updateCycle,
                  BufferData.method1736(projectile.anInt2907, 1, player.anInt2819, player.anInt2829)
                    - projectile.anInt2903, player.anInt2819);
              }
            }

            projectile.update(DisplayMode.loopCycle);
            DummyClass29.addNodeToSceneGraph(GameWorldSomething.currentPlane,
              (int) projectile.aDouble2920, (int) projectile.aDouble2900,
              (int) projectile.aDouble2914, 60, projectile, projectile.anInt2924, -1L, false);
          }
        } else {
          node.unlinkNode();
        }
      }
  }

}
