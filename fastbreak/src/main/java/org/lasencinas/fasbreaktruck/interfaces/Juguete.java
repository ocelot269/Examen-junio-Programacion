/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lasencinas.fasbreaktruck.interfaces;


public abstract class Juguete implements Item{
    Item juguete = (Item) new Rick();

    public Item getJuguete() {
        return juguete;
    }

    @Override
    public Packing empaquetado() {
      return getJuguete().empaquetado();
    }
    
}
