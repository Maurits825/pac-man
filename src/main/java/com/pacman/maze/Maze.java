package com.pacman.maze;

import net.runelite.api.coords.WorldPoint;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Maze {

    private Node[][] walls;
    private Queue<Node> nodes = new ArrayDeque<>();

    public void buildMaze(int size, WorldPoint playerPosition) {
        walls = new Node[size + 2][size + 2];
        nodes.add(walls[0][0]);
    }

    public void dfs() {
        if (walls.length == 0) {
            return;
        }
        else {
            Node currentNode = nodes.peek();

        }
    }

    public List<Node> getNeighbours(Node node) {
        List<Node> neighbours = new ArrayList<>();

        for (int x: new int[]{-2, 2}) {
            for (int y: new int[]{-2, 2}) {
                Node neighbour;
                try {
                    neighbour = walls[node.getX() + x][node.getY() + y];
                }
                catch (IndexOutOfBoundsException e) {
                    continue;
                }

                if (!neighbour.isDiscovered()) {
                    neighbours.add(neighbour);
                }
            }
        }

        return neighbours;
    }
}
