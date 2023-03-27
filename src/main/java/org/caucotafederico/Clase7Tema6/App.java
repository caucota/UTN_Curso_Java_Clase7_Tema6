package org.caucotafederico.Clase7Tema6;

import org.caucotafederico.Clase7Tema6.Entities.Calculadora;

public class App 
{
    public static void main( String[] args )
    {
        Double a = 4.0;
        Double b = 5.0;
        System.out.println(Calculadora.sumar(a,b));
        System.out.println(Calculadora.restar(a,b));
        System.out.println(Calculadora.multiplicar(a,b));
        System.out.println(Calculadora.dividir(a,b));
    }
}
