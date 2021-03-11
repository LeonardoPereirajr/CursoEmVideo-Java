/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investimento2;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author f6210949
 */
public class Investimento2
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        String input_valor, input_tipo;
        double valor, rendimento;
        int escolha;
        rendimento = 0;

        input_valor = JOptionPane.showInputDialog("Valor a ser investido:");

        valor = Double.parseDouble(input_valor);

        input_tipo = JOptionPane.showInputDialog("Tipo de Investimento" + " \n\n"
                + "1- Açőes" + "\n\n"
                + "2- Dolar" + "\n\n"
                + "3- Renda Fixa" + "\n\n"
                + "4- Poupança" + "\n\n"
                + "5- Titulos Públicos" + "\n\n");

        escolha = Integer.parseInt(input_tipo);

        switch (escolha)
        {

            case 1:
                rendimento = (valor * 13) / 100;
                break;

            case 2:
                rendimento = (valor * 20) / 100;
                break;

            case 3:
                rendimento = (valor * 7) / 100;
                break;

            case 4:
                rendimento = (valor * 3) / 100;
                break;

            case 5:
                rendimento = (valor * 5) / 100;
                break;

            default:
                JOptionPane.showMessageDialog(null, "Valor escolhido é invalido!!");

                System.exit(0);
        }
        if (valor < 500) {

            JOptionPane.showMessageDialog(null, "Năo é possível investir menos que R$ 500,00",
                    "ERRO", JOptionPane.INFORMATION_MESSAGE);

            System.exit(0);

        }

        DecimalFormat precisaoDupla = new DecimalFormat("0.00");

        precisaoDupla.format(rendimento);
        JOptionPane.showMessageDialog(null, "Seu rendimento será de: " + rendimento,
                "RENDIMENTO", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }

}
