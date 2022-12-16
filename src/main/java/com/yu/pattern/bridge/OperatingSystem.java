package com.yu.pattern.bridge;

public abstract class OperatingSystem {
    VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    abstract void play(String filename);
}
