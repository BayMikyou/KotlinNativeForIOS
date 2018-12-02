//
//  AppDelegate.kt
//  KNativeMap
//
//  Created by Mikyou on 2018/12/2.
//  Copyright © 2018 mikyou. All rights reserved.
//

import kotlinx.cinterop.*
import platform.UIKit.*

class AppDelegate : UIResponder(), UIApplicationDelegateProtocol {
    companion object : UIResponderMeta(), UIApplicationDelegateProtocolMeta {}

    override fun init() = initBy(AppDelegate())

    private var _window: UIWindow? = null
    override fun window() = _window
    override fun setWindow(window: UIWindow?) { _window = window }
}
