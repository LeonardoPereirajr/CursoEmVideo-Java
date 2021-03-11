/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paresate10;

import javax.swing.JOptionPane;

/**
 *
 * @author Leo e Gi
 */
public class ParesAte10
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int numero=1, conta_pares=0;
        String mensagem = "";
        while (conta_pares<10)
        {
            if (numero%2==0)
            {
            mensagem = mensagem + "O numero "+ numero + " = par \n";
            conta_pares=conta_pares+1;
            }        
        numero = numero+1;
        }
        JOptionPane.showMessageDialog(null, mensagem);
        
    }
}
