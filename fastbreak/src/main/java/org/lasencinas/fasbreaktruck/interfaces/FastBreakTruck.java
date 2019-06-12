
package org.lasencinas.fasbreaktruck.interfaces;

import org.lasencinas.fastbreaktruck.model.Desayuno;
import org.lasencinas.fastbreaktruck.model.Eyeholes;
import org.lasencinas.fastbreaktruck.model.FleebJuice;
import org.lasencinas.fastbreaktruck.model.Smiggles;
import org.lasencinas.fastbreaktruck.model.TurbulentJuice;


public class FastBreakTruck {

    public static void incluirJuguete(Desayuno eyeDes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static Item eyeholes = new Eyeholes();
    static Item smiggles = new Smiggles();
    static Item juice = new TurbulentJuice();
    static Item fleebJuice = new FleebJuice();

     public FastBreakTruck() {
        
    }

    public Item getEyeholes() {
        return eyeholes;
    }

    public void setEyeholes(Eyeholes eyeholes) {
        this.eyeholes = eyeholes;
    }

    public Item getSmiggles() {
        return smiggles;
    }

    public void setSmiggles(Smiggles smiggles) {
        this.smiggles = smiggles;
    }

    public Item getJuice() {
        return juice;
    }

    public void setJuice(TurbulentJuice juice) {
        this.juice = juice;
    }

    public Item getFleebJuice() {
        return fleebJuice;
    }

    public void setFleebJuice(FleebJuice fleebJuice) {
        this.fleebJuice = fleebJuice;
    }
    
    
  
    
    public static Desayuno prepararEyeHoles(){
        Desayuno desayuno = new Desayuno();
        desayuno.agregarItem(eyeholes);
        desayuno.agregarItem(juice);
        desayuno.mostrarItems();
        return desayuno;
    }
    
    public static Desayuno prepararSmiggles (){
        Desayuno desayuno = new Desayuno();
        desayuno.agregarItem(smiggles);
        desayuno.agregarItem(fleebJuice);
        desayuno.mostrarItems();
        return desayuno;
    }
    
}
