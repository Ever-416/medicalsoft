
package medicalsoft;

import Clases.Medico;
import Clases.Persona;


public class Medicalsoft {

    
    public static void main(String[] args) {
        
        Medico mec = new Medico ("Ever", "Salgado", "cc");
        
    /*    mec.nombre="Ever";
        System.out.println(mec.nombre); 
      */  
        System.out.println(mec.getNombre()+" "+mec.getApellido());
    
    }
    
}
