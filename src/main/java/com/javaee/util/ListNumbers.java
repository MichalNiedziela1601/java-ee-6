package com.javaee.util;

import java.util.List;

public class ListNumbers {
    private List<Integer> lists;

    public List<Integer> getLists() {
        return lists;
    }

    public void setLists(List<Integer> lists) {
        this.lists = lists;
    }

    public int getSum() {
        if(lists == null) {
            return 0;
        }

        int sum = 0;
        for(Integer i : lists) {
            sum += i;
        }
        return sum;
    }
}
