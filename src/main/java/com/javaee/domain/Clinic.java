package com.javaee.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "clinic")
@NamedQueries({
        @NamedQuery(name = "Clinic.findAll", query = "SELECT c from clinic c"),
        @NamedQuery(name = "Clinic.findById", query="SELECT c FROM clinic c WHERE c.id = :id"),
        @NamedQuery(name="Clinic.findByName", query = "SELECT c FROM clinic c WHERE c.name = :name"),
        @NamedQuery(name="Clinic.findByAddress", query = "SELECT c FROM clinic c WHERE c.address = :address"),
        @NamedQuery(name="Clinic.findByContact", query = "SELECT c FROM clinic c WHERE c.contact = :contact"),
})
public class Clinic implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Basic
    @Column(name = "name", nullable = false, length = 255)
    private String name;

    @Basic
    @Lob
    @Column(name = "description", nullable = false)
    private String description;

    @Basic
    @Column(name = "address", length = 150)
    private String address;

    @Basic
    @Column(name = "contact", length = 30)
    private String contact;

    public Clinic() {
    }

    public Clinic(Integer id,String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clinic clinic = (Clinic) o;
        return Objects.equals(id, clinic.id) &&
                Objects.equals(name, clinic.name) &&
                Objects.equals(description, clinic.description) &&
                Objects.equals(address, clinic.address) &&
                Objects.equals(contact, clinic.contact);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, address, contact);
    }

    @Override
    public String toString() {
        return "Clinic{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
