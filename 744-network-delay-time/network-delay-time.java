class Solution {
    static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int s,int d,int w){
            src = s;
            dest = d;
            wt = w;
        }
    }

    static class Pair implements Comparable<Pair>{
        int node;
        int dist;

        public Pair(int n, int d){
            node = n;
            dist = d;
        }
        @Override
        public int compareTo(Pair p2){
            return this.dist - p2.dist;
        }
    }


    public int networkDelayTime(int[][] times, int n, int k) {

        ArrayList<Edge>[] graph = new ArrayList[n+1];

        for(int i=0;i<=n;i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int[] t : times){
            int src = t[0];
            int dest = t[1];
            int wt = t[2];

            graph[src].add(new Edge(src,dest,wt));
        }
        int[] dist = new int[n+1];

        for(int i=0; i<=n; i++){
            dist[i] = Integer.MAX_VALUE;
        }
        dist[k] = 0;

        boolean[] vis = new boolean[n+1];

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(k,0));

        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.node]){
                vis[curr.node] = true;

                for(int i=0;i<graph[curr.node].size(); i++){
                    Edge e = graph[curr.node].get(i);

                    int u = e.src;
                    int v = e.dest;
                    int w = e.wt;

                    if(dist[u] != Integer.MAX_VALUE && 
                        dist[u] + w < dist[v]){ 

                        dist[v] = dist[u] + w;
                        pq.add(new Pair(v,dist[v]));
                    }
                }
            }
        }
        int ans = 0;

        for(int i=1; i<=n ; i++){
            if(dist[i] == Integer.MAX_VALUE){
                return -1;
            }
            ans = Math.max(ans,dist[i]);
        }
        return ans;
    }

}