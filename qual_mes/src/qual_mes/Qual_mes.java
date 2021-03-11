package qual_mes;

import javax.swing.JOptionPane;

public class Qual_mes 
{

    public static void main(String[] args) 
    {
    String texto = "Digite o mes";
    int mes = 3;
    
    switch(mes)
    {              
    case 1 : System.out.println("Janeiro");break;
    case 2 : System.out.println("Fevereiro");break;
    case 3 : System.out.println("Marco");break;
    default: System.out.println("Mes inexistente");   
    }
           
    
    }
}
