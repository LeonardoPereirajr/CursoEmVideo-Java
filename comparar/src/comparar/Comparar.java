
package comparar;

/**
 *
 * @author Leonardo 01/07 13:44
 */
import java.util.Scanner; // chama o pacote util scanner
public class Comparar {


    public static void main(String[] args) 
    {
     Scanner input = new Scanner (System.in); //declara variave scanner e insere dado de entrada "system.in"
     
    int numero1;//declara variavel
    int numero2;//declara variavel
     
    System.out.print(" Entre com o primeiro numero: ");
    numero1 = input.nextInt();//armazerna primeiro valor
    System.out.print(" Entre com o segundo numero: ");
    numero2 = input.nextInt();//armazena segundo valor
     
    if (numero1==numero2)
        System.out.printf(" %d==%d\n", numero1, numero2);
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
