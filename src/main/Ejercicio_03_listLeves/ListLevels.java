package main.Ejercicio_03_listLeves;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import main.Materia.Models.Node;

public class ListLevels {

    public List<List<Node>> listLevels(Node root) {

        List<List<Node>> resultado = new ArrayList<>();

        if(root == null) {
            return null;
        }
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Node> nivelActual = new ArrayList<>();

            for(int i = 0; i < size; i++) {
                Node nodoActual = queue.poll();
                nivelActual.add(nodoActual);

                if(nodoActual.getLeft() != null) {
                    queue.add(nodoActual.getLeft());
                }
                if(nodoActual.getRight() != null) {
                    queue.add(nodoActual.getRight());
                }
            }

            resultado.add(nivelActual);
        }
        return resultado;
    }
    
}
