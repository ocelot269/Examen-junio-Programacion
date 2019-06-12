package org.lasencinas.fastbreaktruck.fastbreaktruck;

import org.lasencinas.fasbreaktruck.interfaces.FastBreakTruck;
import org.lasencinas.fastbreaktruck.model.Desayuno;



public class App {

	public static void main(String[] args) {
            
		/**
		 * Desayuno Eyeholes
		 */

		Desayuno eyeDes = FastBreakTruck.prepararEyeHoles();
		System.out.print("\nNo abras la caja de Eyeholes!");
		eyeDes.mostrarItems();
		System.out.print("Precio pedido: " + eyeDes.getCoste());
//
//		/**
//		 * Desayuno Smiggles
//		 */
//		
		Desayuno smigDes = FastBreakTruck.prepararSmiggles();
		System.out.print("\nSmiggles per als nins!");
		smigDes.mostrarItems();
		System.out.print("Precio pedido: " + smigDes.getCoste());

//		/**
//		 * Plumbus
//		 */
//
//		eyeDes = FastBreakTruck.prepararEyeHoles();
//		FastBreakTruck.incluirJuguete(eyeDes);
//		System.out.print("\nEyeholes con plumbus!");
//		eyeDes.mostrarItems();
//		System.out.print("Precio pedido: " + eyeDes.getCoste());
	}
}