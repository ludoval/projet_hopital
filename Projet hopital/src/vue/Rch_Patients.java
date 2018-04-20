/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vue;
import Controleur.Connexion;
import Modele.Malade;
import Modele.MaladeHosp;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import vue.Recherche;
/**
 *
 * @author axel9
 */
public class Rch_Patients extends javax.swing.JFrame {
    private static Connexion link;
    /** 
     * Creates new form Rch_Patients 
     * @param l transfert de connexion
     */
    public Rch_Patients(Connexion l) {
        initComponents();
        link=l;
 
    }
<<<<<<< HEAD
        public ArrayList<MaladeHosp> getMaladeHospList(String SQL)
    {
=======
    /**
     * 
     * @param SQL
     * @return une arrayliste de patients hospitalisé
     */
        public ArrayList<MaladeHosp> getMaladeHospList(String SQL)
    {
        //declaration des variables
>>>>>>> 84b2909bae11a2bbe0c1c9adcc12cb26a231c7b1
        ArrayList<MaladeHosp> maladehospList=new ArrayList<MaladeHosp>();
        String query=SQL;
        Statement st;
        ResultSet rs;
<<<<<<< HEAD
        try{
            st=link.getConn().createStatement();
            rs = st.executeQuery(query); 
            MaladeHosp maladehosp;
            while(rs.next())
           {
=======
       //traitement
        try{
            st=link.getConn().createStatement();//crée une requête
            rs = st.executeQuery(query); //éxecute dans la bdd
            MaladeHosp maladehosp;
            while(rs.next())
           {
               //remplie les différents champs dans l'arraylist =>les attributs d'un patient
>>>>>>> 84b2909bae11a2bbe0c1c9adcc12cb26a231c7b1
               maladehosp= new MaladeHosp(rs.getString("numero"),rs.getString("nom"),rs.getString("prenom"),rs.getString("tel"), rs.getString("adresse"),rs.getString("mutuelle"),rs.getString("no_doc"),rs.getString("nom_doc"),rs.getString("prenom_doc"),rs.getString("tel_doc"),rs.getString("specialite"),rs.getString("no_chambre"),rs.getString("service"));
               maladehospList.add(maladehosp);
           }
        }
<<<<<<< HEAD
         catch (Exception e) {
=======
         catch (Exception e) {//en cas de problème affiche l'erreur
>>>>>>> 84b2909bae11a2bbe0c1c9adcc12cb26a231c7b1
           e.printStackTrace();
        }
        return maladehospList;
    }
    // Display Data In JTable
<<<<<<< HEAD
   
=======
   /**
    * remplie le tableau
    * @param SQL requête
    */
>>>>>>> 84b2909bae11a2bbe0c1c9adcc12cb26a231c7b1
   public void Show_MaladeHosp_In_JTable(String SQL)
   {
       ArrayList<MaladeHosp> list = getMaladeHospList(SQL);
       DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
       Object[] row = new Object[13];
       for(int i = 0; i < list.size(); i++)
       {
           row[0] = list.get(i).getNumero();
           row[1] = list.get(i).getNom();
           row[2] = list.get(i).getPrenom();
           row[3] = list.get(i).getAdresse();
           row[4] = list.get(i).getTel();
           row[5] = list.get(i).getMutuelle();
           row[6] = list.get(i).getNumDoc();
           row[7] = list.get(i).getNomDoc();
           row[8] = list.get(i).getPrenomDoc();
           row[9] = list.get(i).getTelDoc();
           row[10] = list.get(i).getSpecialite();
           row[11] = list.get(i).getNoChambre();
           row[12] = list.get(i).getService();
           model.addRow(row);
       }
    }
<<<<<<< HEAD
    public ArrayList<Malade> getMaladeList(String SQL)
    {
=======
   /**
    * 
    * @param SQL requête
    * @return une arrayliste contenant les malades correspondants à la requête
    */
    public ArrayList<Malade> getMaladeList(String SQL)
    {
        //déclaration des variable
>>>>>>> 84b2909bae11a2bbe0c1c9adcc12cb26a231c7b1
        ArrayList<Malade> maladeList=new ArrayList<Malade>();
        String query=SQL;
        Statement st;
        ResultSet rs;
<<<<<<< HEAD
=======
        //traitement
>>>>>>> 84b2909bae11a2bbe0c1c9adcc12cb26a231c7b1
        try{
            st=link.getConn().createStatement();
            rs = st.executeQuery(query); 
            Malade malade;
            while(rs.next())
           {
               malade= new Malade(rs.getString("numero"),rs.getString("nom"),rs.getString("prenom"),rs.getString("adresse"),rs.getString("tel"),rs.getString("mutuelle"),rs.getString("no_doc"),rs.getString("nom_doc"),rs.getString("prenom_doc"),rs.getString("tel_doc"),rs.getString("specialite"));
               maladeList.add(malade);
           
        }
        }
<<<<<<< HEAD
         catch (Exception e) {
=======
         catch (Exception e) {//en cas de problème
>>>>>>> 84b2909bae11a2bbe0c1c9adcc12cb26a231c7b1
           e.printStackTrace();
        }
        return maladeList;
    }
    // Display Data In JTable
<<<<<<< HEAD
   
=======
   /**
    * même chose mais pour un malde non hospitalisé
    * @param SQL requête
    */
>>>>>>> 84b2909bae11a2bbe0c1c9adcc12cb26a231c7b1
   public void Show_Malade_In_JTable(String SQL)
   {
       ArrayList<Malade> list = getMaladeList(SQL);
       DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
       Object[] row = new Object[11];
       for(int i = 0; i < list.size(); i++)
       {
           row[0] = list.get(i).getNumero();
           row[1] = list.get(i).getNom();
           row[2] = list.get(i).getPrenom();
           row[3] = list.get(i).getAdresse();
           row[4] = list.get(i).getTel();
           row[5] = list.get(i).getMutuelle();
           row[6] = list.get(i).getNumDoc();
           row[7] = list.get(i).getNomDoc();
           row[8] = list.get(i).getPrenomDoc();
           row[9] = list.get(i).getTelDoc();
           row[10] = list.get(i).getSpecialite();
           
           model.addRow(row);
       }
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Retour = new javax.swing.JButton();
        Texte_recherche = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Categorie = new javax.swing.JComboBox<>();
        Attribut = new javax.swing.JComboBox<>();
        Recherche = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Retour.setText("Retour");
        Retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetourActionPerformed(evt);
            }
        });

        Texte_recherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Texte_rechercheActionPerformed(evt);
            }
        });

        jLabel1.setText("Rechercher par :");

        Categorie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hospitalisé", "Tout" }));
        Categorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategorieActionPerformed(evt);
            }
        });

        Attribut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "aucun", "numero", "nom", "prenom", "adresse", "tel", "mutuelle", "no_doc", "nom_doc", "prenom_doc", "tel_doc", "specialite" }));

        Recherche.setText("Recherche");
        Recherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechercheActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "numero", "nom", "prenom", "adresse", "tel", "mutuelle", "no_doc", "nom_doc", "prenom_doc", "tel_doc", "specialite"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Retour)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 728, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Categorie, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Attribut, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Texte_recherche, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Recherche, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Retour)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Texte_recherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Categorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Attribut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Recherche)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetourActionPerformed
        Recherche Page_recherche= new Recherche(link);
        Page_recherche.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RetourActionPerformed

    private void Texte_rechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Texte_rechercheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Texte_rechercheActionPerformed

    private void CategorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategorieActionPerformed
        if(Categorie.getSelectedIndex()==0){
            if(Attribut.getItemCount()>12){
               Attribut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "aucun", "numero", "nom", "prenom", "adresse", "tel", "mutuelle", "no_doc", "nom_doc", "prenom_doc", "tel_doc", "specialite" }));
               Attribut.addItem("no_chambre");
               Attribut.addItem("service");
               jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
               
            },
            new String [] {
                "numero", "nom", "prenom", "adresse", "tel", "mutuelle", "no_doc", "nom_doc", "prenom_doc", "tel_doc", "specialite","no_chambre","service"
            }
        ));
            }
            else{
                 Attribut.addItem("no_chambre");
                 Attribut.addItem("service");
                 jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                
            },
            new String [] {
                "numero", "nom", "prenom", "adresse", "tel", "mutuelle", "no_doc", "nom_doc", "prenom_doc", "tel_doc", "specialite","no_chambre","service"
            }
        ));
            }      
        }
        if(Categorie.getSelectedIndex()==1){
            Attribut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "aucun", "numero", "nom", "prenom", "adresse", "tel", "mutuelle", "no_doc", "nom_doc", "prenom_doc", "tel_doc", "specialite" }));
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                
            },
            new String [] {
                "numero", "nom", "prenom", "adresse", "tel", "mutuelle", "no_doc", "nom_doc", "prenom_doc", "tel_doc", "specialite"
            }
        ));
        }
    }//GEN-LAST:event_CategorieActionPerformed

    private void RechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechercheActionPerformed
        String SQL_P_H="SELECT DISTINCT M.numero, M.nom, M.prenom,M.adresse, M.tel,M.mutuelle, H.no_chambre, SV.nom as service ,E.numero as no_doc, E.nom as nom_doc, E.prenom as prenom_doc, E.tel as tel_doc, D.specialite FROM malade M,hospitalisation H,service SV, soigne S, docteur D, employe E WHERE M.numero=H.no_malade AND H.no_malade=S.no_malade AND S.no_docteur=D.numero AND D.numero=E.numero AND SV.code=H.code_service  ";
        String SQL_P="SELECT DISTINCT M.numero, M.nom, M.prenom,M.adresse, M.tel,M.mutuelle,E.numero as no_doc, E.nom as nom_doc, E.prenom as prenom_doc, E.tel as tel_doc, D.specialite FROM malade M,service SV, soigne S, docteur D, employe E WHERE M.numero=S.no_malade AND S.no_docteur=D.numero AND D.numero=E.numero ";

        int C;
        C=Categorie.getSelectedIndex();
        int No_A;
        String SQL = null;
<<<<<<< HEAD
=======
        //analyse de la 1ere combobox
>>>>>>> 84b2909bae11a2bbe0c1c9adcc12cb26a231c7b1
        switch(C){
    
                 case 0: 
                    No_A=Attribut.getSelectedIndex();
                    //analyse de la combo box
                     switch(No_A){
                    case 0:
<<<<<<< HEAD
                        SQL=SQL_P_H+" GROUP BY M.numero;";
                        break;
                    case 1:
                        SQL=SQL_P_H+"AND M.numero ="+Texte_recherche.getText()+" GROUP BY M.numero;";
                        break;
                    case 2:
                        SQL=SQL_P_H+"AND M.nom like "+"'%"+Texte_recherche.getText()+"%'"+" GROUP BY M.numero;";
                        break;
                    case 3:
                        SQL=SQL_P_H+"AND M.prenom like "+"'%"+Texte_recherche.getText()+"%'"+" GROUP BY M.numero;";
                        break;
                    case 4:
                        SQL=SQL_P_H+"AND M.adresse like '%"+Texte_recherche.getText()+"%'"+" GROUP BY M.numero;";
                        break;
                    case 5:
                        SQL=SQL_P_H+"AND M.tel like '%"+Texte_recherche.getText()+"%'"+" GROUP BY M.numero;";
                        break;
                    case 6:
                        SQL=SQL_P_H+"AND M.mutuelle like "+"'%"+Texte_recherche.getText()+"%'"+" GROUP BY M.numero;";
                        break;
                    case 7:
                        SQL=SQL_P_H+"AND E.numero ="+Texte_recherche.getText()+" GROUP BY M.numero;";
                        break;
                    case 8:
                        SQL=SQL_P_H+"AND E.nom like "+"'%"+Texte_recherche.getText()+"%'"+" GROUP BY M.numero;";
                        break;
                    case 9:
                        SQL=SQL_P_H+"AND E.prenom like "+"'%"+Texte_recherche.getText()+"%'"+" GROUP BY M.numero;";
                        break;
                    case 10:
                        SQL=SQL_P_H+"AND E.tel like '%"+Texte_recherche.getText()+"%'"+" GROUP BY M.numero;";
                        break;
                    case 11:
                        SQL=SQL_P_H+"AND D.specialite like "+"'%"+Texte_recherche.getText()+"%'"+" GROUP BY M.numero;";
                        break;
                    case 12:
                        SQL=SQL_P_H+"AND H.no_chambre ="+Texte_recherche.getText()+" GROUP BY M.numero;";
                        break;
                    case 13:
                        SQL=SQL_P_H+"AND SV.nom like "+"'%"+Texte_recherche.getText()+"%'"+" GROUP BY M.numero;";
                        break;
                    }
=======
                        SQL=SQL_P_H+" GROUP BY M.numero;";//par défaut choix=aucun
                        break;
                    case 1:
                        SQL=SQL_P_H+"AND M.numero ="+Texte_recherche.getText()+" GROUP BY M.numero;";//rch par numero malade
                        break;
                    case 2:
                        SQL=SQL_P_H+"AND M.nom like "+"'%"+Texte_recherche.getText()+"%'"+" GROUP BY M.numero;";//rch par nom par malade
                        break;
                    case 3:
                        SQL=SQL_P_H+"AND M.prenom like "+"'%"+Texte_recherche.getText()+"%'"+" GROUP BY M.numero;";//recherche par prenom malade
                        break;
                    case 4:
                        SQL=SQL_P_H+"AND M.adresse like '%"+Texte_recherche.getText()+"%'"+" GROUP BY M.numero;";//recherche par adresse
                        break;
                    case 5:
                        SQL=SQL_P_H+"AND M.tel like '%"+Texte_recherche.getText()+"%'"+" GROUP BY M.numero;";//rech par téléphone
                        break;
                    case 6:
                        SQL=SQL_P_H+"AND M.mutuelle like "+"'%"+Texte_recherche.getText()+"%'"+" GROUP BY M.numero;";//par mutuelle
                        break;
                    case 7:
                        SQL=SQL_P_H+"AND E.numero ="+Texte_recherche.getText()+" GROUP BY M.numero;";//par numéro du docteur
                        break;
                    case 8:
                        SQL=SQL_P_H+"AND E.nom like "+"'%"+Texte_recherche.getText()+"%'"+" GROUP BY M.numero;";//rch par nom doc
                        break;
                    case 9:
                        SQL=SQL_P_H+"AND E.prenom like "+"'%"+Texte_recherche.getText()+"%'"+" GROUP BY M.numero;";//rch prénom doc
                        break;
                    case 10:
                        SQL=SQL_P_H+"AND E.tel like '%"+Texte_recherche.getText()+"%'"+" GROUP BY M.numero;";//rch by tel doc
                        break;
                    case 11:
                        SQL=SQL_P_H+"AND D.specialite like "+"'%"+Texte_recherche.getText()+"%'"+" GROUP BY M.numero;";//rch spe doc
                        break;
                    case 12:
                        SQL=SQL_P_H+"AND H.no_chambre ="+Texte_recherche.getText()+" GROUP BY M.numero;";//rch par numéro de chambre
                        break;
                    case 13:
                        SQL=SQL_P_H+"AND SV.nom like "+"'%"+Texte_recherche.getText()+"%'"+" GROUP BY M.numero;";//rch by nom service 
                        break;
                    }
                    //reshape la table
>>>>>>> 84b2909bae11a2bbe0c1c9adcc12cb26a231c7b1
                    jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
               
            },
            new String [] {
                "numero", "nom", "prenom", "adresse", "tel", "mutuelle", "no_doc", "nom_doc", "prenom_doc", "tel_doc", "specialite","no_chambre","service"
            }
        ));
                 Show_MaladeHosp_In_JTable(SQL);   
                    break;
            case 1: 
                No_A=Attribut.getSelectedIndex();
                //analyse combo_box
                switch(No_A){
                    case 0:
                        SQL=SQL_P+" GROUP BY M.numero;";
                        break;
                    case 1:
<<<<<<< HEAD
                        SQL=SQL_P+"AND M.numero = "+Texte_recherche.getText()+" GROUP BY M.numero;";
=======
                        SQL=SQL_P+"AND M.numero = "+Texte_recherche.getText()+" GROUP BY M.numero;";//rch 
>>>>>>> 84b2909bae11a2bbe0c1c9adcc12cb26a231c7b1
                        break;
                    case 2:
                        SQL=SQL_P+"AND M.nom like "+"'%"+Texte_recherche.getText()+"%'"+" GROUP BY M.numero;";
                        break;
                    case 3:
                        SQL=SQL_P+"AND M.prenom like "+"'%"+Texte_recherche.getText()+"%'"+" GROUP BY M.numero;";
                        break;
                    case 4:
                        SQL=SQL_P+"AND M.adresse like '%"+Texte_recherche.getText()+"%'"+" GROUP BY M.numero;";
                        break;
                    case 5:
                        SQL=SQL_P+"AND M.tel like '%"+Texte_recherche.getText()+"%'"+" GROUP BY M.numero;";
                        break;
                    case 6:
                        SQL=SQL_P+"AND M.mutuelle like"+"'%"+Texte_recherche.getText()+"%'"+" GROUP BY M.numero;";
                        break;
                    case 7:
                        SQL=SQL_P+"AND E.numero = "+Texte_recherche.getText()+" GROUP BY M.numero;";
                        break;
                    case 8:
                        SQL=SQL_P+"AND E.nom like "+"'%"+Texte_recherche.getText()+"%'"+" GROUP BY M.numero;";
                        break;
                    case 9:
                        SQL=SQL_P+"AND E.prenom like "+"'%"+Texte_recherche.getText()+"%'"+" GROUP BY M.numero;";
                        break;
                    case 10:
                        SQL=SQL_P+"AND E.tel like '%"+Texte_recherche.getText()+"%'"+" GROUP BY M.numero;";
                        break;
                    case 11:
                        SQL=SQL_P+"AND D.specialite like"+"'%"+Texte_recherche.getText()+"%'"+" GROUP BY M.numero;";
                        break;
                }
<<<<<<< HEAD
=======
                //reshape la table
>>>>>>> 84b2909bae11a2bbe0c1c9adcc12cb26a231c7b1
                jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                
            },
            new String [] {
                "numero", "nom", "prenom", "adresse", "tel", "mutuelle", "no_doc", "nom_doc", "prenom_doc", "tel_doc", "specialite"
            }
        ));
<<<<<<< HEAD
                Show_Malade_In_JTable(SQL);
=======
                Show_Malade_In_JTable(SQL);//affiche
>>>>>>> 84b2909bae11a2bbe0c1c9adcc12cb26a231c7b1
            }
        Texte_recherche.setText("");
    }//GEN-LAST:event_RechercheActionPerformed

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
            java.util.logging.Logger.getLogger(Rch_Patients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rch_Patients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rch_Patients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rch_Patients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rch_Patients(link).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Attribut;
    private javax.swing.JComboBox<String> Categorie;
    private javax.swing.JButton Recherche;
    private javax.swing.JButton Retour;
    private javax.swing.JTextField Texte_recherche;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
