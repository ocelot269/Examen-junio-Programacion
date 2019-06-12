
package org.lasencinas.fasbreaktruck.interfaces;

import org.lasencinas.fastbreaktruck.model.Desayuno;
import org.lasencinas.fastbreaktruck.model.Eyeholes;
import org.lasencinas.fastbreaktruck.model.FleebJuice;
import org.lasencinas.fastbreaktruck.model.Smiggles;
import org.lasencinas.fastbreaktruck.model.TurbulentJuice;


public abstract class FastBreakTruck {

    Desayuno desayuno = new Desayuno();
    Eyeholes eyeholes = new Eyeholes();
    Smiggles smiggles = new Smiggles();
    TurbulentJuice juice = new TurbulentJuice();
    FleebJuice fleebJuice = new FleebJuice();
    
    
    public FastBreakTruck() {
    }
    
    public static Desayuno prepararEyeHoles(){
        return null;
    }
    
    public static Desayuno prepararSmiggles (){
        return null;
    }
    
}
