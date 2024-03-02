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
        
        System.out.print("Ingrese el número de habitaciones grandes: ");
            int largeRooms = scanner.nextInt();

        System.out.print("Ingrese el número de habitaciones medianas: ");
        int mediumRooms = scanner.nextInt();

        System.out.print("Ingrese el número de habitaciones pequeñas: ");
        int smallRooms = scanner.nextInt();
        
        Inventory inventory = new Inventory(largeRooms, mediumRooms, smallRooms);
        
        while (!exit){
            
            List<Room> availableRooms = inventory.getAvailableRooms();
            List<Room> unavailableRooms = inventory.getUnavailableRooms();
        
            System.out.println("Habitaciones Disponibles:");
            for (Room room : availableRooms) {
                System.out.println(room.toString());
            }
        
            System.out.println("Habitaciones Ocupadas:");
            for (Room room : unavailableRooms) {
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
                
                inventory.modifyRoomStatus(roomType, roomNumber, newStatus);
            }
            
            System.out.print("¿Desea salir? (si/no): ");
            String exitResponse = scanner.next();
            exit = exitResponse.equalsIgnoreCase("si");
        }
    }
}
