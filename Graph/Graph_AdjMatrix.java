public class Graph_AdjMatrix{
    private boolean adjMatrix[][];
    private int numVertex;

    public Graph_AdjMatrix(int numVertex){
        this.numVertex = numVertex;
        adjMatrix = new boolean[numVertex][numVertex];
    }
    private void addEdge(int i, int j){
        if(i >= 0 && i < numVertex && j >=0 && j < numVertex){
            adjMatrix[i][j] = true;
            adjMatrix[j][i] = true;
        }
    }
    private void removeEdge(int i, int j){
        if(i >= 0 && i < numVertex && j >=0 && j < numVertex){
            adjMatrix[i][j] = false;
            adjMatrix[j][i] = false;
        }
    }
    private boolean isEdge(int i, int j){
        if(i >= 0 && i < numVertex && j >=0 && j < numVertex){
            return adjMatrix[i][j];
        }
        return false;
    }
    private void printGraph(){
       for(int i = 0 ; i < adjMatrix.length ; i++){
           for(int j = 0 ; j < adjMatrix[0].length ; j++){
            if(adjMatrix[i][j] == true){
                System.out.print(" 1 ") ;  
            }  else System.out.print(" 0 ");
           }
           System.out.print("\n") ;
       }
       System.out.print("------------\n") ;
    }
    public static void main(String[] args) {
        Graph_AdjMatrix firstGraph = new Graph_AdjMatrix(4);
        firstGraph.addEdge(0,1);
        firstGraph.addEdge(0,2);
        firstGraph.addEdge(0,4);
        firstGraph.addEdge(1,3);
        
        firstGraph.printGraph();
        System.out.println(firstGraph.isEdge(0, 1));
        firstGraph.removeEdge(0, 1);
        firstGraph.printGraph();
        firstGraph.isEdge(0, 4);
        System.out.println(firstGraph.isEdge(0, 1));        
    }
}
