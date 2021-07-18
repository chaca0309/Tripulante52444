package model;

public class Curso {
    private int codigo;
    private String nombre;
    private char jornada;

    private Formador formador;

    public Curso(int codigo, String nombre, char jornada, String fnombre, int fcodigo) {
        super();
        this.codigo = codigo;
        this.nombre = nombre;
        this.jornada = jornada;
        formador = new Formador(fnombre, fcodigo);
    }


    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public char getJornada() {
        return jornada;
    }

    public Formador getFormador() {
        return formador;
    }


    
}
