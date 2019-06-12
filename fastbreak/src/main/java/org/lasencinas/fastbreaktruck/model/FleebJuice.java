
package org.lasencinas.fastbreaktruck.model;

import org.lasencinas.fasbreaktruck.interfaces.Packing;
import org.lasencinas.fastbreaktruck.abstrack.Bebida;


public class FleebJuice extends Bebida{

    String nombre="FleebJuice";
    double pvp = 35.0;
    
    public FleebJuice() {
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
    public String nombre() {
        return getNombre();
    }

    @Override
    public double pvp() {
      return getPvp();
    }

    @Override
    public String toString() {
        return "Item : " + getNombre() + " empaquetado : " + getTubo().empaquetado() + " Precio : " + getPvp();
    }
    
}
