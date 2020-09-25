package data_structures.graphs;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph2 {
    int numberOfNodes = 0;
    HashMap<Integer, ArrayList<Integer>> adjacentList = new HashMap<>();

    public void addVertex(int node) {
        adjacentList.put(node, new ArrayList<>());
        numberOfNodes++;
    }

    public void addEdge(int node1, int node2) {
        adjacentList.get(node1).add(node2);
        adjacentList.get(node2).add(node1);
    }

    public void showConnections() {
        for (Integer key : adjacentList.keySet()) {
            System.out.println("Node: " + key + " Edge List: " + adjacentList.get(key));
        }
    }

    public static void main(String[] args) {
        Graph2 newGraph = new Graph2();
        newGraph.addVertex(1);
        newGraph.addVertex(2);
        newGraph.addVertex(3);
        newGraph.addVertex(4);
        newGraph.addEdge(1, 2);
        newGraph.addEdge(1, 3);
        newGraph.addEdge(3, 4);
        newGraph.addEdge(1, 4);
        newGraph.showConnections();
    }
}

