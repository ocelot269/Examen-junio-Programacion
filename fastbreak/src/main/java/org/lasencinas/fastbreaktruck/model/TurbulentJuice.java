
package org.lasencinas.fastbreaktruck.model;

import org.lasencinas.fastbreaktruck.abstrack.Bebida;


public class TurbulentJuice extends Bebida{
    
    String nombre = "Turbulent Juuuuuice";
    double pvp = 30.0;
    
    public TurbulentJuice() {
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
