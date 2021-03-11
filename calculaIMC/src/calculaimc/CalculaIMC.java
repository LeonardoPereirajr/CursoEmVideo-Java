
package calculaimc;

import java.util.Scanner;

/**
 CALCULADORA DE IMC
 */
public class CalculaIMC
{
 
    public static void main(String[] args)
    {
    Scanner teclado = new Scanner (System.in); //declara variave scanner e insere dado de entrada "system.in"
     
    float peso;//declara variavel
    float altura;
    float indice;
     
    System.out.print(" Digite seu peso: ");
    peso = teclado.nextFloat();//armazerna primeiro valor
    System.out.print(" Digite sua altura: ");
    altura = teclado.nextFloat();//armazena segundo valor
    indice = peso/(altura*altura);
    System.out.print(" O seu IMC é...:  " +indice);
    
    if (indice>=30)
        System.out.printf(" Você esta com sobrepeso");
    if (indice>25)
        System.out.printf(" Você esta acima do peso");
    else
     if (indice>=18)
        System.out.printf(" Você esta Normal");
    if (indice<18)
        System.out.printf(" Você esta abaixo do peso");
    }
    
}
