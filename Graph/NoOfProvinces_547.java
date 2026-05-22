import java.util.ArrayList;

public class NoOfProvinces_547 {
    public static void main(String[] args) {
        int[][] isConnected = {
            {1, 1, 0},
            {1, 1, 0},
            {0, 0, 1}
        };
        NoOfProvinces_547 solution = new NoOfProvinces_547();
        int result = solution.findCircleNum(isConnected);
        System.out.println("Number of Provinces: " + result);
        
    }
    // public int findCircleNum(int[][] isConnected) {

    //     int V=isConnected.length;
    //     boolean[] visited=new boolean[V];
    //     int count=0;
    //     for(int i=0;i<V;i++){
    //         if(!visited[i]){
    //             count++;
    //             dfs(i,isConnected,visited);
    //         }
    //     }
    //     return count;
    // }

    // void dfs(int node,int[][] graph,boolean[] visited){
    //     visited[node]=true;
    //     for(int j=0;j<graph.length;j++){
    //         if(graph[node][j]==1 && !visited[j]){
    //             dfs(j,graph,visited);
    //         }
    //     }
    // }

    public int findCircleNum(int[][] isConnected) {
        int V=isConnected.length;
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();

        for(int i=0;i<V;i++){
            adj.add(new ArrayList<Integer>());
        }

        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }

        int count=0;
        boolean[] visited=new boolean[V];
        for(int i=0;i<V;i++){
            if(visited[i]==false){
                count++;
                dfs(i,adj,visited);
            }
        }
        return count;
    }

    void dfs(int node,ArrayList<ArrayList<Integer>>adj,boolean[] visited){
        visited[node]=true;
        for(int it: adj.get(node)){
            if(visited[it]==false){
                dfs(it,adj,visited);
            }
        }
    }
}
