package Tema7.Tema7_II.Ejercicios.Pedidos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
public class Pedido {

    private Long id;
    private LocalDate fechaPedido;
    private LocalDate fechaEnvio;
    private EstadoPedido estado;
    private Cliente cliente;
    private Set<Producto> productos;

    public Pedido(Cliente cliente, EstadoPedido estado, LocalDate fechaPedido, LocalDate fechaEnvio, Long id) {
        this.cliente = cliente;
        this.estado = estado;
        this.fechaEnvio = fechaEnvio;
        this.fechaPedido = fechaPedido;
        this.id = id;
        this.productos = new HashSet<>();
    }

    public void addProducto(Producto producto) {
        this.productos.add(producto);
    }


}