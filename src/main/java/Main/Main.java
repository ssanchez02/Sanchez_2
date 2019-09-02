/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *  Lectura y escritura de texto plano: Se le entregará un archivo de texto plano con dos párrafos en inglés,
 * sin caracteres extraños. Deberá crear los métodos para leer completo el archivo y añadir nueva línea al final del archivo. 
 */
package Main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Sebastián Sanchez
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(leerArchivo("texto.txt"));
        System.out.println(agregarTexto("textoPrueba.txt"));
    }

    public static String leerArchivo(String ruta) {
        
        String texto = "";
        try {
        BufferedReader bf= new BufferedReader(new FileReader(ruta));
        String temp="";
        String bfRead;
        while((bfRead=bf.readLine())!=null){
            temp=temp+bfRead;
        }
        texto=temp;
        }catch (IOException e) {
            System.err.println("El Archivo no pudo ser leido");
        }
        return texto;
    }

    public static String agregarTexto(String ruta) {
        try {
            FileWriter archivo = new FileWriter(ruta, true);
            PrintWriter texto = new PrintWriter(archivo);
            texto.print("The first man who stepped on the moon.");
            texto.close();
        } catch (IOException e) {
            System.out.println("Error al agregar el texto");

        }

        return leerArchivo(ruta);
    }
    
}
