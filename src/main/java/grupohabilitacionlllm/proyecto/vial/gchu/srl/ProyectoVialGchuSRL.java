/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package grupohabilitacionlllm.proyecto.vial.gchu.srl;

import javax.swing.JFrame;
import grupohabilitacionlllm.proyecto.vial.gchu.srl.View.AdminView;

/**
 *
 * @author lucas
 */
public class ProyectoVialGchuSRL {

    public static void main(String[] args) {
        AdminView ventana = new AdminView();
        ventana.setSize(670,500);
        ventana.setVisible(true);
        JFrame jf= new JFrame();        //JFrame me permite ejecutar la ventana.
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(990,570);
        jf.add(ventana);
        jf.setVisible(true);
        jf.setLocationRelativeTo(null);
    }
}
