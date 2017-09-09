package com.wdm.design.utils;

import com.wdm.design.adapter.HdmiInterface;
import com.wdm.design.adapter.VgaInterface;

/**
 * Created by wdmyong on 2017/9/9.
 */
public class VgaToHdmiUtil {

    public static void transform(VgaInterface vgaInterface, HdmiInterface hdmiInterface) {
        // 在这里做信号的转换
        System.out.println("将VGA信号转换为了HDMI信号");
    }
}
