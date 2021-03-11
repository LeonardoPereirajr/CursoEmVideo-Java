package primo_arraylist;

public class Primo_arraylist
{
    public static void main(String[] args)
    {
        int count = 0;// DECLARA VARIAVEL CONTADOR COMO 0
        for (int i = 1; i <= 100; i++) // para 1 =1 enquanto 1 menor ou igual a 100 some 1 ao numero
            {
            for (int divisor = 1; divisor <= 100; divisor++) // inicia variaval divisor até 100
                {
                if (i % divisor == 0) // se um numero dividido pela variavel divisor restar 0 a varivel cont soma 1
                {
                    float primo [] = new float[101]; // inicia vetor primo e declara ele com 101 posições
                    count++; // variavel coount sendo acrecentada no loop
                    primo[i]=count; // informa que a posição i do vetor é count
                }
            }
            if ((count > 2) || (count < 2)) // se a variavel count for maior ou menor que dois isto é a varivel i foi dividida por mais de dois numeros
            
            {
            //nao faz nada
            } 
            else
            {
            System.out.println(i);// imprime o primo
            }
            count=0; // zera a variavel count
            }
    }
}
    