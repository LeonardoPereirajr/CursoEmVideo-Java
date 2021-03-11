package modular_calculos;
import java.util.Scanner;


public class Modular_calculos
{
    static int number1,number2, sum, multiplo, subtrai, divide, media;
    public static void main(String[] args)
    {
       leitura();
       calculo();
       impressao();
    }

public static void leitura()
{
    Scanner input = new Scanner( System.in);//a variavel input é do tipo scanner e new ira criar o objeto scanner que lera as informação System.in
    System.out.print("Enter first integer:"); // pede primeiro numero
    number1 = input.nextInt();//recebe primeiro numero inteiro
    System.out.print("Enter second integer:");//pede segudno numero
    number2 = input.nextInt();//recebe segundo numero
}
 
public static void calculo()
{
    sum = number1 + number2;
    multiplo = number1 * number2;
    subtrai  = number1 - number2;
    divide = number1 / number2;
    media = (number1+number2)/2;
}
public static void impressao()
{
    System.out.printf(" A soma é : %d\n", sum);
    System.out.printf(" A multiplicação dos numeros é : %d\n", multiplo);
    System.out.printf(" A subtração dos numeros é : %d\n", subtrai);
    System.out.printf(" A divisão dos numeros é : %d\n", divide);
    System.out.printf(" A média dos numeros é : %d\n", media);
    
    if (number1>number2)
        System.out.println(" O primeiro numero é maior que o segundo");
    else if(number1<number2)
        System.out.println(" O primeiro numero é menor que o segundo");
    else
        System.out.println(" O numero são iguais");
 }
}   



