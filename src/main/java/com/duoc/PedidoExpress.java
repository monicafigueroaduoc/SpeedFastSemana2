package com.duoc;

/**
 * <p>
 *     Representa un {@link Pedido} de tipo express.
 * </p>
 *
 * <p>
 *     Se caracteriza por una entrega rápida y por el atributo {@code tipoCliente}, que permite clasificar
 *     al cliente.
 * </p>
 * @author Monica Figueroa
 * @version 1.0
 */
public class PedidoExpress extends Pedido{

    // Tipo de cliente: Premium, Normal o Empresa.
    private String tipoCliente;

    /**
     * <p>
     *     Constructor de la clase {@link PedidoExpress}
     * </p>
     *
     * @param idPedido identificador del pedido.
     * @param direccionEntregada direccion de la entrega.
     * @param distanciaKm distancia en kilómetros.
     * @param tipoCliente tipo de cliente (Ejemplo: Premium, Normal o Empresa)
     */
    public PedidoExpress(String idPedido, String direccionEntregada, double distanciaKm
            , String tipoCliente) {

        // Se inicializan los datos comunes.
        super(idPedido, direccionEntregada, distanciaKm);

        // Se almacena el tipo de cliente propio de la subclase.
        this.tipoCliente = tipoCliente;
    }

    /**
     * Obtiene tipo de cliente.
     * @return tipo de cliente
     */
    public String getTipoCliente() {
        return tipoCliente;
    }

    /**
     * <p>
     *     Calcula el tiempo de entrega para un pedido express.
     * </p>
     *
     * <ul>
     *     <li>Tiempo base: 10 minutos.</li>
     *     <li>Si la distancia es mayor a 5 kilómetros, se agregan 5 minutos.</li>
     * </ul>
     *
     * @return tiempo estimado en minutos.
     */
    @Override
    public int calcularTiempoEntrega() {

        // Tiempo base para todos los pedidos.
        int tiempo = 10;

        // Se evalúa una condición de negocio simple para aplicar recargo.
        if (getDistanciaKm() > 5) {
            tiempo += 5;
        }

        // Retorna el tiempo final estimado.
        return tiempo;
    }
}
