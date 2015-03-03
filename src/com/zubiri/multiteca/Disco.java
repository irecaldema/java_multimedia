package com.zubiri.multiteca;

import java.util.Scanner;

public class Disco extends Obra{
	
	private String discografica;
	private int nCanciones;
	
	public Disco(String titulo, Artista autor, int añoEdicion, String discografica, int nCanciones) {
		
		super(titulo,autor,añoEdicion);
		setdiscografica(discografica);
		setnCanciones(nCanciones);
	}
	
	public Disco (Scanner sc){
		
	}
	
	public String getdiscografica() {
		
		return discografica;
	}
	
	public void setdiscografica(String discografica) {
		
		this.discografica = discografica;
	}
	
	public int getnCanciones() {
		
		return nCanciones;
	}
	
	public void setnCanciones(int nCanciones) {
		
		this.nCanciones = nCanciones;
	}
	
	public String formattedObra() {
		
		String formattedObra=super.formattedObra()+"";
		return formattedObra;	
	}
}
