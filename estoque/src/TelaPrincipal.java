
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import utilitarios.beans_threads;
import utilitarios.data;
import Cadastros.cad_cidades;


public class TelaPrincipal extends javax.swing.JFrame
{

    data mostra_data;
    //String seta_look="com.birisoft.liquid.LiquidLookAndFell";
    public TelaPrincipal()
    {
        initComponents();
        mostra_data = new data();
        mostra_data.le_data();
        label_data.setText( " Dia de hoje :  "+mostra_data.dia+" Mês > "+mostra_data.mes+"< Dia da semana > "+mostra_data.dia_semana);
        mostra_data.le_hora();
        label_hora.setText(mostra_data.hora);
        
        timer1.start();
      //  lookandfeel();
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        timer1 = new org.netbeans.examples.lib.timerbean.Timer();
        jPanel1 = new javax.swing.JPanel();
        botao_clientes = new javax.swing.JButton();
        botao_cidades = new javax.swing.JButton();
        botao_bairros = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label_data = new javax.swing.JLabel();
        label_hora = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_cadastro = new javax.swing.JMenu();
        Clientes = new javax.swing.JMenu();
        Funcionarios = new javax.swing.JMenu();
        Cargo = new javax.swing.JMenu();
        Cidades = new javax.swing.JMenu();
        Cidade = new javax.swing.JMenu();
        Bairro = new javax.swing.JMenu();
        Fornencedores = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Estoque = new javax.swing.JMenu();
        Implantacao = new javax.swing.JMenuItem();
        Entrada = new javax.swing.JMenuItem();
        Saida = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        Sair = new javax.swing.JMenu();
        menu_consultas = new javax.swing.JMenu();
        menu_relatorios = new javax.swing.JMenu();
        menu_utilitarios = new javax.swing.JMenu();
        threads = new javax.swing.JMenuItem();
        jMenuItem1_windows = new javax.swing.JMenuItem();
        jMenuItem2_liquid = new javax.swing.JMenuItem();
        jMenuItem3_metal = new javax.swing.JMenuItem();
        jMenuItem4_CDEMOTIF = new javax.swing.JMenuItem();
        menu_sair = new javax.swing.JMenu();

        timer1.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener()
        {
            public void onTime(java.awt.event.ActionEvent evt)
            {
                timer1OnTime(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA PARA CONTROLE DE ESTOQUE");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        botao_clientes.setText("CLIENTES");
        botao_clientes.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                botao_clientesActionPerformed(evt);
            }
        });

        botao_cidades.setText("CIDADES");
        botao_cidades.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                botao_cidadesActionPerformed(evt);
            }
        });

        botao_bairros.setText("BAIRROS");

        jButton4.setText("SAIR");
        jButton4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(botao_clientes)
                .addGap(36, 36, 36)
                .addComponent(botao_cidades, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(botao_bairros, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao_bairros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao_cidades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao_clientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("Criado por: Leonardo Pereira - 24/07/2015");

        menu_cadastro.setMnemonic('c');
        menu_cadastro.setText("Cadastro");

        Clientes.setMnemonic('l');
        Clientes.setText("Clientes");
        menu_cadastro.add(Clientes);

        Funcionarios.setMnemonic('f');
        Funcionarios.setText("Funcionarios");
        menu_cadastro.add(Funcionarios);

        Cargo.setMnemonic('g');
        Cargo.setText("Cargo");
        menu_cadastro.add(Cargo);

        Cidades.setMnemonic('s');
        Cidades.setText("Cidades");
        menu_cadastro.add(Cidades);

        Cidade.setMnemonic('d');
        Cidade.setText("Cidade");
        menu_cadastro.add(Cidade);

        Bairro.setMnemonic('r');
        Bairro.setText("Bairro");
        menu_cadastro.add(Bairro);

        Fornencedores.setMnemonic('o');
        Fornencedores.setText("Fornecedores");
        menu_cadastro.add(Fornencedores);
        menu_cadastro.add(jSeparator1);

        Estoque.setMnemonic('q');
        Estoque.setText("Estoque");

        Implantacao.setText("Implantacao");
        Implantacao.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ImplantacaoActionPerformed(evt);
            }
        });
        Estoque.add(Implantacao);

        Entrada.setText("Entrada");
        Estoque.add(Entrada);

        Saida.setText("Saida");
        Estoque.add(Saida);

        menu_cadastro.add(Estoque);
        menu_cadastro.add(jSeparator2);

        Sair.setMnemonic('i');
        Sair.setText("Sair");
        menu_cadastro.add(Sair);

        jMenuBar1.add(menu_cadastro);

        menu_consultas.setMnemonic('n');
        menu_consultas.setText("Consultas");
        jMenuBar1.add(menu_consultas);

        menu_relatorios.setMnemonic('r');
        menu_relatorios.setText("Relatórios");
        jMenuBar1.add(menu_relatorios);

        menu_utilitarios.setMnemonic('u');
        menu_utilitarios.setText("Utilitarios");

        threads.setText("Threads");
        threads.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                threadsActionPerformed(evt);
            }
        });
        menu_utilitarios.add(threads);

        jMenuItem1_windows.setText("Look anf feel - Windows");
        jMenuItem1_windows.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem1_windowsActionPerformed(evt);
            }
        });
        menu_utilitarios.add(jMenuItem1_windows);

        jMenuItem2_liquid.setText("Look anf feel - Liquid");
        jMenuItem2_liquid.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem2_liquidActionPerformed(evt);
            }
        });
        menu_utilitarios.add(jMenuItem2_liquid);

        jMenuItem3_metal.setText("Look anf feel - Metal");
        jMenuItem3_metal.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem3_metalActionPerformed(evt);
            }
        });
        menu_utilitarios.add(jMenuItem3_metal);

        jMenuItem4_CDEMOTIF.setText("Look anf feel  - CDE MOTIF");
        jMenuItem4_CDEMOTIF.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem4_CDEMOTIFActionPerformed(evt);
            }
        });
        menu_utilitarios.add(jMenuItem4_CDEMOTIF);

        jMenuBar1.add(menu_utilitarios);

        menu_sair.setMnemonic('s');
        menu_sair.setText("SAIR");
        menu_sair.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                menu_sairMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_sair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(678, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_data)
                .addGap(311, 311, 311))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_hora)
                .addGap(185, 185, 185))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(label_hora))
                .addGap(18, 18, 18)
                .addComponent(label_data)
                .addGap(17, 17, 17))
        );

        setBounds(500, 200, 704, 525);
    }// </editor-fold>//GEN-END:initComponents

    private void ImplantacaoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ImplantacaoActionPerformed
    {//GEN-HEADEREND:event_ImplantacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImplantacaoActionPerformed

    private void botao_clientesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_botao_clientesActionPerformed
    {//GEN-HEADEREND:event_botao_clientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botao_clientesActionPerformed

    private void timer1OnTime(java.awt.event.ActionEvent evt)//GEN-FIRST:event_timer1OnTime
    {//GEN-HEADEREND:event_timer1OnTime
        mostra_data.le_hora();
        label_hora.setText("Hora Atual "+mostra_data.hora);        // TODO add your handling code here:
    }//GEN-LAST:event_timer1OnTime

    private void botao_cidadesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_botao_cidadesActionPerformed
    {//GEN-HEADEREND:event_botao_cidadesActionPerformed
    new cad_cidades().show();               // TODO add your handling code here:
    }//GEN-LAST:event_botao_cidadesActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton4ActionPerformed
    {//GEN-HEADEREND:event_jButton4ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void menu_sairMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_menu_sairMouseClicked
    {//GEN-HEADEREND:event_menu_sairMouseClicked
        System.exit(0); // TODO add your handling code here:
    }//GEN-LAST:event_menu_sairMouseClicked

    private void jMenuItem1_windowsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem1_windowsActionPerformed
    {//GEN-HEADEREND:event_jMenuItem1_windowsActionPerformed
        
       // seta_look = "com.sun.java.swing.plaf.windows.WindowsLookAndFell";
        //lookandfeel();
    
    }//GEN-LAST:event_jMenuItem1_windowsActionPerformed

    private void jMenuItem3_metalActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem3_metalActionPerformed
    {//GEN-HEADEREND:event_jMenuItem3_metalActionPerformed
       //seta_look = "com.sun.java.swing.plaf.metal.MetalLookAndFell";
       //lookandfeel(); // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3_metalActionPerformed

    private void jMenuItem2_liquidActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem2_liquidActionPerformed
    {//GEN-HEADEREND:event_jMenuItem2_liquidActionPerformed
       //seta_look = "com.birisoft.liquid.LiquidLookAndFell";
       //lookandfeel(); // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2_liquidActionPerformed

    private void jMenuItem4_CDEMOTIFActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem4_CDEMOTIFActionPerformed
    {//GEN-HEADEREND:event_jMenuItem4_CDEMOTIFActionPerformed
       //seta_look = "com.sun.java.swing.plaf.motif.MotifLookAndFell";
       //lookandfeel(); // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4_CDEMOTIFActionPerformed

    private void threadsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_threadsActionPerformed
    {//GEN-HEADEREND:event_threadsActionPerformed
    new beans_threads().show();        // TODO add your handling code here:
    }//GEN-LAST:event_threadsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Bairro;
    private javax.swing.JMenu Cargo;
    private javax.swing.JMenu Cidade;
    private javax.swing.JMenu Cidades;
    private javax.swing.JMenu Clientes;
    private javax.swing.JMenuItem Entrada;
    private javax.swing.JMenu Estoque;
    private javax.swing.JMenu Fornencedores;
    private javax.swing.JMenu Funcionarios;
    private javax.swing.JMenuItem Implantacao;
    private javax.swing.JMenuItem Saida;
    private javax.swing.JMenu Sair;
    private javax.swing.JButton botao_bairros;
    private javax.swing.JButton botao_cidades;
    private javax.swing.JButton botao_clientes;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1_windows;
    private javax.swing.JMenuItem jMenuItem2_liquid;
    private javax.swing.JMenuItem jMenuItem3_metal;
    private javax.swing.JMenuItem jMenuItem4_CDEMOTIF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel label_data;
    private javax.swing.JLabel label_hora;
    private javax.swing.JMenu menu_cadastro;
    private javax.swing.JMenu menu_consultas;
    private javax.swing.JMenu menu_relatorios;
    private javax.swing.JMenu menu_sair;
    private javax.swing.JMenu menu_utilitarios;
    private javax.swing.JMenuItem threads;
    private org.netbeans.examples.lib.timerbean.Timer timer1;
    // End of variables declaration//GEN-END:variables


  /*  public void lookandfeel()
    {
         try
        {
            UIManager.setLookAndFeel(seta_look);
            SwingUtilities.updateComponentTreeUI(this);
        }
        catch(Exception erro) 
        {
           JOptionPane.showMessageDialog(null,erro);
        }
    }
*/
}
