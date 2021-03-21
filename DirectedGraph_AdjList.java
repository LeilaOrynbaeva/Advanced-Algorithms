package DirectedGraph;

import java.util.ArrayList;

class Graph {
    //number of vertexes
    int vertex;
    //create adjacency list
    ArrayList<ArrayList<Integer>> adjList ;

    public Graph(int nodes){
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
        adjList.get(v1).add(v2);

    }

    void printGraph(){
        //printinf vertex
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
class DirectedGraph_AdjList{
    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,5);
        graph.addEdge(5,4);
        graph.addEdge(4,1);
        graph.addEdge(4,3);

        graph.printGraph();

    }
}
