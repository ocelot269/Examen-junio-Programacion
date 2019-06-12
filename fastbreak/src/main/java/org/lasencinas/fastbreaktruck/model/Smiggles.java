
package org.lasencinas.fastbreaktruck.model;

import org.lasencinas.fasbreaktruck.interfaces.Item;
import org.lasencinas.fastbreaktruck.abstrack.Cereales;


public class Smiggles extends Cereales{
   
    String nombre ="Smiggles";
    double pvp = 50.0;

    public Smiggles() {
    }
     
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPvp() {
        return pvp;
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
    }

    @Override
    public String toString() {
        return "Item : " + getNombre() + " empaquetado : " + getCaja().empaquetado() + " Precio : " + getPvp();
    }

    @Override
    public String nombre() {
        return getNombre();
    }

    @Override
    public double pvp() {
        return getPvp();
    }
    
    
    
}
