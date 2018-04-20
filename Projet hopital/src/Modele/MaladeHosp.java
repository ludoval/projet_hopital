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
public class MaladeHosp extends Malade {
    private String no_chambre;
    private String service;
    public MaladeHosp(String num,String lastname,String surname,String ad,String phone,String mutuelle,String no_doc,String nomdoc,String prenomdoc,String teldoc,String spe,String no,String serv){
        super(num,lastname,surname,phone,ad,mutuelle,no_doc,nomdoc,prenomdoc,teldoc,spe);
        no_chambre=no;
        service=serv;
    }
    //getters
    public String getNoChambre(){return no_chambre;}
    public String getService(){return service;}
    //setters
    public void setNoChambre(String a){this.no_chambre=a;}
    public void setService(String a){this.service=a;}
    
}
