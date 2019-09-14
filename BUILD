package(default_visibility = ["//visibility:public"])

java_binary(
    name = "launcher",
    args = [
        "3594",
        "live",
        "english",
        "game1",
        "95.160.142.230",
    ],
    jvm_flags = ["-Djogamp.debug"],
    main_class = "com.jagex.runescape.Launcher",
    runtime_deps = [
        "//src/main/java/com/jagex/runescape",
    ],
)
