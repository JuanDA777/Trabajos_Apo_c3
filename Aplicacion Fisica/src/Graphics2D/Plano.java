/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graphics2D;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author juand
 */
public class Plano {
    public boolean limpiar;
    public JPanel p;
    public Plano(JPanel p) {
        this.p=p;
    }
    public void c1() {
        Graphics2D g = (Graphics2D) p.getGraphics();
        //Grosor y color
        BasicStroke grosor = new BasicStroke(4);
        g.setStroke(grosor);
        g.setColor(Color.BLUE);
        //carga izquierda
        g.drawOval(90, 50, 50, 50);
        g.drawLine(32, 76, 80, 76);
        g.drawLine(30, 76, 40, 66);
        g.drawLine(30, 76, 40, 86);
        
        //carga derecha
        g.drawOval(262, 50, 50, 50);
        g.drawLine(322, 76, 370, 76);
        g.drawLine(362, 66, 372, 76);
        g.drawLine(362, 86, 372, 76);  
    }
    
    public void c2() {
        Graphics2D g = (Graphics2D) p.getGraphics();
        BasicStroke grosor = new BasicStroke(4);
        g.setStroke(grosor);
        g.setColor(Color.RED);
        //carga izquierda
        g.drawOval(90, 50, 50, 50);
        g.drawLine(32, 76, 80, 76);
        g.drawLine(30, 76, 40, 66);
        g.drawLine(30, 76, 40, 86);
        
        //carga derecha
        g.drawOval(262, 50, 50, 50);
        g.drawLine(322, 76, 370, 76);
        g.drawLine(362, 66, 372, 76);
        g.drawLine(362, 86, 372, 76);  
        
    }
    public void c3() {
        Graphics2D g = (Graphics2D) p.getGraphics();
        BasicStroke grosor = new BasicStroke(4);
        g.setStroke(grosor);
        //carga izquierda
         g.setColor(Color.RED);
        g.drawOval(60, 50, 50, 50);
        g.drawLine(120, 76, 168, 76);
        g.drawLine(160, 66, 170, 76);
        g.drawLine(160, 86, 170, 76);
        
        //carga derecha
        g.setColor(Color.BLUE);
        g.drawOval(292, 50, 50, 50);
        g.drawLine(234, 76, 282, 76);
        g.drawLine(232, 76, 242, 66);
        g.drawLine(232, 76, 242, 86);
    }
    public void c4() {
        Graphics2D g = (Graphics2D) p.getGraphics();
        BasicStroke grosor = new BasicStroke(4);
        g.setStroke(grosor);
        //carga izquierda
        g.setColor(Color.BLUE);
        g.drawOval(60, 50, 50, 50);
        g.drawLine(120, 76, 168, 76);
        g.drawLine(160, 66, 170, 76);
        g.drawLine(160, 86, 170, 76);
        
        //carga derecha
        g.setColor(Color.RED);
        g.drawOval(292, 50, 50, 50);
        g.drawLine(234, 76, 282, 76);
        g.drawLine(232, 76, 242, 66);
        g.drawLine(232, 76, 242, 86);
    }
}
