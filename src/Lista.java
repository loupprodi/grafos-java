// Adjascency List representation in Java

import java.util.*;

class Lista {
	
	private int V;

	public Lista(int V)
	{
		this.V = V;
	}

  // Add edge
  static void addEdge(ArrayList<ArrayList<Integer>> am, int s, int d) {
    am.get(s).add(d);
    am.get(d).add(s);
  }


  // Print the graph
  static void printLista(ArrayList<ArrayList<Integer>> am) {
    for (int i = 0; i < am.size(); i++) {
      System.out.println("\nVertex " + i + ":");
      for (int j = 0; j < am.get(i).size(); j++) {
        System.out.print(" -> " + am.get(i).get(j));
      }
      System.out.println();
    }
  }
}