/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inventariohabitaciones;


/**
 *
 * @author felipe18.uribe
 */
public class InventarioHabitaciones {
    
    
    public static void main(String[] args) {
        Inventory inventario = new Inventory(5,10,12);
        
        var habitacionesDisponibles = inventario.getAvailableRoom();
        for (int i = 0; i < habitacionesDisponibles.size(); i++) {
            System.out.println(habitacionesDisponibles.get(i).toString());
        }
    }
    
}
