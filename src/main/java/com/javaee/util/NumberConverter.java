package com.javaee.util;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import java.util.ArrayList;
import java.util.List;

public class NumberConverter implements Converter {
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        String[] numbers = value.split(" ");
        List<Integer> listOfNumbers = new ArrayList<>();
        ListNumbers listNumbers = new ListNumbers();
        for(String s : numbers) {
           try {
               Integer i = Integer.valueOf(s);
               listOfNumbers.add(i);
           } catch (NumberFormatException ex) {
               throw new ConverterException(new FacesMessage("Occur conversion error"));
           }
        }
        listNumbers.setLists(listOfNumbers);
        return listNumbers;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if(!(value instanceof ListNumbers)){
            throw new ConverterException(new FacesMessage("Occur conversion error"));
        }
        List<Integer> lists = ((ListNumbers) value).getLists();
        String result = "";
        for(Integer i : lists) {
            result += (i + " ");
        }
        return result;
    }
}
