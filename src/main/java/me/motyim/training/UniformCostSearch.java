package me.motyim.training;

import java.util.*;
//https://www.geeksforgeeks.org/uniform-cost-search-dijkstra-for-large-graphs/
//https://www.youtube.com/watch?v=dRMvK76xQJI

public class UniformCostSearch {
    static class Graph {

        private HashMap<Integer, Node> nodeLookup = new HashMap<>();


        public class Node {
            private int id;
            private int cost;
            LinkedList<Edge> adj = new LinkedList<>();

            private Node(int id) {
                this.id = id;
            }
        }

        public class Edge {
            Node toNode;
            int cost;

            public Edge(Node toNode, int cost) {
                this.toNode = toNode;
                this.cost = cost;
            }
        }

        public class Pair{
            Node node;
            int cost;

            public Pair(Node node, int cost) {
                this.node = node;
                this.cost = cost;
            }
        }

        public class NodeComparator implements Comparator<Pair>{
            @Override
            public int compare(Pair o1, Pair o2) {
                return Integer.compare(o1.cost,o2.cost);
            }
        }

        public void addNode(int id) {
            nodeLookup.put(id, new Node(id));
        }

        private Node getNode(int id) {
            return nodeLookup.get(id);
        }

        public void addEdge(int source, int destination, int cost) {
            Node s = getNode(source);
            Node d = getNode(destination);
            s.adj.add(new Edge(d, cost));
        }


        public int uniformSearch(int start, int end) {
            return uniformSearch(getNode(start), getNode(end));
        }

        private int uniformSearch(Node start, Node end) {
            HashSet<Node> visited = new HashSet<>();
            PriorityQueue<Pair> queue = new PriorityQueue<>(new NodeComparator());
            queue.add(new Pair(start,0));

            while(!queue.isEmpty()){
                Pair pair = queue.poll();
                Node node = pair.node;
                if(visited.contains(node)) continue;
                visited.add(node);
                node.cost = pair.cost;

                for (Edge edge : node.adj) {
                    Node child = edge.toNode;
                    int cost = (pair.cost+edge.cost);
                    if(visited.contains(child) && child.cost < cost ) continue;
                    queue.add(new Pair(child,cost));
                }

            }

            return end.cost;
        }


    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        //s
        graph.addNode(0);
        graph.addNode(1);
        graph.addNode(2);
        graph.addNode(3);
        graph.addNode(4);
        graph.addNode(5);
        //g
        graph.addNode(6);


        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 3, 5);
        graph.addEdge(1, 6, 1);
        graph.addEdge(3, 1, 5);
        graph.addEdge(3, 6, 6);
        graph.addEdge(3, 4, 2);
        graph.addEdge(4, 2, 4);
        graph.addEdge(4, 5, 3);
        graph.addEdge(5, 2, 6);
        graph.addEdge(5, 6, 3);
        graph.addEdge(2, 1, 4);
        graph.addEdge(6, 4, 7);

        int cost = graph.uniformSearch(0,2);
        System.out.println("Cost : "+cost);
    }


}


