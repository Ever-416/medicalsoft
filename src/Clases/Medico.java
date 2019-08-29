package Clases;

public class Medico extends Persona{

    private String especialidad;
    public Medico(String nom, String ape, String espe) {
        super(nom, ape);
        especialidad=espe;
    }
    
}
