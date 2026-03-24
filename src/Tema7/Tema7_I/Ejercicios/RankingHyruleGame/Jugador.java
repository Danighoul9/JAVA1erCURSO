package Tema7.Tema7_I.Ejercicios.RankingHyruleGame;

import java.util.Objects;

public class Jugador {

    private Integer id;
    private String nickname;
    private Integer puntos;
    private Integer nivel;
    private String pais;

    public Jugador(Integer id, String nickname, String pais) {
        this.id = id;
        this.nickname = nickname;
        this.pais = pais;
        this.puntos = 0;
        this.nivel = 1;
    }

    public Jugador(Integer id, String nickname, Integer puntos, Integer nivel, String pais) {
        this.id = id;
        this.nickname = nickname;
        this.puntos = puntos;
        this.nivel = nivel;
        this.pais = pais;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("id=").append(id);
        sb.append(", nickname='").append(nickname).append('\'');
        sb.append(", puntos=").append(puntos);
        sb.append(", nivel=").append(nivel);
        sb.append(", pais='").append(pais).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return Objects.equals(id, jugador.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }



}