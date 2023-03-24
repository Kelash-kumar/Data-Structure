
class Graph {
    int size;
    String[] vertices;
    boolean[][] a; // adjacency matrixl

    public Graph(String[] args) {
        size = args.length;
        vertices = new String[size];
        System.arraycopy(args, 0, vertices, 0, size);
        a = new boolean[size][size];
    }

    public void add(String v, String w) {
        int i = index(v), j = index(w);
        a[i][j] = a[j][i] = true;
    }

    public String toString(){
        if(size==0)return "{}";

        StringBuffer sb=new StringBuffer("{" + vertex(0));

        for(int i=1;i<size;i++)
            sb.append(","+vertex(i));
            return sb+"}";
        
    }

        public int index(String v) {
            for(int i=0;i<size;i++)
                if(vertices[i].equals(v))return i;
                return a.length;
            
        }

        public  String vertex(int i) {
            StringBuffer sb=new StringBuffer(vertices[i]+":");
            for(int j=0;j<size;j++)
                 if(a[i][j])sb.append(vertices[j]);
                 return sb + "";
            
        }

    }



public class GraphAdjancencyMAtrix {
    public static void main(String[] args) {
        Graph g = new Graph(new String[] { "A", "B", "C", "D", "E" });
        System.out.println(g);
        g.add("A", "B");
        g.add("A", "C");
        g.add("B", "C");
        g.add("B", "D");
        g.add("C", "D");
        g.add("D", "E");
        System.out.println(g);
    }
}