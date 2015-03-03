package com.zubiri.multiteca;

import java.util.Scanner;

public class Libro extends Obra{
	
	private String editorial;
	private int numPaginas;
	
	public Libro(String titulo, Artista autor, int añoEdicion, String editorial, int numPaginas) {
		
		super(titulo,autor,añoEdicion);
		setEditorial(editorial);
		setNumPaginas(numPaginas);
		Multiteca.addObra(this);
	}
	
	public Libro (Scanner sc){
		super();
		System.out.println("Editorial: ");
		setEditorial(sc.next());
		System.out.println("Número de páginas: ");
		setNumPaginas(sc.nextInt());
		Multiteca.addObra(this);
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
	
	@Override public String formattedObra() {
		
		String formattedObra=
			super.formattedObra()+
			"\nEditorial: "+this.editorial+
			"\nNúmero de páginas: "+this.numPaginas;
		return formattedObra;	
	}

}
