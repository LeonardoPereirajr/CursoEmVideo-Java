
package form_vazio;

import javax.swing.JFrame;
import java.awt.*;


public class Form_vazio extends JFrame
{
Form_vazio()

{
setTitle("Meu primeiro formulario");
setSize(800,600);
}  
    public static void main(String[] args)
    {
        JFrame janela  = new Form_vazio();
        janela.show();
    }
}   
