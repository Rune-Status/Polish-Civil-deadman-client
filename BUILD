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
    ],
)

java_binary(
    name = "launcher-hotswap",
    args = [
        "3594",
        "live",
        "english",
        "game1",
        "127.0.0.1",
    ],
    # ... How to make it good
    jvm_flags = ["-javaagent:lib/hotswap/hotswap-agent-1.3.1-SNAPSHOT.jar"],
    main_class = "com.jagex.runescape.launcher.Launcher",
    resources = [":hotswap-agent.properties"],
    runtime_deps = [
        ":hotswap-agent",
        "//src/main/java/com/jagex/runescape/common",
        "//src/main/java/com/jagex/runescape/launcher",
    ],
)

java_import(
    name = "hotswap-agent",
    jars = ["//lib/hotswap:hotswap-agent-1.3.1-SNAPSHOT.jar"],
)
