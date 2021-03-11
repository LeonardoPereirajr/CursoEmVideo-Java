package exer_maior;

import java.util.Scanner; // importa biblioteca scanner para ser utlizada

public class Exer_maior 
{

    public static void main(String[] args) 
    {
    float maior_numero; //declara variavel 
    float menor_numero=1; //declara e inicializa variavel
    float numero;
    int contador = 0 ;
    
    Scanner entrada = new Scanner (System.in); // cria string
    
    System.out.print("Entre com o Numero: ");//solicita dado ao usuario
    numero = entrada.nextFloat();//le o dado
    maior_numero=numero;//grava o dado
    menor_numero=numero;
    
    while (contador<4) //inicia laço de repetição até 5
    {
    System.out.print("Entre com o proximo Numero: ");
    numero = entrada.nextFloat();
    
    if (numero>maior_numero)// condicional maior
    {
    maior_numero=numero;
     
    }
    if (numero<menor_numero)// condicional menor
    {
        menor_numero=numero;
    }
           contador=contador+1;
                    
    }
    System.out.println("O maior numero digitado foi: " + maior_numero);//mostra resultado
    System.out.println("O menor numero digitado foi: " + menor_numero);//mostra resultado
        }
}
 
    

