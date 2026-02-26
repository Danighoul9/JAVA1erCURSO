package Tema6.PracticaTema6.Entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Agencia {

    private List<Coche> coches;
    private List<Alquiler> alquileres;

    public Agencia() {
        this.coches = new ArrayList<>();
        this.alquileres = new ArrayList<>();
    }

    public void addCoche(Coche c) {
        if (c != null) {
            coches.add(c);
        }
    }

    public void removeCoche(Coche c) {
        coches.remove(c);
    }

    public void listarCochesDisponibles() {
        System.out.println("Coches disponibles:");
        for (Coche c : coches) {
            if (c.isDisponible()) {
                System.out.println(c);
            }
        }
    }

    public void listarAlquileresActivos() {
        LocalDate hoy = LocalDate.now();
        System.out.println("Alquileres activos:");
        for (Alquiler a : alquileres) {
            if (a.getFechaFin().isAfter(hoy)) {
                System.out.println(a);
            }
        }
    }

    public Coche buscarCocheDisponible(TipoCoche tipo) throws NoHayCochesDisponiblesException {
        for (Coche c : coches) {
            if (c.isDisponible() && c.getTipo() == tipo) {
                return c;
            }
        }
        throw new NoHayCochesDisponiblesException("No hay coches disponibles del tipo " + tipo);
    }

    public boolean realizarAlquiler(Cliente cliente, TipoCoche tipo,
                                    LocalDate fechaInicio, LocalDate fechaFin) {
        try {
            Coche coche = buscarCocheDisponible(tipo);
            Alquiler alquiler = new Alquiler(cliente, coche, fechaInicio, fechaFin);
            alquileres.add(alquiler);
            System.out.println("Alquiler realizado con éxito.");
            System.out.println(alquiler.crearEmail());
            return true;
        } catch (NoHayCochesDisponiblesException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Error al realizar el alquiler: " + e.getMessage());
        }
        return false;
    }

    public List<Alquiler> getAlquileres() {
        return alquileres;
    }
}

