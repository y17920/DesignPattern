package com.yu.pattern.bridge;

public class Windows extends OperatingSystem {
    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    void play(String filename) {
        videoFile.decode(filename);
    }
}
