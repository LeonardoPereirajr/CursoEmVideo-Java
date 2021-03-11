package primosBoolean;

import java.util.Scanner;

public class PrimosBoolean
{

    public static void main(String[] args)
    {

        int indice = 2;
        boolean e_primo = true;
        {
            Scanner leitor = new Scanner(System.in);
            System.out.printf("Digite um numero: ");
            int num = leitor.nextInt();
            {
                while ((indice < (num/2))&&(e_primo))
                {
                    if (num % indice == 0)
                    {
                        e_primo = false;
                    }
                    indice++;

                }
                if (e_primo)
                {
                    System.out.printf("O numero " + num + " é primo");
                } else
                {
                    System.out.printf("O numero " + num + " não é primo");
                }

            }

        }
    }
}
