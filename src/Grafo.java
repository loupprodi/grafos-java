public class Grafo 
{
	private double vert;
	private double aresta;

	public Grafo (int vert, int aresta)
	{
		setVert(vert);
		setAresta(aresta);
	}
	
	//void para a fun��o dos graus
	
	public void setVert (double vert)
	{
		this.vert = vert;
	}
	public void setAresta(double aresta)
	{
		this.aresta = aresta;
	}
	
	public double getVert()
	{
		return vert;
	}
	public double getAresta()
	{
		return aresta;
	}
	
	public double grauMax()
	{
		return 4;
	}
	
	public double grauMin()
	{
		return 1;
	}
	
	public double grauMed()
	{
		return 5;
	}
	
	public String toString()
	{
		return String.format("\nO valor do Grau M�ximo � %.2f. \nO valor do Grau Minimo possivel � %.2f. \nO valor do Grau M�dio � %.2f", grauMax(), grauMin(), grauMed() );
	}

}
