package exemplovetor_primo;
public class Exemplovetor_primo
{
    public static void main(String[] args)
    {
    int[] numeros = {1,2,3,4,5,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};

        for(int i=0; i<numeros [22]; i++)
        {
            if(numeroPrimo(numeros[i]))
            {
                System.out.printf(+ numeros[i] + "-" );
            } 
            else 
            {
               
            }
        }
    }

    public static boolean numeroPrimo(int numero)
    {

        boolean numeroPrimo = false;
        int contador=0;

        for(int i=1; i<=numero; i++)
        {
            if(numero%i==0)
            {
                contador++;
            }
        }

        if(contador == 2)
        {
            numeroPrimo = true;
        }

        return numeroPrimo;
    }    
}
