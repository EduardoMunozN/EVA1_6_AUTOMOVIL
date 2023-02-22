/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_6_automovil;

/**
 *
 * @author eduar
 */
public class automovil {
    private String marca, dueño, placas, modelo;
    private int año;
    
    public automovil (){//constructor default
        dueño = "Eduardo";
        año = 1960;
        placas = "RDH-345";
        modelo = "VOCHO";
        marca = "Volkswagen";
    }
    public automovil(String dueñ,int ano, String placa, String model, String marc){//constructor con argumentos
        dueño = dueñ;
        año = ano;
        placas = placa;
        modelo = model;
        marca = marc;
    }
    //métodos para operar
    public String getDueño (){
        return dueño;
    }public void setDueño(String valor){
        dueño = valor;
    }public String getMarca (){
        return marca;
    }public void setMarca (String valor){
        marca = valor;
    }public String getPlacas (){
        return placas;
    }public void setPlacas (String valor){
        placas = valor;
    }public String getModelo (){
        return modelo;
    }public void setModelo (String valor){
        modelo = valor;
    }public int getAño (){
        return año;
    }public void setAño (int valor){
       año = valor;
       
    }public void datosAlmacenados (){
        System.out.println("DATOS DEL CLIENTE Y SU AUTOMOVIL");
        System.out.println("El nombre del dueño es: " +dueño );
        System.out.println("La marca del auto es de: " +marca);
        System.out.println("El modelo del automovil es de: " +modelo);
        System.out.println("Las placas del automovil son: " +placas);
        //calcular el adeudo del auto
        if(año <= 2000){
            System.out.println("El adeudo de su automovil es de $1,500.00 MXN");
        }
        else if(año >= 2001 && año <= 2005){
            System.out.println("El adeudo de su automovil es de $2,000.00");
        }
        else if(año >= 2006 && año <= 2010){
            System.out.println("El adeudo de su automovil es de $2,500.00");
        }
        else if(año >= 2011 && año <= 2015){
            System.out.println("El adeudo de su automovil es de $3,000.00");
        }
        else if(año >= 2016){
            System.out.println("El adeudo de su automovil es de $4,000.00");
        }
        
    
    }
    
    
}
