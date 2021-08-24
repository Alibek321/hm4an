package com.geektech.hm4an1;

import java.io.Serializable;

public class MusicModel implements Serializable {
    private String number;
    private String name;
    private String singer;
    private String time;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public MusicModel(String number, String name, String singer, String time) {
        this.number = number;
        this.name = name;
        this.singer = singer;
        this.time = time;
    }
}

