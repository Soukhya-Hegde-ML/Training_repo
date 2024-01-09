package com.hybernate;

import jakarta.persistence.*;


@Entity
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int student_id;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private  String last_name;
    @Column(name = "email")
    private String email;
    @OneToOne
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Student() {
        this.student_id = student_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
    }
}

