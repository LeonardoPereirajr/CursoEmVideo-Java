/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olamundojavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

/**
 *
 * @author Leo e Gi
 */
public class FXMLDocumentController implements Initializable
{
    
    @FXML
    private Label lblmensagem;
    @FXML
    private Button btnclick;
    @FXML
    private Font x1;
    
    @FXML
    private void clicouBotao(ActionEvent event)
    {
        lblmensagem.setText("OLA MUNDO!");
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }    
    
}
