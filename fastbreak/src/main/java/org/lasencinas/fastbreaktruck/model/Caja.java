/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lasencinas.fastbreaktruck.model;

import org.lasencinas.fasbreaktruck.interfaces.Packing;
    
public class Caja implements Packing{

    String nombre= "Caja";
    public Caja() {
    }
    
    
    @Override
    public String envoltorio() {
        return nombre;
    }
    
}
