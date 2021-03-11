

package troca_valores;  

import javax.swing.JOptionPane;
public class Troca_valores
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
    int A, B, auxiliar;
    A = 5;
    B = 10;
    JOptionPane.showMessageDialog(null,"Antes era: \nA = "+A+" \nB = "+B);
    auxiliar = A;
    A = B;
    B = auxiliar;
    JOptionPane.showMessageDialog(null,"Antes era: \nA = "+A+" \nB = "+B);
               
    }
    
}
