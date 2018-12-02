package com.javaee.domain;

import java.util.Date;

public class Quotation {
    private double price;
    private Date date;
    private double change;
    private Spolka spolka;

    public Quotation() {
    }

    public Quotation(double price, Date date, double change, Spolka spolka) {
        this.price = price;
        this.date = date;
        this.change = change;
        this.spolka = spolka;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getChange() {
        return change;
    }

    public void setChange(double change) {
        this.change = change;
    }

    public Spolka getSpolka() {
        return spolka;
    }

    public void setSpolka(Spolka spolka) {
        this.spolka = spolka;
    }
}
