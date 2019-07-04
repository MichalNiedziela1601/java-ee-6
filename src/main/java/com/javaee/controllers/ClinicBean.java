package com.javaee.controllers;


import com.javaee.config.DBManager;
import com.javaee.domain.Clinic;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import java.util.List;

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
        addInformation("Added clinic");
        em.close();
        this.clinic = new Clinic();
        return null;
    }

    public List<Clinic> getList() {
        EntityManager em = DBManager.getManager().createEntityManager();
        List list = em.createNamedQuery("Clinic.findAll").getResultList();
        em.close();
        return list;
    }

    public void clinicListener(ActionEvent ae) {
        String ids = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("clinicID").toString();
        int id = Integer.parseInt(ids);
        this.clinic.setId(id);
    }

    public String loadToEdit() {
        EntityManager em = DBManager.getManager().createEntityManager();
        this.clinic = em.find(Clinic.class, clinic.getId());
        em.close();
        return "/editclinic.xhtml";
    }

    public String remove() {
        EntityManager em = DBManager.getManager().createEntityManager();
        em.getTransaction().begin();
        this.clinic = em.find(Clinic.class, clinic.getId());
        em.remove(this.clinic);
        this.clinic = new Clinic();
        em.getTransaction().commit();
        em.close();
        this.addInformation("Removed clinic");
        return null;
    }

    public String edit() {
        EntityManager em = DBManager.getManager().createEntityManager();
        em.getTransaction().begin();
        em.merge(clinic);
        em.getTransaction().commit();
        em.close();
        this.addInformation("Edit clinic");
        this.clinic = new Clinic();
        return "/showClinic.xhtml";
    }

    public void addInformation(String s) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, s, ""));
    }
}
