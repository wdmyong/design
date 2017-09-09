package com.wdm.design.adapter;

/**
 * Created by wdmyong on 2017/8/19.
 */
public class NewDisplay {

    private long number;
    private VgaConnectLine connectLine;
    private HdmiConnectLine newConnectLine;

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public VgaConnectLine getConnectLine() {
        return connectLine;
    }

    public void setConnectLine(VgaConnectLine connectLine) {
        this.connectLine = connectLine;
    }

    public HdmiConnectLine getNewConnectLine() {
        return newConnectLine;
    }

    public void setNewConnectLine(HdmiConnectLine newConnectLine) {
        this.newConnectLine = newConnectLine;
    }

    public void show() {
        System.out.println("show sth");
    }
}
