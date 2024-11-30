package org.figueroa.poosobrecarga;

public class Calculadora {

    //creamos constructor privado
    private Calculadora(){}
    public int Sumar (int a, int b){
        return a + b;
    }

    //VarArgs
    //Si son mas argumentos de 3 invoca este argumento
    public static int Sumar(int ... argumentos){
        int total =0;
        for (int i: argumentos){
            total+=i;
        }

        return total;
    }

    public static float Sumar(float a, float b){
        return a + b;
    }

    public static float Sumar(float a, int b){
        return a + b;
    }

    public static double Sumar (double a, double b){
        return a + b;
    }

    public static int Sumar (String a, String b){
        return  Integer.parseInt(a) + Integer.parseInt(b);
    }
}
