package com.duoc;

/**
 * <p>
 *     Representa un {@link Pedido} de tipo comida.
 * </p>
 *
 * <p>
 *     Se agrega el atributo {@code tipoComida} para identificar el tipo de alimento solicitado
 *     por el cliente.
 * </p>
 * @author Monica Figueroa
 * @version 1.0
 */
public class PedidoComida extends Pedido{

    // Permite identificar que tipo de comida se entrga.
    private String tipoComida;

    /**
     * <p>
     *     Constructor de la clase {@link PedidoComida}.
     * </p>
     *
     * @param idPedido identificador del pedido.
     * @param direccionEntregada dirección de entrega.
     * @param distanciaKm distancia en kilometros.
     * @param tipoComida tipo de comida solicitada.
     */
    public PedidoComida(String idPedido, String direccionEntregada, double distanciaKm, String tipoComida) {

        // Se reutiliza en constructor de la clase padre.
        super(idPedido, direccionEntregada, distanciaKm);

        // Se almacena el tipo de comida propio de la subclase.
        this.tipoComida = tipoComida;
    }

    /**
     * Obtiene tipo de comida solicitada.
     * @return tipo de comida solicitada.
     */
    public String getTipoComida() {
        return tipoComida;
    }

    /**
     * <p>
     *     Calcula el tiempo de entrega para un  pedido de comida.
     * </p>
     *
     * <p><b>Fórmula:</b></p>
     * <ul>
     *     <li>15 minutos base.</li>
     *     <li>2 minutos por cada kilómetro.</li>
     * </ul>
     *
     * @return tiempo estimado en minutos.
     */
    @Override
    public int calcularTiempoEntrega() {
       // Se usa getter para respetar la encapsulación. Int para ajustar a entero.
        return (int) (15 + (2 * getDistanciaKm()));
    }
}
