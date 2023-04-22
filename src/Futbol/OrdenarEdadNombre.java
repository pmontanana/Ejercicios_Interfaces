package Futbol;

import java.util.Comparator;

public class OrdenarEdadNombre implements Comparator{
    @Override
    public int compare(Object ob1, Object ob2){
        Futbolista temp1 = (Futbolista) ob1;
        Futbolista temp2 = (Futbolista) ob2;
        if (temp1.getEdad() == temp2.getEdad()) {
            return temp1.getNombre().compareTo(temp2.getNombre());
        }
        return temp1.getEdad()-temp2.getEdad();
    }
}
