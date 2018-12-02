package com.javaee.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Spolka {

    private String name;
    private String symbol;
    private String sector;
    private List<Quotation> quotations;
    private Quotation lastQuotation;

    public Spolka() {}

    public Spolka(String name, String symbol, String sector) {
        this.name = name;
        this.symbol = symbol;
        this.sector = sector;
    }

    public Spolka(String name, String symbol, String sector, double price, double change, Date date) {
        this(name,symbol,sector);
        this.quotations = new ArrayList<>();
        this.quotations.add(new Quotation(price,date,change,this));

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public List<Quotation> getQuotations() {
        return quotations;
    }

    public void setQuotations(List<Quotation> quotations) {
        this.quotations = quotations;
    }

    public Quotation getLastQuotation() {
        if(this.lastQuotation == null) {
            if(this.getQuotations() != null && !this.getQuotations().isEmpty()) {
                this.lastQuotation = this.getQuotations().get(this.getQuotations().size() -1);
            }
        }
        return lastQuotation;
    }

    public void setLastQuotation(Quotation lastQuotation) {
        this.lastQuotation = lastQuotation;
    }
}
