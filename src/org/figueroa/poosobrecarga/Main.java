package org.figueroa.poosobrecarga;
import static org.figueroa.poosobrecarga.Calculadora.*;


public class Main {
    public static void main(String[] args) {

      //  Calculadora calc = new Calculadora();

        System.out.println("Sumar Enteros: "+  Sumar(2,1));
        System.out.println("Sumar Flotantes: "+  Sumar(1.9,0.1));
        System.out.println("Sumar Flot - int: "+  Sumar(1.9,1));
    }}