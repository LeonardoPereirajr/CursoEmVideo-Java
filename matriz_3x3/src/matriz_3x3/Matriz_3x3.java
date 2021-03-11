package matriz_3x3;

import javax.swing.JOptionPane;

public class Matriz_3x3
{
     public static void main(String[] args)
    {
        int matriz[][] = new int [3][3];
        String mensagem = "";
        for (int l = 0 ; l <= 2 ; l++)
            for (int c = 0 ; c <= 2 ; c++)
            {
             matriz [l][c] = Integer.parseInt(JOptionPane.showInputDialog ("Digite o valot para matriz[ "+l+" ,"+c+"] .:"));
             mensagem = mensagem + " \n O valor de matriz[ "+l+" ,"+c+"] .:"+ matriz[l][c];
             }
            JOptionPane.showMessageDialog (null,mensagem);
    }
     
}
