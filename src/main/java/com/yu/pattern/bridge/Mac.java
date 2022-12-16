package com.yu.pattern.bridge;

public class Mac extends OperatingSystem {
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    void play(String filename) {
        videoFile.decode(filename);
    }
}
