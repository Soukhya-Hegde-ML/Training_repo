package com.hybernate;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name="Vehicle")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Vehicle_id;
    @Column(name="vehicleName")
    private String vehicleName;
    @ManyToMany(mappedBy = "vehicles")
    private Collection<User> users = new ArrayList<>();

    public int getVehicle_id() {
        return Vehicle_id;
    }

    public void setVehicle_id(int vehicle_id) {
        this.Vehicle_id = vehicle_id;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public Collection<User> getUsers() {
        return users;
    }

    public void setUsers(Collection<User> users) {
        this.users = users;
    }
}
