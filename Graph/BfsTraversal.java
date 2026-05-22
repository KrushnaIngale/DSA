import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BfsTraversal{
    public static void main(String[] args) {
        int V=5;
        int E=6;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        // Example edges for a graph with 5 vertices
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);
        
         ArrayList<Integer> bfs=bfs(V,E,adj);
         for(int i=0;i<bfs.size();i++){
            System.out.println(bfs.get(i)+" ");
            
         }
    }
    public static ArrayList<Integer> bfs(int V,int E,ArrayList<ArrayList<Integer>> adj){
        int[] visited=new int[V];
        ArrayList<Integer> bfs=new ArrayList<>();
        
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        visited[0]=1;

        while(!q.isEmpty()){
            Integer node=q.poll();
            bfs.add(node);

            for(Integer it:adj.get(node)){
                if(visited[it]==0){
                    visited[it]=1;
                    q.add(it);
                }
            }
        }
        return bfs;
    }
}