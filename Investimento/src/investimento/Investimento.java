/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investimento;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author f6210949
 */
public class Investimento
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        double valorTotal, vrInvestido, taxaJuros, rendimento;
        int numeroAnos, ano;
        String input_vrInvestido, input_taxaJuros, input_numeroAnos;
        
        input_vrInvestido = JOptionPane.showInputDialog(
                "Entre com o valor a investir: ");

        input_taxaJuros = JOptionPane.showInputDialog(
                "Entre com a taxa de juros anual (no formato 0.00): ");

        input_numeroAnos = JOptionPane.showInputDialog(
                "Investimento por quantos anos? : ");

        vrInvestido = Double.parseDouble(input_vrInvestido);

        taxaJuros = Double.parseDouble(input_taxaJuros);

        numeroAnos = Integer.parseInt(input_numeroAnos);

        DecimalFormat precisionTwo = new DecimalFormat("0.00");

        JTextArea outputTextArea = new JTextArea();

        outputTextArea.append("Ano \t Valor Total Depositado \n\n");

        for (ano = 1; ano <= numeroAnos; ano++){

            valorTotal = vrInvestido * Math.pow(1 + taxaJuros, ano);

            outputTextArea.append(ano + "\t" + precisionTwo.format(valorTotal) + "\n");

        }

        JOptionPane.showMessageDialog(
                null, outputTextArea, "Resultado da Aplicacao",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }

}
