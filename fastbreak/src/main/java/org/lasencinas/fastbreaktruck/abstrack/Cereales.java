
package org.lasencinas.fastbreaktruck.abstrack;

import org.lasencinas.fasbreaktruck.interfaces.Item;
import org.lasencinas.fasbreaktruck.interfaces.Packing;


public abstract class Cereales implements Item{

    @Override
    public Packing empaquetado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
