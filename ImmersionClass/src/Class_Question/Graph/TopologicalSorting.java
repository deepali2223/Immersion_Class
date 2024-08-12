package Class_Question.Graph;

import java.util.ArrayList;
import java.util.Scanner;
//directed acyclic graph
public class TopologicalSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        int edges[][] = new int[v][2];
        for(int i=0;i<e;i++){
            for(int j=0;j<2;j++){
                edges[i][j] = sc.nextInt();
            }
        }
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        boolean visited[] = new boolean[v + 1];
        int in_deg[] = new int[e];
        for (int i = 0; i <= v; i++)
            graph.add(new ArrayList<Integer>());
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
//            graph.get(edge[1]).add(edge[0]);
            in_deg[edge[1]]++;
        }
    }

}
