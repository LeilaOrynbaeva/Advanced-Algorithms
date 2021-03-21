package DirectedGraph;

import java.util.ArrayList;
import java.util.*;


class Edge{
    //create start vertex
    int startVertex;
    //create end vertex
    int endVertex;
    //initializing method that will set new start, end vertexes to vertexes of this class
    public Edge(int startVertex, int endVertex){
        this.startVertex = startVertex;
        this.endVertex = endVertex;
    }
}

public class DirectedGraph_AdjMatrix {
    public static void main(String[] args) {
        //number of vertexes
        int vertex = 5;
        //creating a matrix 5:5, so we create matrix with length 6:6 to start from 1
        int [][] matrix = new int[vertex+1][vertex+1];

        //create ArrayList with Edge class object
        ArrayList<Edge> adjList = new ArrayList<Edge>();

        //store information
        adjList.add(new Edge(1,2));
        adjList.add(new Edge(2,3));
        adjList.add(new Edge(3,5));
        adjList.add(new Edge(5,4));
        adjList.add(new Edge(4,3));
        adjList.add(new Edge(4,1));

        //update matrix
        for (int i = 0; i < adjList.size(); i++){
            //get the edge, for ex Edge(1,4)
            Edge currentEdge = adjList.get(i);
            //startVertex = 1
            int startVertex = currentEdge.startVertex;
            //endVertex = 4
            int endVertex = currentEdge.endVertex;
            //fill the matrix, matrix[1][4]
            matrix[startVertex][endVertex] = 1;
        }

        //print matrix
        for (int i = 1; i <= vertex; i++){
            for (int j = 1; j <= vertex; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
