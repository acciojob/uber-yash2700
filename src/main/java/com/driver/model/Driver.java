package com.driver.model;

import javax.persistence.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String mobile;

    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Driver() {
    }

    public Driver(int id, String mobile, String password) {
        this.id = id;
        this.mobile = mobile;
        this.password = password;
    }

    @OneToOne(mappedBy = "driver",cascade = CascadeType.ALL)
    private Cab cab;

    public Cab getCab() {
        return cab;
    }

    public void setCab(Cab cab) {
        this.cab = cab;
    }

    public List<TripBooking> getTripbookingList() {
        return tripbookingList;
    }

    public void setTripbookingList(List<TripBooking> tripbookingList) {
        this.tripbookingList = tripbookingList;
    }

    @OneToMany(mappedBy = "driver",cascade = CascadeType.ALL)

    private List<TripBooking> tripbookingList=new ArrayList<>();
}