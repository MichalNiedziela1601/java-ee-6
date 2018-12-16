package com.javaee.util.validation;

import com.javaee.util.ListNumbers;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

public class ValidateNumberList implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        ListNumbers lists = (ListNumbers) value;
        if(lists.getLists().size() == 0)
            throw new ValidatorException(new FacesMessage("Not input numbers!"));
    }
}
