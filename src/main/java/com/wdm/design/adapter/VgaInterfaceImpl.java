package com.wdm.design.adapter;

/**
 * Created by wdmyong on 2017/9/9.
 */
public class VgaInterfaceImpl implements VgaInterface {

    @Override
    public void connectPc(Pc pc) {
        System.out.println("我连上电脑了:" + pc.getName());
    }
}
