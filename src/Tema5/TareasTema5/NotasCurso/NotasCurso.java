package Tema5.TareasTema5.NotasCurso;

import java.util.Objects;

public class NotasCurso {

    private String materia;
    private Integer curso;
    private Double nota1EV;
    private Double nota2EV;
    private Double nota3EV;
    private Double notaFinal;

    public NotasCurso(String materia, Integer curso) {
        this.materia = materia;
        this.curso = curso;
    }

    public NotasCurso(String materia, Integer curso, Double nota1EV, Double nota2EV, Double nota3EV) {
        this.materia = materia;
        this.curso = curso;
        this.nota1EV = nota1EV;
        this.nota2EV = nota2EV;
        this.nota3EV = nota3EV;
        this.notaFinal = calcularNotaFinal();
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Integer getCurso() {
        return curso;
    }

    public void setCurso(Integer curso) {
        this.curso = curso;
    }

    public Double getNota1EV() {
        return nota1EV;
    }

    public void setNota1EV(Double nota1EV) {
        this.nota1EV = nota1EV;
    }

    public Double getNota2EV() {
        return nota2EV;
    }

    public void setNota2EV(Double nota2EV) {
        this.nota2EV = nota2EV;
    }

    public Double getNota3EV() {
        return nota3EV;
    }

    public void setNota3EV(Double nota3EV) {
        this.nota3EV = nota3EV;
    }

    public Double getNotaFinal() {
        return calcularNotaFinal();
    }

    private Double calcularNotaFinal() {
        return (nota1EV + nota2EV + nota3EV) / 3;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("NotasCurso{");
        sb.append("materia='").append(materia).append('\'');
        sb.append(", curso=").append(curso);
        sb.append(", nota1EV=").append(nota1EV);
        sb.append(", nota2EV=").append(nota2EV);
        sb.append(", nota3EV=").append(nota3EV);
        sb.append(", notaFinal=").append(notaFinal);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        NotasCurso that = (NotasCurso) o;
        return Objects.equals(materia, that.materia) && Objects.equals(curso, that.curso) && Objects.equals(nota1EV, that.nota1EV) && Objects.equals(nota2EV, that.nota2EV) && Objects.equals(nota3EV, that.nota3EV);
    }

    @Override
    public int hashCode() {
        return Objects.hash(materia, curso, nota1EV, nota2EV, nota3EV);
    }

    //-------------------------------------------------------------

    public boolean aprobado() {
        return notaFinal >= 5;
    }
}