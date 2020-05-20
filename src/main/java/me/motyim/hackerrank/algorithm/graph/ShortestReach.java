package me.motyim.hackerrank.algorithm.graph;

import org.w3c.dom.Node;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

//https://www.hackerrank.com/challenges/bfsshortreach/problem
public class ShortestReach {
    static int[] bfs(int n, int m, int[][] edges, int s) {
        Graph graph = new Graph();
        for (int i = 1 ; i <= n ; i++){
            graph.addNode(i);
        }
        for (int i = 0; i < m; i++) {
            graph.addEdge(edges[i][0],edges[i][1]);
        }
        int[] arr = graph.shortestReach(s);
        int [] res = new int [n-1];
        for (int i = 0,j=0; i < arr.length; i++) {
            if(arr[i] == 0) continue;
            res[j++]= arr[i];
        }
        return res;
    }

    public static class Graph{

        HashMap<Integer, Node> lookup = new HashMap<>();

        private class Node{
            int id ;
            LinkedList<Node> adj = new LinkedList<>();
            Node(int id){
                this.id = id ;
            }
        }

        void addNode(int id){
            lookup.put(id,new Node(id));
        }
        Node getNode(int id){
            return lookup.get(id);
        }
        void addEdge(int source,int destination){
            Node s = getNode(source);
            Node d = getNode(destination);
            s.adj.add(d);
            d.adj.add(s);
        }

        public int[] shortestReach(int startId){
            LinkedList<Node> nextToVisit = new LinkedList<>();
            nextToVisit.add(getNode(startId));
            int[] distances = new int[lookup.size()];
            Arrays.fill(distances,-1);
            distances[startId-1] = 0;

            while (!nextToVisit.isEmpty()){
                Node node = nextToVisit.poll();
                for (Node child : node.adj) {
                    if(distances[child.id-1]==-1){
                        distances[child.id-1]=distances[node.id-1] + 6;
                        nextToVisit.add(child);
                    }
                }
            }
            return distances;
        }
    }
}
