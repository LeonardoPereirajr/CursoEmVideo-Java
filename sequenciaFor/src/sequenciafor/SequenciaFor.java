/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequenciafor;

import javax.swing.JOptionPane;

/**
 *
 * @author Leo e Gi
 */
public class SequenciaFor
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int i;
        String mensagem = "";
        for (i = 10; i <= 300; i=i + 10)
        
        mensagem = mensagem + i + "-";
        JOptionPane.showMessageDialog(null, mensagem);
    
    }
        

}
