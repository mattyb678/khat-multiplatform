package sample

actual class Sample {
    actual fun checkMe() = 1999
}

actual object Platform {
    actual val name = "JS"
}