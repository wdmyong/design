package com.wdm.design.command;

import com.wdm.design.command.Impl.AirOffCommand;
import com.wdm.design.command.Impl.AirOnCommand;
import com.wdm.design.command.Impl.FanLeftCommand;
import com.wdm.design.command.Impl.FanRightCommand;
import com.wdm.design.command.Impl.LightOffCommand;
import com.wdm.design.command.Impl.LightOnCommand;
import com.wdm.design.command.Impl.TvOffCommand;
import com.wdm.design.command.Impl.TvOnCommand;
import com.wdm.design.command.enums.FanStatus;
import com.wdm.design.command.enums.LightStatus;
import com.wdm.design.command.model.Air;
import com.wdm.design.command.model.Fan;
import com.wdm.design.command.model.Light;
import com.wdm.design.command.model.Tv;

/**
 * Created by wdmyong on 2017/8/12.
 */
public class ControlTest {

    public static void main(String[] args) throws Exception {
        System.out.println("Learn for design model: Command");
        Control control = new Control(4);
        Air air = new Air();
        Fan fan = new Fan(1, "cel", FanStatus.OFF);
        Light light = new Light("wdm", LightStatus.OFF);
        Tv tv = new Tv();
        control.setCommand(0, new AirOnCommand(air), new AirOffCommand(air));
        control.setCommand(1, new FanRightCommand(fan), new FanLeftCommand(fan));
        control.setCommand(2, new LightOnCommand(light), new LightOffCommand(light));
        control.setCommand(3, new TvOnCommand(tv), new TvOffCommand(tv));
        control.pushOnCommand(1);
        control.pushOnCommand(2);
        control.pushOnCommand(3);
        control.pushOnCommand(0);
        control.pushOffCommand(3);
        control.pushOffCommand(1);
        control.pushOffCommand(2);
        // 睡觉，当然只模拟 1 秒呀，不然我得等程序睡多久呀
        Thread.sleep(1000);
        control.pushOffCommand(0);
    }
}
