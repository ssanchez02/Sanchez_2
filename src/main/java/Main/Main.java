/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

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

    }

    public static String leerArchivo(String ruta) {
        Path archivo = Paths.get(ruta);
        String texto = "";
        try {
            texto = new String(Files.readAllBytes(archivo));
        } catch (IOException e) {
            System.out.println("El Archivo no pudo ser leido");
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
