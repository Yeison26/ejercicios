/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;

public class Calculadora {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int option;

        do {
            option = option();
            int[] parameters = getParameters(option);
            operation(option, parameters);
        } while (option != 11);

    }

    public static int option() throws IOException {
        bw.write("\n\nSeleccione alguna de las siguientes opciones: \n1. Suma \n2. Resta \n3. Multiplicacion \n4. Division \n5. Modulo \n6. Factorial \n7. Exponente \n8. Seno \n9. Coseno \n10. Salir \n");
        bw.flush();
        int option = Integer.parseInt(br.readLine());
        return option;
    }

    public static int[] getParameters(int option) throws IOException {
        int[] parameters = null;
        switch (option) //sirve para realizar un menu sin nesecidad de volver a comenzar el programa 
        {
            case 1: //este caso es la suma
            {
                parameters = new int[2];
                bw.write("a continuacion se va a realizar una suma\n");
                bw.write("ingrese el primer numero:\n");
                bw.flush();
                parameters[0] = Integer.parseInt(br.readLine());
                bw.write("ingrese el segundo numero:\n");
                bw.flush();
                parameters[1] = Integer.parseInt(br.readLine());
            }
            break; //sirve para que finalizara el caso y que no siga sin darle a continuar
            case 2://este caso es la resta
            {
                parameters = new int[2];
                bw.write("a continuacion se va a realizar una resta\n");
                bw.write("ingrese el primer numero:\n");
                bw.flush();
                parameters[0] = Integer.parseInt(br.readLine());
                bw.write("ingrese el segundo numero:\n");
                bw.flush();
                parameters[1] = Integer.parseInt(br.readLine());
            }
            break;//sirve para que finalizara el caso y que no siga sin darle a continuar
            case 3://este caso es la multiplicacion
            {
                parameters = new int[2];
                bw.write("a continuacion se va a realizar una multiplicacion\n");
                bw.write("ingrese el primer numero:\n");
                bw.flush();
                parameters[0] = Integer.parseInt(br.readLine());
                bw.write("ingrese el segundo numero:\n");
                bw.flush();
                parameters[1] = Integer.parseInt(br.readLine());
            }
            break;//sirve para que finalizara el caso y que no siga sin darle a continuar
            case 4://este caso es la division
            {
                parameters = new int[2];
                bw.write("a continuacion se va a realizar una division\n");
                bw.write("ingrese el primer numero:\n");
                bw.flush();
                parameters[0] = Integer.parseInt(br.readLine());
                bw.write("ingrese el segundo numero:\n");
                bw.flush();
                parameters[1] = Integer.parseInt(br.readLine());
            }
            break;//sirve para que finalizara el caso y que no siga sin darle a continuar
            case 5://este caso es el modulo
            {
                parameters = new int[2];
                bw.write("a continuacion se va a realizar el modulo\n");
                bw.flush();
                bw.write("ingrese el primer numero:\n");
                bw.flush();
                parameters[0] = Integer.parseInt(br.readLine());
                bw.write("ingrese el segundo numero:\n");
                bw.flush();
                parameters[1] = Integer.parseInt(br.readLine());
            }
            break;//sirve para que finalizara el caso y que no siga sin darle a continuar
            case 6://este caso es el factorial
            {
                parameters = new int[1];
                bw.write("a continuacion se va a realizar el factorial\n");
                bw.flush();
                bw.write("ingrese el valor a calcular:\n");
                bw.flush();
                parameters[0] = Integer.parseInt(br.readLine());
            }
            break;//sirve para que finalizara el caso y que no siga sin darle a continuar
            case 7://este caso es un exponencial
            {
                parameters = new int[2];
                bw.write("a continuacion se va a realizar un exponencial\n");
                bw.write("ingrese el valor de la base:\n");
                bw.flush();
                parameters[0] = Integer.parseInt(br.readLine());
                bw.write("ingrese el valor del exponente:\n");
                bw.flush();
                parameters[1] = Integer.parseInt(br.readLine());
            }
            break;//sirve para que finalizara el caso y que no siga sin darle a continuar
            case 8://este caso es el seno
            {
                parameters = new int[1];
                bw.write("a continuacion se va a realizar el seno\n");
                bw.flush();
                parameters[0] = Integer.parseInt(br.readLine());
            }
            break;//sirve para que finalizara el caso y que no siga sin darle a continuar
            case 9://este caso es el coseno 
            {
                parameters = new int[1];
                bw.write("a continuacion se va a realizar el coseno\n");
                bw.flush();

            }
            break;//sirve para que finalizara el caso y que no siga sin darle a continuar
            /* case 10://este caso es la integral
		{
			parameters = new int [1];
			bw.write("a continuacion se va a realizar la integral\n");
			bw.flush();
			bw.write("ingrese el valor a calcular:\n");
			bw.flush();
			parameters[0]=Integer.parseInt(br.readLine());
		}
                break;//sirve para que finalizara el caso y que no siga sin darle a continuar
             */
            default: {
                System.exit(0);
            }
        }

        return parameters;
    }

    public static void operation(int option, int[] parameters) throws IOException {
        Operaciones operation = new Operaciones();

        switch (option)//sirve para realizar un menu sin nesecidad de volver a comenzar el programa 
        {
            case 1: //imprime el resultado de la suma
            {
                int result = operation.addition(parameters[0], parameters[1]);
                bw.write("El resultado de la suma es: " + result + "\n");
                bw.flush();
            }
            break;//sirve para que finalizara el caso y que no siga sin darle a continuar
            case 2://imprime el resultado de la resta
            {
                int result = operation.subtraction(parameters[0], parameters[1]);
                bw.write("El resultado de la resta es: " + result + "\n");
                bw.flush();
            }
            break;//sirve para que finalizara el caso y que no siga sin darle a continuar
            case 3://imprime el resultado de la multiplicacion
            {
                int result = operation.multiplication(parameters[0], parameters[1]);
                bw.write("El resultado de la multiplicacion es: " + result + "\n");
                bw.flush();
            }
            break;//sirve para que finalizara el caso y que no siga sin darle a continuar
            case 4://imprime el resultado de la division
            {

                double result = operation.division(parameters[0], parameters[1]);
                DecimalFormat df = new DecimalFormat("#0.000");
                if (result == Double.NaN) {
                    bw.write("la division por 0 no es posible.\n");
                    bw.flush();
                    //mensaje de error
                } else {
                    bw.write("El resultado de la division es: " + df.format(result) + "\n");
                    bw.flush();
                    //mostar el resutado
                }
            }
            break;//sirve para que finalizara el caso y que no siga sin darle a continuar
            case 5://imprime el resultado del modulo
            {
                double result = operation.residue(parameters[0], parameters[1]);
                bw.write("El resultado del residuo  es: " + result + "\n");
                bw.flush();
            }
            break;//sirve para que finalizara el caso y que no siga sin darle a continuar
            case 6://imprime el resultado del factorial
            {
                double result = operation.factorial(parameters[0]);
                bw.write("El resultado del factorial es: " + result + "\n");
                bw.flush();
            }
            break;//sirve para que finalizara el caso y que no siga sin darle a continuar
            case 7://imprime el resultado del exponencial
            {
                double result = operation.exponentiation(parameters[0], parameters[1]);
                bw.write("El resultado del exponencial es: " + result + "\n");
                bw.flush();
            }
            break;//sirve para que finalizara el caso y que no siga sin darle a continuar
            case 8://imprime el resultado del seno 
            {
                double result = operation.sin(parameters[0]);
                bw.write("listo" + "\n");
                bw.flush();
            }
            break;//sirve para que finalizara el caso y que no siga sin darle a continuar
            case 9://imprime el resultado del coseno
            {
                double result = operation.cos(parameters[0]);
                bw.write("listo" + "\n");
                bw.flush();
            }
            break; //sirve para que finalizara el caso y que no siga sin darle a continuar
            
            default: {
                System.exit(0); //con esto se termina la calculadora
            }
        }
    }
}
