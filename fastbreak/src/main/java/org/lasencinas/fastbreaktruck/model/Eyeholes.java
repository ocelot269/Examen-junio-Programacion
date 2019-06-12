
package org.lasencinas.fastbreaktruck.model;

import org.lasencinas.fastbreaktruck.abstrack.Cereales;


public class Eyeholes extends Cereales{
    
    String nombre ;
    double pvp ;
    public Eyeholes() {
        setNombre("Eyeholes");
        setPvp(25.0);
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
   
}
