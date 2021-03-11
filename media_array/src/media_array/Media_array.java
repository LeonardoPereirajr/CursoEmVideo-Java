
package media_array;

import javax.swing.JOptionPane;


public class Media_array
{

    public static void main(String[] args)
    {
      float notas [] = new float [5];  
      String textos = "Digite nota: "; //cria string texto para usar com JOption
      float calc_media, soma_notas =0;
      
      for (int i=0;i<4;i++)
      {
      notas[i] = Float.parseFloat(JOptionPane.showInputDialog("Entre com a "+i+ " nota"));
      soma_notas=soma_notas+notas[i];
      }
      calc_media=soma_notas/ 5;//calculo
      JOptionPane.showMessageDialog(null,"A media é : "+ calc_media); //mostra resultado
      
      String situacao = "";
      
      if (calc_media>=7)
          situacao = "Aluno Aprovado";
          
      else
          situacao =  "Aluno Reprovado, media menor que 7 ";
      JOptionPane.showMessageDialog(null,situacao);
    }
    
}
