//
//  main.kt
//  KotlinNativeOC
//
//  Created by Mikyou on 2018/12/2.
//  Copyright © 2018 mikyou. All rights reserved.
//

import kotlinx.cinterop.autoreleasepool
import kotlinx.cinterop.cstr
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.toCValues
import platform.Foundation.NSStringFromClass
import platform.UIKit.UIApplicationMain

fun main(args: Array<String>) {
    memScoped {
        val argc = args.size + 1
        val argv = (arrayOf("konan") + args).map { it.cstr.getPointer(memScope) }.toCValues()

        autoreleasepool {
            UIApplicationMain(argc, argv, null, NSStringFromClass(AppDelegate))//注意: 在这里设置对应启动的AppDelegate
        }
    }
}
