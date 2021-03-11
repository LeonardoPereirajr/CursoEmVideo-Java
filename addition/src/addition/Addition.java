
package addition;

import java.util.Scanner; //utilizar classe scanner, biblioteca java
public class Addition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    Scanner input = new Scanner( System.in);//a variavel input é do tipo scanner e new ira criar o objeto scanner que lera as informação System.in
    
    int number1;//declara variavel1
    int number2;//decalra variavel2
    int sum; //declara varivel resultado da soma
    int multiplo;
    int subtrai;
    int divide;
    int media;
    
    System.out.print("Enter first integer:"); // pede primeiro numero
    number1 = input.nextInt();//recebe primeiro numero inteiro
    
    System.out.print("Enter second integer:");//pede segudno numero
    number2 = input.nextInt();//recebe segundo numero
    
    sum = number1 + number2;
    multiplo = number1 * number2;
    subtrai  = number1 - number2;
    divide = number1 / number2;
    media = (number1+number2)/2;
    
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
