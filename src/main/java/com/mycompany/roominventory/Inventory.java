/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.roominventory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dlope
 */
public class Inventory {
    private int largeRooms;
    private int mediumRooms;
    private int smallRooms;
    private List<Room> rooms;

    public Inventory(int largeRooms, int mediumRooms, int smallRooms) {
        this.largeRooms = largeRooms;
        this.mediumRooms = mediumRooms;
        this.smallRooms = smallRooms;
        this.rooms = createRooms();
    }
    
    public List<Room> createRooms() {
        List<Room> generatedRooms = new ArrayList<>();

        for (int i = 1; i <= largeRooms; i++) {
            generatedRooms.add(new Room("A", i, true));
        }

        for (int i = 1; i <= mediumRooms; i++) {
            generatedRooms.add(new Room("B", i, true));
        }

        for (int i = 1; i <= smallRooms; i++) {
            generatedRooms.add(new Room("C", i, true));
        }

        return generatedRooms;
    }
    
    public List<Room> getAvailableRooms() {
        List<Room> availableRooms = new ArrayList<>();

        for (Room room : rooms) {
            if (room.getStatus()) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    public List<Room> getUnavailableRooms() {
        List<Room> unavailableRooms = new ArrayList<>();

        for (Room room : rooms) {
            if (!room.getStatus()) {
                unavailableRooms.add(room);
            }
        }
        return unavailableRooms;
    }

    public void modifyRoomStatus(String type, int roomNo, boolean newStatus) {
        for (Room room : rooms) {
            if (room.getType().equals(type) && room.getRoomNo() == roomNo) {
                room.setStatus(newStatus);
                return;
            }
        }
        System.out.println("Habitación " + type + roomNo + " no encontrada");
    }
}
