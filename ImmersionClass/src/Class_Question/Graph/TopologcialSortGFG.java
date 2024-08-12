package Class_Question.Graph;

import java.util.ArrayList;
import java.util.Stack;

public class TopologcialSortGFG {
    static int[] topoSort(int v, ArrayList<ArrayList<Integer>> adj)
    {
        boolean visited[] = new boolean[v];
        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<v;i++){
            if(!visited[i]){
                topologySort(v,adj,stk,i,visited);
            }
        }

        int [] ans = new int[v];
        int i=0;
        while(!stk.isEmpty()){
            ans[i] = stk.pop();
            i++;
        }
        return ans;
    }
    private static void topologySort(int v,ArrayList<ArrayList<Integer>> adj,Stack<Integer> s,int src,boolean visited[]){
        visited[src] = true;
        ArrayList<Integer> nbr_list = adj.get(src);
        for(int nbr : nbr_list){
            if(!visited[nbr]){
                topologySort(v,adj,s,nbr,visited);
            }
        }
        s.push(src);

    }
}
