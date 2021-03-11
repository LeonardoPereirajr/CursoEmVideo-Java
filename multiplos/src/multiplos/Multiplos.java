
package multiplos;

import java.util.Scanner;

public class Multiplos {

    public static void main(String[] args) 
    {
    float numero1;
    float numero2;
      Scanner entrada = new Scanner (System.in); // cria string
      System.out.print("Entre com o prineiro Numero: ");
      numero1 = entrada.nextFloat();
      System.out.print("Entre com o segundo Numero: ");
      numero2 = entrada.nextFloat();
      if((numero1 % numero2) == 0)    
        System.out.println("Os numeros multiplos");  
      else   
      System.out.println("Os numeros não são multiplos"); 
    }
    
}
