import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

import javax.swing.InputMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Equipo 11
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Creación de alumnos");
        // Alumno arreglo [] = new Alumno [10];
        LinkedList<Alumno> alumnos = new LinkedList<>();
        Alumno Andres = new Alumno("Andrés Eduardo", "Caamaño", "López", 123432456, 23, 9.4f);
        Alumno Luis = new Alumno("Luis David", "Esponda", "Cervantes", 421332321, 21, 8.7f);
        Alumno Kris = new Alumno("Kris", "Escamilla", "Suárez", 323650606, 19, 9.4f);
        Alumno Miguel = new Alumno("Miguel", "Domínguez", "Fernández", 123432456, 23, 9.9f);
        Alumno Antonio = new Alumno("Antonio", "Juárez", "Ortiz", 323823825, 18, 8.7f);
        Alumno Enrique = new Alumno("Enrique", "Escamilla", "Suárez", 323515773, 19, 8.4f);
        Alumno Andrea = new Alumno("Andrea", "Ortega", "Lara", 323148237, 20, 5.4f);
        Alumno Lucero = new Alumno("Lucero", "Contreras", "Luna", 323237812, 22, 9.7f);
        Alumno Jose = new Alumno("Jose", "Hernández", "Ramos", 323637661, 21, 9.0f);
        Alumno Arantza = new Alumno("Arantza", "Castro", "Velázquez", 323216871, 18, 7.2f);
        alumnos.add(Andres);
        alumnos.add(Luis);
        alumnos.add(Kris);
        alumnos.add(Miguel);
        alumnos.add(Antonio);
        alumnos.add(Enrique);
        alumnos.add(Andrea);
        alumnos.add(Lucero);
        alumnos.add(Jose);
        alumnos.add(Arantza);
        // arreglo.add(Andres);
        // System.out.println(alumnos);
        System.out.println("Exportar a .csv");
        try {
            FileWriter fw = new FileWriter("listaalumnos.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            try (PrintWriter salida = new PrintWriter(bw)) {
                salida.println(alumnos);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Leer del .csv");

        System.out.println("FileReader===================================");
        try {
            FileReader fr = new FileReader("listaalumnos.csv");// apunta al archivo
            BufferedReader bn = new BufferedReader(fr); //
            System.out.println("El texto del archivo es: ");
            String linea = bn.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = bn.readLine();
            }
            System.out.println("StringTokenizer========================================");
            StringTokenizer tokenizer = new StringTokenizer(linea, ",");
            while (tokenizer.hasMoreTokens()) {
                System.out.println(tokenizer.nextToken()); // impresion de elementos del csv por item
            }
            bn.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        }
        // lo que hice es agregar los cosos a una lista ligada, para subirlos izi
        // el pedo es regresarlos
        // entonces no se, el string tokenizer vale pija, por lo de los [], asi que ni
        // los puede separar

        // No e
        // e
    }

}
