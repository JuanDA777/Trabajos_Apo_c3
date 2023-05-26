/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package graphvisualization;
import com.mxgraph.layout.mxCompactTreeLayout;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;

import javax.swing.*;
/**
 *
 * @author juand
 */
public class GraphVisualization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un objeto de la clase mxGraph
        mxGraph graph = new mxGraph();

        // Crear los vértices del grafo
        Object vertex1 = graph.insertVertex(graph.getDefaultParent(), null, "A", 20, 20, 80, 30);
        Object vertex2 = graph.insertVertex(graph.getDefaultParent(), null, "B", 160, 20, 80, 30);
        Object vertex3 = graph.insertVertex(graph.getDefaultParent(), null, "C", 20, 100, 80, 30);
        Object vertex4 = graph.insertVertex(graph.getDefaultParent(), null, "D", 160, 100, 80, 30);

        // Crear las aristas del grafo
        graph.insertEdge(graph.getDefaultParent(), null, "", vertex1, vertex2);
        graph.insertEdge(graph.getDefaultParent(), null, "", vertex1, vertex3);
        graph.insertEdge(graph.getDefaultParent(), null, "", vertex2, vertex4);
        graph.insertEdge(graph.getDefaultParent(), null, "", vertex3, vertex4);

        // Crear un objeto de la clase mxCompactTreeLayout para organizar el grafo
        mxCompactTreeLayout layout = new mxCompactTreeLayout(graph, false);

        // Aplicar el diseño al grafo
        layout.execute(graph.getDefaultParent());

        // Crear un objeto de la clase mxGraphComponent para visualizar el grafo
        mxGraphComponent graphComponent = new mxGraphComponent(graph);

        // Crear un objeto de la clase JFrame para mostrar el grafo
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.getContentPane().add(graphComponent);
        frame.setVisible(true);
    }
    
}
