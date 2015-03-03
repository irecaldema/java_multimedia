package com.zubiri.multiteca;

import java.util.ArrayList;
import java.util.Scanner;

public /*abstract*/ class Obra {
	
	private String titulo;
	private Artista autor;
	private int añoEdicion;
	
	public Obra() {
		
	}
	public Obra(Scanner sc) {
		System.out.println("Introduce los siguientes datos por teclado: ");
		System.out.println("Titulo: ");		
		setTitulo(sc.next());
		System.out.println("Autor: ");
		Artista autor = new Artista(sc);
		setAutor(autor);
		System.out.println("Año de edición: ");			
		setAñoEdicion(sc.nextInt());
	}	
	
	public Obra(String titulo, Artista autor, int añoEdicion) {
	
		setTitulo(titulo);
		setAutor(autor);
		setAñoEdicion(añoEdicion);
	}
	
	public Obra (String linedObra, String separador) {
		
		String[] separados = linedObra.split(separador);
		if (separados[0].equalsIgnoreCase("libro")) {
			
			Artista autor = new Artista(separados[2],";");
			Libro libro = new Libro(separados[1],autor,Integer.parseInt(separados[3]),separados[4],Integer.parseInt(separados[5]));
			Multiteca.addObra(libro);
			
		}else if(separados[0].equalsIgnoreCase("disco")) {
			
			Artista autor = new Artista(separados[2],";");
			Disco disco = new Disco(separados[1],autor,Integer.parseInt(separados[3]),separados[4],Integer.parseInt(separados[5]));
			Multiteca.addObra(disco);
			
		}else if(separados[0].equalsIgnoreCase("pelicula")) {
			
			Artista autor = new Artista(separados[2],";");
			
			ArrayList<Artista> al_interpretes = new ArrayList<Artista>();
			//Jeremy Irons;1948#Ed Harris;1950#Viggo Mortensen;1958#Renée Zellweger;1969
			String[] interpretes = separados[5].split("#");
			//Jeremy Irons;1948
			for (int i=0;i<interpretes.length;i++){
				
				Artista interprete = new Artista(interpretes[i],";");
				al_interpretes.add(interprete);
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
	
	public void setTitulo(String titulo) {
		
		this.titulo = titulo;
	}
	
	public String formattedObra() {
		
		String formattedObra=
			"\nObra: "+this.titulo+
			this.autor.formattedArtista()+
			"\nAño de edicion: "+this.añoEdicion;
		return formattedObra;
	}
}