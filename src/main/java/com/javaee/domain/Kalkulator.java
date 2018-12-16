package com.javaee.domain;

import com.javaee.util.ListNumbers;

public class Kalkulator {

    private int liczba1;
    private int liczba2;
    private int sum;
    private ListNumbers listNumbers;

    public Kalkulator() {
    }

    public int getLiczba1() {
        return liczba1;
    }

    public void setLiczba1(int liczba1) {
        this.liczba1 = liczba1;
    }

    public int getLiczba2() {
        return liczba2;
    }

    public void setLiczba2(int liczba2) {
        this.liczba2 = liczba2;
    }

    public int getSum() {
        return sum;
    }

    public String calculate() {
        this.sum = this.liczba1 + this.liczba2;
        return null;
    }

    public ListNumbers getListNumbers() {
        return listNumbers;
    }

    public void setListNumbers(ListNumbers listNumbers) {
        this.listNumbers = listNumbers;
    }

    public String calculateMulti() {
        this.sum = this.getListNumbers().getSum();
        return null;
    }
}
