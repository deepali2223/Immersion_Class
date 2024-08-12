package Class_Question.Graph;

import java.util.*;

public class DoesPathExist {
    private HashMap<Integer, HashSet<Integer>> graph;
    public DoesPathExist(int vertices){
        this.graph = new HashMap<>();
        for(int i= 1;i<=5;i++){
           this.graph.put(i,new HashSet<>());
        }
    }
    public void add(int v1,int v2){
        this.graph.get(v1).add(v2);
        this.graph.get(v2).add(v1);
    }
    public boolean hasPath(int v1,int v2){
        HashSet<Integer> visited = new HashSet<>();
        return hasPath(v1,v2,visited);
    }
    //DFS
    public boolean hasPath(int cur,int end,HashSet<Integer> status){
        if(cur == end){
            return true;
        }
        status.add(cur);
        HashSet<Integer> choice = this.graph.get(cur);
        boolean exist = false;
        for(int nbr: choice) {
            if (status.contains(nbr)) {
                exist = hasPath(nbr, end, status);
                if (exist) break;
            }
        }
        status.remove(cur);
        return exist;
    }
    public void BFS() {
        Queue<Integer> queue = new LinkedList<>();
        int c = 0;
        HashSet<Integer> visited = new HashSet<>();
        for(Integer src : this.graph.keySet()){
         //if we count no of times it loops then no of compoment can be found
        if(visited.contains(src)) {
            c++;
            continue;
        }
    }
       // HashSet<Integer> visited = new HashSet<>();
        //61queue.add(src);
        queue.add(1);
        while(!queue.isEmpty()){
            //remove
            int cur = queue.remove();
            if(visited.contains(cur)){
                continue;
            }
            System.out.println(cur+" ");
            visited.add(cur);
           HashSet<Integer> map = this.graph.get(cur);
           for(int nbr : map){
               if(visited.contains(nbr)){
                   queue.add(nbr);
               }
           }
        }

    }
    public int doesCycleExist(){
        Queue<Integer> queue = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        queue.add(1);
        int c = 0;
        while(!queue.isEmpty()){
            int cur = queue.remove();
            if(visited.contains(cur)){
                c++;
                continue;
            }
            System.out.println(cur+" ");
            visited.add(cur);
            HashSet<Integer> map = this.graph.get(cur);
            for(int nbr : map){
                if(visited.contains(nbr)){
                    queue.add(nbr);
                }
            }
        }
        return c;
    }
    /*
    for toplogy sorting in dfs (adding stack)
    public static void DFS(graph,int s,int v,HashSet<Integr> visited>,Stack stack){
       sout(s);
       for(int nbr : graph.keySet){
       if(!visited.contains(nbr)){
       DFS(graph,s,nbr,visited);
       }
       stack.push(s);
       }
       print stack
     */
    public static int findNoOfGoodComponent(int e ,int v,int edges[][]){
        HashSet<Integer> visited = new HashSet<>();
        for(int i=1;i<=v;i++){
          //  dfs(i,v,edges,visited);
        }
        return 0;
    }

//    private static int dfs(int s, int v, int[][] edges, HashSet<Integer> visited) {
//        for(int i = 0 ;i< edges.length;i++) {
//            for (int j = 0; j < edges.length; j++) {
//                if (edges[i][0] == s) {
//                    if (!visited.contains(edges[i][j]))
//                        dfs(j,v,edges,visited);
//                }
//            }
//        }
//
//      return 0;
//    }
    //copied
//    class Solution {
//        public int findNumberOfGoodComponent(int V, ArrayList<ArrayList<Integer>> adj) {
//            // Code here
//            boolean vis[]=new boolean[V+1];
//            int cntcomp=0;
//            for(int i=1;i<=V;i++){
//                if(!vis[i]){
//                    int cnt[]=new int[1];
//                    int cntedge[]=new int[1];
//                    dfs(i,vis,adj,cnt,cntedge);
//                    if(cntedge[0]/2==(cnt[0]*(cnt[0]-1))/2){
//                        cntcomp++;
//                    }
//                }
//            }
//            return cntcomp;
//        }
//        public void dfs(int node,boolean vis[],ArrayList<ArrayList<Integer>> adj,int[] cnt,int[] cntedge){
//            vis[node]=true;
//            cnt[0]++;
//            for(int adjnode:adj.get(node)){
//                cntedge[0]++;
//                if(!vis[adjnode]){
//                    dfs(adjnode,vis,adj,cnt,cntedge);
//                }
//            }
//        }
//    }

    public static void main(String[] args) {
        DoesPathExist g = new DoesPathExist(7);

    }
}
