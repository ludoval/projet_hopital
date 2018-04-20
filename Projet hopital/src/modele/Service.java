/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;
import java.util.ArrayList;
/**
 * 
 * @author ludovic
 */
public class Service {
    //attributs
    protected String code;
    protected String nom;
    protected String batiment;
    protected String directeur;
    protected String nom_directeur;
    protected String prenom_directeur;
    //getters
    public String getCode(){return code;}
    public String getNom(){return nom;}
    public String getBatiment(){return batiment;}
    public String getDirecteur(){return directeur;}
    public String getNom_directeur(){return nom_directeur;}
    public String getPrenom_directeur(){return prenom_directeur;}
    
    public Service(String code,String nom,String bâtiment,String directeur,String nom_directeur,String prenom_directeur){
        this.code=code;
        this.nom=nom;
        this.batiment=bâtiment;
        this.directeur=directeur;
        this.nom_directeur=nom_directeur;
        this.prenom_directeur=prenom_directeur;
    }
}
