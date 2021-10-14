package com.mycompany.proyectoprolo;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

//Libreria de errores.
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class opt_2 {
private static final String p[] = {"V", "V", "F", "F"};
private static final String q[] = {"V", "F", "V", "F"};

private static final String r[] = {"V", "F", "V", "V"};//(p->q)
private static final String s[] = {"V", "F", "F", "F"};//[(p->q)^p]
private static final String t[] = {"V", "V", "V", "V"};//[(p->q)^p]->q

public void Comparar()throws IOException{
     InputStreamReader in = new InputStreamReader(System.in);
     BufferedReader br = new BufferedReader(in);
     
     List<String> lista1 = new LinkedList<String>();
     List<String> lista2 = new LinkedList<String>();
     List<String> lista3 = new LinkedList<String>();
     List<String> lista4 = new LinkedList<String>();
     List<String> lista5 = new LinkedList<String>();
     
        for (String valor : p) {
            lista1.add(valor);
        }
        for (String valor : q) {
            lista2.add(valor);
        }
        for (String valor : r) {
            lista3.add(valor);
        }
        for (String valor : s) {
            lista4.add(valor);
        }
        for (String valor : t) {
            lista5.add(valor);
        }
        imprimirLista(lista1);
        imprimirLista(lista2);
        imprimirLista(lista3);
        imprimirLista(lista4);
        imprimirLista(lista5);
        
        System.out.print("");
   
    }

    public void imprimirLista(List<String> lista) {
        System.out.println("\n[(p->q)^p]->q: ");  
        for (String valor : lista) {
            System.out.printf("%S ", valor);
        }
        System.out.println();
    }

   
    }
    


 
  
          

   
         


 




