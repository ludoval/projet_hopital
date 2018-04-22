/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import Controleur.Connexion;
import Modele.Docteur;
import Modele.Service;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author axel9
 */
public class Information extends javax.swing.JFrame {
    private static Connexion link;
    /**
     * Creates new form Information
     */
    public Information(Connexion l) {
        initComponents();
        link=l;
    }
    /**
     * Programme permettant d'obtenir les resultat d'une requête concernant un docteur passée en paramètre dans un ArrayList
     * @param SQL
     * @return 
     */
    public ArrayList<Docteur> getDocteurList(String SQL)
    {
        ArrayList<Docteur> docteurList=new ArrayList<Docteur>();
        String query=SQL;
        Statement st;
        ResultSet rs;
        try{
            st=link.getConn().createStatement();
            rs = st.executeQuery(query); 
            Docteur docteur;
            while(rs.next())
           {
               docteur= new Docteur(rs.getString("numero"),rs.getString("nom")
                       ,rs.getString("prenom"),rs.getString("adresse"),rs.getString("tel"),rs.getString("specialite"));
               docteurList.add(docteur);
           }
        }
         catch (Exception e) {
           e.printStackTrace();
        }
        return docteurList;
    }
    // Display Data In JTable
   
    /**
    * Programme d'affichage des resultats des requêtes concernant les services passée en paramètre 
    * @param SQL 
    */
   public void Show_Docteur_In_JTable(String SQL)
   {
       ArrayList<Docteur> list = getDocteurList(SQL);
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
     * Programme permettant d'obtenir les resultat d'une requête concernant un service passée en paramètre dans un ArrayList
     * @param SQL
     * @return 
     */
    public ArrayList<Service> getServiceList(String SQL)
    {
        ArrayList<Service> serviceList=new ArrayList<Service>();
        String query=SQL;
        Statement st;
        ResultSet rs;
        try{
            st=link.getConn().createStatement();
            rs = st.executeQuery(query); 
            Service service;
            while(rs.next())
           {
               service= new Service(rs.getString("code"),rs.getString("nom"),rs.getString("batiment"),rs.getString("directeur"), rs.getString("nom_directeur"),rs.getString("prenom_directeur"));
               serviceList.add(service);
           }
        }
         catch (Exception e) {
           e.printStackTrace();
        }
        return serviceList;
    }
    // Display Data In JTable
   /**
    * Programme d'affichage des resultats des requêtes concernant les services passée en paramètre 
    * @param SQL 
    */
   public void Show_Service_In_JTable(String SQL)
   {
       ArrayList<Service> list = getServiceList(SQL);
       DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
       Object[] row = new Object[6];
       for(int i = 0; i < list.size(); i++)
       {
           row[0] = list.get(i).getCode();
           row[1] = list.get(i).getNom();
           row[2] = list.get(i).getBatiment();
           row[3] = list.get(i).getDirecteur();
           row[4] = list.get(i).getNom_directeur();
           row[5] = list.get(i).getPrenom_directeur();

           model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Retour = new javax.swing.JButton();
        Afficher = new javax.swing.JButton();
        ChoixInfo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "code", "nom", "batiment", "directeur", "nom_directeur", "prenom_directeur"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Information des services");

        Retour.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Retour.setForeground(new java.awt.Color(255, 0, 0));
        Retour.setText("Retour");
        Retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetourActionPerformed(evt);
            }
        });

        Afficher.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Afficher.setText("Afficher");
        Afficher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AfficherActionPerformed(evt);
            }
        });

        ChoixInfo.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ChoixInfo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Service", "Docteur en service" }));
        ChoixInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChoixInfoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(ChoixInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(Afficher, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Retour, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(116, 116, 116)
                .addComponent(ChoixInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(Afficher, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Retour, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Ce programme permet de retourner vers la page d'acceuil en cas de besoin
 * @param evt 
 */
    private void RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetourActionPerformed
        Accueil Page_accueil=new Accueil(link);
        Page_accueil.setVisible(true);
        this.setVisible(false);
        Page_accueil.setLocationRelativeTo(null);
    }//GEN-LAST:event_RetourActionPerformed
/**
 * Programme permettant d'afficher les informations récoltée dans la base de données en fonction du choix effectué au préalable dans la combobox
 * @param evt 
 */
    private void AfficherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AfficherActionPerformed
        String SQL;
        if(ChoixInfo.getSelectedIndex()==0){
        SQL="SELECT SV.code,SV.nom,SV.batiment,SV.directeur, E.nom AS nom_directeur,E.prenom AS prenom_directeur FROM service SV, employe E WHERE SV.directeur=E.numero;";
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "code", "nom", "batiment", "directeur", "nom_directeur", "prenom_directeur"
            }
        ));
        Show_Service_In_JTable(SQL);
        }
        else{
            SQL="SELECT E.numero, E.nom,E.prenom,E.adresse,E.tel,D.specialite FROM employe E RIGHT JOIN soigne S ON E.numero=S.no_docteur RIGHT JOIN hospitalisation H ON S.no_malade=H.no_malade JOIN docteur D ON D.numero=S.no_docteur GROUP BY E.nom";
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "numero", "nom", "prenom","adresse","tel","specialite"
            }
        ));
          Show_Docteur_In_JTable(SQL);
        }
    }//GEN-LAST:event_AfficherActionPerformed
/**
 * Programme permettant de choisir le type d'information que l'on souhaite obtenir et modifie en conséquence les attributs du tableau d'affichage
 * @param evt 
 */
    private void ChoixInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChoixInfoActionPerformed
        if(ChoixInfo.getSelectedIndex()==0){
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "code", "nom", "batiment", "directeur", "nom_directeur", "prenom_directeur"
            }
        ));
        }
        else{
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "numero", "nom", "prenom","adresse","tel","specialite"
            }
        ));
        }
    }//GEN-LAST:event_ChoixInfoActionPerformed

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
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Information(link).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Afficher;
    private javax.swing.JComboBox<String> ChoixInfo;
    private javax.swing.JButton Retour;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
