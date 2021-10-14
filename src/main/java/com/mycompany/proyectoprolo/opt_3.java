package com.mycompany.proyectoprolo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class opt_3 {
    public void separadorEntrada() throws IOException{
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        String lineaEntrada = br.readLine();

        String[] lineaSeparada = lineaEntrada.split(" ");
        clasificador(lineaSeparada);
    }
    public void clasificador(String[] elementos){
        //For each usa los tipos de datos base de los arreglos.
        ArrayList<String> cadenas = new ArrayList<String>();
        ArrayList<String> enteros = new ArrayList<String>();
        ArrayList<String> caracteres = new ArrayList<String>();
        for(String elemento: elementos){
            if( Character.isDigit( elemento.charAt(0) )){
                enteros.add(elemento);
            }else{
                if(elemento.length() == 1){
                    caracteres.add(elemento);
                }else{
                    cadenas.add(elemento);
                }
            }
        }
        System.out.println("ENTEROS");
        for(String entero: enteros){
            System.out.print(entero+" ");
        }
        System.out.println("\nCARACTERES");
        for(String caracter: caracteres){
            System.out.print(caracter+" ");
        }
        System.out.println("\nCADENAS");
        for(String cadena: cadenas){
            System.out.print(cadena+" ");
        }
        System.out.println();
    } 
}
