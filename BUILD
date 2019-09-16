package(default_visibility = ["//visibility:public"])

java_binary(
    name = "launcher",
    args = [
        "3594",
        "live",
        "english",
        "game1",
        "127.0.0.1",
    ],
    jvm_flags = ["-Djogamp.debug"],
    main_class = "com.jagex.runescape.launcher.Launcher",
    runtime_deps = [
        "//src/main/java/com/jagex/runescape/common",
        "//src/main/java/com/jagex/runescape/launcher",
    ],
)
