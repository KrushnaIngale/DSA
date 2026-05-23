import java.util.LinkedList;
import java.util.Queue;

class Pair{
    int sr,sc;
    Pair(int sr,int sc){
        this.sr=sr;
        this.sc=sc;
    }
}

public class FloodFill_733 {
    public static void main(String[] args) {
        int[][] image = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };
        int sr = 1;
        int sc = 1;
        int color = 2;
        FloodFill_733 solution = new FloodFill_733();
        int[][] result = solution.floodFill(image, sr, sc, color);
        System.out.println("Flooded Image:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {      
        int myColor=image[sr][sc];
        if (myColor == color) return image;
        
        int m=image.length;
        int n=image[0].length;  
        Queue<Pair>q=new LinkedList<>();

        q.add(new Pair(sr,sc));
        image[sr][sc]=color;

        int[] drow={-1,0,1,0};
        int[] dcol={0,1,0,-1};
        while(!q.isEmpty()){
            Pair curr=q.poll();
            int r=curr.sr;
            int c=curr.sc;
            for(int i=0;i<4;i++){
                int nrow=r+drow[i];
                int ncol=c+dcol[i];
                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && image[nrow][ncol]==myColor){
                    q.add(new Pair(nrow,ncol));
                    image[nrow][ncol]=color;
                }
            }
        }
        return image;
    }
}
