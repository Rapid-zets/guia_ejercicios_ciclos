/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rapidzets.ismael_herrera_guia_20;
import java.util.Scanner;
/**
 *
 * @author mplab4.pc26
 */
public class funciones {
    
    public void uno(){
        String op;
        Scanner leer = new Scanner(System.in);
         do{

        System.out.println("ingrese la medida ");
        int medida= leer.nextInt();
        
        int km = medida/100000;
        int m = (medida%100000)/100;
        int cm = medida%100;
        
        System.out.println("los kilometros son "+km+" y los metros son "+m+" y por ultimo los cm restantes son "+cm + "cm");
        System.out.println("desea calcular otra medida?(s para seguir/n par salir) ");
        op = leer.next();
    
    }while(!"n".equals(op));}
    
    
    public void dos(){
    int acc = 1 ;
    
    while(acc<=10){
    System.out.print(" "+acc+" ");
    acc++;}
    System.out.println(" ");
    }
    
    
    public void tres(){
    int num = 0;
    int acc = 1;
    while(acc<=10){
    num +=acc;   
    acc++;}
    System.out.println("La suma de los numeros 1 al 10 es "+num);}
    
    public void cuatro(){
    String op;
    Scanner leer = new Scanner(System.in);
    do{
        System.out.println("ingrese un numero ");
        int num= leer.nextInt();
        
        if (num%2 == 0){
        System.out.println("El numero "+ num + " es par");}
        else if (num%2 != 0){
        System.out.println("El numero "+ num + " es impar");}
        
        System.out.println("desea ingresar otro numero?(n par salir) ");
        op = leer.next();
    
    }while(!"n".equals(op));}
    
    public void cinco(){
    String op;
    Scanner leer = new Scanner(System.in);
    
    do{
        int suma = 0;
        for (int i = 1; i<= 30; i++){
        System.out.println("ingrese un numero ");
        int num= leer.nextInt();
        suma += num  
                ;}
        
        int promedio = suma/30;
        
       System.out.println("el promedio es " + promedio);
        
        System.out.println("desea conocer el promedio de otros 30 numeros?(n par salir) ");
        op = leer.next();
     }while(!"n".equals(op));}
    
    public void seis(){
        int num = 0;
        while (num<=20){
          
        if (num%2 == 0){
        System.out.print(" "+num+" ");}
        num++;}  
        System.out.println(" ");
            
        }
    public void siete(){
        int num = 0;
        int suma = 0;
        while (num<=400){
          
        if (num%2 != 0){
        suma += num;}
        num++;}  
        System.out.println("La suma de los numeros impares del 1 al 400 es "+suma);}
    
    public void ocho(){
    String op;
    Scanner leer = new Scanner(System.in);
    double radio = 0;
    do{
        while(radio<= 0){
            System.out.println("ingrese el radio del circulo(debe ser positivo)");
            radio = leer.nextDouble();}
        double area = Math.PI*Math.pow(radio, 2);
        System.out.println("El area del circulo es de "+ area);
        
        System.out.println("desea calcular el area de otro circulo?(n par salir) ");
        op = leer.next();
     }while(!"n".equals(op));} 
     
    public void nueve(){
    String op;
    Scanner leer = new Scanner(System.in);
    double radio = 0;
    do{
        while(radio<= 0){
            System.out.println("ingrese el radio del circulo(debe ser positivo)");
            radio = leer.nextDouble();}
        double perimetro = Math.PI*radio*2;
        System.out.println("El perimetro del circulo es de "+ perimetro);
        
        System.out.println("desea calcular el perimetro de otro circulo?(n par salir) ");
        op = leer.next();
     }while(!"n".equals(op));} 
    
    
      public void diez(){
    String op;
    Scanner leer = new Scanner(System.in);
    double largo = 0;
    double ancho = 0;
    do{
        while(largo<= 0 || ancho <= 0){
            System.out.println("ingrese las medidas(ambos deben ser positivos)");
            System.out.println("largo del rectangulo: ");
            largo = leer.nextDouble();
            System.out.println("ancho del rectangulo: ");
            ancho = leer.nextDouble();}
        double area = largo*ancho;
        System.out.println("El area del rectangulo de "+ area);
        
        System.out.println("desea calcular el area de otro rectangulo?(n par salir) ");
        op = leer.next();
     }while(!"n".equals(op));} 
      
    public void once(){
    String op;
    Scanner leer = new Scanner(System.in);
    double radio = 0;
    do{
        while(radio<= 0){
            System.out.println("ingrese el radio de la esfera(debe ser positivo)");
            radio = leer.nextDouble();}
        double Volumen = (4*Math.PI*Math.pow(radio, 3))/3;
        System.out.println("El volumen de la esfera es de "+ Volumen);
        
        System.out.println("desea calcular el Volumen de otra esfera?(n par salir) ");
        op = leer.next();
     }while(!"n".equals(op));} 
    
    
    public void doce(){
    String op;
    Scanner leer = new Scanner(System.in);
    double lado = 0;
    do{
        while(lado<= 0){
            System.out.println("ingrese el lado del cubo(debe ser positivo)");
            lado = leer.nextDouble();}
        double perimetro = 12*lado;
        double area = 6*Math.pow(lado, 2);
        System.out.println("El perimetro del cubo es de "+ perimetro);
        System.out.println("El area del cubo es de "+ area);
        
        System.out.println("desea calcular el area y perimerro de otro cubo?(n par salir) ");
        op = leer.next();
     }while(!"n".equals(op));} 
    
    
    public void trece(){
        for(int i = 1; i <= 100; i++){
            if (i%3!=0){
            System.out.print(" "+i+" ");}}
    System.out.println(" ");}
    
    public void catorce(){
        int num = 0;
        while (num<=100){
            if (num%5!=0){
            System.out.print(" "+num+" ");}
        num++;}
        System.out.println(" ");}
    
    
    public void quince(){
        int num = 0;
        while (num<=100){
            if (num%5!=0&&num%3!=0){
            System.out.print(" "+num+" ");}
        num++;}
        System.out.println(" ");}
      
       public void dieciseis(){
        for(int i = 1; i <= 100; i++){
            if (i%3!=0){
            System.out.print(" "+i+" ");}
            else if(i%3==0){
                System.out.print("Cuek");}}}
       
    public void diecisiete(){
    String op;
    Scanner leer = new Scanner(System.in);
    int num = 0;
    do{
         do{
       System.out.println("Ingresa el numero(positivo) del que se quiere calcular el factorial");
       num = leer.nextInt();}while(num<= 0);
       int fact = 1;
       for(int i = num;i>0;i--){
       fact *= i;}
       
       System.out.println("El factorial de "+ num + " es "+ fact);
        
        System.out.println("desea calcular otro factorial?(n par salir) ");
        op = leer.next();
     }while(!"n".equals(op));} 
    
    
    public void dieciocho(){
    String op;
    
    Scanner leer = new Scanner(System.in);
    int num = 0;
    do{
        int contar = 0;
         do{
       System.out.println("Ingrese un numero para contar sus digitos");
       num = leer.nextInt();}while(num<= 0);
       int digitos = num;
       do{digitos /= 10;
       contar++;
       }while(digitos>0);
       
       System.out.println("el "+ num + " tiene "+ contar + " digitos");
        
        System.out.println("desea calcular otro factorial?(n par salir) ");
        op = leer.next();
     }while(!"n".equals(op));} 

    public void diecinueve(){
    String op;
    Scanner leer = new Scanner(System.in);
    double lado = 0;
    do{
        while(lado<= 0){
            System.out.println("ingrese el lado del cuadrado(debe ser positivo)");
            lado = leer.nextDouble();}
        double perimetro = 4*lado;
        double area = Math.pow(lado, 2);
        System.out.println("El perimetro del cuadrado es de "+ perimetro);
        System.out.println("El area del cuadrado es de "+ area);
        
        System.out.println("desea calcular el area y perimerro de otro cuadrado?(n par salir) ");
        op = leer.next();
     }while(!"n".equals(op));} 
    
    
    
  

     public void veinte(){
    String op;
    Scanner leer = new Scanner(System.in);
    int num = 0;
    int exp = 0;
    do{
        do{
            System.out.println("ingrese el numero (debe ser positivo) ");
            num = leer.nextInt();
            System.out.println("ingrese el exponente (tambien debe ser positivo) ");
            exp = leer.nextInt();}while(num<= 0 || exp <= 0);
         int i = 0;
         int acc= 1;
        while (i < exp) {
            acc *= num;
            i++;
        }
        System.out.println("el numero "+num+ " con el exponente "+ exp +" es de " + acc );
        System.out.println("desea calcular otra potencia?(n par salir) ");
        op = leer.next();
     }while(!"n".equals(op));} 
     
  

}
