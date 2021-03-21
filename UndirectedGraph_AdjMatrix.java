package UndirectedGraph;

import java.util.ArrayList;
class Edge{
    int startVertex;
    int endVertex;

    public Edge(int start, int end){
        this.startVertex = start;
        this.endVertex = end;
    }
}

public class UndirectedGraph_AdjMatrix {
    public static void main(String[] args) {
        //num of vertexes
        int vertex = 5;
        //create a adjacency matrix with length 6, because it will be matrix 5:5
        int[][] matrix = new int[vertex+1][vertex+1];

        //creating arraylist with Edge class
        ArrayList<Edge> edgeList = new ArrayList<Edge>();

        //assigning to edgeList start and end vertexes: start-> end and end->start, because it's undirected graph
        edgeList.add(new Edge(1,4));
        edgeList.add(new Edge(4,1));
        edgeList.add(new Edge(4,2));
        edgeList.add(new Edge(2,4));
        edgeList.add(new Edge(2,5));
        edgeList.add(new Edge(5,2));
        edgeList.add(new Edge(3,5));
        edgeList.add(new Edge(5,3));
        edgeList.add(new Edge(3,1));
        edgeList.add(new Edge(1,3));
        edgeList.add(new Edge(3,4));
        edgeList.add(new Edge(4,3));

        //fill the matrix
        for (int i = 0; i < edgeList.size(); i++){
            Edge currentEdge = edgeList.get(i);
            int startVertex = currentEdge.startVertex;
            int endVertex = currentEdge.endVertex;
            matrix[startVertex][endVertex] = 1;

        }

        //printing the matrix
        for (int i = 1; i <= vertex; i++){
            for (int j = 1; j <= vertex; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
