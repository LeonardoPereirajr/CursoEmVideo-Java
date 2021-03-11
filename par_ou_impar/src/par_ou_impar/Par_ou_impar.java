
package par_ou_impar;

import java.util.Scanner;


public class Par_ou_impar 
{

 
    
    public static void main(String[] args) 
    {
      float numero;
      Scanner entrada = new Scanner (System.in); // cria string
      System.out.print("Entre com o Numero: ");
      numero = entrada.nextFloat();
      if((numero % 2) == 0)    
        System.out.println("O numero é par");  
      else   
      System.out.println("O numero é impar");  
    }
    
}
