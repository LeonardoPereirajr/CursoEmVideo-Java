package maior_menor_matriz;

import javax.swing.JOptionPane;

public class Maior_menor_matriz
{
    public static void main(String[] args)
    {
        int maior=0, menor=999999;
        int matriz[][] = new int [3][3];
        String mensagem = "";
        for (int l = 0 ; l <= 2 ; l++)
            for (int c = 0 ; c <= 2 ; c++)
            {
             matriz [l][c] = Integer.parseInt(JOptionPane.showInputDialog ("Digite o valot para matriz[ "+l+" ,"+c+"] .:"));
             mensagem = mensagem + " \n O valor de matriz[ "+l+" ,"+c+"] .:"+ matriz[l][c];
             if (matriz[l][c] > maior)
                 maior = matriz[l][c];
               if (matriz[l][c] < menor) 
                   menor = matriz[l][c];
                     
             }
            mensagem = mensagem + " \n O menor valor de matriz .:"+ menor;
            mensagem = mensagem + " \n O maior valor de matriz .:"+ maior;
                
            JOptionPane.showMessageDialog (null,mensagem);
        
        
    }
    
}
