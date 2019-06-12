
package org.lasencinas.fastbreaktruck.abstrack;

import org.lasencinas.fasbreaktruck.interfaces.Item;
import org.lasencinas.fasbreaktruck.interfaces.Packing;
import org.lasencinas.fastbreaktruck.model.Tubo;


public abstract class Bebida implements Item{
    
    Packing tubo = new Tubo();
    @Override
    public Packing empaquetado() {
        return tubo;
    }

    @Override
    public String toString() {
        return tubo.envoltorio(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
