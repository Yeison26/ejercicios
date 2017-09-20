/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 * Descripcion: // menu para operar las siguientes funciones
 *
 * @author Administrador
 */
public class Operaciones {

    public void operaciones() {
    }

    public int addition(int num1, int num2) {

        return num1 + num2;

    }

    public int subtraction(int num1, int num2) {

        return num1 - num2;
    }

    public int multiplication(int num1, int num2) {

        return num1 * num2;
    }

    public double division(int num1, int num2) {
        if (num2 != 0) {
            return num1 / num2;
        }

        return 0;
    }

    public double residue(int num1, int num2) {

        return num1 % num2;
    }

    public int factorial(int num) {
        if (num < 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    public int exponentiation(int base, int exponent) {
        if (exponent == 1) {
            return base;
        } else {
            if (exponent == 0) {
                return 1;
            } else {
                if (exponent > 1) {
                    return multiplication(base, exponentiation(base, exponent - 1));
                } else {
                    return (1 / exponentiation(base, multiplication(exponent, (-1))));
                }
            }
        }
    }

    public double sin(int numero) {

        double sen = 0;
        double x = 0;

        Scanner ingreso = new Scanner(System.in);
        System.out.println("ingrese la base");
        x = Double.parseDouble(ingreso.nextLine());
        System.out.println("ingrese el numero de terminos");
        numero = Integer.parseInt(ingreso.nextLine());

        int i = 1;
        while (i <= numero) {
            int fact = 1;
            int j = 1;

            while (j <= (1 + (2 * (i - 1)))) {
                fact = fact * j;
                j++;
            }
            if (i % 2 == 0) {
                sen = sen - (Math.pow(x, (1 + (2 * (i - 1)))) / fact);
            } else {
                sen = sen + (Math.pow(x, (1 + (2 * (i - 1)))) / fact);
            }
            i++;
        }
        System.out.println("El seno de " + x + " es " + sen);
        return Math.sin(x);

    }

    public double cos(int number1) {

        double x, y;
        cosx coseno = new cosx();
        Scanner valor = new Scanner(System.in);
        System.out.println("digite el valor ");
        double g = valor.nextDouble();
        x = g * 3.141592 / 180.0;
        y = coseno.cosenox(x);
        System.out.println("cos(" + g + ")=" + y);

        return Math.cosh(x);
    }

}
    

   

    


