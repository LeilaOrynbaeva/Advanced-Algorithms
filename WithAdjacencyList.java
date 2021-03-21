package UndirectedGraph;

import java.beans.IntrospectionException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class WithAdjacencyList {

    //adding edges to each arraylist in arraylist
    static void addEdge(ArrayList<ArrayList<Integer>> valueList, int s, int d){
        valueList.get(s).add(d);
        valueList.get(d).add(s);
    }

    static void printGraph(ArrayList<ArrayList<Integer>> valueList){
        for (int i = 0; i < valueList.size(); i++){
            System.out.println("\nVertex " + i + ":");
            for (int j = 0; j < valueList.get(i).size(); j++){
                System.out.println(" -> " + valueList.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int vertex = 5;
        ArrayList<ArrayList<Integer>> valueList = new ArrayList<ArrayList<Integer>>(vertex);
        for (int i = 0; i < vertex; i++){
            valueList.add(new ArrayList<Integer>(i));
        }
        addEdge(valueList, 0, 1);
        addEdge(valueList, 0, 2);
        addEdge(valueList, 0, 3);
        addEdge(valueList, 1, 2);

        printGraph(valueList);

    }
}
