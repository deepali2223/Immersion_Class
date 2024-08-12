package Class_Question.Graph;

import java.util.ArrayList;

public class DetechCycleUsingDFS {
    public static void main(String[] args) {
        int v = 5;
        boolean visited[] = new boolean[v];
    }

    private static boolean dfs(ArrayList<ArrayList<Integer>> graph, int v, int s, int parent, boolean visited[]) {
        visited[s] = true;
        ArrayList<Integer> nbr_list = graph.get(s);
        for (Integer nbr : nbr_list) {
            if (!visited[nbr]) {
                return dfs(graph, v, nbr, s, visited);
            }
            if (nbr != parent) {
                return true;
            }
        }
        return false;
    }
//    private static boolean dfsfordirectedGraph(ArrayList<ArrayList<Integer>> graph,int v,int s,boolean intPath[],boolean visited[]){
//        visited[s] = true;
    //    inPath[s] = true;
//        ArrayList<Integer> nbr_list = graph.get(s);
//        for(Integer nbr: nbr_list){
//            if(!visited[nbr]){
//                return dfs(graph,v,nbr,s,visited);
//            }
    //     if(inPath[nbr]){
    //      return true
    //      }
//
//        }
//    inPath[s] = false;
//        return false;
    }
