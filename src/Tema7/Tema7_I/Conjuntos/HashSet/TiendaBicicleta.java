package Tema7.Tema7_I.Conjuntos.HashSet;

import java.util.HashSet;
import java.util.Set;

public class TiendaBicicleta {

    private final Set<Bicicleta> bicicletas = new HashSet<>();

    public Set<Bicicleta> getBicicletas() {
        return bicicletas;
    }

    public void agregarBicicleta(Bicicleta bicicleta){
        bicicletas.add(bicicleta);
    }

    public void eliminarBicicleta(Bicicleta bicicleta){
        bicicletas.remove(bicicleta);
    }

    public void mostrarBicicletas(){
        IO.println("Bicicletas disponibles:");
        for(Bicicleta bc : bicicletas) {
            IO.println(bc);
        }
    }

    public Bicicleta buscarBicicleta(String modelo) {
        for(Bicicleta bc : bicicletas) {
            if(bc.getModelo().equals(modelo)) {
                return bc;
            }
        }
        return null;
    }


}