package com.duoc;

/**
 * <p>
 *     Clase abstracta que representa un pedido genérico dentro del sistema de la empresa SpeedFast.
 * </p>
 *
 * <p>
 *     Contiene los atributos y comportamientos comunes que comparten todos los tipos de pedidos.
 * </p>
 *
 * <p><b>Atributos principales:</b></p>
 * <ul>
 *     <li>idPedido: identificador único del pedido.</li>
 *     <li>direccionEntregada: dirección donde se realiza la entrega.</li>
 *     <li>distanciaKm: distancia en kilómetros al destino.</li>
 * </ul>
 *
 * <p>
 *     Las clases que heredan de {@link Pedido} deben implementar el método {@link #calcularTiempoEntrega()}
 *     con su propia lógica.
 * </p>
 *
 * @author Monica Figueroa
 * @version 1.0
 */
public abstract class Pedido {

    // Datos básicos del pedido. Se mantienen privados para reforzar el encapsulamiento.
    private String idPedido;
    private String direccionEntregada;
    private double distanciaKm;

    /**
     * <p>
     *     Constructor de la clase {link Pedido}.
     * </p>
     *
     * @param idPedido identificador del pedido.
     * @param direccionEntregada dirección entregada.
     * @param distanciaKm distancia en kilómetros.
     */
    public Pedido(String idPedido, String direccionEntregada, double distanciaKm)  {

        // El constructor asegura que el pedido se cree con todos sus datos.
        // Se guardan los datos recibidos por parámetro.
        this.idPedido = idPedido;
        this.direccionEntregada = direccionEntregada;
        this.distanciaKm = distanciaKm;
    }

    /**
     * Obtiene el identificador del pedido.
     * @return identificador del pedido.
     */
    public String getIdPedido() {
        return idPedido;
    }

    /**
     * Obtiene dirección de entrega.
     * @return dirección de entrega.
     */
    public String getDireccionEntregada() {
        return direccionEntregada;
    }

    /**
     * Obtiene distancia en kilómetros.
     * @return distancia en kilómetros.
     */
    public double getDistanciaKm() {
        return distanciaKm;
    }

    /**
     * <p>
     *     Muestra un resumen básico del pedido en consola.
     * </p>
     *
     * <p>
     *     Incluye:
     * </p>
     * <ul>
     *     <li>Identificador del pedido.</li>
     *     <li>Dirección de entrega.</li>
     *     <li>Distancia en kilómetros.</li>
     * </ul>
     */
    public void mostrarResumen() {

        // Se agrupa la salida para que sea más clara en consola.
        System.out.println("Pedido: " + idPedido + "\n" +
                "Direccion: " + direccionEntregada + "\n" +
                "Distancia: " + distanciaKm);
    }

    /**
     * <p>
     *     Calcula el tiempo de entrega estimado del pedido.
     * </p>
     *
     * <p>
     *     Este método debe ser implementado por cada subclase de {@link Pedido}.
     * </p>
     * @return tiempo de entrega estimado en minutos.
     */
    public abstract int calcularTiempoEntrega();

}
