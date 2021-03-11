
package contanumero;

import java.util.Scanner;

/**
 *
 * @author Leo e Gi
 */
public class ContaNumero
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int num,s=0;
        String resp = "";
        Scanner teclado = new Scanner(System.in);
        do {
        System.out.println("Digite um numero : ");
        num = teclado.nextInt();
        s+=num;
        System.out.println("Quer continuar? s/n");
        resp = teclado.next();
        } while (resp.equals("s"));
        System.out.println("A soma é : "+s);
    }
    
}
