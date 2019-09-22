package(default_visibility = ["//visibility:public"])

java_library(
    name = "runescape",
    srcs = glob([
        "*.java",
        "model/*.java",
        "statics/*.java",
        "settings/*.java",
        "opengl/**/*.java",
    ]),
    deps = [
        "//lib:client.jar",
        "//lib:jogamp-fat.jar",
        "//src/main/java/com/jagex/runescape/buffer",
        "//src/main/java/com/jagex/runescape/input",
        "//src/main/java/com/jagex/runescape/cache",
        "//src/main/java/com/jagex/runescape/common",
        "//src/main/java/com/jagex/runescape/compression",
        "//src/main/java/com/jagex/runescape/camera",
        "//src/main/java/com/jagex/runescape/node",
        "//src/main/java/com/jagex/runescape/scene",
        "//src/main/java/com/jagex/runescape/sound",
        "//src/main/java/com/jagex/runescape/sprite",
    ],
)
