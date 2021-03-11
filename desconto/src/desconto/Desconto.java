package desconto;

import javax.swing.JOptionPane;

/**
 * Compra até 200 ganha 10%, maior que 200 e menor que 500 ganha 15%,acima de
 * 500 ganha 20% ler o nome do cliente tambem
 *
 */
public class Desconto
{

    public static void main(String[] args)
    {
        float valor, desconto1, desconto2, desconto3, valor_final; //declara notas1 como float
        desconto1 = 10;
        desconto2 = 15;
        desconto3 = 20;

        String nome;
        nome = JOptionPane.showInputDialog("Digite o NOOME do cliente...: ");
        valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da compra...: "));
        if (valor >= 500)
        {
        valor_final = valor - ((desconto3 * valor) / 100);
        JOptionPane.showMessageDialog(null, " O cliente " + nome + " Ira pagar " + valor_final + " e recebeu " + desconto3 + " % de desconto");
        }
        if (valor < 500&& valor>200)
        {
            valor_final = valor - ((desconto2 * valor) / 100);
            JOptionPane.showMessageDialog(null, " O cliente " + nome + " Ira pagar " + valor_final + " e recebeu " + desconto2 + " % de desconto");
        }    
        if (valor <= 200)
        {
            valor_final = valor - ((desconto1 * valor) / 100);
            JOptionPane.showMessageDialog(null, " O cliente " + nome + " Ira pagar " + valor_final + " e recebeu " + desconto1 + " % de desconto");
        }    
    }
}
