package org.caucotafederico.Clase7Tema6;

import org.caucotafederico.Clase7Tema6.Entities.Calculadora;

public class App 
{
    public static void main( String[] args )
    {
        Calculadora calcu = new Calculadora();
        double a = 4.0;
        double b = 5.0;
        System.out.println(calcu.sumar(a,b));
        System.out.println(calcu.restar(a,b));
        System.out.println(calcu.multiplicar(a,b));
        System.out.println(calcu.dividir(a,b));
    }
}
