/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstachfactory;

/**
 *
 * @author HARGEZ
 */
public class FabricaVehiculosGasolina implements FabricaVehiculos{

    @Override
    public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
      return new AutomovilGasolina(modelo, color, potencia, espacio);
    }
    
    
    
    
    
}
