package Futbol;

import java.util.Comparator;
import Futbol.Futbolista;

public class ComparaEdad implements Comparator{
    @Override
    public int compare(Object ob1, Object ob2){
        Futbolista temp1 = (Futbolista) ob1;
        Futbolista temp2 = (Futbolista) ob2;
        return temp1.getEdad()-temp2.getEdad(); 
    }
}
