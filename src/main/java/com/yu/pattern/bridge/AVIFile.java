package com.yu.pattern.bridge;

public class AVIFile implements VideoFile {
    @Override
    public void decode(String filename) {
        System.out.println("播放" + filename + "avi视频");
    }
}
