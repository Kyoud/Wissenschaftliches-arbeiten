/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Kyodu
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String...arg)
    {
        int[][] graph;
        int numberOfNodes;
        int source;
        int sink;
        int maxFlow;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of nodes");
        numberOfNodes = scanner.nextInt();
        graph = new int[numberOfNodes + 1][numberOfNodes + 1];

        System.out.println("Enter the graph matrix");
        for (int sourceVertex = 1; sourceVertex <= numberOfNodes; sourceVertex++)
        {
           for (int destinationVertex = 1; destinationVertex <= numberOfNodes; destinationVertex++)
           {
               graph[sourceVertex][destinationVertex] = scanner.nextInt();
           }
        }

        System.out.println("Enter the source of the graph");
        source= scanner.nextInt();

        System.out.println("Enter the sink of the graph");
        sink = scanner.nextInt();
        
        FordFulkerson fordFulkerson = new FordFulkerson(numberOfNodes);
        long timeStart = System.nanoTime(); 
        maxFlow = fordFulkerson.fordFulkerson(graph, source, sink);
        long timeEnd = System.nanoTime(); 
        System.out.println("The Max Flow is " + maxFlow);
        System.out.println("Verlaufszeit der Schleife: " + (timeEnd - timeStart) + " Nanosekunden.");
        
        

         // Usage example
            // Driver program to test above functions
        // Let us create a graph shown in the above example
        int graph2[][] =new int[][] { {0, 16, 13, 0, 0, 0},
                                     {0, 0, 10, 12, 0, 0},
                                     {0, 4, 0, 0, 14, 0},
                                     {0, 0, 9, 0, 0, 20},
                                     {0, 0, 0, 7, 0, 4},
                                     {0, 0, 0, 0, 0, 0}
                                   };
        MaxFlow m = new MaxFlow(numberOfNodes);
        timeStart = System.nanoTime();
        maxFlow = m.fordFulkerson(graph2, source, sink);
        timeEnd = System.nanoTime(); 
        System.out.println("The maximum possible flow is " + maxFlow);
        System.out.println("Verlaufszeit der Schleife: " + (timeEnd - timeStart) + " Nanosekunden.");
        scanner.close();
  }
 }


