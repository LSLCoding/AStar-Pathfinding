package pathfinding.system.algorithm.element;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter @Setter
public abstract class Node {

    private Node parent;
    private ArrayList<Node> neighbours;
    private double cost, heuristic, function;
    private boolean valid;

    public abstract void calculateNeighbours(Network network);
    
    public abstract double distanceTo(Node dest);
    
    public abstract double heuristic(Node dest);
    
    public void reverseValidation(){
        valid = !valid;
    }

}
