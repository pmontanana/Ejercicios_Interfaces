package Futbol;

import java.util.Comparator;
import Futbol.Futbolista;

public class ComparaNombres implements Comparator{
    @Override
    public int compare(Object ob1, Object ob2){
        Futbolista temp1 = (Futbolista) ob1;
        Futbolista temp2 = (Futbolista) ob2;
        if (temp1.getApellidos() == temp2.getApellidos()) {
            return temp1.getNombre().compareTo(temp2.getNombre());
        }
        return temp1.getApellidos().compareTo(temp2.getApellidos());
    }
}
