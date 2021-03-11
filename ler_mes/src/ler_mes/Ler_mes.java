package ler_mes;

/**
 *
 * @author f6210949
 */
import javax.swing.JOptionPane;
public class Ler_mes {

  
    public static void main(String[] args) 
    {
      double mes; //declara como double
      String ler_mes; //cria string 
           
      ler_mes = JOptionPane.showInputDialog("Digite o mês"); //pede mes       
      mes = Double.parseDouble(ler_mes); //salva nota
                 
      String situacao = "";
      if (mes==1)
          situacao = "JANEIRO";
      else if (mes==2)
          situacao =  "FEVEREIRO";
      else if (mes==3)
          situacao =  "MARCO";
      else if (mes==4)
          situacao =  "ABRIL";
      else if (mes==5)
          situacao =  "MAIO";
      else if (mes==6)
          situacao =  "JUNHO";
       else if (mes>6)
          situacao =  "MES SUPERIOR A JUNHO";
      JOptionPane.showMessageDialog(null,situacao);
      JOptionPane.showMessageDialog(null,"LEITURA DOS MESES FINALIZADA");         
    }
    
}
