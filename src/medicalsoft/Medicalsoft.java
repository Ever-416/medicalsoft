
package medicalsoft;

import Clases.*;
import java.time.LocalDate;


public class Medicalsoft {

    
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        Medico mec = new Medico ();
       // Validacion val = new Validacion();
        
        mec.setNombre("Omar");
        mec.setApellido("Marenco");
        mec.setEmail("ejsalgadog@gmail.com");
        mec.setFecha_nacimiento("22-02-1981");
        
         System.out.println("El medico es: "+mec.getFullnombre()+" y su edad es: "+mec.getedad()+"\n"
                 + "La direccion de correo es: "+Validacion.isEmail("ejsalgadog@gmail.com")+"\n"
                         + "El celular es: "+Validacion.isCelular("3113085111")+"\n"
                                 + "El celular es: "+Validacion.isTelefono("3631948"));
    
    }
    
}
