package Class_Question.Graph;

import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode684 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findRedundantConnection(new int[][]{{1,2},{2,3},{3,4},{1,4},{1,5}})));
    }
    public static int[] findRedundantConnection(int[][] edges) {
        int v = edges.length;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        boolean visited[] = new boolean[v+1];
        for (int i = 0; i <=v; i++)
            graph.add(new ArrayList<Integer>());
        for(int [] edge : edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
            return dfs(graph,v,1,-1,visited);
        }
        return new int[0];
    }
        private static int[] dfs(ArrayList<ArrayList<Integer>> graph, int v, int s, int parent, boolean visited[]) {
            visited[s] = true;
            ArrayList<Integer> nbr_list = graph.get(s);
            for (Integer nbr : nbr_list) {
                if (!visited[nbr]) {
                    return dfs(graph, v, nbr, s, visited);
                }
                if (nbr != parent) {
                    return new int[]{parent,s};
                }
            }
            return new int[0];
        }

}

