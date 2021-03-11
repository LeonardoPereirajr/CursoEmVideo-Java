package primos;

import java.util.Scanner;

public class Primos
{//usando o FOR para identificar PRIMOS

    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);//CRIA STRING LEITOR PARA UTILIZAR
        System.out.printf("Digite um numero: ");
        int numero = leitor.nextInt();
        int contador = 0;
        for (int indice = 2; indice < numero; indice++)//inicializa variavel indice como 2 verifica se é menor que o numero digitado se sim soma 1
        {
        
            if (numero % indice == 0)//quando o numero digitado for maior que 2 ele cai aqui e o contador vira 1
            contador = 1;
        }
        if (contador == 0)
        {
            System.out.println("Este numero é primo");
        } 
        else //contador virando 1 indica que o numero não é primo
        {
            System.out.println("Este numero Nao primo");

        }
    }
}