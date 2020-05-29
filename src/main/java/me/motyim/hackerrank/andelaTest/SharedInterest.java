package me.motyim.hackerrank.andelaTest;

import javafx.util.Pair;
import me.motyim.training.UniformCostSearch;

import java.util.*;

public class SharedInterest {


    private static class Graph{
        Map<Integer, Node> map = new HashMap<>();

        public void addNode(int id){
            map.put(id,new Node(id));
        }
        public Node getNode(int id){
            return map.get(id);
        }
        public void addEdge(int source,int destianction,int cost){
            Node from = getNode(source);
            Node to = getNode(destianction);
            from.adj.add(new Edge(to,cost));
        }

        public int sharedIntersed(int start){
            return sharedIntersed(map.get(start));
        }

        private int sharedIntersed(Node start) {
            HashSet<Node> visited = new HashSet<>();
            LinkedList<Node> nextToVisit = new LinkedList<>();
            Map<Integer, Queue<Integer>> map = new HashMap<>();
            nextToVisit.add(start);

            while(!nextToVisit.isEmpty()){
                Node node = nextToVisit.poll();

                if(visited.contains(node)) continue;

                for (Edge edge : node.adj) {
                    int key = edge.cost;
                    Queue<Integer> queue;
                    if(map.containsKey(key)){
                        queue = map.get(key);
                    }else{
                        queue = new PriorityQueue<>(Collections.reverseOrder());
                    }
                    queue.add(edge.toNode.id);
                    if(!queue.contains(node.id)) queue.add(node.id);
                    map.put(key,queue);
                    nextToVisit.add(edge.toNode);
                }
                visited.add(node);
            }

            return calcSharedIntesed(map) ;
        }

        private int calcSharedIntesed(Map<Integer, Queue<Integer>> map) {
            int max = 0 ;
            int maxKey = 0;
            for (Integer key : map.keySet()) {
                if(map.get(key).size() > max) {
                    max = map.get(key).size();
                    maxKey=key;
                }
            }

            Queue<Integer> integers = map.get(maxKey);
            return integers.poll()*integers.poll();
        }

    }
    private static class Node{
        int id ;
        List<Edge> adj;
        Node(int id){
            this.id = id;
            adj = new LinkedList<>();
        }
    }
    private static class Edge {
        Node toNode;
        int cost;

        public Edge(Node toNode, int cost) {
            this.toNode = toNode;
            this.cost = cost;
        }
    }



    public static int maxShared(int friendsNodes, List<Integer> friendsFrom, List<Integer> friendsTo, List<Integer> friendsWeight) {

        Graph graph = new Graph();
        for (int i = 1; i <= friendsNodes; i++) {
            graph.addNode(i);
        }
        for (int i = 0; i < friendsFrom.size(); i++) {
            graph.addEdge(friendsFrom.get(i),friendsTo.get(i),friendsWeight.get(i));
        }

        return graph.sharedIntersed(friendsFrom.get(0));
    }
}
