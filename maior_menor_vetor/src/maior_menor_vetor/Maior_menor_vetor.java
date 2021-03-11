
package maior_menor_vetor;

import javax.swing.JOptionPane;
public class Maior_menor_vetor
{
    public static void main(String[] args)
    {
        int maior_menor [] = {2,3,7,8,5,9,1,0,6,4};
        int i, maior=0, menor=0;
             
        for (i=0;i<=9;i++)
        {   
        if (maior_menor[i]>maior)
                maior= maior_menor[i];
        if (maior_menor[i]<menor)
            menor = maior_menor[i];
        }
        JOptionPane.showMessageDialog(null,"O maior valor é " +maior);
     
    }
    
}
