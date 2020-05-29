package me.motyim.training;


import java.util.*;

//https://www.youtube.com/watch?v=oDqjPvD54Ss
//https://www.youtube.com/watch?v=zaBhtODEL0w

public class MyGraph {

    private HashMap<Integer,Node> nodeLookup = new HashMap<>();
    public static class Node{
        private int id ;
        LinkedList<Node> adj = new LinkedList<>();
        private Node(int id){
            this.id = id;
        }
    }


    public void addNode(int id) {
        nodeLookup.put(id, new Node(id));
    }

    private Node getNode(int id){
        return nodeLookup.get(id);
    }

    public void addEdge(int source , int destination){
        Node s = getNode(source);
        Node d = getNode(destination);
        s.adj.add(d);
    }

    public boolean hasPathDFS(int source, int destination){
        Node s = getNode(source);
        Node d = getNode(destination);
        HashSet visited = new HashSet<Integer>();
        return hasPathDFS(s,d,visited);

    }

    private boolean hasPathDFS(Node s, Node d, HashSet visited) {
        if(visited.contains(s.id)) return false;

        visited.add(s.id);
        System.out.println(s.id);

        if(s == d) return true;

        for (Node child :s.adj) {
            if(hasPathDFS(child,d,visited)) return true;
        }
        return false;
    }

    public boolean hasPathBFS(int source , int destination){
        return hasPathBFS(getNode(source),getNode(destination));
    }

    private boolean hasPathBFS(Node start, Node end) {
        LinkedList<Node> nextToVisit = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();

        nextToVisit.add(start);
        int [] path = new int[nodeLookup.size()];
        path[start.id-1] = -1;

        while (!nextToVisit.isEmpty()){
            Node node = nextToVisit.poll();
            System.out.println(node.id + " ");
            if(node == end){
                constractPath(start,end,path);
                return true;
            }


            if(visited.contains(node.id)) continue;

            visited.add(node.id);



            for (Node child : node.adj) {
                if(nextToVisit.contains(child)) continue;
                nextToVisit.add(child);
                path[child.id-1] = node.id-1;
            }
        }
        return false;
    }

    private void constractPath(Node start, Node end, int[] path) {
        System.out.println("Constract Path");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(end.id);
        int itr = end.id-1;
        while(path[itr] != -1){
            list.add(path[itr]+1);
            itr = path[itr];
        }
        System.out.print("Path : ");
        for (int i = list.size()-1; i >= 0  ; i--) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyGraph graph = new MyGraph();
        graph.addNode(1);
        graph.addNode(2);
        graph.addNode(3);
        graph.addNode(4);
        graph.addNode(5);
        graph.addNode(6);

        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,5);
        graph.addEdge(5,4);
        graph.addEdge(3,4);
        graph.addEdge(3,6);

        System.out.println(graph.hasPathBFS(1,4));
    }

}
