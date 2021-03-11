
package exerciciorepita;
import javax.swing.JOptionPane;
public class ExercicioRepita
{
        
    public static void main(String[] args)
    {
        //JOptionPane.showMessageDialog(null, "Ola mundo", "Boas Vindas", JOptionPane.INFORMATION_MESSAGE);
        int n = 0,s=0, par =0,impar=0, maior=0,cont=1,media=0;
        do{
        n = Integer.parseInt(JOptionPane.showInputDialog("<html> Digite um numero: </br><em> (Valor 0 interrompe) </em> </html> "));    
        s+=n;
        cont=cont+1;
        media=s/cont;
        if (n%2==0){
            par+=n;
        } else{
            impar+=n;
        }
        if (n>=100){
            maior++;
        }
        }while (n!=0);
        
        JOptionPane.showMessageDialog(null, "Resultado Final \n ============ "+ " \n O somatorio é : "+ s + "\n O somatorio dos parese são : "+ par +
                "\n O somatorio dos impares são : "+ impar + "\n Numeros maiores que 100 : "+maior+ " \n A média é : " + media);
    }
    
}
