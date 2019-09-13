java_binary(
    name = "client",
    srcs = glob([
        "com/jagex/runescape/*.java",
        "com/jagex/runescape/opengl/*.java",
        "com/jagex/runescape/opengl/shader/*.java",
    ]),
    args = [
        "3594",
        "live",
        "english",
        "game1",
        "95.160.142.230",
    ],
    jvm_flags = ["-Djogamp.debug"],
    main_class = "com.jagex.runescape.GameClient",
    deps = [":client_lib"],
)

java_import(
    name = "client_lib",
    jars = [
        "lib/client.jar",
        "lib/jogamp-fat.jar",
    ],
)
