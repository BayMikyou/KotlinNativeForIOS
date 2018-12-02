//
//  ViewController.swift
//  KotlinNativeDemo
//
//  Created by Mikyou on 2018/12/1.
//  Copyright © 2018 mikyou. All rights reserved.
//

import UIKit


class ViewController: UIViewController {

    override func viewDidLoad() {
    super.viewDidLoad()
        let label = UILabel(frame: CGRect(x: 0, y: 0, width: 300, height: 21))
        label.center = CGPoint(x: 160, y: 285)
        label.textAlignment = .center
        label.font = label.font.withSize(20)
        label.text = "Hello IOS, I'm from Kotlin/Native"
        view.addSubview(label)
    }


    override func didReceiveMemoryWarning() {
    super.didReceiveMemoryWarning()
    // Dispose of any resources that can be recreated.
    }



}
