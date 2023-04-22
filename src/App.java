

import java.util.Arrays;

import Futbol.ComparaEdad;
import Futbol.ComparaNombres;
import Futbol.Futbolista;
import Futbol.OrdenarEdadNombre;

public class App {
    public static void titulo(String texto) {
        int longitud = (78-texto.length())/2;
        String cadena = "*".repeat(longitud);
        System.out.println("\n"+ cadena + " "+ texto + " "+ cadena);
    }
    public static void imprimeArray(Futbolista [] t) {
        for (int i=0; i<t.length; i++) {
            System.out.println(t[i]);
        }
    }

    public static void pruebaFutbolistas(){
        Futbolista test1 = new Futbolista("Ricardo", "García Pérez", "12345678F", 23, 12);
        Futbolista test2 = new Futbolista("Pedro", "García Pérez", "02345678F", 24, 15);
        Futbolista test3 = new Futbolista("Luis", "Zabad Mira", "00345678F", 16, 15);
        Futbolista test4 = new Futbolista("Paco", "Garcia Sanchez", "30545978M", 24, 12);
        Futbolista test5 = new Futbolista("Pablo", "Garcia Aguado", "60375698G", 16, 13);
        Futbolista [] t = new Futbolista [] {
            test1, test2, test3, test4, test5
        };
        titulo("Orden de introducción");
        imprimeArray(t);
        titulo("Orden por DNI:");
        Arrays.sort(t);
        imprimeArray(t);
        titulo("Orden por Apellidos y Nombre");
        Arrays.sort(t, new ComparaNombres());
        imprimeArray(t);
        titulo("Orden por Edad");
        Arrays.sort(t, new ComparaEdad());
        imprimeArray(t);
        titulo("Orden por Edad y Nombre:");
        Arrays.sort(t, new OrdenarEdadNombre());
        imprimeArray(t);

    }
    public static void main(String[] args){
        pruebaFutbolistas();
    }
}
