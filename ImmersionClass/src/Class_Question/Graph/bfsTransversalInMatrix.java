package Class_Question.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class bfsTransversalInMatrix {
    public static void main(String[] args) {
        bfs(new int[][]{{1,2,3,4},
                { 5,6,7,8},
                {9,10,11,12}},3,4,0,0,new boolean[3][4]);
    }
    private static void completeBFS(int mat[][],int r,int c){
        boolean visited[][] = new boolean[r][c];
        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                if(!visited[i][j]){
                    bfs(new int[][]{{1,2,3,4},
                            { 5,6,7,8},
                            {9,10,11,12}},4,4,0,0,visited);
                }
            }
        }
    }
    private static void bfs(int [][] mat,int r,int c,int i,int j,boolean visited[][]){
   //     boolean visited[][] = new boolean[r][c];
        Queue<int[]> q = new LinkedList<>();
        visited[i][j] = true;
        q.add(new int[]{i,j});
        while(!q.isEmpty()){
            int[] a = q.remove();
            int cur_x = a[0];
            int cur_y = a[1];
            System.out.print(mat[cur_x][cur_y]+" ");
            int dx[] = {0,1};
            int dy[] = {1,0};
            for(int in=0;in<2;in++){
                int nbr_x = cur_x + dx[in];
                int nbr_y = cur_y + dy[in];
                if(nbr_x >= 0 && nbr_x <r && nbr_y >=0 && nbr_y < c && !visited[nbr_x][nbr_y]){
                    visited[nbr_x][nbr_y] = true;
                    q.add(new int[]{nbr_x,nbr_y});
                }
            }
        }
    }
}
