package sample

actual class Sample {
    actual fun checkMe() = 1986
}

actual object Platform {
    actual val name: String = "JVM (Android)"
}