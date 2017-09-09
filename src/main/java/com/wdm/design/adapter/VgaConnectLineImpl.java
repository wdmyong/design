package com.wdm.design.adapter;

/**
 * Created by wdmyong on 2017/8/19.
 */
public class VgaConnectLineImpl implements VgaConnectLine {

    private VgaInterface vgaInterface;
    private DisplayInterface displayInterface;

    public VgaConnectLineImpl(VgaInterface vgaInterface, DisplayInterface displayInterface) {
        this.vgaInterface = vgaInterface;
        this.displayInterface = displayInterface;
    }

    public VgaInterface getVgaInterface() {
        return vgaInterface;
    }

    public void setVgaInterface(VgaInterface vgaInterface) {
        this.vgaInterface = vgaInterface;
    }

    public DisplayInterface getDisplayInterface() {
        return displayInterface;
    }

    public void setDisplayInterface(DisplayInterface displayInterface) {
        this.displayInterface = displayInterface;
    }

    @Override
    public void connectPc(Pc pc) {
        vgaInterface.connectPc(pc);
    }

    @Override
    public void connectDisplay(Display display) {
        displayInterface.connectDisplay(display);
    }
}
