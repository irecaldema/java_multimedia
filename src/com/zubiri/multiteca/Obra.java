package com.zubiri.multiteca;

public /*abstract*/ class Obra {
	
	private String titulo;
	private Artista autor;
	private int añoEdicion;
	
	public Obra() {
		
	}
	
	public Obra(String titulo, Artista autor, int añoEdicion) {
	
		this.titulo = titulo;
		this.autor = autor;
		this.añoEdicion= añoEdicion;
	}
	
	public Obra (String linedObra, String separador) {
		
		
		String[] separados = linedObra.split(separador);
		if (separados[0].equalignorecase("libro")){
			Artista autor new Artista(separados[2],";")
			Libro libro = new Libro(separados[1],separados[2],separados[3],separados[4],separados[5]);
			Multiteca.addObra(libro);
		}else if(separados[0].equalignorecase("disco")){
			Artista autor new Artista(separados[2],";")
			Disco disco = new Disco(separados[1],separados[2],separados[3],separados[4],separados[5]);
			Multiteca.addObra(disco);
		}else if(separados[0].equalignorecase("pelicula")){
			Artista autor new Artista(separados[2],";")
			Disco disco = new Disco(separados[1],separados[2],separados[3],separados[4],separados[5]);
			Multiteca.addObra(disco);
		}
	}
	
	public Artista getAutor() {
		
		return autor;
	}

	public void setAutor(Artista autor) {
		
		this.autor = autor;
	}

	public int getAñoEdicion() {
		
		return añoEdicion;
	}

	public void setAñoEdicion(int añoEdicion) {
		
		this.añoEdicion = añoEdicion;
	}

	public String getTitulo() {
		
		return titulo;
	}
	
	public String formattedObra() {
		
		String formattedObra="";
		return formattedObra;
	}
}