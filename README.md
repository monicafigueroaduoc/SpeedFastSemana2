

# Sistema de Gestión de pedidos SpeedFast

Proyecto desarrollado en Java que simula un sistema de gestión de pedidos para una empresa de despacho.
Permite modelar distintos tipos de pedidos y calcular su tiempo estimado de entrega utilizando principios de `Programación Orientada a Objetos`.
La aplicación se ejecuta por consola y muestra el comportamiento polimórfico de los objetos.

---

## Descripción del proyecto

El sistema SpeedFast permite crear pedidos de diferentes tipos, tales como:
- Pedido de comida.
- Pedido de encomienda.
- Pedido express.

Cada tipo de pedido implementa su propia lógica para calcular el tiempo de entrega, utilizando herencia y métodos abstractos.
El sistema muestra un resumen del pedido y su tiempo estimado de entrega por consola.

---

## Objetivos del proyecto

- Aplicar correctamente los conceptos de `Programación Orientada a Objetos`.
- Utilizar clases abstractas y herencia.
- Implementar polimorfismo mediante métodos sobrescritos.
- Encapsular correctamente los atributos.
- Documentar el código utilizando Javadoc.

---

### Conceptos aplicados
- Programación Orientada a Objetos (POO).
- Clases abstractas.
- Métodos abstractos.
- Herencia.
- Polimorfismo.
- Encapsulamiento.
- Sobrescritura de métodos.
- Documentación con Javadoc.

---

## Estructura del proyecto
```SpeedFastSemana2
├ .idea/
├ .mvn/
├ docs/
├ src/
|  └ main/
|     ├ java/
|     |  └ com.duoc/
|     |     ├ Main.java
|     |     ├ Pedido.java
|     |     ├ PedidoComida.java
|     |     ├ PedidoEncomienda.java
|     |     └ PedidoExpress.java
|     └ resources/
├ test/
├ target/
├ .gitignore
├ pom.xml
└ README.md
```

## Instrucciones para clonar y ejecutar el proyecto
1. Clonar el repositorio desde GitHub.
```bash
Git clone [https://github.com/monicafigueroaduoc/SpeedFastSemana2.git]
```
2. Abre el proyecto en IntelliJ IDEA.
3. Ejecutar la clase com.duoc.Main
5. La aplicación se ejecutará por consola, mostrando:
- Resumen de cada pedido.
- Tiempo esperado de entrega.
- Separación visual entre cada pedido.

## Autor del proyecto
_**Nombre completo:** Mónica Figueroa
_**Sección:** 2
_**Analista Programador Computacional**

