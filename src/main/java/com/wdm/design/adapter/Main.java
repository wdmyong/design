package com.wdm.design.adapter;

/**
 * Created by wdmyong on 2017/8/19.
 */
public class Main {

    public static void main(String[] args) {

        // 老线连老pc
        Pc pc = new Pc();
        pc.setName("oldPc");
        Display display = new Display();
        display.setNumber(123L);
        VgaConnectLine vgaConnectLine = new VgaConnectLineImpl(new VgaInterfaceImpl(), new DisplayInterfaceImpl());
        vgaConnectLine.connectPc(pc);
        vgaConnectLine.connectDisplay(display);
        display.show();  //显示器显示啦

        System.out.println("------------------------分割线------------------------");

        // 新线连新pc
        NewPc newPc = new NewPc();
        newPc.setName("newPc");
        HdmiConnectLine hdmiConnectLine = new HdmiConnectLineImpl(new HdmiInterfaceImpl(), new DisplayInterfaceImpl());
        hdmiConnectLine.connectNewPc(newPc);
        display.setNumber(456L);
        hdmiConnectLine.connectDisplay(display);
        display.show();  //显示器显示啦

        System.out.println("------------------------分割线------------------------");

        // 现在有一个工厂已经生成了好大一批旧pc，但是没有工厂生成VgaConnectLineImpl的线了，
        // 生产Hhmi的工厂就需要生产一个适配器，即vga到hdmi的转接头
        // 所以，以下代码其实就是用一个适配器+Hdmi的线将Pc和显示器连上
        HdmiVgaConnectLineAdapter adapter = new HdmiVgaConnectLineAdapter(new VgaInterfaceImpl(), hdmiConnectLine);
        adapter.connectPc(pc);
        display.setNumber(789L);
        adapter.connectDisplay(display);
        display.show();  //显示器显示啦
    }
}
