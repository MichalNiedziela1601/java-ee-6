package com.javaee.controllers;


import com.javaee.config.DBManager;
import com.javaee.domain.Clinic;

import javax.persistence.EntityManager;

public class ClinicBean {

    private Clinic clinic = new Clinic();

    public ClinicBean() {
    }

    public Clinic getClinic() {
        return clinic;
    }

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }

    public String add() {
        EntityManager em = DBManager.getManager().createEntityManager();
        em.getTransaction().begin();
        clinic.setId(null);
        em.persist(clinic);
        em.getTransaction().commit();
        em.close();
        this.clinic = new Clinic();
        return null;
    }
}
