package com.jagex.runescape.launcher;

import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.model.GameClient;
import com.jagex.runescape.statics.DummyClass7;
import com.jagex.runescape.statics.DummyClass8;
import com.jagex.runescape.statics.GlobalStatics_0;
import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_4;
import com.jagex.runescape.statics.GlobalStatics_5;
import com.jagex.runescape.statics.GlobalStatics_7;
import com.jagex.runescape.statics.GlobalStatics_8;
import com.jagex.runescape.statics.GlobalStatics_9;
import java.nio.charset.StandardCharsets;

public class Launcher {

  public static void main(String[] args) {
    try {
      if (args.length != 5) {
        GlobalStatics_10.printUsage("argument count");
      }
      GlobalStatics_8.serverHost = args[4];
      int languageId = -1;
      GlobalStatics_8.portOffset = Integer.parseInt(args[0]);
      GlobalStatics_4.usageLocation = 2;
      if (args[1].equals("live")) {
        GlobalStatics_10.usageMode = 0;
      } else {
        if (args[1].equals("rc")) {
          GlobalStatics_10.usageMode = 1;
        } else if (!args[1].equals("wip")) {
          GlobalStatics_10.printUsage("modewhat");
        } else {
          GlobalStatics_10.usageMode = 2;
        }
      }
      GlobalStatics_9.aBoolean3779 = false;

      try {
        byte[] language = args[2].getBytes(StandardCharsets.ISO_8859_1);
        languageId = GlobalStatics_10.getLanguageForTag(
            GameStringStatics.createString(language, 0, language.length));
      } catch (Exception ex) {
      }

      if (languageId == -1) {
        if (args[2].equals("english")) {
          GlobalStatics_10.languageId = 0;
        } else {
          if (args[2].equals("german")) {
            GlobalStatics_10.languageId = 1;
          } else {
            GlobalStatics_10.printUsage("language");
          }
        }
      } else {
        GlobalStatics_10.languageId = languageId;
      }

      GlobalStatics_0.setupLanguagePacket(GlobalStatics_10.languageId);
      DummyClass8.aBoolean4018 = false;
      GlobalStatics_9.aBoolean3641 = false;
      if (args[3].equals("game0")) {
        GlobalStatics_5.gameId = 0;
      } else {
        if (args[3].equals("game1")) {
          GlobalStatics_5.gameId = 1;
        } else {
          GlobalStatics_10.printUsage("game");
        }
      }

      GlobalStatics_9.anInt2607 = 0;
      GlobalStatics_7.aBoolean1451 = false;
      GlobalStatics_9.affiliateId = 0;
      DummyClass7.settings = GlobalStatics_9.EMPTY_STRING;
      GameClient client = new GameClient();
      GlobalStatics_9.client = client;
      client
          .start(530, 1024, 768, 32 + GlobalStatics_10.usageMode, "runescape",
              28, false);
      GlobalStatics_10.FRAME.setLocation(40, 40);
    } catch (Exception var4) {
      GlobalStatics_9.reportError(null, var4, (byte) 119);
    }
  }
}
