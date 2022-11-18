package com.abhay;



public class Video {
    private String title;
    private String description;
    private double duration;
    private Int rate;

    public Video(String title, String description, double duration, Int rate) {
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.rate = rate;
    }
    public Video(){

    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getDuration() {
        return duration;
    }

    public Int getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", duration=" + duration + "rating=" + rate +
                '}';
    }
}