package com.mozss.patterns.behavior.command.audioplayer_macrocommand_demo;

/**
 * @author mozss
 * @create 2019-10-26 17:46
 */

public class AudioPlayer {
    /*
     * 行动方法
     * */
    public void play() {
        System.out.println("Palying...");
    }

    /*
     * 行动方法
     * */
    public void rewind() {
        System.out.println("Reming...");
    }

    /*
     * 行动方法
     * */
    public void stop() {
        System.out.println("Stopped.");
    }
}

