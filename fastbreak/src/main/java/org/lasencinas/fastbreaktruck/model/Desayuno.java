
package org.lasencinas.fastbreaktruck.model;

import java.util.HashSet;
import java.util.Set;
import org.lasencinas.fasbreaktruck.interfaces.Item;


public class Desayuno {
    
    Set<Item>items= new HashSet<Item>();
   double PrecioTotal = 0d;
   
        
    public Desayuno() {
        
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    public double getPrecioTotal() {
        return PrecioTotal;
    }

    public void setPrecioTotal(double PrecioTotal) {
        this.PrecioTotal += PrecioTotal;
    }
    
    public void agregarItem(Item desayuno){
        getItems().add(desayuno);
    }
    
    public void mostrarItems(){
        for (Item item : items) {
            System.out.println("Item : " + item.nombre() +" empaquetado : " + item.empaquetado()+ " Precio : " + item.pvp());
            setPrecioTotal(PrecioTotal);
        }
        System.out.println("Precio Pedido " + getCoste());
    }
    
    public double getCoste(){
        return getPrecioTotal();
    }
}
