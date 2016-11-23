package playhangman;

import java.util.ArrayList;
import java.util.Random;

public class PrincipalV extends javax.swing.JFrame {
    private Random x = new Random();
    private final ArrayList<Palabra> Lista;
    public static ArrayList<Palabra> SeleccionLista = new ArrayList<>();
    private ConsultasPalabras New;
    public PrincipalV() {
        initComponents();
        this.setTitle("HANGMAN - Start Menu");
        this.setLocation(50, 0);
        txt_Usuario.setText(ConsultasBD.UsuarioLogin.getUsuario());
        txt_mail.setText(ConsultasBD.UsuarioLogin.getCorreo());
        actualizaPuntos();
        this.New = new ConsultasPalabras();
        Lista = New.consultarLista();
        for(int i= 0; i < 30; i++){
            Palabra Newx = Lista.get(i);
            SeleccionLista.add(Newx);
            desordenarLista();
        }
    }

    public void actualizaPuntos(){
        txt_puntos.setText(Integer.toString(ConsultasBD.UsuarioLogin.getPuntos()));
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_Usuario = new javax.swing.JLabel();
        txt_mail = new javax.swing.JLabel();
        txt_puntos = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        Hangman = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 100));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 100, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 60, 27));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Score:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 60, 27));

        txt_Usuario.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txt_Usuario.setForeground(new java.awt.Color(255, 255, 255));
        txt_Usuario.setText("Usuario");
        getContentPane().add(txt_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 180, 27));

        txt_mail.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txt_mail.setForeground(new java.awt.Color(255, 255, 255));
        txt_mail.setText("Email");
        getContentPane().add(txt_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 260, 27));

        txt_puntos.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_puntos.setForeground(new java.awt.Color(255, 255, 255));
        txt_puntos.setText("Score");
        getContentPane().add(txt_puntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, 50, 27));

        jToggleButton2.setFont(new java.awt.Font("Plok", 1, 24)); // NOI18N
        jToggleButton2.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/novato.png"))); // NOI18N
        jToggleButton2.setText("NORMAL");
        jToggleButton2.setBorderPainted(false);
        jToggleButton2.setContentAreaFilled(false);
        jToggleButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 350, 141));

        Hangman.setFont(new java.awt.Font("Plok", 1, 24)); // NOI18N
        Hangman.setForeground(new java.awt.Color(255, 255, 255));
        Hangman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/extremo.png"))); // NOI18N
        Hangman.setText("Hard");
        Hangman.setBorderPainted(false);
        Hangman.setContentAreaFilled(false);
        Hangman.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Hangman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HangmanMouseClicked(evt);
            }
        });
        getContentPane().add(Hangman, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 300, -1));

        jLabel4.setFont(new java.awt.Font("SimLLHP", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Select category");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, 50));

        jComboBox1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fruits and verdure", "Animals", "Home", "School", "Office" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 200, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 0));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Salir.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 600, 140, 100));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Regresar.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                jLabel5ComponentRemoved(evt);
            }
        });
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 50, 100, 80));

        jLabel8.setFont(new java.awt.Font("SimLLHP", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("User Information");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, -1, -1));

        jLabel9.setFont(new java.awt.Font("SimLLHP", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Select Difficulty");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MenuInicio.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        SeleccionLista.clear();
        if(jComboBox1.getSelectedIndex() == 0){
            for(int i= 0; i < 30; i++)
                SeleccionLista.add(Lista.get(i));
        }
        if(jComboBox1.getSelectedIndex() == 1){
            for(int i= 30; i < 60; i++)
                SeleccionLista.add(Lista.get(i));
        } 
        if(jComboBox1.getSelectedIndex() == 2){
            for(int i= 60; i < 70; i++)
                SeleccionLista.add(Lista.get(i));
        } 
        if(jComboBox1.getSelectedIndex() == 3){
            for(int i= 70; i < 85; i++)
                SeleccionLista.add(Lista.get(i));
        } 
        if(jComboBox1.getSelectedIndex() == 4){
            for(int i= 85; i < 100; i++)
                SeleccionLista.add(Lista.get(i));
        } 
        desordenarLista();
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jToggleButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton2MouseClicked
        desordenarLista();
        Ordenamiento m = new Ordenamiento();
        m.setVisible(true);
    }//GEN-LAST:event_jToggleButton2MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        actualizaPuntos();
        LogIn_SignUp.ok.update();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5ComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jLabel5ComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5ComponentRemoved

    private void HangmanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HangmanMouseClicked
        desordenarLista();
        Hangman m  = new Hangman();
        m.setVisible(true);
    }//GEN-LAST:event_HangmanMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        LogIn_SignUp.ok.update();
        LogIn_SignUp m  = new LogIn_SignUp();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel6MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Hangman;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JLabel txt_Usuario;
    private javax.swing.JLabel txt_mail;
    private javax.swing.JLabel txt_puntos;
    // End of variables declaration//GEN-END:variables

    private void desordenarLista() {
        for(int i=0; i<15; i++){
            int a = x.nextInt(SeleccionLista.size()),
                b = x.nextInt(SeleccionLista.size());
            Palabra Auxa = SeleccionLista.get(a),
                    Auxb = SeleccionLista.get(b);
            SeleccionLista.remove(a);
            SeleccionLista.add(a,Auxb);
            SeleccionLista.remove(b);
            SeleccionLista.add(b,Auxa);
        }
    }
}
