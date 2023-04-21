

import java.util.Arrays;

import Futbol.ComparaEdad;
import Futbol.ComparaNombres;
import Futbol.Futbolista;

public class App {

    public static void pruebaFutbolistas(){
        Futbolista test1 = new Futbolista("Ricardo", "García Pérez", "12345678F", 23, 12);
        Futbolista test2 = new Futbolista("Pedro", "García Pérez", "02345678F", 24, 15);
        Futbolista [] t = new Futbolista [] {
            test1, test2, new Futbolista("Luis", "Zabad Mira", "00345678F", 16, 15)
        };
        System.out.println(test1);
        System.out.println(Arrays.deepToString(t));
        Arrays.sort(t);
        System.out.println("Orden por DNI:");
        System.out.println(Arrays.deepToString(t));
        System.out.println("Orden por Apellidos y nombre:");
        Arrays.sort(t, new ComparaNombres());
        System.out.println(Arrays.deepToString(t));
        System.out.println("Orden por Edad:");
        Arrays.sort(t, new ComparaEdad());
        System.out.println(Arrays.deepToString(t));
    }
    public static void main(String[] args){
        pruebaFutbolistas();
    }
}
