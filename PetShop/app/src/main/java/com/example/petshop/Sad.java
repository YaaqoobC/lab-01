package com.example.petshop;

import java.util.Date;

public class Sad extends Mood {
    private Date date;

    public Sad(Date date) {
        this.date = date;
    }

    public Sad() {
        this.date = new Date();
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String getMood() {
        return "Sad";
    }
}
