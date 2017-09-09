package com.wdm.design.adapter;

import com.wdm.design.utils.VgaToHdmiUtil;

/**
 * Created by wdmyong on 2017/9/9.
 * 相当于一条线，适配了旧Pc，中间会一些信号转换的事情，最后用hdmi的线连接到显示器
 */
public class HdmiVgaConnectLineAdapter implements VgaConnectLine {

    // 这里还是需要vga接口来连接pc的
    private VgaInterface vgaInterface;
    private HdmiConnectLine hdmiConnectLine;

    public HdmiVgaConnectLineAdapter(VgaInterface vgaInterface, HdmiConnectLine hdmiConnectLine) {
        this.vgaInterface = vgaInterface;
        this.hdmiConnectLine = hdmiConnectLine;
    }

    // 这里是适配的关键部分
    @Override
    public void connectPc(Pc pc) {
        // pc只能接入vga接口
        vgaInterface.connectPc(pc);
        System.out.println("我在这里要转接一下，将vga转到hdmi");
        // 这个适配器本身的功能，即将vga接口信号转换为hdmi接口信号
        VgaToHdmiUtil.transform(vgaInterface, hdmiConnectLine.returnHdmiInterface());
    }

    // 直接调用hdmi线去连接显示器就是了
    @Override
    public void connectDisplay(Display display) {
        hdmiConnectLine.connectDisplay(display);
    }
}
