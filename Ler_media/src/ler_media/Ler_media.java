package ler_media;

/**
 *
 * @author Leo e Gi
 */
import javax.swing.*;
public class Ler_media {

    public static void main(String[] args) 
           {
      String textos = "Digite nota: "; //cria string texto para usar com JOption
      double notas1; //declara notas1 como double
      double notas2;
      double calc_media; 
      String ler_nota1; //cria string 
      String ler_nota2;
      
      ler_nota1 = JOptionPane.showInputDialog("Entre com a nota"); //pede nota       
      notas1 = Double.parseDouble(ler_nota1); //salva nota
      ler_nota2 = JOptionPane.showInputDialog("Entre com a nota");        
      notas2 = Double.parseDouble(ler_nota2);
      
      calc_media=(notas1+notas2)/ 2;//calculo
      JOptionPane.showMessageDialog(null,"A media é : "+ calc_media); //mostra resultado
      String situacao = "";
      if (calc_media>=7)
          situacao = "Aluno Aprovado";
      else
          situacao =  "Aluno Reprovado, media menor que 7 ";
      JOptionPane.showMessageDialog(null,situacao);
      
         }
        }
    

