/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abccrescente;

import javax.swing.JOptionPane;

/**
 *
 * @author Leo e Gi
 */
public class AbcCrescente
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
      int a,b,c; //declara notas1 como float
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite valor de A....: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite valor de B...: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite valor de C.........: "));
        
        if ((a<=b)&&(a<=c))
            if (b<=c)
                JOptionPane.showMessageDialog(null," A ordem é"+a+ "-"+b+"-"+c);
        else
                JOptionPane.showMessageDialog(null," A ordem é"+a+ "-"+c+"-"+b);
        else if ((b<=a)&&(b<=c))
            if (a<=c)
                JOptionPane.showMessageDialog(null," A ordem é"+b+ "-"+a+"-"+c);
        else
            JOptionPane.showMessageDialog(null," A ordem é"+b+ "-"+c+"-"+a);
        else if (a<=b)
                JOptionPane.showMessageDialog(null," A ordem é"+c+ "-"+a+"-"+c);
        else
            JOptionPane.showMessageDialog(null," A ordem é"+c+ "-"+b+"-"+a);
    }
    
}
