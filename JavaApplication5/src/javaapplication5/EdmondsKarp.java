/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;


import java.util.*;


public class EdmondsKarp {
static class Edge {
    int s, t, rev, cap, f;

    public Edge(int s, int t, int rev, int cap) {
      this.s = s; //vermutlich source
      this.t = t; // vermutlich terminal
      this.rev = rev; // menge von Kanten der vog
      this.cap = cap; //kapazität der Kante
    }
  }
public EdmondsKarp(int numberOfVertices){
    List<Edge>[] graph = createGraph(numberOfVertices);
        addEdge(graph, 0, 1, 3); //von Knoten 0 nach Knoten 1 mit Kapazität von 3
        addEdge(graph, 0, 2, 2);
        addEdge(graph, 1, 2, 2);
        System.out.println("maximaler Flow" + maxFlow(graph, 0, 2));
}
  public static List<Edge>[] createGraph(int nodes) {
    List<Edge>[] graph = new List[nodes]; //erstellt Array von Listen mit Kanten objekten
    for (int i = 0; i < nodes; i++) //für 
      graph[i] = new ArrayList<>();
    return graph;
  }

  public static void addEdge(List<Edge>[] graph, int s, int t, int cap) {
    graph[s].add(new Edge(s, t, graph[t].size(), cap)); 
    graph[t].add(new Edge(t, s, graph[s].size() - 1, 0));
  }

  public static int maxFlow(List<Edge>[] graph, int s, int t) {
    int flow = 0;
    int[] q = new int[graph.length];
    while (true) {
      int qt = 0;
      q[qt++] = s;
      Edge[] pred = new Edge[graph.length];
      for (int qh = 0; qh < qt && pred[t] == null; qh++) {
        int cur = q[qh];
        for (Edge e : graph[cur]) {
          if (pred[e.t] == null && e.cap > e.f) {
            pred[e.t] = e;
            q[qt++] = e.t;
          }
        }
      }
      if (pred[t] == null)
        break;
      int df = Integer.MAX_VALUE;
      for (int u = t; u != s; u = pred[u].s)
        df = Math.min(df, pred[u].cap - pred[u].f);
      for (int u = t; u != s; u = pred[u].s) {
        pred[u].f += df;
        graph[pred[u].t].get(pred[u].rev).f -= df;
      }
      flow += df;
    }
    return flow;
  }
}
