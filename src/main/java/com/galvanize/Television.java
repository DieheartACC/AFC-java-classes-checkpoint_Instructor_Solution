package com.galvanize;

import java.util.ArrayList;

public class Television {
    private ArrayList<Channel> channels;
    private boolean hasPower;
    private int currentChannelId;

    public Television(ArrayList<Channel> channels) {
        this.channels = channels;
        this.hasPower = false;
        this.currentChannelId = 0;
    }

    public boolean isOn() {
        return hasPower;
    }

    public void turnOn() {
        this.hasPower = true;
    }

    public void turnOff() {
        this.hasPower = false;
    }

    public String currentChannel() {
        Channel current = channels.get(currentChannelId);

        return String.format("%d - %s", current.getNumber(), current.getName());
    }

    public Television increaseChannel() {
        if (currentChannelId >= channels.size() - 1){
            currentChannelId = 0;
        } else {
            this.currentChannelId++;
        }

        return this;
    }

    public void toggle() {
        hasPower = !hasPower;


        if (hasPower) {
            hasPower = false;
        } else {
            hasPower = true;
        }

        hasPower = hasPower ? false : true;

    }

    public void decreaseChannel() {
        if (currentChannelId <= 0) {
            currentChannelId = channels.size() - 1;
        } else {
            currentChannelId--;
        }

    }

    public ArrayList<Channel> getChannels() {
        return channels;
    }
}
