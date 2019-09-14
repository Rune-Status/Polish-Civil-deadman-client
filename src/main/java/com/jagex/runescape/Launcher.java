package com.jagex.runescape;

import com.jagex.runescape.common.GameStringStatics;
import java.nio.charset.StandardCharsets;

public class Launcher {

  public static void main(String[] args) {
    try {
      if (args.length != 5) {
        TextureSampler18.printUsage("argument count");
      }
      GameException.serverHost = args[4];
      int languageId = -1;
      GameObjectConfig.portOffset = Integer.parseInt(args[0]);
      AbstractGameWorld.usageLocation = 2;
      if (args[1].equals("live")) {
        TextureSampler20.usageMode = 0;
      } else {
        if (args[1].equals("rc")) {
          TextureSampler20.usageMode = 1;
        } else if (!args[1].equals("wip")) {
          TextureSampler18.printUsage("modewhat");
        } else {
          TextureSampler20.usageMode = 2;
        }
      }

      ProjectileNode.aBoolean3779 = false;

      try {
        byte[] language = args[2].getBytes(StandardCharsets.ISO_8859_1);
        languageId = TextureSampler15.getLanguageForTag(
            GameStringStatics.createString(language, 0, language.length));
      } catch (Exception ex) {
      }

      if (languageId == -1) {
        if (args[2].equals("english")) {
          TriChromaticImageBuffer.languageId = 0;
        } else {
          if (args[2].equals("german")) {
            TriChromaticImageBuffer.languageId = 1;
          } else {
            TextureSampler18.printUsage("language");
          }
        }
      } else {
        TriChromaticImageBuffer.languageId = languageId;
      }

      GlobalStatics_0.setupLanguagePacket(TriChromaticImageBuffer.languageId);
      DummyClass8.aBoolean4018 = false;
      Structure.aBoolean3641 = false;
      if (args[3].equals("game0")) {
        AbstractImageProducer.gameId = 0;
      } else {
        if (args[3].equals("game1")) {
          AbstractImageProducer.gameId = 1;
        } else {
          TextureSampler18.printUsage("game");
        }
      }

      SomethingPacket151.anInt2607 = 0;
      DisplayMode.aBoolean1451 = false;
      MonoChromaticImageBuffer.affiliateId = 0;
      DummyClass7.settings = GroundItemNode.EMPTY_STRING;
      GameClient client = new GameClient();
      SomethingTilek.client = client;
      client
          .start(530, 1024, 768, 32 + TextureSampler20.usageMode, "runescape",
              28, false);
      TextureSampler27.FRAME.setLocation(40, 40);
    } catch (Exception var4) {
      GZipDecompressor.reportError(null, var4, (byte) 119);
    }
  }
}
