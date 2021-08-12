package dlfs;

import java.util.ArrayList;
import java.util.Stack;

public class Grafo extends AbsSearch {
    int depth = 0;
    int limit = 40;

    public Grafo(No start, No goalNode){
        super(start, goalNode);
        this.startNode = start;
        this.goalNode = goalNode;
    }

    @Override
    public boolean execute(){
        Stack<No> nodeStack = new Stack<>();
        ArrayList<No> visitedNodes = new ArrayList<>();
        nodeStack.add(startNode);

        depth = 0;

        while(!nodeStack.isEmpty()){
            if(depth <= limit) {
                No current = nodeStack.pop();
                if (current.equals(goalNode)) {
                    System.out.println("Objetivo encontrado.");
                    System.out.println("Profundidade: " + depth);
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
                System.out.println("Objetivo nao encontrado no limite");
                return false;
            }
        }
        System.out.println("Objetivo nao encontrado no limite");
        return false;
    }
}