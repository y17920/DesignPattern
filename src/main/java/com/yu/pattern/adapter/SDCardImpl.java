package com.yu.pattern.adapter;

public class SDCardImpl implements SDCard{
    @Override
    public String readSd() {
        return "读取sd卡数据";
    }
}
