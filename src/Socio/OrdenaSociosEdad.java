package Socio;

import java.util.Comparator;
import Socio.Socio;

public class OrdenaSociosEdad implements Comparator{
    @Override
    public int compare(Object ob1, Object ob2){
        Socio temp1 = (Socio) ob1;
        Socio temp2 = (Socio) ob2;
        if (temp1.getEdad() == temp2.getEdad()){
            return (int) (temp1.getNumeroSocio()-temp2.getNumeroSocio());
        }
        return temp1.getEdad()-temp2.getEdad();
    }
}
