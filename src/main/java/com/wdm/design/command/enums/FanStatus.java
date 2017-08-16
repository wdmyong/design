package com.wdm.design.command.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wdmyong on 2017/8/12.
 */
public enum FanStatus {

    LOW,
    MID,
    HIGH,
    OFF;

    private static final Map<FanStatus, FanStatus> rightMap = new HashMap<>();
    private static final Map<FanStatus, FanStatus> leftMap = new HashMap<>();

    static {
        rightMap.put(LOW, MID);
        rightMap.put(MID, HIGH);
        rightMap.put(HIGH, OFF);
        rightMap.put(OFF, LOW);
        leftMap.put(LOW, OFF);
        leftMap.put(OFF, HIGH);
        leftMap.put(HIGH, MID);
        leftMap.put(MID, LOW);
    }

    public static FanStatus turnRight(FanStatus status) {
        return rightMap.get(status);
    }

    public static FanStatus turnLeft(FanStatus status) {
        return leftMap.get(status);
    }
}
