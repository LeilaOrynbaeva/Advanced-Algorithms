package UndirectedGraph;

import java.beans.IntrospectionException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

class ImpGraph {
    //number of vertexes
    int vertex;
    //create adjacency list
    ArrayList<ArrayList<Integer>> adjList ;

    public ImpGraph(int nodes){
        //assign parameters nodes to vertex
        vertex = nodes;
        adjList = new ArrayList<ArrayList<Integer>>();
        //add ArrayList to adjacency list vertex times
        for (int i = 0; i < vertex; i++){
            adjList.add(new ArrayList<Integer>());
        }
    }
    //addEdge
    void addEdge( int v1, int v2){
        //add one vertex to another and vice versa, because it undirected graph
        adjList.get(v1).add(v2);
        adjList.get(v2).add(v1);

    }

    void printGraph(){
        //printing vertex
        for (int i = 0; i < adjList.size(); i++){
            System.out.print("\nVertex " + i + ":");
            //printing vertexes that connected to it
            for (int j = 0; j < adjList.get(i).size(); j++){
                System.out.print(" -> " + adjList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

}

public class UndirectedGraph_WithAdjacencyList {

    public static void main(String[] args) {
        ImpGraph graph = new ImpGraph(6);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,5);
        graph.addEdge(5,4);
        graph.addEdge(4,1);
        graph.addEdge(4,3);

        graph.printGraph();

    }
}
