import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu2{


	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int num;
		
		int vert = 5;
		int arest = 5;
		
		
		/*Scanner in = new Scanner(new FileReader("dados.txt"));
		while (in.hasNextLine()) {
		    Scanner scanner = null;
			String line = scanner.nextLine();
		    System.out.println(line);
		}
		*/
		
		Grafo g = new Grafo (vert, arest); 
		
		Matriz m = new Matriz(vert);

	    m.addEdge(0, 1);    
	    m.addEdge(0, 4);
	    m.addEdge(1, 4);
	    m.addEdge(4, 3);
	    m.addEdge(4, 2);

		//--------------------------------
	    
	    Lista l = new Lista (vert);
	    int V=6;
	    ArrayList<ArrayList<Integer>> am = new ArrayList<ArrayList<Integer>>(V);

	    for (int i = 0; i < V; i++)
	      am.add(new ArrayList<Integer>());

	    // Add edges
	    addEdge(am, 1, 2);
	    addEdge(am, 1, 5);
	    addEdge(am, 2, 5);
	    addEdge(am, 5, 3);
	    addEdge(am, 5, 4);
	    
	    //---------------------------------
	    
		
		System.out.println("Entre com um número para escolher um estilo de Grafo: \n1 - MATRIZ DE ADJACENCIA \n2 - LISTA DE ADJACENCIA");
		num = entrada.nextInt();
		
		switch (num)
		{
			case 1:
				System.out.println(m.toString());
				break;
				
			case 2:
				l.printLista(am);
				break;
			
			default :
				System.out.println("Número inválido");	
		}
		
		System.out.printf("\nO número de Vértices é: "+ g.getVert());
		System.out.println();
		System.out.printf("\nO número de Arestas é: "+ g.getAresta());
		System.out.println();		
		System.out.printf(g.toString());
		
		
		
	}

	
	
	



static void addEdge(ArrayList<ArrayList<Integer>> am, int s, int d) {
    am.get(s).add(d);
    am.get(d).add(s);
  }}