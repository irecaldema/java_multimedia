package com.zubiri.multiteca;

public class Libro extends Obra{
	
	private String editorial;
	private int numPaginas;
	
	public Libro(String titulo, Artista autor, int añoEdicion, String editorial, int numPaginas) {
		super(titulo,autor,añoEdicion);
		setEditorial(editorial);
		setNumPaginas(numPaginas);
	}
	
	public String getEditorial() {
		
		return editorial;
	}
	
	public void setEditorial(String editorial) {
		
		this.editorial = editorial;
	}
	
	public int getNumPaginas() {
		
		return numPaginas;
	}
	
	public void setNumPaginas(int numPaginas) {
		
		this.numPaginas = numPaginas;
	}
	
	public String formattedObra() {
		
	}

}
