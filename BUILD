package(default_visibility = ["//visibility:public"])

java_binary(
    name = "launcher",
    srcs = ["//src/main/java/com/jagex/runescape/launcher:Launcher.java"],
    args = [
        "3594",
        "live",
        "english",
        "game1",
        "95.160.142.230",
    ],
    jvm_flags = ["-Djogamp.debug"],
    main_class = "com.jagex.runescape.launcher.Launcher",
    deps = ["//src/main/java/com/jagex/runescape"],
)
