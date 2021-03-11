
package triangulo;

import javax.swing.JOptionPane;


public class Triangulo
{

    public static void main(String[] args)
    {
       float ladod, ladoe, base; //declara notas1 como float
        
        String nome;
        ladoe = Integer.parseInt(JOptionPane.showInputDialog("Digite tamanho lado direito....: "));
        ladod = Integer.parseInt(JOptionPane.showInputDialog("Digite tamanho lado esquerdo...: "));
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite tamanho da base.........: "));
   
    if ((ladod<(ladoe+base)) && (ladoe<(ladod+base)) && (base<(ladod+ladoe)))
        
        if ((ladod==ladoe) && ( ladod==base))
            JOptionPane.showMessageDialog(null, " A figura é um triângulo equilatero");
        else if ((ladod==ladoe) || (ladoe==base) || (ladod==base))
            JOptionPane.showMessageDialog(null, " A figura é um triângulo isosceles");
        else 
           JOptionPane.showMessageDialog(null, " A figura é um triângulo escaleno");
        else
            JOptionPane.showMessageDialog(null, " Não é um triangulo");
    }    
}


