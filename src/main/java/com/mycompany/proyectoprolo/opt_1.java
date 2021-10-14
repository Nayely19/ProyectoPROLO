package com.mycompany.proyectoprolo;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

//Libreria de errores.
import java.io.IOException;
public class opt_1 {
    // (6+2)*3/2^2-4
    String[] operadores = {"+","-","*","/","^"};
    public boolean existe(String operador){
        for(String elemento: operadores){
            if(elemento.equals(operador)){
               // System.out.println("VERDADERO");
                return true;
            }
        }
        return false;
    }
    public int precedenciaValores(String operador){
        if(operador.equals("(") || operador.equals(")")){
            return 5;
        }else if(operador.equals("^")){
            return 4;
        }else if(operador.equals("*") || operador.equals("/")){
            return 3;
        }else if(operador.equals("+") || operador.equals("-")){
            return 2;
        }
        return 0;
    }
    public float resultados(float valor_a, float valor_b, String operador){
        if(operador.equals("+")){
            return valor_a+valor_b;
        }else if(operador.equals("-")){
            return valor_a-valor_b;
        }else if(operador.equals("*")){
            return valor_a*valor_b;
        }else if(operador.equals("/")){
            return valor_a/valor_b;
        }else if(operador.equals("^")){
            return (float) Math.pow((int)valor_a,(int)valor_b);
        }
        return 0;
    }
    public void separadorEntrada() throws IOException{
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        String entrada = br.readLine();
        ArrayList<String> salida = new ArrayList<String>();
        String numeros = "";
        for (int i = 0; i < entrada.length(); i++) {
            if( Character.isDigit( entrada.charAt(i) ) ){
                numeros += entrada.charAt(i);
            } else {
                if(!numeros.equals(""))
                    salida.add(numeros);
                salida.add( String.valueOf(entrada.charAt(i)) );
                numeros = "";
            }
        }
        if(!numeros.equals("")){
            salida.add(numeros);
        }
        transformar(salida);
    }
    public void transformar(ArrayList<String> operacion){
        ArrayList<String> salida = new ArrayList<String>();
        ArrayList<String> pila = new ArrayList<String>();
        while(operacion.size() > 0){
            String elemento = operacion.remove(0);
            System.out.println("ELEMENTO: "+elemento);
            if(Character.isDigit(elemento.charAt(0)) ){
                salida.add(elemento);
            }else if(elemento.equals("(")){
                pila.add(elemento);
            }else if( elemento.equals(")") ){
                while(pila.size() > 0 && !pila.get(pila.size()-1).equals("(")){
                    salida.add(pila.remove(pila.size()-1));
                }
                if(pila.size() > 0)
                    if(pila.get(pila.size()-1).equals("("))
                        pila.remove(pila.size()-1);
            }else if(existe(elemento)){
                while(pila.size() > 0 && ((precedenciaValores(pila.get(pila.size()-1)) >= precedenciaValores(elemento) ) && !pila.get(pila.size()-1).equals("(")) ){
                    System.out.println("ULTIMO PILA: "+precedenciaValores(pila.get(pila.size()-1)));
                    System.out.println("ELEMENTO: "+precedenciaValores(elemento));
                    salida.add(pila.remove(pila.size()-1));
                }
                pila.add(elemento);
            }
        }
        while(pila.size() > 0){
            salida.add(pila.remove(pila.size()-1));
        }
        resolver(salida);
    }
    public void resolver(ArrayList<String> operacion){
        ArrayList<String> pila = new ArrayList<String>();
        for(String valor: operacion){
            if(Character.isDigit(valor.charAt(0))){
                pila.add(valor);
            }else{
                String valor_b = pila.remove(pila.size()-1);
                String valor_a = pila.remove(pila.size()-1);
                String resultado = String.valueOf( resultados(Float.parseFloat(valor_a), Float.parseFloat(valor_b), valor) );
                pila.add(resultado);
            }
        }
        System.out.println("EL RESULTADO ES: "+pila.get(0));
    }
   
}