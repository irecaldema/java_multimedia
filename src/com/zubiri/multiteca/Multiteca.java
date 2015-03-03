package com.zubiri.multiteca;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.InputMismatchException;

public final class Multiteca {
	
	private static ArrayList<Obra> multiteca = new ArrayList<Obra>();
	private static int numObras = 0;

	public Multiteca() {
		
	}

	public Multiteca(ArrayList<Obra> obras) {
		
		setMultiteca(obras);
	}
	
	public void setMultiteca(ArrayList<Obra> obras) {
		
		multiteca=obras;
	}
	
	public static ArrayList<Obra> getMultiteca() {
		
		return multiteca;
	}
	
	public static void addObra(Obra obra) {
		
		multiteca.add(obra);
		numObras++;
	}
	
	public Obra obtainObra(int index) {
		
		return multiteca.get(index);
	}
	
	public static int counter() {
		
		return numObras;
	}
	
	public String formattedMultiteca() {
		
		String formattedMultiteca="";
		return formattedMultiteca;
	}
	
	public static void leerObras(String fichero) throws IOException {
			String linea;
			FileInputStream f;
		    InputStreamReader fr;
		    BufferedReader br;
		    
		    f = new FileInputStream(fichero);
	    	fr = new InputStreamReader(f, "UTF8");
	    	br = new BufferedReader(fr);
	    	linea = br.readLine();
			
			if (linea == null) {
				System.out.println("No existen obras en el fichero");
			}
			
			while ((linea != null) && (linea.compareTo("") != 0)) {
				Obra obra = new Obra(linea,",");
				addObra(obra);
				linea = br.readLine();
			}
			br.close();
	 }
	 
	public static void mostrarMultiteca() {
		
		if (multiteca.size() == 0) {
			System.out.println("No se han cargado las obras");
		}
		for (int i = 0; i<multiteca.size(); i++) {
			System.out.println(multiteca.get(i).formattedObra());
		}
	}
	
	public static void introducir(Scanner sc) {
		
		int seleccion=0;
		do{
			try{
				System.out.println("¿Cuantas obras quieres insertar? ");
				seleccion = sc.nextInt();
			}catch(InputMismatchException e){
				System.out.println("No ha insertado la opción correcta");
				sc.nextLine();
			}
		}while(seleccion>0);
		
		for (int i = 0; i < seleccion; i++) {
			try{
				System.out.println("¿Qué obra quieres insertar?");
				System.out.println("Disco:--------1");
				System.out.println("Pelicula:----------2");
				System.out.println("Libro:--------3");
			    
				switch(sc.nextInt()) {
					case 1:
						Disco disco = new Disco(sc);
						multiteca.add(disco);
						break;
					case 2:
						Pelicula pelicula = new Pelicula(sc);
						multiteca.add(pelicula);
						break;
					case 3:
						Libro libro = new Libro(sc);
						multiteca.add(libro);
						break;
					default:
						System.out.println("No ha insertado la opción correcta.");
						break;
				}
			}catch(InputMismatchException e){
				System.out.println("No ha insertado la opción correcta");
				sc.nextLine();
			}
		}
	}
	
}
