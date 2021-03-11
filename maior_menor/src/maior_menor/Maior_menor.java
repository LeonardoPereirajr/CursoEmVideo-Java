package maior_menor;

import javax.swing.JOptionPane;

public class Maior_menor
{

    public static void main(String[] args)
    {
        int n1, n2, n3; //declara notas1 
        String mensagem = " ";
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para N1.. :"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para N2.. :"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para N3.. :"));

        if ((n1 >= n2) && (n1 >= n3))
        {
        mensagem = mensagem + " O Maior é o : " + n1;
        if ((n2 >= n1) && (n2 >= n3))
        mensagem = mensagem + " O Maior é o : " + n2;
        else
        mensagem = mensagem + " O Maior é o : " + n3;
        }
        
        if ((n1 <= n2) && (n1 <= n3))
        {
        mensagem = mensagem + " O Menor é o : " + n1;
        if ((n2 <= n1) && (n2 <= n3))
        mensagem = mensagem + " O Menor é o : " + n2;
        else
        mensagem = mensagem + " O Menor é o : " + n3;
        
        }
    JOptionPane.showMessageDialog (null,mensagem);    
    }     
}