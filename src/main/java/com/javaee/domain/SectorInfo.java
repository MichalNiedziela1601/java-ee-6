package com.javaee.domain;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import java.util.HashMap;
import java.util.Map;

public class SectorInfo {

    private Manager manager;
    private Map<String, Double> prices;

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Map<String, Double> getPrices() {
        prices = new HashMap<>();
        for (Spolka s : getManager().getSpolkas()) {
            Double value = prices.get(s.getSector());
            if(value == null)
                value = 0.0;
            prices.put(s.getSector(), value + s.getLastQuotation().getPrice());
        }
        return prices;
    }

    public Object[] getSectors() {
        Map<String, Double> map = this.getPrices();
        return map.keySet().toArray();
    }
}
