//
//  AppDelegate.kt
//  KotlinNativeOC
//
//  Created by Mikyou on 2018/12/2.
//  Copyright © 2018 mikyou. All rights reserved.
//

import kotlinx.cinterop.initBy
import platform.Foundation.NSLog
import platform.UIKit.*

class AppDelegate : UIResponder(), UIApplicationDelegateProtocol {
    override fun init() = initBy(AppDelegate())
    private var _window: UIWindow? = null
    override fun window() = _window
    override fun setWindow(window: UIWindow?) { _window = window }
    override fun application(application: UIApplication, didFinishLaunchingWithOptions: Map<Any?, *>?): Boolean {//监听APP启动完成，打印Log
        NSLog("this is launch from kotlin appDelegate")
        return true
}
    companion object : UIResponderMeta(), UIApplicationDelegateProtocolMeta//注意:一定得有个companion object否则在main函数NSStringFromClass(AppDelegate)会报错
}
