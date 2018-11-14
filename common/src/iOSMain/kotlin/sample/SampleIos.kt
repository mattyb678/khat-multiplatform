package sample

import platform.UIKit.UIDevice

actual class Sample {
    actual  fun checkMe() = 13
}

actual object Platform {
    actual val name = UIDevice.currentDevice.name + " iOS"
}