package com.example.user.androidweatherapp.Model;

/**
 * Created by User on 7/28/2018.
 */

public class Wind {
    private double speed ;
    private double deg ;
    private double gust ;

    public Wind() {
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDeg() {
        return deg;
    }

    public void setDeg(int deg) {
        this.deg = deg;
    }

    public double getGust() {
        return gust;
    }

    public void setGust(double gust) {
        this.gust = gust;
    }
}
