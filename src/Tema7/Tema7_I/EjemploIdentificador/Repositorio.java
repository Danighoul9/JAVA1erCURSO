package Tema7.Tema7_I.EjemploIdentificador;

import java.util.ArrayList;
import java.util.List;

public class Repositorio<T extends Identificable> {

    private List<T> registros = new ArrayList<>();

    public List<T> getRegistros() {
        return registros;
    }

    public void setRegistros(List<T> registros) {
        this.registros = registros;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Repositorio{");
        sb.append("registros=").append('\n');
        for(T registro : registros)
            sb.append(registro).append('\n');
        sb.append('}');
        return sb.toString();
    }

    public void agregar(T registro){
        registros.add(registro);
    }

    public void eliminar(T registro){
        registros.remove(registro);
    }

    public T buscarPorId(Long id) {
        for(T registro : registros) {
            if (registro.getId().equals(id)) {
                return registro;
            }
        }
        return null;
    }
}