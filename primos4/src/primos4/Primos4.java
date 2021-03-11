package primos4;

import javax.swing.JOptionPane;

public class Primos4
{

    public static void main(String[] args)
    {
        int numero, contador, i;
        contador = 0;
        i = 2;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        while (i < numero)
        {
            if (numero % i == 0)
            contador = contador + 1;
            i = i + 1;
        }
        if (contador > 0)
            JOptionPane.showMessageDialog(null, "O numero " + numero + " não é primo");
        else
           JOptionPane.showMessageDialog(null, "O numero " + numero + " é primo");
        
    }
}
