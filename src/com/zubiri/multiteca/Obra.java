package com.zubiri.multiteca;

import java.util.ArrayList;

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
		if (separados[0].equalsIgnoreCase("libro")){
			Artista autor = new Artista(separados[2],";");
			Libro libro = new Libro(separados[1],autor,Integer.parseInt(separados[3]),separados[4],Integer.parseInt(separados[5]));
			Multiteca.addObra(libro);
		}else if(separados[0].equalsIgnoreCase("disco")){
			Artista autor = new Artista(separados[2],";");
			Disco disco = new Disco(separados[1],autor,Integer.parseInt(separados[3]),separados[4],Integer.parseInt(separados[5]));
			Multiteca.addObra(disco);
		}else if(separados[0].equalsIgnoreCase("pelicula")){
			String[] interpretes = separados[5].split("#");
			ArrayList<Artista> al_interpretes = new ArrayList<Artista>();
			for (int i=0;interpretes.length<i;i++){
				Artista autor = new Artista(interpretes[i],";");
				al_interpretes.add(autor);
			}
			Pelicula pelicula = new Pelicula(separados[1],autor,Integer.parseInt(separados[3]),separados[4],al_interpretes);
			Multiteca.addObra(pelicula);
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
		
		String formattedObra=
			"\nObra: "+this.titulo+
			this.autor.formattedArtista()+
			"\nAño de edicion: "+this.añoEdicion;
		return formattedObra;
	}
}