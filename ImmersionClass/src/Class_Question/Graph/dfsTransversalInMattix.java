package Class_Question.Graph;

public class dfsTransversalInMattix {
    public static void main(String[] args) {
        boolean visited[][] = new boolean[4][4];
        dfs(new int[][]{{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},{13,14,15,16}},0,0,4,4,visited);
    }
    private static void dfs(int a[][],int i,int j,int n,int m,boolean visited[][]){
        System.out.println(a[i][j]);
        int x[] = {1,0,-1,0};
        int y[] = {0,1,0,-1};
        for(int in=0;in<y.length;i++){
            int new_i = x[i]+ i;
            int new_j = y[i]+ j;
            if(i>=0 || i<n || j>=0 || j<m || visited[i][j] == true){
                visited[i][j] = true;
                dfs(a,new_i,new_j,n,m,visited);
                visited[i][j] = false;
            }
        }
    }
}
