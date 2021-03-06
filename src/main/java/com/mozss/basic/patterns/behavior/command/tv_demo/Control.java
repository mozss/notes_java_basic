package com.mozss.basic.patterns.behavior.command.tv_demo;

/**
 * @author mozss
 * @create 2019-10-26 20:59
 */

public class Control {
    private final Command onCommand;
    private final Command offCommand;
    private final Command changeChannel;

    /*
     * 构造函数
     * */
    public Control(Command on, Command off, Command channel) {
        onCommand = on;
        offCommand = off;
        changeChannel = channel;
    }

    /*
     * 行动方法
     * */
    public void turnOn() {
        onCommand.execute();
    }

    /*
     * 行动方法
     * */
    public void turnOff() {
        offCommand.execute();
    }

    /*
     * 行动方法
     * */
    public void changeChannel() {
        changeChannel.execute();
    }
}
