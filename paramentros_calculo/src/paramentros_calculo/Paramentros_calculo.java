
package paramentros_calculo;

import java.util.Scanner;

public class Paramentros_calculo
{
    static float pn1,pn2, sum, multiplo, subtrai, divide, media;
    public static void main(String[] args)
    {
       leitura();
       calculo(pn1,pn2);
       impressao(sum, multiplo,divide,subtrai,media);
    }

public static void leitura()
{
    Scanner input = new Scanner( System.in);//a variavel input é do tipo scanner e new ira criar o objeto scanner que lera as informação System.in
    System.out.print("Digite o primeiro numero :"); // pede primeiro numero
    pn1 = input.nextInt();//recebe primeiro numero inteiro
    System.out.print("Digite o segundo numero :");//pede segudno numero
    pn2 = input.nextInt();//recebe segundo numero
}
 
public static void calculo(float pn1, float pn2)
{
    sum = pn1 + pn2;
    multiplo = pn1 * pn2;
    divide = pn1 / pn2;
    subtrai  = pn1 - pn2;
    media = (pn1+pn2)/2;
}
public static void impressao(float soma , float multi, float div, float sub, float med )
{
    System.out.printf(" A soma é : "+ soma);
    System.out.printf("\n A multiplicação dos numeros é : "+ multi);
    System.out.printf("\n A divisão dos numeros é : "+ div);
    System.out.printf("\n A subtração dos numeros é : "+ sub);
    System.out.printf("\n A média dos numeros é : "+ med);
    
    if (pn1>pn2)
        System.out.println(" O primeiro numero é maior que o segundo");
    else if(pn1<pn2)
        System.out.println(" O primeiro numero é menor que o segundo");
    else
        System.out.println(" O numero são iguais");
 }
}   
