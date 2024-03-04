/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.roominventory;

import java.util.List;
import java.util.Scanner;
/**
 *
 * @author dlope
 */
public class RoomInventory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        Room rm = new Room();
        
        
        System.out.print("Ingrese el número de habitaciones grandes: ");
        int largeRooms = scanner.nextInt();

        System.out.print("Ingrese el número de habitaciones medianas: ");
        int mediumRooms = scanner.nextInt();

        System.out.print("Ingrese el número de habitaciones pequeñas: ");
        int smallRooms = scanner.nextInt();
        
        manageInventory inventory = new manageInventory(largeRooms, mediumRooms, smallRooms);
        
        while (!exit){
            
            List<Room> availableRooms = inventory.listAvailableRooms();
            List<Room> unavailableRooms = inventory.listUnavailableRooms();
            List<Room> unavailableRoomsm = inventory.listUnavailableRoomsPerMaintenance();
        
            System.out.println("Habitaciones Disponibles:");
            for (Room room : availableRooms) {
                System.out.println(room.toString());
            }
        
            System.out.println("Habitaciones Ocupadas:");
            for (Room room : unavailableRooms) {
                System.out.println(room.toString());
            }
            
            System.out.println("Habitaciones Ocupadas por mantenimiento:");
            for (Room room : unavailableRoomsm) {
                System.out.println(room.toString());
            }
            
            System.out.print("¿Desea modificar el estado de una habitación? (si/no): ");
            String response = scanner.next();

            if (response.equalsIgnoreCase("si")) {
                System.out.print("Ingrese el tipo de habitación (A/B/C): ");
                String roomType = scanner.next();

                System.out.print("Ingrese el número de habitación: ");
                int roomNumber = scanner.nextInt();
                
                System.out.print("¿La habitación está disponible? (true/false): ");
                boolean newStatus = scanner.nextBoolean();
                boolean maintenance = false;
                
                if (newStatus == false){
                    System.out.print("¿La habitación está en mantenimiento? (true) \n");                    
                     maintenance = scanner.nextBoolean();
                }
                
                
                rm.modifyRoomStatus(availableRooms, roomType, roomNumber, newStatus, maintenance);
            }
            
            System.out.print("¿Desea salir? (si/no): ");
            String exitResponse = scanner.next();
            exit = exitResponse.equalsIgnoreCase("si");
        }
    }
}
