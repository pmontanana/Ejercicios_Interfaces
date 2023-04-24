import java.util.Comparator;
import Socio.*;

public class OrdenaSociosAlfabetico implements Comparator{
    @Override
    public int compare(Object ob1, Object ob2){
        Socio temp1 = (Socio) ob1;
        Socio temp2 = (Socio) ob2;
        return temp1.getNombre().compareTo(temp2.getNombre());
        
        
    }
}
