/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

import productoAbstracto.Automovil;

/**
 *
 * @author HARGEZ
 */
public class AutomovilGasolina extends Automovil{

    public AutomovilGasolina(String Modelo, String color, int potencia, double espacio) {
        super(Modelo, color, potencia, espacio);
    }

    @Override
    public void mostrarcaracterisiticas() {
         System.out.println("Automovil gasolina modelo "+ Modelo 
        +"de color "+ color + "de potencia "+potencia
        +" espacio " + espacio);

    }
    
}
