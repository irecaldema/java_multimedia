package com.zubiri.multiteca;

import java.util.Scanner;

public class Disco extends Obra{
	
	private String discografica;
	private int nCanciones;
	
	public Disco(String titulo, Artista autor, int añoEdicion, String discografica, int nCanciones) {
		
		super(titulo,autor,añoEdicion);
		setDiscografica(discografica);
		setnCanciones(nCanciones);
		Multiteca.addObra(this);
	}
	
	public Disco (Scanner sc){
		super();
		System.out.println("Discografica: ");
		setDiscografica(sc.next());
		System.out.println("Número de canciones: ");
		setnCanciones(sc.nextInt());
		Multiteca.addObra(this);
	}
	
	public String getdiscografica() {
		
		return discografica;
	}
	
	public void setDiscografica(String discografica) {
		
		this.discografica = discografica;
	}
	
	public int getnCanciones() {
		
		return nCanciones;
	}
	
	public void setnCanciones(int nCanciones) {
		
		this.nCanciones = nCanciones;
	}
	
	@Override public String formattedObra() {
		
		String formattedObra=
			super.formattedObra()+
			"\nDiscografica: "+this.discografica+
			"\nNumero de canciones: "+this.nCanciones;
		return formattedObra;	
	}
}
