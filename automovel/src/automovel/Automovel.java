package automovel;

import javax.swing.JOptionPane;

public class Automovel
{

    public static void main(String[] args)
    {
        float custo_fabrica, perc_vend, impostos, preco_final; //declara notas1 como double
        custo_fabrica = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do automovel...: "));
        perc_vend = (25 * custo_fabrica) / 100;
        impostos = (45 * custo_fabrica) / 100;
        preco_final = (custo_fabrica + perc_vend + impostos);
        JOptionPane.showMessageDialog(null, "\n Custo de fabrica : " + custo_fabrica
                + "\n Percentual do revendedor : " + perc_vend
                + "\n Impostos : " + impostos
                + "\n preço final : " + preco_final);

    }
}
