package(default_visibility = ["//visibility:public"])

java_library(
    name = "runescape",
    srcs = glob([
        "*.java",
        "opengl/**/*.java",
        "buffer/*.java",
    ]),
    deps = [
        "//lib:client.jar",
        "//lib:jogamp-fat.jar",
        "//src/main/java/com/jagex/runescape/common",
        "//src/main/java/com/jagex/runescape/huffman",
        "//src/main/java/com/jagex/runescape/node",
        "//src/main/java/com/jagex/runescape/sprite",
    ],
)
