package com.javaee.domain;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ManagedBean(eager = true)
@RequestScoped
public class Manager {

    private List<Spolka> spolkas;
    private String symbolActiveCompany;

    public Manager() {
        spolkas = new ArrayList<>();
        Date d = new Date();
        spolkas.add(new Spolka("Spolka nr 1", "SPNR1", "energetic", 20.0, 11.1, d));
        spolkas.add(new Spolka("Spolka nr 2", "SPNR2", "informatic", 90.0, 3.4, d));
        spolkas.add(new Spolka("Spolka nr 3", "SPNR3", "entertainment", 15.0, -11.7, d));

        Date yesterday = new Date(d.getTime() - 86400 * 1000);
        spolkas.get(0).getQuotations().add(0, new Quotation(18, yesterday, 4.0, spolkas.get(0)));
        spolkas.get(1).getQuotations().add(0, new Quotation(87, yesterday, -2.0, spolkas.get(1)));
        spolkas.get(2).getQuotations().add(0, new Quotation(17, yesterday, 10.0, spolkas.get(2)));
    }

    public List<Spolka> getSpolkas() {
        return spolkas;
    }

    public void setSpolkas(List<Spolka> spolkas) {
        this.spolkas = spolkas;
    }

    public Spolka getActiveCompany() {
        for(Spolka s : spolkas) {
            if(s.getSymbol().equals(this.getSymbolActiveCompany())) {
                return s;
            }
        }
        return null;
    }

    public String getSymbolActiveCompany() {
        return symbolActiveCompany;
    }

    public void setSymbolActiveCompany(String symbolActiveCompany) {
        this.symbolActiveCompany = symbolActiveCompany;
    }
}
