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
class factorial {
    public int calcula_factorial(double n){
    int f=1;
    for(int i=1; i<=n; i++){
    
      f=f*i;
    }
      return f;
    }
}
