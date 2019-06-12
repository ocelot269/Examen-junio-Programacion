
package org.lasencinas.fasbreaktruck.interfaces;


public class Rick extends Juguete{
    
    String nombre;
    double pvp;
    
    public Rick()  {
        setNombre("rick");
        setPvp(5.0);
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
    public Packing empaquetado() {
        return getJuguete().empaquetado();
    }

    @Override
    public double pvp() {
        return getPvp();
    }
    
    
}
