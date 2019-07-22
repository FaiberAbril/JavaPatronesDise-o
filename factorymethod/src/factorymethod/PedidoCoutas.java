/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author HARGEZ
 */
public class PedidoCoutas extends Pedido {

    public PedidoCoutas(double importe) {
        super(importe);
    }

    @Override
    public boolean valida() {
        return (importe >= 1000) && (importe <= 5000);
    }

    @Override
    public void paga() {
        System.out.println("el pago del pedio"
                + importe + "se ha realizado");
    }

}
