
package org.lasencinas.fastbreaktruck.abstrack;

import org.lasencinas.fasbreaktruck.interfaces.Item;
import org.lasencinas.fasbreaktruck.interfaces.Packing;
import org.lasencinas.fastbreaktruck.model.Tubo;


public abstract class Bebida implements Item{
    
    Item tubo = (Item) new Tubo();

    public Item getTubo() {
        return tubo;
    }

    public void setTubo(Item tubo) {
        this.tubo = tubo;
    }
    
    @Override
    public Packing empaquetado() {
        return getTubo().empaquetado();
    }

   
    
    
}
