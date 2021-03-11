package IMC_comOptionPane;

import javax.swing.JOptionPane;

public class IMC_comOptionPane
{

    public static void main(String[] args)
    {
        float peso, altura, indice; //declara notas1 como float
        peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o seu peso...: "));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Digite o sua altura...: "));
        indice = peso / (altura * altura);

        if (indice >= 30)
        {
            JOptionPane.showMessageDialog(null, " Seu indice é : " + indice + " Voce esta com sobrepeso");
        }
        if (indice > 25 && indice < 29)
        {
            JOptionPane.showMessageDialog(null, " Seu indice é : " + indice + " Voce esta acima da média");
        }
        if (indice > 18 && indice < 24)
        {
            JOptionPane.showMessageDialog(null, " Seu indice é : " + indice + " Seu Peso esta normal");
        }
        if (indice < 18)
        {
            JOptionPane.showMessageDialog(null, " Seu indice é : " + indice + " Voce esta abaixo do peso");
        }

    }
}
