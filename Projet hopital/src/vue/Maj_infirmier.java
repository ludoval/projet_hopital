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
public class Maj_infirmier extends javax.swing.JFrame {
    private static Connexion link;
    /**
     * Creates new form Maj_infirmier
     */
    public Maj_infirmier(Connexion l) {
        initComponents();
        link=l;
        Show_Infirmier_In_JTable();
        
    }
    
    //Récupérer une ArrayList d'infirmiers venant de la base de donnée
    public ArrayList<Infirmier> getInfirmierList()
    {
        ArrayList<Infirmier> infirmierList=new ArrayList<Infirmier>();
        String query="SELECT * FROM infirmier I,employe E WHERE I.numero=E.numero ORDER BY I.numero ASC";
        Statement st;
        ResultSet rs;
        try{
            st=link.getConn().createStatement();
            rs = st.executeQuery(query); 
            Infirmier infirmier;
            while(rs.next())
           {
               infirmier= new Infirmier(rs.getString("numero"),
                       rs.getString("nom") ,rs.getString("prenom"),rs.getString("adresse"),rs.getString("tel")
                       ,rs.getString("code_service"),rs.getString("rotation"),rs.getDouble("salaire"));
               infirmierList.add(infirmier);
           }
        }
         catch (Exception e) {
           e.printStackTrace();
        }
        return infirmierList;
    }
   
   // Afficher les données dans la table
   public void Show_Infirmier_In_JTable()
   {
       ArrayList<Infirmier> list = getInfirmierList();
       DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
       Object[] row = new Object[8];
       for(int i = 0; i < list.size(); i++)
       {
           row[0] = list.get(i).getnumero();
           row[1] = list.get(i).getnom();
           row[2] = list.get(i).getprenom();
           row[3] = list.get(i).getadresse();
           row[4] = list.get(i).gettel();
           row[5] = list.get(i).getcode_service();
           row[6] = list.get(i).getRotation();
           row[7] = list.get(i).getSalaire();
           
           model.addRow(row);
       }
    }
   //Blindage des données pour la maj
   public void executerSQLquery(String query1,String query2,String message){
       Statement st;
       try{
           st=link.getConn().createStatement();
           if(st.executeUpdate(query1)== 1&&st.executeUpdate(query2)== 1)
           {
               DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
               model.setRowCount(0);
               Show_Infirmier_In_JTable();
               
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField_Adresse = new javax.swing.JTextField();
        jTextField_Prenom = new javax.swing.JTextField();
        jTextField_Nom = new javax.swing.JTextField();
        jTextField_Numero = new javax.swing.JTextField();
        jTextField_Telephone = new javax.swing.JTextField();
        jTextField_Rotation = new javax.swing.JTextField();
        jTextField_Salaire = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_Ajouter = new javax.swing.JButton();
        jButton_Supprimer = new javax.swing.JButton();
        jButton_Modifier = new javax.swing.JButton();
        Retour = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField_code_service = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("Mise à jour des infirmiers");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Nom");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Prénom");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Adresse");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Téléphone");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Numéro");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Rotation");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Salaire");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numéro", "Nom", "Prénom", "Adresse", "Téléphone", "Code_service", "Rotation", "Salaire"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

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

        Retour.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Retour.setText("Retour");
        Retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetourActionPerformed(evt);
            }
        });

        jLabel10.setText("Code_service");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Retour)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 338, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(573, 573, 573))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(52, 52, 52))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel10)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel4)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel9))))
                                        .addGap(29, 29, 29)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_Nom)
                                    .addComponent(jTextField_Numero)
                                    .addComponent(jTextField_Prenom)
                                    .addComponent(jTextField_Telephone)
                                    .addComponent(jTextField_Adresse)
                                    .addComponent(jTextField_Salaire)
                                    .addComponent(jTextField_code_service)
                                    .addComponent(jTextField_Rotation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(306, 306, 306)
                                        .addComponent(jButton_Ajouter)
                                        .addGap(58, 58, 58)
                                        .addComponent(jButton_Supprimer)
                                        .addGap(70, 70, 70)
                                        .addComponent(jButton_Modifier))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(172, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(330, 330, 330)
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Retour)
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Adresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Telephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jTextField_code_service, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jTextField_Rotation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Modifier)
                            .addComponent(jButton_Supprimer)
                            .addComponent(jButton_Ajouter))
                        .addGap(86, 86, 86))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField_Salaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetourActionPerformed
        // TODO add your handling code here:
        Maj_Employe maj_employe=new  Maj_Employe(link);
        maj_employe.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RetourActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
         // Sélectionner un infirmier avec ses attributs 
        jTextField_Numero.setText(model.getValueAt(i,0).toString());
        jTextField_Nom.setText(model.getValueAt(i,1).toString());
        jTextField_Prenom.setText(model.getValueAt(i,2).toString());
        jTextField_Adresse.setText(model.getValueAt(i,3).toString());
        jTextField_Telephone.setText(model.getValueAt(i,4).toString());
        jTextField_code_service.setText(model.getValueAt(i,5).toString());
        jTextField_Rotation.setText(model.getValueAt(i,6).toString());
        jTextField_Salaire.setText(model.getValueAt(i,7).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton_AjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AjouterActionPerformed
        // TODO add your handling code here:
        String query1="INSERT INTO infirmier(numero,code_service,rotation,salaire) VALUES ("+jTextField_Numero.getText()+",'"+jTextField_code_service.getText()+"','"+jTextField_Rotation.getText()+"',"+jTextField_Salaire.getText()+")"; 
        String query2="INSERT INTO employe(numero,nom,prenom,adresse,tel) VALUES ("+jTextField_Numero.getText()+",'"+jTextField_Nom.getText()+"','"+jTextField_Prenom.getText()+"','"+jTextField_Adresse.getText()+"','"+jTextField_Telephone.getText()+"')";
        executerSQLquery(query1,query2,"insérée");
    }//GEN-LAST:event_jButton_AjouterActionPerformed

    private void jButton_SupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SupprimerActionPerformed
        // TODO add your handling code here:
         String query1= "DELETE FROM `infirmier` WHERE `numero` = "+jTextField_Numero.getText();
         String query2= "DELETE FROM `employe` WHERE `numero`= "+jTextField_Numero.getText();
         executerSQLquery(query1,query2,"effacée");
    }//GEN-LAST:event_jButton_SupprimerActionPerformed

    private void jButton_ModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ModifierActionPerformed
        // TODO add your handling code here:
        String query1="UPDATE infirmier SET `code_service`='"+jTextField_code_service.getText()+"',`rotation`='"+jTextField_Rotation.getText()+"',`salaire`="+jTextField_Salaire.getText()+" WHERE `numero`="+jTextField_Numero.getText();
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
            java.util.logging.Logger.getLogger(Maj_infirmier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Maj_infirmier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Maj_infirmier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Maj_infirmier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Maj_infirmier(link).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Retour;
    private javax.swing.JButton jButton_Ajouter;
    private javax.swing.JButton jButton_Modifier;
    private javax.swing.JButton jButton_Supprimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_Adresse;
    private javax.swing.JTextField jTextField_Nom;
    private javax.swing.JTextField jTextField_Numero;
    private javax.swing.JTextField jTextField_Prenom;
    private javax.swing.JTextField jTextField_Rotation;
    private javax.swing.JTextField jTextField_Salaire;
    private javax.swing.JTextField jTextField_Telephone;
    private javax.swing.JTextField jTextField_code_service;
    // End of variables declaration//GEN-END:variables
}
