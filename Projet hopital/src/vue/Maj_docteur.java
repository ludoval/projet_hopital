/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;
import Controleur.Connexion;
import Modele.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Mathieu
 */
public class Maj_docteur extends javax.swing.JFrame {
    private static Connexion link;
    /**
     * Creates new form Maj_docteur1
     */
    public Maj_docteur(Connexion l) {
        link=l;
        initComponents();
        Show_Docteur_In_JTable();
    }
    /**
     * Méthode qui retourne l'ArrayList des champs concernant les infirmiers
     * @return 
     */
    public ArrayList<Docteur> getDocteurList()
    {
        ArrayList<Docteur> docteurList=new ArrayList<Docteur>();
        //On stocke dans une chaine de caractère la requête permettant de récupérer l'ensemble des docteurs
        String query="SELECT * FROM docteur D,employe E WHERE D.numero=E.numero ORDER BY D.numero ASC";
        Statement st;
        ResultSet rs;
        try{
            st=link.getConn().createStatement();
            rs = st.executeQuery(query); 
            Docteur docteur;
            //On récupère l'ensemble des données concernant les infirmiers
            while(rs.next())
           {
               docteur= new Docteur(rs.getString("numero"),
               rs.getString("nom") ,rs.getString("prenom"),rs.getString("adresse"),rs.getString("tel"),rs.getString("specialite")) ;                      
               docteurList.add(docteur);
           }
        }
         catch (Exception e) {
           e.printStackTrace();
        }
        return docteurList;
    }
    /**
     * Méthode qui permet d'afficher les données des infirmiers dans le tableau
     */
   public void Show_Docteur_In_JTable()
   {
       ArrayList<Docteur> list = getDocteurList();
       DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
       Object[] row = new Object[6];
       for(int i = 0; i < list.size(); i++)
       {
           row[0] = list.get(i).getnumero();
           row[1] = list.get(i).getnom();
           row[2] = list.get(i).getprenom();
           row[3] = list.get(i).getadresse();
           row[4] = list.get(i).gettel();
           row[5] = list.get(i).getspecialite();
           
           model.addRow(row);
       }
    }
    /**
     * Méthode qui vérifie si les requêtes ont bien été éxécutées
     * @param query1
     * @param query2
     * @param message 
     */
    public void executerSQLquery(String query1,String query2,String message){
       Statement st;
       try{
           st=link.getConn().createStatement();
           if(st.executeUpdate(query1)== 1&&st.executeUpdate(query2)== 1)
           {
               DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
               model.setRowCount(0);
               Show_Docteur_In_JTable();
               
               JOptionPane.showMessageDialog(null, "Donnée "+ message);
           }else{
               JOptionPane.showMessageDialog(null, "Donnée non "+ message);
           }
       }catch(Exception ex){
           ex.printStackTrace();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Retour = new javax.swing.JButton();
        jButton_Ajouter = new javax.swing.JButton();
        jButton_Supprimer = new javax.swing.JButton();
        jButton_Modifier = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Numero = new javax.swing.JTextField();
        jTextField_Nom = new javax.swing.JTextField();
        jTextField_Prenom = new javax.swing.JTextField();
        jTextField_Adresse = new javax.swing.JTextField();
        jTextField_Telephone = new javax.swing.JTextField();
        jTextField_Specialite = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("Mise à jour des docteurs");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numéro", "Nom", "Prénom", "Adresse", "Téléphone", "Spécialité"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Retour.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Retour.setText("Retour");
        Retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetourActionPerformed(evt);
            }
        });

        jButton_Ajouter.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton_Ajouter.setText("Ajouter");
        jButton_Ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AjouterActionPerformed(evt);
            }
        });

        jButton_Supprimer.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton_Supprimer.setText("Supprimer");
        jButton_Supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SupprimerActionPerformed(evt);
            }
        });

        jButton_Modifier.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton_Modifier.setText("Modifier");
        jButton_Modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ModifierActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Numéro");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Nom");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Prénom");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Adresse");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Téléphone");

        jLabel6.setText("Spécialité");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(41, 41, 41)
                        .addComponent(jTextField_Numero, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(64, 64, 64)
                        .addComponent(jTextField_Nom))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(43, 43, 43)
                        .addComponent(jTextField_Prenom))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(43, 43, 43)
                        .addComponent(jTextField_Adresse))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Telephone)
                            .addComponent(jTextField_Specialite))))
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Retour)
                        .addGap(347, 347, 347)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(426, 426, 426)
                        .addComponent(jButton_Ajouter)
                        .addGap(86, 86, 86)
                        .addComponent(jButton_Supprimer)
                        .addGap(90, 90, 90)
                        .addComponent(jButton_Modifier)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(Retour))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jTextField_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_Nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTextField_Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jTextField_Adresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jTextField_Telephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jTextField_Specialite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Ajouter)
                    .addComponent(jButton_Supprimer)
                    .addComponent(jButton_Modifier))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        // Quand on sélectionne un docteur dans le tableau, les champs de saisies correspondent aux données sélectionnées 
        jTextField_Numero.setText(model.getValueAt(i,0).toString());
        jTextField_Nom.setText(model.getValueAt(i,1).toString());
        jTextField_Prenom.setText(model.getValueAt(i,2).toString());
        jTextField_Adresse.setText(model.getValueAt(i,3).toString());
        jTextField_Telephone.setText(model.getValueAt(i,4).toString());
        jTextField_Specialite.setText(model.getValueAt(i,5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetourActionPerformed
        
        Maj_Employe maj_employe=new  Maj_Employe(link);
        maj_employe.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RetourActionPerformed
    /**
     * Méthode qui permet d'insérer les données
     * @param evt 
     */
    private void jButton_AjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AjouterActionPerformed
        
        String query1="INSERT INTO docteur(numero,specialite) VALUES ("+jTextField_Numero.getText()+",'"+jTextField_Specialite.getText()+"')";
        String query2="INSERT INTO employe(numero,nom,prenom,adresse,tel) VALUES ("+jTextField_Numero.getText()+",'"+jTextField_Nom.getText()+"','"+jTextField_Prenom.getText()+"','"+jTextField_Adresse.getText()+"','"+jTextField_Telephone.getText()+"')";
        executerSQLquery(query1,query2,"insérée");
    }//GEN-LAST:event_jButton_AjouterActionPerformed
    /**
     * Méthode qui permet de supprimer les donnés
     * @param evt 
     */
    private void jButton_SupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SupprimerActionPerformed
        
        String query1= "DELETE FROM `docteur` WHERE `numero` = "+jTextField_Numero.getText();
        String query2= "DELETE FROM `employe` WHERE `numero`= "+jTextField_Numero.getText();
        executerSQLquery(query1,query2,"effacée");
    }//GEN-LAST:event_jButton_SupprimerActionPerformed
    /**
     * Méthode qui permet de modifier les données
     * @param evt 
     */
    private void jButton_ModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ModifierActionPerformed
        
        String query1="UPDATE docteur SET `specialite`='"+jTextField_Specialite.getText()+"' WHERE `numero`="+jTextField_Numero.getText();;
        String query2="UPDATE employe SET `nom`='"+jTextField_Nom.getText()+"',`prenom`='"+jTextField_Prenom.getText()+"',`adresse`='"+jTextField_Adresse.getText()+"',`tel`='"+jTextField_Telephone.getText()+"' WHERE `numero`="+jTextField_Numero.getText();
        executerSQLquery(query1,query2, "modifié");
    }//GEN-LAST:event_jButton_ModifierActionPerformed
    
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
            java.util.logging.Logger.getLogger(Maj_docteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Maj_docteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Maj_docteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Maj_docteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Maj_docteur(link).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Retour;
    private javax.swing.JButton jButton_Ajouter;
    private javax.swing.JButton jButton_Modifier;
    private javax.swing.JButton jButton_Supprimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_Adresse;
    private javax.swing.JTextField jTextField_Nom;
    private javax.swing.JTextField jTextField_Numero;
    private javax.swing.JTextField jTextField_Prenom;
    private javax.swing.JTextField jTextField_Specialite;
    private javax.swing.JTextField jTextField_Telephone;
    // End of variables declaration//GEN-END:variables
}
