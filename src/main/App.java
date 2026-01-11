package main;

import java.util.List;

import main.Ejercicio_01_insert.InsertBST;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLeves.ListLevels;
import main.Ejercicio_04_depth.Depth;
import main.Materia.Models.Node;
import utils.StudentValidator;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ

        System.out.println("Ejercicio 01: Insertar en un Árbol Binario de Búsqueda (BST)");
        InsertBST insertBST = new InsertBST();
        Node root = null;
        int[] valores = {5, 3, 7, 2, 4, 6, 8};
        for(int val : valores) {
            root = insertBST.insert(root, val);
        }
        System.out.println("Raiz " + root.getValue());

        System.out.println("Ejercicio 02: Invertir un Árbol Binario");
        InvertBinaryTree invertTree = new InvertBinaryTree();
        Node invertido = invertTree.invertTree(root);
        System.out.println("Nueva raiz del árbol invertido: " + invertido.getValue());

        System.out.println("Ejercicio 03: Listar Niveles en Listas Enlazadas");
        ListLevels listLevels = new ListLevels();
        List<List<Node>> niveles = listLevels.listLevels(invertido);
        for(int i = 0; i < niveles.size(); i++) {
            System.out.print("Nivel " + i + ": ");
            for(Node nodo : niveles.get(i)) {
                System.out.print(nodo.getValue() + " ");
            }
            System.out.println();
        }

        System.out.println("Ejercicio 04: Calcular la Profundidad Máxima");
        Depth depth = new Depth();
        int profundidad = depth.maxDepth(invertido);
        System.out.println("Profundidad máxima del árbol: " + profundidad);
    }

}
