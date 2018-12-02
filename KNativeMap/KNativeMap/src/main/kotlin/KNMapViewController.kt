//导入Kotlin以与Objective-C和一些Cocoa Touch框架互操作。
import kotlinx.cinterop.*
import platform.CoreLocation.CLLocationCoordinate2DMake
import platform.Foundation.*
import platform.MapKit.MKCoordinateRegionMake
import platform.MapKit.MKCoordinateSpanMake
import platform.MapKit.MKMapView
import platform.MapKit.MKMapViewDelegateProtocol
import platform.UIKit.*

@ExportObjCClass//注意: @ExportObjCClass注解有助于Kotlin创建一个在运行时可查找的类。
class KNMapViewController: UIViewController, MKMapViewDelegateProtocol {
    @ObjCOutlet //注意: @ObjCOutlet注解很重要，主要是将mMapView属性设置为outlet。这允许您将Main.storyboard中的MKMapview链接到此属性。
    lateinit var mMapView: MKMapView
    constructor(aDecoder: NSCoder) : super(aDecoder)
    override fun initWithCoder(aDecoder: NSCoder) = initBy(KNMapViewController(aDecoder))
    override fun viewDidLoad() {
        super.viewDidLoad()
        val center = CLLocationCoordinate2DMake(32.07, 118.78)
        val span = MKCoordinateSpanMake(0.7, 0.7)
        val region = MKCoordinateRegionMake(center, span)

        with(mMapView) {
            delegate = this@KNMapViewController
            setRegion(region, true)
        }
    }
}