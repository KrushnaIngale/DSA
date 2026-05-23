import java.util.LinkedList;
import java.util.Queue;

class Pair{
    int r,c,t;
    Pair(int r,int c,int t){
        this.r=r;
        this.c=c;
        this.t=t;
    }
}

public class RottingOranges_994 {
    public static void main(String[] args) {
        int[][] grid = {
            {2, 1, 1},
            {1, 1, 0},
            {0, 1, 1}
        };
        RottingOranges_994 solution = new RottingOranges_994();
        int result = solution.orangesRotting(grid);
        System.out.println("Time taken to rot all oranges: " + result);
        
    }
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        int[][]visited=new int[n][m];
        Queue<Pair> q=new LinkedList<>();
        int freshCount=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                    visited[i][j]=2;
                }else{
                    visited[i][j]=0;
                }
                if(grid[i][j]==1)   freshCount++;
            }
        }

        int[] drow={-1,0,1,0};
        int[] dcol={0,1,0,-1};
        int count=0;
        int time=0;

        while(!q.isEmpty()){
            Pair curr=q.poll();
            int r=curr.r;
            int c=curr.c;
            int t=curr.t;
            time=Math.max(time,t);
            for(int i=0;i<4;i++){
                int nrow=r+drow[i];
                int ncol=c+dcol[i];

                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && visited[nrow][ncol]==0 && grid[nrow][ncol]==1){
                    q.add(new Pair(nrow,ncol,t+1));
                    visited[nrow][ncol]=2;
                    count++;
                }
            }
        }

        return count==freshCount?time:-1;
    }
}

