package com.duoc;

/**
 * <p>
 *     Representa un {@link Pedido} de tipo encomienda.
 * </p>
 *
 * <p>
 *     Incorpora el atributo {@code pesoKg} para representar el peso del paquete.
 * </p>
 * @author Monica Figueroa
 * @version 1.0
 */
public class PedidoEncomienda extends Pedido {

   // Peso de la encomienda. Característica propia.
    private double pesoKg;

    /**
     * <p>
     *     Constructor de la clase {@link PedidoEncomienda}.
     * </p>
     *
     * @param idPedido identificador del pedido.
     * @param direccionEntregada dirección de entrega.
     * @param distanciaKm distancia en kilómetros.
     * @param pesoKg peso de la encomienda en kilogramos.
     */
    public PedidoEncomienda(String idPedido, String direccionEntregada, double distanciaKm
            , double pesoKg) {

        // Se inicializan los datos comunes.
        super(idPedido, direccionEntregada, distanciaKm);

        // Se guarda el peso.
        this.pesoKg = pesoKg;
    }

    /**
     * Obtiene peso de la encomienda en kilogramos.
     * @return peso de la encomienda en kilogramos.
     */
    public double getPesoKg() {
        return pesoKg;
    }

    /**
     * <p>
     *     Calcula el tiempo de entrega para una encomienda.
     * </p>
     *
     * <p><b>Fórmula:</b></p>
     * <ul>
     *     <li>20 minutos base.</li>
     *     <li>1.5 minutos por cada kilómetro.</li>
     * </ul>
     *
     * @return tiempo estimado en minutos.
     */
    @Override
    public int calcularTiempoEntrega() {

       // Se usa getter para respetar la encapsulación. Int para ajustar a entero.
        return (int) (20 + (1.5 * getDistanciaKm()));
    }
}
