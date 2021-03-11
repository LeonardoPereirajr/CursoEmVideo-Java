package matriz_4x4;

import javax.swing.JOptionPane;

public class Matriz_4x4
{
    /* Cria matriz 4x4 ; pedir os valores; mostra a soma ; calcula a media; mostra elementos da diagonal principal; mostra
    *  elementos da diagonal secundaria; mostra elementos da linha 3 , mostra elementos da coluna 2, calcula quantos são pares
    *  mostra quantos são maiores que a media. Cria uma nova matriz usa os numeros da primeira multiplicado por 2
    */
    public static void main(String[] args)
    {
        int matriz[][] = new int[4][4];
        int matriznova [][]=new int [4][4];
        int soma = 0, media  = 0, cont = 0, conta_pares = 0, maior = 0, maior_que_media = 0;
        String pos_maior = "", mensagem = "", mensagem_matriz_nova = "";
        for (int l = 0; l <= 3; l++)
        
            for (int c = 0; c <= 3; c++)
            {   
                matriz[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para matriz[ " + l + " ," + c + "] .:"));
                mensagem = mensagem + " \n O valor de matriz[ " + l + " ," + c + "] .:" + matriz[l][c];
                soma = soma + matriz[l][c];
                matriznova[l][c] = matriz[l][c]*2; // cria matriz nova e multiplica os elementos da primeira salvando nesta
                mensagem_matriz_nova = mensagem_matriz_nova + " \n O valor de matriznova[ " + l + " ," + c + "] .:" + matriznova[l][c];
                cont= cont+1; //VARIAVEL "CONT" PARA UTILIZAR NO CALCULO DA MEDIA
                media = soma/cont;
                // VERIFICA QUAL O MAIOR ELEMENTO E A POSIÇÃO                
                if (matriz[l][c] > maior)
                {
                    maior = matriz[l][c];
                    pos_maior = " matriz["+l+"]["+c+"]";
                }
                // VERIFICA SE É PAR                                   
                if (matriz[l][c] % 2==0)
                {
                conta_pares++;
                }
            } // fim do segundo FOR
                for (int l = 0; l <= 3; l++)
                    for (int c = 0; c <= 3; c++)
               
                if (matriz[l][c] > media)
                maior_que_media++;
                            
        JOptionPane.showMessageDialog(null, mensagem);
        JOptionPane.showMessageDialog(null, "A soma dos numeros da matriz é equivalente á : " +soma+
                                            " \n A media dos numeros da matriz é equivalente á : " +media+
                                            " \n Na diagonal principal temos os numeros : " + matriz[0][0]+"-"+ matriz[1][1]+"-"+ matriz[2][2]+"-"+matriz[3][3]+
                                            " \n Na diagonal secundaria temos os numeros : " + matriz[3][0]+"-"+ matriz[2][1]+"-"+ matriz[1][2]+"-"+matriz[0][3]+
                                            " \n Na linha 3 temos os numeros : " + matriz[2][0]+"-"+ matriz[2][1]+"-"+ matriz[2][2]+"-"+matriz[2][3]+
                                            " \n Na coluna 2 temos os numeros : " + matriz[0][1]+"-"+ matriz[1][1]+"-"+ matriz[2][1]+"-"+matriz[3][1]+
                                            " \n O maior elemento é : " + maior+ " E sua posição é : "+ pos_maior + "\n" + mensagem_matriz_nova+ "\n" + 
                                            conta_pares + " elementos são pares"+ "\n"+ maior_que_media + " Elementos são maiores que a média. ");
        
        }// fim do public
        
    }//fim da classe 4x4
