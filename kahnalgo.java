import java.util.ArrayList;

class graph
{
    int V;
    List<Integer> adj[];
    public graph{
        this.V=V;
        adj=new ArrayList[V];
        for(int i=0;i<V;i++)
        {
            adj[i]=new ArrayList<Integer>();
        }
        public void addedge(int u,int v)
        {
            adj[u].add(v);
        }
        static int[] toposort()
        {
            int indegree[]=new int[V];
            
        }
    }
}
public class kahnalgo {
    public static void main(String[] args) {
        graph g=new graph(6);
        g.addedge(5,0);
        g.addedge(5,2);
        g.addedge(2,3);
        g.addedge(3,1);
        g.addedge(4,1);
        g.addedge(4,0);
        System.out.println("Topological sort using Kahn's algorithm is:");
        int[] ans=new int[6];
        ans=g.toposort();
    }

}
