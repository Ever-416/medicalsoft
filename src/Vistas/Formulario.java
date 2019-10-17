
package Vistas;

import java.awt.HeadlessException;
import javax.swing.JFrame;


public class Formulario extends JFrame{

    public Formulario() throws HeadlessException {
    super("Registro");
    this.setSize(600, 500);
    this.setResizable(false);
    this.setLocationRelativeTo(null);
    this.setLayout(null);
    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
}
