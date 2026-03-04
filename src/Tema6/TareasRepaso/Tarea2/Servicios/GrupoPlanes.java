package Tema6.TareasRepaso.Tarea2.Servicios;

import Tema6.TareasRepaso.Tarea2.Entidades.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class GrupoPlanes {

    private String nombreGrupo;
    private ArrayList<Participante> participantes;
    private ArrayList<Plan> planes;
    private ArrayList<Voto> votos;

    // Constructor
    public GrupoPlanes(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
        this.participantes = new ArrayList<>();
        this.planes = new ArrayList<>();
        this.votos = new ArrayList<>();
    }

    // Añadir participante
    public void addParticipante(Participante p) {
        participantes.add(p);
    }

    // Añadir plan
    public void addPlan(Plan p) {
        planes.add(p);
    }

    // Listar todos los planes
    public void listarPlanes() {
        for (Plan p : planes) {
            System.out.println(p);
        }
    }

    // Listar planes por categoría
    public void listarPlanesPorCategoria(CategoriaPlan cat) {
        for (Plan p : planes) {
            if (p.getCategoria().equals(cat)) {
                System.out.println(p);
            }
        }
    }

    // Buscar participante por email
    public Participante buscarParticipantePorEmail(String email)
            throws ParticipanteNoEncontradoException {

        for (Participante p : participantes) {
            if (p.getEmail().equalsIgnoreCase(email)) {
                return p;
            }
        }

        throw new ParticipanteNoEncontradoException(
                "No se encontró participante con email: " + email);
    }

    // Buscar plan por ID
    public Plan buscarPlanPorId(Long id)
            throws PlanNoEncontradoException {

        for (Plan p : planes) {
            if (p.getId().equals(id)) {
                return p;
            }
        }

        throw new PlanNoEncontradoException(
                "No se encontró plan con id: " + id);
    }

    // Registrar voto
    public boolean registrarVoto(Long idPlan, String emailParticipante,
                                 TipoVoto tipo, String comentario) {

        try {
            Plan plan = buscarPlanPorId(idPlan);
            Participante participante = buscarParticipantePorEmail(emailParticipante);

            // Comprobar estado del plan
            if (!plan.getEstado().equals(EstadoPlan.ABIERTO)) {
                return false;
            }

            // Comprobar si ya votó
            for (Voto v : votos) {
                if (v.getPlan().getId().equals(idPlan) &&
                        v.getParticipante().getEmail().equalsIgnoreCase(emailParticipante)) {
                    return false;
                }
            }

            // Crear voto
            Voto voto = new Voto(participante,plan, tipo, LocalDate.now(), comentario);

            votos.add(voto);
            participante.addVoto(voto);

            return true;

        } catch (ParticipanteNoEncontradoException | PlanNoEncontradoException e) {
            return false;
        }
    }

    // Resultado votación
    public String getResultadoVotacion(Long idPlan) {

        int aFavor = 0;
        int enContra = 0;
        int abstencion = 0;

        for (Voto v : votos) {
            if (v.getPlan().getId().equals(idPlan)) {

                switch (v.getTipo()) {
                    case A_FAVOR:
                        aFavor++;
                        break;
                    case EN_CONTRA:
                        enContra++;
                        break;
                    case ABSTENCION:
                        abstencion++;
                        break;
                }
            }
        }

        return "Resultado votación Plan " + idPlan +
                "\nA favor: " + aFavor +
                "\nEn contra: " + enContra +
                "\nAbstenciones: " + abstencion;
    }

    // Plan ganador
    public Plan getPlanGanador() {

        Plan ganador = null;
        int maxVotos = -1;

        for (Plan p : planes) {

            if (p.getEstado().equals(EstadoPlan.ABIERTO)) {

                int votosFavor = 0;

                for (Voto v : votos) {
                    if (v.getPlan().getId().equals(p.getId())
                            && v.getTipo() == TipoVoto.A_FAVOR) {
                        votosFavor++;
                    }
                }

                if (votosFavor > maxVotos) {
                    maxVotos = votosFavor;
                    ganador = p;
                }
            }
        }

        return ganador;
    }

    // Cerrar votación y elegir ganador
    public void cerrarVotacionYElegirGanador() {

        Plan ganador = getPlanGanador();

        if (ganador == null) {
            return;
        }

        for (Plan p : planes) {

            if (p.getEstado().equals(EstadoPlan.ABIERTO)) {

                if (p.equals(ganador)) {
                    p.setEstado(EstadoPlan.ELEGIDO);
                } else {
                    p.setEstado(EstadoPlan.CERRADO);
                }
            }
        }
    }

    // Obtener votos de un plan
    public ArrayList<Voto> getVotosDeUnPlan(Long idPlan) {

        ArrayList<Voto> votosPlan = new ArrayList<>();

        for (Voto v : votos) {
            if (v.getPlan().getId().equals(idPlan)) {
                votosPlan.add(v);
            }
        }

        return votosPlan;
    }
}

