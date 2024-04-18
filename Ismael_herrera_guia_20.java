/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.rapidzets.ismael_herrera_guia_20;

import java.util.Scanner;

/**
 *
 * @author mplab4.pc26
 */
public class Ismael_herrera_guia_20 {

    public static void main(String[] args) {
        int opcion;
        funciones menu = new funciones();
        
         do{
        Scanner leer = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("opcion 1                  opcion 2");
        System.out.println("opcion 3                  opcion 4");
        System.out.println("opcion 5                  opcion 6");
        System.out.println("opcion 7                  opcion 8");
        System.out.println("opcion 9                  opcion 10");
        System.out.println("opcion 11                 opcion 12");
        System.out.println("opcion 13                 opcion 14");
        System.out.println("opcion 15                 opcion 16");
        System.out.println("opcion 17                 opcion 18");
        System.out.println("opcion 19                 opcion 20");
        System.out.println("opcion 21.salir");
        
        opcion = leer.nextInt();
        
        switch(opcion){
            
            case 1 -> {menu.uno();}
            case 2 -> {menu.dos(); }            
            case 3 -> {menu.tres(); }
            case 4 -> {menu.cuatro(); }
            case 5 -> {menu.cinco(); }
            case 6 -> {menu.seis(); }
            case 7 -> {menu.siete(); }
            case 8 -> {menu.ocho(); }
            case 9 -> {menu.nueve(); }
            case 10 -> {menu.diez(); }
            case 11 -> {menu.once(); }
            case 12 -> {menu.doce(); }
            case 13 -> {menu.trece(); }
            case 14 -> {menu.catorce(); }
            case 15 -> {menu.quince(); }
            case 16 -> {menu.dieciseis(); }
            case 17 -> {menu.diecisiete(); }
            case 18 -> {menu.dieciocho(); }
            case 19 -> {menu.diecinueve(); }
            case 20 -> {menu.veinte(); }
            case 21 -> {System.out.println("hasta luego"); }
                         
                         
                         
        }
    }while(opcion != 21);
    }
}
