package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] songs = {"Jingle Bells", "Happy Halloween"};
        String disk = "Frank Sinatra End-Of-Year Holiday Space Rock";
        Smusic fSinatra = new Smusic(songs, disk);
        System.out.println("Your music is ready.");
        while(true) {
            String response = scanner.nextLine();
            if (response.equals("end")) {
                break;
            } else if (response.equals("play")) {
                fSinatra.play();
            } else if (response.equals("pause")) {
                fSinatra.pause();
            } else if (response.equals("title")) {
                System.out.println(fSinatra.song());
            } else if (response.equals("album")) {
                System.out.println(fSinatra.album());
            } else if (response.equals("next track")) {
                fSinatra.nextTrack();
            } else if (response.equals("previous track")) {
                fSinatra.lastTrack();
            } else if (response.equals("song length")) {
                System.out.println(fSinatra.length());
            } else if (response.equals("artist")) {
                System.out.println(fSinatra.artist());
            } else if (response.equals("genre")) {
                System.out.println(fSinatra.genre());
            }
        }
    }
}

