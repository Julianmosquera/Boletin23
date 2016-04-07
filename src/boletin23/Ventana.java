
package boletin23;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author julian
 */
public class Ventana {
    
    public void crearInterfaz(){
    JFrame marco = new JFrame("Boletin 23");
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        
        //panel1
        JLabel LNome = new JLabel("Nome");
        JLabel LPass = new JLabel("Password");
        JTextField Tnome = new JTextField(20);
        JPasswordField pass = new JPasswordField(20);
        JButton BPremer = new JButton("Premer");
        JButton BLimpar = new JButton("Limpar");
        //panel2
        String[]list={"elementolista1","elementolista2","elementolista3"};
        JList lista = new JList(list);
        JButton BBoton = new JButton("Boton");
        JTextArea ATexto = new JTextArea(5,10);
        
        
        marco.setSize(340, 500);
        panel1.setSize(340, 250);
        panel2.setSize(340,250);
        
        LNome.setBounds(50, 10, 150, 100);
        LPass.setBounds(50, 85, 150, 100);
        BPremer.setBounds(50, 210, 85, 30);
        Tnome.setBounds(150, 50, 100, 30);
        pass.setBounds(150, 125, 100, 30);
        BLimpar.setBounds(150, 210, 85, 30);
        
        lista.setBounds(30, 340, 110, 50);
        BBoton.setBounds(150, 340, 85, 35);
        ATexto.setBounds(250, 340, 80, 40);
        
        panel1.add(LNome);
        panel1.add(Tnome);
        panel1.add(LPass);
        panel1.add(pass);
        panel1.add(BPremer);
        panel1.add(BLimpar);
        panel1.setBackground(Color.GREEN);
        
        panel2.add(lista);
        panel2.add(BBoton);
        panel2.add(ATexto);
        panel2.setBackground(Color.ORANGE);
        
        panel1.setLayout(null);
        panel2.setLayout(null);
        marco.add(panel1);
        marco.add(panel2);
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}