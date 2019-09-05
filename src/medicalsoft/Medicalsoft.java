
package medicalsoft;

import Clases.Medico;
import Clases.Persona;
import java.time.LocalDate;


public class Medicalsoft {

    
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        Medico mec = new Medico ();
        
        mec.setNombre("Omar");
        mec.setApellido("Marenco");
        mec.setFecha_nacimiento("22-02-1981");
        
         System.out.println("El medico es: "+mec.getFullnombre()+" y su edad es: "+mec.getedad());
    
    }
    
}
