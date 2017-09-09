package com.wdm.design.adapter;

/**
 * Created by wdmyong on 2017/9/9.
 */
public interface HdmiConnectLine {

    default HdmiInterface returnHdmiInterface() {
        return null;
    }

    void connectNewPc(NewPc newPc);

    void connectDisplay(Display newDisplay);
}
