package(default_visibility = ["//visibility:public"])

java_library(
    name = "runescape",
    srcs = glob([
        "*.java",
        "model/*.java",
        "statics/*.java",
        "settings/*.java",
        "opengl/**/*.java",
        "math/**/*.java",
        "camera/**/*.java",
    ]),
    deps = [
        "//lib:client.jar",
        "//lib:jogamp-fat.jar",
        "//src/main/java/com/jagex/runescape/buffer",
        "//src/main/java/com/jagex/runescape/common",
        "//src/main/java/com/jagex/runescape/huffman",
        "//src/main/java/com/jagex/runescape/node",
        "//src/main/java/com/jagex/runescape/scene",
        "//src/main/java/com/jagex/runescape/sprite",
    ],
)
