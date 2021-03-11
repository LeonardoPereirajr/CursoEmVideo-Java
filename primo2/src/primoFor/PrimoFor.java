package primoFor;

public class PrimoFor
{

    public static void main(String[] args)
    {
        int count = 0;// DECLARA VARIAVEL CONTADOR COMO 0
        for (int i = 1; i <= 100; i++) //INICIA I COMO 1 E ATÉ QUE SEJA MENOR QUE 1000 SOMA 1 A ELE
        {
            for (int divisor = 1; divisor <= 100; divisor++) // inicia variaval divisor até 100
            {
                if (i % divisor == 0) // se um numero dividido pela variavel divisor restar 0 a varivel cont soma 1
                {
                    count++;
                }
            }
            if ((count > 2) || (count < 2)) // se a variavel count for maior ou menor que dois isto é a varivel i foi dividida por mais de dois numeros
            {
                // faz nada
            } else
            {
                System.out.println(i);//imprime o numero
            }
            count = 0; // variavel count reinicia
        }
    }
}
