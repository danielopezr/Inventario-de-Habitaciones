/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventariohabitaciones;

/**
 *
 * @author felipe18.uribe
 */
public class Rooms {
    private String type;
    private int roomNo;
    private boolean status;

    public Rooms(String type, int roomNo, boolean status) {
        this.type = type;
        this.roomNo = roomNo;
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return type + roomNo;
    }
    
    
    
}
