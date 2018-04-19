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
public abstract class Employe{
    //attribut
    protected String numero;
    protected String nom;
    protected String prenom;
    protected String tel;
    protected String adresse;
    
    //Constructeur
    public Employe(String numero,String nom,String prenom,String tel,String adresse){
        this.numero=numero;
        this.nom=nom;
        this.prenom=prenom;
        this.tel=tel;
        this.adresse=adresse;
    }
    public String getnumero(){
        return numero;
    }
    public String getnom(){
        return nom;
    }
    public String getprenom(){
        return prenom;
    }
    public String gettel(){
        return tel;
    }
    public String getadresse(){
        return adresse;
    }
    
}
