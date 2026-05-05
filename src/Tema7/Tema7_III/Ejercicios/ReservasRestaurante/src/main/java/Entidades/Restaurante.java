package Entidades;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString

public class Restaurante {

    private String nombre;
    private List<Cliente> clientes;
    private List<Reserva> reservas;

    public Restaurante(String nombre) {
        this.nombre = nombre;
        this.clientes =  new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public void addCliente(Cliente c){
        clientes.add(c);
    }
    public void addReserva(Reserva r){
        reservas.add(r);
    }

    public Cliente getClientePorDni(String id){
        for (Cliente c : clientes) {
            if (c.getDni().equals(id)) {
                return c;
            }
        }
        return null;
    }

}
