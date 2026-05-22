import java.util.ArrayList;

public class DfsTraversal{
    public static void main(String [] args){
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

        ArrayList<Integer> dfs = DfsOfGraph(V, adj);
        for (int i = 0; i < dfs.size(); i++) {
            System.out.print(dfs.get(i) + " ");
        }
        System.out.println();
    }
    static ArrayList<Integer>DfsOfGraph(int V, ArrayList<ArrayList<Integer>>adj){
        boolean[] visited=new boolean[V+1];
        ArrayList<Integer> ans=new ArrayList<>();
        dfs(0,visited,adj,ans);
        return ans;
    }
    static void dfs(Integer node,boolean[] visited,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ans){
        visited[node]=true;
        ans.add(node);
        for(Integer it:adj.get(node)){
            if(visited[it]==false){
                dfs(it,visited,adj,ans);
            }
        }
    }
}