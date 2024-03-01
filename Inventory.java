/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventariohabitaciones;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author felipe18.uribe
 */

public class Inventory {
    private List<Rooms> rooms;
    private int largeRooms;
    private int mediumRooms;
    private int smallRooms;

    
    public Inventory(int largeRooms, int mediumRooms, int smallRooms) {
        this.largeRooms = largeRooms;
        this.mediumRooms = mediumRooms;
        this.smallRooms = smallRooms;
    }
    
    public void createRooms() {
        for (int i = 1; i <= largeRooms; i++) {
            rooms.add(new Rooms("A", i, true));
        }

        for (int i = 1; i <= mediumRooms; i++) {
            rooms.add(new Rooms("B", i, true));
        }

        for (int i = 1; i <= smallRooms; i++) {
            rooms.add(new Rooms("C", i, true));
        }
    }    
    
    //Añadir una habitacion al inventario
    public void addRoom(Rooms room) {
        rooms.add(room);
    }
    
    //Obtener una lista de las habitaciones disponibles segun el tipo
    public List<Rooms> getAvailableRoomByType(String type) {
        List<Rooms> availableRooms = new ArrayList<>();
        for (Rooms room : rooms) {
            if (room.getType().equals(type) && room.isStatus()) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }
    
    //Obtener una lista de las habitaciones ocupadas segun el tipo
    public List<Rooms> getOccupiedRoomByType(String type) {
        List<Rooms> occupiedRooms = new ArrayList<>();
        for (Rooms room : rooms) {
            if (room.getType().equals(type) && !room.isStatus()) {
                occupiedRooms.add(room);
            }
        }
        return occupiedRooms;
    }
    
    //Obtener una lista de las habitaciones disponibles
    public List<Rooms> getAvailableRoom() {
        List<Rooms> availableRooms = new ArrayList<>();
        for (Rooms room : rooms) {
            if (room.isStatus()) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }
    
    //Obtener una lista de las habitaciones ocupadas
    public List<Rooms> getOccupiedRoomByType() {
        List<Rooms> occupiedRooms = new ArrayList<>();
        for (Rooms room : rooms) {
            if (!room.isStatus()) {
                occupiedRooms.add(room);
            }
        }
        return occupiedRooms;
    }
    
    

}
