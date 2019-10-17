
package Vistas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Menu extends JFrame{
    JPanel fondo = new JPanel();
    public Menu(){
    super("Menu");
    this.setSize(600, 500);
    this.setResizable(false);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setFondo();
    setEtiqueta();
    setBotones();
    }
    ActionListener escuchador = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {    
            setEvento(e);
        }
    };
     ActionListener escuchador2 = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {    
            setEvento2(e);
        }
    };
      
    private void setFondo() {
        fondo.setBounds(this.getBounds());
        fondo.setBackground(new Color(102,102,102));
        fondo.setLayout(null);
        this.add(fondo);
    }
 
    private void setEtiqueta() {
    JLabel eti = new JLabel("Registrar:");
    eti.setFont(new Font("Tahoma", Font.PLAIN, 30));
    eti.setForeground(Color.WHITE);
    int x= (this.getWidth()/2)-65;
    int y= this.getHeight()/5;
    eti.setBounds(x, y, 131, 36);
    fondo.add(eti);
    }
    
    private void setBotones() {          
    JButton pac = new JButton("Paciente");
    pac.setFont(new Font("Tahoma", Font.PLAIN, 25));
    pac.setForeground(Color.BLACK);
    pac.setBackground(Color.WHITE);
    int x= (this.getWidth()/4)-70;
    int y= this.getHeight()/2;
    pac.setBounds(x, y, 140, 70);
    pac.addActionListener(escuchador);
    fondo.add(pac);
    JButton mec = new JButton("Medico");
    mec.setFont(new Font("Tahoma", Font.PLAIN, 25));
    mec.setForeground(Color.BLACK);
    mec.setBackground(Color.WHITE);
    x= (this.getWidth()/2)+(this.getWidth()/4)-70;
    y= this.getHeight()/2;
    mec.setBounds(x, y, 140, 70);
    mec.addActionListener(escuchador2);
    fondo.add(mec);
    }
    String W="";
    private void setEvento(ActionEvent e) { 
    W="P";
    openVentana();
    }
    private void setEvento2(ActionEvent e) { 
    W="M";
    openVentana();
    }
    private void openVentana() {
    Formulario rg = new Formulario();
    JLabel eti = new JLabel("Registro");
    JButton bt = new JButton("Guardar");
    eti.setFont(new Font("Tahoma", Font.PLAIN, 25));
    eti.setForeground(Color.RED);
    eti.setBounds(260, 50, 131, 36);
    rg.add(eti);
    String[] Etiquetas={"Nombre","Apellido","Fecha de nacimiento","Identificaion","Genero","Direccion","Email","Telefono","Celular","Especialidad"};
    int a=9;    
    if (W.equals("M")) {
        a=10;    
        }
    
    for (int i = 0; i <a ; i++) {
    JLabel inf = new JLabel(Etiquetas[i]);
    JTextField cap = new JTextField();
    int n=Etiquetas[i].length()*8;
    int x=0;
    int y=0;
    if (i<5) {
    x= 150-n; 
    y= (rg.getHeight()/11)*(i+3);
            }else{
    x= ((this.getWidth()/2)+110)-n;
    y= (rg.getHeight()/11)*(i-2);
    }
    cap.setBounds(new Rectangle (x+n+8, y, 130, 25));
    inf.setBounds(new Rectangle(x,y,n,15));
    bt.setBounds(new Rectangle(300, 380,100 ,30));
    inf.setForeground(Color.red);
    inf.setHorizontalAlignment(JLabel.RIGHT);
    rg.add(inf); 
    rg.add(cap);
    rg.add(bt);
        }
    
        rg.setVisible(true);
        this.dispose();
    }
}
