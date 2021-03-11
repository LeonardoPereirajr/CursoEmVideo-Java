/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuprimeiroprograma;

import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Leo e Gi
 */
public class MeuPrimeiroPrograma
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println("Ola Mundo!");
        Date relogio = new Date();
        System.out.println("A hora agora é");
        System.out.println( relogio.toString());
        Locale loc= Locale.getDefault();
        System.out.println("O sistema é : " + loc.getDisplayLanguage());
                
// TODO code application logic here
    }
    
}
