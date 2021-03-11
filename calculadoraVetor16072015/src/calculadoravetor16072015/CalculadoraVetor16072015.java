package calculadoravetor16072015;

import javax.swing.JOptionPane;

public class CalculadoraVetor16072015
{
    public static void main(String[] args)
    {
        int vetor5[] = {9,-6,7,8,-2};
        float soma=0, media=0;
        int i, iguais_maior=0, qto_pos=0, qto_neg=0;
        int perc_maior = 0;
        String mensagem = "";
                
        for (i=0;i<=4;i++)
            soma= soma + vetor5[i];
            media=soma/5;
            
        for (i=0;i<=4;i++)
        {
            if (vetor5[i]>media)
                    iguais_maior=iguais_maior+1;
            if (vetor5[i]>= 0)
                    qto_pos=qto_pos+1;
            else
                qto_neg = qto_neg+1;
            mensagem = mensagem + "O valor do vetor5["+i+"] =  "+vetor5[i]+"\n";
         } 
        perc_maior = (iguais_maior*100)/5;
        mensagem = mensagem + "\n\n A soma foi : " + soma + " \n a média é : " +media+"\n"+perc_maior+" % dos elementos são maiores que a media"+ 
                "\n " +iguais_maior+ " São maiores ou iguais a media  " + " \n "+qto_pos+ " são positivos "+"\n"+qto_neg+" são negativos"  ;
        JOptionPane.showMessageDialog(null,mensagem);
    }
}
