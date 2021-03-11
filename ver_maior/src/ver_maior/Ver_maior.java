package ver_maior;

import java.util.Scanner; // chama o pacote util scanner

public class Ver_maior {

    public static void main(String[] args) 
    {
     Scanner input = new Scanner (System.in); //declara variave scanner e insere dado de entrada "system.in"
     
    int numero1;//declara variavel
    int numero2;
    int numero3;
    int numero4;
    int numero5;
            
     
    System.out.print(" Entre com o primeiro numero: ");
    numero1 = input.nextInt();//armazerna primeiro valor
    System.out.print(" Entre com o segundo numero: ");
    numero2 = input.nextInt();//armazena segundo valor
    System.out.print(" Entre com o terceiro numero: ");
    numero3 = input.nextInt();
    System.out.print(" Entre com o quarto numero: ");
    numero4 = input.nextInt();
    System.out.print(" Entre com o quinto numero: ");
    numero5 = input.nextInt();
     
    
    
    if (numero1>numero2)
        System.out.printf(" Numero maior é: ", numero1);
    if (numero1!=numero2)
        System.out.printf(" %d!=%d\n", numero1, numero2);
    if (numero1<numero2)
        System.out.printf(" %d<%d\n", numero1, numero2);
    if (numero1>numero2)
        System.out.printf(" %d>%d \n", numero1, numero2);
    if (numero1<=numero2)
        System.out.printf(" %d<=%d \n", numero1, numero2);
    if (numero1>=numero2)
        System.out.printf(" %d>=%d \n", numero1, numero2);   
        
    }
    
}
