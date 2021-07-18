package view;

import model.Curso;
import model.Formador;

public class Vista {
    
    public static void main(String[] args) {
        
        Curso cursoFrances = new Curso(52441, "Frances 101", 'N', "Guillaume", 7400);
        Curso cursoItaliano = new Curso(52442, "Italiano 102", 'T', "Vladimir Putin", 7401);

        Formador profesor = new Formador("Carlos", 321654);
        System.out.println(profesor.getNombre());
        System.out.println(profesor.getCodigo());
        
        System.out.println(cursoFrances.getFormador().getNombre());
        System.out.println(cursoFrances.getFormador().getCodigo());
        System.out.println(cursoItaliano.getFormador().getNombre());
        System.out.println(cursoItaliano.getFormador().getCodigo());

        //System.out.println(cursoFrances.getCodigo());
        //System.out.println(cursoFrances.getNombre());
        //System.out.println(cursoFrances.getJornada());

        //System.out.println(cursoFrances.getFormador());
    }

}
