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
    ],
    jvm_flags = ["-Djogamp.debug"],
    main_class = "com.jagex.runescape.GameClient",
    deps = [":client_lib"],
)

java_import(
    name = "client_lib",
    jars = [
        "lib/client.jar",
        "lib/jogl-all.jar",
        "lib/gluegen-rt.jar",
        "lib/gluegen-rt-natives-linux-amd64.jar",
        "lib/jogl-all-noawt-natives-linux-amd64.jar",
        "lib/newt.jar",
        "lib/newt-event.jar",
        "lib/newt-ogl.jar",
        "lib/newt-awt.jar",
        "lib/newt-natives-linux-amd64.jar",
        "lib/newt-natives-windows-amd64.jar",
        "lib/newt-natives-macosx-universal.jar",
    ],
)
