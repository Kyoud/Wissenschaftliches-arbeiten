/**
 * Created by Kyodu on 25.03.17.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;


public class MaximumFlow {

    public static void main(String...arg)throws IOException{

        int[][] graph;
        int numberOfNodes;
        int source;
        int sink;
        int maxFlowD =0;
        int maxFlowK =0;
        long timeStart;
        long timeEnd;
        String filename = "log3_viel.csv";
        FileWriter fw = new FileWriter(filename, true); //the true will append the new data

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of nodes");
        numberOfNodes = scanner.nextInt();
        graph = new int[numberOfNodes + 1][numberOfNodes + 1];

        /*System.out.println("Enter the graph matrix");
        for (int sourceVertex = 0; sourceVertex <= numberOfNodes; sourceVertex++)
        {
            for (int destinationVertex = 0; destinationVertex <= numberOfNodes; destinationVertex++)
            {
                graph[sourceVertex][destinationVertex] = scanner.nextInt();
            }
        }

        System.out.println("Enter the source of the graph");
        source= scanner.nextInt();

        System.out.println("Enter the sink of the graph");
        sink = scanner.nextInt();
*/
        /*FordFulkerson fordFulkerson = new FordFulkerson(numberOfNodes);
        long timeStart = System.nanoTime();
        maxFlow = fordFulkerson.fordFulkerson(graph, source, sink);
        long timeEnd = System.nanoTime();
        System.out.println("The Max Flow is " + maxFlow);
        System.out.println("Verlaufszeit der Schleife: " + (timeEnd - timeStart) + " Nanosekunden.");
        */


        // Usage example
        // Driver program to test above functions
        // Let us create a graph shown in the above example


        /*int graph2[][] =new int[][]{ //test 1 wenig
                {0, 16, 13, 0, 0, 0}, //0
                {0, 0, 0, 12, 0, 0}, //1
                {0, 4, 0, 0, 14, 0},  //2
                {0, 0, 9, 0, 0, 20},  //3
                {0, 0, 0, 7, 0, 4},   //4
                {0, 0, 0, 0, 0, 0}    //5


        };*/

       /* int graph2[][] =new int[][] { //test 1 viel
                {0, 16, 13, 5, 5, 0}, //0
                {0, 0, 0, 12, 5, 0}, //1
                {0, 4, 0, 0, 14, 0},  //2
                {0, 0, 9, 0, 0, 20},  //3
                {0, 0, 0, 7, 0, 4},   //4
                {0, 0, 0, 0, 0, 0}    //5
};*/

        /*int graph2[][] =new int[][] { //zweiter test wenig
                {0, 38, 1, 0, 0, 0, 2 ,0}, //0
                {0, 0, 8, 10, 13, 0, 0 ,0}, //1
                {0, 0, 0, 26, 0, 0, 0 ,0}, //2
                {0, 0, 0, 0, 20, 8, 24, 1}, //3
                {0, 0, 2, 0, 0, 1, 0 ,7}, //4
                {0, 0, 0, 0, 0, 0, 0 ,7}, //5
                {0, 0, 0, 0, 0, 0, 0 ,27}, //6
                {0, 0, 0, 0, 0, 0, 0 ,0}, //7
        };*/

        /*int graph2[][] =new int[][] { //zweiter test viel
                {0, 38, 1, 0, 5, 0, 2 ,0}, //0
                {0, 0, 8, 10, 13, 5, 0 ,0}, //1
                {0, 0, 0, 26, 0, 5, 0 ,0}, //2
                {0, 0, 0, 0, 20, 8, 24, 1}, //3
                {0, 0, 2, 0, 0, 1, 0 ,7}, //4
                {0, 0, 0, 0, 0, 0, 0 ,7}, //5
                {0, 0, 5, 0, 0, 0, 0 ,27}, //6
                {0, 0, 0, 0, 0, 0, 0 ,0}, //7
        };*/
/*
        int graph2[][] =new int[][]{ //dritter test wenig
                {0, 38, 1, 0, 0, 0, 20, 0, 0, 0, 0}, //0
                {0, 0, 8, 10, 13, 0, 0, 0, 0, 0, 0}, //1
                {0, 0, 0, 26, 0, 0, 0, 0, 0, 0, 0}, //2
                {0, 0, 0, 0, 20, 8, 24, 0, 0, 0, 1}, //3
                {0, 0, 2, 0, 0, 1, 0, 0, 0, 0, 7}, //4
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7}, //5
                {0, 0, 0, 0, 0, 0, 0, 19, 0, 0, 27}, //6
                {0, 0, 0, 0, 0, 0, 0, 0, 11, 4, 0}, //7
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 12, 0}, //8
                {0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 12}, //9
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0} //10
        };*/

        int graph2[][] =new int[][]{ //dritter test mit viel
                {0, 38, 1, 0, 0, 0, 20, 0, 0, 0, 0}, //0
                {0, 0, 8, 10, 13, 0, 0, 0, 0, 0, 0}, //1
                {0, 0, 0, 26, 0, 0, 0, 0, 0, 0, 0}, //2
                {0, 0, 0, 0, 20, 8, 24, 0, 0, 5, 1}, //3
                {0, 0, 2, 0, 0, 1, 0, 0, 0, 0, 7}, //4
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7}, //5
                {0, 0, 2, 0, 0, 0, 0, 19, 0, 2, 27}, //6
                {0, 0, 0, 2, 0, 5, 0, 0, 11, 4, 0}, //7
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 12, 0}, //8
                {0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 12}, //9
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0} //10
        };

        //EdmondsKarp m = new EdmondsKarp(6); //erster test
        //EdmondsKarp m = new EdmondsKarp(8); //zweiter test
        EdmondsKarp m = new EdmondsKarp(11); //dritter test

        long tmp =0;
        try {
            fw.write("Edmonds Karp" + "," + "Dinic \n");//appends the string to the file
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
        int faktor =1000000; //zum versuch 10000000
        for(int j= 0 ;j<100; j++) {
            long TimeK =0;
            long TimeD =0;
            for (int i = 0; i < faktor; i++) {
                timeStart = System.nanoTime();
                //maxFlowK = m.fordFulkerson(graph2, 0, 5); //erster test
                //maxFlowK = m.fordFulkerson(graph2, 0, 7); //zweiter test
                maxFlowK = m.fordFulkerson(graph2, 0, 10); //dritter test
                timeEnd = System.nanoTime();
                TimeK = TimeK + (timeEnd - timeStart);

            }

            for (int i = 0; i < faktor; i++) {
                Dinics d = new Dinics();
                timeStart = System.nanoTime();
                maxFlowD = d.Maxflow();
                timeEnd = System.nanoTime();
                TimeD = TimeD + (timeEnd - timeStart);

            }
            try {
                fw.write(TimeK/faktor + "," + TimeD/faktor+"\n");//appends the string to the file

            } catch (IOException ioe2) {
                System.err.println("IOException: " + ioe2.getMessage());
            }
            System.out.println("Durchlauf :" + j + " Max Flow Karp: " + maxFlowK + " Max Flow Dinic: "+ maxFlowD);
        }
        fw.close();
        //scanner.close();
    }
}

