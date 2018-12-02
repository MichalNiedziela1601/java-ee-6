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

    public Manager() {
        spolkas = new ArrayList<>();
        Date d = new Date();
        spolkas.add(new Spolka("Spolka nr 1", "SPNR1", "energetic", 20.0, 11.1, d));
        spolkas.add(new Spolka("Spolka nr 2", "SPNR2", "informatic", 90.0, 3.4, d));
        spolkas.add(new Spolka("Spolka nr 3", "SPNR3", "entertainment", 15.0, -11.7, d));
    }

    public List<Spolka> getSpolkas() {
        return spolkas;
    }

    public void setSpolkas(List<Spolka> spolkas) {
        this.spolkas = spolkas;
    }
}
