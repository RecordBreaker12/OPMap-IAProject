package dfs;

import java.util.ArrayList;

public class Grafo {

    private final ArrayList<Node> vertices;

    public Grafo() {
        vertices = new ArrayList<>();
    }

    public void addNode(int num) {
        vertices.add(new Node(num));
    }

    public void addEdge(int src, int dest) {
        vertices.get(src).adj.add(new Node(dest));
    }

    public void dfs(int start) {
        boolean[] isVisited = new boolean[vertices.size()];
        dfsSearch(vertices.get(start), isVisited, 0);
    }

    private void dfsSearch(Node current, boolean[] isVisited, int profundidade) {
        isVisited[current.num] = true;
        visit(current.num);
        for (Node dest : vertices.get(current.num).adj) {
            if (!isVisited[dest.num]){
                dfsSearch(dest, isVisited, profundidade + 1);
            }
        }
    }

    private void visit(int value) {
        System.out.println(" " + value);        
    }
}