package com.example.petshop;

import java.util.Date;

public class Happy extends Mood {
    private Date date;

    public Happy(Date date) {
        this.date = date;
    }

    public Happy() {
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
        return "Happy";
    }
}
