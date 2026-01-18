package com.duoc;

/**
 * <p>
 *     Clase principal que ejecuta el sistema SpeedFast.
 * </p>
 *
 * <p>
 *     Crea diferentes instancias de {@link Pedido} y muestra su información junto al
 *     tiempo estimado de entrega.
 * </p>
 * @author Monica Figueroa
 * @version 1.0
 */
public class Main {

    /**
     * Punto de entrada de la aplicación.
     * @param args argumengtos de línea de comandos (no utilizados en esta aplicación.
     */
    public static void main(String[] args) {

        Pedido p1 = new PedidoComida("#001",
                "Las Rosas 1470",
                5, "Saludable");

        Pedido p2 = new PedidoEncomienda("#002",
                "Los carrera 1890",
                10, 5);

        Pedido p3 = new PedidoExpress("#003",
                "Avenida Manuel Rodriguez",
                7, "Premiun");

        mostrarPedido(p1);
        mostrarPedido(p2);
        mostrarPedido(p3);
    }

    /**
     * <p>
     *     Muestra el resumen y el tiempo estimado de un pedido.
     * </p>
     *
     * @param pedido objeto de tipo {@link Pedido}.
     */
    public static void mostrarPedido(Pedido pedido) {
        pedido.mostrarResumen();
        System.out.println("Tiempo estimado de entrega: "
                + pedido.calcularTiempoEntrega() + " minutos");
        System.out.println("--------------------------------");
    }
}
