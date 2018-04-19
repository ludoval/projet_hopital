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
public class Docteur extends Employe{
    //attribut 
    private String specialite;

    public Docteur(String numero, String nom, String prenom, String adresse, String tel,String specialite) {
        super(numero, nom, prenom,adresse,tel);
        this.specialite=specialite;
    }
    //getters 
    public String getspecialite(){
        return specialite;
    }
}
