package pathfinding.system.element;

import java.util.ArrayList;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import pathfinding.system.algorithm.element.Network;
import pathfinding.system.algorithm.element.Node;

@Getter @Setter @RequiredArgsConstructor
public class Grid extends Network {

    private final int width, height;
    private final ArrayList<Tile> tiles;

    public Tile find(int x, int y){
        for(Tile t : tiles){
            if(t.getX() == x && t.getY() == y)
                return t;
        }

        return null;
    }

    @Override
    public Iterable<Node> getNodes() {
        ArrayList<Node> nodes = new ArrayList<>();
        nodes.addAll(tiles);
        return nodes;
    }
}
