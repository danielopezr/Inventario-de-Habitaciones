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
public class manageInventory {
    private int largeRooms;
    private int mediumRooms;
    private int smallRooms;
    private List<Room> rooms;
    

    public manageInventory(int largeRooms, int mediumRooms, int smallRooms) {
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
    
    public List<Room> listAvailableRooms() {
        List<Room> availableRooms = new ArrayList<>();

        for (Room room : rooms) {
            if (room.getStatus()) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    public List<Room> listUnavailableRooms() {
        List<Room> unavailableRooms = new ArrayList<>();

        for (Room room : rooms) {
            if (!room.getStatus()) {
                unavailableRooms.add(room);
            }
        }
        return unavailableRooms;
    }
    
    public List<Room> listUnavailableRoomsPerMaintenance() {
        List<Room> unavailableRooms = new ArrayList<>();

        for (Room room : rooms) {
            if (room.isMaintenance()) {
                unavailableRooms.add(room);
            }
        }
        return unavailableRooms;
    }
    
    
}
