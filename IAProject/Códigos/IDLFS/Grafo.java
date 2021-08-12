package ildfs;

import java.util.ArrayList;
import java.util.Stack;

public class Grafo{
    
    public boolean execute(No start, No goal, int limit){
        Stack<No> nodeStack = new Stack<>();
        ArrayList<No> visitedNodes = new ArrayList<>();
        nodeStack.add(start);

        int depth = 0;

        while(!nodeStack.isEmpty()){
            if(depth <= limit) {
                No current = nodeStack.pop();
                if (current.equals(goal)) {
                    System.out.println("Objetivo encontrado");
                    return true;
                } 
                else {
                    visitedNodes.add(current);
                    for(No check : current.adj){
                        if(!visitedNodes.contains(check)){
                            nodeStack.add(check);
                        }
                    }
                    depth++;

                }
            } 
            else {
                return false;
            }
        }
        return false;
    }
    
    public boolean executeInteractive(No start, No goal, int max){
        for(int i = 0; i<=max;i++){
            if(execute(start, goal, i)){
                System.out.println("Depth: " + i);
                return true;
            }
        }
        System.out.println("Objetivo nao encontrado no limite");
        return false;
    }
}
