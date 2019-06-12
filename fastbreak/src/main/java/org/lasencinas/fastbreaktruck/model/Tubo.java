
package org.lasencinas.fastbreaktruck.model;

import org.lasencinas.fasbreaktruck.interfaces.Packing;


public class Tubo implements Packing{
   String nombre = "tubo";
    
    public Tubo() {
        setNombre("tubo");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String envoltorio() {
       return getNombre();
    }
    
    
}
