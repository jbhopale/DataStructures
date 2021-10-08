/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class CloneGraphBFS {
    private Map<Node, Node> map = new HashMap<>();
    public Node cloneGraph(Node node) {
    if(node == null) return null;
    Queue<Node> queue = new LinkedList<Node>();
    Node clonedNode = new Node(node.val, new ArrayList<>());
    queue.offer(node);
    map.put(node, clonedNode);
    while(!queue.isEmpty()){
        Node temp = queue.poll();
        for(Node n: temp.neighbors){
            if(!map.containsKey(n)) {
                map.put(n, new Node(n.val, new ArrayList<>()));
                queue.offer(n);
            }
            map.get(temp).neighbors.add(map.get(n));
        }
    }
    return clonedNode;
    }
}

