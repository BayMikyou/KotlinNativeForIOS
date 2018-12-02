//
//  ViewController.kt
//  KotlinNativeOC
//
//  Created by Mikyou on 2018/12/2.
//  Copyright © 2018 mikyou. All rights reserved.
//

import kotlinx.cinterop.*
import platform.CoreLocation.CLLocationCoordinate2DMake
import platform.Foundation.*
import platform.UIKit.*
import platform.MapKit.*

@ExportObjCClass
class ViewController : UIViewController, MKMapViewDelegateProtocol {

    constructor(aDecoder: NSCoder) : super(aDecoder)
    override fun initWithCoder(aDecoder: NSCoder) = initBy(ViewController(aDecoder))

    @ObjCOutlet
    lateinit var label: UILabel

    @ObjCOutlet
    lateinit var textField: UITextField

    @ObjCOutlet
    lateinit var button: UIButton

    @ObjCOutlet
    lateinit var pb: UIActivityIndicatorView

    @ObjCOutlet
    lateinit var mapView: MKMapView

    @ObjCAction
    fun buttonPressed() {
        label.text = "Konan says: 'Hello, ${textField.text}!'"
    }

    override fun viewDidLoad() {
        super.viewDidLoad()

        pb.startAnimating()
        val center = CLLocationCoordinate2DMake(32.07, 118.78)
        val span = MKCoordinateSpanMake(0.7, 0.7)
        val region = MKCoordinateRegionMake(center, span)

        with(mapView) {
            delegate = this@ViewController
            setRegion(region, true)
        }
    }
}
