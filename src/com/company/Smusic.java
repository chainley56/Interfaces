package com.company;
/**
 * Created by ch983 on 1/11/18.
 */
public class Smusic implements Music{
    String[] songs;
    String diskName;
    int place;
    public Smusic(String[] songsOnDisk, String diskNameA) {
        songs = songsOnDisk;
        diskName = diskNameA;
        place = 0;
    }
    public String song() {
        return songs[place];
    }
    public String album() {
        return diskName;
    }
    public String genre(){
        String s = "Space Rock";
        return s;
    }
    public String artist(){
        String f = "Frank Sinatra";
        return f;
    }
    public double length(){
        double l = 24.54;
        return l;
    }
    public void play(){
        System.out.println(songs[place] + " starts playing.");
    }
    public void pause(){
        System.out.println(songs[place] + " stops playing.");
    }
    public void nextTrack(){
        place++;
        if (place >= songs.length) {
            place = 0;
        }
        System.out.println(songs[place] + " starts playing.");
    }
    public void lastTrack(){
        place--;
        if (place<0) {
            place = songs.length-1;
        }
        System.out.println(songs[place] + " starts playing.");
    }
}
