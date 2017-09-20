/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author YEISON ASDRUBAL
 */
class cosx {

   public double cosenox(double valor){
       
       int cont=1;
       double potencia1=2;
       double potencia2=4;
       double y;
       double sumapositiva=0.0;
       double sumanegativa=0.0;
       
       factorial fact = new factorial();
       do{
        
        sumapositiva=sumapositiva-(Math.pow(valor, potencia1))/fact.calcula_factorial(potencia1);
        potencia1+=4;
        sumanegativa=sumanegativa+(Math.pow(valor, potencia2))/fact.calcula_factorial(potencia2);
        potencia2+=4;
        cont++;
       }while(cont <4);
       y=1+sumapositiva+sumanegativa;
       return y;
   }
    
}
