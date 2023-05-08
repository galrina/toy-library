package com.toyLibrary.toyLibraryService.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Product {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "name")
    private String name;
    @ManyToOne
    @Column(name = "booked_by")
    private Users bookedBy;
    @Basic
    @Column(name = "booked_until")
    private Date bookedUntil;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Users getBookedBy() {
        return bookedBy;
    }

    public void setBookedBy(Users bookedBy) {
        this.bookedBy = bookedBy;
    }

    public Date getBookedUntil() {
        return bookedUntil;
    }

    public void setBookedUntil(Date bookedUntil) {
        this.bookedUntil = bookedUntil;
    }
}
