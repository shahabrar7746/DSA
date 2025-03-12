package graphs.tutorials;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Traversals {
private static List<Edge>[] graph = new ArrayList[7];
private static  boolean[] visited = new boolean[7];
    public static void main(String[] args) {
        int v = 7;
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));
        graph[0].add(new Edge(0,1));
        graph[2].add(new Edge(2,4));


//        graph[3].add(new Edge(3,4));
//        graph[3].add(new Edge(3,5));
//        graph[4].add(new Edge(4,5));
//
//        graph[5].add(new Edge(5,6));


       // graph[6].add(new Edge(6,5));
      //  bfs();
 // bfs(0);
        System.out.println(search(0, 7));
        dfs(0);
    }
    static void bfs(){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        while(queue.size() > 0){
            if(!visited[queue.peek()]){
                System.out.println(queue.peek());
                visited[queue.peek()] = true;
                for(Edge edge : graph[queue.poll()]){
                    queue.add(edge.getDest());
                }
            }else{
                queue.poll();
            }
        }

    }
    static boolean  search(int node, int val){
        List<Edge> edges = graph[node];
        for(Edge edge : edges){
            if(edge.getDest() == val){
                return true;
            }
          boolean found = search(edge.getDest(), val);
            if(found){
                return true;
            }
        }
        return false;

    }
    static  void  dfs(int node){
        for (Edge edge : graph[node]){
            if(!visited[edge.getDest()]){
                System.out.println(edge.dest);
                visited[edge.dest] = true;
                dfs(edge.dest);
            }
        }
    }
   static class Edge{
    private int src;
    private  int dest;
private int node;
        public Edge(int src, int dest) {
            this.node = src;
            this.src = src;
            this.dest = dest;
        }

       public int getNode() {
           return node;
       }

       public int getSrc() {
            return src;
        }


       @Override
       public String toString() {
           return "Edge{" +
                   "src=" + src +
                   ", dest=" + dest +
                   '}';
       }

       public int getDest() {
            return dest;
        }


    }


}
