/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salario;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author f6210949
 */
public class Salario
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        double shora, htrab, sbruto, inss, sliq;
        String resposta, input_shora, input_htrab, output;
        int resp;
        do{

            inss = 0;

            sliq = 0;

            input_shora = JOptionPane.showInputDialog(
                    "Quanto o funcionario ganha por hora?");

            input_htrab = JOptionPane.showInputDialog(
                    "Quantas horas o funcionario trabalhou no mes?");

            shora = Double.parseDouble(input_shora);

            htrab = Double.parseDouble(input_htrab);

            sbruto = shora * htrab;

            if (sbruto < 500)
            {

                inss = (sbruto * 8) / 100;

            }

            if (sbruto >= 500 && sbruto <= 1000)
            {

                inss = (sbruto * 9) / 100;

            }

            if (sbruto > 1000)
            {

                inss = (sbruto * 10) / 100;

            }

            sliq = sbruto - inss;

            DecimalFormat twoDigits = new DecimalFormat("0.00");

            output = "Salario Bruto........: " + twoDigits.format(sbruto)
                    + "\nDesconto do INSS: " + twoDigits.format(inss)
                    + "\nSalario Liquido......: " + twoDigits.format(sliq);

            JOptionPane.showMessageDialog(null, output,
                    "Resultado dos calculos", JOptionPane.INFORMATION_MESSAGE);

            resposta = JOptionPane.showInputDialog("EFETUA OUTRO CALCULO S/N?<1=S > ");

                 resp = Integer.parseInt(resposta);

        } while (resp == 1);

        System.exit(0);

    }

}
