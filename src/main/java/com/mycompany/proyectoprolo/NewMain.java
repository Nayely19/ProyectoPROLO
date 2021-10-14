package com.mycompany.proyectoprolo;
import java.io.BufferedReader;
import java.io.InputStreamReader;

//Libreria de errores.
import java.io.IOException;
public class NewMain {

    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        boolean exit = false;
        while(!exit){
            System.out.println("1) Operacion aritmetica\n2) Operacion logica\n3) Operacion logica v2\n4) Salir");
            String input = br.readLine();
            switch(input){
                case "1":
                    opt_1 opcion1 = new opt_1();
                    opcion1.separadorEntrada();
                    break;
                case "2":
                    opt_2 opcion2 = new opt_2();
                    opcion2.Comparar();
                    break;
                case "3":
                    opt_3 opcion3 = new opt_3();
                    opcion3.separadorEntrada();
                    break;
                case "4":
                    exit = !exit;
                    break;
            }
        }

    }
}
    
    

