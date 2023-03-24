
class Graph{
    int size;
    List[] a;
    public Graph(String[] args){
        size=args.length;
        a=new List[size];
        for(int i=0;i<size;i++)
            a[i]=new List(args[i]);
    }


        public void add(String v, String w) {
           a[index(v)].add(index(w));
           a[index(w)].add(index(v));
        }  

        public  String toString() {
            if(size==0)return "{}";
            StringBuffer sb=new StringBuffer("{" + a[0]);
            for(int i=1;i<size;i++)
                sb.append(","+a[i]);
                return sb+"}";
        }

        public int index(String v) {
            for(int i=0;i<size;i++)
                if(a[i].vertex.equals(v))return i;
                return a.length;            
        }

        private class List{
            String vertex;
            Node edges;

            List(String vertex){
                this.vertex=vertex;
            }
            public void add(int  j){
                edges=new Node(j,edges);

            }
            public String toString(){
                StringBuffer sb=new StringBuffer(vertex);
                if(edges!=null)sb.append(":");

                for(Node p=edges;p!=null;p=p.next)
                sb.append(Graph.this.a[p.to].vertex);
                return sb+"";
            }
            private class Node{
                int to;
                Node next;
                Node(int to,Node next){
                    this.to=to;
                    this.next=next;
                }
            }
        }
    }

public class GraphAdjacencyList {
    public static void main(String[] args) {
        Graph g = new Graph(new String[] { "A", "B", "C", "D", "E","F","G","H" });
        System.out.println(g);
        g.add("A", "B");
        g.add("A", "E");
        g.add("B", "F");
        g.add("B", "C");
        g.add("C", "D");
        g.add("C", "H");
        g.add("D", "H");
        g.add("E", "F");
        g.add("F", "G");
        System.out.println(g);
    }
}
