package com.zubiri.multiteca;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.FileNotFoundException;

public final class Main {

	public static void main(String[] args) {
	
		int seleccion=0;
		int error=0;
		Scanner sc = new Scanner(System.in);

    	//Leemos la lista de distribuidores del fichero.
    	do{
	    	try {
	    		if (error==0){
	    			System.out.println("Escriba el nombre del fichero de la multiteca:");
					Multiteca.leerObras(sc.next());
	    		}	
				else{	
					Multiteca.leerObras(sc.next());
	    		}
	    	} catch (FileNotFoundException errorifico) {
	    		System.out.println("El archivo de distribuidores no es el correcto");
	    		error=1;
	    	} catch (IOException e){
	    	}	
		}while(Multiteca.getMultiteca().size()==0);	

		do {
			try{
				//Visualiza por terminal (stdout) las opciones del menú
				System.out.println("Mostrar multiteca--------------------------------1");
				System.out.println("Introducir obras---------------------------------2");
				System.out.println("SALIR DEL PROGRAMA-------------------------------3");
				   
				seleccion = sc.nextInt();
				switch (seleccion) {
					
					case 1: //Mostrar distribuidores
						Multiteca.mostrarMultiteca();
						break;
						
					case 2: //Solicitar productos
						Multiteca.introducir(sc);
						break;
						
					case 3: //Salimos
						break;
					default:
						System.out.println("No ha insertado la opción correcta");
				}
			}catch(InputMismatchException e){
				System.out.println("No ha insertado la opción correcta");
				sc.nextLine();
			}
		} while (seleccion != 4);
		System.out.println("Gracias por usar nuestro programa. Que tenga un buen día!");
		sc.close();
	}
}