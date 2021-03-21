
import java.io.*;
import java.util.*;

class Graph {

  static int MAX_POSSIBLE_VERTICES_COUNT = convertUpperChar('Z');

  private static LinkedList<Integer> adj[];

  static void constructGraph(char[] vertices) {

      adj = new LinkedList[MAX_POSSIBLE_VERTICES_COUNT];

      for (int i=0; i<vertices.length; ++i)
          adj[convertUpperChar(vertices[i])] = new LinkedList();
  }

  static void addEdge(char u, char v) {
      adj[convertUpperChar(u)].add(convertUpperChar(v));
  }

  static void traverse(char start) {

    int s = convertUpperChar(start);
    boolean visited[] = new boolean[MAX_POSSIBLE_VERTICES_COUNT];
    LinkedList<Integer> queue = new LinkedList<Integer>();

    visited[s]=true;
    queue.add(s);

    while (queue.size() != 0) {
        s = queue.poll();
        System.out.print(convertInt(s)+" ");
        Iterator<Integer> i = adj[s].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
                visited[n] = true;
                queue.add(n);
            }
        }
    }
  }

    static int convertUpperChar(char a) {
        return a - 'A';
    }

    static char convertInt(int a) {
        return (char) (a + (int) 'A');
    }

}

public class CompleteGraph {
  public static void main(String[] args) {
      Graph.constructGraph(new char[]{'R', 'G', 'V', 'E'});
      Graph.addEdge('R', 'G');
      Graph.addEdge('G', 'V');
      Graph.addEdge('V', 'E');
      Graph.addEdge('E', 'R');
      Graph.traverse('R');
  }
}
