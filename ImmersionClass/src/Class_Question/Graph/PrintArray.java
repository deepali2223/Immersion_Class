package Class_Question.Graph;

public class PrintArray {
    public static void main(String[] args) {
        int a [] []={ {1,2,3,4},{5,6,7,8}};
        boolean visited [][] = new boolean[a[0].length][a.length];
        print(a,0,0,visited);
    }
    private static void print(int a[][],int i,int j,boolean visited[][]){
        System.out.println(a[i][j]);
        if(i <0 || j<0 || i>=a[0].length || j >= a.length || visited[i][j] == true){
            return;
        }
        visited[i][j] = true;
        print(a,i+1,j,visited);
        print(a,i,j+1,visited);
        print(a,i-1,j,visited);
        print(a,i,j-1,visited);
        visited[i][j] = false;
    }

}
