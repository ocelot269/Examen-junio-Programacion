
package org.lasencinas.fastbreaktruck.abstrack;

import org.lasencinas.fasbreaktruck.interfaces.Item;
import org.lasencinas.fasbreaktruck.interfaces.Packing;
import org.lasencinas.fastbreaktruck.model.Caja;


public abstract class Cereales implements Item{
    
    
    Item caja = (Item) new Caja();

    public Item getCaja() {
        return caja;
    }

    public void setCaja(Item caja) {
        this.caja = caja;
    }
    
    @Override
    public Packing empaquetado() {
        return getCaja().empaquetado();
    }
    
}
