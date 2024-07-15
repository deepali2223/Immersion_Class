package Class_Question;

import java.util.HashMap;
import java.util.HashSet;

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
    public static void main(String[] args) {
        DoesPathExist g = new DoesPathExist(7);
        //g.add();
    }
}
