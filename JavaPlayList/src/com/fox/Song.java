package com.fox;

public class Song {
    private String title;
    private int hours;
    private int minute;
    private int second;

    public Song(String title, int hours, int minute, int second) {
        if ( title.isEmpty () ){
            System.out.println ("please enter a title");
            System.exit ( 0 );
        } else{
            this.title = title;
        }

        if(hours < 0 ){
            System.out.println ("the hours cannout be less that 0");
        }else {

            this.hours = hours;
        }

        if(minute < 0 ){
            System.out.println ("the minute cannout be less that 0");
        }else {

            this.minute = minute;
        }

        if(second < 0 ){
            System.out.println ("the second cannout be less that 0");
        }else {

            this.second = second;
        }

    }

    public String getTitle() {
        return title;
    }

    public String songPeriod(){
        if(this.hours == 0){
            return "song period is equal to: " + this.minute + ":" + this.second;
        }

        if(this.hours == 0 && this.minute == 0){
            return "song period is equal to : " + this.second + " s";
        }
        return null;
    }
}
