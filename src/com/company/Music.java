package com.company;
/**
 * Created by ch983 on 1/11/18.
 */
public interface Music {
    //Hodson, Older, Stomel
    String song();
    String album();
    String genre();
    String artist();
    double length();
    void play();
    void pause();
    void nextTrack();
    void lastTrack();
}
