package com.zubiri.multiteca;

public abstract class Obra {
	
	private String titulo;
	private Artista autor;
	private int añoEdicion;
	
	public Obra() {
		
	}
	
	public Obra(String titulo, Artista autor, int añoEdicion) {
	
		this.titulo = titulo;
		this.autor = autor;
		this.añoEdicion = añoEdicion;
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
		
	}
}