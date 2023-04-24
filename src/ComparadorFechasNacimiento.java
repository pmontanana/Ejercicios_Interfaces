import java.util.*;
import Socio.*;

public class ComparadorFechasNacimiento implements Comparator{
    public String convierteFecha(String temp){
        return temp.substring(6) + temp.substring(3, 5) + temp.substring(0, 2);
    }

    @Override
    public int compare(Object ob1, Object ob2){
        Socio temp1 = (Socio) ob1;
        Socio temp2 = (Socio) ob2;
        String fecha1 = convierteFecha(temp1.getFechaNacimiento());
        String fecha2 = convierteFecha(temp2.getFechaNacimiento());
        return fecha1.compareTo(fecha2);
        
        
    }
}
