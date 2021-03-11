package primowhile;
import javax.swing.JOptionPane;

public class PrimoWhile
{
    public static void main(String[] args)
    {
        int contador, numero,i;
        boolean num_primo;
        numero = 1;
        contador=0;  
        String escreva;
        escreva = "";
        while (contador < 10)
        {
            num_primo = true;
            numero = numero+1;
            i = 2;
            while ((i <= (numero / 2)) && (num_primo==true))
            {
                if (numero % i == 0)
                num_primo = false;
                i=i+1;
            }
            if (num_primo==true)
            {
                contador = contador+1;
                escreva = escreva + numero + " é o " + contador + " º numero primo \n";
            }
        }
        JOptionPane.showMessageDialog(null, escreva);
    }
}
