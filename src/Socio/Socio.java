package Socio;

public class Socio implements Comparable{
    String nombre;
    int edad;
    long numeroSocio;

    public Socio(String nombre, int edad, long numeroSocio){
        this.nombre = nombre;
        this.edad = edad;
        this.numeroSocio = numeroSocio;
    }

    public int getEdad() {
        return edad;
    }

    public long getNumeroSocio() {
        return numeroSocio;
    }

    public boolean equals(Socio temp){
        return edad == temp.edad;
    }
    public String toString() {
        return String.format("%s %d %s", nombre, edad, numeroSocio);
    }

    @Override
    public int compareTo(Object ob){
        Socio temp = (Socio) ob;
        return edad-temp.getEdad();        
        
    }
}
