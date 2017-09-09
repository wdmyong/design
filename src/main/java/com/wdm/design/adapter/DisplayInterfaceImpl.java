package com.wdm.design.adapter;

/**
 * Created by wdmyong on 2017/9/9.
 */
public class DisplayInterfaceImpl implements DisplayInterface {

    @Override
    public void connectDisplay(Display display) {
        System.out.println("我连上显示器了：" + display.getNumber());
    }
}
