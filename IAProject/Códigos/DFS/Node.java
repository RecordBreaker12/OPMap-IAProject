package dfs;

import java.util.ArrayList;

public class Node {
    int num;
    ArrayList<Node> adj = new ArrayList<>();
    
    public Node(int num){
        this.num = num;
    }
}