/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventariohabitaciones;

/**
 *
 * @author felipe18.uribe
 */
public class Manager {
    private String name;
    private int id;
    private int phoneNo;

    public Manager(String name, int id, int phoneNo) {
        this.name = name;
        this.id = id;
        this.phoneNo = phoneNo;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
