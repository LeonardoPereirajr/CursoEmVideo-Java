
package exemplovetor_primo2;

public class Exemplovetor_primo2
{

    public static void main(String[] args)
    {
        int numero[] = new int[100]; //inicia vetor e informar que ele tem 100 posiçoes
        int contador = 1; // inicia variavel contador como 1 (depois será acrescido)
        for (int i = 0; i < numero.length; i++) //para o i iniciando em 0 enquanto este i for menor que "numero" acrescentar 1 a ele
        {      
        numero[i] = contador++;  //na posição i colocar o valor da variavel contador neste momento  
 
        boolean primo = true;   //inicia a variavel primo como true   
        for (int divisor = 2; divisor < numero[i]; divisor++) //para o divisor iniciando em 2 enquanto este divisor for menor que "numero" acrescentar 1 a ele
        {  
        if (numero[i] % divisor == 0) // se o numero informardo didivido pelo divisor no momento restar 0 então não será primo
        {  
        primo = false;      
        break;      
        }      
        }      
        if (primo == true) // ou (primo == true) 
        {      
        System.out.println(numero[i] + " é primo e foi anexado a posição : "+i+ " no vetor " );// mostra mensagem na tela
        contador=contador++;// soma 1 ao contador para ser refeito o loop
        }      
        }
    }  
}
