package Matematicas;

public class Asignatura {

    private String materia,curso_impartido;
    private int codigo;

    public Asignatura(String materia,String curso_impartido,int codigo){
        this.materia = materia;
        this.curso_impartido = curso_impartido;
        this.codigo = codigo;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getCurso_impartido() {
        return curso_impartido;
    }

    public void setCurso_impartido(String curso_impartido) {
        this.curso_impartido = curso_impartido;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
