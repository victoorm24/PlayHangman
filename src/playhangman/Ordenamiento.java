package playhangman;

import java.awt.Image;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Ordenamiento extends javax.swing.JFrame {
    private int Pos = 0;
    private Random x = new Random();
    private String formar;
    private int failure = 0;

    
    public Ordenamiento() {
        initComponents();
        this.setTitle("HANGMAN - Level Normal ");
        this.setLocation(50, 0);
        OrdenamientoLetras();
        jLPuntos.setText(Integer.toString(ConsultasBD.UsuarioLogin.getPuntos()));
        monitoVasMriendo();
    }

    public void monitoVasMriendo(){
        try {
            ImageIcon Icono = new javax.swing.ImageIcon(getClass().getResource("/Persona/" + Integer.toString(failure) + ".png"));
            Icon icono = new javax.swing.ImageIcon(Icono.getImage().getScaledInstance(318, 303, Image.SCALE_DEFAULT));
            jLHorca.setIcon(icono);
        } catch (Exception e) {
        }
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLo2 = new javax.swing.JLabel();
        jLo1 = new javax.swing.JLabel();
        jLo4 = new javax.swing.JLabel();
        jLo3 = new javax.swing.JLabel();
        jLo6 = new javax.swing.JLabel();
        jLo5 = new javax.swing.JLabel();
        jLo12 = new javax.swing.JLabel();
        jLo11 = new javax.swing.JLabel();
        jLo8 = new javax.swing.JLabel();
        jLo7 = new javax.swing.JLabel();
        jLo10 = new javax.swing.JLabel();
        jLo9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        j6 = new javax.swing.JLabel();
        j5 = new javax.swing.JLabel();
        j12 = new javax.swing.JLabel();
        j11 = new javax.swing.JLabel();
        j8 = new javax.swing.JLabel();
        j2 = new javax.swing.JLabel();
        j7 = new javax.swing.JLabel();
        j1 = new javax.swing.JLabel();
        j10 = new javax.swing.JLabel();
        j4 = new javax.swing.JLabel();
        j9 = new javax.swing.JLabel();
        j3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLImagen = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLPuntos = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLHorca = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 100));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SimLLHP", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Regresar.gif"))); // NOI18N
        jLabel1.setText("Return to the start menu");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 320, 80));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Derecha.gif"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 520, -1, 60));

        jLo2.setFont(new java.awt.Font("SimLLHP", 1, 48)); // NOI18N
        jLo2.setForeground(java.awt.Color.red);
        jLo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLo2.setText("?");
        getContentPane().add(jLo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 50, 49));

        jLo1.setFont(new java.awt.Font("SimLLHP", 1, 48)); // NOI18N
        jLo1.setForeground(java.awt.Color.red);
        jLo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLo1.setText("?");
        getContentPane().add(jLo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 50, 49));

        jLo4.setFont(new java.awt.Font("SimLLHP", 1, 48)); // NOI18N
        jLo4.setForeground(java.awt.Color.red);
        jLo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLo4.setText("?");
        getContentPane().add(jLo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 50, 49));

        jLo3.setFont(new java.awt.Font("SimLLHP", 1, 48)); // NOI18N
        jLo3.setForeground(java.awt.Color.red);
        jLo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLo3.setText("?");
        getContentPane().add(jLo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 50, 49));

        jLo6.setFont(new java.awt.Font("SimLLHP", 1, 48)); // NOI18N
        jLo6.setForeground(java.awt.Color.red);
        jLo6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLo6.setText("?");
        getContentPane().add(jLo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 50, 49));

        jLo5.setFont(new java.awt.Font("SimLLHP", 1, 48)); // NOI18N
        jLo5.setForeground(java.awt.Color.red);
        jLo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLo5.setText("?");
        getContentPane().add(jLo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 50, 49));

        jLo12.setFont(new java.awt.Font("SimLLHP", 1, 48)); // NOI18N
        jLo12.setForeground(java.awt.Color.red);
        jLo12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLo12.setText("?");
        getContentPane().add(jLo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 100, 50, 49));

        jLo11.setFont(new java.awt.Font("SimLLHP", 1, 48)); // NOI18N
        jLo11.setForeground(java.awt.Color.red);
        jLo11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLo11.setText("?");
        getContentPane().add(jLo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 100, 50, 49));

        jLo8.setFont(new java.awt.Font("SimLLHP", 1, 48)); // NOI18N
        jLo8.setForeground(java.awt.Color.red);
        jLo8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLo8.setText("?");
        getContentPane().add(jLo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 50, 49));

        jLo7.setFont(new java.awt.Font("SimLLHP", 1, 48)); // NOI18N
        jLo7.setForeground(java.awt.Color.red);
        jLo7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLo7.setText("?");
        getContentPane().add(jLo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 50, 49));

        jLo10.setFont(new java.awt.Font("SimLLHP", 1, 48)); // NOI18N
        jLo10.setForeground(java.awt.Color.red);
        jLo10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLo10.setText("?");
        getContentPane().add(jLo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, 50, 49));

        jLo9.setFont(new java.awt.Font("SimLLHP", 1, 48)); // NOI18N
        jLo9.setForeground(java.awt.Color.red);
        jLo9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLo9.setText("?");
        getContentPane().add(jLo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 50, 49));

        jLabel3.setFont(new java.awt.Font("Plok", 1, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.red);
        jLabel3.setText("Management of words");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, 30));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Select the corresponding letter");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, 30));

        j6.setBackground(new java.awt.Color(204, 255, 255));
        j6.setFont(new java.awt.Font("Aparajita", 0, 48)); // NOI18N
        j6.setForeground(new java.awt.Color(255, 255, 255));
        j6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j6.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red, 2));
        j6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j6MouseClicked(evt);
            }
        });
        getContentPane().add(j6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 50, 49));

        j5.setBackground(new java.awt.Color(204, 255, 255));
        j5.setFont(new java.awt.Font("Aparajita", 0, 48)); // NOI18N
        j5.setForeground(new java.awt.Color(255, 255, 255));
        j5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j5.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red, 2));
        j5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j5MouseClicked(evt);
            }
        });
        getContentPane().add(j5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 50, 49));

        j12.setBackground(new java.awt.Color(204, 255, 255));
        j12.setFont(new java.awt.Font("Aparajita", 0, 48)); // NOI18N
        j12.setForeground(new java.awt.Color(255, 255, 255));
        j12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j12.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red, 2));
        j12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j12MouseClicked(evt);
            }
        });
        getContentPane().add(j12, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 260, 50, 49));

        j11.setBackground(new java.awt.Color(204, 255, 255));
        j11.setFont(new java.awt.Font("Aparajita", 0, 48)); // NOI18N
        j11.setForeground(new java.awt.Color(255, 255, 255));
        j11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j11.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red, 2));
        j11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j11MouseClicked(evt);
            }
        });
        getContentPane().add(j11, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 260, 50, 49));

        j8.setBackground(new java.awt.Color(204, 255, 255));
        j8.setFont(new java.awt.Font("Aparajita", 0, 48)); // NOI18N
        j8.setForeground(new java.awt.Color(255, 255, 255));
        j8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j8.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red, 2));
        j8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j8MouseClicked(evt);
            }
        });
        j8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j8KeyPressed(evt);
            }
        });
        getContentPane().add(j8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 50, 49));

        j2.setBackground(new java.awt.Color(204, 255, 255));
        j2.setFont(new java.awt.Font("Aparajita", 0, 48)); // NOI18N
        j2.setForeground(new java.awt.Color(255, 255, 255));
        j2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j2.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red, 2));
        j2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j2MouseClicked(evt);
            }
        });
        getContentPane().add(j2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 50, 49));

        j7.setBackground(new java.awt.Color(204, 255, 255));
        j7.setFont(new java.awt.Font("Aparajita", 0, 48)); // NOI18N
        j7.setForeground(new java.awt.Color(255, 255, 255));
        j7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j7.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red, 2));
        j7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j7MouseClicked(evt);
            }
        });
        getContentPane().add(j7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 50, 49));

        j1.setBackground(new java.awt.Color(204, 255, 255));
        j1.setFont(new java.awt.Font("Aparajita", 0, 48)); // NOI18N
        j1.setForeground(new java.awt.Color(255, 255, 255));
        j1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j1.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red, 2));
        j1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j1MouseClicked(evt);
            }
        });
        getContentPane().add(j1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 50, 49));

        j10.setBackground(new java.awt.Color(204, 255, 255));
        j10.setFont(new java.awt.Font("Aparajita", 0, 48)); // NOI18N
        j10.setForeground(new java.awt.Color(255, 255, 255));
        j10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j10.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red, 2));
        j10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j10MouseClicked(evt);
            }
        });
        getContentPane().add(j10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 260, 50, 49));

        j4.setBackground(new java.awt.Color(204, 255, 255));
        j4.setFont(new java.awt.Font("Aparajita", 0, 48)); // NOI18N
        j4.setForeground(new java.awt.Color(255, 255, 255));
        j4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j4.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red, 2));
        j4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j4MouseClicked(evt);
            }
        });
        getContentPane().add(j4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 50, 49));

        j9.setBackground(new java.awt.Color(204, 255, 255));
        j9.setFont(new java.awt.Font("Aparajita", 0, 48)); // NOI18N
        j9.setForeground(new java.awt.Color(255, 255, 255));
        j9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j9.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red, 2));
        j9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j9MouseClicked(evt);
            }
        });
        getContentPane().add(j9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 50, 49));

        j3.setBackground(new java.awt.Color(204, 255, 255));
        j3.setFont(new java.awt.Font("Aparajita", 0, 48)); // NOI18N
        j3.setForeground(new java.awt.Color(255, 255, 255));
        j3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j3.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red, 2));
        j3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j3MouseClicked(evt);
            }
        });
        getContentPane().add(j3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 50, 49));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ordena las letras que describen la siguiente imagen");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 470, 40));

        jLImagen.setForeground(new java.awt.Color(255, 255, 255));
        jLImagen.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, java.awt.Color.red));
        getContentPane().add(jLImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 240, 190));

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton1.setText("Confirm");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 470, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Score:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 40, 80, -1));

        jLPuntos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLPuntos.setForeground(java.awt.Color.red);
        jLPuntos.setText("Puntos");
        getContentPane().add(jLPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 40, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Izquierda.gif"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 520, 60, 60));

        jLHorca.setForeground(new java.awt.Color(255, 255, 255));
        jLHorca.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, java.awt.Color.red));
        getContentPane().add(jLHorca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 318, 303));

        jLabel32.setFont(new java.awt.Font("SimLLHP", 1, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("THE Hangman");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 660, 130, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Ordenamiento.jpg"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red, 2));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 4, 990, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        OrdenamientoLetras();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void j1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j1MouseClicked
        if (j1.getText().compareTo(" ") != 0) {
            formar += j1.getText();
            j1.setVisible(false);
            ejecutaSeleccion();
        }
    }//GEN-LAST:event_j1MouseClicked

    private void j2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j2MouseClicked
        if (j2.getText().compareTo(" ") != 0) {
            formar += j2.getText();
            j2.setVisible(false);
            ejecutaSeleccion();
        }
    }//GEN-LAST:event_j2MouseClicked

    private void j3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j3MouseClicked
        if (j3.getText().compareTo(" ") != 0) {
            formar += j3.getText();
            j3.setVisible(false);
            ejecutaSeleccion();
        }
    }//GEN-LAST:event_j3MouseClicked

    private void j4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j4MouseClicked
        if (j4.getText().compareTo(" ") != 0) {
            formar += j4.getText();
            j4.setVisible(false);
            ejecutaSeleccion();
        }
    }//GEN-LAST:event_j4MouseClicked

    private void j5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j5MouseClicked
        if (j5.getText().compareTo(" ") != 0) {
            formar += j5.getText();
            j5.setVisible(false);
            ejecutaSeleccion();
        }
    }//GEN-LAST:event_j5MouseClicked

    private void j6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j6MouseClicked
        if (j6.getText().compareTo(" ") != 0) {
            formar += j6.getText();
            j6.setVisible(false);
            ejecutaSeleccion();
        }
    }//GEN-LAST:event_j6MouseClicked

    private void j7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j7MouseClicked
        if (j7.getText().compareTo(" ") != 0) {
            formar += j7.getText();
            j7.setVisible(false);
            ejecutaSeleccion();
        }
    }//GEN-LAST:event_j7MouseClicked

    private void j8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j8KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_j8KeyPressed

    private void j8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j8MouseClicked
        if (j8.getText().compareTo(" ") != 0) {
            formar += j8.getText();
            j8.setVisible(false);
            ejecutaSeleccion();
        }
    }//GEN-LAST:event_j8MouseClicked

    private void j9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j9MouseClicked
        if (j9.getText().compareTo(" ") != 0) {
            formar += j9.getText();
            j9.setVisible(false);
            ejecutaSeleccion();
        }
    }//GEN-LAST:event_j9MouseClicked

    private void j10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j10MouseClicked
        if (j10.getText().compareTo(" ") != 0) {
            formar += j10.getText();
            j10.setVisible(false);
            ejecutaSeleccion();
        }
    }//GEN-LAST:event_j10MouseClicked

    private void j11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j11MouseClicked
        if (j11.getText().compareTo(" ") != 0) {
            formar += j11.getText();
            j11.setVisible(false);
            ejecutaSeleccion();
        }
    }//GEN-LAST:event_j11MouseClicked

    private void j12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j12MouseClicked
        if (j12.getText().compareTo(" ") != 0) {
            formar += j12.getText();
            j12.setVisible(false);
            ejecutaSeleccion();
        }
    }//GEN-LAST:event_j12MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if(PrincipalV.SeleccionLista.get(Pos-1).getIng().compareTo(formar) == 0){
            Sonidos.ganador.play();
            JOptionPane.showMessageDialog(null, "Felicidades has ganado un punto");
            ConsultasBD.UsuarioLogin.setPuntos(1);
            jLPuntos.setText(Integer.toString(ConsultasBD.UsuarioLogin.getPuntos()));
        } else {
            if(failure == 6){
                failure = 0;
                this.setVisible(false);
                return;
            }
            Sonidos.perdedor.play();
            failure ++;
            monitoVasMriendo();
            JOptionPane.showMessageDialog(null, "Sigue intentando");         
        }
        OrdenamientoLetras();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        Pos -=1;
        OrdenamientoLetras();
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(Ordenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ordenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ordenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ordenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ordenamiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel j1;
    private javax.swing.JLabel j10;
    private javax.swing.JLabel j11;
    private javax.swing.JLabel j12;
    private javax.swing.JLabel j2;
    private javax.swing.JLabel j3;
    private javax.swing.JLabel j4;
    private javax.swing.JLabel j5;
    private javax.swing.JLabel j6;
    private javax.swing.JLabel j7;
    private javax.swing.JLabel j8;
    private javax.swing.JLabel j9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLHorca;
    private javax.swing.JLabel jLImagen;
    private javax.swing.JLabel jLPuntos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLo1;
    private javax.swing.JLabel jLo10;
    private javax.swing.JLabel jLo11;
    private javax.swing.JLabel jLo12;
    private javax.swing.JLabel jLo2;
    private javax.swing.JLabel jLo3;
    private javax.swing.JLabel jLo4;
    private javax.swing.JLabel jLo5;
    private javax.swing.JLabel jLo6;
    private javax.swing.JLabel jLo7;
    private javax.swing.JLabel jLo8;
    private javax.swing.JLabel jLo9;
    // End of variables declaration//GEN-END:variables

    private void OrdenamientoLetras() {
        jLo1.setText("?");
        jLo2.setText("?");
        jLo3.setText("?");
        jLo4.setText("?");
        jLo5.setText("?");
        jLo6.setText("?");
        jLo7.setText("?");
        jLo8.setText("?");
        jLo9.setText("?");
        jLo10.setText("?");
        jLo11.setText("?");
        jLo12.setText("?");
        j1.setVisible(true);
        j2.setVisible(true);
        j3.setVisible(true);
        j4.setVisible(true);
        j5.setVisible(true);
        j6.setVisible(true);
        j7.setVisible(true);
        j8.setVisible(true);
        j9.setVisible(true);
        j10.setVisible(true);
        j11.setVisible(true);
        j12.setVisible(true);
        formar = "";
        if(Pos == PrincipalV.SeleccionLista.size()){
            Pos = 0;
            JOptionPane.showMessageDialog(null,"FELICIDADES HAS COMPLETADO LA CATEGORIA PORFAVOR SELECIONA OTRA");
            this.setVisible(false);
        }
        String palabra = PrincipalV.SeleccionLista.get(Pos).getIng();
        Pos++;
        int [] orden = new int[12];
        for(int i= 0; i<12; i++)
            orden[i] = i;
        for(int i= 0; i<5; i++){
            int a = x.nextInt(palabra.length());
            int b = x.nextInt(palabra.length());
            int Auxa = orden[a], Auxb = orden[b];
            orden[a] = Auxb;
            orden[b] = Auxa;
        }
        while(palabra.length()!= 12){
            palabra += " ";
        }
        j1.setText(palabra.substring(orden[0],orden[0]+1));
        j2.setText(palabra.substring(orden[1],orden[1]+1));
        j3.setText(palabra.substring(orden[2],orden[2]+1));
        j4.setText(palabra.substring(orden[3],orden[3]+1));
        j5.setText(palabra.substring(orden[4],orden[4]+1));
        j6.setText(palabra.substring(orden[5],orden[5]+1));
        j7.setText(palabra.substring(orden[6],orden[6]+1));
        j8.setText(palabra.substring(orden[7],orden[7]+1));
        j9.setText(palabra.substring(orden[8],orden[8]+1));
        j10.setText(palabra.substring(orden[9],orden[9]+1));
        j11.setText(palabra.substring(orden[10],orden[10]+1));
        j12.setText(palabra.substring(orden[11],orden[11]+1));
        try {
            javax.swing.ImageIcon Icono = new javax.swing.ImageIcon(getClass().getResource("/imagenes/" + PrincipalV.SeleccionLista.get(Pos-1).getEsp() + ".jpg"));
            jLImagen.setIcon(Icono);
            javax.swing.Icon icono = new javax.swing.ImageIcon(Icono.getImage().getScaledInstance(240, 190, java.awt.Image.SCALE_DEFAULT));
            jLImagen.setIcon(icono);
        } catch (Exception e) {
            jLImagen.setIcon(null);
            jLImagen.setText(PrincipalV.SeleccionLista.get(Pos-1).getEsp());
        }
    }

    private void ejecutaSeleccion() {
        if(formar.length() == 1)
            jLo1.setText(formar.substring(formar.length()-1,formar.length()));
        else if(formar.length() == 2)
            jLo2.setText(formar.substring(formar.length()-1,formar.length()));
        else if(formar.length() == 3)
            jLo3.setText(formar.substring(formar.length()-1,formar.length()));
        else if(formar.length() == 4)
            jLo4.setText(formar.substring(formar.length()-1,formar.length()));
        else if(formar.length() == 5)
            jLo5.setText(formar.substring(formar.length()-1,formar.length()));
        else if(formar.length() == 6)
            jLo6.setText(formar.substring(formar.length()-1,formar.length()));
        else if(formar.length() == 7)
            jLo7.setText(formar.substring(formar.length()-1,formar.length()));
        else if(formar.length() == 8)
            jLo8.setText(formar.substring(formar.length()-1,formar.length()));
        else if(formar.length() == 9)
            jLo9.setText(formar.substring(formar.length()-1,formar.length()));
        else if(formar.length() == 10)
            jLo10.setText(formar.substring(formar.length()-1,formar.length()));
        else if(formar.length() == 11)
            jLo11.setText(formar.substring(formar.length()-1,formar.length()));
        else if(formar.length() == 12)
            jLo12.setText(formar.substring(formar.length()-1,formar.length()));
    }
}
