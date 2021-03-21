import java.io.*; 
import java.util.*; 
import java.util.Random; 
  
public class DirectedAcyclicGraph { 
    
    public static boolean isAcyclic(int[][]    edges, int ed, 
                                    boolean[] visited, int v) { 
        int i; 
        
        if (visited[v] == true) 
            return false; 
        else { 
            visited[v] = true; 
            for (i = ed; i >= 0; i--) { 
                if (edges[i][0] == v) 
                  return isAcyclic(edges, ed, visited, edges[i][1]);
            } 
        } 
        visited[v] = false; 
        if (i == 0) 
            return true; 
        return true; 
    } 
    
    public static void main(String args[]) { 
        int[][] edges = new int[9][2];

        edges[0][0] = 1;
        edges[0][1] = 2;

        edges[1][0] = 1;
        edges[1][1] = 3;

        edges[2][0] = 2;
        edges[2][1] = 4;

        edges[3][0] = 2;
        edges[3][1] = 5;

        edges[4][0] = 3;
        edges[4][1] = 6;

        edges[5][0] = 6;
        edges[5][1] = 5;

        edges[6][0] = 6;
        edges[6][1] = 7;

        edges[7][0] = 4;
        edges[7][1] = 7;

        edges[8][0] = 5;
        edges[8][1] = 7;

        System.out.println(isAcyclic(edges, 7, new boolean[9], 1));

    } 
}