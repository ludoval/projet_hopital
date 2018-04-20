/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

/**
 *
 * @author ludovic
 */
public class Malade {
    //attributs
    protected String numero;
    protected String nom;
    protected String prenom;
    protected String tel;
    protected String adresse;
    protected String num_doc;
    protected String mutuelle;
    protected String nom_doc;
    protected String prenom_doc;
    protected String tel_doc;
    protected String specialite;
    //getters 
    public String getNumero(){return numero;}
    public String getPrenom(){return  prenom;}
    public String getNom(){return nom;}
    public String getTel(){return tel;}
    public String getAdresse(){return adresse;}
    public String getNumDoc(){return num_doc;}
    public String getMutuelle(){return mutuelle;}
    public String getNomDoc(){return nom_doc;}
    public String getPrenomDoc(){return prenom_doc;}
    public String getTelDoc(){return tel_doc;}
    public String getSpecialite(){return specialite;};
    //setters
    public void setNumero(String num){this.numero=num;}
    public void setPrenom(String a){this.prenom=a;}
    public void setNom(String a){this.nom=a;}
    public void setTel(String a){this.tel=a;}
    public void setAdresse(String a){this.adresse=a;}
    public void setNumDoc(String a){this.num_doc=a;}
    public void setMutuelle(String a){this.mutuelle=a;}
    public void setPrenomDoc(String a){this.prenom_doc=a;}
    public void setTelDoc(String a ){this.tel_doc=a;}
    public void setSpecialite(String a){this.specialite=a;};
    //constructeur
    public Malade(String num,String lastname,String surname,String ad,String phone,String mut,String numdoc,String nomdoc,String prenomdoc,String teldoc,String spe){
        numero=num;
        prenom=surname;
        nom=lastname;
        tel=phone;
        adresse=ad;
        mutuelle=mut;
        num_doc=numdoc;
        nom_doc=nomdoc;
        prenom_doc=prenomdoc;
        tel_doc=teldoc;
        specialite=spe;
    }
    
}
