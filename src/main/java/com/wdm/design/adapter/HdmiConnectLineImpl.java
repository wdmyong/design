package com.wdm.design.adapter;

/**
 * Created by wdmyong on 2017/8/19.
 */
public class HdmiConnectLineImpl implements HdmiConnectLine {

    private HdmiInterface hdmiInterface;
    private DisplayInterface displayInterface;

    public HdmiConnectLineImpl(HdmiInterface hdmiInterface, DisplayInterface displayInterface) {
        this.hdmiInterface = hdmiInterface;
        this.displayInterface = displayInterface;
    }

    @Override
    public HdmiInterface returnHdmiInterface() {
        return this.hdmiInterface;
    }

    @Override
    public void connectNewPc(NewPc newPc) {
        hdmiInterface.connectNewPc(newPc);
    }

    @Override
    public void connectDisplay(Display display) {
        displayInterface.connectDisplay(display);
    }
}
