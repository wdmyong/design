package com.wdm.design.adapter;

/**
 * Created by wdmyong on 2017/9/9.
 */
public class HdmiInterfaceImpl implements HdmiInterface {

    @Override
    public void connectNewPc(NewPc newPc) {
        System.out.println("我连上新电脑了" + newPc.getName());
    }
}
