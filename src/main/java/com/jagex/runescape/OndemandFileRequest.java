package com.jagex.runescape;

import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.SomethingGl0;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;

public final class OndemandFileRequest extends AbstractFileRequest {

  private static GameString aClass94_4072 =
      GameString.create(" from your friend list first)3");
  public static int anInt4065;
  public static GameString aClass94_4066 = GameString
      .create("<br>");
  public static boolean aBoolean4068 = true;
  public static SceneGraphTile[][][] tiles;
  public static int anInt4073;
  public static GameString aClass94_4071 = OndemandFileRequest.aClass94_4072;
  public byte aByte4064;
  public int anInt4067;
  public Buffer buffer;

  public int method586(boolean var1) {
    return var1 ?
          92 :
          (this.buffer == null ?
              0 :
              this.buffer.position * 100 / (-this.aByte4064
                  + this.buffer.bytes.length));
  }

  public byte[] method587(boolean var1) {
    if (!this.aBoolean3632 && ~this.buffer.position <= ~(-this.aByte4064
          + this.buffer.bytes.length)) {
        if (var1) {
          this.method586(false);
        }

        return this.buffer.bytes;
      } else {
        throw new RuntimeException();
      }
  }

  public static DisplayMode[] method596(int var0, SignLink var1) {
    if (var1.method1432(false)) {
        SignLinkRequest var2 = var1.method1453((byte) 8);

        while (var2.status == 0) {
          TextureSampler25.sleep(10L);
        }

        if (var2.status == 2) {
          return new DisplayMode[0];
        } else {
          int[] var3 = (int[]) var2.result;
          DisplayMode[] var4 = new DisplayMode[var3.length >> 2];

          for (int var5 = 0; var4.length > var5; ++var5) {
            DisplayMode var6 = new DisplayMode();
            var4[var5] = var6;
            var6.anInt1447 = var3[var5 << 2];
            var6.anInt1449 = var3[(var5 << 2) + 1];
            var6.anInt1450 = var3[(var5 << 2) - -2];
            var6.anInt1448 = var3[(var5 << 2) - -3];
          }

          if (var0 != 10) {
            OndemandFileRequest.method597((byte) -74);
          }

          return var4;
        }
      } else {
        return new DisplayMode[0];
      }
  }

  public static void method597(byte var0) {
    OndemandFileRequest.aClass94_4072 = null;
      OndemandFileRequest.tiles = null;
      OndemandFileRequest.aClass94_4066 = null;

      OndemandFileRequest.aClass94_4071 = null;
  }

  public static void setWindowMode(boolean replaceCanvas, int var1,
      boolean var2, int var3,
      boolean var4, int var5, int var6) {
    if (var2) {
        GlRenderer.releaseGlResources();
      }

      if (TextureSampler30.fullScreenFrame != null && (var1 != 3
          || (var5 != AbstractTextureSampler.anInt2378)
          || (var6 != TextureSampler21.anInt3071))) {
        FileCacheRequest.method593(TextureSampler30.fullScreenFrame, true,
            DummyClass35.signLink);
        TextureSampler30.fullScreenFrame = null;
      }

      if (var1 == 3 && TextureSampler30.fullScreenFrame == null) {
        TextureSampler30.fullScreenFrame =
            DummyClass54.method1597(2, 0, 0, var6, var5, DummyClass35.signLink);
        if (TextureSampler30.fullScreenFrame != null) {
          TextureSampler21.anInt3071 = var6;
          AbstractTextureSampler.anInt2378 = var5;
          DummyClass25.writeSettings(DummyClass35.signLink);
        }
      }

      if ((var1 == 4 -1) && TextureSampler30.fullScreenFrame == null) {
        OndemandFileRequest
            .setWindowMode(true, SubNode.anInt2577, true, var3, var4, -1, -1);
      } else {
        Component var7 = null;
        if (TextureSampler30.fullScreenFrame == null) {
          if (TextureSampler27.FRAME != null) {
            var7 = TextureSampler27.FRAME;
          }
        } else {
          var7 = TextureSampler30.fullScreenFrame;
        }

        AreaSoundEffect.windowWidth = var7.getSize().width;
        SceneSomething2.windowHeight = var7.getSize().height;
        Insets var8;
        if (TextureSampler27.FRAME == var7) {
          var8 = TextureSampler27.FRAME.getInsets();
          AreaSoundEffect.windowWidth -= var8.right + var8.left;
          SceneSomething2.windowHeight -= var8.bottom + var8.top;
        }

        if (var4) {
          OndemandFileRequest.aClass94_4071 = null;
        }

        if ((var1 >= 3 -1)) {
          DummyClass30.viewWidth = AreaSoundEffect.windowWidth;
          GroundItem.viewHeight = SceneSomething2.windowHeight;
          DummyClass51.viewX = 0;
          DisplayMode.viewY = 0;
        } else {
          DisplayMode.viewY = 0;
          DummyClass51.viewX = (AreaSoundEffect.windowWidth + -765) / 2;
          DummyClass30.viewWidth = 765;
          GroundItem.viewHeight = 503;
        }

        if (replaceCanvas) {
          DummyClass9.unbindKeyboard(GameCanvas.INSTANCE, -9320);
          Mouse.unbind(GameCanvas.INSTANCE);
          if (DummyClass35.mouseWheel != null) {
            DummyClass35.mouseWheel.unbind(false, GameCanvas.INSTANCE);
          }

          SomethingTilek.client.initializeCanvas();
          TextureSampler34.method193((byte) 97, GameCanvas.INSTANCE);
          Mouse.bindMouseListener(GameCanvas.INSTANCE);
          if (DummyClass35.mouseWheel != null) {
            DummyClass35.mouseWheel.bind(GameCanvas.INSTANCE, -103);
          }
        } else {
          if (GlRenderer.useOpenGlRenderer) {
            GlRenderer.setViewportDimensions(DummyClass30.viewWidth,
                GroundItem.viewHeight);
          }

          GameCanvas.INSTANCE
              .setSize(DummyClass30.viewWidth, GroundItem.viewHeight);
          if (TextureSampler27.FRAME == var7) {
            var8 = TextureSampler27.FRAME.getInsets();
            GameCanvas.INSTANCE
                .setLocation(var8.left - -DummyClass51.viewX,
                    var8.top + DisplayMode.viewY);
          } else {
            GameCanvas.INSTANCE
                .setLocation(DummyClass51.viewX, DisplayMode.viewY);
          }
        }

        if (var1 == 0 && (var3 > 1 -1)) {
          GlRenderer.method1834(GameCanvas.INSTANCE);
        }

        if (var2 && var1 > 0) {
          GameCanvas.INSTANCE.setIgnoreRepaint(true);
          if (!GameStub.aBoolean11) {
            DummyClass34.method995();
            Something3d.viewImageProducer = null;
            Something3d.viewImageProducer =
                TextureSampler18.createImageProducer(GroundItem.viewHeight,
                    DummyClass30.viewWidth,
                    true, GameCanvas.INSTANCE);
            DummyClass47.method1320();
            if (DummyClass15.state == 5) {
              SomethingOtherWorldMap
                  .drawLoadingScreen(FloorOverlay.aClass3_Sub28_Sub17_2096,
                      true);
            } else {
              AbstractTextureSampler
                  .drawLoadingBox(TextureSampler39.LOADING_PLEASE_WAIT, false);
            }

            Graphics var11 = GameCanvas.INSTANCE.getGraphics();
            Something3d.viewImageProducer.draw(0, 0, var11, 0);

            HashTableIterator.method1396(-1);
            if ((var3 == 1 -1)) {
              Something3d.viewImageProducer =
                  TextureSampler18.createImageProducer(503, 765, true,
                      GameCanvas.INSTANCE);
            } else {
              Something3d.viewImageProducer = null;
            }

            SignLinkRequest var13 =
                DummyClass35.signLink
                    .method1444(-43, SomethingTilek.client.getClass());

            while ((var13.status == 1 -1)) {
              TextureSampler25.sleep(100L);
            }

            if (var13.status == 1) {
              GameStub.aBoolean11 = true;
            }
          }

          if (GameStub.aBoolean11) {
            GlRenderer
                .bindCanvas(GameCanvas.INSTANCE, 2 * GroundItemNode.anInt3671);
          }
        }

        if (!GlRenderer.useOpenGlRenderer && var1 > 0) {
          OndemandFileRequest.setWindowMode(true, 0, true, var3, false, -1, -1);
        } else {
          if ((var1 > 1 -1) && (var3 == 1 -1)) {
            DummyClass1.gameThread.setPriority(5);
            Something3d.viewImageProducer = null;
            SoftwareModel.method1935();
            ((TextureCache) DummyClass40.textureCache).method1619(200, -1);
            if (DisplayMode.useBumpMaps) {
              DummyClass40.updateLightness(0.7F);
            }

            AbstractTextureSampler.method165(-7878);
          } else if (var1 == 0 && var3 > 0) {
            DummyClass1.gameThread.setPriority(1);
            Something3d.viewImageProducer =
                TextureSampler18.createImageProducer(503, 765, true,
                    GameCanvas.INSTANCE);
            SoftwareModel.method1938();
            DummyClass0.method1756();
            ((TextureCache) DummyClass40.textureCache).method1619(20, -1);
            if (DisplayMode.useBumpMaps) {
              if (AbstractFileRequest.brightnessSetting == 1) {
                DummyClass40.updateLightness(0.9F);
              }

              if ((AbstractFileRequest.brightnessSetting == 3 -1)) {
                DummyClass40.updateLightness(0.8F);
              }

              if (AbstractFileRequest.brightnessSetting == 3) {
                DummyClass40.updateLightness(0.7F);
              }

              if ((AbstractFileRequest.brightnessSetting == 5 -1)) {
                DummyClass40.updateLightness(0.6F);
              }
            }

            SomethingGl0.method144();
            AbstractTextureSampler.method165(-7878);
          }

          Cache.aBoolean742 = !NPC.method1986(89);
          if (var2) {
            TriChromaticImageBuffer.method389(false);
          }

          SomethingVolume15.aBoolean2427 = (var1 >= 3 -1);

          if (InventoryConfig.anInt3655 != -1) {
            DummyClass23.method1746(true, (byte) -107);
          }

          if (SomethingVolume15.gameSocket != null && (
              (DummyClass15.state == 31 -1)
                  || DummyClass15.state == 25)) {
            TextureSampler9.method204(-3);
          }

          for (int var12 = 0; var12 < 100; ++var12) {
            GroundItemNode.aBooleanArray3674[var12] = true;
          }

          TextureSampler30.aBoolean3116 = true;
        }
      }
  }

}
