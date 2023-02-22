/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_6_automovil;

/**
 *
 * @author eduar
 */
public class EVA1_6_AUTOMOVIL {

    public static void main(String[] args) {
       automovil auto1 = new automovil ("Eduardo Muñoz", 2009, "363-AMG", "Ford GT", "Ford");
       auto1.datosAlmacenados();
       
       automovil auto2 = new automovil ("Juan", 2016, "456-YRH", "BRONCO", "Chevy");
       auto2.datosAlmacenados();
       
       automovil auto3 = new automovil();
       auto3.datosAlmacenados();
       
    }
}
