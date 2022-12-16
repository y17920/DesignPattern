package com.yu.pattern.bridge;

public class Clinet {
    public static void main(String[] args) {

        VideoFile videoFile = new AVIFile();
        OperatingSystem operatingSystem = new Mac(videoFile);
        operatingSystem.play("好好学习");
    }
}
