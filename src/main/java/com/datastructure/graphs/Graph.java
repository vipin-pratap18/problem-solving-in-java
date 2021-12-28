package com.datastructure.graphs;

import java.util.LinkedList;

public class Graph {
    int vertex;
    LinkedList<Integer> adjList[];

    public Graph(int vertex){
        this.vertex = vertex;
        adjList = new LinkedList[vertex];
        for(int i=0; i<vertex; i++){
            adjList[i] = new LinkedList<>();
        }
    }


    public void addEdge(int v, int w){
        adjList[v].add(w);
        adjList[w].add(v);
    }

    public Iterable<Integer> adj(int v){
        return adjList[v];
    }

    public void printGraph(){
        for(int i=0; i<vertex; i++){
            if(adjList[i].size() > 0){
                System.out.print("Vertex " + i + " is connected to: ");
                for(int j=0; j<adjList[i].size(); j++){
                    System.out.print(adjList[i].get(j) + " ");
                }
                System.out.println();
            }
        }
    }
    
}