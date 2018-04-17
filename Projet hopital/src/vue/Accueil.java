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
    private static Connexion con;
    /**
     * Creates new form Acceuil
     * @param c ceci est un énorme tube
     */
    public Accueil(Connexion c) {
        initComponents();
        con=c;
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
        Reporting = new javax.swing.JButton();
        Acceuil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Recherche.setBackground(new java.awt.Color(0, 255, 204));
        Recherche.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Recherche.setForeground(new java.awt.Color(0, 153, 0));
        Recherche.setText("Recherche");
        Recherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechercheActionPerformed(evt);
            }
        });

        Mise_a_jour.setBackground(new java.awt.Color(0, 255, 204));
        Mise_a_jour.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Mise_a_jour.setForeground(new java.awt.Color(255, 0, 51));
        Mise_a_jour.setText("Mise à jour");
        Mise_a_jour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mise_a_jourActionPerformed(evt);
            }
        });

        Reporting.setBackground(new java.awt.Color(0, 255, 204));
        Reporting.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Reporting.setForeground(new java.awt.Color(0, 153, 204));
        Reporting.setText("Reporting");
        Reporting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportingActionPerformed(evt);
            }
        });

        Acceuil.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Acceuil.setText("Accueil");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(Acceuil))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Reporting, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mise_a_jour, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Recherche, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(Acceuil)
                .addGap(30, 30, 30)
                .addComponent(Recherche, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Mise_a_jour, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Reporting, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechercheActionPerformed
        Recherche Page_recherche= new Recherche(con);
        Page_recherche.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RechercheActionPerformed

    private void Mise_a_jourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mise_a_jourActionPerformed
        Mise_A_Jour Page_MAJ= new Mise_A_Jour(con);
        Page_MAJ.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Mise_a_jourActionPerformed

    private void ReportingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportingActionPerformed
        Reporting Page_Reporting= new Reporting(con);
        Page_Reporting.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ReportingActionPerformed

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
                new Accueil(con).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Acceuil;
    private javax.swing.JButton Mise_a_jour;
    private javax.swing.JButton Recherche;
    private javax.swing.JButton Reporting;
    // End of variables declaration//GEN-END:variables
}
