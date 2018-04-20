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
    private String code;
    private String nom;
    private char batiment;
    private int directeur;
    private ArrayList<Employe> employes;
    //getters
    public String getCode(){return code;}
    public String getNom(){return nom;}
    public char getBatiment(){return batiment;}
    public int getDirecteur(){return directeur;}
    //public ArrayList getEmploye(){return employes;}
}
