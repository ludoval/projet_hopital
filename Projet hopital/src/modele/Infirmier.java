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
public class Infirmier extends Employe{
    private double salaire;
    private String rotation;
    private String code_service;

    public Infirmier(String numero, String nom, String prenom, String adresse, String tel,String code_service,String rotation,double salaire) {
        super(numero, nom, prenom, adresse,tel);
        this.rotation=rotation;
        this.salaire=salaire;
        
        this.code_service=code_service;
    }

    public double getSalaire(){
        return salaire;
    }
    public String getRotation(){
        return rotation;
    }
    public String getcode_service(){
        return code_service;
    }


}