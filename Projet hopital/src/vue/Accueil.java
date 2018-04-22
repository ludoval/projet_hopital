package vue;
import Controleur.Connexion;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author axel9
 */
public class Accueil extends javax.swing.JFrame {
    private static Connexion link;
    /**
     * Creates new form Acceuil
     */
    public Accueil(Connexion l) {
        initComponents();
        link=l;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Recherche = new javax.swing.JButton();
        Mise_a_jour = new javax.swing.JButton();
        Information = new javax.swing.JButton();
        Acceuil = new javax.swing.JLabel();
        Reporting1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        quitter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Recherche.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Recherche.setForeground(new java.awt.Color(0, 153, 0));
        Recherche.setText("Recherche");
        Recherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechercheActionPerformed(evt);
            }
        });

        Mise_a_jour.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Mise_a_jour.setForeground(new java.awt.Color(255, 0, 51));
        Mise_a_jour.setText("Mise à jour");
        Mise_a_jour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mise_a_jourActionPerformed(evt);
            }
        });

        Information.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Information.setForeground(new java.awt.Color(0, 0, 255));
        Information.setText("Information");
        Information.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformationActionPerformed(evt);
            }
        });

        Acceuil.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Acceuil.setText("Accueil");

        Reporting1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Reporting1.setForeground(new java.awt.Color(0, 153, 204));
        Reporting1.setText("Reporting");
        Reporting1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reporting1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vue/Image accueil.jpg"))); // NOI18N

        quitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vue/croix rouge.png"))); // NOI18N
        quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(Mise_a_jour, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(Reporting1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(Information, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(950, 950, 950)
                .addComponent(quitter, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(Recherche, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(440, 440, 440)
                .addComponent(Acceuil, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(Mise_a_jour, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Reporting1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Information, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(quitter)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(Recherche, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Acceuil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechercheActionPerformed
        Recherche Page_recherche= new Recherche(link);
        Page_recherche.setVisible(true);
        this.setVisible(false);
        Page_recherche.setLocationRelativeTo(null);
    }//GEN-LAST:event_RechercheActionPerformed

    private void Mise_a_jourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mise_a_jourActionPerformed
        Mise_A_Jour Page_MAJ= new Mise_A_Jour(link);
        Page_MAJ.setVisible(true);
        this.setVisible(false);
        Page_MAJ.setLocationRelativeTo(null);
    }//GEN-LAST:event_Mise_a_jourActionPerformed

    private void InformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformationActionPerformed
        Information Page_Information= new Information(link);
        Page_Information.setVisible(true);
        this.setVisible(false);
        Page_Information.setLocationRelativeTo(null);
    }//GEN-LAST:event_InformationActionPerformed

    private void Reporting1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reporting1ActionPerformed
        Reporting reporting=new Reporting(link);
        reporting.setVisible(true);
        this.setVisible(false);
        reporting.setLocationRelativeTo(null);
    }//GEN-LAST:event_Reporting1ActionPerformed

    private void quitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitterActionPerformed
        Login login= new Login();
        login.setVisible(true);
        this.setVisible(false);
        login.setLocationRelativeTo(null);
    }//GEN-LAST:event_quitterActionPerformed

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
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Accueil(link).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Acceuil;
    private javax.swing.JButton Information;
    private javax.swing.JButton Mise_a_jour;
    private javax.swing.JButton Recherche;
    private javax.swing.JButton Reporting1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton quitter;
    // End of variables declaration//GEN-END:variables
}
